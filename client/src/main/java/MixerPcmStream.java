import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class MixerPcmStream extends PcmStream {

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "Lclient!ll;")
	private final LinkedList subStreams = new LinkedList();

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "Lclient!ll;")
	private final LinkedList listeners = new LinkedList();

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
	private int position = 0;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
	private int remaining = -1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([III)V")
	@Override
	public final synchronized void read(@OriginalArg(0) int[] samples, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		do {
			if (this.remaining < 0) {
				this.readSubStreams(samples, off, len);
				return;
			}
			if (this.position + len < this.remaining) {
				this.position += len;
				this.readSubStreams(samples, off, len);
				return;
			}
			@Pc(33) int n = this.remaining - this.position;
			this.readSubStreams(samples, off, n);
			off += n;
			len -= n;
			this.position += n;
			this.normalise();
			@Pc(60) MixerListener listener = (MixerListener) this.listeners.head();
			synchronized (listener) {
				@Pc(68) int remaining = listener.execute(this);
				if (remaining < 0) {
					listener.remaining = 0;
					this.removeListener(listener);
				} else {
					listener.remaining = remaining;
					this.addListener(listener, listener.next);
				}
			}
		} while (len != 0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!wm;)V")
	private void removeListener(@OriginalArg(0) MixerListener listener) {
		listener.unlink();
		listener.onUnlink();
		@Pc(9) Node node = this.listeners.sentinel.next;
		if (node == this.listeners.sentinel) {
			this.remaining = -1;
		} else {
			this.remaining = ((MixerListener) node).remaining;
		}
	}

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "()V")
	private void normalise() {
		if (this.position <= 0) {
			return;
		}
		for (@Pc(8) MixerListener listener = (MixerListener) this.listeners.head(); listener != null; listener = (MixerListener) this.listeners.next()) {
			listener.remaining -= this.position;
		}
		this.remaining -= this.position;
		this.position = 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!tf;)V")
	public final synchronized void removeSubStream(@OriginalArg(0) PcmStream stream) {
		stream.unlink();
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
	@Override
	public final synchronized void skip(@OriginalArg(0) int len) {
		do {
			if (this.remaining < 0) {
				this.skipSubStreams(len);
				return;
			}
			if (this.position + len < this.remaining) {
				this.position += len;
				this.skipSubStreams(len);
				return;
			}
			@Pc(29) int n = this.remaining - this.position;
			this.skipSubStreams(n);
			len -= n;
			this.position += n;
			this.normalise();
			@Pc(50) MixerListener listener = (MixerListener) this.listeners.head();
			synchronized (listener) {
				@Pc(58) int remaining = listener.execute(this);
				if (remaining < 0) {
					listener.remaining = 0;
					this.removeListener(listener);
				} else {
					listener.remaining = remaining;
					this.addListener(listener, listener.next);
				}
			}
		} while (len != 0);
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
	private void skipSubStreams(@OriginalArg(0) int len) {
		for (@Pc(5) PcmStream stream = (PcmStream) this.subStreams.head(); stream != null; stream = (PcmStream) this.subStreams.next()) {
			stream.skip(len);
		}
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "()Lclient!tf;")
	@Override
	public final PcmStream nextSubStream() {
		return (PcmStream) this.subStreams.next();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ni;Lclient!wm;)V")
	private void addListener(@OriginalArg(1) MixerListener listener, @OriginalArg(0) Node node) {
		while (node != this.listeners.sentinel && ((MixerListener) node).remaining <= listener.remaining) {
			node = node.next;
		}
		LinkedList.insertBefore(listener, node);
		this.remaining = ((MixerListener) this.listeners.sentinel.next).remaining;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "()I")
	@Override
	public final int method3346() {
		return 0;
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "([III)V")
	private void readSubStreams(@OriginalArg(0) int[] samples, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		for (@Pc(5) PcmStream stream = (PcmStream) this.subStreams.head(); stream != null; stream = (PcmStream) this.subStreams.next()) {
			stream.readIfActive(samples, off, len);
		}
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public final PcmStream firstSubStream() {
		return (PcmStream) this.subStreams.head();
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(Lclient!tf;)V")
	public final synchronized void addSubStream(@OriginalArg(0) PcmStream stream) {
		this.subStreams.addHead(stream);
	}
}

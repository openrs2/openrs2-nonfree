import java.awt.Component;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class SignLinkAudioChannel extends AudioChannel {

	@OriginalMember(owner = "client!nm", name = "N", descriptor = "Lsignlink!le;")
	private static AudioSource audioSource;

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
	private final int channel;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lsignlink!pm;I)V")
	public SignLinkAudioChannel(@OriginalArg(0) SignLink signLink, @OriginalArg(1) int channel) {
		audioSource = signLink.getAudioSource();
		this.channel = channel;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	@Override
	public void open(@OriginalArg(0) int bufferCapacity) throws Exception {
		if (bufferCapacity > 32768) {
			throw new IllegalArgumentException();
		}
		audioSource.open(this.channel, bufferCapacity);
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()V")
	@Override
	protected void flush() {
		audioSource.flush(this.channel);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void init(@OriginalArg(0) Component component) throws Exception {
		audioSource.init(component, AudioChannel.stereo, Static7.sampleRate);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()I")
	@Override
	protected int getBufferSize() {
		return audioSource.getBufferSize(this.channel);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()V")
	@Override
	protected void close() {
		audioSource.close(this.channel);
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "()V")
	@Override
	protected void write() {
		audioSource.write(this.channel, this.samples);
	}
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class AudioThread implements Runnable {

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lsignlink!pm;")
	public SignLink signLink;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "[Lclient!tj;")
	public final AudioChannel[] channels = new AudioChannel[2];

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Z")
	public volatile boolean stop = false;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Z")
	public volatile boolean running = false;

	@OriginalMember(owner = "client!im", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		this.running = true;
		try {
			while (!this.stop) {
				for (@Pc(13) int i = 0; i < 2; i++) {
					@Pc(23) AudioChannel channel = this.channels[i];
					if (channel != null) {
						channel.method2998();
					}
				}
				ThreadUtils.sleep(10L);
				GameShell.flush(this.signLink, null);
			}
		} catch (@Pc(48) Exception ex) {
			TracingException.report(ex, null);
		} finally {
			this.running = false;
		}
	}
}

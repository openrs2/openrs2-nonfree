import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class MouseRecorder implements Runnable {

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!jm;")
	public static MouseRecorder instance;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Z")
	public static boolean enabled = false;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Z")
	public boolean running = true;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Ljava/lang/Object;")
	public final Object lock = new Object();

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
	public final int[] x = new int[500];

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
	public final int[] y = new int[500];

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	public int samples = 0;

	@OriginalMember(owner = "client!jm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.running) {
			synchronized (this.lock) {
				if (this.samples < 500) {
					this.x[this.samples] = Mouse.x;
					this.y[this.samples] = Mouse.y;
					this.samples++;
				}
			}
			ThreadUtils.sleep(50L);
		}
	}
}

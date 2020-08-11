import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class91 implements Runnable {

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lsignlink!pm;")
	public SignLink aClass196_2;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "[Lclient!tj;")
	public final Class102[] aClass102Array1 = new Class102[2];

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Z")
	public volatile boolean aBoolean170 = false;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Z")
	public volatile boolean aBoolean171 = false;

	@OriginalMember(owner = "client!im", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		this.aBoolean171 = true;
		try {
			while (!this.aBoolean170) {
				for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
					@Pc(23) Class102 local23 = this.aClass102Array1[local13];
					if (local23 != null) {
						local23.method2998();
					}
				}
				ThreadUtils.sleep(10L);
				GameShell.flush(this.aClass196_2, null);
			}
		} catch (@Pc(48) Exception local48) {
			TracingException.report(local48, null);
		} finally {
			this.aBoolean171 = false;
		}
	}
}

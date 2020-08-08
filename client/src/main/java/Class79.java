import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class79 {

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	public int anInt2191 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!fd;BI)V")
	private void method1743(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2191 = arg0.method4616();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!fd;I)V")
	public final void method1747(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4629();
			if (local5 == 0) {
				return;
			}
			this.method1743(arg0, local5);
		}
	}
}

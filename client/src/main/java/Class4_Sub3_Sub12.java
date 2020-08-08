import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class4_Sub3_Sub12 extends Class4_Sub3 {

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Ljava/lang/String;")
	public String aString153;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
	public int anInt2546;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!fd;I)V")
	public final void method1992(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4629();
			if (local9 == 0) {
				return;
			}
			this.method1999(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)Z")
	public final boolean method1995() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!fd;IZ)V")
	private void method1999(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static29.method3522(arg0.method4637());
		} else if (arg1 == 2) {
			this.anInt2546 = arg0.method4595();
		} else if (arg1 == 5) {
			this.aString153 = arg0.method4593();
		}
	}
}

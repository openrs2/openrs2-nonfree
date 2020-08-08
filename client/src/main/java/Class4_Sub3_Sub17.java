import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class4_Sub3_Sub17 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ro", name = "C", descriptor = "Lclient!ic;")
	private Class84 aClass84_21;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!fd;BI)V")
	private void method3799(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method4629();
		if (this.aClass84_21 == null) {
			@Pc(21) int local21 = Static24.method2595(local12);
			this.aClass84_21 = new Class84(local21);
		}
		for (@Pc(29) int local29 = 0; local29 < local12; local29++) {
			@Pc(41) boolean local41 = arg0.method4629() == 1;
			@Pc(45) int local45 = arg0.method4618();
			@Pc(54) Node local54;
			if (local41) {
				local54 = new Class4_Sub26(arg0.method4593());
			} else {
				local54 = new Class4_Sub32(arg0.method4595());
			}
			this.aClass84_21.method1840(local54, (long) local45);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)I")
	public final int method3800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_21 == null) {
			return arg0;
		} else {
			@Pc(19) Class4_Sub32 local19 = (Class4_Sub32) this.aClass84_21.method1844((long) arg1);
			return local19 == null ? arg0 : local19.anInt5434;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!fd;I)V")
	public final void method3801(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4629();
			if (local9 == 0) {
				return;
			}
			this.method3799(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public final String method3804(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass84_21 == null) {
			return arg0;
		} else {
			@Pc(22) Class4_Sub26 local22 = (Class4_Sub26) this.aClass84_21.method1844((long) arg1);
			return local22 == null ? arg0 : local22.aString278;
		}
	}
}

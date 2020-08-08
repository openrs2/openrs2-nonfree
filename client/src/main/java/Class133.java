import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class133 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public int anInt4111;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	private int anInt4116;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public int anInt4119;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILclient!fd;)V")
	public final void method3398(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method4629();
			if (local5 == 0) {
				return;
			}
			this.method3399(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!fd;II)V")
	private void method3399(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt4116 = arg0.method4616();
		} else if (arg1 == 2) {
			this.anInt4119 = arg0.method4629();
			this.anInt4111 = arg0.method4629();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Lclient!vn;")
	public final Class4_Sub3_Sub14_Sub1 method3401() {
		@Pc(17) Class4_Sub3_Sub14_Sub1 local17 = (Class4_Sub3_Sub14_Sub1) Static6.aClass26_46.method518((long) this.anInt4116);
		if (local17 != null) {
			return local17;
		}
		@Pc(30) Class4_Sub3_Sub14_Sub1 local30 = Static31.method3691(Static3.aClass58_58, this.anInt4116);
		if (local30 != null) {
			Static6.aClass26_46.method510(local30, (long) this.anInt4116);
		}
		return local30;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	private final int anInt209;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "I")
	private final int anInt210;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "I")
	private final int anInt206;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "I")
	private final int anInt205;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(IIIIIII)V")
	public Class11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt209 = arg0;
		this.anInt210 = arg2;
		this.anInt206 = arg1;
		this.anInt205 = arg3;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)V")
	@Override
	public final void method1934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt209 >> 12;
		@Pc(21) int local21 = this.anInt210 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt205 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt206 >> 12;
		Static18.method1745(local21, this.anInt2463, local10, this.anInt2466, this.anInt2461, local35, local28);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
	@Override
	public final void method1935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt209 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt210 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt205 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt206 * arg1 >> 12;
		Static28.method3323(local24, local10, this.anInt2463, local31, local17);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZ)V")
	@Override
	public final void method1938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}

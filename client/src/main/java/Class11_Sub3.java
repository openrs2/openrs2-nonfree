import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
	private final int anInt2060;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
	private final int anInt2066;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
	private final int anInt2059;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	private final int anInt2061;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class11_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2060 = arg2;
		this.anInt2066 = arg3;
		this.anInt2059 = arg0;
		this.anInt2061 = arg1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)V")
	@Override
	public final void method1934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt2059 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2061 >> 12;
		@Pc(24) int local24 = this.anInt2060 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt2066 * arg1 >> 12;
		Static36.method4566(local6, this.anInt2466, this.anInt2463, this.anInt2461, local31, local24, local17);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZ)V")
	@Override
	public final void method1938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2059 >> 12;
		@Pc(17) int local17 = this.anInt2060 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt2061 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt2066 >> 12;
		Static32.method3997(local10, this.anInt2466, local24, this.anInt2461, local31, local17);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
	@Override
	public final void method1935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2059 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2060 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt2061 >> 12;
		@Pc(37) int local37 = this.anInt2066 * arg1 >> 12;
		Static29.method3429(local10, local37, local17, local30, this.anInt2463);
	}
}

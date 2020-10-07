import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!in", name = "w", descriptor = "I")
	private final int anInt2476;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	private final int anInt2472;

	@OriginalMember(owner = "client!in", name = "v", descriptor = "I")
	private final int anInt2475;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "I")
	private final int anInt2468;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "I")
	private final int anInt2473;

	@OriginalMember(owner = "client!in", name = "n", descriptor = "I")
	private final int anInt2470;

	@OriginalMember(owner = "client!in", name = "t", descriptor = "I")
	private final int anInt2474;

	@OriginalMember(owner = "client!in", name = "m", descriptor = "I")
	private final int anInt2469;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class11_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2476 = arg3;
		this.anInt2472 = arg0;
		this.anInt2475 = arg1;
		this.anInt2468 = arg2;
		this.anInt2473 = arg4;
		this.anInt2470 = arg5;
		this.anInt2474 = arg6;
		this.anInt2469 = arg7;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIZ)V")
	@Override
	public final void method1938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2472 >> 12;
		@Pc(17) int local17 = this.anInt2468 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2476 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt2473 >> 12;
		@Pc(38) int local38 = this.anInt2475 * arg1 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt2470 >> 12;
		@Pc(62) int local62 = arg1 * this.anInt2469 >> 12;
		@Pc(69) int local69 = this.anInt2474 * arg0 >> 12;
		Static22.method4693(local17, local24, this.anInt2466, local31, local69, local38, local62, local45, local10);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V")
	@Override
	public final void method1935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)V")
	@Override
	public final void method1934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}

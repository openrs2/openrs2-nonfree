import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class SoftwareFont extends Font {

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "[[B")
	private byte[][] aByteArrayArray18 = new byte[256][];

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public SoftwareFont(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray18 = arg5;
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B)V")
	public SoftwareFont(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected final void method2264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static6.anInt5188;
		@Pc(9) int local9 = Static6.anInt5188 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		if (arg2 < Static6.anInt5183) {
			@Pc(20) int local20 = Static6.anInt5183 - arg2;
			arg4 -= local20;
			arg2 = Static6.anInt5183;
			local13 = local20 * arg3;
			local5 += local20 * Static6.anInt5188;
		}
		if (arg2 + arg4 > Static6.anInt5187) {
			arg4 -= arg2 + arg4 - Static6.anInt5187;
		}
		if (arg1 < Static6.anInt5185) {
			@Pc(58) int local58 = Static6.anInt5185 - arg1;
			arg3 -= local58;
			arg1 = Static6.anInt5185;
			local13 += local58;
			local5 += local58;
			local11 = local58;
			local9 += local58;
		}
		if (arg1 + arg3 > Static6.anInt5186) {
			@Pc(91) int local91 = arg1 + arg3 - Static6.anInt5186;
			arg3 -= local91;
			local11 += local91;
			local9 += local91;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static22.method2280(Static6.anIntArray561, this.aByteArrayArray18[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected final void method2253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static6.anInt5188;
		@Pc(9) int local9 = Static6.anInt5188 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		if (arg2 < Static6.anInt5183) {
			@Pc(20) int local20 = Static6.anInt5183 - arg2;
			arg4 -= local20;
			arg2 = Static6.anInt5183;
			local13 = local20 * arg3;
			local5 += local20 * Static6.anInt5188;
		}
		if (arg2 + arg4 > Static6.anInt5187) {
			arg4 -= arg2 + arg4 - Static6.anInt5187;
		}
		if (arg1 < Static6.anInt5185) {
			@Pc(58) int local58 = Static6.anInt5185 - arg1;
			arg3 -= local58;
			arg1 = Static6.anInt5185;
			local13 += local58;
			local5 += local58;
			local11 = local58;
			local9 += local58;
		}
		if (arg1 + arg3 > Static6.anInt5186) {
			@Pc(91) int local91 = arg1 + arg3 - Static6.anInt5186;
			arg3 -= local91;
			local11 += local91;
			local9 += local91;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static6.anIntArray559 == null) {
			Static22.method2282(Static6.anIntArray561, this.aByteArrayArray18[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static22.method2281(Static6.anIntArray561, this.aByteArrayArray18[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static6.anIntArray559, Static6.anIntArray560);
		}
	}
}

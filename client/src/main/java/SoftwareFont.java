import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

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
		@Pc(5) int local5 = arg1 + arg2 * SoftwareRaster.width;
		@Pc(9) int local9 = SoftwareRaster.width - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		if (arg2 < SoftwareRaster.clipY) {
			@Pc(20) int local20 = SoftwareRaster.clipY - arg2;
			arg4 -= local20;
			arg2 = SoftwareRaster.clipY;
			local13 = local20 * arg3;
			local5 += local20 * SoftwareRaster.width;
		}
		if (arg2 + arg4 > SoftwareRaster.clipHeight) {
			arg4 -= arg2 + arg4 - SoftwareRaster.clipHeight;
		}
		if (arg1 < SoftwareRaster.clipX) {
			@Pc(58) int local58 = SoftwareRaster.clipX - arg1;
			arg3 -= local58;
			arg1 = SoftwareRaster.clipX;
			local13 += local58;
			local5 += local58;
			local11 = local58;
			local9 += local58;
		}
		if (arg1 + arg3 > SoftwareRaster.clipWidth) {
			@Pc(91) int local91 = arg1 + arg3 - SoftwareRaster.clipWidth;
			arg3 -= local91;
			local11 += local91;
			local9 += local91;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static22.method2280(SoftwareRaster.pixels, this.aByteArrayArray18[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected final void method2253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * SoftwareRaster.width;
		@Pc(9) int local9 = SoftwareRaster.width - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		if (arg2 < SoftwareRaster.clipY) {
			@Pc(20) int local20 = SoftwareRaster.clipY - arg2;
			arg4 -= local20;
			arg2 = SoftwareRaster.clipY;
			local13 = local20 * arg3;
			local5 += local20 * SoftwareRaster.width;
		}
		if (arg2 + arg4 > SoftwareRaster.clipHeight) {
			arg4 -= arg2 + arg4 - SoftwareRaster.clipHeight;
		}
		if (arg1 < SoftwareRaster.clipX) {
			@Pc(58) int local58 = SoftwareRaster.clipX - arg1;
			arg3 -= local58;
			arg1 = SoftwareRaster.clipX;
			local13 += local58;
			local5 += local58;
			local11 = local58;
			local9 += local58;
		}
		if (arg1 + arg3 > SoftwareRaster.clipWidth) {
			@Pc(91) int local91 = arg1 + arg3 - SoftwareRaster.clipWidth;
			arg3 -= local91;
			local11 += local91;
			local9 += local91;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (SoftwareRaster.maskXs == null) {
			Static22.method2282(SoftwareRaster.pixels, this.aByteArrayArray18[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static22.method2281(SoftwareRaster.pixels, this.aByteArrayArray18[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, SoftwareRaster.maskXs, SoftwareRaster.maskWidths);
		}
	}
}

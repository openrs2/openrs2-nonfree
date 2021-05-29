import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class TextureOp23 extends TextureOp {

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public TextureOp23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(7) int[][] local7 = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(15) int[] local15 = local7[0];
			@Pc(19) int[] local19 = local7[1];
			@Pc(23) int[] local23 = local7[2];
			for (@Pc(25) int local25 = 0; local25 < Texture.width; local25++) {
				this.method4301(y, local25);
				@Pc(43) int[][] local43 = this.method4686(0, Static6.anInt4471);
				local15[local25] = local43[0][Static4.anInt2959];
				local19[local25] = local43[1][Static4.anInt2959];
				local23[local25] = local43[2][Static4.anInt2959];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)V")
	private void method4301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Texture.widthFractions[arg1];
		@Pc(13) int local13 = Texture.heightFractions[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if (-3.141592653589793D <= (double) local24 && -2.356194490192345D >= (double) local24) {
			Static4.anInt2959 = arg1;
			Static6.anInt4471 = arg0;
		} else if (-1.5707963267948966D >= (double) local24 && (double) local24 >= -2.356194490192345D) {
			Static6.anInt4471 = arg1;
			Static4.anInt2959 = arg0;
		} else if (-0.7853981633974483D >= (double) local24 && (double) local24 >= -1.5707963267948966D) {
			Static4.anInt2959 = Texture.width - arg0;
			Static6.anInt4471 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static6.anInt4471 = Texture.height - arg0;
			Static4.anInt2959 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static4.anInt2959 = Texture.width - arg1;
			Static6.anInt4471 = Texture.height - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static4.anInt2959 = Texture.width - arg0;
			Static6.anInt4471 = Texture.height - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static4.anInt2959 = arg0;
			Static6.anInt4471 = Texture.height - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static6.anInt4471 = arg0;
			Static4.anInt2959 = Texture.width - arg1;
		}
		Static4.anInt2959 &= Texture.widthMask;
		Static6.anInt4471 &= Texture.heightMask;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(20) int[] local20 = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			for (@Pc(26) int local26 = 0; local26 < Texture.width; local26++) {
				this.method4301(y, local26);
				@Pc(44) int[] local44 = this.method4699(Static6.anInt4471, 0);
				local20[local26] = local44[Static4.anInt2959];
			}
		}
		return local20;
	}
}

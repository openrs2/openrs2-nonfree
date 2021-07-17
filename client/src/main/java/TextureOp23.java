import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class TextureOp23 extends TextureOp {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	private static int anInt4471 = 0;

	@OriginalMember(owner = "client!km", name = "db", descriptor = "I")
	private static int anInt2959 = 0;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public TextureOp23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(7) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(15) int[] destRed = dest[0];
			@Pc(19) int[] destGreen = dest[1];
			@Pc(23) int[] destBlue = dest[2];
			for (@Pc(25) int x = 0; x < Texture.width; x++) {
				this.method4301(x, y);
				@Pc(43) int[][] src = this.getChildColorOutput(0, anInt4471);
				destRed[x] = src[0][anInt2959];
				destGreen[x] = src[1][anInt2959];
				destBlue[x] = src[2][anInt2959];
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)V")
	private void method4301(@OriginalArg(2) int x, @OriginalArg(1) int y) {
		@Pc(9) int local9 = Texture.widthFractions[x];
		@Pc(13) int local13 = Texture.heightFractions[y];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if (-3.141592653589793D <= (double) local24 && -2.356194490192345D >= (double) local24) {
			anInt2959 = x;
			anInt4471 = y;
		} else if (-1.5707963267948966D >= (double) local24 && (double) local24 >= -2.356194490192345D) {
			anInt4471 = x;
			anInt2959 = y;
		} else if (-0.7853981633974483D >= (double) local24 && (double) local24 >= -1.5707963267948966D) {
			anInt2959 = Texture.width - y;
			anInt4471 = x;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			anInt4471 = Texture.height - y;
			anInt2959 = x;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			anInt2959 = Texture.width - x;
			anInt4471 = Texture.height - y;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			anInt2959 = Texture.width - y;
			anInt4471 = Texture.height - x;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			anInt2959 = y;
			anInt4471 = Texture.height - x;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			anInt4471 = y;
			anInt2959 = Texture.width - x;
		}
		anInt2959 &= Texture.widthMask;
		anInt4471 &= Texture.heightMask;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(20) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			for (@Pc(26) int x = 0; x < Texture.width; x++) {
				this.method4301(x, y);
				@Pc(44) int[] src = this.getChildMonochromeOutput(0, anInt4471);
				dest[x] = src[anInt2959];
			}
		}
		return dest;
	}
}

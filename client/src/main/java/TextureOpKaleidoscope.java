import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class TextureOpKaleidoscope extends TextureOp {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	private static int y0 = 0;

	@OriginalMember(owner = "client!km", name = "db", descriptor = "I")
	private static int x0 = 0;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public TextureOpKaleidoscope() {
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
				@Pc(43) int[][] src = this.getChildColorOutput(0, y0);
				destRed[x] = src[0][x0];
				destGreen[x] = src[1][x0];
				destBlue[x] = src[2][x0];
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
		@Pc(9) int normalisedX = Texture.normalisedX[x];
		@Pc(13) int normalisedY = Texture.normalisedY[y];
		@Pc(24) float angle = (float) Math.atan2(normalisedX - 2048, normalisedY - 2048);
		if ((double) angle >= -3.141592653589793D && (double) angle <= -2.356194490192345D) {
			x0 = x;
			y0 = y;
		} else if ((double) angle <= -1.5707963267948966D && (double) angle >= -2.356194490192345D) {
			y0 = x;
			x0 = y;
		} else if ((double) angle <= -0.7853981633974483D && (double) angle >= -1.5707963267948966D) {
			x0 = Texture.width - y;
			y0 = x;
		} else if (angle <= 0.0F && (double) angle >= -0.7853981633974483D) {
			y0 = Texture.height - y;
			x0 = x;
		} else if (angle >= 0.0F && (double) angle <= 0.7853981633974483D) {
			x0 = Texture.width - x;
			y0 = Texture.height - y;
		} else if ((double) angle >= 0.7853981633974483D && (double) angle <= 1.5707963267948966D) {
			x0 = Texture.width - y;
			y0 = Texture.height - x;
		} else if ((double) angle >= 1.5707963267948966D && (double) angle <= 2.356194490192345D) {
			x0 = y;
			y0 = Texture.height - x;
		} else if ((double) angle >= 2.356194490192345D && (double) angle <= 3.141592653589793D) {
			y0 = y;
			x0 = Texture.width - x;
		}
		x0 &= Texture.widthMask;
		y0 &= Texture.heightMask;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(20) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			for (@Pc(26) int x = 0; x < Texture.width; x++) {
				this.method4301(x, y);
				@Pc(44) int[] src = this.getChildMonochromeOutput(0, y0);
				dest[x] = src[x0];
			}
		}
		return dest;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class TextureOpHslAdjust extends TextureOp {

	@OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
	private int red;

	@OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
	private int green;

	@OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
	private int hue;

	@OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
	private int lightness;

	@OriginalMember(owner = "client!lj", name = "ib", descriptor = "I")
	private int saturation;

	@OriginalMember(owner = "client!lj", name = "jb", descriptor = "I")
	private int blue;

	@OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
	private int lightnessDelta = 0;

	@OriginalMember(owner = "client!lj", name = "hb", descriptor = "I")
	private int hueDelta = 0;

	@OriginalMember(owner = "client!lj", name = "lb", descriptor = "I")
	private int saturationDelta = 0;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public TextureOpHslAdjust() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIB)V")
	private void hslToRgb(@OriginalArg(0) int h, @OriginalArg(2) int s, @OriginalArg(1) int l) {
		@Pc(29) int q = l > 2048 ? s + l - (l * s >> 12) : l * (s + 4096) >> 12;
		if (q <= 0) {
			this.red = this.green = this.blue = l;
			return;
		}
		@Pc(38) int p = l + l - q;
		@Pc(47) int local47 = (q - p << 12) / q;
		h *= 6;
		@Pc(55) int hPrime = h >> 12;
		@Pc(64) int local64 = h - (hPrime << 12);
		@Pc(70) int local70 = local47 * q >> 12;
		local70 = local70 * local64 >> 12;
		@Pc(81) int local81 = q - local70;
		@Pc(85) int local85 = p + local70;
		if (hPrime == 0) {
			this.green = local85;
			this.red = q;
			this.blue = p;
		} else if (hPrime == 1) {
			this.green = q;
			this.red = local81;
			this.blue = p;
		} else if (hPrime == 2) {
			this.red = p;
			this.green = q;
			this.blue = local85;
		} else if (hPrime == 3) {
			this.red = p;
			this.green = local81;
			this.blue = q;
		} else if (hPrime == 4) {
			this.red = local85;
			this.green = p;
			this.blue = q;
		} else if (hPrime == 5) {
			this.green = p;
			this.red = q;
			this.blue = local81;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.hueDelta = buffer.readShort();
		} else if (code == 1) {
			this.saturationDelta = (buffer.readByte() << 12) / 100;
		} else if (code == 2) {
			this.lightnessDelta = (buffer.readByte() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V")
	private void rgbToHsl(@OriginalArg(3) int r, @OriginalArg(1) int g, @OriginalArg(0) int b) {
		@Pc(8) int xMax = r > g ? r : g;
		xMax = b > xMax ? b : xMax;
		@Pc(34) int xMin = r < g ? r : g;
		xMin = b < xMin ? b : xMin;
		this.lightness = (xMax + xMin) / 2;
		@Pc(62) int chroma = xMax - xMin;
		if (chroma <= 0) {
			this.hue = 0;
		} else {
			@Pc(81) int tempB = (xMax - b << 12) / chroma;
			@Pc(90) int tempR = (xMax - r << 12) / chroma;
			@Pc(98) int tempG = (xMax - g << 12) / chroma;
			if (xMax == r) {
				this.hue = xMin == g ? tempB + 20480 : 4096 - tempG;
			} else if (xMax == g) {
				this.hue = xMin == b ? tempR + 4096 : 12288 - tempB;
			} else {
				this.hue = xMin == r ? tempG + 12288 : 20480 - tempR;
			}
			this.hue /= 6;
		}
		if (this.lightness > 0 && this.lightness < 4096) {
			this.saturation = (chroma << 12) / (this.lightness <= 2048 ? this.lightness * 2 : 8192 - this.lightness * 2);
		} else {
			this.saturation = 0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(18) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(28) int[][] src = this.getChildColorOutput(0, y);
			@Pc(32) int[] srcRed = src[0];
			@Pc(36) int[] srcGreen = src[1];
			@Pc(40) int[] destRed = dest[0];
			@Pc(44) int[] srcBlue = src[2];
			@Pc(48) int[] destGreen = dest[1];
			@Pc(52) int[] destBlue = dest[2];
			for (@Pc(54) int x = 0; x < Texture.width; x++) {
				this.rgbToHsl(srcRed[x], srcGreen[x], srcBlue[x]);
				this.lightness += this.lightnessDelta;
				this.saturation += this.saturationDelta;
				if (this.saturation < 0) {
					this.saturation = 0;
				}
				this.hue += this.hueDelta;
				if (this.saturation > 4096) {
					this.saturation = 4096;
				}
				while (this.hue < 0) {
					this.hue += 4096;
				}
				if (this.lightness < 0) {
					this.lightness = 0;
				}
				if (this.lightness > 4096) {
					this.lightness = 4096;
				}
				while (this.hue > 4096) {
					this.hue -= 4096;
				}
				this.hslToRgb(this.hue, this.saturation, this.lightness);
				destRed[x] = this.red;
				destGreen[x] = this.green;
				destBlue[x] = this.blue;
			}
		}
		return dest;
	}
}

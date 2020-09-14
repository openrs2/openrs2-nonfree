import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class ColorUtils {
	@OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
	public static final int[] HSL_TO_RGB = new int[65536];

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "F")
	public static float brightness = 1.0F;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)V")
	private static void init() {
		@Pc(3) int i = 0;
		for (@Pc(5) int j = 0; j < 512; j++) {
			@Pc(17) double h = (double) (j >> 3) / 64.0D + 0.0078125D;
			@Pc(26) double s = (double) (j & 0x7) / 8.0D + 0.0625D;
			for (@Pc(28) int k = 0; k < 128; k++) {
				@Pc(36) double l = (double) k / 128.0D;
				@Pc(38) double r = l;
				@Pc(40) double g = l;
				@Pc(42) double b = l;
				if (s != 0.0D) {
					@Pc(56) double q;
					if (l < 0.5D) {
						q = l * (s + 1.0D);
					} else {
						q = l + s - l * s;
					}
					@Pc(71) double p = l * 2.0D - q;
					@Pc(75) double tr = h + 0.3333333333333333D;
					if (tr > 1.0D) {
						tr--;
					}
					@Pc(89) double tb = h - 0.3333333333333333D;
					if (tb < 0.0D) {
						tb++;
					}
					if (tr * 6.0D < 1.0D) {
						r = p + (q - p) * 6.0D * tr;
					} else if (tr * 2.0D < 1.0D) {
						r = q;
					} else if (tr * 3.0D < 2.0D) {
						r = p + (q - p) * (0.6666666666666666D - tr) * 6.0D;
					} else {
						r = p;
					}
					if (h * 6.0D < 1.0D) {
						g = p + (q - p) * 6.0D * h;
					} else if (h * 2.0D < 1.0D) {
						g = q;
					} else if (h * 3.0D < 2.0D) {
						g = p + (q - p) * (0.6666666666666666D - h) * 6.0D;
					} else {
						g = p;
					}
					if (tb * 6.0D < 1.0D) {
						b = p + (q - p) * 6.0D * tb;
					} else if (tb * 2.0D < 1.0D) {
						b = q;
					} else if (tb * 3.0D < 2.0D) {
						b = p + (q - p) * (0.6666666666666666D - tb) * 6.0D;
					} else {
						b = p;
					}
				}
				@Pc(243) double rPow = Math.pow(r, brightness);
				@Pc(248) double gPow = Math.pow(g, brightness);
				@Pc(253) double bPow = Math.pow(b, brightness);
				@Pc(258) int ir = (int) (rPow * 256.0D);
				@Pc(263) int ig = (int) (gPow * 256.0D);
				@Pc(268) int ib = (int) (bPow * 256.0D);
				@Pc(278) int rgb = (ir << 16) + (ig << 8) + ib;
				if (rgb == 0) {
					rgb = 1;
				}
				HSL_TO_RGB[i++] = rgb;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(F)V")
	public static void setBrightness(@OriginalArg(0) float brightness) {
		setBrightnessInternal(brightness);
		init();
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(F)V")
	private static void setBrightnessInternal(@OriginalArg(0) float brightness) {
		ColorUtils.brightness = brightness;
		ColorUtils.brightness = (float) ((double) ColorUtils.brightness + Math.random() * 0.03D - 0.015D);
	}
}

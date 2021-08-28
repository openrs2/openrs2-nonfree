import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

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

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I")
	public static int rgbToHsl(@OriginalArg(1) int rgb) {
		@Pc(14) double r = (double) (rgb >> 16 & 0xFF) / 256.0D;
		@Pc(23) double g = (double) (rgb >> 8 & 0xFF) / 256.0D;
		@Pc(25) double xMin = r;
		if (g < r) {
			xMin = g;
		}
		@Pc(38) double b = (double) (rgb & 0xFF) / 256.0D;
		@Pc(40) double xMax = r;
		if (b < xMin) {
			xMin = b;
		}
		if (r < g) {
			xMax = g;
		}
		if (b > xMax) {
			xMax = b;
		}
		@Pc(60) double h = 0.0D;
		@Pc(66) double l = (xMin + xMax) / 2.0D;
		@Pc(68) double s = 0.0D;
		@Pc(73) int il = (int) (l * 256.0D);
		if (il < 0) {
			il = 0;
		} else if (il > 255) {
			il = 255;
		}
		if (xMax != xMin) {
			if (r == xMax) {
				h = (g - b) / (xMax - xMin);
			} else if (g == xMax) {
				h = (b - r) / (xMax - xMin) + 2.0D;
			} else if (b == xMax) {
				h = (r - g) / (xMax - xMin) + 4.0D;
			}
			if (l < 0.5D) {
				s = (xMax - xMin) / (xMin + xMax);
			}
			if (l >= 0.5D) {
				s = (xMax - xMin) / (2.0D - xMax - xMin);
			}
		}
		@Pc(173) int is = (int) (s * 256.0D);
		if (is < 0) {
			is = 0;
		} else if (is > 255) {
			is = 255;
		}
		@Pc(199) double hPrime = h / 6.0D;
		@Pc(204) int ih = (int) (hPrime * 256.0D);
		if (il > 243) {
			is >>= 4;
		} else if (il > 217) {
			is >>= 3;
		} else if (il > 192) {
			is >>= 2;
		} else if (il > 179) {
			is >>= 1;
		}
		return (il >> 1) + (is >> 5 << 7) + (ih >> 2 << 10);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I")
	public static int rgbToHslTransparent(@OriginalArg(0) int rgb) {
		return rgb == 0xFF00FF ? -1 : rgbToHsl(rgb);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIII)I")
	public static int compressHsl(@OriginalArg(1) int hue, @OriginalArg(2) int saturation, @OriginalArg(3) int lightness) {
		if (lightness > 243) {
			saturation >>= 4;
		} else if (lightness > 217) {
			saturation >>= 3;
		} else if (lightness > 192) {
			saturation >>= 2;
		} else if (lightness > 179) {
			saturation >>= 1;
		}
		return (lightness >> 1) + (saturation >> 5 << 7) + (hue >> 2 << 10);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZII)I")
	public static int multiplyLightnessSafe(@OriginalArg(1) int hsl, @OriginalArg(2) int factor) {
		if (hsl == -1) {
			return 12345678;
		}
		@Pc(18) int l = (hsl & 0x7F) * factor >> 7;
		if (l < 2) {
			l = 2;
		} else if (l > 126) {
			l = 126;
		}
		return l + (hsl & 0xFF80);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)I")
	public static int multiplyLightnessGrayscale(@OriginalArg(1) int hsl, @OriginalArg(2) int factor) {
		if (hsl == -2) {
			return 12345678;
		} else if (hsl == -1) {
			if (factor < 2) {
				factor = 2;
			} else if (factor > 126) {
				factor = 126;
			}
			return factor;
		} else {
			@Pc(45) int l = factor * (hsl & 0x7F) >> 7;
			if (l < 2) {
				l = 2;
			} else if (l > 126) {
				l = 126;
			}
			return (hsl & 0xFF80) + l;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
	public static int multiplyLightness(@OriginalArg(0) int hsl, @OriginalArg(1) int factor) {
		@Pc(7) int l = factor * (hsl & 0x7F) >> 7;
		if (l < 2) {
			l = 2;
		} else if (l > 126) {
			l = 126;
		}
		return (hsl & 0xFF80) + l;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I")
	public static int multiplyLightness2(@OriginalArg(0) int hsl, @OriginalArg(1) int factor) {
		@Pc(7) int l = factor * (hsl & 0x7F) >> 7;
		if (l < 2) {
			l = 2;
		} else if (l > 126) {
			l = 126;
		}
		return (hsl & 0xFF80) + l;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class FluType {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
	public int weightedHue;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	public int saturation;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
	public int chroma;

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
	public int lightness;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
	private int color = 0;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Z")
	public boolean aBoolean286 = true;

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
	public int anInt4074 = -1;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
	public int anInt4068 = 128;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!fd;II)V")
	public final void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int id) {
		while (true) {
			@Pc(13) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code, id);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!fd;IB)V")
	private void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code, @OriginalArg(0) int id) {
		if (code == 1) {
			this.color = buffer.readUnsignedMedium();
			this.rgbToHsl(this.color);
		} else if (code == 2) {
			this.anInt4074 = buffer.readUnsignedShort();
			if (this.anInt4074 == 65535) {
				this.anInt4074 = -1;
			}
		} else if (code == 3) {
			this.anInt4068 = buffer.readUnsignedShort();
		} else if (code == 4) {
			this.aBoolean286 = false;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
	private void rgbToHsl(@OriginalArg(1) int rgb) {
		@Pc(14) double r = (double) (rgb >> 16 & 0xFF) / 256.0D;
		@Pc(23) double g = (double) (rgb >> 8 & 0xFF) / 256.0D;
		@Pc(30) double b = (double) (rgb & 0xFF) / 256.0D;
		@Pc(32) double xMin = r;
		if (r > g) {
			xMin = g;
		}
		if (xMin > b) {
			xMin = b;
		}
		@Pc(48) double xMax = r;
		if (r < g) {
			xMax = g;
		}
		@Pc(56) double h = 0.0D;
		if (xMax < b) {
			xMax = b;
		}
		@Pc(65) double s = 0.0D;
		@Pc(71) double l = (xMin + xMax) / 2.0D;
		this.lightness = (int) (l * 256.0D);
		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}
		if (xMax != xMin) {
			if (l < 0.5D) {
				s = (xMax - xMin) / (xMax + xMin);
			}
			if (xMax == r) {
				h = (g - b) / (xMax - xMin);
			} else if (g == xMax) {
				h = (b - r) / (xMax - xMin) + 2.0D;
			} else if (xMax == b) {
				h = (r - g) / (xMax - xMin) + 4.0D;
			}
			if (l >= 0.5D) {
				s = (xMax - xMin) / (2.0D - xMin - xMax);
			}
		}
		this.saturation = (int) (s * 256.0D);
		if (l > 0.5D) {
			this.chroma = (int) ((1.0D - l) * 512.0D * s);
		} else {
			this.chroma = (int) (s * 512.0D * l);
		}
		if (this.chroma < 1) {
			this.chroma = 1;
		}
		@Pc(224) double hPrime = h / 6.0D;
		this.weightedHue = (int) ((double) this.chroma * hPrime);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}
	}
}

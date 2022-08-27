import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class TextureOpColorGradient extends TextureOp {

	@OriginalMember(owner = "client!vm", name = "W", descriptor = "[[I")
	private int[][] samples;

	@OriginalMember(owner = "client!vm", name = "bb", descriptor = "[I")
	private final int[] colors = new int[257];

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public TextureOpColorGradient() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)V")
	private void setPreset(@OriginalArg(0) int preset) {
		if (preset == 0) {
			return;
		}
		if (preset == 1) {
			this.samples = new int[2][4];
			this.samples[0][0] = 0;
			this.samples[0][3] = 0;
			this.samples[0][1] = 0;
			this.samples[1][0] = 4096;
			this.samples[0][2] = 0;
			this.samples[1][2] = 4096;
			this.samples[1][1] = 4096;
			this.samples[1][3] = 4096;
		} else if (preset == 2) {
			this.samples = new int[8][4];
			this.samples[0][0] = 0;
			this.samples[0][1] = 2650;
			this.samples[0][2] = 2602;
			this.samples[1][0] = 2867;
			this.samples[2][0] = 3072;
			this.samples[1][2] = 1799;
			this.samples[1][1] = 2313;
			this.samples[2][2] = 1734;
			this.samples[3][2] = 1220;
			this.samples[4][2] = 963;
			this.samples[0][3] = 2361;
			this.samples[5][2] = 2152;
			this.samples[3][0] = 3276;
			this.samples[2][1] = 2618;
			this.samples[6][2] = 1060;
			this.samples[4][0] = 3481;
			this.samples[1][3] = 1558;
			this.samples[7][2] = 1413;
			this.samples[5][0] = 3686;
			this.samples[6][0] = 3891;
			this.samples[7][0] = 4096;
			this.samples[3][1] = 2296;
			this.samples[2][3] = 1413;
			this.samples[3][3] = 947;
			this.samples[4][1] = 2072;
			this.samples[5][1] = 2730;
			this.samples[6][1] = 2232;
			this.samples[7][1] = 1686;
			this.samples[4][3] = 722;
			this.samples[5][3] = 1766;
			this.samples[6][3] = 915;
			this.samples[7][3] = 1140;
		} else if (preset == 3) {
			this.samples = new int[7][4];
			this.samples[0][3] = 4096;
			this.samples[0][2] = 0;
			this.samples[1][3] = 4096;
			this.samples[2][3] = 0;
			this.samples[0][0] = 0;
			this.samples[3][3] = 0;
			this.samples[4][3] = 0;
			this.samples[1][2] = 4096;
			this.samples[2][2] = 4096;
			this.samples[5][3] = 4096;
			this.samples[3][2] = 4096;
			this.samples[0][1] = 0;
			this.samples[1][0] = 663;
			this.samples[1][1] = 0;
			this.samples[6][3] = 4096;
			this.samples[2][1] = 0;
			this.samples[4][2] = 0;
			this.samples[5][2] = 0;
			this.samples[2][0] = 1363;
			this.samples[3][0] = 2048;
			this.samples[3][1] = 4096;
			this.samples[4][0] = 2727;
			this.samples[6][2] = 0;
			this.samples[4][1] = 4096;
			this.samples[5][0] = 3411;
			this.samples[6][0] = 4096;
			this.samples[5][1] = 4096;
			this.samples[6][1] = 0;
		} else if (preset == 4) {
			this.samples = new int[6][4];
			this.samples[0][0] = 0;
			this.samples[0][1] = 0;
			this.samples[0][2] = 0;
			this.samples[1][2] = 0;
			this.samples[0][3] = 0;
			this.samples[1][0] = 1843;
			this.samples[1][1] = 0;
			this.samples[2][0] = 2457;
			this.samples[1][3] = 1493;
			this.samples[2][1] = 0;
			this.samples[3][1] = 0;
			this.samples[2][2] = 0;
			this.samples[3][2] = 1124;
			this.samples[3][0] = 2781;
			this.samples[2][3] = 2939;
			this.samples[3][3] = 3565;
			this.samples[4][0] = 3481;
			this.samples[5][0] = 4096;
			this.samples[4][3] = 4031;
			this.samples[4][2] = 3084;
			this.samples[4][1] = 546;
			this.samples[5][2] = 4096;
			this.samples[5][3] = 4096;
			this.samples[5][1] = 4096;
		} else if (preset == 5) {
			this.samples = new int[16][4];
			this.samples[0][2] = 192;
			this.samples[0][1] = 80;
			this.samples[0][3] = 321;
			this.samples[0][0] = 0;
			this.samples[1][2] = 449;
			this.samples[1][1] = 321;
			this.samples[2][1] = 578;
			this.samples[1][3] = 562;
			this.samples[2][2] = 690;
			this.samples[2][3] = 803;
			this.samples[3][3] = 1140;
			this.samples[3][1] = 947;
			this.samples[3][2] = 995;
			this.samples[1][0] = 155;
			this.samples[2][0] = 389;
			this.samples[3][0] = 671;
			this.samples[4][2] = 1397;
			this.samples[5][2] = 1429;
			this.samples[4][0] = 897;
			this.samples[4][3] = 1509;
			this.samples[6][2] = 1461;
			this.samples[5][3] = 1413;
			this.samples[4][1] = 1285;
			this.samples[6][3] = 1333;
			this.samples[5][0] = 1175;
			this.samples[7][3] = 1702;
			this.samples[8][3] = 2056;
			this.samples[6][0] = 1368;
			this.samples[9][3] = 2666;
			this.samples[10][3] = 3276;
			this.samples[5][1] = 1525;
			this.samples[7][0] = 1507;
			this.samples[7][2] = 1525;
			this.samples[6][1] = 1734;
			this.samples[11][3] = 3228;
			this.samples[8][0] = 1736;
			this.samples[9][0] = 2088;
			this.samples[7][1] = 1413;
			this.samples[8][2] = 1590;
			this.samples[9][2] = 2056;
			this.samples[8][1] = 1108;
			this.samples[10][0] = 2355;
			this.samples[9][1] = 1766;
			this.samples[11][0] = 2691;
			this.samples[10][1] = 2409;
			this.samples[12][0] = 3031;
			this.samples[13][0] = 3522;
			this.samples[10][2] = 2586;
			this.samples[11][1] = 3116;
			this.samples[11][2] = 3148;
			this.samples[12][3] = 3196;
			this.samples[14][0] = 3727;
			this.samples[15][0] = 4096;
			this.samples[12][2] = 3710;
			this.samples[13][3] = 3019;
			this.samples[13][2] = 3421;
			this.samples[12][1] = 3806;
			this.samples[14][3] = 3228;
			this.samples[15][3] = 2746;
			this.samples[13][1] = 3437;
			this.samples[14][1] = 3116;
			this.samples[15][1] = 2377;
			this.samples[14][2] = 3148;
			this.samples[15][2] = 2505;
		} else if (preset == 6) {
			this.samples = new int[4][4];
			this.samples[0][3] = 0;
			this.samples[0][1] = 0;
			this.samples[1][3] = 0;
			this.samples[0][2] = 4096;
			this.samples[1][2] = 4096;
			this.samples[2][3] = 0;
			this.samples[2][2] = 4096;
			this.samples[0][0] = 2048;
			this.samples[3][3] = 0;
			this.samples[1][1] = 4096;
			this.samples[3][2] = 0;
			this.samples[1][0] = 2867;
			this.samples[2][1] = 4096;
			this.samples[3][1] = 4096;
			this.samples[2][0] = 3276;
			this.samples[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V")
	private void interpolate() {
		@Pc(9) int samplesLen = this.samples.length;
		if (samplesLen <= 0) {
			return;
		}
		for (@Pc(18) int i = 0; i < 257; i++) {
			@Pc(23) int sample = 0;
			@Pc(27) int position = i << 4;
			for (@Pc(29) int j = 0; j < samplesLen && position >= this.samples[j][0]; j++) {
				sample++;
			}
			@Pc(76) int red;
			@Pc(80) int green;
			@Pc(72) int blue;
			if (sample >= samplesLen) {
				@Pc(68) int[] lastSample = this.samples[samplesLen - 1];
				blue = lastSample[3];
				red = lastSample[1];
				green = lastSample[2];
			} else {
				@Pc(86) int[] nextSample = this.samples[sample];
				if (sample <= 0) {
					green = nextSample[2];
					red = nextSample[1];
					blue = nextSample[3];
				} else {
					@Pc(112) int[] prevSample = this.samples[sample - 1];
					@Pc(129) int nextWeight = (position - prevSample[0] << 12) / (nextSample[0] - prevSample[0]);
					@Pc(134) int prevWeight = 4096 - nextWeight;
					green = nextSample[2] * nextWeight + prevSample[2] * prevWeight >> 12;
					red = nextSample[1] * nextWeight + prevSample[1] * prevWeight >> 12;
					blue = nextSample[3] * nextWeight + prevSample[3] * prevWeight >> 12;
				}
			}
			@Pc(181) int green2 = green >> 4;
			if (green2 < 0) {
				green2 = 0;
			} else if (green2 > 255) {
				green2 = 255;
			}
			@Pc(199) int blue2 = blue >> 4;
			@Pc(203) int red2 = red >> 4;
			if (red2 < 0) {
				red2 = 0;
			} else if (red2 > 255) {
				red2 = 255;
			}
			if (blue2 < 0) {
				blue2 = 0;
			} else if (blue2 > 255) {
				blue2 = 255;
			}
			this.colors[i] = blue2 | green2 << 8 | red2 << 16;
		}
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(B)V")
	@Override
	public void postDecode() {
		if (this.samples == null) {
			this.setPreset(1);
		}
		this.interpolate();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code != 0) {
			return;
		}
		@Pc(13) int preset = buffer.readUnsignedByte();
		if (preset != 0) {
			this.setPreset(preset);
			return;
		}
		this.samples = new int[buffer.readUnsignedByte()][4];
		for (@Pc(31) int i = 0; i < this.samples.length; i++) {
			this.samples[i][0] = buffer.readUnsignedShort();
			this.samples[i][1] = buffer.readUnsignedByte() << 4;
			this.samples[i][2] = buffer.readUnsignedByte() << 4;
			this.samples[i][3] = buffer.readUnsignedByte() << 4;
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(15) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(26) int[] src = this.getChildMonochromeOutput(0, y);
			@Pc(30) int[] green = dest[1];
			@Pc(34) int[] blue = dest[2];
			@Pc(38) int[] red = dest[0];
			for (@Pc(40) int x = 0; x < Texture.width; x++) {
				@Pc(49) int value = src[x] >> 4;
				if (value < 0) {
					value = 0;
				}
				if (value > 256) {
					value = 256;
				}
				@Pc(69) int color = this.colors[value];
				red[x] = color >> 12 & 0xFF0;
				green[x] = color >> 4 & 0xFF0;
				blue[x] = (color & 0xFF) << 4;
			}
		}
		return dest;
	}
}

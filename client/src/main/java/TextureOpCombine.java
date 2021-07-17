import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class TextureOpCombine extends TextureOp {

	@OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
	private int function = 6;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public TextureOpCombine() {
		super(2, false);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.function = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(22) int[] src0 = this.getChildMonochromeOutput(0, y);
			@Pc(28) int[] src1 = this.getChildMonochromeOutput(1, y);
			@Pc(31) int function = this.function;
			if (function == 1) {
				for (@Pc(93) int x = 0; x < Texture.width; x++) {
					dest[x] = src1[x] + src0[x];
				}
			} else if (function == 2) {
				for (@Pc(117) int x = 0; x < Texture.width; x++) {
					dest[x] = src0[x] - src1[x];
				}
			} else if (function == 3) {
				for (@Pc(138) int x = 0; x < Texture.width; x++) {
					dest[x] = src0[x] * src1[x] >> 12;
				}
			} else if (function == 4) {
				for (@Pc(164) int x = 0; x < Texture.width; x++) {
					@Pc(171) int value1 = src1[x];
					dest[x] = value1 == 0 ? 4096 : (src0[x] << 12) / value1;
				}
			} else if (function == 5) {
				for (@Pc(192) int x = 0; x < Texture.width; x++) {
					dest[x] = 4096 - ((4096 - src0[x]) * (4096 - src1[x]) >> 12);
				}
			} else if (function == 6) {
				for (@Pc(227) int x = 0; x < Texture.width; x++) {
					@Pc(234) int value1 = src1[x];
					dest[x] = value1 >= 2048 ? 4096 - ((4096 - value1) * (4096 - src0[x]) >> 11) : value1 * src0[x] >> 11;
				}
			} else if (function == 7) {
				for (@Pc(271) int x = 0; x < Texture.width; x++) {
					@Pc(278) int value0 = src0[x];
					dest[x] = value0 == 4096 ? 4096 : (src1[x] << 12) / (4096 - value0);
				}
			} else if (function == 8) {
				for (@Pc(303) int x = 0; x < Texture.width; x++) {
					@Pc(310) int value = src0[x];
					dest[x] = value == 0 ? 0 : 4096 - (4096 - src1[x] << 12) / value;
				}
			} else if (function == 9) {
				for (@Pc(338) int x = 0; x < Texture.width; x++) {
					@Pc(349) int value0 = src0[x];
					@Pc(353) int value1 = src1[x];
					dest[x] = value0 < value1 ? value0 : value1;
				}
			} else if (function == 10) {
				for (@Pc(373) int x = 0; x < Texture.width; x++) {
					@Pc(380) int value0 = src0[x];
					@Pc(384) int value1 = src1[x];
					dest[x] = value0 <= value1 ? value1 : value0;
				}
			} else if (function == 11) {
				for (@Pc(404) int x = 0; x < Texture.width; x++) {
					@Pc(411) int value1 = src1[x];
					@Pc(415) int value0 = src0[x];
					dest[x] = value0 > value1 ? value0 - value1 : value1 - value0;
				}
			} else if (function == 12) {
				for (@Pc(441) int x = 0; x < Texture.width; x++) {
					@Pc(452) int value0 = src0[x];
					@Pc(456) int value1 = src1[x];
					dest[x] = value0 + value1 - (value0 * value1 >> 11);
				}
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(18) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(29) int[][] src0 = this.getChildColorOutput(0, y);
			@Pc(35) int[][] src1 = this.getChildColorOutput(1, y);
			@Pc(39) int[] destRed = dest[0];
			@Pc(43) int[] destGreen = dest[1];
			@Pc(47) int[] src0Red = src0[0];
			@Pc(51) int[] destBlue = dest[2];
			@Pc(55) int[] src0Green = src0[1];
			@Pc(59) int[] src1Blue = src1[2];
			@Pc(63) int[] src0Blue = src0[2];
			@Pc(67) int[] src1Green = src1[1];
			@Pc(71) int[] src1Red = src1[0];
			@Pc(74) int function = this.function;
			if (function == 1) {
				for (@Pc(131) int x = 0; x < Texture.width; x++) {
					destRed[x] = src0Red[x] + src1Red[x];
					destGreen[x] = src0Green[x] + src1Green[x];
					destBlue[x] = src0Blue[x] + src1Blue[x];
				}
			} else if (function == 2) {
				for (@Pc(176) int x = 0; x < Texture.width; x++) {
					destRed[x] = src0Red[x] - src1Red[x];
					destGreen[x] = src0Green[x] - src1Green[x];
					destBlue[x] = src0Blue[x] - src1Blue[x];
				}
			} else if (function == 3) {
				for (@Pc(218) int x = 0; x < Texture.width; x++) {
					destRed[x] = src0Red[x] * src1Red[x] >> 12;
					destGreen[x] = src1Green[x] * src0Green[x] >> 12;
					destBlue[x] = src1Blue[x] * src0Blue[x] >> 12;
				}
			} else if (function == 4) {
				for (@Pc(268) int x = 0; x < Texture.width; x++) {
					@Pc(275) int green1 = src1Green[x];
					@Pc(279) int red1 = src1Red[x];
					@Pc(283) int blue1 = src1Blue[x];
					destRed[x] = red1 == 0 ? 4096 : (src0Red[x] << 12) / red1;
					destGreen[x] = green1 == 0 ? 4096 : (src0Green[x] << 12) / green1;
					destBlue[x] = blue1 == 0 ? 4096 : (src0Blue[x] << 12) / blue1;
				}
			} else if (function == 5) {
				for (@Pc(339) int x = 0; x < Texture.width; x++) {
					destRed[x] = 4096 - ((4096 - src0Red[x]) * (4096 - src1Red[x]) >> 12);
					destGreen[x] = 4096 - ((4096 - src0Green[x]) * (4096 - src1Green[x]) >> 12);
					destBlue[x] = 4096 - ((4096 - src0Blue[x]) * (4096 - src1Blue[x]) >> 12);
				}
			} else if (function == 6) {
				for (@Pc(413) int x = 0; x < Texture.width; x++) {
					@Pc(420) int green1 = src1Green[x];
					@Pc(424) int red1 = src1Red[x];
					@Pc(428) int blue1 = src1Blue[x];
					destRed[x] = red1 >= 2048 ? 4096 - ((4096 - src0Red[x]) * (4096 - red1) >> 11) : red1 * src0Red[x] >> 11;
					destGreen[x] = green1 >= 2048 ? 4096 - ((4096 - src0Green[x]) * (4096 - green1) >> 11) : src0Green[x] * green1 >> 11;
					destBlue[x] = blue1 >= 2048 ? 4096 - ((4096 - src0Blue[x]) * (4096 - blue1) >> 11) : src0Blue[x] * blue1 >> 11;
				}
			} else if (function == 7) {
				for (@Pc(524) int x = 0; x < Texture.width; x++) {
					@Pc(535) int blue0 = src0Blue[x];
					@Pc(539) int green0 = src0Green[x];
					@Pc(543) int red0 = src0Red[x];
					destRed[x] = red0 == 4096 ? 4096 : (src1Red[x] << 12) / (4096 - red0);
					destGreen[x] = green0 == 4096 ? 4096 : (src1Green[x] << 12) / (4096 - green0);
					destBlue[x] = blue0 == 4096 ? 4096 : (src1Blue[x] << 12) / (4096 - blue0);
				}
			} else if (function == 8) {
				for (@Pc(610) int x = 0; x < Texture.width; x++) {
					@Pc(621) int green0 = src0Green[x];
					@Pc(625) int blue0 = src0Blue[x];
					@Pc(629) int red0 = src0Red[x];
					destRed[x] = red0 == 0 ? 0 : 4096 - (4096 - src1Red[x] << 12) / red0;
					destGreen[x] = green0 == 0 ? 0 : 4096 - (4096 - src1Green[x] << 12) / green0;
					destBlue[x] = blue0 == 0 ? 0 : 4096 - (4096 - src1Blue[x] << 12) / blue0;
				}
			} else if (function == 9) {
				for (@Pc(701) int x = 0; x < Texture.width; x++) {
					@Pc(708) int blue0 = src0Blue[x];
					@Pc(712) int blue1 = src1Blue[x];
					@Pc(716) int green1 = src1Green[x];
					@Pc(720) int red1 = src1Red[x];
					@Pc(724) int red0 = src0Red[x];
					@Pc(728) int green0 = src0Green[x];
					destRed[x] = red0 < red1 ? red0 : red1;
					destGreen[x] = green0 < green1 ? green0 : green1;
					destBlue[x] = blue0 < blue1 ? blue0 : blue1;
				}
			} else if (function == 10) {
				for (@Pc(766) int x = 0; x < Texture.width; x++) {
					@Pc(777) int red0 = src0Red[x];
					@Pc(781) int blue0 = src0Blue[x];
					@Pc(785) int blue1 = src1Blue[x];
					@Pc(789) int red1 = src1Red[x];
					@Pc(793) int green1 = src1Green[x];
					@Pc(797) int green0 = src0Green[x];
					destRed[x] = red0 > red1 ? red0 : red1;
					destGreen[x] = green0 > green1 ? green0 : green1;
					destBlue[x] = blue0 > blue1 ? blue0 : blue1;
				}
			} else if (function == 11) {
				for (@Pc(835) int x = 0; x < Texture.width; x++) {
					@Pc(846) int red1 = src1Red[x];
					@Pc(850) int green1 = src1Green[x];
					@Pc(854) int blue0 = src0Blue[x];
					@Pc(858) int blue1 = src1Blue[x];
					@Pc(862) int red0 = src0Red[x];
					@Pc(866) int green0 = src0Green[x];
					destRed[x] = red0 <= red1 ? red1 - red0 : red0 - red1;
					destGreen[x] = green0 <= green1 ? green1 - green0 : green0 - green1;
					destBlue[x] = blue0 <= blue1 ? blue1 - blue0 : blue0 - blue1;
				}
			} else if (function == 12) {
				for (@Pc(917) int x = 0; x < Texture.width; x++) {
					@Pc(928) int green0 = src0Green[x];
					@Pc(932) int blue0 = src0Blue[x];
					@Pc(936) int red1 = src1Red[x];
					@Pc(940) int blue1 = src1Blue[x];
					@Pc(944) int red0 = src0Red[x];
					@Pc(948) int green1 = src1Green[x];
					destRed[x] = red1 + red0 - (red0 * red1 >> 11);
					destGreen[x] = green0 + green1 - (green0 * green1 >> 11);
					destBlue[x] = blue0 + blue1 - (blue0 * blue1 >> 11);
				}
			}
		}
		return dest;
	}
}

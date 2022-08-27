import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class TextureOpBoxBlur extends TextureOp {

	@OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
	private int radiusY = 1;

	@OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
	private int radiusX = 1;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public TextureOpBoxBlur() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(11) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(32) int local32 = this.radiusY + this.radiusY + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.radiusX + this.radiusX + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local32][][];
			for (@Pc(57) int local57 = y - this.radiusY; local57 <= y + this.radiusY; local57++) {
				@Pc(76) int[][] src = this.getChildColorOutput(0, local57 & Texture.heightMask);
				@Pc(80) int[][] local80 = new int[3][Texture.width];
				@Pc(82) int local82 = 0;
				@Pc(84) int local84 = 0;
				@Pc(88) int[] srcRed = src[0];
				@Pc(90) int local90 = 0;
				@Pc(94) int[] srcBlue = src[2];
				@Pc(98) int[] srcGreen = src[1];
				for (@Pc(102) int local102 = -this.radiusX; local102 <= this.radiusX; local102++) {
					@Pc(114) int local114 = Texture.widthMask & local102;
					local90 += srcGreen[local114];
					local82 += srcRed[local114];
					local84 += srcBlue[local114];
				}
				@Pc(139) int[] local139 = local80[0];
				@Pc(143) int[] local143 = local80[1];
				@Pc(147) int[] local147 = local80[2];
				@Pc(149) int local149 = 0;
				while (Texture.width > local149) {
					local139[local149] = local48 * local82 >> 16;
					local143[local149] = local90 * local48 >> 16;
					local147[local149] = local48 * local84 >> 16;
					@Pc(184) int local184 = local149 - this.radiusX & Texture.widthMask;
					@Pc(190) int local190 = local90 - srcGreen[local184];
					@Pc(196) int local196 = local82 - srcRed[local184];
					local149++;
					@Pc(203) int local203 = local84 - srcBlue[local184];
					local184 = local149 + this.radiusX & Texture.widthMask;
					local82 = local196 + srcRed[local184];
					local90 = local190 + srcGreen[local184];
					local84 = local203 + srcBlue[local184];
				}
				local51[local57 + this.radiusY - y] = local80;
			}
			@Pc(249) int[] destGreen = dest[1];
			@Pc(253) int[] destBlue = dest[2];
			@Pc(257) int[] destRed = dest[0];
			for (@Pc(259) int local259 = 0; local259 < Texture.width; local259++) {
				@Pc(264) int local264 = 0;
				@Pc(266) int local266 = 0;
				@Pc(268) int local268 = 0;
				for (@Pc(270) int local270 = 0; local270 < local32; local270++) {
					@Pc(277) int[][] local277 = local51[local270];
					local268 += local277[2][local259];
					local264 += local277[0][local259];
					local266 += local277[1][local259];
				}
				destRed[local259] = local36 * local264 >> 16;
				destGreen[local259] = local36 * local266 >> 16;
				destBlue[local259] = local268 * local36 >> 16;
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.radiusX = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.radiusY = buffer.readUnsignedByte();
		} else if (code == 2) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(19) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(33) int windowY = this.radiusY + this.radiusY + 1;
			@Pc(37) int windowYReciprocal = 65536 / windowY;
			@Pc(45) int windowX = this.radiusX + this.radiusX + 1;
			@Pc(49) int windowXReciprocal = 65536 / windowX;
			@Pc(52) int[][] horizontalAverages = new int[windowY][];
			for (@Pc(58) int y0 = y - this.radiusY; y0 <= y + this.radiusY; y0++) {
				@Pc(75) int[] src = this.getChildMonochromeOutput(0, Texture.heightMask & y0);
				@Pc(78) int[] horizontalAverage = new int[Texture.width];
				@Pc(80) int horizontalSum = 0;
				for (@Pc(84) int x0 = -this.radiusX; x0 <= this.radiusX; x0++) {
					horizontalSum += src[x0 & Texture.widthMask];
				}
				@Pc(105) int x0 = 0;
				while (x0 < Texture.width) {
					horizontalAverage[x0] = horizontalSum * windowXReciprocal >> 16;
					@Pc(128) int local128 = horizontalSum - src[(x0 - this.radiusX) & Texture.widthMask];
					x0++;
					horizontalSum = local128 + src[Texture.widthMask & (x0 + this.radiusX)];
				}
				horizontalAverages[y0 + this.radiusY - y] = horizontalAverage;
			}
			for (@Pc(158) int x0 = 0; x0 < Texture.width; x0++) {
				@Pc(167) int verticalSum = 0;
				for (@Pc(169) int y0 = 0; y0 < windowY; y0++) {
					verticalSum += horizontalAverages[y0][x0];
				}
				dest[x0] = verticalSum * windowYReciprocal >> 16;
			}
		}
		return dest;
	}
}

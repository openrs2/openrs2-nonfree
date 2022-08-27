import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class TextureOpInterpolate extends TextureOp {

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public TextureOpInterpolate() {
		super(3, false);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(26) int[] src0 = this.getChildMonochromeOutput(0, y);
			@Pc(32) int[] src1 = this.getChildMonochromeOutput(1, y);
			@Pc(38) int[] src2 = this.getChildMonochromeOutput(2, y);
			for (@Pc(40) int x = 0; x < Texture.width; x++) {
				@Pc(47) int alpha = src2[x];
				if (alpha == 4096) {
					dest[x] = src0[x];
				} else if (alpha == 0) {
					dest[x] = src1[x];
				} else {
					dest[x] = alpha * src0[x] + src1[x] * (4096 - alpha) >> 12;
				}
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(16) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(29) int[] src2 = this.getChildMonochromeOutput(2, y);
			@Pc(35) int[][] src0 = this.getChildColorOutput(0, y);
			@Pc(41) int[][] src1 = this.getChildColorOutput(1, y);
			@Pc(45) int[] destRed = dest[0];
			@Pc(49) int[] destGreen = dest[1];
			@Pc(53) int[] destBlue = dest[2];
			@Pc(57) int[] src0Green = src0[1];
			@Pc(61) int[] src0Red = src0[0];
			@Pc(65) int[] src1Green = src1[1];
			@Pc(69) int[] src1Red = src1[0];
			@Pc(73) int[] src0Blue = src0[2];
			@Pc(77) int[] src1Blue = src1[2];
			for (@Pc(79) int x = 0; x < Texture.width; x++) {
				@Pc(86) int alpha = src2[x];
				if (alpha == 4096) {
					destRed[x] = src0Red[x];
					destGreen[x] = src0Green[x];
					destBlue[x] = src0Blue[x];
				} else if (alpha == 0) {
					destRed[x] = src1Red[x];
					destGreen[x] = src1Green[x];
					destBlue[x] = src1Blue[x];
				} else {
					@Pc(141) int local141 = 4096 - alpha;
					destRed[x] = src1Red[x] * local141 + src0Red[x] * alpha >> 12;
					destGreen[x] = src1Green[x] * local141 + alpha * src0Green[x] >> 12;
					destBlue[x] = src0Blue[x] * alpha + local141 * src1Blue[x] >> 12;
				}
			}
		}
		return dest;
	}
}

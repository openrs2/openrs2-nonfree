import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class TextureOpPolarDistortion extends TextureOp {

	@OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
	private int magnitude = 32768;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public TextureOpPolarDistortion() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V")
	@Override
	public void postDecode() {
		TextureOp.createTrigonometryTables();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(13) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(23) int[] src1 = this.getChildMonochromeOutput(1, y);
			@Pc(29) int[] src2 = this.getChildMonochromeOutput(2, y);
			for (@Pc(31) int x = 0; x < Texture.width; x++) {
				@Pc(46) int angle = src1[x] >> 4 & 0xFF;
				@Pc(55) int magnitude = this.magnitude * src2[x] >> 12;
				@Pc(63) int y0 = magnitude * TextureOp.SINE[angle] >> 12;
				@Pc(71) int y1 = Texture.heightMask & y + (y0 >> 12);
				@Pc(79) int x0 = magnitude * TextureOp.COSINE[angle] >> 12;
				@Pc(87) int x1 = Texture.widthMask & x + (x0 >> 12);
				@Pc(93) int[] src0 = this.getChildMonochromeOutput(0, y1);
				dest[x] = src0[x1];
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.magnitude = buffer.readUnsignedShort() << 4;
		} else if (code == 1) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(7) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(17) int[] src1 = this.getChildMonochromeOutput(1, y);
			@Pc(23) int[] src2 = this.getChildMonochromeOutput(2, y);
			@Pc(27) int[] destRed = dest[0];
			@Pc(31) int[] destGreen = dest[1];
			@Pc(35) int[] destBlue = dest[2];
			for (@Pc(37) int x = 0; x < Texture.width; x++) {
				@Pc(53) int magnitude = (src2[x] * this.magnitude) >> 12;
				@Pc(63) int angle = ((src1[x] * 255) >> 12) & 0xFF;
				@Pc(71) int y0 = (magnitude * TextureOp.SINE[angle]) >> 12;
				@Pc(79) int x0 = (magnitude * TextureOp.COSINE[angle]) >> 12;
				@Pc(87) int x1 = ((x0 >> 12) + x) & Texture.widthMask;
				@Pc(95) int y1 = ((y0 >> 12) + y) & Texture.heightMask;
				@Pc(101) int[][] src0 = this.getChildColorOutput(0, y1);
				destRed[x] = src0[0][x1];
				destGreen[x] = src0[1][x1];
				destBlue[x] = src0[2][x1];
			}
		}
		return dest;
	}
}

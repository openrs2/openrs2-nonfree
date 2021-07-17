import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class TextureOp19 extends TextureOp {

	@OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
	private int anInt4154 = 32768;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public TextureOp19() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V")
	@Override
	public final void postDecode() {
		TextureOp.createTrigonometryTables();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(13) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(23) int[] src1 = this.getChildMonochromeOutput(1, y);
			@Pc(29) int[] src2 = this.getChildMonochromeOutput(2, y);
			for (@Pc(31) int x = 0; x < Texture.width; x++) {
				@Pc(46) int local46 = src1[x] >> 4 & 0xFF;
				@Pc(55) int local55 = this.anInt4154 * src2[x] >> 12;
				@Pc(63) int local63 = local55 * TextureOp.SINE[local46] >> 12;
				@Pc(71) int local71 = Texture.heightMask & y + (local63 >> 12);
				@Pc(79) int local79 = local55 * TextureOp.COSINE[local46] >> 12;
				@Pc(87) int local87 = Texture.widthMask & x + (local79 >> 12);
				@Pc(93) int[] src0 = this.getChildMonochromeOutput(0, local71);
				dest[x] = src0[local87];
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt4154 = buffer.readUnsignedShort() << 4;
		} else if (code == 1) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(7) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(17) int[] src1 = this.getChildMonochromeOutput(1, y);
			@Pc(23) int[] src2 = this.getChildMonochromeOutput(2, y);
			@Pc(27) int[] local27 = dest[0];
			@Pc(31) int[] local31 = dest[1];
			@Pc(35) int[] local35 = dest[2];
			for (@Pc(37) int x = 0; x < Texture.width; x++) {
				@Pc(53) int local53 = src2[x] * this.anInt4154 >> 12;
				@Pc(63) int angle = src1[x] * 255 >> 12 & 0xFF;
				@Pc(71) int local71 = local53 * TextureOp.SINE[angle] >> 12;
				@Pc(79) int local79 = local53 * TextureOp.COSINE[angle] >> 12;
				@Pc(87) int local87 = Texture.widthMask & (local79 >> 12) + x;
				@Pc(95) int local95 = (local71 >> 12) + y & Texture.heightMask;
				@Pc(101) int[][] src0 = this.getChildColorOutput(0, local95);
				local27[x] = src0[0][local87];
				local31[x] = src0[1][local87];
				local35[x] = src0[2][local87];
			}
		}
		return dest;
	}
}

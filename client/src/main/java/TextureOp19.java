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
		Static37.method4645();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(13) int[] local13 = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(23) int[] local23 = this.method4699(y, 1);
			@Pc(29) int[] local29 = this.method4699(y, 2);
			for (@Pc(31) int local31 = 0; local31 < Texture.width; local31++) {
				@Pc(46) int local46 = local23[local31] >> 4 & 0xFF;
				@Pc(55) int local55 = this.anInt4154 * local29[local31] >> 12;
				@Pc(63) int local63 = local55 * Static3.anIntArray223[local46] >> 12;
				@Pc(71) int local71 = Texture.heightMask & y + (local63 >> 12);
				@Pc(79) int local79 = local55 * Static3.anIntArray222[local46] >> 12;
				@Pc(87) int local87 = Texture.widthMask & local31 + (local79 >> 12);
				@Pc(93) int[] local93 = this.method4699(local71, 0);
				local13[local31] = local93[local87];
			}
		}
		return local13;
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
		@Pc(7) int[][] local7 = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(17) int[] local17 = this.method4699(y, 1);
			@Pc(23) int[] local23 = this.method4699(y, 2);
			@Pc(27) int[] local27 = local7[0];
			@Pc(31) int[] local31 = local7[1];
			@Pc(35) int[] local35 = local7[2];
			for (@Pc(37) int local37 = 0; local37 < Texture.width; local37++) {
				@Pc(53) int local53 = local23[local37] * this.anInt4154 >> 12;
				@Pc(63) int local63 = local17[local37] * 255 >> 12 & 0xFF;
				@Pc(71) int local71 = local53 * Static3.anIntArray223[local63] >> 12;
				@Pc(79) int local79 = Static3.anIntArray222[local63] * local53 >> 12;
				@Pc(87) int local87 = Texture.widthMask & (local79 >> 12) + local37;
				@Pc(95) int local95 = (local71 >> 12) + y & Texture.heightMask;
				@Pc(101) int[][] local101 = this.method4686(0, local95);
				local27[local37] = local101[0][local87];
				local31[local37] = local101[1][local87];
				local35[local37] = local101[2][local87];
			}
		}
		return local7;
	}
}

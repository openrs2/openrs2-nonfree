import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class TextureOp35 extends TextureOp {

	@OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
	private int anInt4832 = 4096;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public TextureOp35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] local16 = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(30) int[] local30 = this.method4699(y - 1 & Texture.heightMask, 0);
			@Pc(36) int[] local36 = this.method4699(y, 0);
			@Pc(46) int[] local46 = this.method4699(y + 1 & Texture.heightMask, 0);
			for (@Pc(48) int local48 = 0; local48 < Texture.width; local48++) {
				@Pc(63) int local63 = this.anInt4832 * (local46[local48] - local30[local48]);
				@Pc(83) int local83 = this.anInt4832 * (local36[Texture.widthMask & local48 + 1] - local36[Texture.widthMask & local48 - 1]);
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local91 * local91 >> 12;
				@Pc(103) int local103 = local87 * local87 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local16[local48] = 4096 - local128;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt4832 = buffer.readUnsignedShort();
		}
	}
}

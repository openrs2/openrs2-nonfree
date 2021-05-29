import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class TextureOp22 extends TextureOp {

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public TextureOp22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(24) int[] local24 = this.method4699(y, 0);
			for (@Pc(26) int local26 = 0; local26 < Texture.width; local26++) {
				local11[local26] = 4096 - local24[local26];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(13) int[][] local13 = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(23) int[][] local23 = this.method4686(0, y);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[2];
			@Pc(35) int[] local35 = local13[0];
			@Pc(39) int[] local39 = local23[1];
			@Pc(43) int[] local43 = local13[1];
			@Pc(47) int[] local47 = local13[2];
			for (@Pc(49) int local49 = 0; local49 < Texture.width; local49++) {
				local35[local49] = 4096 - local27[local49];
				local43[local49] = 4096 - local39[local49];
				local47[local49] = 4096 - local31[local49];
			}
		}
		return local13;
	}
}

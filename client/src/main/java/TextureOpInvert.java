import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class TextureOpInvert extends TextureOp {

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public TextureOpInvert() {
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
		@Pc(11) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(24) int[] src = this.getChildMonochromeOutput(0, y);
			for (@Pc(26) int x = 0; x < Texture.width; x++) {
				dest[x] = 4096 - src[x];
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(13) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(23) int[][] src = this.getChildColorOutput(0, y);
			@Pc(27) int[] srcRed = src[0];
			@Pc(31) int[] srcBlue = src[2];
			@Pc(35) int[] destRed = dest[0];
			@Pc(39) int[] srcGreen = src[1];
			@Pc(43) int[] destGreen = dest[1];
			@Pc(47) int[] destBlue = dest[2];
			for (@Pc(49) int x = 0; x < Texture.width; x++) {
				destRed[x] = 4096 - srcRed[x];
				destGreen[x] = 4096 - srcGreen[x];
				destBlue[x] = 4096 - srcBlue[x];
			}
		}
		return dest;
	}
}

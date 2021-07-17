import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class TextureOpMonochrome extends TextureOp {

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public TextureOpMonochrome() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(7) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(18) int[][] src = this.getChildColorOutput(0, y);
			@Pc(22) int[] srcBlue = src[2];
			@Pc(26) int[] srcGreen = src[1];
			@Pc(30) int[] srcRed = src[0];
			for (@Pc(32) int x = 0; x < Texture.width; x++) {
				dest[x] = (srcGreen[x] + srcRed[x] + srcBlue[x]) / 3;
			}
		}
		return dest;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class TextureOpVerticalGradient extends TextureOp {

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public TextureOpVerticalGradient() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(15) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			ArrayUtils.fill(dest, 0, Texture.width, Texture.normalisedY[y]);
		}
		return dest;
	}
}

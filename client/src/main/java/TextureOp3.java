import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class TextureOp3 extends TextureOp {

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public TextureOp3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(15) int[] local15 = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			ArrayUtils.fill(local15, 0, Texture.width, Texture.heightFractions[y]);
		}
		return local15;
	}
}

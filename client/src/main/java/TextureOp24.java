import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class TextureOp24 extends TextureOp {

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public TextureOp24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(7) int[] local7 = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(18) int[][] local18 = this.method4686(0, y);
			@Pc(22) int[] local22 = local18[2];
			@Pc(26) int[] local26 = local18[1];
			@Pc(30) int[] local30 = local18[0];
			for (@Pc(32) int local32 = 0; local32 < Texture.width; local32++) {
				local7[local32] = (local26[local32] + local30[local32] + local22[local32]) / 3;
			}
		}
		return local7;
	}
}

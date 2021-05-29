import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class TextureOp18 extends TextureOp39 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(17) int[][] local17 = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid && this.method4702()) {
			@Pc(30) int[] local30 = local17[1];
			@Pc(34) int[] local34 = local17[2];
			@Pc(42) int local42 = this.anInt5834 * (y % this.anInt5834);
			@Pc(46) int[] local46 = local17[0];
			for (@Pc(48) int local48 = 0; local48 < Texture.width; local48++) {
				@Pc(66) int local66 = this.anIntArray655[local42 + local48 % this.anInt5843];
				local34[local48] = (local66 & 0xFF) << 4;
				local30[local48] = local66 >> 4 & 0xFF0;
				local46[local48] = local66 >> 12 & 0xFF0;
			}
		}
		return local17;
	}
}

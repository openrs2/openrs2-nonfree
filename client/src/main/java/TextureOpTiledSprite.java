import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class TextureOpTiledSprite extends TextureOpSprite {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(17) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid && this.loadSprite()) {
			@Pc(30) int[] destGreen = dest[1];
			@Pc(34) int[] destBlue = dest[2];
			@Pc(42) int srcY = this.height * (y % this.height);
			@Pc(46) int[] destRed = dest[0];
			for (@Pc(48) int x = 0; x < Texture.width; x++) {
				@Pc(66) int color = this.pixels[srcY + x % this.width];
				destBlue[x] = (color & 0xFF) << 4;
				destGreen[x] = color >> 4 & 0xFF0;
				destRed[x] = color >> 12 & 0xFF0;
			}
		}
		return dest;
	}
}

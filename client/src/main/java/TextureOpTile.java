import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class TextureOpTile extends TextureOp {

	@OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
	private int horizontalTiles = 4;

	@OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
	private int verticalTiles = 4;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public TextureOpTile() {
		super(1, false);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.horizontalTiles = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.verticalTiles = buffer.readUnsignedByte();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(19) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(29) int tileWidth = Texture.width / this.horizontalTiles;
			@Pc(34) int tileHeight = Texture.height / this.verticalTiles;
			@Pc(53) int[] src;
			if (tileHeight > 0) {
				@Pc(43) int srcY = y % tileHeight;
				src = this.getChildMonochromeOutput(0, Texture.height * srcY / tileHeight);
			} else {
				src = this.getChildMonochromeOutput(0, 0);
			}
			for (@Pc(63) int x = 0; x < Texture.width; x++) {
				if (tileWidth > 0) {
					@Pc(73) int srcX = x % tileWidth;
					dest[x] = src[srcX * Texture.width / tileWidth];
				} else {
					dest[x] = src[0];
				}
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(20) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(29) int tileWidth = Texture.width / this.horizontalTiles;
			@Pc(34) int tileHeight = Texture.height / this.verticalTiles;
			@Pc(53) int[][] src;
			if (tileHeight > 0) {
				@Pc(43) int srcY = y % tileHeight;
				src = this.getChildColorOutput(0, srcY * Texture.height / tileHeight);
			} else {
				src = this.getChildColorOutput(0, 0);
			}
			@Pc(65) int[] srcRed = src[0];
			@Pc(69) int[] srcGreen = src[1];
			@Pc(73) int[] srcBlue = src[2];
			@Pc(77) int[] destRed = dest[0];
			@Pc(81) int[] destGreen = dest[1];
			@Pc(85) int[] destBlue = dest[2];
			for (@Pc(87) int x = 0; x < Texture.width; x++) {
				@Pc(101) int index;
				if (tileWidth <= 0) {
					index = 0;
				} else {
					@Pc(107) int srcX = x % tileWidth;
					index = Texture.width * srcX / tileWidth;
				}
				destRed[x] = srcRed[index];
				destGreen[x] = srcGreen[index];
				destBlue[x] = srcBlue[index];
			}
		}
		return dest;
	}
}

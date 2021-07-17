import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class TextureOpFlip extends TextureOp {

	@OriginalMember(owner = "client!fj", name = "T", descriptor = "Z")
	private boolean flipVertical = true;

	@OriginalMember(owner = "client!fj", name = "bb", descriptor = "Z")
	private boolean flipHorizontal = true;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public TextureOpFlip() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(15) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(34) int[] src = this.getChildMonochromeOutput(0, this.flipVertical ? Texture.heightMask - y : y);
			if (this.flipHorizontal) {
				for (@Pc(47) int x = 0; x < Texture.width; x++) {
					dest[x] = src[Texture.widthMask - x];
				}
			} else {
				ArrayUtils.copy(src, 0, dest, 0, Texture.width);
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.flipHorizontal = buffer.readUnsignedByte() == 1;
		} else if (code == 1) {
			this.flipVertical = buffer.readUnsignedByte() == 1;
		} else if (code == 2) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(18) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(36) int[][] src = this.getChildColorOutput(0, this.flipVertical ? Texture.heightMask - y : y);
			@Pc(40) int[] srcRed = src[0];
			@Pc(44) int[] srcGreen = src[1];
			@Pc(48) int[] destRed = dest[0];
			@Pc(52) int[] srcBlue = src[2];
			@Pc(56) int[] destGreen = dest[1];
			@Pc(60) int[] destBlue = dest[2];
			if (this.flipHorizontal) {
				for (@Pc(65) int x = 0; x < Texture.width; x++) {
					destRed[x] = srcRed[Texture.widthMask - x];
					destGreen[x] = srcGreen[Texture.widthMask - x];
					destBlue[x] = srcBlue[Texture.widthMask - x];
				}
			} else {
				for (@Pc(101) int x = 0; x < Texture.width; x++) {
					destRed[x] = srcRed[x];
					destGreen[x] = srcGreen[x];
					destBlue[x] = srcBlue[x];
				}
			}
		}
		return dest;
	}
}

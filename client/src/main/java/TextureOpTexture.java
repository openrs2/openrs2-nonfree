import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class TextureOpTexture extends TextureOp {

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
	private int width;

	@OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
	private int height;

	@OriginalMember(owner = "client!fi", name = "fb", descriptor = "[I")
	private int[] pixels;

	@OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
	private int textureId = -1;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public TextureOpTexture() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(11) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid && this.loadTexture()) {
			@Pc(39) int index = this.width * (Texture.height == this.height ? y : y * this.height / Texture.height);
			@Pc(43) int[] destRed = dest[0];
			@Pc(47) int[] destBlue = dest[2];
			@Pc(51) int[] destGreen = dest[1];
			if (this.width == Texture.width) {
				for (@Pc(61) int x = 0; x < Texture.width; x++) {
					@Pc(74) int color = this.pixels[index++];
					destBlue[x] = (color & 0xFF) << 4;
					destGreen[x] = color >> 4 & 0xFF0;
					destRed[x] = color >> 12 & 0xFF0;
				}
			} else {
				for (@Pc(105) int x = 0; x < Texture.width; x++) {
					@Pc(115) int srcX = this.width * x / Texture.width;
					@Pc(122) int color = this.pixels[srcX + index];
					destBlue[x] = (color & 0xFF) << 4;
					destGreen[x] = color >> 4 & 0xFF0;
					destRed[x] = color >> 12 & 0xFF0;
				}
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)Z")
	private boolean loadTexture() {
		if (this.pixels != null) {
			return true;
		} else if (this.textureId >= 0) {
			@Pc(21) int prevHeight = Texture.height;
			@Pc(23) int prevWidth = Texture.width;
			@Pc(34) int size = Texture.provider.getMaterial(this.textureId).lowDetail ? 64 : 128;
			this.pixels = Texture.provider.getPixels(this.textureId, size, size, 1.0F);
			this.height = size;
			this.width = size;
			Texture.setSize(prevWidth, prevHeight);
			return this.pixels != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.textureId = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
	@Override
	public final void clearImageCache() {
		super.clearImageCache();
		this.pixels = null;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)I")
	@Override
	public final int getTextureId() {
		return this.textureId;
	}
}

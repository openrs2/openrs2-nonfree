import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public class TextureOpSprite extends TextureOp {

	@OriginalMember(owner = "client!og", name = "T", descriptor = "I")
	protected int height;

	@OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
	protected int width;

	@OriginalMember(owner = "client!og", name = "jb", descriptor = "[I")
	protected int[] pixels;

	@OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
	private int spriteId = -1;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public TextureOpSprite() {
		super(0, false);
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)Z")
	protected final boolean loadSprite() {
		if (this.pixels != null) {
			return true;
		} else if (this.spriteId >= 0) {
			@Pc(38) SoftwareSprite sprite = Texture.spriteGroupId < 0 ? SpriteLoader.loadSoftwareSpriteAutoDetect(Texture.spritesArchive, this.spriteId) : SpriteLoader.loadSoftwareSprite(Texture.spritesArchive, Texture.spriteGroupId, this.spriteId);
			sprite.trim();
			this.pixels = sprite.pixels;
			this.width = sprite.width;
			this.height = sprite.height;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.spriteId = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
	@Override
	public final void clearImageCache() {
		super.clearImageCache();
		this.pixels = null;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)I")
	@Override
	public final int getSpriteId() {
		return this.spriteId;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(16) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid && this.loadSprite()) {
			@Pc(32) int[] destRed = dest[0];
			@Pc(36) int[] destGreen = dest[1];
			@Pc(40) int[] destBlue = dest[2];
			@Pc(60) int index = (Texture.height == this.height ? y : y * this.height / Texture.height) * this.width;
			if (this.width == Texture.width) {
				for (@Pc(70) int x = 0; x < Texture.width; x++) {
					@Pc(79) int color = this.pixels[index++];
					destBlue[x] = (color & 0xFF) << 4;
					destGreen[x] = color >> 4 & 0xFF0;
					destRed[x] = color >> 12 & 0xFF0;
				}
			} else {
				for (@Pc(110) int x = 0; x < Texture.width; x++) {
					@Pc(120) int srcX = this.width * x / Texture.width;
					@Pc(127) int color = this.pixels[srcX + index];
					destBlue[x] = (color & 0xFF) << 4;
					destGreen[x] = color >> 4 & 0xFF0;
					destRed[x] = color >> 12 & 0xFF0;
				}
			}
		}
		return dest;
	}
}

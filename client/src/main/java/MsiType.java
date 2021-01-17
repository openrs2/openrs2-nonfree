import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class MsiType {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
	public int anInt4306;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	public int spriteId;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Z")
	public boolean aBoolean303 = false;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!fd;II)V")
	private void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int id, @OriginalArg(3) int code) {
		if (code == 1) {
			this.spriteId = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.anInt4306 = buffer.readUnsignedMedium();
		} else if (code == 3) {
			this.aBoolean303 = true;
		} else if (code == 4) {
			this.spriteId = -1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZLclient!fd;)V")
	public final void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(0) int id) {
		while (true) {
			@Pc(9) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, id, code);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZI)Lclient!fe;")
	public final SoftwareIndexedSprite getSprite(@OriginalArg(1) boolean flipVertical, @OriginalArg(2) int angle) {
		@Pc(23) SoftwareIndexedSprite sprite = (SoftwareIndexedSprite) MsiTypeList.sprites.get(angle << 16 | this.spriteId | (flipVertical ? 0x40000 : 0));
		if (sprite != null) {
			return sprite;
		}
		MsiTypeList.spritesArchive.isFileReady(this.spriteId);
		@Pc(44) SoftwareIndexedSprite newSprite = SpriteLoader.loadSoftwareIndexedSprite(MsiTypeList.spritesArchive, this.spriteId);
		if (newSprite != null) {
			newSprite.adjustPalette(MsiTypeList.redDelta, MsiTypeList.greenDelta, MsiTypeList.blueDelta);
			newSprite.innerWidth = newSprite.width;
			newSprite.innerHeight = newSprite.height;
			if (flipVertical) {
				newSprite.flipVertical();
			}
			for (@Pc(66) int i = 0; i < angle; i++) {
				newSprite.rotateClockwise();
			}
			MsiTypeList.sprites.put(this.spriteId | angle << 16 | (flipVertical ? 0x40000 : 0), newSprite);
		}
		return newSprite;
	}
}

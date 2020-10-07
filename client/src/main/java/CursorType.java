import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class CursorType {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public int hotSpotY;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	private int spriteId;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public int hotSpotX;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILclient!fd;)V")
	public final void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(1) int id) {
		while (true) {
			@Pc(5) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, id, code);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!fd;II)V")
	private void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(3) int id, @OriginalArg(2) int code) {
		if (code == 1) {
			this.spriteId = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.hotSpotX = buffer.readUnsignedByte();
			this.hotSpotY = buffer.readUnsignedByte();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Lclient!vn;")
	public final SoftwareSprite getSprite() {
		@Pc(17) SoftwareSprite sprite = (SoftwareSprite) CursorTypeList.sprites.get(this.spriteId);
		if (sprite != null) {
			return sprite;
		}
		@Pc(30) SoftwareSprite newSprite = Static31.method3691(CursorTypeList.spritesArchive, this.spriteId);
		if (newSprite != null) {
			CursorTypeList.sprites.put(this.spriteId, newSprite);
		}
		return newSprite;
	}
}

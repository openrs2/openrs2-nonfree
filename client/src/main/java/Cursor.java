import java.awt.Point;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Cursor {
	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	private static int currentId = -1;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)V")
	public static void setCursor(@OriginalArg(0) int id) {
		if (!Preferences.customCursors) {
			id = -1;
		}
		if (currentId == id) {
			return;
		}
		if (id != -1) {
			@Pc(23) CursorType type = CursorTypeList.get(id);
			@Pc(27) SoftwareSprite sprite = type.getSprite();
			if (sprite == null) {
				id = -1;
			} else {
				GameShell.signLink.setCursor(GameShell.canvas, sprite.innerWidth, sprite.innerHeight, sprite.getPixels(), new Point(type.hotSpotX, type.hotSpotY));
				currentId = id;
			}
		}
		if (id == -1 && currentId != -1) {
			GameShell.signLink.setCursor(GameShell.canvas, -1, -1, null, new Point());
			currentId = -1;
		}
	}
}

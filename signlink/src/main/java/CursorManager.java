import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!e")
public final class CursorManager {

	@OriginalMember(owner = "signlink!e", name = "b", descriptor = "Ljava/awt/Component;")
	private Component component;

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot robot = new Robot();

	@OriginalMember(owner = "signlink!e", name = "<init>", descriptor = "()V")
	public CursorManager() throws Exception {
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(IZLjava/awt/Component;)V")
	public final void setComponent(@OriginalArg(2) Component component, @OriginalArg(1) boolean reset) {
		if (reset) {
			component = null;
		} else if (component == null) {
			throw new NullPointerException();
		}
		if (this.component == component) {
			return;
		}
		if (this.component != null) {
			this.component.setCursor(null);
			this.component = null;
		}
		if (component != null) {
			component.setCursor(component.getToolkit().createCustomCursor(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB), new Point(0, 0), null));
			this.component = component;
		}
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(IILjava/awt/Point;[ILjava/awt/Component;B)V")
	public final void setCursor(@OriginalArg(4) Component component, @OriginalArg(0) int width, @OriginalArg(1) int height, @OriginalArg(3) int[] pixels, @OriginalArg(2) Point hotSpot) {
		if (pixels == null) {
			component.setCursor(null);
		} else {
			@Pc(17) BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			image.setRGB(0, 0, width, height, pixels, 0, width);
			component.setCursor(component.getToolkit().createCustomCursor(image, hotSpot, null));
		}
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(III)V")
	public final void setPosition(@OriginalArg(2) int x, @OriginalArg(0) int y) {
		this.robot.mouseMove(x, y);
	}
}

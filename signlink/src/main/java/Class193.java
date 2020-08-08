import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!e")
public final class Class193 {

	@OriginalMember(owner = "signlink!e", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "signlink!e", name = "<init>", descriptor = "()V")
	public Class193() throws Exception {
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(IZLjava/awt/Component;)V")
	public final void method4846(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (arg1 == this.aComponent3) {
			return;
		}
		if (this.aComponent3 != null) {
			this.aComponent3.setCursor(null);
			this.aComponent3 = null;
		}
		if (arg1 != null) {
			arg1.setCursor(arg1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent3 = arg1;
		}
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(IILjava/awt/Point;[ILjava/awt/Component;B)V")
	public final void method4847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Component arg4) {
		if (arg3 == null) {
			arg4.setCursor(null);
		} else {
			@Pc(17) BufferedImage local17 = new BufferedImage(arg0, arg1, 2);
			local17.setRGB(0, 0, arg0, arg1, arg3, 0, arg0);
			arg4.setCursor(arg4.getToolkit().createCustomCursor(local17, arg2, null));
		}
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(III)V")
	public final void method4848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aRobot1.mouseMove(arg1, arg0);
	}
}

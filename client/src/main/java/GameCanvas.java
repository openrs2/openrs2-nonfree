import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class GameCanvas extends Canvas {

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "Ljava/awt/Component;")
	private final Component component;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public GameCanvas(@OriginalArg(0) Component component) {
		this.component = component;
	}

	@OriginalMember(owner = "client!ql", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics graphics) {
		this.component.paint(graphics);
	}

	@OriginalMember(owner = "client!ql", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics graphics) {
		this.component.update(graphics);
	}
}

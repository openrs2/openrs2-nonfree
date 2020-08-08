import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Canvas_Sub2 extends Canvas {

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "Ljava/awt/Component;")
	private final Component aComponent2;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Canvas_Sub2(@OriginalArg(0) Component arg0) {
		this.aComponent2 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent2.paint(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent2.update(arg0);
	}
}

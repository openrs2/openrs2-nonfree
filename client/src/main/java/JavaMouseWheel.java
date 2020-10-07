import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class JavaMouseWheel extends MouseWheel implements MouseWheelListener {

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
	private int wheelRotation = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)I")
	@Override
	public final synchronized int getWheelRotation() {
		@Pc(10) int wheelRotation = this.wheelRotation;
		this.wheelRotation = 0;
		return wheelRotation;
	}

	@OriginalMember(owner = "client!dk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public final synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent event) {
		this.wheelRotation += event.getWheelRotation();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public final void stop(@OriginalArg(0) Component component) {
		component.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public final void start(@OriginalArg(0) Component component) {
		component.addMouseWheelListener(this);
	}
}

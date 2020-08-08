import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class19_Sub1 extends Class19 implements MouseWheelListener {

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
	private int anInt1054 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)I")
	@Override
	public final synchronized int method899() {
		@Pc(10) int local10 = this.anInt1054;
		this.anInt1054 = 0;
		return local10;
	}

	@OriginalMember(owner = "client!dk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public final synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt1054 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	@Override
	public final void method894(@OriginalArg(0) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	@Override
	public final void method900(@OriginalArg(0) Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}

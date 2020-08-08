import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class124 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!nf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static2.aClass124_1 != null) {
			Static5.anInt4214 = 0;
			Static6.anInt4977 = arg0.getX();
			Static6.anInt4556 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!nf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!nf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static2.aClass124_1 != null) {
			Static5.anInt4214 = 0;
			Static6.anInt4977 = -1;
			Static6.anInt4556 = -1;
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static2.aClass124_1 != null) {
			Static5.anInt4214 = 0;
			Static2.anInt1306 = 0;
			@Pc(9) int local9 = arg0.getModifiers();
			if ((local9 & 0x8) != 0) {
			}
			if ((local9 & 0x4) != 0) {
			}
			if ((local9 & 0x10) != 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static2.aClass124_1 != null) {
			Static5.anInt4214 = 0;
			Static6.anInt4977 = arg0.getX();
			Static6.anInt4556 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!nf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static2.aClass124_1 != null) {
			Static2.anInt1306 = 0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static2.aClass124_1 != null) {
			Static5.anInt4214 = 0;
			Static7.anInt6049 = arg0.getX();
			Static3.anInt2426 = arg0.getY();
			Static7.aLong193 = Class194.method4849();
			if ((arg0.getModifiersEx() & MouseEvent.BUTTON3_DOWN_MASK) == 0) {
				Static7.anInt5679 = 1;
				Static2.anInt1306 = 1;
			} else {
				Static7.anInt5679 = 2;
				Static2.anInt1306 = 2;
			}
			@Pc(32) int local32 = arg0.getModifiers();
			if ((local32 & 0x10) == 0) {
			}
			if ((local32 & 0x8) != 0) {
			}
			if ((local32 & 0x4) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static2.aClass124_1 != null) {
			Static5.anInt4214 = 0;
			Static6.anInt4977 = arg0.getX();
			Static6.anInt4556 = arg0.getY();
		}
	}
}

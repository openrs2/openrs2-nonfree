import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Mouse implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "Lclient!nf;")
	private static Mouse instance = new Mouse();

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private static volatile int awtX = -1;

	@OriginalMember(owner = "client!rh", name = "lb", descriptor = "I")
	private static volatile int awtY = -1;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
	private static volatile int awtClickX = 0;

	@OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
	private static volatile int awtClickY = 0;

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "J")
	private static volatile long awtClickTime = 0L;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "I")
	private static volatile int awtClickButton = 0;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
	private static volatile int awtPressedButton = 0;

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
	public static volatile int idleLoops = 0;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "I")
	public static int pressedButton = 0;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public static int x = 0;

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
	public static int y = 0;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	public static int clickButton = 0;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
	public static int clickX = 0;

	@OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
	public static int clickY = 0;

	@OriginalMember(owner = "client!bl", name = "fb", descriptor = "J")
	public static long clickTime = 0L;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void start(@OriginalArg(1) Component component) {
		component.addMouseListener(instance);
		component.addMouseMotionListener(instance);
		component.addFocusListener(instance);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void stop(@OriginalArg(0) Component component) {
		component.removeMouseListener(instance);
		component.removeMouseMotionListener(instance);
		component.removeFocusListener(instance);
		awtPressedButton = 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void loop() {
		synchronized (instance) {
			idleLoops++;
			pressedButton = awtPressedButton;
			x = awtX;
			y = awtY;
			clickButton = awtClickButton;
			clickX = awtClickX;
			clickY = awtClickY;
			clickTime = awtClickTime;
			awtClickButton = 0;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void quit() {
		if (instance != null) {
			synchronized (instance) {
				instance = null;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(II)V")
	public static void setIdleLoops(@OriginalArg(1) int idleLoops) {
		synchronized (instance) {
			Mouse.idleLoops = idleLoops;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	public static int getIdleLoops() {
		return idleLoops;
	}

	@OriginalMember(owner = "client!nf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent event) {
		if (instance != null) {
			idleLoops = 0;
			awtX = event.getX();
			awtY = event.getY();
		}
	}

	@OriginalMember(owner = "client!nf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent event) {
	}

	@OriginalMember(owner = "client!nf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent event) {
		if (event.isPopupTrigger()) {
			event.consume();
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent event) {
		if (instance != null) {
			idleLoops = 0;
			awtX = -1;
			awtY = -1;
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent event) {
		if (instance != null) {
			idleLoops = 0;
			awtPressedButton = 0;
			@Pc(9) int modifiers = event.getModifiers();
			if ((modifiers & 0x8) != 0) {
			}
			if ((modifiers & 0x4) != 0) {
			}
			if ((modifiers & 0x10) != 0) {
			}
		}
		if (event.isPopupTrigger()) {
			event.consume();
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent event) {
		if (instance != null) {
			idleLoops = 0;
			awtX = event.getX();
			awtY = event.getY();
		}
	}

	@OriginalMember(owner = "client!nf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent event) {
		if (instance != null) {
			awtPressedButton = 0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent event) {
		if (instance != null) {
			idleLoops = 0;
			awtClickX = event.getX();
			awtClickY = event.getY();
			awtClickTime = MonotonicClock.currentTimeMillis();
			if ((event.getModifiersEx() & MouseEvent.BUTTON3_DOWN_MASK) == 0) {
				awtClickButton = 1;
				awtPressedButton = 1;
			} else {
				awtClickButton = 2;
				awtPressedButton = 2;
			}
			@Pc(32) int modifiers = event.getModifiers();
			if ((modifiers & 0x10) == 0) {
			}
			if ((modifiers & 0x8) != 0) {
			}
			if ((modifiers & 0x4) == 0) {
			}
		}
		if (event.isPopupTrigger()) {
			event.consume();
		}
	}

	@OriginalMember(owner = "client!nf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent event) {
		if (instance != null) {
			idleLoops = 0;
			awtX = event.getX();
			awtY = event.getY();
		}
	}
}

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Keyboard implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "[I")
	private static final int[] CODE_MAP = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fi", name = "V", descriptor = "[I")
	private static final int[] typedCodeQueue = new int[128];

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[C")
	private static final char[] typedCharQueue = new char[128];

	@OriginalMember(owner = "client!uc", name = "U", descriptor = "[I")
	private static final int[] eventQueue = new int[128];

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "[Z")
	public static final boolean[] pressedKeys = new boolean[112];

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!tb;")
	private static Keyboard instance = new Keyboard();

	@OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
	private static int eventQueueWriterIndex = 0;

	@OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
	private static int typedQueueWriterIndex = 0;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
	private static int typedQueueReaderIndex = 0;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
	private static volatile int idleLoops = 0;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	private static int eventQueueReaderIndex = 0;

	@OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
	private static int prevTypedQueueWriterIndex = 0;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	public static int keyCode;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "C")
	public static char keyChar;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
	public static void init() {
		if (SignLink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			CODE_MAP[188] = 71;
			CODE_MAP[223] = 28;
			CODE_MAP[219] = 42;
			CODE_MAP[192] = 58;
			CODE_MAP[221] = 43;
			CODE_MAP[190] = 72;
			CODE_MAP[189] = 26;
			CODE_MAP[222] = 59;
			CODE_MAP[186] = 57;
			CODE_MAP[220] = 74;
			CODE_MAP[187] = 27;
			CODE_MAP[191] = 73;
			return;
		}
		CODE_MAP[61] = 27;
		CODE_MAP[46] = 72;
		if (SignLink.setFocusTraversalKeysEnabled == null) {
			CODE_MAP[192] = 58;
			CODE_MAP[222] = 59;
		} else {
			CODE_MAP[520] = 59;
			CODE_MAP[192] = 28;
			CODE_MAP[222] = 58;
		}
		CODE_MAP[92] = 74;
		CODE_MAP[91] = 42;
		CODE_MAP[93] = 43;
		CODE_MAP[45] = 26;
		CODE_MAP[44] = 71;
		CODE_MAP[47] = 73;
		CODE_MAP[59] = 57;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void start(@OriginalArg(1) Component component) {
		@Pc(1) Method setFocusTraversalKeysEnabled = SignLink.setFocusTraversalKeysEnabled;
		if (setFocusTraversalKeysEnabled != null) {
			try {
				setFocusTraversalKeysEnabled.invoke(component, Boolean.FALSE);
			} catch (@Pc(20) Throwable ex) {
			}
		}
		component.addKeyListener(instance);
		component.addFocusListener(instance);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void stop(@OriginalArg(1) Component component) {
		component.removeKeyListener(instance);
		component.removeFocusListener(instance);
		eventQueueWriterIndex = -1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
	public static void quit() {
		if (instance != null) {
			synchronized (instance) {
				instance = null;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)I")
	public static int getIdleLoops() {
		return idleLoops;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void loop() {
		synchronized (instance) {
			typedQueueReaderIndex = prevTypedQueueWriterIndex;
			idleLoops++;
			if (eventQueueWriterIndex >= 0) {
				while (eventQueueWriterIndex != eventQueueReaderIndex) {
					@Pc(25) int event = eventQueue[eventQueueReaderIndex];
					eventQueueReaderIndex = eventQueueReaderIndex + 1 & 0x7F;
					if (event >= 0) {
						pressedKeys[event] = true;
					} else {
						pressedKeys[~event] = false;
					}
				}
			} else {
				for (@Pc(49) int i = 0; i < 112; i++) {
					pressedKeys[i] = false;
				}
				eventQueueWriterIndex = eventQueueReaderIndex;
			}
			prevTypedQueueWriterIndex = typedQueueWriterIndex;
		}
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(B)Z")
	public static boolean nextKey() {
		synchronized (instance) {
			if (prevTypedQueueWriterIndex == typedQueueReaderIndex) {
				return false;
			} else {
				keyCode = typedCodeQueue[typedQueueReaderIndex];
				keyChar = typedCharQueue[typedQueueReaderIndex];
				typedQueueReaderIndex = typedQueueReaderIndex + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final synchronized void focusLost(@OriginalArg(0) FocusEvent event) {
		if (instance != null) {
			eventQueueWriterIndex = -1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent event) {
		if (instance != null) {
			@Pc(9) char c = event.getKeyChar();
			if (c != '\u0000' && c != '\uffff' && Cp1252Charset.isCharValid(c)) {
				@Pc(27) int index = typedQueueWriterIndex + 1 & 0x7F;
				if (index != typedQueueReaderIndex) {
					typedCodeQueue[typedQueueWriterIndex] = -1;
					typedCharQueue[typedQueueWriterIndex] = c;
					typedQueueWriterIndex = index;
				}
			}
		}
		event.consume();
	}

	@OriginalMember(owner = "client!tb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent event) {
	}

	@OriginalMember(owner = "client!tb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final synchronized void keyPressed(@OriginalArg(0) KeyEvent event) {
		if (instance == null) {
			return;
		}
		idleLoops = 0;
		@Pc(7) int code = event.getKeyCode();
		@Pc(19) int code2;
		if (code >= 0 && code < CODE_MAP.length) {
			code2 = CODE_MAP[code];
			if ((code2 & 0x80) != 0) {
				code2 = -1;
			}
		} else {
			code2 = -1;
		}
		if (eventQueueWriterIndex >= 0 && code2 >= 0) {
			eventQueue[eventQueueWriterIndex] = code2;
			eventQueueWriterIndex = eventQueueWriterIndex + 1 & 0x7F;
			if (eventQueueWriterIndex == eventQueueReaderIndex) {
				eventQueueWriterIndex = -1;
			}
		}
		if (code2 >= 0) {
			@Pc(71) int index = typedQueueWriterIndex + 1 & 0x7F;
			if (index != typedQueueReaderIndex) {
				typedCodeQueue[typedQueueWriterIndex] = code2;
				typedCharQueue[typedQueueWriterIndex] = '\u0000';
				typedQueueWriterIndex = index;
			}
		}
		@Pc(87) int modifiers = event.getModifiers();
		if ((modifiers & 0xA) != 0 || code2 == 85 || code2 == 10) {
			event.consume();
		}
	}

	@OriginalMember(owner = "client!tb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final synchronized void keyReleased(@OriginalArg(0) KeyEvent event) {
		if (instance != null) {
			idleLoops = 0;
			@Pc(10) int code = event.getKeyCode();
			@Pc(25) int code2;
			if (code >= 0 && code < CODE_MAP.length) {
				code2 = CODE_MAP[code] & 0xFFFFFF7F;
			} else {
				code2 = -1;
			}
			if (eventQueueWriterIndex >= 0 && code2 >= 0) {
				eventQueue[eventQueueWriterIndex] = ~code2;
				eventQueueWriterIndex = eventQueueWriterIndex + 1 & 0x7F;
				if (eventQueueReaderIndex == eventQueueWriterIndex) {
					eventQueueWriterIndex = -1;
				}
			}
		}
		event.consume();
	}
}

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;
import jagex3.jagmisc.jagmisc;

@OriginalClass("client!ue")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "Z")
	public static boolean openWindowJavaScript;

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "Ljava/lang/Thread;")
	public static Thread thread;

	@OriginalMember(owner = "client!wd", name = "tb", descriptor = "Z")
	private static volatile boolean focusIn = true;

	@OriginalMember(owner = "client!rg", name = "bb", descriptor = "Z")
	public static volatile boolean fullRedraw = true;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "Z")
	public static volatile boolean replaceCanvas = false;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "J")
	private static volatile long lastCanvasReplace = 0L;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Z")
	public static boolean focus;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "Z")
	private static boolean isJava5OrLater = false;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "J")
	private static long killTime = 0L;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	private static boolean shutdown = false;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "Lsignlink!pm;")
	public static SignLink signLink;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "Ljava/awt/Frame;")
	public static Frame frame;

	@OriginalMember(owner = "client!fa", name = "fb", descriptor = "I")
	public static int frameWidth;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
	public static int frameHeight;

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "Ljava/awt/Frame;")
	public static Frame fullScreenFrame;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Ljava/awt/Canvas;")
	public static Canvas canvas;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public static int canvasWidth;

	@OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
	public static int canvasHeight;

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
	public static int leftMargin = 0;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
	public static int topMargin = 0;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!ue;")
	public static GameShell instance = null;

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "Z")
	private boolean miscNativesLoaded = false;

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "Z")
	private boolean error = false;

	@OriginalMember(owner = "client!ue", name = "providesignlink", descriptor = "(Lsignlink!pm;)V")
	public static void providesignlink(@OriginalArg(0) SignLink signLink) {
		GameShell.signLink = signLink;
		TracingException.signLink = signLink;
	}

	@OriginalMember(owner = "client!ue", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	protected abstract void mainLoop();

	@OriginalMember(owner = "client!ue", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (frame != null) {
			return null;
		} else if (signLink != null && signLink.applet != this) {
			return signLink.applet.getAppletContext();
		} else {
			return super.getAppletContext();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	private void mainLoopWrapper() {
		@Pc(6) long local6 = MonotonicClock.currentTimeMillis();
		@Pc(10) long local10 = Static6.aLongArray40[Static5.anInt5197];
		Static6.aLongArray40[Static5.anInt5197] = local6;
		if ((long) 0 != local10 && local10 < local6) {
		}
		Static5.anInt5197 = Static5.anInt5197 + 1 & 0x1F;
		synchronized (this) {
			focus = focusIn;
		}
		this.mainLoop();
	}

	@OriginalMember(owner = "client!ue", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (frame != null) {
			return null;
		} else if (signLink != null && signLink.applet != this) {
			return signLink.applet.getDocumentBase();
		} else {
			return super.getDocumentBase();
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent event) {
		focusIn = true;
		fullRedraw = true;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
	public final synchronized void addCanvas() {
		if (canvas != null) {
			canvas.removeFocusListener(this);
			canvas.getParent().remove(canvas);
		}
		@Pc(23) Container container;
		if (fullScreenFrame != null) {
			container = fullScreenFrame;
		} else if (frame != null) {
			container = frame;
		} else {
			container = signLink.applet;
		}
		container.setLayout(null);
		canvas = new GameCanvas(this);
		container.add(canvas);
		canvas.setSize(canvasWidth, canvasHeight);
		canvas.setVisible(true);
		if (container == frame) {
			@Pc(57) Insets insets = frame.getInsets();
			canvas.setLocation(insets.left + leftMargin, topMargin + insets.top);
		} else {
			canvas.setLocation(leftMargin, topMargin);
		}
		canvas.addFocusListener(this);
		canvas.requestFocus();
		focusIn = true;
		fullRedraw = true;
		replaceCanvas = false;
		focus = true;
		lastCanvasReplace = MonotonicClock.currentTimeMillis();
	}

	@OriginalMember(owner = "client!ue", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void error(@OriginalArg(1) String error) {
		if (this.error) {
			return;
		}
		this.error = true;
		System.out.println("error_game_" + error);
		try {
			BrowserControl.call(signLink.applet, "loggedout");
		} catch (@Pc(35) Throwable ex) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + error + ".ws"), "_top");
		} catch (@Pc(56) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!ue", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics graphics) {
		if (instance != this || shutdown) {
			return;
		}
		fullRedraw = true;
		if (isJava5OrLater && !Static3.aBoolean138 && MonotonicClock.currentTimeMillis() - lastCanvasReplace > 1000L) {
			@Pc(27) Rectangle clipBounds = graphics.getClipBounds();
			if (clipBounds == null || clipBounds.width >= frameWidth && clipBounds.height >= frameHeight) {
				replaceCanvas = true;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)Z")
	protected final boolean isHostnameValid() {
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	protected abstract void mainQuit();

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	protected abstract void reset();

	@OriginalMember(owner = "client!ue", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!ue", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (instance == this && !shutdown) {
			killTime = 0L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (frame != null) {
			return null;
		} else if (signLink != null && signLink.applet != this) {
			return signLink.applet.getCodeBase();
		} else {
			return super.getCodeBase();
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	private void mainRedrawWrapper() {
		@Pc(14) long local14 = MonotonicClock.currentTimeMillis();
		@Pc(18) long local18 = Static7.aLongArray8[Static4.anInt2832];
		Static7.aLongArray8[Static4.anInt2832] = local14;
		if (local18 != 0L && local14 > local18) {
			@Pc(42) int local42 = (int) (local14 - local18);
			Static3.anInt2295 = ((local42 >> 1) + 32000) / local42;
		}
		Static4.anInt2832 = Static4.anInt2832 + 1 & 0x1F;
		if (Static5.anInt3488++ > 50) {
			Static5.anInt3488 -= 50;
			fullRedraw = true;
			canvas.setSize(canvasWidth, canvasHeight);
			canvas.setVisible(true);
			if (frame != null && fullScreenFrame == null) {
				@Pc(86) Insets insets = frame.getInsets();
				canvas.setLocation(insets.left + leftMargin, topMargin + insets.top);
			} else {
				canvas.setLocation(leftMargin, topMargin);
			}
		}
		this.mainRedraw();
	}

	@OriginalMember(owner = "client!ue", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (instance == this && !shutdown) {
			killTime = MonotonicClock.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent event) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)V")
	private void shutdown(@OriginalArg(1) boolean clean) {
		synchronized (this) {
			if (shutdown) {
				return;
			}
			shutdown = true;
		}
		if (signLink.applet != null) {
			signLink.applet.destroy();
		}
		try {
			this.mainQuit();
		} catch (@Pc(43) Exception ex) {
		}
		if (this.miscNativesLoaded) {
			try {
				jagmisc.quit();
			} catch (@Pc(49) Throwable ex) {
			}
			this.miscNativesLoaded = false;
		}
		signLink.unloadNatives(instance.getClass());
		if (canvas != null) {
			try {
				canvas.removeFocusListener(this);
				canvas.getParent().remove(canvas);
			} catch (@Pc(70) Exception ex) {
			}
		}
		if (signLink != null) {
			try {
				signLink.stop();
			} catch (@Pc(77) Exception ex) {
			}
		}
		this.reset();
		if (frame != null) {
			try {
				System.exit(0);
			} catch (@Pc(87) Throwable ex) {
			}
		}
		System.out.println("Shutdown complete - clean:" + clean);
	}

	@OriginalMember(owner = "client!ue", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V")
	protected final void startApplet(@OriginalArg(1) int cacheId) {
		try {
			if (instance != null) {
				Static3.anInt2145++;
				if (Static3.anInt2145 < 3) {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
					return;
				}
				this.error("alreadyloaded");
				return;
			}
			leftMargin = 0;
			instance = this;
			topMargin = 0;
			canvasWidth = 765;
			frameWidth = 765;
			TracingException.clientVersion = 1550;
			canvasHeight = 503;
			frameHeight = 503;
			@Pc(50) String openWindowJavaScriptStr = this.getParameter("openwinjs");
			if (openWindowJavaScriptStr != null && openWindowJavaScriptStr.equals("1")) {
				openWindowJavaScript = true;
			} else {
				openWindowJavaScript = false;
			}
			if (signLink == null) {
				TracingException.signLink = signLink = new SignLink(this, cacheId, null, 0);
			}
			@Pc(80) PrivilegedRequest request = signLink.startThread(this, 1);
			while (request.status == 0) {
				ThreadUtils.sleep(10L);
			}
			thread = (Thread) request.result;
		} catch (@Pc(97) Exception ex) {
			TracingException.report(ex, null);
			this.error("crash");
		}
	}

	@OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (SignLink.javaVendor != null) {
				@Pc(10) String javaVendor = SignLink.javaVendor.toLowerCase();
				if (javaVendor.indexOf("sun") != -1 || javaVendor.indexOf("apple") != -1) {
					@Pc(22) String javaVersion = SignLink.javaVersion;
					if (javaVersion.equals("1.1") || javaVersion.startsWith("1.1.") || javaVersion.equals("1.2") || javaVersion.startsWith("1.2.")) {
						this.error("wrongjava");
						return;
					}
					Static6.anInt4397 = 5;
				} else if (javaVendor.indexOf("ibm") != -1 && (SignLink.javaVersion == null || SignLink.javaVersion.equals("1.4.2"))) {
					this.error("wrongjava");
					return;
				}
			}
			if (SignLink.javaVersion != null && SignLink.javaVersion.startsWith("1.")) {
				@Pc(75) int i = 2;
				@Pc(77) int minorVersion = 0;
				while (i < SignLink.javaVersion.length()) {
					@Pc(89) char c = SignLink.javaVersion.charAt(i);
					if (c < '0' || c > '9') {
						break;
					}
					i++;
					minorVersion = minorVersion * 10 + c - '0';
				}
				if (minorVersion >= 5) {
					isJava5OrLater = true;
				}
			}
			if (signLink.applet != null) {
				@Pc(124) Method setFocusCycleRoot = SignLink.setFocusCycleRoot;
				if (setFocusCycleRoot != null) {
					try {
						setFocusCycleRoot.invoke(signLink.applet, Boolean.TRUE);
					} catch (@Pc(140) Throwable ex) {
					}
				}
			}
			Static12.method697();
			this.addCanvas();
			Static4.aClass59_1 = Static25.method2727(canvasHeight, canvasWidth, canvas);
			this.mainInit();
			Static2.aClass77_1 = Static16.method1500();
			this.method682();
			while (killTime == 0L || MonotonicClock.currentTimeMillis() < killTime) {
				Static4.anInt3326 = Static2.aClass77_1.method3283(Static6.anInt4397, Static1.anInt80);
				for (@Pc(177) int i = 0; i < Static4.anInt3326; i++) {
					this.mainLoopWrapper();
				}
				this.mainRedrawWrapper();
				Static13.method1013(signLink, canvas);
			}
		} catch (@Pc(197) Exception ex) {
			TracingException.report(ex, null);
			this.error("crash");
		}
		this.shutdown(true);
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
	protected abstract void mainRedraw();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/lang/String;IZIII)V")
	protected final void startApplication(@OriginalArg(0) int cacheId, @OriginalArg(2) String cacheSubDir) {
		try {
			topMargin = 0;
			TracingException.clientVersion = 550;
			canvasHeight = 768;
			frameHeight = 768;
			canvasWidth = 1024;
			frameWidth = 1024;
			instance = this;
			leftMargin = 0;
			frame = new Frame();
			frame.setTitle("OpenRS2");
			frame.setResizable(true);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.toFront();
			@Pc(44) Insets insets = frame.getInsets();
			frame.setSize(insets.left + frameWidth + insets.right, insets.bottom + frameHeight + insets.top);
			TracingException.signLink = signLink = new SignLink(null, cacheId, cacheSubDir, 29);
			@Pc(77) PrivilegedRequest request = signLink.startThread(this, 1);
			while (request.status == 0) {
				ThreadUtils.sleep(10L);
			}
			thread = (Thread) request.result;
		} catch (@Pc(94) Exception local94) {
			TracingException.report(local94, null);
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
	protected abstract void mainInit();

	@OriginalMember(owner = "client!ue", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics graphics) {
		this.paint(graphics);
	}

	@OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent event) {
		focusIn = false;
	}

	@OriginalMember(owner = "client!ue", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)V")
	public final void method682() {
		if (this.miscNativesLoaded) {
			return;
		}
		try {
			@Pc(18) PrivilegedRequest request = signLink.loadMiscNatives(instance.getClass());
			while (request.status == 0) {
				ThreadUtils.sleep(100L);
			}
			if (request.result != null) {
				throw (Throwable) request.result;
			}
			jagmisc.init();
			this.miscNativesLoaded = true;
			Static2.aClass77_1 = Static16.method1500();
		} catch (@Pc(48) Throwable ex) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (instance == this && !shutdown) {
			killTime = MonotonicClock.currentTimeMillis();
			ThreadUtils.sleep(5000L);
			TracingException.signLink = null;
			this.shutdown(false);
		}
	}

	@OriginalMember(owner = "client!ue", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String name) {
		if (frame != null) {
			return null;
		} else if (signLink != null && signLink.applet != this) {
			return signLink.applet.getParameter(name);
		} else {
			return super.getParameter(name);
		}
	}
}

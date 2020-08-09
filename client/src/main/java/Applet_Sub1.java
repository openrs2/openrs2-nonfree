import java.applet.Applet;
import java.applet.AppletContext;
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
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!ue", name = "providesignlink", descriptor = "(Lsignlink!pm;)V")
	public static void providesignlink(@OriginalArg(0) SignLink arg0) {
		Static7.aClass196_4 = arg0;
		Static4.aClass196_3 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	protected abstract void method663();

	@OriginalMember(owner = "client!ue", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static4.aFrame2 == null) {
			return Static7.aClass196_4 == null || Static7.aClass196_4.applet == this ? super.getAppletContext() : Static7.aClass196_4.applet.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	private void method666() {
		@Pc(6) long local6 = Class194.method4849();
		@Pc(10) long local10 = Static6.aLongArray40[Static5.anInt5197];
		Static6.aLongArray40[Static5.anInt5197] = local6;
		if ((long) 0 != local10 && local10 < local6) {
		}
		Static5.anInt5197 = Static5.anInt5197 + 1 & 0x1F;
		synchronized (this) {
			Static3.aBoolean158 = Static7.aBoolean400;
		}
		this.method663();
	}

	@OriginalMember(owner = "client!ue", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static4.aFrame2 == null) {
			return Static7.aClass196_4 == null || Static7.aClass196_4.applet == this ? super.getDocumentBase() : Static7.aClass196_4.applet.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static7.aBoolean400 = true;
		Static6.aBoolean314 = true;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
	public final synchronized void method669() {
		if (Static5.aCanvas115 != null) {
			Static5.aCanvas115.removeFocusListener(this);
			Static5.aCanvas115.getParent().remove(Static5.aCanvas115);
		}
		@Pc(23) Container local23;
		if (Static3.aFrame1 != null) {
			local23 = Static3.aFrame1;
		} else if (Static4.aFrame2 == null) {
			local23 = Static7.aClass196_4.applet;
		} else {
			local23 = Static4.aFrame2;
		}
		local23.setLayout(null);
		Static5.aCanvas115 = new Canvas_Sub2(this);
		local23.add(Static5.aCanvas115);
		Static5.aCanvas115.setSize(Static1.anInt526, Static1.anInt690);
		Static5.aCanvas115.setVisible(true);
		if (Static4.aFrame2 == local23) {
			@Pc(57) Insets local57 = Static4.aFrame2.getInsets();
			Static5.aCanvas115.setLocation(local57.left + Static6.anInt4859, Static7.anInt5622 + local57.top);
		} else {
			Static5.aCanvas115.setLocation(Static6.anInt4859, Static7.anInt5622);
		}
		Static5.aCanvas115.addFocusListener(this);
		Static5.aCanvas115.requestFocus();
		Static7.aBoolean400 = true;
		Static6.aBoolean314 = true;
		Static1.aBoolean18 = false;
		Static3.aBoolean158 = true;
		Static5.aLong26 = Class194.method4849();
	}

	@OriginalMember(owner = "client!ue", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method670(@OriginalArg(1) String arg0) {
		if (this.aBoolean43) {
			return;
		}
		this.aBoolean43 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class86.method1851(Static7.aClass196_4.applet, "loggedout");
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static1.anApplet_Sub1_1 != this || Static1.aBoolean45) {
			return;
		}
		Static6.aBoolean314 = true;
		if (Static2.aBoolean77 && !Static3.aBoolean138 && Class194.method4849() - Static5.aLong26 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || local27.width >= Static2.anInt1635 && Static6.anInt4380 <= local27.height) {
				Static1.aBoolean18 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)Z")
	protected final boolean method671() {
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	protected abstract void method672();

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	protected abstract void method673();

	@OriginalMember(owner = "client!ue", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static1.anApplet_Sub1_1 == this && !Static1.aBoolean45) {
			Static7.aLong186 = 0L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static4.aFrame2 == null) {
			return Static7.aClass196_4 == null || Static7.aClass196_4.applet == this ? super.getCodeBase() : Static7.aClass196_4.applet.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	private void method674() {
		@Pc(14) long local14 = Class194.method4849();
		@Pc(18) long local18 = Static7.aLongArray8[Static4.anInt2832];
		Static7.aLongArray8[Static4.anInt2832] = local14;
		if (local18 != 0L && local14 > local18) {
			@Pc(42) int local42 = (int) (local14 - local18);
			Static3.anInt2295 = ((local42 >> 1) + 32000) / local42;
		}
		Static4.anInt2832 = Static4.anInt2832 + 1 & 0x1F;
		if (Static5.anInt3488++ > 50) {
			Static5.anInt3488 -= 50;
			Static6.aBoolean314 = true;
			Static5.aCanvas115.setSize(Static1.anInt526, Static1.anInt690);
			Static5.aCanvas115.setVisible(true);
			if (Static4.aFrame2 != null && Static3.aFrame1 == null) {
				@Pc(86) Insets local86 = Static4.aFrame2.getInsets();
				Static5.aCanvas115.setLocation(local86.left + Static6.anInt4859, Static7.anInt5622 + local86.top);
			} else {
				Static5.aCanvas115.setLocation(Static6.anInt4859, Static7.anInt5622);
			}
		}
		this.method678();
	}

	@OriginalMember(owner = "client!ue", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static1.anApplet_Sub1_1 == this && !Static1.aBoolean45) {
			Static7.aLong186 = Class194.method4849() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)V")
	private void method675(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static1.aBoolean45) {
				return;
			}
			Static1.aBoolean45 = true;
		}
		if (Static7.aClass196_4.applet != null) {
			Static7.aClass196_4.applet.destroy();
		}
		try {
			this.method672();
		} catch (@Pc(43) Exception local43) {
		}
		if (this.aBoolean42) {
			try {
				jagmisc.quit();
			} catch (@Pc(49) Throwable local49) {
			}
			this.aBoolean42 = false;
		}
		Static7.aClass196_4.unloadNatives(Static1.anApplet_Sub1_1.getClass());
		if (Static5.aCanvas115 != null) {
			try {
				Static5.aCanvas115.removeFocusListener(this);
				Static5.aCanvas115.getParent().remove(Static5.aCanvas115);
			} catch (@Pc(70) Exception local70) {
			}
		}
		if (Static7.aClass196_4 != null) {
			try {
				Static7.aClass196_4.stop();
			} catch (@Pc(77) Exception local77) {
			}
		}
		this.method673();
		if (Static4.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(87) Throwable local87) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ue", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V")
	protected final void method677(@OriginalArg(1) int arg0) {
		try {
			if (Static1.anApplet_Sub1_1 != null) {
				Static3.anInt2145++;
				if (Static3.anInt2145 < 3) {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
					return;
				}
				this.method670("alreadyloaded");
				return;
			}
			Static6.anInt4859 = 0;
			Static1.anApplet_Sub1_1 = this;
			Static7.anInt5622 = 0;
			Static1.anInt526 = 765;
			Static2.anInt1635 = 765;
			Static7.anInt5282 = 1550;
			Static1.anInt690 = 503;
			Static6.anInt4380 = 503;
			@Pc(50) String local50 = this.getParameter("openwinjs");
			if (local50 != null && local50.equals("1")) {
				Static4.aBoolean207 = true;
			} else {
				Static4.aBoolean207 = false;
			}
			if (Static7.aClass196_4 == null) {
				Static4.aClass196_3 = Static7.aClass196_4 = new SignLink(this, arg0, null, 0);
			}
			@Pc(80) PrivilegedRequest local80 = Static7.aClass196_4.startThread(this, 1);
			while (local80.status == 0) {
				Static37.method4640(10L);
			}
			Static7.aThread2 = (Thread) local80.result;
		} catch (@Pc(97) Exception local97) {
			Static26.method3059(local97, null);
			this.method670("crash");
		}
	}

	@OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (SignLink.javaVendor != null) {
				@Pc(10) String local10 = SignLink.javaVendor.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = SignLink.javaVersion;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method670("wrongjava");
						return;
					}
					Static6.anInt4397 = 5;
				} else if (local10.indexOf("ibm") != -1 && (SignLink.javaVersion == null || SignLink.javaVersion.equals("1.4.2"))) {
					this.method670("wrongjava");
					return;
				}
			}
			if (SignLink.javaVersion != null && SignLink.javaVersion.startsWith("1.")) {
				@Pc(75) int local75 = 2;
				@Pc(77) int local77 = 0;
				while (SignLink.javaVersion.length() > local75) {
					@Pc(89) char local89 = SignLink.javaVersion.charAt(local75);
					if (local89 < '0' || local89 > '9') {
						break;
					}
					local75++;
					local77 = local77 * 10 + local89 - 48;
				}
				if (local77 >= 5) {
					Static2.aBoolean77 = true;
				}
			}
			if (Static7.aClass196_4.applet != null) {
				@Pc(124) Method local124 = SignLink.setFocusCycleRoot;
				if (local124 != null) {
					try {
						local124.invoke(Static7.aClass196_4.applet, Boolean.TRUE);
					} catch (@Pc(140) Throwable local140) {
					}
				}
			}
			Static12.method697();
			this.method669();
			Static4.aClass59_1 = Static25.method2727(Static1.anInt690, Static1.anInt526, Static5.aCanvas115);
			this.method681();
			Static2.aClass77_1 = Static16.method1500();
			this.method682();
			while (Static7.aLong186 == 0L || Class194.method4849() < Static7.aLong186) {
				Static4.anInt3326 = Static2.aClass77_1.method3283(Static6.anInt4397, Static1.anInt80);
				for (@Pc(177) int local177 = 0; local177 < Static4.anInt3326; local177++) {
					this.method666();
				}
				this.method674();
				Static13.method1013(Static7.aClass196_4, Static5.aCanvas115);
			}
		} catch (@Pc(197) Exception local197) {
			Static26.method3059(local197, null);
			this.method670("crash");
		}
		this.method675(true);
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
	protected abstract void method678();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/lang/String;IZIII)V")
	protected final void method679(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			Static7.anInt5622 = 0;
			Static7.anInt5282 = 550;
			Static1.anInt690 = 768;
			Static6.anInt4380 = 768;
			Static1.anInt526 = 1024;
			Static2.anInt1635 = 1024;
			Static1.anApplet_Sub1_1 = this;
			Static6.anInt4859 = 0;
			Static4.aFrame2 = new Frame();
			Static4.aFrame2.setTitle("OpenRS2");
			Static4.aFrame2.setResizable(true);
			Static4.aFrame2.addWindowListener(this);
			Static4.aFrame2.setVisible(true);
			Static4.aFrame2.toFront();
			@Pc(44) Insets local44 = Static4.aFrame2.getInsets();
			Static4.aFrame2.setSize(local44.left + Static2.anInt1635 + local44.right, local44.bottom + Static6.anInt4380 + local44.top);
			Static4.aClass196_3 = Static7.aClass196_4 = new SignLink(null, arg0, arg1, 29);
			@Pc(77) PrivilegedRequest local77 = Static7.aClass196_4.startThread(this, 1);
			while (local77.status == 0) {
				Static37.method4640(10L);
			}
			Static7.aThread2 = (Thread) local77.result;
		} catch (@Pc(94) Exception local94) {
			Static26.method3059(local94, null);
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
	protected abstract void method681();

	@OriginalMember(owner = "client!ue", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static7.aBoolean400 = false;
	}

	@OriginalMember(owner = "client!ue", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)V")
	public final void method682() {
		if (this.aBoolean42) {
			return;
		}
		try {
			@Pc(18) PrivilegedRequest local18 = Static7.aClass196_4.loadMiscNatives(Static1.anApplet_Sub1_1.getClass());
			while (local18.status == 0) {
				Static37.method4640(100L);
			}
			if (local18.result != null) {
				throw (Throwable) local18.result;
			}
			jagmisc.init();
			this.aBoolean42 = true;
			Static2.aClass77_1 = Static16.method1500();
		} catch (@Pc(48) Throwable local48) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static1.anApplet_Sub1_1 == this && !Static1.aBoolean45) {
			Static7.aLong186 = Class194.method4849();
			Static37.method4640(5000L);
			Static4.aClass196_3 = null;
			this.method675(false);
		}
	}

	@OriginalMember(owner = "client!ue", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static4.aFrame2 == null) {
			return Static7.aClass196_4 == null || Static7.aClass196_4.applet == this ? super.getParameter(arg0) : Static7.aClass196_4.applet.getParameter(arg0);
		} else {
			return null;
		}
	}
}

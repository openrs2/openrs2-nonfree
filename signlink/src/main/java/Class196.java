import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!pm")
public final class Class196 implements Runnable {

	@OriginalMember(owner = "signlink!pm", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString376;

	@OriginalMember(owner = "signlink!pm", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString377;

	@OriginalMember(owner = "signlink!pm", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString378;

	@OriginalMember(owner = "signlink!pm", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString379;

	@OriginalMember(owner = "signlink!pm", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString381;

	@OriginalMember(owner = "signlink!pm", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString382;

	@OriginalMember(owner = "signlink!pm", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString383;

	@OriginalMember(owner = "signlink!pm", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "signlink!pm", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "I")
	public static final int anInt6106 = 1;

	@OriginalMember(owner = "signlink!pm", name = "A", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "signlink!pm", name = "s", descriptor = "J")
	private static volatile long aLong218 = 0L;

	@OriginalMember(owner = "signlink!pm", name = "p", descriptor = "Lsignlink!le;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "signlink!pm", name = "i", descriptor = "Lsignlink!kd;")
	public Class195 aClass195_2 = null;

	@OriginalMember(owner = "signlink!pm", name = "m", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet2 = null;

	@OriginalMember(owner = "signlink!pm", name = "j", descriptor = "Lsignlink!kd;")
	public Class195 aClass195_3 = null;

	@OriginalMember(owner = "signlink!pm", name = "b", descriptor = "Lsignlink!kd;")
	public Class195 aClass195_4 = null;

	@OriginalMember(owner = "signlink!pm", name = "c", descriptor = "Z")
	private boolean aBoolean427 = false;

	@OriginalMember(owner = "signlink!pm", name = "k", descriptor = "Lsignlink!vk;")
	private Class197 aClass197_6 = null;

	@OriginalMember(owner = "signlink!pm", name = "y", descriptor = "Lsignlink!vk;")
	private Class197 aClass197_7 = null;

	@OriginalMember(owner = "signlink!pm", name = "x", descriptor = "I")
	private final int anInt6105;

	@OriginalMember(owner = "signlink!pm", name = "w", descriptor = "Ljava/lang/String;")
	private final String aString380;

	@OriginalMember(owner = "signlink!pm", name = "v", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "signlink!pm", name = "u", descriptor = "[Lsignlink!kd;")
	public Class195[] aClass195Array1;

	@OriginalMember(owner = "signlink!pm", name = "z", descriptor = "Lsignlink!c;")
	private Class192 aClass192_1;

	@OriginalMember(owner = "signlink!pm", name = "h", descriptor = "Lsignlink!e;")
	private Class193 aClass193_1;

	@OriginalMember(owner = "signlink!pm", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "signlink!pm", name = "c", descriptor = "(Ljava/lang/String;B)Lsignlink!kd;")
	private static Class195 method4870(@OriginalArg(0) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString379, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(41) int local41 = 0; local41 < local34.length; local41++) {
			@Pc(49) String local49 = local34[local41];
			if (local49.length() <= 0 || (new File(local49)).exists()) {
				try {
					return new Class195(new File(local49, ".openrs2_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(82) Exception local82) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)Ljava/io/File;")
	public static File method4873(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(10) File local10 = (File) aHashtable2.get(arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(49) String[] local49 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString379, "/tmp/", "" };
		@Pc(74) String[] local74 = new String[] { ".openrs2_cache_" + arg1, ".openrs2_cache_" + arg1 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(83) int local83 = 0; local83 < local74.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local49.length; local93++) {
					@Pc(131) String local131 = local49[local93] + local74[local83] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(133) Object local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local76 != 0 || local138.exists()) {
							@Pc(151) String local151 = local49[local93];
							if (local76 != 1 || local151.length() <= 0 || (new File(local151)).exists()) {
								(new File(local49[local93] + local74[local83])).mkdir();
								if (arg2 != null) {
									(new File(local49[local93] + local74[local83] + "/" + arg2)).mkdir();
								}
								@Pc(215) RandomAccessFile local215 = new RandomAccessFile(local138, "rw");
								@Pc(218) int local218 = local215.read();
								local215.seek(0L);
								local215.write(local218);
								local215.seek(0L);
								local215.close();
								aHashtable2.put(arg0, local138);
								return local138;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local133 != null) {
								((RandomAccessFile) local133).close();
							}
						} catch (@Pc(246) Exception local246) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "signlink!pm", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class196(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString378 = "1.1";
		this.anInt6105 = arg1;
		this.aString380 = arg2;
		aString377 = "Unknown";
		this.anApplet2 = arg0;
		try {
			aString377 = System.getProperty("java.vendor");
			aString378 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString381 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString381 = "Unknown";
		}
		aString383 = aString381.toLowerCase();
		try {
			aString376 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString376 = "";
		}
		try {
			aString382 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString382 = "";
		}
		try {
			aString379 = System.getProperty("user.home");
			if (aString379 != null) {
				aString379 = aString379 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString379 == null) {
			aString379 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod2 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod1 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod1 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass195_3 = new Class195(method4873("random.dat", this.anInt6105, null), "rw", 25L);
		this.aClass195_2 = new Class195(method4873("main_file_cache.dat2", this.anInt6105, this.aString380), "rw", 104857600L);
		this.aClass195_4 = new Class195(method4873("main_file_cache.idx255", this.anInt6105, this.aString380), "rw", 1048576L);
		this.aClass195Array1 = new Class195[arg3];
		for (@Pc(198) int local198 = 0; local198 < arg3; local198++) {
			this.aClass195Array1[local198] = new Class195(method4873("main_file_cache.idx" + local198, this.anInt6105, this.aString380), "rw", 1048576L);
		}
		try {
			this.aClass192_1 = new Class192();
		} catch (@Pc(237) Throwable local237) {
		}
		try {
			this.aClass193_1 = new Class193();
		} catch (@Pc(244) Throwable local244) {
		}
		@Pc(247) ThreadGroup local247 = Thread.currentThread().getThreadGroup();
		for (@Pc(250) ThreadGroup local250 = local247.getParent(); local250 != null; local250 = local250.getParent()) {
			local247 = local250;
		}
		@Pc(262) Thread[] local262 = new Thread[1000];
		local247.enumerate(local262);
		for (@Pc(268) int local268 = 0; local268 < local262.length; local268++) {
			if (local262[local268] != null && local262[local268].getName().startsWith("AWT")) {
				local262[local268].setPriority(1);
			}
		}
		this.aBoolean427 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(BLjava/awt/Point;I[IILjava/awt/Component;)Lsignlink!vk;")
	public final Class197 method4862(@OriginalArg(1) Point arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Component arg4) {
		return this.method4866(17, arg1, new Object[] { arg4, arg2, arg0 }, arg3);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(BI)Lsignlink!vk;")
	public final Class197 method4863(@OriginalArg(1) int arg0) {
		return this.method4866(3, 0, null, arg0);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/lang/String;B)Lsignlink!vk;")
	public final Class197 method4864(@OriginalArg(0) String arg0) {
		return this.method4866(16, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!pm", name = "b", descriptor = "(Ljava/lang/Class;I)Lsignlink!vk;")
	public final Class197 method4865(@OriginalArg(0) Class arg0) {
		return this.method4866(20, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(IILjava/lang/Object;IB)Lsignlink!vk;")
	private Class197 method4866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class197 local3 = new Class197();
		local3.anInt6109 = arg3;
		local3.anInt6110 = arg1;
		local3.anInt6108 = arg0;
		local3.anObject7 = arg2;
		synchronized (this) {
			if (this.aClass197_7 == null) {
				this.aClass197_7 = this.aClass197_6 = local3;
			} else {
				this.aClass197_7.aClass197_8 = local3;
				this.aClass197_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/lang/Class;I)Lsignlink!vk;")
	public final Class197 method4867(@OriginalArg(0) Class arg0) {
		return this.method4866(11, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!pm", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (true) {
			@Pc(16) Class197 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean427) {
						return;
					}
					if (this.aClass197_6 != null) {
						local16 = this.aClass197_6;
						this.aClass197_6 = this.aClass197_6.aClass197_8;
						if (this.aClass197_6 == null) {
							this.aClass197_7 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local16.anInt6108;
				if (local46 == 1) {
					if (aLong218 > Class194.method4849()) {
						throw new IOException();
					}
					local16.anObject6 = new Socket(InetAddress.getByName((String) local16.anObject7), local16.anInt6109);
				} else if (local46 == 2) {
					@Pc(843) Thread local843 = new Thread((Runnable) local16.anObject7);
					local843.setDaemon(true);
					local843.start();
					local843.setPriority(local16.anInt6109);
					local16.anObject6 = local843;
				} else if (local46 == 4) {
					if (Class194.method4849() < aLong218) {
						throw new IOException();
					}
					local16.anObject6 = new DataInputStream(((URL) local16.anObject7).openStream());
				} else if (local46 == 8) {
					@Pc(808) Object[] local808 = (Object[]) local16.anObject7;
					if (((Class) local808[0]).getClassLoader() == null) {
						throw new SecurityException();
					}
					local16.anObject6 = ((Class) local808[0]).getDeclaredMethod((String) local808[1], (Class[]) local808[2]);
				} else if (local46 == 9) {
					@Pc(93) Object[] local93 = (Object[]) local16.anObject7;
					if (((Class) local93[0]).getClassLoader() == null) {
						throw new SecurityException();
					}
					local16.anObject6 = ((Class) local93[0]).getDeclaredField((String) local93[1]);
				} else if (local46 == 18) {
					@Pc(797) Clipboard local797 = Toolkit.getDefaultToolkit().getSystemClipboard();
					local16.anObject6 = local797.getContents(null);
				} else if (local46 == 19) {
					@Pc(126) Transferable local126 = (Transferable) local16.anObject7;
					@Pc(129) Clipboard local129 = Toolkit.getDefaultToolkit().getSystemClipboard();
					local129.setContents(local126, null);
				} else if (local46 == 3) {
					if (Class194.method4849() < aLong218) {
						throw new IOException();
					}
					@Pc(188) String local188 = (local16.anInt6109 >> 24 & 0xFF) + "." + (local16.anInt6109 >> 16 & 0xFF) + "." + (local16.anInt6109 >> 8 & 0xFF) + "." + (local16.anInt6109 & 0xFF);
					local16.anObject6 = InetAddress.getByName(local188).getHostName();
				} else if (local46 == 5) {
					local16.anObject6 = this.aClass192_1.method4844();
				} else if (local46 == 6) {
					@Pc(214) Frame local214 = new Frame("OpenRS2 Full Screen");
					local16.anObject6 = local214;
					local214.setResizable(false);
					this.aClass192_1.method4843(local16.anInt6109 & 0xFFFF, local16.anInt6109 >>> 16, local16.anInt6110 >> 16, local214, local16.anInt6110 & 0xFFFF);
				} else if (local46 == 7) {
					this.aClass192_1.method4842();
				} else if (local46 == 10) {
					@Pc(610) Class[] local610 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
					@Pc(612) Runtime local612 = Runtime.getRuntime();
					if (!aString383.startsWith("mac")) {
						@Pc(623) Method local623 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local610);
						local623.setAccessible(true);
						local623.invoke(local612, local16.anObject7, "jawt");
						local623.setAccessible(false);
					}
					@Pc(650) Method local650 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local610);
					local650.setAccessible(true);
					if (aString383.startsWith("linux")) {
						local650.invoke(local612, local16.anObject7, method4873("libjaggl_dri.so", this.anInt6105, this.aString380).toString());
						@Pc(690) Class local690 = ((Class) local16.anObject7).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
						local690.getMethod("begin").invoke(null);
						local650.invoke(local612, local16.anObject7, method4873("libjaggl.so", this.anInt6105, this.aString380).toString());
						local690.getMethod("end").invoke(null);
					} else if (aString383.startsWith("mac")) {
						local650.invoke(local612, local16.anObject7, method4873("libjaggl.dylib", this.anInt6105, this.aString380).toString());
					} else if (aString383.startsWith("win")) {
						local650.invoke(local612, local16.anObject7, method4873("jaggl.dll", this.anInt6105, this.aString380).toString());
					} else {
						throw new Exception();
					}
					local650.setAccessible(false);
				} else if (local46 == 11) {
					@Pc(529) Field local529 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
					local529.setAccessible(true);
					@Pc(540) Vector local540 = (Vector) local529.get(((Class) local16.anObject7).getClassLoader());
					for (@Pc(542) int local542 = 0; local542 < local540.size(); local542++) {
						@Pc(554) Object local554 = local540.elementAt(local542);
						@Pc(561) Method local561 = local554.getClass().getDeclaredMethod("finalize");
						local561.setAccessible(true);
						local561.invoke(local554);
						local561.setAccessible(false);
						@Pc(578) Field local578 = local554.getClass().getDeclaredField("handle");
						local578.setAccessible(true);
						local578.set(local554, Integer.valueOf(0));
						local578.setAccessible(false);
					}
					local529.setAccessible(false);
				} else if (local46 == 12) {
					@Pc(516) String local516 = (String) local16.anObject7;
					@Pc(520) Class195 local520 = method4870(local516);
					local16.anObject6 = local520;
				} else if (local46 == 14) {
					@Pc(273) int local273 = local16.anInt6109;
					@Pc(276) int local276 = local16.anInt6110;
					this.aClass193_1.method4848(local276, local273);
				} else if (local46 == 15) {
					@Pc(495) Component local495 = (Component) local16.anObject7;
					@Pc(505) boolean local505 = local16.anInt6109 != 0;
					this.aClass193_1.method4846(local505, local495);
				} else if (local46 == 17) {
					@Pc(469) Object[] local469 = (Object[]) local16.anObject7;
					this.aClass193_1.method4847(local16.anInt6109, local16.anInt6110, (Point) local469[2], (int[]) local469[1], (Component) local469[0]);
				} else if (local46 == 16) {
					try {
						if (!aString383.startsWith("win")) {
							throw new Exception();
						}
						@Pc(308) String local308 = (String) local16.anObject7;
						if (!local308.startsWith("http://") && !local308.startsWith("https://")) {
							throw new Exception();
						}
						@Pc(323) String local323 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
						for (@Pc(325) int local325 = 0; local308.length() > local325; local325++) {
							if (local323.indexOf(local308.charAt(local325)) == -1) {
								throw new Exception();
							}
						}
						Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local308 + "\"");
						local16.anObject6 = null;
					} catch (@Pc(362) Exception local362) {
						local16.anObject6 = local362;
					}
				} else if (local46 == 20) {
					try {
						@Pc(386) Class[] local386 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
						@Pc(388) Runtime local388 = Runtime.getRuntime();
						@Pc(394) Method local394 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local386);
						local394.setAccessible(true);
						if (aString383.startsWith("win")) {
							local394.invoke(local388, local16.anObject7, method4873("jagmisc.dll", this.anInt6105, this.aString380).toString());
						}
						local394.setAccessible(false);
					} catch (@Pc(460) Throwable local460) {
						local16.anObject6 = local460;
					}
				} else {
					throw new Exception();
				}
				local16.anInt6107 = 1;
			} catch (@Pc(881) ThreadDeath local881) {
				throw local881;
			} catch (@Pc(884) Throwable local884) {
				local16.anInt6107 = 2;
			}
		}
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lsignlink!vk;")
	public final Class197 method4871(@OriginalArg(0) Frame arg0) {
		return this.method4866(7, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(I)Lsignlink!vk;")
	public final Class197 method4872() {
		return this.method4866(5, 0, null, 0);
	}

	@OriginalMember(owner = "signlink!pm", name = "b", descriptor = "(I)V")
	public final void method4874() {
		aLong218 = Class194.method4849() + (long) 5000;
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;[Ljava/lang/Class;)Lsignlink!vk;")
	public final Class197 method4875(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method4866(8, 0, new Object[] { arg1, arg0, arg2 }, 0);
	}

	@OriginalMember(owner = "signlink!pm", name = "d", descriptor = "(B)Lsignlink!le;")
	public final Interface5 method4877() {
		return this.anInterface5_2;
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(ILjava/lang/Class;)Lsignlink!vk;")
	public final Class197 method4878(@OriginalArg(1) Class arg0) {
		return this.method4866(10, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!pm", name = "c", descriptor = "(B)Z")
	public final boolean method4879() {
		return this.aClass192_1 != null;
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/net/URL;I)Lsignlink!vk;")
	public final Class197 method4880(@OriginalArg(0) URL arg0) {
		return this.method4866(4, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!pm", name = "b", descriptor = "(Ljava/lang/String;B)Lsignlink!vk;")
	public final Class197 method4881(@OriginalArg(0) String arg0) {
		return this.method4866(12, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(B)V")
	public final void method4882() {
		synchronized (this) {
			this.aBoolean427 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass195_2 != null) {
			try {
				this.aClass195_2.method4853();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass195_4 != null) {
			try {
				this.aClass195_4.method4853();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass195Array1 != null) {
			for (@Pc(56) int local56 = 0; local56 < this.aClass195Array1.length; local56++) {
				if (this.aClass195Array1[local56] != null) {
					try {
						this.aClass195Array1[local56].method4853();
					} catch (@Pc(80) IOException local80) {
					}
				}
			}
		}
		if (this.aClass195_3 != null) {
			try {
				this.aClass195_3.method4853();
			} catch (@Pc(91) IOException local91) {
			}
		}
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lsignlink!vk;")
	public final Class197 method4883(@OriginalArg(0) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method4866(2, 0, arg1, arg0);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(IIIBI)Lsignlink!vk;")
	public final Class197 method4884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return this.method4866(6, arg2 << 16, null, arg1 + (arg0 << 16));
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lsignlink!vk;")
	public final Class197 method4885(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method4866(9, 0, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(ILjava/lang/String;I)Lsignlink!vk;")
	public final Class197 method4887(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method4866(1, 0, arg0, arg1);
	}
}

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
public final class SignLink implements Runnable {

	@OriginalMember(owner = "signlink!pm", name = "d", descriptor = "Ljava/lang/String;")
	private static String osArch;

	@OriginalMember(owner = "signlink!pm", name = "o", descriptor = "Ljava/lang/String;")
	public static String javaVendor;

	@OriginalMember(owner = "signlink!pm", name = "g", descriptor = "Ljava/lang/String;")
	public static String javaVersion;

	@OriginalMember(owner = "signlink!pm", name = "e", descriptor = "Ljava/lang/String;")
	private static String homeDir;

	@OriginalMember(owner = "signlink!pm", name = "f", descriptor = "Ljava/lang/String;")
	private static String osNameRaw;

	@OriginalMember(owner = "signlink!pm", name = "n", descriptor = "Ljava/lang/String;")
	private static String osVersion;

	@OriginalMember(owner = "signlink!pm", name = "l", descriptor = "Ljava/lang/String;")
	public static String osName;

	@OriginalMember(owner = "signlink!pm", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	public static Method setFocusCycleRoot;

	@OriginalMember(owner = "signlink!pm", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	public static Method setFocusTraversalKeysEnabled;

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "I")
	public static final int anInt6106 = 1;

	@OriginalMember(owner = "signlink!pm", name = "A", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable fileCache = new Hashtable(16);

	@OriginalMember(owner = "signlink!pm", name = "s", descriptor = "J")
	private static volatile long breakConnectionsUntil = 0L;

	@OriginalMember(owner = "signlink!pm", name = "p", descriptor = "Lsignlink!le;")
	private AudioSource audioSource;

	@OriginalMember(owner = "signlink!pm", name = "i", descriptor = "Lsignlink!kd;")
	public FileOnDisk cacheData = null;

	@OriginalMember(owner = "signlink!pm", name = "m", descriptor = "Ljava/applet/Applet;")
	public Applet applet = null;

	@OriginalMember(owner = "signlink!pm", name = "j", descriptor = "Lsignlink!kd;")
	public FileOnDisk uid = null;

	@OriginalMember(owner = "signlink!pm", name = "b", descriptor = "Lsignlink!kd;")
	public FileOnDisk cacheMasterIndex = null;

	@OriginalMember(owner = "signlink!pm", name = "c", descriptor = "Z")
	private boolean stop = false;

	@OriginalMember(owner = "signlink!pm", name = "k", descriptor = "Lsignlink!vk;")
	private PrivilegedRequest requestQueueHead = null;

	@OriginalMember(owner = "signlink!pm", name = "y", descriptor = "Lsignlink!vk;")
	private PrivilegedRequest requestQueueTail = null;

	@OriginalMember(owner = "signlink!pm", name = "x", descriptor = "I")
	private final int cacheId;

	@OriginalMember(owner = "signlink!pm", name = "w", descriptor = "Ljava/lang/String;")
	private final String cacheSubDir;

	@OriginalMember(owner = "signlink!pm", name = "v", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue eventQueue;

	@OriginalMember(owner = "signlink!pm", name = "u", descriptor = "[Lsignlink!kd;")
	public FileOnDisk[] cacheIndexes;

	@OriginalMember(owner = "signlink!pm", name = "z", descriptor = "Lsignlink!c;")
	private FullScreenManager fullScreenManager;

	@OriginalMember(owner = "signlink!pm", name = "h", descriptor = "Lsignlink!e;")
	private CursorManager cursorManager;

	@OriginalMember(owner = "signlink!pm", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread thread;

	@OriginalMember(owner = "signlink!pm", name = "c", descriptor = "(Ljava/lang/String;B)Lsignlink!kd;")
	private static FileOnDisk openPreferencesInternal(@OriginalArg(0) String cacheSubDir) {
		@Pc(34) String[] cacheLocations = new String[] { "c:/rscache/", "/rscache/", homeDir, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(41) int i = 0; i < cacheLocations.length; i++) {
			@Pc(49) String cacheLocation = cacheLocations[i];
			if (cacheLocation.length() <= 0 || (new File(cacheLocation)).exists()) {
				try {
					return new FileOnDisk(new File(cacheLocation, ".openrs2_" + cacheSubDir + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(82) Exception ex) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)Ljava/io/File;")
	public static File getFile(@OriginalArg(0) String name, @OriginalArg(1) int storeId, @OriginalArg(2) String cacheSubDir) {
		@Pc(10) File cachedFile = (File) fileCache.get(name);
		if (cachedFile != null) {
			return cachedFile;
		}
		@Pc(49) String[] cacheLocations = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", homeDir, "/tmp/", "" };
		@Pc(74) String[] cacheDirs = new String[] { ".openrs2_cache_" + storeId, ".openrs2_cache_" + storeId };
		for (@Pc(76) int attempt = 0; attempt < 2; attempt++) {
			for (@Pc(83) int i = 0; i < cacheDirs.length; i++) {
				for (@Pc(93) int j = 0; j < cacheLocations.length; j++) {
					@Pc(131) String path = cacheLocations[j] + cacheDirs[i] + "/" + (cacheSubDir == null ? "" : cacheSubDir + "/") + name;
					@Pc(133) RandomAccessFile randomAccessFile = null;
					try {
						@Pc(138) File file = new File(path);
						if (attempt != 0 || file.exists()) {
							@Pc(151) String cacheLocation = cacheLocations[j];
							if (attempt != 1 || cacheLocation.length() <= 0 || (new File(cacheLocation)).exists()) {
								(new File(cacheLocations[j] + cacheDirs[i])).mkdir();
								if (cacheSubDir != null) {
									(new File(cacheLocations[j] + cacheDirs[i] + "/" + cacheSubDir)).mkdir();
								}
								randomAccessFile = new RandomAccessFile(file, "rw");
								@Pc(218) int firstByte = randomAccessFile.read();
								randomAccessFile.seek(0L);
								randomAccessFile.write(firstByte);
								randomAccessFile.seek(0L);
								randomAccessFile.close();
								fileCache.put(name, file);
								return file;
							}
						}
					} catch (@Pc(237) Exception ex) {
						try {
							if (randomAccessFile != null) {
								randomAccessFile.close();
							}
						} catch (@Pc(246) Exception closeEx) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "signlink!pm", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public SignLink(@OriginalArg(0) Applet applet, @OriginalArg(1) int cacheId, @OriginalArg(2) String cacheSubDir, @OriginalArg(3) int archiveCount) throws Exception {
		javaVersion = "1.1";
		this.cacheId = cacheId;
		this.cacheSubDir = cacheSubDir;
		javaVendor = "Unknown";
		this.applet = applet;
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (@Pc(43) Exception ex) {
		}
		try {
			osNameRaw = System.getProperty("os.name");
		} catch (@Pc(48) Exception ex) {
			osNameRaw = "Unknown";
		}
		osName = osNameRaw.toLowerCase();
		try {
			osArch = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception ex) {
			osArch = "";
		}
		try {
			osVersion = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception ex) {
			osVersion = "";
		}
		try {
			homeDir = System.getProperty("user.home");
			if (homeDir != null) {
				homeDir = homeDir + "/";
			}
		} catch (@Pc(85) Exception ex) {
		}
		if (homeDir == null) {
			homeDir = "~/";
		}
		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable ex) {
		}
		try {
			if (applet == null) {
				setFocusTraversalKeysEnabled = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				setFocusTraversalKeysEnabled = applet.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception ex) {
		}
		try {
			if (applet == null) {
				setFocusCycleRoot = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				setFocusCycleRoot = applet.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception ex) {
		}
		this.uid = new FileOnDisk(getFile("random.dat", this.cacheId, null), "rw", 25L);
		this.cacheData = new FileOnDisk(getFile("main_file_cache.dat2", this.cacheId, this.cacheSubDir), "rw", 0x6400000L);
		this.cacheMasterIndex = new FileOnDisk(getFile("main_file_cache.idx255", this.cacheId, this.cacheSubDir), "rw", 0x100000L);
		this.cacheIndexes = new FileOnDisk[archiveCount];
		for (@Pc(198) int i = 0; i < archiveCount; i++) {
			this.cacheIndexes[i] = new FileOnDisk(getFile("main_file_cache.idx" + i, this.cacheId, this.cacheSubDir), "rw", 0x100000L);
		}
		try {
			this.fullScreenManager = new FullScreenManager();
		} catch (@Pc(237) Throwable ex) {
		}
		try {
			this.cursorManager = new CursorManager();
		} catch (@Pc(244) Throwable ex) {
		}
		@Pc(247) ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();
		for (@Pc(250) ThreadGroup group = rootGroup.getParent(); group != null; group = group.getParent()) {
			rootGroup = group;
		}
		@Pc(262) Thread[] threads = new Thread[1000];
		rootGroup.enumerate(threads);
		for (@Pc(268) int i = 0; i < threads.length; i++) {
			if (threads[i] != null && threads[i].getName().startsWith("AWT")) {
				threads[i].setPriority(1);
			}
		}
		this.stop = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(BLjava/awt/Point;I[IILjava/awt/Component;)Lsignlink!vk;")
	public final PrivilegedRequest setCursor(@OriginalArg(5) Component component, @OriginalArg(4) int width, @OriginalArg(2) int height, @OriginalArg(3) int[] pixels, @OriginalArg(1) Point hotSpot) {
		return this.enqueue(17, width, height, new Object[] { component, pixels, hotSpot });
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(BI)Lsignlink!vk;")
	public final PrivilegedRequest getReverseDns(@OriginalArg(1) int ip) {
		return this.enqueue(3, ip, 0, null);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/lang/String;B)Lsignlink!vk;")
	public final PrivilegedRequest openUrl(@OriginalArg(0) String url) {
		return this.enqueue(16, 0, 0, url);
	}

	@OriginalMember(owner = "signlink!pm", name = "b", descriptor = "(Ljava/lang/Class;I)Lsignlink!vk;")
	public final PrivilegedRequest loadMiscNatives(@OriginalArg(0) Class<?> clazz) {
		return this.enqueue(20, 0, 0, clazz);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(IILjava/lang/Object;IB)Lsignlink!vk;")
	private PrivilegedRequest enqueue(@OriginalArg(0) int type, @OriginalArg(3) int intArg1, @OriginalArg(1) int intArg2, @OriginalArg(2) Object objectArg) {
		@Pc(3) PrivilegedRequest request = new PrivilegedRequest();
		request.intArg1 = intArg1;
		request.intArg2 = intArg2;
		request.type = type;
		request.objectArg = objectArg;
		synchronized (this) {
			if (this.requestQueueTail == null) {
				this.requestQueueTail = this.requestQueueHead = request;
			} else {
				this.requestQueueTail.next = request;
				this.requestQueueTail = request;
			}
			this.notify();
			return request;
		}
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/lang/Class;I)Lsignlink!vk;")
	public final PrivilegedRequest unloadNatives(@OriginalArg(0) Class<?> clazz) {
		return this.enqueue(11, 0, 0, clazz);
	}

	@OriginalMember(owner = "signlink!pm", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (true) {
			@Pc(16) PrivilegedRequest request;
			synchronized (this) {
				while (true) {
					if (this.stop) {
						return;
					}
					if (this.requestQueueHead != null) {
						request = this.requestQueueHead;
						this.requestQueueHead = this.requestQueueHead.next;
						if (this.requestQueueHead == null) {
							this.requestQueueTail = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException ex) {
					}
				}
			}
			try {
				@Pc(46) int type = request.type;
				if (type == 1) {
					if (breakConnectionsUntil > MonotonicClock.currentTimeMillis()) {
						throw new IOException();
					}
					request.result = new Socket(InetAddress.getByName((String) request.objectArg), request.intArg1);
				} else if (type == 2) {
					@Pc(843) Thread thread = new Thread((Runnable) request.objectArg);
					thread.setDaemon(true);
					thread.start();
					thread.setPriority(request.intArg1);
					request.result = thread;
				} else if (type == 4) {
					if (breakConnectionsUntil > MonotonicClock.currentTimeMillis()) {
						throw new IOException();
					}
					request.result = new DataInputStream(((URL) request.objectArg).openStream());
				} else if (type == 8) {
					@Pc(808) Object[] args = (Object[]) request.objectArg;
					if (((Class<?>) args[0]).getClassLoader() == null) {
						throw new SecurityException();
					}
					request.result = ((Class<?>) args[0]).getDeclaredMethod((String) args[1], (Class<?>[]) args[2]);
				} else if (type == 9) {
					@Pc(93) Object[] args = (Object[]) request.objectArg;
					if (((Class<?>) args[0]).getClassLoader() == null) {
						throw new SecurityException();
					}
					request.result = ((Class<?>) args[0]).getDeclaredField((String) args[1]);
				} else if (type == 18) {
					@Pc(797) Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
					request.result = clipboard.getContents(null);
				} else if (type == 19) {
					@Pc(126) Transferable transferable = (Transferable) request.objectArg;
					@Pc(129) Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
					clipboard.setContents(transferable, null);
				} else if (type == 3) {
					if (breakConnectionsUntil > MonotonicClock.currentTimeMillis()) {
						throw new IOException();
					}
					@Pc(188) String ip = (request.intArg1 >> 24 & 0xFF) + "." + (request.intArg1 >> 16 & 0xFF) + "." + (request.intArg1 >> 8 & 0xFF) + "." + (request.intArg1 & 0xFF);
					request.result = InetAddress.getByName(ip).getHostName();
				} else if (type == 5) {
					request.result = this.fullScreenManager.getDisplayModes();
				} else if (type == 6) {
					@Pc(214) Frame frame = new Frame("OpenRS2 Full Screen");
					request.result = frame;
					frame.setResizable(false);
					this.fullScreenManager.enter(frame, request.intArg1 >>> 16, request.intArg1 & 0xFFFF, request.intArg2 >> 16, request.intArg2 & 0xFFFF);
				} else if (type == 7) {
					this.fullScreenManager.exit();
				} else if (type == 10) {
					@Pc(610) Class<?>[] loadParameters = new Class<?>[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
					@Pc(612) Runtime runtime = Runtime.getRuntime();
					if (!osName.startsWith("mac")) {
						@Pc(623) Method loadLibrary0 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", loadParameters);
						loadLibrary0.setAccessible(true);
						loadLibrary0.invoke(runtime, request.objectArg, "jawt");
						loadLibrary0.setAccessible(false);
					}
					@Pc(650) Method load0 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", loadParameters);
					load0.setAccessible(true);
					if (osName.startsWith("linux")) {
						load0.invoke(runtime, request.objectArg, getFile("libjaggl_dri.so", this.cacheId, this.cacheSubDir).toString());
						@Pc(690) Class<?> driHack = ((Class<?>) request.objectArg).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
						driHack.getMethod("begin").invoke(null);
						load0.invoke(runtime, request.objectArg, getFile("libjaggl.so", this.cacheId, this.cacheSubDir).toString());
						driHack.getMethod("end").invoke(null);
					} else if (osName.startsWith("mac")) {
						load0.invoke(runtime, request.objectArg, getFile("libjaggl.dylib", this.cacheId, this.cacheSubDir).toString());
					} else if (osName.startsWith("win")) {
						load0.invoke(runtime, request.objectArg, getFile("jaggl.dll", this.cacheId, this.cacheSubDir).toString());
					} else {
						throw new Exception();
					}
					load0.setAccessible(false);
				} else if (type == 11) {
					@Pc(529) Field nativeLibraries = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
					nativeLibraries.setAccessible(true);
					@Pc(540) Vector<?> vector = (Vector<?>) nativeLibraries.get(((Class<?>) request.objectArg).getClassLoader());
					for (@Pc(542) int i = 0; i < vector.size(); i++) {
						@Pc(554) Object library = vector.elementAt(i);
						@Pc(561) Method finalize = library.getClass().getDeclaredMethod("finalize");
						finalize.setAccessible(true);
						finalize.invoke(library);
						finalize.setAccessible(false);
						@Pc(578) Field handle = library.getClass().getDeclaredField("handle");
						handle.setAccessible(true);
						handle.set(library, 0);
						handle.setAccessible(false);
					}
					nativeLibraries.setAccessible(false);
				} else if (type == 12) {
					@Pc(516) String cacheSubDir = (String) request.objectArg;
					@Pc(520) FileOnDisk preferences = openPreferencesInternal(cacheSubDir);
					request.result = preferences;
				} else if (type == 14) {
					@Pc(273) int x = request.intArg1;
					@Pc(276) int y = request.intArg2;
					this.cursorManager.setPosition(x, y);
				} else if (type == 15) {
					@Pc(495) Component component = (Component) request.objectArg;
					@Pc(505) boolean reset = request.intArg1 != 0;
					this.cursorManager.setComponent(component, reset);
				} else if (type == 17) {
					@Pc(469) Object[] args = (Object[]) request.objectArg;
					this.cursorManager.setCursor((Component) args[0], request.intArg1, request.intArg2, (int[]) args[1], (Point) args[2]);
				} else if (type == 16) {
					try {
						if (!osName.startsWith("win")) {
							throw new Exception();
						}
						@Pc(308) String url = (String) request.objectArg;
						if (!url.startsWith("http://") && !url.startsWith("https://")) {
							throw new Exception();
						}
						@Pc(323) String safeChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
						for (@Pc(325) int i = 0; i < url.length(); i++) {
							if (safeChars.indexOf(url.charAt(i)) == -1) {
								throw new Exception();
							}
						}
						Runtime.getRuntime().exec("cmd /c start \"j\" \"" + url + "\"");
						request.result = null;
					} catch (@Pc(362) Exception ex) {
						request.result = ex;
					}
				} else if (type == 20) {
					try {
						@Pc(386) Class<?>[] loadParameters = new Class<?>[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
						@Pc(388) Runtime runtime = Runtime.getRuntime();
						@Pc(394) Method load0 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", loadParameters);
						load0.setAccessible(true);
						if (osName.startsWith("win")) {
							load0.invoke(runtime, request.objectArg, getFile("jagmisc.dll", this.cacheId, this.cacheSubDir).toString());
						}
						load0.setAccessible(false);
					} catch (@Pc(460) Throwable ex) {
						request.result = ex;
					}
				} else {
					throw new Exception();
				}
				request.status = 1;
			} catch (@Pc(881) ThreadDeath ex) {
				throw ex;
			} catch (@Pc(884) Throwable ex) {
				request.status = 2;
			}
		}
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lsignlink!vk;")
	public final PrivilegedRequest exitFullScreen(@OriginalArg(0) Frame frame) {
		return this.enqueue(7, 0, 0, frame);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(I)Lsignlink!vk;")
	public final PrivilegedRequest getDisplayModes() {
		return this.enqueue(5, 0, 0, null);
	}

	@OriginalMember(owner = "signlink!pm", name = "b", descriptor = "(I)V")
	public final void breakConnection() {
		breakConnectionsUntil = MonotonicClock.currentTimeMillis() + (long) 5000;
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;[Ljava/lang/Class;)Lsignlink!vk;")
	public final PrivilegedRequest getDeclaredMethod(@OriginalArg(2) Class<?> clazz, @OriginalArg(0) String name, @OriginalArg(3) Class[] parameterTypes) {
		return this.enqueue(8, 0, 0, new Object[] { clazz, name, parameterTypes });
	}

	@OriginalMember(owner = "signlink!pm", name = "d", descriptor = "(B)Lsignlink!le;")
	public final AudioSource getAudioSource() {
		return this.audioSource;
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(ILjava/lang/Class;)Lsignlink!vk;")
	public final PrivilegedRequest loadGlNatives(@OriginalArg(1) Class<?> clazz) {
		return this.enqueue(10, 0, 0, clazz);
	}

	@OriginalMember(owner = "signlink!pm", name = "c", descriptor = "(B)Z")
	public final boolean isFullScreenSupported() {
		return this.fullScreenManager != null;
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(Ljava/net/URL;I)Lsignlink!vk;")
	public final PrivilegedRequest openUrlStream(@OriginalArg(0) URL url) {
		return this.enqueue(4, 0, 0, url);
	}

	@OriginalMember(owner = "signlink!pm", name = "b", descriptor = "(Ljava/lang/String;B)Lsignlink!vk;")
	public final PrivilegedRequest openPreferences(@OriginalArg(0) String cacheSubDir) {
		return this.enqueue(12, 0, 0, cacheSubDir);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(B)V")
	public final void stop() {
		synchronized (this) {
			this.stop = true;
			this.notifyAll();
		}
		try {
			this.thread.join();
		} catch (@Pc(21) InterruptedException ex) {
		}
		if (this.cacheData != null) {
			try {
				this.cacheData.close();
			} catch (@Pc(31) IOException ex) {
			}
		}
		if (this.cacheMasterIndex != null) {
			try {
				this.cacheMasterIndex.close();
			} catch (@Pc(49) IOException ex) {
			}
		}
		if (this.cacheIndexes != null) {
			for (@Pc(56) int i = 0; i < this.cacheIndexes.length; i++) {
				if (this.cacheIndexes[i] != null) {
					try {
						this.cacheIndexes[i].close();
					} catch (@Pc(80) IOException ex) {
					}
				}
			}
		}
		if (this.uid != null) {
			try {
				this.uid.close();
			} catch (@Pc(91) IOException ex) {
			}
		}
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lsignlink!vk;")
	public final PrivilegedRequest startThread(@OriginalArg(2) Runnable runnable, @OriginalArg(0) int priority) {
		return this.enqueue(2, priority, 0, runnable);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(IIIBI)Lsignlink!vk;")
	public final PrivilegedRequest enterFullScreen(@OriginalArg(1) int width, @OriginalArg(2) int height, @OriginalArg(4) int bitDepth) {
		return this.enqueue(6, height + (width << 16), bitDepth << 16, null);
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lsignlink!vk;")
	public final PrivilegedRequest getDeclaredField(@OriginalArg(2) Class<?> clazz, @OriginalArg(1) String name) {
		return this.enqueue(9, 0, 0, new Object[] { clazz, name });
	}

	@OriginalMember(owner = "signlink!pm", name = "a", descriptor = "(ILjava/lang/String;I)Lsignlink!vk;")
	public final PrivilegedRequest openSocket(@OriginalArg(1) String hostname, @OriginalArg(2) int port) {
		return this.enqueue(1, port, 0, hostname);
	}
}

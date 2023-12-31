import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.security.MessageDigest;
import java.util.zip.Inflater;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!loader")
public final class loader extends Applet implements Runnable {

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/lang/String;")
	private static String crashUrl;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String unsignedUrl;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/lang/String;")
	private static String cacheSubDir;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet applet;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int width;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int height;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean error = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean destroyed = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean started = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean stopped = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int language = 0;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int cacheId = 32;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;[BZB)Z")
	private boolean isChecksumValid(@OriginalArg(0) Resource resource, @OriginalArg(1) byte[] bytes, @OriginalArg(2) boolean suppressSha) {
		try {
			if (bytes == null) {
				return false;
			}
			@Pc(9) MessageDigest digest = MessageDigest.getInstance("SHA");
			digest.reset();
			digest.update(bytes);
			@Pc(22) byte[] checksum = digest.digest();
			for (@Pc(24) int i = 0; i < 20; i++) {
				if (checksum[i] != resource.checksum[i]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception ex) {
			this.error("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.destroyed = true;
		this.started = this.stopped = false;
		if (this.applet != null) {
			this.applet.destroy();
		}
		this.applet = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void error(@OriginalArg(1) String error) {
		if (this.error) {
			return;
		}
		this.error = true;
		try {
			if (crashUrl == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + error + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(crashUrl + "&s=" + error), "_parent");
			}
		} catch (@Pc(56) Exception ex) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!b;)[B")
	private byte[] download(@OriginalArg(0) boolean jaggrab, @OriginalArg(2) Resource resource) {
		@Pc(8) Font font = new Font("Helvetica", Font.BOLD, 13);
		@Pc(12) FontMetrics metrics = this.getFontMetrics(font);
		@Pc(17) Color color = new Color(0x8C1111);
		@Pc(21) byte[] bytes = new byte[resource.compressedSize];
		try {
			@Pc(63) InputStream in;
			if (jaggrab) {
				@Pc(26) URL codeBase = this.getCodeBase();
				@Pc(34) Socket socket = new Socket(InetAddress.getByName(codeBase.getHost()), 443);
				socket.setSoTimeout(10000);
				@Pc(40) OutputStream out = socket.getOutputStream();
				out.write(17);
				out.write(("JAGGRAB " + codeBase.getFile() + resource.source + "\n\n").getBytes());
				in = socket.getInputStream();
			} else {
				in = (new URL(this.getCodeBase(), resource.source)).openStream();
			}
			@Pc(76) int prevPercentage = -1;
			@Pc(86) int off = 0;
			while (off < bytes.length) {
				@Pc(100) int len = bytes.length - off;
				if (len > 1000) {
					len = 1000;
				}
				@Pc(113) int n = in.read(bytes, off, len);
				if (n < 0) {
					throw new EOFException();
				}
				off += n;
				@Pc(134) int percentage = off * 100 / bytes.length;
				if (percentage != prevPercentage) {
					try {
						@Pc(145) Graphics graphics = this.getGraphics();
						if (graphics == null) {
							this.repaint();
						} else {
							graphics.setColor(Color.black);
							graphics.fillRect(0, 0, this.width, this.height);
							prevPercentage = percentage;
							graphics.setColor(color);
							graphics.drawRect(this.width / 2 - 152, this.height / 2 - 18, 303, 33);
							@Pc(196) String message = resource.loadingMessages[this.language] + " - " + percentage + "%";
							graphics.setFont(font);
							graphics.setColor(Color.white);
							graphics.drawString(message, (this.width - metrics.stringWidth(message)) / 2, this.height / 2 + 4);
						}
					} catch (@Pc(225) Exception ex) {
					}
				}
			}
			in.close();
			if (resource.compressedSize != resource.uncompressedSize) {
				@Pc(242) byte[] uncompressed = new byte[resource.uncompressedSize];
				@Pc(247) Inflater inflater = new Inflater(true);
				inflater.setInput(bytes);
				bytes = uncompressed;
				inflater.inflate(uncompressed);
			}
		} catch (@Pc(258) Exception ex) {
			return null;
		}
		return this.isChecksumValid(resource, bytes, false) ? bytes : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILsignlink!pm;Lloader!b;)[B")
	private byte[] getResource(@OriginalArg(0) boolean suppressSha, @OriginalArg(2) SignLink signLink, @OriginalArg(3) Resource resource) {
		@Pc(7) File file;
		try {
			file = SignLink.getFile(resource.destination, this.cacheId, cacheSubDir);
		} catch (@Pc(9) Exception ex) {
			this.error("nocache");
			return null;
		}
		@Pc(26) byte[] bytes = this.loadFile(file);
		if (!this.isChecksumValid(resource, bytes, suppressSha)) {
			@Pc(39) byte[] downloadedBytes = this.download(false, resource);
			if (downloadedBytes == null) {
				downloadedBytes = this.download(true, resource);
			}
			if (downloadedBytes == null) {
				this.error("download");
				return null;
			}
			if (!this.saveFile(downloadedBytes, file)) {
				return null;
			}
			bytes = this.loadFile(file);
			if (!this.isChecksumValid(resource, bytes, false)) {
				this.error("mismatch");
				return null;
			}
		}
		return bytes;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics graphics) {
		if (this.applet != null) {
			this.applet.paint(graphics);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.stopped = false;
		this.started = true;
		if (this.applet != null) {
			this.applet.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics graphics) {
		if (this.applet != null) {
			this.applet.update(graphics);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.destroyed = false;
		@Pc(7) Thread thread = new Thread(this);
		thread.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.started = false;
		this.stopped = true;
		if (this.applet != null) {
			this.applet.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] loadFile(@OriginalArg(0) File file) {
		try {
			if (!file.exists()) {
				return null;
			}
			@Pc(8) int len = (int) file.length();
			@Pc(11) byte[] bytes = new byte[len];
			@Pc(29) DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			in.readFully(bytes, 0, len);
			in.close();
			return bytes;
		} catch (@Pc(39) IOException ex) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean saveFile(@OriginalArg(0) byte[] bytes, @OriginalArg(1) File file) {
		try {
			@Pc(4) FileOutputStream out = new FileOutputStream(file);
			out.write(bytes, 0, bytes.length);
			out.close();
			return true;
		} catch (@Pc(21) IOException ex) {
			this.error("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			unsignedUrl = this.getParameter("unsignedurl");
			if (unsignedUrl != null) {
				try {
					@Pc(10) SecurityManager securityManager = System.getSecurityManager();
					if (securityManager != null) {
						securityManager.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException ex) {
					this.error = true;
					try {
						this.getAppletContext().showDocument(new URL(unsignedUrl), "_parent");
					} catch (@Pc(31) Exception innerEx) {
					}
					return;
				}
			}
			@Pc(36) String pre142Url = this.getParameter("pre142url");
			if (pre142Url != null) {
				try {
					@Pc(42) String javaVersion = System.getProperty("java.version");
					if (javaVersion.startsWith("1.3.") || javaVersion.startsWith("1.4.0") || javaVersion.startsWith("1.4.1")) {
						this.getAppletContext().showDocument(new URL(pre142Url), "_self");
					}
				} catch (@Pc(64) Exception ex) {
				}
			}
			crashUrl = this.getParameter("crashurl");
			cacheSubDir = this.getParameter("cachesubdir");
			if (cacheSubDir == null) {
				cacheSubDir = "openrs2";
			}
			this.width = this.getSize().width;
			this.height = this.getSize().height;
			try {
				@Pc(92) int modeWhat = Integer.parseInt(this.getParameter("modewhat"));
				this.cacheId += modeWhat;
			} catch (@Pc(100) Exception ex) {
			}
			try {
				@Pc(104) String language = this.getParameter("lang");
				if (language != null) {
					this.language = Integer.parseInt(language);
				}
			} catch (@Pc(112) Exception ex) {
			}
			@Pc(121) SignLink signLink;
			try {
				signLink = new SignLink(this, this.cacheId, cacheSubDir, 29);
			} catch (@Pc(123) Exception ex) {
				this.error("nocache");
				return;
			}
			@Pc(132) UnpackerClassLoader classLoader = new UnpackerClassLoader();
			try {
				Class.forName("java.util.jar.Pack200");
				@Pc(142) byte[] clientBytes = this.getResource(false, signLink, Resources.CLIENT_PACK200);
				if (clientBytes == null) {
					return;
				}
				classLoader.secondaryUnpacker = new Pack200Unpacker(clientBytes);
				@Pc(160) byte[] glBytes = this.getResource(false, signLink, Resources.GL_PACK200);
				if (glBytes == null) {
					return;
				}
				classLoader.primaryUnpacker = new Pack200Unpacker(glBytes);
			} catch (@Pc(171) Throwable ex) {
			}
			if (classLoader.secondaryUnpacker == null) {
				@Pc(182) byte[] unpackClassBytes = this.getResource(false, signLink, Resources.UNPACK_CLASS);
				if (unpackClassBytes == null) {
					return;
				}
				@Pc(189) UnpackerClassLoader unpackClassLoader = new UnpackerClassLoader();
				unpackClassLoader.secondaryUnpacker = new unpack(unpackClassBytes);
				@Pc(198) Class<?> clazz = Class.forName("unpack");
				unpackClassLoader.cache.put(clazz.getName(), clazz);
				clazz = unpackClassLoader.loadClass("unpackclass");
				@Pc(216) byte[] clientBytes = this.getResource(false, signLink, Resources.CLIENT_PACK_CLASS);
				if (clientBytes == null) {
					return;
				}
				classLoader.secondaryUnpacker = (unpack) clazz.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(clientBytes, Boolean.TRUE);
				@Pc(253) byte[] glBytes = this.getResource(false, signLink, Resources.GL_PACK_CLASS);
				if (glBytes == null) {
					return;
				}
				classLoader.primaryUnpacker = (unpack) clazz.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(glBytes, Boolean.TRUE);
			}
			@Pc(288) String osName = System.getProperty("os.name").toLowerCase();
			@Pc(292) String osArch = System.getProperty("os.arch").toLowerCase();
			byte platform;
			if (osName.startsWith("win")) {
				if (osArch.startsWith("amd64") || osArch.startsWith("x86_64")) {
					platform = 0;
				} else {
					platform = 1;
				}
			} else if (osName.startsWith("mac")) {
				if (osArch.startsWith("aarch64")) {
					platform = 2;
				} else if (osArch.startsWith("amd64") || osArch.startsWith("x86_64")) {
					platform = 3;
				} else {
					platform = 4;
				}
			} else if (osName.startsWith("linux")) {
				if (osArch.startsWith("amd64") || osArch.startsWith("x86_64")) {
					platform = 5;
				} else {
					platform = 6;
				}
			} else {
				this.error("os");
				return;
			}
			for (@Pc(337) int i = 0; i < Resources.GL_NATIVES[platform].length; i++) {
				@Pc(360) byte[] bytes = this.getResource(this.getParameter("suppress_sha") != null, signLink, Resources.GL_NATIVES[platform][i]);
				if (bytes == null) {
					return;
				}
			}
			if (Resources.MISC_NATIVES != null) {
				@Pc(376) String miscOsName = System.getProperty("os.name").toLowerCase();
				if (miscOsName.startsWith("win")) {
					@Pc(385) String miscOsArch = System.getProperty("os.arch").toLowerCase();
					byte miscPlatform;
					if (miscOsArch.startsWith("amd64") || miscOsArch.startsWith("x86_64")) {
						miscPlatform = 0;
					} else {
						miscPlatform = 1;
					}
					@Pc(413) byte[] bytes = this.getResource(this.getParameter("suppress_sha") != null, signLink, Resources.MISC_NATIVES[miscPlatform]);
					if (bytes == null) {
						return;
					}
				}
			}
			@Pc(420) Class<?> clazz = Class.forName("FileOnDisk");
			classLoader.cache.put(clazz.getName(), clazz);
			@Pc(430) Class<?> signLinkClass = Class.forName("SignLink");
			classLoader.cache.put(signLinkClass.getName(), signLinkClass);
			clazz = Class.forName("PrivilegedRequest");
			classLoader.cache.put(clazz.getName(), clazz);
			clazz = Class.forName("MonotonicClock");
			classLoader.cache.put(clazz.getName(), clazz);
			clazz = Class.forName("AudioSource");
			classLoader.cache.put(clazz.getName(), clazz);
			clazz = classLoader.loadClass("client");
			synchronized (this) {
				if (this.destroyed) {
					return;
				}
				this.applet = (Applet) clazz.getDeclaredConstructor().newInstance();
				clazz.getMethod("providesignlink", signLinkClass).invoke(null, signLink);
				this.applet.init();
				if (this.started) {
					this.applet.start();
				}
				if (this.stopped) {
					this.applet.stop();
				}
			}
		} catch (@Pc(532) Exception ex) {
			TracingException.clientCrc = 1713832515;
			if (ex instanceof InvocationTargetException) {
				@Pc(541) Throwable target = ((InvocationTargetException) ex).getTargetException();
				if (target instanceof ThreadDeath) {
					return;
				}
				TracingException.report(target, this, ex.toString());
			} else {
				TracingException.report(ex, this, null);
			}
			this.error("crash");
		}
	}
}

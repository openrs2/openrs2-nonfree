import java.io.IOException;
import java.net.Socket;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class LoginManager {
	@OriginalMember(owner = "client!po", name = "g", descriptor = "Lclient!wa;")
	private static final Packet buffer = new Packet(5000);

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	public static int step = 0;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public static int type = -1;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	private static int loops = 0;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
	private static int errors = 0;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "I")
	public static int autoStep = 0;

	@OriginalMember(owner = "client!kn", name = "E", descriptor = "I")
	public static int autoLoops = 0;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "I")
	public static int autoErrors = 0;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int reply = -2;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
	public static int hopTime = 0;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
	public static int disallowResult = -1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Ljava/lang/String;")
	public static String username = "";

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "Ljava/lang/String;")
	public static String password = "";

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "J")
	public static long encodedUsername;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "J")
	private static long serverKey = 0L;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public static int staffModLevel = 0;

	@OriginalMember(owner = "client!fj", name = "eb", descriptor = "I")
	public static int playerModLevel = 0;

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "Z")
	public static boolean parentalChatConsent = false;

	@OriginalMember(owner = "client!mo", name = "eb", descriptor = "Z")
	private static boolean parentalAdvertConsent = false;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "Z")
	public static boolean playerUnderage = false;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "Z")
	public static boolean mapQuickChat = false;

	@OriginalMember(owner = "client!wd", name = "qb", descriptor = "Z")
	public static boolean playerMember = false;

	@OriginalMember(owner = "client!vb", name = "bb", descriptor = "Z")
	public static boolean mapMembers = false;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V")
	public static void login(@OriginalArg(1) String username, @OriginalArg(0) String password, @OriginalArg(2) int type) {
		LoginManager.type = type;
		LoginManager.username = username;
		LoginManager.password = password;
		if (LoginManager.username.equals("") || LoginManager.password.equals("")) {
			reply = 3;
		} else if (client.worldId == -1) {
			autoLoops = 0;
			autoStep = 1;
			reply = -3;
			autoErrors = 0;
			@Pc(50) Buffer rsaBuffer = new Buffer(128);
			rsaBuffer.writeByte(10);
			rsaBuffer.writeInt((int) (Math.random() * 9.9999999E7D));
			rsaBuffer.writeLong(Base37.encode(LoginManager.username));
			rsaBuffer.writeInt((int) (Math.random() * 9.9999999E7D));
			rsaBuffer.writeString(LoginManager.password);
			rsaBuffer.writeInt((int) (Math.random() * 9.9999999E7D));
			rsaBuffer.rsaEncrypt(Protocol.EXPONENT, Protocol.MODULUS);
			Protocol.outboundBuffer.position = 0;
			Protocol.outboundBuffer.writeByte(24);
			Protocol.outboundBuffer.writeByte(rsaBuffer.position + 2);
			Protocol.outboundBuffer.writeShort(550);
			Protocol.outboundBuffer.writeBytes(rsaBuffer.bytes, rsaBuffer.position);
		} else {
			method101();
		}
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(B)V")
	public static void loop() {
		if (step == 0 || step == 5) {
			return;
		}
		try {
			if (++loops > 2000) {
				if (Protocol.socket != null) {
					Protocol.socket.close();
					Protocol.socket = null;
				}
				if (errors >= 1) {
					step = 0;
					reply = -5;
					return;
				}
				if (client.port == client.defaultPort) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
				errors++;
				step = 1;
				loops = 0;
			}
			if (step == 1) {
				Protocol.socketRequest = GameShell.signLink.openSocket(client.hostname, client.port);
				step = 2;
			}
			if (step == 2) {
				if (Protocol.socketRequest.status == 2) {
					throw new IOException();
				}
				if (Protocol.socketRequest.status != 1) {
					return;
				}
				Protocol.socket = new BufferedSocket((Socket) Protocol.socketRequest.result, GameShell.signLink);
				Protocol.socketRequest = null;
				@Pc(111) long encodedUsername = LoginManager.encodedUsername = Base37.encode(username);
				@Pc(118) int usernameHash = (int) (encodedUsername >> 16 & 0x1FL);
				Protocol.outboundBuffer.position = 0;
				Protocol.outboundBuffer.writeByte(14);
				Protocol.outboundBuffer.writeByte(usernameHash);
				Protocol.socket.write(Protocol.outboundBuffer.bytes, 2);
				if (client.musicChannel != null) {
					client.musicChannel.method2996();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method2996();
				}
				@Pc(152) int reply = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method2996();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method2996();
				}
				if (reply != 0) {
					LoginManager.reply = reply;
					step = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				step = 3;
			}
			if (step == 3) {
				if (Protocol.socket.available() < 8) {
					return;
				}
				@Pc(197) int[] key = new int[4];
				Protocol.socket.read(Protocol.inboundBuffer.bytes, 0, 8);
				Protocol.inboundBuffer.position = 0;
				serverKey = Protocol.inboundBuffer.readLong();
				key[1] = (int) (Math.random() * 9.9999999E7D);
				key[3] = (int) serverKey;
				key[0] = (int) (Math.random() * 9.9999999E7D);
				Protocol.outboundBuffer.position = 0;
				key[2] = (int) (serverKey >> 32);
				Protocol.outboundBuffer.writeByte(10);
				Protocol.outboundBuffer.writeInt(key[0]);
				Protocol.outboundBuffer.writeInt(key[1]);
				Protocol.outboundBuffer.writeInt(key[2]);
				Protocol.outboundBuffer.writeInt(key[3]);
				Protocol.outboundBuffer.writeLong(Base37.encode(username));
				Protocol.outboundBuffer.writeString(password);
				Protocol.outboundBuffer.rsaEncrypt(Protocol.EXPONENT, Protocol.MODULUS);
				buffer.position = 0;
				if (Static4.anInt3304 == 40) {
					buffer.writeByte(18);
				} else {
					buffer.writeByte(16);
				}
				buffer.writeShort(Protocol.outboundBuffer.position + Static19.method1791(client.settings) + 163);
				buffer.writeInt(550);
				buffer.writeByte(type);
				buffer.writeByte(client.advertSuppressed ? 1 : 0);
				buffer.writeByte(1);
				buffer.writeByte(Static11.method557());
				buffer.writeShort(GameShell.canvasWidth);
				buffer.writeShort(GameShell.canvasHeight);
				buffer.writeByte(Static2.anInt1125);
				Static32.method3949(buffer);
				buffer.writeString(client.settings);
				buffer.writeInt(client.affiliate);
				buffer.writeInt(Preferences.toInt());
				Preferences.sentToServer = true;
				buffer.writeShort(Static7.anInt5426);
				buffer.writeInt(client.js5Archive0.getChecksum());
				buffer.writeInt(client.js5Archive1.getChecksum());
				buffer.writeInt(client.js5Archive2.getChecksum());
				buffer.writeInt(client.js5Archive3.getChecksum());
				buffer.writeInt(client.js5Archive4.getChecksum());
				buffer.writeInt(client.js5Archive5.getChecksum());
				buffer.writeInt(client.js5Archive6.getChecksum());
				buffer.writeInt(client.js5Archive7.getChecksum());
				buffer.writeInt(client.js5Archive8.getChecksum());
				buffer.writeInt(client.js5Archive9.getChecksum());
				buffer.writeInt(client.js5Archive10.getChecksum());
				buffer.writeInt(client.js5Archive11.getChecksum());
				buffer.writeInt(client.js5Archive12.getChecksum());
				buffer.writeInt(client.js5Archive13.getChecksum());
				buffer.writeInt(client.js5Archive14.getChecksum());
				buffer.writeInt(client.js5Archive15.getChecksum());
				buffer.writeInt(client.js5Archive16.getChecksum());
				buffer.writeInt(client.js5Archive17.getChecksum());
				buffer.writeInt(client.js5Archive18.getChecksum());
				buffer.writeInt(client.js5Archive19.getChecksum());
				buffer.writeInt(client.js5Archive20.getChecksum());
				buffer.writeInt(client.js5Archive21.getChecksum());
				buffer.writeInt(client.js5Archive22.getChecksum());
				buffer.writeInt(client.js5Archive23.getChecksum());
				buffer.writeInt(client.js5Archive24.getChecksum());
				buffer.writeInt(client.js5Archive25.getChecksum());
				buffer.writeInt(client.js5Archive26.getChecksum());
				buffer.writeInt(client.js5Archive27.getChecksum());
				buffer.writeInt(client.js5Archive28.getChecksum());
				buffer.writeBytes(Protocol.outboundBuffer.bytes, Protocol.outboundBuffer.position);
				Protocol.socket.write(buffer.bytes, buffer.position);
				Protocol.outboundBuffer.setKey(key);
				for (@Pc(594) int i = 0; i < 4; i++) {
					key[i] += 50;
				}
				Protocol.inboundBuffer.setKey(key);
				step = 4;
			}
			if (step == 4) {
				if (Protocol.socket.available() < 1) {
					return;
				}
				@Pc(626) int reply = Protocol.socket.read();
				if (reply == 21) {
					step = 7;
				} else if (reply == 29) {
					step = 10;
				} else if (reply == 1) {
					LoginManager.reply = reply;
					step = 5;
					return;
				} else if (reply == 2) {
					step = 8;
				} else if (reply == 15) {
					LoginManager.reply = reply;
					step = 0;
					return;
				} else if (reply == 23 && errors < 1) {
					step = 1;
					loops = 0;
					errors++;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				} else {
					LoginManager.reply = reply;
					step = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
			}
			if (step == 6) {
				Protocol.outboundBuffer.position = 0;
				Protocol.outboundBuffer.writeOpcode(17);
				Protocol.socket.write(Protocol.outboundBuffer.bytes, Protocol.outboundBuffer.position);
				step = 4;
				return;
			}
			if (step == 7) {
				if (Protocol.socket.available() >= 1) {
					hopTime = Protocol.socket.read() * 60 + 180;
					step = 0;
					reply = 21;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				return;
			}
			if (step == 10) {
				if (Protocol.socket.available() < 1) {
					return;
				}
				disallowResult = Protocol.socket.read();
				reply = 29;
				step = 0;
				Protocol.socket.close();
				Protocol.socket = null;
				return;
			}
			if (step == 8) {
				if (Protocol.socket.available() < 14) {
					return;
				}
				Protocol.socket.read(Protocol.inboundBuffer.bytes, 0, 14);
				Protocol.inboundBuffer.position = 0;
				staffModLevel = Protocol.inboundBuffer.readUnsignedByte();
				playerModLevel = Protocol.inboundBuffer.readUnsignedByte();
				playerUnderage = Protocol.inboundBuffer.readUnsignedByte() == 1;
				parentalChatConsent = Protocol.inboundBuffer.readUnsignedByte() == 1;
				parentalAdvertConsent = Protocol.inboundBuffer.readUnsignedByte() == 1;
				mapQuickChat = Protocol.inboundBuffer.readUnsignedByte() == 1;
				MouseRecorder.enabled = Protocol.inboundBuffer.readUnsignedByte() == 1;
				PlayerList.selfId = Protocol.inboundBuffer.readUnsignedShort();
				playerMember = Protocol.inboundBuffer.readUnsignedByte() == 1;
				mapMembers = Protocol.inboundBuffer.readUnsignedByte() == 1;
				LocTypeList.setAllowMembers(mapMembers);
				ObjTypeList.setAllowMembers(mapMembers);
				NpcTypeList.setAllowMembers(mapMembers);
				if (!client.advertSuppressed) {
					if (playerUnderage && !parentalAdvertConsent || playerMember) {
						try {
							BrowserControl.call(GameShell.signLink.applet, "zap");
						} catch (@Pc(906) Throwable ex) {
						}
					} else {
						try {
							BrowserControl.call(GameShell.signLink.applet, "unzap");
						} catch (@Pc(916) Throwable ex) {
						}
					}
				}
				try {
					BrowserControl.call(GameShell.signLink.applet, "loggedin");
				} catch (@Pc(924) Throwable ex) {
				}
				Protocol.opcode = Protocol.inboundBuffer.readOpcode();
				Protocol.length = Protocol.inboundBuffer.readUnsignedShort();
				step = 9;
			}
			if (step == 9) {
				if (Protocol.socket.available() >= Protocol.length) {
					Protocol.inboundBuffer.position = 0;
					Protocol.socket.read(Protocol.inboundBuffer.bytes, 0, Protocol.length);
					reply = 2;
					step = 0;
					Static11.method559();
					Static4.centralZoneX = -1;
					Protocol.readRebuildPacket(false);
					Protocol.opcode = -1;
					return;
				}
				return;
			}
		} catch (@Pc(975) IOException ex) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (errors < 1) {
				errors++;
				step = 1;
				if (client.defaultPort == client.port) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
				loops = 0;
			} else {
				step = 0;
				reply = -4;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public static void loopAuto() {
		if (autoStep == 0) {
			return;
		}
		try {
			if (++autoLoops > 1500) {
				if (Protocol.socket != null) {
					Protocol.socket.close();
					Protocol.socket = null;
				}
				if (autoErrors >= 1) {
					reply = -5;
					autoStep = 0;
					return;
				}
				autoStep = 1;
				autoErrors++;
				if (client.worldListDefaultPort == client.worldListPort) {
					client.worldListPort = client.worldListAlternatePort;
				} else {
					client.worldListPort = client.worldListDefaultPort;
				}
				autoLoops = 0;
			}
			if (autoStep == 1) {
				Protocol.socketRequest = GameShell.signLink.openSocket(client.worldListHostname, client.worldListPort);
				autoStep = 2;
			}
			if (autoStep == 2) {
				if (Protocol.socketRequest.status == 2) {
					throw new IOException();
				}
				if (Protocol.socketRequest.status != 1) {
					return;
				}
				Protocol.socket = new BufferedSocket((Socket) Protocol.socketRequest.result, GameShell.signLink);
				Protocol.socketRequest = null;
				Protocol.socket.write(Protocol.outboundBuffer.bytes, Protocol.outboundBuffer.position);
				if (client.musicChannel != null) {
					client.musicChannel.method2996();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method2996();
				}
				@Pc(131) int reply = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method2996();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method2996();
				}
				if (reply != 101) {
					LoginManager.reply = reply;
					autoStep = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				autoStep = 3;
			}
			if (autoStep == 3) {
				if (Protocol.socket.available() < 2) {
					return;
				}
				@Pc(185) int worldId = Protocol.socket.read() << 8 | Protocol.socket.read();
				WorldList.switchWorld(worldId);
				if (client.worldId == -1) {
					autoStep = 0;
					reply = 6;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				autoStep = 0;
				Protocol.socket.close();
				Protocol.socket = null;
				method101();
				return;
			}
		} catch (@Pc(217) IOException ex) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (autoErrors < 1) {
				autoErrors++;
				autoLoops = 0;
				if (client.worldListPort == client.worldListDefaultPort) {
					client.worldListPort = client.worldListAlternatePort;
				} else {
					client.worldListPort = client.worldListDefaultPort;
				}
				autoStep = 1;
			} else {
				autoStep = 0;
				reply = -4;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V")
	public static void method101() {
		hopTime = 0;
		step = 1;
		Static1.aBoolean38 = false;
		errors = 0;
		loops = 0;
		disallowResult = -1;
		reply = -3;
	}
}

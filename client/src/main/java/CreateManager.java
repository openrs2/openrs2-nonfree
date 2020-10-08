import java.io.IOException;
import java.net.Socket;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class CreateManager {
	@OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
	public static int step = 0;

	@OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
	public static int reply = -2;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
	private static int errors = 0;

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
	private static int loops = 0;

	@OriginalMember(owner = "client!en", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] suggestedNames;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIIII)V")
	public static void checkInfo(@OriginalArg(4) int day, @OriginalArg(3) int month, @OriginalArg(1) int year, @OriginalArg(2) int country) {
		Protocol.outboundBuffer.position = 0;
		Protocol.outboundBuffer.writeByte(20);
		Protocol.outboundBuffer.writeByte(day);
		Protocol.outboundBuffer.writeByte(month);
		Protocol.outboundBuffer.writeShort(year);
		Protocol.outboundBuffer.writeShort(country);
		loops = 0;
		step = 1;
		reply = -3;
		errors = 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IJ)V")
	public static void checkName(@OriginalArg(1) long username) {
		Protocol.outboundBuffer.position = 0;
		Protocol.outboundBuffer.writeByte(21);
		Protocol.outboundBuffer.writeLong(username);
		reply = -3;
		loops = 0;
		errors = 0;
		step = 1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZIZILjava/lang/String;IIBJZLjava/lang/String;)V")
	public static void createAccount(@OriginalArg(8) long username, @OriginalArg(10) String password, @OriginalArg(4) String email, @OriginalArg(1) int day, @OriginalArg(5) int month, @OriginalArg(6) int year, @OriginalArg(3) int country, @OriginalArg(2) boolean runeScapeNewsletters, @OriginalArg(9) boolean otherNewsletters, @OriginalArg(0) boolean shareDetailsWithBusinessPartners) {
		@Pc(12) int[] key = new int[4];
		for (@Pc(14) int i = 0; i < 3; i++) {
			key[i] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(32) Buffer rsaBuffer = new Buffer(128);
		rsaBuffer.writeByte(10);
		rsaBuffer.writeShort((runeScapeNewsletters ? 1 : 0) | (otherNewsletters ? 2 : 0) | (shareDetailsWithBusinessPartners ? 4 : 0));
		rsaBuffer.writeLong(username);
		rsaBuffer.writeInt(key[0]);
		rsaBuffer.writeString(password);
		rsaBuffer.writeInt(key[1]);
		rsaBuffer.writeShort(client.affiliate);
		rsaBuffer.writeByte(day);
		rsaBuffer.writeByte(month);
		rsaBuffer.writeInt(key[2]);
		rsaBuffer.writeShort(year);
		rsaBuffer.writeShort(country);
		rsaBuffer.writeInt(key[3]);
		rsaBuffer.rsaEncrypt(Protocol.EXPONENT, Protocol.MODULUS);
		@Pc(118) Buffer xteaBuffer = new Buffer(350);
		xteaBuffer.writeString(email);
		@Pc(131) int padding = 8 - Buffer.getStringLength(email) % 8;
		for (@Pc(133) int i = 0; i < padding; i++) {
			xteaBuffer.writeByte((int) (Math.random() * 255.0D));
		}
		xteaBuffer.xteaEncrypt(key);
		Protocol.outboundBuffer.position = 0;
		Protocol.outboundBuffer.writeByte(22);
		Protocol.outboundBuffer.writeShort(xteaBuffer.position + rsaBuffer.position + 2);
		Protocol.outboundBuffer.writeShort(550);
		Protocol.outboundBuffer.writeBytes(rsaBuffer.bytes, rsaBuffer.position);
		Protocol.outboundBuffer.writeBytes(xteaBuffer.bytes, xteaBuffer.position);
		reply = -3;
		loops = 0;
		errors = 0;
		step = 1;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V")
	public static void loop() {
		if (step == 0) {
			return;
		}
		try {
			if (++loops > 2000) {
				if (Protocol.socket != null) {
					Protocol.socket.close();
					Protocol.socket = null;
				}
				if (errors >= 1) {
					reply = -5;
					step = 0;
					return;
				}
				loops = 0;
				step = 1;
				errors++;
				if (client.port == client.defaultPort) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
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
				Protocol.socket.write(Protocol.outboundBuffer.bytes, Protocol.outboundBuffer.position);
				if (client.musicChannel != null) {
					client.musicChannel.method2996();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method2996();
				}
				@Pc(129) int reply = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method2996();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method2996();
				}
				if (reply != 21) {
					CreateManager.reply = reply;
					step = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				step = 3;
			}
			if (step == 3) {
				if (Protocol.socket.available() < 1) {
					return;
				}
				suggestedNames = new String[Protocol.socket.read()];
				step = 4;
			}
			if (step == 4) {
				if (Protocol.socket.available() < suggestedNames.length * 8) {
					return;
				}
				Protocol.inboundBuffer.position = 0;
				Protocol.socket.read(Protocol.inboundBuffer.bytes, 0, suggestedNames.length * 8);
				for (@Pc(199) int i = 0; i < suggestedNames.length; i++) {
					suggestedNames[i] = Base37.decodeLowerCase(Protocol.inboundBuffer.readLong());
				}
				step = 0;
				reply = 21;
				Protocol.socket.close();
				Protocol.socket = null;
				return;
			}
		} catch (@Pc(226) IOException ex) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (errors >= 1) {
				step = 0;
				reply = -4;
			} else {
				loops = 0;
				step = 1;
				if (client.port == client.defaultPort) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
				errors++;
			}
		}
	}
}

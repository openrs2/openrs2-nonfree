import java.io.IOException;
import java.net.Socket;
import java.net.URL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class WorldList {
	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public static int step = 0;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
	private static int errors = 0;

	@OriginalMember(owner = "client!ue", name = "G", descriptor = "J")
	private static long openTime = 0L;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "J")
	private static long closeTime = 0L;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
	private static int checksum;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Z")
	public static boolean loaded = false;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
	private static int minId;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
	private static int maxId;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
	public static int size;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[Lclient!rf;")
	public static Country[] countries;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "[Lclient!gb;")
	private static World[] worlds;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[Lclient!gb;")
	private static World[] sorted = new World[0];

	@OriginalMember(owner = "client!r", name = "k", descriptor = "I")
	private static int iterator = 1;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "[B")
	private static byte[] buffer;

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
	private static int bufferOff = 0;

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
	private static int bufferLen = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B[B)Z")
	private static boolean decode(@OriginalArg(1) byte[] bytes) {
		@Pc(8) Buffer buffer = new Buffer(bytes);
		@Pc(12) int updated = buffer.readUnsignedByte();
		if (updated != 1) {
			return false;
		}
		@Pc(38) boolean worldsUpdated = buffer.readUnsignedByte() == 1;
		if (worldsUpdated) {
			decodeWorlds(buffer);
		}
		decodePlayers(buffer);
		return true;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!fd;)V")
	private static void decodeWorlds(@OriginalArg(1) Buffer buffer) {
		@Pc(9) int countryCount = buffer.readUnsignedShortSmart();
		countries = new Country[countryCount];
		for (@Pc(14) int i = 0; i < countryCount; i++) {
			countries[i] = new Country();
			countries[i].flag = buffer.readUnsignedShortSmart();
			countries[i].name = buffer.readVersionedString();
		}
		minId = buffer.readUnsignedShortSmart();
		maxId = buffer.readUnsignedShortSmart();
		size = buffer.readUnsignedShortSmart();
		worlds = new World[maxId + 1 - minId];
		for (@Pc(69) int i = 0; i < size; i++) {
			@Pc(80) int offset = buffer.readUnsignedShortSmart();
			@Pc(88) World world = worlds[offset] = new World();
			world.country = buffer.readUnsignedByte();
			world.flags = buffer.readInt();
			world.id = minId + offset;
			world.activity = buffer.readVersionedString();
			world.hostname = buffer.readVersionedString();
		}
		checksum = buffer.readInt();
		loaded = true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!fd;)V")
	private static void decodePlayers(@OriginalArg(1) Buffer buffer) {
		for (@Pc(3) int i = 0; i < size; i++) {
			@Pc(14) int id = buffer.readUnsignedShortSmart();
			@Pc(18) int players = buffer.readUnsignedShort();
			if (players == 65535) {
				players = -1;
			}
			if (worlds[id] != null) {
				worlds[id].players = players;
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)Lclient!gb;")
	public static World get(@OriginalArg(1) int id) {
		return loaded && id >= minId && id <= maxId ? worlds[id - minId] : null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIZI)V")
	public static void sort(@OriginalArg(2) int primaryField, @OriginalArg(0) boolean primaryDesc, @OriginalArg(4) int secondaryField, @OriginalArg(3) boolean secondaryDesc) {
		sort(primaryField, primaryDesc, secondaryField, secondaryDesc, 0, sorted.length - 1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZIIIZII)V")
	private static void sort(@OriginalArg(2) int primaryField, @OriginalArg(0) boolean primaryDesc, @OriginalArg(1) int secondaryField, @OriginalArg(4) boolean secondaryDesc, @OriginalArg(5) int lo, @OriginalArg(3) int hi) {
		if (lo >= hi) {
			return;
		}
		@Pc(15) int mid = (hi + lo) / 2;
		@Pc(17) int i = lo;
		@Pc(21) World pivot = sorted[mid];
		sorted[mid] = sorted[hi];
		sorted[hi] = pivot;
		for (@Pc(33) int j = lo; j < hi; j++) {
			if (compare(sorted[j], pivot, primaryField, primaryDesc, secondaryField, secondaryDesc) <= 0) {
				@Pc(55) World world = sorted[j];
				sorted[j] = sorted[i];
				sorted[i++] = world;
			}
		}
		sorted[hi] = sorted[i];
		sorted[i] = pivot;
		sort(primaryField, primaryDesc, secondaryField, secondaryDesc, lo, i - 1);
		sort(primaryField, primaryDesc, secondaryField, secondaryDesc, i + 1, hi);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLclient!gb;ZLclient!gb;IZ)I")
	private static int compare(@OriginalArg(4) World x, @OriginalArg(2) World y, @OriginalArg(0) int primaryField, @OriginalArg(1) boolean primaryDesc, @OriginalArg(5) int secondaryField, @OriginalArg(3) boolean secondaryDesc) {
		@Pc(15) int primary = compare(x, y, primaryField, primaryDesc);
		if (primary != 0) {
			return primaryDesc ? -primary : primary;
		} else if (secondaryField == -1) {
			return 0;
		} else {
			@Pc(40) int secondary = compare(x, y, secondaryField, secondaryDesc);
			return secondaryDesc ? -secondary : secondary;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!gb;ILclient!gb;Z)I")
	private static int compare(@OriginalArg(3) World x, @OriginalArg(1) World y, @OriginalArg(2) int field, @OriginalArg(4) boolean desc) {
		if (field == 1) {
			@Pc(11) int xPlayers = x.players;
			@Pc(14) int yPlayers = y.players;
			if (!desc) {
				if (yPlayers == -1) {
					yPlayers = 2001;
				}
				if (xPlayers == -1) {
					xPlayers = 2001;
				}
			}
			return xPlayers - yPlayers;
		} else if (field == 2) {
			return StringUtils.compare(x.getCountry().name, y.getCountry().name, client.language);
		} else if (field == 3) {
			if (x.activity.equals("-")) {
				if (y.activity.equals("-")) {
					return 0;
				} else if (desc) {
					return -1;
				} else {
					return 1;
				}
			} else if (y.activity.equals("-")) {
				return desc ? 1 : -1;
			} else {
				return StringUtils.compare(x.activity, y.activity, client.language);
			}
		} else if (field == 4) {
			return x.isLootShare() ? (y.isLootShare() ? 0 : 1) : y.isLootShare() ? -1 : 0;
		} else if (field == 5) {
			return x.isQuickChat() ? (y.isQuickChat() ? 0 : 1) : y.isQuickChat() ? -1 : 0;
		} else if (field == 6) {
			return x.isPvp() ? (y.isPvp() ? 0 : 1) : y.isPvp() ? -1 : 0;
		} else if (field == 7) {
			return x.isMembers() ? (y.isMembers() ? 0 : 1) : y.isMembers() ? -1 : 0;
		} else {
			return x.id - y.id;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Z")
	public static boolean switchWorld(@OriginalArg(1) int id) {
		@Pc(8) World world = get(id);
		if (world == null) {
			return false;
		} else if (SignLink.anInt6106 == 1 || SignLink.anInt6106 == 2 || client.modeWhere == 2) {
			client.hostname = world.hostname;
			client.worldId = world.id;
			if (client.modeWhere != 0) {
				client.alternatePort = client.worldId + 50000;
				client.defaultPort = client.worldId + 40000;
				client.port = client.defaultPort;
			}
			return true;
		} else {
			@Pc(52) String port = "";
			@Pc(54) String settings = "";
			if (client.settings != null) {
				settings = "/p=" + client.settings;
			}
			if (client.modeWhere != 0) {
				port = ":" + (world.id + 7000);
			}
			@Pc(130) String url = "http://" + world.hostname + port + "/l=" + client.language + "/a=" + client.affiliate + settings + "/j" + (client.javaScript ? "1" : "0") + ",o" + (client.objectTag ? "1" : "0") + ",a2,m" + (client.advertSuppressed ? "1" : "0");
			try {
				client.instance.getAppletContext().showDocument(new URL(url), "_self");
				return true;
			} catch (@Pc(140) Exception ex) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)Lclient!gb;")
	public static World head() {
		iterator = 0;
		return next();
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)Lclient!gb;")
	public static World next() {
		return iterator >= sorted.length ? null : sorted[iterator++];
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
	public static int fetch() {
		try {
			if (step == 0) {
				if (MonotonicClock.currentTimeMillis() - 5000L < closeTime) {
					return 0;
				}
				Protocol.socketRequest = GameShell.signLink.openSocket(client.worldListHostname, client.worldListPort);
				openTime = MonotonicClock.currentTimeMillis();
				step = 1;
			}
			if (MonotonicClock.currentTimeMillis() > openTime + 30000L) {
				return close(1000);
			}
			if (step == 1) {
				if (Protocol.socketRequest.status == 2) {
					return close(1001);
				}
				if (Protocol.socketRequest.status != 1) {
					return -1;
				}
				Protocol.socket = new BufferedSocket((Socket) Protocol.socketRequest.result, GameShell.signLink);
				Protocol.socketRequest = null;
				@Pc(79) int checksum = 0;
				if (loaded) {
					checksum = WorldList.checksum;
				}
				Protocol.outboundBuffer.position = 0;
				Protocol.outboundBuffer.writeByte(23);
				Protocol.outboundBuffer.writeInt(checksum);
				Protocol.socket.write(Protocol.outboundBuffer.bytes, Protocol.outboundBuffer.position);
				if (client.musicChannel != null) {
					client.musicChannel.method2996();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method2996();
				}
				@Pc(117) int reply = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method2996();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method2996();
				}
				if (reply != 0) {
					return close(reply);
				}
				step = 2;
			}
			if (step == 2) {
				if (Protocol.socket.available() < 2) {
					return -1;
				}
				bufferLen = Protocol.socket.read();
				bufferLen <<= 8;
				bufferLen += Protocol.socket.read();
				buffer = new byte[bufferLen];
				bufferOff = 0;
				step = 3;
			}
			if (step != 3) {
				return -1;
			}
			@Pc(189) int n = Protocol.socket.available();
			if (n < 1) {
				return -1;
			}
			if (n > bufferLen - bufferOff) {
				n = bufferLen - bufferOff;
			}
			Protocol.socket.read(buffer, bufferOff, n);
			bufferOff += n;
			if (bufferOff < bufferLen) {
				return -1;
			} else if (decode(buffer)) {
				@Pc(233) int i = 0;
				sorted = new World[size];
				for (@Pc(238) int id = minId; id <= maxId; id++) {
					@Pc(249) World world = get(id);
					if (world != null) {
						sorted[i++] = world;
					}
				}
				Protocol.socket.close();
				buffer = null;
				step = 0;
				errors = 0;
				Protocol.socket = null;
				closeTime = MonotonicClock.currentTimeMillis();
				return 0;
			} else {
				return close(1002);
			}
		} catch (@Pc(278) IOException ex) {
			return close(1003);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I")
	private static int close(@OriginalArg(1) int reply) {
		if (Protocol.socket != null) {
			Protocol.socket.close();
			Protocol.socket = null;
		}
		errors++;
		if (errors > 4) {
			step = 0;
			errors = 0;
			return reply;
		}
		step = 0;
		if (client.worldListDefaultPort == client.worldListPort) {
			client.worldListPort = client.worldListAlternatePort;
		} else {
			client.worldListPort = client.worldListDefaultPort;
		}
		return -1;
	}
}

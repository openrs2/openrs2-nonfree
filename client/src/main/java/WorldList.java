import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class WorldList {
	@OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
	public static int checksum;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Z")
	public static boolean loaded = false;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
	public static int minId;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
	public static int maxId;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
	public static int size;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[Lclient!rf;")
	public static Country[] countries;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "[Lclient!gb;")
	private static World[] worlds;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[Lclient!gb;")
	public static World[] sorted = new World[0];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B[B)Z")
	public static boolean decode(@OriginalArg(1) byte[] bytes) {
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
}

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
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class MelTypeList {
	@OriginalMember(owner = "client!km", name = "Z", descriptor = "Lclient!cc;")
	private static SoftLruHashTable types = new SoftLruHashTable(128);

	@OriginalMember(owner = "client!im", name = "m", descriptor = "Lclient!cc;")
	public static SoftLruHashTable sprites = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Lclient!fh;")
	public static Js5 spritesArchive;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLclient!fh;Lclient!fh;)V")
	public static void init(@OriginalArg(1) Js5 archive, @OriginalArg(2) Js5 spritesArchive) {
		MelTypeList.archive = archive;
		MelTypeList.spritesArchive = spritesArchive;
		MelTypeList.archive.getGroupCapacity(36);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)Lclient!ho;")
	public static MelType get(@OriginalArg(1) int id) {
		@Pc(10) MelType type = (MelType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(26) byte[] bytes = archive.fetchFile(36, id);
		@Pc(30) MelType newType = new MelType();
		newType.id = id;
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	public static void resize(@OriginalArg(0) int capacity, @OriginalArg(1) int spritesCapacity) {
		types = new SoftLruHashTable(capacity);
		sprites = new SoftLruHashTable(spritesCapacity);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void clear() {
		types.clear();
		sprites.clear();
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
		sprites.removeSoft();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
	public static void clean() {
		types.clean(5);
		sprites.clean(5);
	}
}

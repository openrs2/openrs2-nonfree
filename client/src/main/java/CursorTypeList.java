import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class CursorTypeList {
	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!rh", name = "ab", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable sprites = new SoftLruHashTable(2);

	@OriginalMember(owner = "client!af", name = "E", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!fh;")
	public static Js5 spritesArchive;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!fh;ILclient!fh;)V")
	public static void init(@OriginalArg(0) Js5 archive, @OriginalArg(2) Js5 spritesArchive) {
		CursorTypeList.spritesArchive = spritesArchive;
		CursorTypeList.archive = archive;
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(II)Lclient!pe;")
	public static CursorType get(@OriginalArg(1) int id) {
		@Pc(14) CursorType type = (CursorType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(28) byte[] bytes = archive.fetchFile(33, id);
		@Pc(32) CursorType newType = new CursorType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes), id);
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void clear() {
		types.clear();
		sprites.clear();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
		sprites.clean(5);
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
		sprites.removeSoft();
	}
}

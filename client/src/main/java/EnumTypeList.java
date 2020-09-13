import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class EnumTypeList {
	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!dj;")
	private static final LruHashTable types = new LruHashTable(128);

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!fh;)V")
	public static void init(@OriginalArg(1) Js5 archive) {
		EnumTypeList.archive = archive;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)Lclient!cj;")
	public static EnumType get(@OriginalArg(1) int id) {
		@Pc(6) EnumType type = (EnumType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(33) byte[] bytes = archive.fetchFile(getGroupId(id), getFileId(id));
		@Pc(37) EnumType newType = new EnumType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)I")
	private static int getGroupId(@OriginalArg(0) int id) {
		return id >>> 8;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I")
	private static int getFileId(@OriginalArg(1) int id) {
		return id & 0xFF;
	}
}

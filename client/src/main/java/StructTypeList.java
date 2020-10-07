import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class StructTypeList {
	@OriginalMember(owner = "client!gm", name = "c", descriptor = "Lclient!dj;")
	private static final LruHashTable types = new LruHashTable(64);

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)Lclient!ro;")
	public static StructType get(@OriginalArg(1) int id) {
		@Pc(6) StructType type = (StructType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(21) byte[] bytes = archive.fetchFile(26, id);
		@Pc(25) StructType newType = new StructType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!fh;)V")
	public static void init(@OriginalArg(1) Js5 archive) {
		StructTypeList.archive = archive;
	}
}

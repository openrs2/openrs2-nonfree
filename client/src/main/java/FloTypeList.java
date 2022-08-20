import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class FloTypeList {
	@OriginalMember(owner = "client!io", name = "B", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!in", name = "q", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
	public static int capacity;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		FloTypeList.archive = archive;
		capacity = FloTypeList.archive.getGroupCapacity(4);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Lclient!oh;")
	public static FloType get(@OriginalArg(1) int id) {
		@Pc(6) FloType type = (FloType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(27) byte[] bytes = archive.fetchFile(4, id);
		@Pc(31) FloType newType = new FloType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes), id);
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)V")
	public static void clean() {
		types.clean(5);
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}
}

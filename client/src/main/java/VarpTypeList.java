import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class VarpTypeList {
	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
	public static int capacity;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		VarpTypeList.archive = archive;
		capacity = VarpTypeList.archive.getGroupCapacity(16);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Lclient!hi;")
	public static VarpType get(@OriginalArg(1) int id) {
		@Pc(17) VarpType type = (VarpType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(29) byte[] bytes = archive.fetchFile(16, id);
		@Pc(33) VarpType newType = new VarpType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(BI)V")
	public static void clean() {
		types.clean(5);
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
	}
}

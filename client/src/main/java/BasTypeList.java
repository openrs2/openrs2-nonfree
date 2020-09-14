import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class BasTypeList {
	@OriginalMember(owner = "client!sh", name = "T", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!fh;)V")
	public static void init(@OriginalArg(1) Js5 archive) {
		BasTypeList.archive = archive;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lclient!d;")
	public static BasType get(@OriginalArg(1) int id) {
		@Pc(10) BasType type = (BasType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(27) byte[] bytes = archive.fetchFile(32, id);
		@Pc(31) BasType newType = new BasType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		newType.postDecode();
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(B)V")
	public static void removeSoft() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(BI)V")
	public static void clean() {
		types.clean(5);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}
}

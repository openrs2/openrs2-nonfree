import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class IdkTypeList {
	@OriginalMember(owner = "client!vb", name = "V", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Lclient!fh;")
	public static Js5 modelsArchive;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
	public static int capacity;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!fh;Lclient!fh;)V")
	public static void init(@OriginalArg(2) Js5 archive, @OriginalArg(1) Js5 modelsArchive) {
		IdkTypeList.modelsArchive = modelsArchive;
		IdkTypeList.archive = archive;
		capacity = IdkTypeList.archive.getGroupCapacity(3);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Lclient!qa;")
	public static IdkType get(@OriginalArg(1) int id) {
		@Pc(6) IdkType type = (IdkType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(27) byte[] bytes = archive.fetchFile(3, id);
		@Pc(31) IdkType newType = new IdkType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	public static void removeSoft() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public static void clear() {
		types.clear();
	}
}

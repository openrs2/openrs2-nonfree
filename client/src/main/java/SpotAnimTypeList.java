import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class SpotAnimTypeList {
	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable models = new SoftLruHashTable(30);

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "Lclient!fh;")
	public static Js5 modelsArchive;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!fh;Lclient!fh;)V")
	public static void init(@OriginalArg(1) Js5 archive, @OriginalArg(2) Js5 modelsArchive) {
		SpotAnimTypeList.archive = archive;
		SpotAnimTypeList.modelsArchive = modelsArchive;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Lclient!li;")
	public static SpotAnimType get(@OriginalArg(1) int id) {
		@Pc(10) SpotAnimType type = (SpotAnimType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(25) byte[] bytes = archive.fetchFile(getGroupId(id), getFileId(id));
		@Pc(29) SpotAnimType newType = new SpotAnimType();
		newType.id = id;
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)I")
	private static int getGroupId(@OriginalArg(0) int id) {
		return id >>> 8;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I")
	private static int getFileId(@OriginalArg(0) int id) {
		return id & 0xFF;
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(B)V")
	public static void removeSoft() {
		types.removeSoft();
		models.removeSoft();
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
	public static void clear() {
		types.clear();
		models.clear();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
		models.clean(5);
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class VarbitTypeList {
	@OriginalMember(owner = "client!jc", name = "G", descriptor = "Lclient!cc;")
	public static SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ri", name = "A", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		VarbitTypeList.archive = archive;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lclient!cm;")
	public static VarbitType get(@OriginalArg(0) int id) {
		@Pc(10) VarbitType type = (VarbitType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(42) byte[] bytes = archive.fetchFile(getGroupId(id), getFileId(id));
		@Pc(46) VarbitType newType = new VarbitType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(II)I")
	private static int getGroupId(@OriginalArg(1) int id) {
		return id >>> 10;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	private static int getFileId(@OriginalArg(0) int id) {
		return id & 0x3FF;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
	public static void clear() {
		types.clear();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
	public static void clean() {
		types.clean(5);
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V")
	public static void resize(@OriginalArg(0) int bucketCount) {
		types.clear();
		types = new SoftLruHashTable(bucketCount);
	}
}

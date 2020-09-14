import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class FluTypeList {
	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		FluTypeList.archive = archive;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)Lclient!pa;")
	public static FluType get(@OriginalArg(0) int id) {
		@Pc(10) FluType type = (FluType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(20) byte[] bytes = archive.fetchFile(1, id);
		@Pc(24) FluType newType = new FluType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes), id);
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IZ)V")
	public static void clean() {
		types.clean(5);
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(B)V")
	public static void removeSoft() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}
}

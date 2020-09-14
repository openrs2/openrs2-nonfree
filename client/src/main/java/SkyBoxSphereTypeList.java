import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class SkyBoxSphereTypeList {
	@OriginalMember(owner = "client!fj", name = "ab", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(16);

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		SkyBoxSphereTypeList.archive = archive;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(BI)Lclient!sa;")
	public static SkyBoxSphereType get(@OriginalArg(1) int id) {
		@Pc(10) SkyBoxSphereType type = (SkyBoxSphereType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(22) byte[] bytes = archive.fetchFile(30, id);
		@Pc(26) SkyBoxSphereType newType = new SkyBoxSphereType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes), id);
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
	}

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}
}

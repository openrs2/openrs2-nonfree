import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class LightTypeList {
	@OriginalMember(owner = "client!ti", name = "V", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!fh;)V")
	public static void init(@OriginalArg(1) Js5 archive) {
		LightTypeList.archive = archive;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)Lclient!vd;")
	public static LightType get(@OriginalArg(0) int id) {
		@Pc(10) LightType type = (LightType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(28) byte[] bytes = archive.fetchFile(31, id);
		@Pc(32) LightType newType = new LightType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes), id);
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(B)V")
	public static void removeSoft() {
		types.removeSoft();
	}
}

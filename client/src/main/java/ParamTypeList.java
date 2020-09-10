import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class ParamTypeList {
	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!dj;")
	private static final LruHashTable types = new LruHashTable(64);

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Lclient!jc;")
	public static ParamType get(@OriginalArg(0) int id) {
		@Pc(16) ParamType type = (ParamType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(28) byte[] bytes = archive.fetchFile(11, id);
		@Pc(32) ParamType newType = new ParamType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		ParamTypeList.archive = archive;
	}
}

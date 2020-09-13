import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class InvTypeList {
	@OriginalMember(owner = "client!em", name = "p", descriptor = "Lclient!dj;")
	private static final LruHashTable types = new LruHashTable(64);

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!fn;")
	public static InvType get(@OriginalArg(0) int id) {
		@Pc(18) InvType type = (InvType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(29) byte[] bytes = archive.fetchFile(5, id);
		@Pc(33) InvType newType = new InvType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!fh;)V")
	public static void init(@OriginalArg(1) Js5 archive) {
		InvTypeList.archive = archive;
	}
}

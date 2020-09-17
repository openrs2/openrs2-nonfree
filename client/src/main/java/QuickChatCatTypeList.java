import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class QuickChatCatTypeList {
	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!dj;")
	private static final LruHashTable types = new LruHashTable(64);

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Lclient!fh;")
	private static Js5 globalArchive;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!fh;ILclient!fh;)V")
	public static void init(@OriginalArg(0) Js5 archive, @OriginalArg(2) Js5 globalArchive) {
		QuickChatCatTypeList.globalArchive = globalArchive;
		QuickChatCatTypeList.archive = archive;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lclient!wh;")
	public static QuickChatCatType get(@OriginalArg(0) int id) {
		@Pc(10) QuickChatCatType type = (QuickChatCatType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(26) byte[] bytes;
		if (id >= 32768) {
			bytes = globalArchive.fetchFile(0, id & 0x7FFF);
		} else {
			bytes = archive.fetchFile(0, id);
		}
		@Pc(38) QuickChatCatType newType = new QuickChatCatType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		if (id >= 32768) {
			newType.method4778();
		}
		types.put(id, newType);
		return newType;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class QuickChatPhraseTypeList {
	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!dj;")
	private static final LruHashTable types = new LruHashTable(64);

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!fh;")
	private static Js5 globalArchive;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "Lclient!ai;")
	private static Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	public static int capacity = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
	public static int globalCapacity = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!fh;Lclient!ai;Lclient!fh;)V")
	public static void init(@OriginalArg(3) Js5 archive, @OriginalArg(1) Js5 globalArchive, @OriginalArg(2) Interface1 arg1) {
		QuickChatPhraseTypeList.archive = archive;
		QuickChatPhraseTypeList.globalArchive = globalArchive;
		anInterface1_1 = arg1;
		if (QuickChatPhraseTypeList.archive != null) {
			capacity = QuickChatPhraseTypeList.archive.getGroupCapacity(1);
		}
		if (QuickChatPhraseTypeList.globalArchive != null) {
			globalCapacity = QuickChatPhraseTypeList.globalArchive.getGroupCapacity(1);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)Lclient!ij;")
	public static QuickChatPhraseType get(@OriginalArg(0) int id) {
		@Pc(10) QuickChatPhraseType type = (QuickChatPhraseType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(25) byte[] bytes;
		if (id < 32768) {
			bytes = archive.fetchFile(1, id);
		} else {
			bytes = globalArchive.fetchFile(1, id & 0x7FFF);
		}
		@Pc(39) QuickChatPhraseType newType = new QuickChatPhraseType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		if (id >= 32768) {
			newType.method1910();
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
	public static String method1940(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (anInterface1_1 != null) {
			@Pc(18) String local18 = anInterface1_1.method3224(arg0, arg2, arg1);
			if (local18 != null) {
				return local18;
			}
		}
		return Long.toString(arg0);
	}
}

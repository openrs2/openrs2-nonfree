import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class NpcTypeList {
	@OriginalMember(owner = "client!ho", name = "j", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable models = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable headModels = new SoftLruHashTable(5);

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
	public static boolean allowMembers;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Lclient!fh;")
	private static Js5 npcsArchive;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "Lclient!fh;")
	public static Js5 modelsArchive;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!fh;ZILclient!fh;)V")
	public static void init(@OriginalArg(3) Js5 npcs, @OriginalArg(0) Js5 models) {
		allowMembers = true;
		npcsArchive = npcs;
		modelsArchive = models;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)V")
	public static void setAllowMembers(@OriginalArg(0) boolean allowMembers) {
		if (allowMembers != NpcTypeList.allowMembers) {
			NpcTypeList.allowMembers = allowMembers;
			clear();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)Lclient!ua;")
	public static NpcType get(@OriginalArg(1) int id) {
		@Pc(10) NpcType type = (NpcType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(26) byte[] bytes = npcsArchive.fetchFile(getGroupId(id), getFileId(id));
		@Pc(30) NpcType newType = new NpcType();
		newType.id = id;
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		newType.postDecode();
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)I")
	private static int getGroupId(@OriginalArg(0) int id) {
		return id >>> 7;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I")
	private static int getFileId(@OriginalArg(0) int id) {
		return id & 0x7F;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void clear() {
		types.clear();
		models.clear();
		headModels.clear();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
		models.clean(5);
		headModels.clean(5);
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(B)V")
	public static void removeSoft() {
		types.removeSoft();
		models.removeSoft();
		headModels.removeSoft();
	}
}

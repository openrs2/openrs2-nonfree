import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class ObjTypeList {
	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!cc;")
	private static final LruHashTable types = new LruHashTable(64);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!cc;")
	public static final LruHashTable models = new LruHashTable(50);

	@OriginalMember(owner = "client!o", name = "r", descriptor = "Lclient!cc;")
	public static final LruHashTable sprites = new LruHashTable(100);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
	public static int capacity;

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "Z")
	private static boolean allowMembers;

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "[Ljava/lang/String;")
	private static String[] defaultInventoryOps = null;

	@OriginalMember(owner = "client!sl", name = "Y", descriptor = "[Ljava/lang/String;")
	private static String[] defaultOps = null;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "Lclient!fh;")
	private static Js5 objArchive;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!fh;")
	public static Js5 modelsArchive;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!ke;")
	public static Class4_Sub3_Sub5_Sub2 aClass4_Sub3_Sub5_Sub2_1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Lclient!td;")
	public static ObjType get(@OriginalArg(0) int id) {
		@Pc(18) ObjType type = (ObjType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(34) byte[] bytes = objArchive.fetchFile(getGroupId(id), getFileId(id));
		@Pc(38) ObjType newType = new ObjType();
		newType.id = id;
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		newType.postDecode();
		if (newType.certificateTemplate != -1) {
			newType.generateCertificate(get(newType.certificateLink), get(newType.certificateTemplate));
		}
		if (newType.lentTemplate != -1) {
			newType.generateLent(get(newType.lentLink), get(newType.lentTemplate));
		}
		if (!allowMembers && newType.members) {
			newType.name = LocalisedText.MEMBERS_OBJECT;
			newType.ops = defaultOps;
			newType.inventoryOps = defaultInventoryOps;
			newType.team = 0;
			newType.stockMarket = false;
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I")
	private static int getGroupId(@OriginalArg(1) int id) {
		return id >>> 8;
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(II)I")
	private static int getFileId(@OriginalArg(1) int id) {
		return id & 0xFF;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!fh;Lclient!ke;IZLclient!fh;)V")
	public static void init(@OriginalArg(0) Js5 objArchive, @OriginalArg(4) Js5 modelsArchive, @OriginalArg(1) Class4_Sub3_Sub5_Sub2 arg1) {
		ObjTypeList.modelsArchive = modelsArchive;
		ObjTypeList.objArchive = objArchive;
		allowMembers = true;
		@Pc(11) int maxGroupId = ObjTypeList.objArchive.capacity() - 1;
		capacity = maxGroupId * 256 + ObjTypeList.objArchive.getGroupCapacity(maxGroupId);
		aClass4_Sub3_Sub5_Sub2_1 = arg1;
		defaultInventoryOps = new String[] { null, null, null, null, LocalisedText.DROP };
		defaultOps = new String[] { null, null, LocalisedText.TAKE, null, null };
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZB)V")
	public static void setAllowMembers(@OriginalArg(0) boolean allowMembers) {
		if (allowMembers != ObjTypeList.allowMembers) {
			ObjTypeList.allowMembers = allowMembers;
			clear();
		}
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)V")
	public static void clear() {
		types.clear();
		models.clear();
		sprites.clear();
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(B)V")
	public static void clearSoft() {
		types.clearSoft();
		models.clearSoft();
		sprites.clearSoft();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
		models.clean(5);
		sprites.clean(5);
	}
}

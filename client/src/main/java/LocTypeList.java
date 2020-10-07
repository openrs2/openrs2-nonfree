import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class LocTypeList {
	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!on", name = "K", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable aClass26_43 = new SoftLruHashTable(500);

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable aClass26_18 = new SoftLruHashTable(30);

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable aClass26_32 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "Lclient!fh;")
	private static Js5 locsArchive;

	@OriginalMember(owner = "client!uc", name = "W", descriptor = "Lclient!fh;")
	public static Js5 modelsArchive;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "Z")
	public static boolean allowMembers;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lclient!vh;")
	public static LocType get(@OriginalArg(0) int id) {
		@Pc(14) LocType type = (LocType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(28) byte[] bytes = locsArchive.fetchFile(getGroupId(id), getFileId(id));
		@Pc(32) LocType newType = new LocType();
		newType.id = id;
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		newType.postDecode();
		if (!allowMembers && newType.members) {
			newType.ops = null;
		}
		if (newType.aBoolean385) {
			newType.anInt5509 = 0;
			newType.aBoolean374 = false;
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)I")
	private static int getGroupId(@OriginalArg(1) int id) {
		return id >>> 8;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)I")
	private static int getFileId(@OriginalArg(1) int id) {
		return id & 0xFF;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!fh;ZLclient!fh;)V")
	public static void init(@OriginalArg(1) Js5 locsArchive, @OriginalArg(3) Js5 modelsArchive) {
		allowMembers = true;
		LocTypeList.modelsArchive = modelsArchive;
		LocTypeList.locsArchive = locsArchive;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ZI)V")
	public static void setAllowMembers(@OriginalArg(0) boolean allowMembers) {
		if (LocTypeList.allowMembers != allowMembers) {
			LocTypeList.allowMembers = allowMembers;
			clear();
		}
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V")
	public static void clear() {
		types.clear();
		aClass26_43.clear();
		aClass26_18.clear();
		aClass26_32.clear();
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
		aClass26_43.clean(5);
		aClass26_18.clean(5);
		aClass26_32.clean(5);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
		aClass26_43.removeSoft();
		aClass26_18.removeSoft();
		aClass26_32.removeSoft();
	}
}

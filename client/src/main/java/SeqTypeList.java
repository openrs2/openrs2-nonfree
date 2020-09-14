import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class SeqTypeList {
	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable animFramesets = new SoftLruHashTable(100);

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "Lclient!fh;")
	private static Js5 animsArchive;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!fh;")
	private static Js5 basesArchive;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fh;Lclient!fh;Lclient!fh;I)V")
	public static void init(@OriginalArg(0) Js5 archive, @OriginalArg(2) Js5 animsArchive, @OriginalArg(1) Js5 basesArchive) {
		SeqTypeList.archive = archive;
		SeqTypeList.animsArchive = animsArchive;
		SeqTypeList.basesArchive = basesArchive;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Lclient!eg;")
	public static SeqType get(@OriginalArg(0) int id) {
		@Pc(10) SeqType type = (SeqType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(25) byte[] bytes = archive.fetchFile(getGroupId(id), getFileId(id));
		@Pc(29) SeqType newType = new SeqType();
		newType.id = id;
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		newType.postDecode();
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(II)Lclient!te;")
	public static AnimFrameset getAnimFrameset(@OriginalArg(0) int id) {
		@Pc(19) AnimFrameset frameset = (AnimFrameset) animFramesets.get(id);
		if (frameset != null) {
			return frameset;
		}
		@Pc(31) AnimFrameset newFrameset = AnimFrameset.create(animsArchive, basesArchive, id);
		if (newFrameset != null) {
			animFramesets.put(id, newFrameset);
		}
		return newFrameset;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)I")
	private static int getGroupId(@OriginalArg(0) int id) {
		return id >>> 7;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I")
	private static int getFileId(@OriginalArg(1) int id) {
		return id & 0x7F;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
		animFramesets.removeSoft();
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V")
	public static void clear() {
		types.clear();
		animFramesets.clear();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
	public static void clean() {
		types.clean(5);
		animFramesets.clean(5);
	}
}

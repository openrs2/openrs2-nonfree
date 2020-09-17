import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class MsiTypeList {
	@OriginalMember(owner = "client!ul", name = "M", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "Lclient!cc;")
	public static final SoftLruHashTable sprites = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "Lclient!fh;")
	public static Js5 spritesArchive;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
	public static int anInt4867;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public static int anInt3963;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public static int anInt97;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!fh;Lclient!fh;)V")
	public static void init(@OriginalArg(2) Js5 archive, @OriginalArg(1) Js5 spritesArchive) {
		@Pc(10) int local10 = (int) (Math.random() * 21.0D) - 10;
		MsiTypeList.archive = archive;
		@Pc(19) int local19 = (int) (Math.random() * 41.0D) - 20;
		MsiTypeList.spritesArchive = spritesArchive;
		@Pc(28) int local28 = (int) (Math.random() * 21.0D) - 10;
		MsiTypeList.archive.getGroupCapacity(34);
		@Pc(40) int local40 = (int) (Math.random() * 21.0D) - 10;
		anInt4867 = local19 + local28;
		anInt3963 = local10 + local19;
		anInt97 = local19 + local40;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(BI)Lclient!qg;")
	public static MsiType get(@OriginalArg(1) int id) {
		@Pc(10) MsiType type = (MsiType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(28) byte[] bytes = archive.fetchFile(34, id);
		@Pc(32) MsiType newType = new MsiType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes), id);
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
	public static void clean() {
		types.clean(5);
		sprites.clean(5);
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
		sprites.removeSoft();
	}

	@OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V")
	public static void clear() {
		types.clear();
		sprites.clear();
	}
}
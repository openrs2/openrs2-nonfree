import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class ParticleEffectorTypeList {
	@OriginalMember(owner = "client!he", name = "p", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "Lclient!ic;")
	public static final HashTable aClass84_16 = new HashTable(16);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "[Lclient!dc;")
	public static final ParticleEffectorType[] aClass37Array1 = new ParticleEffectorType[8];

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		ParticleEffectorTypeList.archive = archive;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)Lclient!dc;")
	public static ParticleEffectorType get(@OriginalArg(0) int id) {
		@Pc(6) ParticleEffectorType type = (ParticleEffectorType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(21) byte[] bytes = archive.fetchFile(1, id);
		@Pc(25) ParticleEffectorType newType = new ParticleEffectorType();
		newType.id = id;
		if (bytes != null) {
			newType.decode(new Buffer(bytes));
		}
		newType.postDecode();
		if (newType.anInt907 == 2 && aClass84_16.get(id) == null) {
			aClass84_16.put(id, new IntNode(Static1.anInt876));
			aClass37Array1[Static1.anInt876++] = newType;
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}
}

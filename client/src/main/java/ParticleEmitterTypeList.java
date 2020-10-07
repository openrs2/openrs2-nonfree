import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ParticleEmitterTypeList {
	@OriginalMember(owner = "client!lf", name = "X", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		ParticleEmitterTypeList.archive = archive;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)Lclient!ik;")
	public static ParticleEmitterType get(@OriginalArg(1) int id) {
		@Pc(6) ParticleEmitterType type = (ParticleEmitterType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(21) byte[] bytes = archive.fetchFile(0, id);
		@Pc(25) ParticleEmitterType newTypes = new ParticleEmitterType();
		if (bytes != null) {
			newTypes.decode(new Buffer(bytes));
		}
		newTypes.postDecode();
		types.put(id, newTypes);
		return newTypes;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public static void clear() {
		types.clear();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class SkyBoxTypeList {
	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(16);

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable skyBoxes = new SoftLruHashTable(4);

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!fh;")
	private static Js5 archive;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void init(@OriginalArg(0) Js5 archive) {
		SkyBoxTypeList.archive = archive;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(IB)Lclient!qm;")
	public static SkyBoxType get(@OriginalArg(0) int id) {
		@Pc(10) SkyBoxType type = (SkyBoxType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(22) byte[] bytes = archive.fetchFile(29, id);
		@Pc(26) SkyBoxType newType = new SkyBoxType();
		if (bytes != null) {
			newType.decode(new Buffer(bytes), id);
		}
		types.put(id, newType);
		return newType;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBIII)Lclient!eh;")
	public static SkyBox getSkyBox(@OriginalArg(3) int id, @OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg3) {
		@Pc(39) long key = (long) id & 0xFFFFL | ((long) arg0 & 0xFFFFL) << 48 | ((long) arg1 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16;
		@Pc(45) SkyBox skyBox = (SkyBox) skyBoxes.get(key);
		if (skyBox != null) {
			return skyBox;
		}
		@Pc(52) SkyBoxSphere[] spheres = null;
		@Pc(56) SkyBoxType type = get(id);
		if (type.spheres != null) {
			spheres = new SkyBoxSphere[type.spheres.length];
			for (@Pc(68) int i = 0; i < spheres.length; i++) {
				@Pc(83) SkyBoxSphereType sphereType = SkyBoxSphereTypeList.get(type.spheres[i]);
				spheres[i] = new SkyBoxSphere(sphereType.anInt4706, sphereType.anInt4698, sphereType.anInt4696, sphereType.anInt4697, sphereType.anInt4700, sphereType.anInt4707, sphereType.anInt4703, sphereType.aBoolean327);
			}
		}
		@Pc(120) SkyBox newSkyBox = new SkyBox(type.textureId, spheres, type.defaultSphereIndex, arg0, arg1, arg3);
		skyBoxes.put(key, newSkyBox);
		return newSkyBox;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public static void clear() {
		types.clear();
		skyBoxes.clear();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
		skyBoxes.removeSoft();
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
		skyBoxes.clean(5);
	}
}

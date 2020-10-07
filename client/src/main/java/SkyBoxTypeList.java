import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class SkyBoxTypeList {
	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable types = new SoftLruHashTable(16);

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable aClass26_11 = new SoftLruHashTable(4);

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
	public static Class47 method936(@OriginalArg(3) int id, @OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg3) {
		@Pc(39) long local39 = (long) id & 0xFFFFL | ((long) arg0 & 0xFFFFL) << 48 | ((long) arg1 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16;
		@Pc(45) Class47 local45 = (Class47) aClass26_11.get(local39);
		if (local45 != null) {
			return local45;
		}
		@Pc(52) Class105[] local52 = null;
		@Pc(56) SkyBoxType type = get(id);
		if (type.anIntArray466 != null) {
			local52 = new Class105[type.anIntArray466.length];
			for (@Pc(68) int local68 = 0; local68 < local52.length; local68++) {
				@Pc(83) SkyBoxSphereType local83 = SkyBoxSphereTypeList.get(type.anIntArray466[local68]);
				local52[local68] = new Class105(local83.anInt4706, local83.anInt4698, local83.anInt4696, local83.anInt4697, local83.anInt4700, local83.anInt4707, local83.anInt4703, local83.aBoolean327);
			}
		}
		@Pc(120) Class47 local120 = new Class47(type.anInt4405, local52, type.anInt4399, arg0, arg1, arg3);
		aClass26_11.put(local39, local120);
		return local120;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public static void clear() {
		types.clear();
		aClass26_11.clear();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
		aClass26_11.removeSoft();
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
		aClass26_11.clean(5);
	}
}

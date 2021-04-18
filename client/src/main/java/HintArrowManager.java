import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class HintArrowManager {
	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[Lclient!jd;")
	public static final HintArrow[] HINT_ARROWS = new HintArrow[8];

	@OriginalMember(owner = "client!ln", name = "L", descriptor = "Lclient!cc;")
	private static final SoftLruHashTable models = new SoftLruHashTable(4);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!vg;IIBII)Lclient!vg;")
	public static Model getModel(@OriginalArg(0) int arg0, @OriginalArg(1) Model arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int id, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) long key = id;
		@Pc(24) Model model = (Model) models.get(key);
		if (model == null) {
			@Pc(32) RawModel local32 = RawModel.create(client.js5Archive7, id);
			if (local32 == null) {
				return null;
			}
			model = local32.createModel(64, 768, -50, -10, -50);
			models.put(key, model);
		}
		@Pc(53) int local53 = arg1.getMinX();
		@Pc(56) int local56 = arg1.getMaxX();
		@Pc(59) int local59 = arg1.getMinZ();
		@Pc(62) int local62 = arg1.getMaxZ();
		@Pc(68) Model local68 = model.method3836(true, true, true);
		if (arg0 != 0) {
			local68.method3815(arg0);
		}
		if (GlRenderer.enabled) {
			@Pc(148) GlModel local148 = (GlModel) local68;
			if (SceneGraph.method522(Player.level, arg5 + local53, arg2 + local59) != arg4 || arg4 != SceneGraph.method522(Player.level, local56 + arg5, arg2 + local62)) {
				for (@Pc(183) int local183 = 0; local183 < local148.vertexCount; local183++) {
					@Pc(189) int[] local189 = local148.vertexY;
					local189[local183] += SceneGraph.method522(Player.level, arg5 + local148.vertexX[local183], arg2 + local148.vertexZ[local183]) - arg4;
				}
				local148.bounds.valid = false;
				local148.vertexBuffer.valid = false;
			}
		} else {
			@Pc(78) SoftwareModel local78 = (SoftwareModel) local68;
			if (arg4 != SceneGraph.method522(Player.level, local53 + arg5, arg2 + local59) || SceneGraph.method522(Player.level, local56 + arg5, local62 + arg2) != arg4) {
				for (@Pc(108) int local108 = 0; local108 < local78.vertexCount; local108++) {
					@Pc(114) int[] local114 = local78.vertexY;
					local114[local108] += SceneGraph.method522(Player.level, arg5 + local78.vertexX[local108], local78.vertexZ[local108] + arg2) - arg4;
				}
				local78.boundsValid = false;
			}
		}
		return local68;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void clear() {
		models.clear();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public static void removeSoft() {
		models.removeSoft();
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V")
	public static void clean() {
		models.clean(5);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class MaterialManager {
	@OriginalMember(owner = "client!si", name = "h", descriptor = "[Lclient!cl;")
	private static MaterialRenderer[] renderers;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	private static int currentType = 0;

	@OriginalMember(owner = "client!am", name = "B", descriptor = "I")
	private static int currentArg = 0;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Z")
	public static boolean renderingUnderwater = false;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V")
	public static void init() {
		Static19.method1855();
		renderers = new MaterialRenderer[8];
		renderers[1] = new SpecularMaterialRenderer();
		renderers[2] = new LiquidMaterialRenderer();
		renderers[3] = new UnderwaterMaterialRenderer();
		renderers[4] = new WaterMaterialRenderer();
		renderers[5] = new WaterfallMaterialRenderer();
		renderers[6] = new UnlitMaterialRenderer();
		renderers[7] = new MaterialRenderer7();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
	public static void setMaterial(@OriginalArg(0) int type, @OriginalArg(1) int arg) {
		if (type == 8) {
			type = 4;
		}
		if (type == 4 && !Preferences.highDetailWater) {
			type = 2;
			arg = 2;
		}
		if (currentType != type) {
			if (renderingUnderwater) {
				return;
			}
			if (currentType != 0) {
				renderers[currentType].unbind();
			}
			if (type != 0) {
				@Pc(42) MaterialRenderer renderer = renderers[type];
				renderer.bind();
				renderer.setArgument(arg);
			}
			currentArg = arg;
			currentType = type;
		} else if (type != 0 && currentArg != arg) {
			renderers[type].setArgument(arg);
			currentArg = arg;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I")
	public static int getFlags() {
		return currentType == 0 ? 0 : renderers[currentType].getFlags();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V")
	public static void resetArgument(@OriginalArg(1) int type) {
		if (currentType == type) {
			@Pc(16) MaterialRenderer id = renderers[type];
			id.setArgument(currentArg);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void quit() {
		renderers = null;
		Static19.method1858();
	}
}

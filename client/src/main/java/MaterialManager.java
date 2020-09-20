import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class MaterialManager {
	@OriginalMember(owner = "client!si", name = "h", descriptor = "[Lclient!cl;")
	private static Material[] materials;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	private static int currentMaterialId = 0;

	@OriginalMember(owner = "client!am", name = "B", descriptor = "I")
	private static int currentArg = 0;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Z")
	public static boolean renderingUnderwater = false;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V")
	public static void init() {
		Static19.method1855();
		materials = new Material[8];
		materials[1] = new Class81();
		materials[2] = new Class70();
		materials[3] = new WaterMaterial();
		materials[4] = new Class16();
		materials[5] = new Class23();
		materials[6] = new UnlitMaterial();
		materials[7] = new Class6();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
	public static void setMaterial(@OriginalArg(0) int materialId, @OriginalArg(1) int arg) {
		if (materialId == 8) {
			materialId = 4;
		}
		if (materialId == 4 && !Preferences.highDetailWater) {
			materialId = 2;
			arg = 2;
		}
		if (currentMaterialId != materialId) {
			if (renderingUnderwater) {
				return;
			}
			if (currentMaterialId != 0) {
				materials[currentMaterialId].unbind();
			}
			if (materialId != 0) {
				@Pc(42) Material material = materials[materialId];
				material.bind();
				material.setArgument(arg);
			}
			currentArg = arg;
			currentMaterialId = materialId;
		} else if (materialId != 0 && currentArg != arg) {
			materials[materialId].setArgument(arg);
			currentArg = arg;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I")
	public static int getFlags() {
		return currentMaterialId == 0 ? 0 : materials[currentMaterialId].getFlags();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V")
	public static void resetArgument(@OriginalArg(1) int materialId) {
		if (currentMaterialId == materialId) {
			@Pc(16) Material id = materials[materialId];
			id.setArgument(currentArg);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void quit() {
		materials = null;
		Static19.method1858();
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Equipment {
	@OriginalMember(owner = "client!tb", name = "h", descriptor = "[I")
	public static int[] objIds;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
	public static void init() {
		@Pc(8) int[] ids = new int[ObjTypeList.capacity];
		@Pc(10) int j = 0;
		for (@Pc(12) int i = 0; i < ObjTypeList.capacity; i++) {
			@Pc(23) ObjType type = ObjTypeList.get(i);
			if (type.manWear1 >= 0 || type.womanWear2 >= 0) {
				ids[j++] = i;
			}
		}
		objIds = new int[j];
		for (@Pc(52) int i = 0; i < j; i++) {
			objIds[i] = ids[i];
		}
	}
}

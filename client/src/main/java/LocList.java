import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class LocList {
	@OriginalMember(owner = "client!e", name = "A", descriptor = "Lclient!ll;")
	public static LinkedList locs = new LinkedList();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void add(@OriginalArg(0) int id, @OriginalArg(3) int x, @OriginalArg(1) int y, @OriginalArg(5) int z, @OriginalArg(2) int angle, @OriginalArg(7) int shape, @OriginalArg(8) int layer, @OriginalArg(4) int arg4, @OriginalArg(9) int arg8) {
		@Pc(5) Loc loc = null;
		for (@Pc(10) Loc l = (Loc) locs.head(); l != null; l = (Loc) locs.next()) {
			if (y == l.y && x == l.x && l.z == z && layer == l.layer) {
				loc = l;
				break;
			}
		}
		if (loc == null) {
			loc = new Loc();
			loc.z = z;
			loc.y = y;
			loc.layer = layer;
			loc.x = x;
			Static16.method4654(loc);
			locs.addTail(loc);
		}
		loc.anInt4446 = arg8;
		loc.id = id;
		loc.anInt4436 = arg4;
		loc.angle = angle;
		loc.shape = shape;
	}
}

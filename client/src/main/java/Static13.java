import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public static void method933() {
		for (@Pc(15) int i = 0; i < 100; i++) {
			Static2.aBooleanArray8[i] = true;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
	public static void method1007(@OriginalArg(2) int action, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (action == 1012) {
			ScriptRunner.method2710(10, arg1, arg2);
		} else if (action == 1002) {
			ScriptRunner.method2710(11, arg1, arg2);
		} else if (action == 1008) {
			ScriptRunner.method2710(12, arg1, arg2);
		} else if (action == 1003) {
			ScriptRunner.method2710(13, arg1, arg2);
		} else if (action == 1011) {
			ScriptRunner.method2710(14, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public static void method1008() {
		for (@Pc(1) int level = 0; level < SceneGraph.levels; level++) {
			for (@Pc(6) int x = 0; x < SceneGraph.width; x++) {
				for (@Pc(11) int z = 0; z < SceneGraph.length; z++) {
					@Pc(22) Tile tile = SceneGraph.tiles[level][x][z];
					if (tile != null) {
						@Pc(27) Wall wall = tile.wall;
						if (wall != null && wall.primary.method3808()) {
							Static20.method1951(wall.primary, level, x, z, 1, 1);
							if (wall.secondary != null && wall.secondary.method3808()) {
								Static20.method1951(wall.secondary, level, x, z, 1, 1);
								wall.primary.method3807(wall.secondary, 0, 0, 0, false);
								wall.secondary = wall.secondary.method3809();
							}
							wall.primary = wall.primary.method3809();
						}
						for (@Pc(83) int i = 0; i < tile.sceneryLen; i++) {
							@Pc(92) Scenery scenery = tile.scenery[i];
							if (scenery != null && scenery.entity.method3808()) {
								Static20.method1951(scenery.entity, level, x, z, scenery.xMax + 1 - scenery.xMin, scenery.zMax + 1 - scenery.zMin);
								scenery.entity = scenery.entity.method3809();
							}
						}
						@Pc(131) GroundDecor groundDecor = tile.groundDecor;
						if (groundDecor != null && groundDecor.entity.method3808()) {
							Static26.method2981(groundDecor.entity, level, x, z);
							groundDecor.entity = groundDecor.entity.method3809();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIII)V")
	public static void method1015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static4.anInt3086 <= arg3 && arg3 <= Static5.anInt4230) {
			arg0 = IntUtils.clamp(arg0, Static2.anInt902, Static3.anInt2553);
			arg1 = IntUtils.clamp(arg1, Static2.anInt902, Static3.anInt2553);
			Static20.method1975(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "()V")
	public static void method1027() {
		Static22.method2303();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!fh;)V")
	public static void method1028(@OriginalArg(0) Js5 archive) {
		Static2.aClass58_37 = archive;
	}
}

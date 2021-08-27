import java.awt.Point;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)V")
	public static void method966(@OriginalArg(0) int arg0) {
		if (!Preferences.customCursors) {
			arg0 = -1;
		}
		if (Static7.anInt5345 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) CursorType local23 = CursorTypeList.get(arg0);
			@Pc(27) SoftwareSprite local27 = local23.getSprite();
			if (local27 == null) {
				arg0 = -1;
			} else {
				GameShell.signLink.setCursor(GameShell.canvas, local27.innerWidth, local27.innerHeight, local27.getPixels(), new Point(local23.hotSpotX, local23.hotSpotY));
				Static7.anInt5345 = arg0;
			}
		}
		if (arg0 == -1 && Static7.anInt5345 != -1) {
			GameShell.signLink.setCursor(GameShell.canvas, -1, -1, null, new Point());
			Static7.anInt5345 = -1;
		}
	}

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
		for (@Pc(1) int local1 = 0; local1 < SceneGraph.levels; local1++) {
			for (@Pc(6) int local6 = 0; local6 < SceneGraph.width; local6++) {
				for (@Pc(11) int local11 = 0; local11 < SceneGraph.length; local11++) {
					@Pc(22) Tile local22 = SceneGraph.tiles[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Wall local27 = local22.wall;
						if (local27 != null && local27.primary.method3808()) {
							Static20.method1951(local27.primary, local1, local6, local11, 1, 1);
							if (local27.secondary != null && local27.secondary.method3808()) {
								Static20.method1951(local27.secondary, local1, local6, local11, 1, 1);
								local27.primary.method3807(local27.secondary, 0, 0, 0, false);
								local27.secondary = local27.secondary.method3809();
							}
							local27.primary = local27.primary.method3809();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.sceneryLen; local83++) {
							@Pc(92) Scenery local92 = local22.scenery[local83];
							if (local92 != null && local92.entity.method3808()) {
								Static20.method1951(local92.entity, local1, local6, local11, local92.xMax + 1 - local92.xMin, local92.zMax + 1 - local92.zMin);
								local92.entity = local92.entity.method3809();
							}
						}
						@Pc(131) GroundDecor local131 = local22.groundDecor;
						if (local131 != null && local131.entity.method3808()) {
							Static26.method2981(local131.entity, local1, local6, local11);
							local131.entity = local131.entity.method3809();
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

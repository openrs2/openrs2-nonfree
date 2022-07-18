import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V")
	public static void method2416(@OriginalArg(0) int arg0) {
		Static25.method2782(Static4.anInt3364, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static25.method2775(-50.0F, -60.0F, -50.0F);
		Static25.method2781(Static4.anInt3365, 0, false);
		Static25.method2777();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	public static void method2455() {
		if (Static1.anInt885 <= 0) {
			Static2.aClass52_1 = Protocol.socket;
			Protocol.socket = null;
			Static9.method233(40);
		} else {
			Static19.logout();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V")
	public static void method1936(@OriginalArg(1) boolean arg0) {
		Static25.method2782(Static1.anInt131, Static5.aFloat102, Static3.aFloat63, Static6.aFloat108);
		Static25.method2781(Static4.anInt3196, Static1.anInt611, arg0);
		Static25.method2775((float) Static4.anInt3068, (float) Static7.anInt5363, (float) Static6.anInt5211);
		Static25.method2777();
		Static2.aFloat27 = Static4.aFloat58;
		Static5.aClass4_Sub3_Sub10_6 = Static1.aClass4_Sub3_Sub10_1;
		Static2.aFloat25 = Static4.aFloat145;
		Static2.aFloat26 = Static4.aFloat85;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	public static void method2537() {
		@Pc(9) int local9 = Static4.anInt2977 * 128 + 64;
		@Pc(15) int local15 = Static5.anInt4165 * 128 + 64;
		@Pc(24) int local24 = SceneGraph.getTileHeight(Player.level, local9, local15) - Static4.anInt3131;
		if (Static5.anInt3490 >= 100) {
			Static7.anInt5678 = Static5.anInt4165 * 128 + 64;
			Static3.anInt2519 = Static4.anInt2977 * 128 + 64;
			Static2.anInt1931 = SceneGraph.getTileHeight(Player.level, Static3.anInt2519, Static7.anInt5678) - Static4.anInt3131;
		} else {
			if (Static7.anInt5678 < local15) {
				Static7.anInt5678 += Static7.anInt5236 + (local15 - Static7.anInt5678) * Static5.anInt3490 / 1000;
				if (Static7.anInt5678 > local15) {
					Static7.anInt5678 = local15;
				}
			}
			if (local9 > Static3.anInt2519) {
				Static3.anInt2519 += (local9 - Static3.anInt2519) * Static5.anInt3490 / 1000 + Static7.anInt5236;
				if (local9 < Static3.anInt2519) {
					Static3.anInt2519 = local9;
				}
			}
			if (Static3.anInt2519 > local9) {
				Static3.anInt2519 -= (Static3.anInt2519 - local9) * Static5.anInt3490 / 1000 + Static7.anInt5236;
				if (Static3.anInt2519 < local9) {
					Static3.anInt2519 = local9;
				}
			}
			if (Static2.anInt1931 < local24) {
				Static2.anInt1931 += (local24 - Static2.anInt1931) * Static5.anInt3490 / 1000 + Static7.anInt5236;
				if (Static2.anInt1931 > local24) {
					Static2.anInt1931 = local24;
				}
			}
			if (local15 < Static7.anInt5678) {
				Static7.anInt5678 -= (Static7.anInt5678 - local15) * Static5.anInt3490 / 1000 + Static7.anInt5236;
				if (Static7.anInt5678 < local15) {
					Static7.anInt5678 = local15;
				}
			}
			if (local24 < Static2.anInt1931) {
				Static2.anInt1931 -= (Static2.anInt1931 - local24) * Static5.anInt3490 / 1000 + Static7.anInt5236;
				if (Static2.anInt1931 < local24) {
					Static2.anInt1931 = local24;
				}
			}
		}
		@Pc(226) int local226 = Static3.anInt2497 * 128 + 64;
		@Pc(232) int local232 = Static4.anInt3302 * 128 + 64;
		@Pc(240) int local240 = SceneGraph.getTileHeight(Player.level, local232, local226) - Static5.anInt3572;
		@Pc(245) int local245 = local226 - Static7.anInt5678;
		@Pc(250) int local250 = local240 - Static2.anInt1931;
		@Pc(255) int local255 = local232 - Static3.anInt2519;
		@Pc(266) int local266 = (int) Math.sqrt((double) (local245 * local245 + local255 * local255));
		@Pc(277) int local277 = (int) (Math.atan2((double) local250, (double) local266) * 325.949D) & 0x7FF;
		if (local277 < 128) {
			local277 = 128;
		}
		if (local277 > 383) {
			local277 = 383;
		}
		@Pc(300) int local300 = (int) (-325.949D * Math.atan2((double) local255, (double) local245)) & 0x7FF;
		if (local277 > Static5.anInt4066) {
			Static5.anInt4066 += (local277 - Static5.anInt4066) * Static1.anInt212 / 1000 + Static6.anInt4838;
			if (Static5.anInt4066 > local277) {
				Static5.anInt4066 = local277;
			}
		}
		if (Static5.anInt4066 > local277) {
			Static5.anInt4066 -= Static6.anInt4838 + (Static5.anInt4066 - local277) * Static1.anInt212 / 1000;
			if (Static5.anInt4066 < local277) {
				Static5.anInt4066 = local277;
			}
		}
		@Pc(357) int local357 = local300 - Static5.anInt3656;
		if (local357 > 1024) {
			local357 -= 2048;
		}
		if (local357 < -1024) {
			local357 += 2048;
		}
		if (local357 > 0) {
			Static5.anInt3656 += Static1.anInt212 * local357 / 1000 + Static6.anInt4838;
			Static5.anInt3656 &= 2047;
		}
		if (local357 < 0) {
			Static5.anInt3656 -= Static6.anInt4838 + Static1.anInt212 * -local357 / 1000;
			Static5.anInt3656 &= 2047;
		}
		@Pc(414) int local414 = local300 - Static5.anInt3656;
		if (local414 > 1024) {
			local414 -= 2048;
		}
		if (local414 < -1024) {
			local414 += 2048;
		}
		if (local414 < 0 && local357 > 0 || local414 > 0 && local357 < 0) {
			Static5.anInt3656 = local300;
		}
	}

}

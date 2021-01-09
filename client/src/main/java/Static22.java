import java.nio.ByteBuffer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "([I[IIIIIIIII)V")
	public static void method2186(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(2) int local2 = -arg5; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg4; local7 < 0; local7++) {
				@Pc(19) int local19 = (arg1[arg2] >>> 24) * arg8 >> 8;
				@Pc(23) int local23 = 256 - local19;
				@Pc(28) int local28 = arg1[arg2++];
				@Pc(32) int local32 = arg0[arg3];
				arg0[arg3++] = ((local28 & 0xFF00FF) * local19 + (local32 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local28 & 0xFF00) * local19 + (local32 & 0xFF00) * local23 & 0xFF0000) >>> 8;
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!vh;III)V")
	public static void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) LocType arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class4_Sub11 local15 = (Class4_Sub11) Static1.aClass112_2.head(); local15 != null; local15 = (Class4_Sub11) Static1.aClass112_2.next()) {
			if (local15.anInt2126 == arg2 && local15.anInt2124 == arg3 * 128 && local15.anInt2113 == arg0 * 128 && arg1.id == local15.aClass181_1.id) {
				if (local15.aClass4_Sub6_Sub4_3 != null) {
					Static5.aClass4_Sub6_Sub3_2.method2670(local15.aClass4_Sub6_Sub4_3);
					local15.aClass4_Sub6_Sub4_3 = null;
				}
				if (local15.aClass4_Sub6_Sub4_2 != null) {
					Static5.aClass4_Sub6_Sub3_2.method2670(local15.aClass4_Sub6_Sub4_2);
					local15.aClass4_Sub6_Sub4_2 = null;
				}
				local15.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static2.anInt902 <= arg8 && arg8 <= Static3.anInt2553 && Static2.anInt902 <= arg0 && Static3.anInt2553 >= arg0 && Static2.anInt902 <= arg3 && Static3.anInt2553 >= arg3 && Static2.anInt902 <= arg4 && arg4 <= Static3.anInt2553 && arg5 >= Static4.anInt3086 && arg5 <= Static5.anInt4230 && arg1 >= Static4.anInt3086 && Static5.anInt4230 >= arg1 && arg7 >= Static4.anInt3086 && Static5.anInt4230 >= arg7 && Static4.anInt3086 <= arg6 && Static5.anInt4230 >= arg6) {
			Static10.method283(arg6, arg7, arg5, arg2, arg0, arg3, arg4, arg1, arg8);
		} else {
			Static31.method3662(arg8, arg7, arg4, arg0, arg1, arg5, arg6, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(IIIIII)V")
	public static void method4701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static8.method9(Static4.anInt3086, arg2, Static5.anInt4230);
		@Pc(17) int local17 = Static8.method9(Static4.anInt3086, arg4, Static5.anInt4230);
		@Pc(23) int local23 = Static8.method9(Static2.anInt902, arg0, Static3.anInt2553);
		@Pc(29) int local29 = Static8.method9(Static2.anInt902, arg1, Static3.anInt2553);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static18.method1656(Static5.anIntArrayArray36[local31], arg3, local23, local29);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)I")
	public static int method2188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg2 &= 3;
		if (arg2 == 0) {
			return arg0;
		} else if (arg2 == 1) {
			return 1023 - arg1;
		} else if (arg2 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static8.method9(Static4.anInt3086, arg6, Static5.anInt4230);
		@Pc(22) int local22 = Static8.method9(Static4.anInt3086, arg0, Static5.anInt4230);
		@Pc(28) int local28 = Static8.method9(Static2.anInt902, arg4, Static3.anInt2553);
		@Pc(34) int local34 = Static8.method9(Static2.anInt902, arg5, Static3.anInt2553);
		@Pc(43) int local43 = Static8.method9(Static4.anInt3086, arg6 + arg1, Static5.anInt4230);
		@Pc(52) int local52 = Static8.method9(Static4.anInt3086, arg0 - arg1, Static5.anInt4230);
		for (@Pc(54) int local54 = local11; local54 < local43; local54++) {
			Static18.method1656(Static5.anIntArrayArray36[local54], arg3, local28, local34);
		}
		for (@Pc(74) int local74 = local22; local74 > local52; local74--) {
			Static18.method1656(Static5.anIntArrayArray36[local74], arg3, local28, local34);
		}
		@Pc(97) int local97 = Static8.method9(Static2.anInt902, arg4 + arg1, Static3.anInt2553);
		@Pc(106) int local106 = Static8.method9(Static2.anInt902, arg5 - arg1, Static3.anInt2553);
		for (@Pc(108) int local108 = local43; local108 <= local52; local108++) {
			@Pc(119) int[] local119 = Static5.anIntArrayArray36[local108];
			Static18.method1656(local119, arg3, local28, local97);
			Static18.method1656(local119, arg2, local97, local106);
			Static18.method1656(local119, arg3, local106, local34);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)V")
	public static void method2192(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static6.anInt4516; local18++) {
			if (arg0 == Static3.aLongArray16[local18]) {
				Static6.anInt4516--;
				for (@Pc(38) int local38 = local18; local38 < Static6.anInt4516; local38++) {
					Static3.aLongArray16[local38] = Static3.aLongArray16[local38 + 1];
					Static3.aStringArray18[local38] = Static3.aStringArray18[local38 + 1];
					Static2.aBooleanArray5[local38] = Static2.aBooleanArray5[local38 + 1];
				}
				Static3.anInt2102 = Static6.anInt4979;
				Protocol.outboundBuffer.writeOpcode(142);
				Protocol.outboundBuffer.writeLong(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIZILclient!ch;ZI)V")
	public static void method2193(@OriginalArg(0) int angle, @OriginalArg(1) int y, @OriginalArg(2) int id, @OriginalArg(3) int arg3, @OriginalArg(4) int x, @OriginalArg(6) boolean arg5, @OriginalArg(7) int z, @OriginalArg(8) CollisionMap arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int shape) {
		if (arg8 && !SceneGraph.isAllLevelsVisible() && (Static4.tileFlags[0][x][z] & 0x2) == 0) {
			if ((Static4.tileFlags[y][x][z] & 0x10) != 0) {
				return;
			}
			if (Static35.method4327(z, y, x) != Static2.anInt1216) {
				return;
			}
		}
		if (Static5.anInt3896 > y) {
			Static5.anInt3896 = y;
		}
		@Pc(60) LocType type = LocTypeList.get(id);
		if (GlRenderer.enabled && type.aBoolean383) {
			return;
		}
		@Pc(78) int width;
		@Pc(81) int length;
		if (angle == 1 || angle == 3) {
			width = type.length;
			length = type.width;
		} else {
			length = type.length;
			width = type.width;
		}
		@Pc(102) int local102;
		@Pc(100) int local100;
		if (width + x > 104) {
			local100 = x + 1;
			local102 = x;
		} else {
			local100 = x + (width + 1 >> 1);
			local102 = (width >> 1) + x;
		}
		@Pc(130) int local130;
		@Pc(128) int local128;
		if (z + length > 104) {
			local128 = z + 1;
			local130 = z;
		} else {
			local130 = (length >> 1) + z;
			local128 = z + (length + 1 >> 1);
		}
		@Pc(151) int[][] local151 = SceneGraph.tileHeights[arg3];
		@Pc(159) int local159 = (width << 6) + (x << 7);
		@Pc(167) int local167 = (length << 6) + (z << 7);
		@Pc(193) int local193 = local151[local100][local130] + local151[local102][local130] + local151[local102][local128] + local151[local100][local128] >> 2;
		@Pc(195) int local195 = 0;
		if (GlRenderer.enabled && arg3 != 0) {
			@Pc(203) int[][] local203 = SceneGraph.tileHeights[0];
			local195 = local193 - (local203[local102][local128] + local203[local102][local130] + local203[local100][local130] + local203[local100][local128] >> 2);
		}
		@Pc(250) long pickKey = (long) (x | z << 7 | shape << 14 | angle << 20 | 0x40000000);
		@Pc(253) int[][] local253 = null;
		if (arg5) {
			local253 = SceneGraph.surfaceTileHeights[0];
		} else if (arg3 < 3) {
			local253 = SceneGraph.tileHeights[arg3 + 1];
		}
		if (type.anInt5522 == 0 || arg5) {
			pickKey |= Long.MIN_VALUE;
		}
		if (type.anInt5517 == 1) {
			pickKey |= 0x400000L;
		}
		if (type.aBoolean384) {
			pickKey |= 0x80000000L;
		}
		if (type.method4463()) {
			Static8.method109(type, x, null, z, null, angle, y);
		}
		@Pc(321) long pickKey2 = pickKey | (long) id << 32;
		@Pc(330) boolean local330 = type.aBoolean372 & !arg5;
		if (shape == 22) {
			if (Preferences.groundDecoration || type.anInt5522 != 0 || type.anInt5509 == 1 || type.aBoolean376) {
				@Pc(377) Entity local377;
				if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
					@Pc(393) Class96 local393 = type.method4450(local159, arg8, 22, local193, local151, local253, local330, angle, local167, null);
					if (GlRenderer.enabled && local330) {
						Static14.method1212(local393.aClass56_Sub1_3, local159, local195, local167);
					}
					local377 = local393.aClass53_3;
				} else {
					local377 = new Loc(id, 22, angle, arg3, x, z, -1, type.aBoolean380, null);
				}
				SceneGraph.setGroundDecor(y, x, z, local193, local377, pickKey2, type.aBoolean371);
				if (type.anInt5509 == 1 && arg7 != null) {
					arg7.flagGroundDecor(x, z);
				}
			}
		} else if (shape == 10 || shape == 11) {
			@Pc(493) Entity local493;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(479) Class96 local479 = type.method4450(local159, arg8, 10, local193, local151, local253, local330, shape == 11 ? angle + 4 : angle, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local479.aClass56_Sub1_3, local159, local195, local167);
				}
				local493 = local479.aClass53_3;
			} else {
				local493 = new Loc(id, 10, shape == 11 ? angle + 4 : angle, arg3, x, z, -1, type.aBoolean380, null);
			}
			if (local493 != null) {
				@Pc(532) boolean local532 = SceneGraph.method2196(y, x, z, local193, width, length, local493, pickKey2);
				if (type.aBoolean377 && local532 && arg8) {
					@Pc(542) int local542 = 15;
					if (local493 instanceof Model) {
						local542 = ((Model) local493).getBoundingCylinderRadius() / 4;
						if (local542 > 30) {
							local542 = 30;
						}
					}
					for (@Pc(561) int local561 = 0; local561 <= width; local561++) {
						for (@Pc(566) int local566 = 0; local566 <= length; local566++) {
							if (Static5.aByteArrayArrayArray18[y][local561 + x][z + local566] < local542) {
								Static5.aByteArrayArrayArray18[y][x + local561][local566 + z] = (byte) local542;
							}
						}
					}
				}
			}
			if (type.anInt5509 != 0 && arg7 != null) {
				arg7.method567(type.aBoolean374, !type.aBoolean385, length, width, z, x);
			}
		} else if (shape >= 12) {
			@Pc(666) Entity local666;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(682) Class96 local682 = type.method4450(local159, arg8, shape, local193, local151, local253, local330, angle, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local682.aClass56_Sub1_3, local159, local195, local167);
				}
				local666 = local682.aClass53_3;
			} else {
				local666 = new Loc(id, shape, angle, arg3, x, z, -1, type.aBoolean380, null);
			}
			SceneGraph.method2196(y, x, z, local193, 1, 1, local666, pickKey2);
			if (arg8 && shape >= 12 && shape <= 17 && shape != 13 && y > 0 && type.anInt5544 != 0) {
				Static4.anIntArrayArrayArray9[y][x][z] |= 4;
			}
			if (type.anInt5509 != 0 && arg7 != null) {
				arg7.method567(type.aBoolean374, !type.aBoolean385, length, width, z, x);
			}
		} else if (shape == 0) {
			@Pc(796) Entity local796;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(812) Class96 local812 = type.method4450(local159, arg8, 0, local193, local151, local253, local330, angle, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local812.aClass56_Sub1_3, local159, local195, local167);
				}
				local796 = local812.aClass53_3;
			} else {
				local796 = new Loc(id, 0, angle, arg3, x, z, -1, type.aBoolean380, null);
			}
			SceneGraph.setWall(y, x, z, local193, local796, null, Static2.anIntArray651[angle], 0, pickKey2);
			if (arg8) {
				if (angle == 0) {
					if (type.aBoolean377) {
						Static5.aByteArrayArrayArray18[y][x][z] = 50;
						Static5.aByteArrayArrayArray18[y][x][z + 1] = 50;
					}
					if (type.anInt5544 == 1) {
						Static4.anIntArrayArrayArray9[y][x][z] |= 1;
					}
				} else if (angle == 1) {
					if (type.aBoolean377) {
						Static5.aByteArrayArrayArray18[y][x][z + 1] = 50;
						Static5.aByteArrayArrayArray18[y][x + 1][z + 1] = 50;
					}
					if (type.anInt5544 == 1) {
						Static4.anIntArrayArrayArray9[y][x][z + 1] |= 2;
					}
				} else if (angle == 2) {
					if (type.aBoolean377) {
						Static5.aByteArrayArrayArray18[y][x + 1][z] = 50;
						Static5.aByteArrayArrayArray18[y][x + 1][z + 1] = 50;
					}
					if (type.anInt5544 == 1) {
						Static4.anIntArrayArrayArray9[y][x + 1][z] |= 1;
					}
				} else if (angle == 3) {
					if (type.aBoolean377) {
						Static5.aByteArrayArrayArray18[y][x][z] = 50;
						Static5.aByteArrayArrayArray18[y][x + 1][z] = 50;
					}
					if (type.anInt5544 == 1) {
						Static4.anIntArrayArrayArray9[y][x][z] |= 2;
					}
				}
			}
			if (type.anInt5509 != 0 && arg7 != null) {
				arg7.flagWall(z, type.aBoolean374, !type.aBoolean385, x, shape, angle);
			}
			if (type.anInt5507 != 16) {
				Static10.method344(y, x, z, type.anInt5507);
			}
		} else if (shape == 1) {
			@Pc(1119) Entity local1119;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(1135) Class96 local1135 = type.method4450(local159, arg8, 1, local193, local151, local253, local330, angle, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local1135.aClass56_Sub1_3, local159, local195, local167);
				}
				local1119 = local1135.aClass53_3;
			} else {
				local1119 = new Loc(id, 1, angle, arg3, x, z, -1, type.aBoolean380, null);
			}
			SceneGraph.setWall(y, x, z, local193, local1119, null, Static6.anIntArray519[angle], 0, pickKey2);
			if (type.aBoolean377 && arg8) {
				if (angle == 0) {
					Static5.aByteArrayArrayArray18[y][x][z + 1] = 50;
				} else if (angle == 1) {
					Static5.aByteArrayArrayArray18[y][x + 1][z + 1] = 50;
				} else if (angle == 2) {
					Static5.aByteArrayArrayArray18[y][x + 1][z] = 50;
				} else if (angle == 3) {
					Static5.aByteArrayArrayArray18[y][x][z] = 50;
				}
			}
			if (type.anInt5509 != 0 && arg7 != null) {
				arg7.flagWall(z, type.aBoolean374, !type.aBoolean385, x, shape, angle);
			}
		} else if (shape == 2) {
			@Pc(1265) int local1265 = angle + 1 & 0x3;
			@Pc(1309) Entity local1309;
			@Pc(1295) Entity local1295;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(1329) Class96 local1329 = type.method4450(local159, arg8, 2, local193, local151, local253, local330, angle + 4, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local1329.aClass56_Sub1_3, local159, local195, local167);
				}
				local1295 = local1329.aClass53_3;
				@Pc(1358) Class96 local1358 = type.method4450(local159, arg8, 2, local193, local151, local253, local330, local1265, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local1358.aClass56_Sub1_3, local159, local195, local167);
				}
				local1309 = local1358.aClass53_3;
			} else {
				local1295 = new Loc(id, 2, angle + 4, arg3, x, z, -1, type.aBoolean380, null);
				local1309 = new Loc(id, 2, local1265, arg3, x, z, -1, type.aBoolean380, null);
			}
			SceneGraph.setWall(y, x, z, local193, local1295, local1309, Static2.anIntArray651[angle], Static2.anIntArray651[local1265], pickKey2);
			if (type.anInt5544 == 1 && arg8) {
				if (angle == 0) {
					Static4.anIntArrayArrayArray9[y][x][z] |= 1;
					Static4.anIntArrayArrayArray9[y][x][z + 1] |= 2;
				} else if (angle == 1) {
					Static4.anIntArrayArrayArray9[y][x][z + 1] |= 2;
					Static4.anIntArrayArrayArray9[y][x + 1][z] |= 1;
				} else if (angle == 2) {
					Static4.anIntArrayArrayArray9[y][x + 1][z] |= 1;
					Static4.anIntArrayArrayArray9[y][x][z] |= 2;
				} else if (angle == 3) {
					Static4.anIntArrayArrayArray9[y][x][z] |= 2;
					Static4.anIntArrayArrayArray9[y][x][z] |= 1;
				}
			}
			if (type.anInt5509 != 0 && arg7 != null) {
				arg7.flagWall(z, type.aBoolean374, !type.aBoolean385, x, shape, angle);
			}
			if (type.anInt5507 != 16) {
				Static10.method344(y, x, z, type.anInt5507);
			}
		} else if (shape == 3) {
			@Pc(1631) Entity local1631;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(1647) Class96 local1647 = type.method4450(local159, arg8, 3, local193, local151, local253, local330, angle, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local1647.aClass56_Sub1_3, local159, local195, local167);
				}
				local1631 = local1647.aClass53_3;
			} else {
				local1631 = new Loc(id, 3, angle, arg3, x, z, -1, type.aBoolean380, null);
			}
			SceneGraph.setWall(y, x, z, local193, local1631, null, Static6.anIntArray519[angle], 0, pickKey2);
			if (type.aBoolean377 && arg8) {
				if (angle == 0) {
					Static5.aByteArrayArrayArray18[y][x][z + 1] = 50;
				} else if (angle == 1) {
					Static5.aByteArrayArrayArray18[y][x + 1][z + 1] = 50;
				} else if (angle == 2) {
					Static5.aByteArrayArrayArray18[y][x + 1][z] = 50;
				} else if (angle == 3) {
					Static5.aByteArrayArrayArray18[y][x][z] = 50;
				}
			}
			if (type.anInt5509 != 0 && arg7 != null) {
				arg7.flagWall(z, type.aBoolean374, !type.aBoolean385, x, shape, angle);
			}
		} else if (shape == 9) {
			@Pc(1796) Entity local1796;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(1812) Class96 local1812 = type.method4450(local159, arg8, shape, local193, local151, local253, local330, angle, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local1812.aClass56_Sub1_3, local159, local195, local167);
				}
				local1796 = local1812.aClass53_3;
			} else {
				local1796 = new Loc(id, shape, angle, arg3, x, z, -1, type.aBoolean380, null);
			}
			SceneGraph.method2196(y, x, z, local193, 1, 1, local1796, pickKey2);
			if (type.anInt5509 != 0 && arg7 != null) {
				arg7.method567(type.aBoolean374, !type.aBoolean385, length, width, z, x);
			}
			if (type.anInt5507 != 16) {
				Static10.method344(y, x, z, type.anInt5507);
			}
		} else if (shape == 4) {
			@Pc(1914) Entity local1914;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(1930) Class96 local1930 = type.method4450(local159, arg8, 4, local193, local151, local253, local330, angle, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local1930.aClass56_Sub1_3, local159, local195, local167);
				}
				local1914 = local1930.aClass53_3;
			} else {
				local1914 = new Loc(id, 4, angle, arg3, x, z, -1, type.aBoolean380, null);
			}
			SceneGraph.setWallDecor(y, x, z, local193, local1914, null, Static2.anIntArray651[angle], 0, 0, 0, pickKey2);
		} else if (shape == 5) {
			@Pc(1967) long local1967 = SceneGraph.getWallPickKey(y, x, z);
			@Pc(1969) int local1969 = 16;
			if (local1967 != 0L) {
				local1969 = LocTypeList.get((int) (local1967 >>> 32) & Integer.MAX_VALUE).anInt5507;
			}
			@Pc(2040) Entity local2040;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(2013) Class96 local2013 = type.method4450(local159, arg8, 4, local193, local151, local253, local330, angle, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local2013.aClass56_Sub1_3, local159 - Static4.anIntArray315[angle] * 8, local195, local167 - Static6.anIntArray475[angle] * 8);
				}
				local2040 = local2013.aClass53_3;
			} else {
				local2040 = new Loc(id, 4, angle, arg3, x, z, -1, type.aBoolean380, null);
			}
			SceneGraph.setWallDecor(y, x, z, local193, local2040, null, Static2.anIntArray651[angle], 0, Static4.anIntArray315[angle] * local1969, Static6.anIntArray475[angle] * local1969, pickKey2);
		} else if (shape == 6) {
			@Pc(2089) long local2089 = SceneGraph.getWallPickKey(y, x, z);
			@Pc(2091) int local2091 = 8;
			if (local2089 != 0L) {
				local2091 = LocTypeList.get(Integer.MAX_VALUE & (int) (local2089 >>> 32)).anInt5507 / 2;
			}
			@Pc(2170) Entity local2170;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(2143) Class96 local2143 = type.method4450(local159, arg8, 4, local193, local151, local253, local330, angle + 4, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local2143.aClass56_Sub1_3, local159 - Static3.anIntArray166[angle] * 8, local195, local167 - Static7.anIntArray646[angle] * 8);
				}
				local2170 = local2143.aClass53_3;
			} else {
				local2170 = new Loc(id, 4, angle + 4, arg3, x, z, -1, type.aBoolean380, null);
			}
			SceneGraph.setWallDecor(y, x, z, local193, local2170, null, 256, angle, Static3.anIntArray166[angle] * local2091, Static7.anIntArray646[angle] * local2091, pickKey2);
		} else if (shape == 7) {
			@Pc(2219) int local2219 = angle + 2 & 0x3;
			@Pc(2248) Entity local2248;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(2266) Class96 local2266 = type.method4450(local159, arg8, 4, local193, local151, local253, local330, local2219 + 4, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local2266.aClass56_Sub1_3, local159, local195, local167);
				}
				local2248 = local2266.aClass53_3;
			} else {
				local2248 = new Loc(id, 4, local2219 + 4, arg3, x, z, -1, type.aBoolean380, null);
			}
			SceneGraph.setWallDecor(y, x, z, local193, local2248, null, 256, local2219, 0, 0, pickKey2);
		} else if (shape == 8) {
			@Pc(2300) int local2300 = 8;
			@Pc(2305) long local2305 = SceneGraph.getWallPickKey(y, x, z);
			if (local2305 != 0L) {
				local2300 = LocTypeList.get((int) (local2305 >>> 32) & Integer.MAX_VALUE).anInt5507 / 2;
			}
			@Pc(2328) int local2328 = angle + 2 & 0x3;
			@Pc(2392) Entity local2392;
			@Pc(2429) Entity local2429;
			if (type.anInt5523 == -1 && type.anIntArray633 == null && type.multiLocs == null && !type.aBoolean379) {
				@Pc(2350) int local2350 = Static3.anIntArray166[angle] * 8;
				@Pc(2356) int local2356 = Static7.anIntArray646[angle] * 8;
				@Pc(2372) Class96 local2372 = type.method4450(local159, arg8, 4, local193, local151, local253, local330, angle + 4, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local2372.aClass56_Sub1_3, local159 - local2350, local195, local167 - local2356);
				}
				local2392 = local2372.aClass53_3;
				@Pc(2410) Class96 local2410 = type.method4450(local159, arg8, 4, local193, local151, local253, local330, local2328 + 4, local167, null);
				if (GlRenderer.enabled && local330) {
					Static14.method1212(local2410.aClass56_Sub1_3, local159 - local2350, local195, local167 - local2356);
				}
				local2429 = local2410.aClass53_3;
			} else {
				local2392 = new Loc(id, 4, angle + 4, arg3, x, z, -1, type.aBoolean380, null);
				local2429 = new Loc(id, 4, local2328 + 4, arg3, x, z, -1, type.aBoolean380, null);
			}
			SceneGraph.setWallDecor(y, x, z, local193, local2392, local2429, 256, angle, local2300 * Static3.anIntArray166[angle], local2300 * Static7.anIntArray646[angle], pickKey2);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method2280(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		arg2 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
			for (@Pc(29) int local29 = -arg5; local29 < 0; local29++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = arg0[arg4];
					arg0[arg4++] = (((local40 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((local40 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([I[BIIIIIIIII[I[I)V")
	public static void method2281(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12) {
		@Pc(3) int local3 = arg2 - SoftwareRaster.clipX;
		@Pc(7) int local7 = arg3 - SoftwareRaster.clipY;
		for (@Pc(9) int local9 = local7; local9 < local7 + arg5; local9++) {
			@Pc(18) int local18 = arg11[local9];
			@Pc(22) int local22 = arg12[local9];
			@Pc(24) int local24 = arg4;
			if (local3 > local18) {
				@Pc(31) int local31 = local3 - local18;
				if (local31 >= local22) {
					arg7 += arg4 + arg10;
					arg8 += arg4 + arg9;
					continue;
				}
				local22 -= local31;
			} else {
				@Pc(56) int local56 = local18 - local3;
				if (local56 >= arg4) {
					arg7 += arg4 + arg10;
					arg8 += arg4 + arg9;
					continue;
				}
				arg7 += local56;
				local24 = arg4 - local56;
				arg8 += local56;
			}
			@Pc(86) int local86 = 0;
			if (local24 < local22) {
				local22 = local24;
			} else {
				local86 = local24 - local22;
			}
			for (@Pc(99) int local99 = -local22; local99 < 0; local99++) {
				if (arg1[arg7++] == 0) {
					arg8++;
				} else {
					SoftwareRaster.pixels[arg8++] = arg6;
				}
			}
			arg7 += local86 + arg10;
			arg8 += local86 + arg9;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method2282(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(16) int local16 = local4; local16 < 0; local16++) {
				@Pc(21) int local21 = arg3 + 1;
				@Pc(26) int local26;
				if (arg1[arg3] == 0) {
					local26 = arg4 + 1;
				} else {
					local26 = arg4 + 1;
					arg0[arg4] = arg2;
				}
				@Pc(33) int local33 = local21 + 1;
				@Pc(38) int local38;
				if (arg1[local21] == 0) {
					local38 = local26 + 1;
				} else {
					local38 = local26 + 1;
					arg0[local26] = arg2;
				}
				@Pc(45) int local45 = local33 + 1;
				@Pc(50) int local50;
				if (arg1[local33] == 0) {
					local50 = local38 + 1;
				} else {
					local50 = local38 + 1;
					arg0[local38] = arg2;
				}
				arg3 = local45 + 1;
				if (arg1[local45] == 0) {
					arg4 = local50 + 1;
				} else {
					arg4 = local50 + 1;
					arg0[local50] = arg2;
				}
			}
			for (@Pc(70) int local70 = arg5; local70 < 0; local70++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIZ[[F[[FLclient!ih;B[[IIIBIZI[[FII[Z[[II[IZ)V")
	private static void method2283(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) Class4_Sub12 arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int arg12, @OriginalArg(14) float[][] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) boolean[] arg16, @OriginalArg(18) int[][] arg17, @OriginalArg(19) int arg18, @OriginalArg(20) int[] arg19, @OriginalArg(21) boolean arg20) {
		@Pc(12) int local12 = (arg18 << 8) + (arg20 ? 255 : 0);
		@Pc(22) int local22 = (arg14 << 8) + (arg2 ? 255 : 0);
		@Pc(32) int local32 = (arg11 ? 255 : 0) + (arg8 << 8);
		@Pc(46) int local46 = (arg7 << 8) + (arg0 ? 255 : 0);
		@Pc(52) int[] local52 = new int[arg19.length / 2];
		for (@Pc(58) int local58 = 0; local58 < local52.length; local58++) {
			@Pc(72) int local72 = arg19[local58 + local58];
			@Pc(80) int local80 = arg19[local58 + local58 + 1];
			@Pc(92) int[][] local92 = arg17 == null || arg16 == null || !arg16[local58] ? arg6 : arg17;
			local52[local58] = Static37.method4757(arg13, local80, arg1, local92, arg3, arg17, arg5, local22, arg15, false, (float) arg12, arg4, arg9, local72, local46, local32, local12);
		}
		arg5.method1870(arg10, arg15, arg1, local52, null, false);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!fe;)V")
	public static void method2284(@OriginalArg(1) SoftwareIndexedSprite arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static2.anIntArray159.length; local7++) {
			Static2.anIntArray159[local7] = 0;
		}
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			@Pc(41) int local41 = (int) (Math.random() * 128.0D * (double) 256);
			Static2.anIntArray159[local41] = (int) (Math.random() * 284.0D);
		}
		for (@Pc(53) int local53 = 0; local53 < 20; local53++) {
			for (@Pc(58) int local58 = 1; local58 < 255; local58++) {
				for (@Pc(69) int local69 = 1; local69 < 127; local69++) {
					@Pc(78) int local78 = (local58 << 7) + local69;
					Static6.anIntArray544[local78] = (Static2.anIntArray159[local78 + 128] + Static2.anIntArray159[local78 + 1] + Static2.anIntArray159[local78 - 1] + Static2.anIntArray159[local78 - 128]) / 4;
				}
			}
			@Pc(115) int[] local115 = Static2.anIntArray159;
			Static2.anIntArray159 = Static6.anIntArray544;
			Static6.anIntArray544 = local115;
		}
		if (arg0 == null) {
			return;
		}
		@Pc(127) int local127 = 0;
		for (@Pc(129) int local129 = 0; local129 < arg0.height; local129++) {
			for (@Pc(139) int local139 = 0; local139 < arg0.width; local139++) {
				if (arg0.pixels[local127++] != 0) {
					@Pc(161) int local161 = local139 + arg0.xOffset + 16;
					@Pc(168) int local168 = local129 + arg0.yOffset + 16;
					@Pc(174) int local174 = (local168 << 7) + local161;
					Static2.anIntArray159[local174] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)I")
	public static int method2286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			@Pc(45) int local45 = arg1 * (arg0 & 0x7F) >> 7;
			if (local45 < 2) {
				local45 = 2;
			} else if (local45 > 126) {
				local45 = 126;
			}
			return (arg0 & 0xFF80) + local45;
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "()V")
	public static void method2295() {
		if (Static4.aByteArray29 != null) {
			return;
		}
		Static4.aByteArray29 = new byte[16384];
		for (@Pc(6) int local6 = 0; local6 < 64; local6++) {
			@Pc(13) int local13 = 64 - local6;
			local13 *= local13;
			@Pc(23) int local23 = 128 - local6 - 1;
			@Pc(27) int local27 = local6 * 128;
			@Pc(31) int local31 = local23 * 128;
			for (@Pc(33) int local33 = 0; local33 < 64; local33++) {
				@Pc(40) int local40 = 64 - local33;
				local40 *= local40;
				@Pc(50) int local50 = 128 - local33 - 1;
				@Pc(60) int local60 = 256 - (local40 + local13 << 8) / 4096;
				@Pc(68) int local68 = local60 * 16 * 192 / 1536;
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 > 255) {
					local68 = 255;
				}
				Static4.aByteArray29[local27 + local33] = Static4.aByteArray29[local27 + local50] = Static4.aByteArray29[local31 + local33] = Static4.aByteArray29[local31 + local50] = (byte) local68;
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "()V")
	public static void method2296() {
		if (Static4.aClass53_Sub3_1 != null) {
			return;
		}
		@Pc(10) RawModel local10 = Static4.aClass53_Sub3_1 = new RawModel(260, 480, 0);
		@Pc(13) int[] local13 = local10.vertexX;
		@Pc(16) int[] local16 = local10.vertexY;
		@Pc(19) int[] local19 = local10.vertexZ;
		@Pc(22) int[] local22 = local10.triangleVertexA;
		@Pc(25) int[] local25 = local10.triangleVertexB;
		@Pc(28) int[] local28 = local10.triangleVertexC;
		local10.vertexCount = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = MathUtils.SINE[local66] >> 1;
			@Pc(78) int local78 = MathUtils.COSINE[local66] >> 1;
			for (@Pc(80) int local80 = 1; local80 < 16; local80++) {
				@Pc(89) int local89 = local80 * 1024 / 16;
				@Pc(95) int local95 = MathUtils.COSINE[local89] >> 9;
				@Pc(105) int local105 = (MathUtils.SINE[local89] >> 1) * local72 >> 23;
				@Pc(115) int local115 = (MathUtils.SINE[local89] >> 1) * local78 >> 23;
				local13[local10.vertexCount] = local115;
				local16[local10.vertexCount] = local95;
				local19[local10.vertexCount] = -local105;
				local10.vertexCount++;
			}
			if (local57 > 0) {
				@Pc(147) int local147 = local57 * 15 + 2;
				@Pc(151) int local151 = local147 - 15;
				local22[local10.triangleCount] = 0;
				local25[local10.triangleCount] = local151;
				local28[local10.triangleCount] = local147;
				local10.triangleCount++;
				for (@Pc(174) int local174 = 1; local174 < 15; local174++) {
					@Pc(181) int local181 = local151 + 1;
					@Pc(185) int local185 = local147 + 1;
					local22[local10.triangleCount] = local151;
					local25[local10.triangleCount] = local181;
					local28[local10.triangleCount] = local147;
					local10.triangleCount++;
					local22[local10.triangleCount] = local181;
					local25[local10.triangleCount] = local185;
					local28[local10.triangleCount] = local147;
					local10.triangleCount++;
					local151 = local181;
					local147 = local185;
				}
				local22[local10.triangleCount] = local147;
				local25[local10.triangleCount] = local151;
				local28[local10.triangleCount] = 1;
				local10.triangleCount++;
			}
		}
		local10.anInt3355 = local10.vertexCount;
		local10.aByteArray35 = null;
		local10.triangleTextures = null;
		local10.anIntArray325 = null;
		local10.anIntArray323 = null;
		local10.aByteArray37 = null;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "()V")
	public static void method2297() {
		if (Static4.aByteBuffer9 != null) {
			return;
		}
		@Pc(6) Buffer local6 = new Buffer(1088);
		@Pc(11) Buffer local11 = new Buffer(5140);
		if (GlRenderer.bigEndian) {
			local11.writeFloat(0.0F);
			local11.writeFloat(1.0F);
			local11.writeFloat(0.0F);
			local11.writeFloat(0.5F);
			local11.writeFloat(1.0F);
			local11.writeFloat(0.0F);
			local11.writeFloat(-1.0F);
			local11.writeFloat(0.0F);
			local11.writeFloat(0.5F);
			local11.writeFloat(0.0F);
		} else {
			local11.writeFloatLE(0.0F);
			local11.writeFloatLE(1.0F);
			local11.writeFloatLE(0.0F);
			local11.writeFloatLE(0.5F);
			local11.writeFloatLE(1.0F);
			local11.writeFloatLE(0.0F);
			local11.writeFloatLE(-1.0F);
			local11.writeFloatLE(0.0F);
			local11.writeFloatLE(0.5F);
			local11.writeFloatLE(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) MathUtils.SINE[local109] / 65535.0F;
			@Pc(123) float local123 = (float) MathUtils.COSINE[local109] / 65535.0F;
			for (@Pc(125) int local125 = 1; local125 < 16; local125++) {
				@Pc(134) int local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) MathUtils.COSINE[local134] / 65535.0F;
				@Pc(150) float local150 = (float) MathUtils.SINE[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) MathUtils.SINE[local134] * local123 / 65535.0F;
				if (GlRenderer.bigEndian) {
					local11.writeFloat(local159);
					local11.writeFloat(local141);
					local11.writeFloat(local150);
					local11.writeFloat(local96);
					local11.writeFloat(local98);
				} else {
					local11.writeFloatLE(local159);
					local11.writeFloatLE(local141);
					local11.writeFloatLE(local150);
					local11.writeFloatLE(local96);
					local11.writeFloatLE(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				@Pc(216) int local216 = local100 * 15 + 2;
				@Pc(220) int local220 = local216 - 15;
				if (GlRenderer.bigEndian) {
					local6.writeShort(0);
					local6.writeShort(0);
					for (@Pc(232) int local232 = 1; local232 < 16; local232++) {
						local6.writeShort(local220++);
						local6.writeShort(local216++);
					}
					local6.writeShort(1);
					local6.writeShort(1);
				} else {
					local6.writeShortLE(0);
					local6.writeShortLE(0);
					for (@Pc(266) int local266 = 1; local266 < 16; local266++) {
						local6.writeShortLE(local220++);
						local6.writeShortLE(local216++);
					}
					local6.writeShortLE(1);
					local6.writeShortLE(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		Static4.aByteBuffer9 = ByteBuffer.allocateDirect(local11.position);
		Static4.aByteBuffer9.put(local11.bytes, 0, local11.position);
		Static4.aByteBuffer9.flip();
		Static4.aByteBuffer10 = ByteBuffer.allocateDirect(local6.position);
		Static4.aByteBuffer10.put(local6.bytes, 0, local6.position);
		Static4.aByteBuffer10.flip();
	}

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "()V")
	public static void method2303() {
		if (Static4.anInt2868 != -1) {
			GlCleaner.deleteTexture(Static4.anInt2868, 0, Static4.anInt2857);
		}
		Static4.anInt2868 = -1;
		Static4.anInt2857 = -1;
		Static4.aByteBuffer9 = null;
		Static4.aByteBuffer10 = null;
		Static4.aClass53_Sub3_1 = null;
		Static4.aByteArray29 = null;
	}

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "()V")
	public static void method2305() {
		method2295();
		if (Static4.anInt2868 == -1 || Static4.anInt2857 != GlCleaner.contextId) {
			Static4.anInt2868 = GlTextureAllocator.allocateTextureAndStorage2d(GlTextureAllocator.GL_ALPHA, Static4.aByteArray29);
			Static4.anInt2857 = GlCleaner.contextId;
		}
	}

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
	public static void method2387() {
		if (!client.advertSuppressed && client.modeWhere != 2) {
			try {
				BrowserControl.call(client.instance, "tbrefresh");
			} catch (@Pc(24) Throwable local24) {
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(II)V")
	public static void method2388(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = PlayerList.size;
		if (arg0 == 0) {
			local7 = 1;
		}
		for (@Pc(14) int local14 = 0; local14 < local7; local14++) {
			@Pc(32) Player local32;
			if (arg0 == 0) {
				local32 = PlayerList.self;
			} else {
				local32 = PlayerList.players[PlayerList.ids[local14]];
			}
			if (local32 != null && local32.method3310()) {
				@Pc(46) int local46 = local32.getSize();
				if (arg0 == 0 || arg0 == local46) {
					if (local46 == 1) {
						if ((local32.x & 0x7F) == 64 && (local32.z & 0x7F) == 64) {
							@Pc(211) int local211 = local32.x >> 7;
							@Pc(216) int local216 = local32.z >> 7;
							if (local211 >= 0 && local211 < 104 && local216 >= 0 && local216 < 104) {
								@Pc(238) int local238 = Static1.anIntArrayArray2[local211][local216]++;
							}
						}
					} else if (((local46 & 0x1) != 0 || (local32.x & 0x7F) == 0 && (local32.z & 0x7F) == 0) && ((local46 & 0x1) != 1 || (local32.x & 0x7F) == 64 && (local32.z & 0x7F) == 64)) {
						@Pc(111) int local111 = local32.x - local46 * 64 >> 7;
						@Pc(120) int local120 = local32.z - local46 * 64 >> 7;
						@Pc(126) int local126 = local32.getSize() + local111;
						if (local126 > 104) {
							local126 = 104;
						}
						if (local111 < 0) {
							local111 = 0;
						}
						@Pc(146) int local146 = local120 + local32.getSize();
						if (local120 < 0) {
							local120 = 0;
						}
						if (local146 > 104) {
							local146 = 104;
						}
						for (@Pc(161) int local161 = local111; local161 < local126; local161++) {
							for (@Pc(170) int local170 = local120; local170 < local146; local170++) {
								@Pc(183) int local183 = Static1.anIntArrayArray2[local161][local170]++;
							}
						}
					}
				}
			}
		}
		label220:
		for (@Pc(246) int local246 = 0; local246 < local7; local246++) {
			@Pc(255) Player local255;
			@Pc(253) long local253;
			if (arg0 == 0) {
				local253 = 8791798054912L;
				local255 = PlayerList.self;
			} else {
				local255 = PlayerList.players[PlayerList.ids[local246]];
				local253 = (long) PlayerList.ids[local246] << 32;
			}
			if (local255 != null && local255.method3310()) {
				@Pc(280) int local280 = local255.getSize();
				if (arg0 == 0 || arg0 == local280) {
					local255.aBoolean98 = false;
					local255.aBoolean282 = true;
					if ((Preferences.manyIdleAnimations && PlayerList.size > 200 || PlayerList.size > 50) && arg0 != 0 && local255.anInt4005 == local255.method3314().anInt860) {
						local255.aBoolean98 = true;
					}
					if (local280 == 1) {
						if ((local255.x & 0x7F) == 64 && (local255.z & 0x7F) == 64) {
							@Pc(340) int local340 = local255.x >> 7;
							@Pc(345) int local345 = local255.z >> 7;
							if (local340 < 0 || local340 >= 104 || local345 < 0 || local345 >= 104) {
								continue;
							}
							if (Static1.anIntArrayArray2[local340][local345] > 1) {
								@Pc(377) int local377 = Static1.anIntArrayArray2[local340][local345]--;
								continue;
							}
						}
					} else if ((local280 & 0x1) == 0 && (local255.x & 0x7F) == 0 && (local255.z & 0x7F) == 0 || (local280 & 0x1) == 1 && (local255.x & 0x7F) == 64 && (local255.z & 0x7F) == 0) {
						@Pc(430) int local430 = local255.z - local280 * 64 >> 7;
						@Pc(440) int local440 = local255.x - local280 * 64 >> 7;
						@Pc(444) int local444 = local280 + local440;
						if (local440 < 0) {
							local440 = 0;
						}
						if (local444 > 104) {
							local444 = 104;
						}
						@Pc(458) boolean local458 = true;
						@Pc(462) int local462 = local280 + local430;
						if (local430 < 0) {
							local430 = 0;
						}
						if (local462 > 104) {
							local462 = 104;
						}
						for (@Pc(479) int local479 = local440; local479 < local444; local479++) {
							for (@Pc(488) int local488 = local430; local488 < local462; local488++) {
								if (Static1.anIntArrayArray2[local479][local488] <= 1) {
									local458 = false;
									break;
								}
							}
						}
						if (local458) {
							@Pc(517) int local517 = local440;
							while (true) {
								if (local444 <= local517) {
									continue label220;
								}
								for (@Pc(522) int local522 = local430; local522 < local462; local522++) {
									@Pc(535) int local535 = Static1.anIntArrayArray2[local517][local522]--;
								}
								local517++;
							}
						}
					}
					if (local255.anObject5 == null || client.loop < local255.anInt4042 || local255.anInt4010 <= client.loop) {
						local255.aBoolean282 = false;
						local255.anInt4006 = Static11.method522(local255.z, local255.x, Static7.y);
						SceneGraph.method637(Static7.y, local255.x, local255.z, local255.anInt4006, (local280 - 1) * 64 + 60, local255, local255.anInt4031, local253, local255.aBoolean284);
					} else {
						local255.aBoolean98 = false;
						local255.aBoolean282 = false;
						local255.anInt4006 = Static11.method522(local255.z, local255.x, Static7.y);
						SceneGraph.method584(Static7.y, local255.x, local255.z, local255.anInt4006, local255, local255.anInt4031, local253, local255.anInt4043, local255.anInt4018, local255.anInt4041, local255.anInt4038);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([[[I[[B[[F[[I[[I[[F[[B[[I[[BI[[F[[I[[[B[[BZ[[I)[Lclient!ih;")
	public static Class4_Sub12[] method2389(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int[][] arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float[][] arg10, @OriginalArg(11) int[][] arg11, @OriginalArg(12) byte[][][] arg12, @OriginalArg(13) byte[][] arg13, @OriginalArg(15) int[][] arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (@Pc(23) int local23 = 1; local23 <= 103; local23++) {
				@Pc(30) int local30 = 0;
				if (arg0 != null) {
					@Pc(45) int local45 = arg0[arg9][local11 >> 3][local23 >> 3];
					local30 = local45 >> 1 & 0x3;
				}
				@Pc(74) byte local74;
				if (local30 == 0) {
					local74 = arg13[local11][local23];
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23 - 1];
					}
				} else if (local30 == 1) {
					local74 = arg13[local11][local23 - 1];
					if (local74 == 0) {
						local74 = arg13[local11][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23];
					}
				} else if (local30 == 2) {
					local74 = arg13[local11 - 1][local23 - 1];
					if (local74 == 0) {
						local74 = arg13[local11][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23];
					}
				} else {
					local74 = arg13[local11 - 1][local23];
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23 - 1];
					}
				}
				if (local74 != 0) {
					@Pc(252) FluType local252 = FluTypeList.get((local74 & 0xFF) - 1);
					local9[local11][local23] = (local252.anInt4074 + 1 << 16) + local252.anInt4068;
				}
			}
		}
		@Pc(277) HashTable local277 = new HashTable(128);
		for (@Pc(279) int local279 = 1; local279 <= 102; local279++) {
			for (@Pc(286) int local286 = 1; local286 <= 102; local286++) {
				if (arg13[local279][local286] != 0) {
					@Pc(308) int[] local308;
					if (arg1[local279][local286] == 0) {
						local308 = Static1.anIntArrayArray5[0];
					} else {
						local308 = Static2.anIntArrayArray16[arg6[local279][local286]];
						if (local308.length == 0) {
							continue;
						}
					}
					@Pc(332) int local332 = local9[local279][local286];
					@Pc(340) int local340 = local9[local279 + 1][local286];
					@Pc(342) int local342 = 0;
					if (arg3 != null) {
						local342 = arg3[local279][local286] & 0xFFFFFF;
					}
					@Pc(363) int local363 = local9[local279 + 1][local286 + 1];
					@Pc(371) long local371 = (long) local332 << 32 | (long) local342;
					@Pc(379) long local379 = (long) local340 << 32 | (long) local342;
					@Pc(387) int local387 = local9[local279][local286 + 1];
					@Pc(395) long local395 = (long) local387 << 32 | (long) local342;
					@Pc(403) long local403 = (long) local363 << 32 | (long) local342;
					@Pc(408) int local408 = local308.length / 2;
					@Pc(414) Class4_Sub12 local414 = (Class4_Sub12) local277.get(local371);
					if (local414 == null) {
						local414 = new Class4_Sub12((local332 >> 16) - 1, (float) (local332 & 0xFFFF), false, arg11 != null, local342);
						local277.put(local371, local414);
					}
					local414.anInt2352 += local408;
					local414.anInt2355++;
					if (local379 != local371) {
						@Pc(467) Class4_Sub12 local467 = (Class4_Sub12) local277.get(local379);
						if (local467 == null) {
							local467 = new Class4_Sub12((local340 >> 16) - 1, (float) (local340 & 0xFFFF), false, arg11 != null, local342);
							local277.put(local379, local467);
						}
						local467.anInt2352 += local408;
						local467.anInt2355++;
					}
					if (local403 != local371 && local403 != local379) {
						@Pc(526) Class4_Sub12 local526 = (Class4_Sub12) local277.get(local403);
						if (local526 == null) {
							local526 = new Class4_Sub12((local363 >> 16) - 1, (float) (local363 & 0xFFFF), false, arg11 != null, local342);
							local277.put(local403, local526);
						}
						local526.anInt2355++;
						local526.anInt2352 += local408;
					}
					if (local371 != local395 && local379 != local395 && local395 != local403) {
						@Pc(594) Class4_Sub12 local594 = (Class4_Sub12) local277.get(local395);
						if (local594 == null) {
							local594 = new Class4_Sub12((local387 >> 16) - 1, (float) (local387 & 0xFFFF), false, arg11 != null, local342);
							local277.put(local395, local594);
						}
						local594.anInt2352 += local408;
						local594.anInt2355++;
					}
				}
			}
		}
		for (@Pc(645) Class4_Sub12 local645 = (Class4_Sub12) local277.head(); local645 != null; local645 = (Class4_Sub12) local277.next()) {
			local645.method1872();
		}
		for (@Pc(659) int local659 = 1; local659 <= 102; local659++) {
			for (@Pc(664) int local664 = 1; local664 <= 102; local664++) {
				@Pc(675) byte local675 = arg13[local659][local664];
				if (local675 != 0) {
					@Pc(682) int local682 = 0;
					@Pc(711) int local711;
					if ((arg12[arg9][local659][local664] & 0x8) != 0) {
						local711 = 0;
					} else if ((arg12[1][local659][local664] & 0x2) == 2 && arg9 > 0) {
						local711 = arg9 - 1;
					} else {
						local711 = arg9;
					}
					@Pc(723) int local723 = 128;
					if (arg3 != null) {
						local682 = arg3[local659][local664] & 0xFFFFFF;
						local723 = arg3[local659][local664] >>> 24 << 3;
					}
					@Pc(746) boolean[] local746 = null;
					@Pc(758) int[] local758;
					@Pc(947) byte local947;
					if (arg1[local659][local664] == 0) {
						local758 = Static1.anIntArrayArray5[0];
						@Pc(779) int local779 = arg13[local659 - 1][local664 - 1] == local675 ? 1 : -1;
						@Pc(804) int local804 = local675 == arg13[local659 + 1][local664 - 1] ? 1 : -1;
						@Pc(823) int local823 = arg13[local659 - 1][local664 + 1] == local675 ? 1 : -1;
						@Pc(837) int local837;
						@Pc(838) int local838;
						if (arg13[local659][local664 - 1] == local675) {
							local837 = local779 + 1;
							local838 = local804 + 1;
						} else {
							local838 = local804 - 1;
							local837 = local779 - 1;
						}
						@Pc(859) int local859 = arg13[local659 + 1][local664 + 1] == local675 ? 1 : -1;
						@Pc(874) int local874;
						@Pc(873) int local873;
						if (local675 == arg13[local659 + 1][local664]) {
							local873 = local838 + 1;
							local874 = local859 + 1;
						} else {
							local873 = local838 - 1;
							local874 = local859 - 1;
						}
						@Pc(888) int local888;
						@Pc(889) int local889;
						if (arg13[local659][local664 + 1] == local675) {
							local888 = local874 + 1;
							local889 = local823 + 1;
						} else {
							local889 = local823 - 1;
							local888 = local874 - 1;
						}
						@Pc(904) int local904;
						@Pc(903) int local903;
						if (local675 == arg13[local659 - 1][local664]) {
							local903 = local889 + 1;
							local904 = local837 + 1;
						} else {
							local903 = local889 - 1;
							local904 = local837 - 1;
						}
						@Pc(913) int local913 = local904 - local888;
						@Pc(918) int local918 = local873 - local903;
						if (local918 < 0) {
							local918 = -local918;
						}
						if (local913 < 0) {
							local913 = -local913;
						}
						local947 = (byte) (local913 >= local918 ? 0 : 1);
						arg8[local659][local664] = local947;
					} else {
						local758 = Static2.anIntArrayArray16[arg6[local659][local664]];
						local947 = arg8[local659][local664];
						local746 = Static4.aBooleanArrayArray3[arg6[local659][local664]];
						if (local758.length == 0) {
							continue;
						}
					}
					@Pc(991) int local991 = local9[local659][local664];
					@Pc(999) int local999 = local9[local659 + 1][local664];
					@Pc(1009) int local1009 = local9[local659 + 1][local664 + 1];
					@Pc(1017) int local1017 = local9[local659][local664 + 1];
					@Pc(1025) long local1025 = (long) local682 | (long) local991 << 32;
					@Pc(1033) long local1033 = (long) local682 | (long) local1009 << 32;
					@Pc(1041) long local1041 = (long) local1017 << 32 | (long) local682;
					@Pc(1049) long local1049 = (long) local682 | (long) local999 << 32;
					@Pc(1055) int local1055 = arg4[local659][local664];
					@Pc(1063) int local1063 = arg4[local659 + 1][local664];
					@Pc(1073) int local1073 = arg4[local659 + 1][local664 + 1];
					@Pc(1079) int local1079 = arg7[local659][local664];
					@Pc(1087) int local1087 = arg4[local659][local664 + 1];
					@Pc(1095) int local1095 = arg7[local659 + 1][local664];
					@Pc(1105) int local1105 = arg7[local659 + 1][local664 + 1];
					@Pc(1113) int local1113 = arg7[local659][local664 + 1];
					@Pc(1119) int local1119 = (local991 >> 16) - 1;
					@Pc(1125) int local1125 = (local1017 >> 16) - 1;
					@Pc(1131) int local1131 = (local1009 >> 16) - 1;
					@Pc(1137) Class4_Sub12 local1137 = (Class4_Sub12) local277.get(local1025);
					@Pc(1143) int local1143 = (local999 >> 16) - 1;
					method2283(local991 <= local1017, local664, local991 <= local999, arg5, arg10, local1137, arg14, Static15.method1474(local1113, local1119, local1087), Static15.method1474(local1105, local1119, local1073), local947, local711, local991 <= local1009, local723, arg2, Static15.method1474(local1095, local1119, local1063), local659, local746, arg11, Static15.method1474(local1079, local1119, local1055), local758, local991 <= local991);
					if (local1049 != local1025) {
						@Pc(1216) Class4_Sub12 local1216 = (Class4_Sub12) local277.get(local1049);
						method2283(local1017 >= local999, local664, local999 >= local999, arg5, arg10, local1216, arg14, Static15.method1474(local1113, local1143, local1087), Static15.method1474(local1105, local1143, local1073), local947, local711, local999 <= local1009, local723, arg2, Static15.method1474(local1095, local1143, local1063), local659, local746, arg11, Static15.method1474(local1079, local1143, local1055), local758, local999 <= local991);
					}
					if (local1025 != local1033 && local1033 != local1049) {
						@Pc(1302) Class4_Sub12 local1302 = (Class4_Sub12) local277.get(local1033);
						method2283(local1009 <= local1017, local664, local1009 <= local999, arg5, arg10, local1302, arg14, Static15.method1474(local1113, local1131, local1087), Static15.method1474(local1105, local1131, local1073), local947, local711, local1009 <= local1009, local723, arg2, Static15.method1474(local1095, local1131, local1063), local659, local746, arg11, Static15.method1474(local1079, local1131, local1055), local758, local1009 <= local991);
					}
					if (local1041 != local1025 && local1041 != local1049 && local1033 != local1041) {
						@Pc(1392) Class4_Sub12 local1392 = (Class4_Sub12) local277.get(local1041);
						method2283(local1017 <= local1017, local664, local999 >= local1017, arg5, arg10, local1392, arg14, Static15.method1474(local1113, local1125, local1087), Static15.method1474(local1105, local1125, local1073), local947, local711, local1017 <= local1009, local723, arg2, Static15.method1474(local1095, local1125, local1063), local659, local746, arg11, Static15.method1474(local1079, local1125, local1055), local758, local1017 <= local991);
					}
				}
			}
		}
		for (@Pc(1466) Class4_Sub12 local1466 = (Class4_Sub12) local277.head(); local1466 != null; local1466 = (Class4_Sub12) local277.next()) {
			if (local1466.anInt2357 == 0) {
				local1466.unlink();
			} else {
				local1466.method1866();
			}
		}
		@Pc(1489) int local1489 = local277.size();
		@Pc(1492) Class4_Sub12[] local1492 = new Class4_Sub12[local1489];
		local277.toArray(local1492);
		@Pc(1500) long[] local1500 = new long[local1489];
		for (@Pc(1502) int local1502 = 0; local1502 < local1489; local1502++) {
			local1500[local1502] = local1492[local1502].key;
		}
		Static11.method563(local1500, local1492);
		return local1492;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
	public static void method2413() {
		ObjTypeList.models.clear();
	}

}

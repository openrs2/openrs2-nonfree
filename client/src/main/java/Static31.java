import java.awt.Frame;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([Ljava/lang/String;ZI[SI)V")
	public static void method3652(@OriginalArg(0) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(26) int local26 = (arg3 + arg1) / 2;
		@Pc(28) int local28 = arg3;
		@Pc(32) String local32 = arg0[local26];
		arg0[local26] = arg0[arg1];
		arg0[arg1] = local32;
		@Pc(46) short local46 = arg2[local26];
		arg2[local26] = arg2[arg1];
		arg2[arg1] = local46;
		for (@Pc(58) int local58 = arg3; local58 < arg1; local58++) {
			if (local32 == null || arg0[local58] != null && arg0[local58].compareTo(local32) < (local58 & 0x1)) {
				@Pc(88) String local88 = arg0[local58];
				arg0[local58] = arg0[local28];
				arg0[local28] = local88;
				@Pc(102) short local102 = arg2[local58];
				arg2[local58] = arg2[local28];
				arg2[local28++] = local102;
			}
		}
		arg0[arg1] = arg0[local28];
		arg0[local28] = local32;
		arg2[arg1] = arg2[local28];
		arg2[local28] = local46;
		method3652(arg0, local28 - 1, arg2, arg3);
		method3652(arg0, arg1, arg2, local28 + 1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lclient!ke;")
	public static Class4_Sub3_Sub5_Sub2 method3656(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub3_Sub5_Sub2 local6 = (Class4_Sub3_Sub5_Sub2) Static1.aClass26_3.get((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = client.js5Archive13.fetchFile(arg0, 0);
		@Pc(35) Class4_Sub3_Sub5_Sub2 local35 = new Class4_Sub3_Sub5_Sub2(local22);
		local35.method2267(Static3.aClass56Array3, null);
		Static1.aClass26_3.put((long) arg0, local35);
		return local35;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lsignlink!pm;Ljava/awt/Frame;Z)V")
	public static void method3658(@OriginalArg(0) SignLink arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) PrivilegedRequest local10 = arg0.exitFullScreen(arg1);
			while (local10.status == 0) {
				ThreadUtils.sleep(10L);
			}
			if (local10.status == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			ThreadUtils.sleep(100L);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IS)Z")
	public static boolean method3659(@OriginalArg(1) short arg0) {
		if (arg0 == 58 || arg0 == 35 || arg0 == 17 || arg0 == 10 || arg0 == 51 || arg0 == 9 || arg0 == 15 || arg0 == 50) {
			return true;
		} else if (arg0 == 23 || arg0 == 1 || arg0 == 1001 || arg0 == 1009) {
			return true;
		} else if (arg0 == 30 || arg0 == 20 || arg0 == 13 || arg0 == 2 || arg0 == 49) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 34 || arg0 == 7 || arg0 == 18 || arg0 == 11 || arg0 == 3;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([Lclient!wf;ZIIII)V")
	public static void method3660(@OriginalArg(0) Component[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(19) Component local19 = arg0[local7];
			if (local19 != null && local19.anInt5937 == arg3) {
				Static11.method526(arg1, arg2, local19, arg4);
				Static36.method3812(arg2, arg4, local19);
				if (local19.anInt5931 > local19.anInt5887 - local19.anInt5949) {
					local19.anInt5931 = local19.anInt5887 - local19.anInt5949;
				}
				if (local19.anInt5932 > local19.anInt5885 - local19.anInt5893) {
					local19.anInt5932 = local19.anInt5885 - local19.anInt5893;
				}
				if (local19.anInt5931 < 0) {
					local19.anInt5931 = 0;
				}
				if (local19.anInt5932 < 0) {
					local19.anInt5932 = 0;
				}
				if (local19.type == 0) {
					Static34.method4251(arg1, local19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)V")
	public static void method3661(@OriginalArg(1) int arg0) {
		Static5.anInt4215 = 100;
		Static4.anInt2853 = 3;
		Static2.anInt1874 = -1;
		Static5.anInt3920 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg0 && arg4 == arg5 && arg8 == arg2 && arg1 == arg6) {
			Static32.method4022(arg5, arg6, arg7, arg0, arg2);
			return;
		}
		@Pc(32) int local32 = arg0;
		@Pc(34) int local34 = arg5;
		@Pc(38) int local38 = arg0 * 3;
		@Pc(42) int local42 = arg4 * 3;
		@Pc(46) int local46 = arg3 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(61) int local61 = arg2 + local46 - arg0 - local50;
		@Pc(65) int local65 = arg5 * 3;
		@Pc(75) int local75 = local38 + local50 - local46 - local46;
		@Pc(79) int local79 = arg1 * 3;
		@Pc(90) int local90 = local79 + local65 - local42 - local42;
		@Pc(100) int local100 = local42 + arg6 - arg5 - local79;
		@Pc(104) int local104 = local46 - local38;
		@Pc(108) int local108 = local42 - local65;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(119) int local119 = local110 * local110 >> 12;
			@Pc(123) int local123 = local119 * local75;
			@Pc(129) int local129 = local110 * local119 >> 12;
			@Pc(133) int local133 = local129 * local61;
			@Pc(137) int local137 = local108 * local110;
			@Pc(141) int local141 = local90 * local119;
			@Pc(145) int local145 = local100 * local129;
			@Pc(149) int local149 = local104 * local110;
			@Pc(159) int local159 = (local149 + local123 + local133 >> 12) + arg0;
			@Pc(170) int local170 = (local137 + local145 + local141 >> 12) + arg5;
			Static32.method4022(local34, local170, arg7, local32, local159);
			local34 = local170;
			local32 = local159;
		}
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(B)V")
	public static void method3688() {
		Static6.aClass26_48.clear();
		Static1.aClass26_1.clear();
		Static1.aClass26_4.clear();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!fh;IZI)Lclient!vn;")
	public static SoftwareSprite method3691(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1) {
		return Static9.method197(arg0, arg1, 0) ? Static34.method1546() : null;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(ZI)V")
	public static void method3733(@OriginalArg(0) boolean arg0) {
		for (@Pc(8) Class4_Sub11 local8 = (Class4_Sub11) Static1.aClass112_2.head(); local8 != null; local8 = (Class4_Sub11) Static1.aClass112_2.next()) {
			if (local8.aClass4_Sub6_Sub4_3 != null) {
				Static5.aClass4_Sub6_Sub3_2.method2670(local8.aClass4_Sub6_Sub4_3);
				local8.aClass4_Sub6_Sub4_3 = null;
			}
			if (local8.aClass4_Sub6_Sub4_2 != null) {
				Static5.aClass4_Sub6_Sub3_2.method2670(local8.aClass4_Sub6_Sub4_2);
				local8.aClass4_Sub6_Sub4_2 = null;
			}
			local8.unlink();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class4_Sub11 local54 = (Class4_Sub11) Static2.aClass112_9.head(); local54 != null; local54 = (Class4_Sub11) Static2.aClass112_9.next()) {
			if (local54.aClass4_Sub6_Sub4_3 != null) {
				Static5.aClass4_Sub6_Sub3_2.method2670(local54.aClass4_Sub6_Sub4_3);
				local54.aClass4_Sub6_Sub4_3 = null;
			}
			local54.unlink();
		}
		for (@Pc(83) Class4_Sub11 local83 = (Class4_Sub11) Static5.aClass84_18.head(); local83 != null; local83 = (Class4_Sub11) Static5.aClass84_18.next()) {
			if (local83.aClass4_Sub6_Sub4_3 != null) {
				Static5.aClass4_Sub6_Sub3_2.method2670(local83.aClass4_Sub6_Sub4_3);
				local83.aClass4_Sub6_Sub4_3 = null;
			}
			local83.unlink();
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(III)Lclient!vf;")
	public static Class180 method3734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = Terrain.tiles[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class180 local14 = local7.aClass180_1;
			local7.aClass180_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIZII)V")
	public static void method3746(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static2.anInt1997++;
		Static20.method1932();
		if (arg2) {
			Static9.method174(0, false, false);
		} else {
			Static22.method2388(0);
			Static9.method174(0, false, true);
			if (Static5.anInt4166 == 0) {
				for (@Pc(49) int local49 = 1; local49 <= 5; local49++) {
					Static9.method174(local49, false, false);
					Static9.method174(local49, true, false);
					Static22.method2388(local49);
				}
			} else {
				for (@Pc(26) int local26 = 1; local26 <= 5; local26++) {
					Static22.method2388(local26);
					Static9.method174(local26, false, false);
					Static9.method174(local26, true, false);
				}
			}
		}
		if (!arg2) {
			Static20.method1976();
		}
		Static35.method4321();
		if (GlRenderer.enabled) {
			Static32.method3924(arg4, true, arg1, arg0, arg3);
			arg3 = Static6.anInt4546;
			arg1 = Static2.anInt1333;
			arg4 = Static6.anInt4856;
			arg0 = Static5.anInt3483;
		}
		Static5.anInt3506 = arg0;
		Static5.anInt3503 = arg4;
		if (Static1.anInt772 == 1) {
			@Pc(121) int local121 = (int) Static5.aFloat147;
			if (Static1.anInt626 / 256 > local121) {
				local121 = Static1.anInt626 / 256;
			}
			@Pc(137) int local137 = (int) Static5.aFloat97 + Static1.anInt242 & 0x7FF;
			if (Static3.aBooleanArray13[4] && Static7.anIntArray626[4] + 128 > local121) {
				local121 = Static7.anIntArray626[4] + 128;
			}
			Static32.method3954(local137, Static11.method522(PlayerList.self.z, PlayerList.self.x, Static7.y) - 50, local121, local121 * 3 + 600, Static3.anInt2496, arg1, Static7.anInt5412);
		} else if (Static1.anInt772 == 5) {
			Static12.method698(arg1);
		}
		@Pc(181) int local181 = Static3.anInt2519;
		@Pc(183) int local183 = Static7.anInt5678;
		@Pc(185) int local185 = Static5.anInt4066;
		@Pc(187) int local187 = Static2.anInt1931;
		@Pc(189) int local189 = Static5.anInt3656;
		for (@Pc(191) int local191 = 0; local191 < 5; local191++) {
			if (Static3.aBooleanArray13[local191]) {
				@Pc(237) int local237 = (int) ((double) -Static7.anIntArray625[local191] + Math.random() * (double) (Static7.anIntArray625[local191] * 2 + 1) + Math.sin((double) Static1.anIntArray13[local191] / 100.0D * (double) Static1.anIntArray14[local191]) * (double) Static7.anIntArray626[local191]);
				if (local191 == 1) {
					Static2.anInt1931 += local237;
				}
				if (local191 == 4) {
					Static5.anInt4066 += local237;
					if (Static5.anInt4066 < 128) {
						Static5.anInt4066 = 128;
					}
					if (Static5.anInt4066 > 383) {
						Static5.anInt4066 = 383;
					}
				}
				if (local191 == 3) {
					Static5.anInt3656 = Static5.anInt3656 + local237 & 0x7FF;
				}
				if (local191 == 2) {
					Static7.anInt5678 += local237;
				}
				if (local191 == 0) {
					Static3.anInt2519 += local237;
				}
			}
		}
		Static37.method4721();
		if (GlRenderer.enabled) {
			Static18.method1693(arg0, arg4, arg0 + arg3, arg1 + arg4);
			@Pc(363) float local363 = (float) Static5.anInt4066 * 0.17578125F;
			@Pc(368) float local368 = (float) Static5.anInt3656 * 0.17578125F;
			if (Static1.anInt772 == 3) {
				local363 = Static1.aFloat15 * 360.0F / 6.2831855F;
				local368 = Static7.aFloat154 * 360.0F / 6.2831855F;
			}
			@Pc(398) int local398;
			if (Static4.anInt3304 == 10) {
				local398 = Static33.method4153(Preferences.brightness, Static7.anInt5678 >> 10, Static5.anInt4156, Static3.anInt2519 >> 10);
			} else {
				local398 = Static33.method4153(Preferences.brightness, PlayerList.self.anIntArray426[0] >> 3, Static5.anInt4156, PlayerList.self.anIntArray422[0] >> 3);
			}
			if (Static6.anInt4863 >= 0) {
				GlRenderer.clearDepthBuffer();
				@Pc(427) Class47 local427 = SkyBoxTypeList.method936(Static6.anInt4863, Static4.anInt5826, Static1.anInt466, Static5.anInt4303);
				local427.method1025(Static5.anInt3774, arg0, arg4, arg3, arg1, Static5.anInt4066, Static5.anInt3656, local398);
			} else {
				GlRenderer.clearColorAndDepthBuffers(local398);
			}
			GlRenderer.method1582(arg0, arg4, arg3, arg1, arg0 + arg3 / 2, arg4 + arg1 / 2, local363, local368, Static7.anInt5440, Static7.anInt5440);
			Static23.method1936(false);
			GlRenderer.method1618();
			GlRenderer.setDepthTestEnabled(true);
			GlRenderer.setFogEnabled(true);
		} else {
			Static34.method4209(arg0, arg4, arg3 + arg0, arg4 + arg1);
			Static23.method2561();
			if (Static6.anInt4863 >= 0) {
				@Pc(328) Class47 local328 = SkyBoxTypeList.method936(Static6.anInt4863, Static4.anInt5826, Static1.anInt466, Static5.anInt4303);
				local328.method1024(Static5.anInt3774, arg0, arg4, arg3, arg1, Static5.anInt4066, Static5.anInt3656);
			} else {
				Static33.method4205(arg0, arg4, arg3, arg1, 0);
			}
		}
		if (Static1.aBoolean17 || Static4.anInt3341 < arg0 || Static4.anInt3341 >= arg3 + arg0 || arg4 > Static5.anInt5848 || Static5.anInt5848 >= arg1 + arg4) {
			Static1.aBoolean8 = false;
			Static7.anInt5623 = 0;
		} else {
			Static7.anInt5623 = 0;
			Static1.aBoolean8 = true;
			@Pc(515) int local515 = Static4.anInt3123;
			@Pc(517) int local517 = Static1.anInt403;
			@Pc(519) int local519 = Static7.anInt6030;
			@Pc(521) int local521 = Static7.anInt5437;
			Static7.anInt5333 = local521 + (local515 - local521) * (Static4.anInt3341 - arg0) / arg3;
			Static1.anInt3 = local519 + (Static5.anInt5848 - arg4) * (local517 - local519) / arg1;
		}
		Static9.method763();
		@Pc(562) byte local562 = Static11.method561() == 2 ? (byte) Static2.anInt1997 : 1;
		if (GlRenderer.enabled) {
			Static27.method3111(client.loop, !Preferences.flickeringEffects);
			Static21.method2078(Static5.anInt3656, Static5.anInt4066, Static2.anInt1931, Static7.anInt5678, Static3.anInt2519);
			GlRenderer.anInt2085 = client.loop;
			Static25.method2728(Static3.anInt2519, Static2.anInt1931, Static7.anInt5678, Static5.anInt4066, Static5.anInt3656, Static1.aByteArrayArrayArray2, Static5.anIntArray440, Static3.anIntArray164, Static7.anIntArray620, Static6.anIntArray489, Static6.anIntArray492, Static7.y + 1, local562, PlayerList.self.x >> 7, PlayerList.self.z >> 7);
			Static7.aBoolean123 = true;
			Static27.method3112();
			Static21.method2078(0, 0, 0, 0, 0);
			Static9.method763();
			Static18.method4370(arg0, Static7.anInt5440, arg1, Static7.anInt5440, arg3, arg4);
			Static10.method462(arg4, Static7.anInt5440, arg1, Static7.anInt5440, arg3, arg0);
			Terrain.removeAllScenery();
		} else {
			Static25.method2728(Static3.anInt2519, Static2.anInt1931, Static7.anInt5678, Static5.anInt4066, Static5.anInt3656, Static1.aByteArrayArrayArray2, Static5.anIntArray440, Static3.anIntArray164, Static7.anIntArray620, Static6.anIntArray489, Static6.anIntArray492, Static7.y + 1, local562, PlayerList.self.x >> 7, PlayerList.self.z >> 7);
			Static9.method763();
			Terrain.removeAllScenery();
			Static18.method4370(arg0, 256, arg1, 256, arg3, arg4);
			Static10.method462(arg4, 256, arg1, 256, arg3, arg0);
		}
		((Js5GlTextureProvider) Static4.anInterface4_1).method458(Static5.anInt4156);
		Static28.method3327(arg4, arg0, arg1, arg3);
		Static3.anInt2519 = local181;
		Static2.anInt1931 = local187;
		Static5.anInt3656 = local189;
		Static5.anInt4066 = local185;
		Static7.anInt5678 = local183;
		if (Static3.aBoolean366 && client.js5NetQueue.getUrgentRequestCount() == 0) {
			Static3.aBoolean366 = false;
		}
		if (Static3.aBoolean366) {
			if (GlRenderer.enabled) {
				Static18.method1701(arg0, arg4, arg3, arg1, 0);
			} else {
				Static33.method4205(arg0, arg4, arg3, arg1, 0);
			}
			Static37.method4716(LocalisedText.LOADING, false);
		}
		if (!arg2 && !Static3.aBoolean366 && !Static1.aBoolean17 && arg0 <= Static4.anInt3341 && arg3 + arg0 > Static4.anInt3341 && arg4 <= Static5.anInt5848 && arg4 + arg1 > Static5.anInt5848) {
			Static16.method1518(arg1, Static4.anInt3341, arg4, arg0, arg3, Static5.anInt5848);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([Lclient!ch;B[[[IZ)V")
	public static void method3778(@OriginalArg(0) CollisionMap[] arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) boolean arg2) {
		@Pc(9) byte local9;
		if (arg2) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		if (!arg2) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				for (@Pc(25) int local25 = 0; local25 < 104; local25++) {
					for (@Pc(32) int local32 = 0; local32 < 104; local32++) {
						if ((Static4.tileFlags[local18][local25][local32] & 0x1) == 1) {
							@Pc(48) int local48 = local18;
							if ((Static4.tileFlags[1][local25][local32] & 0x2) == 2) {
								local48 = local18 - 1;
							}
							if (local48 >= 0) {
								arg0[local48].flagTile(local25, local32);
							}
						}
					}
				}
			}
			Static6.anInt4555 += (int) (Math.random() * 5.0D) - 2;
			Static2.anInt1273 += (int) (Math.random() * 5.0D) - 2;
			if (Static6.anInt4555 < -8) {
				Static6.anInt4555 = -8;
			}
			if (Static6.anInt4555 > 8) {
				Static6.anInt4555 = 8;
			}
			if (Static2.anInt1273 < -16) {
				Static2.anInt1273 = -16;
			}
			if (Static2.anInt1273 > 16) {
				Static2.anInt1273 = 16;
			}
		}
		@Pc(140) int local140 = Static6.anInt4555 >> 2 << 10;
		@Pc(144) int[][] local144 = new int[104][104];
		@Pc(148) int local148 = Static2.anInt1273 >> 1;
		@Pc(152) int[][] local152 = new int[104][104];
		for (@Pc(154) int local154 = 0; local154 < local9; local154++) {
			@Pc(161) byte[][] local161 = Static5.aByteArrayArrayArray18[local154];
			if (!GlRenderer.enabled) {
				@Pc(458) int local458 = (int) Math.sqrt(5100.0D);
				@Pc(464) int local464 = local458 * 768 >> 8;
				for (@Pc(466) int local466 = 1; local466 < 103; local466++) {
					for (@Pc(473) int local473 = 1; local473 < 103; local473++) {
						@Pc(501) int local501 = Terrain.tileHeights[local154][local473][local466 + 1] - Terrain.tileHeights[local154][local473][local466 - 1];
						@Pc(521) int local521 = Terrain.tileHeights[local154][local473 + 1][local466] - Terrain.tileHeights[local154][local473 - 1][local466];
						@Pc(535) int local535 = (int) Math.sqrt((double) (local521 * local521 + local501 * local501 + 65536));
						@Pc(541) int local541 = (local521 << 8) / local535;
						@Pc(545) int local545 = -65536 / local535;
						@Pc(551) int local551 = (local501 << 8) / local535;
						@Pc(567) int local567 = (local545 * -10 + local541 * -50 + local551 * -50) / local464 + 74;
						@Pc(616) int local616 = (local161[local473][local466 - 1] >> 2) + (local161[local473 - 1][local466] >> 2) + (local161[local473 + 1][local466] >> 3) + (local161[local473][local466 + 1] >> 3) + (local161[local473][local466] >> 1);
						local152[local473][local466] = local567 - local616;
					}
				}
			} else if (Preferences.highDetailLighting) {
				for (@Pc(167) int local167 = 1; local167 < 103; local167++) {
					for (@Pc(174) int local174 = 1; local174 < 103; local174++) {
						@Pc(229) int local229 = (local161[local174][local167 - 1] >> 2) + (local161[local174 + 1][local167] >> 3) + (local161[local174 - 1][local167] >> 2) + (local161[local174][local167 + 1] >> 3) + (local161[local174][local167] >> 1);
						local152[local174][local167] = 74 - local229;
					}
				}
			} else {
				@Pc(251) int local251 = (int) Static4.aFloatArray40[0];
				@Pc(256) int local256 = (int) Static4.aFloatArray40[2];
				@Pc(261) int local261 = (int) Static4.aFloatArray40[1];
				@Pc(276) int local276 = (int) Math.sqrt((double) (local256 * local256 + local261 * local261 + local251 * local251));
				@Pc(282) int local282 = local276 * 1024 >> 8;
				for (@Pc(284) int local284 = 1; local284 < 103; local284++) {
					for (@Pc(289) int local289 = 1; local289 < 103; local289++) {
						@Pc(317) int local317 = Terrain.tileHeights[local154][local289][local284 + 1] - Terrain.tileHeights[local154][local289][local284 - 1];
						@Pc(338) int local338 = Terrain.tileHeights[local154][local289 + 1][local284] - Terrain.tileHeights[local154][local289 - 1][local284];
						@Pc(352) int local352 = (int) Math.sqrt((double) (local338 * local338 + local317 * local317 + 65536));
						@Pc(356) int local356 = -65536 / local352;
						@Pc(362) int local362 = (local317 << 8) / local352;
						@Pc(368) int local368 = (local338 << 8) / local352;
						@Pc(385) int local385 = (local256 * local362 + local251 * local368 + local261 * local356) / local282 + 96;
						@Pc(433) int local433 = (local161[local289][local284] >> 1) + (local161[local289][local284 + 1] >> 3) + (local161[local289 + 1][local284] >> 3) + (local161[local289 - 1][local284] >> 2) + (local161[local289][local284 - 1] >> 2);
						local152[local289][local284] = local385 - (int) ((float) local433 * 1.7F);
					}
				}
			}
			for (@Pc(633) int local633 = 0; local633 < 104; local633++) {
				Static6.anIntArray491[local633] = 0;
				Static7.anIntArray650[local633] = 0;
				Static6.anIntArray523[local633] = 0;
				Static2.anIntArray649[local633] = 0;
				Static6.anIntArray549[local633] = 0;
			}
			for (@Pc(663) int local663 = -5; local663 < 104; local663++) {
				for (@Pc(670) int local670 = 0; local670 < 104; local670++) {
					@Pc(679) int local679 = local663 + 5;
					if (local679 < 104) {
						@Pc(694) int local694 = Static2.aByteArrayArrayArray3[local154][local679][local670] & 0xFF;
						if (local694 > 0) {
							@Pc(706) FluType local706 = FluTypeList.get(local694 - 1);
							@Pc(707) int[] local707 = Static6.anIntArray491;
							local707[local670] += local706.anInt4058;
							local707 = Static7.anIntArray650;
							local707[local670] += local706.anInt4064;
							local707 = Static6.anIntArray523;
							local707[local670] += local706.anInt4075;
							local707 = Static2.anIntArray649;
							local707[local670] += local706.anInt4071;
							@Pc(742) int local742 = Static6.anIntArray549[local670]++;
						}
					}
					@Pc(749) int local749 = local663 - 5;
					if (local749 >= 0) {
						@Pc(765) int local765 = Static2.aByteArrayArrayArray3[local154][local749][local670] & 0xFF;
						if (local765 > 0) {
							@Pc(774) FluType local774 = FluTypeList.get(local765 - 1);
							@Pc(775) int[] local775 = Static6.anIntArray491;
							local775[local670] -= local774.anInt4058;
							local775 = Static7.anIntArray650;
							local775[local670] -= local774.anInt4064;
							local775 = Static6.anIntArray523;
							local775[local670] -= local774.anInt4075;
							local775 = Static2.anIntArray649;
							local775[local670] -= local774.anInt4071;
							@Pc(810) int local810 = Static6.anIntArray549[local670]--;
						}
					}
				}
				if (local663 >= 0) {
					@Pc(824) int local824 = 0;
					@Pc(826) int local826 = 0;
					@Pc(828) int local828 = 0;
					@Pc(830) int local830 = 0;
					@Pc(832) int local832 = 0;
					for (@Pc(834) int local834 = -5; local834 < 104; local834++) {
						@Pc(843) int local843 = local834 + 5;
						if (local843 < 104) {
							local828 += Static2.anIntArray649[local843];
							local830 += Static6.anIntArray549[local843];
							local832 += Static7.anIntArray650[local843];
							local824 += Static6.anIntArray491[local843];
							local826 += Static6.anIntArray523[local843];
						}
						@Pc(883) int local883 = local834 - 5;
						if (local883 >= 0) {
							local828 -= Static2.anIntArray649[local883];
							local826 -= Static6.anIntArray523[local883];
							local824 -= Static6.anIntArray491[local883];
							local830 -= Static6.anIntArray549[local883];
							local832 -= Static7.anIntArray650[local883];
						}
						if (local834 >= 0 && local830 > 0) {
							local144[local663][local834] = Static15.method1339(local824 * 256 / local828, local832 / local830, local826 / local830);
						}
					}
				}
			}
			for (@Pc(955) int local955 = 1; local955 < 103; local955++) {
				label770:
				for (@Pc(962) int local962 = 1; local962 < 103; local962++) {
					if (arg2 || Terrain.isAllLevelsVisible() || (Static4.tileFlags[0][local955][local962] & 0x2) != 0 || (Static4.tileFlags[local154][local955][local962] & 0x10) == 0 && Static35.method4327(local962, local154, local955) == Static2.anInt1216) {
						if (Static5.anInt3896 > local154) {
							Static5.anInt3896 = local154;
						}
						@Pc(1019) int local1019 = Static2.aByteArrayArrayArray3[local154][local955][local962] & 0xFF;
						@Pc(1029) int local1029 = Static4.aByteArrayArrayArray15[local154][local955][local962] & 0xFF;
						if (local1019 > 0 || local1029 > 0) {
							@Pc(1047) int local1047 = Terrain.tileHeights[local154][local955][local962];
							@Pc(1057) int local1057 = Terrain.tileHeights[local154][local955 + 1][local962];
							@Pc(1069) int local1069 = Terrain.tileHeights[local154][local955 + 1][local962 + 1];
							@Pc(1079) int local1079 = Terrain.tileHeights[local154][local955][local962 + 1];
							if (local154 > 0) {
								@Pc(1084) boolean local1084 = true;
								if (local1019 == 0 && Static2.aByteArrayArrayArray4[local154][local955][local962] != 0) {
									local1084 = false;
								}
								if (local1029 > 0 && !FloTypeList.get(local1029 - 1).aBoolean274) {
									local1084 = false;
								}
								if (local1084 && local1047 == local1057 && local1069 == local1047 && local1047 == local1079) {
									Static4.anIntArrayArrayArray9[local154][local955][local962] |= 4;
								}
							}
							@Pc(1153) int local1153;
							@Pc(1151) int local1151;
							if (local1019 <= 0) {
								local1151 = -1;
								local1153 = 0;
							} else {
								local1151 = local144[local955][local962];
								@Pc(1168) int local1168 = (local1151 & 0x7F) + local148;
								if (local1168 < 0) {
									local1168 = 0;
								} else if (local1168 > 127) {
									local1168 = 127;
								}
								@Pc(1194) int local1194 = (local1151 + local140 & 0xFC00) + (local1151 & 0x380) + local1168;
								local1153 = ColorUtils.HSL_TO_RGB[Static35.method4367(local1194, 96)];
							}
							@Pc(1209) int local1209 = local152[local955 + 1][local962];
							@Pc(1219) int local1219 = local152[local955 + 1][local962 + 1];
							@Pc(1227) int local1227 = local152[local955][local962 + 1];
							@Pc(1233) int local1233 = local152[local955][local962];
							if (local1029 == 0) {
								Static22.method4698(local154, local955, local962, 0, 0, -1, local1047, local1057, local1069, local1079, Static35.method4367(local1151, local1233), Static35.method4367(local1151, local1209), Static35.method4367(local1151, local1219), Static35.method4367(local1151, local1227), 0, 0, 0, 0, local1153, 0);
								if (GlRenderer.enabled && local154 > 0 && local1151 != -1 && FluTypeList.get(local1019 - 1).aBoolean286) {
									Static14.method1207(0, 0, true, false, local955, local962, local1047 - Terrain.tileHeights[0][local955][local962], local1057 - Terrain.tileHeights[0][local955 + 1][local962], local1069 - Terrain.tileHeights[0][local955 + 1][local962 + 1], local1079 - Terrain.tileHeights[0][local955][local962 + 1]);
								}
								if (GlRenderer.enabled && !arg2 && Terrain.anIntArrayArray10 != null && local154 == 0) {
									for (@Pc(1360) int local1360 = local955 - 1; local1360 <= local955 + 1; local1360++) {
										for (@Pc(1369) int local1369 = local962 - 1; local1369 <= local962 + 1; local1369++) {
											if ((local1360 != local955 || local962 != local1369) && local1360 >= 0 && local1360 < 104 && local1369 >= 0 && local1369 < 104) {
												@Pc(1417) int local1417 = Static4.aByteArrayArrayArray15[local154][local1360][local1369] & 0xFF;
												if (local1417 != 0) {
													@Pc(1428) FloType local1428 = FloTypeList.get(local1417 - 1);
													if (local1428.anInt3877 != -1 && Static32.method3920(Static4.anInterface4_1.method444(local1428.anInt3877))) {
														Terrain.anIntArrayArray10[local955][local962] = (local1428.anInt3871 << 24) + local1428.anInt3874;
														continue label770;
													}
												}
											}
										}
									}
								}
							} else {
								@Pc(1474) int local1474 = Static2.aByteArrayArrayArray4[local154][local955][local962] + 1;
								@Pc(1482) byte local1482 = Static1.aByteArrayArrayArray1[local154][local955][local962];
								@Pc(1488) FloType local1488 = FloTypeList.get(local1029 - 1);
								if (GlRenderer.enabled && !arg2 && Terrain.anIntArrayArray10 != null && local154 == 0) {
									if (local1488.anInt3877 != -1 && Static32.method3920(Static4.anInterface4_1.method444(local1488.anInt3877))) {
										Terrain.anIntArrayArray10[local955][local962] = (local1488.anInt3871 << 24) + local1488.anInt3874;
									} else {
										label751:
										for (@Pc(1516) int local1516 = local955 - 1; local1516 <= local955 + 1; local1516++) {
											for (@Pc(1529) int local1529 = local962 - 1; local1529 <= local962 + 1; local1529++) {
												if ((local1516 != local955 || local1529 != local962) && local1516 >= 0 && local1516 < 104 && local1529 >= 0 && local1529 < 104) {
													@Pc(1580) int local1580 = Static4.aByteArrayArrayArray15[local154][local1516][local1529] & 0xFF;
													if (local1580 != 0) {
														@Pc(1590) FloType local1590 = FloTypeList.get(local1580 - 1);
														if (local1590.anInt3877 != -1 && Static32.method3920(Static4.anInterface4_1.method444(local1590.anInt3877))) {
															Terrain.anIntArrayArray10[local955][local962] = local1590.anInt3874 + (local1590.anInt3871 << 24);
															break label751;
														}
													}
												}
											}
										}
									}
								}
								@Pc(1640) int local1640 = local1488.anInt3877;
								if (local1640 >= 0 && !Static4.anInterface4_1.method441(local1640)) {
									local1640 = -1;
								}
								@Pc(1659) int local1659;
								@Pc(1671) int local1671;
								if (local1640 >= 0) {
									local1659 = -1;
									local1671 = ColorUtils.HSL_TO_RGB[Static22.method2286(Static4.anInterface4_1.method446(local1640), 96)];
								} else if (local1488.anInt3869 == -1) {
									local1671 = 0;
									local1659 = -2;
								} else {
									local1659 = local1488.anInt3869;
									@Pc(1692) int local1692 = (local1659 & 0x7F) + local148;
									if (local1692 < 0) {
										local1692 = 0;
									} else if (local1692 > 127) {
										local1692 = 127;
									}
									@Pc(1716) int local1716 = local1692 + (local1659 + local140 & 0xFC00) + (local1659 & 0x380);
									local1671 = ColorUtils.HSL_TO_RGB[Static22.method2286(local1716, 96)];
								}
								if (local1488.anInt3870 >= 0) {
									@Pc(1730) int local1730 = local1488.anInt3870;
									@Pc(1736) int local1736 = local148 + (local1730 & 0x7F);
									if (local1736 < 0) {
										local1736 = 0;
									} else if (local1736 > 127) {
										local1736 = 127;
									}
									@Pc(1763) int local1763 = (local1730 + local140 & 0xFC00) + (local1730 & 0x380) + local1736;
									local1671 = ColorUtils.HSL_TO_RGB[Static22.method2286(local1763, 96)];
								}
								Static22.method4698(local154, local955, local962, local1474, local1482, local1640, local1047, local1057, local1069, local1079, Static35.method4367(local1151, local1233), Static35.method4367(local1151, local1209), Static35.method4367(local1151, local1219), Static35.method4367(local1151, local1227), Static22.method2286(local1659, local1233), Static22.method2286(local1659, local1209), Static22.method2286(local1659, local1219), Static22.method2286(local1659, local1227), local1153, local1671);
								if (GlRenderer.enabled && local154 > 0) {
									Static14.method1207(local1474, local1482, local1659 == -2 || !local1488.aBoolean273, local1151 == -1 || !FluTypeList.get(local1019 - 1).aBoolean286, local955, local962, local1047 - Terrain.tileHeights[0][local955][local962], local1057 - Terrain.tileHeights[0][local955 + 1][local962], local1069 - Terrain.tileHeights[0][local955 + 1][local962 + 1], local1079 - Terrain.tileHeights[0][local955][local962 + 1]);
								}
							}
						}
					}
				}
			}
			if (GlRenderer.enabled) {
				@Pc(1908) float[][] local1908 = new float[105][105];
				@Pc(1912) float[][] local1912 = new float[105][105];
				@Pc(1916) float[][] local1916 = new float[105][105];
				@Pc(1920) int[][] local1920 = Terrain.tileHeights[local154];
				@Pc(1922) int local1922 = 1;
				while (true) {
					if (local1922 > 103) {
						if (arg2) {
							@Pc(2042) Class4_Sub12[] local2042 = Static22.method2389(arg1, Static4.aByteArrayArrayArray15[local154], local1908, Terrain.anIntArrayArray10, local144, local1912, Static2.aByteArrayArrayArray4[local154], local152, Static1.aByteArrayArrayArray1[local154], local154, local1916, Terrain.surfaceTileHeights[0], Static4.tileFlags, Static2.aByteArrayArrayArray3[local154], Terrain.tileHeights[local154]);
							Static18.method1679(local154, local2042);
							break;
						}
						@Pc(2076) Class4_Sub12[] local2076 = Static22.method2389(arg1, Static4.aByteArrayArrayArray15[local154], local1908, null, local144, local1912, Static2.aByteArrayArrayArray4[local154], local152, Static1.aByteArrayArrayArray1[local154], local154, local1916, null, Static4.tileFlags, Static2.aByteArrayArrayArray3[local154], Terrain.tileHeights[local154]);
						@Pc(2100) Class4_Sub12[] local2100 = Static29.method3149(Static4.tileFlags, Static4.aByteArrayArrayArray15[local154], local152, local1908, local154, Static2.aByteArrayArrayArray4[local154], Static1.aByteArrayArrayArray1[local154], Terrain.tileHeights[local154], Static2.aByteArrayArrayArray3[local154], local1912, local1916);
						@Pc(2107) Class4_Sub12[] local2107 = new Class4_Sub12[local2076.length + local2100.length];
						for (@Pc(2109) int local2109 = 0; local2109 < local2076.length; local2109++) {
							local2107[local2109] = local2076[local2109];
						}
						for (@Pc(2124) int local2124 = 0; local2124 < local2100.length; local2124++) {
							local2107[local2124 + local2076.length] = local2100[local2124];
						}
						Static18.method1679(local154, local2107);
						Static14.method1094(Static1.aByteArrayArrayArray1[local154], Static5.anInt3736, Static5.aClass50Array1, Terrain.tileHeights[local154], Static2.aByteArrayArrayArray3[local154], local1908, Static4.aByteArrayArrayArray15[local154], local1916, local1912, local154, Static2.aByteArrayArrayArray4[local154]);
						break;
					}
					for (@Pc(1927) int local1927 = 1; local1927 <= 103; local1927++) {
						@Pc(1949) int local1949 = local1920[local1927][local1922 + 1] - local1920[local1927][local1922 - 1];
						@Pc(1965) int local1965 = local1920[local1927 + 1][local1922] - local1920[local1927 - 1][local1922];
						@Pc(1978) float local1978 = (float) Math.sqrt((double) (local1965 * local1965 + local1949 * local1949 + 65536));
						local1908[local1927][local1922] = (float) local1965 / local1978;
						local1912[local1927][local1922] = -256.0F / local1978;
						local1916[local1927][local1922] = (float) local1949 / local1978;
					}
					local1922++;
				}
			}
			Static2.aByteArrayArrayArray3[local154] = null;
			Static4.aByteArrayArrayArray15[local154] = null;
			Static2.aByteArrayArrayArray4[local154] = null;
			Static1.aByteArrayArrayArray1[local154] = null;
			Static5.aByteArrayArrayArray18[local154] = null;
		}
		Static13.method1008();
		if (arg2) {
			return;
		}
		for (@Pc(2203) int local2203 = 0; local2203 < 104; local2203++) {
			for (@Pc(2210) int local2210 = 0; local2210 < 104; local2210++) {
				if ((Static4.tileFlags[1][local2203][local2210] & 0x2) == 2) {
					Static28.method3253(local2203, local2210);
				}
			}
		}
		for (@Pc(2237) int local2237 = 0; local2237 < 4; local2237++) {
			for (@Pc(2242) int local2242 = 0; local2242 <= 104; local2242++) {
				for (@Pc(2247) int local2247 = 0; local2247 <= 104; local2247++) {
					if ((Static4.anIntArrayArrayArray9[local2237][local2247][local2242] & 0x1) != 0) {
						@Pc(2263) int local2263 = local2242;
						@Pc(2265) int local2265 = local2237;
						@Pc(2267) int local2267 = local2242;
						while (local2263 < 104 && (Static4.anIntArrayArrayArray9[local2237][local2247][local2263 + 1] & 0x1) != 0) {
							local2263++;
						}
						while (local2267 > 0 && (Static4.anIntArrayArrayArray9[local2237][local2247][local2267 - 1] & 0x1) != 0) {
							local2267--;
						}
						label453:
						while (local2265 > 0) {
							for (@Pc(2316) int local2316 = local2267; local2316 <= local2263; local2316++) {
								if ((Static4.anIntArrayArrayArray9[local2265 - 1][local2247][local2316] & 0x1) == 0) {
									break label453;
								}
							}
							local2265--;
						}
						@Pc(2345) int local2345;
						label441:
						for (local2345 = local2237; local2345 < 3; local2345++) {
							for (@Pc(2350) int local2350 = local2267; local2350 <= local2263; local2350++) {
								if ((Static4.anIntArrayArrayArray9[local2345 + 1][local2247][local2350] & 0x1) == 0) {
									break label441;
								}
							}
						}
						@Pc(2385) int local2385 = (local2263 + 1 - local2267) * (local2345 + 1 - local2265);
						if (local2385 >= 8) {
							@Pc(2403) int local2403 = Terrain.tileHeights[local2345][local2247][local2267] - 240;
							@Pc(2411) int local2411 = Terrain.tileHeights[local2265][local2247][local2267];
							Static21.method3284(1, local2247 * 128, local2247 * 128, local2267 * 128, local2263 * 128 + 128, local2403, local2411);
							for (@Pc(2431) int local2431 = local2265; local2431 <= local2345; local2431++) {
								for (@Pc(2436) int local2436 = local2267; local2436 <= local2263; local2436++) {
									Static4.anIntArrayArrayArray9[local2431][local2247][local2436] &= -2;
								}
							}
						}
					}
					if ((Static4.anIntArrayArrayArray9[local2237][local2247][local2242] & 0x2) != 0) {
						@Pc(2477) int local2477;
						for (local2477 = local2247; local2477 > 0 && (Static4.anIntArrayArrayArray9[local2237][local2477 - 1][local2242] & 0x2) != 0; local2477--) {
						}
						@Pc(2502) int local2502;
						for (local2502 = local2247; local2502 < 104 && (Static4.anIntArrayArrayArray9[local2237][local2502 + 1][local2242] & 0x2) != 0; local2502++) {
						}
						@Pc(2522) int local2522 = local2237;
						@Pc(2524) int local2524 = local2237;
						label506:
						while (local2522 > 0) {
							for (@Pc(2528) int local2528 = local2477; local2528 <= local2502; local2528++) {
								if ((Static4.anIntArrayArrayArray9[local2522 - 1][local2528][local2242] & 0x2) == 0) {
									break label506;
								}
							}
							local2522--;
						}
						label495:
						while (local2524 < 3) {
							for (@Pc(2563) int local2563 = local2477; local2563 <= local2502; local2563++) {
								if ((Static4.anIntArrayArrayArray9[local2524 + 1][local2563][local2242] & 0x2) == 0) {
									break label495;
								}
							}
							local2524++;
						}
						@Pc(2605) int local2605 = (local2524 + 1 - local2522) * (local2502 + 1 - local2477);
						if (local2605 >= 8) {
							@Pc(2623) int local2623 = Terrain.tileHeights[local2524][local2477][local2242] - 240;
							@Pc(2631) int local2631 = Terrain.tileHeights[local2522][local2477][local2242];
							Static21.method3284(2, local2477 * 128, local2502 * 128 + 128, local2242 * 128, local2242 * 128, local2623, local2631);
							for (@Pc(2651) int local2651 = local2522; local2651 <= local2524; local2651++) {
								for (@Pc(2660) int local2660 = local2477; local2660 <= local2502; local2660++) {
									Static4.anIntArrayArrayArray9[local2651][local2660][local2242] &= -3;
								}
							}
						}
					}
					if ((Static4.anIntArrayArrayArray9[local2237][local2247][local2242] & 0x4) != 0) {
						@Pc(2705) int local2705 = local2247;
						@Pc(2707) int local2707 = local2247;
						@Pc(2709) int local2709;
						for (local2709 = local2242; local2709 > 0 && (Static4.anIntArrayArrayArray9[local2237][local2247][local2709 - 1] & 0x4) != 0; local2709--) {
						}
						@Pc(2731) int local2731;
						for (local2731 = local2242; local2731 < 104 && (Static4.anIntArrayArrayArray9[local2237][local2247][local2731 + 1] & 0x4) != 0; local2731++) {
						}
						label561:
						while (local2705 > 0) {
							for (@Pc(2758) int local2758 = local2709; local2758 <= local2731; local2758++) {
								if ((Static4.anIntArrayArrayArray9[local2237][local2705 - 1][local2758] & 0x4) == 0) {
									break label561;
								}
							}
							local2705--;
						}
						label550:
						while (local2707 < 104) {
							for (@Pc(2785) int local2785 = local2709; local2785 <= local2731; local2785++) {
								if ((Static4.anIntArrayArrayArray9[local2237][local2707 + 1][local2785] & 0x4) == 0) {
									break label550;
								}
							}
							local2707++;
						}
						if ((local2731 + 1 - local2709) * (local2707 + 1 - local2705) >= 4) {
							@Pc(2836) int local2836 = Terrain.tileHeights[local2237][local2705][local2709];
							Static21.method3284(4, local2705 * 128, local2707 * 128 + 128, local2709 * 128, local2731 * 128 + 128, local2836, local2836);
							for (@Pc(2858) int local2858 = local2705; local2858 <= local2707; local2858++) {
								for (@Pc(2863) int local2863 = local2709; local2863 <= local2731; local2863++) {
									Static4.anIntArrayArrayArray9[local2237][local2858][local2863] &= -5;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ma;ILclient!wf;BIII)V")
	public static void method3780(@OriginalArg(0) IndexedSprite arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) int local13 = Static6.anInt3585 + (int) Static5.aFloat97 & 0x7FF;
		@Pc(25) int local25 = Math.max(arg2.anInt5893 / 2, arg2.anInt5949 / 2) + 10;
		@Pc(38) int local38 = arg4 * arg4 + arg3 * arg3;
		if (local25 * local25 < local38) {
			return;
		}
		@Pc(48) int local48 = MathUtils.SINE[local13];
		local48 = local48 * 256 / (Static6.anInt4761 + 256);
		@Pc(60) int local60 = MathUtils.COSINE[local13];
		local60 = local60 * 256 / (Static6.anInt4761 + 256);
		@Pc(78) int local78 = local60 * arg3 + arg4 * local48 >> 16;
		@Pc(89) int local89 = arg4 * local60 - arg3 * local48 >> 16;
		if (GlRenderer.enabled) {
			((GlIndexedSprite) arg0).method2820(local78 + arg2.anInt5893 / 2 + arg1 - arg0.anInt3412 / 2, arg2.anInt5949 / 2 + arg5 - local89 - arg0.anInt3410 / 2, (GlSprite) arg2.method4729(false));
		} else {
			((SoftwareIndexedSprite) arg0).method1321(local78 + arg1 + arg2.anInt5893 / 2 - arg0.anInt3412 / 2, arg5 + arg2.anInt5949 / 2 - local89 - arg0.anInt3410 / 2, arg2.anIntArray672, arg2.anIntArray657);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIBII)V")
	public static void method3781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = Static8.method9(Static4.anInt3086, arg4, Static5.anInt4230);
		@Pc(23) int local23 = Static8.method9(Static4.anInt3086, arg5, Static5.anInt4230);
		@Pc(29) int local29 = Static8.method9(Static2.anInt902, arg3, Static3.anInt2553);
		@Pc(35) int local35 = Static8.method9(Static2.anInt902, arg0, Static3.anInt2553);
		@Pc(43) int local43 = Static8.method9(Static4.anInt3086, arg2 + arg4, Static5.anInt4230);
		@Pc(52) int local52 = Static8.method9(Static4.anInt3086, arg5 - arg2, Static5.anInt4230);
		for (@Pc(54) int local54 = local17; local54 < local43; local54++) {
			Static18.method1656(Static5.anIntArrayArray36[local54], arg1, local29, local35);
		}
		for (@Pc(70) int local70 = local23; local70 > local52; local70--) {
			Static18.method1656(Static5.anIntArrayArray36[local70], arg1, local29, local35);
		}
		@Pc(97) int local97 = Static8.method9(Static2.anInt902, arg3 + arg2, Static3.anInt2553);
		@Pc(106) int local106 = Static8.method9(Static2.anInt902, arg0 - arg2, Static3.anInt2553);
		for (@Pc(108) int local108 = local43; local108 <= local52; local108++) {
			@Pc(119) int[] local119 = Static5.anIntArrayArray36[local108];
			Static18.method1656(local119, arg1, local29, local97);
			Static18.method1656(local119, arg1, local106, local35);
		}
	}

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "(B)V")
	public static void method3783() {
		@Pc(9) int local9 = Static5.aClass4_Sub3_Sub5_3.method2252(LocalisedText.CHOOSE_OPTION);
		for (@Pc(11) int local11 = 0; local11 < Static7.anInt5634; local11++) {
			@Pc(20) int local20 = Static5.aClass4_Sub3_Sub5_3.method2252(Static26.method2992(local11));
			if (local20 > local9) {
				local9 = local20;
			}
		}
		@Pc(42) int local42 = Static7.anInt5634 * 15 + 21;
		@Pc(44) int local44 = Static5.anInt5848;
		@Pc(45) int local45 = local9 + 8;
		if (local42 + local44 > GameShell.canvasHeight) {
			local44 = GameShell.canvasHeight - local42;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		@Pc(68) int local68 = Static4.anInt3341 - local45 / 2;
		if (local68 + local45 > GameShell.canvasWidth) {
			local68 = GameShell.canvasWidth - local45;
		}
		if (local68 < 0) {
			local68 = 0;
		}
		if (Static2.anInt1940 == 1) {
			if (Static4.anInt3341 == Static4.anInt2663 && Static5.anInt5848 == Static1.anInt891) {
				Static2.anInt1940 = 0;
				Static4.anInt3455 = local44;
				Static3.anInt2394 = (Static7.aBoolean389 ? 26 : 22) + Static7.anInt5634 * 15;
				Static1.aBoolean17 = true;
				Static6.anInt4440 = local45;
				Static5.anInt3890 = local68;
			}
		} else if (Mouse.clickX == Static4.anInt3341 && Mouse.clickY == Static5.anInt5848) {
			Static3.anInt2394 = (Static7.aBoolean389 ? 26 : 22) + Static7.anInt5634 * 15;
			Static5.anInt3890 = local68;
			Static6.anInt4440 = local45;
			Static2.anInt1940 = 0;
			Static1.aBoolean17 = true;
			Static4.anInt3455 = local44;
		} else {
			Static4.anInt2663 = Mouse.clickX;
			Static1.anInt891 = Mouse.clickY;
			Static2.anInt1940 = 1;
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V")
	public static void method3150() {
		Static5.aClass4_Sub3_Sub14_4 = null;
		Static4.anInt3020 = -1;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([JBII[Ljava/lang/Object;)V")
	public static void method3152(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(22) int local22 = (arg1 + arg2) / 2;
		@Pc(24) int local24 = arg2;
		@Pc(28) long local28 = arg0[local22];
		arg0[local22] = arg0[arg1];
		arg0[arg1] = local28;
		@Pc(42) Object local42 = arg3[local22];
		arg3[local22] = arg3[arg1];
		arg3[arg1] = local42;
		for (@Pc(54) int local54 = arg2; local54 < arg1; local54++) {
			if (arg0[local54] < (long) (local54 & 0x1) + local28) {
				@Pc(77) long local77 = arg0[local54];
				arg0[local54] = arg0[local24];
				arg0[local24] = local77;
				@Pc(91) Object local91 = arg3[local54];
				arg3[local54] = arg3[local24];
				arg3[local24++] = local91;
			}
		}
		arg0[arg1] = arg0[local24];
		arg0[local24] = local28;
		arg3[arg1] = arg3[local24];
		arg3[local24] = local42;
		method3152(arg0, local24 - 1, arg2, arg3);
		method3152(arg0, arg1, local24 + 1, arg3);
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V")
	public static void method3153() {
		Static2.anImage2 = null;
		Static1.aFont1 = null;
		Static1.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method3154(@OriginalArg(1) Js5 arg0) {
		Static6.anInt4677 = arg0.getGroupId("titlebg");
		Static1.anInt322 = arg0.getGroupId("logo");
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!qf;IIIIIIIZ)V")
	public static void method3155(@OriginalArg(0) Class142 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static7.anInt5281;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static6.anInt4400;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Terrain.tileHeights[arg1][arg6][arg7] - Static6.anInt4375;
		@Pc(49) int local49 = Terrain.tileHeights[arg1][arg6 + 1][arg7] - Static6.anInt4375;
		@Pc(63) int local63 = Terrain.tileHeights[arg1][arg6 + 1][arg7 + 1] - Static6.anInt4375;
		@Pc(75) int local75 = Terrain.tileHeights[arg1][arg6][arg7 + 1] - Static6.anInt4375;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		local15 = local15 * arg5 - local7 * arg4 >> 16;
		local7 = local85;
		local85 = local37 * arg3 - local15 * arg2 >> 16;
		local15 = local37 * arg2 + local15 * arg3 >> 16;
		local37 = local85;
		if (local15 < 50) {
			return;
		}
		@Pc(133) int local133 = local14 * arg4 + local21 * arg5 >> 16;
		local14 = local14 * arg5 - local21 * arg4 >> 16;
		@Pc(145) int local145 = local133;
		local133 = local49 * arg3 - local14 * arg2 >> 16;
		local14 = local49 * arg2 + local14 * arg3 >> 16;
		@Pc(167) int local167 = local133;
		if (local14 < 50) {
			return;
		}
		@Pc(181) int local181 = local27 * arg4 + local20 * arg5 >> 16;
		@Pc(191) int local191 = local27 * arg5 - local20 * arg4 >> 16;
		local20 = local181;
		local181 = local63 * arg3 - local191 * arg2 >> 16;
		local191 = local63 * arg2 + local191 * arg3 >> 16;
		@Pc(215) int local215 = local181;
		if (local191 < 50) {
			return;
		}
		@Pc(229) int local229 = local26 * arg4 + local6 * arg5 >> 16;
		local26 = local26 * arg5 - local6 * arg4 >> 16;
		local6 = local229;
		local229 = local75 * arg3 - local26 * arg2 >> 16;
		local26 = local75 * arg2 + local26 * arg3 >> 16;
		if (local26 < 50) {
			return;
		}
		@Pc(275) int local275 = Static4.anInt3125 + (local7 << 9) / local15;
		@Pc(283) int local283 = Static4.anInt3126 + (local37 << 9) / local15;
		@Pc(291) int local291 = Static4.anInt3125 + (local145 << 9) / local14;
		@Pc(299) int local299 = Static4.anInt3126 + (local167 << 9) / local14;
		@Pc(307) int local307 = Static4.anInt3125 + (local20 << 9) / local191;
		@Pc(315) int local315 = Static4.anInt3126 + (local215 << 9) / local191;
		@Pc(323) int local323 = Static4.anInt3125 + (local6 << 9) / local26;
		@Pc(331) int local331 = Static4.anInt3126 + (local229 << 9) / local26;
		Static4.anInt3127 = 0;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static2.aBoolean101 && Static15.method1223(Static1.anInt315 + Static4.anInt3125, Static7.anInt5803 + Static4.anInt3126, local315, local331, local299, local307, local323, local291)) {
				Static1.anInt528 = arg6;
				Static1.anInt420 = arg7;
			}
			if (!GlRenderer.enabled && !arg8) {
				Static4.aBoolean217 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static4.anInt3129 || local323 > Static4.anInt3129 || local291 > Static4.anInt3129) {
					Static4.aBoolean217 = true;
				}
				if (arg0.anInt4297 == -1) {
					if (arg0.anInt4299 != 12345678) {
						Static23.method2543(local315, local331, local299, local307, local323, local291, arg0.anInt4299, arg0.anInt4301, arg0.anInt4296);
					}
				} else if (!Preferences.groundTextures) {
					@Pc(475) int local475 = Static4.anInterface4_1.method446(arg0.anInt4297);
					Static23.method2543(local315, local331, local299, local307, local323, local291, Static10.method302(local475, arg0.anInt4299), Static10.method302(local475, arg0.anInt4301), Static10.method302(local475, arg0.anInt4296));
				} else if (arg0.aBoolean302) {
					Static23.method2558(local315, local331, local299, local307, local323, local291, arg0.anInt4299, arg0.anInt4301, arg0.anInt4296, local7, local145, local6, local37, local167, local229, local15, local14, local26, arg0.anInt4297);
				} else {
					Static23.method2558(local315, local331, local299, local307, local323, local291, arg0.anInt4299, arg0.anInt4301, arg0.anInt4296, local20, local6, local145, local215, local229, local167, local191, local26, local14, arg0.anInt4297);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static2.aBoolean101 && Static15.method1223(Static1.anInt315 + Static4.anInt3125, Static7.anInt5803 + Static4.anInt3126, local283, local299, local331, local275, local291, local323)) {
			Static1.anInt528 = arg6;
			Static1.anInt420 = arg7;
		}
		if (GlRenderer.enabled || arg8) {
			return;
		}
		Static4.aBoolean217 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static4.anInt3129 || local291 > Static4.anInt3129 || local323 > Static4.anInt3129) {
			Static4.aBoolean217 = true;
		}
		if (arg0.anInt4297 == -1) {
			if (arg0.anInt4298 != 12345678) {
				Static23.method2543(local283, local299, local331, local275, local291, local323, arg0.anInt4298, arg0.anInt4296, arg0.anInt4301);
			}
		} else if (Preferences.groundTextures) {
			Static23.method2558(local283, local299, local331, local275, local291, local323, arg0.anInt4298, arg0.anInt4296, arg0.anInt4301, local7, local145, local6, local37, local167, local229, local15, local14, local26, arg0.anInt4297);
		} else {
			@Pc(608) int local608 = Static4.anInterface4_1.method446(arg0.anInt4297);
			Static23.method2543(local283, local299, local331, local275, local291, local323, Static10.method302(local608, arg0.anInt4298), Static10.method302(local608, arg0.anInt4296), Static10.method302(local608, arg0.anInt4301));
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method3797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static2.anInt1871++;
		Static5.anInt3486 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		for (@Pc(23) int y = Terrain.firstVisibleLevel; y < Terrain.levels; y++) {
			@Pc(30) Tile[][] tiles = Terrain.tiles[y];
			for (@Pc(32) int x = Static6.anInt4978; x < Static2.anInt5778; x++) {
				for (@Pc(37) int z = Static1.anInt890; z < Static2.anInt1344; z++) {
					@Pc(46) Tile tile = tiles[x][z];
					if (tile != null) {
						if (Terrain.aBooleanArrayArray5[x + Terrain.anInt3253 - Static6.anInt4513][z + Terrain.anInt3253 - Static4.anInt3329] && (arg3 == null || y < arg4 || arg3[y][x][z] != arg5)) {
							tile.aBoolean257 = true;
							tile.aBoolean255 = true;
							if (tile.sceneryLen > 0) {
								tile.aBoolean256 = true;
							} else {
								tile.aBoolean256 = false;
							}
							Static5.anInt3486++;
						} else {
							tile.aBoolean257 = false;
							tile.aBoolean255 = false;
							tile.anInt3549 = 0;
							if (x >= local9 && x <= local13 && z >= local17 && z <= local21) {
								if (tile.wall != null) {
									@Pc(103) Wall wall = tile.wall;
									wall.aClass53_5.method3806(0, y, wall.anInt5494, wall.x, wall.z);
									if (wall.aClass53_4 != null) {
										wall.aClass53_4.method3806(0, y, wall.anInt5494, wall.x, wall.z);
									}
								}
								if (tile.wallDecor != null) {
									@Pc(134) WallDecor wallDecor = tile.wallDecor;
									wallDecor.aClass53_10.method3806(wallDecor.anInt5631, y, wallDecor.anInt5627, wallDecor.x, wallDecor.z);
									if (wallDecor.aClass53_9 != null) {
										wallDecor.aClass53_9.method3806(wallDecor.anInt5631, y, wallDecor.anInt5627, wallDecor.x, wallDecor.z);
									}
								}
								if (tile.groundDecor != null) {
									@Pc(167) GroundDecor groundDecor = tile.groundDecor;
									groundDecor.aClass53_2.method3806(0, y, groundDecor.anInt1130, groundDecor.x, groundDecor.z);
								}
								if (tile.scenery != null) {
									for (@Pc(183) int i = 0; i < tile.sceneryLen; i++) {
										@Pc(192) Scenery scenery = tile.scenery[i];
										scenery.aClass53_1.method3806(scenery.anInt814, y, scenery.anInt823, scenery.anInt821, scenery.anInt827);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Terrain.tileHeights == Terrain.underwaterTileHeights;
		if (GlRenderer.enabled) {
			@Pc(244) GL local244 = GlRenderer.gl;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static30.method3596();
				Static24.method2652(3, -1);
				Static3.aBoolean175 = true;
				Static10.method316();
				Static5.anInt3636 = -1;
				Static6.anInt5120 = -1;
				for (@Pc(273) int local273 = 0; local273 < Terrain.aClass4_Sub12ArrayArray2[0].length; local273++) {
					@Pc(285) Class4_Sub12 local285 = Terrain.aClass4_Sub12ArrayArray2[0][local273];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean162 ? 1.0F : 0.5F);
					if (local285.anInt2351 != Static5.anInt3636) {
						Static5.anInt3636 = local285.anInt2351;
						Static18.method4372(local285.anInt2351);
						Static25.method2772(Static12.method723());
					}
					local285.method1867(Terrain.tiles, local294, false);
				}
				Static10.method314();
			} else {
				@Pc(319) int local319 = Terrain.firstVisibleLevel;
				while (true) {
					if (local319 >= Terrain.levels) {
						Static27.method3116(Static6.anInt4513, Static4.anInt3329, Terrain.tiles);
						break;
					}
					for (@Pc(324) int local324 = 0; local324 < Terrain.aClass4_Sub12ArrayArray2[local319].length; local324++) {
						@Pc(336) Class4_Sub12 local336 = Terrain.aClass4_Sub12ArrayArray2[local319][local324];
						@Pc(350) float local350 = 201.5F - (float) local319 * 50.0F - (local336.aBoolean162 ? 1.0F : 0.5F);
						if (local336.anInt2356 != -1 && Static32.method3920(Static4.anInterface4_1.method444(local336.anInt2356)) && Preferences.highDetailWater) {
							Static18.method4372(local336.anInt2351);
						}
						local336.method1867(Terrain.tiles, local350, false);
					}
					if (local319 == 0 && Preferences.sceneryShadows > 0) {
						GlRenderer.method1613(101.5F);
						Static14.method1215(Static6.anInt4513, Static4.anInt3329, Terrain.anInt3253, arg1, Terrain.aBooleanArrayArray5, Terrain.tileHeights[0]);
					}
					local319++;
				}
			}
			local244.glPopMatrix();
		}
		for (@Pc(400) int y = Terrain.firstVisibleLevel; y < Terrain.levels; y++) {
			@Pc(407) Tile[][] tiles = Terrain.tiles[y];
			for (@Pc(410) int local410 = -Terrain.anInt3253; local410 <= 0; local410++) {
				@Pc(416) int local416 = Static6.anInt4513 + local410;
				@Pc(420) int local420 = Static6.anInt4513 - local410;
				if (local416 >= Static6.anInt4978 || local420 < Static2.anInt5778) {
					for (@Pc(429) int local429 = -Terrain.anInt3253; local429 <= 0; local429++) {
						@Pc(435) int local435 = Static4.anInt3329 + local429;
						@Pc(439) int local439 = Static4.anInt3329 - local429;
						if (local416 >= Static6.anInt4978) {
							if (local435 >= Static1.anInt890) {
								@Pc(451) Tile tile = tiles[local416][local435];
								if (tile != null && tile.aBoolean257) {
									Static29.method3493(tile, true);
								}
							}
							if (local439 < Static2.anInt1344) {
								@Pc(468) Tile tile = tiles[local416][local439];
								if (tile != null && tile.aBoolean257) {
									Static29.method3493(tile, true);
								}
							}
						}
						if (local420 < Static2.anInt5778) {
							if (local435 >= Static1.anInt890) {
								@Pc(488) Tile tile = tiles[local420][local435];
								if (tile != null && tile.aBoolean257) {
									Static29.method3493(tile, true);
								}
							}
							if (local439 < Static2.anInt1344) {
								@Pc(505) Tile tile = tiles[local420][local439];
								if (tile != null && tile.aBoolean257) {
									Static29.method3493(tile, true);
								}
							}
						}
						if (Static5.anInt3486 == 0) {
							if (!local240) {
								Static2.aBoolean101 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (@Pc(528) int y = Terrain.firstVisibleLevel; y < Terrain.levels; y++) {
			@Pc(535) Tile[][] tiles = Terrain.tiles[y];
			for (@Pc(538) int local538 = -Terrain.anInt3253; local538 <= 0; local538++) {
				@Pc(544) int local544 = Static6.anInt4513 + local538;
				@Pc(548) int local548 = Static6.anInt4513 - local538;
				if (local544 >= Static6.anInt4978 || local548 < Static2.anInt5778) {
					for (@Pc(557) int local557 = -Terrain.anInt3253; local557 <= 0; local557++) {
						@Pc(563) int local563 = Static4.anInt3329 + local557;
						@Pc(567) int local567 = Static4.anInt3329 - local557;
						if (local544 >= Static6.anInt4978) {
							if (local563 >= Static1.anInt890) {
								@Pc(579) Tile tile = tiles[local544][local563];
								if (tile != null && tile.aBoolean257) {
									Static29.method3493(tile, false);
								}
							}
							if (local567 < Static2.anInt1344) {
								@Pc(596) Tile tile = tiles[local544][local567];
								if (tile != null && tile.aBoolean257) {
									Static29.method3493(tile, false);
								}
							}
						}
						if (local548 < Static2.anInt5778) {
							if (local563 >= Static1.anInt890) {
								@Pc(616) Tile tile = tiles[local548][local563];
								if (tile != null && tile.aBoolean257) {
									Static29.method3493(tile, false);
								}
							}
							if (local567 < Static2.anInt1344) {
								@Pc(633) Tile tile = tiles[local548][local567];
								if (tile != null && tile.aBoolean257) {
									Static29.method3493(tile, false);
								}
							}
						}
						if (Static5.anInt3486 == 0) {
							if (!local240) {
								Static2.aBoolean101 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static2.aBoolean101 = false;
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(B)V")
	public static void method3798() {
		FloTypeList.clean();
		FluTypeList.clean();
		IdkTypeList.clean();
		LocTypeList.clean();
		NpcTypeList.clean();
		ObjTypeList.clean();
		SeqTypeList.clean();
		SpotAnimTypeList.clean();
		VarbitTypeList.clean();
		VarpTypeList.clean();
		BasTypeList.clean();
		MsiTypeList.clean();
		MelTypeList.clean();
		SkyBoxTypeList.clean();
		SkyBoxSphereTypeList.clean();
		LightTypeList.clean();
		CursorTypeList.clean();
		Static32.method3951();
		Static20.method1942();
		Static32.method4030();
		Static27.method3219();
		Static1.aClass26_5.clean(5);
		Static1.aClass26_3.clean(5);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIB)I")
	public static int method3802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg1 &= 3;
		if (arg1 == 0) {
			return arg0;
		} else if (arg1 == 1) {
			return arg2;
		} else if (arg1 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZB)V")
	public static void method3803(@OriginalArg(0) boolean arg0) {
		Static6.anIntArray549 = new int[104];
		Static5.anInt3896 = 99;
		@Pc(13) byte local13;
		if (arg0) {
			local13 = 1;
		} else {
			local13 = 4;
		}
		Static2.anIntArray649 = new int[104];
		Static4.aByteArrayArrayArray15 = new byte[local13][104][104];
		Static1.aByteArrayArrayArray1 = new byte[local13][104][104];
		Static6.anIntArray491 = new int[104];
		Static5.aByteArrayArrayArray18 = new byte[local13][105][105];
		Static6.anIntArray523 = new int[104];
		Static2.aByteArrayArrayArray3 = new byte[local13][104][104];
		Static4.anIntArrayArrayArray9 = new int[local13][105][105];
		Static2.aByteArrayArrayArray4 = new byte[local13][104][104];
		Static7.anIntArray650 = new int[104];
		Static6.anIntArray465 = new int[5];
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[FIFFF)V")
	public static void method3856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11) {
		arg0 -= arg3;
		arg1 -= arg4;
		arg2 -= arg5;
		@Pc(32) float local32 = (float) arg0 * arg7[0] + (float) arg1 * arg7[1] + (float) arg2 * arg7[2];
		@Pc(53) float local53 = (float) arg0 * arg7[3] + (float) arg1 * arg7[4] + (float) arg2 * arg7[5];
		@Pc(74) float local74 = (float) arg0 * arg7[6] + (float) arg1 * arg7[7] + (float) arg2 * arg7[8];
		@Pc(82) float local82;
		@Pc(89) float local89;
		if (arg6 == 0) {
			local82 = local32 + arg9 + 0.5F;
			local89 = arg11 + 0.5F - local74;
		} else if (arg6 == 1) {
			local82 = local32 + arg9 + 0.5F;
			local89 = local74 + arg11 + 0.5F;
		} else if (arg6 == 2) {
			local82 = arg9 + 0.5F - local32;
			local89 = arg10 + 0.5F - local53;
		} else if (arg6 == 3) {
			local82 = local32 + arg9 + 0.5F;
			local89 = arg10 + 0.5F - local53;
		} else if (arg6 == 4) {
			local82 = local74 + arg11 + 0.5F;
			local89 = arg10 + 0.5F - local53;
		} else {
			local82 = arg11 + 0.5F - local74;
			local89 = arg10 + 0.5F - local53;
		}
		if (arg8 == 1) {
			@Pc(177) float local177 = local82;
			local82 = -local89;
			local89 = local177;
		} else if (arg8 == 2) {
			local82 = -local82;
			local89 = -local89;
		} else if (arg8 == 3) {
			@Pc(198) float local198 = local82;
			local82 = local89;
			local89 = -local198;
		}
		Static6.aFloat119 = local82;
		Static6.aFloat116 = local89;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([SI)[S")
	public static short[] method3860(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		ArrayUtils.copy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ISIB)I")
	public static int method3863(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = ColorUtils.HSL_TO_RGB[Static25.method2912(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(15) int local15 = Static4.anInterface4_1.method450(arg1 & 0xFFFF);
			if (local15 != 0) {
				@Pc(21) int local21;
				if (arg2 < 0) {
					local21 = 0;
				} else if (arg2 > 127) {
					local21 = 16777215;
				} else {
					local21 = arg2 * 131586;
				}
				if (local15 == 256) {
					local5 = local21;
				} else {
					@Pc(44) int local44 = 256 - local15;
					local5 = ((local21 & 0xFF00FF) * local15 + (local5 & 0xFF00FF) * local44 & 0xFF00FF00) + ((local21 & 0xFF00) * local15 + (local5 & 0xFF00) * local44 & 0xFF0000) >> 8;
				}
			}
			@Pc(81) int local81 = Static4.anInterface4_1.method447(arg1 & 0xFFFF);
			if (local81 != 0) {
				@Pc(84) int local84 = local81 + 256;
				@Pc(92) int local92 = (local5 >> 16 & 0xFF) * local84;
				if (local92 > 65535) {
					local92 = 65535;
				}
				@Pc(105) int local105 = (local5 >> 8 & 0xFF) * local84;
				if (local105 > 65535) {
					local105 = 65535;
				}
				@Pc(116) int local116 = (local5 & 0xFF) * local84;
				if (local116 > 65535) {
					local116 = 65535;
				}
				local5 = ((local92 & 0xFF00) << 8) + (local105 & 0xFF00) + (local116 >> 8);
			}
		}
		return (local5 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIFFF)[F")
	public static float[] method3864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(4) float local4 = 1.0F;
		@Pc(6) float local6 = 0.0F;
		@Pc(11) float local11 = (float) arg1 / 32767.0F;
		@Pc(21) float local21 = -((float) Math.sqrt((double) (1.0F - local11 * local11)));
		@Pc(25) float local25 = 1.0F - local11;
		@Pc(36) float local36 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (local36 != 0.0F) {
			local4 = (float) -arg2 / local36;
			local6 = (float) arg0 / local36;
		}
		local2[0] = local11 + local4 * local4 * local25;
		local2[1] = local6 * local21;
		local2[2] = local6 * local4 * local25;
		local2[3] = -local6 * local21;
		local2[4] = local11;
		local2[5] = local4 * local21;
		local2[6] = local4 * local6 * local25;
		local2[7] = -local4 * local21;
		local2[8] = local11 + local6 * local6 * local25;
		@Pc(120) float[] local120 = new float[9];
		@Pc(128) float local128 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(136) float local136 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local120[0] = local128;
		local120[1] = 0.0F;
		local120[2] = local136;
		local120[3] = 0.0F;
		local120[4] = 1.0F;
		local120[5] = 0.0F;
		local120[6] = -local136;
		local120[7] = 0.0F;
		local120[8] = local128;
		@Pc(180) float[] local180 = new float[] { local120[0] * local2[0] + local120[1] * local2[3] + local120[2] * local2[6], local120[0] * local2[1] + local120[1] * local2[4] + local120[2] * local2[7], local120[0] * local2[2] + local120[1] * local2[5] + local120[2] * local2[8], local120[3] * local2[0] + local120[4] * local2[3] + local120[5] * local2[6], local120[3] * local2[1] + local120[4] * local2[4] + local120[5] * local2[7], local120[3] * local2[2] + local120[4] * local2[5] + local120[5] * local2[8], local120[6] * local2[0] + local120[7] * local2[3] + local120[8] * local2[6], local120[6] * local2[1] + local120[7] * local2[4] + local120[8] * local2[7], local120[6] * local2[2] + local120[7] * local2[5] + local120[8] * local2[8] };
		local180[0] *= arg4;
		local180[1] *= arg4;
		local180[2] *= arg4;
		local180[3] *= arg5;
		local180[4] *= arg5;
		local180[5] *= arg5;
		local180[6] *= arg6;
		local180[7] *= arg6;
		local180[8] *= arg6;
		return local180;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII[FFIF)V")
	public static void method3871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9) {
		arg0 -= arg3;
		arg1 -= arg4;
		arg2 -= arg5;
		@Pc(32) float local32 = (float) arg0 * arg6[0] + (float) arg1 * arg6[1] + (float) arg2 * arg6[2];
		@Pc(53) float local53 = (float) arg0 * arg6[3] + (float) arg1 * arg6[4] + (float) arg2 * arg6[5];
		@Pc(74) float local74 = (float) arg0 * arg6[6] + (float) arg1 * arg6[7] + (float) arg2 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local85 *= arg7;
		}
		@Pc(99) float local99 = local53 + arg9 + 0.5F;
		if (arg8 == 1) {
			@Pc(104) float local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg8 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg8 == 3) {
			@Pc(125) float local125 = local85;
			local85 = local99;
			local99 = -local125;
		}
		Static6.aFloat115 = local85;
		Static6.aFloat118 = local99;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII[FIF)V")
	public static void method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8) {
		arg0 -= arg3;
		arg1 -= arg4;
		arg2 -= arg5;
		@Pc(32) float local32 = (float) arg0 * arg6[0] + (float) arg1 * arg6[1] + (float) arg2 * arg6[2];
		@Pc(53) float local53 = (float) arg0 * arg6[3] + (float) arg1 * arg6[4] + (float) arg2 * arg6[5];
		@Pc(74) float local74 = (float) arg0 * arg6[6] + (float) arg1 * arg6[7] + (float) arg2 * arg6[8];
		@Pc(89) float local89 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + arg8 + 0.5F;
		if (arg7 == 1) {
			@Pc(118) float local118 = local100;
			local100 = -local113;
			local113 = local118;
		} else if (arg7 == 2) {
			local100 = -local100;
			local113 = -local113;
		} else if (arg7 == 3) {
			@Pc(139) float local139 = local100;
			local100 = local113;
			local113 = -local139;
		}
		Static6.aFloat120 = local100;
		Static6.aFloat117 = local113;
	}
}

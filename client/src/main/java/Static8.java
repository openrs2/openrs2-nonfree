import java.awt.Frame;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIZIIII)V")
	public static void method2(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg2 && Static4.anInt3360 == arg1 && Static1.anInt5 == arg5 && (Static2.anInt1216 == arg6 || Static10.method456())) {
			return;
		}
		Static1.anInt5 = arg5;
		Static2.anInt1216 = arg6;
		Static4.anInt3360 = arg1;
		if (Static10.method456()) {
			Static2.anInt1216 = 0;
		}
		if (arg0) {
			Static9.method233(28);
		} else {
			Static9.method233(25);
		}
		Static37.method4716(LocalisedText.LOADING, true);
		@Pc(57) int local57 = Static5.anInt3983;
		@Pc(59) int local59 = Static7.anInt5479;
		Static5.anInt3983 = arg1 * 8 - 48;
		Static7.anInt5479 = arg5 * 8 - 48;
		Static2.aClass4_Sub3_Sub22_1 = Static19.method2394(Static4.anInt3360 * 8, Static1.anInt5 * 8);
		Static7.aClass138_14 = null;
		@Pc(90) int local90 = Static7.anInt5479 - local59;
		@Pc(95) int local95 = Static5.anInt3983 - local57;
		if (arg0) {
			Static6.anInt4451 = 0;
			for (@Pc(166) int local166 = 0; local166 < 32768; local166++) {
				@Pc(175) Npc local175 = Static3.aClass53_Sub1_Sub2Array1[local166];
				if (local175 != null) {
					local175.z -= local90 * 128;
					local175.x -= local95 * 128;
					if (local175.x >= 0 && local175.x <= 13184 && local175.z >= 0 && local175.z <= 13184) {
						for (@Pc(226) int local226 = 0; local226 < 10; local226++) {
							@Pc(233) int[] local233 = local175.anIntArray422;
							local233[local226] -= local95;
							local233 = local175.anIntArray426;
							local233[local226] -= local90;
						}
						Static7.anIntArray595[Static6.anInt4451++] = local166;
					} else {
						Static3.aClass53_Sub1_Sub2Array1[local166].setType(null);
						Static3.aClass53_Sub1_Sub2Array1[local166] = null;
					}
				}
			}
		} else {
			for (@Pc(103) int local103 = 0; local103 < 32768; local103++) {
				@Pc(112) Npc local112 = Static3.aClass53_Sub1_Sub2Array1[local103];
				if (local112 != null) {
					for (@Pc(117) int local117 = 0; local117 < 10; local117++) {
						@Pc(124) int[] local124 = local112.anIntArray422;
						local124[local117] -= local95;
						local124 = local112.anIntArray426;
						local124[local117] -= local90;
					}
					local112.x -= local95 * 128;
					local112.z -= local90 * 128;
				}
			}
		}
		for (@Pc(263) int local263 = 0; local263 < 2048; local263++) {
			@Pc(272) Player local272 = Static5.aClass53_Sub1_Sub1Array1[local263];
			if (local272 != null) {
				for (@Pc(277) int local277 = 0; local277 < 10; local277++) {
					@Pc(282) int[] local282 = local272.anIntArray422;
					local282[local277] -= local95;
					local282 = local272.anIntArray426;
					local282[local277] -= local90;
				}
				local272.z -= local90 * 128;
				local272.x -= local95 * 128;
			}
		}
		@Pc(320) byte local320 = 0;
		@Pc(322) byte local322 = 1;
		@Pc(324) byte local324 = 104;
		if (local95 < 0) {
			local322 = -1;
			local324 = -1;
			local320 = 103;
		}
		@Pc(337) byte local337 = 0;
		Static7.anInt5334 = arg6;
		@Pc(341) byte local341 = 104;
		Player.self.method1174(arg3, false, arg4);
		@Pc(349) byte local349 = 1;
		if (local90 < 0) {
			local341 = -1;
			local349 = -1;
			local337 = 103;
		}
		for (@Pc(362) int local362 = local320; local362 != local324; local362 += local322) {
			for (@Pc(367) int local367 = local337; local367 != local341; local367 += local349) {
				@Pc(374) int local374 = local95 + local362;
				@Pc(379) int local379 = local367 + local90;
				for (@Pc(381) int local381 = 0; local381 < 4; local381++) {
					if (local374 >= 0 && local379 >= 0 && local374 < 104 && local379 < 104) {
						Static4.aClass112ArrayArrayArray1[local381][local362][local367] = Static4.aClass112ArrayArrayArray1[local381][local374][local379];
					} else {
						Static4.aClass112ArrayArrayArray1[local381][local362][local367] = null;
					}
				}
			}
		}
		for (@Pc(443) Class4_Sub25 local443 = (Class4_Sub25) Static2.aClass112_7.head(); local443 != null; local443 = (Class4_Sub25) Static2.aClass112_7.next()) {
			local443.anInt4441 -= local90;
			local443.anInt4445 -= local95;
			if (local443.anInt4445 < 0 || local443.anInt4441 < 0 || local443.anInt4445 >= 104 || local443.anInt4441 >= 104) {
				local443.unlink();
			}
		}
		if (Static6.anInt4506 != 0) {
			Static3.anInt2140 -= local90;
			Static6.anInt4506 -= local95;
		}
		if (arg0) {
			Static7.anInt5678 -= local90 * 128;
			Static4.anInt2977 -= local95;
			Static3.anInt2497 -= local90;
			Static4.anInt3302 -= local95;
			Static5.anInt4165 -= local90;
			Static3.anInt2519 -= local95 * 128;
		} else {
			Static1.anInt772 = 1;
		}
		Static6.anInt4457 = 0;
		if (GlRenderer.enabled && arg0 && (Math.abs(local95) > 104 || Math.abs(local90) > 104)) {
			Static17.method1655();
		}
		Static31.method3150();
		Static2.aClass112_8.clear();
		Static1.aClass112_1.clear();
		Static26.method2963();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method3() {
		Static6.anInterface2Array1 = null;
		Static19.method1858();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!fh;Lclient!fh;)V")
	public static void method5(@OriginalArg(1) Js5 arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(10) int local10 = (int) (Math.random() * 21.0D) - 10;
		Static1.aClass58_22 = arg1;
		@Pc(19) int local19 = (int) (Math.random() * 41.0D) - 20;
		Static7.aClass58_103 = arg0;
		@Pc(28) int local28 = (int) (Math.random() * 21.0D) - 10;
		Static1.aClass58_22.getGroupCapacity(34);
		@Pc(40) int local40 = (int) (Math.random() * 21.0D) - 10;
		Static6.anInt4867 = local19 + local28;
		Static5.anInt3963 = local10 + local19;
		Static1.anInt97 = local19 + local40;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method7(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(17) String local17 = Static29.method3464(Static14.method1054(arg1));
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < Static3.anInt2510; local21++) {
			@Pc(30) Player local30 = Static5.aClass53_Sub1_Sub1Array1[Static4.anIntArray317[local21]];
			if (local30 != null && local30.name != null && local30.name.equalsIgnoreCase(local17)) {
				local19 = true;
				if (arg0 == 1) {
					Static3.aClass4_Sub10_Sub1_1.writeOpcode(212);
					Static3.aClass4_Sub10_Sub1_1.writeShortA(Static4.anIntArray317[local21]);
					Static3.aClass4_Sub10_Sub1_1.writeByteA(0);
				} else if (arg0 == 4) {
					Static3.aClass4_Sub10_Sub1_1.writeOpcode(105);
					Static3.aClass4_Sub10_Sub1_1.writeShort(Static4.anIntArray317[local21]);
					Static3.aClass4_Sub10_Sub1_1.writeByte(0);
				} else if (arg0 == 5) {
					Static3.aClass4_Sub10_Sub1_1.writeOpcode(96);
					Static3.aClass4_Sub10_Sub1_1.writeByteA(0);
					Static3.aClass4_Sub10_Sub1_1.writeShort(Static4.anIntArray317[local21]);
				} else if (arg0 == 6) {
					Static3.aClass4_Sub10_Sub1_1.writeOpcode(77);
					Static3.aClass4_Sub10_Sub1_1.writeShortLE2(Static4.anIntArray317[local21]);
					Static3.aClass4_Sub10_Sub1_1.writeByteS(0);
				} else if (arg0 == 7) {
					Static3.aClass4_Sub10_Sub1_1.writeOpcode(52);
					Static3.aClass4_Sub10_Sub1_1.writeShort(Static4.anIntArray317[local21]);
					Static3.aClass4_Sub10_Sub1_1.writeByte(0);
				}
				break;
			}
		}
		if (!local19) {
			Static26.method4357("", 0, LocalisedText.UNABLETOFIND + local17);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method8() {
		for (@Pc(11) int local11 = 0; local11 < Static6.anInt4451; local11++) {
			@Pc(18) int local18 = Static7.anIntArray595[local11];
			@Pc(22) Npc local22 = Static3.aClass53_Sub1_Sub2Array1[local18];
			if (local22 != null) {
				Static15.method1428(local22.type.size, local22);
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I")
	public static int method9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 >= arg0 ? (arg1 > arg2 ? arg2 : arg1) : arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIZ)V")
	public static void method10(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static7.anInt5632 = 104;
		Static7.anInt5590 = 104;
		Static4.anInt3253 = arg0;
		Static3.aClass4_Sub19ArrayArrayArray2 = new Class4_Sub19[4][Static7.anInt5632][Static7.anInt5590];
		Static6.anIntArrayArrayArray14 = new int[4][Static7.anInt5632 + 1][Static7.anInt5590 + 1];
		if (GlRenderer.enabled) {
			Static3.aClass4_Sub12ArrayArray1 = new Class4_Sub12[4][];
		}
		if (arg1) {
			Static7.aClass4_Sub19ArrayArrayArray3 = new Class4_Sub19[1][Static7.anInt5632][Static7.anInt5590];
			Static2.anIntArrayArray10 = new int[Static7.anInt5632][Static7.anInt5590];
			Static1.anIntArrayArrayArray2 = new int[1][Static7.anInt5632 + 1][Static7.anInt5590 + 1];
			if (GlRenderer.enabled) {
				Static7.aClass4_Sub12ArrayArray3 = new Class4_Sub12[1][];
			}
		} else {
			Static7.aClass4_Sub19ArrayArrayArray3 = null;
			Static2.anIntArrayArray10 = null;
			Static1.anIntArrayArrayArray2 = null;
			Static7.aClass4_Sub12ArrayArray3 = null;
		}
		Static35.method4368(false);
		Static7.aClass184Array13 = new Class184[500];
		Static2.anInt1742 = 0;
		Static6.aClass184Array12 = new Class184[500];
		Static5.anInt4112 = 0;
		Static2.anIntArrayArrayArray3 = new int[4][Static7.anInt5632 + 1][Static7.anInt5590 + 1];
		Static4.aClass33Array2 = new Class33[5000];
		Static4.anInt2661 = 0;
		Static2.aClass33Array1 = new Class33[100];
		Static4.aBooleanArrayArray5 = new boolean[Static4.anInt3253 + Static4.anInt3253 + 1][Static4.anInt3253 + Static4.anInt3253 + 1];
		Static4.aBooleanArrayArray4 = new boolean[Static4.anInt3253 + Static4.anInt3253 + 2][Static4.anInt3253 + Static4.anInt3253 + 2];
		Static4.aByteArrayArrayArray16 = new byte[4][Static7.anInt5632][Static7.anInt5590];
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void method11() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static3.aBooleanArray13[local3] = false;
		}
		Static5.anInt5195 = -1;
		Static1.anInt772 = 5;
		Static6.anInt4838 = 0;
		Static1.anInt212 = 0;
		Static4.anInt3024 = -1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIFIIZB)[I")
	public static int[] method12(@OriginalArg(3) float arg0) {
		@Pc(2) int[] local2 = new int[2048];
		@Pc(16) TextureOp34 local16 = new TextureOp34();
		local16.anInt2620 = (int) (arg0 * 4096.0F);
		local16.anInt2628 = 4;
		local16.aBoolean181 = true;
		local16.anInt2631 = 8;
		local16.anInt2621 = 35;
		local16.anInt2625 = 8;
		local16.postDecode();
		Static11.method524(2048, 1);
		local16.method2053(local2, 0);
		return local2;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IJ)V")
	public static void method13(@OriginalArg(1) long arg0) {
		Static3.aClass4_Sub10_Sub1_1.position = 0;
		Static3.aClass4_Sub10_Sub1_1.writeByte(21);
		Static3.aClass4_Sub10_Sub1_1.writeLong(arg0);
		Static6.anInt5173 = -3;
		Static2.anInt1213 = 0;
		Static4.anInt3409 = 0;
		Static6.anInt4759 = 1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
	public static void method66(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static1.anInt113; local3++) {
			if (arg2 < Static6.anIntArray540[local3] + Static5.anIntArray383[local3] && arg2 + arg0 > Static6.anIntArray540[local3] && Static7.anIntArray638[local3] + Static7.anIntArray616[local3] > arg3 && arg3 + arg1 > Static7.anIntArray638[local3]) {
				Static2.aBooleanArray8[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILsignlink!pm;I)Ljava/awt/Frame;")
	public static Frame method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) SignLink arg3) {
		if (!arg3.isFullScreenSupported()) {
			return null;
		}
		@Pc(26) Class169[] local26 = Static11.method610(arg3);
		if (local26 == null) {
			return null;
		}
		@Pc(34) boolean local34 = false;
		for (@Pc(36) int local36 = 0; local36 < local26.length; local36++) {
			if (arg1 == local26[local36].anInt5276 && arg2 == local26[local36].anInt5275 && (!local34 || arg0 < local26[local36].anInt5279)) {
				local34 = true;
				arg0 = local26[local36].anInt5279;
			}
		}
		if (!local34) {
			return null;
		}
		@Pc(109) PrivilegedRequest local109 = arg3.enterFullScreen(arg1, arg2, arg0);
		while (local109.status == 0) {
			ThreadUtils.sleep(10L);
		}
		@Pc(124) Frame local124 = (Frame) local109.result;
		if (local124 == null) {
			return null;
		} else if (local109.status == 2) {
			Static31.method3658(arg3, local124);
			return null;
		} else {
			return local124;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I")
	public static int method71(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static28.method3276(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	public static void method89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) LinkedList local17 = Static4.aClass112ArrayArrayArray1[Static7.anInt5334][arg0][arg1];
		if (local17 == null) {
			Static31.method3734(Static7.anInt5334, arg0, arg1);
			return;
		}
		@Pc(28) int local28 = -99999999;
		@Pc(33) ObjStackNode local33 = (ObjStackNode) local17.head();
		@Pc(35) ObjStackNode local35 = null;
		while (local33 != null) {
			@Pc(44) ObjType local44 = ObjTypeList.get(local33.value.type);
			@Pc(47) int local47 = local44.cost;
			if (local44.stackable == 1) {
				local47 *= local33.value.count + 1;
			}
			if (local47 > local28) {
				local28 = local47;
				local35 = local33;
			}
			local33 = (ObjStackNode) local17.next();
		}
		if (local35 == null) {
			Static31.method3734(Static7.anInt5334, arg0, arg1);
			return;
		}
		local17.addHead(local35);
		@Pc(100) ObjStackNode local100 = (ObjStackNode) local17.head();
		@Pc(102) ObjStack local102 = null;
		@Pc(104) ObjStack local104 = null;
		while (local100 != null) {
			@Pc(110) ObjStack local110 = local100.value;
			if (local35.value.type != local110.type) {
				if (local104 == null) {
					local104 = local110;
				}
				if (local104.type != local110.type && local102 == null) {
					local102 = local110;
				}
			}
			local100 = (ObjStackNode) local17.next();
		}
		@Pc(155) long local155 = (long) (arg0 + (arg1 << 7) + 1610612736);
		Static29.method3478(Static7.anInt5334, arg0, arg1, Static11.method522(arg1 * 128 + 64, arg0 * 128 + 64, Static7.anInt5334), local35.value, local155, local104, local102);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public static void method90(@OriginalArg(0) int arg0) {
		Static7.anInt6031 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static7.anInt5632; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static7.anInt5590; local8++) {
				if (Static1.aClass4_Sub19ArrayArrayArray1[arg0][local3][local8] == null) {
					Static1.aClass4_Sub19ArrayArrayArray1[arg0][local3][local8] = new Class4_Sub19(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	public static void method91() {
		Static5.aClass26_42.removeSoft();
		Static6.aClass26_46.removeSoft();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIBII)V")
	public static void method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static2.anInt902 <= arg4 - arg0 && arg0 + arg4 <= Static3.anInt2553 && arg2 - arg0 >= Static4.anInt3086 && Static5.anInt4230 >= arg0 + arg2) {
			Static10.method896(arg5, arg1, arg0, arg3, arg4, arg2);
		} else {
			Static14.method1082(arg0, arg5, arg4, arg1, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V")
	public static void method101() {
		Static3.anInt2582 = 0;
		Static3.anInt2574 = 1;
		Static1.aBoolean38 = false;
		Static5.anInt3570 = 0;
		Static6.anInt4458 = 0;
		Static5.anInt4324 = -1;
		Static2.anInt1641 = -3;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)[Lclient!vn;")
	public static SoftwareSprite[] method103() {
		@Pc(8) SoftwareSprite[] local8 = new SoftwareSprite[Static4.anInt2748];
		for (@Pc(10) int local10 = 0; local10 < Static4.anInt2748; local10++) {
			@Pc(21) int local21 = Static7.anIntArray643[local10] * Static3.anIntArray185[local10];
			@Pc(24) int[] local24 = new int[local21];
			@Pc(28) byte[] local28 = Static6.aByteArrayArray36[local10];
			for (@Pc(30) int local30 = 0; local30 < local21; local30++) {
				local24[local30] = Static2.anIntArray85[local28[local30] & 0xFF];
			}
			local8[local10] = new SoftwareSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[local10], Static5.anIntArray391[local10], Static3.anIntArray185[local10], Static7.anIntArray643[local10], local24);
		}
		Static37.method4670();
		return local8;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!fh;II)Lclient!ag;")
	public static Class7 method106(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.fetchFile(arg1, arg2);
		return local5 == null ? null : new Class7(new Buffer(local5));
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!vh;ILclient!p;ILclient!f;II)V")
	public static void method109(@OriginalArg(1) LocType arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Npc arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Player arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class4_Sub11 local9 = new Class4_Sub11();
		local9.anInt2126 = arg6;
		local9.anInt2113 = arg3 * 128;
		local9.anInt2124 = arg1 * 128;
		if (arg0 != null) {
			local9.anInt2116 = arg0.anInt5530;
			local9.anInt2119 = arg0.anInt5555;
			local9.anIntArray172 = arg0.anIntArray632;
			local9.anInt2127 = arg0.anInt5525;
			@Pc(156) int local156 = arg0.anInt5527;
			local9.anInt2123 = arg0.anInt5519 * 128;
			local9.aClass181_1 = arg0;
			@Pc(168) int local168 = arg0.anInt5516;
			if (arg5 == 1 || arg5 == 3) {
				local156 = arg0.anInt5516;
				local168 = arg0.anInt5527;
			}
			local9.anInt2117 = (local156 + arg1) * 128;
			local9.anInt2115 = arg0.anInt5521;
			local9.anInt2112 = (local168 + arg3) * 128;
			if (arg0.anIntArray631 != null) {
				local9.aBoolean146 = true;
				local9.method1652();
			}
			if (local9.anIntArray172 != null) {
				local9.anInt2125 = (int) ((double) (local9.anInt2116 - local9.anInt2119) * Math.random()) + local9.anInt2119;
			}
			Static1.aClass112_2.addTail(local9);
		} else if (arg2 != null) {
			local9.aClass53_Sub1_Sub2_1 = arg2;
			@Pc(86) NpcType local86 = arg2.type;
			if (local86.anIntArray590 != null) {
				local9.aBoolean146 = true;
				local86 = local86.method4265();
			}
			if (local86 != null) {
				local9.anInt2117 = (local86.size + arg1) * 128;
				local9.anInt2112 = (local86.size + arg3) * 128;
				local9.anInt2115 = Static10.method395(arg2);
				local9.anInt2127 = local86.anInt5235;
				local9.anInt2123 = local86.anInt5249 * 128;
			}
			Static2.aClass112_9.addTail(local9);
		} else if (arg4 != null) {
			local9.aClass53_Sub1_Sub1_1 = arg4;
			local9.anInt2117 = (arg1 + arg4.getSize()) * 128;
			local9.anInt2112 = (arg4.getSize() + arg3) * 128;
			local9.anInt2115 = Static10.method396(arg4);
			local9.anInt2127 = arg4.soundVolume;
			local9.anInt2123 = arg4.soundRadius * 128;
			Static5.aClass84_18.put(Base37.encode(arg4.name), local9);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
	public static void method111(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub3_Sub9 local8 = Static12.method2322(12, arg0);
		local8.method1519();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!fh;Lclient!fh;B)V")
	public static void method113(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		Static1.aClass4_Sub3_Sub5_1 = method121(arg0, arg1, Static2.anInt914);
		if (GlRenderer.enabled) {
			Static2.aClass4_Sub3_Sub5_Sub2_2 = Static22.method2194(arg1, Static2.anInt914, arg0);
		} else {
			Static2.aClass4_Sub3_Sub5_Sub2_2 = (Class4_Sub3_Sub5_Sub2) Static1.aClass4_Sub3_Sub5_1;
		}
		Static5.aClass4_Sub3_Sub5_2 = method121(arg0, arg1, Static7.anInt6040);
		Static5.aClass4_Sub3_Sub5_3 = method121(arg0, arg1, Static4.anInt3309);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public static void method115() {
		Static5.anInt5206 = 0;
		Static1.aByte1 = 0;
		Static3.anInt2140 = 0;
		Static6.anInt4506 = 0;
		Static3.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ho;I)Z")
	public static boolean method120(@OriginalArg(0) Class82 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean154) {
			return false;
		} else if (!arg0.method1810()) {
			return false;
		} else if (Static3.aClass84_10.get((long) arg0.anInt2292) == null) {
			return Static3.aClass84_9.get((long) arg0.anInt2284) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!fh;Lclient!fh;III)Lclient!gl;")
	public static Class4_Sub3_Sub5 method121(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(3) int arg2) {
		return Static9.method197(arg0, arg2, 0) ? Static10.method304(arg1.fetchFile(arg2, 0)) : null;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V")
	public static void method173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static1.anIntArray62[arg0] = arg1;
		@Pc(21) Class4_Sub5 local21 = (Class4_Sub5) Static7.aClass84_25.get((long) arg0);
		if (local21 == null) {
			@Pc(28) Class4_Sub5 local28 = new Class4_Sub5(4611686018427387905L);
			Static7.aClass84_25.put((long) arg0, local28);
		} else if (local21.aLong17 != 4611686018427387905L) {
			local21.aLong17 = MonotonicClock.currentTimeMillis() + 500L | 0x4000000000000000L;
		}
	}
}

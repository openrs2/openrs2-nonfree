import java.util.Random;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!fg;IIIZILclient!nb;Lclient!ho;)V")
	public static void method3244(@OriginalArg(0) Class4_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class4_Sub17 arg5, @OriginalArg(7) Class82 arg6) {
		@Pc(3) Class106 local3 = null;
		if (arg6.anInt2270 == 0) {
			if ((double) Static3.aFloat68 == 3.0D) {
				local3 = Static6.aClass106_7;
			}
			if ((double) Static3.aFloat68 == 4.0D) {
				local3 = Static4.aClass106_3;
			}
			if ((double) Static3.aFloat68 == 6.0D) {
				local3 = Static4.aClass106_5;
			}
			if ((double) Static3.aFloat68 >= 8.0D) {
				local3 = Static4.aClass106_4;
			}
		} else if (arg6.anInt2270 == 1) {
			if ((double) Static3.aFloat68 == 3.0D) {
				local3 = Static4.aClass106_5;
			}
			if ((double) Static3.aFloat68 == 4.0D) {
				local3 = Static4.aClass106_4;
			}
			if ((double) Static3.aFloat68 == 6.0D) {
				local3 = Static1.aClass106_1;
			}
			if ((double) Static3.aFloat68 >= 8.0D) {
				local3 = Static2.aClass106_2;
			}
		} else if (arg6.anInt2270 == 2) {
			if ((double) Static3.aFloat68 == 3.0D) {
				local3 = Static1.aClass106_1;
			}
			if ((double) Static3.aFloat68 == 4.0D) {
				local3 = Static2.aClass106_2;
			}
			if ((double) Static3.aFloat68 == 6.0D) {
				local3 = Static5.aClass106_6;
			}
			if ((double) Static3.aFloat68 >= 8.0D) {
				local3 = Static6.aClass106_8;
			}
		}
		if (local3 == null) {
			return;
		}
		@Pc(123) int local123 = arg6.anInt2286;
		if (arg0.aBoolean105 && arg6.anInt2287 != -1) {
			local123 = arg6.anInt2287;
		}
		@Pc(141) int local141 = Static1.aClass4_Sub3_Sub5_1.method2279(arg6.aString131, null, Static5.aStringArray24);
		@Pc(144) int local144 = arg0.anInt1764;
		@Pc(164) int local164;
		if (arg4) {
			local164 = local144 - local3.method2328() * local141 / 2;
		} else {
			local164 = local144 - arg2 - (local141 - 1) * local3.method2332() - local3.method2328() / 2;
		}
		@Pc(181) int local181 = local164 - local3.method2328();
		@Pc(188) int local188 = local164 + local3.method2328() / 2;
		@Pc(190) int local190 = 0;
		for (@Pc(192) int local192 = 0; local192 < local141; local192++) {
			@Pc(199) String local199 = Static5.aStringArray24[local192];
			if (local141 - 1 > local192) {
				local199 = local199.substring(0, local199.length() - 4);
			}
			@Pc(221) int local221 = local3.method2326(local199);
			if (local190 < local221) {
				local190 = local221;
			}
		}
		arg5.anInt3456 = arg0.anInt1766 + arg1 - local190 / 2;
		arg5.anInt3466 = arg1 + arg0.anInt1766 + local190 / 2;
		arg5.anInt3464 = local181 + arg3;
		arg5.anInt3465 = arg3 + local181 + local3.method2332() * local141;
		@Pc(274) int local274 = local181 + 2;
		@Pc(284) int local284 = arg0.anInt1766 - local190 / 2 - 5;
		if (arg6.anInt2274 != 0) {
			Static34.method4213(local284, local274, local190 + 10, local181 + local141 * local3.method2332() + 1 - local274, arg6.anInt2274, arg6.anInt2274 >>> 24);
		}
		if (arg6.anInt2280 != 0) {
			Static34.method4221(local284, local274, local190 + 10, local3.method2332() * local141 + local181 + 1 - local274, arg6.anInt2280, arg6.anInt2280 >>> 24);
		}
		for (@Pc(343) int local343 = 0; local343 < local141; local343++) {
			@Pc(354) String local354 = Static5.aStringArray24[local343];
			if (local141 - 1 > local343) {
				local354 = local354.substring(0, local354.length() - 4);
			}
			@Pc(376) int local376 = local3.method2326(local354);
			if (local190 < local376) {
				local190 = local376;
			}
			local3.method2330(local354, arg0.anInt1766, local188, local123);
			local188 += local3.method2332();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZLclient!rl;I)V")
	public static void method3246(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub27 arg1) {
		@Pc(9) int local9 = (int) arg1.key;
		@Pc(12) int local12 = arg1.anInt4620;
		arg1.unlink();
		if (arg0) {
			InterfaceList.discard(local12);
		}
		Static24.method2689(local12);
		@Pc(28) Component local28 = InterfaceList.getComponent(local9);
		if (local28 != null) {
			method3270(local28);
		}
		@Pc(35) int local35 = Static7.anInt5634;
		for (@Pc(42) int local42 = 0; local42 < local35; local42++) {
			if (Static31.method3659(Static6.aShortArray100[local42])) {
				Static25.method2929(local42);
			}
		}
		if (Static7.anInt5634 == 1) {
			Static1.aBoolean17 = false;
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
		} else {
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
			@Pc(75) int local75 = Static5.aClass4_Sub3_Sub5_3.method2252(LocalisedText.CHOOSE_OPTION);
			for (@Pc(77) int local77 = 0; local77 < Static7.anInt5634; local77++) {
				@Pc(86) int local86 = Static5.aClass4_Sub3_Sub5_3.method2252(Static26.method2992(local77));
				if (local86 > local75) {
					local75 = local86;
				}
			}
			Static3.anInt2394 = (Static7.aBoolean389 ? 26 : 22) + Static7.anInt5634 * 15;
			Static6.anInt4440 = local75 + 8;
		}
		if (Static3.anInt5398 != -1) {
			method3277(Static3.anInt5398, 1);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	public static void method3249() {
		if (Static1.anInt331 < 0) {
			Static1.anInt331 = 0;
			Static6.anInt4393 = -1;
			Static1.anInt929 = -1;
		}
		if (Static1.anInt331 > Static3.anInt2965) {
			Static1.anInt331 = Static3.anInt2965;
			Static1.anInt929 = -1;
			Static6.anInt4393 = -1;
		}
		if (Static7.anInt5231 < 0) {
			Static6.anInt4393 = -1;
			Static7.anInt5231 = 0;
			Static1.anInt929 = -1;
		}
		if (Static3.anInt2960 < Static7.anInt5231) {
			Static1.anInt929 = -1;
			Static6.anInt4393 = -1;
			Static7.anInt5231 = Static3.anInt2960;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIZLclient!fh;)V")
	public static void method3251(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Js5 arg2) {
		Static2.anInt1244 = 0;
		Static7.anInt5391 = arg0;
		Static3.anInt5397 = 10000;
		Static7.anInt6022 = arg1;
		Static2.aClass58_42 = arg2;
		Static6.aBoolean321 = false;
		Static5.anInt4357 = 1;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	public static void method3252() {
		if (Static5.aFloat147 < 128.0F) {
			Static5.aFloat147 = 128.0F;
		}
		@Pc(12) int local12 = Static7.anInt5412 >> 7;
		if (Static5.aFloat147 > 383.0F) {
			Static5.aFloat147 = 383.0F;
		}
		while (Static5.aFloat97 >= 2048.0F) {
			Static5.aFloat97 -= 2048.0F;
		}
		@Pc(33) int local33 = Static3.anInt2496 >> 7;
		@Pc(35) int local35 = 0;
		while (Static5.aFloat97 < 0.0F) {
			Static5.aFloat97 += 2048.0F;
		}
		@Pc(63) int local63 = Static11.method522(Static3.anInt2496, Static7.anInt5412, Static7.anInt5334);
		if (local12 > 3 && local33 > 3 && local12 < 100 && local33 < 100) {
			for (@Pc(85) int local85 = local12 - 4; local85 <= local12 + 4; local85++) {
				for (@Pc(98) int local98 = local33 - 4; local98 <= local33 + 4; local98++) {
					@Pc(109) int local109 = Static7.anInt5334;
					if (local109 < 3 && (Static4.aByteArrayArrayArray17[1][local85][local98] & 0x2) == 2) {
						local109++;
					}
					@Pc(148) int local148 = local63 + (Static4.aByteArrayArrayArray16[local109][local85][local98] & 0xFF) * 8 - Static6.anIntArrayArrayArray13[local109][local85][local98];
					if (local148 > local35) {
						local35 = local148;
					}
				}
			}
		}
		@Pc(163) int local163 = local35 * 192;
		if (local163 > 98048) {
			local163 = 98048;
		}
		if (local163 < 32768) {
			local163 = 32768;
		}
		if (local163 > Static1.anInt626) {
			Static1.anInt626 += (local163 - Static1.anInt626) / 24;
		} else if (Static1.anInt626 > local163) {
			Static1.anInt626 += (local163 - Static1.anInt626) / 80;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public static void method3253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class4_Sub19 local30 = Static1.aClass4_Sub19ArrayArrayArray1[local9][arg0][arg1] = Static1.aClass4_Sub19ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt3552--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt3554; local40++) {
					@Pc(49) Class33 local49 = local30.aClass33Array3[local40];
					if ((local49.aLong38 >> 29 & 0x3L) == 2L && local49.anInt824 == arg0 && local49.anInt826 == arg1) {
						local49.anInt819--;
					}
				}
			}
		}
		if (Static1.aClass4_Sub19ArrayArrayArray1[0][arg0][arg1] == null) {
			Static1.aClass4_Sub19ArrayArrayArray1[0][arg0][arg1] = new Class4_Sub19(0, arg0, arg1);
		}
		Static1.aClass4_Sub19ArrayArrayArray1[0][arg0][arg1].aClass4_Sub19_1 = local7;
		Static1.aClass4_Sub19ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)I")
	public static int method3257(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(B)V")
	public static void method3258() {
		Static1.aClass26_6.removeSoft();
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(BI)V")
	public static void method3268() {
		Static6.aClass26_51.clean(5);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!wf;)V")
	public static void method3270(@OriginalArg(1) Component arg0) {
		if (arg0.anInt5900 == Static3.anInt2522) {
			Static2.aBooleanArray8[arg0.anInt5967] = true;
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I")
	public static int method3276(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		if (local23 < local14) {
			local25 = local23;
		}
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local25 > local38) {
			local25 = local38;
		}
		if (local14 < local23) {
			local40 = local23;
		}
		if (local38 > local40) {
			local40 = local38;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local25 + local40) / 2.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(73) int local73 = (int) (local66 * 256.0D);
		if (local73 < 0) {
			local73 = 0;
		} else if (local73 > 255) {
			local73 = 255;
		}
		if (local40 != local25) {
			if (local14 == local40) {
				local60 = (local23 - local38) / (local40 - local25);
			} else if (local23 == local40) {
				local60 = (local38 - local14) / (local40 - local25) + 2.0D;
			} else if (local38 == local40) {
				local60 = (local14 - local23) / (local40 - local25) + 4.0D;
			}
			if (local66 < 0.5D) {
				local68 = (local40 - local25) / (local25 + local40);
			}
			if (local66 >= 0.5D) {
				local68 = (local40 - local25) / (2.0D - local40 - local25);
			}
		}
		@Pc(173) int local173 = (int) (local68 * 256.0D);
		if (local173 < 0) {
			local173 = 0;
		} else if (local173 > 255) {
			local173 = 255;
		}
		@Pc(199) double local199 = local60 / 6.0D;
		@Pc(204) int local204 = (int) (local199 * 256.0D);
		if (local73 > 243) {
			local173 >>= 4;
		} else if (local73 > 217) {
			local173 >>= 3;
		} else if (local73 > 192) {
			local173 >>= 2;
		} else if (local73 > 179) {
			local173 >>= 1;
		}
		return (local73 >> 1) + (local173 >> 5 << 7) + (local204 >> 2 << 10);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIB)V")
	public static void method3277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (InterfaceList.load(arg0)) {
			Static29.method3480(InterfaceList.components[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V")
	public static void method3281() {
		Static7.aClass26_55.clear();
		Static5.aClass26_41.clear();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIB)V")
	public static void method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static6.anInt4393 = -1;
		@Pc(7) float local7 = (float) Static3.anInt2960 / (float) Static3.anInt2965;
		Static1.anInt929 = -1;
		@Pc(15) int local15 = arg1;
		@Pc(17) int local17 = arg2;
		if (local7 >= 1.0F) {
			local15 = (int) ((float) arg2 / local7);
		} else {
			local17 = (int) ((float) arg1 * local7);
		}
		arg0 -= (arg2 - local17) / 2;
		arg3 -= (arg1 - local15) / 2;
		Static1.anInt331 = Static3.anInt2965 * arg3 / local15;
		Static7.anInt5231 = Static3.anInt2960 * arg0 / local17;
		method3249();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III[B)Z")
	public static boolean method3320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Buffer local12 = new Buffer(arg2);
		@Pc(14) int local14 = -1;
		label55:
		while (true) {
			@Pc(18) int local18 = local12.readUnsignedMultiSmart();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				while (!local28) {
					@Pc(47) int local47 = local12.readUnsignedShortSmart();
					if (local47 == 0) {
						continue label55;
					}
					local26 += local47 - 1;
					@Pc(62) int local62 = local26 >> 6 & 0x3F;
					@Pc(68) int local68 = local12.readUnsignedByte() >> 2;
					@Pc(72) int local72 = arg1 + local62;
					@Pc(76) int local76 = local26 & 0x3F;
					@Pc(80) int local80 = arg0 + local76;
					if (local72 > 0 && local80 > 0 && local72 < 103 && local80 < 103) {
						@Pc(102) LocType local102 = LocTypeList.get(local14);
						if (local68 != 22 || Preferences.groundDecoration || local102.anInt5522 != 0 || local102.anInt5509 == 1 || local102.aBoolean376) {
							local28 = true;
							if (!local102.method4449()) {
								local7 = false;
								Static7.anInt5486++;
							}
						}
					}
				}
				@Pc(34) int local34 = local12.readUnsignedShortSmart();
				if (local34 == 0) {
					break;
				}
				local12.readUnsignedByte();
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[B")
	public static byte[] method3321(@OriginalArg(0) int arg0) {
		@Pc(18) Class4_Sub3_Sub20 local18 = (Class4_Sub3_Sub20) Static7.aClass40_15.get((long) arg0);
		if (local18 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(55) int local55 = 255 - local45;
				@Pc(60) int local60 = Static12.method716(local30, local55);
				@Pc(64) byte local64 = local24[local60];
				local24[local60] = local24[local55];
				local24[local55] = local24[511 - local45] = local64;
			}
			local18 = new Class4_Sub3_Sub20(local24);
			Static7.aClass40_15.put((long) arg0, local18);
		}
		return local18.aByteArray69;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method3322() {
		Static27.method3104(Preferences.buildArea);
		@Pc(17) int local17 = (Static3.anInt2519 >> 10) + (Static5.anInt3983 >> 3);
		@Pc(25) int local25 = (Static7.anInt5479 >> 3) + (Static7.anInt5678 >> 10);
		Static1.aByteArrayArray4 = new byte[18][];
		Static3.anIntArray167 = new int[18];
		Static7.aByteArrayArray49 = new byte[18][];
		Static6.anIntArray570 = new int[18];
		Static1.anIntArray59 = new int[18];
		Static7.aByteArrayArray50 = new byte[18][];
		Static4.anIntArray316 = new int[18];
		Static1.aByteArrayArray3 = new byte[18][];
		Static7.anIntArray597 = new int[18];
		Static5.anIntArrayArray35 = new int[18][4];
		Static3.anIntArray197 = new int[18];
		Static5.aByteArrayArray31 = new byte[18][];
		@Pc(76) int local76 = 0;
		for (@Pc(82) int local82 = (local17 - 6) / 8; local82 <= (local17 + 6) / 8; local82++) {
			for (@Pc(95) int local95 = (local25 - 6) / 8; local95 <= (local25 + 6) / 8; local95++) {
				@Pc(112) int local112 = (local82 << 8) + local95;
				Static7.anIntArray597[local76] = local112;
				Static3.anIntArray167[local76] = client.js5Archive5.getGroupId("m" + local82 + "_" + local95);
				Static1.anIntArray59[local76] = client.js5Archive5.getGroupId("l" + local82 + "_" + local95);
				Static6.anIntArray570[local76] = client.js5Archive5.getGroupId("n" + local82 + "_" + local95);
				Static4.anIntArray316[local76] = client.js5Archive5.getGroupId("um" + local82 + "_" + local95);
				Static3.anIntArray197[local76] = client.js5Archive5.getGroupId("ul" + local82 + "_" + local95);
				if (Static6.anIntArray570[local76] == -1) {
					Static3.anIntArray167[local76] = -1;
					Static1.anIntArray59[local76] = -1;
					Static4.anIntArray316[local76] = -1;
					Static3.anIntArray197[local76] = -1;
				}
				local76++;
			}
		}
		for (@Pc(238) int local238 = local76; local238 < Static6.anIntArray570.length; local238++) {
			Static6.anIntArray570[local238] = -1;
			Static3.anIntArray167[local238] = -1;
			Static1.anIntArray59[local238] = -1;
			Static4.anIntArray316[local238] = -1;
			Static3.anIntArray197[local238] = -1;
		}
		Static8.method2(true, local17, false, 8, 8, local25, 0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZI)V")
	public static void method3323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg4) {
			Static32.method4032(arg4, arg2, arg3, arg1);
		} else if (Static2.anInt902 <= arg1 - arg4 && Static3.anInt2553 >= arg1 + arg4 && arg3 - arg0 >= Static4.anInt3086 && Static5.anInt4230 >= arg3 + arg0) {
			Static19.method4379(arg0, arg1, arg2, arg3, arg4);
		} else {
			Static26.method4814(arg3, arg0, arg2, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZILclient!qc;)V")
	public static void method3325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) PathingEntity arg5) {
		Static29.method3482(arg0, arg4, arg1, arg5.x, arg5.z, arg2, arg3);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZ)V")
	public static void method3327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static7.anInt6008 == 1) {
			Static6.aClass4_Sub3_Sub14Array12[Static2.anInt1629 / 100].method4506(Static6.anInt5177 - 8, Static4.anInt3275 - 8);
		}
		if (Static7.anInt6008 == 2) {
			Static6.aClass4_Sub3_Sub14Array12[Static2.anInt1629 / 100 + 4].method4506(Static6.anInt5177 - 8, Static4.anInt3275 - 8);
		}
		Static15.method1480();
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	public static void method3329() {
		Static7.aClass26_56.removeSoft();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLclient!gl;Z)V")
	public static void method3331(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub3_Sub5 arg1) {
		if (GlRenderer.enabled || arg0) {
			@Pc(10) int local10 = GameShell.canvasHeight;
			@Pc(16) int local16 = local10 * 956 / 503;
			Static6.aClass4_Sub3_Sub14_7.method4507((GameShell.canvasWidth - local16) / 2, 0, local16, local10);
			Static6.aClass56_1.method2815(GameShell.canvasWidth / 2 - Static6.aClass56_1.anInt3408 / 2, 18);
		}
		arg1.method2271(client.game == 1 ? LocalisedText.GAME1_LOADING : LocalisedText.GAME0_LOADING, GameShell.canvasWidth / 2, GameShell.canvasHeight / 2 - 26, 16777215, -1);
		@Pc(70) int local70 = GameShell.canvasHeight / 2 - 18;
		if (GlRenderer.enabled) {
			Static18.method1690(GameShell.canvasWidth / 2 - 152, local70, 304, 34, 9179409);
			Static18.method1690(GameShell.canvasWidth / 2 - 151, local70 + 1, 302, 32, 0);
			Static18.method1701(GameShell.canvasWidth / 2 - 150, local70 + 2, client.mainLoadPercentage * 3, 30, 9179409);
			Static18.method1701(GameShell.canvasWidth / 2 + client.mainLoadPercentage * 3 - 150, local70 + 2, 300 - client.mainLoadPercentage * 3, 30, 0);
		} else {
			Static34.method4222(GameShell.canvasWidth / 2 - 152, local70, 304, 34, 9179409);
			Static34.method4222(GameShell.canvasWidth / 2 - 151, local70 + 1, 302, 32, 0);
			Static33.method4205(GameShell.canvasWidth / 2 - 150, local70 + 2, client.mainLoadPercentage * 3, 30, 9179409);
			Static33.method4205(client.mainLoadPercentage * 3 + GameShell.canvasWidth / 2 - 150, local70 + 2, 300 - client.mainLoadPercentage * 3, 30, 0);
		}
		arg1.method2271(client.mainLoadSecondaryText, GameShell.canvasWidth / 2, GameShell.canvasHeight / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I")
	public static int method3355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIIILclient!pc;II)I")
	public static int method3356(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) Class4_Sub6_Sub4 arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		@Pc(14) int local14;
		if (arg9 == 0 || (local14 = arg3 + (arg7 + arg9 + 256 - arg2) / arg9) > arg6) {
			local14 = arg6;
		}
		@Pc(22) int local22 = arg3 << 1;
		@Pc(26) int local26 = local14 << 1;
		while (local22 < local26) {
			@Pc(33) int local33 = arg2 >> 8;
			@Pc(39) byte local39 = arg0[local33 - 1];
			@Pc(53) int local53 = (local39 << 8) + (arg0[local33] - local39) * (arg2 & 0xFF);
			@Pc(55) int local55 = local22;
			arg3 = local22 + 1;
			arg1[local55] += local53 * arg4 >> 6;
			local55 = arg3;
			local22 = arg3 + 1;
			arg1[local55] += local53 * arg5 >> 6;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local26 = (local22 >> 1) + (arg7 + arg9 - arg2) / arg9) > arg6) {
			local26 = arg6;
		}
		@Pc(105) int local105 = local26 << 1;
		while (local22 < local105) {
			@Pc(126) int local126 = (arg10 << 8) + (arg0[arg2 >> 8] - arg10) * (arg2 & 0xFF);
			@Pc(128) int local128 = local22;
			arg3 = local22 + 1;
			arg1[local128] += local126 * arg4 >> 6;
			local128 = arg3;
			local22 = arg3 + 1;
			arg1[local128] += local126 * arg5 >> 6;
			arg2 += arg9;
		}
		arg8.anInt4100 = arg2;
		return local22 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIIILclient!pc;II)I")
	public static int method3357(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) Class4_Sub6_Sub4 arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		@Pc(14) int local14;
		if (arg9 == 0 || (local14 = arg3 + (arg7 + arg9 - arg2 - 257) / arg9) > arg6) {
			local14 = arg6;
		}
		@Pc(22) int local22 = arg3 << 1;
		@Pc(26) int local26 = local14 << 1;
		while (local22 < local26) {
			@Pc(33) int local33 = arg2 >> 8;
			@Pc(37) byte local37 = arg0[local33];
			@Pc(53) int local53 = (local37 << 8) + (arg0[local33 + 1] - local37) * (arg2 & 0xFF);
			@Pc(55) int local55 = local22;
			arg3 = local22 + 1;
			arg1[local55] += local53 * arg4 >> 6;
			local55 = arg3;
			local22 = arg3 + 1;
			arg1[local55] += local53 * arg5 >> 6;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local26 = (local22 >> 1) + (arg7 + arg9 - arg2 - 1) / arg9) > arg6) {
			local26 = arg6;
		}
		@Pc(107) int local107 = local26 << 1;
		while (local22 < local107) {
			@Pc(118) byte local118 = arg0[arg2 >> 8];
			@Pc(130) int local130 = (local118 << 8) + (arg10 - local118) * (arg2 & 0xFF);
			@Pc(132) int local132 = local22;
			arg3 = local22 + 1;
			arg1[local132] += local130 * arg4 >> 6;
			local132 = arg3;
			local22 = arg3 + 1;
			arg1[local132] += local130 * arg5 >> 6;
			arg2 += arg9;
		}
		arg8.anInt4100 = arg2;
		return local22 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([B[IIIIIIILclient!pc;)I")
	public static int method3361(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class4_Sub6_Sub4 arg7) {
		@Pc(3) int local3 = arg2 >> 8;
		arg6 >>= 8;
		arg4 <<= 2;
		@Pc(18) int local18;
		if ((local18 = arg3 + arg6 - local3) > arg5) {
			local18 = arg5;
		}
		@Pc(23) int local23 = local18 - 3;
		while (arg3 < local23) {
			@Pc(29) int local29 = arg3 + 1;
			@Pc(31) int local31 = arg1[arg3];
			arg2 = local3 + 1;
			arg1[arg3] = local31 + arg0[local3] * arg4;
			@Pc(41) int local41 = local29++;
			arg1[local41] += arg0[arg2++] * arg4;
			local41 = local29++;
			arg1[local41] += arg0[arg2++] * arg4;
			arg3 = local29 + 1;
			local31 = arg1[local29];
			local3 = arg2 + 1;
			arg1[local29] = local31 + arg0[arg2] * arg4;
		}
		@Pc(80) int local80 = local23 + 3;
		while (arg3 < local80) {
			@Pc(85) int local85 = arg3++;
			arg1[local85] += arg0[local3++] * arg4;
		}
		arg7.anInt4100 = local3 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B[IIIIIIIIIILclient!pc;)I")
	public static int method3362(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class4_Sub6_Sub4 arg10) {
		@Pc(3) int local3 = arg2 >> 8;
		arg9 >>= 8;
		@Pc(11) int local11 = arg4 << 2;
		@Pc(15) int local15 = arg5 << 2;
		arg6 <<= 2;
		arg7 <<= 2;
		@Pc(30) int local30;
		if ((local30 = arg3 + arg9 - local3) > arg8) {
			local30 = arg8;
		}
		arg10.anInt4096 += arg10.anInt4097 * (local30 - arg3);
		@Pc(49) int local49 = arg3 << 1;
		@Pc(53) int local53 = local30 << 1;
		local53 -= 6;
		while (local49 < local53) {
			arg2 = local3 + 1;
			@Pc(62) byte local62 = arg0[local3];
			arg3 = local49 + 1;
			arg1[local49] += local62 * local11;
			arg4 = local11 + arg6;
			@Pc(78) int local78 = arg3++;
			arg1[local78] += local62 * local15;
			arg5 = local15 + arg7;
			local62 = arg0[arg2++];
			local78 = arg3++;
			arg1[local78] += local62 * arg4;
			arg4 += arg6;
			local78 = arg3++;
			arg1[local78] += local62 * arg5;
			arg5 += arg7;
			local62 = arg0[arg2++];
			local78 = arg3++;
			arg1[local78] += local62 * arg4;
			arg4 += arg6;
			local78 = arg3++;
			arg1[local78] += local62 * arg5;
			arg5 += arg7;
			local3 = arg2 + 1;
			local62 = arg0[arg2];
			local78 = arg3++;
			arg1[local78] += local62 * arg4;
			local11 = arg4 + arg6;
			local49 = arg3 + 1;
			arg1[arg3] += local62 * arg5;
			local15 = arg5 + arg7;
		}
		@Pc(191) int local191 = local53 + 6;
		while (local49 < local191) {
			@Pc(199) byte local199 = arg0[local3++];
			arg3 = local49 + 1;
			arg1[local49] += local199 * local11;
			local11 += arg6;
			local49 = arg3 + 1;
			arg1[arg3] += local199 * local15;
			local15 += arg7;
		}
		arg10.anInt4104 = local11 >> 2;
		arg10.anInt4098 = local15 >> 2;
		arg10.anInt4100 = local3 << 8;
		return local49 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II[B[IIIIIIIILclient!pc;II)I")
	public static int method3363(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) Class4_Sub6_Sub4 arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		arg8.anInt4104 -= arg8.anInt4102 * arg3;
		arg8.anInt4098 -= arg8.anInt4099 * arg3;
		@Pc(32) int local32;
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 - arg2 - 257) / arg9) > arg6) {
			local32 = arg6;
		}
		while (arg3 < local32) {
			@Pc(43) int local43 = arg2 >> 8;
			@Pc(47) byte local47 = arg0[local43];
			@Pc(49) int local49 = arg3++;
			arg1[local49] += ((local47 << 8) + (arg0[local43 + 1] - local47) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 - arg2 - 1) / arg9) > arg6) {
			local32 = arg6;
		}
		while (arg3 < local32) {
			@Pc(112) byte local112 = arg0[arg2 >> 8];
			@Pc(114) int local114 = arg3++;
			arg1[local114] += ((local112 << 8) + (arg10 - local112) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		arg8.anInt4104 += arg8.anInt4102 * arg3;
		arg8.anInt4098 += arg8.anInt4099 * arg3;
		arg8.anInt4096 = arg4;
		arg8.anInt4100 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIIIIILclient!pc;II)I")
	public static int method3366(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) Class4_Sub6_Sub4 arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		arg10.anInt4096 -= arg10.anInt4097 * arg3;
		@Pc(23) int local23;
		if (arg11 == 0 || (local23 = arg3 + (arg9 + arg11 - arg2 - 257) / arg11) > arg8) {
			local23 = arg8;
		}
		@Pc(31) int local31 = arg3 << 1;
		@Pc(35) int local35 = local23 << 1;
		while (local31 < local35) {
			@Pc(42) int local42 = arg2 >> 8;
			@Pc(46) byte local46 = arg0[local42];
			@Pc(62) int local62 = (local46 << 8) + (arg0[local42 + 1] - local46) * (arg2 & 0xFF);
			@Pc(64) int local64 = local31;
			arg3 = local31 + 1;
			arg1[local64] += local62 * arg4 >> 6;
			arg4 += arg6;
			local64 = arg3;
			local31 = arg3 + 1;
			arg1[local64] += local62 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		if (arg11 == 0 || (local35 = (local31 >> 1) + (arg9 + arg11 - arg2 - 1) / arg11) > arg8) {
			local35 = arg8;
		}
		@Pc(124) int local124 = local35 << 1;
		while (local31 < local124) {
			@Pc(135) byte local135 = arg0[arg2 >> 8];
			@Pc(147) int local147 = (local135 << 8) + (arg12 - local135) * (arg2 & 0xFF);
			@Pc(149) int local149 = local31;
			arg3 = local31 + 1;
			arg1[local149] += local147 * arg4 >> 6;
			arg4 += arg6;
			local149 = arg3;
			local31 = arg3 + 1;
			arg1[local149] += local147 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		arg3 = local31 >> 1;
		arg10.anInt4096 += arg10.anInt4097 * arg3;
		arg10.anInt4104 = arg4;
		arg10.anInt4098 = arg5;
		arg10.anInt4100 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIIIIILclient!pc;II)I")
	public static int method3370(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) Class4_Sub6_Sub4 arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		arg10.anInt4096 -= arg10.anInt4097 * arg3;
		@Pc(23) int local23;
		if (arg11 == 0 || (local23 = arg3 + (arg9 + arg11 + 256 - arg2) / arg11) > arg8) {
			local23 = arg8;
		}
		@Pc(31) int local31 = arg3 << 1;
		@Pc(35) int local35 = local23 << 1;
		while (local31 < local35) {
			@Pc(42) int local42 = arg2 >> 8;
			@Pc(48) byte local48 = arg0[local42 - 1];
			@Pc(62) int local62 = (local48 << 8) + (arg0[local42] - local48) * (arg2 & 0xFF);
			@Pc(64) int local64 = local31;
			arg3 = local31 + 1;
			arg1[local64] += local62 * arg4 >> 6;
			arg4 += arg6;
			local64 = arg3;
			local31 = arg3 + 1;
			arg1[local64] += local62 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		if (arg11 == 0 || (local35 = (local31 >> 1) + (arg9 + arg11 - arg2) / arg11) > arg8) {
			local35 = arg8;
		}
		@Pc(122) int local122 = local35 << 1;
		while (local31 < local122) {
			@Pc(143) int local143 = (arg12 << 8) + (arg0[arg2 >> 8] - arg12) * (arg2 & 0xFF);
			@Pc(145) int local145 = local31;
			arg3 = local31 + 1;
			arg1[local145] += local143 * arg4 >> 6;
			arg4 += arg6;
			local145 = arg3;
			local31 = arg3 + 1;
			arg1[local145] += local143 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		arg3 = local31 >> 1;
		arg10.anInt4096 += arg10.anInt4097 * arg3;
		arg10.anInt4104 = arg4;
		arg10.anInt4098 = arg5;
		arg10.anInt4100 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIILclient!pc;II)I")
	public static int method3373(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) Class4_Sub6_Sub4 arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(14) int local14;
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2 - 257) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			@Pc(25) int local25 = arg2 >> 8;
			@Pc(29) byte local29 = arg0[local25];
			@Pc(31) int local31 = arg3++;
			arg1[local31] += ((local29 << 8) + (arg0[local25 + 1] - local29) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2 - 1) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			@Pc(90) byte local90 = arg0[arg2 >> 8];
			@Pc(92) int local92 = arg3++;
			arg1[local92] += ((local90 << 8) + (arg9 - local90) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		arg7.anInt4100 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)I")
	public static int method3374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B[IIIIIIIILclient!pc;)I")
	public static int method3375(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class4_Sub6_Sub4 arg8) {
		@Pc(3) int local3 = arg2 >> 8;
		arg7 >>= 8;
		arg4 <<= 2;
		arg5 <<= 2;
		@Pc(22) int local22;
		if ((local22 = arg3 + arg7 - local3) > arg6) {
			local22 = arg6;
		}
		@Pc(30) int local30 = arg3 << 1;
		@Pc(34) int local34 = local22 << 1;
		local34 -= 6;
		while (local30 < local34) {
			arg2 = local3 + 1;
			@Pc(43) byte local43 = arg0[local3];
			arg3 = local30 + 1;
			arg1[local30] += local43 * arg4;
			@Pc(55) int local55 = arg3++;
			arg1[local55] += local43 * arg5;
			local43 = arg0[arg2++];
			local55 = arg3++;
			arg1[local55] += local43 * arg4;
			local55 = arg3++;
			arg1[local55] += local43 * arg5;
			local43 = arg0[arg2++];
			local55 = arg3++;
			arg1[local55] += local43 * arg4;
			local55 = arg3++;
			arg1[local55] += local43 * arg5;
			local3 = arg2 + 1;
			local43 = arg0[arg2];
			local55 = arg3++;
			arg1[local55] += local43 * arg4;
			local30 = arg3 + 1;
			arg1[arg3] += local43 * arg5;
		}
		@Pc(140) int local140 = local34 + 6;
		while (local30 < local140) {
			@Pc(148) byte local148 = arg0[local3++];
			arg3 = local30 + 1;
			arg1[local30] += local148 * arg4;
			local30 = arg3 + 1;
			arg1[arg3] += local148 * arg5;
		}
		arg8.anInt4100 = local3 << 8;
		return local30 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I[B[IIIIIIIIIILclient!pc;)I")
	public static int method3376(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class4_Sub6_Sub4 arg10) {
		@Pc(3) int local3 = arg2 >> 8;
		arg9 >>= 8;
		@Pc(11) int local11 = arg4 << 2;
		@Pc(15) int local15 = arg5 << 2;
		arg6 <<= 2;
		arg7 <<= 2;
		@Pc(32) int local32;
		if ((local32 = arg3 + local3 + 1 - arg9) > arg8) {
			local32 = arg8;
		}
		arg10.anInt4096 += arg10.anInt4097 * (local32 - arg3);
		@Pc(51) int local51 = arg3 << 1;
		@Pc(55) int local55 = local32 << 1;
		local55 -= 6;
		while (local51 < local55) {
			arg2 = local3 - 1;
			@Pc(64) byte local64 = arg0[local3];
			arg3 = local51 + 1;
			arg1[local51] += local64 * local11;
			arg4 = local11 + arg6;
			@Pc(80) int local80 = arg3++;
			arg1[local80] += local64 * local15;
			arg5 = local15 + arg7;
			local64 = arg0[arg2--];
			local80 = arg3++;
			arg1[local80] += local64 * arg4;
			arg4 += arg6;
			local80 = arg3++;
			arg1[local80] += local64 * arg5;
			arg5 += arg7;
			local64 = arg0[arg2--];
			local80 = arg3++;
			arg1[local80] += local64 * arg4;
			arg4 += arg6;
			local80 = arg3++;
			arg1[local80] += local64 * arg5;
			arg5 += arg7;
			local3 = arg2 - 1;
			local64 = arg0[arg2];
			local80 = arg3++;
			arg1[local80] += local64 * arg4;
			local11 = arg4 + arg6;
			local51 = arg3 + 1;
			arg1[arg3] += local64 * arg5;
			local15 = arg5 + arg7;
		}
		@Pc(193) int local193 = local55 + 6;
		while (local51 < local193) {
			@Pc(201) byte local201 = arg0[local3--];
			arg3 = local51 + 1;
			arg1[local51] += local201 * local11;
			local11 += arg6;
			local51 = arg3 + 1;
			arg1[arg3] += local201 * local15;
			local15 += arg7;
		}
		arg10.anInt4104 = local11 >> 2;
		arg10.anInt4098 = local15 >> 2;
		arg10.anInt4100 = local3 << 8;
		return local51 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([B[IIIIIIIILclient!pc;)I")
	public static int method3378(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class4_Sub6_Sub4 arg8) {
		@Pc(3) int local3 = arg2 >> 8;
		arg7 >>= 8;
		@Pc(11) int local11 = arg4 << 2;
		arg5 <<= 2;
		@Pc(22) int local22;
		if ((local22 = arg3 + arg7 - local3) > arg6) {
			local22 = arg6;
		}
		arg8.anInt4104 += arg8.anInt4102 * (local22 - arg3);
		arg8.anInt4098 += arg8.anInt4099 * (local22 - arg3);
		@Pc(49) int local49 = local22 - 3;
		while (arg3 < local49) {
			@Pc(55) int local55 = arg3 + 1;
			@Pc(57) int local57 = arg1[arg3];
			arg2 = local3 + 1;
			arg1[arg3] = local57 + arg0[local3] * local11;
			arg4 = local11 + arg5;
			@Pc(71) int local71 = local55++;
			arg1[local71] += arg0[arg2++] * arg4;
			arg4 += arg5;
			local71 = local55++;
			arg1[local71] += arg0[arg2++] * arg4;
			arg4 += arg5;
			arg3 = local55 + 1;
			local57 = arg1[local55];
			local3 = arg2 + 1;
			arg1[local55] = local57 + arg0[arg2] * arg4;
			local11 = arg4 + arg5;
		}
		@Pc(122) int local122 = local49 + 3;
		while (arg3 < local122) {
			@Pc(127) int local127 = arg3++;
			arg1[local127] += arg0[local3++] * local11;
			local11 += arg5;
		}
		arg8.anInt4096 = local11 >> 2;
		arg8.anInt4100 = local3 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([B[IIIIIIILclient!pc;)I")
	public static int method3380(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class4_Sub6_Sub4 arg7) {
		@Pc(3) int local3 = arg2 >> 8;
		arg6 >>= 8;
		arg4 <<= 2;
		@Pc(20) int local20;
		if ((local20 = arg3 + local3 + 1 - arg6) > arg5) {
			local20 = arg5;
		}
		@Pc(25) int local25 = local20 - 3;
		while (arg3 < local25) {
			@Pc(31) int local31 = arg3 + 1;
			@Pc(33) int local33 = arg1[arg3];
			arg2 = local3 - 1;
			arg1[arg3] = local33 + arg0[local3] * arg4;
			@Pc(43) int local43 = local31++;
			arg1[local43] += arg0[arg2--] * arg4;
			local43 = local31++;
			arg1[local43] += arg0[arg2--] * arg4;
			arg3 = local31 + 1;
			local33 = arg1[local31];
			local3 = arg2 - 1;
			arg1[local31] = local33 + arg0[arg2] * arg4;
		}
		@Pc(82) int local82 = local25 + 3;
		while (arg3 < local82) {
			@Pc(87) int local87 = arg3++;
			arg1[local87] += arg0[local3--] * arg4;
		}
		arg7.anInt4100 = local3 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!pb;III)Lclient!pc;")
	public static Class4_Sub6_Sub4 method3384(@OriginalArg(0) Class4_Sub8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg0.aByteArray52 == null || arg0.aByteArray52.length == 0 ? null : new Class4_Sub6_Sub4(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!pb;II)Lclient!pc;")
	public static Class4_Sub6_Sub4 method3385(@OriginalArg(0) Class4_Sub8_Sub1 arg0, @OriginalArg(2) int arg1) {
		return arg0.aByteArray52 == null || arg0.aByteArray52.length == 0 ? null : new Class4_Sub6_Sub4(arg0, (int) ((long) arg0.anInt4085 * 256L * (long) 100 / (long) (Static7.sampleRate * 100)), arg1 << 6);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I[B[IIIIIIIILclient!pc;)I")
	public static int method3387(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class4_Sub6_Sub4 arg8) {
		@Pc(3) int local3 = arg2 >> 8;
		arg7 >>= 8;
		arg4 <<= 2;
		arg5 <<= 2;
		@Pc(24) int local24;
		if ((local24 = arg3 + local3 + 1 - arg7) > arg6) {
			local24 = arg6;
		}
		@Pc(32) int local32 = arg3 << 1;
		@Pc(36) int local36 = local24 << 1;
		local36 -= 6;
		while (local32 < local36) {
			arg2 = local3 - 1;
			@Pc(45) byte local45 = arg0[local3];
			arg3 = local32 + 1;
			arg1[local32] += local45 * arg4;
			@Pc(57) int local57 = arg3++;
			arg1[local57] += local45 * arg5;
			local45 = arg0[arg2--];
			local57 = arg3++;
			arg1[local57] += local45 * arg4;
			local57 = arg3++;
			arg1[local57] += local45 * arg5;
			local45 = arg0[arg2--];
			local57 = arg3++;
			arg1[local57] += local45 * arg4;
			local57 = arg3++;
			arg1[local57] += local45 * arg5;
			local3 = arg2 - 1;
			local45 = arg0[arg2];
			local57 = arg3++;
			arg1[local57] += local45 * arg4;
			local32 = arg3 + 1;
			arg1[arg3] += local45 * arg5;
		}
		@Pc(142) int local142 = local36 + 6;
		while (local32 < local142) {
			@Pc(150) byte local150 = arg0[local3--];
			arg3 = local32 + 1;
			arg1[local32] += local150 * arg4;
			local32 = arg3 + 1;
			arg1[arg3] += local150 * arg5;
		}
		arg8.anInt4100 = local3 << 8;
		return local32 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([B[IIIIIIIILclient!pc;)I")
	public static int method3389(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class4_Sub6_Sub4 arg8) {
		@Pc(3) int local3 = arg2 >> 8;
		arg7 >>= 8;
		@Pc(11) int local11 = arg4 << 2;
		arg5 <<= 2;
		@Pc(24) int local24;
		if ((local24 = arg3 + local3 + 1 - arg7) > arg6) {
			local24 = arg6;
		}
		arg8.anInt4104 += arg8.anInt4102 * (local24 - arg3);
		arg8.anInt4098 += arg8.anInt4099 * (local24 - arg3);
		@Pc(51) int local51 = local24 - 3;
		while (arg3 < local51) {
			@Pc(57) int local57 = arg3 + 1;
			@Pc(59) int local59 = arg1[arg3];
			arg2 = local3 - 1;
			arg1[arg3] = local59 + arg0[local3] * local11;
			arg4 = local11 + arg5;
			@Pc(73) int local73 = local57++;
			arg1[local73] += arg0[arg2--] * arg4;
			arg4 += arg5;
			local73 = local57++;
			arg1[local73] += arg0[arg2--] * arg4;
			arg4 += arg5;
			arg3 = local57 + 1;
			local59 = arg1[local57];
			local3 = arg2 - 1;
			arg1[local57] = local59 + arg0[arg2] * arg4;
			local11 = arg4 + arg5;
		}
		@Pc(124) int local124 = local51 + 3;
		while (arg3 < local124) {
			@Pc(129) int local129 = arg3++;
			arg1[local129] += arg0[local3--] * local11;
			local11 += arg5;
		}
		arg8.anInt4096 = local11 >> 2;
		arg8.anInt4100 = local3 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(II[B[IIIIIIIILclient!pc;II)I")
	public static int method3390(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) Class4_Sub6_Sub4 arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		arg8.anInt4104 -= arg8.anInt4102 * arg3;
		arg8.anInt4098 -= arg8.anInt4099 * arg3;
		@Pc(32) int local32;
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 + 256 - arg2) / arg9) > arg6) {
			local32 = arg6;
		}
		while (arg3 < local32) {
			@Pc(43) int local43 = arg2 >> 8;
			@Pc(49) byte local49 = arg0[local43 - 1];
			@Pc(51) int local51 = arg3++;
			arg1[local51] += ((local49 << 8) + (arg0[local43] - local49) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 - arg2) / arg9) > arg6) {
			local32 = arg6;
		}
		while (arg3 < local32) {
			@Pc(108) int local108 = arg3++;
			arg1[local108] += ((arg10 << 8) + (arg0[arg2 >> 8] - arg10) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		arg8.anInt4104 += arg8.anInt4102 * arg3;
		arg8.anInt4098 += arg8.anInt4099 * arg3;
		arg8.anInt4096 = arg4;
		arg8.anInt4100 = arg2;
		return arg3;
	}
}

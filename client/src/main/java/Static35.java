import java.io.IOException;
import java.net.Socket;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(B)V")
	public static void method4296() {
		Static6.aClass26_54.method515();
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	public static void method4298() {
		for (@Pc(3) int local3 = 0; local3 < Static6.anInt4760; local3++) {
			@Pc(10) int local10 = Static7.anIntArray587[local3];
			@Pc(14) Class53_Sub1_Sub2 local14 = Static3.aClass53_Sub1_Sub2Array1[local10];
			@Pc(18) int local18 = Static5.aClass4_Sub10_Sub1_2.method4629();
			if ((local18 & 0x1) != 0) {
				local18 += Static5.aClass4_Sub10_Sub1_2.method4629() << 8;
			}
			if ((local18 & 0x40) != 0) {
				@Pc(43) int local43 = Static5.aClass4_Sub10_Sub1_2.method4589();
				@Pc(49) int local49 = Static5.aClass4_Sub10_Sub1_2.method4605();
				local14.method3304(Static2.anInt954, local49, local43);
				local14.anInt3993 = Static2.anInt954 + 300;
				local14.anInt4022 = Static5.aClass4_Sub10_Sub1_2.method4589();
			}
			if ((local18 & 0x100) != 0) {
				@Pc(74) int local74 = Static5.aClass4_Sub10_Sub1_2.method4623();
				@Pc(77) int[] local77 = new int[local74];
				@Pc(80) int[] local80 = new int[local74];
				@Pc(83) int[] local83 = new int[local74];
				for (@Pc(85) int local85 = 0; local85 < local74; local85++) {
					@Pc(96) int local96 = Static5.aClass4_Sub10_Sub1_2.method4635();
					if (local96 == 65535) {
						local96 = -1;
					}
					local83[local85] = local96;
					local77[local85] = Static5.aClass4_Sub10_Sub1_2.method4589();
					local80[local85] = Static5.aClass4_Sub10_Sub1_2.method4588();
				}
				Static11.method555(local83, local14, local80, local77);
			}
			if ((local18 & 0x10) != 0) {
				@Pc(141) int local141 = Static5.aClass4_Sub10_Sub1_2.method4623();
				@Pc(145) int local145 = Static5.aClass4_Sub10_Sub1_2.method4605();
				local14.method3304(Static2.anInt954, local145, local141);
			}
			if ((local18 & 0x2) != 0) {
				if (local14.aClass168_1.method4260()) {
					Static25.method2931(local14);
				}
				local14.method3317(Static15.method1495(Static5.aClass4_Sub10_Sub1_2.method4630()));
				local14.method3316(local14.aClass168_1.anInt5262);
				local14.anInt4009 = local14.aClass168_1.anInt5243;
				local14.anInt3986 = local14.aClass168_1.anInt5261;
				if (local14.aClass168_1.method4260()) {
					Static8.method109(null, local14.anIntArray422[0], local14, local14.anIntArray426[0], null, 0, Static7.anInt5334);
				}
			}
			if ((local18 & 0x200) != 0) {
				local14.anInt4014 = Static5.aClass4_Sub10_Sub1_2.method4588();
				local14.anInt4003 = Static5.aClass4_Sub10_Sub1_2.method4616();
			}
			if ((local18 & 0x20) != 0) {
				@Pc(238) int local238 = Static5.aClass4_Sub10_Sub1_2.method4616();
				if (local238 == 65535) {
					local238 = -1;
				}
				@Pc(250) int local250 = Static5.aClass4_Sub10_Sub1_2.method4605();
				Static11.method529(local238, local14, local250);
			}
			if ((local18 & 0x4) != 0) {
				@Pc(266) int local266 = Static5.aClass4_Sub10_Sub1_2.method4630();
				@Pc(270) int local270 = Static5.aClass4_Sub10_Sub1_2.method4595();
				@Pc(272) boolean local272 = true;
				if (local266 == 65535) {
					local266 = -1;
				}
				if (local266 != -1 && local14.anInt3961 != -1 && Static23.method2494(Static21.method2004(local266).anInt3134).anInt1243 < Static23.method2494(Static21.method2004(local14.anInt3961).anInt3134).anInt1243) {
					local272 = false;
				}
				if (local272) {
					local14.anInt3968 = 0;
					local14.anInt4026 = 0;
					local14.anInt3976 = 1;
					local14.anInt3984 = (local270 & 0xFFFF) + Static2.anInt954;
					if (local14.anInt3984 > Static2.anInt954) {
						local14.anInt4026 = -1;
					}
					local14.anInt3971 = local270 >> 16;
					local14.anInt3961 = local266;
					if (local14.anInt3961 != -1 && Static2.anInt954 == local14.anInt3984) {
						@Pc(358) int local358 = Static21.method2004(local14.anInt3961).anInt3134;
						if (local358 != -1) {
							@Pc(365) Class46 local365 = Static23.method2494(local358);
							if (local365 != null && local365.anIntArray95 != null) {
								Static29.method3461(local365, local14.anInt4002, local14.anInt3974, 0, false);
							}
						}
					}
				}
			}
			if ((local18 & 0x8) != 0) {
				local14.anInt3985 = Static5.aClass4_Sub10_Sub1_2.method4635();
				if (local14.anInt3985 == 65535) {
					local14.anInt3985 = -1;
				}
			}
			if ((local18 & 0x80) != 0) {
				local14.aString234 = Static5.aClass4_Sub10_Sub1_2.method4593();
				local14.anInt4023 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I")
	public static int method4299(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method4300(@OriginalArg(1) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(JB)V")
	public static void method4304(@OriginalArg(0) long arg0) {
		if (Static1.anInt772 == 1 || Static1.anInt772 == 5) {
			Static12.method641(arg0);
		} else if (Static1.anInt772 == 2) {
			Static23.method2537();
		} else {
			Static16.method1496();
		}
		if (!Static1.aBoolean17) {
			if (Static2.anInt1940 != 0) {
				Static4.anInt3341 = Static4.anInt2663;
				Static5.anInt5848 = Static1.anInt891;
			} else if (Static6.anInt4802 == 0) {
				Static5.anInt5848 = Static7.anInt6038;
				Static4.anInt3341 = Static7.anInt5357;
			} else {
				Static5.anInt5848 = Static7.anInt5312;
				Static4.anInt3341 = Static2.anInt1797;
			}
			Static6.aShortArray100[0] = 1006;
			Static6.aStringArray30[0] = Static6.aString296;
			Static6.aStringArray27[0] = "";
			Static7.anInt5634 = 1;
			Static2.anIntArray160[0] = Static7.anInt6050;
		}
		Static26.method2964((long) Static2.anInt954);
		if (Static3.anInt5398 != -1) {
			Static27.method4243(Static3.anInt5398);
		}
		for (@Pc(80) int local80 = 0; local80 < Static1.anInt113; local80++) {
			if (Static2.aBooleanArray8[local80]) {
				Static6.aBooleanArray24[local80] = true;
			}
			Static1.aBooleanArray2[local80] = Static2.aBooleanArray8[local80];
			Static2.aBooleanArray8[local80] = false;
		}
		Static7.aClass185_15 = null;
		Static3.anInt2522 = Static2.anInt954;
		Static3.anInt2047 = -1;
		Static6.anInt4679 = -1;
		Static6.aClass185_13 = null;
		if (Static3.aBoolean138) {
			Static7.aBoolean123 = true;
		}
		if (Static3.anInt5398 != -1) {
			Static1.anInt113 = 0;
			Static16.method1563();
		}
		if (Static3.aBoolean138) {
			Static18.method1698();
		} else {
			Static34.method4229();
		}
		Static21.method2054();
		if (Static1.aBoolean17) {
			if (Static7.aBoolean389) {
				Static25.method2811();
			} else {
				Static15.method1479();
			}
		} else if (Static7.aClass185_15 != null) {
			Static21.method2008(Static1.anInt127, Static7.aClass185_15, Static4.anInt2643);
		} else if (Static3.anInt2047 != -1) {
			Static21.method2008(Static3.anInt2047, null, Static6.anInt4679);
		}
		@Pc(174) int local174 = Static1.aBoolean17 ? -1 : Static37.method4663();
		if (local174 == -1) {
			local174 = Static4.anInt3407;
		}
		Static13.method966(local174);
		if (Static6.anInt4946 == 1) {
			Static6.anInt4946 = 2;
		}
		if (Static2.anInt1767 == 1) {
			Static2.anInt1767 = 2;
		}
		if (Static1.anInt268 == 3) {
			for (@Pc(211) int local211 = 0; local211 < Static1.anInt113; local211++) {
				if (Static1.aBooleanArray2[local211]) {
					if (Static3.aBoolean138) {
						Static18.method1691(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711935, 128);
					} else {
						Static34.method4213(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711935, 128);
					}
				} else if (Static6.aBooleanArray24[local211]) {
					if (Static3.aBoolean138) {
						Static18.method1691(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711680, 128);
					} else {
						Static34.method4213(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711680, 128);
					}
				}
			}
		}
		Static20.method1963(Static7.anInt5334, Static4.aClass53_Sub1_Sub1_2.anInt4002, Static4.aClass53_Sub1_Sub1_2.anInt3974, Static5.anInt4156);
		Static5.anInt4156 = 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method4306() {
		if (Static3.anInt2554 != -1) {
			Static24.method2947(false, -1, -1, Static3.anInt2554);
			Static3.anInt2554 = -1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method4308() {
		for (@Pc(13) int local13 = 0; local13 < Static6.anInt4760; local13++) {
			@Pc(24) int local24 = Static7.anIntArray587[local13];
			@Pc(28) Class53_Sub1_Sub1 local28 = Static5.aClass53_Sub1_Sub1Array1[local24];
			@Pc(32) int local32 = Static5.aClass4_Sub10_Sub1_2.method4629();
			if ((local32 & 0x80) != 0) {
				local32 += Static5.aClass4_Sub10_Sub1_2.method4629() << 8;
			}
			Static30.method3565(local24, local32, local28);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!wf;BIII)V")
	public static void method4309(@OriginalArg(0) Class185 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static3.aBoolean138) {
			Static18.method1693(arg3, arg1, arg0.anInt5893 + arg3, arg1 + arg0.anInt5949);
		}
		if (Static5.anInt5206 >= 3) {
			if (Static3.aBoolean138) {
				@Pc(41) Class4_Sub3_Sub14 local41 = arg0.method4729(false);
				if (local41 != null) {
					local41.method4506(arg3, arg1);
				}
			} else {
				Static34.method4210(arg3, arg1, arg0.anIntArray672, arg0.anIntArray657);
			}
		} else if (Static3.aBoolean138) {
			((Class4_Sub3_Sub14_Sub2) Static6.aClass4_Sub3_Sub14_6).method4519(arg3, arg1, arg0.anInt5893, arg0.anInt5949, Static6.aClass4_Sub3_Sub14_6.anInt5609 / 2, Static6.aClass4_Sub3_Sub14_6.anInt5608 / 2, (int) Static5.aFloat97, 256, (Class4_Sub3_Sub14_Sub2) arg0.method4729(false));
		} else {
			((Class4_Sub3_Sub14_Sub1) Static6.aClass4_Sub3_Sub14_6).method2165(arg3, arg1, arg0.anInt5893, arg0.anInt5949, Static6.aClass4_Sub3_Sub14_6.anInt5609 / 2, Static6.aClass4_Sub3_Sub14_6.anInt5608 / 2, (int) Static5.aFloat97, arg0.anIntArray672, arg0.anIntArray657);
		}
		Static6.aBooleanArray24[arg2] = true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V")
	public static void method664(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static2.anIntArray117[arg0];
		@Pc(19) int local19 = Static6.anIntArray543[arg0];
		@Pc(24) int local24 = (int) Static4.aLongArray56[arg0];
		@Pc(28) int local28 = Static6.aShortArray100[arg0];
		@Pc(32) long local32 = Static4.aLongArray56[arg0];
		if (local28 >= 2000) {
			local28 -= 2000;
		}
		if (local28 == 24) {
			@Pc(46) Class53_Sub1_Sub1 local46 = Static5.aClass53_Sub1_Sub1Array1[local24];
			if (local46 != null) {
				Static6.anInt5177 = Static2.anInt1797;
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Static7.anInt5312;
				Static3.aClass4_Sub10_Sub1_1.method4650(52);
				Static3.aClass4_Sub10_Sub1_1.method4631(local24);
				Static3.aClass4_Sub10_Sub1_1.method4581(Static2.aBooleanArray4[82] ? 1 : 0);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local46.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local46.method3311(), local15);
			}
		}
		if (local28 == 17) {
			Static3.aClass4_Sub10_Sub1_1.method4650(95);
			Static3.aClass4_Sub10_Sub1_1.method4631(local24);
			Static3.aClass4_Sub10_Sub1_1.method4584(local19);
			Static3.aClass4_Sub10_Sub1_1.method4636(local15);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 33) {
			@Pc(146) Class53_Sub1_Sub2 local146 = Static3.aClass53_Sub1_Sub2Array1[local24];
			if (local146 != null) {
				Static6.anInt5177 = Static2.anInt1797;
				Static7.anInt6008 = 2;
				Static4.anInt3275 = Static7.anInt5312;
				Static2.anInt1629 = 0;
				Static3.aClass4_Sub10_Sub1_1.method4650(160);
				Static3.aClass4_Sub10_Sub1_1.method4578(Static2.aBooleanArray4[82] ? 1 : 0);
				Static3.aClass4_Sub10_Sub1_1.method4624(Static5.anInt4302);
				Static3.aClass4_Sub10_Sub1_1.method4613(local24);
				Static3.aClass4_Sub10_Sub1_1.method4631(Static1.anInt314);
				Static3.aClass4_Sub10_Sub1_1.method4636(Static1.anInt243);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local146.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local146.method3311(), local15);
			}
		}
		if (local28 == 40) {
			Static4.anInt3275 = Static7.anInt5312;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Static2.anInt1797;
			Static2.anInt1629 = 0;
			Static3.aClass4_Sub10_Sub1_1.method4650(134);
			Static3.aClass4_Sub10_Sub1_1.method4586(Static2.aBooleanArray4[82] ? 1 : 0);
			Static3.aClass4_Sub10_Sub1_1.method4614(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static3.aClass4_Sub10_Sub1_1.method4614(Static7.anInt5479 + local19);
			Static3.aClass4_Sub10_Sub1_1.method4636(Static5.anInt3983 + local15);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 46) {
			Static2.anInt1629 = 0;
			Static6.anInt5177 = Static2.anInt1797;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Static7.anInt5312;
			Static3.aClass4_Sub10_Sub1_1.method4650(227);
			Static3.aClass4_Sub10_Sub1_1.method4631(local15 + Static5.anInt3983);
			Static3.aClass4_Sub10_Sub1_1.method4581(Static2.aBooleanArray4[82] ? 1 : 0);
			Static3.aClass4_Sub10_Sub1_1.method4631(Static7.anInt5479 + local19);
			Static3.aClass4_Sub10_Sub1_1.method4636(local24);
			Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 21) {
			@Pc(346) Class53_Sub1_Sub1 local346 = Static5.aClass53_Sub1_Sub1Array1[local24];
			if (local346 != null) {
				Static4.anInt3275 = Static7.anInt5312;
				Static6.anInt5177 = Static2.anInt1797;
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static3.aClass4_Sub10_Sub1_1.method4650(123);
				Static3.aClass4_Sub10_Sub1_1.method4636(local24);
				Static3.aClass4_Sub10_Sub1_1.method4617(Static5.anInt4302);
				Static3.aClass4_Sub10_Sub1_1.method4614(Static1.anInt314);
				Static3.aClass4_Sub10_Sub1_1.method4586(Static2.aBooleanArray4[82] ? 1 : 0);
				Static3.aClass4_Sub10_Sub1_1.method4636(Static1.anInt243);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local346.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local346.method3311(), local15);
			}
		}
		if (local28 == 1004) {
			Static4.anInt3275 = Static7.anInt5312;
			Static6.anInt5177 = Static2.anInt1797;
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static3.aClass4_Sub10_Sub1_1.method4650(72);
			Static3.aClass4_Sub10_Sub1_1.method4631(local24);
		}
		if (local28 == 19) {
			if (local24 == 0) {
				Static2.anInt1767 = 1;
				Static27.method3186(Static7.anInt5334, local15, local19);
			} else if (local24 == 1) {
				Static3.aClass4_Sub10_Sub1_1.method4650(204);
				Static3.aClass4_Sub10_Sub1_1.method4614(local19 + Static7.anInt5479);
				Static3.aClass4_Sub10_Sub1_1.method4614(Static2.anInt1367);
				Static3.aClass4_Sub10_Sub1_1.method4584(Static1.anInt1053);
				Static3.aClass4_Sub10_Sub1_1.method4613(local15 + Static5.anInt3983);
			}
		}
		if (local28 == 28) {
			Static4.anInt3275 = Static7.anInt5312;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Static2.anInt1797;
			Static2.anInt1629 = 0;
			Static3.aClass4_Sub10_Sub1_1.method4650(119);
			Static3.aClass4_Sub10_Sub1_1.method4584(Static5.anInt4302);
			Static3.aClass4_Sub10_Sub1_1.method4631(Static7.anInt5479 + local19);
			Static3.aClass4_Sub10_Sub1_1.method4614(Static1.anInt243);
			Static3.aClass4_Sub10_Sub1_1.method4613(Static1.anInt314);
			Static3.aClass4_Sub10_Sub1_1.method4636(local24);
			Static3.aClass4_Sub10_Sub1_1.method4613(Static5.anInt3983 + local15);
			Static3.aClass4_Sub10_Sub1_1.method4586(Static2.aBooleanArray4[82] ? 1 : 0);
			Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 36) {
			@Pc(582) Class53_Sub1_Sub2 local582 = Static3.aClass53_Sub1_Sub2Array1[local24];
			if (local582 != null) {
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Static2.anInt1797;
				Static4.anInt3275 = Static7.anInt5312;
				Static3.aClass4_Sub10_Sub1_1.method4650(37);
				Static3.aClass4_Sub10_Sub1_1.method4581(Static2.aBooleanArray4[82] ? 1 : 0);
				Static3.aClass4_Sub10_Sub1_1.method4636(local24);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local582.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local582.method3311(), local15);
			}
		}
		if (local28 == 12) {
			@Pc(649) Class53_Sub1_Sub1 local649 = Static5.aClass53_Sub1_Sub1Array1[local24];
			if (local649 != null) {
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Static2.anInt1797;
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Static7.anInt5312;
				Static3.aClass4_Sub10_Sub1_1.method4650(4);
				Static3.aClass4_Sub10_Sub1_1.method4581(Static2.aBooleanArray4[82] ? 1 : 0);
				Static3.aClass4_Sub10_Sub1_1.method4614(local24);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local649.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local649.method3311(), local15);
			}
		}
		if (local28 == 10) {
			Static3.aClass4_Sub10_Sub1_1.method4650(102);
			Static3.aClass4_Sub10_Sub1_1.method4617(local19);
			Static3.aClass4_Sub10_Sub1_1.method4614(local15);
			Static3.aClass4_Sub10_Sub1_1.method4631(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 25) {
			@Pc(744) Class53_Sub1_Sub2 local744 = Static3.aClass53_Sub1_Sub2Array1[local24];
			if (local744 != null) {
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Static7.anInt5312;
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Static2.anInt1797;
				Static3.aClass4_Sub10_Sub1_1.method4650(33);
				Static3.aClass4_Sub10_Sub1_1.method4636(local24);
				Static3.aClass4_Sub10_Sub1_1.method4611(Static2.aBooleanArray4[82] ? 1 : 0);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local744.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local744.method3311(), local15);
			}
		}
		if (local28 == 1007) {
			Static6.anInt5177 = Static2.anInt1797;
			Static2.anInt1629 = 0;
			Static4.anInt3275 = Static7.anInt5312;
			Static7.anInt6008 = 2;
			Static3.aClass4_Sub10_Sub1_1.method4650(176);
			Static3.aClass4_Sub10_Sub1_1.method4631(local24);
		}
		if (local28 == 4) {
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Static7.anInt5312;
			Static2.anInt1629 = 0;
			Static6.anInt5177 = Static2.anInt1797;
			Static3.aClass4_Sub10_Sub1_1.method4650(89);
			Static3.aClass4_Sub10_Sub1_1.method4631((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static3.aClass4_Sub10_Sub1_1.method4578(Static2.aBooleanArray4[82] ? 1 : 0);
			Static3.aClass4_Sub10_Sub1_1.method4636(Static5.anInt3983 + local15);
			Static3.aClass4_Sub10_Sub1_1.method4613(Static2.anInt1367);
			Static3.aClass4_Sub10_Sub1_1.method4631(Static7.anInt5479 + local19);
			Static3.aClass4_Sub10_Sub1_1.method4584(Static1.anInt1053);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 6) {
			Static6.anInt5177 = Static2.anInt1797;
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Static7.anInt5312;
			Static3.aClass4_Sub10_Sub1_1.method4650(232);
			Static3.aClass4_Sub10_Sub1_1.method4613(local19 + Static7.anInt5479);
			Static3.aClass4_Sub10_Sub1_1.method4636(local24);
			Static3.aClass4_Sub10_Sub1_1.method4611(Static2.aBooleanArray4[82] ? 1 : 0);
			Static3.aClass4_Sub10_Sub1_1.method4613(local15 + Static5.anInt3983);
			Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 42) {
			@Pc(969) Class53_Sub1_Sub2 local969 = Static3.aClass53_Sub1_Sub2Array1[local24];
			if (local969 != null) {
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Static2.anInt1797;
				Static4.anInt3275 = Static7.anInt5312;
				Static7.anInt6008 = 2;
				Static3.aClass4_Sub10_Sub1_1.method4650(155);
				Static3.aClass4_Sub10_Sub1_1.method4614(local24);
				Static3.aClass4_Sub10_Sub1_1.method4578(Static2.aBooleanArray4[82] ? 1 : 0);
				Static3.aClass4_Sub10_Sub1_1.method4631(Static2.anInt1367);
				Static3.aClass4_Sub10_Sub1_1.method4584(Static1.anInt1053);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local969.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local969.method3311(), local15);
			}
		}
		if (local28 == 31) {
			@Pc(1044) Class53_Sub1_Sub1 local1044 = Static5.aClass53_Sub1_Sub1Array1[local24];
			if (local1044 != null) {
				Static4.anInt3275 = Static7.anInt5312;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Static2.anInt1797;
				Static7.anInt6008 = 2;
				Static3.aClass4_Sub10_Sub1_1.method4650(105);
				Static3.aClass4_Sub10_Sub1_1.method4631(local24);
				Static3.aClass4_Sub10_Sub1_1.method4581(Static2.aBooleanArray4[82] ? 1 : 0);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local1044.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local1044.method3311(), local15);
			}
		}
		if (local28 == 47) {
			if (local24 == 0) {
				Static6.anInt4946 = 1;
				Static27.method3186(Static7.anInt5334, local15, local19);
			} else if (Static3.anInt2576 > 0 && Static2.aBooleanArray4[82] && Static2.aBooleanArray4[81]) {
				Static24.method2945(Static5.anInt3983 + local15, Static7.anInt5479 + local19, Static7.anInt5334);
			} else {
				Static3.aClass4_Sub10_Sub1_1.method4650(85);
				Static3.aClass4_Sub10_Sub1_1.method4636(Static5.anInt3983 + local15);
				Static3.aClass4_Sub10_Sub1_1.method4613(Static7.anInt5479 + local19);
			}
		}
		if (local28 == 59) {
			@Pc(1170) Class53_Sub1_Sub2 local1170 = Static3.aClass53_Sub1_Sub2Array1[local24];
			if (local1170 != null) {
				Static4.anInt3275 = Static7.anInt5312;
				Static6.anInt5177 = Static2.anInt1797;
				Static2.anInt1629 = 0;
				Static7.anInt6008 = 2;
				Static3.aClass4_Sub10_Sub1_1.method4650(53);
				Static3.aClass4_Sub10_Sub1_1.method4636(local24);
				Static3.aClass4_Sub10_Sub1_1.method4586(Static2.aBooleanArray4[82] ? 1 : 0);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local1170.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local1170.method3311(), local15);
			}
		}
		if (local28 == 51) {
			Static3.aClass4_Sub10_Sub1_1.method4650(88);
			Static3.aClass4_Sub10_Sub1_1.method4636(local24);
			Static3.aClass4_Sub10_Sub1_1.method4591(local19);
			Static3.aClass4_Sub10_Sub1_1.method4636(local15);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 13) {
			Static3.aClass4_Sub10_Sub1_1.method4650(242);
			Static3.aClass4_Sub10_Sub1_1.method4636(local15);
			Static3.aClass4_Sub10_Sub1_1.method4636(local24);
			Static3.aClass4_Sub10_Sub1_1.method4591(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 3 && Static6.aClass185_14 == null) {
			Static37.method4736(local15, local19);
			Static6.aClass185_14 = Static23.method2425(local19, local15);
			Static28.method3270(Static6.aClass185_14);
		}
		if (local28 == 1) {
			Static3.aClass4_Sub10_Sub1_1.method4650(40);
			Static3.aClass4_Sub10_Sub1_1.method4591(local19);
			Static3.aClass4_Sub10_Sub1_1.method4631(Static2.anInt1367);
			Static3.aClass4_Sub10_Sub1_1.method4613(local15);
			Static3.aClass4_Sub10_Sub1_1.method4617(Static1.anInt1053);
		}
		if (local28 == 29) {
			@Pc(1354) Class53_Sub1_Sub1 local1354 = Static5.aClass53_Sub1_Sub1Array1[local24];
			if (local1354 != null) {
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Static7.anInt5312;
				Static6.anInt5177 = Static2.anInt1797;
				Static7.anInt6008 = 2;
				Static3.aClass4_Sub10_Sub1_1.method4650(148);
				Static3.aClass4_Sub10_Sub1_1.method4614(local24);
				Static3.aClass4_Sub10_Sub1_1.method4611(Static2.aBooleanArray4[82] ? 1 : 0);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local1354.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local1354.method3311(), local15);
			}
		}
		if (local28 == 11) {
			Static3.aClass4_Sub10_Sub1_1.method4650(158);
			Static3.aClass4_Sub10_Sub1_1.method4617(local19);
			@Pc(1434) Class185 local1434 = Static19.method1813(local19);
			if (local1434.anIntArrayArray50 != null && local1434.anIntArrayArray50[0][0] == 5) {
				@Pc(1452) int local1452 = local1434.anIntArrayArray50[0][1];
				if (local1434.anIntArray671[0] != Static1.anIntArray2[local1452]) {
					Static1.anIntArray2[local1452] = local1434.anIntArray671[0];
					Static29.method3534(local1452);
				}
			}
		}
		if (local28 == 32) {
			Static6.anInt5177 = Static2.anInt1797;
			Static7.anInt6008 = 2;
			Static2.anInt1629 = 0;
			Static4.anInt3275 = Static7.anInt5312;
			Static3.aClass4_Sub10_Sub1_1.method4650(159);
			Static3.aClass4_Sub10_Sub1_1.method4636(local15 + Static5.anInt3983);
			Static3.aClass4_Sub10_Sub1_1.method4631(Static7.anInt5479 + local19);
			Static3.aClass4_Sub10_Sub1_1.method4581(Static2.aBooleanArray4[82] ? 1 : 0);
			Static3.aClass4_Sub10_Sub1_1.method4636((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 39) {
			@Pc(1545) Class53_Sub1_Sub2 local1545 = Static3.aClass53_Sub1_Sub2Array1[local24];
			if (local1545 != null) {
				Static6.anInt5177 = Static2.anInt1797;
				Static4.anInt3275 = Static7.anInt5312;
				Static2.anInt1629 = 0;
				Static7.anInt6008 = 2;
				Static3.aClass4_Sub10_Sub1_1.method4650(245);
				Static3.aClass4_Sub10_Sub1_1.method4631(local24);
				Static3.aClass4_Sub10_Sub1_1.method4586(Static2.aBooleanArray4[82] ? 1 : 0);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local1545.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local1545.method3311(), local15);
			}
		}
		if (local28 == 15) {
			Static3.aClass4_Sub10_Sub1_1.method4650(58);
			Static3.aClass4_Sub10_Sub1_1.method4631(local24);
			Static3.aClass4_Sub10_Sub1_1.method4584(local19);
			Static3.aClass4_Sub10_Sub1_1.method4631(Static1.anInt314);
			Static3.aClass4_Sub10_Sub1_1.method4631(local15);
			Static3.aClass4_Sub10_Sub1_1.method4614(Static1.anInt243);
			Static3.aClass4_Sub10_Sub1_1.method4584(Static5.anInt4302);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 57) {
			@Pc(1660) Class185 local1660 = Static19.method1813(local19);
			@Pc(1662) boolean local1662 = true;
			if (local1660.anInt5904 > 0) {
				local1662 = Static36.method4402(local1660);
			}
			if (local1662) {
				Static3.aClass4_Sub10_Sub1_1.method4650(158);
				Static3.aClass4_Sub10_Sub1_1.method4617(local19);
			}
		}
		if (local28 == 30) {
			Static3.aClass4_Sub10_Sub1_1.method4650(81);
			Static3.aClass4_Sub10_Sub1_1.method4613(local15);
			Static3.aClass4_Sub10_Sub1_1.method4636(local24);
			Static3.aClass4_Sub10_Sub1_1.method4624(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 14) {
			@Pc(1728) Class53_Sub1_Sub1 local1728 = Static5.aClass53_Sub1_Sub1Array1[local24];
			if (local1728 != null) {
				Static7.anInt6008 = 2;
				Static4.anInt3275 = Static7.anInt5312;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Static2.anInt1797;
				Static3.aClass4_Sub10_Sub1_1.method4650(77);
				Static3.aClass4_Sub10_Sub1_1.method4613(local24);
				Static3.aClass4_Sub10_Sub1_1.method4586(Static2.aBooleanArray4[82] ? 1 : 0);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local1728.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local1728.method3311(), local15);
			}
		}
		if (local28 == 26) {
			if (local24 == 0) {
				Static27.method3186(Static7.anInt5334, local15, local19);
			} else if (local24 == 1) {
				if (Static3.anInt2576 > 0 && Static2.aBooleanArray4[82] && Static2.aBooleanArray4[81]) {
					Static24.method2945(local15 + Static5.anInt3983, local19 + Static7.anInt5479, Static7.anInt5334);
				} else {
					Static37.method4661(local15, 1, local19);
					Static3.aClass4_Sub10_Sub1_1.method4581(Static2.anInt1941);
					Static3.aClass4_Sub10_Sub1_1.method4581(Static7.anInt5798);
					Static3.aClass4_Sub10_Sub1_1.method4631((int) Static5.aFloat97);
					Static3.aClass4_Sub10_Sub1_1.method4581(57);
					Static3.aClass4_Sub10_Sub1_1.method4581(Static6.anInt3585);
					Static3.aClass4_Sub10_Sub1_1.method4581(Static6.anInt4761);
					Static3.aClass4_Sub10_Sub1_1.method4581(89);
					Static3.aClass4_Sub10_Sub1_1.method4631(Static4.aClass53_Sub1_Sub1_2.anInt3974);
					Static3.aClass4_Sub10_Sub1_1.method4631(Static4.aClass53_Sub1_Sub1_2.anInt4002);
					Static3.aClass4_Sub10_Sub1_1.method4581(Static2.anInt946);
					Static3.aClass4_Sub10_Sub1_1.method4581(63);
					Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
				}
			}
		}
		if (local28 == 9) {
			Static26.method4812();
			@Pc(1913) Class185 local1913 = Static19.method1813(local19);
			Static1.anInt314 = local15;
			Static2.anInt1334 = 1;
			Static5.anInt4302 = local19;
			Static1.anInt243 = local24;
			Static28.method3270(local1913);
			Static7.aString365 = "<col=ff9040>" + method4361(local24).aString308 + "<col=ffffff>";
			if (Static7.aString365 == null) {
				Static7.aString365 = "null";
			}
			return;
		}
		if (local28 == 1012 || local28 == 1002 || local28 == 1008 || local28 == 1003 || local28 == 1011) {
			Static13.method1007(local24, local28, local15);
		}
		if (local28 == 48) {
			Static6.anInt5177 = Static2.anInt1797;
			Static7.anInt6008 = 2;
			Static2.anInt1629 = 0;
			Static4.anInt3275 = Static7.anInt5312;
			Static3.aClass4_Sub10_Sub1_1.method4650(28);
			Static3.aClass4_Sub10_Sub1_1.method4636(local19 + Static7.anInt5479);
			Static3.aClass4_Sub10_Sub1_1.method4617(Static1.anInt1053);
			Static3.aClass4_Sub10_Sub1_1.method4613(Static2.anInt1367);
			Static3.aClass4_Sub10_Sub1_1.method4631(local24);
			Static3.aClass4_Sub10_Sub1_1.method4613(local15 + Static5.anInt3983);
			Static3.aClass4_Sub10_Sub1_1.method4586(Static2.aBooleanArray4[82] ? 1 : 0);
			Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 5) {
			@Pc(2053) Class53_Sub1_Sub1 local2053 = Static5.aClass53_Sub1_Sub1Array1[local24];
			if (local2053 != null) {
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Static2.anInt1797;
				Static4.anInt3275 = Static7.anInt5312;
				Static2.anInt1629 = 0;
				Static3.aClass4_Sub10_Sub1_1.method4650(224);
				Static3.aClass4_Sub10_Sub1_1.method4614(local24);
				Static3.aClass4_Sub10_Sub1_1.method4631(Static2.anInt1367);
				Static3.aClass4_Sub10_Sub1_1.method4624(Static1.anInt1053);
				Static3.aClass4_Sub10_Sub1_1.method4586(Static2.aBooleanArray4[82] ? 1 : 0);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local2053.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local2053.method3311(), local15);
			}
		}
		if (local28 == 37) {
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Static7.anInt5312;
			Static6.anInt5177 = Static2.anInt1797;
			Static3.aClass4_Sub10_Sub1_1.method4650(48);
			Static3.aClass4_Sub10_Sub1_1.method4631(Static5.anInt3983 + local15);
			Static3.aClass4_Sub10_Sub1_1.method4614((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static3.aClass4_Sub10_Sub1_1.method4586(Static2.aBooleanArray4[82] ? 1 : 0);
			Static3.aClass4_Sub10_Sub1_1.method4631(Static7.anInt5479 + local19);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 34) {
			@Pc(2187) Class185 local2187 = Static23.method2425(local19, local15);
			if (local2187 != null) {
				Static26.method4812();
				@Pc(2195) Class4_Sub21 local2195 = Static12.method687(local2187);
				Static21.method2081(local2195.method3273(), local2195.anInt3939, local2187.anInt5890, local15, local2187.anInt5930, local19);
				Static2.anInt1334 = 0;
				Static4.aString140 = Static12.method780(local2187);
				if (Static4.aString140 == null) {
					Static4.aString140 = "Null";
				}
				if (local2187.aBoolean416) {
					Static2.aString81 = local2187.aString352 + "<col=ffffff>";
				} else {
					Static2.aString81 = "<col=00ff00>" + local2187.aString353 + "<col=ffffff>";
				}
			}
			return;
		}
		if (local28 == 49) {
			Static3.aClass4_Sub10_Sub1_1.method4650(145);
			Static3.aClass4_Sub10_Sub1_1.method4614(local15);
			Static3.aClass4_Sub10_Sub1_1.method4584(local19);
			Static3.aClass4_Sub10_Sub1_1.method4614(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 58) {
			Static3.aClass4_Sub10_Sub1_1.method4650(214);
			Static3.aClass4_Sub10_Sub1_1.method4636(local15);
			Static3.aClass4_Sub10_Sub1_1.method4614(local24);
			Static3.aClass4_Sub10_Sub1_1.method4617(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 8) {
			@Pc(2321) Class53_Sub1_Sub2 local2321 = Static3.aClass53_Sub1_Sub2Array1[local24];
			if (local2321 != null) {
				Static6.anInt5177 = Static2.anInt1797;
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Static7.anInt5312;
				Static3.aClass4_Sub10_Sub1_1.method4650(12);
				Static3.aClass4_Sub10_Sub1_1.method4613(local24);
				Static3.aClass4_Sub10_Sub1_1.method4581(Static2.aBooleanArray4[82] ? 1 : 0);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local2321.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local2321.method3311(), local15);
			}
		}
		if (local28 == 35) {
			Static3.aClass4_Sub10_Sub1_1.method4650(103);
			Static3.aClass4_Sub10_Sub1_1.method4591(local19);
			Static3.aClass4_Sub10_Sub1_1.method4613(local15);
			Static3.aClass4_Sub10_Sub1_1.method4631(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 43) {
			@Pc(2423) Class53_Sub1_Sub1 local2423 = Static5.aClass53_Sub1_Sub1Array1[local24];
			if (local2423 != null) {
				Static4.anInt3275 = Static7.anInt5312;
				Static6.anInt5177 = Static2.anInt1797;
				Static2.anInt1629 = 0;
				Static7.anInt6008 = 2;
				Static3.aClass4_Sub10_Sub1_1.method4650(212);
				Static3.aClass4_Sub10_Sub1_1.method4614(local24);
				Static3.aClass4_Sub10_Sub1_1.method4611(Static2.aBooleanArray4[82] ? 1 : 0);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local2423.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local2423.method3311(), local15);
			}
		}
		if (local28 == 16) {
			Static4.anInt3275 = Static7.anInt5312;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Static2.anInt1797;
			Static2.anInt1629 = 0;
			Static3.aClass4_Sub10_Sub1_1.method4650(116);
			Static3.aClass4_Sub10_Sub1_1.method4631(Static1.anInt314);
			Static3.aClass4_Sub10_Sub1_1.method4636(local15 + Static5.anInt3983);
			Static3.aClass4_Sub10_Sub1_1.method4636((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static3.aClass4_Sub10_Sub1_1.method4624(Static5.anInt4302);
			Static3.aClass4_Sub10_Sub1_1.method4578(Static2.aBooleanArray4[82] ? 1 : 0);
			Static3.aClass4_Sub10_Sub1_1.method4613(Static7.anInt5479 + local19);
			Static3.aClass4_Sub10_Sub1_1.method4613(Static1.anInt243);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 44) {
			Static4.anInt3275 = Static7.anInt5312;
			Static6.anInt5177 = Static2.anInt1797;
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static3.aClass4_Sub10_Sub1_1.method4650(3);
			Static3.aClass4_Sub10_Sub1_1.method4578(Static2.aBooleanArray4[82] ? 1 : 0);
			Static3.aClass4_Sub10_Sub1_1.method4613(Static7.anInt5479 + local19);
			Static3.aClass4_Sub10_Sub1_1.method4613(local24);
			Static3.aClass4_Sub10_Sub1_1.method4614(local15 + Static5.anInt3983);
			Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 23 || local28 == 1009) {
			Static37.method4752(local19, local15, local24, Static6.aStringArray27[arg0]);
		}
		if (local28 == 1010) {
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Static7.anInt5312;
			Static6.anInt5177 = Static2.anInt1797;
			@Pc(2659) Class53_Sub1_Sub2 local2659 = Static3.aClass53_Sub1_Sub2Array1[local24];
			if (local2659 != null) {
				@Pc(2665) Class168 local2665 = local2659.aClass168_1;
				if (local2665.anIntArray590 != null) {
					local2665 = local2665.method4265();
				}
				if (local2665 != null) {
					Static3.aClass4_Sub10_Sub1_1.method4650(65);
					Static3.aClass4_Sub10_Sub1_1.method4613(local2665.anInt5255);
				}
			}
		}
		if (local28 == 7) {
			Static21.method2063();
		}
		if (local28 == 1005) {
			Static4.anInt3275 = Static7.anInt5312;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Static2.anInt1797;
			Static2.anInt1629 = 0;
			Static3.aClass4_Sub10_Sub1_1.method4650(60);
			Static3.aClass4_Sub10_Sub1_1.method4614(local19 + Static7.anInt5479);
			Static3.aClass4_Sub10_Sub1_1.method4613((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static3.aClass4_Sub10_Sub1_1.method4581(Static2.aBooleanArray4[82] ? 1 : 0);
			Static3.aClass4_Sub10_Sub1_1.method4613(Static5.anInt3983 + local15);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 41) {
			Static7.anInt6008 = 2;
			Static2.anInt1629 = 0;
			Static6.anInt5177 = Static2.anInt1797;
			Static4.anInt3275 = Static7.anInt5312;
			Static3.aClass4_Sub10_Sub1_1.method4650(92);
			Static3.aClass4_Sub10_Sub1_1.method4586(Static2.aBooleanArray4[82] ? 1 : 0);
			Static3.aClass4_Sub10_Sub1_1.method4613((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static3.aClass4_Sub10_Sub1_1.method4614(local15 + Static5.anInt3983);
			Static3.aClass4_Sub10_Sub1_1.method4614(local19 + Static7.anInt5479);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 50) {
			Static3.aClass4_Sub10_Sub1_1.method4650(177);
			Static3.aClass4_Sub10_Sub1_1.method4591(local19);
			Static3.aClass4_Sub10_Sub1_1.method4631(local24);
			Static3.aClass4_Sub10_Sub1_1.method4624(Static1.anInt1053);
			Static3.aClass4_Sub10_Sub1_1.method4613(local15);
			Static3.aClass4_Sub10_Sub1_1.method4613(Static2.anInt1367);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 20) {
			Static3.aClass4_Sub10_Sub1_1.method4650(124);
			Static3.aClass4_Sub10_Sub1_1.method4636(local15);
			Static3.aClass4_Sub10_Sub1_1.method4636(local24);
			Static3.aClass4_Sub10_Sub1_1.method4624(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 2) {
			Static3.aClass4_Sub10_Sub1_1.method4650(205);
			Static3.aClass4_Sub10_Sub1_1.method4591(local19);
			Static3.aClass4_Sub10_Sub1_1.method4613(local15);
			Static3.aClass4_Sub10_Sub1_1.method4614(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 45) {
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Static2.anInt1797;
			Static4.anInt3275 = Static7.anInt5312;
			Static2.anInt1629 = 0;
			Static3.aClass4_Sub10_Sub1_1.method4650(54);
			Static3.aClass4_Sub10_Sub1_1.method4581(Static2.aBooleanArray4[82] ? 1 : 0);
			Static3.aClass4_Sub10_Sub1_1.method4613(Static7.anInt5479 + local19);
			Static3.aClass4_Sub10_Sub1_1.method4631(local24);
			Static3.aClass4_Sub10_Sub1_1.method4631(local15 + Static5.anInt3983);
			Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 22) {
			@Pc(3012) Class53_Sub1_Sub1 local3012 = Static5.aClass53_Sub1_Sub1Array1[local24];
			if (local3012 != null) {
				Static4.anInt3275 = Static7.anInt5312;
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Static2.anInt1797;
				Static2.anInt1629 = 0;
				Static3.aClass4_Sub10_Sub1_1.method4650(96);
				Static3.aClass4_Sub10_Sub1_1.method4611(Static2.aBooleanArray4[82] ? 1 : 0);
				Static3.aClass4_Sub10_Sub1_1.method4631(local24);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local3012.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local3012.method3311(), local15);
			}
		}
		if (local28 == 60) {
			@Pc(3080) Class53_Sub1_Sub1 local3080 = Static5.aClass53_Sub1_Sub1Array1[local24];
			if (local3080 != null) {
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Static2.anInt1797;
				Static4.anInt3275 = Static7.anInt5312;
				Static3.aClass4_Sub10_Sub1_1.method4650(223);
				Static3.aClass4_Sub10_Sub1_1.method4581(Static2.aBooleanArray4[82] ? 1 : 0);
				Static3.aClass4_Sub10_Sub1_1.method4636(local24);
				Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local3080.method3311(), local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local3080.method3311(), local15);
			}
		}
		if (local28 == 1001) {
			@Pc(3148) Class185 local3148 = Static19.method1813(local19);
			if (local3148 == null || local3148.anIntArray661[local15] < 100000) {
				Static3.aClass4_Sub10_Sub1_1.method4650(72);
				Static3.aClass4_Sub10_Sub1_1.method4631(local24);
			} else {
				Static26.method4357("", 0, local3148.anIntArray661[local15] + " x " + method4361(local24).aString308);
			}
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = Static19.method1813(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 18) {
			Static3.aClass4_Sub10_Sub1_1.method4650(158);
			Static3.aClass4_Sub10_Sub1_1.method4617(local19);
			@Pc(3216) Class185 local3216 = Static19.method1813(local19);
			if (local3216.anIntArrayArray50 != null && local3216.anIntArrayArray50[0][0] == 5) {
				@Pc(3240) int local3240 = local3216.anIntArrayArray50[0][1];
				Static1.anIntArray2[local3240] = 1 - Static1.anIntArray2[local3240];
				Static29.method3534(local3240);
			}
		}
		if (local28 == 38) {
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Static7.anInt5312;
			Static6.anInt5177 = Static2.anInt1797;
			Static3.aClass4_Sub10_Sub1_1.method4650(8);
			Static3.aClass4_Sub10_Sub1_1.method4636(local24);
			Static3.aClass4_Sub10_Sub1_1.method4631(local19 + Static7.anInt5479);
			Static3.aClass4_Sub10_Sub1_1.method4631(Static5.anInt3983 + local15);
			Static3.aClass4_Sub10_Sub1_1.method4611(Static2.aBooleanArray4[82] ? 1 : 0);
			Static15.method1337(Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (Static2.anInt1334 != 0) {
			Static2.anInt1334 = 0;
			Static28.method3270(Static19.method1813(Static5.anInt4302));
		}
		if (Static3.aBoolean177) {
			Static26.method4812();
		}
		if (Static1.aClass185_3 != null && Static2.anInt2246 == 0) {
			Static28.method3270(Static1.aClass185_3);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BZ)V")
	public static void method665(@OriginalArg(1) boolean arg0) {
		Static3.aBoolean144 = arg0;
		Static6.aBoolean313 = !Static10.method456();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method667(@OriginalArg(0) Class58 arg0) {
		Static2.aClass4_Sub3_Sub14Array10 = Static27.method3225(arg0, Static3.anInt2120);
		Static2.aClass4_Sub3_Sub14Array7 = Static27.method3225(arg0, Static6.anInt4363);
		Static3.aClass4_Sub3_Sub14Array8 = Static27.method3225(arg0, Static5.anInt4281);
		Static1.aClass4_Sub3_Sub14Array1 = Static27.method3225(arg0, Static2.anInt1975);
		Static6.aClass4_Sub3_Sub14Array11 = Static27.method3225(arg0, Static5.anInt4207);
		Static1.aClass4_Sub3_Sub14Array3 = Static27.method3225(arg0, Static7.anInt5332);
		Static1.aClass4_Sub3_Sub14Array2 = Static34.method1548(Static7.anInt5230, arg0);
		Static6.aClass4_Sub3_Sub14Array12 = Static34.method1548(Static6.anInt3786, arg0);
		Static2.aClass4_Sub3_Sub14Array6 = Static34.method1548(Static3.anInt2296, arg0);
		Static5.aClass56Array5 = Static11.method495(arg0, Static5.anInt4163);
		Static3.aClass56Array3 = Static11.method495(arg0, Static3.anInt2449);
		Static1.aClass4_Sub3_Sub5_1.method2267(Static3.aClass56Array3, null);
		Static5.aClass4_Sub3_Sub5_2.method2267(Static3.aClass56Array3, null);
		Static5.aClass4_Sub3_Sub5_3.method2267(Static3.aClass56Array3, null);
		if (Static3.aBoolean138) {
			Static2.aClass56_Sub1Array2 = Static16.method1523(arg0, Static2.anInt1632);
			for (@Pc(94) int local94 = 0; local94 < Static2.aClass56_Sub1Array2.length; local94++) {
				Static2.aClass56_Sub1Array2[local94].method1320();
			}
		}
		@Pc(115) Class4_Sub3_Sub14_Sub1 local115 = Static24.method2654(arg0, Static1.anInt130, 0);
		local115.method2176();
		if (Static3.aBoolean138) {
			Static6.aClass4_Sub3_Sub14_6 = new Class4_Sub3_Sub14_Sub2(local115);
		} else {
			Static6.aClass4_Sub3_Sub14_6 = local115;
		}
		@Pc(134) Class4_Sub3_Sub14_Sub1[] local134 = Static25.method2729(Static6.anInt4371, arg0);
		for (@Pc(136) int local136 = 0; local136 < local134.length; local136++) {
			local134[local136].method2176();
		}
		if (Static3.aBoolean138) {
			Static2.aClass4_Sub3_Sub14Array9 = new Class4_Sub3_Sub14[local134.length];
			for (@Pc(168) int local168 = 0; local168 < local134.length; local168++) {
				Static2.aClass4_Sub3_Sub14Array9[local168] = new Class4_Sub3_Sub14_Sub2(local134[local168]);
			}
		} else {
			Static2.aClass4_Sub3_Sub14Array9 = local134;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
	public static void method676(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub9 local10 = Static12.method2322(9, arg0);
		local10.method1519();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IZ)V")
	public static void method680(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub3_Sub9 local13 = Static12.method2322(5, arg0);
		local13.method1519();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	public static void method4310() {
		if (Static3.aClass4_Sub19ArrayArrayArray2 != null) {
			for (@Pc(3) int local3 = 0; local3 < Static3.aClass4_Sub19ArrayArrayArray2.length; local3++) {
				for (@Pc(9) int local9 = 0; local9 < Static7.anInt5632; local9++) {
					for (@Pc(14) int local14 = 0; local14 < Static7.anInt5590; local14++) {
						Static3.aClass4_Sub19ArrayArrayArray2[local3][local9][local14] = null;
					}
				}
			}
		}
		Static3.aClass4_Sub12ArrayArray1 = null;
		if (Static7.aClass4_Sub19ArrayArrayArray3 != null) {
			for (@Pc(38) int local38 = 0; local38 < Static7.aClass4_Sub19ArrayArrayArray3.length; local38++) {
				for (@Pc(44) int local44 = 0; local44 < Static7.anInt5632; local44++) {
					for (@Pc(49) int local49 = 0; local49 < Static7.anInt5590; local49++) {
						Static7.aClass4_Sub19ArrayArrayArray3[local38][local44][local49] = null;
					}
				}
			}
		}
		Static7.aClass4_Sub12ArrayArray3 = null;
		Static2.anInt1742 = 0;
		if (Static7.aClass184Array13 != null) {
			for (@Pc(75) int local75 = 0; local75 < Static2.anInt1742; local75++) {
				Static7.aClass184Array13[local75] = null;
			}
		}
		if (Static4.aClass33Array2 != null) {
			for (@Pc(88) int local88 = 0; local88 < Static4.anInt2661; local88++) {
				Static4.aClass33Array2[local88] = null;
			}
			Static4.anInt2661 = 0;
		}
		if (Static2.aClass33Array1 != null) {
			for (@Pc(103) int local103 = 0; local103 < Static2.aClass33Array1.length; local103++) {
				Static2.aClass33Array1[local103] = null;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)I")
	public static int method4311(@OriginalArg(1) int arg0) {
		@Pc(13) Class32 local13 = Static14.method1065(arg0);
		@Pc(16) int local16 = local13.anInt787;
		@Pc(19) int local19 = local13.anInt794;
		@Pc(22) int local22 = local13.anInt795;
		@Pc(29) int local29 = Class4_Sub3_Sub16.anIntArray455[local22 - local19];
		return local29 & Static1.anIntArray2[local16] >> local19;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method4312() {
		Static5.aString233 = "Carregando fontes - ";
		Static5.aString230 = "M";
		Static3.aString133 = "Objeto para membros";
		Static3.aString122 = "Remova ";
		Static4.aString160 = "Alocando memória";
		Static6.aString290 = "Carregando texturas - ";
		Static6.aString193 = "Mechscape carregando. Aguarde...";
		Static4.aString200 = "Gerenciador de entradas carregado";
		Static7.aString315 = "brilho3:";
		Static1.aString7 = "Padrões carregados";
		Static1.aString11 = "Descartar";
		Static5.aString324 = "roxo:";
		Static5.aString314 = "Usar";
		Static7.aString369 = "Carregando sprites - ";
		Static3.aString139 = "Virar para cá";
		Static5.aString239 = "K";
		Static1.aString43 = "amarelo:";
		Static6.aString276 = "Não é possível encontrar ";
		Static4.aString180 = " da sua lista de ignorados primeiro.";
		Static4.aString199 = "Lista de atualizações carregada";
		Static3.aString128 = " já está na sua lista de ignorados.";
		Static4.aString201 = "Continuar";
		Static5.aString218 = "Fontes carregadas";
		Static3.aString120 = "Atacar";
		Static4.aString207 = "Conexão perdida.";
		Static7.aString320 = "habilidade: ";
		Static1.aString46 = "Tentando reestabelecer conexão. Aguarde.";
		Static2.aString83 = "Iniciando biblioteca 3D";
		Static4.aString211 = "Mecanismo de som preparado";
		Static3.aString115 = "Largar";
		Static4.aString210 = "OpenRS2 carregando. Aguarde...";
		Static4.aString203 = "brilho1:";
		Static1.aString49 = "M";
		Static5.aString250 = "brilho3:";
		Static3.aString325 = "verde:";
		Static6.aString275 = "Verificando atualizações - ";
		Static1.aString55 = " ";
		Static3.aString147 = "Tela título aberta";
		Static1.aString26 = "Pegar";
		Static3.aString154 = "onda:";
		Static6.aString267 = "onda2:";
		Static3.aString150 = "Interfaces carregadas";
		Static6.aString262 = "Memória alocada";
		Static1.aString23 = "Conectado ao servidor de atualização";
		Static2.aString68 = "Carregando...";
		Static6.aString260 = "Remova ";
		Static5.aString235 = "rolagem:";
		Static4.aString187 = "Carregando. Aguarde.";
		Static1.aString38 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
		Static3.aString113 = " da sua lista de amigos primeiro.";
		Static1.aString29 = "qualificação: ";
		Static4.aString179 = "branco:";
		Static7.aString364 = "Conectando ao servidor de atualização";
		Static6.aString298 = "cyan:";
		Static2.aString80 = "Dados da lista de mundos carregados";
		Static1.aString56 = "Carregando tela título - ";
		Static3.aString149 = "Carregando padrões - ";
		Static7.aString348 = "nível: ";
		Static5.aString224 = " saiu do jogo.";
		Static4.aString161 = "K";
		Static4.aString368 = "Config carregada";
		Static4.aString202 = "Selecionar opção";
		Static3.aString112 = "Biblioteca 3D iniciada";
		Static4.aString170 = "tremor:";
		Static6.aString282 = "Ok";
		Static3.aString121 = "Pacote de palavras carregado";
		Static6.aString293 = "brilho2:";
		Static4.aString205 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
		Static6.aString265 = "Sprites carregados";
		Static5.aString240 = "Tela título carregada";
		Static6.aString296 = "Cancelar";
		Static6.aString266 = "flash1:";
		Static4.aString206 = "Carregando dados da lista de mundos";
		Static3.aString146 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
		Static3.aString148 = " mais opções";
		Static3.aString124 = "Aguarde...";
		Static1.aString8 = "Fechar";
		Static7.aString347 = " já está na sua lista de amigos.";
		Static7.aString363 = "Você não pode adicionar a si próprio à sua lista de amigos.";
		Static1.aString6 = "Caminhar para cá";
		Static5.aString37 = "Selecionar";
		Static1.aString22 = "Examinar";
		Static3.aString142 = "deslizamento:";
		Static4.aString185 = "Oculto";
		Static5.aString249 = " entrou no jogo.";
		Static1.aString30 = "Carregando config - ";
		Static7.aString329 = "Carregando interfaces - ";
		Static7.aString343 = "flash2:";
		Static3.aString118 = "deseja negociar com você.";
		Static7.aString344 = "vermelho:";
		Static5.aString256 = "Texturas carregadas";
		Static7.aString317 = "Universo de jogo criado";
		Static2.aString82 = "Carregando pacote de palavras - ";
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method4313() {
		Static1.aClass26_6.method511();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public static void method4318() {
		while (true) {
			if (Static5.aClass4_Sub10_Sub1_2.method4651(Static1.anInt1052) >= 11) {
				@Pc(18) int local18 = Static5.aClass4_Sub10_Sub1_2.method4652(11);
				if (local18 != 2047) {
					@Pc(27) boolean local27 = false;
					if (Static5.aClass53_Sub1_Sub1Array1[local18] == null) {
						local27 = true;
						Static5.aClass53_Sub1_Sub1Array1[local18] = new Class53_Sub1_Sub1();
						if (Static6.aClass4_Sub10Array1[local18] != null) {
							Static5.aClass53_Sub1_Sub1Array1[local18].method1170(Static6.aClass4_Sub10Array1[local18]);
						}
					}
					Static4.anIntArray317[Static3.anInt2510++] = local18;
					@Pc(65) Class53_Sub1_Sub1 local65 = Static5.aClass53_Sub1_Sub1Array1[local18];
					local65.anInt3990 = Static2.anInt954;
					@Pc(75) int local75 = Static1.anIntArray27[Static5.aClass4_Sub10_Sub1_2.method4652(3)];
					if (local27) {
						local65.anInt4017 = local65.anInt4031 = local75;
					}
					@Pc(88) int local88 = Static5.aClass4_Sub10_Sub1_2.method4652(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					@Pc(97) int local97 = Static5.aClass4_Sub10_Sub1_2.method4652(1);
					@Pc(102) int local102 = Static5.aClass4_Sub10_Sub1_2.method4652(1);
					if (local102 == 1) {
						Static7.anIntArray587[Static6.anInt4760++] = local18;
					}
					@Pc(119) int local119 = Static5.aClass4_Sub10_Sub1_2.method4652(5);
					if (local119 > 15) {
						local119 -= 32;
					}
					local65.method1174(Static4.aClass53_Sub1_Sub1_2.anIntArray426[0] + local119, local97 == 1, Static4.aClass53_Sub1_Sub1_2.anIntArray422[0] + local88);
					continue;
				}
			}
			Static5.aClass4_Sub10_Sub1_2.method4644();
			return;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4319(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) long local33 = arg0; local33 != 0L; local33 /= 37L) {
				local31++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				local49.append(Static4.aCharArray1[(int) (local57 - arg0 * 37L)]);
			}
			return local49.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	public static void method4321() {
		for (@Pc(14) Class4_Sub3_Sub6 local14 = (Class4_Sub3_Sub6) Static2.aClass112_8.method2610(); local14 != null; local14 = (Class4_Sub3_Sub6) Static2.aClass112_8.method2616()) {
			@Pc(20) Class53_Sub5 local20 = local14.aClass53_Sub5_1;
			if (local20.anInt3655 != Static7.anInt5334 || local20.aBoolean265) {
				local14.unlink();
			} else if (Static2.anInt954 >= local20.anInt3665) {
				local20.method3058(Static5.anInt4156);
				if (local20.aBoolean265) {
					local14.unlink();
				} else {
					Static11.method637(local20.anInt3655, local20.anInt3647, local20.anInt3653, local20.anInt3648, 60, local20, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIBI)I")
	public static int method4327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static4.aByteArrayArrayArray17[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static4.aByteArrayArrayArray17[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method4328() {
		@Pc(31) String local31;
		if (Static2.anInt1334 == 1 && Static7.anInt5634 < 2) {
			local31 = Static5.aString314 + Static1.aString55 + Static7.aString365 + " ->";
		} else if (Static3.aBoolean177 && Static7.anInt5634 < 2) {
			local31 = Static4.aString140 + Static1.aString55 + Static2.aString81 + " ->";
		} else if (Static2.aBoolean68 && Static2.aBooleanArray4[81] && Static7.anInt5634 > 2) {
			local31 = Static26.method2992(Static7.anInt5634 - 2);
		} else {
			local31 = Static26.method2992(Static7.anInt5634 - 1);
		}
		if (Static7.anInt5634 > 2) {
			local31 = local31 + "<col=ffffff> / " + (Static7.anInt5634 - 2) + Static3.aString148;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!fg;Lclient!ho;)V")
	public static void method4329(@OriginalArg(1) Class4_Sub3_Sub7 arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(5) Class56_Sub1 local5 = arg1.method1808();
		if (local5 == null) {
			return;
		}
		@Pc(16) int local16 = local5.anInt3408;
		if (local5.anInt3413 > local5.anInt3408) {
			local16 = local5.anInt3413;
		}
		@Pc(27) int local27 = arg0.anInt1766;
		@Pc(30) int local30 = arg0.anInt1764;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		if (arg1.aString131 != null) {
			local32 = Static1.aClass4_Sub3_Sub5_1.method2279(arg1.aString131, null, Static5.aStringArray24);
			for (@Pc(49) int local49 = 0; local49 < local32; local49++) {
				@Pc(56) String local56 = Static5.aStringArray24[local49];
				if (local32 - 1 > local49) {
					local56 = local56.substring(0, local56.length() - 4);
				}
				@Pc(77) int local77 = Static4.aClass106_5.method2326(local56);
				if (local34 < local77) {
					local34 = local77;
				}
			}
			local36 = (local32 - 1) * Static4.aClass106_5.method2332() + Static4.aClass106_5.method2328() / 2;
		}
		@Pc(105) int local105 = arg0.anInt1766;
		if (Static3.anInt2969 + local16 > local27) {
			local27 = local16 + Static3.anInt2969;
			local105 = local34 / 2 + local16 / 2 + Static3.anInt2969 + local16 + 5;
		} else if (Static3.anInt2970 - local16 < local27) {
			local105 = Static3.anInt2970 - local16 - local16 / 2 - local34 / 2 - 5;
			local27 = Static3.anInt2970 - local16;
		}
		@Pc(167) int local167 = arg0.anInt1764 - local36 / 2;
		if (local30 < local16 + Static3.anInt2968) {
			local30 = Static3.anInt2968 + local16;
			local167 = local16 / 2 + local16 + Static3.anInt2968 + Static4.aClass106_5.method2332();
		} else if (Static3.anInt2971 - local16 < local30) {
			local167 = Static3.anInt2971 - local16 - local16 / 2 - local36;
			local30 = Static3.anInt2971 - local16;
		}
		@Pc(218) int local218 = -2;
		@Pc(220) int local220 = -2;
		@Pc(224) int local224 = local16 >> 1;
		@Pc(226) int local226 = -2;
		@Pc(250) int local250 = (int) (Math.atan2((double) (local27 - arg0.anInt1766), (double) (local30 - arg0.anInt1764)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		@Pc(252) int local252 = -2;
		local5.method1314(local5.anInt3412 << 3, local5.anInt3410 << 3, local224 + (local27 << 4), local224 + (local30 << 4), local250);
		if (arg1.aString131 != null) {
			local220 = local167 - Static4.aClass106_5.method2328() - 3;
			local218 = local105 - local34 / 2 - 5;
			local252 = local32 * Static4.aClass106_5.method2332() + local220;
			local226 = local34 + local218 + 10;
			if (arg1.anInt2274 != 0) {
				Static34.method4213(local218, local220, local226 - local218, local252 - local220, arg1.anInt2274, arg1.anInt2274 >>> 24);
			}
			if (arg1.anInt2280 != 0) {
				Static34.method4221(local218, local220, local226 - local218, local252 - local220, arg1.anInt2280, arg1.anInt2280 >>> 24);
			}
			for (@Pc(353) int local353 = 0; local353 < local32; local353++) {
				@Pc(364) String local364 = Static5.aStringArray24[local353];
				if (local353 < local32 - 1) {
					local364 = local364.substring(0, local364.length() - 4);
				}
				Static4.aClass106_5.method2330(local364, local105, local167, arg1.anInt2286);
				local167 += Static4.aClass106_5.method2332();
			}
		}
		if ((Static7.anInt5357 <= local27 - local224 || local27 + local224 <= Static7.anInt5357 || Static7.anInt6038 <= local30 - local224 || Static7.anInt6038 >= local30 + local224) && (Static7.anInt5357 <= local218 || local226 <= Static7.anInt5357 || local220 >= Static7.anInt6038 || Static7.anInt6038 >= local252)) {
			return;
		}
		if (arg1.aStringArray15[4] != null) {
			Static16.method1497((long) arg0.anInt1760, 0, 0, arg1.aString130, arg1.aStringArray15[4], (short) 1011, -1);
		}
		if (arg1.aStringArray15[3] != null) {
			Static16.method1497((long) arg0.anInt1760, 0, 0, arg1.aString130, arg1.aStringArray15[3], (short) 1003, -1);
		}
		if (arg1.aStringArray15[2] != null) {
			Static16.method1497((long) arg0.anInt1760, 0, 0, arg1.aString130, arg1.aStringArray15[2], (short) 1008, -1);
		}
		if (arg1.aStringArray15[1] != null) {
			Static16.method1497((long) arg0.anInt1760, 0, 0, arg1.aString130, arg1.aStringArray15[1], (short) 1002, -1);
		}
		if (arg1.aStringArray15[0] != null) {
			Static16.method1497((long) arg0.anInt1760, 0, 0, arg1.aString130, arg1.aStringArray15[0], (short) 1012, -1);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)I")
	public static int method4331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(21) int local21 = arg2 - 1 & arg1;
		@Pc(25) int local25 = arg0 / arg2;
		@Pc(31) int local31 = arg2 - 1 & arg0;
		@Pc(36) int local36 = Static20.method1953(local25, local7);
		@Pc(43) int local43 = Static20.method1953(local25, local7 + 1);
		@Pc(50) int local50 = Static20.method1953(local25 + 1, local7);
		@Pc(59) int local59 = Static20.method1953(local25 + 1, local7 + 1);
		@Pc(66) int local66 = Static11.method562(arg2, local43, local36, local21);
		@Pc(73) int local73 = Static11.method562(arg2, local59, local50, local21);
		return Static11.method562(arg2, local73, local66, local31);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZIIII)V")
	public static void method4512(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) boolean local5 = false;
		Static1.aLong15 = 0L;
		@Pc(15) int local15 = Static11.method557();
		if (local15 > 0 == arg1 <= 0) {
			local5 = true;
		}
		if (arg1 == 3 || local15 == 3) {
			arg0 = true;
		}
		if (arg0 && arg1 > 0) {
			local5 = true;
		}
		Static24.method2813(arg2, local15, arg0, arg3, arg1, local5);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "([[IB)V")
	public static void method4335(@OriginalArg(0) int[][] arg0) {
		Static5.anIntArrayArray36 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)I")
	public static int method4338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg1 &= 3;
		if (arg1 == 0) {
			return arg2;
		} else if (arg1 == 1) {
			return arg0;
		} else if (arg1 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIIII)V")
	public static void method4339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static3.aClass4_Sub10_Sub1_1.anInt5709 = 0;
		Static3.aClass4_Sub10_Sub1_1.method4581(20);
		Static3.aClass4_Sub10_Sub1_1.method4581(arg3);
		Static3.aClass4_Sub10_Sub1_1.method4581(arg2);
		Static3.aClass4_Sub10_Sub1_1.method4631(arg0);
		Static3.aClass4_Sub10_Sub1_1.method4631(arg1);
		Static2.anInt1213 = 0;
		Static6.anInt4759 = 1;
		Static6.anInt5173 = -3;
		Static4.anInt3409 = 0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!wf;IIIII)V")
	public static void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class82 local10 = Static22.method2191(arg3);
		if (local10 == null || !local10.aBoolean155 || !local10.method1810()) {
			return;
		}
		if (local10.anIntArray188 != null) {
			@Pc(32) int[] local32 = new int[local10.anIntArray188.length];
			for (@Pc(34) int local34 = 0; local34 < local32.length / 2; local34++) {
				@Pc(48) int local48 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
				@Pc(52) int local52 = Class109.anIntArray298[local48];
				local52 = local52 * 256 / (Static6.anInt4761 + 256);
				@Pc(64) int local64 = Class109.anIntArray299[local48];
				local64 = local64 * 256 / (Static6.anInt4761 + 256);
				local32[local34 * 2] = arg2 + arg1.anInt5893 / 2 + ((arg5 + local10.anIntArray188[local34 * 2 + 1] * 4) * local64 + local52 * (arg4 + local10.anIntArray188[local34 * 2] * 4) >> 16);
				local32[local34 * 2 + 1] = arg0 + arg1.anInt5949 / 2 - (local52 * (arg5 + local10.anIntArray188[local34 * 2 + 1] * 4) - local64 * (arg4 + local10.anIntArray188[local34 * 2] * 4) >> 16);
			}
			if (Static3.aBoolean138) {
				Static18.method1738(local32, local10.anInt2283, local10.anInt2283 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			} else {
				Static17.method1630(local32, local10.anInt2283, local10.anInt2283 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			}
			for (@Pc(195) int local195 = 0; local195 < local32.length / 2 - 1; local195++) {
				if (Static3.aBoolean138) {
					Static18.method1689(local32[local195 * 2], local32[local195 * 2 + 1], local32[(local195 + 1) * 2], local32[local195 * 2 + 1 + 2], local10.anInt2266, local10.anInt2266 >>> 24, (Class4_Sub3_Sub14_Sub2) arg1.method4729(false));
				} else {
					Static34.method4219(local32[local195 * 2], local32[local195 * 2 + 1], local32[local195 * 2 + 2], local32[local195 * 2 + 3], local10.anInt2266, local10.anInt2266 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
				}
			}
			if (Static3.aBoolean138) {
				Static18.method1689(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anInt2266, local10.anInt2266 >>> 24, (Class4_Sub3_Sub14_Sub2) arg1.method4729(false));
			} else {
				Static34.method4219(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anInt2266, local10.anInt2266 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			}
		}
		@Pc(356) Class56 local356 = null;
		if (local10.anInt2277 != -1) {
			local356 = local10.method1811(false, false);
			if (local356 != null) {
				Static31.method3780(local356, arg2, arg1, arg4, arg5, arg0);
			}
		}
		if (local10.aString131 == null) {
			return;
		}
		@Pc(384) int local384 = 0;
		@Pc(386) Class4_Sub3_Sub5 local386 = Static1.aClass4_Sub3_Sub5_1;
		if (local10.anInt2270 == 1) {
			local386 = Static5.aClass4_Sub3_Sub5_2;
		}
		if (local10.anInt2270 == 2) {
			local386 = Static5.aClass4_Sub3_Sub5_3;
		}
		if (local356 != null) {
			local384 = local356.anInt3413;
		}
		Static9.method194(local10.anInt2286, local10.aString131, arg0, arg5, arg2, arg4, local384, local386, arg1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Lclient!td;")
	public static Class162 method4361(@OriginalArg(0) int arg0) {
		@Pc(18) Class162 local18 = (Class162) Static5.aClass26_35.method518((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(34) byte[] local34 = Static5.aClass58_81.method1372(Static10.method394(arg0), Static33.method4058(arg0));
		@Pc(38) Class162 local38 = new Class162();
		local38.anInt5066 = arg0;
		if (local34 != null) {
			local38.method4120(new Class4_Sub10(local34));
		}
		local38.method4127();
		if (local38.anInt5089 != -1) {
			local38.method4122(method4361(local38.anInt5100), method4361(local38.anInt5089));
		}
		if (local38.anInt5077 != -1) {
			local38.method4130(method4361(local38.anInt5067), method4361(local38.anInt5077));
		}
		if (!Static1.aBoolean200 && local38.aBoolean350) {
			local38.aString308 = Static3.aString133;
			local38.aStringArray33 = Static6.aStringArray29;
			local38.aStringArray32 = Static6.aStringArray26;
			local38.anInt5099 = 0;
			local38.aBoolean349 = false;
		}
		Static5.aClass26_35.method510(local38, (long) arg0);
		return local38;
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)V")
	public static void method4363() {
		Static2.anIntArray97 = Static8.method12(0.4F);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(IB)Lclient!qm;")
	public static Class145 method4364(@OriginalArg(0) int arg0) {
		@Pc(10) Class145 local10 = (Class145) Static6.aClass26_52.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static3.aClass58_52.method1372(29, arg0);
		@Pc(26) Class145 local26 = new Class145();
		if (local22 != null) {
			local26.method3618(arg0, new Class4_Sub10(local22));
		}
		Static6.aClass26_52.method510(local26, (long) arg0);
		return local26;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZIIIZII)V")
	public static void method4365(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg5 >= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg5) / 2;
		@Pc(17) int local17 = arg5;
		@Pc(21) Class63_Sub1 local21 = Static3.aClass63_Sub1Array2[local15];
		Static3.aClass63_Sub1Array2[local15] = Static3.aClass63_Sub1Array2[arg3];
		Static3.aClass63_Sub1Array2[arg3] = local21;
		for (@Pc(33) int local33 = arg5; local33 < arg3; local33++) {
			if (Static14.method1202(arg2, arg0, local21, arg4, Static3.aClass63_Sub1Array2[local33], arg1) <= 0) {
				@Pc(55) Class63_Sub1 local55 = Static3.aClass63_Sub1Array2[local33];
				Static3.aClass63_Sub1Array2[local33] = Static3.aClass63_Sub1Array2[local17];
				Static3.aClass63_Sub1Array2[local17++] = local55;
			}
		}
		Static3.aClass63_Sub1Array2[arg3] = Static3.aClass63_Sub1Array2[local17];
		Static3.aClass63_Sub1Array2[local17] = local21;
		method4365(arg0, arg1, arg2, local17 - 1, arg4, arg5);
		method4365(arg0, arg1, arg2, arg3, arg4, local17 + 1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!gb;ILclient!gb;Z)I")
	public static int method4366(@OriginalArg(1) Class63_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class63_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == 1) {
			@Pc(11) int local11 = arg2.anInt2023;
			@Pc(14) int local14 = arg0.anInt2023;
			if (!arg3) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return Static37.method4711(arg0.method1552().aString270, Static1.anInt124, arg2.method1552().aString270);
		} else if (arg1 == 3) {
			if (arg2.aString110.equals("-")) {
				if (arg0.aString110.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString110.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static37.method4711(arg0.aString110, Static1.anInt124, arg2.aString110);
			}
		} else if (arg1 == 4) {
			return arg2.method1542() ? (arg0.method1542() ? 0 : 1) : arg0.method1542() ? -1 : 0;
		} else if (arg1 == 5) {
			return arg2.method1543() ? (arg0.method1543() ? 0 : 1) : arg0.method1543() ? -1 : 0;
		} else if (arg1 == 6) {
			return arg2.method1544() ? (arg0.method1544() ? 0 : 1) : arg0.method1544() ? -1 : 0;
		} else if (arg1 == 7) {
			return arg2.method1540() ? (arg0.method1540() ? 0 : 1) : arg0.method1540() ? -1 : 0;
		} else {
			return arg2.anInt2037 - arg0.anInt2037;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZII)I")
	public static int method4367(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(18) int local18 = (arg0 & 0x7F) * arg1 >> 7;
		if (local18 < 2) {
			local18 = 2;
		} else if (local18 > 126) {
			local18 = 126;
		}
		return local18 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
	public static void method4368(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static1.aClass4_Sub19ArrayArrayArray1 = Static7.aClass4_Sub19ArrayArrayArray3;
			Static6.anIntArrayArrayArray13 = Static1.anIntArrayArrayArray2;
			Static5.aClass4_Sub12ArrayArray2 = Static7.aClass4_Sub12ArrayArray3;
		} else {
			Static1.aClass4_Sub19ArrayArrayArray1 = Static3.aClass4_Sub19ArrayArrayArray2;
			Static6.anIntArrayArrayArray13 = Static6.anIntArrayArrayArray14;
			Static5.aClass4_Sub12ArrayArray2 = Static3.aClass4_Sub12ArrayArray1;
		}
		Static5.anInt4309 = Static1.aClass4_Sub19ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)Z")
	public static boolean method4381(@OriginalArg(1) int arg0) {
		Static7.anInt5426 = arg0 + 1 & 0xFFFF;
		Static1.aBoolean50 = true;
		return true;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V")
	public static void method4382() {
		if (Static6.anInt4759 == 0) {
			return;
		}
		try {
			if (++Static2.anInt1213 > 2000) {
				if (Static3.aClass52_7 != null) {
					Static3.aClass52_7.method1103();
					Static3.aClass52_7 = null;
				}
				if (Static4.anInt3409 >= 1) {
					Static6.anInt5173 = -5;
					Static6.anInt4759 = 0;
					return;
				}
				Static2.anInt1213 = 0;
				Static6.anInt4759 = 1;
				Static4.anInt3409++;
				if (Static6.anInt4866 == Static3.anInt2194) {
					Static6.anInt4866 = Static5.anInt4045;
				} else {
					Static6.anInt4866 = Static3.anInt2194;
				}
			}
			if (Static6.anInt4759 == 1) {
				Static7.aClass197_5 = Static7.aClass196_4.openSocket(Static6.aString292, Static6.anInt4866);
				Static6.anInt4759 = 2;
			}
			if (Static6.anInt4759 == 2) {
				if (Static7.aClass197_5.status == 2) {
					throw new IOException();
				}
				if (Static7.aClass197_5.status != 1) {
					return;
				}
				Static3.aClass52_7 = new Class52((Socket) Static7.aClass197_5.result, Static7.aClass196_4);
				Static7.aClass197_5 = null;
				Static3.aClass52_7.method1107(Static3.aClass4_Sub10_Sub1_1.aByteArray71, Static3.aClass4_Sub10_Sub1_1.anInt5709);
				if (Static1.aClass102_1 != null) {
					Static1.aClass102_1.method2996();
				}
				if (Static6.aClass102_2 != null) {
					Static6.aClass102_2.method2996();
				}
				@Pc(129) int local129 = Static3.aClass52_7.method1105();
				if (Static1.aClass102_1 != null) {
					Static1.aClass102_1.method2996();
				}
				if (Static6.aClass102_2 != null) {
					Static6.aClass102_2.method2996();
				}
				if (local129 != 21) {
					Static6.anInt5173 = local129;
					Static6.anInt4759 = 0;
					Static3.aClass52_7.method1103();
					Static3.aClass52_7 = null;
					return;
				}
				Static6.anInt4759 = 3;
			}
			if (Static6.anInt4759 == 3) {
				if (Static3.aClass52_7.method1101() < 1) {
					return;
				}
				Static2.aStringArray8 = new String[Static3.aClass52_7.method1105()];
				Static6.anInt4759 = 4;
			}
			if (Static6.anInt4759 == 4) {
				if (Static3.aClass52_7.method1101() < Static2.aStringArray8.length * 8) {
					return;
				}
				Static5.aClass4_Sub10_Sub1_2.anInt5709 = 0;
				Static3.aClass52_7.method1099(0, Static5.aClass4_Sub10_Sub1_2.aByteArray71, Static2.aStringArray8.length * 8);
				for (@Pc(199) int local199 = 0; local199 < Static2.aStringArray8.length; local199++) {
					Static2.aStringArray8[local199] = method4319(Static5.aClass4_Sub10_Sub1_2.method4622());
				}
				Static6.anInt4759 = 0;
				Static6.anInt5173 = 21;
				Static3.aClass52_7.method1103();
				Static3.aClass52_7 = null;
				return;
			}
		} catch (@Pc(226) IOException local226) {
			if (Static3.aClass52_7 != null) {
				Static3.aClass52_7.method1103();
				Static3.aClass52_7 = null;
			}
			if (Static4.anInt3409 >= 1) {
				Static6.anInt4759 = 0;
				Static6.anInt5173 = -4;
			} else {
				Static2.anInt1213 = 0;
				Static6.anInt4759 = 1;
				if (Static6.anInt4866 == Static3.anInt2194) {
					Static6.anInt4866 = Static5.anInt4045;
				} else {
					Static6.anInt4866 = Static3.anInt2194;
				}
				Static4.anInt3409++;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public static void method4400() {
		Static3.aClass26_19.method515();
		Static5.aClass26_43.method515();
		Static7.aClass26_18.method515();
		Static4.aClass26_32.method515();
	}
}

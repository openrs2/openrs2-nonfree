import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
	public static void method4789() {
		if (Static1.anInt552 == 17) {
			@Pc(15) int local15 = Static5.aClass4_Sub10_Sub1_2.method4629();
			@Pc(26) int local26 = Static1.anInt894 * 2 + (local15 >> 4 & 0xF);
			@Pc(34) int local34 = (local15 & 0xF) + Static1.anInt818 * 2;
			@Pc(41) int local41 = local26 + Static5.aClass4_Sub10_Sub1_2.method4637();
			@Pc(47) int local47 = Static5.aClass4_Sub10_Sub1_2.method4637() + local34;
			@Pc(51) int local51 = Static5.aClass4_Sub10_Sub1_2.method4576();
			@Pc(55) int local55 = Static5.aClass4_Sub10_Sub1_2.method4616();
			@Pc(61) int local61 = Static5.aClass4_Sub10_Sub1_2.method4629() * 4;
			@Pc(67) int local67 = Static5.aClass4_Sub10_Sub1_2.method4629() * 4;
			@Pc(71) int local71 = Static5.aClass4_Sub10_Sub1_2.method4616();
			@Pc(75) int local75 = Static5.aClass4_Sub10_Sub1_2.method4616();
			@Pc(79) int local79 = Static5.aClass4_Sub10_Sub1_2.method4629();
			if (local79 == 255) {
				local79 = -1;
			}
			@Pc(89) int local89 = Static5.aClass4_Sub10_Sub1_2.method4629();
			if (local26 >= 0 && local34 >= 0 && local26 < 208 && local34 < 208 && local41 >= 0 && local47 >= 0 && local41 < 208 && local47 < 208 && local55 != 65535) {
				@Pc(126) int local126 = local26 * 64;
				@Pc(130) int local130 = local34 * 64;
				@Pc(134) int local134 = local41 * 64;
				@Pc(161) Class53_Sub6 local161 = new Class53_Sub6(local55, Static7.anInt5334, local126, local130, Static11.method522(local130, local126, Static7.anInt5334) - local61, local71 + Static2.anInt954, Static2.anInt954 + local75, local79, local89, local51, local67);
				@Pc(165) int local165 = local47 * 64;
				local161.method3105(Static11.method522(local165, local134, Static7.anInt5334) - local67, local134, Static2.anInt954 + local71, local165);
				Static1.aClass112_1.method2612(new Class4_Sub3_Sub2(local161));
			}
		} else if (Static1.anInt552 == 114) {
			@Pc(198) int local198 = Static5.aClass4_Sub10_Sub1_2.method4629();
			@Pc(206) int local206 = Static1.anInt894 + (local198 >> 4 & 0x7);
			@Pc(212) int local212 = (local198 & 0x7) + Static1.anInt818;
			@Pc(216) int local216 = Static5.aClass4_Sub10_Sub1_2.method4616();
			@Pc(220) int local220 = Static5.aClass4_Sub10_Sub1_2.method4616();
			@Pc(224) int local224 = Static5.aClass4_Sub10_Sub1_2.method4616();
			if (local206 >= 0 && local212 >= 0 && local206 < 104 && local212 < 104) {
				@Pc(247) Class112 local247 = Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local206][local212];
				if (local247 != null) {
					for (@Pc(256) Class4_Sub3_Sub21 local256 = (Class4_Sub3_Sub21) local247.method2610(); local256 != null; local256 = (Class4_Sub3_Sub21) local247.method2616()) {
						@Pc(262) Class53_Sub2 local262 = local256.aClass53_Sub2_1;
						if (local262.anInt2168 == (local216 & 0x7FFF) && local220 == local262.anInt2166) {
							local262.anInt2166 = local224;
							break;
						}
					}
					Static8.method89(local206, local212);
				}
			}
		} else {
			if (Static1.anInt552 == 133) {
				@Pc(306) int local306 = Static5.aClass4_Sub10_Sub1_2.method4626();
				@Pc(310) int local310 = Static5.aClass4_Sub10_Sub1_2.method4623();
				@Pc(316) int local316 = (local310 & 0x7) + Static1.anInt818;
				@Pc(324) int local324 = (local310 >> 4 & 0x7) + Static1.anInt894;
				@Pc(328) int local328 = Static5.aClass4_Sub10_Sub1_2.method4588();
				@Pc(332) int local332 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(336) int local336 = local332 >> 2;
				@Pc(340) byte local340 = Static5.aClass4_Sub10_Sub1_2.method4608();
				@Pc(344) int local344 = local332 & 0x3;
				@Pc(348) byte local348 = Static5.aClass4_Sub10_Sub1_2.method4615();
				@Pc(352) byte local352 = Static5.aClass4_Sub10_Sub1_2.method4637();
				@Pc(356) byte local356 = Static5.aClass4_Sub10_Sub1_2.method4615();
				@Pc(360) int local360 = Static5.aClass4_Sub10_Sub1_2.method4588();
				@Pc(364) int local364 = Static5.aClass4_Sub10_Sub1_2.method4616();
				if (!Static3.aBoolean138) {
					Static13.method967(local340, local306, local328, local360, local336, local348, local352, local364, local344, local316, local356, local324);
				}
			}
			if (Static1.anInt552 == 111) {
				@Pc(390) int local390 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(400) int local400 = Static1.anInt894 * 2 + (local390 >> 4 & 0xF);
				@Pc(408) int local408 = (local390 & 0xF) + Static1.anInt818 * 2;
				@Pc(414) int local414 = Static5.aClass4_Sub10_Sub1_2.method4637() + local400;
				@Pc(421) int local421 = local408 + Static5.aClass4_Sub10_Sub1_2.method4637();
				@Pc(425) int local425 = Static5.aClass4_Sub10_Sub1_2.method4576();
				@Pc(429) int local429 = Static5.aClass4_Sub10_Sub1_2.method4576();
				@Pc(433) int local433 = Static5.aClass4_Sub10_Sub1_2.method4616();
				@Pc(437) int local437 = Static5.aClass4_Sub10_Sub1_2.method4637();
				@Pc(443) int local443 = Static5.aClass4_Sub10_Sub1_2.method4629() * 4;
				@Pc(447) int local447 = Static5.aClass4_Sub10_Sub1_2.method4616();
				@Pc(451) int local451 = Static5.aClass4_Sub10_Sub1_2.method4616();
				@Pc(455) int local455 = Static5.aClass4_Sub10_Sub1_2.method4629();
				if (local455 == 255) {
					local455 = -1;
				}
				@Pc(465) int local465 = Static5.aClass4_Sub10_Sub1_2.method4629();
				if (local400 >= 0 && local408 >= 0 && local400 < 208 && local408 < 208 && local414 >= 0 && local421 >= 0 && local414 < 208 && local421 < 208 && local433 != 65535) {
					@Pc(502) int local502 = local421 * 64;
					@Pc(506) int local506 = local414 * 64;
					@Pc(510) int local510 = local400 * 64;
					@Pc(514) int local514 = local408 * 64;
					if (local425 != 0) {
						@Pc(534) int local534;
						@Pc(542) Class53_Sub1 local542;
						if (local425 >= 0) {
							@Pc(528) int local528 = local425 - 1;
							local534 = local528 >> 11 & 0xF;
							@Pc(538) int local538 = local528 & 0x7FF;
							local542 = Static3.aClass53_Sub1_Sub2Array1[local538];
						} else {
							@Pc(549) int local549 = -local425 - 1;
							local534 = local549 >> 11 & 0xF;
							@Pc(559) int local559 = local549 & 0x7FF;
							if (local559 == Static7.anInt2022) {
								local542 = Static4.aClass53_Sub1_Sub1_2;
							} else {
								local542 = Static5.aClass53_Sub1_Sub1Array1[local559];
							}
						}
						if (local542 != null) {
							@Pc(581) Class34 local581 = local542.method3314();
							if (local581.anIntArrayArray7 != null && local581.anIntArrayArray7[local534] != null) {
								local437 -= local581.anIntArrayArray7[local534][1];
								@Pc(607) int local607 = local581.anIntArrayArray7[local534][0];
								@Pc(612) int local612 = Class109.anIntArray299[local542.anInt4031];
								@Pc(619) int local619 = local581.anIntArrayArray7[local534][2];
								@Pc(624) int local624 = Class109.anIntArray298[local542.anInt4031];
								@Pc(634) int local634 = local607 * local624 + local612 * local619 >> 16;
								local619 = local624 * local619 - local607 * local612 >> 16;
								local514 += local619;
								local510 += local634;
							}
						}
					}
					@Pc(682) Class53_Sub6 local682 = new Class53_Sub6(local433, Static7.anInt5334, local510, local514, Static11.method522(local514, local510, Static7.anInt5334) - local437, local447 + Static2.anInt954, Static2.anInt954 + local451, local455, local465, local429, local443);
					local682.method3105(Static11.method522(local502, local506, Static7.anInt5334) - local443, local506, Static2.anInt954 + local447, local502);
					Static1.aClass112_1.method2612(new Class4_Sub3_Sub2(local682));
				}
			} else if (Static1.anInt552 == 158) {
				@Pc(715) int local715 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(723) int local723 = (local715 >> 4 & 0x7) + Static1.anInt894;
				@Pc(729) int local729 = Static1.anInt818 + (local715 & 0x7);
				@Pc(733) int local733 = Static5.aClass4_Sub10_Sub1_2.method4616();
				@Pc(737) int local737 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(741) int local741 = Static5.aClass4_Sub10_Sub1_2.method4616();
				if (local723 >= 0 && local729 >= 0 && local723 < 104 && local729 < 104) {
					@Pc(765) int local765 = local729 * 128 + 64;
					@Pc(771) int local771 = local723 * 128 + 64;
					@Pc(789) Class53_Sub5 local789 = new Class53_Sub5(local733, Static7.anInt5334, local771, local765, Static11.method522(local765, local771, Static7.anInt5334) - local737, local741, Static2.anInt954);
					Static2.aClass112_8.method2612(new Class4_Sub3_Sub6(local789));
				}
			} else if (Static1.anInt552 == 179) {
				@Pc(804) int local804 = Static5.aClass4_Sub10_Sub1_2.method4616();
				if (local804 == 65535) {
					local804 = -1;
				}
				@Pc(814) int local814 = Static5.aClass4_Sub10_Sub1_2.method4605();
				@Pc(818) int local818 = local814 >> 2;
				@Pc(822) int local822 = local814 & 0x3;
				@Pc(826) int local826 = Static1.anIntArray52[local818];
				@Pc(830) int local830 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(836) int local836 = (local830 & 0x7) + Static1.anInt818;
				@Pc(844) int local844 = Static1.anInt894 + (local830 >> 4 & 0x7);
				Static34.method4250(local804, local844, Static7.anInt5334, local836, local826, local822, local818);
			} else if (Static1.anInt552 == 131) {
				@Pc(863) int local863 = Static5.aClass4_Sub10_Sub1_2.method4605();
				@Pc(867) int local867 = local863 >> 2;
				@Pc(871) int local871 = Static1.anIntArray52[local867];
				@Pc(875) int local875 = local863 & 0x3;
				@Pc(879) int local879 = Static5.aClass4_Sub10_Sub1_2.method4635();
				@Pc(883) int local883 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(889) int local889 = (local883 & 0x7) + Static1.anInt818;
				@Pc(897) int local897 = (local883 >> 4 & 0x7) + Static1.anInt894;
				if (local897 >= 0 && local889 >= 0 && local897 < 104 && local889 < 104) {
					Static13.method1011(local879, Static7.anInt5334, local875, local897, -1, local889, local867, local871, 0);
				}
			} else if (Static1.anInt552 == 115) {
				@Pc(935) int local935 = Static5.aClass4_Sub10_Sub1_2.method4616();
				@Pc(939) int local939 = Static5.aClass4_Sub10_Sub1_2.method4629();
				Static8.method99(local935).method4457(local939);
			} else if (Static1.anInt552 == 232) {
				@Pc(954) int local954 = Static5.aClass4_Sub10_Sub1_2.method4589();
				@Pc(960) int local960 = Static1.anInt818 + (local954 & 0x7);
				@Pc(968) int local968 = (local954 >> 4 & 0x7) + Static1.anInt894;
				@Pc(972) int local972 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(976) int local976 = local972 >> 2;
				@Pc(980) int local980 = Static1.anIntArray52[local976];
				@Pc(984) int local984 = local972 & 0x3;
				if (local968 >= 0 && local960 >= 0 && local968 < 104 && local960 < 104) {
					Static13.method1011(-1, Static7.anInt5334, local984, local968, -1, local960, local976, local980, 0);
				}
			} else if (Static1.anInt552 == 105) {
				@Pc(1022) int local1022 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(1030) int local1030 = (local1022 >> 4 & 0x7) + Static1.anInt894;
				@Pc(1036) int local1036 = (local1022 & 0x7) + Static1.anInt818;
				@Pc(1042) int local1042 = Static5.aClass4_Sub10_Sub1_2.method4637() + local1030;
				@Pc(1048) int local1048 = Static5.aClass4_Sub10_Sub1_2.method4637() + local1036;
				@Pc(1052) int local1052 = Static5.aClass4_Sub10_Sub1_2.method4576();
				@Pc(1056) int local1056 = Static5.aClass4_Sub10_Sub1_2.method4616();
				@Pc(1062) int local1062 = Static5.aClass4_Sub10_Sub1_2.method4629() * 4;
				@Pc(1068) int local1068 = Static5.aClass4_Sub10_Sub1_2.method4629() * 4;
				@Pc(1072) int local1072 = Static5.aClass4_Sub10_Sub1_2.method4616();
				@Pc(1076) int local1076 = Static5.aClass4_Sub10_Sub1_2.method4616();
				@Pc(1080) int local1080 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(1084) int local1084 = Static5.aClass4_Sub10_Sub1_2.method4629();
				if (local1080 == 255) {
					local1080 = -1;
				}
				if (local1030 >= 0 && local1036 >= 0 && local1030 < 104 && local1036 < 104 && local1042 >= 0 && local1048 >= 0 && local1042 < 104 && local1048 < 104 && local1056 != 65535) {
					@Pc(1128) int local1128 = local1036 * 128 + 64;
					@Pc(1134) int local1134 = local1042 * 128 + 64;
					@Pc(1140) int local1140 = local1048 * 128 + 64;
					@Pc(1146) int local1146 = local1030 * 128 + 64;
					@Pc(1173) Class53_Sub6 local1173 = new Class53_Sub6(local1056, Static7.anInt5334, local1146, local1128, Static11.method522(local1128, local1146, Static7.anInt5334) - local1062, Static2.anInt954 + local1072, local1076 + Static2.anInt954, local1080, local1084, local1052, local1068);
					local1173.method3105(Static11.method522(local1140, local1134, Static7.anInt5334) - local1068, local1134, local1072 + Static2.anInt954, local1140);
					Static1.aClass112_1.method2612(new Class4_Sub3_Sub2(local1173));
				}
			} else if (Static1.anInt552 == 120) {
				@Pc(1203) int local1203 = Static5.aClass4_Sub10_Sub1_2.method4605();
				@Pc(1212) int local1212 = Static1.anInt894 + (local1203 >> 4 & 0x7);
				@Pc(1218) int local1218 = (local1203 & 0x7) + Static1.anInt818;
				@Pc(1222) int local1222 = Static5.aClass4_Sub10_Sub1_2.method4630();
				if (local1212 >= 0 && local1218 >= 0 && local1212 < 104 && local1218 < 104) {
					@Pc(1245) Class112 local1245 = Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local1212][local1218];
					if (local1245 != null) {
						for (@Pc(1253) Class4_Sub3_Sub21 local1253 = (Class4_Sub3_Sub21) local1245.method2610(); local1253 != null; local1253 = (Class4_Sub3_Sub21) local1245.method2616()) {
							if ((local1222 & 0x7FFF) == local1253.aClass53_Sub2_1.anInt2168) {
								local1253.method4817();
								break;
							}
						}
						if (local1245.method2610() == null) {
							Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local1212][local1218] = null;
						}
						Static8.method89(local1212, local1218);
					}
				}
			} else if (Static1.anInt552 == 60) {
				@Pc(1306) int local1306 = Static5.aClass4_Sub10_Sub1_2.method4623();
				@Pc(1312) int local1312 = Static1.anInt818 + (local1306 & 0x7);
				@Pc(1320) int local1320 = (local1306 >> 4 & 0x7) + Static1.anInt894;
				@Pc(1324) int local1324 = Static5.aClass4_Sub10_Sub1_2.method4635();
				@Pc(1328) int local1328 = Static5.aClass4_Sub10_Sub1_2.method4630();
				if (local1320 >= 0 && local1312 >= 0 && local1320 < 104 && local1312 < 104) {
					@Pc(1352) Class53_Sub2 local1352 = new Class53_Sub2();
					local1352.anInt2166 = local1328;
					local1352.anInt2168 = local1324;
					if (Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local1320][local1312] == null) {
						Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local1320][local1312] = new Class112();
					}
					Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local1320][local1312].method2612(new Class4_Sub3_Sub21(local1352));
					Static8.method89(local1320, local1312);
				}
			} else if (Static1.anInt552 == 144) {
				@Pc(1403) int local1403 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(1410) int local1410 = Static1.anInt818 + (local1403 & 0x7);
				@Pc(1419) int local1419 = Static1.anInt894 + (local1403 >> 4 & 0x7);
				@Pc(1423) int local1423 = Static5.aClass4_Sub10_Sub1_2.method4616();
				if (local1423 == 65535) {
					local1423 = -1;
				}
				@Pc(1433) int local1433 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(1439) int local1439 = local1433 >> 4 & 0xF;
				@Pc(1443) int local1443 = local1433 & 0x7;
				@Pc(1447) int local1447 = Static5.aClass4_Sub10_Sub1_2.method4629();
				@Pc(1451) int local1451 = Static5.aClass4_Sub10_Sub1_2.method4629();
				if (local1419 >= 0 && local1410 >= 0 && local1419 < 104 && local1410 < 104) {
					@Pc(1474) int local1474 = local1439 + 1;
					if (local1419 - local1474 <= Static4.aClass53_Sub1_Sub1_2.anIntArray422[0] && Static4.aClass53_Sub1_Sub1_2.anIntArray422[0] <= local1474 + local1419 && local1410 - local1474 <= Static4.aClass53_Sub1_Sub1_2.anIntArray426[0] && local1410 + local1474 >= Static4.aClass53_Sub1_Sub1_2.anIntArray426[0] && Static5.anInt4120 != 0 && local1443 > 0 && Static6.anInt4457 < 50 && local1423 != -1) {
						Static4.anIntArray294[Static6.anInt4457] = local1423;
						Static7.anIntArray629[Static6.anInt4457] = local1443;
						Static3.anIntArray217[Static6.anInt4457] = local1447;
						Static4.aClass7Array1[Static6.anInt4457] = null;
						Static7.anIntArray601[Static6.anInt4457] = local1439 + (local1410 << 8) + (local1419 << 16);
						Static1.anIntArray21[Static6.anInt4457] = local1451;
						Static6.anInt4457++;
					}
				}
			} else if (Static1.anInt552 == 47) {
				@Pc(1577) int local1577 = Static5.aClass4_Sub10_Sub1_2.method4588();
				@Pc(1581) int local1581 = Static5.aClass4_Sub10_Sub1_2.method4616();
				@Pc(1585) int local1585 = Static5.aClass4_Sub10_Sub1_2.method4616();
				@Pc(1589) int local1589 = Static5.aClass4_Sub10_Sub1_2.method4623();
				@Pc(1597) int local1597 = (local1589 >> 4 & 0x7) + Static1.anInt894;
				@Pc(1603) int local1603 = Static1.anInt818 + (local1589 & 0x7);
				if (local1597 >= 0 && local1603 >= 0 && local1597 < 104 && local1603 < 104 && local1581 != Static7.anInt2022) {
					@Pc(1629) Class53_Sub2 local1629 = new Class53_Sub2();
					local1629.anInt2166 = local1585;
					local1629.anInt2168 = local1577;
					if (Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local1597][local1603] == null) {
						Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local1597][local1603] = new Class112();
					}
					Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local1597][local1603].method2612(new Class4_Sub3_Sub21(local1629));
					Static8.method89(local1597, local1603);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fh;IB)[Lclient!fe;")
	public static Class56_Sub1[] method4790(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1) {
		return Static33.method4131(arg0, arg1) ? Static26.method4358() : null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public static void method4791() {
		Static5.aByteArrayArrayArray18 = null;
		Static1.aByteArrayArrayArray1 = null;
		Static4.anIntArrayArrayArray9 = null;
		Static6.anIntArray465 = null;
		Static2.anIntArray649 = null;
		Static4.aByteArrayArrayArray15 = null;
		Static2.aByteArrayArrayArray4 = null;
		Static2.aByteArrayArrayArray3 = null;
		Static6.anIntArray491 = null;
		Static7.anIntArray650 = null;
		Static6.anIntArray523 = null;
		Static6.anIntArray549 = null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!f;III)V")
	public static void method4793(@OriginalArg(0) Class53_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt4007 == arg1 && arg1 != -1) {
			@Pc(89) Class46 local89 = Static23.method2494(arg1);
			@Pc(92) int local92 = local89.anInt1238;
			if (local92 == 1) {
				arg0.anInt3996 = arg2;
				arg0.anInt3970 = 0;
				arg0.anInt4044 = 0;
				arg0.anInt4011 = 1;
				arg0.anInt4001 = 0;
				Static29.method3461(local89, arg0.anInt4002, arg0.anInt3974, arg0.anInt3970, arg0 == Static4.aClass53_Sub1_Sub1_2);
			}
			if (local92 == 2) {
				arg0.anInt4001 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt4007 == -1 || Static23.method2494(arg1).anInt1243 >= Static23.method2494(arg0.anInt4007).anInt1243) {
			arg0.anInt4007 = arg1;
			arg0.anInt4044 = 0;
			arg0.anInt3996 = arg2;
			arg0.anInt3970 = 0;
			arg0.anInt4011 = 1;
			arg0.anInt4001 = 0;
			arg0.anInt4030 = arg0.anInt3965;
			if (arg0.anInt4007 != -1) {
				Static29.method3461(Static23.method2494(arg0.anInt4007), arg0.anInt4002, arg0.anInt3974, arg0.anInt3970, arg0 == Static4.aClass53_Sub1_Sub1_2);
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void method4794() {
		if (Static2.aClass124_1 != null) {
			synchronized (Static2.aClass124_1) {
				Static2.aClass124_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	public static void method4824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class4_Sub3_Sub9 local4 = Static12.method2322(5, arg0);
		local4.method1520();
		local4.anInt1993 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(B)V")
	public static void method4825() {
		for (@Pc(7) int local7 = -1; local7 < Static3.anInt2510; local7++) {
			@Pc(19) int local19;
			if (local7 == -1) {
				local19 = 2047;
			} else {
				local19 = Static4.anIntArray317[local7];
			}
			@Pc(29) Class53_Sub1_Sub1 local29 = Static5.aClass53_Sub1_Sub1Array1[local19];
			if (local29 != null && local29.anInt4023 > 0) {
				local29.anInt4023--;
				if (local29.anInt4023 == 0) {
					local29.aString234 = null;
				}
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static6.anInt4451; local57++) {
			@Pc(64) int local64 = Static7.anIntArray595[local57];
			@Pc(68) Class53_Sub1_Sub2 local68 = Static3.aClass53_Sub1_Sub2Array1[local64];
			if (local68 != null && local68.anInt4023 > 0) {
				local68.anInt4023--;
				if (local68.anInt4023 == 0) {
					local68.aString234 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIILclient!vc;JZ)V")
	public static void method4826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class42 local6 = new Class42();
		local6.aClass53_2 = arg4;
		local6.anInt1129 = arg1 * 128 + 64;
		local6.anInt1128 = arg2 * 128 + 64;
		local6.anInt1130 = arg3;
		local6.aLong45 = arg5;
		local6.aBoolean63 = arg6;
		if (Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub19(arg0, arg1, arg2);
		}
		Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass42_1 = local6;
	}
}

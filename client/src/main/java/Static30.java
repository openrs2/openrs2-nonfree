import java.io.IOException;
import java.net.Socket;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!fd;)V")
	public static void method3546(@OriginalArg(1) Class4_Sub10 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static3.anInt2580; local3++) {
			@Pc(14) int local14 = arg0.method4579();
			@Pc(18) int local18 = arg0.method4616();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static2.aClass63_Sub1Array1[local14] != null) {
				Static2.aClass63_Sub1Array1[local14].anInt2023 = local18;
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method3547() {
		synchronized (Static7.aClass161_1) {
			Static5.anInt4304 = Static7.anInt5311;
			Static5.anInt4279++;
			if (Static6.anInt4595 >= 0) {
				while (Static6.anInt4595 != Static4.anInt3314) {
					@Pc(25) int local25 = Static7.anIntArray596[Static4.anInt3314];
					Static4.anInt3314 = Static4.anInt3314 + 1 & 0x7F;
					if (local25 >= 0) {
						Static2.aBooleanArray4[local25] = true;
					} else {
						Static2.aBooleanArray4[~local25] = false;
					}
				}
			} else {
				for (@Pc(49) int local49 = 0; local49 < 112; local49++) {
					Static2.aBooleanArray4[local49] = false;
				}
				Static6.anInt4595 = Static4.anInt3314;
			}
			Static7.anInt5311 = Static6.anInt4861;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!fd;I)Lclient!jo;")
	public static Class4_Sub1 method3549(@OriginalArg(0) Class4_Sub10 arg0) {
		arg0.method4629();
		@Pc(13) int local13 = arg0.method4629();
		@Pc(17) Class4_Sub1 local17 = Static10.method897(local13);
		local17.anInt5832 = arg0.method4629();
		@Pc(26) int local26 = arg0.method4629();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) int local35 = arg0.method4629();
			local17.method4687(arg0, local35);
		}
		local17.method4700();
		return local17;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
	public static void method3550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class32 local7 = Static14.method1065(arg1);
		@Pc(10) int local10 = local7.anInt787;
		@Pc(13) int local13 = local7.anInt794;
		@Pc(16) int local16 = local7.anInt795;
		@Pc(39) int local39 = Class4_Sub3_Sub16.anIntArray455[local16 - local13];
		if (arg0 < 0 || arg0 > local39) {
			arg0 = 0;
		}
		@Pc(57) int local57 = local39 << local13;
		Static8.method173(local10, arg0 << local13 & local57 | ~local57 & Static1.anIntArray62[local10]);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public static void method3551() {
		try {
			if (Static5.anInt4357 == 1) {
				@Pc(19) int local19 = Static1.aClass4_Sub6_Sub2_3.method2488();
				if (local19 > 0 && Static1.aClass4_Sub6_Sub2_3.method2497()) {
					@Pc(31) int local31 = local19 - Static3.anInt5397;
					if (local31 < 0) {
						local31 = 0;
					}
					Static1.aClass4_Sub6_Sub2_3.method2479(local31);
					return;
				}
				Static1.aClass4_Sub6_Sub2_3.method2501();
				Static1.aClass4_Sub6_Sub2_3.method2484();
				if (Static2.aClass58_42 == null) {
					Static5.anInt4357 = 0;
				} else {
					Static5.anInt4357 = 2;
				}
				Static7.aClass4_Sub31_2 = null;
				Static1.aClass98_1 = null;
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static1.aClass4_Sub6_Sub2_3.method2501();
			Static7.aClass4_Sub31_2 = null;
			Static2.aClass58_42 = null;
			Static1.aClass98_1 = null;
			Static5.anInt4357 = 0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZIZILjava/lang/String;IIBJZLjava/lang/String;)V")
	public static void method3553(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) String arg9) {
		@Pc(12) int[] local12 = new int[4];
		for (@Pc(14) int local14 = 0; local14 < 3; local14++) {
			local12[local14] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(32) Class4_Sub10 local32 = new Class4_Sub10(128);
		local32.method4581(10);
		local32.method4631((arg2 ? 1 : 0) | (arg8 ? 2 : 0) | (arg0 ? 4 : 0));
		local32.method4582(arg7);
		local32.method4617(local12[0]);
		local32.method4575(arg9);
		local32.method4617(local12[1]);
		local32.method4631(Static6.anInt4938);
		local32.method4581(arg1);
		local32.method4581(arg5);
		local32.method4617(local12[2]);
		local32.method4631(arg6);
		local32.method4631(arg3);
		local32.method4617(local12[3]);
		local32.method4628(Static2.aBigInteger1, Static6.aBigInteger2);
		@Pc(118) Class4_Sub10 local118 = new Class4_Sub10(350);
		local118.method4575(arg4);
		@Pc(131) int local131 = 8 - Static19.method1791(arg4) % 8;
		for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
			local118.method4581((int) (Math.random() * 255.0D));
		}
		local118.method4627(local12);
		Static3.aClass4_Sub10_Sub1_1.anInt5709 = 0;
		Static3.aClass4_Sub10_Sub1_1.method4581(22);
		Static3.aClass4_Sub10_Sub1_1.method4631(local118.anInt5709 + local32.anInt5709 + 2);
		Static3.aClass4_Sub10_Sub1_1.method4631(550);
		Static3.aClass4_Sub10_Sub1_1.method4594(local32.aByteArray71, local32.anInt5709);
		Static3.aClass4_Sub10_Sub1_1.method4594(local118.aByteArray71, local118.anInt5709);
		Static6.anInt5173 = -3;
		Static2.anInt1213 = 0;
		Static4.anInt3409 = 0;
		Static6.anInt4759 = 1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBI[Lclient!wf;IIIII)V")
	public static void method3554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class185[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static3.aBoolean138) {
			Static18.method1693(arg8, arg6, arg5, arg4);
		} else {
			Static34.method4209(arg8, arg6, arg5, arg4);
			Static23.method2561();
		}
		for (@Pc(22) int local22 = 0; local22 < arg3.length; local22++) {
			@Pc(38) Class185 local38 = arg3[local22];
			if (local38 != null && (arg1 == local38.anInt5937 || arg1 == -1412584499 && local38 == Static1.aClass185_1)) {
				@Pc(89) int local89;
				if (arg2 == -1) {
					Static6.anIntArray540[Static1.anInt113] = local38.anInt5960 + arg0;
					Static7.anIntArray638[Static1.anInt113] = arg7 + local38.anInt5888;
					Static5.anIntArray383[Static1.anInt113] = local38.anInt5893;
					Static7.anIntArray616[Static1.anInt113] = local38.anInt5949;
					local89 = Static1.anInt113++;
				} else {
					local89 = arg2;
				}
				local38.anInt5900 = Static2.anInt954;
				local38.anInt5967 = local89;
				if (!local38.aBoolean416 || !Static12.method692(local38)) {
					if (local38.anInt5904 > 0) {
						Static10.method467(local38);
					}
					@Pc(117) int local117 = local38.anInt5903;
					@Pc(122) int local122 = local38.anInt5888 + arg7;
					@Pc(128) int local128 = local38.anInt5960 + arg0;
					if (Static1.aBoolean26 && (Static12.method687(local38).anInt3947 != 0 || local38.anInt5911 == 0) && local117 > 127) {
						local117 = 127;
					}
					if (local38 == Static1.aClass185_1) {
						if (arg1 != -1412584499 && !local38.aBoolean402) {
							Static7.anInt5589 = arg0;
							Static4.anInt3317 = arg7;
							Static4.aClass185Array3 = arg3;
							continue;
						}
						if (!local38.aBoolean402) {
							local117 = 128;
						}
						if (Static3.aBoolean173 && Static4.aBoolean232) {
							@Pc(181) int local181 = Static7.anInt6038;
							@Pc(183) int local183 = Static7.anInt5357;
							@Pc(187) int local187 = local181 - Static1.anInt777;
							@Pc(191) int local191 = local183 - Static5.anInt5204;
							if (Static6.anInt5182 > local187) {
								local187 = Static6.anInt5182;
							}
							if (local191 < Static2.anInt1633) {
								local191 = Static2.anInt1633;
							}
							if (local187 + local38.anInt5949 > Static6.anInt5182 + Static1.aClass185_2.anInt5949) {
								local187 = Static6.anInt5182 + Static1.aClass185_2.anInt5949 - local38.anInt5949;
							}
							if (Static1.aClass185_2.anInt5893 + Static2.anInt1633 < local191 + local38.anInt5893) {
								local191 = Static1.aClass185_2.anInt5893 + Static2.anInt1633 - local38.anInt5893;
							}
							local128 = local191;
							local122 = local187;
						}
					}
					@Pc(309) int local309;
					@Pc(298) int local298;
					@Pc(266) int local266;
					@Pc(259) int local259;
					if (local38.anInt5911 == 2) {
						local259 = arg6;
						local309 = arg5;
						local266 = arg8;
						local298 = arg4;
					} else {
						local259 = arg6 < local122 ? local122 : arg6;
						local266 = local128 <= arg8 ? arg8 : local128;
						@Pc(272) int local272 = local128 + local38.anInt5893;
						@Pc(278) int local278 = local122 + local38.anInt5949;
						if (local38.anInt5911 == 9) {
							local272++;
							local278++;
						}
						local298 = local278 >= arg4 ? arg4 : local278;
						local309 = local272 >= arg5 ? arg5 : local272;
					}
					if (!local38.aBoolean416 || local266 < local309 && local298 > local259) {
						if (local38.anInt5904 != 0) {
							if (local38.anInt5904 == 1337 || local38.anInt5904 == 1403) {
								Static3.anInt2047 = local128;
								Static3.aClass185_5 = local38;
								Static6.anInt4679 = local122;
								Static31.method3746(local128, local38.anInt5949, local38.anInt5904 == 1403, local38.anInt5893, local122);
								Static2.aBooleanArray8[local89] = true;
								if (Static3.aBoolean138) {
									Static18.method1693(arg8, arg6, arg5, arg4);
								} else {
									Static34.method4209(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (local38.anInt5904 == 1338) {
								if (!local38.method4738()) {
									continue;
								}
								Static33.method3010(local128, local89, local38, local122);
								if (Static3.aBoolean138) {
									Static18.method1693(arg8, arg6, arg5, arg4);
								} else {
									Static34.method4209(arg8, arg6, arg5, arg4);
								}
								if (Static5.anInt5206 != 0 && Static5.anInt5206 != 3 || Static1.aBoolean17 || Static4.anInt3341 < local266 || local259 > Static5.anInt5848 || local309 <= Static4.anInt3341 || Static5.anInt5848 >= local298) {
									continue;
								}
								@Pc(455) int local455 = Static4.anInt3341 - local128;
								@Pc(460) int local460 = Static5.anInt5848 - local122;
								@Pc(465) int local465 = local38.anIntArray672[local460];
								if (local465 > local455 || local455 > local38.anIntArray657[local460] + local465) {
									continue;
								}
								@Pc(491) int local491 = local460 - local38.anInt5949 / 2;
								@Pc(498) int local498 = Static6.anInt3585 + (int) Static5.aFloat97 & 0x7FF;
								@Pc(502) int local502 = Class109.anIntArray299[local498];
								@Pc(509) int local509 = local455 - local38.anInt5893 / 2;
								local502 = local502 * (Static6.anInt4761 + 256) >> 8;
								@Pc(521) int local521 = Class109.anIntArray298[local498];
								local521 = (Static6.anInt4761 + 256) * local521 >> 8;
								@Pc(540) int local540 = local502 * local491 + local509 * local521 >> 11;
								@Pc(551) int local551 = local521 * local491 - local502 * local509 >> 11;
								@Pc(567) int local567 = Static4.aClass53_Sub1_Sub1_2.anInt3974 + local540 + 64 - Static4.aClass53_Sub1_Sub1_2.method3311() * 64 >> 7;
								@Pc(583) int local583 = Static4.aClass53_Sub1_Sub1_2.anInt4002 + 64 - local551 - Static4.aClass53_Sub1_Sub1_2.method3311() * 64 >> 7;
								if (Static3.aBoolean177 && (Static5.anInt3560 & 0x40) != 0) {
									@Pc(597) Class185 local597 = Static23.method2425(Static1.anInt1053, Static2.anInt1367);
									if (local597 == null) {
										Static26.method4812();
									} else {
										Static16.method1497(1L, local567, local583, " ->", Static4.aString140, (short) 19, Static6.anInt4466);
									}
									continue;
								}
								if (Static2.anInt5720 == 1) {
									Static16.method1497(1L, local567, local583, "", Static3.aString139, (short) 47, -1);
								}
								Static16.method1497(1L, local567, local583, "", Static5.aString236, (short) 26, -1);
								continue;
							}
							if (local38.anInt5904 == 1339) {
								if (local38.method4738()) {
									Static35.method4309(local38, local122, local89, local128);
									if (Static3.aBoolean138) {
										Static18.method1693(arg8, arg6, arg5, arg4);
									} else {
										Static34.method4209(arg8, arg6, arg5, arg4);
									}
								}
								continue;
							}
							if (local38.anInt5904 == 1400) {
								Static20.method1928(local38.anInt5949, local122, local128, local38.anInt5893);
								Static2.aBooleanArray8[local89] = true;
								Static6.aBooleanArray24[local89] = true;
								if (Static3.aBoolean138) {
									Static18.method1693(arg8, arg6, arg5, arg4);
								} else {
									Static34.method4209(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (local38.anInt5904 == 1401) {
								Static36.method4524(local38.anInt5949, local38.anInt5893, local128, local122);
								Static2.aBooleanArray8[local89] = true;
								Static6.aBooleanArray24[local89] = true;
								if (Static3.aBoolean138) {
									Static18.method1693(arg8, arg6, arg5, arg4);
								} else {
									Static34.method4209(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (local38.anInt5904 == 1402) {
								if (!Static3.aBoolean138) {
									Static20.method1916(local122, local128);
									Static2.aBooleanArray8[local89] = true;
									Static6.aBooleanArray24[local89] = true;
								}
								continue;
							}
							if (local38.anInt5904 == 1405) {
								if (!Static3.aBoolean176) {
									continue;
								}
								@Pc(787) int local787 = local128 + local38.anInt5893;
								@Pc(791) int local791 = local122 + 15;
								Static5.aClass4_Sub3_Sub5_2.method2275("Fps:" + Static3.anInt2295, local787, local791, 16776960, -1);
								@Pc(807) Runtime local807 = Runtime.getRuntime();
								local791 += 15;
								@Pc(817) int local817 = (int) ((local807.totalMemory() - local807.freeMemory()) / 1024L);
								@Pc(819) int local819 = 16776960;
								if (local817 > 65536) {
									local819 = 16711680;
								}
								Static5.aClass4_Sub3_Sub5_2.method2275("Mem:" + local817 + "k", local787, local791, local819, -1);
								@Pc(841) int local841 = local791 + 15;
								if (Static3.aBoolean138) {
									@Pc(846) int local846 = 16776960;
									@Pc(854) int local854 = (Static4.anInt3330 + Static4.anInt3331 + Static4.anInt3333) / 1024;
									if (local854 > 65536) {
										local846 = 16711680;
									}
									Static5.aClass4_Sub3_Sub5_2.method2275("Card:" + local854 + "k", local787, local841, local846, -1);
									local841 += 15;
								}
								@Pc(881) int local881 = 0;
								@Pc(883) int local883 = 0;
								@Pc(885) int local885 = 0;
								for (@Pc(887) int local887 = 0; local887 < 29; local887++) {
									local885 += Static6.aClass62_Sub1Array2[local887].method4671();
									local881 += Static6.aClass62_Sub1Array2[local887].method4667();
									local883 += Static6.aClass62_Sub1Array2[local887].method4660();
								}
								@Pc(923) int local923 = local883 * 100 / local885;
								@Pc(929) int local929 = local881 * 10000 / local885;
								@Pc(950) String local950 = "Cache:" + Static36.method4434((long) local929, true, 2, 0) + "% (" + local923 + "%)";
								Static1.aClass4_Sub3_Sub5_1.method2275(local950, local787, local841, 16776960, -1);
								@Pc(958) int local958 = local841 + 12;
								if (Static5.anInt3504 > 0) {
									Static1.aClass4_Sub3_Sub5_1.method2275("Particles: " + Static5.anInt3505 + " / " + Static5.anInt3504, local787, local958, 16776960, -1);
								}
								@Pc(983) int local983 = local958 + 12;
								Static2.aBooleanArray8[local89] = true;
								Static6.aBooleanArray24[local89] = true;
								continue;
							}
							if (local38.anInt5904 == 1406) {
								Static1.anInt127 = local128;
								Static4.anInt2643 = local122;
								Static7.aClass185_15 = local38;
								continue;
							}
						}
						if (!Static1.aBoolean17) {
							if (local38.anInt5911 == 0 && local38.aBoolean407 && local266 <= Static4.anInt3341 && Static5.anInt5848 >= local259 && Static4.anInt3341 < local309 && local298 > Static5.anInt5848 && !Static1.aBoolean26) {
								Static6.aShortArray100[0] = 1006;
								Static6.aStringArray30[0] = Static6.aString296;
								Static6.aStringArray27[0] = "";
								Static2.anIntArray160[0] = Static7.anInt6050;
								Static7.anInt5634 = 1;
							}
							if (Static4.anInt3341 >= local266 && local259 <= Static5.anInt5848 && Static4.anInt3341 < local309 && local298 > Static5.anInt5848) {
								Static15.method1427(local38, Static5.anInt5848 - local122, Static4.anInt3341 - local128);
							}
						}
						if (local38.anInt5911 == 0) {
							if (!local38.aBoolean416 && Static12.method692(local38) && local38 != Static5.aClass185_11) {
								continue;
							}
							if (!local38.aBoolean416) {
								if (local38.anInt5887 - local38.anInt5949 < local38.anInt5931) {
									local38.anInt5931 = local38.anInt5887 - local38.anInt5949;
								}
								if (local38.anInt5931 < 0) {
									local38.anInt5931 = 0;
								}
							}
							if (Static3.aBoolean138 && local38.anInt5904 == 1407) {
								Static13.method874(local128, local122, local38.anInt5893, local38.anInt5949);
							}
							method3554(local128 - local38.anInt5932, local38.anInt5914, local89, arg3, local298, local309, local259, local122 - local38.anInt5931, local266);
							if (local38.aClass185Array4 != null) {
								method3554(local128 - local38.anInt5932, local38.anInt5914, local89, local38.aClass185Array4, local298, local309, local259, local122 - local38.anInt5931, local266);
							}
							@Pc(1207) Class4_Sub27 local1207 = (Class4_Sub27) Static4.aClass84_13.method1844((long) local38.anInt5914);
							if (local1207 != null) {
								if (local1207.anInt4619 == 0 && !Static1.aBoolean17 && Static4.anInt3341 >= local266 && Static5.anInt5848 >= local259 && local309 > Static4.anInt3341 && Static5.anInt5848 < local298 && !Static1.aBoolean26) {
									Static6.aShortArray100[0] = 1006;
									Static2.anIntArray160[0] = Static7.anInt6050;
									Static6.aStringArray30[0] = Static6.aString296;
									Static6.aStringArray27[0] = "";
									Static7.anInt5634 = 1;
								}
								Static14.method1069(local1207.anInt4620, local259, local122, local128, local298, local266, local309, local89);
							}
							if (Static3.aBoolean138 && local38.anInt5904 == 1407) {
								Static13.method880();
								Static7.aBoolean123 = true;
							}
							if (Static3.aBoolean138) {
								Static18.method1693(arg8, arg6, arg5, arg4);
							} else {
								Static34.method4209(arg8, arg6, arg5, arg4);
								Static23.method2561();
							}
						}
						if (Static1.aBooleanArray2[local89] || Static1.anInt268 > 1) {
							if (local38.anInt5911 == 0 && !local38.aBoolean416 && local38.anInt5949 < local38.anInt5887) {
								method3607(local38.anInt5949, local38.anInt5893 + local128, local38.anInt5887, local122, local38.anInt5931);
							}
							if (local38.anInt5911 != 1) {
								if (local38.anInt5911 == 2) {
									@Pc(1338) int local1338 = 0;
									for (@Pc(1340) int local1340 = 0; local1340 < local38.anInt5950; local1340++) {
										for (@Pc(1346) int local1346 = 0; local1346 < local38.anInt5927; local1346++) {
											@Pc(1359) int local1359 = local122 + (local38.anInt5964 + 32) * local1340;
											@Pc(1369) int local1369 = local128 + local1346 * (local38.anInt5943 + 32);
											if (local1338 < 20) {
												local1359 += local38.anIntArray663[local1338];
												local1369 += local38.anIntArray664[local1338];
											}
											if (local38.anIntArray660[local1338] > 0) {
												@Pc(1402) int local1402 = local38.anIntArray660[local1338] - 1;
												if (local1369 + 32 > arg8 && local1369 < arg5 && arg6 < local1359 + 32 && local1359 < arg4 || local38 == Static5.aClass185_10 && Static1.anInt91 == local1338) {
													@Pc(1463) Class4_Sub3_Sub14 local1463;
													if (Static2.anInt1334 == 1 && local1338 == Static1.anInt314 && local38.anInt5914 == Static5.anInt4302) {
														local1463 = Static37.method4676(local38.anIntArray661[local1338], 2, local38.aBoolean405, null, local1402, 0);
													} else {
														local1463 = Static37.method4676(local38.anIntArray661[local1338], 1, local38.aBoolean405, null, local1402, 3153952);
													}
													if (Static4.aBoolean218) {
														Static2.aBooleanArray8[local89] = true;
													}
													if (local1463 == null) {
														Static28.method3270(local38);
													} else if (local38 == Static5.aClass185_10 && local1338 == Static1.anInt91) {
														@Pc(1498) int local1498 = Static7.anInt5357 - Static1.anInt547;
														@Pc(1503) int local1503 = Static7.anInt6038 - Static1.anInt789;
														if (local1498 < 5 && local1498 > -5) {
															local1498 = 0;
														}
														if (local1503 < 5 && local1503 > -5) {
															local1503 = 0;
														}
														if (Static2.anInt1267 < 5) {
															local1503 = 0;
															local1498 = 0;
														}
														local1463.method4513(local1498 + local1369, local1359 + local1503, 128);
														if (arg1 != -1) {
															@Pc(1551) Class185 local1551 = arg3[arg1 & 0xFFFF];
															@Pc(1557) int local1557;
															@Pc(1555) int local1555;
															if (Static3.aBoolean138) {
																local1555 = Static3.anInt2149;
																local1557 = Static3.anInt2152;
															} else {
																local1555 = Static6.anInt5187;
																local1557 = Static6.anInt5183;
															}
															if (local1503 + local1359 < local1557 && local1551.anInt5931 > 0) {
																@Pc(1589) int local1589 = Static5.anInt4156 * (local1557 - local1359 - local1503) / 3;
																if (Static5.anInt4156 * 10 < local1589) {
																	local1589 = Static5.anInt4156 * 10;
																}
																if (local1551.anInt5931 < local1589) {
																	local1589 = local1551.anInt5931;
																}
																Static1.anInt789 += local1589;
																local1551.anInt5931 -= local1589;
																Static28.method3270(local1551);
															}
															if (local1555 < local1359 + local1503 + 32 && local1551.anInt5931 < local1551.anInt5887 - local1551.anInt5949) {
																@Pc(1662) int local1662 = (local1359 + local1503 + 32 - local1555) * Static5.anInt4156 / 3;
																if (local1662 > Static5.anInt4156 * 10) {
																	local1662 = Static5.anInt4156 * 10;
																}
																if (local1662 > local1551.anInt5887 - local1551.anInt5931 - local1551.anInt5949) {
																	local1662 = local1551.anInt5887 - local1551.anInt5931 - local1551.anInt5949;
																}
																local1551.anInt5931 += local1662;
																Static1.anInt789 -= local1662;
																Static28.method3270(local1551);
															}
														}
													} else if (local38 == Static1.aClass185_3 && local1338 == Static5.anInt3884) {
														local1463.method4513(local1369, local1359, 128);
													} else {
														local1463.method4506(local1369, local1359);
													}
												}
											} else if (local38.anIntArray658 != null && local1338 < 20) {
												@Pc(1747) Class4_Sub3_Sub14 local1747 = local38.method4724(local1338);
												if (local1747 != null) {
													local1747.method4506(local1369, local1359);
												} else if (Static3.aBoolean178) {
													Static28.method3270(local38);
												}
											}
											local1338++;
										}
									}
								} else if (local38.anInt5911 == 3) {
									@Pc(1782) int local1782;
									if (Static33.method4199(local38)) {
										local1782 = local38.anInt5902;
										if (Static5.aClass185_11 == local38 && local38.anInt5971 != 0) {
											local1782 = local38.anInt5971;
										}
									} else {
										local1782 = local38.anInt5933;
										if (Static5.aClass185_11 == local38 && local38.anInt5966 != 0) {
											local1782 = local38.anInt5966;
										}
									}
									if (local117 == 0) {
										if (local38.aBoolean413) {
											if (Static3.aBoolean138) {
												Static18.method1701(local128, local122, local38.anInt5893, local38.anInt5949, local1782);
											} else {
												Static33.method4205(local128, local122, local38.anInt5893, local38.anInt5949, local1782);
											}
										} else if (Static3.aBoolean138) {
											Static18.method1690(local128, local122, local38.anInt5893, local38.anInt5949, local1782);
										} else {
											Static34.method4222(local128, local122, local38.anInt5893, local38.anInt5949, local1782);
										}
									} else if (local38.aBoolean413) {
										if (Static3.aBoolean138) {
											Static18.method1691(local128, local122, local38.anInt5893, local38.anInt5949, local1782, 256 - (local117 & 0xFF));
										} else {
											Static34.method4213(local128, local122, local38.anInt5893, local38.anInt5949, local1782, 256 - (local117 & 0xFF));
										}
									} else if (Static3.aBoolean138) {
										Static18.method1684(local128, local122, local38.anInt5893, local38.anInt5949, local1782, 256 - (local117 & 0xFF));
									} else {
										Static34.method4221(local128, local122, local38.anInt5893, local38.anInt5949, local1782, 256 - (local117 & 0xFF));
									}
								} else if (local38.anInt5911 == 4) {
									@Pc(1944) Class4_Sub3_Sub5 local1944 = local38.method4734(Static3.aClass56Array3);
									if (local1944 != null) {
										@Pc(1957) String local1957 = local38.aString351;
										@Pc(1964) int local1964;
										if (Static33.method4199(local38)) {
											local1964 = local38.anInt5902;
											if (local38 == Static5.aClass185_11 && local38.anInt5971 != 0) {
												local1964 = local38.anInt5971;
											}
											if (local38.aString350.length() > 0) {
												local1957 = local38.aString350;
											}
										} else {
											local1964 = local38.anInt5933;
											if (local38 == Static5.aClass185_11 && local38.anInt5966 != 0) {
												local1964 = local38.anInt5966;
											}
										}
										if (local38.aBoolean416 && local38.anInt5938 != -1) {
											@Pc(2008) Class162 local2008 = Static35.method4361(local38.anInt5938);
											local1957 = local2008.aString308;
											if (local1957 == null) {
												local1957 = "null";
											}
											if ((local2008.anInt5075 == 1 || local38.anInt5962 != 1) && local38.anInt5962 != -1) {
												local1957 = "<col=ff9040>" + local1957 + "</col> x" + Static26.method4816(local38.anInt5962);
											}
										}
										if (Static6.aClass185_14 == local38) {
											local1957 = Static3.aString124;
											local1964 = local38.anInt5933;
										}
										if (!local38.aBoolean416) {
											local1957 = Static19.method1820(local38, local1957);
										}
										local1944.method2255(local1957, local128, local122, local38.anInt5893, local38.anInt5949, local1964, local38.aBoolean415 ? 0 : -1, local38.anInt5924, local38.anInt5922, local38.anInt5948);
									} else if (Static3.aBoolean178) {
										Static28.method3270(local38);
									}
								} else if (local38.anInt5911 == 5) {
									if (!local38.aBoolean416) {
										@Pc(2106) Class4_Sub3_Sub14 local2106 = local38.method4729(Static33.method4199(local38));
										if (local2106 != null) {
											local2106.method4506(local128, local122);
										} else if (Static3.aBoolean178) {
											Static28.method3270(local38);
										}
									} else if (local38.anInt5972 >= 0) {
										@Pc(2619) Class47 local2619 = local38.method4726();
										if (Static3.aBoolean138) {
											local2619.method1025(0, local128, local122, local38.anInt5893, local38.anInt5949, local38.anInt5965, local38.anInt5917, 0);
										} else {
											local2619.method1024(0, local128, local122, local38.anInt5893, local38.anInt5949, local38.anInt5965, local38.anInt5917);
										}
									} else {
										@Pc(2137) Class4_Sub3_Sub14 local2137;
										if (local38.anInt5938 == -1) {
											local2137 = local38.method4729(false);
										} else if (local38.aBoolean419 && Static4.aClass53_Sub1_Sub1_2.aClass144_2 != null) {
											local2137 = Static37.method4676(local38.anInt5962, local38.anInt5975, local38.aBoolean405, Static4.aClass53_Sub1_Sub1_2.aClass144_2, local38.anInt5938, local38.anInt5934);
										} else {
											local2137 = Static37.method4676(local38.anInt5962, local38.anInt5975, local38.aBoolean405, null, local38.anInt5938, local38.anInt5934);
										}
										if (local2137 != null) {
											@Pc(2182) int local2182 = local2137.anInt5602;
											@Pc(2185) int local2185 = local2137.anInt5612;
											if (local38.aBoolean410) {
												@Pc(2197) int local2197 = (local2182 + local38.anInt5893 - 1) / local2182;
												@Pc(2207) int local2207 = (local38.anInt5949 + local2185 - 1) / local2185;
												if (Static3.aBoolean138) {
													Static18.method1692(local128, local122, local128 + local38.anInt5893, local122 + local38.anInt5949);
													@Pc(2226) boolean local2226 = Static36.method4408(local2137.anInt5609);
													@Pc(2229) Class4_Sub3_Sub14_Sub2 local2229 = (Class4_Sub3_Sub14_Sub2) local2137;
													@Pc(2234) boolean local2234 = Static36.method4408(local2137.anInt5608);
													if (local2226 && local2234) {
														if (local117 == 0) {
															local2229.method4518(local128, local122, local2197, local2207);
														} else {
															local2229.method4514(local128, local122, 256 - (local117 & 0xFF), local2197, local2207);
														}
													} else if (local2226) {
														for (@Pc(2377) int local2377 = 0; local2377 < local2207; local2377++) {
															if (local117 == 0) {
																local2229.method4518(local128, local2377 * local2185 + local122, local2197, 1);
															} else {
																local2229.method4514(local128, local2185 * local2377 + local122, 256 - (local117 & 0xFF), local2197, 1);
															}
														}
													} else if (local2234) {
														for (@Pc(2329) int local2329 = 0; local2329 < local2197; local2329++) {
															if (local117 == 0) {
																local2229.method4518(local128 + local2329 * local2182, local122, 1, local2207);
															} else {
																local2229.method4514(local128 + local2329 * local2182, local122, 256 - (local117 & 0xFF), 1, local2207);
															}
														}
													} else {
														for (@Pc(2270) int local2270 = 0; local2270 < local2197; local2270++) {
															for (@Pc(2275) int local2275 = 0; local2275 < local2207; local2275++) {
																if (local117 == 0) {
																	local2137.method4506(local2182 * local2270 + local128, local2275 * local2185 + local122);
																} else {
																	local2137.method4513(local2270 * local2182 + local128, local2275 * local2185 + local122, 256 - (local117 & 0xFF));
																}
															}
														}
													}
													Static18.method1693(arg8, arg6, arg5, arg4);
												} else {
													Static34.method4220(local128, local122, local38.anInt5893 + local128, local122 + local38.anInt5949);
													for (@Pc(2434) int local2434 = 0; local2434 < local2197; local2434++) {
														for (@Pc(2439) int local2439 = 0; local2439 < local2207; local2439++) {
															if (local38.anInt5958 != 0) {
																local2137.method4509(local122 + local2439 * local2185 + local2185 / 2, local38.anInt5958, local2434 * local2182 + local128 + local2182 / 2, 4096);
															} else if (local117 == 0) {
																local2137.method4506(local128 + local2434 * local2182, local122 + local2439 * local2185);
															} else {
																local2137.method4513(local2434 * local2182 + local128, local2185 * local2439 + local122, 256 - (local117 & 0xFF));
															}
														}
													}
													Static34.method4209(arg8, arg6, arg5, arg4);
												}
											} else {
												@Pc(2533) int local2533 = local38.anInt5893 * 4096 / local2182;
												if (local38.anInt5958 != 0) {
													local2137.method4509(local122 + local38.anInt5949 / 2, local38.anInt5958, local38.anInt5893 / 2 + local128, local2533);
												} else if (local117 != 0) {
													local2137.method4504(local128, local122, local38.anInt5893, local38.anInt5949, 256 - (local117 & 0xFF));
												} else if (local38.anInt5893 == local2182 && local2185 == local38.anInt5949) {
													local2137.method4506(local128, local122);
												} else {
													local2137.method4507(local128, local122, local38.anInt5893, local38.anInt5949);
												}
											}
										} else if (Static3.aBoolean178) {
											Static28.method3270(local38);
										}
									}
								} else if (local38.anInt5911 == 6) {
									@Pc(2663) boolean local2663 = Static33.method4199(local38);
									@Pc(2665) Class53_Sub4 local2665 = null;
									@Pc(2670) int local2670;
									if (local2663) {
										local2670 = local38.anInt5910;
									} else {
										local2670 = local38.anInt5891;
									}
									@Pc(2677) int local2677 = 0;
									if (local38.anInt5938 != -1) {
										@Pc(2687) Class162 local2687 = Static35.method4361(local38.anInt5938);
										if (local2687 != null) {
											@Pc(2695) Class162 local2695 = local2687.method4124(local38.anInt5962);
											@Pc(2704) Class46 local2704 = local2670 == -1 ? null : Static23.method2494(local2670);
											if (local38.aBoolean419 && Static4.aClass53_Sub1_Sub1_2.aClass144_2 != null) {
												local2665 = local2695.method4123(local38.anInt5892, 1, local38.anInt5979, Static4.aClass53_Sub1_Sub1_2.aClass144_2, local2704, local38.anInt5897);
											} else {
												local2665 = local2695.method4123(local38.anInt5892, 1, local38.anInt5979, null, local2704, local38.anInt5897);
											}
											if (local2665 == null) {
												Static28.method3270(local38);
											} else {
												local2677 = -local2665.method3813() / 2;
											}
										}
									} else if (local38.anInt5939 == 5) {
										if (local38.anInt5895 == -1) {
											local2665 = Static1.aClass144_1.method3608(null, -1, -1, -1, null, -1, false, 0, null, true, 0);
										} else {
											@Pc(2817) int local2817 = local38.anInt5895 & 0x7FF;
											if (Static7.anInt2022 == local2817) {
												local2817 = 2047;
											}
											@Pc(2827) Class53_Sub1_Sub1 local2827 = Static5.aClass53_Sub1_Sub1Array1[local2817];
											@Pc(2838) Class46 local2838 = local2670 == -1 ? null : Static23.method2494(local2670);
											if (local2827 != null && (int) Static18.method1746(local2827.aString88) << 11 == (local38.anInt5895 & 0xFFFFF800)) {
												local2665 = local2827.aClass144_2.method3608(null, 0, -1, -1, null, local38.anInt5892, false, 0, local2838, true, 0);
											}
										}
									} else if (local2670 == -1) {
										local2665 = local38.method4723(null, Static4.aClass53_Sub1_Sub1_2.aClass144_2, -1, -1, 0, local2663);
										if (local2665 == null && Static3.aBoolean178) {
											Static28.method3270(local38);
										}
									} else {
										@Pc(2765) Class46 local2765 = Static23.method2494(local2670);
										local2665 = local38.method4723(local2765, Static4.aClass53_Sub1_Sub1_2.aClass144_2, local38.anInt5979, local38.anInt5892, local38.anInt5897, local2663);
										if (local2665 == null && Static3.aBoolean178) {
											Static28.method3270(local38);
										}
									}
									if (local2665 != null) {
										@Pc(2894) int local2894;
										if (local38.anInt5957 <= 0) {
											local2894 = 256;
										} else {
											local2894 = (local38.anInt5893 << 8) / local38.anInt5957;
										}
										@Pc(2912) int local2912;
										if (local38.anInt5920 <= 0) {
											local2912 = 256;
										} else {
											local2912 = (local38.anInt5949 << 8) / local38.anInt5920;
										}
										@Pc(2938) int local2938 = local122 + local38.anInt5949 / 2 + (local38.anInt5921 * local2912 >> 8);
										@Pc(2952) int local2952 = (local38.anInt5907 * local2894 >> 8) + local38.anInt5893 / 2 + local128;
										if (Static3.aBoolean138) {
											if (local38.aBoolean418) {
												Static17.method1598(local2952, local2938, local38.anInt5918, local38.aShort50, local2894, local2912);
											} else {
												Static17.method1599(local2952, local2938, local2894, local2912);
												Static17.method1621((float) local38.aShort49, (float) local38.aShort50 * 1.5F);
											}
											Static17.method1618();
											Static16.method1588(true);
											Static16.method1593(false);
											Static23.method2416(Static1.anInt185);
											if (Static7.aBoolean123) {
												Static18.method1698();
												Static17.method1603();
												Static18.method1693(arg8, arg6, arg5, arg4);
												Static7.aBoolean123 = false;
											}
											if (local38.aBoolean411) {
												Static16.method1589();
											}
											@Pc(3115) int local3115 = Class109.anIntArray298[local38.anInt5944] * local38.anInt5918 >> 16;
											@Pc(3125) int local3125 = local38.anInt5918 * Class109.anIntArray299[local38.anInt5944] >> 16;
											if (local38.aBoolean416) {
												local2665.method3822(local38.anInt5976, local38.anInt5886, local38.anInt5944, local38.anInt5963, local38.anInt5906 + local2677 + local3125, local3115 + local38.anInt5906, -1L);
											} else {
												local2665.method3822(local38.anInt5976, 0, local38.anInt5944, 0, local3125, local3115, -1L);
											}
											if (local38.aBoolean411) {
												Static16.method1591();
											}
										} else {
											Static23.method2556(local2952, local2938);
											@Pc(2967) int local2967 = local38.anInt5918 * Class109.anIntArray298[local38.anInt5944] >> 16;
											@Pc(2977) int local2977 = Class109.anIntArray299[local38.anInt5944] * local38.anInt5918 >> 16;
											if (!local38.aBoolean416) {
												local2665.method3822(local38.anInt5976, 0, local38.anInt5944, 0, local2977, local2967, -1L);
											} else if (local38.aBoolean418) {
												((Class53_Sub4_Sub1) local2665).method2911(local38.anInt5976, local38.anInt5886, local38.anInt5944, local38.anInt5963, local2977 + local2677 + local38.anInt5906, local2967 + local38.anInt5906, local38.anInt5918);
											} else {
												local2665.method3822(local38.anInt5976, local38.anInt5886, local38.anInt5944, local38.anInt5963, local2677 + local2977 + local38.anInt5906, local2967 + local38.anInt5906, -1L);
											}
											Static23.method2555();
										}
									}
								} else {
									if (local38.anInt5911 == 7) {
										@Pc(3183) Class4_Sub3_Sub5 local3183 = local38.method4734(Static3.aClass56Array3);
										if (local3183 == null) {
											if (Static3.aBoolean178) {
												Static28.method3270(local38);
											}
											continue;
										}
										@Pc(3195) int local3195 = 0;
										for (@Pc(3197) int local3197 = 0; local3197 < local38.anInt5950; local3197++) {
											for (@Pc(3203) int local3203 = 0; local3203 < local38.anInt5927; local3203++) {
												if (local38.anIntArray660[local3195] > 0) {
													@Pc(3224) Class162 local3224 = Static35.method4361(local38.anIntArray660[local3195] - 1);
													@Pc(3246) String local3246;
													if (local3224.anInt5075 != 1 && local38.anIntArray661[local3195] == 1) {
														local3246 = "<col=ff9040>" + local3224.aString308 + "</col>";
													} else {
														local3246 = "<col=ff9040>" + local3224.aString308 + "</col> x" + Static26.method4816(local38.anIntArray661[local3195]);
													}
													@Pc(3276) int local3276 = local128 + local3203 * (local38.anInt5943 + 115);
													@Pc(3285) int local3285 = (local38.anInt5964 + 12) * local3197 + local122;
													if (local38.anInt5924 == 0) {
														local3183.method2259(local3246, local3276, local3285, local38.anInt5933, local38.aBoolean415 ? 0 : -1);
													} else if (local38.anInt5924 == 1) {
														local3183.method2271(local3246, local3276 + 57, local3285, local38.anInt5933, local38.aBoolean415 ? 0 : -1);
													} else {
														local3183.method2275(local3246, local3276 + 114, local3285, local38.anInt5933, local38.aBoolean415 ? 0 : -1);
													}
												}
												local3195++;
											}
										}
									}
									if (local38.anInt5911 == 8 && Static2.aClass185_4 == local38 && Static4.anInt3493 == Static5.anInt5840) {
										@Pc(3363) int local3363 = 0;
										@Pc(3365) Class4_Sub3_Sub5 local3365 = Static5.aClass4_Sub3_Sub5_2;
										@Pc(3367) int local3367 = 0;
										@Pc(3370) String local3370 = local38.aString351;
										@Pc(3375) String local3375 = Static19.method1820(local38, local3370);
										while (local3375.length() > 0) {
											@Pc(3385) int local3385 = local3375.indexOf("<br>");
											@Pc(3394) String local3394;
											if (local3385 == -1) {
												local3394 = local3375;
												local3375 = "";
											} else {
												local3394 = local3375.substring(0, local3385);
												local3375 = local3375.substring(local3385 + 4);
											}
											@Pc(3410) int local3410 = local3365.method2252(local3394);
											if (local3410 > local3363) {
												local3363 = local3410;
											}
											local3367 += local3365.anInt2820 + 1;
										}
										@Pc(3429) int local3429 = local3367 + 7;
										@Pc(3430) int local3430 = local3363 + 6;
										@Pc(3437) int local3437 = local122 + local38.anInt5949 + 5;
										if (arg4 < local3429 + local3437) {
											local3437 = arg4 - local3429;
										}
										@Pc(3461) int local3461 = local128 + local38.anInt5893 - local3430 - 5;
										if (local3461 < local128 + 5) {
											local3461 = local128 + 5;
										}
										if (local3430 + local3461 > arg5) {
											local3461 = arg5 - local3430;
										}
										if (Static3.aBoolean138) {
											Static18.method1701(local3461, local3437, local3430, local3429, 16777120);
											Static18.method1690(local3461, local3437, local3430, local3429, 0);
										} else {
											Static33.method4205(local3461, local3437, local3430, local3429, 16777120);
											Static34.method4222(local3461, local3437, local3430, local3429, 0);
										}
										@Pc(3524) int local3524 = local3365.anInt2820 + local3437 + 2;
										@Pc(3527) String local3527 = local38.aString351;
										@Pc(3532) String local3532 = Static19.method1820(local38, local3527);
										while (local3532.length() > 0) {
											@Pc(3539) int local3539 = local3532.indexOf("<br>");
											@Pc(3548) String local3548;
											if (local3539 == -1) {
												local3548 = local3532;
												local3532 = "";
											} else {
												local3548 = local3532.substring(0, local3539);
												local3532 = local3532.substring(local3539 + 4);
											}
											local3365.method2259(local3548, local3461 + 3, local3524, 0, -1);
											local3524 += local3365.anInt2820 + 1;
										}
									}
									if (local38.anInt5911 == 9) {
										@Pc(3592) int local3592;
										@Pc(3601) int local3601;
										@Pc(3596) int local3596;
										if (local38.aBoolean409) {
											local3592 = local38.anInt5893 + local128;
											local3596 = local122;
											local3601 = local38.anInt5949 + local122;
										} else {
											local3592 = local128 + local38.anInt5893;
											local3596 = local122 + local38.anInt5949;
											local3601 = local122;
										}
										if (local38.anInt5899 == 1) {
											if (Static3.aBoolean138) {
												Static18.method1683(local128, local3601, local3592, local3596, local38.anInt5933);
											} else {
												Static33.method4204(local128, local3601, local3592, local3596, local38.anInt5933);
											}
										} else if (Static3.aBoolean138) {
											Static18.method1687(local128, local3601, local3592, local3596, local38.anInt5933, local38.anInt5899);
										} else {
											Static34.method4215(local128, local3601, local3592, local3596, local38.anInt5933, local38.anInt5899);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public static void method3555() {
		Static3.aClass26_21.method511();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILclient!f;)V")
	public static void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class53_Sub1_Sub1 arg2) {
		if ((arg1 & 0x1) != 0) {
			@Pc(14) int local14 = Static5.aClass4_Sub10_Sub1_2.method4579();
			@Pc(18) int local18 = Static5.aClass4_Sub10_Sub1_2.method4629();
			arg2.method3304(Static2.anInt954, local18, local14);
			arg2.anInt3993 = Static2.anInt954 + 300;
			arg2.anInt4022 = Static5.aClass4_Sub10_Sub1_2.method4589();
		}
		if ((arg1 & 0x2) != 0) {
			@Pc(43) int local43 = Static5.aClass4_Sub10_Sub1_2.method4616();
			if (local43 == 65535) {
				local43 = -1;
			}
			@Pc(53) int local53 = Static5.aClass4_Sub10_Sub1_2.method4629();
			Static38.method4793(arg2, local43, local53);
		}
		if ((arg1 & 0x8) != 0) {
			@Pc(68) int local68 = Static5.aClass4_Sub10_Sub1_2.method4589();
			@Pc(71) byte[] local71 = new byte[local68];
			@Pc(76) Class4_Sub10 local76 = new Class4_Sub10(local71);
			Static5.aClass4_Sub10_Sub1_2.method4600(local71, local68);
			Static6.aClass4_Sub10Array1[arg0] = local76;
			arg2.method1170(local76);
		}
		if ((arg1 & 0x4) != 0) {
			arg2.anInt4014 = Static5.aClass4_Sub10_Sub1_2.method4635();
			arg2.anInt4003 = Static5.aClass4_Sub10_Sub1_2.method4616();
		}
		if ((arg1 & 0x800) != 0) {
			@Pc(117) int local117 = Static5.aClass4_Sub10_Sub1_2.method4623();
			@Pc(120) int[] local120 = new int[local117];
			@Pc(123) int[] local123 = new int[local117];
			@Pc(126) int[] local126 = new int[local117];
			for (@Pc(128) int local128 = 0; local128 < local117; local128++) {
				@Pc(135) int local135 = Static5.aClass4_Sub10_Sub1_2.method4616();
				if (local135 == 65535) {
					local135 = -1;
				}
				local120[local128] = local135;
				local123[local128] = Static5.aClass4_Sub10_Sub1_2.method4605();
				local126[local128] = Static5.aClass4_Sub10_Sub1_2.method4588();
			}
			Static32.method4023(local126, arg2, local123, local120);
		}
		if ((arg1 & 0x10) != 0) {
			arg2.aString234 = Static5.aClass4_Sub10_Sub1_2.method4593();
			if (arg2.aString234.charAt(0) == '~') {
				arg2.aString234 = arg2.aString234.substring(1);
				Static26.method4357(arg2.method1173(), 2, arg2.aString234);
			} else if (arg2 == Static4.aClass53_Sub1_Sub1_2) {
				Static26.method4357(arg2.method1173(), 2, arg2.aString234);
			}
			arg2.anInt3998 = 0;
			arg2.anInt3981 = 0;
			arg2.anInt4023 = 150;
		}
		if ((arg1 & 0x20) != 0) {
			@Pc(232) int local232 = Static5.aClass4_Sub10_Sub1_2.method4630();
			@Pc(236) int local236 = Static5.aClass4_Sub10_Sub1_2.method4623();
			@Pc(244) boolean local244 = (local232 & 0x8000) != 0;
			@Pc(248) int local248 = Static5.aClass4_Sub10_Sub1_2.method4605();
			@Pc(251) int local251 = Static5.aClass4_Sub10_Sub1_2.anInt5709;
			if (arg2.aString88 != null && arg2.aClass144_2 != null) {
				@Pc(264) long local264 = Static18.method1746(arg2.aString88);
				@Pc(266) boolean local266 = false;
				if (local236 <= 1) {
					if (!local244 && (Static1.aBoolean47 && !Static5.aBoolean287 || Static2.aBoolean67)) {
						local266 = true;
					} else {
						for (@Pc(284) int local284 = 0; local284 < Static6.anInt4516; local284++) {
							if (local264 == Static3.aLongArray16[local284]) {
								local266 = true;
								break;
							}
						}
					}
				}
				if (!local266 && Static3.anInt5405 == 0) {
					Static5.aClass4_Sub10_8.anInt5709 = 0;
					@Pc(314) int local314 = -1;
					Static5.aClass4_Sub10_Sub1_2.method4634(local248, Static5.aClass4_Sub10_8.aByteArray71);
					Static5.aClass4_Sub10_8.anInt5709 = 0;
					@Pc(333) String local333;
					if (local244) {
						local232 &= 32767;
						@Pc(343) Class27 local343 = Static24.method2701(Static5.aClass4_Sub10_8);
						local314 = local343.anInt540;
						local333 = local343.aClass4_Sub3_Sub11_1.method1909(Static5.aClass4_Sub10_8);
					} else {
						local333 = Static17.method2265(method3569(Static8.method110(Static5.aClass4_Sub10_8)));
					}
					arg2.aString234 = local333.trim();
					arg2.anInt3998 = local232 & 0xFF;
					arg2.anInt4023 = 150;
					arg2.anInt3981 = local232 >> 8;
					if (local236 == 2) {
						Static25.method2927("<img=1>" + arg2.method1173(), local314, null, local244 ? 17 : 1, local333);
					} else if (local236 == 1) {
						Static25.method2927("<img=0>" + arg2.method1173(), local314, null, local244 ? 17 : 1, local333);
					} else {
						Static25.method2927(arg2.method1173(), local314, null, local244 ? 17 : 2, local333);
					}
				}
			}
			Static5.aClass4_Sub10_Sub1_2.anInt5709 = local251 + local248;
		}
		if ((arg1 & 0x100) != 0) {
			@Pc(450) int local450 = Static5.aClass4_Sub10_Sub1_2.method4635();
			@Pc(454) int local454 = Static5.aClass4_Sub10_Sub1_2.method4595();
			@Pc(456) boolean local456 = true;
			if (local450 == 65535) {
				local450 = -1;
			}
			if (local450 != -1 && arg2.anInt3961 != -1 && Static23.method2494(Static21.method2004(local450).anInt3134).anInt1243 < Static23.method2494(Static21.method2004(arg2.anInt3961).anInt3134).anInt1243) {
				local456 = false;
			}
			if (local456) {
				arg2.anInt3976 = 1;
				arg2.anInt3971 = local454 >> 16;
				arg2.anInt3968 = 0;
				arg2.anInt4026 = 0;
				arg2.anInt3984 = (local454 & 0xFFFF) + Static2.anInt954;
				if (Static2.anInt954 < arg2.anInt3984) {
					arg2.anInt4026 = -1;
				}
				arg2.anInt3961 = local450;
				if (arg2.anInt3961 != -1 && Static2.anInt954 == arg2.anInt3984) {
					@Pc(553) int local553 = Static21.method2004(arg2.anInt3961).anInt3134;
					if (local553 != -1) {
						@Pc(562) Class46 local562 = Static23.method2494(local553);
						if (local562 != null && local562.anIntArray95 != null) {
							Static29.method3461(local562, arg2.anInt4002, arg2.anInt3974, 0, arg2 == Static4.aClass53_Sub1_Sub1_2);
						}
					}
				}
			}
		}
		if ((arg1 & 0x40) != 0) {
			arg2.anInt3985 = Static5.aClass4_Sub10_Sub1_2.method4630();
			if (arg2.anInt3985 == 65535) {
				arg2.anInt3985 = -1;
			}
		}
		if ((arg1 & 0x200) != 0) {
			arg2.anInt3973 = Static5.aClass4_Sub10_Sub1_2.method4623();
			arg2.anInt4033 = Static5.aClass4_Sub10_Sub1_2.method4629();
			arg2.anInt4013 = Static5.aClass4_Sub10_Sub1_2.method4605();
			arg2.anInt4025 = Static5.aClass4_Sub10_Sub1_2.method4623();
			arg2.anInt4034 = Static5.aClass4_Sub10_Sub1_2.method4588() + Static2.anInt954;
			arg2.anInt3966 = Static5.aClass4_Sub10_Sub1_2.method4588() + Static2.anInt954;
			arg2.anInt4008 = Static5.aClass4_Sub10_Sub1_2.method4589();
			arg2.anInt3965 = 1;
			arg2.anInt4030 = 0;
		}
		if ((arg1 & 0x400) != 0) {
			@Pc(670) int local670 = Static5.aClass4_Sub10_Sub1_2.method4579();
			@Pc(674) int local674 = Static5.aClass4_Sub10_Sub1_2.method4629();
			arg2.method3304(Static2.anInt954, local674, local670);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(CZ)C")
	private static char method3568(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method3569(@OriginalArg(1) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(12) char[] local12 = new char[local4];
		@Pc(18) byte local18 = 2;
		for (@Pc(20) int local20 = 0; local20 < local4; local20++) {
			@Pc(27) char local27 = arg0.charAt(local20);
			if (local18 == 0) {
				local27 = Character.toLowerCase(local27);
			} else if (local18 == 2 || Character.isUpperCase(local27)) {
				local27 = method3568(local27);
			}
			if (Character.isLetter(local27)) {
				local18 = 0;
			} else if (local27 == '.' || local27 == '?' || local27 == '!') {
				local18 = 2;
			} else if (!Character.isSpaceChar(local27)) {
				local18 = 1;
			} else if (local18 != 2) {
				local18 = 1;
			}
			local12[local20] = local27;
		}
		return new String(local12);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIZIIIII)V")
	public static void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (@Pc(12) int local12 = 0; local12 < 104; local12++) {
				Static7.anIntArrayArray48[local7][local12] = 0;
				Static1.anIntArrayArray9[local7][local12] = 99999999;
			}
		}
		@Pc(37) int local37 = arg2;
		Static7.anIntArrayArray48[arg4][arg2] = 99;
		Static1.anIntArrayArray9[arg4][arg2] = 0;
		@Pc(51) int local51 = arg4;
		@Pc(53) int local53 = 0;
		@Pc(55) byte local55 = 0;
		@Pc(57) boolean local57 = false;
		Static6.anIntArray479[0] = arg4;
		@Pc(64) int local64 = local55 + 1;
		Static4.anIntArray653[0] = arg2;
		@Pc(77) int[][] local77 = Static7.aClass30Array1[Static7.anInt5334].anIntArrayArray6;
		while (local64 != local53) {
			local51 = Static6.anIntArray479[local53];
			local37 = Static4.anIntArray653[local53];
			local53 = local53 + 1 & 0xFFF;
			if (arg0 == local51 && local37 == arg5) {
				local57 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static7.aClass30Array1[Static7.anInt5334].method574(arg5, arg6, local37, local51, arg0, 2, arg3 - 1)) {
					local57 = true;
					break;
				}
				if (arg3 < 10 && Static7.aClass30Array1[Static7.anInt5334].method577(arg0, local51, arg5, local37, arg3 - 1, arg6, 2)) {
					local57 = true;
					break;
				}
			}
			if (arg1 != 0 && arg8 != 0 && Static7.aClass30Array1[Static7.anInt5334].method570(local37, arg7, 2, arg5, arg0, arg8, arg1, local51)) {
				local57 = true;
				break;
			}
			@Pc(201) int local201 = Static1.anIntArrayArray9[local51][local37] + 1;
			if (local51 > 0 && Static7.anIntArrayArray48[local51 - 1][local37] == 0 && (local77[local51 - 1][local37] & 0x2C010E) == 0 && (local77[local51 - 1][local37 + 1] & 0x2C0138) == 0) {
				Static6.anIntArray479[local64] = local51 - 1;
				Static4.anIntArray653[local64] = local37;
				Static7.anIntArrayArray48[local51 - 1][local37] = 2;
				Static1.anIntArrayArray9[local51 - 1][local37] = local201;
				local64 = local64 + 1 & 0xFFF;
			}
			if (local51 < 102 && Static7.anIntArrayArray48[local51 + 1][local37] == 0 && (local77[local51 + 2][local37] & 0x2C0183) == 0 && (local77[local51 + 2][local37 + 1] & 0x2C01E0) == 0) {
				Static6.anIntArray479[local64] = local51 + 1;
				Static4.anIntArray653[local64] = local37;
				Static7.anIntArrayArray48[local51 + 1][local37] = 8;
				local64 = local64 + 1 & 0xFFF;
				Static1.anIntArrayArray9[local51 + 1][local37] = local201;
			}
			if (local37 > 0 && Static7.anIntArrayArray48[local51][local37 - 1] == 0 && (local77[local51][local37 - 1] & 0x2C010E) == 0 && (local77[local51 + 1][local37 - 1] & 0x2C0183) == 0) {
				Static6.anIntArray479[local64] = local51;
				Static4.anIntArray653[local64] = local37 - 1;
				Static7.anIntArrayArray48[local51][local37 - 1] = 1;
				local64 = local64 + 1 & 0xFFF;
				Static1.anIntArrayArray9[local51][local37 - 1] = local201;
			}
			if (local37 < 102 && Static7.anIntArrayArray48[local51][local37 + 1] == 0 && (local77[local51][local37 + 2] & 0x2C0138) == 0 && (local77[local51 + 1][local37 + 2] & 0x2C01E0) == 0) {
				Static6.anIntArray479[local64] = local51;
				Static4.anIntArray653[local64] = local37 + 1;
				local64 = local64 + 1 & 0xFFF;
				Static7.anIntArrayArray48[local51][local37 + 1] = 4;
				Static1.anIntArrayArray9[local51][local37 + 1] = local201;
			}
			if (local51 > 0 && local37 > 0 && Static7.anIntArrayArray48[local51 - 1][local37 - 1] == 0 && (local77[local51 - 1][local37] & 0x2C013E) == 0 && (local77[local51 - 1][local37 - 1] & 0x2C010E) == 0 && (local77[local51][local37 - 1] & 0x2C018F) == 0) {
				Static6.anIntArray479[local64] = local51 - 1;
				Static4.anIntArray653[local64] = local37 - 1;
				local64 = local64 + 1 & 0xFFF;
				Static7.anIntArrayArray48[local51 - 1][local37 - 1] = 3;
				Static1.anIntArrayArray9[local51 - 1][local37 - 1] = local201;
			}
			if (local51 < 102 && local37 > 0 && Static7.anIntArrayArray48[local51 + 1][local37 - 1] == 0 && (local77[local51 + 1][local37 - 1] & 0x2C018F) == 0 && (local77[local51 + 2][local37 - 1] & 0x2C0183) == 0 && (local77[local51 + 2][local37] & 0x2C01E3) == 0) {
				Static6.anIntArray479[local64] = local51 + 1;
				Static4.anIntArray653[local64] = local37 - 1;
				local64 = local64 + 1 & 0xFFF;
				Static7.anIntArrayArray48[local51 + 1][local37 - 1] = 9;
				Static1.anIntArrayArray9[local51 + 1][local37 - 1] = local201;
			}
			if (local51 > 0 && local37 < 102 && Static7.anIntArrayArray48[local51 - 1][local37 + 1] == 0 && (local77[local51 - 1][local37 + 1] & 0x2C013E) == 0 && (local77[local51 - 1][local37 + 2] & 0x2C0138) == 0 && (local77[local51][local37 + 2] & 0x2C01F8) == 0) {
				Static6.anIntArray479[local64] = local51 - 1;
				Static4.anIntArray653[local64] = local37 + 1;
				local64 = local64 + 1 & 0xFFF;
				Static7.anIntArrayArray48[local51 - 1][local37 + 1] = 6;
				Static1.anIntArrayArray9[local51 - 1][local37 + 1] = local201;
			}
			if (local51 < 102 && local37 < 102 && Static7.anIntArrayArray48[local51 + 1][local37 + 1] == 0 && (local77[local51 + 1][local37 + 2] & 0x2C01F8) == 0 && (local77[local51 + 2][local37 + 2] & 0x2C01E0) == 0 && (local77[local51 + 2][local37 + 1] & 0x2C01E3) == 0) {
				Static6.anIntArray479[local64] = local51 + 1;
				Static4.anIntArray653[local64] = local37 + 1;
				local64 = local64 + 1 & 0xFFF;
				Static7.anIntArrayArray48[local51 + 1][local37 + 1] = 12;
				Static1.anIntArrayArray9[local51 + 1][local37 + 1] = local201;
			}
		}
		if (!local57) {
			@Pc(920) int local920 = 1000;
			@Pc(922) int local922 = 100;
			for (@Pc(928) int local928 = arg0 - 10; local928 <= arg0 + 10; local928++) {
				for (@Pc(938) int local938 = arg5 - 10; local938 <= arg5 + 10; local938++) {
					if (local928 >= 0 && local938 >= 0 && local928 < 104 && local938 < 104 && Static1.anIntArrayArray9[local928][local938] < 100) {
						@Pc(970) int local970 = 0;
						@Pc(972) int local972 = 0;
						if (arg0 > local928) {
							local970 = arg0 - local928;
						} else if (arg1 + arg0 - 1 < local928) {
							local970 = local928 + 1 - arg1 - arg0;
						}
						if (local938 < arg5) {
							local972 = arg5 - local938;
						} else if (local938 > arg8 + arg5 - 1) {
							local972 = local938 + 1 - arg8 - arg5;
						}
						@Pc(1049) int local1049 = local970 * local970 + local972 * local972;
						if (local920 > local1049 || local1049 == local920 && local922 > Static1.anIntArrayArray9[local928][local938]) {
							local922 = Static1.anIntArrayArray9[local928][local938];
							local37 = local938;
							local51 = local928;
							local920 = local1049;
						}
					}
				}
			}
			if (local920 == 1000) {
				return;
			}
			if (arg4 == local51 && arg2 == local37) {
				return;
			}
		}
		Static3.aBoolean147 = false;
		Static6.anInt4506 = local51;
		Static3.anInt2140 = local37;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method419(@OriginalArg(0) String arg0) {
		Static6.aString261 = arg0;
		if (Static7.aClass196_4.applet == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static7.aClass196_4.applet.getParameter("cookieprefix");
			@Pc(24) String local24 = Static7.aClass196_4.applet.getParameter("cookiehost");
			@Pc(39) String local39 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			@Pc(54) String local54;
			if (arg0.length() == 0) {
				local54 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local54 = local39 + "; Expires=" + Static12.method742(MonotonicClock.currentTimeMillis() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Class86.method1853("document.cookie=\"" + local54 + "\"", Static7.aClass196_4.applet);
		} catch (@Pc(92) Throwable local92) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method420() {
		Static6.aClass26_50.method511();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method423(@OriginalArg(1) long arg0) {
		return Static35.method4319(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(CI)Z")
	public static boolean method424(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(27) int local27 = 0;
			@Pc(29) char[] local29 = Static6.aCharArray3;
			while (local27 < local29.length) {
				@Pc(37) char local37 = local29[local27];
				if (arg0 == local37) {
					return true;
				}
				local27++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method425() {
		Static3.aString115 = "Fallen lassen";
		Static6.aString293 = "leuchten2:";
		Static1.aString8 = "Schließen";
		Static1.aString23 = "Verbindung zum Update-Server hergestellt.";
		Static7.aString344 = "rot:";
		Static4.aString160 = "Speicher wird zugewiesen.";
		Static3.aString148 = " weitere Optionen";
		Static3.aString121 = "Wordpack geladen.";
		Static5.aString240 = "Titelbild geladen.";
		Static1.aString7 = "Standardinstellungen geladen";
		Static5.aString37 = "Auswählen";
		Static6.aString275 = "Suche nach Updates - ";
		Static2.aString68 = "Lade...";
		Static1.aString56 = "Lade Titelbild - ";
		Static4.aString201 = "Weiter";
		Static7.aString369 = "Lade Sprites - ";
		Static6.aString260 = "Bitte entferne ";
		Static6.aString290 = "Lade Texturen - ";
		Static3.aString133 = "Gegenstand für Mitglieder";
		Static5.aString314 = "Benutzen";
		Static2.aString80 = "Liste der Welten geladen";
		Static4.aString210 = "OpenRS2 wird geladen - bitte warten...";
		Static5.aString230 = "M";
		Static2.aString82 = "Lade Wordpack - ";
		Static7.aString364 = "Verbindung mit Update-Server...";
		Static2.aString83 = "Starte 3D-Softwarebibliothek.";
		Static3.aString154 = "welle:";
		Static1.aString38 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static6.aString282 = "Okay";
		Static4.aString170 = "schütteln:";
		Static7.aString329 = "Lade Benutzeroberfläche - ";
		Static3.aString149 = "Lade Standardeinstellungen - ";
		Static3.aString128 = " steht bereits auf deiner Ignorieren-Liste!";
		Static3.aString112 = "3D-Softwarebibliothek gestartet.";
		Static1.aString49 = "M";
		Static1.aString46 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static3.aString325 = "grün:";
		Static5.aString233 = "Lade Schriftsätze - ";
		Static4.aString179 = "weiss:";
		Static7.aString317 = "Spielwelt erstellt.";
		Static1.aString55 = ": ";
		Static5.aString235 = "scrollen:";
		Static6.aString276 = "Spieler kann nicht gefunden werden: ";
		Static3.aString147 = "Titelbild geöffnet.";
		Static1.aString30 = "Lade Konfiguration - ";
		Static4.aString211 = "Musik-Engine vorbereitet.";
		Static4.aString187 = "Ladevorgang - bitte warte.";
		Static3.aString120 = "Angreifen";
		Static3.aString146 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static3.aString113 = " zuerst von deiner Freunde-Liste!";
		Static4.aString203 = "leuchten1:";
		Static4.aString206 = "Lade Liste der Welten";
		Static7.aString315 = "blinken3:";
		Static5.aString250 = "leuchten3:";
		Static3.aString118 = "möchte mit dir handeln.";
		Static3.aString139 = "Hierhin drehen";
		Static5.aString239 = "T";
		Static6.aString265 = "Sprites geladen.";
		Static1.aString6 = "Hierhin gehen";
		Static4.aString202 = "Wähl eine Option";
		Static6.aString266 = "blinken1:";
		Static5.aString249 = " loggt sich ein.";
		Static5.aString224 = " loggt sich aus.";
		Static4.aString185 = "Versteckt";
		Static6.aString298 = "blaugrün:";
		Static4.aString199 = "Update-Liste geladen.";
		Static4.aString200 = "Eingabeprozedur geladen.";
		Static3.aString124 = "Bitte warte...";
		Static4.aString207 = "Verbindung abgebrochen.";
		Static6.aString296 = "Abbrechen";
		Static6.aString267 = "welle2:";
		Static7.aString348 = "Stufe: ";
		Static4.aString161 = "T";
		Static1.aString22 = "Untersuchen";
		Static5.aString218 = "Schriftsätze geladen.";
		Static1.aString11 = "Ablegen";
		Static6.aString262 = "Zugewiesener Speicher.";
		Static3.aString150 = "Benutzeroberfläche geladen.";
		Static7.aString320 = "Fertigkeit: ";
		Static4.aString205 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static3.aString142 = "gleiten:";
		Static7.aString347 = " steht bereits auf deiner Freunde-Liste!";
		Static3.aString122 = "Bitte entferne ";
		Static7.aString343 = "blinken2:";
		Static6.aString193 = "Mechscape wird geladen - bitte warten...";
		Static4.aString368 = "Konfig geladen.";
		Static1.aString26 = "Nehmen";
		Static7.aString363 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static5.aString256 = "Texturen geladen.";
		Static1.aString43 = "gelb:";
		Static5.aString324 = "lila:";
		Static1.aString29 = "Kampfstufe: ";
		Static4.aString180 = " zuerst von deiner Ignorieren-Liste!";
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)V")
	public static void method3594() {
		Static6.aClass26_52.method517(5);
		Static2.aClass26_11.method517(5);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
	public static void method3596() {
		@Pc(1) GL local1 = Static3.aGL1;
		local1.glDisableClientState(GL.GL_COLOR_ARRAY);
		Static17.method1610(false);
		local1.glDisable(GL.GL_DEPTH_TEST);
		local1.glPushAttrib(GL.GL_FOG_BIT);
		local1.glFogf(GL.GL_FOG_START, 3072.0F);
		Static16.method1589();
		for (@Pc(19) int local19 = 0; local19 < Static3.aClass4_Sub12ArrayArray1[0].length; local19++) {
			@Pc(31) Class4_Sub12 local31 = Static3.aClass4_Sub12ArrayArray1[0][local19];
			if (local31.anInt2356 >= 0 && Static32.method3920(Static4.anInterface4_1.method444(local31.anInt2356))) {
				local1.glColor4fv(Static16.method1553(local31.anInt2351), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean162 ? 1.0F : 0.5F);
				local31.method1867(Static1.aClass4_Sub19ArrayArrayArray1, local58, true);
			}
		}
		local1.glEnableClientState(GL.GL_COLOR_ARRAY);
		Static17.method1618();
		local1.glEnable(GL.GL_DEPTH_TEST);
		local1.glPopAttrib();
		Static16.method1591();
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)V")
	public static void method3597() {
		Static35.method4310();
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			Static7.aClass30Array1[local12].method579();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method3598(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		arg0 = arg0.toLowerCase();
		@Pc(10) int local10 = 0;
		@Pc(13) short[] local13 = new short[16];
		for (@Pc(21) int local21 = 0; local21 < Static5.anInt6072; local21++) {
			@Pc(28) Class162 local28 = Static35.method4361(local21);
			if ((!arg1 || local28.aBoolean349) && local28.anInt5089 == -1 && local28.anInt5077 == -1 && local28.anInt5056 == 0 && local28.aString308.toLowerCase().indexOf(arg0) != -1) {
				if (local10 >= 250) {
					Static2.anInt5734 = -1;
					Static7.aShortArray114 = null;
					return;
				}
				if (local13.length <= local10) {
					@Pc(80) short[] local80 = new short[local13.length * 2];
					for (@Pc(82) int local82 = 0; local82 < local10; local82++) {
						local80[local82] = local13[local82];
					}
					local13 = local80;
				}
				local13[local10++] = (short) local21;
			}
		}
		Static2.anInt5734 = local10;
		Static4.anInt3497 = 0;
		Static7.aShortArray114 = local13;
		@Pc(118) String[] local118 = new String[Static2.anInt5734];
		for (@Pc(120) int local120 = 0; local120 < Static2.anInt5734; local120++) {
			local118[local120] = Static35.method4361(local13[local120]).aString308;
		}
		Static12.method714(Static7.aShortArray114, local118);
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V")
	public static void method3599() {
		Static3.aClass26_19.method511();
		Static5.aClass26_43.method511();
		Static7.aClass26_18.method511();
		Static4.aClass26_32.method511();
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(B)V")
	public static void method3600() {
		if (Static3.anInt2574 == 0 || Static3.anInt2574 == 5) {
			return;
		}
		try {
			if (++Static6.anInt4458 > 2000) {
				if (Static3.aClass52_7 != null) {
					Static3.aClass52_7.method1103();
					Static3.aClass52_7 = null;
				}
				if (Static5.anInt3570 >= 1) {
					Static3.anInt2574 = 0;
					Static2.anInt1641 = -5;
					return;
				}
				if (Static6.anInt4866 == Static3.anInt2194) {
					Static6.anInt4866 = Static5.anInt4045;
				} else {
					Static6.anInt4866 = Static3.anInt2194;
				}
				Static5.anInt3570++;
				Static3.anInt2574 = 1;
				Static6.anInt4458 = 0;
			}
			if (Static3.anInt2574 == 1) {
				Static7.aClass197_5 = Static7.aClass196_4.openSocket(Static6.aString292, Static6.anInt4866);
				Static3.anInt2574 = 2;
			}
			if (Static3.anInt2574 == 2) {
				if (Static7.aClass197_5.status == 2) {
					throw new IOException();
				}
				if (Static7.aClass197_5.status != 1) {
					return;
				}
				Static3.aClass52_7 = new Class52((Socket) Static7.aClass197_5.result, Static7.aClass196_4);
				Static7.aClass197_5 = null;
				@Pc(111) long local111 = Static1.aLong23 = Static18.method1746(Static3.aString132);
				@Pc(118) int local118 = (int) (local111 >> 16 & 0x1FL);
				Static3.aClass4_Sub10_Sub1_1.anInt5709 = 0;
				Static3.aClass4_Sub10_Sub1_1.method4581(14);
				Static3.aClass4_Sub10_Sub1_1.method4581(local118);
				Static3.aClass52_7.method1107(Static3.aClass4_Sub10_Sub1_1.aByteArray71, 2);
				if (Static1.aClass102_1 != null) {
					Static1.aClass102_1.method2996();
				}
				if (Static6.aClass102_2 != null) {
					Static6.aClass102_2.method2996();
				}
				@Pc(152) int local152 = Static3.aClass52_7.method1105();
				if (Static1.aClass102_1 != null) {
					Static1.aClass102_1.method2996();
				}
				if (Static6.aClass102_2 != null) {
					Static6.aClass102_2.method2996();
				}
				if (local152 != 0) {
					Static2.anInt1641 = local152;
					Static3.anInt2574 = 0;
					Static3.aClass52_7.method1103();
					Static3.aClass52_7 = null;
					return;
				}
				Static3.anInt2574 = 3;
			}
			if (Static3.anInt2574 == 3) {
				if (Static3.aClass52_7.method1101() < 8) {
					return;
				}
				@Pc(197) int[] local197 = new int[4];
				Static3.aClass52_7.method1099(0, Static5.aClass4_Sub10_Sub1_2.aByteArray71, 8);
				Static5.aClass4_Sub10_Sub1_2.anInt5709 = 0;
				Static6.aLong127 = Static5.aClass4_Sub10_Sub1_2.method4622();
				local197[1] = (int) (Math.random() * 9.9999999E7D);
				local197[3] = (int) Static6.aLong127;
				local197[0] = (int) (Math.random() * 9.9999999E7D);
				Static3.aClass4_Sub10_Sub1_1.anInt5709 = 0;
				local197[2] = (int) (Static6.aLong127 >> 32);
				Static3.aClass4_Sub10_Sub1_1.method4581(10);
				Static3.aClass4_Sub10_Sub1_1.method4617(local197[0]);
				Static3.aClass4_Sub10_Sub1_1.method4617(local197[1]);
				Static3.aClass4_Sub10_Sub1_1.method4617(local197[2]);
				Static3.aClass4_Sub10_Sub1_1.method4617(local197[3]);
				Static3.aClass4_Sub10_Sub1_1.method4582(Static18.method1746(Static3.aString132));
				Static3.aClass4_Sub10_Sub1_1.method4575(Static2.aString76);
				Static3.aClass4_Sub10_Sub1_1.method4628(Static2.aBigInteger1, Static6.aBigInteger2);
				Static5.aClass4_Sub10_Sub1_3.anInt5709 = 0;
				if (Static4.anInt3304 == 40) {
					Static5.aClass4_Sub10_Sub1_3.method4581(18);
				} else {
					Static5.aClass4_Sub10_Sub1_3.method4581(16);
				}
				Static5.aClass4_Sub10_Sub1_3.method4631(Static3.aClass4_Sub10_Sub1_1.anInt5709 + Static19.method1791(Static6.aString261) + 163);
				Static5.aClass4_Sub10_Sub1_3.method4617(550);
				Static5.aClass4_Sub10_Sub1_3.method4581(Static1.anInt1047);
				Static5.aClass4_Sub10_Sub1_3.method4581(Static1.aBoolean52 ? 1 : 0);
				Static5.aClass4_Sub10_Sub1_3.method4581(1);
				Static5.aClass4_Sub10_Sub1_3.method4581(Static11.method557());
				Static5.aClass4_Sub10_Sub1_3.method4631(Static1.anInt526);
				Static5.aClass4_Sub10_Sub1_3.method4631(Static1.anInt690);
				Static5.aClass4_Sub10_Sub1_3.method4581(Static2.anInt1125);
				Static32.method3949(Static5.aClass4_Sub10_Sub1_3);
				Static5.aClass4_Sub10_Sub1_3.method4575(Static6.aString261);
				Static5.aClass4_Sub10_Sub1_3.method4617(Static6.anInt4938);
				Static5.aClass4_Sub10_Sub1_3.method4617(Static25.method2806());
				Static2.aBoolean104 = true;
				Static5.aClass4_Sub10_Sub1_3.method4631(Static7.anInt5426);
				Static5.aClass4_Sub10_Sub1_3.method4617(Static3.aClass58_46.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static4.aClass58_66.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static2.aClass58_39.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static2.aClass58_27.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static6.aClass58_92.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static3.aClass58_47.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static7.aClass58_98.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static4.aClass58_69.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static1.aClass58_4.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static2.aClass58_29.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static6.aClass58_71.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static3.aClass58_57.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static4.aClass58_73.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static4.aClass58_67.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static5.aClass58_78.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static5.aClass58_83.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static4.aClass58_76.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static7.aClass58_96.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static6.aClass58_88.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static5.aClass58_79.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static1.aClass58_1.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static1.aClass58_24.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static1.aClass58_10.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static5.aClass58_82.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static6.aClass58_87.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static1.aClass58_30.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static4.aClass58_68.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static7.aClass58_102.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4617(Static5.aClass58_80.method1369());
				Static5.aClass4_Sub10_Sub1_3.method4594(Static3.aClass4_Sub10_Sub1_1.aByteArray71, Static3.aClass4_Sub10_Sub1_1.anInt5709);
				Static3.aClass52_7.method1107(Static5.aClass4_Sub10_Sub1_3.aByteArray71, Static5.aClass4_Sub10_Sub1_3.anInt5709);
				Static3.aClass4_Sub10_Sub1_1.method4639(local197);
				for (@Pc(594) int local594 = 0; local594 < 4; local594++) {
					local197[local594] += 50;
				}
				Static5.aClass4_Sub10_Sub1_2.method4639(local197);
				Static3.anInt2574 = 4;
			}
			if (Static3.anInt2574 == 4) {
				if (Static3.aClass52_7.method1101() < 1) {
					return;
				}
				@Pc(626) int local626 = Static3.aClass52_7.method1105();
				if (local626 == 21) {
					Static3.anInt2574 = 7;
				} else if (local626 == 29) {
					Static3.anInt2574 = 10;
				} else if (local626 == 1) {
					Static2.anInt1641 = local626;
					Static3.anInt2574 = 5;
					return;
				} else if (local626 == 2) {
					Static3.anInt2574 = 8;
				} else if (local626 == 15) {
					Static2.anInt1641 = local626;
					Static3.anInt2574 = 0;
					return;
				} else if (local626 == 23 && Static5.anInt3570 < 1) {
					Static3.anInt2574 = 1;
					Static6.anInt4458 = 0;
					Static5.anInt3570++;
					Static3.aClass52_7.method1103();
					Static3.aClass52_7 = null;
					return;
				} else {
					Static2.anInt1641 = local626;
					Static3.anInt2574 = 0;
					Static3.aClass52_7.method1103();
					Static3.aClass52_7 = null;
					return;
				}
			}
			if (Static3.anInt2574 == 6) {
				Static3.aClass4_Sub10_Sub1_1.anInt5709 = 0;
				Static3.aClass4_Sub10_Sub1_1.method4650(17);
				Static3.aClass52_7.method1107(Static3.aClass4_Sub10_Sub1_1.aByteArray71, Static3.aClass4_Sub10_Sub1_1.anInt5709);
				Static3.anInt2574 = 4;
				return;
			}
			if (Static3.anInt2574 == 7) {
				if (Static3.aClass52_7.method1101() >= 1) {
					Static3.anInt2582 = Static3.aClass52_7.method1105() * 60 + 180;
					Static3.anInt2574 = 0;
					Static2.anInt1641 = 21;
					Static3.aClass52_7.method1103();
					Static3.aClass52_7 = null;
					return;
				}
				return;
			}
			if (Static3.anInt2574 == 10) {
				if (Static3.aClass52_7.method1101() < 1) {
					return;
				}
				Static5.anInt4324 = Static3.aClass52_7.method1105();
				Static2.anInt1641 = 29;
				Static3.anInt2574 = 0;
				Static3.aClass52_7.method1103();
				Static3.aClass52_7 = null;
				return;
			}
			if (Static3.anInt2574 == 8) {
				if (Static3.aClass52_7.method1101() < 14) {
					return;
				}
				Static3.aClass52_7.method1099(0, Static5.aClass4_Sub10_Sub1_2.aByteArray71, 14);
				Static5.aClass4_Sub10_Sub1_2.anInt5709 = 0;
				Static3.anInt2576 = Static5.aClass4_Sub10_Sub1_2.method4629();
				Static2.anInt1877 = Static5.aClass4_Sub10_Sub1_2.method4629();
				Static1.aBoolean47 = Static5.aClass4_Sub10_Sub1_2.method4629() == 1;
				Static5.aBoolean287 = Static5.aClass4_Sub10_Sub1_2.method4629() == 1;
				Static4.aBoolean241 = Static5.aClass4_Sub10_Sub1_2.method4629() == 1;
				Static2.aBoolean67 = Static5.aClass4_Sub10_Sub1_2.method4629() == 1;
				Static5.aBoolean277 = Static5.aClass4_Sub10_Sub1_2.method4629() == 1;
				Static7.anInt2022 = Static5.aClass4_Sub10_Sub1_2.method4616();
				Static7.aBoolean399 = Static5.aClass4_Sub10_Sub1_2.method4629() == 1;
				Static7.aBoolean370 = Static5.aClass4_Sub10_Sub1_2.method4629() == 1;
				Static33.method4132(Static7.aBoolean370);
				Static23.method2453(Static7.aBoolean370);
				Static19.method4378(Static7.aBoolean370);
				if (!Static1.aBoolean52) {
					if (Static1.aBoolean47 && !Static4.aBoolean241 || Static7.aBoolean399) {
						try {
							Class86.method1851(Static7.aClass196_4.applet, "zap");
						} catch (@Pc(906) Throwable local906) {
						}
					} else {
						try {
							Class86.method1851(Static7.aClass196_4.applet, "unzap");
						} catch (@Pc(916) Throwable local916) {
						}
					}
				}
				try {
					Class86.method1851(Static7.aClass196_4.applet, "loggedin");
				} catch (@Pc(924) Throwable local924) {
				}
				Static1.anInt552 = Static5.aClass4_Sub10_Sub1_2.method4646();
				Static1.anInt1052 = Static5.aClass4_Sub10_Sub1_2.method4616();
				Static3.anInt2574 = 9;
			}
			if (Static3.anInt2574 == 9) {
				if (Static3.aClass52_7.method1101() >= Static1.anInt1052) {
					Static5.aClass4_Sub10_Sub1_2.anInt5709 = 0;
					Static3.aClass52_7.method1099(0, Static5.aClass4_Sub10_Sub1_2.aByteArray71, Static1.anInt1052);
					Static2.anInt1641 = 2;
					Static3.anInt2574 = 0;
					Static11.method559();
					Static4.anInt3360 = -1;
					Static33.method4089(false);
					Static1.anInt552 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(975) IOException local975) {
			if (Static3.aClass52_7 != null) {
				Static3.aClass52_7.method1103();
				Static3.aClass52_7 = null;
			}
			if (Static5.anInt3570 < 1) {
				Static5.anInt3570++;
				Static3.anInt2574 = 1;
				if (Static3.anInt2194 == Static6.anInt4866) {
					Static6.anInt4866 = Static5.anInt4045;
				} else {
					Static6.anInt4866 = Static3.anInt2194;
				}
				Static6.anInt4458 = 0;
			} else {
				Static3.anInt2574 = 0;
				Static2.anInt1641 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public static void method3601() {
		Static6.aClass26_51.method511();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)I")
	public static int method3603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(32) int local32 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local32;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBIIII)V")
	private static void method3607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg0 - 32) * arg0 / arg2;
		Static5.aClass56Array5[0].method2815(arg1, arg3);
		if (local11 < 8) {
			local11 = 8;
		}
		Static5.aClass56Array5[1].method2815(arg1, arg0 + arg3 - 16);
		@Pc(53) int local53 = arg4 * (arg0 - local11 - 32) / (arg2 - arg0);
		if (!Static3.aBoolean138) {
			Static33.method4205(arg1, arg3 + 16, 16, arg0 - 32, Static3.anInt2193);
			Static33.method4205(arg1, arg3 + local53 + 16, 16, local11, Static2.anInt1360);
			Static34.method4212(arg1, local53 + arg3 + 16, local11, Static2.anInt1221);
			Static34.method4212(arg1 + 1, arg3 + local53 + 16, local11, Static2.anInt1221);
			Static34.method4214(arg1, arg3 + local53 + 16, 16, Static2.anInt1221);
			Static34.method4214(arg1, arg3 + local53 + 17, 16, Static2.anInt1221);
			Static34.method4212(arg1 + 15, local53 + arg3 + 16, local11, Static5.anInt3907);
			Static34.method4212(arg1 + 14, local53 + arg3 + 17, local11 - 1, Static5.anInt3907);
			Static34.method4214(arg1, local11 + local53 + arg3 + 15, 16, Static5.anInt3907);
			Static34.method4214(arg1 + 1, local53 + arg3 + local11 + 14, 15, Static5.anInt3907);
			return;
		}
		Static18.method1701(arg1, arg3 + 16, 16, arg0 - 32, Static3.anInt2193);
		Static18.method1701(arg1, arg3 + local53 + 16, 16, local11, Static2.anInt1360);
		Static18.method1688(arg1, local53 + arg3 + 16, local11, Static2.anInt1221);
		Static18.method1688(arg1 + 1, arg3 + local53 + 16, local11, Static2.anInt1221);
		Static18.method1699(arg1, arg3 + local53 + 16, 16, Static2.anInt1221);
		Static18.method1699(arg1, local53 + arg3 + 17, 16, Static2.anInt1221);
		Static18.method1688(arg1 + 15, arg3 + local53 + 16, local11, Static5.anInt3907);
		Static18.method1688(arg1 + 14, arg3 + local53 + 17, local11 - 1, Static5.anInt3907);
		Static18.method1699(arg1, local11 + arg3 + local53 + 15, 16, Static5.anInt3907);
		Static18.method1699(arg1 + 1, local11 + arg3 + local53 + 14, 15, Static5.anInt3907);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
	public static int method3614(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(32) int local32 = arg1.length();
		@Pc(34) int local34 = 0;
		for (@Pc(42) int local42 = 0; local42 < local32; local42++) {
			@Pc(53) char local53 = arg1.charAt(local42);
			if (local42 == 0) {
				if (local53 == '-') {
					local27 = true;
					continue;
				}
				if (local53 == '+') {
					continue;
				}
			}
			@Pc(98) int local98;
			if (local53 >= '0' && local53 <= '9') {
				local98 = local53 - '0';
			} else if (local53 >= 'A' && local53 <= 'Z') {
				local98 = local53 - '7';
			} else if (local53 >= 'a' && local53 <= 'z') {
				local98 = local53 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local98) {
				throw new NumberFormatException();
			}
			if (local27) {
				local98 = -local98;
			}
			@Pc(132) int local132 = local98 + arg0 * local34;
			if (local132 / arg0 != local34) {
				throw new NumberFormatException();
			}
			local29 = true;
			local34 = local132;
		}
		if (!local29) {
			throw new NumberFormatException();
		}
		return local34;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V")
	public static void method3615(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Static1.anInt1047 = arg2;
		Static3.aString132 = arg1;
		Static2.aString76 = arg0;
		if (Static3.aString132.equals("") || Static2.aString76.equals("")) {
			Static2.anInt1641 = 3;
		} else if (Static6.anInt4846 == -1) {
			Static4.anInt2974 = 0;
			Static6.anInt5117 = 1;
			Static2.anInt1641 = -3;
			Static5.anInt4216 = 0;
			@Pc(50) Class4_Sub10 local50 = new Class4_Sub10(128);
			local50.method4581(10);
			local50.method4617((int) (Math.random() * 9.9999999E7D));
			local50.method4582(Static18.method1746(Static3.aString132));
			local50.method4617((int) (Math.random() * 9.9999999E7D));
			local50.method4575(Static2.aString76);
			local50.method4617((int) (Math.random() * 9.9999999E7D));
			local50.method4628(Static2.aBigInteger1, Static6.aBigInteger2);
			Static3.aClass4_Sub10_Sub1_1.anInt5709 = 0;
			Static3.aClass4_Sub10_Sub1_1.method4581(24);
			Static3.aClass4_Sub10_Sub1_1.method4581(local50.anInt5709 + 2);
			Static3.aClass4_Sub10_Sub1_1.method4631(550);
			Static3.aClass4_Sub10_Sub1_1.method4594(local50.aByteArray71, local50.anInt5709);
		} else {
			Static8.method101();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!wf;IIIIIII)V")
	public static void method3619(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = arg3 * arg3 + arg5 * arg5;
		if (arg1 < local18) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg0.anInt5893 / 2, arg0.anInt5949 / 2);
		if (local18 <= local37 * local37) {
			Static11.method525(arg2, arg0, arg4, arg5, arg3, Static1.aClass4_Sub3_Sub14Array3[arg6]);
			return;
		}
		@Pc(43) int local43 = local37 - 10;
		@Pc(50) int local50 = Static6.anInt3585 + (int) Static5.aFloat97 & 0x7FF;
		@Pc(54) int local54 = Class109.anIntArray298[local50];
		local54 = local54 * 256 / (Static6.anInt4761 + 256);
		@Pc(66) int local66 = Class109.anIntArray299[local50];
		local66 = local66 * 256 / (Static6.anInt4761 + 256);
		@Pc(85) int local85 = local54 * arg3 - arg5 * local66 >> 16;
		@Pc(95) int local95 = arg5 * local54 + local66 * arg3 >> 16;
		@Pc(101) double local101 = Math.atan2((double) local95, (double) local85);
		@Pc(108) int local108 = (int) ((double) local43 * Math.sin(local101));
		@Pc(115) int local115 = (int) ((double) local43 * Math.cos(local101));
		if (Static3.aBoolean138) {
			((Class4_Sub3_Sub14_Sub2) Static2.aClass4_Sub3_Sub14Array9[arg6]).method4520((arg2 + arg0.anInt5893 / 2 + local108) * 16, (arg4 + arg0.anInt5949 / 2 - local115) * 16, (int) (local101 * 10430.378D));
		} else {
			((Class4_Sub3_Sub14_Sub1) Static2.aClass4_Sub3_Sub14Array9[arg6]).method2173(arg2 + arg0.anInt5893 / 2 + local108 - 10, arg0.anInt5949 / 2 + arg4 - local115 - 10, local101);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fh;)Z")
	private static boolean method3628(@OriginalArg(0) Class58 arg0) {
		if (!Static6.aBoolean308) {
			@Pc(7) byte[] local7 = arg0.method1372(0, 0);
			if (local7 == null) {
				return false;
			}
			method3630(local7);
			Static6.aBoolean308 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([BI)V")
	public static void method3629(@OriginalArg(0) byte[] arg0) {
		Static6.aByteArray59 = arg0;
		Static6.anInt4418 = 0;
		Static6.anInt4421 = 0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([B)V")
	private static void method3630(@OriginalArg(0) byte[] arg0) {
		method3629(arg0);
		Static6.anInt4413 = 0x1 << method3637(4);
		Static6.anInt4415 = 0x1 << method3637(4);
		Static6.aFloatArray50 = new float[Static6.anInt4415];
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			@Pc(26) int local26 = local17 == 0 ? Static6.anInt4413 : Static6.anInt4415;
			@Pc(30) int local30 = local26 >> 1;
			@Pc(34) int local34 = local26 >> 2;
			@Pc(38) int local38 = local26 >> 3;
			@Pc(41) float[] local41 = new float[local30];
			for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
				local41[local43 * 2] = (float) Math.cos((double) (local43 * 4) * 3.141592653589793D / (double) local26);
				local41[local43 * 2 + 1] = -((float) Math.sin((double) (local43 * 4) * 3.141592653589793D / (double) local26));
			}
			@Pc(86) float[] local86 = new float[local30];
			for (@Pc(88) int local88 = 0; local88 < local34; local88++) {
				local86[local88 * 2] = (float) Math.cos((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
				local86[local88 * 2 + 1] = (float) Math.sin((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
			}
			@Pc(138) float[] local138 = new float[local34];
			for (@Pc(140) int local140 = 0; local140 < local38; local140++) {
				local138[local140 * 2] = (float) Math.cos((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26);
				local138[local140 * 2 + 1] = -((float) Math.sin((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26));
			}
			@Pc(187) int[] local187 = new int[local38];
			@Pc(193) int local193 = Static24.method2700(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static23.method2426(local195, local193);
			}
			if (local17 == 0) {
				Static6.aFloatArray46 = local41;
				Static6.aFloatArray49 = local86;
				Static6.aFloatArray47 = local138;
				Static6.anIntArray469 = local187;
			} else {
				Static6.aFloatArray48 = local41;
				Static6.aFloatArray51 = local86;
				Static6.aFloatArray45 = local138;
				Static6.anIntArray470 = local187;
			}
		}
		@Pc(233) int local233 = method3637(8) + 1;
		Static6.aClass132Array1 = new Class132[local233];
		for (@Pc(238) int local238 = 0; local238 < local233; local238++) {
			Static6.aClass132Array1[local238] = new Class132();
		}
		@Pc(254) int local254 = method3637(6) + 1;
		for (@Pc(256) int local256 = 0; local256 < local254; local256++) {
			method3637(16);
		}
		@Pc(269) int local269 = method3637(6) + 1;
		Static6.aClass18Array1 = new Class18[local269];
		for (@Pc(274) int local274 = 0; local274 < local269; local274++) {
			Static6.aClass18Array1[local274] = new Class18();
		}
		@Pc(290) int local290 = method3637(6) + 1;
		Static6.aClass155Array1 = new Class155[local290];
		for (@Pc(295) int local295 = 0; local295 < local290; local295++) {
			Static6.aClass155Array1[local295] = new Class155();
		}
		@Pc(311) int local311 = method3637(6) + 1;
		Static6.aClass149Array1 = new Class149[local311];
		for (@Pc(316) int local316 = 0; local316 < local311; local316++) {
			Static6.aClass149Array1[local316] = new Class149();
		}
		@Pc(332) int local332 = method3637(6) + 1;
		Static6.aBooleanArray23 = new boolean[local332];
		Static6.anIntArray468 = new int[local332];
		for (@Pc(340) int local340 = 0; local340 < local332; local340++) {
			Static6.aBooleanArray23[local340] = method3632() != 0;
			method3637(16);
			method3637(16);
			Static6.anIntArray468[local340] = method3637(8);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "()I")
	public static int method3632() {
		@Pc(7) int local7 = Static6.aByteArray59[Static6.anInt4418] >> Static6.anInt4421 & 0x1;
		Static6.anInt4421++;
		Static6.anInt4418 += Static6.anInt4421 >> 3;
		Static6.anInt4421 &= 7;
		return local7;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)F")
	public static float method3634(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fh;II)Lclient!qn;")
	public static Class4_Sub24 method3636(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3628(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1372(arg1, arg2);
			return local16 == null ? null : new Class4_Sub24(local16);
		} else {
			arg0.method1370(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)I")
	public static int method3637(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (arg0 >= 8 - Static6.anInt4421) {
			@Pc(12) int local12 = 8 - Static6.anInt4421;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (Static6.aByteArray59[Static6.anInt4418] >> Static6.anInt4421 & local18) << local3;
			Static6.anInt4421 = 0;
			Static6.anInt4418++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			@Pc(53) int local53 = (0x1 << arg0) - 1;
			local1 += (Static6.aByteArray59[Static6.anInt4418] >> Static6.anInt4421 & local53) << local3;
			Static6.anInt4421 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(F)F")
	public static float method3641(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}

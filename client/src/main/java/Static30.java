import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

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

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBI[Lclient!wf;IIIII)V")
	public static void method3554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg8, arg6, arg5, arg4);
		} else {
			SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
			Static23.method2561();
		}
		for (@Pc(22) int local22 = 0; local22 < arg3.length; local22++) {
			@Pc(38) Component local38 = arg3[local22];
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
				local38.anInt5900 = client.loop;
				local38.anInt5967 = local89;
				if (!local38.if3 || !Static12.method692(local38)) {
					if (local38.anInt5904 > 0) {
						Static10.method467(local38);
					}
					@Pc(117) int local117 = local38.anInt5903;
					@Pc(122) int local122 = local38.anInt5888 + arg7;
					@Pc(128) int local128 = local38.anInt5960 + arg0;
					if (Static1.aBoolean26 && (Static12.method687(local38).events != 0 || local38.type == 0) && local117 > 127) {
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
							@Pc(181) int local181 = Mouse.y;
							@Pc(183) int local183 = Mouse.x;
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
					if (local38.type == 2) {
						local259 = arg6;
						local309 = arg5;
						local266 = arg8;
						local298 = arg4;
					} else {
						local259 = arg6 < local122 ? local122 : arg6;
						local266 = local128 <= arg8 ? arg8 : local128;
						@Pc(272) int local272 = local128 + local38.anInt5893;
						@Pc(278) int local278 = local122 + local38.anInt5949;
						if (local38.type == 9) {
							local272++;
							local278++;
						}
						local298 = local278 >= arg4 ? arg4 : local278;
						local309 = local272 >= arg5 ? arg5 : local272;
					}
					if (!local38.if3 || local266 < local309 && local298 > local259) {
						if (local38.anInt5904 != 0) {
							if (local38.anInt5904 == 1337 || local38.anInt5904 == 1403) {
								Static3.anInt2047 = local128;
								Static3.aClass185_5 = local38;
								Static6.anInt4679 = local122;
								Static31.method3746(local128, local38.anInt5949, local38.anInt5904 == 1403, local38.anInt5893, local122);
								Static2.aBooleanArray8[local89] = true;
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg8, arg6, arg5, arg4);
								} else {
									SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (local38.anInt5904 == 1338) {
								if (!local38.method4738()) {
									continue;
								}
								Static33.method3010(local128, local89, local38, local122);
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg8, arg6, arg5, arg4);
								} else {
									SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
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
								@Pc(502) int local502 = MathUtils.SINE[local498];
								@Pc(509) int local509 = local455 - local38.anInt5893 / 2;
								local502 = local502 * (Static6.anInt4761 + 256) >> 8;
								@Pc(521) int local521 = MathUtils.COSINE[local498];
								local521 = (Static6.anInt4761 + 256) * local521 >> 8;
								@Pc(540) int local540 = local502 * local491 + local509 * local521 >> 11;
								@Pc(551) int local551 = local521 * local491 - local502 * local509 >> 11;
								@Pc(567) int local567 = PlayerList.self.x + local540 + 64 - PlayerList.self.getSize() * 64 >> 7;
								@Pc(583) int local583 = PlayerList.self.z + 64 - local551 - PlayerList.self.getSize() * 64 >> 7;
								if (Static3.aBoolean177 && (Static5.anInt3560 & 0x40) != 0) {
									@Pc(597) Component local597 = Static23.method2425(Static1.anInt1053, Static2.anInt1367);
									if (local597 == null) {
										Static26.method4812();
									} else {
										Static16.method1497(1L, local567, local583, " ->", Static4.aString140, (short) 19, Static6.anInt4466);
									}
									continue;
								}
								if (client.game == 1) {
									Static16.method1497(1L, local567, local583, "", LocalisedText.FACEHERE, (short) 47, -1);
								}
								Static16.method1497(1L, local567, local583, "", Static5.aString236, (short) 26, -1);
								continue;
							}
							if (local38.anInt5904 == 1339) {
								if (local38.method4738()) {
									Static35.method4309(local38, local122, local89, local128);
									if (GlRenderer.enabled) {
										GlRaster.setClip(arg8, arg6, arg5, arg4);
									} else {
										SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
									}
								}
								continue;
							}
							if (local38.anInt5904 == 1400) {
								Static20.method1928(local38.anInt5949, local122, local128, local38.anInt5893);
								Static2.aBooleanArray8[local89] = true;
								Static6.aBooleanArray24[local89] = true;
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg8, arg6, arg5, arg4);
								} else {
									SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (local38.anInt5904 == 1401) {
								Static36.method4524(local38.anInt5949, local38.anInt5893, local128, local122);
								Static2.aBooleanArray8[local89] = true;
								Static6.aBooleanArray24[local89] = true;
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg8, arg6, arg5, arg4);
								} else {
									SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (local38.anInt5904 == 1402) {
								if (!GlRenderer.enabled) {
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
								Static5.aClass4_Sub3_Sub5_2.method2275("Fps:" + GameShell.framesPerSecond, local787, local791, 16776960, -1);
								@Pc(807) Runtime local807 = Runtime.getRuntime();
								local791 += 15;
								@Pc(817) int local817 = (int) ((local807.totalMemory() - local807.freeMemory()) / 1024L);
								@Pc(819) int local819 = 16776960;
								if (local817 > 65536) {
									local819 = 16711680;
								}
								Static5.aClass4_Sub3_Sub5_2.method2275("Mem:" + local817 + "k", local787, local791, local819, -1);
								@Pc(841) int local841 = local791 + 15;
								if (GlRenderer.enabled) {
									@Pc(846) int local846 = 16776960;
									@Pc(854) int local854 = (GlCleaner.onCardTexture + GlCleaner.onCardGeometry + GlCleaner.onCard2d) / 1024;
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
									local885 += client.js5Providers[local887].getIndexSize();
									local881 += client.js5Providers[local887].getVerifiedGroups();
									local883 += client.js5Providers[local887].getTotalVerifiedGroups();
								}
								@Pc(923) int local923 = local883 * 100 / local885;
								@Pc(929) int local929 = local881 * 10000 / local885;
								@Pc(950) String local950 = "Cache:" + LongUtils.fixedPointToString((long) local929, true, 2, 0) + "% (" + local923 + "%)";
								Static1.aClass4_Sub3_Sub5_1.method2275(local950, local787, local841, 16776960, -1);
								@Pc(958) int local958 = local841 + 12;
								if (ParticleManager.particles > 0) {
									Static1.aClass4_Sub3_Sub5_1.method2275("Particles: " + ParticleManager.running + " / " + ParticleManager.particles, local787, local958, 16776960, -1);
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
							if (local38.type == 0 && local38.aBoolean407 && local266 <= Static4.anInt3341 && Static5.anInt5848 >= local259 && Static4.anInt3341 < local309 && local298 > Static5.anInt5848 && !Static1.aBoolean26) {
								Static6.aShortArray100[0] = 1006;
								Static6.aStringArray30[0] = LocalisedText.CANCEL;
								Static6.aStringArray27[0] = "";
								Static2.anIntArray160[0] = Static7.anInt6050;
								Static7.anInt5634 = 1;
							}
							if (Static4.anInt3341 >= local266 && local259 <= Static5.anInt5848 && Static4.anInt3341 < local309 && local298 > Static5.anInt5848) {
								Static15.method1427(local38, Static5.anInt5848 - local122, Static4.anInt3341 - local128);
							}
						}
						if (local38.type == 0) {
							if (!local38.if3 && Static12.method692(local38) && local38 != Static5.aClass185_11) {
								continue;
							}
							if (!local38.if3) {
								if (local38.anInt5887 - local38.anInt5949 < local38.anInt5931) {
									local38.anInt5931 = local38.anInt5887 - local38.anInt5949;
								}
								if (local38.anInt5931 < 0) {
									local38.anInt5931 = 0;
								}
							}
							if (GlRenderer.enabled && local38.anInt5904 == 1407) {
								Static13.method874(local128, local122, local38.anInt5893, local38.anInt5949);
							}
							method3554(local128 - local38.anInt5932, local38.id, local89, arg3, local298, local309, local259, local122 - local38.anInt5931, local266);
							if (local38.aClass185Array4 != null) {
								method3554(local128 - local38.anInt5932, local38.id, local89, local38.aClass185Array4, local298, local309, local259, local122 - local38.anInt5931, local266);
							}
							@Pc(1207) Class4_Sub27 local1207 = (Class4_Sub27) Static4.aClass84_13.get((long) local38.id);
							if (local1207 != null) {
								if (local1207.anInt4619 == 0 && !Static1.aBoolean17 && Static4.anInt3341 >= local266 && Static5.anInt5848 >= local259 && local309 > Static4.anInt3341 && Static5.anInt5848 < local298 && !Static1.aBoolean26) {
									Static6.aShortArray100[0] = 1006;
									Static2.anIntArray160[0] = Static7.anInt6050;
									Static6.aStringArray30[0] = LocalisedText.CANCEL;
									Static6.aStringArray27[0] = "";
									Static7.anInt5634 = 1;
								}
								Static14.method1069(local1207.anInt4620, local259, local122, local128, local298, local266, local309, local89);
							}
							if (GlRenderer.enabled && local38.anInt5904 == 1407) {
								Static13.method880();
								Static7.aBoolean123 = true;
							}
							if (GlRenderer.enabled) {
								GlRaster.setClip(arg8, arg6, arg5, arg4);
							} else {
								SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
								Static23.method2561();
							}
						}
						if (Static1.aBooleanArray2[local89] || Static1.anInt268 > 1) {
							if (local38.type == 0 && !local38.if3 && local38.anInt5949 < local38.anInt5887) {
								method3607(local38.anInt5949, local38.anInt5893 + local128, local38.anInt5887, local122, local38.anInt5931);
							}
							if (local38.type != 1) {
								if (local38.type == 2) {
									@Pc(1338) int local1338 = 0;
									for (@Pc(1340) int local1340 = 0; local1340 < local38.anInt5950; local1340++) {
										for (@Pc(1346) int local1346 = 0; local1346 < local38.anInt5927; local1346++) {
											@Pc(1359) int local1359 = local122 + (local38.anInt5964 + 32) * local1340;
											@Pc(1369) int local1369 = local128 + local1346 * (local38.anInt5943 + 32);
											if (local1338 < 20) {
												local1359 += local38.anIntArray663[local1338];
												local1369 += local38.anIntArray664[local1338];
											}
											if (local38.objTypes[local1338] > 0) {
												@Pc(1402) int local1402 = local38.objTypes[local1338] - 1;
												if (local1369 + 32 > arg8 && local1369 < arg5 && arg6 < local1359 + 32 && local1359 < arg4 || local38 == Static5.aClass185_10 && Static1.anInt91 == local1338) {
													@Pc(1463) Sprite local1463;
													if (Static2.anInt1334 == 1 && local1338 == Static1.anInt314 && local38.id == Static5.anInt4302) {
														local1463 = Static37.method4676(local38.objCounts[local1338], 2, local38.aBoolean405, null, local1402, 0);
													} else {
														local1463 = Static37.method4676(local38.objCounts[local1338], 1, local38.aBoolean405, null, local1402, 3153952);
													}
													if (Static4.aBoolean218) {
														Static2.aBooleanArray8[local89] = true;
													}
													if (local1463 == null) {
														Static28.method3270(local38);
													} else if (local38 == Static5.aClass185_10 && local1338 == Static1.anInt91) {
														@Pc(1498) int local1498 = Mouse.x - Static1.anInt547;
														@Pc(1503) int local1503 = Mouse.y - Static1.anInt789;
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
														local1463.renderAlpha(local1498 + local1369, local1359 + local1503, 128);
														if (arg1 != -1) {
															@Pc(1551) Component local1551 = arg3[arg1 & 0xFFFF];
															@Pc(1557) int local1557;
															@Pc(1555) int local1555;
															if (GlRenderer.enabled) {
																local1555 = GlRaster.clipHeight;
																local1557 = GlRaster.clipY;
															} else {
																local1555 = SoftwareRaster.clipHeight;
																local1557 = SoftwareRaster.clipY;
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
														local1463.renderAlpha(local1369, local1359, 128);
													} else {
														local1463.renderTransparent(local1369, local1359);
													}
												}
											} else if (local38.anIntArray658 != null && local1338 < 20) {
												@Pc(1747) Sprite local1747 = local38.method4724(local1338);
												if (local1747 != null) {
													local1747.renderTransparent(local1369, local1359);
												} else if (Static3.aBoolean178) {
													Static28.method3270(local38);
												}
											}
											local1338++;
										}
									}
								} else if (local38.type == 3) {
									@Pc(1782) int local1782;
									if (Cs1ScriptRunner.isTrue(local38)) {
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
											if (GlRenderer.enabled) {
												GlRaster.fillRect(local128, local122, local38.anInt5893, local38.anInt5949, local1782);
											} else {
												SoftwareRaster.fillRect(local128, local122, local38.anInt5893, local38.anInt5949, local1782);
											}
										} else if (GlRenderer.enabled) {
											GlRaster.drawRect(local128, local122, local38.anInt5893, local38.anInt5949, local1782);
										} else {
											SoftwareRaster.drawRect(local128, local122, local38.anInt5893, local38.anInt5949, local1782);
										}
									} else if (local38.aBoolean413) {
										if (GlRenderer.enabled) {
											GlRaster.fillRectAlpha(local128, local122, local38.anInt5893, local38.anInt5949, local1782, 256 - (local117 & 0xFF));
										} else {
											SoftwareRaster.fillRectAlpha(local128, local122, local38.anInt5893, local38.anInt5949, local1782, 256 - (local117 & 0xFF));
										}
									} else if (GlRenderer.enabled) {
										GlRaster.drawRectAlpha(local128, local122, local38.anInt5893, local38.anInt5949, local1782, 256 - (local117 & 0xFF));
									} else {
										SoftwareRaster.drawRectAlpha(local128, local122, local38.anInt5893, local38.anInt5949, local1782, 256 - (local117 & 0xFF));
									}
								} else if (local38.type == 4) {
									@Pc(1944) Font local1944 = local38.method4734(Static3.aClass56Array3);
									if (local1944 != null) {
										@Pc(1957) String local1957 = local38.aString351;
										@Pc(1964) int local1964;
										if (Cs1ScriptRunner.isTrue(local38)) {
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
										if (local38.if3 && local38.anInt5938 != -1) {
											@Pc(2008) ObjType local2008 = ObjTypeList.get(local38.anInt5938);
											local1957 = local2008.name;
											if (local1957 == null) {
												local1957 = "null";
											}
											if ((local2008.stackable == 1 || local38.anInt5962 != 1) && local38.anInt5962 != -1) {
												local1957 = "<col=ff9040>" + local1957 + "</col> x" + Static26.method4816(local38.anInt5962);
											}
										}
										if (Static6.aClass185_14 == local38) {
											local1957 = LocalisedText.PLEASEWAIT;
											local1964 = local38.anInt5933;
										}
										if (!local38.if3) {
											local1957 = Cs1ScriptRunner.interpolate(local38, local1957);
										}
										local1944.method2255(local1957, local128, local122, local38.anInt5893, local38.anInt5949, local1964, local38.aBoolean415 ? 0 : -1, local38.anInt5924, local38.anInt5922, local38.anInt5948);
									} else if (Static3.aBoolean178) {
										Static28.method3270(local38);
									}
								} else if (local38.type == 5) {
									if (!local38.if3) {
										@Pc(2106) Sprite local2106 = local38.method4729(Cs1ScriptRunner.isTrue(local38));
										if (local2106 != null) {
											local2106.renderTransparent(local128, local122);
										} else if (Static3.aBoolean178) {
											Static28.method3270(local38);
										}
									} else if (local38.anInt5972 >= 0) {
										@Pc(2619) Class47 local2619 = local38.method4726();
										if (GlRenderer.enabled) {
											local2619.method1025(0, local128, local122, local38.anInt5893, local38.anInt5949, local38.anInt5965, local38.anInt5917, 0);
										} else {
											local2619.method1024(0, local128, local122, local38.anInt5893, local38.anInt5949, local38.anInt5965, local38.anInt5917);
										}
									} else {
										@Pc(2137) Sprite local2137;
										if (local38.anInt5938 == -1) {
											local2137 = local38.method4729(false);
										} else if (local38.aBoolean419 && PlayerList.self.appearance != null) {
											local2137 = Static37.method4676(local38.anInt5962, local38.anInt5975, local38.aBoolean405, PlayerList.self.appearance, local38.anInt5938, local38.anInt5934);
										} else {
											local2137 = Static37.method4676(local38.anInt5962, local38.anInt5975, local38.aBoolean405, null, local38.anInt5938, local38.anInt5934);
										}
										if (local2137 != null) {
											@Pc(2182) int local2182 = local2137.innerWidth;
											@Pc(2185) int local2185 = local2137.innerHeight;
											if (local38.aBoolean410) {
												@Pc(2197) int local2197 = (local2182 + local38.anInt5893 - 1) / local2182;
												@Pc(2207) int local2207 = (local38.anInt5949 + local2185 - 1) / local2185;
												if (GlRenderer.enabled) {
													GlRaster.shrinkClip(local128, local122, local128 + local38.anInt5893, local122 + local38.anInt5949);
													@Pc(2226) boolean local2226 = IntUtils.isPowerOfTwo(local2137.width);
													@Pc(2229) GlSprite local2229 = (GlSprite) local2137;
													@Pc(2234) boolean local2234 = IntUtils.isPowerOfTwo(local2137.height);
													if (local2226 && local2234) {
														if (local117 == 0) {
															local2229.renderTiled(local128, local122, local2197, local2207);
														} else {
															local2229.renderTiledAlpha(local128, local122, 256 - (local117 & 0xFF), local2197, local2207);
														}
													} else if (local2226) {
														for (@Pc(2377) int local2377 = 0; local2377 < local2207; local2377++) {
															if (local117 == 0) {
																local2229.renderTiled(local128, local2377 * local2185 + local122, local2197, 1);
															} else {
																local2229.renderTiledAlpha(local128, local2185 * local2377 + local122, 256 - (local117 & 0xFF), local2197, 1);
															}
														}
													} else if (local2234) {
														for (@Pc(2329) int local2329 = 0; local2329 < local2197; local2329++) {
															if (local117 == 0) {
																local2229.renderTiled(local128 + local2329 * local2182, local122, 1, local2207);
															} else {
																local2229.renderTiledAlpha(local128 + local2329 * local2182, local122, 256 - (local117 & 0xFF), 1, local2207);
															}
														}
													} else {
														for (@Pc(2270) int local2270 = 0; local2270 < local2197; local2270++) {
															for (@Pc(2275) int local2275 = 0; local2275 < local2207; local2275++) {
																if (local117 == 0) {
																	local2137.renderTransparent(local2182 * local2270 + local128, local2275 * local2185 + local122);
																} else {
																	local2137.renderAlpha(local2270 * local2182 + local128, local2275 * local2185 + local122, 256 - (local117 & 0xFF));
																}
															}
														}
													}
													GlRaster.setClip(arg8, arg6, arg5, arg4);
												} else {
													SoftwareRaster.shrinkClip(local128, local122, local38.anInt5893 + local128, local122 + local38.anInt5949);
													for (@Pc(2434) int local2434 = 0; local2434 < local2197; local2434++) {
														for (@Pc(2439) int local2439 = 0; local2439 < local2207; local2439++) {
															if (local38.anInt5958 != 0) {
																local2137.renderRotatedScaledTransparent(local122 + local2439 * local2185 + local2185 / 2, local38.anInt5958, local2434 * local2182 + local128 + local2182 / 2, 4096);
															} else if (local117 == 0) {
																local2137.renderTransparent(local128 + local2434 * local2182, local122 + local2439 * local2185);
															} else {
																local2137.renderAlpha(local2434 * local2182 + local128, local2185 * local2439 + local122, 256 - (local117 & 0xFF));
															}
														}
													}
													SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
												}
											} else {
												@Pc(2533) int local2533 = local38.anInt5893 * 4096 / local2182;
												if (local38.anInt5958 != 0) {
													local2137.renderRotatedScaledTransparent(local122 + local38.anInt5949 / 2, local38.anInt5958, local38.anInt5893 / 2 + local128, local2533);
												} else if (local117 != 0) {
													local2137.renderResizedAlpha(local128, local122, local38.anInt5893, local38.anInt5949, 256 - (local117 & 0xFF));
												} else if (local38.anInt5893 == local2182 && local2185 == local38.anInt5949) {
													local2137.renderTransparent(local128, local122);
												} else {
													local2137.renderResizedTransparent(local128, local122, local38.anInt5893, local38.anInt5949);
												}
											}
										} else if (Static3.aBoolean178) {
											Static28.method3270(local38);
										}
									}
								} else if (local38.type == 6) {
									@Pc(2663) boolean local2663 = Cs1ScriptRunner.isTrue(local38);
									@Pc(2665) Model local2665 = null;
									@Pc(2670) int local2670;
									if (local2663) {
										local2670 = local38.anInt5910;
									} else {
										local2670 = local38.anInt5891;
									}
									@Pc(2677) int local2677 = 0;
									if (local38.anInt5938 != -1) {
										@Pc(2687) ObjType local2687 = ObjTypeList.get(local38.anInt5938);
										if (local2687 != null) {
											@Pc(2695) ObjType local2695 = local2687.method4124(local38.anInt5962);
											@Pc(2704) SeqType local2704 = local2670 == -1 ? null : SeqTypeList.get(local2670);
											if (local38.aBoolean419 && PlayerList.self.appearance != null) {
												local2665 = local2695.method4123(local38.anInt5892, 1, local38.anInt5979, PlayerList.self.appearance, local2704, local38.anInt5897);
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
											if (PlayerList.selfId == local2817) {
												local2817 = 2047;
											}
											@Pc(2827) Player local2827 = PlayerList.players[local2817];
											@Pc(2838) SeqType local2838 = local2670 == -1 ? null : SeqTypeList.get(local2670);
											if (local2827 != null && (int) Base37.encode(local2827.name) << 11 == (local38.anInt5895 & 0xFFFFF800)) {
												local2665 = local2827.appearance.method3608(null, 0, -1, -1, null, local38.anInt5892, false, 0, local2838, true, 0);
											}
										}
									} else if (local2670 == -1) {
										local2665 = local38.method4723(null, PlayerList.self.appearance, -1, -1, 0, local2663);
										if (local2665 == null && Static3.aBoolean178) {
											Static28.method3270(local38);
										}
									} else {
										@Pc(2765) SeqType local2765 = SeqTypeList.get(local2670);
										local2665 = local38.method4723(local2765, PlayerList.self.appearance, local38.anInt5979, local38.anInt5892, local38.anInt5897, local2663);
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
										if (GlRenderer.enabled) {
											if (local38.aBoolean418) {
												GlRenderer.method1598(local2952, local2938, local38.anInt5918, local38.aShort50, local2894, local2912);
											} else {
												GlRenderer.method1599(local2952, local2938, local2894, local2912);
												GlRenderer.method1621((float) local38.aShort49, (float) local38.aShort50 * 1.5F);
											}
											GlRenderer.method1618();
											GlRenderer.setDepthTestEnabled(true);
											GlRenderer.setFogEnabled(false);
											Static23.method2416(Preferences.brightness);
											if (Static7.aBoolean123) {
												GlRaster.resetClip();
												GlRenderer.clearDepthBuffer();
												GlRaster.setClip(arg8, arg6, arg5, arg4);
												Static7.aBoolean123 = false;
											}
											if (local38.aBoolean411) {
												GlRenderer.disableDepthMask();
											}
											@Pc(3115) int local3115 = MathUtils.COSINE[local38.anInt5944] * local38.anInt5918 >> 16;
											@Pc(3125) int local3125 = local38.anInt5918 * MathUtils.SINE[local38.anInt5944] >> 16;
											if (local38.if3) {
												local2665.method3822(local38.anInt5976, local38.anInt5886, local38.anInt5944, local38.anInt5963, local38.anInt5906 + local2677 + local3125, local3115 + local38.anInt5906, -1L);
											} else {
												local2665.method3822(local38.anInt5976, 0, local38.anInt5944, 0, local3125, local3115, -1L);
											}
											if (local38.aBoolean411) {
												GlRenderer.enableDepthMask();
											}
										} else {
											Static23.method2556(local2952, local2938);
											@Pc(2967) int local2967 = local38.anInt5918 * MathUtils.COSINE[local38.anInt5944] >> 16;
											@Pc(2977) int local2977 = MathUtils.SINE[local38.anInt5944] * local38.anInt5918 >> 16;
											if (!local38.if3) {
												local2665.method3822(local38.anInt5976, 0, local38.anInt5944, 0, local2977, local2967, -1L);
											} else if (local38.aBoolean418) {
												((SoftwareModel) local2665).method2911(local38.anInt5976, local38.anInt5886, local38.anInt5944, local38.anInt5963, local2977 + local2677 + local38.anInt5906, local2967 + local38.anInt5906, local38.anInt5918);
											} else {
												local2665.method3822(local38.anInt5976, local38.anInt5886, local38.anInt5944, local38.anInt5963, local2677 + local2977 + local38.anInt5906, local2967 + local38.anInt5906, -1L);
											}
											Static23.method2555();
										}
									}
								} else {
									if (local38.type == 7) {
										@Pc(3183) Font local3183 = local38.method4734(Static3.aClass56Array3);
										if (local3183 == null) {
											if (Static3.aBoolean178) {
												Static28.method3270(local38);
											}
											continue;
										}
										@Pc(3195) int local3195 = 0;
										for (@Pc(3197) int local3197 = 0; local3197 < local38.anInt5950; local3197++) {
											for (@Pc(3203) int local3203 = 0; local3203 < local38.anInt5927; local3203++) {
												if (local38.objTypes[local3195] > 0) {
													@Pc(3224) ObjType local3224 = ObjTypeList.get(local38.objTypes[local3195] - 1);
													@Pc(3246) String local3246;
													if (local3224.stackable != 1 && local38.objCounts[local3195] == 1) {
														local3246 = "<col=ff9040>" + local3224.name + "</col>";
													} else {
														local3246 = "<col=ff9040>" + local3224.name + "</col> x" + Static26.method4816(local38.objCounts[local3195]);
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
									if (local38.type == 8 && Static2.aClass185_4 == local38 && Static4.anInt3493 == Static5.anInt5840) {
										@Pc(3363) int local3363 = 0;
										@Pc(3365) Font local3365 = Static5.aClass4_Sub3_Sub5_2;
										@Pc(3367) int local3367 = 0;
										@Pc(3370) String local3370 = local38.aString351;
										@Pc(3375) String local3375 = Cs1ScriptRunner.interpolate(local38, local3370);
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
										if (GlRenderer.enabled) {
											GlRaster.fillRect(local3461, local3437, local3430, local3429, 16777120);
											GlRaster.drawRect(local3461, local3437, local3430, local3429, 0);
										} else {
											SoftwareRaster.fillRect(local3461, local3437, local3430, local3429, 16777120);
											SoftwareRaster.drawRect(local3461, local3437, local3430, local3429, 0);
										}
										@Pc(3524) int local3524 = local3365.anInt2820 + local3437 + 2;
										@Pc(3527) String local3527 = local38.aString351;
										@Pc(3532) String local3532 = Cs1ScriptRunner.interpolate(local38, local3527);
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
									if (local38.type == 9) {
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
											if (GlRenderer.enabled) {
												GlRaster.drawLine(local128, local3601, local3592, local3596, local38.anInt5933);
											} else {
												SoftwareRaster.drawLine(local128, local3601, local3592, local3596, local38.anInt5933);
											}
										} else if (GlRenderer.enabled) {
											GlRaster.drawLineWithStrokeWidth(local128, local3601, local3592, local3596, local38.anInt5933, local38.anInt5899);
										} else {
											SoftwareRaster.drawLineWithStrokeWidth(local128, local3601, local3592, local3596, local38.anInt5933, local38.anInt5899);
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

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method419(@OriginalArg(0) String arg0) {
		client.settings = arg0;
		if (GameShell.signLink.applet == null) {
			return;
		}
		try {
			@Pc(15) String local15 = GameShell.signLink.applet.getParameter("cookieprefix");
			@Pc(24) String local24 = GameShell.signLink.applet.getParameter("cookiehost");
			@Pc(39) String local39 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			@Pc(54) String local54;
			if (arg0.length() == 0) {
				local54 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local54 = local39 + "; Expires=" + Static12.method742(MonotonicClock.currentTimeMillis() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			BrowserControl.eval(GameShell.signLink.applet, "document.cookie=\"" + local54 + "\"");
		} catch (@Pc(92) Throwable local92) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method420() {
		Static6.aClass26_50.clear();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method423(@OriginalArg(1) long arg0) {
		return Base37.decodeLowerCase(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
	public static void method3596() {
		@Pc(1) GL local1 = GlRenderer.gl;
		local1.glDisableClientState(GL.GL_COLOR_ARRAY);
		GlRenderer.setLightingEnabled(false);
		local1.glDisable(GL.GL_DEPTH_TEST);
		local1.glPushAttrib(GL.GL_FOG_BIT);
		local1.glFogf(GL.GL_FOG_START, 3072.0F);
		GlRenderer.disableDepthMask();
		for (@Pc(19) int local19 = 0; local19 < Terrain.aClass4_Sub12ArrayArray1[0].length; local19++) {
			@Pc(31) Class4_Sub12 local31 = Terrain.aClass4_Sub12ArrayArray1[0][local19];
			if (local31.anInt2356 >= 0 && Static32.method3920(Static4.anInterface4_1.method444(local31.anInt2356))) {
				local1.glColor4fv(Static16.method1553(local31.anInt2351), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean162 ? 1.0F : 0.5F);
				local31.method1867(Terrain.tiles, local58, true);
			}
		}
		local1.glEnableClientState(GL.GL_COLOR_ARRAY);
		GlRenderer.method1618();
		local1.glEnable(GL.GL_DEPTH_TEST);
		local1.glPopAttrib();
		GlRenderer.enableDepthMask();
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)V")
	public static void method3597() {
		Static35.method4310();
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			PathFinder.collisionMaps[local12].clear();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method3598(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		arg0 = arg0.toLowerCase();
		@Pc(10) int local10 = 0;
		@Pc(13) short[] local13 = new short[16];
		for (@Pc(21) int local21 = 0; local21 < ObjTypeList.capacity; local21++) {
			@Pc(28) ObjType local28 = ObjTypeList.get(local21);
			if ((!arg1 || local28.stockMarket) && local28.certificateTemplate == -1 && local28.lentTemplate == -1 && local28.dummyItem == 0 && local28.name.toLowerCase().indexOf(arg0) != -1) {
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
			local118[local120] = ObjTypeList.get(local13[local120]).name;
		}
		Static12.method714(Static7.aShortArray114, local118);
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
		if (!GlRenderer.enabled) {
			SoftwareRaster.fillRect(arg1, arg3 + 16, 16, arg0 - 32, Static3.anInt2193);
			SoftwareRaster.fillRect(arg1, arg3 + local53 + 16, 16, local11, Static2.anInt1360);
			SoftwareRaster.drawVerticalLine(arg1, local53 + arg3 + 16, local11, Static2.anInt1221);
			SoftwareRaster.drawVerticalLine(arg1 + 1, arg3 + local53 + 16, local11, Static2.anInt1221);
			SoftwareRaster.drawHorizontalLine(arg1, arg3 + local53 + 16, 16, Static2.anInt1221);
			SoftwareRaster.drawHorizontalLine(arg1, arg3 + local53 + 17, 16, Static2.anInt1221);
			SoftwareRaster.drawVerticalLine(arg1 + 15, local53 + arg3 + 16, local11, Static5.anInt3907);
			SoftwareRaster.drawVerticalLine(arg1 + 14, local53 + arg3 + 17, local11 - 1, Static5.anInt3907);
			SoftwareRaster.drawHorizontalLine(arg1, local11 + local53 + arg3 + 15, 16, Static5.anInt3907);
			SoftwareRaster.drawHorizontalLine(arg1 + 1, local53 + arg3 + local11 + 14, 15, Static5.anInt3907);
			return;
		}
		GlRaster.fillRect(arg1, arg3 + 16, 16, arg0 - 32, Static3.anInt2193);
		GlRaster.fillRect(arg1, arg3 + local53 + 16, 16, local11, Static2.anInt1360);
		GlRaster.drawVerticalLine(arg1, local53 + arg3 + 16, local11, Static2.anInt1221);
		GlRaster.drawVerticalLine(arg1 + 1, arg3 + local53 + 16, local11, Static2.anInt1221);
		GlRaster.drawHorizontalLine(arg1, arg3 + local53 + 16, 16, Static2.anInt1221);
		GlRaster.drawHorizontalLine(arg1, local53 + arg3 + 17, 16, Static2.anInt1221);
		GlRaster.drawVerticalLine(arg1 + 15, arg3 + local53 + 16, local11, Static5.anInt3907);
		GlRaster.drawVerticalLine(arg1 + 14, arg3 + local53 + 17, local11 - 1, Static5.anInt3907);
		GlRaster.drawHorizontalLine(arg1, local11 + arg3 + local53 + 15, 16, Static5.anInt3907);
		GlRaster.drawHorizontalLine(arg1 + 1, local11 + arg3 + local53 + 14, 15, Static5.anInt3907);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!wf;IIIIIII)V")
	public static void method3619(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
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
		@Pc(54) int local54 = MathUtils.COSINE[local50];
		local54 = local54 * 256 / (Static6.anInt4761 + 256);
		@Pc(66) int local66 = MathUtils.SINE[local50];
		local66 = local66 * 256 / (Static6.anInt4761 + 256);
		@Pc(85) int local85 = local54 * arg3 - arg5 * local66 >> 16;
		@Pc(95) int local95 = arg5 * local54 + local66 * arg3 >> 16;
		@Pc(101) double local101 = Math.atan2((double) local95, (double) local85);
		@Pc(108) int local108 = (int) ((double) local43 * Math.sin(local101));
		@Pc(115) int local115 = (int) ((double) local43 * Math.cos(local101));
		if (GlRenderer.enabled) {
			((GlSprite) Static2.aClass4_Sub3_Sub14Array9[arg6]).renderRotatedTransparent((arg2 + arg0.anInt5893 / 2 + local108) * 16, (arg4 + arg0.anInt5949 / 2 - local115) * 16, (int) (local101 * 10430.378D));
		} else {
			((SoftwareSprite) Static2.aClass4_Sub3_Sub14Array9[arg6]).renderRotatedTransparent(arg2 + arg0.anInt5893 / 2 + local108 - 10, arg0.anInt5949 / 2 + arg4 - local115 - 10, local101);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fh;)Z")
	private static boolean method3628(@OriginalArg(0) Js5 archive) {
		if (!Static6.aBoolean308) {
			@Pc(7) byte[] bytes = archive.fetchFile(0, 0);
			if (bytes == null) {
				return false;
			}
			method3630(bytes);
			Static6.aBoolean308 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([BI)V")
	public static void method3629(@OriginalArg(0) byte[] bytes) {
		Static6.aByteArray59 = bytes;
		Static6.anInt4418 = 0;
		Static6.anInt4421 = 0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([B)V")
	private static void method3630(@OriginalArg(0) byte[] bytes) {
		method3629(bytes);
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
			@Pc(193) int local193 = IntUtils.bitCount(local38 - 1);
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
	public static Class4_Sub24 method3636(@OriginalArg(0) Js5 archive, @OriginalArg(1) int groupId, @OriginalArg(2) int fileId) {
		if (method3628(archive)) {
			@Pc(16) byte[] bytes = archive.fetchFile(groupId, fileId);
			return bytes == null ? null : new Class4_Sub24(bytes);
		} else {
			archive.isFileReady(groupId, fileId);
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

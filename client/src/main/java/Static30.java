import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBI[Lclient!wf;IIIII)V")
	public static void method3554(@OriginalArg(0) int x, @OriginalArg(1) int layer, @OriginalArg(3) int parentRectangle, @OriginalArg(4) Component[] components, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int y, @OriginalArg(9) int arg8) {
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg8, arg6, arg5, arg4);
		} else {
			SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
			Static23.method2561();
		}
		for (@Pc(22) int i = 0; i < components.length; i++) {
			@Pc(38) Component component = components[i];
			if (component != null && (layer == component.layer || layer == 0xABCDABCD && component == Static1.aClass185_1)) {
				@Pc(89) int rectangle;
				if (parentRectangle == -1) {
					InterfaceList.rectangleX[InterfaceList.rectangles] = component.x + x;
					InterfaceList.rectangleY[InterfaceList.rectangles] = component.y + y;
					InterfaceList.rectangleWidth[InterfaceList.rectangles] = component.width;
					InterfaceList.rectangleHeight[InterfaceList.rectangles] = component.height;
					rectangle = InterfaceList.rectangles++;
				} else {
					rectangle = parentRectangle;
				}
				component.rectangleLoop = client.loop;
				component.rectangle = rectangle;
				if (!component.if3 || !InterfaceList.isHidden(component)) {
					if (component.anInt5904 > 0) {
						Static10.method467(component);
					}
					@Pc(117) int transparency = component.transparency;
					@Pc(122) int local122 = component.y + y;
					@Pc(128) int local128 = component.x + x;
					if (Static1.qaOpTest && (InterfaceList.getServerActiveProperties(component).events != 0 || component.type == 0) && transparency > 127) {
						transparency = 127;
					}
					if (component == Static1.aClass185_1) {
						if (layer != 0xABCDABCD && !component.dragRender) {
							Static7.anInt5589 = x;
							Static4.anInt3317 = y;
							Static4.aClass185Array3 = components;
							continue;
						}
						if (!component.dragRender) {
							transparency = 128;
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
							if (local187 + component.height > Static6.anInt5182 + Static1.aClass185_2.height) {
								local187 = Static6.anInt5182 + Static1.aClass185_2.height - component.height;
							}
							if (Static1.aClass185_2.width + Static2.anInt1633 < local191 + component.width) {
								local191 = Static1.aClass185_2.width + Static2.anInt1633 - component.width;
							}
							local128 = local191;
							local122 = local187;
						}
					}
					@Pc(309) int local309;
					@Pc(298) int local298;
					@Pc(266) int local266;
					@Pc(259) int local259;
					if (component.type == 2) {
						local259 = arg6;
						local309 = arg5;
						local266 = arg8;
						local298 = arg4;
					} else {
						local259 = arg6 < local122 ? local122 : arg6;
						local266 = local128 <= arg8 ? arg8 : local128;
						@Pc(272) int local272 = local128 + component.width;
						@Pc(278) int local278 = local122 + component.height;
						if (component.type == 9) {
							local272++;
							local278++;
						}
						local298 = local278 >= arg4 ? arg4 : local278;
						local309 = local272 >= arg5 ? arg5 : local272;
					}
					if (!component.if3 || local266 < local309 && local298 > local259) {
						if (component.anInt5904 != 0) {
							if (component.anInt5904 == 1337 || component.anInt5904 == 1403) {
								Static3.anInt2047 = local128;
								Static3.aClass185_5 = component;
								Static6.anInt4679 = local122;
								Static31.method3746(local128, component.height, component.anInt5904 == 1403, component.width, local122);
								Static2.aBooleanArray8[rectangle] = true;
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg8, arg6, arg5, arg4);
								} else {
									SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (component.anInt5904 == 1338) {
								if (!component.method4738()) {
									continue;
								}
								MiniMap.render(component, local128, local122, rectangle);
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg8, arg6, arg5, arg4);
								} else {
									SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
								}
								if (MiniMap.state != 0 && MiniMap.state != 3 || Static1.aBoolean17 || Static4.anInt3341 < local266 || local259 > Static5.anInt5848 || local309 <= Static4.anInt3341 || Static5.anInt5848 >= local298) {
									continue;
								}
								@Pc(455) int local455 = Static4.anInt3341 - local128;
								@Pc(460) int local460 = Static5.anInt5848 - local122;
								@Pc(465) int local465 = component.anIntArray672[local460];
								if (local465 > local455 || local455 > component.anIntArray657[local460] + local465) {
									continue;
								}
								@Pc(491) int local491 = local460 - component.height / 2;
								@Pc(498) int local498 = Static6.anInt3585 + (int) Static5.aFloat97 & 0x7FF;
								@Pc(502) int local502 = MathUtils.SINE[local498];
								@Pc(509) int local509 = local455 - component.width / 2;
								local502 = local502 * (Static6.anInt4761 + 256) >> 8;
								@Pc(521) int local521 = MathUtils.COSINE[local498];
								local521 = (Static6.anInt4761 + 256) * local521 >> 8;
								@Pc(540) int local540 = local502 * local491 + local509 * local521 >> 11;
								@Pc(551) int local551 = local521 * local491 - local502 * local509 >> 11;
								@Pc(567) int local567 = PlayerList.self.xFine + local540 + 64 - PlayerList.self.getSize() * 64 >> 7;
								@Pc(583) int local583 = PlayerList.self.zFine + 64 - local551 - PlayerList.self.getSize() * 64 >> 7;
								if (Static3.aBoolean177 && (Static5.anInt3560 & 0x40) != 0) {
									@Pc(597) Component local597 = InterfaceList.getCreatedComponent(Static1.anInt1053, Static2.anInt1367);
									if (local597 == null) {
										Static26.method4812();
									} else {
										MiniMenu.add(1L, local567, local583, " ->", Static4.aString140, (short) 19, Static6.anInt4466);
									}
									continue;
								}
								if (client.game == 1) {
									MiniMenu.add(1L, local567, local583, "", LocalisedText.FACEHERE, (short) 47, -1);
								}
								MiniMenu.add(1L, local567, local583, "", MiniMenu.walkHereOp, (short) 26, -1);
								continue;
							}
							if (component.anInt5904 == 1339) {
								if (component.method4738()) {
									Static35.method4309(component, local128, local122, rectangle);
									if (GlRenderer.enabled) {
										GlRaster.setClip(arg8, arg6, arg5, arg4);
									} else {
										SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
									}
								}
								continue;
							}
							if (component.anInt5904 == 1400) {
								Static20.method1928(component.height, local122, local128, component.width);
								Static2.aBooleanArray8[rectangle] = true;
								InterfaceList.rectangleRedraw[rectangle] = true;
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg8, arg6, arg5, arg4);
								} else {
									SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (component.anInt5904 == 1401) {
								Static36.method4524(component.height, component.width, local128, local122);
								Static2.aBooleanArray8[rectangle] = true;
								InterfaceList.rectangleRedraw[rectangle] = true;
								if (GlRenderer.enabled) {
									GlRaster.setClip(arg8, arg6, arg5, arg4);
								} else {
									SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
								}
								continue;
							}
							if (component.anInt5904 == 1402) {
								if (!GlRenderer.enabled) {
									Flames.render(local128, local122);
									Static2.aBooleanArray8[rectangle] = true;
									InterfaceList.rectangleRedraw[rectangle] = true;
								}
								continue;
							}
							if (component.anInt5904 == 1405) {
								if (!client.displayFps) {
									continue;
								}
								@Pc(787) int local787 = local128 + component.width;
								@Pc(791) int local791 = local122 + 15;
								Fonts.p12Full.renderRight("Fps:" + GameShell.framesPerSecond, local787, local791, 16776960, -1);
								@Pc(807) Runtime local807 = Runtime.getRuntime();
								local791 += 15;
								@Pc(817) int local817 = (int) ((local807.totalMemory() - local807.freeMemory()) / 1024L);
								@Pc(819) int local819 = 16776960;
								if (local817 > 65536) {
									local819 = 16711680;
								}
								Fonts.p12Full.renderRight("Mem:" + local817 + "k", local787, local791, local819, -1);
								@Pc(841) int local841 = local791 + 15;
								if (GlRenderer.enabled) {
									@Pc(846) int local846 = 16776960;
									@Pc(854) int local854 = (GlCleaner.onCardTexture + GlCleaner.onCardGeometry + GlCleaner.onCard2d) / 1024;
									if (local854 > 65536) {
										local846 = 16711680;
									}
									Fonts.p12Full.renderRight("Card:" + local854 + "k", local787, local841, local846, -1);
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
								Fonts.p11Full.renderRight(local950, local787, local841, 16776960, -1);
								@Pc(958) int local958 = local841 + 12;
								if (ParticleManager.particles > 0) {
									Fonts.p11Full.renderRight("Particles: " + ParticleManager.running + " / " + ParticleManager.particles, local787, local958, 16776960, -1);
								}
								@Pc(983) int local983 = local958 + 12;
								Static2.aBooleanArray8[rectangle] = true;
								InterfaceList.rectangleRedraw[rectangle] = true;
								continue;
							}
							if (component.anInt5904 == 1406) {
								Static1.anInt127 = local128;
								Static4.anInt2643 = local122;
								Static7.aClass185_15 = component;
								continue;
							}
						}
						if (!Static1.aBoolean17) {
							if (component.type == 0 && component.noClickThrough && local266 <= Static4.anInt3341 && Static5.anInt5848 >= local259 && Static4.anInt3341 < local309 && local298 > Static5.anInt5848 && !Static1.qaOpTest) {
								MiniMenu.actions[0] = 1006;
								MiniMenu.ops[0] = LocalisedText.CANCEL;
								MiniMenu.opBases[0] = "";
								MiniMenu.cursors[0] = Static7.anInt6050;
								MiniMenu.size = 1;
							}
							if (Static4.anInt3341 >= local266 && local259 <= Static5.anInt5848 && Static4.anInt3341 < local309 && local298 > Static5.anInt5848) {
								MiniMenu.addComponentEntries(component, Static5.anInt5848 - local122, Static4.anInt3341 - local128);
							}
						}
						if (component.type == 0) {
							if (!component.if3 && InterfaceList.isHidden(component) && component != Static5.aClass185_11) {
								continue;
							}
							if (!component.if3) {
								if (component.scrollHeight - component.height < component.scrollY) {
									component.scrollY = component.scrollHeight - component.height;
								}
								if (component.scrollY < 0) {
									component.scrollY = 0;
								}
							}
							if (GlRenderer.enabled && component.anInt5904 == 1407) {
								PostProcessorManager.setViewport(local128, local122, component.width, component.height);
							}
							method3554(local128 - component.scrollX, component.id, rectangle, components, local298, local309, local259, local122 - component.scrollY, local266);
							if (component.createdComponents != null) {
								method3554(local128 - component.scrollX, component.id, rectangle, component.createdComponents, local298, local309, local259, local122 - component.scrollY, local266);
							}
							@Pc(1207) SubInterface local1207 = (SubInterface) InterfaceList.subInterfaces.get((long) component.id);
							if (local1207 != null) {
								if (local1207.type == 0 && !Static1.aBoolean17 && Static4.anInt3341 >= local266 && Static5.anInt5848 >= local259 && local309 > Static4.anInt3341 && Static5.anInt5848 < local298 && !Static1.qaOpTest) {
									MiniMenu.actions[0] = 1006;
									MiniMenu.cursors[0] = Static7.anInt6050;
									MiniMenu.ops[0] = LocalisedText.CANCEL;
									MiniMenu.opBases[0] = "";
									MiniMenu.size = 1;
								}
								Static14.method1069(local1207.id, local259, local122, local128, local298, local266, local309, rectangle);
							}
							if (GlRenderer.enabled && component.anInt5904 == 1407) {
								PostProcessorManager.process();
								Static7.aBoolean123 = true;
							}
							if (GlRenderer.enabled) {
								GlRaster.setClip(arg8, arg6, arg5, arg4);
							} else {
								SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
								Static23.method2561();
							}
						}
						if (Static1.aBooleanArray2[rectangle] || Static1.rectDebug > 1) {
							if (component.type == 0 && !component.if3 && component.height < component.scrollHeight) {
								method3607(component.height, component.width + local128, component.scrollHeight, local122, component.scrollY);
							}
							if (component.type != 1) {
								if (component.type == 2) {
									@Pc(1338) int local1338 = 0;
									for (@Pc(1340) int local1340 = 0; local1340 < component.baseHeight; local1340++) {
										for (@Pc(1346) int local1346 = 0; local1346 < component.baseWidth; local1346++) {
											@Pc(1359) int local1359 = local122 + (component.anInt5964 + 32) * local1340;
											@Pc(1369) int local1369 = local128 + local1346 * (component.anInt5943 + 32);
											if (local1338 < 20) {
												local1359 += component.anIntArray663[local1338];
												local1369 += component.anIntArray664[local1338];
											}
											if (component.objTypes[local1338] > 0) {
												@Pc(1402) int objId = component.objTypes[local1338] - 1;
												if (local1369 + 32 > arg8 && local1369 < arg5 && arg6 < local1359 + 32 && local1359 < arg4 || component == Static5.aClass185_10 && Static1.anInt91 == local1338) {
													@Pc(1463) Sprite local1463;
													if (Static2.anInt1334 == 1 && local1338 == Static1.anInt314 && component.id == Static5.anInt4302) {
														local1463 = ObjTypeList.getSprite(objId, component.objCounts[local1338], 2, component.showObjCount, null, 0);
													} else {
														local1463 = ObjTypeList.getSprite(objId, component.objCounts[local1338], 1, component.showObjCount, null, 3153952);
													}
													if (Static4.aBoolean218) {
														Static2.aBooleanArray8[rectangle] = true;
													}
													if (local1463 == null) {
														Static28.method3270(component);
													} else if (component == Static5.aClass185_10 && local1338 == Static1.anInt91) {
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
														if (layer != -1) {
															@Pc(1551) Component local1551 = components[layer & 0xFFFF];
															@Pc(1557) int local1557;
															@Pc(1555) int local1555;
															if (GlRenderer.enabled) {
																local1555 = GlRaster.clipHeight;
																local1557 = GlRaster.clipY;
															} else {
																local1555 = SoftwareRaster.clipHeight;
																local1557 = SoftwareRaster.clipY;
															}
															if (local1503 + local1359 < local1557 && local1551.scrollY > 0) {
																@Pc(1589) int local1589 = Static5.anInt4156 * (local1557 - local1359 - local1503) / 3;
																if (Static5.anInt4156 * 10 < local1589) {
																	local1589 = Static5.anInt4156 * 10;
																}
																if (local1551.scrollY < local1589) {
																	local1589 = local1551.scrollY;
																}
																Static1.anInt789 += local1589;
																local1551.scrollY -= local1589;
																Static28.method3270(local1551);
															}
															if (local1555 < local1359 + local1503 + 32 && local1551.scrollY < local1551.scrollHeight - local1551.height) {
																@Pc(1662) int local1662 = (local1359 + local1503 + 32 - local1555) * Static5.anInt4156 / 3;
																if (local1662 > Static5.anInt4156 * 10) {
																	local1662 = Static5.anInt4156 * 10;
																}
																if (local1662 > local1551.scrollHeight - local1551.scrollY - local1551.height) {
																	local1662 = local1551.scrollHeight - local1551.scrollY - local1551.height;
																}
																local1551.scrollY += local1662;
																Static1.anInt789 -= local1662;
																Static28.method3270(local1551);
															}
														}
													} else if (component == Static1.aClass185_3 && local1338 == Static5.anInt3884) {
														local1463.renderAlpha(local1369, local1359, 128);
													} else {
														local1463.renderTransparent(local1369, local1359);
													}
												}
											} else if (component.anIntArray658 != null && local1338 < 20) {
												@Pc(1747) Sprite local1747 = component.method4724(local1338);
												if (local1747 != null) {
													local1747.renderTransparent(local1369, local1359);
												} else if (Static3.aBoolean178) {
													Static28.method3270(component);
												}
											}
											local1338++;
										}
									}
								} else if (component.type == 3) {
									@Pc(1782) int local1782;
									if (Cs1ScriptRunner.isTrue(component)) {
										local1782 = component.anInt5902;
										if (Static5.aClass185_11 == component && component.anInt5971 != 0) {
											local1782 = component.anInt5971;
										}
									} else {
										local1782 = component.color;
										if (Static5.aClass185_11 == component && component.anInt5966 != 0) {
											local1782 = component.anInt5966;
										}
									}
									if (transparency == 0) {
										if (component.fill) {
											if (GlRenderer.enabled) {
												GlRaster.fillRect(local128, local122, component.width, component.height, local1782);
											} else {
												SoftwareRaster.fillRect(local128, local122, component.width, component.height, local1782);
											}
										} else if (GlRenderer.enabled) {
											GlRaster.drawRect(local128, local122, component.width, component.height, local1782);
										} else {
											SoftwareRaster.drawRect(local128, local122, component.width, component.height, local1782);
										}
									} else if (component.fill) {
										if (GlRenderer.enabled) {
											GlRaster.fillRectAlpha(local128, local122, component.width, component.height, local1782, 256 - (transparency & 0xFF));
										} else {
											SoftwareRaster.fillRectAlpha(local128, local122, component.width, component.height, local1782, 256 - (transparency & 0xFF));
										}
									} else if (GlRenderer.enabled) {
										GlRaster.drawRectAlpha(local128, local122, component.width, component.height, local1782, 256 - (transparency & 0xFF));
									} else {
										SoftwareRaster.drawRectAlpha(local128, local122, component.width, component.height, local1782, 256 - (transparency & 0xFF));
									}
								} else if (component.type == 4) {
									@Pc(1944) Font font = component.getFont(Sprites.nameIcons);
									if (font != null) {
										@Pc(1957) String local1957 = component.text;
										@Pc(1964) int local1964;
										if (Cs1ScriptRunner.isTrue(component)) {
											local1964 = component.anInt5902;
											if (component == Static5.aClass185_11 && component.anInt5971 != 0) {
												local1964 = component.anInt5971;
											}
											if (component.aString350.length() > 0) {
												local1957 = component.aString350;
											}
										} else {
											local1964 = component.color;
											if (component == Static5.aClass185_11 && component.anInt5966 != 0) {
												local1964 = component.anInt5966;
											}
										}
										if (component.if3 && component.objId != -1) {
											@Pc(2008) ObjType local2008 = ObjTypeList.get(component.objId);
											local1957 = local2008.name;
											if (local1957 == null) {
												local1957 = "null";
											}
											if ((local2008.stackable == 1 || component.objCount != 1) && component.objCount != -1) {
												local1957 = "<col=ff9040>" + local1957 + "</col> x" + Static26.method4816(component.objCount);
											}
										}
										if (Static6.aClass185_14 == component) {
											local1957 = LocalisedText.PLEASEWAIT;
											local1964 = component.color;
										}
										if (!component.if3) {
											local1957 = Cs1ScriptRunner.interpolate(component, local1957);
										}
										font.renderParagraph(local1957, local128, local122, component.width, component.height, local1964, component.textShadow ? 0 : -1, component.textHorizontalAlignment, component.textVerticalAlignment, component.textLineHeight);
									} else if (Static3.aBoolean178) {
										Static28.method3270(component);
									}
								} else if (component.type == 5) {
									if (!component.if3) {
										@Pc(2106) Sprite local2106 = component.method4729(Cs1ScriptRunner.isTrue(component));
										if (local2106 != null) {
											local2106.renderTransparent(local128, local122);
										} else if (Static3.aBoolean178) {
											Static28.method3270(component);
										}
									} else if (component.anInt5972 >= 0) {
										@Pc(2619) Class47 local2619 = component.method4726();
										if (GlRenderer.enabled) {
											local2619.method1025(0, local128, local122, component.width, component.height, component.anInt5965, component.anInt5917, 0);
										} else {
											local2619.method1024(0, local128, local122, component.width, component.height, component.anInt5965, component.anInt5917);
										}
									} else {
										@Pc(2137) Sprite local2137;
										if (component.objId == -1) {
											local2137 = component.method4729(false);
										} else if (component.objWearColor && PlayerList.self.appearance != null) {
											local2137 = ObjTypeList.getSprite(component.objId, component.objCount, component.outline, component.showObjCount, PlayerList.self.appearance, component.graphicShadow);
										} else {
											local2137 = ObjTypeList.getSprite(component.objId, component.objCount, component.outline, component.showObjCount, null, component.graphicShadow);
										}
										if (local2137 != null) {
											@Pc(2182) int local2182 = local2137.innerWidth;
											@Pc(2185) int local2185 = local2137.innerHeight;
											if (component.tiled) {
												@Pc(2197) int local2197 = (local2182 + component.width - 1) / local2182;
												@Pc(2207) int local2207 = (component.height + local2185 - 1) / local2185;
												if (GlRenderer.enabled) {
													GlRaster.shrinkClip(local128, local122, local128 + component.width, local122 + component.height);
													@Pc(2226) boolean local2226 = IntUtils.isPowerOfTwo(local2137.width);
													@Pc(2229) GlSprite local2229 = (GlSprite) local2137;
													@Pc(2234) boolean local2234 = IntUtils.isPowerOfTwo(local2137.height);
													if (local2226 && local2234) {
														if (transparency == 0) {
															local2229.renderTiled(local128, local122, local2197, local2207);
														} else {
															local2229.renderTiledAlpha(local128, local122, 256 - (transparency & 0xFF), local2197, local2207);
														}
													} else if (local2226) {
														for (@Pc(2377) int local2377 = 0; local2377 < local2207; local2377++) {
															if (transparency == 0) {
																local2229.renderTiled(local128, local2377 * local2185 + local122, local2197, 1);
															} else {
																local2229.renderTiledAlpha(local128, local2185 * local2377 + local122, 256 - (transparency & 0xFF), local2197, 1);
															}
														}
													} else if (local2234) {
														for (@Pc(2329) int local2329 = 0; local2329 < local2197; local2329++) {
															if (transparency == 0) {
																local2229.renderTiled(local128 + local2329 * local2182, local122, 1, local2207);
															} else {
																local2229.renderTiledAlpha(local128 + local2329 * local2182, local122, 256 - (transparency & 0xFF), 1, local2207);
															}
														}
													} else {
														for (@Pc(2270) int local2270 = 0; local2270 < local2197; local2270++) {
															for (@Pc(2275) int local2275 = 0; local2275 < local2207; local2275++) {
																if (transparency == 0) {
																	local2137.renderTransparent(local2182 * local2270 + local128, local2275 * local2185 + local122);
																} else {
																	local2137.renderAlpha(local2270 * local2182 + local128, local2275 * local2185 + local122, 256 - (transparency & 0xFF));
																}
															}
														}
													}
													GlRaster.setClip(arg8, arg6, arg5, arg4);
												} else {
													SoftwareRaster.shrinkClip(local128, local122, component.width + local128, local122 + component.height);
													for (@Pc(2434) int local2434 = 0; local2434 < local2197; local2434++) {
														for (@Pc(2439) int local2439 = 0; local2439 < local2207; local2439++) {
															if (component.angle != 0) {
																local2137.renderRotatedScaledTransparent(local122 + local2439 * local2185 + local2185 / 2, component.angle, local2434 * local2182 + local128 + local2182 / 2, 4096);
															} else if (transparency == 0) {
																local2137.renderTransparent(local128 + local2434 * local2182, local122 + local2439 * local2185);
															} else {
																local2137.renderAlpha(local2434 * local2182 + local128, local2185 * local2439 + local122, 256 - (transparency & 0xFF));
															}
														}
													}
													SoftwareRaster.setClip(arg8, arg6, arg5, arg4);
												}
											} else {
												@Pc(2533) int local2533 = component.width * 4096 / local2182;
												if (component.angle != 0) {
													local2137.renderRotatedScaledTransparent(local122 + component.height / 2, component.angle, component.width / 2 + local128, local2533);
												} else if (transparency != 0) {
													local2137.renderResizedAlpha(local128, local122, component.width, component.height, 256 - (transparency & 0xFF));
												} else if (component.width == local2182 && local2185 == component.height) {
													local2137.renderTransparent(local128, local122);
												} else {
													local2137.renderResizedTransparent(local128, local122, component.width, component.height);
												}
											}
										} else if (Static3.aBoolean178) {
											Static28.method3270(component);
										}
									}
								} else if (component.type == 6) {
									@Pc(2663) boolean local2663 = Cs1ScriptRunner.isTrue(component);
									@Pc(2665) Model local2665 = null;
									@Pc(2670) int local2670;
									if (local2663) {
										local2670 = component.anInt5910;
									} else {
										local2670 = component.modelSeqId;
									}
									@Pc(2677) int local2677 = 0;
									if (component.objId != -1) {
										@Pc(2687) ObjType local2687 = ObjTypeList.get(component.objId);
										if (local2687 != null) {
											@Pc(2695) ObjType local2695 = local2687.method4124(component.objCount);
											@Pc(2704) SeqType local2704 = local2670 == -1 ? null : SeqTypeList.get(local2670);
											if (component.objWearColor && PlayerList.self.appearance != null) {
												local2665 = local2695.getModel(component.anInt5892, 1, component.anInt5979, PlayerList.self.appearance, local2704, component.anInt5897);
											} else {
												local2665 = local2695.getModel(component.anInt5892, 1, component.anInt5979, null, local2704, component.anInt5897);
											}
											if (local2665 == null) {
												Static28.method3270(component);
											} else {
												local2677 = -local2665.getMinY() / 2;
											}
										}
									} else if (component.modelType == 5) {
										if (component.modelId == -1) {
											local2665 = Static1.aClass144_1.getBodyModel(null, -1, -1, -1, null, -1, false, 0, null, true, 0);
										} else {
											@Pc(2817) int local2817 = component.modelId & 0x7FF;
											if (PlayerList.selfId == local2817) {
												local2817 = 2047;
											}
											@Pc(2827) Player local2827 = PlayerList.players[local2817];
											@Pc(2838) SeqType local2838 = local2670 == -1 ? null : SeqTypeList.get(local2670);
											if (local2827 != null && (int) Base37.encode(local2827.username) << 11 == (component.modelId & 0xFFFFF800)) {
												local2665 = local2827.appearance.getBodyModel(null, 0, -1, -1, null, component.anInt5892, false, 0, local2838, true, 0);
											}
										}
									} else if (local2670 == -1) {
										local2665 = component.getModel(null, PlayerList.self.appearance, -1, -1, 0, local2663);
										if (local2665 == null && Static3.aBoolean178) {
											Static28.method3270(component);
										}
									} else {
										@Pc(2765) SeqType local2765 = SeqTypeList.get(local2670);
										local2665 = component.getModel(local2765, PlayerList.self.appearance, component.anInt5979, component.anInt5892, component.anInt5897, local2663);
										if (local2665 == null && Static3.aBoolean178) {
											Static28.method3270(component);
										}
									}
									if (local2665 != null) {
										@Pc(2894) int local2894;
										if (component.anInt5957 <= 0) {
											local2894 = 256;
										} else {
											local2894 = (component.width << 8) / component.anInt5957;
										}
										@Pc(2912) int local2912;
										if (component.anInt5920 <= 0) {
											local2912 = 256;
										} else {
											local2912 = (component.height << 8) / component.anInt5920;
										}
										@Pc(2938) int local2938 = local122 + component.height / 2 + (component.anInt5921 * local2912 >> 8);
										@Pc(2952) int local2952 = (component.anInt5907 * local2894 >> 8) + component.width / 2 + local128;
										if (GlRenderer.enabled) {
											if (component.modelOrthographic) {
												GlRenderer.method1598(local2952, local2938, component.modelZoom, component.aShort50, local2894, local2912);
											} else {
												GlRenderer.method1599(local2952, local2938, local2894, local2912);
												GlRenderer.method1621((float) component.aShort49, (float) component.aShort50 * 1.5F);
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
											if (component.aBoolean411) {
												GlRenderer.disableDepthMask();
											}
											@Pc(3115) int local3115 = MathUtils.COSINE[component.modelXAngle] * component.modelZoom >> 16;
											@Pc(3125) int local3125 = component.modelZoom * MathUtils.SINE[component.modelXAngle] >> 16;
											if (component.if3) {
												local2665.method3822(component.modelYAngle, component.modelZAngle, component.modelXAngle, component.modelXOffset, component.modelYOffset + local2677 + local3125, local3115 + component.modelYOffset, -1L);
											} else {
												local2665.method3822(component.modelYAngle, 0, component.modelXAngle, 0, local3125, local3115, -1L);
											}
											if (component.aBoolean411) {
												GlRenderer.enableDepthMask();
											}
										} else {
											Static23.method2556(local2952, local2938);
											@Pc(2967) int local2967 = component.modelZoom * MathUtils.COSINE[component.modelXAngle] >> 16;
											@Pc(2977) int local2977 = MathUtils.SINE[component.modelXAngle] * component.modelZoom >> 16;
											if (!component.if3) {
												local2665.method3822(component.modelYAngle, 0, component.modelXAngle, 0, local2977, local2967, -1L);
											} else if (component.modelOrthographic) {
												((SoftwareModel) local2665).method2911(component.modelYAngle, component.modelZAngle, component.modelXAngle, component.modelXOffset, local2977 + local2677 + component.modelYOffset, local2967 + component.modelYOffset, component.modelZoom);
											} else {
												local2665.method3822(component.modelYAngle, component.modelZAngle, component.modelXAngle, component.modelXOffset, local2677 + local2977 + component.modelYOffset, local2967 + component.modelYOffset, -1L);
											}
											Static23.method2555();
										}
									}
								} else {
									if (component.type == 7) {
										@Pc(3183) Font font = component.getFont(Sprites.nameIcons);
										if (font == null) {
											if (Static3.aBoolean178) {
												Static28.method3270(component);
											}
											continue;
										}
										@Pc(3195) int local3195 = 0;
										for (@Pc(3197) int local3197 = 0; local3197 < component.baseHeight; local3197++) {
											for (@Pc(3203) int local3203 = 0; local3203 < component.baseWidth; local3203++) {
												if (component.objTypes[local3195] > 0) {
													@Pc(3224) ObjType local3224 = ObjTypeList.get(component.objTypes[local3195] - 1);
													@Pc(3246) String local3246;
													if (local3224.stackable != 1 && component.objCounts[local3195] == 1) {
														local3246 = "<col=ff9040>" + local3224.name + "</col>";
													} else {
														local3246 = "<col=ff9040>" + local3224.name + "</col> x" + Static26.method4816(component.objCounts[local3195]);
													}
													@Pc(3276) int local3276 = local128 + local3203 * (component.anInt5943 + 115);
													@Pc(3285) int local3285 = (component.anInt5964 + 12) * local3197 + local122;
													if (component.textHorizontalAlignment == 0) {
														font.renderLeft(local3246, local3276, local3285, component.color, component.textShadow ? 0 : -1);
													} else if (component.textHorizontalAlignment == 1) {
														font.renderCenter(local3246, local3276 + 57, local3285, component.color, component.textShadow ? 0 : -1);
													} else {
														font.renderRight(local3246, local3276 + 114, local3285, component.color, component.textShadow ? 0 : -1);
													}
												}
												local3195++;
											}
										}
									}
									if (component.type == 8 && Static2.aClass185_4 == component && Static4.anInt3493 == Static5.anInt5840) {
										@Pc(3363) int local3363 = 0;
										@Pc(3365) Font local3365 = Fonts.p12Full;
										@Pc(3367) int local3367 = 0;
										@Pc(3370) String local3370 = component.text;
										@Pc(3375) String local3375 = Cs1ScriptRunner.interpolate(component, local3370);
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
											@Pc(3410) int local3410 = local3365.getStringWidth(local3394);
											if (local3410 > local3363) {
												local3363 = local3410;
											}
											local3367 += local3365.lineHeight + 1;
										}
										@Pc(3429) int local3429 = local3367 + 7;
										@Pc(3430) int local3430 = local3363 + 6;
										@Pc(3437) int local3437 = local122 + component.height + 5;
										if (arg4 < local3429 + local3437) {
											local3437 = arg4 - local3429;
										}
										@Pc(3461) int local3461 = local128 + component.width - local3430 - 5;
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
										@Pc(3524) int local3524 = local3365.lineHeight + local3437 + 2;
										@Pc(3527) String local3527 = component.text;
										@Pc(3532) String local3532 = Cs1ScriptRunner.interpolate(component, local3527);
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
											local3365.renderLeft(local3548, local3461 + 3, local3524, 0, -1);
											local3524 += local3365.lineHeight + 1;
										}
									}
									if (component.type == 9) {
										@Pc(3592) int local3592;
										@Pc(3601) int local3601;
										@Pc(3596) int local3596;
										if (component.lineDirection) {
											local3592 = component.width + local128;
											local3596 = local122;
											local3601 = component.height + local122;
										} else {
											local3592 = local128 + component.width;
											local3596 = local122 + component.height;
											local3601 = local122;
										}
										if (component.lineWidth == 1) {
											if (GlRenderer.enabled) {
												GlRaster.drawLine(local128, local3601, local3592, local3596, component.color);
											} else {
												SoftwareRaster.drawLine(local128, local3601, local3592, local3596, component.color);
											}
										} else if (GlRenderer.enabled) {
											GlRaster.drawLineWithStrokeWidth(local128, local3601, local3592, local3596, component.color, component.lineWidth);
										} else {
											SoftwareRaster.drawLineWithStrokeWidth(local128, local3601, local3592, local3596, component.color, component.lineWidth);
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

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void setSettings(@OriginalArg(0) String settings) {
		client.settings = settings;
		if (GameShell.signLink.applet == null) {
			return;
		}
		try {
			@Pc(15) String cookiePrefix = GameShell.signLink.applet.getParameter("cookieprefix");
			@Pc(24) String cookieHost = GameShell.signLink.applet.getParameter("cookiehost");
			@Pc(39) String cookie = cookiePrefix + "settings=" + settings + "; version=1; path=/; domain=" + cookieHost;
			@Pc(54) String cookie2;
			if (settings.length() == 0) {
				cookie2 = cookie + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				cookie2 = cookie + "; Expires=" + TimeUtils.formatHttpDate(MonotonicClock.currentTimeMillis() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			BrowserControl.eval(GameShell.signLink.applet, "document.cookie=\"" + cookie2 + "\"");
		} catch (@Pc(92) Throwable ex) {
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
	public static void method3596() {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glDisableClientState(GL.GL_COLOR_ARRAY);
		GlRenderer.setLightingEnabled(false);
		gl.glDisable(GL.GL_DEPTH_TEST);
		gl.glPushAttrib(GL.GL_FOG_BIT);
		gl.glFogf(GL.GL_FOG_START, 3072.0F);
		GlRenderer.disableDepthMask();
		for (@Pc(19) int local19 = 0; local19 < SceneGraph.aClass4_Sub12ArrayArray1[0].length; local19++) {
			@Pc(31) Class4_Sub12 local31 = SceneGraph.aClass4_Sub12ArrayArray1[0][local19];
			if (local31.anInt2356 >= 0 && Static32.method3920(Static4.textureProvider.getMaterialType(local31.anInt2356))) {
				gl.glColor4fv(Static16.method1553(local31.anInt2351), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean162 ? 1.0F : 0.5F);
				local31.method1867(SceneGraph.tiles, local58, true);
			}
		}
		gl.glEnableClientState(GL.GL_COLOR_ARRAY);
		GlRenderer.method1618();
		gl.glEnable(GL.GL_DEPTH_TEST);
		gl.glPopAttrib();
		GlRenderer.enableDepthMask();
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)V")
	public static void method3597() {
		SceneGraph.clear();
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			PathFinder.collisionMaps[local12].clear();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBIIII)V")
	private static void method3607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg0 - 32) * arg0 / arg2;
		Sprites.scrollbar[0].renderTransparent(arg1, arg3);
		if (local11 < 8) {
			local11 = 8;
		}
		Sprites.scrollbar[1].renderTransparent(arg1, arg0 + arg3 - 16);
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

}

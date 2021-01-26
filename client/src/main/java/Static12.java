import java.util.Random;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)V")
	public static void method638() {
		if (Static4.anInt3020 != Player.level && Static13.method1009(Player.level)) {
			Static4.anInt3020 = Player.level;
		}
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(B)Z")
	public static boolean method639() {
		try {
			if (Static5.anInt4357 == 2) {
				if (Static7.aClass4_Sub31_2 == null) {
					Static7.aClass4_Sub31_2 = Song.create(Static2.aClass58_42, Static7.anInt6022, Static2.anInt1244);
					if (Static7.aClass4_Sub31_2 == null) {
						return false;
					}
				}
				if (Static1.aClass98_1 == null) {
					Static1.aClass98_1 = new SoundBank(Static6.aClass58_93, Static2.aClass58_41);
				}
				if (Static1.aClass4_Sub6_Sub2_3.method2511(Static7.aClass4_Sub31_2, Static3.aClass58_59, Static1.aClass98_1)) {
					Static1.aClass4_Sub6_Sub2_3.method2509();
					Static1.aClass4_Sub6_Sub2_3.method2479(Static7.anInt5391);
					Static1.aClass4_Sub6_Sub2_3.method2504(Static6.aBoolean321, Static7.aClass4_Sub31_2);
					Static1.aClass98_1 = null;
					Static7.aClass4_Sub31_2 = null;
					Static2.aClass58_42 = null;
					Static5.anInt4357 = 0;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static1.aClass4_Sub6_Sub2_3.method2501();
			Static1.aClass98_1 = null;
			Static5.anInt4357 = 0;
			Static2.aClass58_42 = null;
			Static7.aClass4_Sub31_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IJ)V")
	public static void method641(@OriginalArg(1) long arg0) {
		if (!Preferences.aBoolean293) {
			Static5.aFloat147 += (float) arg0 * Static1.aFloat20 / 40.0F;
			Static5.aFloat97 += (float) arg0 * Static4.aFloat79 / 40.0F;
		}
		@Pc(37) int local37 = PlayerList.self.zFine + Static1.anInt837;
		@Pc(42) int local42 = Static1.anInt548 + PlayerList.self.xFine;
		if (Static7.anInt5412 - local42 < -500 || Static7.anInt5412 - local42 > 500 || Static3.anInt2496 - local37 < -500 || Static3.anInt2496 - local37 > 500) {
			Static3.anInt2496 = local37;
			Static7.anInt5412 = local42;
		}
		if (Static7.anInt5412 != local42) {
			@Pc(81) int local81 = local42 - Static7.anInt5412;
			@Pc(89) int local89 = (int) (arg0 * (long) local81 / 320L);
			if (local81 <= 0) {
				if (local89 == 0) {
					local89 = -1;
				} else if (local89 < local81) {
					local89 = local81;
				}
			} else if (local89 == 0) {
				local89 = 1;
			} else if (local89 > local81) {
				local89 = local81;
			}
			Static7.anInt5412 += local89;
		}
		if (Static3.anInt2496 != local37) {
			@Pc(134) int local134 = local37 - Static3.anInt2496;
			@Pc(142) int local142 = (int) (arg0 * (long) local134 / 320L);
			if (local134 > 0) {
				if (local142 == 0) {
					local142 = 1;
				} else if (local142 > local134) {
					local142 = local134;
				}
			} else if (local142 == 0) {
				local142 = -1;
			} else if (local134 > local142) {
				local142 = local134;
			}
			Static3.anInt2496 += local142;
		}
		Static28.method3252();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!wf;)Lclient!wf;")
	public static Component method691(@OriginalArg(0) Component arg0) {
		@Pc(4) int local4 = InterfaceList.getServerActiveProperties(arg0).getDragDepth();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = InterfaceList.getComponent(arg0.layer);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!wf;)Z")
	public static boolean method692(@OriginalArg(0) Component arg0) {
		if (Static1.qaOpTest) {
			if (InterfaceList.getServerActiveProperties(arg0).events != 0) {
				return false;
			}
			if (arg0.type == 0) {
				return false;
			}
		}
		return arg0.hidden;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!wf;IIIIIII)V")
	public static void method693(@OriginalArg(0) Component[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Component component = arg0[local1];
			if (component != null && component.layer == arg1 && (!component.if3 || component.type == 0 || component.aBoolean403 || InterfaceList.getServerActiveProperties(component).events != 0 || component == Static1.aClass185_2 || component.anInt5904 == 1338) && (!component.if3 || !method692(component))) {
				@Pc(50) int local50 = component.x + arg6;
				@Pc(55) int local55 = component.y + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (component.type == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + component.width;
					@Pc(78) int local78 = local55 + component.height;
					if (component.type == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (component == Static1.aClass185_1) {
					Static6.aBoolean310 = true;
					Static4.anInt3183 = local50;
					Static1.anInt134 = local55;
				}
				if (!component.if3 || local61 < local65 && local63 < local67) {
					if (component.type == 0) {
						if (!component.if3 && method692(component) && Static5.aClass185_11 != component) {
							continue;
						}
						if (component.noClickThrough && Mouse.x >= local61 && Mouse.y >= local63 && Mouse.x < local65 && Mouse.y < local67) {
							for (@Pc(164) HookRequest local164 = (HookRequest) Static3.aClass112_14.head(); local164 != null; local164 = (HookRequest) Static3.aClass112_14.next()) {
								if (local164.aBoolean172) {
									local164.unlink();
									local164.source.aBoolean414 = false;
								}
							}
							if (Static3.anInt2165 == 0) {
								Static1.aClass185_1 = null;
								Static1.aClass185_2 = null;
							}
							Static1.anInt640 = 0;
							Static3.aBoolean166 = false;
						}
					}
					if (component.if3) {
						@Pc(209) boolean local209;
						if (Mouse.x >= local61 && Mouse.y >= local63 && Mouse.x < local65 && Mouse.y < local67) {
							local209 = true;
						} else {
							local209 = false;
						}
						@Pc(214) boolean local214 = false;
						if (Mouse.pressedButton == 1 && local209) {
							local214 = true;
						}
						@Pc(223) boolean local223 = false;
						if (Mouse.clickButton == 1 && Mouse.clickX >= local61 && Mouse.clickY >= local63 && Mouse.clickX < local65 && Mouse.clickY < local67) {
							local223 = true;
						}
						if (component.aByteArray74 != null) {
							for (@Pc(245) int local245 = 0; local245 < component.aByteArray74.length; local245++) {
								if (Keyboard.pressedKeys[component.aByteArray74[local245]]) {
									if (component.anIntArray659 == null || client.loop >= component.anIntArray659[local245]) {
										@Pc(281) byte local281 = component.aByteArray73[local245];
										if (local281 == 0 || ((local281 & 0x8) == 0 || !Keyboard.pressedKeys[86] && !Keyboard.pressedKeys[82] && !Keyboard.pressedKeys[81]) && ((local281 & 0x2) == 0 || Keyboard.pressedKeys[86]) && ((local281 & 0x1) == 0 || Keyboard.pressedKeys[82]) && ((local281 & 0x4) == 0 || Keyboard.pressedKeys[81])) {
											Static37.method4752(component.id, -1, local245 + 1, "");
											@Pc(341) int local341 = component.anIntArray662[local245];
											if (component.anIntArray659 == null) {
												component.anIntArray659 = new int[component.aByteArray74.length];
											}
											if (local341 == 0) {
												component.anIntArray659[local245] = Integer.MAX_VALUE;
											} else {
												component.anIntArray659[local245] = client.loop + local341;
											}
										}
									}
								} else if (component.anIntArray659 != null) {
									component.anIntArray659[local245] = 0;
								}
							}
						}
						if (local223) {
							Static15.method1401(component, Mouse.clickX - local50, Mouse.clickY - local55);
						}
						if (Static1.aClass185_1 != null && Static1.aClass185_1 != component && local209 && InterfaceList.getServerActiveProperties(component).isDragTarget()) {
							Static7.aClass185_16 = component;
						}
						if (component == Static1.aClass185_2) {
							Static4.aBoolean232 = true;
							Static2.anInt1633 = local50;
							Static6.anInt5182 = local55;
						}
						if (component.aBoolean403 || component.anInt5904 != 0) {
							if (local209 && Static3.anInt2885 != 0 && component.onScrollWheel != null) {
								@Pc(418) HookRequest local418 = new HookRequest();
								local418.aBoolean172 = true;
								local418.source = component;
								local418.mouseY = Static3.anInt2885;
								local418.arguments = component.onScrollWheel;
								Static3.aClass112_14.addTail(local418);
							}
							if (Static1.aClass185_1 != null || Static5.aClass185_10 != null || Static1.aBoolean17 || component.anInt5904 != 1400 && Static1.anInt640 > 0) {
								local223 = false;
								local214 = false;
								local209 = false;
							}
							if (component.anInt5904 != 0) {
								if (component.anInt5904 == 1337) {
									Static3.aClass185_5 = component;
									continue;
								}
								if (component.anInt5904 == 1338) {
									if (local223) {
										Static2.anInt1941 = Mouse.clickX - local50;
										Static7.anInt5798 = Mouse.clickY - local55;
									}
									continue;
								}
								if (component.anInt5904 == 1400) {
									Static5.aClass185_12 = component;
									if (local209) {
										Static3.aBoolean166 = true;
									}
									if (local223) {
										@Pc(506) int local506 = (int) ((double) (Mouse.clickX - local50 - component.width / 2) * 2.0D / (double) Static3.aFloat68);
										@Pc(522) int local522 = (int) ((double) (Mouse.clickY - local55 - component.height / 2) * 2.0D / (double) Static3.aFloat68);
										@Pc(526) int local526 = Static1.anInt331 + local506;
										@Pc(530) int local530 = Static7.anInt5231 + local522;
										@Pc(534) int local534 = local526 + Static3.anInt2962;
										@Pc(542) int local542 = Static3.anInt2960 + Static3.anInt2961 - local530 - 1;
										@Pc(545) Map local545 = WorldMap.getCurrentMap();
										if (local545 == null) {
											continue;
										}
										@Pc(550) int[] local550 = new int[3];
										local545.convertDisplayToSource(local534, local542, local550);
										if (local550 != null) {
											if (Keyboard.pressedKeys[82] && LoginManager.staffModLevel > 0) {
												Static24.method2945(local550[1], local550[2], local550[0]);
												Static21.method2063();
												continue;
											}
											Protocol.outboundBuffer.writeOpcode(251);
											Protocol.outboundBuffer.writeIntAlt3Reverse(local550[0] << 28 | local550[1] << 14 | local550[2]);
										}
										Static1.anInt640 = 1;
										Static1.aBoolean49 = false;
										Static5.anInt5204 = Mouse.x;
										Static1.anInt777 = Mouse.y;
										continue;
									}
									if (local214 && Static1.anInt640 > 0) {
										if (Static1.anInt640 == 1 && (Static5.anInt5204 != Mouse.x || Static1.anInt777 != Mouse.y)) {
											Static1.anInt927 = Static1.anInt331;
											Static1.anInt647 = Static7.anInt5231;
											Static1.anInt640 = 2;
										}
										if (Static1.anInt640 == 2) {
											Static1.aBoolean49 = true;
											method694(Static1.anInt927 + (int) ((double) (Static5.anInt5204 - Mouse.x) * 2.0D / (double) WorldMap.zoom));
											Static36.method4404(Static1.anInt647 + (int) ((double) (Static1.anInt777 - Mouse.y) * 2.0D / (double) WorldMap.zoom));
										}
										continue;
									}
									if (Static1.anInt640 > 0 && !Static1.aBoolean49) {
										if ((Static3.anInt5400 == 1 || Static13.method1005(Static7.anInt5634 - 1)) && Static7.anInt5634 > 2) {
											Static31.method3783();
										} else if (Static7.anInt5634 > 0) {
											Static37.method4784();
										}
									}
									Static1.anInt640 = 0;
									continue;
								}
								if (component.anInt5904 == 1401) {
									if (local214) {
										Static28.method3319(Mouse.y - local55, component.width, component.height, Mouse.x - local50);
									}
									continue;
								}
								if (component.anInt5904 == 1402) {
									if (!GlRenderer.enabled) {
										Static28.method3270(component);
									}
									continue;
								}
							}
							if (!component.aBoolean408 && local223) {
								component.aBoolean408 = true;
								if (component.onClick != null) {
									@Pc(737) HookRequest request = new HookRequest();
									request.aBoolean172 = true;
									request.source = component;
									request.mouseX = Mouse.clickX - local50;
									request.mouseY = Mouse.clickY - local55;
									request.arguments = component.onClick;
									Static3.aClass112_14.addTail(request);
								}
							}
							if (component.aBoolean408 && local214 && component.onClickRepeat != null) {
								@Pc(773) HookRequest request = new HookRequest();
								request.aBoolean172 = true;
								request.source = component;
								request.mouseX = Mouse.x - local50;
								request.mouseY = Mouse.y - local55;
								request.arguments = component.onClickRepeat;
								Static3.aClass112_14.addTail(request);
							}
							if (component.aBoolean408 && !local214) {
								component.aBoolean408 = false;
								if (component.onRelease != null) {
									@Pc(812) HookRequest request = new HookRequest();
									request.aBoolean172 = true;
									request.source = component;
									request.mouseX = Mouse.x - local50;
									request.mouseY = Mouse.y - local55;
									request.arguments = component.onRelease;
									Static2.aClass112_10.addTail(request);
								}
							}
							if (local214 && component.onHold != null) {
								@Pc(845) HookRequest request = new HookRequest();
								request.aBoolean172 = true;
								request.source = component;
								request.mouseX = Mouse.x - local50;
								request.mouseY = Mouse.y - local55;
								request.arguments = component.onHold;
								Static3.aClass112_14.addTail(request);
							}
							if (!component.aBoolean414 && local209) {
								component.aBoolean414 = true;
								if (component.onMouseOver != null) {
									@Pc(884) HookRequest request = new HookRequest();
									request.aBoolean172 = true;
									request.source = component;
									request.mouseX = Mouse.x - local50;
									request.mouseY = Mouse.y - local55;
									request.arguments = component.onMouseOver;
									Static3.aClass112_14.addTail(request);
								}
							}
							if (component.aBoolean414 && local209 && component.onMouseRepeat != null) {
								@Pc(920) HookRequest request = new HookRequest();
								request.aBoolean172 = true;
								request.source = component;
								request.mouseX = Mouse.x - local50;
								request.mouseY = Mouse.y - local55;
								request.arguments = component.onMouseRepeat;
								Static3.aClass112_14.addTail(request);
							}
							if (component.aBoolean414 && !local209) {
								component.aBoolean414 = false;
								if (component.onMouseLeave != null) {
									@Pc(959) HookRequest request = new HookRequest();
									request.aBoolean172 = true;
									request.source = component;
									request.mouseX = Mouse.x - local50;
									request.mouseY = Mouse.y - local55;
									request.arguments = component.onMouseLeave;
									Static2.aClass112_10.addTail(request);
								}
							}
							if (component.onTimer != null) {
								@Pc(990) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onTimer;
								Static2.aClass112_6.addTail(request);
							}
							if (component.onVarcTransmit != null && VarcDomain.updatedVarcsWriterIndex > component.updatedVarcsReaderIndex) {
								if (component.varcTriggers == null || VarcDomain.updatedVarcsWriterIndex - component.updatedVarcsReaderIndex > 32) {
									@Pc(1021) HookRequest request = new HookRequest();
									request.source = component;
									request.arguments = component.onVarcTransmit;
									Static3.aClass112_14.addTail(request);
								} else {
									label598:
									for (@Pc(1036) int i = component.updatedVarcsReaderIndex; i < VarcDomain.updatedVarcsWriterIndex; i++) {
										@Pc(1045) int varc = VarcDomain.updatedVarcs[i & 0x1F];
										for (@Pc(1047) int j = 0; j < component.varcTriggers.length; j++) {
											if (component.varcTriggers[j] == varc) {
												@Pc(1062) HookRequest request = new HookRequest();
												request.source = component;
												request.arguments = component.onVarcTransmit;
												Static3.aClass112_14.addTail(request);
												break label598;
											}
										}
									}
								}
								component.updatedVarcsReaderIndex = VarcDomain.updatedVarcsWriterIndex;
							}
							if (component.onVarcstrTransmit != null && VarcDomain.updatedVarcstrsWriterIndex > component.updatedVarcstrsReaderIndex) {
								if (component.varcstrTriggers == null || VarcDomain.updatedVarcstrsWriterIndex - component.updatedVarcstrsReaderIndex > 32) {
									@Pc(1101) HookRequest request = new HookRequest();
									request.source = component;
									request.arguments = component.onVarcstrTransmit;
									Static3.aClass112_14.addTail(request);
								} else {
									label574:
									for (@Pc(1116) int i = component.updatedVarcstrsReaderIndex; i < VarcDomain.updatedVarcstrsWriterIndex; i++) {
										@Pc(1125) int varcstr = VarcDomain.updatedVarcstrs[i & 0x1F];
										for (@Pc(1127) int j = 0; j < component.varcstrTriggers.length; j++) {
											if (component.varcstrTriggers[j] == varcstr) {
												@Pc(1142) HookRequest request = new HookRequest();
												request.source = component;
												request.arguments = component.onVarcstrTransmit;
												Static3.aClass112_14.addTail(request);
												break label574;
											}
										}
									}
								}
								component.updatedVarcstrsReaderIndex = VarcDomain.updatedVarcstrsWriterIndex;
							}
							if (component.onVarpTransmit != null && VarpDomain.updatedVarpsWriterIndex > component.updatedVarpsReaderIndex) {
								if (component.varpTriggers == null || VarpDomain.updatedVarpsWriterIndex - component.updatedVarpsReaderIndex > 32) {
									@Pc(1181) HookRequest request = new HookRequest();
									request.source = component;
									request.arguments = component.onVarpTransmit;
									Static3.aClass112_14.addTail(request);
								} else {
									label550:
									for (@Pc(1196) int i = component.updatedVarpsReaderIndex; i < VarpDomain.updatedVarpsWriterIndex; i++) {
										@Pc(1205) int varp = VarpDomain.updatedVarps[i & 0x1F];
										for (@Pc(1207) int j = 0; j < component.varpTriggers.length; j++) {
											if (component.varpTriggers[j] == varp) {
												@Pc(1222) HookRequest request = new HookRequest();
												request.source = component;
												request.arguments = component.onVarpTransmit;
												Static3.aClass112_14.addTail(request);
												break label550;
											}
										}
									}
								}
								component.updatedVarpsReaderIndex = VarpDomain.updatedVarpsWriterIndex;
							}
							if (component.onInvTransmit != null && Inv.updatedInventoriesWriterIndex > component.updatedInventoriesReaderIndex) {
								if (component.inventoryTriggers == null || Inv.updatedInventoriesWriterIndex - component.updatedInventoriesReaderIndex > 32) {
									@Pc(1261) HookRequest request = new HookRequest();
									request.source = component;
									request.arguments = component.onInvTransmit;
									Static3.aClass112_14.addTail(request);
								} else {
									label526:
									for (@Pc(1276) int i = component.updatedInventoriesReaderIndex; i < Inv.updatedInventoriesWriterIndex; i++) {
										@Pc(1285) int inventory = Inv.updatedInventories[i & 0x1F];
										for (@Pc(1287) int j = 0; j < component.inventoryTriggers.length; j++) {
											if (component.inventoryTriggers[j] == inventory) {
												@Pc(1302) HookRequest request = new HookRequest();
												request.source = component;
												request.arguments = component.onInvTransmit;
												Static3.aClass112_14.addTail(request);
												break label526;
											}
										}
									}
								}
								component.updatedInventoriesReaderIndex = Inv.updatedInventoriesWriterIndex;
							}
							if (component.onStatTransmit != null && PlayerSkillXpTable.updatedStatsWriterIndex > component.updatedStatsReaderIndex) {
								if (component.statTriggers == null || PlayerSkillXpTable.updatedStatsWriterIndex - component.updatedStatsReaderIndex > 32) {
									@Pc(1341) HookRequest request = new HookRequest();
									request.source = component;
									request.arguments = component.onStatTransmit;
									Static3.aClass112_14.addTail(request);
								} else {
									label502:
									for (@Pc(1356) int i = component.updatedStatsReaderIndex; i < PlayerSkillXpTable.updatedStatsWriterIndex; i++) {
										@Pc(1365) int skill = PlayerSkillXpTable.updatedStats[i & 0x1F];
										for (@Pc(1367) int j = 0; j < component.statTriggers.length; j++) {
											if (component.statTriggers[j] == skill) {
												@Pc(1382) HookRequest request = new HookRequest();
												request.source = component;
												request.arguments = component.onStatTransmit;
												Static3.aClass112_14.addTail(request);
												break label502;
											}
										}
									}
								}
								component.updatedStatsReaderIndex = PlayerSkillXpTable.updatedStatsWriterIndex;
							}
							if (Static6.anInt5189 > component.anInt5945 && component.onChatTransmit != null) {
								@Pc(1412) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onChatTransmit;
								Static3.aClass112_14.addTail(request);
							}
							if (Static3.anInt2102 > component.anInt5945 && component.onFriendTransmit != null) {
								@Pc(1434) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onFriendTransmit;
								Static3.aClass112_14.addTail(request);
							}
							if (Static3.anInt2616 > component.anInt5945 && component.onClanTransmit != null) {
								@Pc(1456) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onClanTransmit;
								Static3.aClass112_14.addTail(request);
							}
							if (Static6.anInt4996 > component.anInt5945 && component.onStockTransmit != null) {
								@Pc(1478) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onStockTransmit;
								Static3.aClass112_14.addTail(request);
							}
							if (Static1.anInt925 > component.anInt5945 && component.onMiscTransmit != null) {
								@Pc(1500) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onMiscTransmit;
								Static3.aClass112_14.addTail(request);
							}
							component.anInt5945 = Static6.anInt4979;
							if (component.onKey != null) {
								for (@Pc(1519) int i = 0; i < Static6.anInt5088; i++) {
									@Pc(1526) HookRequest request = new HookRequest();
									request.source = component;
									request.keyCode = Static5.anIntArray441[i];
									request.keyChar = Static5.anIntArray419[i];
									request.arguments = component.onKey;
									Static3.aClass112_14.addTail(request);
								}
							}
							if (Static1.aBoolean35 && component.onCamFinished != null) {
								@Pc(1558) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onCamFinished;
								Static3.aClass112_14.addTail(request);
							}
						}
					}
					if (!component.if3 && Static1.aClass185_1 == null && Static5.aClass185_10 == null && !Static1.aBoolean17) {
						if ((component.anInt5923 >= 0 || component.anInt5966 != 0) && Mouse.x >= local61 && Mouse.y >= local63 && Mouse.x < local65 && Mouse.y < local67) {
							if (component.anInt5923 >= 0) {
								Static5.aClass185_11 = arg0[component.anInt5923];
							} else {
								Static5.aClass185_11 = component;
							}
						}
						if (component.type == 8 && Mouse.x >= local61 && Mouse.y >= local63 && Mouse.x < local65 && Mouse.y < local67) {
							Static2.aClass185_4 = component;
						}
						if (component.scrollHeight > component.height) {
							Static18.method1742(component, Mouse.y, local50 + component.width, Mouse.x, component.scrollHeight, local55, component.height);
						}
					}
					if (component.type == 0) {
						method693(arg0, component.id, local61, local63, local65, local67, local50 - component.scrollX, local55 - component.scrollY);
						if (component.createdComponents != null) {
							method693(component.createdComponents, component.id, local61, local63, local65, local67, local50 - component.scrollX, local55 - component.scrollY);
						}
						@Pc(1691) SubInterface local1691 = (SubInterface) InterfaceList.subInterfaces.get((long) component.id);
						if (local1691 != null) {
							Static14.method1060(local1691.id, local65, local50, local63, local55, local61, local67);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZI)V")
	private static void method694(@OriginalArg(1) int arg0) {
		Static1.anInt331 = arg0;
		Static6.anInt4393 = -1;
		Static1.anInt929 = -1;
		Static28.method3249();
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(ZI)V")
	public static void method698(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = Static3.anInt2519;
		@Pc(7) int local7 = Static7.anInt5678;
		@Pc(9) int local9 = Static2.anInt1931;
		@Pc(12) int local12 = (int) Static5.aFloat147;
		@Pc(14) int local14 = Static5.anInt3656;
		if (Static1.anInt626 / 256 > local12) {
			local12 = Static1.anInt626 / 256;
		}
		@Pc(26) int local26 = Static5.anInt4066;
		if (Static3.aBooleanArray13[4] && local12 < Static7.anIntArray626[4] + 128) {
			local12 = Static7.anIntArray626[4] + 128;
		}
		@Pc(51) int local51 = (int) Static5.aFloat97 + Static1.anInt242 & 0x7FF;
		Static32.method3954(local51, SceneGraph.method522(Player.level, PlayerList.self.xFine, PlayerList.self.zFine) - 50, local12, local12 * 3 + 600, Static3.anInt2496, arg0, Static7.anInt5412);
		if (Static3.anInt2519 == local5 && local9 == Static2.anInt1931 && local7 == Static7.anInt5678 && Static5.anInt4066 == local26 && Static5.anInt3656 == local14) {
			Static1.anInt772 = 1;
			return;
		}
		Static6.anInt4838 = 10;
		Static7.anInt5236 = 10;
		Static5.anInt3490 = 10;
		@Pc(105) int local105 = Static5.anInt3656 - local14;
		if (local7 < Static7.anInt5678) {
			local7 += Static7.anInt5236 + (Static7.anInt5678 - local7) * Static5.anInt3490 / 1000;
			if (local7 < Static7.anInt5678) {
				Static7.anInt5678 = local7;
			}
		}
		if (Static7.anInt5678 < local7) {
			@Pc(146) int local146 = local7 - Static7.anInt5236 - (local7 - Static7.anInt5678) * Static5.anInt3490 / 1000;
			if (Static7.anInt5678 < local146) {
				Static7.anInt5678 = local146;
			}
		}
		if (local105 > 1024) {
			local105 -= 2048;
		}
		if (local9 < Static2.anInt1931) {
			local9 += (Static2.anInt1931 - local9) * Static5.anInt3490 / 1000 + Static7.anInt5236;
			if (Static2.anInt1931 > local9) {
				Static2.anInt1931 = local9;
			}
		}
		if (Static2.anInt1931 < local9) {
			@Pc(209) int local209 = local9 - Static5.anInt3490 * (local9 - Static2.anInt1931) / 1000 - Static7.anInt5236;
			if (local209 > Static2.anInt1931) {
				Static2.anInt1931 = local209;
			}
		}
		if (local5 < Static3.anInt2519) {
			local5 += Static7.anInt5236 + Static5.anInt3490 * (Static3.anInt2519 - local5) / 1000;
			if (Static3.anInt2519 > local5) {
				Static3.anInt2519 = local5;
			}
		}
		Static1.anInt212 = 10;
		if (Static3.anInt2519 < local5) {
			@Pc(258) int local258 = local5 - Static5.anInt3490 * (local5 - Static3.anInt2519) / 1000 - Static7.anInt5236;
			if (Static3.anInt2519 < local258) {
				Static3.anInt2519 = local258;
			}
		}
		if (local105 < -1024) {
			local105 += 2048;
		}
		if (Static5.anInt4066 > local26) {
			local26 += Static6.anInt4838 + (Static5.anInt4066 - local26) * Static1.anInt212 / 1000;
			if (local26 < Static5.anInt4066) {
				Static5.anInt4066 = local26;
			}
		}
		if (local105 > 0) {
			@Pc(310) int local310 = local14 + Static1.anInt212 * local105 / 1000 + Static6.anInt4838;
			local14 = local310 & 0x7FF;
		}
		if (Static5.anInt4066 < local26) {
			@Pc(335) int local335 = local26 - Static6.anInt4838 - Static1.anInt212 * (local26 - Static5.anInt4066) / 1000;
			if (Static5.anInt4066 < local335) {
				Static5.anInt4066 = local335;
			}
		}
		if (local105 < 0) {
			@Pc(358) int local358 = local14 - Static6.anInt4838 - -local105 * Static1.anInt212 / 1000;
			local14 = local358 & 0x7FF;
		}
		@Pc(366) int local366 = Static5.anInt3656 - local14;
		if (local366 > 1024) {
			local366 -= 2048;
		}
		if (local366 < -1024) {
			local366 += 2048;
		}
		if (local366 >= 0 || local105 <= 0 || local366 > 0 && local105 < 0) {
			Static5.anInt3656 = local14;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method716(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (IntUtils.isPowerOfTwo(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(45) int local45 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(48) int local48;
			do {
				local48 = arg0.nextInt();
			} while (local48 >= local45);
			return Static29.method3538(local48, arg1);
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
	public static void method719() {
		ReflectionCheck.queue = new LinkedList();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)[F")
	public static float[] method723() {
		@Pc(9) float local9 = Static25.method2773() + Static25.method2776();
		@Pc(15) int local15 = Static25.method2778();
		@Pc(24) float local24 = (float) (local15 >> 16 & 0xFF) / 255.0F;
		Static4.aFloatArray64[3] = 1.0F;
		@Pc(37) float local37 = (float) (local15 >> 8 & 0xFF) / 255.0F;
		@Pc(39) float local39 = 0.58823526F;
		@Pc(46) float local46 = (float) (local15 & 0xFF) / 255.0F;
		Static4.aFloatArray64[2] = local39 * Static4.aFloatArray38[2] * local46 * local9;
		Static4.aFloatArray64[1] = local9 * local39 * Static4.aFloatArray38[1] * local37;
		Static4.aFloatArray64[0] = Static4.aFloatArray38[0] * local24 * local39 * local9;
		return Static4.aFloatArray64;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIII)V")
	public static void method736(@OriginalArg(1) int level, @OriginalArg(2) int angle, @OriginalArg(3) int z, @OriginalArg(4) int layer, @OriginalArg(5) int id, @OriginalArg(6) int x, @OriginalArg(7) int shape) {
		if (x < 1 || z < 1 || x > 102 || z > 102) {
			return;
		}
		if (!SceneGraph.isAllLevelsVisible() && (Static4.tileFlags[0][x][z] & 0x2) == 0) {
			@Pc(39) int local39 = level;
			if ((Static4.tileFlags[level][x][z] & 0x8) != 0) {
				local39 = 0;
			}
			if (local39 != Static2.anInt1216) {
				return;
			}
		}
		@Pc(64) int local64 = level;
		if (level < 3 && (Static4.tileFlags[1][x][z] & 0x2) == 2) {
			local64 = level + 1;
		}
		Static21.method2018(level, local64, z, PathFinder.collisionMaps[level], layer, x);
		if (id >= 0) {
			@Pc(97) boolean prevGroundDecoration = Preferences.groundDecoration;
			Preferences.groundDecoration = true;
			Static22.method2193(angle, level, id, local64, x, false, z, PathFinder.collisionMaps[level], false, shape);
			Preferences.groundDecoration = prevGroundDecoration;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!eg;IIILclient!vg;IIIZIII)Lclient!vg;")
	public static Model method745(@OriginalArg(0) int arg0, @OriginalArg(2) SeqType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Model arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(23) long local23 = ((long) arg10 << 32) + (long) ((arg4 << 24) + (arg11 << 16) + arg3) + ((long) arg0 << 48);
		@Pc(33) Model local33 = (Model) Static6.aClass26_50.get(local23);
		if (local33 == null) {
			@Pc(41) byte local41;
			if (arg3 == 1) {
				local41 = 9;
			} else if (arg3 == 2) {
				local41 = 12;
			} else if (arg3 == 3) {
				local41 = 15;
			} else if (arg3 == 4) {
				local41 = 18;
			} else {
				local41 = 21;
			}
			@Pc(83) int[] local83 = new int[] { 64, 96, 128 };
			@Pc(89) int[][] local89 = new int[3][local41];
			@Pc(107) RawModel local107 = new RawModel(local41 * 3 + 1, local41 * 2 * 3 - local41, 0);
			@Pc(113) int local113 = local107.addVertex(0, 0);
			for (@Pc(115) int local115 = 0; local115 < 3; local115++) {
				@Pc(126) int local126 = local83[local115];
				@Pc(130) int local130 = local83[local115];
				for (@Pc(132) int local132 = 0; local132 < local41; local132++) {
					@Pc(145) int local145 = (local132 << 11) / local41;
					@Pc(155) int local155 = MathUtils.SINE[local145] * local126 + arg12 >> 16;
					@Pc(165) int local165 = MathUtils.COSINE[local145] * local130 + arg8 >> 16;
					local89[local115][local132] = local107.addVertex(local155, local165);
				}
			}
			for (@Pc(183) int local183 = 0; local183 < 3; local183++) {
				@Pc(198) int local198 = (local183 * 256 + 128) / 3;
				@Pc(203) int local203 = 256 - local198;
				@Pc(214) byte local214 = (byte) (local198 * arg4 + local203 * arg11 >> 8);
				@Pc(259) short local259 = (short) ((local198 * (arg0 & 0xFC00) + local203 * (arg10 & 0xFC00) & 0xFC0000) + ((arg0 & 0x380) * local198 + local203 * (arg10 & 0x380) & 0x38000) + ((arg10 & 0x7F) * local203 + local198 * (arg0 & 0x7F) & 0x7F00) >> 8);
				for (@Pc(261) int local261 = 0; local261 < local41; local261++) {
					if (local183 == 0) {
						local107.addTriangle(local113, local89[0][(local261 + 1) % local41], local89[0][local261], local259, local214);
					} else {
						local107.addTriangle(local89[local183 - 1][local261], local89[local183 - 1][(local261 + 1) % local41], local89[local183][(local261 + 1) % local41], local259, local214);
						local107.addTriangle(local89[local183 - 1][local261], local89[local183][(local261 + 1) % local41], local89[local183][local261], local259, local214);
					}
				}
			}
			local33 = local107.createModel(64, 768, -50, -10, -50);
			Static6.aClass26_50.put(local23, local33);
		}
		@Pc(377) int local377 = arg3 * 64 - 1;
		@Pc(380) int local380 = -local377;
		@Pc(387) int local387 = local377;
		@Pc(390) int local390 = -local377;
		@Pc(392) int local392 = local377;
		if (arg9) {
			if (arg2 > 128 && arg2 < 896) {
				local380 -= 128;
			}
			if (arg2 > 1664 || arg2 < 384) {
				local390 -= 128;
			}
			if (arg2 > 1152 && arg2 < 1920) {
				local387 = local377 + 128;
			}
			if (arg2 > 640 && arg2 < 1408) {
				local392 = local377 + 128;
			}
		}
		@Pc(432) int local432 = arg5.getMinX();
		@Pc(435) int local435 = arg5.getMaxX();
		@Pc(438) int local438 = arg5.getMinZ();
		if (local387 < local435) {
			local435 = local387;
		}
		if (local390 > local438) {
			local438 = local390;
		}
		@Pc(457) int local457 = arg5.getMaxZ();
		if (local432 < local380) {
			local432 = local380;
		}
		if (local457 > local392) {
			local457 = local392;
		}
		@Pc(475) AnimFrameset local475 = null;
		if (arg1 != null) {
			arg6 = arg1.anIntArray95[arg6];
			local475 = SeqTypeList.getAnimFrameset(arg6 >> 16);
			arg6 &= 65535;
		}
		@Pc(500) Model local500;
		if (local475 == null) {
			local500 = local33.method3836(true, true, true);
			local500.resize((local435 - local432) / 2, 128, (local457 - local438) / 2);
			local500.translate((local432 + local435) / 2, 0, (local438 + local457) / 2);
		} else {
			local500 = local33.method3836(!local475.method4150(arg6), !local475.method4151(arg6), true);
			local500.resize((local435 - local432) / 2, 128, (local457 - local438) / 2);
			local500.translate((local435 + local432) / 2, 0, (local438 + local457) / 2);
			local500.method3844(local475, arg6);
		}
		if (arg2 != 0) {
			local500.method3815(arg2);
		}
		if (GlRenderer.enabled) {
			@Pc(591) GlModel local591 = (GlModel) local500;
			if (arg7 != SceneGraph.method522(Player.level, arg12 + local432, local438 + arg8) || SceneGraph.method522(Player.level, local435 + arg12, local457 + arg8) != arg7) {
				for (@Pc(615) int local615 = 0; local615 < local591.vertexCount; local615++) {
					@Pc(621) int[] local621 = local591.vertexY;
					local621[local615] += SceneGraph.method522(Player.level, arg12 + local591.vertexX[local615], arg8 + local591.vertexZ[local615]) - arg7;
				}
				local591.vertexBuffer.valid = false;
				local591.bounds.valid = false;
			}
		} else {
			@Pc(660) SoftwareModel local660 = (SoftwareModel) local500;
			if (arg7 != SceneGraph.method522(Player.level, local432 + arg12, local438 + arg8) || arg7 != SceneGraph.method522(Player.level, arg12 + local435, local457 + arg8)) {
				for (@Pc(690) int local690 = 0; local690 < local660.vertexCount; local690++) {
					@Pc(700) int[] local700 = local660.vertexY;
					local700[local690] += SceneGraph.method522(Player.level, local660.vertexX[local690] + arg12, local660.vertexZ[local690] + arg8) - arg7;
				}
				local660.boundsValid = false;
			}
		}
		return local500;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BZ)V")
	public static void method777(@OriginalArg(1) boolean arg0) {
		Static21.method2050(arg0, GameShell.canvasWidth, InterfaceList.topLevelInterface, GameShell.canvasHeight);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!wf;)Ljava/lang/String;")
	public static String method780(@OriginalArg(1) Component arg0) {
		if (InterfaceList.getServerActiveProperties(arg0).getTargetMask() == 0) {
			return null;
		} else if (arg0.targetVerb == null || arg0.targetVerb.trim().length() == 0) {
			return Static1.qaOpTest ? "Hidden-use" : null;
		} else {
			return arg0.targetVerb;
		}
	}

}

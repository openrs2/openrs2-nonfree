import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IJ)V")
	public static void method641(@OriginalArg(1) long arg0) {
		if (!Preferences.aBoolean293) {
			Camera.pitch += (float) arg0 * Static1.aFloat20 / 40.0F;
			Camera.yaw += (float) arg0 * Static4.aFloat79 / 40.0F;
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!wf;IIIIIII)V")
	public static void method693(@OriginalArg(0) Component[] components, @OriginalArg(1) int layer, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int i = 0; i < components.length; i++) {
			@Pc(9) Component component = components[i];
			if (component != null && component.layer == layer && (!component.if3 || component.type == 0 || component.hasHook || InterfaceList.getServerActiveProperties(component).events != 0 || component == Static1.aClass185_2 || component.anInt5904 == 1338) && (!component.if3 || !InterfaceList.isHidden(component))) {
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
						if (!component.if3 && InterfaceList.isHidden(component) && Static5.aClass185_11 != component) {
							continue;
						}
						if (component.noClickThrough && Mouse.x >= local61 && Mouse.y >= local63 && Mouse.x < local65 && Mouse.y < local67) {
							for (@Pc(164) HookRequest request = (HookRequest) InterfaceList.lowPriorityRequests.head(); request != null; request = (HookRequest) InterfaceList.lowPriorityRequests.next()) {
								if (request.aBoolean172) {
									request.unlink();
									request.source.aBoolean414 = false;
								}
							}
							if (Static3.anInt2165 == 0) {
								Static1.aClass185_1 = null;
								Static1.aClass185_2 = null;
							}
							Static1.anInt640 = 0;
							WorldMap.aBoolean166 = false;
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
							InterfaceList.dragPickUp(component, Mouse.clickX - local50, Mouse.clickY - local55);
						}
						if (Static1.aClass185_1 != null && Static1.aClass185_1 != component && local209 && InterfaceList.getServerActiveProperties(component).isDragTarget()) {
							Static7.aClass185_16 = component;
						}
						if (component == Static1.aClass185_2) {
							Static4.aBoolean232 = true;
							Static2.anInt1633 = local50;
							Static6.anInt5182 = local55;
						}
						if (component.hasHook || component.anInt5904 != 0) {
							if (local209 && Static3.wheelRotation != 0 && component.onScrollWheel != null) {
								@Pc(418) HookRequest request = new HookRequest();
								request.aBoolean172 = true;
								request.source = component;
								request.mouseY = Static3.wheelRotation;
								request.arguments = component.onScrollWheel;
								InterfaceList.lowPriorityRequests.addTail(request);
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
									WorldMap.component = component;
									if (local209) {
										WorldMap.aBoolean166 = true;
									}
									if (local223) {
										@Pc(506) int local506 = (int) ((double) (Mouse.clickX - local50 - component.width / 2) * 2.0D / (double) WorldMap.zoom);
										@Pc(522) int local522 = (int) ((double) (Mouse.clickY - local55 - component.height / 2) * 2.0D / (double) WorldMap.zoom);
										@Pc(526) int local526 = WorldMap.anInt331 + local506;
										@Pc(530) int local530 = WorldMap.anInt5231 + local522;
										@Pc(534) int local534 = local526 + WorldMap.originX;
										@Pc(542) int local542 = WorldMap.length + WorldMap.originZ - local530 - 1;
										@Pc(545) Map local545 = WorldMap.getCurrentMap();
										if (local545 == null) {
											continue;
										}
										@Pc(550) int[] local550 = new int[3];
										local545.convertDisplayToSource(local534, local542, local550);
										if (local550 != null) {
											if (Keyboard.pressedKeys[82] && LoginManager.staffModLevel > 0) {
												Cheat.teleport(local550[0], local550[1], local550[2]);
												InterfaceList.closeModal();
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
											Static1.anInt927 = WorldMap.anInt331;
											Static1.anInt647 = WorldMap.anInt5231;
											Static1.anInt640 = 2;
										}
										if (Static1.anInt640 == 2) {
											Static1.aBoolean49 = true;
											WorldMap.method694(Static1.anInt927 + (int) ((double) (Static5.anInt5204 - Mouse.x) * 2.0D / (double) WorldMap.targetZoom));
											WorldMap.method4404(Static1.anInt647 + (int) ((double) (Static1.anInt777 - Mouse.y) * 2.0D / (double) WorldMap.targetZoom));
										}
										continue;
									}
									if (Static1.anInt640 > 0 && !Static1.aBoolean49) {
										if ((Static3.anInt5400 == 1 || MiniMenu.method1005(MiniMenu.size - 1)) && MiniMenu.size > 2) {
											Static31.method3783();
										} else if (MiniMenu.size > 0) {
											Static37.method4784();
										}
									}
									Static1.anInt640 = 0;
									continue;
								}
								if (component.anInt5904 == 1401) {
									if (local214) {
										WorldMap.method3319(Mouse.y - local55, component.width, component.height, Mouse.x - local50);
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
									InterfaceList.lowPriorityRequests.addTail(request);
								}
							}
							if (component.aBoolean408 && local214 && component.onClickRepeat != null) {
								@Pc(773) HookRequest request = new HookRequest();
								request.aBoolean172 = true;
								request.source = component;
								request.mouseX = Mouse.x - local50;
								request.mouseY = Mouse.y - local55;
								request.arguments = component.onClickRepeat;
								InterfaceList.lowPriorityRequests.addTail(request);
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
									InterfaceList.mediumPriorityRequests.addTail(request);
								}
							}
							if (local214 && component.onHold != null) {
								@Pc(845) HookRequest request = new HookRequest();
								request.aBoolean172 = true;
								request.source = component;
								request.mouseX = Mouse.x - local50;
								request.mouseY = Mouse.y - local55;
								request.arguments = component.onHold;
								InterfaceList.lowPriorityRequests.addTail(request);
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
									InterfaceList.lowPriorityRequests.addTail(request);
								}
							}
							if (component.aBoolean414 && local209 && component.onMouseRepeat != null) {
								@Pc(920) HookRequest request = new HookRequest();
								request.aBoolean172 = true;
								request.source = component;
								request.mouseX = Mouse.x - local50;
								request.mouseY = Mouse.y - local55;
								request.arguments = component.onMouseRepeat;
								InterfaceList.lowPriorityRequests.addTail(request);
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
									InterfaceList.mediumPriorityRequests.addTail(request);
								}
							}
							if (component.onTimer != null) {
								@Pc(990) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onTimer;
								InterfaceList.highPriorityRequests.addTail(request);
							}
							if (component.onVarcTransmit != null && VarcDomain.updatedVarcsWriterIndex > component.updatedVarcsReaderIndex) {
								if (component.varcTriggers == null || VarcDomain.updatedVarcsWriterIndex - component.updatedVarcsReaderIndex > 32) {
									@Pc(1021) HookRequest request = new HookRequest();
									request.source = component;
									request.arguments = component.onVarcTransmit;
									InterfaceList.lowPriorityRequests.addTail(request);
								} else {
									outer:
									for (@Pc(1036) int j = component.updatedVarcsReaderIndex; j < VarcDomain.updatedVarcsWriterIndex; j++) {
										@Pc(1045) int varc = VarcDomain.updatedVarcs[j & 0x1F];
										for (@Pc(1047) int k = 0; k < component.varcTriggers.length; k++) {
											if (component.varcTriggers[k] == varc) {
												@Pc(1062) HookRequest request = new HookRequest();
												request.source = component;
												request.arguments = component.onVarcTransmit;
												InterfaceList.lowPriorityRequests.addTail(request);
												break outer;
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
									InterfaceList.lowPriorityRequests.addTail(request);
								} else {
									label574:
									for (@Pc(1116) int j = component.updatedVarcstrsReaderIndex; j < VarcDomain.updatedVarcstrsWriterIndex; j++) {
										@Pc(1125) int varcstr = VarcDomain.updatedVarcstrs[j & 0x1F];
										for (@Pc(1127) int k = 0; k < component.varcstrTriggers.length; k++) {
											if (component.varcstrTriggers[k] == varcstr) {
												@Pc(1142) HookRequest request = new HookRequest();
												request.source = component;
												request.arguments = component.onVarcstrTransmit;
												InterfaceList.lowPriorityRequests.addTail(request);
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
									InterfaceList.lowPriorityRequests.addTail(request);
								} else {
									outer:
									for (@Pc(1196) int j = component.updatedVarpsReaderIndex; j < VarpDomain.updatedVarpsWriterIndex; j++) {
										@Pc(1205) int varp = VarpDomain.updatedVarps[j & 0x1F];
										for (@Pc(1207) int k = 0; k < component.varpTriggers.length; k++) {
											if (component.varpTriggers[k] == varp) {
												@Pc(1222) HookRequest request = new HookRequest();
												request.source = component;
												request.arguments = component.onVarpTransmit;
												InterfaceList.lowPriorityRequests.addTail(request);
												break outer;
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
									InterfaceList.lowPriorityRequests.addTail(request);
								} else {
									outer:
									for (@Pc(1276) int j = component.updatedInventoriesReaderIndex; j < Inv.updatedInventoriesWriterIndex; j++) {
										@Pc(1285) int inventory = Inv.updatedInventories[j & 0x1F];
										for (@Pc(1287) int k = 0; k < component.inventoryTriggers.length; k++) {
											if (component.inventoryTriggers[k] == inventory) {
												@Pc(1302) HookRequest request = new HookRequest();
												request.source = component;
												request.arguments = component.onInvTransmit;
												InterfaceList.lowPriorityRequests.addTail(request);
												break outer;
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
									InterfaceList.lowPriorityRequests.addTail(request);
								} else {
									outer:
									for (@Pc(1356) int j = component.updatedStatsReaderIndex; j < PlayerSkillXpTable.updatedStatsWriterIndex; j++) {
										@Pc(1365) int skill = PlayerSkillXpTable.updatedStats[j & 0x1F];
										for (@Pc(1367) int k = 0; k < component.statTriggers.length; k++) {
											if (component.statTriggers[k] == skill) {
												@Pc(1382) HookRequest request = new HookRequest();
												request.source = component;
												request.arguments = component.onStatTransmit;
												InterfaceList.lowPriorityRequests.addTail(request);
												break outer;
											}
										}
									}
								}
								component.updatedStatsReaderIndex = PlayerSkillXpTable.updatedStatsWriterIndex;
							}
							if (Chat.transmitAt > component.lastTransmitTimer && component.onChatTransmit != null) {
								@Pc(1412) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onChatTransmit;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (FriendsList.transmitAt > component.lastTransmitTimer && component.onFriendTransmit != null) {
								@Pc(1434) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onFriendTransmit;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (ClanChat.transmitAt > component.lastTransmitTimer && component.onClanTransmit != null) {
								@Pc(1456) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onClanTransmit;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (StockMarketManager.transmitAt > component.lastTransmitTimer && component.onStockTransmit != null) {
								@Pc(1478) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onStockTransmit;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							if (InterfaceList.miscTransmitAt > component.lastTransmitTimer && component.onMiscTransmit != null) {
								@Pc(1500) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onMiscTransmit;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
							component.lastTransmitTimer = InterfaceList.transmitTimer;
							if (component.onKey != null) {
								for (@Pc(1519) int j = 0; j < InterfaceList.keyQueueSize; j++) {
									@Pc(1526) HookRequest request = new HookRequest();
									request.source = component;
									request.keyCode = InterfaceList.keyCodes[j];
									request.keyChar = InterfaceList.keyChars[j];
									request.arguments = component.onKey;
									InterfaceList.lowPriorityRequests.addTail(request);
								}
							}
							if (Static1.aBoolean35 && component.onCamFinished != null) {
								@Pc(1558) HookRequest request = new HookRequest();
								request.source = component;
								request.arguments = component.onCamFinished;
								InterfaceList.lowPriorityRequests.addTail(request);
							}
						}
					}
					if (!component.if3 && Static1.aClass185_1 == null && Static5.aClass185_10 == null && !Static1.aBoolean17) {
						if ((component.anInt5923 >= 0 || component.anInt5966 != 0) && Mouse.x >= local61 && Mouse.y >= local63 && Mouse.x < local65 && Mouse.y < local67) {
							if (component.anInt5923 >= 0) {
								Static5.aClass185_11 = components[component.anInt5923];
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
						method693(components, component.id, local61, local63, local65, local67, local50 - component.scrollX, local55 - component.scrollY);
						if (component.createdComponents != null) {
							method693(component.createdComponents, component.id, local61, local63, local65, local67, local50 - component.scrollX, local55 - component.scrollY);
						}
						@Pc(1691) SubInterface subInterface = (SubInterface) InterfaceList.subInterfaces.get(component.id);
						if (subInterface != null) {
							Static14.method1060(subInterface.id, local65, local50, local63, local55, local61, local67);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(ZI)V")
	public static void method698(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = Static3.anInt2519;
		@Pc(7) int local7 = Static7.anInt5678;
		@Pc(9) int local9 = Static2.anInt1931;
		@Pc(12) int local12 = (int) Camera.pitch;
		@Pc(14) int local14 = Static5.anInt3656;
		if (Static1.anInt626 / 256 > local12) {
			local12 = Static1.anInt626 / 256;
		}
		@Pc(26) int local26 = Static5.anInt4066;
		if (Camera.shakeEnabled[4] && local12 < Camera.anIntArray626[4] + 128) {
			local12 = Camera.anIntArray626[4] + 128;
		}
		@Pc(51) int local51 = (int) Camera.yaw + Static1.anInt242 & 0x7FF;
		Static32.method3954(local51, SceneGraph.getTileHeight(Player.level, PlayerList.self.xFine, PlayerList.self.zFine) - 50, local12, local12 * 3 + 600, Static3.anInt2496, arg0, Static7.anInt5412);
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

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BZ)V")
	public static void method777(@OriginalArg(1) boolean arg0) {
		Static21.method2050(arg0, GameShell.canvasWidth, InterfaceList.topLevelInterface, GameShell.canvasHeight);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!wf;)Ljava/lang/String;")
	public static String getTargetVerb(@OriginalArg(1) Component component) {
		if (InterfaceList.getServerActiveProperties(component).getTargetMask() == 0) {
			return null;
		} else if (component.targetVerb == null || component.targetVerb.trim().length() == 0) {
			return Static1.qaOpTest ? "Hidden-use" : null;
		} else {
			return component.targetVerb;
		}
	}

}

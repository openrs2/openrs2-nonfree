import java.util.Date;
import java.util.Random;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)V")
	public static void method638() {
		if (Static4.anInt3020 != Static7.y && Static13.method1009(Static7.y)) {
			Static4.anInt3020 = Static7.y;
		}
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(B)Z")
	public static boolean method639() {
		try {
			if (Static5.anInt4357 == 2) {
				if (Static7.aClass4_Sub31_2 == null) {
					Static7.aClass4_Sub31_2 = Static33.method4165(Static2.aClass58_42, Static7.anInt6022, Static2.anInt1244);
					if (Static7.aClass4_Sub31_2 == null) {
						return false;
					}
				}
				if (Static1.aClass98_1 == null) {
					Static1.aClass98_1 = new Class98(Static6.aClass58_93, Static2.aClass58_41);
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
		@Pc(37) int local37 = PlayerList.self.z + Static1.anInt837;
		@Pc(42) int local42 = Static1.anInt548 + PlayerList.self.x;
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

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method685() {
		Protocol.outboundBuffer.writeOpcode(218);
		Protocol.outboundBuffer.writeLong(0L);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!wf;)Lclient!on;")
	public static Class4_Sub21 method687(@OriginalArg(0) Component arg0) {
		@Pc(13) Class4_Sub21 local13 = (Class4_Sub21) Static2.aClass84_5.get(((long) arg0.id << 32) + (long) arg0.anInt5968);
		return local13 == null ? arg0.aClass4_Sub21_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!wf;)Lclient!wf;")
	public static Component method691(@OriginalArg(0) Component arg0) {
		@Pc(4) int local4 = method687(arg0).method3271();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = InterfaceList.getComponent(arg0.anInt5937);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!wf;)Z")
	public static boolean method692(@OriginalArg(0) Component arg0) {
		if (Static1.aBoolean26) {
			if (method687(arg0).anInt3947 != 0) {
				return false;
			}
			if (arg0.type == 0) {
				return false;
			}
		}
		return arg0.aBoolean417;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!wf;IIIIIII)V")
	public static void method693(@OriginalArg(0) Component[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Component local9 = arg0[local1];
			if (local9 != null && local9.anInt5937 == arg1 && (!local9.if3 || local9.type == 0 || local9.aBoolean403 || method687(local9).anInt3947 != 0 || local9 == Static1.aClass185_2 || local9.anInt5904 == 1338) && (!local9.if3 || !method692(local9))) {
				@Pc(50) int local50 = local9.anInt5960 + arg6;
				@Pc(55) int local55 = local9.anInt5888 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.type == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt5893;
					@Pc(78) int local78 = local55 + local9.anInt5949;
					if (local9.type == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static1.aClass185_1) {
					Static6.aBoolean310 = true;
					Static4.anInt3183 = local50;
					Static1.anInt134 = local55;
				}
				if (!local9.if3 || local61 < local65 && local63 < local67) {
					if (local9.type == 0) {
						if (!local9.if3 && method692(local9) && Static5.aClass185_11 != local9) {
							continue;
						}
						if (local9.aBoolean407 && Mouse.x >= local61 && Mouse.y >= local63 && Mouse.x < local65 && Mouse.y < local67) {
							for (@Pc(164) Class4_Sub13 local164 = (Class4_Sub13) Static3.aClass112_14.head(); local164 != null; local164 = (Class4_Sub13) Static3.aClass112_14.next()) {
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
					if (local9.if3) {
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
						if (local9.aByteArray74 != null) {
							for (@Pc(245) int local245 = 0; local245 < local9.aByteArray74.length; local245++) {
								if (Keyboard.pressedKeys[local9.aByteArray74[local245]]) {
									if (local9.anIntArray659 == null || client.loop >= local9.anIntArray659[local245]) {
										@Pc(281) byte local281 = local9.aByteArray73[local245];
										if (local281 == 0 || ((local281 & 0x8) == 0 || !Keyboard.pressedKeys[86] && !Keyboard.pressedKeys[82] && !Keyboard.pressedKeys[81]) && ((local281 & 0x2) == 0 || Keyboard.pressedKeys[86]) && ((local281 & 0x1) == 0 || Keyboard.pressedKeys[82]) && ((local281 & 0x4) == 0 || Keyboard.pressedKeys[81])) {
											Static37.method4752(local9.id, -1, local245 + 1, "");
											@Pc(341) int local341 = local9.anIntArray662[local245];
											if (local9.anIntArray659 == null) {
												local9.anIntArray659 = new int[local9.aByteArray74.length];
											}
											if (local341 == 0) {
												local9.anIntArray659[local245] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray659[local245] = client.loop + local341;
											}
										}
									}
								} else if (local9.anIntArray659 != null) {
									local9.anIntArray659[local245] = 0;
								}
							}
						}
						if (local223) {
							Static15.method1401(local9, Mouse.clickX - local50, Mouse.clickY - local55);
						}
						if (Static1.aClass185_1 != null && Static1.aClass185_1 != local9 && local209 && method687(local9).method3265()) {
							Static7.aClass185_16 = local9;
						}
						if (local9 == Static1.aClass185_2) {
							Static4.aBoolean232 = true;
							Static2.anInt1633 = local50;
							Static6.anInt5182 = local55;
						}
						if (local9.aBoolean403 || local9.anInt5904 != 0) {
							if (local209 && Static3.anInt2885 != 0 && local9.anObjectArray20 != null) {
								@Pc(418) Class4_Sub13 local418 = new Class4_Sub13();
								local418.aBoolean172 = true;
								local418.source = local9;
								local418.mouseY = Static3.anInt2885;
								local418.arguments = local9.anObjectArray20;
								Static3.aClass112_14.addTail(local418);
							}
							if (Static1.aClass185_1 != null || Static5.aClass185_10 != null || Static1.aBoolean17 || local9.anInt5904 != 1400 && Static1.anInt640 > 0) {
								local223 = false;
								local214 = false;
								local209 = false;
							}
							if (local9.anInt5904 != 0) {
								if (local9.anInt5904 == 1337) {
									Static3.aClass185_5 = local9;
									continue;
								}
								if (local9.anInt5904 == 1338) {
									if (local223) {
										Static2.anInt1941 = Mouse.clickX - local50;
										Static7.anInt5798 = Mouse.clickY - local55;
									}
									continue;
								}
								if (local9.anInt5904 == 1400) {
									Static5.aClass185_12 = local9;
									if (local209) {
										Static3.aBoolean166 = true;
									}
									if (local223) {
										@Pc(506) int local506 = (int) ((double) (Mouse.clickX - local50 - local9.anInt5893 / 2) * 2.0D / (double) Static3.aFloat68);
										@Pc(522) int local522 = (int) ((double) (Mouse.clickY - local55 - local9.anInt5949 / 2) * 2.0D / (double) Static3.aFloat68);
										@Pc(526) int local526 = Static1.anInt331 + local506;
										@Pc(530) int local530 = Static7.anInt5231 + local522;
										@Pc(534) int local534 = local526 + Static3.anInt2962;
										@Pc(542) int local542 = Static3.anInt2960 + Static3.anInt2961 - local530 - 1;
										@Pc(545) Class4_Sub3_Sub22 local545 = Static10.method305();
										if (local545 == null) {
											continue;
										}
										@Pc(550) int[] local550 = new int[3];
										local545.method4758(local534, local542, local550);
										if (local550 != null) {
											if (Keyboard.pressedKeys[82] && Static3.anInt2576 > 0) {
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
											method694(Static1.anInt927 + (int) ((double) (Static5.anInt5204 - Mouse.x) * 2.0D / (double) Static3.aFloat69));
											Static36.method4404(Static1.anInt647 + (int) ((double) (Static1.anInt777 - Mouse.y) * 2.0D / (double) Static3.aFloat69));
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
								if (local9.anInt5904 == 1401) {
									if (local214) {
										Static28.method3319(Mouse.y - local55, local9.anInt5893, local9.anInt5949, Mouse.x - local50);
									}
									continue;
								}
								if (local9.anInt5904 == 1402) {
									if (!GlRenderer.enabled) {
										Static28.method3270(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean408 && local223) {
								local9.aBoolean408 = true;
								if (local9.anObjectArray29 != null) {
									@Pc(737) Class4_Sub13 local737 = new Class4_Sub13();
									local737.aBoolean172 = true;
									local737.source = local9;
									local737.mouseX = Mouse.clickX - local50;
									local737.mouseY = Mouse.clickY - local55;
									local737.arguments = local9.anObjectArray29;
									Static3.aClass112_14.addTail(local737);
								}
							}
							if (local9.aBoolean408 && local214 && local9.anObjectArray15 != null) {
								@Pc(773) Class4_Sub13 local773 = new Class4_Sub13();
								local773.aBoolean172 = true;
								local773.source = local9;
								local773.mouseX = Mouse.x - local50;
								local773.mouseY = Mouse.y - local55;
								local773.arguments = local9.anObjectArray15;
								Static3.aClass112_14.addTail(local773);
							}
							if (local9.aBoolean408 && !local214) {
								local9.aBoolean408 = false;
								if (local9.anObjectArray30 != null) {
									@Pc(812) Class4_Sub13 local812 = new Class4_Sub13();
									local812.aBoolean172 = true;
									local812.source = local9;
									local812.mouseX = Mouse.x - local50;
									local812.mouseY = Mouse.y - local55;
									local812.arguments = local9.anObjectArray30;
									Static2.aClass112_10.addTail(local812);
								}
							}
							if (local214 && local9.anObjectArray8 != null) {
								@Pc(845) Class4_Sub13 local845 = new Class4_Sub13();
								local845.aBoolean172 = true;
								local845.source = local9;
								local845.mouseX = Mouse.x - local50;
								local845.mouseY = Mouse.y - local55;
								local845.arguments = local9.anObjectArray8;
								Static3.aClass112_14.addTail(local845);
							}
							if (!local9.aBoolean414 && local209) {
								local9.aBoolean414 = true;
								if (local9.anObjectArray26 != null) {
									@Pc(884) Class4_Sub13 local884 = new Class4_Sub13();
									local884.aBoolean172 = true;
									local884.source = local9;
									local884.mouseX = Mouse.x - local50;
									local884.mouseY = Mouse.y - local55;
									local884.arguments = local9.anObjectArray26;
									Static3.aClass112_14.addTail(local884);
								}
							}
							if (local9.aBoolean414 && local209 && local9.anObjectArray9 != null) {
								@Pc(920) Class4_Sub13 local920 = new Class4_Sub13();
								local920.aBoolean172 = true;
								local920.source = local9;
								local920.mouseX = Mouse.x - local50;
								local920.mouseY = Mouse.y - local55;
								local920.arguments = local9.anObjectArray9;
								Static3.aClass112_14.addTail(local920);
							}
							if (local9.aBoolean414 && !local209) {
								local9.aBoolean414 = false;
								if (local9.anObjectArray28 != null) {
									@Pc(959) Class4_Sub13 local959 = new Class4_Sub13();
									local959.aBoolean172 = true;
									local959.source = local9;
									local959.mouseX = Mouse.x - local50;
									local959.mouseY = Mouse.y - local55;
									local959.arguments = local9.anObjectArray28;
									Static2.aClass112_10.addTail(local959);
								}
							}
							if (local9.anObjectArray16 != null) {
								@Pc(990) Class4_Sub13 local990 = new Class4_Sub13();
								local990.source = local9;
								local990.arguments = local9.anObjectArray16;
								Static2.aClass112_6.addTail(local990);
							}
							if (local9.anObjectArray27 != null && Static5.anInt4197 > local9.anInt5940) {
								if (local9.anIntArray673 == null || Static5.anInt4197 - local9.anInt5940 > 32) {
									@Pc(1021) Class4_Sub13 local1021 = new Class4_Sub13();
									local1021.source = local9;
									local1021.arguments = local9.anObjectArray27;
									Static3.aClass112_14.addTail(local1021);
								} else {
									label598:
									for (@Pc(1036) int local1036 = local9.anInt5940; local1036 < Static5.anInt4197; local1036++) {
										@Pc(1045) int local1045 = Static3.anIntArray218[local1036 & 0x1F];
										for (@Pc(1047) int local1047 = 0; local1047 < local9.anIntArray673.length; local1047++) {
											if (local9.anIntArray673[local1047] == local1045) {
												@Pc(1062) Class4_Sub13 local1062 = new Class4_Sub13();
												local1062.source = local9;
												local1062.arguments = local9.anObjectArray27;
												Static3.aClass112_14.addTail(local1062);
												break label598;
											}
										}
									}
								}
								local9.anInt5940 = Static5.anInt4197;
							}
							if (local9.anObjectArray21 != null && Static4.anInt3327 > local9.anInt5952) {
								if (local9.anIntArray665 == null || Static4.anInt3327 - local9.anInt5952 > 32) {
									@Pc(1101) Class4_Sub13 local1101 = new Class4_Sub13();
									local1101.source = local9;
									local1101.arguments = local9.anObjectArray21;
									Static3.aClass112_14.addTail(local1101);
								} else {
									label574:
									for (@Pc(1116) int local1116 = local9.anInt5952; local1116 < Static4.anInt3327; local1116++) {
										@Pc(1125) int local1125 = Static3.anIntArray219[local1116 & 0x1F];
										for (@Pc(1127) int local1127 = 0; local1127 < local9.anIntArray665.length; local1127++) {
											if (local9.anIntArray665[local1127] == local1125) {
												@Pc(1142) Class4_Sub13 local1142 = new Class4_Sub13();
												local1142.source = local9;
												local1142.arguments = local9.anObjectArray21;
												Static3.aClass112_14.addTail(local1142);
												break label574;
											}
										}
									}
								}
								local9.anInt5952 = Static4.anInt3327;
							}
							if (local9.anObjectArray24 != null && Static1.anInt788 > local9.anInt5936) {
								if (local9.anIntArray669 == null || Static1.anInt788 - local9.anInt5936 > 32) {
									@Pc(1181) Class4_Sub13 local1181 = new Class4_Sub13();
									local1181.source = local9;
									local1181.arguments = local9.anObjectArray24;
									Static3.aClass112_14.addTail(local1181);
								} else {
									label550:
									for (@Pc(1196) int local1196 = local9.anInt5936; local1196 < Static1.anInt788; local1196++) {
										@Pc(1205) int local1205 = Static3.anIntArray225[local1196 & 0x1F];
										for (@Pc(1207) int local1207 = 0; local1207 < local9.anIntArray669.length; local1207++) {
											if (local9.anIntArray669[local1207] == local1205) {
												@Pc(1222) Class4_Sub13 local1222 = new Class4_Sub13();
												local1222.source = local9;
												local1222.arguments = local9.anObjectArray24;
												Static3.aClass112_14.addTail(local1222);
												break label550;
											}
										}
									}
								}
								local9.anInt5936 = Static1.anInt788;
							}
							if (local9.anObjectArray3 != null && Static2.anInt959 > local9.anInt5941) {
								if (local9.anIntArray670 == null || Static2.anInt959 - local9.anInt5941 > 32) {
									@Pc(1261) Class4_Sub13 local1261 = new Class4_Sub13();
									local1261.source = local9;
									local1261.arguments = local9.anObjectArray3;
									Static3.aClass112_14.addTail(local1261);
								} else {
									label526:
									for (@Pc(1276) int local1276 = local9.anInt5941; local1276 < Static2.anInt959; local1276++) {
										@Pc(1285) int local1285 = Static7.anIntArray656[local1276 & 0x1F];
										for (@Pc(1287) int local1287 = 0; local1287 < local9.anIntArray670.length; local1287++) {
											if (local9.anIntArray670[local1287] == local1285) {
												@Pc(1302) Class4_Sub13 local1302 = new Class4_Sub13();
												local1302.source = local9;
												local1302.arguments = local9.anObjectArray3;
												Static3.aClass112_14.addTail(local1302);
												break label526;
											}
										}
									}
								}
								local9.anInt5941 = Static2.anInt959;
							}
							if (local9.anObjectArray25 != null && Static5.anInt4210 > local9.anInt5942) {
								if (local9.anIntArray667 == null || Static5.anInt4210 - local9.anInt5942 > 32) {
									@Pc(1341) Class4_Sub13 local1341 = new Class4_Sub13();
									local1341.source = local9;
									local1341.arguments = local9.anObjectArray25;
									Static3.aClass112_14.addTail(local1341);
								} else {
									label502:
									for (@Pc(1356) int local1356 = local9.anInt5942; local1356 < Static5.anInt4210; local1356++) {
										@Pc(1365) int local1365 = Static4.anIntArray336[local1356 & 0x1F];
										for (@Pc(1367) int local1367 = 0; local1367 < local9.anIntArray667.length; local1367++) {
											if (local9.anIntArray667[local1367] == local1365) {
												@Pc(1382) Class4_Sub13 local1382 = new Class4_Sub13();
												local1382.source = local9;
												local1382.arguments = local9.anObjectArray25;
												Static3.aClass112_14.addTail(local1382);
												break label502;
											}
										}
									}
								}
								local9.anInt5942 = Static5.anInt4210;
							}
							if (Static6.anInt5189 > local9.anInt5945 && local9.anObjectArray6 != null) {
								@Pc(1412) Class4_Sub13 local1412 = new Class4_Sub13();
								local1412.source = local9;
								local1412.arguments = local9.anObjectArray6;
								Static3.aClass112_14.addTail(local1412);
							}
							if (Static3.anInt2102 > local9.anInt5945 && local9.anObjectArray12 != null) {
								@Pc(1434) Class4_Sub13 local1434 = new Class4_Sub13();
								local1434.source = local9;
								local1434.arguments = local9.anObjectArray12;
								Static3.aClass112_14.addTail(local1434);
							}
							if (Static3.anInt2616 > local9.anInt5945 && local9.anObjectArray23 != null) {
								@Pc(1456) Class4_Sub13 local1456 = new Class4_Sub13();
								local1456.source = local9;
								local1456.arguments = local9.anObjectArray23;
								Static3.aClass112_14.addTail(local1456);
							}
							if (Static6.anInt4996 > local9.anInt5945 && local9.anObjectArray14 != null) {
								@Pc(1478) Class4_Sub13 local1478 = new Class4_Sub13();
								local1478.source = local9;
								local1478.arguments = local9.anObjectArray14;
								Static3.aClass112_14.addTail(local1478);
							}
							if (Static1.anInt925 > local9.anInt5945 && local9.anObjectArray31 != null) {
								@Pc(1500) Class4_Sub13 local1500 = new Class4_Sub13();
								local1500.source = local9;
								local1500.arguments = local9.anObjectArray31;
								Static3.aClass112_14.addTail(local1500);
							}
							local9.anInt5945 = Static6.anInt4979;
							if (local9.anObjectArray10 != null) {
								for (@Pc(1519) int local1519 = 0; local1519 < Static6.anInt5088; local1519++) {
									@Pc(1526) Class4_Sub13 local1526 = new Class4_Sub13();
									local1526.source = local9;
									local1526.keyCode = Static5.anIntArray441[local1519];
									local1526.keyChar = Static5.anIntArray419[local1519];
									local1526.arguments = local9.anObjectArray10;
									Static3.aClass112_14.addTail(local1526);
								}
							}
							if (Static1.aBoolean35 && local9.anObjectArray5 != null) {
								@Pc(1558) Class4_Sub13 local1558 = new Class4_Sub13();
								local1558.source = local9;
								local1558.arguments = local9.anObjectArray5;
								Static3.aClass112_14.addTail(local1558);
							}
						}
					}
					if (!local9.if3 && Static1.aClass185_1 == null && Static5.aClass185_10 == null && !Static1.aBoolean17) {
						if ((local9.anInt5923 >= 0 || local9.anInt5966 != 0) && Mouse.x >= local61 && Mouse.y >= local63 && Mouse.x < local65 && Mouse.y < local67) {
							if (local9.anInt5923 >= 0) {
								Static5.aClass185_11 = arg0[local9.anInt5923];
							} else {
								Static5.aClass185_11 = local9;
							}
						}
						if (local9.type == 8 && Mouse.x >= local61 && Mouse.y >= local63 && Mouse.x < local65 && Mouse.y < local67) {
							Static2.aClass185_4 = local9;
						}
						if (local9.anInt5887 > local9.anInt5949) {
							Static18.method1742(local9, Mouse.y, local50 + local9.anInt5893, Mouse.x, local9.anInt5887, local55, local9.anInt5949);
						}
					}
					if (local9.type == 0) {
						method693(arg0, local9.id, local61, local63, local65, local67, local50 - local9.anInt5932, local55 - local9.anInt5931);
						if (local9.aClass185Array4 != null) {
							method693(local9.aClass185Array4, local9.id, local61, local63, local65, local67, local50 - local9.anInt5932, local55 - local9.anInt5931);
						}
						@Pc(1691) Class4_Sub27 local1691 = (Class4_Sub27) Static4.aClass84_13.get((long) local9.id);
						if (local1691 != null) {
							Static14.method1060(local1691.anInt4620, local65, local50, local63, local55, local61, local67);
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
		Static32.method3954(local51, Static11.method522(PlayerList.self.z, PlayerList.self.x, Static7.y) - 50, local12, local12 * 3 + 600, Static3.anInt2496, arg0, Static7.anInt5412);
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

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Lclient!g;")
	public static Class4_Sub3_Sub9 method2322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class4_Sub3_Sub9 local16 = (Class4_Sub3_Sub9) Static3.aClass84_8.get((long) arg0 << 32 | (long) arg1);
		if (local16 == null) {
			local16 = new Class4_Sub3_Sub9(arg0, arg1);
			Static3.aClass84_8.put(local16.key, local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void method714(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static31.method3652(arg1, arg1.length - 1, arg0, 0);
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
		Static6.aClass112_28 = new LinkedList();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	public static void method722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub3_Sub9 local8 = method2322(12, arg0);
		local8.method1520();
		local8.anInt1993 = arg1;
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

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIII)V")
	public static void method726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub3_Sub9 local12 = method2322(11, arg0);
		local12.method1520();
		local12.anInt1993 = arg1;
		local12.anInt2001 = arg2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIILclient!gn;I)V")
	public static void method731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub11 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt2115 == -1 && arg3.anIntArray172 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(23) int local23 = arg3.anInt2127 * Preferences.areaSoundsVolume >> 8;
		if (arg1 > arg3.anInt2117) {
			local16 = arg1 - arg3.anInt2117;
		} else if (arg3.anInt2124 > arg1) {
			local16 = arg3.anInt2124 - arg1;
		}
		if (arg4 > arg3.anInt2112) {
			local16 += arg4 - arg3.anInt2112;
		} else if (arg3.anInt2113 > arg4) {
			local16 += arg3.anInt2113 - arg4;
		}
		if (arg3.anInt2123 == 0 || arg3.anInt2123 < local16 - 64 || Preferences.areaSoundsVolume == 0 || arg3.anInt2126 != arg0) {
			if (arg3.aClass4_Sub6_Sub4_3 != null) {
				Static5.aClass4_Sub6_Sub3_2.method2670(arg3.aClass4_Sub6_Sub4_3);
				arg3.aClass4_Sub6_Sub4_3 = null;
			}
			if (arg3.aClass4_Sub6_Sub4_2 != null) {
				Static5.aClass4_Sub6_Sub3_2.method2670(arg3.aClass4_Sub6_Sub4_2);
				arg3.aClass4_Sub6_Sub4_2 = null;
			}
			return;
		}
		@Pc(145) int local145 = local16 - 64;
		if (local145 < 0) {
			local145 = 0;
		}
		@Pc(164) int local164 = (arg3.anInt2123 - local145) * local23 / arg3.anInt2123;
		if (arg3.aClass4_Sub6_Sub4_3 != null) {
			arg3.aClass4_Sub6_Sub4_3.method3377(local164);
		} else if (arg3.anInt2115 >= 0) {
			@Pc(186) Class7 local186 = Static8.method106(client.js5Archive4, arg3.anInt2115, 0);
			if (local186 != null) {
				@Pc(195) Class4_Sub8_Sub1 local195 = local186.method107().method3338(Static7.aClass170_1);
				@Pc(200) Class4_Sub6_Sub4 local200 = Static28.method3385(local195, local164);
				local200.method3359(-1);
				Static5.aClass4_Sub6_Sub3_2.method2674(local200);
				arg3.aClass4_Sub6_Sub4_3 = local200;
			}
		}
		if (arg3.aClass4_Sub6_Sub4_2 != null) {
			arg3.aClass4_Sub6_Sub4_2.method3377(local164);
			if (!arg3.aClass4_Sub6_Sub4_2.isLinked()) {
				arg3.aClass4_Sub6_Sub4_2 = null;
			}
		} else if (arg3.anIntArray172 != null && (arg3.anInt2125 -= arg2) <= 0) {
			@Pc(234) int local234 = (int) ((double) arg3.anIntArray172.length * Math.random());
			@Pc(242) Class7 local242 = Static8.method106(client.js5Archive4, arg3.anIntArray172[local234], 0);
			if (local242 != null) {
				@Pc(249) Class4_Sub8_Sub1 local249 = local242.method107().method3338(Static7.aClass170_1);
				@Pc(254) Class4_Sub6_Sub4 local254 = Static28.method3385(local249, local164);
				local254.method3359(0);
				Static5.aClass4_Sub6_Sub3_2.method2674(local254);
				arg3.anInt2125 = (int) (Math.random() * (double) (arg3.anInt2116 - arg3.anInt2119)) + arg3.anInt2119;
				arg3.aClass4_Sub6_Sub4_2 = local254;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)I")
	public static int method735(@OriginalArg(1) boolean arg0) {
		@Pc(13) long local13 = MonotonicClock.currentTimeMillis();
		for (@Pc(27) Class4_Sub5 local27 = arg0 ? (Class4_Sub5) Static7.aClass84_25.head() : (Class4_Sub5) Static7.aClass84_25.next(); local27 != null; local27 = (Class4_Sub5) Static7.aClass84_25.next()) {
			if (local13 > (local27.aLong17 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local27.aLong17 & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local27.key;
					Static1.anIntArray2[local55] = Static1.anIntArray62[local55];
					local27.unlink();
					return local55;
				}
				local27.unlink();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIII)V")
	public static void method736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 1 || arg2 < 1 || arg5 > 102 || arg2 > 102) {
			return;
		}
		if (!Terrain.isAllLevelsVisible() && (Static4.tileFlags[0][arg5][arg2] & 0x2) == 0) {
			@Pc(39) int local39 = arg0;
			if ((Static4.tileFlags[arg0][arg5][arg2] & 0x8) != 0) {
				local39 = 0;
			}
			if (local39 != Static2.anInt1216) {
				return;
			}
		}
		@Pc(64) int local64 = arg0;
		if (arg0 < 3 && (Static4.tileFlags[1][arg5][arg2] & 0x2) == 2) {
			local64 = arg0 + 1;
		}
		Static21.method2018(arg0, local64, arg2, PathFinder.collisionMaps[arg0], arg3, arg5);
		if (arg4 >= 0) {
			@Pc(97) boolean local97 = Preferences.groundDecoration;
			Preferences.groundDecoration = true;
			Static22.method2193(arg1, arg0, arg4, local64, arg5, false, arg2, PathFinder.collisionMaps[arg0], false, arg6);
			Preferences.groundDecoration = local97;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!f;)V")
	public static void method739(@OriginalArg(1) Player arg0) {
		@Pc(19) Class4_Sub11 local19 = (Class4_Sub11) Static5.aClass84_18.get(Base37.encode(arg0.name));
		if (local19 == null) {
			return;
		}
		if (local19.aClass4_Sub6_Sub4_3 != null) {
			Static5.aClass4_Sub6_Sub3_2.method2670(local19.aClass4_Sub6_Sub4_3);
			local19.aClass4_Sub6_Sub4_3 = null;
		}
		local19.unlink();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method742(@OriginalArg(0) long arg0) {
		Static4.aCalendar1.setTime(new Date(arg0));
		@Pc(9) int local9 = Static4.aCalendar1.get(7);
		@Pc(17) int local17 = Static4.aCalendar1.get(5);
		@Pc(21) int local21 = Static4.aCalendar1.get(2);
		@Pc(25) int local25 = Static4.aCalendar1.get(1);
		@Pc(29) int local29 = Static4.aCalendar1.get(11);
		@Pc(33) int local33 = Static4.aCalendar1.get(12);
		@Pc(37) int local37 = Static4.aCalendar1.get(13);
		return Static3.aStringArray37[local9 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static6.aStringArray28[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!eg;IIILclient!vg;IIIZIII)Lclient!vg;")
	public static Model method745(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Model arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
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
			@Pc(107) Class53_Sub3 local107 = new Class53_Sub3(local41 * 3 + 1, local41 * 2 * 3 - local41, 0);
			@Pc(113) int local113 = local107.method2763(0, 0);
			for (@Pc(115) int local115 = 0; local115 < 3; local115++) {
				@Pc(126) int local126 = local83[local115];
				@Pc(130) int local130 = local83[local115];
				for (@Pc(132) int local132 = 0; local132 < local41; local132++) {
					@Pc(145) int local145 = (local132 << 11) / local41;
					@Pc(155) int local155 = MathUtils.SINE[local145] * local126 + arg12 >> 16;
					@Pc(165) int local165 = MathUtils.COSINE[local145] * local130 + arg8 >> 16;
					local89[local115][local132] = local107.method2763(local155, local165);
				}
			}
			for (@Pc(183) int local183 = 0; local183 < 3; local183++) {
				@Pc(198) int local198 = (local183 * 256 + 128) / 3;
				@Pc(203) int local203 = 256 - local198;
				@Pc(214) byte local214 = (byte) (local198 * arg4 + local203 * arg11 >> 8);
				@Pc(259) short local259 = (short) ((local198 * (arg0 & 0xFC00) + local203 * (arg10 & 0xFC00) & 0xFC0000) + ((arg0 & 0x380) * local198 + local203 * (arg10 & 0x380) & 0x38000) + ((arg10 & 0x7F) * local203 + local198 * (arg0 & 0x7F) & 0x7F00) >> 8);
				for (@Pc(261) int local261 = 0; local261 < local41; local261++) {
					if (local183 == 0) {
						local107.method2756(local113, local89[0][(local261 + 1) % local41], local89[0][local261], local259, local214);
					} else {
						local107.method2756(local89[local183 - 1][local261], local89[local183 - 1][(local261 + 1) % local41], local89[local183][(local261 + 1) % local41], local259, local214);
						local107.method2756(local89[local183 - 1][local261], local89[local183][(local261 + 1) % local41], local89[local183][local261], local259, local214);
					}
				}
			}
			local33 = local107.method2761(64, 768, -50, -10, -50);
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
		@Pc(432) int local432 = arg5.method3829();
		@Pc(435) int local435 = arg5.method3838();
		@Pc(438) int local438 = arg5.method3818();
		if (local387 < local435) {
			local435 = local387;
		}
		if (local390 > local438) {
			local438 = local390;
		}
		@Pc(457) int local457 = arg5.method3841();
		if (local432 < local380) {
			local432 = local380;
		}
		if (local457 > local392) {
			local457 = local392;
		}
		@Pc(475) Class4_Sub3_Sub19 local475 = null;
		if (arg1 != null) {
			arg6 = arg1.anIntArray95[arg6];
			local475 = Static32.method3984(arg6 >> 16);
			arg6 &= 65535;
		}
		@Pc(500) Model local500;
		if (local475 == null) {
			local500 = local33.method3836(true, true, true);
			local500.method3824((local435 - local432) / 2, 128, (local457 - local438) / 2);
			local500.method3823((local432 + local435) / 2, 0, (local438 + local457) / 2);
		} else {
			local500 = local33.method3836(!local475.method4150(arg6), !local475.method4151(arg6), true);
			local500.method3824((local435 - local432) / 2, 128, (local457 - local438) / 2);
			local500.method3823((local435 + local432) / 2, 0, (local438 + local457) / 2);
			local500.method3844(local475, arg6);
		}
		if (arg2 != 0) {
			local500.method3815(arg2);
		}
		if (GlRenderer.enabled) {
			@Pc(591) GlModel local591 = (GlModel) local500;
			if (arg7 != Static11.method522(local438 + arg8, arg12 + local432, Static7.y) || Static11.method522(local457 + arg8, local435 + arg12, Static7.y) != arg7) {
				for (@Pc(615) int local615 = 0; local615 < local591.anInt4689; local615++) {
					@Pc(621) int[] local621 = local591.anIntArray504;
					local621[local615] += Static11.method522(arg8 + local591.anIntArray502[local615], arg12 + local591.anIntArray507[local615], Static7.y) - arg7;
				}
				local591.aClass57_1.aBoolean103 = false;
				local591.aClass15_1.aBoolean15 = false;
			}
		} else {
			@Pc(660) SoftwareModel local660 = (SoftwareModel) local500;
			if (arg7 != Static11.method522(local438 + arg8, local432 + arg12, Static7.y) || arg7 != Static11.method522(local457 + arg8, arg12 + local435, Static7.y)) {
				for (@Pc(690) int local690 = 0; local690 < local660.anInt3440; local690++) {
					@Pc(700) int[] local700 = local660.anIntArray344;
					local700[local690] += Static11.method522(local660.anIntArray340[local690] + arg8, local660.anIntArray347[local690] + arg12, Static7.y) - arg7;
				}
				local660.aBoolean244 = false;
			}
		}
		return local500;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BZ)V")
	public static void method777(@OriginalArg(1) boolean arg0) {
		Static21.method2050(arg0, GameShell.canvasWidth, Static3.anInt5398, GameShell.canvasHeight);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method778() {
		for (@Pc(11) int local11 = 0; local11 < VarpTypeList.capacity; local11++) {
			@Pc(18) VarpType local18 = VarpTypeList.get(local11);
			if (local18 != null && local18.clientCode == 0) {
				Static1.anIntArray62[local11] = 0;
				Static1.anIntArray2[local11] = 0;
			}
		}
		Static7.aClass84_25 = new HashTable(16);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public static void method779(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub3_Sub9 local10 = method2322(4, arg0);
		local10.method1519();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!wf;)Ljava/lang/String;")
	public static String method780(@OriginalArg(1) Component arg0) {
		if (method687(arg0).method3273() == 0) {
			return null;
		} else if (arg0.aString355 == null || arg0.aString355.trim().length() == 0) {
			return Static1.aBoolean26 ? "Hidden-use" : null;
		} else {
			return arg0.aString355;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "()V")
	public static void method870() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		for (@Pc(12) Class4_Sub4 local12 = (Class4_Sub4) Static2.aClass112_5.head(); local12 != null; local12 = (Class4_Sub4) Static2.aClass112_5.next()) {
			@Pc(17) int local17 = local12.method754();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method764();
			local7 |= local12.method767();
			local3 += local12.method753();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static6.anInt5141 : Static6.anInt5140;
		} else if (local1 == 1) {
			local55 = local5 ? Static6.anInt5139 : Static6.anInt5138;
		} else {
			local55 = local5 ? Static6.anInt5136 : Static6.anInt5135;
		}
		if (local55 != Static2.anInt1031) {
			Static2.anInt1031 = local55;
			Static2.aBoolean60 = true;
		}
		@Pc(86) int local86 = Static2.anInt1030 > 2 ? 2 : Static2.anInt1030;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local86 != local93) {
			Static2.aBoolean60 = true;
			Static2.aBoolean62 = true;
		}
		if (local7 != Static2.aBoolean61) {
			Static2.aBoolean59 = local7;
			Static2.aBoolean57 = true;
		}
		Static2.anInt1030 = local3;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "()Z")
	public static boolean method871() {
		if (Static13.method881()) {
			return true;
		} else if (!Static13.method877()) {
			return false;
		} else if (Static13.method875(Static2.aClass4_Sub4_Sub1_1)) {
			return true;
		} else {
			method873();
			return false;
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "()V")
	public static void method872() {
		if (!GlRenderer.arbFboSupported || !GlRenderer.arbTextureRectangleSupported) {
			return;
		}
		@Pc(5) GL local5 = GlRenderer.gl;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(GL.GL_MAX_COLOR_ATTACHMENTS, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, Static2.anIntArray83, 0);
			Static2.anInt1028 = Static9.method210();
		}
		for (@Pc(29) Node local29 = Static2.aClass112_5.head(); local29 != null; local29 = Static2.aClass112_5.next()) {
			@Pc(34) Class4_Sub4 local34 = (Class4_Sub4) local29;
			if (!local34.method762()) {
				local34.unlink();
			}
		}
		if (Static2.aClass4_Sub4_Sub1_1 == null) {
			Static2.aClass4_Sub4_Sub1_1 = new Class4_Sub4_Sub1();
		}
		if (!Static2.aClass4_Sub4_Sub1_1.method766() && !Static2.aClass4_Sub4_Sub1_1.method762()) {
			Static2.aClass4_Sub4_Sub1_1.method760();
		}
		method870();
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "()V")
	public static void method873() {
		if (Static2.aClass4_Sub4_Sub1_1.method755()) {
			Static13.method876(Static2.aClass4_Sub4_Sub1_1);
		}
	}
}

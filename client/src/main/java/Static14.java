import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
	public static void method1047() {
		Static28.method3270(Static1.aClass185_1);
		Static3.anInt2165++;
		if (Static6.aBoolean310 && Static4.aBoolean232) {
			@Pc(27) int local27 = Mouse.x;
			@Pc(31) int local31 = local27 - Static5.anInt5204;
			if (local31 < Static2.anInt1633) {
				local31 = Static2.anInt1633;
			}
			if (Static1.aClass185_1.width + local31 > Static1.aClass185_2.width + Static2.anInt1633) {
				local31 = Static1.aClass185_2.width + Static2.anInt1633 - Static1.aClass185_1.width;
			}
			@Pc(61) int local61 = Mouse.y;
			@Pc(65) int local65 = local61 - Static1.anInt777;
			if (Static6.anInt5182 > local65) {
				local65 = Static6.anInt5182;
			}
			@Pc(75) int local75 = local31 - Static4.anInt3183;
			if (Static1.aClass185_1.height + local65 > Static6.anInt5182 + Static1.aClass185_2.height) {
				local65 = Static6.anInt5182 + Static1.aClass185_2.height - Static1.aClass185_1.height;
			}
			@Pc(103) int local103 = local65 - Static1.anInt134;
			@Pc(106) int local106 = Static1.aClass185_1.dragDeadZone;
			if (Static3.anInt2165 > Static1.aClass185_1.dragDeadTime && (local75 > local106 || local75 < -local106 || local103 > local106 || local103 < -local106)) {
				Static3.aBoolean173 = true;
			}
			@Pc(150) int local150 = Static1.aClass185_2.scrollX + local31 - Static2.anInt1633;
			@Pc(159) int local159 = local65 + Static1.aClass185_2.scrollY - Static6.anInt5182;
			if (Static1.aClass185_1.onDrag != null && Static3.aBoolean173) {
				@Pc(169) HookRequest local169 = new HookRequest();
				local169.mouseY = local159;
				local169.source = Static1.aClass185_1;
				local169.mouseX = local150;
				local169.arguments = Static1.aClass185_1.onDrag;
				ScriptRunner.method2019(local169);
			}
			if (Mouse.pressedButton == 0) {
				if (Static3.aBoolean173) {
					if (Static1.aClass185_1.onDragComplete != null) {
						@Pc(231) HookRequest local231 = new HookRequest();
						local231.target = Static7.aClass185_16;
						local231.source = Static1.aClass185_1;
						local231.mouseX = local150;
						local231.mouseY = local159;
						local231.arguments = Static1.aClass185_1.onDragComplete;
						ScriptRunner.method2019(local231);
					}
					if (Static7.aClass185_16 != null && InterfaceList.method691(Static1.aClass185_1) != null) {
						Protocol.outboundBuffer.writeOpcode(0);
						Protocol.outboundBuffer.writeIntLE2(Static1.aClass185_1.id);
						Protocol.outboundBuffer.writeIntAlt3(Static7.aClass185_16.id);
						Protocol.outboundBuffer.writeShortA(Static7.aClass185_16.createdComponentId);
						Protocol.outboundBuffer.writeShortLEA(Static1.aClass185_1.createdComponentId);
					}
				} else if ((Static3.anInt5400 == 1 || MiniMenu.method1005(MiniMenu.size - 1)) && MiniMenu.size > 2) {
					Static31.method3783();
				} else if (MiniMenu.size > 0) {
					Static37.method4784();
				}
				Static1.aClass185_1 = null;
			}
		} else if (Static3.anInt2165 > 1) {
			Static1.aClass185_1 = null;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (InterfaceList.load(arg0)) {
			Static12.method693(InterfaceList.components[arg0], -1, arg5, arg3, arg1, arg6, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	public static void readNpcSpawns() {
		@Pc(14) int len = Static7.npcBytes.length;
		for (@Pc(16) int i = 0; i < len; i++) {
			if (Static7.npcBytes[i] != null) {
				@Pc(32) int local32 = -1;
				for (@Pc(34) int j = 0; j < Static6.anInt4744; j++) {
					if (Static2.anIntArray127[j] == Static7.mapSquares[i]) {
						local32 = j;
						break;
					}
				}
				if (local32 == -1) {
					Static2.anIntArray127[Static6.anInt4744] = Static7.mapSquares[i];
					local32 = Static6.anInt4744++;
				}
				@Pc(82) Buffer buffer = new Buffer(Static7.npcBytes[i]);
				@Pc(84) int local84 = 0;
				while (Static7.npcBytes[i].length > buffer.position && local84 < 511 && NpcList.size < 1023) {
					@Pc(112) int id = local84++ << 6 | local32;
					@Pc(116) int position = buffer.readUnsignedShort();
					@Pc(120) int level = position >> 14;
					@Pc(126) int localX = position >> 7 & 0x3F;
					@Pc(139) int x = (Static7.mapSquares[i] >> 8) * 64 + localX - Static5.originX;
					@Pc(143) int localZ = position & 0x3F;
					@Pc(155) int z = localZ + (Static7.mapSquares[i] & 0xFF) * 64 - Static7.originZ;
					@Pc(161) NpcType type = NpcTypeList.get(buffer.readUnsignedShort());
					if (NpcList.npcs[id] == null && (type.movementFlags & 0x1) > 0 && Static2.visibleLevel == level && x >= 0 && type.size + x < 104 && z >= 0 && z + type.size < 104) {
						NpcList.npcs[id] = new Npc();
						@Pc(217) Npc npc = NpcList.npcs[id];
						NpcList.ids[NpcList.size++] = id;
						npc.lastSeenLoop = client.loop;
						npc.setType(type);
						npc.setSize(npc.type.size);
						npc.targetAngle = npc.angle = PathingEntity.ANGLES[npc.type.spawnDirection];
						npc.turnSpeed = npc.type.turnSpeed;
						if (npc.turnSpeed == 0) {
							npc.angle = 0;
						}
						npc.basId = npc.type.basId;
						npc.teleport(x, z, true, npc.getSize());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method1069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (InterfaceList.load(arg0)) {
			Static30.method3554(arg3, -1, arg7, InterfaceList.components[arg0], arg4, arg6, arg1, arg2, arg5);
		} else if (arg7 == -1) {
			for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
				Static2.aBooleanArray8[local25] = true;
			}
		} else {
			Static2.aBooleanArray8[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(I)Z")
	public static boolean isHidingVideoAd() {
		if (client.javaScript) {
			try {
				return !((Boolean) BrowserControl.call(GameShell.signLink.applet, "showingVideoAd"));
			} catch (@Pc(23) Throwable ex) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
	public static void method1082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static32.method3885(arg0);
		@Pc(9) int local9 = arg0 - arg1;
		@Pc(15) int local15 = arg0;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = -arg0;
		if (local9 < 0) {
			local9 = 0;
		}
		@Pc(29) int local29 = local9;
		if (Static4.anInt3086 <= arg5 && arg5 <= Static5.anInt4230) {
			@Pc(40) int[] local40 = Static5.anIntArrayArray36[arg5];
			@Pc(48) int local48 = IntUtils.clamp(arg2 - arg0, Static2.anInt902, Static3.anInt2553);
			@Pc(56) int local56 = IntUtils.clamp(arg0 + arg2, Static2.anInt902, Static3.anInt2553);
			@Pc(67) int local67 = IntUtils.clamp(arg2 - local9, Static2.anInt902, Static3.anInt2553);
			@Pc(77) int local77 = IntUtils.clamp(arg2 + local9, Static2.anInt902, Static3.anInt2553);
			ArrayUtils.fillRange(local40, local48, local67, arg3);
			ArrayUtils.fillRange(local40, local67, local77, arg4);
			ArrayUtils.fillRange(local40, local77, local56, arg3);
		}
		@Pc(98) int local98 = -local9;
		@Pc(100) int local100 = -1;
		@Pc(102) int local102 = -1;
		while (local17 < local15) {
			local100 += 2;
			local98 += local100;
			local102 += 2;
			if (local98 >= 0 && local29 >= 1) {
				local29--;
				local98 -= local29 << 1;
				Static7.anIntArray678[local29] = local17;
			}
			local17++;
			local20 += local102;
			if (local20 >= 0) {
				local15--;
				local20 -= local15 << 1;
				@Pc(154) int local154 = arg5 - local15;
				@Pc(159) int local159 = arg5 + local15;
				if (Static4.anInt3086 <= local159 && local154 <= Static5.anInt4230) {
					if (local15 >= local9) {
						@Pc(186) int local186 = IntUtils.clamp(arg2 + local17, Static2.anInt902, Static3.anInt2553);
						@Pc(194) int local194 = IntUtils.clamp(arg2 - local17, Static2.anInt902, Static3.anInt2553);
						if (Static5.anInt4230 >= local159) {
							ArrayUtils.fillRange(Static5.anIntArrayArray36[local159], local194, local186, arg3);
						}
						if (local154 >= Static4.anInt3086) {
							ArrayUtils.fillRange(Static5.anIntArrayArray36[local154], local194, local186, arg3);
						}
					} else {
						@Pc(226) int local226 = Static7.anIntArray678[local15];
						@Pc(237) int local237 = IntUtils.clamp(arg2 + local17, Static2.anInt902, Static3.anInt2553);
						@Pc(245) int local245 = IntUtils.clamp(arg2 - local17, Static2.anInt902, Static3.anInt2553);
						@Pc(254) int local254 = IntUtils.clamp(arg2 + local226, Static2.anInt902, Static3.anInt2553);
						@Pc(262) int local262 = IntUtils.clamp(arg2 - local226, Static2.anInt902, Static3.anInt2553);
						if (Static5.anInt4230 >= local159) {
							@Pc(274) int[] local274 = Static5.anIntArrayArray36[local159];
							ArrayUtils.fillRange(local274, local245, local262, arg3);
							ArrayUtils.fillRange(local274, local262, local254, arg4);
							ArrayUtils.fillRange(local274, local254, local237, arg3);
						}
						if (Static4.anInt3086 <= local154) {
							@Pc(300) int[] local300 = Static5.anIntArrayArray36[local154];
							ArrayUtils.fillRange(local300, local245, local262, arg3);
							ArrayUtils.fillRange(local300, local262, local254, arg4);
							ArrayUtils.fillRange(local300, local254, local237, arg3);
						}
					}
				}
			}
			@Pc(322) int local322 = arg5 + local17;
			@Pc(327) int local327 = arg5 - local17;
			if (Static4.anInt3086 <= local322 && Static5.anInt4230 >= local327) {
				@Pc(337) int local337 = local15 + arg2;
				@Pc(342) int local342 = arg2 - local15;
				if (local337 >= Static2.anInt902 && Static3.anInt2553 >= local342) {
					@Pc(359) int local359 = IntUtils.clamp(local337, Static2.anInt902, Static3.anInt2553);
					@Pc(365) int local365 = IntUtils.clamp(local342, Static2.anInt902, Static3.anInt2553);
					if (local17 >= local9) {
						if (Static5.anInt4230 >= local322) {
							ArrayUtils.fillRange(Static5.anIntArrayArray36[local322], local365, local359, arg3);
						}
						if (Static4.anInt3086 <= local327) {
							ArrayUtils.fillRange(Static5.anIntArrayArray36[local327], local365, local359, arg3);
						}
					} else {
						@Pc(415) int local415 = local29 >= local17 ? local29 : Static7.anIntArray678[local17];
						@Pc(424) int local424 = IntUtils.clamp(arg2 + local415, Static2.anInt902, Static3.anInt2553);
						@Pc(432) int local432 = IntUtils.clamp(arg2 - local415, Static2.anInt902, Static3.anInt2553);
						if (Static5.anInt4230 >= local322) {
							@Pc(440) int[] local440 = Static5.anIntArrayArray36[local322];
							ArrayUtils.fillRange(local440, local365, local432, arg3);
							ArrayUtils.fillRange(local440, local432, local424, arg4);
							ArrayUtils.fillRange(local440, local424, local359, arg3);
						}
						if (Static4.anInt3086 <= local327) {
							@Pc(469) int[] local469 = Static5.anIntArrayArray36[local327];
							ArrayUtils.fillRange(local469, local365, local432, arg3);
							ArrayUtils.fillRange(local469, local432, local424, arg4);
							ArrayUtils.fillRange(local469, local424, local359, arg3);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII)Z")
	public static boolean method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static11.method508(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static33.method4119(local10 + 1, SceneGraph.tileHeights[arg0][arg1][arg2] + arg3, local14 + 1) && Static33.method4119(local10 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static33.method4119(local10 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static33.method4119(local10 + 1, SceneGraph.tileHeights[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B[[BI[Lclient!em;[[I[[B[[F[[B[[F[[FI[[B)V")
	public static void method1094(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Light[] lights, @OriginalArg(4) int[][] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) int level, @OriginalArg(11) byte[][] arg10) {
		for (@Pc(11) int i = 0; i < arg1; i++) {
			@Pc(22) Light light = lights[i];
			if (light.level == level) {
				@Pc(34) GroundLightModel local34 = new GroundLightModel();
				@Pc(43) int local43 = (light.z >> 7) - light.radius;
				@Pc(45) int local45 = 0;
				if (local43 < 0) {
					local45 = -local43;
					local43 = 0;
				}
				@Pc(61) int local61 = light.radius + (light.z >> 7);
				if (local61 > 103) {
					local61 = 103;
				}
				@Pc(78) int local78 = (light.x >> 7) - light.radius;
				for (@Pc(80) int local80 = local43; local80 <= local61; local80++) {
					@Pc(88) short local88 = light.aShortArray28[local45];
					@Pc(94) int local94 = (local88 >> 8) + local78;
					@Pc(102) int local102 = (local88 & 0xFF) + local94 - 1;
					if (local94 < 0) {
						local94 = 0;
					}
					if (local102 > 103) {
						local102 = 103;
					}
					for (@Pc(119) int local119 = local94; local119 <= local102; local119++) {
						@Pc(130) int local130 = arg4[local119][local80] & 0xFF;
						@Pc(138) int local138 = arg6[local119][local80] & 0xFF;
						@Pc(140) boolean local140 = false;
						if (local130 == 0) {
							if (local138 == 0) {
								continue;
							}
							@Pc(156) FloType local156 = FloTypeList.get(local138 - 1);
							if (local156.color == -1) {
								continue;
							}
							if (arg10[local119][local80] != 0) {
								@Pc(177) int[] local177 = Static1.anIntArrayArray5[arg10[local119][local80]];
								local34.indexCapacity += (local177.length >> 1) * 3 - 6;
								local34.vertexCapacity += local177.length >> 1;
								continue;
							}
						} else if (local138 != 0) {
							@Pc(212) FloType local212 = FloTypeList.get(local138 - 1);
							if (local212.color == -1) {
								@Pc(237) byte local237 = arg10[local119][local80];
								if (local237 != 0) {
									@Pc(243) int[] local243 = Static2.anIntArrayArray16[local237];
									local34.indexCapacity += (local243.length >> 1) * 3 - 6;
									local34.vertexCapacity += local243.length >> 1;
								}
								continue;
							}
							@Pc(224) byte local224 = arg10[local119][local80];
							if (local224 != 0) {
								local140 = true;
							}
						}
						@Pc(272) Scenery local272 = SceneGraph.getScenery(level, local119, local80);
						if (local272 != null) {
							@Pc(283) int local283 = (int) (local272.key >> 14) & 0x3F;
							if (local283 == 9) {
								@Pc(289) int[] local289 = null;
								@Pc(297) int local297 = (int) (local272.key >> 20) & 0x3;
								if ((local297 & 0x1) == 0) {
									@Pc(315) boolean local315 = local119 - 1 >= local94;
									if (!local315 && local61 >= local80 + 1) {
										@Pc(329) short local329 = light.aShortArray28[local45 + 1];
										@Pc(335) int local335 = local78 + (local329 >> 8);
										@Pc(341) int local341 = (local329 & 0xFF) + local335;
										local315 = local119 > local335 && local341 > local119;
									}
									@Pc(368) boolean local368 = local102 >= local119 + 1;
									if (!local368 && local80 - 1 >= local43) {
										@Pc(387) short local387 = light.aShortArray28[local45 - 1];
										@Pc(394) int local394 = local78 + (local387 >> 8);
										@Pc(400) int local400 = local394 + (local387 & 0xFF);
										local368 = local394 < local119 && local119 < local400;
									}
									if (local315 && local368) {
										local289 = Static1.anIntArrayArray5[0];
									} else if (local315) {
										local289 = Static1.anIntArrayArray5[1];
									} else if (local368) {
										local289 = Static1.anIntArrayArray5[1];
									}
								} else {
									@Pc(450) boolean local450 = local94 <= local119 - 1;
									if (!local450 && local43 <= local80 - 1) {
										@Pc(465) short local465 = light.aShortArray28[local45 - 1];
										@Pc(471) int local471 = (local465 >> 8) + local78;
										@Pc(477) int local477 = local471 + (local465 & 0xFF);
										local450 = local119 > local471 && local477 > local119;
									}
									@Pc(508) boolean local508 = local119 + 1 <= local102;
									if (!local508 && local61 >= local80 + 1) {
										@Pc(526) short local526 = light.aShortArray28[local45 + 1];
										@Pc(532) int local532 = (local526 >> 8) + local78;
										@Pc(538) int local538 = (local526 & 0xFF) + local532;
										local508 = local532 < local119 && local119 < local538;
									}
									if (local450 && local508) {
										local289 = Static1.anIntArrayArray5[0];
									} else if (local450) {
										local289 = Static1.anIntArrayArray5[1];
									} else if (local508) {
										local289 = Static1.anIntArrayArray5[1];
									}
								}
								if (local289 != null) {
									local34.indexCapacity += ((local289.length >> 1) - 2) * 3;
									local34.vertexCapacity += local289.length >> 1;
								}
								continue;
							}
						}
						if (local140) {
							@Pc(635) int[] local635 = Static1.anIntArrayArray5[arg10[local119][local80]];
							@Pc(643) int[] local643 = Static2.anIntArrayArray16[arg10[local119][local80]];
							local34.indexCapacity += ((local635.length >> 1) - 2) * 3;
							local34.indexCapacity += ((local643.length >> 1) - 2) * 3;
							local34.vertexCapacity += local635.length >> 1;
							local34.vertexCapacity += local643.length >> 1;
						} else {
							@Pc(603) int[] local603 = Static1.anIntArrayArray5[0];
							local34.indexCapacity += ((local603.length >> 1) - 2) * 3;
							local34.vertexCapacity += local603.length >> 1;
						}
					}
					local45++;
				}
				local34.clear();
				@Pc(698) int local698 = 0;
				if ((light.z >> 7) - light.radius < 0) {
					local698 = light.radius - (light.z >> 7);
				}
				for (@Pc(722) int local722 = local43; local722 <= local61; local722++) {
					@Pc(734) short local734 = light.aShortArray28[local698];
					@Pc(741) int local741 = local78 + (local734 >> 8);
					@Pc(749) int local749 = (local734 & 0xFF) + local741 - 1;
					if (local741 < 0) {
						local741 = 0;
					}
					if (local749 > 103) {
						local749 = 103;
					}
					for (@Pc(766) int local766 = local741; local766 <= local749; local766++) {
						@Pc(779) byte local779 = arg0[local766][local722];
						@Pc(787) int local787 = arg4[local766][local722] & 0xFF;
						@Pc(795) int local795 = arg6[local766][local722] & 0xFF;
						@Pc(797) boolean local797 = false;
						if (local787 == 0) {
							if (local795 == 0) {
								continue;
							}
							@Pc(810) FloType local810 = FloTypeList.get(local795 - 1);
							if (local810.color == -1) {
								continue;
							}
							if (arg10[local766][local722] != 0) {
								Static19.method1778(light, Static1.anIntArrayArray5[arg10[local766][local722]], arg7, local722, local766, local34, arg5, arg8, arg0[local766][local722], arg3);
								continue;
							}
						} else if (local795 != 0) {
							@Pc(859) FloType local859 = FloTypeList.get(local795 - 1);
							if (local859.color == -1) {
								Static19.method1778(light, Static2.anIntArrayArray16[arg10[local766][local722]], arg7, local722, local766, local34, arg5, arg8, arg0[local766][local722], arg3);
								continue;
							}
							@Pc(895) byte local895 = arg10[local766][local722];
							if (local895 != 0) {
								local797 = true;
							}
						}
						@Pc(907) Scenery local907 = SceneGraph.getScenery(level, local766, local722);
						if (local907 != null) {
							@Pc(918) int local918 = (int) (local907.key >> 14) & 0x3F;
							if (local918 == 9) {
								@Pc(925) int[] local925 = null;
								@Pc(933) int local933 = (int) (local907.key >> 20) & 0x3;
								if ((local933 & 0x1) == 0) {
									@Pc(946) boolean local946 = local741 <= local766 - 1;
									@Pc(959) boolean local959 = local766 + 1 <= local749;
									if (!local946 && local61 >= local722 + 1) {
										@Pc(973) short local973 = light.aShortArray28[local698 + 1];
										@Pc(979) int local979 = (local973 >> 8) + local78;
										@Pc(985) int local985 = (local973 & 0xFF) + local979;
										local946 = local979 < local766 && local766 < local985;
									}
									if (!local959 && local722 - 1 >= local43) {
										@Pc(1014) short local1014 = light.aShortArray28[local698 - 1];
										@Pc(1021) int local1021 = local78 + (local1014 >> 8);
										@Pc(1027) int local1027 = (local1014 & 0xFF) + local1021;
										local959 = local1021 < local766 && local766 < local1027;
									}
									if (local946 && local959) {
										local925 = Static1.anIntArrayArray5[0];
									} else if (local946) {
										local925 = Static1.anIntArrayArray5[1];
										local779 = 1;
									} else if (local959) {
										local925 = Static1.anIntArrayArray5[1];
										local779 = 3;
									}
								} else {
									@Pc(1077) boolean local1077 = local766 - 1 >= local741;
									@Pc(1090) boolean local1090 = local749 >= local766 + 1;
									if (!local1077 && local722 - 1 >= local43) {
										@Pc(1104) short local1104 = light.aShortArray28[local698 - 1];
										@Pc(1110) int local1110 = local78 + (local1104 >> 8);
										@Pc(1116) int local1116 = local1110 + (local1104 & 0xFF);
										local1077 = local1110 < local766 && local766 < local1116;
									}
									if (!local1090 && local61 >= local722 + 1) {
										@Pc(1141) short local1141 = light.aShortArray28[local698 + 1];
										@Pc(1148) int local1148 = local78 + (local1141 >> 8);
										@Pc(1154) int local1154 = (local1141 & 0xFF) + local1148;
										local1090 = local766 > local1148 && local766 < local1154;
									}
									if (local1077 && local1090) {
										local925 = Static1.anIntArrayArray5[0];
									} else if (local1077) {
										local925 = Static1.anIntArrayArray5[1];
										local779 = 0;
									} else if (local1090) {
										local925 = Static1.anIntArrayArray5[1];
										local779 = 2;
									}
								}
								if (local925 != null) {
									Static19.method1778(light, local925, arg7, local722, local766, local34, arg5, arg8, local779, arg3);
								}
								continue;
							}
						}
						if (local797) {
							Static19.method1778(light, Static2.anIntArrayArray16[arg10[local766][local722]], arg7, local722, local766, local34, arg5, arg8, arg0[local766][local722], arg3);
							Static19.method1778(light, Static1.anIntArrayArray5[arg10[local766][local722]], arg7, local722, local766, local34, arg5, arg8, arg0[local766][local722], arg3);
						} else {
							Static19.method1778(light, Static1.anIntArrayArray5[0], arg7, local722, local766, local34, arg5, arg8, local779, arg3);
						}
					}
					local698++;
				}
				if (local34.vertexCount > 0 && local34.indexCount > 0) {
					local34.buffer();
					light.groundModel = local34;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)V")
	public static void method1102(@OriginalArg(1) int id) {
		if (id == -1 || !InterfaceList.load(id)) {
			return;
		}
		@Pc(24) Component[] components = InterfaceList.components[id];
		for (@Pc(26) int i = 0; i < components.length; i++) {
			@Pc(34) Component component = components[i];
			if (component.anObjectArray22 != null) {
				@Pc(42) HookRequest hookRequest = new HookRequest();
				hookRequest.arguments = component.anObjectArray22;
				hookRequest.source = component;
				ScriptRunner.method519(hookRequest, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)Z")
	public static boolean method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static1.aBoolean17) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (InterfaceList.components[local13] == null || InterfaceList.components[local13][local17] == null) {
			return false;
		}
		@Pc(37) Component component = InterfaceList.components[local13][local17];
		if (arg1 == -1 && component.type == 0) {
			for (@Pc(110) int i = 0; i < MiniMenu.size; i++) {
				if (MiniMenu.actions[i] == 1 || MiniMenu.actions[i] == 1009 || MiniMenu.actions[i] == 34 || MiniMenu.actions[i] == 23 || MiniMenu.actions[i] == 3) {
					for (@Pc(148) Component local148 = InterfaceList.getComponent(MiniMenu.intArgs2[i]); local148 != null; local148 = InterfaceList.method2942(local148)) {
						if (local148.id == component.id) {
							return true;
						}
					}
				}
			}
		} else {
			for (@Pc(48) int i = 0; i < MiniMenu.size; i++) {
				if (MiniMenu.intArgs1[i] == arg1 && component.id == MiniMenu.intArgs2[i] && (MiniMenu.actions[i] == 1 || MiniMenu.actions[i] == 1009 || MiniMenu.actions[i] == 34 || MiniMenu.actions[i] == 23 || MiniMenu.actions[i] == 3)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIII)V")
	public static void method1200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 + arg5;
		@Pc(18) int local18 = arg2 - arg4;
		@Pc(22) int local22 = arg4 + arg1;
		for (@Pc(24) int local24 = arg5; local24 < local10; local24++) {
			ArrayUtils.fillRange(Static5.anIntArrayArray36[local24], arg1, arg3, arg0);
		}
		for (@Pc(44) int local44 = arg2; local44 > local18; local44--) {
			ArrayUtils.fillRange(Static5.anIntArrayArray36[local44], arg1, arg3, arg0);
		}
		@Pc(66) int local66 = arg3 - arg4;
		for (@Pc(68) int local68 = local10; local68 <= local18; local68++) {
			@Pc(79) int[] local79 = Static5.anIntArrayArray36[local68];
			ArrayUtils.fillRange(local79, arg1, local22, arg0);
			ArrayUtils.fillRange(local79, local66, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public static void method1205() {
		Static2.anInt1636 = 13;
		Static2.anInt1637 = 13;
		Static2.aClass56_Sub1_2 = new SoftwareIndexedSprite(Static2.anInt1636 * 128 + 2, Static2.anInt1637 * 128 + 2, 0);
		Static2.aClass103ArrayArray1 = new GroundShadowModel[Static2.anInt1636][Static2.anInt1637];
		for (@Pc(32) int local32 = 0; local32 < Static2.anInt1636; local32++) {
			for (@Pc(37) int local37 = 0; local37 < Static2.anInt1637; local37++) {
				Static2.aClass103ArrayArray1[local32][local37] = new GroundShadowModel();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([B[BIIIII)V")
	public static void method1206(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = -16; local1 < 0; local1++) {
			for (@Pc(5) int local5 = -4; local5 < 0; local5++) {
				@Pc(10) int local10 = arg3 + 1;
				arg0[arg3] = (byte) (arg0[arg3] + 1 - arg1[arg2]);
				@Pc(24) int local24 = arg2 + arg5;
				@Pc(26) int local26 = local10++;
				arg0[local26] = (byte) (arg0[local26] + 1 - arg1[local24]);
				local24 += arg5;
				local26 = local10++;
				arg0[local26] = (byte) (arg0[local26] + 1 - arg1[local24]);
				local24 += arg5;
				arg3 = local10 + 1;
				arg0[local10] = (byte) (arg0[local10] + 1 - arg1[local24]);
				arg2 = local24 + arg5;
			}
			arg3 += arg4;
			arg2 += arg6;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIZZIIIIII)V")
	public static void method1207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 && arg3 || (arg2 && arg0 == 1 || arg3 && arg0 == 0)) {
			return;
		}
		@Pc(19) int local19 = arg4 << 7;
		@Pc(29) int local29 = arg6 + arg7 + arg8 + arg9 >> 2;
		@Pc(33) int local33 = arg5 << 7;
		@Pc(43) int local43 = local19 - (local29 * Static4.anInt3366 >> 8) >> 3;
		@Pc(53) int local53 = local33 - (local29 * Static4.anInt3363 >> 8) >> 3;
		if (arg0 != 0 && arg0 != 1 && (arg2 || arg3)) {
			Static15.method1216(Sprites.floorShadows[arg0], Static2.aClass56_Sub1_2, local43 + 1, local53 + 1, arg1, arg2);
		} else {
			Static15.method1219(Sprites.floorShadows[1], Static2.aClass56_Sub1_2, local43 + 1, local53 + 1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([B[BIIIIII)V")
	public static void method1208(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			for (@Pc(16) int local16 = local4; local16 < 0; local16++) {
				@Pc(21) int local21 = arg3 + 1;
				@Pc(23) byte local23 = arg0[arg3];
				@Pc(26) int local26 = arg2 + 1;
				arg0[arg3] = (byte) (local23 + arg1[arg2]);
				@Pc(32) int local32 = local21++;
				arg0[local32] += arg1[local26++];
				local32 = local21++;
				arg0[local32] += arg1[local26++];
				arg3 = local21 + 1;
				local23 = arg0[local21];
				arg2 = local26 + 1;
				arg0[local21] = (byte) (local23 + arg1[local26]);
			}
			for (@Pc(70) int local70 = arg4; local70 < 0; local70++) {
				@Pc(74) int local74 = arg3++;
				arg0[local74] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "([B[BIIIIII)V")
	public static void method1209(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			for (@Pc(16) int local16 = local4; local16 < 0; local16++) {
				@Pc(21) int local21 = arg3 + 1;
				@Pc(23) byte local23 = arg0[arg3];
				@Pc(26) int local26 = arg2 + 1;
				arg0[arg3] = (byte) (local23 - arg1[arg2]);
				@Pc(32) int local32 = local21++;
				arg0[local32] -= arg1[local26++];
				local32 = local21++;
				arg0[local32] -= arg1[local26++];
				arg3 = local21 + 1;
				local23 = arg0[local21];
				arg2 = local26 + 1;
				arg0[local21] = (byte) (local23 - arg1[local26]);
			}
			for (@Pc(70) int local70 = arg4; local70 < 0; local70++) {
				@Pc(74) int local74 = arg3++;
				arg0[local74] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!fe;III)V")
	public static void method1210(@OriginalArg(0) SoftwareIndexedSprite arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != null) {
			@Pc(12) int local12 = arg1 - (arg2 * Static4.anInt3366 >> 8) >> 3;
			@Pc(22) int local22 = arg3 - (arg2 * Static4.anInt3363 >> 8) >> 3;
			Static15.method1218(arg0, Static2.aClass56_Sub1_2, local12 + 1, local22 + 1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	public static void method1211() {
		Static2.aClass56_Sub1_2 = null;
		Sprites.floorShadows = null;
		Static2.aClass103ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lclient!fe;III)V")
	public static void method1212(@OriginalArg(0) SoftwareIndexedSprite arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != null) {
			@Pc(12) int local12 = arg1 - (arg2 * Static4.anInt3366 >> 8) >> 3;
			@Pc(22) int local22 = arg3 - (arg2 * Static4.anInt3363 >> 8) >> 3;
			Static15.method1219(arg0, Static2.aClass56_Sub1_2, local12 + 1, local22 + 1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(Lclient!fe;III)Z")
	public static boolean method1214(@OriginalArg(0) SoftwareIndexedSprite arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return false;
		} else {
			@Pc(13) int local13 = arg1 - (arg2 * Static4.anInt3366 >> 8) >> 3;
			@Pc(23) int local23 = arg3 - (arg2 * Static4.anInt3363 >> 8) >> 3;
			return Static15.method1217(arg0, Static2.aClass56_Sub1_2, local13 + 1, local23 + 1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII[[Z[[I)V")
	public static void method1215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) int[][] arg5) {
		@Pc(1) GL gl = GlRenderer.gl;
		GlRenderer.setTextureCombineRgbMode(1);
		GlRenderer.setTextureCombineAlphaMode(1);
		GlRenderer.resetTextureMatrix();
		GlRenderer.setLightingEnabled(false);
		MaterialManager.setMaterial(0, 0);
		gl.glDepthMask(false);
		for (@Pc(17) int local17 = 0; local17 < Static2.anInt1636; local17++) {
			label52:
			for (@Pc(22) int local22 = 0; local22 < Static2.anInt1637; local22++) {
				for (@Pc(29) int local29 = local17 * 8; local29 < local17 * 8 + 8; local29++) {
					if (local29 - arg0 >= -arg2 && local29 - arg0 <= arg2) {
						for (@Pc(51) int local51 = local22 * 8; local51 < local22 * 8 + 8; local51++) {
							if (local51 - arg1 >= -arg2 && local51 - arg1 <= arg2 && arg4[local29 + arg2 - arg0][local51 + arg2 - arg1]) {
								@Pc(89) GroundShadowModel local89 = Static2.aClass103ArrayArray1[local17][local22];
								if (local89.aBoolean197) {
									local89.method2236(Static2.aClass56_Sub1_2, local17, local22);
									local89.aBoolean197 = false;
								}
								gl.glPushMatrix();
								gl.glTranslatef((float) (local17 * 1024), 0.0F, (float) (local22 * 1024));
								local89.render();
								gl.glPopMatrix();
								continue label52;
							}
						}
					}
				}
			}
		}
		gl.glEnableClientState(GL.GL_COLOR_ARRAY);
		gl.glDepthMask(true);
		GlRenderer.method1618();
	}
}

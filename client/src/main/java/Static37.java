import java.awt.Graphics;
import java.net.URL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(IB)V")
	public static void method4641(@OriginalArg(0) int arg0) {
		Static4.anInt2853 = 3;
		Static2.anInt1874 = arg0;
		Static5.anInt4215 = 100;
		Static5.anInt3920 = -1;
	}

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "(B)V")
	public static void method4645() {
		if (Static3.anIntArray223 != null && Static3.anIntArray222 != null) {
			return;
		}
		Static3.anIntArray222 = new int[256];
		Static3.anIntArray223 = new int[256];
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(24) double local24 = (double) local14 / 255.0D * 6.283185307179586D;
			Static3.anIntArray223[local14] = (int) (Math.sin(local24) * 4096.0D);
			Static3.anIntArray222[local14] = (int) (Math.cos(local24) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
	public static void method4661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Protocol.outboundBuffer.writeOpcode(230);
		}
		if (arg1 == 1) {
			Protocol.outboundBuffer.writeOpcode(207);
		}
		Protocol.outboundBuffer.writeByteS(++Static1.aByte1);
		Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
		Protocol.outboundBuffer.writeShort(Static7.originZ + arg2);
		Protocol.outboundBuffer.writeShortLEA(arg0 + Static5.originX);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)I")
	public static int method4663() {
		return Static2.aBoolean68 && Keyboard.pressedKeys[81] && Static7.anInt5634 > 2 ? Static2.anIntArray160[Static7.anInt5634 - 2] : Static2.anIntArray160[Static7.anInt5634 - 1];
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V")
	public static void method4670() {
		Static5.anIntArray402 = null;
		Static2.anIntArray85 = null;
		Static3.anIntArray185 = null;
		Static7.anIntArray643 = null;
		Static5.anIntArray391 = null;
		Static6.aByteArrayArray36 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!fd;Z)Lclient!am;")
	public static Class11_Sub1 method4674(@OriginalArg(0) Buffer arg0) {
		return new Class11_Sub1(arg0.readShort(), arg0.readShort(), arg0.readShort(), arg0.readShort(), arg0.readUnsignedMedium(), arg0.readUnsignedMedium(), arg0.readUnsignedByte());
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZBLclient!qk;II)Lclient!uj;")
	public static Sprite method4676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) PlayerAppearance arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(23) int local23 = (arg2 ? 65536 : 0) + arg4 + (arg1 << 17) + (arg5 << 19);
		@Pc(34) long local34 = (long) arg0 * 3147483667L + (long) local23 * 3849834839L;
		@Pc(40) Sprite local40 = (Sprite) ObjTypeList.sprites.get(local34);
		if (local40 != null) {
			return local40;
		}
		Static4.aBoolean218 = false;
		@Pc(58) Sprite local58 = Static13.method965(arg1, arg2, arg0, false, arg3, arg5, arg4, false);
		if (local58 != null && !Static4.aBoolean218) {
			ObjTypeList.sprites.put(local34, local58);
		}
		return local58;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public static void method4677() {
		if (Static5.aClass187ArrayArray1 == null) {
			return;
		}
		@Pc(8) Class187 local8 = new Class187();
		for (@Pc(10) int local10 = 0; local10 < 13; local10++) {
			for (@Pc(15) int local15 = 0; local15 < 13; local15++) {
				Static5.aClass187ArrayArray1[local10][local15] = local8;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
	public static void method4710(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte[][] local11;
		if (GlRenderer.enabled && arg0) {
			local11 = Static1.aByteArrayArray3;
		} else {
			local11 = Static5.aByteArrayArray31;
		}
		@Pc(29) int local29 = Static1.aByteArrayArray4.length;
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(42) byte[] local42 = local11[local31];
			if (local42 != null) {
				@Pc(55) int local55 = (Static7.mapSquares[local31] >> 8) * 64 - Static5.originX;
				@Pc(66) int local66 = (Static7.mapSquares[local31] & 0xFF) * 64 - Static7.originZ;
				Static9.method763();
				Static11.method576(arg0, local42, local66, local55, PathFinder.collisionMaps);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "(I)V")
	public static void method4713() {
		while (true) {
			@Pc(16) Class4_Sub30 local16 = (Class4_Sub30) Static5.aClass112_27.removeHead();
			if (local16 == null) {
				return;
			}
			@Pc(42) PathingEntity entity;
			if (local16.entityId < 0) {
				@Pc(33) int playerId = -local16.entityId - 1;
				if (playerId == PlayerList.selfId) {
					entity = PlayerList.self;
				} else {
					entity = PlayerList.players[playerId];
				}
			} else {
				@Pc(55) int npcId = local16.entityId - 1;
				entity = NpcList.npcs[npcId];
			}
			if (entity != null) {
				@Pc(69) LocType type = LocTypeList.get(local16.locId);
				if (Static7.y < 3) {
				}
				@Pc(88) int width;
				@Pc(85) int length;
				if (local16.angle == 1 || local16.angle == 3) {
					width = type.length;
					length = type.width;
				} else {
					length = type.length;
					width = type.width;
				}
				@Pc(105) int local105 = local16.x + (width + 1 >> 1);
				@Pc(112) int local112 = local16.x + (width >> 1);
				@Pc(120) int local120 = local16.z + (length >> 1);
				@Pc(130) int local130 = local16.z + (length + 1 >> 1);
				@Pc(134) int[][] local134 = Terrain.tileHeights[Static7.y];
				@Pc(161) int local161 = local134[local105][local120] + local134[local112][local120] + local134[local112][local130] + local134[local105][local130] >> 2;
				@Pc(163) Entity local163 = null;
				@Pc(168) int layer = Loc.LAYERS[local16.shape];
				if (layer == 0) {
					@Pc(234) Wall wall = Terrain.getWall(Static7.y, local16.x, local16.z);
					if (wall != null) {
						local163 = wall.aClass53_5;
					}
				} else if (layer == 1) {
					@Pc(219) WallDecor wallDecor = Terrain.getWallDecor(Static7.y, local16.x, local16.z);
					if (wallDecor != null) {
						local163 = wallDecor.aClass53_10;
					}
				} else if (layer == 2) {
					@Pc(205) Scenery scenery = Terrain.getScenery(Static7.y, local16.x, local16.z);
					if (scenery != null) {
						local163 = scenery.aClass53_1;
					}
				} else if (layer == 3) {
					@Pc(192) GroundDecor groundDecor = Terrain.getGroundDecor(Static7.y, local16.x, local16.z);
					if (groundDecor != null) {
						local163 = groundDecor.aClass53_2;
					}
				}
				if (local163 != null) {
					ChangeLocRequest.push(-1, local16.x, Static7.y, local16.z, 0, 0, layer, local16.anInt4997 + 1, local16.anInt4999 + 1);
					entity.anInt4027 = local16.z * 128 + length * 64;
					@Pc(274) int local274 = local16.anInt4994;
					@Pc(277) int local277 = local16.anInt4995;
					entity.anInt4032 = local16.x * 128 + width * 64;
					entity.anInt3975 = local161;
					entity.anInt4042 = local16.anInt4997 + client.loop;
					@Pc(300) int local300 = local16.anInt5007;
					entity.anObject5 = local163;
					entity.anInt4010 = local16.anInt4999 + client.loop;
					if (local300 < local277) {
						@Pc(315) int local315 = local277;
						local277 = local300;
						local300 = local315;
					}
					entity.anInt4041 = local16.x + local300;
					entity.anInt4043 = local16.x + local277;
					@Pc(335) int local335 = local16.anInt5008;
					if (local335 < local274) {
						@Pc(341) int local341 = local274;
						local274 = local335;
						local335 = local341;
					}
					entity.anInt4038 = local335 + local16.z;
					entity.anInt4018 = local274 + local16.z;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method4716(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = Static5.aClass4_Sub3_Sub5_2.method2261(arg0, 250);
		@Pc(32) int local32 = Static5.aClass4_Sub3_Sub5_2.method2274(arg0, 250) * 13;
		if (GlRenderer.enabled) {
			Static18.method1701(6, 6, local17 + 4 + 4, local32 + 8, 0);
			Static18.method1690(6, 6, local17 + 4 + 4, local32 + 4 + 4, 16777215);
		} else {
			Static33.method4205(6, 6, local17 + 8, local32 + 4 + 4, 0);
			Static34.method4222(6, 6, local17 + 4 + 4, local32 + 8, 16777215);
		}
		Static5.aClass4_Sub3_Sub5_2.method2255(arg0, 10, 10, local17, local32, 16777215, -1, 1, 1, 0);
		Static8.method66(local17 + 4 + 4, local32 + 4 + 4, 6, 6);
		if (!arg1) {
			Static16.method1559(10, 10, local32, local17);
		} else if (GlRenderer.enabled) {
			GlRenderer.swapBuffers();
		} else {
			try {
				@Pc(169) Graphics local169 = GameShell.canvas.getGraphics();
				client.frameBuffer.draw(local169);
			} catch (@Pc(177) Exception local177) {
				GameShell.canvas.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method4718() {
		Static1.aClass4_Sub6_Sub2_3.method2501();
		Static5.anInt4357 = 1;
		Static2.aClass58_42 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method4719(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1) {
			try {
				BrowserControl.call(GameShell.signLink.applet, "loggedout");
			} catch (@Pc(51) Throwable local51) {
			}
			try {
				GameShell.instance.getAppletContext().showDocument(new URL(GameShell.instance.getCodeBase(), arg0), "_top");
			} catch (@Pc(63) Exception local63) {
			}
			return;
		}
		if (GlRenderer.enabled && GameShell.openWindowJavaScript) {
			try {
				BrowserControl.call(GameShell.signLink.applet, "openjs", new Object[] { (new URL(GameShell.instance.getCodeBase(), arg0)).toString() });
				return;
			} catch (@Pc(29) Throwable local29) {
			}
		}
		try {
			GameShell.instance.getAppletContext().showDocument(new URL(GameShell.instance.getCodeBase(), arg0), "_blank");
		} catch (@Pc(41) Exception local41) {
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method4721() {
		if (Static11.method561() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static2.anInt1997 - 4 & 0xFF);
		@Pc(27) int local27 = Static2.anInt1997 % 104;
		for (@Pc(29) int local29 = 0; local29 < 4; local29++) {
			for (@Pc(34) int local34 = 0; local34 < 104; local34++) {
				Static1.aByteArrayArrayArray2[local29][local27][local34] = local19;
			}
		}
		if (Static7.y == 3) {
			return;
		}
		for (@Pc(59) int local59 = 0; local59 < 2; local59++) {
			Static5.anIntArray440[local59] = -1000000;
			Static3.anIntArray164[local59] = 1000000;
			Static7.anIntArray620[local59] = 0;
			Static6.anIntArray492[local59] = 1000000;
			Static6.anIntArray489[local59] = 0;
		}
		if (Static1.anInt772 != 1) {
			@Pc(94) int local94 = Static11.method522(Static7.anInt5678, Static3.anInt2519, Static7.y);
			if (local94 - Static2.anInt1931 < 800 && (Static4.tileFlags[Static7.y][Static3.anInt2519 >> 7][Static7.anInt5678 >> 7] & 0x4) != 0) {
				Static9.method279(1, Static3.anInt2519 >> 7, false, Static7.anInt5678 >> 7, Terrain.tiles);
			}
			return;
		}
		if ((Static4.tileFlags[Static7.y][PlayerList.self.x >> 7][PlayerList.self.z >> 7] & 0x4) != 0) {
			Static9.method279(0, PlayerList.self.x >> 7, false, PlayerList.self.z >> 7, Terrain.tiles);
		}
		if (Static5.anInt4066 >= 310) {
			return;
		}
		@Pc(175) int local175 = Static7.anInt5678 >> 7;
		@Pc(179) int local179 = Static3.anInt2519 >> 7;
		@Pc(184) int local184 = PlayerList.self.z >> 7;
		@Pc(196) int local196;
		if (local175 >= local184) {
			local196 = local175 - local184;
		} else {
			local196 = local184 - local175;
		}
		@Pc(208) int local208 = PlayerList.self.x >> 7;
		@Pc(216) int local216;
		if (local208 > local179) {
			local216 = local208 - local179;
		} else {
			local216 = local179 - local208;
		}
		if (local216 == 0 && local196 == 0 || local216 <= -104 || local216 >= 104 || local196 <= -104 || local196 >= 104) {
			TracingException.report(null, "RC: " + local179 + "," + local175 + " " + local208 + "," + local184 + " " + Static5.originX + "," + Static7.originZ);
			return;
		}
		if (local216 > local196) {
			@Pc(397) int local397 = local196 * 65536 / local216;
			@Pc(399) int local399 = 32768;
			while (local208 != local179) {
				if (local179 < local208) {
					local179++;
				} else if (local208 < local179) {
					local179--;
				}
				if ((Static4.tileFlags[Static7.y][local179][local175] & 0x4) != 0) {
					Static9.method279(1, local179, false, local175, Terrain.tiles);
					break;
				}
				local399 += local397;
				if (local399 >= 65536) {
					if (local175 < local184) {
						local175++;
					} else if (local184 < local175) {
						local175--;
					}
					local399 -= 65536;
					if ((Static4.tileFlags[Static7.y][local179][local175] & 0x4) != 0) {
						Static9.method279(1, local179, false, local175, Terrain.tiles);
						break;
					}
				}
			}
			return;
		}
		@Pc(293) int local293 = 32768;
		@Pc(299) int local299 = local216 * 65536 / local196;
		while (local175 != local184) {
			if (local184 > local175) {
				local175++;
			} else if (local184 < local175) {
				local175--;
			}
			if ((Static4.tileFlags[Static7.y][local179][local175] & 0x4) != 0) {
				Static9.method279(1, local179, false, local175, Terrain.tiles);
				break;
			}
			local293 += local299;
			if (local293 >= 65536) {
				local293 -= 65536;
				if (local208 > local179) {
					local179++;
				} else if (local179 > local208) {
					local179--;
				}
				if ((Static4.tileFlags[Static7.y][local179][local175] & 0x4) != 0) {
					Static9.method279(1, local179, false, local175, Terrain.tiles);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BII)V")
	public static void method4736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Protocol.outboundBuffer.writeOpcode(178);
		Protocol.outboundBuffer.writeShortLE2(arg0);
		Protocol.outboundBuffer.writeIntAlt3(arg1);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
	public static void method4737() {
		Terrain.anInt4112 = 0;
		label194:
		for (@Pc(3) int local3 = 0; local3 < Terrain.anInt1742; local3++) {
			@Pc(10) Class184 local10 = Terrain.aClass184Array13[local3];
			if (Static3.anIntArray170 != null) {
				for (@Pc(14) int local14 = 0; local14 < Static3.anIntArray170.length; local14++) {
					if (Static3.anIntArray170[local14] != -1000000 && (local10.anInt5872 <= Static3.anIntArray170[local14] || local10.anInt5881 <= Static3.anIntArray170[local14]) && (local10.anInt5862 <= Static5.anIntArray399[local14] || local10.anInt5877 <= Static5.anIntArray399[local14]) && (local10.anInt5862 >= Static1.anIntArray63[local14] || local10.anInt5877 >= Static1.anIntArray63[local14]) && (local10.anInt5860 <= Static4.anIntArray309[local14] || local10.anInt5879 <= Static4.anIntArray309[local14]) && (local10.anInt5860 >= Static3.anIntArray226[local14] || local10.anInt5879 >= Static3.anIntArray226[local14])) {
						continue label194;
					}
				}
			}
			if (local10.anInt5866 == 1) {
				@Pc(100) int local100 = local10.anInt5867 + Terrain.anInt3253 - Static6.anInt4513;
				if (local100 >= 0 && local100 <= Terrain.anInt3253 + Terrain.anInt3253) {
					@Pc(115) int local115 = local10.anInt5876 + Terrain.anInt3253 - Static4.anInt3329;
					if (local115 < 0) {
						local115 = 0;
					}
					@Pc(126) int local126 = local10.anInt5870 + Terrain.anInt3253 - Static4.anInt3329;
					if (local126 > Terrain.anInt3253 + Terrain.anInt3253) {
						local126 = Terrain.anInt3253 + Terrain.anInt3253;
					}
					@Pc(137) boolean local137 = false;
					while (local115 <= local126) {
						if (Terrain.aBooleanArrayArray5[local100][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						@Pc(158) int local158 = Static7.anInt5281 - local10.anInt5862;
						if (local158 > 32) {
							local10.anInt5873 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt5873 = 2;
							local158 = -local158;
						}
						local10.anInt5864 = (local10.anInt5860 - Static6.anInt4400 << 8) / local158;
						local10.anInt5874 = (local10.anInt5879 - Static6.anInt4400 << 8) / local158;
						local10.anInt5869 = (local10.anInt5872 - Static6.anInt4375 << 8) / local158;
						local10.anInt5868 = (local10.anInt5881 - Static6.anInt4375 << 8) / local158;
						Terrain.aClass184Array12[Terrain.anInt4112++] = local10;
					}
				}
			} else if (local10.anInt5866 == 2) {
				@Pc(234) int local234 = local10.anInt5876 + Terrain.anInt3253 - Static4.anInt3329;
				if (local234 >= 0 && local234 <= Terrain.anInt3253 + Terrain.anInt3253) {
					@Pc(249) int local249 = local10.anInt5867 + Terrain.anInt3253 - Static6.anInt4513;
					if (local249 < 0) {
						local249 = 0;
					}
					@Pc(260) int local260 = local10.anInt5858 + Terrain.anInt3253 - Static6.anInt4513;
					if (local260 > Terrain.anInt3253 + Terrain.anInt3253) {
						local260 = Terrain.anInt3253 + Terrain.anInt3253;
					}
					@Pc(271) boolean local271 = false;
					while (local249 <= local260) {
						if (Terrain.aBooleanArrayArray5[local249++][local234]) {
							local271 = true;
							break;
						}
					}
					if (local271) {
						@Pc(292) int local292 = Static6.anInt4400 - local10.anInt5860;
						if (local292 > 32) {
							local10.anInt5873 = 3;
						} else {
							if (local292 >= -32) {
								continue;
							}
							local10.anInt5873 = 4;
							local292 = -local292;
						}
						local10.anInt5861 = (local10.anInt5862 - Static7.anInt5281 << 8) / local292;
						local10.anInt5878 = (local10.anInt5877 - Static7.anInt5281 << 8) / local292;
						local10.anInt5869 = (local10.anInt5872 - Static6.anInt4375 << 8) / local292;
						local10.anInt5868 = (local10.anInt5881 - Static6.anInt4375 << 8) / local292;
						Terrain.aClass184Array12[Terrain.anInt4112++] = local10;
					}
				}
			} else if (local10.anInt5866 == 4) {
				@Pc(366) int local366 = local10.anInt5872 - Static6.anInt4375;
				if (local366 > 128) {
					@Pc(377) int local377 = local10.anInt5876 + Terrain.anInt3253 - Static4.anInt3329;
					if (local377 < 0) {
						local377 = 0;
					}
					@Pc(388) int local388 = local10.anInt5870 + Terrain.anInt3253 - Static4.anInt3329;
					if (local388 > Terrain.anInt3253 + Terrain.anInt3253) {
						local388 = Terrain.anInt3253 + Terrain.anInt3253;
					}
					if (local377 <= local388) {
						@Pc(408) int local408 = local10.anInt5867 + Terrain.anInt3253 - Static6.anInt4513;
						if (local408 < 0) {
							local408 = 0;
						}
						@Pc(419) int local419 = local10.anInt5858 + Terrain.anInt3253 - Static6.anInt4513;
						if (local419 > Terrain.anInt3253 + Terrain.anInt3253) {
							local419 = Terrain.anInt3253 + Terrain.anInt3253;
						}
						@Pc(430) boolean local430 = false;
						label166:
						for (@Pc(432) int local432 = local408; local432 <= local419; local432++) {
							for (@Pc(437) int local437 = local377; local437 <= local388; local437++) {
								if (Terrain.aBooleanArrayArray5[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt5873 = 5;
							local10.anInt5861 = (local10.anInt5862 - Static7.anInt5281 << 8) / local366;
							local10.anInt5878 = (local10.anInt5877 - Static7.anInt5281 << 8) / local366;
							local10.anInt5864 = (local10.anInt5860 - Static6.anInt4400 << 8) / local366;
							local10.anInt5874 = (local10.anInt5879 - Static6.anInt4400 << 8) / local366;
							Terrain.aClass184Array12[Terrain.anInt4112++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public static void method4752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(4) Component local4 = Static23.method2425(arg0, arg1);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray18 != null) {
			@Pc(22) Class4_Sub13 local22 = new Class4_Sub13();
			local22.op = arg2;
			local22.source = local4;
			local22.opBase = arg3;
			local22.arguments = local4.anObjectArray18;
			Static21.method2019(local22);
		}
		@Pc(40) boolean local40 = true;
		if (local4.anInt5904 > 0) {
			local40 = Static36.method4402(local4);
		}
		if (!local40 || !Static12.method687(local4).method3266(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Protocol.outboundBuffer.writeOpcode(94);
			Protocol.outboundBuffer.writeInt(arg0);
			Protocol.outboundBuffer.writeShort(arg1);
		}
		if (arg2 == 2) {
			Protocol.outboundBuffer.writeOpcode(201);
			Protocol.outboundBuffer.writeInt(arg0);
			Protocol.outboundBuffer.writeShort(arg1);
		}
		if (arg2 == 3) {
			Protocol.outboundBuffer.writeOpcode(30);
			Protocol.outboundBuffer.writeInt(arg0);
			Protocol.outboundBuffer.writeShort(arg1);
		}
		if (arg2 == 4) {
			Protocol.outboundBuffer.writeOpcode(61);
			Protocol.outboundBuffer.writeInt(arg0);
			Protocol.outboundBuffer.writeShort(arg1);
		}
		if (arg2 == 5) {
			Protocol.outboundBuffer.writeOpcode(66);
			Protocol.outboundBuffer.writeInt(arg0);
			Protocol.outboundBuffer.writeShort(arg1);
		}
		if (arg2 == 6) {
			Protocol.outboundBuffer.writeOpcode(7);
			Protocol.outboundBuffer.writeInt(arg0);
			Protocol.outboundBuffer.writeShort(arg1);
		}
		if (arg2 == 7) {
			Protocol.outboundBuffer.writeOpcode(108);
			Protocol.outboundBuffer.writeInt(arg0);
			Protocol.outboundBuffer.writeShort(arg1);
		}
		if (arg2 == 8) {
			Protocol.outboundBuffer.writeOpcode(255);
			Protocol.outboundBuffer.writeInt(arg0);
			Protocol.outboundBuffer.writeShort(arg1);
		}
		if (arg2 == 9) {
			Protocol.outboundBuffer.writeOpcode(97);
			Protocol.outboundBuffer.writeInt(arg0);
			Protocol.outboundBuffer.writeShort(arg1);
		}
		if (arg2 == 10) {
			Protocol.outboundBuffer.writeOpcode(10);
			Protocol.outboundBuffer.writeInt(arg0);
			Protocol.outboundBuffer.writeShort(arg1);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([[FII[[I[[F[[ILclient!ih;IIZF[[FIIIIII)I")
	public static int method4757(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) Class4_Sub12 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float[][] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16) {
		if (arg12 == 1) {
			@Pc(39) int local39 = arg13;
			arg13 = arg1;
			arg1 = 128 - local39;
		} else if (arg12 == 2) {
			arg1 = 128 - arg1;
			arg13 = 128 - arg13;
		} else if (arg12 == 3) {
			@Pc(16) int local16 = arg13;
			arg13 = 128 - arg1;
			arg1 = local16;
		}
		@Pc(111) int local111;
		@Pc(109) float local109;
		@Pc(99) float local99;
		@Pc(89) float local89;
		if (arg13 == 0 && arg1 == 0) {
			local111 = arg16;
			local99 = arg4[arg8][arg2];
			local109 = arg0[arg8][arg2];
			local89 = arg11[arg8][arg2];
		} else if (arg13 == 128 && arg1 == 0) {
			local109 = arg0[arg8 + 1][arg2];
			local99 = arg4[arg8 + 1][arg2];
			local111 = arg7;
			local89 = arg11[arg8 + 1][arg2];
		} else if (arg13 == 128 && arg1 == 128) {
			local89 = arg11[arg8 + 1][arg2 + 1];
			local99 = arg4[arg8 + 1][arg2 + 1];
			local109 = arg0[arg8 + 1][arg2 + 1];
			local111 = arg15;
		} else if (arg13 == 0 && arg1 == 128) {
			local89 = arg11[arg8][arg2 + 1];
			local111 = arg14;
			local109 = arg0[arg8][arg2 + 1];
			local99 = arg4[arg8][arg2 + 1];
		} else {
			@Pc(124) float local124 = arg4[arg8][arg2];
			@Pc(130) float local130 = arg11[arg8][arg2];
			@Pc(136) float local136 = arg0[arg8][arg2];
			@Pc(141) float local141 = (float) arg13 / 128.0F;
			@Pc(146) float local146 = (float) arg1 / 128.0F;
			local124 += local141 * (arg4[arg8 + 1][arg2] - local124);
			local130 += local141 * (arg11[arg8 + 1][arg2] - local130);
			local136 += (arg0[arg8 + 1][arg2] - local136) * local141;
			@Pc(197) float local197 = arg0[arg8][arg2 + 1];
			@Pc(205) float local205 = arg4[arg8][arg2 + 1];
			@Pc(213) float local213 = arg11[arg8][arg2 + 1];
			local197 += (arg0[arg8 + 1][arg2 + 1] - local197) * local141;
			local109 = local136 + local146 * (local197 - local136);
			local213 += local141 * (arg11[arg8 + 1][arg2 + 1] - local213);
			local205 += local141 * (arg4[arg8 + 1][arg2 + 1] - local205);
			local89 = local130 + (local213 - local130) * local146;
			local99 = local124 + local146 * (local205 - local124);
			@Pc(293) int local293 = Static20.method1952(arg16, arg7, arg13);
			@Pc(299) int local299 = Static20.method1952(arg14, arg15, arg13);
			local111 = Static20.method1952(local293, local299, arg1);
		}
		@Pc(390) int local390 = (arg2 << 7) + arg1;
		@Pc(396) int local396 = arg13 + (arg8 << 7);
		@Pc(404) int local404 = Static9.method206(arg13, arg8, arg1, arg3, arg2);
		return arg6.method1871(local396, local404, local390, local109, local99, local89, arg9 ? local111 & 0xFFFFFF00 : local111, arg5 == null ? 0.0F : (float) (local404 - Static9.method206(arg13, arg8, arg1, arg5, arg2)) / arg10);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIZII)V")
	public static void method4773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		Static5.anInt4165 = arg5;
		Static4.anInt2977 = arg1;
		Static5.anInt3490 = arg2;
		Static4.anInt3131 = arg3;
		Static7.anInt5236 = arg0;
		if (arg4 && Static5.anInt3490 >= 100) {
			Static3.anInt2519 = Static4.anInt2977 * 128 + 64;
			Static7.anInt5678 = Static5.anInt4165 * 128 + 64;
			Static2.anInt1931 = Static11.method522(Static7.anInt5678, Static3.anInt2519, Static7.y) - Static4.anInt3131;
		}
		Static1.anInt772 = 2;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIZII)Z")
	public static boolean method4780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		@Pc(21) long local21 = Terrain.getWallPickKey(arg1, arg4, arg3);
		if (local21 != 0L) {
			@Pc(32) int local32 = (int) local21 >> 20 & 0x3;
			@Pc(39) int local39 = (int) local21 >> 14 & 0x1F;
			@Pc(46) int local46 = Integer.MAX_VALUE & (int) (local21 >>> 32);
			@Pc(50) LocType local50 = LocTypeList.get(local46);
			if (local50.mapSceneId == -1) {
				@Pc(56) int local56 = arg0;
				@Pc(58) int[] local58 = Static6.anIntArray561;
				@Pc(75) int local75 = arg4 * 4 + (52736 - arg3 * 512) * 4 + 24624;
				if (local21 > 0L) {
					local56 = arg2;
				}
				if (local39 == 0 || local39 == 2) {
					if (local32 == 0) {
						local58[local75] = local56;
						local58[local75 + 512] = local56;
						local58[local75 + 1024] = local56;
						local58[local75 + 1536] = local56;
					} else if (local32 == 1) {
						local58[local75] = local56;
						local58[local75 + 1] = local56;
						local58[local75 + 2] = local56;
						local58[local75 + 3] = local56;
					} else if (local32 == 2) {
						local58[local75 + 3] = local56;
						local58[local75 + 512 + 3] = local56;
						local58[local75 + 1024 + 3] = local56;
						local58[local75 + 3 + 1536] = local56;
					} else if (local32 == 3) {
						local58[local75 + 1536] = local56;
						local58[local75 + 1536 + 1] = local56;
						local58[local75 + 2 + 1536] = local56;
						local58[local75 + 1536 + 3] = local56;
					}
				}
				if (local39 == 3) {
					if (local32 == 0) {
						local58[local75] = local56;
					} else if (local32 == 1) {
						local58[local75 + 3] = local56;
					} else if (local32 == 2) {
						local58[local75 + 3 + 1536] = local56;
					} else if (local32 == 3) {
						local58[local75 + 1536] = local56;
					}
				}
				if (local39 == 2) {
					if (local32 == 3) {
						local58[local75] = local56;
						local58[local75 + 512] = local56;
						local58[local75 + 1024] = local56;
						local58[local75 + 1536] = local56;
					} else if (local32 == 0) {
						local58[local75] = local56;
						local58[local75 + 1] = local56;
						local58[local75 + 2] = local56;
						local58[local75 + 3] = local56;
					} else if (local32 == 1) {
						local58[local75 + 3] = local56;
						local58[local75 + 512 + 3] = local56;
						local58[local75 + 1024 + 3] = local56;
						local58[local75 + 3 + 1536] = local56;
					} else if (local32 == 2) {
						local58[local75 + 1536] = local56;
						local58[local75 + 1536 + 1] = local56;
						local58[local75 + 2 + 1536] = local56;
						local58[local75 + 1539] = local56;
					}
				}
			} else if (!Static33.method4155(arg3, local50, arg4, local32)) {
				return false;
			}
		}
		@Pc(418) long local418 = Terrain.getSceneryPickKey(arg1, arg4, arg3);
		if (local418 != 0L) {
			@Pc(430) int local430 = (int) local418 >> 20 & 0x3;
			@Pc(437) int local437 = Integer.MAX_VALUE & (int) (local418 >>> 32);
			@Pc(444) int local444 = (int) local418 >> 14 & 0x1F;
			@Pc(448) LocType local448 = LocTypeList.get(local437);
			if (local448.mapSceneId == -1) {
				if (local444 == 9) {
					@Pc(459) int local459 = 15658734;
					@Pc(461) int[] local461 = Static6.anIntArray561;
					if (local418 > 0L) {
						local459 = 15597568;
					}
					@Pc(485) int local485 = arg4 * 4 + (52736 - arg3 * 512) * 4 + 24624;
					if (local430 == 0 || local430 == 2) {
						local461[local485 + 1536] = local459;
						local461[local485 + 1024 + 1] = local459;
						local461[local485 + 512 + 2] = local459;
						local461[local485 + 3] = local459;
					} else {
						local461[local485] = local459;
						local461[local485 + 1 + 512] = local459;
						local461[local485 + 1024 + 2] = local459;
						local461[local485 + 3 + 1536] = local459;
					}
				}
			} else if (!Static33.method4155(arg3, local448, arg4, local430)) {
				return false;
			}
		}
		@Pc(573) long local573 = Terrain.getGroundDecorPickKey(arg1, arg4, arg3);
		if (local573 != 0L) {
			@Pc(585) int local585 = (int) (local573 >>> 32) & Integer.MAX_VALUE;
			@Pc(592) int local592 = (int) local573 >> 20 & 0x3;
			@Pc(596) LocType local596 = LocTypeList.get(local585);
			if (local596.mapSceneId != -1 && !Static33.method4155(arg3, local596, arg4, local592)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
	public static void method4784() {
		if (Static2.anInt1940 == 2) {
			if (Static4.anInt3341 == Static4.anInt2663 && Static1.anInt891 == Static5.anInt5848) {
				Static2.anInt1940 = 0;
				if (Static2.aBoolean68 && Keyboard.pressedKeys[81] && Static7.anInt5634 > 2) {
					Static35.method664(Static7.anInt5634 - 2);
				} else {
					Static35.method664(Static7.anInt5634 - 1);
				}
			}
		} else if (Static4.anInt3341 == Mouse.clickX && Static5.anInt5848 == Mouse.clickY) {
			Static2.anInt1940 = 0;
			if (Static2.aBoolean68 && Keyboard.pressedKeys[81] && Static7.anInt5634 > 2) {
				Static35.method664(Static7.anInt5634 - 2);
			} else {
				Static35.method664(Static7.anInt5634 - 1);
			}
		} else {
			Static2.anInt1940 = 2;
			Static1.anInt891 = Mouse.clickY;
			Static4.anInt2663 = Mouse.clickX;
		}
	}

}

import java.io.IOException;
import java.net.Socket;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static35 {

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
			} else if (Mouse.clickButton == 0) {
				Static5.anInt5848 = Mouse.y;
				Static4.anInt3341 = Mouse.x;
			} else {
				Static5.anInt5848 = Mouse.clickY;
				Static4.anInt3341 = Mouse.clickX;
			}
			Static6.aShortArray100[0] = 1006;
			Static6.aStringArray30[0] = LocalisedText.CANCEL;
			Static6.aStringArray27[0] = "";
			Static7.anInt5634 = 1;
			Static2.anIntArray160[0] = Static7.anInt6050;
		}
		Static26.method2964((long) client.loop);
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
		Static3.anInt2522 = client.loop;
		Static3.anInt2047 = -1;
		Static6.anInt4679 = -1;
		Static6.aClass185_13 = null;
		if (GlRenderer.enabled) {
			Static7.aBoolean123 = true;
		}
		if (Static3.anInt5398 != -1) {
			Static1.anInt113 = 0;
			Static16.method1563();
		}
		if (GlRenderer.enabled) {
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
					if (GlRenderer.enabled) {
						Static18.method1691(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711935, 128);
					} else {
						Static34.method4213(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711935, 128);
					}
				} else if (Static6.aBooleanArray24[local211]) {
					if (GlRenderer.enabled) {
						Static18.method1691(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711680, 128);
					} else {
						Static34.method4213(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711680, 128);
					}
				}
			}
		}
		Static20.method1963(Static7.y, PlayerList.self.z, PlayerList.self.x, Static5.anInt4156);
		Static5.anInt4156 = 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method4306() {
		if (Static3.anInt2554 != -1) {
			Static24.method2947(false, -1, -1, Static3.anInt2554);
			Static3.anInt2554 = -1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!wf;BIII)V")
	public static void method4309(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (GlRenderer.enabled) {
			Static18.method1693(arg3, arg1, arg0.anInt5893 + arg3, arg1 + arg0.anInt5949);
		}
		if (Static5.anInt5206 >= 3) {
			if (GlRenderer.enabled) {
				@Pc(41) Sprite local41 = arg0.method4729(false);
				if (local41 != null) {
					local41.method4506(arg3, arg1);
				}
			} else {
				Static34.method4210(arg3, arg1, arg0.anIntArray672, arg0.anIntArray657);
			}
		} else if (GlRenderer.enabled) {
			((GlSprite) Static6.aClass4_Sub3_Sub14_6).method4519(arg3, arg1, arg0.anInt5893, arg0.anInt5949, Static6.aClass4_Sub3_Sub14_6.width / 2, Static6.aClass4_Sub3_Sub14_6.height / 2, (int) Static5.aFloat97, 256, (GlSprite) arg0.method4729(false));
		} else {
			((SoftwareSprite) Static6.aClass4_Sub3_Sub14_6).method2165(arg3, arg1, arg0.anInt5893, arg0.anInt5949, Static6.aClass4_Sub3_Sub14_6.width / 2, Static6.aClass4_Sub3_Sub14_6.height / 2, (int) Static5.aFloat97, arg0.anIntArray672, arg0.anIntArray657);
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
			@Pc(46) Player local46 = PlayerList.players[local24];
			if (local46 != null) {
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Mouse.clickY;
				Protocol.outboundBuffer.writeOpcode(52);
				Protocol.outboundBuffer.writeShort(local24);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local46.getSize(), local46.getSize(), 0, 0);
			}
		}
		if (local28 == 17) {
			Protocol.outboundBuffer.writeOpcode(95);
			Protocol.outboundBuffer.writeShort(local24);
			Protocol.outboundBuffer.writeIntAlt3(local19);
			Protocol.outboundBuffer.writeShortLEA(local15);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 33) {
			@Pc(146) Npc local146 = NpcList.npcs[local24];
			if (local146 != null) {
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Static4.anInt3275 = Mouse.clickY;
				Static2.anInt1629 = 0;
				Protocol.outboundBuffer.writeOpcode(160);
				Protocol.outboundBuffer.writeByteC(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeIntLE2(Static5.anInt4302);
				Protocol.outboundBuffer.writeShortLE2(local24);
				Protocol.outboundBuffer.writeShort(Static1.anInt314);
				Protocol.outboundBuffer.writeShortLEA(Static1.anInt243);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local146.getSize(), local146.getSize(), 0, 0);
			}
		}
		if (local28 == 40) {
			Static4.anInt3275 = Mouse.clickY;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Protocol.outboundBuffer.writeOpcode(134);
			Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortA(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Protocol.outboundBuffer.writeShortA(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShortLEA(Static5.originX + local15);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 46) {
			Static2.anInt1629 = 0;
			Static6.anInt5177 = Mouse.clickX;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Protocol.outboundBuffer.writeOpcode(227);
			Protocol.outboundBuffer.writeShort(local15 + Static5.originX);
			Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShort(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShortLEA(local24);
			PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (local28 == 21) {
			@Pc(346) Player local346 = PlayerList.players[local24];
			if (local346 != null) {
				Static4.anInt3275 = Mouse.clickY;
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Protocol.outboundBuffer.writeOpcode(123);
				Protocol.outboundBuffer.writeShortLEA(local24);
				Protocol.outboundBuffer.writeInt(Static5.anInt4302);
				Protocol.outboundBuffer.writeShortA(Static1.anInt314);
				Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShortLEA(Static1.anInt243);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local346.getSize(), local346.getSize(), 0, 0);
			}
		}
		if (local28 == 1004) {
			Static4.anInt3275 = Mouse.clickY;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Protocol.outboundBuffer.writeOpcode(72);
			Protocol.outboundBuffer.writeShort(local24);
		}
		if (local28 == 19) {
			if (local24 == 0) {
				Static2.anInt1767 = 1;
				Static27.method3186(Static7.y, local15, local19);
			} else if (local24 == 1) {
				Protocol.outboundBuffer.writeOpcode(204);
				Protocol.outboundBuffer.writeShortA(local19 + Static7.originZ);
				Protocol.outboundBuffer.writeShortA(Static2.anInt1367);
				Protocol.outboundBuffer.writeIntAlt3(Static1.anInt1053);
				Protocol.outboundBuffer.writeShortLE2(local15 + Static5.originX);
			}
		}
		if (local28 == 28) {
			Static4.anInt3275 = Mouse.clickY;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Protocol.outboundBuffer.writeOpcode(119);
			Protocol.outboundBuffer.writeIntAlt3(Static5.anInt4302);
			Protocol.outboundBuffer.writeShort(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShortA(Static1.anInt243);
			Protocol.outboundBuffer.writeShortLE2(Static1.anInt314);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeShortLE2(Static5.originX + local15);
			Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
			PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (local28 == 36) {
			@Pc(582) Npc local582 = NpcList.npcs[local24];
			if (local582 != null) {
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Mouse.clickX;
				Static4.anInt3275 = Mouse.clickY;
				Protocol.outboundBuffer.writeOpcode(37);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShortLEA(local24);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local582.getSize(), local582.getSize(), 0, 0);
			}
		}
		if (local28 == 12) {
			@Pc(649) Player local649 = PlayerList.players[local24];
			if (local649 != null) {
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Mouse.clickX;
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Mouse.clickY;
				Protocol.outboundBuffer.writeOpcode(4);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShortA(local24);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local649.getSize(), local649.getSize(), 0, 0);
			}
		}
		if (local28 == 10) {
			Protocol.outboundBuffer.writeOpcode(102);
			Protocol.outboundBuffer.writeInt(local19);
			Protocol.outboundBuffer.writeShortA(local15);
			Protocol.outboundBuffer.writeShort(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 25) {
			@Pc(744) Npc local744 = NpcList.npcs[local24];
			if (local744 != null) {
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Mouse.clickY;
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Mouse.clickX;
				Protocol.outboundBuffer.writeOpcode(33);
				Protocol.outboundBuffer.writeShortLEA(local24);
				Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local744.getSize(), local744.getSize(), 0, 0);
			}
		}
		if (local28 == 1007) {
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Static4.anInt3275 = Mouse.clickY;
			Static7.anInt6008 = 2;
			Protocol.outboundBuffer.writeOpcode(176);
			Protocol.outboundBuffer.writeShort(local24);
		}
		if (local28 == 4) {
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Static2.anInt1629 = 0;
			Static6.anInt5177 = Mouse.clickX;
			Protocol.outboundBuffer.writeOpcode(89);
			Protocol.outboundBuffer.writeShort((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.writeByteC(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLEA(Static5.originX + local15);
			Protocol.outboundBuffer.writeShortLE2(Static2.anInt1367);
			Protocol.outboundBuffer.writeShort(Static7.originZ + local19);
			Protocol.outboundBuffer.writeIntAlt3(Static1.anInt1053);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 6) {
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Protocol.outboundBuffer.writeOpcode(232);
			Protocol.outboundBuffer.writeShortLE2(local19 + Static7.originZ);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2(local15 + Static5.originX);
			PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (local28 == 42) {
			@Pc(969) Npc local969 = NpcList.npcs[local24];
			if (local969 != null) {
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Mouse.clickX;
				Static4.anInt3275 = Mouse.clickY;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(155);
				Protocol.outboundBuffer.writeShortA(local24);
				Protocol.outboundBuffer.writeByteC(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShort(Static2.anInt1367);
				Protocol.outboundBuffer.writeIntAlt3(Static1.anInt1053);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local969.getSize(), local969.getSize(), 0, 0);
			}
		}
		if (local28 == 31) {
			@Pc(1044) Player local1044 = PlayerList.players[local24];
			if (local1044 != null) {
				Static4.anInt3275 = Mouse.clickY;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(105);
				Protocol.outboundBuffer.writeShort(local24);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local1044.getSize(), local1044.getSize(), 0, 0);
			}
		}
		if (local28 == 47) {
			if (local24 == 0) {
				Static6.anInt4946 = 1;
				Static27.method3186(Static7.y, local15, local19);
			} else if (Static3.anInt2576 > 0 && Keyboard.pressedKeys[82] && Keyboard.pressedKeys[81]) {
				Static24.method2945(Static5.originX + local15, Static7.originZ + local19, Static7.y);
			} else {
				Protocol.outboundBuffer.writeOpcode(85);
				Protocol.outboundBuffer.writeShortLEA(Static5.originX + local15);
				Protocol.outboundBuffer.writeShortLE2(Static7.originZ + local19);
			}
		}
		if (local28 == 59) {
			@Pc(1170) Npc local1170 = NpcList.npcs[local24];
			if (local1170 != null) {
				Static4.anInt3275 = Mouse.clickY;
				Static6.anInt5177 = Mouse.clickX;
				Static2.anInt1629 = 0;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(53);
				Protocol.outboundBuffer.writeShortLEA(local24);
				Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local1170.getSize(), local1170.getSize(), 0, 0);
			}
		}
		if (local28 == 51) {
			Protocol.outboundBuffer.writeOpcode(88);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Protocol.outboundBuffer.writeShortLEA(local15);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 13) {
			Protocol.outboundBuffer.writeOpcode(242);
			Protocol.outboundBuffer.writeShortLEA(local15);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 3 && Static6.aClass185_14 == null) {
			Static37.method4736(local15, local19);
			Static6.aClass185_14 = Static23.method2425(local19, local15);
			Static28.method3270(Static6.aClass185_14);
		}
		if (local28 == 1) {
			Protocol.outboundBuffer.writeOpcode(40);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Protocol.outboundBuffer.writeShort(Static2.anInt1367);
			Protocol.outboundBuffer.writeShortLE2(local15);
			Protocol.outboundBuffer.writeInt(Static1.anInt1053);
		}
		if (local28 == 29) {
			@Pc(1354) Player local1354 = PlayerList.players[local24];
			if (local1354 != null) {
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Mouse.clickY;
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(148);
				Protocol.outboundBuffer.writeShortA(local24);
				Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local1354.getSize(), local1354.getSize(), 0, 0);
			}
		}
		if (local28 == 11) {
			Protocol.outboundBuffer.writeOpcode(158);
			Protocol.outboundBuffer.writeInt(local19);
			@Pc(1434) Component local1434 = InterfaceList.getComponent(local19);
			if (local1434.cs1Scripts != null && local1434.cs1Scripts[0][0] == 5) {
				@Pc(1452) int local1452 = local1434.cs1Scripts[0][1];
				if (local1434.cs1ComparisonOperands[0] != VarpDomain.varps[local1452]) {
					VarpDomain.varps[local1452] = local1434.cs1ComparisonOperands[0];
					Static29.method3534(local1452);
				}
			}
		}
		if (local28 == 32) {
			Static6.anInt5177 = Mouse.clickX;
			Static7.anInt6008 = 2;
			Static2.anInt1629 = 0;
			Static4.anInt3275 = Mouse.clickY;
			Protocol.outboundBuffer.writeOpcode(159);
			Protocol.outboundBuffer.writeShortLEA(local15 + Static5.originX);
			Protocol.outboundBuffer.writeShort(Static7.originZ + local19);
			Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLEA((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 39) {
			@Pc(1545) Npc local1545 = NpcList.npcs[local24];
			if (local1545 != null) {
				Static6.anInt5177 = Mouse.clickX;
				Static4.anInt3275 = Mouse.clickY;
				Static2.anInt1629 = 0;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(245);
				Protocol.outboundBuffer.writeShort(local24);
				Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local1545.getSize(), local1545.getSize(), 0, 0);
			}
		}
		if (local28 == 15) {
			Protocol.outboundBuffer.writeOpcode(58);
			Protocol.outboundBuffer.writeShort(local24);
			Protocol.outboundBuffer.writeIntAlt3(local19);
			Protocol.outboundBuffer.writeShort(Static1.anInt314);
			Protocol.outboundBuffer.writeShort(local15);
			Protocol.outboundBuffer.writeShortA(Static1.anInt243);
			Protocol.outboundBuffer.writeIntAlt3(Static5.anInt4302);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 57) {
			@Pc(1660) Component local1660 = InterfaceList.getComponent(local19);
			@Pc(1662) boolean local1662 = true;
			if (local1660.anInt5904 > 0) {
				local1662 = Static36.method4402(local1660);
			}
			if (local1662) {
				Protocol.outboundBuffer.writeOpcode(158);
				Protocol.outboundBuffer.writeInt(local19);
			}
		}
		if (local28 == 30) {
			Protocol.outboundBuffer.writeOpcode(81);
			Protocol.outboundBuffer.writeShortLE2(local15);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeIntLE2(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 14) {
			@Pc(1728) Player local1728 = PlayerList.players[local24];
			if (local1728 != null) {
				Static7.anInt6008 = 2;
				Static4.anInt3275 = Mouse.clickY;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Mouse.clickX;
				Protocol.outboundBuffer.writeOpcode(77);
				Protocol.outboundBuffer.writeShortLE2(local24);
				Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local1728.getSize(), local1728.getSize(), 0, 0);
			}
		}
		if (local28 == 26) {
			if (local24 == 0) {
				Static27.method3186(Static7.y, local15, local19);
			} else if (local24 == 1) {
				if (Static3.anInt2576 > 0 && Keyboard.pressedKeys[82] && Keyboard.pressedKeys[81]) {
					Static24.method2945(local15 + Static5.originX, local19 + Static7.originZ, Static7.y);
				} else {
					Static37.method4661(local15, 1, local19);
					Protocol.outboundBuffer.writeByte(Static2.anInt1941);
					Protocol.outboundBuffer.writeByte(Static7.anInt5798);
					Protocol.outboundBuffer.writeShort((int) Static5.aFloat97);
					Protocol.outboundBuffer.writeByte(57);
					Protocol.outboundBuffer.writeByte(Static6.anInt3585);
					Protocol.outboundBuffer.writeByte(Static6.anInt4761);
					Protocol.outboundBuffer.writeByte(89);
					Protocol.outboundBuffer.writeShort(PlayerList.self.x);
					Protocol.outboundBuffer.writeShort(PlayerList.self.z);
					Protocol.outboundBuffer.writeByte(Static2.anInt946);
					Protocol.outboundBuffer.writeByte(63);
					PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, 0, 0, 0, 0);
				}
			}
		}
		if (local28 == 9) {
			Static26.method4812();
			@Pc(1913) Component local1913 = InterfaceList.getComponent(local19);
			Static1.anInt314 = local15;
			Static2.anInt1334 = 1;
			Static5.anInt4302 = local19;
			Static1.anInt243 = local24;
			Static28.method3270(local1913);
			Static7.aString365 = "<col=ff9040>" + ObjTypeList.get(local24).name + "<col=ffffff>";
			if (Static7.aString365 == null) {
				Static7.aString365 = "null";
			}
			return;
		}
		if (local28 == 1012 || local28 == 1002 || local28 == 1008 || local28 == 1003 || local28 == 1011) {
			Static13.method1007(local24, local28, local15);
		}
		if (local28 == 48) {
			Static6.anInt5177 = Mouse.clickX;
			Static7.anInt6008 = 2;
			Static2.anInt1629 = 0;
			Static4.anInt3275 = Mouse.clickY;
			Protocol.outboundBuffer.writeOpcode(28);
			Protocol.outboundBuffer.writeShortLEA(local19 + Static7.originZ);
			Protocol.outboundBuffer.writeInt(Static1.anInt1053);
			Protocol.outboundBuffer.writeShortLE2(Static2.anInt1367);
			Protocol.outboundBuffer.writeShort(local24);
			Protocol.outboundBuffer.writeShortLE2(local15 + Static5.originX);
			Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
			PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (local28 == 5) {
			@Pc(2053) Player local2053 = PlayerList.players[local24];
			if (local2053 != null) {
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Mouse.clickX;
				Static4.anInt3275 = Mouse.clickY;
				Static2.anInt1629 = 0;
				Protocol.outboundBuffer.writeOpcode(224);
				Protocol.outboundBuffer.writeShortA(local24);
				Protocol.outboundBuffer.writeShort(Static2.anInt1367);
				Protocol.outboundBuffer.writeIntLE2(Static1.anInt1053);
				Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local2053.getSize(), local2053.getSize(), 0, 0);
			}
		}
		if (local28 == 37) {
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Static6.anInt5177 = Mouse.clickX;
			Protocol.outboundBuffer.writeOpcode(48);
			Protocol.outboundBuffer.writeShort(Static5.originX + local15);
			Protocol.outboundBuffer.writeShortA((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShort(Static7.originZ + local19);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 34) {
			@Pc(2187) Component local2187 = Static23.method2425(local19, local15);
			if (local2187 != null) {
				Static26.method4812();
				@Pc(2195) Class4_Sub21 local2195 = Static12.method687(local2187);
				Static21.method2081(local2195.method3273(), local2195.anInt3939, local2187.anInt5890, local15, local2187.anInt5930, local19);
				Static2.anInt1334 = 0;
				Static4.aString140 = Static12.method780(local2187);
				if (Static4.aString140 == null) {
					Static4.aString140 = "Null";
				}
				if (local2187.if3) {
					Static2.aString81 = local2187.aString352 + "<col=ffffff>";
				} else {
					Static2.aString81 = "<col=00ff00>" + local2187.aString353 + "<col=ffffff>";
				}
			}
			return;
		}
		if (local28 == 49) {
			Protocol.outboundBuffer.writeOpcode(145);
			Protocol.outboundBuffer.writeShortA(local15);
			Protocol.outboundBuffer.writeIntAlt3(local19);
			Protocol.outboundBuffer.writeShortA(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 58) {
			Protocol.outboundBuffer.writeOpcode(214);
			Protocol.outboundBuffer.writeShortLEA(local15);
			Protocol.outboundBuffer.writeShortA(local24);
			Protocol.outboundBuffer.writeInt(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 8) {
			@Pc(2321) Npc local2321 = NpcList.npcs[local24];
			if (local2321 != null) {
				Static6.anInt5177 = Mouse.clickX;
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static4.anInt3275 = Mouse.clickY;
				Protocol.outboundBuffer.writeOpcode(12);
				Protocol.outboundBuffer.writeShortLE2(local24);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local2321.getSize(), local2321.getSize(), 0, 0);
			}
		}
		if (local28 == 35) {
			Protocol.outboundBuffer.writeOpcode(103);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Protocol.outboundBuffer.writeShortLE2(local15);
			Protocol.outboundBuffer.writeShort(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 43) {
			@Pc(2423) Player local2423 = PlayerList.players[local24];
			if (local2423 != null) {
				Static4.anInt3275 = Mouse.clickY;
				Static6.anInt5177 = Mouse.clickX;
				Static2.anInt1629 = 0;
				Static7.anInt6008 = 2;
				Protocol.outboundBuffer.writeOpcode(212);
				Protocol.outboundBuffer.writeShortA(local24);
				Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local2423.getSize(), local2423.getSize(), 0, 0);
			}
		}
		if (local28 == 16) {
			Static4.anInt3275 = Mouse.clickY;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Protocol.outboundBuffer.writeOpcode(116);
			Protocol.outboundBuffer.writeShort(Static1.anInt314);
			Protocol.outboundBuffer.writeShortLEA(local15 + Static5.originX);
			Protocol.outboundBuffer.writeShortLEA((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.writeIntLE2(Static5.anInt4302);
			Protocol.outboundBuffer.writeByteC(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShortLE2(Static1.anInt243);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 44) {
			Static4.anInt3275 = Mouse.clickY;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Protocol.outboundBuffer.writeOpcode(3);
			Protocol.outboundBuffer.writeByteC(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShortLE2(local24);
			Protocol.outboundBuffer.writeShortA(local15 + Static5.originX);
			PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (local28 == 23 || local28 == 1009) {
			Static37.method4752(local19, local15, local24, Static6.aStringArray27[arg0]);
		}
		if (local28 == 1010) {
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Static6.anInt5177 = Mouse.clickX;
			@Pc(2659) Npc local2659 = NpcList.npcs[local24];
			if (local2659 != null) {
				@Pc(2665) NpcType local2665 = local2659.type;
				if (local2665.anIntArray590 != null) {
					local2665 = local2665.method4265();
				}
				if (local2665 != null) {
					Protocol.outboundBuffer.writeOpcode(65);
					Protocol.outboundBuffer.writeShortLE2(local2665.id);
				}
			}
		}
		if (local28 == 7) {
			Static21.method2063();
		}
		if (local28 == 1005) {
			Static4.anInt3275 = Mouse.clickY;
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Mouse.clickX;
			Static2.anInt1629 = 0;
			Protocol.outboundBuffer.writeOpcode(60);
			Protocol.outboundBuffer.writeShortA(local19 + Static7.originZ);
			Protocol.outboundBuffer.writeShortLE2((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2(Static5.originX + local15);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 41) {
			Static7.anInt6008 = 2;
			Static2.anInt1629 = 0;
			Static6.anInt5177 = Mouse.clickX;
			Static4.anInt3275 = Mouse.clickY;
			Protocol.outboundBuffer.writeOpcode(92);
			Protocol.outboundBuffer.writeByteS(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Protocol.outboundBuffer.writeShortA(local15 + Static5.originX);
			Protocol.outboundBuffer.writeShortA(local19 + Static7.originZ);
			Static13.method1004(local19, local32, local15);
		}
		if (local28 == 50) {
			Protocol.outboundBuffer.writeOpcode(177);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Protocol.outboundBuffer.writeShort(local24);
			Protocol.outboundBuffer.writeIntLE2(Static1.anInt1053);
			Protocol.outboundBuffer.writeShortLE2(local15);
			Protocol.outboundBuffer.writeShortLE2(Static2.anInt1367);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 20) {
			Protocol.outboundBuffer.writeOpcode(124);
			Protocol.outboundBuffer.writeShortLEA(local15);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeIntLE2(local19);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 2) {
			Protocol.outboundBuffer.writeOpcode(205);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local19);
			Protocol.outboundBuffer.writeShortLE2(local15);
			Protocol.outboundBuffer.writeShortA(local24);
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 45) {
			Static7.anInt6008 = 2;
			Static6.anInt5177 = Mouse.clickX;
			Static4.anInt3275 = Mouse.clickY;
			Static2.anInt1629 = 0;
			Protocol.outboundBuffer.writeOpcode(54);
			Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
			Protocol.outboundBuffer.writeShortLE2(Static7.originZ + local19);
			Protocol.outboundBuffer.writeShort(local24);
			Protocol.outboundBuffer.writeShort(local15 + Static5.originX);
			PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (local28 == 22) {
			@Pc(3012) Player local3012 = PlayerList.players[local24];
			if (local3012 != null) {
				Static4.anInt3275 = Mouse.clickY;
				Static7.anInt6008 = 2;
				Static6.anInt5177 = Mouse.clickX;
				Static2.anInt1629 = 0;
				Protocol.outboundBuffer.writeOpcode(96);
				Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShort(local24);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local3012.getSize(), local3012.getSize(), 0, 0);
			}
		}
		if (local28 == 60) {
			@Pc(3080) Player local3080 = PlayerList.players[local24];
			if (local3080 != null) {
				Static7.anInt6008 = 2;
				Static2.anInt1629 = 0;
				Static6.anInt5177 = Mouse.clickX;
				Static4.anInt3275 = Mouse.clickY;
				Protocol.outboundBuffer.writeOpcode(223);
				Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
				Protocol.outboundBuffer.writeShortLEA(local24);
				PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, local3080.getSize(), local3080.getSize(), 0, 0);
			}
		}
		if (local28 == 1001) {
			@Pc(3148) Component local3148 = InterfaceList.getComponent(local19);
			if (local3148 == null || local3148.anIntArray661[local15] < 100000) {
				Protocol.outboundBuffer.writeOpcode(72);
				Protocol.outboundBuffer.writeShort(local24);
			} else {
				Static26.method4357("", 0, local3148.anIntArray661[local15] + " x " + ObjTypeList.get(local24).name);
			}
			Static2.anInt2246 = 0;
			Static1.aClass185_3 = InterfaceList.getComponent(local19);
			Static5.anInt3884 = local15;
		}
		if (local28 == 18) {
			Protocol.outboundBuffer.writeOpcode(158);
			Protocol.outboundBuffer.writeInt(local19);
			@Pc(3216) Component local3216 = InterfaceList.getComponent(local19);
			if (local3216.cs1Scripts != null && local3216.cs1Scripts[0][0] == 5) {
				@Pc(3240) int local3240 = local3216.cs1Scripts[0][1];
				VarpDomain.varps[local3240] = 1 - VarpDomain.varps[local3240];
				Static29.method3534(local3240);
			}
		}
		if (local28 == 38) {
			Static2.anInt1629 = 0;
			Static7.anInt6008 = 2;
			Static4.anInt3275 = Mouse.clickY;
			Static6.anInt5177 = Mouse.clickX;
			Protocol.outboundBuffer.writeOpcode(8);
			Protocol.outboundBuffer.writeShortLEA(local24);
			Protocol.outboundBuffer.writeShort(local19 + Static7.originZ);
			Protocol.outboundBuffer.writeShort(Static5.originX + local15);
			Protocol.outboundBuffer.writeByteA(Keyboard.pressedKeys[82] ? 1 : 0);
			PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local15, local19, 0, 0, 0, 0, 0);
		}
		if (Static2.anInt1334 != 0) {
			Static2.anInt1334 = 0;
			Static28.method3270(InterfaceList.getComponent(Static5.anInt4302));
		}
		if (Static3.aBoolean177) {
			Static26.method4812();
		}
		if (Static1.aClass185_3 != null && Static2.anInt2246 == 0) {
			Static28.method3270(Static1.aClass185_3);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method667(@OriginalArg(0) Js5 arg0) {
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
		if (GlRenderer.enabled) {
			Static2.aClass56_Sub1Array2 = Static16.method1523(arg0, Static2.anInt1632);
			for (@Pc(94) int local94 = 0; local94 < Static2.aClass56_Sub1Array2.length; local94++) {
				Static2.aClass56_Sub1Array2[local94].method1320();
			}
		}
		@Pc(115) SoftwareSprite local115 = Static24.method2654(arg0, Static1.anInt130, 0);
		local115.method2176();
		if (GlRenderer.enabled) {
			Static6.aClass4_Sub3_Sub14_6 = new GlSprite(local115);
		} else {
			Static6.aClass4_Sub3_Sub14_6 = local115;
		}
		@Pc(134) SoftwareSprite[] local134 = Static25.method2729(Static6.anInt4371, arg0);
		for (@Pc(136) int local136 = 0; local136 < local134.length; local136++) {
			local134[local136].method2176();
		}
		if (GlRenderer.enabled) {
			Static2.aClass4_Sub3_Sub14Array9 = new Sprite[local134.length];
			for (@Pc(168) int local168 = 0; local168 < local134.length; local168++) {
				Static2.aClass4_Sub3_Sub14Array9[local168] = new GlSprite(local134[local168]);
			}
		} else {
			Static2.aClass4_Sub3_Sub14Array9 = local134;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	public static void method4310() {
		if (Terrain.surfaceTiles != null) {
			for (@Pc(3) int local3 = 0; local3 < Terrain.surfaceTiles.length; local3++) {
				for (@Pc(9) int local9 = 0; local9 < Terrain.width; local9++) {
					for (@Pc(14) int local14 = 0; local14 < Terrain.length; local14++) {
						Terrain.surfaceTiles[local3][local9][local14] = null;
					}
				}
			}
		}
		Terrain.aClass4_Sub12ArrayArray1 = null;
		if (Terrain.underwaterTiles != null) {
			for (@Pc(38) int local38 = 0; local38 < Terrain.underwaterTiles.length; local38++) {
				for (@Pc(44) int local44 = 0; local44 < Terrain.width; local44++) {
					for (@Pc(49) int local49 = 0; local49 < Terrain.length; local49++) {
						Terrain.underwaterTiles[local38][local44][local49] = null;
					}
				}
			}
		}
		Terrain.aClass4_Sub12ArrayArray3 = null;
		Terrain.anInt1742 = 0;
		if (Terrain.aClass184Array13 != null) {
			for (@Pc(75) int local75 = 0; local75 < Terrain.anInt1742; local75++) {
				Terrain.aClass184Array13[local75] = null;
			}
		}
		if (Terrain.scenery != null) {
			for (@Pc(88) int local88 = 0; local88 < Terrain.sceneryLen; local88++) {
				Terrain.scenery[local88] = null;
			}
			Terrain.sceneryLen = 0;
		}
		if (Terrain.aClass33Array1 != null) {
			for (@Pc(103) int local103 = 0; local103 < Terrain.aClass33Array1.length; local103++) {
				Terrain.aClass33Array1[local103] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	public static void method4321() {
		for (@Pc(14) SpotAnimNode local14 = (SpotAnimNode) Static2.aClass112_8.head(); local14 != null; local14 = (SpotAnimNode) Static2.aClass112_8.next()) {
			@Pc(20) SpotAnim local20 = local14.value;
			if (local20.anInt3655 != Static7.y || local20.aBoolean265) {
				local14.unlink();
			} else if (client.loop >= local20.anInt3665) {
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
		if ((Static4.tileFlags[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static4.tileFlags[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method4328() {
		@Pc(31) String local31;
		if (Static2.anInt1334 == 1 && Static7.anInt5634 < 2) {
			local31 = LocalisedText.USE + LocalisedText.MINISEPARATOR + Static7.aString365 + " ->";
		} else if (Static3.aBoolean177 && Static7.anInt5634 < 2) {
			local31 = Static4.aString140 + LocalisedText.MINISEPARATOR + Static2.aString81 + " ->";
		} else if (Static2.aBoolean68 && Keyboard.pressedKeys[81] && Static7.anInt5634 > 2) {
			local31 = Static26.method2992(Static7.anInt5634 - 2);
		} else {
			local31 = Static26.method2992(Static7.anInt5634 - 1);
		}
		if (Static7.anInt5634 > 2) {
			local31 = local31 + "<col=ffffff> / " + (Static7.anInt5634 - 2) + LocalisedText.MOREOPTIONS;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!fg;Lclient!ho;)V")
	public static void method4329(@OriginalArg(1) Class4_Sub3_Sub7 arg0, @OriginalArg(2) MelType arg1) {
		@Pc(5) SoftwareIndexedSprite local5 = arg1.method1808();
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
		if ((Mouse.x <= local27 - local224 || local27 + local224 <= Mouse.x || Mouse.y <= local30 - local224 || Mouse.y >= local30 + local224) && (Mouse.x <= local218 || local226 <= Mouse.x || local220 >= Mouse.y || Mouse.y >= local252)) {
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
		Protocol.outboundBuffer.position = 0;
		Protocol.outboundBuffer.writeByte(20);
		Protocol.outboundBuffer.writeByte(arg3);
		Protocol.outboundBuffer.writeByte(arg2);
		Protocol.outboundBuffer.writeShort(arg0);
		Protocol.outboundBuffer.writeShort(arg1);
		Static2.anInt1213 = 0;
		Static6.anInt4759 = 1;
		Static6.anInt5173 = -3;
		Static4.anInt3409 = 0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!wf;IIIII)V")
	public static void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) MelType local10 = MelTypeList.get(arg3);
		if (local10 == null || !local10.aBoolean155 || !local10.method1810()) {
			return;
		}
		if (local10.anIntArray188 != null) {
			@Pc(32) int[] local32 = new int[local10.anIntArray188.length];
			for (@Pc(34) int local34 = 0; local34 < local32.length / 2; local34++) {
				@Pc(48) int local48 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
				@Pc(52) int local52 = MathUtils.COSINE[local48];
				local52 = local52 * 256 / (Static6.anInt4761 + 256);
				@Pc(64) int local64 = MathUtils.SINE[local48];
				local64 = local64 * 256 / (Static6.anInt4761 + 256);
				local32[local34 * 2] = arg2 + arg1.anInt5893 / 2 + ((arg5 + local10.anIntArray188[local34 * 2 + 1] * 4) * local64 + local52 * (arg4 + local10.anIntArray188[local34 * 2] * 4) >> 16);
				local32[local34 * 2 + 1] = arg0 + arg1.anInt5949 / 2 - (local52 * (arg5 + local10.anIntArray188[local34 * 2 + 1] * 4) - local64 * (arg4 + local10.anIntArray188[local34 * 2] * 4) >> 16);
			}
			if (GlRenderer.enabled) {
				Static18.method1738(local32, local10.anInt2283, local10.anInt2283 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			} else {
				Static17.method1630(local32, local10.anInt2283, local10.anInt2283 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			}
			for (@Pc(195) int local195 = 0; local195 < local32.length / 2 - 1; local195++) {
				if (GlRenderer.enabled) {
					Static18.method1689(local32[local195 * 2], local32[local195 * 2 + 1], local32[(local195 + 1) * 2], local32[local195 * 2 + 1 + 2], local10.anInt2266, local10.anInt2266 >>> 24, (GlSprite) arg1.method4729(false));
				} else {
					Static34.method4219(local32[local195 * 2], local32[local195 * 2 + 1], local32[local195 * 2 + 2], local32[local195 * 2 + 3], local10.anInt2266, local10.anInt2266 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
				}
			}
			if (GlRenderer.enabled) {
				Static18.method1689(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anInt2266, local10.anInt2266 >>> 24, (GlSprite) arg1.method4729(false));
			} else {
				Static34.method4219(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anInt2266, local10.anInt2266 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			}
		}
		@Pc(356) IndexedSprite local356 = null;
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

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)V")
	public static void method4363() {
		Static2.anIntArray97 = Static8.method12(0.4F);
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
				if (Protocol.socket != null) {
					Protocol.socket.close();
					Protocol.socket = null;
				}
				if (Static4.anInt3409 >= 1) {
					Static6.anInt5173 = -5;
					Static6.anInt4759 = 0;
					return;
				}
				Static2.anInt1213 = 0;
				Static6.anInt4759 = 1;
				Static4.anInt3409++;
				if (client.port == client.defaultPort) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
			}
			if (Static6.anInt4759 == 1) {
				Static7.aClass197_5 = GameShell.signLink.openSocket(client.hostname, client.port);
				Static6.anInt4759 = 2;
			}
			if (Static6.anInt4759 == 2) {
				if (Static7.aClass197_5.status == 2) {
					throw new IOException();
				}
				if (Static7.aClass197_5.status != 1) {
					return;
				}
				Protocol.socket = new BufferedSocket((Socket) Static7.aClass197_5.result, GameShell.signLink);
				Static7.aClass197_5 = null;
				Protocol.socket.write(Protocol.outboundBuffer.bytes, Protocol.outboundBuffer.position);
				if (client.musicChannel != null) {
					client.musicChannel.method2996();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method2996();
				}
				@Pc(129) int local129 = Protocol.socket.read();
				if (client.musicChannel != null) {
					client.musicChannel.method2996();
				}
				if (client.soundChannel != null) {
					client.soundChannel.method2996();
				}
				if (local129 != 21) {
					Static6.anInt5173 = local129;
					Static6.anInt4759 = 0;
					Protocol.socket.close();
					Protocol.socket = null;
					return;
				}
				Static6.anInt4759 = 3;
			}
			if (Static6.anInt4759 == 3) {
				if (Protocol.socket.available() < 1) {
					return;
				}
				Static2.aStringArray8 = new String[Protocol.socket.read()];
				Static6.anInt4759 = 4;
			}
			if (Static6.anInt4759 == 4) {
				if (Protocol.socket.available() < Static2.aStringArray8.length * 8) {
					return;
				}
				Protocol.inboundBuffer.position = 0;
				Protocol.socket.read(Protocol.inboundBuffer.bytes, 0, Static2.aStringArray8.length * 8);
				for (@Pc(199) int local199 = 0; local199 < Static2.aStringArray8.length; local199++) {
					Static2.aStringArray8[local199] = Base37.decodeLowerCase(Protocol.inboundBuffer.readLong());
				}
				Static6.anInt4759 = 0;
				Static6.anInt5173 = 21;
				Protocol.socket.close();
				Protocol.socket = null;
				return;
			}
		} catch (@Pc(226) IOException local226) {
			if (Protocol.socket != null) {
				Protocol.socket.close();
				Protocol.socket = null;
			}
			if (Static4.anInt3409 >= 1) {
				Static6.anInt4759 = 0;
				Static6.anInt5173 = -4;
			} else {
				Static2.anInt1213 = 0;
				Static6.anInt4759 = 1;
				if (client.port == client.defaultPort) {
					client.port = client.alternatePort;
				} else {
					client.port = client.defaultPort;
				}
				Static4.anInt3409++;
			}
		}
	}

}

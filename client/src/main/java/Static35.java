import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

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
		ParticleManager.redraw((long) client.loop);
		if (InterfaceList.topLevelInterface != -1) {
			Static27.method4243(InterfaceList.topLevelInterface);
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
		if (InterfaceList.topLevelInterface != -1) {
			Static1.anInt113 = 0;
			Static16.method1563();
		}
		if (GlRenderer.enabled) {
			GlRaster.resetClip();
		} else {
			SoftwareRaster.resetClip();
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
		if (Static1.rectDebug == 3) {
			for (@Pc(211) int local211 = 0; local211 < Static1.anInt113; local211++) {
				if (Static1.aBooleanArray2[local211]) {
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711935, 128);
					} else {
						SoftwareRaster.fillRectAlpha(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711935, 128);
					}
				} else if (Static6.aBooleanArray24[local211]) {
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711680, 128);
					} else {
						SoftwareRaster.fillRectAlpha(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711680, 128);
					}
				}
			}
		}
		AreaSoundManager.redraw(Player.level, PlayerList.self.xFine, PlayerList.self.zFine, Static5.anInt4156);
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
			GlRaster.setClip(arg3, arg1, arg0.width + arg3, arg1 + arg0.height);
		}
		if (Static5.anInt5206 >= 3) {
			if (GlRenderer.enabled) {
				@Pc(41) Sprite local41 = arg0.method4729(false);
				if (local41 != null) {
					local41.renderTransparent(arg3, arg1);
				}
			} else {
				SoftwareRaster.method4210(arg3, arg1, arg0.anIntArray672, arg0.anIntArray657);
			}
		} else if (GlRenderer.enabled) {
			((GlSprite) Sprites.compass).renderRotatedTransparent(arg3, arg1, arg0.width, arg0.height, Sprites.compass.width / 2, Sprites.compass.height / 2, (int) Static5.aFloat97, 256, (GlSprite) arg0.method4729(false));
		} else {
			((SoftwareSprite) Sprites.compass).method2165(arg3, arg1, arg0.width, arg0.height, Sprites.compass.width / 2, Sprites.compass.height / 2, (int) Static5.aFloat97, arg0.anIntArray672, arg0.anIntArray657);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local46.getSize(), local46.getSize(), 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local146.getSize(), local146.getSize(), 0, 0);
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
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local346.getSize(), local346.getSize(), 0, 0);
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
				Static27.method3186(Player.level, local15, local19);
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
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local582.getSize(), local582.getSize(), 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local649.getSize(), local649.getSize(), 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local744.getSize(), local744.getSize(), 0, 0);
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
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local969.getSize(), local969.getSize(), 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local1044.getSize(), local1044.getSize(), 0, 0);
			}
		}
		if (local28 == 47) {
			if (local24 == 0) {
				Static6.anInt4946 = 1;
				Static27.method3186(Player.level, local15, local19);
			} else if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[82] && Keyboard.pressedKeys[81]) {
				Static24.method2945(Static5.originX + local15, Static7.originZ + local19, Player.level);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local1170.getSize(), local1170.getSize(), 0, 0);
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
			Static6.aClass185_14 = InterfaceList.getCreatedComponent(local19, local15);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local1354.getSize(), local1354.getSize(), 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local1545.getSize(), local1545.getSize(), 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local1728.getSize(), local1728.getSize(), 0, 0);
			}
		}
		if (local28 == 26) {
			if (local24 == 0) {
				Static27.method3186(Player.level, local15, local19);
			} else if (local24 == 1) {
				if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[82] && Keyboard.pressedKeys[81]) {
					Static24.method2945(local15 + Static5.originX, local19 + Static7.originZ, Player.level);
				} else {
					Static37.method4661(local15, 1, local19);
					Protocol.outboundBuffer.writeByte(Static2.anInt1941);
					Protocol.outboundBuffer.writeByte(Static7.anInt5798);
					Protocol.outboundBuffer.writeShort((int) Static5.aFloat97);
					Protocol.outboundBuffer.writeByte(57);
					Protocol.outboundBuffer.writeByte(Static6.anInt3585);
					Protocol.outboundBuffer.writeByte(Static6.anInt4761);
					Protocol.outboundBuffer.writeByte(89);
					Protocol.outboundBuffer.writeShort(PlayerList.self.xFine);
					Protocol.outboundBuffer.writeShort(PlayerList.self.zFine);
					Protocol.outboundBuffer.writeByte(Static2.anInt946);
					Protocol.outboundBuffer.writeByte(63);
					PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
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
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local2053.getSize(), local2053.getSize(), 0, 0);
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
			@Pc(2187) Component local2187 = InterfaceList.getCreatedComponent(local19, local15);
			if (local2187 != null) {
				Static26.method4812();
				@Pc(2195) ServerActiveProperties local2195 = InterfaceList.getServerActiveProperties(local2187);
				Static21.method2081(local2195.getTargetMask(), local2195.targetParam, local2187.anInt5890, local15, local2187.anInt5930, local19);
				Static2.anInt1334 = 0;
				Static4.aString140 = Static12.method780(local2187);
				if (Static4.aString140 == null) {
					Static4.aString140 = "Null";
				}
				if (local2187.if3) {
					Static2.aString81 = local2187.opBase + "<col=ffffff>";
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local2321.getSize(), local2321.getSize(), 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local2423.getSize(), local2423.getSize(), 0, 0);
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
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
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
				if (local2665.multiNpcs != null) {
					local2665 = local2665.getMultiNpc();
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
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local3012.getSize(), local3012.getSize(), 0, 0);
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
				PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, local3080.getSize(), local3080.getSize(), 0, 0);
			}
		}
		if (local28 == 1001) {
			@Pc(3148) Component local3148 = InterfaceList.getComponent(local19);
			if (local3148 == null || local3148.objCounts[local15] < 100000) {
				Protocol.outboundBuffer.writeOpcode(72);
				Protocol.outboundBuffer.writeShort(local24);
			} else {
				Chat.add(0, "", local3148.objCounts[local15] + " x " + ObjTypeList.get(local24).name);
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
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], local15, local19, 0, 0, 0, 0, 0);
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

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	public static void method4321() {
		for (@Pc(14) SpotAnimNode local14 = (SpotAnimNode) Static2.aClass112_8.head(); local14 != null; local14 = (SpotAnimNode) Static2.aClass112_8.next()) {
			@Pc(20) SpotAnim local20 = local14.value;
			if (local20.anInt3655 != Player.level || local20.aBoolean265) {
				local14.unlink();
			} else if (client.loop >= local20.anInt3665) {
				local20.method3058(Static5.anInt4156);
				if (local20.aBoolean265) {
					local14.unlink();
				} else {
					SceneGraph.method637(local20.anInt3655, local20.anInt3647, local20.anInt3653, local20.anInt3648, 60, local20, 0, -1L, false);
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
		} else if (Static2.shiftClick && Keyboard.pressedKeys[81] && Static7.anInt5634 > 2) {
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
	public static void method4329(@OriginalArg(1) MapElement element, @OriginalArg(2) MelType type) {
		@Pc(5) SoftwareIndexedSprite sprite = type.method1808();
		if (sprite == null) {
			return;
		}
		@Pc(16) int size = sprite.width;
		if (sprite.height > sprite.width) {
			size = sprite.height;
		}
		@Pc(27) int local27 = element.xOffset;
		@Pc(30) int local30 = element.yOffset;
		@Pc(32) int textLines = 0;
		@Pc(34) int textWidth = 0;
		@Pc(36) int textHeight = 0;
		if (type.text != null) {
			textLines = Fonts.p11Full.splitParagraph(type.text, Static5.aStringArray24, null);
			for (@Pc(49) int i = 0; i < textLines; i++) {
				@Pc(56) String line = Static5.aStringArray24[i];
				if (textLines - 1 > i) {
					line = line.substring(0, line.length() - 4);
				}
				@Pc(77) int lineWidth = WorldMap.font14.getStringWidth(line);
				if (lineWidth > textWidth) {
					textWidth = lineWidth;
				}
			}
			textHeight = (textLines - 1) * WorldMap.font14.method2332() + WorldMap.font14.method2328() / 2;
		}
		@Pc(105) int local105 = element.xOffset;
		if (Static3.anInt2969 + size > local27) {
			local27 = size + Static3.anInt2969;
			local105 = textWidth / 2 + size / 2 + Static3.anInt2969 + size + 5;
		} else if (Static3.anInt2970 - size < local27) {
			local105 = Static3.anInt2970 - size - size / 2 - textWidth / 2 - 5;
			local27 = Static3.anInt2970 - size;
		}
		@Pc(167) int local167 = element.yOffset - textHeight / 2;
		if (local30 < size + Static3.anInt2968) {
			local30 = Static3.anInt2968 + size;
			local167 = size / 2 + size + Static3.anInt2968 + WorldMap.font14.method2332();
		} else if (Static3.anInt2971 - size < local30) {
			local167 = Static3.anInt2971 - size - size / 2 - textHeight;
			local30 = Static3.anInt2971 - size;
		}
		@Pc(218) int local218 = -2;
		@Pc(220) int local220 = -2;
		@Pc(224) int local224 = size >> 1;
		@Pc(226) int local226 = -2;
		@Pc(250) int local250 = (int) (Math.atan2(local27 - element.xOffset, local30 - element.yOffset) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		@Pc(252) int local252 = -2;
		sprite.method1314(sprite.innerWidth << 3, sprite.innerHeight << 3, local224 + (local27 << 4), local224 + (local30 << 4), local250);
		if (type.text != null) {
			local220 = local167 - WorldMap.font14.method2328() - 3;
			local218 = local105 - textWidth / 2 - 5;
			local252 = textLines * WorldMap.font14.method2332() + local220;
			local226 = textWidth + local218 + 10;
			if (type.fillColor != 0) {
				SoftwareRaster.fillRectAlpha(local218, local220, local226 - local218, local252 - local220, type.fillColor, type.fillColor >>> 24);
			}
			if (type.outlineColor != 0) {
				SoftwareRaster.drawRectAlpha(local218, local220, local226 - local218, local252 - local220, type.outlineColor, type.outlineColor >>> 24);
			}
			for (@Pc(353) int i = 0; i < textLines; i++) {
				@Pc(364) String line = Static5.aStringArray24[i];
				if (i < textLines - 1) {
					line = line.substring(0, line.length() - 4);
				}
				WorldMap.font14.renderStringCenter(line, local105, local167, type.textColor);
				local167 += WorldMap.font14.method2332();
			}
		}
		if ((Mouse.x <= local27 - local224 || local27 + local224 <= Mouse.x || Mouse.y <= local30 - local224 || Mouse.y >= local30 + local224) && (Mouse.x <= local218 || local226 <= Mouse.x || local220 >= Mouse.y || Mouse.y >= local252)) {
			return;
		}
		if (type.ops[4] != null) {
			Static16.method1497(element.id, 0, 0, type.opBase, type.ops[4], (short) 1011, -1);
		}
		if (type.ops[3] != null) {
			Static16.method1497(element.id, 0, 0, type.opBase, type.ops[3], (short) 1003, -1);
		}
		if (type.ops[2] != null) {
			Static16.method1497(element.id, 0, 0, type.opBase, type.ops[2], (short) 1008, -1);
		}
		if (type.ops[1] != null) {
			Static16.method1497(element.id, 0, 0, type.opBase, type.ops[1], (short) 1002, -1);
		}
		if (type.ops[0] != null) {
			Static16.method1497(element.id, 0, 0, type.opBase, type.ops[0], (short) 1012, -1);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZIIII)V")
	public static void setWindowMode(@OriginalArg(0) boolean replaceCanvas, @OriginalArg(2) int mode, @OriginalArg(3) int width, @OriginalArg(4) int height) {
		@Pc(5) boolean local5 = false;
		Static1.aLong15 = 0L;
		@Pc(15) int local15 = Static11.getWindowMode();
		if (local15 > 0 == mode <= 0) {
			local5 = true;
		}
		if (mode == 3 || local15 == 3) {
			replaceCanvas = true;
		}
		if (replaceCanvas && mode > 0) {
			local5 = true;
		}
		Static24.setWindowMode(width, local15, replaceCanvas, height, mode, local5);
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

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!wf;IIIII)V")
	public static void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) MelType local10 = MelTypeList.get(arg3);
		if (local10 == null || !local10.miniMapVisible || !local10.method1810()) {
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
				local32[local34 * 2] = arg2 + arg1.width / 2 + ((arg5 + local10.anIntArray188[local34 * 2 + 1] * 4) * local64 + local52 * (arg4 + local10.anIntArray188[local34 * 2] * 4) >> 16);
				local32[local34 * 2 + 1] = arg0 + arg1.height / 2 - (local52 * (arg5 + local10.anIntArray188[local34 * 2 + 1] * 4) - local64 * (arg4 + local10.anIntArray188[local34 * 2] * 4) >> 16);
			}
			if (GlRenderer.enabled) {
				Static18.method1738(local32, local10.anInt2283, local10.anInt2283 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			} else {
				Static17.method1630(local32, local10.anInt2283, local10.anInt2283 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			}
			for (@Pc(195) int local195 = 0; local195 < local32.length / 2 - 1; local195++) {
				if (GlRenderer.enabled) {
					GlRaster.drawRectMaskedAlpha(local32[local195 * 2], local32[local195 * 2 + 1], local32[(local195 + 1) * 2], local32[local195 * 2 + 1 + 2], local10.anInt2266, local10.anInt2266 >>> 24, (GlSprite) arg1.method4729(false));
				} else {
					SoftwareRaster.drawRectMaskedAlpha(local32[local195 * 2], local32[local195 * 2 + 1], local32[local195 * 2 + 2], local32[local195 * 2 + 3], local10.anInt2266, local10.anInt2266 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
				}
			}
			if (GlRenderer.enabled) {
				GlRaster.drawRectMaskedAlpha(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anInt2266, local10.anInt2266 >>> 24, (GlSprite) arg1.method4729(false));
			} else {
				SoftwareRaster.drawRectMaskedAlpha(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anInt2266, local10.anInt2266 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			}
		}
		@Pc(356) IndexedSprite local356 = null;
		if (local10.sprite != -1) {
			local356 = local10.method1811(false, false);
			if (local356 != null) {
				Static31.method3780(local356, arg2, arg1, arg4, arg5, arg0);
			}
		}
		if (local10.text == null) {
			return;
		}
		@Pc(384) int local384 = 0;
		@Pc(386) Font local386 = Fonts.p11Full;
		if (local10.textSize == 1) {
			local386 = Fonts.p12Full;
		}
		if (local10.textSize == 2) {
			local386 = Fonts.b12Full;
		}
		if (local356 != null) {
			local384 = local356.height;
		}
		Static9.method194(local10.textColor, local10.text, arg0, arg5, arg2, arg4, local384, local386, arg1);
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

}

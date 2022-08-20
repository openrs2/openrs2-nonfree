import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	public static void method3252() {
		if (Camera.pitch < 128.0F) {
			Camera.pitch = 128.0F;
		}
		@Pc(12) int local12 = Static7.anInt5412 >> 7;
		if (Camera.pitch > 383.0F) {
			Camera.pitch = 383.0F;
		}
		while (Camera.yaw >= 2048.0F) {
			Camera.yaw -= 2048.0F;
		}
		@Pc(33) int local33 = Static3.anInt2496 >> 7;
		@Pc(35) int local35 = 0;
		while (Camera.yaw < 0.0F) {
			Camera.yaw += 2048.0F;
		}
		@Pc(63) int local63 = SceneGraph.getTileHeight(Player.level, Static7.anInt5412, Static3.anInt2496);
		if (local12 > 3 && local33 > 3 && local12 < 100 && local33 < 100) {
			for (@Pc(85) int local85 = local12 - 4; local85 <= local12 + 4; local85++) {
				for (@Pc(98) int local98 = local33 - 4; local98 <= local33 + 4; local98++) {
					@Pc(109) int local109 = Player.level;
					if (local109 < 3 && (Static4.tileFlags[1][local85][local98] & 0x2) == 2) {
						local109++;
					}
					@Pc(148) int local148 = local63 + (SceneGraph.aByteArrayArrayArray16[local109][local85][local98] & 0xFF) * 8 - SceneGraph.tileHeights[local109][local85][local98];
					if (local148 > local35) {
						local35 = local148;
					}
				}
			}
		}
		@Pc(163) int local163 = local35 * 192;
		if (local163 > 98048) {
			local163 = 98048;
		}
		if (local163 < 32768) {
			local163 = 32768;
		}
		if (local163 > Static1.anInt626) {
			Static1.anInt626 += (local163 - Static1.anInt626) / 24;
		} else if (Static1.anInt626 > local163) {
			Static1.anInt626 += (local163 - Static1.anInt626) / 80;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!wf;)V")
	public static void method3270(@OriginalArg(1) Component component) {
		if (component.rectangleLoop == Static3.anInt2522) {
			Static2.aBooleanArray8[component.rectangle] = true;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIB)V")
	public static void method3277(@OriginalArg(0) int id, @OriginalArg(1) int arg1) {
		if (InterfaceList.load(id)) {
			Static29.method3480(InterfaceList.components[id], arg1);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III[B)Z")
	public static boolean isLocFileReady(@OriginalArg(1) int mapZ, @OriginalArg(2) int mapX, @OriginalArg(3) byte[] bytes) {
		@Pc(7) boolean ready = true;
		@Pc(12) Buffer buffer = new Buffer(bytes);
		@Pc(14) int locId = -1;
		label55:
		while (true) {
			@Pc(18) int locIdDelta = buffer.readUnsignedMultiSmart();
			if (locIdDelta == 0) {
				return ready;
			}
			locId += locIdDelta;
			@Pc(26) int position = 0;
			@Pc(28) boolean end = false;
			while (true) {
				while (!end) {
					@Pc(47) int positionDelta = buffer.readUnsignedShortSmart();
					if (positionDelta == 0) {
						continue label55;
					}
					position += positionDelta - 1;
					@Pc(62) int dx = position >> 6 & 0x3F;
					@Pc(68) int shape = buffer.readUnsignedByte() >> 2;
					@Pc(72) int x = mapX + dx;
					@Pc(76) int dz = position & 0x3F;
					@Pc(80) int z = mapZ + dz;
					if (x > 0 && z > 0 && x < 103 && z < 103) {
						@Pc(102) LocType locType = LocTypeList.get(locId);
						if (shape != 22 || Preferences.groundDecoration || locType.interactivity != 0 || locType.blockWalk == 1 || locType.forceDecor) {
							end = true;
							if (!locType.isReady()) {
								ready = false;
								Static7.anInt5486++;
							}
						}
					}
				}
				@Pc(34) int positionDelta2 = buffer.readUnsignedShortSmart();
				if (positionDelta2 == 0) {
					break;
				}
				buffer.readUnsignedByte();
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method3322() {
		Static27.setBuildArea(Preferences.buildArea);
		@Pc(17) int local17 = (Static3.anInt2519 >> 10) + (Static5.originX >> 3);
		@Pc(25) int local25 = (Static7.originZ >> 3) + (Static7.anInt5678 >> 10);
		Static1.mapBytes = new byte[18][];
		Static3.mapGroupIds = new int[18];
		Static7.underwaterMapBytes = new byte[18][];
		Static6.npcGroupIds = new int[18];
		Static1.locGroupIds = new int[18];
		Static7.npcBytes = new byte[18][];
		Static4.underwaterMapGroupIds = new int[18];
		Static1.underwaterLocBytes = new byte[18][];
		Static7.mapSquares = new int[18];
		Static5.xteaKeys = new int[18][4];
		Static3.underwaterLocGroupIds = new int[18];
		Static5.locBytes = new byte[18][];
		@Pc(76) int i = 0;
		for (@Pc(82) int mapX = (local17 - 6) / 8; mapX <= (local17 + 6) / 8; mapX++) {
			for (@Pc(95) int mapZ = (local25 - 6) / 8; mapZ <= (local25 + 6) / 8; mapZ++) {
				@Pc(112) int mapSquare = (mapX << 8) + mapZ;
				Static7.mapSquares[i] = mapSquare;
				Static3.mapGroupIds[i] = client.js5Archive5.getGroupId("m" + mapX + "_" + mapZ);
				Static1.locGroupIds[i] = client.js5Archive5.getGroupId("l" + mapX + "_" + mapZ);
				Static6.npcGroupIds[i] = client.js5Archive5.getGroupId("n" + mapX + "_" + mapZ);
				Static4.underwaterMapGroupIds[i] = client.js5Archive5.getGroupId("um" + mapX + "_" + mapZ);
				Static3.underwaterLocGroupIds[i] = client.js5Archive5.getGroupId("ul" + mapX + "_" + mapZ);
				if (Static6.npcGroupIds[i] == -1) {
					Static3.mapGroupIds[i] = -1;
					Static1.locGroupIds[i] = -1;
					Static4.underwaterMapGroupIds[i] = -1;
					Static3.underwaterLocGroupIds[i] = -1;
				}
				i++;
			}
		}
		for (@Pc(238) int j = i; j < Static6.npcGroupIds.length; j++) {
			Static6.npcGroupIds[j] = -1;
			Static3.mapGroupIds[j] = -1;
			Static1.locGroupIds[j] = -1;
			Static4.underwaterMapGroupIds[j] = -1;
			Static3.underwaterLocGroupIds[j] = -1;
		}
		Static8.method2(true, local17, false, 8, 8, local25, 0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZI)V")
	public static void method3323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg4) {
			Static32.method4032(arg4, arg2, arg3, arg1);
		} else if (Static2.anInt902 <= arg1 - arg4 && Static3.anInt2553 >= arg1 + arg4 && arg3 - arg0 >= Static4.anInt3086 && Static5.anInt4230 >= arg3 + arg0) {
			Static19.method4379(arg0, arg1, arg2, arg3, arg4);
		} else {
			Static26.method4814(arg3, arg0, arg2, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZILclient!qc;)V")
	public static void method3325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) PathingEntity arg5) {
		Static29.method3482(arg0, arg4, arg1, arg5.xFine, arg5.zFine, arg2, arg3);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZ)V")
	public static void method3327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Cross.type == 1) {
			Sprites.cross[Cross.milliseconds / 100].renderTransparent(Cross.x - 8, Cross.y - 8);
		}
		if (Cross.type == 2) {
			Sprites.cross[Cross.milliseconds / 100 + 4].renderTransparent(Cross.x - 8, Cross.y - 8);
		}
		Player.setInTutorialIsland();
	}

}

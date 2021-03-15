import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIZIIII)V")
	public static void method2(@OriginalArg(0) boolean loginScreen, @OriginalArg(2) int zoneX, @OriginalArg(3) boolean buildAreaChanged, @OriginalArg(4) int localZ, @OriginalArg(5) int localX, @OriginalArg(6) int zoneZ, @OriginalArg(7) int level) {
		if (!buildAreaChanged && Static4.centralZoneX == zoneX && Static1.centralZoneZ == zoneZ && (Static2.anInt1216 == level || SceneGraph.isAllLevelsVisible())) {
			return;
		}
		Static1.centralZoneZ = zoneZ;
		Static2.anInt1216 = level;
		Static4.centralZoneX = zoneX;
		if (SceneGraph.isAllLevelsVisible()) {
			Static2.anInt1216 = 0;
		}
		if (loginScreen) {
			Static9.method233(28);
		} else {
			Static9.method233(25);
		}
		Static37.method4716(LocalisedText.LOADING, true);
		@Pc(57) int prevOriginX = Static5.originX;
		@Pc(59) int prevOriginZ = Static7.originZ;
		Static5.originX = zoneX * 8 - 48;
		Static7.originZ = zoneZ * 8 - 48;
		Static2.aClass4_Sub3_Sub22_1 = MapList.getContainingSource(Static4.centralZoneX * 8, Static1.centralZoneZ * 8);
		Static7.aClass138_14 = null;
		@Pc(90) int dz = Static7.originZ - prevOriginZ;
		@Pc(95) int dx = Static5.originX - prevOriginX;
		if (loginScreen) {
			NpcList.size = 0;
			for (@Pc(166) int i = 0; i < 32768; i++) {
				@Pc(175) Npc npc = NpcList.npcs[i];
				if (npc != null) {
					npc.zFine -= dz * 128;
					npc.xFine -= dx * 128;
					if (npc.xFine >= 0 && npc.xFine <= 13184 && npc.zFine >= 0 && npc.zFine <= 13184) {
						for (@Pc(226) int j = 0; j < 10; j++) {
							@Pc(233) int[] queue = npc.movementQueueX;
							queue[j] -= dx;
							queue = npc.movementQueueZ;
							queue[j] -= dz;
						}
						NpcList.ids[NpcList.size++] = i;
					} else {
						NpcList.npcs[i].setType(null);
						NpcList.npcs[i] = null;
					}
				}
			}
		} else {
			for (@Pc(103) int i = 0; i < 32768; i++) {
				@Pc(112) Npc npc = NpcList.npcs[i];
				if (npc != null) {
					for (@Pc(117) int j = 0; j < 10; j++) {
						@Pc(124) int[] queue = npc.movementQueueX;
						queue[j] -= dx;
						queue = npc.movementQueueZ;
						queue[j] -= dz;
					}
					npc.xFine -= dx * 128;
					npc.zFine -= dz * 128;
				}
			}
		}
		for (@Pc(263) int i = 0; i < 2048; i++) {
			@Pc(272) Player player = PlayerList.players[i];
			if (player != null) {
				for (@Pc(277) int j = 0; j < 10; j++) {
					@Pc(282) int[] queue = player.movementQueueX;
					queue[j] -= dx;
					queue = player.movementQueueZ;
					queue[j] -= dz;
				}
				player.zFine -= dz * 128;
				player.xFine -= dx * 128;
			}
		}
		@Pc(320) byte minDestX = 0;
		@Pc(322) byte xDirection = 1;
		@Pc(324) byte maxDestX = 104;
		if (dx < 0) {
			xDirection = -1;
			maxDestX = -1;
			minDestX = 103;
		}
		@Pc(337) byte minDestZ = 0;
		Player.level = level;
		@Pc(341) byte maxDestZ = 104;
		PlayerList.self.teleport(localX, localZ, false);
		@Pc(349) byte zDirection = 1;
		if (dz < 0) {
			maxDestZ = -1;
			zDirection = -1;
			minDestZ = 103;
		}
		for (@Pc(362) int destX = minDestX; destX != maxDestX; destX += xDirection) {
			for (@Pc(367) int destZ = minDestZ; destZ != maxDestZ; destZ += zDirection) {
				@Pc(374) int srcX = dx + destX;
				@Pc(379) int srcZ = destZ + dz;
				for (@Pc(381) int level0 = 0; level0 < 4; level0++) {
					if (srcX >= 0 && srcZ >= 0 && srcX < 104 && srcZ < 104) {
						Static4.objStacks[level0][destX][destZ] = Static4.objStacks[level0][srcX][srcZ];
					} else {
						Static4.objStacks[level0][destX][destZ] = null;
					}
				}
			}
		}
		for (@Pc(443) ChangeLocRequest loc = (ChangeLocRequest) ChangeLocRequest.queue.head(); loc != null; loc = (ChangeLocRequest) ChangeLocRequest.queue.next()) {
			loc.z -= dz;
			loc.x -= dx;
			if (loc.x < 0 || loc.z < 0 || loc.x >= 104 || loc.z >= 104) {
				loc.unlink();
			}
		}
		if (Static6.anInt4506 != 0) {
			Static3.anInt2140 -= dz;
			Static6.anInt4506 -= dx;
		}
		if (loginScreen) {
			Static7.anInt5678 -= dz * 128;
			Static4.anInt2977 -= dx;
			Static3.anInt2497 -= dz;
			Static4.anInt3302 -= dx;
			Static5.anInt4165 -= dz;
			Static3.anInt2519 -= dx * 128;
		} else {
			Static1.anInt772 = 1;
		}
		Static6.anInt4457 = 0;
		if (GlRenderer.enabled && loginScreen && (Math.abs(dx) > 104 || Math.abs(dz) > 104)) {
			Static17.method1655();
		}
		Static31.method3150();
		Static2.aClass112_8.clear();
		Static1.aClass112_1.clear();
		ParticleManager.clear();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method7(@OriginalArg(0) int op, @OriginalArg(2) String username) {
		@Pc(17) String local17 = Base37.toTitleCase(Base37.toLowerCase(username));
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int i = 0; i < PlayerList.size; i++) {
			@Pc(30) Player player = PlayerList.players[PlayerList.ids[i]];
			if (player != null && player.username != null && player.username.equalsIgnoreCase(local17)) {
				local19 = true;
				if (op == 1) {
					Protocol.outboundBuffer.writeOpcode(212);
					Protocol.outboundBuffer.writeShortA(PlayerList.ids[i]);
					Protocol.outboundBuffer.writeByteA(0);
				} else if (op == 4) {
					Protocol.outboundBuffer.writeOpcode(105);
					Protocol.outboundBuffer.writeShort(PlayerList.ids[i]);
					Protocol.outboundBuffer.writeByte(0);
				} else if (op == 5) {
					Protocol.outboundBuffer.writeOpcode(96);
					Protocol.outboundBuffer.writeByteA(0);
					Protocol.outboundBuffer.writeShort(PlayerList.ids[i]);
				} else if (op == 6) {
					Protocol.outboundBuffer.writeOpcode(77);
					Protocol.outboundBuffer.writeShortLE2(PlayerList.ids[i]);
					Protocol.outboundBuffer.writeByteS(0);
				} else if (op == 7) {
					Protocol.outboundBuffer.writeOpcode(52);
					Protocol.outboundBuffer.writeShort(PlayerList.ids[i]);
					Protocol.outboundBuffer.writeByte(0);
				}
				break;
			}
		}
		if (!local19) {
			Chat.add(0, "", LocalisedText.UNABLETOFIND + local17);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method8() {
		for (@Pc(11) int i = 0; i < NpcList.size; i++) {
			@Pc(18) int id = NpcList.ids[i];
			@Pc(22) Npc npc = NpcList.npcs[id];
			if (npc != null) {
				Static15.method1428(npc.type.size, npc);
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I")
	public static int method9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 >= arg0 ? (arg1 > arg2 ? arg2 : arg1) : arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void method11() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static3.aBooleanArray13[local3] = false;
		}
		Static5.anInt5195 = -1;
		Static1.anInt772 = 5;
		Static6.anInt4838 = 0;
		Static1.anInt212 = 0;
		Static4.anInt3024 = -1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
	public static void method66(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static1.anInt113; local3++) {
			if (arg2 < Static6.anIntArray540[local3] + Static5.anIntArray383[local3] && arg2 + arg0 > Static6.anIntArray540[local3] && Static7.anIntArray638[local3] + Static7.anIntArray616[local3] > arg3 && arg3 + arg1 > Static7.anIntArray638[local3]) {
				Static2.aBooleanArray8[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	public static void sortObjStack(@OriginalArg(0) int x, @OriginalArg(1) int z) {
		@Pc(17) LinkedList objStacks = Static4.objStacks[Player.level][x][z];
		if (objStacks == null) {
			SceneGraph.removeObjStack(Player.level, x, z);
			return;
		}
		@Pc(28) int maxCost = -99999999;
		@Pc(33) ObjStackNode node = (ObjStackNode) objStacks.head();
		@Pc(35) ObjStackNode maxNode = null;
		while (node != null) {
			@Pc(44) ObjType type = ObjTypeList.get(node.value.type);
			@Pc(47) int cost = type.cost;
			if (type.stackable == 1) {
				cost *= node.value.count + 1;
			}
			if (cost > maxCost) {
				maxCost = cost;
				maxNode = node;
			}
			node = (ObjStackNode) objStacks.next();
		}
		if (maxNode == null) {
			SceneGraph.removeObjStack(Player.level, x, z);
			return;
		}
		objStacks.addHead(maxNode);
		@Pc(100) ObjStackNode node2 = (ObjStackNode) objStacks.head();
		@Pc(102) ObjStack tertiary = null;
		@Pc(104) ObjStack secondary = null;
		while (node2 != null) {
			@Pc(110) ObjStack stack = node2.value;
			if (maxNode.value.type != stack.type) {
				if (secondary == null) {
					secondary = stack;
				}
				if (secondary.type != stack.type && tertiary == null) {
					tertiary = stack;
				}
			}
			node2 = (ObjStackNode) objStacks.next();
		}
		@Pc(155) long key = x + (z << 7) + 0x60000000;
		SceneGraph.setObjStack(Player.level, x, z, SceneGraph.method522(Player.level, x * 128 + 64, z * 128 + 64), maxNode.value, key, secondary, tertiary);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIBII)V")
	public static void method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static2.anInt902 <= arg4 - arg0 && arg0 + arg4 <= Static3.anInt2553 && arg2 - arg0 >= Static4.anInt3086 && Static5.anInt4230 >= arg0 + arg2) {
			Static10.method896(arg5, arg1, arg0, arg3, arg4, arg2);
		} else {
			Static14.method1082(arg0, arg5, arg4, arg1, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public static void method115() {
		Static5.anInt5206 = 0;
		Static1.aByte1 = 0;
		Static3.anInt2140 = 0;
		Static6.anInt4506 = 0;
		Static3.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ho;I)Z")
	public static boolean method120(@OriginalArg(0) MelType type) {
		if (type == null) {
			return false;
		} else if (!type.worldMapVisible) {
			return false;
		} else if (!type.method1810()) {
			return false;
		} else if (Static3.aClass84_10.get(type.id) == null) {
			return Static3.aClass84_9.get(type.category) == null;
		} else {
			return false;
		}
	}

}

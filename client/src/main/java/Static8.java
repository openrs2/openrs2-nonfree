import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIZIIII)V")
	public static void method2(@OriginalArg(0) boolean loginScreen, @OriginalArg(2) int zoneX, @OriginalArg(3) boolean buildAreaChanged, @OriginalArg(4) int localZ, @OriginalArg(5) int localX, @OriginalArg(6) int zoneZ, @OriginalArg(7) int y) {
		if (!buildAreaChanged && Static4.centralZoneX == zoneX && Static1.centralZoneZ == zoneZ && (Static2.anInt1216 == y || Terrain.isAllLevelsVisible())) {
			return;
		}
		Static1.centralZoneZ = zoneZ;
		Static2.anInt1216 = y;
		Static4.centralZoneX = zoneX;
		if (Terrain.isAllLevelsVisible()) {
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
		Static2.aClass4_Sub3_Sub22_1 = Static19.method2394(Static4.centralZoneX * 8, Static1.centralZoneZ * 8);
		Static7.aClass138_14 = null;
		@Pc(90) int dz = Static7.originZ - prevOriginZ;
		@Pc(95) int dx = Static5.originX - prevOriginX;
		if (loginScreen) {
			NpcList.size = 0;
			for (@Pc(166) int i = 0; i < 32768; i++) {
				@Pc(175) Npc npc = NpcList.npcs[i];
				if (npc != null) {
					npc.z -= dz * 128;
					npc.x -= dx * 128;
					if (npc.x >= 0 && npc.x <= 13184 && npc.z >= 0 && npc.z <= 13184) {
						for (@Pc(226) int j = 0; j < 10; j++) {
							@Pc(233) int[] local233 = npc.anIntArray422;
							local233[j] -= dx;
							local233 = npc.anIntArray426;
							local233[j] -= dz;
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
						@Pc(124) int[] local124 = npc.anIntArray422;
						local124[j] -= dx;
						local124 = npc.anIntArray426;
						local124[j] -= dz;
					}
					npc.x -= dx * 128;
					npc.z -= dz * 128;
				}
			}
		}
		for (@Pc(263) int i = 0; i < 2048; i++) {
			@Pc(272) Player player = PlayerList.players[i];
			if (player != null) {
				for (@Pc(277) int j = 0; j < 10; j++) {
					@Pc(282) int[] local282 = player.anIntArray422;
					local282[j] -= dx;
					local282 = player.anIntArray426;
					local282[j] -= dz;
				}
				player.z -= dz * 128;
				player.x -= dx * 128;
			}
		}
		@Pc(320) byte local320 = 0;
		@Pc(322) byte local322 = 1;
		@Pc(324) byte local324 = 104;
		if (dx < 0) {
			local322 = -1;
			local324 = -1;
			local320 = 103;
		}
		@Pc(337) byte local337 = 0;
		Static7.y = y;
		@Pc(341) byte local341 = 104;
		PlayerList.self.method1174(localZ, false, localX);
		@Pc(349) byte local349 = 1;
		if (dz < 0) {
			local341 = -1;
			local349 = -1;
			local337 = 103;
		}
		for (@Pc(362) int local362 = local320; local362 != local324; local362 += local322) {
			for (@Pc(367) int local367 = local337; local367 != local341; local367 += local349) {
				@Pc(374) int local374 = dx + local362;
				@Pc(379) int local379 = local367 + dz;
				for (@Pc(381) int local381 = 0; local381 < 4; local381++) {
					if (local374 >= 0 && local379 >= 0 && local374 < 104 && local379 < 104) {
						Static4.objStacks[local381][local362][local367] = Static4.objStacks[local381][local374][local379];
					} else {
						Static4.objStacks[local381][local362][local367] = null;
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

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method3() {
		Static6.anInterface2Array1 = null;
		Static19.method1858();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method7(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(17) String local17 = Static29.method3464(Static14.method1054(arg1));
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < PlayerList.size; local21++) {
			@Pc(30) Player local30 = PlayerList.players[PlayerList.ids[local21]];
			if (local30 != null && local30.name != null && local30.name.equalsIgnoreCase(local17)) {
				local19 = true;
				if (arg0 == 1) {
					Protocol.outboundBuffer.writeOpcode(212);
					Protocol.outboundBuffer.writeShortA(PlayerList.ids[local21]);
					Protocol.outboundBuffer.writeByteA(0);
				} else if (arg0 == 4) {
					Protocol.outboundBuffer.writeOpcode(105);
					Protocol.outboundBuffer.writeShort(PlayerList.ids[local21]);
					Protocol.outboundBuffer.writeByte(0);
				} else if (arg0 == 5) {
					Protocol.outboundBuffer.writeOpcode(96);
					Protocol.outboundBuffer.writeByteA(0);
					Protocol.outboundBuffer.writeShort(PlayerList.ids[local21]);
				} else if (arg0 == 6) {
					Protocol.outboundBuffer.writeOpcode(77);
					Protocol.outboundBuffer.writeShortLE2(PlayerList.ids[local21]);
					Protocol.outboundBuffer.writeByteS(0);
				} else if (arg0 == 7) {
					Protocol.outboundBuffer.writeOpcode(52);
					Protocol.outboundBuffer.writeShort(PlayerList.ids[local21]);
					Protocol.outboundBuffer.writeByte(0);
				}
				break;
			}
		}
		if (!local19) {
			Static26.method4357("", 0, LocalisedText.UNABLETOFIND + local17);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method8() {
		for (@Pc(11) int local11 = 0; local11 < NpcList.size; local11++) {
			@Pc(18) int local18 = NpcList.ids[local11];
			@Pc(22) Npc local22 = NpcList.npcs[local18];
			if (local22 != null) {
				Static15.method1428(local22.type.size, local22);
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

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIFIIZB)[I")
	public static int[] method12(@OriginalArg(3) float arg0) {
		@Pc(2) int[] local2 = new int[2048];
		@Pc(16) TextureOp34 local16 = new TextureOp34();
		local16.anInt2620 = (int) (arg0 * 4096.0F);
		local16.anInt2628 = 4;
		local16.aBoolean181 = true;
		local16.anInt2631 = 8;
		local16.anInt2621 = 35;
		local16.anInt2625 = 8;
		local16.postDecode();
		Static11.method524(2048, 1);
		local16.method2053(local2, 0);
		return local2;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
	public static void method66(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static1.anInt113; local3++) {
			if (arg2 < Static6.anIntArray540[local3] + Static5.anIntArray383[local3] && arg2 + arg0 > Static6.anIntArray540[local3] && Static7.anIntArray638[local3] + Static7.anIntArray616[local3] > arg3 && arg3 + arg1 > Static7.anIntArray638[local3]) {
				Static2.aBooleanArray8[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I")
	public static int method71(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static28.method3276(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	public static void method89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) LinkedList local17 = Static4.objStacks[Static7.y][arg0][arg1];
		if (local17 == null) {
			Static31.method3734(Static7.y, arg0, arg1);
			return;
		}
		@Pc(28) int local28 = -99999999;
		@Pc(33) ObjStackNode local33 = (ObjStackNode) local17.head();
		@Pc(35) ObjStackNode local35 = null;
		while (local33 != null) {
			@Pc(44) ObjType local44 = ObjTypeList.get(local33.value.type);
			@Pc(47) int local47 = local44.cost;
			if (local44.stackable == 1) {
				local47 *= local33.value.count + 1;
			}
			if (local47 > local28) {
				local28 = local47;
				local35 = local33;
			}
			local33 = (ObjStackNode) local17.next();
		}
		if (local35 == null) {
			Static31.method3734(Static7.y, arg0, arg1);
			return;
		}
		local17.addHead(local35);
		@Pc(100) ObjStackNode local100 = (ObjStackNode) local17.head();
		@Pc(102) ObjStack local102 = null;
		@Pc(104) ObjStack local104 = null;
		while (local100 != null) {
			@Pc(110) ObjStack local110 = local100.value;
			if (local35.value.type != local110.type) {
				if (local104 == null) {
					local104 = local110;
				}
				if (local104.type != local110.type && local102 == null) {
					local102 = local110;
				}
			}
			local100 = (ObjStackNode) local17.next();
		}
		@Pc(155) long local155 = (long) (arg0 + (arg1 << 7) + 1610612736);
		Static29.method3478(Static7.y, arg0, arg1, Static11.method522(arg1 * 128 + 64, arg0 * 128 + 64, Static7.y), local35.value, local155, local104, local102);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIBII)V")
	public static void method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static2.anInt902 <= arg4 - arg0 && arg0 + arg4 <= Static3.anInt2553 && arg2 - arg0 >= Static4.anInt3086 && Static5.anInt4230 >= arg0 + arg2) {
			Static10.method896(arg5, arg1, arg0, arg3, arg4, arg2);
		} else {
			Static14.method1082(arg0, arg5, arg4, arg1, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)[Lclient!vn;")
	public static SoftwareSprite[] method103() {
		@Pc(8) SoftwareSprite[] local8 = new SoftwareSprite[Static4.anInt2748];
		for (@Pc(10) int local10 = 0; local10 < Static4.anInt2748; local10++) {
			@Pc(21) int local21 = Static7.anIntArray643[local10] * Static3.anIntArray185[local10];
			@Pc(24) int[] local24 = new int[local21];
			@Pc(28) byte[] local28 = Static6.aByteArrayArray36[local10];
			for (@Pc(30) int local30 = 0; local30 < local21; local30++) {
				local24[local30] = Static2.anIntArray85[local28[local30] & 0xFF];
			}
			local8[local10] = new SoftwareSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[local10], Static5.anIntArray391[local10], Static3.anIntArray185[local10], Static7.anIntArray643[local10], local24);
		}
		Static37.method4670();
		return local8;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!fh;II)Lclient!ag;")
	public static Class7 method106(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.fetchFile(arg1, arg2);
		return local5 == null ? null : new Class7(new Buffer(local5));
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!vh;ILclient!p;ILclient!f;II)V")
	public static void method109(@OriginalArg(1) LocType arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Npc arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Player arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class4_Sub11 local9 = new Class4_Sub11();
		local9.anInt2126 = arg6;
		local9.anInt2113 = arg3 * 128;
		local9.anInt2124 = arg1 * 128;
		if (arg0 != null) {
			local9.anInt2116 = arg0.anInt5530;
			local9.anInt2119 = arg0.anInt5555;
			local9.anIntArray172 = arg0.anIntArray632;
			local9.anInt2127 = arg0.anInt5525;
			@Pc(156) int local156 = arg0.width;
			local9.anInt2123 = arg0.anInt5519 * 128;
			local9.aClass181_1 = arg0;
			@Pc(168) int local168 = arg0.length;
			if (arg5 == 1 || arg5 == 3) {
				local156 = arg0.length;
				local168 = arg0.width;
			}
			local9.anInt2117 = (local156 + arg1) * 128;
			local9.anInt2115 = arg0.anInt5521;
			local9.anInt2112 = (local168 + arg3) * 128;
			if (arg0.multiLocs != null) {
				local9.aBoolean146 = true;
				local9.method1652();
			}
			if (local9.anIntArray172 != null) {
				local9.anInt2125 = (int) ((double) (local9.anInt2116 - local9.anInt2119) * Math.random()) + local9.anInt2119;
			}
			Static1.aClass112_2.addTail(local9);
		} else if (arg2 != null) {
			local9.aClass53_Sub1_Sub2_1 = arg2;
			@Pc(86) NpcType local86 = arg2.type;
			if (local86.multiNpcs != null) {
				local9.aBoolean146 = true;
				local86 = local86.getMultiNpc();
			}
			if (local86 != null) {
				local9.anInt2117 = (local86.size + arg1) * 128;
				local9.anInt2112 = (local86.size + arg3) * 128;
				local9.anInt2115 = Static10.method395(arg2);
				local9.anInt2127 = local86.anInt5235;
				local9.anInt2123 = local86.anInt5249 * 128;
			}
			Static2.aClass112_9.addTail(local9);
		} else if (arg4 != null) {
			local9.aClass53_Sub1_Sub1_1 = arg4;
			local9.anInt2117 = (arg1 + arg4.getSize()) * 128;
			local9.anInt2112 = (arg4.getSize() + arg3) * 128;
			local9.anInt2115 = Static10.method396(arg4);
			local9.anInt2127 = arg4.soundVolume;
			local9.anInt2123 = arg4.soundRadius * 128;
			Static5.aClass84_18.put(Base37.encode(arg4.name), local9);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!fh;Lclient!fh;B)V")
	public static void method113(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		Static1.aClass4_Sub3_Sub5_1 = method121(arg0, arg1, Static2.anInt914);
		if (GlRenderer.enabled) {
			Static2.aClass4_Sub3_Sub5_Sub2_2 = Static22.method2194(arg1, Static2.anInt914, arg0);
		} else {
			Static2.aClass4_Sub3_Sub5_Sub2_2 = (SoftwareFont) Static1.aClass4_Sub3_Sub5_1;
		}
		Static5.aClass4_Sub3_Sub5_2 = method121(arg0, arg1, Static7.anInt6040);
		Static5.aClass4_Sub3_Sub5_3 = method121(arg0, arg1, Static4.anInt3309);
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
	public static boolean method120(@OriginalArg(0) MelType arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean154) {
			return false;
		} else if (!arg0.method1810()) {
			return false;
		} else if (Static3.aClass84_10.get((long) arg0.id) == null) {
			return Static3.aClass84_9.get((long) arg0.anInt2284) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!fh;Lclient!fh;III)Lclient!gl;")
	public static Font method121(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(3) int arg2) {
		return Static9.method197(arg0, arg2, 0) ? Static10.method304(arg1.fetchFile(arg2, 0)) : null;
	}

}

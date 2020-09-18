import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(B)V")
	public static void method1496() {
		if (Static5.anInt5195 == -1 || Static4.anInt3024 == -1) {
			return;
		}
		@Pc(24) int local24 = ((Static2.anInt1165 - Static7.anInt5946) * Static2.anInt915 >> 16) + Static7.anInt5946;
		@Pc(27) float[] local27 = new float[3];
		Static2.anInt915 += local24;
		if (Static2.anInt915 < 65535) {
			Static1.aBoolean35 = false;
			Static7.aBoolean388 = false;
		} else {
			Static2.anInt915 = 65535;
			if (Static7.aBoolean388) {
				Static1.aBoolean35 = false;
			} else {
				Static1.aBoolean35 = true;
			}
			Static7.aBoolean388 = true;
		}
		@Pc(65) float local65 = (float) Static2.anInt915 / 65535.0F;
		@Pc(69) int local69 = Static6.anInt4384 * 2;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			@Pc(86) int local86 = Static1.anIntArrayArrayArray1[Static5.anInt5195][local69][local71] * 3;
			@Pc(98) int local98 = Static1.anIntArrayArrayArray1[Static5.anInt5195][local69 + 1][local71] * 3;
			@Pc(131) int local131 = (Static1.anIntArrayArrayArray1[Static5.anInt5195][local69 + 2][local71] + Static1.anIntArrayArrayArray1[Static5.anInt5195][local69 + 2][local71] - Static1.anIntArrayArrayArray1[Static5.anInt5195][local69 + 3][local71]) * 3;
			@Pc(139) int local139 = Static1.anIntArrayArrayArray1[Static5.anInt5195][local69][local71];
			@Pc(143) int local143 = local98 - local86;
			@Pc(153) int local153 = local86 + local131 - local98 * 2;
			@Pc(170) int local170 = Static1.anIntArrayArrayArray1[Static5.anInt5195][local69 + 2][local71] + local98 - local131 - local139;
			local27[local71] = (float) local139 + ((float) local143 + ((float) local153 + (float) local170 * local65) * local65) * local65;
		}
		Static7.anInt5678 = (int) local27[2] - Static7.originZ * 128;
		Static2.anInt1931 = (int) local27[1] * -1;
		@Pc(213) float[] local213 = new float[3];
		Static3.anInt2519 = (int) local27[0] - Static5.originX * 128;
		@Pc(227) int local227 = Static1.anInt126 * 2;
		for (@Pc(229) int local229 = 0; local229 < 3; local229++) {
			@Pc(244) int local244 = Static1.anIntArrayArrayArray1[Static4.anInt3024][local227][local229] * 3;
			@Pc(256) int local256 = Static1.anIntArrayArrayArray1[Static4.anInt3024][local227 + 1][local229] * 3;
			@Pc(289) int local289 = (Static1.anIntArrayArrayArray1[Static4.anInt3024][local227 + 2][local229] + Static1.anIntArrayArrayArray1[Static4.anInt3024][local227 + 2][local229] - Static1.anIntArrayArrayArray1[Static4.anInt3024][local227 + 3][local229]) * 3;
			@Pc(297) int local297 = Static1.anIntArrayArrayArray1[Static4.anInt3024][local227][local229];
			@Pc(302) int local302 = local256 - local244;
			@Pc(320) int local320 = local256 + Static1.anIntArrayArrayArray1[Static4.anInt3024][local227 + 2][local229] - local289 - local297;
			@Pc(329) int local329 = local289 + local244 - local256 * 2;
			local213[local229] = local65 * ((local65 * (float) local320 + (float) local329) * local65 + (float) local302) + (float) local297;
		}
		@Pc(361) float local361 = local213[0] - local27[0];
		@Pc(369) float local369 = local213[2] - local27[2];
		@Pc(379) float local379 = (local213[1] - local27[1]) * -1.0F;
		@Pc(389) double local389 = Math.sqrt((double) (local361 * local361 + local369 * local369));
		Static1.aFloat15 = (float) Math.atan2((double) local379, local389);
		Static7.aFloat154 = -((float) Math.atan2((double) local361, (double) local369));
		Static5.anInt3656 = (int) ((double) Static7.aFloat154 * 325.949D) & 0x7FF;
		Static5.anInt4066 = (int) ((double) Static1.aFloat15 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(JIILjava/lang/String;Ljava/lang/String;SIB)V")
	public static void method1497(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) short arg5, @OriginalArg(6) int arg6) {
		if (Static1.aBoolean17 || Static7.anInt5634 >= 500) {
			return;
		}
		Static6.aStringArray30[Static7.anInt5634] = arg4;
		Static6.aStringArray27[Static7.anInt5634] = arg3;
		Static2.anIntArray160[Static7.anInt5634] = arg6 == -1 ? Static7.anInt6050 : arg6;
		Static6.aShortArray100[Static7.anInt5634] = arg5;
		Static4.aLongArray56[Static7.anInt5634] = arg0;
		Static2.anIntArray117[Static7.anInt5634] = arg1;
		Static6.anIntArray543[Static7.anInt5634] = arg2;
		Static7.anInt5634++;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	private static void method1498() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) int local13 = 0; local13 < 104; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 104; local18++) {
				if (Static9.method279(local7, local13, true, local18, Terrain.tiles)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V")
	public static void method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static2.anInt1334 == 0) {
			@Pc(14) int local14 = Static7.anInt5437;
			@Pc(16) int local16 = Static4.anInt3123;
			@Pc(18) int local18 = Static7.anInt6030;
			@Pc(30) int local30 = (local16 - local14) * (arg1 - arg3) / arg4 + local14;
			@Pc(32) int local32 = Static1.anInt403;
			@Pc(46) int local46 = local18 + (local32 - local18) * (arg5 - arg2) / arg0;
			if (Static3.aBoolean177 && (Static5.anInt3560 & 0x40) != 0) {
				@Pc(85) Component local85 = Static23.method2425(Static1.anInt1053, Static2.anInt1367);
				if (local85 == null) {
					Static26.method4812();
				} else {
					method1497(0L, local30, local46, " ->", Static4.aString140, (short) 19, Static6.anInt4466);
				}
			} else {
				if (client.game == 1) {
					method1497(0L, local30, local46, "", LocalisedText.FACEHERE, (short) 47, -1);
				}
				method1497(0L, local30, local46, "", Static5.aString236, (short) 26, -1);
			}
		}
		@Pc(103) long prevKey = -1L;
		for (@Pc(105) int i = 0; i < Static7.pickKeysSize; i++) {
			@Pc(112) long key = Static5.pickKeys[i];
			@Pc(117) int x = (int) key & 0x7F;
			@Pc(124) int z = (int) key >> 7 & 0x7F;
			@Pc(131) int id = Integer.MAX_VALUE & (int) (key >>> 32);
			@Pc(138) int pickType = (int) key >> 29 & 0x3;
			if (prevKey != key) {
				prevKey = key;
				if (pickType == 2 && Terrain.isPickKeyValid(Static7.y, x, z, key)) {
					@Pc(163) LocType type = LocTypeList.get(id);
					if (type.multiLocs != null) {
						type = type.getMultiLoc();
					}
					if (type == null) {
						continue;
					}
					if (Static2.anInt1334 == 1) {
						method1497(key, x, z, Static7.aString365 + " -> <col=00ffff>" + type.name, LocalisedText.USE, (short) 16, Static2.anInt1937);
					} else if (Static3.aBoolean177) {
						@Pc(215) ParamType param = Static5.anInt4224 == -1 ? null : ParamTypeList.get(Static5.anInt4224);
						if ((Static5.anInt3560 & 0x4) != 0 && (param == null || type.getParam(Static5.anInt4224, param.defaultInt) != param.defaultInt)) {
							method1497(key, x, z, Static2.aString81 + " -> <col=00ffff>" + type.name, Static4.aString140, (short) 4, Static6.anInt4466);
						}
					} else {
						@Pc(267) String[] ops = type.ops;
						if (Static5.aBoolean254) {
							ops = Static35.method4300(ops);
						}
						if (ops != null) {
							for (@Pc(278) int j = 4; j >= 0; j--) {
								if (ops[j] != null) {
									@Pc(294) short local294 = 0;
									if (j == 0) {
										local294 = 41;
									}
									if (j == 1) {
										local294 = 37;
									}
									if (j == 2) {
										local294 = 32;
									}
									if (j == 3) {
										local294 = 40;
									}
									if (j == 4) {
										local294 = 1005;
									}
									@Pc(327) int cursor = -1;
									if (j == type.cursor1Op) {
										cursor = type.cursor1;
									}
									if (j == type.cursor2Op) {
										cursor = type.cursor2;
									}
									method1497(key, x, z, "<col=00ffff>" + type.name, ops[j], local294, cursor);
								}
							}
						}
						method1497(type.id, x, z, "<col=00ffff>" + type.name, LocalisedText.EXAMINE, (short) 1007, Static3.anInt2232);
					}
				}
				if (pickType == 1) {
					@Pc(394) Npc npc = NpcList.npcs[id];
					if ((npc.type.size & 0x1) == 0 && (npc.x & 0x7F) == 0 && (npc.z & 0x7F) == 0 || (npc.type.size & 0x1) == 1 && (npc.x & 0x7F) == 64 && (npc.z & 0x7F) == 64) {
						@Pc(450) int local450 = npc.x - (npc.type.size - 1) * 64;
						@Pc(462) int local462 = npc.z + 64 - npc.type.size * 64;
						for (@Pc(464) int j = 0; j < NpcList.size; j++) {
							@Pc(477) Npc other = NpcList.npcs[NpcList.ids[j]];
							if (other != null && !other.aBoolean281 && other != npc && other.aBoolean282) {
								@Pc(501) int local501 = other.x - (other.type.size - 1) * 64;
								@Pc(512) int local512 = other.z - (other.type.size - 1) * 64;
								if (local501 >= local450 && other.type.size <= npc.type.size - (local501 - local450 >> 7) && local512 >= local462 && npc.type.size - (local512 - local462 >> 7) >= other.type.size) {
									Static33.method4152(other.type, z, NpcList.ids[j], x);
									other.aBoolean281 = true;
								}
							}
						}
						for (@Pc(568) int j = 0; j < PlayerList.size; j++) {
							@Pc(577) Player other = PlayerList.players[PlayerList.ids[j]];
							if (other != null && !other.aBoolean281 && other.aBoolean282) {
								@Pc(597) int local597 = other.x - (other.getSize() - 1) * 64;
								@Pc(609) int local609 = other.z - (other.getSize() - 1) * 64;
								if (local597 >= local450 && other.getSize() <= npc.type.size - (local597 - local450 >> 7) && local462 <= local609 && other.getSize() <= npc.type.size - (local609 - local462 >> 7)) {
									Static29.method3488(z, PlayerList.ids[j], other, x);
									other.aBoolean281 = true;
								}
							}
						}
					}
					if (npc.aBoolean281) {
						continue;
					}
					Static33.method4152(npc.type, z, id, x);
					npc.aBoolean281 = true;
				}
				if (pickType == 0) {
					@Pc(682) Player player = PlayerList.players[id];
					if ((player.x & 0x7F) == 64 && (player.z & 0x7F) == 64) {
						@Pc(709) int local709 = player.x - (player.getSize() - 1) * 64;
						@Pc(721) int local721 = player.z - (player.getSize() - 1) * 64;
						for (@Pc(723) int j = 0; j < NpcList.size; j++) {
							@Pc(736) Npc other = NpcList.npcs[NpcList.ids[j]];
							if (other != null && !other.aBoolean281 && other.aBoolean282) {
								@Pc(756) int local756 = other.x - (other.type.size - 1) * 64;
								@Pc(768) int local768 = other.z - (other.type.size - 1) * 64;
								if (local709 <= local756 && other.type.size <= player.getSize() - (local756 - local709 >> 7) && local721 <= local768 && other.type.size <= player.getSize() - (local768 - local721 >> 7)) {
									Static33.method4152(other.type, z, NpcList.ids[j], x);
									other.aBoolean281 = true;
								}
							}
						}
						for (@Pc(827) int j = 0; j < PlayerList.size; j++) {
							@Pc(840) Player other = PlayerList.players[PlayerList.ids[j]];
							if (other != null && !other.aBoolean281 && other != player && other.aBoolean282) {
								@Pc(865) int local865 = other.x - (other.getSize() - 1) * 64;
								@Pc(877) int local877 = other.z + 64 - other.getSize() * 64;
								if (local865 >= local709 && other.getSize() <= player.getSize() - (local865 - local709 >> 7) && local721 <= local877 && other.getSize() <= player.getSize() - (local877 - local721 >> 7)) {
									Static29.method3488(z, PlayerList.ids[j], other, x);
									other.aBoolean281 = true;
								}
							}
						}
					}
					if (player.aBoolean281) {
						continue;
					}
					Static29.method3488(z, id, player, x);
					player.aBoolean281 = true;
				}
				if (pickType == 3) {
					@Pc(952) LinkedList objStacks = Static4.objStacks[Static7.y][x][z];
					if (objStacks != null) {
						for (@Pc(960) ObjStackNode node = (ObjStackNode) objStacks.tail(); node != null; node = (ObjStackNode) objStacks.prev()) {
							@Pc(967) int objId = node.value.type;
							@Pc(971) ObjType type = ObjTypeList.get(objId);
							if (Static2.anInt1334 == 1) {
								method1497(objId, x, z, Static7.aString365 + " -> <col=ff9040>" + type.name, LocalisedText.USE, (short) 28, Static2.anInt1937);
							} else if (Static3.aBoolean177) {
								@Pc(986) ParamType param = Static5.anInt4224 == -1 ? null : ParamTypeList.get(Static5.anInt4224);
								if ((Static5.anInt3560 & 0x1) != 0 && (param == null || type.getParam(Static5.anInt4224, param.defaultInt) != param.defaultInt)) {
									method1497(objId, x, z, Static2.aString81 + " -> <col=ff9040>" + type.name, Static4.aString140, (short) 48, Static6.anInt4466);
								}
							} else {
								@Pc(1043) String[] ops = type.ops;
								if (Static5.aBoolean254) {
									ops = Static35.method4300(ops);
								}
								for (@Pc(1052) int j = 4; j >= 0; j--) {
									if (ops != null && ops[j] != null) {
										@Pc(1067) int cursor = -1;
										if (j == type.cursor1Op) {
											cursor = type.cursor1;
										}
										if (j == type.cursor2Op) {
											cursor = type.cursor2;
										}
										@Pc(1096) byte local1096 = 0;
										if (j == 0) {
											local1096 = 45;
										}
										if (j == 1) {
											local1096 = 46;
										}
										if (j == 2) {
											local1096 = 38;
										}
										if (j == 3) {
											local1096 = 6;
										}
										if (j == 4) {
											local1096 = 44;
										}
										method1497(objId, x, z, "<col=ff9040>" + type.name, ops[j], local1096, cursor);
									}
								}
								method1497(objId, x, z, "<col=ff9040>" + type.name, LocalisedText.EXAMINE, (short) 1004, Static3.anInt2232);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!fh;BII)[Lclient!fe;")
	public static SoftwareIndexedSprite[] method1523(@OriginalArg(0) Js5 arg0, @OriginalArg(3) int arg1) {
		return Static9.method197(arg0, arg1, 0) ? Static26.method4358() : null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([BB)Lclient!ke;")
	public static SoftwareFont method4658(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(24) SoftwareFont local24 = new SoftwareFont(arg0, Static5.anIntArray402, Static5.anIntArray391, Static3.anIntArray185, Static7.anIntArray643, Static6.aByteArrayArray36);
			Static37.method4670();
			return local24;
		}
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)Z")
	public static boolean method1550() {
		return Static5.anInt4357 == 0 ? Static1.aClass4_Sub6_Sub2_3.method2497() : true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[F")
	public static float[] method1553(@OriginalArg(1) int arg0) {
		@Pc(7) float local7 = Static25.method2773() + Static25.method2776();
		@Pc(9) int local9 = Static25.method2778();
		@Pc(18) float local18 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(31) float local31 = (float) (local9 & 0xFF) / 255.0F;
		Static4.aFloatArray64[3] = 1.0F;
		@Pc(44) float local44 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(46) float local46 = 0.58823526F;
		Static4.aFloatArray64[0] = local7 * local18 * ((float) (arg0 >> 16 & 0xFF) / 255.0F) * local46;
		Static4.aFloatArray64[2] = local31 * ((float) (arg0 & 0xFF) / 255.0F) * local46 * local7;
		Static4.aFloatArray64[1] = local44 * ((float) (arg0 >> 8 & 0xFF) / 255.0F) * local46 * local7;
		return Static4.aFloatArray64;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!fh;ILjava/lang/String;Z)Lclient!po;")
	public static Class138 method1555(@OriginalArg(0) Js5 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg0.getGroupId(arg1);
		if (local10 == -1) {
			return new Class138(0);
		}
		@Pc(23) int[] local23 = arg0.getFileIds(local10);
		@Pc(29) Class138 local29 = new Class138(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local29.anInt4219 > local31) {
				@Pc(59) Buffer local59 = new Buffer(arg0.fetchFile(local10, local23[local39++]));
				@Pc(63) int local63 = local59.readInt();
				@Pc(67) int local67 = local59.readUnsignedShort();
				@Pc(71) int local71 = local59.readUnsignedByte();
				if (!arg2 && local71 == 1) {
					local29.anInt4219--;
				} else {
					local29.anIntArray448[local31] = local63;
					local29.aClass4_Sub3_Sub7Array1[local31] = new Class4_Sub3_Sub7();
					local29.aClass4_Sub3_Sub7Array1[local31].anInt1760 = local67;
					local31++;
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method1556() {
		Static5.aClass56Array5 = null;
		Static2.aClass4_Sub3_Sub5_Sub2_2 = null;
		Static3.aClass56Array3 = null;
		Static2.aClass4_Sub3_Sub14Array6 = null;
		Static6.aClass4_Sub3_Sub14Array12 = null;
		Static5.aClass4_Sub3_Sub5_2 = null;
		Static6.aClass4_Sub3_Sub14Array11 = null;
		Static1.aClass4_Sub3_Sub14Array1 = null;
		Static5.aClass4_Sub3_Sub5_3 = null;
		Static3.aClass4_Sub3_Sub14Array8 = null;
		Static1.aClass4_Sub3_Sub5_1 = null;
		Static6.aClass4_Sub3_Sub14_6 = null;
		Static2.aClass4_Sub3_Sub14Array7 = null;
		Static2.aClass4_Sub3_Sub14Array9 = null;
		Static1.aClass4_Sub3_Sub14Array2 = null;
		Static1.aClass4_Sub3_Sub14Array3 = null;
		Static2.aClass4_Sub3_Sub14Array10 = null;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method1557() {
		Static10.method384(false);
		System.gc();
		Static9.method233(25);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
	public static void method1559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static1.anInt113; local11++) {
			if (Static5.anIntArray383[local11] + Static6.anIntArray540[local11] > arg0 && Static6.anIntArray540[local11] < arg0 + arg3 && arg1 < Static7.anIntArray638[local11] + Static7.anIntArray616[local11] && arg2 + arg1 > Static7.anIntArray638[local11]) {
				Static6.aBooleanArray24[local11] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!fd;)Lclient!wg;")
	public static Class4_Sub3_Sub22 method1562(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1) {
		@Pc(41) Class4_Sub3_Sub22 local41 = new Class4_Sub3_Sub22(arg0, arg1.readString(), arg1.readString(), arg1.readInt(), arg1.readInt(), arg1.readUnsignedByte() == 1, arg1.readUnsignedByte());
		@Pc(49) int local49 = arg1.readUnsignedByte();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local41.aClass112_31.addTail(new Class4_Sub7(arg1.readUnsignedByte(), arg1.readUnsignedByte(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort()));
		}
		local41.method4759();
		return local41;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method1563() {
		Static4.aClass185Array3 = null;
		Static14.method1069(Static3.anInt5398, 0, 0, 0, GameShell.canvasHeight, 0, GameShell.canvasWidth, -1);
		if (Static4.aClass185Array3 != null) {
			Static30.method3554(Static7.anInt5589, -1412584499, Static1.aClass185_2.anInt5967, Static4.aClass185Array3, GameShell.canvasHeight, GameShell.canvasWidth, 0, Static4.anInt3317, 0);
			Static4.aClass185Array3 = null;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	public static int method1565() {
		return 6;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	public static void method1576() {
		for (@Pc(7) int local7 = -1; local7 < PlayerList.size; local7++) {
			@Pc(20) int local20;
			if (local7 == -1) {
				local20 = 2047;
			} else {
				local20 = PlayerList.ids[local7];
			}
			@Pc(30) Player local30 = PlayerList.players[local20];
			if (local30 != null) {
				Static15.method1428(local30.getSize(), local30);
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public static void method2014() {
		@Pc(8) int local8 = Static11.method561();
		if (local8 == 0) {
			Static1.aByteArrayArrayArray2 = null;
			Static24.method2680(0);
		} else if (local8 == 1) {
			Static36.method4462((byte) 0);
			Static24.method2680(512);
			if (Static4.tileFlags != null) {
				method1498();
			}
		} else {
			Static36.method4462((byte) (Static2.anInt1997 - 4 & 0xFF));
			Static24.method2680(2);
		}
		Static6.anInt4709 = Static7.y;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
	public static void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static4.anInt3068 = Static5.aClass187ArrayArray1[arg0][arg1].anInt6035;
		Static7.anInt5363 = Static5.aClass187ArrayArray1[arg0][arg1].anInt6037;
		Static6.anInt5211 = Static5.aClass187ArrayArray1[arg0][arg1].anInt6033;
		Static25.method2775((float) Static4.anInt3068, (float) Static7.anInt5363, (float) Static6.anInt5211);
	}

}

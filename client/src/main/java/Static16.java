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
		@Pc(103) long local103 = -1L;
		for (@Pc(105) int local105 = 0; local105 < Static7.anInt5623; local105++) {
			@Pc(112) long local112 = Static5.aLongArray57[local105];
			@Pc(117) int local117 = (int) local112 & 0x7F;
			@Pc(124) int local124 = (int) local112 >> 7 & 0x7F;
			@Pc(131) int local131 = Integer.MAX_VALUE & (int) (local112 >>> 32);
			@Pc(138) int local138 = (int) local112 >> 29 & 0x3;
			if (local103 != local112) {
				local103 = local112;
				if (local138 == 2 && Static37.method4669(Static7.y, local117, local124, local112)) {
					@Pc(163) LocType local163 = LocTypeList.get(local131);
					if (local163.anIntArray631 != null) {
						local163 = local163.method4453();
					}
					if (local163 == null) {
						continue;
					}
					if (Static2.anInt1334 == 1) {
						method1497(local112, local117, local124, Static7.aString365 + " -> <col=00ffff>" + local163.name, LocalisedText.USE, (short) 16, Static2.anInt1937);
					} else if (Static3.aBoolean177) {
						@Pc(215) ParamType local215 = Static5.anInt4224 == -1 ? null : ParamTypeList.get(Static5.anInt4224);
						if ((Static5.anInt3560 & 0x4) != 0 && (local215 == null || local163.getParam(Static5.anInt4224, local215.defaultInt) != local215.defaultInt)) {
							method1497(local112, local117, local124, Static2.aString81 + " -> <col=00ffff>" + local163.name, Static4.aString140, (short) 4, Static6.anInt4466);
						}
					} else {
						@Pc(267) String[] local267 = local163.ops;
						if (Static5.aBoolean254) {
							local267 = Static35.method4300(local267);
						}
						if (local267 != null) {
							for (@Pc(278) int local278 = 4; local278 >= 0; local278--) {
								if (local267[local278] != null) {
									@Pc(294) short local294 = 0;
									if (local278 == 0) {
										local294 = 41;
									}
									if (local278 == 1) {
										local294 = 37;
									}
									if (local278 == 2) {
										local294 = 32;
									}
									if (local278 == 3) {
										local294 = 40;
									}
									if (local278 == 4) {
										local294 = 1005;
									}
									@Pc(327) int local327 = -1;
									if (local278 == local163.anInt5513) {
										local327 = local163.anInt5551;
									}
									if (local163.anInt5533 == local278) {
										local327 = local163.anInt5528;
									}
									method1497(local112, local117, local124, "<col=00ffff>" + local163.name, local267[local278], local294, local327);
								}
							}
						}
						method1497((long) local163.id, local117, local124, "<col=00ffff>" + local163.name, LocalisedText.EXAMINE, (short) 1007, Static3.anInt2232);
					}
				}
				if (local138 == 1) {
					@Pc(394) Npc local394 = NpcList.npcs[local131];
					if ((local394.type.size & 0x1) == 0 && (local394.x & 0x7F) == 0 && (local394.z & 0x7F) == 0 || (local394.type.size & 0x1) == 1 && (local394.x & 0x7F) == 64 && (local394.z & 0x7F) == 64) {
						@Pc(450) int local450 = local394.x - (local394.type.size - 1) * 64;
						@Pc(462) int local462 = local394.z + 64 - local394.type.size * 64;
						for (@Pc(464) int local464 = 0; local464 < NpcList.size; local464++) {
							@Pc(477) Npc local477 = NpcList.npcs[NpcList.ids[local464]];
							if (local477 != null && !local477.aBoolean281 && local477 != local394 && local477.aBoolean282) {
								@Pc(501) int local501 = local477.x - (local477.type.size - 1) * 64;
								@Pc(512) int local512 = local477.z - (local477.type.size - 1) * 64;
								if (local501 >= local450 && local477.type.size <= local394.type.size - (local501 - local450 >> 7) && local512 >= local462 && local394.type.size - (local512 - local462 >> 7) >= local477.type.size) {
									Static33.method4152(local477.type, local124, NpcList.ids[local464], local117);
									local477.aBoolean281 = true;
								}
							}
						}
						for (@Pc(568) int local568 = 0; local568 < PlayerList.size; local568++) {
							@Pc(577) Player local577 = PlayerList.players[PlayerList.ids[local568]];
							if (local577 != null && !local577.aBoolean281 && local577.aBoolean282) {
								@Pc(597) int local597 = local577.x - (local577.getSize() - 1) * 64;
								@Pc(609) int local609 = local577.z - (local577.getSize() - 1) * 64;
								if (local597 >= local450 && local577.getSize() <= local394.type.size - (local597 - local450 >> 7) && local462 <= local609 && local577.getSize() <= local394.type.size - (local609 - local462 >> 7)) {
									Static29.method3488(local124, PlayerList.ids[local568], local577, local117);
									local577.aBoolean281 = true;
								}
							}
						}
					}
					if (local394.aBoolean281) {
						continue;
					}
					Static33.method4152(local394.type, local124, local131, local117);
					local394.aBoolean281 = true;
				}
				if (local138 == 0) {
					@Pc(682) Player local682 = PlayerList.players[local131];
					if ((local682.x & 0x7F) == 64 && (local682.z & 0x7F) == 64) {
						@Pc(709) int local709 = local682.x - (local682.getSize() - 1) * 64;
						@Pc(721) int local721 = local682.z - (local682.getSize() - 1) * 64;
						for (@Pc(723) int local723 = 0; local723 < NpcList.size; local723++) {
							@Pc(736) Npc local736 = NpcList.npcs[NpcList.ids[local723]];
							if (local736 != null && !local736.aBoolean281 && local736.aBoolean282) {
								@Pc(756) int local756 = local736.x - (local736.type.size - 1) * 64;
								@Pc(768) int local768 = local736.z - (local736.type.size - 1) * 64;
								if (local709 <= local756 && local736.type.size <= local682.getSize() - (local756 - local709 >> 7) && local721 <= local768 && local736.type.size <= local682.getSize() - (local768 - local721 >> 7)) {
									Static33.method4152(local736.type, local124, NpcList.ids[local723], local117);
									local736.aBoolean281 = true;
								}
							}
						}
						for (@Pc(827) int local827 = 0; local827 < PlayerList.size; local827++) {
							@Pc(840) Player local840 = PlayerList.players[PlayerList.ids[local827]];
							if (local840 != null && !local840.aBoolean281 && local840 != local682 && local840.aBoolean282) {
								@Pc(865) int local865 = local840.x - (local840.getSize() - 1) * 64;
								@Pc(877) int local877 = local840.z + 64 - local840.getSize() * 64;
								if (local865 >= local709 && local840.getSize() <= local682.getSize() - (local865 - local709 >> 7) && local721 <= local877 && local840.getSize() <= local682.getSize() - (local877 - local721 >> 7)) {
									Static29.method3488(local124, PlayerList.ids[local827], local840, local117);
									local840.aBoolean281 = true;
								}
							}
						}
					}
					if (local682.aBoolean281) {
						continue;
					}
					Static29.method3488(local124, local131, local682, local117);
					local682.aBoolean281 = true;
				}
				if (local138 == 3) {
					@Pc(952) LinkedList local952 = Static4.objStacks[Static7.y][local117][local124];
					if (local952 != null) {
						for (@Pc(960) ObjStackNode local960 = (ObjStackNode) local952.tail(); local960 != null; local960 = (ObjStackNode) local952.prev()) {
							@Pc(967) int local967 = local960.value.type;
							@Pc(971) ObjType local971 = ObjTypeList.get(local967);
							if (Static2.anInt1334 == 1) {
								method1497((long) local967, local117, local124, Static7.aString365 + " -> <col=ff9040>" + local971.name, LocalisedText.USE, (short) 28, Static2.anInt1937);
							} else if (Static3.aBoolean177) {
								@Pc(986) ParamType local986 = Static5.anInt4224 == -1 ? null : ParamTypeList.get(Static5.anInt4224);
								if ((Static5.anInt3560 & 0x1) != 0 && (local986 == null || local971.getParam(Static5.anInt4224, local986.defaultInt) != local986.defaultInt)) {
									method1497((long) local967, local117, local124, Static2.aString81 + " -> <col=ff9040>" + local971.name, Static4.aString140, (short) 48, Static6.anInt4466);
								}
							} else {
								@Pc(1043) String[] local1043 = local971.ops;
								if (Static5.aBoolean254) {
									local1043 = Static35.method4300(local1043);
								}
								for (@Pc(1052) int local1052 = 4; local1052 >= 0; local1052--) {
									if (local1043 != null && local1043[local1052] != null) {
										@Pc(1067) int local1067 = -1;
										if (local971.cursor1Op == local1052) {
											local1067 = local971.cursor1;
										}
										if (local971.cursor2Op == local1052) {
											local1067 = local971.cursor2;
										}
										@Pc(1096) byte local1096 = 0;
										if (local1052 == 0) {
											local1096 = 45;
										}
										if (local1052 == 1) {
											local1096 = 46;
										}
										if (local1052 == 2) {
											local1096 = 38;
										}
										if (local1052 == 3) {
											local1096 = 6;
										}
										if (local1052 == 4) {
											local1096 = 44;
										}
										method1497((long) local967, local117, local124, "<col=ff9040>" + local971.name, local1043[local1052], local1096, local1067);
									}
								}
								method1497((long) local967, local117, local124, "<col=ff9040>" + local971.name, LocalisedText.EXAMINE, (short) 1004, Static3.anInt2232);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!fh;Lclient!ai;Lclient!fh;)V")
	public static void method1521(@OriginalArg(1) Js5 arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) Js5 arg2) {
		Static1.aClass58_19 = arg2;
		Static4.aClass58_72 = arg0;
		Static5.anInterface1_1 = arg1;
		if (Static1.aClass58_19 != null) {
			Static2.anInt912 = Static1.aClass58_19.getGroupCapacity(1);
		}
		if (Static4.aClass58_72 != null) {
			Static7.anInt6046 = Static4.aClass58_72.getGroupCapacity(1);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!fh;BII)[Lclient!fe;")
	public static SoftwareIndexedSprite[] method1523(@OriginalArg(0) Js5 arg0, @OriginalArg(3) int arg1) {
		return Static9.method197(arg0, arg1, 0) ? Static26.method4358() : null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ra;B)V")
	public static void method4654(@OriginalArg(0) Loc loc) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		@Pc(9) long local9 = 0L;
		if (loc.layer == 0) {
			local9 = Static25.method2726(loc.y, loc.x, loc.z);
		}
		if (loc.layer == 1) {
			local9 = Static37.method4739(loc.y, loc.x, loc.z);
		}
		@Pc(45) int local45 = 0;
		if (loc.layer == 2) {
			local9 = Static20.method1960(loc.y, loc.x, loc.z);
		}
		if (loc.layer == 3) {
			local9 = Static22.method2414(loc.y, loc.x, loc.z);
		}
		if (local9 != 0L) {
			local7 = (int) local9 >> 14 & 0x1F;
			local45 = (int) local9 >> 20 & 0x3;
			local5 = Integer.MAX_VALUE & (int) (local9 >>> 32);
		}
		loc.anInt4444 = local45;
		loc.anInt4443 = local7;
		loc.anInt4439 = local5;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([BB)Lclient!ke;")
	public static Class4_Sub3_Sub5_Sub2 method4658(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(24) Class4_Sub3_Sub5_Sub2 local24 = new Class4_Sub3_Sub5_Sub2(arg0, Static5.anIntArray402, Static5.anIntArray391, Static3.anIntArray185, Static7.anIntArray643, Static6.aByteArrayArray36);
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

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	public static void method1566() {
		Static3.aClass84_8.clear();
		Static1.aClass175_4.clear();
		Static3.aClass175_11.clear();
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

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[Ljava/lang/Object;II[I)V")
	public static void method2017(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg0) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) int local16 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local16;
		@Pc(30) Object local30 = arg1[local10];
		arg1[local10] = arg1[arg0];
		arg1[arg0] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg0; local42++) {
			if (local16 + (local42 & 0x1) > arg3[local42]) {
				@Pc(68) int local68 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12] = local68;
				@Pc(82) Object local82 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12++] = local82;
			}
		}
		arg3[arg0] = arg3[local12];
		arg3[local12] = local16;
		arg1[arg0] = arg1[local12];
		arg1[local12] = local30;
		method2017(local12 - 1, arg1, arg2, arg3);
		method2017(arg0, arg1, local12 + 1, arg3);
	}

}

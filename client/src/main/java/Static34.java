import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!qc;Z)V")
	public static void method4234(@OriginalArg(0) PathingEntity arg0) {
		@Pc(13) int local13 = arg0.anInt4034 - client.loop;
		@Pc(25) int local25 = arg0.anInt3973 * 128 + arg0.getSize() * 64;
		@Pc(37) int local37 = arg0.anInt4033 * 128 + arg0.getSize() * 64;
		if (arg0.anInt4008 == 0) {
			arg0.anInt4017 = 1024;
		}
		arg0.z += (local37 - arg0.z) / local13;
		arg0.x += (local25 - arg0.x) / local13;
		if (arg0.anInt4008 == 1) {
			arg0.anInt4017 = 1536;
		}
		arg0.anInt4037 = 0;
		if (arg0.anInt4008 == 2) {
			arg0.anInt4017 = 0;
		}
		if (arg0.anInt4008 == 3) {
			arg0.anInt4017 = 512;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4236(@OriginalArg(1) String arg0) {
		if (Static6.aClass4_Sub15Array1 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(20) long local20 = Base37.encode(arg0);
		if (local20 == 0L) {
			return;
		}
		while (Static6.aClass4_Sub15Array1.length > local16 && local20 != Static6.aClass4_Sub15Array1[local16].key) {
			local16++;
		}
		if (Static6.aClass4_Sub15Array1.length > local16 && Static6.aClass4_Sub15Array1[local16] != null) {
			Protocol.outboundBuffer.writeOpcode(75);
			Protocol.outboundBuffer.writeLong(Static6.aClass4_Sub15Array1[local16].key);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!qc;)V")
	public static void method4247(@OriginalArg(1) PathingEntity arg0) {
		if (arg0.anInt4009 == 0) {
			return;
		}
		@Pc(16) BasType local16 = arg0.method3314();
		if (arg0.anInt3985 != -1 && arg0.anInt3985 < 32768) {
			@Pc(31) Npc local31 = NpcList.npcs[arg0.anInt3985];
			if (local31 != null) {
				@Pc(42) int local42 = arg0.x - local31.x;
				@Pc(49) int local49 = arg0.z - local31.z;
				if (local42 != 0 || local49 != 0) {
					arg0.anInt4017 = (int) (Math.atan2((double) local42, (double) local49) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.anInt3985 >= 32768) {
			@Pc(87) int local87 = arg0.anInt3985 - 32768;
			if (local87 == PlayerList.selfId) {
				local87 = 2047;
			}
			@Pc(101) Player local101 = PlayerList.players[local87];
			if (local101 != null) {
				@Pc(112) int local112 = arg0.x - local101.x;
				@Pc(119) int local119 = arg0.z - local101.z;
				if (local112 != 0 || local119 != 0) {
					arg0.anInt4017 = (int) (Math.atan2((double) local112, (double) local119) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt4014 != 0 || arg0.anInt4003 != 0) && (arg0.anInt3965 == 0 || arg0.anInt4037 > 0)) {
			@Pc(172) int local172 = arg0.z - (arg0.anInt4003 - Static7.originZ - Static7.originZ) * 64;
			@Pc(185) int local185 = arg0.x - (arg0.anInt4014 - Static5.originX - Static5.originX) * 64;
			if (local185 != 0 || local172 != 0) {
				arg0.anInt4017 = (int) (Math.atan2((double) local185, (double) local172) * 325.949D) & 0x7FF;
			}
			arg0.anInt4014 = 0;
			arg0.anInt4003 = 0;
		}
		@Pc(222) int local222 = arg0.anInt4017 - arg0.anInt4031 & 0x7FF;
		if (local222 == 0) {
			arg0.anInt4020 = 0;
			arg0.anInt4015 = 0;
		} else if (local16.anInt830 == 0) {
			arg0.anInt4015++;
			if (local222 <= 1024) {
				arg0.anInt4031 += arg0.anInt4009;
				@Pc(874) boolean local874 = true;
				if (arg0.anInt4009 > local222 || local222 > 2048 - arg0.anInt4009) {
					local874 = false;
					arg0.anInt4031 = arg0.anInt4017;
				}
				if (arg0.anInt4015 > 25 || local874) {
					arg0.anInt4005 = local16.anInt846;
					if (arg0.anInt3965 > 0) {
						if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
							if (local16.anInt853 != -1) {
								arg0.anInt4005 = local16.anInt853;
							} else if (local16.anInt831 != -1) {
								arg0.anInt4005 = local16.anInt831;
							}
						} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
							if (local16.anInt839 != -1) {
								arg0.anInt4005 = local16.anInt839;
							} else if (local16.anInt854 != -1) {
								arg0.anInt4005 = local16.anInt854;
							}
						} else if (local16.anInt865 != -1) {
							arg0.anInt4005 = local16.anInt865;
						}
					} else if (local16.anInt832 != -1) {
						arg0.anInt4005 = local16.anInt832;
					}
				}
			} else {
				arg0.anInt4031 -= arg0.anInt4009;
				@Pc(1005) boolean local1005 = true;
				if (local222 < arg0.anInt4009 || 2048 - arg0.anInt4009 < local222) {
					local1005 = false;
					arg0.anInt4031 = arg0.anInt4017;
				}
				if (arg0.anInt4015 > 25 || local1005) {
					arg0.anInt4005 = local16.anInt846;
					if (arg0.anInt3965 <= 0) {
						if (local16.anInt834 != -1) {
							arg0.anInt4005 = local16.anInt834;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
						if (local16.anInt835 != -1) {
							arg0.anInt4005 = local16.anInt835;
						} else if (local16.anInt831 != -1) {
							arg0.anInt4005 = local16.anInt831;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
						if (local16.anInt843 != -1) {
							arg0.anInt4005 = local16.anInt843;
						} else if (local16.anInt854 != -1) {
							arg0.anInt4005 = local16.anInt854;
						}
					} else if (local16.anInt842 != -1) {
						arg0.anInt4005 = local16.anInt842;
					}
				}
			}
			arg0.anInt4031 &= 2047;
		} else {
			arg0.anInt4005 = -1;
			@Pc(241) int local241 = arg0.anInt4017 << 5;
			if (arg0.anInt3987 != local241) {
				arg0.anInt4029 = 0;
				arg0.anInt3987 = local241;
				@Pc(263) int local263 = local241 - arg0.anInt3992 & 0xFFFF;
				@Pc(274) int local274 = arg0.anInt4020 * arg0.anInt4020 / (local16.anInt830 * 2);
				if (arg0.anInt4020 > 0 && local274 <= local263 && local263 - local274 < 32768) {
					arg0.aBoolean283 = true;
					arg0.anInt3994 = local263 / 2;
					@Pc(379) int local379 = local16.anInt862 * local16.anInt862 / (local16.anInt830 * 2);
					if (local379 > 32767) {
						local379 = 32767;
					}
					if (arg0.anInt3994 > local379) {
						arg0.anInt3994 = local263 - local379;
					}
				} else if (arg0.anInt4020 < 0 && local274 <= 65536 - local263 && 65536 - local263 - local274 < 32768) {
					arg0.anInt3994 = (65536 - local263) / 2;
					arg0.aBoolean283 = true;
					@Pc(334) int local334 = local16.anInt862 * local16.anInt862 / (local16.anInt830 * 2);
					if (local334 > 32767) {
						local334 = 32767;
					}
					if (arg0.anInt3994 > local334) {
						arg0.anInt3994 = 65536 - local334 - local263;
					}
				} else {
					arg0.aBoolean283 = false;
				}
			}
			if (arg0.anInt4020 == 0) {
				@Pc(410) int local410 = arg0.anInt3987 - arg0.anInt3992 & 0xFFFF;
				if (local410 < local16.anInt830) {
					arg0.anInt3992 = arg0.anInt3987;
				} else {
					arg0.anInt4029 = 0;
					arg0.aBoolean283 = true;
					@Pc(441) int local441 = local16.anInt862 * local16.anInt862 / (local16.anInt830 * 2);
					if (local441 > 32767) {
						local441 = 32767;
					}
					if (local410 >= 32768) {
						arg0.anInt3994 = (65536 - local410) / 2;
						if (local441 < arg0.anInt3994) {
							arg0.anInt3994 = 65536 - local410 - local441;
						}
						arg0.anInt4020 = -local16.anInt830;
					} else {
						arg0.anInt3994 = local410 / 2;
						arg0.anInt4020 = local16.anInt830;
						if (arg0.anInt3994 > local441) {
							arg0.anInt3994 = local410 - local441;
						}
					}
				}
			} else if (arg0.anInt4020 > 0) {
				if (arg0.anInt4029 >= arg0.anInt3994) {
					arg0.aBoolean283 = false;
				}
				if (!arg0.aBoolean283) {
					arg0.anInt4020 -= local16.anInt830;
					if (arg0.anInt4020 < 0) {
						arg0.anInt4020 = 0;
					}
				} else if (arg0.anInt4020 < local16.anInt862) {
					arg0.anInt4020 += local16.anInt830;
				}
			} else {
				if (arg0.anInt4029 >= arg0.anInt3994) {
					arg0.aBoolean283 = false;
				}
				if (!arg0.aBoolean283) {
					arg0.anInt4020 += local16.anInt830;
					if (arg0.anInt4020 > 0) {
						arg0.anInt4020 = 0;
					}
				} else if (-local16.anInt862 < arg0.anInt4020) {
					arg0.anInt4020 -= local16.anInt830;
				}
			}
			arg0.anInt3992 += arg0.anInt4020;
			arg0.anInt3992 &= 65535;
			arg0.anInt4031 = arg0.anInt3992 >> 5;
			if (arg0.anInt4020 <= 0) {
				arg0.anInt4029 -= arg0.anInt4020;
			} else {
				arg0.anInt4029 += arg0.anInt4020;
			}
			if (arg0.anInt4020 < 0) {
				if (arg0.anInt3965 > 0) {
					if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
						if (local16.anInt835 != -1) {
							arg0.anInt4005 = local16.anInt835;
						} else if (local16.anInt831 != -1) {
							arg0.anInt4005 = local16.anInt831;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
						if (local16.anInt843 != -1) {
							arg0.anInt4005 = local16.anInt843;
						} else if (local16.anInt854 != -1) {
							arg0.anInt4005 = local16.anInt854;
						}
					}
				}
				if (arg0.anInt4005 == -1) {
					if (local16.anInt842 != -1) {
						arg0.anInt4005 = local16.anInt842;
					} else if (local16.anInt834 != -1) {
						arg0.anInt4005 = local16.anInt834;
					}
				}
			} else {
				if (arg0.anInt3965 > 0) {
					if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
						if (local16.anInt853 != -1) {
							arg0.anInt4005 = local16.anInt853;
						} else if (local16.anInt831 != -1) {
							arg0.anInt4005 = local16.anInt831;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
						if (local16.anInt839 != -1) {
							arg0.anInt4005 = local16.anInt839;
						} else if (local16.anInt854 != -1) {
							arg0.anInt4005 = local16.anInt854;
						}
					}
				}
				if (arg0.anInt4005 == -1) {
					if (local16.anInt865 != -1) {
						arg0.anInt4005 = local16.anInt865;
					} else if (local16.anInt832 != -1) {
						arg0.anInt4005 = local16.anInt832;
					}
				}
			}
			if (arg0.anInt4005 == -1) {
				arg0.anInt4005 = local16.anInt846;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z[Lclient!ch;IIIII[B)[I")
	public static int[] method4248(@OriginalArg(0) boolean arg0, @OriginalArg(1) CollisionMap[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(9) byte local9;
		if (arg0) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		if (!arg0) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				for (@Pc(25) int local25 = 0; local25 < 64; local25++) {
					for (@Pc(32) int local32 = 0; local32 < 64; local32++) {
						if (arg4 + local25 > 0 && local25 + arg4 < 103 && arg3 + local32 > 0 && local32 + arg3 < 103) {
							arg1[local18].flags[local25 + arg4][arg3 + local32] &= -2097153;
						}
					}
				}
			}
		}
		@Pc(103) int local103 = arg5 + arg4;
		@Pc(108) Buffer local108 = new Buffer(arg6);
		@Pc(112) int local112 = arg2 + arg3;
		for (@Pc(114) int local114 = 0; local114 < local9; local114++) {
			for (@Pc(129) int local129 = 0; local129 < 64; local129++) {
				for (@Pc(134) int local134 = 0; local134 < 64; local134++) {
					Static9.method195(local108, false, arg0, local114, local103 + local129, local134 + local112, local134 + arg3, 0, 0, 0, arg4 + local129);
				}
			}
		}
		@Pc(171) boolean local171 = false;
		@Pc(173) boolean local173 = false;
		while (local108.bytes.length > local108.position) {
			@Pc(183) int local183 = local108.readUnsignedByte();
			if (local183 == 128) {
				local171 = true;
				Static6.anIntArray465[0] = local108.readUnsignedShort();
				Static6.anIntArray465[1] = local108.readShort();
				Static6.anIntArray465[2] = local108.readShort();
				Static6.anIntArray465[3] = local108.readShort();
				Static6.anIntArray465[4] = local108.readUnsignedShort();
			} else {
				if (local183 != 129) {
					local108.position--;
					break;
				}
				for (@Pc(201) int local201 = 0; local201 < 4; local201++) {
					@Pc(210) byte local210 = local108.readByte();
					if (local210 == 0) {
						@Pc(216) int local216 = arg4 + 64;
						if (local216 < 0) {
							local216 = 0;
						} else if (local216 >= 104) {
							local216 = 104;
						}
						@Pc(231) int local231 = arg4;
						@Pc(233) int local233 = arg3;
						if (arg3 < 0) {
							local233 = 0;
						} else if (arg3 >= 104) {
							local233 = 104;
						}
						@Pc(252) int local252 = arg3 + 64;
						if (arg4 < 0) {
							local231 = 0;
						} else if (arg4 >= 104) {
							local231 = 104;
						}
						if (local252 < 0) {
							local252 = 0;
						} else if (local252 >= 104) {
							local252 = 104;
						}
						while (local216 > local231) {
							while (local233 < local252) {
								Terrain.aByteArrayArrayArray16[local201][local231][local233] = 0;
								local233++;
							}
							local231++;
						}
					} else if (local210 == 1) {
						for (@Pc(307) int local307 = 0; local307 < 64; local307 += 4) {
							for (@Pc(312) int local312 = 0; local312 < 64; local312 += 4) {
								@Pc(321) byte local321 = local108.readByte();
								for (@Pc(325) int local325 = local307 + arg4; local325 < local307 + arg4 + 4; local325++) {
									for (@Pc(337) int local337 = arg3 + local312; local337 < local312 + arg3 + 4; local337++) {
										if (local325 >= 0 && local325 < 104 && local337 >= 0 && local337 < 104) {
											Terrain.aByteArrayArrayArray16[local201][local325][local337] = local321;
										}
									}
								}
							}
						}
					} else if (local210 == 2 && local201 > 0) {
						@Pc(393) int local393 = arg4 + 64;
						if (local393 < 0) {
							local393 = 0;
						} else if (local393 >= 104) {
							local393 = 104;
						}
						@Pc(409) int local409 = arg3;
						if (arg3 < 0) {
							local409 = 0;
						} else if (arg3 >= 104) {
							local409 = 104;
						}
						@Pc(426) int local426 = arg4;
						@Pc(430) int local430 = arg3 + 64;
						if (arg4 < 0) {
							local426 = 0;
						} else if (arg4 >= 104) {
							local426 = 104;
						}
						if (local430 < 0) {
							local430 = 0;
						} else if (local430 >= 104) {
							local430 = 104;
						}
						while (local393 > local426) {
							while (local430 > local409) {
								Terrain.aByteArrayArrayArray16[local201][local426][local409] = Terrain.aByteArrayArrayArray16[local201 - 1][local426][local409];
								local409++;
							}
							local426++;
						}
					}
				}
				local173 = true;
			}
		}
		if (GlRenderer.enabled && !arg0) {
			@Pc(539) Class187 local539 = null;
			while (true) {
				while (local108.position < local108.bytes.length) {
					@Pc(549) int local549 = local108.readUnsignedByte();
					if (local549 == 0) {
						local539 = new Class187(local108);
					} else if (local549 == 1) {
						@Pc(585) int local585 = local108.readUnsignedByte();
						if (local585 > 0) {
							for (@Pc(590) int local590 = 0; local590 < local585; local590++) {
								@Pc(598) Light local598 = new Light(local108);
								if (local598.anInt1323 == 31) {
									@Pc(608) LightType local608 = LightTypeList.get(local108.readUnsignedShort());
									local598.method1073(local608.anInt5484, local608.anInt5480, local608.anInt5482, local608.anInt5481);
								}
								local598.x += arg4 << 7;
								local598.z += arg3 << 7;
								@Pc(640) int local640 = local598.x >> 7;
								@Pc(645) int local645 = local598.z >> 7;
								if (local640 >= 0 && local645 >= 0 && local640 < 104 && local645 < 104) {
									local598.aBoolean80 = (Static4.tileFlags[1][local640][local645] & 0x2) != 0;
									local598.y = Terrain.tileHeights[local598.anInt1326][local640][local645] - local598.y;
									LightingManager.addLight(local598);
								}
							}
						}
					} else if (local549 == 2) {
						if (local539 == null) {
							local539 = new Class187();
						}
						local539.method4786(local108);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local539 == null) {
					local539 = new Class187();
				}
				for (@Pc(704) int local704 = 0; local704 < 8; local704++) {
					for (@Pc(709) int local709 = 0; local709 < 8; local709++) {
						@Pc(719) int local719 = (arg4 >> 3) + local704;
						@Pc(725) int local725 = (arg3 >> 3) + local709;
						if (local719 >= 0 && local719 < 13 && local725 >= 0 && local725 < 13) {
							Static5.aClass187ArrayArray1[local719][local725] = local539;
						}
					}
				}
				break;
			}
		}
		if (!local173) {
			for (@Pc(760) int local760 = 0; local760 < 4; local760++) {
				for (@Pc(767) int local767 = 0; local767 < 16; local767++) {
					for (@Pc(772) int local772 = 0; local772 < 16; local772++) {
						@Pc(784) int local784 = (arg3 >> 2) + local772;
						@Pc(790) int local790 = (arg4 >> 2) + local767;
						if (local790 >= 0 && local790 < 26 && local784 >= 0 && local784 < 26) {
							Terrain.aByteArrayArrayArray16[local760][local790][local784] = 0;
						}
					}
				}
			}
		}
		return local171 ? Static6.anIntArray465 : null;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBIIIII)V")
	public static void method4250(@OriginalArg(0) int seqId, @OriginalArg(1) int x, @OriginalArg(3) int y, @OriginalArg(4) int z, @OriginalArg(5) int layer, @OriginalArg(6) int angle, @OriginalArg(7) int shape) {
		if (x < 0 || z < 0 || x >= 103 || z >= 103) {
			return;
		}
		if (layer == 0) {
			@Pc(22) Wall wall = Terrain.getWall(y, x, z);
			if (wall != null) {
				@Pc(32) int locId = (int) (wall.pickKey >>> 32) & Integer.MAX_VALUE;
				if (shape == 2) {
					wall.aClass53_5 = new Loc(locId, 2, angle + 4, y, x, z, seqId, false, wall.aClass53_5);
					wall.aClass53_4 = new Loc(locId, 2, angle + 1 & 0x3, y, x, z, seqId, false, wall.aClass53_4);
				} else {
					wall.aClass53_5 = new Loc(locId, shape, angle, y, x, z, seqId, false, wall.aClass53_5);
				}
			}
		}
		if (layer == 1) {
			@Pc(98) WallDecor wallDecor = Terrain.getWallDecor(y, x, z);
			if (wallDecor != null) {
				@Pc(109) int locId = Integer.MAX_VALUE & (int) (wallDecor.pickKey >>> 32);
				if (shape == 4 || shape == 5) {
					wallDecor.aClass53_10 = new Loc(locId, 4, angle, y, x, z, seqId, false, wallDecor.aClass53_10);
				} else if (shape == 6) {
					wallDecor.aClass53_10 = new Loc(locId, 4, angle + 4, y, x, z, seqId, false, wallDecor.aClass53_10);
				} else if (shape == 7) {
					wallDecor.aClass53_10 = new Loc(locId, 4, (angle + 2 & 0x3) + 4, y, x, z, seqId, false, wallDecor.aClass53_10);
				} else if (shape == 8) {
					wallDecor.aClass53_10 = new Loc(locId, 4, angle + 4, y, x, z, seqId, false, wallDecor.aClass53_10);
					wallDecor.aClass53_9 = new Loc(locId, 4, (angle + 2 & 0x3) + 4, y, x, z, seqId, false, wallDecor.aClass53_9);
				}
			}
		}
		if (layer == 2) {
			if (shape == 11) {
				shape = 10;
			}
			@Pc(246) Scenery scenery = Terrain.getScenery(y, x, z);
			if (scenery != null) {
				scenery.aClass53_1 = new Loc((int) (scenery.pickKey >>> 32) & Integer.MAX_VALUE, shape, angle, y, x, z, seqId, false, scenery.aClass53_1);
			}
		}
		if (layer == 3) {
			@Pc(280) GroundDecor groundDecor = Terrain.getGroundDecor(y, x, z);
			if (groundDecor != null) {
				groundDecor.aClass53_2 = new Loc(Integer.MAX_VALUE & (int) (groundDecor.pickKey >>> 32), 22, angle, y, x, z, seqId, false, groundDecor.aClass53_2);
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZLclient!wf;)V")
	public static void method4251(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1) {
		@Pc(8) int local8 = arg1.anInt5885 == 0 ? arg1.anInt5893 : arg1.anInt5885;
		@Pc(20) int local20 = arg1.anInt5887 == 0 ? arg1.anInt5949 : arg1.anInt5887;
		Static31.method3660(InterfaceList.components[arg1.id >> 16], arg0, local8, arg1.id, local20);
		if (arg1.aClass185Array4 != null) {
			Static31.method3660(arg1.aClass185Array4, arg0, local8, arg1.id, local20);
		}
		@Pc(61) Class4_Sub27 local61 = (Class4_Sub27) Static4.aClass84_13.get((long) arg1.id);
		if (local61 != null) {
			Static21.method2050(arg0, local8, local61.anInt4620, local20);
		}
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)Lclient!vn;")
	public static SoftwareSprite method1546() {
		@Pc(14) byte[] local14 = Static6.aByteArrayArray36[0];
		@Pc(22) int local22 = Static7.anIntArray643[0] * Static3.anIntArray185[0];
		@Pc(66) SoftwareSprite local66;
		if (Static5.aBooleanArray22[0]) {
			@Pc(71) int[] local71 = new int[local22];
			@Pc(75) byte[] local75 = Static4.aByteArrayArray54[0];
			for (@Pc(77) int local77 = 0; local77 < local22; local77++) {
				local71[local77] = (local75[local77] & 0xFF) << 24 | Static2.anIntArray85[local14[local77] & 0xFF];
			}
			local66 = new SoftwareAlphaSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[0], Static5.anIntArray391[0], Static3.anIntArray185[0], Static7.anIntArray643[0], local71);
		} else {
			@Pc(29) int[] local29 = new int[local22];
			for (@Pc(31) int local31 = 0; local31 < local22; local31++) {
				local29[local31] = Static2.anIntArray85[local14[local31] & 0xFF];
			}
			local66 = new SoftwareSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[0], Static5.anIntArray391[0], Static3.anIntArray185[0], Static7.anIntArray643[0], local29);
		}
		Static37.method4670();
		return local66;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!fh;II)[Lclient!uj;")
	public static Sprite[] method1548(@OriginalArg(0) int arg0, @OriginalArg(1) Js5 arg1) {
		return Static9.method197(arg1, arg0, 0) ? Static21.method2000() : null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I")
	public static int method4257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg0 >>= 1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}

}

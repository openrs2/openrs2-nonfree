import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "([I[IIIIIIIII)V")
	public static void method2186(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(2) int local2 = -arg5; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg4; local7 < 0; local7++) {
				@Pc(19) int local19 = (arg1[arg2] >>> 24) * arg8 >> 8;
				@Pc(23) int local23 = 256 - local19;
				@Pc(28) int local28 = arg1[arg2++];
				@Pc(32) int local32 = arg0[arg3];
				arg0[arg3++] = ((local28 & 0xFF00FF) * local19 + (local32 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local28 & 0xFF00) * local19 + (local32 & 0xFF00) * local23 & 0xFF0000) >>> 8;
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static2.anInt902 <= arg8 && arg8 <= Static3.anInt2553 && Static2.anInt902 <= arg0 && Static3.anInt2553 >= arg0 && Static2.anInt902 <= arg3 && Static3.anInt2553 >= arg3 && Static2.anInt902 <= arg4 && arg4 <= Static3.anInt2553 && arg5 >= Static4.anInt3086 && arg5 <= Static5.anInt4230 && arg1 >= Static4.anInt3086 && Static5.anInt4230 >= arg1 && arg7 >= Static4.anInt3086 && Static5.anInt4230 >= arg7 && Static4.anInt3086 <= arg6 && Static5.anInt4230 >= arg6) {
			Static10.method283(arg6, arg7, arg5, arg2, arg0, arg3, arg4, arg1, arg8);
		} else {
			Static31.method3662(arg8, arg7, arg4, arg0, arg1, arg5, arg6, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(IIIIII)V")
	public static void method4701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = IntUtils.clamp(arg2, Static4.anInt3086, Static5.anInt4230);
		@Pc(17) int local17 = IntUtils.clamp(arg4, Static4.anInt3086, Static5.anInt4230);
		@Pc(23) int local23 = IntUtils.clamp(arg0, Static2.anInt902, Static3.anInt2553);
		@Pc(29) int local29 = IntUtils.clamp(arg1, Static2.anInt902, Static3.anInt2553);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			ArrayUtils.fillRange(Static5.anIntArrayArray36[local31], local23, local29, arg3);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)I")
	public static int rotateZFine(@OriginalArg(0) int z, @OriginalArg(2) int x, @OriginalArg(3) int angle) {
		angle &= 3;
		if (angle == 0) {
			return z;
		} else if (angle == 1) {
			return 1023 - x;
		} else if (angle == 2) {
			return 1023 - z;
		} else {
			return x;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = IntUtils.clamp(arg6, Static4.anInt3086, Static5.anInt4230);
		@Pc(22) int local22 = IntUtils.clamp(arg0, Static4.anInt3086, Static5.anInt4230);
		@Pc(28) int local28 = IntUtils.clamp(arg4, Static2.anInt902, Static3.anInt2553);
		@Pc(34) int local34 = IntUtils.clamp(arg5, Static2.anInt902, Static3.anInt2553);
		@Pc(43) int local43 = IntUtils.clamp(arg6 + arg1, Static4.anInt3086, Static5.anInt4230);
		@Pc(52) int local52 = IntUtils.clamp(arg0 - arg1, Static4.anInt3086, Static5.anInt4230);
		for (@Pc(54) int local54 = local11; local54 < local43; local54++) {
			ArrayUtils.fillRange(Static5.anIntArrayArray36[local54], local28, local34, arg3);
		}
		for (@Pc(74) int local74 = local22; local74 > local52; local74--) {
			ArrayUtils.fillRange(Static5.anIntArrayArray36[local74], local28, local34, arg3);
		}
		@Pc(97) int local97 = IntUtils.clamp(arg4 + arg1, Static2.anInt902, Static3.anInt2553);
		@Pc(106) int local106 = IntUtils.clamp(arg5 - arg1, Static2.anInt902, Static3.anInt2553);
		for (@Pc(108) int local108 = local43; local108 <= local52; local108++) {
			@Pc(119) int[] local119 = Static5.anIntArrayArray36[local108];
			ArrayUtils.fillRange(local119, local28, local97, arg3);
			ArrayUtils.fillRange(local119, local97, local106, arg2);
			ArrayUtils.fillRange(local119, local106, local34, arg3);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIZ[[F[[FLclient!ih;B[[IIIBIZI[[FII[Z[[II[IZ)V")
	private static void method2283(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) GroundModel arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int arg12, @OriginalArg(14) float[][] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) boolean[] arg16, @OriginalArg(18) int[][] arg17, @OriginalArg(19) int arg18, @OriginalArg(20) int[] arg19, @OriginalArg(21) boolean arg20) {
		@Pc(12) int local12 = (arg18 << 8) + (arg20 ? 255 : 0);
		@Pc(22) int local22 = (arg14 << 8) + (arg2 ? 255 : 0);
		@Pc(32) int local32 = (arg11 ? 255 : 0) + (arg8 << 8);
		@Pc(46) int local46 = (arg7 << 8) + (arg0 ? 255 : 0);
		@Pc(52) int[] local52 = new int[arg19.length / 2];
		for (@Pc(58) int local58 = 0; local58 < local52.length; local58++) {
			@Pc(72) int local72 = arg19[local58 + local58];
			@Pc(80) int local80 = arg19[local58 + local58 + 1];
			@Pc(92) int[][] local92 = arg17 == null || arg16 == null || !arg16[local58] ? arg6 : arg17;
			local52[local58] = Static37.method4757(arg13, local80, arg1, local92, arg3, arg17, arg5, local22, arg15, false, (float) arg12, arg4, arg9, local72, local46, local32, local12);
		}
		arg5.addTile(arg10, arg15, arg1, local52, null, false);
	}

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
	public static void topBannerRefresh() {
		if (!client.advertSuppressed && client.modeWhere != 2) {
			try {
				BrowserControl.call(client.instance, "tbrefresh");
			} catch (@Pc(24) Throwable ex) {
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(II)V")
	public static void method2388(@OriginalArg(0) int sizeFilter) {
		@Pc(7) int playerListSize = PlayerList.size;
		if (sizeFilter == 0) {
			playerListSize = 1;
		}
		for (@Pc(14) int i = 0; i < playerListSize; i++) {
			@Pc(32) Player player;
			if (sizeFilter == 0) {
				player = PlayerList.self;
			} else {
				player = PlayerList.players[PlayerList.ids[i]];
			}
			if (player != null && player.isVisible()) {
				@Pc(46) int size = player.getSize();
				if (sizeFilter == 0 || sizeFilter == size) {
					if (size == 1) {
						if ((player.xFine & 0x7F) == 64 && (player.zFine & 0x7F) == 64) {
							@Pc(211) int local211 = player.xFine >> 7;
							@Pc(216) int local216 = player.zFine >> 7;
							if (local211 >= 0 && local211 < 104 && local216 >= 0 && local216 < 104) {
								@Pc(238) int local238 = Static1.anIntArrayArray2[local211][local216]++;
							}
						}
					} else if (((size & 0x1) != 0 || (player.xFine & 0x7F) == 0 && (player.zFine & 0x7F) == 0) && ((size & 0x1) != 1 || (player.xFine & 0x7F) == 64 && (player.zFine & 0x7F) == 64)) {
						@Pc(111) int local111 = player.xFine - size * 64 >> 7;
						@Pc(120) int local120 = player.zFine - size * 64 >> 7;
						@Pc(126) int local126 = player.getSize() + local111;
						if (local126 > 104) {
							local126 = 104;
						}
						if (local111 < 0) {
							local111 = 0;
						}
						@Pc(146) int local146 = local120 + player.getSize();
						if (local120 < 0) {
							local120 = 0;
						}
						if (local146 > 104) {
							local146 = 104;
						}
						for (@Pc(161) int local161 = local111; local161 < local126; local161++) {
							for (@Pc(170) int local170 = local120; local170 < local146; local170++) {
								@Pc(183) int local183 = Static1.anIntArrayArray2[local161][local170]++;
							}
						}
					}
				}
			}
		}
		label220:
		for (@Pc(246) int i = 0; i < playerListSize; i++) {
			@Pc(255) Player player;
			@Pc(253) long key;
			if (sizeFilter == 0) {
				key = 0x7FF00000000L;
				player = PlayerList.self;
			} else {
				player = PlayerList.players[PlayerList.ids[i]];
				key = (long) PlayerList.ids[i] << 32;
			}
			if (player != null && player.isVisible()) {
				@Pc(280) int size = player.getSize();
				if (sizeFilter == 0 || sizeFilter == size) {
					player.aBoolean98 = false;
					player.aBoolean282 = true;
					if ((Preferences.manyIdleAnimations && PlayerList.size > 200 || PlayerList.size > 50) && sizeFilter != 0 && player.movementSeqId == player.getBasType().readySeqId) {
						player.aBoolean98 = true;
					}
					if (size == 1) {
						if ((player.xFine & 0x7F) == 64 && (player.zFine & 0x7F) == 64) {
							@Pc(340) int local340 = player.xFine >> 7;
							@Pc(345) int local345 = player.zFine >> 7;
							if (local340 < 0 || local340 >= 104 || local345 < 0 || local345 >= 104) {
								continue;
							}
							if (Static1.anIntArrayArray2[local340][local345] > 1) {
								@Pc(377) int local377 = Static1.anIntArrayArray2[local340][local345]--;
								continue;
							}
						}
					} else if ((size & 0x1) == 0 && (player.xFine & 0x7F) == 0 && (player.zFine & 0x7F) == 0 || (size & 0x1) == 1 && (player.xFine & 0x7F) == 64 && (player.zFine & 0x7F) == 0) {
						@Pc(430) int local430 = player.zFine - size * 64 >> 7;
						@Pc(440) int local440 = player.xFine - size * 64 >> 7;
						@Pc(444) int local444 = size + local440;
						if (local440 < 0) {
							local440 = 0;
						}
						if (local444 > 104) {
							local444 = 104;
						}
						@Pc(458) boolean local458 = true;
						@Pc(462) int local462 = size + local430;
						if (local430 < 0) {
							local430 = 0;
						}
						if (local462 > 104) {
							local462 = 104;
						}
						for (@Pc(479) int local479 = local440; local479 < local444; local479++) {
							for (@Pc(488) int local488 = local430; local488 < local462; local488++) {
								if (Static1.anIntArrayArray2[local479][local488] <= 1) {
									local458 = false;
									break;
								}
							}
						}
						if (local458) {
							@Pc(517) int local517 = local440;
							while (true) {
								if (local444 <= local517) {
									continue label220;
								}
								for (@Pc(522) int local522 = local430; local522 < local462; local522++) {
									@Pc(535) int local535 = Static1.anIntArrayArray2[local517][local522]--;
								}
								local517++;
							}
						}
					}
					if (player.attachment == null || client.loop < player.attachmentSetAt || player.attachmentResetAt <= client.loop) {
						player.aBoolean282 = false;
						player.y = SceneGraph.getTileHeight(Player.level, player.xFine, player.zFine);
						SceneGraph.method637(Player.level, player.xFine, player.zFine, player.y, (size - 1) * 64 + 60, player, player.angle, key, player.aBoolean284);
					} else {
						player.aBoolean98 = false;
						player.aBoolean282 = false;
						player.y = SceneGraph.getTileHeight(Player.level, player.xFine, player.zFine);
						SceneGraph.method584(Player.level, player.xFine, player.zFine, player.y, player, player.angle, key, player.attachmentX0, player.attachmentZ0, player.attachmentX1, player.attachmentZ1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([[[I[[B[[F[[I[[I[[F[[B[[I[[BI[[F[[I[[[B[[BZ[[I)[Lclient!ih;")
	public static GroundModel[] method2389(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int[][] arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float[][] arg10, @OriginalArg(11) int[][] arg11, @OriginalArg(12) byte[][][] arg12, @OriginalArg(13) byte[][] arg13, @OriginalArg(15) int[][] arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (@Pc(23) int local23 = 1; local23 <= 103; local23++) {
				@Pc(30) int local30 = 0;
				if (arg0 != null) {
					@Pc(45) int local45 = arg0[arg9][local11 >> 3][local23 >> 3];
					local30 = local45 >> 1 & 0x3;
				}
				@Pc(74) byte local74;
				if (local30 == 0) {
					local74 = arg13[local11][local23];
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23 - 1];
					}
				} else if (local30 == 1) {
					local74 = arg13[local11][local23 - 1];
					if (local74 == 0) {
						local74 = arg13[local11][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23];
					}
				} else if (local30 == 2) {
					local74 = arg13[local11 - 1][local23 - 1];
					if (local74 == 0) {
						local74 = arg13[local11][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23];
					}
				} else {
					local74 = arg13[local11 - 1][local23];
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23 - 1];
					}
				}
				if (local74 != 0) {
					@Pc(252) FluType local252 = FluTypeList.get((local74 & 0xFF) - 1);
					local9[local11][local23] = (local252.texture + 1 << 16) + local252.anInt4068;
				}
			}
		}
		@Pc(277) HashTable local277 = new HashTable(128);
		for (@Pc(279) int local279 = 1; local279 <= 102; local279++) {
			for (@Pc(286) int local286 = 1; local286 <= 102; local286++) {
				if (arg13[local279][local286] != 0) {
					@Pc(308) int[] local308;
					if (arg1[local279][local286] == 0) {
						local308 = Static1.anIntArrayArray5[0];
					} else {
						local308 = Static2.anIntArrayArray16[arg6[local279][local286]];
						if (local308.length == 0) {
							continue;
						}
					}
					@Pc(332) int local332 = local9[local279][local286];
					@Pc(340) int local340 = local9[local279 + 1][local286];
					@Pc(342) int local342 = 0;
					if (arg3 != null) {
						local342 = arg3[local279][local286] & 0xFFFFFF;
					}
					@Pc(363) int local363 = local9[local279 + 1][local286 + 1];
					@Pc(371) long local371 = (long) local332 << 32 | (long) local342;
					@Pc(379) long local379 = (long) local340 << 32 | (long) local342;
					@Pc(387) int local387 = local9[local279][local286 + 1];
					@Pc(395) long local395 = (long) local387 << 32 | (long) local342;
					@Pc(403) long local403 = (long) local363 << 32 | (long) local342;
					@Pc(408) int local408 = local308.length / 2;
					@Pc(414) GroundModel local414 = (GroundModel) local277.get(local371);
					if (local414 == null) {
						local414 = new GroundModel((local332 >> 16) - 1, (float) (local332 & 0xFFFF), false, arg11 != null, local342);
						local277.put(local371, local414);
					}
					local414.vertexCapacity += local408;
					local414.tileCapacity++;
					if (local379 != local371) {
						@Pc(467) GroundModel local467 = (GroundModel) local277.get(local379);
						if (local467 == null) {
							local467 = new GroundModel((local340 >> 16) - 1, (float) (local340 & 0xFFFF), false, arg11 != null, local342);
							local277.put(local379, local467);
						}
						local467.vertexCapacity += local408;
						local467.tileCapacity++;
					}
					if (local403 != local371 && local403 != local379) {
						@Pc(526) GroundModel local526 = (GroundModel) local277.get(local403);
						if (local526 == null) {
							local526 = new GroundModel((local363 >> 16) - 1, (float) (local363 & 0xFFFF), false, arg11 != null, local342);
							local277.put(local403, local526);
						}
						local526.tileCapacity++;
						local526.vertexCapacity += local408;
					}
					if (local371 != local395 && local379 != local395 && local395 != local403) {
						@Pc(594) GroundModel local594 = (GroundModel) local277.get(local395);
						if (local594 == null) {
							local594 = new GroundModel((local387 >> 16) - 1, (float) (local387 & 0xFFFF), false, arg11 != null, local342);
							local277.put(local395, local594);
						}
						local594.vertexCapacity += local408;
						local594.tileCapacity++;
					}
				}
			}
		}
		for (@Pc(645) GroundModel local645 = (GroundModel) local277.head(); local645 != null; local645 = (GroundModel) local277.next()) {
			local645.clear();
		}
		for (@Pc(659) int local659 = 1; local659 <= 102; local659++) {
			for (@Pc(664) int local664 = 1; local664 <= 102; local664++) {
				@Pc(675) byte local675 = arg13[local659][local664];
				if (local675 != 0) {
					@Pc(682) int local682 = 0;
					@Pc(711) int local711;
					if ((arg12[arg9][local659][local664] & 0x8) != 0) {
						local711 = 0;
					} else if ((arg12[1][local659][local664] & 0x2) == 2 && arg9 > 0) {
						local711 = arg9 - 1;
					} else {
						local711 = arg9;
					}
					@Pc(723) int local723 = 128;
					if (arg3 != null) {
						local682 = arg3[local659][local664] & 0xFFFFFF;
						local723 = arg3[local659][local664] >>> 24 << 3;
					}
					@Pc(746) boolean[] local746 = null;
					@Pc(758) int[] local758;
					@Pc(947) byte local947;
					if (arg1[local659][local664] == 0) {
						local758 = Static1.anIntArrayArray5[0];
						@Pc(779) int local779 = arg13[local659 - 1][local664 - 1] == local675 ? 1 : -1;
						@Pc(804) int local804 = local675 == arg13[local659 + 1][local664 - 1] ? 1 : -1;
						@Pc(823) int local823 = arg13[local659 - 1][local664 + 1] == local675 ? 1 : -1;
						@Pc(837) int local837;
						@Pc(838) int local838;
						if (arg13[local659][local664 - 1] == local675) {
							local837 = local779 + 1;
							local838 = local804 + 1;
						} else {
							local838 = local804 - 1;
							local837 = local779 - 1;
						}
						@Pc(859) int local859 = arg13[local659 + 1][local664 + 1] == local675 ? 1 : -1;
						@Pc(874) int local874;
						@Pc(873) int local873;
						if (local675 == arg13[local659 + 1][local664]) {
							local873 = local838 + 1;
							local874 = local859 + 1;
						} else {
							local873 = local838 - 1;
							local874 = local859 - 1;
						}
						@Pc(888) int local888;
						@Pc(889) int local889;
						if (arg13[local659][local664 + 1] == local675) {
							local888 = local874 + 1;
							local889 = local823 + 1;
						} else {
							local889 = local823 - 1;
							local888 = local874 - 1;
						}
						@Pc(904) int local904;
						@Pc(903) int local903;
						if (local675 == arg13[local659 - 1][local664]) {
							local903 = local889 + 1;
							local904 = local837 + 1;
						} else {
							local903 = local889 - 1;
							local904 = local837 - 1;
						}
						@Pc(913) int local913 = local904 - local888;
						@Pc(918) int local918 = local873 - local903;
						if (local918 < 0) {
							local918 = -local918;
						}
						if (local913 < 0) {
							local913 = -local913;
						}
						local947 = (byte) (local913 >= local918 ? 0 : 1);
						arg8[local659][local664] = local947;
					} else {
						local758 = Static2.anIntArrayArray16[arg6[local659][local664]];
						local947 = arg8[local659][local664];
						local746 = Static4.aBooleanArrayArray3[arg6[local659][local664]];
						if (local758.length == 0) {
							continue;
						}
					}
					@Pc(991) int local991 = local9[local659][local664];
					@Pc(999) int local999 = local9[local659 + 1][local664];
					@Pc(1009) int local1009 = local9[local659 + 1][local664 + 1];
					@Pc(1017) int local1017 = local9[local659][local664 + 1];
					@Pc(1025) long local1025 = (long) local682 | (long) local991 << 32;
					@Pc(1033) long local1033 = (long) local682 | (long) local1009 << 32;
					@Pc(1041) long local1041 = (long) local1017 << 32 | (long) local682;
					@Pc(1049) long local1049 = (long) local682 | (long) local999 << 32;
					@Pc(1055) int local1055 = arg4[local659][local664];
					@Pc(1063) int local1063 = arg4[local659 + 1][local664];
					@Pc(1073) int local1073 = arg4[local659 + 1][local664 + 1];
					@Pc(1079) int local1079 = arg7[local659][local664];
					@Pc(1087) int local1087 = arg4[local659][local664 + 1];
					@Pc(1095) int local1095 = arg7[local659 + 1][local664];
					@Pc(1105) int local1105 = arg7[local659 + 1][local664 + 1];
					@Pc(1113) int local1113 = arg7[local659][local664 + 1];
					@Pc(1119) int local1119 = (local991 >> 16) - 1;
					@Pc(1125) int local1125 = (local1017 >> 16) - 1;
					@Pc(1131) int local1131 = (local1009 >> 16) - 1;
					@Pc(1137) GroundModel local1137 = (GroundModel) local277.get(local1025);
					@Pc(1143) int local1143 = (local999 >> 16) - 1;
					method2283(local991 <= local1017, local664, local991 <= local999, arg5, arg10, local1137, arg14, Static15.method1474(local1113, local1119, local1087), Static15.method1474(local1105, local1119, local1073), local947, local711, local991 <= local1009, local723, arg2, Static15.method1474(local1095, local1119, local1063), local659, local746, arg11, Static15.method1474(local1079, local1119, local1055), local758, local991 <= local991);
					if (local1049 != local1025) {
						@Pc(1216) GroundModel local1216 = (GroundModel) local277.get(local1049);
						method2283(local1017 >= local999, local664, local999 >= local999, arg5, arg10, local1216, arg14, Static15.method1474(local1113, local1143, local1087), Static15.method1474(local1105, local1143, local1073), local947, local711, local999 <= local1009, local723, arg2, Static15.method1474(local1095, local1143, local1063), local659, local746, arg11, Static15.method1474(local1079, local1143, local1055), local758, local999 <= local991);
					}
					if (local1025 != local1033 && local1033 != local1049) {
						@Pc(1302) GroundModel local1302 = (GroundModel) local277.get(local1033);
						method2283(local1009 <= local1017, local664, local1009 <= local999, arg5, arg10, local1302, arg14, Static15.method1474(local1113, local1131, local1087), Static15.method1474(local1105, local1131, local1073), local947, local711, local1009 <= local1009, local723, arg2, Static15.method1474(local1095, local1131, local1063), local659, local746, arg11, Static15.method1474(local1079, local1131, local1055), local758, local1009 <= local991);
					}
					if (local1041 != local1025 && local1041 != local1049 && local1033 != local1041) {
						@Pc(1392) GroundModel local1392 = (GroundModel) local277.get(local1041);
						method2283(local1017 <= local1017, local664, local999 >= local1017, arg5, arg10, local1392, arg14, Static15.method1474(local1113, local1125, local1087), Static15.method1474(local1105, local1125, local1073), local947, local711, local1017 <= local1009, local723, arg2, Static15.method1474(local1095, local1125, local1063), local659, local746, arg11, Static15.method1474(local1079, local1125, local1055), local758, local1017 <= local991);
					}
				}
			}
		}
		for (@Pc(1466) GroundModel local1466 = (GroundModel) local277.head(); local1466 != null; local1466 = (GroundModel) local277.next()) {
			if (local1466.vertexCount == 0) {
				local1466.unlink();
			} else {
				local1466.build();
			}
		}
		@Pc(1489) int local1489 = local277.size();
		@Pc(1492) GroundModel[] local1492 = new GroundModel[local1489];
		local277.toArray(local1492);
		@Pc(1500) long[] local1500 = new long[local1489];
		for (@Pc(1502) int local1502 = 0; local1502 < local1489; local1502++) {
			local1500[local1502] = local1492[local1502].key;
		}
		ArrayUtils.sort(local1500, local1492);
		return local1492;
	}

}

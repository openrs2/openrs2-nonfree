import java.awt.Point;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Ljava/lang/String;")
	private static String method892(@OriginalArg(1) int arg0) {
		if (arg0 >= 100000) {
			return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + LocalisedText.THOUSAND_SHORT + "</col>" : "<col=00ff80>" + arg0 / 1000000 + LocalisedText.MILLION_SHORT + "</col>";
		} else {
			return "<col=ffff00>" + arg0 + "</col>";
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZIZLclient!qk;IIIZ)Lclient!uj;")
	public static Sprite method965(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) PlayerAppearance arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(9) ObjType local9 = ObjTypeList.get(arg6);
		if (arg2 > 1 && local9.countObj != null) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (local9.countCount[local21] <= arg2 && local9.countCount[local21] != 0) {
					local19 = local9.countObj[local21];
				}
			}
			if (local19 != -1) {
				local9 = ObjTypeList.get(local19);
			}
		}
		@Pc(61) SoftwareModel local61 = local9.method4135(arg4);
		if (local61 == null) {
			return null;
		}
		@Pc(68) SoftwareSprite local68 = null;
		if (local9.certificateTemplate != -1) {
			local68 = (SoftwareSprite) method965(1, false, 10, true, arg4, 0, local9.certificateLink, true);
			if (local68 == null) {
				return null;
			}
		} else if (local9.lentTemplate != -1) {
			local68 = (SoftwareSprite) method965(arg0, false, arg2, false, arg4, arg5, local9.lentLink, true);
			if (local68 == null) {
				return null;
			}
		}
		@Pc(116) int[] local116 = SoftwareRaster.pixels;
		@Pc(118) int local118 = SoftwareRaster.height;
		@Pc(121) int[] local121 = new int[4];
		@Pc(123) int local123 = SoftwareRaster.width;
		SoftwareRaster.getClip(local121);
		@Pc(131) SoftwareSprite local131 = new SoftwareSprite(36, 32);
		SoftwareRaster.setPixels(local131.pixels, 36, 32);
		Static23.method2561();
		Static23.method2556(16, 16);
		Static4.aBoolean216 = false;
		@Pc(145) int local145 = local9.zoom2d;
		if (arg3) {
			local145 = (int) ((double) local145 * 1.5D);
		} else if (arg0 == 2) {
			local145 = (int) ((double) local145 * 1.04D);
		}
		@Pc(174) int local174 = local145 * MathUtils.COSINE[local9.xAngle2d] >> 16;
		@Pc(191) int local191 = MathUtils.SINE[local9.xAngle2d] * local145 >> 16;
		local61.method3822(local9.yAngle2d, local9.zAngle2d, local9.xAngle2d, local9.xOffset2d, local191 + local9.yOffset2d - local61.getMinY() / 2, local9.yOffset2d + local174, -1L);
		if (arg0 >= 1) {
			local131.addOutline(1);
			if (arg0 >= 2) {
				local131.addOutline(16777215);
			}
			SoftwareRaster.setPixels(local131.pixels, 36, 32);
		}
		if (arg5 != 0) {
			local131.addShadow(arg5);
		}
		if (local9.certificateTemplate != -1) {
			local68.renderTransparent(0, 0);
		} else if (local9.lentTemplate != -1) {
			SoftwareRaster.setPixels(local68.pixels, 36, 32);
			local131.renderTransparent(0, 0);
			local131 = local68;
		}
		if (arg1 && (local9.stackable == 1 || arg2 != 1) && arg2 != -1) {
			ObjTypeList.font.renderLeft(method892(arg2), 0, 9, 16776960, 1);
		}
		SoftwareRaster.setPixels(local116, local123, local118);
		SoftwareRaster.setClip(local121);
		Static23.method2561();
		Static4.aBoolean216 = true;
		return GlRenderer.enabled && !arg7 ? new GlSprite(local131) : local131;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)V")
	public static void method966(@OriginalArg(0) int arg0) {
		if (!Preferences.customCursors) {
			arg0 = -1;
		}
		if (Static7.anInt5345 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) CursorType local23 = CursorTypeList.get(arg0);
			@Pc(27) SoftwareSprite local27 = local23.getSprite();
			if (local27 == null) {
				arg0 = -1;
			} else {
				GameShell.signLink.setCursor(GameShell.canvas, local27.innerWidth, local27.innerHeight, local27.getPixels(), new Point(local23.hotSpotX, local23.hotSpotY));
				Static7.anInt5345 = arg0;
			}
		}
		if (arg0 == -1 && Static7.anInt5345 != -1) {
			GameShell.signLink.setCursor(GameShell.canvas, -1, -1, null, new Point());
			Static7.anInt5345 = -1;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([IIIIII)V")
	private static void method970(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Tile local7 = SceneGraph.tiles[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) PlainTile local13 = local7.plainTile;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4294;
			if (local18 != 0) {
				for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) ShapedTile local58 = local7.shapedTile;
		if (local58 == null) {
			return;
		}
		@Pc(64) int local64 = local58.anInt5224;
		@Pc(67) int local67 = local58.anInt5226;
		@Pc(70) int local70 = local58.anInt5227;
		@Pc(73) int local73 = local58.anInt5225;
		@Pc(77) int[] local77 = Static4.anIntArrayArray28[local64];
		@Pc(81) int[] local81 = Static6.anIntArrayArray25[local67];
		@Pc(83) int local83 = 0;
		if (local70 != 0) {
			for (@Pc(87) int local87 = 0; local87 < 4; local87++) {
				@Pc(96) int local96 = local83 + 1;
				arg0[arg1] = local77[local81[local83]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local96++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local96++]] == 0 ? local70 : local73;
				@Pc(137) int local137 = arg1 + 3;
				local83 = local96 + 1;
				arg0[local137] = local77[local81[local96]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (@Pc(157) int local157 = 0; local157 < 4; local157++) {
			@Pc(164) int local164 = local83 + 1;
			if (local77[local81[local83]] != 0) {
				arg0[arg1] = local73;
			}
			@Pc(175) int local175 = local164 + 1;
			if (local77[local81[local164]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			@Pc(188) int local188 = local175 + 1;
			if (local77[local81[local175]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			local83 = local188 + 1;
			if (local77[local81[local188]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public static void method933() {
		for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
			Static2.aBooleanArray8[local15] = true;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IJII)Z")
	public static boolean method1004(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg1 >> 20 & 0x3;
		@Pc(23) int local23 = (int) arg1 >> 14 & 0x1F;
		@Pc(30) int local30 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local23 == 10 || local23 == 11 || local23 == 22) {
			@Pc(49) LocType local49 = LocTypeList.get(local30);
			@Pc(52) int local52 = local49.anInt5538;
			@Pc(63) int local63;
			@Pc(66) int local66;
			if (local12 == 0 || local12 == 2) {
				local66 = local49.length;
				local63 = local49.width;
			} else {
				local63 = local49.length;
				local66 = local49.width;
			}
			if (local12 != 0) {
				local52 = (local52 << local12 & 0xF) + (local52 >> 4 - local12);
			}
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], arg2, arg0, 0, local63, local66, 0, local52);
		} else {
			PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], arg2, arg0, local23 + 1, 0, 0, local12, 0);
		}
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
	public static boolean method1005(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(12) int local12 = MiniMenu.actions[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		return local12 == 1009;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
	public static void method1007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1012) {
			ScriptRunner.method2710(10, arg0, arg2);
		} else if (arg1 == 1002) {
			ScriptRunner.method2710(11, arg0, arg2);
		} else if (arg1 == 1008) {
			ScriptRunner.method2710(12, arg0, arg2);
		} else if (arg1 == 1003) {
			ScriptRunner.method2710(13, arg0, arg2);
		} else if (arg1 == 1011) {
			ScriptRunner.method2710(14, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public static void method1008() {
		for (@Pc(1) int local1 = 0; local1 < SceneGraph.levels; local1++) {
			for (@Pc(6) int local6 = 0; local6 < SceneGraph.width; local6++) {
				for (@Pc(11) int local11 = 0; local11 < SceneGraph.length; local11++) {
					@Pc(22) Tile local22 = SceneGraph.tiles[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Wall local27 = local22.wall;
						if (local27 != null && local27.primary.method3808()) {
							Static20.method1951(local27.primary, local1, local6, local11, 1, 1);
							if (local27.secondary != null && local27.secondary.method3808()) {
								Static20.method1951(local27.secondary, local1, local6, local11, 1, 1);
								local27.primary.method3807(local27.secondary, 0, 0, 0, false);
								local27.secondary = local27.secondary.method3809();
							}
							local27.primary = local27.primary.method3809();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.sceneryLen; local83++) {
							@Pc(92) Scenery local92 = local22.scenery[local83];
							if (local92 != null && local92.entity.method3808()) {
								Static20.method1951(local92.entity, local1, local6, local11, local92.xMax + 1 - local92.xMin, local92.zMax + 1 - local92.zMin);
								local92.entity = local92.entity.method3809();
							}
						}
						@Pc(131) GroundDecor local131 = local22.groundDecor;
						if (local131 != null && local131.entity.method3808()) {
							Static26.method2981(local131.entity, local1, local6, local11);
							local131.entity = local131.entity.method3809();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Z")
	public static boolean method1009(@OriginalArg(1) int arg0) {
		if (Static3.aClass4_Sub3_Sub14_Sub1_3 == null) {
			if (GlRenderer.enabled || Static5.aClass4_Sub3_Sub14_4 == null) {
				Static3.aClass4_Sub3_Sub14_Sub1_3 = new SoftwareSprite(512, 512);
			} else {
				Static3.aClass4_Sub3_Sub14_Sub1_3 = (SoftwareSprite) Static5.aClass4_Sub3_Sub14_4;
			}
			@Pc(38) int[] local38 = Static3.aClass4_Sub3_Sub14_Sub1_3.pixels;
			@Pc(41) int local41 = local38.length;
			for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
				local38[local43] = 1;
			}
			for (@Pc(57) int local57 = 1; local57 < 103; local57++) {
				@Pc(80) int local80 = (103 - local57) * 512 * 4 + 24628;
				for (@Pc(84) int local84 = 1; local84 < 103; local84++) {
					if ((Static4.tileFlags[arg0][local84][local57] & 0x18) == 0) {
						method970(local38, local80, arg0, local84, local57);
					}
					if (arg0 < 3 && (Static4.tileFlags[arg0 + 1][local84][local57] & 0x8) != 0) {
						method970(local38, local80, arg0 + 1, local84, local57);
					}
					local80 += 4;
				}
			}
			Static6.anInt4434 = 0;
			for (@Pc(147) int local147 = 0; local147 < 104; local147++) {
				for (@Pc(154) int local154 = 0; local154 < 104; local154++) {
					@Pc(168) long local168 = SceneGraph.getGroundDecorKey(arg0, local147, local154);
					if (local168 == 0L) {
						local168 = SceneGraph.getSceneryKey(arg0, local147, local154);
					}
					if (local168 == 0L) {
						local168 = SceneGraph.getWallKey(arg0, local147, local154);
					}
					if (local168 == 0L) {
						local168 = SceneGraph.getWallDecorKey(arg0, local147, local154);
					}
					if (local168 != 0L) {
						@Pc(227) LocType local227 = LocTypeList.get(Integer.MAX_VALUE & (int) (local168 >>> 32));
						if (!local227.members || LoginManager.mapMembers) {
							@Pc(235) int local235 = local227.anInt5526;
							if (local227.multiLocs != null) {
								for (@Pc(241) int local241 = 0; local241 < local227.multiLocs.length; local241++) {
									if (local227.multiLocs[local241] != -1) {
										@Pc(264) LocType local264 = LocTypeList.get(local227.multiLocs[local241]);
										if (local264.anInt5526 >= 0) {
											local235 = local264.anInt5526;
										}
									}
								}
							}
							if (local235 >= 0) {
								@Pc(280) boolean local280 = false;
								@Pc(284) MelType local284 = MelTypeList.get(local235);
								@Pc(288) int local288 = local147;
								@Pc(293) int local293 = local154;
								if (local284 != null && local284.randomizePosition) {
									local280 = true;
								}
								if (local280) {
									@Pc(309) int[][] local309 = PathFinder.collisionMaps[arg0].flags;
									for (@Pc(311) int local311 = 0; local311 < 10; local311++) {
										@Pc(321) int local321 = (int) (Math.random() * 4.0D);
										if (local321 == 0 && local288 > 0 && local288 > local147 - 3 && (local309[local288 - 1][local293] & 0x2C0108) == 0) {
											local288--;
										}
										if (local321 == 1 && local288 < 103 && local288 < local147 + 3 && (local309[local288 + 1][local293] & 0x2C0180) == 0) {
											local288++;
										}
										if (local321 == 2 && local293 > 0 && local154 - 3 < local293 && (local309[local288][local293 - 1] & 0x2C0102) == 0) {
											local293--;
										}
										if (local321 == 3 && local293 < 103 && local154 + 3 > local293 && (local309[local288][local293 + 1] & 0x2C0120) == 0) {
											local293++;
										}
									}
								}
								Static1.anIntArray15[Static6.anInt4434] = local227.id;
								Static3.anIntArray189[Static6.anInt4434] = local288;
								Static2.anIntArray187[Static6.anInt4434] = local293;
								Static6.anInt4434++;
							}
						}
					}
				}
			}
		}
		Static3.aClass4_Sub3_Sub14_Sub1_3.makeTarget();
		@Pc(504) int local504 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - 10;
		@Pc(515) int local515 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (@Pc(517) int local517 = 1; local517 < 103; local517++) {
			for (@Pc(522) int local522 = 1; local522 < 103; local522++) {
				if ((Static4.tileFlags[arg0][local522][local517] & 0x18) == 0 && !Static37.method4780(local504, arg0, local515, local517, local522)) {
					if (GlRenderer.enabled) {
						SoftwareRaster.pixels = null;
					} else {
						client.frameBuffer.makeTarget();
					}
					return false;
				}
				if (arg0 < 3 && (Static4.tileFlags[arg0 + 1][local522][local517] & 0x8) != 0 && !Static37.method4780(local504, arg0 + 1, local515, local517, local522)) {
					if (GlRenderer.enabled) {
						SoftwareRaster.pixels = null;
					} else {
						client.frameBuffer.makeTarget();
					}
					return false;
				}
			}
		}
		if (GlRenderer.enabled) {
			@Pc(624) int[] local624 = Static3.aClass4_Sub3_Sub14_Sub1_3.pixels;
			@Pc(627) int local627 = local624.length;
			for (@Pc(629) int local629 = 0; local629 < local627; local629++) {
				if (local624[local629] == 0) {
					local624[local629] = 1;
				}
			}
			Static5.aClass4_Sub3_Sub14_4 = new GlSprite(Static3.aClass4_Sub3_Sub14_Sub1_3);
		} else {
			Static5.aClass4_Sub3_Sub14_4 = Static3.aClass4_Sub3_Sub14_Sub1_3;
		}
		if (GlRenderer.enabled) {
			SoftwareRaster.pixels = null;
		} else {
			client.frameBuffer.makeTarget();
		}
		Static3.aClass4_Sub3_Sub14_Sub1_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIII)V")
	public static void method1015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static4.anInt3086 <= arg3 && arg3 <= Static5.anInt4230) {
			arg0 = Static8.method9(Static2.anInt902, arg0, Static3.anInt2553);
			arg1 = Static8.method9(Static2.anInt902, arg1, Static3.anInt2553);
			Static20.method1975(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "()V")
	public static void method1027() {
		Static22.method2303();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!fh;)V")
	public static void method1028(@OriginalArg(0) Js5 archive) {
		Static2.aClass58_37 = archive;
	}
}

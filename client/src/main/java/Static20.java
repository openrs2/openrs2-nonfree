import java.awt.Container;
import java.awt.Insets;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIIIIIIZ)V")
	public static void method2409(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		@Pc(1) int local1 = arg1;
		if (arg1 >= SoftwareRaster.clipWidth) {
			return;
		}
		if (arg1 < SoftwareRaster.clipX) {
			local1 = SoftwareRaster.clipX;
		}
		@Pc(14) int local14 = arg1 + arg5;
		if (local14 <= SoftwareRaster.clipX) {
			return;
		}
		if (local14 > SoftwareRaster.clipWidth) {
			local14 = SoftwareRaster.clipWidth;
		}
		@Pc(25) int local25 = arg2;
		if (arg2 >= SoftwareRaster.clipHeight) {
			return;
		}
		if (arg2 < SoftwareRaster.clipY) {
			local25 = SoftwareRaster.clipY;
		}
		@Pc(38) int local38 = arg2 + arg6;
		if (local38 <= SoftwareRaster.clipY) {
			return;
		}
		if (local38 > SoftwareRaster.clipHeight) {
			local38 = SoftwareRaster.clipHeight;
		}
		@Pc(53) int local53 = local25 * SoftwareRaster.width + local1;
		@Pc(59) int local59 = SoftwareRaster.width + local1 - local14;
		@Pc(63) int local63 = local1 - arg1;
		@Pc(67) int local67 = local14 - arg1;
		@Pc(71) int local71 = local25 - arg2;
		@Pc(75) int local75 = local38 - arg2;
		@Pc(79) int local79 = arg5 - local67;
		@Pc(83) int local83 = arg5 - local63;
		@Pc(87) int local87 = arg6 - local75;
		@Pc(91) int local91 = arg6 - local71;
		if (arg7 == 9) {
			arg7 = 1;
			arg8 = arg8 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg7 = 1;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg7 == 1) {
			if (arg8 == 0) {
				for (@Pc(131) int local131 = local71; local131 < local75; local131++) {
					for (@Pc(136) int local136 = local63; local136 < local67; local136++) {
						if (local136 <= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(170) int local170 = local91 - 1; local170 >= local87; local170--) {
					for (@Pc(175) int local175 = local63; local175 < local67; local175++) {
						if (local175 <= local170) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(207) int local207 = local71; local207 < local75; local207++) {
					for (@Pc(212) int local212 = local63; local212 < local67; local212++) {
						if (local212 >= local207) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(246) int local246 = local91 - 1; local246 >= local87; local246--) {
					for (@Pc(251) int local251 = local63; local251 < local67; local251++) {
						if (local251 >= local246) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 2) {
			if (arg8 == 0) {
				for (@Pc(288) int local288 = local91 - 1; local288 >= local87; local288--) {
					for (@Pc(293) int local293 = local63; local293 < local67; local293++) {
						if (local293 <= local288 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(327) int local327 = local71; local327 < local75; local327++) {
					for (@Pc(332) int local332 = local63; local332 < local67; local332++) {
						if (local53 >= 0 && local53 < arg0.length) {
							if (local332 >= local327 << 1) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						} else {
							local53++;
						}
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(374) int local374 = local71; local374 < local75; local374++) {
					for (@Pc(381) int local381 = local83 - 1; local381 >= local79; local381--) {
						if (local381 <= local374 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(417) int local417 = local91 - 1; local417 >= local87; local417--) {
					for (@Pc(424) int local424 = local83 - 1; local424 >= local79; local424--) {
						if (local424 >= local417 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 3) {
			if (arg8 == 0) {
				for (@Pc(463) int local463 = local91 - 1; local463 >= local87; local463--) {
					for (@Pc(470) int local470 = local83 - 1; local470 >= local79; local470--) {
						if (local470 <= local463 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(506) int local506 = local91 - 1; local506 >= local87; local506--) {
					for (@Pc(511) int local511 = local63; local511 < local67; local511++) {
						if (local511 >= local506 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(545) int local545 = local71; local545 < local75; local545++) {
					for (@Pc(550) int local550 = local63; local550 < local67; local550++) {
						if (local550 <= local545 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(584) int local584 = local71; local584 < local75; local584++) {
					for (@Pc(591) int local591 = local83 - 1; local591 >= local79; local591--) {
						if (local591 >= local584 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 4) {
			if (arg8 == 0) {
				for (@Pc(630) int local630 = local91 - 1; local630 >= local87; local630--) {
					for (@Pc(635) int local635 = local63; local635 < local67; local635++) {
						if (local635 >= local630 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(669) int local669 = local71; local669 < local75; local669++) {
					for (@Pc(674) int local674 = local63; local674 < local67; local674++) {
						if (local674 <= local669 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(708) int local708 = local71; local708 < local75; local708++) {
					for (@Pc(715) int local715 = local83 - 1; local715 >= local79; local715--) {
						if (local715 >= local708 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(751) int local751 = local91 - 1; local751 >= local87; local751--) {
					for (@Pc(758) int local758 = local83 - 1; local758 >= local79; local758--) {
						if (local758 <= local751 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 != 5) {
			if (arg7 == 6) {
				if (arg8 == 0) {
					for (@Pc(962) int local962 = local71; local962 < local75; local962++) {
						for (@Pc(967) int local967 = local63; local967 < local67; local967++) {
							if (local967 <= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (@Pc(1001) int local1001 = local71; local1001 < local75; local1001++) {
						for (@Pc(1006) int local1006 = local63; local1006 < local67; local1006++) {
							if (local1001 <= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (@Pc(1040) int local1040 = local71; local1040 < local75; local1040++) {
						for (@Pc(1045) int local1045 = local63; local1045 < local67; local1045++) {
							if (local1045 >= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (@Pc(1079) int local1079 = local71; local1079 < local75; local1079++) {
						for (@Pc(1084) int local1084 = local63; local1084 < local67; local1084++) {
							if (local1079 >= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 7) {
				if (arg8 == 0) {
					for (@Pc(1120) int local1120 = local71; local1120 < local75; local1120++) {
						for (@Pc(1125) int local1125 = local63; local1125 < local67; local1125++) {
							if (local1125 <= local1120 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (@Pc(1163) int local1163 = local91 - 1; local1163 >= local87; local1163--) {
						for (@Pc(1168) int local1168 = local63; local1168 < local67; local1168++) {
							if (local1168 <= local1163 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (@Pc(1206) int local1206 = local91 - 1; local1206 >= local87; local1206--) {
						for (@Pc(1213) int local1213 = local83 - 1; local1213 >= local79; local1213--) {
							if (local1213 <= local1206 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (@Pc(1249) int local1249 = local71; local1249 < local75; local1249++) {
						for (@Pc(1256) int local1256 = local83 - 1; local1256 >= local79; local1256--) {
							if (local1256 <= local1249 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 8) {
				if (arg8 == 0) {
					for (@Pc(1294) int local1294 = local71; local1294 < local75; local1294++) {
						for (@Pc(1299) int local1299 = local63; local1299 < local67; local1299++) {
							if (local1299 >= local1294 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (@Pc(1337) int local1337 = local91 - 1; local1337 >= local87; local1337--) {
						for (@Pc(1342) int local1342 = local63; local1342 < local67; local1342++) {
							if (local1342 >= local1337 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (@Pc(1380) int local1380 = local91 - 1; local1380 >= local87; local1380--) {
						for (@Pc(1387) int local1387 = local83 - 1; local1387 >= local79; local1387--) {
							if (local1387 >= local1380 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (@Pc(1423) int local1423 = local71; local1423 < local75; local1423++) {
						for (@Pc(1430) int local1430 = local83 - 1; local1430 >= local79; local1430--) {
							if (local1430 >= local1423 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
		} else if (arg8 == 0) {
			for (@Pc(797) int local797 = local91 - 1; local797 >= local87; local797--) {
				for (@Pc(804) int local804 = local83 - 1; local804 >= local79; local804--) {
					if (local804 >= local797 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 1) {
			for (@Pc(840) int local840 = local91 - 1; local840 >= local87; local840--) {
				for (@Pc(845) int local845 = local63; local845 < local67; local845++) {
					if (local845 <= local840 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 2) {
			for (@Pc(879) int local879 = local71; local879 < local75; local879++) {
				for (@Pc(884) int local884 = local63; local884 < local67; local884++) {
					if (local884 >= local879 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 3) {
			for (@Pc(918) int local918 = local71; local918 < local75; local918++) {
				for (@Pc(925) int local925 = local83 - 1; local925 >= local79; local925--) {
					if (local925 <= local918 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
	public static void method1924() {
		if (Static7.aBoolean401) {
			return;
		}
		if (Preferences.aBoolean293) {
			Static5.aFloat97 = (int) Static5.aFloat97 + 191 & 0xFFFFFF80;
		} else {
			Static4.aFloat79 += (24.0F - Static4.aFloat79) / 2.0F;
		}
		Static7.aBoolean401 = true;
		Static5.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public static void method1929() {
		Static1.aClass4_Sub3_Sub10_2 = null;
		Static1.aClass4_Sub3_Sub10_1 = null;
		Static2.aClass4_Sub3_Sub10_3 = null;
		Static3.aClass4_Sub3_Sub10_4 = null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIZ)V")
	public static void method1930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static2.anInt902 <= arg0 && Static3.anInt2553 >= arg0) {
			arg1 = IntUtils.clamp(arg1, Static4.anInt3086, Static5.anInt4230);
			arg2 = IntUtils.clamp(arg2, Static4.anInt3086, Static5.anInt4230);
			Static10.method306(arg0, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
	public static void method1932() {
		if (PlayerList.self != null && PlayerList.self.xFine + 64 - PlayerList.self.getSize() * 64 >> 7 == MiniMap.flagX && PlayerList.self.zFine + 64 - PlayerList.self.getSize() * 64 >> 7 == MiniMap.flagY) {
			MiniMap.aBoolean147 = false;
			MiniMap.flagX = 0;
		}
		for (@Pc(46) int x = 0; x < 104; x++) {
			for (@Pc(53) int z = 0; z < 104; z++) {
				Static1.anIntArrayArray2[x][z] = 0;
			}
		}
		for (@Pc(79) int i = 0; i < PlayerList.size; i++) {
			@Pc(92) Player player = PlayerList.players[PlayerList.ids[i]];
			if (player != null) {
				player.aBoolean281 = false;
			}
		}
		for (@Pc(103) int i = 0; i < NpcList.size; i++) {
			@Pc(112) Npc npc = NpcList.npcs[NpcList.ids[i]];
			if (npc != null) {
				npc.aBoolean281 = false;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	public static void method1949() {
		@Pc(9) Container container;
		if (GameShell.fullScreenFrame != null) {
			container = GameShell.fullScreenFrame;
		} else if (GameShell.frame == null) {
			container = GameShell.signLink.applet;
		} else {
			container = GameShell.frame;
		}
		GameShell.frameWidth = container.getSize().width;
		GameShell.frameHeight = container.getSize().height;
		if (container == GameShell.frame) {
			@Pc(35) Insets insets = GameShell.frame.getInsets();
			GameShell.frameWidth -= insets.left + insets.right;
			GameShell.frameHeight -= insets.bottom + insets.top;
		}
		if (Static11.getWindowMode() >= 2) {
			GameShell.topMargin = 0;
			GameShell.canvasWidth = GameShell.frameWidth;
			GameShell.leftMargin = 0;
			GameShell.canvasHeight = GameShell.frameHeight;
		} else {
			GameShell.canvasWidth = 765;
			GameShell.canvasHeight = 503;
			GameShell.leftMargin = (GameShell.frameWidth - 765) / 2;
			GameShell.topMargin = 0;
		}
		if (GlRenderer.enabled) {
			GlRenderer.setCanvasSize(GameShell.canvasWidth, GameShell.canvasHeight);
		}
		GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
		if (container == GameShell.frame) {
			@Pc(104) Insets local104 = GameShell.frame.getInsets();
			GameShell.canvas.setLocation(local104.left + GameShell.leftMargin, GameShell.topMargin + local104.top);
		} else {
			GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
		}
		if (InterfaceList.topLevelInterface != -1) {
			Static12.method777(true);
		}
		Static29.method3430();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!vc;IIIII)V")
	public static void method1951(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != SceneGraph.levels) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < SceneGraph.width) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < SceneGraph.length && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Tile local71 = SceneGraph.tiles[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (SceneGraph.tileHeights[local17][local28][local39] + SceneGraph.tileHeights[local17][local28 + 1][local39] + SceneGraph.tileHeights[local17][local28][local39 + 1] + SceneGraph.tileHeights[local17][local28 + 1][local39 + 1]) / 4 - (SceneGraph.tileHeights[arg1][arg2][arg3] + SceneGraph.tileHeights[arg1][arg2 + 1][arg3] + SceneGraph.tileHeights[arg1][arg2][arg3 + 1] + SceneGraph.tileHeights[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Wall local161 = local71.wall;
									if (local161 != null) {
										if (local161.primary.method3808()) {
											arg0.method3807(local161.primary, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.secondary != null && local161.secondary.method3808()) {
											arg0.method3807(local161.secondary, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.sceneryLen; local232++) {
										@Pc(241) Scenery local241 = local71.scenery[local232];
										if (local241 != null && local241.entity.method3808() && (local28 == local241.xMin || local28 == local3) && (local39 == local241.zMin || local39 == local11)) {
											@Pc(270) int local270 = local241.xMax + 1 - local241.xMin;
											@Pc(278) int local278 = local241.zMax + 1 - local241.zMin;
											arg0.method3807(local241.entity, (local241.xMin - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.zMin - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIZI)I")
	public static int method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg0;
		} else {
			@Pc(19) int local19 = 128 - arg2;
			@Pc(37) int local37 = arg2 * (arg1 >>> 7 & 0x1FE01FE) + (arg0 >>> 7 & 0x1FE01FE) * local19 & 0xFF00FF00;
			@Pc(51) int local51 = arg2 * (arg1 & 0xFF00FF) + (arg0 & 0xFF00FF) * local19 & 0xFF00FF00;
			return local37 + (local51 >> 7);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIII)V")
	public static void method1975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg0) {
			ArrayUtils.fillRange(Static5.anIntArrayArray36[arg3], arg0, arg1, arg2);
		} else {
			ArrayUtils.fillRange(Static5.anIntArrayArray36[arg3], arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method1976() {
		for (@Pc(16) ProjAnimNode node = (ProjAnimNode) Static1.projAnims.head(); node != null; node = (ProjAnimNode) Static1.projAnims.next()) {
			@Pc(22) ProjAnim projAnim = node.value;
			if (projAnim.anInt3717 != Player.level || client.loop > projAnim.anInt3707) {
				node.unlink();
			} else if (projAnim.anInt3719 <= client.loop) {
				if (projAnim.anInt3713 > 0) {
					@Pc(61) Npc npc = NpcList.npcs[projAnim.anInt3713 - 1];
					if (npc != null && npc.xFine >= 0 && npc.xFine < 13312 && npc.zFine >= 0 && npc.zFine < 13312) {
						projAnim.method3105(SceneGraph.getTileHeight(projAnim.anInt3717, npc.xFine, npc.zFine) - projAnim.anInt3722, npc.xFine, client.loop, npc.zFine);
					}
				}
				if (projAnim.anInt3713 < 0) {
					@Pc(113) int local113 = -projAnim.anInt3713 - 1;
					@Pc(118) Player player;
					if (PlayerList.selfId == local113) {
						player = PlayerList.self;
					} else {
						player = PlayerList.players[local113];
					}
					if (player != null && player.xFine >= 0 && player.xFine < 13312 && player.zFine >= 0 && player.zFine < 13312) {
						projAnim.method3105(SceneGraph.getTileHeight(projAnim.anInt3717, player.xFine, player.zFine) - projAnim.anInt3722, player.xFine, client.loop, player.zFine);
					}
				}
				projAnim.method3103(Static5.anInt4156);
				SceneGraph.method637(Player.level, (int) projAnim.aDouble8, (int) projAnim.aDouble10, (int) projAnim.aDouble5, 60, projAnim, projAnim.anInt3723, -1L, false);
			}
		}
	}

}

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	private static void method3400() {
		if (Static5.aClass185_10 != null || (Static1.aClass185_1 != null || Static1.anInt640 > 0)) {
			return;
		}
		@Pc(22) int local22 = Mouse.clickButton;
		if (!Static1.aBoolean17) {
			if (local22 == 1 && MiniMenu.size > 0) {
				@Pc(47) short action = MiniMenu.actions[MiniMenu.size - 1];
				if (action == 30 || action == 20 || action == 13 || action == 2 || action == 49 || action == 58 || action == 35 || action == 17 || action == 10 || action == 51 || action == 9 || action == 1001) {
					@Pc(99) int local99 = MiniMenu.intArgs2[MiniMenu.size - 1];
					@Pc(105) int local105 = MiniMenu.intArgs1[MiniMenu.size - 1];
					@Pc(109) Component local109 = InterfaceList.getComponent(local99);
					@Pc(112) ServerActiveProperties local112 = InterfaceList.getServerActiveProperties(local109);
					if (local112.isObjSwapEnabled() || local112.isObjReplaceEnabled()) {
						Static2.anInt1267 = 0;
						Static5.aBoolean276 = false;
						if (Static5.aClass185_10 != null) {
							Static28.method3270(Static5.aClass185_10);
						}
						Static5.aClass185_10 = InterfaceList.getComponent(local99);
						Static1.anInt547 = Mouse.clickX;
						Static1.anInt91 = local105;
						Static1.anInt789 = Mouse.clickY;
						Static28.method3270(Static5.aClass185_10);
						return;
					}
				}
			}
			if (local22 == 1 && (Static3.anInt5400 == 1 && MiniMenu.size > 2 || MiniMenu.method1005(MiniMenu.size - 1))) {
				local22 = 2;
			}
			if (local22 == 2 && MiniMenu.size > 0 || Static2.anInt1940 == 1) {
				Static31.method3783();
			}
			if (local22 == 1 && MiniMenu.size > 0 || Static2.anInt1940 == 2) {
				Static37.method4784();
			}
			return;
		}
		if (local22 != 1) {
			@Pc(200) int local200 = Mouse.x;
			@Pc(202) int local202 = Mouse.y;
			if (local200 < Static5.anInt3890 - 10 || local200 > Static6.anInt4440 + Static5.anInt3890 + 10 || local202 < Static4.anInt3455 - 10 || Static3.anInt2394 + Static4.anInt3455 + 10 < local202) {
				Static1.aBoolean17 = false;
				Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
			}
		}
		if (local22 != 1) {
			return;
		}
		@Pc(251) int local251 = Static5.anInt3890;
		@Pc(253) int local253 = Static4.anInt3455;
		@Pc(255) int local255 = Mouse.clickX;
		@Pc(257) int local257 = Mouse.clickY;
		@Pc(259) int local259 = Static6.anInt4440;
		@Pc(261) int local261 = -1;
		for (@Pc(263) int local263 = 0; local263 < MiniMenu.size; local263++) {
			if (Static7.aBoolean389) {
				@Pc(325) int local325 = (MiniMenu.size - local263 - 1) * 15 + local253 + 33;
				if (local251 < local255 && local259 + local251 > local255 && local325 - 13 < local257 && local325 + 3 > local257) {
					local261 = local263;
				}
			} else {
				@Pc(281) int local281 = (MiniMenu.size - local263 - 1) * 15 + local253 + 31;
				if (local251 < local255 && local259 + local251 > local255 && local281 - 13 < local257 && local281 + 3 > local257) {
					local261 = local263;
				}
			}
		}
		if (local261 != -1) {
			MiniMenu.doAction(local261);
		}
		Static1.aBoolean17 = false;
		Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)I")
	public static int rotateZoneX(@OriginalArg(3) int x, @OriginalArg(1) int z, @OriginalArg(0) int width, @OriginalArg(6) int length, @OriginalArg(2) int angle, @OriginalArg(4) int rotation) {
		rotation &= 3;
		if ((angle & 0x1) == 1) {
			@Pc(17) int temp = width;
			width = length;
			length = temp;
		}
		if (rotation == 0) {
			return x;
		} else if (rotation == 1) {
			return z;
		} else if (rotation == 2) {
			return 1 + 7 - width - x;
		} else {
			return 7 + 1 - z - length;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([[[BB[[B[[I[[FI[[B[[B[[I[[B[[F[[F)[Lclient!ih;")
	public static GroundModel[] method3149(@OriginalArg(0) byte[][][] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) float[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) float[][] arg10) {
		@Pc(10) HashTable local10 = new HashTable(128);
		for (@Pc(12) int local12 = 1; local12 <= 102; local12++) {
			for (@Pc(17) int local17 = 1; local17 <= 102; local17++) {
				@Pc(30) int local30 = arg8[local12][local17] & 0xFF;
				@Pc(38) int local38 = arg1[local12][local17] & 0xFF;
				if (local38 != 0) {
					@Pc(48) FloType local48 = FloTypeList.get(local38 - 1);
					if (local48.color == -1) {
						continue;
					}
					@Pc(60) GroundModel local60 = Static27.method4237(local10, local48);
					@Pc(66) byte local66 = arg5[local12][local17];
					@Pc(70) int[] local70 = Static1.anIntArrayArray5[local66];
					local60.vertexCapacity += local70.length / 2;
					local60.tileCapacity++;
					if (local48.aBoolean275 && local30 != 0) {
						local60.vertexCapacity += Static4.anIntArray318[local66];
					}
				}
				if ((arg8[local12][local17] & 0xFF) != 0 || local38 != 0 && arg5[local12][local17] == 0) {
					@Pc(125) int local125 = 0;
					@Pc(127) int local127 = 0;
					@Pc(130) int[] local130 = new int[8];
					@Pc(132) int local132 = 0;
					@Pc(134) int local134 = 0;
					@Pc(136) int local136 = 0;
					@Pc(146) int local146 = arg1[local12][local17 + 1] & 0xFF;
					@Pc(156) int local156 = arg1[local12 - 1][local17] & 0xFF;
					@Pc(166) int local166 = arg1[local12][local17 - 1] & 0xFF;
					@Pc(176) int local176 = arg1[local12 + 1][local17] & 0xFF;
					@Pc(188) int local188 = arg1[local12 - 1][local17 + 1] & 0xFF;
					@Pc(200) int local200 = arg1[local12 - 1][local17 - 1] & 0xFF;
					@Pc(212) int local212 = arg1[local12 + 1][local17 - 1] & 0xFF;
					@Pc(224) int local224 = arg1[local12 + 1][local17 + 1] & 0xFF;
					if (local188 != 0 && local38 != local188) {
						@Pc(239) FloType local239 = FloTypeList.get(local188 - 1);
						if (local239.aBoolean275 && local239.color != -1) {
							@Pc(256) byte local256 = arg5[local12 - 1][local17 + 1];
							@Pc(266) byte local266 = arg6[local12 - 1][local17 + 1];
							@Pc(278) int local278 = Static6.anIntArray474[local256 * 4 + (local266 + 2 & 0x3)];
							@Pc(290) int local290 = Static6.anIntArray474[(local266 + 3 & 0x3) + local256 * 4];
							if (!Static2.aBooleanArrayArray2[local290][1] || !Static2.aBooleanArrayArray2[local278][0]) {
								for (@Pc(304) int local304 = 0; local304 < 8; local304++) {
									if (local304 == 0) {
										local125++;
										local130[0] = local188;
										break;
									}
									if (local188 == local130[local304]) {
										break;
									}
								}
							}
						}
					}
					if (local200 != 0 && local38 != local200) {
						@Pc(363) FloType local363 = FloTypeList.get(local200 - 1);
						if (local363.aBoolean275 && local363.color != -1) {
							@Pc(380) byte local380 = arg6[local12 - 1][local17 - 1];
							@Pc(390) byte local390 = arg5[local12 - 1][local17 - 1];
							@Pc(403) int local403 = Static6.anIntArray474[local390 * 4 + (local380 + 3 & 0x3)];
							@Pc(413) int local413 = Static6.anIntArray474[(local380 & 0x3) + local390 * 4];
							if (!Static2.aBooleanArrayArray2[local413][1] || !Static2.aBooleanArrayArray2[local403][0]) {
								for (@Pc(427) int local427 = 0; local427 < 8; local427++) {
									if (local427 == local125) {
										local130[local125++] = local200;
										break;
									}
									if (local200 == local130[local427]) {
										break;
									}
								}
							}
						}
					}
					if (local212 != 0 && local38 != local212) {
						@Pc(471) FloType local471 = FloTypeList.get(local212 - 1);
						if (local471.aBoolean275 && local471.color != -1) {
							@Pc(492) byte local492 = arg6[local12 + 1][local17 - 1];
							@Pc(502) byte local502 = arg5[local12 + 1][local17 - 1];
							@Pc(515) int local515 = Static6.anIntArray474[local502 * 4 + (local492 + 1 & 0x3)];
							@Pc(525) int local525 = Static6.anIntArray474[(local492 & 0x3) + local502 * 4];
							if (!Static2.aBooleanArrayArray2[local515][1] || !Static2.aBooleanArrayArray2[local525][0]) {
								for (@Pc(539) int local539 = 0; local539 < 8; local539++) {
									if (local125 == local539) {
										local130[local125++] = local212;
										break;
									}
									if (local212 == local130[local539]) {
										break;
									}
								}
							}
						}
					}
					if (local224 != 0 && local38 != local224) {
						@Pc(596) FloType local596 = FloTypeList.get(local224 - 1);
						if (local596.aBoolean275 && local596.color != -1) {
							@Pc(617) byte local617 = arg6[local12 + 1][local17 + 1];
							@Pc(627) byte local627 = arg5[local12 + 1][local17 + 1];
							@Pc(640) int local640 = Static6.anIntArray474[local627 * 4 + (local617 + 2 & 0x3)];
							@Pc(652) int local652 = Static6.anIntArray474[(local617 + 1 & 0x3) + local627 * 4];
							if (!Static2.aBooleanArrayArray2[local640][1] || !Static2.aBooleanArrayArray2[local652][0]) {
								for (@Pc(666) int local666 = 0; local666 < 8; local666++) {
									if (local125 == local666) {
										local130[local125++] = local224;
										break;
									}
									if (local130[local666] == local224) {
										break;
									}
								}
							}
						}
					}
					if (local146 != 0 && local146 != local38) {
						@Pc(715) FloType local715 = FloTypeList.get(local146 - 1);
						if (local715.aBoolean275 && local715.color != -1) {
							local127 = Static6.anIntArray474[(arg6[local12][local17 + 1] + 2 & 0x3) + arg5[local12][local17 + 1] * 4];
							for (@Pc(749) int local749 = 0; local749 < 8; local749++) {
								if (local749 == local125) {
									local130[local125++] = local146;
									break;
								}
								if (local146 == local130[local749]) {
									break;
								}
							}
						}
					}
					if (local156 != 0 && local156 != local38) {
						@Pc(785) FloType local785 = FloTypeList.get(local156 - 1);
						if (local785.aBoolean275 && local785.color != -1) {
							local132 = Static6.anIntArray474[(arg6[local12 - 1][local17] + 3 & 0x3) + arg5[local12 - 1][local17] * 4];
							for (@Pc(818) int local818 = 0; local818 < 8; local818++) {
								if (local818 == local125) {
									local130[local125++] = local156;
									break;
								}
								if (local130[local818] == local156) {
									break;
								}
							}
						}
					}
					if (local166 != 0 && local166 != local38) {
						@Pc(860) FloType local860 = FloTypeList.get(local166 - 1);
						if (local860.aBoolean275 && local860.color != -1) {
							local134 = Static6.anIntArray474[arg5[local12][local17 - 1] * 4 + (arg6[local12][local17 - 1] & 0x3)];
							for (@Pc(893) int local893 = 0; local893 < 8; local893++) {
								if (local125 == local893) {
									local130[local125++] = local166;
									break;
								}
								if (local166 == local130[local893]) {
									break;
								}
							}
						}
					}
					if (local176 != 0 && local176 != local38) {
						@Pc(941) FloType local941 = FloTypeList.get(local176 - 1);
						if (local941.aBoolean275 && local941.color != -1) {
							local136 = Static6.anIntArray474[arg5[local12 + 1][local17] * 4 + (arg6[local12 + 1][local17] + 1 & 0x3)];
							for (@Pc(975) int local975 = 0; local975 < 8; local975++) {
								if (local975 == local125) {
									local130[local125++] = local176;
									break;
								}
								if (local176 == local130[local975]) {
									break;
								}
							}
						}
					}
					for (@Pc(999) int local999 = 0; local999 < local125; local999++) {
						@Pc(1006) int local1006 = local130[local999];
						@Pc(1019) boolean[] local1019 = Static2.aBooleanArrayArray2[local1006 == local156 ? local132 : 0];
						@Pc(1028) boolean[] local1028 = Static2.aBooleanArrayArray2[local166 == local1006 ? local134 : 0];
						@Pc(1037) boolean[] local1037 = Static2.aBooleanArrayArray2[local1006 == local176 ? local136 : 0];
						@Pc(1050) boolean[] local1050 = Static2.aBooleanArrayArray2[local146 == local1006 ? local127 : 0];
						@Pc(1056) FloType local1056 = FloTypeList.get(local1006 - 1);
						@Pc(1061) GroundModel local1061 = Static27.method4237(local10, local1056);
						local1061.vertexCapacity += 5;
						local1061.vertexCapacity += local1050.length - 2;
						local1061.vertexCapacity += local1019.length - 2;
						local1061.vertexCapacity += local1028.length - 2;
						local1061.vertexCapacity += local1037.length - 2;
						local1061.tileCapacity++;
					}
				}
			}
		}
		for (@Pc(1123) GroundModel local1123 = (GroundModel) local10.head(); local1123 != null; local1123 = (GroundModel) local10.next()) {
			local1123.clear();
		}
		for (@Pc(1137) int local1137 = 1; local1137 <= 102; local1137++) {
			for (@Pc(1144) int local1144 = 1; local1144 <= 102; local1144++) {
				@Pc(1159) int local1159;
				if ((arg0[arg4][local1137][local1144] & 0x8) != 0) {
					local1159 = 0;
				} else if ((arg0[1][local1137][local1144] & 0x2) == 2 && arg4 > 0) {
					local1159 = arg4 - 1;
				} else {
					local1159 = arg4;
				}
				@Pc(1195) int local1195 = arg1[local1137][local1144] & 0xFF;
				@Pc(1203) int local1203 = arg8[local1137][local1144] & 0xFF;
				if (local1195 != 0) {
					@Pc(1215) FloType local1215 = FloTypeList.get(local1195 - 1);
					if (local1215.color == -1) {
						continue;
					}
					@Pc(1227) GroundModel local1227 = Static27.method4237(local10, local1215);
					@Pc(1233) byte local1233 = arg5[local1137][local1144];
					@Pc(1239) byte local1239 = arg6[local1137][local1144];
					@Pc(1251) int local1251 = Static15.method1474(arg2[local1137][local1144], local1215.texture, local1215.color);
					@Pc(1265) int local1265 = Static15.method1474(arg2[local1137 + 1][local1144], local1215.texture, local1215.color);
					@Pc(1281) int local1281 = Static15.method1474(arg2[local1137 + 1][local1144 + 1], local1215.texture, local1215.color);
					@Pc(1295) int local1295 = Static15.method1474(arg2[local1137][local1144 + 1], local1215.texture, local1215.color);
					Static11.method521(arg10, local1265, local1159, local1295, local1281, arg3, local1251, local1233, local1239, local1227, local1203 != 0 && local1215.aBoolean275, arg9, arg7, local1137, local1144);
				}
				if ((arg8[local1137][local1144] & 0xFF) != 0 || local1195 != 0 && arg5[local1137][local1144] == 0) {
					@Pc(1341) int local1341 = 0;
					@Pc(1344) int[] local1344 = new int[8];
					@Pc(1346) int local1346 = 0;
					@Pc(1348) int local1348 = 0;
					@Pc(1350) int local1350 = 0;
					@Pc(1352) int local1352 = 0;
					@Pc(1362) int local1362 = arg1[local1137 - 1][local1144] & 0xFF;
					@Pc(1372) int local1372 = arg1[local1137 + 1][local1144] & 0xFF;
					@Pc(1382) int local1382 = arg1[local1137][local1144 - 1] & 0xFF;
					@Pc(1392) int local1392 = arg1[local1137][local1144 + 1] & 0xFF;
					@Pc(1404) int local1404 = arg1[local1137 - 1][local1144 - 1] & 0xFF;
					@Pc(1416) int local1416 = arg1[local1137 - 1][local1144 + 1] & 0xFF;
					@Pc(1428) int local1428 = arg1[local1137 + 1][local1144 - 1] & 0xFF;
					@Pc(1440) int local1440 = arg1[local1137 + 1][local1144 + 1] & 0xFF;
					if (local1416 == 0 || local1195 == local1416) {
						local1416 = 0;
					} else {
						@Pc(1454) FloType local1454 = FloTypeList.get(local1416 - 1);
						if (local1454.aBoolean275 && local1454.color != -1) {
							@Pc(1476) byte local1476 = arg6[local1137 - 1][local1144 + 1];
							@Pc(1486) byte local1486 = arg5[local1137 - 1][local1144 + 1];
							@Pc(1498) int local1498 = Static6.anIntArray474[local1486 * 4 + (local1476 + 3 & 0x3)];
							@Pc(1510) int local1510 = Static6.anIntArray474[(local1476 + 2 & 0x3) + local1486 * 4];
							if (Static2.aBooleanArrayArray2[local1498][1] && Static2.aBooleanArrayArray2[local1510][0]) {
								local1416 = 0;
							} else {
								for (@Pc(1528) int local1528 = 0; local1528 < 8; local1528++) {
									if (local1528 == 0) {
										local1341++;
										local1344[0] = local1416;
										break;
									}
									if (local1416 == local1344[local1528]) {
										break;
									}
								}
							}
						} else {
							local1416 = 0;
						}
					}
					if (local1404 == 0 || local1195 == local1404) {
						local1404 = 0;
					} else {
						@Pc(1572) FloType local1572 = FloTypeList.get(local1404 - 1);
						if (local1572.aBoolean275 && local1572.color != -1) {
							@Pc(1591) byte local1591 = arg6[local1137 - 1][local1144 - 1];
							@Pc(1601) byte local1601 = arg5[local1137 - 1][local1144 - 1];
							@Pc(1612) int local1612 = Static6.anIntArray474[local1601 * 4 + (local1591 & 0x3)];
							@Pc(1624) int local1624 = Static6.anIntArray474[(local1591 + 3 & 0x3) + local1601 * 4];
							if (Static2.aBooleanArrayArray2[local1612][1] && Static2.aBooleanArrayArray2[local1624][0]) {
								local1404 = 0;
							} else {
								for (@Pc(1642) int local1642 = 0; local1642 < 8; local1642++) {
									if (local1341 == local1642) {
										local1344[local1341++] = local1404;
										break;
									}
									if (local1344[local1642] == local1404) {
										break;
									}
								}
							}
						} else {
							local1404 = 0;
						}
					}
					if (local1428 == 0 || local1428 == local1195) {
						local1428 = 0;
					} else {
						@Pc(1694) FloType local1694 = FloTypeList.get(local1428 - 1);
						if (local1694.aBoolean275 && local1694.color != -1) {
							@Pc(1711) byte local1711 = arg6[local1137 + 1][local1144 - 1];
							@Pc(1721) byte local1721 = arg5[local1137 + 1][local1144 - 1];
							@Pc(1732) int local1732 = Static6.anIntArray474[local1721 * 4 + (local1711 & 0x3)];
							@Pc(1744) int local1744 = Static6.anIntArray474[(local1711 + 1 & 0x3) + local1721 * 4];
							if (Static2.aBooleanArrayArray2[local1744][1] && Static2.aBooleanArrayArray2[local1732][0]) {
								local1428 = 0;
							} else {
								for (@Pc(1762) int local1762 = 0; local1762 < 8; local1762++) {
									if (local1341 == local1762) {
										local1344[local1341++] = local1428;
										break;
									}
									if (local1428 == local1344[local1762]) {
										break;
									}
								}
							}
						} else {
							local1428 = 0;
						}
					}
					if (local1440 == 0 || local1440 == local1195) {
						local1440 = 0;
					} else {
						@Pc(1810) FloType local1810 = FloTypeList.get(local1440 - 1);
						if (local1810.aBoolean275 && local1810.color != -1) {
							@Pc(1827) byte local1827 = arg6[local1137 + 1][local1144 + 1];
							@Pc(1837) byte local1837 = arg5[local1137 + 1][local1144 + 1];
							@Pc(1849) int local1849 = Static6.anIntArray474[(local1827 + 1 & 0x3) + local1837 * 4];
							@Pc(1861) int local1861 = Static6.anIntArray474[(local1827 + 2 & 0x3) + local1837 * 4];
							if (Static2.aBooleanArrayArray2[local1861][1] && Static2.aBooleanArrayArray2[local1849][0]) {
								local1440 = 0;
							} else {
								for (@Pc(1879) int local1879 = 0; local1879 < 8; local1879++) {
									if (local1879 == local1341) {
										local1344[local1341++] = local1440;
										break;
									}
									if (local1440 == local1344[local1879]) {
										break;
									}
								}
							}
						} else {
							local1440 = 0;
						}
					}
					if (local1392 != 0 && local1392 != local1195) {
						@Pc(1926) FloType local1926 = FloTypeList.get(local1392 - 1);
						if (local1926.aBoolean275 && local1926.color != -1) {
							local1346 = Static6.anIntArray474[arg5[local1137][local1144 + 1] * 4 + (arg6[local1137][local1144 + 1] + 2 & 0x3)];
							for (@Pc(1960) int local1960 = 0; local1960 < 8; local1960++) {
								if (local1960 == local1341) {
									local1344[local1341++] = local1392;
									break;
								}
								if (local1344[local1960] == local1392) {
									break;
								}
							}
						}
					}
					if (local1362 != 0 && local1195 != local1362) {
						@Pc(2003) FloType local2003 = FloTypeList.get(local1362 - 1);
						if (local2003.aBoolean275 && local2003.color != -1) {
							local1348 = Static6.anIntArray474[arg5[local1137 - 1][local1144] * 4 + (arg6[local1137 - 1][local1144] + 3 & 0x3)];
							for (@Pc(2036) int local2036 = 0; local2036 < 8; local2036++) {
								if (local2036 == local1341) {
									local1344[local1341++] = local1362;
									break;
								}
								if (local1362 == local1344[local2036]) {
									break;
								}
							}
						}
					}
					if (local1382 != 0 && local1195 != local1382) {
						@Pc(2080) FloType local2080 = FloTypeList.get(local1382 - 1);
						if (local2080.aBoolean275 && local2080.color != -1) {
							local1350 = Static6.anIntArray474[arg5[local1137][local1144 - 1] * 4 + (arg6[local1137][local1144 - 1] & 0x3)];
							for (@Pc(2113) int local2113 = 0; local2113 < 8; local2113++) {
								if (local2113 == local1341) {
									local1344[local1341++] = local1382;
									break;
								}
								if (local1344[local2113] == local1382) {
									break;
								}
							}
						}
					}
					if (local1372 != 0 && local1195 != local1372) {
						@Pc(2147) FloType local2147 = FloTypeList.get(local1372 - 1);
						if (local2147.aBoolean275 && local2147.color != -1) {
							local1352 = Static6.anIntArray474[arg5[local1137 + 1][local1144] * 4 + (arg6[local1137 + 1][local1144] + 1 & 0x3)];
							for (@Pc(2184) int local2184 = 0; local2184 < 8; local2184++) {
								if (local1341 == local2184) {
									local1344[local1341++] = local1372;
									break;
								}
								if (local1372 == local1344[local2184]) {
									break;
								}
							}
						}
					}
					for (@Pc(2215) int local2215 = 0; local2215 < local1341; local2215++) {
						@Pc(2226) int local2226 = local1344[local2215];
						@Pc(2235) boolean[] local2235 = Static2.aBooleanArrayArray2[local1392 == local2226 ? local1346 : 0];
						@Pc(2244) boolean[] local2244 = Static2.aBooleanArrayArray2[local2226 == local1362 ? local1348 : 0];
						@Pc(2257) boolean[] local2257 = Static2.aBooleanArrayArray2[local2226 == local1382 ? local1350 : 0];
						@Pc(2266) boolean[] local2266 = Static2.aBooleanArrayArray2[local2226 == local1372 ? local1352 : 0];
						@Pc(2272) FloType local2272 = FloTypeList.get(local2226 - 1);
						@Pc(2277) GroundModel local2277 = Static27.method4237(local10, local2272);
						@Pc(2293) int local2293 = Static15.method1474(arg2[local1137][local1144], local2272.texture, local2272.color) << 8 | 0xFF;
						@Pc(2311) int local2311 = Static15.method1474(arg2[local1137 + 1][local1144], local2272.texture, local2272.color) << 8 | 0xFF;
						@Pc(2331) int local2331 = Static15.method1474(arg2[local1137 + 1][local1144 + 1], local2272.texture, local2272.color) << 8 | 0xFF;
						@Pc(2351) int local2351 = Static15.method1474(arg2[local1137][local1144 + 1], local2272.texture, local2272.color) << 8 | 0xFF;
						@Pc(2358) int local2358 = local2235.length + 6 - 2;
						local2358 += local2244.length - 2;
						@Pc(2384) boolean local2384 = local2226 != local1416 && local2244[0] && local2235[1];
						local2358 += local2257.length - 2;
						local2358 += local2266.length - 2;
						@Pc(2413) boolean local2413 = local2226 != local1428 && local2266[0] && local2257[1];
						@Pc(2432) boolean local2432 = local1404 != local2226 && local2257[0] && local2244[1];
						@Pc(2435) int[] local2435 = new int[local2358];
						@Pc(2454) boolean local2454 = local2226 != local1440 && local2235[0] && local2266[1];
						@Pc(2456) byte local2456 = 0;
						@Pc(2477) int local2477 = Static37.method4757(arg3, 64, local1144, arg7, arg9, null, local2277, local2311, local1137, true, 0.0F, arg10, 0, 64, local2351, local2331, local2293);
						@Pc(2498) int local2498 = Static37.method4757(arg3, 128, local1144, arg7, arg9, null, local2277, local2311, local1137, local2384, 0.0F, arg10, 0, 0, local2351, local2331, local2293);
						@Pc(2519) int local2519 = Static37.method4757(arg3, 128, local1144, arg7, arg9, null, local2277, local2311, local1137, local2454, 0.0F, arg10, 0, 128, local2351, local2331, local2293);
						@Pc(2540) int local2540 = Static37.method4757(arg3, 0, local1144, arg7, arg9, null, local2277, local2311, local1137, local2432, 0.0F, arg10, 0, 0, local2351, local2331, local2293);
						@Pc(2561) int local2561 = Static37.method4757(arg3, 0, local1144, arg7, arg9, null, local2277, local2311, local1137, local2413, 0.0F, arg10, 0, 128, local2351, local2331, local2293);
						local2358 = local2456 + 1;
						local2435[0] = local2477;
						@Pc(2569) int local2569 = local2358 + 1;
						local2435[1] = local2519;
						if (local2235.length > 2) {
							local2569++;
							local2435[2] = Static37.method4757(arg3, 128, local1144, arg7, arg9, null, local2277, local2311, local1137, local2235[2], 0.0F, arg10, 0, 64, local2351, local2331, local2293);
						}
						@Pc(2604) int local2604 = local2569 + 1;
						local2435[local2569] = local2498;
						if (local2244.length > 2) {
							local2435[local2604++] = Static37.method4757(arg3, 64, local1144, arg7, arg9, null, local2277, local2311, local1137, local2244[2], 0.0F, arg10, 0, 0, local2351, local2331, local2293);
						}
						@Pc(2641) int local2641 = local2604 + 1;
						local2435[local2604] = local2540;
						if (local2257.length > 2) {
							local2435[local2641++] = Static37.method4757(arg3, 0, local1144, arg7, arg9, null, local2277, local2311, local1137, local2257[2], 0.0F, arg10, 0, 64, local2351, local2331, local2293);
						}
						@Pc(2678) int local2678 = local2641 + 1;
						local2435[local2641] = local2561;
						if (local2266.length > 2) {
							local2435[local2678++] = Static37.method4757(arg3, 64, local1144, arg7, arg9, null, local2277, local2311, local1137, local2266[2], 0.0F, arg10, 0, 128, local2351, local2331, local2293);
						}
						@Pc(2714) int local2714 = local2678 + 1;
						local2435[local2678] = local2519;
						local2277.addTile(local1159, local1137, local1144, local2435, null, true);
					}
				}
			}
		}
		for (@Pc(2739) GroundModel local2739 = (GroundModel) local10.head(); local2739 != null; local2739 = (GroundModel) local10.next()) {
			if (local2739.vertexCount == 0) {
				local2739.unlink();
			} else {
				local2739.build();
			}
		}
		@Pc(2766) int local2766 = local10.size();
		@Pc(2774) GroundModel[] local2774 = new GroundModel[local2766];
		@Pc(2777) long[] local2777 = new long[local2766];
		local10.toArray(local2774);
		for (@Pc(2784) int local2784 = 0; local2784 < local2766; local2784++) {
			local2777[local2784] = local2774[local2784].key;
		}
		ArrayUtils.sort(local2777, local2774);
		return local2774;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(IIIIII)V")
	public static void method3429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static2.anInt902 <= arg0 && arg2 <= Static3.anInt2553 && Static4.anInt3086 <= arg3 && arg1 <= Static5.anInt4230) {
			Static15.method1477(arg3, arg0, arg1, arg4, arg2);
		} else {
			Static22.method4701(arg0, arg2, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
	public static void method3430() {
		@Pc(7) int local7 = GameShell.leftMargin;
		@Pc(9) int local9 = GameShell.topMargin;
		@Pc(16) int local16 = GameShell.frameHeight - GameShell.canvasHeight - local9;
		@Pc(24) int local24 = GameShell.frameWidth - GameShell.canvasWidth - local7;
		if (local7 <= 0 && local24 <= 0 && local9 <= 0 && local16 <= 0) {
			return;
		}
		try {
			@Pc(47) Container container;
			if (GameShell.fullScreenFrame != null) {
				container = GameShell.fullScreenFrame;
			} else if (GameShell.frame == null) {
				container = GameShell.signLink.applet;
			} else {
				container = GameShell.frame;
			}
			@Pc(58) int local58 = 0;
			@Pc(60) int local60 = 0;
			if (container == GameShell.frame) {
				@Pc(66) Insets insets = GameShell.frame.getInsets();
				local58 = insets.left;
				local60 = insets.top;
			}
			@Pc(75) Graphics graphics = container.getGraphics();
			graphics.setColor(Color.black);
			if (local7 > 0) {
				graphics.fillRect(local58, local60, local7, GameShell.frameHeight);
			}
			if (local9 > 0) {
				graphics.fillRect(local58, local60, GameShell.frameWidth, local9);
			}
			if (local24 > 0) {
				graphics.fillRect(local58 + GameShell.frameWidth - local24, local60, local24, GameShell.frameHeight);
			}
			if (local16 > 0) {
				graphics.fillRect(local58, local60 + GameShell.frameHeight - local16, GameShell.frameWidth, local16);
			}
		} catch (@Pc(127) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
	public static void method3463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = 0;
		@Pc(14) int local14 = arg2;
		@Pc(16) int local16 = -1;
		@Pc(19) int local19 = -arg2;
		@Pc(27) int local27 = IntUtils.clamp(arg2 + arg1, Static2.anInt902, Static3.anInt2553);
		@Pc(35) int local35 = IntUtils.clamp(arg1 - arg2, Static2.anInt902, Static3.anInt2553);
		ArrayUtils.fillRange(Static5.anIntArrayArray36[arg0], local35, local27, arg3);
		while (local14 > local3) {
			local16 += 2;
			local19 += local16;
			if (local19 > 0) {
				local14--;
				local19 -= local14 << 1;
				@Pc(72) int local72 = arg0 - local14;
				@Pc(76) int local76 = local14 + arg0;
				if (local76 >= Static4.anInt3086 && local72 <= Static5.anInt4230) {
					@Pc(98) int local98 = IntUtils.clamp(arg1 + local3, Static2.anInt902, Static3.anInt2553);
					@Pc(106) int local106 = IntUtils.clamp(arg1 - local3, Static2.anInt902, Static3.anInt2553);
					if (Static5.anInt4230 >= local76) {
						ArrayUtils.fillRange(Static5.anIntArrayArray36[local76], local106, local98, arg3);
					}
					if (Static4.anInt3086 <= local72) {
						ArrayUtils.fillRange(Static5.anIntArrayArray36[local72], local106, local98, arg3);
					}
				}
			}
			local3++;
			@Pc(138) int local138 = arg0 - local3;
			@Pc(142) int local142 = arg0 + local3;
			if (Static4.anInt3086 <= local142 && local138 <= Static5.anInt4230) {
				@Pc(166) int local166 = IntUtils.clamp(arg1 + local14, Static2.anInt902, Static3.anInt2553);
				@Pc(174) int local174 = IntUtils.clamp(arg1 - local14, Static2.anInt902, Static3.anInt2553);
				if (local142 <= Static5.anInt4230) {
					ArrayUtils.fillRange(Static5.anIntArrayArray36[local142], local174, local166, arg3);
				}
				if (Static4.anInt3086 <= local138) {
					ArrayUtils.fillRange(Static5.anIntArrayArray36[local138], local174, local166, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
	public static void method3476() {
		if (Static5.rebootTimer > 1) {
			InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
			Static5.rebootTimer--;
		}
		if (Static1.anInt885 > 0) {
			Static1.anInt885--;
		}
		if (Static1.aBoolean38) {
			Static1.aBoolean38 = false;
			Static23.method2455();
			return;
		}
		for (@Pc(32) int i = 0; i < 100 && Protocol.readPacket(); i++) {
		}
		if (Static4.anInt3304 != 30) {
			return;
		}
		ReflectionCheck.loop(Protocol.outboundBuffer);
		synchronized (MouseRecorder.instance.lock) {
			if (!MouseRecorder.enabled) {
				MouseRecorder.instance.samples = 0;
			} else if (Mouse.clickButton != 0 || MouseRecorder.instance.samples >= 40) {
				Protocol.outboundBuffer.writeOpcode(199);
				Protocol.outboundBuffer.writeByte(0);
				@Pc(86) int samples = 0;
				@Pc(89) int position = Protocol.outboundBuffer.position;
				for (@Pc(91) int i = 0; i < MouseRecorder.instance.samples && Protocol.outboundBuffer.position - position < 240; i++) {
					samples++;
					@Pc(113) int x = MouseRecorder.instance.x[i];
					@Pc(118) int y = MouseRecorder.instance.y[i];
					if (y < 0) {
						y = 0;
					} else if (y > 65534) {
						y = 65534;
					}
					@Pc(136) boolean outsideWindow = false;
					if (x < 0) {
						x = 0;
					} else if (x > 65534) {
						x = 65534;
					}
					if (MouseRecorder.instance.y[i] == -1 && MouseRecorder.instance.x[i] == -1) {
						outsideWindow = true;
						x = -1;
						y = -1;
					}
					if (Static3.mouseRecorderPrevX != x || y != Static6.mouseRecorderPrevY) {
						@Pc(195) int dy = y - Static6.mouseRecorderPrevY;
						Static6.mouseRecorderPrevY = y;
						@Pc(201) int dx = x - Static3.mouseRecorderPrevX;
						Static3.mouseRecorderPrevX = x;
						if (Static3.anInt2235 < 8 && dx >= -32 && dx <= 31 && dy >= -32 && dy <= 31) {
							@Pc(223) int dx2 = dx + 32;
							@Pc(224) int dy2 = dy + 32;
							Protocol.outboundBuffer.writeShort((Static3.anInt2235 << 12) + (dx2 << 6) + dy2);
							Static3.anInt2235 = 0;
						} else if (Static3.anInt2235 < 32 && dx >= -128 && dx <= 127 && dy >= -128 && dy <= 127) {
							Protocol.outboundBuffer.writeByte(Static3.anInt2235 + 128);
							@Pc(265) int dy2 = dy + 128;
							@Pc(266) int dx2 = dx + 128;
							Protocol.outboundBuffer.writeShort((dx2 << 8) + dy2);
							Static3.anInt2235 = 0;
						} else if (Static3.anInt2235 < 32) {
							Protocol.outboundBuffer.writeByte(Static3.anInt2235 + 192);
							if (outsideWindow) {
								Protocol.outboundBuffer.writeInt(Integer.MIN_VALUE);
							} else {
								Protocol.outboundBuffer.writeInt(x | y << 16);
							}
							Static3.anInt2235 = 0;
						} else {
							Protocol.outboundBuffer.writeShort(Static3.anInt2235 + 57344);
							if (outsideWindow) {
								Protocol.outboundBuffer.writeInt(Integer.MIN_VALUE);
							} else {
								Protocol.outboundBuffer.writeInt(x | y << 16);
							}
							Static3.anInt2235 = 0;
						}
					} else if (Static3.anInt2235 < 2047) {
						Static3.anInt2235++;
					}
				}
				Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - position);
				if (samples < MouseRecorder.instance.samples) {
					@Pc(350) MouseRecorder mouseRecorder = MouseRecorder.instance;
					mouseRecorder.samples -= samples;
					for (@Pc(357) int i = 0; i < MouseRecorder.instance.samples; i++) {
						MouseRecorder.instance.x[i] = MouseRecorder.instance.x[samples + i];
						MouseRecorder.instance.y[i] = MouseRecorder.instance.y[samples + i];
					}
				} else {
					MouseRecorder.instance.samples = 0;
				}
			}
		}
		if (Mouse.clickButton != 0) {
			@Pc(414) int y = Mouse.clickY;
			if (y < 0) {
				y = 0;
			} else if (y > 65535) {
				y = 65535;
			}
			@Pc(436) long loops = (Mouse.clickTime - Static1.prevClickTime) / 50L;
			if (loops > 32767L) {
				loops = 32767L;
			}
			Static1.prevClickTime = Mouse.clickTime;
			@Pc(449) int x = Mouse.clickX;
			if (x < 0) {
				x = 0;
			} else if (x > 65535) {
				x = 65535;
			}
			@Pc(466) byte button = 0;
			if (Mouse.clickButton == 2) {
				button = 1;
			}
			Protocol.outboundBuffer.writeOpcode(200);
			Protocol.outboundBuffer.writeIntAlt3Reverse(y << 16 | x);
			@Pc(489) int loops2 = (int) loops;
			Protocol.outboundBuffer.writeShortA(button << 15 | loops2);
		}
		if (Static7.anInt5269 > 0) {
			Static7.anInt5269--;
		}
		if (Static5.aBoolean248 && Static7.anInt5269 <= 0) {
			Static5.aBoolean248 = false;
			Static7.anInt5269 = 20;
			Protocol.outboundBuffer.writeOpcode(140);
			Protocol.outboundBuffer.writeShortLE2((int) Camera.pitch);
			Protocol.outboundBuffer.writeShortLEA((int) Camera.yaw);
		}
		if (GameShell.focus && !Static7.prevFocus) {
			Static7.prevFocus = true;
			Protocol.outboundBuffer.writeOpcode(248);
			Protocol.outboundBuffer.writeByte(1);
		}
		if (!GameShell.focus && Static7.prevFocus) {
			Static7.prevFocus = false;
			Protocol.outboundBuffer.writeOpcode(248);
			Protocol.outboundBuffer.writeByte(0);
		}
		if (!Preferences.sentToServer) {
			Protocol.outboundBuffer.writeOpcode(120);
			Protocol.outboundBuffer.writeInt(Preferences.toInt());
			Preferences.sentToServer = true;
		}
		if (Static7.aBoolean401) {
			Static7.aBoolean401 = false;
		} else {
			Static4.aFloat79 /= 2.0F;
		}
		if (Static6.aBoolean330) {
			Static6.aBoolean330 = false;
		} else {
			Static1.aFloat20 /= 2.0F;
		}
		Static33.method4202();
		if (Static4.anInt3304 != 30) {
			return;
		}
		ChangeLocRequest.loop();
		AttachLocRequest.loop();
		SoundPlayer.loop();
		Static3.anInt2583++;
		if (Static3.anInt2583 > 750) {
			Static23.method2455();
			return;
		}
		PlayerList.loop();
		NpcList.loop();
		OverheadChat.loop();
		for (@Pc(658) int varp = VarpDomain.poll(true); varp != -1; varp = VarpDomain.poll(false)) {
			method3534(varp);
			VarpDomain.updatedVarps[VarpDomain.updatedVarpsWriterIndex++ & 0x1F] = varp;
		}
		for (@Pc(683) DelayedStateChange change = DelayedStateChange.poll(); change != null; change = DelayedStateChange.poll()) {
			@Pc(689) int type = change.getType();
			@Pc(693) int id = change.getId();
			if (type == 1) {
				VarcDomain.varcs[id] = change.intArg1;
				VarcDomain.updatedVarcs[VarcDomain.updatedVarcsWriterIndex++ & 0x1F] = id;
			} else if (type == 2) {
				VarcDomain.varcstrs[id] = change.stringArg;
				VarcDomain.updatedVarcstrs[VarcDomain.updatedVarcstrsWriterIndex++ & 0x1F] = id;
			} else if (type == 3) {
				@Pc(1175) Component component = InterfaceList.getComponent(id);
				if (!change.stringArg.equals(component.text)) {
					component.text = change.stringArg;
					Static28.method3270(component);
				}
			} else if (type == 4) {
				@Pc(732) Component component = InterfaceList.getComponent(id);
				@Pc(735) int modelType = change.intArg1;
				@Pc(738) int modelId = change.intArg2;
				@Pc(741) int local741 = change.intArg3;
				if (component.modelType != modelType || modelId != component.modelId || component.anInt5913 != local741) {
					component.modelId = modelId;
					component.anInt5913 = local741;
					component.modelType = modelType;
					Static28.method3270(component);
				}
			} else if (type == 5) {
				@Pc(1137) Component component = InterfaceList.getComponent(id);
				if (component.modelSeqId != change.intArg1 || change.intArg1 == -1) {
					component.anInt5892 = 0;
					component.modelSeqId = change.intArg1;
					component.anInt5979 = 1;
					component.anInt5897 = 0;
					Static28.method3270(component);
				}
			} else if (type == 6) {
				@Pc(1084) int color16 = change.intArg1;
				@Pc(1090) int green = color16 >> 5 & 0x1F;
				@Pc(1094) Component component = InterfaceList.getComponent(id);
				@Pc(1100) int red = color16 >> 10 & 0x1F;
				@Pc(1104) int blue = color16 & 0x1F;
				@Pc(1117) int color24 = (blue << 3) + (red << 19) + (green << 11);
				if (component.color != color24) {
					component.color = color24;
					Static28.method3270(component);
				}
			} else if (type == 7) {
				@Pc(790) Component component = InterfaceList.getComponent(id);
				@Pc(800) boolean hidden = change.intArg1 == 1;
				if (component.hidden != hidden) {
					component.hidden = hidden;
					Static28.method3270(component);
				}
			} else if (type == 8) {
				@Pc(825) Component component = InterfaceList.getComponent(id);
				if (component.modelXAngle != change.intArg1 || change.intArg2 != component.modelYAngle || change.intArg3 != component.modelZoom) {
					component.modelYAngle = change.intArg2;
					component.modelZoom = change.intArg3;
					if (component.objId != -1) {
						if (component.anInt5957 > 0) {
							component.modelZoom = component.modelZoom * 32 / component.anInt5957;
						} else if (component.baseWidth > 0) {
							component.modelZoom = component.modelZoom * 32 / component.baseWidth;
						}
					}
					component.modelXAngle = change.intArg1;
					Static28.method3270(component);
				}
			} else if (type == 9) {
				@Pc(905) Component component = InterfaceList.getComponent(id);
				if (component.objId != change.intArg1 || component.objCount != change.intArg2) {
					component.objCount = change.intArg2;
					component.objId = change.intArg1;
					Static28.method3270(component);
				}
			} else if (type == 10) {
				@Pc(1044) Component component = InterfaceList.getComponent(id);
				if (component.modelXOffset != change.intArg1 || change.intArg2 != component.modelYOffset || component.modelZAngle != change.intArg3) {
					component.modelYOffset = change.intArg2;
					component.modelXOffset = change.intArg1;
					component.modelZAngle = change.intArg3;
					Static28.method3270(component);
				}
			} else if (type == 11) {
				@Pc(948) Component component = InterfaceList.getComponent(id);
				component.x = component.baseX = change.intArg1;
				component.y = component.baseY = change.intArg2;
				component.yMode = 0;
				component.xMode = 0;
				Static28.method3270(component);
			} else if (type == 12) {
				@Pc(996) Component component = InterfaceList.getComponent(id);
				@Pc(999) int scrollY = change.intArg1;
				if (component != null && component.type == 0) {
					if (component.scrollHeight - component.height < scrollY) {
						scrollY = component.scrollHeight - component.height;
					}
					if (scrollY < 0) {
						scrollY = 0;
					}
					if (component.scrollY != scrollY) {
						component.scrollY = scrollY;
						Static28.method3270(component);
					}
				}
			} else if (type == 13) {
				@Pc(986) Component component = InterfaceList.getComponent(id);
				component.modelRotationSpeed = change.intArg1;
			}
		}
		if (Cross.type != 0) {
			Cross.milliseconds += 20;
			if (Cross.milliseconds >= 400) {
				Cross.type = 0;
			}
		}
		Static5.anInt4156++;
		if (Static1.aClass185_3 != null) {
			Static2.anInt2246++;
			if (Static2.anInt2246 >= 15) {
				Static28.method3270(Static1.aClass185_3);
				Static1.aClass185_3 = null;
			}
		}
		if (Static5.aClass185_10 != null) {
			Static28.method3270(Static5.aClass185_10);
			if (Static1.anInt547 + 5 < Mouse.x || Mouse.x < Static1.anInt547 - 5 || Mouse.y > Static1.anInt789 + 5 || Mouse.y < Static1.anInt789 - 5) {
				Static5.aBoolean276 = true;
			}
			Static2.anInt1267++;
			if (Mouse.pressedButton == 0) {
				if (Static5.aBoolean276 && Static2.anInt1267 >= 5) {
					if (Static5.aClass185_10 == Static6.aClass185_13 && Static4.anInt2989 != Static1.anInt91) {
						@Pc(1306) Component component = Static5.aClass185_10;
						@Pc(1312) byte local1312 = 0;
						if (Static7.anInt5935 == 1 && component.anInt5904 == 206) {
							local1312 = 1;
						}
						if (component.objTypes[Static4.anInt2989] <= 0) {
							local1312 = 0;
						}
						if (InterfaceList.getServerActiveProperties(component).isObjReplaceEnabled()) {
							@Pc(1343) int destSlot = Static4.anInt2989;
							@Pc(1345) int sourceSlot = Static1.anInt91;
							component.objTypes[destSlot] = component.objTypes[sourceSlot];
							component.objCounts[destSlot] = component.objCounts[sourceSlot];
							component.objTypes[sourceSlot] = -1;
							component.objCounts[sourceSlot] = 0;
						} else if (local1312 == 1) {
							@Pc(1380) int sourceSlot = Static1.anInt91;
							@Pc(1382) int destSlot = Static4.anInt2989;
							while (destSlot != sourceSlot) {
								if (destSlot < sourceSlot) {
									component.swapObjs(sourceSlot, sourceSlot - 1);
									sourceSlot--;
								} else if (sourceSlot < destSlot) {
									component.swapObjs(sourceSlot, sourceSlot + 1);
									sourceSlot++;
								}
							}
						} else {
							component.swapObjs(Static1.anInt91, Static4.anInt2989);
						}
						Protocol.outboundBuffer.writeOpcode(6);
						Protocol.outboundBuffer.writeShortLEA(Static4.anInt2989);
						Protocol.outboundBuffer.writeByteS(local1312);
						Protocol.outboundBuffer.writeIntAlt3(Static5.aClass185_10.id);
						Protocol.outboundBuffer.writeShortLE2(Static1.anInt91);
					}
				} else if ((Static3.anInt5400 == 1 || MiniMenu.method1005(MiniMenu.size - 1)) && MiniMenu.size > 2) {
					Static31.method3783();
				} else if (MiniMenu.size > 0) {
					Static37.method4784();
				}
				Static2.anInt2246 = 10;
				Static5.aClass185_10 = null;
				Mouse.clickButton = 0;
			}
		}
		Static4.aBoolean232 = false;
		Static7.aClass185_16 = null;
		InterfaceList.keyQueueSize = 0;
		@Pc(1483) Component local1483 = Static5.aClass185_11;
		Static5.aClass185_11 = null;
		@Pc(1487) Component local1487 = Static2.aClass185_4;
		Static2.aClass185_4 = null;
		Static6.aBoolean310 = false;
		while (Keyboard.nextKey() && InterfaceList.keyQueueSize < 128) {
			InterfaceList.keyCodes[InterfaceList.keyQueueSize] = Keyboard.keyCode;
			InterfaceList.keyChars[InterfaceList.keyQueueSize] = Keyboard.keyChar;
			InterfaceList.keyQueueSize++;
		}
		WorldMap.component = null;
		if (InterfaceList.topLevelInterface != -1) {
			Static14.method1060(InterfaceList.topLevelInterface, GameShell.canvasWidth, 0, 0, 0, 0, GameShell.canvasHeight);
		}
		InterfaceList.transmitTimer++;
		if (WorldMap.component != null) {
			WorldMap.loop();
		}
		while (true) {
			@Pc(1562) Component highPriorityComponent;
			@Pc(1550) Component highPrioritySource;
			@Pc(1542) HookRequest highPriorityRequest;
			do {
				highPriorityRequest = (HookRequest) InterfaceList.highPriorityRequests.removeHead();
				if (highPriorityRequest == null) {
					while (true) {
						@Pc(1611) Component mediumPriorityComponent;
						@Pc(1600) Component mediumPrioritySource;
						@Pc(1593) HookRequest mediumPriorityRequest;
						do {
							mediumPriorityRequest = (HookRequest) InterfaceList.mediumPriorityRequests.removeHead();
							if (mediumPriorityRequest == null) {
								while (true) {
									@Pc(1660) Component lowPriorityComponent;
									@Pc(1650) Component lowPrioritySource;
									@Pc(1643) HookRequest lowPriorityRequest;
									do {
										lowPriorityRequest = (HookRequest) InterfaceList.lowPriorityRequests.removeHead();
										if (lowPriorityRequest == null) {
											if (WorldMap.component == null) {
												Static1.anInt640 = 0;
											}
											if (Static1.aClass185_1 != null) {
												Static14.method1047();
											}
											if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[82] && Keyboard.pressedKeys[81] && Static3.wheelRotation != 0) {
												@Pc(1717) int level = Player.level - Static3.wheelRotation;
												if (level < 0) {
													level = 0;
												} else if (level > 3) {
													level = 3;
												}
												Cheat.teleport(level, PlayerList.self.movementQueueX[0] + Static5.originX, Static7.originZ + PlayerList.self.movementQueueZ[0]);
											}
											if (LoginManager.staffModLevel > 0 && Keyboard.pressedKeys[82] && Keyboard.pressedKeys[81]) {
												if (Static1.anInt528 != -1) {
													Cheat.teleport(Player.level, Static1.anInt528 + Static5.originX, Static1.anInt420 + Static7.originZ);
												}
												Static6.anInt4946 = 0;
												Static2.anInt1767 = 0;
											} else if (Static2.anInt1767 == 2) {
												if (Static1.anInt528 != -1) {
													Protocol.outboundBuffer.writeOpcode(204);
													Protocol.outboundBuffer.writeShortA(Static1.anInt420 + Static7.originZ);
													Protocol.outboundBuffer.writeShortA(Static2.anInt1367);
													Protocol.outboundBuffer.writeIntAlt3(Static1.anInt1053);
													Protocol.outboundBuffer.writeShortLE2(Static1.anInt528 + Static5.originX);
													Cross.x = Mouse.clickX;
													Cross.type = 1;
													Cross.milliseconds = 0;
													Cross.y = Mouse.clickY;
												}
												Static2.anInt1767 = 0;
											} else if (Static6.anInt4946 == 2) {
												if (Static1.anInt528 != -1) {
													Protocol.outboundBuffer.writeOpcode(85);
													Protocol.outboundBuffer.writeShortLEA(Static5.originX + Static1.anInt528);
													Protocol.outboundBuffer.writeShortLE2(Static7.originZ + Static1.anInt420);
													Cross.type = 1;
													Cross.milliseconds = 0;
													Cross.y = Mouse.clickY;
													Cross.x = Mouse.clickX;
												}
												Static6.anInt4946 = 0;
											} else if (Static1.anInt528 != -1 && Static2.anInt1767 == 0 && Static6.anInt4946 == 0) {
												@Pc(1797) int x = (Static1.anInt528 << 1) + 1 - PlayerList.self.getSize() >> 1;
												@Pc(1809) int z = (Static1.anInt420 << 1) + 1 - PlayerList.self.getSize() >> 1;
												Static37.method4661(x, z, 0);
												Cross.x = Mouse.clickX;
												Cross.y = Mouse.clickY;
												Cross.type = 1;
												Cross.milliseconds = 0;
												PathFinder.findPath(PlayerList.self.movementQueueX[0], PlayerList.self.movementQueueZ[0], x, z, 0, 0, 0, 0, 0);
											}
											Static1.anInt528 = -1;
											method3400();
											if (local1483 != Static5.aClass185_11) {
												if (local1483 != null) {
													Static28.method3270(local1483);
												}
												if (Static5.aClass185_11 != null) {
													Static28.method3270(Static5.aClass185_11);
												}
											}
											if (local1487 != Static2.aClass185_4 && Static5.anInt5840 == Static4.anInt3493) {
												if (local1487 != null) {
													Static28.method3270(local1487);
												}
												if (Static2.aClass185_4 != null) {
													Static28.method3270(Static2.aClass185_4);
												}
											}
											if (Static2.aClass185_4 == null) {
												if (Static4.anInt3493 > 0) {
													Static4.anInt3493--;
												}
											} else if (Static4.anInt3493 < Static5.anInt5840) {
												Static4.anInt3493++;
												if (Static5.anInt5840 == Static4.anInt3493) {
													Static28.method3270(Static2.aClass185_4);
												}
											}
											for (@Pc(2012) int local2012 = 0; local2012 < 5; local2012++) {
												@Pc(2019) int local2019 = Camera.anIntArray14[local2012]++;
											}
											@Pc(2037) int local2037 = Mouse.getIdleLoops();
											@Pc(2040) int local2040 = Keyboard.getIdleLoops();
											if (local2037 > 15000 && local2040 > 15000) {
												Static1.anInt885 = 250;
												Mouse.setIdleLoops(14500);
												Protocol.outboundBuffer.writeOpcode(91);
											}
											if (Static1.openUrlRequest != null && Static1.openUrlRequest.status == 1) {
												if (Static1.openUrlRequest.result != null) {
													Static37.openUrl(Static6.url, Static4.newTab);
												}
												Static6.url = null;
												Static1.openUrlRequest = null;
												Static4.newTab = false;
											}
											Static2.anInt1634++;
											Static3.anInt2142++;
											Static7.anInt6094++;
											if (Static2.anInt1634 > 500) {
												Static2.anInt1634 = 0;
												@Pc(2106) int local2106 = (int) (Math.random() * 8.0D);
												if ((local2106 & 0x2) == 2) {
													Static1.anInt837 += Static1.anInt402;
												}
												if ((local2106 & 0x1) == 1) {
													Static1.anInt548 += Static7.anInt5997;
												}
												if ((local2106 & 0x4) == 4) {
													Static1.anInt242 += Static1.anInt873;
												}
											}
											if (Static1.anInt837 < -55) {
												Static1.anInt402 = 2;
											}
											if (Static1.anInt837 > 55) {
												Static1.anInt402 = -2;
											}
											if (Static1.anInt548 < -50) {
												Static7.anInt5997 = 2;
											}
											if (Static7.anInt6094 > 500) {
												Static7.anInt6094 = 0;
												@Pc(2172) int local2172 = (int) (Math.random() * 8.0D);
												if ((local2172 & 0x1) == 1) {
													Camera.yawOffset += Static5.anInt441;
												}
												if ((local2172 & 0x2) == 2) {
													Static6.anInt4761 += Static2.anInt1121;
												}
											}
											if (Static6.anInt4761 < -20) {
												Static2.anInt1121 = 1;
											}
											if (Static1.anInt548 > 50) {
												Static7.anInt5997 = -2;
											}
											if (Camera.yawOffset < -60) {
												Static5.anInt441 = 2;
											}
											if (Camera.yawOffset > 60) {
												Static5.anInt441 = -2;
											}
											if (Static1.anInt242 < -40) {
												Static1.anInt873 = 1;
											}
											if (Static1.anInt242 > 40) {
												Static1.anInt873 = -1;
											}
											if (Static6.anInt4761 > 10) {
												Static2.anInt1121 = -1;
											}
											if (Static3.anInt2142 > 50) {
												Protocol.outboundBuffer.writeOpcode(137);
											}
											if (Protocol.verifyIdChanged) {
												Protocol.transmitVerifyId();
												Protocol.verifyIdChanged = false;
											}
											try {
												if (Protocol.socket != null && Protocol.outboundBuffer.position > 0) {
													Protocol.socket.write(Protocol.outboundBuffer.bytes, Protocol.outboundBuffer.position);
													Protocol.outboundBuffer.position = 0;
													Static3.anInt2142 = 0;
												}
											} catch (@Pc(2285) IOException ex) {
												Static23.method2455();
											}
											return;
										}
										lowPrioritySource = lowPriorityRequest.source;
										if (lowPrioritySource.createdComponentId < 0) {
											break;
										}
										lowPriorityComponent = InterfaceList.getComponent(lowPrioritySource.layer);
									} while (lowPriorityComponent == null || lowPriorityComponent.createdComponents == null || lowPrioritySource.createdComponentId >= lowPriorityComponent.createdComponents.length || lowPriorityComponent.createdComponents[lowPrioritySource.createdComponentId] != lowPrioritySource);
									ScriptRunner.method2019(lowPriorityRequest);
								}
							}
							mediumPrioritySource = mediumPriorityRequest.source;
							if (mediumPrioritySource.createdComponentId < 0) {
								break;
							}
							mediumPriorityComponent = InterfaceList.getComponent(mediumPrioritySource.layer);
						} while (mediumPriorityComponent == null || mediumPriorityComponent.createdComponents == null || mediumPriorityComponent.createdComponents.length <= mediumPrioritySource.createdComponentId || mediumPrioritySource != mediumPriorityComponent.createdComponents[mediumPrioritySource.createdComponentId]);
						ScriptRunner.method2019(mediumPriorityRequest);
					}
				}
				highPrioritySource = highPriorityRequest.source;
				if (highPrioritySource.createdComponentId < 0) {
					break;
				}
				highPriorityComponent = InterfaceList.getComponent(highPrioritySource.layer);
			} while (highPriorityComponent == null || highPriorityComponent.createdComponents == null || highPriorityComponent.createdComponents.length <= highPrioritySource.createdComponentId || highPriorityComponent.createdComponents[highPrioritySource.createdComponentId] != highPrioritySource);
			ScriptRunner.method2019(highPriorityRequest);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z[Lclient!wf;I)V")
	public static void method3480(@OriginalArg(1) Component[] components, @OriginalArg(2) int arg1) {
		for (@Pc(7) int i = 0; i < components.length; i++) {
			@Pc(15) Component component = components[i];
			if (component != null) {
				if (component.type == 0) {
					if (component.createdComponents != null) {
						method3480(component.createdComponents, arg1);
					}
					@Pc(44) SubInterface subInterface = (SubInterface) InterfaceList.subInterfaces.get(component.id);
					if (subInterface != null) {
						Static28.method3277(subInterface.id, arg1);
					}
				}
				if (arg1 == 0 && component.onDialogAbort != null) {
					@Pc(64) HookRequest hookRequest = new HookRequest();
					hookRequest.source = component;
					hookRequest.arguments = component.onDialogAbort;
					ScriptRunner.method2019(hookRequest);
				}
				if (arg1 == 1 && component.onSubChange != null) {
					if (component.createdComponentId >= 0) {
						@Pc(94) Component local94 = InterfaceList.getComponent(component.id);
						if (local94 == null || local94.createdComponents == null || local94.createdComponents.length <= component.createdComponentId || component != local94.createdComponents[component.createdComponentId]) {
							continue;
						}
					}
					@Pc(123) HookRequest hookRequest = new HookRequest();
					hookRequest.arguments = component.onSubChange;
					hookRequest.source = component;
					ScriptRunner.method2019(hookRequest);
				}
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BIIIIIII)V")
	public static void method3482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 128 || arg4 < 128 || arg3 > 13056 || arg4 > 13056) {
			Static7.anInt5584 = -1;
			Static4.anInt3290 = -1;
			return;
		}
		@Pc(35) int local35 = SceneGraph.getTileHeight(Player.level, arg3, arg4) - arg1;
		arg3 -= Static3.anInt2519;
		local35 -= Static2.anInt1931;
		arg4 -= Static7.anInt5678;
		@Pc(51) int local51 = MathUtils.SINE[Static5.anInt4066];
		@Pc(63) int local63 = MathUtils.COSINE[Static5.anInt4066];
		@Pc(67) int local67 = MathUtils.SINE[Static5.anInt3656];
		@Pc(71) int local71 = MathUtils.COSINE[Static5.anInt3656];
		@Pc(81) int local81 = arg4 * local67 + arg3 * local71 >> 16;
		arg4 = arg4 * local71 - local67 * arg3 >> 16;
		arg3 = local81;
		local81 = local63 * local35 - arg4 * local51 >> 16;
		arg4 = local51 * local35 + arg4 * local63 >> 16;
		if (arg4 < 50) {
			Static4.anInt3290 = -1;
			Static7.anInt5584 = -1;
		} else if (GlRenderer.enabled) {
			@Pc(133) int local133 = arg2 * 512 >> 8;
			Static7.anInt5584 = arg6 + local133 * arg3 / arg4;
			@Pc(147) int local147 = arg5 * 512 >> 8;
			Static4.anInt3290 = arg0 + local147 * local81 / arg4;
		} else {
			Static7.anInt5584 = arg6 + (arg3 << 9) / arg4;
			Static4.anInt3290 = arg0 + (local81 << 9) / arg4;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!nh;Z)V")
	public static void method3493(@OriginalArg(0) Tile arg0, @OriginalArg(1) boolean arg1) {
		Static3.aClass112_26.addTail(arg0);
		while (true) {
			@Pc(8) Tile local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Tile[][] local31;
			@Pc(2580) Tile local2580;
			do {
				@Pc(2558) Tile local2558;
				do {
					@Pc(2538) Tile local2538;
					do {
						@Pc(2516) Tile local2516;
						do {
							do {
								do {
									@Pc(33) float var8;
									while (true) {
										while (true) {
											do {
												local8 = (Tile) Static3.aClass112_26.removeHead();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean255);
											local18 = local8.x;
											local21 = local8.z;
											local24 = local8.virtualLevel;
											local27 = local8.level;
											local31 = SceneGraph.tiles[local24];
											var8 = 0.0F;
											if (GlRenderer.enabled) {
												if (SceneGraph.underwaterTileHeights == SceneGraph.tileHeights) {
													@Pc(44) int local44 = SceneGraph.anIntArrayArray10[local18][local21];
													@Pc(48) int local48 = local44 & 0xFFFFFF;
													if (local48 != Static5.anInt3636) {
														Static5.anInt3636 = local48;
														Static18.method4372(local48);
														Static25.method2772(Static12.method723());
													}
													@Pc(65) int local65 = local44 >>> 24 << 3;
													if (local65 != Static6.anInt5120) {
														Static6.anInt5120 = local65;
														Static26.method2989(local65);
													}
													@Pc(115) int local115 = SceneGraph.surfaceTileHeights[0][local18][local21] + SceneGraph.surfaceTileHeights[0][local18 + 1][local21] + SceneGraph.surfaceTileHeights[0][local18][local21 + 1] + SceneGraph.surfaceTileHeights[0][local18 + 1][local21 + 1] >> 2;
													MaterialManager.setMaterial(3, -local115);
													var8 = 201.5F;
													GlRenderer.method1613(var8);
												} else {
													var8 = 201.5F - (float) (local27 + 1) * 50.0F;
													GlRenderer.method1613(var8);
												}
											}
											if (!local8.aBoolean257) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													@Pc(153) Tile local153 = SceneGraph.tiles[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean255) {
														continue;
													}
												}
												if (local18 <= Static6.anInt4513 && local18 > Static6.anInt4978) {
													@Pc(173) Tile local173 = local31[local18 - 1][local21];
													if (local173 != null && local173.aBoolean255 && (local173.aBoolean257 || (local8.allInteriorFlags & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static6.anInt4513 && local18 < Static2.anInt5778 - 1) {
													@Pc(203) Tile local203 = local31[local18 + 1][local21];
													if (local203 != null && local203.aBoolean255 && (local203.aBoolean257 || (local8.allInteriorFlags & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static4.anInt3329 && local21 > Static1.anInt890) {
													@Pc(231) Tile local231 = local31[local18][local21 - 1];
													if (local231 != null && local231.aBoolean255 && (local231.aBoolean257 || (local8.allInteriorFlags & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static4.anInt3329 && local21 < Static2.anInt1344 - 1) {
													@Pc(261) Tile local261 = local31[local18][local21 + 1];
													if (local261 != null && local261.aBoolean255 && (local261.aBoolean257 || (local8.allInteriorFlags & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean257 = false;
											if (local8.linkedTile != null) {
												@Pc(287) Tile local287 = local8.linkedTile;
												if (GlRenderer.enabled) {
													GlRenderer.method1613(201.5F - (float) (local287.level + 1) * 50.0F);
												}
												if (local287.plainTile == null) {
													if (local287.shapedTile != null) {
														if (Static11.method508(0, local18, local21)) {
															Static32.method3987(local287.shapedTile, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, true);
														} else {
															Static32.method3987(local287.shapedTile, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, false);
														}
													}
												} else if (Static11.method508(0, local18, local21)) {
													Static31.method3155(local287.plainTile, 0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, true);
												} else {
													Static31.method3155(local287.plainTile, 0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, false);
												}
												@Pc(363) Wall local363 = local287.wall;
												if (local363 != null) {
													if (GlRenderer.enabled) {
														if ((local363.anInt5493 & local8.anInt3558) == 0) {
															LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
														} else {
															LightingManager.method3119(local363.anInt5493, Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local27, local18, local21);
														}
													}
													local363.primary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local363.xFine - Static7.anInt5281, local363.anInt5494 - Static6.anInt4375, local363.zFine - Static6.anInt4400, local363.key, local24, null);
												}
												for (@Pc(416) int local416 = 0; local416 < local287.sceneryLen; local416++) {
													@Pc(425) Scenery local425 = local287.scenery[local416];
													if (local425 != null) {
														if (GlRenderer.enabled) {
															LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
														}
														local425.entity.method3805(local425.angle, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local425.centerXFine - Static7.anInt5281, local425.y - Static6.anInt4375, local425.centerZFine - Static6.anInt4400, local425.key, local24, null);
													}
												}
												if (GlRenderer.enabled) {
													GlRenderer.method1613(var8);
												}
											}
											@Pc(469) boolean local469 = false;
											if (local8.plainTile == null) {
												if (local8.shapedTile != null) {
													if (Static11.method508(local27, local18, local21)) {
														Static32.method3987(local8.shapedTile, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, true);
													} else {
														local469 = true;
														Static32.method3987(local8.shapedTile, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, false);
													}
												}
											} else if (Static11.method508(local27, local18, local21)) {
												Static31.method3155(local8.plainTile, local27, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, true);
											} else {
												local469 = true;
												if (local8.plainTile.anInt4299 != 12345678 || Static2.aBoolean101 && local24 <= Static5.anInt3715) {
													Static31.method3155(local8.plainTile, local27, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, false);
												}
											}
											if (local469) {
												@Pc(549) GroundDecor groundDecor = local8.groundDecor;
												if (groundDecor != null && (groundDecor.key & 0x80000000L) != 0L) {
													if (GlRenderer.enabled && groundDecor.aBoolean63) {
														GlRenderer.method1613(var8 + 50.0F - 1.5F);
													}
													if (GlRenderer.enabled) {
														LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													groundDecor.entity.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, groundDecor.xFine - Static7.anInt5281, groundDecor.anInt1130 - Static6.anInt4375, groundDecor.zFine - Static6.anInt4400, groundDecor.key, local24, null);
													if (GlRenderer.enabled && groundDecor.aBoolean63) {
														GlRenderer.method1613(var8);
													}
												}
											}
											@Pc(611) int local611 = 0;
											@Pc(613) int local613 = 0;
											@Pc(616) Wall local616 = local8.wall;
											@Pc(619) WallDecor local619 = local8.wallDecor;
											if (local616 != null || local619 != null) {
												if (Static6.anInt4513 == local18) {
													local611++;
												} else if (Static6.anInt4513 < local18) {
													local611 += 2;
												}
												if (Static4.anInt3329 == local21) {
													local611 += 3;
												} else if (Static4.anInt3329 > local21) {
													local611 += 6;
												}
												local613 = Static4.anIntArray313[local611];
												local8.anInt3558 = Static2.anIntArray150[local611];
											}
											if (local616 != null) {
												if ((local616.anInt5493 & Static7.anIntArray621[local611]) == 0) {
													local8.anInt3549 = 0;
												} else if (local616.anInt5493 == 16) {
													local8.anInt3549 = 3;
													local8.anInt3553 = Static6.anIntArray524[local611];
													local8.anInt3559 = 3 - local8.anInt3553;
												} else if (local616.anInt5493 == 32) {
													local8.anInt3549 = 6;
													local8.anInt3553 = Static3.anIntArray230[local611];
													local8.anInt3559 = 6 - local8.anInt3553;
												} else if (local616.anInt5493 == 64) {
													local8.anInt3549 = 12;
													local8.anInt3553 = Static5.anIntArray392[local611];
													local8.anInt3559 = 12 - local8.anInt3553;
												} else {
													local8.anInt3549 = 9;
													local8.anInt3553 = Static1.anIntArray1[local611];
													local8.anInt3559 = 9 - local8.anInt3553;
												}
												if ((local616.anInt5493 & local613) != 0 && !method3313(local27, local18, local21, local616.anInt5493)) {
													if (GlRenderer.enabled) {
														LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													local616.primary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local616.xFine - Static7.anInt5281, local616.anInt5494 - Static6.anInt4375, local616.zFine - Static6.anInt4400, local616.key, local24, null);
												}
												if ((local616.anInt5488 & local613) != 0 && !method3313(local27, local18, local21, local616.anInt5488)) {
													if (GlRenderer.enabled) {
														LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													local616.secondary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local616.xFine - Static7.anInt5281, local616.anInt5494 - Static6.anInt4375, local616.zFine - Static6.anInt4400, local616.key, local24, null);
												}
											}
											if (local619 != null && !Static14.method1089(local27, local18, local21, local619.primary.getMinY())) {
												if (GlRenderer.enabled) {
													GlRenderer.method1613(var8 - 0.5F);
												}
												if ((local619.anInt5629 & local613) != 0) {
													if (GlRenderer.enabled) {
														LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													local619.primary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local619.xFine + local619.xOffset - Static7.anInt5281, local619.anInt5627 - Static6.anInt4375, local619.zFine + local619.zOffset - Static6.anInt4400, local619.key, local24, null);
												} else if (local619.anInt5629 == 256) {
													@Pc(894) int local894 = local619.xFine - Static7.anInt5281;
													@Pc(899) int local899 = local619.anInt5627 - Static6.anInt4375;
													@Pc(904) int local904 = local619.zFine - Static6.anInt4400;
													@Pc(907) int local907 = local619.anInt5631;
													@Pc(916) int local916;
													if (local907 == 1 || local907 == 2) {
														local916 = -local894;
													} else {
														local916 = local894;
													}
													@Pc(928) int local928;
													if (local907 == 2 || local907 == 3) {
														local928 = -local904;
													} else {
														local928 = local904;
													}
													if (local928 < local916) {
														if (GlRenderer.enabled) {
															LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
														}
														local619.primary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local894 + local619.xOffset, local899, local904 + local619.zOffset, local619.key, local24, null);
													} else if (local619.secondary != null) {
														if (GlRenderer.enabled) {
															LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
														}
														local619.secondary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local894, local899, local904, local619.key, local24, null);
													}
												}
												if (GlRenderer.enabled) {
													GlRenderer.method1613(var8);
												}
											}
											if (local469) {
												@Pc(1001) GroundDecor groundDecor = local8.groundDecor;
												if (groundDecor != null && (groundDecor.key & 0x80000000L) == 0L) {
													if (GlRenderer.enabled && groundDecor.aBoolean63) {
														GlRenderer.method1613(var8 + 50.0F - 1.5F);
													}
													if (GlRenderer.enabled) {
														LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													groundDecor.entity.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, groundDecor.xFine - Static7.anInt5281, groundDecor.anInt1130 - Static6.anInt4375, groundDecor.zFine - Static6.anInt4400, groundDecor.key, local24, null);
													if (GlRenderer.enabled && groundDecor.aBoolean63) {
														GlRenderer.method1613(var8);
													}
												}
												@Pc(1064) ObjStackEntity objStack = local8.objStack;
												if (objStack != null && objStack.anInt5499 == 0) {
													if (GlRenderer.enabled) {
														LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													if (objStack.secondary != null) {
														objStack.secondary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, objStack.xFine - Static7.anInt5281, objStack.anInt5501 - Static6.anInt4375, objStack.zFine - Static6.anInt4400, objStack.key, local24, null);
													}
													if (objStack.tertiary != null) {
														objStack.tertiary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, objStack.xFine - Static7.anInt5281, objStack.anInt5501 - Static6.anInt4375, objStack.zFine - Static6.anInt4400, objStack.key, local24, null);
													}
													if (objStack.primary != null) {
														objStack.primary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, objStack.xFine - Static7.anInt5281, objStack.anInt5501 - Static6.anInt4375, objStack.zFine - Static6.anInt4400, objStack.key, local24, null);
													}
												}
											}
											@Pc(1162) int local1162 = local8.allInteriorFlags;
											if (local1162 != 0) {
												if (local18 < Static6.anInt4513 && (local1162 & 0x4) != 0) {
													@Pc(1179) Tile local1179 = local31[local18 + 1][local21];
													if (local1179 != null && local1179.aBoolean255) {
														Static3.aClass112_26.addTail(local1179);
													}
												}
												if (local21 < Static4.anInt3329 && (local1162 & 0x2) != 0) {
													@Pc(1203) Tile local1203 = local31[local18][local21 + 1];
													if (local1203 != null && local1203.aBoolean255) {
														Static3.aClass112_26.addTail(local1203);
													}
												}
												if (local18 > Static6.anInt4513 && (local1162 & 0x1) != 0) {
													@Pc(1227) Tile local1227 = local31[local18 - 1][local21];
													if (local1227 != null && local1227.aBoolean255) {
														Static3.aClass112_26.addTail(local1227);
													}
												}
												if (local21 > Static4.anInt3329 && (local1162 & 0x8) != 0) {
													@Pc(1251) Tile local1251 = local31[local18][local21 - 1];
													if (local1251 != null && local1251.aBoolean255) {
														Static3.aClass112_26.addTail(local1251);
													}
												}
											}
											break;
										}
										if (local8.anInt3549 != 0) {
											@Pc(1265) boolean local1265 = true;
											for (@Pc(1267) int local1267 = 0; local1267 < local8.sceneryLen; local1267++) {
												if (local8.scenery[local1267].anInt815 != Static2.anInt1871 && (local8.interiorFlags[local1267] & local8.anInt3549) == local8.anInt3553) {
													local1265 = false;
													break;
												}
											}
											if (local1265) {
												@Pc(1298) Wall local1298 = local8.wall;
												if (!method3313(local27, local18, local21, local1298.anInt5493)) {
													if (GlRenderer.enabled) {
														label1037:
														{
															if ((local1298.key & 0xFC000L) == 16384L) {
																@Pc(1319) int local1319 = local1298.xFine - Static7.anInt5281;
																@Pc(1324) int local1324 = local1298.zFine - Static6.anInt4400;
																@Pc(1332) int local1332 = (int) (local1298.key >> 20 & 0x3L);
																if (local1332 == 0) {
																	@Pc(1335) int local1335 = local1319 - 64;
																	@Pc(1336) int local1336 = local1324 + 64;
																	if (local1336 < local1335 && local18 > 0 && local21 < SceneGraph.length - 1) {
																		LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18 - 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 1) {
																	@Pc(1362) int local1362 = local1319 + 64;
																	@Pc(1363) int local1363 = local1324 + 64;
																	if (local1363 < -local1362 && local18 < SceneGraph.width - 1 && local21 < SceneGraph.length - 1) {
																		LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18 + 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 2) {
																	@Pc(1393) int local1393 = local1319 + 64;
																	@Pc(1394) int local1394 = local1324 - 64;
																	if (local1394 > local1393 && local18 < SceneGraph.width - 1 && local21 > 0) {
																		LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18 + 1, local21 - 1);
																		break label1037;
																	}
																} else if (local1332 == 3) {
																	@Pc(1420) int local1420 = local1319 - 64;
																	@Pc(1421) int local1421 = local1324 - 64;
																	if (local1421 > -local1420 && local18 > 0 && local21 > 0) {
																		LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18 - 1, local21 - 1);
																		break label1037;
																	}
																}
															}
															LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
														}
													}
													local1298.primary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local1298.xFine - Static7.anInt5281, local1298.anInt5494 - Static6.anInt4375, local1298.zFine - Static6.anInt4400, local1298.key, local24, null);
												}
												local8.anInt3549 = 0;
											}
										}
										if (!local8.aBoolean256) {
											break;
										}
										try {
											@Pc(1481) int local1481 = local8.sceneryLen;
											local8.aBoolean256 = false;
											@Pc(1486) int local1486 = 0;
											label844:
											for (@Pc(1488) int local1488 = 0; local1488 < local1481; local1488++) {
												@Pc(1496) Scenery local1496 = local8.scenery[local1488];
												if (local1496.anInt815 != Static2.anInt1871) {
													for (@Pc(1503) int local1503 = local1496.xMin; local1503 <= local1496.xMax; local1503++) {
														for (@Pc(1510) int local1510 = local1496.zMin; local1510 <= local1496.zMax; local1510++) {
															@Pc(1520) Tile local1520 = local31[local1503][local1510];
															if (local1520.aBoolean257) {
																local8.aBoolean256 = true;
																continue label844;
															}
															if (local1520.anInt3549 != 0) {
																@Pc(1532) int local1532 = 0;
																if (local1503 > local1496.xMin) {
																	local1532++;
																}
																if (local1503 < local1496.xMax) {
																	local1532 += 4;
																}
																if (local1510 > local1496.zMin) {
																	local1532 += 8;
																}
																if (local1510 < local1496.zMax) {
																	local1532 += 2;
																}
																if ((local1532 & local1520.anInt3549) == local8.anInt3559) {
																	local8.aBoolean256 = true;
																	continue label844;
																}
															}
														}
													}
													SceneGraph.aClass33Array1[local1486++] = local1496;
													@Pc(1577) int local1577 = Static6.anInt4513 - local1496.xMin;
													@Pc(1582) int local1582 = local1496.xMax - Static6.anInt4513;
													if (local1582 > local1577) {
														local1577 = local1582;
													}
													@Pc(1592) int local1592 = Static4.anInt3329 - local1496.zMin;
													@Pc(1597) int local1597 = local1496.zMax - Static4.anInt3329;
													if (local1597 > local1592) {
														local1496.anInt811 = local1577 + local1597;
													} else {
														local1496.anInt811 = local1577 + local1592;
													}
												}
											}
											while (local1486 > 0) {
												@Pc(1617) int local1617 = -50;
												@Pc(1619) int local1619 = -1;
												for (@Pc(1621) int local1621 = 0; local1621 < local1486; local1621++) {
													@Pc(1628) Scenery local1628 = SceneGraph.aClass33Array1[local1621];
													if (local1628.anInt815 != Static2.anInt1871) {
														if (local1628.anInt811 > local1617) {
															local1617 = local1628.anInt811;
															local1619 = local1621;
														} else if (local1628.anInt811 == local1617) {
															@Pc(1651) int local1651 = local1628.centerXFine - Static7.anInt5281;
															@Pc(1656) int local1656 = local1628.centerZFine - Static6.anInt4400;
															@Pc(1663) int local1663 = SceneGraph.aClass33Array1[local1619].centerXFine - Static7.anInt5281;
															@Pc(1670) int local1670 = SceneGraph.aClass33Array1[local1619].centerZFine - Static6.anInt4400;
															if (local1651 * local1651 + local1656 * local1656 > local1663 * local1663 + local1670 * local1670) {
																local1619 = local1621;
															}
														}
													}
												}
												if (local1619 == -1) {
													break;
												}
												@Pc(1697) Scenery local1697 = SceneGraph.aClass33Array1[local1619];
												local1697.anInt815 = Static2.anInt1871;
												if (!Static21.method2003(local27, local1697.xMin, local1697.xMax, local1697.zMin, local1697.zMax, local1697.entity.getMinY())) {
													if (GlRenderer.enabled) {
														if ((local1697.key & 0xFC000L) == 147456L) {
															LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
															@Pc(1735) int local1735 = local1697.centerXFine - Static7.anInt5281;
															@Pc(1740) int local1740 = local1697.centerZFine - Static6.anInt4400;
															@Pc(1748) int local1748 = (int) (local1697.key >> 20 & 0x3L);
															if (local1748 == 1 || local1748 == 3) {
																if (local1740 > -local1735) {
																	LightingManager.method3117(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	LightingManager.method3117(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local1740 > local1735) {
																LightingManager.method3117(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																LightingManager.method3117(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															LightingManager.method3115(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local1697.xMin, local1697.zMin, local1697.xMax, local1697.zMax);
														}
													}
													local1697.entity.method3805(local1697.angle, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local1697.centerXFine - Static7.anInt5281, local1697.y - Static6.anInt4375, local1697.centerZFine - Static6.anInt4400, local1697.key, local24, null);
												}
												for (@Pc(1846) int local1846 = local1697.xMin; local1846 <= local1697.xMax; local1846++) {
													for (@Pc(1853) int local1853 = local1697.zMin; local1853 <= local1697.zMax; local1853++) {
														@Pc(1863) Tile local1863 = local31[local1846][local1853];
														if (local1863.anInt3549 != 0) {
															Static3.aClass112_26.addTail(local1863);
														} else if ((local1846 != local18 || local1853 != local21) && local1863.aBoolean255) {
															Static3.aClass112_26.addTail(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean256) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean256 = false;
											break;
										}
									}
									if (local8.particles != null) {
										if (GlRenderer.enabled) {
											@Pc(1905) GL gl = GlRenderer.gl;
											GlRenderer.method1613(var8);
											ParticleSystem.method2961(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400);
											@Pc(1920) int local1920 = local8.x * 128 + 64 - Static7.anInt5281;
											@Pc(1932) int local1932 = SceneGraph.tileHeights[local24][local8.x][local8.z] - Static6.anInt4375;
											@Pc(1941) int local1941 = local8.z * 128 + 64 - Static6.anInt4400;
											@Pc(1966) int local1966;
											if (local24 < 3) {
												local1966 = SceneGraph.tileHeights[local24][local8.x][local8.z] - SceneGraph.tileHeights[local24 + 1][local8.x][local8.z];
											} else {
												local1966 = 1024;
											}
											@Pc(1979) int local1979 = local1941 * Static3.anInt2272 - local1920 * Static6.anInt4794 >> 16;
											@Pc(1989) int local1989 = local1932 * Static2.anInt2247 + local1979 * Static5.anInt3487 >> 16;
											@Pc(2001) int local2001 = local1989 + (Static5.anInt3487 * 91 + Static2.anInt2247 * 0 >> 16);
											@Pc(2013) int local2013 = local1989 + (Static5.anInt3487 * -91 - local1966 * Static2.anInt2247 >> 16);
											if (local2013 < local2001 - 1597) {
												local2013 = local2001 - 1597;
											}
											@Pc(2028) int local2028 = local2001 + 2 - local2013;
											@Pc(2030) Particle local2030 = null;
											@Pc(2032) ParticleEmitter local2032 = null;
											@Pc(2034) int local2034 = -1;
											@Pc(2040) Particle local2040 = (Particle) local8.particles.head();
											while (true) {
												label1054:
												{
													if (local2040 != null) {
														if (local2040.emitter == null || local2040.emitter.system.stopped) {
															local2040.unlink();
															break label1054;
														}
														if ((byte) (local2040.emitter.system.aLong124 & 0xFFL) != local8.aByte14) {
															local8.particles = null;
															break;
														}
														if (local2030 == null) {
															local2030 = local2040;
															local2032 = local2040.emitter;
															local2034 = local2032.type.anInt2399;
															break label1054;
														}
													}
													if (local2030 != null && (local2040 == null || local2040.emitter != local2032 || local2040.emitter.type.anInt2399 != local2034)) {
														for (@Pc(2097) int local2097 = 0; local2097 < local2028; local2097++) {
															ParticleSystem.anIntArray387[local2097] = 0;
														}
														for (@Pc(2108) int local2108 = 0; local2108 < 32; local2108++) {
															ParticleSystem.anIntArray388[local2108] = 0;
														}
														ParticleSystem.anInt3519 = 0;
														for (@Pc(2121) Particle local2121 = local2030; local2121 != local2040; local2121 = (Particle) local2121.secondaryNext) {
															if (local2121.emitter != null) {
																@Pc(2134) int local2134 = (local2121.x >> 12) - Static7.anInt5281;
																@Pc(2141) int local2141 = (local2121.y >> 12) - Static6.anInt4375;
																@Pc(2148) int local2148 = (local2121.z >> 12) - Static6.anInt4400;
																local2148 = local2148 * Static3.anInt2272 - local2134 * Static6.anInt4794 >> 16;
																local2148 = (local2141 * Static2.anInt2247 + local2148 * Static5.anInt3487 >> 16) - local2013;
																if (ParticleSystem.anIntArray387[local2148] < 32) {
																	ParticleSystem.aShortArrayArray3[local2148][ParticleSystem.anIntArray387[local2148]++] = local2121.aShort21;
																} else {
																	if (ParticleSystem.anIntArray387[local2148] == 32) {
																		if (ParticleSystem.anInt3519 == 32) {
																			if (ParticleManager.DEBUG) {
																				System.out.println("Overflowed world-based radix sort");
																			}
																			break;
																		}
																		@Pc(2205) int[] local2205 = ParticleSystem.anIntArray387;
																		local2205[local2148] += ParticleSystem.anInt3519++ + 1;
																	}
																	@Pc(2227) int local2227 = ParticleSystem.anIntArray388[ParticleSystem.anIntArray387[local2148] - 32 - 1];
																	if (local2227 < 768) {
																		ParticleSystem.aShortArrayArray4[ParticleSystem.anIntArray387[local2148] - 32 - 1][ParticleSystem.anIntArray388[ParticleSystem.anIntArray387[local2148] - 32 - 1]++] = local2121.aShort21;
																	}
																}
															}
															if (local2121.secondaryNext == local8.particles.sentinel) {
																break;
															}
														}
														@Pc(2270) boolean local2270 = false;
														if (ParticleSystem.arbPointSpriteSupported && local2032.type.texture != -1) {
															Rasteriser.textureProvider.method451(local2032.type.texture);
															local2270 = true;
														} else {
															GlRenderer.setTextureId(-1);
														}
														@Pc(2293) float local2293 = (float) local2034 * ParticleSystem.aFloat86;
														if (local2293 > 64.0F) {
															local2293 = 64.0F;
														}
														gl.glPointSize((float) (local2293 * GameShell.canvasScale));
														local2032.system.method2955(gl, local2028, local2270, local2032.type.aBoolean167);
														if (local2040 != null) {
															local2030 = local2040;
															local2032 = local2040.emitter;
															local2034 = local2040.emitter.type.anInt2399;
														}
													}
													if (local2040 == null) {
														break;
													}
												}
												local2040 = (Particle) local8.particles.next();
											}
											ParticleSystem.method2962();
										} else {
											@Pc(2339) int local2339 = ParticleSystem.anInt3506 + Rasteriser.anInt3125;
											@Pc(2343) int local2343 = ParticleSystem.anInt3503 + Rasteriser.anInt3126;
											@Pc(2347) SecondaryParticleNode local2347 = local8.particles.sentinel;
											for (@Pc(2350) SecondaryParticleNode local2350 = local2347.secondaryNext; local2350 != local2347; local2350 = local2350.secondaryNext) {
												@Pc(2356) Particle local2356 = (Particle) local2350;
												if (local2356.emitter != null && !local2356.emitter.system.stopped) {
													if ((byte) (local2356.emitter.system.aLong124 & 0xFFL) != local8.aByte14) {
														local8.particles = null;
														break;
													}
													@Pc(2387) int local2387 = (local2356.x >> 12) - Static7.anInt5281;
													@Pc(2394) int local2394 = (local2356.y >> 12) - Static6.anInt4375;
													@Pc(2401) int local2401 = (local2356.z >> 12) - Static6.anInt4400;
													@Pc(2411) int local2411 = local2401 * Static6.anInt4794 + local2387 * Static3.anInt2272 >> 16;
													local2401 = local2401 * Static3.anInt2272 - local2387 * Static6.anInt4794 >> 16;
													local2387 = local2411;
													local2411 = local2394 * Static5.anInt3487 - local2401 * Static2.anInt2247 >> 16;
													local2401 = local2394 * Static2.anInt2247 + local2401 * Static5.anInt3487 >> 16;
													if (local2401 >= 50) {
														@Pc(2456) int local2456 = local2339 + (local2387 << 9) / local2401;
														@Pc(2464) int local2464 = local2343 + (local2411 << 9) / local2401;
														@Pc(2468) int local2468 = local2401 * 400;
														if (local2468 == 0) {
															local2468 = 1;
														}
														SoftwareRaster.method4206(local2456, local2464, (local2356.emitter.type.anInt2399 << 16) / local2468, local2356.color, local2356.color >> 24 & 0xFF);
													}
												}
											}
										}
									}
								} while (!local8.aBoolean255);
							} while (local8.anInt3549 != 0);
							if (local18 > Static6.anInt4513 || local18 <= Static6.anInt4978) {
								break;
							}
							local2516 = local31[local18 - 1][local21];
						} while (local2516 != null && local2516.aBoolean255);
						if (local18 < Static6.anInt4513 || local18 >= Static2.anInt5778 - 1) {
							break;
						}
						local2538 = local31[local18 + 1][local21];
					} while (local2538 != null && local2538.aBoolean255);
					if (local21 > Static4.anInt3329 || local21 <= Static1.anInt890) {
						break;
					}
					local2558 = local31[local18][local21 - 1];
				} while (local2558 != null && local2558.aBoolean255);
				if (local21 < Static4.anInt3329 || local21 >= Static2.anInt1344 - 1) {
					break;
				}
				local2580 = local31[local18][local21 + 1];
			} while (local2580 != null && local2580.aBoolean255);
			local8.aBoolean255 = false;
			Static5.anInt3486--;
			@Pc(2596) ObjStackEntity local2596 = local8.objStack;
			if (local2596 != null && local2596.anInt5499 != 0) {
				if (GlRenderer.enabled) {
					LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
				}
				if (local2596.secondary != null) {
					local2596.secondary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2596.xFine - Static7.anInt5281, local2596.anInt5501 - Static6.anInt4375 - local2596.anInt5499, local2596.zFine - Static6.anInt4400, local2596.key, local24, null);
				}
				if (local2596.tertiary != null) {
					local2596.tertiary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2596.xFine - Static7.anInt5281, local2596.anInt5501 - Static6.anInt4375 - local2596.anInt5499, local2596.zFine - Static6.anInt4400, local2596.key, local24, null);
				}
				if (local2596.primary != null) {
					local2596.primary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2596.xFine - Static7.anInt5281, local2596.anInt5501 - Static6.anInt4375 - local2596.anInt5499, local2596.zFine - Static6.anInt4400, local2596.key, local24, null);
				}
			}
			if (local8.anInt3558 != 0) {
				@Pc(2706) WallDecor local2706 = local8.wallDecor;
				if (local2706 != null && !Static14.method1089(local27, local18, local21, local2706.primary.getMinY())) {
					if ((local2706.anInt5629 & local8.anInt3558) != 0) {
						if (GlRenderer.enabled) {
							LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
						}
						local2706.primary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2706.xFine + local2706.xOffset - Static7.anInt5281, local2706.anInt5627 - Static6.anInt4375, local2706.zFine + local2706.zOffset - Static6.anInt4400, local2706.key, local24, null);
					} else if (local2706.anInt5629 == 256) {
						@Pc(2771) int local2771 = local2706.xFine - Static7.anInt5281;
						@Pc(2776) int local2776 = local2706.anInt5627 - Static6.anInt4375;
						@Pc(2781) int local2781 = local2706.zFine - Static6.anInt4400;
						@Pc(2784) int local2784 = local2706.anInt5631;
						@Pc(2793) int local2793;
						if (local2784 == 1 || local2784 == 2) {
							local2793 = -local2771;
						} else {
							local2793 = local2771;
						}
						@Pc(2805) int local2805;
						if (local2784 == 2 || local2784 == 3) {
							local2805 = -local2781;
						} else {
							local2805 = local2781;
						}
						if (local2805 >= local2793) {
							if (GlRenderer.enabled) {
								LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
							}
							local2706.primary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2771 + local2706.xOffset, local2776, local2781 + local2706.zOffset, local2706.key, local24, null);
						} else if (local2706.secondary != null) {
							if (GlRenderer.enabled) {
								LightingManager.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
							}
							local2706.secondary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2771, local2776, local2781, local2706.key, local24, null);
						}
					}
				}
				@Pc(2872) Wall local2872 = local8.wall;
				if (local2872 != null) {
					if ((local2872.anInt5488 & local8.anInt3558) != 0 && !method3313(local27, local18, local21, local2872.anInt5488)) {
						if (GlRenderer.enabled) {
							LightingManager.method3119(local2872.anInt5488, Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local27, local18, local21);
						}
						local2872.secondary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2872.xFine - Static7.anInt5281, local2872.anInt5494 - Static6.anInt4375, local2872.zFine - Static6.anInt4400, local2872.key, local24, null);
					}
					if ((local2872.anInt5493 & local8.anInt3558) != 0 && !method3313(local27, local18, local21, local2872.anInt5493)) {
						if (GlRenderer.enabled) {
							LightingManager.method3119(local2872.anInt5493, Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local27, local18, local21);
						}
						local2872.primary.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2872.xFine - Static7.anInt5281, local2872.anInt5494 - Static6.anInt4375, local2872.zFine - Static6.anInt4400, local2872.key, local24, null);
					}
				}
			}
			if (local24 < SceneGraph.levels - 1) {
				@Pc(2985) Tile local2985 = SceneGraph.tiles[local24 + 1][local18][local21];
				if (local2985 != null && local2985.aBoolean255) {
					Static3.aClass112_26.addTail(local2985);
				}
			}
			if (local18 < Static6.anInt4513) {
				@Pc(3005) Tile local3005 = local31[local18 + 1][local21];
				if (local3005 != null && local3005.aBoolean255) {
					Static3.aClass112_26.addTail(local3005);
				}
			}
			if (local21 < Static4.anInt3329) {
				@Pc(3025) Tile local3025 = local31[local18][local21 + 1];
				if (local3025 != null && local3025.aBoolean255) {
					Static3.aClass112_26.addTail(local3025);
				}
			}
			if (local18 > Static6.anInt4513) {
				@Pc(3045) Tile local3045 = local31[local18 - 1][local21];
				if (local3045 != null && local3045.aBoolean255) {
					Static3.aClass112_26.addTail(local3045);
				}
			}
			if (local21 > Static4.anInt3329) {
				@Pc(3065) Tile local3065 = local31[local18][local21 - 1];
				if (local3065 != null && local3065.aBoolean255) {
					Static3.aClass112_26.addTail(local3065);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!wf;BI)V")
	public static void method3495(@OriginalArg(0) Component[] components, @OriginalArg(2) int layer) {
		for (@Pc(7) int i = 0; i < components.length; i++) {
			@Pc(19) Component component = components[i];
			if (component != null && component.layer == layer && (!component.if3 || !InterfaceList.isHidden(component))) {
				if (component.type == 0) {
					if (!component.if3 && InterfaceList.isHidden(component) && Static5.aClass185_11 != component) {
						continue;
					}
					method3495(components, component.id);
					if (component.createdComponents != null) {
						method3495(component.createdComponents, component.id);
					}
					@Pc(79) SubInterface subInterface = (SubInterface) InterfaceList.subInterfaces.get(component.id);
					if (subInterface != null) {
						Static27.method4243(subInterface.id);
					}
				}
				if (component.type == 6) {
					if (component.modelSeqId != -1 || component.anInt5910 != -1) {
						@Pc(108) boolean isTrue = Cs1ScriptRunner.isTrue(component);
						@Pc(113) int seqId;
						if (isTrue) {
							seqId = component.anInt5910;
						} else {
							seqId = component.modelSeqId;
						}
						if (seqId != -1) {
							@Pc(129) SeqType type = SeqTypeList.get(seqId);
							if (type != null) {
								component.anInt5897 += Static5.anInt4156;
								while (type.anIntArray94[component.anInt5892] < component.anInt5897) {
									component.anInt5897 -= type.anIntArray94[component.anInt5892];
									component.anInt5892++;
									if (component.anInt5892 >= type.frames.length) {
										component.anInt5892 -= type.anInt1242;
										if (component.anInt5892 < 0 || type.frames.length <= component.anInt5892) {
											component.anInt5892 = 0;
										}
									}
									component.anInt5979 = component.anInt5892 + 1;
									if (type.frames.length <= component.anInt5979) {
										component.anInt5979 -= type.anInt1242;
										if (component.anInt5979 < 0 || type.frames.length <= component.anInt5979) {
											component.anInt5979 = -1;
										}
									}
									Static28.method3270(component);
								}
							}
						}
					}
					if (component.modelRotationSpeed != 0 && !component.if3) {
						@Pc(261) int x = component.modelRotationSpeed >> 16;
						x *= Static5.anInt4156;
						@Pc(272) int y = component.modelRotationSpeed << 16 >> 16;
						component.modelXAngle = x + component.modelXAngle & 0x7FF;
						y *= Static5.anInt4156;
						component.modelYAngle = y + component.modelYAngle & 0x7FF;
						Static28.method3270(component);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIII)Z")
	private static boolean method3313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static11.method508(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = SceneGraph.tileHeights[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static7.anInt5281) {
					if (!Static33.method4119(local10, local24, local14)) {
						return false;
					}
					if (!Static33.method4119(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static33.method4119(local10, local28, local14)) {
						return false;
					}
					if (!Static33.method4119(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static33.method4119(local10, local32, local14)) {
					return false;
				}
				if (!Static33.method4119(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static6.anInt4400) {
					if (!Static33.method4119(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static33.method4119(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static33.method4119(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static33.method4119(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static33.method4119(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static33.method4119(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static7.anInt5281) {
					if (!Static33.method4119(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static33.method4119(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static33.method4119(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static33.method4119(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static33.method4119(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static33.method4119(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static6.anInt4400) {
					if (!Static33.method4119(local10, local24, local14)) {
						return false;
					}
					if (!Static33.method4119(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static33.method4119(local10, local28, local14)) {
						return false;
					}
					if (!Static33.method4119(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static33.method4119(local10, local32, local14)) {
					return false;
				}
				if (!Static33.method4119(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static33.method4119(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static33.method4119(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static33.method4119(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static33.method4119(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static33.method4119(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)V")
	public static void method3534(@OriginalArg(1) int id) {
		Static21.method2062();
		AreaSoundManager.updateMulti();
		@Pc(20) int clientCode = VarpTypeList.get(id).clientCode;
		if (clientCode == 0) {
			return;
		}
		@Pc(27) int value = VarpDomain.varps[id];
		if (clientCode == 9) {
			Static7.anInt5935 = value;
		}
		if (clientCode == 5) {
			Static3.anInt5400 = value;
		}
		if (clientCode == 6) {
			Static2.chatEffectsDisabled = value;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIIIII)V")
	public static void method3536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(3) int local3 = arg3; local3 <= arg3 + arg4; local3++) {
			for (@Pc(15) int local15 = arg0; local15 <= arg0 + arg2; local15++) {
				if (local15 >= 0 && local15 < 104 && local3 >= 0 && local3 < 104) {
					Static5.aByteArrayArrayArray18[arg1][local15][local3] = 127;
				}
			}
		}
		for (@Pc(60) int local60 = arg3; local60 < arg4 + arg3; local60++) {
			for (@Pc(71) int local71 = arg0; local71 < arg2 + arg0; local71++) {
				if (local71 >= 0 && local71 < 104 && local60 >= 0 && local60 < 104) {
					SceneGraph.tileHeights[arg1][local71][local60] = arg1 > 0 ? SceneGraph.tileHeights[arg1 - 1][local71][local60] : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < 104) {
			for (@Pc(133) int local133 = arg3 + 1; local133 < arg3 + arg4; local133++) {
				if (local133 >= 0 && local133 < 104) {
					SceneGraph.tileHeights[arg1][arg0][local133] = SceneGraph.tileHeights[arg1][arg0 - 1][local133];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (@Pc(182) int local182 = arg0 + 1; local182 < arg0 + arg2; local182++) {
				if (local182 >= 0 && local182 < 104) {
					SceneGraph.tileHeights[arg1][local182][arg3] = SceneGraph.tileHeights[arg1][local182][arg3 - 1];
				}
			}
		}
		if (arg0 < 0 || arg3 < 0 || arg0 >= 104 || arg3 >= 104) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 > 0 && SceneGraph.tileHeights[arg1][arg0 - 1][arg3] != 0) {
				SceneGraph.tileHeights[arg1][arg0][arg3] = SceneGraph.tileHeights[arg1][arg0 - 1][arg3];
			} else if (arg3 > 0 && SceneGraph.tileHeights[arg1][arg0][arg3 - 1] != 0) {
				SceneGraph.tileHeights[arg1][arg0][arg3] = SceneGraph.tileHeights[arg1][arg0][arg3 - 1];
			} else if (arg0 > 0 && arg3 > 0 && SceneGraph.tileHeights[arg1][arg0 - 1][arg3 - 1] != 0) {
				SceneGraph.tileHeights[arg1][arg0][arg3] = SceneGraph.tileHeights[arg1][arg0 - 1][arg3 - 1];
			}
		} else if (arg0 > 0 && SceneGraph.tileHeights[arg1 - 1][arg0 - 1][arg3] != SceneGraph.tileHeights[arg1][arg0 - 1][arg3]) {
			SceneGraph.tileHeights[arg1][arg0][arg3] = SceneGraph.tileHeights[arg1][arg0 - 1][arg3];
		} else if (arg3 > 0 && SceneGraph.tileHeights[arg1 - 1][arg0][arg3 - 1] != SceneGraph.tileHeights[arg1][arg0][arg3 - 1]) {
			SceneGraph.tileHeights[arg1][arg0][arg3] = SceneGraph.tileHeights[arg1][arg0][arg3 - 1];
		} else if (arg0 > 0 && arg3 > 0 && SceneGraph.tileHeights[arg1 - 1][arg0 - 1][arg3 - 1] != SceneGraph.tileHeights[arg1][arg0 - 1][arg3 - 1]) {
			SceneGraph.tileHeights[arg1][arg0][arg3] = SceneGraph.tileHeights[arg1][arg0 - 1][arg3 - 1];
		}
	}

}

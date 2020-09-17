import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIILclient!pc;II)I")
	public static int method3391(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) Class4_Sub6_Sub4 arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(14) int local14;
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 + 256 - arg2) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			@Pc(25) int local25 = arg2 >> 8;
			@Pc(31) byte local31 = arg0[local25 - 1];
			@Pc(33) int local33 = arg3++;
			arg1[local33] += ((local31 << 8) + (arg0[local25] - local31) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			@Pc(86) int local86 = arg3++;
			arg1[local86] += ((arg9 << 8) + (arg0[arg2 >> 8] - arg9) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		arg7.anInt4100 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
	public static int method3393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		for (local10 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; Static34.method4257(arg1, local10) > arg0; local10--) {
		}
		return local10;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	private static void method3400() {
		if (Static5.aClass185_10 != null || (Static1.aClass185_1 != null || Static1.anInt640 > 0)) {
			return;
		}
		@Pc(22) int local22 = Mouse.clickButton;
		if (!Static1.aBoolean17) {
			if (local22 == 1 && Static7.anInt5634 > 0) {
				@Pc(47) short local47 = Static6.aShortArray100[Static7.anInt5634 - 1];
				if (local47 == 30 || local47 == 20 || local47 == 13 || local47 == 2 || local47 == 49 || local47 == 58 || local47 == 35 || local47 == 17 || local47 == 10 || local47 == 51 || local47 == 9 || local47 == 1001) {
					@Pc(99) int local99 = Static6.anIntArray543[Static7.anInt5634 - 1];
					@Pc(105) int local105 = Static2.anIntArray117[Static7.anInt5634 - 1];
					@Pc(109) Component local109 = InterfaceList.getComponent(local99);
					@Pc(112) Class4_Sub21 local112 = Static12.method687(local109);
					if (local112.method3269() || local112.method3279()) {
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
			if (local22 == 1 && (Static3.anInt5400 == 1 && Static7.anInt5634 > 2 || Static13.method1005(Static7.anInt5634 - 1))) {
				local22 = 2;
			}
			if (local22 == 2 && Static7.anInt5634 > 0 || Static2.anInt1940 == 1) {
				Static31.method3783();
			}
			if (local22 == 1 && Static7.anInt5634 > 0 || Static2.anInt1940 == 2) {
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
		for (@Pc(263) int local263 = 0; local263 < Static7.anInt5634; local263++) {
			if (Static7.aBoolean389) {
				@Pc(325) int local325 = (Static7.anInt5634 - local263 - 1) * 15 + local253 + 33;
				if (local251 < local255 && local259 + local251 > local255 && local325 - 13 < local257 && local325 + 3 > local257) {
					local261 = local263;
				}
			} else {
				@Pc(281) int local281 = (Static7.anInt5634 - local263 - 1) * 15 + local253 + 31;
				if (local251 < local255 && local259 + local251 > local255 && local281 - 13 < local257 && local281 + 3 > local257) {
					local261 = local263;
				}
			}
		}
		if (local261 != -1) {
			Static35.method664(local261);
		}
		Static1.aBoolean17 = false;
		Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([Lclient!ec;)Lclient!pf;")
	public static Class134 method3402(@OriginalArg(0) GlShader[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] == null || arg0[local1].id <= 0) {
				return null;
			}
		}
		@Pc(20) GL local20 = GlRenderer.gl;
		@Pc(23) int local23 = local20.glCreateProgramObjectARB();
		for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
			local20.glAttachObjectARB(local23, arg0[local25].id);
		}
		local20.glLinkProgramARB(local23);
		local20.glGetObjectParameterivARB(local23, GL.GL_LINK_STATUS, Static5.anIntArray432, 0);
		if (Static5.anIntArray432[0] == 0) {
			if (Static5.anIntArray432[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local20.glGetObjectParameterivARB(local23, GL.GL_INFO_LOG_LENGTH, Static5.anIntArray432, 1);
			if (Static5.anIntArray432[1] > 1) {
				@Pc(74) byte[] local74 = new byte[Static5.anIntArray432[1]];
				local20.glGetInfoLogARB(local23, Static5.anIntArray432[1], Static5.anIntArray432, 0, local74, 0);
				System.out.println(new String(local74));
			}
			if (Static5.anIntArray432[0] == 0) {
				for (@Pc(96) int local96 = 0; local96 < arg0.length; local96++) {
					local20.glDetachObjectARB(local23, arg0[local96].id);
				}
				local20.glDeleteObjectARB(local23);
				return null;
			}
		}
		return new Class134(local23, arg0);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)I")
	public static int method3147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		arg4 &= 3;
		if ((arg2 & 0x1) == 1) {
			@Pc(17) int local17 = arg0;
			arg0 = arg5;
			arg5 = local17;
		}
		if (arg4 == 0) {
			return arg3;
		} else if (arg4 == 1) {
			return arg1;
		} else if (arg4 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return 7 + 1 - arg1 - arg5;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([[[BB[[B[[I[[FI[[B[[B[[I[[B[[F[[F)[Lclient!ih;")
	public static Class4_Sub12[] method3149(@OriginalArg(0) byte[][][] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) float[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) float[][] arg10) {
		@Pc(10) HashTable local10 = new HashTable(128);
		for (@Pc(12) int local12 = 1; local12 <= 102; local12++) {
			for (@Pc(17) int local17 = 1; local17 <= 102; local17++) {
				@Pc(30) int local30 = arg8[local12][local17] & 0xFF;
				@Pc(38) int local38 = arg1[local12][local17] & 0xFF;
				if (local38 != 0) {
					@Pc(48) FloType local48 = FloTypeList.get(local38 - 1);
					if (local48.anInt3869 == -1) {
						continue;
					}
					@Pc(60) Class4_Sub12 local60 = Static27.method4237(local10, local48);
					@Pc(66) byte local66 = arg5[local12][local17];
					@Pc(70) int[] local70 = Static1.anIntArrayArray5[local66];
					local60.anInt2352 += local70.length / 2;
					local60.anInt2355++;
					if (local48.aBoolean275 && local30 != 0) {
						local60.anInt2352 += Static4.anIntArray318[local66];
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
						if (local239.aBoolean275 && local239.anInt3869 != -1) {
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
						if (local363.aBoolean275 && local363.anInt3869 != -1) {
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
						if (local471.aBoolean275 && local471.anInt3869 != -1) {
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
						if (local596.aBoolean275 && local596.anInt3869 != -1) {
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
						if (local715.aBoolean275 && local715.anInt3869 != -1) {
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
						if (local785.aBoolean275 && local785.anInt3869 != -1) {
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
						if (local860.aBoolean275 && local860.anInt3869 != -1) {
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
						if (local941.aBoolean275 && local941.anInt3869 != -1) {
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
						@Pc(1061) Class4_Sub12 local1061 = Static27.method4237(local10, local1056);
						local1061.anInt2352 += 5;
						local1061.anInt2352 += local1050.length - 2;
						local1061.anInt2352 += local1019.length - 2;
						local1061.anInt2352 += local1028.length - 2;
						local1061.anInt2352 += local1037.length - 2;
						local1061.anInt2355++;
					}
				}
			}
		}
		for (@Pc(1123) Class4_Sub12 local1123 = (Class4_Sub12) local10.head(); local1123 != null; local1123 = (Class4_Sub12) local10.next()) {
			local1123.method1872();
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
					if (local1215.anInt3869 == -1) {
						continue;
					}
					@Pc(1227) Class4_Sub12 local1227 = Static27.method4237(local10, local1215);
					@Pc(1233) byte local1233 = arg5[local1137][local1144];
					@Pc(1239) byte local1239 = arg6[local1137][local1144];
					@Pc(1251) int local1251 = Static15.method1474(arg2[local1137][local1144], local1215.anInt3877, local1215.anInt3869);
					@Pc(1265) int local1265 = Static15.method1474(arg2[local1137 + 1][local1144], local1215.anInt3877, local1215.anInt3869);
					@Pc(1281) int local1281 = Static15.method1474(arg2[local1137 + 1][local1144 + 1], local1215.anInt3877, local1215.anInt3869);
					@Pc(1295) int local1295 = Static15.method1474(arg2[local1137][local1144 + 1], local1215.anInt3877, local1215.anInt3869);
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
						if (local1454.aBoolean275 && local1454.anInt3869 != -1) {
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
						if (local1572.aBoolean275 && local1572.anInt3869 != -1) {
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
						if (local1694.aBoolean275 && local1694.anInt3869 != -1) {
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
						if (local1810.aBoolean275 && local1810.anInt3869 != -1) {
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
						if (local1926.aBoolean275 && local1926.anInt3869 != -1) {
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
						if (local2003.aBoolean275 && local2003.anInt3869 != -1) {
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
						if (local2080.aBoolean275 && local2080.anInt3869 != -1) {
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
						if (local2147.aBoolean275 && local2147.anInt3869 != -1) {
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
						@Pc(2277) Class4_Sub12 local2277 = Static27.method4237(local10, local2272);
						@Pc(2293) int local2293 = Static15.method1474(arg2[local1137][local1144], local2272.anInt3877, local2272.anInt3869) << 8 | 0xFF;
						@Pc(2311) int local2311 = Static15.method1474(arg2[local1137 + 1][local1144], local2272.anInt3877, local2272.anInt3869) << 8 | 0xFF;
						@Pc(2331) int local2331 = Static15.method1474(arg2[local1137 + 1][local1144 + 1], local2272.anInt3877, local2272.anInt3869) << 8 | 0xFF;
						@Pc(2351) int local2351 = Static15.method1474(arg2[local1137][local1144 + 1], local2272.anInt3877, local2272.anInt3869) << 8 | 0xFF;
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
						local2277.method1870(local1159, local1137, local1144, local2435, null, true);
					}
				}
			}
		}
		for (@Pc(2739) Class4_Sub12 local2739 = (Class4_Sub12) local10.head(); local2739 != null; local2739 = (Class4_Sub12) local10.next()) {
			if (local2739.anInt2357 == 0) {
				local2739.unlink();
			} else {
				local2739.method1866();
			}
		}
		@Pc(2766) int local2766 = local10.size();
		@Pc(2774) Class4_Sub12[] local2774 = new Class4_Sub12[local2766];
		@Pc(2777) long[] local2777 = new long[local2766];
		local10.toArray(local2774);
		for (@Pc(2784) int local2784 = 0; local2784 < local2766; local2784++) {
			local2777[local2784] = local2774[local2784].key;
		}
		Static11.method563(local2777, local2774);
		return local2774;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!vg;IIBII)Lclient!vg;")
	public static Model method3427(@OriginalArg(0) int arg0, @OriginalArg(1) Model arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) long local18 = (long) arg3;
		@Pc(24) Model local24 = (Model) Static4.aClass26_30.get(local18);
		if (local24 == null) {
			@Pc(32) Class53_Sub3 local32 = Class53_Sub3.create(client.js5Archive7, arg3);
			if (local32 == null) {
				return null;
			}
			local24 = local32.method2761(64, 768, -50, -10, -50);
			Static4.aClass26_30.put(local18, local24);
		}
		@Pc(53) int local53 = arg1.method3829();
		@Pc(56) int local56 = arg1.method3838();
		@Pc(59) int local59 = arg1.method3818();
		@Pc(62) int local62 = arg1.method3841();
		@Pc(68) Model local68 = local24.method3836(true, true, true);
		if (arg0 != 0) {
			local68.method3815(arg0);
		}
		if (GlRenderer.enabled) {
			@Pc(148) GlModel local148 = (GlModel) local68;
			if (Static11.method522(arg2 + local59, arg5 + local53, Static7.y) != arg4 || arg4 != Static11.method522(arg2 + local62, local56 + arg5, Static7.y)) {
				for (@Pc(183) int local183 = 0; local183 < local148.anInt4689; local183++) {
					@Pc(189) int[] local189 = local148.anIntArray504;
					local189[local183] += Static11.method522(arg2 + local148.anIntArray502[local183], arg5 + local148.anIntArray507[local183], Static7.y) - arg4;
				}
				local148.aClass15_1.aBoolean15 = false;
				local148.aClass57_1.aBoolean103 = false;
			}
		} else {
			@Pc(78) SoftwareModel local78 = (SoftwareModel) local68;
			if (arg4 != Static11.method522(arg2 + local59, local53 + arg5, Static7.y) || Static11.method522(local62 + arg2, local56 + arg5, Static7.y) != arg4) {
				for (@Pc(108) int local108 = 0; local108 < local78.anInt3440; local108++) {
					@Pc(114) int[] local114 = local78.anIntArray344;
					local114[local108] += Static11.method522(local78.anIntArray340[local108] + arg2, arg5 + local78.anIntArray347[local108], Static7.y) - arg4;
				}
				local78.aBoolean244 = false;
			}
		}
		return local68;
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
			@Pc(47) Container local47;
			if (GameShell.fullScreenFrame != null) {
				local47 = GameShell.fullScreenFrame;
			} else if (GameShell.frame == null) {
				local47 = GameShell.signLink.applet;
			} else {
				local47 = GameShell.frame;
			}
			@Pc(58) int local58 = 0;
			@Pc(60) int local60 = 0;
			if (local47 == GameShell.frame) {
				@Pc(66) Insets local66 = GameShell.frame.getInsets();
				local58 = local66.left;
				local60 = local66.top;
			}
			@Pc(75) Graphics local75 = local47.getGraphics();
			local75.setColor(Color.black);
			if (local7 > 0) {
				local75.fillRect(local58, local60, local7, GameShell.frameHeight);
			}
			if (local9 > 0) {
				local75.fillRect(local58, local60, GameShell.frameWidth, local9);
			}
			if (local24 > 0) {
				local75.fillRect(local58 + GameShell.frameWidth - local24, local60, local24, GameShell.frameHeight);
			}
			if (local16 > 0) {
				local75.fillRect(local58, local60 + GameShell.frameHeight - local16, GameShell.frameWidth, local16);
			}
		} catch (@Pc(127) Exception local127) {
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIZ)Ljava/lang/String;")
	public static String method3436(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static19.method4377(arg0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!eg;IIIZZ)V")
	public static void method3461(@OriginalArg(0) SeqType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (Static6.anInt4457 >= 50 || (arg0 == null || arg0.anIntArrayArray11 == null || arg0.anIntArrayArray11.length <= arg3 || arg0.anIntArrayArray11[arg3] == null)) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray11[arg3][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(52) int local52 = local34 & 0x1F;
		if (arg0.anIntArrayArray11[arg3].length > 1) {
			@Pc(69) int local69 = (int) ((double) arg0.anIntArrayArray11[arg3].length * Math.random());
			if (local69 > 0) {
				local38 = arg0.anIntArrayArray11[arg3][local69];
			}
		}
		if (local52 == 0) {
			if (arg4) {
				Static15.method1227(0, local38, local44, 255);
			}
		} else if (Preferences.areaSoundsVolume != 0) {
			Static4.anIntArray294[Static6.anInt4457] = local38;
			Static7.anIntArray629[Static6.anInt4457] = local44;
			@Pc(113) int local113 = (arg1 - 64) / 128;
			Static3.anIntArray217[Static6.anInt4457] = 0;
			Static4.aClass7Array1[Static6.anInt4457] = null;
			Static1.anIntArray21[Static6.anInt4457] = 255;
			@Pc(131) int local131 = (arg2 - 64) / 128;
			Static7.anIntArray601[Static6.anInt4457] = local52 + (local113 << 8) + (local131 << 16);
			Static6.anInt4457++;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
	public static void method3463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = 0;
		@Pc(14) int local14 = arg2;
		@Pc(16) int local16 = -1;
		@Pc(19) int local19 = -arg2;
		@Pc(27) int local27 = Static8.method9(Static2.anInt902, arg2 + arg1, Static3.anInt2553);
		@Pc(35) int local35 = Static8.method9(Static2.anInt902, arg1 - arg2, Static3.anInt2553);
		Static18.method1656(Static5.anIntArrayArray36[arg0], arg3, local35, local27);
		while (local14 > local3) {
			local16 += 2;
			local19 += local16;
			if (local19 > 0) {
				local14--;
				local19 -= local14 << 1;
				@Pc(72) int local72 = arg0 - local14;
				@Pc(76) int local76 = local14 + arg0;
				if (local76 >= Static4.anInt3086 && local72 <= Static5.anInt4230) {
					@Pc(98) int local98 = Static8.method9(Static2.anInt902, arg1 + local3, Static3.anInt2553);
					@Pc(106) int local106 = Static8.method9(Static2.anInt902, arg1 - local3, Static3.anInt2553);
					if (Static5.anInt4230 >= local76) {
						Static18.method1656(Static5.anIntArrayArray36[local76], arg3, local106, local98);
					}
					if (Static4.anInt3086 <= local72) {
						Static18.method1656(Static5.anIntArrayArray36[local72], arg3, local106, local98);
					}
				}
			}
			local3++;
			@Pc(138) int local138 = arg0 - local3;
			@Pc(142) int local142 = arg0 + local3;
			if (Static4.anInt3086 <= local142 && local138 <= Static5.anInt4230) {
				@Pc(166) int local166 = Static8.method9(Static2.anInt902, arg1 + local14, Static3.anInt2553);
				@Pc(174) int local174 = Static8.method9(Static2.anInt902, arg1 - local14, Static3.anInt2553);
				if (local142 <= Static5.anInt4230) {
					Static18.method1656(Static5.anIntArrayArray36[local142], arg3, local174, local166);
				}
				if (Static4.anInt3086 <= local138) {
					Static18.method1656(Static5.anIntArrayArray36[local138], arg3, local174, local166);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method3464(@OriginalArg(0) String arg0) {
		@Pc(15) String local15 = Base37.decodeTitleCase(Base37.encode(arg0));
		if (local15 == null) {
			local15 = "";
		}
		return local15;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJ)V")
	public static void method3475(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Protocol.outboundBuffer.writeOpcode(218);
			Protocol.outboundBuffer.writeLong(arg0);
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
	public static void method3476() {
		if (Static5.anInt4329 > 1) {
			Static1.anInt925 = Static6.anInt4979;
			Static5.anInt4329--;
		}
		if (Static1.anInt885 > 0) {
			Static1.anInt885--;
		}
		if (Static1.aBoolean38) {
			Static1.aBoolean38 = false;
			Static23.method2455();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Protocol.readPacket(); local32++) {
		}
		if (Static4.anInt3304 != 30) {
			return;
		}
		Static31.method3753(Protocol.outboundBuffer);
		synchronized (MouseRecorder.instance.lock) {
			if (!Static5.aBoolean277) {
				MouseRecorder.instance.samples = 0;
			} else if (Mouse.clickButton != 0 || MouseRecorder.instance.samples >= 40) {
				Protocol.outboundBuffer.writeOpcode(199);
				Protocol.outboundBuffer.writeByte(0);
				@Pc(86) int local86 = 0;
				@Pc(89) int local89 = Protocol.outboundBuffer.position;
				for (@Pc(91) int local91 = 0; local91 < MouseRecorder.instance.samples && Protocol.outboundBuffer.position - local89 < 240; local91++) {
					local86++;
					@Pc(113) int local113 = MouseRecorder.instance.x[local91];
					@Pc(118) int local118 = MouseRecorder.instance.y[local91];
					if (local118 < 0) {
						local118 = 0;
					} else if (local118 > 65534) {
						local118 = 65534;
					}
					@Pc(136) boolean local136 = false;
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 65534) {
						local113 = 65534;
					}
					if (MouseRecorder.instance.y[local91] == -1 && MouseRecorder.instance.x[local91] == -1) {
						local136 = true;
						local113 = -1;
						local118 = -1;
					}
					if (Static3.anInt2505 != local113 || local118 != Static6.anInt4835) {
						@Pc(195) int local195 = local118 - Static6.anInt4835;
						Static6.anInt4835 = local118;
						@Pc(201) int local201 = local113 - Static3.anInt2505;
						Static3.anInt2505 = local113;
						if (Static3.anInt2235 < 8 && local201 >= -32 && local201 <= 31 && local195 >= -32 && local195 <= 31) {
							@Pc(223) int local223 = local201 + 32;
							@Pc(224) int local224 = local195 + 32;
							Protocol.outboundBuffer.writeShort((Static3.anInt2235 << 12) + (local223 << 6) + local224);
							Static3.anInt2235 = 0;
						} else if (Static3.anInt2235 < 32 && local201 >= -128 && local201 <= 127 && local195 >= -128 && local195 <= 127) {
							Protocol.outboundBuffer.writeByte(Static3.anInt2235 + 128);
							@Pc(265) int local265 = local195 + 128;
							@Pc(266) int local266 = local201 + 128;
							Protocol.outboundBuffer.writeShort((local266 << 8) + local265);
							Static3.anInt2235 = 0;
						} else if (Static3.anInt2235 < 32) {
							Protocol.outboundBuffer.writeByte(Static3.anInt2235 + 192);
							if (local136) {
								Protocol.outboundBuffer.writeInt(Integer.MIN_VALUE);
							} else {
								Protocol.outboundBuffer.writeInt(local113 | local118 << 16);
							}
							Static3.anInt2235 = 0;
						} else {
							Protocol.outboundBuffer.writeShort(Static3.anInt2235 + 57344);
							if (local136) {
								Protocol.outboundBuffer.writeInt(Integer.MIN_VALUE);
							} else {
								Protocol.outboundBuffer.writeInt(local113 | local118 << 16);
							}
							Static3.anInt2235 = 0;
						}
					} else if (Static3.anInt2235 < 2047) {
						Static3.anInt2235++;
					}
				}
				Protocol.outboundBuffer.writeByteLength(Protocol.outboundBuffer.position - local89);
				if (local86 < MouseRecorder.instance.samples) {
					@Pc(350) MouseRecorder local350 = MouseRecorder.instance;
					local350.samples -= local86;
					for (@Pc(357) int local357 = 0; local357 < MouseRecorder.instance.samples; local357++) {
						MouseRecorder.instance.x[local357] = MouseRecorder.instance.x[local86 + local357];
						MouseRecorder.instance.y[local357] = MouseRecorder.instance.y[local86 + local357];
					}
				} else {
					MouseRecorder.instance.samples = 0;
				}
			}
		}
		if (Mouse.clickButton != 0) {
			@Pc(414) int local414 = Mouse.clickY;
			if (local414 < 0) {
				local414 = 0;
			} else if (local414 > 65535) {
				local414 = 65535;
			}
			@Pc(436) long local436 = (Mouse.clickTime - Static1.aLong32) / 50L;
			if (local436 > 32767L) {
				local436 = 32767L;
			}
			Static1.aLong32 = Mouse.clickTime;
			@Pc(449) int local449 = Mouse.clickX;
			if (local449 < 0) {
				local449 = 0;
			} else if (local449 > 65535) {
				local449 = 65535;
			}
			@Pc(466) byte local466 = 0;
			if (Mouse.clickButton == 2) {
				local466 = 1;
			}
			Protocol.outboundBuffer.writeOpcode(200);
			Protocol.outboundBuffer.writeIntAlt3Reverse(local414 << 16 | local449);
			@Pc(489) int local489 = (int) local436;
			Protocol.outboundBuffer.writeShortA(local466 << 15 | local489);
		}
		if (Static7.anInt5269 > 0) {
			Static7.anInt5269--;
		}
		if (Static5.aBoolean248 && Static7.anInt5269 <= 0) {
			Static5.aBoolean248 = false;
			Static7.anInt5269 = 20;
			Protocol.outboundBuffer.writeOpcode(140);
			Protocol.outboundBuffer.writeShortLE2((int) Static5.aFloat147);
			Protocol.outboundBuffer.writeShortLEA((int) Static5.aFloat97);
		}
		if (GameShell.focus && !Static7.aBoolean367) {
			Static7.aBoolean367 = true;
			Protocol.outboundBuffer.writeOpcode(248);
			Protocol.outboundBuffer.writeByte(1);
		}
		if (!GameShell.focus && Static7.aBoolean367) {
			Static7.aBoolean367 = false;
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
		Static22.method4692();
		Static37.method4713();
		Static27.method4704();
		Static3.anInt2583++;
		if (Static3.anInt2583 > 750) {
			Static23.method2455();
			return;
		}
		Static16.method1576();
		Static8.method8();
		Static38.method4825();
		for (@Pc(658) int varp = VarpDomain.poll(true); varp != -1; varp = VarpDomain.poll(false)) {
			method3534(varp);
			VarpDomain.updatedVarps[VarpDomain.updatedVarpsWriterIndex++ & 0x1F] = varp;
		}
		for (@Pc(683) DelayedStateChange change = DelayedStateChange.poll(); change != null; change = DelayedStateChange.poll()) {
			@Pc(689) int type = change.getType();
			@Pc(693) int id = change.getId();
			if (type == 1) {
				VarcDomain.varcs[id] = change.primaryIntArg;
				VarcDomain.updatedVarcs[VarcDomain.updatedVarcsWriterIndex++ & 0x1F] = id;
			} else if (type == 2) {
				VarcDomain.varcstrs[id] = change.stringArg;
				VarcDomain.updatedVarcstrs[VarcDomain.updatedVarcstrsWriterIndex++ & 0x1F] = id;
			} else if (type == 3) {
				@Pc(1175) Component local1175 = InterfaceList.getComponent(id);
				if (!change.stringArg.equals(local1175.aString351)) {
					local1175.aString351 = change.stringArg;
					Static28.method3270(local1175);
				}
			} else if (type == 4) {
				@Pc(732) Component local732 = InterfaceList.getComponent(id);
				@Pc(735) int local735 = change.primaryIntArg;
				@Pc(738) int local738 = change.secondaryIntArg;
				@Pc(741) int local741 = change.tertiaryIntArg;
				if (local732.anInt5939 != local735 || local738 != local732.anInt5895 || local732.anInt5913 != local741) {
					local732.anInt5895 = local738;
					local732.anInt5913 = local741;
					local732.anInt5939 = local735;
					Static28.method3270(local732);
				}
			} else if (type == 5) {
				@Pc(1137) Component local1137 = InterfaceList.getComponent(id);
				if (local1137.anInt5891 != change.primaryIntArg || change.primaryIntArg == -1) {
					local1137.anInt5892 = 0;
					local1137.anInt5891 = change.primaryIntArg;
					local1137.anInt5979 = 1;
					local1137.anInt5897 = 0;
					Static28.method3270(local1137);
				}
			} else if (type == 6) {
				@Pc(1084) int local1084 = change.primaryIntArg;
				@Pc(1090) int local1090 = local1084 >> 5 & 0x1F;
				@Pc(1094) Component local1094 = InterfaceList.getComponent(id);
				@Pc(1100) int local1100 = local1084 >> 10 & 0x1F;
				@Pc(1104) int local1104 = local1084 & 0x1F;
				@Pc(1117) int local1117 = (local1104 << 3) + (local1100 << 19) + (local1090 << 11);
				if (local1094.anInt5933 != local1117) {
					local1094.anInt5933 = local1117;
					Static28.method3270(local1094);
				}
			} else if (type == 7) {
				@Pc(790) Component local790 = InterfaceList.getComponent(id);
				@Pc(800) boolean local800 = change.primaryIntArg == 1;
				if (local790.aBoolean417 != local800) {
					local790.aBoolean417 = local800;
					Static28.method3270(local790);
				}
			} else if (type == 8) {
				@Pc(825) Component local825 = InterfaceList.getComponent(id);
				if (local825.anInt5944 != change.primaryIntArg || change.secondaryIntArg != local825.anInt5976 || change.tertiaryIntArg != local825.anInt5918) {
					local825.anInt5976 = change.secondaryIntArg;
					local825.anInt5918 = change.tertiaryIntArg;
					if (local825.anInt5938 != -1) {
						if (local825.anInt5957 > 0) {
							local825.anInt5918 = local825.anInt5918 * 32 / local825.anInt5957;
						} else if (local825.anInt5927 > 0) {
							local825.anInt5918 = local825.anInt5918 * 32 / local825.anInt5927;
						}
					}
					local825.anInt5944 = change.primaryIntArg;
					Static28.method3270(local825);
				}
			} else if (type == 9) {
				@Pc(905) Component local905 = InterfaceList.getComponent(id);
				if (local905.anInt5938 != change.primaryIntArg || local905.anInt5962 != change.secondaryIntArg) {
					local905.anInt5962 = change.secondaryIntArg;
					local905.anInt5938 = change.primaryIntArg;
					Static28.method3270(local905);
				}
			} else if (type == 10) {
				@Pc(1044) Component local1044 = InterfaceList.getComponent(id);
				if (local1044.anInt5963 != change.primaryIntArg || change.secondaryIntArg != local1044.anInt5906 || local1044.anInt5886 != change.tertiaryIntArg) {
					local1044.anInt5906 = change.secondaryIntArg;
					local1044.anInt5963 = change.primaryIntArg;
					local1044.anInt5886 = change.tertiaryIntArg;
					Static28.method3270(local1044);
				}
			} else if (type == 11) {
				@Pc(948) Component local948 = InterfaceList.getComponent(id);
				local948.anInt5960 = local948.anInt5928 = change.primaryIntArg;
				local948.anInt5888 = local948.anInt5951 = change.secondaryIntArg;
				local948.aByte25 = 0;
				local948.aByte26 = 0;
				Static28.method3270(local948);
			} else if (type == 12) {
				@Pc(996) Component local996 = InterfaceList.getComponent(id);
				@Pc(999) int local999 = change.primaryIntArg;
				if (local996 != null && local996.type == 0) {
					if (local996.anInt5887 - local996.anInt5949 < local999) {
						local999 = local996.anInt5887 - local996.anInt5949;
					}
					if (local999 < 0) {
						local999 = 0;
					}
					if (local996.anInt5931 != local999) {
						local996.anInt5931 = local999;
						Static28.method3270(local996);
					}
				}
			} else if (type == 13) {
				@Pc(986) Component local986 = InterfaceList.getComponent(id);
				local986.anInt5901 = change.primaryIntArg;
			}
		}
		if (Static7.anInt6008 != 0) {
			Static2.anInt1629 += 20;
			if (Static2.anInt1629 >= 400) {
				Static7.anInt6008 = 0;
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
						@Pc(1306) Component local1306 = Static5.aClass185_10;
						@Pc(1312) byte local1312 = 0;
						if (Static7.anInt5935 == 1 && local1306.anInt5904 == 206) {
							local1312 = 1;
						}
						if (local1306.anIntArray660[Static4.anInt2989] <= 0) {
							local1312 = 0;
						}
						if (Static12.method687(local1306).method3279()) {
							@Pc(1343) int local1343 = Static4.anInt2989;
							@Pc(1345) int local1345 = Static1.anInt91;
							local1306.anIntArray660[local1343] = local1306.anIntArray660[local1345];
							local1306.anIntArray661[local1343] = local1306.anIntArray661[local1345];
							local1306.anIntArray660[local1345] = -1;
							local1306.anIntArray661[local1345] = 0;
						} else if (local1312 == 1) {
							@Pc(1380) int local1380 = Static1.anInt91;
							@Pc(1382) int local1382 = Static4.anInt2989;
							while (local1382 != local1380) {
								if (local1382 < local1380) {
									local1306.method4733(local1380, local1380 - 1);
									local1380--;
								} else if (local1380 < local1382) {
									local1306.method4733(local1380, local1380 + 1);
									local1380++;
								}
							}
						} else {
							local1306.method4733(Static1.anInt91, Static4.anInt2989);
						}
						Protocol.outboundBuffer.writeOpcode(6);
						Protocol.outboundBuffer.writeShortLEA(Static4.anInt2989);
						Protocol.outboundBuffer.writeByteS(local1312);
						Protocol.outboundBuffer.writeIntAlt3(Static5.aClass185_10.id);
						Protocol.outboundBuffer.writeShortLE2(Static1.anInt91);
					}
				} else if ((Static3.anInt5400 == 1 || Static13.method1005(Static7.anInt5634 - 1)) && Static7.anInt5634 > 2) {
					Static31.method3783();
				} else if (Static7.anInt5634 > 0) {
					Static37.method4784();
				}
				Static2.anInt2246 = 10;
				Static5.aClass185_10 = null;
				Mouse.clickButton = 0;
			}
		}
		Static4.aBoolean232 = false;
		Static7.aClass185_16 = null;
		Static6.anInt5088 = 0;
		@Pc(1483) Component local1483 = Static5.aClass185_11;
		Static5.aClass185_11 = null;
		@Pc(1487) Component local1487 = Static2.aClass185_4;
		Static2.aClass185_4 = null;
		Static6.aBoolean310 = false;
		while (Keyboard.nextKey() && Static6.anInt5088 < 128) {
			Static5.anIntArray441[Static6.anInt5088] = Keyboard.keyCode;
			Static5.anIntArray419[Static6.anInt5088] = Keyboard.keyChar;
			Static6.anInt5088++;
		}
		Static5.aClass185_12 = null;
		if (Static3.anInt5398 != -1) {
			Static14.method1060(Static3.anInt5398, GameShell.canvasWidth, 0, 0, 0, 0, GameShell.canvasHeight);
		}
		Static6.anInt4979++;
		if (Static5.aClass185_12 != null) {
			Static25.method2770();
		}
		while (true) {
			@Pc(1562) Component local1562;
			@Pc(1550) Component local1550;
			@Pc(1542) Class4_Sub13 local1542;
			do {
				local1542 = (Class4_Sub13) Static2.aClass112_6.removeHead();
				if (local1542 == null) {
					while (true) {
						@Pc(1611) Component local1611;
						@Pc(1600) Component local1600;
						@Pc(1593) Class4_Sub13 local1593;
						do {
							local1593 = (Class4_Sub13) Static2.aClass112_10.removeHead();
							if (local1593 == null) {
								while (true) {
									@Pc(1660) Component local1660;
									@Pc(1650) Component local1650;
									@Pc(1643) Class4_Sub13 local1643;
									do {
										local1643 = (Class4_Sub13) Static3.aClass112_14.removeHead();
										if (local1643 == null) {
											if (Static5.aClass185_12 == null) {
												Static1.anInt640 = 0;
											}
											if (Static1.aClass185_1 != null) {
												Static14.method1047();
											}
											if (Static3.anInt2576 > 0 && Keyboard.pressedKeys[82] && Keyboard.pressedKeys[81] && Static3.anInt2885 != 0) {
												@Pc(1717) int local1717 = Static7.y - Static3.anInt2885;
												if (local1717 < 0) {
													local1717 = 0;
												} else if (local1717 > 3) {
													local1717 = 3;
												}
												Static24.method2945(PlayerList.self.anIntArray422[0] + Static5.originX, Static7.originZ + PlayerList.self.anIntArray426[0], local1717);
											}
											if (Static3.anInt2576 > 0 && Keyboard.pressedKeys[82] && Keyboard.pressedKeys[81]) {
												if (Static1.anInt528 != -1) {
													Static24.method2945(Static1.anInt528 + Static5.originX, Static1.anInt420 + Static7.originZ, Static7.y);
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
													Static6.anInt5177 = Mouse.clickX;
													Static7.anInt6008 = 1;
													Static2.anInt1629 = 0;
													Static4.anInt3275 = Mouse.clickY;
												}
												Static2.anInt1767 = 0;
											} else if (Static6.anInt4946 == 2) {
												if (Static1.anInt528 != -1) {
													Protocol.outboundBuffer.writeOpcode(85);
													Protocol.outboundBuffer.writeShortLEA(Static5.originX + Static1.anInt528);
													Protocol.outboundBuffer.writeShortLE2(Static7.originZ + Static1.anInt420);
													Static7.anInt6008 = 1;
													Static2.anInt1629 = 0;
													Static4.anInt3275 = Mouse.clickY;
													Static6.anInt5177 = Mouse.clickX;
												}
												Static6.anInt4946 = 0;
											} else if (Static1.anInt528 != -1 && Static2.anInt1767 == 0 && Static6.anInt4946 == 0) {
												@Pc(1797) int local1797 = (Static1.anInt528 << 1) + 1 - PlayerList.self.getSize() >> 1;
												@Pc(1809) int local1809 = (Static1.anInt420 << 1) + 1 - PlayerList.self.getSize() >> 1;
												Static37.method4661(local1797, 0, local1809);
												Static6.anInt5177 = Mouse.clickX;
												Static4.anInt3275 = Mouse.clickY;
												Static7.anInt6008 = 1;
												Static2.anInt1629 = 0;
												PathFinder.findPath(PlayerList.self.anIntArray422[0], PlayerList.self.anIntArray426[0], local1797, local1809, 0, 0, 0, 0, 0);
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
												@Pc(2019) int local2019 = Static1.anIntArray14[local2012]++;
											}
											@Pc(2037) int local2037 = Mouse.getIdleLoops();
											@Pc(2040) int local2040 = Keyboard.getIdleLoops();
											if (local2037 > 15000 && local2040 > 15000) {
												Static1.anInt885 = 250;
												Mouse.setIdleLoops(14500);
												Protocol.outboundBuffer.writeOpcode(91);
											}
											if (Static1.aClass197_1 != null && Static1.aClass197_1.status == 1) {
												if (Static1.aClass197_1.result != null) {
													Static37.method4719(Static6.aString269, Static4.aBoolean206);
												}
												Static6.aString269 = null;
												Static1.aClass197_1 = null;
												Static4.aBoolean206 = false;
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
													Static6.anInt3585 += Static5.anInt441;
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
											if (Static6.anInt3585 < -60) {
												Static5.anInt441 = 2;
											}
											if (Static6.anInt3585 > 60) {
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
											if (Static1.aBoolean50) {
												Static36.method4567();
												Static1.aBoolean50 = false;
											}
											try {
												if (Protocol.socket != null && Protocol.outboundBuffer.position > 0) {
													Protocol.socket.write(Protocol.outboundBuffer.bytes, Protocol.outboundBuffer.position);
													Protocol.outboundBuffer.position = 0;
													Static3.anInt2142 = 0;
												}
											} catch (@Pc(2285) IOException local2285) {
												Static23.method2455();
											}
											return;
										}
										local1650 = local1643.source;
										if (local1650.anInt5968 < 0) {
											break;
										}
										local1660 = InterfaceList.getComponent(local1650.anInt5937);
									} while (local1660 == null || local1660.aClass185Array4 == null || local1650.anInt5968 >= local1660.aClass185Array4.length || local1660.aClass185Array4[local1650.anInt5968] != local1650);
									Static21.method2019(local1643);
								}
							}
							local1600 = local1593.source;
							if (local1600.anInt5968 < 0) {
								break;
							}
							local1611 = InterfaceList.getComponent(local1600.anInt5937);
						} while (local1611 == null || local1611.aClass185Array4 == null || local1611.aClass185Array4.length <= local1600.anInt5968 || local1600 != local1611.aClass185Array4[local1600.anInt5968]);
						Static21.method2019(local1593);
					}
				}
				local1550 = local1542.source;
				if (local1550.anInt5968 < 0) {
					break;
				}
				local1562 = InterfaceList.getComponent(local1550.anInt5937);
			} while (local1562 == null || local1562.aClass185Array4 == null || local1562.aClass185Array4.length <= local1550.anInt5968 || local1562.aClass185Array4[local1550.anInt5968] != local1550);
			Static21.method2019(local1542);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIILclient!vc;JLclient!vc;Lclient!vc;)V")
	public static void method3478(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Entity arg6, @OriginalArg(7) Entity arg7) {
		@Pc(3) Class180 local3 = new Class180();
		local3.aClass53_7 = arg4;
		local3.x = x * 128 + 64;
		local3.z = z * 128 + 64;
		local3.anInt5501 = arg3;
		local3.aLong189 = arg5;
		local3.aClass53_8 = arg6;
		local3.aClass53_6 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Tile tile = Terrain.tiles[y][x][z];
		if (tile != null) {
			for (@Pc(46) int i = 0; i < tile.sceneryLen; i++) {
				@Pc(55) Scenery scenery = tile.scenery[i];
				if ((scenery.aLong38 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = scenery.aClass53_1.method3813();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt5499 = -local34;
		if (Terrain.tiles[y][x][z] == null) {
			Terrain.tiles[y][x][z] = new Tile(y, x, z);
		}
		Terrain.tiles[y][x][z].aClass180_1 = local3;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z[Lclient!wf;I)V")
	public static void method3480(@OriginalArg(1) Component[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) Component local15 = arg0[local7];
			if (local15 != null) {
				if (local15.type == 0) {
					if (local15.aClass185Array4 != null) {
						method3480(local15.aClass185Array4, arg1);
					}
					@Pc(44) Class4_Sub27 local44 = (Class4_Sub27) Static4.aClass84_13.get((long) local15.id);
					if (local44 != null) {
						Static28.method3277(local44.anInt4620, arg1);
					}
				}
				if (arg1 == 0 && local15.anObjectArray19 != null) {
					@Pc(64) Class4_Sub13 local64 = new Class4_Sub13();
					local64.source = local15;
					local64.arguments = local15.anObjectArray19;
					Static21.method2019(local64);
				}
				if (arg1 == 1 && local15.anObjectArray4 != null) {
					if (local15.anInt5968 >= 0) {
						@Pc(94) Component local94 = InterfaceList.getComponent(local15.id);
						if (local94 == null || local94.aClass185Array4 == null || local94.aClass185Array4.length <= local15.anInt5968 || local15 != local94.aClass185Array4[local15.anInt5968]) {
							continue;
						}
					}
					@Pc(123) Class4_Sub13 local123 = new Class4_Sub13();
					local123.arguments = local15.anObjectArray4;
					local123.source = local15;
					Static21.method2019(local123);
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
		@Pc(35) int local35 = Static11.method522(arg4, arg3, Static7.y) - arg1;
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

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILclient!f;I)V")
	public static void method3488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Player arg2, @OriginalArg(4) int arg3) {
		if (PlayerList.self == arg2 || Static7.anInt5634 >= 400) {
			return;
		}
		@Pc(144) String local144;
		if (arg2.skillLevel == 0) {
			@Pc(29) boolean local29 = true;
			if (PlayerList.self.anInt1586 != -1 && arg2.anInt1586 != -1) {
				@Pc(53) int local53 = arg2.combatLevel >= PlayerList.self.combatLevel ? arg2.combatLevel : PlayerList.self.combatLevel;
				@Pc(68) int local68 = PlayerList.self.anInt1586 >= arg2.anInt1586 ? arg2.anInt1586 : PlayerList.self.anInt1586;
				@Pc(79) int local79 = local53 * 10 / 100 + local68 + 5;
				@Pc(86) int local86 = PlayerList.self.combatLevel - arg2.combatLevel;
				if (local86 < 0) {
					local86 = -local86;
				}
				if (local79 < local86) {
					local29 = false;
				}
			}
			@Pc(110) String local110 = client.game == 1 ? LocalisedText.RATING : LocalisedText.LEVEL;
			if (arg2.anInt1576 <= arg2.combatLevel) {
				local144 = arg2.method1173() + (local29 ? Static20.method1921(PlayerList.self.combatLevel, arg2.combatLevel) : "<col=ffffff>") + " (" + local110 + arg2.combatLevel + ")";
			} else {
				local144 = arg2.method1173() + (local29 ? Static20.method1921(PlayerList.self.combatLevel, arg2.combatLevel) : "<col=ffffff>") + " (" + local110 + arg2.combatLevel + "+" + (arg2.anInt1576 - arg2.combatLevel) + ")";
			}
		} else {
			local144 = arg2.method1173() + " (" + LocalisedText.SKILL + arg2.skillLevel + ")";
		}
		if (Static2.anInt1334 == 1) {
			Static16.method1497((long) arg1, arg3, arg0, Static7.aString365 + " -> <col=ffffff>" + local144, LocalisedText.USE, (short) 21, Static2.anInt1937);
		} else if (!Static3.aBoolean177) {
			for (@Pc(269) int local269 = 7; local269 >= 0; local269--) {
				if (Static2.aStringArray40[local269] != null) {
					@Pc(277) short local277 = 0;
					if (client.game == 0 && Static2.aStringArray40[local269].equalsIgnoreCase(LocalisedText.ATTACK)) {
						if (PlayerList.self.combatLevel < arg2.combatLevel) {
							local277 = 2000;
						}
						if (PlayerList.self.team != 0 && arg2.team != 0) {
							if (arg2.team == PlayerList.self.team) {
								local277 = 2000;
							} else {
								local277 = 0;
							}
						}
					} else if (Static3.aBooleanArray11[local269]) {
						local277 = 2000;
					}
					@Pc(336) short local336 = Static7.aShortArray122[local269];
					local336 += local277;
					Static16.method1497((long) arg1, arg3, arg0, "<col=ffffff>" + local144, Static2.aStringArray40[local269], local336, Static5.anIntArray615[local269]);
				}
			}
		} else if ((Static5.anInt3560 & 0x8) != 0) {
			Static16.method1497((long) arg1, arg3, arg0, Static2.aString81 + " -> <col=ffffff>" + local144, Static4.aString140, (short) 5, Static6.anInt4466);
		}
		for (@Pc(367) int local367 = 0; local367 < Static7.anInt5634; local367++) {
			if (Static6.aShortArray100[local367] == 26) {
				Static6.aStringArray27[local367] = "<col=ffffff>" + local144;
				break;
			}
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
											local24 = local8.anInt3552;
											local27 = local8.y;
											local31 = Terrain.tiles[local24];
											var8 = 0.0F;
											if (GlRenderer.enabled) {
												if (Terrain.underwaterTileHeights == Terrain.tileHeights) {
													@Pc(44) int local44 = Terrain.anIntArrayArray10[local18][local21];
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
													@Pc(115) int local115 = Terrain.surfaceTileHeights[0][local18][local21] + Terrain.surfaceTileHeights[0][local18 + 1][local21] + Terrain.surfaceTileHeights[0][local18][local21 + 1] + Terrain.surfaceTileHeights[0][local18 + 1][local21 + 1] >> 2;
													Static24.method2652(3, -local115);
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
													@Pc(153) Tile local153 = Terrain.tiles[local24 - 1][local18][local21];
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
											if (local8.aClass4_Sub19_1 != null) {
												@Pc(287) Tile local287 = local8.aClass4_Sub19_1;
												if (GlRenderer.enabled) {
													GlRenderer.method1613(201.5F - (float) (local287.y + 1) * 50.0F);
												}
												if (local287.aClass142_1 == null) {
													if (local287.aClass166_1 != null) {
														if (Static11.method508(0, local18, local21)) {
															Static32.method3987(local287.aClass166_1, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, true);
														} else {
															Static32.method3987(local287.aClass166_1, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, false);
														}
													}
												} else if (Static11.method508(0, local18, local21)) {
													Static31.method3155(local287.aClass142_1, 0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, true);
												} else {
													Static31.method3155(local287.aClass142_1, 0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, false);
												}
												@Pc(363) Wall local363 = local287.wall;
												if (local363 != null) {
													if (GlRenderer.enabled) {
														if ((local363.anInt5493 & local8.anInt3558) == 0) {
															Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
														} else {
															Static27.method3119(local363.anInt5493, Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local27, local18, local21);
														}
													}
													local363.aClass53_5.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local363.x - Static7.anInt5281, local363.anInt5494 - Static6.anInt4375, local363.z - Static6.anInt4400, local363.aLong188, local24, null);
												}
												for (@Pc(416) int local416 = 0; local416 < local287.sceneryLen; local416++) {
													@Pc(425) Scenery local425 = local287.scenery[local416];
													if (local425 != null) {
														if (GlRenderer.enabled) {
															Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
														}
														local425.aClass53_1.method3805(local425.anInt814, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local425.anInt821 - Static7.anInt5281, local425.anInt823 - Static6.anInt4375, local425.anInt827 - Static6.anInt4400, local425.aLong38, local24, null);
													}
												}
												if (GlRenderer.enabled) {
													GlRenderer.method1613(var8);
												}
											}
											@Pc(469) boolean local469 = false;
											if (local8.aClass142_1 == null) {
												if (local8.aClass166_1 != null) {
													if (Static11.method508(local27, local18, local21)) {
														Static32.method3987(local8.aClass166_1, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, true);
													} else {
														local469 = true;
														Static32.method3987(local8.aClass166_1, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, false);
													}
												}
											} else if (Static11.method508(local27, local18, local21)) {
												Static31.method3155(local8.aClass142_1, local27, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, true);
											} else {
												local469 = true;
												if (local8.aClass142_1.anInt4299 != 12345678 || Static2.aBoolean101 && local24 <= Static5.anInt3715) {
													Static31.method3155(local8.aClass142_1, local27, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local18, local21, false);
												}
											}
											if (local469) {
												@Pc(549) GroundDecor local549 = local8.groundDecor;
												if (local549 != null && (local549.aLong45 & 0x80000000L) != 0L) {
													if (GlRenderer.enabled && local549.aBoolean63) {
														GlRenderer.method1613(var8 + 50.0F - 1.5F);
													}
													if (GlRenderer.enabled) {
														Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													local549.aClass53_2.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local549.x - Static7.anInt5281, local549.anInt1130 - Static6.anInt4375, local549.z - Static6.anInt4400, local549.aLong45, local24, null);
													if (GlRenderer.enabled && local549.aBoolean63) {
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
														Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													local616.aClass53_5.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local616.x - Static7.anInt5281, local616.anInt5494 - Static6.anInt4375, local616.z - Static6.anInt4400, local616.aLong188, local24, null);
												}
												if ((local616.anInt5488 & local613) != 0 && !method3313(local27, local18, local21, local616.anInt5488)) {
													if (GlRenderer.enabled) {
														Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													local616.aClass53_4.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local616.x - Static7.anInt5281, local616.anInt5494 - Static6.anInt4375, local616.z - Static6.anInt4400, local616.aLong188, local24, null);
												}
											}
											if (local619 != null && !Static14.method1089(local27, local18, local21, local619.aClass53_10.method3813())) {
												if (GlRenderer.enabled) {
													GlRenderer.method1613(var8 - 0.5F);
												}
												if ((local619.anInt5629 & local613) != 0) {
													if (GlRenderer.enabled) {
														Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													local619.aClass53_10.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local619.x + local619.anInt5633 - Static7.anInt5281, local619.anInt5627 - Static6.anInt4375, local619.z + local619.anInt5625 - Static6.anInt4400, local619.aLong194, local24, null);
												} else if (local619.anInt5629 == 256) {
													@Pc(894) int local894 = local619.x - Static7.anInt5281;
													@Pc(899) int local899 = local619.anInt5627 - Static6.anInt4375;
													@Pc(904) int local904 = local619.z - Static6.anInt4400;
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
															Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
														}
														local619.aClass53_10.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local894 + local619.anInt5633, local899, local904 + local619.anInt5625, local619.aLong194, local24, null);
													} else if (local619.aClass53_9 != null) {
														if (GlRenderer.enabled) {
															Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
														}
														local619.aClass53_9.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local894, local899, local904, local619.aLong194, local24, null);
													}
												}
												if (GlRenderer.enabled) {
													GlRenderer.method1613(var8);
												}
											}
											if (local469) {
												@Pc(1001) GroundDecor local1001 = local8.groundDecor;
												if (local1001 != null && (local1001.aLong45 & 0x80000000L) == 0L) {
													if (GlRenderer.enabled && local1001.aBoolean63) {
														GlRenderer.method1613(var8 + 50.0F - 1.5F);
													}
													if (GlRenderer.enabled) {
														Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													local1001.aClass53_2.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local1001.x - Static7.anInt5281, local1001.anInt1130 - Static6.anInt4375, local1001.z - Static6.anInt4400, local1001.aLong45, local24, null);
													if (GlRenderer.enabled && local1001.aBoolean63) {
														GlRenderer.method1613(var8);
													}
												}
												@Pc(1064) Class180 local1064 = local8.aClass180_1;
												if (local1064 != null && local1064.anInt5499 == 0) {
													if (GlRenderer.enabled) {
														Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
													}
													if (local1064.aClass53_8 != null) {
														local1064.aClass53_8.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local1064.x - Static7.anInt5281, local1064.anInt5501 - Static6.anInt4375, local1064.z - Static6.anInt4400, local1064.aLong189, local24, null);
													}
													if (local1064.aClass53_6 != null) {
														local1064.aClass53_6.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local1064.x - Static7.anInt5281, local1064.anInt5501 - Static6.anInt4375, local1064.z - Static6.anInt4400, local1064.aLong189, local24, null);
													}
													if (local1064.aClass53_7 != null) {
														local1064.aClass53_7.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local1064.x - Static7.anInt5281, local1064.anInt5501 - Static6.anInt4375, local1064.z - Static6.anInt4400, local1064.aLong189, local24, null);
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
															if ((local1298.aLong188 & 0xFC000L) == 16384L) {
																@Pc(1319) int local1319 = local1298.x - Static7.anInt5281;
																@Pc(1324) int local1324 = local1298.z - Static6.anInt4400;
																@Pc(1332) int local1332 = (int) (local1298.aLong188 >> 20 & 0x3L);
																if (local1332 == 0) {
																	@Pc(1335) int local1335 = local1319 - 64;
																	@Pc(1336) int local1336 = local1324 + 64;
																	if (local1336 < local1335 && local18 > 0 && local21 < Terrain.length - 1) {
																		Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18 - 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 1) {
																	@Pc(1362) int local1362 = local1319 + 64;
																	@Pc(1363) int local1363 = local1324 + 64;
																	if (local1363 < -local1362 && local18 < Terrain.width - 1 && local21 < Terrain.length - 1) {
																		Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18 + 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 2) {
																	@Pc(1393) int local1393 = local1319 + 64;
																	@Pc(1394) int local1394 = local1324 - 64;
																	if (local1394 > local1393 && local18 < Terrain.width - 1 && local21 > 0) {
																		Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18 + 1, local21 - 1);
																		break label1037;
																	}
																} else if (local1332 == 3) {
																	@Pc(1420) int local1420 = local1319 - 64;
																	@Pc(1421) int local1421 = local1324 - 64;
																	if (local1421 > -local1420 && local18 > 0 && local21 > 0) {
																		Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18 - 1, local21 - 1);
																		break label1037;
																	}
																}
															}
															Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
														}
													}
													local1298.aClass53_5.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local1298.x - Static7.anInt5281, local1298.anInt5494 - Static6.anInt4375, local1298.z - Static6.anInt4400, local1298.aLong188, local24, null);
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
													Terrain.aClass33Array1[local1486++] = local1496;
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
													@Pc(1628) Scenery local1628 = Terrain.aClass33Array1[local1621];
													if (local1628.anInt815 != Static2.anInt1871) {
														if (local1628.anInt811 > local1617) {
															local1617 = local1628.anInt811;
															local1619 = local1621;
														} else if (local1628.anInt811 == local1617) {
															@Pc(1651) int local1651 = local1628.anInt821 - Static7.anInt5281;
															@Pc(1656) int local1656 = local1628.anInt827 - Static6.anInt4400;
															@Pc(1663) int local1663 = Terrain.aClass33Array1[local1619].anInt821 - Static7.anInt5281;
															@Pc(1670) int local1670 = Terrain.aClass33Array1[local1619].anInt827 - Static6.anInt4400;
															if (local1651 * local1651 + local1656 * local1656 > local1663 * local1663 + local1670 * local1670) {
																local1619 = local1621;
															}
														}
													}
												}
												if (local1619 == -1) {
													break;
												}
												@Pc(1697) Scenery local1697 = Terrain.aClass33Array1[local1619];
												local1697.anInt815 = Static2.anInt1871;
												if (!Static21.method2003(local27, local1697.xMin, local1697.xMax, local1697.zMin, local1697.zMax, local1697.aClass53_1.method3813())) {
													if (GlRenderer.enabled) {
														if ((local1697.aLong38 & 0xFC000L) == 147456L) {
															Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
															@Pc(1735) int local1735 = local1697.anInt821 - Static7.anInt5281;
															@Pc(1740) int local1740 = local1697.anInt827 - Static6.anInt4400;
															@Pc(1748) int local1748 = (int) (local1697.aLong38 >> 20 & 0x3L);
															if (local1748 == 1 || local1748 == 3) {
																if (local1740 > -local1735) {
																	Static27.method3117(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static27.method3117(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local1740 > local1735) {
																Static27.method3117(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static27.method3117(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static27.method3115(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local1697.xMin, local1697.zMin, local1697.xMax, local1697.zMax);
														}
													}
													local1697.aClass53_1.method3805(local1697.anInt814, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local1697.anInt821 - Static7.anInt5281, local1697.anInt823 - Static6.anInt4375, local1697.anInt827 - Static6.anInt4400, local1697.aLong38, local24, null);
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
									if (local8.aClass108_1 != null) {
										if (GlRenderer.enabled) {
											@Pc(1905) GL local1905 = GlRenderer.gl;
											GlRenderer.method1613(var8);
											Static26.method2961(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400);
											@Pc(1920) int local1920 = local8.x * 128 + 64 - Static7.anInt5281;
											@Pc(1932) int local1932 = Terrain.tileHeights[local24][local8.x][local8.z] - Static6.anInt4375;
											@Pc(1941) int local1941 = local8.z * 128 + 64 - Static6.anInt4400;
											@Pc(1966) int local1966;
											if (local24 < 3) {
												local1966 = Terrain.tileHeights[local24][local8.x][local8.z] - Terrain.tileHeights[local24 + 1][local8.x][local8.z];
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
											@Pc(2030) Class20_Sub2_Sub1 local2030 = null;
											@Pc(2032) Class20_Sub1 local2032 = null;
											@Pc(2034) int local2034 = -1;
											@Pc(2040) Class20_Sub2_Sub1 local2040 = (Class20_Sub2_Sub1) local8.aClass108_1.method2458();
											while (true) {
												label1054:
												{
													if (local2040 != null) {
														if (local2040.aClass20_Sub1_1 == null || local2040.aClass20_Sub1_1.aClass20_Sub3_1.aBoolean250) {
															local2040.method2944();
															break label1054;
														}
														if ((byte) (local2040.aClass20_Sub1_1.aClass20_Sub3_1.aLong124 & 0xFFL) != local8.aByte14) {
															local8.aClass108_1 = null;
															break;
														}
														if (local2030 == null) {
															local2030 = local2040;
															local2032 = local2040.aClass20_Sub1_1;
															local2034 = local2032.aClass89_1.anInt2399;
															break label1054;
														}
													}
													if (local2030 != null && (local2040 == null || local2040.aClass20_Sub1_1 != local2032 || local2040.aClass20_Sub1_1.aClass89_1.anInt2399 != local2034)) {
														for (@Pc(2097) int local2097 = 0; local2097 < local2028; local2097++) {
															Static5.anIntArray387[local2097] = 0;
														}
														for (@Pc(2108) int local2108 = 0; local2108 < 32; local2108++) {
															Static5.anIntArray388[local2108] = 0;
														}
														Static5.anInt3519 = 0;
														for (@Pc(2121) Class20_Sub2_Sub1 local2121 = local2030; local2121 != local2040; local2121 = (Class20_Sub2_Sub1) local2121.aClass20_Sub2_5) {
															if (local2121.aClass20_Sub1_1 != null) {
																@Pc(2134) int local2134 = (local2121.anInt3228 >> 12) - Static7.anInt5281;
																@Pc(2141) int local2141 = (local2121.anInt3229 >> 12) - Static6.anInt4375;
																@Pc(2148) int local2148 = (local2121.anInt3230 >> 12) - Static6.anInt4400;
																local2148 = local2148 * Static3.anInt2272 - local2134 * Static6.anInt4794 >> 16;
																local2148 = (local2141 * Static2.anInt2247 + local2148 * Static5.anInt3487 >> 16) - local2013;
																if (Static5.anIntArray387[local2148] < 32) {
																	Static5.aShortArrayArray3[local2148][Static5.anIntArray387[local2148]++] = local2121.aShort21;
																} else {
																	if (Static5.anIntArray387[local2148] == 32) {
																		if (Static5.anInt3519 == 32) {
																			if (Static5.aBoolean251) {
																				System.out.println("Overflowed world-based radix sort");
																			}
																			break;
																		}
																		@Pc(2205) int[] local2205 = Static5.anIntArray387;
																		local2205[local2148] += Static5.anInt3519++ + 1;
																	}
																	@Pc(2227) int local2227 = Static5.anIntArray388[Static5.anIntArray387[local2148] - 32 - 1];
																	if (local2227 < 768) {
																		Static5.aShortArrayArray4[Static5.anIntArray387[local2148] - 32 - 1][Static5.anIntArray388[Static5.anIntArray387[local2148] - 32 - 1]++] = local2121.aShort21;
																	}
																}
															}
															if (local2121.aClass20_Sub2_5 == local8.aClass108_1.aClass20_Sub2_1) {
																break;
															}
														}
														@Pc(2270) boolean local2270 = false;
														if (Static5.aBoolean249 && local2032.aClass89_1.anInt2403 != -1) {
															Static4.anInterface4_1.method451(local2032.aClass89_1.anInt2403);
															local2270 = true;
														} else {
															GlRenderer.setTextureId(-1);
														}
														@Pc(2293) float local2293 = (float) local2034 * Static5.aFloat86;
														if (local2293 > 64.0F) {
															local2293 = 64.0F;
														}
														local1905.glPointSize(local2293);
														local2032.aClass20_Sub3_1.method2955(local1905, local2028, local2270, local2032.aClass89_1.aBoolean167);
														if (local2040 != null) {
															local2030 = local2040;
															local2032 = local2040.aClass20_Sub1_1;
															local2034 = local2040.aClass20_Sub1_1.aClass89_1.anInt2399;
														}
													}
													if (local2040 == null) {
														break;
													}
												}
												local2040 = (Class20_Sub2_Sub1) local8.aClass108_1.method2461();
											}
											Static26.method2962();
										} else {
											@Pc(2339) int local2339 = Static5.anInt3506 + Static4.anInt3125;
											@Pc(2343) int local2343 = Static5.anInt3503 + Static4.anInt3126;
											@Pc(2347) Class20_Sub2 local2347 = local8.aClass108_1.aClass20_Sub2_1;
											for (@Pc(2350) Class20_Sub2 local2350 = local2347.aClass20_Sub2_5; local2350 != local2347; local2350 = local2350.aClass20_Sub2_5) {
												@Pc(2356) Class20_Sub2_Sub1 local2356 = (Class20_Sub2_Sub1) local2350;
												if (local2356.aClass20_Sub1_1 != null && !local2356.aClass20_Sub1_1.aClass20_Sub3_1.aBoolean250) {
													if ((byte) (local2356.aClass20_Sub1_1.aClass20_Sub3_1.aLong124 & 0xFFL) != local8.aByte14) {
														local8.aClass108_1 = null;
														break;
													}
													@Pc(2387) int local2387 = (local2356.anInt3228 >> 12) - Static7.anInt5281;
													@Pc(2394) int local2394 = (local2356.anInt3229 >> 12) - Static6.anInt4375;
													@Pc(2401) int local2401 = (local2356.anInt3230 >> 12) - Static6.anInt4400;
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
														Static33.method4206(local2456, local2464, (local2356.aClass20_Sub1_1.aClass89_1.anInt2399 << 16) / local2468, local2356.anInt3231, local2356.anInt3231 >> 24 & 0xFF);
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
			@Pc(2596) Class180 local2596 = local8.aClass180_1;
			if (local2596 != null && local2596.anInt5499 != 0) {
				if (GlRenderer.enabled) {
					Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
				}
				if (local2596.aClass53_8 != null) {
					local2596.aClass53_8.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2596.x - Static7.anInt5281, local2596.anInt5501 - Static6.anInt4375 - local2596.anInt5499, local2596.z - Static6.anInt4400, local2596.aLong189, local24, null);
				}
				if (local2596.aClass53_6 != null) {
					local2596.aClass53_6.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2596.x - Static7.anInt5281, local2596.anInt5501 - Static6.anInt4375 - local2596.anInt5499, local2596.z - Static6.anInt4400, local2596.aLong189, local24, null);
				}
				if (local2596.aClass53_7 != null) {
					local2596.aClass53_7.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2596.x - Static7.anInt5281, local2596.anInt5501 - Static6.anInt4375 - local2596.anInt5499, local2596.z - Static6.anInt4400, local2596.aLong189, local24, null);
				}
			}
			if (local8.anInt3558 != 0) {
				@Pc(2706) WallDecor local2706 = local8.wallDecor;
				if (local2706 != null && !Static14.method1089(local27, local18, local21, local2706.aClass53_10.method3813())) {
					if ((local2706.anInt5629 & local8.anInt3558) != 0) {
						if (GlRenderer.enabled) {
							Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
						}
						local2706.aClass53_10.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2706.x + local2706.anInt5633 - Static7.anInt5281, local2706.anInt5627 - Static6.anInt4375, local2706.z + local2706.anInt5625 - Static6.anInt4400, local2706.aLong194, local24, null);
					} else if (local2706.anInt5629 == 256) {
						@Pc(2771) int local2771 = local2706.x - Static7.anInt5281;
						@Pc(2776) int local2776 = local2706.anInt5627 - Static6.anInt4375;
						@Pc(2781) int local2781 = local2706.z - Static6.anInt4400;
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
								Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
							}
							local2706.aClass53_10.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2771 + local2706.anInt5633, local2776, local2781 + local2706.anInt5625, local2706.aLong194, local24, null);
						} else if (local2706.aClass53_9 != null) {
							if (GlRenderer.enabled) {
								Static27.method3114(Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local24, local18, local21);
							}
							local2706.aClass53_9.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2771, local2776, local2781, local2706.aLong194, local24, null);
						}
					}
				}
				@Pc(2872) Wall local2872 = local8.wall;
				if (local2872 != null) {
					if ((local2872.anInt5488 & local8.anInt3558) != 0 && !method3313(local27, local18, local21, local2872.anInt5488)) {
						if (GlRenderer.enabled) {
							Static27.method3119(local2872.anInt5488, Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local27, local18, local21);
						}
						local2872.aClass53_4.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2872.x - Static7.anInt5281, local2872.anInt5494 - Static6.anInt4375, local2872.z - Static6.anInt4400, local2872.aLong188, local24, null);
					}
					if ((local2872.anInt5493 & local8.anInt3558) != 0 && !method3313(local27, local18, local21, local2872.anInt5493)) {
						if (GlRenderer.enabled) {
							Static27.method3119(local2872.anInt5493, Static7.anInt5281, Static6.anInt4375, Static6.anInt4400, local27, local18, local21);
						}
						local2872.aClass53_5.method3805(0, Static2.anInt2247, Static5.anInt3487, Static6.anInt4794, Static3.anInt2272, local2872.x - Static7.anInt5281, local2872.anInt5494 - Static6.anInt4375, local2872.z - Static6.anInt4400, local2872.aLong188, local24, null);
					}
				}
			}
			if (local24 < Terrain.levels - 1) {
				@Pc(2985) Tile local2985 = Terrain.tiles[local24 + 1][local18][local21];
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
	public static void method3495(@OriginalArg(0) Component[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(19) Component local19 = arg0[local7];
			if (local19 != null && local19.anInt5937 == arg1 && (!local19.if3 || !Static12.method692(local19))) {
				if (local19.type == 0) {
					if (!local19.if3 && Static12.method692(local19) && Static5.aClass185_11 != local19) {
						continue;
					}
					method3495(arg0, local19.id);
					if (local19.aClass185Array4 != null) {
						method3495(local19.aClass185Array4, local19.id);
					}
					@Pc(79) Class4_Sub27 local79 = (Class4_Sub27) Static4.aClass84_13.get((long) local19.id);
					if (local79 != null) {
						Static27.method4243(local79.anInt4620);
					}
				}
				if (local19.type == 6) {
					if (local19.anInt5891 != -1 || local19.anInt5910 != -1) {
						@Pc(108) boolean local108 = Cs1ScriptRunner.isTrue(local19);
						@Pc(113) int local113;
						if (local108) {
							local113 = local19.anInt5910;
						} else {
							local113 = local19.anInt5891;
						}
						if (local113 != -1) {
							@Pc(129) SeqType local129 = SeqTypeList.get(local113);
							if (local129 != null) {
								local19.anInt5897 += Static5.anInt4156;
								while (local129.anIntArray94[local19.anInt5892] < local19.anInt5897) {
									local19.anInt5897 -= local129.anIntArray94[local19.anInt5892];
									local19.anInt5892++;
									if (local19.anInt5892 >= local129.anIntArray95.length) {
										local19.anInt5892 -= local129.anInt1242;
										if (local19.anInt5892 < 0 || local129.anIntArray95.length <= local19.anInt5892) {
											local19.anInt5892 = 0;
										}
									}
									local19.anInt5979 = local19.anInt5892 + 1;
									if (local129.anIntArray95.length <= local19.anInt5979) {
										local19.anInt5979 -= local129.anInt1242;
										if (local19.anInt5979 < 0 || local129.anIntArray95.length <= local19.anInt5979) {
											local19.anInt5979 = -1;
										}
									}
									Static28.method3270(local19);
								}
							}
						}
					}
					if (local19.anInt5901 != 0 && !local19.if3) {
						@Pc(261) int local261 = local19.anInt5901 >> 16;
						local261 *= Static5.anInt4156;
						@Pc(272) int local272 = local19.anInt5901 << 16 >> 16;
						local19.anInt5944 = local261 + local19.anInt5944 & 0x7FF;
						local272 *= Static5.anInt4156;
						local19.anInt5976 = local272 + local19.anInt5976 & 0x7FF;
						Static28.method3270(local19);
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
		@Pc(24) int local24 = Terrain.tileHeights[arg0][arg1][arg2] - 1;
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
		Static32.method3996();
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
			Static2.anInt1599 = value;
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
					Terrain.tileHeights[arg1][local71][local60] = arg1 > 0 ? Terrain.tileHeights[arg1 - 1][local71][local60] : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < 104) {
			for (@Pc(133) int local133 = arg3 + 1; local133 < arg3 + arg4; local133++) {
				if (local133 >= 0 && local133 < 104) {
					Terrain.tileHeights[arg1][arg0][local133] = Terrain.tileHeights[arg1][arg0 - 1][local133];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (@Pc(182) int local182 = arg0 + 1; local182 < arg0 + arg2; local182++) {
				if (local182 >= 0 && local182 < 104) {
					Terrain.tileHeights[arg1][local182][arg3] = Terrain.tileHeights[arg1][local182][arg3 - 1];
				}
			}
		}
		if (arg0 < 0 || arg3 < 0 || arg0 >= 104 || arg3 >= 104) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 > 0 && Terrain.tileHeights[arg1][arg0 - 1][arg3] != 0) {
				Terrain.tileHeights[arg1][arg0][arg3] = Terrain.tileHeights[arg1][arg0 - 1][arg3];
			} else if (arg3 > 0 && Terrain.tileHeights[arg1][arg0][arg3 - 1] != 0) {
				Terrain.tileHeights[arg1][arg0][arg3] = Terrain.tileHeights[arg1][arg0][arg3 - 1];
			} else if (arg0 > 0 && arg3 > 0 && Terrain.tileHeights[arg1][arg0 - 1][arg3 - 1] != 0) {
				Terrain.tileHeights[arg1][arg0][arg3] = Terrain.tileHeights[arg1][arg0 - 1][arg3 - 1];
			}
		} else if (arg0 > 0 && Terrain.tileHeights[arg1 - 1][arg0 - 1][arg3] != Terrain.tileHeights[arg1][arg0 - 1][arg3]) {
			Terrain.tileHeights[arg1][arg0][arg3] = Terrain.tileHeights[arg1][arg0 - 1][arg3];
		} else if (arg3 > 0 && Terrain.tileHeights[arg1 - 1][arg0][arg3 - 1] != Terrain.tileHeights[arg1][arg0][arg3 - 1]) {
			Terrain.tileHeights[arg1][arg0][arg3] = Terrain.tileHeights[arg1][arg0][arg3 - 1];
		} else if (arg0 > 0 && arg3 > 0 && Terrain.tileHeights[arg1 - 1][arg0 - 1][arg3 - 1] != Terrain.tileHeights[arg1][arg0 - 1][arg3 - 1]) {
			Terrain.tileHeights[arg1][arg0][arg3] = Terrain.tileHeights[arg1][arg0 - 1][arg3 - 1];
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
	public static int method3538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return local7 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	public static void method3541(@OriginalArg(0) int arg0) {
		if (Static5.anInt4357 == 0) {
			Static1.aClass4_Sub6_Sub2_3.method2479(arg0);
		} else {
			Static7.anInt5391 = arg0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([BI)V")
	public static void method3542(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Buffer local10 = new Buffer(arg0);
		local10.position = arg0.length - 2;
		Static4.anInt2748 = local10.readUnsignedShort();
		Static5.aBooleanArray22 = new boolean[Static4.anInt2748];
		Static4.aByteArrayArray54 = new byte[Static4.anInt2748][];
		Static5.anIntArray402 = new int[Static4.anInt2748];
		Static3.anIntArray185 = new int[Static4.anInt2748];
		Static6.aByteArrayArray36 = new byte[Static4.anInt2748][];
		Static7.anIntArray643 = new int[Static4.anInt2748];
		Static5.anIntArray391 = new int[Static4.anInt2748];
		local10.position = arg0.length - Static4.anInt2748 * 8 - 7;
		Static1.anInt889 = local10.readUnsignedShort();
		Static3.anInt2162 = local10.readUnsignedShort();
		@Pc(68) int local68 = (local10.readUnsignedByte() & 0xFF) + 1;
		for (@Pc(78) int local78 = 0; local78 < Static4.anInt2748; local78++) {
			Static5.anIntArray402[local78] = local10.readUnsignedShort();
		}
		for (@Pc(96) int local96 = 0; local96 < Static4.anInt2748; local96++) {
			Static5.anIntArray391[local96] = local10.readUnsignedShort();
		}
		for (@Pc(114) int local114 = 0; local114 < Static4.anInt2748; local114++) {
			Static3.anIntArray185[local114] = local10.readUnsignedShort();
		}
		for (@Pc(132) int local132 = 0; local132 < Static4.anInt2748; local132++) {
			Static7.anIntArray643[local132] = local10.readUnsignedShort();
		}
		local10.position = arg0.length - Static4.anInt2748 * 8 - (local68 - 1) * 3 - 7;
		Static2.anIntArray85 = new int[local68];
		for (@Pc(166) int local166 = 1; local166 < local68; local166++) {
			Static2.anIntArray85[local166] = local10.readUnsignedMedium();
			if (Static2.anIntArray85[local166] == 0) {
				Static2.anIntArray85[local166] = 1;
			}
		}
		local10.position = 0;
		for (@Pc(195) int local195 = 0; local195 < Static4.anInt2748; local195++) {
			@Pc(206) int local206 = Static3.anIntArray185[local195];
			@Pc(210) int local210 = Static7.anIntArray643[local195];
			@Pc(214) int local214 = local210 * local206;
			@Pc(217) byte[] local217 = new byte[local214];
			Static6.aByteArrayArray36[local195] = local217;
			@Pc(224) byte[] local224 = new byte[local214];
			@Pc(226) boolean local226 = false;
			Static4.aByteArrayArray54[local195] = local224;
			@Pc(234) int local234 = local10.readUnsignedByte();
			if ((local234 & 0x1) == 0) {
				for (@Pc(243) int local243 = 0; local243 < local214; local243++) {
					local217[local243] = local10.readByte();
				}
				if ((local234 & 0x2) != 0) {
					for (@Pc(266) int local266 = 0; local266 < local214; local266++) {
						@Pc(277) byte local277 = local224[local266] = local10.readByte();
						local226 |= local277 != -1;
					}
				}
			} else {
				@Pc(294) int local294 = 0;
				label98:
				while (true) {
					if (local294 >= local206) {
						if ((local234 & 0x2) == 0) {
							break;
						}
						@Pc(337) int local337 = 0;
						while (true) {
							if (local337 >= local206) {
								break label98;
							}
							for (@Pc(346) int local346 = 0; local346 < local210; local346++) {
								@Pc(365) byte local365 = local224[local337 + local346 * local206] = local10.readByte();
								local226 |= local365 != -1;
							}
							local337++;
						}
					}
					for (@Pc(303) int local303 = 0; local303 < local210; local303++) {
						local217[local294 + local206 * local303] = local10.readByte();
					}
					local294++;
				}
			}
			Static5.aBooleanArray22[local195] = local226;
		}
	}
}

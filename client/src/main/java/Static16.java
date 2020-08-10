import java.awt.Canvas;
import java.util.Date;
import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawableFactory;

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
		Static7.anInt5678 = (int) local27[2] - Static7.anInt5479 * 128;
		Static2.anInt1931 = (int) local27[1] * -1;
		@Pc(213) float[] local213 = new float[3];
		Static3.anInt2519 = (int) local27[0] - Static5.anInt3983 * 128;
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
				if (Static9.method279(local7, local13, true, local18, Static1.aClass4_Sub19ArrayArrayArray1)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)Lclient!jf;")
	public static Class77 method1500() {
		try {
			return new Class77_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class77) Class.forName("Class77_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class77_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V")
	public static void method1501(@OriginalArg(0) int arg0) {
		Static3.aClass26_25.method511();
		Static3.aClass26_25 = new Class26(arg0);
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
				@Pc(85) Class185 local85 = Static23.method2425(Static1.anInt1053, Static2.anInt1367);
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
				if (local138 == 2 && Static37.method4669(Static7.anInt5334, local117, local124, local112)) {
					@Pc(163) Class181 local163 = Static8.method99(local131);
					if (local163.anIntArray631 != null) {
						local163 = local163.method4453();
					}
					if (local163 == null) {
						continue;
					}
					if (Static2.anInt1334 == 1) {
						method1497(local112, local117, local124, Static7.aString365 + " -> <col=00ffff>" + local163.aString332, LocalisedText.USE, (short) 16, Static2.anInt1937);
					} else if (Static3.aBoolean177) {
						@Pc(215) Class4_Sub3_Sub12 local215 = Static5.anInt4224 == -1 ? null : Static19.method1815(Static5.anInt4224);
						if ((Static5.anInt3560 & 0x4) != 0 && (local215 == null || local163.method4451(local215.anInt2546, Static5.anInt4224) != local215.anInt2546)) {
							method1497(local112, local117, local124, Static2.aString81 + " -> <col=00ffff>" + local163.aString332, Static4.aString140, (short) 4, Static6.anInt4466);
						}
					} else {
						@Pc(267) String[] local267 = local163.aStringArray39;
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
									method1497(local112, local117, local124, "<col=00ffff>" + local163.aString332, local267[local278], local294, local327);
								}
							}
						}
						method1497((long) local163.anInt5553, local117, local124, "<col=00ffff>" + local163.aString332, LocalisedText.EXAMINE, (short) 1007, Static3.anInt2232);
					}
				}
				if (local138 == 1) {
					@Pc(394) Class53_Sub1_Sub2 local394 = Static3.aClass53_Sub1_Sub2Array1[local131];
					if ((local394.aClass168_1.anInt5262 & 0x1) == 0 && (local394.anInt3974 & 0x7F) == 0 && (local394.anInt4002 & 0x7F) == 0 || (local394.aClass168_1.anInt5262 & 0x1) == 1 && (local394.anInt3974 & 0x7F) == 64 && (local394.anInt4002 & 0x7F) == 64) {
						@Pc(450) int local450 = local394.anInt3974 - (local394.aClass168_1.anInt5262 - 1) * 64;
						@Pc(462) int local462 = local394.anInt4002 + 64 - local394.aClass168_1.anInt5262 * 64;
						for (@Pc(464) int local464 = 0; local464 < Static6.anInt4451; local464++) {
							@Pc(477) Class53_Sub1_Sub2 local477 = Static3.aClass53_Sub1_Sub2Array1[Static7.anIntArray595[local464]];
							if (local477 != null && !local477.aBoolean281 && local477 != local394 && local477.aBoolean282) {
								@Pc(501) int local501 = local477.anInt3974 - (local477.aClass168_1.anInt5262 - 1) * 64;
								@Pc(512) int local512 = local477.anInt4002 - (local477.aClass168_1.anInt5262 - 1) * 64;
								if (local501 >= local450 && local477.aClass168_1.anInt5262 <= local394.aClass168_1.anInt5262 - (local501 - local450 >> 7) && local512 >= local462 && local394.aClass168_1.anInt5262 - (local512 - local462 >> 7) >= local477.aClass168_1.anInt5262) {
									Static33.method4152(local477.aClass168_1, local124, Static7.anIntArray595[local464], local117);
									local477.aBoolean281 = true;
								}
							}
						}
						for (@Pc(568) int local568 = 0; local568 < Static3.anInt2510; local568++) {
							@Pc(577) Class53_Sub1_Sub1 local577 = Static5.aClass53_Sub1_Sub1Array1[Static4.anIntArray317[local568]];
							if (local577 != null && !local577.aBoolean281 && local577.aBoolean282) {
								@Pc(597) int local597 = local577.anInt3974 - (local577.method3311() - 1) * 64;
								@Pc(609) int local609 = local577.anInt4002 - (local577.method3311() - 1) * 64;
								if (local597 >= local450 && local577.method3311() <= local394.aClass168_1.anInt5262 - (local597 - local450 >> 7) && local462 <= local609 && local577.method3311() <= local394.aClass168_1.anInt5262 - (local609 - local462 >> 7)) {
									Static29.method3488(local124, Static4.anIntArray317[local568], local577, local117);
									local577.aBoolean281 = true;
								}
							}
						}
					}
					if (local394.aBoolean281) {
						continue;
					}
					Static33.method4152(local394.aClass168_1, local124, local131, local117);
					local394.aBoolean281 = true;
				}
				if (local138 == 0) {
					@Pc(682) Class53_Sub1_Sub1 local682 = Static5.aClass53_Sub1_Sub1Array1[local131];
					if ((local682.anInt3974 & 0x7F) == 64 && (local682.anInt4002 & 0x7F) == 64) {
						@Pc(709) int local709 = local682.anInt3974 - (local682.method3311() - 1) * 64;
						@Pc(721) int local721 = local682.anInt4002 - (local682.method3311() - 1) * 64;
						for (@Pc(723) int local723 = 0; local723 < Static6.anInt4451; local723++) {
							@Pc(736) Class53_Sub1_Sub2 local736 = Static3.aClass53_Sub1_Sub2Array1[Static7.anIntArray595[local723]];
							if (local736 != null && !local736.aBoolean281 && local736.aBoolean282) {
								@Pc(756) int local756 = local736.anInt3974 - (local736.aClass168_1.anInt5262 - 1) * 64;
								@Pc(768) int local768 = local736.anInt4002 - (local736.aClass168_1.anInt5262 - 1) * 64;
								if (local709 <= local756 && local736.aClass168_1.anInt5262 <= local682.method3311() - (local756 - local709 >> 7) && local721 <= local768 && local736.aClass168_1.anInt5262 <= local682.method3311() - (local768 - local721 >> 7)) {
									Static33.method4152(local736.aClass168_1, local124, Static7.anIntArray595[local723], local117);
									local736.aBoolean281 = true;
								}
							}
						}
						for (@Pc(827) int local827 = 0; local827 < Static3.anInt2510; local827++) {
							@Pc(840) Class53_Sub1_Sub1 local840 = Static5.aClass53_Sub1_Sub1Array1[Static4.anIntArray317[local827]];
							if (local840 != null && !local840.aBoolean281 && local840 != local682 && local840.aBoolean282) {
								@Pc(865) int local865 = local840.anInt3974 - (local840.method3311() - 1) * 64;
								@Pc(877) int local877 = local840.anInt4002 + 64 - local840.method3311() * 64;
								if (local865 >= local709 && local840.method3311() <= local682.method3311() - (local865 - local709 >> 7) && local721 <= local877 && local840.method3311() <= local682.method3311() - (local877 - local721 >> 7)) {
									Static29.method3488(local124, Static4.anIntArray317[local827], local840, local117);
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
					@Pc(952) Class112 local952 = Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local117][local124];
					if (local952 != null) {
						for (@Pc(960) Class4_Sub3_Sub21 local960 = (Class4_Sub3_Sub21) local952.method2613(); local960 != null; local960 = (Class4_Sub3_Sub21) local952.method2615()) {
							@Pc(967) int local967 = local960.aClass53_Sub2_1.anInt2168;
							@Pc(971) Class162 local971 = Static35.method4361(local967);
							if (Static2.anInt1334 == 1) {
								method1497((long) local967, local117, local124, Static7.aString365 + " -> <col=ff9040>" + local971.aString308, LocalisedText.USE, (short) 28, Static2.anInt1937);
							} else if (Static3.aBoolean177) {
								@Pc(986) Class4_Sub3_Sub12 local986 = Static5.anInt4224 == -1 ? null : Static19.method1815(Static5.anInt4224);
								if ((Static5.anInt3560 & 0x1) != 0 && (local986 == null || local971.method4133(Static5.anInt4224, local986.anInt2546) != local986.anInt2546)) {
									method1497((long) local967, local117, local124, Static2.aString81 + " -> <col=ff9040>" + local971.aString308, Static4.aString140, (short) 48, Static6.anInt4466);
								}
							} else {
								@Pc(1043) String[] local1043 = local971.aStringArray33;
								if (Static5.aBoolean254) {
									local1043 = Static35.method4300(local1043);
								}
								for (@Pc(1052) int local1052 = 4; local1052 >= 0; local1052--) {
									if (local1043 != null && local1043[local1052] != null) {
										@Pc(1067) int local1067 = -1;
										if (local971.anInt5087 == local1052) {
											local1067 = local971.anInt5072;
										}
										if (local971.anInt5046 == local1052) {
											local1067 = local971.anInt5061;
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
										method1497((long) local967, local117, local124, "<col=ff9040>" + local971.aString308, local1043[local1052], local1096, local1067);
									}
								}
								method1497((long) local967, local117, local124, "<col=ff9040>" + local971.aString308, LocalisedText.EXAMINE, (short) 1004, Static3.anInt2232);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!fh;Lclient!ai;Lclient!fh;)V")
	public static void method1521(@OriginalArg(1) Class58 arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) Class58 arg2) {
		Static1.aClass58_19 = arg2;
		Static4.aClass58_72 = arg0;
		Static5.anInterface1_1 = arg1;
		if (Static1.aClass58_19 != null) {
			Static2.anInt912 = Static1.aClass58_19.method1371(1);
		}
		if (Static4.aClass58_72 != null) {
			Static7.anInt6046 = Static4.aClass58_72.method1371(1);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!fh;BII)[Lclient!fe;")
	public static Class56_Sub1[] method1523(@OriginalArg(0) Class58 arg0, @OriginalArg(3) int arg1) {
		return Static9.method197(arg0, arg1, 0) ? Static26.method4358() : null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ra;B)V")
	public static void method4654(@OriginalArg(0) Class4_Sub25 arg0) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		@Pc(9) long local9 = 0L;
		if (arg0.anInt4437 == 0) {
			local9 = Static25.method2726(arg0.anInt4438, arg0.anInt4445, arg0.anInt4441);
		}
		if (arg0.anInt4437 == 1) {
			local9 = Static37.method4739(arg0.anInt4438, arg0.anInt4445, arg0.anInt4441);
		}
		@Pc(45) int local45 = 0;
		if (arg0.anInt4437 == 2) {
			local9 = Static20.method1960(arg0.anInt4438, arg0.anInt4445, arg0.anInt4441);
		}
		if (arg0.anInt4437 == 3) {
			local9 = Static22.method2414(arg0.anInt4438, arg0.anInt4445, arg0.anInt4441);
		}
		if (local9 != 0L) {
			local7 = (int) local9 >> 14 & 0x1F;
			local45 = (int) local9 >> 20 & 0x3;
			local5 = Integer.MAX_VALUE & (int) (local9 >>> 32);
		}
		arg0.anInt4444 = local45;
		arg0.anInt4443 = local7;
		arg0.anInt4439 = local5;
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

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!jl;)V")
	public static void method1551(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub3_Sub13 arg1) {
		Static2.anInt5739 = 0;
		@Pc(5) int local5 = 0;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray234;
		@Pc(23) int[] local23 = arg1.anIntArray233;
		@Pc(25) byte local25 = -1;
		try {
			@Pc(27) int local27 = 0;
			label4473:
			while (true) {
				local27++;
				if (local27 > arg0) {
					throw new RuntimeException("slow");
				}
				local11++;
				@Pc(45) int local45 = local16[local11];
				if (local45 < 100) {
					if (local45 == 0) {
						Static7.anIntArray571[local5++] = local23[local11];
						continue;
					}
					if (local45 == 1) {
						@Pc(70) int local70 = local23[local11];
						Static7.anIntArray571[local5++] = Static1.anIntArray2[local70];
						continue;
					}
					if (local45 == 2) {
						@Pc(89) int local89 = local23[local11];
						local5--;
						Static29.method3543(local89, Static7.anIntArray571[local5]);
						continue;
					}
					if (local45 == 3) {
						Static2.aStringArray5[local13++] = arg1.aStringArray19[local11];
						continue;
					}
					if (local45 == 6) {
						local11 += local23[local11];
						continue;
					}
					if (local45 == 7) {
						local5 -= 2;
						if (Static7.anIntArray571[local5] != Static7.anIntArray571[local5 + 1]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 8) {
						local5 -= 2;
						if (Static7.anIntArray571[local5] == Static7.anIntArray571[local5 + 1]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 9) {
						local5 -= 2;
						if (Static7.anIntArray571[local5] < Static7.anIntArray571[local5 + 1]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 10) {
						local5 -= 2;
						if (Static7.anIntArray571[local5 + 1] < Static7.anIntArray571[local5]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 21) {
						if (Static2.anInt5739 == 0) {
							return;
						}
						@Pc(242) Class174 local242 = Static7.aClass174Array1[--Static2.anInt5739];
						Static4.aStringArray21 = local242.aStringArray36;
						arg1 = local242.aClass4_Sub3_Sub13_1;
						local11 = local242.anInt5353;
						local23 = arg1.anIntArray233;
						Static4.anIntArray272 = local242.anIntArray613;
						local16 = arg1.anIntArray234;
						continue;
					}
					if (local45 == 25) {
						@Pc(270) int local270 = local23[local11];
						Static7.anIntArray571[local5++] = Static35.method4311(local270);
						continue;
					}
					if (local45 == 27) {
						@Pc(287) int local287 = local23[local11];
						local5--;
						Static23.method1937(local287, Static7.anIntArray571[local5]);
						continue;
					}
					if (local45 == 31) {
						local5 -= 2;
						if (Static7.anIntArray571[local5] <= Static7.anIntArray571[local5 + 1]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 32) {
						local5 -= 2;
						if (Static7.anIntArray571[local5 + 1] <= Static7.anIntArray571[local5]) {
							local11 += local23[local11];
						}
						continue;
					}
					if (local45 == 33) {
						Static7.anIntArray571[local5++] = Static4.anIntArray272[local23[local11]];
						continue;
					}
					if (local45 == 34) {
						@Pc(367) int local367 = local23[local11];
						local5--;
						Static4.anIntArray272[local367] = Static7.anIntArray571[local5];
						continue;
					}
					if (local45 == 35) {
						Static2.aStringArray5[local13++] = Static4.aStringArray21[local23[local11]];
						continue;
					}
					if (local45 == 36) {
						@Pc(399) int local399 = local23[local11];
						local13--;
						Static4.aStringArray21[local399] = Static2.aStringArray5[local13];
						continue;
					}
					if (local45 == 37) {
						@Pc(413) int local413 = local23[local11];
						@Pc(417) int local417 = local13 - local413;
						@Pc(423) String local423 = Static37.method4715(Static2.aStringArray5, local417, local413);
						local13 = local417 + 1;
						Static2.aStringArray5[local417] = local423;
						continue;
					}
					if (local45 == 38) {
						local5--;
						continue;
					}
					if (local45 == 39) {
						local13--;
						continue;
					}
					if (local45 == 40) {
						@Pc(457) int local457 = local23[local11];
						@Pc(461) Class4_Sub3_Sub13 local461 = Static12.method718(local457);
						@Pc(465) int[] local465 = new int[local461.anInt2662];
						@Pc(469) String[] local469 = new String[local461.anInt2660];
						for (@Pc(471) int local471 = 0; local471 < local461.anInt2658; local471++) {
							local465[local471] = Static7.anIntArray571[local471 + local5 - local461.anInt2658];
						}
						for (@Pc(496) int local496 = 0; local496 < local461.anInt2657; local496++) {
							local469[local496] = Static2.aStringArray5[local13 + local496 - local461.anInt2657];
						}
						local5 -= local461.anInt2658;
						local13 -= local461.anInt2657;
						@Pc(534) Class174 local534 = new Class174();
						local534.anIntArray613 = Static4.anIntArray272;
						local534.aStringArray36 = Static4.aStringArray21;
						local534.anInt5353 = local11;
						local534.aClass4_Sub3_Sub13_1 = arg1;
						if (Static2.anInt5739 >= Static7.aClass174Array1.length) {
							throw new RuntimeException();
						}
						Static7.aClass174Array1[Static2.anInt5739++] = local534;
						Static4.aStringArray21 = local469;
						arg1 = local461;
						local11 = -1;
						local16 = local461.anIntArray234;
						Static4.anIntArray272 = local465;
						local23 = local461.anIntArray233;
						continue;
					}
					if (local45 == 42) {
						Static7.anIntArray571[local5++] = Static6.anIntArray462[local23[local11]];
						continue;
					}
					if (local45 == 43) {
						@Pc(605) int local605 = local23[local11];
						local5--;
						Static6.anIntArray462[local605] = Static7.anIntArray571[local5];
						Static29.method3396(local605);
						continue;
					}
					if (local45 == 44) {
						@Pc(627) int local627 = local23[local11] & 0xFFFF;
						@Pc(633) int local633 = local23[local11] >> 16;
						local5--;
						@Pc(638) int local638 = Static7.anIntArray571[local5];
						if (local638 >= 0 && local638 <= 5000) {
							@Pc(651) byte local651 = -1;
							if (local627 == 105) {
								local651 = 0;
							}
							Static7.anIntArray617[local633] = local638;
							@Pc(664) int local664 = 0;
							while (true) {
								if (local664 >= local638) {
									continue label4473;
								}
								Static3.anIntArrayArray17[local633][local664] = local651;
								local664++;
							}
						}
						throw new RuntimeException();
					}
					if (local45 == 45) {
						@Pc(690) int local690 = local23[local11];
						@Pc(692) int local692 = local5 - 1;
						@Pc(695) int local695 = Static7.anIntArray571[local692];
						if (local695 >= 0 && local695 < Static7.anIntArray617[local690]) {
							local5 = local692 + 1;
							Static7.anIntArray571[local692] = Static3.anIntArrayArray17[local690][local695];
							continue;
						}
						throw new RuntimeException();
					}
					if (local45 == 46) {
						@Pc(730) int local730 = local23[local11];
						local5 -= 2;
						@Pc(735) int local735 = Static7.anIntArray571[local5];
						if (local735 >= 0 && local735 < Static7.anIntArray617[local730]) {
							Static3.anIntArrayArray17[local730][local735] = Static7.anIntArray571[local5 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local45 == 47) {
						@Pc(771) String local771 = Static1.aStringArray3[local23[local11]];
						if (local771 == null) {
							local771 = "null";
						}
						Static2.aStringArray5[local13++] = local771;
						continue;
					}
					if (local45 == 48) {
						@Pc(790) int local790 = local23[local11];
						local13--;
						Static1.aStringArray3[local790] = Static2.aStringArray5[local13];
						Static23.method4822(local790);
						continue;
					}
					if (local45 == 51) {
						@Pc(814) Class84 local814 = arg1.aClass84Array1[local23[local11]];
						local5--;
						@Pc(826) Class4_Sub32 local826 = (Class4_Sub32) local814.method1844((long) Static7.anIntArray571[local5]);
						if (local826 != null) {
							local11 += local826.anInt5434;
						}
						continue;
					}
				}
				@Pc(846) boolean local846;
				if (local23[local11] == 1) {
					local846 = true;
				} else {
					local846 = false;
				}
				if (local45 < 300) {
					if (local45 == 100) {
						local5 -= 3;
						@Pc(14769) int local14769 = Static7.anIntArray571[local5 + 2];
						@Pc(14773) int local14773 = Static7.anIntArray571[local5];
						@Pc(14779) int local14779 = Static7.anIntArray571[local5 + 1];
						if (local14779 != 0) {
							@Pc(14790) Class185 local14790 = Static19.method1813(local14773);
							if (local14790.aClass185Array4 == null) {
								local14790.aClass185Array4 = new Class185[local14769 + 1];
							}
							if (local14769 >= local14790.aClass185Array4.length) {
								@Pc(14815) Class185[] local14815 = new Class185[local14769 + 1];
								for (@Pc(14817) int local14817 = 0; local14817 < local14790.aClass185Array4.length; local14817++) {
									local14815[local14817] = local14790.aClass185Array4[local14817];
								}
								local14790.aClass185Array4 = local14815;
							}
							if (local14769 > 0 && local14790.aClass185Array4[local14769 - 1] == null) {
								throw new RuntimeException("Gap at:" + (local14769 - 1));
							}
							@Pc(14865) Class185 local14865 = new Class185();
							local14865.anInt5937 = local14865.anInt5914 = local14790.anInt5914;
							local14865.aBoolean416 = true;
							local14865.anInt5968 = local14769;
							local14865.anInt5911 = local14779;
							local14790.aClass185Array4[local14769] = local14865;
							if (local846) {
								Static3.aClass185_8 = local14865;
							} else {
								Static4.aClass185_9 = local14865;
							}
							Static28.method3270(local14790);
							continue;
						}
						throw new RuntimeException();
					}
					if (local45 == 101) {
						@Pc(14911) Class185 local14911 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						if (local14911.anInt5968 == -1) {
							if (!local846) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						@Pc(14935) Class185 local14935 = Static19.method1813(local14911.anInt5914);
						local14935.aClass185Array4[local14911.anInt5968] = null;
						Static28.method3270(local14935);
						continue;
					}
					if (local45 == 102) {
						local5--;
						@Pc(14959) Class185 local14959 = Static19.method1813(Static7.anIntArray571[local5]);
						local14959.aClass185Array4 = null;
						Static28.method3270(local14959);
						continue;
					}
					if (local45 == 200) {
						@Pc(14972) int local14972 = local5 - 2;
						@Pc(14976) int local14976 = Static7.anIntArray571[local14972];
						@Pc(14982) int local14982 = Static7.anIntArray571[local14972 + 1];
						@Pc(14987) Class185 local14987 = Static23.method2425(local14976, local14982);
						if (local14987 != null && local14982 != -1) {
							local5 = local14972 + 1;
							Static7.anIntArray571[local14972] = 1;
							if (local846) {
								Static3.aClass185_8 = local14987;
							} else {
								Static4.aClass185_9 = local14987;
							}
							continue;
						}
						local5 = local14972 + 1;
						Static7.anIntArray571[local14972] = 0;
						continue;
					}
					if (local45 == 201) {
						@Pc(15022) int local15022 = local5 - 1;
						@Pc(15025) int local15025 = Static7.anIntArray571[local15022];
						@Pc(15031) Class185 local15031 = Static19.method1813(local15025);
						if (local15031 == null) {
							local5 = local15022 + 1;
							Static7.anIntArray571[local15022] = 0;
						} else {
							local5 = local15022 + 1;
							Static7.anIntArray571[local15022] = 1;
							if (local846) {
								Static3.aClass185_8 = local15031;
							} else {
								Static4.aClass185_9 = local15031;
							}
						}
						continue;
					}
				} else if (local45 < 500) {
					if (local45 == 403) {
						local5 -= 2;
						@Pc(14650) int local14650 = Static7.anIntArray571[local5];
						@Pc(14656) int local14656 = Static7.anIntArray571[local5 + 1];
						for (@Pc(14658) int local14658 = 0; local14658 < Static6.anIntArray550.length; local14658++) {
							if (local14650 == Static6.anIntArray550[local14658]) {
								Static4.aClass53_Sub1_Sub1_2.aClass144_2.method3604(local14658, local14656);
								continue label4473;
							}
						}
						@Pc(14684) int local14684 = 0;
						while (true) {
							if (Static6.anIntArray487.length <= local14684) {
								continue label4473;
							}
							if (Static6.anIntArray487[local14684] == local14650) {
								Static4.aClass53_Sub1_Sub1_2.aClass144_2.method3604(local14684, local14656);
								continue label4473;
							}
							local14684++;
						}
					}
					if (local45 == 404) {
						local5 -= 2;
						@Pc(14722) int local14722 = Static7.anIntArray571[local5];
						@Pc(14728) int local14728 = Static7.anIntArray571[local5 + 1];
						Static4.aClass53_Sub1_Sub1_2.aClass144_2.method3613(local14722, local14728);
						continue;
					}
					if (local45 == 410) {
						local5--;
						@Pc(14748) boolean local14748 = Static7.anIntArray571[local5] != 0;
						Static4.aClass53_Sub1_Sub1_2.aClass144_2.method3605(local14748);
						continue;
					}
				} else if (local45 >= 1000 && local45 < 1100 || local45 >= 2000 && local45 < 2100) {
					@Pc(885) Class185 local885;
					if (local45 < 2000) {
						local885 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
					} else {
						local5--;
						local885 = Static19.method1813(Static7.anIntArray571[local5]);
						local45 -= 1000;
					}
					if (local45 == 1000) {
						local5 -= 4;
						local885.anInt5928 = Static7.anIntArray571[local5];
						local885.anInt5951 = Static7.anIntArray571[local5 + 1];
						@Pc(919) int local919 = Static7.anIntArray571[local5 + 2];
						if (local919 < 0) {
							local919 = 0;
						} else if (local919 > 5) {
							local919 = 5;
						}
						@Pc(936) int local936 = Static7.anIntArray571[local5 + 3];
						local885.aByte26 = (byte) local919;
						if (local936 < 0) {
							local936 = 0;
						} else if (local936 > 5) {
							local936 = 5;
						}
						local885.aByte25 = (byte) local936;
						Static28.method3270(local885);
						Static33.method4118(local885);
						if (local885.anInt5968 == -1) {
							Static36.method4405(local885.anInt5914);
						}
						continue;
					}
					if (local45 == 1001) {
						local5 -= 4;
						local885.anInt5927 = Static7.anIntArray571[local5];
						local885.anInt5950 = Static7.anIntArray571[local5 + 1];
						local885.anInt5957 = 0;
						local885.anInt5920 = 0;
						@Pc(1002) int local1002 = Static7.anIntArray571[local5 + 3];
						if (local1002 < 0) {
							local1002 = 0;
						} else if (local1002 > 4) {
							local1002 = 4;
						}
						@Pc(1021) int local1021 = Static7.anIntArray571[local5 + 2];
						if (local1021 < 0) {
							local1021 = 0;
						} else if (local1021 > 4) {
							local1021 = 4;
						}
						local885.aByte27 = (byte) local1002;
						local885.aByte24 = (byte) local1021;
						Static28.method3270(local885);
						Static33.method4118(local885);
						if (local885.anInt5911 == 0) {
							Static34.method4251(false, local885);
						}
						continue;
					}
					if (local45 == 1003) {
						local5--;
						@Pc(1075) boolean local1075 = Static7.anIntArray571[local5] == 1;
						if (local1075 != local885.aBoolean417) {
							local885.aBoolean417 = local1075;
							Static28.method3270(local885);
						}
						if (local885.anInt5968 == -1) {
							Static32.method4026(local885.anInt5914);
						}
						continue;
					}
					if (local45 == 1004) {
						local5 -= 2;
						local885.anInt5908 = Static7.anIntArray571[local5];
						local885.anInt5970 = Static7.anIntArray571[local5 + 1];
						Static28.method3270(local885);
						Static33.method4118(local885);
						if (local885.anInt5911 == 0) {
							Static34.method4251(false, local885);
						}
						continue;
					}
					if (local45 == 1005) {
						local5--;
						local885.aBoolean407 = Static7.anIntArray571[local5] == 1;
						continue;
					}
				} else if (local45 >= 1100 && local45 < 1200 || local45 >= 2100 && local45 < 2200) {
					@Pc(1190) Class185 local1190;
					if (local45 >= 2000) {
						local5--;
						local1190 = Static19.method1813(Static7.anIntArray571[local5]);
						local45 -= 1000;
					} else {
						local1190 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
					}
					if (local45 == 1100) {
						local5 -= 2;
						local1190.anInt5932 = Static7.anIntArray571[local5];
						if (local1190.anInt5885 - local1190.anInt5893 < local1190.anInt5932) {
							local1190.anInt5932 = local1190.anInt5885 - local1190.anInt5893;
						}
						if (local1190.anInt5932 < 0) {
							local1190.anInt5932 = 0;
						}
						local1190.anInt5931 = Static7.anIntArray571[local5 + 1];
						if (local1190.anInt5931 > local1190.anInt5887 - local1190.anInt5949) {
							local1190.anInt5931 = local1190.anInt5887 - local1190.anInt5949;
						}
						if (local1190.anInt5931 < 0) {
							local1190.anInt5931 = 0;
						}
						Static28.method3270(local1190);
						if (local1190.anInt5968 == -1) {
							Static8.method111(local1190.anInt5914);
						}
						continue;
					}
					if (local45 == 1101) {
						local5--;
						local1190.anInt5933 = Static7.anIntArray571[local5];
						Static28.method3270(local1190);
						if (local1190.anInt5968 == -1) {
							Static33.method4092(local1190.anInt5914);
						}
						continue;
					}
					if (local45 == 1102) {
						local5--;
						local1190.aBoolean413 = Static7.anIntArray571[local5] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1103) {
						local5--;
						local1190.anInt5903 = Static7.anIntArray571[local5];
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1104) {
						local5--;
						local1190.anInt5899 = Static7.anIntArray571[local5];
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1105) {
						local5--;
						local1190.anInt5947 = Static7.anIntArray571[local5];
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1106) {
						local5--;
						local1190.anInt5958 = Static7.anIntArray571[local5];
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1107) {
						local5--;
						local1190.aBoolean410 = Static7.anIntArray571[local5] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1108) {
						local1190.anInt5939 = 1;
						local5--;
						local1190.anInt5895 = Static7.anIntArray571[local5];
						Static28.method3270(local1190);
						if (local1190.anInt5968 == -1) {
							Static12.method779(local1190.anInt5914);
						}
						continue;
					}
					if (local45 == 1109) {
						local5 -= 6;
						local1190.anInt5963 = Static7.anIntArray571[local5];
						local1190.anInt5906 = Static7.anIntArray571[local5 + 1];
						local1190.anInt5944 = Static7.anIntArray571[local5 + 2];
						local1190.anInt5976 = Static7.anIntArray571[local5 + 3];
						local1190.anInt5886 = Static7.anIntArray571[local5 + 4];
						local1190.anInt5918 = Static7.anIntArray571[local5 + 5];
						Static28.method3270(local1190);
						if (local1190.anInt5968 == -1) {
							Static21.method1994(local1190.anInt5914);
							Static15.method1224(local1190.anInt5914);
						}
						continue;
					}
					if (local45 == 1110) {
						local5--;
						@Pc(1529) int local1529 = Static7.anIntArray571[local5];
						if (local1529 != local1190.anInt5891) {
							local1190.anInt5897 = 0;
							local1190.anInt5891 = local1529;
							local1190.anInt5979 = 1;
							local1190.anInt5892 = 0;
							Static28.method3270(local1190);
						}
						if (local1190.anInt5968 == -1) {
							Static35.method680(local1190.anInt5914);
						}
						continue;
					}
					if (local45 == 1111) {
						local5--;
						local1190.aBoolean418 = Static7.anIntArray571[local5] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1112) {
						local13--;
						@Pc(1590) String local1590 = Static2.aStringArray5[local13];
						if (!local1590.equals(local1190.aString351)) {
							local1190.aString351 = local1590;
							Static28.method3270(local1190);
						}
						if (local1190.anInt5968 == -1) {
							Static37.method4678(local1190.anInt5914);
						}
						continue;
					}
					if (local45 == 1113) {
						local5--;
						local1190.anInt5954 = Static7.anIntArray571[local5];
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1114) {
						local5 -= 3;
						local1190.anInt5924 = Static7.anIntArray571[local5];
						local1190.anInt5922 = Static7.anIntArray571[local5 + 1];
						local1190.anInt5948 = Static7.anIntArray571[local5 + 2];
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1115) {
						local5--;
						local1190.aBoolean415 = Static7.anIntArray571[local5] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1116) {
						local5--;
						local1190.anInt5975 = Static7.anIntArray571[local5];
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1117) {
						local5--;
						local1190.anInt5934 = Static7.anIntArray571[local5];
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1118) {
						local5--;
						local1190.aBoolean404 = Static7.anIntArray571[local5] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1119) {
						local5--;
						local1190.aBoolean406 = Static7.anIntArray571[local5] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1120) {
						local5 -= 2;
						local1190.anInt5885 = Static7.anIntArray571[local5];
						local1190.anInt5887 = Static7.anIntArray571[local5 + 1];
						Static28.method3270(local1190);
						if (local1190.anInt5911 == 0) {
							Static34.method4251(false, local1190);
						}
						continue;
					}
					if (local45 == 1121) {
						local5 -= 2;
						local1190.aShort50 = (short) Static7.anIntArray571[local5];
						local1190.aShort49 = (short) Static7.anIntArray571[local5 + 1];
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1122) {
						local5--;
						local1190.aBoolean412 = Static7.anIntArray571[local5] == 1;
						Static28.method3270(local1190);
						continue;
					}
					if (local45 == 1123) {
						local5--;
						local1190.anInt5918 = Static7.anIntArray571[local5];
						Static28.method3270(local1190);
						if (local1190.anInt5968 == -1) {
							Static21.method1994(local1190.anInt5914);
						}
						continue;
					}
					if (local45 == 1124) {
						local5--;
						@Pc(1875) int local1875 = Static7.anIntArray571[local5];
						local1190.aBoolean409 = local1875 == 1;
						Static28.method3270(local1190);
						continue;
					}
				} else if (local45 >= 1200 && local45 < 1300 || local45 >= 2200 && local45 < 2300) {
					@Pc(1917) Class185 local1917;
					if (local45 < 2000) {
						local1917 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
					} else {
						local45 -= 1000;
						local5--;
						local1917 = Static19.method1813(Static7.anIntArray571[local5]);
					}
					Static28.method3270(local1917);
					if (local45 == 1200 || local45 == 1205 || local45 == 1208 || local45 == 1209) {
						local5 -= 2;
						@Pc(1955) int local1955 = Static7.anIntArray571[local5 + 1];
						@Pc(1959) int local1959 = Static7.anIntArray571[local5];
						if (local1917.anInt5968 == -1) {
							Static35.method676(local1917.anInt5914);
							Static21.method1994(local1917.anInt5914);
							Static15.method1224(local1917.anInt5914);
						}
						if (local1959 == -1) {
							local1917.anInt5939 = 1;
							local1917.anInt5895 = -1;
							local1917.anInt5938 = -1;
							continue;
						}
						local1917.anInt5962 = local1955;
						if (local45 == 1208 || local45 == 1209) {
							local1917.aBoolean419 = true;
						} else {
							local1917.aBoolean419 = false;
						}
						local1917.anInt5938 = local1959;
						@Pc(2020) Class162 local2020 = Static35.method4361(local1959);
						local1917.anInt5906 = local2020.anInt5098;
						local1917.anInt5963 = local2020.anInt5065;
						local1917.anInt5944 = local2020.anInt5080;
						local1917.anInt5976 = local2020.anInt5095;
						local1917.anInt5918 = local2020.anInt5057;
						local1917.anInt5886 = local2020.anInt5062;
						if (local45 == 1205) {
							local1917.aBoolean405 = false;
						} else {
							local1917.aBoolean405 = true;
						}
						if (local1917.anInt5957 > 0) {
							local1917.anInt5918 = local1917.anInt5918 * 32 / local1917.anInt5957;
						} else if (local1917.anInt5927 > 0) {
							local1917.anInt5918 = local1917.anInt5918 * 32 / local1917.anInt5927;
						}
						continue;
					}
					if (local45 == 1201) {
						local1917.anInt5939 = 2;
						local5--;
						local1917.anInt5895 = Static7.anIntArray571[local5];
						if (local1917.anInt5968 == -1) {
							Static12.method779(local1917.anInt5914);
						}
						continue;
					}
					if (local45 == 1202) {
						local1917.anInt5939 = 3;
						local1917.anInt5895 = Static4.aClass53_Sub1_Sub1_2.aClass144_2.method3611();
						if (local1917.anInt5968 == -1) {
							Static12.method779(local1917.anInt5914);
						}
						continue;
					}
					if (local45 == 1203) {
						local1917.anInt5939 = 6;
						local5--;
						local1917.anInt5895 = Static7.anIntArray571[local5];
						if (local1917.anInt5968 == -1) {
							Static12.method779(local1917.anInt5914);
						}
						continue;
					}
					if (local45 == 1204) {
						local1917.anInt5939 = 5;
						local5--;
						local1917.anInt5895 = Static7.anIntArray571[local5];
						if (local1917.anInt5968 == -1) {
							Static12.method779(local1917.anInt5914);
						}
						continue;
					}
					if (local45 == 1206) {
						local5 -= 4;
						local1917.anInt5972 = Static7.anIntArray571[local5];
						local1917.anInt5916 = Static7.anIntArray571[local5 + 1];
						local1917.anInt5977 = Static7.anIntArray571[local5 + 2];
						local1917.anInt5898 = Static7.anIntArray571[local5 + 3];
						Static28.method3270(local1917);
						continue;
					}
					if (local45 == 1207) {
						local5 -= 2;
						local1917.anInt5965 = Static7.anIntArray571[local5];
						local1917.anInt5917 = Static7.anIntArray571[local5 + 1];
						Static28.method3270(local1917);
						continue;
					}
				} else if (local45 >= 1300 && local45 < 1400 || local45 >= 2300 && local45 < 2400) {
					@Pc(2274) Class185 local2274;
					if (local45 < 2000) {
						local2274 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
					} else {
						local45 -= 1000;
						local5--;
						local2274 = Static19.method1813(Static7.anIntArray571[local5]);
					}
					if (local45 == 1300) {
						local5--;
						@Pc(2295) int local2295 = Static7.anIntArray571[local5] - 1;
						if (local2295 >= 0 && local2295 <= 9) {
							local13--;
							local2274.method4722(Static2.aStringArray5[local13], local2295);
							continue;
						}
						local13--;
						continue;
					}
					if (local45 == 1301) {
						local5 -= 2;
						@Pc(2323) int local2323 = Static7.anIntArray571[local5 + 1];
						@Pc(2327) int local2327 = Static7.anIntArray571[local5];
						local2274.aClass185_17 = Static23.method2425(local2327, local2323);
						continue;
					}
					if (local45 == 1302) {
						local5--;
						local2274.aBoolean402 = Static7.anIntArray571[local5] == 1;
						continue;
					}
					if (local45 == 1303) {
						local5--;
						local2274.anInt5896 = Static7.anIntArray571[local5];
						continue;
					}
					if (local45 == 1304) {
						local5--;
						local2274.anInt5953 = Static7.anIntArray571[local5];
						continue;
					}
					if (local45 == 1305) {
						local13--;
						local2274.aString352 = Static2.aStringArray5[local13];
						continue;
					}
					if (local45 == 1306) {
						local13--;
						local2274.aString355 = Static2.aStringArray5[local13];
						continue;
					}
					if (local45 == 1307) {
						local2274.aStringArray43 = null;
						continue;
					}
					if (local45 == 1308) {
						@Pc(2421) int local2421 = local5 - 1;
						local2274.anInt5890 = Static7.anIntArray571[local2421];
						local5 = local2421 - 1;
						local2274.anInt5930 = Static7.anIntArray571[local5];
						continue;
					}
					if (local45 == 1309) {
						@Pc(2439) int local2439 = local5 - 1;
						@Pc(2442) int local2442 = Static7.anIntArray571[local2439];
						local5 = local2439 - 1;
						@Pc(2447) int local2447 = Static7.anIntArray571[local5];
						if (local2447 >= 1 && local2447 <= 10) {
							local2274.method4725(local2447 - 1, local2442);
						}
						continue;
					}
					if (local45 == 1310) {
						local13--;
						local2274.aString354 = Static2.aStringArray5[local13];
						continue;
					}
				} else {
					if (local45 >= 1400 && local45 < 1500 || local45 >= 2400 && local45 < 2500) {
						@Pc(2505) Class185 local2505;
						if (local45 < 2000) {
							local2505 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						} else {
							local5--;
							local2505 = Static19.method1813(Static7.anIntArray571[local5]);
							local45 -= 1000;
						}
						local13--;
						@Pc(2522) String local2522 = Static2.aStringArray5[local13];
						@Pc(2524) int[] local2524 = null;
						if (local2522.length() > 0 && local2522.charAt(local2522.length() - 1) == 'Y') {
							local5--;
							@Pc(2544) int local2544 = Static7.anIntArray571[local5];
							if (local2544 > 0) {
								local2524 = new int[local2544];
								while (local2544-- > 0) {
									local5--;
									local2524[local2544] = Static7.anIntArray571[local5];
								}
							}
							local2522 = local2522.substring(0, local2522.length() - 1);
						}
						@Pc(2581) Object[] local2581 = new Object[local2522.length() + 1];
						for (@Pc(2586) int local2586 = local2581.length - 1; local2586 >= 1; local2586--) {
							if (local2522.charAt(local2586 - 1) == 's') {
								local13--;
								local2581[local2586] = Static2.aStringArray5[local13];
							} else {
								local5--;
								local2581[local2586] = Integer.valueOf(Static7.anIntArray571[local5]);
							}
						}
						local5--;
						@Pc(2627) int local2627 = Static7.anIntArray571[local5];
						if (local2627 == -1) {
							local2581 = null;
						} else {
							local2581[0] = Integer.valueOf(local2627);
						}
						local2505.aBoolean403 = true;
						if (local45 == 1400) {
							local2505.anObjectArray29 = local2581;
						} else if (local45 == 1401) {
							local2505.anObjectArray8 = local2581;
						} else if (local45 == 1402) {
							local2505.anObjectArray30 = local2581;
						} else if (local45 == 1403) {
							local2505.anObjectArray26 = local2581;
						} else if (local45 == 1404) {
							local2505.anObjectArray28 = local2581;
						} else if (local45 == 1405) {
							local2505.anObjectArray11 = local2581;
						} else if (local45 == 1406) {
							local2505.anObjectArray17 = local2581;
						} else if (local45 == 1407) {
							local2505.anObjectArray24 = local2581;
							local2505.anIntArray669 = local2524;
						} else if (local45 == 1408) {
							local2505.anObjectArray16 = local2581;
						} else if (local45 == 1409) {
							local2505.anObjectArray18 = local2581;
						} else if (local45 == 1410) {
							local2505.anObjectArray7 = local2581;
						} else if (local45 == 1411) {
							local2505.anObjectArray15 = local2581;
						} else if (local45 == 1412) {
							local2505.anObjectArray9 = local2581;
						} else if (local45 == 1414) {
							local2505.anIntArray670 = local2524;
							local2505.anObjectArray3 = local2581;
						} else if (local45 == 1415) {
							local2505.anObjectArray25 = local2581;
							local2505.anIntArray667 = local2524;
						} else if (local45 == 1416) {
							local2505.anObjectArray13 = local2581;
						} else if (local45 == 1417) {
							local2505.anObjectArray20 = local2581;
						} else if (local45 == 1418) {
							local2505.anObjectArray6 = local2581;
						} else if (local45 == 1419) {
							local2505.anObjectArray10 = local2581;
						} else if (local45 == 1420) {
							local2505.anObjectArray12 = local2581;
						} else if (local45 == 1421) {
							local2505.anObjectArray23 = local2581;
						} else if (local45 == 1422) {
							local2505.anObjectArray31 = local2581;
						} else if (local45 == 1423) {
							local2505.anObjectArray19 = local2581;
						} else if (local45 == 1424) {
							local2505.anObjectArray4 = local2581;
						} else if (local45 == 1425) {
							local2505.anObjectArray14 = local2581;
						} else if (local45 == 1426) {
							local2505.anObjectArray5 = local2581;
						} else if (local45 == 1427) {
							local2505.anObjectArray32 = local2581;
						} else if (local45 == 1428) {
							local2505.anObjectArray27 = local2581;
							local2505.anIntArray673 = local2524;
						} else if (local45 == 1429) {
							local2505.anObjectArray21 = local2581;
							local2505.anIntArray665 = local2524;
						}
						continue;
					}
					if (local45 < 1600) {
						@Pc(14557) Class185 local14557 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						if (local45 == 1500) {
							Static7.anIntArray571[local5++] = local14557.anInt5960;
							continue;
						}
						if (local45 == 1501) {
							Static7.anIntArray571[local5++] = local14557.anInt5888;
							continue;
						}
						if (local45 == 1502) {
							Static7.anIntArray571[local5++] = local14557.anInt5893;
							continue;
						}
						if (local45 == 1503) {
							Static7.anIntArray571[local5++] = local14557.anInt5949;
							continue;
						}
						if (local45 == 1504) {
							Static7.anIntArray571[local5++] = local14557.aBoolean417 ? 1 : 0;
							continue;
						}
						if (local45 == 1505) {
							Static7.anIntArray571[local5++] = local14557.anInt5937;
							continue;
						}
					} else if (local45 < 1700) {
						@Pc(2934) Class185 local2934 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						if (local45 == 1600) {
							Static7.anIntArray571[local5++] = local2934.anInt5932;
							continue;
						}
						if (local45 == 1601) {
							Static7.anIntArray571[local5++] = local2934.anInt5931;
							continue;
						}
						if (local45 == 1602) {
							Static2.aStringArray5[local13++] = local2934.aString351;
							continue;
						}
						if (local45 == 1603) {
							Static7.anIntArray571[local5++] = local2934.anInt5885;
							continue;
						}
						if (local45 == 1604) {
							Static7.anIntArray571[local5++] = local2934.anInt5887;
							continue;
						}
						if (local45 == 1605) {
							Static7.anIntArray571[local5++] = local2934.anInt5918;
							continue;
						}
						if (local45 == 1606) {
							Static7.anIntArray571[local5++] = local2934.anInt5944;
							continue;
						}
						if (local45 == 1607) {
							Static7.anIntArray571[local5++] = local2934.anInt5886;
							continue;
						}
						if (local45 == 1608) {
							Static7.anIntArray571[local5++] = local2934.anInt5976;
							continue;
						}
						if (local45 == 1609) {
							Static7.anIntArray571[local5++] = local2934.anInt5903;
							continue;
						}
						if (local45 == 1610) {
							Static7.anIntArray571[local5++] = local2934.anInt5963;
							continue;
						}
						if (local45 == 1611) {
							Static7.anIntArray571[local5++] = local2934.anInt5906;
							continue;
						}
						if (local45 == 1612) {
							Static7.anIntArray571[local5++] = local2934.anInt5947;
							continue;
						}
					} else if (local45 < 1800) {
						@Pc(3109) Class185 local3109 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						if (local45 == 1700) {
							Static7.anIntArray571[local5++] = local3109.anInt5938;
							continue;
						}
						if (local45 == 1701) {
							if (local3109.anInt5938 == -1) {
								Static7.anIntArray571[local5++] = 0;
							} else {
								Static7.anIntArray571[local5++] = local3109.anInt5962;
							}
							continue;
						}
						if (local45 == 1702) {
							Static7.anIntArray571[local5++] = local3109.anInt5968;
							continue;
						}
					} else if (local45 < 1900) {
						@Pc(3170) Class185 local3170 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
						if (local45 == 1800) {
							Static7.anIntArray571[local5++] = Static12.method687(local3170).method3273();
							continue;
						}
						if (local45 == 1801) {
							local5--;
							@Pc(3193) int local3193 = Static7.anIntArray571[local5];
							local3193--;
							if (local3170.aStringArray43 != null && local3170.aStringArray43.length > local3193 && local3170.aStringArray43[local3193] != null) {
								Static2.aStringArray5[local13++] = local3170.aStringArray43[local3193];
								continue;
							}
							Static2.aStringArray5[local13++] = "";
							continue;
						}
						if (local45 == 1802) {
							if (local3170.aString352 == null) {
								Static2.aStringArray5[local13++] = "";
							} else {
								Static2.aStringArray5[local13++] = local3170.aString352;
							}
							continue;
						}
					} else if (local45 < 2600) {
						@Pc(14466) int local14466 = local5 - 1;
						@Pc(14470) Class185 local14470 = Static19.method1813(Static7.anIntArray571[local14466]);
						if (local45 == 2500) {
							local5 = local14466 + 1;
							Static7.anIntArray571[local14466] = local14470.anInt5960;
							continue;
						}
						if (local45 == 2501) {
							local5 = local14466 + 1;
							Static7.anIntArray571[local14466] = local14470.anInt5888;
							continue;
						}
						if (local45 == 2502) {
							local5 = local14466 + 1;
							Static7.anIntArray571[local14466] = local14470.anInt5893;
							continue;
						}
						if (local45 == 2503) {
							local5 = local14466 + 1;
							Static7.anIntArray571[local14466] = local14470.anInt5949;
							continue;
						}
						if (local45 == 2504) {
							local5 = local14466 + 1;
							Static7.anIntArray571[local14466] = local14470.aBoolean417 ? 1 : 0;
							continue;
						}
						if (local45 == 2505) {
							local5 = local14466 + 1;
							Static7.anIntArray571[local14466] = local14470.anInt5937;
							continue;
						}
					} else if (local45 < 2700) {
						local5--;
						@Pc(14299) Class185 local14299 = Static19.method1813(Static7.anIntArray571[local5]);
						if (local45 == 2600) {
							Static7.anIntArray571[local5++] = local14299.anInt5932;
							continue;
						}
						if (local45 == 2601) {
							Static7.anIntArray571[local5++] = local14299.anInt5931;
							continue;
						}
						if (local45 == 2602) {
							Static2.aStringArray5[local13++] = local14299.aString351;
							continue;
						}
						if (local45 == 2603) {
							Static7.anIntArray571[local5++] = local14299.anInt5885;
							continue;
						}
						if (local45 == 2604) {
							Static7.anIntArray571[local5++] = local14299.anInt5887;
							continue;
						}
						if (local45 == 2605) {
							Static7.anIntArray571[local5++] = local14299.anInt5918;
							continue;
						}
						if (local45 == 2606) {
							Static7.anIntArray571[local5++] = local14299.anInt5944;
							continue;
						}
						if (local45 == 2607) {
							Static7.anIntArray571[local5++] = local14299.anInt5886;
							continue;
						}
						if (local45 == 2608) {
							Static7.anIntArray571[local5++] = local14299.anInt5976;
							continue;
						}
						if (local45 == 2609) {
							Static7.anIntArray571[local5++] = local14299.anInt5903;
							continue;
						}
						if (local45 == 2610) {
							Static7.anIntArray571[local5++] = local14299.anInt5963;
							continue;
						}
						if (local45 == 2611) {
							Static7.anIntArray571[local5++] = local14299.anInt5906;
							continue;
						}
						if (local45 == 2612) {
							Static7.anIntArray571[local5++] = local14299.anInt5947;
							continue;
						}
					} else if (local45 < 2800) {
						if (local45 == 2700) {
							@Pc(14115) int local14115 = local5 - 1;
							@Pc(14119) Class185 local14119 = Static19.method1813(Static7.anIntArray571[local14115]);
							local5 = local14115 + 1;
							Static7.anIntArray571[local14115] = local14119.anInt5938;
							continue;
						}
						if (local45 == 2701) {
							@Pc(14134) int local14134 = local5 - 1;
							@Pc(14138) Class185 local14138 = Static19.method1813(Static7.anIntArray571[local14134]);
							if (local14138.anInt5938 == -1) {
								local5 = local14134 + 1;
								Static7.anIntArray571[local14134] = 0;
							} else {
								local5 = local14134 + 1;
								Static7.anIntArray571[local14134] = local14138.anInt5962;
							}
							continue;
						}
						if (local45 == 2702) {
							@Pc(14166) int local14166 = local5 - 1;
							@Pc(14169) int local14169 = Static7.anIntArray571[local14166];
							@Pc(14176) Class4_Sub27 local14176 = (Class4_Sub27) Static4.aClass84_13.method1844((long) local14169);
							if (local14176 == null) {
								local5 = local14166 + 1;
								Static7.anIntArray571[local14166] = 0;
							} else {
								local5 = local14166 + 1;
								Static7.anIntArray571[local14166] = 1;
							}
							continue;
						}
						if (local45 == 2703) {
							@Pc(14202) int local14202 = local5 - 1;
							@Pc(14206) Class185 local14206 = Static19.method1813(Static7.anIntArray571[local14202]);
							if (local14206.aClass185Array4 == null) {
								local5 = local14202 + 1;
								Static7.anIntArray571[local14202] = 0;
								continue;
							}
							@Pc(14221) int local14221 = local14206.aClass185Array4.length;
							for (@Pc(14223) int local14223 = 0; local14223 < local14206.aClass185Array4.length; local14223++) {
								if (local14206.aClass185Array4[local14223] == null) {
									local14221 = local14223;
									break;
								}
							}
							local5 = local14202 + 1;
							Static7.anIntArray571[local14202] = local14221;
							continue;
						}
						if (local45 == 2704 || local45 == 2705) {
							@Pc(14255) int local14255 = local5 - 2;
							@Pc(14259) int local14259 = Static7.anIntArray571[local14255];
							@Pc(14265) int local14265 = Static7.anIntArray571[local14255 + 1];
							@Pc(14272) Class4_Sub27 local14272 = (Class4_Sub27) Static4.aClass84_13.method1844((long) local14259);
							if (local14272 != null && local14272.anInt4620 == local14265) {
								local5 = local14255 + 1;
								Static7.anIntArray571[local14255] = 1;
								continue;
							}
							local5 = local14255 + 1;
							Static7.anIntArray571[local14255] = 0;
							continue;
						}
					} else if (local45 < 2900) {
						local5--;
						@Pc(3273) Class185 local3273 = Static19.method1813(Static7.anIntArray571[local5]);
						if (local45 == 2800) {
							Static7.anIntArray571[local5++] = Static12.method687(local3273).method3273();
							continue;
						}
						if (local45 == 2801) {
							local5--;
							@Pc(3297) int local3297 = Static7.anIntArray571[local5];
							local3297--;
							if (local3273.aStringArray43 != null && local3297 < local3273.aStringArray43.length && local3273.aStringArray43[local3297] != null) {
								Static2.aStringArray5[local13++] = local3273.aStringArray43[local3297];
								continue;
							}
							Static2.aStringArray5[local13++] = "";
							continue;
						}
						if (local45 == 2802) {
							if (local3273.aString352 == null) {
								Static2.aStringArray5[local13++] = "";
							} else {
								Static2.aStringArray5[local13++] = local3273.aString352;
							}
							continue;
						}
					} else if (local45 < 3200) {
						if (local45 == 3100) {
							local13--;
							@Pc(13872) String local13872 = Static2.aStringArray5[local13];
							Static26.method4357("", 0, local13872);
							continue;
						}
						if (local45 == 3101) {
							local5 -= 2;
							Static38.method4793(Static4.aClass53_Sub1_Sub1_2, Static7.anIntArray571[local5], Static7.anIntArray571[local5 + 1]);
							continue;
						}
						if (local45 == 3103) {
							Static21.method2063();
							continue;
						}
						if (local45 == 3104) {
							local13--;
							@Pc(13921) String local13921 = Static2.aStringArray5[local13];
							@Pc(13923) int local13923 = 0;
							if (Static29.method3473(local13921)) {
								local13923 = Static12.method737(local13921);
							}
							Static3.aClass4_Sub10_Sub1_1.writeOpcode(219);
							Static3.aClass4_Sub10_Sub1_1.writeInt(local13923);
							continue;
						}
						if (local45 == 3105) {
							local13--;
							@Pc(13955) String local13955 = Static2.aStringArray5[local13];
							Static3.aClass4_Sub10_Sub1_1.writeOpcode(149);
							Static3.aClass4_Sub10_Sub1_1.writeLong(Static18.method1746(local13955));
							continue;
						}
						if (local45 == 3106) {
							local13--;
							@Pc(13986) String local13986 = Static2.aStringArray5[local13];
							Static3.aClass4_Sub10_Sub1_1.writeOpcode(164);
							Static3.aClass4_Sub10_Sub1_1.writeByte(local13986.length() + 1);
							Static3.aClass4_Sub10_Sub1_1.writeString(local13986);
							continue;
						}
						if (local45 == 3107) {
							local5--;
							@Pc(14014) int local14014 = Static7.anIntArray571[local5];
							local13--;
							@Pc(14019) String local14019 = Static2.aStringArray5[local13];
							Static8.method7(local14014, local14019);
							continue;
						}
						if (local45 == 3108) {
							local5 -= 3;
							@Pc(14033) int local14033 = Static7.anIntArray571[local5];
							@Pc(14039) int local14039 = Static7.anIntArray571[local5 + 2];
							@Pc(14045) int local14045 = Static7.anIntArray571[local5 + 1];
							@Pc(14049) Class185 local14049 = Static19.method1813(local14039);
							Static15.method1401(local14049, local14033, local14045);
							continue;
						}
						if (local45 == 3109) {
							local5 -= 2;
							@Pc(14069) int local14069 = Static7.anIntArray571[local5 + 1];
							@Pc(14073) int local14073 = Static7.anIntArray571[local5];
							@Pc(14079) Class185 local14079 = local846 ? Static3.aClass185_8 : Static4.aClass185_9;
							Static15.method1401(local14079, local14073, local14069);
							continue;
						}
						if (local45 == 3110) {
							local5--;
							@Pc(14098) int local14098 = Static7.anIntArray571[local5];
							Static3.aClass4_Sub10_Sub1_1.writeOpcode(231);
							Static3.aClass4_Sub10_Sub1_1.writeShort(local14098);
							continue;
						}
					} else if (local45 < 3300) {
						if (local45 == 3200) {
							local5 -= 3;
							Static15.method1227(Static7.anIntArray571[local5 + 2], Static7.anIntArray571[local5], Static7.anIntArray571[local5 + 1], 255);
							continue;
						}
						if (local45 == 3201) {
							local5--;
							Static36.method4444(255, Static7.anIntArray571[local5]);
							continue;
						}
						if (local45 == 3202) {
							local5 -= 2;
							Static23.method1933(255, Static7.anIntArray571[local5 + 1], Static7.anIntArray571[local5]);
							continue;
						}
					} else if (local45 < 3400) {
						if (local45 == 3300) {
							Static7.anIntArray571[local5++] = Static2.anInt954;
							continue;
						}
						if (local45 == 3301) {
							@Pc(13111) int local13111 = local5 - 2;
							@Pc(13117) int local13117 = Static7.anIntArray571[local13111 + 1];
							@Pc(13121) int local13121 = Static7.anIntArray571[local13111];
							local5 = local13111 + 1;
							Static7.anIntArray571[local13111] = Static8.method70(local13121, local13117);
							continue;
						}
						if (local45 == 3302) {
							@Pc(13138) int local13138 = local5 - 2;
							@Pc(13142) int local13142 = Static7.anIntArray571[local13138];
							@Pc(13148) int local13148 = Static7.anIntArray571[local13138 + 1];
							local5 = local13138 + 1;
							Static7.anIntArray571[local13138] = Static21.method3285(local13148, local13142);
							continue;
						}
						if (local45 == 3303) {
							@Pc(13164) int local13164 = local5 - 2;
							@Pc(13168) int local13168 = Static7.anIntArray571[local13164];
							@Pc(13174) int local13174 = Static7.anIntArray571[local13164 + 1];
							local5 = local13164 + 1;
							Static7.anIntArray571[local13164] = Static15.method1226(local13174, local13168);
							continue;
						}
						if (local45 == 3304) {
							@Pc(13191) int local13191 = local5 - 1;
							@Pc(13194) int local13194 = Static7.anIntArray571[local13191];
							local5 = local13191 + 1;
							Static7.anIntArray571[local13191] = Static9.method264(local13194).anInt1963;
							continue;
						}
						if (local45 == 3305) {
							@Pc(13209) int local13209 = local5 - 1;
							@Pc(13212) int local13212 = Static7.anIntArray571[local13209];
							local5 = local13209 + 1;
							Static7.anIntArray571[local13209] = Static7.anIntArray501[local13212];
							continue;
						}
						if (local45 == 3306) {
							@Pc(13227) int local13227 = local5 - 1;
							@Pc(13230) int local13230 = Static7.anIntArray571[local13227];
							local5 = local13227 + 1;
							Static7.anIntArray571[local13227] = Static7.anIntArray599[local13230];
							continue;
						}
						if (local45 == 3307) {
							@Pc(13245) int local13245 = local5 - 1;
							@Pc(13248) int local13248 = Static7.anIntArray571[local13245];
							local5 = local13245 + 1;
							Static7.anIntArray571[local13245] = Static7.anIntArray637[local13248];
							continue;
						}
						if (local45 == 3308) {
							@Pc(13263) int local13263 = Static7.anInt5334;
							@Pc(13270) int local13270 = Static5.anInt3983 + (Static4.aClass53_Sub1_Sub1_2.anInt3974 >> 7);
							@Pc(13277) int local13277 = Static7.anInt5479 + (Static4.aClass53_Sub1_Sub1_2.anInt4002 >> 7);
							Static7.anIntArray571[local5++] = (local13270 << 14) + (local13263 << 28) + local13277;
							continue;
						}
						if (local45 == 3309) {
							@Pc(13299) int local13299 = local5 - 1;
							@Pc(13302) int local13302 = Static7.anIntArray571[local13299];
							local5 = local13299 + 1;
							Static7.anIntArray571[local13299] = local13302 >> 14 & 0x3FFF;
							continue;
						}
						if (local45 == 3310) {
							@Pc(13321) int local13321 = local5 - 1;
							@Pc(13324) int local13324 = Static7.anIntArray571[local13321];
							local5 = local13321 + 1;
							Static7.anIntArray571[local13321] = local13324 >> 28;
							continue;
						}
						if (local45 == 3311) {
							@Pc(13339) int local13339 = local5 - 1;
							@Pc(13342) int local13342 = Static7.anIntArray571[local13339];
							local5 = local13339 + 1;
							Static7.anIntArray571[local13339] = local13342 & 0x3FFF;
							continue;
						}
						if (local45 == 3312) {
							Static7.anIntArray571[local5++] = Static7.aBoolean370 ? 1 : 0;
							continue;
						}
						if (local45 == 3313) {
							@Pc(13371) int local13371 = local5 - 2;
							@Pc(13377) int local13377 = Static7.anIntArray571[local13371 + 1];
							@Pc(13383) int local13383 = Static7.anIntArray571[local13371] + 32768;
							local5 = local13371 + 1;
							Static7.anIntArray571[local13371] = Static8.method70(local13383, local13377);
							continue;
						}
						if (local45 == 3314) {
							@Pc(13398) int local13398 = local5 - 2;
							@Pc(13404) int local13404 = Static7.anIntArray571[local13398 + 1];
							@Pc(13410) int local13410 = Static7.anIntArray571[local13398] + 32768;
							local5 = local13398 + 1;
							Static7.anIntArray571[local13398] = Static21.method3285(local13404, local13410);
							continue;
						}
						if (local45 == 3315) {
							@Pc(13424) int local13424 = local5 - 2;
							@Pc(13430) int local13430 = Static7.anIntArray571[local13424] + 32768;
							@Pc(13436) int local13436 = Static7.anIntArray571[local13424 + 1];
							local5 = local13424 + 1;
							Static7.anIntArray571[local13424] = Static15.method1226(local13436, local13430);
							continue;
						}
						if (local45 == 3316) {
							if (Static3.anInt2576 >= 2) {
								Static7.anIntArray571[local5++] = Static3.anInt2576;
							} else {
								Static7.anIntArray571[local5++] = 0;
							}
							continue;
						}
						if (local45 == 3317) {
							Static7.anIntArray571[local5++] = Static5.anInt4329;
							continue;
						}
						if (local45 == 3318) {
							Static7.anIntArray571[local5++] = client.worldId;
							continue;
						}
						if (local45 == 3321) {
							Static7.anIntArray571[local5++] = Static2.anInt2248;
							continue;
						}
						if (local45 == 3322) {
							Static7.anIntArray571[local5++] = Static3.anInt2048;
							continue;
						}
						if (local45 == 3323) {
							if (Static2.anInt1877 >= 5 && Static2.anInt1877 <= 9) {
								Static7.anIntArray571[local5++] = 1;
								continue;
							}
							Static7.anIntArray571[local5++] = 0;
							continue;
						}
						if (local45 == 3324) {
							if (Static2.anInt1877 >= 5 && Static2.anInt1877 <= 9) {
								Static7.anIntArray571[local5++] = Static2.anInt1877;
								continue;
							}
							Static7.anIntArray571[local5++] = 0;
							continue;
						}
						if (local45 == 3325) {
							Static7.anIntArray571[local5++] = Static7.aBoolean399 ? 1 : 0;
							continue;
						}
						if (local45 == 3326) {
							Static7.anIntArray571[local5++] = Static4.aClass53_Sub1_Sub1_2.anInt1597;
							continue;
						}
						if (local45 == 3327) {
							Static7.anIntArray571[local5++] = Static4.aClass53_Sub1_Sub1_2.aClass144_2.aBoolean306 ? 1 : 0;
							continue;
						}
						if (local45 == 3328) {
							Static7.anIntArray571[local5++] = Static1.aBoolean47 && !Static5.aBoolean287 ? 1 : 0;
							continue;
						}
						if (local45 == 3329) {
							Static7.anIntArray571[local5++] = Static2.aBoolean67 ? 1 : 0;
							continue;
						}
						if (local45 == 3330) {
							@Pc(13650) int local13650 = local5 - 1;
							@Pc(13653) int local13653 = Static7.anIntArray571[local13650];
							local5 = local13650 + 1;
							Static7.anIntArray571[local13650] = Static33.method4088(local13653);
							continue;
						}
						if (local45 == 3331) {
							@Pc(13668) int local13668 = local5 - 2;
							@Pc(13674) int local13674 = Static7.anIntArray571[local13668 + 1];
							@Pc(13678) int local13678 = Static7.anIntArray571[local13668];
							local5 = local13668 + 1;
							Static7.anIntArray571[local13668] = Static28.method3248(local13674, local13678, false);
							continue;
						}
						if (local45 == 3332) {
							@Pc(13694) int local13694 = local5 - 2;
							@Pc(13700) int local13700 = Static7.anIntArray571[local13694 + 1];
							@Pc(13704) int local13704 = Static7.anIntArray571[local13694];
							local5 = local13694 + 1;
							Static7.anIntArray571[local13694] = Static28.method3248(local13700, local13704, true);
							continue;
						}
						if (local45 == 3333) {
							Static7.anIntArray571[local5++] = Static1.anInt1047;
							continue;
						}
						if (local45 == 3335) {
							Static7.anIntArray571[local5++] = client.language;
							continue;
						}
						if (local45 == 3336) {
							@Pc(13748) int local13748 = local5 - 4;
							@Pc(13752) int local13752 = Static7.anIntArray571[local13748];
							@Pc(13758) int local13758 = Static7.anIntArray571[local13748 + 1];
							@Pc(13764) int local13764 = Static7.anIntArray571[local13748 + 2];
							local13752 += local13758 << 14;
							local13752 += local13764 << 28;
							@Pc(13782) int local13782 = Static7.anIntArray571[local13748 + 3];
							local13752 += local13782;
							local5 = local13748 + 1;
							Static7.anIntArray571[local13748] = local13752;
							continue;
						}
						if (local45 == 3337) {
							Static7.anIntArray571[local5++] = client.affiliate;
							continue;
						}
					} else if (local45 < 3500) {
						if (local45 == 3400) {
							local5 -= 2;
							@Pc(3379) int local3379 = Static7.anIntArray571[local5];
							@Pc(3385) int local3385 = Static7.anIntArray571[local5 + 1];
							@Pc(3389) Class4_Sub3_Sub3 local3389 = Static21.method2056(local3379);
							if (local3389.aChar1 == 's') {
							}
							Static2.aStringArray5[local13++] = local3389.method606(local3385);
							continue;
						}
						if (local45 == 3408) {
							local5 -= 4;
							@Pc(3414) int local3414 = Static7.anIntArray571[local5 + 1];
							@Pc(3418) int local3418 = Static7.anIntArray571[local5];
							@Pc(3424) int local3424 = Static7.anIntArray571[local5 + 2];
							@Pc(3430) int local3430 = Static7.anIntArray571[local5 + 3];
							@Pc(3434) Class4_Sub3_Sub3 local3434 = Static21.method2056(local3424);
							if (local3418 == local3434.aChar2 && local3414 == local3434.aChar1) {
								if (local3414 == 115) {
									Static2.aStringArray5[local13++] = local3434.method606(local3430);
								} else {
									Static7.anIntArray571[local5++] = local3434.method601(local3430);
								}
								continue;
							}
							throw new RuntimeException("C3408-1");
						}
						if (local45 == 3409) {
							@Pc(3481) int local3481 = local5 - 3;
							@Pc(3485) int local3485 = Static7.anIntArray571[local3481];
							@Pc(3491) int local3491 = Static7.anIntArray571[local3481 + 1];
							@Pc(3497) int local3497 = Static7.anIntArray571[local3481 + 2];
							if (local3491 == -1) {
								throw new RuntimeException("C3409-2");
							}
							@Pc(3510) Class4_Sub3_Sub3 local3510 = Static21.method2056(local3491);
							if (local3510.aChar1 != local3485) {
								throw new RuntimeException("C3409-1");
							}
							local5 = local3481 + 1;
							Static7.anIntArray571[local3481] = local3510.method604(local3497) ? 1 : 0;
							continue;
						}
						if (local45 == 3410) {
							local13--;
							@Pc(3545) String local3545 = Static2.aStringArray5[local13];
							@Pc(3547) int local3547 = local5 - 1;
							@Pc(3550) int local3550 = Static7.anIntArray571[local3547];
							if (local3550 == -1) {
								throw new RuntimeException("C3410-2");
							}
							@Pc(3564) Class4_Sub3_Sub3 local3564 = Static21.method2056(local3550);
							if (local3564.aChar1 != 's') {
								throw new RuntimeException("C3410-1");
							}
							local5 = local3547 + 1;
							Static7.anIntArray571[local3547] = local3564.method611(local3545) ? 1 : 0;
							continue;
						}
						if (local45 == 3411) {
							@Pc(3597) int local3597 = local5 - 1;
							@Pc(3600) int local3600 = Static7.anIntArray571[local3597];
							@Pc(3604) Class4_Sub3_Sub3 local3604 = Static21.method2056(local3600);
							local5 = local3597 + 1;
							Static7.anIntArray571[local3597] = local3604.aClass84_3.method1841();
							continue;
						}
					} else if (local45 < 3700) {
						if (local45 == 3600) {
							if (Static7.anInt5497 == 0) {
								Static7.anIntArray571[local5++] = -2;
							} else if (Static7.anInt5497 == 1) {
								Static7.anIntArray571[local5++] = -1;
							} else {
								Static7.anIntArray571[local5++] = Static6.anInt5214;
							}
							continue;
						}
						if (local45 == 3601) {
							local5--;
							@Pc(12342) int local12342 = Static7.anIntArray571[local5];
							if (Static7.anInt5497 == 2 && local12342 < Static6.anInt5214) {
								Static2.aStringArray5[local13++] = Static4.aStringArray23[local12342];
								continue;
							}
							Static2.aStringArray5[local13++] = "";
							continue;
						}
						if (local45 == 3602) {
							@Pc(12374) int local12374 = local5 - 1;
							@Pc(12377) int local12377 = Static7.anIntArray571[local12374];
							if (Static7.anInt5497 == 2 && local12377 < Static6.anInt5214) {
								local5 = local12374 + 1;
								Static7.anIntArray571[local12374] = Static4.anIntArray293[local12377];
								continue;
							}
							local5 = local12374 + 1;
							Static7.anIntArray571[local12374] = 0;
							continue;
						}
						if (local45 == 3603) {
							@Pc(12404) int local12404 = local5 - 1;
							@Pc(12407) int local12407 = Static7.anIntArray571[local12404];
							if (Static7.anInt5497 == 2 && local12407 < Static6.anInt5214) {
								local5 = local12404 + 1;
								Static7.anIntArray571[local12404] = Static6.anIntArray517[local12407];
								continue;
							}
							local5 = local12404 + 1;
							Static7.anIntArray571[local12404] = 0;
							continue;
						}
						if (local45 == 3604) {
							local13--;
							@Pc(12441) String local12441 = Static2.aStringArray5[local13];
							local5--;
							@Pc(12446) int local12446 = Static7.anIntArray571[local5];
							Static21.method2060(local12446, local12441);
							continue;
						}
						if (local45 == 3605) {
							local13--;
							@Pc(12462) String local12462 = Static2.aStringArray5[local13];
							Static15.method1229(Static18.method1746(local12462));
							continue;
						}
						if (local45 == 3606) {
							local13--;
							@Pc(12478) String local12478 = Static2.aStringArray5[local13];
							Static10.method308(Static18.method1746(local12478));
							continue;
						}
						if (local45 == 3607) {
							local13--;
							@Pc(12499) String local12499 = Static2.aStringArray5[local13];
							Static32.method3923(false, Static18.method1746(local12499));
							continue;
						}
						if (local45 == 3608) {
							local13--;
							@Pc(12520) String local12520 = Static2.aStringArray5[local13];
							Static22.method2192(Static18.method1746(local12520));
							continue;
						}
						if (local45 == 3609) {
							local13--;
							@Pc(12536) String local12536 = Static2.aStringArray5[local13];
							if (local12536.startsWith("<img=0>") || local12536.startsWith("<img=1>")) {
								local12536 = local12536.substring(7);
							}
							Static7.anIntArray571[local5++] = Static24.method2562(local12536) ? 1 : 0;
							continue;
						}
						if (local45 == 3610) {
							local5--;
							@Pc(12571) int local12571 = Static7.anIntArray571[local5];
							if (Static7.anInt5497 == 2 && local12571 < Static6.anInt5214) {
								Static2.aStringArray5[local13++] = Static4.aStringArray22[local12571];
								continue;
							}
							Static2.aStringArray5[local13++] = "";
							continue;
						}
						if (local45 == 3611) {
							if (Static2.aString108 == null) {
								Static2.aStringArray5[local13++] = "";
							} else {
								Static2.aStringArray5[local13++] = Static29.method3464(Static2.aString108);
							}
							continue;
						}
						if (local45 == 3612) {
							if (Static2.aString108 == null) {
								Static7.anIntArray571[local5++] = 0;
							} else {
								Static7.anIntArray571[local5++] = Static4.anInt3260;
							}
							continue;
						}
						if (local45 == 3613) {
							local5--;
							@Pc(12645) int local12645 = Static7.anIntArray571[local5];
							if (Static2.aString108 != null && local12645 < Static4.anInt3260) {
								Static2.aStringArray5[local13++] = Static29.method3464(Static6.aClass4_Sub15Array1[local12645].aString182);
								continue;
							}
							Static2.aStringArray5[local13++] = "";
							continue;
						}
						if (local45 == 3614) {
							@Pc(12678) int local12678 = local5 - 1;
							@Pc(12681) int local12681 = Static7.anIntArray571[local12678];
							if (Static2.aString108 != null && Static4.anInt3260 > local12681) {
								local5 = local12678 + 1;
								Static7.anIntArray571[local12678] = Static6.aClass4_Sub15Array1[local12681].anInt2988;
								continue;
							}
							local5 = local12678 + 1;
							Static7.anIntArray571[local12678] = 0;
							continue;
						}
						if (local45 == 3615) {
							@Pc(12716) int local12716 = local5 - 1;
							@Pc(12719) int local12719 = Static7.anIntArray571[local12716];
							if (Static2.aString108 != null && Static4.anInt3260 > local12719) {
								local5 = local12716 + 1;
								Static7.anIntArray571[local12716] = Static6.aClass4_Sub15Array1[local12719].aByte5;
								continue;
							}
							local5 = local12716 + 1;
							Static7.anIntArray571[local12716] = 0;
							continue;
						}
						if (local45 == 3616) {
							Static7.anIntArray571[local5++] = Static4.aByte6;
							continue;
						}
						if (local45 == 3617) {
							local13--;
							@Pc(12761) String local12761 = Static2.aStringArray5[local13];
							Static34.method4236(local12761);
							continue;
						}
						if (local45 == 3618) {
							Static7.anIntArray571[local5++] = Static5.aByte13;
							continue;
						}
						if (local45 == 3619) {
							local13--;
							@Pc(12786) String local12786 = Static2.aStringArray5[local13];
							Static29.method3475(Static18.method1746(local12786));
							continue;
						}
						if (local45 == 3620) {
							Static12.method685();
							continue;
						}
						if (local45 == 3621) {
							if (Static7.anInt5497 == 0) {
								Static7.anIntArray571[local5++] = -1;
							} else {
								Static7.anIntArray571[local5++] = Static6.anInt4516;
							}
							continue;
						}
						if (local45 == 3622) {
							local5--;
							@Pc(12831) int local12831 = Static7.anIntArray571[local5];
							if (Static7.anInt5497 != 0 && Static6.anInt4516 > local12831) {
								Static2.aStringArray5[local13++] = Static29.method3477(Static3.aLongArray16[local12831]);
								continue;
							}
							Static2.aStringArray5[local13++] = "";
							continue;
						}
						if (local45 == 3623) {
							local13--;
							@Pc(12863) String local12863 = Static2.aStringArray5[local13];
							if (local12863.startsWith("<img=0>") || local12863.startsWith("<img=1>")) {
								local12863 = local12863.substring(7);
							}
							Static7.anIntArray571[local5++] = Static14.method1077(local12863) ? 1 : 0;
							continue;
						}
						if (local45 == 3624) {
							@Pc(12894) int local12894 = local5 - 1;
							@Pc(12897) int local12897 = Static7.anIntArray571[local12894];
							if (Static6.aClass4_Sub15Array1 != null && local12897 < Static4.anInt3260 && Static6.aClass4_Sub15Array1[local12897].aString182.equalsIgnoreCase(Static4.aClass53_Sub1_Sub1_2.aString88)) {
								local5 = local12894 + 1;
								Static7.anIntArray571[local12894] = 1;
								continue;
							}
							local5 = local12894 + 1;
							Static7.anIntArray571[local12894] = 0;
							continue;
						}
						if (local45 == 3625) {
							if (Static6.aString268 == null) {
								Static2.aStringArray5[local13++] = "";
							} else {
								Static2.aStringArray5[local13++] = Static29.method3464(Static6.aString268);
							}
							continue;
						}
						if (local45 == 3626) {
							local5--;
							@Pc(12954) int local12954 = Static7.anIntArray571[local5];
							if (Static2.aString108 != null && Static4.anInt3260 > local12954) {
								Static2.aStringArray5[local13++] = Static6.aClass4_Sub15Array1[local12954].aString181;
								continue;
							}
							Static2.aStringArray5[local13++] = "";
							continue;
						}
						if (local45 == 3627) {
							@Pc(12981) int local12981 = local5 - 1;
							@Pc(12984) int local12984 = Static7.anIntArray571[local12981];
							if (Static7.anInt5497 == 2 && local12984 >= 0 && Static6.anInt5214 > local12984) {
								local5 = local12981 + 1;
								Static7.anIntArray571[local12981] = Static2.aBooleanArray7[local12984] ? 1 : 0;
								continue;
							}
							local5 = local12981 + 1;
							Static7.anIntArray571[local12981] = 0;
							continue;
						}
						if (local45 == 3628) {
							local13--;
							@Pc(13020) String local13020 = Static2.aStringArray5[local13];
							if (local13020.startsWith("<img=0>") || local13020.startsWith("<img=1>")) {
								local13020 = local13020.substring(7);
							}
							Static7.anIntArray571[local5++] = Static14.method1201(local13020);
							continue;
						}
						if (local45 == 3629) {
							Static7.anIntArray571[local5++] = client.country;
							continue;
						}
						if (local45 == 3630) {
							local13--;
							@Pc(13064) String local13064 = Static2.aStringArray5[local13];
							Static32.method3923(true, Static18.method1746(local13064));
							continue;
						}
						if (local45 == 3631) {
							@Pc(13079) int local13079 = local5 - 1;
							@Pc(13082) int local13082 = Static7.anIntArray571[local13079];
							local5 = local13079 + 1;
							Static7.anIntArray571[local13079] = Static2.aBooleanArray5[local13082] ? 1 : 0;
							continue;
						}
					} else if (local45 < 4000) {
						if (local45 == 3903) {
							@Pc(3628) int local3628 = local5 - 1;
							@Pc(3631) int local3631 = Static7.anIntArray571[local3628];
							local5 = local3628 + 1;
							Static7.anIntArray571[local3628] = Static1.aClass160Array1[local3631].method4078();
							continue;
						}
						if (local45 == 3904) {
							@Pc(3650) int local3650 = local5 - 1;
							@Pc(3653) int local3653 = Static7.anIntArray571[local3650];
							local5 = local3650 + 1;
							Static7.anIntArray571[local3650] = Static1.aClass160Array1[local3653].anInt4983;
							continue;
						}
						if (local45 == 3905) {
							@Pc(3670) int local3670 = local5 - 1;
							@Pc(3673) int local3673 = Static7.anIntArray571[local3670];
							local5 = local3670 + 1;
							Static7.anIntArray571[local3670] = Static1.aClass160Array1[local3673].anInt4982;
							continue;
						}
						if (local45 == 3906) {
							@Pc(3690) int local3690 = local5 - 1;
							@Pc(3693) int local3693 = Static7.anIntArray571[local3690];
							local5 = local3690 + 1;
							Static7.anIntArray571[local3690] = Static1.aClass160Array1[local3693].anInt4976;
							continue;
						}
						if (local45 == 3907) {
							@Pc(3708) int local3708 = local5 - 1;
							@Pc(3711) int local3711 = Static7.anIntArray571[local3708];
							local5 = local3708 + 1;
							Static7.anIntArray571[local3708] = Static1.aClass160Array1[local3711].anInt4980;
							continue;
						}
						if (local45 == 3908) {
							@Pc(3726) int local3726 = local5 - 1;
							@Pc(3729) int local3729 = Static7.anIntArray571[local3726];
							local5 = local3726 + 1;
							Static7.anIntArray571[local3726] = Static1.aClass160Array1[local3729].anInt4981;
							continue;
						}
						if (local45 == 3910) {
							@Pc(3745) int local3745 = local5 - 1;
							@Pc(3748) int local3748 = Static7.anIntArray571[local3745];
							@Pc(3754) int local3754 = Static1.aClass160Array1[local3748].method4081();
							local5 = local3745 + 1;
							Static7.anIntArray571[local3745] = local3754 == 0 ? 1 : 0;
							continue;
						}
						if (local45 == 3911) {
							@Pc(3776) int local3776 = local5 - 1;
							@Pc(3779) int local3779 = Static7.anIntArray571[local3776];
							@Pc(3785) int local3785 = Static1.aClass160Array1[local3779].method4081();
							local5 = local3776 + 1;
							Static7.anIntArray571[local3776] = local3785 == 2 ? 1 : 0;
							continue;
						}
						if (local45 == 3912) {
							@Pc(3803) int local3803 = local5 - 1;
							@Pc(3806) int local3806 = Static7.anIntArray571[local3803];
							@Pc(3814) int local3814 = Static1.aClass160Array1[local3806].method4081();
							local5 = local3803 + 1;
							Static7.anIntArray571[local3803] = local3814 == 5 ? 1 : 0;
							continue;
						}
						if (local45 == 3913) {
							@Pc(3835) int local3835 = local5 - 1;
							@Pc(3838) int local3838 = Static7.anIntArray571[local3835];
							@Pc(3844) int local3844 = Static1.aClass160Array1[local3838].method4081();
							local5 = local3835 + 1;
							Static7.anIntArray571[local3835] = local3844 == 1 ? 1 : 0;
							continue;
						}
					} else if (local45 < 4100) {
						if (local45 == 4000) {
							@Pc(11734) int local11734 = local5 - 2;
							@Pc(11740) int local11740 = Static7.anIntArray571[local11734 + 1];
							@Pc(11744) int local11744 = Static7.anIntArray571[local11734];
							local5 = local11734 + 1;
							Static7.anIntArray571[local11734] = local11744 + local11740;
							continue;
						}
						if (local45 == 4001) {
							@Pc(11758) int local11758 = local5 - 2;
							@Pc(11762) int local11762 = Static7.anIntArray571[local11758];
							@Pc(11768) int local11768 = Static7.anIntArray571[local11758 + 1];
							local5 = local11758 + 1;
							Static7.anIntArray571[local11758] = local11762 - local11768;
							continue;
						}
						if (local45 == 4002) {
							@Pc(11784) int local11784 = local5 - 2;
							@Pc(11788) int local11788 = Static7.anIntArray571[local11784];
							@Pc(11794) int local11794 = Static7.anIntArray571[local11784 + 1];
							local5 = local11784 + 1;
							Static7.anIntArray571[local11784] = local11788 * local11794;
							continue;
						}
						if (local45 == 4003) {
							@Pc(11810) int local11810 = local5 - 2;
							@Pc(11816) int local11816 = Static7.anIntArray571[local11810 + 1];
							@Pc(11820) int local11820 = Static7.anIntArray571[local11810];
							local5 = local11810 + 1;
							Static7.anIntArray571[local11810] = local11820 / local11816;
							continue;
						}
						if (local45 == 4004) {
							@Pc(11835) int local11835 = local5 - 1;
							@Pc(11838) int local11838 = Static7.anIntArray571[local11835];
							local5 = local11835 + 1;
							Static7.anIntArray571[local11835] = (int) ((double) local11838 * Math.random());
							continue;
						}
						if (local45 == 4005) {
							@Pc(11856) int local11856 = local5 - 1;
							@Pc(11859) int local11859 = Static7.anIntArray571[local11856];
							local5 = local11856 + 1;
							Static7.anIntArray571[local11856] = (int) ((double) (local11859 + 1) * Math.random());
							continue;
						}
						if (local45 == 4006) {
							@Pc(11876) int local11876 = local5 - 5;
							@Pc(11880) int local11880 = Static7.anIntArray571[local11876];
							@Pc(11886) int local11886 = Static7.anIntArray571[local11876 + 2];
							@Pc(11892) int local11892 = Static7.anIntArray571[local11876 + 3];
							@Pc(11898) int local11898 = Static7.anIntArray571[local11876 + 1];
							@Pc(11904) int local11904 = Static7.anIntArray571[local11876 + 4];
							local5 = local11876 + 1;
							Static7.anIntArray571[local11876] = (local11904 - local11886) * (local11898 - local11880) / (local11892 - local11886) + local11880;
							continue;
						}
						if (local45 == 4007) {
							@Pc(11930) int local11930 = local5 - 2;
							@Pc(11935) long local11935 = (long) Static7.anIntArray571[local11930];
							@Pc(11942) long local11942 = (long) Static7.anIntArray571[local11930 + 1];
							local5 = local11930 + 1;
							Static7.anIntArray571[local11930] = (int) (local11942 * local11935 / 100L + local11935);
							continue;
						}
						if (local45 == 4008) {
							@Pc(11962) int local11962 = local5 - 2;
							@Pc(11966) int local11966 = Static7.anIntArray571[local11962];
							@Pc(11972) int local11972 = Static7.anIntArray571[local11962 + 1];
							local5 = local11962 + 1;
							Static7.anIntArray571[local11962] = 0x1 << local11972 | local11966;
							continue;
						}
						if (local45 == 4009) {
							@Pc(11987) int local11987 = local5 - 2;
							@Pc(11991) int local11991 = Static7.anIntArray571[local11987];
							@Pc(11997) int local11997 = Static7.anIntArray571[local11987 + 1];
							local5 = local11987 + 1;
							Static7.anIntArray571[local11987] = -(0x1 << local11997) - 1 & local11991;
							continue;
						}
						if (local45 == 4010) {
							@Pc(12016) int local12016 = local5 - 2;
							@Pc(12020) int local12020 = Static7.anIntArray571[local12016];
							@Pc(12026) int local12026 = Static7.anIntArray571[local12016 + 1];
							local5 = local12016 + 1;
							Static7.anIntArray571[local12016] = (local12020 & 0x1 << local12026) == 0 ? 0 : 1;
							continue;
						}
						if (local45 == 4011) {
							@Pc(12048) int local12048 = local5 - 2;
							@Pc(12052) int local12052 = Static7.anIntArray571[local12048];
							@Pc(12058) int local12058 = Static7.anIntArray571[local12048 + 1];
							local5 = local12048 + 1;
							Static7.anIntArray571[local12048] = local12052 % local12058;
							continue;
						}
						if (local45 == 4012) {
							@Pc(12072) int local12072 = local5 - 2;
							@Pc(12076) int local12076 = Static7.anIntArray571[local12072];
							@Pc(12082) int local12082 = Static7.anIntArray571[local12072 + 1];
							if (local12076 == 0) {
								local5 = local12072 + 1;
								Static7.anIntArray571[local12072] = 0;
							} else {
								local5 = local12072 + 1;
								Static7.anIntArray571[local12072] = (int) Math.pow((double) local12076, (double) local12082);
							}
							continue;
						}
						if (local45 == 4013) {
							@Pc(12110) int local12110 = local5 - 2;
							@Pc(12114) int local12114 = Static7.anIntArray571[local12110];
							@Pc(12120) int local12120 = Static7.anIntArray571[local12110 + 1];
							if (local12114 == 0) {
								local5 = local12110 + 1;
								Static7.anIntArray571[local12110] = 0;
							} else if (local12120 == 0) {
								local5 = local12110 + 1;
								Static7.anIntArray571[local12110] = Integer.MAX_VALUE;
							} else {
								local5 = local12110 + 1;
								Static7.anIntArray571[local12110] = (int) Math.pow((double) local12114, 1.0D / (double) local12120);
							}
							continue;
						}
						if (local45 == 4014) {
							@Pc(12160) int local12160 = local5 - 2;
							@Pc(12164) int local12164 = Static7.anIntArray571[local12160];
							@Pc(12170) int local12170 = Static7.anIntArray571[local12160 + 1];
							local5 = local12160 + 1;
							Static7.anIntArray571[local12160] = local12170 & local12164;
							continue;
						}
						if (local45 == 4015) {
							@Pc(12185) int local12185 = local5 - 2;
							@Pc(12191) int local12191 = Static7.anIntArray571[local12185 + 1];
							@Pc(12195) int local12195 = Static7.anIntArray571[local12185];
							local5 = local12185 + 1;
							Static7.anIntArray571[local12185] = local12191 | local12195;
							continue;
						}
						if (local45 == 4016) {
							@Pc(12209) int local12209 = local5 - 2;
							@Pc(12213) int local12213 = Static7.anIntArray571[local12209];
							@Pc(12219) int local12219 = Static7.anIntArray571[local12209 + 1];
							local5 = local12209 + 1;
							Static7.anIntArray571[local12209] = local12219 <= local12213 ? local12219 : local12213;
							continue;
						}
						if (local45 == 4017) {
							@Pc(12235) int local12235 = local5 - 2;
							@Pc(12239) int local12239 = Static7.anIntArray571[local12235];
							@Pc(12245) int local12245 = Static7.anIntArray571[local12235 + 1];
							local5 = local12235 + 1;
							Static7.anIntArray571[local12235] = local12239 > local12245 ? local12239 : local12245;
							continue;
						}
						if (local45 == 4018) {
							@Pc(12266) int local12266 = local5 - 3;
							@Pc(12271) long local12271 = (long) Static7.anIntArray571[local12266];
							@Pc(12278) long local12278 = (long) Static7.anIntArray571[local12266 + 2];
							@Pc(12285) long local12285 = (long) Static7.anIntArray571[local12266 + 1];
							local5 = local12266 + 1;
							Static7.anIntArray571[local12266] = (int) (local12278 * local12271 / local12285);
							continue;
						}
					} else if (local45 < 4200) {
						if (local45 == 4100) {
							@Pc(10985) int local10985 = local13 - 1;
							@Pc(10988) String local10988 = Static2.aStringArray5[local10985];
							local5--;
							@Pc(10993) int local10993 = Static7.anIntArray571[local5];
							local13 = local10985 + 1;
							Static2.aStringArray5[local10985] = local10988 + local10993;
							continue;
						}
						if (local45 == 4101) {
							@Pc(11013) int local11013 = local13 - 2;
							@Pc(11017) String local11017 = Static2.aStringArray5[local11013];
							@Pc(11023) String local11023 = Static2.aStringArray5[local11013 + 1];
							local13 = local11013 + 1;
							Static2.aStringArray5[local11013] = local11017 + local11023;
							continue;
						}
						if (local45 == 4102) {
							local5--;
							@Pc(11048) int local11048 = Static7.anIntArray571[local5];
							@Pc(11050) int local11050 = local13 - 1;
							@Pc(11053) String local11053 = Static2.aStringArray5[local11050];
							local13 = local11050 + 1;
							Static2.aStringArray5[local11050] = local11053 + Static29.method3436(local11048);
							continue;
						}
						if (local45 == 4103) {
							@Pc(11075) int local11075 = local13 - 1;
							@Pc(11078) String local11078 = Static2.aStringArray5[local11075];
							local13 = local11075 + 1;
							Static2.aStringArray5[local11075] = local11078.toLowerCase();
							continue;
						}
						if (local45 == 4104) {
							local5--;
							@Pc(11097) int local11097 = Static7.anIntArray571[local5];
							@Pc(11104) long local11104 = (long) local11097 * 86400000L + 1014768000000L;
							Static7.aCalendar2.setTime(new Date(local11104));
							@Pc(11114) int local11114 = Static7.aCalendar2.get(5);
							@Pc(11118) int local11118 = Static7.aCalendar2.get(2);
							@Pc(11122) int local11122 = Static7.aCalendar2.get(1);
							Static2.aStringArray5[local13++] = local11114 + "-" + Static6.aStringArray25[local11118] + "-" + local11122;
							continue;
						}
						if (local45 == 4105) {
							@Pc(11151) int local11151 = local13 - 2;
							@Pc(11157) String local11157 = Static2.aStringArray5[local11151 + 1];
							@Pc(11161) String local11161 = Static2.aStringArray5[local11151];
							if (Static4.aClass53_Sub1_Sub1_2.aClass144_2 != null && Static4.aClass53_Sub1_Sub1_2.aClass144_2.aBoolean306) {
								local13 = local11151 + 1;
								Static2.aStringArray5[local11151] = local11157;
								continue;
							}
							local13 = local11151 + 1;
							Static2.aStringArray5[local11151] = local11161;
							continue;
						}
						if (local45 == 4106) {
							local5--;
							@Pc(11192) int local11192 = Static7.anIntArray571[local5];
							Static2.aStringArray5[local13++] = Integer.toString(local11192);
							continue;
						}
						if (local45 == 4107) {
							local13 -= 2;
							Static7.anIntArray571[local5++] = Static27.method3220(Static37.method4711(Static2.aStringArray5[local13 + 1], client.language, Static2.aStringArray5[local13]));
							continue;
						}
						if (local45 == 4108) {
							@Pc(11229) int local11229 = local5 - 2;
							@Pc(11235) int local11235 = Static7.anIntArray571[local11229 + 1];
							@Pc(11239) int local11239 = Static7.anIntArray571[local11229];
							local13--;
							@Pc(11244) String local11244 = Static2.aStringArray5[local13];
							local5 = local11229 + 1;
							Static7.anIntArray571[local11229] = Static31.method3656(local11235).method2274(local11244, local11239);
							continue;
						}
						if (local45 == 4109) {
							@Pc(11260) int local11260 = local5 - 2;
							local13--;
							@Pc(11265) String local11265 = Static2.aStringArray5[local13];
							@Pc(11269) int local11269 = Static7.anIntArray571[local11260];
							@Pc(11275) int local11275 = Static7.anIntArray571[local11260 + 1];
							local5 = local11260 + 1;
							Static7.anIntArray571[local11260] = Static31.method3656(local11275).method2261(local11265, local11269);
							continue;
						}
						if (local45 == 4110) {
							@Pc(11292) int local11292 = local13 - 2;
							@Pc(11296) String local11296 = Static2.aStringArray5[local11292];
							@Pc(11302) String local11302 = Static2.aStringArray5[local11292 + 1];
							local5--;
							if (Static7.anIntArray571[local5] == 1) {
								local13 = local11292 + 1;
								Static2.aStringArray5[local11292] = local11296;
							} else {
								local13 = local11292 + 1;
								Static2.aStringArray5[local11292] = local11302;
							}
							continue;
						}
						if (local45 == 4111) {
							@Pc(11329) int local11329 = local13 - 1;
							@Pc(11332) String local11332 = Static2.aStringArray5[local11329];
							local13 = local11329 + 1;
							Static2.aStringArray5[local11329] = Static17.method2265(local11332);
							continue;
						}
						if (local45 == 4112) {
							@Pc(11347) int local11347 = local13 - 1;
							@Pc(11350) String local11350 = Static2.aStringArray5[local11347];
							local5--;
							@Pc(11355) int local11355 = Static7.anIntArray571[local5];
							if (local11355 == -1) {
								throw new RuntimeException("null char");
							}
							local13 = local11347 + 1;
							Static2.aStringArray5[local11347] = local11350 + (char) local11355;
							continue;
						}
						if (local45 == 4113) {
							@Pc(11387) int local11387 = local5 - 1;
							@Pc(11390) int local11390 = Static7.anIntArray571[local11387];
							local5 = local11387 + 1;
							Static7.anIntArray571[local11387] = Static20.method1907((char) local11390) ? 1 : 0;
							continue;
						}
						if (local45 == 4114) {
							@Pc(11412) int local11412 = local5 - 1;
							@Pc(11415) int local11415 = Static7.anIntArray571[local11412];
							local5 = local11412 + 1;
							Static7.anIntArray571[local11412] = Static11.method636((char) local11415) ? 1 : 0;
							continue;
						}
						if (local45 == 4115) {
							@Pc(11434) int local11434 = local5 - 1;
							@Pc(11437) int local11437 = Static7.anIntArray571[local11434];
							local5 = local11434 + 1;
							Static7.anIntArray571[local11434] = Static21.method1996((char) local11437) ? 1 : 0;
							continue;
						}
						if (local45 == 4116) {
							@Pc(11456) int local11456 = local5 - 1;
							@Pc(11459) int local11459 = Static7.anIntArray571[local11456];
							local5 = local11456 + 1;
							Static7.anIntArray571[local11456] = Static15.method1478((char) local11459) ? 1 : 0;
							continue;
						}
						if (local45 == 4117) {
							local13--;
							@Pc(11484) String local11484 = Static2.aStringArray5[local13];
							if (local11484 == null) {
								Static7.anIntArray571[local5++] = 0;
							} else {
								Static7.anIntArray571[local5++] = local11484.length();
							}
							continue;
						}
						if (local45 == 4118) {
							local5 -= 2;
							@Pc(11510) int local11510 = local13 - 1;
							@Pc(11513) String local11513 = Static2.aStringArray5[local11510];
							@Pc(11517) int local11517 = Static7.anIntArray571[local5];
							@Pc(11523) int local11523 = Static7.anIntArray571[local5 + 1];
							local13 = local11510 + 1;
							Static2.aStringArray5[local11510] = local11513.substring(local11517, local11523);
							continue;
						}
						if (local45 == 4119) {
							@Pc(11539) int local11539 = local13 - 1;
							@Pc(11542) String local11542 = Static2.aStringArray5[local11539];
							@Pc(11544) boolean local11544 = false;
							@Pc(11550) StringBuffer local11550 = new StringBuffer(local11542.length());
							for (@Pc(11552) int local11552 = 0; local11552 < local11542.length(); local11552++) {
								@Pc(11564) char local11564 = local11542.charAt(local11552);
								if (local11564 == '<') {
									local11544 = true;
								} else if (local11564 == '>') {
									local11544 = false;
								} else if (!local11544) {
									local11550.append(local11564);
								}
							}
							local13 = local11539 + 1;
							Static2.aStringArray5[local11539] = local11550.toString();
							continue;
						}
						if (local45 == 4120) {
							@Pc(11602) int local11602 = local5 - 2;
							local13--;
							@Pc(11607) String local11607 = Static2.aStringArray5[local13];
							@Pc(11611) int local11611 = Static7.anIntArray571[local11602];
							@Pc(11617) int local11617 = Static7.anIntArray571[local11602 + 1];
							local5 = local11602 + 1;
							Static7.anIntArray571[local11602] = local11607.indexOf(local11611, local11617);
							continue;
						}
						if (local45 == 4121) {
							@Pc(11634) int local11634 = local5 - 1;
							@Pc(11637) int local11637 = Static7.anIntArray571[local11634];
							local13 -= 2;
							@Pc(11642) String local11642 = Static2.aStringArray5[local13];
							@Pc(11648) String local11648 = Static2.aStringArray5[local13 + 1];
							local5 = local11634 + 1;
							Static7.anIntArray571[local11634] = local11642.indexOf(local11648, local11637);
							continue;
						}
						if (local45 == 4122) {
							@Pc(11665) int local11665 = local5 - 1;
							@Pc(11668) int local11668 = Static7.anIntArray571[local11665];
							local5 = local11665 + 1;
							Static7.anIntArray571[local11665] = Character.toLowerCase((char) local11668);
							continue;
						}
						if (local45 == 4123) {
							@Pc(11683) int local11683 = local5 - 1;
							@Pc(11686) int local11686 = Static7.anIntArray571[local11683];
							local5 = local11683 + 1;
							Static7.anIntArray571[local11683] = Character.toUpperCase((char) local11686);
							continue;
						}
						if (local45 == 4124) {
							@Pc(11703) int local11703 = local5 - 1;
							@Pc(11712) boolean local11712 = Static7.anIntArray571[local11703] != 0;
							local5 = local11703 - 1;
							@Pc(11717) int local11717 = Static7.anIntArray571[local5];
							Static2.aStringArray5[local13++] = Static36.method4434((long) local11717, local11712, 0, client.language);
							continue;
						}
					} else if (local45 < 4300) {
						if (local45 == 4200) {
							local5--;
							@Pc(10588) int local10588 = Static7.anIntArray571[local5];
							Static2.aStringArray5[local13++] = Static35.method4361(local10588).aString308;
							continue;
						}
						if (local45 == 4201) {
							local5 -= 2;
							@Pc(10609) int local10609 = Static7.anIntArray571[local5 + 1];
							@Pc(10613) int local10613 = Static7.anIntArray571[local5];
							@Pc(10617) Class162 local10617 = Static35.method4361(local10613);
							if (local10609 >= 1 && local10609 <= 5 && local10617.aStringArray33[local10609 - 1] != null) {
								Static2.aStringArray5[local13++] = local10617.aStringArray33[local10609 - 1];
								continue;
							}
							Static2.aStringArray5[local13++] = "";
							continue;
						}
						if (local45 == 4202) {
							local5 -= 2;
							@Pc(10662) int local10662 = Static7.anIntArray571[local5];
							@Pc(10668) int local10668 = Static7.anIntArray571[local5 + 1];
							@Pc(10672) Class162 local10672 = Static35.method4361(local10662);
							if (local10668 >= 1 && local10668 <= 5 && local10672.aStringArray32[local10668 - 1] != null) {
								Static2.aStringArray5[local13++] = local10672.aStringArray32[local10668 - 1];
								continue;
							}
							Static2.aStringArray5[local13++] = "";
							continue;
						}
						if (local45 == 4203) {
							@Pc(10712) int local10712 = local5 - 1;
							@Pc(10715) int local10715 = Static7.anIntArray571[local10712];
							local5 = local10712 + 1;
							Static7.anIntArray571[local10712] = Static35.method4361(local10715).anInt5102;
							continue;
						}
						if (local45 == 4204) {
							@Pc(10732) int local10732 = local5 - 1;
							@Pc(10735) int local10735 = Static7.anIntArray571[local10732];
							local5 = local10732 + 1;
							Static7.anIntArray571[local10732] = Static35.method4361(local10735).anInt5075 == 1 ? 1 : 0;
							continue;
						}
						if (local45 == 4205) {
							@Pc(10760) int local10760 = local5 - 1;
							@Pc(10763) int local10763 = Static7.anIntArray571[local10760];
							@Pc(10767) Class162 local10767 = Static35.method4361(local10763);
							if (local10767.anInt5089 == -1 && local10767.anInt5100 >= 0) {
								local5 = local10760 + 1;
								Static7.anIntArray571[local10760] = local10767.anInt5100;
								continue;
							}
							local5 = local10760 + 1;
							Static7.anIntArray571[local10760] = local10763;
							continue;
						}
						if (local45 == 4206) {
							@Pc(10797) int local10797 = local5 - 1;
							@Pc(10800) int local10800 = Static7.anIntArray571[local10797];
							@Pc(10804) Class162 local10804 = Static35.method4361(local10800);
							if (local10804.anInt5089 >= 0 && local10804.anInt5100 >= 0) {
								local5 = local10797 + 1;
								Static7.anIntArray571[local10797] = local10804.anInt5100;
								continue;
							}
							local5 = local10797 + 1;
							Static7.anIntArray571[local10797] = local10800;
							continue;
						}
						if (local45 == 4207) {
							@Pc(10836) int local10836 = local5 - 1;
							@Pc(10839) int local10839 = Static7.anIntArray571[local10836];
							local5 = local10836 + 1;
							Static7.anIntArray571[local10836] = Static35.method4361(local10839).aBoolean350 ? 1 : 0;
							continue;
						}
						if (local45 == 4208) {
							local5 -= 2;
							@Pc(10865) int local10865 = Static7.anIntArray571[local5 + 1];
							@Pc(10869) int local10869 = Static7.anIntArray571[local5];
							@Pc(10873) Class4_Sub3_Sub12 local10873 = Static19.method1815(local10865);
							if (local10873.method1995()) {
								Static2.aStringArray5[local13++] = Static35.method4361(local10869).method4129(local10873.aString153, local10865);
							} else {
								Static7.anIntArray571[local5++] = Static35.method4361(local10869).method4133(local10865, local10873.anInt2546);
							}
							continue;
						}
						if (local45 == 4210) {
							local13--;
							@Pc(10915) String local10915 = Static2.aStringArray5[local13];
							@Pc(10917) int local10917 = local5 - 1;
							@Pc(10920) int local10920 = Static7.anIntArray571[local10917];
							Static30.method3598(local10915, local10920 == 1);
							local5 = local10917 + 1;
							Static7.anIntArray571[local10917] = Static2.anInt5734;
							continue;
						}
						if (local45 == 4211) {
							if (Static7.aShortArray114 != null && Static2.anInt5734 > Static4.anInt3497) {
								Static7.anIntArray571[local5++] = Static7.aShortArray114[Static4.anInt3497++] & 0xFFFF;
								continue;
							}
							Static7.anIntArray571[local5++] = -1;
							continue;
						}
						if (local45 == 4212) {
							Static4.anInt3497 = 0;
							continue;
						}
					} else if (local45 < 4400) {
						if (local45 == 4300) {
							local5 -= 2;
							@Pc(3882) int local3882 = Static7.anIntArray571[local5 + 1];
							@Pc(3886) int local3886 = Static7.anIntArray571[local5];
							@Pc(3890) Class4_Sub3_Sub12 local3890 = Static19.method1815(local3882);
							if (local3890.method1995()) {
								Static2.aStringArray5[local13++] = Static15.method1495(local3886).method4258(local3882, local3890.aString153);
							} else {
								Static7.anIntArray571[local5++] = Static15.method1495(local3886).method4262(local3890.anInt2546, local3882);
							}
							continue;
						}
					} else if (local45 >= 4500) {
						if (local45 >= 4600) {
							if (local45 < 5100) {
								if (local45 == 5000) {
									Static7.anIntArray571[local5++] = Static7.anInt5413;
									continue;
								}
								if (local45 == 5001) {
									local5 -= 3;
									Static7.anInt5413 = Static7.anIntArray571[local5];
									Static6.anInt4837 = Static7.anIntArray571[local5 + 1];
									Static6.anInt5016 = Static7.anIntArray571[local5 + 2];
									Static3.aClass4_Sub10_Sub1_1.writeOpcode(234);
									Static3.aClass4_Sub10_Sub1_1.writeByte(Static7.anInt5413);
									Static3.aClass4_Sub10_Sub1_1.writeByte(Static6.anInt4837);
									Static3.aClass4_Sub10_Sub1_1.writeByte(Static6.anInt5016);
									continue;
								}
								if (local45 == 5002) {
									local13--;
									@Pc(4007) String local4007 = Static2.aStringArray5[local13];
									local5 -= 2;
									@Pc(4012) int local4012 = Static7.anIntArray571[local5];
									@Pc(4018) int local4018 = Static7.anIntArray571[local5 + 1];
									Static3.aClass4_Sub10_Sub1_1.writeOpcode(90);
									Static3.aClass4_Sub10_Sub1_1.writeLong(Static18.method1746(local4007));
									Static3.aClass4_Sub10_Sub1_1.writeByte(local4012 - 1);
									Static3.aClass4_Sub10_Sub1_1.writeByte(local4018);
									continue;
								}
								if (local45 == 5003) {
									local5--;
									@Pc(4050) int local4050 = Static7.anIntArray571[local5];
									@Pc(4052) String local4052 = null;
									if (local4050 < 100) {
										local4052 = Static6.aStringArray31[local4050];
									}
									if (local4052 == null) {
										local4052 = "";
									}
									Static2.aStringArray5[local13++] = local4052;
									continue;
								}
								if (local45 == 5004) {
									@Pc(4077) int local4077 = -1;
									@Pc(4079) int local4079 = local5 - 1;
									@Pc(4082) int local4082 = Static7.anIntArray571[local4079];
									if (local4082 < 100 && Static6.aStringArray31[local4082] != null) {
										local4077 = Static5.anIntArray447[local4082];
									}
									local5 = local4079 + 1;
									Static7.anIntArray571[local4079] = local4077;
									continue;
								}
								if (local45 == 5005) {
									Static7.anIntArray571[local5++] = Static6.anInt4837;
									continue;
								}
								if (local45 == 5008) {
									local13--;
									@Pc(4125) String local4125 = Static2.aStringArray5[local13];
									if (local4125.startsWith("::")) {
										Static27.method3185(local4125);
										continue;
									}
									if (Static3.anInt2576 == 0 && (Static1.aBoolean47 && !Static5.aBoolean287 || Static2.aBoolean67)) {
										continue;
									}
									@Pc(4152) String local4152 = local4125.toLowerCase();
									@Pc(4154) byte local4154 = 0;
									@Pc(4156) byte local4156 = 0;
									if (local4152.startsWith(Text.CHATCOL0)) {
										local4125 = local4125.substring(Text.CHATCOL0.length());
										local4154 = 0;
									} else if (local4152.startsWith(Text.CHATCOL1)) {
										local4154 = 1;
										local4125 = local4125.substring(Text.CHATCOL1.length());
									} else if (local4152.startsWith(Text.CHATCOL2)) {
										local4125 = local4125.substring(Text.CHATCOL2.length());
										local4154 = 2;
									} else if (local4152.startsWith(Text.CHATCOL3)) {
										local4125 = local4125.substring(Text.CHATCOL3.length());
										local4154 = 3;
									} else if (local4152.startsWith(Text.CHATCOL4)) {
										local4125 = local4125.substring(Text.CHATCOL4.length());
										local4154 = 4;
									} else if (local4152.startsWith(Text.CHATCOL5)) {
										local4125 = local4125.substring(Text.CHATCOL5.length());
										local4154 = 5;
									} else if (local4152.startsWith(Text.CHATCOL6)) {
										local4125 = local4125.substring(Text.CHATCOL6.length());
										local4154 = 6;
									} else if (local4152.startsWith(Text.CHATCOL7)) {
										local4154 = 7;
										local4125 = local4125.substring(Text.CHATCOL7.length());
									} else if (local4152.startsWith(Text.CHATCOL8)) {
										local4125 = local4125.substring(Text.CHATCOL8.length());
										local4154 = 8;
									} else if (local4152.startsWith(Text.CHATCOL9)) {
										local4125 = local4125.substring(Text.CHATCOL9.length());
										local4154 = 9;
									} else if (local4152.startsWith(Text.CHATCOL10)) {
										local4154 = 10;
										local4125 = local4125.substring(Text.CHATCOL10.length());
									} else if (local4152.startsWith(Text.CHATCOL11)) {
										local4125 = local4125.substring(Text.CHATCOL11.length());
										local4154 = 11;
									} else if (client.language != 0) {
										if (local4152.startsWith(LocalisedText.CHATCOL0)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL0.length());
											local4154 = 0;
										} else if (local4152.startsWith(LocalisedText.CHATCOL1)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL1.length());
											local4154 = 1;
										} else if (local4152.startsWith(LocalisedText.CHATCOL2)) {
											local4154 = 2;
											local4125 = local4125.substring(LocalisedText.CHATCOL2.length());
										} else if (local4152.startsWith(LocalisedText.CHATCOL3)) {
											local4154 = 3;
											local4125 = local4125.substring(LocalisedText.CHATCOL3.length());
										} else if (local4152.startsWith(LocalisedText.CHATCOL4)) {
											local4154 = 4;
											local4125 = local4125.substring(LocalisedText.CHATCOL4.length());
										} else if (local4152.startsWith(LocalisedText.CHATCOL5)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL5.length());
											local4154 = 5;
										} else if (local4152.startsWith(LocalisedText.CHATCOL6)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL6.length());
											local4154 = 6;
										} else if (local4152.startsWith(LocalisedText.CHATCOL7)) {
											local4154 = 7;
											local4125 = local4125.substring(LocalisedText.CHATCOL7.length());
										} else if (local4152.startsWith(LocalisedText.CHATCOL8)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL8.length());
											local4154 = 8;
										} else if (local4152.startsWith(LocalisedText.CHATCOL9)) {
											local4154 = 9;
											local4125 = local4125.substring(LocalisedText.CHATCOL9.length());
										} else if (local4152.startsWith(LocalisedText.CHATCOL10)) {
											local4125 = local4125.substring(LocalisedText.CHATCOL10.length());
											local4154 = 10;
										} else if (local4152.startsWith(LocalisedText.CHATCOL11)) {
											local4154 = 11;
											local4125 = local4125.substring(LocalisedText.CHATCOL11.length());
										}
									}
									@Pc(4473) String local4473 = local4125.toLowerCase();
									if (local4473.startsWith(Text.CHATEFFECT1)) {
										local4125 = local4125.substring(Text.CHATEFFECT1.length());
										local4156 = 1;
									} else if (local4473.startsWith(Text.CHATEFFECT2)) {
										local4156 = 2;
										local4125 = local4125.substring(Text.CHATEFFECT2.length());
									} else if (local4473.startsWith(Text.CHATEFFECT3)) {
										local4156 = 3;
										local4125 = local4125.substring(Text.CHATEFFECT3.length());
									} else if (local4473.startsWith(Text.CHATEFFECT4)) {
										local4125 = local4125.substring(Text.CHATEFFECT4.length());
										local4156 = 4;
									} else if (local4473.startsWith(Text.CHATEFFECT5)) {
										local4156 = 5;
										local4125 = local4125.substring(Text.CHATEFFECT5.length());
									} else if (client.language != 0) {
										if (local4473.startsWith(LocalisedText.CHATEFFECT1)) {
											local4125 = local4125.substring(LocalisedText.CHATEFFECT1.length());
											local4156 = 1;
										} else if (local4473.startsWith(LocalisedText.CHATEFFECT2)) {
											local4125 = local4125.substring(LocalisedText.CHATEFFECT2.length());
											local4156 = 2;
										} else if (local4473.startsWith(LocalisedText.CHATEFFECT3)) {
											local4156 = 3;
											local4125 = local4125.substring(LocalisedText.CHATEFFECT3.length());
										} else if (local4473.startsWith(LocalisedText.CHATEFFECT4)) {
											local4156 = 4;
											local4125 = local4125.substring(LocalisedText.CHATEFFECT4.length());
										} else if (local4473.startsWith(LocalisedText.CHATEFFECT5)) {
											local4125 = local4125.substring(LocalisedText.CHATEFFECT5.length());
											local4156 = 5;
										}
									}
									Static3.aClass4_Sub10_Sub1_1.writeOpcode(186);
									Static3.aClass4_Sub10_Sub1_1.writeByte(0);
									@Pc(4616) int local4616 = Static3.aClass4_Sub10_Sub1_1.position;
									Static3.aClass4_Sub10_Sub1_1.writeByte(local4154);
									Static3.aClass4_Sub10_Sub1_1.writeByte(local4156);
									Static31.method3655(Static3.aClass4_Sub10_Sub1_1, local4125);
									Static3.aClass4_Sub10_Sub1_1.writeByteLength(Static3.aClass4_Sub10_Sub1_1.position - local4616);
									continue;
								}
								if (local45 == 5009) {
									local13 -= 2;
									@Pc(4647) String local4647 = Static2.aStringArray5[local13];
									@Pc(4653) String local4653 = Static2.aStringArray5[local13 + 1];
									if (Static3.anInt2576 != 0 || (!Static1.aBoolean47 || Static5.aBoolean287) && !Static2.aBoolean67) {
										Static3.aClass4_Sub10_Sub1_1.writeOpcode(157);
										Static3.aClass4_Sub10_Sub1_1.writeByte(0);
										@Pc(4680) int local4680 = Static3.aClass4_Sub10_Sub1_1.position;
										Static3.aClass4_Sub10_Sub1_1.writeLong(Static18.method1746(local4647));
										Static31.method3655(Static3.aClass4_Sub10_Sub1_1, local4653);
										Static3.aClass4_Sub10_Sub1_1.writeByteLength(Static3.aClass4_Sub10_Sub1_1.position - local4680);
									}
									continue;
								}
								if (local45 == 5010) {
									@Pc(4708) String local4708 = null;
									local5--;
									@Pc(4713) int local4713 = Static7.anIntArray571[local5];
									if (local4713 < 100) {
										local4708 = Static3.aStringArray16[local4713];
									}
									if (local4708 == null) {
										local4708 = "";
									}
									Static2.aStringArray5[local13++] = local4708;
									continue;
								}
								if (local45 == 5011) {
									local5--;
									@Pc(4745) int local4745 = Static7.anIntArray571[local5];
									@Pc(4747) String local4747 = null;
									if (local4745 < 100) {
										local4747 = Static1.aStringArray4[local4745];
									}
									if (local4747 == null) {
										local4747 = "";
									}
									Static2.aStringArray5[local13++] = local4747;
									continue;
								}
								if (local45 == 5012) {
									@Pc(4777) int local4777 = local5 - 1;
									@Pc(4780) int local4780 = Static7.anIntArray571[local4777];
									@Pc(4782) int local4782 = -1;
									if (local4780 < 100) {
										local4782 = Static7.anIntArray598[local4780];
									}
									local5 = local4777 + 1;
									Static7.anIntArray571[local4777] = local4782;
									continue;
								}
								if (local45 == 5015) {
									@Pc(4812) String local4812;
									if (Static4.aClass53_Sub1_Sub1_2 == null || Static4.aClass53_Sub1_Sub1_2.aString88 == null) {
										local4812 = Static3.aString132;
									} else {
										local4812 = Static4.aClass53_Sub1_Sub1_2.method1173();
									}
									Static2.aStringArray5[local13++] = local4812;
									continue;
								}
								if (local45 == 5016) {
									Static7.anIntArray571[local5++] = Static6.anInt5016;
									continue;
								}
								if (local45 == 5017) {
									Static7.anIntArray571[local5++] = Static5.anInt3469;
									continue;
								}
								if (local45 == 5050) {
									local5--;
									@Pc(4852) int local4852 = Static7.anIntArray571[local5];
									Static2.aStringArray5[local13++] = Static20.method1961(local4852).aString362;
									continue;
								}
								if (local45 == 5051) {
									@Pc(4872) int local4872 = local5 - 1;
									@Pc(4875) int local4875 = Static7.anIntArray571[local4872];
									@Pc(4879) Class4_Sub3_Sub23 local4879 = Static20.method1961(local4875);
									if (local4879.anIntArray677 == null) {
										local5 = local4872 + 1;
										Static7.anIntArray571[local4872] = 0;
									} else {
										local5 = local4872 + 1;
										Static7.anIntArray571[local4872] = local4879.anIntArray677.length;
									}
									continue;
								}
								if (local45 == 5052) {
									@Pc(4903) int local4903 = local5 - 2;
									@Pc(4909) int local4909 = Static7.anIntArray571[local4903 + 1];
									@Pc(4913) int local4913 = Static7.anIntArray571[local4903];
									@Pc(4917) Class4_Sub3_Sub23 local4917 = Static20.method1961(local4913);
									@Pc(4922) int local4922 = local4917.anIntArray677[local4909];
									local5 = local4903 + 1;
									Static7.anIntArray571[local4903] = local4922;
									continue;
								}
								if (local45 == 5053) {
									@Pc(4934) int local4934 = local5 - 1;
									@Pc(4937) int local4937 = Static7.anIntArray571[local4934];
									@Pc(4943) Class4_Sub3_Sub23 local4943 = Static20.method1961(local4937);
									if (local4943.anIntArray676 == null) {
										local5 = local4934 + 1;
										Static7.anIntArray571[local4934] = 0;
									} else {
										local5 = local4934 + 1;
										Static7.anIntArray571[local4934] = local4943.anIntArray676.length;
									}
									continue;
								}
								if (local45 == 5054) {
									@Pc(4968) int local4968 = local5 - 2;
									@Pc(4972) int local4972 = Static7.anIntArray571[local4968];
									@Pc(4978) int local4978 = Static7.anIntArray571[local4968 + 1];
									local5 = local4968 + 1;
									Static7.anIntArray571[local4968] = Static20.method1961(local4972).anIntArray676[local4978];
									continue;
								}
								if (local45 == 5055) {
									local5--;
									@Pc(5000) int local5000 = Static7.anIntArray571[local5];
									Static2.aStringArray5[local13++] = Static26.method2991(local5000).method1913();
									continue;
								}
								if (local45 == 5056) {
									@Pc(5018) int local5018 = local5 - 1;
									@Pc(5021) int local5021 = Static7.anIntArray571[local5018];
									@Pc(5025) Class4_Sub3_Sub11 local5025 = Static26.method2991(local5021);
									if (local5025.anIntArray212 == null) {
										local5 = local5018 + 1;
										Static7.anIntArray571[local5018] = 0;
									} else {
										local5 = local5018 + 1;
										Static7.anIntArray571[local5018] = local5025.anIntArray212.length;
									}
									continue;
								}
								if (local45 == 5057) {
									@Pc(5051) int local5051 = local5 - 2;
									@Pc(5055) int local5055 = Static7.anIntArray571[local5051];
									@Pc(5061) int local5061 = Static7.anIntArray571[local5051 + 1];
									local5 = local5051 + 1;
									Static7.anIntArray571[local5051] = Static26.method2991(local5055).anIntArray212[local5061];
									continue;
								}
								if (local45 == 5058) {
									Static1.aClass27_1 = new Class27();
									local5--;
									Static1.aClass27_1.anInt540 = Static7.anIntArray571[local5];
									Static1.aClass27_1.aClass4_Sub3_Sub11_1 = Static26.method2991(Static1.aClass27_1.anInt540);
									Static1.aClass27_1.anIntArray48 = new int[Static1.aClass27_1.aClass4_Sub3_Sub11_1.method1903()];
									continue;
								}
								if (local45 == 5059) {
									Static3.aClass4_Sub10_Sub1_1.writeOpcode(222);
									Static3.aClass4_Sub10_Sub1_1.writeByte(0);
									@Pc(5125) int local5125 = Static3.aClass4_Sub10_Sub1_1.position;
									Static3.aClass4_Sub10_Sub1_1.writeByte(0);
									Static3.aClass4_Sub10_Sub1_1.writeShort(Static1.aClass27_1.anInt540);
									Static1.aClass27_1.aClass4_Sub3_Sub11_1.method1911(Static1.aClass27_1.anIntArray48, Static3.aClass4_Sub10_Sub1_1);
									Static3.aClass4_Sub10_Sub1_1.writeByteLength(Static3.aClass4_Sub10_Sub1_1.position - local5125);
									continue;
								}
								if (local45 == 5060) {
									local13--;
									@Pc(5165) String local5165 = Static2.aStringArray5[local13];
									Static3.aClass4_Sub10_Sub1_1.writeOpcode(42);
									Static3.aClass4_Sub10_Sub1_1.writeByte(0);
									@Pc(5178) int local5178 = Static3.aClass4_Sub10_Sub1_1.position;
									Static3.aClass4_Sub10_Sub1_1.writeLong(Static18.method1746(local5165));
									Static3.aClass4_Sub10_Sub1_1.writeShort(Static1.aClass27_1.anInt540);
									Static1.aClass27_1.aClass4_Sub3_Sub11_1.method1911(Static1.aClass27_1.anIntArray48, Static3.aClass4_Sub10_Sub1_1);
									Static3.aClass4_Sub10_Sub1_1.writeByteLength(Static3.aClass4_Sub10_Sub1_1.position - local5178);
									continue;
								}
								if (local45 == 5061) {
									Static3.aClass4_Sub10_Sub1_1.writeOpcode(222);
									Static3.aClass4_Sub10_Sub1_1.writeByte(0);
									@Pc(5227) int local5227 = Static3.aClass4_Sub10_Sub1_1.position;
									Static3.aClass4_Sub10_Sub1_1.writeByte(1);
									Static3.aClass4_Sub10_Sub1_1.writeShort(Static1.aClass27_1.anInt540);
									Static1.aClass27_1.aClass4_Sub3_Sub11_1.method1911(Static1.aClass27_1.anIntArray48, Static3.aClass4_Sub10_Sub1_1);
									Static3.aClass4_Sub10_Sub1_1.writeByteLength(Static3.aClass4_Sub10_Sub1_1.position - local5227);
									continue;
								}
								if (local45 == 5062) {
									@Pc(5259) int local5259 = local5 - 2;
									@Pc(5263) int local5263 = Static7.anIntArray571[local5259];
									@Pc(5269) int local5269 = Static7.anIntArray571[local5259 + 1];
									local5 = local5259 + 1;
									Static7.anIntArray571[local5259] = Static20.method1961(local5263).aCharArray4[local5269];
									continue;
								}
								if (local45 == 5063) {
									@Pc(5288) int local5288 = local5 - 2;
									@Pc(5292) int local5292 = Static7.anIntArray571[local5288];
									@Pc(5298) int local5298 = Static7.anIntArray571[local5288 + 1];
									local5 = local5288 + 1;
									Static7.anIntArray571[local5288] = Static20.method1961(local5292).aCharArray5[local5298];
									continue;
								}
								if (local45 == 5064) {
									@Pc(5316) int local5316 = local5 - 2;
									@Pc(5322) int local5322 = Static7.anIntArray571[local5316 + 1];
									@Pc(5326) int local5326 = Static7.anIntArray571[local5316];
									if (local5322 == -1) {
										local5 = local5316 + 1;
										Static7.anIntArray571[local5316] = -1;
									} else {
										local5 = local5316 + 1;
										Static7.anIntArray571[local5316] = Static20.method1961(local5326).method4777((char) local5322);
									}
									continue;
								}
								if (local45 == 5065) {
									@Pc(5357) int local5357 = local5 - 2;
									@Pc(5363) int local5363 = Static7.anIntArray571[local5357 + 1];
									@Pc(5367) int local5367 = Static7.anIntArray571[local5357];
									if (local5363 == -1) {
										local5 = local5357 + 1;
										Static7.anIntArray571[local5357] = -1;
									} else {
										local5 = local5357 + 1;
										Static7.anIntArray571[local5357] = Static20.method1961(local5367).method4774((char) local5363);
									}
									continue;
								}
								if (local45 == 5066) {
									@Pc(5396) int local5396 = local5 - 1;
									@Pc(5399) int local5399 = Static7.anIntArray571[local5396];
									local5 = local5396 + 1;
									Static7.anIntArray571[local5396] = Static26.method2991(local5399).method1903();
									continue;
								}
								if (local45 == 5067) {
									@Pc(5417) int local5417 = local5 - 2;
									@Pc(5421) int local5421 = Static7.anIntArray571[local5417];
									@Pc(5427) int local5427 = Static7.anIntArray571[local5417 + 1];
									@Pc(5434) int local5434 = Static26.method2991(local5421).method1905(local5427);
									local5 = local5417 + 1;
									Static7.anIntArray571[local5417] = local5434;
									continue;
								}
								if (local45 == 5068) {
									local5 -= 2;
									@Pc(5451) int local5451 = Static7.anIntArray571[local5];
									@Pc(5457) int local5457 = Static7.anIntArray571[local5 + 1];
									Static1.aClass27_1.anIntArray48[local5451] = local5457;
									continue;
								}
								if (local45 == 5069) {
									local5 -= 2;
									@Pc(5475) int local5475 = Static7.anIntArray571[local5];
									@Pc(5481) int local5481 = Static7.anIntArray571[local5 + 1];
									Static1.aClass27_1.anIntArray48[local5475] = local5481;
									continue;
								}
								if (local45 == 5070) {
									@Pc(5494) int local5494 = local5 - 3;
									@Pc(5498) int local5498 = Static7.anIntArray571[local5494];
									@Pc(5504) int local5504 = Static7.anIntArray571[local5494 + 2];
									@Pc(5510) int local5510 = Static7.anIntArray571[local5494 + 1];
									@Pc(5514) Class4_Sub3_Sub11 local5514 = Static26.method2991(local5498);
									if (local5514.method1905(local5510) != 0) {
										throw new RuntimeException("bad command");
									}
									local5 = local5494 + 1;
									Static7.anIntArray571[local5494] = local5514.method1904(local5504, local5510);
									continue;
								}
								if (local45 == 5071) {
									local13--;
									@Pc(5548) String local5548 = Static2.aStringArray5[local13];
									@Pc(5551) int local5551 = local5 - 1;
									@Pc(5560) boolean local5560 = Static7.anIntArray571[local5551] == 1;
									Static24.method2699(local5560, local5548);
									local5 = local5551 + 1;
									Static7.anIntArray571[local5551] = Static2.anInt5734;
									continue;
								}
								if (local45 == 5072) {
									if (Static7.aShortArray114 != null && Static2.anInt5734 > Static4.anInt3497) {
										Static7.anIntArray571[local5++] = Static7.aShortArray114[Static4.anInt3497++] & 0xFFFF;
										continue;
									}
									Static7.anIntArray571[local5++] = -1;
									continue;
								}
								if (local45 == 5073) {
									Static4.anInt3497 = 0;
									continue;
								}
							} else if (local45 < 5200) {
								if (local45 == 5100) {
									if (Static2.aBooleanArray4[86]) {
										Static7.anIntArray571[local5++] = 1;
									} else {
										Static7.anIntArray571[local5++] = 0;
									}
									continue;
								}
								if (local45 == 5101) {
									if (Static2.aBooleanArray4[82]) {
										Static7.anIntArray571[local5++] = 1;
									} else {
										Static7.anIntArray571[local5++] = 0;
									}
									continue;
								}
								if (local45 == 5102) {
									if (Static2.aBooleanArray4[81]) {
										Static7.anIntArray571[local5++] = 1;
									} else {
										Static7.anIntArray571[local5++] = 0;
									}
									continue;
								}
							} else if (local45 < 5300) {
								if (local45 == 5200) {
									local5--;
									Static21.method2076(Static7.anIntArray571[local5]);
									continue;
								}
								if (local45 == 5201) {
									Static7.anIntArray571[local5++] = Static21.method1997();
									continue;
								}
								if (local45 == 5205) {
									local5--;
									Static24.method2947(false, -1, -1, Static7.anIntArray571[local5]);
									continue;
								}
								if (local45 == 5206) {
									@Pc(9428) int local9428 = local5 - 1;
									@Pc(9431) int local9431 = Static7.anIntArray571[local9428];
									@Pc(9441) Class4_Sub3_Sub22 local9441 = Static19.method2394(local9431 >> 14 & 0x3FFF, local9431 & 0x3FFF);
									if (local9441 == null) {
										local5 = local9428 + 1;
										Static7.anIntArray571[local9428] = -1;
									} else {
										local5 = local9428 + 1;
										Static7.anIntArray571[local9428] = local9441.anInt5993;
									}
									continue;
								}
								if (local45 == 5207) {
									local5--;
									@Pc(9470) Class4_Sub3_Sub22 local9470 = Static20.method2405(Static7.anIntArray571[local5]);
									if (local9470 != null && local9470.aString359 != null) {
										Static2.aStringArray5[local13++] = local9470.aString359;
										continue;
									}
									Static2.aStringArray5[local13++] = "";
									continue;
								}
								if (local45 == 5208) {
									@Pc(9497) int local9497 = local5 + 1;
									Static7.anIntArray571[local5] = Static7.anInt5331;
									local5 = local9497 + 1;
									Static7.anIntArray571[local9497] = Static7.anInt5680;
									continue;
								}
								if (local45 == 5209) {
									@Pc(9512) int local9512 = local5 + 1;
									Static7.anIntArray571[local5] = Static1.anInt331 + Static3.anInt2962;
									local5 = local9512 + 1;
									Static7.anIntArray571[local9512] = Static3.anInt2961 + Static3.anInt2960 - Static7.anInt5231 - 1;
									continue;
								}
								if (local45 == 5210) {
									@Pc(9539) int local9539 = local5 - 1;
									@Pc(9542) int local9542 = Static7.anIntArray571[local9539];
									@Pc(9545) Class4_Sub3_Sub22 local9545 = Static20.method2405(local9542);
									if (local9545 == null) {
										@Pc(9570) int local9570 = local9539 + 1;
										Static7.anIntArray571[local9539] = 0;
										local5 = local9570 + 1;
										Static7.anIntArray571[local9570] = 0;
									} else {
										@Pc(9550) int local9550 = local9539 + 1;
										Static7.anIntArray571[local9539] = local9545.anInt5992 >> 14 & 0x3FFF;
										local5 = local9550 + 1;
										Static7.anIntArray571[local9550] = local9545.anInt5992 & 0x3FFF;
									}
									continue;
								}
								if (local45 == 5211) {
									@Pc(9585) int local9585 = local5 - 1;
									@Pc(9588) int local9588 = Static7.anIntArray571[local9585];
									@Pc(9591) Class4_Sub3_Sub22 local9591 = Static20.method2405(local9588);
									if (local9591 == null) {
										@Pc(9618) int local9618 = local9585 + 1;
										Static7.anIntArray571[local9585] = 0;
										local5 = local9618 + 1;
										Static7.anIntArray571[local9618] = 0;
									} else {
										@Pc(9597) int local9597 = local9585 + 1;
										Static7.anIntArray571[local9585] = local9591.anInt6002 - local9591.anInt5991;
										local5 = local9597 + 1;
										Static7.anIntArray571[local9597] = local9591.anInt6007 - local9591.anInt5996;
									}
									continue;
								}
								if (local45 == 5212) {
									@Pc(9635) Class4_Sub3_Sub7 local9635 = Static11.method492();
									if (local9635 == null) {
										@Pc(9641) int local9641 = local5 + 1;
										Static7.anIntArray571[local5] = -1;
										local5 = local9641 + 1;
										Static7.anIntArray571[local9641] = -1;
									} else {
										@Pc(9653) int local9653 = local5 + 1;
										Static7.anIntArray571[local5] = local9635.anInt1760;
										@Pc(9678) int local9678 = Static3.anInt2962 + local9635.anInt1768 << 14 | local9635.anInt1763 << 28 | Static3.anInt2961 + Static3.anInt2960 - local9635.anInt1769 - 1;
										local5 = local9653 + 1;
										Static7.anIntArray571[local9653] = local9678;
									}
									continue;
								}
								if (local45 == 5213) {
									@Pc(9692) Class4_Sub3_Sub7 local9692 = Static24.method2713();
									if (local9692 == null) {
										@Pc(9733) int local9733 = local5 + 1;
										Static7.anIntArray571[local5] = -1;
										local5 = local9733 + 1;
										Static7.anIntArray571[local9733] = -1;
									} else {
										@Pc(9697) int local9697 = local5 + 1;
										Static7.anIntArray571[local5] = local9692.anInt1760;
										@Pc(9723) int local9723 = Static3.anInt2960 + Static3.anInt2961 - local9692.anInt1769 - 1 | local9692.anInt1763 << 28 | local9692.anInt1768 + Static3.anInt2962 << 14;
										local5 = local9697 + 1;
										Static7.anIntArray571[local9697] = local9723;
									}
									continue;
								}
								if (local45 == 5214) {
									local5--;
									@Pc(9750) int local9750 = Static7.anIntArray571[local5];
									@Pc(9753) Class4_Sub3_Sub22 local9753 = Static10.method305();
									if (local9753 != null) {
										@Pc(9775) boolean local9775 = local9753.method4753(local9750 & 0x3FFF, local9750 >> 28 & 0x3, Static2.anIntArray162, local9750 >> 14 & 0x3FFF);
										if (local9775) {
											Static20.method1970(Static2.anIntArray162[1], Static2.anIntArray162[2]);
										}
									}
									continue;
								}
								if (local45 == 5215) {
									@Pc(9792) int local9792 = local5 - 2;
									@Pc(9798) int local9798 = Static7.anIntArray571[local9792 + 1];
									@Pc(9802) int local9802 = Static7.anIntArray571[local9792];
									@Pc(9812) Class175 local9812 = Static19.method2395(local9802 >> 14 & 0x3FFF, local9802 & 0x3FFF);
									@Pc(9814) boolean local9814 = false;
									for (@Pc(9819) Class4_Sub3_Sub22 local9819 = (Class4_Sub3_Sub22) local9812.method4332(); local9819 != null; local9819 = (Class4_Sub3_Sub22) local9812.method4340()) {
										if (local9819.anInt5993 == local9798) {
											local9814 = true;
											break;
										}
									}
									if (local9814) {
										local5 = local9792 + 1;
										Static7.anIntArray571[local9792] = 1;
									} else {
										local5 = local9792 + 1;
										Static7.anIntArray571[local9792] = 0;
									}
									continue;
								}
								if (local45 == 5218) {
									@Pc(9861) int local9861 = local5 - 1;
									@Pc(9864) int local9864 = Static7.anIntArray571[local9861];
									@Pc(9867) Class4_Sub3_Sub22 local9867 = Static20.method2405(local9864);
									if (local9867 == null) {
										local5 = local9861 + 1;
										Static7.anIntArray571[local9861] = -1;
									} else {
										local5 = local9861 + 1;
										Static7.anIntArray571[local9861] = local9867.anInt6006;
									}
									continue;
								}
								if (local45 == 5220) {
									Static7.anIntArray571[local5++] = Static4.anInt2644 == 100 ? 1 : 0;
									continue;
								}
								if (local45 == 5221) {
									local5--;
									@Pc(9912) int local9912 = Static7.anIntArray571[local5];
									Static20.method1970(local9912 >> 14 & 0x3FFF, local9912 & 0x3FFF);
									continue;
								}
								if (local45 == 5222) {
									@Pc(9933) Class4_Sub3_Sub22 local9933 = Static10.method305();
									if (local9933 == null) {
										@Pc(9938) int local9938 = local5 + 1;
										Static7.anIntArray571[local5] = -1;
										local5 = local9938 + 1;
										Static7.anIntArray571[local9938] = -1;
									} else {
										@Pc(9963) boolean local9963 = local9933.method4758(Static3.anInt2962 + Static1.anInt331, Static3.anInt2960 + Static3.anInt2961 - Static7.anInt5231 - 1, Static2.anIntArray162);
										if (local9963) {
											@Pc(9980) int local9980 = local5 + 1;
											Static7.anIntArray571[local5] = Static2.anIntArray162[1];
											local5 = local9980 + 1;
											Static7.anIntArray571[local9980] = Static2.anIntArray162[2];
										} else {
											@Pc(9968) int local9968 = local5 + 1;
											Static7.anIntArray571[local5] = -1;
											local5 = local9968 + 1;
											Static7.anIntArray571[local9968] = -1;
										}
									}
									continue;
								}
								if (local45 == 5223) {
									local5 -= 2;
									@Pc(10003) int local10003 = Static7.anIntArray571[local5 + 1];
									@Pc(10007) int local10007 = Static7.anIntArray571[local5];
									Static24.method2947(false, local10003 & 0x3FFF, local10003 >> 14 & 0x3FFF, local10007);
									continue;
								}
								if (local45 == 5224) {
									@Pc(10031) int local10031 = local5 - 1;
									@Pc(10034) int local10034 = Static7.anIntArray571[local10031];
									@Pc(10039) Class4_Sub3_Sub22 local10039 = Static10.method305();
									if (local10039 == null) {
										@Pc(10045) int local10045 = local10031 + 1;
										Static7.anIntArray571[local10031] = -1;
										local5 = local10045 + 1;
										Static7.anIntArray571[local10045] = -1;
									} else {
										@Pc(10072) boolean local10072 = local10039.method4753(local10034 & 0x3FFF, local10034 >> 28 & 0x3, Static2.anIntArray162, local10034 >> 14 & 0x3FFF);
										if (local10072) {
											@Pc(10077) int local10077 = local10031 + 1;
											Static7.anIntArray571[local10031] = Static2.anIntArray162[1];
											local5 = local10077 + 1;
											Static7.anIntArray571[local10077] = Static2.anIntArray162[2];
										} else {
											@Pc(10093) int local10093 = local10031 + 1;
											Static7.anIntArray571[local10031] = -1;
											local5 = local10093 + 1;
											Static7.anIntArray571[local10093] = -1;
										}
									}
									continue;
								}
								if (local45 == 5225) {
									@Pc(10109) int local10109 = local5 - 1;
									@Pc(10112) int local10112 = Static7.anIntArray571[local10109];
									@Pc(10115) Class4_Sub3_Sub22 local10115 = Static10.method305();
									if (local10115 == null) {
										@Pc(10164) int local10164 = local10109 + 1;
										Static7.anIntArray571[local10109] = -1;
										local5 = local10164 + 1;
										Static7.anIntArray571[local10164] = -1;
									} else {
										@Pc(10131) boolean local10131 = local10115.method4758(local10112 >> 14 & 0x3FFF, local10112 & 0x3FFF, Static2.anIntArray162);
										if (local10131) {
											@Pc(10136) int local10136 = local10109 + 1;
											Static7.anIntArray571[local10109] = Static2.anIntArray162[1];
											local5 = local10136 + 1;
											Static7.anIntArray571[local10136] = Static2.anIntArray162[2];
										} else {
											@Pc(10152) int local10152 = local10109 + 1;
											Static7.anIntArray571[local10109] = -1;
											local5 = local10152 + 1;
											Static7.anIntArray571[local10152] = -1;
										}
									}
									continue;
								}
								if (local45 == 5226) {
									local5--;
									Static31.method3661(Static7.anIntArray571[local5]);
									continue;
								}
								if (local45 == 5227) {
									local5 -= 2;
									@Pc(10196) int local10196 = Static7.anIntArray571[local5];
									@Pc(10202) int local10202 = Static7.anIntArray571[local5 + 1];
									Static24.method2947(true, local10202 & 0x3FFF, local10202 >> 14 & 0x3FFF, local10196);
									continue;
								}
								if (local45 == 5228) {
									local5--;
									Static6.aBoolean317 = Static7.anIntArray571[local5] == 1;
									continue;
								}
								if (local45 == 5229) {
									Static7.anIntArray571[local5++] = Static6.aBoolean317 ? 1 : 0;
									continue;
								}
								if (local45 == 5230) {
									local5--;
									@Pc(10262) int local10262 = Static7.anIntArray571[local5];
									Static37.method4641(local10262);
									continue;
								}
								if (local45 == 5231) {
									local5 -= 2;
									@Pc(10276) int local10276 = Static7.anIntArray571[local5];
									@Pc(10289) boolean local10289 = Static7.anIntArray571[local5 + 1] == 1;
									if (Static3.aClass84_9 == null) {
										continue;
									}
									@Pc(10299) Node local10299 = Static3.aClass84_9.method1844((long) local10276);
									if (local10299 != null && !local10289) {
										local10299.unlink();
										continue;
									}
									if (local10299 == null && local10289) {
										@Pc(10313) Node local10313 = new Node();
										Static3.aClass84_9.method1840(local10313, (long) local10276);
									}
									continue;
								}
								if (local45 == 5232) {
									@Pc(10331) int local10331 = local5 - 1;
									@Pc(10334) int local10334 = Static7.anIntArray571[local10331];
									if (Static3.aClass84_9 == null) {
										local5 = local10331 + 1;
										Static7.anIntArray571[local10331] = 0;
									} else {
										@Pc(10350) Node local10350 = Static3.aClass84_9.method1844((long) local10334);
										local5 = local10331 + 1;
										Static7.anIntArray571[local10331] = local10350 == null ? 0 : 1;
									}
									continue;
								}
								if (local45 == 5233) {
									local5 -= 2;
									@Pc(10369) int local10369 = Static7.anIntArray571[local5];
									@Pc(10380) boolean local10380 = Static7.anIntArray571[local5 + 1] == 1;
									if (Static3.aClass84_10 == null) {
										continue;
									}
									@Pc(10389) Node local10389 = Static3.aClass84_10.method1844((long) local10369);
									if (local10389 != null && !local10380) {
										local10389.unlink();
										continue;
									}
									if (local10389 == null && local10380) {
										@Pc(10403) Node local10403 = new Node();
										Static3.aClass84_10.method1840(local10403, (long) local10369);
									}
									continue;
								}
								if (local45 == 5234) {
									@Pc(10425) int local10425 = local5 - 1;
									@Pc(10428) int local10428 = Static7.anIntArray571[local10425];
									if (Static3.aClass84_10 == null) {
										local5 = local10425 + 1;
										Static7.anIntArray571[local10425] = 0;
									} else {
										@Pc(10444) Node local10444 = Static3.aClass84_10.method1844((long) local10428);
										local5 = local10425 + 1;
										Static7.anIntArray571[local10425] = local10444 == null ? 0 : 1;
									}
									continue;
								}
								if (local45 == 5235) {
									Static7.anIntArray571[local5++] = Static3.aClass4_Sub3_Sub22_3 == null ? -1 : Static3.aClass4_Sub3_Sub22_3.anInt5993;
									continue;
								}
							} else if (local45 < 5400) {
								if (local45 == 5300) {
									@Pc(5696) int local5696 = local5 - 2;
									@Pc(5700) int local5700 = Static7.anIntArray571[local5696];
									@Pc(5706) int local5706 = Static7.anIntArray571[local5696 + 1];
									Static35.method4512(false, 3, local5700, local5706);
									local5 = local5696 + 1;
									Static7.anIntArray571[local5696] = GameShell.fullScreenFrame == null ? 0 : 1;
									continue;
								}
								if (local45 == 5301) {
									if (GameShell.fullScreenFrame != null) {
										Static35.method4512(false, Static5.anInt3637, -1, -1);
									}
									continue;
								}
								if (local45 == 5302) {
									@Pc(5750) Class169[] local5750 = Static25.method2725();
									Static7.anIntArray571[local5++] = local5750.length;
									continue;
								}
								if (local45 == 5303) {
									@Pc(5766) int local5766 = local5 - 1;
									@Pc(5769) int local5769 = Static7.anIntArray571[local5766];
									@Pc(5772) Class169[] local5772 = Static25.method2725();
									Static7.anIntArray571[local5766++] = local5772[local5769].anInt5276;
									local5 = local5766 + 1;
									Static7.anIntArray571[local5766] = local5772[local5769].anInt5275;
									continue;
								}
								if (local45 == 5305) {
									@Pc(5796) int local5796 = Static4.anInt3403;
									@Pc(5798) int local5798 = Static3.anInt2627;
									@Pc(5800) int local5800 = -1;
									@Pc(5803) Class169[] local5803 = Static25.method2725();
									for (@Pc(5805) int local5805 = 0; local5805 < local5803.length; local5805++) {
										@Pc(5813) Class169 local5813 = local5803[local5805];
										if (local5813.anInt5276 == local5796 && local5813.anInt5275 == local5798) {
											local5800 = local5805;
											break;
										}
									}
									Static7.anIntArray571[local5++] = local5800;
									continue;
								}
								if (local45 == 5306) {
									Static7.anIntArray571[local5++] = Static11.method557();
									continue;
								}
								if (local45 == 5307) {
									local5--;
									@Pc(5862) int local5862 = Static7.anIntArray571[local5];
									if (local5862 < 0 || local5862 > 2) {
										local5862 = 0;
									}
									Static35.method4512(false, local5862, -1, -1);
									continue;
								}
								if (local45 == 5308) {
									Static7.anIntArray571[local5++] = Static5.anInt3637;
									continue;
								}
								if (local45 == 5309) {
									local5--;
									@Pc(5907) int local5907 = Static7.anIntArray571[local5];
									if (local5907 < 0 || local5907 > 2) {
										local5907 = 0;
									}
									Static5.anInt3637 = local5907;
									Static14.method1055(GameShell.signLink);
									continue;
								}
							} else if (local45 < 5500) {
								if (local45 == 5400) {
									local13 -= 2;
									@Pc(8724) String local8724 = Static2.aStringArray5[local13 + 1];
									local5--;
									@Pc(8729) int local8729 = Static7.anIntArray571[local5];
									@Pc(8733) String local8733 = Static2.aStringArray5[local13];
									Static3.aClass4_Sub10_Sub1_1.writeOpcode(243);
									Static3.aClass4_Sub10_Sub1_1.writeByte(Static19.method1791(local8733) + Static19.method1791(local8724) + 1);
									Static3.aClass4_Sub10_Sub1_1.writeString(local8733);
									Static3.aClass4_Sub10_Sub1_1.writeString(local8724);
									Static3.aClass4_Sub10_Sub1_1.writeByte(local8729);
									continue;
								}
								if (local45 == 5401) {
									local5 -= 2;
									Static7.aShortArray124[Static7.anIntArray571[local5]] = (short) Static28.method3276(Static7.anIntArray571[local5 + 1]);
									Static22.method2413();
									Static9.method198();
									Static19.method4376();
									Static13.method1010();
									Static13.method933();
									continue;
								}
								if (local45 == 5405) {
									local5 -= 2;
									@Pc(8807) int local8807 = Static7.anIntArray571[local5];
									@Pc(8813) int local8813 = Static7.anIntArray571[local5 + 1];
									if (local8807 >= 0 && local8807 < 2) {
										Static1.anIntArrayArrayArray1[local8807] = new int[local8813 << 1][4];
									}
									continue;
								}
								if (local45 == 5406) {
									local5 -= 7;
									@Pc(8846) int local8846 = Static7.anIntArray571[local5 + 1] << 1;
									@Pc(8850) int local8850 = Static7.anIntArray571[local5];
									@Pc(8856) int local8856 = Static7.anIntArray571[local5 + 3];
									@Pc(8862) int local8862 = Static7.anIntArray571[local5 + 2];
									@Pc(8868) int local8868 = Static7.anIntArray571[local5 + 4];
									@Pc(8874) int local8874 = Static7.anIntArray571[local5 + 5];
									@Pc(8880) int local8880 = Static7.anIntArray571[local5 + 6];
									if (local8850 >= 0 && local8850 < 2 && Static1.anIntArrayArrayArray1[local8850] != null && local8846 >= 0 && Static1.anIntArrayArrayArray1[local8850].length > local8846) {
										Static1.anIntArrayArrayArray1[local8850][local8846] = new int[] { (local8862 >> 14 & 0x3FFF) * 128, local8856, (local8862 & 0x3FFF) * 128, local8880 };
										Static1.anIntArrayArrayArray1[local8850][local8846 + 1] = new int[] { (local8868 >> 14 & 0x3FFF) * 128, local8874, (local8868 & 0x3FFF) * 128 };
									}
									continue;
								}
								if (local45 == 5407) {
									@Pc(8979) int local8979 = local5 - 1;
									@Pc(8986) int local8986 = Static1.anIntArrayArrayArray1[Static7.anIntArray571[local8979]].length >> 1;
									local5 = local8979 + 1;
									Static7.anIntArray571[local8979] = local8986;
									continue;
								}
								if (local45 == 5411) {
									if (GameShell.fullScreenFrame != null) {
										Static35.method4512(false, Static5.anInt3637, -1, -1);
									}
									if (GameShell.frame == null) {
										Static37.method4719(Static36.method4436(), false);
									} else {
										System.exit(0);
									}
									continue;
								}
								if (local45 == 5419) {
									@Pc(9027) String local9027 = "";
									if (Static1.aClass197_2 != null) {
										if (Static1.aClass197_2.result == null) {
											local9027 = Static27.method3226(Static1.aClass197_2.intArg1);
										} else {
											local9027 = (String) Static1.aClass197_2.result;
										}
									}
									Static2.aStringArray5[local13++] = local9027;
									continue;
								}
								if (local45 == 5420) {
									Static7.anIntArray571[local5++] = SignLink.anInt6106 == 3 ? 1 : 0;
									continue;
								}
								if (local45 == 5421) {
									if (GameShell.fullScreenFrame != null) {
										Static35.method4512(false, Static5.anInt3637, -1, -1);
									}
									local13--;
									@Pc(9090) String local9090 = Static2.aStringArray5[local13];
									local5--;
									@Pc(9100) boolean local9100 = Static7.anIntArray571[local5] == 1;
									@Pc(9110) String local9110 = Static36.method4436() + local9090;
									if (GameShell.frame != null || local9100 && SignLink.anInt6106 != 3 && SignLink.osName.startsWith("win") && !client.haveIe6) {
										Static6.aString269 = local9110;
										Static4.aBoolean206 = local9100;
										Static1.aClass197_1 = GameShell.signLink.openUrl(local9110);
										continue;
									}
									Static37.method4719(local9110, local9100);
									continue;
								}
								if (local45 == 5422) {
									local13 -= 2;
									@Pc(9150) String local9150 = Static2.aStringArray5[local13];
									@Pc(9156) String local9156 = Static2.aStringArray5[local13 + 1];
									local5--;
									@Pc(9161) int local9161 = Static7.anIntArray571[local5];
									if (local9150.length() > 0) {
										if (Static7.aStringArray38 == null) {
											Static7.aStringArray38 = new String[Static5.anIntArray681[client.game]];
										}
										Static7.aStringArray38[local9161] = local9150;
									}
									if (local9156.length() > 0) {
										if (Static2.aStringArray42 == null) {
											Static2.aStringArray42 = new String[Static5.anIntArray681[client.game]];
										}
										Static2.aStringArray42[local9161] = local9156;
									}
									continue;
								}
								if (local45 == 5423) {
									local13--;
									System.out.println(Static2.aStringArray5[local13]);
									continue;
								}
								if (local45 == 5424) {
									local5 -= 11;
									Static5.anInt4293 = Static7.anIntArray571[local5];
									Static3.anInt2587 = Static7.anIntArray571[local5 + 1];
									Static1.anInt497 = Static7.anIntArray571[local5 + 2];
									Static3.anInt2586 = Static7.anIntArray571[local5 + 3];
									Static1.anInt771 = Static7.anIntArray571[local5 + 4];
									Static4.anInt3336 = Static7.anIntArray571[local5 + 5];
									Static1.anInt593 = Static7.anIntArray571[local5 + 6];
									Static4.anInt2741 = Static7.anIntArray571[local5 + 7];
									Static1.anInt881 = Static7.anIntArray571[local5 + 8];
									Static1.anInt504 = Static7.anIntArray571[local5 + 9];
									Static4.anInt2920 = Static7.anIntArray571[local5 + 10];
									Static1.aClass58_4.method1359(Static1.anInt771);
									Static1.aClass58_4.method1359(Static4.anInt3336);
									Static1.aClass58_4.method1359(Static1.anInt593);
									Static1.aClass58_4.method1359(Static4.anInt2741);
									Static1.aClass58_4.method1359(Static1.anInt881);
									Static7.aBoolean389 = true;
									continue;
								}
								if (local45 == 5425) {
									Static36.method4447();
									Static7.aBoolean389 = false;
									continue;
								}
								if (local45 == 5426) {
									local5--;
									Static4.anInt3407 = Static7.anIntArray571[local5];
									continue;
								}
								if (local45 == 5427) {
									local5 -= 2;
									Static2.anInt1937 = Static7.anIntArray571[local5];
									Static3.anInt2232 = Static7.anIntArray571[local5 + 1];
									continue;
								}
								if (local45 == 5428) {
									@Pc(9351) int local9351 = local5 - 2;
									@Pc(9357) int local9357 = Static7.anIntArray571[local9351 + 1];
									@Pc(9361) int local9361 = Static7.anIntArray571[local9351];
									local5 = local9351 + 1;
									Static7.anIntArray571[local9351] = Static14.method1176(local9361, local9357) ? 1 : 0;
									continue;
								}
							} else if (local45 < 5600) {
								if (local45 == 5500) {
									local5 -= 4;
									@Pc(8424) int local8424 = Static7.anIntArray571[local5];
									@Pc(8430) int local8430 = Static7.anIntArray571[local5 + 1];
									@Pc(8436) int local8436 = Static7.anIntArray571[local5 + 2];
									@Pc(8442) int local8442 = Static7.anIntArray571[local5 + 3];
									Static37.method4773(local8436, (local8424 >> 14 & 0x3FFF) - Static5.anInt3983, local8442, local8430, false, (local8424 & 0x3FFF) - Static7.anInt5479);
									continue;
								}
								if (local45 == 5501) {
									local5 -= 4;
									@Pc(8472) int local8472 = Static7.anIntArray571[local5];
									@Pc(8478) int local8478 = Static7.anIntArray571[local5 + 1];
									@Pc(8484) int local8484 = Static7.anIntArray571[local5 + 2];
									@Pc(8490) int local8490 = Static7.anIntArray571[local5 + 3];
									Static23.method2536(local8478, local8484, (local8472 >> 14 & 0x3FFF) - Static5.anInt3983, (local8472 & 0x3FFF) - Static7.anInt5479, local8490);
									continue;
								}
								if (local45 == 5502) {
									local5 -= 6;
									@Pc(8521) int local8521 = Static7.anIntArray571[local5];
									if (local8521 >= 2) {
										throw new RuntimeException();
									}
									Static5.anInt5195 = local8521;
									@Pc(8539) int local8539 = Static7.anIntArray571[local5 + 1];
									if (Static1.anIntArrayArrayArray1[Static5.anInt5195].length >> 1 <= local8539 + 1) {
										throw new RuntimeException();
									}
									Static2.anInt915 = 0;
									Static6.anInt4384 = local8539;
									Static7.anInt5946 = Static7.anIntArray571[local5 + 2];
									Static2.anInt1165 = Static7.anIntArray571[local5 + 3];
									@Pc(8575) int local8575 = Static7.anIntArray571[local5 + 4];
									if (local8575 >= 2) {
										throw new RuntimeException();
									}
									Static4.anInt3024 = local8575;
									@Pc(8591) int local8591 = Static7.anIntArray571[local5 + 5];
									if (Static1.anIntArrayArrayArray1[Static4.anInt3024].length >> 1 <= local8591 + 1) {
										throw new RuntimeException();
									}
									Static1.anInt772 = 3;
									Static1.anInt126 = local8591;
									continue;
								}
								if (local45 == 5503) {
									Static24.method2563();
									continue;
								}
								if (local45 == 5504) {
									local5 -= 2;
									Static17.method1654(Static7.anIntArray571[local5], Static7.anIntArray571[local5 + 1]);
									continue;
								}
								if (local45 == 5505) {
									Static7.anIntArray571[local5++] = (int) Static5.aFloat147;
									continue;
								}
								if (local45 == 5506) {
									Static7.anIntArray571[local5++] = (int) Static5.aFloat97;
									continue;
								}
								if (local45 == 5507) {
									Static21.method2007();
									continue;
								}
								if (local45 == 5508) {
									Static26.method2973();
									continue;
								}
								if (local45 == 5509) {
									Static20.method1924();
									continue;
								}
								if (local45 == 5510) {
									Static33.method3007();
									continue;
								}
								if (local45 == 5512) {
									Static8.method11();
									continue;
								}
							} else if (local45 < 5700) {
								if (local45 == 5600) {
									local13 -= 2;
									local5--;
									@Pc(5950) int local5950 = Static7.anIntArray571[local5];
									@Pc(5954) String local5954 = Static2.aStringArray5[local13];
									@Pc(5960) String local5960 = Static2.aStringArray5[local13 + 1];
									if (Static4.anInt3304 == 10 && Static6.anInt5117 == 0 && Static3.anInt2574 == 0 && Static6.anInt4759 == 0 && Static7.anInt5319 == 0) {
										Static30.method3615(local5960, local5954, local5950);
									}
									continue;
								}
								if (local45 == 5601) {
									Static15.method4619();
									continue;
								}
								if (local45 == 5602) {
									if (Static3.anInt2574 == 0) {
										Static2.anInt1641 = -2;
									}
									continue;
								}
								if (local45 == 5603) {
									local5 -= 4;
									if (Static4.anInt3304 == 10 && Static6.anInt5117 == 0 && Static3.anInt2574 == 0 && Static6.anInt4759 == 0 && Static7.anInt5319 == 0) {
										Static35.method4339(Static7.anIntArray571[local5 + 2], Static7.anIntArray571[local5 + 3], Static7.anIntArray571[local5 + 1], Static7.anIntArray571[local5]);
									}
									continue;
								}
								if (local45 == 5604) {
									local13--;
									if (Static4.anInt3304 == 10 && Static6.anInt5117 == 0 && Static3.anInt2574 == 0 && Static6.anInt4759 == 0 && Static7.anInt5319 == 0) {
										Static8.method13(Static18.method1746(Static2.aStringArray5[local13]));
									}
									continue;
								}
								if (local45 == 5605) {
									local5 -= 7;
									local13 -= 3;
									if (Static4.anInt3304 == 10 && Static6.anInt5117 == 0 && Static3.anInt2574 == 0 && Static6.anInt4759 == 0 && Static7.anInt5319 == 0) {
										Static30.method3553(Static7.anIntArray571[local5 + 6] == 1, Static7.anIntArray571[local5], Static7.anIntArray571[local5 + 4] == 1, Static7.anIntArray571[local5 + 3], Static2.aStringArray5[local13 + 2], Static7.anIntArray571[local5 + 1], Static7.anIntArray571[local5 + 2], Static18.method1746(Static2.aStringArray5[local13]), Static7.anIntArray571[local5 + 5] == 1, Static2.aStringArray5[local13 + 1]);
									}
									continue;
								}
								if (local45 == 5606) {
									if (Static6.anInt4759 == 0) {
										Static6.anInt5173 = -2;
									}
									continue;
								}
								if (local45 == 5607) {
									Static7.anIntArray571[local5++] = Static2.anInt1641;
									continue;
								}
								if (local45 == 5608) {
									Static7.anIntArray571[local5++] = Static3.anInt2582;
									continue;
								}
								if (local45 == 5609) {
									Static7.anIntArray571[local5++] = Static6.anInt5173;
									continue;
								}
								if (local45 == 5610) {
									for (@Pc(6245) int local6245 = 0; local6245 < 5; local6245++) {
										Static2.aStringArray5[local13++] = Static2.aStringArray8.length > local6245 ? Static29.method3464(Static2.aStringArray8[local6245]) : "";
									}
									Static2.aStringArray8 = null;
									continue;
								}
								if (local45 == 5611) {
									Static7.anIntArray571[local5++] = Static5.anInt4324;
									continue;
								}
							} else if (local45 < 6100) {
								if (local45 == 6001) {
									local5--;
									@Pc(6301) int local6301 = Static7.anIntArray571[local5];
									if (local6301 < 1) {
										local6301 = 1;
									}
									if (local6301 > 4) {
										local6301 = 4;
									}
									Static1.anInt185 = local6301;
									if (!Static3.aBoolean138 || !Static2.aBoolean66) {
										if (Static1.anInt185 == 1) {
											Static23.method2539(0.9F);
										}
										if (Static1.anInt185 == 2) {
											Static23.method2539(0.8F);
										}
										if (Static1.anInt185 == 3) {
											Static23.method2539(0.7F);
										}
										if (Static1.anInt185 == 4) {
											Static23.method2539(0.6F);
										}
									}
									if (Static3.aBoolean138) {
										Static17.method1655();
										if (!Static2.aBoolean66) {
											Static36.method4455();
										}
									}
									Static9.method198();
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6002) {
									local5--;
									Static35.method665(Static7.anIntArray571[local5] == 1);
									Static30.method3599();
									Static36.method4455();
									method2014();
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6003) {
									local5--;
									Static4.aBoolean398 = Static7.anIntArray571[local5] == 1;
									method2014();
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6005) {
									local5--;
									Static3.aBoolean159 = Static7.anIntArray571[local5] == 1;
									Static36.method4455();
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6006) {
									local5--;
									Static6.aBoolean227 = Static7.anIntArray571[local5] == 1;
									((Class24_Sub1) Static4.anInterface4_1).method457(!Static6.aBoolean227);
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6007) {
									local5--;
									Static2.aBoolean117 = Static7.anIntArray571[local5] == 1;
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6008) {
									local5--;
									Static7.aBoolean421 = Static7.anIntArray571[local5] == 1;
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6009) {
									local5--;
									Static1.aBoolean27 = Static7.anIntArray571[local5] == 1;
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6010) {
									local5--;
									Static2.aBoolean75 = Static7.anIntArray571[local5] == 1;
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6011) {
									local5--;
									@Pc(6587) int local6587 = Static7.anIntArray571[local5];
									if (local6587 < 0 || local6587 > 2) {
										local6587 = 0;
									}
									Static3.anInt2298 = local6587;
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6012) {
									if (Static3.aBoolean138) {
										Static24.method2652(0, 0);
									}
									local5--;
									Static2.aBoolean66 = Static7.anIntArray571[local5] == 1;
									if (Static3.aBoolean138 && Static2.aBoolean66) {
										Static23.method2539(0.7F);
									} else {
										if (Static1.anInt185 == 1) {
											Static23.method2539(0.9F);
										}
										if (Static1.anInt185 == 2) {
											Static23.method2539(0.8F);
										}
										if (Static1.anInt185 == 3) {
											Static23.method2539(0.7F);
										}
										if (Static1.anInt185 == 4) {
											Static23.method2539(0.6F);
										}
									}
									Static36.method4455();
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6014) {
									local5--;
									Static7.aBoolean393 = Static7.anIntArray571[local5] == 1;
									if (Static3.aBoolean138) {
										Static36.method4455();
									}
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6015) {
									local5--;
									Static7.aBoolean362 = Static7.anIntArray571[local5] == 1;
									if (Static3.aBoolean138) {
										Static17.method1655();
									}
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6016) {
									local5--;
									@Pc(6730) int local6730 = Static7.anIntArray571[local5];
									if (Static3.aBoolean138) {
										GameShell.replaceCanvas = true;
									}
									if (local6730 < 0 || local6730 > 2) {
										local6730 = 0;
									}
									Static2.anInt1125 = local6730;
									continue;
								}
								if (local45 == 6017) {
									local5--;
									Static7.aBoolean122 = Static7.anIntArray571[local5] == 1;
									Static9.method199();
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6018) {
									local5--;
									@Pc(6779) int local6779 = Static7.anIntArray571[local5];
									if (local6779 < 0) {
										local6779 = 0;
									}
									if (local6779 > 127) {
										local6779 = 127;
									}
									Static4.anInt3315 = local6779;
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6019) {
									local5--;
									@Pc(6806) int local6806 = Static7.anIntArray571[local5];
									if (local6806 < 0) {
										local6806 = 0;
									}
									if (local6806 > 255) {
										local6806 = 255;
									}
									if (Static1.anInt344 != local6806) {
										if (Static1.anInt344 == 0 && Static6.anInt4844 != -1) {
											Static28.method3251(local6806, Static6.anInt4844, Static7.aClass58_98);
											Static4.aBoolean210 = false;
										} else if (local6806 == 0) {
											Static37.method4718();
											Static4.aBoolean210 = false;
										} else {
											Static29.method3541(local6806);
										}
										Static1.anInt344 = local6806;
									}
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6020) {
									local5--;
									@Pc(6882) int local6882 = Static7.anIntArray571[local5];
									if (local6882 < 0) {
										local6882 = 0;
									}
									if (local6882 > 127) {
										local6882 = 127;
									}
									Static5.anInt4120 = local6882;
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									continue;
								}
								if (local45 == 6021) {
									local5--;
									Static2.aBoolean119 = Static7.anIntArray571[local5] == 1;
									method2014();
									continue;
								}
								if (local45 == 6023) {
									@Pc(6933) boolean local6933 = false;
									@Pc(6935) int local6935 = local5 - 1;
									@Pc(6938) int local6938 = Static7.anIntArray571[local6935];
									if (local6938 < 0) {
										local6938 = 0;
									}
									if (local6938 > 2) {
										local6938 = 2;
									}
									if (Static4.anInt3256 < 96) {
										local6938 = 0;
										local6933 = true;
									}
									Static26.method2957(local6938);
									Static14.method1055(GameShell.signLink);
									Static2.aBoolean104 = false;
									local5 = local6935 + 1;
									Static7.anIntArray571[local6935] = local6933 ? 0 : 1;
									continue;
								}
								if (local45 == 6024) {
									local5--;
									@Pc(6985) int local6985 = Static7.anIntArray571[local5];
									if (local6985 < 0 || local6985 > 2) {
										local6985 = 0;
									}
									Static1.anInt1051 = local6985;
									Static14.method1055(GameShell.signLink);
									continue;
								}
								if (local45 == 6027) {
									local5--;
									@Pc(7015) int local7015 = Static7.anIntArray571[local5];
									if (!Static3.aBoolean138) {
										continue;
									}
									if (local7015 < 0 || local7015 > 1) {
										local7015 = 0;
									}
									Static10.method300(local7015 == 1);
									continue;
								}
								if (local45 == 6028) {
									local5--;
									Static2.aBoolean69 = Static7.anIntArray571[local5] != 0;
									Static14.method1055(GameShell.signLink);
									continue;
								}
							} else if (local45 < 6200) {
								if (local45 == 6101) {
									Static7.anIntArray571[local5++] = Static1.anInt185;
									continue;
								}
								if (local45 == 6102) {
									Static7.anIntArray571[local5++] = Static10.method456() ? 1 : 0;
									continue;
								}
								if (local45 == 6103) {
									Static7.anIntArray571[local5++] = Static4.aBoolean398 ? 1 : 0;
									continue;
								}
								if (local45 == 6105) {
									Static7.anIntArray571[local5++] = Static3.aBoolean159 ? 1 : 0;
									continue;
								}
								if (local45 == 6106) {
									Static7.anIntArray571[local5++] = Static6.aBoolean227 ? 1 : 0;
									continue;
								}
								if (local45 == 6107) {
									Static7.anIntArray571[local5++] = Static2.aBoolean117 ? 1 : 0;
									continue;
								}
								if (local45 == 6108) {
									Static7.anIntArray571[local5++] = Static7.aBoolean421 ? 1 : 0;
									continue;
								}
								if (local45 == 6109) {
									Static7.anIntArray571[local5++] = Static1.aBoolean27 ? 1 : 0;
									continue;
								}
								if (local45 == 6110) {
									Static7.anIntArray571[local5++] = Static2.aBoolean75 ? 1 : 0;
									continue;
								}
								if (local45 == 6111) {
									Static7.anIntArray571[local5++] = Static3.anInt2298;
									continue;
								}
								if (local45 == 6112) {
									Static7.anIntArray571[local5++] = Static2.aBoolean66 ? 1 : 0;
									continue;
								}
								if (local45 == 6114) {
									Static7.anIntArray571[local5++] = Static7.aBoolean393 ? 1 : 0;
									continue;
								}
								if (local45 == 6115) {
									Static7.anIntArray571[local5++] = Static7.aBoolean362 ? 1 : 0;
									continue;
								}
								if (local45 == 6116) {
									Static7.anIntArray571[local5++] = Static2.anInt1125;
									continue;
								}
								if (local45 == 6117) {
									Static7.anIntArray571[local5++] = Static7.aBoolean122 ? 1 : 0;
									continue;
								}
								if (local45 == 6118) {
									Static7.anIntArray571[local5++] = Static4.anInt3315;
									continue;
								}
								if (local45 == 6119) {
									Static7.anIntArray571[local5++] = Static1.anInt344;
									continue;
								}
								if (local45 == 6120) {
									Static7.anIntArray571[local5++] = Static5.anInt4120;
									continue;
								}
								if (local45 == 6121) {
									if (Static3.aBoolean138) {
										Static7.anIntArray571[local5++] = Static3.aBoolean130 ? 1 : 0;
									} else {
										Static7.anIntArray571[local5++] = 0;
									}
									continue;
								}
								if (local45 == 6123) {
									Static7.anIntArray571[local5++] = Static26.method2954();
									continue;
								}
								if (local45 == 6124) {
									Static7.anIntArray571[local5++] = Static1.anInt1051;
									continue;
								}
								if (local45 == 6126) {
									if (Static3.aBoolean138) {
										Static7.anIntArray571[local5++] = Static13.method877() ? 1 : 0;
									} else {
										Static7.anIntArray571[local5++] = 0;
									}
									continue;
								}
								if (local45 == 6127) {
									Static7.anIntArray571[local5++] = Static7.aBoolean390 ? 1 : 0;
									continue;
								}
								if (local45 == 6128) {
									Static7.anIntArray571[local5++] = Static2.aBoolean69 ? 1 : 0;
									continue;
								}
							} else if (local45 < 6300) {
								if (local45 == 6200) {
									local5 -= 2;
									Static7.aShort45 = (short) Static7.anIntArray571[local5];
									if (Static7.aShort45 <= 0) {
										Static7.aShort45 = 256;
									}
									Static4.aShort25 = (short) Static7.anIntArray571[local5 + 1];
									if (Static4.aShort25 <= 0) {
										Static4.aShort25 = 205;
									}
									continue;
								}
								if (local45 == 6201) {
									local5 -= 2;
									Static3.aShort13 = (short) Static7.anIntArray571[local5];
									if (Static3.aShort13 <= 0) {
										Static3.aShort13 = 256;
									}
									Static3.aShort12 = (short) Static7.anIntArray571[local5 + 1];
									if (Static3.aShort12 <= 0) {
										Static3.aShort12 = 320;
									}
									continue;
								}
								if (local45 == 6202) {
									local5 -= 4;
									Static4.aShort18 = (short) Static7.anIntArray571[local5];
									if (Static4.aShort18 <= 0) {
										Static4.aShort18 = 1;
									}
									Static1.aShort1 = (short) Static7.anIntArray571[local5 + 1];
									if (Static1.aShort1 <= 0) {
										Static1.aShort1 = 32767;
									} else if (Static4.aShort18 > Static1.aShort1) {
										Static1.aShort1 = Static4.aShort18;
									}
									Static1.aShort9 = (short) Static7.anIntArray571[local5 + 2];
									if (Static1.aShort9 <= 0) {
										Static1.aShort9 = 1;
									}
									Static7.aShort11 = (short) Static7.anIntArray571[local5 + 3];
									if (Static7.aShort11 <= 0) {
										Static7.aShort11 = 32767;
									} else if (Static1.aShort9 > Static7.aShort11) {
										Static7.aShort11 = Static1.aShort9;
									}
									continue;
								}
								if (local45 == 6203) {
									Static32.method3924(0, false, Static3.aClass185_5.anInt5949, 0, Static3.aClass185_5.anInt5893);
									@Pc(8371) int local8371 = local5 + 1;
									Static7.anIntArray571[local5] = Static6.anInt4546;
									local5 = local8371 + 1;
									Static7.anIntArray571[local8371] = Static2.anInt1333;
									continue;
								}
								if (local45 == 6204) {
									@Pc(8387) int local8387 = local5 + 1;
									Static7.anIntArray571[local5] = Static3.aShort13;
									local5 = local8387 + 1;
									Static7.anIntArray571[local8387] = Static3.aShort12;
									continue;
								}
								if (local45 == 6205) {
									@Pc(8404) int local8404 = local5 + 1;
									Static7.anIntArray571[local5] = Static7.aShort45;
									local5 = local8404 + 1;
									Static7.anIntArray571[local8404] = Static4.aShort25;
									continue;
								}
							} else if (local45 < 6400) {
								if (local45 == 6300) {
									Static7.anIntArray571[local5++] = (int) (MonotonicClock.currentTimeMillis() / 60000L);
									continue;
								}
								if (local45 == 6301) {
									Static7.anIntArray571[local5++] = (int) (MonotonicClock.currentTimeMillis() / 86400000L) - 11745;
									continue;
								}
								if (local45 == 6302) {
									@Pc(7466) int local7466 = local5 - 3;
									@Pc(7470) int local7470 = Static7.anIntArray571[local7466];
									@Pc(7476) int local7476 = Static7.anIntArray571[local7466 + 2];
									@Pc(7482) int local7482 = Static7.anIntArray571[local7466 + 1];
									Static7.aCalendar2.clear();
									Static7.aCalendar2.set(11, 12);
									Static7.aCalendar2.set(local7476, local7482, local7470);
									local5 = local7466 + 1;
									Static7.anIntArray571[local7466] = (int) (Static7.aCalendar2.getTime().getTime() / 86400000L) - 11745;
									continue;
								}
								if (local45 == 6303) {
									Static7.aCalendar2.clear();
									Static7.aCalendar2.setTime(new Date(MonotonicClock.currentTimeMillis()));
									Static7.anIntArray571[local5++] = Static7.aCalendar2.get(1);
									continue;
								}
								if (local45 == 6304) {
									@Pc(7537) int local7537 = local5 - 1;
									@Pc(7540) int local7540 = Static7.anIntArray571[local7537];
									@Pc(7542) boolean local7542 = true;
									if (local7540 < 0) {
										local7542 = (local7540 + 1) % 4 == 0;
									} else if (local7540 < 1582) {
										local7542 = local7540 % 4 == 0;
									} else if (local7540 % 4 != 0) {
										local7542 = false;
									} else if (local7540 % 100 != 0) {
										local7542 = true;
									} else if (local7540 % 400 != 0) {
										local7542 = false;
									}
									local5 = local7537 + 1;
									Static7.anIntArray571[local7537] = local7542 ? 1 : 0;
									continue;
								}
							} else if (local45 < 6500) {
								if (local45 == 6405) {
									Static7.anIntArray571[local5++] = Static26.method2988() ? 1 : 0;
									continue;
								}
								if (local45 == 6406) {
									Static7.anIntArray571[local5++] = Static14.method1079() ? 1 : 0;
									continue;
								}
							} else if (local45 < 6600) {
								if (local45 == 6500) {
									if (Static4.anInt3304 == 10 && Static6.anInt5117 == 0 && Static3.anInt2574 == 0 && Static6.anInt4759 == 0) {
										Static7.anIntArray571[local5++] = Static22.method2285() == -1 ? 0 : 1;
										continue;
									}
									Static7.anIntArray571[local5++] = 1;
									continue;
								}
								if (local45 == 6501) {
									@Pc(7710) Class63_Sub1 local7710 = Static20.method1991();
									if (local7710 == null) {
										@Pc(7758) int local7758 = local5 + 1;
										Static7.anIntArray571[local5] = -1;
										Static7.anIntArray571[local7758++] = 0;
										@Pc(7768) int local7768 = local13 + 1;
										Static2.aStringArray5[local13] = "";
										Static7.anIntArray571[local7758++] = 0;
										local13 = local7768 + 1;
										Static2.aStringArray5[local7768] = "";
										local5 = local7758 + 1;
										Static7.anIntArray571[local7758] = 0;
									} else {
										@Pc(7716) int local7716 = local5 + 1;
										Static7.anIntArray571[local5] = local7710.anInt2037;
										Static7.anIntArray571[local7716++] = local7710.anInt2020;
										@Pc(7728) int local7728 = local13 + 1;
										Static2.aStringArray5[local13] = local7710.aString110;
										@Pc(7735) Class151 local7735 = local7710.method1552();
										Static7.anIntArray571[local7716++] = local7735.anInt4469;
										local13 = local7728 + 1;
										Static2.aStringArray5[local7728] = local7735.aString270;
										local5 = local7716 + 1;
										Static7.anIntArray571[local7716] = local7710.anInt2023;
									}
									continue;
								}
								if (local45 == 6502) {
									@Pc(7796) Class63_Sub1 local7796 = Static19.method1777();
									if (local7796 == null) {
										@Pc(7801) int local7801 = local5 + 1;
										Static7.anIntArray571[local5] = -1;
										Static7.anIntArray571[local7801++] = 0;
										@Pc(7811) int local7811 = local13 + 1;
										Static2.aStringArray5[local13] = "";
										Static7.anIntArray571[local7801++] = 0;
										local13 = local7811 + 1;
										Static2.aStringArray5[local7811] = "";
										local5 = local7801 + 1;
										Static7.anIntArray571[local7801] = 0;
									} else {
										@Pc(7833) int local7833 = local5 + 1;
										Static7.anIntArray571[local5] = local7796.anInt2037;
										Static7.anIntArray571[local7833++] = local7796.anInt2020;
										@Pc(7845) int local7845 = local13 + 1;
										Static2.aStringArray5[local13] = local7796.aString110;
										@Pc(7852) Class151 local7852 = local7796.method1552();
										Static7.anIntArray571[local7833++] = local7852.anInt4469;
										local13 = local7845 + 1;
										Static2.aStringArray5[local7845] = local7852.aString270;
										local5 = local7833 + 1;
										Static7.anIntArray571[local7833] = local7796.anInt2023;
									}
									continue;
								}
								if (local45 == 6503) {
									@Pc(7880) int local7880 = local5 - 1;
									@Pc(7883) int local7883 = Static7.anIntArray571[local7880];
									if (Static4.anInt3304 == 10 && Static6.anInt5117 == 0 && Static3.anInt2574 == 0 && Static6.anInt4759 == 0) {
										local5 = local7880 + 1;
										Static7.anIntArray571[local7880] = Static37.method4720(local7883) ? 1 : 0;
										continue;
									}
									local5 = local7880 + 1;
									Static7.anIntArray571[local7880] = 0;
									continue;
								}
								if (local45 == 6504) {
									local5--;
									Static5.anInt3909 = Static7.anIntArray571[local5];
									Static14.method1055(GameShell.signLink);
									continue;
								}
								if (local45 == 6505) {
									Static7.anIntArray571[local5++] = Static5.anInt3909;
									continue;
								}
								if (local45 == 6506) {
									@Pc(7950) int local7950 = local5 - 1;
									@Pc(7953) int local7953 = Static7.anIntArray571[local7950];
									@Pc(7957) Class63_Sub1 local7957 = Static20.method1927(local7953);
									if (local7957 == null) {
										@Pc(7963) int local7963 = local7950 + 1;
										Static7.anIntArray571[local7950] = -1;
										@Pc(7968) int local7968 = local13 + 1;
										Static2.aStringArray5[local13] = "";
										Static7.anIntArray571[local7963++] = 0;
										local13 = local7968 + 1;
										Static2.aStringArray5[local7968] = "";
										local5 = local7963 + 1;
										Static7.anIntArray571[local7963] = 0;
									} else {
										@Pc(7990) int local7990 = local7950 + 1;
										Static7.anIntArray571[local7950] = local7957.anInt2020;
										@Pc(7996) int local7996 = local13 + 1;
										Static2.aStringArray5[local13] = local7957.aString110;
										@Pc(8003) Class151 local8003 = local7957.method1552();
										Static7.anIntArray571[local7990++] = local8003.anInt4469;
										local13 = local7996 + 1;
										Static2.aStringArray5[local7996] = local8003.aString270;
										local5 = local7990 + 1;
										Static7.anIntArray571[local7990] = local7957.anInt2023;
									}
									continue;
								}
								if (local45 == 6507) {
									local5 -= 4;
									@Pc(8031) int local8031 = Static7.anIntArray571[local5];
									@Pc(8044) boolean local8044 = Static7.anIntArray571[local5 + 1] == 1;
									@Pc(8050) int local8050 = Static7.anIntArray571[local5 + 2];
									@Pc(8063) boolean local8063 = Static7.anIntArray571[local5 + 3] == 1;
									Static11.method553(local8044, local8031, local8063, local8050);
									continue;
								}
							} else if (local45 < 6700) {
								if (local45 == 6600) {
									local5--;
									Static5.aBoolean293 = Static7.anIntArray571[local5] == 1;
									Static14.method1055(GameShell.signLink);
									continue;
								}
								if (local45 == 6601) {
									Static7.anIntArray571[local5++] = Static5.aBoolean293 ? 1 : 0;
									continue;
								}
							} else if (local45 < 6900) {
								if (local45 == 6800) {
									local5--;
									@Pc(8089) int local8089 = Static7.anIntArray571[local5];
									@Pc(8093) Class82 local8093 = Static22.method2191(local8089);
									if (local8093.aString131 == null) {
										Static2.aStringArray5[local13++] = "";
									} else {
										Static2.aStringArray5[local13++] = local8093.aString131;
									}
									continue;
								}
								if (local45 == 6801) {
									@Pc(8119) int local8119 = local5 - 1;
									@Pc(8122) int local8122 = Static7.anIntArray571[local8119];
									@Pc(8126) Class82 local8126 = Static22.method2191(local8122);
									local5 = local8119 + 1;
									Static7.anIntArray571[local8119] = local8126.anInt2277;
									continue;
								}
								if (local45 == 6802) {
									@Pc(8141) int local8141 = local5 - 1;
									@Pc(8144) int local8144 = Static7.anIntArray571[local8141];
									@Pc(8148) Class82 local8148 = Static22.method2191(local8144);
									local5 = local8141 + 1;
									Static7.anIntArray571[local8141] = local8148.anInt2270;
									continue;
								}
								if (local45 == 6803) {
									@Pc(8163) int local8163 = local5 - 1;
									@Pc(8166) int local8166 = Static7.anIntArray571[local8163];
									@Pc(8170) Class82 local8170 = Static22.method2191(local8166);
									local5 = local8163 + 1;
									Static7.anIntArray571[local8163] = local8170.anInt2284;
									continue;
								}
							}
						} else if (local45 == 4500) {
							local5 -= 2;
							@Pc(10481) int local10481 = Static7.anIntArray571[local5];
							@Pc(10487) int local10487 = Static7.anIntArray571[local5 + 1];
							@Pc(10491) Class4_Sub3_Sub12 local10491 = Static19.method1815(local10487);
							if (local10491.method1995()) {
								Static2.aStringArray5[local13++] = Static27.method4703(local10481).method3804(local10491.aString153, local10487);
							} else {
								Static7.anIntArray571[local5++] = Static27.method4703(local10481).method3800(local10491.anInt2546, local10487);
							}
							continue;
						}
					} else if (local45 == 4400) {
						local5 -= 2;
						@Pc(10538) int local10538 = Static7.anIntArray571[local5];
						@Pc(10544) int local10544 = Static7.anIntArray571[local5 + 1];
						@Pc(10548) Class4_Sub3_Sub12 local10548 = Static19.method1815(local10544);
						if (local10548.method1995()) {
							Static2.aStringArray5[local13++] = Static8.method99(local10538).method4467(local10548.aString153, local10544);
						} else {
							Static7.anIntArray571[local5++] = Static8.method99(local10538).method4451(local10548.anInt2546, local10544);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(15060) Exception local15060) {
			if (arg1.aString159 == null) {
				if (client.modeWhere != 0) {
					Static26.method4357("", 0, "Clientscript error - check log for details");
				}
				Static26.method3059(local15060, "CS2 - scr:" + arg1.key + " op:" + local25);
			} else {
				@Pc(15069) StringBuffer local15069 = new StringBuffer(30);
				local15069.append("%0a - in: ").append(arg1.aString159);
				for (@Pc(15080) int local15080 = Static2.anInt5739 - 1; local15080 >= 0; local15080--) {
					local15069.append("%0a - via: ").append(Static7.aClass174Array1[local15080].aClass4_Sub3_Sub13_1.aString159);
				}
				if (local25 == 40) {
					@Pc(15103) int local15103 = local23[local11];
					local15069.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local15103));
				}
				if (client.modeWhere != 0) {
					Static26.method4357("", 0, "Clientscript error in: " + arg1.aString159);
				}
				Static26.method3059(local15060, "CS2 - scr:" + arg1.key + " op:" + local25 + local15069.toString());
			}
		}
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

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B[B)Z")
	public static boolean method1554(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Buffer local8 = new Buffer(arg0);
		@Pc(12) int local12 = local8.readUnsignedByte();
		if (local12 != 1) {
			return false;
		}
		@Pc(38) boolean local38 = local8.readUnsignedByte() == 1;
		if (local38) {
			Static14.method1072(local8);
		}
		Static30.method3546(local8);
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!fh;ILjava/lang/String;Z)Lclient!po;")
	public static Class138 method1555(@OriginalArg(0) Class58 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg0.method1362(arg1);
		if (local10 == -1) {
			return new Class138(0);
		}
		@Pc(23) int[] local23 = arg0.method1363(local10);
		@Pc(29) Class138 local29 = new Class138(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local29.anInt4219 > local31) {
				@Pc(59) Buffer local59 = new Buffer(arg0.method1372(local10, local23[local39++]));
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

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method1560(@OriginalArg(0) Class58 arg0) {
		Static3.aClass58_52 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!fd;)Lclient!wg;")
	public static Class4_Sub3_Sub22 method1562(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1) {
		@Pc(41) Class4_Sub3_Sub22 local41 = new Class4_Sub3_Sub22(arg0, arg1.readString(), arg1.readString(), arg1.readInt(), arg1.readInt(), arg1.readUnsignedByte() == 1, arg1.readUnsignedByte());
		@Pc(49) int local49 = arg1.readUnsignedByte();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local41.aClass112_31.method2612(new Class4_Sub7(arg1.readUnsignedByte(), arg1.readUnsignedByte(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort(), arg1.readUnsignedShort()));
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
		Static3.aClass84_8.method1847();
		Static1.aClass175_4.method4337();
		Static3.aClass175_11.method4337();
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	public static void method1576() {
		for (@Pc(7) int local7 = -1; local7 < Static3.anInt2510; local7++) {
			@Pc(20) int local20;
			if (local7 == -1) {
				local20 = 2047;
			} else {
				local20 = Static4.anIntArray317[local7];
			}
			@Pc(30) Class53_Sub1_Sub1 local30 = Static5.aClass53_Sub1_Sub1Array1[local20];
			if (local30 != null) {
				Static15.method1428(local30.method3311(), local30);
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
			if (Static4.aByteArrayArrayArray17 != null) {
				method1498();
			}
		} else {
			Static36.method4462((byte) (Static2.anInt1997 - 4 & 0xFF));
			Static24.method2680(2);
		}
		Static6.anInt4709 = Static7.anInt5334;
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

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method1582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		Static3.aGL1.glMatrixMode(GL.GL_PROJECTION);
		Static3.aGL1.glLoadIdentity();
		Static17.method1604((float) local7 * Static3.aFloat49, (float) local17 * Static3.aFloat49, (float) -local35 * Static3.aFloat49, (float) -local25 * Static3.aFloat49, 50.0F, 3584.0F);
		method1583(arg0, Static3.anInt2083 - arg1 - arg3, arg2, arg3);
		Static3.aGL1.glMatrixMode(GL.GL_MODELVIEW);
		Static3.aGL1.glLoadIdentity();
		Static3.aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			Static3.aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			Static3.aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		Static3.aBoolean132 = false;
		Static7.anInt5437 = local7;
		Static4.anInt3123 = local17;
		Static7.anInt6030 = local25;
		Static1.anInt403 = local35;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
	public static void method1583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static3.anInt2082 = arg0;
		Static3.anInt2079 = arg1;
		Static3.anInt2088 = arg2;
		Static3.anInt2089 = arg3;
		method1586();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
	public static void method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static3.anInt2086 = arg0;
		Static3.anInt2078 = arg1;
		method1586();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
	public static void method1585() {
		Static24.method2652(0, 0);
		Static17.method1601();
		Static17.method1600(-1);
		Static17.method1610(false);
		method1588(false);
		method1593(false);
		method1595();
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "()V")
	private static void method1586() {
		Static3.aGL1.glViewport(Static3.anInt2082 + Static3.anInt2086, Static3.anInt2079 + Static3.anInt2078, Static3.anInt2088, Static3.anInt2089);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)V")
	public static void method1587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static3.anInt2080 = arg0;
		Static3.anInt2083 = arg1;
		Static3.aBoolean132 = false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
	public static void method1588(@OriginalArg(0) boolean arg0) {
		if (arg0 == Static3.aBoolean125) {
			return;
		}
		if (arg0) {
			Static3.aGL1.glEnable(GL.GL_DEPTH_TEST);
		} else {
			Static3.aGL1.glDisable(GL.GL_DEPTH_TEST);
		}
		Static3.aBoolean125 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "()V")
	public static void method1589() {
		Static3.aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "()V")
	public static void method1590() {
		Static24.method2652(0, 0);
		Static17.method1601();
		Static17.method1597(0);
		Static17.method1607(0);
		Static17.method1610(false);
		method1588(false);
		method1593(false);
		method1595();
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "()V")
	public static void method1591() {
		Static3.aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
	public static void method1592(@OriginalArg(0) boolean arg0) {
		if (arg0 == Static3.aBoolean136) {
			return;
		}
		if (arg0) {
			Static3.aGL1.glEnableClientState(GL.GL_NORMAL_ARRAY);
		} else {
			Static3.aGL1.glDisableClientState(GL.GL_NORMAL_ARRAY);
		}
		Static3.aBoolean136 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(Z)V")
	public static void method1593(@OriginalArg(0) boolean arg0) {
		if (arg0 == Static3.aBoolean142) {
			return;
		}
		if (arg0) {
			Static3.aGL1.glEnable(GL.GL_FOG);
		} else {
			Static3.aGL1.glDisable(GL.GL_FOG);
		}
		Static3.aBoolean142 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	public static int method1594(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
		try {
			if (!arg0.isDisplayable()) {
				return -1;
			}
			@Pc(8) GLCapabilities local8 = new GLCapabilities();
			if (arg1 > 0) {
				local8.setSampleBuffers(true);
				local8.setNumSamples(arg1);
			}
			@Pc(18) GLDrawableFactory local18 = GLDrawableFactory.getFactory();
			Static3.aGLDrawable1 = local18.getGLDrawable(arg0, local8, null);
			Static3.aGLDrawable1.setRealized(true);
			@Pc(29) int local29 = 0;
			while (true) {
				Static3.aGLContext1 = Static3.aGLDrawable1.createContext(arg2);
				try {
					@Pc(36) int local36 = Static3.aGLContext1.makeCurrent();
					if (local36 != 0) {
						break;
					}
				} catch (@Pc(41) Exception local41) {
				}
				if (local29++ > 5) {
					return -2;
				}
				ThreadUtils.sleep(1000L);
			}
			Static3.aGL1 = Static3.aGLContext1.getGL();
			Static3.aBoolean138 = true;
			Static3.anInt2080 = arg0.getSize().width;
			Static3.anInt2083 = arg0.getSize().height;
			@Pc(66) int local66 = Static17.method1616();
			if (local66 != 0) {
				Static17.method1605();
				return local66;
			}
			Static17.method1619();
			Static17.method1624();
			Static3.aGL1.glClear(GL.GL_COLOR_BUFFER_BIT);
			@Pc(78) int local78 = 0;
			while (true) {
				try {
					Static3.aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(82) Exception local82) {
					if (local78++ > 5) {
						Static17.method1605();
						return -3;
					}
					ThreadUtils.sleep(100L);
				}
			}
			Static3.aGL1.glClear(GL.GL_COLOR_BUFFER_BIT);
			return 0;
		} catch (@Pc(99) Throwable local99) {
			Static17.method1605();
			return -5;
		}
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "()V")
	public static void method1595() {
		if (Static3.aBoolean140) {
			Static3.aGL1.glMatrixMode(GL.GL_TEXTURE);
			Static3.aGL1.glLoadIdentity();
			Static3.aGL1.glMatrixMode(GL.GL_MODELVIEW);
			Static3.aBoolean140 = false;
		}
	}
}

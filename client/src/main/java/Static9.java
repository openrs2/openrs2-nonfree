import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZZZ)V")
	public static void method174(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		for (@Pc(7) int local7 = 0; local7 < Static6.anInt4451; local7++) {
			@Pc(20) Class53_Sub1_Sub2 local20 = Static3.aClass53_Sub1_Sub2Array1[Static7.anIntArray595[local7]];
			if (local20 != null && local20.method3310() && local20.aClass168_1.method4255()) {
				@Pc(35) int local35 = local20.method3311();
				if (arg2) {
					if (!local20.aClass168_1.aBoolean359) {
						continue;
					}
				} else if (local20.aClass168_1.aBoolean355 != arg1 || arg0 != 0 && arg0 != local35) {
					continue;
				}
				if (local35 == 1) {
					if ((local20.anInt3974 & 0x7F) == 64 && (local20.anInt4002 & 0x7F) == 64) {
						@Pc(208) int local208 = local20.anInt4002 >> 7;
						@Pc(213) int local213 = local20.anInt3974 >> 7;
						if (local213 >= 0 && local213 < 104 && local208 >= 0 && local208 < 104) {
							@Pc(233) int local233 = Static1.anIntArrayArray2[local213][local208]++;
						}
					}
				} else if (((local35 & 0x1) != 0 || (local20.anInt3974 & 0x7F) == 0 && (local20.anInt4002 & 0x7F) == 0) && ((local35 & 0x1) != 1 || (local20.anInt3974 & 0x7F) == 64 && (local20.anInt4002 & 0x7F) == 64)) {
					@Pc(113) int local113 = local20.anInt3974 - local35 * 64 >> 7;
					@Pc(122) int local122 = local20.anInt4002 - local35 * 64 >> 7;
					@Pc(128) int local128 = local20.method3311() + local113;
					if (local128 > 104) {
						local128 = 104;
					}
					if (local113 < 0) {
						local113 = 0;
					}
					@Pc(146) int local146 = local122 + local20.method3311();
					if (local146 > 104) {
						local146 = 104;
					}
					if (local122 < 0) {
						local122 = 0;
					}
					for (@Pc(158) int local158 = local113; local158 < local128; local158++) {
						for (@Pc(163) int local163 = local122; local163 < local146; local163++) {
							@Pc(176) int local176 = Static1.anIntArrayArray2[local158][local163]++;
						}
					}
				}
			}
		}
		label206:
		for (@Pc(249) int local249 = 0; local249 < Static6.anInt4451; local249++) {
			@Pc(258) Class53_Sub1_Sub2 local258 = Static3.aClass53_Sub1_Sub2Array1[Static7.anIntArray595[local249]];
			@Pc(267) long local267 = (long) Static7.anIntArray595[local249] << 32 | 0x20000000L;
			if (local258 != null && local258.method3310() && local258.aClass168_1.method4255()) {
				@Pc(282) int local282 = local258.method3311();
				if (arg2) {
					if (!local258.aClass168_1.aBoolean359) {
						continue;
					}
				} else if (arg1 != local258.aClass168_1.aBoolean355 || arg0 != 0 && arg0 != local282) {
					continue;
				}
				local258.aBoolean282 = true;
				if (local282 == 1) {
					if ((local258.anInt3974 & 0x7F) == 64 && (local258.anInt4002 & 0x7F) == 64) {
						@Pc(335) int local335 = local258.anInt3974 >> 7;
						@Pc(340) int local340 = local258.anInt4002 >> 7;
						if (local335 < 0 || local335 >= 104 || local340 < 0 || local340 >= 104) {
							continue;
						}
						if (Static1.anIntArrayArray2[local335][local340] > 1) {
							@Pc(373) int local373 = Static1.anIntArrayArray2[local335][local340]--;
							continue;
						}
					}
				} else if ((local282 & 0x1) == 0 && (local258.anInt3974 & 0x7F) == 0 && (local258.anInt4002 & 0x7F) == 0 || (local282 & 0x1) == 1 && (local258.anInt3974 & 0x7F) == 64 && (local258.anInt4002 & 0x7F) == 64) {
					@Pc(424) int local424 = local258.anInt3974 - local282 * 64 >> 7;
					@Pc(434) int local434 = local258.anInt4002 - local282 * 64 >> 7;
					@Pc(438) int local438 = local282 + local424;
					@Pc(442) int local442 = local282 + local434;
					if (local442 > 104) {
						local442 = 104;
					}
					if (local424 < 0) {
						local424 = 0;
					}
					if (local434 < 0) {
						local434 = 0;
					}
					@Pc(462) boolean local462 = true;
					if (local438 > 104) {
						local438 = 104;
					}
					for (@Pc(469) int local469 = local424; local469 < local438; local469++) {
						for (@Pc(474) int local474 = local434; local474 < local442; local474++) {
							if (Static1.anIntArrayArray2[local469][local474] <= 1) {
								local462 = false;
								break;
							}
						}
					}
					if (local462) {
						@Pc(504) int local504 = local424;
						while (true) {
							if (local504 >= local438) {
								continue label206;
							}
							for (@Pc(509) int local509 = local434; local509 < local442; local509++) {
								@Pc(522) int local522 = Static1.anIntArrayArray2[local504][local509]--;
							}
							local504++;
						}
					}
				}
				if (!local258.aClass168_1.aBoolean357) {
					local267 |= Long.MIN_VALUE;
				}
				local258.aBoolean282 = false;
				local258.anInt4006 = Static11.method522(local258.anInt4002, local258.anInt3974, Static7.anInt5334);
				Static11.method637(Static7.anInt5334, local258.anInt3974, local258.anInt4002, local258.anInt4006, local282 * 64 + 60 - 64, local258, local258.anInt4031, local267, local258.aBoolean284);
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZIB)V")
	public static void method175(@OriginalArg(1) boolean arg0) {
		Static4.anInt3257 = 2;
		Static4.aBoolean183 = arg0;
		Static7.anInt5394 = 22050;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V")
	public static void method191() {
		Static5.aClass26_45.method517(5);
		Static7.aClass26_57.method517(5);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(II)I")
	public static int method192(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ll;III)V")
	public static void method193(@OriginalArg(0) Class112 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static3.aClass112_13.method2606();
		if (Static6.aBoolean317) {
			return;
		}
		for (@Pc(23) Class4_Sub3_Sub7 local23 = (Class4_Sub3_Sub7) arg0.method2610(); local23 != null; local23 = (Class4_Sub3_Sub7) arg0.method2616()) {
			@Pc(30) Class82 local30 = Static22.method2191(local23.anInt1760);
			if (Static8.method120(local30)) {
				Static36.method3811(arg1, local23, arg2, local30);
				if (local23.aBoolean106) {
					Static35.method4329(local23, local30);
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;IIIIIILclient!gl;Lclient!wf;)V")
	public static void method194(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class4_Sub3_Sub5 arg7, @OriginalArg(9) Class185 arg8) {
		@Pc(14) int local14 = arg5 * arg5 + arg3 * arg3;
		@Pc(21) int local21 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
		@Pc(33) int local33 = Math.max(arg8.anInt5893 / 2, arg8.anInt5949 / 2) + 10;
		if (local33 * local33 < local14) {
			return;
		}
		@Pc(43) int local43 = Class109.anIntArray298[local21];
		local43 = local43 * 256 / (Static6.anInt4761 + 256);
		@Pc(55) int local55 = Class109.anIntArray299[local21];
		local55 = local55 * 256 / (Static6.anInt4761 + 256);
		@Pc(74) int local74 = local55 * arg3 + local43 * arg5 >> 16;
		@Pc(79) int local79 = arg7.method2261(arg1, 100);
		@Pc(85) int local85 = arg7.method2273(arg1);
		@Pc(96) int local96 = arg3 * local43 - local55 * arg5 >> 16;
		local74 -= local79 / 2;
		if (-arg8.anInt5893 > local74 || local74 > arg8.anInt5893 || -arg8.anInt5949 > local96 || local96 > arg8.anInt5949) {
			return;
		}
		if (Static3.aBoolean138) {
			Static18.method1696((Class4_Sub3_Sub14_Sub2) arg8.method4729(false));
		} else {
			Static34.method4218(arg8.anIntArray672, arg8.anIntArray657);
		}
		arg7.method2260(arg1, local74 + arg4 + arg8.anInt5893 / 2, arg2 + arg8.anInt5949 / 2 - local96 - arg6 - local85, local79, 50, arg0, 0, 1, 0, 0);
		if (Static3.aBoolean138) {
			Static18.method1702();
		} else {
			Static34.method4228();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!fd;ZZZIIIIIIII)V")
	public static void method195(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg10 < 0 || arg10 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				@Pc(315) int local315 = arg0.method4629();
				if (local315 == 0) {
					break;
				}
				if (local315 == 1) {
					arg0.method4629();
					break;
				}
				if (local315 <= 49) {
					arg0.method4629();
				}
			}
			return;
		}
		if (!arg2 && !arg1) {
			Static4.aByteArrayArrayArray17[arg3][arg10][arg6] = 0;
		}
		while (true) {
			@Pc(37) int local37 = arg0.method4629();
			if (local37 == 0) {
				if (arg2) {
					Static6.anIntArrayArrayArray13[0][arg9 + arg10][arg8 + arg6] = Static6.anIntArrayArrayArray14[0][arg9 + arg10][arg8 + arg6];
				} else if (arg3 == 0) {
					Static6.anIntArrayArrayArray13[0][arg9 + arg10][arg6 + arg8] = -Static25.method2926(arg4 + 932731, arg5 + 556238) * 8;
				} else {
					Static6.anIntArrayArrayArray13[arg3][arg10 + arg9][arg8 + arg6] = Static6.anIntArrayArrayArray13[arg3 - 1][arg10 + arg9][arg6 + arg8] - 240;
				}
				break;
			}
			if (local37 == 1) {
				@Pc(132) int local132 = arg0.method4629();
				if (arg2) {
					Static6.anIntArrayArrayArray13[0][arg9 + arg10][arg8 + arg6] = local132 * 8 + Static6.anIntArrayArrayArray14[0][arg9 + arg10][arg8 + arg6];
				} else {
					if (local132 == 1) {
						local132 = 0;
					}
					if (arg3 == 0) {
						Static6.anIntArrayArrayArray13[0][arg9 + arg10][arg6 + arg8] = -local132 * 8;
					} else {
						Static6.anIntArrayArrayArray13[arg3][arg10 + arg9][arg8 + arg6] = Static6.anIntArrayArrayArray13[arg3 - 1][arg9 + arg10][arg8 + arg6] - local132 * 8;
					}
				}
				break;
			}
			if (local37 <= 49) {
				if (arg1) {
					arg0.method4629();
				} else {
					Static4.aByteArrayArrayArray15[arg3][arg10][arg6] = arg0.method4637();
					Static2.aByteArrayArrayArray4[arg3][arg10][arg6] = (byte) ((local37 - 2) / 4);
					Static1.aByteArrayArrayArray1[arg3][arg10][arg6] = (byte) (arg7 + local37 - 2 & 0x3);
				}
			} else if (local37 > 81) {
				if (!arg1) {
					Static2.aByteArrayArrayArray3[arg3][arg10][arg6] = (byte) (local37 - 81);
				}
			} else if (!arg2 && !arg1) {
				Static4.aByteArrayArrayArray17[arg3][arg10][arg6] = (byte) (local37 - 49);
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!fh;II)Z")
	public static boolean method197(@OriginalArg(1) Class58 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg0.method1372(arg1, arg2);
		if (local9 == null) {
			return false;
		} else {
			Static29.method3542(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public static void method198() {
		Static5.aClass26_37.method511();
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	public static void method199() {
		if (Static1.aClass102_1 != null) {
			Static1.aClass102_1.method3001();
		}
		if (Static6.aClass102_2 != null) {
			Static6.aClass102_2.method3001();
		}
		method175(Static7.aBoolean122);
		Static1.aClass102_1 = Static25.method2807(Static5.aCanvas115, 22050, Static7.aClass196_4, 0);
		Static1.aClass102_1.method3008(Static1.aClass4_Sub6_Sub2_2);
		Static6.aClass102_2 = Static25.method2807(Static5.aCanvas115, 2048, Static7.aClass196_4, 1);
		Static6.aClass102_2.method3008(Static5.aClass4_Sub6_Sub3_2);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(DB)V")
	public static void method200(@OriginalArg(0) double arg0) {
		if (Static5.aDouble11 == arg0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(28) int local28 = (int) (Math.pow((double) local13 / 255.0D, arg0) * 255.0D);
			Static4.anIntArray267[local13] = local28 > 255 ? 255 : local28;
		}
		Static5.aDouble11 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public static void method201() {
		Static4.aClass26_29.method511();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Color;ZZILjava/lang/String;)V")
	public static void method202(@OriginalArg(0) Color arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			@Pc(2) Graphics local2 = Static5.aCanvas115.getGraphics();
			if (Static1.aFont1 == null) {
				Static1.aFont1 = new Font("Helvetica", 1, 13);
				Static1.aFontMetrics1 = Static5.aCanvas115.getFontMetrics(Static1.aFont1);
			}
			if (arg1) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static1.anInt526, Static1.anInt690);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static2.anImage2 == null) {
					Static2.anImage2 = Static5.aCanvas115.createImage(304, 34);
				}
				@Pc(48) Graphics local48 = Static2.anImage2.getGraphics();
				local48.setColor(arg0);
				local48.drawRect(0, 0, 303, 33);
				local48.fillRect(2, 2, arg2 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(1, 1, 301, 31);
				local48.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local48.setFont(Static1.aFont1);
				local48.setColor(Color.white);
				local48.drawString(arg3, (304 - Static1.aFontMetrics1.stringWidth(arg3)) / 2, 22);
				local2.drawImage(Static2.anImage2, Static1.anInt526 / 2 - 152, Static1.anInt690 / 2 - 18, null);
			} catch (@Pc(128) Exception local128) {
				@Pc(134) int local134 = Static1.anInt526 / 2 - 152;
				@Pc(140) int local140 = Static1.anInt690 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local134, local140, 303, 33);
				local2.fillRect(local134 + 2, local140 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local134 + 1, local140 + 1, 301, 31);
				local2.fillRect(arg2 * 3 + local134 + 2, local140 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static1.aFont1);
				local2.setColor(Color.white);
				local2.drawString(arg3, local134 + (304 - Static1.aFontMetrics1.stringWidth(arg3)) / 2, local140 + 22);
			}
			if (Static5.aString255 != null) {
				local2.setFont(Static1.aFont1);
				local2.setColor(Color.white);
				local2.drawString(Static5.aString255, Static1.anInt526 / 2 - Static1.aFontMetrics1.stringWidth(Static5.aString255) / 2, Static1.anInt690 / 2 - 26);
			}
		} catch (@Pc(243) Exception local243) {
			Static5.aCanvas115.repaint();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIILclient!vc;Lclient!vc;IIIIJ)V")
	public static void method203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) Class53 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class182 local6 = new Class182();
		local6.aLong194 = arg10;
		local6.anInt5626 = arg1 * 128 + 64;
		local6.anInt5624 = arg2 * 128 + 64;
		local6.anInt5627 = arg3;
		local6.aClass53_10 = arg4;
		local6.aClass53_9 = arg5;
		local6.anInt5629 = arg6;
		local6.anInt5631 = arg7;
		local6.anInt5633 = arg8;
		local6.anInt5625 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static1.aClass4_Sub19ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static1.aClass4_Sub19ArrayArrayArray1[local46][arg1][arg2] = new Class4_Sub19(local46, arg1, arg2);
			}
		}
		Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass182_1 = local6;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)Lclient!ma;")
	public static Class56 method204() {
		@Pc(31) Class56 local31;
		if (Static3.aBoolean138) {
			local31 = new Class56_Sub2(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[0], Static5.anIntArray391[0], Static3.anIntArray185[0], Static7.anIntArray643[0], Static6.aByteArrayArray36[0], Static2.anIntArray85);
		} else {
			local31 = new Class56_Sub1(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[0], Static5.anIntArray391[0], Static3.anIntArray185[0], Static7.anIntArray643[0], Static6.aByteArrayArray36[0], Static2.anIntArray85);
		}
		Static37.method4670();
		return local31;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[[III)I")
	public static int method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4) {
		@Pc(31) int local31 = arg0 * arg3[arg1 + 1][arg4] + arg3[arg1][arg4] * (128 - arg0) >> 7;
		@Pc(58) int local58 = arg3[arg1][arg4 + 1] * (128 - arg0) + arg0 * arg3[arg1 + 1][arg4 + 1] >> 7;
		return local31 * (128 - arg2) + local58 * arg2 >> 7;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
	public static int method207() {
		Static3.aGL1.glGenRenderbuffersEXT(1, Static1.anIntArray22, 0);
		return Static1.anIntArray22[0];
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "()V")
	public static void method209() {
		@Pc(1) GL local1 = Static3.aGL1;
		local1.glMatrixMode(GL.GL_PROJECTION);
		local1.glPopMatrix();
		local1.glMatrixMode(GL.GL_MODELVIEW);
		local1.glPopMatrix();
		local1.glViewport(Static1.anIntArray23[0], Static1.anIntArray23[1], Static1.anIntArray23[2], Static1.anIntArray23[3]);
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()I")
	public static int method210() {
		Static3.aGL1.glGenFramebuffersEXT(1, Static1.anIntArray22, 0);
		return Static1.anIntArray22[0];
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method211(@OriginalArg(0) int arg0) {
		Static1.anIntArray22[0] = arg0;
		Static3.aGL1.glDeleteFramebuffersEXT(1, Static1.anIntArray22, 0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(FFFFFFII)V")
	public static void method212(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static3.aGL1;
		local1.glMatrixMode(GL.GL_PROJECTION);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(GL.GL_MODELVIEW);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(GL.GL_VIEWPORT, Static1.anIntArray23, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(FFFFII)V")
	public static void method213(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method212(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	public static void method214(@OriginalArg(0) int arg0) {
		Static1.anIntArray22[0] = arg0;
		Static3.aGL1.glDeleteRenderbuffersEXT(1, Static1.anIntArray22, 0);
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "()V")
	public static void method215() {
		Static3.aGL1.glBindFramebufferEXT(GL.GL_FRAMEBUFFER, --Static1.anInt227 > 0 ? Static1.anIntArray24[Static1.anInt227 - 1] : 0);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public static void method216(@OriginalArg(0) int arg0) {
		Static1.anIntArray24[Static1.anInt227++] = arg0;
		Static3.aGL1.glBindFramebufferEXT(GL.GL_FRAMEBUFFER, arg0);
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "()Z")
	public static boolean method217() {
		@Pc(1) GL local1 = Static3.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(GL.GL_FRAMEBUFFER);
		return local5 == GL.GL_FRAMEBUFFER_COMPLETE;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method230(@OriginalArg(1) int arg0) {
		if (!Static15.method1364(arg0)) {
			return;
		}
		@Pc(22) Class185[] local22 = Static5.aClass185ArrayArray115[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(36) Class185 local36 = local22[local24];
			if (local36 != null) {
				local36.anInt5979 = 1;
				local36.anInt5892 = 0;
				local36.anInt5897 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method231(@OriginalArg(0) Class58 arg0) {
		Static4.aClass58_74 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([IB[Ljava/lang/Object;)V")
	public static void method232(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static16.method2017(arg0.length - 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V")
	public static void method233(@OriginalArg(0) int arg0) {
		if (arg0 == Static4.anInt3304) {
			return;
		}
		if (Static4.anInt3304 == 0) {
			Static31.method3153();
		}
		@Pc(28) boolean local28 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 == 40) {
			Static8.method101();
		}
		if (arg0 != 40 && Static2.aClass52_1 != null) {
			Static2.aClass52_1.method1103();
			Static2.aClass52_1 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static6.anInt4659 = 0;
			Static7.anInt5473 = 1;
			Static3.anInt2886 = 0;
			Static6.anInt4398 = 1;
			Static7.anInt5486 = 0;
			Static10.method384(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static22.method2387();
		}
		if (arg0 == 5) {
			Static24.method2675(Static1.aClass58_4);
		} else {
			Static22.method2411();
		}
		@Pc(114) boolean local114 = Static4.anInt3304 == 5 || Static4.anInt3304 == 10 || Static4.anInt3304 == 28;
		if (local114 != local28) {
			if (local28) {
				Static6.anInt4844 = Static7.anInt5611;
				if (Static1.anInt344 == 0) {
					Static13.method971();
				} else {
					Static24.method2692(Static7.aClass58_98, 255, Static7.anInt5611);
				}
				Static7.aClass51_2.method1093(false);
			} else {
				Static13.method971();
				Static7.aClass51_2.method1093(true);
			}
		}
		if (Static3.aBoolean138 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static17.method1608();
		}
		Static4.anInt3304 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIBII)V")
	public static void method758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg2 + arg6;
		@Pc(14) int local14 = arg4 - arg6;
		@Pc(18) int local18 = arg3 + arg6;
		@Pc(23) int local23 = arg1 - arg6;
		for (@Pc(25) int local25 = arg2; local25 < local6; local25++) {
			Static18.method1656(Static5.anIntArrayArray36[local25], arg0, arg3, arg1);
		}
		for (@Pc(55) int local55 = arg4; local55 > local14; local55--) {
			Static18.method1656(Static5.anIntArrayArray36[local55], arg0, arg3, arg1);
		}
		for (@Pc(75) int local75 = local6; local75 <= local14; local75++) {
			@Pc(86) int[] local86 = Static5.anIntArrayArray36[local75];
			Static18.method1656(local86, arg0, arg3, local18);
			Static18.method1656(local86, arg5, local18, local23);
			Static18.method1656(local86, arg0, local23, arg1);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)Z")
	public static boolean method759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static6.anInt4794 + arg0 * Static3.anInt2272 >> 16;
		@Pc(19) int local19 = arg3 * Static3.anInt2272 - arg0 * Static6.anInt4794 >> 16;
		@Pc(29) int local29 = arg1 * Static2.anInt2247 + local19 * Static5.anInt3487 >> 16;
		@Pc(39) int local39 = arg1 * Static5.anInt3487 - local19 * Static2.anInt2247 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static2.anInt2247 + local19 * Static5.anInt3487 >> 16;
		@Pc(76) int local76 = arg2 * Static5.anInt3487 - local19 * Static2.anInt2247 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static7.anInt5437 && local87 < Static7.anInt5437) {
			return false;
		} else if (local50 > Static4.anInt3123 && local87 > Static4.anInt3123) {
			return false;
		} else if (local56 < Static7.anInt6030 && local93 < Static7.anInt6030) {
			return false;
		} else {
			return local56 <= Static1.anInt403 || local93 <= Static1.anInt403;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public static void method763() {
		if (Static6.aClass102_2 != null) {
			Static6.aClass102_2.method2998();
		}
		if (Static1.aClass102_1 != null) {
			Static1.aClass102_1.method2998();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method262(@OriginalArg(0) Class58 arg0) {
		Static6.aClass58_94 = arg0;
		Static5.anInt4158 = Static6.aClass58_94.method1371(16);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!fn;")
	public static Class4_Sub3_Sub8 method264(@OriginalArg(0) int arg0) {
		@Pc(18) Class4_Sub3_Sub8 local18 = (Class4_Sub3_Sub8) Static2.aClass40_6.method889((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(29) byte[] local29 = Static6.aClass58_95.method1372(5, arg0);
		@Pc(33) Class4_Sub3_Sub8 local33 = new Class4_Sub3_Sub8();
		if (local29 != null) {
			local33.method1499(new Class4_Sub10(local29));
		}
		Static2.aClass40_6.method888((long) arg0, local33);
		return local33;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([II)I")
	public static int method265(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 < local3 && local16 > local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "([II)I")
	public static int method270(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0[arg1];
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) int local16 = arg0[local9];
			if (local16 > local3 && local16 < local7) {
				local5 = local9;
				local7 = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZZI[[[Lclient!nh;)Z")
	public static boolean method279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub19[][][] arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static2.anInt1997 & 0xFF);
		if (Static1.aByteArrayArrayArray2[Static7.anInt5334][arg1][arg3] == local14) {
			return false;
		} else if ((Static4.aByteArrayArrayArray17[Static7.anInt5334][arg1][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(40) byte local40 = 0;
			Static6.anIntArray479[0] = arg1;
			@Pc(55) int local55 = 0;
			@Pc(58) int local58 = local40 + 1;
			Static4.anIntArray653[0] = arg3;
			Static1.aByteArrayArrayArray2[Static7.anInt5334][arg1][arg3] = local14;
			while (local58 != local55) {
				@Pc(77) int local77 = Static6.anIntArray479[local55] & 0xFFFF;
				@Pc(85) int local85 = Static6.anIntArray479[local55] >> 16 & 0xFF;
				@Pc(93) int local93 = Static6.anIntArray479[local55] >> 24 & 0xFF;
				@Pc(101) int local101 = Static4.anIntArray653[local55] >> 16 & 0xFF;
				@Pc(103) boolean local103 = false;
				@Pc(109) int local109 = Static4.anIntArray653[local55] & 0xFFFF;
				@Pc(111) boolean local111 = false;
				local55 = local55 + 1 & 0xFFF;
				if ((Static4.aByteArrayArrayArray17[Static7.anInt5334][local77][local109] & 0x4) == 0) {
					local103 = true;
				}
				label241:
				for (@Pc(137) int local137 = Static7.anInt5334 + 1; local137 <= 3; local137++) {
					if ((Static4.aByteArrayArrayArray17[local137][local77][local109] & 0x8) == 0) {
						if (local103 && arg4[local137][local77][local109] != null) {
							if (arg4[local137][local77][local109].aClass179_1 != null) {
								@Pc(176) int local176 = Static25.method2812(local85);
								if (arg4[local137][local77][local109].aClass179_1.anInt5493 == local176 || local176 == arg4[local137][local77][local109].aClass179_1.anInt5488) {
									continue;
								}
								if (local93 != 0) {
									@Pc(211) int local211 = Static25.method2812(local93);
									if (local211 == arg4[local137][local77][local109].aClass179_1.anInt5493 || arg4[local137][local77][local109].aClass179_1.anInt5488 == local211) {
										continue;
									}
								}
								if (local101 != 0) {
									@Pc(247) int local247 = Static25.method2812(local101);
									if (arg4[local137][local77][local109].aClass179_1.anInt5493 == local247 || local247 == arg4[local137][local77][local109].aClass179_1.anInt5488) {
										continue;
									}
								}
							}
							if (arg4[local137][local77][local109].aClass33Array3 != null) {
								for (@Pc(285) int local285 = 0; local285 < arg4[local137][local77][local109].anInt3554; local285++) {
									@Pc(316) int local316 = (int) (arg4[local137][local77][local109].aClass33Array3[local285].aLong38 >> 14 & 0x3FL);
									@Pc(333) int local333 = (int) (arg4[local137][local77][local109].aClass33Array3[local285].aLong38 >> 20 & 0x3L);
									if (local316 == 21) {
										local316 = 19;
									}
									@Pc(344) int local344 = local333 << 6 | local316;
									if (local85 == local344 || local93 != 0 && local344 == local93 || local101 != 0 && local101 == local344) {
										continue label241;
									}
								}
							}
						}
						local111 = true;
						@Pc(385) Class4_Sub19 local385 = arg4[local137][local77][local109];
						if (local385 != null && local385.anInt3554 > 0) {
							for (@Pc(394) int local394 = 0; local394 < local385.anInt3554; local394++) {
								@Pc(403) Class33 local403 = local385.aClass33Array3[local394];
								if (local403.anInt825 != local403.anInt824 || local403.anInt817 != local403.anInt826) {
									for (@Pc(421) int local421 = local403.anInt824; local421 <= local403.anInt825; local421++) {
										for (@Pc(432) int local432 = local403.anInt826; local432 <= local403.anInt817; local432++) {
											Static1.aByteArrayArrayArray2[local137][local421][local432] = local14;
										}
									}
								}
							}
						}
						Static1.aByteArrayArrayArray2[local137][local77][local109] = local14;
					}
				}
				if (local111) {
					if (Static5.anIntArray440[arg0] < Static6.anIntArrayArrayArray13[Static7.anInt5334 + 1][local77][local109]) {
						Static5.anIntArray440[arg0] = Static6.anIntArrayArrayArray13[Static7.anInt5334 + 1][local77][local109];
					}
					@Pc(505) int local505 = local77 << 7;
					@Pc(509) int local509 = local109 << 7;
					if (Static3.anIntArray164[arg0] > local505) {
						Static3.anIntArray164[arg0] = local505;
					} else if (local505 > Static7.anIntArray620[arg0]) {
						Static7.anIntArray620[arg0] = local505;
					}
					if (local509 < Static6.anIntArray492[arg0]) {
						Static6.anIntArray492[arg0] = local509;
					} else if (local509 > Static6.anIntArray489[arg0]) {
						Static6.anIntArray489[arg0] = local509;
					}
				}
				if (!local103) {
					if (local77 >= 1 && Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 - 1][local109] != local14) {
						Static6.anIntArray479[local58] = local77 - 1 | 0x120000 | 0xD3000000;
						Static4.anIntArray653[local58] = local109 | 0x130000;
						local58 = local58 + 1 & 0xFFF;
						Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 - 1][local109] = local14;
					}
					@Pc(611) int local611 = local109 + 1;
					if (local611 < 104) {
						if (local77 - 1 >= 0 && local14 != Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 - 1][local611] && (Static4.aByteArrayArrayArray17[Static7.anInt5334][local77][local611] & 0x4) == 0 && (Static4.aByteArrayArrayArray17[Static7.anInt5334][local77 - 1][local611 - 1] & 0x4) == 0) {
							Static6.anIntArray479[local58] = local77 - 1 | 0x52000000 | 0x120000;
							Static4.anIntArray653[local58] = local611 | 0x130000;
							Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 - 1][local611] = local14;
							local58 = local58 + 1 & 0xFFF;
						}
						if (local14 != Static1.aByteArrayArrayArray2[Static7.anInt5334][local77][local611]) {
							Static6.anIntArray479[local58] = local77 | 0x520000 | 0x13000000;
							Static4.anIntArray653[local58] = local611 | 0x530000;
							Static1.aByteArrayArrayArray2[Static7.anInt5334][local77][local611] = local14;
							local58 = local58 + 1 & 0xFFF;
						}
						if (local77 + 1 < 104 && local14 != Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 + 1][local611] && (Static4.aByteArrayArrayArray17[Static7.anInt5334][local77][local611] & 0x4) == 0 && (Static4.aByteArrayArrayArray17[Static7.anInt5334][local77 + 1][local611 - 1] & 0x4) == 0) {
							Static6.anIntArray479[local58] = local77 + 1 | 0x520000 | 0x92000000;
							Static4.anIntArray653[local58] = local611 | 0x530000;
							Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 + 1][local611] = local14;
							local58 = local58 + 1 & 0xFFF;
						}
					}
					@Pc(824) int local824 = local611 - 1;
					if (local77 + 1 < 104 && Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 + 1][local824] != local14) {
						Static6.anIntArray479[local58] = local77 + 1 | 0x53000000 | 0x920000;
						Static4.anIntArray653[local58] = local824 | 0x930000;
						local58 = local58 + 1 & 0xFFF;
						Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 + 1][local824] = local14;
					}
					@Pc(876) int local876 = local824 - 1;
					if (local876 >= 0) {
						if (local77 - 1 >= 0 && Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 - 1][local876] != local14 && (Static4.aByteArrayArrayArray17[Static7.anInt5334][local77][local876] & 0x4) == 0 && (Static4.aByteArrayArrayArray17[Static7.anInt5334][local77 - 1][local876 + 1] & 0x4) == 0) {
							Static6.anIntArray479[local58] = 0x12000000 | 0xD20000 | local77 - 1;
							Static4.anIntArray653[local58] = local876 | 0xD30000;
							local58 = local58 + 1 & 0xFFF;
							Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 - 1][local876] = local14;
						}
						if (local14 != Static1.aByteArrayArrayArray2[Static7.anInt5334][local77][local876]) {
							Static6.anIntArray479[local58] = 0x93000000 | 0xD20000 | local77;
							Static4.anIntArray653[local58] = local876 | 0xD30000;
							local58 = local58 + 1 & 0xFFF;
							Static1.aByteArrayArrayArray2[Static7.anInt5334][local77][local876] = local14;
						}
						if (local77 + 1 < 104 && Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 + 1][local876] != local14 && (Static4.aByteArrayArrayArray17[Static7.anInt5334][local77][local876] & 0x4) == 0 && (Static4.aByteArrayArrayArray17[Static7.anInt5334][local77 + 1][local876 + 1] & 0x4) == 0) {
							Static6.anIntArray479[local58] = local77 + 1 | 0xD2000000 | 0x920000;
							Static4.anIntArray653[local58] = local876 | 0x930000;
							local58 = local58 + 1 & 0xFFF;
							Static1.aByteArrayArrayArray2[Static7.anInt5334][local77 + 1][local876] = local14;
						}
					}
				}
			}
			if (Static5.anIntArray440[arg0] != -1000000) {
				@Pc(1086) int[] local1086 = Static5.anIntArray440;
				local1086[arg0] += 10;
				local1086 = Static3.anIntArray164;
				local1086[arg0] -= 50;
				local1086 = Static7.anIntArray620;
				local1086[arg0] += 50;
				local1086 = Static6.anIntArray489;
				local1086[arg0] += 50;
				local1086 = Static6.anIntArray492;
				local1086[arg0] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(IIIIII)V")
	public static void method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg4 - arg1;
		if (local15 == 0) {
			if (local10 != 0) {
				Static10.method306(arg1, arg3, arg0, arg2);
			}
		} else if (local10 == 0) {
			Static20.method1975(arg1, arg4, arg3, arg2);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(70) boolean local70 = local10 > local15;
			if (local70) {
				@Pc(74) int local74 = arg1;
				arg1 = arg2;
				arg2 = local74;
				@Pc(80) int local80 = arg4;
				arg4 = arg0;
				arg0 = local80;
			}
			if (arg4 < arg1) {
				@Pc(93) int local93 = arg1;
				arg1 = arg4;
				@Pc(97) int local97 = arg2;
				arg2 = arg0;
				arg0 = local97;
				arg4 = local93;
			}
			@Pc(105) int local105 = arg2;
			@Pc(110) int local110 = arg4 - arg1;
			@Pc(115) int local115 = arg0 - arg2;
			@Pc(126) int local126 = arg0 > arg2 ? 1 : -1;
			if (local115 < 0) {
				local115 = -local115;
			}
			@Pc(137) int local137 = -(local110 >> 1);
			if (local70) {
				for (@Pc(141) int local141 = arg1; local141 <= arg4; local141++) {
					local137 += local115;
					Static5.anIntArrayArray36[local141][local105] = arg3;
					if (local137 > 0) {
						local105 += local126;
						local137 -= local110;
					}
				}
			} else {
				for (@Pc(172) int local172 = arg1; local172 <= arg4; local172++) {
					local137 += local115;
					Static5.anIntArrayArray36[local105][local172] = arg3;
					if (local137 > 0) {
						local105 += local126;
						local137 -= local110;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILclient!fd;)V")
	public static void method281(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		if (Static1.aClass189_1 == null) {
			return;
		}
		try {
			Static1.aClass189_1.method4798(0L);
			Static1.aClass189_1.method4795(arg0, arg1.aByteArray71, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
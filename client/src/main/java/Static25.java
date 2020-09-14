import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)[Lclient!ub;")
	public static Class169[] method2725() {
		if (Static3.aClass169Array1 == null) {
			@Pc(9) Class169[] local9 = Static11.method610(GameShell.signLink);
			@Pc(13) Class169[] local13 = new Class169[local9.length];
			@Pc(15) int local15 = 0;
			label54:
			for (@Pc(17) int local17 = 0; local17 < local9.length; local17++) {
				@Pc(25) Class169 local25 = local9[local17];
				if ((local25.anInt5279 <= 0 || local25.anInt5279 >= 24) && local25.anInt5276 >= 800 && local25.anInt5275 >= 600) {
					for (@Pc(46) int local46 = 0; local46 < local15; local46++) {
						@Pc(53) Class169 local53 = local13[local46];
						if (local25.anInt5276 == local53.anInt5276 && local53.anInt5275 == local25.anInt5275) {
							if (local53.anInt5279 < local25.anInt5279) {
								local13[local46] = local25;
							}
							continue label54;
						}
					}
					local13[local15] = local25;
					local15++;
				}
			}
			Static3.aClass169Array1 = new Class169[local15];
			ArrayUtils.copy(local13, 0, Static3.aClass169Array1, 0, local15);
			@Pc(107) int[] local107 = new int[Static3.aClass169Array1.length];
			for (@Pc(109) int local109 = 0; local109 < Static3.aClass169Array1.length; local109++) {
				@Pc(117) Class169 local117 = Static3.aClass169Array1[local109];
				local107[local109] = local117.anInt5275 * local117.anInt5276;
			}
			Static9.method232(local107, Static3.aClass169Array1);
		}
		return Static3.aClass169Array1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)J")
	public static long method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass179_1 == null ? 0L : local7.aClass179_1.aLong188;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method2728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static7.anInt5632 * 128) {
			arg0 = Static7.anInt5632 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static7.anInt5590 * 128) {
			arg2 = Static7.anInt5590 * 128 - 1;
		}
		Static2.anInt2247 = Class109.anIntArray299[arg3];
		Static5.anInt3487 = Class109.anIntArray298[arg3];
		Static6.anInt4794 = Class109.anIntArray299[arg4];
		Static3.anInt2272 = Class109.anIntArray298[arg4];
		Static7.anInt5281 = arg0;
		Static6.anInt4375 = arg1;
		Static6.anInt4400 = arg2;
		Static6.anInt4513 = arg0 / 128;
		Static4.anInt3329 = arg2 / 128;
		Static6.anInt4978 = Static6.anInt4513 - Static4.anInt3253;
		if (Static6.anInt4978 < 0) {
			Static6.anInt4978 = 0;
		}
		Static1.anInt890 = Static4.anInt3329 - Static4.anInt3253;
		if (Static1.anInt890 < 0) {
			Static1.anInt890 = 0;
		}
		Static2.anInt5778 = Static6.anInt4513 + Static4.anInt3253;
		if (Static2.anInt5778 > Static7.anInt5632) {
			Static2.anInt5778 = Static7.anInt5632;
		}
		Static2.anInt1344 = Static4.anInt3329 + Static4.anInt3253;
		if (Static2.anInt1344 > Static7.anInt5590) {
			Static2.anInt1344 = Static7.anInt5590;
		}
		@Pc(99) short local99;
		if (GlRenderer.enabled) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		for (@Pc(104) int local104 = 0; local104 < Static4.anInt3253 + Static4.anInt3253 + 2; local104++) {
			for (@Pc(113) int local113 = 0; local113 < Static4.anInt3253 + Static4.anInt3253 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static4.anInt3253 << 7) - (Static7.anInt5281 & 0x7F);
				@Pc(140) int local140 = (local113 - Static4.anInt3253 << 7) - (Static6.anInt4400 & 0x7F);
				@Pc(146) int local146 = Static6.anInt4513 + local104 - Static4.anInt3253;
				@Pc(152) int local152 = Static4.anInt3329 + local113 - Static4.anInt3253;
				if (local146 >= 0 && local152 >= 0 && local146 < Static7.anInt5632 && local152 < Static7.anInt5590) {
					@Pc(176) int local176;
					if (Static1.anIntArrayArrayArray2 == null) {
						local176 = Static6.anIntArrayArrayArray14[0][local146][local152] + 128 - Static6.anInt4375;
					} else {
						local176 = Static1.anIntArrayArrayArray2[0][local146][local152] + 128 - Static6.anInt4375;
					}
					@Pc(201) int local201 = Static6.anIntArrayArrayArray14[3][local146][local152] - Static6.anInt4375 - 1000;
					Static4.aBooleanArrayArray4[local104][local113] = Static9.method759(local130, local201, local176, local140, local99);
				} else {
					Static4.aBooleanArrayArray4[local104][local113] = false;
				}
			}
		}
		for (@Pc(225) int local225 = 0; local225 < Static4.anInt3253 + Static4.anInt3253 + 1; local225++) {
			for (@Pc(234) int local234 = 0; local234 < Static4.anInt3253 + Static4.anInt3253 + 1; local234++) {
				Static4.aBooleanArrayArray5[local225][local234] = Static4.aBooleanArrayArray4[local225][local234] || Static4.aBooleanArrayArray4[local225 + 1][local234] || Static4.aBooleanArrayArray4[local225][local234 + 1] || Static4.aBooleanArrayArray4[local225 + 1][local234 + 1];
			}
		}
		Static3.anIntArray170 = arg6;
		Static1.anIntArray63 = arg7;
		Static5.anIntArray399 = arg8;
		Static4.anIntArray309 = arg9;
		Static3.anIntArray226 = arg10;
		Static37.method4737();
		if (Static7.aClass4_Sub19ArrayArrayArray3 != null) {
			Static35.method4368(true);
			Static31.method3797(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (GlRenderer.enabled) {
				Static3.aBoolean175 = false;
				Static24.method2652(0, 0);
				method2772(null);
				Static27.method3112();
			}
			Static35.method4368(false);
		}
		Static31.method3797(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIBLclient!fh;)[Lclient!vn;")
	public static SoftwareSprite[] method2729(@OriginalArg(1) int arg0, @OriginalArg(3) Js5 arg1) {
		return Static9.method197(arg1, arg0, 0) ? Static8.method103() : null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!fh;II)Lclient!ml;")
	public static Class53_Sub3 method2752(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.fetchFile(arg1, 0);
		return local5 == null ? null : new Class53_Sub3(local5);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([[III)I")
	public static int method2762(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(7) int local7 = arg2 >> 7;
		if (local3 < 0 || local7 < 0 || local3 >= arg0.length || local7 >= arg0[0].length) {
			return 0;
		}
		@Pc(27) int local27 = arg1 & 0x7F;
		@Pc(31) int local31 = arg2 & 0x7F;
		@Pc(53) int local53 = arg0[local3][local7] * (128 - local27) + arg0[local3 + 1][local7] * local27 >> 7;
		@Pc(79) int local79 = arg0[local3][local7 + 1] * (128 - local27) + arg0[local3 + 1][local7 + 1] * local27 >> 7;
		return local53 * (128 - local31) + local79 * local31 >> 7;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public static void method2770() {
		if (Static3.aFloat68 < Static3.aFloat69) {
			Static3.aFloat68 = (float) ((double) Static3.aFloat68 + (double) Static3.aFloat68 / 30.0D);
			if (Static3.aFloat69 < Static3.aFloat68) {
				Static3.aFloat68 = Static3.aFloat69;
			}
			Static28.method3249();
		} else if (Static3.aFloat68 > Static3.aFloat69) {
			Static3.aFloat68 = (float) ((double) Static3.aFloat68 - (double) Static3.aFloat68 / 30.0D);
			if (Static3.aFloat68 < Static3.aFloat69) {
				Static3.aFloat68 = Static3.aFloat69;
			}
			Static28.method3249();
		}
		if (Static6.anInt4393 != -1 && Static1.anInt929 != -1) {
			@Pc(64) int local64 = Static1.anInt929 - Static7.anInt5231;
			@Pc(69) int local69 = Static6.anInt4393 - Static1.anInt331;
			if (local64 < 2 || local64 > 2) {
				local64 >>= 4;
			}
			Static7.anInt5231 -= -local64;
			if (local69 < 2 || local69 > 2) {
				local69 >>= 4;
			}
			if (local69 == 0 && local64 == 0) {
				Static1.anInt929 = -1;
				Static6.anInt4393 = -1;
			}
			Static1.anInt331 += local69;
			Static28.method3249();
		}
		if (Static4.anInt2853 > 0) {
			Static5.anInt4215--;
			if (Static5.anInt4215 == 0) {
				Static4.anInt2853--;
				Static5.anInt4215 = 100;
			}
		} else {
			Static5.anInt3920 = -1;
			Static2.anInt1874 = -1;
		}
		if (!Static3.aBoolean166 || Static3.aClass112_13 == null) {
			return;
		}
		for (@Pc(153) Class4_Sub17 local153 = (Class4_Sub17) Static3.aClass112_13.head(); local153 != null; local153 = (Class4_Sub17) Static3.aClass112_13.next()) {
			@Pc(161) Class82 local161 = Static22.method2191(local153.aClass4_Sub3_Sub7_1.anInt1760);
			if (Static1.anInt640 == 0 && local153.method2923(Mouse.x, Mouse.y)) {
				if (!local153.aClass4_Sub3_Sub7_1.aBoolean105) {
					local153.aClass4_Sub3_Sub7_1.aBoolean105 = true;
					ScriptRunner.method2710(15, local153.aClass4_Sub3_Sub7_1.anInt1760, local161.anInt2284);
				}
				if (local153.aClass4_Sub3_Sub7_1.aBoolean105) {
					ScriptRunner.method2710(17, local153.aClass4_Sub3_Sub7_1.anInt1760, local161.anInt2284);
				}
			} else if (local153.aClass4_Sub3_Sub7_1.aBoolean105) {
				local153.aClass4_Sub3_Sub7_1.aBoolean105 = false;
				ScriptRunner.method2710(16, local153.aClass4_Sub3_Sub7_1.anInt1760, local161.anInt2284);
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([F)V")
	public static void method2772(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = Static4.aFloatArray39;
		}
		@Pc(5) GL local5 = GlRenderer.gl;
		local5.glFogfv(GL.GL_FOG_COLOR, arg0, 0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()F")
	public static float method2773() {
		return Static4.aFloat82;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "()V")
	private static void method2774() {
		method2782(Static4.anInt3364, 1.1523438F, 0.69921875F, 1.2F);
		method2775(-50.0F, -60.0F, -50.0F);
		method2781(Static4.anInt3365, 0, false);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(FFF)V")
	public static void method2775(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (Static4.aFloatArray40[0] == arg0 && Static4.aFloatArray40[1] == arg1 && Static4.aFloatArray40[2] == arg2) {
			return;
		}
		Static4.aFloatArray40[0] = arg0;
		Static4.aFloatArray40[1] = arg1;
		Static4.aFloatArray40[2] = arg2;
		Static4.aFloatArray41[0] = -arg0;
		Static4.aFloatArray41[1] = -arg1;
		Static4.aFloatArray41[2] = -arg2;
		Static4.anInt3366 = (int) (arg0 * 256.0F / arg1);
		Static4.anInt3363 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "()F")
	public static float method2776() {
		return Static4.aFloat81;
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "()V")
	public static void method2777() {
		@Pc(1) GL local1 = GlRenderer.gl;
		local1.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, Static4.aFloatArray40, 0);
		local1.glLightfv(GL.GL_LIGHT1, GL.GL_POSITION, Static4.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "()I")
	public static int method2778() {
		return Static4.anInt3361;
	}

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "()V")
	public static void method2779() {
		@Pc(1) GL local1 = GlRenderer.gl;
		local1.glColorMaterial(GL.GL_FRONT, GL.GL_AMBIENT_AND_DIFFUSE);
		local1.glEnable(GL.GL_COLOR_MATERIAL);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, local27, 0);
		local1.glEnable(GL.GL_LIGHT0);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(GL.GL_LIGHT1, GL.GL_AMBIENT, local55, 0);
		local1.glEnable(GL.GL_LIGHT1);
		Static4.anInt3361 = -1;
		Static4.anInt3367 = -1;
		method2774();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIZ)V")
	public static void method2781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && Static4.anInt3367 == arg0 && Static4.anInt3362 == arg1) {
			return;
		}
		Static4.anInt3367 = arg0;
		Static4.anInt3362 = arg1;
		@Pc(14) GL local14 = GlRenderer.gl;
		Static4.aFloatArray39[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static4.aFloatArray39[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static4.aFloatArray39[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(GL.GL_FOG_MODE, GL.GL_LINEAR);
		local14.glFogf(GL.GL_FOG_DENSITY, 0.95F);
		local14.glHint(GL.GL_FOG_HINT, GL.GL_FASTEST);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(GL.GL_FOG_START, (float) local67);
		local14.glFogf(GL.GL_FOG_END, (float) 3328);
		local14.glFogfv(GL.GL_FOG_COLOR, Static4.aFloatArray39, 0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IFFF)V")
	public static void method2782(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (Static4.anInt3361 == arg0 && Static4.aFloat82 == arg1 && Static4.aFloat81 == arg2 && Static4.aFloat80 == arg3) {
			return;
		}
		Static4.anInt3361 = arg0;
		Static4.aFloat82 = arg1;
		Static4.aFloat81 = arg2;
		Static4.aFloat80 = arg3;
		@Pc(25) GL local25 = GlRenderer.gl;
		@Pc(34) float local34 = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		@Pc(43) float local43 = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		@Pc(50) float local50 = (float) (arg0 & 0xFF) / 255.0F;
		@Pc(75) float[] local75 = new float[] { arg1 * local34, arg1 * local43, arg1 * local50, 1.0F };
		local25.glLightModelfv(GL.GL_LIGHT_MODEL_AMBIENT, local75, 0);
		@Pc(105) float[] local105 = new float[] { arg2 * local34, arg2 * local43, arg2 * local50, 1.0F };
		local25.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, local105, 0);
		@Pc(139) float[] local139 = new float[] { -arg3 * local34, -arg3 * local43, -arg3 * local50, 1.0F };
		local25.glLightfv(GL.GL_LIGHT1, GL.GL_DIFFUSE, local139, 0);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	public static void method2811() {
		@Pc(3) int local3 = Static5.anInt3890;
		@Pc(5) int local5 = Static4.anInt3455;
		@Pc(13) int local13 = Static3.anInt2394 - 3;
		@Pc(21) int local21 = Static6.anInt4440;
		if (Static6.aClass4_Sub3_Sub14_5 == null || Static2.aClass4_Sub3_Sub14_2 == null) {
			if (client.js5Archive8.isFileReady(Static1.anInt771) && client.js5Archive8.isFileReady(Static4.anInt3336)) {
				Static6.aClass4_Sub3_Sub14_5 = Static31.method3691(client.js5Archive8, Static1.anInt771);
				Static2.aClass4_Sub3_Sub14_2 = Static31.method3691(client.js5Archive8, Static4.anInt3336);
				if (GlRenderer.enabled) {
					if (Static6.aClass4_Sub3_Sub14_5 instanceof SoftwareAlphaSprite) {
						Static6.aClass4_Sub3_Sub14_5 = new GlAlphaSprite((SoftwareSprite) Static6.aClass4_Sub3_Sub14_5);
					} else {
						Static6.aClass4_Sub3_Sub14_5 = new GlSprite((SoftwareSprite) Static6.aClass4_Sub3_Sub14_5);
					}
					if (Static2.aClass4_Sub3_Sub14_2 instanceof SoftwareAlphaSprite) {
						Static2.aClass4_Sub3_Sub14_2 = new GlAlphaSprite((SoftwareSprite) Static2.aClass4_Sub3_Sub14_2);
					} else {
						Static2.aClass4_Sub3_Sub14_2 = new GlSprite((SoftwareSprite) Static2.aClass4_Sub3_Sub14_2);
					}
				}
			} else if (GlRenderer.enabled) {
				Static18.method1691(local3, local5, local21, 20, Static5.anInt4293, 256 - Static3.anInt2587);
			} else {
				Static34.method4213(local3, local5, local21, 20, Static5.anInt4293, 256 - Static3.anInt2587);
			}
		}
		if (Static6.aClass4_Sub3_Sub14_5 != null && Static2.aClass4_Sub3_Sub14_2 != null) {
			@Pc(128) int local128 = (local21 - Static2.aClass4_Sub3_Sub14_2.width * 2) / Static6.aClass4_Sub3_Sub14_5.width;
			for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
				Static6.aClass4_Sub3_Sub14_5.method4506(local130 * Static6.aClass4_Sub3_Sub14_5.width + local3 + Static2.aClass4_Sub3_Sub14_2.width, local5);
			}
			Static2.aClass4_Sub3_Sub14_2.method4506(local3, local5);
			Static2.aClass4_Sub3_Sub14_2.method4511(local21 + local3 - Static2.aClass4_Sub3_Sub14_2.width, local5);
		}
		Static5.aClass4_Sub3_Sub5_3.method2259(LocalisedText.CHOOSE_OPTION, local3 + 3, local5 + 14, Static1.anInt504, -1);
		if (GlRenderer.enabled) {
			Static18.method1691(local3, local5 + 20, local21, local13 - 20, Static5.anInt4293, 256 - Static3.anInt2587);
		} else {
			Static34.method4213(local3, local5 + 20, local21, local13 - 20, Static5.anInt4293, 256 - Static3.anInt2587);
		}
		@Pc(211) int local211 = Mouse.x;
		@Pc(213) int local213 = Mouse.y;
		for (@Pc(215) int local215 = 0; local215 < Static7.anInt5634; local215++) {
			@Pc(233) int local233 = (Static7.anInt5634 - local215 - 1) * 15 + local5 + 20 + 13;
			if (local3 < local211 && local21 + local3 > local211 && local233 - 13 < local213 && local233 + 3 > local213) {
				if (GlRenderer.enabled) {
					Static18.method1691(local3, local233 - 12, local21, 15, Static1.anInt497, 256 - Static3.anInt2586);
				} else {
					Static34.method4213(local3, local233 - 12, local21, 15, Static1.anInt497, 256 - Static3.anInt2586);
				}
			}
		}
		if ((Static7.aClass4_Sub3_Sub14_9 == null || Static6.aClass4_Sub3_Sub14_8 == null || Static1.aClass4_Sub3_Sub14_1 == null) && client.js5Archive8.isFileReady(Static1.anInt593) && client.js5Archive8.isFileReady(Static4.anInt2741) && client.js5Archive8.isFileReady(Static1.anInt881)) {
			Static7.aClass4_Sub3_Sub14_9 = Static31.method3691(client.js5Archive8, Static1.anInt593);
			Static6.aClass4_Sub3_Sub14_8 = Static31.method3691(client.js5Archive8, Static4.anInt2741);
			Static1.aClass4_Sub3_Sub14_1 = Static31.method3691(client.js5Archive8, Static1.anInt881);
			if (GlRenderer.enabled) {
				if (Static7.aClass4_Sub3_Sub14_9 instanceof SoftwareAlphaSprite) {
					Static7.aClass4_Sub3_Sub14_9 = new GlAlphaSprite((SoftwareSprite) Static7.aClass4_Sub3_Sub14_9);
				} else {
					Static7.aClass4_Sub3_Sub14_9 = new GlSprite((SoftwareSprite) Static7.aClass4_Sub3_Sub14_9);
				}
				if (Static6.aClass4_Sub3_Sub14_8 instanceof SoftwareAlphaSprite) {
					Static6.aClass4_Sub3_Sub14_8 = new GlAlphaSprite((SoftwareSprite) Static6.aClass4_Sub3_Sub14_8);
				} else {
					Static6.aClass4_Sub3_Sub14_8 = new GlSprite((SoftwareSprite) Static6.aClass4_Sub3_Sub14_8);
				}
				if (Static1.aClass4_Sub3_Sub14_1 instanceof SoftwareAlphaSprite) {
					Static1.aClass4_Sub3_Sub14_1 = new GlAlphaSprite((SoftwareSprite) Static1.aClass4_Sub3_Sub14_1);
				} else {
					Static1.aClass4_Sub3_Sub14_1 = new GlSprite((SoftwareSprite) Static1.aClass4_Sub3_Sub14_1);
				}
			}
		}
		if (Static7.aClass4_Sub3_Sub14_9 != null && Static6.aClass4_Sub3_Sub14_8 != null && Static1.aClass4_Sub3_Sub14_1 != null) {
			@Pc(413) int local413 = (local21 - Static1.aClass4_Sub3_Sub14_1.width * 2) / Static7.aClass4_Sub3_Sub14_9.width;
			for (@Pc(415) int local415 = 0; local415 < local413; local415++) {
				Static7.aClass4_Sub3_Sub14_9.method4506(Static1.aClass4_Sub3_Sub14_1.width + local3 + Static7.aClass4_Sub3_Sub14_9.width * local415, local13 + local5 - Static7.aClass4_Sub3_Sub14_9.height);
			}
			@Pc(455) int local455 = (local13 - Static1.aClass4_Sub3_Sub14_1.height - 20) / Static6.aClass4_Sub3_Sub14_8.height;
			for (@Pc(457) int local457 = 0; local457 < local455; local457++) {
				Static6.aClass4_Sub3_Sub14_8.method4506(local3, local5 + Static6.aClass4_Sub3_Sub14_8.height * local457 + 20);
				Static6.aClass4_Sub3_Sub14_8.method4511(local3 + local21 - Static6.aClass4_Sub3_Sub14_8.width, local457 * Static6.aClass4_Sub3_Sub14_8.height + local5 + 20);
			}
			Static1.aClass4_Sub3_Sub14_1.method4506(local3, local13 + local5 - Static1.aClass4_Sub3_Sub14_1.height);
			Static1.aClass4_Sub3_Sub14_1.method4511(local21 + local3 - Static1.aClass4_Sub3_Sub14_1.width, local13 + local5 - Static1.aClass4_Sub3_Sub14_1.height);
		}
		for (@Pc(518) int local518 = 0; local518 < Static7.anInt5634; local518++) {
			@Pc(535) int local535 = local5 + (Static7.anInt5634 - local518 - 1) * 15 + 13 + 20;
			@Pc(537) int local537 = Static1.anInt504;
			if (local211 > local3 && local21 + local3 > local211 && local535 - 13 < local213 && local535 + 3 > local213) {
				local537 = Static4.anInt2920;
			}
			Static5.aClass4_Sub3_Sub5_3.method2259(Static26.method2992(local518), local3 + 3, local535, local537, 0);
		}
		Static16.method1559(Static5.anInt3890, Static4.anInt3455, Static3.anInt2394, Static6.anInt4440);
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)I")
	public static int method2812(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!na", name = "o", descriptor = "()V")
	public static void method2906() {
		Static4.aBoolean246 = false;
		Static4.anIntArray369 = null;
		Static4.anIntArray360 = null;
		Static4.anIntArray374 = new int[1600];
		Static4.anIntArrayArray32 = new int[1600][64];
		Static4.anIntArray363 = new int[32];
		Static4.anIntArrayArray31 = new int[32][512];
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
	public static int method2912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * (arg0 & 0x7F) >> 7;
		if (local7 < 2) {
			local7 = 2;
		} else if (local7 > 126) {
			local7 = 126;
		}
		return (arg0 & 0xFF80) + local7;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)I")
	public static int method2914(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!na", name = "r", descriptor = "()V")
	public static void method2915() {
		Static4.aBoolean246 = true;
		Static4.anIntArray369 = new int[4096];
		Static4.anIntArray360 = new int[4096];
		Static4.anIntArray374 = null;
		Static4.anIntArrayArray32 = null;
		Static4.anIntArray363 = null;
		Static4.anIntArrayArray31 = null;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method2925() {
		Static4.aClass26_28.clear();
		Static3.aClass26_23.clear();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)I")
	public static int method2926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(39) int local39 = Static35.method4331(arg1 + 91923, arg0 + 45365, 4) + (Static35.method4331(arg1 + 37821, arg0 + 10294, 2) - 128 >> 1) + (Static35.method4331(arg1, arg0, 1) - 128 >> 2) - 128;
		@Pc(47) int local47 = (int) ((double) local39 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
	public static void method2927(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static5.anIntArray447[local7] = Static5.anIntArray447[local7 - 1];
			Static3.aStringArray16[local7] = Static3.aStringArray16[local7 - 1];
			Static6.aStringArray31[local7] = Static6.aStringArray31[local7 - 1];
			Static1.aStringArray4[local7] = Static1.aStringArray4[local7 - 1];
			Static7.anIntArray598[local7] = Static7.anIntArray598[local7 - 1];
		}
		Static5.anIntArray447[0] = arg3;
		Static3.aStringArray16[0] = arg0;
		Static6.aStringArray31[0] = arg4;
		Static6.anInt5189 = Static6.anInt4979;
		Static7.anIntArray598[0] = arg1;
		Static5.anInt3469++;
		Static1.aStringArray4[0] = arg2;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V")
	public static void method2929(@OriginalArg(1) int arg0) {
		Static7.anInt5634--;
		if (Static7.anInt5634 == arg0) {
			return;
		}
		ArrayUtils.copy(Static6.aStringArray30, arg0 + 1, Static6.aStringArray30, arg0, Static7.anInt5634 - arg0);
		ArrayUtils.copy(Static6.aStringArray27, arg0 + 1, Static6.aStringArray27, arg0, Static7.anInt5634 - arg0);
		ArrayUtils.copy(Static2.anIntArray160, arg0 + 1, Static2.anIntArray160, arg0, Static7.anInt5634 - arg0);
		ArrayUtils.copy(Static6.aShortArray100, arg0 + 1, Static6.aShortArray100, arg0, Static7.anInt5634 - arg0);
		ArrayUtils.copy(Static4.aLongArray56, arg0 + 1, Static4.aLongArray56, arg0, Static7.anInt5634 - arg0);
		ArrayUtils.copy(Static2.anIntArray117, arg0 + 1, Static2.anIntArray117, arg0, Static7.anInt5634 - arg0);
		ArrayUtils.copy(Static6.anIntArray543, arg0 + 1, Static6.anIntArray543, arg0, Static7.anInt5634 - arg0);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public static void method2930() {
		Static1.aBoolean17 = false;
		Static7.anInt5634 = 0;
		Static1.anInt552 = -1;
		Static3.aClass4_Sub10_Sub1_1.position = 0;
		Static4.anInt3335 = -1;
		Static3.anInt2273 = -1;
		Static2.anInt1231 = -1;
		Static3.anInt2583 = 0;
		Static5.aClass4_Sub10_Sub1_2.position = 0;
		Static5.anInt4329 = 0;
		Static1.anInt1052 = 0;
		Static8.method115();
		for (@Pc(33) int local33 = 0; local33 < Static5.aClass53_Sub1_Sub1Array1.length; local33++) {
			if (Static5.aClass53_Sub1_Sub1Array1[local33] != null) {
				Static5.aClass53_Sub1_Sub1Array1[local33].anInt3985 = -1;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < Static3.aClass53_Sub1_Sub2Array1.length; local52++) {
			if (Static3.aClass53_Sub1_Sub2Array1[local52] != null) {
				Static3.aClass53_Sub1_Sub2Array1[local52].anInt3985 = -1;
			}
		}
		Inv.deleteAll();
		Static1.anInt772 = 1;
		Static9.method233(30);
		for (@Pc(82) int local82 = 0; local82 < 100; local82++) {
			Static2.aBooleanArray8[local82] = true;
		}
		Static21.method2001();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!p;)V")
	public static void method2931(@OriginalArg(1) Npc arg0) {
		for (@Pc(14) Class4_Sub11 local14 = (Class4_Sub11) Static2.aClass112_9.head(); local14 != null; local14 = (Class4_Sub11) Static2.aClass112_9.next()) {
			if (arg0 == local14.aClass53_Sub1_Sub2_1) {
				if (local14.aClass4_Sub6_Sub4_3 != null) {
					Static5.aClass4_Sub6_Sub3_2.method2670(local14.aClass4_Sub6_Sub4_3);
					local14.aClass4_Sub6_Sub4_3 = null;
				}
				local14.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Lclient!dm;")
	public static Class42 method2932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class42 local14 = local7.aClass42_1;
			local7.aClass42_1 = null;
			return local14;
		}
	}
}

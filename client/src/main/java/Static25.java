import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method2728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= SceneGraph.width * 128) {
			arg0 = SceneGraph.width * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= SceneGraph.length * 128) {
			arg2 = SceneGraph.length * 128 - 1;
		}
		Static2.anInt2247 = MathUtils.SINE[arg3];
		Static5.anInt3487 = MathUtils.COSINE[arg3];
		Static6.anInt4794 = MathUtils.SINE[arg4];
		Static3.anInt2272 = MathUtils.COSINE[arg4];
		Static7.anInt5281 = arg0;
		Static6.anInt4375 = arg1;
		Static6.anInt4400 = arg2;
		Static6.anInt4513 = arg0 / 128;
		Static4.anInt3329 = arg2 / 128;
		Static6.anInt4978 = Static6.anInt4513 - SceneGraph.anInt3253;
		if (Static6.anInt4978 < 0) {
			Static6.anInt4978 = 0;
		}
		Static1.anInt890 = Static4.anInt3329 - SceneGraph.anInt3253;
		if (Static1.anInt890 < 0) {
			Static1.anInt890 = 0;
		}
		Static2.anInt5778 = Static6.anInt4513 + SceneGraph.anInt3253;
		if (Static2.anInt5778 > SceneGraph.width) {
			Static2.anInt5778 = SceneGraph.width;
		}
		Static2.anInt1344 = Static4.anInt3329 + SceneGraph.anInt3253;
		if (Static2.anInt1344 > SceneGraph.length) {
			Static2.anInt1344 = SceneGraph.length;
		}
		@Pc(99) short local99;
		if (GlRenderer.enabled) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		for (@Pc(104) int local104 = 0; local104 < SceneGraph.anInt3253 + SceneGraph.anInt3253 + 2; local104++) {
			for (@Pc(113) int local113 = 0; local113 < SceneGraph.anInt3253 + SceneGraph.anInt3253 + 2; local113++) {
				@Pc(130) int local130 = (local104 - SceneGraph.anInt3253 << 7) - (Static7.anInt5281 & 0x7F);
				@Pc(140) int local140 = (local113 - SceneGraph.anInt3253 << 7) - (Static6.anInt4400 & 0x7F);
				@Pc(146) int local146 = Static6.anInt4513 + local104 - SceneGraph.anInt3253;
				@Pc(152) int local152 = Static4.anInt3329 + local113 - SceneGraph.anInt3253;
				if (local146 >= 0 && local152 >= 0 && local146 < SceneGraph.width && local152 < SceneGraph.length) {
					@Pc(176) int local176;
					if (SceneGraph.underwaterTileHeights == null) {
						local176 = SceneGraph.surfaceTileHeights[0][local146][local152] + 128 - Static6.anInt4375;
					} else {
						local176 = SceneGraph.underwaterTileHeights[0][local146][local152] + 128 - Static6.anInt4375;
					}
					@Pc(201) int local201 = SceneGraph.surfaceTileHeights[3][local146][local152] - Static6.anInt4375 - 1000;
					SceneGraph.aBooleanArrayArray4[local104][local113] = Static9.method759(local130, local201, local176, local140, local99);
				} else {
					SceneGraph.aBooleanArrayArray4[local104][local113] = false;
				}
			}
		}
		for (@Pc(225) int local225 = 0; local225 < SceneGraph.anInt3253 + SceneGraph.anInt3253 + 1; local225++) {
			for (@Pc(234) int local234 = 0; local234 < SceneGraph.anInt3253 + SceneGraph.anInt3253 + 1; local234++) {
				SceneGraph.aBooleanArrayArray5[local225][local234] = SceneGraph.aBooleanArrayArray4[local225][local234] || SceneGraph.aBooleanArrayArray4[local225 + 1][local234] || SceneGraph.aBooleanArrayArray4[local225][local234 + 1] || SceneGraph.aBooleanArrayArray4[local225 + 1][local234 + 1];
			}
		}
		Static3.anIntArray170 = arg6;
		Static1.anIntArray63 = arg7;
		Static5.anIntArray399 = arg8;
		Static4.anIntArray309 = arg9;
		Static3.anIntArray226 = arg10;
		Static37.method4737();
		if (SceneGraph.underwaterTiles != null) {
			SceneGraph.setUnderwater(true);
			Static31.method3797(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (GlRenderer.enabled) {
				MaterialManager.renderingUnderwater = false;
				MaterialManager.setMaterial(0, 0);
				method2772(null);
				LightingManager.method3112();
			}
			SceneGraph.setUnderwater(false);
		}
		Static31.method3797(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
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
			@Pc(161) MelType local161 = MelTypeList.get(local153.element.id);
			if (Static1.anInt640 == 0 && local153.method2923(Mouse.x, Mouse.y)) {
				if (!local153.element.hover) {
					local153.element.hover = true;
					ScriptRunner.method2710(15, local153.element.id, local161.category);
				}
				if (local153.element.hover) {
					ScriptRunner.method2710(17, local153.element.id, local161.category);
				}
			} else if (local153.element.hover) {
				local153.element.hover = false;
				ScriptRunner.method2710(16, local153.element.id, local161.category);
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([F)V")
	public static void method2772(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = Static4.aFloatArray39;
		}
		@Pc(5) GL gl = GlRenderer.gl;
		gl.glFogfv(GL.GL_FOG_COLOR, arg0, 0);
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
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, Static4.aFloatArray40, 0);
		gl.glLightfv(GL.GL_LIGHT1, GL.GL_POSITION, Static4.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "()I")
	public static int method2778() {
		return Static4.anInt3361;
	}

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "()V")
	public static void method2779() {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glColorMaterial(GL.GL_FRONT, GL.GL_AMBIENT_AND_DIFFUSE);
		gl.glEnable(GL.GL_COLOR_MATERIAL);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, local27, 0);
		gl.glEnable(GL.GL_LIGHT0);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		gl.glLightfv(GL.GL_LIGHT1, GL.GL_AMBIENT, local55, 0);
		gl.glEnable(GL.GL_LIGHT1);
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
		@Pc(14) GL gl = GlRenderer.gl;
		Static4.aFloatArray39[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static4.aFloatArray39[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static4.aFloatArray39[2] = (float) (arg0 & 0xFF) / 255.0F;
		gl.glFogi(GL.GL_FOG_MODE, GL.GL_LINEAR);
		gl.glFogf(GL.GL_FOG_DENSITY, 0.95F);
		gl.glHint(GL.GL_FOG_HINT, GL.GL_FASTEST);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		gl.glFogf(GL.GL_FOG_START, (float) local67);
		gl.glFogf(GL.GL_FOG_END, (float) 3328);
		gl.glFogfv(GL.GL_FOG_COLOR, Static4.aFloatArray39, 0);
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
		@Pc(25) GL gl = GlRenderer.gl;
		@Pc(34) float local34 = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		@Pc(43) float local43 = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		@Pc(50) float local50 = (float) (arg0 & 0xFF) / 255.0F;
		@Pc(75) float[] local75 = new float[] { arg1 * local34, arg1 * local43, arg1 * local50, 1.0F };
		gl.glLightModelfv(GL.GL_LIGHT_MODEL_AMBIENT, local75, 0);
		@Pc(105) float[] local105 = new float[] { arg2 * local34, arg2 * local43, arg2 * local50, 1.0F };
		gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, local105, 0);
		@Pc(139) float[] local139 = new float[] { -arg3 * local34, -arg3 * local43, -arg3 * local50, 1.0F };
		gl.glLightfv(GL.GL_LIGHT1, GL.GL_DIFFUSE, local139, 0);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	public static void method2811() {
		@Pc(3) int local3 = Static5.anInt3890;
		@Pc(5) int local5 = Static4.anInt3455;
		@Pc(13) int local13 = Static3.anInt2394 - 3;
		@Pc(21) int local21 = Static6.anInt4440;
		if (Static6.aClass4_Sub3_Sub14_5 == null || Static2.aClass4_Sub3_Sub14_2 == null) {
			if (client.js5Archive8.isFileReady(Static1.anInt771) && client.js5Archive8.isFileReady(Static4.anInt3336)) {
				Static6.aClass4_Sub3_Sub14_5 = SpriteLoader.loadSoftwareAlphaSprite(client.js5Archive8, Static1.anInt771);
				Static2.aClass4_Sub3_Sub14_2 = SpriteLoader.loadSoftwareAlphaSprite(client.js5Archive8, Static4.anInt3336);
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
				GlRaster.fillRectAlpha(local3, local5, local21, 20, Static5.anInt4293, 256 - Static3.anInt2587);
			} else {
				SoftwareRaster.fillRectAlpha(local3, local5, local21, 20, Static5.anInt4293, 256 - Static3.anInt2587);
			}
		}
		if (Static6.aClass4_Sub3_Sub14_5 != null && Static2.aClass4_Sub3_Sub14_2 != null) {
			@Pc(128) int local128 = (local21 - Static2.aClass4_Sub3_Sub14_2.width * 2) / Static6.aClass4_Sub3_Sub14_5.width;
			for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
				Static6.aClass4_Sub3_Sub14_5.renderTransparent(local130 * Static6.aClass4_Sub3_Sub14_5.width + local3 + Static2.aClass4_Sub3_Sub14_2.width, local5);
			}
			Static2.aClass4_Sub3_Sub14_2.renderTransparent(local3, local5);
			Static2.aClass4_Sub3_Sub14_2.renderHorizontalFlipTransparent(local21 + local3 - Static2.aClass4_Sub3_Sub14_2.width, local5);
		}
		Fonts.b12Full.method2259(LocalisedText.CHOOSE_OPTION, local3 + 3, local5 + 14, Static1.anInt504, -1);
		if (GlRenderer.enabled) {
			GlRaster.fillRectAlpha(local3, local5 + 20, local21, local13 - 20, Static5.anInt4293, 256 - Static3.anInt2587);
		} else {
			SoftwareRaster.fillRectAlpha(local3, local5 + 20, local21, local13 - 20, Static5.anInt4293, 256 - Static3.anInt2587);
		}
		@Pc(211) int local211 = Mouse.x;
		@Pc(213) int local213 = Mouse.y;
		for (@Pc(215) int local215 = 0; local215 < Static7.anInt5634; local215++) {
			@Pc(233) int local233 = (Static7.anInt5634 - local215 - 1) * 15 + local5 + 20 + 13;
			if (local3 < local211 && local21 + local3 > local211 && local233 - 13 < local213 && local233 + 3 > local213) {
				if (GlRenderer.enabled) {
					GlRaster.fillRectAlpha(local3, local233 - 12, local21, 15, Static1.anInt497, 256 - Static3.anInt2586);
				} else {
					SoftwareRaster.fillRectAlpha(local3, local233 - 12, local21, 15, Static1.anInt497, 256 - Static3.anInt2586);
				}
			}
		}
		if ((Static7.aClass4_Sub3_Sub14_9 == null || Static6.aClass4_Sub3_Sub14_8 == null || Static1.aClass4_Sub3_Sub14_1 == null) && client.js5Archive8.isFileReady(Static1.anInt593) && client.js5Archive8.isFileReady(Static4.anInt2741) && client.js5Archive8.isFileReady(Static1.anInt881)) {
			Static7.aClass4_Sub3_Sub14_9 = SpriteLoader.loadSoftwareAlphaSprite(client.js5Archive8, Static1.anInt593);
			Static6.aClass4_Sub3_Sub14_8 = SpriteLoader.loadSoftwareAlphaSprite(client.js5Archive8, Static4.anInt2741);
			Static1.aClass4_Sub3_Sub14_1 = SpriteLoader.loadSoftwareAlphaSprite(client.js5Archive8, Static1.anInt881);
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
				Static7.aClass4_Sub3_Sub14_9.renderTransparent(Static1.aClass4_Sub3_Sub14_1.width + local3 + Static7.aClass4_Sub3_Sub14_9.width * local415, local13 + local5 - Static7.aClass4_Sub3_Sub14_9.height);
			}
			@Pc(455) int local455 = (local13 - Static1.aClass4_Sub3_Sub14_1.height - 20) / Static6.aClass4_Sub3_Sub14_8.height;
			for (@Pc(457) int local457 = 0; local457 < local455; local457++) {
				Static6.aClass4_Sub3_Sub14_8.renderTransparent(local3, local5 + Static6.aClass4_Sub3_Sub14_8.height * local457 + 20);
				Static6.aClass4_Sub3_Sub14_8.renderHorizontalFlipTransparent(local3 + local21 - Static6.aClass4_Sub3_Sub14_8.width, local457 * Static6.aClass4_Sub3_Sub14_8.height + local5 + 20);
			}
			Static1.aClass4_Sub3_Sub14_1.renderTransparent(local3, local13 + local5 - Static1.aClass4_Sub3_Sub14_1.height);
			Static1.aClass4_Sub3_Sub14_1.renderHorizontalFlipTransparent(local21 + local3 - Static1.aClass4_Sub3_Sub14_1.width, local13 + local5 - Static1.aClass4_Sub3_Sub14_1.height);
		}
		for (@Pc(518) int local518 = 0; local518 < Static7.anInt5634; local518++) {
			@Pc(535) int local535 = local5 + (Static7.anInt5634 - local518 - 1) * 15 + 13 + 20;
			@Pc(537) int local537 = Static1.anInt504;
			if (local211 > local3 && local21 + local3 > local211 && local535 - 13 < local213 && local535 + 3 > local213) {
				local537 = Static4.anInt2920;
			}
			Fonts.b12Full.method2259(Static26.method2992(local518), local3 + 3, local535, local537, 0);
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
		Protocol.opcode = -1;
		Protocol.outboundBuffer.position = 0;
		Static4.anInt3335 = -1;
		Static3.anInt2273 = -1;
		Static2.anInt1231 = -1;
		Static3.anInt2583 = 0;
		Protocol.inboundBuffer.position = 0;
		Static5.anInt4329 = 0;
		Protocol.length = 0;
		Static8.method115();
		for (@Pc(33) int i = 0; i < PlayerList.players.length; i++) {
			if (PlayerList.players[i] != null) {
				PlayerList.players[i].anInt3985 = -1;
			}
		}
		for (@Pc(52) int i = 0; i < NpcList.npcs.length; i++) {
			if (NpcList.npcs[i] != null) {
				NpcList.npcs[i].anInt3985 = -1;
			}
		}
		Inv.deleteAll();
		Static1.anInt772 = 1;
		Static9.method233(30);
		for (@Pc(82) int i = 0; i < 100; i++) {
			Static2.aBooleanArray8[i] = true;
		}
		Static21.method2001();
	}

}

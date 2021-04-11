import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	public static void method2563() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static3.aBooleanArray13[local7] = false;
		}
		Static5.anInt5195 = -1;
		Static6.anInt4838 = 0;
		Static1.anInt212 = 0;
		Static4.anInt3024 = -1;
		Static1.anInt772 = 1;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	public static void method2567() {
		if (!GlRenderer.enabled || Static4.aBoolean189) {
			return;
		}
		@Pc(22) Tile[][][] local22 = SceneGraph.tiles;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(32) Tile[][] local32 = local22[local24];
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				for (@Pc(44) int local44 = 0; local44 < local32[local34].length; local44++) {
					@Pc(60) Tile local60 = local32[local34][local44];
					if (local60 != null) {
						if (local60.groundDecor != null && local60.groundDecor.entity instanceof GlModel) {
							@Pc(76) GlModel local76 = (GlModel) local60.groundDecor.entity;
							if ((Long.MIN_VALUE & local60.groundDecor.key) == 0L) {
								local76.method3872(false, true, true, false, true, true);
							} else {
								local76.method3872(true, true, true, true, true, true);
							}
						}
						if (local60.wallDecor != null) {
							if (local60.wallDecor.primary instanceof GlModel) {
								@Pc(118) GlModel local118 = (GlModel) local60.wallDecor.primary;
								if ((local60.wallDecor.key & Long.MIN_VALUE) == 0L) {
									local118.method3872(false, true, true, false, true, true);
								} else {
									local118.method3872(true, true, true, true, true, true);
								}
							}
							if (local60.wallDecor.secondary instanceof GlModel) {
								@Pc(157) GlModel local157 = (GlModel) local60.wallDecor.secondary;
								if ((Long.MIN_VALUE & local60.wallDecor.key) == 0L) {
									local157.method3872(false, true, true, false, true, true);
								} else {
									local157.method3872(true, true, true, true, true, true);
								}
							}
						}
						if (local60.wall != null) {
							if (local60.wall.primary instanceof GlModel) {
								@Pc(199) GlModel local199 = (GlModel) local60.wall.primary;
								if ((Long.MIN_VALUE & local60.wall.key) == 0L) {
									local199.method3872(false, true, true, false, true, true);
								} else {
									local199.method3872(true, true, true, true, true, true);
								}
							}
							if (local60.wall.secondary instanceof GlModel) {
								@Pc(237) GlModel local237 = (GlModel) local60.wall.secondary;
								if ((local60.wall.key & Long.MIN_VALUE) == 0L) {
									local237.method3872(false, true, true, false, true, true);
								} else {
									local237.method3872(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(269) int local269 = 0; local269 < local60.sceneryLen; local269++) {
							if (local60.scenery[local269].entity instanceof GlModel) {
								@Pc(288) GlModel local288 = (GlModel) local60.scenery[local269].entity;
								if ((Long.MIN_VALUE & local60.scenery[local269].key) == 0L) {
									local288.method3872(false, true, true, false, true, true);
								} else {
									local288.method3872(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static4.aBoolean189 = true;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!wf;B)Ljava/lang/String;")
	public static String method2597(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1) {
		if (!InterfaceList.getServerActiveProperties(arg1).isButtonEnabled(arg0) && arg1.onOp == null) {
			return null;
		} else if (arg1.ops == null || arg0 >= arg1.ops.length || arg1.ops[arg0] == null || arg1.ops[arg0].trim().length() == 0) {
			return Static1.qaOpTest ? "Hidden-" + arg0 : null;
		} else {
			return arg1.ops[arg0];
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)I")
	public static int rotateZ(@OriginalArg(0) int angle, @OriginalArg(2) int x, @OriginalArg(3) int z) {
		angle &= 3;
		if (angle == 0) {
			return z;
		} else if (angle == 1) {
			return 7 - x;
		} else if (angle == 2) {
			return 7 - z;
		} else {
			return x;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static void method2680(@OriginalArg(1) int arg0) {
		Static3.anIntArray164 = new int[arg0];
		Static6.anIntArray492 = new int[arg0];
		Static5.anIntArray440 = new int[arg0];
		Static7.anIntArray620 = new int[arg0];
		Static6.anIntArray489 = new int[arg0];
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIIZIIZ)V")
	public static void setWindowMode(@OriginalArg(1) int width, @OriginalArg(2) int arg1, @OriginalArg(3) boolean replaceCanvas, @OriginalArg(4) int height, @OriginalArg(5) int mode, @OriginalArg(6) boolean arg5) {
		if (arg5) {
			GlRenderer.quit();
		}
		if (GameShell.fullScreenFrame != null && (mode != 3 || width != Preferences.fullScreenWidth || height != Preferences.fullScreenHeight)) {
			DisplayMode.exitFullScreen(GameShell.signLink, GameShell.fullScreenFrame);
			GameShell.fullScreenFrame = null;
		}
		if (mode == 3 && GameShell.fullScreenFrame == null) {
			GameShell.fullScreenFrame = DisplayMode.enterFullScreen(GameShell.signLink, width, height, 0);
			if (GameShell.fullScreenFrame != null) {
				Preferences.fullScreenWidth = width;
				Preferences.fullScreenHeight = height;
				Preferences.write(GameShell.signLink);
			}
		}
		if (mode == 3 && GameShell.fullScreenFrame == null) {
			setWindowMode(-1, arg1, true, -1, Preferences.windowMode, true);
			return;
		}
		@Pc(83) Container container;
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
			@Pc(110) Insets local110 = GameShell.frame.getInsets();
			GameShell.frameWidth -= local110.right + local110.left;
			GameShell.frameHeight -= local110.top + local110.bottom;
		}
		if (mode >= 2) {
			GameShell.topMargin = 0;
			GameShell.canvasWidth = GameShell.frameWidth;
			GameShell.leftMargin = 0;
			GameShell.canvasHeight = GameShell.frameHeight;
		} else {
			GameShell.leftMargin = (GameShell.frameWidth - 765) / 2;
			GameShell.canvasWidth = 765;
			GameShell.canvasHeight = 503;
			GameShell.topMargin = 0;
		}
		if (replaceCanvas) {
			Keyboard.stop(GameShell.canvas);
			Mouse.stop(GameShell.canvas);
			if (client.mouseWheel != null) {
				client.mouseWheel.stop(GameShell.canvas);
			}
			client.instance.addCanvas();
			Keyboard.start(GameShell.canvas);
			Mouse.start(GameShell.canvas);
			if (client.mouseWheel != null) {
				client.mouseWheel.start(GameShell.canvas);
			}
		} else {
			if (GlRenderer.enabled) {
				GlRenderer.setCanvasSize(GameShell.canvasWidth, GameShell.canvasHeight);
			}
			GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
			if (container == GameShell.frame) {
				@Pc(208) Insets local208 = GameShell.frame.getInsets();
				GameShell.canvas.setLocation(GameShell.leftMargin + local208.left, GameShell.topMargin + local208.top);
			} else {
				GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
			}
		}
		if (mode == 0 && arg1 > 0) {
			GlRenderer.createAndDestroyContext(GameShell.canvas);
		}
		if (arg5 && mode > 0) {
			GameShell.canvas.setIgnoreRepaint(true);
			if (!Static2.aBoolean76) {
				SceneGraph.clear();
				client.frameBuffer = null;
				client.frameBuffer = FrameBuffer.create(GameShell.canvas, GameShell.canvasWidth, GameShell.canvasHeight);
				SoftwareRaster.clear();
				if (Static4.anInt3304 == 5) {
					Static28.method3331(true, Fonts.b12Full);
				} else {
					Static37.method4716(LocalisedText.LOADING, false);
				}
				try {
					@Pc(268) Graphics graphics = GameShell.canvas.getGraphics();
					client.frameBuffer.draw(graphics);
				} catch (@Pc(276) Exception ex) {
				}
				Static29.method3430();
				if (arg1 == 0) {
					client.frameBuffer = FrameBuffer.create(GameShell.canvas, 765, 503);
				} else {
					client.frameBuffer = null;
				}
				@Pc(299) PrivilegedRequest request = GameShell.signLink.loadGlNatives(client.instance.getClass());
				while (request.status == 0) {
					ThreadUtils.sleep(100L);
				}
				if (request.status == 1) {
					Static2.aBoolean76 = true;
				}
			}
			if (Static2.aBoolean76) {
				GlRenderer.init(GameShell.canvas, Static2.anInt1125 * 2);
			}
		}
		if (!GlRenderer.enabled && mode > 0) {
			setWindowMode(-1, arg1, true, -1, 0, true);
			return;
		}
		if (mode > 0 && arg1 == 0) {
			GameShell.thread.setPriority(5);
			client.frameBuffer = null;
			SoftwareModel.method2915();
			((Js5GlTextureProvider) Static4.textureProvider).resize(200);
			if (Preferences.highDetailLighting) {
				ColorUtils.setBrightness(0.7F);
			}
			if (Static5.environments == null) {
				Static5.environments = new Environment[13][13];
			}
			LightingManager.method3109();
			Static14.method1205();
			Static36.method4447();
		} else if (mode == 0 && arg1 > 0) {
			GameShell.thread.setPriority(1);
			client.frameBuffer = FrameBuffer.create(GameShell.canvas, 765, 503);
			SoftwareModel.method2906();
			Static26.method2951();
			((Js5GlTextureProvider) Static4.textureProvider).resize(20);
			if (Preferences.highDetailLighting) {
				if (Preferences.brightness == 1) {
					ColorUtils.setBrightness(0.9F);
				}
				if (Preferences.brightness == 2) {
					ColorUtils.setBrightness(0.8F);
				}
				if (Preferences.brightness == 3) {
					ColorUtils.setBrightness(0.7F);
				}
				if (Preferences.brightness == 4) {
					ColorUtils.setBrightness(0.6F);
				}
			}
			Static19.method1868();
			Static36.method4447();
		}
		Static6.aBoolean313 = !SceneGraph.isAllLevelsVisible();
		Static26.method2966(GameShell.canvasWidth, GameShell.canvasHeight);
		if (arg5) {
			Static11.method516();
		}
		if (mode < 2) {
			Static4.aBoolean184 = false;
		} else {
			Static4.aBoolean184 = true;
		}
		if (InterfaceList.topLevelInterface != -1) {
			Static12.method777(true);
		}
		if (Protocol.socket != null && (Static4.anInt3304 == 30 || Static4.anInt3304 == 25)) {
			Static21.method2001();
		}
		for (@Pc(490) int local490 = 0; local490 < 100; local490++) {
			Static2.aBooleanArray8[local490] = true;
		}
		GameShell.fullRedraw = true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIII)V")
	public static void method2945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) String command = "::tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(command);
		Cheat.execute(command);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIII)V")
	public static void method2947(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static10.method384(false);
		Static2.aBoolean82 = arg0;
		Static6.anInt4953 = arg2;
		Static3.anInt2571 = arg1;
		WorldMap.setCurrentMap(arg3);
		Static3.aClass84_10 = new HashTable(8);
		Static3.aClass84_9 = new HashTable(8);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!fh;IBIIZ)V")
	public static void method2692(@OriginalArg(1) Js5 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static3.anInt5397 = 2;
		Static7.anInt6022 = arg2;
		Static2.aClass58_42 = arg0;
		Static6.aBoolean321 = false;
		Static2.anInt1244 = 0;
		Static7.anInt5391 = arg1;
		Static5.anInt4357 = 1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method2697() {
		FloTypeList.clear();
		FluTypeList.clear();
		IdkTypeList.clear();
		LocTypeList.clear();
		NpcTypeList.clear();
		ObjTypeList.clear();
		SeqTypeList.clear();
		SpotAnimTypeList.clear();
		VarbitTypeList.clear();
		VarpTypeList.clear();
		BasTypeList.clear();
		MsiTypeList.clear();
		MelTypeList.clear();
		SkyBoxTypeList.clear();
		SkyBoxSphereTypeList.clear();
		LightTypeList.clear();
		CursorTypeList.clear();
		PlayerAppearance.clear();
		Component.clear();
		if (client.modeWhat != 0) {
			for (@Pc(54) int local54 = 0; local54 < Static6.aByteArrayArray35.length; local54++) {
				Static6.aByteArrayArray35[local54] = null;
			}
			Static7.anInt5425 = 0;
		}
		Static10.method301();
		Static30.method420();
		ParticleEmitterTypeList.clear();
		ParticleEffectorTypeList.clear();
		Static1.aClass26_3.clear();
		if (!GlRenderer.enabled) {
			((Js5GlTextureProvider) Static4.textureProvider).clear();
		}
		ClientScriptList.scripts.clear();
		client.js5Archive0.discardUnpacked();
		client.js5Archive1.discardUnpacked();
		client.js5Archive3.discardUnpacked();
		client.js5Archive4.discardUnpacked();
		client.js5Archive5.discardUnpacked();
		client.js5Archive6.discardUnpacked();
		client.js5Archive7.discardUnpacked();
		client.js5Archive8.discardUnpacked();
		client.js5Archive10.discardUnpacked();
		client.js5Archive11.discardUnpacked();
		client.js5Archive12.discardUnpacked();
		Static1.aClass26_5.clear();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public static void method2702(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static5.anInt3897 += arg0 * 128;
		if (Static2.anIntArray159.length < Static5.anInt3897) {
			Static5.anInt3897 -= Static2.anIntArray159.length;
			@Pc(41) int local41 = (int) (Math.random() * 12.0D);
			Static22.method2284(Static2.aClass56_Sub1Array1[local41]);
		}
		@Pc(48) int local48 = 0;
		@Pc(52) int local52 = arg0 * 128;
		@Pc(59) int local59 = (256 - arg0) * 128;
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			@Pc(94) int local94 = Static2.anIntArray100[local52 + local48] - arg0 * Static2.anIntArray159[Static5.anInt3897 + local48 & Static2.anIntArray159.length - 1] / 6;
			if (local94 < 0) {
				local94 = 0;
			}
			Static2.anIntArray100[local48++] = local94;
		}
		for (@Pc(114) int local114 = 256 - arg0; local114 < 256; local114++) {
			@Pc(125) int local125 = local114 * 128;
			for (@Pc(127) int local127 = 0; local127 < 128; local127++) {
				@Pc(135) int local135 = (int) (Math.random() * 100.0D);
				if (local135 < 50 && local127 > 10 && local127 < 118) {
					Static2.anIntArray100[local125 + local127] = 255;
				} else {
					Static2.anIntArray100[local125 + local127] = 0;
				}
			}
		}
		for (@Pc(170) int local170 = 0; local170 < 256 - arg0; local170++) {
			Static4.anIntArray314[local170] = Static4.anIntArray314[local170 + arg0];
		}
		for (@Pc(197) int local197 = 256 - arg0; local197 < 256; local197++) {
			Static4.anIntArray314[local197] = (int) (Math.sin((double) Static4.anInt2665 / 14.0D) * 16.0D + Math.sin((double) Static4.anInt2665 / 15.0D) * 14.0D + Math.sin((double) Static4.anInt2665 / 16.0D) * 12.0D);
			Static4.anInt2665++;
		}
		Static3.anInt2297 += arg0;
		@Pc(247) int local247 = (arg0 + (client.loop & 0x1)) / 2;
		if (local247 <= 0) {
			return;
		}
		for (@Pc(251) int local251 = 0; local251 < Static3.anInt2297; local251++) {
			@Pc(261) int local261 = (int) (Math.random() * 124.0D) + 2;
			@Pc(268) int local268 = (int) (Math.random() * 128.0D) + 128;
			Static2.anIntArray100[(local268 << 7) + local261] = 192;
		}
		Static3.anInt2297 = 0;
		for (@Pc(283) int local283 = 0; local283 < 256; local283++) {
			@Pc(288) int local288 = 0;
			@Pc(292) int local292 = local283 * 128;
			for (@Pc(295) int local295 = -local247; local295 < 128; local295++) {
				if (local295 + local247 < 128) {
					local288 += Static2.anIntArray100[local247 + local295 + local292];
				}
				if (local295 - local247 - 1 >= 0) {
					local288 -= Static2.anIntArray100[local292 + local295 - local247 - 1];
				}
				if (local295 >= 0) {
					Static6.anIntArray541[local295 + local292] = local288 / (local247 * 2 + 1);
				}
			}
		}
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			@Pc(368) int local368 = 0;
			for (@Pc(371) int local371 = -local247; local371 < 256; local371++) {
				@Pc(382) int local382 = local371 * 128;
				if (local371 + local247 < 256) {
					local368 += Static6.anIntArray541[local382 + local361 + local247 * 128];
				}
				if (local371 - local247 - 1 >= 0) {
					local368 -= Static6.anIntArray541[local382 + local361 - local247 * 128 - 128];
				}
				if (local371 >= 0) {
					Static2.anIntArray100[local382 + local361] = local368 / (local247 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!qc;I)V")
	public static void method2705(@OriginalArg(0) PathingEntity arg0) {
		if (client.loop == arg0.anInt3966 || arg0.seqId == -1 || arg0.anInt3996 != 0 || arg0.anInt4044 + 1 > SeqTypeList.get(arg0.seqId).anIntArray94[arg0.anInt3970]) {
			@Pc(41) int local41 = arg0.anInt3966 - arg0.anInt4034;
			@Pc(46) int local46 = client.loop - arg0.anInt4034;
			@Pc(57) int local57 = arg0.anInt3973 * 128 + arg0.getSize() * 64;
			@Pc(71) int local71 = arg0.anInt4033 * 128 + arg0.getSize() * 64;
			@Pc(82) int local82 = arg0.anInt4013 * 128 + arg0.getSize() * 64;
			@Pc(95) int local95 = arg0.anInt4025 * 128 + arg0.getSize() * 64;
			arg0.zFine = ((local41 - local46) * local71 + local46 * local95) / local41;
			arg0.xFine = (local57 * (local41 - local46) + local82 * local46) / local41;
		}
		if (arg0.anInt4008 == 0) {
			arg0.targetAngle = 1024;
		}
		if (arg0.anInt4008 == 1) {
			arg0.targetAngle = 1536;
		}
		if (arg0.anInt4008 == 2) {
			arg0.targetAngle = 0;
		}
		arg0.movementBlockedLoops = 0;
		if (arg0.anInt4008 == 3) {
			arg0.targetAngle = 512;
		}
		arg0.angle = arg0.targetAngle;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
	public static void method2708(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (GlRenderer.enabled && arg0) {
			local11 = 1;
			local13 = Static1.underwaterLocBytes;
		} else {
			local13 = Static5.locBytes;
			local11 = 4;
		}
		for (@Pc(27) int local27 = 0; local27 < local11; local27++) {
			Static9.method763();
			for (@Pc(38) int local38 = 0; local38 < 13; local38++) {
				for (@Pc(43) int local43 = 0; local43 < 13; local43++) {
					@Pc(54) int local54 = Static7.zones[local27][local38][local43];
					if (local54 != -1) {
						@Pc(63) int local63 = local54 >> 24 & 0x3;
						if (!arg0 || local63 == 0) {
							@Pc(77) int local77 = local54 >> 1 & 0x3;
							@Pc(83) int local83 = local54 >> 3 & 0x7FF;
							@Pc(89) int local89 = local54 >> 14 & 0x3FF;
							@Pc(99) int local99 = (local89 / 8 << 8) + local83 / 8;
							for (@Pc(101) int local101 = 0; local101 < Static7.mapSquares.length; local101++) {
								if (local99 == Static7.mapSquares[local101] && local13[local101] != null) {
									Static15.readZoneLocs(local27, local38 * 8, PathFinder.collisionMaps, local13[local101], local77, (local83 & 0x7) * 8, (local89 & 0x7) * 8, local63, arg0, local43 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method2711(@OriginalArg(0) Js5 arg0) {
		Static4.anInt3250 = arg0.getGroupId("runes");
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lclient!fg;")
	public static MapElement method2713() {
		if (Static3.aClass175_12 == null) {
			return null;
		}
		for (@Pc(22) MapElement local22 = (MapElement) Static1.aClass130_1.next(); local22 != null; local22 = (MapElement) Static1.aClass130_1.next()) {
			@Pc(29) MelType local29 = MelTypeList.get(local22.id);
			if (local29 != null && local29.aBoolean157 && local29.method1810()) {
				return local22;
			}
		}
		return null;
	}

}

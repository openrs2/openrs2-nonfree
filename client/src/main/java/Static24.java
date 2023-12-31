import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

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
					LoadingBar.render(true, Fonts.b12Full);
				} else {
					Static37.renderLoadingText(LocalisedText.LOADING, false);
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
			((Js5GlTextureProvider) Rasteriser.textureProvider).resize(200);
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
			ParticleSystem.quit();
			((Js5GlTextureProvider) Rasteriser.textureProvider).resize(20);
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
			GroundModel.method1868();
			Static36.method4447();
		}
		LocType.singleLevelVisible = !SceneGraph.isAllLevelsVisible();
		ParticleSystem.method2966(GameShell.canvasWidth, GameShell.canvasHeight);
		if (arg5) {
			Static11.method516();
		}
		if (mode < 2) {
			Static4.resizable = false;
		} else {
			Static4.resizable = true;
		}
		if (InterfaceList.topLevelInterface != -1) {
			Static12.method777(true);
		}
		if (Protocol.socket != null && (Static4.anInt3304 == 30 || Static4.anInt3304 == 25)) {
			Static21.method2001();
		}
		for (@Pc(490) int i = 0; i < 100; i++) {
			Static2.aBooleanArray8[i] = true;
		}
		GameShell.fullRedraw = true;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
	public static void method2708(@OriginalArg(0) boolean underwater) {
		@Pc(11) byte levels;
		@Pc(13) byte[][] locBytes;
		if (GlRenderer.enabled && underwater) {
			levels = 1;
			locBytes = Static1.underwaterLocBytes;
		} else {
			locBytes = Static5.locBytes;
			levels = 4;
		}
		for (@Pc(27) int destLevel = 0; destLevel < levels; destLevel++) {
			Static9.audioLoop();
			for (@Pc(38) int destX = 0; destX < 13; destX++) {
				for (@Pc(43) int destZ = 0; destZ < 13; destZ++) {
					@Pc(54) int zone = Static7.zones[destLevel][destX][destZ];
					if (zone != -1) {
						@Pc(63) int srcLevel = zone >> 24 & 0x3;
						if (underwater && srcLevel != 0) {
							continue;
						}
						@Pc(77) int angle = zone >> 1 & 0x3;
						@Pc(83) int srcZ = zone >> 3 & 0x7FF;
						@Pc(89) int srcX = zone >> 14 & 0x3FF;
						@Pc(99) int mapSquare = (srcX / 8 << 8) + srcZ / 8;
						for (@Pc(101) int i = 0; i < Static7.mapSquares.length; i++) {
							if (mapSquare == Static7.mapSquares[i] && locBytes[i] != null) {
								Static15.readZoneLocs(destLevel, destX * 8, PathFinder.collisionMaps, locBytes[i], angle, (srcZ & 0x7) * 8, (srcX & 0x7) * 8, srcLevel, underwater, destZ * 8);
								break;
							}
						}
					}
				}
			}
		}
	}

}

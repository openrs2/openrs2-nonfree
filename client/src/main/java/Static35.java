import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(JB)V")
	public static void method4304(@OriginalArg(0) long arg0) {
		if (Static1.anInt772 == 1 || Static1.anInt772 == 5) {
			Static12.method641(arg0);
		} else if (Static1.anInt772 == 2) {
			Static23.method2537();
		} else {
			Camera.method1496();
		}
		if (!Static1.aBoolean17) {
			if (Static2.anInt1940 != 0) {
				Static4.anInt3341 = Static4.anInt2663;
				Static5.anInt5848 = Static1.anInt891;
			} else if (Mouse.clickButton == 0) {
				Static5.anInt5848 = Mouse.y;
				Static4.anInt3341 = Mouse.x;
			} else {
				Static5.anInt5848 = Mouse.clickY;
				Static4.anInt3341 = Mouse.clickX;
			}
			MiniMenu.actions[0] = 1006;
			MiniMenu.ops[0] = LocalisedText.CANCEL;
			MiniMenu.opBases[0] = "";
			MiniMenu.size = 1;
			MiniMenu.cursors[0] = Static7.anInt6050;
		}
		ParticleManager.redraw((long) client.loop);
		if (InterfaceList.topLevelInterface != -1) {
			Static27.method4243(InterfaceList.topLevelInterface);
		}
		for (@Pc(80) int i = 0; i < InterfaceList.rectangles; i++) {
			if (Static2.aBooleanArray8[i]) {
				InterfaceList.rectangleRedraw[i] = true;
			}
			Static1.aBooleanArray2[i] = Static2.aBooleanArray8[i];
			Static2.aBooleanArray8[i] = false;
		}
		Static7.aClass185_15 = null;
		Static3.anInt2522 = client.loop;
		Static3.anInt2047 = -1;
		Static6.anInt4679 = -1;
		Static6.aClass185_13 = null;
		if (GlRenderer.enabled) {
			Static7.aBoolean123 = true;
		}
		if (InterfaceList.topLevelInterface != -1) {
			InterfaceList.rectangles = 0;
			Static16.method1563();
		}
		if (GlRenderer.enabled) {
			GlRaster.resetClip();
		} else {
			SoftwareRaster.resetClip();
		}
		MiniMenu.sort();
		if (Static1.aBoolean17) {
			if (Static7.aBoolean389) {
				Static25.method2811();
			} else {
				Static15.method1479();
			}
		} else if (Static7.aClass185_15 != null) {
			Static21.method2008(Static1.anInt127, Static7.aClass185_15, Static4.anInt2643);
		} else if (Static3.anInt2047 != -1) {
			Static21.method2008(Static3.anInt2047, null, Static6.anInt4679);
		}
		@Pc(174) int local174 = Static1.aBoolean17 ? -1 : MiniMenu.getCursor();
		if (local174 == -1) {
			local174 = Static4.anInt3407;
		}
		Cursor.setCursor(local174);
		if (Static6.anInt4946 == 1) {
			Static6.anInt4946 = 2;
		}
		if (Static2.anInt1767 == 1) {
			Static2.anInt1767 = 2;
		}
		if (Static1.rectDebug == 3) {
			for (@Pc(211) int i = 0; i < InterfaceList.rectangles; i++) {
				if (Static1.aBooleanArray2[i]) {
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(InterfaceList.rectangleX[i], InterfaceList.rectangleY[i], InterfaceList.rectangleWidth[i], InterfaceList.rectangleHeight[i], 0xFF00FF, 128);
					} else {
						SoftwareRaster.fillRectAlpha(InterfaceList.rectangleX[i], InterfaceList.rectangleY[i], InterfaceList.rectangleWidth[i], InterfaceList.rectangleHeight[i], 0xFF00FF, 128);
					}
				} else if (InterfaceList.rectangleRedraw[i]) {
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(InterfaceList.rectangleX[i], InterfaceList.rectangleY[i], InterfaceList.rectangleWidth[i], InterfaceList.rectangleHeight[i], 0xFF0000, 128);
					} else {
						SoftwareRaster.fillRectAlpha(InterfaceList.rectangleX[i], InterfaceList.rectangleY[i], InterfaceList.rectangleWidth[i], InterfaceList.rectangleHeight[i], 0xFF0000, 128);
					}
				}
			}
		}
		AreaSoundManager.redraw(Player.level, PlayerList.self.xFine, PlayerList.self.zFine, Static5.anInt4156);
		Static5.anInt4156 = 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!wf;BIII)V")
	public static void method4309(@OriginalArg(0) Component component, @OriginalArg(4) int x, @OriginalArg(2) int y, @OriginalArg(3) int rectangle) {
		if (GlRenderer.enabled) {
			GlRaster.setClip(x, y, component.width + x, y + component.height);
		}
		if (MiniMap.state >= 3) {
			if (GlRenderer.enabled) {
				@Pc(41) Sprite sprite = component.method4729(false);
				if (sprite != null) {
					sprite.renderTransparent(x, y);
				}
			} else {
				SoftwareRaster.method4210(x, y, component.anIntArray672, component.anIntArray657);
			}
		} else if (GlRenderer.enabled) {
			((GlSprite) Sprites.compass).renderRotatedTransparent(x, y, component.width, component.height, Sprites.compass.width / 2, Sprites.compass.height / 2, (int) Camera.yaw, 256, (GlSprite) component.method4729(false));
		} else {
			((SoftwareSprite) Sprites.compass).method2165(x, y, component.width, component.height, Sprites.compass.width / 2, Sprites.compass.height / 2, (int) Camera.yaw, component.anIntArray672, component.anIntArray657);
		}
		InterfaceList.rectangleRedraw[rectangle] = true;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	public static void method4321() {
		for (@Pc(14) SpotAnimNode node = (SpotAnimNode) Static2.spotAnims.head(); node != null; node = (SpotAnimNode) Static2.spotAnims.next()) {
			@Pc(20) SpotAnim spotAnim = node.value;
			if (spotAnim.level != Player.level || spotAnim.stopped) {
				node.unlink();
			} else if (client.loop >= spotAnim.startLoop) {
				spotAnim.method3058(Static5.anInt4156);
				if (spotAnim.stopped) {
					node.unlink();
				} else {
					SceneGraph.method637(spotAnim.level, spotAnim.xFine, spotAnim.zFine, spotAnim.y, 60, spotAnim, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIBI)I")
	public static int getVisibleLevel(@OriginalArg(1) int level, @OriginalArg(3) int x, @OriginalArg(0) int z) {
		if ((Static4.tileFlags[level][x][z] & 0x8) == 0) {
			return level <= 0 || (Static4.tileFlags[1][x][z] & 0x2) == 0 ? level : level - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZIIII)V")
	public static void setWindowMode(@OriginalArg(0) boolean replaceCanvas, @OriginalArg(2) int mode, @OriginalArg(3) int width, @OriginalArg(4) int height) {
		@Pc(5) boolean local5 = false;
		Static1.aLong15 = 0L;
		@Pc(15) int local15 = Static11.getWindowMode();
		if (local15 > 0 == mode <= 0) {
			local5 = true;
		}
		if (mode == 3 || local15 == 3) {
			replaceCanvas = true;
		}
		if (replaceCanvas && mode > 0) {
			local5 = true;
		}
		Static24.setWindowMode(width, local15, replaceCanvas, height, mode, local5);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "([[IB)V")
	public static void method4335(@OriginalArg(0) int[][] arg0) {
		Static5.anIntArrayArray36 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)I")
	public static int rotateX(@OriginalArg(0) int z, @OriginalArg(1) int angle, @OriginalArg(2) int x) {
		angle &= 3;
		if (angle == 0) {
			return x;
		} else if (angle == 1) {
			return z;
		} else if (angle == 2) {
			return 7 - x;
		} else {
			return 7 - z;
		}
	}

}

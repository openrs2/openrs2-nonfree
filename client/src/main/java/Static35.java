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
			Static16.method1496();
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
		for (@Pc(80) int local80 = 0; local80 < Static1.anInt113; local80++) {
			if (Static2.aBooleanArray8[local80]) {
				Static6.aBooleanArray24[local80] = true;
			}
			Static1.aBooleanArray2[local80] = Static2.aBooleanArray8[local80];
			Static2.aBooleanArray8[local80] = false;
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
			Static1.anInt113 = 0;
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
		Static13.method966(local174);
		if (Static6.anInt4946 == 1) {
			Static6.anInt4946 = 2;
		}
		if (Static2.anInt1767 == 1) {
			Static2.anInt1767 = 2;
		}
		if (Static1.rectDebug == 3) {
			for (@Pc(211) int local211 = 0; local211 < Static1.anInt113; local211++) {
				if (Static1.aBooleanArray2[local211]) {
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711935, 128);
					} else {
						SoftwareRaster.fillRectAlpha(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711935, 128);
					}
				} else if (Static6.aBooleanArray24[local211]) {
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711680, 128);
					} else {
						SoftwareRaster.fillRectAlpha(Static6.anIntArray540[local211], Static7.anIntArray638[local211], Static5.anIntArray383[local211], Static7.anIntArray616[local211], 16711680, 128);
					}
				}
			}
		}
		AreaSoundManager.redraw(Player.level, PlayerList.self.xFine, PlayerList.self.zFine, Static5.anInt4156);
		Static5.anInt4156 = 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method4306() {
		if (Static3.anInt2554 != -1) {
			Static24.method2947(false, -1, -1, Static3.anInt2554);
			Static3.anInt2554 = -1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!wf;BIII)V")
	public static void method4309(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg3, arg1, arg0.width + arg3, arg1 + arg0.height);
		}
		if (MiniMap.state >= 3) {
			if (GlRenderer.enabled) {
				@Pc(41) Sprite local41 = arg0.method4729(false);
				if (local41 != null) {
					local41.renderTransparent(arg3, arg1);
				}
			} else {
				SoftwareRaster.method4210(arg3, arg1, arg0.anIntArray672, arg0.anIntArray657);
			}
		} else if (GlRenderer.enabled) {
			((GlSprite) Sprites.compass).renderRotatedTransparent(arg3, arg1, arg0.width, arg0.height, Sprites.compass.width / 2, Sprites.compass.height / 2, (int) Static5.aFloat97, 256, (GlSprite) arg0.method4729(false));
		} else {
			((SoftwareSprite) Sprites.compass).method2165(arg3, arg1, arg0.width, arg0.height, Sprites.compass.width / 2, Sprites.compass.height / 2, (int) Static5.aFloat97, arg0.anIntArray672, arg0.anIntArray657);
		}
		Static6.aBooleanArray24[arg2] = true;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	public static void method4321() {
		for (@Pc(14) SpotAnimNode local14 = (SpotAnimNode) Static2.spotAnims.head(); local14 != null; local14 = (SpotAnimNode) Static2.spotAnims.next()) {
			@Pc(20) SpotAnim local20 = local14.value;
			if (local20.anInt3655 != Player.level || local20.aBoolean265) {
				local14.unlink();
			} else if (client.loop >= local20.anInt3665) {
				local20.method3058(Static5.anInt4156);
				if (local20.aBoolean265) {
					local14.unlink();
				} else {
					SceneGraph.method637(local20.anInt3655, local20.anInt3647, local20.anInt3653, local20.anInt3648, 60, local20, 0, -1L, false);
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

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method4328() {
		@Pc(31) String local31;
		if (Static2.anInt1334 == 1 && MiniMenu.size < 2) {
			local31 = LocalisedText.USE + LocalisedText.MINISEPARATOR + Static7.aString365 + " ->";
		} else if (Static3.aBoolean177 && MiniMenu.size < 2) {
			local31 = Static4.aString140 + LocalisedText.MINISEPARATOR + Static2.aString81 + " ->";
		} else if (Static2.shiftClick && Keyboard.pressedKeys[81] && MiniMenu.size > 2) {
			local31 = Static26.method2992(MiniMenu.size - 2);
		} else {
			local31 = Static26.method2992(MiniMenu.size - 1);
		}
		if (MiniMenu.size > 2) {
			local31 = local31 + "<col=ffffff> / " + (MiniMenu.size - 2) + LocalisedText.MOREOPTIONS;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!fg;Lclient!ho;)V")
	public static void method4329(@OriginalArg(1) MapElement element, @OriginalArg(2) MelType type) {
		@Pc(5) SoftwareIndexedSprite sprite = type.method1808();
		if (sprite == null) {
			return;
		}
		@Pc(16) int size = sprite.width;
		if (sprite.height > sprite.width) {
			size = sprite.height;
		}
		@Pc(27) int local27 = element.xOffset;
		@Pc(30) int local30 = element.yOffset;
		@Pc(32) int textLines = 0;
		@Pc(34) int textWidth = 0;
		@Pc(36) int textHeight = 0;
		if (type.text != null) {
			textLines = Fonts.p11Full.splitParagraph(type.text, Static5.aStringArray24, null);
			for (@Pc(49) int i = 0; i < textLines; i++) {
				@Pc(56) String line = Static5.aStringArray24[i];
				if (textLines - 1 > i) {
					line = line.substring(0, line.length() - 4);
				}
				@Pc(77) int lineWidth = WorldMap.font14.getStringWidth(line);
				if (lineWidth > textWidth) {
					textWidth = lineWidth;
				}
			}
			textHeight = (textLines - 1) * WorldMap.font14.method2332() + WorldMap.font14.method2328() / 2;
		}
		@Pc(105) int local105 = element.xOffset;
		if (Static3.anInt2969 + size > local27) {
			local27 = size + Static3.anInt2969;
			local105 = textWidth / 2 + size / 2 + Static3.anInt2969 + size + 5;
		} else if (Static3.anInt2970 - size < local27) {
			local105 = Static3.anInt2970 - size - size / 2 - textWidth / 2 - 5;
			local27 = Static3.anInt2970 - size;
		}
		@Pc(167) int local167 = element.yOffset - textHeight / 2;
		if (local30 < size + Static3.anInt2968) {
			local30 = Static3.anInt2968 + size;
			local167 = size / 2 + size + Static3.anInt2968 + WorldMap.font14.method2332();
		} else if (Static3.anInt2971 - size < local30) {
			local167 = Static3.anInt2971 - size - size / 2 - textHeight;
			local30 = Static3.anInt2971 - size;
		}
		@Pc(218) int local218 = -2;
		@Pc(220) int local220 = -2;
		@Pc(224) int local224 = size >> 1;
		@Pc(226) int local226 = -2;
		@Pc(250) int local250 = (int) (Math.atan2(local27 - element.xOffset, local30 - element.yOffset) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		@Pc(252) int local252 = -2;
		sprite.method1314(sprite.innerWidth << 3, sprite.innerHeight << 3, local224 + (local27 << 4), local224 + (local30 << 4), local250);
		if (type.text != null) {
			local220 = local167 - WorldMap.font14.method2328() - 3;
			local218 = local105 - textWidth / 2 - 5;
			local252 = textLines * WorldMap.font14.method2332() + local220;
			local226 = textWidth + local218 + 10;
			if (type.fillColor != 0) {
				SoftwareRaster.fillRectAlpha(local218, local220, local226 - local218, local252 - local220, type.fillColor, type.fillColor >>> 24);
			}
			if (type.outlineColor != 0) {
				SoftwareRaster.drawRectAlpha(local218, local220, local226 - local218, local252 - local220, type.outlineColor, type.outlineColor >>> 24);
			}
			for (@Pc(353) int i = 0; i < textLines; i++) {
				@Pc(364) String line = Static5.aStringArray24[i];
				if (i < textLines - 1) {
					line = line.substring(0, line.length() - 4);
				}
				WorldMap.font14.renderStringCenter(line, local105, local167, type.textColor);
				local167 += WorldMap.font14.method2332();
			}
		}
		if ((Mouse.x <= local27 - local224 || local27 + local224 <= Mouse.x || Mouse.y <= local30 - local224 || Mouse.y >= local30 + local224) && (Mouse.x <= local218 || local226 <= Mouse.x || local220 >= Mouse.y || Mouse.y >= local252)) {
			return;
		}
		if (type.ops[4] != null) {
			MiniMenu.add(element.id, 0, 0, type.opBase, type.ops[4], (short) 1011, -1);
		}
		if (type.ops[3] != null) {
			MiniMenu.add(element.id, 0, 0, type.opBase, type.ops[3], (short) 1003, -1);
		}
		if (type.ops[2] != null) {
			MiniMenu.add(element.id, 0, 0, type.opBase, type.ops[2], (short) 1008, -1);
		}
		if (type.ops[1] != null) {
			MiniMenu.add(element.id, 0, 0, type.opBase, type.ops[1], (short) 1002, -1);
		}
		if (type.ops[0] != null) {
			MiniMenu.add(element.id, 0, 0, type.opBase, type.ops[0], (short) 1012, -1);
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

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!wf;IIIII)V")
	public static void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) MelType local10 = MelTypeList.get(arg3);
		if (local10 == null || !local10.miniMapVisible || !local10.method1810()) {
			return;
		}
		if (local10.anIntArray188 != null) {
			@Pc(32) int[] local32 = new int[local10.anIntArray188.length];
			for (@Pc(34) int local34 = 0; local34 < local32.length / 2; local34++) {
				@Pc(48) int local48 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
				@Pc(52) int local52 = MathUtils.COSINE[local48];
				local52 = local52 * 256 / (Static6.anInt4761 + 256);
				@Pc(64) int local64 = MathUtils.SINE[local48];
				local64 = local64 * 256 / (Static6.anInt4761 + 256);
				local32[local34 * 2] = arg2 + arg1.width / 2 + ((arg5 + local10.anIntArray188[local34 * 2 + 1] * 4) * local64 + local52 * (arg4 + local10.anIntArray188[local34 * 2] * 4) >> 16);
				local32[local34 * 2 + 1] = arg0 + arg1.height / 2 - (local52 * (arg5 + local10.anIntArray188[local34 * 2 + 1] * 4) - local64 * (arg4 + local10.anIntArray188[local34 * 2] * 4) >> 16);
			}
			if (GlRenderer.enabled) {
				Static18.method1738(local32, local10.anInt2283, local10.anInt2283 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			} else {
				Static17.method1630(local32, local10.anInt2283, local10.anInt2283 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			}
			for (@Pc(195) int local195 = 0; local195 < local32.length / 2 - 1; local195++) {
				if (GlRenderer.enabled) {
					GlRaster.drawRectMaskedAlpha(local32[local195 * 2], local32[local195 * 2 + 1], local32[(local195 + 1) * 2], local32[local195 * 2 + 1 + 2], local10.anInt2266, local10.anInt2266 >>> 24, (GlSprite) arg1.method4729(false));
				} else {
					SoftwareRaster.drawRectMaskedAlpha(local32[local195 * 2], local32[local195 * 2 + 1], local32[local195 * 2 + 2], local32[local195 * 2 + 3], local10.anInt2266, local10.anInt2266 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
				}
			}
			if (GlRenderer.enabled) {
				GlRaster.drawRectMaskedAlpha(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anInt2266, local10.anInt2266 >>> 24, (GlSprite) arg1.method4729(false));
			} else {
				SoftwareRaster.drawRectMaskedAlpha(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anInt2266, local10.anInt2266 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			}
		}
		@Pc(356) IndexedSprite local356 = null;
		if (local10.sprite != -1) {
			local356 = local10.method1811(false, false);
			if (local356 != null) {
				Static31.method3780(local356, arg2, arg1, arg4, arg5, arg0);
			}
		}
		if (local10.text == null) {
			return;
		}
		@Pc(384) int local384 = 0;
		@Pc(386) Font local386 = Fonts.p11Full;
		if (local10.textSize == 1) {
			local386 = Fonts.p12Full;
		}
		if (local10.textSize == 2) {
			local386 = Fonts.b12Full;
		}
		if (local356 != null) {
			local384 = local356.height;
		}
		Static9.method194(local10.textColor, local10.text, arg0, arg5, arg2, arg4, local384, local386, arg1);
	}

}

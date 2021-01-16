import java.util.Random;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!fg;IIIZILclient!nb;Lclient!ho;)V")
	public static void method3244(@OriginalArg(0) MapElement element, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class4_Sub17 arg5, @OriginalArg(7) MelType type) {
		@Pc(3) WorldMapFont font = null;
		if (type.textSize == 0) {
			if ((double) Static3.aFloat68 == 3.0D) {
				font = WorldMap.font11;
			}
			if ((double) Static3.aFloat68 == 4.0D) {
				font = WorldMap.font12;
			}
			if ((double) Static3.aFloat68 == 6.0D) {
				font = WorldMap.font14;
			}
			if ((double) Static3.aFloat68 >= 8.0D) {
				font = WorldMap.font17;
			}
		} else if (type.textSize == 1) {
			if ((double) Static3.aFloat68 == 3.0D) {
				font = WorldMap.font14;
			}
			if ((double) Static3.aFloat68 == 4.0D) {
				font = WorldMap.font17;
			}
			if ((double) Static3.aFloat68 == 6.0D) {
				font = WorldMap.font19;
			}
			if ((double) Static3.aFloat68 >= 8.0D) {
				font = WorldMap.font22;
			}
		} else if (type.textSize == 2) {
			if ((double) Static3.aFloat68 == 3.0D) {
				font = WorldMap.font19;
			}
			if ((double) Static3.aFloat68 == 4.0D) {
				font = WorldMap.font22;
			}
			if ((double) Static3.aFloat68 == 6.0D) {
				font = WorldMap.font26;
			}
			if ((double) Static3.aFloat68 >= 8.0D) {
				font = WorldMap.font30;
			}
		}
		if (font == null) {
			return;
		}
		@Pc(123) int textColor = type.textColor;
		if (element.hover && type.hoverTextColor != -1) {
			textColor = type.hoverTextColor;
		}
		@Pc(141) int local141 = Fonts.p11Full.method2279(type.text, null, Static5.aStringArray24);
		@Pc(144) int local144 = element.anInt1764;
		@Pc(164) int local164;
		if (arg4) {
			local164 = local144 - font.method2328() * local141 / 2;
		} else {
			local164 = local144 - arg2 - (local141 - 1) * font.method2332() - font.method2328() / 2;
		}
		@Pc(181) int local181 = local164 - font.method2328();
		@Pc(188) int local188 = local164 + font.method2328() / 2;
		@Pc(190) int local190 = 0;
		for (@Pc(192) int local192 = 0; local192 < local141; local192++) {
			@Pc(199) String local199 = Static5.aStringArray24[local192];
			if (local141 - 1 > local192) {
				local199 = local199.substring(0, local199.length() - 4);
			}
			@Pc(221) int local221 = font.getStringWidth(local199);
			if (local190 < local221) {
				local190 = local221;
			}
		}
		arg5.anInt3456 = element.anInt1766 + arg1 - local190 / 2;
		arg5.anInt3466 = arg1 + element.anInt1766 + local190 / 2;
		arg5.anInt3464 = local181 + arg3;
		arg5.anInt3465 = arg3 + local181 + font.method2332() * local141;
		@Pc(274) int local274 = local181 + 2;
		@Pc(284) int local284 = element.anInt1766 - local190 / 2 - 5;
		if (type.fillColor != 0) {
			SoftwareRaster.fillRectAlpha(local284, local274, local190 + 10, local181 + local141 * font.method2332() + 1 - local274, type.fillColor, type.fillColor >>> 24);
		}
		if (type.outlineColor != 0) {
			SoftwareRaster.drawRectAlpha(local284, local274, local190 + 10, font.method2332() * local141 + local181 + 1 - local274, type.outlineColor, type.outlineColor >>> 24);
		}
		for (@Pc(343) int local343 = 0; local343 < local141; local343++) {
			@Pc(354) String local354 = Static5.aStringArray24[local343];
			if (local141 - 1 > local343) {
				local354 = local354.substring(0, local354.length() - 4);
			}
			@Pc(376) int local376 = font.getStringWidth(local354);
			if (local190 < local376) {
				local190 = local376;
			}
			font.renderStringCenter(local354, element.anInt1766, local188, textColor);
			local188 += font.method2332();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	public static void method3249() {
		if (Static1.anInt331 < 0) {
			Static1.anInt331 = 0;
			Static6.anInt4393 = -1;
			Static1.anInt929 = -1;
		}
		if (Static1.anInt331 > Static3.anInt2965) {
			Static1.anInt331 = Static3.anInt2965;
			Static1.anInt929 = -1;
			Static6.anInt4393 = -1;
		}
		if (Static7.anInt5231 < 0) {
			Static6.anInt4393 = -1;
			Static7.anInt5231 = 0;
			Static1.anInt929 = -1;
		}
		if (Static3.anInt2960 < Static7.anInt5231) {
			Static1.anInt929 = -1;
			Static6.anInt4393 = -1;
			Static7.anInt5231 = Static3.anInt2960;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIZLclient!fh;)V")
	public static void method3251(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Js5 arg2) {
		Static2.anInt1244 = 0;
		Static7.anInt5391 = arg0;
		Static3.anInt5397 = 10000;
		Static7.anInt6022 = arg1;
		Static2.aClass58_42 = arg2;
		Static6.aBoolean321 = false;
		Static5.anInt4357 = 1;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	public static void method3252() {
		if (Static5.aFloat147 < 128.0F) {
			Static5.aFloat147 = 128.0F;
		}
		@Pc(12) int local12 = Static7.anInt5412 >> 7;
		if (Static5.aFloat147 > 383.0F) {
			Static5.aFloat147 = 383.0F;
		}
		while (Static5.aFloat97 >= 2048.0F) {
			Static5.aFloat97 -= 2048.0F;
		}
		@Pc(33) int local33 = Static3.anInt2496 >> 7;
		@Pc(35) int local35 = 0;
		while (Static5.aFloat97 < 0.0F) {
			Static5.aFloat97 += 2048.0F;
		}
		@Pc(63) int local63 = SceneGraph.method522(Player.level, Static7.anInt5412, Static3.anInt2496);
		if (local12 > 3 && local33 > 3 && local12 < 100 && local33 < 100) {
			for (@Pc(85) int local85 = local12 - 4; local85 <= local12 + 4; local85++) {
				for (@Pc(98) int local98 = local33 - 4; local98 <= local33 + 4; local98++) {
					@Pc(109) int local109 = Player.level;
					if (local109 < 3 && (Static4.tileFlags[1][local85][local98] & 0x2) == 2) {
						local109++;
					}
					@Pc(148) int local148 = local63 + (SceneGraph.aByteArrayArrayArray16[local109][local85][local98] & 0xFF) * 8 - SceneGraph.tileHeights[local109][local85][local98];
					if (local148 > local35) {
						local35 = local148;
					}
				}
			}
		}
		@Pc(163) int local163 = local35 * 192;
		if (local163 > 98048) {
			local163 = 98048;
		}
		if (local163 < 32768) {
			local163 = 32768;
		}
		if (local163 > Static1.anInt626) {
			Static1.anInt626 += (local163 - Static1.anInt626) / 24;
		} else if (Static1.anInt626 > local163) {
			Static1.anInt626 += (local163 - Static1.anInt626) / 80;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!wf;)V")
	public static void method3270(@OriginalArg(1) Component arg0) {
		if (arg0.anInt5900 == Static3.anInt2522) {
			Static2.aBooleanArray8[arg0.anInt5967] = true;
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I")
	public static int method3276(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		if (local23 < local14) {
			local25 = local23;
		}
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local25 > local38) {
			local25 = local38;
		}
		if (local14 < local23) {
			local40 = local23;
		}
		if (local38 > local40) {
			local40 = local38;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local25 + local40) / 2.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(73) int local73 = (int) (local66 * 256.0D);
		if (local73 < 0) {
			local73 = 0;
		} else if (local73 > 255) {
			local73 = 255;
		}
		if (local40 != local25) {
			if (local14 == local40) {
				local60 = (local23 - local38) / (local40 - local25);
			} else if (local23 == local40) {
				local60 = (local38 - local14) / (local40 - local25) + 2.0D;
			} else if (local38 == local40) {
				local60 = (local14 - local23) / (local40 - local25) + 4.0D;
			}
			if (local66 < 0.5D) {
				local68 = (local40 - local25) / (local25 + local40);
			}
			if (local66 >= 0.5D) {
				local68 = (local40 - local25) / (2.0D - local40 - local25);
			}
		}
		@Pc(173) int local173 = (int) (local68 * 256.0D);
		if (local173 < 0) {
			local173 = 0;
		} else if (local173 > 255) {
			local173 = 255;
		}
		@Pc(199) double local199 = local60 / 6.0D;
		@Pc(204) int local204 = (int) (local199 * 256.0D);
		if (local73 > 243) {
			local173 >>= 4;
		} else if (local73 > 217) {
			local173 >>= 3;
		} else if (local73 > 192) {
			local173 >>= 2;
		} else if (local73 > 179) {
			local173 >>= 1;
		}
		return (local73 >> 1) + (local173 >> 5 << 7) + (local204 >> 2 << 10);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIB)V")
	public static void method3277(@OriginalArg(0) int id, @OriginalArg(1) int arg1) {
		if (InterfaceList.load(id)) {
			Static29.method3480(InterfaceList.components[id], arg1);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIB)V")
	public static void method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static6.anInt4393 = -1;
		@Pc(7) float local7 = (float) Static3.anInt2960 / (float) Static3.anInt2965;
		Static1.anInt929 = -1;
		@Pc(15) int local15 = arg1;
		@Pc(17) int local17 = arg2;
		if (local7 >= 1.0F) {
			local15 = (int) ((float) arg2 / local7);
		} else {
			local17 = (int) ((float) arg1 * local7);
		}
		arg0 -= (arg2 - local17) / 2;
		arg3 -= (arg1 - local15) / 2;
		Static1.anInt331 = Static3.anInt2965 * arg3 / local15;
		Static7.anInt5231 = Static3.anInt2960 * arg0 / local17;
		method3249();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III[B)Z")
	public static boolean isLocFileReady(@OriginalArg(1) int mapZ, @OriginalArg(2) int mapX, @OriginalArg(3) byte[] bytes) {
		@Pc(7) boolean ready = true;
		@Pc(12) Buffer buffer = new Buffer(bytes);
		@Pc(14) int locId = -1;
		label55:
		while (true) {
			@Pc(18) int locIdDelta = buffer.readUnsignedMultiSmart();
			if (locIdDelta == 0) {
				return ready;
			}
			locId += locIdDelta;
			@Pc(26) int position = 0;
			@Pc(28) boolean end = false;
			while (true) {
				while (!end) {
					@Pc(47) int positionDelta = buffer.readUnsignedShortSmart();
					if (positionDelta == 0) {
						continue label55;
					}
					position += positionDelta - 1;
					@Pc(62) int dx = position >> 6 & 0x3F;
					@Pc(68) int shape = buffer.readUnsignedByte() >> 2;
					@Pc(72) int x = mapX + dx;
					@Pc(76) int dz = position & 0x3F;
					@Pc(80) int z = mapZ + dz;
					if (x > 0 && z > 0 && x < 103 && z < 103) {
						@Pc(102) LocType locType = LocTypeList.get(locId);
						if (shape != 22 || Preferences.groundDecoration || locType.anInt5522 != 0 || locType.anInt5509 == 1 || locType.aBoolean376) {
							end = true;
							if (!locType.isReady()) {
								ready = false;
								Static7.anInt5486++;
							}
						}
					}
				}
				@Pc(34) int positionDelta2 = buffer.readUnsignedShortSmart();
				if (positionDelta2 == 0) {
					break;
				}
				buffer.readUnsignedByte();
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[B")
	public static byte[] method3321(@OriginalArg(0) int arg0) {
		@Pc(18) ByteArraySecondaryNode local18 = (ByteArraySecondaryNode) Static7.aClass40_15.get((long) arg0);
		if (local18 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(55) int local55 = 255 - local45;
				@Pc(60) int local60 = Static12.method716(local30, local55);
				@Pc(64) byte local64 = local24[local60];
				local24[local60] = local24[local55];
				local24[local55] = local24[511 - local45] = local64;
			}
			local18 = new ByteArraySecondaryNode(local24);
			Static7.aClass40_15.put((long) arg0, local18);
		}
		return local18.value;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method3322() {
		Static27.setBuildArea(Preferences.buildArea);
		@Pc(17) int local17 = (Static3.anInt2519 >> 10) + (Static5.originX >> 3);
		@Pc(25) int local25 = (Static7.originZ >> 3) + (Static7.anInt5678 >> 10);
		Static1.mapBytes = new byte[18][];
		Static3.mapGroupIds = new int[18];
		Static7.underwaterMapBytes = new byte[18][];
		Static6.npcGroupIds = new int[18];
		Static1.locGroupIds = new int[18];
		Static7.npcBytes = new byte[18][];
		Static4.underwaterMapGroupIds = new int[18];
		Static1.underwaterLocBytes = new byte[18][];
		Static7.mapSquares = new int[18];
		Static5.xteaKeys = new int[18][4];
		Static3.underwaterLocGroupIds = new int[18];
		Static5.locBytes = new byte[18][];
		@Pc(76) int i = 0;
		for (@Pc(82) int mapX = (local17 - 6) / 8; mapX <= (local17 + 6) / 8; mapX++) {
			for (@Pc(95) int mapZ = (local25 - 6) / 8; mapZ <= (local25 + 6) / 8; mapZ++) {
				@Pc(112) int mapSquare = (mapX << 8) + mapZ;
				Static7.mapSquares[i] = mapSquare;
				Static3.mapGroupIds[i] = client.js5Archive5.getGroupId("m" + mapX + "_" + mapZ);
				Static1.locGroupIds[i] = client.js5Archive5.getGroupId("l" + mapX + "_" + mapZ);
				Static6.npcGroupIds[i] = client.js5Archive5.getGroupId("n" + mapX + "_" + mapZ);
				Static4.underwaterMapGroupIds[i] = client.js5Archive5.getGroupId("um" + mapX + "_" + mapZ);
				Static3.underwaterLocGroupIds[i] = client.js5Archive5.getGroupId("ul" + mapX + "_" + mapZ);
				if (Static6.npcGroupIds[i] == -1) {
					Static3.mapGroupIds[i] = -1;
					Static1.locGroupIds[i] = -1;
					Static4.underwaterMapGroupIds[i] = -1;
					Static3.underwaterLocGroupIds[i] = -1;
				}
				i++;
			}
		}
		for (@Pc(238) int j = i; j < Static6.npcGroupIds.length; j++) {
			Static6.npcGroupIds[j] = -1;
			Static3.mapGroupIds[j] = -1;
			Static1.locGroupIds[j] = -1;
			Static4.underwaterMapGroupIds[j] = -1;
			Static3.underwaterLocGroupIds[j] = -1;
		}
		Static8.method2(true, local17, false, 8, 8, local25, 0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZI)V")
	public static void method3323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg4) {
			Static32.method4032(arg4, arg2, arg3, arg1);
		} else if (Static2.anInt902 <= arg1 - arg4 && Static3.anInt2553 >= arg1 + arg4 && arg3 - arg0 >= Static4.anInt3086 && Static5.anInt4230 >= arg3 + arg0) {
			Static19.method4379(arg0, arg1, arg2, arg3, arg4);
		} else {
			Static26.method4814(arg3, arg0, arg2, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZILclient!qc;)V")
	public static void method3325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) PathingEntity arg5) {
		Static29.method3482(arg0, arg4, arg1, arg5.xFine, arg5.zFine, arg2, arg3);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZ)V")
	public static void method3327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static7.anInt6008 == 1) {
			Sprites.cross[Static2.anInt1629 / 100].renderTransparent(Static6.anInt5177 - 8, Static4.anInt3275 - 8);
		}
		if (Static7.anInt6008 == 2) {
			Sprites.cross[Static2.anInt1629 / 100 + 4].renderTransparent(Static6.anInt5177 - 8, Static4.anInt3275 - 8);
		}
		Static15.method1480();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLclient!gl;Z)V")
	public static void method3331(@OriginalArg(0) boolean arg0, @OriginalArg(1) Font arg1) {
		if (GlRenderer.enabled || arg0) {
			@Pc(10) int height = GameShell.canvasHeight;
			@Pc(16) int width = height * 956 / 503;
			TitleScreen.titleBg.renderResizedTransparent((GameShell.canvasWidth - width) / 2, 0, width, height);
			TitleScreen.logo.renderTransparent(GameShell.canvasWidth / 2 - TitleScreen.logo.width / 2, 18);
		}
		arg1.method2271(client.game == 1 ? LocalisedText.GAME1_LOADING : LocalisedText.GAME0_LOADING, GameShell.canvasWidth / 2, GameShell.canvasHeight / 2 - 26, 16777215, -1);
		@Pc(70) int local70 = GameShell.canvasHeight / 2 - 18;
		if (GlRenderer.enabled) {
			GlRaster.drawRect(GameShell.canvasWidth / 2 - 152, local70, 304, 34, 9179409);
			GlRaster.drawRect(GameShell.canvasWidth / 2 - 151, local70 + 1, 302, 32, 0);
			GlRaster.fillRect(GameShell.canvasWidth / 2 - 150, local70 + 2, client.mainLoadPercentage * 3, 30, 9179409);
			GlRaster.fillRect(GameShell.canvasWidth / 2 + client.mainLoadPercentage * 3 - 150, local70 + 2, 300 - client.mainLoadPercentage * 3, 30, 0);
		} else {
			SoftwareRaster.drawRect(GameShell.canvasWidth / 2 - 152, local70, 304, 34, 9179409);
			SoftwareRaster.drawRect(GameShell.canvasWidth / 2 - 151, local70 + 1, 302, 32, 0);
			SoftwareRaster.fillRect(GameShell.canvasWidth / 2 - 150, local70 + 2, client.mainLoadPercentage * 3, 30, 9179409);
			SoftwareRaster.fillRect(client.mainLoadPercentage * 3 + GameShell.canvasWidth / 2 - 150, local70 + 2, 300 - client.mainLoadPercentage * 3, 30, 0);
		}
		arg1.method2271(client.mainLoadSecondaryText, GameShell.canvasWidth / 2, GameShell.canvasHeight / 2 + 4, 16777215, -1);
	}

}

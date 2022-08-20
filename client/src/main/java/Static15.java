import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!fe;Lclient!fe;IIIZ)V")
	public static void method1216(@OriginalArg(0) SoftwareIndexedSprite arg0, @OriginalArg(1) SoftwareIndexedSprite arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.width || arg3 + 16 >= arg1.height) {
			return;
		}
		@Pc(23) int local23 = arg2 + arg3 * arg1.width;
		@Pc(28) int local28 = arg1.width - 16;
		@Pc(32) short local32;
		@Pc(34) byte local34;
		@Pc(41) short local41;
		if (arg4 == 0) {
			local32 = 240;
			local34 = 1;
			local41 = -32;
		} else if (arg4 == 1) {
			local32 = 255;
			local34 = -16;
			local41 = 255;
		} else if (arg4 == 2) {
			local32 = 15;
			local34 = -1;
			local41 = 32;
		} else {
			local32 = 0;
			local34 = 16;
			local41 = -255;
		}
		if (arg5) {
			Static14.method1206(arg1.pixels, arg0.pixels, local32, local23, local28, local34, local41);
		} else {
			method1222(arg1.pixels, arg0.pixels, local32, local23, local28, local34, local41);
		}
		method1220(arg2, arg3, 16, 16);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!fe;Lclient!fe;II)Z")
	public static boolean method1217(@OriginalArg(0) SoftwareIndexedSprite arg0, @OriginalArg(1) SoftwareIndexedSprite arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = arg2 + arg0.xOffset;
		@Pc(9) int local9 = arg3 + arg0.yOffset;
		@Pc(16) int local16 = local4 + local9 * arg1.width;
		@Pc(19) int local19 = arg0.height;
		@Pc(22) int local22 = arg0.width;
		@Pc(27) int local27 = arg1.width - local22;
		if (local9 <= 0) {
			@Pc(33) int local33 = 1 - local9;
			local19 -= local33;
			local16 += local33 * arg1.width;
			local9 = 1;
		}
		if (local9 + local19 >= arg1.height) {
			@Pc(61) int local61 = local9 + local19 + 1 - arg1.height;
			local19 -= local61;
		}
		if (local4 <= 0) {
			@Pc(71) int local71 = 1 - local4;
			local22 -= local71;
			local16 += local71;
			local27 += local71;
			local4 = 1;
		}
		if (local4 + local22 >= arg1.width) {
			@Pc(100) int local100 = local4 + local22 + 1 - arg1.width;
			local22 -= local100;
			local27 += local100;
		}
		if (local22 > 0 && local19 > 0) {
			@Pc(125) int local125 = local27 + arg1.width * 7;
			return method1221(arg1.pixels, local16, local22, local19, local125);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lclient!fe;Lclient!fe;II)V")
	public static void method1218(@OriginalArg(0) SoftwareIndexedSprite arg0, @OriginalArg(1) SoftwareIndexedSprite arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = arg2 + arg0.xOffset;
		@Pc(9) int local9 = arg3 + arg0.yOffset;
		@Pc(16) int local16 = local4 + local9 * arg1.width;
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.height;
		@Pc(24) int local24 = arg0.width;
		@Pc(29) int local29 = arg1.width - local24;
		@Pc(31) int local31 = 0;
		if (local9 <= 0) {
			@Pc(37) int local37 = 1 - local9;
			local21 -= local37;
			local18 = local37 * local24;
			local16 += local37 * arg1.width;
			local9 = 1;
		}
		if (local9 + local21 >= arg1.height) {
			@Pc(71) int local71 = local9 + local21 + 1 - arg1.height;
			local21 -= local71;
		}
		if (local4 <= 0) {
			@Pc(81) int local81 = 1 - local4;
			local24 -= local81;
			local18 += local81;
			local16 += local81;
			local31 = local81;
			local29 += local81;
			local4 = 1;
		}
		if (local4 + local24 >= arg1.width) {
			@Pc(118) int local118 = local4 + local24 + 1 - arg1.width;
			local24 -= local118;
			local31 += local118;
			local29 += local118;
		}
		if (local24 > 0 && local21 > 0) {
			Static14.method1209(arg1.pixels, arg0.pixels, local18, local16, local24, local21, local29, local31);
			method1220(local4, local9, local24, local21);
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(Lclient!fe;Lclient!fe;II)V")
	public static void method1219(@OriginalArg(0) SoftwareIndexedSprite arg0, @OriginalArg(1) SoftwareIndexedSprite arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = arg2 + arg0.xOffset;
		@Pc(9) int local9 = arg3 + arg0.yOffset;
		@Pc(16) int local16 = local4 + local9 * arg1.width;
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.height;
		@Pc(24) int local24 = arg0.width;
		@Pc(29) int local29 = arg1.width - local24;
		@Pc(31) int local31 = 0;
		if (local9 <= 0) {
			@Pc(37) int local37 = 1 - local9;
			local21 -= local37;
			local18 = local37 * local24;
			local16 += local37 * arg1.width;
			local9 = 1;
		}
		if (local9 + local21 >= arg1.height) {
			@Pc(71) int local71 = local9 + local21 + 1 - arg1.height;
			local21 -= local71;
		}
		if (local4 <= 0) {
			@Pc(81) int local81 = 1 - local4;
			local24 -= local81;
			local18 += local81;
			local16 += local81;
			local31 = local81;
			local29 += local81;
			local4 = 1;
		}
		if (local4 + local24 >= arg1.width) {
			@Pc(118) int local118 = local4 + local24 + 1 - arg1.width;
			local24 -= local118;
			local31 += local118;
			local29 += local118;
		}
		if (local24 > 0 && local21 > 0) {
			Static14.method1208(arg1.pixels, arg0.pixels, local18, local16, local24, local21, local29, local31);
			method1220(local4, local9, local24, local21);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)V")
	private static void method1220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = arg0 - 1 >> 7;
		@Pc(15) int local15 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(21) int local21 = arg1 - 1 >> 7;
		@Pc(31) int local31 = arg1 + arg3 - 1 - 1 >> 7;
		for (@Pc(33) int local33 = local5; local33 <= local15; local33++) {
			@Pc(40) GroundShadowModel[] local40 = Static2.aClass103ArrayArray1[local33];
			for (@Pc(42) int local42 = local21; local42 <= local31; local42++) {
				local40[local42].aBoolean197 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([BIIIII)Z")
	private static boolean method1221(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 % 8;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = 8 - local3;
		}
		@Pc(21) int local21 = -((arg3 + 8 - 1) / 8);
		@Pc(30) int local30 = -((arg2 + 8 - 1) / 8);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			@Pc(54) int local54 = arg1 - local9;
			if (arg0[local54 - 1] == 0) {
				return true;
			}
			arg1 = local54 + arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "([B[BIIIII)V")
	private static void method1222(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = -16; local1 < 0; local1++) {
			for (@Pc(5) int local5 = -4; local5 < 0; local5++) {
				@Pc(10) int local10 = arg3 + 1;
				arg0[arg3] += arg1[arg2];
				@Pc(22) int local22 = arg2 + arg5;
				@Pc(24) int local24 = local10++;
				arg0[local24] += arg1[local22];
				local22 += arg5;
				local24 = local10++;
				arg0[local24] += arg1[local22];
				local22 += arg5;
				arg3 = local10 + 1;
				arg0[local10] += arg1[local22];
				arg2 = local22 + arg5;
			}
			arg3 += arg4;
			arg2 += arg6;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILclient!vh;BIII)V")
	public static void method4592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) LocType arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg2 & 0x3;
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (local9 == 1 || local9 == 3) {
			local20 = arg4.length;
			local23 = arg4.width;
		} else {
			local20 = arg4.width;
			local23 = arg4.length;
		}
		@Pc(44) int local44;
		@Pc(52) int local52;
		if (local20 + arg0 <= 104) {
			local44 = (local20 >> 1) + arg0;
			local52 = arg0 + (local20 + 1 >> 1);
		} else {
			local52 = arg0 + 1;
			local44 = arg0;
		}
		@Pc(74) int local74;
		@Pc(82) int local82;
		if (arg6 + local23 <= 104) {
			local74 = (local23 >> 1) + arg6;
			local82 = (local23 + 1 >> 1) + arg6;
		} else {
			local82 = arg6 + 1;
			local74 = arg6;
		}
		@Pc(98) int local98 = (local23 << 6) + (arg6 << 7);
		@Pc(102) int[][] local102 = SceneGraph.tileHeights[arg3];
		@Pc(111) int local111 = (arg0 << 7) + (local20 << 6);
		@Pc(138) int local138 = local102[local44][local82] + local102[local52][local74] + local102[local44][local74] + local102[local52][local82] >> 2;
		@Pc(140) int local140 = 0;
		if (arg3 != 0) {
			@Pc(152) int[][] local152 = SceneGraph.tileHeights[0];
			local140 = local138 - (local152[local44][local82] + local152[local44][local74] + local152[local52][local74] + local152[local52][local82] >> 2);
		}
		@Pc(186) int[][] local186 = null;
		if (arg3 < 3) {
			local186 = SceneGraph.tileHeights[arg3 + 1];
		}
		@Pc(212) Class96 local212 = arg4.method4450(local111, false, arg7, local138, local102, local186, true, arg2, local98, null);
		Static14.method1210(local212.sprite, local111 - arg1, local140, local98 - arg5);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[Lclient!ch;[BIIIIZII)V")
	public static void readZoneLocs(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) CollisionMap[] arg2, @OriginalArg(3) byte[] bytes, @OriginalArg(4) int zoneAngle, @OriginalArg(5) int zoneZ, @OriginalArg(6) int zoneX, @OriginalArg(7) int zoneLevel, @OriginalArg(8) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Buffer buffer = new Buffer(bytes);
		@Pc(12) int id = -1;
		while (true) {
			@Pc(21) int idDelta = buffer.readUnsignedMultiSmart();
			if (idDelta == 0) {
				return;
			}
			id += idDelta;
			@Pc(34) int position = 0;
			while (true) {
				@Pc(38) int positionDelta = buffer.readUnsignedShortSmart();
				if (positionDelta == 0) {
					break;
				}
				position += positionDelta - 1;
				@Pc(57) int x = position >> 6 & 0x3F;
				@Pc(61) int z = position & 0x3F;
				@Pc(65) int level = position >> 12;
				@Pc(69) int shapeAndAngle = buffer.readUnsignedByte();
				@Pc(73) int shape = shapeAndAngle >> 2;
				@Pc(77) int angle = shapeAndAngle & 0x3;
				if (level == zoneLevel && zoneX <= x && zoneX + 8 > x && zoneZ <= z && zoneZ + 8 > z) {
					@Pc(108) LocType type = LocTypeList.get(id);
					@Pc(125) int rotatedX = Static29.method3147(type.width, z & 0x7, angle, x & 0x7, zoneAngle, type.length) + arg1;
					@Pc(145) int rotatedZ = arg9 + Static26.method4356(x & 0x7, type.length, type.width, zoneAngle, z & 0x7, angle);
					if (rotatedX > 0 && rotatedZ > 0 && rotatedX < 103 && rotatedZ < 103) {
						@Pc(162) CollisionMap collisionMap = null;
						if (!arg8) {
							@Pc(166) int local166 = arg0;
							if ((Static4.tileFlags[1][rotatedX][rotatedZ] & 0x2) == 2) {
								local166 = arg0 - 1;
							}
							if (local166 >= 0) {
								collisionMap = arg2[local166];
							}
						}
						Static22.method2193(angle + zoneAngle & 0x3, arg0, id, arg0, rotatedX, arg8, rotatedZ, collisionMap, !arg8, shape);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)I")
	public static int method1474(@OriginalArg(0) int arg0, @OriginalArg(1) int texture, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = ColorUtils.HSL_TO_RGB[SoftwareModel.method2912(arg2, arg0)];
		if (texture > 0) {
			@Pc(26) int local26 = Rasteriser.textureProvider.method450(texture & 0xFFFF);
			if (local26 != 0) {
				@Pc(42) int local42;
				if (arg0 < 0) {
					local42 = 0;
				} else if (arg0 > 127) {
					local42 = 16777215;
				} else {
					local42 = arg0 * 131586;
				}
				if (local26 == 256) {
					local16 = local42;
				} else {
					@Pc(61) int local61 = 256 - local26;
					local16 = (local61 * (local16 & 0xFF00FF) + local26 * (local42 & 0xFF00FF) & 0xFF00FF00) + ((local42 & 0xFF00) * local26 + (local16 & 0xFF00) * local61 & 0xFF0000) >> 8;
				}
			}
			@Pc(104) int local104 = Rasteriser.textureProvider.method447(texture & 0xFFFF);
			if (local104 != 0) {
				@Pc(110) int local110 = local104 + 256;
				@Pc(118) int local118 = local110 * (local16 >> 16 & 0xFF);
				if (local118 > 65535) {
					local118 = 65535;
				}
				@Pc(131) int local131 = (local16 >> 8 & 0xFF) * local110;
				if (local131 > 65535) {
					local131 = 65535;
				}
				@Pc(144) int local144 = (local16 & 0xFF) * local110;
				if (local144 > 65535) {
					local144 = 65535;
				}
				local16 = (local118 << 8 & 0xFF0066) + (local131 & 0xFF00) + (local144 >> 8);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)V")
	public static void method1477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(6) int local6 = arg0; local6 <= arg2; local6++) {
			ArrayUtils.fillRange(Static5.anIntArrayArray36[local6], arg1, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
	public static void method1479() {
		@Pc(3) int local3 = Static5.anInt3890;
		@Pc(9) int local9 = Static4.anInt3455;
		@Pc(11) int local11 = Static6.anInt4440;
		@Pc(19) int local19 = Static3.anInt2394;
		if (GlRenderer.enabled) {
			GlRaster.fillRect(local3, local9, local11, local19, 6116423);
			GlRaster.fillRect(local3 + 1, local9 + 1, local11 - 2, 16, 0);
			GlRaster.drawRect(local3 + 1, local9 + 18, local11 - 2, local19 - 19, 0);
		} else {
			SoftwareRaster.fillRect(local3, local9, local11, local19, 6116423);
			SoftwareRaster.fillRect(local3 + 1, local9 + 1, local11 - 2, 16, 0);
			SoftwareRaster.drawRect(local3 + 1, local9 + 18, local11 - 2, local19 - 19, 0);
		}
		Fonts.b12Full.renderLeft(LocalisedText.CHOOSE_OPTION, local3 + 3, local9 + 14, 6116423, -1);
		@Pc(100) int local100 = Mouse.x;
		@Pc(102) int local102 = Mouse.y;
		for (@Pc(104) int local104 = 0; local104 < MiniMenu.size; local104++) {
			@Pc(125) int local125 = local9 + (MiniMenu.size - local104 - 1) * 15 + 31;
			@Pc(127) int local127 = 16777215;
			if (local100 > local3 && local3 + local11 > local100 && local102 > local125 - 13 && local102 < local125 + 3) {
				local127 = 16776960;
			}
			Fonts.b12Full.renderLeft(MiniMenu.getOp(local104), local3 + 3, local125, local127, 0);
		}
		Static16.method1559(Static5.anInt3890, Static4.anInt3455, Static3.anInt2394, Static6.anInt4440);
	}

}

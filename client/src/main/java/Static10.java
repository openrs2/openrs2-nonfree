import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg8 == arg4 && arg2 == arg7 && arg5 == arg6 && arg1 == arg0) {
			Static9.method280(arg0, arg8, arg2, arg3, arg6);
			return;
		}
		@Pc(36) int local36 = arg8;
		@Pc(38) int local38 = arg2;
		@Pc(42) int local42 = arg8 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(62) int local62 = arg1 * 3;
		@Pc(72) int local72 = local50 + arg6 - arg8 - local54;
		@Pc(81) int local81 = local58 + arg0 - local62 - arg2;
		@Pc(92) int local92 = local54 + local42 - local50 - local50;
		@Pc(103) int local103 = local62 + local46 - local58 - local58;
		@Pc(108) int local108 = local58 - local46;
		@Pc(113) int local113 = local50 - local42;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(126) int local126 = local115 * local115 >> 12;
			@Pc(132) int local132 = local115 * local126 >> 12;
			@Pc(136) int local136 = local132 * local72;
			@Pc(140) int local140 = local126 * local92;
			@Pc(144) int local144 = local113 * local115;
			@Pc(148) int local148 = local103 * local126;
			@Pc(158) int local158 = (local144 + local140 + local136 >> 12) + arg8;
			@Pc(162) int local162 = local81 * local132;
			@Pc(166) int local166 = local108 * local115;
			@Pc(176) int local176 = (local166 + local162 + local148 >> 12) + arg2;
			Static9.method280(local176, local36, local38, arg3, local158);
			local36 = local158;
			local38 = local176;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZIIII)V")
	public static void method896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static32.method3885(arg2);
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = -arg2;
		@Pc(17) int local17 = arg2 - arg0;
		@Pc(19) int local19 = arg2;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(27) int[] local27 = Static5.anIntArrayArray36[arg5];
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(34) int local34 = local17;
		@Pc(39) int local39 = arg4 - local17;
		Static18.method1656(local27, arg1, arg4 - arg2, local39);
		@Pc(57) int local57 = local17 + arg4;
		@Pc(60) int local60 = -local17;
		Static18.method1656(local27, arg3, local39, local57);
		Static18.method1656(local27, arg1, local57, arg4 + arg2);
		while (local19 > local10) {
			local23 += 2;
			local13 += local23;
			local21 += 2;
			local60 += local21;
			if (local60 >= 0 && local34 >= 1) {
				Static7.anIntArray678[local34] = local10;
				local34--;
				local60 -= local34 << 1;
			}
			local10++;
			if (local13 >= 0) {
				local19--;
				if (local19 >= local17) {
					@Pc(126) int[] local126 = Static5.anIntArrayArray36[arg5 + local19];
					@Pc(131) int local131 = arg4 + local10;
					@Pc(138) int[] local138 = Static5.anIntArrayArray36[arg5 - local19];
					@Pc(143) int local143 = arg4 - local10;
					Static18.method1656(local126, arg1, local143, local131);
					Static18.method1656(local138, arg1, local143, local131);
				} else {
					@Pc(163) int[] local163 = Static5.anIntArrayArray36[local19 + arg5];
					@Pc(167) int local167 = Static7.anIntArray678[local19];
					@Pc(174) int[] local174 = Static5.anIntArrayArray36[arg5 - local19];
					@Pc(178) int local178 = local10 + arg4;
					@Pc(182) int local182 = arg4 - local167;
					@Pc(186) int local186 = local167 + arg4;
					@Pc(191) int local191 = arg4 - local10;
					Static18.method1656(local163, arg1, local191, local182);
					Static18.method1656(local163, arg3, local182, local186);
					Static18.method1656(local163, arg1, local186, local178);
					Static18.method1656(local174, arg1, local191, local182);
					Static18.method1656(local174, arg3, local182, local186);
					Static18.method1656(local174, arg1, local186, local178);
				}
				local13 -= local19 << 1;
			}
			@Pc(240) int[] local240 = Static5.anIntArrayArray36[arg5 + local10];
			@Pc(247) int[] local247 = Static5.anIntArrayArray36[arg5 - local10];
			@Pc(251) int local251 = local19 + arg4;
			@Pc(256) int local256 = arg4 - local19;
			if (local17 <= local10) {
				Static18.method1656(local240, arg1, local256, local251);
				Static18.method1656(local247, arg1, local256, local251);
			} else {
				@Pc(286) int local286 = local10 > local34 ? Static7.anIntArray678[local10] : local34;
				@Pc(290) int local290 = local286 + arg4;
				@Pc(294) int local294 = arg4 - local286;
				Static18.method1656(local240, arg1, local256, local294);
				Static18.method1656(local240, arg3, local294, local290);
				Static18.method1656(local240, arg1, local290, local251);
				Static18.method1656(local247, arg1, local256, local294);
				Static18.method1656(local247, arg3, local294, local290);
				Static18.method1656(local247, arg1, local290, local251);
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public static void method898() {
		Static2.aClass26_12.clear();
		Static3.aClass26_27.clear();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)Z")
	public static boolean method300(@OriginalArg(0) boolean arg0) {
		@Pc(13) boolean local13 = Static13.method881();
		if (arg0 == local13) {
			return true;
		}
		if (!arg0) {
			Static12.method873();
		} else if (!Static13.method879() || !Static13.method877() || !Static12.method871()) {
			arg0 = false;
		}
		Preferences.hdr = arg0;
		Preferences.write(GameShell.signLink);
		if (local13 == arg0) {
			return false;
		} else {
			((Js5GlTextureProvider) Static4.anInterface4_1).clear();
			return true;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method301() {
		Static4.aClass26_30.clear();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
	public static int method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * (arg0 & 0x7F) >> 7;
		if (local7 < 2) {
			local7 = 2;
		} else if (local7 > 126) {
			local7 = 126;
		}
		return (arg0 & 0xFF80) + local7;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)Lclient!gl;")
	public static Font method304(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(27) Font local27;
		if (GlRenderer.enabled) {
			local27 = new GlFont(arg0, Static5.anIntArray402, Static5.anIntArray391, Static3.anIntArray185, Static7.anIntArray643, Static6.aByteArrayArray36);
		} else {
			local27 = new SoftwareFont(arg0, Static5.anIntArray402, Static5.anIntArray391, Static3.anIntArray185, Static7.anIntArray643, Static6.aByteArrayArray36);
		}
		Static37.method4670();
		return local27;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Lclient!wg;")
	public static MapArea method305() {
		return WorldMap.currentMap;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIBI)V")
	public static void method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			for (@Pc(10) int local10 = arg3; local10 < arg2; local10++) {
				Static5.anIntArrayArray36[local10][arg0] = arg1;
			}
		} else {
			for (@Pc(30) int local30 = arg2; local30 < arg3; local30++) {
				Static5.anIntArrayArray36[local30][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(JI)V")
	public static void method308(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < Static6.anInt5214; local13++) {
			if (Static7.aLongArray54[local13] == arg0) {
				Static6.anInt5214--;
				for (@Pc(36) int local36 = local13; local36 < Static6.anInt5214; local36++) {
					Static4.aStringArray23[local36] = Static4.aStringArray23[local36 + 1];
					Static4.anIntArray293[local36] = Static4.anIntArray293[local36 + 1];
					Static4.aStringArray22[local36] = Static4.aStringArray22[local36 + 1];
					Static7.aLongArray54[local36] = Static7.aLongArray54[local36 + 1];
					Static6.anIntArray517[local36] = Static6.anIntArray517[local36 + 1];
					Static2.aBooleanArray7[local36] = Static2.aBooleanArray7[local36 + 1];
				}
				Static3.anInt2102 = Static6.anInt4979;
				Protocol.outboundBuffer.writeOpcode(172);
				Protocol.outboundBuffer.writeLong(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "()V")
	public static void method314() {
		@Pc(1) GL local1 = GlRenderer.gl;
		local1.glClientActiveTexture(method315());
		local1.glDisableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		local1.glClientActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "()I")
	public static int method315() {
		return Static1.aBoolean21 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "()V")
	public static void method316() {
		@Pc(1) GL local1 = GlRenderer.gl;
		local1.glClientActiveTexture(method315());
		local1.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		local1.glClientActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBI)Lclient!rl;")
	public static Class4_Sub27 method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class4_Sub27 local9 = new Class4_Sub27();
		local9.anInt4619 = arg1;
		local9.anInt4620 = arg0;
		Static4.aClass84_13.put((long) arg2, local9);
		Static9.method230(arg0);
		@Pc(28) Component local28 = InterfaceList.getComponent(arg2);
		if (local28 != null) {
			Static28.method3270(local28);
		}
		if (Static6.aClass185_14 != null) {
			Static28.method3270(Static6.aClass185_14);
			Static6.aClass185_14 = null;
		}
		@Pc(52) int local52 = Static7.anInt5634;
		for (@Pc(54) int local54 = 0; local54 < local52; local54++) {
			if (Static31.method3659(Static6.aShortArray100[local54])) {
				Static25.method2929(local54);
			}
		}
		if (Static7.anInt5634 == 1) {
			Static1.aBoolean17 = false;
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
		} else {
			Static8.method66(Static6.anInt4440, Static3.anInt2394, Static5.anInt3890, Static4.anInt3455);
			@Pc(93) int local93 = Static5.aClass4_Sub3_Sub5_3.method2252(LocalisedText.CHOOSE_OPTION);
			for (@Pc(95) int local95 = 0; local95 < Static7.anInt5634; local95++) {
				@Pc(108) int local108 = Static5.aClass4_Sub3_Sub5_3.method2252(Static26.method2992(local95));
				if (local93 < local108) {
					local93 = local108;
				}
			}
			Static3.anInt2394 = (Static7.aBoolean389 ? 26 : 22) + Static7.anInt5634 * 15;
			Static6.anInt4440 = local93 + 8;
		}
		if (local28 != null) {
			Static34.method4251(false, local28);
		}
		Static14.method1102(arg0);
		if (Static3.anInt5398 != -1) {
			Static28.method3277(Static3.anInt5398, 1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V")
	public static void method344(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3) {
		@Pc(7) Tile tile = Terrain.tiles[y][x][z];
		if (tile == null) {
			return;
		}
		@Pc(13) WallDecor wallDecor = tile.wallDecor;
		if (wallDecor != null) {
			wallDecor.anInt5633 = wallDecor.anInt5633 * arg3 / 16;
			wallDecor.anInt5625 = wallDecor.anInt5625 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!f;)V")
	public static void method383(@OriginalArg(1) Player arg0) {
		@Pc(20) Class4_Sub11 local20 = (Class4_Sub11) Static5.aClass84_18.get(Base37.encode(arg0.name));
		if (local20 == null) {
			Static8.method109(null, arg0.anIntArray422[0], null, arg0.anIntArray426[0], arg0, 0, Static7.y);
		} else {
			local20.method1652();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V")
	public static void method384(@OriginalArg(0) boolean arg0) {
		WorldMap.loadPercentage = 0;
		Static3.aClass112_13 = null;
		Static3.aByteArrayArrayArray12 = null;
		if (arg0 && WorldMap.currentMap != null) {
			Static3.anInt2554 = WorldMap.currentMap.id;
		} else {
			Static3.anInt2554 = -1;
		}
		Static5.aClass185_12 = null;
		Static3.anIntArray266 = null;
		Static3.anIntArrayArrayArray6 = null;
		Static3.aByteArrayArrayArray10 = null;
		Static3.aByteArrayArrayArray14 = null;
		Static3.anIntArrayArrayArray7 = null;
		Static3.aByteArrayArrayArray11 = null;
		Static3.aByteArrayArrayArray13 = null;
		WorldMap.currentMap = null;
		Static3.aClass175_12.clear();
		WorldMap.font14 = null;
		WorldMap.font30 = null;
		WorldMap.font19 = null;
		WorldMap.font26 = null;
		WorldMap.font11 = null;
		Static4.aClass4_Sub3_Sub14_3 = null;
		Static6.anInt4393 = -1;
		Static3.aClass138_6 = null;
		WorldMap.font22 = null;
		Static3.aClass4_Sub3_Sub14_Sub1_2 = null;
		WorldMap.font17 = null;
		WorldMap.font12 = null;
		Static1.anInt929 = -1;
		MelTypeList.clear();
		Static1.aClass130_1 = null;
		Static3.aClass84_10 = null;
		Static3.aClass84_9 = null;
		MelTypeList.resize(128, 64);
		VarbitTypeList.resize(64);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(14) int local14 = arg4 - arg1;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg6 - arg1;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local14 * local14;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local37 << 1;
		@Pc(49) int local49 = local25 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = local25 * (1 - local57) + local41;
		@Pc(80) int local80 = local29 - local49 * (local57 - 1);
		@Pc(89) int local89 = local45 + (1 - local61) * local33;
		@Pc(98) int local98 = local37 - local53 * (local61 - 1);
		@Pc(102) int local102 = local25 << 2;
		@Pc(106) int local106 = local29 << 2;
		@Pc(110) int local110 = local37 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local41 * 3;
		@Pc(124) int local124 = local49 * (local57 - 3);
		@Pc(128) int local128 = local45 * 3;
		@Pc(130) int local130 = local106;
		@Pc(136) int local136 = (local61 - 3) * local53;
		@Pc(138) int local138 = local110;
		@Pc(144) int local144 = (arg6 - 1) * local102;
		@Pc(150) int local150 = local114 * (local21 - 1);
		@Pc(154) int[] local154 = Static5.anIntArrayArray36[arg3];
		Static18.method1656(local154, arg2, arg0 - arg4, arg0 - local14);
		Static18.method1656(local154, arg5, arg0 - local14, local14 + arg0);
		Static18.method1656(local154, arg2, local14 + arg0, arg0 + arg4);
		while (local9 > 0) {
			if (local71 < 0) {
				while (local71 < 0) {
					local71 += local118;
					local118 += local106;
					local7++;
					local80 += local130;
					local130 += local106;
				}
			}
			if (local80 < 0) {
				local71 += local118;
				local80 += local130;
				local118 += local106;
				local7++;
				local130 += local106;
			}
			local71 += -local144;
			@Pc(251) int local251 = arg0 - local7;
			@Pc(258) boolean local258 = local21 >= local9;
			@Pc(263) int local263 = arg0 + local7;
			local144 -= local102;
			local9--;
			local80 += -local124;
			@Pc(277) int local277 = local9 + arg3;
			local124 -= local102;
			if (local258) {
				if (local89 < 0) {
					while (local89 < 0) {
						local16++;
						local98 += local138;
						local89 += local128;
						local138 += local110;
						local128 += local110;
					}
				}
				if (local98 < 0) {
					local89 += local128;
					local128 += local110;
					local16++;
					local98 += local138;
					local138 += local110;
				}
				local98 += -local136;
				local89 += -local150;
				local150 -= local114;
				local136 -= local114;
			}
			@Pc(352) int local352 = arg3 - local9;
			if (local258) {
				@Pc(358) int local358 = arg0 - local16;
				Static18.method1656(Static5.anIntArrayArray36[local352], arg2, local251, local358);
				@Pc(371) int local371 = arg0 + local16;
				Static18.method1656(Static5.anIntArrayArray36[local352], arg5, local358, local371);
				Static18.method1656(Static5.anIntArrayArray36[local352], arg2, local371, local263);
				Static18.method1656(Static5.anIntArrayArray36[local277], arg2, local251, local358);
				Static18.method1656(Static5.anIntArrayArray36[local277], arg5, local358, local371);
				Static18.method1656(Static5.anIntArrayArray36[local277], arg2, local371, local263);
			} else {
				Static18.method1656(Static5.anIntArrayArray36[local352], arg2, local251, local263);
				Static18.method1656(Static5.anIntArrayArray36[local277], arg2, local251, local263);
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)I")
	public static int method393() {
		return 2;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!p;)I")
	public static int method395(@OriginalArg(1) Npc arg0) {
		@Pc(4) NpcType local4 = arg0.type;
		if (local4.multiNpcs != null) {
			local4 = local4.getMultiNpc();
			if (local4 == null) {
				return -1;
			}
		}
		@Pc(33) int local33 = local4.anInt5252;
		@Pc(37) BasType local37 = arg0.method3314();
		if (arg0.anInt4005 == local37.anInt860) {
			local33 = local4.anInt5251;
		} else if (arg0.anInt4005 == local37.anInt831 || arg0.anInt4005 == local37.anInt829 || arg0.anInt4005 == local37.anInt857 || local37.anInt867 == arg0.anInt4005) {
			local33 = local4.anInt5248;
		} else if (arg0.anInt4005 == local37.anInt854 || local37.anInt833 == arg0.anInt4005 || local37.anInt861 == arg0.anInt4005 || arg0.anInt4005 == local37.anInt852) {
			local33 = local4.anInt5234;
		}
		return local33;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!f;B)I")
	public static int method396(@OriginalArg(0) Player arg0) {
		@Pc(8) int local8 = arg0.walkSound;
		@Pc(12) BasType local12 = arg0.method3314();
		if (arg0.anInt4005 == local12.anInt860) {
			local8 = arg0.idleSound;
		} else if (local12.anInt831 == arg0.anInt4005 || arg0.anInt4005 == local12.anInt829 || local12.anInt857 == arg0.anInt4005 || arg0.anInt4005 == local12.anInt867) {
			local8 = arg0.runSound;
		} else if (local12.anInt854 == arg0.anInt4005 || arg0.anInt4005 == local12.anInt833 || arg0.anInt4005 == local12.anInt861 || local12.anInt852 == arg0.anInt4005) {
			local8 = arg0.crawlSound;
		}
		return local8;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!fh;)Z")
	public static boolean method398(@OriginalArg(1) Js5 arg0) {
		return arg0.isFileReady(Static4.anInt3250);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Class94[] local7 = Static7.aClass94Array1;
		for (@Pc(16) int local16 = 0; local16 < local7.length; local16++) {
			@Pc(24) Class94 local24 = local7[local16];
			if (local24 != null && local24.anInt2561 == 2) {
				Static29.method3482(arg2 >> 1, local24.anInt2567 * 2, arg3, (local24.anInt2558 - Static5.originX << 7) + local24.anInt2564, local24.anInt2568 + (local24.anInt2565 - Static7.originZ << 7), arg1, arg4 >> 1);
				if (Static7.anInt5584 > -1 && client.loop % 20 < 10) {
					Static6.aClass4_Sub3_Sub14Array11[local24.anInt2559].renderTransparent(arg5 + Static7.anInt5584 - 12, Static4.anInt3290 + arg0 - 28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!fh;Lclient!fh;I)I")
	public static int method464(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		@Pc(1) int local1 = 0;
		if (arg1.isFileReady(Static2.anInt914)) {
			local1++;
		}
		if (arg1.isFileReady(Static7.anInt6040)) {
			local1++;
		}
		if (arg1.isFileReady(Static4.anInt3309)) {
			local1++;
		}
		if (arg0.isFileReady(Static2.anInt914)) {
			local1++;
		}
		if (arg0.isFileReady(Static7.anInt6040)) {
			local1++;
		}
		if (arg0.isFileReady(Static4.anInt3309)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wf;I)V")
	public static void method467(@OriginalArg(0) Component arg0) {
		@Pc(4) int local4 = arg0.anInt5904;
		if (local4 == 324) {
			if (Static4.anInt3017 == -1) {
				Static7.anInt5228 = arg0.anInt5926;
				Static4.anInt3017 = arg0.anInt5947;
			}
			if (Static1.aClass144_1.female) {
				arg0.anInt5947 = Static4.anInt3017;
			} else {
				arg0.anInt5947 = Static7.anInt5228;
			}
		} else if (local4 == 325) {
			if (Static4.anInt3017 == -1) {
				Static4.anInt3017 = arg0.anInt5947;
				Static7.anInt5228 = arg0.anInt5926;
			}
			if (Static1.aClass144_1.female) {
				arg0.anInt5947 = Static7.anInt5228;
			} else {
				arg0.anInt5947 = Static4.anInt3017;
			}
		} else if (local4 == 327) {
			arg0.anInt5944 = 150;
			arg0.anInt5976 = (int) (Math.sin((double) client.loop / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt5895 = -1;
			arg0.anInt5939 = 5;
		} else if (local4 == 328) {
			if (PlayerList.self.name == null) {
				arg0.anInt5895 = 0;
			} else {
				arg0.anInt5944 = 150;
				arg0.anInt5976 = (int) (Math.sin((double) client.loop / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt5939 = 5;
				arg0.anInt5895 = ((int) Base37.encode(PlayerList.self.name) << 11) + 2047;
				arg0.anInt5892 = PlayerList.self.anInt4046;
				arg0.anInt5891 = PlayerList.self.anInt4005;
				arg0.anInt5979 = PlayerList.self.anInt4019;
				arg0.anInt5897 = 0;
			}
		}
	}
}

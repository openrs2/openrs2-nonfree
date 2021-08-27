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

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)Z")
	public static boolean setHdrEnabled(@OriginalArg(0) boolean enabled) {
		@Pc(13) boolean current = PostProcessorManager.isBloomEnabled();
		if (enabled == current) {
			return true;
		}
		if (!enabled) {
			PostProcessorManager.disableBloom();
		} else if (!PostProcessorManager.isFrameBufferSupported() || !PostProcessorManager.isBloomSupported() || !PostProcessorManager.enableBloom()) {
			enabled = false;
		}
		Preferences.hdr = enabled;
		Preferences.write(GameShell.signLink);
		if (current == enabled) {
			return false;
		} else {
			((Js5GlTextureProvider) Static4.textureProvider).clear();
			return true;
		}
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

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "()V")
	public static void method314() {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glClientActiveTexture(method315());
		gl.glDisableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		gl.glClientActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "()I")
	public static int method315() {
		return Static1.aBoolean21 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "()V")
	public static void method316() {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glClientActiveTexture(method315());
		gl.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		gl.glClientActiveTexture(GL.GL_TEXTURE0);
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
		Static3.overlayColors = null;
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) HintArrow[] hintArrows = HintArrowManager.HINT_ARROWS;
		for (@Pc(16) int i = 0; i < hintArrows.length; i++) {
			@Pc(24) HintArrow hintArrow = hintArrows[i];
			if (hintArrow != null && hintArrow.type == 2) {
				Static29.method3482(arg2 >> 1, hintArrow.yOffset * 2, arg3, (hintArrow.x - Static5.originX << 7) + hintArrow.xOffset, hintArrow.zOffset + (hintArrow.z - Static7.originZ << 7), arg1, arg4 >> 1);
				if (Static7.anInt5584 > -1 && client.loop % 20 < 10) {
					Sprites.hintHeadIcons[hintArrow.headIcon].renderTransparent(arg5 + Static7.anInt5584 - 12, Static4.anInt3290 + arg0 - 28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wf;I)V")
	public static void method467(@OriginalArg(0) Component arg0) {
		@Pc(4) int local4 = arg0.anInt5904;
		if (local4 == 324) {
			if (Static4.anInt3017 == -1) {
				Static7.anInt5228 = arg0.anInt5926;
				Static4.anInt3017 = arg0.graphic;
			}
			if (PlayerAppearance.DEFAULT.female) {
				arg0.graphic = Static4.anInt3017;
			} else {
				arg0.graphic = Static7.anInt5228;
			}
		} else if (local4 == 325) {
			if (Static4.anInt3017 == -1) {
				Static4.anInt3017 = arg0.graphic;
				Static7.anInt5228 = arg0.anInt5926;
			}
			if (PlayerAppearance.DEFAULT.female) {
				arg0.graphic = Static7.anInt5228;
			} else {
				arg0.graphic = Static4.anInt3017;
			}
		} else if (local4 == 327) {
			arg0.modelXAngle = 150;
			arg0.modelYAngle = (int) (Math.sin((double) client.loop / 40.0D) * 256.0D) & 0x7FF;
			arg0.modelId = -1;
			arg0.modelType = 5;
		} else if (local4 == 328) {
			if (PlayerList.self.username == null) {
				arg0.modelId = 0;
			} else {
				arg0.modelXAngle = 150;
				arg0.modelYAngle = (int) (Math.sin((double) client.loop / 40.0D) * 256.0D) & 0x7FF;
				arg0.modelType = 5;
				arg0.modelId = ((int) Base37.encode(PlayerList.self.username) << 11) + 2047;
				arg0.anInt5892 = PlayerList.self.anInt4046;
				arg0.modelSeqId = PlayerList.self.movementSeqId;
				arg0.anInt5979 = PlayerList.self.anInt4019;
				arg0.anInt5897 = 0;
			}
		}
	}
}

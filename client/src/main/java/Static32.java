import java.io.IOException;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!s", name = "y", descriptor = "()V")
	public static void method3876() {
		Static6.aClass53_Sub4_Sub2_1 = new GlModel();
		Static6.aClass53_Sub4_Sub2_2 = new GlModel();
		Static6.aClass53_Sub4_Sub2_3 = new GlModel();
		Static6.aClass53_Sub4_Sub2_4 = new GlModel();
		Static6.aClass53_Sub4_Sub2_5 = new GlModel();
		Static6.aClass53_Sub4_Sub2_6 = new GlModel();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(FFF)I")
	public static int method3877(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 > local8 && local17 > local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local26 > local8 && local26 > local17) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method3879() {
		MaterialManager.setMaterial(0, 0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V")
	public static void method3885(@OriginalArg(0) int arg0) {
		if (Static7.anIntArray678 == null || Static7.anIntArray678.length < arg0) {
			Static7.anIntArray678 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	public static void method3917(@OriginalArg(1) boolean arg0) {
		Static9.audioLoop();
		if (Static4.anInt3304 != 30 && Static4.anInt3304 != 25) {
			return;
		}
		Static3.anInt2142++;
		if (Static3.anInt2142 < 50 && !arg0) {
			return;
		}
		Static3.anInt2142 = 0;
		if (!Static1.aBoolean38 && Protocol.socket != null) {
			Protocol.outboundBuffer.writeOpcode(137);
			try {
				Protocol.socket.write(Protocol.outboundBuffer.bytes, Protocol.outboundBuffer.position);
				Protocol.outboundBuffer.position = 0;
			} catch (@Pc(52) IOException local52) {
				Static1.aBoolean38 = true;
			}
		}
		Static9.audioLoop();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Z")
	public static boolean method3920(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZZIII)V")
	public static void method3924(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (GlRenderer.enabled) {
			@Pc(24) int local24 = arg2 - 334;
			if (local24 < 0) {
				local24 = 0;
			} else if (local24 > 100) {
				local24 = 100;
			}
			@Pc(50) int local50 = Static7.aShort45 + (Static4.aShort25 - Static7.aShort45) * local24 / 100;
			if (Static4.aShort18 > local50) {
				local50 = Static4.aShort18;
			} else if (local50 > Static1.aShort1) {
				local50 = Static1.aShort1;
			}
			@Pc(76) int local76 = arg2 * 512 * local50 / (arg4 * 334);
			if (local76 < Static1.aShort9) {
				@Pc(85) short local85 = Static1.aShort9;
				local50 = arg4 * local85 * 334 / (arg2 * 512);
				if (local50 > Static1.aShort1) {
					local50 = Static1.aShort1;
					@Pc(114) int local114 = arg2 * local50 * 512 / (local85 * 334);
					@Pc(121) int local121 = (arg4 - local114) / 2;
					if (arg1) {
						GlRaster.resetClip();
						GlRaster.fillRect(arg3, arg0, local121, arg2, 0);
						GlRaster.fillRect(arg3 + arg4 - local121, arg0, local121, arg2, 0);
					}
					arg4 -= local121 * 2;
					arg3 += local121;
				}
			} else if (local76 > Static7.aShort11) {
				@Pc(160) short local160 = Static7.aShort11;
				local50 = local160 * arg4 * 334 / (arg2 * 512);
				if (local50 < Static4.aShort18) {
					local50 = Static4.aShort18;
					@Pc(189) int local189 = arg4 * 334 * local160 / (local50 * 512);
					@Pc(195) int local195 = (arg2 - local189) / 2;
					if (arg1) {
						GlRaster.resetClip();
						GlRaster.fillRect(arg3, arg0, arg4, local195, 0);
						GlRaster.fillRect(arg3, arg0 + arg2 - local195, arg4, local195, 0);
					}
					arg2 -= local195 * 2;
					arg0 += local195;
				}
			}
			Static7.anInt5440 = arg2 * local50 / 334;
		}
		Static6.anInt4856 = arg0;
		Static5.anInt3483 = arg3;
		Static6.anInt4546 = (short) arg4;
		Static2.anInt1333 = (short) arg2;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3954(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(32) int local32 = local7 * (Static3.aShort12 - Static3.aShort13) / 100 + Static3.aShort13;
		arg3 = arg3 * local32 >> 8;
		@Pc(44) int local44 = 2048 - arg0 & 0x7FF;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = 2048 - arg2 & 0x7FF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = arg3;
		if (local53 != 0) {
			@Pc(67) int local67 = MathUtils.SINE[local53];
			@Pc(71) int local71 = MathUtils.COSINE[local53];
			local46 = -arg3 * local67 >> 16;
			local57 = arg3 * local71 >> 16;
		}
		if (local44 != 0) {
			@Pc(93) int local93 = MathUtils.COSINE[local44];
			@Pc(97) int local97 = MathUtils.SINE[local44];
			local55 = local57 * local97 >> 16;
			local57 = local57 * local93 >> 16;
		}
		Static7.anInt5678 = arg4 - local57;
		Static2.anInt1931 = arg1 - local46;
		Static3.anInt2519 = arg6 - local55;
		Static5.anInt3656 = arg0;
		Static5.anInt4066 = arg2;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!wf;IB)I")
	public static int getOpCursor(@OriginalArg(0) Component component, @OriginalArg(1) int button) {
		if (!InterfaceList.getServerActiveProperties(component).isButtonEnabled(button) && component.onOp == null) {
			return -1;
		} else if (component.opCursors == null || component.opCursors.length <= button) {
			return -1;
		} else {
			return component.opCursors[button];
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!to;IIIIIIZ)V")
	public static void method3987(@OriginalArg(0) ShapedTile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray583.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(15) int local15 = arg0.anIntArray583[local5] - Static7.anInt5281;
			@Pc(22) int local22 = arg0.anIntArray584[local5] - Static6.anInt4375;
			@Pc(29) int local29 = arg0.anIntArray581[local5] - Static6.anInt4400;
			@Pc(39) int local39 = local29 * arg3 + local15 * arg4 >> 16;
			local29 = local29 * arg4 - local15 * arg3 >> 16;
			local15 = local39;
			local39 = local22 * arg2 - local29 * arg1 >> 16;
			local29 = local22 * arg1 + local29 * arg2 >> 16;
			if (local29 < 50) {
				return;
			}
			if (arg0.textures != null) {
				Static7.anIntArray585[local5] = local15;
				Static7.anIntArray578[local5] = local39;
				Static7.anIntArray573[local5] = local29;
			}
			Static7.anIntArray577[local5] = Rasteriser.anInt3125 + (local15 << 9) / local29;
			Static7.anIntArray582[local5] = Rasteriser.anInt3126 + (local39 << 9) / local29;
		}
		Rasteriser.alpha = 0;
		@Pc(120) int local120 = arg0.anIntArray580.length;
		for (@Pc(122) int local122 = 0; local122 < local120; local122++) {
			@Pc(130) int local130 = arg0.anIntArray580[local122];
			@Pc(135) int local135 = arg0.anIntArray579[local122];
			@Pc(140) int local140 = arg0.anIntArray586[local122];
			@Pc(144) int local144 = Static7.anIntArray577[local130];
			@Pc(148) int local148 = Static7.anIntArray577[local135];
			@Pc(152) int local152 = Static7.anIntArray577[local140];
			@Pc(156) int local156 = Static7.anIntArray582[local130];
			@Pc(160) int local160 = Static7.anIntArray582[local135];
			@Pc(164) int local164 = Static7.anIntArray582[local140];
			if ((local144 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static2.aBoolean101 && Static15.method1223(Static1.anInt315 + Rasteriser.anInt3125, Static7.anInt5803 + Rasteriser.anInt3126, local156, local160, local164, local144, local148, local152)) {
					Static1.anInt528 = arg5;
					Static1.anInt420 = arg6;
				}
				if (!GlRenderer.enabled && !arg7) {
					Rasteriser.aBoolean217 = false;
					if (local144 < 0 || local148 < 0 || local152 < 0 || local144 > Rasteriser.anInt3129 || local148 > Rasteriser.anInt3129 || local152 > Rasteriser.anInt3129) {
						Rasteriser.aBoolean217 = true;
					}
					if (arg0.textures == null || arg0.textures[local122] == -1) {
						if (arg0.anIntArray576[local122] != 12345678) {
							Rasteriser.method2543(local156, local160, local164, local144, local148, local152, arg0.anIntArray576[local122], arg0.anIntArray575[local122], arg0.anIntArray574[local122]);
						}
					} else if (!Preferences.groundTextures) {
						@Pc(373) int local373 = Rasteriser.textureProvider.getAverageColor(arg0.textures[local122]);
						Rasteriser.method2543(local156, local160, local164, local144, local148, local152, ColorUtils.multiplyLightness(local373, arg0.anIntArray576[local122]), ColorUtils.multiplyLightness(local373, arg0.anIntArray575[local122]), ColorUtils.multiplyLightness(local373, arg0.anIntArray574[local122]));
					} else if (arg0.aBoolean353) {
						Rasteriser.method2558(local156, local160, local164, local144, local148, local152, arg0.anIntArray576[local122], arg0.anIntArray575[local122], arg0.anIntArray574[local122], Static7.anIntArray585[0], Static7.anIntArray585[1], Static7.anIntArray585[3], Static7.anIntArray578[0], Static7.anIntArray578[1], Static7.anIntArray578[3], Static7.anIntArray573[0], Static7.anIntArray573[1], Static7.anIntArray573[3], arg0.textures[local122]);
					} else {
						Rasteriser.method2558(local156, local160, local164, local144, local148, local152, arg0.anIntArray576[local122], arg0.anIntArray575[local122], arg0.anIntArray574[local122], Static7.anIntArray585[local130], Static7.anIntArray585[local135], Static7.anIntArray585[local140], Static7.anIntArray578[local130], Static7.anIntArray578[local135], Static7.anIntArray578[local140], Static7.anIntArray573[local130], Static7.anIntArray573[local135], Static7.anIntArray573[local140], arg0.textures[local122]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method3997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 >= Static2.anInt902 && Static3.anInt2553 >= arg5 && arg2 >= Static4.anInt3086 && Static5.anInt4230 >= arg4) {
			if (arg3 == 1) {
				Static27.method4706(arg1, arg0, arg5, arg2, arg4);
			} else {
				Static14.method1200(arg1, arg0, arg4, arg5, arg3, arg2);
			}
		} else if (arg3 == 1) {
			Static27.method4241(arg5, arg4, arg2, arg1, arg0);
		} else {
			Static31.method3781(arg5, arg1, arg3, arg0, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(IIIIII)V")
	public static void method4022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = arg4 - arg3;
		@Pc(23) int local23 = arg1 - arg0;
		if (local18 == 0) {
			if (local23 != 0) {
				Static20.method1930(arg3, arg0, arg1, arg2);
			}
		} else if (local23 == 0) {
			Static13.method1015(arg3, arg4, arg2, arg0);
		} else {
			@Pc(55) int local55 = (local23 << 12) / local18;
			@Pc(64) int local64 = arg0 - (arg3 * local55 >> 12);
			@Pc(76) int local76;
			@Pc(78) int local78;
			if (arg3 < Static2.anInt902) {
				local78 = local64 + (Static2.anInt902 * local55 >> 12);
				local76 = Static2.anInt902;
			} else if (Static3.anInt2553 >= arg3) {
				local76 = arg3;
				local78 = arg0;
			} else {
				local76 = Static3.anInt2553;
				local78 = (Static3.anInt2553 * local55 >> 12) + local64;
			}
			@Pc(115) int local115;
			@Pc(117) int local117;
			if (arg4 < Static2.anInt902) {
				local115 = Static2.anInt902;
				local117 = local64 + (Static2.anInt902 * local55 >> 12);
			} else if (arg4 <= Static3.anInt2553) {
				local115 = arg4;
				local117 = arg1;
			} else {
				local115 = Static3.anInt2553;
				local117 = (local55 * Static3.anInt2553 >> 12) + local64;
			}
			if (Static4.anInt3086 > local117) {
				local115 = (Static4.anInt3086 - local64 << 12) / local55;
				local117 = Static4.anInt3086;
			} else if (Static5.anInt4230 < local117) {
				local115 = (Static5.anInt4230 - local64 << 12) / local55;
				local117 = Static5.anInt4230;
			}
			if (Static4.anInt3086 > local78) {
				local76 = (Static4.anInt3086 - local64 << 12) / local55;
				local78 = Static4.anInt3086;
			} else if (local78 > Static5.anInt4230) {
				local78 = Static5.anInt4230;
				local76 = (Static5.anInt4230 - local64 << 12) / local55;
			}
			Static9.method280(local117, local76, local78, arg2, local115);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(7) int local7 = arg3 - arg6;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg6;
		@Pc(20) int local20 = arg5 * arg5;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local28 << 1;
		@Pc(40) int local40 = local7 * local7;
		@Pc(44) int local44 = local20 << 1;
		@Pc(48) int local48 = local40 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local7 << 1;
		@Pc(69) int local69 = local36 + (1 - local56) * local20;
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = local32 * (1 - local60) + local48;
		@Pc(91) int local91 = local20 << 2;
		@Pc(104) int local104 = local40 - local52 * (local60 - 1);
		@Pc(108) int local108 = local28 << 2;
		@Pc(112) int local112 = local32 << 2;
		@Pc(116) int local116 = local40 << 2;
		@Pc(120) int local120 = local36 * 3;
		@Pc(124) int local124 = local48 * 3;
		@Pc(130) int local130 = local44 * (local56 - 3);
		@Pc(132) int local132 = local108;
		@Pc(138) int local138 = (local60 - 3) * local52;
		@Pc(144) int local144 = local91 * (arg3 - 1);
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = (local7 - 1) * local112;
		if (arg4 >= Static4.anInt3086 && Static5.anInt4230 >= arg4) {
			@Pc(166) int[] local166 = Static5.anIntArrayArray36[arg4];
			@Pc(177) int local177 = IntUtils.clamp(arg2 - arg5, Static2.anInt902, Static3.anInt2553);
			@Pc(185) int local185 = IntUtils.clamp(arg2 + arg5, Static2.anInt902, Static3.anInt2553);
			@Pc(193) int local193 = IntUtils.clamp(arg2 - local16, Static2.anInt902, Static3.anInt2553);
			@Pc(203) int local203 = IntUtils.clamp(arg2 + local16, Static2.anInt902, Static3.anInt2553);
			ArrayUtils.fillRange(local166, local177, local193, arg1);
			ArrayUtils.fillRange(local166, local193, local203, arg0);
			ArrayUtils.fillRange(local166, local203, local185, arg1);
		}
		while (local9 > 0) {
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local120;
					local3++;
					local120 += local108;
					local78 += local132;
					local132 += local108;
				}
			}
			if (local78 < 0) {
				local3++;
				local69 += local120;
				local120 += local108;
				local78 += local132;
				local132 += local108;
			}
			@Pc(281) boolean local281 = local7 >= local9;
			local78 += -local130;
			local9--;
			if (local281) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local124;
						local104 += local146;
						local124 += local116;
						local146 += local116;
						local11++;
					}
				}
				if (local104 < 0) {
					local87 += local124;
					local124 += local116;
					local104 += local146;
					local146 += local116;
					local11++;
				}
				local104 += -local138;
				local138 -= local112;
				local87 += -local152;
				local152 -= local112;
			}
			local69 += -local144;
			@Pc(363) int local363 = local9 + arg4;
			@Pc(367) int local367 = arg4 - local9;
			local144 -= local91;
			local130 -= local91;
			if (local363 >= Static4.anInt3086 && Static5.anInt4230 >= local367) {
				@Pc(389) int local389 = IntUtils.clamp(local3 + arg2, Static2.anInt902, Static3.anInt2553);
				@Pc(398) int local398 = IntUtils.clamp(arg2 - local3, Static2.anInt902, Static3.anInt2553);
				if (local281) {
					@Pc(409) int local409 = IntUtils.clamp(arg2 + local11, Static2.anInt902, Static3.anInt2553);
					@Pc(418) int local418 = IntUtils.clamp(arg2 - local11, Static2.anInt902, Static3.anInt2553);
					if (Static4.anInt3086 <= local367) {
						@Pc(426) int[] local426 = Static5.anIntArrayArray36[local367];
						ArrayUtils.fillRange(local426, local398, local418, arg1);
						ArrayUtils.fillRange(local426, local418, local409, arg0);
						ArrayUtils.fillRange(local426, local409, local389, arg1);
					}
					if (Static5.anInt4230 >= local363) {
						@Pc(456) int[] local456 = Static5.anIntArrayArray36[local363];
						ArrayUtils.fillRange(local456, local398, local418, arg1);
						ArrayUtils.fillRange(local456, local418, local409, arg0);
						ArrayUtils.fillRange(local456, local409, local389, arg1);
					}
				} else {
					if (local367 >= Static4.anInt3086) {
						ArrayUtils.fillRange(Static5.anIntArrayArray36[local367], local398, local389, arg1);
					}
					if (Static5.anInt4230 >= local363) {
						ArrayUtils.fillRange(Static5.anIntArrayArray36[local363], local398, local389, arg1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZII)V")
	public static void method4032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg0 >= Static2.anInt902 && Static3.anInt2553 >= arg3 + arg0 && arg2 - arg0 >= Static4.anInt3086 && arg2 + arg0 <= Static5.anInt4230) {
			Static11.method565(arg2, arg3, arg0, arg1);
		} else {
			Static29.method3463(arg2, arg3, arg0, arg1);
		}
	}
}

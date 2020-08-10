import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(II)I")
	public static int method4058(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII[F)V")
	public static void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6) {
		if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !Static36.method4408(arg2)) {
			throw new InvalidParameterException("width must be power of 2");
		} else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !Static36.method4408(arg3)) {
			throw new InvalidParameterException("height must be power of 2");
		} else {
			@Pc(32) byte local32;
			if (arg4 == 6406) {
				local32 = 1;
			} else if (arg4 == 6409) {
				local32 = 1;
			} else if (arg4 == 32841) {
				local32 = 1;
			} else if (arg4 == 6410) {
				local32 = 2;
			} else if (arg4 == 6407) {
				local32 = 3;
			} else if (arg4 == 6408) {
				local32 = 4;
			} else {
				throw new InvalidParameterException("Invalid external format");
			}
			@Pc(70) GL local70 = Static3.aGL1;
			@Pc(72) int local72 = 0;
			@Pc(79) int local79 = arg2 < arg3 ? arg2 : arg3;
			@Pc(83) int local83 = arg2 >> 1;
			@Pc(87) int local87 = arg3 >> 1;
			@Pc(89) float[] local89 = arg6;
			@Pc(96) float[] local96 = new float[local83 * local87 * local32];
			while (true) {
				local70.glTexImage2D(arg0, local72, arg1, arg2, arg3, GL.GL_POINTS, arg4, GL.GL_FLOAT, FloatBuffer.wrap(local89));
				if (local79 <= 1) {
					return;
				}
				@Pc(115) int local115 = arg2 * local32;
				for (@Pc(117) int local117 = 0; local117 < local32; local117++) {
					@Pc(122) int local122 = local117;
					@Pc(124) int local124 = local117;
					@Pc(128) int local128 = local117 + local115;
					for (@Pc(130) int local130 = 0; local130 < local87; local130++) {
						for (@Pc(135) int local135 = 0; local135 < local83; local135++) {
							@Pc(142) float local142 = local89[local124];
							@Pc(146) int local146 = local124 + local32;
							local142 += local89[local146];
							local124 = local146 + local32;
							local142 += local89[local128];
							@Pc(166) int local166 = local128 + local32;
							local142 += local89[local166];
							local128 = local166 + local32;
							local96[local122] = local142 * 0.25F;
							local122 += local32;
						}
						local124 += local115;
						local128 += local115;
					}
				}
				@Pc(202) float[] local202 = local96;
				local96 = local89;
				local89 = local202;
				arg2 = local83;
				arg3 = local87;
				local83 >>= 1;
				local87 >>= 1;
				local79 >>= 1;
				local72++;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII[I)V")
	public static void method4072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !Static36.method4408(arg2)) {
			throw new InvalidParameterException("width must be power of 2");
		} else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !Static36.method4408(arg3)) {
			throw new InvalidParameterException("height must be power of 2");
		} else if (arg4 == 32993 || arg4 == 6408) {
			@Pc(40) GL local40 = Static3.aGL1;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg2 < arg3 ? arg2 : arg3;
			@Pc(53) int local53 = arg2 >> 1;
			@Pc(57) int local57 = arg3 >> 1;
			@Pc(59) int[] local59 = arg6;
			@Pc(64) int[] local64 = new int[local53 * local57];
			while (true) {
				local40.glTexImage2D(arg0, local42, arg1, arg2, arg3, GL.GL_POINTS, arg4, arg5, IntBuffer.wrap(local59));
				if (local49 <= 1) {
					return;
				}
				@Pc(81) int local81 = 0;
				@Pc(83) int local83 = 0;
				@Pc(87) int local87 = arg2;
				for (@Pc(89) int local89 = 0; local89 < local57; local89++) {
					for (@Pc(94) int local94 = 0; local94 < local53; local94++) {
						@Pc(100) int local100 = local83 + 1;
						@Pc(102) int local102 = local59[local83];
						local83 = local100 + 1;
						@Pc(107) int local107 = local59[local100];
						@Pc(110) int local110 = local87 + 1;
						@Pc(112) int local112 = local59[local87];
						local87 = local110 + 1;
						@Pc(117) int local117 = local59[local110];
						@Pc(123) int local123 = local102 >> 24 & 0xFF;
						@Pc(129) int local129 = local102 >> 16 & 0xFF;
						@Pc(135) int local135 = local102 >> 8 & 0xFF;
						@Pc(139) int local139 = local102 & 0xFF;
						local123 += local107 >> 24 & 0xFF;
						local129 += local107 >> 16 & 0xFF;
						local135 += local107 >> 8 & 0xFF;
						local139 += local107 & 0xFF;
						local123 += local112 >> 24 & 0xFF;
						local129 += local112 >> 16 & 0xFF;
						local135 += local112 >> 8 & 0xFF;
						local139 += local112 & 0xFF;
						local123 += local117 >> 24 & 0xFF;
						local129 += local117 >> 16 & 0xFF;
						local135 += local117 >> 8 & 0xFF;
						local139 += local117 & 0xFF;
						local64[local81++] = (local123 & 0x3FC) << 22 | (local129 & 0x3FC) << 14 | (local135 & 0x3FC) << 6 | local139 >> 2 & 0xFF;
					}
					local83 += arg2;
					local87 += arg2;
				}
				@Pc(270) int[] local270 = local64;
				local64 = local59;
				local59 = local270;
				arg2 = local53;
				arg3 = local57;
				local53 >>= 1;
				local57 >>= 1;
				local49 >>= 1;
				local42++;
			}
		} else {
			throw new InvalidParameterException("Invalid external format");
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!fh;ZILclient!fh;)V")
	public static void method4080(@OriginalArg(0) Class58 arg0, @OriginalArg(3) Class58 arg1) {
		Static5.aBoolean301 = true;
		Static7.aClass58_104 = arg1;
		Static1.aClass58_21 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)I")
	public static int method4088(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(18) Class4_Sub18 local18 = (Class4_Sub18) Static5.aClass84_17.method1844((long) arg0);
		if (local18 == null) {
			return Static9.method264(arg0).anInt1963;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local18.anIntArray385.length; local34++) {
			if (local18.anIntArray385[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static9.method264(arg0).anInt1963 - local18.anIntArray385.length;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
	public static void method4089(@OriginalArg(0) boolean arg0) {
		Static5.aBoolean294 = arg0;
		if (!Static5.aBoolean294) {
			@Pc(377) boolean local377 = Static27.method3104(Static5.aClass4_Sub10_Sub1_2.readUnsignedByteS());
			@Pc(381) int local381 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(389) int local389 = (Static1.anInt1052 - Static5.aClass4_Sub10_Sub1_2.position) / 16;
			Static5.anIntArrayArray35 = new int[local389][4];
			for (@Pc(395) int local395 = 0; local395 < local389; local395++) {
				for (@Pc(404) int local404 = 0; local404 < 4; local404++) {
					Static5.anIntArrayArray35[local395][local404] = Static5.aClass4_Sub10_Sub1_2.readIntLE();
				}
			}
			@Pc(425) int local425 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteC();
			@Pc(429) int local429 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			@Pc(433) int local433 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(435) boolean local435 = false;
			@Pc(439) int local439 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			if ((local439 / 8 == 48 || local439 / 8 == 49) && local381 / 8 == 48) {
				local435 = true;
			}
			Static4.anIntArray316 = new int[local389];
			if (local439 / 8 == 48 && local381 / 8 == 148) {
				local435 = true;
			}
			Static3.anIntArray167 = new int[local389];
			Static1.aByteArrayArray4 = new byte[local389][];
			Static3.anIntArray197 = new int[local389];
			Static1.anIntArray59 = new int[local389];
			Static7.aByteArrayArray50 = null;
			Static7.aByteArrayArray49 = new byte[local389][];
			Static5.aByteArrayArray31 = new byte[local389][];
			Static6.anIntArray570 = null;
			Static1.aByteArrayArray3 = new byte[local389][];
			Static7.anIntArray597 = new int[local389];
			@Pc(504) int local504 = 0;
			for (@Pc(510) int local510 = (local439 - 6) / 8; local510 <= (local439 + 6) / 8; local510++) {
				for (@Pc(523) int local523 = (local381 - 6) / 8; local523 <= (local381 + 6) / 8; local523++) {
					@Pc(536) int local536 = (local510 << 8) + local523;
					if (local435 && (local523 == 49 || local523 == 149 || local523 == 147 || local510 == 50 || local510 == 49 && local523 == 47)) {
						Static7.anIntArray597[local504] = local536;
						Static3.anIntArray167[local504] = -1;
						Static1.anIntArray59[local504] = -1;
						Static4.anIntArray316[local504] = -1;
						Static3.anIntArray197[local504] = -1;
					} else {
						Static7.anIntArray597[local504] = local536;
						Static3.anIntArray167[local504] = Static3.aClass58_47.method1362("m" + local510 + "_" + local523);
						Static1.anIntArray59[local504] = Static3.aClass58_47.method1362("l" + local510 + "_" + local523);
						Static4.anIntArray316[local504] = Static3.aClass58_47.method1362("um" + local510 + "_" + local523);
						Static3.anIntArray197[local504] = Static3.aClass58_47.method1362("ul" + local510 + "_" + local523);
					}
					local504++;
				}
			}
			Static8.method2(false, local439, local377, local433, local429, local381, local425);
			return;
		}
		@Pc(19) int local19 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
		@Pc(23) int local23 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
		@Pc(27) int local27 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
		Static5.aClass4_Sub10_Sub1_2.startBitAccess();
		for (@Pc(32) int local32 = 0; local32 < 4; local32++) {
			for (@Pc(39) int local39 = 0; local39 < 13; local39++) {
				for (@Pc(46) int local46 = 0; local46 < 13; local46++) {
					@Pc(56) int local56 = Static5.aClass4_Sub10_Sub1_2.readBits(1);
					if (local56 == 1) {
						Static7.anIntArrayArrayArray15[local32][local39][local46] = Static5.aClass4_Sub10_Sub1_2.readBits(26);
					} else {
						Static7.anIntArrayArrayArray15[local32][local39][local46] = -1;
					}
				}
			}
		}
		Static5.aClass4_Sub10_Sub1_2.finishBitAccess();
		@Pc(104) int local104 = (Static1.anInt1052 - Static5.aClass4_Sub10_Sub1_2.position) / 16;
		Static5.anIntArrayArray35 = new int[local104][4];
		for (@Pc(110) int local110 = 0; local110 < local104; local110++) {
			for (@Pc(115) int local115 = 0; local115 < 4; local115++) {
				Static5.anIntArrayArray35[local110][local115] = Static5.aClass4_Sub10_Sub1_2.readIntAlt3();
			}
		}
		@Pc(138) int local138 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
		@Pc(144) boolean local144 = Static27.method3104(Static5.aClass4_Sub10_Sub1_2.readUnsignedByteS());
		@Pc(148) int local148 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteA();
		Static3.anIntArray197 = new int[local104];
		Static7.aByteArrayArray50 = null;
		Static7.aByteArrayArray49 = new byte[local104][];
		Static7.anIntArray597 = new int[local104];
		Static6.anIntArray570 = null;
		Static4.anIntArray316 = new int[local104];
		Static3.anIntArray167 = new int[local104];
		Static1.aByteArrayArray3 = new byte[local104][];
		Static5.aByteArrayArray31 = new byte[local104][];
		Static1.anIntArray59 = new int[local104];
		Static1.aByteArrayArray4 = new byte[local104][];
		@Pc(182) int local182 = 0;
		for (@Pc(184) int local184 = 0; local184 < 4; local184++) {
			for (@Pc(189) int local189 = 0; local189 < 13; local189++) {
				for (@Pc(194) int local194 = 0; local194 < 13; local194++) {
					@Pc(207) int local207 = Static7.anIntArrayArrayArray15[local184][local189][local194];
					if (local207 != -1) {
						@Pc(217) int local217 = local207 >> 14 & 0x3FF;
						@Pc(223) int local223 = local207 >> 3 & 0x7FF;
						@Pc(233) int local233 = (local217 / 8 << 8) + local223 / 8;
						for (@Pc(235) int local235 = 0; local235 < local182; local235++) {
							if (Static7.anIntArray597[local235] == local233) {
								local233 = -1;
								break;
							}
						}
						if (local233 != -1) {
							Static7.anIntArray597[local182] = local233;
							@Pc(272) int local272 = local233 >> 8 & 0xFF;
							@Pc(276) int local276 = local233 & 0xFF;
							Static3.anIntArray167[local182] = Static3.aClass58_47.method1362("m" + local272 + "_" + local276);
							Static1.anIntArray59[local182] = Static3.aClass58_47.method1362("l" + local272 + "_" + local276);
							Static4.anIntArray316[local182] = Static3.aClass58_47.method1362("um" + local272 + "_" + local276);
							Static3.anIntArray197[local182] = Static3.aClass58_47.method1362("ul" + local272 + "_" + local276);
							local182++;
						}
					}
				}
			}
		}
		Static8.method2(false, local27, local144, local19, local138, local23, local148);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public static int method4090(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(ZI)V")
	public static void method4092(@OriginalArg(1) int arg0) {
		@Pc(14) Class4_Sub3_Sub9 local14 = Static12.method2322(6, arg0);
		local14.method1519();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!wf;B)V")
	public static void method4118(@OriginalArg(0) Class185 arg0) {
		@Pc(3) Class185 local3 = Static26.method2942(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local3 == null) {
			local15 = GameShell.canvasHeight;
			local12 = GameShell.canvasWidth;
		} else {
			local12 = local3.anInt5893;
			local15 = local3.anInt5949;
		}
		Static11.method526(false, local12, arg0, local15);
		Static36.method3812(local12, local15, arg0);
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(III)Z")
	public static boolean method4119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static5.anInt4112; local1++) {
			@Pc(8) Class184 local8 = Static6.aClass184Array12[local1];
			if (local8.anInt5873 == 1) {
				@Pc(17) int local17 = local8.anInt5862 - arg0;
				if (local17 > 0) {
					@Pc(29) int local29 = local8.anInt5860 + (local8.anInt5864 * local17 >> 8);
					@Pc(39) int local39 = local8.anInt5879 + (local8.anInt5874 * local17 >> 8);
					@Pc(49) int local49 = local8.anInt5872 + (local8.anInt5869 * local17 >> 8);
					@Pc(59) int local59 = local8.anInt5881 + (local8.anInt5868 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt5873 == 2) {
				@Pc(83) int local83 = arg0 - local8.anInt5862;
				if (local83 > 0) {
					@Pc(95) int local95 = local8.anInt5860 + (local8.anInt5864 * local83 >> 8);
					@Pc(105) int local105 = local8.anInt5879 + (local8.anInt5874 * local83 >> 8);
					@Pc(115) int local115 = local8.anInt5872 + (local8.anInt5869 * local83 >> 8);
					@Pc(125) int local125 = local8.anInt5881 + (local8.anInt5868 * local83 >> 8);
					if (arg2 >= local95 && arg2 <= local105 && arg1 >= local115 && arg1 <= local125) {
						return true;
					}
				}
			} else if (local8.anInt5873 == 3) {
				@Pc(149) int local149 = local8.anInt5860 - arg2;
				if (local149 > 0) {
					@Pc(161) int local161 = local8.anInt5862 + (local8.anInt5861 * local149 >> 8);
					@Pc(171) int local171 = local8.anInt5877 + (local8.anInt5878 * local149 >> 8);
					@Pc(181) int local181 = local8.anInt5872 + (local8.anInt5869 * local149 >> 8);
					@Pc(191) int local191 = local8.anInt5881 + (local8.anInt5868 * local149 >> 8);
					if (arg0 >= local161 && arg0 <= local171 && arg1 >= local181 && arg1 <= local191) {
						return true;
					}
				}
			} else if (local8.anInt5873 == 4) {
				@Pc(215) int local215 = arg2 - local8.anInt5860;
				if (local215 > 0) {
					@Pc(227) int local227 = local8.anInt5862 + (local8.anInt5861 * local215 >> 8);
					@Pc(237) int local237 = local8.anInt5877 + (local8.anInt5878 * local215 >> 8);
					@Pc(247) int local247 = local8.anInt5872 + (local8.anInt5869 * local215 >> 8);
					@Pc(257) int local257 = local8.anInt5881 + (local8.anInt5868 * local215 >> 8);
					if (arg0 >= local227 && arg0 <= local237 && arg1 >= local247 && arg1 <= local257) {
						return true;
					}
				}
			} else if (local8.anInt5873 == 5) {
				@Pc(281) int local281 = arg1 - local8.anInt5872;
				if (local281 > 0) {
					@Pc(293) int local293 = local8.anInt5862 + (local8.anInt5861 * local281 >> 8);
					@Pc(303) int local303 = local8.anInt5877 + (local8.anInt5878 * local281 >> 8);
					@Pc(313) int local313 = local8.anInt5860 + (local8.anInt5864 * local281 >> 8);
					@Pc(323) int local323 = local8.anInt5879 + (local8.anInt5874 * local281 >> 8);
					if (arg0 >= local293 && arg0 <= local303 && arg2 >= local313 && arg2 <= local323) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Lclient!vl;")
	public static Class182 method4126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass182_1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fh;II)Z")
	public static boolean method4131(@OriginalArg(0) Class58 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1343(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static29.method3542(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ZI)V")
	public static void method4132(@OriginalArg(0) boolean arg0) {
		if (Static2.aBoolean152 != arg0) {
			Static2.aBoolean152 = arg0;
			Static30.method3599();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lsignlink!pm;I)V")
	public static void method4149(@OriginalArg(0) SignLink arg0) {
		@Pc(3) FileOnDisk local3 = null;
		Static1.anInt185 = 3;
		Static35.method665(true);
		Static2.aBoolean75 = true;
		Static6.aBoolean227 = true;
		Static4.aBoolean398 = true;
		Static5.anInt4120 = 127;
		Static1.aBoolean27 = true;
		Static3.aBoolean159 = true;
		Static2.aBoolean66 = true;
		Static7.aBoolean421 = true;
		Static7.aBoolean393 = true;
		Static7.aBoolean122 = true;
		Static4.anInt3403 = 0;
		Static7.aBoolean362 = true;
		Static3.anInt2298 = 2;
		Static4.anInt3315 = 127;
		Static3.anInt2627 = 0;
		Static2.anInt1125 = 0;
		Static2.aBoolean117 = true;
		Static1.anInt1051 = 0;
		Static1.anInt344 = 255;
		if (Static4.anInt3256 < 96) {
			Static26.method2957(0);
		} else {
			Static26.method2957(2);
		}
		Static5.aBoolean278 = false;
		Static5.anInt3637 = 0;
		Static7.aBoolean390 = false;
		Static5.anInt4291 = 0;
		Static2.aBoolean69 = true;
		Static5.anInt3909 = 0;
		Static5.aBoolean293 = false;
		try {
			@Pc(84) PrivilegedRequest local84 = arg0.openPreferences("openrs2");
			while (local84.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (local84.status == 1) {
				local3 = (FileOnDisk) local84.result;
				@Pc(102) int local102 = 0;
				@Pc(108) byte[] local108 = new byte[(int) local3.length()];
				while (local102 < local108.length) {
					@Pc(126) int local126 = local3.read(local108, local102, local108.length - local102);
					if (local126 == -1) {
						throw new IOException("EOF");
					}
					local102 += local126;
				}
				Static37.method4643(new Buffer(local108));
			}
		} catch (@Pc(153) Exception local153) {
		}
		try {
			if (local3 != null) {
				local3.close();
			}
		} catch (@Pc(160) Exception local160) {
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ua;IIII)V")
	public static void method4152(@OriginalArg(0) Class168 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static7.anInt5634 >= 400) {
			return;
		}
		if (arg0.anIntArray590 != null) {
			arg0 = arg0.method4265();
		}
		if (arg0 == null || !arg0.aBoolean357) {
			return;
		}
		@Pc(38) String local38 = arg0.aString316;
		if (arg0.anInt5246 != 0) {
			@Pc(51) String local51 = client.game == 1 ? LocalisedText.RATING : LocalisedText.LEVEL;
			local38 = local38 + Static20.method1921(Static4.aClass53_Sub1_Sub1_2.anInt1597, arg0.anInt5246) + " (" + local51 + arg0.anInt5246 + ")";
		}
		if (Static2.anInt1334 == 1) {
			Static16.method1497((long) arg2, arg3, arg1, Static7.aString365 + " -> <col=ffff00>" + local38, LocalisedText.USE, (short) 33, Static2.anInt1937);
		} else if (Static3.aBoolean177) {
			@Pc(88) Class4_Sub3_Sub12 local88 = Static5.anInt4224 == -1 ? null : Static19.method1815(Static5.anInt4224);
			if ((Static5.anInt3560 & 0x2) != 0 && (local88 == null || arg0.method4262(local88.anInt2546, Static5.anInt4224) != local88.anInt2546)) {
				Static16.method1497((long) arg2, arg3, arg1, Static2.aString81 + " -> <col=ffff00>" + local38, Static4.aString140, (short) 42, Static6.anInt4466);
			}
		} else {
			@Pc(134) String[] local134 = arg0.aStringArray35;
			if (Static5.aBoolean254) {
				local134 = Static35.method4300(local134);
			}
			if (local134 != null) {
				for (@Pc(145) int local145 = 4; local145 >= 0; local145--) {
					if (local134[local145] != null && (client.game != 0 || !local134[local145].equalsIgnoreCase(LocalisedText.ATTACK))) {
						@Pc(167) byte local167 = 0;
						@Pc(169) int local169 = -1;
						if (local145 == arg0.anInt5245) {
							local169 = arg0.anInt5264;
						}
						if (arg0.anInt5233 == local145) {
							local169 = arg0.anInt5258;
						}
						if (local145 == 0) {
							local167 = 39;
						}
						if (local145 == 1) {
							local167 = 8;
						}
						if (local145 == 2) {
							local167 = 36;
						}
						if (local145 == 3) {
							local167 = 25;
						}
						if (local145 == 4) {
							local167 = 59;
						}
						Static16.method1497((long) arg2, arg3, arg1, "<col=ffff00>" + local38, local134[local145], local167, local169);
					}
				}
			}
			if (client.game == 0 && local134 != null) {
				for (@Pc(249) int local249 = 4; local249 >= 0; local249--) {
					if (local134[local249] != null && local134[local249].equalsIgnoreCase(LocalisedText.ATTACK)) {
						@Pc(271) short local271 = 0;
						if (Static4.aClass53_Sub1_Sub1_2.anInt1597 < arg0.anInt5246) {
							local271 = 2000;
						}
						@Pc(281) short local281 = 0;
						if (local249 == 0) {
							local281 = 39;
						}
						if (local249 == 1) {
							local281 = 8;
						}
						if (local249 == 2) {
							local281 = 36;
						}
						if (local249 == 3) {
							local281 = 25;
						}
						if (local249 == 4) {
							local281 = 59;
						}
						if (local281 != 0) {
							local281 += local271;
						}
						Static16.method1497((long) arg2, arg3, arg1, "<col=ffff00>" + local38, local134[local249], local281, arg0.anInt5241);
					}
				}
			}
			Static16.method1497((long) arg2, arg3, arg1, "<col=ffff00>" + local38, LocalisedText.EXAMINE, (short) 1010, Static3.anInt2232);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIZ)I")
	public static int method4153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static6.aBoolean335) {
			arg2 = 1000000;
			Static6.aBoolean335 = false;
		}
		@Pc(17) Class187 local17 = Static5.aClass187ArrayArray1[arg3][arg1];
		@Pc(27) float local27 = local17.aFloat148 * ((float) arg0 * 0.1F + 0.7F);
		@Pc(30) int local30 = local17.anInt6034;
		@Pc(33) float local33 = local17.aFloat150;
		@Pc(36) float local36 = local17.aFloat149;
		@Pc(39) int local39 = local17.anInt6036;
		@Pc(48) int local48 = local17.anInt6043;
		if (!Static7.aBoolean362) {
			local48 = 0;
		}
		@Pc(56) Class4_Sub3_Sub10 local56 = local17.aClass4_Sub3_Sub10_7;
		@Pc(59) float local59 = local17.aFloat152;
		@Pc(62) float local62 = local17.aFloat151;
		@Pc(65) float local65 = local17.aFloat153;
		if (local30 != Static4.anInt3171 || Static4.aFloat146 != local27 || Static5.aFloat96 != local33 || Static6.aFloat90 != local36 || Static2.anInt1325 != local39 || local48 != Static2.anInt1317 || local56 != Static2.aClass4_Sub3_Sub10_3 || Static4.aFloat59 != local59 || Static1.aFloat24 != local65 || Static3.aFloat51 != local62) {
			Static5.anInt3764 = Static1.anInt131;
			Static6.anInt4801 = Static4.anInt3196;
			Static7.aFloat144 = Static6.aFloat108;
			Static4.aFloat62 = Static3.aFloat63;
			Static1.aFloat5 = Static4.aFloat85;
			Static2.aFloat42 = Static5.aFloat102;
			Static3.aClass4_Sub3_Sub10_4 = Static1.aClass4_Sub3_Sub10_1;
			Static6.anInt4793 = Static1.anInt611;
			Static3.aFloat54 = Static4.aFloat58;
			Static1.aFloat21 = Static4.aFloat145;
			if (Static1.aClass4_Sub3_Sub10_2 == null || Static3.aClass4_Sub3_Sub10_4 == Static1.aClass4_Sub3_Sub10_2) {
				Static1.aClass4_Sub3_Sub10_2 = new Class4_Sub3_Sub10();
			}
			Static2.anInt1317 = local48;
			Static6.aFloat90 = local36;
			Static4.aFloat146 = local27;
			Static3.anInt2579 = 0;
			Static4.anInt3171 = local30;
			Static1.aFloat24 = local65;
			Static2.aClass4_Sub3_Sub10_3 = local56;
			Static5.aFloat96 = local33;
			Static3.aFloat51 = local62;
			Static2.anInt1325 = local39;
			Static4.aFloat59 = local59;
		}
		if (Static3.anInt2579 < 65536) {
			Static3.anInt2579 += arg2 * 250;
			if (Static3.anInt2579 >= 65536) {
				Static4.aFloat145 = Static4.aFloat59;
				Static3.aFloat63 = Static5.aFloat96;
				Static4.aFloat58 = Static3.aFloat51;
				Static1.aClass4_Sub3_Sub10_1 = Static2.aClass4_Sub3_Sub10_3;
				Static1.anInt611 = Static2.anInt1317;
				Static4.aFloat85 = Static1.aFloat24;
				Static5.aFloat102 = Static4.aFloat146;
				Static4.anInt3196 = Static2.anInt1325;
				Static3.anInt2579 = 65536;
				Static3.aClass4_Sub3_Sub10_4 = null;
				Static6.aFloat108 = Static6.aFloat90;
				Static1.anInt131 = Static4.anInt3171;
			} else {
				@Pc(209) int local209 = 65536 - Static3.anInt2579 >> 8;
				@Pc(214) float local214 = (float) Static3.anInt2579 / 65536.0F;
				@Pc(218) int local218 = Static3.anInt2579 >> 8;
				Static1.anInt611 = Static6.anInt4793 * local209 + Static2.anInt1317 * local218 >> 8;
				Static1.anInt131 = (local209 * (Static5.anInt3764 & 0xFF00FF) + (Static4.anInt3171 & 0xFF00FF) * local218 & 0xFF00FF00) + (local218 * (Static4.anInt3171 & 0xFF00) + (Static5.anInt3764 & 0xFF00) * local209 & 0xFF0000) >> 8;
				@Pc(268) float local268 = (float) (65536 - Static3.anInt2579) / 65536.0F;
				Static5.aFloat102 = local214 * Static4.aFloat146 + Static2.aFloat42 * local268;
				Static6.aFloat108 = local214 * Static6.aFloat90 + Static7.aFloat144 * local268;
				Static4.aFloat145 = local268 * Static1.aFloat21 + local214 * Static4.aFloat59;
				Static3.aFloat63 = local214 * Static5.aFloat96 + Static4.aFloat62 * local268;
				Static4.anInt3196 = ((Static6.anInt4801 & 0xFF00) * local209 + (Static2.anInt1325 & 0xFF00) * local218 & 0xFF0000) + ((Static2.anInt1325 & 0xFF00FF) * local218 + local209 * (Static6.anInt4801 & 0xFF00FF) & 0xFF00FF00) >> 8;
				Static4.aFloat58 = local268 * Static3.aFloat54 + Static3.aFloat51 * local214;
				Static4.aFloat85 = Static1.aFloat24 * local214 + Static1.aFloat5 * local268;
				if (Static2.aClass4_Sub3_Sub10_3 != Static3.aClass4_Sub3_Sub10_4) {
					if (Static3.aClass4_Sub3_Sub10_4 == null || Static2.aClass4_Sub3_Sub10_3 == null) {
						Static1.aClass4_Sub3_Sub10_1 = null;
					} else {
						Static1.aClass4_Sub3_Sub10_1 = Static1.aClass4_Sub3_Sub10_2.method1835(Static3.aClass4_Sub3_Sub10_4, Static2.aClass4_Sub3_Sub10_3, (float) Static3.anInt2579 / 65536.0F);
					}
				}
			}
		}
		return Static4.anInt3196;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!vh;IIII)Z")
	public static boolean method4155(@OriginalArg(1) int arg0, @OriginalArg(2) Class181 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(10) Class143 local10 = Static15.method1400(arg1.anInt5515);
		if (local10.anInt4312 == -1) {
			return true;
		}
		@Pc(22) int local22;
		if (arg1.aBoolean378) {
			arg3 += arg1.anInt5546;
			local22 = arg3 & 0x3;
		} else {
			local22 = 0;
		}
		@Pc(45) Class56_Sub1 local45 = local10.method3557(arg1.aBoolean382, local22);
		if (local45 == null) {
			return false;
		}
		@Pc(53) int local53 = arg1.anInt5527;
		@Pc(56) int local56 = arg1.anInt5516;
		if ((local22 & 0x1) == 1) {
			local53 = arg1.anInt5516;
			local56 = arg1.anInt5527;
		}
		@Pc(73) int local73 = local45.anInt3412;
		@Pc(76) int local76 = local45.anInt3410;
		if (local10.aBoolean303) {
			local73 = local53 * 4;
			local76 = local56 * 4;
		}
		if (local10.anInt4306 == 0) {
			local45.method1315(arg2 * 4 + 48, (104 - arg0 - local56) * 4 + 48, local73, local76);
		} else {
			local45.method1316(arg2 * 4 + 48, (104 - local56 - arg0) * 4 + 48, local73, local76, local10.anInt4306);
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method4156(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!fh;II)Lclient!tg;")
	public static Class4_Sub31 method4165(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1372(arg1, arg2);
		return local5 == null ? null : new Class4_Sub31(new Buffer(local5));
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII[B)V")
	public static void method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static3.aGL1.glTexImage2D(arg0, GL.GL_POINTS, arg1, arg2, arg3, GL.GL_POINTS, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	public static void method4167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method4166(Static6.anInt5134, arg0, arg1, arg2, Static6.anInt5135, Static6.anInt5147, null);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method4168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static3.aGL1;
		@Pc(3) int local3 = method4172();
		if (arg0 == 3553) {
			Static17.method1600(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method4166(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, arg4);
		local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public static void method4169(@OriginalArg(0) int arg0) {
		Static6.anIntArray555[0] = arg0;
		Static3.aGL1.glDeleteTextures(1, Static6.anIntArray555, 0);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
	public static void method4170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method4166(Static6.anInt5133, arg0, arg1, arg2, Static6.anInt5135, Static6.anInt5147, null);
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(III)I")
	public static int method4171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method4168(Static6.anInt5133, arg0, arg1, arg2, Static6.anInt5144, Static6.anInt5144, arg0, Static6.anInt5147, null);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "()I")
	public static int method4172() {
		Static3.aGL1.glGenTextures(1, Static6.anIntArray555, 0);
		return Static6.anIntArray555[0];
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III[B)I")
	public static int method4173(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method4168(Static6.anInt5133, arg0, 128, 128, Static6.anInt5144, Static6.anInt5144, arg0, Static6.anInt5147, arg1);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method4198(@OriginalArg(0) Class58 arg0) {
		Static6.aClass58_86 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!wf;B)Z")
	public static boolean method4199(@OriginalArg(0) Class185 arg0) {
		if (arg0.anIntArray668 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anIntArray668.length; local19++) {
			@Pc(29) int local29 = Static36.method4464(local19, arg0);
			@Pc(34) int local34 = arg0.anIntArray671[local19];
			if (arg0.anIntArray668[local19] == 2) {
				if (local29 >= local34) {
					return false;
				}
			} else if (arg0.anIntArray668[local19] == 3) {
				if (local29 <= local34) {
					return false;
				}
			} else if (arg0.anIntArray668[local19] == 4) {
				if (local29 == local34) {
					return false;
				}
			} else if (local34 != local29) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
	public static void method4200() {
		Static3.aClass26_26.method511();
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)Lclient!dc;")
	public static Class37 method4201(@OriginalArg(0) int arg0) {
		@Pc(6) Class37 local6 = (Class37) Static3.aClass26_21.method518((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static2.aClass58_40.method1372(1, arg0);
		@Pc(25) Class37 local25 = new Class37();
		local25.anInt900 = arg0;
		if (local21 != null) {
			local25.method746(new Buffer(local21));
		}
		local25.method743();
		if (local25.anInt907 == 2 && Static5.aClass84_16.method1844((long) arg0) == null) {
			Static5.aClass84_16.method1840(new IntNode(Static1.anInt876), (long) arg0);
			Static6.aClass37Array1[Static1.anInt876++] = local25;
		}
		Static3.aClass26_21.method510(local25, (long) arg0);
		return local25;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(B)V")
	public static void method4202() {
		if (Static10.method456() || Static2.anInt1216 == Static7.anInt5334) {
			Static12.method638();
			if (Static7.anInt5334 != Static6.anInt4709) {
				Static16.method2014();
			}
		} else {
			Static8.method2(false, Static4.anInt3360, false, Static4.aClass53_Sub1_Sub1_2.anIntArray426[0], Static4.aClass53_Sub1_Sub1_2.anIntArray422[0], Static1.anInt5, Static7.anInt5334);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZ)V")
	public static void method2997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class4_Sub3_Sub9 local4 = Static12.method2322(7, arg0);
		local4.method1520();
		local4.anInt1993 = arg1;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	public static void method3000() {
		Static32.method3917(false);
		Static3.anInt2886 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static1.aByteArrayArray4.length; local14++) {
			if (Static3.anIntArray167[local14] != -1 && Static1.aByteArrayArray4[local14] == null) {
				Static1.aByteArrayArray4[local14] = Static3.aClass58_47.method1372(Static3.anIntArray167[local14], 0);
				if (Static1.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static3.anInt2886++;
				}
			}
			if (Static1.anIntArray59[local14] != -1 && Static5.aByteArrayArray31[local14] == null) {
				Static5.aByteArrayArray31[local14] = Static3.aClass58_47.method1361(0, Static1.anIntArray59[local14], Static5.anIntArrayArray35[local14]);
				if (Static5.aByteArrayArray31[local14] == null) {
					local12 = false;
					Static3.anInt2886++;
				}
			}
			if (Static3.aBoolean138) {
				if (Static4.anIntArray316[local14] != -1 && Static7.aByteArrayArray49[local14] == null) {
					Static7.aByteArrayArray49[local14] = Static3.aClass58_47.method1372(Static4.anIntArray316[local14], 0);
					if (Static7.aByteArrayArray49[local14] == null) {
						local12 = false;
						Static3.anInt2886++;
					}
				}
				if (Static3.anIntArray197[local14] != -1 && Static1.aByteArrayArray3[local14] == null) {
					Static1.aByteArrayArray3[local14] = Static3.aClass58_47.method1372(Static3.anIntArray197[local14], 0);
					if (Static1.aByteArrayArray3[local14] == null) {
						Static3.anInt2886++;
						local12 = false;
					}
				}
			}
			if (Static6.anIntArray570 != null && Static7.aByteArrayArray50[local14] == null && Static6.anIntArray570[local14] != -1) {
				Static7.aByteArrayArray50[local14] = Static3.aClass58_47.method1361(0, Static6.anIntArray570[local14], Static5.anIntArrayArray35[local14]);
				if (Static7.aByteArrayArray50[local14] == null) {
					local12 = false;
					Static3.anInt2886++;
				}
			}
		}
		if (Static7.aClass138_14 == null) {
			if (Static2.aClass4_Sub3_Sub22_1 == null || !Static5.aClass58_82.method1344(Static2.aClass4_Sub3_Sub22_1.aString358 + "_labels")) {
				Static7.aClass138_14 = new Class138(0);
			} else if (Static5.aClass58_82.method1365(Static2.aClass4_Sub3_Sub22_1.aString358 + "_labels")) {
				Static7.aClass138_14 = Static16.method1555(Static5.aClass58_82, Static2.aClass4_Sub3_Sub22_1.aString358 + "_labels", Static7.aBoolean370);
			} else {
				Static3.anInt2886++;
				local12 = false;
			}
		}
		if (!local12) {
			Static6.anInt4659 = 1;
			return;
		}
		Static7.anInt5486 = 0;
		@Pc(272) boolean local272 = true;
		for (@Pc(274) int local274 = 0; local274 < Static1.aByteArrayArray4.length; local274++) {
			@Pc(282) byte[] local282 = Static5.aByteArrayArray31[local274];
			if (local282 != null) {
				@Pc(294) int local294 = (Static7.anIntArray597[local274] >> 8) * 64 - Static5.anInt3983;
				@Pc(305) int local305 = (Static7.anIntArray597[local274] & 0xFF) * 64 - Static7.anInt5479;
				if (Static5.aBoolean294) {
					local305 = 10;
					local294 = 10;
				}
				local272 &= Static28.method3320(local305, local294, local282);
			}
			if (Static3.aBoolean138) {
				@Pc(325) byte[] local325 = Static1.aByteArrayArray3[local274];
				if (local325 != null) {
					@Pc(338) int local338 = (Static7.anIntArray597[local274] >> 8) * 64 - Static5.anInt3983;
					@Pc(349) int local349 = (Static7.anIntArray597[local274] & 0xFF) * 64 - Static7.anInt5479;
					if (Static5.aBoolean294) {
						local338 = 10;
						local349 = 10;
					}
					local272 &= Static28.method3320(local349, local338, local325);
				}
			}
		}
		if (!local272) {
			Static6.anInt4659 = 2;
			return;
		}
		@Pc(374) boolean local374 = false;
		if (Static6.anInt4659 != 0) {
			Static37.method4716(LocalisedText.LOADING + "<br>(100%)", true);
		}
		Static9.method763();
		Static24.method2697();
		if (Static3.aBoolean138 && Static7.aBoolean393) {
			for (@Pc(398) int local398 = 0; local398 < Static1.aByteArrayArray4.length; local398++) {
				if (Static1.aByteArrayArray3[local398] != null || Static7.aByteArrayArray49[local398] != null) {
					local374 = true;
					break;
				}
			}
		}
		Static8.method10(Static3.aBoolean138 ? 28 : 25, local374);
		for (@Pc(430) int local430 = 0; local430 < 4; local430++) {
			Static7.aClass30Array1[local430].method579();
		}
		for (@Pc(447) int local447 = 0; local447 < 4; local447++) {
			for (@Pc(454) int local454 = 0; local454 < 104; local454++) {
				for (@Pc(461) int local461 = 0; local461 < 104; local461++) {
					Static4.aByteArrayArrayArray17[local447][local454][local461] = 0;
				}
			}
		}
		Static31.method3733(false);
		if (Static3.aBoolean138) {
			Static2.aClass56_Sub1_2.method1309();
			for (@Pc(492) int local492 = 0; local492 < 13; local492++) {
				for (@Pc(499) int local499 = 0; local499 < 13; local499++) {
					Static2.aClass103ArrayArray1[local492][local499].aBoolean197 = true;
				}
			}
		}
		if (Static3.aBoolean138) {
			Static27.method3110();
		}
		if (Static3.aBoolean138) {
			Static37.method4677();
		}
		Static9.method763();
		System.gc();
		Static32.method3917(true);
		Static31.method3803(false);
		if (!Static5.aBoolean294) {
			Static21.method2009(false);
			Static32.method3917(true);
			if (Static3.aBoolean138) {
				@Pc(553) int local553 = Static4.aClass53_Sub1_Sub1_2.anIntArray422[0] >> 3;
				@Pc(560) int local560 = Static4.aClass53_Sub1_Sub1_2.anIntArray426[0] >> 3;
				Static16.method2016(local553, local560);
			}
			Static37.method4710(false);
			if (Static7.aByteArrayArray50 != null) {
				Static14.method1062();
			}
		}
		if (Static5.aBoolean294) {
			Static26.method4359(false);
			Static32.method3917(true);
			if (Static3.aBoolean138) {
				@Pc(591) int local591 = Static4.aClass53_Sub1_Sub1_2.anIntArray426[0] >> 3;
				@Pc(598) int local598 = Static4.aClass53_Sub1_Sub1_2.anIntArray422[0] >> 3;
				Static16.method2016(local598, local591);
			}
			Static24.method2708(false);
		}
		Static24.method2697();
		Static32.method3917(true);
		Static31.method3778(Static7.aClass30Array1, Static5.aBoolean294 ? Static7.anIntArrayArrayArray15 : (int[][][]) null, false);
		if (Static3.aBoolean138) {
			Static27.method3122();
		}
		Static32.method3917(true);
		@Pc(630) int local630 = Static5.anInt3896;
		if (local630 > Static7.anInt5334) {
			local630 = Static7.anInt5334;
		}
		if (local630 >= Static7.anInt5334 - 1) {
		}
		if (Static10.method456()) {
			Static8.method90(0);
		} else {
			Static8.method90(Static5.anInt3896);
		}
		Static38.method4791();
		if (Static3.aBoolean138 && local374) {
			Static35.method4368(true);
			Static31.method3803(true);
			if (!Static5.aBoolean294) {
				Static21.method2009(true);
				Static32.method3917(true);
				Static37.method4710(true);
			}
			if (Static5.aBoolean294) {
				Static26.method4359(true);
				Static32.method3917(true);
				Static24.method2708(true);
			}
			Static24.method2697();
			Static32.method3917(true);
			Static31.method3778(Static7.aClass30Array1, Static5.aBoolean294 ? Static7.anIntArrayArrayArray15 : (int[][][]) null, true);
			Static32.method3917(true);
			Static38.method4791();
			Static35.method4368(false);
		}
		if (Static3.aBoolean138) {
			for (@Pc(718) int local718 = 0; local718 < 13; local718++) {
				for (@Pc(723) int local723 = 0; local723 < 13; local723++) {
					Static2.aClass103ArrayArray1[local718][local723].method2238(Static6.anIntArrayArrayArray13[0], local718 * 8, local723 * 8);
				}
			}
		}
		for (@Pc(751) int local751 = 0; local751 < 104; local751++) {
			for (@Pc(758) int local758 = 0; local758 < 104; local758++) {
				Static8.method89(local751, local758);
			}
		}
		Static16.method2014();
		Static9.method763();
		Static37.method4714();
		Static24.method2697();
		Static4.aBoolean189 = false;
		if (Static3.aBoolean138) {
			Static23.method1936(true);
		}
		if (GameShell.frame != null && Static3.aClass52_7 != null && Static4.anInt3304 == 25) {
			Static3.aClass4_Sub10_Sub1_1.writeOpcode(236);
			Static3.aClass4_Sub10_Sub1_1.writeInt(1057001181);
		}
		if (!Static5.aBoolean294) {
			@Pc(822) int local822 = (Static4.anInt3360 - 6) / 8;
			@Pc(828) int local828 = (Static4.anInt3360 + 6) / 8;
			@Pc(834) int local834 = (Static1.anInt5 - 6) / 8;
			@Pc(840) int local840 = (Static1.anInt5 + 6) / 8;
			for (@Pc(844) int local844 = local822 - 1; local844 <= local828 + 1; local844++) {
				for (@Pc(853) int local853 = local834 - 1; local853 <= local840 + 1; local853++) {
					if (local844 < local822 || local844 > local828 || local853 < local834 || local840 < local853) {
						Static3.aClass58_47.method1357("m" + local844 + "_" + local853);
						Static3.aClass58_47.method1357("l" + local844 + "_" + local853);
					}
				}
			}
		}
		if (Static4.anInt3304 == 28) {
			Static9.method233(10);
		} else {
			Static9.method233(30);
			if (Static3.aClass52_7 != null) {
				Static3.aClass4_Sub10_Sub1_1.writeOpcode(113);
			}
		}
		Static35.method4306();
		Static9.method763();
		Static18.method4371();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!fh;I)Lclient!fe;")
	public static Class56_Sub1 method3003(@OriginalArg(2) Class58 arg0, @OriginalArg(3) int arg1) {
		return Static9.method197(arg0, arg1, 0) ? Static27.method3187() : null;
	}

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
	public static void method3007() {
		if (Static7.aBoolean401) {
			return;
		}
		Static5.aBoolean248 = true;
		if (Static5.aBoolean293) {
			Static5.aFloat97 = (int) Static5.aFloat97 - 65 & 0xFFFFFF80;
		} else {
			Static4.aFloat79 += (-Static4.aFloat79 - 24.0F) / 2.0F;
		}
		Static7.aBoolean401 = true;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!wf;II)V")
	public static void method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2, @OriginalArg(3) int arg3) {
		Static9.method763();
		if (Static3.aBoolean138) {
			Static18.method1693(arg0, arg3, arg2.anInt5893 + arg0, arg2.anInt5949 + arg3);
		} else {
			Static34.method4209(arg0, arg3, arg0 + arg2.anInt5893, arg3 + arg2.anInt5949);
		}
		if (Static5.anInt5206 != 2 && Static5.anInt5206 != 5 && Static5.aClass4_Sub3_Sub14_4 != null) {
			@Pc(92) int local92 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
			@Pc(101) int local101 = 464 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
			@Pc(109) int local109 = Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32 + 48;
			if (Static3.aBoolean138) {
				((Class4_Sub3_Sub14_Sub2) Static5.aClass4_Sub3_Sub14_4).method4519(arg0, arg3, arg2.anInt5893, arg2.anInt5949, local109, local101, local92, Static6.anInt4761 + 256, (Class4_Sub3_Sub14_Sub2) arg2.method4729(false));
			} else {
				((Class4_Sub3_Sub14_Sub1) Static5.aClass4_Sub3_Sub14_4).method2167(arg0, arg3, arg2.anInt5893, arg2.anInt5949, local109, local101, local92, Static6.anInt4761 + 256, arg2.anIntArray672, arg2.anIntArray657);
			}
			if (Static7.aClass138_14 != null) {
				for (@Pc(158) int local158 = 0; local158 < Static7.aClass138_14.anInt4219; local158++) {
					if (Static7.aClass138_14.aClass4_Sub3_Sub7Array1[local158] != null && Static7.aClass138_14.anIntArray448[local158] >> 28 == Static7.anInt5334) {
						@Pc(188) int local188 = (Static7.aClass138_14.anIntArray448[local158] >> 14 & 0x3FFF) - Static5.anInt3983;
						@Pc(197) int local197 = (Static7.aClass138_14.anIntArray448[local158] & 0x3FFF) - Static7.anInt5479;
						if (local188 >= 0 && local188 < 104 && local197 >= 0 && local197 < 104) {
							@Pc(227) int local227 = local188 * 4 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32;
							@Pc(239) int local239 = local197 * 4 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
							Static35.method4360(arg3, arg2, arg0, Static7.aClass138_14.aClass4_Sub3_Sub7Array1[local158].anInt1760, local227, local239);
						}
					}
				}
			}
			for (@Pc(258) int local258 = 0; local258 < Static6.anInt4434; local258++) {
				@Pc(277) int local277 = Static3.anIntArray189[local258] * 4 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32;
				@Pc(292) int local292 = Static2.anIntArray187[local258] * 4 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
				@Pc(298) Class181 local298 = Static8.method99(Static1.anIntArray15[local258]);
				if (local298.anIntArray631 != null) {
					local298 = local298.method4453();
					if (local298 == null || local298.anInt5526 == -1) {
						continue;
					}
				}
				Static35.method4360(arg3, arg2, arg0, local298.anInt5526, local277, local292);
			}
			for (@Pc(329) int local329 = 0; local329 < 104; local329++) {
				for (@Pc(334) int local334 = 0; local334 < 104; local334++) {
					@Pc(347) Class112 local347 = Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local329][local334];
					if (local347 != null) {
						@Pc(362) int local362 = local329 * 4 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32;
						@Pc(374) int local374 = local334 * 4 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
						Static11.method525(arg0, arg2, arg3, local362, local374, Static2.aClass4_Sub3_Sub14Array6[0]);
					}
				}
			}
			for (@Pc(394) int local394 = 0; local394 < Static6.anInt4451; local394++) {
				@Pc(407) Class53_Sub1_Sub2 local407 = Static3.aClass53_Sub1_Sub2Array1[Static7.anIntArray595[local394]];
				if (local407 != null && local407.method3310()) {
					@Pc(418) Class168 local418 = local407.aClass168_1;
					if (local418 != null && local418.anIntArray590 != null) {
						local418 = local418.method4265();
					}
					if (local418 != null && local418.aBoolean356 && local418.aBoolean357) {
						@Pc(448) int local448 = local407.anInt3974 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32;
						@Pc(459) int local459 = local407.anInt4002 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
						if (local418.anInt5267 == -1) {
							Static11.method525(arg0, arg2, arg3, local448, local459, Static2.aClass4_Sub3_Sub14Array6[1]);
						} else {
							Static35.method4360(arg3, arg2, arg0, local418.anInt5267, local448, local459);
						}
					}
				}
			}
			for (@Pc(493) int local493 = 0; local493 < Static3.anInt2510; local493++) {
				@Pc(502) Class53_Sub1_Sub1 local502 = Static5.aClass53_Sub1_Sub1Array1[Static4.anIntArray317[local493]];
				if (local502 != null && local502.method3310()) {
					@Pc(520) int local520 = local502.anInt3974 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32;
					@Pc(522) boolean local522 = false;
					@Pc(533) int local533 = local502.anInt4002 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
					@Pc(540) long local540 = Static18.method1746(local502.aString88);
					for (@Pc(542) int local542 = 0; local542 < Static6.anInt5214; local542++) {
						if (local540 == Static7.aLongArray54[local542] && Static4.anIntArray293[local542] != 0) {
							local522 = true;
							break;
						}
					}
					@Pc(567) boolean local567 = false;
					for (@Pc(569) int local569 = 0; local569 < Static4.anInt3260; local569++) {
						if (Static6.aClass4_Sub15Array1[local569].key == local540) {
							local567 = true;
							break;
						}
					}
					@Pc(588) boolean local588 = false;
					if (Static4.aClass53_Sub1_Sub1_2.anInt1593 != 0 && local502.anInt1593 != 0 && Static4.aClass53_Sub1_Sub1_2.anInt1593 == local502.anInt1593) {
						local588 = true;
					}
					if (local522) {
						Static11.method525(arg0, arg2, arg3, local520, local533, Static2.aClass4_Sub3_Sub14Array6[3]);
					} else if (local567) {
						Static11.method525(arg0, arg2, arg3, local520, local533, Static2.aClass4_Sub3_Sub14Array6[5]);
					} else if (local588) {
						Static11.method525(arg0, arg2, arg3, local520, local533, Static2.aClass4_Sub3_Sub14Array6[4]);
					} else {
						Static11.method525(arg0, arg2, arg3, local520, local533, Static2.aClass4_Sub3_Sub14Array6[2]);
					}
				}
			}
			@Pc(670) int local670 = 0;
			@Pc(672) Class94[] local672 = Static7.aClass94Array1;
			while (local672.length > local670) {
				@Pc(684) Class94 local684 = local672[local670];
				if (local684 != null && local684.anInt2561 != 0 && Static2.anInt954 % 20 < 10) {
					if (local684.anInt2561 == 1 && local684.anInt2560 >= 0 && local684.anInt2560 < Static3.aClass53_Sub1_Sub2Array1.length) {
						@Pc(717) Class53_Sub1_Sub2 local717 = Static3.aClass53_Sub1_Sub2Array1[local684.anInt2560];
						if (local717 != null) {
							@Pc(731) int local731 = local717.anInt4002 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
							@Pc(742) int local742 = local717.anInt3974 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32;
							Static30.method3619(arg2, 360000, arg0, local731, arg3, local742, local684.anInt2559);
						}
					}
					if (local684.anInt2561 == 2) {
						@Pc(774) int local774 = (local684.anInt2565 - Static7.anInt5479) * 4 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
						@Pc(779) int local779 = local684.anInt2562 * 4;
						@Pc(795) int local795 = (local684.anInt2558 - Static5.anInt3983) * 4 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32;
						local779 *= local779;
						Static30.method3619(arg2, local779, arg0, local774, arg3, local795, local684.anInt2559);
					}
					if (local684.anInt2561 == 10 && local684.anInt2560 >= 0 && local684.anInt2560 < Static5.aClass53_Sub1_Sub1Array1.length) {
						@Pc(834) Class53_Sub1_Sub1 local834 = Static5.aClass53_Sub1_Sub1Array1[local684.anInt2560];
						if (local834 != null) {
							@Pc(847) int local847 = local834.anInt3974 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32;
							@Pc(858) int local858 = local834.anInt4002 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
							Static30.method3619(arg2, 360000, arg0, local858, arg3, local847, local684.anInt2559);
						}
					}
				}
				local670++;
			}
			if (Static6.anInt4506 != 0) {
				@Pc(895) int local895 = Static6.anInt4506 * 4 + Static4.aClass53_Sub1_Sub1_2.method3311() * 2 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32 - 2;
				@Pc(917) int local917 = Static3.anInt2140 * 4 + Static4.aClass53_Sub1_Sub1_2.method3311() * 2 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32 - 2;
				Static11.method525(arg0, arg2, arg3, local895, local917, Static1.aClass4_Sub3_Sub14Array2[Static3.aBoolean147 ? 1 : 0]);
			}
			if (Static3.aBoolean138) {
				Static18.method1701(arg0 + arg2.anInt5893 / 2 - 1, arg2.anInt5949 / 2 + arg3 - 1, 3, 3, 16777215);
			} else {
				method4205(arg0 + arg2.anInt5893 / 2 - 1, arg2.anInt5949 / 2 + arg3 - 1, 3, 3, 16777215);
			}
		} else if (Static3.aBoolean138) {
			@Pc(64) Class4_Sub3_Sub14 local64 = arg2.method4729(false);
			if (local64 != null) {
				local64.method4506(arg0, arg3);
			}
		} else {
			Static34.method4210(arg0, arg3, arg2.anIntArray672, arg2.anIntArray657);
		}
		Static6.aBooleanArray24[arg1] = true;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)V")
	public static void method4204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg0;
		@Pc(7) int local7 = arg3 - arg1;
		if (local7 == 0) {
			if (local3 >= 0) {
				Static34.method4214(arg0, arg1, local3 + 1, arg4);
			} else {
				Static34.method4214(arg0 + local3, arg1, 1 - local3, arg4);
			}
		} else if (local3 != 0) {
			if (local3 + local7 < 0) {
				arg0 += local3;
				local3 = -local3;
				arg1 += local7;
				local7 = -local7;
			}
			if (local3 > local7) {
				@Pc(78) int local78 = arg1 << 16;
				@Pc(82) int local82 = local78 + 32768;
				arg3 = local7 << 16;
				@Pc(96) int local96 = (int) Math.floor((double) arg3 / (double) local3 + 0.5D);
				@Pc(100) int local100 = local3 + arg0;
				if (arg0 < Static6.anInt5185) {
					local82 += local96 * (Static6.anInt5185 - arg0);
					arg0 = Static6.anInt5185;
				}
				if (local100 >= Static6.anInt5186) {
					local100 = Static6.anInt5186 - 1;
				}
				while (arg0 <= local100) {
					@Pc(127) int local127 = local82 >> 16;
					if (local127 >= Static6.anInt5183 && local127 < Static6.anInt5187) {
						Static6.anIntArray561[arg0 + local127 * Static6.anInt5188] = arg4;
					}
					local82 += local96;
					arg0++;
				}
			} else {
				@Pc(152) int local152 = arg0 << 16;
				@Pc(156) int local156 = local152 + 32768;
				arg2 = local3 << 16;
				@Pc(170) int local170 = (int) Math.floor((double) arg2 / (double) local7 + 0.5D);
				@Pc(174) int local174 = local7 + arg1;
				if (arg1 < Static6.anInt5183) {
					local156 += local170 * (Static6.anInt5183 - arg1);
					arg1 = Static6.anInt5183;
				}
				if (local174 >= Static6.anInt5187) {
					local174 = Static6.anInt5187 - 1;
				}
				while (arg1 <= local174) {
					@Pc(201) int local201 = local156 >> 16;
					if (local201 >= Static6.anInt5185 && local201 < Static6.anInt5186) {
						Static6.anIntArray561[local201 + arg1 * Static6.anInt5188] = arg4;
					}
					local156 += local170;
					arg1++;
				}
			}
		} else if (local7 >= 0) {
			Static34.method4212(arg0, arg1, local7 + 1, arg4);
		} else {
			Static34.method4212(arg0, arg1 + local7, 1 - local7, arg4);
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIIII)V")
	public static void method4205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < Static6.anInt5185) {
			arg2 -= Static6.anInt5185 - arg0;
			arg0 = Static6.anInt5185;
		}
		if (arg1 < Static6.anInt5183) {
			arg3 -= Static6.anInt5183 - arg1;
			arg1 = Static6.anInt5183;
		}
		if (arg0 + arg2 > Static6.anInt5186) {
			arg2 = Static6.anInt5186 - arg0;
		}
		if (arg1 + arg3 > Static6.anInt5187) {
			arg3 = Static6.anInt5187 - arg1;
		}
		@Pc(43) int local43 = Static6.anInt5188 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * Static6.anInt5188;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(57) int local57 = -arg2; local57 < 0; local57++) {
				Static6.anIntArray561[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(IIIII)V")
	public static void method4206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return;
		}
		if (arg4 == 256) {
			Static34.method4208(arg0, arg1, arg2, arg3);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(20) int local20 = 256 - arg4;
		@Pc(28) int local28 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(36) int local36 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(42) int local42 = (arg3 & 0xFF) * arg4;
		@Pc(46) int local46 = arg1 - arg2;
		if (local46 < Static6.anInt5183) {
			local46 = Static6.anInt5183;
		}
		@Pc(57) int local57 = arg1 + arg2 + 1;
		if (local57 > Static6.anInt5187) {
			local57 = Static6.anInt5187;
		}
		@Pc(64) int local64 = local46;
		@Pc(68) int local68 = arg2 * arg2;
		@Pc(70) int local70 = 0;
		@Pc(74) int local74 = arg1 - local46;
		@Pc(78) int local78 = local74 * local74;
		@Pc(82) int local82 = local78 - local74;
		if (arg1 > local57) {
			arg1 = local57;
		}
		while (local64 < arg1) {
			while (local82 <= local68 || local78 <= local68) {
				local78 += local70 + local70;
				local82 += local70++ + local70;
			}
			@Pc(116) int local116 = arg0 + 1 - local70;
			if (local116 < Static6.anInt5185) {
				local116 = Static6.anInt5185;
			}
			@Pc(125) int local125 = arg0 + local70;
			if (local125 > Static6.anInt5186) {
				local125 = Static6.anInt5186;
			}
			@Pc(136) int local136 = local116 + local64 * Static6.anInt5188;
			for (@Pc(138) int local138 = local116; local138 < local125; local138++) {
				@Pc(151) int local151 = (Static6.anIntArray561[local136] >> 16 & 0xFF) * local20;
				@Pc(161) int local161 = (Static6.anIntArray561[local136] >> 8 & 0xFF) * local20;
				@Pc(169) int local169 = (Static6.anIntArray561[local136] & 0xFF) * local20;
				@Pc(191) int local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				Static6.anIntArray561[local136++] = local191;
			}
			local64++;
			local78 -= local74-- + local74;
			local82 -= local74 + local74;
		}
		@Pc(215) int local215 = arg2;
		@Pc(218) int local218 = -local74;
		@Pc(224) int local224 = local218 * local218 + local68;
		@Pc(228) int local228 = local224 - arg2;
		@Pc(232) int local232 = local224 - local218;
		while (local64 < local57) {
			while (local232 > local68 && local228 > local68) {
				local232 -= local215-- + local215;
				local228 -= local215 + local215;
			}
			@Pc(259) int local259 = arg0 - local215;
			if (local259 < Static6.anInt5185) {
				local259 = Static6.anInt5185;
			}
			@Pc(268) int local268 = arg0 + local215;
			if (local268 > Static6.anInt5186 - 1) {
				local268 = Static6.anInt5186 - 1;
			}
			@Pc(283) int local283 = local259 + local64 * Static6.anInt5188;
			for (@Pc(285) int local285 = local259; local285 <= local268; local285++) {
				@Pc(298) int local298 = (Static6.anIntArray561[local283] >> 16 & 0xFF) * local20;
				@Pc(308) int local308 = (Static6.anIntArray561[local283] >> 8 & 0xFF) * local20;
				@Pc(316) int local316 = (Static6.anIntArray561[local283] & 0xFF) * local20;
				@Pc(338) int local338 = (local28 + local298 >> 8 << 16) + (local36 + local308 >> 8 << 8) + (local42 + local316 >> 8);
				Static6.anIntArray561[local283++] = local338;
			}
			local64++;
			local232 += local218 + local218;
			local228 += local218++ + local218;
		}
	}
}

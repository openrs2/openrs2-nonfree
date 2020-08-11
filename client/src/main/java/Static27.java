import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ic;Lclient!oh;B)Lclient!ih;")
	public static Class4_Sub12 method4237(@OriginalArg(0) HashTable arg0, @OriginalArg(1) Class127 arg1) {
		@Pc(27) long local27 = ((long) arg1.anInt3868 << 56) + ((long) arg1.anInt3874 << 32) + (long) (arg1.anInt3876 + (arg1.anInt3877 + 1 << 16));
		@Pc(39) Class4_Sub12 local39 = (Class4_Sub12) arg0.get(local27);
		if (local39 == null) {
			local39 = new Class4_Sub12(arg1.anInt3877, (float) arg1.anInt3876, true, false, arg1.anInt3874);
			arg0.put(local27, local39);
		}
		return local39;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method4239() {
		Static5.anInt5206 = 0;
		Static3.aBoolean147 = false;
		Static3.anInt2140 = 0;
		Static4.anInt3020 = -1;
		Static6.anInt4506 = 0;
		Static1.aByte1 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIIII)V")
	public static void method4241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static5.anInt4230 < arg2 || Static4.anInt3086 > arg1) {
			return;
		}
		@Pc(23) boolean local23;
		if (Static2.anInt902 > arg4) {
			arg4 = Static2.anInt902;
			local23 = false;
		} else if (arg4 > Static3.anInt2553) {
			arg4 = Static3.anInt2553;
			local23 = false;
		} else {
			local23 = true;
		}
		@Pc(51) boolean local51;
		if (arg0 < Static2.anInt902) {
			arg0 = Static2.anInt902;
			local51 = false;
		} else if (Static3.anInt2553 < arg0) {
			arg0 = Static3.anInt2553;
			local51 = false;
		} else {
			local51 = true;
		}
		@Pc(71) int local71;
		if (Static4.anInt3086 <= arg2) {
			local71 = arg2 + 1;
			Static18.method1656(Static5.anIntArrayArray36[arg2], arg3, arg4, arg0);
		} else {
			local71 = Static4.anInt3086;
		}
		@Pc(89) int local89;
		if (Static5.anInt4230 < arg1) {
			local89 = Static5.anInt4230;
		} else {
			local89 = arg1 - 1;
			Static18.method1656(Static5.anIntArrayArray36[arg1], arg3, arg4, arg0);
		}
		if (local23 && local51) {
			for (@Pc(106) int local106 = local71; local106 <= local89; local106++) {
				@Pc(113) int[] local113 = Static5.anIntArrayArray36[local106];
				local113[arg4] = local113[arg0] = arg3;
			}
		} else if (local23) {
			for (@Pc(149) int local149 = local71; local149 <= local89; local149++) {
				Static5.anIntArrayArray36[local149][arg4] = arg3;
			}
		} else if (local51) {
			for (@Pc(133) int local133 = local71; local133 <= local89; local133++) {
				Static5.anIntArrayArray36[local133][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method4243(@OriginalArg(1) int arg0) {
		if (Static15.method1364(arg0)) {
			Static29.method3495(Static5.aClass185ArrayArray115[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z")
	public static boolean method3104(@OriginalArg(1) int arg0) {
		if (Static7.anInt5610 == arg0) {
			return false;
		}
		Static1.anIntArrayArray9 = new int[104][104];
		Static7.anIntArrayArray48 = new int[104][104];
		Static7.anIntArrayArrayArray15 = new int[4][13][13];
		Static1.anIntArrayArray2 = new int[104][104];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static7.aClass30Array1[local36] = new Class30(104, 104);
		}
		Static4.aByteArrayArrayArray17 = new byte[4][104][104];
		Static1.aByteArrayArrayArray2 = new byte[4][104][104];
		Static4.aClass112ArrayArrayArray1 = new LinkedList[4][104][104];
		if (Static3.aBoolean138) {
			method3109();
			Static14.method1205();
			Static5.aClass187ArrayArray1 = new Class187[13][13];
		}
		Static7.anInt5610 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
	public static void method3109() {
		Static5.anInt3738 = 4;
		Static5.anInt3732 = 104;
		Static5.anInt3733 = 104;
		Static5.anIntArrayArrayArray10 = new int[Static5.anInt3738][Static5.anInt3732][Static5.anInt3733];
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
	public static void method3110() {
		Static5.anInt3736 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static5.anInt3738; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static5.anInt3732; local8++) {
				for (@Pc(13) int local13 = 0; local13 < Static5.anInt3733; local13++) {
					Static5.anIntArrayArrayArray10[local3][local8][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V")
	public static void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int local1 = 0; local1 < Static5.anInt3736; local1++) {
			Static5.aClass50Array1[local1].method1076(arg1, arg0);
		}
		Static5.anInt3734 = -1;
		Static5.anInt3737 = -1;
		Static5.anInt3740 = -1;
		Static5.anInt3735 = -1;
		Static5.anInt3739 = -1;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
	public static void method3112() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			Static5.anIntArray403[local1] = -1;
			method3124(local1);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!em;)V")
	public static void method3113(@OriginalArg(0) Class50 arg0) {
		if (Static5.anInt3736 >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			Static5.aClass50Array1[Static5.anInt3736++] = arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)V")
	public static void method3114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static2.aBoolean66 || Static5.anInt3734 == arg3 && Static5.anInt3737 == arg4 && Static5.anInt3740 == arg5 && Static5.anInt3735 == arg4 && Static5.anInt3739 == arg5) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			Static5.aBooleanArray20[local20] = false;
		}
		@Pc(31) int local31 = 0;
		@Pc(39) int local39 = Static5.anIntArrayArrayArray10[arg3][arg4][arg5];
		while (true) {
			label72:
			while (local39 != 0) {
				@Pc(47) int local47 = (local39 & 0xFF) - 1;
				local39 >>>= 8;
				for (@Pc(53) int local53 = 0; local53 < 4; local53++) {
					if (local47 == Static5.anIntArray403[local53]) {
						Static5.aBooleanArray20[local53] = true;
						continue label72;
					}
				}
				Static5.anIntArray404[local31++] = local47;
			}
			for (@Pc(76) int local76 = 0; local76 < local31; local76++) {
				for (@Pc(81) int local81 = 0; local81 < 4; local81++) {
					if (!Static5.aBooleanArray20[local81]) {
						Static5.anIntArray403[local81] = Static5.anIntArray404[local76];
						Static5.aBooleanArray20[local81] = true;
						method3125(local81, Static5.aClass50Array1[Static5.anIntArray404[local76]], arg0, arg1, arg2);
						break;
					}
				}
			}
			for (@Pc(115) int local115 = 0; local115 < 4; local115++) {
				if (!Static5.aBooleanArray20[local115]) {
					Static5.anIntArray403[local115] = -1;
					method3124(local115);
				}
			}
			Static5.anInt3734 = arg3;
			Static5.anInt3737 = arg4;
			Static5.anInt3740 = arg5;
			Static5.anInt3735 = arg4;
			Static5.anInt3739 = arg5;
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static2.aBoolean66 || Static5.anInt3734 == arg3 && Static5.anInt3737 == arg4 && Static5.anInt3740 == arg5 && Static5.anInt3735 == arg6 && Static5.anInt3739 == arg7) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			Static5.aBooleanArray20[local20] = false;
		}
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		label112:
		for (@Pc(35) int local35 = arg4; local35 <= arg6; local35++) {
			label110:
			for (@Pc(40) int local40 = arg5; local40 <= arg7; local40++) {
				@Pc(51) int local51 = Static5.anIntArrayArrayArray10[arg3][local35][local40];
				while (true) {
					while (true) {
						label96:
						while (true) {
							if (local51 == 0) {
								continue label110;
							}
							@Pc(59) int local59 = (local51 & 0xFF) - 1;
							local51 >>>= 8;
							for (@Pc(65) int local65 = 0; local65 < local33; local65++) {
								if (local59 == Static5.anIntArray404[local65]) {
									continue label96;
								}
							}
							for (@Pc(78) int local78 = 0; local78 < 4; local78++) {
								if (local59 == Static5.anIntArray403[local78]) {
									if (!Static5.aBooleanArray20[local78]) {
										Static5.aBooleanArray20[local78] = true;
										local31++;
										if (local31 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							Static5.anIntArray404[local33++] = local59;
							local31++;
							if (local31 == 4) {
								break label112;
							}
						}
					}
				}
			}
		}
		for (@Pc(118) int local118 = 0; local118 < local33; local118++) {
			for (@Pc(123) int local123 = 0; local123 < 4; local123++) {
				if (!Static5.aBooleanArray20[local123]) {
					Static5.anIntArray403[local123] = Static5.anIntArray404[local118];
					Static5.aBooleanArray20[local123] = true;
					method3125(local123, Static5.aClass50Array1[Static5.anIntArray404[local118]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (@Pc(157) int local157 = 0; local157 < 4; local157++) {
			if (!Static5.aBooleanArray20[local157]) {
				Static5.anIntArray403[local157] = -1;
				method3124(local157);
			}
		}
		Static5.anInt3734 = arg3;
		Static5.anInt3737 = arg4;
		Static5.anInt3740 = arg5;
		Static5.anInt3735 = arg6;
		Static5.anInt3739 = arg7;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II[[[Lclient!nh;)V")
	public static void method3116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub19[][][] arg2) {
		if (!Static2.aBoolean66) {
			return;
		}
		@Pc(4) GL local4 = Static3.aGL1;
		Static24.method2652(0, 0);
		Static17.method1597(0);
		Static16.method1595();
		Static17.method1600(Static3.anInt2075);
		local4.glDepthMask(false);
		Static17.method1610(false);
		local4.glBlendFunc(GL.GL_DST_COLOR, GL.GL_ONE);
		local4.glFogfv(GL.GL_FOG_COLOR, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
		local4.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_CONSTANT);
		local4.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_ALPHA);
		label71:
		for (@Pc(56) int local56 = 0; local56 < Static5.anInt3736; local56++) {
			@Pc(63) Class50 local63 = Static5.aClass50Array1[local56];
			@Pc(66) int local66 = local63.anInt1326;
			if (local63.aBoolean80) {
				local66--;
			}
			if (local63.aClass135_1 != null) {
				@Pc(76) int local76 = 0;
				@Pc(84) int local84 = (local63.anInt1320 >> 7) - local63.anInt1318;
				@Pc(92) int local92 = (local63.anInt1320 >> 7) + local63.anInt1318;
				if (local92 >= Static2.anInt1344) {
					local92 = Static2.anInt1344 - 1;
				}
				if (local84 < Static1.anInt890) {
					local76 = Static1.anInt890 - local84;
					local84 = Static1.anInt890;
				}
				for (@Pc(112) int local112 = local84; local112 <= local92; local112++) {
					@Pc(121) short local121 = local63.aShortArray28[local76++];
					@Pc(133) int local133 = (local63.anInt1338 >> 7) + (local121 >> 8) - local63.anInt1318;
					@Pc(141) int local141 = local133 + (local121 & 0xFF) - 1;
					if (local133 < Static6.anInt4978) {
						local133 = Static6.anInt4978;
					}
					if (local141 >= Static2.anInt5778) {
						local141 = Static2.anInt5778 - 1;
					}
					for (@Pc(155) int local155 = local133; local155 <= local141; local155++) {
						@Pc(160) Class4_Sub19 local160 = null;
						if (local66 >= 0) {
							local160 = arg2[local66][local155][local112];
						}
						if (local66 < 0 || local160 != null && local160.aBoolean257) {
							Static17.method1613(201.5F - (float) local63.anInt1326 * 50.0F - 1.5F);
							local4.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, new float[] { 0.0F, 0.0F, 0.0F, local63.aFloat33 }, 0);
							local63.aClass135_1.method3433();
							continue label71;
						}
					}
				}
			}
		}
		local4.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		local4.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
		local4.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
		local4.glDepthMask(true);
		local4.glFogfv(GL.GL_FOG_COLOR, Static4.aFloatArray39, 0);
		local4.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		Static17.method1618();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	public static void method3117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!Static2.aBoolean66) {
			return;
		}
		label43:
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (Static5.anIntArray403[local4] != -1) {
				@Pc(20) int local20 = Static5.anIntArrayArrayArray10[arg0][arg1][arg2];
				while (local20 != 0) {
					@Pc(28) int local28 = (local20 & 0xFF) - 1;
					local20 >>>= 8;
					if (local28 == Static5.anIntArray403[local4]) {
						continue label43;
					}
				}
				@Pc(47) int local47 = Static5.anIntArrayArrayArray10[arg0][arg3][arg4];
				while (local47 != 0) {
					@Pc(55) int local55 = (local47 & 0xFF) - 1;
					local47 >>>= 8;
					if (local55 == Static5.anIntArray403[local4]) {
						continue label43;
					}
				}
			}
			Static5.anIntArray403[local4] = -1;
			method3124(local4);
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()V")
	public static void method3118() {
		@Pc(1) GL local1 = Static3.aGL1;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, GL.GL_AMBIENT, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glLightf(local10, GL.GL_LINEAR_ATTENUATION, 0.0F);
			local1.glLightf(local10, GL.GL_CONSTANT_ATTENUATION, 0.0F);
		}
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			Static5.anIntArray403[local47] = -1;
			method3124(local47);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
	public static void method3119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Static2.aBoolean66) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method3114(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < Static5.anInt3732 - 1) {
			method3114(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method3114(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < Static5.anInt3733 - 1) {
			method3114(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < Static5.anInt3733 - 1) {
			method3114(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < Static5.anInt3732 - 1 && arg6 < Static5.anInt3733 - 1) {
			method3114(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method3114(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < Static5.anInt3732 - 1 && arg6 > 0) {
			method3114(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()V")
	public static void method3120() {
		Static5.aClass50Array1 = new Class50[255];
		Static5.anIntArray403 = new int[4];
		Static5.aBooleanArray21 = new boolean[4];
		Static5.anIntArray404 = new int[4];
		Static5.aBooleanArray20 = new boolean[4];
		Static5.anIntArrayArrayArray10 = new int[Static5.anInt3738][Static5.anInt3732][Static5.anInt3733];
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "()V")
	public static void method3122() {
		for (@Pc(1) int local1 = 0; local1 < Static5.anInt3736; local1++) {
			@Pc(8) Class50 local8 = Static5.aClass50Array1[local1];
			@Pc(11) int local11 = local8.anInt1326;
			if (local8.aBoolean78) {
				local11 = 0;
			}
			@Pc(19) int local19 = local8.anInt1326;
			if (local8.aBoolean79) {
				local19 = 3;
			}
			for (@Pc(26) int local26 = local11; local26 <= local19; local26++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (local8.anInt1320 >> 7) - local8.anInt1318;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (local8.anInt1320 >> 7) + local8.anInt1318;
				if (local55 > Static5.anInt3733 - 1) {
					local55 = Static5.anInt3733 - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = local8.aShortArray28[local31++];
					@Pc(87) int local87 = (local8.anInt1338 >> 7) + (local75 >> 8) - local8.anInt1318;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > Static5.anInt3732 - 1) {
						local95 = Static5.anInt3732 - 1;
					}
					for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
						@Pc(121) int local121 = Static5.anIntArrayArrayArray10[local26][local110][local66];
						if ((local121 & 0xFF) == 0) {
							Static5.anIntArrayArrayArray10[local26][local110][local66] = local121 | local1 + 1;
						} else if ((local121 & 0xFF00) == 0) {
							Static5.anIntArrayArrayArray10[local26][local110][local66] = local121 | local1 + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							Static5.anIntArrayArrayArray10[local26][local110][local66] = local121 | local1 + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							Static5.anIntArrayArrayArray10[local26][local110][local66] = local121 | local1 + 1 << 24;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "()V")
	public static void method3123() {
		Static5.aClass50Array1 = null;
		Static5.anIntArray403 = null;
		Static5.aBooleanArray21 = null;
		Static5.anIntArray404 = null;
		Static5.aBooleanArray20 = null;
		Static5.anIntArrayArrayArray10 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	private static void method3124(@OriginalArg(0) int arg0) {
		if (Static5.aBooleanArray21[arg0]) {
			Static5.aBooleanArray21[arg0] = false;
			@Pc(14) int local14 = arg0 + 16384 + 4;
			@Pc(16) GL local16 = Static3.aGL1;
			local16.glDisable(local14);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!em;III)V")
	private static void method3125(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL local7 = Static3.aGL1;
		if (!Static5.aBooleanArray21[arg0]) {
			local7.glEnable(local5);
			Static5.aBooleanArray21[arg0] = true;
		}
		local7.glLightf(local5, GL.GL_QUADRATIC_ATTENUATION, arg1.aFloat32);
		local7.glLightfv(local5, GL.GL_DIFFUSE, arg1.aFloatArray16, 0);
		Static5.aFloatArray43[0] = arg1.anInt1338 - arg2;
		Static5.aFloatArray43[1] = arg1.anInt1322 - arg3;
		Static5.aFloatArray43[2] = arg1.anInt1320 - arg4;
		local7.glLightfv(local5, GL.GL_POSITION, Static5.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V")
	public static void method3180() {
		Static6.aClass26_53.clear();
		Static7.aClass26_49.clear();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3185(@OriginalArg(1) String arg0) {
		if (Static3.anInt2576 >= 2) {
			if (arg0.equalsIgnoreCase("::gc")) {
				method4709();
				for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				@Pc(29) Runtime local29 = Runtime.getRuntime();
				@Pc(38) int local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static26.method4357(null, 0, "mem=" + local38 + "k");
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				method4709();
				for (@Pc(60) int local60 = 0; local60 < 10; local60++) {
					System.gc();
				}
				@Pc(69) Runtime local69 = Runtime.getRuntime();
				@Pc(79) int local79 = (int) ((local69.totalMemory() - local69.freeMemory()) / 1024L);
				Static26.method4357(null, 0, "Memory before cleanup=" + local79 + "k");
				Static24.method2567();
				method4709();
				for (@Pc(99) int local99 = 0; local99 < 10; local99++) {
					System.gc();
				}
				@Pc(115) int local115 = (int) ((local69.totalMemory() - local69.freeMemory()) / 1024L);
				Static26.method4357(null, 0, "Memory after cleanup=" + local115 + "k");
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static26.method4357(null, 0, "Number of player models in cache:" + Static15.method1228());
			}
			if (Static3.aBoolean138 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static4.anInt3331);
				System.out.println("oncard_2d:" + Static4.anInt3333);
				System.out.println("oncard_texture:" + Static4.anInt3330);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static23.method2455();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static7.aClass51_2.stop();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static7.aClass51_2.closeServer();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				GameShell.signLink.breakConnection();
				Static3.aClass52_7.breakConnection();
				Static7.aClass51_2.breakConnection();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				GameShell.replaceCanvas = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static9.method233(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static3.aBoolean176 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static3.aBoolean176 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static35.method4512(false, 0, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static35.method4512(false, 1, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static35.method4512(false, 2, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static35.method4512(false, 3, 1024, 768);
			}
			if (arg0.startsWith("::setba")) {
				Static5.anInt4291 = Static12.method737(arg0.substring(8));
				Static14.method1055(GameShell.signLink);
				Static2.aBoolean104 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static26.method2957(Static12.method737(arg0.substring(15)));
				Static14.method1055(GameShell.signLink);
				Static2.aBoolean104 = false;
			}
			if (arg0.startsWith("::fps ") && client.modeWhere != 0) {
				GameShell.setFramesPerSecond(Static12.method737(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static1.anInt268 = Static12.method737(arg0.substring(12).trim());
				Static26.method4357(null, 0, "rect_debug=" + Static1.anInt268);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static1.aBoolean26 = true;
			}
			if (arg0.startsWith("::hdr") && Static3.aBoolean138 && !Static10.method300(!Static13.method881())) {
				Static26.method4357(null, 0, "Failed to enable hdr");
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static6.aBoolean258) {
					Static6.aBoolean258 = false;
					Static26.method4357(null, 0, "Forced tweening disabled.");
				} else {
					Static6.aBoolean258 = true;
					Static26.method4357(null, 0, "Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static2.aBoolean68) {
					System.out.println("Shift-click disabled.");
					Static2.aBoolean68 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static2.aBoolean68 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static26.method4357(null, 0, "x:" + (Static4.aClass53_Sub1_Sub1_2.anInt3974 >> 7) + " z:" + (Static4.aClass53_Sub1_Sub1_2.anInt4002 >> 7) + " groundh:" + Static6.anIntArrayArrayArray13[Static7.anInt5334][Static4.aClass53_Sub1_Sub1_2.anInt3974 >> 7][Static4.aClass53_Sub1_Sub1_2.anInt4002 >> 7]);
			}
			if (arg0.equalsIgnoreCase("::getheight")) {
				Static26.method4357(null, 0, "Height: " + Static6.anIntArrayArrayArray13[Static7.anInt5334][Static4.aClass53_Sub1_Sub1_2.anInt3974 >> 7][Static4.aClass53_Sub1_Sub1_2.anInt4002 >> 7]);
			}
		}
		Static3.aClass4_Sub10_Sub1_1.writeOpcode(216);
		Static3.aClass4_Sub10_Sub1_1.writeByte(arg0.length() - 1);
		Static3.aClass4_Sub10_Sub1_1.writeString(arg0.substring(2));
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(III)V")
	public static void method3186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static2.aBoolean101 = true;
		Static5.anInt3715 = arg0;
		Static1.anInt315 = arg1;
		Static7.anInt5803 = arg2;
		Static1.anInt528 = -1;
		Static1.anInt420 = -1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Lclient!fe;")
	public static Class56_Sub1 method3187() {
		@Pc(21) Class56_Sub1 local21 = new Class56_Sub1(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[0], Static5.anIntArray391[0], Static3.anIntArray185[0], Static7.anIntArray643[0], Static6.aByteArrayArray36[0], Static2.anIntArray85);
		Static37.method4670();
		return local21;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)Lclient!ro;")
	public static Class4_Sub3_Sub17 method4703(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub3_Sub17 local6 = (Class4_Sub3_Sub17) Static3.aClass40_10.method889((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static2.aClass58_36.fetchFile(26, arg0);
		@Pc(25) Class4_Sub3_Sub17 local25 = new Class4_Sub3_Sub17();
		if (local21 != null) {
			local25.method3801(new Buffer(local21));
		}
		Static3.aClass40_10.method888((long) arg0, local25);
		return local25;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V")
	public static void method4704() {
		for (@Pc(3) int local3 = 0; local3 < Static6.anInt4457; local3++) {
			@Pc(10) int local10 = Static3.anIntArray217[local3]--;
			if (Static3.anIntArray217[local3] >= -10) {
				@Pc(89) Class7 local89 = Static4.aClass7Array1[local3];
				if (local89 == null) {
					local89 = Static8.method106(Static6.aClass58_92, Static4.anIntArray294[local3], 0);
					if (local89 == null) {
						continue;
					}
					@Pc(104) int[] local104 = Static3.anIntArray217;
					local104[local3] += local89.method105();
					Static4.aClass7Array1[local3] = local89;
				}
				if (Static3.anIntArray217[local3] < 0) {
					@Pc(223) int local223;
					if (Static7.anIntArray601[local3] == 0) {
						local223 = Static1.anIntArray21[local3] * Static4.anInt3315 >> 8;
					} else {
						@Pc(137) int local137 = (Static7.anIntArray601[local3] & 0xFF) * 128;
						@Pc(145) int local145 = Static7.anIntArray601[local3] >> 16 & 0xFF;
						@Pc(155) int local155 = local145 * 128 + 64 - Static4.aClass53_Sub1_Sub1_2.anInt3974;
						if (local155 < 0) {
							local155 = -local155;
						}
						@Pc(171) int local171 = Static7.anIntArray601[local3] >> 8 & 0xFF;
						@Pc(181) int local181 = local171 * 128 + 64 - Static4.aClass53_Sub1_Sub1_2.anInt4002;
						if (local181 < 0) {
							local181 = -local181;
						}
						@Pc(192) int local192 = local181 + local155 - 128;
						if (local137 < local192) {
							Static3.anIntArray217[local3] = -100;
							continue;
						}
						if (local192 < 0) {
							local192 = 0;
						}
						local223 = (local137 - local192) * Static5.anInt4120 * Static1.anIntArray21[local3] / local137 >> 8;
					}
					if (local223 > 0) {
						@Pc(240) Class4_Sub8_Sub1 local240 = local89.method107().method3338(Static7.aClass170_1);
						@Pc(245) Class4_Sub6_Sub4 local245 = Static28.method3385(local240, local223);
						local245.method3359(Static7.anIntArray629[local3] - 1);
						Static5.aClass4_Sub6_Sub3_2.method2674(local245);
					}
					Static3.anIntArray217[local3] = -100;
				}
			} else {
				Static6.anInt4457--;
				for (@Pc(24) int local24 = local3; local24 < Static6.anInt4457; local24++) {
					Static4.anIntArray294[local24] = Static4.anIntArray294[local24 + 1];
					Static4.aClass7Array1[local24] = Static4.aClass7Array1[local24 + 1];
					Static7.anIntArray629[local24] = Static7.anIntArray629[local24 + 1];
					Static3.anIntArray217[local24] = Static3.anIntArray217[local24 + 1];
					Static7.anIntArray601[local24] = Static7.anIntArray601[local24 + 1];
					Static1.anIntArray21[local24] = Static1.anIntArray21[local24 + 1];
				}
				local3--;
			}
		}
		if (Static4.aBoolean210 && !Static16.method1550()) {
			if (Static1.anInt344 != 0 && Static6.anInt4844 != -1) {
				Static28.method3251(Static1.anInt344, Static6.anInt4844, Static7.aClass58_98);
			}
			Static4.aBoolean210 = false;
		} else if (Static1.anInt344 != 0 && Static6.anInt4844 != -1 && !Static16.method1550()) {
			Static3.aClass4_Sub10_Sub1_1.writeOpcode(250);
			Static3.aClass4_Sub10_Sub1_1.writeInt(Static6.anInt4844);
			Static6.anInt4844 = -1;
		}
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(B)V")
	private static void method4705() {
		Static3.aClass26_22.clearSoft();
		Static1.aClass26_2.clearSoft();
		Static5.aClass26_39.clearSoft();
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(IIIIII)V")
	public static void method4706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static18.method1656(Static5.anIntArrayArray36[arg3++], arg0, arg1, arg2);
		Static18.method1656(Static5.anIntArrayArray36[arg4--], arg0, arg1, arg2);
		for (@Pc(31) int local31 = arg3; local31 <= arg4; local31++) {
			@Pc(42) int[] local42 = Static5.anIntArrayArray36[local31];
			local42[arg1] = local42[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
	private static void method4707() {
		Static3.aClass26_24.clearSoft();
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(B)V")
	private static void method4709() {
		method4707();
		Static28.method3258();
		Static28.method3329();
		Static35.method4400();
		method4705();
		Static11.method556();
		Static20.method1969();
		Static14.method1203();
		Static32.method3916();
		Static19.method1793();
		Static21.method2048();
		Static22.method2359();
		Static26.method2993();
		Static29.method3302();
		Static20.method1925();
		Static35.method4296();
		Static8.method91();
		Static14.method1172();
		Static20.method1974();
		Static14.method1066();
		Static18.method1713();
		Static1.aClass26_5.clearSoft();
		Static1.aClass26_3.clearSoft();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	public static void method3219() {
		Static6.aClass26_50.sweep(5);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)I")
	public static int method3220(@OriginalArg(1) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!fh;BII)[Lclient!uj;")
	public static Class4_Sub3_Sub14[] method3225(@OriginalArg(0) Js5 arg0, @OriginalArg(3) int arg1) {
		return Static9.method197(arg0, arg1, 0) ? Static21.method2064() : null;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method3226(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method3228(@OriginalArg(0) Js5 arg0) {
		Static3.aClass58_55 = arg0;
		Static2.anInt5716 = Static3.aClass58_55.getGroupCapacity(4);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZLjava/lang/String;)Z")
	public static boolean method3229(@OriginalArg(3) String arg0) {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(42) int local42 = arg0.length();
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < local42; local46++) {
			@Pc(53) char local53 = arg0.charAt(local46);
			if (local46 == 0) {
				if (local53 == '-') {
					local27 = true;
					continue;
				}
				if (local53 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local53 >= '0' && local53 <= '9') {
				local76 = local53 - '0';
			} else if (local53 >= 'A' && local53 <= 'Z') {
				local76 = local53 - '7';
			} else if (local53 >= 'a' && local53 <= 'z') {
				local76 = local53 - 'W';
			} else {
				return false;
			}
			if (local76 >= 10) {
				return false;
			}
			if (local27) {
				local76 = -local76;
			}
			@Pc(126) int local126 = local76 + local44 * 10;
			if (local126 / 10 != local44) {
				return false;
			}
			local29 = true;
			local44 = local126;
		}
		return local29;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[B)[B")
	public static byte[] method3230(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(13) byte[] local13 = new byte[arg1.length];
		if (arg0 != 64) {
			Static5.aBoolean276 = true;
		}
		ArrayUtils.copy(arg1, 0, local13, 0, arg1.length);
		return local13;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZBZIZ)Lclient!fh;")
	public static Js5 method3231(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Cache local5 = null;
		if (Static3.aClass189_4 != null) {
			local5 = new Cache(Static3.aClass189_4, Static4.aClass189Array1[arg2], arg2, 1000000);
		}
		Static6.aClass62_Sub1Array2[arg2] = Static1.aClass117_1.method2714(Static1.aClass60_2, local5, arg2);
		if (arg3) {
			Static6.aClass62_Sub1Array2[arg2].method4668();
		}
		return new Js5(Static6.aClass62_Sub1Array2[arg2], arg1, arg0);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIFIZ)[[I")
	public static int[][] method3234(@OriginalArg(6) float arg0) {
		@Pc(17) int[][] local17 = new int[256][64];
		@Pc(21) Class4_Sub1_Sub12 local21 = new Class4_Sub1_Sub12();
		local21.anInt2625 = 4;
		local21.anInt2631 = 8;
		local21.anInt2628 = 3;
		local21.anInt2620 = (int) (arg0 * 4096.0F);
		local21.aBoolean181 = false;
		local21.method4700();
		Static11.method524(64, 256);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local21.method2053(local17[local48], local48);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I")
	public static int method3235(@OriginalArg(1) int arg0) {
		if (Static3.aClass52_7 != null) {
			Static3.aClass52_7.close();
			Static3.aClass52_7 = null;
		}
		Static6.anInt4618++;
		if (Static6.anInt4618 > 4) {
			Static7.anInt5319 = 0;
			Static6.anInt4618 = 0;
			return arg0;
		}
		Static7.anInt5319 = 0;
		if (client.worldListDefaultPort == client.worldListPort) {
			client.worldListPort = client.worldListAlternatePort;
		} else {
			client.worldListPort = client.worldListDefaultPort;
		}
		return -1;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(BI)V")
	public static void method3236() {
		Static3.aClass26_26.sweep(5);
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!fe;Lclient!fe;IIIZ)V")
	public static void method1216(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(1) Class56_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg2 <= 0 || arg3 <= 0 || arg2 + 16 >= arg1.anInt3408 || arg3 + 16 >= arg1.anInt3413) {
			return;
		}
		@Pc(23) int local23 = arg2 + arg3 * arg1.anInt3408;
		@Pc(28) int local28 = arg1.anInt3408 - 16;
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
			Static14.method1206(arg1.aByteArray15, arg0.aByteArray15, local32, local23, local28, local34, local41);
		} else {
			method1222(arg1.aByteArray15, arg0.aByteArray15, local32, local23, local28, local34, local41);
		}
		method1220(arg2, arg3, 16, 16);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!fe;Lclient!fe;II)Z")
	public static boolean method1217(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(1) Class56_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = arg2 + arg0.anInt3404;
		@Pc(9) int local9 = arg3 + arg0.anInt3405;
		@Pc(16) int local16 = local4 + local9 * arg1.anInt3408;
		@Pc(19) int local19 = arg0.anInt3413;
		@Pc(22) int local22 = arg0.anInt3408;
		@Pc(27) int local27 = arg1.anInt3408 - local22;
		if (local9 <= 0) {
			@Pc(33) int local33 = 1 - local9;
			local19 -= local33;
			local16 += local33 * arg1.anInt3408;
			local9 = 1;
		}
		if (local9 + local19 >= arg1.anInt3413) {
			@Pc(61) int local61 = local9 + local19 + 1 - arg1.anInt3413;
			local19 -= local61;
		}
		if (local4 <= 0) {
			@Pc(71) int local71 = 1 - local4;
			local22 -= local71;
			local16 += local71;
			local27 += local71;
			local4 = 1;
		}
		if (local4 + local22 >= arg1.anInt3408) {
			@Pc(100) int local100 = local4 + local22 + 1 - arg1.anInt3408;
			local22 -= local100;
			local27 += local100;
		}
		if (local22 > 0 && local19 > 0) {
			@Pc(125) int local125 = local27 + arg1.anInt3408 * 7;
			return method1221(arg1.aByteArray15, local16, local22, local19, local125);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lclient!fe;Lclient!fe;II)V")
	public static void method1218(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(1) Class56_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = arg2 + arg0.anInt3404;
		@Pc(9) int local9 = arg3 + arg0.anInt3405;
		@Pc(16) int local16 = local4 + local9 * arg1.anInt3408;
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.anInt3413;
		@Pc(24) int local24 = arg0.anInt3408;
		@Pc(29) int local29 = arg1.anInt3408 - local24;
		@Pc(31) int local31 = 0;
		if (local9 <= 0) {
			@Pc(37) int local37 = 1 - local9;
			local21 -= local37;
			local18 = local37 * local24;
			local16 += local37 * arg1.anInt3408;
			local9 = 1;
		}
		if (local9 + local21 >= arg1.anInt3413) {
			@Pc(71) int local71 = local9 + local21 + 1 - arg1.anInt3413;
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
		if (local4 + local24 >= arg1.anInt3408) {
			@Pc(118) int local118 = local4 + local24 + 1 - arg1.anInt3408;
			local24 -= local118;
			local31 += local118;
			local29 += local118;
		}
		if (local24 > 0 && local21 > 0) {
			Static14.method1209(arg1.aByteArray15, arg0.aByteArray15, local18, local16, local24, local21, local29, local31);
			method1220(local4, local9, local24, local21);
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(Lclient!fe;Lclient!fe;II)V")
	public static void method1219(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(1) Class56_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = arg2 + arg0.anInt3404;
		@Pc(9) int local9 = arg3 + arg0.anInt3405;
		@Pc(16) int local16 = local4 + local9 * arg1.anInt3408;
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.anInt3413;
		@Pc(24) int local24 = arg0.anInt3408;
		@Pc(29) int local29 = arg1.anInt3408 - local24;
		@Pc(31) int local31 = 0;
		if (local9 <= 0) {
			@Pc(37) int local37 = 1 - local9;
			local21 -= local37;
			local18 = local37 * local24;
			local16 += local37 * arg1.anInt3408;
			local9 = 1;
		}
		if (local9 + local21 >= arg1.anInt3413) {
			@Pc(71) int local71 = local9 + local21 + 1 - arg1.anInt3413;
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
		if (local4 + local24 >= arg1.anInt3408) {
			@Pc(118) int local118 = local4 + local24 + 1 - arg1.anInt3408;
			local24 -= local118;
			local31 += local118;
			local29 += local118;
		}
		if (local24 > 0 && local21 > 0) {
			Static14.method1208(arg1.aByteArray15, arg0.aByteArray15, local18, local16, local24, local21, local29, local31);
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
			@Pc(40) Class103[] local40 = Static2.aClass103ArrayArray1[local33];
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

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public static void method1224(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub3_Sub9 local8 = Static12.method2322(10, arg0);
		local8.method1519();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)I")
	public static int method1226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub18 local12 = (Class4_Sub18) Static5.aClass84_17.get((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < local12.anIntArray386.length; local37++) {
				if (arg0 == local12.anIntArray385[local37]) {
					local35 += local12.anIntArray386[local37];
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIIII)V")
	public static void method1227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static4.anInt3315 == 0 || arg2 == 0 || Static6.anInt4457 >= 50 || arg1 == -1) {
			return;
		}
		Static4.anIntArray294[Static6.anInt4457] = arg1;
		Static7.anIntArray629[Static6.anInt4457] = arg2;
		Static3.anIntArray217[Static6.anInt4457] = arg0;
		Static4.aClass7Array1[Static6.anInt4457] = null;
		Static7.anIntArray601[Static6.anInt4457] = 0;
		Static1.anIntArray21[Static6.anInt4457] = arg3;
		Static6.anInt4457++;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)I")
	public static int method1228() {
		return Static2.aClass26_12.size();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJ)V")
	public static void method1229(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static6.anInt5214 >= 100 && !Static7.aBoolean399 || Static6.anInt5214 >= 200) {
			Static26.method4357("", 0, LocalisedText.FRIENDLISTFULL);
			return;
		}
		@Pc(35) String local35 = Static29.method3477(arg0);
		for (@Pc(37) int local37 = 0; local37 < Static6.anInt5214; local37++) {
			if (arg0 == Static7.aLongArray54[local37]) {
				Static26.method4357("", 0, local35 + LocalisedText.FRIENDLISTDUPE);
				return;
			}
		}
		for (@Pc(69) int local69 = 0; local69 < Static6.anInt4516; local69++) {
			if (arg0 == Static3.aLongArray16[local69]) {
				Static26.method4357("", 0, LocalisedText.REMOVEIGNORE1 + local35 + LocalisedText.REMOVEIGNORE2);
				return;
			}
		}
		if (local35.equals(Static4.aClass53_Sub1_Sub1_2.aString88)) {
			Static26.method4357("", 0, LocalisedText.FRIENDCANTADDSELF);
			return;
		}
		Static4.aStringArray23[Static6.anInt5214] = local35;
		Static7.aLongArray54[Static6.anInt5214] = arg0;
		Static4.anIntArray293[Static6.anInt5214] = 0;
		Static4.aStringArray22[Static6.anInt5214] = "";
		Static6.anIntArray517[Static6.anInt5214] = 0;
		Static2.aBooleanArray7[Static6.anInt5214] = false;
		Static6.anInt5214++;
		Static3.anInt2102 = Static6.anInt4979;
		Static3.aClass4_Sub10_Sub1_1.writeOpcode(26);
		Static3.aClass4_Sub10_Sub1_1.writeLong(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILclient!vh;BIII)V")
	public static void method4592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg2 & 0x3;
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (local9 == 1 || local9 == 3) {
			local20 = arg4.anInt5516;
			local23 = arg4.anInt5527;
		} else {
			local20 = arg4.anInt5527;
			local23 = arg4.anInt5516;
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
		@Pc(102) int[][] local102 = Static6.anIntArrayArrayArray13[arg3];
		@Pc(111) int local111 = (arg0 << 7) + (local20 << 6);
		@Pc(138) int local138 = local102[local44][local82] + local102[local52][local74] + local102[local44][local74] + local102[local52][local82] >> 2;
		@Pc(140) int local140 = 0;
		if (arg3 != 0) {
			@Pc(152) int[][] local152 = Static6.anIntArrayArrayArray13[0];
			local140 = local138 - (local152[local44][local82] + local152[local44][local74] + local152[local52][local74] + local152[local52][local82] >> 2);
		}
		@Pc(186) int[][] local186 = null;
		if (arg3 < 3) {
			local186 = Static6.anIntArrayArrayArray13[arg3 + 1];
		}
		@Pc(212) Class96 local212 = arg4.method4450(local111, false, arg7, local138, local102, local186, true, arg2, local98, null);
		Static14.method1210(local212.aClass56_Sub1_3, local111 - arg1, local140, local98 - arg5);
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(I)V")
	public static void method4619() {
		if (Static3.anInt2574 == 5) {
			Static3.anInt2574 = 6;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([I[B[IIIIIIII)V")
	public static void method1310(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(16) int local16 = local4; local16 < 0; local16++) {
				@Pc(21) int local21 = arg3 + 1;
				@Pc(23) byte local23 = arg1[arg3];
				@Pc(28) int local28;
				if (local23 == 0) {
					local28 = arg4 + 1;
				} else {
					local28 = arg4 + 1;
					arg0[arg4] = arg2[local23 & 0xFF];
				}
				@Pc(39) int local39 = local21 + 1;
				@Pc(41) byte local41 = arg1[local21];
				@Pc(46) int local46;
				if (local41 == 0) {
					local46 = local28 + 1;
				} else {
					local46 = local28 + 1;
					arg0[local28] = arg2[local41 & 0xFF];
				}
				@Pc(57) int local57 = local39 + 1;
				@Pc(59) byte local59 = arg1[local39];
				@Pc(64) int local64;
				if (local59 == 0) {
					local64 = local46 + 1;
				} else {
					local64 = local46 + 1;
					arg0[local46] = arg2[local59 & 0xFF];
				}
				arg3 = local57 + 1;
				@Pc(77) byte local77 = arg1[local57];
				if (local77 == 0) {
					arg4 = local64 + 1;
				} else {
					arg4 = local64 + 1;
					arg0[local64] = arg2[local77 & 0xFF];
				}
			}
			for (@Pc(94) int local94 = arg5; local94 < 0; local94++) {
				@Pc(101) byte local101 = arg1[arg3++];
				if (local101 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local101 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
	public static void method1317(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(1) int local1 = arg3;
		for (@Pc(4) int local4 = -arg8; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg4 >> 16) * arg11;
			for (@Pc(15) int local15 = -arg7; local15 < 0; local15++) {
				@Pc(25) byte local25 = arg1[(arg3 >> 16) + local12];
				if (local25 == 0) {
					arg5++;
				} else {
					arg0[arg5++] = arg2[local25 & 0xFF];
				}
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = local1;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([I[B[IIIIIIIIIII)V")
	public static void method1318(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(1) int local1 = arg3;
		@Pc(7) int local7 = arg12 >> 16 & 0xFF;
		@Pc(13) int local13 = arg12 >> 8 & 0xFF;
		@Pc(17) int local17 = arg12 & 0xFF;
		for (@Pc(20) int local20 = -arg8; local20 < 0; local20++) {
			@Pc(28) int local28 = (arg4 >> 16) * arg11;
			for (@Pc(31) int local31 = -arg7; local31 < 0; local31++) {
				@Pc(41) byte local41 = arg1[(arg3 >> 16) + local28];
				if (local41 == 0) {
					arg5++;
				} else {
					@Pc(49) int local49 = arg2[local41 & 0xFF];
					@Pc(55) int local55 = local49 >> 16 & 0xFF;
					@Pc(61) int local61 = local49 >> 8 & 0xFF;
					@Pc(65) int local65 = local49 & 0xFF;
					arg0[arg5++] = (local55 * local7 >> 8 << 16) + (local61 * local13 >> 8 << 8) + (local65 * local17 >> 8);
				}
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = local1;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "([I[B[IIIIIIII)V")
	public static void method1319(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) int local3 = 256 - arg9;
		for (@Pc(6) int local6 = -arg6; local6 < 0; local6++) {
			for (@Pc(11) int local11 = -arg5; local11 < 0; local11++) {
				@Pc(18) byte local18 = arg1[arg3++];
				if (local18 == 0) {
					arg4++;
				} else {
					@Pc(26) int local26 = arg2[local18 & 0xFF];
					@Pc(30) int local30 = arg0[arg4];
					arg0[arg4++] = ((local26 & 0xFF00FF) * arg9 + (local30 & 0xFF00FF) * local3 & 0xFF00FF00) + ((local26 & 0xFF00) * arg9 + (local30 & 0xFF00) * local3 & 0xFF0000) >> 8;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I")
	public static int method1323() {
		return Static7.anInt5330 == 0 ? 0 : Static6.anInterface2Array1[Static7.anInt5330].method3485();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!tf;B)V")
	public static void method1324(@OriginalArg(0) Class4_Sub6 arg0) {
		arg0.aBoolean289 = false;
		if (arg0.aClass4_Sub8_5 != null) {
			arg0.aClass4_Sub8_5.anInt4083 = 0;
		}
		for (@Pc(25) Class4_Sub6 local25 = arg0.method3350(); local25 != null; local25 = arg0.method3349()) {
			method1324(local25);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIZIIIIBII)V")
	public static void method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (Static4.aClass53_Sub1_Sub1_2.method3311() == 2) {
			Static30.method418(arg8, arg3, arg5, arg6, arg0, arg4, arg1, arg2, arg7);
		} else if (Static4.aClass53_Sub1_Sub1_2.method3311() > 2) {
			Static21.method1998(arg6, arg8, arg0, arg3, arg5, arg7, arg4, arg2, Static4.aClass53_Sub1_Sub1_2.method3311(), arg1);
		} else {
			Static22.method2197(arg5, arg8, arg7, arg1, arg4, arg6, arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
	public static void method1338() {
		@Pc(8) int[] local8 = new int[Static5.anInt6072];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static5.anInt6072; local12++) {
			@Pc(23) Class162 local23 = Static35.method4361(local12);
			if (local23.anInt5081 >= 0 || local23.anInt5090 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static6.anIntArray545 = new int[local10];
		for (@Pc(52) int local52 = 0; local52 < local10; local52++) {
			Static6.anIntArray545[local52] = local8[local52];
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIII)I")
	public static int method1339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 4;
		} else if (arg2 > 217) {
			arg1 >>= 3;
		} else if (arg2 > 192) {
			arg1 >>= 2;
		} else if (arg2 > 179) {
			arg1 >>= 1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + (arg0 >> 2 << 10);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Lclient!fd;")
	public static Buffer method1347() {
		@Pc(13) Buffer local13 = new Buffer(34);
		local13.writeByte(11);
		local13.writeByte(Static1.anInt185);
		local13.writeByte(Static3.aBoolean144 ? 1 : 0);
		local13.writeByte(Static4.aBoolean398 ? 1 : 0);
		local13.writeByte(Static3.aBoolean159 ? 1 : 0);
		local13.writeByte(Static6.aBoolean227 ? 1 : 0);
		local13.writeByte(Static2.aBoolean117 ? 1 : 0);
		local13.writeByte(Static7.aBoolean421 ? 1 : 0);
		local13.writeByte(Static1.aBoolean27 ? 1 : 0);
		local13.writeByte(Static2.aBoolean75 ? 1 : 0);
		local13.writeByte(Static3.anInt2298);
		local13.writeByte(Static2.aBoolean66 ? 1 : 0);
		local13.writeByte(Static7.aBoolean393 ? 1 : 0);
		local13.writeByte(Static7.aBoolean362 ? 1 : 0);
		local13.writeByte(Static1.anInt1051);
		local13.writeByte(Static7.aBoolean122 ? 1 : 0);
		local13.writeByte(Static4.anInt3315);
		local13.writeByte(Static1.anInt344);
		local13.writeByte(Static5.anInt4120);
		local13.writeShort(Static4.anInt3403);
		local13.writeShort(Static3.anInt2627);
		local13.writeByte(Static26.method2954());
		local13.writeInt(Static5.anInt3909);
		local13.writeByte(Static5.anInt3637);
		local13.writeByte(Static5.aBoolean278 ? 1 : 0);
		local13.writeByte(Static5.aBoolean293 ? 1 : 0);
		local13.writeByte(Static5.anInt4291);
		local13.writeByte(Static7.aBoolean390 ? 1 : 0);
		local13.writeByte(Static2.aBoolean69 ? 1 : 0);
		return local13;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(II)Z")
	public static boolean method1364(@OriginalArg(1) int arg0) {
		if (Static3.aBooleanArray12[arg0]) {
			return true;
		} else if (Static3.aClass58_56.method1355(arg0)) {
			@Pc(29) int local29 = Static3.aClass58_56.method1371(arg0);
			if (local29 == 0) {
				Static3.aBooleanArray12[arg0] = true;
				return true;
			}
			if (Static5.aClass185ArrayArray115[arg0] == null) {
				Static5.aClass185ArrayArray115[arg0] = new Class185[local29];
			}
			for (@Pc(53) int local53 = 0; local53 < local29; local53++) {
				if (Static5.aClass185ArrayArray115[arg0][local53] == null) {
					@Pc(74) byte[] local74 = Static3.aClass58_56.method1372(arg0, local53);
					if (local74 != null) {
						@Pc(88) Class185 local88 = Static5.aClass185ArrayArray115[arg0][local53] = new Class185();
						local88.anInt5914 = (arg0 << 16) + local53;
						if (local74[0] == -1) {
							local88.method4732(new Buffer(local74));
						} else {
							local88.method4728(new Buffer(local74));
						}
					}
				}
			}
			Static3.aBooleanArray12[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([SB)[S")
	public static short[] method1396(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(12) short[] local12 = new short[arg0.length];
			ArrayUtils.copy(arg0, 0, local12, 0, arg0.length);
			return local12;
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)I")
	public static int method1397(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(BI)Lclient!qg;")
	public static Class143 method1400(@OriginalArg(1) int arg0) {
		@Pc(10) Class143 local10 = (Class143) Static7.aClass26_55.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static1.aClass58_22.method1372(34, arg0);
		@Pc(32) Class143 local32 = new Class143();
		if (local28 != null) {
			local32.method3556(arg0, new Buffer(local28));
		}
		Static7.aClass26_55.put((long) arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!wf;IIB)V")
	public static void method1401(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static1.aClass185_1 != null || Static1.aBoolean17 || (arg0 == null || method1403(arg0) == null)) {
			return;
		}
		Static1.aClass185_1 = arg0;
		Static1.aClass185_2 = method1403(arg0);
		Static3.aBoolean173 = false;
		Static3.anInt2165 = 0;
		Static5.anInt5204 = arg1;
		Static1.anInt777 = arg2;
	}

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
	public static void method1402() {
		if (SignLink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			Static5.anIntArray445[188] = 71;
			Static5.anIntArray445[223] = 28;
			Static5.anIntArray445[219] = 42;
			Static5.anIntArray445[192] = 58;
			Static5.anIntArray445[221] = 43;
			Static5.anIntArray445[190] = 72;
			Static5.anIntArray445[189] = 26;
			Static5.anIntArray445[222] = 59;
			Static5.anIntArray445[186] = 57;
			Static5.anIntArray445[220] = 74;
			Static5.anIntArray445[187] = 27;
			Static5.anIntArray445[191] = 73;
			return;
		}
		Static5.anIntArray445[61] = 27;
		Static5.anIntArray445[46] = 72;
		if (SignLink.setFocusTraversalKeysEnabled == null) {
			Static5.anIntArray445[192] = 58;
			Static5.anIntArray445[222] = 59;
		} else {
			Static5.anIntArray445[520] = 59;
			Static5.anIntArray445[192] = 28;
			Static5.anIntArray445[222] = 58;
		}
		Static5.anIntArray445[92] = 74;
		Static5.anIntArray445[91] = 42;
		Static5.anIntArray445[93] = 43;
		Static5.anIntArray445[45] = 26;
		Static5.anIntArray445[44] = 71;
		Static5.anIntArray445[47] = 73;
		Static5.anIntArray445[59] = 57;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!wf;I)Lclient!wf;")
	private static Class185 method1403(@OriginalArg(0) Class185 arg0) {
		@Pc(2) Class185 local2 = Static12.method691(arg0);
		if (local2 == null) {
			local2 = arg0.aClass185_17;
		}
		return local2;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!wf;III)V")
	public static void method1427(@OriginalArg(0) Class185 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt5912 == 1) {
			Static16.method1497(0L, 0, arg0.anInt5914, "", arg0.aString349, (short) 57, -1);
		}
		if (arg0.anInt5912 == 2 && !Static3.aBoolean177) {
			@Pc(35) String local35 = Static12.method780(arg0);
			if (local35 != null) {
				Static16.method1497(0L, -1, arg0.anInt5914, "<col=00ff00>" + arg0.aString353, local35, (short) 34, -1);
			}
		}
		if (arg0.anInt5912 == 3) {
			Static16.method1497(0L, 0, arg0.anInt5914, "", LocalisedText.CLOSE, (short) 7, -1);
		}
		if (arg0.anInt5912 == 4) {
			Static16.method1497(0L, 0, arg0.anInt5914, "", arg0.aString349, (short) 18, -1);
		}
		if (arg0.anInt5912 == 5) {
			Static16.method1497(0L, 0, arg0.anInt5914, "", arg0.aString349, (short) 11, -1);
		}
		if (arg0.anInt5912 == 6 && Static6.aClass185_14 == null) {
			Static16.method1497(0L, -1, arg0.anInt5914, "", arg0.aString349, (short) 3, -1);
		}
		if (arg0.anInt5911 == 2) {
			@Pc(160) int local160 = 0;
			for (@Pc(162) int local162 = 0; local162 < arg0.anInt5950; local162++) {
				for (@Pc(172) int local172 = 0; local172 < arg0.anInt5927; local172++) {
					@Pc(187) int local187 = local172 * (arg0.anInt5943 + 32);
					@Pc(195) int local195 = local162 * (arg0.anInt5964 + 32);
					if (local160 < 20) {
						local195 += arg0.anIntArray663[local160];
						local187 += arg0.anIntArray664[local160];
					}
					if (arg2 >= local187 && arg1 >= local195 && local187 + 32 > arg2 && arg1 < local195 + 32) {
						Static4.anInt2989 = local160;
						Static6.aClass185_13 = arg0;
						if (arg0.anIntArray660[local160] > 0) {
							@Pc(257) Class4_Sub21 local257 = Static12.method687(arg0);
							@Pc(266) Class162 local266 = Static35.method4361(arg0.anIntArray660[local160] - 1);
							if (Static2.anInt1334 == 1 && local257.method3282()) {
								if (Static5.anInt4302 != arg0.anInt5914 || Static1.anInt314 != local160) {
									Static16.method1497((long) local266.anInt5066, local160, arg0.anInt5914, Static7.aString365 + " -> <col=ff9040>" + local266.aString308, LocalisedText.USE, (short) 15, -1);
								}
							} else if (Static3.aBoolean177 && local257.method3282()) {
								@Pc(290) Class4_Sub3_Sub12 local290 = Static5.anInt4224 == -1 ? null : Static19.method1815(Static5.anInt4224);
								if ((Static5.anInt3560 & 0x10) != 0 && (local290 == null || local266.method4133(Static5.anInt4224, local290.anInt2546) != local290.anInt2546)) {
									Static16.method1497((long) local266.anInt5066, local160, arg0.anInt5914, Static2.aString81 + " -> <col=ff9040>" + local266.aString308, Static4.aString140, (short) 50, Static6.anInt4466);
								}
							} else {
								@Pc(340) String[] local340 = local266.aStringArray32;
								if (Static5.aBoolean254) {
									local340 = Static35.method4300(local340);
								}
								if (local257.method3282()) {
									for (@Pc(353) int local353 = 4; local353 >= 3; local353--) {
										if (local340 != null && local340[local353] != null) {
											@Pc(373) byte local373;
											if (local353 == 3) {
												local373 = 10;
											} else {
												local373 = 51;
											}
											Static16.method1497((long) local266.anInt5066, local160, arg0.anInt5914, "<col=ff9040>" + local266.aString308, local340[local353], local373, -1);
										}
									}
								}
								if (local257.method3275()) {
									Static16.method1497((long) local266.anInt5066, local160, arg0.anInt5914, "<col=ff9040>" + local266.aString308, LocalisedText.USE, (short) 9, Static2.anInt1937);
								}
								if (local257.method3282() && local340 != null) {
									for (@Pc(444) int local444 = 2; local444 >= 0; local444--) {
										if (local340[local444] != null) {
											@Pc(455) byte local455 = 0;
											if (local444 == 0) {
												local455 = 58;
											}
											if (local444 == 1) {
												local455 = 35;
											}
											if (local444 == 2) {
												local455 = 17;
											}
											Static16.method1497((long) local266.anInt5066, local160, arg0.anInt5914, "<col=ff9040>" + local266.aString308, local340[local444], local455, -1);
										}
									}
								}
								@Pc(505) String[] local505 = arg0.aStringArray44;
								if (Static5.aBoolean254) {
									local505 = Static35.method4300(local505);
								}
								if (local505 != null) {
									for (@Pc(517) int local517 = 4; local517 >= 0; local517--) {
										if (local505[local517] != null) {
											@Pc(533) byte local533 = 0;
											if (local517 == 0) {
												local533 = 30;
											}
											if (local517 == 1) {
												local533 = 20;
											}
											if (local517 == 2) {
												local533 = 13;
											}
											if (local517 == 3) {
												local533 = 2;
											}
											if (local517 == 4) {
												local533 = 49;
											}
											Static16.method1497((long) local266.anInt5066, local160, arg0.anInt5914, "<col=ff9040>" + local266.aString308, local505[local517], local533, -1);
										}
									}
								}
								Static16.method1497((long) local266.anInt5066, local160, arg0.anInt5914, "<col=ff9040>" + local266.aString308, LocalisedText.EXAMINE, (short) 1001, Static3.anInt2232);
							}
						}
					}
					local160++;
				}
			}
		}
		if (!arg0.aBoolean416) {
			return;
		}
		if (!Static3.aBoolean177) {
			for (@Pc(704) int local704 = 9; local704 >= 5; local704--) {
				@Pc(712) String local712 = Static24.method2597(local704, arg0);
				if (local712 != null) {
					Static16.method1497((long) (local704 + 1), arg0.anInt5968, arg0.anInt5914, arg0.aString352, local712, (short) 1009, Static32.method3985(arg0, local704));
				}
			}
			@Pc(745) String local745 = Static12.method780(arg0);
			if (local745 != null) {
				Static16.method1497(0L, arg0.anInt5968, arg0.anInt5914, arg0.aString352, local745, (short) 34, -1);
			}
			for (@Pc(767) int local767 = 4; local767 >= 0; local767--) {
				@Pc(774) String local774 = Static24.method2597(local767, arg0);
				if (local774 != null) {
					Static16.method1497((long) (local767 + 1), arg0.anInt5968, arg0.anInt5914, arg0.aString352, local774, (short) 23, Static32.method3985(arg0, local767));
				}
			}
			if (Static12.method687(arg0).method3274()) {
				if (arg0.aString354 == null) {
					Static16.method1497(0L, arg0.anInt5968, arg0.anInt5914, "", LocalisedText.CONTINUE, (short) 3, -1);
				} else {
					Static16.method1497(0L, arg0.anInt5968, arg0.anInt5914, "", arg0.aString354, (short) 3, -1);
				}
			}
		} else if (Static12.method687(arg0).method3280() && (Static5.anInt3560 & 0x20) != 0) {
			Static16.method1497(0L, arg0.anInt5968, arg0.anInt5914, Static2.aString81 + " -> " + arg0.aString352, Static4.aString140, (short) 1, Static6.anInt4466);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!qc;)V")
	public static void method1428(@OriginalArg(1) int arg0, @OriginalArg(2) Class53_Sub1 arg1) {
		if (Static2.anInt954 < arg1.anInt4034) {
			Static34.method4234(arg1);
		} else if (arg1.anInt3966 < Static2.anInt954) {
			Static32.method4024(arg1);
		} else {
			Static24.method2705(arg1);
		}
		if (arg1.anInt3974 < 128 || arg1.anInt4002 < 128 || arg1.anInt3974 >= 13184 || arg1.anInt4002 >= 13184) {
			arg1.anInt3966 = 0;
			arg1.anInt4034 = 0;
			arg1.anInt3961 = -1;
			arg1.anInt4007 = -1;
			arg1.anInt3974 = arg1.anIntArray422[0] * 128 + arg1.method3311() * 64;
			arg1.anInt4002 = arg1.anIntArray426[0] * 128 + arg1.method3311() * 64;
			arg1.method3307();
		}
		if (Static4.aClass53_Sub1_Sub1_2 == arg1 && (arg1.anInt3974 < 1536 || arg1.anInt4002 < 1536 || arg1.anInt3974 >= 11776 || arg1.anInt4002 >= 11776)) {
			arg1.anInt3961 = -1;
			arg1.anInt3966 = 0;
			arg1.anInt4034 = 0;
			arg1.anInt4007 = -1;
			arg1.anInt3974 = arg1.anIntArray422[0] * 128 + arg1.method3311() * 64;
			arg1.anInt4002 = arg1.anIntArray426[0] * 128 + arg1.method3311() * 64;
			arg1.method3307();
		}
		Static34.method4247(arg1);
		Static13.method939(arg1);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[Lclient!ch;[BIIIIZII)V")
	public static void method1471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Buffer local10 = new Buffer(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(21) int local21 = local10.readUnsignedMultiSmart();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(34) int local34 = 0;
			while (true) {
				@Pc(38) int local38 = local10.readUnsignedSmart();
				if (local38 == 0) {
					break;
				}
				local34 += local38 - 1;
				@Pc(57) int local57 = local34 >> 6 & 0x3F;
				@Pc(61) int local61 = local34 & 0x3F;
				@Pc(65) int local65 = local34 >> 12;
				@Pc(69) int local69 = local10.readUnsignedByte();
				@Pc(73) int local73 = local69 >> 2;
				@Pc(77) int local77 = local69 & 0x3;
				if (local65 == arg7 && arg6 <= local57 && arg6 + 8 > local57 && arg5 <= local61 && arg5 + 8 > local61) {
					@Pc(108) Class181 local108 = Static8.method99(local12);
					@Pc(125) int local125 = Static29.method3147(local108.anInt5527, local61 & 0x7, local77, local57 & 0x7, arg4, local108.anInt5516) + arg1;
					@Pc(145) int local145 = arg9 + Static26.method4356(local57 & 0x7, local108.anInt5516, local108.anInt5527, arg4, local61 & 0x7, local77);
					if (local125 > 0 && local145 > 0 && local125 < 103 && local145 < 103) {
						@Pc(162) Class30 local162 = null;
						if (!arg8) {
							@Pc(166) int local166 = arg0;
							if ((Static4.aByteArrayArrayArray17[1][local125][local145] & 0x2) == 2) {
								local166 = arg0 - 1;
							}
							if (local166 >= 0) {
								local162 = arg2[local166];
							}
						}
						Static22.method2193(local77 + arg4 & 0x3, arg0, local12, arg0, local125, arg8, local145, local162, !arg8, local73);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!fh;ILclient!fh;)V")
	public static void method1473(@OriginalArg(0) Class58 arg0, @OriginalArg(2) Class58 arg1) {
		Static2.aClass58_26 = arg1;
		Static6.aClass58_91 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)I")
	public static int method1474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = Static4.anIntArray295[Static25.method2912(arg2, arg0)];
		if (arg1 > 0) {
			@Pc(26) int local26 = Static4.anInterface4_1.method450(arg1 & 0xFFFF);
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
			@Pc(104) int local104 = Static4.anInterface4_1.method447(arg1 & 0xFFFF);
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
			Static18.method1656(Static5.anIntArrayArray36[local6], arg3, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZC)Z")
	public static boolean method1478(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
	public static void method1479() {
		@Pc(3) int local3 = Static5.anInt3890;
		@Pc(9) int local9 = Static4.anInt3455;
		@Pc(11) int local11 = Static6.anInt4440;
		@Pc(19) int local19 = Static3.anInt2394;
		if (Static3.aBoolean138) {
			Static18.method1701(local3, local9, local11, local19, 6116423);
			Static18.method1701(local3 + 1, local9 + 1, local11 - 2, 16, 0);
			Static18.method1690(local3 + 1, local9 + 18, local11 - 2, local19 - 19, 0);
		} else {
			Static33.method4205(local3, local9, local11, local19, 6116423);
			Static33.method4205(local3 + 1, local9 + 1, local11 - 2, 16, 0);
			Static34.method4222(local3 + 1, local9 + 18, local11 - 2, local19 - 19, 0);
		}
		Static5.aClass4_Sub3_Sub5_3.method2259(LocalisedText.CHOOSE_OPTION, local3 + 3, local9 + 14, 6116423, -1);
		@Pc(100) int local100 = Static7.anInt5357;
		@Pc(102) int local102 = Static7.anInt6038;
		for (@Pc(104) int local104 = 0; local104 < Static7.anInt5634; local104++) {
			@Pc(125) int local125 = local9 + (Static7.anInt5634 - local104 - 1) * 15 + 31;
			@Pc(127) int local127 = 16777215;
			if (local100 > local3 && local3 + local11 > local100 && local102 > local125 - 13 && local102 < local125 + 3) {
				local127 = 16776960;
			}
			Static5.aClass4_Sub3_Sub5_3.method2259(Static26.method2992(local104), local3 + 3, local125, local127, 0);
		}
		Static16.method1559(Static5.anInt3890, Static4.anInt3455, Static3.anInt2394, Static6.anInt4440);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	public static void method1480() {
		Static3.anInt5405 = 0;
		@Pc(13) int local13 = (Static4.aClass53_Sub1_Sub1_2.anInt3974 >> 7) + Static5.anInt3983;
		@Pc(20) int local20 = Static7.anInt5479 + (Static4.aClass53_Sub1_Sub1_2.anInt4002 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static3.anInt5405 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static3.anInt5405 = 1;
		}
		if (Static3.anInt5405 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static3.anInt5405 = 0;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)Lclient!ua;")
	public static Class168 method1495(@OriginalArg(1) int arg0) {
		@Pc(10) Class168 local10 = (Class168) Static3.aClass26_22.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static7.aClass58_104.method1372(Static25.method2808(arg0), Static24.method2690(arg0));
		@Pc(30) Class168 local30 = new Class168();
		local30.anInt5255 = arg0;
		if (local26 != null) {
			local30.method4263(new Buffer(local26));
		}
		local30.method4261();
		Static3.aClass26_22.put((long) arg0, local30);
		return local30;
	}
}

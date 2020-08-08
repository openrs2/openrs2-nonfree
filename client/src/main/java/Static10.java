import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

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

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BC)B")
	public static byte method284(@OriginalArg(1) char arg0) {
		@Pc(36) byte local36;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local36 = (byte) arg0;
		} else if (arg0 == '€') {
			local36 = -128;
		} else if (arg0 == '‚') {
			local36 = -126;
		} else if (arg0 == 'ƒ') {
			local36 = -125;
		} else if (arg0 == '„') {
			local36 = -124;
		} else if (arg0 == '…') {
			local36 = -123;
		} else if (arg0 == '†') {
			local36 = -122;
		} else if (arg0 == '‡') {
			local36 = -121;
		} else if (arg0 == 'ˆ') {
			local36 = -120;
		} else if (arg0 == '‰') {
			local36 = -119;
		} else if (arg0 == 'Š') {
			local36 = -118;
		} else if (arg0 == '‹') {
			local36 = -117;
		} else if (arg0 == 'Œ') {
			local36 = -116;
		} else if (arg0 == 'Ž') {
			local36 = -114;
		} else if (arg0 == '‘') {
			local36 = -111;
		} else if (arg0 == '’') {
			local36 = -110;
		} else if (arg0 == '“') {
			local36 = -109;
		} else if (arg0 == '”') {
			local36 = -108;
		} else if (arg0 == '•') {
			local36 = -107;
		} else if (arg0 == '–') {
			local36 = -106;
		} else if (arg0 == '—') {
			local36 = -105;
		} else if (arg0 == '˜') {
			local36 = -104;
		} else if (arg0 == '™') {
			local36 = -103;
		} else if (arg0 == 'š') {
			local36 = -102;
		} else if (arg0 == '›') {
			local36 = -101;
		} else if (arg0 == 'œ') {
			local36 = -100;
		} else if (arg0 == 'ž') {
			local36 = -98;
		} else if (arg0 == 'Ÿ') {
			local36 = -97;
		} else {
			local36 = 63;
		}
		return local36;
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

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lclient!jo;")
	public static Class4_Sub1 method897(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class4_Sub1_Sub24();
		} else if (arg0 == 1) {
			return new Class4_Sub1_Sub11();
		} else if (arg0 == 2) {
			return new Class4_Sub1_Sub23();
		} else if (arg0 == 3) {
			return new Class4_Sub1_Sub7();
		} else if (arg0 == 4) {
			return new Class4_Sub1_Sub33();
		} else if (arg0 == 5) {
			return new Class4_Sub1_Sub38();
		} else if (arg0 == 6) {
			return new Class4_Sub1_Sub4();
		} else if (arg0 == 7) {
			return new Class4_Sub1_Sub32();
		} else if (arg0 == 8) {
			return new Class4_Sub1_Sub20();
		} else if (arg0 == 9) {
			return new Class4_Sub1_Sub9();
		} else if (arg0 == 10) {
			return new Class4_Sub1_Sub39();
		} else if (arg0 == 11) {
			return new Class4_Sub1_Sub3();
		} else if (arg0 == 12) {
			return new Class4_Sub1_Sub37();
		} else if (arg0 == 13) {
			return new Class4_Sub1_Sub30();
		} else if (arg0 == 14) {
			return new Class4_Sub1_Sub16();
		} else if (arg0 == 15) {
			return new Class4_Sub1_Sub27();
		} else if (arg0 == 16) {
			return new Class4_Sub1_Sub25();
		} else if (arg0 == 17) {
			return new Class4_Sub1_Sub17();
		} else if (arg0 == 18) {
			return new Class4_Sub1_Sub21_Sub1();
		} else if (arg0 == 19) {
			return new Class4_Sub1_Sub22();
		} else if (arg0 == 20) {
			return new Class4_Sub1_Sub15();
		} else if (arg0 == 21) {
			return new Class4_Sub1_Sub10();
		} else if (arg0 == 22) {
			return new Class4_Sub1_Sub34();
		} else if (arg0 == 23) {
			return new Class4_Sub1_Sub36();
		} else if (arg0 == 24) {
			return new Class4_Sub1_Sub35();
		} else if (arg0 == 25) {
			return new Class4_Sub1_Sub2();
		} else if (arg0 == 26) {
			return new Class4_Sub1_Sub18();
		} else if (arg0 == 27) {
			return new Class4_Sub1_Sub28();
		} else if (arg0 == 28) {
			return new Class4_Sub1_Sub1();
		} else if (arg0 == 29) {
			return new Class4_Sub1_Sub14();
		} else if (arg0 == 30) {
			return new Class4_Sub1_Sub29();
		} else if (arg0 == 31) {
			return new Class4_Sub1_Sub6();
		} else if (arg0 == 32) {
			return new Class4_Sub1_Sub5();
		} else if (arg0 == 33) {
			return new Class4_Sub1_Sub19();
		} else if (arg0 == 34) {
			return new Class4_Sub1_Sub12();
		} else if (arg0 == 35) {
			return new Class4_Sub1_Sub31();
		} else if (arg0 == 36) {
			return new Class4_Sub1_Sub8();
		} else if (arg0 == 37) {
			return new Class4_Sub1_Sub26();
		} else if (arg0 == 38) {
			return new Class4_Sub1_Sub13();
		} else if (arg0 == 39) {
			return new Class4_Sub1_Sub21();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public static void method898() {
		Static2.aClass26_12.method511();
		Static3.aClass26_27.method511();
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
		Static7.aBoolean390 = arg0;
		Static14.method1055(Static7.aClass196_4);
		if (local13 == arg0) {
			return false;
		} else {
			((Class24_Sub1) Static4.anInterface4_1).method460();
			return true;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method301() {
		Static4.aClass26_30.method511();
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

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I")
	public static int method303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		local9 ^= local9 << 13;
		@Pc(34) int local34 = (local9 * local9 * 15731 + 789221) * local9 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)Lclient!gl;")
	public static Class4_Sub3_Sub5 method304(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(27) Class4_Sub3_Sub5 local27;
		if (Static3.aBoolean138) {
			local27 = new Class4_Sub3_Sub5_Sub1(arg0, Static5.anIntArray402, Static5.anIntArray391, Static3.anIntArray185, Static7.anIntArray643, Static6.aByteArrayArray36);
		} else {
			local27 = new Class4_Sub3_Sub5_Sub2(arg0, Static5.anIntArray402, Static5.anIntArray391, Static3.anIntArray185, Static7.anIntArray643, Static6.aByteArrayArray36);
		}
		Static37.method4670();
		return local27;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Lclient!wg;")
	public static Class4_Sub3_Sub22 method305() {
		return Static3.aClass4_Sub3_Sub22_3;
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
				Static3.aClass4_Sub10_Sub1_1.method4650(172);
				Static3.aClass4_Sub10_Sub1_1.method4582(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "()V")
	public static void method314() {
		@Pc(1) GL local1 = Static3.aGL1;
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
		@Pc(1) GL local1 = Static3.aGL1;
		local1.glClientActiveTexture(method315());
		local1.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		local1.glClientActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBI)Lclient!rl;")
	public static Class4_Sub27 method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class4_Sub27 local9 = new Class4_Sub27();
		local9.anInt4619 = arg1;
		local9.anInt4620 = arg0;
		Static4.aClass84_13.method1840(local9, (long) arg2);
		Static9.method230(arg0);
		@Pc(28) Class185 local28 = Static19.method1813(arg2);
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
			@Pc(93) int local93 = Static5.aClass4_Sub3_Sub5_3.method2252(Static4.aString202);
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

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIILclient!vc;Lclient!vc;IIJ)V")
	public static void method320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) Class53 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class179 local8 = new Class179();
		local8.aLong188 = arg8;
		local8.anInt5492 = arg1 * 128 + 64;
		local8.anInt5491 = arg2 * 128 + 64;
		local8.anInt5494 = arg3;
		local8.aClass53_5 = arg4;
		local8.aClass53_4 = arg5;
		local8.anInt5493 = arg6;
		local8.anInt5488 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static1.aClass4_Sub19ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static1.aClass4_Sub19ArrayArrayArray1[local42][arg1][arg2] = new Class4_Sub19(local42, arg1, arg2);
			}
		}
		Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass179_1 = local8;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V")
	public static void method344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class182 local13 = local7.aClass182_1;
		if (local13 != null) {
			local13.anInt5633 = local13.anInt5633 * arg3 / 16;
			local13.anInt5625 = local13.anInt5625 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)Lclient!bh;")
	public static Class19 method345() {
		try {
			return (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method346(@OriginalArg(1) Class58 arg0) {
		Static4.aClass58_54 = arg0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!kf;)V")
	private static void method348(@OriginalArg(0) Class104 arg0) {
		arg0.anInt2843 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray15[local4]) {
				arg0.aByteArray27[arg0.anInt2843] = (byte) local4;
				arg0.anInt2843++;
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Lclient!kf;)B")
	private static byte method349(@OriginalArg(0) Class104 arg0) {
		return (byte) method350(8, arg0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!kf;)I")
	private static int method350(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1) {
		while (arg1.anInt2852 < arg0) {
			arg1.anInt2834 = arg1.anInt2834 << 8 | arg1.aByteArray23[arg1.anInt2847] & 0xFF;
			arg1.anInt2852 += 8;
			arg1.anInt2847++;
			arg1.anInt2845++;
			if (arg1.anInt2845 == 0) {
			}
		}
		@Pc(17) int local17 = arg1.anInt2834 >> arg1.anInt2852 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt2852 -= arg0;
		return local17;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([BI[BII)I")
	public static int method351(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		synchronized (Static1.aClass104_1) {
			Static1.aClass104_1.aByteArray23 = arg2;
			Static1.aClass104_1.anInt2847 = 9;
			Static1.aClass104_1.aByteArray26 = arg0;
			Static1.aClass104_1.anInt2851 = 0;
			Static1.aClass104_1.anInt2846 = arg1;
			Static1.aClass104_1.anInt2852 = 0;
			Static1.aClass104_1.anInt2834 = 0;
			Static1.aClass104_1.anInt2845 = 0;
			Static1.aClass104_1.anInt2833 = 0;
			method354(Static1.aClass104_1);
			arg1 -= Static1.aClass104_1.anInt2846;
			Static1.aClass104_1.aByteArray23 = null;
			Static1.aClass104_1.aByteArray26 = null;
			return arg1;
		}
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(Lclient!kf;)B")
	private static byte method352(@OriginalArg(0) Class104 arg0) {
		return (byte) method350(1, arg0);
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(Lclient!kf;)V")
	private static void method354(@OriginalArg(0) Class104 arg0) {
		arg0.anInt2840 = 1;
		if (Static4.anIntArray265 == null) {
			Static4.anIntArray265 = new int[arg0.anInt2840 * 100000];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method349(arg0);
				if (local61 == 23) {
					return;
				}
				@Pc(68) byte local68 = method349(arg0);
				local68 = method349(arg0);
				local68 = method349(arg0);
				local68 = method349(arg0);
				local68 = method349(arg0);
				local68 = method349(arg0);
				local68 = method349(arg0);
				local68 = method349(arg0);
				local68 = method349(arg0);
				local68 = method352(arg0);
				if (local68 != 0) {
				}
				arg0.anInt2836 = 0;
				@Pc(103) byte local103 = method349(arg0);
				arg0.anInt2836 = arg0.anInt2836 << 8 | local103 & 0xFF;
				local103 = method349(arg0);
				arg0.anInt2836 = arg0.anInt2836 << 8 | local103 & 0xFF;
				local103 = method349(arg0);
				arg0.anInt2836 = arg0.anInt2836 << 8 | local103 & 0xFF;
				for (@Pc(141) int local141 = 0; local141 < 16; local141++) {
					@Pc(147) byte local147 = method352(arg0);
					if (local147 == 1) {
						arg0.aBooleanArray14[local141] = true;
					} else {
						arg0.aBooleanArray14[local141] = false;
					}
				}
				for (@Pc(165) int local165 = 0; local165 < 256; local165++) {
					arg0.aBooleanArray15[local165] = false;
				}
				for (@Pc(177) int local177 = 0; local177 < 16; local177++) {
					if (arg0.aBooleanArray14[local177]) {
						for (@Pc(187) int local187 = 0; local187 < 16; local187++) {
							@Pc(193) byte local193 = method352(arg0);
							if (local193 == 1) {
								arg0.aBooleanArray15[local177 * 16 + local187] = true;
							}
						}
					}
				}
				method348(arg0);
				@Pc(216) int local216 = arg0.anInt2843 + 2;
				@Pc(220) int local220 = method350(3, arg0);
				@Pc(224) int local224 = method350(15, arg0);
				for (@Pc(226) int local226 = 0; local226 < local224; local226++) {
					@Pc(231) int local231 = 0;
					while (true) {
						@Pc(234) byte local234 = method352(arg0);
						if (local234 == 0) {
							arg0.aByteArray24[local226] = (byte) local231;
							break;
						}
						local231++;
					}
				}
				@Pc(250) byte[] local250 = new byte[6];
				@Pc(252) byte local252 = 0;
				while (local252 < local220) {
					local250[local252] = local252++;
				}
				for (@Pc(267) int local267 = 0; local267 < local224; local267++) {
					@Pc(275) byte local275 = arg0.aByteArray24[local267];
					@Pc(279) byte local279 = local250[local275];
					while (local275 > 0) {
						local250[local275] = local250[local275 - 1];
						local275--;
					}
					local250[0] = local279;
					arg0.aByteArray28[local267] = local279;
				}
				for (@Pc(308) int local308 = 0; local308 < local220; local308++) {
					@Pc(315) int local315 = method350(5, arg0);
					for (@Pc(317) int local317 = 0; local317 < local216; local317++) {
						while (true) {
							@Pc(323) byte local323 = method352(arg0);
							if (local323 == 0) {
								arg0.aByteArrayArray19[local308][local317] = (byte) local315;
								break;
							}
							@Pc(329) byte local329 = method352(arg0);
							if (local329 == 0) {
								local315++;
							} else {
								local315--;
							}
						}
					}
				}
				for (@Pc(349) int local349 = 0; local349 < local220; local349++) {
					@Pc(354) byte local354 = 32;
					@Pc(356) byte local356 = 0;
					for (@Pc(358) int local358 = 0; local358 < local216; local358++) {
						if (arg0.aByteArrayArray19[local349][local358] > local356) {
							local356 = arg0.aByteArrayArray19[local349][local358];
						}
						if (arg0.aByteArrayArray19[local349][local358] < local354) {
							local354 = arg0.aByteArrayArray19[local349][local358];
						}
					}
					method356(arg0.anIntArrayArray22[local349], arg0.anIntArrayArray21[local349], arg0.anIntArrayArray23[local349], arg0.aByteArrayArray19[local349], local354, local356, local216);
					arg0.anIntArray254[local349] = local354;
				}
				@Pc(425) int local425 = arg0.anInt2843 + 1;
				@Pc(427) byte local427 = -1;
				for (@Pc(431) int local431 = 0; local431 <= 255; local431++) {
					arg0.anIntArray255[local431] = 0;
				}
				@Pc(443) int local443 = 4095;
				for (@Pc(445) int local445 = 15; local445 >= 0; local445--) {
					for (@Pc(449) int local449 = 15; local449 >= 0; local449--) {
						arg0.aByteArray25[local443] = (byte) (local445 * 16 + local449);
						local443--;
					}
					arg0.anIntArray252[local445] = local443 + 1;
				}
				@Pc(475) int local475 = 0;
				@Pc(478) int local478 = local427 + 1;
				@Pc(480) byte local480 = 50;
				@Pc(485) byte local485 = arg0.aByteArray28[0];
				@Pc(490) int local490 = arg0.anIntArray254[local485];
				@Pc(495) int[] local495 = arg0.anIntArrayArray22[local485];
				@Pc(500) int[] local500 = arg0.anIntArrayArray23[local485];
				@Pc(505) int[] local505 = arg0.anIntArrayArray21[local485];
				@Pc(506) int local506 = local480 - 1;
				@Pc(508) int local508 = local490;
				@Pc(512) int local512;
				@Pc(522) byte local522;
				for (local512 = method350(local490, arg0); local512 > local495[local508]; local512 = local512 << 1 | local522) {
					local508++;
					local522 = method352(arg0);
				}
				@Pc(537) int local537 = local500[local512 - local505[local508]];
				while (true) {
					while (local537 != local425) {
						if (local537 == 0 || local537 == 1) {
							@Pc(548) int local548 = -1;
							@Pc(550) int local550 = 1;
							do {
								if (local537 == 0) {
									local548 += local550;
								} else if (local537 == 1) {
									local548 += local550 * 2;
								}
								local550 *= 2;
								if (local506 == 0) {
									local478++;
									local506 = 50;
									@Pc(582) byte local582 = arg0.aByteArray28[local478];
									local490 = arg0.anIntArray254[local582];
									local495 = arg0.anIntArrayArray22[local582];
									local500 = arg0.anIntArrayArray23[local582];
									local505 = arg0.anIntArrayArray21[local582];
								}
								local506--;
								@Pc(605) int local605 = local490;
								@Pc(609) int local609;
								@Pc(619) byte local619;
								for (local609 = method350(local490, arg0); local609 > local495[local605]; local609 = local609 << 1 | local619) {
									local605++;
									local619 = method352(arg0);
								}
								local537 = local500[local609 - local505[local605]];
							} while (local537 == 0 || local537 == 1);
							@Pc(640) int local640 = local548 + 1;
							@Pc(653) byte local653 = arg0.aByteArray27[arg0.aByteArray25[arg0.anIntArray252[0]] & 0xFF];
							@Pc(655) int[] local655 = arg0.anIntArray255;
							local655[local653 & 0xFF] += local640;
							while (local640 > 0) {
								Static4.anIntArray265[local475] = local653 & 0xFF;
								local475++;
								local640--;
							}
						} else {
							@Pc(678) int local678 = local537 - 1;
							@Pc(693) byte local693;
							if (local678 < 16) {
								@Pc(686) int local686 = arg0.anIntArray252[0];
								local693 = arg0.aByteArray25[local686 + local678];
								while (local678 > 3) {
									@Pc(700) int local700 = local686 + local678;
									arg0.aByteArray25[local700] = arg0.aByteArray25[local700 - 1];
									arg0.aByteArray25[local700 - 1] = arg0.aByteArray25[local700 - 2];
									arg0.aByteArray25[local700 - 2] = arg0.aByteArray25[local700 - 3];
									arg0.aByteArray25[local700 - 3] = arg0.aByteArray25[local700 - 4];
									local678 -= 4;
								}
								while (local678 > 0) {
									arg0.aByteArray25[local686 + local678] = arg0.aByteArray25[local686 + local678 - 1];
									local678--;
								}
								arg0.aByteArray25[local686] = local693;
							} else {
								@Pc(776) int local776 = local678 / 16;
								@Pc(780) int local780 = local678 % 16;
								@Pc(787) int local787 = arg0.anIntArray252[local776] + local780;
								local693 = arg0.aByteArray25[local787];
								while (local787 > arg0.anIntArray252[local776]) {
									arg0.aByteArray25[local787] = arg0.aByteArray25[local787 - 1];
									local787--;
								}
								@Pc(815) int local815 = arg0.anIntArray252[local776]++;
								while (local776 > 0) {
									@Pc(825) int local825 = arg0.anIntArray252[local776]--;
									arg0.aByteArray25[arg0.anIntArray252[local776]] = arg0.aByteArray25[arg0.anIntArray252[local776 - 1] + 16 - 1];
									local776--;
								}
								@Pc(855) int local855 = arg0.anIntArray252[0]--;
								arg0.aByteArray25[arg0.anIntArray252[0]] = local693;
								if (arg0.anIntArray252[0] == 0) {
									@Pc(873) int local873 = 4095;
									for (@Pc(875) int local875 = 15; local875 >= 0; local875--) {
										for (@Pc(879) int local879 = 15; local879 >= 0; local879--) {
											arg0.aByteArray25[local873] = arg0.aByteArray25[arg0.anIntArray252[local875] + local879];
											local873--;
										}
										arg0.anIntArray252[local875] = local873 + 1;
									}
								}
							}
							@Pc(918) int local918 = arg0.anIntArray255[arg0.aByteArray27[local693 & 0xFF] & 0xFF]++;
							Static4.anIntArray265[local475] = arg0.aByteArray27[local693 & 0xFF] & 0xFF;
							local475++;
							if (local506 == 0) {
								local478++;
								local506 = 50;
								@Pc(943) byte local943 = arg0.aByteArray28[local478];
								local490 = arg0.anIntArray254[local943];
								local495 = arg0.anIntArrayArray22[local943];
								local500 = arg0.anIntArrayArray23[local943];
								local505 = arg0.anIntArrayArray21[local943];
							}
							local506--;
							@Pc(966) int local966 = local490;
							@Pc(970) int local970;
							@Pc(980) byte local980;
							for (local970 = method350(local490, arg0); local970 > local495[local966]; local970 = local970 << 1 | local980) {
								local966++;
								local980 = method352(arg0);
							}
							local537 = local500[local970 - local505[local966]];
						}
					}
					arg0.anInt2837 = 0;
					arg0.aByte4 = 0;
					arg0.anIntArray253[0] = 0;
					for (@Pc(1009) int local1009 = 1; local1009 <= 256; local1009++) {
						arg0.anIntArray253[local1009] = arg0.anIntArray255[local1009 - 1];
					}
					for (@Pc(1026) int local1026 = 1; local1026 <= 256; local1026++) {
						@Pc(1031) int[] local1031 = arg0.anIntArray253;
						local1031[local1026] += arg0.anIntArray253[local1026 - 1];
					}
					for (@Pc(1046) int local1046 = 0; local1046 < local475; local1046++) {
						@Pc(1056) byte local1056 = (byte) (Static4.anIntArray265[local1046] & 0xFF);
						@Pc(1057) int[] local1057 = Static4.anIntArray265;
						@Pc(1063) int local1063 = arg0.anIntArray253[local1056 & 0xFF];
						local1057[local1063] |= local1046 << 8;
						@Pc(1077) int local1077 = arg0.anIntArray253[local1056 & 0xFF]++;
					}
					arg0.anInt2838 = Static4.anIntArray265[arg0.anInt2836] >> 8;
					arg0.anInt2848 = 0;
					arg0.anInt2838 = Static4.anIntArray265[arg0.anInt2838];
					arg0.anInt2841 = (byte) (arg0.anInt2838 & 0xFF);
					arg0.anInt2838 >>= 8;
					arg0.anInt2848++;
					arg0.anInt2850 = local475;
					method355(arg0);
					if (arg0.anInt2848 == arg0.anInt2850 + 1 && arg0.anInt2837 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(Lclient!kf;)V")
	private static void method355(@OriginalArg(0) Class104 arg0) {
		@Pc(2) byte local2 = arg0.aByte4;
		@Pc(5) int local5 = arg0.anInt2837;
		@Pc(8) int local8 = arg0.anInt2848;
		@Pc(11) int local11 = arg0.anInt2841;
		@Pc(13) int[] local13 = Static4.anIntArray265;
		@Pc(16) int local16 = arg0.anInt2838;
		@Pc(19) byte[] local19 = arg0.aByteArray26;
		@Pc(22) int local22 = arg0.anInt2851;
		@Pc(25) int local25 = arg0.anInt2846;
		@Pc(27) int local27 = local25;
		@Pc(32) int local32 = arg0.anInt2850 + 1;
		label67:
		while (true) {
			if (local5 > 0) {
				while (true) {
					if (local25 == 0) {
						break label67;
					}
					if (local5 == 1) {
						if (local25 == 0) {
							local5 = 1;
							break label67;
						}
						local19[local22] = local2;
						local22++;
						local25--;
						break;
					}
					local19[local22] = local2;
					local5--;
					local22++;
					local25--;
				}
			}
			@Pc(62) boolean local62 = true;
			while (local62) {
				local62 = false;
				if (local8 == local32) {
					local5 = 0;
					break label67;
				}
				local2 = (byte) local11;
				@Pc(79) int local79 = local13[local16];
				@Pc(84) byte local84 = (byte) (local79 & 0xFF);
				local16 = local79 >> 8;
				local8++;
				if (local84 != local11) {
					local11 = local84;
					if (local25 == 0) {
						local5 = 1;
						break label67;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local62 = true;
				} else if (local8 == local32) {
					if (local25 == 0) {
						local5 = 1;
						break label67;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local62 = true;
				}
			}
			local5 = 2;
			@Pc(131) int local131 = local13[local16];
			@Pc(136) byte local136 = (byte) (local131 & 0xFF);
			local16 = local131 >> 8;
			local8++;
			if (local8 != local32) {
				if (local136 == local11) {
					local5 = 3;
					@Pc(157) int local157 = local13[local16];
					@Pc(162) byte local162 = (byte) (local157 & 0xFF);
					local16 = local157 >> 8;
					local8++;
					if (local8 != local32) {
						if (local162 == local11) {
							@Pc(181) int local181 = local13[local16];
							@Pc(186) byte local186 = (byte) (local181 & 0xFF);
							local181 >>= 8;
							@Pc(191) int local191 = local8 + 1;
							local5 = (local186 & 0xFF) + 4;
							local181 = local13[local181];
							local11 = (byte) (local181 & 0xFF);
							local16 = local181 >> 8;
							local8 = local191 + 1;
						} else {
							local11 = local162;
						}
					}
				} else {
					local11 = local136;
				}
			}
		}
		@Pc(215) int local215 = arg0.anInt2833;
		arg0.anInt2833 += local27 - local25;
		if (arg0.anInt2833 < local215) {
		}
		arg0.aByte4 = local2;
		arg0.anInt2837 = local5;
		arg0.anInt2848 = local8;
		arg0.anInt2841 = local11;
		Static4.anIntArray265 = local13;
		arg0.anInt2838 = local16;
		arg0.aByteArray26 = local19;
		arg0.anInt2851 = local22;
		arg0.anInt2846 = local25;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void method356(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(8) int local8 = 0; local8 < arg6; local8++) {
				if (arg3[local8] == local3) {
					arg2[local1] = local8;
					local1++;
				}
			}
		}
		for (@Pc(27) int local27 = 0; local27 < 23; local27++) {
			arg1[local27] = 0;
		}
		for (@Pc(38) int local38 = 0; local38 < arg6; local38++) {
			arg1[arg3[local38] + 1]++;
		}
		for (@Pc(56) int local56 = 1; local56 < 23; local56++) {
			arg1[local56] += arg1[local56 - 1];
		}
		for (@Pc(74) int local74 = 0; local74 < 23; local74++) {
			arg0[local74] = 0;
		}
		@Pc(85) int local85 = 0;
		for (@Pc(87) int local87 = arg4; local87 <= arg5; local87++) {
			@Pc(102) int local102 = local85 + arg1[local87 + 1] - arg1[local87];
			arg0[local87] = local102 - 1;
			local85 = local102 << 1;
		}
		for (@Pc(118) int local118 = arg4 + 1; local118 <= arg5; local118++) {
			arg1[local118] = (arg0[local118 - 1] + 1 << 1) - arg1[local118];
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!f;)V")
	public static void method383(@OriginalArg(1) Class53_Sub1_Sub1 arg0) {
		@Pc(20) Class4_Sub11 local20 = (Class4_Sub11) Static5.aClass84_18.method1844(Static18.method1746(arg0.aString88));
		if (local20 == null) {
			Static8.method109(null, arg0.anIntArray422[0], null, arg0.anIntArray426[0], arg0, 0, Static7.anInt5334);
		} else {
			local20.method1652();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V")
	public static void method384(@OriginalArg(0) boolean arg0) {
		Static4.anInt2644 = 0;
		Static3.aClass112_13 = null;
		Static3.aByteArrayArrayArray12 = null;
		if (arg0 && Static3.aClass4_Sub3_Sub22_3 != null) {
			Static3.anInt2554 = Static3.aClass4_Sub3_Sub22_3.anInt5993;
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
		Static3.aClass4_Sub3_Sub22_3 = null;
		Static3.aClass175_12.method4337();
		Static4.aClass106_5 = null;
		Static6.aClass106_8 = null;
		Static1.aClass106_1 = null;
		Static5.aClass106_6 = null;
		Static6.aClass106_7 = null;
		Static4.aClass4_Sub3_Sub14_3 = null;
		Static6.anInt4393 = -1;
		Static3.aClass138_6 = null;
		Static2.aClass106_2 = null;
		Static3.aClass4_Sub3_Sub14_Sub1_2 = null;
		Static4.aClass106_4 = null;
		Static4.aClass106_3 = null;
		Static1.anInt929 = -1;
		Static25.method2925();
		Static1.aClass130_1 = null;
		Static3.aClass84_10 = null;
		Static3.aClass84_9 = null;
		Static14.method1064(128, 64);
		Static16.method1501(64);
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

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I")
	public static int method394(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!p;)I")
	public static int method395(@OriginalArg(1) Class53_Sub1_Sub2 arg0) {
		@Pc(4) Class168 local4 = arg0.aClass168_1;
		if (local4.anIntArray590 != null) {
			local4 = local4.method4265();
			if (local4 == null) {
				return -1;
			}
		}
		@Pc(33) int local33 = local4.anInt5252;
		@Pc(37) Class34 local37 = arg0.method3314();
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
	public static int method396(@OriginalArg(0) Class53_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt1580;
		@Pc(12) Class34 local12 = arg0.method3314();
		if (arg0.anInt4005 == local12.anInt860) {
			local8 = arg0.anInt1588;
		} else if (local12.anInt831 == arg0.anInt4005 || arg0.anInt4005 == local12.anInt829 || local12.anInt857 == arg0.anInt4005 || arg0.anInt4005 == local12.anInt867) {
			local8 = arg0.anInt1589;
		} else if (local12.anInt854 == arg0.anInt4005 || arg0.anInt4005 == local12.anInt833 || arg0.anInt4005 == local12.anInt861 || local12.anInt852 == arg0.anInt4005) {
			local8 = arg0.anInt1583;
		}
		return local8;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
	public static void method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub3_Sub9 local8 = Static12.method2322(1, arg0);
		local8.method1520();
		local8.anInt1993 = arg1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!fh;)Z")
	public static boolean method398(@OriginalArg(1) Class58 arg0) {
		return arg0.method1359(Static4.anInt3250);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z")
	public static boolean method456() {
		return Static3.aBoolean138 ? true : Static3.aBoolean144;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Class94[] local7 = Static7.aClass94Array1;
		for (@Pc(16) int local16 = 0; local16 < local7.length; local16++) {
			@Pc(24) Class94 local24 = local7[local16];
			if (local24 != null && local24.anInt2561 == 2) {
				Static29.method3482(arg2 >> 1, local24.anInt2567 * 2, arg3, (local24.anInt2558 - Static5.anInt3983 << 7) + local24.anInt2564, local24.anInt2568 + (local24.anInt2565 - Static7.anInt5479 << 7), arg1, arg4 >> 1);
				if (Static7.anInt5584 > -1 && Static2.anInt954 % 20 < 10) {
					Static6.aClass4_Sub3_Sub14Array11[local24.anInt2559].method4506(arg5 + Static7.anInt5584 - 12, Static4.anInt3290 + arg0 - 28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!fh;Lclient!fh;I)I")
	public static int method464(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1) {
		@Pc(1) int local1 = 0;
		if (arg1.method1359(Static2.anInt914)) {
			local1++;
		}
		if (arg1.method1359(Static7.anInt6040)) {
			local1++;
		}
		if (arg1.method1359(Static4.anInt3309)) {
			local1++;
		}
		if (arg0.method1359(Static2.anInt914)) {
			local1++;
		}
		if (arg0.method1359(Static7.anInt6040)) {
			local1++;
		}
		if (arg0.method1359(Static4.anInt3309)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wf;I)V")
	public static void method467(@OriginalArg(0) Class185 arg0) {
		@Pc(4) int local4 = arg0.anInt5904;
		if (local4 == 324) {
			if (Static4.anInt3017 == -1) {
				Static7.anInt5228 = arg0.anInt5926;
				Static4.anInt3017 = arg0.anInt5947;
			}
			if (Static1.aClass144_1.aBoolean306) {
				arg0.anInt5947 = Static4.anInt3017;
			} else {
				arg0.anInt5947 = Static7.anInt5228;
			}
		} else if (local4 == 325) {
			if (Static4.anInt3017 == -1) {
				Static4.anInt3017 = arg0.anInt5947;
				Static7.anInt5228 = arg0.anInt5926;
			}
			if (Static1.aClass144_1.aBoolean306) {
				arg0.anInt5947 = Static7.anInt5228;
			} else {
				arg0.anInt5947 = Static4.anInt3017;
			}
		} else if (local4 == 327) {
			arg0.anInt5944 = 150;
			arg0.anInt5976 = (int) (Math.sin((double) Static2.anInt954 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt5895 = -1;
			arg0.anInt5939 = 5;
		} else if (local4 == 328) {
			if (Static4.aClass53_Sub1_Sub1_2.aString88 == null) {
				arg0.anInt5895 = 0;
			} else {
				arg0.anInt5944 = 150;
				arg0.anInt5976 = (int) (Math.sin((double) Static2.anInt954 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt5939 = 5;
				arg0.anInt5895 = ((int) Static18.method1746(Static4.aClass53_Sub1_Sub1_2.aString88) << 11) + 2047;
				arg0.anInt5892 = Static4.aClass53_Sub1_Sub1_2.anInt4046;
				arg0.anInt5891 = Static4.aClass53_Sub1_Sub1_2.anInt4005;
				arg0.anInt5979 = Static4.aClass53_Sub1_Sub1_2.anInt4019;
				arg0.anInt5897 = 0;
			}
		}
	}
}

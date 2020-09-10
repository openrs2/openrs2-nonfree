import java.awt.Component;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(B)Lclient!fg;")
	public static Class4_Sub3_Sub7 method492() {
		if (Static3.aClass175_12 == null) {
			return null;
		} else {
			Static1.aClass130_1.method3256(Static3.aClass175_12);
			@Pc(24) Class4_Sub3_Sub7 local24 = (Class4_Sub3_Sub7) Static1.aClass130_1.method3255();
			@Pc(29) Class82 local29 = Static22.method2191(local24.anInt1760);
			return local29 != null && local29.aBoolean157 && local29.method1810() ? local24 : Static24.method2713();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)Lclient!vd;")
	public static Class178 method494(@OriginalArg(0) int arg0) {
		@Pc(10) Class178 local10 = (Class178) Static6.aClass26_54.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static4.aClass58_54.fetchFile(31, arg0);
		@Pc(32) Class178 local32 = new Class178();
		if (local28 != null) {
			local32.method4438(new Buffer(local28), arg0);
		}
		Static6.aClass26_54.put((long) arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!fh;III)[Lclient!ma;")
	public static Class56[] method495(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1) {
		return Static9.method197(arg0, arg1, 0) ? Static23.method2456() : null;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(II)I")
	public static int method496(@OriginalArg(1) int arg0) {
		arg0 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		arg0 = (arg0 & 0x33333333) + (arg0 >>> 2 & 0xB3333333);
		arg0 = (arg0 >>> 4) + arg0 & 0xF0F0F0F;
		arg0 += arg0 >>> 8;
		arg0 += arg0 >>> 16;
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
	public static boolean method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static2.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == -Static2.anInt1871) {
			return false;
		} else if (local7 == Static2.anInt1871) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static33.method4119(local22 + 1, Static6.anIntArrayArrayArray13[arg0][arg1][arg2], local26 + 1) && Static33.method4119(local22 + 128 - 1, Static6.anIntArrayArrayArray13[arg0][arg1 + 1][arg2], local26 + 1) && Static33.method4119(local22 + 128 - 1, Static6.anIntArrayArrayArray13[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static33.method4119(local22 + 1, Static6.anIntArrayArrayArray13[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static2.anIntArrayArrayArray3[arg0][arg1][arg2] = Static2.anInt1871;
				return true;
			} else {
				Static2.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static2.anInt1871;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!fh;ILclient!fh;)V")
	public static void method514(@OriginalArg(0) Js5 arg0, @OriginalArg(2) Js5 arg1) {
		Static3.aClass58_58 = arg1;
		Static1.aClass58_3 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method516() {
		Static35.method4310();
		Static31.method3150();
		Static24.method2697();
		Static3.aClass40_11.clear();
		Static3.aClass96_1 = new Class96();
		((Class24_Sub1) Static4.anInterface4_1).method460();
		Static13.method1027();
		Static5.aClass50Array1 = new Class50[255];
		Static5.anInt3736 = 0;
		Static32.method3876();
		Static14.method1211();
		Static16.method1556();
		Static10.method384(false);
		Static22.method2411();
		Static20.method1929();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(51) Player local51 = Static5.aClass53_Sub1_Sub1Array1[local42];
			if (local51 != null) {
				local51.anObject5 = null;
			}
		}
		if (Static3.aBoolean138) {
			Static14.method1205();
			Static10.method300(Preferences.hdr);
			Static26.method2969();
		}
		Static8.method113(client.js5Archive8, client.js5Archive13);
		Static35.method667(client.js5Archive8);
		Static6.aClass4_Sub3_Sub14_5 = null;
		Static6.aClass4_Sub3_Sub14_8 = null;
		Static2.aClass4_Sub3_Sub14_2 = null;
		Static7.aClass4_Sub3_Sub14_9 = null;
		Static1.aClass4_Sub3_Sub14_1 = null;
		if (Static4.anInt3304 == 5) {
			Static24.method2675(client.js5Archive8);
		}
		if (Static4.anInt3304 == 10) {
			method605(false);
		}
		if (Static4.anInt3304 == 30) {
			Static9.method233(25);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!io;ZI)V")
	public static void method519(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray2;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class4_Sub3_Sub13 local18 = Static12.method718(local14);
		if (local18 == null) {
			return;
		}
		Static4.aStringArray21 = new String[local18.anInt2660];
		@Pc(29) int local29 = 0;
		Static4.anIntArray272 = new int[local18.anInt2662];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = 1; local37 < local8.length; local37++) {
			if (local8[local37] instanceof Integer) {
				@Pc(56) int local56 = (Integer) local8[local37];
				if (local56 == -2147483647) {
					local56 = arg0.anInt2495;
				}
				if (local56 == -2147483646) {
					local56 = arg0.anInt2492;
				}
				if (local56 == -2147483645) {
					local56 = arg0.aClass185_7 == null ? -1 : arg0.aClass185_7.anInt5914;
				}
				if (local56 == -2147483644) {
					local56 = arg0.anInt2494;
				}
				if (local56 == -2147483643) {
					local56 = arg0.aClass185_7 == null ? -1 : arg0.aClass185_7.anInt5968;
				}
				if (local56 == -2147483642) {
					local56 = arg0.aClass185_6 == null ? -1 : arg0.aClass185_6.anInt5914;
				}
				if (local56 == -2147483641) {
					local56 = arg0.aClass185_6 == null ? -1 : arg0.aClass185_6.anInt5968;
				}
				if (local56 == -2147483640) {
					local56 = arg0.anInt2488;
				}
				if (local56 == -2147483639) {
					local56 = arg0.anInt2490;
				}
				Static4.anIntArray272[local29++] = local56;
			} else if (local8[local37] instanceof String) {
				@Pc(168) String local168 = (String) local8[local37];
				if (local168.equals("event_opbase")) {
					local168 = arg0.aString143;
				}
				Static4.aStringArray21[local35++] = local168;
			}
		}
		Static16.method1551(arg1, local18);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([[FIBIII[[FIBBLclient!ih;Z[[F[[III)V")
	public static void method521(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7, @OriginalArg(9) byte arg8, @OriginalArg(10) Class4_Sub12 arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(7) int local7 = (arg1 << 8) + 255;
		@Pc(13) int local13 = (arg6 << 8) + 255;
		@Pc(23) int local23 = (arg4 << 8) + 255;
		@Pc(29) int local29 = (arg3 << 8) + 255;
		@Pc(39) int[] local39 = null;
		@Pc(43) int[] local43 = Static1.anIntArrayArray5[arg7];
		@Pc(49) int[] local49 = new int[local43.length >> 1];
		for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
			local49[local51] = Static37.method4757(arg5, local43[local51 + local51 + 1], arg14, arg12, arg11, null, arg9, local7, arg13, false, 0.0F, arg0, arg8, local43[local51 + local51], local29, local23, local13);
		}
		if (arg10) {
			if (arg7 == 1) {
				local39 = new int[6];
				@Pc(178) int local178 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				@Pc(199) int local199 = Static37.method4757(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[2] = local49[2];
				local39[0] = local199;
				local39[5] = local49[2];
				local39[3] = local178;
				local39[1] = local178;
				local39[4] = local49[0];
			} else if (arg7 == 2) {
				@Pc(251) int local251 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39 = new int[6];
				@Pc(275) int local275 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				local39[1] = local275;
				local39[3] = local251;
				local39[4] = local49[1];
				local39[0] = local49[0];
				local39[2] = local251;
				local39[5] = local49[0];
			} else if (arg7 == 3) {
				local39 = new int[6];
				@Pc(330) int local330 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				@Pc(351) int local351 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				local39[1] = local49[1];
				local39[4] = local351;
				local39[0] = local49[2];
				local39[3] = local330;
				local39[2] = local330;
				local39[5] = local49[2];
			} else if (arg7 == 4) {
				local39 = new int[3];
				@Pc(406) int local406 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local39[0] = local49[3];
				local39[1] = local406;
				local39[2] = local49[0];
			} else if (arg7 == 5) {
				@Pc(444) int local444 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39 = new int[] { local49[2], local444, local49[3] };
			} else if (arg7 == 6) {
				local39 = new int[6];
				@Pc(488) int local488 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				@Pc(509) int local509 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[1] = local488;
				local39[0] = local49[3];
				local39[4] = local49[0];
				local39[3] = local509;
				local39[2] = local509;
				local39[5] = local49[3];
			} else if (arg7 == 7) {
				local39 = new int[6];
				@Pc(564) int local564 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				@Pc(585) int local585 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[2] = local564;
				local39[0] = local49[1];
				local39[3] = local564;
				local39[4] = local49[2];
				local39[1] = local585;
				local39[5] = local49[1];
			} else if (arg7 == 8) {
				local39 = new int[3];
				@Pc(640) int local640 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local39[0] = local49[3];
				local39[1] = local640;
				local39[2] = local49[4];
			} else if (arg7 == 9) {
				@Pc(678) int local678 = Static37.method4757(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				@Pc(699) int local699 = Static37.method4757(arg5, 32, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 96, local29, local23, local13);
				@Pc(720) int local720 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				local39 = new int[] { local699, local678, local49[4], local699, local49[4], local49[3], local699, local49[3], local49[2], local699, local49[2], local49[1], local699, local49[1], local720 };
			} else if (arg7 == 10) {
				local39 = new int[9];
				@Pc(824) int local824 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local39[0] = local49[2];
				local39[7] = local824;
				local39[4] = local824;
				local39[6] = local49[4];
				local39[8] = local49[0];
				local39[2] = local49[3];
				local39[1] = local824;
				local39[5] = local49[4];
				local39[3] = local49[3];
			} else if (arg7 == 11) {
				local39 = new int[12];
				@Pc(897) int local897 = Static37.method4757(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				@Pc(918) int local918 = Static37.method4757(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[0] = local49[3];
				local39[11] = local918;
				local39[3] = local49[3];
				local39[7] = local918;
				local39[1] = local897;
				local39[10] = local49[1];
				local39[5] = local897;
				local39[8] = local897;
				local39[2] = local49[0];
				local39[9] = local49[2];
				local39[4] = local49[2];
				local39[6] = local49[2];
			}
		}
		arg9.method1870(arg2, arg13, arg14, local49, local39, false);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZII)I")
	public static int method522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static6.anIntArrayArrayArray13 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg1 >> 7;
		@Pc(16) int local16 = arg0 >> 7;
		if (local12 < 0 || local16 < 0 || local12 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(38) int local38 = arg2;
		if (arg2 < 3 && (Static4.aByteArrayArrayArray17[1][local12][local16] & 0x2) == 2) {
			local38 = arg2 + 1;
		}
		@Pc(61) int local61 = arg0 & 0x7F;
		@Pc(70) int local70 = arg1 & 0x7F;
		@Pc(98) int local98 = Static6.anIntArrayArrayArray13[local38][local12][local16] * (128 - local70) + local70 * Static6.anIntArrayArrayArray13[local38][local12 + 1][local16] >> 7;
		@Pc(128) int local128 = Static6.anIntArrayArrayArray13[local38][local12 + 1][local16 + 1] * local70 + (128 - local70) * Static6.anIntArrayArrayArray13[local38][local12][local16 + 1] >> 7;
		return local128 * local61 + local98 * (128 - local61) >> 7;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIC)C")
	public static char method523(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZ)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != Static2.anInt1626) {
			Static4.anIntArray231 = new int[arg0];
			for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
				Static4.anIntArray231[local14] = (local14 << 12) / arg0;
			}
			Static1.anInt901 = arg0 - 1;
			Static2.anInt1626 = arg0;
			Static6.anInt4511 = arg0 * 32;
		}
		if (arg1 == Static1.anInt379) {
			return;
		}
		if (arg1 == Static2.anInt1626) {
			Static6.anIntArray478 = Static4.anIntArray231;
		} else {
			Static6.anIntArray478 = new int[arg1];
			for (@Pc(58) int local58 = 0; local58 < arg1; local58++) {
				Static6.anIntArray478[local58] = (local58 << 12) / arg1;
			}
		}
		Static6.anInt5001 = arg1 - 1;
		Static1.anInt379 = arg1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!wf;IIIILclient!uj;)V")
	public static void method525(@OriginalArg(0) int arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4_Sub3_Sub14 arg5) {
		if (arg5 == null) {
			return;
		}
		@Pc(14) int local14 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
		@Pc(26) int local26 = Math.max(arg1.anInt5893 / 2, arg1.anInt5949 / 2) + 10;
		@Pc(34) int local34 = arg4 * arg4 + arg3 * arg3;
		if (local34 > local26 * local26) {
			return;
		}
		@Pc(45) int local45 = Class109.anIntArray299[local14];
		local45 = local45 * 256 / (Static6.anInt4761 + 256);
		@Pc(57) int local57 = Class109.anIntArray298[local14];
		local57 = local57 * 256 / (Static6.anInt4761 + 256);
		@Pc(75) int local75 = arg3 * local57 + arg4 * local45 >> 16;
		@Pc(86) int local86 = local57 * arg4 - arg3 * local45 >> 16;
		if (Static3.aBoolean138) {
			((Class4_Sub3_Sub14_Sub2) arg5).method4517(arg1.anInt5893 / 2 + arg0 + local75 - arg5.anInt5602 / 2, arg1.anInt5949 / 2 + arg2 - arg5.anInt5612 / 2 - local86, (Class4_Sub3_Sub14_Sub2) arg1.method4729(false));
		} else {
			((Class4_Sub3_Sub14_Sub1) arg5).method2171(arg0 + arg1.anInt5893 / 2 + local75 - arg5.anInt5602 / 2, arg1.anInt5949 / 2 + arg2 - arg5.anInt5612 / 2 - local86, arg1.anIntArray672, arg1.anIntArray657);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILclient!wf;II)V")
	public static void method526(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13 = arg2.anInt5949;
		if (arg2.aByte27 == 0) {
			arg2.anInt5949 = arg2.anInt5950;
		} else if (arg2.aByte27 == 1) {
			arg2.anInt5949 = arg3 - arg2.anInt5950;
		} else if (arg2.aByte27 == 2) {
			arg2.anInt5949 = arg3 * arg2.anInt5950 >> 14;
		} else if (arg2.aByte27 == 3) {
			if (arg2.anInt5911 == 2) {
				arg2.anInt5949 = arg2.anInt5964 * (arg2.anInt5950 - 1) + arg2.anInt5950 * 32;
			} else if (arg2.anInt5911 == 7) {
				arg2.anInt5949 = arg2.anInt5950 * 12 + (arg2.anInt5950 - 1) * arg2.anInt5964;
			}
		}
		@Pc(108) int local108 = arg2.anInt5893;
		if (arg2.aByte24 == 0) {
			arg2.anInt5893 = arg2.anInt5927;
		} else if (arg2.aByte24 == 1) {
			arg2.anInt5893 = arg1 - arg2.anInt5927;
		} else if (arg2.aByte24 == 2) {
			arg2.anInt5893 = arg1 * arg2.anInt5927 >> 14;
		} else if (arg2.aByte24 == 3) {
			if (arg2.anInt5911 == 2) {
				arg2.anInt5893 = (arg2.anInt5927 - 1) * arg2.anInt5943 + arg2.anInt5927 * 32;
			} else if (arg2.anInt5911 == 7) {
				arg2.anInt5893 = arg2.anInt5927 * 115 + arg2.anInt5943 * (arg2.anInt5927 - 1);
			}
		}
		if (arg2.aByte24 == 4) {
			arg2.anInt5893 = arg2.anInt5908 * arg2.anInt5949 / arg2.anInt5970;
		}
		if (arg2.aByte27 == 4) {
			arg2.anInt5949 = arg2.anInt5970 * arg2.anInt5893 / arg2.anInt5908;
		}
		if (Static1.aBoolean26 && (Static12.method687(arg2).anInt3947 != 0 || arg2.anInt5911 == 0)) {
			if (arg2.anInt5949 < 5 && arg2.anInt5893 < 5) {
				arg2.anInt5949 = 5;
				arg2.anInt5893 = 5;
			} else {
				if (arg2.anInt5949 <= 0) {
					arg2.anInt5949 = 5;
				}
				if (arg2.anInt5893 <= 0) {
					arg2.anInt5893 = 5;
				}
			}
		}
		if (arg2.anInt5904 == 1337) {
			Static3.aClass185_5 = arg2;
		}
		if (arg0 && arg2.anObjectArray32 != null && (local108 != arg2.anInt5893 || local13 != arg2.anInt5949)) {
			@Pc(298) Class4_Sub13 local298 = new Class4_Sub13();
			local298.anObjectArray2 = arg2.anObjectArray32;
			local298.aClass185_7 = arg2;
			Static3.aClass112_14.addTail(local298);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Lclient!dm;")
	public static Class42 method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass42_1 == null ? null : local7.aClass42_1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!p;BI)V")
	public static void method529(@OriginalArg(0) int arg0, @OriginalArg(1) Npc arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt4007 && arg0 != -1) {
			@Pc(19) Class46 local19 = Static23.method2494(arg0);
			@Pc(22) int local22 = local19.anInt1238;
			if (local22 == 1) {
				arg1.anInt3970 = 0;
				arg1.anInt3996 = arg2;
				arg1.anInt4011 = 1;
				arg1.anInt4001 = 0;
				arg1.anInt4044 = 0;
				Static29.method3461(local19, arg1.z, arg1.x, arg1.anInt3970, false);
			}
			if (local22 == 2) {
				arg1.anInt4001 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt4007 == -1 || Static23.method2494(arg0).anInt1243 >= Static23.method2494(arg1.anInt4007).anInt1243) {
			arg1.anInt4011 = 1;
			arg1.anInt4030 = arg1.anInt3965;
			arg1.anInt4001 = 0;
			arg1.anInt3970 = 0;
			arg1.anInt3996 = arg2;
			arg1.anInt4007 = arg0;
			arg1.anInt4044 = 0;
			if (arg1.anInt4007 != -1) {
				Static29.method3461(Static23.method2494(arg1.anInt4007), arg1.z, arg1.x, arg1.anInt3970, false);
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIZI)V")
	public static void method553(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static35.method4365(arg0, arg3, arg1, Static3.aClass63_Sub1Array2.length - 1, arg2, 0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([ILclient!p;[II[I)V")
	public static void method555(@OriginalArg(0) int[] arg0, @OriginalArg(1) Npc arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(19) int local19 = arg0[local7];
			@Pc(23) int local23 = arg2[local7];
			@Pc(27) int local27 = arg3[local7];
			@Pc(29) int local29 = 0;
			while (local23 != 0 && local29 < arg1.aClass150Array3.length) {
				if ((local23 & 0x1) != 0) {
					if (local19 == -1) {
						arg1.aClass150Array3[local29] = null;
					} else {
						@Pc(53) Class46 local53 = Static23.method2494(local19);
						@Pc(56) int local56 = local53.anInt1238;
						@Pc(61) Class150 local61 = arg1.aClass150Array3[local29];
						if (local61 != null) {
							if (local61.anInt4456 == local19) {
								if (local56 == 0) {
									local61 = arg1.aClass150Array3[local29] = null;
								} else if (local56 == 1) {
									local61.anInt4465 = 0;
									local61.anInt4464 = 1;
									local61.anInt4460 = 0;
									local61.anInt4461 = local27;
									local61.anInt4462 = 0;
									Static29.method3461(local53, arg1.z, arg1.x, 0, false);
								} else if (local56 == 2) {
									local61.anInt4465 = 0;
								}
							} else if (local53.anInt1243 >= Static23.method2494(local61.anInt4456).anInt1243) {
								local61 = arg1.aClass150Array3[local29] = null;
							}
						}
						if (local61 == null) {
							@Pc(155) Class150 local155 = arg1.aClass150Array3[local29] = new Class150();
							local155.anInt4456 = local19;
							local155.anInt4462 = 0;
							local155.anInt4460 = 0;
							local155.anInt4464 = 1;
							local155.anInt4465 = 0;
							local155.anInt4461 = local27;
							Static29.method3461(local53, arg1.z, arg1.x, 0, false);
						}
					}
				}
				local29++;
				local23 >>>= 1;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)I")
	public static int method557() {
		if (GameShell.fullScreenFrame != null) {
			return 3;
		} else if (Static3.aBoolean138 && Static4.aBoolean184) {
			return 2;
		} else if (Static3.aBoolean138 && !Static4.aBoolean184) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!fh;I)I")
	public static int method558(@OriginalArg(0) Js5 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.isFileReady(Static3.anInt2120)) {
			local5++;
		}
		if (arg0.isFileReady(Static6.anInt4363)) {
			local5++;
		}
		if (arg0.isFileReady(Static5.anInt4281)) {
			local5++;
		}
		if (arg0.isFileReady(Static2.anInt1975)) {
			local5++;
		}
		if (arg0.isFileReady(Static5.anInt4207)) {
			local5++;
		}
		if (arg0.isFileReady(Static7.anInt5332)) {
			local5++;
		}
		if (arg0.isFileReady(Static7.anInt5230)) {
			local5++;
		}
		if (arg0.isFileReady(Static6.anInt3786)) {
			local5++;
		}
		if (arg0.isFileReady(Static3.anInt2296)) {
			local5++;
		}
		if (arg0.isFileReady(Static5.anInt4163)) {
			local5++;
		}
		if (arg0.isFileReady(Static3.anInt2449)) {
			local5++;
		}
		if (arg0.isFileReady(Static2.anInt1632)) {
			local5++;
		}
		if (arg0.isFileReady(Static1.anInt130)) {
			local5++;
		}
		if (arg0.isFileReady(Static6.anInt4371)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method559() {
		client.instance.loadMiscNatives();
		GameShell.focus = true;
		Static3.anInt2235 = 0;
		Static7.aBoolean367 = true;
		Static4.aClass99_1.anInt2670 = 0;
		Static1.aLong32 = 0L;
		Static12.method719();
		Static1.anInt885 = 0;
		Static4.anInt3335 = -1;
		Static5.anInt4329 = 0;
		Static3.anInt2273 = -1;
		Static3.aClass4_Sub10_Sub1_1.position = 0;
		Static2.anInt1231 = -1;
		Static3.anInt2583 = 0;
		Static1.anInt552 = -1;
		Static5.aClass4_Sub10_Sub1_2.position = 0;
		for (@Pc(45) int local45 = 0; local45 < Static7.aClass94Array1.length; local45++) {
			Static7.aClass94Array1[local45] = null;
		}
		Static1.aBoolean17 = false;
		Static7.anInt5634 = 0;
		Static36.method4553(0);
		for (@Pc(3667) int local3667 = 0; local3667 < 100; local3667++) {
			Static6.aStringArray31[local3667] = null;
		}
		Static6.anInt4761 = (int) (Math.random() * 30.0D) - 20;
		Static1.anInt548 = (int) (Math.random() * 100.0D) - 50;
		Static6.anInt3585 = (int) (Math.random() * 120.0D) - 60;
		Static5.anInt3469 = 0;
		Static5.aFloat97 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static1.anInt242 = (int) (Math.random() * 80.0D) - 40;
		Static3.aBoolean177 = false;
		Static2.anInt1334 = 0;
		Static1.anInt837 = (int) (Math.random() * 110.0D) - 55;
		Static6.anInt4457 = 0;
		Static27.method4239();
		Static3.anInt2510 = 0;
		Static6.anInt4451 = 0;
		for (@Pc(3740) int local3740 = 0; local3740 < 2048; local3740++) {
			Static5.aClass53_Sub1_Sub1Array1[local3740] = null;
			Static6.aClass4_Sub10Array1[local3740] = null;
		}
		for (@Pc(3756) int local3756 = 0; local3756 < 32768; local3756++) {
			Static3.aClass53_Sub1_Sub2Array1[local3756] = null;
		}
		Static4.aClass53_Sub1_Sub1_2 = Static5.aClass53_Sub1_Sub1Array1[2047] = new Player();
		Static1.aClass112_1.clear();
		Static2.aClass112_8.clear();
		if (Static4.aClass112ArrayArrayArray1 != null) {
			for (@Pc(3787) int local3787 = 0; local3787 < 4; local3787++) {
				for (@Pc(3794) int local3794 = 0; local3794 < 104; local3794++) {
					for (@Pc(3801) int local3801 = 0; local3801 < 104; local3801++) {
						Static4.aClass112ArrayArrayArray1[local3787][local3794][local3801] = null;
					}
				}
			}
		}
		Static2.aClass112_7 = new LinkedList();
		Static7.anInt5497 = 0;
		Static6.anInt5214 = 0;
		Static12.method778();
		Static16.method1566();
		Static1.anInt212 = 0;
		Static3.anInt2497 = 0;
		Static5.anInt3490 = 0;
		Static7.anInt5236 = 0;
		Static5.anInt3572 = 0;
		Static4.anInt3302 = 0;
		Static4.anInt2977 = 0;
		Static4.anInt3131 = 0;
		Static5.anInt4165 = 0;
		Static6.anInt4838 = 0;
		for (@Pc(3857) int local3857 = 0; local3857 < Static6.anIntArray462.length; local3857++) {
			Static6.anIntArray462[local3857] = -1;
		}
		if (Static3.anInt5398 != -1) {
			Static32.method4025(Static3.anInt5398);
		}
		for (@Pc(3886) Class4_Sub27 local3886 = (Class4_Sub27) Static4.aClass84_13.head(); local3886 != null; local3886 = (Class4_Sub27) Static4.aClass84_13.next()) {
			Static28.method3246(true, local3886);
		}
		Static3.anInt5398 = -1;
		Static4.aClass84_13 = new HashTable(8);
		Static14.method1068();
		Static6.aClass185_14 = null;
		Static7.anInt5634 = 0;
		Static1.aBoolean17 = false;
		Static1.aClass144_1.set(-1, null, -1, new int[] { 0, 0, 0, 0, 0 }, false);
		for (@Pc(3945) int local3945 = 0; local3945 < 8; local3945++) {
			Static2.aStringArray40[local3945] = null;
			Static3.aBooleanArray11[local3945] = false;
			Static5.anIntArray615[local3945] = -1;
		}
		Static12.method715();
		Static3.aBoolean366 = true;
		for (@Pc(3969) int local3969 = 0; local3969 < 100; local3969++) {
			Static2.aBooleanArray8[local3969] = true;
		}
		Static6.aClass4_Sub15Array1 = null;
		Static2.aString108 = null;
		Static4.anInt3260 = 0;
		for (@Pc(3987) int local3987 = 0; local3987 < 6; local3987++) {
			Static1.aClass160Array1[local3987] = new Class160();
		}
		for (@Pc(4001) int local4001 = 0; local4001 < 25; local4001++) {
			Static7.anIntArray501[local4001] = 0;
			Static7.anIntArray599[local4001] = 0;
			Static7.anIntArray637[local4001] = 0;
		}
		if (Static3.aBoolean138) {
			Static17.method1655();
		}
		Static7.aShortArray124 = Static5.aShortArray74 = Static7.aShortArray111 = Static4.aShortArray126 = new short[256];
		Static2.aBoolean119 = false;
		Static5.aBoolean248 = true;
		Static7.anInt5426 = 0;
		Static5.aString236 = LocalisedText.WALKHERE;
		Static36.method4447();
		Static7.aBoolean389 = false;
		Static21.method2001();
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)I")
	public static int method561() {
		if (Static2.aBoolean119) {
			return 0;
		} else if (Static10.method456()) {
			return Preferences.roofsVisible ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIZ)I")
	public static int method562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class109.anIntArray298[arg3 * 1024 / arg0] >> 1;
		return ((65536 - local21) * arg2 >> 16) + (local21 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V")
	public static void method563(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static31.method3152(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIII)V")
	public static void method565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static18.method1656(Static5.anIntArrayArray36[arg0], arg3, arg1 - arg2, arg2 + arg1);
		@Pc(20) int local20 = 0;
		@Pc(33) int local33 = arg2;
		@Pc(36) int local36 = -arg2;
		@Pc(38) int local38 = -1;
		while (local33 > local20) {
			local38 += 2;
			local20++;
			local36 += local38;
			if (local36 >= 0) {
				local33--;
				local36 -= local33 << 1;
				@Pc(69) int[] local69 = Static5.anIntArrayArray36[arg0 - local33];
				@Pc(76) int[] local76 = Static5.anIntArrayArray36[arg0 + local33];
				@Pc(80) int local80 = arg1 - local20;
				@Pc(84) int local84 = arg1 + local20;
				Static18.method1656(local76, arg3, local80, local84);
				Static18.method1656(local69, arg3, local80, local84);
			}
			@Pc(101) int local101 = arg1 + local33;
			@Pc(106) int local106 = arg1 - local33;
			@Pc(112) int[] local112 = Static5.anIntArrayArray36[arg0 + local20];
			@Pc(118) int[] local118 = Static5.anIntArrayArray36[arg0 - local20];
			Static18.method1656(local112, arg3, local106, local101);
			Static18.method1656(local118, arg3, local106, local101);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[JI[I)V")
	public static void method572(@OriginalArg(1) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg2) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) long local21 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local21;
		@Pc(35) int local35 = arg3[local15];
		arg3[local15] = arg3[arg0];
		arg3[arg0] = local35;
		for (@Pc(47) int local47 = arg2; local47 < arg0; local47++) {
			if (arg1[local47] < (long) (local47 & 0x1) + local21) {
				@Pc(70) long local70 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17] = local70;
				@Pc(84) int local84 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17++] = local84;
			}
		}
		arg1[arg0] = arg1[local17];
		arg1[local17] = local21;
		arg3[arg0] = arg3[local17];
		arg3[local17] = local35;
		method572(local17 - 1, arg1, arg2, arg3);
		method572(arg0, arg1, local17 + 1, arg3);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z[BIII[Lclient!ch;)V")
	public static void method576(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30[] arg4) {
		@Pc(10) Buffer local10 = new Buffer(arg1);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local10.readUnsignedMultiSmart();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(37) int local37 = 0;
			while (true) {
				@Pc(41) int local41 = local10.readUnsignedShortSmart();
				if (local41 == 0) {
					break;
				}
				local37 += local41 - 1;
				@Pc(56) int local56 = local37 & 0x3F;
				@Pc(62) int local62 = local37 >> 6 & 0x3F;
				@Pc(66) int local66 = local10.readUnsignedByte();
				@Pc(70) int local70 = local66 & 0x3;
				@Pc(74) int local74 = local66 >> 2;
				@Pc(79) int local79 = local62 + arg3;
				@Pc(84) int local84 = local56 + arg2;
				@Pc(88) int local88 = local37 >> 12;
				if (local79 > 0 && local84 > 0 && local79 < 103 && local84 < 103) {
					@Pc(104) Class30 local104 = null;
					if (!arg0) {
						@Pc(108) int local108 = local88;
						if ((Static4.aByteArrayArrayArray17[1][local79][local84] & 0x2) == 2) {
							local108 = local88 - 1;
						}
						if (local108 >= 0) {
							local104 = arg4[local108];
						}
					}
					Static22.method2193(local70, local88, local20, local88, local79, arg0, local84, local104, !arg0, local74);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!fh;)Lclient!uj;")
	public static Class4_Sub3_Sub14 method583(@OriginalArg(1) int arg0, @OriginalArg(2) Js5 arg1) {
		return Static33.method4131(arg1, arg0) ? Static14.method1063() : null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILclient!vc;IJIIII)Z")
	public static boolean method584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static23.method2424(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 + 1 - arg8, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
	public static void method586() {
		Static7.aClass26_55.clean(5);
		Static5.aClass26_41.clean(5);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method587() {
		synchronized (Static2.aClass124_1) {
			Static5.anInt4214++;
			Static2.anInt1991 = Static2.anInt1306;
			Static7.anInt5357 = Static6.anInt4977;
			Static7.anInt6038 = Static6.anInt4556;
			Static6.anInt4802 = Static7.anInt5679;
			Static2.anInt1797 = Static7.anInt6049;
			Static7.anInt5312 = Static3.anInt2426;
			Static1.aLong20 = Static7.aLong193;
			Static7.anInt5679 = 0;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method588(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static7.aClass161_1);
		arg0.removeFocusListener(Static7.aClass161_1);
		Static6.anInt4595 = -1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
	public static void method589() {
		if (Static7.aClass161_1 != null) {
			synchronized (Static7.aClass161_1) {
				Static7.aClass161_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	public static void method605(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static3.anInt5398 != -1) {
				Static32.method4025(Static3.anInt5398);
			}
			for (@Pc(15) Class4_Sub27 local15 = (Class4_Sub27) Static4.aClass84_13.head(); local15 != null; local15 = (Class4_Sub27) Static4.aClass84_13.next()) {
				Static28.method3246(true, local15);
			}
			Static3.anInt5398 = -1;
			Static4.aClass84_13 = new HashTable(8);
			Static14.method1068();
			Static3.anInt5398 = Static7.anInt742;
			Static12.method777(false);
			Static13.method933();
			Static14.method1102(Static3.anInt5398);
		}
		Static7.anInt6050 = -1;
		Static13.method966(Static4.anInt3407);
		Static4.aClass53_Sub1_Sub1_2 = new Player();
		Static4.aClass53_Sub1_Sub1_2.z = 3000;
		Static4.aClass53_Sub1_Sub1_2.x = 3000;
		if (!Static3.aBoolean138 && client.game == 0) {
			Static21.method2005(client.js5Archive8);
			Static9.method233(10);
			return;
		}
		if (Static1.anInt772 == 2) {
			Static3.anInt2519 = Static4.anInt2977 << 7;
			Static7.anInt5678 = Static5.anInt4165 << 7;
		} else {
			Static16.method1496();
		}
		if (Static3.aBoolean138) {
			Static17.method1655();
		}
		Static28.method3322();
		Static9.method233(28);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILsignlink!pm;)[Lclient!ub;")
	public static Class169[] method610(@OriginalArg(1) SignLink arg0) {
		if (!arg0.isFullScreenSupported()) {
			return new Class169[0];
		}
		@Pc(17) PrivilegedRequest local17 = arg0.getDisplayModes();
		while (local17.status == 0) {
			ThreadUtils.sleep(10L);
		}
		if (local17.status == 2) {
			return new Class169[0];
		}
		@Pc(39) int[] local39 = (int[]) local17.result;
		@Pc(45) Class169[] local45 = new Class169[local39.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local45.length; local53++) {
			@Pc(65) Class169 local65 = new Class169();
			local45[local53] = local65;
			local65.anInt5276 = local39[local53 << 2];
			local65.anInt5275 = local39[(local53 << 2) + 1];
			local65.anInt5279 = local39[(local53 << 2) + 2];
			local65.anInt5277 = local39[(local53 << 2) + 3];
		}
		return local45;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZC)Z")
	public static boolean method636(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIILclient!vc;IJZ)Z")
	public static boolean method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class53 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		@Pc(53) int local53 = local7 / 128;
		@Pc(57) int local57 = local11 / 128;
		@Pc(61) int local61 = local15 / 128;
		@Pc(65) int local65 = local19 / 128;
		return Static23.method2424(arg0, local53, local57, local61 + 1 - local53, local65 + 1 - local57, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}
}

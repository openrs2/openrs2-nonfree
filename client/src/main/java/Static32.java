import java.io.IOException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([FI)[F")
	public static float[] method3875(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		Static8.method77(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!s", name = "y", descriptor = "()V")
	public static void method3876() {
		Static6.aClass53_Sub4_Sub2_1 = new Class53_Sub4_Sub2();
		Static6.aClass53_Sub4_Sub2_2 = new Class53_Sub4_Sub2();
		Static6.aClass53_Sub4_Sub2_3 = new Class53_Sub4_Sub2();
		Static6.aClass53_Sub4_Sub2_4 = new Class53_Sub4_Sub2();
		Static6.aClass53_Sub4_Sub2_5 = new Class53_Sub4_Sub2();
		Static6.aClass53_Sub4_Sub2_6 = new Class53_Sub4_Sub2();
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

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!fh;I)Lclient!ma;")
	public static Class56 method3878(@OriginalArg(1) Class58 arg0, @OriginalArg(2) int arg1) {
		return Static33.method4131(arg0, arg1) ? Static9.method204() : null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method3879() {
		Static24.method2652(0, 0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Lclient!vl;")
	public static Class182 method3881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class182 local14 = local7.aClass182_1;
			local7.aClass182_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
	public static int method3882(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method3884(@OriginalArg(1) Class58 arg0) {
		Static6.aClass58_84 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V")
	public static void method3885(@OriginalArg(0) int arg0) {
		if (Static7.anIntArray678 == null || Static7.anIntArray678.length < arg0) {
			Static7.anIntArray678 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
	public static void method3916() {
		Static3.aClass26_25.method515();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	public static void method3917(@OriginalArg(1) boolean arg0) {
		Static9.method763();
		if (Static4.anInt3304 != 30 && Static4.anInt3304 != 25) {
			return;
		}
		Static3.anInt2142++;
		if (Static3.anInt2142 < 50 && !arg0) {
			return;
		}
		Static3.anInt2142 = 0;
		if (!Static1.aBoolean38 && Static3.aClass52_7 != null) {
			Static3.aClass4_Sub10_Sub1_1.method4650(137);
			try {
				Static3.aClass52_7.method1107(Static3.aClass4_Sub10_Sub1_1.aByteArray71, Static3.aClass4_Sub10_Sub1_1.anInt5709);
				Static3.aClass4_Sub10_Sub1_1.anInt5709 = 0;
			} catch (@Pc(52) IOException local52) {
				Static1.aBoolean38 = true;
			}
		}
		Static9.method763();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)C")
	public static char method3919(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Z")
	public static boolean method3920(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!fd;I)Lclient!gg;")
	public static Class11_Sub3 method3921(@OriginalArg(0) Class4_Sub10 arg0) {
		return new Class11_Sub3(arg0.method4576(), arg0.method4576(), arg0.method4576(), arg0.method4576(), arg0.method4618(), arg0.method4618(), arg0.method4629());
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!fd;I)Lclient!de;")
	public static Class11_Sub2 method3922(@OriginalArg(0) Class4_Sub10 arg0) {
		return new Class11_Sub2(arg0.method4576(), arg0.method4576(), arg0.method4576(), arg0.method4576(), arg0.method4618(), arg0.method4629());
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZJB)V")
	public static void method3923(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (Static6.anInt4516 >= 100) {
			Static26.method4357("", 0, Static1.aString38);
			return;
		}
		@Pc(25) String local25 = Static29.method3477(arg1);
		for (@Pc(27) int local27 = 0; local27 < Static6.anInt4516; local27++) {
			if (Static3.aLongArray16[local27] == arg1) {
				Static26.method4357("", 0, local25 + Static3.aString128);
				return;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < Static6.anInt5214; local59++) {
			if (Static7.aLongArray54[local59] == arg1) {
				Static26.method4357("", 0, Static6.aString260 + local25 + Static3.aString113);
				return;
			}
		}
		if (local25.equals(Static4.aClass53_Sub1_Sub1_2.aString88)) {
			Static26.method4357("", 0, Static4.aString205);
			return;
		}
		Static3.aLongArray16[Static6.anInt4516] = arg1;
		Static3.aStringArray18[Static6.anInt4516] = Static30.method423(arg1);
		Static2.aBooleanArray5[Static6.anInt4516++] = arg0;
		Static3.anInt2102 = Static6.anInt4979;
		Static3.aClass4_Sub10_Sub1_1.method4650(197);
		Static3.aClass4_Sub10_Sub1_1.method4582(arg1);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZZIII)V")
	public static void method3924(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (Static3.aBoolean138) {
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
						Static18.method1698();
						Static18.method1701(arg3, arg0, local121, arg2, 0);
						Static18.method1701(arg3 + arg4 - local121, arg0, local121, arg2, 0);
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
						Static18.method1698();
						Static18.method1701(arg3, arg0, arg4, local195, 0);
						Static18.method1701(arg3, arg0 + arg2 - local195, arg4, local195, 0);
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

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!fd;I)V")
	public static void method3949(@OriginalArg(0) Class4_Sub10 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static1.aClass189_1 != null) {
			try {
				Static1.aClass189_1.method4798(0L);
				Static1.aClass189_1.method4803(local8);
				@Pc(32) int local32;
				for (local32 = 0; local32 < 24 && local8[local32] == 0; local32++) {
				}
				if (local32 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(56) Exception local56) {
				for (@Pc(58) int local58 = 0; local58 < 24; local58++) {
					local8[local58] = -1;
				}
			}
		}
		arg0.method4594(local8, 24);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)V")
	public static void method3951() {
		Static2.aClass26_12.method517(5);
		Static3.aClass26_27.method517(5);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLclient!fd;)Lclient!in;")
	public static Class11_Sub4 method3953(@OriginalArg(1) Class4_Sub10 arg0) {
		return new Class11_Sub4(arg0.method4576(), arg0.method4576(), arg0.method4576(), arg0.method4576(), arg0.method4576(), arg0.method4576(), arg0.method4576(), arg0.method4576(), arg0.method4618(), arg0.method4629());
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
			@Pc(67) int local67 = Class109.anIntArray299[local53];
			@Pc(71) int local71 = Class109.anIntArray298[local53];
			local46 = -arg3 * local67 >> 16;
			local57 = arg3 * local71 >> 16;
		}
		if (local44 != 0) {
			@Pc(93) int local93 = Class109.anIntArray298[local44];
			@Pc(97) int local97 = Class109.anIntArray299[local44];
			local55 = local57 * local97 >> 16;
			local57 = local57 * local93 >> 16;
		}
		Static7.anInt5678 = arg4 - local57;
		Static2.anInt1931 = arg1 - local46;
		Static3.anInt2519 = arg6 - local55;
		Static5.anInt3656 = arg0;
		Static5.anInt4066 = arg2;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method3956() {
		Static3.aClass26_24.method511();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V")
	public static void method3981(@OriginalArg(1) int arg0) {
		if (Static7.anInt5330 == arg0) {
			@Pc(16) Interface2 local16 = Static6.anInterface2Array1[arg0];
			local16.method3486(Static1.anInt214);
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)Lclient!ik;")
	public static Class89 method3982(@OriginalArg(1) int arg0) {
		@Pc(6) Class89 local6 = (Class89) Static4.aClass26_29.method518((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static3.aClass58_100.method1372(0, arg0);
		@Pc(25) Class89 local25 = new Class89();
		if (local21 != null) {
			local25.method1915(new Class4_Sub10(local21));
		}
		local25.method1919();
		Static4.aClass26_29.method510(local25, (long) arg0);
		return local25;
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(II)Lclient!te;")
	public static Class4_Sub3_Sub19 method3984(@OriginalArg(0) int arg0) {
		@Pc(19) Class4_Sub3_Sub19 local19 = (Class4_Sub3_Sub19) Static7.aClass26_49.method518((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) Class4_Sub3_Sub19 local31 = Static37.method4756(arg0, Static2.aClass58_35, Static7.aClass58_101);
		if (local31 != null) {
			Static7.aClass26_49.method510(local31, (long) arg0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!wf;IB)I")
	public static int method3985(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1) {
		if (!Static12.method687(arg0).method3266(arg1) && arg0.anObjectArray18 == null) {
			return -1;
		} else if (arg0.anIntArray666 == null || arg0.anIntArray666.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray666[arg1];
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
	public static void method3986() {
		Static6.aClass26_53.method517(5);
		Static7.aClass26_49.method517(5);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!to;IIIIIIZ)V")
	public static void method3987(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
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
			if (arg0.anIntArray572 != null) {
				Static7.anIntArray585[local5] = local15;
				Static7.anIntArray578[local5] = local39;
				Static7.anIntArray573[local5] = local29;
			}
			Static7.anIntArray577[local5] = Static4.anInt3125 + (local15 << 9) / local29;
			Static7.anIntArray582[local5] = Static4.anInt3126 + (local39 << 9) / local29;
		}
		Static4.anInt3127 = 0;
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
				if (Static2.aBoolean101 && Static15.method1223(Static1.anInt315 + Static4.anInt3125, Static7.anInt5803 + Static4.anInt3126, local156, local160, local164, local144, local148, local152)) {
					Static1.anInt528 = arg5;
					Static1.anInt420 = arg6;
				}
				if (!Static3.aBoolean138 && !arg7) {
					Static4.aBoolean217 = false;
					if (local144 < 0 || local148 < 0 || local152 < 0 || local144 > Static4.anInt3129 || local148 > Static4.anInt3129 || local152 > Static4.anInt3129) {
						Static4.aBoolean217 = true;
					}
					if (arg0.anIntArray572 == null || arg0.anIntArray572[local122] == -1) {
						if (arg0.anIntArray576[local122] != 12345678) {
							Static23.method2543(local156, local160, local164, local144, local148, local152, arg0.anIntArray576[local122], arg0.anIntArray575[local122], arg0.anIntArray574[local122]);
						}
					} else if (!Static1.aBoolean27) {
						@Pc(373) int local373 = Static4.anInterface4_1.method446(arg0.anIntArray572[local122]);
						Static23.method2543(local156, local160, local164, local144, local148, local152, Static10.method302(local373, arg0.anIntArray576[local122]), Static10.method302(local373, arg0.anIntArray575[local122]), Static10.method302(local373, arg0.anIntArray574[local122]));
					} else if (arg0.aBoolean353) {
						Static23.method2558(local156, local160, local164, local144, local148, local152, arg0.anIntArray576[local122], arg0.anIntArray575[local122], arg0.anIntArray574[local122], Static7.anIntArray585[0], Static7.anIntArray585[1], Static7.anIntArray585[3], Static7.anIntArray578[0], Static7.anIntArray578[1], Static7.anIntArray578[3], Static7.anIntArray573[0], Static7.anIntArray573[1], Static7.anIntArray573[3], arg0.anIntArray572[local122]);
					} else {
						Static23.method2558(local156, local160, local164, local144, local148, local152, arg0.anIntArray576[local122], arg0.anIntArray575[local122], arg0.anIntArray574[local122], Static7.anIntArray585[local130], Static7.anIntArray585[local135], Static7.anIntArray585[local140], Static7.anIntArray578[local130], Static7.anIntArray578[local135], Static7.anIntArray578[local140], Static7.anIntArray573[local130], Static7.anIntArray573[local135], Static7.anIntArray573[local140], arg0.anIntArray572[local122]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	public static void method3996() {
		for (@Pc(6) Class4_Sub11 local6 = (Class4_Sub11) Static1.aClass112_2.method2610(); local6 != null; local6 = (Class4_Sub11) Static1.aClass112_2.method2616()) {
			if (local6.aBoolean146) {
				local6.method1652();
			}
		}
		for (@Pc(36) Class4_Sub11 local36 = (Class4_Sub11) Static2.aClass112_9.method2610(); local36 != null; local36 = (Class4_Sub11) Static2.aClass112_9.method2616()) {
			if (local36.aBoolean146) {
				local36.method1652();
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

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "([ILclient!f;I[I[I)V")
	public static void method4023(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class53_Sub1_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg3.length; local11++) {
			@Pc(23) int local23 = arg3[local11];
			@Pc(27) int local27 = arg2[local11];
			@Pc(31) int local31 = arg0[local11];
			for (@Pc(33) int local33 = 0; local31 != 0 && local33 < arg1.aClass150Array3.length; local33++) {
				if ((local31 & 0x1) != 0) {
					if (local23 == -1) {
						arg1.aClass150Array3[local33] = null;
					} else {
						@Pc(61) Class46 local61 = Static23.method2494(local23);
						@Pc(66) Class150 local66 = arg1.aClass150Array3[local33];
						@Pc(69) int local69 = local61.anInt1238;
						if (local66 != null) {
							if (local66.anInt4456 == local23) {
								if (local69 == 0) {
									local66 = arg1.aClass150Array3[local33] = null;
								} else if (local69 == 1) {
									local66.anInt4462 = 0;
									local66.anInt4464 = 1;
									local66.anInt4460 = 0;
									local66.anInt4465 = 0;
									local66.anInt4461 = local27;
									Static29.method3461(local61, arg1.anInt4002, arg1.anInt3974, 0, Static4.aClass53_Sub1_Sub1_2 == arg1);
								} else if (local69 == 2) {
									local66.anInt4465 = 0;
								}
							} else if (local61.anInt1243 >= Static23.method2494(local66.anInt4456).anInt1243) {
								local66 = arg1.aClass150Array3[local33] = null;
							}
						}
						if (local66 == null) {
							@Pc(166) Class150 local166 = arg1.aClass150Array3[local33] = new Class150();
							local166.anInt4456 = local23;
							local166.anInt4460 = 0;
							local166.anInt4465 = 0;
							local166.anInt4461 = local27;
							local166.anInt4464 = 1;
							local166.anInt4462 = 0;
							Static29.method3461(local61, arg1.anInt4002, arg1.anInt3974, 0, arg1 == Static4.aClass53_Sub1_Sub1_2);
						}
					}
				}
				local31 >>>= 1;
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!qc;B)V")
	public static void method4024(@OriginalArg(0) Class53_Sub1 arg0) {
		@Pc(5) Class34 local5 = arg0.method3314();
		arg0.anInt4005 = local5.anInt860;
		if (arg0.anInt3965 == 0) {
			arg0.anInt4037 = 0;
			return;
		}
		if (arg0.anInt4007 != -1 && arg0.anInt3996 == 0) {
			@Pc(41) Class46 local41 = Static23.method2494(arg0.anInt4007);
			if (arg0.anInt4030 > 0 && local41.anInt1240 == 0) {
				arg0.anInt4037++;
				return;
			}
			if (arg0.anInt4030 <= 0 && local41.anInt1237 == 0) {
				arg0.anInt4037++;
				return;
			}
		}
		if (arg0.anInt3961 != -1 && Static2.anInt954 >= arg0.anInt3984) {
			@Pc(95) Class110 local95 = Static21.method2004(arg0.anInt3961);
			if (local95.aBoolean222 && local95.anInt3134 != -1) {
				@Pc(110) Class46 local110 = Static23.method2494(local95.anInt3134);
				if (arg0.anInt4030 > 0 && local110.anInt1240 == 0) {
					arg0.anInt4037++;
					return;
				}
				if (arg0.anInt4030 <= 0 && local110.anInt1237 == 0) {
					arg0.anInt4037++;
					return;
				}
			}
		}
		@Pc(145) int local145 = arg0.anInt3974;
		@Pc(148) int local148 = arg0.anInt4002;
		@Pc(167) int local167 = arg0.anIntArray422[arg0.anInt3965 - 1] * 128 + arg0.method3311() * 64;
		@Pc(184) int local184 = arg0.anIntArray426[arg0.anInt3965 - 1] * 128 + arg0.method3311() * 64;
		if (local167 - local145 > 256 || local167 - local145 < -256 || local184 - local148 > 256 || local184 - local148 < -256) {
			arg0.anInt4002 = local184;
			arg0.anInt3974 = local167;
			return;
		}
		if (local167 <= local145) {
			if (local145 <= local167) {
				if (local184 > local148) {
					arg0.anInt4017 = 1024;
				} else if (local148 > local184) {
					arg0.anInt4017 = 0;
				}
			} else if (local148 < local184) {
				arg0.anInt4017 = 768;
			} else if (local184 >= local148) {
				arg0.anInt4017 = 512;
			} else {
				arg0.anInt4017 = 256;
			}
		} else if (local148 < local184) {
			arg0.anInt4017 = 1280;
		} else if (local148 > local184) {
			arg0.anInt4017 = 1792;
		} else {
			arg0.anInt4017 = 1536;
		}
		@Pc(295) int local295 = local5.anInt828;
		@Pc(304) int local304 = arg0.anInt4017 - arg0.anInt4031 & 0x7FF;
		if (local304 > 1024) {
			local304 -= 2048;
		}
		if (local304 >= -256 && local304 <= 256) {
			local295 = local5.anInt846;
		} else if (local304 >= 256 && local304 < 768) {
			local295 = local5.anInt840;
		} else if (local304 >= -768 && local304 <= -256) {
			local295 = local5.anInt855;
		}
		if (local295 == -1) {
			local295 = local5.anInt846;
		}
		arg0.anInt4005 = local295;
		@Pc(361) int local361 = 4;
		@Pc(363) boolean local363 = true;
		if (arg0 instanceof Class53_Sub1_Sub2) {
			local363 = ((Class53_Sub1_Sub2) arg0).aClass168_1.aBoolean358;
		}
		@Pc(373) byte local373 = 1;
		if (local363) {
			if (arg0.anInt4031 != arg0.anInt4017 && arg0.anInt3985 == -1 && arg0.anInt4009 != 0) {
				local361 = 2;
			}
			if (arg0.anInt3965 > 2) {
				local361 = 6;
			}
			if (arg0.anInt3965 > 3) {
				local361 = 8;
			}
			if (arg0.anInt4037 > 0 && arg0.anInt3965 > 1) {
				local361 = 8;
				arg0.anInt4037--;
			}
		} else {
			if (arg0.anInt3965 > 1) {
				local361 = 6;
			}
			if (arg0.anInt3965 > 2) {
				local361 = 8;
			}
			if (arg0.anInt4037 > 0 && arg0.anInt3965 > 1) {
				arg0.anInt4037--;
				local361 = 8;
			}
		}
		if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
			local373 = 2;
			local361 <<= 1;
		} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
			local361 >>= 1;
			local373 = 0;
		}
		if (local361 < 8 || local5.anInt831 == -1) {
			if (local5.anInt854 != -1 && local373 == 0) {
				if (local5.anInt828 == arg0.anInt4005 && local5.anInt833 != -1) {
					arg0.anInt4005 = local5.anInt833;
				} else if (arg0.anInt4005 == local5.anInt855 && local5.anInt852 != -1) {
					arg0.anInt4005 = local5.anInt852;
				} else if (local5.anInt840 == arg0.anInt4005 && local5.anInt861 != -1) {
					arg0.anInt4005 = local5.anInt861;
				} else {
					arg0.anInt4005 = local5.anInt854;
				}
			}
		} else if (arg0.anInt4005 == local5.anInt828 && local5.anInt829 != -1) {
			arg0.anInt4005 = local5.anInt829;
		} else if (local5.anInt855 == arg0.anInt4005 && local5.anInt867 != -1) {
			arg0.anInt4005 = local5.anInt867;
		} else if (local5.anInt840 == arg0.anInt4005 && local5.anInt857 != -1) {
			arg0.anInt4005 = local5.anInt857;
		} else {
			arg0.anInt4005 = local5.anInt831;
		}
		if (local5.anInt841 != -1) {
			@Pc(654) int local654 = local361 << 7;
			if (arg0.anInt3965 == 1) {
				@Pc(666) int local666 = arg0.anInt3999 * arg0.anInt3999;
				@Pc(683) int local683 = (local184 >= arg0.anInt4002 ? local184 - arg0.anInt4002 : arg0.anInt4002 - local184) << 7;
				@Pc(701) int local701 = (local167 < arg0.anInt3974 ? arg0.anInt3974 - local167 : local167 - arg0.anInt3974) << 7;
				@Pc(712) int local712 = local683 >= local701 ? local683 : local701;
				@Pc(719) int local719 = local5.anInt841 * 2 * local712;
				if (local719 < local666) {
					arg0.anInt3999 /= 2;
				} else if (local666 / 2 > local712) {
					arg0.anInt3999 -= local5.anInt841;
					if (arg0.anInt3999 < 0) {
						arg0.anInt3999 = 0;
					}
				} else if (arg0.anInt3999 < local654) {
					arg0.anInt3999 += local5.anInt841;
					if (local654 < arg0.anInt3999) {
						arg0.anInt3999 = local654;
					}
				}
			} else if (arg0.anInt3999 < local654) {
				arg0.anInt3999 += local5.anInt841;
				if (local654 < arg0.anInt3999) {
					arg0.anInt3999 = local654;
				}
			} else if (arg0.anInt3999 > 0) {
				arg0.anInt3999 -= local5.anInt841;
				if (arg0.anInt3999 < 0) {
					arg0.anInt3999 = 0;
				}
			}
			local361 = arg0.anInt3999 >> 7;
			if (local361 < 1) {
				local361 = 1;
			}
		}
		if (local184 > local148) {
			arg0.anInt4002 += local361;
			if (local184 < arg0.anInt4002) {
				arg0.anInt4002 = local184;
			}
		} else if (local148 > local184) {
			arg0.anInt4002 -= local361;
			if (local184 > arg0.anInt4002) {
				arg0.anInt4002 = local184;
			}
		}
		if (local145 < local167) {
			arg0.anInt3974 += local361;
			if (arg0.anInt3974 > local167) {
				arg0.anInt3974 = local167;
			}
		} else if (local145 > local167) {
			arg0.anInt3974 -= local361;
			if (arg0.anInt3974 < local167) {
				arg0.anInt3974 = local167;
			}
		}
		if (arg0.anInt3974 == local167 && arg0.anInt4002 == local184) {
			arg0.anInt3965--;
			if (arg0.anInt4030 > 0) {
				arg0.anInt4030--;
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)V")
	public static void method4025(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static3.aBooleanArray12[arg0]) {
			return;
		}
		Static3.aClass58_56.method1368(arg0);
		if (Static5.aClass185ArrayArray115[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static5.aClass185ArrayArray115[arg0].length; local27++) {
			if (Static5.aClass185ArrayArray115[arg0][local27] != null) {
				if (Static5.aClass185ArrayArray115[arg0][local27].anInt5911 == 2) {
					local25 = false;
				} else {
					Static5.aClass185ArrayArray115[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static5.aClass185ArrayArray115[arg0] = null;
		}
		Static3.aBooleanArray12[arg0] = false;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(II)V")
	public static void method4026(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub3_Sub9 local14 = Static12.method2322(7, arg0);
		local14.method1519();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4028(@OriginalArg(1) int arg0) {
		if (arg0 == 100 && Static2.anInt1266 > 0) {
			@Pc(22) byte[] local22 = Static2.aByteArrayArray9[--Static2.anInt1266];
			Static2.aByteArrayArray9[Static2.anInt1266] = null;
			return local22;
		} else if (arg0 == 5000 && Static5.anInt3472 > 0) {
			@Pc(50) byte[] local50 = Static5.aByteArrayArray30[--Static5.anInt3472];
			Static5.aByteArrayArray30[Static5.anInt3472] = null;
			return local50;
		} else if (arg0 == 30000 && Static2.anInt1161 > 0) {
			@Pc(72) byte[] local72 = Static2.aByteArrayArray11[--Static2.anInt1161];
			Static2.aByteArrayArray11[Static2.anInt1161] = null;
			return local72;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V")
	public static void method4030() {
		Static4.aClass26_30.method517(5);
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
			@Pc(177) int local177 = Static8.method9(Static2.anInt902, arg2 - arg5, Static3.anInt2553);
			@Pc(185) int local185 = Static8.method9(Static2.anInt902, arg2 + arg5, Static3.anInt2553);
			@Pc(193) int local193 = Static8.method9(Static2.anInt902, arg2 - local16, Static3.anInt2553);
			@Pc(203) int local203 = Static8.method9(Static2.anInt902, arg2 + local16, Static3.anInt2553);
			Static18.method1656(local166, arg1, local177, local193);
			Static18.method1656(local166, arg0, local193, local203);
			Static18.method1656(local166, arg1, local203, local185);
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
				@Pc(389) int local389 = Static8.method9(Static2.anInt902, local3 + arg2, Static3.anInt2553);
				@Pc(398) int local398 = Static8.method9(Static2.anInt902, arg2 - local3, Static3.anInt2553);
				if (local281) {
					@Pc(409) int local409 = Static8.method9(Static2.anInt902, arg2 + local11, Static3.anInt2553);
					@Pc(418) int local418 = Static8.method9(Static2.anInt902, arg2 - local11, Static3.anInt2553);
					if (Static4.anInt3086 <= local367) {
						@Pc(426) int[] local426 = Static5.anIntArrayArray36[local367];
						Static18.method1656(local426, arg1, local398, local418);
						Static18.method1656(local426, arg0, local418, local409);
						Static18.method1656(local426, arg1, local409, local389);
					}
					if (Static5.anInt4230 >= local363) {
						@Pc(456) int[] local456 = Static5.anIntArrayArray36[local363];
						Static18.method1656(local456, arg1, local398, local418);
						Static18.method1656(local456, arg0, local418, local409);
						Static18.method1656(local456, arg1, local409, local389);
					}
				} else {
					if (local367 >= Static4.anInt3086) {
						Static18.method1656(Static5.anIntArrayArray36[local367], arg1, local398, local389);
					}
					if (Static5.anInt4230 >= local363) {
						Static18.method1656(Static5.anIntArrayArray36[local363], arg1, local398, local389);
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

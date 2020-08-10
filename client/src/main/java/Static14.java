import java.io.IOException;
import java.net.Socket;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!fh;I)I")
	public static int method1046(@OriginalArg(0) Class58 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1359(Static6.anInt4677)) {
			local5++;
		}
		if (arg0.method1359(Static1.anInt322)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
	public static void method1047() {
		Static28.method3270(Static1.aClass185_1);
		Static3.anInt2165++;
		if (Static6.aBoolean310 && Static4.aBoolean232) {
			@Pc(27) int local27 = Static7.anInt5357;
			@Pc(31) int local31 = local27 - Static5.anInt5204;
			if (local31 < Static2.anInt1633) {
				local31 = Static2.anInt1633;
			}
			if (Static1.aClass185_1.anInt5893 + local31 > Static1.aClass185_2.anInt5893 + Static2.anInt1633) {
				local31 = Static1.aClass185_2.anInt5893 + Static2.anInt1633 - Static1.aClass185_1.anInt5893;
			}
			@Pc(61) int local61 = Static7.anInt6038;
			@Pc(65) int local65 = local61 - Static1.anInt777;
			if (Static6.anInt5182 > local65) {
				local65 = Static6.anInt5182;
			}
			@Pc(75) int local75 = local31 - Static4.anInt3183;
			if (Static1.aClass185_1.anInt5949 + local65 > Static6.anInt5182 + Static1.aClass185_2.anInt5949) {
				local65 = Static6.anInt5182 + Static1.aClass185_2.anInt5949 - Static1.aClass185_1.anInt5949;
			}
			@Pc(103) int local103 = local65 - Static1.anInt134;
			@Pc(106) int local106 = Static1.aClass185_1.anInt5896;
			if (Static3.anInt2165 > Static1.aClass185_1.anInt5953 && (local75 > local106 || local75 < -local106 || local103 > local106 || local103 < -local106)) {
				Static3.aBoolean173 = true;
			}
			@Pc(150) int local150 = Static1.aClass185_2.anInt5932 + local31 - Static2.anInt1633;
			@Pc(159) int local159 = local65 + Static1.aClass185_2.anInt5931 - Static6.anInt5182;
			if (Static1.aClass185_1.anObjectArray11 != null && Static3.aBoolean173) {
				@Pc(169) Class4_Sub13 local169 = new Class4_Sub13();
				local169.anInt2492 = local159;
				local169.aClass185_7 = Static1.aClass185_1;
				local169.anInt2495 = local150;
				local169.anObjectArray2 = Static1.aClass185_1.anObjectArray11;
				Static21.method2019(local169);
			}
			if (Static2.anInt1991 == 0) {
				if (Static3.aBoolean173) {
					if (Static1.aClass185_1.anObjectArray7 != null) {
						@Pc(231) Class4_Sub13 local231 = new Class4_Sub13();
						local231.aClass185_6 = Static7.aClass185_16;
						local231.aClass185_7 = Static1.aClass185_1;
						local231.anInt2495 = local150;
						local231.anInt2492 = local159;
						local231.anObjectArray2 = Static1.aClass185_1.anObjectArray7;
						Static21.method2019(local231);
					}
					if (Static7.aClass185_16 != null && Static12.method691(Static1.aClass185_1) != null) {
						Static3.aClass4_Sub10_Sub1_1.writeOpcode(0);
						Static3.aClass4_Sub10_Sub1_1.writeIntLE2(Static1.aClass185_1.anInt5914);
						Static3.aClass4_Sub10_Sub1_1.writeIntAlt3(Static7.aClass185_16.anInt5914);
						Static3.aClass4_Sub10_Sub1_1.writeShortA(Static7.aClass185_16.anInt5968);
						Static3.aClass4_Sub10_Sub1_1.writeShortLEA(Static1.aClass185_1.anInt5968);
					}
				} else if ((Static3.anInt5400 == 1 || Static13.method1005(Static7.anInt5634 - 1)) && Static7.anInt5634 > 2) {
					Static31.method3783();
				} else if (Static7.anInt5634 > 0) {
					Static37.method4784();
				}
				Static1.aClass185_1 = null;
			}
		} else if (Static3.anInt2165 > 1) {
			Static1.aClass185_1 = null;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1054(@OriginalArg(0) String arg0) {
		@Pc(17) String local17 = Static35.method4319(Static18.method1746(arg0));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILsignlink!pm;)V")
	public static void method1055(@OriginalArg(1) SignLink arg0) {
		@Pc(3) FileOnDisk local3 = null;
		try {
			@Pc(12) PrivilegedRequest local12 = arg0.openPreferences("openrs2");
			while (local12.status == 0) {
				Static37.method4640(1L);
			}
			if (local12.status == 1) {
				local3 = (FileOnDisk) local12.result;
				@Pc(36) Buffer local36 = Static15.method1347();
				local3.write(local36.bytes, 0, local36.position);
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			if (local3 != null) {
				local3.close();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I")
	public static int method1056(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
	public static void method1059() {
		Static2.anInt1943++;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static15.method1364(arg0)) {
			Static12.method693(Static5.aClass185ArrayArray115[arg0], -1, arg5, arg3, arg1, arg6, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method1061(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(13) byte[] local13 = new byte[local4];
		for (@Pc(19) int local19 = 0; local19 < local4; local19++) {
			@Pc(30) char local30 = arg0.charAt(local19);
			if (local30 > '\u0000' && local30 < '\u0080' || local30 >= ' ' && local30 <= 'ÿ') {
				local13[local19] = (byte) local30;
			} else if (local30 == '€') {
				local13[local19] = -128;
			} else if (local30 == '‚') {
				local13[local19] = -126;
			} else if (local30 == 'ƒ') {
				local13[local19] = -125;
			} else if (local30 == '„') {
				local13[local19] = -124;
			} else if (local30 == '…') {
				local13[local19] = -123;
			} else if (local30 == '†') {
				local13[local19] = -122;
			} else if (local30 == '‡') {
				local13[local19] = -121;
			} else if (local30 == 'ˆ') {
				local13[local19] = -120;
			} else if (local30 == '‰') {
				local13[local19] = -119;
			} else if (local30 == 'Š') {
				local13[local19] = -118;
			} else if (local30 == '‹') {
				local13[local19] = -117;
			} else if (local30 == 'Œ') {
				local13[local19] = -116;
			} else if (local30 == 'Ž') {
				local13[local19] = -114;
			} else if (local30 == '‘') {
				local13[local19] = -111;
			} else if (local30 == '’') {
				local13[local19] = -110;
			} else if (local30 == '“') {
				local13[local19] = -109;
			} else if (local30 == '”') {
				local13[local19] = -108;
			} else if (local30 == '•') {
				local13[local19] = -107;
			} else if (local30 == '–') {
				local13[local19] = -106;
			} else if (local30 == '—') {
				local13[local19] = -105;
			} else if (local30 == '˜') {
				local13[local19] = -104;
			} else if (local30 == '™') {
				local13[local19] = -103;
			} else if (local30 == 'š') {
				local13[local19] = -102;
			} else if (local30 == '›') {
				local13[local19] = -101;
			} else if (local30 == 'œ') {
				local13[local19] = -100;
			} else if (local30 == 'ž') {
				local13[local19] = -98;
			} else if (local30 == 'Ÿ') {
				local13[local19] = -97;
			} else {
				local13[local19] = 63;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	public static void method1062() {
		@Pc(14) int local14 = Static7.aByteArrayArray50.length;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			if (Static7.aByteArrayArray50[local16] != null) {
				@Pc(32) int local32 = -1;
				for (@Pc(34) int local34 = 0; local34 < Static6.anInt4744; local34++) {
					if (Static2.anIntArray127[local34] == Static7.anIntArray597[local16]) {
						local32 = local34;
						break;
					}
				}
				if (local32 == -1) {
					Static2.anIntArray127[Static6.anInt4744] = Static7.anIntArray597[local16];
					local32 = Static6.anInt4744++;
				}
				@Pc(82) Buffer local82 = new Buffer(Static7.aByteArrayArray50[local16]);
				@Pc(84) int local84 = 0;
				while (Static7.aByteArrayArray50[local16].length > local82.position && local84 < 511 && Static6.anInt4451 < 1023) {
					@Pc(112) int local112 = local84++ << 6 | local32;
					@Pc(116) int local116 = local82.readUnsignedShort();
					@Pc(120) int local120 = local116 >> 14;
					@Pc(126) int local126 = local116 >> 7 & 0x3F;
					@Pc(139) int local139 = (Static7.anIntArray597[local16] >> 8) * 64 + local126 - Static5.anInt3983;
					@Pc(143) int local143 = local116 & 0x3F;
					@Pc(155) int local155 = local143 + (Static7.anIntArray597[local16] & 0xFF) * 64 - Static7.anInt5479;
					@Pc(161) Class168 local161 = Static15.method1495(local82.readUnsignedShort());
					if (Static3.aClass53_Sub1_Sub2Array1[local112] == null && (local161.aByte21 & 0x1) > 0 && Static2.anInt1216 == local120 && local139 >= 0 && local161.anInt5262 + local139 < 104 && local155 >= 0 && local155 + local161.anInt5262 < 104) {
						Static3.aClass53_Sub1_Sub2Array1[local112] = new Class53_Sub1_Sub2();
						@Pc(217) Class53_Sub1_Sub2 local217 = Static3.aClass53_Sub1_Sub2Array1[local112];
						Static7.anIntArray595[Static6.anInt4451++] = local112;
						local217.anInt3990 = Static2.anInt954;
						local217.method3317(local161);
						local217.method3316(local217.aClass168_1.anInt5262);
						local217.anInt4017 = local217.anInt4031 = Static1.anIntArray27[local217.aClass168_1.aByte18];
						local217.anInt4009 = local217.aClass168_1.anInt5243;
						if (local217.anInt4009 == 0) {
							local217.anInt4031 = 0;
						}
						local217.anInt3986 = local217.aClass168_1.anInt5261;
						local217.method3301(local155, local217.method3311(), local139, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)Lclient!uj;")
	public static Class4_Sub3_Sub14 method1063() {
		@Pc(9) int local9 = Static7.anIntArray643[0] * Static3.anIntArray185[0];
		@Pc(22) byte[] local22 = Static6.aByteArrayArray36[0];
		@Pc(25) int[] local25 = new int[local9];
		for (@Pc(27) int local27 = 0; local27 < local9; local27++) {
			local25[local27] = Static2.anIntArray85[local22[local27] & 0xFF];
		}
		@Pc(68) Class4_Sub3_Sub14 local68;
		if (Static3.aBoolean138) {
			local68 = new Class4_Sub3_Sub14_Sub2(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[0], Static5.anIntArray391[0], Static3.anIntArray185[0], Static7.anIntArray643[0], local25);
		} else {
			local68 = new Class4_Sub3_Sub14_Sub1(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[0], Static5.anIntArray391[0], Static3.anIntArray185[0], Static7.anIntArray643[0], local25);
		}
		Static37.method4670();
		return local68;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	public static void method1064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static4.aClass26_28 = new Class26(arg0);
		Static3.aClass26_23 = new Class26(arg1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lclient!cm;")
	public static Class32 method1065(@OriginalArg(0) int arg0) {
		@Pc(10) Class32 local10 = (Class32) Static3.aClass26_25.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(42) byte[] local42 = Static6.aClass58_86.method1372(Static9.method192(arg0), Static33.method4090(arg0));
		@Pc(46) Class32 local46 = new Class32();
		if (local42 != null) {
			local46.method695(new Buffer(local42));
		}
		Static3.aClass26_25.method510(local46, (long) arg0);
		return local46;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public static void method1066() {
		Static4.aClass26_30.method515();
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
	public static void method1067() {
		Static6.aClass26_54.method517(5);
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public static void method1068() {
		Static5.aClass185ArrayArray115 = new Class185[Static3.aClass58_56.method1351()][];
		Static3.aBooleanArray12 = new boolean[Static3.aClass58_56.method1351()];
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method1069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static15.method1364(arg0)) {
			Static30.method3554(arg3, -1, arg7, Static5.aClass185ArrayArray115[arg0], arg4, arg6, arg1, arg2, arg5);
		} else if (arg7 == -1) {
			for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
				Static2.aBooleanArray8[local25] = true;
			}
		} else {
			Static2.aBooleanArray8[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!fd;)V")
	public static void method1072(@OriginalArg(1) Buffer arg0) {
		@Pc(9) int local9 = arg0.readUnsignedSmart();
		Static6.aClass151Array1 = new Class151[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static6.aClass151Array1[local14] = new Class151();
			Static6.aClass151Array1[local14].anInt4469 = arg0.readUnsignedSmart();
			Static6.aClass151Array1[local14].aString270 = arg0.readVersionedString();
		}
		Static6.anInt4615 = arg0.readUnsignedSmart();
		Static1.anInt645 = arg0.readUnsignedSmart();
		Static3.anInt2580 = arg0.readUnsignedSmart();
		Static2.aClass63_Sub1Array1 = new Class63_Sub1[Static1.anInt645 + 1 - Static6.anInt4615];
		for (@Pc(69) int local69 = 0; local69 < Static3.anInt2580; local69++) {
			@Pc(80) int local80 = arg0.readUnsignedSmart();
			@Pc(88) Class63_Sub1 local88 = Static2.aClass63_Sub1Array1[local80] = new Class63_Sub1();
			local88.anInt2021 = arg0.readUnsignedByte();
			local88.anInt2020 = arg0.readInt();
			local88.anInt2037 = Static6.anInt4615 + local80;
			local88.aString110 = arg0.readVersionedString();
			local88.aString111 = arg0.readVersionedString();
		}
		Static4.anInt2842 = arg0.readInt();
		Static6.aBoolean338 = true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method1077(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < Static6.anInt4516; local12++) {
			if (arg0.equalsIgnoreCase(Static3.aStringArray18[local12])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(I)Z")
	public static boolean method1079() {
		if (client.javaScript) {
			try {
				return !((Boolean) Class86.method1851(Static7.aClass196_4.applet, "showingVideoAd"));
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
	public static void method1082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static32.method3885(arg0);
		@Pc(9) int local9 = arg0 - arg1;
		@Pc(15) int local15 = arg0;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = -arg0;
		if (local9 < 0) {
			local9 = 0;
		}
		@Pc(29) int local29 = local9;
		if (Static4.anInt3086 <= arg5 && arg5 <= Static5.anInt4230) {
			@Pc(40) int[] local40 = Static5.anIntArrayArray36[arg5];
			@Pc(48) int local48 = Static8.method9(Static2.anInt902, arg2 - arg0, Static3.anInt2553);
			@Pc(56) int local56 = Static8.method9(Static2.anInt902, arg0 + arg2, Static3.anInt2553);
			@Pc(67) int local67 = Static8.method9(Static2.anInt902, arg2 - local9, Static3.anInt2553);
			@Pc(77) int local77 = Static8.method9(Static2.anInt902, arg2 + local9, Static3.anInt2553);
			Static18.method1656(local40, arg3, local48, local67);
			Static18.method1656(local40, arg4, local67, local77);
			Static18.method1656(local40, arg3, local77, local56);
		}
		@Pc(98) int local98 = -local9;
		@Pc(100) int local100 = -1;
		@Pc(102) int local102 = -1;
		while (local17 < local15) {
			local100 += 2;
			local98 += local100;
			local102 += 2;
			if (local98 >= 0 && local29 >= 1) {
				local29--;
				local98 -= local29 << 1;
				Static7.anIntArray678[local29] = local17;
			}
			local17++;
			local20 += local102;
			if (local20 >= 0) {
				local15--;
				local20 -= local15 << 1;
				@Pc(154) int local154 = arg5 - local15;
				@Pc(159) int local159 = arg5 + local15;
				if (Static4.anInt3086 <= local159 && local154 <= Static5.anInt4230) {
					if (local15 >= local9) {
						@Pc(186) int local186 = Static8.method9(Static2.anInt902, arg2 + local17, Static3.anInt2553);
						@Pc(194) int local194 = Static8.method9(Static2.anInt902, arg2 - local17, Static3.anInt2553);
						if (Static5.anInt4230 >= local159) {
							Static18.method1656(Static5.anIntArrayArray36[local159], arg3, local194, local186);
						}
						if (local154 >= Static4.anInt3086) {
							Static18.method1656(Static5.anIntArrayArray36[local154], arg3, local194, local186);
						}
					} else {
						@Pc(226) int local226 = Static7.anIntArray678[local15];
						@Pc(237) int local237 = Static8.method9(Static2.anInt902, arg2 + local17, Static3.anInt2553);
						@Pc(245) int local245 = Static8.method9(Static2.anInt902, arg2 - local17, Static3.anInt2553);
						@Pc(254) int local254 = Static8.method9(Static2.anInt902, arg2 + local226, Static3.anInt2553);
						@Pc(262) int local262 = Static8.method9(Static2.anInt902, arg2 - local226, Static3.anInt2553);
						if (Static5.anInt4230 >= local159) {
							@Pc(274) int[] local274 = Static5.anIntArrayArray36[local159];
							Static18.method1656(local274, arg3, local245, local262);
							Static18.method1656(local274, arg4, local262, local254);
							Static18.method1656(local274, arg3, local254, local237);
						}
						if (Static4.anInt3086 <= local154) {
							@Pc(300) int[] local300 = Static5.anIntArrayArray36[local154];
							Static18.method1656(local300, arg3, local245, local262);
							Static18.method1656(local300, arg4, local262, local254);
							Static18.method1656(local300, arg3, local254, local237);
						}
					}
				}
			}
			@Pc(322) int local322 = arg5 + local17;
			@Pc(327) int local327 = arg5 - local17;
			if (Static4.anInt3086 <= local322 && Static5.anInt4230 >= local327) {
				@Pc(337) int local337 = local15 + arg2;
				@Pc(342) int local342 = arg2 - local15;
				if (local337 >= Static2.anInt902 && Static3.anInt2553 >= local342) {
					@Pc(359) int local359 = Static8.method9(Static2.anInt902, local337, Static3.anInt2553);
					@Pc(365) int local365 = Static8.method9(Static2.anInt902, local342, Static3.anInt2553);
					if (local17 >= local9) {
						if (Static5.anInt4230 >= local322) {
							Static18.method1656(Static5.anIntArrayArray36[local322], arg3, local365, local359);
						}
						if (Static4.anInt3086 <= local327) {
							Static18.method1656(Static5.anIntArrayArray36[local327], arg3, local365, local359);
						}
					} else {
						@Pc(415) int local415 = local29 >= local17 ? local29 : Static7.anIntArray678[local17];
						@Pc(424) int local424 = Static8.method9(Static2.anInt902, arg2 + local415, Static3.anInt2553);
						@Pc(432) int local432 = Static8.method9(Static2.anInt902, arg2 - local415, Static3.anInt2553);
						if (Static5.anInt4230 >= local322) {
							@Pc(440) int[] local440 = Static5.anIntArrayArray36[local322];
							Static18.method1656(local440, arg3, local365, local432);
							Static18.method1656(local440, arg4, local432, local424);
							Static18.method1656(local440, arg3, local424, local359);
						}
						if (Static4.anInt3086 <= local327) {
							@Pc(469) int[] local469 = Static5.anIntArrayArray36[local327];
							Static18.method1656(local469, arg3, local365, local432);
							Static18.method1656(local469, arg4, local432, local424);
							Static18.method1656(local469, arg3, local424, local359);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)I")
	public static int method1084() {
		return 14;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII)Z")
	public static boolean method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static11.method508(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static33.method4119(local10 + 1, Static6.anIntArrayArrayArray13[arg0][arg1][arg2] + arg3, local14 + 1) && Static33.method4119(local10 + 128 - 1, Static6.anIntArrayArrayArray13[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static33.method4119(local10 + 128 - 1, Static6.anIntArrayArrayArray13[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static33.method4119(local10 + 1, Static6.anIntArrayArrayArray13[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B[[BI[Lclient!em;[[I[[B[[F[[B[[F[[FI[[B)V")
	public static void method1094(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class50[] arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			@Pc(22) Class50 local22 = arg2[local11];
			if (local22.anInt1326 == arg9) {
				@Pc(34) Class135 local34 = new Class135();
				@Pc(43) int local43 = (local22.anInt1320 >> 7) - local22.anInt1318;
				@Pc(45) int local45 = 0;
				if (local43 < 0) {
					local45 = -local43;
					local43 = 0;
				}
				@Pc(61) int local61 = local22.anInt1318 + (local22.anInt1320 >> 7);
				if (local61 > 103) {
					local61 = 103;
				}
				@Pc(78) int local78 = (local22.anInt1338 >> 7) - local22.anInt1318;
				for (@Pc(80) int local80 = local43; local80 <= local61; local80++) {
					@Pc(88) short local88 = local22.aShortArray28[local45];
					@Pc(94) int local94 = (local88 >> 8) + local78;
					@Pc(102) int local102 = (local88 & 0xFF) + local94 - 1;
					if (local94 < 0) {
						local94 = 0;
					}
					if (local102 > 103) {
						local102 = 103;
					}
					for (@Pc(119) int local119 = local94; local119 <= local102; local119++) {
						@Pc(130) int local130 = arg4[local119][local80] & 0xFF;
						@Pc(138) int local138 = arg6[local119][local80] & 0xFF;
						@Pc(140) boolean local140 = false;
						if (local130 == 0) {
							if (local138 == 0) {
								continue;
							}
							@Pc(156) Class127 local156 = Static26.method2935(local138 - 1);
							if (local156.anInt3869 == -1) {
								continue;
							}
							if (arg10[local119][local80] != 0) {
								@Pc(177) int[] local177 = Static1.anIntArrayArray5[arg10[local119][local80]];
								local34.anInt4160 += (local177.length >> 1) * 3 - 6;
								local34.anInt4159 += local177.length >> 1;
								continue;
							}
						} else if (local138 != 0) {
							@Pc(212) Class127 local212 = Static26.method2935(local138 - 1);
							if (local212.anInt3869 == -1) {
								@Pc(237) byte local237 = arg10[local119][local80];
								if (local237 != 0) {
									@Pc(243) int[] local243 = Static2.anIntArrayArray16[local237];
									local34.anInt4160 += (local243.length >> 1) * 3 - 6;
									local34.anInt4159 += local243.length >> 1;
								}
								continue;
							}
							@Pc(224) byte local224 = arg10[local119][local80];
							if (local224 != 0) {
								local140 = true;
							}
						}
						@Pc(272) Class33 local272 = Static26.method3062(arg9, local119, local80);
						if (local272 != null) {
							@Pc(283) int local283 = (int) (local272.aLong38 >> 14) & 0x3F;
							if (local283 == 9) {
								@Pc(289) int[] local289 = null;
								@Pc(297) int local297 = (int) (local272.aLong38 >> 20) & 0x3;
								if ((local297 & 0x1) == 0) {
									@Pc(315) boolean local315 = local119 - 1 >= local94;
									if (!local315 && local61 >= local80 + 1) {
										@Pc(329) short local329 = local22.aShortArray28[local45 + 1];
										@Pc(335) int local335 = local78 + (local329 >> 8);
										@Pc(341) int local341 = (local329 & 0xFF) + local335;
										local315 = local119 > local335 && local341 > local119;
									}
									@Pc(368) boolean local368 = local102 >= local119 + 1;
									if (!local368 && local80 - 1 >= local43) {
										@Pc(387) short local387 = local22.aShortArray28[local45 - 1];
										@Pc(394) int local394 = local78 + (local387 >> 8);
										@Pc(400) int local400 = local394 + (local387 & 0xFF);
										local368 = local394 < local119 && local119 < local400;
									}
									if (local315 && local368) {
										local289 = Static1.anIntArrayArray5[0];
									} else if (local315) {
										local289 = Static1.anIntArrayArray5[1];
									} else if (local368) {
										local289 = Static1.anIntArrayArray5[1];
									}
								} else {
									@Pc(450) boolean local450 = local94 <= local119 - 1;
									if (!local450 && local43 <= local80 - 1) {
										@Pc(465) short local465 = local22.aShortArray28[local45 - 1];
										@Pc(471) int local471 = (local465 >> 8) + local78;
										@Pc(477) int local477 = local471 + (local465 & 0xFF);
										local450 = local119 > local471 && local477 > local119;
									}
									@Pc(508) boolean local508 = local119 + 1 <= local102;
									if (!local508 && local61 >= local80 + 1) {
										@Pc(526) short local526 = local22.aShortArray28[local45 + 1];
										@Pc(532) int local532 = (local526 >> 8) + local78;
										@Pc(538) int local538 = (local526 & 0xFF) + local532;
										local508 = local532 < local119 && local119 < local538;
									}
									if (local450 && local508) {
										local289 = Static1.anIntArrayArray5[0];
									} else if (local450) {
										local289 = Static1.anIntArrayArray5[1];
									} else if (local508) {
										local289 = Static1.anIntArrayArray5[1];
									}
								}
								if (local289 != null) {
									local34.anInt4160 += ((local289.length >> 1) - 2) * 3;
									local34.anInt4159 += local289.length >> 1;
								}
								continue;
							}
						}
						if (local140) {
							@Pc(635) int[] local635 = Static1.anIntArrayArray5[arg10[local119][local80]];
							@Pc(643) int[] local643 = Static2.anIntArrayArray16[arg10[local119][local80]];
							local34.anInt4160 += ((local635.length >> 1) - 2) * 3;
							local34.anInt4160 += ((local643.length >> 1) - 2) * 3;
							local34.anInt4159 += local635.length >> 1;
							local34.anInt4159 += local643.length >> 1;
						} else {
							@Pc(603) int[] local603 = Static1.anIntArrayArray5[0];
							local34.anInt4160 += ((local603.length >> 1) - 2) * 3;
							local34.anInt4159 += local603.length >> 1;
						}
					}
					local45++;
				}
				local34.method3432();
				@Pc(698) int local698 = 0;
				if ((local22.anInt1320 >> 7) - local22.anInt1318 < 0) {
					local698 = local22.anInt1318 - (local22.anInt1320 >> 7);
				}
				for (@Pc(722) int local722 = local43; local722 <= local61; local722++) {
					@Pc(734) short local734 = local22.aShortArray28[local698];
					@Pc(741) int local741 = local78 + (local734 >> 8);
					@Pc(749) int local749 = (local734 & 0xFF) + local741 - 1;
					if (local741 < 0) {
						local741 = 0;
					}
					if (local749 > 103) {
						local749 = 103;
					}
					for (@Pc(766) int local766 = local741; local766 <= local749; local766++) {
						@Pc(779) byte local779 = arg0[local766][local722];
						@Pc(787) int local787 = arg4[local766][local722] & 0xFF;
						@Pc(795) int local795 = arg6[local766][local722] & 0xFF;
						@Pc(797) boolean local797 = false;
						if (local787 == 0) {
							if (local795 == 0) {
								continue;
							}
							@Pc(810) Class127 local810 = Static26.method2935(local795 - 1);
							if (local810.anInt3869 == -1) {
								continue;
							}
							if (arg10[local766][local722] != 0) {
								Static19.method1778(local22, Static1.anIntArrayArray5[arg10[local766][local722]], arg7, local722, local766, local34, arg5, arg8, arg0[local766][local722], arg3);
								continue;
							}
						} else if (local795 != 0) {
							@Pc(859) Class127 local859 = Static26.method2935(local795 - 1);
							if (local859.anInt3869 == -1) {
								Static19.method1778(local22, Static2.anIntArrayArray16[arg10[local766][local722]], arg7, local722, local766, local34, arg5, arg8, arg0[local766][local722], arg3);
								continue;
							}
							@Pc(895) byte local895 = arg10[local766][local722];
							if (local895 != 0) {
								local797 = true;
							}
						}
						@Pc(907) Class33 local907 = Static26.method3062(arg9, local766, local722);
						if (local907 != null) {
							@Pc(918) int local918 = (int) (local907.aLong38 >> 14) & 0x3F;
							if (local918 == 9) {
								@Pc(925) int[] local925 = null;
								@Pc(933) int local933 = (int) (local907.aLong38 >> 20) & 0x3;
								if ((local933 & 0x1) == 0) {
									@Pc(946) boolean local946 = local741 <= local766 - 1;
									@Pc(959) boolean local959 = local766 + 1 <= local749;
									if (!local946 && local61 >= local722 + 1) {
										@Pc(973) short local973 = local22.aShortArray28[local698 + 1];
										@Pc(979) int local979 = (local973 >> 8) + local78;
										@Pc(985) int local985 = (local973 & 0xFF) + local979;
										local946 = local979 < local766 && local766 < local985;
									}
									if (!local959 && local722 - 1 >= local43) {
										@Pc(1014) short local1014 = local22.aShortArray28[local698 - 1];
										@Pc(1021) int local1021 = local78 + (local1014 >> 8);
										@Pc(1027) int local1027 = (local1014 & 0xFF) + local1021;
										local959 = local1021 < local766 && local766 < local1027;
									}
									if (local946 && local959) {
										local925 = Static1.anIntArrayArray5[0];
									} else if (local946) {
										local925 = Static1.anIntArrayArray5[1];
										local779 = 1;
									} else if (local959) {
										local925 = Static1.anIntArrayArray5[1];
										local779 = 3;
									}
								} else {
									@Pc(1077) boolean local1077 = local766 - 1 >= local741;
									@Pc(1090) boolean local1090 = local749 >= local766 + 1;
									if (!local1077 && local722 - 1 >= local43) {
										@Pc(1104) short local1104 = local22.aShortArray28[local698 - 1];
										@Pc(1110) int local1110 = local78 + (local1104 >> 8);
										@Pc(1116) int local1116 = local1110 + (local1104 & 0xFF);
										local1077 = local1110 < local766 && local766 < local1116;
									}
									if (!local1090 && local61 >= local722 + 1) {
										@Pc(1141) short local1141 = local22.aShortArray28[local698 + 1];
										@Pc(1148) int local1148 = local78 + (local1141 >> 8);
										@Pc(1154) int local1154 = (local1141 & 0xFF) + local1148;
										local1090 = local766 > local1148 && local766 < local1154;
									}
									if (local1077 && local1090) {
										local925 = Static1.anIntArrayArray5[0];
									} else if (local1077) {
										local925 = Static1.anIntArrayArray5[1];
										local779 = 0;
									} else if (local1090) {
										local925 = Static1.anIntArrayArray5[1];
										local779 = 2;
									}
								}
								if (local925 != null) {
									Static19.method1778(local22, local925, arg7, local722, local766, local34, arg5, arg8, local779, arg3);
								}
								continue;
							}
						}
						if (local797) {
							Static19.method1778(local22, Static2.anIntArrayArray16[arg10[local766][local722]], arg7, local722, local766, local34, arg5, arg8, arg0[local766][local722], arg3);
							Static19.method1778(local22, Static1.anIntArrayArray5[arg10[local766][local722]], arg7, local722, local766, local34, arg5, arg8, arg0[local766][local722], arg3);
						} else {
							Static19.method1778(local22, Static1.anIntArrayArray5[0], arg7, local722, local766, local34, arg5, arg8, local779, arg3);
						}
					}
					local698++;
				}
				if (local34.anInt4161 > 0 && local34.anInt4162 > 0) {
					local34.method3434();
					local22.aClass135_1 = local34;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public static void method1100() {
		if (Static6.anInt5117 == 0) {
			return;
		}
		try {
			if (++Static4.anInt2974 > 1500) {
				if (Static3.aClass52_7 != null) {
					Static3.aClass52_7.method1103();
					Static3.aClass52_7 = null;
				}
				if (Static5.anInt4216 >= 1) {
					Static2.anInt1641 = -5;
					Static6.anInt5117 = 0;
					return;
				}
				Static6.anInt5117 = 1;
				Static5.anInt4216++;
				if (Static3.anInt2337 == Static4.anInt3358) {
					Static4.anInt3358 = Static7.anInt5498;
				} else {
					Static4.anInt3358 = Static3.anInt2337;
				}
				Static4.anInt2974 = 0;
			}
			if (Static6.anInt5117 == 1) {
				Static7.aClass197_5 = Static7.aClass196_4.openSocket(Static6.aString291, Static4.anInt3358);
				Static6.anInt5117 = 2;
			}
			if (Static6.anInt5117 == 2) {
				if (Static7.aClass197_5.status == 2) {
					throw new IOException();
				}
				if (Static7.aClass197_5.status != 1) {
					return;
				}
				Static3.aClass52_7 = new Class52((Socket) Static7.aClass197_5.result, Static7.aClass196_4);
				Static7.aClass197_5 = null;
				Static3.aClass52_7.method1107(Static3.aClass4_Sub10_Sub1_1.bytes, Static3.aClass4_Sub10_Sub1_1.position);
				if (Static1.aClass102_1 != null) {
					Static1.aClass102_1.method2996();
				}
				if (Static6.aClass102_2 != null) {
					Static6.aClass102_2.method2996();
				}
				@Pc(131) int local131 = Static3.aClass52_7.method1105();
				if (Static1.aClass102_1 != null) {
					Static1.aClass102_1.method2996();
				}
				if (Static6.aClass102_2 != null) {
					Static6.aClass102_2.method2996();
				}
				if (local131 != 101) {
					Static2.anInt1641 = local131;
					Static6.anInt5117 = 0;
					Static3.aClass52_7.method1103();
					Static3.aClass52_7 = null;
					return;
				}
				Static6.anInt5117 = 3;
			}
			if (Static6.anInt5117 == 3) {
				if (Static3.aClass52_7.method1101() < 2) {
					return;
				}
				@Pc(185) int local185 = Static3.aClass52_7.method1105() << 8 | Static3.aClass52_7.method1105();
				Static37.method4720(local185);
				if (Static6.anInt4846 == -1) {
					Static6.anInt5117 = 0;
					Static2.anInt1641 = 6;
					Static3.aClass52_7.method1103();
					Static3.aClass52_7 = null;
					return;
				}
				Static6.anInt5117 = 0;
				Static3.aClass52_7.method1103();
				Static3.aClass52_7 = null;
				Static8.method101();
				return;
			}
		} catch (@Pc(217) IOException local217) {
			if (Static3.aClass52_7 != null) {
				Static3.aClass52_7.method1103();
				Static3.aClass52_7 = null;
			}
			if (Static5.anInt4216 < 1) {
				Static5.anInt4216++;
				Static4.anInt2974 = 0;
				if (Static4.anInt3358 == Static3.anInt2337) {
					Static4.anInt3358 = Static7.anInt5498;
				} else {
					Static4.anInt3358 = Static3.anInt2337;
				}
				Static6.anInt5117 = 1;
			} else {
				Static6.anInt5117 = 0;
				Static2.anInt1641 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)V")
	public static void method1102(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static15.method1364(arg0)) {
			return;
		}
		@Pc(24) Class185[] local24 = Static5.aClass185ArrayArray115[arg0];
		for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
			@Pc(34) Class185 local34 = local24[local26];
			if (local34.anObjectArray22 != null) {
				@Pc(42) Class4_Sub13 local42 = new Class4_Sub13();
				local42.anObjectArray2 = local34.anObjectArray22;
				local42.aClass185_7 = local34;
				Static11.method519(local42, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!fh;Lclient!ke;IZLclient!fh;)V")
	public static void method1171(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class4_Sub3_Sub5_Sub2 arg1, @OriginalArg(4) Class58 arg2) {
		Static4.aClass58_75 = arg2;
		Static5.aClass58_81 = arg0;
		Static1.aBoolean200 = true;
		@Pc(11) int local11 = Static5.aClass58_81.method1351() - 1;
		Static5.anInt6072 = local11 * 256 + Static5.aClass58_81.method1371(local11);
		Static1.aClass4_Sub3_Sub5_Sub2_1 = arg1;
		Static6.aStringArray26 = new String[] { null, null, null, null, LocalisedText.DROP };
		Static6.aStringArray29 = new String[] { null, null, LocalisedText.TAKE, null, null };
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public static void method1172() {
		Static2.aClass26_12.method515();
		Static3.aClass26_27.method515();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)Z")
	public static boolean method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static1.aBoolean17) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static5.aClass185ArrayArray115[local13] == null || Static5.aClass185ArrayArray115[local13][local17] == null) {
			return false;
		}
		@Pc(37) Class185 local37 = Static5.aClass185ArrayArray115[local13][local17];
		if (arg1 == -1 && local37.anInt5911 == 0) {
			for (@Pc(110) int local110 = 0; local110 < Static7.anInt5634; local110++) {
				if (Static6.aShortArray100[local110] == 1 || Static6.aShortArray100[local110] == 1009 || Static6.aShortArray100[local110] == 34 || Static6.aShortArray100[local110] == 23 || Static6.aShortArray100[local110] == 3) {
					for (@Pc(148) Class185 local148 = Static19.method1813(Static6.anIntArray543[local110]); local148 != null; local148 = Static26.method2942(local148)) {
						if (local148.anInt5914 == local37.anInt5914) {
							return true;
						}
					}
				}
			}
		} else {
			for (@Pc(48) int local48 = 0; local48 < Static7.anInt5634; local48++) {
				if (Static2.anIntArray117[local48] == arg1 && local37.anInt5914 == Static6.anIntArray543[local48] && (Static6.aShortArray100[local48] == 1 || Static6.aShortArray100[local48] == 1009 || Static6.aShortArray100[local48] == 34 || Static6.aShortArray100[local48] == 23 || Static6.aShortArray100[local48] == 3)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIII)V")
	public static void method1200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 + arg5;
		@Pc(18) int local18 = arg2 - arg4;
		@Pc(22) int local22 = arg4 + arg1;
		for (@Pc(24) int local24 = arg5; local24 < local10; local24++) {
			Static18.method1656(Static5.anIntArrayArray36[local24], arg0, arg1, arg3);
		}
		for (@Pc(44) int local44 = arg2; local44 > local18; local44--) {
			Static18.method1656(Static5.anIntArrayArray36[local44], arg0, arg1, arg3);
		}
		@Pc(66) int local66 = arg3 - arg4;
		for (@Pc(68) int local68 = local10; local68 <= local18; local68++) {
			@Pc(79) int[] local79 = Static5.anIntArrayArray36[local68];
			Static18.method1656(local79, arg0, arg1, local22);
			Static18.method1656(local79, arg0, local66, arg3);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1201(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < Static6.anInt5214; local12++) {
			if (arg0.equalsIgnoreCase(Static4.aStringArray23[local12])) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLclient!gb;ZLclient!gb;IZ)I")
	public static int method1202(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class63_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class63_Sub1 arg4, @OriginalArg(5) int arg5) {
		@Pc(15) int local15 = Static35.method4366(arg2, arg0, arg4, arg1);
		if (local15 != 0) {
			return arg1 ? -local15 : local15;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static35.method4366(arg2, arg5, arg4, arg3);
			return arg3 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(B)V")
	public static void method1203() {
		Static5.aClass26_45.method515();
		Static7.aClass26_57.method515();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public static void method1205() {
		Static2.anInt1636 = 13;
		Static2.anInt1637 = 13;
		Static2.aClass56_Sub1_2 = new Class56_Sub1(Static2.anInt1636 * 128 + 2, Static2.anInt1637 * 128 + 2, 0);
		Static2.aClass103ArrayArray1 = new Class103[Static2.anInt1636][Static2.anInt1637];
		for (@Pc(32) int local32 = 0; local32 < Static2.anInt1636; local32++) {
			for (@Pc(37) int local37 = 0; local37 < Static2.anInt1637; local37++) {
				Static2.aClass103ArrayArray1[local32][local37] = new Class103();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([B[BIIIII)V")
	public static void method1206(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = -16; local1 < 0; local1++) {
			for (@Pc(5) int local5 = -4; local5 < 0; local5++) {
				@Pc(10) int local10 = arg3 + 1;
				arg0[arg3] = (byte) (arg0[arg3] + 1 - arg1[arg2]);
				@Pc(24) int local24 = arg2 + arg5;
				@Pc(26) int local26 = local10++;
				arg0[local26] = (byte) (arg0[local26] + 1 - arg1[local24]);
				local24 += arg5;
				local26 = local10++;
				arg0[local26] = (byte) (arg0[local26] + 1 - arg1[local24]);
				local24 += arg5;
				arg3 = local10 + 1;
				arg0[local10] = (byte) (arg0[local10] + 1 - arg1[local24]);
				arg2 = local24 + arg5;
			}
			arg3 += arg4;
			arg2 += arg6;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIZZIIIIII)V")
	public static void method1207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 && arg3 || (arg2 && arg0 == 1 || arg3 && arg0 == 0)) {
			return;
		}
		@Pc(19) int local19 = arg4 << 7;
		@Pc(29) int local29 = arg6 + arg7 + arg8 + arg9 >> 2;
		@Pc(33) int local33 = arg5 << 7;
		@Pc(43) int local43 = local19 - (local29 * Static4.anInt3366 >> 8) >> 3;
		@Pc(53) int local53 = local33 - (local29 * Static4.anInt3363 >> 8) >> 3;
		if (arg0 != 0 && arg0 != 1 && (arg2 || arg3)) {
			Static15.method1216(Static2.aClass56_Sub1Array2[arg0], Static2.aClass56_Sub1_2, local43 + 1, local53 + 1, arg1, arg2);
		} else {
			Static15.method1219(Static2.aClass56_Sub1Array2[1], Static2.aClass56_Sub1_2, local43 + 1, local53 + 1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([B[BIIIIII)V")
	public static void method1208(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			for (@Pc(16) int local16 = local4; local16 < 0; local16++) {
				@Pc(21) int local21 = arg3 + 1;
				@Pc(23) byte local23 = arg0[arg3];
				@Pc(26) int local26 = arg2 + 1;
				arg0[arg3] = (byte) (local23 + arg1[arg2]);
				@Pc(32) int local32 = local21++;
				arg0[local32] += arg1[local26++];
				local32 = local21++;
				arg0[local32] += arg1[local26++];
				arg3 = local21 + 1;
				local23 = arg0[local21];
				arg2 = local26 + 1;
				arg0[local21] = (byte) (local23 + arg1[local26]);
			}
			for (@Pc(70) int local70 = arg4; local70 < 0; local70++) {
				@Pc(74) int local74 = arg3++;
				arg0[local74] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "([B[BIIIIII)V")
	public static void method1209(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			for (@Pc(16) int local16 = local4; local16 < 0; local16++) {
				@Pc(21) int local21 = arg3 + 1;
				@Pc(23) byte local23 = arg0[arg3];
				@Pc(26) int local26 = arg2 + 1;
				arg0[arg3] = (byte) (local23 - arg1[arg2]);
				@Pc(32) int local32 = local21++;
				arg0[local32] -= arg1[local26++];
				local32 = local21++;
				arg0[local32] -= arg1[local26++];
				arg3 = local21 + 1;
				local23 = arg0[local21];
				arg2 = local26 + 1;
				arg0[local21] = (byte) (local23 - arg1[local26]);
			}
			for (@Pc(70) int local70 = arg4; local70 < 0; local70++) {
				@Pc(74) int local74 = arg3++;
				arg0[local74] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!fe;III)V")
	public static void method1210(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != null) {
			@Pc(12) int local12 = arg1 - (arg2 * Static4.anInt3366 >> 8) >> 3;
			@Pc(22) int local22 = arg3 - (arg2 * Static4.anInt3363 >> 8) >> 3;
			Static15.method1218(arg0, Static2.aClass56_Sub1_2, local12 + 1, local22 + 1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	public static void method1211() {
		Static2.aClass56_Sub1_2 = null;
		Static2.aClass56_Sub1Array2 = null;
		Static2.aClass103ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lclient!fe;III)V")
	public static void method1212(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != null) {
			@Pc(12) int local12 = arg1 - (arg2 * Static4.anInt3366 >> 8) >> 3;
			@Pc(22) int local22 = arg3 - (arg2 * Static4.anInt3363 >> 8) >> 3;
			Static15.method1219(arg0, Static2.aClass56_Sub1_2, local12 + 1, local22 + 1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(Lclient!fe;III)Z")
	public static boolean method1214(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return false;
		} else {
			@Pc(13) int local13 = arg1 - (arg2 * Static4.anInt3366 >> 8) >> 3;
			@Pc(23) int local23 = arg3 - (arg2 * Static4.anInt3363 >> 8) >> 3;
			return Static15.method1217(arg0, Static2.aClass56_Sub1_2, local13 + 1, local23 + 1);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII[[Z[[I)V")
	public static void method1215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) int[][] arg5) {
		@Pc(1) GL local1 = Static3.aGL1;
		Static17.method1597(1);
		Static17.method1607(1);
		Static16.method1595();
		Static17.method1610(false);
		Static24.method2652(0, 0);
		local1.glDepthMask(false);
		for (@Pc(17) int local17 = 0; local17 < Static2.anInt1636; local17++) {
			label52:
			for (@Pc(22) int local22 = 0; local22 < Static2.anInt1637; local22++) {
				for (@Pc(29) int local29 = local17 * 8; local29 < local17 * 8 + 8; local29++) {
					if (local29 - arg0 >= -arg2 && local29 - arg0 <= arg2) {
						for (@Pc(51) int local51 = local22 * 8; local51 < local22 * 8 + 8; local51++) {
							if (local51 - arg1 >= -arg2 && local51 - arg1 <= arg2 && arg4[local29 + arg2 - arg0][local51 + arg2 - arg1]) {
								@Pc(89) Class103 local89 = Static2.aClass103ArrayArray1[local17][local22];
								if (local89.aBoolean197) {
									local89.method2236(Static2.aClass56_Sub1_2, local17, local22);
									local89.aBoolean197 = false;
								}
								local1.glPushMatrix();
								local1.glTranslatef((float) (local17 * 1024), 0.0F, (float) (local22 * 1024));
								local89.method2237();
								local1.glPopMatrix();
								continue label52;
							}
						}
					}
				}
			}
		}
		local1.glEnableClientState(GL.GL_COLOR_ARRAY);
		local1.glDepthMask(true);
		Static17.method1618();
	}
}

import java.io.IOException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public static void method1994(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub3_Sub9 local6 = Static12.method2322(8, arg0);
		local6.method1519();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(CZ)Z")
	public static boolean method1996(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)I")
	public static int method1997() {
		if ((double) Static3.aFloat69 == 3.0D) {
			return 37;
		} else if ((double) Static3.aFloat69 == 4.0D) {
			return 50;
		} else if ((double) Static3.aFloat69 == 6.0D) {
			return 75;
		} else if ((double) Static3.aFloat69 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIIIIZ)V")
	public static void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (@Pc(12) int local12 = 0; local12 < 104; local12++) {
				Static7.anIntArrayArray48[local7][local12] = 0;
				Static1.anIntArrayArray9[local7][local12] = 99999999;
			}
		}
		Static7.anIntArrayArray48[arg2][arg4] = 99;
		Static1.anIntArrayArray9[arg2][arg4] = 0;
		@Pc(51) int local51 = arg2;
		@Pc(53) int local53 = arg4;
		@Pc(55) byte local55 = 0;
		Static6.anIntArray479[0] = arg2;
		@Pc(62) int local62 = local55 + 1;
		Static4.anIntArray653[0] = arg4;
		@Pc(66) int local66 = 0;
		@Pc(68) boolean local68 = false;
		@Pc(73) int[][] local73 = Static7.aClass30Array1[Static7.anInt5334].anIntArrayArray6;
		label322:
		while (local66 != local62) {
			local53 = Static4.anIntArray653[local66];
			local51 = Static6.anIntArray479[local66];
			local66 = local66 + 1 & 0xFFF;
			if (local51 == arg1 && local53 == arg6) {
				local68 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static7.aClass30Array1[Static7.anInt5334].method574(arg6, arg9, local53, local51, arg1, arg8, arg0 - 1)) {
					local68 = true;
					break;
				}
				if (arg0 < 10 && Static7.aClass30Array1[Static7.anInt5334].method577(arg1, local51, arg6, local53, arg0 - 1, arg9, arg8)) {
					local68 = true;
					break;
				}
			}
			if (arg3 != 0 && arg5 != 0 && Static7.aClass30Array1[Static7.anInt5334].method570(local53, arg7, arg8, arg6, arg1, arg5, arg3, local51)) {
				local68 = true;
				break;
			}
			@Pc(200) int local200 = Static1.anIntArrayArray9[local51][local53] + 1;
			if (local51 > 0 && Static7.anIntArrayArray48[local51 - 1][local53] == 0 && (local73[local51 - 1][local53] & 0x2C010E) == 0 && (local73[local51 - 1][arg8 + local53 - 1] & 0x2C0138) == 0) {
				@Pc(244) int local244 = 1;
				while (true) {
					if (arg8 - 1 <= local244) {
						Static6.anIntArray479[local62] = local51 - 1;
						Static4.anIntArray653[local62] = local53;
						Static7.anIntArrayArray48[local51 - 1][local53] = 2;
						Static1.anIntArrayArray9[local51 - 1][local53] = local200;
						local62 = local62 + 1 & 0xFFF;
						break;
					}
					if ((local73[local51 - 1][local244 + local53] & 0x2C013E) != 0) {
						break;
					}
					local244++;
				}
			}
			if (local51 < 102 && Static7.anIntArrayArray48[local51 + 1][local53] == 0 && (local73[local51 + arg8][local53] & 0x2C0183) == 0 && (local73[local51 + arg8][local53 + arg8 - 1] & 0x2C01E0) == 0) {
				@Pc(351) int local351 = 1;
				while (true) {
					if (arg8 - 1 <= local351) {
						Static6.anIntArray479[local62] = local51 + 1;
						Static4.anIntArray653[local62] = local53;
						local62 = local62 + 1 & 0xFFF;
						Static7.anIntArrayArray48[local51 + 1][local53] = 8;
						Static1.anIntArrayArray9[local51 + 1][local53] = local200;
						break;
					}
					if ((local73[arg8 + local51][local53 + local351] & 0x2C01E3) != 0) {
						break;
					}
					local351++;
				}
			}
			if (local53 > 0 && Static7.anIntArrayArray48[local51][local53 - 1] == 0 && (local73[local51][local53 - 1] & 0x2C010E) == 0 && (local73[arg8 + local51 - 1][local53 - 1] & 0x2C0183) == 0) {
				@Pc(456) int local456 = 1;
				while (true) {
					if (local456 >= arg8 - 1) {
						Static6.anIntArray479[local62] = local51;
						Static4.anIntArray653[local62] = local53 - 1;
						Static7.anIntArrayArray48[local51][local53 - 1] = 1;
						local62 = local62 + 1 & 0xFFF;
						Static1.anIntArrayArray9[local51][local53 - 1] = local200;
						break;
					}
					if ((local73[local456 + local51][local53 - 1] & 0x2C018F) != 0) {
						break;
					}
					local456++;
				}
			}
			if (local53 < 102 && Static7.anIntArrayArray48[local51][local53 + 1] == 0 && (local73[local51][local53 + arg8] & 0x2C0138) == 0 && (local73[local51 + arg8 - 1][arg8 + local53] & 0x2C01E0) == 0) {
				@Pc(561) int local561 = 1;
				while (true) {
					if (local561 >= arg8 - 1) {
						Static6.anIntArray479[local62] = local51;
						Static4.anIntArray653[local62] = local53 + 1;
						Static7.anIntArrayArray48[local51][local53 + 1] = 4;
						Static1.anIntArrayArray9[local51][local53 + 1] = local200;
						local62 = local62 + 1 & 0xFFF;
						break;
					}
					if ((local73[local51 + local561][arg8 + local53] & 0x2C01F8) != 0) {
						break;
					}
					local561++;
				}
			}
			if (local51 > 0 && local53 > 0 && Static7.anIntArrayArray48[local51 - 1][local53 - 1] == 0 && (local73[local51 - 1][local53 - 1] & 0x2C010E) == 0) {
				@Pc(655) int local655 = 1;
				while (true) {
					if (arg8 <= local655) {
						Static6.anIntArray479[local62] = local51 - 1;
						Static4.anIntArray653[local62] = local53 - 1;
						Static7.anIntArrayArray48[local51 - 1][local53 - 1] = 3;
						local62 = local62 + 1 & 0xFFF;
						Static1.anIntArrayArray9[local51 - 1][local53 - 1] = local200;
						break;
					}
					if ((local73[local51 - 1][local53 + local655 - 1] & 0x2C013E) != 0 || (local73[local655 + local51 - 1][local53 - 1] & 0x2C018F) != 0) {
						break;
					}
					local655++;
				}
			}
			if (local51 < 102 && local53 > 0 && Static7.anIntArrayArray48[local51 + 1][local53 - 1] == 0 && (local73[local51 + arg8][local53 - 1] & 0x2C0183) == 0) {
				@Pc(767) int local767 = 1;
				while (true) {
					if (arg8 <= local767) {
						Static6.anIntArray479[local62] = local51 + 1;
						Static4.anIntArray653[local62] = local53 - 1;
						local62 = local62 + 1 & 0xFFF;
						Static7.anIntArrayArray48[local51 + 1][local53 - 1] = 9;
						Static1.anIntArrayArray9[local51 + 1][local53 - 1] = local200;
						break;
					}
					if ((local73[local51 + arg8][local53 + local767 - 1] & 0x2C01E3) != 0 || (local73[local767 + local51][local53 - 1] & 0x2C018F) != 0) {
						break;
					}
					local767++;
				}
			}
			if (local51 > 0 && local53 < 102 && Static7.anIntArrayArray48[local51 - 1][local53 + 1] == 0 && (local73[local51 - 1][arg8 + local53] & 0x2C0138) == 0) {
				@Pc(877) int local877 = 1;
				while (true) {
					if (arg8 <= local877) {
						Static6.anIntArray479[local62] = local51 - 1;
						Static4.anIntArray653[local62] = local53 + 1;
						Static7.anIntArrayArray48[local51 - 1][local53 + 1] = 6;
						local62 = local62 + 1 & 0xFFF;
						Static1.anIntArrayArray9[local51 - 1][local53 + 1] = local200;
						break;
					}
					if ((local73[local51 - 1][local53 + local877] & 0x2C013E) != 0 || (local73[local51 + local877 - 1][local53 + arg8] & 0x2C01F8) != 0) {
						break;
					}
					local877++;
				}
			}
			if (local51 < 102 && local53 < 102 && Static7.anIntArrayArray48[local51 + 1][local53 + 1] == 0 && (local73[arg8 + local51][arg8 + local53] & 0x2C01E0) == 0) {
				for (@Pc(990) int local990 = 1; local990 < arg8; local990++) {
					if ((local73[local51 + local990][arg8 + local53] & 0x2C01F8) != 0 || (local73[local51 + arg8][local53 + local990] & 0x2C01E3) != 0) {
						continue label322;
					}
				}
				Static6.anIntArray479[local62] = local51 + 1;
				Static4.anIntArray653[local62] = local53 + 1;
				Static7.anIntArrayArray48[local51 + 1][local53 + 1] = 12;
				local62 = local62 + 1 & 0xFFF;
				Static1.anIntArrayArray9[local51 + 1][local53 + 1] = local200;
			}
		}
		if (!local68) {
			@Pc(1081) int local1081 = 1000;
			@Pc(1083) int local1083 = 100;
			for (@Pc(1090) int local1090 = arg1 - 10; local1090 <= arg1 + 10; local1090++) {
				for (@Pc(1100) int local1100 = arg6 - 10; local1100 <= arg6 + 10; local1100++) {
					if (local1090 >= 0 && local1100 >= 0 && local1090 < 104 && local1100 < 104 && Static1.anIntArrayArray9[local1090][local1100] < 100) {
						@Pc(1129) int local1129 = 0;
						if (arg1 > local1090) {
							local1129 = arg1 - local1090;
						} else if (arg3 + arg1 - 1 < local1090) {
							local1129 = local1090 + 1 - arg1 - arg3;
						}
						@Pc(1164) int local1164 = 0;
						if (local1100 < arg6) {
							local1164 = arg6 - local1100;
						} else if (local1100 > arg6 + arg5 - 1) {
							local1164 = local1100 + 1 - arg6 - arg5;
						}
						@Pc(1208) int local1208 = local1129 * local1129 + local1164 * local1164;
						if (local1208 < local1081 || local1208 == local1081 && local1083 > Static1.anIntArrayArray9[local1090][local1100]) {
							local51 = local1090;
							local1081 = local1208;
							local53 = local1100;
							local1083 = Static1.anIntArrayArray9[local1090][local1100];
						}
					}
				}
			}
			if (local1081 == 1000) {
				return;
			}
			if (arg2 == local51 && arg4 == local53) {
				return;
			}
		}
		Static3.aBoolean147 = false;
		Static3.anInt2140 = local53;
		Static6.anInt4506 = local51;
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)[Lclient!uj;")
	public static Sprite[] method2000() {
		@Pc(4) Sprite[] local4 = new Sprite[Static4.anInt2748];
		for (@Pc(18) int local18 = 0; local18 < Static4.anInt2748; local18++) {
			@Pc(29) byte[] local29 = Static6.aByteArrayArray36[local18];
			@Pc(37) int local37 = Static3.anIntArray185[local18] * Static7.anIntArray643[local18];
			@Pc(40) int[] local40 = new int[local37];
			for (@Pc(42) int local42 = 0; local42 < local37; local42++) {
				local40[local42] = Static2.anIntArray85[local29[local42] & 0xFF];
			}
			if (GlRenderer.enabled) {
				local4[local18] = new GlSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[local18], Static5.anIntArray391[local18], Static3.anIntArray185[local18], Static7.anIntArray643[local18], local40);
			} else {
				local4[local18] = new SoftwareSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[local18], Static5.anIntArray391[local18], Static3.anIntArray185[local18], Static7.anIntArray643[local18], local40);
			}
		}
		Static37.method4670();
		return local4;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method2001() {
		Static3.aClass4_Sub10_Sub1_1.writeOpcode(86);
		Static3.aClass4_Sub10_Sub1_1.writeByte(Static11.method557());
		Static3.aClass4_Sub10_Sub1_1.writeShort(GameShell.canvasWidth);
		Static3.aClass4_Sub10_Sub1_1.writeShort(GameShell.canvasHeight);
		Static3.aClass4_Sub10_Sub1_1.writeByte(Static2.anInt1125);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Lclient!vn;")
	public static SoftwareSprite method2002() {
		@Pc(9) byte[] local9 = Static6.aByteArrayArray36[0];
		@Pc(28) int local28 = Static3.anIntArray185[0] * Static7.anIntArray643[0];
		@Pc(31) int[] local31 = new int[local28];
		for (@Pc(33) int local33 = 0; local33 < local28; local33++) {
			local31[local33] = Static2.anIntArray85[local9[local33] & 0xFF];
		}
		@Pc(68) SoftwareSprite local68 = new SoftwareSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[0], Static5.anIntArray391[0], Static3.anIntArray185[0], Static7.anIntArray643[0], local31);
		Static37.method4670();
		return local68;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (@Pc(110) int local110 = arg1; local110 <= arg2; local110++) {
				for (@Pc(115) int local115 = arg3; local115 <= arg4; local115++) {
					if (Static2.anIntArrayArrayArray3[arg0][local110][local115] == -Static2.anInt1871) {
						return false;
					}
				}
			}
			@Pc(140) int local140 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static6.anIntArrayArrayArray13[arg0][arg1][arg3] + arg5;
			if (!Static33.method4119(local140, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static33.method4119(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static33.method4119(local140, local156, local182)) {
				return false;
			} else if (Static33.method4119(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static11.method508(arg0, arg1, arg3)) {
			@Pc(16) int local16 = arg1 << 7;
			@Pc(20) int local20 = arg3 << 7;
			return Static33.method4119(local16 + 1, Static6.anIntArrayArrayArray13[arg0][arg1][arg3] + arg5, local20 + 1) && Static33.method4119(local16 + 128 - 1, Static6.anIntArrayArrayArray13[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static33.method4119(local16 + 128 - 1, Static6.anIntArrayArrayArray13[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static33.method4119(local16 + 1, Static6.anIntArrayArrayArray13[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Lclient!li;")
	public static Class110 method2004(@OriginalArg(1) int arg0) {
		@Pc(10) Class110 local10 = (Class110) Static5.aClass26_45.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static6.aClass58_89.fetchFile(Static28.method3257(arg0), Static19.method1848(arg0));
		@Pc(29) Class110 local29 = new Class110();
		local29.anInt3138 = arg0;
		if (local25 != null) {
			local29.method2568(new Buffer(local25));
		}
		Static5.aClass26_45.put((long) arg0, local29);
		return local29;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method2005(@OriginalArg(1) Js5 arg0) {
		Static2.aClass56_Sub1Array1 = Static38.method4790(arg0, Static4.anInt3250);
		Static3.anIntArray196 = new int[256];
		for (@Pc(15) int local15 = 0; local15 < 3; local15++) {
			@Pc(27) float local27 = (float) (Static7.anIntArray679[local15] >> 16 & 0xFF);
			@Pc(37) int local37 = Static7.anIntArray679[local15 + 1] >> 16 & 0xFF;
			@Pc(44) float local44 = ((float) local37 - local27) / 64.0F;
			@Pc(53) float local53 = (float) (Static7.anIntArray679[local15] >> 8 & 0xFF);
			@Pc(60) float local60 = (float) (Static7.anIntArray679[local15] & 0xFF);
			@Pc(70) int local70 = Static7.anIntArray679[local15 + 1] >> 8 & 0xFF;
			@Pc(77) float local77 = ((float) local70 - local53) / 64.0F;
			@Pc(85) int local85 = Static7.anIntArray679[local15 + 1] & 0xFF;
			@Pc(92) float local92 = ((float) local85 - local60) / 64.0F;
			for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
				Static3.anIntArray196[local94 + local15 * 64] = (int) local27 << 16 | (int) local53 << 8 | (int) local60;
				local53 += local77;
				local27 += local44;
				local60 += local92;
			}
		}
		for (@Pc(138) int local138 = 192; local138 < 255; local138++) {
			Static3.anIntArray196[local138] = Static7.anIntArray679[3];
		}
		Static2.anIntArray159 = new int[32768];
		Static6.anIntArray544 = new int[32768];
		Static22.method2284(null);
		Static6.anIntArray541 = new int[32768];
		Static2.anIntArray100 = new int[32768];
		Static4.aClass4_Sub3_Sub14_Sub1_4 = new SoftwareSprite(128, 254);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method2007() {
		if (Static6.aBoolean330) {
			return;
		}
		Static5.aBoolean248 = true;
		if (Preferences.aBoolean293) {
			Static5.aFloat147 = (int) Static5.aFloat147 + 47 & 0xFFFFFFF0;
		} else {
			Static1.aFloat20 += (12.0F - Static1.aFloat20) / 2.0F;
		}
		Static6.aBoolean330 = true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLclient!wf;I)V")
	public static void method2008(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		if (Static7.anInt5634 < 2 && Static2.anInt1334 == 0 && !Static3.aBoolean177) {
			return;
		}
		@Pc(26) String local26 = Static35.method4328();
		if (arg1 == null) {
			@Pc(43) int local43 = Static5.aClass4_Sub3_Sub5_3.method2263(local26, arg0 + 4, arg2 + 15, Static5.aRandom1, Static2.anInt1976);
			Static8.method66(local43 + Static5.aClass4_Sub3_Sub5_3.method2252(local26), 15, arg0 + 4, arg2);
			return;
		}
		@Pc(62) Class4_Sub3_Sub5 local62 = arg1.method4734(Static3.aClass56Array3);
		if (local62 == null) {
			local62 = Static5.aClass4_Sub3_Sub5_3;
		}
		local62.method2269(local26, arg0, arg2, arg1.anInt5893, arg1.anInt5949, arg1.anInt5933, arg1.anInt5934, arg1.anInt5924, arg1.anInt5922, Static5.aRandom1, Static2.anInt1976, Static7.anIntArray600);
		Static8.method66(Static7.anIntArray600[2], Static7.anIntArray600[3], Static7.anIntArray600[0], Static7.anIntArray600[1]);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
	public static void method2009(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (GlRenderer.enabled && arg0) {
			local11 = 1;
			local13 = Static7.aByteArrayArray49;
		} else {
			local11 = 4;
			local13 = Static1.aByteArrayArray4;
		}
		@Pc(22) int local22 = local13.length;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(33) int[] local33 = null;
			@Pc(39) int local39 = Static7.anIntArray597[local24] >> 8;
			@Pc(43) byte[] local43 = local13[local24];
			@Pc(49) int local49 = Static7.anIntArray597[local24] & 0xFF;
			@Pc(56) int local56 = local39 * 64 - Static5.anInt3983;
			@Pc(63) int local63 = local49 * 64 - Static7.anInt5479;
			if (local43 != null) {
				Static9.method763();
				local33 = Static34.method4248(arg0, Static7.aClass30Array1, Static7.anInt5479, local63, local56, Static5.anInt3983, local43);
			}
			if (!arg0 && Static4.anInt3360 / 8 == local39 && local49 == Static1.anInt5 / 8) {
				if (local33 == null) {
					Static6.anInt4863 = -1;
				} else {
					Static6.anInt4863 = local33[0];
					Static5.anInt4303 = local33[3];
					Static1.anInt466 = local33[2];
					Static4.anInt5826 = local33[1];
					Static5.anInt3774 = local33[4];
				}
			}
		}
		for (@Pc(131) int local131 = 0; local131 < local22; local131++) {
			@Pc(144) int local144 = (Static7.anIntArray597[local131] & 0xFF) * 64 - Static7.anInt5479;
			@Pc(154) int local154 = (Static7.anIntArray597[local131] >> 8) * 64 - Static5.anInt3983;
			@Pc(158) byte[] local158 = local13[local131];
			if (local158 == null && Static1.anInt5 < 800) {
				Static9.method763();
				for (@Pc(169) int local169 = 0; local169 < local11; local169++) {
					Static29.method3536(local154, local169, 64, local144, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII)V")
	public static void method3284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class184 local3 = new Class184();
		local3.anInt5867 = arg1 / 128;
		local3.anInt5858 = arg2 / 128;
		local3.anInt5876 = arg3 / 128;
		local3.anInt5870 = arg4 / 128;
		local3.anInt5866 = arg0;
		local3.anInt5862 = arg1;
		local3.anInt5877 = arg2;
		local3.anInt5860 = arg3;
		local3.anInt5879 = arg4;
		local3.anInt5872 = arg5;
		local3.anInt5881 = arg6;
		Static7.aClass184Array13[Static2.anInt1742++] = local3;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
	public static boolean method3287() throws IOException {
		if (Static3.aClass52_7 == null) {
			return false;
		}
		@Pc(15) int local15 = Static3.aClass52_7.available();
		if (local15 == 0) {
			return false;
		}
		if (Static1.anInt552 == -1) {
			Static3.aClass52_7.read(Static5.aClass4_Sub10_Sub1_2.bytes, 0, 1);
			Static5.aClass4_Sub10_Sub1_2.position = 0;
			local15--;
			Static1.anInt552 = Static5.aClass4_Sub10_Sub1_2.readOpcode();
			Static1.anInt1052 = Static4.anIntArray242[Static1.anInt552];
		}
		if (Static1.anInt1052 == -1) {
			if (local15 <= 0) {
				return false;
			}
			local15--;
			Static3.aClass52_7.read(Static5.aClass4_Sub10_Sub1_2.bytes, 0, 1);
			Static1.anInt1052 = Static5.aClass4_Sub10_Sub1_2.bytes[0] & 0xFF;
		}
		if (Static1.anInt1052 == -2) {
			if (local15 <= 1) {
				return false;
			}
			local15 -= 2;
			Static3.aClass52_7.read(Static5.aClass4_Sub10_Sub1_2.bytes, 0, 2);
			Static5.aClass4_Sub10_Sub1_2.position = 0;
			Static1.anInt1052 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
		}
		if (Static1.anInt1052 > local15) {
			return false;
		}
		Static5.aClass4_Sub10_Sub1_2.position = 0;
		Static3.aClass52_7.read(Static5.aClass4_Sub10_Sub1_2.bytes, 0, Static1.anInt1052);
		Static2.anInt1231 = Static3.anInt2273;
		Static3.anInt2273 = Static4.anInt3335;
		Static3.anInt2583 = 0;
		Static4.anInt3335 = Static1.anInt552;
		if (Static1.anInt552 == 163) {
			for (@Pc(130) int local130 = 0; local130 < Static1.anIntArray2.length; local130++) {
				if (Static1.anIntArray2[local130] != Static1.anIntArray62[local130]) {
					Static1.anIntArray2[local130] = Static1.anIntArray62[local130];
					Static29.method3534(local130);
					Static3.anIntArray225[Static1.anInt788++ & 0x1F] = local130;
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 34) {
			@Pc(180) int local180 = Static5.aClass4_Sub10_Sub1_2.readInt();
			@Pc(184) int local184 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(193) Component local193;
			if (local180 >= 0) {
				local193 = InterfaceList.getComponent(local180);
			} else {
				local193 = null;
			}
			if (local180 < -70000) {
				local184 += 32768;
			}
			while (Static5.aClass4_Sub10_Sub1_2.position < Static1.anInt1052) {
				@Pc(213) int local213 = 0;
				@Pc(217) int local217 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortSmart();
				@Pc(221) int local221 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
				if (local221 != 0) {
					local213 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
					if (local213 == 255) {
						local213 = Static5.aClass4_Sub10_Sub1_2.readInt();
					}
				}
				if (local193 != null && local217 >= 0 && local193.anIntArray660.length > local217) {
					local193.anIntArray660[local217] = local221;
					local193.anIntArray661[local217] = local213;
				}
				Inv.set(local184, local217, local221 - 1, local213);
			}
			if (local193 != null) {
				Static28.method3270(local193);
			}
			method2062();
			Static7.anIntArray656[Static2.anInt959++ & 0x1F] = local184 & 0x7FFF;
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 53) {
			Static1.anInt818 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteS();
			Static1.anInt894 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteA();
			while (Static1.anInt1052 > Static5.aClass4_Sub10_Sub1_2.position) {
				Static1.anInt552 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
				Static38.method4789();
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 192) {
			Static19.method1818();
			Static1.anInt552 = -1;
			return false;
		} else if (Static1.anInt552 == 176) {
			@Pc(356) int local356 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(360) int local360 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(364) byte local364 = Static5.aClass4_Sub10_Sub1_2.readByteC();
			if (Static35.method4381(local356)) {
				Static10.method397(local360, local364);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 4) {
			Static7.anInt5497 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			Static3.anInt2102 = Static6.anInt4979;
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 35) {
			@Pc(401) int local401 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteC();
			@Pc(405) int local405 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(409) int local409 = Static5.aClass4_Sub10_Sub1_2.readIntLE();
			@Pc(413) int local413 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			if (Static35.method4381(local405)) {
				@Pc(425) Class4_Sub27 local425 = (Class4_Sub27) Static4.aClass84_13.get((long) local409);
				if (local425 != null) {
					Static28.method3246(local413 != local425.anInt4620, local425);
				}
				Static10.method318(local413, local401, local409);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 59) {
			@Pc(462) String local462 = Static5.aClass4_Sub10_Sub1_2.readString();
			if (local462.endsWith(":tradereq:")) {
				@Pc(912) String local912 = local462.substring(0, local462.indexOf(":"));
				@Pc(914) boolean local914 = false;
				@Pc(918) long local918 = Base37.encode(local912);
				for (@Pc(920) int local920 = 0; local920 < Static6.anInt4516; local920++) {
					if (Static3.aLongArray16[local920] == local918) {
						local914 = true;
						break;
					}
				}
				if (!local914 && Static3.anInt5405 == 0) {
					Static26.method4357(local912, 4, LocalisedText.TRADEREQ);
				}
			} else if (local462.endsWith(":chalreq:")) {
				@Pc(851) String local851 = local462.substring(0, local462.indexOf(":"));
				@Pc(853) boolean local853 = false;
				@Pc(859) long local859 = Base37.encode(local851);
				for (@Pc(861) int local861 = 0; local861 < Static6.anInt4516; local861++) {
					if (Static3.aLongArray16[local861] == local859) {
						local853 = true;
						break;
					}
				}
				if (!local853 && Static3.anInt5405 == 0) {
					@Pc(898) String local898 = local462.substring(local462.indexOf(":") + 1, local462.length() - 9);
					Static26.method4357(local851, 8, local898);
				}
			} else if (local462.endsWith(":assistreq:")) {
				@Pc(481) String local481 = local462.substring(0, local462.indexOf(":"));
				@Pc(485) long local485 = Base37.encode(local481);
				@Pc(487) boolean local487 = false;
				for (@Pc(489) int local489 = 0; local489 < Static6.anInt4516; local489++) {
					if (local485 == Static3.aLongArray16[local489]) {
						local487 = true;
						break;
					}
				}
				if (!local487 && Static3.anInt5405 == 0) {
					Static26.method4357(local481, 10, "");
				}
			} else if (local462.endsWith(":clan:")) {
				@Pc(837) String local837 = local462.substring(0, local462.indexOf(":clan:"));
				Static26.method4357("", 11, local837);
			} else if (local462.endsWith(":trade:")) {
				@Pc(818) String local818 = local462.substring(0, local462.indexOf(":trade:"));
				if (Static3.anInt5405 == 0) {
					Static26.method4357("", 12, local818);
				}
			} else if (local462.endsWith(":assist:")) {
				@Pc(542) String local542 = local462.substring(0, local462.indexOf(":assist:"));
				if (Static3.anInt5405 == 0) {
					Static26.method4357("", 13, local542);
				}
			} else if (local462.endsWith(":duelstake:")) {
				@Pc(767) String local767 = local462.substring(0, local462.indexOf(":"));
				@Pc(773) long local773 = Base37.encode(local767);
				@Pc(775) boolean local775 = false;
				for (@Pc(777) int local777 = 0; local777 < Static6.anInt4516; local777++) {
					if (Static3.aLongArray16[local777] == local773) {
						local775 = true;
						break;
					}
				}
				if (!local775 && Static3.anInt5405 == 0) {
					Static26.method4357(local767, 14, "");
				}
			} else if (local462.endsWith(":duelfriend:")) {
				@Pc(715) String local715 = local462.substring(0, local462.indexOf(":"));
				@Pc(717) boolean local717 = false;
				@Pc(721) long local721 = Base37.encode(local715);
				for (@Pc(723) int local723 = 0; local723 < Static6.anInt4516; local723++) {
					if (local721 == Static3.aLongArray16[local723]) {
						local717 = true;
						break;
					}
				}
				if (!local717 && Static3.anInt5405 == 0) {
					Static26.method4357(local715, 15, "");
				}
			} else if (local462.endsWith(":clanreq:")) {
				@Pc(667) String local667 = local462.substring(0, local462.indexOf(":"));
				@Pc(671) long local671 = Base37.encode(local667);
				@Pc(673) boolean local673 = false;
				for (@Pc(675) int local675 = 0; local675 < Static6.anInt4516; local675++) {
					if (local671 == Static3.aLongArray16[local675]) {
						local673 = true;
						break;
					}
				}
				if (!local673 && Static3.anInt5405 == 0) {
					Static26.method4357(local667, 16, "");
				}
			} else if (local462.endsWith(":allyreq:")) {
				@Pc(578) String local578 = local462.substring(0, local462.indexOf(":"));
				@Pc(584) long local584 = Base37.encode(local578);
				@Pc(586) boolean local586 = false;
				for (@Pc(588) int local588 = 0; local588 < Static6.anInt4516; local588++) {
					if (local584 == Static3.aLongArray16[local588]) {
						local586 = true;
						break;
					}
				}
				if (!local586 && Static3.anInt5405 == 0) {
					@Pc(621) String local621 = local462.substring(local462.indexOf(":") + 1, local462.length() - 9);
					Static26.method4357(local578, 21, local621);
				}
			} else if (local462.endsWith(":spam:")) {
				@Pc(647) String local647 = local462.substring(0, local462.length() - 6);
				if (Static3.anInt5405 == 0) {
					Static26.method4357("", 22, local647);
				}
			} else {
				Static26.method4357("", 0, local462);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 162) {
			@Pc(967) int local967 = Static5.aClass4_Sub10_Sub1_2.readInt();
			@Pc(973) int local973 = Static5.aClass4_Sub10_Sub1_2.readInt();
			@Pc(977) int local977 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(981) int local981 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			if (local977 == 65535) {
				local977 = -1;
			}
			if (local981 == 65535) {
				local981 = -1;
			}
			@Pc(996) int local996 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			if (Static35.method4381(local996)) {
				for (@Pc(1003) int local1003 = local981; local1003 <= local977; local1003++) {
					@Pc(1015) long local1015 = ((long) local973 << 32) + (long) local1003;
					@Pc(1021) Class4_Sub21 local1021 = (Class4_Sub21) Static2.aClass84_5.get(local1015);
					@Pc(1037) Class4_Sub21 local1037;
					if (local1021 != null) {
						local1037 = new Class4_Sub21(local967, local1021.anInt3939);
						local1021.unlink();
					} else if (local1003 == -1) {
						local1037 = new Class4_Sub21(local967, InterfaceList.getComponent(local973).aClass4_Sub21_2.anInt3939);
					} else {
						local1037 = new Class4_Sub21(local967, -1);
					}
					Static2.aClass84_5.put(local1015, local1037);
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 1) {
			@Pc(1079) int local1079 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			@Pc(1085) String local1085 = Static5.aClass4_Sub10_Sub1_2.readString();
			@Pc(1089) int local1089 = Static5.aClass4_Sub10_Sub1_2.readIntAlt3Reverse();
			if (Static35.method4381(local1079)) {
				method2079(local1089, local1085);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 11) {
			@Pc(1114) int local1114 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			@Pc(1118) int local1118 = Static5.aClass4_Sub10_Sub1_2.readIntAlt3();
			@Pc(1122) int local1122 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			if (Static35.method4381(local1114)) {
				Static19.method1773(local1122, local1118);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 148) {
			@Pc(1144) int local1144 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(1148) int local1148 = Static5.aClass4_Sub10_Sub1_2.readIntLE();
			@Pc(1152) int local1152 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			if (Static35.method4381(local1152)) {
				Static10.method397(local1144, local1148);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 95) {
			method2062();
			Static3.anInt2048 = Static5.aClass4_Sub10_Sub1_2.readShort();
			Static1.anInt925 = Static6.anInt4979;
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 164) {
			method2062();
			@Pc(1190) int local1190 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(1194) int local1194 = Static5.aClass4_Sub10_Sub1_2.readIntAlt3Reverse();
			@Pc(1198) int local1198 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			Static7.anIntArray637[local1198] = local1194;
			Static7.anIntArray501[local1198] = local1190;
			Static7.anIntArray599[local1198] = 1;
			for (@Pc(1212) int local1212 = 0; local1212 < 98; local1212++) {
				if (local1194 >= Class65.anIntArray165[local1212]) {
					Static7.anIntArray599[local1198] = local1212 + 2;
				}
			}
			Static4.anIntArray336[Static5.anInt4210++ & 0x1F] = local1198;
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 8) {
			method2062();
			Static2.anInt2248 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			Static1.anInt925 = Static6.anInt4979;
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 86) {
			Static30.method419(Static5.aClass4_Sub10_Sub1_2.readString());
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 87) {
			@Pc(1285) int local1285 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(1289) int local1289 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			if (local1289 == 65535) {
				local1289 = -1;
			}
			@Pc(1300) int local1300 = Static5.aClass4_Sub10_Sub1_2.readIntLE();
			if (Static35.method4381(local1285)) {
				Static29.method3471(1, -1, local1300, local1289);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 49) {
			Static33.method4089(false);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 138) {
			@Pc(1336) int local1336 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(1340) int local1340 = Static5.aClass4_Sub10_Sub1_2.readIntAlt3();
			Static30.method3550(local1340, local1336);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 96) {
			if (Static3.anInt5398 != -1) {
				Static28.method3277(Static3.anInt5398, 0);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 97) {
			Static1.anInt818 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteS();
			Static1.anInt894 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteA();
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 25) {
			Static34.method4269();
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 126) {
			@Pc(1403) String local1403 = Static5.aClass4_Sub10_Sub1_2.readString();
			@Pc(1407) int local1407 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteC();
			@Pc(1411) int local1411 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			@Pc(1415) int local1415 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteS();
			if (local1411 == 65535) {
				local1411 = -1;
			}
			if (local1415 >= 1 && local1415 <= 8) {
				if (local1403.equalsIgnoreCase("null")) {
					local1403 = null;
				}
				Static2.aStringArray40[local1415 - 1] = local1403;
				Static5.anIntArray615[local1415 - 1] = local1411;
				Static3.aBooleanArray11[local1415 - 1] = local1407 == 0;
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 55) {
			Static5.anInt5206 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 31) {
			@Pc(1486) int local1486 = Static5.aClass4_Sub10_Sub1_2.readInt();
			@Pc(1490) int local1490 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(1494) int local1494 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			@Pc(1498) int local1498 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(1502) int local1502 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			if (local1498 == 65535) {
				local1498 = -1;
			}
			if (local1502 == 65535) {
				local1502 = -1;
			}
			if (Static35.method4381(local1494)) {
				for (@Pc(1520) int local1520 = local1502; local1520 <= local1498; local1520++) {
					@Pc(1535) long local1535 = ((long) local1486 << 32) + (long) local1520;
					@Pc(1541) Class4_Sub21 local1541 = (Class4_Sub21) Static2.aClass84_5.get(local1535);
					@Pc(1556) Class4_Sub21 local1556;
					if (local1541 != null) {
						local1556 = new Class4_Sub21(local1541.anInt3947, local1490);
						local1541.unlink();
					} else if (local1520 == -1) {
						local1556 = new Class4_Sub21(InterfaceList.getComponent(local1486).aClass4_Sub21_2.anInt3947, local1490);
					} else {
						local1556 = new Class4_Sub21(0, local1490);
					}
					Static2.aClass84_5.put(local1535, local1556);
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 174) {
			@Pc(1598) long local1598 = Static5.aClass4_Sub10_Sub1_2.readLong();
			@Pc(1602) int local1602 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(1604) boolean local1604 = false;
			if ((Long.MIN_VALUE & local1598) != 0L) {
				local1604 = true;
			}
			@Pc(1619) byte local1619 = Static5.aClass4_Sub10_Sub1_2.readByte();
			if (local1604) {
				if (Static4.anInt3260 == 0) {
					Static1.anInt552 = -1;
					return true;
				}
				@Pc(1779) long local1779 = local1598 & Long.MAX_VALUE;
				@Pc(1781) int local1781;
				for (local1781 = 0; Static4.anInt3260 > local1781 && (Static6.aClass4_Sub15Array1[local1781].key != local1779 || local1602 != Static6.aClass4_Sub15Array1[local1781].anInt2988); local1781++) {
				}
				if (local1781 < Static4.anInt3260) {
					while (local1781 < Static4.anInt3260 - 1) {
						Static6.aClass4_Sub15Array1[local1781] = Static6.aClass4_Sub15Array1[local1781 + 1];
						local1781++;
					}
					Static4.anInt3260--;
					Static6.aClass4_Sub15Array1[Static4.anInt3260] = null;
				}
			} else {
				@Pc(1625) String local1625 = Static5.aClass4_Sub10_Sub1_2.readString();
				@Pc(1629) Class4_Sub15 local1629 = new Class4_Sub15();
				local1629.key = local1598;
				local1629.aString182 = Base37.decodeLowerCase(local1629.key);
				local1629.aByte5 = local1619;
				local1629.anInt2988 = local1602;
				local1629.aString181 = local1625;
				@Pc(1653) int local1653;
				for (local1653 = Static4.anInt3260 - 1; local1653 >= 0; local1653--) {
					@Pc(1663) int local1663 = Static6.aClass4_Sub15Array1[local1653].aString182.compareTo(local1629.aString182);
					if (local1663 == 0) {
						Static6.aClass4_Sub15Array1[local1653].anInt2988 = local1602;
						Static6.aClass4_Sub15Array1[local1653].aByte5 = local1619;
						Static6.aClass4_Sub15Array1[local1653].aString181 = local1625;
						Static3.anInt2616 = Static6.anInt4979;
						if (Static1.aLong23 == local1598) {
							Static5.aByte13 = local1619;
						}
						Static1.anInt552 = -1;
						return true;
					}
					if (local1663 < 0) {
						break;
					}
				}
				if (Static4.anInt3260 >= Static6.aClass4_Sub15Array1.length) {
					Static1.anInt552 = -1;
					return true;
				}
				for (@Pc(1720) int local1720 = Static4.anInt3260 - 1; local1720 > local1653; local1720--) {
					Static6.aClass4_Sub15Array1[local1720 + 1] = Static6.aClass4_Sub15Array1[local1720];
				}
				if (Static4.anInt3260 == 0) {
					Static6.aClass4_Sub15Array1 = new Class4_Sub15[100];
				}
				Static6.aClass4_Sub15Array1[local1653 + 1] = local1629;
				if (local1598 == Static1.aLong23) {
					Static5.aByte13 = local1619;
				}
				Static4.anInt3260++;
			}
			Static3.anInt2616 = Static6.anInt4979;
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 104) {
			@Pc(1858) long local1858 = Static5.aClass4_Sub10_Sub1_2.readLong();
			@Pc(1865) String local1865 = Static17.method2265(Static30.method3569(WordPack.readString(Static5.aClass4_Sub10_Sub1_2)));
			Static26.method4357(Base37.decodeTitleCase(local1858), 6, local1865);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 253) {
			@Pc(1885) int local1885 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(1889) String local1889 = Static5.aClass4_Sub10_Sub1_2.readString();
			@Pc(1895) Object[] local1895 = new Object[local1889.length() + 1];
			for (@Pc(1900) int local1900 = local1889.length() - 1; local1900 >= 0; local1900--) {
				if (local1889.charAt(local1900) == 's') {
					local1895[local1900 + 1] = Static5.aClass4_Sub10_Sub1_2.readString();
				} else {
					local1895[local1900 + 1] = Integer.valueOf(Static5.aClass4_Sub10_Sub1_2.readInt());
				}
			}
			local1895[0] = Integer.valueOf(Static5.aClass4_Sub10_Sub1_2.readInt());
			if (Static35.method4381(local1885)) {
				@Pc(1953) Class4_Sub13 local1953 = new Class4_Sub13();
				local1953.arguments = local1895;
				method2019(local1953);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 63) {
			@Pc(1971) int local1971 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			@Pc(1975) int local1975 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteS();
			if (local1971 == 65535) {
				local1971 = -1;
			}
			@Pc(1986) int local1986 = local1975 >> 2;
			@Pc(1990) int local1990 = Static1.anIntArray52[local1986];
			@Pc(1994) int local1994 = local1975 & 0x3;
			@Pc(1998) int local1998 = Static5.aClass4_Sub10_Sub1_2.readInt();
			@Pc(2004) int local2004 = local1998 >> 28 & 0x3;
			@Pc(2010) int local2010 = local1998 >> 14 & 0x3FFF;
			@Pc(2014) int local2014 = local1998 & 0x3FFF;
			local2014 -= Static7.anInt5479;
			local2010 -= Static5.anInt3983;
			Static34.method4250(local1971, local2010, local2004, local2014, local1990, local1994, local1986);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 30) {
			if (GameShell.fullScreenFrame != null) {
				Static35.method4512(false, Preferences.displayMode, -1, -1);
			}
			@Pc(2051) byte[] local2051 = new byte[Static1.anInt1052];
			Static5.aClass4_Sub10_Sub1_2.readEncryptedBytes(local2051, Static1.anInt1052);
			@Pc(2063) String local2063 = Cp1252Charset.decodeString(local2051, 0, Static1.anInt1052);
			if (GameShell.frame == null && (SignLink.anInt6106 == 3 || !SignLink.osName.startsWith("win") || client.haveIe6)) {
				Static37.method4719(local2063, true);
			} else {
				Static6.aString269 = local2063;
				Static4.aBoolean206 = true;
				Static1.aClass197_1 = GameShell.signLink.openUrl(local2063);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 147) {
			Static1.anInt894 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			Static1.anInt818 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteA();
			for (@Pc(2109) int local2109 = Static1.anInt894; local2109 < Static1.anInt894 + 8; local2109++) {
				for (@Pc(2116) int local2116 = Static1.anInt818; local2116 < Static1.anInt818 + 8; local2116++) {
					if (Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local2109][local2116] != null) {
						Static4.aClass112ArrayArrayArray1[Static7.anInt5334][local2109][local2116] = null;
						Static8.method89(local2109, local2116);
					}
				}
			}
			for (@Pc(2157) Class4_Sub25 local2157 = (Class4_Sub25) Static2.aClass112_7.head(); local2157 != null; local2157 = (Class4_Sub25) Static2.aClass112_7.next()) {
				if (Static1.anInt894 <= local2157.anInt4445 && local2157.anInt4445 < Static1.anInt894 + 8 && Static1.anInt818 <= local2157.anInt4441 && Static1.anInt818 + 8 > local2157.anInt4441 && Static7.anInt5334 == local2157.anInt4438) {
					local2157.anInt4436 = 0;
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 10) {
			@Pc(2208) int local2208 = Static5.aClass4_Sub10_Sub1_2.readIntAlt3Reverse();
			@Pc(2212) int local2212 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			Static8.method173(local2212, local2208);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 100) {
			@Pc(2227) int local2227 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			if (local2227 == 65535) {
				local2227 = -1;
			}
			@Pc(2239) int local2239 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteA();
			Static36.method4444(local2239, local2227);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 206) {
			@Pc(2256) int local2256 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(2262) int local2262 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			if (local2262 == 65535) {
				local2262 = -1;
			}
			@Pc(2271) int local2271 = Static5.aClass4_Sub10_Sub1_2.method4590();
			Static23.method1933(local2256, local2271, local2262);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 54) {
			if (Static1.anInt1052 == 0) {
				Static5.aString236 = LocalisedText.WALKHERE;
			} else {
				Static5.aString236 = Static5.aClass4_Sub10_Sub1_2.readString();
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 33) {
			@Pc(2312) int local2312 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(2316) int local2316 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(2322) byte local2322 = Static5.aClass4_Sub10_Sub1_2.readByte();
			if (Static1.aByte1 != local2322) {
				Static1.anInt552 = -1;
				return true;
			}
			Static1.anInt552 = -1;
			if (local2312 == 255) {
				Static3.aBoolean147 = false;
				Static6.anInt4506 = 0;
				Static3.anInt2140 = 0;
			} else {
				Static3.aBoolean147 = true;
				Static3.anInt2140 = local2316;
				Static6.anInt4506 = local2312;
			}
			return true;
		} else if (Static1.anInt552 == 183) {
			@Pc(2367) int local2367 = Static5.aClass4_Sub10_Sub1_2.readInt();
			@Pc(2373) int local2373 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			if (local2373 == 65535) {
				local2373 = -1;
			}
			@Pc(2382) int local2382 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			@Pc(2386) int local2386 = Static5.aClass4_Sub10_Sub1_2.readInt();
			if (Static35.method4381(local2382)) {
				@Pc(2395) Component local2395 = InterfaceList.getComponent(local2367);
				if (local2395.if3) {
					Static31.method3716(local2386, local2367, local2373);
					@Pc(2409) ObjType local2409 = ObjTypeList.get(local2373);
					Static13.method1019(local2409.yAngle2d, local2409.zoom2d, local2409.xAngle2d, local2367);
					Static36.method4433(local2409.yOffset2d, local2409.anInt5062, local2409.xOffset2d, local2367);
				} else if (local2373 == -1) {
					local2395.anInt5939 = 0;
					Static1.anInt552 = -1;
					return true;
				} else {
					@Pc(2443) ObjType local2443 = ObjTypeList.get(local2373);
					local2395.anInt5976 = local2443.yAngle2d;
					local2395.anInt5939 = 4;
					local2395.anInt5895 = local2373;
					local2395.anInt5944 = local2443.xAngle2d;
					local2395.anInt5918 = local2443.zoom2d * 100 / local2386;
					Static28.method3270(local2395);
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 65) {
			@Pc(2482) int local2482 = Static5.aClass4_Sub10_Sub1_2.readIntAlt3();
			@Pc(2488) int local2488 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(2494) int local2494 = Static5.aClass4_Sub10_Sub1_2.readShortA();
			@Pc(2498) int local2498 = Static5.aClass4_Sub10_Sub1_2.readShortLE();
			if (Static35.method4381(local2488)) {
				Static12.method726(local2482, local2494, local2498);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 152) {
			@Pc(2523) int local2523 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(2527) int local2527 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(2531) int local2531 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			@Pc(2535) int local2535 = Static5.aClass4_Sub10_Sub1_2.readIntLE();
			if (Static35.method4381(local2523)) {
				method2021(local2531 + (local2527 << 16), local2535);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 44) {
			@Pc(2559) boolean local2559 = false;
			@Pc(2563) long local2563 = Static5.aClass4_Sub10_Sub1_2.readLong();
			@Pc(2568) long local2568 = (long) Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(2573) long local2573 = (long) Static5.aClass4_Sub10_Sub1_2.readUnsignedMedium();
			@Pc(2579) long local2579 = (local2568 << 32) + local2573;
			@Pc(2583) int local2583 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(2585) int local2585 = 0;
			label1451:
			while (true) {
				if (local2585 >= 100) {
					if (local2583 <= 1) {
						if (Static1.aBoolean47 && !Static5.aBoolean287 || Static2.aBoolean67) {
							local2559 = true;
						} else {
							for (@Pc(2623) int local2623 = 0; local2623 < Static6.anInt4516; local2623++) {
								if (local2563 == Static3.aLongArray16[local2623]) {
									local2559 = true;
									break label1451;
								}
							}
						}
					}
					break;
				}
				if (Static4.aLongArray24[local2585] == local2579) {
					local2559 = true;
					break;
				}
				local2585++;
			}
			if (!local2559 && Static3.anInt5405 == 0) {
				Static4.aLongArray24[Static1.anInt595] = local2579;
				Static1.anInt595 = (Static1.anInt595 + 1) % 100;
				@Pc(2663) String local2663 = Static17.method2265(Static30.method3569(WordPack.readString(Static5.aClass4_Sub10_Sub1_2)));
				if (local2583 == 2 || local2583 == 3) {
					Static26.method4357("<img=1>" + Base37.decodeTitleCase(local2563), 7, local2663);
				} else if (local2583 == 1) {
					Static26.method4357("<img=0>" + Base37.decodeTitleCase(local2563), 7, local2663);
				} else {
					Static26.method4357(Base37.decodeTitleCase(local2563), 3, local2663);
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 89) {
			@Pc(2728) int local2728 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			@Pc(2732) int local2732 = Static5.aClass4_Sub10_Sub1_2.readInt();
			@Pc(2736) int local2736 = Static5.aClass4_Sub10_Sub1_2.readIntLE();
			if (Static35.method4381(local2728)) {
				@Pc(2747) Class4_Sub27 local2747 = (Class4_Sub27) Static4.aClass84_13.get((long) local2732);
				@Pc(2754) Class4_Sub27 local2754 = (Class4_Sub27) Static4.aClass84_13.get((long) local2736);
				if (local2754 != null) {
					Static28.method3246(local2747 == null || local2754.anInt4620 != local2747.anInt4620, local2754);
				}
				if (local2747 != null) {
					local2747.unlink();
					Static4.aClass84_13.put((long) local2736, local2747);
				}
				@Pc(2788) Component local2788 = InterfaceList.getComponent(local2732);
				if (local2788 != null) {
					Static28.method3270(local2788);
				}
				@Pc(2799) Component local2799 = InterfaceList.getComponent(local2736);
				if (local2799 != null) {
					Static28.method3270(local2799);
					Static34.method4251(true, local2799);
				}
				if (Static3.anInt5398 != -1) {
					Static28.method3277(Static3.anInt5398, 1);
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 246) {
			@Pc(2830) long local2830 = Static5.aClass4_Sub10_Sub1_2.readLong();
			Static5.aClass4_Sub10_Sub1_2.readByte();
			@Pc(2838) long local2838 = Static5.aClass4_Sub10_Sub1_2.readLong();
			@Pc(2843) long local2843 = (long) Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(2848) long local2848 = (long) Static5.aClass4_Sub10_Sub1_2.readUnsignedMedium();
			@Pc(2855) long local2855 = (local2843 << 32) + local2848;
			@Pc(2859) int local2859 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(2861) boolean local2861 = false;
			@Pc(2863) int local2863 = 0;
			label1702:
			while (true) {
				if (local2863 < 100) {
					if (Static4.aLongArray24[local2863] != local2855) {
						local2863++;
						continue;
					}
					local2861 = true;
					break;
				}
				if (local2859 <= 1) {
					if (Static1.aBoolean47 && !Static5.aBoolean287 || Static2.aBoolean67) {
						local2861 = true;
					} else {
						for (@Pc(2899) int local2899 = 0; local2899 < Static6.anInt4516; local2899++) {
							if (local2830 == Static3.aLongArray16[local2899]) {
								local2861 = true;
								break label1702;
							}
						}
					}
				}
				break;
			}
			if (!local2861 && Static3.anInt5405 == 0) {
				Static4.aLongArray24[Static1.anInt595] = local2855;
				Static1.anInt595 = (Static1.anInt595 + 1) % 100;
				@Pc(2939) String local2939 = Static17.method2265(Static30.method3569(WordPack.readString(Static5.aClass4_Sub10_Sub1_2)));
				if (local2859 == 2 || local2859 == 3) {
					Static26.method2982("<img=1>" + Base37.decodeTitleCase(local2830), Base37.decodeTitleCase(local2838), local2939);
				} else if (local2859 == 1) {
					Static26.method2982("<img=0>" + Base37.decodeTitleCase(local2830), Base37.decodeTitleCase(local2838), local2939);
				} else {
					Static26.method2982(Base37.decodeTitleCase(local2830), Base37.decodeTitleCase(local2838), local2939);
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 90) {
			@Pc(3016) int local3016 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(3020) int local3020 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			@Pc(3024) int local3024 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			@Pc(3028) int local3028 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			@Pc(3032) int local3032 = Static5.aClass4_Sub10_Sub1_2.readIntLE();
			if (Static35.method4381(local3024)) {
				Static13.method1019(local3020, local3016, local3028, local3032);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 130) {
			@Pc(3053) int local3053 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteA();
			@Pc(3057) int local3057 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteC();
			@Pc(3061) int local3061 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			Static7.anInt5334 = local3061 >> 1;
			Player.self.method1174(local3053, (local3061 & 0x1) == 1, local3057);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 172) {
			@Pc(3091) int local3091 = Static5.aClass4_Sub10_Sub1_2.readIntLE();
			@Pc(3095) int local3095 = Static5.aClass4_Sub10_Sub1_2.readShort();
			@Pc(3101) int local3101 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			if (Static35.method4381(local3101)) {
				Static38.method4824(local3091, local3095);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 103) {
			@Pc(3127) int local3127 = Static5.aClass4_Sub10_Sub1_2.readInt();
			Static1.aClass197_2 = GameShell.signLink.getReverseDns(local3127);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 242) {
			@Pc(3144) int local3144 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(3148) int local3148 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			if (Static35.method4381(local3148)) {
				Static5.anInt4166 = local3144;
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 2) {
			Static3.anInt2616 = Static6.anInt4979;
			@Pc(3168) long local3168 = Static5.aClass4_Sub10_Sub1_2.readLong();
			if (local3168 == 0L) {
				Static2.aString108 = null;
				Static4.anInt3260 = 0;
				Static6.aString268 = null;
				Static1.anInt552 = -1;
				Static6.aClass4_Sub15Array1 = null;
				return true;
			}
			@Pc(3188) long local3188 = Static5.aClass4_Sub10_Sub1_2.readLong();
			Static2.aString108 = Base37.decodeLowerCase(local3188);
			Static6.aString268 = Base37.decodeLowerCase(local3168);
			Static4.aByte6 = Static5.aClass4_Sub10_Sub1_2.readByte();
			@Pc(3204) int local3204 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			if (local3204 == 255) {
				Static1.anInt552 = -1;
				return true;
			}
			Static4.anInt3260 = local3204;
			@Pc(3217) Class4_Sub15[] local3217 = new Class4_Sub15[100];
			for (@Pc(3219) int local3219 = 0; local3219 < Static4.anInt3260; local3219++) {
				local3217[local3219] = new Class4_Sub15();
				local3217[local3219].key = Static5.aClass4_Sub10_Sub1_2.readLong();
				local3217[local3219].aString182 = Base37.decodeLowerCase(local3217[local3219].key);
				local3217[local3219].anInt2988 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
				local3217[local3219].aByte5 = Static5.aClass4_Sub10_Sub1_2.readByte();
				local3217[local3219].aString181 = Static5.aClass4_Sub10_Sub1_2.readString();
				if (Static1.aLong23 == local3217[local3219].key) {
					Static5.aByte13 = local3217[local3219].aByte5;
				}
			}
			@Pc(3291) int local3291 = Static4.anInt3260;
			while (local3291 > 0) {
				local3291--;
				@Pc(3297) boolean local3297 = true;
				for (@Pc(3299) int local3299 = 0; local3299 < local3291; local3299++) {
					if (local3217[local3299].aString182.compareTo(local3217[local3299 + 1].aString182) > 0) {
						@Pc(3321) Class4_Sub15 local3321 = local3217[local3299];
						local3217[local3299] = local3217[local3299 + 1];
						local3217[local3299 + 1] = local3321;
						local3297 = false;
					}
				}
				if (local3297) {
					break;
				}
			}
			Static1.anInt552 = -1;
			Static6.aClass4_Sub15Array1 = local3217;
			return true;
		} else if (Static1.anInt552 == 173) {
			Static22.method4689(GameShell.signLink, Static1.anInt1052, Static5.aClass4_Sub10_Sub1_2);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 115 || Static1.anInt552 == 111 || Static1.anInt552 == 17 || Static1.anInt552 == 144 || Static1.anInt552 == 114 || Static1.anInt552 == 133 || Static1.anInt552 == 47 || Static1.anInt552 == 158 || Static1.anInt552 == 105 || Static1.anInt552 == 120 || Static1.anInt552 == 60 || Static1.anInt552 == 179 || Static1.anInt552 == 232 || Static1.anInt552 == 131) {
			Static38.method4789();
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 113) {
			@Pc(3435) int local3435 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(3441) int local3441 = Static5.aClass4_Sub10_Sub1_2.readIntAlt3();
			@Pc(3447) int local3447 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(3451) int local3451 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(3455) int local3455 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			if (Static35.method4381(local3451)) {
				Static29.method3471(7, local3435, local3441, local3447 << 16 | local3455);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 182) {
			@Pc(3481) long local3481 = Static5.aClass4_Sub10_Sub1_2.readLong();
			@Pc(3485) int local3485 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(3489) int local3489 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(3491) boolean local3491 = true;
			if (local3481 < 0L) {
				local3491 = false;
				local3481 &= Long.MAX_VALUE;
			}
			@Pc(3504) String local3504 = "";
			if (local3485 > 0) {
				local3504 = Static5.aClass4_Sub10_Sub1_2.readString();
			}
			@Pc(3518) String local3518 = Base37.decodeTitleCase(local3481);
			for (@Pc(3520) int local3520 = 0; local3520 < Static6.anInt5214; local3520++) {
				if (Static7.aLongArray54[local3520] == local3481) {
					if (local3485 != Static4.anIntArray293[local3520]) {
						Static4.anIntArray293[local3520] = local3485;
						if (local3485 > 0) {
							Static26.method4357("", 5, local3518 + LocalisedText.FRIENDLOGIN);
						}
						if (local3485 == 0) {
							Static26.method4357("", 5, local3518 + LocalisedText.FRIENDLOGOUT);
						}
					}
					Static4.aStringArray22[local3520] = local3504;
					Static6.anIntArray517[local3520] = local3489;
					Static2.aBooleanArray7[local3520] = local3491;
					local3518 = null;
					break;
				}
			}
			if (local3518 != null && Static6.anInt5214 < 200) {
				Static7.aLongArray54[Static6.anInt5214] = local3481;
				Static4.aStringArray23[Static6.anInt5214] = local3518;
				Static4.anIntArray293[Static6.anInt5214] = local3485;
				Static4.aStringArray22[Static6.anInt5214] = local3504;
				Static6.anIntArray517[Static6.anInt5214] = local3489;
				Static2.aBooleanArray7[Static6.anInt5214] = local3491;
				Static6.anInt5214++;
			}
			Static3.anInt2102 = Static6.anInt4979;
			@Pc(3644) int local3644 = Static6.anInt5214;
			while (local3644 > 0) {
				@Pc(3651) boolean local3651 = true;
				local3644--;
				for (@Pc(3654) int local3654 = 0; local3654 < local3644; local3654++) {
					if (Static4.anIntArray293[local3654] != client.worldId && client.worldId == Static4.anIntArray293[local3654 + 1] || Static4.anIntArray293[local3654] == 0 && Static4.anIntArray293[local3654 + 1] != 0) {
						local3651 = false;
						@Pc(3691) int local3691 = Static4.anIntArray293[local3654];
						Static4.anIntArray293[local3654] = Static4.anIntArray293[local3654 + 1];
						Static4.anIntArray293[local3654 + 1] = local3691;
						@Pc(3709) String local3709 = Static4.aStringArray22[local3654];
						Static4.aStringArray22[local3654] = Static4.aStringArray22[local3654 + 1];
						Static4.aStringArray22[local3654 + 1] = local3709;
						@Pc(3727) String local3727 = Static4.aStringArray23[local3654];
						Static4.aStringArray23[local3654] = Static4.aStringArray23[local3654 + 1];
						Static4.aStringArray23[local3654 + 1] = local3727;
						@Pc(3745) long local3745 = Static7.aLongArray54[local3654];
						Static7.aLongArray54[local3654] = Static7.aLongArray54[local3654 + 1];
						Static7.aLongArray54[local3654 + 1] = local3745;
						@Pc(3763) int local3763 = Static6.anIntArray517[local3654];
						Static6.anIntArray517[local3654] = Static6.anIntArray517[local3654 + 1];
						Static6.anIntArray517[local3654 + 1] = local3763;
						@Pc(3781) boolean local3781 = Static2.aBooleanArray7[local3654];
						Static2.aBooleanArray7[local3654] = Static2.aBooleanArray7[local3654 + 1];
						Static2.aBooleanArray7[local3654 + 1] = local3781;
					}
				}
				if (local3651) {
					break;
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 225) {
			@Pc(3813) int local3813 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(3817) int local3817 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(3821) int local3821 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteS();
			if (Static35.method4381(local3817)) {
				if (local3821 == 2) {
					Static16.method1557();
				}
				Static3.anInt5398 = local3813;
				Static9.method230(local3813);
				Static12.method777(false);
				Static14.method1102(Static3.anInt5398);
				for (@Pc(3846) int local3846 = 0; local3846 < 100; local3846++) {
					Static2.aBooleanArray8[local3846] = true;
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 156) {
			@Pc(3870) int local3870 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			if (Static35.method4381(local3870)) {
				Static8.method11();
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 229) {
			for (@Pc(3886) int local3886 = 0; local3886 < Static5.aClass53_Sub1_Sub1Array1.length; local3886++) {
				if (Static5.aClass53_Sub1_Sub1Array1[local3886] != null) {
					Static5.aClass53_Sub1_Sub1Array1[local3886].anInt4007 = -1;
				}
			}
			for (@Pc(3906) int local3906 = 0; local3906 < Static3.aClass53_Sub1_Sub2Array1.length; local3906++) {
				if (Static3.aClass53_Sub1_Sub2Array1[local3906] != null) {
					Static3.aClass53_Sub1_Sub2Array1[local3906].anInt4007 = -1;
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 78) {
			Static12.method778();
			method2062();
			Static1.anInt552 = -1;
			Static1.anInt788 += 32;
			return true;
		} else if (Static1.anInt552 == 177) {
			@Pc(3952) int local3952 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(3956) int local3956 = local3952 >> 5;
			@Pc(3960) int local3960 = local3952 & 0x1F;
			if (local3960 == 0) {
				Static7.aClass94Array1[local3956] = null;
				Static1.anInt552 = -1;
				return true;
			}
			@Pc(3976) Class94 local3976 = new Class94();
			local3976.anInt2561 = local3960;
			local3976.anInt2559 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			if (local3976.anInt2559 >= 0 && local3976.anInt2559 < Static6.aClass4_Sub3_Sub14Array11.length) {
				if (local3976.anInt2561 == 1 || local3976.anInt2561 == 10) {
					local3976.anInt2560 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
					@Pc(4011) Packet local4011 = Static5.aClass4_Sub10_Sub1_2;
					local4011.position += 5;
				} else if (local3976.anInt2561 >= 2 && local3976.anInt2561 <= 6) {
					if (local3976.anInt2561 == 2) {
						local3976.anInt2564 = 64;
						local3976.anInt2568 = 64;
					}
					if (local3976.anInt2561 == 3) {
						local3976.anInt2568 = 64;
						local3976.anInt2564 = 0;
					}
					if (local3976.anInt2561 == 4) {
						local3976.anInt2564 = 128;
						local3976.anInt2568 = 64;
					}
					if (local3976.anInt2561 == 5) {
						local3976.anInt2564 = 64;
						local3976.anInt2568 = 0;
					}
					if (local3976.anInt2561 == 6) {
						local3976.anInt2568 = 128;
						local3976.anInt2564 = 64;
					}
					local3976.anInt2561 = 2;
					local3976.anInt2558 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
					local3976.anInt2565 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
					local3976.anInt2567 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
					local3976.anInt2562 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
				}
				local3976.anInt2563 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
				if (local3976.anInt2563 == 65535) {
					local3976.anInt2563 = -1;
				}
				Static7.aClass94Array1[local3956] = local3976;
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 136) {
			Static36.method4522();
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 155) {
			Static33.method4089(true);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 75) {
			@Pc(4162) int local4162 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(4166) String local4166 = Static5.aClass4_Sub10_Sub1_2.readString();
			@Pc(4170) int local4170 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			if (Static35.method4381(local4162)) {
				Static31.method3779(local4166, local4170);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 137) {
			@Pc(4190) int local4190 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			@Pc(4194) int local4194 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			Static30.method3550(local4194, local4190);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 72) {
			Static5.anInt4329 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE() * 30;
			Static1.anInt925 = Static6.anInt4979;
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 26) {
			@Pc(4226) int local4226 = Static5.aClass4_Sub10_Sub1_2.readIntAlt3Reverse();
			@Pc(4232) Component local4232 = InterfaceList.getComponent(local4226);
			for (@Pc(4234) int local4234 = 0; local4234 < local4232.anIntArray660.length; local4234++) {
				local4232.anIntArray660[local4234] = -1;
				local4232.anIntArray660[local4234] = 0;
			}
			Static28.method3270(local4232);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 99) {
			@Pc(4270) long local4270 = Static5.aClass4_Sub10_Sub1_2.readLong();
			Static5.aClass4_Sub10_Sub1_2.readByte();
			@Pc(4278) long local4278 = Static5.aClass4_Sub10_Sub1_2.readLong();
			@Pc(4283) long local4283 = (long) Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(4288) long local4288 = (long) Static5.aClass4_Sub10_Sub1_2.readUnsignedMedium();
			@Pc(4295) long local4295 = (local4283 << 32) + local4288;
			@Pc(4299) int local4299 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(4303) int local4303 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(4305) boolean local4305 = false;
			@Pc(4307) int local4307 = 0;
			label1529:
			while (true) {
				if (local4307 < 100) {
					if (Static4.aLongArray24[local4307] != local4295) {
						local4307++;
						continue;
					}
					local4305 = true;
					break;
				}
				if (local4299 <= 1) {
					for (@Pc(4333) int local4333 = 0; local4333 < Static6.anInt4516; local4333++) {
						if (local4270 == Static3.aLongArray16[local4333]) {
							local4305 = true;
							break label1529;
						}
					}
				}
				break;
			}
			if (!local4305 && Static3.anInt5405 == 0) {
				Static4.aLongArray24[Static1.anInt595] = local4295;
				Static1.anInt595 = (Static1.anInt595 + 1) % 100;
				@Pc(4375) String local4375 = Static26.method2991(local4303).method1909(Static5.aClass4_Sub10_Sub1_2);
				if (local4299 == 2 || local4299 == 3) {
					Static25.method2927("<img=1>" + Base37.decodeTitleCase(local4270), local4303, Base37.decodeTitleCase(local4278), 20, local4375);
				} else if (local4299 == 1) {
					Static25.method2927("<img=0>" + Base37.decodeTitleCase(local4270), local4303, Base37.decodeTitleCase(local4278), 20, local4375);
				} else {
					Static25.method2927(Base37.decodeTitleCase(local4270), local4303, Base37.decodeTitleCase(local4278), 20, local4375);
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 237) {
			@Pc(4452) int local4452 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			@Pc(4456) int local4456 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			@Pc(4460) int local4460 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			@Pc(4466) int local4466 = Static5.aClass4_Sub10_Sub1_2.readIntAlt3Reverse();
			if (local4466 >> 30 != 0) {
				@Pc(4479) int local4479 = local4466 >> 28 & 0x3;
				@Pc(4488) int local4488 = (local4466 >> 14 & 0x3FFF) - Static5.anInt3983;
				@Pc(4495) int local4495 = (local4466 & 0x3FFF) - Static7.anInt5479;
				if (local4488 >= 0 && local4495 >= 0 && local4488 < 104 && local4495 < 104) {
					@Pc(4515) int local4515 = local4495 * 128 + 64;
					@Pc(4521) int local4521 = local4488 * 128 + 64;
					@Pc(4539) SpotAnim local4539 = new SpotAnim(local4452, local4479, local4521, local4515, Static11.method522(local4515, local4521, local4479) - local4460, local4456, Static2.anInt954);
					Static2.aClass112_8.addTail(new SpotAnimNode(local4539));
				}
			} else if (local4466 >> 29 != 0) {
				@Pc(4805) int local4805 = local4466 & 0xFFFF;
				@Pc(4809) Npc local4809 = Static3.aClass53_Sub1_Sub2Array1[local4805];
				if (local4809 != null) {
					if (local4452 == 65535) {
						local4452 = -1;
					}
					@Pc(4822) boolean local4822 = true;
					if (local4452 != -1 && local4809.anInt3961 != -1) {
						if (local4452 == local4809.anInt3961) {
							@Pc(4840) Class110 local4840 = method2004(local4452);
							if (local4840.aBoolean222 && local4840.anInt3134 != -1) {
								@Pc(4855) Class46 local4855 = Static23.method2494(local4840.anInt3134);
								@Pc(4858) int local4858 = local4855.anInt1238;
								if (local4858 == 1) {
									local4822 = false;
									local4809.anInt3984 = Static2.anInt954 + local4456;
									local4809.anInt4026 = 0;
									local4809.anInt3976 = 1;
									local4809.anInt3968 = 0;
									local4809.anInt3989 = 0;
									Static29.method3461(local4855, local4809.z, local4809.x, local4809.anInt4026, false);
								} else if (local4858 == 2) {
									local4809.anInt4001 = 0;
									local4822 = false;
								}
							}
						} else {
							@Pc(4913) Class110 local4913 = method2004(local4452);
							@Pc(4918) Class110 local4918 = method2004(local4809.anInt3961);
							if (local4913.anInt3134 != -1 && local4918.anInt3134 != -1) {
								@Pc(4935) Class46 local4935 = Static23.method2494(local4913.anInt3134);
								@Pc(4940) Class46 local4940 = Static23.method2494(local4918.anInt3134);
								if (local4935.anInt1243 < local4940.anInt1243) {
									local4822 = false;
								}
							}
						}
					}
					if (local4822) {
						local4809.anInt3961 = local4452;
						local4809.anInt4026 = 0;
						local4809.anInt3976 = 1;
						local4809.anInt3971 = local4460;
						local4809.anInt3968 = 0;
						local4809.anInt3984 = local4456 + Static2.anInt954;
						if (local4809.anInt3984 > Static2.anInt954) {
							local4809.anInt4026 = -1;
						}
						if (local4809.anInt3961 != -1 && Static2.anInt954 == local4809.anInt3984) {
							@Pc(5003) int local5003 = method2004(local4809.anInt3961).anInt3134;
							if (local5003 != -1) {
								@Pc(5010) Class46 local5010 = Static23.method2494(local5003);
								if (local5010 != null && local5010.anIntArray95 != null) {
									Static29.method3461(local5010, local4809.z, local4809.x, 0, false);
								}
							}
						}
					}
				}
			} else if (local4466 >> 28 != 0) {
				@Pc(4564) int local4564 = local4466 & 0xFFFF;
				@Pc(4569) Player local4569;
				if (Static7.anInt2022 == local4564) {
					local4569 = Player.self;
				} else {
					local4569 = Static5.aClass53_Sub1_Sub1Array1[local4564];
				}
				if (local4569 != null) {
					if (local4452 == 65535) {
						local4452 = -1;
					}
					@Pc(4586) boolean local4586 = true;
					if (local4452 != -1 && local4569.anInt3961 != -1) {
						if (local4452 == local4569.anInt3961) {
							@Pc(4649) Class110 local4649 = method2004(local4452);
							if (local4649.aBoolean222 && local4649.anInt3134 != -1) {
								@Pc(4663) Class46 local4663 = Static23.method2494(local4649.anInt3134);
								@Pc(4666) int local4666 = local4663.anInt1238;
								if (local4666 == 1) {
									local4569.anInt4026 = 0;
									local4569.anInt3968 = 0;
									local4569.anInt3976 = 1;
									local4586 = false;
									local4569.anInt3984 = local4456 + Static2.anInt954;
									local4569.anInt3989 = 0;
									Static29.method3461(local4663, local4569.z, local4569.x, local4569.anInt4026, false);
								} else if (local4666 == 2) {
									local4569.anInt4001 = 0;
									local4586 = false;
								}
							}
						} else {
							@Pc(4605) Class110 local4605 = method2004(local4452);
							@Pc(4610) Class110 local4610 = method2004(local4569.anInt3961);
							if (local4605.anInt3134 != -1 && local4610.anInt3134 != -1) {
								@Pc(4627) Class46 local4627 = Static23.method2494(local4605.anInt3134);
								@Pc(4632) Class46 local4632 = Static23.method2494(local4610.anInt3134);
								if (local4627.anInt1243 < local4632.anInt1243) {
									local4586 = false;
								}
							}
						}
					}
					if (local4586) {
						local4569.anInt3968 = 0;
						local4569.anInt3976 = 1;
						local4569.anInt3984 = Static2.anInt954 + local4456;
						local4569.anInt3971 = local4460;
						local4569.anInt4026 = 0;
						local4569.anInt3961 = local4452;
						if (local4569.anInt3984 > Static2.anInt954) {
							local4569.anInt4026 = -1;
						}
						if (local4569.anInt3961 == 65535) {
							local4569.anInt3961 = -1;
						}
						if (local4569.anInt3961 != -1 && local4569.anInt3984 == Static2.anInt954) {
							@Pc(4768) int local4768 = method2004(local4569.anInt3961).anInt3134;
							if (local4768 != -1) {
								@Pc(4778) Class46 local4778 = Static23.method2494(local4768);
								if (local4778 != null && local4778.anIntArray95 != null) {
									Static29.method3461(local4778, local4569.z, local4569.x, 0, local4569 == Player.self);
								}
							}
						}
					}
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 151) {
			@Pc(5037) int local5037 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5041) int local5041 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5045) int local5045 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5049) int local5049 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5053) int local5053 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5057) int local5057 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			if (Static35.method4381(local5037)) {
				Static37.method4773(local5053, local5041, local5057, local5049, true, local5045);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 116) {
			@Pc(5083) int local5083 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			@Pc(5087) int local5087 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			@Pc(5091) String local5091 = Static5.aClass4_Sub10_Sub1_2.readString();
			if (Static35.method4381(local5087)) {
				Static31.method3779(local5091, local5083);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 222) {
			@Pc(5111) long local5111 = Static5.aClass4_Sub10_Sub1_2.readLong();
			@Pc(5116) long local5116 = (long) Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5121) long local5121 = (long) Static5.aClass4_Sub10_Sub1_2.readUnsignedMedium();
			@Pc(5125) int local5125 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5129) int local5129 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5131) boolean local5131 = false;
			@Pc(5137) long local5137 = (local5116 << 32) + local5121;
			@Pc(5139) int local5139 = 0;
			label1545:
			while (true) {
				if (local5139 < 100) {
					if (local5137 != Static4.aLongArray24[local5139]) {
						local5139++;
						continue;
					}
					local5131 = true;
					break;
				}
				if (local5125 <= 1) {
					for (@Pc(5167) int local5167 = 0; local5167 < Static6.anInt4516; local5167++) {
						if (Static3.aLongArray16[local5167] == local5111) {
							local5131 = true;
							break label1545;
						}
					}
				}
				break;
			}
			if (!local5131 && Static3.anInt5405 == 0) {
				Static4.aLongArray24[Static1.anInt595] = local5137;
				Static1.anInt595 = (Static1.anInt595 + 1) % 100;
				@Pc(5214) String local5214 = Static26.method2991(local5129).method1909(Static5.aClass4_Sub10_Sub1_2);
				if (local5125 == 2) {
					Static25.method2927("<img=1>" + Base37.decodeTitleCase(local5111), local5129, null, 18, local5214);
				} else if (local5125 == 1) {
					Static25.method2927("<img=0>" + Base37.decodeTitleCase(local5111), local5129, null, 18, local5214);
				} else {
					Static25.method2927(Base37.decodeTitleCase(local5111), local5129, null, 18, local5214);
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 46) {
			@Pc(5282) int local5282 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5286) int local5286 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5290) int local5290 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5294) int local5294 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5298) int local5298 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5302) int local5302 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			if (Static35.method4381(local5282)) {
				Static3.aBooleanArray13[local5286] = true;
				Static7.anIntArray625[local5286] = local5290;
				Static7.anIntArray626[local5286] = local5294;
				Static1.anIntArray13[local5286] = local5298;
				Static1.anIntArray14[local5286] = local5302;
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 153) {
			@Pc(5340) int local5340 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			if (local5340 == 65535) {
				local5340 = -1;
			}
			@Pc(5349) int local5349 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5353) int local5353 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5357) int local5357 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			Static15.method1227(local5353, local5340, local5349, local5357);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 135) {
			@Pc(5375) int local5375 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5379) int local5379 = Static5.aClass4_Sub10_Sub1_2.readInt();
			if (Static35.method4381(local5375)) {
				@Pc(5392) Class4_Sub27 local5392 = (Class4_Sub27) Static4.aClass84_13.get((long) local5379);
				if (local5392 != null) {
					Static28.method3246(true, local5392);
				}
				if (Static6.aClass185_14 != null) {
					Static28.method3270(Static6.aClass185_14);
					Static6.aClass185_14 = null;
				}
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 40) {
			@Pc(5419) int local5419 = Static5.aClass4_Sub10_Sub1_2.readIntLE();
			@Pc(5423) int local5423 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			@Pc(5427) int local5427 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			if (Static35.method4381(local5423)) {
				Static33.method2997(local5419, local5427);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 23) {
			Static7.anInt5413 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			Static6.anInt4837 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			Static6.anInt5016 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 168) {
			@Pc(5469) int local5469 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			Inv.delete(local5469);
			Static7.anIntArray656[Static2.anInt959++ & 0x1F] = local5469 & 0x7FFF;
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 52) {
			@Pc(5498) int local5498 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			if (Static35.method4381(local5498)) {
				Static24.method2563();
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 38) {
			@Pc(5517) byte local5517 = Static5.aClass4_Sub10_Sub1_2.readByte();
			@Pc(5521) int local5521 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			Static8.method173(local5521, local5517);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 194) {
			@Pc(5536) int local5536 = Static5.aClass4_Sub10_Sub1_2.readInt();
			@Pc(5540) int local5540 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			if (local5536 < -70000) {
				local5540 += 32768;
			}
			@Pc(5557) Component local5557;
			if (local5536 < 0) {
				local5557 = null;
			} else {
				local5557 = InterfaceList.getComponent(local5536);
			}
			if (local5557 != null) {
				for (@Pc(5570) int local5570 = 0; local5570 < local5557.anIntArray660.length; local5570++) {
					local5557.anIntArray660[local5570] = 0;
					local5557.anIntArray661[local5570] = 0;
				}
			}
			Inv.clear(local5540);
			@Pc(5595) int local5595 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			for (@Pc(5597) int local5597 = 0; local5597 < local5595; local5597++) {
				@Pc(5608) int local5608 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
				@Pc(5612) int local5612 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteC();
				if (local5612 == 255) {
					local5612 = Static5.aClass4_Sub10_Sub1_2.readInt();
				}
				if (local5557 != null && local5597 < local5557.anIntArray660.length) {
					local5557.anIntArray660[local5597] = local5608;
					local5557.anIntArray661[local5597] = local5612;
				}
				Inv.set(local5540, local5597, local5608 - 1, local5612);
			}
			if (local5557 != null) {
				Static28.method3270(local5557);
			}
			method2062();
			Static7.anIntArray656[Static2.anInt959++ & 0x1F] = local5540 & 0x7FFF;
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 150) {
			@Pc(5687) int local5687 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5691) int local5691 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			@Pc(5695) int local5695 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByteC();
			@Pc(5699) Npc local5699 = Static3.aClass53_Sub1_Sub2Array1[local5691];
			if (local5699 != null) {
				Static11.method529(local5687, local5699, local5695);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 93) {
			@Pc(5721) int local5721 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5725) int local5725 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5729) int local5729 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5733) int local5733 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5737) int local5737 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			@Pc(5741) int local5741 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			if (Static35.method4381(local5721)) {
				Static23.method2536(local5733, local5737, local5725, local5729, local5741);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 166) {
			@Pc(5763) Packet local5763 = Static5.aClass4_Sub10_Sub1_2;
			local5763.position += 28;
			if (Static5.aClass4_Sub10_Sub1_2.verifyCrc32()) {
				Static9.method281(Static5.aClass4_Sub10_Sub1_2.position - 28, Static5.aClass4_Sub10_Sub1_2);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 42) {
			@Pc(5797) int local5797 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			@Pc(5801) int local5801 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortA();
			@Pc(5805) int local5805 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			if (Static35.method4381(local5797)) {
				Static17.method1654(local5805, local5801);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 18) {
			@Pc(5828) int local5828 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLE();
			if (local5828 == 65535) {
				local5828 = -1;
			}
			@Pc(5837) int local5837 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5841) int local5841 = Static5.aClass4_Sub10_Sub1_2.readInt();
			if (Static35.method4381(local5837)) {
				Static29.method3471(2, -1, local5841, local5828);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 43) {
			Static6.anInt4516 = Static1.anInt1052 / 8;
			for (@Pc(5867) int local5867 = 0; local5867 < Static6.anInt4516; local5867++) {
				Static3.aLongArray16[local5867] = Static5.aClass4_Sub10_Sub1_2.readLong();
				Static3.aStringArray18[local5867] = Static30.method423(Static3.aLongArray16[local5867]);
				Static2.aBooleanArray5[local5867] = false;
			}
			Static1.anInt552 = -1;
			Static3.anInt2102 = Static6.anInt4979;
			return true;
		} else if (Static1.anInt552 == 221) {
			@Pc(5909) long local5909 = Static5.aClass4_Sub10_Sub1_2.readLong();
			@Pc(5913) int local5913 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5920) String local5920 = Static26.method2991(local5913).method1909(Static5.aClass4_Sub10_Sub1_2);
			Static25.method2927(Base37.decodeTitleCase(local5909), local5913, null, 19, local5920);
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 199) {
			@Pc(5941) int local5941 = Static5.aClass4_Sub10_Sub1_2.readIntAlt3Reverse();
			@Pc(5945) int local5945 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			if (Static35.method4381(local5945)) {
				@Pc(5951) int local5951 = 0;
				if (Player.self.appearance != null) {
					local5951 = Player.self.appearance.method3611();
				}
				Static29.method3471(3, -1, local5941, local5951);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 243) {
			@Pc(5979) int local5979 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShort();
			@Pc(5985) int local5985 = Static5.aClass4_Sub10_Sub1_2.readIntAlt3Reverse();
			@Pc(5989) int local5989 = Static5.aClass4_Sub10_Sub1_2.readUnsignedShortLEA();
			if (Static35.method4381(local5989)) {
				Static12.method722(local5985, local5979);
			}
			Static1.anInt552 = -1;
			return true;
		} else if (Static1.anInt552 == 19) {
			@Pc(6012) int local6012 = Static5.aClass4_Sub10_Sub1_2.readUnsignedByte();
			if (Static5.aClass4_Sub10_Sub1_2.readUnsignedByte() == 0) {
				Static1.aClass160Array1[local6012] = new Class160();
			} else {
				Static5.aClass4_Sub10_Sub1_2.position--;
				Static1.aClass160Array1[local6012] = new Class160(Static5.aClass4_Sub10_Sub1_2);
			}
			Static1.anInt552 = -1;
			Static6.anInt4996 = Static6.anInt4979;
			return true;
		} else {
			TracingException.report(null, "T1 - " + Static1.anInt552 + "," + Static3.anInt2273 + "," + Static2.anInt1231 + " - " + Static1.anInt1052);
			Static19.method1818();
			return true;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIIILclient!ch;II)V")
	public static void method2018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) long local9 = 0L;
		if (arg4 == 0) {
			local9 = Static25.method2726(arg0, arg5, arg2);
		} else if (arg4 == 1) {
			local9 = Static37.method4739(arg0, arg5, arg2);
		} else if (arg4 == 2) {
			local9 = Static20.method1960(arg0, arg5, arg2);
		} else if (arg4 == 3) {
			local9 = Static22.method2414(arg0, arg5, arg2);
		}
		@Pc(67) int local67 = (int) local9 >> 14 & 0x1F;
		@Pc(74) int local74 = Integer.MAX_VALUE & (int) (local9 >>> 32);
		@Pc(81) int local81 = (int) local9 >> 20 & 0x3;
		@Pc(85) LocType local85 = LocTypeList.get(local74);
		if (local85.method4463()) {
			Static22.method4690(arg2, local85, arg0, arg5);
		}
		if (local9 == 0L) {
			return;
		}
		@Pc(105) Entity local105 = null;
		@Pc(107) Entity local107 = null;
		if (arg4 == 0) {
			@Pc(117) Class179 local117 = Static22.method2415(arg0, arg5, arg2);
			if (local117 != null) {
				local107 = local117.aClass53_4;
				local105 = local117.aClass53_5;
			}
			if (local85.anInt5509 != 0) {
				arg3.method569(local81, !local85.aBoolean385, arg5, local67, local85.aBoolean374, arg2);
			}
		} else if (arg4 == 1) {
			@Pc(155) Class182 local155 = Static32.method3881(arg0, arg5, arg2);
			if (local155 != null) {
				local105 = local155.aClass53_10;
				local107 = local155.aClass53_9;
			}
		} else if (arg4 == 2) {
			@Pc(173) Class33 local173 = Static24.method2593(arg0, arg5, arg2);
			if (local173 != null) {
				local105 = local173.aClass53_1;
			}
			if (local85.anInt5509 != 0 && arg5 + local85.anInt5527 < 104 && local85.anInt5527 + arg2 < 104 && arg5 + local85.anInt5516 < 104 && local85.anInt5516 + arg2 < 104) {
				arg3.method568(local81, arg2, local85.anInt5516, local85.aBoolean374, arg5, local85.anInt5527, !local85.aBoolean385);
			}
		} else if (arg4 == 3) {
			@Pc(238) Class42 local238 = Static25.method2932(arg0, arg5, arg2);
			if (local238 != null) {
				local105 = local238.aClass53_2;
			}
			if (local85.anInt5509 == 1) {
				arg3.method582(arg5, arg2);
			}
		}
		if (local85.anIntArray631 != null) {
			local85 = local85.method4453();
		}
		if (!GlRenderer.enabled || local85 == null || !local85.aBoolean372) {
			return;
		}
		if (local67 == 2) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3732();
			} else {
				Static15.method4592(arg5, 0, local81 + 4, arg1, local85, 0, arg2, local67);
			}
			if (local107 instanceof Class53_Sub7) {
				((Class53_Sub7) local107).method3732();
			} else {
				Static15.method4592(arg5, 0, local81 + 1 & 0x3, arg1, local85, 0, arg2, local67);
			}
		} else if (local67 == 5) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3732();
			} else {
				Static15.method4592(arg5, Static4.anIntArray315[local81] * 8, local81, arg1, local85, Static6.anIntArray475[local81] * 8, arg2, 4);
			}
		} else if (local67 == 6) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3732();
			} else {
				Static15.method4592(arg5, Static3.anIntArray166[local81] * 8, local81 + 4, arg1, local85, Static7.anIntArray646[local81] * 8, arg2, 4);
			}
		} else if (local67 == 7) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3732();
			} else {
				Static15.method4592(arg5, 0, (local81 + 2 & 0x3) + 4, arg1, local85, 0, arg2, 4);
			}
		} else if (local67 == 8) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3732();
			} else {
				Static15.method4592(arg5, Static3.anIntArray166[local81] * 8, local81 + 4, arg1, local85, Static7.anIntArray646[local81] * 8, arg2, 4);
			}
			if (local107 instanceof Class53_Sub7) {
				((Class53_Sub7) local107).method3732();
			} else {
				Static15.method4592(arg5, Static3.anIntArray166[local81] * 8, (local81 + 2 & 0x3) + 4, arg1, local85, Static7.anIntArray646[local81] * 8, arg2, 4);
			}
		} else if (local67 == 11) {
			if (local105 instanceof Class53_Sub7) {
				((Class53_Sub7) local105).method3732();
			} else {
				Static15.method4592(arg5, 0, local81 + 4, arg1, local85, 0, arg2, 10);
			}
		} else if (local105 instanceof Class53_Sub7) {
			((Class53_Sub7) local105).method3732();
		} else {
			Static15.method4592(arg5, 0, local81, arg1, local85, 0, arg2, local67);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLclient!io;)V")
	public static void method2019(@OriginalArg(1) Class4_Sub13 arg0) {
		ScriptRunner.method519(arg0, 200000);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIB)V")
	private static void method2021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub3_Sub9 local8 = Static12.method2322(13, arg1);
		local8.method1520();
		local8.anInt1993 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[F)[F")
	public static float[] method2023(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		if (arg1 == null) {
			return null;
		}
		if (arg0 != -5899) {
			method2021(49, 92);
		}
		@Pc(20) float[] local20 = new float[arg1.length];
		ArrayUtils.copy(arg1, 0, local20, 0, arg1.length);
		return local20;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(CLjava/lang/StringBuffer;IZ)Ljava/lang/StringBuffer;")
	public static StringBuffer method2024(@OriginalArg(1) StringBuffer arg0) {
		@Pc(14) int local14 = arg0.length();
		arg0.setLength(0);
		for (@Pc(19) int local19 = local14; local19 < 0; local19++) {
			arg0.setCharAt(local19, ' ');
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(B)V")
	public static void method2048() {
		Static6.aClass26_51.removeSoft();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIII)V")
	public static void method2050(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (InterfaceList.load(arg2)) {
			Static31.method3660(InterfaceList.components[arg2], arg0, arg1, -1, arg3);
		}
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V")
	public static void method2054() {
		@Pc(11) boolean local11 = false;
		while (!local11) {
			local11 = true;
			for (@Pc(17) int local17 = 0; local17 < Static7.anInt5634 - 1; local17++) {
				if (Static6.aShortArray100[local17] < 1000 && Static6.aShortArray100[local17 + 1] > 1000) {
					local11 = false;
					@Pc(43) String local43 = Static6.aStringArray27[local17];
					Static6.aStringArray27[local17] = Static6.aStringArray27[local17 + 1];
					Static6.aStringArray27[local17 + 1] = local43;
					@Pc(61) String local61 = Static6.aStringArray30[local17];
					Static6.aStringArray30[local17] = Static6.aStringArray30[local17 + 1];
					Static6.aStringArray30[local17 + 1] = local61;
					@Pc(79) int local79 = Static2.anIntArray117[local17];
					Static2.anIntArray117[local17] = Static2.anIntArray117[local17 + 1];
					Static2.anIntArray117[local17 + 1] = local79;
					local79 = Static6.anIntArray543[local17];
					Static6.anIntArray543[local17] = Static6.anIntArray543[local17 + 1];
					Static6.anIntArray543[local17 + 1] = local79;
					local79 = Static2.anIntArray160[local17];
					Static2.anIntArray160[local17] = Static2.anIntArray160[local17 + 1];
					Static2.anIntArray160[local17 + 1] = local79;
					@Pc(133) short local133 = Static6.aShortArray100[local17];
					Static6.aShortArray100[local17] = Static6.aShortArray100[local17 + 1];
					Static6.aShortArray100[local17 + 1] = local133;
					@Pc(151) long local151 = Static4.aLongArray56[local17];
					Static4.aLongArray56[local17] = Static4.aLongArray56[local17 + 1];
					Static4.aLongArray56[local17 + 1] = local151;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2060(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		Static3.aClass4_Sub10_Sub1_1.writeOpcode(215);
		Static3.aClass4_Sub10_Sub1_1.writeLong(Base37.encode(arg1));
		Static3.aClass4_Sub10_Sub1_1.writeByteC(arg0);
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
	public static void method2062() {
		for (@Pc(6) Class4_Sub27 local6 = (Class4_Sub27) Static4.aClass84_13.head(); local6 != null; local6 = (Class4_Sub27) Static4.aClass84_13.next()) {
			@Pc(11) int local11 = local6.anInt4620;
			if (InterfaceList.load(local11)) {
				@Pc(17) boolean local17 = true;
				@Pc(21) Component[] local21 = InterfaceList.components[local11];
				for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
					if (local21[local23] != null) {
						local17 = local21[local23].if3;
						break;
					}
				}
				if (!local17) {
					@Pc(50) int local50 = (int) local6.key;
					@Pc(54) Component local54 = InterfaceList.getComponent(local50);
					if (local54 != null) {
						Static28.method3270(local54);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public static void method2063() {
		Static3.aClass4_Sub10_Sub1_1.writeOpcode(189);
		for (@Pc(14) Class4_Sub27 local14 = (Class4_Sub27) Static4.aClass84_13.head(); local14 != null; local14 = (Class4_Sub27) Static4.aClass84_13.next()) {
			if (local14.anInt4619 == 0) {
				Static28.method3246(true, local14);
			}
		}
		if (Static6.aClass185_14 != null) {
			Static28.method3270(Static6.aClass185_14);
			Static6.aClass185_14 = null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)[Lclient!uj;")
	public static Sprite[] method2064() {
		@Pc(4) Sprite[] local4 = new Sprite[Static4.anInt2748];
		for (@Pc(16) int local16 = 0; local16 < Static4.anInt2748; local16++) {
			@Pc(27) int local27 = Static3.anIntArray185[local16] * Static7.anIntArray643[local16];
			@Pc(31) byte[] local31 = Static6.aByteArrayArray36[local16];
			if (Static5.aBooleanArray22[local16]) {
				@Pc(112) byte[] local112 = Static4.aByteArrayArray54[local16];
				@Pc(115) int[] local115 = new int[local27];
				for (@Pc(117) int local117 = 0; local117 < local27; local117++) {
					local115[local117] = Static2.anIntArray85[local31[local117] & 0xFF] | (local112[local117] & 0xFF) << 24;
				}
				if (GlRenderer.enabled) {
					local4[local16] = new GlAlphaSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[local16], Static5.anIntArray391[local16], Static3.anIntArray185[local16], Static7.anIntArray643[local16], local115);
				} else {
					local4[local16] = new SoftwareAlphaSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[local16], Static5.anIntArray391[local16], Static3.anIntArray185[local16], Static7.anIntArray643[local16], local115);
				}
			} else {
				@Pc(38) int[] local38 = new int[local27];
				for (@Pc(40) int local40 = 0; local40 < local27; local40++) {
					local38[local40] = Static2.anIntArray85[local31[local40] & 0xFF];
				}
				if (GlRenderer.enabled) {
					local4[local16] = new GlSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[local16], Static5.anIntArray391[local16], Static3.anIntArray185[local16], Static7.anIntArray643[local16], local38);
				} else {
					local4[local16] = new SoftwareSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[local16], Static5.anIntArray391[local16], Static3.anIntArray185[local16], Static7.anIntArray643[local16], local38);
				}
			}
		}
		Static37.method4670();
		return local4;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	public static void method2076(@OriginalArg(0) int arg0) {
		Static1.anInt929 = -1;
		if (arg0 == 37) {
			Static3.aFloat69 = 3.0F;
		} else if (arg0 == 50) {
			Static3.aFloat69 = 4.0F;
		} else if (arg0 == 75) {
			Static3.aFloat69 = 6.0F;
		} else if (arg0 == 100) {
			Static3.aFloat69 = 8.0F;
		} else if (arg0 == 200) {
			Static3.aFloat69 = 16.0F;
		}
		Static1.anInt929 = -1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V")
	public static void method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static1.anInt525 = arg3;
		Static5.anInt3731 = arg4;
		Static6.anInt4558 = arg2;
		Static6.anInt4403 = arg0;
		Static4.anInt3258 = arg1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILjava/lang/String;)V")
	private static void method2079(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class4_Sub3_Sub9 local13 = Static12.method2322(3, arg0);
		local13.method1520();
		local13.aString109 = arg1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII)V")
	public static void method2081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Component local4 = Static23.method2425(arg5, arg3);
		if (local4 != null && local4.anObjectArray13 != null) {
			@Pc(15) Class4_Sub13 local15 = new Class4_Sub13();
			local15.arguments = local4.anObjectArray13;
			local15.source = local4;
			method2019(local15);
		}
		Static3.aBoolean177 = true;
		Static7.anInt6050 = arg2;
		Static5.anInt4224 = arg1;
		Static2.anInt1367 = arg3;
		Static6.anInt4466 = arg4;
		Static1.anInt1053 = arg5;
		Static5.anInt3560 = arg0;
		Static28.method3270(local4);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
	public static void method2082() {
		Static7.aClass26_56.clean(5);
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "([I[IIIIIIII)V")
	public static void method2182(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) int local2 = -arg4;
		for (@Pc(5) int local5 = -arg5; local5 < 0; local5++) {
			for (@Pc(9) int local9 = local2; local9 < 0; local9++) {
				@Pc(16) int local16 = arg1[arg2++];
				@Pc(20) int local20 = local16 >>> 24;
				if (local20 == 0) {
					arg3++;
				} else {
					@Pc(26) int local26 = 256 - local20;
					@Pc(30) int local30 = arg0[arg3];
					arg0[arg3++] = ((local16 & 0xFF00FF) * local20 + (local30 & 0xFF00FF) * local26 & 0xFF00FF00) + ((local16 & 0xFF00) * local20 + (local30 & 0xFF00) * local26 & 0xFF0000) >>> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "([I[IIIIIIII)V")
	public static void method2183(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) int local2 = -arg4;
		for (@Pc(5) int local5 = -arg5; local5 < 0; local5++) {
			for (@Pc(9) int local9 = local2; local9 < 0; local9++) {
				@Pc(16) int local16 = arg1[arg2--];
				@Pc(20) int local20 = local16 >>> 24;
				if (local20 == 0) {
					arg3++;
				} else {
					@Pc(26) int local26 = 256 - local20;
					@Pc(30) int local30 = arg0[arg3];
					arg0[arg3++] = ((local16 & 0xFF00FF) * local20 + (local30 & 0xFF00FF) * local26 & 0xFF00FF00) + ((local16 & 0xFF00) * local20 + (local30 & 0xFF00) * local26 & 0xFF0000) >>> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "([I[IIIIIIIIIII)V")
	public static void method2184(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * arg10;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				@Pc(25) int local25 = arg1[(arg2 >> 16) + local12];
				@Pc(29) int local29 = local25 >>> 24;
				if (local29 == 0) {
					arg4++;
				} else {
					@Pc(35) int local35 = 256 - local29;
					@Pc(39) int local39 = arg0[arg4];
					arg0[arg4++] = ((local25 & 0xFF00FF) * local29 + (local39 & 0xFF00FF) * local35 & 0xFF00FF00) + ((local25 & 0xFF00) * local29 + (local39 & 0xFF00) * local35 & 0xFF0000) >>> 8;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "([I[IIIIIIIIIIII)V")
	public static void method2185(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * arg10;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				@Pc(25) int local25 = arg1[(arg2 >> 16) + local12];
				@Pc(29) int local29 = arg0[arg4];
				@Pc(37) int local37 = (local25 >>> 24) * arg11 >> 8;
				@Pc(41) int local41 = 256 - local37;
				arg0[arg4++] = ((local25 & 0xFF00FF) * local37 + (local29 & 0xFF00FF) * local41 & 0xFF00FF00) + ((local25 & 0xFF00) * local37 + (local29 & 0xFF00) * local41 & 0xFF0000) >>> 8;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}
}

import java.io.IOException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!wf;)Z")
	public static boolean method4402(@OriginalArg(1) Component arg0) {
		if (arg0.anInt5904 == 205) {
			Static1.anInt885 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
	public static void method4404(@OriginalArg(1) int arg0) {
		Static1.anInt929 = -1;
		Static1.anInt929 = -1;
		Static7.anInt5231 = arg0;
		Static28.method3249();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
	public static void method4405(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub9 local10 = Static12.method2322(11, arg0);
		local10.method1519();
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method4406() {
		@Pc(6) int local6 = Static5.aClass4_Sub10_Sub1_2.readBits(8);
		if (Static3.anInt2510 > local6) {
			for (@Pc(23) int local23 = local6; local23 < Static3.anInt2510; local23++) {
				Static2.anIntArray99[Static5.anInt4195++] = Static4.anIntArray317[local23];
			}
		}
		if (local6 > Static3.anInt2510) {
			throw new RuntimeException("gppov1");
		}
		Static3.anInt2510 = 0;
		for (@Pc(55) int local55 = 0; local55 < local6; local55++) {
			@Pc(62) int local62 = Static4.anIntArray317[local55];
			@Pc(66) Player local66 = Player.players[local62];
			@Pc(73) int local73 = Static5.aClass4_Sub10_Sub1_2.readBits(1);
			if (local73 == 0) {
				Static4.anIntArray317[Static3.anInt2510++] = local62;
				local66.anInt3990 = Static2.anInt954;
			} else {
				@Pc(94) int local94 = Static5.aClass4_Sub10_Sub1_2.readBits(2);
				if (local94 == 0) {
					Static4.anIntArray317[Static3.anInt2510++] = local62;
					local66.anInt3990 = Static2.anInt954;
					Static7.anIntArray587[Static6.anInt4760++] = local62;
				} else if (local94 == 1) {
					Static4.anIntArray317[Static3.anInt2510++] = local62;
					local66.anInt3990 = Static2.anInt954;
					@Pc(140) int local140 = Static5.aClass4_Sub10_Sub1_2.readBits(3);
					local66.method3308(local140, 1);
					@Pc(150) int local150 = Static5.aClass4_Sub10_Sub1_2.readBits(1);
					if (local150 == 1) {
						Static7.anIntArray587[Static6.anInt4760++] = local62;
					}
				} else if (local94 == 2) {
					Static4.anIntArray317[Static3.anInt2510++] = local62;
					local66.anInt3990 = Static2.anInt954;
					if (Static5.aClass4_Sub10_Sub1_2.readBits(1) == 1) {
						@Pc(193) int local193 = Static5.aClass4_Sub10_Sub1_2.readBits(3);
						local66.method3308(local193, 2);
						@Pc(205) int local205 = Static5.aClass4_Sub10_Sub1_2.readBits(3);
						local66.method3308(local205, 2);
					} else {
						@Pc(219) int local219 = Static5.aClass4_Sub10_Sub1_2.readBits(3);
						local66.method3308(local219, 0);
					}
					@Pc(229) int local229 = Static5.aClass4_Sub10_Sub1_2.readBits(1);
					if (local229 == 1) {
						Static7.anIntArray587[Static6.anInt4760++] = local62;
					}
				} else if (local94 == 3) {
					Static2.anIntArray99[Static5.anInt4195++] = local62;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIIII)V")
	public static void method4433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class4_Sub3_Sub9 local6 = Static12.method2322(10, arg3);
		local6.method1520();
		local6.anInt2001 = arg0;
		local6.anInt1994 = arg1;
		local6.anInt1993 = arg2;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
	public static String method4434(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) char local3 = ',';
		@Pc(5) char local5 = '.';
		@Pc(11) boolean local11 = false;
		if (arg3 == 0) {
			local5 = ',';
			local3 = '.';
		}
		if (arg3 == 2) {
			local5 = ' ';
		}
		if (arg0 < 0L) {
			local11 = true;
			arg0 = -arg0;
		}
		@Pc(53) StringBuffer local53 = new StringBuffer(26);
		if (arg2 > 0) {
			for (@Pc(58) int local58 = 0; local58 < arg2; local58++) {
				@Pc(68) int local68 = (int) arg0;
				arg0 /= 10L;
				local53.append((char) (local68 + 48 - (int) arg0 * 10));
			}
			local53.append(local3);
		}
		@Pc(93) int local93 = 0;
		while (true) {
			@Pc(96) int local96 = (int) arg0;
			arg0 /= 10L;
			local53.append((char) (local96 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local11) {
					local53.append('-');
				}
				return local53.reverse().toString();
			}
			if (arg1) {
				local93++;
				if (local93 % 3 == 0) {
					local53.append(local5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLclient!fg;ILclient!ho;)V")
	public static void method3811(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub3_Sub7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class82 arg3) {
		if (arg3.anIntArray188 != null) {
			@Pc(10) boolean local10 = false;
			@Pc(15) int[] local15 = new int[arg3.anIntArray188.length];
			for (@Pc(17) int local17 = 0; local17 < local15.length / 2; local17++) {
				@Pc(37) int local37 = arg3.anIntArray188[local17 * 2] + arg1.anInt1768;
				@Pc(50) int local50 = arg1.anInt1769 - arg3.anIntArray188[local17 * 2 + 1];
				@Pc(71) int local71 = local15[local17 * 2] = Static3.anInt2969 + (local37 - Static3.anInt2973) * (Static3.anInt2970 - Static3.anInt2969) / (Static3.anInt2972 - Static3.anInt2973);
				@Pc(95) int local95 = local15[local17 * 2 + 1] = Static3.anInt2968 + (local50 - Static3.anInt2967) * (Static3.anInt2971 - Static3.anInt2968) / (Static3.anInt2966 - Static3.anInt2967);
				if (Static3.anInt2969 < local71 && local71 < Static3.anInt2970 && Static3.anInt2968 < local95 && local95 < Static3.anInt2971) {
					local10 = true;
				}
			}
			if (!local10) {
				return;
			}
			Static17.method1628(local15, arg3.anInt2283, arg3.anInt2283 >>> 24);
			for (@Pc(134) int local134 = 0; local134 < local15.length / 2 - 1; local134++) {
				Static34.method4230(local15[local134 * 2], local15[local134 * 2 + 1], local15[(local134 + 1) * 2], local15[(local134 + 1) * 2 + 1], arg3.anInt2266, arg3.anInt2266 >>> 24);
			}
			Static34.method4230(local15[local15.length - 2], local15[local15.length - 1], local15[0], local15[1], arg3.anInt2266, arg3.anInt2266 >>> 24);
		} else if (arg1.aBoolean106) {
			return;
		}
		@Pc(222) Class4_Sub17 local222 = new Class4_Sub17(arg1);
		@Pc(224) SoftwareIndexedSprite local224 = null;
		if (arg3.anInt2277 != -1) {
			if (arg1.aBoolean105 && arg3.anInt2291 != -1) {
				local224 = (SoftwareIndexedSprite) arg3.method1811(true, true);
			} else {
				local224 = (SoftwareIndexedSprite) arg3.method1811(false, true);
			}
			if (local224 != null) {
				if (Static4.anInt2853 > 0 && (Static5.anInt3920 != -1 && arg1.anInt1760 == Static5.anInt3920 || Static2.anInt1874 != -1 && arg3.anInt2284 == Static2.anInt1874)) {
					@Pc(290) int local290;
					if (Static5.anInt4215 <= 50) {
						local290 = Static5.anInt4215 * 3;
					} else {
						local290 = 300 - Static5.anInt4215 * 3;
					}
					Static33.method4206(arg1.anInt1766, arg1.anInt1764, local224.anInt3408 / 2 + 7, 16776960, local290);
					Static33.method4206(arg1.anInt1766, arg1.anInt1764, local224.anInt3408 / 2 + 5, 16776960, local290);
					Static33.method4206(arg1.anInt1766, arg1.anInt1764, local224.anInt3408 / 2 + 3, 16776960, local290);
					Static33.method4206(arg1.anInt1766, arg1.anInt1764, local224.anInt3408 / 2 + 1, 16776960, local290);
					Static33.method4206(arg1.anInt1766, arg1.anInt1764, local224.anInt3408 / 2, 16776960, local290);
				}
				local224.method2815(arg1.anInt1766 - (local224.anInt3408 >> 1), arg1.anInt1764 - (local224.anInt3413 >> 1));
				local222.anInt3461 = (local224.anInt3413 >> 1) + arg2 + arg1.anInt1764;
				local222.anInt3457 = arg0 + arg1.anInt1766 - (local224.anInt3408 >> 1);
				local222.anInt3462 = (local224.anInt3408 >> 1) + arg0 + arg1.anInt1766;
				local222.anInt3459 = arg2 + arg1.anInt1764 - (local224.anInt3413 >> 1);
			}
		}
		if (arg3.aString131 != null) {
			if (local224 == null) {
				Static28.method3244(arg1, arg0, 0, arg2, true, local222, arg3);
			} else {
				Static28.method3244(arg1, arg0, (local224.anInt3413 >> 1) + 5, arg2, false, local222, arg3);
			}
		}
		if (local222.method2923(Mouse.x, Mouse.y) && arg3.aStringArray15 != null) {
			if (arg3.aStringArray15[4] != null) {
				Static16.method1497((long) arg1.anInt1760, arg3.anInt2284, 0, arg3.aString130, arg3.aStringArray15[4], (short) 1011, -1);
			}
			if (arg3.aStringArray15[3] != null) {
				Static16.method1497((long) arg1.anInt1760, arg3.anInt2284, 0, arg3.aString130, arg3.aStringArray15[3], (short) 1003, -1);
			}
			if (arg3.aStringArray15[2] != null) {
				Static16.method1497((long) arg1.anInt1760, arg3.anInt2284, 0, arg3.aString130, arg3.aStringArray15[2], (short) 1008, -1);
			}
			if (arg3.aStringArray15[1] != null) {
				Static16.method1497((long) arg1.anInt1760, arg3.anInt2284, 0, arg3.aString130, arg3.aStringArray15[1], (short) 1002, -1);
			}
			if (arg3.aStringArray15[0] != null) {
				Static16.method1497((long) arg1.anInt1760, arg3.anInt2284, 0, arg3.aString130, arg3.aStringArray15[0], (short) 1012, -1);
			}
		}
		Static3.aClass112_13.addTail(local222);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!wf;I)V")
	public static void method3812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		if (arg2.aByte26 == 0) {
			arg2.anInt5960 = arg2.anInt5928;
		} else if (arg2.aByte26 == 1) {
			arg2.anInt5960 = arg2.anInt5928 + (arg0 - arg2.anInt5893) / 2;
		} else if (arg2.aByte26 == 2) {
			arg2.anInt5960 = arg0 - arg2.anInt5928 - arg2.anInt5893;
		} else if (arg2.aByte26 == 3) {
			arg2.anInt5960 = arg2.anInt5928 * arg0 >> 14;
		} else if (arg2.aByte26 == 4) {
			arg2.anInt5960 = (arg2.anInt5928 * arg0 >> 14) + (arg0 - arg2.anInt5893) / 2;
		} else {
			arg2.anInt5960 = arg0 - (arg0 * arg2.anInt5928 >> 14) - arg2.anInt5893;
		}
		if (arg2.aByte25 == 0) {
			arg2.anInt5888 = arg2.anInt5951;
		} else if (arg2.aByte25 == 1) {
			arg2.anInt5888 = arg2.anInt5951 + (arg1 - arg2.anInt5949) / 2;
		} else if (arg2.aByte25 == 2) {
			arg2.anInt5888 = arg1 - arg2.anInt5949 - arg2.anInt5951;
		} else if (arg2.aByte25 == 3) {
			arg2.anInt5888 = arg1 * arg2.anInt5951 >> 14;
		} else if (arg2.aByte25 == 4) {
			arg2.anInt5888 = (arg2.anInt5951 * arg1 >> 14) + (arg1 - arg2.anInt5949) / 2;
		} else {
			arg2.anInt5888 = arg1 - (arg2.anInt5951 * arg1 >> 14) - arg2.anInt5949;
		}
		if (!Static1.aBoolean26 || Static12.method687(arg2).anInt3947 == 0 && arg2.type != 0) {
			return;
		}
		if (arg2.anInt5888 < 0) {
			arg2.anInt5888 = 0;
		} else if (arg2.anInt5949 + arg2.anInt5888 > arg1) {
			arg2.anInt5888 = arg1 - arg2.anInt5949;
		}
		if (arg2.anInt5960 < 0) {
			arg2.anInt5960 = 0;
		} else if (arg0 < arg2.anInt5960 + arg2.anInt5893) {
			arg2.anInt5960 = arg0 - arg2.anInt5893;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method3814(@OriginalArg(0) Js5 arg0) {
		Static1.aClass58_2 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method4436() {
		@Pc(5) String local5 = "www";
		if (client.modeWhere != 0) {
			local5 = "www-wtqa";
		}
		@Pc(12) String local12 = "";
		if (client.settings != null) {
			local12 = "/p=" + client.settings;
		}
		return "http://" + local5 + ".openrs2.dev/l=" + client.language + "/a=" + client.affiliate + local12 + "/";
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 + arg5 > arg6 && arg7 + arg6 > arg1) {
			return arg0 < arg2 + arg4 && arg4 < arg3 + arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Z")
	public static boolean method4442() {
		try {
			return Static21.method3287();
		} catch (@Pc(16) IOException local16) {
			Static23.method2455();
			return true;
		} catch (@Pc(21) Exception local21) {
			@Pc(63) String local63 = "T2 - " + Static1.anInt552 + "," + Static3.anInt2273 + "," + Static2.anInt1231 + " - " + Static1.anInt1052 + "," + (Static5.originX + Player.self.anIntArray422[0]) + "," + (Static7.originZ + Player.self.anIntArray426[0]) + " - ";
			for (@Pc(65) int local65 = 0; Static1.anInt1052 > local65 && local65 < 50; local65++) {
				local63 = local63 + Static5.aClass4_Sub10_Sub1_2.bytes[local65] + ",";
			}
			TracingException.report(local21, local63);
			Static19.method1818();
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIIII)I")
	public static int method4443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = arg2 & 0xF;
		@Pc(32) int local32 = local9 >= 4 ? (local9 == 12 || local9 == 14 ? arg1 : arg3) : arg0;
		@Pc(39) int local39 = local9 < 8 ? arg1 : arg0;
		return ((local9 & 0x2) == 0 ? local32 : -local32) + ((local9 & 0x1) == 0 ? local39 : -local39);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII)V")
	public static void method4444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * Preferences.musicVolume >> 8;
		if (arg1 == -1 && !Static4.aBoolean210) {
			Static37.method4718();
		} else if (arg1 != -1 && (Static6.anInt4844 != arg1 || !Static16.method1550()) && arg0 != 0 && !Static4.aBoolean210) {
			Static24.method2692(client.js5Archive6, arg0, arg1);
		}
		Static6.anInt4844 = arg1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([[III)I")
	public static int method3821(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(7) int local7 = arg2 >> 7;
		if (local3 < 0 || local7 < 0 || local3 >= arg0.length || local7 >= arg0[0].length) {
			return 0;
		}
		@Pc(27) int local27 = arg1 & 0x7F;
		@Pc(31) int local31 = arg2 & 0x7F;
		@Pc(53) int local53 = arg0[local3][local7] * (128 - local27) + arg0[local3 + 1][local7] * local27 >> 7;
		@Pc(79) int local79 = arg0[local3][local7 + 1] * (128 - local27) + arg0[local3 + 1][local7 + 1] * local27 >> 7;
		return local53 * (128 - local31) + local79 * local31 >> 7;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method4447() {
		Static7.aClass4_Sub3_Sub14_9 = null;
		Static6.aClass4_Sub3_Sub14_8 = null;
		Static1.aClass4_Sub3_Sub14_1 = null;
		Static6.aClass4_Sub3_Sub14_5 = null;
		Static2.aClass4_Sub3_Sub14_2 = null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public static void method4448() {
		Static7.aClass26_56.clear();
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
	public static void method4455() {
		if (Static4.anInt3304 == 10 && GlRenderer.enabled) {
			Static9.method233(28);
		}
		if (Static4.anInt3304 == 30) {
			Static9.method233(25);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZ)V")
	public static void method4462(@OriginalArg(0) byte arg0) {
		if (Static1.aByteArrayArrayArray2 == null) {
			Static1.aByteArrayArrayArray2 = new byte[4][104][104];
		}
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			for (@Pc(17) int local17 = 0; local17 < 104; local17++) {
				for (@Pc(24) int local24 = 0; local24 < 104; local24++) {
					Static1.aByteArrayArrayArray2[local12][local17][local24] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method4522() {
		Static6.anInt4760 = 0;
		Static5.anInt4195 = 0;
		Static26.method3056();
		Static12.method734();
		Static35.method4298();
		for (@Pc(17) int local17 = 0; local17 < Static5.anInt4195; local17++) {
			@Pc(28) int local28 = Static2.anIntArray99[local17];
			if (Static2.anInt954 != Npc.npcs[local28].anInt3990) {
				if (Npc.npcs[local28].type.method4260()) {
					Static25.method2931(Npc.npcs[local28]);
				}
				Npc.npcs[local28].setType(null);
				Npc.npcs[local28] = null;
			}
		}
		if (Static5.aClass4_Sub10_Sub1_2.position != Static1.anInt1052) {
			throw new RuntimeException("gnp1 pos:" + Static5.aClass4_Sub10_Sub1_2.position + " psize:" + Static1.anInt1052);
		}
		for (@Pc(87) int local87 = 0; local87 < Npc.size; local87++) {
			if (Npc.npcs[Npc.ids[local87]] == null) {
				throw new RuntimeException("gnp2 pos:" + local87 + " size:" + Npc.size);
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!fh;Lclient!fh;)V")
	public static void method4523(@OriginalArg(1) Js5 arg0, @OriginalArg(2) Js5 arg1) {
		Static3.aClass58_48 = arg0;
		Static6.aClass58_85 = arg1;
		Static1.anInt119 = Static6.aClass58_85.getGroupCapacity(3);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V")
	public static void method4524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (GlRenderer.enabled) {
			Static18.method1693(arg2, arg3, arg1 + arg2, arg0 + arg3);
			Static18.method1701(arg2, arg3, arg1, arg0, 0);
		} else {
			Static34.method4209(arg2, arg3, arg2 + arg1, arg3 + arg0);
			Static33.method4205(arg2, arg3, arg1, arg0, 0);
		}
		if (Static4.anInt2644 < 100) {
			return;
		}
		@Pc(51) float local51 = (float) Static3.anInt2960 / (float) Static3.anInt2965;
		@Pc(57) int local57 = arg1;
		@Pc(59) int local59 = arg0;
		if (local51 < 1.0F) {
			local59 = (int) (local51 * (float) arg1);
		} else {
			local57 = (int) ((float) arg0 / local51);
		}
		arg2 += (arg1 - local57) / 2;
		arg3 += (arg0 - local59) / 2;
		if (Static4.aClass4_Sub3_Sub14_3 == null || arg1 != Static4.aClass4_Sub3_Sub14_3.width || arg0 != Static4.aClass4_Sub3_Sub14_3.height) {
			@Pc(117) SoftwareSprite local117 = new SoftwareSprite(arg1, arg0);
			Static34.method4224(local117.pixels, arg1, arg0);
			if (Static3.aClass4_Sub3_Sub22_3.anInt5995 != -1) {
				Static33.method4205(0, 0, arg1, arg0, Static3.aClass4_Sub3_Sub22_3.anInt5995);
			}
			Static19.method2401(0, 0, Static3.anInt2965, Static3.anInt2960, 0, 0, local57, local59);
			Static20.method2403();
			if (GlRenderer.enabled) {
				Static4.aClass4_Sub3_Sub14_3 = new GlSprite(local117);
			} else {
				Static4.aClass4_Sub3_Sub14_3 = local117;
			}
			if (GlRenderer.enabled) {
				Static6.anIntArray561 = null;
			} else {
				client.frameBuffer.makeTarget();
			}
		}
		@Pc(166) int local166 = 16711680;
		Static4.aClass4_Sub3_Sub14_3.method4510(arg2, arg3);
		@Pc(176) int local176 = Static7.anInt5331 * local57 / Static3.anInt2965;
		@Pc(184) int local184 = arg3 + local59 * Static5.anInt3546 / Static3.anInt2960;
		@Pc(190) int local190 = Static7.anInt5680 * local59 / Static3.anInt2960;
		if (client.game == 1) {
			local166 = 16777215;
		}
		@Pc(207) int local207 = arg2 + Static3.anInt2542 * local57 / Static3.anInt2965;
		if (GlRenderer.enabled) {
			Static18.method1691(local207, local184, local176, local190, local166, 128);
			Static18.method1690(local207, local184, local176, local190, local166);
		} else {
			Static34.method4213(local207, local184, local176, local190, local166, 128);
			Static34.method4222(local207, local184, local176, local190, local166);
		}
		if (Static4.anInt2853 <= 0) {
			return;
		}
		@Pc(255) int local255;
		if (Static5.anInt4215 > 50) {
			local255 = 500 - Static5.anInt4215 * 5;
		} else {
			local255 = Static5.anInt4215 * 5;
		}
		for (@Pc(266) Class4_Sub3_Sub7 local266 = (Class4_Sub3_Sub7) Static3.aClass175_12.head(); local266 != null; local266 = (Class4_Sub3_Sub7) Static3.aClass175_12.next()) {
			@Pc(273) Class82 local273 = Static22.method2191(local266.anInt1760);
			if (Static8.method120(local273)) {
				if (local266.anInt1760 == Static5.anInt3920) {
					@Pc(290) int local290 = local57 * local266.anInt1768 / Static3.anInt2965 + arg2;
					@Pc(299) int local299 = arg3 + local59 * local266.anInt1769 / Static3.anInt2960;
					if (GlRenderer.enabled) {
						Static18.method1691(local290 - 2, local299 - 2, 4, 4, 16776960, local255);
					} else {
						Static34.method4213(local290 - 2, local299 - 2, 4, 4, 16776960, local255);
					}
				} else if (Static2.anInt1874 != -1 && local273.anInt2284 == Static2.anInt1874) {
					@Pc(349) int local349 = arg2 + local266.anInt1768 * local57 / Static3.anInt2965;
					@Pc(358) int local358 = arg3 + local59 * local266.anInt1769 / Static3.anInt2960;
					if (GlRenderer.enabled) {
						Static18.method1691(local349 - 2, local358 - 2, 4, 4, 16776960, local255);
					} else {
						Static34.method4213(local349 - 2, local358 - 2, 4, 4, 16776960, local255);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!ld;Lclient!fh;Lclient!fh;ZLclient!fh;)Z")
	public static boolean method4551(@OriginalArg(0) Class4_Sub6_Sub2 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(4) Js5 arg3) {
		Static1.aClass4_Sub6_Sub2_3 = arg0;
		Static3.aClass58_59 = arg1;
		Static6.aClass58_93 = arg3;
		Static2.aClass58_41 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[IIIIIIIII)V")
	public static void method2166(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = 256 - arg8;
		for (@Pc(6) int local6 = -arg5; local6 < 0; local6++) {
			for (@Pc(11) int local11 = -arg4; local11 < 0; local11++) {
				@Pc(18) int local18 = arg1[arg2++];
				if (local18 == 0) {
					arg3++;
				} else {
					@Pc(24) int local24 = arg0[arg3];
					arg0[arg3++] = ((local18 & 0xFF00FF) * arg8 + (local24 & 0xFF00FF) * local3 & 0xFF00FF00) + ((local18 & 0xFF00) * arg8 + (local24 & 0xFF00) * local3 & 0xFF0000) >> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[IIIIIIIIIII)V")
	public static void method2172(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * arg10;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				@Pc(25) int local25 = arg1[(arg2 >> 16) + local12];
				if (local25 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = local25;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[IIIIIIII)V")
	public static void method2175(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			for (@Pc(16) int local16 = local4; local16 < 0; local16++) {
				@Pc(21) int local21 = arg2 - 1;
				@Pc(23) int local23 = arg1[arg2];
				@Pc(28) int local28;
				if (local23 == 0) {
					local28 = arg3 + 1;
				} else {
					local28 = arg3 + 1;
					arg0[arg3] = local23;
				}
				@Pc(35) int local35 = local21 - 1;
				@Pc(37) int local37 = arg1[local21];
				@Pc(42) int local42;
				if (local37 == 0) {
					local42 = local28 + 1;
				} else {
					local42 = local28 + 1;
					arg0[local28] = local37;
				}
				@Pc(49) int local49 = local35 - 1;
				@Pc(51) int local51 = arg1[local35];
				@Pc(56) int local56;
				if (local51 == 0) {
					local56 = local42 + 1;
				} else {
					local56 = local42 + 1;
					arg0[local42] = local51;
				}
				arg2 = local49 - 1;
				@Pc(65) int local65 = arg1[local49];
				if (local65 == 0) {
					arg3 = local56 + 1;
				} else {
					arg3 = local56 + 1;
					arg0[local56] = local65;
				}
			}
			for (@Pc(78) int local78 = arg4; local78 < 0; local78++) {
				@Pc(85) int local85 = arg1[arg2--];
				if (local85 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local85;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "([I[IIIIIIII)V")
	public static void method2179(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			for (@Pc(16) int local16 = local4; local16 < 0; local16++) {
				@Pc(21) int local21 = arg2 + 1;
				@Pc(23) int local23 = arg1[arg2];
				@Pc(28) int local28;
				if (local23 == 0) {
					local28 = arg3 + 1;
				} else {
					local28 = arg3 + 1;
					arg0[arg3] = local23;
				}
				@Pc(35) int local35 = local21 + 1;
				@Pc(37) int local37 = arg1[local21];
				@Pc(42) int local42;
				if (local37 == 0) {
					local42 = local28 + 1;
				} else {
					local42 = local28 + 1;
					arg0[local28] = local37;
				}
				@Pc(49) int local49 = local35 + 1;
				@Pc(51) int local51 = arg1[local35];
				@Pc(56) int local56;
				if (local51 == 0) {
					local56 = local42 + 1;
				} else {
					local56 = local42 + 1;
					arg0[local42] = local51;
				}
				arg2 = local49 + 1;
				@Pc(65) int local65 = arg1[local49];
				if (local65 == 0) {
					arg3 = local56 + 1;
				} else {
					arg3 = local56 + 1;
					arg0[local56] = local65;
				}
			}
			for (@Pc(78) int local78 = arg4; local78 < 0; local78++) {
				@Pc(85) int local85 = arg1[arg2++];
				if (local85 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local85;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[IIIIIII)V")
	public static void method2180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(2) int local2 = -arg5; local2 < 0; local2++) {
			@Pc(10) int local10 = arg3 + arg4 - 3;
			while (arg3 < local10) {
				@Pc(16) int local16 = arg3 + 1;
				@Pc(19) int local19 = arg2 + 1;
				arg0[arg3] = arg1[arg2];
				arg0[local16++] = arg1[local19++];
				arg0[local16++] = arg1[local19++];
				arg3 = local16 + 1;
				arg2 = local19 + 1;
				arg0[local16] = arg1[local19];
			}
			@Pc(47) int local47 = local10 + 3;
			while (arg3 < local47) {
				arg0[arg3++] = arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[IIIIIIIIIIII)V")
	public static void method2181(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = 256 - arg11;
		@Pc(5) int local5 = arg2;
		for (@Pc(8) int local8 = -arg7; local8 < 0; local8++) {
			@Pc(16) int local16 = (arg3 >> 16) * arg10;
			for (@Pc(19) int local19 = -arg6; local19 < 0; local19++) {
				@Pc(29) int local29 = arg1[(arg2 >> 16) + local16];
				if (local29 == 0) {
					arg4++;
				} else {
					@Pc(35) int local35 = arg0[arg4];
					arg0[arg4++] = ((local29 & 0xFF00FF) * arg11 + (local35 & 0xFF00FF) * local3 & 0xFF00FF00) + ((local29 & 0xFF00) * arg11 + (local35 & 0xFF00) * local3 & 0xFF0000) >> 8;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local5;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static2.anInt902 && arg5 <= Static3.anInt2553 && Static4.anInt3086 <= arg6 && arg4 <= Static5.anInt4230) {
			Static9.method758(arg1, arg5, arg6, arg0, arg4, arg2, arg3);
		} else {
			Static22.method2190(arg4, arg3, arg2, arg1, arg0, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	public static void method4567() {
		Static3.aClass4_Sub10_Sub1_1.writeOpcode(156);
		Static3.aClass4_Sub10_Sub1_1.writeShort(Static7.anInt5426);
	}
}

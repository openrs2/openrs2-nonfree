import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class144 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	private int anInt4372;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "[I")
	public int[] anIntArray463;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "Z")
	public boolean aBoolean306;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
	public int anInt4387;

	@OriginalMember(owner = "client!qk", name = "y", descriptor = "[I")
	private int[] anIntArray464;

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)V")
	public final void method3604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static1.anIntArray46[arg0];
		if (this.anIntArray464[local7] != 0 && Static19.method1816(arg1) != null) {
			this.anIntArray464[local7] = Integer.MIN_VALUE | arg1;
			this.method3606();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V")
	public final void method3605(@OriginalArg(0) boolean arg0) {
		this.aBoolean306 = arg0;
		this.method3606();
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	private void method3606() {
		@Pc(8) long local8 = this.aLong153;
		@Pc(10) long[] local10 = BufferedFile.CRC64_TABLE;
		this.aLong153 = -1L;
		this.aLong153 = this.aLong153 >>> 8 ^ local10[(int) (((long) (this.anInt4372 >> 8) ^ this.aLong153) & 0xFFL)];
		this.aLong153 = local10[(int) ((this.aLong153 ^ (long) this.anInt4372) & 0xFFL)] ^ this.aLong153 >>> 8;
		for (@Pc(53) int local53 = 0; local53 < 12; local53++) {
			this.aLong153 = this.aLong153 >>> 8 ^ local10[(int) (((long) (this.anIntArray464[local53] >> 24) ^ this.aLong153) & 0xFFL)];
			this.aLong153 = this.aLong153 >>> 8 ^ local10[(int) (((long) (this.anIntArray464[local53] >> 16) ^ this.aLong153) & 0xFFL)];
			this.aLong153 = local10[(int) ((this.aLong153 ^ (long) (this.anIntArray464[local53] >> 8)) & 0xFFL)] ^ this.aLong153 >>> 8;
			this.aLong153 = local10[(int) ((this.aLong153 ^ (long) this.anIntArray464[local53]) & 0xFFL)] ^ this.aLong153 >>> 8;
		}
		for (@Pc(147) int local147 = 0; local147 < 5; local147++) {
			this.aLong153 = this.aLong153 >>> 8 ^ local10[(int) (((long) this.anIntArray463[local147] ^ this.aLong153) & 0xFFL)];
		}
		this.aLong153 = local10[(int) ((this.aLong153 ^ (long) (this.aBoolean306 ? 1 : 0)) & 0xFFL)] ^ this.aLong153 >>> 8;
		if (local8 != 0L && this.aLong153 != local8) {
			Static2.aClass26_12.method512(local8);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([Lclient!re;IIILclient!eg;IIZILclient!eg;ZI)Lclient!vg;")
	public final Class53_Sub4 method3608(@OriginalArg(0) Class150[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class46 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		if (this.anInt4387 != -1) {
			return Static15.method1495(this.anInt4387).method4268(arg5, arg7, arg4, arg8, arg2, arg0, arg3, arg1, arg10);
		}
		@Pc(51) int[] local51 = this.anIntArray464;
		@Pc(54) long local54 = this.aLong153;
		if (arg8 != null && (arg8.anInt1224 >= 0 || arg8.anInt1232 >= 0)) {
			local51 = new int[12];
			for (@Pc(75) int local75 = 0; local75 < 12; local75++) {
				local51[local75] = this.anIntArray464[local75];
			}
			if (arg8.anInt1224 >= 0) {
				if (arg8.anInt1224 == 65535) {
					local51[5] = 0;
					local54 ^= -4294967296L;
				} else {
					local51[5] = arg8.anInt1224 | 0x40000000;
					local54 ^= (long) local51[5] << 32;
				}
			}
			if (arg8.anInt1232 >= 0) {
				if (arg8.anInt1232 == 65535) {
					local54 ^= 4294967295L;
					local51[3] = 0;
				} else {
					local51[3] = arg8.anInt1232 | 0x40000000;
					local54 ^= local51[3];
				}
			}
		}
		@Pc(169) Class53_Sub4 local169 = (Class53_Sub4) Static2.aClass26_12.method518(local54);
		if (local169 == null) {
			@Pc(174) boolean local174 = false;
			for (@Pc(176) int local176 = 0; local176 < 12; local176++) {
				@Pc(185) int local185 = local51[local176];
				if ((local185 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local185) != 0 && !Static19.method1816(local185 & 0x3FFFFFFF).method3494()) {
						local174 = true;
					}
				} else if (!Static35.method4361(local185 & 0x3FFFFFFF).method4128(this.aBoolean306)) {
					local174 = true;
				}
			}
			if (local174) {
				if (this.aLong154 != -1L) {
					local169 = (Class53_Sub4) Static2.aClass26_12.method518(this.aLong154);
				}
				if (local169 == null) {
					return null;
				}
			}
			if (local169 == null) {
				@Pc(250) Class53_Sub3[] local250 = new Class53_Sub3[12];
				for (@Pc(252) int local252 = 0; local252 < 12; local252++) {
					@Pc(259) int local259 = local51[local252];
					if ((local259 & 0x40000000) != 0) {
						@Pc(273) Class53_Sub3 local273 = Static35.method4361(local259 & 0x3FFFFFFF).method4121(this.aBoolean306);
						if (local273 != null) {
							local250[local252] = local273;
						}
					} else if ((Integer.MIN_VALUE & local259) != 0) {
						@Pc(294) Class53_Sub3 local294 = Static19.method1816(local259 & 0x3FFFFFFF).method3490();
						if (local294 != null) {
							local250[local252] = local294;
						}
					}
				}
				@Pc(306) Class34 local306 = null;
				if (this.anInt4372 != -1) {
					local306 = Static37.method4776(this.anInt4372);
				}
				if (local306 != null && local306.anIntArrayArray7 != null) {
					for (@Pc(326) int local326 = 0; local326 < local306.anIntArrayArray7.length; local326++) {
						if (local306.anIntArrayArray7[local326] != null && local250[local326] != null) {
							@Pc(351) int local351 = local306.anIntArrayArray7[local326][0];
							@Pc(358) int local358 = local306.anIntArrayArray7[local326][1];
							@Pc(365) int local365 = local306.anIntArrayArray7[local326][2];
							@Pc(372) int local372 = local306.anIntArrayArray7[local326][3];
							@Pc(379) int local379 = local306.anIntArrayArray7[local326][5];
							@Pc(386) int local386 = local306.anIntArrayArray7[local326][4];
							if (this.anIntArrayArray37 == null) {
								this.anIntArrayArray37 = new int[local306.anIntArrayArray7.length][];
							}
							if (this.anIntArrayArray37[local326] == null) {
								@Pc(410) int[] local410 = this.anIntArrayArray37[local326] = new int[15];
								if (local372 == 0 && local386 == 0 && local379 == 0) {
									local410[13] = -local358;
									local410[0] = local410[4] = local410[8] = 32768;
									local410[14] = -local365;
									local410[12] = -local351;
								} else {
									@Pc(457) int local457 = Class109.anIntArray298[local372] >> 1;
									@Pc(463) int local463 = Class109.anIntArray299[local372] >> 1;
									@Pc(469) int local469 = Class109.anIntArray298[local386] >> 1;
									@Pc(475) int local475 = Class109.anIntArray299[local379] >> 1;
									@Pc(481) int local481 = Class109.anIntArray299[local386] >> 1;
									@Pc(489) int local489 = local463 * local475 + 16384 >> 15;
									@Pc(495) int local495 = Class109.anIntArray298[local379] >> 1;
									@Pc(503) int local503 = local495 * local463 + 16384 >> 15;
									local410[3] = local457 * local475 + 16384 >> 15;
									local410[1] = -local475 * local469 + local481 * local503 + 16384 >> 15;
									local410[8] = local457 * local469 + 16384 >> 15;
									local410[7] = -local475 * -local481 + local469 * local503 + 16384 >> 15;
									local410[6] = local489 * local469 + -local481 * local495 + 16384 >> 15;
									local410[4] = local457 * local495 + 16384 >> 15;
									local410[13] = -local365 * local410[7] + local410[1] * -local351 + local410[4] * -local358 + 16384 >> 15;
									local410[5] = -local463;
									local410[2] = local457 * local481 + 16384 >> 15;
									local410[0] = local469 * local495 + local481 * local489 + 16384 >> 15;
									local410[12] = local410[3] * -local358 + local410[0] * -local351 + -local365 * local410[6] + 16384 >> 15;
									local410[14] = local410[8] * -local365 + -local351 * local410[2] + -local358 * local410[5] + 16384 >> 15;
								}
								local410[10] = local358;
								local410[9] = local351;
								local410[11] = local365;
							}
							if (local372 != 0 || local386 != 0 || local379 != 0) {
								local250[local326].method2754(local372, local386, local379);
							}
							if (local351 != 0 || local358 != 0 || local365 != 0) {
								local250[local326].method2743(local351, local358, local365);
							}
						}
					}
				}
				@Pc(753) Class53_Sub3 local753 = new Class53_Sub3(local250, local250.length);
				for (@Pc(755) int local755 = 0; local755 < 5; local755++) {
					if (Static6.aShortArrayArray6[local755].length > this.anIntArray463[local755]) {
						local753.method2768(Static7.aShortArray113[local755], Static6.aShortArrayArray6[local755][this.anIntArray463[local755]]);
					}
					if (Static1.aShortArrayArray1[local755].length > this.anIntArray463[local755]) {
						local753.method2768(Static4.aShortArray46[local755], Static1.aShortArrayArray1[local755][this.anIntArray463[local755]]);
					}
				}
				local169 = local753.method2761(64, 850, -30, -50, -30);
				if (Static3.aBoolean138) {
					((Class53_Sub4_Sub2) local169).method3872(false, false, true, false, false, true);
				}
				if (arg9) {
					Static2.aClass26_12.method510(local169, local54);
					this.aLong154 = local54;
				}
			}
		}
		@Pc(846) boolean local846 = false;
		@Pc(848) boolean local848 = false;
		@Pc(850) boolean local850 = false;
		@Pc(852) boolean local852 = false;
		@Pc(860) int local860 = arg0 == null ? 0 : arg0.length;
		for (@Pc(862) int local862 = 0; local862 < local860; local862++) {
			if (arg0[local862] != null) {
				@Pc(881) Class46 local881 = Static23.method2494(arg0[local862].anInt4456);
				if (local881.anIntArray95 != null) {
					local846 = true;
					Static5.aClass46Array2[local862] = local881;
					@Pc(896) int local896 = arg0[local862].anInt4462;
					@Pc(901) int local901 = arg0[local862].anInt4464;
					@Pc(906) int local906 = local881.anIntArray95[local896];
					Static5.aClass4_Sub3_Sub19Array4[local862] = Static32.method3984(local906 >>> 16);
					local906 &= 65535;
					Static3.anIntArray190[local862] = local906;
					if (Static5.aClass4_Sub3_Sub19Array4[local862] != null) {
						local850 |= Static5.aClass4_Sub3_Sub19Array4[local862].method4151(local906);
						local848 |= Static5.aClass4_Sub3_Sub19Array4[local862].method4150(local906);
						local852 |= local881.aBoolean72;
					}
					if ((local881.aBoolean70 || Static6.aBoolean258) && local901 != -1 && local881.anIntArray95.length > local901) {
						Static6.anIntArray483[local862] = local881.anIntArray94[local896];
						Static3.anIntArray181[local862] = arg0[local862].anInt4460;
						@Pc(1002) int local1002 = local881.anIntArray95[local901];
						Static4.aClass4_Sub3_Sub19Array2[local862] = Static32.method3984(local1002 >>> 16);
						local1002 &= 65535;
						Static3.anIntArray211[local862] = local1002;
						if (Static4.aClass4_Sub3_Sub19Array2[local862] != null) {
							local850 |= Static4.aClass4_Sub3_Sub19Array2[local862].method4151(local1002);
							local848 |= Static4.aClass4_Sub3_Sub19Array2[local862].method4150(local1002);
						}
					} else {
						Static6.anIntArray483[local862] = 0;
						Static3.anIntArray181[local862] = 0;
						Static4.aClass4_Sub3_Sub19Array2[local862] = null;
						Static3.anIntArray211[local862] = -1;
					}
				}
			}
		}
		if (local846 || arg8 != null || arg4 != null) {
			@Pc(1064) int local1064 = -1;
			@Pc(1066) int local1066 = -1;
			@Pc(1068) Class4_Sub3_Sub19 local1068 = null;
			@Pc(1070) int local1070 = 0;
			@Pc(1072) Class4_Sub3_Sub19 local1072 = null;
			if (arg8 != null) {
				@Pc(1080) int local1080 = arg8.anIntArray95[arg5];
				@Pc(1084) int local1084 = local1080 >>> 16;
				local1064 = local1080 & 0xFFFF;
				local1068 = Static32.method3984(local1084);
				if (local1068 != null) {
					local850 |= local1068.method4151(local1064);
					local848 |= local1068.method4150(local1064);
					local852 |= arg8.aBoolean72;
				}
				if ((arg8.aBoolean70 || Static6.aBoolean258) && arg2 != -1 && arg2 < arg8.anIntArray95.length) {
					@Pc(1134) int local1134 = arg8.anIntArray95[arg2];
					@Pc(1138) int local1138 = local1134 >>> 16;
					local1066 = local1134 & 0xFFFF;
					local1070 = arg8.anIntArray94[arg5];
					if (local1138 == local1084) {
						local1072 = local1068;
					} else {
						local1072 = Static32.method3984(local1066 >>> 16);
					}
					if (local1072 != null) {
						local850 |= local1072.method4151(local1066);
						local848 |= local1072.method4150(local1066);
					}
				}
			}
			@Pc(1180) int local1180 = -1;
			@Pc(1182) int local1182 = 0;
			@Pc(1184) int local1184 = -1;
			@Pc(1186) Class4_Sub3_Sub19 local1186 = null;
			@Pc(1188) Class4_Sub3_Sub19 local1188 = null;
			if (arg4 != null) {
				@Pc(1196) int local1196 = arg4.anIntArray95[arg1];
				@Pc(1200) int local1200 = local1196 >>> 16;
				local1188 = Static32.method3984(local1200);
				local1184 = local1196 & 0xFFFF;
				if (local1188 != null) {
					local850 |= local1188.method4151(local1184);
					local848 |= local1188.method4150(local1184);
					local852 |= arg4.aBoolean72;
				}
				if ((arg4.aBoolean70 || Static6.aBoolean258) && arg3 != -1 && arg3 < arg4.anIntArray95.length) {
					local1182 = arg4.anIntArray94[arg1];
					@Pc(1260) int local1260 = arg4.anIntArray95[arg3];
					@Pc(1264) int local1264 = local1260 >>> 16;
					local1180 = local1260 & 0xFFFF;
					if (local1264 == local1200) {
						local1186 = local1188;
					} else {
						local1186 = Static32.method3984(local1180 >>> 16);
					}
					if (local1186 != null) {
						local850 |= local1186.method4151(local1180);
						local848 |= local1186.method4150(local1180);
					}
				}
			}
			@Pc(1318) Class53_Sub4 local1318 = local169.method3831(!local848, !local850, !local852);
			@Pc(1320) int local1320 = 0;
			@Pc(1322) int local1322 = 1;
			while (local860 > local1320) {
				if (Static5.aClass4_Sub3_Sub19Array4[local1320] != null) {
					local1318.method3839(Static5.aClass4_Sub3_Sub19Array4[local1320], Static3.anIntArray190[local1320], Static4.aClass4_Sub3_Sub19Array2[local1320], Static3.anIntArray211[local1320], Static3.anIntArray181[local1320] - 1, Static6.anIntArray483[local1320], local1322, Static5.aClass46Array2[local1320].aBoolean72, this.anIntArrayArray37[local1320]);
				}
				local1320++;
				local1322 <<= 1;
			}
			if (local1068 != null && local1188 != null) {
				local1318.method3816(local1068, local1064, local1072, local1066, arg10 - 1, local1070, local1188, local1184, local1186, local1180, arg7 - 1, local1182, arg8.aBooleanArray6, arg4.aBoolean72 | arg8.aBoolean72);
			} else if (local1068 != null) {
				local1318.method3835(local1068, local1064, local1072, local1066, arg10 - 1, local1070, arg8.aBoolean72);
			} else if (local1188 != null) {
				local1318.method3835(local1188, local1184, local1186, local1180, arg7 - 1, local1182, arg4.aBoolean72);
			}
			for (@Pc(1434) int local1434 = 0; local1434 < local860; local1434++) {
				Static5.aClass4_Sub3_Sub19Array4[local1434] = null;
				Static4.aClass4_Sub3_Sub19Array2[local1434] = null;
				Static5.aClass46Array2[local1434] = null;
			}
			return local1318;
		} else if (arg6) {
			return local169.method3831(false, false, false);
		} else {
			return local169;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!eg;IIIIII)Lclient!vg;")
	public final Class53_Sub4 method3609(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) long local14 = (long) arg2 << 32 | (long) (arg1 << 16) | (long) arg5;
		@Pc(24) Class53_Sub4 local24 = (Class53_Sub4) Static3.aClass26_27.method518(local14);
		if (local24 == null) {
			@Pc(30) int local30 = 0;
			@Pc(33) Class53_Sub3[] local33 = new Class53_Sub3[3];
			if (!Static19.method1816(arg5).method3497() || !Static19.method1816(arg1).method3497() || !Static19.method1816(arg2).method3497()) {
				return null;
			}
			@Pc(65) Class53_Sub3 local65 = Static19.method1816(arg5).method3489();
			if (local65 != null) {
				local30++;
				local33[0] = local65;
			}
			@Pc(78) Class53_Sub3 local78 = Static19.method1816(arg1).method3489();
			if (local78 != null) {
				local33[local30++] = local78;
			}
			@Pc(92) Class53_Sub3 local92 = Static19.method1816(arg2).method3489();
			if (local92 != null) {
				local33[local30++] = local92;
			}
			@Pc(105) Class53_Sub3 local105 = new Class53_Sub3(local33, local30);
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				if (Static6.aShortArrayArray6[local107].length > this.anIntArray463[local107]) {
					local105.method2768(Static7.aShortArray113[local107], Static6.aShortArrayArray6[local107][this.anIntArray463[local107]]);
				}
				if (Static1.aShortArrayArray1[local107].length > this.anIntArray463[local107]) {
					local105.method2768(Static4.aShortArray46[local107], Static1.aShortArrayArray1[local107][this.anIntArray463[local107]]);
				}
			}
			local24 = local105.method2761(64, 768, -50, -10, -50);
			Static3.aClass26_27.method510(local24, local14);
		}
		if (arg0 != null) {
			local24 = arg0.method1017(arg4, arg6, local24, arg3);
		}
		return local24;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[II[IZ)V")
	public final void method3610(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4) {
		if (this.anInt4372 != arg2) {
			this.anInt4372 = arg2;
			this.anIntArrayArray37 = null;
		}
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
				for (@Pc(30) int local30 = 0; local30 < Static1.anInt119; local30++) {
					@Pc(37) Class140 local37 = Static19.method1816(local30);
					if (local37 != null && !local37.aBoolean298 && (arg4 ? Static6.anIntArray487[local25] : Static6.anIntArray550[local25]) == local37.anInt4231) {
						arg1[Static1.anIntArray46[local25]] = Integer.MIN_VALUE | local30;
						break;
					}
				}
			}
		}
		this.anIntArray464 = arg1;
		this.anIntArray463 = arg3;
		this.aBoolean306 = arg4;
		this.anInt4387 = arg0;
		this.method3606();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I")
	public final int method3611() {
		return this.anInt4387 == -1 ? (this.anIntArray464[8] << 10) + (this.anIntArray463[0] << 25) + (this.anIntArray463[4] << 20) + (this.anIntArray464[0] << 15) + (this.anIntArray464[11] << 5) + this.anIntArray464[1] : Static15.method1495(this.anInt4387).anInt5255 + 305419896;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!eg;IBI)Lclient!vg;")
	public final Class53_Sub4 method3612(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt4387 != -1) {
			return Static15.method1495(this.anInt4387).method4266(arg2, arg1, arg0, arg3);
		}
		@Pc(28) Class53_Sub4 local28 = (Class53_Sub4) Static3.aClass26_27.method518(this.aLong153);
		if (local28 == null) {
			@Pc(33) boolean local33 = false;
			for (@Pc(35) int local35 = 0; local35 < 12; local35++) {
				@Pc(43) int local43 = this.anIntArray464[local35];
				if ((local43 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local43) != 0 && !Static19.method1816(local43 & 0x3FFFFFFF).method3497()) {
						local33 = true;
					}
				} else if (!Static35.method4361(local43 & 0x3FFFFFFF).method4134(this.aBoolean306)) {
					local33 = true;
				}
			}
			if (local33) {
				return null;
			}
			@Pc(93) Class53_Sub3[] local93 = new Class53_Sub3[12];
			@Pc(95) int local95 = 0;
			for (@Pc(97) int local97 = 0; local97 < 12; local97++) {
				@Pc(105) int local105 = this.anIntArray464[local97];
				if ((local105 & 0x40000000) != 0) {
					@Pc(122) Class53_Sub3 local122 = Static35.method4361(local105 & 0x3FFFFFFF).method4125(this.aBoolean306);
					if (local122 != null) {
						local93[local95++] = local122;
					}
				} else if ((Integer.MIN_VALUE & local105) != 0) {
					@Pc(145) Class53_Sub3 local145 = Static19.method1816(local105 & 0x3FFFFFFF).method3489();
					if (local145 != null) {
						local93[local95++] = local145;
					}
				}
			}
			@Pc(162) Class53_Sub3 local162 = new Class53_Sub3(local93, local95);
			for (@Pc(164) int local164 = 0; local164 < 5; local164++) {
				if (Static6.aShortArrayArray6[local164].length > this.anIntArray463[local164]) {
					local162.method2768(Static7.aShortArray113[local164], Static6.aShortArrayArray6[local164][this.anIntArray463[local164]]);
				}
				if (this.anIntArray463[local164] < Static1.aShortArrayArray1[local164].length) {
					local162.method2768(Static4.aShortArray46[local164], Static1.aShortArrayArray1[local164][this.anIntArray463[local164]]);
				}
			}
			local28 = local162.method2761(64, 768, -50, -10, -50);
			Static3.aClass26_27.method510(local28, this.aLong153);
		}
		if (arg1 != null) {
			local28 = arg1.method1017(arg0, arg2, local28, arg3);
		}
		return local28;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(IBI)V")
	public final void method3613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray463[arg0] = arg1;
		this.method3606();
	}
}

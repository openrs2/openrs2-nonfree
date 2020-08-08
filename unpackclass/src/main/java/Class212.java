import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!u")
public final class Class212 {

	@OriginalMember(owner = "unpackclass!u", name = "a", descriptor = "Lunpackclass!h;")
	private static final Class204 aClass204_1 = new Class204();

	@OriginalMember(owner = "unpackclass!u", name = "a", descriptor = "([BI[BII)I")
	public static int method4940(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		synchronized (aClass204_1) {
			aClass204_1.aByteArray78 = arg2;
			aClass204_1.anInt6121 = 9;
			aClass204_1.aByteArray79 = arg0;
			aClass204_1.anInt6123 = 0;
			aClass204_1.anInt6124 = arg1;
			aClass204_1.anInt6128 = 0;
			aClass204_1.anInt6127 = 0;
			aClass204_1.anInt6122 = 0;
			aClass204_1.anInt6125 = 0;
			method4942(aClass204_1);
			arg1 -= aClass204_1.anInt6124;
			aClass204_1.aByteArray78 = null;
			aClass204_1.aByteArray79 = null;
			return arg1;
		}
	}

	@OriginalMember(owner = "unpackclass!u", name = "a", descriptor = "(Lunpackclass!h;)V")
	private static void method4941(@OriginalArg(0) Class204 arg0) {
		@Pc(2) byte local2 = arg0.aByte28;
		@Pc(5) int local5 = arg0.anInt6126;
		@Pc(8) int local8 = arg0.anInt6133;
		@Pc(11) int local11 = arg0.anInt6132;
		@Pc(13) int[] local13 = Class204.anIntArray692;
		@Pc(16) int local16 = arg0.anInt6131;
		@Pc(19) byte[] local19 = arg0.aByteArray79;
		@Pc(22) int local22 = arg0.anInt6123;
		@Pc(25) int local25 = arg0.anInt6124;
		@Pc(27) int local27 = local25;
		@Pc(32) int local32 = arg0.anInt6135 + 1;
		label63:
		while (true) {
			if (local5 > 0) {
				while (true) {
					if (local25 == 0) {
						break label63;
					}
					if (local5 == 1) {
						if (local25 == 0) {
							local5 = 1;
							break label63;
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
			@Pc(60) boolean local60 = true;
			while (local60) {
				local60 = false;
				if (local8 == local32) {
					local5 = 0;
					break label63;
				}
				local2 = (byte) local11;
				@Pc(76) int local76 = local13[local16];
				@Pc(81) byte local81 = (byte) (local76 & 0xFF);
				local16 = local76 >> 8;
				local8++;
				if (local81 != local11) {
					local11 = local81;
					if (local25 == 0) {
						local5 = 1;
						break label63;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local60 = true;
				} else if (local8 == local32) {
					if (local25 == 0) {
						local5 = 1;
						break label63;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local60 = true;
				}
			}
			local5 = 2;
			@Pc(130) int local130 = local13[local16];
			@Pc(135) byte local135 = (byte) (local130 & 0xFF);
			local16 = local130 >> 8;
			local8++;
			if (local8 != local32) {
				if (local135 == local11) {
					local5 = 3;
					@Pc(155) int local155 = local13[local16];
					@Pc(160) byte local160 = (byte) (local155 & 0xFF);
					local16 = local155 >> 8;
					local8++;
					if (local8 != local32) {
						if (local160 == local11) {
							@Pc(178) int local178 = local13[local16];
							@Pc(183) byte local183 = (byte) (local178 & 0xFF);
							local178 >>= 8;
							@Pc(188) int local188 = local8 + 1;
							local5 = (local183 & 0xFF) + 4;
							local178 = local13[local178];
							local11 = (byte) (local178 & 0xFF);
							local16 = local178 >> 8;
							local8 = local188 + 1;
						} else {
							local11 = local160;
						}
					}
				} else {
					local11 = local135;
				}
			}
		}
		@Pc(212) int local212 = arg0.anInt6125;
		arg0.anInt6125 += local27 - local25;
		arg0.aByte28 = local2;
		arg0.anInt6126 = local5;
		arg0.anInt6133 = local8;
		arg0.anInt6132 = local11;
		Class204.anIntArray692 = local13;
		arg0.anInt6131 = local16;
		arg0.aByteArray79 = local19;
		arg0.anInt6123 = local22;
		arg0.anInt6124 = local25;
	}

	@OriginalMember(owner = "unpackclass!u", name = "b", descriptor = "(Lunpackclass!h;)V")
	private static void method4942(@OriginalArg(0) Class204 arg0) {
		arg0.anInt6129 = 1;
		if (Class204.anIntArray692 == null) {
			Class204.anIntArray692 = new int[arg0.anInt6129 * 100000];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(60) byte local60 = method4943(arg0);
				if (local60 == 23) {
					return;
				}
				@Pc(67) byte local67 = method4943(arg0);
				local67 = method4943(arg0);
				local67 = method4943(arg0);
				local67 = method4943(arg0);
				local67 = method4943(arg0);
				local67 = method4943(arg0);
				local67 = method4943(arg0);
				local67 = method4943(arg0);
				local67 = method4943(arg0);
				local67 = method4944(arg0);
				arg0.anInt6130 = 0;
				local67 = method4943(arg0);
				arg0.anInt6130 = arg0.anInt6130 << 8 | local67 & 0xFF;
				local67 = method4943(arg0);
				arg0.anInt6130 = arg0.anInt6130 << 8 | local67 & 0xFF;
				local67 = method4943(arg0);
				arg0.anInt6130 = arg0.anInt6130 << 8 | local67 & 0xFF;
				for (@Pc(138) int local138 = 0; local138 < 16; local138++) {
					@Pc(142) byte local142 = method4944(arg0);
					if (local142 == 1) {
						arg0.aBooleanArray27[local138] = true;
					} else {
						arg0.aBooleanArray27[local138] = false;
					}
				}
				for (@Pc(162) int local162 = 0; local162 < 256; local162++) {
					arg0.aBooleanArray26[local162] = false;
				}
				for (@Pc(174) int local174 = 0; local174 < 16; local174++) {
					if (arg0.aBooleanArray27[local174]) {
						for (@Pc(182) int local182 = 0; local182 < 16; local182++) {
							@Pc(186) byte local186 = method4944(arg0);
							if (local186 == 1) {
								arg0.aBooleanArray26[local174 * 16 + local182] = true;
							}
						}
					}
				}
				method4946(arg0);
				@Pc(213) int local213 = arg0.anInt6134 + 2;
				@Pc(217) int local217 = method4945(3, arg0);
				@Pc(221) int local221 = method4945(15, arg0);
				for (@Pc(223) int local223 = 0; local223 < local221; local223++) {
					@Pc(226) int local226 = 0;
					while (true) {
						@Pc(229) byte local229 = method4944(arg0);
						if (local229 == 0) {
							arg0.aByteArray83[local223] = (byte) local226;
							break;
						}
						local226++;
					}
				}
				@Pc(246) byte[] local246 = new byte[6];
				@Pc(248) byte local248 = 0;
				while (local248 < local217) {
					local246[local248] = local248++;
				}
				for (@Pc(263) int local263 = 0; local263 < local221; local263++) {
					@Pc(269) byte local269 = arg0.aByteArray83[local263];
					@Pc(273) byte local273 = local246[local269];
					while (local269 > 0) {
						local246[local269] = local246[local269 - 1];
						local269--;
					}
					local246[0] = local273;
					arg0.aByteArray82[local263] = local273;
				}
				for (@Pc(304) int local304 = 0; local304 < local217; local304++) {
					@Pc(309) int local309 = method4945(5, arg0);
					for (@Pc(311) int local311 = 0; local311 < local213; local311++) {
						while (true) {
							@Pc(315) byte local315 = method4944(arg0);
							if (local315 == 0) {
								arg0.aByteArrayArray58[local304][local311] = (byte) local309;
								break;
							}
							@Pc(320) byte local320 = method4944(arg0);
							if (local320 == 0) {
								local309++;
							} else {
								local309--;
							}
						}
					}
				}
				for (@Pc(344) int local344 = 0; local344 < local217; local344++) {
					@Pc(347) byte local347 = 32;
					@Pc(349) byte local349 = 0;
					for (@Pc(351) int local351 = 0; local351 < local213; local351++) {
						if (arg0.aByteArrayArray58[local344][local351] > local349) {
							local349 = arg0.aByteArrayArray58[local344][local351];
						}
						if (arg0.aByteArrayArray58[local344][local351] < local347) {
							local347 = arg0.aByteArrayArray58[local344][local351];
						}
					}
					method4947(arg0.anIntArrayArray53[local344], arg0.anIntArrayArray54[local344], arg0.anIntArrayArray55[local344], arg0.aByteArrayArray58[local344], local347, local349, local213);
					arg0.anIntArray694[local344] = local347;
				}
				@Pc(420) int local420 = arg0.anInt6134 + 1;
				@Pc(422) byte local422 = -1;
				for (@Pc(426) int local426 = 0; local426 <= 255; local426++) {
					arg0.anIntArray690[local426] = 0;
				}
				@Pc(438) int local438 = 4095;
				for (@Pc(440) int local440 = 15; local440 >= 0; local440--) {
					for (@Pc(443) int local443 = 15; local443 >= 0; local443--) {
						arg0.aByteArray81[local438] = (byte) (local440 * 16 + local443);
						local438--;
					}
					arg0.anIntArray693[local440] = local438 + 1;
				}
				@Pc(470) int local470 = 0;
				@Pc(473) int local473 = local422 + 1;
				@Pc(475) byte local475 = 50;
				@Pc(480) byte local480 = arg0.aByteArray82[0];
				@Pc(485) int local485 = arg0.anIntArray694[local480];
				@Pc(490) int[] local490 = arg0.anIntArrayArray53[local480];
				@Pc(495) int[] local495 = arg0.anIntArrayArray55[local480];
				@Pc(500) int[] local500 = arg0.anIntArrayArray54[local480];
				@Pc(501) int local501 = local475 - 1;
				@Pc(503) int local503 = local485;
				@Pc(507) int local507;
				@Pc(516) byte local516;
				for (local507 = method4945(local485, arg0); local507 > local490[local503]; local507 = local507 << 1 | local516) {
					local503++;
					local516 = method4944(arg0);
				}
				@Pc(531) int local531 = local495[local507 - local500[local503]];
				while (true) {
					while (local531 != local420) {
						if (local531 == 0 || local531 == 1) {
							@Pc(541) int local541 = -1;
							@Pc(543) int local543 = 1;
							do {
								if (local531 == 0) {
									local541 += local543;
								} else if (local531 == 1) {
									local541 += local543 * 2;
								}
								local543 *= 2;
								if (local501 == 0) {
									local473++;
									local501 = 50;
									@Pc(573) byte local573 = arg0.aByteArray82[local473];
									local485 = arg0.anIntArray694[local573];
									local490 = arg0.anIntArrayArray53[local573];
									local495 = arg0.anIntArrayArray55[local573];
									local500 = arg0.anIntArrayArray54[local573];
								}
								local501--;
								@Pc(596) int local596 = local485;
								@Pc(600) int local600;
								@Pc(609) byte local609;
								for (local600 = method4945(local485, arg0); local600 > local490[local596]; local600 = local600 << 1 | local609) {
									local596++;
									local609 = method4944(arg0);
								}
								local531 = local495[local600 - local500[local596]];
							} while (local531 == 0 || local531 == 1);
							@Pc(630) int local630 = local541 + 1;
							@Pc(643) byte local643 = arg0.aByteArray80[arg0.aByteArray81[arg0.anIntArray693[0]] & 0xFF];
							@Pc(645) int[] local645 = arg0.anIntArray690;
							local645[local643 & 0xFF] += local630;
							while (local630 > 0) {
								Class204.anIntArray692[local470] = local643 & 0xFF;
								local470++;
								local630--;
							}
						} else {
							@Pc(669) int local669 = local531 - 1;
							@Pc(684) byte local684;
							if (local669 < 16) {
								@Pc(677) int local677 = arg0.anIntArray693[0];
								local684 = arg0.aByteArray81[local677 + local669];
								while (local669 > 3) {
									@Pc(689) int local689 = local677 + local669;
									arg0.aByteArray81[local689] = arg0.aByteArray81[local689 - 1];
									arg0.aByteArray81[local689 - 1] = arg0.aByteArray81[local689 - 2];
									arg0.aByteArray81[local689 - 2] = arg0.aByteArray81[local689 - 3];
									arg0.aByteArray81[local689 - 3] = arg0.aByteArray81[local689 - 4];
									local669 -= 4;
								}
								while (local669 > 0) {
									arg0.aByteArray81[local677 + local669] = arg0.aByteArray81[local677 + local669 - 1];
									local669--;
								}
								arg0.aByteArray81[local677] = local684;
							} else {
								@Pc(767) int local767 = local669 / 16;
								@Pc(771) int local771 = local669 % 16;
								@Pc(778) int local778 = arg0.anIntArray693[local767] + local771;
								local684 = arg0.aByteArray81[local778];
								while (local778 > arg0.anIntArray693[local767]) {
									arg0.aByteArray81[local778] = arg0.aByteArray81[local778 - 1];
									local778--;
								}
								@Pc(806) int local806 = arg0.anIntArray693[local767]++;
								while (local767 > 0) {
									@Pc(815) int local815 = arg0.anIntArray693[local767]--;
									arg0.aByteArray81[arg0.anIntArray693[local767]] = arg0.aByteArray81[arg0.anIntArray693[local767 - 1] + 16 - 1];
									local767--;
								}
								@Pc(846) int local846 = arg0.anIntArray693[0]--;
								arg0.aByteArray81[arg0.anIntArray693[0]] = local684;
								if (arg0.anIntArray693[0] == 0) {
									@Pc(864) int local864 = 4095;
									for (@Pc(866) int local866 = 15; local866 >= 0; local866--) {
										for (@Pc(869) int local869 = 15; local869 >= 0; local869--) {
											arg0.aByteArray81[local864] = arg0.aByteArray81[arg0.anIntArray693[local866] + local869];
											local864--;
										}
										arg0.anIntArray693[local866] = local864 + 1;
									}
								}
							}
							@Pc(909) int local909 = arg0.anIntArray690[arg0.aByteArray80[local684 & 0xFF] & 0xFF]++;
							Class204.anIntArray692[local470] = arg0.aByteArray80[local684 & 0xFF] & 0xFF;
							local470++;
							if (local501 == 0) {
								local473++;
								local501 = 50;
								@Pc(934) byte local934 = arg0.aByteArray82[local473];
								local485 = arg0.anIntArray694[local934];
								local490 = arg0.anIntArrayArray53[local934];
								local495 = arg0.anIntArrayArray55[local934];
								local500 = arg0.anIntArrayArray54[local934];
							}
							local501--;
							@Pc(957) int local957 = local485;
							@Pc(961) int local961;
							@Pc(970) byte local970;
							for (local961 = method4945(local485, arg0); local961 > local490[local957]; local961 = local961 << 1 | local970) {
								local957++;
								local970 = method4944(arg0);
							}
							local531 = local495[local961 - local500[local957]];
						}
					}
					arg0.anInt6126 = 0;
					arg0.aByte28 = 0;
					arg0.anIntArray691[0] = 0;
					for (@Pc(999) int local999 = 1; local999 <= 256; local999++) {
						arg0.anIntArray691[local999] = arg0.anIntArray690[local999 - 1];
					}
					for (@Pc(1016) int local1016 = 1; local1016 <= 256; local1016++) {
						@Pc(1019) int[] local1019 = arg0.anIntArray691;
						local1019[local1016] += arg0.anIntArray691[local1016 - 1];
					}
					for (@Pc(1036) int local1036 = 0; local1036 < local470; local1036++) {
						@Pc(1044) byte local1044 = (byte) (Class204.anIntArray692[local1036] & 0xFF);
						@Pc(1045) int[] local1045 = Class204.anIntArray692;
						@Pc(1051) int local1051 = arg0.anIntArray691[local1044 & 0xFF];
						local1045[local1051] |= local1036 << 8;
						@Pc(1065) int local1065 = arg0.anIntArray691[local1044 & 0xFF]++;
					}
					arg0.anInt6131 = Class204.anIntArray692[arg0.anInt6130] >> 8;
					arg0.anInt6133 = 0;
					arg0.anInt6131 = Class204.anIntArray692[arg0.anInt6131];
					arg0.anInt6132 = (byte) (arg0.anInt6131 & 0xFF);
					arg0.anInt6131 >>= 8;
					arg0.anInt6133++;
					arg0.anInt6135 = local470;
					method4941(arg0);
					if (arg0.anInt6133 == arg0.anInt6135 + 1 && arg0.anInt6126 == 0) {
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

	@OriginalMember(owner = "unpackclass!u", name = "c", descriptor = "(Lunpackclass!h;)B")
	private static byte method4943(@OriginalArg(0) Class204 arg0) {
		return (byte) method4945(8, arg0);
	}

	@OriginalMember(owner = "unpackclass!u", name = "d", descriptor = "(Lunpackclass!h;)B")
	private static byte method4944(@OriginalArg(0) Class204 arg0) {
		return (byte) method4945(1, arg0);
	}

	@OriginalMember(owner = "unpackclass!u", name = "a", descriptor = "(ILunpackclass!h;)I")
	private static int method4945(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1) {
		while (arg1.anInt6128 < arg0) {
			arg1.anInt6127 = arg1.anInt6127 << 8 | arg1.aByteArray78[arg1.anInt6121] & 0xFF;
			arg1.anInt6128 += 8;
			arg1.anInt6121++;
			arg1.anInt6122++;
		}
		@Pc(17) int local17 = arg1.anInt6127 >> arg1.anInt6128 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt6128 -= arg0;
		return local17;
	}

	@OriginalMember(owner = "unpackclass!u", name = "e", descriptor = "(Lunpackclass!h;)V")
	private static void method4946(@OriginalArg(0) Class204 arg0) {
		arg0.anInt6134 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray26[local4]) {
				arg0.aByteArray80[arg0.anInt6134] = (byte) local4;
				arg0.anInt6134++;
			}
		}
	}

	@OriginalMember(owner = "unpackclass!u", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void method4947(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(6) int local6 = 0; local6 < arg6; local6++) {
				if (arg3[local6] == local3) {
					arg2[local1] = local6;
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
			@Pc(100) int local100 = local85 + arg1[local87 + 1] - arg1[local87];
			arg0[local87] = local100 - 1;
			local85 = local100 << 1;
		}
		for (@Pc(118) int local118 = arg4 + 1; local118 <= arg5; local118++) {
			arg1[local118] = (arg0[local118 - 1] + 1 << 1) - arg1[local118];
		}
	}
}

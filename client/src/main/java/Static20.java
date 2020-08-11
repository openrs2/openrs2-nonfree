import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.lang.reflect.Method;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "()V")
	public static void method2403() {
		@Pc(3) int local3 = Static3.anInt2972 - Static3.anInt2973;
		@Pc(7) int local7 = Static3.anInt2966 - Static3.anInt2967;
		@Pc(15) int local15 = (Static3.anInt2970 - Static3.anInt2969 << 16) / local3;
		@Pc(23) int local23 = (Static3.anInt2971 - Static3.anInt2968 << 16) / local7;
		Static19.method2396(local15, local23);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fg;IIII)V")
	private static void method2404(@OriginalArg(0) Class4_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt1766 = Static3.anInt2969 + (arg1 * (arg0.anInt1768 - Static3.anInt2973) >> 16);
		arg0.anInt1764 = Static3.anInt2968 + (arg2 * (arg0.anInt1769 - Static3.anInt2967) >> 16);
		@Pc(32) Class82 local32 = Static22.method2191(arg0.anInt1760);
		if (local32.anInt2277 != -1) {
			@Pc(42) Class56 local42 = local32.method1811(false, true);
			if (local42 != null) {
				if (arg0.anInt1766 - (local42.anInt3408 + 1 >> 1) <= Static3.anInt2970 && arg0.anInt1766 + (local42.anInt3408 + 1 >> 1) >= Static3.anInt2969 && arg0.anInt1764 - (local42.anInt3413 + 1 >> 1) <= Static3.anInt2971 && arg0.anInt1764 + (local42.anInt3413 + 1 >> 1) >= Static3.anInt2968) {
					arg0.aBoolean106 = false;
				} else {
					arg0.aBoolean106 = true;
				}
				return;
			}
		}
		if (arg0.anInt1768 >= Static3.anInt2973 && arg0.anInt1768 <= Static3.anInt2972 && arg0.anInt1769 >= Static3.anInt2967 && arg0.anInt1769 <= Static3.anInt2966) {
			arg0.aBoolean106 = false;
		} else {
			arg0.aBoolean106 = true;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Lclient!wg;")
	public static Class4_Sub3_Sub22 method2405(@OriginalArg(0) int arg0) {
		return (Class4_Sub3_Sub22) Static3.aClass84_14.get((long) arg0);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Lclient!fd;)V")
	private static void method2406(@OriginalArg(0) Buffer arg0) {
		label83:
		while (true) {
			if (arg0.position < arg0.bytes.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.readUnsignedByte() == 1) {
					local7 = true;
					local9 = arg0.readUnsignedByte();
					local11 = arg0.readUnsignedByte();
				}
				@Pc(30) int local30 = arg0.readUnsignedByte();
				@Pc(34) int local34 = arg0.readUnsignedByte();
				@Pc(40) int local40 = local30 * 64 - Static3.anInt2962;
				@Pc(50) int local50 = Static3.anInt2960 + Static3.anInt2961 - local34 * 64 - 1;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < Static3.anInt2965 && local50 < Static3.anInt2960) {
					@Pc(68) int local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) byte local113 = arg0.readByte();
								if (local113 != 0) {
									if (Static3.aByteArrayArrayArray10[local68][local72] == null) {
										Static3.aByteArrayArrayArray10[local68][local72] = new byte[4096];
									}
									Static3.aByteArrayArrayArray10[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.readByte();
									if (Static3.aByteArrayArrayArray11[local68][local72] == null) {
										Static3.aByteArrayArrayArray11[local68][local72] = new byte[4096];
									}
									Static3.aByteArrayArrayArray11[local68][local72][(63 - local79 << 6) + local74] = local146;
								}
							}
						}
						local74++;
					}
				}
				@Pc(180) int local180 = 0;
				while (true) {
					if (local180 >= (local7 ? 64 : 4096)) {
						continue label83;
					}
					@Pc(191) byte local191 = arg0.readByte();
					if (local191 != 0) {
						arg0.position++;
					}
					local180++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fd;Z)V")
	private static void method2407(@OriginalArg(0) Buffer arg0, @OriginalArg(1) boolean arg1) {
		label125:
		while (true) {
			if (arg0.position < arg0.bytes.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.readUnsignedByte() == 1) {
					local7 = true;
					local9 = arg0.readUnsignedByte();
					local11 = arg0.readUnsignedByte();
				}
				@Pc(30) int local30 = arg0.readUnsignedByte();
				@Pc(34) int local34 = arg0.readUnsignedByte();
				@Pc(40) int local40 = local30 * 64 - Static3.anInt2962;
				@Pc(50) int local50 = Static3.anInt2960 + Static3.anInt2961 - local34 * 64 - 1;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < Static3.anInt2965 && local50 < Static3.anInt2960) {
					@Pc(68) int local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label125;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) int local113 = arg0.readUnsignedByte();
								if (local113 != 0) {
									if ((local113 & 0x1) == 1) {
										@Pc(125) int local125 = arg0.readUnsignedByte();
										if (Static3.aByteArrayArrayArray12[local68][local72] == null) {
											Static3.aByteArrayArrayArray12[local68][local72] = new byte[4096];
										}
										Static3.aByteArrayArrayArray12[local68][local72][(63 - local79 << 6) + local74] = (byte) local125;
									}
									if ((local113 & 0x2) == 2) {
										@Pc(162) int local162 = arg0.readUnsignedMedium();
										if (Static3.anIntArrayArrayArray6[local68][local72] == null) {
											Static3.anIntArrayArrayArray6[local68][local72] = new int[4096];
										}
										Static3.anIntArrayArrayArray6[local68][local72][(63 - local79 << 6) + local74] = local162;
									}
									if ((local113 & 0x4) == 4) {
										@Pc(198) int local198 = arg0.readUnsignedShort();
										@Pc(202) int local202 = arg0.readUnsignedByte();
										local198--;
										@Pc(207) Class181 local207 = Static8.method99(local198);
										if (local207.anIntArray631 != null) {
											local207 = local207.method4453();
											if (local207 == null || local207.anInt5526 == -1) {
												continue;
											}
										}
										if ((!local207.aBoolean375 || arg1) && local207.anInt5526 != -1) {
											@Pc(236) Class4_Sub3_Sub7 local236 = new Class4_Sub3_Sub7();
											local236.anInt1760 = local207.anInt5526;
											local236.anInt1763 = local202;
											local236.anInt1768 = local68 * 64 + local74;
											local236.anInt1769 = local72 * 64 + 64 - local79;
											Static3.aClass175_12.addTail(local236);
										}
									}
								}
							}
						}
						local74++;
					}
				}
				@Pc(270) int local270 = 0;
				while (true) {
					if (local270 >= (local7 ? 64 : 4096)) {
						continue label125;
					}
					@Pc(281) int local281 = arg0.readUnsignedByte();
					if (local281 != 0) {
						if ((local281 & 0x1) == 1) {
							arg0.position++;
						}
						if ((local281 & 0x2) == 2) {
							arg0.position += 2;
						}
						if ((local281 & 0x4) == 4) {
							arg0.position += 3;
						}
					}
					local270++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V")
	private static void method2408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < Static2.anInt5716; local1++) {
			@Pc(8) Class127 local8 = Static26.method2935(local1);
			if (local8 != null) {
				@Pc(14) int local14 = local8.anInt3877;
				if (local14 >= 0 && !Static4.anInterface4_1.method441(local14)) {
					local14 = -1;
				}
				@Pc(64) int local64;
				if (local8.anInt3870 >= 0) {
					@Pc(29) int local29 = local8.anInt3870;
					@Pc(35) int local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					@Pc(57) int local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static4.anIntArray295[Static22.method2286(local57, 96)];
				} else if (local14 >= 0) {
					local64 = Static4.anIntArray295[Static22.method2286(Static4.anInterface4_1.method446(local14), 96)];
				} else if (local8.anInt3869 == -1) {
					local64 = -1;
				} else {
					@Pc(88) int local88 = local8.anInt3869;
					@Pc(94) int local94 = (local88 & 0x7F) + arg1;
					if (local94 < 0) {
						local94 = 0;
					} else if (local94 > 127) {
						local94 = 127;
					}
					@Pc(116) int local116 = (local88 + arg0 & 0xFC00) + (local88 & 0x380) + local94;
					local64 = Static4.anIntArray295[Static22.method2286(local116, 96)];
				}
				Static3.anIntArray266[local1 + 1] = local64;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIIIIIIZ)V")
	public static void method2409(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		@Pc(1) int local1 = arg1;
		if (arg1 >= Static6.anInt5186) {
			return;
		}
		if (arg1 < Static6.anInt5185) {
			local1 = Static6.anInt5185;
		}
		@Pc(14) int local14 = arg1 + arg5;
		if (local14 <= Static6.anInt5185) {
			return;
		}
		if (local14 > Static6.anInt5186) {
			local14 = Static6.anInt5186;
		}
		@Pc(25) int local25 = arg2;
		if (arg2 >= Static6.anInt5187) {
			return;
		}
		if (arg2 < Static6.anInt5183) {
			local25 = Static6.anInt5183;
		}
		@Pc(38) int local38 = arg2 + arg6;
		if (local38 <= Static6.anInt5183) {
			return;
		}
		if (local38 > Static6.anInt5187) {
			local38 = Static6.anInt5187;
		}
		@Pc(53) int local53 = local25 * Static6.anInt5188 + local1;
		@Pc(59) int local59 = Static6.anInt5188 + local1 - local14;
		@Pc(63) int local63 = local1 - arg1;
		@Pc(67) int local67 = local14 - arg1;
		@Pc(71) int local71 = local25 - arg2;
		@Pc(75) int local75 = local38 - arg2;
		@Pc(79) int local79 = arg5 - local67;
		@Pc(83) int local83 = arg5 - local63;
		@Pc(87) int local87 = arg6 - local75;
		@Pc(91) int local91 = arg6 - local71;
		if (arg7 == 9) {
			arg7 = 1;
			arg8 = arg8 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg7 = 1;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg7 == 1) {
			if (arg8 == 0) {
				for (@Pc(131) int local131 = local71; local131 < local75; local131++) {
					for (@Pc(136) int local136 = local63; local136 < local67; local136++) {
						if (local136 <= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(170) int local170 = local91 - 1; local170 >= local87; local170--) {
					for (@Pc(175) int local175 = local63; local175 < local67; local175++) {
						if (local175 <= local170) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(207) int local207 = local71; local207 < local75; local207++) {
					for (@Pc(212) int local212 = local63; local212 < local67; local212++) {
						if (local212 >= local207) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(246) int local246 = local91 - 1; local246 >= local87; local246--) {
					for (@Pc(251) int local251 = local63; local251 < local67; local251++) {
						if (local251 >= local246) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 2) {
			if (arg8 == 0) {
				for (@Pc(288) int local288 = local91 - 1; local288 >= local87; local288--) {
					for (@Pc(293) int local293 = local63; local293 < local67; local293++) {
						if (local293 <= local288 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(327) int local327 = local71; local327 < local75; local327++) {
					for (@Pc(332) int local332 = local63; local332 < local67; local332++) {
						if (local53 >= 0 && local53 < arg0.length) {
							if (local332 >= local327 << 1) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						} else {
							local53++;
						}
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(374) int local374 = local71; local374 < local75; local374++) {
					for (@Pc(381) int local381 = local83 - 1; local381 >= local79; local381--) {
						if (local381 <= local374 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(417) int local417 = local91 - 1; local417 >= local87; local417--) {
					for (@Pc(424) int local424 = local83 - 1; local424 >= local79; local424--) {
						if (local424 >= local417 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 3) {
			if (arg8 == 0) {
				for (@Pc(463) int local463 = local91 - 1; local463 >= local87; local463--) {
					for (@Pc(470) int local470 = local83 - 1; local470 >= local79; local470--) {
						if (local470 <= local463 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(506) int local506 = local91 - 1; local506 >= local87; local506--) {
					for (@Pc(511) int local511 = local63; local511 < local67; local511++) {
						if (local511 >= local506 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(545) int local545 = local71; local545 < local75; local545++) {
					for (@Pc(550) int local550 = local63; local550 < local67; local550++) {
						if (local550 <= local545 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(584) int local584 = local71; local584 < local75; local584++) {
					for (@Pc(591) int local591 = local83 - 1; local591 >= local79; local591--) {
						if (local591 >= local584 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 4) {
			if (arg8 == 0) {
				for (@Pc(630) int local630 = local91 - 1; local630 >= local87; local630--) {
					for (@Pc(635) int local635 = local63; local635 < local67; local635++) {
						if (local635 >= local630 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(669) int local669 = local71; local669 < local75; local669++) {
					for (@Pc(674) int local674 = local63; local674 < local67; local674++) {
						if (local674 <= local669 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(708) int local708 = local71; local708 < local75; local708++) {
					for (@Pc(715) int local715 = local83 - 1; local715 >= local79; local715--) {
						if (local715 >= local708 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(751) int local751 = local91 - 1; local751 >= local87; local751--) {
					for (@Pc(758) int local758 = local83 - 1; local758 >= local79; local758--) {
						if (local758 <= local751 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 != 5) {
			if (arg7 == 6) {
				if (arg8 == 0) {
					for (@Pc(962) int local962 = local71; local962 < local75; local962++) {
						for (@Pc(967) int local967 = local63; local967 < local67; local967++) {
							if (local967 <= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (@Pc(1001) int local1001 = local71; local1001 < local75; local1001++) {
						for (@Pc(1006) int local1006 = local63; local1006 < local67; local1006++) {
							if (local1001 <= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (@Pc(1040) int local1040 = local71; local1040 < local75; local1040++) {
						for (@Pc(1045) int local1045 = local63; local1045 < local67; local1045++) {
							if (local1045 >= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (@Pc(1079) int local1079 = local71; local1079 < local75; local1079++) {
						for (@Pc(1084) int local1084 = local63; local1084 < local67; local1084++) {
							if (local1079 >= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 7) {
				if (arg8 == 0) {
					for (@Pc(1120) int local1120 = local71; local1120 < local75; local1120++) {
						for (@Pc(1125) int local1125 = local63; local1125 < local67; local1125++) {
							if (local1125 <= local1120 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (@Pc(1163) int local1163 = local91 - 1; local1163 >= local87; local1163--) {
						for (@Pc(1168) int local1168 = local63; local1168 < local67; local1168++) {
							if (local1168 <= local1163 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (@Pc(1206) int local1206 = local91 - 1; local1206 >= local87; local1206--) {
						for (@Pc(1213) int local1213 = local83 - 1; local1213 >= local79; local1213--) {
							if (local1213 <= local1206 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (@Pc(1249) int local1249 = local71; local1249 < local75; local1249++) {
						for (@Pc(1256) int local1256 = local83 - 1; local1256 >= local79; local1256--) {
							if (local1256 <= local1249 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 8) {
				if (arg8 == 0) {
					for (@Pc(1294) int local1294 = local71; local1294 < local75; local1294++) {
						for (@Pc(1299) int local1299 = local63; local1299 < local67; local1299++) {
							if (local1299 >= local1294 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (@Pc(1337) int local1337 = local91 - 1; local1337 >= local87; local1337--) {
						for (@Pc(1342) int local1342 = local63; local1342 < local67; local1342++) {
							if (local1342 >= local1337 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (@Pc(1380) int local1380 = local91 - 1; local1380 >= local87; local1380--) {
						for (@Pc(1387) int local1387 = local83 - 1; local1387 >= local79; local1387--) {
							if (local1387 >= local1380 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (@Pc(1423) int local1423 = local71; local1423 < local75; local1423++) {
						for (@Pc(1430) int local1430 = local83 - 1; local1430 >= local79; local1430--) {
							if (local1430 >= local1423 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
		} else if (arg8 == 0) {
			for (@Pc(797) int local797 = local91 - 1; local797 >= local87; local797--) {
				for (@Pc(804) int local804 = local83 - 1; local804 >= local79; local804--) {
					if (local804 >= local797 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 1) {
			for (@Pc(840) int local840 = local91 - 1; local840 >= local87; local840--) {
				for (@Pc(845) int local845 = local63; local845 < local67; local845++) {
					if (local845 <= local840 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 2) {
			for (@Pc(879) int local879 = local71; local879 < local75; local879++) {
				for (@Pc(884) int local884 = local63; local884 < local67; local884++) {
					if (local884 >= local879 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 3) {
			for (@Pc(918) int local918 = local71; local918 < local75; local918++) {
				for (@Pc(925) int local925 = local83 - 1; local925 >= local79; local925--) {
					if (local925 <= local918 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)Lclient!ll;")
	public static LinkedList method2410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) LinkedList local3 = new LinkedList();
		for (@Pc(8) Class4_Sub3_Sub7 local8 = (Class4_Sub3_Sub7) Static3.aClass175_12.head(); local8 != null; local8 = (Class4_Sub3_Sub7) Static3.aClass175_12.next()) {
			method2404(local8, arg0, arg1);
			local3.addTail(local8);
		}
		@Pc(29) int[] local29 = new int[3];
		for (@Pc(31) int local31 = 0; local31 < Static3.aClass138_6.anInt4219; local31++) {
			@Pc(40) Class4_Sub3_Sub7 local40 = Static3.aClass138_6.aClass4_Sub3_Sub7Array1[local31];
			@Pc(67) boolean local67 = Static3.aClass4_Sub3_Sub22_3.method4753(Static3.aClass138_6.anIntArray448[local31] & 0x3FFF, Static3.aClass138_6.anIntArray448[local31] >> 28 & 0x3, local29, Static3.aClass138_6.anIntArray448[local31] >> 14 & 0x3FFF);
			if (local67) {
				local40.anInt1768 = local29[1] - Static3.anInt2962;
				local40.anInt1769 = Static3.anInt2960 + Static3.anInt2961 - local29[2] - 1;
				method2404(local40, arg0, arg1);
				local3.addTail(local40);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!co;)V")
	public static void method1902(@OriginalArg(0) Class33 arg0) {
		for (@Pc(2) int local2 = arg0.anInt824; local2 <= arg0.anInt825; local2++) {
			for (@Pc(9) int local9 = arg0.anInt826; local9 <= arg0.anInt817; local9++) {
				@Pc(22) Class4_Sub19 local22 = Static1.aClass4_Sub19ArrayArrayArray1[arg0.anInt819][local2][local9];
				if (local22 != null) {
					for (@Pc(26) int local26 = 0; local26 < local22.anInt3554; local26++) {
						if (local22.aClass33Array3[local26] == arg0) {
							local22.anInt3554--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt3554; local44++) {
								local22.aClass33Array3[local44] = local22.aClass33Array3[local44 + 1];
								local22.anIntArray390[local44] = local22.anIntArray390[local44 + 1];
							}
							local22.aClass33Array3[local22.anInt3554] = null;
							break;
						}
					}
					local22.anInt3551 = 0;
					for (@Pc(84) int local84 = 0; local84 < local22.anInt3554; local84++) {
						local22.anInt3551 |= local22.anIntArray390[local84];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IC)Z")
	public static boolean method1907(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	public static void method1916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static2.anInt1943 > 0) {
			Static24.method2702(Static2.anInt1943);
			Static2.anInt1943 = 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = Static6.anInt5188 * arg0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < 255; local29++) {
			@Pc(49) int local49 = (256 - local29) * Static4.anIntArray314[local29] / 256;
			if (local49 < 0) {
				local49 = 0;
			}
			local15 += local49;
			for (@Pc(61) int local61 = local49; local61 < 128; local61++) {
				@Pc(74) int local74 = Static6.anIntArray561[arg1 + local23++];
				@Pc(79) int local79 = Static2.anIntArray100[local15++];
				if (local79 == 0) {
					Static4.aClass4_Sub3_Sub14_Sub1_4.anIntArray241[local27++] = local74;
				} else {
					@Pc(96) int local96 = local79 + 18;
					if (local96 > 255) {
						local96 = 255;
					}
					@Pc(108) int local108 = 256 - local79 - 18;
					if (local108 > 255) {
						local108 = 255;
					}
					@Pc(120) int local120 = Static3.anIntArray196[local79];
					Static4.aClass4_Sub3_Sub14_Sub1_4.anIntArray241[local27++] = (local108 * (local74 & 0xFF00FF) + (local120 & 0xFF00FF) * local96 & 0xFF00FF00) + (local108 * (local74 & 0xFF00) + (local120 & 0xFF00) * local96 & 0xFF0000) >> 8;
				}
			}
			for (@Pc(160) int local160 = 0; local160 < local49; local160++) {
				Static4.aClass4_Sub3_Sub14_Sub1_4.anIntArray241[local27++] = Static6.anIntArray561[arg1 + local23++];
			}
			local23 += Static6.anInt5188 - 128;
		}
		if (Static3.aBoolean138) {
			Static18.method1697(Static4.aClass4_Sub3_Sub14_Sub1_4.anIntArray241, arg1, arg0, Static4.aClass4_Sub3_Sub14_Sub1_4.anInt5609, Static4.aClass4_Sub3_Sub14_Sub1_4.anInt5608);
		} else {
			Static4.aClass4_Sub3_Sub14_Sub1_4.method4510(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIBLclient!fh;)Lclient!uj;")
	public static Class4_Sub3_Sub14 method1917(@OriginalArg(0) int arg0, @OriginalArg(3) Class58 arg1) {
		return Static9.method197(arg1, arg0, 0) ? Static14.method1063() : null;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method1921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 <= 3) {
			return local8 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
		} else {
			return "<col=80ff00>";
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	private static void method1922() {
		if (Static3.aClass4_Sub3_Sub22_3 == null) {
			return;
		}
		if (Static4.anInt2644 < 10) {
			if (!Static3.aClass58_65.method1365(Static3.aClass4_Sub3_Sub22_3.aString358)) {
				Static4.anInt2644 = Static5.aClass58_82.method1342(Static3.aClass4_Sub3_Sub22_3.aString358) / 10;
				return;
			}
			Static30.method3597();
			Static4.anInt2644 = 10;
		}
		if (Static4.anInt2644 == 10) {
			Static3.anInt2962 = Static3.aClass4_Sub3_Sub22_3.anInt5991 >> 6 << 6;
			Static3.anInt2965 = (Static3.aClass4_Sub3_Sub22_3.anInt6002 >> 6 << 6) + 64 - Static3.anInt2962;
			Static3.anInt2961 = Static3.aClass4_Sub3_Sub22_3.anInt5996 >> 6 << 6;
			@Pc(70) int[] local70 = new int[3];
			Static3.anInt2960 = (Static3.aClass4_Sub3_Sub22_3.anInt6007 >> 6 << 6) + 64 - Static3.anInt2961;
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = -1;
			if (Static3.aClass4_Sub3_Sub22_3.method4753(Static7.anInt5479 + (Static4.aClass53_Sub1_Sub1_2.anInt4002 >> 7), Static7.anInt5334, local70, (Static4.aClass53_Sub1_Sub1_2.anInt3974 >> 7) + Static5.anInt3983)) {
				local86 = local70[1] - Static3.anInt2962;
				local84 = Static3.anInt2961 + Static3.anInt2960 - local70[2] - 1;
			}
			if (!Static2.aBoolean82 && local86 >= 0 && Static3.anInt2965 > local86 && local84 >= 0 && Static3.anInt2960 > local84) {
				@Pc(153) int local153 = local84 + (int) (Math.random() * 10.0D) - 5;
				Static7.anInt5231 = local153;
				@Pc(164) int local164 = local86 + (int) (Math.random() * 10.0D) - 5;
				Static1.anInt331 = local164;
			} else if (Static6.anInt4953 == -1 || Static3.anInt2571 == -1) {
				Static3.aClass4_Sub3_Sub22_3.method4755(local70, Static3.aClass4_Sub3_Sub22_3.anInt5992 & 0x3FFF, Static3.aClass4_Sub3_Sub22_3.anInt5992 >> 14 & 0x3FFF);
				Static7.anInt5231 = Static3.anInt2961 + Static3.anInt2960 - local70[2] - 1;
				Static1.anInt331 = local70[1] - Static3.anInt2962;
			} else {
				Static3.aClass4_Sub3_Sub22_3.method4755(local70, Static3.anInt2571, Static6.anInt4953);
				Static3.anInt2571 = -1;
				Static6.anInt4953 = -1;
				Static2.aBoolean82 = false;
				if (local70 != null) {
					Static7.anInt5231 = Static3.anInt2960 + Static3.anInt2961 - local70[2] - 1;
					Static1.anInt331 = local70[1] - Static3.anInt2962;
				}
			}
			if (Static3.aClass4_Sub3_Sub22_3.anInt6006 == 37) {
				Static3.aFloat68 = 3.0F;
				Static3.aFloat69 = 3.0F;
			} else if (Static3.aClass4_Sub3_Sub22_3.anInt6006 == 50) {
				Static3.aFloat68 = 4.0F;
				Static3.aFloat69 = 4.0F;
			} else if (Static3.aClass4_Sub3_Sub22_3.anInt6006 == 75) {
				Static3.aFloat68 = 6.0F;
				Static3.aFloat69 = 6.0F;
			} else if (Static3.aClass4_Sub3_Sub22_3.anInt6006 == 100) {
				Static3.aFloat68 = 8.0F;
				Static3.aFloat69 = 8.0F;
			} else if (Static3.aClass4_Sub3_Sub22_3.anInt6006 == 200) {
				Static3.aFloat68 = 16.0F;
				Static3.aFloat69 = 16.0F;
			} else {
				Static3.aFloat68 = 8.0F;
				Static3.aFloat69 = 8.0F;
			}
			Static28.method3249();
			@Pc(309) int local309 = Static3.anInt2965 >> 6;
			Static3.anIntArray266 = new int[Static2.anInt5716 + 1];
			@Pc(318) int local318 = Static3.anInt2960 >> 6;
			Static3.aByteArrayArrayArray11 = new byte[local309][local318][];
			Static3.anIntArrayArrayArray6 = new int[local309][local318][];
			Static3.aByteArrayArrayArray12 = new byte[local309][local318][];
			Static3.aByteArrayArrayArray13 = new byte[local309][local318][];
			Static3.anIntArrayArrayArray7 = new int[local309][local318][];
			Static3.aByteArrayArrayArray10 = new byte[local309][local318][];
			Static3.aByteArrayArrayArray14 = new byte[local309][local318][];
			Static3.aClass112_13 = new LinkedList();
			Static1.aClass130_1 = new Class130();
			@Pc(358) int local358 = Static2.anInt1273 >> 1;
			@Pc(364) int local364 = Static6.anInt4555 >> 2 << 10;
			method2408(local364, local358);
			Static14.method1064(1024, 256);
			Static16.method1501(256);
			Static4.anInt2644 = 20;
		} else if (Static4.anInt2644 == 20) {
			Static26.method2934(new Buffer(Static3.aClass58_65.method1358("underlay", Static3.aClass4_Sub3_Sub22_3.aString358)));
			Static4.anInt2644 = 30;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (Static4.anInt2644 == 30) {
			Static19.method2398(new Buffer(Static3.aClass58_65.method1358("overlay", Static3.aClass4_Sub3_Sub22_3.aString358)));
			Static4.anInt2644 = 40;
			GameShell.resetTimer();
		} else if (Static4.anInt2644 == 40) {
			method2406(new Buffer(Static3.aClass58_65.method1358("overlay2", Static3.aClass4_Sub3_Sub22_3.aString358)));
			Static4.anInt2644 = 50;
			GameShell.resetTimer();
		} else if (Static4.anInt2644 == 50) {
			method2407(new Buffer(Static3.aClass58_65.method1358("loc", Static3.aClass4_Sub3_Sub22_3.aString358)), Static7.aBoolean370);
			Static4.anInt2644 = 60;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (Static4.anInt2644 == 60) {
			if (Static3.aClass58_65.method1344(Static3.aClass4_Sub3_Sub22_3.aString358 + "_labels")) {
				if (!Static3.aClass58_65.method1365(Static3.aClass4_Sub3_Sub22_3.aString358 + "_labels")) {
					return;
				}
				Static3.aClass138_6 = Static16.method1555(Static3.aClass58_65, Static3.aClass4_Sub3_Sub22_3.aString358 + "_labels", Static7.aBoolean370);
			} else {
				Static3.aClass138_6 = new Class138(0);
			}
			Static19.method2400();
			Static4.anInt2644 = 70;
			GameShell.resetTimer();
		} else if (Static4.anInt2644 == 70) {
			Static6.aClass106_7 = new Class106(11, true, GameShell.canvas);
			Static4.anInt2644 = 73;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (Static4.anInt2644 == 73) {
			Static4.aClass106_3 = new Class106(12, true, GameShell.canvas);
			Static4.anInt2644 = 76;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (Static4.anInt2644 == 76) {
			Static4.aClass106_5 = new Class106(14, true, GameShell.canvas);
			Static4.anInt2644 = 79;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (Static4.anInt2644 == 79) {
			Static4.aClass106_4 = new Class106(17, true, GameShell.canvas);
			Static4.anInt2644 = 82;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (Static4.anInt2644 == 82) {
			Static1.aClass106_1 = new Class106(19, true, GameShell.canvas);
			Static4.anInt2644 = 85;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (Static4.anInt2644 == 85) {
			Static2.aClass106_2 = new Class106(22, true, GameShell.canvas);
			Static4.anInt2644 = 88;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (Static4.anInt2644 == 88) {
			Static5.aClass106_6 = new Class106(26, true, GameShell.canvas);
			Static4.anInt2644 = 91;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else {
			Static6.aClass106_8 = new Class106(30, true, GameShell.canvas);
			Static4.anInt2644 = 100;
			Static32.method3917(true);
			GameShell.resetTimer();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	public static void method1923() {
		Static5.aClass26_35.sweep(5);
		Static2.aClass26_7.sweep(5);
		Static5.aClass26_37.sweep(5);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
	public static void method1924() {
		if (Static7.aBoolean401) {
			return;
		}
		if (Static5.aBoolean293) {
			Static5.aFloat97 = (int) Static5.aFloat97 + 191 & 0xFFFFFF80;
		} else {
			Static4.aFloat79 += (24.0F - Static4.aFloat79) / 2.0F;
		}
		Static7.aBoolean401 = true;
		Static5.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public static void method1925() {
		Static2.aClass26_16.clearSoft();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1926(@OriginalArg(1) Component arg0) {
		@Pc(1) Method local1 = SignLink.setFocusTraversalKeysEnabled;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static7.aClass161_1);
		arg0.addFocusListener(Static7.aClass161_1);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)Lclient!gb;")
	public static Class63_Sub1 method1927(@OriginalArg(1) int arg0) {
		return Static6.aBoolean338 && Static6.anInt4615 <= arg0 && Static1.anInt645 >= arg0 ? Static2.aClass63_Sub1Array1[arg0 - Static6.anInt4615] : null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBIII)V")
	public static void method1928(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static4.anInt2644 < 100) {
			method1922();
		}
		if (Static3.aBoolean138) {
			Static18.method1693(arg2, arg1, arg2 + arg3, arg0 + arg1);
		} else {
			Static34.method4209(arg2, arg1, arg3 + arg2, arg1 + arg0);
		}
		if (Static4.anInt2644 < 100) {
			@Pc(47) int local47 = arg3 / 2 + arg2;
			@Pc(59) int local59 = arg1 + arg0 / 2 - 20 - 18;
			if (Static3.aBoolean138) {
				Static18.method1701(arg2, arg1, arg3, arg0, 0);
				Static18.method1690(local47 - 152, local59, 304, 34, 9179409);
				Static18.method1701(local47 - 150, local59 + 2, Static4.anInt2644 * 3, 30, 9179409);
			} else {
				Static33.method4205(arg2, arg1, arg3, arg0, 0);
				Static34.method4222(local47 - 152, local59, 304, 34, 9179409);
				Static33.method4205(local47 - 150, local59 + 2, Static4.anInt2644 * 3, 30, 9179409);
			}
			Static5.aClass4_Sub3_Sub5_3.method2271(LocalisedText.LOADINGDOTDOTDOT, local47, local59 + 20, 16777215, -1);
			return;
		}
		Static7.anInt5680 = (int) ((float) (arg0 * 2) / Static3.aFloat68);
		Static5.anInt3546 = Static7.anInt5231 - (int) ((float) arg0 / Static3.aFloat68);
		Static3.anInt2542 = Static1.anInt331 - (int) ((float) arg3 / Static3.aFloat68);
		Static7.anInt5331 = (int) ((float) (arg3 * 2) / Static3.aFloat68);
		@Pc(169) int local169 = Static1.anInt331 - (int) ((float) arg3 / Static3.aFloat68);
		@Pc(177) int local177 = Static7.anInt5231 - (int) ((float) arg0 / Static3.aFloat68);
		@Pc(190) int local190 = (int) ((float) arg3 / Static3.aFloat68) + Static1.anInt331;
		@Pc(198) int local198 = (int) ((float) arg0 / Static3.aFloat68) + Static7.anInt5231;
		if (Static3.aBoolean138) {
			if (Static3.aClass4_Sub3_Sub14_Sub1_2 == null || arg3 != Static3.aClass4_Sub3_Sub14_Sub1_2.anInt5609 || Static3.aClass4_Sub3_Sub14_Sub1_2.anInt5608 != arg0) {
				Static3.aClass4_Sub3_Sub14_Sub1_2 = null;
				Static3.aClass4_Sub3_Sub14_Sub1_2 = new Class4_Sub3_Sub14_Sub1(arg3, arg0);
			}
			Static34.method4224(Static3.aClass4_Sub3_Sub14_Sub1_2.anIntArray241, arg3, arg0);
			Static19.method2401(local169, local177, local190, local198, 0, 0, arg3, arg0 + 1);
			method2403();
			@Pc(268) LinkedList local268 = Static19.method2397();
			Static9.method193(local268, arg2, arg1);
			Static3.aClass4_Sub3_Sub14_Sub1_2.method2169();
			Static18.method1697(Static3.aClass4_Sub3_Sub14_Sub1_2.anIntArray241, arg2, arg1, arg3, arg0);
			Static6.anIntArray561 = null;
		} else {
			Static19.method2401(local169, local177, local190, local198, arg2, arg1, arg3 + arg2, arg0 + arg1 + 1);
			method2403();
			@Pc(218) LinkedList local218 = Static19.method2397();
			Static9.method193(local218, 0, 0);
		}
		if (Static4.anInt2853 > 0) {
			Static5.anInt4215--;
			if (Static5.anInt4215 == 0) {
				Static5.anInt4215 = 20;
				Static4.anInt2853--;
			}
		}
		if (!Static3.aBoolean176) {
			return;
		}
		@Pc(310) int local310 = arg3 + arg2 - 5;
		@Pc(312) int local312 = 16776960;
		@Pc(318) int local318 = arg1 + arg0 - 8;
		Static5.aClass4_Sub3_Sub5_2.method2275("Fps:" + GameShell.framesPerSecond, local310, local318, 16776960, -1);
		@Pc(334) Runtime local334 = Runtime.getRuntime();
		local318 -= 15;
		@Pc(344) int local344 = (int) ((local334.totalMemory() - local334.freeMemory()) / 1024L);
		if (local344 > 65536) {
			local312 = 16711680;
		}
		Static5.aClass4_Sub3_Sub5_2.method2275("Mem:" + local344 + "k", local310, local318, local312, -1);
		@Pc(368) int local368 = local318 - 15;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public static void method1929() {
		Static1.aClass4_Sub3_Sub10_2 = null;
		Static1.aClass4_Sub3_Sub10_1 = null;
		Static2.aClass4_Sub3_Sub10_3 = null;
		Static3.aClass4_Sub3_Sub10_4 = null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIZ)V")
	public static void method1930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static2.anInt902 <= arg0 && Static3.anInt2553 >= arg0) {
			arg1 = Static8.method9(Static4.anInt3086, arg1, Static5.anInt4230);
			arg2 = Static8.method9(Static4.anInt3086, arg2, Static5.anInt4230);
			Static10.method306(arg0, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
	public static void method1932() {
		if (Static4.aClass53_Sub1_Sub1_2 != null && Static4.aClass53_Sub1_Sub1_2.anInt3974 + 64 - Static4.aClass53_Sub1_Sub1_2.method3311() * 64 >> 7 == Static6.anInt4506 && Static4.aClass53_Sub1_Sub1_2.anInt4002 + 64 - Static4.aClass53_Sub1_Sub1_2.method3311() * 64 >> 7 == Static3.anInt2140) {
			Static3.aBoolean147 = false;
			Static6.anInt4506 = 0;
		}
		for (@Pc(46) int local46 = 0; local46 < 104; local46++) {
			for (@Pc(53) int local53 = 0; local53 < 104; local53++) {
				Static1.anIntArrayArray2[local46][local53] = 0;
			}
		}
		for (@Pc(79) int local79 = 0; local79 < Static3.anInt2510; local79++) {
			@Pc(92) Class53_Sub1_Sub1 local92 = Static5.aClass53_Sub1_Sub1Array1[Static4.anIntArray317[local79]];
			if (local92 != null) {
				local92.aBoolean281 = false;
			}
		}
		for (@Pc(103) int local103 = 0; local103 < Static6.anInt4451; local103++) {
			@Pc(112) Class53_Sub1_Sub2 local112 = Static3.aClass53_Sub1_Sub2Array1[Static7.anIntArray595[local103]];
			if (local112 != null) {
				local112.aBoolean281 = false;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
	public static String method1940(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (Static5.anInterface1_1 != null) {
			@Pc(18) String local18 = Static5.anInterface1_1.method3224(arg0, arg2, arg1);
			if (local18 != null) {
				return local18;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V")
	public static void method1942() {
		Static6.aClass26_48.sweep(50);
		Static1.aClass26_1.sweep(50);
		Static1.aClass26_4.sweep(50);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	public static void method1949() {
		@Pc(9) Container local9;
		if (GameShell.fullScreenFrame != null) {
			local9 = GameShell.fullScreenFrame;
		} else if (GameShell.frame == null) {
			local9 = GameShell.signLink.applet;
		} else {
			local9 = GameShell.frame;
		}
		GameShell.frameWidth = local9.getSize().width;
		GameShell.frameHeight = local9.getSize().height;
		if (local9 == GameShell.frame) {
			@Pc(35) Insets local35 = GameShell.frame.getInsets();
			GameShell.frameWidth -= local35.left + local35.right;
			GameShell.frameHeight -= local35.bottom + local35.top;
		}
		if (Static11.method557() >= 2) {
			GameShell.topMargin = 0;
			GameShell.canvasWidth = GameShell.frameWidth;
			GameShell.leftMargin = 0;
			GameShell.canvasHeight = GameShell.frameHeight;
		} else {
			GameShell.canvasWidth = 765;
			GameShell.canvasHeight = 503;
			GameShell.leftMargin = (GameShell.frameWidth - 765) / 2;
			GameShell.topMargin = 0;
		}
		if (Static3.aBoolean138) {
			Static16.method1587(GameShell.canvasWidth, GameShell.canvasHeight);
		}
		GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
		if (local9 == GameShell.frame) {
			@Pc(104) Insets local104 = GameShell.frame.getInsets();
			GameShell.canvas.setLocation(local104.left + GameShell.leftMargin, GameShell.topMargin + local104.top);
		} else {
			GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
		}
		if (Static3.anInt5398 != -1) {
			Static12.method777(true);
		}
		Static29.method3430();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!vc;IIIII)V")
	public static void method1951(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static5.anInt4309) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static7.anInt5632) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static7.anInt5590 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class4_Sub19 local71 = Static1.aClass4_Sub19ArrayArrayArray1[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static6.anIntArrayArrayArray13[local17][local28][local39] + Static6.anIntArrayArrayArray13[local17][local28 + 1][local39] + Static6.anIntArrayArrayArray13[local17][local28][local39 + 1] + Static6.anIntArrayArrayArray13[local17][local28 + 1][local39 + 1]) / 4 - (Static6.anIntArrayArrayArray13[arg1][arg2][arg3] + Static6.anIntArrayArrayArray13[arg1][arg2 + 1][arg3] + Static6.anIntArrayArrayArray13[arg1][arg2][arg3 + 1] + Static6.anIntArrayArrayArray13[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class179 local161 = local71.aClass179_1;
									if (local161 != null) {
										if (local161.aClass53_5.method3808()) {
											arg0.method3807(local161.aClass53_5, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass53_4 != null && local161.aClass53_4.method3808()) {
											arg0.method3807(local161.aClass53_4, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt3554; local232++) {
										@Pc(241) Class33 local241 = local71.aClass33Array3[local232];
										if (local241 != null && local241.aClass53_1.method3808() && (local28 == local241.anInt824 || local28 == local3) && (local39 == local241.anInt826 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt825 + 1 - local241.anInt824;
											@Pc(278) int local278 = local241.anInt817 + 1 - local241.anInt826;
											arg0.method3807(local241.aClass53_1, (local241.anInt824 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt826 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIZI)I")
	public static int method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg0;
		} else {
			@Pc(19) int local19 = 128 - arg2;
			@Pc(37) int local37 = arg2 * (arg1 >>> 7 & 0x1FE01FE) + (arg0 >>> 7 & 0x1FE01FE) * local19 & 0xFF00FF00;
			@Pc(51) int local51 = arg2 * (arg1 & 0xFF00FF) + (arg0 & 0xFF00FF) * local19 & 0xFF00FF00;
			return local37 + (local51 >> 7);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BII)I")
	public static int method1953(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(37) int local37 = Static10.method303(arg1 - 1, arg0 - 1) + Static10.method303(arg1 + 1, arg0 - 1) + Static10.method303(arg1 - 1, arg0 + 1) + Static10.method303(arg1 + 1, arg0 + 1);
		@Pc(71) int local71 = Static10.method303(arg1 - 1, arg0) + Static10.method303(arg1 + 1, arg0) + Static10.method303(arg1, arg0 - 1) + Static10.method303(arg1, arg0 + 1);
		@Pc(80) int local80 = Static10.method303(arg1, arg0);
		return local37 / 16 + local71 / 8 + local80 / 4;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)J")
	public static long method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3554; local13++) {
			@Pc(22) Class33 local22 = local7.aClass33Array3[local13];
			if ((local22.aLong38 >> 29 & 0x3L) == 2L && local22.anInt824 == arg1 && local22.anInt826 == arg2) {
				return local22.aLong38;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lclient!wh;")
	public static Class4_Sub3_Sub23 method1961(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub23 local10 = (Class4_Sub3_Sub23) Static4.aClass40_12.method889((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26;
		if (arg0 >= 32768) {
			local26 = Static2.aClass58_26.method1372(0, arg0 & 0x7FFF);
		} else {
			local26 = Static6.aClass58_91.method1372(0, arg0);
		}
		@Pc(38) Class4_Sub3_Sub23 local38 = new Class4_Sub3_Sub23();
		if (local26 != null) {
			local38.method4772(new Buffer(local26));
		}
		if (arg0 >= 32768) {
			local38.method4778();
		}
		Static4.aClass40_12.method888((long) arg0, local38);
		return local38;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
	public static void method1963(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class4_Sub11 local10 = (Class4_Sub11) Static1.aClass112_2.head(); local10 != null; local10 = (Class4_Sub11) Static1.aClass112_2.next()) {
			Static12.method731(arg0, arg2, arg3, local10, arg1);
		}
		for (@Pc(31) Class4_Sub11 local31 = (Class4_Sub11) Static2.aClass112_9.head(); local31 != null; local31 = (Class4_Sub11) Static2.aClass112_9.next()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class34 local45 = local31.aClass53_Sub1_Sub2_1.method3314();
			if (local31.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt860) {
				local40 = 0;
			} else if (local31.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt831 || local31.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt829 || local31.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt857 || local31.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt867) {
				local40 = 2;
			} else if (local31.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt854 || local31.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt833 || local31.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt861 || local45.anInt852 == local31.aClass53_Sub1_Sub2_1.anInt4005) {
				local40 = 3;
			}
			if (local40 != local31.anInt2111) {
				@Pc(135) int local135 = Static10.method395(local31.aClass53_Sub1_Sub2_1);
				if (local31.anInt2115 != local135) {
					if (local31.aClass4_Sub6_Sub4_3 != null) {
						Static5.aClass4_Sub6_Sub3_2.method2670(local31.aClass4_Sub6_Sub4_3);
						local31.aClass4_Sub6_Sub4_3 = null;
					}
					local31.anInt2115 = local135;
				}
				local31.anInt2111 = local40;
			}
			local31.anInt2124 = local31.aClass53_Sub1_Sub2_1.anInt3974;
			local31.anInt2117 = local31.aClass53_Sub1_Sub2_1.anInt3974 + local31.aClass53_Sub1_Sub2_1.method3311() * 64;
			local31.anInt2113 = local31.aClass53_Sub1_Sub2_1.anInt4002;
			local31.anInt2112 = local31.aClass53_Sub1_Sub2_1.anInt4002 + local31.aClass53_Sub1_Sub2_1.method3311() * 64;
			Static12.method731(arg0, arg2, arg3, local31, arg1);
		}
		for (@Pc(217) Class4_Sub11 local217 = (Class4_Sub11) Static5.aClass84_18.head(); local217 != null; local217 = (Class4_Sub11) Static5.aClass84_18.next()) {
			@Pc(222) byte local222 = 1;
			@Pc(227) Class34 local227 = local217.aClass53_Sub1_Sub1_1.method3314();
			if (local227.anInt860 == local217.aClass53_Sub1_Sub1_1.anInt4005) {
				local222 = 0;
			} else if (local227.anInt831 == local217.aClass53_Sub1_Sub1_1.anInt4005 || local227.anInt829 == local217.aClass53_Sub1_Sub1_1.anInt4005 || local217.aClass53_Sub1_Sub1_1.anInt4005 == local227.anInt857 || local217.aClass53_Sub1_Sub1_1.anInt4005 == local227.anInt867) {
				local222 = 2;
			} else if (local217.aClass53_Sub1_Sub1_1.anInt4005 == local227.anInt854 || local217.aClass53_Sub1_Sub1_1.anInt4005 == local227.anInt833 || local217.aClass53_Sub1_Sub1_1.anInt4005 == local227.anInt861 || local217.aClass53_Sub1_Sub1_1.anInt4005 == local227.anInt852) {
				local222 = 3;
			}
			if (local217.anInt2111 != local222) {
				@Pc(318) int local318 = Static10.method396(local217.aClass53_Sub1_Sub1_1);
				if (local217.anInt2115 != local318) {
					if (local217.aClass4_Sub6_Sub4_3 != null) {
						Static5.aClass4_Sub6_Sub3_2.method2670(local217.aClass4_Sub6_Sub4_3);
						local217.aClass4_Sub6_Sub4_3 = null;
					}
					local217.anInt2115 = local318;
				}
				local217.anInt2111 = local222;
			}
			local217.anInt2124 = local217.aClass53_Sub1_Sub1_1.anInt3974;
			local217.anInt2117 = local217.aClass53_Sub1_Sub1_1.anInt3974 + local217.aClass53_Sub1_Sub1_1.method3311() * 64;
			local217.anInt2113 = local217.aClass53_Sub1_Sub1_1.anInt4002;
			local217.anInt2112 = local217.aClass53_Sub1_Sub1_1.anInt4002 + local217.aClass53_Sub1_Sub1_1.method3311() * 64;
			Static12.method731(arg0, arg2, arg3, local217, arg1);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method1964(@OriginalArg(1) Class58 arg0) {
		Static1.aClass58_20 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void method1969() {
		Static6.aClass26_53.clearSoft();
		Static7.aClass26_49.clearSoft();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBI)V")
	public static void method1970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static1.anInt929 = Static3.anInt2961 + Static3.anInt2960 - arg1 - 1;
		Static6.anInt4393 = arg0 - Static3.anInt2962;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method1974() {
		Static6.aClass26_48.clearSoft();
		Static1.aClass26_1.clearSoft();
		Static1.aClass26_4.clearSoft();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIII)V")
	public static void method1975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg0) {
			Static18.method1656(Static5.anIntArrayArray36[arg3], arg2, arg0, arg1);
		} else {
			Static18.method1656(Static5.anIntArrayArray36[arg3], arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method1976() {
		for (@Pc(16) Class4_Sub3_Sub2 local16 = (Class4_Sub3_Sub2) Static1.aClass112_1.head(); local16 != null; local16 = (Class4_Sub3_Sub2) Static1.aClass112_1.next()) {
			@Pc(22) Class53_Sub6 local22 = local16.aClass53_Sub6_1;
			if (local22.anInt3717 != Static7.anInt5334 || Static2.anInt954 > local22.anInt3707) {
				local16.unlink();
			} else if (local22.anInt3719 <= Static2.anInt954) {
				if (local22.anInt3713 > 0) {
					@Pc(61) Class53_Sub1_Sub2 local61 = Static3.aClass53_Sub1_Sub2Array1[local22.anInt3713 - 1];
					if (local61 != null && local61.anInt3974 >= 0 && local61.anInt3974 < 13312 && local61.anInt4002 >= 0 && local61.anInt4002 < 13312) {
						local22.method3105(Static11.method522(local61.anInt4002, local61.anInt3974, local22.anInt3717) - local22.anInt3722, local61.anInt3974, Static2.anInt954, local61.anInt4002);
					}
				}
				if (local22.anInt3713 < 0) {
					@Pc(113) int local113 = -local22.anInt3713 - 1;
					@Pc(118) Class53_Sub1_Sub1 local118;
					if (Static7.anInt2022 == local113) {
						local118 = Static4.aClass53_Sub1_Sub1_2;
					} else {
						local118 = Static5.aClass53_Sub1_Sub1Array1[local113];
					}
					if (local118 != null && local118.anInt3974 >= 0 && local118.anInt3974 < 13312 && local118.anInt4002 >= 0 && local118.anInt4002 < 13312) {
						local22.method3105(Static11.method522(local118.anInt4002, local118.anInt3974, local22.anInt3717) - local22.anInt3722, local118.anInt3974, Static2.anInt954, local118.anInt4002);
					}
				}
				local22.method3103(Static5.anInt4156);
				Static11.method637(Static7.anInt5334, (int) local22.aDouble8, (int) local22.aDouble10, (int) local22.aDouble5, 60, local22, local22.anInt3723, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!oj;)V")
	public static void method1978(@OriginalArg(1) HuffmanCodec arg0) {
		Static2.aClass129_1 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)Lclient!gb;")
	public static Class63_Sub1 method1991() {
		Static6.anInt3224 = 0;
		return Static19.method1777();
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII[I[I)V")
	private static void method4207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		if (Static6.anInt5187 - Static6.anInt5183 != arg5.length) {
			throw new IllegalStateException();
		} else if (arg0 >= Static6.anInt5185 && arg0 < Static6.anInt5186) {
			if (arg1 < Static6.anInt5183) {
				arg2 -= Static6.anInt5183 - arg1;
				arg1 = Static6.anInt5183;
			}
			if (arg1 + arg2 > Static6.anInt5187) {
				arg2 = Static6.anInt5187 - arg1;
			}
			@Pc(40) int local40 = 256 - arg4;
			@Pc(48) int local48 = (arg3 >> 16 & 0xFF) * arg4;
			@Pc(56) int local56 = (arg3 >> 8 & 0xFF) * arg4;
			@Pc(62) int local62 = (arg3 & 0xFF) * arg4;
			@Pc(68) int local68 = arg0 + arg1 * Static6.anInt5188;
			for (@Pc(70) int local70 = 0; local70 < arg2; local70++) {
				@Pc(79) int local79 = arg1 + local70 - Static6.anInt5183;
				if (arg0 - Static6.anInt5185 >= arg5[local79] && arg0 - Static6.anInt5185 < arg5[local79] + arg6[local79]) {
					@Pc(107) int local107 = (Static6.anIntArray561[local68] >> 16 & 0xFF) * local40;
					@Pc(117) int local117 = (Static6.anIntArray561[local68] >> 8 & 0xFF) * local40;
					@Pc(125) int local125 = (Static6.anIntArray561[local68] & 0xFF) * local40;
					@Pc(147) int local147 = (local48 + local107 >> 8 << 16) + (local56 + local117 >> 8 << 8) + (local62 + local125 >> 8);
					Static6.anIntArray561[local68] = local147;
				}
				local68 += Static6.anInt5188;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V")
	public static void method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 == 0) {
			method4211(arg0, arg1, arg3);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < Static6.anInt5183) {
			local15 = Static6.anInt5183;
		}
		@Pc(26) int local26 = arg1 + arg2 + 1;
		if (local26 > Static6.anInt5187) {
			local26 = Static6.anInt5187;
		}
		@Pc(33) int local33 = local15;
		@Pc(37) int local37 = arg2 * arg2;
		@Pc(39) int local39 = 0;
		@Pc(43) int local43 = arg1 - local15;
		@Pc(47) int local47 = local43 * local43;
		@Pc(51) int local51 = local47 - local43;
		if (arg1 > local26) {
			arg1 = local26;
		}
		while (local33 < arg1) {
			while (local51 <= local37 || local47 <= local37) {
				local47 += local39 + local39;
				local51 += local39++ + local39;
			}
			@Pc(85) int local85 = arg0 + 1 - local39;
			if (local85 < Static6.anInt5185) {
				local85 = Static6.anInt5185;
			}
			@Pc(94) int local94 = arg0 + local39;
			if (local94 > Static6.anInt5186) {
				local94 = Static6.anInt5186;
			}
			@Pc(105) int local105 = local85 + local33 * Static6.anInt5188;
			for (@Pc(107) int local107 = local85; local107 < local94; local107++) {
				Static6.anIntArray561[local105++] = arg3;
			}
			local33++;
			local47 -= local43-- + local43;
			local51 -= local43 + local43;
		}
		@Pc(134) int local134 = arg2;
		@Pc(138) int local138 = local33 - arg1;
		@Pc(144) int local144 = local138 * local138 + local37;
		@Pc(148) int local148 = local144 - arg2;
		@Pc(152) int local152 = local144 - local138;
		while (local33 < local26) {
			while (local152 > local37 && local148 > local37) {
				local152 -= local134-- + local134;
				local148 -= local134 + local134;
			}
			@Pc(179) int local179 = arg0 - local134;
			if (local179 < Static6.anInt5185) {
				local179 = Static6.anInt5185;
			}
			@Pc(188) int local188 = arg0 + local134;
			if (local188 > Static6.anInt5186 - 1) {
				local188 = Static6.anInt5186 - 1;
			}
			@Pc(203) int local203 = local179 + local33 * Static6.anInt5188;
			for (@Pc(205) int local205 = local179; local205 <= local188; local205++) {
				Static6.anIntArray561[local203++] = arg3;
			}
			local33++;
			local152 += local138 + local138;
			local148 += local138++ + local138;
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIII)V")
	public static void method4209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static6.anInt5188) {
			arg2 = Static6.anInt5188;
		}
		if (arg3 > Static6.anInt5184) {
			arg3 = Static6.anInt5184;
		}
		Static6.anInt5185 = arg0;
		Static6.anInt5183 = arg1;
		Static6.anInt5186 = arg2;
		Static6.anInt5187 = arg3;
		method4228();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III[I[I)V")
	public static void method4210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * Static6.anInt5188;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(17) int local17 = local5 + arg2[local7];
			for (@Pc(22) int local22 = -arg3[local7]; local22 < 0; local22++) {
				Static6.anIntArray561[local17++] = 0;
			}
			local5 += Static6.anInt5188;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
	private static void method4211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= Static6.anInt5185 && arg1 >= Static6.anInt5183 && arg0 < Static6.anInt5186 && arg1 < Static6.anInt5187) {
			Static6.anIntArray561[arg0 + arg1 * Static6.anInt5188] = arg2;
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(IIII)V")
	public static void method4212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < Static6.anInt5185 || arg0 >= Static6.anInt5186) {
			return;
		}
		if (arg1 < Static6.anInt5183) {
			arg2 -= Static6.anInt5183 - arg1;
			arg1 = Static6.anInt5183;
		}
		if (arg1 + arg2 > Static6.anInt5187) {
			arg2 = Static6.anInt5187 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * Static6.anInt5188;
		@Pc(34) int local34 = 0;
		while (local34 < arg2) {
			Static6.anIntArray561[local32] = arg3;
			local34++;
			local32 += Static6.anInt5188;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V")
	public static void method4213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < Static6.anInt5185) {
			arg2 -= Static6.anInt5185 - arg0;
			arg0 = Static6.anInt5185;
		}
		if (arg1 < Static6.anInt5183) {
			arg3 -= Static6.anInt5183 - arg1;
			arg1 = Static6.anInt5183;
		}
		if (arg0 + arg2 > Static6.anInt5186) {
			arg2 = Static6.anInt5186 - arg0;
		}
		if (arg1 + arg3 > Static6.anInt5187) {
			arg3 = Static6.anInt5187 - arg1;
		}
		arg4 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = Static6.anInt5188 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * Static6.anInt5188;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(87) int local87 = Static6.anIntArray561[local73];
				local87 = ((local87 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local87 & 0xFF00) * local63 >> 8 & 0xFF00);
				Static6.anIntArray561[local73++] = arg4 + local87;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(IIII)V")
	public static void method4214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < Static6.anInt5183 || arg1 >= Static6.anInt5187) {
			return;
		}
		if (arg0 < Static6.anInt5185) {
			arg2 -= Static6.anInt5185 - arg0;
			arg0 = Static6.anInt5185;
		}
		if (arg0 + arg2 > Static6.anInt5186) {
			arg2 = Static6.anInt5186 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * Static6.anInt5188;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			Static6.anIntArray561[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIIIII)V")
	public static void method4215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 - arg0;
		@Pc(7) int local7 = arg3 - arg1;
		@Pc(14) int local14 = local3 >= 0 ? local3 : -local3;
		@Pc(21) int local21 = local7 >= 0 ? local7 : -local7;
		@Pc(23) int local23 = local14;
		if (local14 < local21) {
			local23 = local21;
		}
		if (local23 == 0) {
			return;
		}
		@Pc(37) int local37 = (local3 << 16) / local23;
		@Pc(43) int local43 = (local7 << 16) / local23;
		if (local43 <= local37) {
			local37 = -local37;
		} else {
			local43 = -local43;
		}
		@Pc(59) int local59 = arg5 * local43 >> 17;
		@Pc(67) int local67 = arg5 * local43 + 1 >> 17;
		@Pc(73) int local73 = arg5 * local37 >> 17;
		@Pc(81) int local81 = arg5 * local37 + 1 >> 17;
		arg0 -= Static23.method2548();
		arg1 -= Static23.method2546();
		@Pc(93) int local93 = arg0 + local59;
		@Pc(97) int local97 = arg0 - local67;
		@Pc(103) int local103 = arg0 + local3 - local67;
		@Pc(109) int local109 = arg0 + local3 + local59;
		@Pc(113) int local113 = arg1 + local73;
		@Pc(117) int local117 = arg1 - local81;
		@Pc(123) int local123 = arg1 + local7 - local81;
		@Pc(129) int local129 = arg1 + local7 + local73;
		Static23.method2542(local93, local97, local103);
		Static23.method2550(local113, local117, local123, local93, local97, local103, arg4);
		Static23.method2542(local93, local103, local109);
		Static23.method2550(local113, local123, local129, local93, local103, local109, arg4);
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(IIIII)V")
	private static void method4216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < Static6.anInt5185 || arg0 >= Static6.anInt5186) {
			return;
		}
		if (arg1 < Static6.anInt5183) {
			arg2 -= Static6.anInt5183 - arg1;
			arg1 = Static6.anInt5183;
		}
		if (arg1 + arg2 > Static6.anInt5187) {
			arg2 = Static6.anInt5187 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * Static6.anInt5188;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (Static6.anIntArray561[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (Static6.anIntArray561[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (Static6.anIntArray561[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			Static6.anIntArray561[local58] = local113;
			local58 += Static6.anInt5188;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([I[I)V")
	public static void method4218(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0.length != Static6.anInt5187 - Static6.anInt5183 || arg1.length != Static6.anInt5187 - Static6.anInt5183) {
			throw new IllegalArgumentException();
		}
		Static6.anIntArray559 = arg0;
		Static6.anIntArray560 = arg1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII[I[I)V")
	public static void method4219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		if (Static6.anInt5187 - Static6.anInt5183 != arg6.length) {
			throw new IllegalStateException();
		}
		@Pc(13) int local13 = arg2 - arg0;
		@Pc(17) int local17 = arg3 - arg1;
		if (local17 == 0) {
			if (local13 >= 0) {
				method4231(arg0, arg1, local13, arg4, arg5, arg6, arg7);
			} else {
				method4231(arg0 + local13 + 1, arg1, -local13, arg4, arg5, arg6, arg7);
			}
		} else if (local13 != 0) {
			@Pc(73) boolean local73 = false;
			if (local13 + local17 < 0) {
				arg0 += local13;
				local13 = -local13;
				arg1 += local17;
				local17 = -local17;
				local73 = true;
			}
			@Pc(97) int local97 = 256 - arg5;
			@Pc(105) int local105 = (arg4 >> 16 & 0xFF) * arg5;
			@Pc(113) int local113 = (arg4 >> 8 & 0xFF) * arg5;
			@Pc(119) int local119 = (arg4 & 0xFF) * arg5;
			if (local13 > local17) {
				@Pc(126) int local126 = arg1 << 16;
				@Pc(130) int local130 = local126 + 32768;
				arg3 = local17 << 16;
				@Pc(144) int local144 = (int) Math.floor((double) arg3 / (double) local13 + 0.5D);
				@Pc(148) int local148 = local13 + arg0;
				if (local73) {
					local130 += local144;
					arg0++;
				}
				if (arg0 < Static6.anInt5185) {
					local130 += local144 * (Static6.anInt5185 - arg0);
					arg0 = Static6.anInt5185;
				}
				if (local148 >= Static6.anInt5186) {
					local148 = Static6.anInt5186 - 1;
				}
				if (!local73) {
					local148--;
				}
				while (arg0 <= local148) {
					@Pc(185) int local185 = local130 >> 16;
					@Pc(189) int local189 = local185 - Static6.anInt5183;
					if (local185 >= Static6.anInt5183 && local185 < Static6.anInt5187 && arg0 - Static6.anInt5185 >= arg6[local189] && arg0 - Static6.anInt5185 < arg6[local189] + arg7[local189]) {
						@Pc(219) int local219 = arg0 + local185 * Static6.anInt5188;
						@Pc(229) int local229 = (Static6.anIntArray561[local219] >> 16 & 0xFF) * local97;
						@Pc(239) int local239 = (Static6.anIntArray561[local219] >> 8 & 0xFF) * local97;
						@Pc(247) int local247 = (Static6.anIntArray561[local219] & 0xFF) * local97;
						@Pc(269) int local269 = (local105 + local229 >> 8 << 16) + (local113 + local239 >> 8 << 8) + (local119 + local247 >> 8);
						Static6.anIntArray561[local219] = local269;
					}
					local130 += local144;
					arg0++;
				}
			} else {
				@Pc(284) int local284 = arg0 << 16;
				@Pc(288) int local288 = local284 + 32768;
				arg2 = local13 << 16;
				@Pc(302) int local302 = (int) Math.floor((double) arg2 / (double) local17 + 0.5D);
				@Pc(306) int local306 = local17 + arg1;
				if (local73) {
					local288 += local302;
					arg1++;
				}
				if (arg1 < Static6.anInt5183) {
					local288 += local302 * (Static6.anInt5183 - arg1);
					arg1 = Static6.anInt5183;
				}
				if (local306 >= Static6.anInt5187) {
					local306 = Static6.anInt5187 - 1;
				}
				if (!local73) {
					local306--;
				}
				while (arg1 <= local306) {
					@Pc(343) int local343 = local288 >> 16;
					@Pc(347) int local347 = arg1 - Static6.anInt5183;
					if (local343 >= Static6.anInt5185 && local343 < Static6.anInt5186 && local343 - Static6.anInt5185 >= arg6[local347] && local343 - Static6.anInt5185 < arg6[local347] + arg7[local347]) {
						@Pc(377) int local377 = local343 + arg1 * Static6.anInt5188;
						@Pc(387) int local387 = (Static6.anIntArray561[local377] >> 16 & 0xFF) * local97;
						@Pc(397) int local397 = (Static6.anIntArray561[local377] >> 8 & 0xFF) * local97;
						@Pc(405) int local405 = (Static6.anIntArray561[local377] & 0xFF) * local97;
						@Pc(427) int local427 = (local105 + local387 >> 8 << 16) + (local113 + local397 >> 8 << 8) + (local119 + local405 >> 8);
						Static6.anIntArray561[local377] = local427;
					}
					local288 += local302;
					arg1++;
				}
			}
		} else if (local17 >= 0) {
			method4207(arg0, arg1, local17, arg4, arg5, arg6, arg7);
		} else {
			method4207(arg0, arg1 + local17 + 1, -local17, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(IIII)V")
	public static void method4220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static6.anInt5185 < arg0) {
			Static6.anInt5185 = arg0;
		}
		if (Static6.anInt5183 < arg1) {
			Static6.anInt5183 = arg1;
		}
		if (Static6.anInt5186 > arg2) {
			Static6.anInt5186 = arg2;
		}
		if (Static6.anInt5187 > arg3) {
			Static6.anInt5187 = arg3;
		}
		method4228();
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(IIIIII)V")
	public static void method4221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method4225(arg0, arg1, arg2, arg4, arg5);
		method4225(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method4216(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method4216(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(IIIII)V")
	public static void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method4214(arg0, arg1, arg2, arg4);
		method4214(arg0, arg1 + arg3 - 1, arg2, arg4);
		method4212(arg0, arg1, arg3, arg4);
		method4212(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([I)V")
	public static void method4223(@OriginalArg(0) int[] arg0) {
		arg0[0] = Static6.anInt5185;
		arg0[1] = Static6.anInt5183;
		arg0[2] = Static6.anInt5186;
		arg0[3] = Static6.anInt5187;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([III)V")
	public static void method4224(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static6.anIntArray561 = arg0;
		Static6.anInt5188 = arg1;
		Static6.anInt5184 = arg2;
		method4209(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(IIIII)V")
	public static void method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < Static6.anInt5183 || arg1 >= Static6.anInt5187) {
			return;
		}
		if (arg0 < Static6.anInt5185) {
			arg2 -= Static6.anInt5185 - arg0;
			arg0 = Static6.anInt5185;
		}
		if (arg0 + arg2 > Static6.anInt5186) {
			arg2 = Static6.anInt5186 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * Static6.anInt5188;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (Static6.anIntArray561[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (Static6.anIntArray561[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (Static6.anIntArray561[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			Static6.anIntArray561[local58++] = local113;
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "([I)V")
	public static void method4226(@OriginalArg(0) int[] arg0) {
		Static6.anInt5185 = arg0[0];
		Static6.anInt5183 = arg0[1];
		Static6.anInt5186 = arg0[2];
		Static6.anInt5187 = arg0[3];
		method4228();
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "()V")
	public static void method4227() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = Static6.anInt5188 * Static6.anInt5184 - 7;
		while (local1 < local7) {
			@Pc(13) int local13 = local1 + 1;
			Static6.anIntArray561[local1] = 0;
			Static6.anIntArray561[local13++] = 0;
			Static6.anIntArray561[local13++] = 0;
			Static6.anIntArray561[local13++] = 0;
			Static6.anIntArray561[local13++] = 0;
			Static6.anIntArray561[local13++] = 0;
			Static6.anIntArray561[local13++] = 0;
			local1 = local13 + 1;
			Static6.anIntArray561[local13] = 0;
		}
		@Pc(52) int local52 = local7 + 7;
		while (local1 < local52) {
			Static6.anIntArray561[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "()V")
	public static void method4228() {
		Static6.anIntArray559 = null;
		Static6.anIntArray560 = null;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "()V")
	public static void method4229() {
		Static6.anInt5185 = 0;
		Static6.anInt5183 = 0;
		Static6.anInt5186 = Static6.anInt5188;
		Static6.anInt5187 = Static6.anInt5184;
		method4228();
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(IIIIII)V")
	public static void method4230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 - arg0;
		@Pc(7) int local7 = arg3 - arg1;
		if (local7 == 0) {
			if (local3 >= 0) {
				method4225(arg0, arg1, local3, arg4, arg5);
			} else {
				method4225(arg0 + local3 + 1, arg1, -local3, arg4, arg5);
			}
		} else if (local3 != 0) {
			@Pc(55) boolean local55 = false;
			if (local3 + local7 < 0) {
				arg0 += local3;
				local3 = -local3;
				arg1 += local7;
				local7 = -local7;
				local55 = true;
			}
			@Pc(79) int local79 = 256 - arg5;
			@Pc(87) int local87 = (arg4 >> 16 & 0xFF) * arg5;
			@Pc(95) int local95 = (arg4 >> 8 & 0xFF) * arg5;
			@Pc(101) int local101 = (arg4 & 0xFF) * arg5;
			if (local3 > local7) {
				@Pc(108) int local108 = arg1 << 16;
				@Pc(112) int local112 = local108 + 32768;
				arg3 = local7 << 16;
				@Pc(126) int local126 = (int) Math.floor((double) arg3 / (double) local3 + 0.5D);
				@Pc(130) int local130 = local3 + arg0;
				if (local55) {
					local112 += local126;
					arg0++;
				}
				if (arg0 < Static6.anInt5185) {
					local112 += local126 * (Static6.anInt5185 - arg0);
					arg0 = Static6.anInt5185;
				}
				if (local130 >= Static6.anInt5186) {
					local130 = Static6.anInt5186 - 1;
				}
				if (!local55) {
					local130--;
				}
				while (arg0 <= local130) {
					@Pc(167) int local167 = local112 >> 16;
					if (local167 >= Static6.anInt5183 && local167 < Static6.anInt5187) {
						@Pc(179) int local179 = arg0 + local167 * Static6.anInt5188;
						@Pc(189) int local189 = (Static6.anIntArray561[local179] >> 16 & 0xFF) * local79;
						@Pc(199) int local199 = (Static6.anIntArray561[local179] >> 8 & 0xFF) * local79;
						@Pc(207) int local207 = (Static6.anIntArray561[local179] & 0xFF) * local79;
						@Pc(229) int local229 = (local87 + local189 >> 8 << 16) + (local95 + local199 >> 8 << 8) + (local101 + local207 >> 8);
						Static6.anIntArray561[local179] = local229;
					}
					local112 += local126;
					arg0++;
				}
			} else {
				@Pc(244) int local244 = arg0 << 16;
				@Pc(248) int local248 = local244 + 32768;
				arg2 = local3 << 16;
				@Pc(262) int local262 = (int) Math.floor((double) arg2 / (double) local7 + 0.5D);
				@Pc(266) int local266 = local7 + arg1;
				if (local55) {
					local248 += local262;
					arg1++;
				}
				if (arg1 < Static6.anInt5183) {
					local248 += local262 * (Static6.anInt5183 - arg1);
					arg1 = Static6.anInt5183;
				}
				if (local266 >= Static6.anInt5187) {
					local266 = Static6.anInt5187 - 1;
				}
				if (!local55) {
					local266--;
				}
				while (arg1 <= local266) {
					@Pc(303) int local303 = local248 >> 16;
					if (local303 >= Static6.anInt5185 && local303 < Static6.anInt5186) {
						@Pc(315) int local315 = local303 + arg1 * Static6.anInt5188;
						@Pc(325) int local325 = (Static6.anIntArray561[local315] >> 16 & 0xFF) * local79;
						@Pc(335) int local335 = (Static6.anIntArray561[local315] >> 8 & 0xFF) * local79;
						@Pc(343) int local343 = (Static6.anIntArray561[local315] & 0xFF) * local79;
						@Pc(365) int local365 = (local87 + local325 >> 8 << 16) + (local95 + local335 >> 8 << 8) + (local101 + local343 >> 8);
						Static6.anIntArray561[local315] = local365;
					}
					local248 += local262;
					arg1++;
				}
			}
		} else if (local7 >= 0) {
			method4216(arg0, arg1, local7, arg4, arg5);
		} else {
			method4216(arg0, arg1 + local7 + 1, -local7, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIIII[I[I)V")
	private static void method4231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		if (Static6.anInt5187 - Static6.anInt5183 != arg5.length) {
			throw new IllegalStateException();
		} else if (arg1 >= Static6.anInt5183 && arg1 < Static6.anInt5187) {
			@Pc(24) int local24 = Static6.anInt5185 + arg5[arg1 - Static6.anInt5183];
			if (arg0 < local24) {
				arg2 -= local24 - arg0;
				arg0 = local24;
			}
			@Pc(49) int local49 = Static6.anInt5185 + arg5[arg1 - Static6.anInt5183] + arg6[arg1 - Static6.anInt5183];
			if (arg0 + arg2 > local49) {
				arg2 = local49 - arg0;
			}
			@Pc(62) int local62 = 256 - arg4;
			@Pc(70) int local70 = (arg3 >> 16 & 0xFF) * arg4;
			@Pc(78) int local78 = (arg3 >> 8 & 0xFF) * arg4;
			@Pc(84) int local84 = (arg3 & 0xFF) * arg4;
			@Pc(90) int local90 = arg0 + arg1 * Static6.anInt5188;
			for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
				@Pc(105) int local105 = (Static6.anIntArray561[local90] >> 16 & 0xFF) * local62;
				@Pc(115) int local115 = (Static6.anIntArray561[local90] >> 8 & 0xFF) * local62;
				@Pc(123) int local123 = (Static6.anIntArray561[local90] & 0xFF) * local62;
				@Pc(145) int local145 = (local70 + local105 >> 8 << 16) + (local78 + local115 >> 8 << 8) + (local84 + local123 >> 8);
				Static6.anIntArray561[local90++] = local145;
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!fh;ZLclient!fh;)V")
	public static void method4232(@OriginalArg(1) Class58 arg0, @OriginalArg(3) Class58 arg1) {
		Static2.aBoolean152 = true;
		Static7.aClass58_97 = arg1;
		Static2.aClass58_38 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!qc;Z)V")
	public static void method4234(@OriginalArg(0) Class53_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt4034 - Static2.anInt954;
		@Pc(25) int local25 = arg0.anInt3973 * 128 + arg0.method3311() * 64;
		@Pc(37) int local37 = arg0.anInt4033 * 128 + arg0.method3311() * 64;
		if (arg0.anInt4008 == 0) {
			arg0.anInt4017 = 1024;
		}
		arg0.anInt4002 += (local37 - arg0.anInt4002) / local13;
		arg0.anInt3974 += (local25 - arg0.anInt3974) / local13;
		if (arg0.anInt4008 == 1) {
			arg0.anInt4017 = 1536;
		}
		arg0.anInt4037 = 0;
		if (arg0.anInt4008 == 2) {
			arg0.anInt4017 = 0;
		}
		if (arg0.anInt4008 == 3) {
			arg0.anInt4017 = 512;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public static void method4235() {
		Static2.aClass26_16.method517(5);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4236(@OriginalArg(1) String arg0) {
		if (Static6.aClass4_Sub15Array1 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(20) long local20 = Static18.method1746(arg0);
		if (local20 == 0L) {
			return;
		}
		while (Static6.aClass4_Sub15Array1.length > local16 && local20 != Static6.aClass4_Sub15Array1[local16].key) {
			local16++;
		}
		if (Static6.aClass4_Sub15Array1.length > local16 && Static6.aClass4_Sub15Array1[local16] != null) {
			Static3.aClass4_Sub10_Sub1_1.method4650(75);
			Static3.aClass4_Sub10_Sub1_1.method4582(Static6.aClass4_Sub15Array1[local16].key);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!qc;)V")
	public static void method4247(@OriginalArg(1) Class53_Sub1 arg0) {
		if (arg0.anInt4009 == 0) {
			return;
		}
		@Pc(16) Class34 local16 = arg0.method3314();
		if (arg0.anInt3985 != -1 && arg0.anInt3985 < 32768) {
			@Pc(31) Class53_Sub1_Sub2 local31 = Static3.aClass53_Sub1_Sub2Array1[arg0.anInt3985];
			if (local31 != null) {
				@Pc(42) int local42 = arg0.anInt3974 - local31.anInt3974;
				@Pc(49) int local49 = arg0.anInt4002 - local31.anInt4002;
				if (local42 != 0 || local49 != 0) {
					arg0.anInt4017 = (int) (Math.atan2((double) local42, (double) local49) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.anInt3985 >= 32768) {
			@Pc(87) int local87 = arg0.anInt3985 - 32768;
			if (local87 == Static7.anInt2022) {
				local87 = 2047;
			}
			@Pc(101) Class53_Sub1_Sub1 local101 = Static5.aClass53_Sub1_Sub1Array1[local87];
			if (local101 != null) {
				@Pc(112) int local112 = arg0.anInt3974 - local101.anInt3974;
				@Pc(119) int local119 = arg0.anInt4002 - local101.anInt4002;
				if (local112 != 0 || local119 != 0) {
					arg0.anInt4017 = (int) (Math.atan2((double) local112, (double) local119) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt4014 != 0 || arg0.anInt4003 != 0) && (arg0.anInt3965 == 0 || arg0.anInt4037 > 0)) {
			@Pc(172) int local172 = arg0.anInt4002 - (arg0.anInt4003 - Static7.anInt5479 - Static7.anInt5479) * 64;
			@Pc(185) int local185 = arg0.anInt3974 - (arg0.anInt4014 - Static5.anInt3983 - Static5.anInt3983) * 64;
			if (local185 != 0 || local172 != 0) {
				arg0.anInt4017 = (int) (Math.atan2((double) local185, (double) local172) * 325.949D) & 0x7FF;
			}
			arg0.anInt4014 = 0;
			arg0.anInt4003 = 0;
		}
		@Pc(222) int local222 = arg0.anInt4017 - arg0.anInt4031 & 0x7FF;
		if (local222 == 0) {
			arg0.anInt4020 = 0;
			arg0.anInt4015 = 0;
		} else if (local16.anInt830 == 0) {
			arg0.anInt4015++;
			if (local222 <= 1024) {
				arg0.anInt4031 += arg0.anInt4009;
				@Pc(874) boolean local874 = true;
				if (arg0.anInt4009 > local222 || local222 > 2048 - arg0.anInt4009) {
					local874 = false;
					arg0.anInt4031 = arg0.anInt4017;
				}
				if (arg0.anInt4015 > 25 || local874) {
					arg0.anInt4005 = local16.anInt846;
					if (arg0.anInt3965 > 0) {
						if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
							if (local16.anInt853 != -1) {
								arg0.anInt4005 = local16.anInt853;
							} else if (local16.anInt831 != -1) {
								arg0.anInt4005 = local16.anInt831;
							}
						} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
							if (local16.anInt839 != -1) {
								arg0.anInt4005 = local16.anInt839;
							} else if (local16.anInt854 != -1) {
								arg0.anInt4005 = local16.anInt854;
							}
						} else if (local16.anInt865 != -1) {
							arg0.anInt4005 = local16.anInt865;
						}
					} else if (local16.anInt832 != -1) {
						arg0.anInt4005 = local16.anInt832;
					}
				}
			} else {
				arg0.anInt4031 -= arg0.anInt4009;
				@Pc(1005) boolean local1005 = true;
				if (local222 < arg0.anInt4009 || 2048 - arg0.anInt4009 < local222) {
					local1005 = false;
					arg0.anInt4031 = arg0.anInt4017;
				}
				if (arg0.anInt4015 > 25 || local1005) {
					arg0.anInt4005 = local16.anInt846;
					if (arg0.anInt3965 <= 0) {
						if (local16.anInt834 != -1) {
							arg0.anInt4005 = local16.anInt834;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
						if (local16.anInt835 != -1) {
							arg0.anInt4005 = local16.anInt835;
						} else if (local16.anInt831 != -1) {
							arg0.anInt4005 = local16.anInt831;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
						if (local16.anInt843 != -1) {
							arg0.anInt4005 = local16.anInt843;
						} else if (local16.anInt854 != -1) {
							arg0.anInt4005 = local16.anInt854;
						}
					} else if (local16.anInt842 != -1) {
						arg0.anInt4005 = local16.anInt842;
					}
				}
			}
			arg0.anInt4031 &= 2047;
		} else {
			arg0.anInt4005 = -1;
			@Pc(241) int local241 = arg0.anInt4017 << 5;
			if (arg0.anInt3987 != local241) {
				arg0.anInt4029 = 0;
				arg0.anInt3987 = local241;
				@Pc(263) int local263 = local241 - arg0.anInt3992 & 0xFFFF;
				@Pc(274) int local274 = arg0.anInt4020 * arg0.anInt4020 / (local16.anInt830 * 2);
				if (arg0.anInt4020 > 0 && local274 <= local263 && local263 - local274 < 32768) {
					arg0.aBoolean283 = true;
					arg0.anInt3994 = local263 / 2;
					@Pc(379) int local379 = local16.anInt862 * local16.anInt862 / (local16.anInt830 * 2);
					if (local379 > 32767) {
						local379 = 32767;
					}
					if (arg0.anInt3994 > local379) {
						arg0.anInt3994 = local263 - local379;
					}
				} else if (arg0.anInt4020 < 0 && local274 <= 65536 - local263 && 65536 - local263 - local274 < 32768) {
					arg0.anInt3994 = (65536 - local263) / 2;
					arg0.aBoolean283 = true;
					@Pc(334) int local334 = local16.anInt862 * local16.anInt862 / (local16.anInt830 * 2);
					if (local334 > 32767) {
						local334 = 32767;
					}
					if (arg0.anInt3994 > local334) {
						arg0.anInt3994 = 65536 - local334 - local263;
					}
				} else {
					arg0.aBoolean283 = false;
				}
			}
			if (arg0.anInt4020 == 0) {
				@Pc(410) int local410 = arg0.anInt3987 - arg0.anInt3992 & 0xFFFF;
				if (local410 < local16.anInt830) {
					arg0.anInt3992 = arg0.anInt3987;
				} else {
					arg0.anInt4029 = 0;
					arg0.aBoolean283 = true;
					@Pc(441) int local441 = local16.anInt862 * local16.anInt862 / (local16.anInt830 * 2);
					if (local441 > 32767) {
						local441 = 32767;
					}
					if (local410 >= 32768) {
						arg0.anInt3994 = (65536 - local410) / 2;
						if (local441 < arg0.anInt3994) {
							arg0.anInt3994 = 65536 - local410 - local441;
						}
						arg0.anInt4020 = -local16.anInt830;
					} else {
						arg0.anInt3994 = local410 / 2;
						arg0.anInt4020 = local16.anInt830;
						if (arg0.anInt3994 > local441) {
							arg0.anInt3994 = local410 - local441;
						}
					}
				}
			} else if (arg0.anInt4020 > 0) {
				if (arg0.anInt4029 >= arg0.anInt3994) {
					arg0.aBoolean283 = false;
				}
				if (!arg0.aBoolean283) {
					arg0.anInt4020 -= local16.anInt830;
					if (arg0.anInt4020 < 0) {
						arg0.anInt4020 = 0;
					}
				} else if (arg0.anInt4020 < local16.anInt862) {
					arg0.anInt4020 += local16.anInt830;
				}
			} else {
				if (arg0.anInt4029 >= arg0.anInt3994) {
					arg0.aBoolean283 = false;
				}
				if (!arg0.aBoolean283) {
					arg0.anInt4020 += local16.anInt830;
					if (arg0.anInt4020 > 0) {
						arg0.anInt4020 = 0;
					}
				} else if (-local16.anInt862 < arg0.anInt4020) {
					arg0.anInt4020 -= local16.anInt830;
				}
			}
			arg0.anInt3992 += arg0.anInt4020;
			arg0.anInt3992 &= 65535;
			arg0.anInt4031 = arg0.anInt3992 >> 5;
			if (arg0.anInt4020 <= 0) {
				arg0.anInt4029 -= arg0.anInt4020;
			} else {
				arg0.anInt4029 += arg0.anInt4020;
			}
			if (arg0.anInt4020 < 0) {
				if (arg0.anInt3965 > 0) {
					if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
						if (local16.anInt835 != -1) {
							arg0.anInt4005 = local16.anInt835;
						} else if (local16.anInt831 != -1) {
							arg0.anInt4005 = local16.anInt831;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
						if (local16.anInt843 != -1) {
							arg0.anInt4005 = local16.anInt843;
						} else if (local16.anInt854 != -1) {
							arg0.anInt4005 = local16.anInt854;
						}
					}
				}
				if (arg0.anInt4005 == -1) {
					if (local16.anInt842 != -1) {
						arg0.anInt4005 = local16.anInt842;
					} else if (local16.anInt834 != -1) {
						arg0.anInt4005 = local16.anInt834;
					}
				}
			} else {
				if (arg0.anInt3965 > 0) {
					if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
						if (local16.anInt853 != -1) {
							arg0.anInt4005 = local16.anInt853;
						} else if (local16.anInt831 != -1) {
							arg0.anInt4005 = local16.anInt831;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
						if (local16.anInt839 != -1) {
							arg0.anInt4005 = local16.anInt839;
						} else if (local16.anInt854 != -1) {
							arg0.anInt4005 = local16.anInt854;
						}
					}
				}
				if (arg0.anInt4005 == -1) {
					if (local16.anInt865 != -1) {
						arg0.anInt4005 = local16.anInt865;
					} else if (local16.anInt832 != -1) {
						arg0.anInt4005 = local16.anInt832;
					}
				}
			}
			if (arg0.anInt4005 == -1) {
				arg0.anInt4005 = local16.anInt846;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z[Lclient!ch;IIIII[B)[I")
	public static int[] method4248(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class30[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(9) byte local9;
		if (arg0) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		if (!arg0) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				for (@Pc(25) int local25 = 0; local25 < 64; local25++) {
					for (@Pc(32) int local32 = 0; local32 < 64; local32++) {
						if (arg4 + local25 > 0 && local25 + arg4 < 103 && arg3 + local32 > 0 && local32 + arg3 < 103) {
							arg1[local18].anIntArrayArray6[local25 + arg4][arg3 + local32] &= -2097153;
						}
					}
				}
			}
		}
		@Pc(103) int local103 = arg5 + arg4;
		@Pc(108) Class4_Sub10 local108 = new Class4_Sub10(arg6);
		@Pc(112) int local112 = arg2 + arg3;
		for (@Pc(114) int local114 = 0; local114 < local9; local114++) {
			for (@Pc(129) int local129 = 0; local129 < 64; local129++) {
				for (@Pc(134) int local134 = 0; local134 < 64; local134++) {
					Static9.method195(local108, false, arg0, local114, local103 + local129, local134 + local112, local134 + arg3, 0, 0, 0, arg4 + local129);
				}
			}
		}
		@Pc(171) boolean local171 = false;
		@Pc(173) boolean local173 = false;
		while (local108.aByteArray71.length > local108.anInt5709) {
			@Pc(183) int local183 = local108.method4629();
			if (local183 == 128) {
				local171 = true;
				Static6.anIntArray465[0] = local108.method4616();
				Static6.anIntArray465[1] = local108.method4576();
				Static6.anIntArray465[2] = local108.method4576();
				Static6.anIntArray465[3] = local108.method4576();
				Static6.anIntArray465[4] = local108.method4616();
			} else {
				if (local183 != 129) {
					local108.anInt5709--;
					break;
				}
				for (@Pc(201) int local201 = 0; local201 < 4; local201++) {
					@Pc(210) byte local210 = local108.method4637();
					if (local210 == 0) {
						@Pc(216) int local216 = arg4 + 64;
						if (local216 < 0) {
							local216 = 0;
						} else if (local216 >= 104) {
							local216 = 104;
						}
						@Pc(231) int local231 = arg4;
						@Pc(233) int local233 = arg3;
						if (arg3 < 0) {
							local233 = 0;
						} else if (arg3 >= 104) {
							local233 = 104;
						}
						@Pc(252) int local252 = arg3 + 64;
						if (arg4 < 0) {
							local231 = 0;
						} else if (arg4 >= 104) {
							local231 = 104;
						}
						if (local252 < 0) {
							local252 = 0;
						} else if (local252 >= 104) {
							local252 = 104;
						}
						while (local216 > local231) {
							while (local233 < local252) {
								Static4.aByteArrayArrayArray16[local201][local231][local233] = 0;
								local233++;
							}
							local231++;
						}
					} else if (local210 == 1) {
						for (@Pc(307) int local307 = 0; local307 < 64; local307 += 4) {
							for (@Pc(312) int local312 = 0; local312 < 64; local312 += 4) {
								@Pc(321) byte local321 = local108.method4637();
								for (@Pc(325) int local325 = local307 + arg4; local325 < local307 + arg4 + 4; local325++) {
									for (@Pc(337) int local337 = arg3 + local312; local337 < local312 + arg3 + 4; local337++) {
										if (local325 >= 0 && local325 < 104 && local337 >= 0 && local337 < 104) {
											Static4.aByteArrayArrayArray16[local201][local325][local337] = local321;
										}
									}
								}
							}
						}
					} else if (local210 == 2 && local201 > 0) {
						@Pc(393) int local393 = arg4 + 64;
						if (local393 < 0) {
							local393 = 0;
						} else if (local393 >= 104) {
							local393 = 104;
						}
						@Pc(409) int local409 = arg3;
						if (arg3 < 0) {
							local409 = 0;
						} else if (arg3 >= 104) {
							local409 = 104;
						}
						@Pc(426) int local426 = arg4;
						@Pc(430) int local430 = arg3 + 64;
						if (arg4 < 0) {
							local426 = 0;
						} else if (arg4 >= 104) {
							local426 = 104;
						}
						if (local430 < 0) {
							local430 = 0;
						} else if (local430 >= 104) {
							local430 = 104;
						}
						while (local393 > local426) {
							while (local430 > local409) {
								Static4.aByteArrayArrayArray16[local201][local426][local409] = Static4.aByteArrayArrayArray16[local201 - 1][local426][local409];
								local409++;
							}
							local426++;
						}
					}
				}
				local173 = true;
			}
		}
		if (Static3.aBoolean138 && !arg0) {
			@Pc(539) Class187 local539 = null;
			while (true) {
				while (local108.anInt5709 < local108.aByteArray71.length) {
					@Pc(549) int local549 = local108.method4629();
					if (local549 == 0) {
						local539 = new Class187(local108);
					} else if (local549 == 1) {
						@Pc(585) int local585 = local108.method4629();
						if (local585 > 0) {
							for (@Pc(590) int local590 = 0; local590 < local585; local590++) {
								@Pc(598) Class50 local598 = new Class50(local108);
								if (local598.anInt1323 == 31) {
									@Pc(608) Class178 local608 = Static11.method494(local108.method4616());
									local598.method1073(local608.anInt5484, local608.anInt5480, local608.anInt5482, local608.anInt5481);
								}
								local598.anInt1338 += arg4 << 7;
								local598.anInt1320 += arg3 << 7;
								@Pc(640) int local640 = local598.anInt1338 >> 7;
								@Pc(645) int local645 = local598.anInt1320 >> 7;
								if (local640 >= 0 && local645 >= 0 && local640 < 104 && local645 < 104) {
									local598.aBoolean80 = (Static4.aByteArrayArrayArray17[1][local640][local645] & 0x2) != 0;
									local598.anInt1322 = Static6.anIntArrayArrayArray13[local598.anInt1326][local640][local645] - local598.anInt1322;
									Static27.method3113(local598);
								}
							}
						}
					} else if (local549 == 2) {
						if (local539 == null) {
							local539 = new Class187();
						}
						local539.method4786(local108);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local539 == null) {
					local539 = new Class187();
				}
				for (@Pc(704) int local704 = 0; local704 < 8; local704++) {
					for (@Pc(709) int local709 = 0; local709 < 8; local709++) {
						@Pc(719) int local719 = (arg4 >> 3) + local704;
						@Pc(725) int local725 = (arg3 >> 3) + local709;
						if (local719 >= 0 && local719 < 13 && local725 >= 0 && local725 < 13) {
							Static5.aClass187ArrayArray1[local719][local725] = local539;
						}
					}
				}
				break;
			}
		}
		if (!local173) {
			for (@Pc(760) int local760 = 0; local760 < 4; local760++) {
				for (@Pc(767) int local767 = 0; local767 < 16; local767++) {
					for (@Pc(772) int local772 = 0; local772 < 16; local772++) {
						@Pc(784) int local784 = (arg3 >> 2) + local772;
						@Pc(790) int local790 = (arg4 >> 2) + local767;
						if (local790 >= 0 && local790 < 26 && local784 >= 0 && local784 < 26) {
							Static4.aByteArrayArrayArray16[local760][local790][local784] = 0;
						}
					}
				}
			}
		}
		return local171 ? Static6.anIntArray465 : null;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBIIIII)V")
	public static void method4250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg3 < 0 || arg1 >= 103 || arg3 >= 103) {
			return;
		}
		if (arg4 == 0) {
			@Pc(22) Class179 local22 = Static24.method2611(arg2, arg1, arg3);
			if (local22 != null) {
				@Pc(32) int local32 = (int) (local22.aLong188 >>> 32) & Integer.MAX_VALUE;
				if (arg6 == 2) {
					local22.aClass53_5 = new Class53_Sub7(local32, 2, arg5 + 4, arg2, arg1, arg3, arg0, false, local22.aClass53_5);
					local22.aClass53_4 = new Class53_Sub7(local32, 2, arg5 + 1 & 0x3, arg2, arg1, arg3, arg0, false, local22.aClass53_4);
				} else {
					local22.aClass53_5 = new Class53_Sub7(local32, arg6, arg5, arg2, arg1, arg3, arg0, false, local22.aClass53_5);
				}
			}
		}
		if (arg4 == 1) {
			@Pc(98) Class182 local98 = Static33.method4126(arg2, arg1, arg3);
			if (local98 != null) {
				@Pc(109) int local109 = Integer.MAX_VALUE & (int) (local98.aLong194 >>> 32);
				if (arg6 == 4 || arg6 == 5) {
					local98.aClass53_10 = new Class53_Sub7(local109, 4, arg5, arg2, arg1, arg3, arg0, false, local98.aClass53_10);
				} else if (arg6 == 6) {
					local98.aClass53_10 = new Class53_Sub7(local109, 4, arg5 + 4, arg2, arg1, arg3, arg0, false, local98.aClass53_10);
				} else if (arg6 == 7) {
					local98.aClass53_10 = new Class53_Sub7(local109, 4, (arg5 + 2 & 0x3) + 4, arg2, arg1, arg3, arg0, false, local98.aClass53_10);
				} else if (arg6 == 8) {
					local98.aClass53_10 = new Class53_Sub7(local109, 4, arg5 + 4, arg2, arg1, arg3, arg0, false, local98.aClass53_10);
					local98.aClass53_9 = new Class53_Sub7(local109, 4, (arg5 + 2 & 0x3) + 4, arg2, arg1, arg3, arg0, false, local98.aClass53_9);
				}
			}
		}
		if (arg4 == 2) {
			if (arg6 == 11) {
				arg6 = 10;
			}
			@Pc(246) Class33 local246 = Static26.method3062(arg2, arg1, arg3);
			if (local246 != null) {
				local246.aClass53_1 = new Class53_Sub7((int) (local246.aLong38 >>> 32) & Integer.MAX_VALUE, arg6, arg5, arg2, arg1, arg3, arg0, false, local246.aClass53_1);
			}
		}
		if (arg4 == 3) {
			@Pc(280) Class42 local280 = Static11.method527(arg2, arg1, arg3);
			if (local280 != null) {
				local280.aClass53_2 = new Class53_Sub7(Integer.MAX_VALUE & (int) (local280.aLong45 >>> 32), 22, arg5, arg2, arg1, arg3, arg0, false, local280.aClass53_2);
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZLclient!wf;)V")
	public static void method4251(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class185 arg1) {
		@Pc(8) int local8 = arg1.anInt5885 == 0 ? arg1.anInt5893 : arg1.anInt5885;
		@Pc(20) int local20 = arg1.anInt5887 == 0 ? arg1.anInt5949 : arg1.anInt5887;
		Static31.method3660(Static5.aClass185ArrayArray115[arg1.anInt5914 >> 16], arg0, local8, arg1.anInt5914, local20);
		if (arg1.aClass185Array4 != null) {
			Static31.method3660(arg1.aClass185Array4, arg0, local8, arg1.anInt5914, local20);
		}
		@Pc(61) Class4_Sub27 local61 = (Class4_Sub27) Static4.aClass84_13.method1844((long) arg1.anInt5914);
		if (local61 != null) {
			Static21.method2050(arg0, local8, local61.anInt4620, local20);
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)Lclient!gh;")
	public static Class67 method1541() {
		try {
			return (Class67) Class.forName("Class67_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1 method1546() {
		@Pc(14) byte[] local14 = Static6.aByteArrayArray36[0];
		@Pc(22) int local22 = Static7.anIntArray643[0] * Static3.anIntArray185[0];
		@Pc(66) Class4_Sub3_Sub14_Sub1 local66;
		if (Static5.aBooleanArray22[0]) {
			@Pc(71) int[] local71 = new int[local22];
			@Pc(75) byte[] local75 = Static4.aByteArrayArray54[0];
			for (@Pc(77) int local77 = 0; local77 < local22; local77++) {
				local71[local77] = (local75[local77] & 0xFF) << 24 | Static2.anIntArray85[local14[local77] & 0xFF];
			}
			local66 = new Class4_Sub3_Sub14_Sub1_Sub1(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[0], Static5.anIntArray391[0], Static3.anIntArray185[0], Static7.anIntArray643[0], local71);
		} else {
			@Pc(29) int[] local29 = new int[local22];
			for (@Pc(31) int local31 = 0; local31 < local22; local31++) {
				local29[local31] = Static2.anIntArray85[local14[local31] & 0xFF];
			}
			local66 = new Class4_Sub3_Sub14_Sub1(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[0], Static5.anIntArray391[0], Static3.anIntArray185[0], Static7.anIntArray643[0], local29);
		}
		Static37.method4670();
		return local66;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)Z")
	public static boolean method1547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(15) Class181 local15 = Static8.method99(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local15.method4457(arg1);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!fh;II)[Lclient!uj;")
	public static Class4_Sub3_Sub14[] method1548(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1) {
		return Static9.method197(arg1, arg0, 0) ? Static21.method2000() : null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I")
	public static int method4257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg0 >>= 1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method4264(@OriginalArg(0) Class58 arg0) {
		Static2.aClass58_40 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BJ)V")
	public static void method4267(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method4269() {
		Static5.anInt4195 = 0;
		Static6.anInt4760 = 0;
		Static22.method2189();
		Static36.method4406();
		Static35.method4318();
		Static35.method4308();
		for (@Pc(19) int local19 = 0; local19 < Static5.anInt4195; local19++) {
			@Pc(34) int local34 = Static2.anIntArray99[local19];
			if (Static2.anInt954 != Static5.aClass53_Sub1_Sub1Array1[local34].anInt3990) {
				if (Static5.aClass53_Sub1_Sub1Array1[local34].anInt1582 > 0) {
					Static12.method739(Static5.aClass53_Sub1_Sub1Array1[local34]);
				}
				Static5.aClass53_Sub1_Sub1Array1[local34] = null;
			}
		}
		if (Static5.aClass4_Sub10_Sub1_2.anInt5709 != Static1.anInt1052) {
			throw new RuntimeException("gpp1 pos:" + Static5.aClass4_Sub10_Sub1_2.anInt5709 + " psize:" + Static1.anInt1052);
		}
		for (@Pc(85) int local85 = 0; local85 < Static3.anInt2510; local85++) {
			if (Static5.aClass53_Sub1_Sub1Array1[Static4.anIntArray317[local85]] == null) {
				throw new RuntimeException("gpp2 pos:" + local85 + " size:" + Static3.anInt2510);
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void method4270() {
		Static5.aClass26_42.method511();
		Static6.aClass26_46.method511();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[BZI)Ljava/lang/String;")
	public static String method4271(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg2; local16++) {
			@Pc(32) int local32 = arg1[arg0 + local16] & 0xFF;
			if (local32 != 0) {
				if (local32 >= 128 && local32 < 160) {
					@Pc(49) char local49 = Static6.aCharArray3[local32 - 128];
					if (local49 == '\u0000') {
						local49 = '?';
					}
					local32 = local49;
				}
				local8[local14++] = (char) local32;
			}
		}
		return new String(local8, 0, local14);
	}
}

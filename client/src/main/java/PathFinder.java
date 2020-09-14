import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class PathFinder {
	@OriginalMember(owner = "client!ve", name = "o", descriptor = "[Lclient!ch;")
	public static final CollisionMap[] collisionMaps = new CollisionMap[4];

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "[I")
	public static final int[] anIntArray653 = new int[4096];

	@OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
	public static final int[] anIntArray479 = new int[4096];

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "[[I")
	public static int[][] costs;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[[I")
	public static int[][] parents;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIIIIZ)V")
	public static void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (@Pc(12) int local12 = 0; local12 < 104; local12++) {
				parents[local7][local12] = 0;
				costs[local7][local12] = 99999999;
			}
		}
		parents[arg2][arg4] = 99;
		costs[arg2][arg4] = 0;
		@Pc(51) int local51 = arg2;
		@Pc(53) int local53 = arg4;
		@Pc(55) byte local55 = 0;
		anIntArray479[0] = arg2;
		@Pc(62) int local62 = local55 + 1;
		anIntArray653[0] = arg4;
		@Pc(66) int local66 = 0;
		@Pc(68) boolean local68 = false;
		@Pc(73) int[][] local73 = collisionMaps[Static7.y].flags;
		label322:
		while (local66 != local62) {
			local53 = anIntArray653[local66];
			local51 = anIntArray479[local66];
			local66 = local66 + 1 & 0xFFF;
			if (local51 == arg1 && local53 == arg6) {
				local68 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && collisionMaps[Static7.y].method574(arg6, arg9, local53, local51, arg1, arg8, arg0 - 1)) {
					local68 = true;
					break;
				}
				if (arg0 < 10 && collisionMaps[Static7.y].method577(arg1, local51, arg6, local53, arg0 - 1, arg9, arg8)) {
					local68 = true;
					break;
				}
			}
			if (arg3 != 0 && arg5 != 0 && collisionMaps[Static7.y].method570(local53, arg7, arg8, arg6, arg1, arg5, arg3, local51)) {
				local68 = true;
				break;
			}
			@Pc(200) int local200 = costs[local51][local53] + 1;
			if (local51 > 0 && parents[local51 - 1][local53] == 0 && (local73[local51 - 1][local53] & 0x2C010E) == 0 && (local73[local51 - 1][arg8 + local53 - 1] & 0x2C0138) == 0) {
				@Pc(244) int local244 = 1;
				while (true) {
					if (arg8 - 1 <= local244) {
						anIntArray479[local62] = local51 - 1;
						anIntArray653[local62] = local53;
						parents[local51 - 1][local53] = 2;
						costs[local51 - 1][local53] = local200;
						local62 = local62 + 1 & 0xFFF;
						break;
					}
					if ((local73[local51 - 1][local244 + local53] & 0x2C013E) != 0) {
						break;
					}
					local244++;
				}
			}
			if (local51 < 102 && parents[local51 + 1][local53] == 0 && (local73[local51 + arg8][local53] & 0x2C0183) == 0 && (local73[local51 + arg8][local53 + arg8 - 1] & 0x2C01E0) == 0) {
				@Pc(351) int local351 = 1;
				while (true) {
					if (arg8 - 1 <= local351) {
						anIntArray479[local62] = local51 + 1;
						anIntArray653[local62] = local53;
						local62 = local62 + 1 & 0xFFF;
						parents[local51 + 1][local53] = 8;
						costs[local51 + 1][local53] = local200;
						break;
					}
					if ((local73[arg8 + local51][local53 + local351] & 0x2C01E3) != 0) {
						break;
					}
					local351++;
				}
			}
			if (local53 > 0 && parents[local51][local53 - 1] == 0 && (local73[local51][local53 - 1] & 0x2C010E) == 0 && (local73[arg8 + local51 - 1][local53 - 1] & 0x2C0183) == 0) {
				@Pc(456) int local456 = 1;
				while (true) {
					if (local456 >= arg8 - 1) {
						anIntArray479[local62] = local51;
						anIntArray653[local62] = local53 - 1;
						parents[local51][local53 - 1] = 1;
						local62 = local62 + 1 & 0xFFF;
						costs[local51][local53 - 1] = local200;
						break;
					}
					if ((local73[local456 + local51][local53 - 1] & 0x2C018F) != 0) {
						break;
					}
					local456++;
				}
			}
			if (local53 < 102 && parents[local51][local53 + 1] == 0 && (local73[local51][local53 + arg8] & 0x2C0138) == 0 && (local73[local51 + arg8 - 1][arg8 + local53] & 0x2C01E0) == 0) {
				@Pc(561) int local561 = 1;
				while (true) {
					if (local561 >= arg8 - 1) {
						anIntArray479[local62] = local51;
						anIntArray653[local62] = local53 + 1;
						parents[local51][local53 + 1] = 4;
						costs[local51][local53 + 1] = local200;
						local62 = local62 + 1 & 0xFFF;
						break;
					}
					if ((local73[local51 + local561][arg8 + local53] & 0x2C01F8) != 0) {
						break;
					}
					local561++;
				}
			}
			if (local51 > 0 && local53 > 0 && parents[local51 - 1][local53 - 1] == 0 && (local73[local51 - 1][local53 - 1] & 0x2C010E) == 0) {
				@Pc(655) int local655 = 1;
				while (true) {
					if (arg8 <= local655) {
						anIntArray479[local62] = local51 - 1;
						anIntArray653[local62] = local53 - 1;
						parents[local51 - 1][local53 - 1] = 3;
						local62 = local62 + 1 & 0xFFF;
						costs[local51 - 1][local53 - 1] = local200;
						break;
					}
					if ((local73[local51 - 1][local53 + local655 - 1] & 0x2C013E) != 0 || (local73[local655 + local51 - 1][local53 - 1] & 0x2C018F) != 0) {
						break;
					}
					local655++;
				}
			}
			if (local51 < 102 && local53 > 0 && parents[local51 + 1][local53 - 1] == 0 && (local73[local51 + arg8][local53 - 1] & 0x2C0183) == 0) {
				@Pc(767) int local767 = 1;
				while (true) {
					if (arg8 <= local767) {
						anIntArray479[local62] = local51 + 1;
						anIntArray653[local62] = local53 - 1;
						local62 = local62 + 1 & 0xFFF;
						parents[local51 + 1][local53 - 1] = 9;
						costs[local51 + 1][local53 - 1] = local200;
						break;
					}
					if ((local73[local51 + arg8][local53 + local767 - 1] & 0x2C01E3) != 0 || (local73[local767 + local51][local53 - 1] & 0x2C018F) != 0) {
						break;
					}
					local767++;
				}
			}
			if (local51 > 0 && local53 < 102 && parents[local51 - 1][local53 + 1] == 0 && (local73[local51 - 1][arg8 + local53] & 0x2C0138) == 0) {
				@Pc(877) int local877 = 1;
				while (true) {
					if (arg8 <= local877) {
						anIntArray479[local62] = local51 - 1;
						anIntArray653[local62] = local53 + 1;
						parents[local51 - 1][local53 + 1] = 6;
						local62 = local62 + 1 & 0xFFF;
						costs[local51 - 1][local53 + 1] = local200;
						break;
					}
					if ((local73[local51 - 1][local53 + local877] & 0x2C013E) != 0 || (local73[local51 + local877 - 1][local53 + arg8] & 0x2C01F8) != 0) {
						break;
					}
					local877++;
				}
			}
			if (local51 < 102 && local53 < 102 && parents[local51 + 1][local53 + 1] == 0 && (local73[arg8 + local51][arg8 + local53] & 0x2C01E0) == 0) {
				for (@Pc(990) int local990 = 1; local990 < arg8; local990++) {
					if ((local73[local51 + local990][arg8 + local53] & 0x2C01F8) != 0 || (local73[local51 + arg8][local53 + local990] & 0x2C01E3) != 0) {
						continue label322;
					}
				}
				anIntArray479[local62] = local51 + 1;
				anIntArray653[local62] = local53 + 1;
				parents[local51 + 1][local53 + 1] = 12;
				local62 = local62 + 1 & 0xFFF;
				costs[local51 + 1][local53 + 1] = local200;
			}
		}
		if (!local68) {
			@Pc(1081) int local1081 = 1000;
			@Pc(1083) int local1083 = 100;
			for (@Pc(1090) int local1090 = arg1 - 10; local1090 <= arg1 + 10; local1090++) {
				for (@Pc(1100) int local1100 = arg6 - 10; local1100 <= arg6 + 10; local1100++) {
					if (local1090 >= 0 && local1100 >= 0 && local1090 < 104 && local1100 < 104 && costs[local1090][local1100] < 100) {
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
						if (local1208 < local1081 || local1208 == local1081 && local1083 > costs[local1090][local1100]) {
							local51 = local1090;
							local1081 = local1208;
							local53 = local1100;
							local1083 = costs[local1090][local1100];
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

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIIIIIIIII)V")
	public static void method2197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (@Pc(14) int local14 = 0; local14 < 104; local14++) {
				parents[local7][local14] = 0;
				costs[local7][local14] = 99999999;
			}
		}
		@Pc(37) int local37 = arg6;
		@Pc(39) int local39 = arg0;
		@Pc(41) byte local41 = 0;
		parents[arg6][arg0] = 99;
		@Pc(49) int local49 = 0;
		costs[arg6][arg0] = 0;
		anIntArray479[0] = arg6;
		@Pc(62) int local62 = local41 + 1;
		anIntArray653[0] = arg0;
		@Pc(66) boolean local66 = false;
		@Pc(71) int[][] local71 = collisionMaps[Static7.y].flags;
		while (local62 != local49) {
			local39 = anIntArray653[local49];
			local37 = anIntArray479[local49];
			local49 = local49 + 1 & 0xFFF;
			if (local37 == arg1 && arg4 == local39) {
				local66 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && collisionMaps[Static7.y].method574(arg4, arg3, local39, local37, arg1, 1, arg5 - 1)) {
					local66 = true;
					break;
				}
				if (arg5 < 10 && collisionMaps[Static7.y].method577(arg1, local37, arg4, local39, arg5 - 1, arg3, 1)) {
					local66 = true;
					break;
				}
			}
			if (arg8 != 0 && arg2 != 0 && collisionMaps[Static7.y].method570(local39, arg7, 1, arg4, arg1, arg2, arg8, local37)) {
				local66 = true;
				break;
			}
			@Pc(192) int local192 = costs[local37][local39] + 1;
			if (local37 > 0 && parents[local37 - 1][local39] == 0 && (local71[local37 - 1][local39] & 0x2C0108) == 0) {
				anIntArray479[local62] = local37 - 1;
				anIntArray653[local62] = local39;
				local62 = local62 + 1 & 0xFFF;
				parents[local37 - 1][local39] = 2;
				costs[local37 - 1][local39] = local192;
			}
			if (local37 < 103 && parents[local37 + 1][local39] == 0 && (local71[local37 + 1][local39] & 0x2C0180) == 0) {
				anIntArray479[local62] = local37 + 1;
				anIntArray653[local62] = local39;
				parents[local37 + 1][local39] = 8;
				local62 = local62 + 1 & 0xFFF;
				costs[local37 + 1][local39] = local192;
			}
			if (local39 > 0 && parents[local37][local39 - 1] == 0 && (local71[local37][local39 - 1] & 0x2C0102) == 0) {
				anIntArray479[local62] = local37;
				anIntArray653[local62] = local39 - 1;
				parents[local37][local39 - 1] = 1;
				local62 = local62 + 1 & 0xFFF;
				costs[local37][local39 - 1] = local192;
			}
			if (local39 < 103 && parents[local37][local39 + 1] == 0 && (local71[local37][local39 + 1] & 0x2C0120) == 0) {
				anIntArray479[local62] = local37;
				anIntArray653[local62] = local39 + 1;
				parents[local37][local39 + 1] = 4;
				local62 = local62 + 1 & 0xFFF;
				costs[local37][local39 + 1] = local192;
			}
			if (local37 > 0 && local39 > 0 && parents[local37 - 1][local39 - 1] == 0 && (local71[local37 - 1][local39 - 1] & 0x2C010E) == 0 && (local71[local37 - 1][local39] & 0x2C0108) == 0 && (local71[local37][local39 - 1] & 0x2C0102) == 0) {
				anIntArray479[local62] = local37 - 1;
				anIntArray653[local62] = local39 - 1;
				parents[local37 - 1][local39 - 1] = 3;
				local62 = local62 + 1 & 0xFFF;
				costs[local37 - 1][local39 - 1] = local192;
			}
			if (local37 < 103 && local39 > 0 && parents[local37 + 1][local39 - 1] == 0 && (local71[local37 + 1][local39 - 1] & 0x2C0183) == 0 && (local71[local37 + 1][local39] & 0x2C0180) == 0 && (local71[local37][local39 - 1] & 0x2C0102) == 0) {
				anIntArray479[local62] = local37 + 1;
				anIntArray653[local62] = local39 - 1;
				local62 = local62 + 1 & 0xFFF;
				parents[local37 + 1][local39 - 1] = 9;
				costs[local37 + 1][local39 - 1] = local192;
			}
			if (local37 > 0 && local39 < 103 && parents[local37 - 1][local39 + 1] == 0 && (local71[local37 - 1][local39 + 1] & 0x2C0138) == 0 && (local71[local37 - 1][local39] & 0x2C0108) == 0 && (local71[local37][local39 + 1] & 0x2C0120) == 0) {
				anIntArray479[local62] = local37 - 1;
				anIntArray653[local62] = local39 + 1;
				local62 = local62 + 1 & 0xFFF;
				parents[local37 - 1][local39 + 1] = 6;
				costs[local37 - 1][local39 + 1] = local192;
			}
			if (local37 < 103 && local39 < 103 && parents[local37 + 1][local39 + 1] == 0 && (local71[local37 + 1][local39 + 1] & 0x2C01E0) == 0 && (local71[local37 + 1][local39] & 0x2C0180) == 0 && (local71[local37][local39 + 1] & 0x2C0120) == 0) {
				anIntArray479[local62] = local37 + 1;
				anIntArray653[local62] = local39 + 1;
				local62 = local62 + 1 & 0xFFF;
				parents[local37 + 1][local39 + 1] = 12;
				costs[local37 + 1][local39 + 1] = local192;
			}
		}
		if (!local66) {
			@Pc(805) int local805 = 1000;
			@Pc(809) int local809 = 100;
			for (@Pc(814) int local814 = arg1 - 10; local814 <= arg1 + 10; local814++) {
				for (@Pc(827) int local827 = arg4 - 10; local827 <= arg4 + 10; local827++) {
					if (local814 >= 0 && local827 >= 0 && local814 < 104 && local827 < 104 && costs[local814][local827] < 100) {
						@Pc(858) int local858 = 0;
						if (arg1 > local814) {
							local858 = arg1 - local814;
						} else if (arg8 + arg1 - 1 < local814) {
							local858 = local814 + 1 - arg8 - arg1;
						}
						@Pc(889) int local889 = 0;
						if (arg4 > local827) {
							local889 = arg4 - local827;
						} else if (arg4 + arg2 - 1 < local827) {
							local889 = local827 + 1 - arg4 - arg2;
						}
						@Pc(930) int local930 = local889 * local889 + local858 * local858;
						if (local805 > local930 || local805 == local930 && local809 > costs[local814][local827]) {
							local39 = local827;
							local809 = costs[local814][local827];
							local805 = local930;
							local37 = local814;
						}
					}
				}
			}
			if (local805 == 1000) {
				return;
			}
			if (local37 == arg6 && local39 == arg0) {
				return;
			}
		}
		Static6.anInt4506 = local37;
		Static3.aBoolean147 = false;
		Static3.anInt2140 = local39;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIZIIIII)V")
	public static void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (@Pc(12) int local12 = 0; local12 < 104; local12++) {
				parents[local7][local12] = 0;
				costs[local7][local12] = 99999999;
			}
		}
		@Pc(37) int local37 = arg2;
		parents[arg4][arg2] = 99;
		costs[arg4][arg2] = 0;
		@Pc(51) int local51 = arg4;
		@Pc(53) int local53 = 0;
		@Pc(55) byte local55 = 0;
		@Pc(57) boolean local57 = false;
		anIntArray479[0] = arg4;
		@Pc(64) int local64 = local55 + 1;
		anIntArray653[0] = arg2;
		@Pc(77) int[][] local77 = collisionMaps[Static7.y].flags;
		while (local64 != local53) {
			local51 = anIntArray479[local53];
			local37 = anIntArray653[local53];
			local53 = local53 + 1 & 0xFFF;
			if (arg0 == local51 && local37 == arg5) {
				local57 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && collisionMaps[Static7.y].method574(arg5, arg6, local37, local51, arg0, 2, arg3 - 1)) {
					local57 = true;
					break;
				}
				if (arg3 < 10 && collisionMaps[Static7.y].method577(arg0, local51, arg5, local37, arg3 - 1, arg6, 2)) {
					local57 = true;
					break;
				}
			}
			if (arg1 != 0 && arg8 != 0 && collisionMaps[Static7.y].method570(local37, arg7, 2, arg5, arg0, arg8, arg1, local51)) {
				local57 = true;
				break;
			}
			@Pc(201) int local201 = costs[local51][local37] + 1;
			if (local51 > 0 && parents[local51 - 1][local37] == 0 && (local77[local51 - 1][local37] & 0x2C010E) == 0 && (local77[local51 - 1][local37 + 1] & 0x2C0138) == 0) {
				anIntArray479[local64] = local51 - 1;
				anIntArray653[local64] = local37;
				parents[local51 - 1][local37] = 2;
				costs[local51 - 1][local37] = local201;
				local64 = local64 + 1 & 0xFFF;
			}
			if (local51 < 102 && parents[local51 + 1][local37] == 0 && (local77[local51 + 2][local37] & 0x2C0183) == 0 && (local77[local51 + 2][local37 + 1] & 0x2C01E0) == 0) {
				anIntArray479[local64] = local51 + 1;
				anIntArray653[local64] = local37;
				parents[local51 + 1][local37] = 8;
				local64 = local64 + 1 & 0xFFF;
				costs[local51 + 1][local37] = local201;
			}
			if (local37 > 0 && parents[local51][local37 - 1] == 0 && (local77[local51][local37 - 1] & 0x2C010E) == 0 && (local77[local51 + 1][local37 - 1] & 0x2C0183) == 0) {
				anIntArray479[local64] = local51;
				anIntArray653[local64] = local37 - 1;
				parents[local51][local37 - 1] = 1;
				local64 = local64 + 1 & 0xFFF;
				costs[local51][local37 - 1] = local201;
			}
			if (local37 < 102 && parents[local51][local37 + 1] == 0 && (local77[local51][local37 + 2] & 0x2C0138) == 0 && (local77[local51 + 1][local37 + 2] & 0x2C01E0) == 0) {
				anIntArray479[local64] = local51;
				anIntArray653[local64] = local37 + 1;
				local64 = local64 + 1 & 0xFFF;
				parents[local51][local37 + 1] = 4;
				costs[local51][local37 + 1] = local201;
			}
			if (local51 > 0 && local37 > 0 && parents[local51 - 1][local37 - 1] == 0 && (local77[local51 - 1][local37] & 0x2C013E) == 0 && (local77[local51 - 1][local37 - 1] & 0x2C010E) == 0 && (local77[local51][local37 - 1] & 0x2C018F) == 0) {
				anIntArray479[local64] = local51 - 1;
				anIntArray653[local64] = local37 - 1;
				local64 = local64 + 1 & 0xFFF;
				parents[local51 - 1][local37 - 1] = 3;
				costs[local51 - 1][local37 - 1] = local201;
			}
			if (local51 < 102 && local37 > 0 && parents[local51 + 1][local37 - 1] == 0 && (local77[local51 + 1][local37 - 1] & 0x2C018F) == 0 && (local77[local51 + 2][local37 - 1] & 0x2C0183) == 0 && (local77[local51 + 2][local37] & 0x2C01E3) == 0) {
				anIntArray479[local64] = local51 + 1;
				anIntArray653[local64] = local37 - 1;
				local64 = local64 + 1 & 0xFFF;
				parents[local51 + 1][local37 - 1] = 9;
				costs[local51 + 1][local37 - 1] = local201;
			}
			if (local51 > 0 && local37 < 102 && parents[local51 - 1][local37 + 1] == 0 && (local77[local51 - 1][local37 + 1] & 0x2C013E) == 0 && (local77[local51 - 1][local37 + 2] & 0x2C0138) == 0 && (local77[local51][local37 + 2] & 0x2C01F8) == 0) {
				anIntArray479[local64] = local51 - 1;
				anIntArray653[local64] = local37 + 1;
				local64 = local64 + 1 & 0xFFF;
				parents[local51 - 1][local37 + 1] = 6;
				costs[local51 - 1][local37 + 1] = local201;
			}
			if (local51 < 102 && local37 < 102 && parents[local51 + 1][local37 + 1] == 0 && (local77[local51 + 1][local37 + 2] & 0x2C01F8) == 0 && (local77[local51 + 2][local37 + 2] & 0x2C01E0) == 0 && (local77[local51 + 2][local37 + 1] & 0x2C01E3) == 0) {
				anIntArray479[local64] = local51 + 1;
				anIntArray653[local64] = local37 + 1;
				local64 = local64 + 1 & 0xFFF;
				parents[local51 + 1][local37 + 1] = 12;
				costs[local51 + 1][local37 + 1] = local201;
			}
		}
		if (!local57) {
			@Pc(920) int local920 = 1000;
			@Pc(922) int local922 = 100;
			for (@Pc(928) int local928 = arg0 - 10; local928 <= arg0 + 10; local928++) {
				for (@Pc(938) int local938 = arg5 - 10; local938 <= arg5 + 10; local938++) {
					if (local928 >= 0 && local938 >= 0 && local928 < 104 && local938 < 104 && costs[local928][local938] < 100) {
						@Pc(970) int local970 = 0;
						@Pc(972) int local972 = 0;
						if (arg0 > local928) {
							local970 = arg0 - local928;
						} else if (arg1 + arg0 - 1 < local928) {
							local970 = local928 + 1 - arg1 - arg0;
						}
						if (local938 < arg5) {
							local972 = arg5 - local938;
						} else if (local938 > arg8 + arg5 - 1) {
							local972 = local938 + 1 - arg8 - arg5;
						}
						@Pc(1049) int local1049 = local970 * local970 + local972 * local972;
						if (local920 > local1049 || local1049 == local920 && local922 > costs[local928][local938]) {
							local922 = costs[local928][local938];
							local37 = local938;
							local51 = local928;
							local920 = local1049;
						}
					}
				}
			}
			if (local920 == 1000) {
				return;
			}
			if (arg4 == local51 && arg2 == local37) {
				return;
			}
		}
		Static3.aBoolean147 = false;
		Static6.anInt4506 = local51;
		Static3.anInt2140 = local37;
	}
}

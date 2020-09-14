import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class SoftwareIndexedSprite extends IndexedSprite {

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "[I")
	public final int[] anIntArray120;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public SoftwareIndexedSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt3412 = arg0;
		this.anInt3410 = arg1;
		this.anInt3404 = arg2;
		this.anInt3405 = arg3;
		this.anInt3408 = arg4;
		this.anInt3413 = arg5;
		this.aByteArray15 = arg6;
		this.anIntArray120 = arg7;
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(III)V")
	public SoftwareIndexedSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3412 = this.anInt3408 = arg0;
		this.anInt3410 = this.anInt3413 = arg1;
		this.anInt3404 = this.anInt3405 = 0;
		this.aByteArray15 = new byte[arg0 * arg1];
		this.anIntArray120 = new int[arg2];
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	@Override
	public final void method2816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg0 + this.anInt3404;
		@Pc(9) int local9 = arg1 + this.anInt3405;
		@Pc(15) int local15 = local4 + local9 * Static6.anInt5188;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3413;
		@Pc(23) int local23 = this.anInt3408;
		@Pc(27) int local27 = Static6.anInt5188 - local23;
		@Pc(29) int local29 = 0;
		if (local9 < Static6.anInt5183) {
			@Pc(36) int local36 = Static6.anInt5183 - local9;
			local20 -= local36;
			local9 = Static6.anInt5183;
			local17 = local36 * local23;
			local15 += local36 * Static6.anInt5188;
		}
		if (local9 + local20 > Static6.anInt5187) {
			local20 -= local9 + local20 - Static6.anInt5187;
		}
		if (local4 < Static6.anInt5185) {
			@Pc(74) int local74 = Static6.anInt5185 - local4;
			local23 -= local74;
			local4 = Static6.anInt5185;
			local17 += local74;
			local15 += local74;
			local29 = local74;
			local27 += local74;
		}
		if (local4 + local23 > Static6.anInt5186) {
			@Pc(107) int local107 = local4 + local23 - Static6.anInt5186;
			local23 -= local107;
			local29 += local107;
			local27 += local107;
		}
		if (local23 > 0 && local20 > 0) {
			Static15.method1319(Static6.anIntArray561, this.aByteArray15, this.anIntArray120, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	public final void method1309() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = this.aByteArray15.length - 7;
		while (local1 < local7) {
			@Pc(14) int local14 = local1 + 1;
			this.aByteArray15[local1] = 0;
			this.aByteArray15[local14++] = 0;
			this.aByteArray15[local14++] = 0;
			this.aByteArray15[local14++] = 0;
			this.aByteArray15[local14++] = 0;
			this.aByteArray15[local14++] = 0;
			this.aByteArray15[local14++] = 0;
			local1 = local14 + 1;
			this.aByteArray15[local14] = 0;
		}
		@Pc(60) int local60 = local7 + 7;
		while (local1 < local60) {
			this.aByteArray15[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
	public final void method1311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray120.length; local1++) {
			@Pc(15) int local15 = this.anIntArray120[local1] >> 16 & 0xFF;
			@Pc(19) int local19 = local15 + arg0;
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			@Pc(38) int local38 = this.anIntArray120[local1] >> 8 & 0xFF;
			@Pc(42) int local42 = local38 + arg1;
			if (local42 < 0) {
				local42 = 0;
			} else if (local42 > 255) {
				local42 = 255;
			}
			@Pc(59) int local59 = this.anIntArray120[local1] & 0xFF;
			@Pc(63) int local63 = local59 + arg2;
			if (local63 < 0) {
				local63 = 0;
			} else if (local63 > 255) {
				local63 = 255;
			}
			this.anIntArray120[local1] = (local19 << 16) + (local42 << 8) + local63;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
	public final void method1312() {
		@Pc(6) byte[] local6 = new byte[this.anInt3408 * this.anInt3413];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt3413 - 1; local13 >= 0; local13--) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt3408; local17++) {
				local6[local8++] = this.aByteArray15[local17 + local13 * this.anInt3408];
			}
		}
		this.aByteArray15 = local6;
		this.anInt3405 = this.anInt3410 - this.anInt3413 - this.anInt3405;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()V")
	public final void method1313() {
		@Pc(6) byte[] local6 = new byte[this.anInt3408 * this.anInt3413];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt3408; local10++) {
			for (@Pc(19) int local19 = this.anInt3413 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.aByteArray15[local10 + local19 * this.anInt3408];
			}
		}
		this.aByteArray15 = local6;
		@Pc(44) int local44 = this.anInt3405;
		this.anInt3405 = this.anInt3404;
		this.anInt3404 = this.anInt3410 - this.anInt3413 - local44;
		local44 = this.anInt3413;
		this.anInt3413 = this.anInt3408;
		this.anInt3408 = local44;
		local44 = this.anInt3410;
		this.anInt3410 = this.anInt3412;
		this.anInt3412 = local44;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)V")
	public final void method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0 -= this.anInt3404 << 4;
		arg1 -= this.anInt3405 << 4;
		@Pc(23) double local23 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(33) int local33 = (int) Math.floor(Math.sin(local23) * (double) 4096 + 0.5D);
		@Pc(43) int local43 = (int) Math.floor(Math.cos(local23) * (double) 4096 + 0.5D);
		@Pc(53) int local53 = -arg0 * local43 + -arg1 * local33;
		@Pc(64) int local64 = --arg0 * local33 + -arg1 * local43;
		@Pc(78) int local78 = ((this.anInt3408 << 4) - arg0) * local43 + -arg1 * local33;
		@Pc(93) int local93 = -((this.anInt3408 << 4) - arg0) * local33 + -arg1 * local43;
		@Pc(107) int local107 = -arg0 * local43 + ((this.anInt3413 << 4) - arg1) * local33;
		@Pc(122) int local122 = --arg0 * local33 + ((this.anInt3413 << 4) - arg1) * local43;
		@Pc(140) int local140 = ((this.anInt3408 << 4) - arg0) * local43 + ((this.anInt3413 << 4) - arg1) * local33;
		@Pc(159) int local159 = -((this.anInt3408 << 4) - arg0) * local33 + ((this.anInt3413 << 4) - arg1) * local43;
		@Pc(164) int local164;
		@Pc(166) int local166;
		if (local53 < local78) {
			local164 = local53;
			local166 = local78;
		} else {
			local164 = local78;
			local166 = local53;
		}
		if (local107 < local164) {
			local164 = local107;
		}
		if (local140 < local164) {
			local164 = local140;
		}
		if (local107 > local166) {
			local166 = local107;
		}
		if (local140 > local166) {
			local166 = local140;
		}
		@Pc(196) int local196;
		@Pc(198) int local198;
		if (local64 < local93) {
			local196 = local64;
			local198 = local93;
		} else {
			local196 = local93;
			local198 = local64;
		}
		if (local122 < local196) {
			local196 = local122;
		}
		if (local159 < local196) {
			local196 = local159;
		}
		if (local122 > local198) {
			local198 = local122;
		}
		if (local159 > local198) {
			local198 = local159;
		}
		@Pc(227) int local227 = local164 >> 12;
		@Pc(233) int local233 = local166 + 4095 >> 12;
		@Pc(237) int local237 = local196 >> 12;
		@Pc(243) int local243 = local198 + 4095 >> 12;
		local227 += arg2;
		local233 += arg2;
		local237 += arg3;
		local243 += arg3;
		@Pc(263) int local263 = local227 >> 4;
		@Pc(269) int local269 = local233 + 15 >> 4;
		@Pc(273) int local273 = local237 >> 4;
		@Pc(279) int local279 = local243 + 15 >> 4;
		if (local263 < Static6.anInt5185) {
			local263 = Static6.anInt5185;
		}
		if (local269 > Static6.anInt5186) {
			local269 = Static6.anInt5186;
		}
		if (local273 < Static6.anInt5183) {
			local273 = Static6.anInt5183;
		}
		if (local279 > Static6.anInt5187) {
			local279 = Static6.anInt5187;
		}
		@Pc(303) int local303 = local263 - local269;
		if (local303 >= 0) {
			return;
		}
		@Pc(310) int local310 = local273 - local279;
		if (local310 >= 0) {
			return;
		}
		@Pc(319) int local319 = local273 * Static6.anInt5188 + local263;
		@Pc(324) double local324 = 1.6777216E7D / (double) 4096;
		@Pc(333) int local333 = (int) Math.floor(Math.sin(local23) * local324 + 0.5D);
		@Pc(342) int local342 = (int) Math.floor(Math.cos(local23) * local324 + 0.5D);
		@Pc(350) int local350 = (local263 << 4) + 8 - arg2;
		@Pc(358) int local358 = (local273 << 4) + 8 - arg3;
		@Pc(368) int local368 = (arg0 << 8) - (local358 * local333 >> 4);
		@Pc(378) int local378 = (arg1 << 8) + (local358 * local342 >> 4);
		@Pc(492) int local492;
		if (local342 == 0) {
			if (local333 == 0) {
				@Pc(384) int local384 = local310;
				while (local384 < 0) {
					@Pc(388) int local388 = local319;
					@Pc(394) int local394 = local303;
					if (local368 >= 0 && local378 >= 0 && local368 - (this.anInt3408 << 12) < 0 && local378 - (this.anInt3413 << 12) < 0) {
						while (local394 < 0) {
							@Pc(435) int local435 = this.anIntArray120[this.aByteArray15[(local378 >> 12) * this.anInt3408 + (local368 >> 12)]];
							if (local435 == 0) {
								local388++;
							} else {
								Static6.anIntArray561[local388++] = local435;
							}
							local394++;
						}
					}
					local384++;
					local319 += Static6.anInt5188;
				}
			} else if (local333 < 0) {
				@Pc(457) int local457 = local310;
				while (local457 < 0) {
					@Pc(461) int local461 = local319;
					@Pc(471) int local471 = local378 + (local350 * local333 >> 4);
					@Pc(473) int local473 = local303;
					if (local368 >= 0 && local368 - (this.anInt3408 << 12) < 0) {
						if ((local492 = local471 - (this.anInt3413 << 12)) >= 0) {
							local492 = (local333 - local492) / local333;
							local473 = local303 + local492;
							local471 += local333 * local492;
							local461 = local319 + local492;
						}
						if ((local492 = (local471 - local333) / local333) > local473) {
							local473 = local492;
						}
						while (local473 < 0) {
							@Pc(543) int local543 = this.anIntArray120[this.aByteArray15[(local471 >> 12) * this.anInt3408 + (local368 >> 12)]];
							if (local543 == 0) {
								local461++;
							} else {
								Static6.anIntArray561[local461++] = local543;
							}
							local471 += local333;
							local473++;
						}
					}
					local457++;
					local368 -= local333;
					local319 += Static6.anInt5188;
				}
			} else {
				@Pc(571) int local571 = local310;
				while (local571 < 0) {
					@Pc(575) int local575 = local319;
					@Pc(585) int local585 = local378 + (local350 * local333 >> 4);
					@Pc(587) int local587 = local303;
					if (local368 >= 0 && local368 - (this.anInt3408 << 12) < 0) {
						if (local585 < 0) {
							local492 = (local333 - local585 - 1) / local333;
							local587 = local303 + local492;
							local585 += local333 * local492;
							local575 = local319 + local492;
						}
						if ((local492 = (local585 + 1 - (this.anInt3413 << 12) - local333) / local333) > local587) {
							local587 = local492;
						}
						while (local587 < 0) {
							@Pc(659) int local659 = this.anIntArray120[this.aByteArray15[(local585 >> 12) * this.anInt3408 + (local368 >> 12)]];
							if (local659 == 0) {
								local575++;
							} else {
								Static6.anIntArray561[local575++] = local659;
							}
							local585 += local333;
							local587++;
						}
					}
					local571++;
					local368 -= local333;
					local319 += Static6.anInt5188;
				}
			}
		} else if (local342 < 0) {
			if (local333 == 0) {
				@Pc(691) int local691 = local310;
				while (local691 < 0) {
					@Pc(695) int local695 = local319;
					@Pc(703) int local703 = local368 + (local350 * local342 >> 4);
					@Pc(707) int local707 = local303;
					if (local378 >= 0 && local378 - (this.anInt3413 << 12) < 0) {
						if ((local492 = local703 - (this.anInt3408 << 12)) >= 0) {
							local492 = (local342 - local492) / local342;
							local707 = local303 + local492;
							local703 += local342 * local492;
							local695 = local319 + local492;
						}
						if ((local492 = (local703 - local342) / local342) > local707) {
							local707 = local492;
						}
						while (local707 < 0) {
							@Pc(777) int local777 = this.anIntArray120[this.aByteArray15[(local378 >> 12) * this.anInt3408 + (local703 >> 12)]];
							if (local777 == 0) {
								local695++;
							} else {
								Static6.anIntArray561[local695++] = local777;
							}
							local703 += local342;
							local707++;
						}
					}
					local691++;
					local378 += local342;
					local319 += Static6.anInt5188;
				}
			} else if (local333 < 0) {
				@Pc(807) int local807 = local310;
				while (local807 < 0) {
					@Pc(811) int local811 = local319;
					@Pc(819) int local819 = local368 + (local350 * local342 >> 4);
					@Pc(827) int local827 = local378 + (local350 * local333 >> 4);
					@Pc(829) int local829 = local303;
					if ((local492 = local819 - (this.anInt3408 << 12)) >= 0) {
						local492 = (local342 - local492) / local342;
						local829 = local303 + local492;
						local819 += local342 * local492;
						local827 += local333 * local492;
						local811 = local319 + local492;
					}
					if ((local492 = (local819 - local342) / local342) > local829) {
						local829 = local492;
					}
					if ((local492 = local827 - (this.anInt3413 << 12)) >= 0) {
						local492 = (local333 - local492) / local333;
						local829 += local492;
						local819 += local342 * local492;
						local827 += local333 * local492;
						local811 += local492;
					}
					if ((local492 = (local827 - local333) / local333) > local829) {
						local829 = local492;
					}
					while (local829 < 0) {
						@Pc(940) int local940 = this.anIntArray120[this.aByteArray15[(local827 >> 12) * this.anInt3408 + (local819 >> 12)]];
						if (local940 == 0) {
							local811++;
						} else {
							Static6.anIntArray561[local811++] = local940;
						}
						local819 += local342;
						local827 += local333;
						local829++;
					}
					local807++;
					local368 -= local333;
					local378 += local342;
					local319 += Static6.anInt5188;
				}
			} else {
				@Pc(976) int local976 = local310;
				while (local976 < 0) {
					@Pc(980) int local980 = local319;
					@Pc(988) int local988 = local368 + (local350 * local342 >> 4);
					@Pc(996) int local996 = local378 + (local350 * local333 >> 4);
					@Pc(998) int local998 = local303;
					if ((local492 = local988 - (this.anInt3408 << 12)) >= 0) {
						local492 = (local342 - local492) / local342;
						local998 = local303 + local492;
						local988 += local342 * local492;
						local996 += local333 * local492;
						local980 = local319 + local492;
					}
					if ((local492 = (local988 - local342) / local342) > local998) {
						local998 = local492;
					}
					if (local996 < 0) {
						local492 = (local333 - local996 - 1) / local333;
						local998 += local492;
						local988 += local342 * local492;
						local996 += local333 * local492;
						local980 += local492;
					}
					if ((local492 = (local996 + 1 - (this.anInt3413 << 12) - local333) / local333) > local998) {
						local998 = local492;
					}
					while (local998 < 0) {
						@Pc(1111) int local1111 = this.anIntArray120[this.aByteArray15[(local996 >> 12) * this.anInt3408 + (local988 >> 12)]];
						if (local1111 == 0) {
							local980++;
						} else {
							Static6.anIntArray561[local980++] = local1111;
						}
						local988 += local342;
						local996 += local333;
						local998++;
					}
					local976++;
					local368 -= local333;
					local378 += local342;
					local319 += Static6.anInt5188;
				}
			}
		} else if (local333 == 0) {
			@Pc(1149) int local1149 = local310;
			while (local1149 < 0) {
				@Pc(1153) int local1153 = local319;
				@Pc(1161) int local1161 = local368 + (local350 * local342 >> 4);
				@Pc(1165) int local1165 = local303;
				if (local378 >= 0 && local378 - (this.anInt3413 << 12) < 0) {
					if (local1161 < 0) {
						local492 = (local342 - local1161 - 1) / local342;
						local1165 = local303 + local492;
						local1161 += local342 * local492;
						local1153 = local319 + local492;
					}
					if ((local492 = (local1161 + 1 - (this.anInt3408 << 12) - local342) / local342) > local1165) {
						local1165 = local492;
					}
					while (local1165 < 0) {
						@Pc(1237) int local1237 = this.anIntArray120[this.aByteArray15[(local378 >> 12) * this.anInt3408 + (local1161 >> 12)]];
						if (local1237 == 0) {
							local1153++;
						} else {
							Static6.anIntArray561[local1153++] = local1237;
						}
						local1161 += local342;
						local1165++;
					}
				}
				local1149++;
				local378 += local342;
				local319 += Static6.anInt5188;
			}
		} else if (local333 < 0) {
			@Pc(1267) int local1267 = local310;
			while (local1267 < 0) {
				@Pc(1271) int local1271 = local319;
				@Pc(1279) int local1279 = local368 + (local350 * local342 >> 4);
				@Pc(1287) int local1287 = local378 + (local350 * local333 >> 4);
				@Pc(1289) int local1289 = local303;
				if (local1279 < 0) {
					local492 = (local342 - local1279 - 1) / local342;
					local1289 = local303 + local492;
					local1279 += local342 * local492;
					local1287 += local333 * local492;
					local1271 = local319 + local492;
				}
				if ((local492 = (local1279 + 1 - (this.anInt3408 << 12) - local342) / local342) > local1289) {
					local1289 = local492;
				}
				if ((local492 = local1287 - (this.anInt3413 << 12)) >= 0) {
					local492 = (local333 - local492) / local333;
					local1289 += local492;
					local1279 += local342 * local492;
					local1287 += local333 * local492;
					local1271 += local492;
				}
				if ((local492 = (local1287 - local333) / local333) > local1289) {
					local1289 = local492;
				}
				while (local1289 < 0) {
					@Pc(1402) int local1402 = this.anIntArray120[this.aByteArray15[(local1287 >> 12) * this.anInt3408 + (local1279 >> 12)]];
					if (local1402 == 0) {
						local1271++;
					} else {
						Static6.anIntArray561[local1271++] = local1402;
					}
					local1279 += local342;
					local1287 += local333;
					local1289++;
				}
				local1267++;
				local368 -= local333;
				local378 += local342;
				local319 += Static6.anInt5188;
			}
		} else {
			@Pc(1438) int local1438 = local310;
			while (local1438 < 0) {
				@Pc(1442) int local1442 = local319;
				@Pc(1450) int local1450 = local368 + (local350 * local342 >> 4);
				@Pc(1458) int local1458 = local378 + (local350 * local333 >> 4);
				@Pc(1460) int local1460 = local303;
				if (local1450 < 0) {
					local492 = (local342 - local1450 - 1) / local342;
					local1460 = local303 + local492;
					local1450 += local342 * local492;
					local1458 += local333 * local492;
					local1442 = local319 + local492;
				}
				if ((local492 = (local1450 + 1 - (this.anInt3408 << 12) - local342) / local342) > local1460) {
					local1460 = local492;
				}
				if (local1458 < 0) {
					local492 = (local333 - local1458 - 1) / local333;
					local1460 += local492;
					local1450 += local342 * local492;
					local1458 += local333 * local492;
					local1442 += local492;
				}
				if ((local492 = (local1458 + 1 - (this.anInt3413 << 12) - local333) / local333) > local1460) {
					local1460 = local492;
				}
				while (local1460 < 0) {
					@Pc(1575) int local1575 = this.anIntArray120[this.aByteArray15[(local1458 >> 12) * this.anInt3408 + (local1450 >> 12)]];
					if (local1575 == 0) {
						local1442++;
					} else {
						Static6.anIntArray561[local1442++] = local1575;
					}
					local1450 += local342;
					local1458 += local333;
					local1460++;
				}
				local1438++;
				local368 -= local333;
				local378 += local342;
				local319 += Static6.anInt5188;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
	public final void method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.anInt3408;
		@Pc(5) int local5 = this.anInt3413;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt3412;
		@Pc(15) int local15 = this.anInt3410;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		if (this.anInt3404 > 0) {
			@Pc(41) int local41 = ((this.anInt3404 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt3404 << 16);
		}
		if (this.anInt3405 > 0) {
			@Pc(70) int local70 = ((this.anInt3405 << 16) + local27 - 1) / local27;
			arg1 += local70;
			local9 = local70 * local27 - (this.anInt3405 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		@Pc(121) int local121 = arg0 + arg1 * Static6.anInt5188;
		@Pc(125) int local125 = Static6.anInt5188 - arg2;
		if (arg1 + arg3 > Static6.anInt5187) {
			arg3 -= arg1 + arg3 - Static6.anInt5187;
		}
		if (arg1 < Static6.anInt5183) {
			@Pc(145) int local145 = Static6.anInt5183 - arg1;
			arg3 -= local145;
			local121 += local145 * Static6.anInt5188;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static6.anInt5186) {
			@Pc(172) int local172 = arg0 + arg2 - Static6.anInt5186;
			arg2 -= local172;
			local125 += local172;
		}
		if (arg0 < Static6.anInt5185) {
			@Pc(187) int local187 = Static6.anInt5185 - arg0;
			arg2 -= local187;
			local121 += local187;
			local7 += local21 * local187;
			local125 += local187;
		}
		Static15.method1317(Static6.anIntArray561, this.aByteArray15, this.anIntArray120, local7, local9, local121, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)V")
	public final void method1316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = this.anInt3408;
		@Pc(5) int local5 = this.anInt3413;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt3412;
		@Pc(15) int local15 = this.anInt3410;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		if (this.anInt3404 > 0) {
			@Pc(41) int local41 = ((this.anInt3404 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt3404 << 16);
		}
		if (this.anInt3405 > 0) {
			@Pc(70) int local70 = ((this.anInt3405 << 16) + local27 - 1) / local27;
			arg1 += local70;
			local9 = local70 * local27 - (this.anInt3405 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		@Pc(121) int local121 = arg0 + arg1 * Static6.anInt5188;
		@Pc(125) int local125 = Static6.anInt5188 - arg2;
		if (arg1 + arg3 > Static6.anInt5187) {
			arg3 -= arg1 + arg3 - Static6.anInt5187;
		}
		if (arg1 < Static6.anInt5183) {
			@Pc(145) int local145 = Static6.anInt5183 - arg1;
			arg3 -= local145;
			local121 += local145 * Static6.anInt5188;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static6.anInt5186) {
			@Pc(172) int local172 = arg0 + arg2 - Static6.anInt5186;
			arg2 -= local172;
			local125 += local172;
		}
		if (arg0 < Static6.anInt5185) {
			@Pc(187) int local187 = Static6.anInt5185 - arg0;
			arg2 -= local187;
			local121 += local187;
			local7 += local21 * local187;
			local125 += local187;
		}
		Static15.method1318(Static6.anIntArray561, this.aByteArray15, this.anIntArray120, local7, local9, local121, local125, arg2, arg3, local21, local27, local2, arg4);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	@Override
	public final void method2815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 + this.anInt3404;
		@Pc(9) int local9 = arg1 + this.anInt3405;
		@Pc(15) int local15 = local4 + local9 * Static6.anInt5188;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3413;
		@Pc(23) int local23 = this.anInt3408;
		@Pc(27) int local27 = Static6.anInt5188 - local23;
		@Pc(29) int local29 = 0;
		if (local9 < Static6.anInt5183) {
			@Pc(36) int local36 = Static6.anInt5183 - local9;
			local20 -= local36;
			local9 = Static6.anInt5183;
			local17 = local36 * local23;
			local15 += local36 * Static6.anInt5188;
		}
		if (local9 + local20 > Static6.anInt5187) {
			local20 -= local9 + local20 - Static6.anInt5187;
		}
		if (local4 < Static6.anInt5185) {
			@Pc(74) int local74 = Static6.anInt5185 - local4;
			local23 -= local74;
			local4 = Static6.anInt5185;
			local17 += local74;
			local15 += local74;
			local29 = local74;
			local27 += local74;
		}
		if (local4 + local23 > Static6.anInt5186) {
			@Pc(107) int local107 = local4 + local23 - Static6.anInt5186;
			local23 -= local107;
			local29 += local107;
			local27 += local107;
		}
		if (local23 > 0 && local20 > 0) {
			Static15.method1310(Static6.anIntArray561, this.aByteArray15, this.anIntArray120, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
	public final void method1320() {
		if (this.anInt3408 == this.anInt3412 && this.anInt3413 == this.anInt3410) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt3412 * this.anInt3410];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt3413; local21++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt3408; local27++) {
				local17[local27 + this.anInt3404 + (local21 + this.anInt3405) * this.anInt3412] = this.aByteArray15[local19++];
			}
		}
		this.aByteArray15 = local17;
		this.anInt3408 = this.anInt3412;
		this.anInt3413 = this.anInt3410;
		this.anInt3404 = 0;
		this.anInt3405 = 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[I[I)V")
	public final void method1321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (Static6.anInt5187 - Static6.anInt5183 != arg2.length) {
			throw new IllegalStateException();
		}
		@Pc(14) int local14 = arg0 + this.anInt3404;
		@Pc(19) int local19 = arg1 + this.anInt3405;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = this.anInt3413;
		@Pc(27) int local27 = this.anInt3408;
		@Pc(31) int local31 = Static6.anInt5188 - local27;
		@Pc(33) int local33 = 0;
		@Pc(39) int local39 = local14 + local19 * Static6.anInt5188;
		if (local19 < Static6.anInt5183) {
			@Pc(46) int local46 = Static6.anInt5183 - local19;
			local24 -= local46;
			local19 = Static6.anInt5183;
			local21 = local46 * local27;
			local39 += local46 * Static6.anInt5188;
		}
		if (local19 + local24 > Static6.anInt5187) {
			local24 -= local19 + local24 - Static6.anInt5187;
		}
		if (local14 < Static6.anInt5185) {
			@Pc(84) int local84 = Static6.anInt5185 - local14;
			local27 -= local84;
			local14 = Static6.anInt5185;
			local21 += local84;
			local39 += local84;
			local33 = local84;
			local31 += local84;
		}
		if (local14 + local27 > Static6.anInt5186) {
			@Pc(117) int local117 = local14 + local27 - Static6.anInt5186;
			local27 -= local117;
			local33 += local117;
			local31 += local117;
		}
		if (local27 <= 0 || local24 <= 0) {
			return;
		}
		@Pc(138) int local138 = local14 - Static6.anInt5185;
		@Pc(142) int local142 = local19 - Static6.anInt5183;
		for (@Pc(144) int local144 = local142; local144 < local142 + local24; local144++) {
			@Pc(153) int local153 = arg2[local144];
			@Pc(157) int local157 = arg3[local144];
			@Pc(159) int local159 = local27;
			if (local138 > local153) {
				@Pc(166) int local166 = local138 - local153;
				if (local166 >= local157) {
					local21 += local27 + local33;
					local39 += local27 + local31;
					continue;
				}
				local157 -= local166;
			} else {
				@Pc(191) int local191 = local153 - local138;
				if (local191 >= local27) {
					local21 += local27 + local33;
					local39 += local27 + local31;
					continue;
				}
				local21 += local191;
				local159 = local27 - local191;
				local39 += local191;
			}
			@Pc(221) int local221 = 0;
			if (local159 < local157) {
				local157 = local159;
			} else {
				local221 = local159 - local157;
			}
			for (@Pc(234) int local234 = -local157; local234 < 0; local234++) {
				@Pc(245) int local245 = this.anIntArray120[this.aByteArray15[local21++]];
				if (local245 == 0) {
					local39++;
				} else {
					Static6.anIntArray561[local39++] = local245;
				}
			}
			local21 += local221 + local33;
			local39 += local221 + local31;
		}
	}
}

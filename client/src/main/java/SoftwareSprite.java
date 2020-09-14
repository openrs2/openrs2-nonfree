import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public class SoftwareSprite extends Sprite {

	@OriginalMember(owner = "client!vn", name = "M", descriptor = "[I")
	public int[] pixels;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIII[I)V")
	public SoftwareSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.anInt5602 = arg0;
		this.anInt5612 = arg1;
		this.anInt5606 = arg2;
		this.anInt5604 = arg3;
		this.width = arg4;
		this.height = arg5;
		this.pixels = arg6;
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(II)V")
	public SoftwareSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.pixels = new int[arg0 * arg1];
		this.width = this.anInt5602 = arg0;
		this.height = this.anInt5612 = arg1;
		this.anInt5606 = this.anInt5604 = 0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "()V")
	public final void method2164() {
		@Pc(2) int[] local2 = this.pixels;
		for (@Pc(7) int local7 = this.height - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.width;
			@Pc(21) int local21 = (local7 + 1) * this.width;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		this.anInt5606 = this.anInt5602 - this.width - this.anInt5606;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)V")
	@Override
	public void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg0 + this.anInt5606;
		@Pc(9) int local9 = arg1 + this.anInt5604;
		@Pc(15) int local15 = local4 + local9 * Static6.anInt5188;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.height;
		@Pc(23) int local23 = this.width;
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
			Static36.method2166(Static6.anIntArray561, this.pixels, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIII[I[I)V")
	public void method2165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			local18 = local18 * 256 >> 8;
			local27 = local27 * 256 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local18 + local4 * local27;
			@Pc(63) int local63 = (arg5 << 16) + local9 * local27 - local4 * local18;
			@Pc(69) int local69 = arg0 + arg1 * Static6.anInt5188;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(78) int local78 = arg7[local71];
				@Pc(82) int local82 = local69 + local78;
				@Pc(88) int local88 = local51 + local27 * local78;
				@Pc(94) int local94 = local63 - local18 * local78;
				for (@Pc(99) int local99 = -arg8[local71]; local99 < 0; local99++) {
					@Pc(115) int local115 = this.pixels[(local88 >> 16) + (local94 >> 16) * this.width];
					if (local115 == 0) {
						local82++;
					} else {
						Static6.anIntArray561[local82++] = local115;
					}
					local88 += local27;
					local94 -= local18;
				}
				local51 += local18;
				local63 += local27;
				local69 += Static6.anInt5188;
			}
		} catch (@Pc(150) Exception local150) {
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(7) int local7 = this.width;
		@Pc(10) int local10 = this.height;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.anInt5602;
		@Pc(20) int local20 = this.anInt5612;
		@Pc(26) int local26 = (local17 << 16) / arg2;
		@Pc(32) int local32 = (local20 << 16) / arg3;
		if (this.anInt5606 > 0) {
			@Pc(46) int local46 = ((this.anInt5606 << 16) + local26 - 1) / local26;
			arg0 += local46;
			local12 = local46 * local26 - (this.anInt5606 << 16);
		}
		if (this.anInt5604 > 0) {
			@Pc(75) int local75 = ((this.anInt5604 << 16) + local32 - 1) / local32;
			arg1 += local75;
			local14 = local75 * local32 - (this.anInt5604 << 16);
		}
		if (local7 < local17) {
			arg2 = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			arg3 = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		@Pc(126) int local126 = arg0 + arg1 * Static6.anInt5188;
		@Pc(130) int local130 = Static6.anInt5188 - arg2;
		if (arg1 + arg3 > Static6.anInt5187) {
			arg3 -= arg1 + arg3 - Static6.anInt5187;
		}
		if (arg1 < Static6.anInt5183) {
			@Pc(150) int local150 = Static6.anInt5183 - arg1;
			arg3 -= local150;
			local126 += local150 * Static6.anInt5188;
			local14 += local32 * local150;
		}
		if (arg0 + arg2 > Static6.anInt5186) {
			@Pc(177) int local177 = arg0 + arg2 - Static6.anInt5186;
			arg2 -= local177;
			local130 += local177;
		}
		if (arg0 < Static6.anInt5185) {
			@Pc(192) int local192 = Static6.anInt5185 - arg0;
			arg2 -= local192;
			local126 += local192;
			local12 += local26 * local192;
			local130 += local192;
		}
		Static36.method2172(Static6.anIntArray561, this.pixels, local12, local14, local126, local130, arg2, arg3, local26, local32, local7);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIIIIII[I[I)V")
	public void method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			local18 = local18 * arg7 >> 8;
			local27 = local27 * arg7 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local18 + local4 * local27;
			@Pc(63) int local63 = (arg5 << 16) + local9 * local27 - local4 * local18;
			@Pc(69) int local69 = arg0 + arg1 * Static6.anInt5188;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(78) int local78 = arg8[local71];
				@Pc(82) int local82 = local69 + local78;
				@Pc(88) int local88 = local51 + local27 * local78;
				@Pc(94) int local94 = local63 - local18 * local78;
				for (@Pc(99) int local99 = -arg9[local71]; local99 < 0; local99++) {
					Static6.anIntArray561[local82++] = this.pixels[(local88 >> 16) + (local94 >> 16) * this.width];
					local88 += local27;
					local94 -= local18;
				}
				local51 += local18;
				local63 += local27;
				local69 += Static6.anInt5188;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
	public final void method2168(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.height - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.width;
			for (@Pc(16) int local16 = this.width - 1; local16 > 0; local16--) {
				if (this.pixels[local16 + local11] == 0 && this.pixels[local16 + local11 - this.width - 1] != 0) {
					this.pixels[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "()V")
	public final void method2169() {
		@Pc(2) int[] local2 = this.pixels;
		for (@Pc(9) int local9 = (this.height >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.width;
			@Pc(26) int local26 = (this.height - local9 - 1) * this.width;
			for (@Pc(30) int local30 = -this.width; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		this.anInt5604 = this.anInt5612 - this.height - this.anInt5604;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "()[I")
	public int[] getPixels() {
		@Pc(6) int[] local6 = new int[this.anInt5602 * this.anInt5612];
		for (@Pc(8) int local8 = 0; local8 < this.height; local8++) {
			@Pc(17) int local17 = local8 * this.width;
			@Pc(28) int local28 = this.anInt5606 + (local8 + this.anInt5604) * this.anInt5602;
			for (@Pc(30) int local30 = 0; local30 < this.width; local30++) {
				@Pc(40) int local40 = this.pixels[local17++];
				local6[local28++] = local40 == 0 ? 0 : local40 | 0xFF000000;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II[I[I)V")
	public final void method2171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (Static6.anInt5187 - Static6.anInt5183 != arg2.length) {
			throw new IllegalStateException();
		}
		@Pc(14) int local14 = arg0 + this.anInt5606;
		@Pc(19) int local19 = arg1 + this.anInt5604;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = this.height;
		@Pc(27) int local27 = this.width;
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
				@Pc(242) int local242 = this.pixels[local21++];
				if (local242 == 0) {
					local39++;
				} else {
					Static6.anIntArray561[local39++] = local242;
				}
			}
			local21 += local221 + local33;
			local39 += local221 + local31;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIDI)V")
	public void method2173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) double arg2) {
		try {
			@Pc(15) int local15 = (int) (Math.sin(arg2) * 65536.0D);
			@Pc(21) int local21 = (int) (Math.cos(arg2) * 65536.0D);
			local15 = local15 * 256 >> 8;
			local21 = local21 * 256 >> 8;
			@Pc(45) int local45 = local15 * -10 + local21 * -10 + 983040;
			@Pc(57) int local57 = local21 * -10 + 983040 - local15 * -10;
			@Pc(63) int local63 = arg0 + arg1 * Static6.anInt5188;
			for (@Pc(65) int local65 = 0; local65 < 20; local65++) {
				@Pc(70) int local70 = local63;
				@Pc(72) int local72 = local45;
				@Pc(74) int local74 = local57;
				for (@Pc(77) int local77 = -20; local77 < 0; local77++) {
					@Pc(93) int local93 = this.pixels[(local72 >> 16) + (local74 >> 16) * this.width];
					if (local93 == 0) {
						local70++;
					} else {
						Static6.anIntArray561[local70++] = local93;
					}
					local72 += local21;
					local74 -= local15;
				}
				local45 += local15;
				local57 += local21;
				local63 += Static6.anInt5188;
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 == 0) {
			return;
		}
		arg0 -= this.anInt5606 << 4;
		arg1 -= this.anInt5604 << 4;
		@Pc(23) double local23 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(33) int local33 = (int) Math.floor(Math.sin(local23) * (double) arg5 + 0.5D);
		@Pc(43) int local43 = (int) Math.floor(Math.cos(local23) * (double) arg5 + 0.5D);
		@Pc(53) int local53 = -arg0 * local43 + -arg1 * local33;
		@Pc(64) int local64 = --arg0 * local33 + -arg1 * local43;
		@Pc(78) int local78 = ((this.width << 4) - arg0) * local43 + -arg1 * local33;
		@Pc(93) int local93 = -((this.width << 4) - arg0) * local33 + -arg1 * local43;
		@Pc(107) int local107 = -arg0 * local43 + ((this.height << 4) - arg1) * local33;
		@Pc(122) int local122 = --arg0 * local33 + ((this.height << 4) - arg1) * local43;
		@Pc(140) int local140 = ((this.width << 4) - arg0) * local43 + ((this.height << 4) - arg1) * local33;
		@Pc(159) int local159 = -((this.width << 4) - arg0) * local33 + ((this.height << 4) - arg1) * local43;
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
		@Pc(324) double local324 = 1.6777216E7D / (double) arg5;
		@Pc(333) int local333 = (int) Math.floor(Math.sin(local23) * local324 + 0.5D);
		@Pc(342) int local342 = (int) Math.floor(Math.cos(local23) * local324 + 0.5D);
		@Pc(350) int local350 = (local263 << 4) + 8 - arg2;
		@Pc(358) int local358 = (local273 << 4) + 8 - arg3;
		@Pc(368) int local368 = (arg0 << 8) - (local358 * local333 >> 4);
		@Pc(378) int local378 = (arg1 << 8) + (local358 * local342 >> 4);
		@Pc(489) int local489;
		if (local342 == 0) {
			if (local333 == 0) {
				@Pc(384) int local384 = local310;
				while (local384 < 0) {
					@Pc(388) int local388 = local319;
					@Pc(394) int local394 = local303;
					if (local368 >= 0 && local378 >= 0 && local368 - (this.width << 12) < 0 && local378 - (this.height << 12) < 0) {
						while (local394 < 0) {
							@Pc(432) int local432 = this.pixels[(local378 >> 12) * this.width + (local368 >> 12)];
							if (local432 == 0) {
								local388++;
							} else {
								Static6.anIntArray561[local388++] = local432;
							}
							local394++;
						}
					}
					local384++;
					local319 += Static6.anInt5188;
				}
			} else if (local333 < 0) {
				@Pc(454) int local454 = local310;
				while (local454 < 0) {
					@Pc(458) int local458 = local319;
					@Pc(468) int local468 = local378 + (local350 * local333 >> 4);
					@Pc(470) int local470 = local303;
					if (local368 >= 0 && local368 - (this.width << 12) < 0) {
						if ((local489 = local468 - (this.height << 12)) >= 0) {
							local489 = (local333 - local489) / local333;
							local470 = local303 + local489;
							local468 += local333 * local489;
							local458 = local319 + local489;
						}
						if ((local489 = (local468 - local333) / local333) > local470) {
							local470 = local489;
						}
						while (local470 < 0) {
							@Pc(537) int local537 = this.pixels[(local468 >> 12) * this.width + (local368 >> 12)];
							if (local537 == 0) {
								local458++;
							} else {
								Static6.anIntArray561[local458++] = local537;
							}
							local468 += local333;
							local470++;
						}
					}
					local454++;
					local368 -= local333;
					local319 += Static6.anInt5188;
				}
			} else {
				@Pc(565) int local565 = local310;
				while (local565 < 0) {
					@Pc(569) int local569 = local319;
					@Pc(579) int local579 = local378 + (local350 * local333 >> 4);
					@Pc(581) int local581 = local303;
					if (local368 >= 0 && local368 - (this.width << 12) < 0) {
						if (local579 < 0) {
							local489 = (local333 - local579 - 1) / local333;
							local581 = local303 + local489;
							local579 += local333 * local489;
							local569 = local319 + local489;
						}
						if ((local489 = (local579 + 1 - (this.height << 12) - local333) / local333) > local581) {
							local581 = local489;
						}
						while (local581 < 0) {
							@Pc(650) int local650 = this.pixels[(local579 >> 12) * this.width + (local368 >> 12)];
							if (local650 == 0) {
								local569++;
							} else {
								Static6.anIntArray561[local569++] = local650;
							}
							local579 += local333;
							local581++;
						}
					}
					local565++;
					local368 -= local333;
					local319 += Static6.anInt5188;
				}
			}
		} else if (local342 < 0) {
			if (local333 == 0) {
				@Pc(682) int local682 = local310;
				while (local682 < 0) {
					@Pc(686) int local686 = local319;
					@Pc(694) int local694 = local368 + (local350 * local342 >> 4);
					@Pc(698) int local698 = local303;
					if (local378 >= 0 && local378 - (this.height << 12) < 0) {
						if ((local489 = local694 - (this.width << 12)) >= 0) {
							local489 = (local342 - local489) / local342;
							local698 = local303 + local489;
							local694 += local342 * local489;
							local686 = local319 + local489;
						}
						if ((local489 = (local694 - local342) / local342) > local698) {
							local698 = local489;
						}
						while (local698 < 0) {
							@Pc(765) int local765 = this.pixels[(local378 >> 12) * this.width + (local694 >> 12)];
							if (local765 == 0) {
								local686++;
							} else {
								Static6.anIntArray561[local686++] = local765;
							}
							local694 += local342;
							local698++;
						}
					}
					local682++;
					local378 += local342;
					local319 += Static6.anInt5188;
				}
			} else if (local333 < 0) {
				@Pc(795) int local795 = local310;
				while (local795 < 0) {
					@Pc(799) int local799 = local319;
					@Pc(807) int local807 = local368 + (local350 * local342 >> 4);
					@Pc(815) int local815 = local378 + (local350 * local333 >> 4);
					@Pc(817) int local817 = local303;
					if ((local489 = local807 - (this.width << 12)) >= 0) {
						local489 = (local342 - local489) / local342;
						local817 = local303 + local489;
						local807 += local342 * local489;
						local815 += local333 * local489;
						local799 = local319 + local489;
					}
					if ((local489 = (local807 - local342) / local342) > local817) {
						local817 = local489;
					}
					if ((local489 = local815 - (this.height << 12)) >= 0) {
						local489 = (local333 - local489) / local333;
						local817 += local489;
						local807 += local342 * local489;
						local815 += local333 * local489;
						local799 += local489;
					}
					if ((local489 = (local815 - local333) / local333) > local817) {
						local817 = local489;
					}
					while (local817 < 0) {
						@Pc(925) int local925 = this.pixels[(local815 >> 12) * this.width + (local807 >> 12)];
						if (local925 == 0) {
							local799++;
						} else {
							Static6.anIntArray561[local799++] = local925;
						}
						local807 += local342;
						local815 += local333;
						local817++;
					}
					local795++;
					local368 -= local333;
					local378 += local342;
					local319 += Static6.anInt5188;
				}
			} else {
				@Pc(961) int local961 = local310;
				while (local961 < 0) {
					@Pc(965) int local965 = local319;
					@Pc(973) int local973 = local368 + (local350 * local342 >> 4);
					@Pc(981) int local981 = local378 + (local350 * local333 >> 4);
					@Pc(983) int local983 = local303;
					if ((local489 = local973 - (this.width << 12)) >= 0) {
						local489 = (local342 - local489) / local342;
						local983 = local303 + local489;
						local973 += local342 * local489;
						local981 += local333 * local489;
						local965 = local319 + local489;
					}
					if ((local489 = (local973 - local342) / local342) > local983) {
						local983 = local489;
					}
					if (local981 < 0) {
						local489 = (local333 - local981 - 1) / local333;
						local983 += local489;
						local973 += local342 * local489;
						local981 += local333 * local489;
						local965 += local489;
					}
					if ((local489 = (local981 + 1 - (this.height << 12) - local333) / local333) > local983) {
						local983 = local489;
					}
					while (local983 < 0) {
						@Pc(1093) int local1093 = this.pixels[(local981 >> 12) * this.width + (local973 >> 12)];
						if (local1093 == 0) {
							local965++;
						} else {
							Static6.anIntArray561[local965++] = local1093;
						}
						local973 += local342;
						local981 += local333;
						local983++;
					}
					local961++;
					local368 -= local333;
					local378 += local342;
					local319 += Static6.anInt5188;
				}
			}
		} else if (local333 == 0) {
			@Pc(1131) int local1131 = local310;
			while (local1131 < 0) {
				@Pc(1135) int local1135 = local319;
				@Pc(1143) int local1143 = local368 + (local350 * local342 >> 4);
				@Pc(1147) int local1147 = local303;
				if (local378 >= 0 && local378 - (this.height << 12) < 0) {
					if (local1143 < 0) {
						local489 = (local342 - local1143 - 1) / local342;
						local1147 = local303 + local489;
						local1143 += local342 * local489;
						local1135 = local319 + local489;
					}
					if ((local489 = (local1143 + 1 - (this.width << 12) - local342) / local342) > local1147) {
						local1147 = local489;
					}
					while (local1147 < 0) {
						@Pc(1216) int local1216 = this.pixels[(local378 >> 12) * this.width + (local1143 >> 12)];
						if (local1216 == 0) {
							local1135++;
						} else {
							Static6.anIntArray561[local1135++] = local1216;
						}
						local1143 += local342;
						local1147++;
					}
				}
				local1131++;
				local378 += local342;
				local319 += Static6.anInt5188;
			}
		} else if (local333 < 0) {
			@Pc(1246) int local1246 = local310;
			while (local1246 < 0) {
				@Pc(1250) int local1250 = local319;
				@Pc(1258) int local1258 = local368 + (local350 * local342 >> 4);
				@Pc(1266) int local1266 = local378 + (local350 * local333 >> 4);
				@Pc(1268) int local1268 = local303;
				if (local1258 < 0) {
					local489 = (local342 - local1258 - 1) / local342;
					local1268 = local303 + local489;
					local1258 += local342 * local489;
					local1266 += local333 * local489;
					local1250 = local319 + local489;
				}
				if ((local489 = (local1258 + 1 - (this.width << 12) - local342) / local342) > local1268) {
					local1268 = local489;
				}
				if ((local489 = local1266 - (this.height << 12)) >= 0) {
					local489 = (local333 - local489) / local333;
					local1268 += local489;
					local1258 += local342 * local489;
					local1266 += local333 * local489;
					local1250 += local489;
				}
				if ((local489 = (local1266 - local333) / local333) > local1268) {
					local1268 = local489;
				}
				while (local1268 < 0) {
					@Pc(1378) int local1378 = this.pixels[(local1266 >> 12) * this.width + (local1258 >> 12)];
					if (local1378 == 0) {
						local1250++;
					} else {
						Static6.anIntArray561[local1250++] = local1378;
					}
					local1258 += local342;
					local1266 += local333;
					local1268++;
				}
				local1246++;
				local368 -= local333;
				local378 += local342;
				local319 += Static6.anInt5188;
			}
		} else {
			@Pc(1414) int local1414 = local310;
			while (local1414 < 0) {
				@Pc(1418) int local1418 = local319;
				@Pc(1426) int local1426 = local368 + (local350 * local342 >> 4);
				@Pc(1434) int local1434 = local378 + (local350 * local333 >> 4);
				@Pc(1436) int local1436 = local303;
				if (local1426 < 0) {
					local489 = (local342 - local1426 - 1) / local342;
					local1436 = local303 + local489;
					local1426 += local342 * local489;
					local1434 += local333 * local489;
					local1418 = local319 + local489;
				}
				if ((local489 = (local1426 + 1 - (this.width << 12) - local342) / local342) > local1436) {
					local1436 = local489;
				}
				if (local1434 < 0) {
					local489 = (local333 - local1434 - 1) / local333;
					local1436 += local489;
					local1426 += local342 * local489;
					local1434 += local333 * local489;
					local1418 += local489;
				}
				if ((local489 = (local1434 + 1 - (this.height << 12) - local333) / local333) > local1436) {
					local1436 = local489;
				}
				while (local1436 < 0) {
					@Pc(1548) int local1548 = this.pixels[(local1434 >> 12) * this.width + (local1426 >> 12)];
					if (local1548 == 0) {
						local1418++;
					} else {
						Static6.anIntArray561[local1418++] = local1548;
					}
					local1426 += local342;
					local1434 += local333;
					local1436++;
				}
				local1414++;
				local368 -= local333;
				local378 += local342;
				local319 += Static6.anInt5188;
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V")
	public final void method2174(@OriginalArg(0) int arg0) {
		@Pc(6) int[] local6 = new int[this.width * this.height];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.height; local10++) {
			for (@Pc(16) int local16 = 0; local16 < this.width; local16++) {
				@Pc(25) int local25 = this.pixels[local8];
				if (local25 == 0) {
					if (local16 > 0 && this.pixels[local8 - 1] != 0) {
						local25 = arg0;
					} else if (local10 > 0 && this.pixels[local8 - this.width] != 0) {
						local25 = arg0;
					} else if (local16 < this.width - 1 && this.pixels[local8 + 1] != 0) {
						local25 = arg0;
					} else if (local10 < this.height - 1 && this.pixels[local8 + this.width] != 0) {
						local25 = arg0;
					}
				}
				local6[local8++] = local25;
			}
		}
		this.pixels = local6;
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "()V")
	public final void method2176() {
		if (this.width == this.anInt5602 && this.height == this.anInt5612) {
			return;
		}
		@Pc(17) int[] local17 = new int[this.anInt5602 * this.anInt5612];
		for (@Pc(19) int local19 = 0; local19 < this.height; local19++) {
			for (@Pc(25) int local25 = 0; local25 < this.width; local25++) {
				local17[(local19 + this.anInt5604) * this.anInt5602 + local25 + this.anInt5606] = this.pixels[local19 * this.width + local25];
			}
		}
		this.pixels = local17;
		this.width = this.anInt5602;
		this.height = this.anInt5612;
		this.anInt5606 = 0;
		this.anInt5604 = 0;
	}

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "(I)V")
	public final void method2177(@OriginalArg(0) int arg0) {
		if (this.width == this.anInt5602 && this.height == this.anInt5612) {
			return;
		}
		@Pc(12) int local12 = arg0;
		if (arg0 > this.anInt5606) {
			local12 = this.anInt5606;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 + this.anInt5606 + this.width > this.anInt5602) {
			local21 = this.anInt5602 - this.anInt5606 - this.width;
		}
		@Pc(42) int local42 = arg0;
		if (arg0 > this.anInt5604) {
			local42 = this.anInt5604;
		}
		@Pc(51) int local51 = arg0;
		if (arg0 + this.anInt5604 + this.height > this.anInt5612) {
			local51 = this.anInt5612 - this.anInt5604 - this.height;
		}
		@Pc(77) int local77 = this.width + local12 + local21;
		@Pc(84) int local84 = this.height + local42 + local51;
		@Pc(89) int[] local89 = new int[local77 * local84];
		for (@Pc(91) int local91 = 0; local91 < this.height; local91++) {
			for (@Pc(97) int local97 = 0; local97 < this.width; local97++) {
				local89[(local91 + local42) * local77 + local97 + local12] = this.pixels[local91 * this.width + local97];
			}
		}
		this.pixels = local89;
		this.width = local77;
		this.height = local84;
		this.anInt5606 -= local12;
		this.anInt5604 -= local42;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)V")
	@Override
	public void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 + this.anInt5606;
		@Pc(9) int local9 = arg1 + this.anInt5604;
		@Pc(15) int local15 = local4 + local9 * Static6.anInt5188;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.height;
		@Pc(23) int local23 = this.width;
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
			Static36.method2180(Static6.anIntArray561, this.pixels, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
	@Override
	public void method4506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 + this.anInt5606;
		@Pc(9) int local9 = arg1 + this.anInt5604;
		@Pc(15) int local15 = local4 + local9 * Static6.anInt5188;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.height;
		@Pc(23) int local23 = this.width;
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
			Static36.method2179(Static6.anIntArray561, this.pixels, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(7) int local7 = this.width;
		@Pc(10) int local10 = this.height;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.anInt5602;
		@Pc(20) int local20 = this.anInt5612;
		@Pc(26) int local26 = (local17 << 16) / arg2;
		@Pc(32) int local32 = (local20 << 16) / arg3;
		if (this.anInt5606 > 0) {
			@Pc(46) int local46 = ((this.anInt5606 << 16) + local26 - 1) / local26;
			arg0 += local46;
			local12 = local46 * local26 - (this.anInt5606 << 16);
		}
		if (this.anInt5604 > 0) {
			@Pc(75) int local75 = ((this.anInt5604 << 16) + local32 - 1) / local32;
			arg1 += local75;
			local14 = local75 * local32 - (this.anInt5604 << 16);
		}
		if (local7 < local17) {
			arg2 = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			arg3 = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		@Pc(126) int local126 = arg0 + arg1 * Static6.anInt5188;
		@Pc(130) int local130 = Static6.anInt5188 - arg2;
		if (arg1 + arg3 > Static6.anInt5187) {
			arg3 -= arg1 + arg3 - Static6.anInt5187;
		}
		if (arg1 < Static6.anInt5183) {
			@Pc(150) int local150 = Static6.anInt5183 - arg1;
			arg3 -= local150;
			local126 += local150 * Static6.anInt5188;
			local14 += local32 * local150;
		}
		if (arg0 + arg2 > Static6.anInt5186) {
			@Pc(177) int local177 = arg0 + arg2 - Static6.anInt5186;
			arg2 -= local177;
			local130 += local177;
		}
		if (arg0 < Static6.anInt5185) {
			@Pc(192) int local192 = Static6.anInt5185 - arg0;
			arg2 -= local192;
			local126 += local192;
			local12 += local26 * local192;
			local130 += local192;
		}
		Static36.method2181(Static6.anIntArray561, this.pixels, local12, local14, local126, local130, arg2, arg3, local26, local32, local7, arg4);
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)V")
	@Override
	public void method4511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 + this.anInt5602 - this.width - this.anInt5606;
		@Pc(15) int local15 = arg1 + this.anInt5604;
		@Pc(21) int local21 = local10 + local15 * Static6.anInt5188;
		@Pc(26) int local26 = this.width - 1;
		@Pc(29) int local29 = this.height;
		@Pc(32) int local32 = this.width;
		@Pc(36) int local36 = Static6.anInt5188 - local32;
		@Pc(40) int local40 = local32 + local32;
		if (local15 < Static6.anInt5183) {
			@Pc(47) int local47 = Static6.anInt5183 - local15;
			local29 -= local47;
			local15 = Static6.anInt5183;
			local26 += local47 * local32;
			local21 += local47 * Static6.anInt5188;
		}
		if (local15 + local29 > Static6.anInt5187) {
			local29 -= local15 + local29 - Static6.anInt5187;
		}
		if (local10 < Static6.anInt5185) {
			@Pc(85) int local85 = Static6.anInt5185 - local10;
			local32 -= local85;
			local10 = Static6.anInt5185;
			local26 -= local85;
			local21 += local85;
			local40 -= local85;
			local36 += local85;
		}
		if (local10 + local32 > Static6.anInt5186) {
			@Pc(118) int local118 = local10 + local32 - Static6.anInt5186;
			local32 -= local118;
			local40 -= local118;
			local36 += local118;
		}
		if (local32 > 0 && local29 > 0) {
			Static36.method2175(Static6.anIntArray561, this.pixels, local26, local21, local32, local29, local36, local40);
		}
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "()V")
	public final void makeTarget() {
		Static34.method4224(this.pixels, this.width, this.height);
	}
}

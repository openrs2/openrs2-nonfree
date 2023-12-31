import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class SoftwareAlphaSprite extends SoftwareSprite {

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(II)V")
	public SoftwareAlphaSprite(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		super(width, height);
	}

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIIIII[I)V")
	public SoftwareAlphaSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)V")
	@Override
	public void render(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		@Pc(4) int local4 = x + this.xOffset;
		@Pc(9) int local9 = y + this.yOffset;
		@Pc(15) int local15 = local4 + local9 * SoftwareRaster.width;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.height;
		@Pc(23) int local23 = this.width;
		@Pc(27) int local27 = SoftwareRaster.width - local23;
		@Pc(29) int local29 = 0;
		if (local9 < SoftwareRaster.clipY) {
			@Pc(36) int local36 = SoftwareRaster.clipY - local9;
			local20 -= local36;
			local9 = SoftwareRaster.clipY;
			local17 = local36 * local23;
			local15 += local36 * SoftwareRaster.width;
		}
		if (local9 + local20 > SoftwareRaster.clipHeight) {
			local20 -= local9 + local20 - SoftwareRaster.clipHeight;
		}
		if (local4 < SoftwareRaster.clipX) {
			@Pc(74) int local74 = SoftwareRaster.clipX - local4;
			local23 -= local74;
			local4 = SoftwareRaster.clipX;
			local17 += local74;
			local15 += local74;
			local29 = local74;
			local27 += local74;
		}
		if (local4 + local23 > SoftwareRaster.clipWidth) {
			@Pc(107) int local107 = local4 + local23 - SoftwareRaster.clipWidth;
			local23 -= local107;
			local29 += local107;
			local27 += local107;
		}
		if (local23 > 0 && local20 > 0) {
			Static21.method2182(SoftwareRaster.pixels, this.pixels, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(IIIIIIII[I[I)V")
	@Override
	public void renderRotatedTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(4) int local4 = -width / 2;
			@Pc(9) int local9 = -height / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			local18 = local18 * arg7 >> 8;
			local27 = local27 * arg7 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local18 + local4 * local27;
			@Pc(63) int local63 = (arg5 << 16) + local9 * local27 - local4 * local18;
			@Pc(69) int local69 = x + y * SoftwareRaster.width;
			for (@Pc(71) int local71 = 0; local71 < height; local71++) {
				@Pc(78) int local78 = arg8[local71];
				@Pc(82) int local82 = local69 + local78;
				@Pc(88) int local88 = local51 + local27 * local78;
				@Pc(94) int local94 = local63 - local18 * local78;
				for (@Pc(99) int local99 = -arg9[local71]; local99 < 0; local99++) {
					@Pc(115) int local115 = this.pixels[(local88 >> 16) + (local94 >> 16) * this.width];
					@Pc(119) int local119 = SoftwareRaster.pixels[local82];
					@Pc(123) int local123 = local115 >>> 24;
					@Pc(127) int local127 = 256 - local123;
					SoftwareRaster.pixels[local82++] = ((local115 & 0xFF00FF) * local123 + (local119 & 0xFF00FF) * local127 & 0xFF00FF00) + ((local115 & 0xFF00) * local123 + (local119 & 0xFF00) * local127 & 0xFF0000) >>> 8;
					local88 += local27;
					local94 -= local18;
				}
				local51 += local18;
				local63 += local27;
				local69 += SoftwareRaster.width;
			}
		} catch (@Pc(186) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V")
	@Override
	public void renderAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int alpha) {
		@Pc(4) int local4 = x + this.xOffset;
		@Pc(9) int local9 = y + this.yOffset;
		@Pc(15) int local15 = local4 + local9 * SoftwareRaster.width;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.height;
		@Pc(23) int local23 = this.width;
		@Pc(27) int local27 = SoftwareRaster.width - local23;
		@Pc(29) int local29 = 0;
		if (local9 < SoftwareRaster.clipY) {
			@Pc(36) int local36 = SoftwareRaster.clipY - local9;
			local20 -= local36;
			local9 = SoftwareRaster.clipY;
			local17 = local36 * local23;
			local15 += local36 * SoftwareRaster.width;
		}
		if (local9 + local20 > SoftwareRaster.clipHeight) {
			local20 -= local9 + local20 - SoftwareRaster.clipHeight;
		}
		if (local4 < SoftwareRaster.clipX) {
			@Pc(74) int local74 = SoftwareRaster.clipX - local4;
			local23 -= local74;
			local4 = SoftwareRaster.clipX;
			local17 += local74;
			local15 += local74;
			local29 = local74;
			local27 += local74;
		}
		if (local4 + local23 > SoftwareRaster.clipWidth) {
			@Pc(107) int local107 = local4 + local23 - SoftwareRaster.clipWidth;
			local23 -= local107;
			local29 += local107;
			local27 += local107;
		}
		if (local23 > 0 && local20 > 0) {
			Static22.method2186(SoftwareRaster.pixels, this.pixels, local17, local15, local23, local20, local27, local29, alpha);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIII)V")
	@Override
	public void renderResizedAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int alpha) {
		if (width <= 0 || height <= 0) {
			return;
		}
		@Pc(7) int local7 = this.width;
		@Pc(10) int local10 = this.height;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.innerWidth;
		@Pc(20) int local20 = this.innerHeight;
		@Pc(26) int local26 = (local17 << 16) / width;
		@Pc(32) int local32 = (local20 << 16) / height;
		if (this.xOffset > 0) {
			@Pc(46) int local46 = ((this.xOffset << 16) + local26 - 1) / local26;
			x += local46;
			local12 = local46 * local26 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			@Pc(75) int local75 = ((this.yOffset << 16) + local32 - 1) / local32;
			y += local75;
			local14 = local75 * local32 - (this.yOffset << 16);
		}
		if (local7 < local17) {
			width = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			height = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		@Pc(126) int local126 = x + y * SoftwareRaster.width;
		@Pc(130) int local130 = SoftwareRaster.width - width;
		if (y + height > SoftwareRaster.clipHeight) {
			height -= y + height - SoftwareRaster.clipHeight;
		}
		if (y < SoftwareRaster.clipY) {
			@Pc(150) int local150 = SoftwareRaster.clipY - y;
			height -= local150;
			local126 += local150 * SoftwareRaster.width;
			local14 += local32 * local150;
		}
		if (x + width > SoftwareRaster.clipWidth) {
			@Pc(177) int local177 = x + width - SoftwareRaster.clipWidth;
			width -= local177;
			local130 += local177;
		}
		if (x < SoftwareRaster.clipX) {
			@Pc(192) int local192 = SoftwareRaster.clipX - x;
			width -= local192;
			local126 += local192;
			local12 += local26 * local192;
			local130 += local192;
		}
		Static21.method2185(SoftwareRaster.pixels, this.pixels, local12, local14, local126, local130, width, height, local26, local32, local7, alpha);
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected void renderRotatedScaledTransparent(@OriginalArg(0) int pivotX, @OriginalArg(1) int pivotY, @OriginalArg(2) int x, @OriginalArg(3) int y, @OriginalArg(4) int angle, @OriginalArg(5) int scale) {
		if (scale == 0) {
			return;
		}
		pivotX -= this.xOffset << 4;
		pivotY -= this.yOffset << 4;
		@Pc(23) double local23 = (double) (angle & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(33) int local33 = (int) Math.floor(Math.sin(local23) * (double) scale + 0.5D);
		@Pc(43) int local43 = (int) Math.floor(Math.cos(local23) * (double) scale + 0.5D);
		@Pc(53) int local53 = -pivotX * local43 + -pivotY * local33;
		@Pc(64) int local64 = --pivotX * local33 + -pivotY * local43;
		@Pc(78) int local78 = ((this.width << 4) - pivotX) * local43 + -pivotY * local33;
		@Pc(93) int local93 = -((this.width << 4) - pivotX) * local33 + -pivotY * local43;
		@Pc(107) int local107 = -pivotX * local43 + ((this.height << 4) - pivotY) * local33;
		@Pc(122) int local122 = --pivotX * local33 + ((this.height << 4) - pivotY) * local43;
		@Pc(140) int local140 = ((this.width << 4) - pivotX) * local43 + ((this.height << 4) - pivotY) * local33;
		@Pc(159) int local159 = -((this.width << 4) - pivotX) * local33 + ((this.height << 4) - pivotY) * local43;
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
		local227 += x;
		local233 += x;
		local237 += y;
		local243 += y;
		@Pc(263) int local263 = local227 >> 4;
		@Pc(269) int local269 = local233 + 15 >> 4;
		@Pc(273) int local273 = local237 >> 4;
		@Pc(279) int local279 = local243 + 15 >> 4;
		if (local263 < SoftwareRaster.clipX) {
			local263 = SoftwareRaster.clipX;
		}
		if (local269 > SoftwareRaster.clipWidth) {
			local269 = SoftwareRaster.clipWidth;
		}
		if (local273 < SoftwareRaster.clipY) {
			local273 = SoftwareRaster.clipY;
		}
		if (local279 > SoftwareRaster.clipHeight) {
			local279 = SoftwareRaster.clipHeight;
		}
		@Pc(303) int local303 = local263 - local269;
		if (local303 >= 0) {
			return;
		}
		@Pc(310) int local310 = local273 - local279;
		if (local310 >= 0) {
			return;
		}
		@Pc(319) int local319 = local273 * SoftwareRaster.width + local263;
		@Pc(324) double local324 = 1.6777216E7D / (double) scale;
		@Pc(333) int local333 = (int) Math.floor(Math.sin(local23) * local324 + 0.5D);
		@Pc(342) int local342 = (int) Math.floor(Math.cos(local23) * local324 + 0.5D);
		@Pc(350) int local350 = (local263 << 4) + 8 - x;
		@Pc(358) int local358 = (local273 << 4) + 8 - y;
		@Pc(368) int local368 = (pivotX << 8) - (local358 * local333 >> 4);
		@Pc(378) int local378 = (pivotY << 8) + (local358 * local342 >> 4);
		@Pc(525) int local525;
		if (local342 == 0) {
			if (local333 == 0) {
				@Pc(384) int local384 = local310;
				while (local384 < 0) {
					@Pc(388) int local388 = local319;
					@Pc(394) int local394 = local303;
					if (local368 >= 0 && local378 >= 0 && local368 - (this.width << 12) < 0 && local378 - (this.height << 12) < 0) {
						while (local394 < 0) {
							@Pc(432) int local432 = this.pixels[(local378 >> 12) * this.width + (local368 >> 12)];
							@Pc(436) int local436 = SoftwareRaster.pixels[local388];
							@Pc(440) int local440 = local432 >>> 24;
							@Pc(444) int local444 = 256 - local440;
							SoftwareRaster.pixels[local388++] = ((local432 & 0xFF00FF) * local440 + (local436 & 0xFF00FF) * local444 & 0xFF00FF00) + ((local432 & 0xFF00) * local440 + (local436 & 0xFF00) * local444 & 0xFF0000) >>> 8;
							local394++;
						}
					}
					local384++;
					local319 += SoftwareRaster.width;
				}
			} else if (local333 < 0) {
				@Pc(490) int local490 = local310;
				while (local490 < 0) {
					@Pc(494) int local494 = local319;
					@Pc(504) int local504 = local378 + (local350 * local333 >> 4);
					@Pc(506) int local506 = local303;
					if (local368 >= 0 && local368 - (this.width << 12) < 0) {
						if ((local525 = local504 - (this.height << 12)) >= 0) {
							local525 = (local333 - local525) / local333;
							local506 = local303 + local525;
							local504 += local333 * local525;
							local494 = local319 + local525;
						}
						if ((local525 = (local504 - local333) / local333) > local506) {
							local506 = local525;
						}
						while (local506 < 0) {
							@Pc(573) int local573 = this.pixels[(local504 >> 12) * this.width + (local368 >> 12)];
							@Pc(577) int local577 = SoftwareRaster.pixels[local494];
							@Pc(581) int local581 = local573 >>> 24;
							@Pc(585) int local585 = 256 - local581;
							SoftwareRaster.pixels[local494++] = ((local573 & 0xFF00FF) * local581 + (local577 & 0xFF00FF) * local585 & 0xFF00FF00) + ((local573 & 0xFF00) * local581 + (local577 & 0xFF00) * local585 & 0xFF0000) >>> 8;
							local504 += local333;
							local506++;
						}
					}
					local490++;
					local368 -= local333;
					local319 += SoftwareRaster.width;
				}
			} else {
				@Pc(637) int local637 = local310;
				while (local637 < 0) {
					@Pc(641) int local641 = local319;
					@Pc(651) int local651 = local378 + (local350 * local333 >> 4);
					@Pc(653) int local653 = local303;
					if (local368 >= 0 && local368 - (this.width << 12) < 0) {
						if (local651 < 0) {
							local525 = (local333 - local651 - 1) / local333;
							local653 = local303 + local525;
							local651 += local333 * local525;
							local641 = local319 + local525;
						}
						if ((local525 = (local651 + 1 - (this.height << 12) - local333) / local333) > local653) {
							local653 = local525;
						}
						while (local653 < 0) {
							@Pc(722) int local722 = this.pixels[(local651 >> 12) * this.width + (local368 >> 12)];
							@Pc(726) int local726 = SoftwareRaster.pixels[local641];
							@Pc(730) int local730 = local722 >>> 24;
							@Pc(734) int local734 = 256 - local730;
							SoftwareRaster.pixels[local641++] = ((local722 & 0xFF00FF) * local730 + (local726 & 0xFF00FF) * local734 & 0xFF00FF00) + ((local722 & 0xFF00) * local730 + (local726 & 0xFF00) * local734 & 0xFF0000) >>> 8;
							local651 += local333;
							local653++;
						}
					}
					local637++;
					local368 -= local333;
					local319 += SoftwareRaster.width;
				}
			}
		} else if (local342 < 0) {
			if (local333 == 0) {
				@Pc(790) int local790 = local310;
				while (local790 < 0) {
					@Pc(794) int local794 = local319;
					@Pc(802) int local802 = local368 + (local350 * local342 >> 4);
					@Pc(806) int local806 = local303;
					if (local378 >= 0 && local378 - (this.height << 12) < 0) {
						if ((local525 = local802 - (this.width << 12)) >= 0) {
							local525 = (local342 - local525) / local342;
							local806 = local303 + local525;
							local802 += local342 * local525;
							local794 = local319 + local525;
						}
						if ((local525 = (local802 - local342) / local342) > local806) {
							local806 = local525;
						}
						while (local806 < 0) {
							@Pc(873) int local873 = this.pixels[(local378 >> 12) * this.width + (local802 >> 12)];
							@Pc(877) int local877 = SoftwareRaster.pixels[local794];
							@Pc(881) int local881 = local873 >>> 24;
							@Pc(885) int local885 = 256 - local881;
							SoftwareRaster.pixels[local794++] = ((local873 & 0xFF00FF) * local881 + (local877 & 0xFF00FF) * local885 & 0xFF00FF00) + ((local873 & 0xFF00) * local881 + (local877 & 0xFF00) * local885 & 0xFF0000) >>> 8;
							local802 += local342;
							local806++;
						}
					}
					local790++;
					local378 += local342;
					local319 += SoftwareRaster.width;
				}
			} else if (local333 < 0) {
				@Pc(939) int local939 = local310;
				while (local939 < 0) {
					@Pc(943) int local943 = local319;
					@Pc(951) int local951 = local368 + (local350 * local342 >> 4);
					@Pc(959) int local959 = local378 + (local350 * local333 >> 4);
					@Pc(961) int local961 = local303;
					if ((local525 = local951 - (this.width << 12)) >= 0) {
						local525 = (local342 - local525) / local342;
						local961 = local303 + local525;
						local951 += local342 * local525;
						local959 += local333 * local525;
						local943 = local319 + local525;
					}
					if ((local525 = (local951 - local342) / local342) > local961) {
						local961 = local525;
					}
					if ((local525 = local959 - (this.height << 12)) >= 0) {
						local525 = (local333 - local525) / local333;
						local961 += local525;
						local951 += local342 * local525;
						local959 += local333 * local525;
						local943 += local525;
					}
					if ((local525 = (local959 - local333) / local333) > local961) {
						local961 = local525;
					}
					while (local961 < 0) {
						@Pc(1069) int local1069 = this.pixels[(local959 >> 12) * this.width + (local951 >> 12)];
						@Pc(1073) int local1073 = SoftwareRaster.pixels[local943];
						@Pc(1077) int local1077 = local1069 >>> 24;
						@Pc(1081) int local1081 = 256 - local1077;
						SoftwareRaster.pixels[local943++] = ((local1069 & 0xFF00FF) * local1077 + (local1073 & 0xFF00FF) * local1081 & 0xFF00FF00) + ((local1069 & 0xFF00) * local1077 + (local1073 & 0xFF00) * local1081 & 0xFF0000) >>> 8;
						local951 += local342;
						local959 += local333;
						local961++;
					}
					local939++;
					local368 -= local333;
					local378 += local342;
					local319 += SoftwareRaster.width;
				}
			} else {
				@Pc(1141) int local1141 = local310;
				while (local1141 < 0) {
					@Pc(1145) int local1145 = local319;
					@Pc(1153) int local1153 = local368 + (local350 * local342 >> 4);
					@Pc(1161) int local1161 = local378 + (local350 * local333 >> 4);
					@Pc(1163) int local1163 = local303;
					if ((local525 = local1153 - (this.width << 12)) >= 0) {
						local525 = (local342 - local525) / local342;
						local1163 = local303 + local525;
						local1153 += local342 * local525;
						local1161 += local333 * local525;
						local1145 = local319 + local525;
					}
					if ((local525 = (local1153 - local342) / local342) > local1163) {
						local1163 = local525;
					}
					if (local1161 < 0) {
						local525 = (local333 - local1161 - 1) / local333;
						local1163 += local525;
						local1153 += local342 * local525;
						local1161 += local333 * local525;
						local1145 += local525;
					}
					if ((local525 = (local1161 + 1 - (this.height << 12) - local333) / local333) > local1163) {
						local1163 = local525;
					}
					while (local1163 < 0) {
						@Pc(1273) int local1273 = this.pixels[(local1161 >> 12) * this.width + (local1153 >> 12)];
						@Pc(1277) int local1277 = SoftwareRaster.pixels[local1145];
						@Pc(1281) int local1281 = local1273 >>> 24;
						@Pc(1285) int local1285 = 256 - local1281;
						SoftwareRaster.pixels[local1145++] = ((local1273 & 0xFF00FF) * local1281 + (local1277 & 0xFF00FF) * local1285 & 0xFF00FF00) + ((local1273 & 0xFF00) * local1281 + (local1277 & 0xFF00) * local1285 & 0xFF0000) >>> 8;
						local1153 += local342;
						local1161 += local333;
						local1163++;
					}
					local1141++;
					local368 -= local333;
					local378 += local342;
					local319 += SoftwareRaster.width;
				}
			}
		} else if (local333 == 0) {
			@Pc(1347) int local1347 = local310;
			while (local1347 < 0) {
				@Pc(1351) int local1351 = local319;
				@Pc(1359) int local1359 = local368 + (local350 * local342 >> 4);
				@Pc(1363) int local1363 = local303;
				if (local378 >= 0 && local378 - (this.height << 12) < 0) {
					if (local1359 < 0) {
						local525 = (local342 - local1359 - 1) / local342;
						local1363 = local303 + local525;
						local1359 += local342 * local525;
						local1351 = local319 + local525;
					}
					if ((local525 = (local1359 + 1 - (this.width << 12) - local342) / local342) > local1363) {
						local1363 = local525;
					}
					while (local1363 < 0) {
						@Pc(1432) int local1432 = this.pixels[(local378 >> 12) * this.width + (local1359 >> 12)];
						@Pc(1436) int local1436 = SoftwareRaster.pixels[local1351];
						@Pc(1440) int local1440 = local1432 >>> 24;
						@Pc(1444) int local1444 = 256 - local1440;
						SoftwareRaster.pixels[local1351++] = ((local1432 & 0xFF00FF) * local1440 + (local1436 & 0xFF00FF) * local1444 & 0xFF00FF00) + ((local1432 & 0xFF00) * local1440 + (local1436 & 0xFF00) * local1444 & 0xFF0000) >>> 8;
						local1359 += local342;
						local1363++;
					}
				}
				local1347++;
				local378 += local342;
				local319 += SoftwareRaster.width;
			}
		} else if (local333 < 0) {
			@Pc(1498) int local1498 = local310;
			while (local1498 < 0) {
				@Pc(1502) int local1502 = local319;
				@Pc(1510) int local1510 = local368 + (local350 * local342 >> 4);
				@Pc(1518) int local1518 = local378 + (local350 * local333 >> 4);
				@Pc(1520) int local1520 = local303;
				if (local1510 < 0) {
					local525 = (local342 - local1510 - 1) / local342;
					local1520 = local303 + local525;
					local1510 += local342 * local525;
					local1518 += local333 * local525;
					local1502 = local319 + local525;
				}
				if ((local525 = (local1510 + 1 - (this.width << 12) - local342) / local342) > local1520) {
					local1520 = local525;
				}
				if ((local525 = local1518 - (this.height << 12)) >= 0) {
					local525 = (local333 - local525) / local333;
					local1520 += local525;
					local1510 += local342 * local525;
					local1518 += local333 * local525;
					local1502 += local525;
				}
				if ((local525 = (local1518 - local333) / local333) > local1520) {
					local1520 = local525;
				}
				while (local1520 < 0) {
					@Pc(1630) int local1630 = this.pixels[(local1518 >> 12) * this.width + (local1510 >> 12)];
					@Pc(1634) int local1634 = SoftwareRaster.pixels[local1502];
					@Pc(1638) int local1638 = local1630 >>> 24;
					@Pc(1642) int local1642 = 256 - local1638;
					SoftwareRaster.pixels[local1502++] = ((local1630 & 0xFF00FF) * local1638 + (local1634 & 0xFF00FF) * local1642 & 0xFF00FF00) + ((local1630 & 0xFF00) * local1638 + (local1634 & 0xFF00) * local1642 & 0xFF0000) >>> 8;
					local1510 += local342;
					local1518 += local333;
					local1520++;
				}
				local1498++;
				local368 -= local333;
				local378 += local342;
				local319 += SoftwareRaster.width;
			}
		} else {
			@Pc(1702) int local1702 = local310;
			while (local1702 < 0) {
				@Pc(1706) int local1706 = local319;
				@Pc(1714) int local1714 = local368 + (local350 * local342 >> 4);
				@Pc(1722) int local1722 = local378 + (local350 * local333 >> 4);
				@Pc(1724) int local1724 = local303;
				if (local1714 < 0) {
					local525 = (local342 - local1714 - 1) / local342;
					local1724 = local303 + local525;
					local1714 += local342 * local525;
					local1722 += local333 * local525;
					local1706 = local319 + local525;
				}
				if ((local525 = (local1714 + 1 - (this.width << 12) - local342) / local342) > local1724) {
					local1724 = local525;
				}
				if (local1722 < 0) {
					local525 = (local333 - local1722 - 1) / local333;
					local1724 += local525;
					local1714 += local342 * local525;
					local1722 += local333 * local525;
					local1706 += local525;
				}
				if ((local525 = (local1722 + 1 - (this.height << 12) - local333) / local333) > local1724) {
					local1724 = local525;
				}
				while (local1724 < 0) {
					@Pc(1836) int local1836 = this.pixels[(local1722 >> 12) * this.width + (local1714 >> 12)];
					@Pc(1840) int local1840 = SoftwareRaster.pixels[local1706];
					@Pc(1844) int local1844 = local1836 >>> 24;
					@Pc(1848) int local1848 = 256 - local1844;
					SoftwareRaster.pixels[local1706++] = ((local1836 & 0xFF00FF) * local1844 + (local1840 & 0xFF00FF) * local1848 & 0xFF00FF00) + ((local1836 & 0xFF00) * local1844 + (local1840 & 0xFF00) * local1848 & 0xFF0000) >>> 8;
					local1714 += local342;
					local1722 += local333;
					local1724++;
				}
				local1702++;
				local368 -= local333;
				local378 += local342;
				local319 += SoftwareRaster.width;
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIIII[I[I)V")
	@Override
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
			@Pc(69) int local69 = arg0 + arg1 * SoftwareRaster.width;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(78) int local78 = arg7[local71];
				@Pc(82) int local82 = local69 + local78;
				@Pc(88) int local88 = local51 + local27 * local78;
				@Pc(94) int local94 = local63 - local18 * local78;
				for (@Pc(99) int local99 = -arg8[local71]; local99 < 0; local99++) {
					@Pc(115) int local115 = this.pixels[(local88 >> 16) + (local94 >> 16) * this.width];
					@Pc(119) int local119 = SoftwareRaster.pixels[local82];
					@Pc(123) int local123 = local115 >>> 24;
					@Pc(127) int local127 = 256 - local123;
					SoftwareRaster.pixels[local82++] = ((local115 & 0xFF00FF) * local123 + (local119 & 0xFF00FF) * local127 & 0xFF00FF00) + ((local115 & 0xFF00) * local123 + (local119 & 0xFF00) * local127 & 0xFF0000) >>> 8;
					local88 += local27;
					local94 -= local18;
				}
				local51 += local18;
				local63 += local27;
				local69 += SoftwareRaster.width;
			}
		} catch (@Pc(186) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "()[I")
	@Override
	public int[] getPixels() {
		return this.pixels;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V")
	@Override
	public void renderResizedTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height) {
		if (width <= 0 || height <= 0) {
			return;
		}
		@Pc(7) int local7 = this.width;
		@Pc(10) int local10 = this.height;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.innerWidth;
		@Pc(20) int local20 = this.innerHeight;
		@Pc(26) int local26 = (local17 << 16) / width;
		@Pc(32) int local32 = (local20 << 16) / height;
		if (this.xOffset > 0) {
			@Pc(46) int local46 = ((this.xOffset << 16) + local26 - 1) / local26;
			x += local46;
			local12 = local46 * local26 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			@Pc(75) int local75 = ((this.yOffset << 16) + local32 - 1) / local32;
			y += local75;
			local14 = local75 * local32 - (this.yOffset << 16);
		}
		if (local7 < local17) {
			width = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			height = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		@Pc(126) int local126 = x + y * SoftwareRaster.width;
		@Pc(130) int local130 = SoftwareRaster.width - width;
		if (y + height > SoftwareRaster.clipHeight) {
			height -= y + height - SoftwareRaster.clipHeight;
		}
		if (y < SoftwareRaster.clipY) {
			@Pc(150) int local150 = SoftwareRaster.clipY - y;
			height -= local150;
			local126 += local150 * SoftwareRaster.width;
			local14 += local32 * local150;
		}
		if (x + width > SoftwareRaster.clipWidth) {
			@Pc(177) int local177 = x + width - SoftwareRaster.clipWidth;
			width -= local177;
			local130 += local177;
		}
		if (x < SoftwareRaster.clipX) {
			@Pc(192) int local192 = SoftwareRaster.clipX - x;
			width -= local192;
			local126 += local192;
			local12 += local26 * local192;
			local130 += local192;
		}
		Static21.method2184(SoftwareRaster.pixels, this.pixels, local12, local14, local126, local130, width, height, local26, local32, local7);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIIDI)V")
	@Override
	public void renderRotatedTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(6) double angle) {
		try {
			@Pc(15) int local15 = (int) (Math.sin(angle) * 65536.0D);
			@Pc(21) int local21 = (int) (Math.cos(angle) * 65536.0D);
			local15 = local15 * 256 >> 8;
			local21 = local21 * 256 >> 8;
			@Pc(45) int local45 = local15 * -10 + local21 * -10 + 983040;
			@Pc(57) int local57 = local21 * -10 + 983040 - local15 * -10;
			@Pc(63) int local63 = x + y * SoftwareRaster.width;
			for (@Pc(65) int local65 = 0; local65 < 20; local65++) {
				@Pc(70) int local70 = local63;
				@Pc(72) int local72 = local45;
				@Pc(74) int local74 = local57;
				for (@Pc(77) int local77 = -20; local77 < 0; local77++) {
					@Pc(93) int local93 = this.pixels[(local72 >> 16) + (local74 >> 16) * this.width];
					@Pc(97) int local97 = SoftwareRaster.pixels[local70];
					@Pc(101) int local101 = local93 >>> 24;
					@Pc(105) int local105 = 256 - local101;
					SoftwareRaster.pixels[local70++] = ((local93 & 0xFF00FF) * local101 + (local97 & 0xFF00FF) * local105 & 0xFF00FF00) + ((local93 & 0xFF00) * local101 + (local97 & 0xFF00) * local105 & 0xFF0000) >>> 8;
					local72 += local21;
					local74 -= local15;
				}
				local45 += local15;
				local57 += local21;
				local63 += SoftwareRaster.width;
			}
		} catch (@Pc(164) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)V")
	@Override
	public void renderHorizontalFlipTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		@Pc(10) int local10 = x + this.innerWidth - this.width - this.xOffset;
		@Pc(15) int local15 = y + this.yOffset;
		@Pc(21) int local21 = local10 + local15 * SoftwareRaster.width;
		@Pc(26) int local26 = this.width - 1;
		@Pc(29) int local29 = this.height;
		@Pc(32) int local32 = this.width;
		@Pc(36) int local36 = SoftwareRaster.width - local32;
		@Pc(40) int local40 = local32 + local32;
		if (local15 < SoftwareRaster.clipY) {
			@Pc(47) int local47 = SoftwareRaster.clipY - local15;
			local29 -= local47;
			local15 = SoftwareRaster.clipY;
			local26 += local47 * local32;
			local21 += local47 * SoftwareRaster.width;
		}
		if (local15 + local29 > SoftwareRaster.clipHeight) {
			local29 -= local15 + local29 - SoftwareRaster.clipHeight;
		}
		if (local10 < SoftwareRaster.clipX) {
			@Pc(85) int local85 = SoftwareRaster.clipX - local10;
			local32 -= local85;
			local10 = SoftwareRaster.clipX;
			local26 -= local85;
			local21 += local85;
			local40 -= local85;
			local36 += local85;
		}
		if (local10 + local32 > SoftwareRaster.clipWidth) {
			@Pc(118) int local118 = local10 + local32 - SoftwareRaster.clipWidth;
			local32 -= local118;
			local40 -= local118;
			local36 += local118;
		}
		if (local32 > 0 && local29 > 0) {
			Static21.method2183(SoftwareRaster.pixels, this.pixels, local26, local21, local32, local29, local36, local40);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	@Override
	public void renderTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		@Pc(4) int local4 = x + this.xOffset;
		@Pc(9) int local9 = y + this.yOffset;
		@Pc(15) int local15 = local4 + local9 * SoftwareRaster.width;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.height;
		@Pc(23) int local23 = this.width;
		@Pc(27) int local27 = SoftwareRaster.width - local23;
		@Pc(29) int local29 = 0;
		if (local9 < SoftwareRaster.clipY) {
			@Pc(36) int local36 = SoftwareRaster.clipY - local9;
			local20 -= local36;
			local9 = SoftwareRaster.clipY;
			local17 = local36 * local23;
			local15 += local36 * SoftwareRaster.width;
		}
		if (local9 + local20 > SoftwareRaster.clipHeight) {
			local20 -= local9 + local20 - SoftwareRaster.clipHeight;
		}
		if (local4 < SoftwareRaster.clipX) {
			@Pc(74) int local74 = SoftwareRaster.clipX - local4;
			local23 -= local74;
			local4 = SoftwareRaster.clipX;
			local17 += local74;
			local15 += local74;
			local29 = local74;
			local27 += local74;
		}
		if (local4 + local23 > SoftwareRaster.clipWidth) {
			@Pc(107) int local107 = local4 + local23 - SoftwareRaster.clipWidth;
			local23 -= local107;
			local29 += local107;
			local27 += local107;
		}
		if (local23 > 0 && local20 > 0) {
			Static21.method2182(SoftwareRaster.pixels, this.pixels, local17, local15, local23, local20, local27, local29);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class SoftwareIndexedSprite extends IndexedSprite {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([I[B[IIIIIIII)V")
	private static void method1310(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(16) int local16 = local4; local16 < 0; local16++) {
				@Pc(21) int local21 = arg3 + 1;
				@Pc(23) byte local23 = arg1[arg3];
				@Pc(28) int local28;
				if (local23 == 0) {
					local28 = arg4 + 1;
				} else {
					local28 = arg4 + 1;
					arg0[arg4] = arg2[local23 & 0xFF];
				}
				@Pc(39) int local39 = local21 + 1;
				@Pc(41) byte local41 = arg1[local21];
				@Pc(46) int local46;
				if (local41 == 0) {
					local46 = local28 + 1;
				} else {
					local46 = local28 + 1;
					arg0[local28] = arg2[local41 & 0xFF];
				}
				@Pc(57) int local57 = local39 + 1;
				@Pc(59) byte local59 = arg1[local39];
				@Pc(64) int local64;
				if (local59 == 0) {
					local64 = local46 + 1;
				} else {
					local64 = local46 + 1;
					arg0[local46] = arg2[local59 & 0xFF];
				}
				arg3 = local57 + 1;
				@Pc(77) byte local77 = arg1[local57];
				if (local77 == 0) {
					arg4 = local64 + 1;
				} else {
					arg4 = local64 + 1;
					arg0[local64] = arg2[local77 & 0xFF];
				}
			}
			for (@Pc(94) int local94 = arg5; local94 < 0; local94++) {
				@Pc(101) byte local101 = arg1[arg3++];
				if (local101 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local101 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
	private static void method1317(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(1) int local1 = arg3;
		for (@Pc(4) int local4 = -arg8; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg4 >> 16) * arg11;
			for (@Pc(15) int local15 = -arg7; local15 < 0; local15++) {
				@Pc(25) byte local25 = arg1[(arg3 >> 16) + local12];
				if (local25 == 0) {
					arg5++;
				} else {
					arg0[arg5++] = arg2[local25 & 0xFF];
				}
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = local1;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([I[B[IIIIIIIIIII)V")
	private static void method1318(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(1) int local1 = arg3;
		@Pc(7) int local7 = arg12 >> 16 & 0xFF;
		@Pc(13) int local13 = arg12 >> 8 & 0xFF;
		@Pc(17) int local17 = arg12 & 0xFF;
		for (@Pc(20) int local20 = -arg8; local20 < 0; local20++) {
			@Pc(28) int local28 = (arg4 >> 16) * arg11;
			for (@Pc(31) int local31 = -arg7; local31 < 0; local31++) {
				@Pc(41) byte local41 = arg1[(arg3 >> 16) + local28];
				if (local41 == 0) {
					arg5++;
				} else {
					@Pc(49) int local49 = arg2[local41 & 0xFF];
					@Pc(55) int local55 = local49 >> 16 & 0xFF;
					@Pc(61) int local61 = local49 >> 8 & 0xFF;
					@Pc(65) int local65 = local49 & 0xFF;
					arg0[arg5++] = (local55 * local7 >> 8 << 16) + (local61 * local13 >> 8 << 8) + (local65 * local17 >> 8);
				}
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = local1;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "([I[B[IIIIIIII)V")
	private static void method1319(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) int local3 = 256 - arg9;
		for (@Pc(6) int local6 = -arg6; local6 < 0; local6++) {
			for (@Pc(11) int local11 = -arg5; local11 < 0; local11++) {
				@Pc(18) byte local18 = arg1[arg3++];
				if (local18 == 0) {
					arg4++;
				} else {
					@Pc(26) int local26 = arg2[local18 & 0xFF];
					@Pc(30) int local30 = arg0[arg4];
					arg0[arg4++] = ((local26 & 0xFF00FF) * arg9 + (local30 & 0xFF00FF) * local3 & 0xFF00FF00) + ((local26 & 0xFF00) * arg9 + (local30 & 0xFF00) * local3 & 0xFF0000) >> 8;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "[B")
	public byte[] pixels;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "[I")
	public final int[] palette;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public SoftwareIndexedSprite(@OriginalArg(0) int innerWidth, @OriginalArg(1) int innerHeight, @OriginalArg(2) int xOffset, @OriginalArg(3) int yOffset, @OriginalArg(4) int width, @OriginalArg(5) int height, @OriginalArg(6) byte[] pixels, @OriginalArg(7) int[] palette) {
		this.innerWidth = innerWidth;
		this.innerHeight = innerHeight;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
		this.width = width;
		this.height = height;
		this.pixels = pixels;
		this.palette = palette;
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(III)V")
	public SoftwareIndexedSprite(@OriginalArg(0) int width, @OriginalArg(1) int height, @OriginalArg(2) int paletteSize) {
		this.innerWidth = this.width = width;
		this.innerHeight = this.height = height;
		this.xOffset = this.yOffset = 0;
		this.pixels = new byte[width * height];
		this.palette = new int[paletteSize];
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
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
			method1319(SoftwareRaster.pixels, this.pixels, this.palette, local17, local15, local23, local20, local27, local29, alpha);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	public void clear() {
		@Pc(1) int off = 0;
		@Pc(7) int len = this.pixels.length - 7;
		while (off < len) {
			@Pc(14) int off2 = off + 1;
			this.pixels[off] = 0;
			this.pixels[off2++] = 0;
			this.pixels[off2++] = 0;
			this.pixels[off2++] = 0;
			this.pixels[off2++] = 0;
			this.pixels[off2++] = 0;
			this.pixels[off2++] = 0;
			off = off2 + 1;
			this.pixels[off2] = 0;
		}
		@Pc(60) int len2 = len + 7;
		while (off < len2) {
			this.pixels[off++] = 0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
	public void adjustPalette(@OriginalArg(0) int redDelta, @OriginalArg(1) int greenDelta, @OriginalArg(2) int blueDelta) {
		for (@Pc(1) int i = 0; i < this.palette.length; i++) {
			@Pc(15) int red = this.palette[i] >> 16 & 0xFF;
			@Pc(19) int red2 = red + redDelta;
			if (red2 < 0) {
				red2 = 0;
			} else if (red2 > 255) {
				red2 = 255;
			}
			@Pc(38) int green = this.palette[i] >> 8 & 0xFF;
			@Pc(42) int green2 = green + greenDelta;
			if (green2 < 0) {
				green2 = 0;
			} else if (green2 > 255) {
				green2 = 255;
			}
			@Pc(59) int blue = this.palette[i] & 0xFF;
			@Pc(63) int blue2 = blue + blueDelta;
			if (blue2 < 0) {
				blue2 = 0;
			} else if (blue2 > 255) {
				blue2 = 255;
			}
			this.palette[i] = (red2 << 16) + (green2 << 8) + blue2;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
	public void flipVertical() {
		@Pc(6) byte[] pixels = new byte[this.width * this.height];
		@Pc(8) int i = 0;
		for (@Pc(13) int y = this.height - 1; y >= 0; y--) {
			for (@Pc(17) int x = 0; x < this.width; x++) {
				pixels[i++] = this.pixels[x + y * this.width];
			}
		}
		this.pixels = pixels;
		this.yOffset = this.innerHeight - this.height - this.yOffset;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()V")
	public void rotateClockwise() {
		@Pc(6) byte[] pixels = new byte[this.width * this.height];
		@Pc(8) int i = 0;
		for (@Pc(10) int x = 0; x < this.width; x++) {
			for (@Pc(19) int y = this.height - 1; y >= 0; y--) {
				pixels[i++] = this.pixels[x + y * this.width];
			}
		}
		this.pixels = pixels;
		@Pc(44) int temp = this.yOffset;
		this.yOffset = this.xOffset;
		this.xOffset = this.innerHeight - this.height - temp;
		temp = this.height;
		this.height = this.width;
		this.width = temp;
		temp = this.innerHeight;
		this.innerHeight = this.innerWidth;
		this.innerWidth = temp;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)V")
	public void method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0 -= this.xOffset << 4;
		arg1 -= this.yOffset << 4;
		@Pc(23) double local23 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(33) int local33 = (int) Math.floor(Math.sin(local23) * (double) 4096 + 0.5D);
		@Pc(43) int local43 = (int) Math.floor(Math.cos(local23) * (double) 4096 + 0.5D);
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
					if (local368 >= 0 && local378 >= 0 && local368 - (this.width << 12) < 0 && local378 - (this.height << 12) < 0) {
						while (local394 < 0) {
							@Pc(435) int local435 = this.palette[this.pixels[(local378 >> 12) * this.width + (local368 >> 12)]];
							if (local435 == 0) {
								local388++;
							} else {
								SoftwareRaster.pixels[local388++] = local435;
							}
							local394++;
						}
					}
					local384++;
					local319 += SoftwareRaster.width;
				}
			} else if (local333 < 0) {
				@Pc(457) int local457 = local310;
				while (local457 < 0) {
					@Pc(461) int local461 = local319;
					@Pc(471) int local471 = local378 + (local350 * local333 >> 4);
					@Pc(473) int local473 = local303;
					if (local368 >= 0 && local368 - (this.width << 12) < 0) {
						if ((local492 = local471 - (this.height << 12)) >= 0) {
							local492 = (local333 - local492) / local333;
							local473 = local303 + local492;
							local471 += local333 * local492;
							local461 = local319 + local492;
						}
						if ((local492 = (local471 - local333) / local333) > local473) {
							local473 = local492;
						}
						while (local473 < 0) {
							@Pc(543) int local543 = this.palette[this.pixels[(local471 >> 12) * this.width + (local368 >> 12)]];
							if (local543 == 0) {
								local461++;
							} else {
								SoftwareRaster.pixels[local461++] = local543;
							}
							local471 += local333;
							local473++;
						}
					}
					local457++;
					local368 -= local333;
					local319 += SoftwareRaster.width;
				}
			} else {
				@Pc(571) int local571 = local310;
				while (local571 < 0) {
					@Pc(575) int local575 = local319;
					@Pc(585) int local585 = local378 + (local350 * local333 >> 4);
					@Pc(587) int local587 = local303;
					if (local368 >= 0 && local368 - (this.width << 12) < 0) {
						if (local585 < 0) {
							local492 = (local333 - local585 - 1) / local333;
							local587 = local303 + local492;
							local585 += local333 * local492;
							local575 = local319 + local492;
						}
						if ((local492 = (local585 + 1 - (this.height << 12) - local333) / local333) > local587) {
							local587 = local492;
						}
						while (local587 < 0) {
							@Pc(659) int local659 = this.palette[this.pixels[(local585 >> 12) * this.width + (local368 >> 12)]];
							if (local659 == 0) {
								local575++;
							} else {
								SoftwareRaster.pixels[local575++] = local659;
							}
							local585 += local333;
							local587++;
						}
					}
					local571++;
					local368 -= local333;
					local319 += SoftwareRaster.width;
				}
			}
		} else if (local342 < 0) {
			if (local333 == 0) {
				@Pc(691) int local691 = local310;
				while (local691 < 0) {
					@Pc(695) int local695 = local319;
					@Pc(703) int local703 = local368 + (local350 * local342 >> 4);
					@Pc(707) int local707 = local303;
					if (local378 >= 0 && local378 - (this.height << 12) < 0) {
						if ((local492 = local703 - (this.width << 12)) >= 0) {
							local492 = (local342 - local492) / local342;
							local707 = local303 + local492;
							local703 += local342 * local492;
							local695 = local319 + local492;
						}
						if ((local492 = (local703 - local342) / local342) > local707) {
							local707 = local492;
						}
						while (local707 < 0) {
							@Pc(777) int local777 = this.palette[this.pixels[(local378 >> 12) * this.width + (local703 >> 12)]];
							if (local777 == 0) {
								local695++;
							} else {
								SoftwareRaster.pixels[local695++] = local777;
							}
							local703 += local342;
							local707++;
						}
					}
					local691++;
					local378 += local342;
					local319 += SoftwareRaster.width;
				}
			} else if (local333 < 0) {
				@Pc(807) int local807 = local310;
				while (local807 < 0) {
					@Pc(811) int local811 = local319;
					@Pc(819) int local819 = local368 + (local350 * local342 >> 4);
					@Pc(827) int local827 = local378 + (local350 * local333 >> 4);
					@Pc(829) int local829 = local303;
					if ((local492 = local819 - (this.width << 12)) >= 0) {
						local492 = (local342 - local492) / local342;
						local829 = local303 + local492;
						local819 += local342 * local492;
						local827 += local333 * local492;
						local811 = local319 + local492;
					}
					if ((local492 = (local819 - local342) / local342) > local829) {
						local829 = local492;
					}
					if ((local492 = local827 - (this.height << 12)) >= 0) {
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
						@Pc(940) int local940 = this.palette[this.pixels[(local827 >> 12) * this.width + (local819 >> 12)]];
						if (local940 == 0) {
							local811++;
						} else {
							SoftwareRaster.pixels[local811++] = local940;
						}
						local819 += local342;
						local827 += local333;
						local829++;
					}
					local807++;
					local368 -= local333;
					local378 += local342;
					local319 += SoftwareRaster.width;
				}
			} else {
				@Pc(976) int local976 = local310;
				while (local976 < 0) {
					@Pc(980) int local980 = local319;
					@Pc(988) int local988 = local368 + (local350 * local342 >> 4);
					@Pc(996) int local996 = local378 + (local350 * local333 >> 4);
					@Pc(998) int local998 = local303;
					if ((local492 = local988 - (this.width << 12)) >= 0) {
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
					if ((local492 = (local996 + 1 - (this.height << 12) - local333) / local333) > local998) {
						local998 = local492;
					}
					while (local998 < 0) {
						@Pc(1111) int local1111 = this.palette[this.pixels[(local996 >> 12) * this.width + (local988 >> 12)]];
						if (local1111 == 0) {
							local980++;
						} else {
							SoftwareRaster.pixels[local980++] = local1111;
						}
						local988 += local342;
						local996 += local333;
						local998++;
					}
					local976++;
					local368 -= local333;
					local378 += local342;
					local319 += SoftwareRaster.width;
				}
			}
		} else if (local333 == 0) {
			@Pc(1149) int local1149 = local310;
			while (local1149 < 0) {
				@Pc(1153) int local1153 = local319;
				@Pc(1161) int local1161 = local368 + (local350 * local342 >> 4);
				@Pc(1165) int local1165 = local303;
				if (local378 >= 0 && local378 - (this.height << 12) < 0) {
					if (local1161 < 0) {
						local492 = (local342 - local1161 - 1) / local342;
						local1165 = local303 + local492;
						local1161 += local342 * local492;
						local1153 = local319 + local492;
					}
					if ((local492 = (local1161 + 1 - (this.width << 12) - local342) / local342) > local1165) {
						local1165 = local492;
					}
					while (local1165 < 0) {
						@Pc(1237) int local1237 = this.palette[this.pixels[(local378 >> 12) * this.width + (local1161 >> 12)]];
						if (local1237 == 0) {
							local1153++;
						} else {
							SoftwareRaster.pixels[local1153++] = local1237;
						}
						local1161 += local342;
						local1165++;
					}
				}
				local1149++;
				local378 += local342;
				local319 += SoftwareRaster.width;
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
				if ((local492 = (local1279 + 1 - (this.width << 12) - local342) / local342) > local1289) {
					local1289 = local492;
				}
				if ((local492 = local1287 - (this.height << 12)) >= 0) {
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
					@Pc(1402) int local1402 = this.palette[this.pixels[(local1287 >> 12) * this.width + (local1279 >> 12)]];
					if (local1402 == 0) {
						local1271++;
					} else {
						SoftwareRaster.pixels[local1271++] = local1402;
					}
					local1279 += local342;
					local1287 += local333;
					local1289++;
				}
				local1267++;
				local368 -= local333;
				local378 += local342;
				local319 += SoftwareRaster.width;
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
				if ((local492 = (local1450 + 1 - (this.width << 12) - local342) / local342) > local1460) {
					local1460 = local492;
				}
				if (local1458 < 0) {
					local492 = (local333 - local1458 - 1) / local333;
					local1460 += local492;
					local1450 += local342 * local492;
					local1458 += local333 * local492;
					local1442 += local492;
				}
				if ((local492 = (local1458 + 1 - (this.height << 12) - local333) / local333) > local1460) {
					local1460 = local492;
				}
				while (local1460 < 0) {
					@Pc(1575) int local1575 = this.palette[this.pixels[(local1458 >> 12) * this.width + (local1450 >> 12)]];
					if (local1575 == 0) {
						local1442++;
					} else {
						SoftwareRaster.pixels[local1442++] = local1575;
					}
					local1450 += local342;
					local1458 += local333;
					local1460++;
				}
				local1438++;
				local368 -= local333;
				local378 += local342;
				local319 += SoftwareRaster.width;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
	public void method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.width;
		@Pc(5) int local5 = this.height;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.innerWidth;
		@Pc(15) int local15 = this.innerHeight;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		if (this.xOffset > 0) {
			@Pc(41) int local41 = ((this.xOffset << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			@Pc(70) int local70 = ((this.yOffset << 16) + local27 - 1) / local27;
			arg1 += local70;
			local9 = local70 * local27 - (this.yOffset << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		@Pc(121) int local121 = arg0 + arg1 * SoftwareRaster.width;
		@Pc(125) int local125 = SoftwareRaster.width - arg2;
		if (arg1 + arg3 > SoftwareRaster.clipHeight) {
			arg3 -= arg1 + arg3 - SoftwareRaster.clipHeight;
		}
		if (arg1 < SoftwareRaster.clipY) {
			@Pc(145) int local145 = SoftwareRaster.clipY - arg1;
			arg3 -= local145;
			local121 += local145 * SoftwareRaster.width;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > SoftwareRaster.clipWidth) {
			@Pc(172) int local172 = arg0 + arg2 - SoftwareRaster.clipWidth;
			arg2 -= local172;
			local125 += local172;
		}
		if (arg0 < SoftwareRaster.clipX) {
			@Pc(187) int local187 = SoftwareRaster.clipX - arg0;
			arg2 -= local187;
			local121 += local187;
			local7 += local21 * local187;
			local125 += local187;
		}
		method1317(SoftwareRaster.pixels, this.pixels, this.palette, local7, local9, local121, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)V")
	public void method1316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = this.width;
		@Pc(5) int local5 = this.height;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.innerWidth;
		@Pc(15) int local15 = this.innerHeight;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		if (this.xOffset > 0) {
			@Pc(41) int local41 = ((this.xOffset << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			@Pc(70) int local70 = ((this.yOffset << 16) + local27 - 1) / local27;
			arg1 += local70;
			local9 = local70 * local27 - (this.yOffset << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		@Pc(121) int local121 = arg0 + arg1 * SoftwareRaster.width;
		@Pc(125) int local125 = SoftwareRaster.width - arg2;
		if (arg1 + arg3 > SoftwareRaster.clipHeight) {
			arg3 -= arg1 + arg3 - SoftwareRaster.clipHeight;
		}
		if (arg1 < SoftwareRaster.clipY) {
			@Pc(145) int local145 = SoftwareRaster.clipY - arg1;
			arg3 -= local145;
			local121 += local145 * SoftwareRaster.width;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > SoftwareRaster.clipWidth) {
			@Pc(172) int local172 = arg0 + arg2 - SoftwareRaster.clipWidth;
			arg2 -= local172;
			local125 += local172;
		}
		if (arg0 < SoftwareRaster.clipX) {
			@Pc(187) int local187 = SoftwareRaster.clipX - arg0;
			arg2 -= local187;
			local121 += local187;
			local7 += local21 * local187;
			local125 += local187;
		}
		method1318(SoftwareRaster.pixels, this.pixels, this.palette, local7, local9, local121, local125, arg2, arg3, local21, local27, local2, arg4);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
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
			method1310(SoftwareRaster.pixels, this.pixels, this.palette, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
	public void method1320() {
		if (this.width == this.innerWidth && this.height == this.innerHeight) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.innerWidth * this.innerHeight];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.height; local21++) {
			for (@Pc(27) int local27 = 0; local27 < this.width; local27++) {
				local17[local27 + this.xOffset + (local21 + this.yOffset) * this.innerWidth] = this.pixels[local19++];
			}
		}
		this.pixels = local17;
		this.width = this.innerWidth;
		this.height = this.innerHeight;
		this.xOffset = 0;
		this.yOffset = 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[I[I)V")
	public void renderTransparentMasked(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int[] maskXs, @OriginalArg(3) int[] maskWidths) {
		if (SoftwareRaster.clipHeight - SoftwareRaster.clipY != maskXs.length) {
			throw new IllegalStateException();
		}
		@Pc(14) int local14 = x + this.xOffset;
		@Pc(19) int local19 = y + this.yOffset;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = this.height;
		@Pc(27) int local27 = this.width;
		@Pc(31) int local31 = SoftwareRaster.width - local27;
		@Pc(33) int local33 = 0;
		@Pc(39) int local39 = local14 + local19 * SoftwareRaster.width;
		if (local19 < SoftwareRaster.clipY) {
			@Pc(46) int local46 = SoftwareRaster.clipY - local19;
			local24 -= local46;
			local19 = SoftwareRaster.clipY;
			local21 = local46 * local27;
			local39 += local46 * SoftwareRaster.width;
		}
		if (local19 + local24 > SoftwareRaster.clipHeight) {
			local24 -= local19 + local24 - SoftwareRaster.clipHeight;
		}
		if (local14 < SoftwareRaster.clipX) {
			@Pc(84) int local84 = SoftwareRaster.clipX - local14;
			local27 -= local84;
			local14 = SoftwareRaster.clipX;
			local21 += local84;
			local39 += local84;
			local33 = local84;
			local31 += local84;
		}
		if (local14 + local27 > SoftwareRaster.clipWidth) {
			@Pc(117) int local117 = local14 + local27 - SoftwareRaster.clipWidth;
			local27 -= local117;
			local33 += local117;
			local31 += local117;
		}
		if (local27 <= 0 || local24 <= 0) {
			return;
		}
		@Pc(138) int local138 = local14 - SoftwareRaster.clipX;
		@Pc(142) int local142 = local19 - SoftwareRaster.clipY;
		for (@Pc(144) int local144 = local142; local144 < local142 + local24; local144++) {
			@Pc(153) int local153 = maskXs[local144];
			@Pc(157) int local157 = maskWidths[local144];
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
				@Pc(245) int local245 = this.palette[this.pixels[local21++]];
				if (local245 == 0) {
					local39++;
				} else {
					SoftwareRaster.pixels[local39++] = local245;
				}
			}
			local21 += local221 + local33;
			local39 += local221 + local31;
		}
	}
}

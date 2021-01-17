import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class SoftwareRaster {
	@OriginalMember(owner = "client!tk", name = "g", descriptor = "[I")
	public static int[] pixels;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
	public static int width;

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
	public static int height;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
	public static int clipX = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public static int clipY = 0;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
	public static int clipWidth = 0;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
	public static int clipHeight = 0;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "[I")
	public static int[] maskXs;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "[I")
	public static int[] maskWidths;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([III)V")
	public static void setPixels(@OriginalArg(0) int[] pixels, @OriginalArg(1) int width, @OriginalArg(2) int height) {
		SoftwareRaster.pixels = pixels;
		SoftwareRaster.width = width;
		SoftwareRaster.height = height;
		setClip(0, 0, width, height);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([I)V")
	public static void getClip(@OriginalArg(0) int[] clip) {
		clip[0] = clipX;
		clip[1] = clipY;
		clip[2] = clipWidth;
		clip[3] = clipHeight;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIII)V")
	public static void setClip(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height) {
		if (x < 0) {
			x = 0;
		}
		if (y < 0) {
			y = 0;
		}
		if (width > SoftwareRaster.width) {
			width = SoftwareRaster.width;
		}
		if (height > SoftwareRaster.height) {
			height = SoftwareRaster.height;
		}
		SoftwareRaster.clipX = x;
		SoftwareRaster.clipY = y;
		SoftwareRaster.clipWidth = width;
		SoftwareRaster.clipHeight = height;
		resetMask();
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "([I)V")
	public static void setClip(@OriginalArg(0) int[] clip) {
		clipX = clip[0];
		clipY = clip[1];
		clipWidth = clip[2];
		clipHeight = clip[3];
		resetMask();
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "()V")
	public static void resetClip() {
		clipX = 0;
		clipY = 0;
		clipWidth = width;
		clipHeight = height;
		resetMask();
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(IIII)V")
	public static void shrinkClip(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height) {
		if (x > clipX) {
			clipX = x;
		}
		if (y > clipY) {
			clipY = y;
		}
		if (width < clipWidth) {
			clipWidth = width;
		}
		if (height < clipHeight) {
			clipHeight = height;
		}
		resetMask();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([I[I)V")
	public static void setMask(@OriginalArg(0) int[] maskXs, @OriginalArg(1) int[] maskWidths) {
		if (maskXs.length != clipHeight - clipY || maskWidths.length != clipHeight - clipY) {
			throw new IllegalArgumentException();
		}
		SoftwareRaster.maskXs = maskXs;
		SoftwareRaster.maskWidths = maskWidths;
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "()V")
	public static void resetMask() {
		maskXs = null;
		maskWidths = null;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "()V")
	public static void clear() {
		@Pc(1) int i = 0;
		@Pc(7) int len = width * height - 7;
		while (i < len) {
			@Pc(13) int i2 = i + 1;
			pixels[i] = 0;
			pixels[i2++] = 0;
			pixels[i2++] = 0;
			pixels[i2++] = 0;
			pixels[i2++] = 0;
			pixels[i2++] = 0;
			pixels[i2++] = 0;
			i = i2 + 1;
			pixels[i2] = 0;
		}
		@Pc(52) int len2 = len + 7;
		while (i < len2) {
			pixels[i++] = 0;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
	private static void setPixel(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int color) {
		if (x >= clipX && y >= clipY && x < clipWidth && y < clipHeight) {
			pixels[x + y * width] = color;
		}
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(IIIII)V")
	public static void drawRect(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color) {
		drawHorizontalLine(x, y, width, color);
		drawHorizontalLine(x, y + height - 1, width, color);
		drawVerticalLine(x, y, height, color);
		drawVerticalLine(x + width - 1, y, height, color);
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(IIII)V")
	public static void drawHorizontalLine(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int color) {
		if (y < clipY || y >= clipHeight) {
			return;
		}
		if (x < clipX) {
			width -= clipX - x;
			x = clipX;
		}
		if (x + width > clipWidth) {
			width = clipWidth - x;
		}
		@Pc(32) int index = x + y * SoftwareRaster.width;
		for (@Pc(34) int x0 = 0; x0 < width; x0++) {
			pixels[index + x0] = color;
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(IIII)V")
	public static void drawVerticalLine(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int height, @OriginalArg(3) int color) {
		if (x < clipX || x >= clipWidth) {
			return;
		}
		if (y < clipY) {
			height -= clipY - y;
			y = clipY;
		}
		if (y + height > clipHeight) {
			height = clipHeight - y;
		}
		@Pc(32) int index = x + y * width;
		@Pc(34) int y0 = 0;
		while (y0 < height) {
			pixels[index] = color;
			y0++;
			index += width;
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIIII)V")
	public static void fillRect(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color) {
		if (x < clipX) {
			width -= clipX - x;
			x = clipX;
		}
		if (y < clipY) {
			height -= clipY - y;
			y = clipY;
		}
		if (x + width > clipWidth) {
			width = clipWidth - x;
		}
		if (y + height > clipHeight) {
			height = clipHeight - y;
		}
		@Pc(43) int stride = SoftwareRaster.width - width;
		@Pc(49) int index = x + y * SoftwareRaster.width;
		for (@Pc(52) int y0 = -height; y0 < 0; y0++) {
			for (@Pc(57) int x0 = -width; x0 < 0; x0++) {
				pixels[index++] = color;
			}
			index += stride;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)V")
	public static void drawLine(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int color) {
		@Pc(3) int dx = x1 - x0;
		@Pc(7) int dy = y1 - y0;
		if (dy == 0) {
			if (dx >= 0) {
				drawHorizontalLine(x0, y0, dx + 1, color);
			} else {
				drawHorizontalLine(x0 + dx, y0, 1 - dx, color);
			}
		} else if (dx == 0) {
			if (dy >= 0) {
				drawVerticalLine(x0, y0, dy + 1, color);
			} else {
				drawVerticalLine(x0, y0 + dy, 1 - dy, color);
			}
		} else {
			if (dx + dy < 0) {
				x0 += dx;
				dx = -dx;
				y0 += dy;
				dy = -dy;
			}
			if (dx > dy) {
				@Pc(78) int local78 = y0 << 16;
				@Pc(82) int local82 = local78 + 32768;
				y1 = dy << 16;
				@Pc(96) int local96 = (int) Math.floor((double) y1 / (double) dx + 0.5D);
				@Pc(100) int local100 = dx + x0;
				if (x0 < clipX) {
					local82 += local96 * (clipX - x0);
					x0 = clipX;
				}
				if (local100 >= clipWidth) {
					local100 = clipWidth - 1;
				}
				while (x0 <= local100) {
					@Pc(127) int local127 = local82 >> 16;
					if (local127 >= clipY && local127 < clipHeight) {
						pixels[x0 + local127 * width] = color;
					}
					local82 += local96;
					x0++;
				}
			} else {
				@Pc(152) int local152 = x0 << 16;
				@Pc(156) int local156 = local152 + 32768;
				x1 = dx << 16;
				@Pc(170) int local170 = (int) Math.floor((double) x1 / (double) dy + 0.5D);
				@Pc(174) int local174 = dy + y0;
				if (y0 < clipY) {
					local156 += local170 * (clipY - y0);
					y0 = clipY;
				}
				if (local174 >= clipHeight) {
					local174 = clipHeight - 1;
				}
				while (y0 <= local174) {
					@Pc(201) int local201 = local156 >> 16;
					if (local201 >= clipX && local201 < clipWidth) {
						pixels[local201 + y0 * width] = color;
					}
					local156 += local170;
					y0++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIIIII)V")
	public static void drawLineWithStrokeWidth(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int color, @OriginalArg(5) int strokeWidth) {
		@Pc(3) int dx = x1 - x0;
		@Pc(7) int dy = y1 - y0;
		@Pc(14) int local14 = dx >= 0 ? dx : -dx;
		@Pc(21) int local21 = dy >= 0 ? dy : -dy;
		@Pc(23) int local23 = local14;
		if (local14 < local21) {
			local23 = local21;
		}
		if (local23 == 0) {
			return;
		}
		@Pc(37) int local37 = (dx << 16) / local23;
		@Pc(43) int local43 = (dy << 16) / local23;
		if (local43 <= local37) {
			local37 = -local37;
		} else {
			local43 = -local43;
		}
		@Pc(59) int local59 = strokeWidth * local43 >> 17;
		@Pc(67) int local67 = strokeWidth * local43 + 1 >> 17;
		@Pc(73) int local73 = strokeWidth * local37 >> 17;
		@Pc(81) int local81 = strokeWidth * local37 + 1 >> 17;
		x0 -= Static23.method2548();
		y0 -= Static23.method2546();
		@Pc(93) int local93 = x0 + local59;
		@Pc(97) int local97 = x0 - local67;
		@Pc(103) int local103 = x0 + dx - local67;
		@Pc(109) int local109 = x0 + dx + local59;
		@Pc(113) int local113 = y0 + local73;
		@Pc(117) int local117 = y0 - local81;
		@Pc(123) int local123 = y0 + dy - local81;
		@Pc(129) int local129 = y0 + dy + local73;
		Static23.method2542(local93, local97, local103);
		Static23.method2550(local113, local117, local123, local93, local97, local103, color);
		Static23.method2542(local93, local103, local109);
		Static23.method2550(local113, local123, local129, local93, local103, local109, color);
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(IIIII)V")
	public static void method4206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return;
		}
		if (arg4 == 256) {
			method4208(arg0, arg1, arg2, arg3);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(20) int local20 = 256 - arg4;
		@Pc(28) int local28 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(36) int local36 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(42) int local42 = (arg3 & 0xFF) * arg4;
		@Pc(46) int local46 = arg1 - arg2;
		if (local46 < clipY) {
			local46 = clipY;
		}
		@Pc(57) int local57 = arg1 + arg2 + 1;
		if (local57 > clipHeight) {
			local57 = clipHeight;
		}
		@Pc(64) int local64 = local46;
		@Pc(68) int local68 = arg2 * arg2;
		@Pc(70) int local70 = 0;
		@Pc(74) int local74 = arg1 - local46;
		@Pc(78) int local78 = local74 * local74;
		@Pc(82) int local82 = local78 - local74;
		if (arg1 > local57) {
			arg1 = local57;
		}
		while (local64 < arg1) {
			while (local82 <= local68 || local78 <= local68) {
				local78 += local70 + local70;
				local82 += local70++ + local70;
			}
			@Pc(116) int local116 = arg0 + 1 - local70;
			if (local116 < clipX) {
				local116 = clipX;
			}
			@Pc(125) int local125 = arg0 + local70;
			if (local125 > clipWidth) {
				local125 = clipWidth;
			}
			@Pc(136) int local136 = local116 + local64 * width;
			for (@Pc(138) int local138 = local116; local138 < local125; local138++) {
				@Pc(151) int local151 = (pixels[local136] >> 16 & 0xFF) * local20;
				@Pc(161) int local161 = (pixels[local136] >> 8 & 0xFF) * local20;
				@Pc(169) int local169 = (pixels[local136] & 0xFF) * local20;
				@Pc(191) int local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				pixels[local136++] = local191;
			}
			local64++;
			local78 -= local74-- + local74;
			local82 -= local74 + local74;
		}
		@Pc(215) int local215 = arg2;
		@Pc(218) int local218 = -local74;
		@Pc(224) int local224 = local218 * local218 + local68;
		@Pc(228) int local228 = local224 - arg2;
		@Pc(232) int local232 = local224 - local218;
		while (local64 < local57) {
			while (local232 > local68 && local228 > local68) {
				local232 -= local215-- + local215;
				local228 -= local215 + local215;
			}
			@Pc(259) int local259 = arg0 - local215;
			if (local259 < clipX) {
				local259 = clipX;
			}
			@Pc(268) int local268 = arg0 + local215;
			if (local268 > clipWidth - 1) {
				local268 = clipWidth - 1;
			}
			@Pc(283) int local283 = local259 + local64 * width;
			for (@Pc(285) int local285 = local259; local285 <= local268; local285++) {
				@Pc(298) int local298 = (pixels[local283] >> 16 & 0xFF) * local20;
				@Pc(308) int local308 = (pixels[local283] >> 8 & 0xFF) * local20;
				@Pc(316) int local316 = (pixels[local283] & 0xFF) * local20;
				@Pc(338) int local338 = (local28 + local298 >> 8 << 16) + (local36 + local308 >> 8 << 8) + (local42 + local316 >> 8);
				pixels[local283++] = local338;
			}
			local64++;
			local232 += local218 + local218;
			local228 += local218++ + local218;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII[I[I)V")
	public static void method4207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		if (clipHeight - clipY != arg5.length) {
			throw new IllegalStateException();
		} else if (arg0 >= clipX && arg0 < clipWidth) {
			if (arg1 < clipY) {
				arg2 -= clipY - arg1;
				arg1 = clipY;
			}
			if (arg1 + arg2 > clipHeight) {
				arg2 = clipHeight - arg1;
			}
			@Pc(40) int local40 = 256 - arg4;
			@Pc(48) int local48 = (arg3 >> 16 & 0xFF) * arg4;
			@Pc(56) int local56 = (arg3 >> 8 & 0xFF) * arg4;
			@Pc(62) int local62 = (arg3 & 0xFF) * arg4;
			@Pc(68) int local68 = arg0 + arg1 * width;
			for (@Pc(70) int local70 = 0; local70 < arg2; local70++) {
				@Pc(79) int local79 = arg1 + local70 - clipY;
				if (arg0 - clipX >= arg5[local79] && arg0 - clipX < arg5[local79] + arg6[local79]) {
					@Pc(107) int local107 = (pixels[local68] >> 16 & 0xFF) * local40;
					@Pc(117) int local117 = (pixels[local68] >> 8 & 0xFF) * local40;
					@Pc(125) int local125 = (pixels[local68] & 0xFF) * local40;
					@Pc(147) int local147 = (local48 + local107 >> 8 << 16) + (local56 + local117 >> 8 << 8) + (local62 + local125 >> 8);
					pixels[local68] = local147;
				}
				local68 += width;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V")
	public static void method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 == 0) {
			setPixel(arg0, arg1, arg3);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < clipY) {
			local15 = clipY;
		}
		@Pc(26) int local26 = arg1 + arg2 + 1;
		if (local26 > clipHeight) {
			local26 = clipHeight;
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
			if (local85 < clipX) {
				local85 = clipX;
			}
			@Pc(94) int local94 = arg0 + local39;
			if (local94 > clipWidth) {
				local94 = clipWidth;
			}
			@Pc(105) int local105 = local85 + local33 * width;
			for (@Pc(107) int local107 = local85; local107 < local94; local107++) {
				pixels[local105++] = arg3;
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
			if (local179 < clipX) {
				local179 = clipX;
			}
			@Pc(188) int local188 = arg0 + local134;
			if (local188 > clipWidth - 1) {
				local188 = clipWidth - 1;
			}
			@Pc(203) int local203 = local179 + local33 * width;
			for (@Pc(205) int local205 = local179; local205 <= local188; local205++) {
				pixels[local203++] = arg3;
			}
			local33++;
			local152 += local138 + local138;
			local148 += local138++ + local138;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III[I[I)V")
	public static void method4210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * width;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(17) int local17 = local5 + arg2[local7];
			for (@Pc(22) int local22 = -arg3[local7]; local22 < 0; local22++) {
				pixels[local17++] = 0;
			}
			local5 += width;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V")
	public static void fillRectAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < clipX) {
			arg2 -= clipX - arg0;
			arg0 = clipX;
		}
		if (arg1 < clipY) {
			arg3 -= clipY - arg1;
			arg1 = clipY;
		}
		if (arg0 + arg2 > clipWidth) {
			arg2 = clipWidth - arg0;
		}
		if (arg1 + arg3 > clipHeight) {
			arg3 = clipHeight - arg1;
		}
		arg4 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = width - arg2;
		@Pc(73) int local73 = arg0 + arg1 * width;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(87) int local87 = pixels[local73];
				local87 = ((local87 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local87 & 0xFF00) * local63 >> 8 & 0xFF00);
				pixels[local73++] = arg4 + local87;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(IIIII)V")
	public static void method4216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < clipX || arg0 >= clipWidth) {
			return;
		}
		if (arg1 < clipY) {
			arg2 -= clipY - arg1;
			arg1 = clipY;
		}
		if (arg1 + arg2 > clipHeight) {
			arg2 = clipHeight - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * width;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (pixels[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (pixels[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (pixels[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			pixels[local58] = local113;
			local58 += width;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII[I[I)V")
	public static void drawRectMaskedAlpha(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int color, @OriginalArg(5) int alpha, @OriginalArg(6) int[] maskXs, @OriginalArg(7) int[] maskWidths) {
		if (clipHeight - clipY != maskXs.length) {
			throw new IllegalStateException();
		}
		@Pc(13) int width = x1 - x0;
		@Pc(17) int height = y1 - y0;
		if (height == 0) {
			if (width >= 0) {
				method4231(x0, y0, width, color, alpha, maskXs, maskWidths);
			} else {
				method4231(x0 + width + 1, y0, -width, color, alpha, maskXs, maskWidths);
			}
		} else if (width != 0) {
			@Pc(73) boolean local73 = false;
			if (width + height < 0) {
				x0 += width;
				width = -width;
				y0 += height;
				height = -height;
				local73 = true;
			}
			@Pc(97) int local97 = 256 - alpha;
			@Pc(105) int local105 = (color >> 16 & 0xFF) * alpha;
			@Pc(113) int local113 = (color >> 8 & 0xFF) * alpha;
			@Pc(119) int local119 = (color & 0xFF) * alpha;
			if (width > height) {
				@Pc(126) int local126 = y0 << 16;
				@Pc(130) int local130 = local126 + 32768;
				y1 = height << 16;
				@Pc(144) int local144 = (int) Math.floor((double) y1 / (double) width + 0.5D);
				@Pc(148) int local148 = width + x0;
				if (local73) {
					local130 += local144;
					x0++;
				}
				if (x0 < clipX) {
					local130 += local144 * (clipX - x0);
					x0 = clipX;
				}
				if (local148 >= clipWidth) {
					local148 = clipWidth - 1;
				}
				if (!local73) {
					local148--;
				}
				while (x0 <= local148) {
					@Pc(185) int local185 = local130 >> 16;
					@Pc(189) int local189 = local185 - clipY;
					if (local185 >= clipY && local185 < clipHeight && x0 - clipX >= maskXs[local189] && x0 - clipX < maskXs[local189] + maskWidths[local189]) {
						@Pc(219) int local219 = x0 + local185 * SoftwareRaster.width;
						@Pc(229) int local229 = (pixels[local219] >> 16 & 0xFF) * local97;
						@Pc(239) int local239 = (pixels[local219] >> 8 & 0xFF) * local97;
						@Pc(247) int local247 = (pixels[local219] & 0xFF) * local97;
						@Pc(269) int local269 = (local105 + local229 >> 8 << 16) + (local113 + local239 >> 8 << 8) + (local119 + local247 >> 8);
						pixels[local219] = local269;
					}
					local130 += local144;
					x0++;
				}
			} else {
				@Pc(284) int local284 = x0 << 16;
				@Pc(288) int local288 = local284 + 32768;
				x1 = width << 16;
				@Pc(302) int local302 = (int) Math.floor((double) x1 / (double) height + 0.5D);
				@Pc(306) int local306 = height + y0;
				if (local73) {
					local288 += local302;
					y0++;
				}
				if (y0 < clipY) {
					local288 += local302 * (clipY - y0);
					y0 = clipY;
				}
				if (local306 >= clipHeight) {
					local306 = clipHeight - 1;
				}
				if (!local73) {
					local306--;
				}
				while (y0 <= local306) {
					@Pc(343) int local343 = local288 >> 16;
					@Pc(347) int local347 = y0 - clipY;
					if (local343 >= clipX && local343 < clipWidth && local343 - clipX >= maskXs[local347] && local343 - clipX < maskXs[local347] + maskWidths[local347]) {
						@Pc(377) int local377 = local343 + y0 * SoftwareRaster.width;
						@Pc(387) int local387 = (pixels[local377] >> 16 & 0xFF) * local97;
						@Pc(397) int local397 = (pixels[local377] >> 8 & 0xFF) * local97;
						@Pc(405) int local405 = (pixels[local377] & 0xFF) * local97;
						@Pc(427) int local427 = (local105 + local387 >> 8 << 16) + (local113 + local397 >> 8 << 8) + (local119 + local405 >> 8);
						pixels[local377] = local427;
					}
					local288 += local302;
					y0++;
				}
			}
		} else if (height >= 0) {
			method4207(x0, y0, height, color, alpha, maskXs, maskWidths);
		} else {
			method4207(x0, y0 + height + 1, -height, color, alpha, maskXs, maskWidths);
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(IIIIII)V")
	public static void drawRectAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method4225(arg0, arg1, arg2, arg4, arg5);
		method4225(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method4216(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method4216(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(IIIII)V")
	public static void method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < clipY || arg1 >= clipHeight) {
			return;
		}
		if (arg0 < clipX) {
			arg2 -= clipX - arg0;
			arg0 = clipX;
		}
		if (arg0 + arg2 > clipWidth) {
			arg2 = clipWidth - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * width;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (pixels[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (pixels[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (pixels[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			pixels[local58++] = local113;
		}
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
				if (arg0 < clipX) {
					local112 += local126 * (clipX - arg0);
					arg0 = clipX;
				}
				if (local130 >= clipWidth) {
					local130 = clipWidth - 1;
				}
				if (!local55) {
					local130--;
				}
				while (arg0 <= local130) {
					@Pc(167) int local167 = local112 >> 16;
					if (local167 >= clipY && local167 < clipHeight) {
						@Pc(179) int local179 = arg0 + local167 * width;
						@Pc(189) int local189 = (pixels[local179] >> 16 & 0xFF) * local79;
						@Pc(199) int local199 = (pixels[local179] >> 8 & 0xFF) * local79;
						@Pc(207) int local207 = (pixels[local179] & 0xFF) * local79;
						@Pc(229) int local229 = (local87 + local189 >> 8 << 16) + (local95 + local199 >> 8 << 8) + (local101 + local207 >> 8);
						pixels[local179] = local229;
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
				if (arg1 < clipY) {
					local248 += local262 * (clipY - arg1);
					arg1 = clipY;
				}
				if (local266 >= clipHeight) {
					local266 = clipHeight - 1;
				}
				if (!local55) {
					local266--;
				}
				while (arg1 <= local266) {
					@Pc(303) int local303 = local248 >> 16;
					if (local303 >= clipX && local303 < clipWidth) {
						@Pc(315) int local315 = local303 + arg1 * width;
						@Pc(325) int local325 = (pixels[local315] >> 16 & 0xFF) * local79;
						@Pc(335) int local335 = (pixels[local315] >> 8 & 0xFF) * local79;
						@Pc(343) int local343 = (pixels[local315] & 0xFF) * local79;
						@Pc(365) int local365 = (local87 + local325 >> 8 << 16) + (local95 + local335 >> 8 << 8) + (local101 + local343 >> 8);
						pixels[local315] = local365;
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
	public static void method4231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		if (clipHeight - clipY != arg5.length) {
			throw new IllegalStateException();
		} else if (arg1 >= clipY && arg1 < clipHeight) {
			@Pc(24) int local24 = clipX + arg5[arg1 - clipY];
			if (arg0 < local24) {
				arg2 -= local24 - arg0;
				arg0 = local24;
			}
			@Pc(49) int local49 = clipX + arg5[arg1 - clipY] + arg6[arg1 - clipY];
			if (arg0 + arg2 > local49) {
				arg2 = local49 - arg0;
			}
			@Pc(62) int local62 = 256 - arg4;
			@Pc(70) int local70 = (arg3 >> 16 & 0xFF) * arg4;
			@Pc(78) int local78 = (arg3 >> 8 & 0xFF) * arg4;
			@Pc(84) int local84 = (arg3 & 0xFF) * arg4;
			@Pc(90) int local90 = arg0 + arg1 * width;
			for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
				@Pc(105) int local105 = (pixels[local90] >> 16 & 0xFF) * local62;
				@Pc(115) int local115 = (pixels[local90] >> 8 & 0xFF) * local62;
				@Pc(123) int local123 = (pixels[local90] & 0xFF) * local62;
				@Pc(145) int local145 = (local70 + local105 >> 8 << 16) + (local78 + local115 >> 8 << 8) + (local84 + local123 >> 8);
				pixels[local90++] = local145;
			}
		}
	}
}

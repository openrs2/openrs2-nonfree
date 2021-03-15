import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public class SoftwareSprite extends Sprite {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[IIIIIIIII)V")
	private static void blitAlpha(@OriginalArg(0) int[] dest, @OriginalArg(1) int[] src, @OriginalArg(3) int srcOff, @OriginalArg(4) int destOff, @OriginalArg(5) int width, @OriginalArg(6) int height, @OriginalArg(7) int destStride, @OriginalArg(8) int srcStride, @OriginalArg(9) int alpha) {
		@Pc(3) int invAlpha = 256 - alpha;
		for (@Pc(6) int y = -height; y < 0; y++) {
			for (@Pc(11) int x = -width; x < 0; x++) {
				@Pc(18) int color = src[srcOff++];
				if (color == 0) {
					destOff++;
				} else {
					@Pc(24) int prevColor = dest[destOff];
					dest[destOff++] = ((color & 0xFF00FF) * alpha + (prevColor & 0xFF00FF) * invAlpha & 0xFF00FF00) + ((color & 0xFF00) * alpha + (prevColor & 0xFF00) * invAlpha & 0xFF0000) >> 8;
				}
			}
			destOff += destStride;
			srcOff += srcStride;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[IIIIIIIIIII)V")
	private static void blitResizedTransparent(@OriginalArg(0) int[] dest, @OriginalArg(1) int[] src, @OriginalArg(3) int srcX, @OriginalArg(4) int srcY, @OriginalArg(5) int destOff, @OriginalArg(6) int destStride, @OriginalArg(7) int destWidth, @OriginalArg(8) int destHeight, @OriginalArg(9) int srcXStride, @OriginalArg(10) int srcYStride, @OriginalArg(11) int srcWidth) {
		@Pc(1) int originalSrcX = srcX;
		for (@Pc(4) int y = -destHeight; y < 0; y++) {
			@Pc(12) int off = (srcY >> 16) * srcWidth;
			for (@Pc(15) int x = -destWidth; x < 0; x++) {
				@Pc(25) int color = src[(srcX >> 16) + off];
				if (color == 0) {
					destOff++;
				} else {
					dest[destOff++] = color;
				}
				srcX += srcXStride;
			}
			srcY += srcYStride;
			srcX = originalSrcX;
			destOff += destStride;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[IIIIIIII)V")
	private static void blitHorizontalFlipTransparent(@OriginalArg(0) int[] dest, @OriginalArg(1) int[] src, @OriginalArg(3) int srcOff, @OriginalArg(4) int destOff, @OriginalArg(5) int width, @OriginalArg(6) int height, @OriginalArg(7) int destStride, @OriginalArg(8) int srcStride) {
		@Pc(4) int x0 = -(width >> 2);
		width = -(width & 0x3);
		for (@Pc(12) int y = -height; y < 0; y++) {
			for (@Pc(16) int x = x0; x < 0; x++) {
				@Pc(21) int srcOff2 = srcOff - 1;
				@Pc(23) int color = src[srcOff];
				@Pc(28) int destOff2;
				if (color == 0) {
					destOff2 = destOff + 1;
				} else {
					destOff2 = destOff + 1;
					dest[destOff] = color;
				}
				@Pc(35) int srcOff3 = srcOff2 - 1;
				@Pc(37) int color2 = src[srcOff2];
				@Pc(42) int destOff3;
				if (color2 == 0) {
					destOff3 = destOff2 + 1;
				} else {
					destOff3 = destOff2 + 1;
					dest[destOff2] = color2;
				}
				@Pc(49) int srcOff4 = srcOff3 - 1;
				@Pc(51) int color3 = src[srcOff3];
				@Pc(56) int destOff4;
				if (color3 == 0) {
					destOff4 = destOff3 + 1;
				} else {
					destOff4 = destOff3 + 1;
					dest[destOff3] = color3;
				}
				srcOff = srcOff4 - 1;
				@Pc(65) int color4 = src[srcOff4];
				if (color4 == 0) {
					destOff = destOff4 + 1;
				} else {
					destOff = destOff4 + 1;
					dest[destOff4] = color4;
				}
			}
			for (@Pc(78) int x = width; x < 0; x++) {
				@Pc(85) int color = src[srcOff--];
				if (color == 0) {
					destOff++;
				} else {
					dest[destOff++] = color;
				}
			}
			destOff += destStride;
			srcOff += srcStride;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "([I[IIIIIIII)V")
	private static void blitTransparent(@OriginalArg(0) int[] dest, @OriginalArg(1) int[] src, @OriginalArg(3) int srcOff, @OriginalArg(4) int destOff, @OriginalArg(5) int width, @OriginalArg(6) int height, @OriginalArg(7) int destStride, @OriginalArg(8) int srcStride) {
		@Pc(4) int x0 = -(width >> 2);
		width = -(width & 0x3);
		for (@Pc(12) int y = -height; y < 0; y++) {
			for (@Pc(16) int x = x0; x < 0; x++) {
				@Pc(21) int srcOff2 = srcOff + 1;
				@Pc(23) int color = src[srcOff];
				@Pc(28) int destOff2;
				if (color == 0) {
					destOff2 = destOff + 1;
				} else {
					destOff2 = destOff + 1;
					dest[destOff] = color;
				}
				@Pc(35) int srcOff3 = srcOff2 + 1;
				@Pc(37) int color2 = src[srcOff2];
				@Pc(42) int destOff3;
				if (color2 == 0) {
					destOff3 = destOff2 + 1;
				} else {
					destOff3 = destOff2 + 1;
					dest[destOff2] = color2;
				}
				@Pc(49) int srcOff4 = srcOff3 + 1;
				@Pc(51) int color3 = src[srcOff3];
				@Pc(56) int destOff4;
				if (color3 == 0) {
					destOff4 = destOff3 + 1;
				} else {
					destOff4 = destOff3 + 1;
					dest[destOff3] = color3;
				}
				srcOff = srcOff4 + 1;
				@Pc(65) int color4 = src[srcOff4];
				if (color4 == 0) {
					destOff = destOff4 + 1;
				} else {
					destOff = destOff4 + 1;
					dest[destOff4] = color4;
				}
			}
			for (@Pc(78) int x = width; x < 0; x++) {
				@Pc(85) int color = src[srcOff++];
				if (color == 0) {
					destOff++;
				} else {
					dest[destOff++] = color;
				}
			}
			destOff += destStride;
			srcOff += srcStride;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[IIIIIII)V")
	private static void blit(@OriginalArg(0) int[] dest, @OriginalArg(1) int[] src, @OriginalArg(2) int srcOff, @OriginalArg(3) int destOff, @OriginalArg(4) int width, @OriginalArg(5) int height, @OriginalArg(6) int destStride, @OriginalArg(7) int srcStride) {
		for (@Pc(2) int y = -height; y < 0; y++) {
			@Pc(10) int destEnd = destOff + width - 3;
			while (destOff < destEnd) {
				@Pc(16) int destOff2 = destOff + 1;
				@Pc(19) int srcOff2 = srcOff + 1;
				dest[destOff] = src[srcOff];
				dest[destOff2++] = src[srcOff2++];
				dest[destOff2++] = src[srcOff2++];
				destOff = destOff2 + 1;
				srcOff = srcOff2 + 1;
				dest[destOff2] = src[srcOff2];
			}
			@Pc(47) int destEnd2 = destEnd + 3;
			while (destOff < destEnd2) {
				dest[destOff++] = src[srcOff++];
			}
			destOff += destStride;
			srcOff += srcStride;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[IIIIIIIIIIII)V")
	private static void blitResizedAlpha(@OriginalArg(0) int[] dest, @OriginalArg(1) int[] src, @OriginalArg(3) int srcX, @OriginalArg(4) int srcY, @OriginalArg(5) int destOff, @OriginalArg(6) int destStride, @OriginalArg(7) int destWidth, @OriginalArg(8) int destHeight, @OriginalArg(9) int srcXStride, @OriginalArg(10) int srcYStride, @OriginalArg(11) int srcWidth, @OriginalArg(12) int alpha) {
		@Pc(3) int invAlpha = 256 - alpha;
		@Pc(5) int originalSrcX = srcX;
		for (@Pc(8) int y = -destHeight; y < 0; y++) {
			@Pc(16) int off = (srcY >> 16) * srcWidth;
			for (@Pc(19) int x = -destWidth; x < 0; x++) {
				@Pc(29) int color = src[(srcX >> 16) + off];
				if (color == 0) {
					destOff++;
				} else {
					@Pc(35) int prevColor = dest[destOff];
					dest[destOff++] = ((color & 0xFF00FF) * alpha + (prevColor & 0xFF00FF) * invAlpha & 0xFF00FF00) + ((color & 0xFF00) * alpha + (prevColor & 0xFF00) * invAlpha & 0xFF0000) >> 8;
				}
				srcX += srcXStride;
			}
			srcY += srcYStride;
			srcX = originalSrcX;
			destOff += destStride;
		}
	}

	@OriginalMember(owner = "client!vn", name = "M", descriptor = "[I")
	public int[] pixels;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIII[I)V")
	public SoftwareSprite(@OriginalArg(0) int innerWidth, @OriginalArg(1) int innerHeight, @OriginalArg(2) int xOffset, @OriginalArg(3) int yOffset, @OriginalArg(4) int width, @OriginalArg(5) int height, @OriginalArg(6) int[] pixels) {
		this.innerWidth = innerWidth;
		this.innerHeight = innerHeight;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
		this.width = width;
		this.height = height;
		this.pixels = pixels;
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(II)V")
	public SoftwareSprite(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		this.pixels = new int[width * height];
		this.width = this.innerWidth = width;
		this.height = this.innerHeight = height;
		this.xOffset = this.yOffset = 0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "()V")
	public final void flipVertical() {
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
		this.xOffset = this.innerWidth - this.width - this.xOffset;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)V")
	@Override
	public void renderAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int alpha) {
		@Pc(4) int x0 = x + this.xOffset;
		@Pc(9) int y0 = y + this.yOffset;
		@Pc(15) int destOff = x0 + y0 * SoftwareRaster.width;
		@Pc(17) int srcOff = 0;
		@Pc(20) int height = this.height;
		@Pc(23) int width = this.width;
		@Pc(27) int destStride = SoftwareRaster.width - width;
		@Pc(29) int srcStride = 0;
		if (y0 < SoftwareRaster.clipY) {
			@Pc(36) int dy = SoftwareRaster.clipY - y0;
			height -= dy;
			y0 = SoftwareRaster.clipY;
			srcOff = dy * width;
			destOff += dy * SoftwareRaster.width;
		}
		if (y0 + height > SoftwareRaster.clipHeight) {
			height -= y0 + height - SoftwareRaster.clipHeight;
		}
		if (x0 < SoftwareRaster.clipX) {
			@Pc(74) int dx = SoftwareRaster.clipX - x0;
			width -= dx;
			x0 = SoftwareRaster.clipX;
			srcOff += dx;
			destOff += dx;
			srcStride = dx;
			destStride += dx;
		}
		if (x0 + width > SoftwareRaster.clipWidth) {
			@Pc(107) int dx = x0 + width - SoftwareRaster.clipWidth;
			width -= dx;
			srcStride += dx;
			destStride += dx;
		}
		if (width > 0 && height > 0) {
			blitAlpha(SoftwareRaster.pixels, this.pixels, srcOff, destOff, width, height, destStride, srcStride, alpha);
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
			@Pc(69) int local69 = arg0 + arg1 * SoftwareRaster.width;
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
						SoftwareRaster.pixels[local82++] = local115;
					}
					local88 += local27;
					local94 -= local18;
				}
				local51 += local18;
				local63 += local27;
				local69 += SoftwareRaster.width;
			}
		} catch (@Pc(150) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII)V")
	@Override
	public void renderResizedTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height) {
		if (width <= 0 || height <= 0) {
			return;
		}
		@Pc(7) int srcWidth = this.width;
		@Pc(10) int srcHeight = this.height;
		@Pc(12) int srcX = 0;
		@Pc(14) int srcY = 0;
		@Pc(17) int srcInnerWidth = this.innerWidth;
		@Pc(20) int srcInnerHeight = this.innerHeight;
		@Pc(26) int srcXStride = (srcInnerWidth << 16) / width;
		@Pc(32) int srcYStride = (srcInnerHeight << 16) / height;
		if (this.xOffset > 0) {
			@Pc(46) int dx = ((this.xOffset << 16) + srcXStride - 1) / srcXStride;
			x += dx;
			srcX = dx * srcXStride - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			@Pc(75) int dy = ((this.yOffset << 16) + srcYStride - 1) / srcYStride;
			y += dy;
			srcY = dy * srcYStride - (this.yOffset << 16);
		}
		if (srcWidth < srcInnerWidth) {
			width = ((srcWidth << 16) + srcXStride - srcX - 1) / srcXStride;
		}
		if (srcHeight < srcInnerHeight) {
			height = ((srcHeight << 16) + srcYStride - srcY - 1) / srcYStride;
		}
		@Pc(126) int destOff = x + y * SoftwareRaster.width;
		@Pc(130) int destStride = SoftwareRaster.width - width;
		if (y + height > SoftwareRaster.clipHeight) {
			height -= y + height - SoftwareRaster.clipHeight;
		}
		if (y < SoftwareRaster.clipY) {
			@Pc(150) int dy = SoftwareRaster.clipY - y;
			height -= dy;
			destOff += dy * SoftwareRaster.width;
			srcY += srcYStride * dy;
		}
		if (x + width > SoftwareRaster.clipWidth) {
			@Pc(177) int dx = x + width - SoftwareRaster.clipWidth;
			width -= dx;
			destStride += dx;
		}
		if (x < SoftwareRaster.clipX) {
			@Pc(192) int dx = SoftwareRaster.clipX - x;
			width -= dx;
			destOff += dx;
			srcX += srcXStride * dx;
			destStride += dx;
		}
		blitResizedTransparent(SoftwareRaster.pixels, this.pixels, srcX, srcY, destOff, destStride, width, height, srcXStride, srcYStride, srcWidth);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIIIIII[I[I)V")
	public void renderRotatedTransparent(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			local18 = local18 * arg7 >> 8;
			local27 = local27 * arg7 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local18 + local4 * local27;
			@Pc(63) int local63 = (arg5 << 16) + local9 * local27 - local4 * local18;
			@Pc(69) int local69 = arg0 + arg1 * SoftwareRaster.width;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(78) int local78 = arg8[local71];
				@Pc(82) int local82 = local69 + local78;
				@Pc(88) int local88 = local51 + local27 * local78;
				@Pc(94) int local94 = local63 - local18 * local78;
				for (@Pc(99) int local99 = -arg9[local71]; local99 < 0; local99++) {
					SoftwareRaster.pixels[local82++] = this.pixels[(local88 >> 16) + (local94 >> 16) * this.width];
					local88 += local27;
					local94 -= local18;
				}
				local51 += local18;
				local63 += local27;
				local69 += SoftwareRaster.width;
			}
		} catch (@Pc(144) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
	public final void addShadow(@OriginalArg(0) int shadowColor) {
		for (@Pc(4) int y = this.height - 1; y > 0; y--) {
			@Pc(11) int off = y * this.width;
			for (@Pc(16) int x = this.width - 1; x > 0; x--) {
				if (this.pixels[x + off] == 0 && this.pixels[x + off - this.width - 1] != 0) {
					this.pixels[x + off] = shadowColor;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "()V")
	public final void flipHorizontal() {
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
		this.yOffset = this.innerHeight - this.height - this.yOffset;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "()[I")
	public int[] getPixels() {
		@Pc(6) int[] dest = new int[this.innerWidth * this.innerHeight];
		for (@Pc(8) int y = 0; y < this.height; y++) {
			@Pc(17) int srcOff = y * this.width;
			@Pc(28) int destOff = this.xOffset + (y + this.yOffset) * this.innerWidth;
			for (@Pc(30) int x = 0; x < this.width; x++) {
				@Pc(40) int color = this.pixels[srcOff++];
				dest[destOff++] = color == 0 ? 0 : color | 0xFF000000;
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II[I[I)V")
	public final void renderTransparentMasked(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int[] maskXs, @OriginalArg(3) int[] maskWidths) {
		if (SoftwareRaster.clipHeight - SoftwareRaster.clipY != maskXs.length) {
			throw new IllegalStateException();
		}
		@Pc(14) int destX = x + this.xOffset;
		@Pc(19) int destY = y + this.yOffset;
		@Pc(21) int srcOff = 0;
		@Pc(24) int height = this.height;
		@Pc(27) int width = this.width;
		@Pc(31) int destStride = SoftwareRaster.width - width;
		@Pc(33) int srcStride = 0;
		@Pc(39) int destOff = destX + destY * SoftwareRaster.width;
		if (destY < SoftwareRaster.clipY) {
			@Pc(46) int dy = SoftwareRaster.clipY - destY;
			height -= dy;
			destY = SoftwareRaster.clipY;
			srcOff = dy * width;
			destOff += dy * SoftwareRaster.width;
		}
		if (destY + height > SoftwareRaster.clipHeight) {
			height -= destY + height - SoftwareRaster.clipHeight;
		}
		if (destX < SoftwareRaster.clipX) {
			@Pc(84) int dx = SoftwareRaster.clipX - destX;
			width -= dx;
			destX = SoftwareRaster.clipX;
			srcOff += dx;
			destOff += dx;
			srcStride = dx;
			destStride += dx;
		}
		if (destX + width > SoftwareRaster.clipWidth) {
			@Pc(117) int dx = destX + width - SoftwareRaster.clipWidth;
			width -= dx;
			srcStride += dx;
			destStride += dx;
		}
		if (width <= 0 || height <= 0) {
			return;
		}
		@Pc(138) int local138 = destX - SoftwareRaster.clipX;
		@Pc(142) int local142 = destY - SoftwareRaster.clipY;
		for (@Pc(144) int blitY = local142; blitY < local142 + height; blitY++) {
			@Pc(153) int maskX = maskXs[blitY];
			@Pc(157) int maskWidth = maskWidths[blitY];
			@Pc(159) int srcWidth = width;
			if (local138 > maskX) {
				@Pc(166) int dx = local138 - maskX;
				if (dx >= maskWidth) {
					srcOff += width + srcStride;
					destOff += width + destStride;
					continue;
				}
				maskWidth -= dx;
			} else {
				@Pc(191) int dx = maskX - local138;
				if (dx >= width) {
					srcOff += width + srcStride;
					destOff += width + destStride;
					continue;
				}
				srcOff += dx;
				srcWidth = width - dx;
				destOff += dx;
			}
			@Pc(221) int rhsStride = 0;
			if (srcWidth < maskWidth) {
				maskWidth = srcWidth;
			} else {
				rhsStride = srcWidth - maskWidth;
			}
			for (@Pc(234) int blitX = -maskWidth; blitX < 0; blitX++) {
				@Pc(242) int color = this.pixels[srcOff++];
				if (color == 0) {
					destOff++;
				} else {
					SoftwareRaster.pixels[destOff++] = color;
				}
			}
			srcOff += rhsStride + srcStride;
			destOff += rhsStride + destStride;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIDI)V")
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
					if (local93 == 0) {
						local70++;
					} else {
						SoftwareRaster.pixels[local70++] = local93;
					}
					local72 += local21;
					local74 -= local15;
				}
				local45 += local15;
				local57 += local21;
				local63 += SoftwareRaster.width;
			}
		} catch (@Pc(128) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIIII)V")
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
								SoftwareRaster.pixels[local388++] = local432;
							}
							local394++;
						}
					}
					local384++;
					local319 += SoftwareRaster.width;
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
								SoftwareRaster.pixels[local458++] = local537;
							}
							local468 += local333;
							local470++;
						}
					}
					local454++;
					local368 -= local333;
					local319 += SoftwareRaster.width;
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
								SoftwareRaster.pixels[local569++] = local650;
							}
							local579 += local333;
							local581++;
						}
					}
					local565++;
					local368 -= local333;
					local319 += SoftwareRaster.width;
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
								SoftwareRaster.pixels[local686++] = local765;
							}
							local694 += local342;
							local698++;
						}
					}
					local682++;
					local378 += local342;
					local319 += SoftwareRaster.width;
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
							SoftwareRaster.pixels[local799++] = local925;
						}
						local807 += local342;
						local815 += local333;
						local817++;
					}
					local795++;
					local368 -= local333;
					local378 += local342;
					local319 += SoftwareRaster.width;
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
							SoftwareRaster.pixels[local965++] = local1093;
						}
						local973 += local342;
						local981 += local333;
						local983++;
					}
					local961++;
					local368 -= local333;
					local378 += local342;
					local319 += SoftwareRaster.width;
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
							SoftwareRaster.pixels[local1135++] = local1216;
						}
						local1143 += local342;
						local1147++;
					}
				}
				local1131++;
				local378 += local342;
				local319 += SoftwareRaster.width;
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
						SoftwareRaster.pixels[local1250++] = local1378;
					}
					local1258 += local342;
					local1266 += local333;
					local1268++;
				}
				local1246++;
				local368 -= local333;
				local378 += local342;
				local319 += SoftwareRaster.width;
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
						SoftwareRaster.pixels[local1418++] = local1548;
					}
					local1426 += local342;
					local1434 += local333;
					local1436++;
				}
				local1414++;
				local368 -= local333;
				local378 += local342;
				local319 += SoftwareRaster.width;
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V")
	public final void addOutline(@OriginalArg(0) int outlineColor) {
		@Pc(6) int[] pixels = new int[this.width * this.height];
		@Pc(8) int off = 0;
		for (@Pc(10) int y = 0; y < this.height; y++) {
			for (@Pc(16) int x = 0; x < this.width; x++) {
				@Pc(25) int color = this.pixels[off];
				if (color == 0) {
					if (x > 0 && this.pixels[off - 1] != 0) {
						color = outlineColor;
					} else if (y > 0 && this.pixels[off - this.width] != 0) {
						color = outlineColor;
					} else if (x < this.width - 1 && this.pixels[off + 1] != 0) {
						color = outlineColor;
					} else if (y < this.height - 1 && this.pixels[off + this.width] != 0) {
						color = outlineColor;
					}
				}
				pixels[off++] = color;
			}
		}
		this.pixels = pixels;
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "()V")
	public final void trim() {
		if (this.width == this.innerWidth && this.height == this.innerHeight) {
			return;
		}
		@Pc(17) int[] pixels = new int[this.innerWidth * this.innerHeight];
		for (@Pc(19) int y = 0; y < this.height; y++) {
			for (@Pc(25) int x = 0; x < this.width; x++) {
				pixels[(y + this.yOffset) * this.innerWidth + x + this.xOffset] = this.pixels[y * this.width + x];
			}
		}
		this.pixels = pixels;
		this.width = this.innerWidth;
		this.height = this.innerHeight;
		this.xOffset = 0;
		this.yOffset = 0;
	}

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "(I)V")
	public final void method2177(@OriginalArg(0) int arg0) {
		if (this.width == this.innerWidth && this.height == this.innerHeight) {
			return;
		}
		@Pc(12) int xOffsetDelta = arg0;
		if (arg0 > this.xOffset) {
			xOffsetDelta = this.xOffset;
		}
		@Pc(21) int widthDelta = arg0;
		if (arg0 + this.xOffset + this.width > this.innerWidth) {
			widthDelta = this.innerWidth - this.xOffset - this.width;
		}
		@Pc(42) int yOffsetDelta = arg0;
		if (arg0 > this.yOffset) {
			yOffsetDelta = this.yOffset;
		}
		@Pc(51) int heightDelta = arg0;
		if (arg0 + this.yOffset + this.height > this.innerHeight) {
			heightDelta = this.innerHeight - this.yOffset - this.height;
		}
		@Pc(77) int newWidth = this.width + xOffsetDelta + widthDelta;
		@Pc(84) int newHeight = this.height + yOffsetDelta + heightDelta;
		@Pc(89) int[] pixels = new int[newWidth * newHeight];
		for (@Pc(91) int y = 0; y < this.height; y++) {
			for (@Pc(97) int x = 0; x < this.width; x++) {
				pixels[(y + yOffsetDelta) * newWidth + x + xOffsetDelta] = this.pixels[y * this.width + x];
			}
		}
		this.pixels = pixels;
		this.width = newWidth;
		this.height = newHeight;
		this.xOffset -= xOffsetDelta;
		this.yOffset -= yOffsetDelta;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)V")
	@Override
	public void render(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		@Pc(4) int x0 = x + this.xOffset;
		@Pc(9) int y0 = y + this.yOffset;
		@Pc(15) int destOff = x0 + y0 * SoftwareRaster.width;
		@Pc(17) int srcOff = 0;
		@Pc(20) int height = this.height;
		@Pc(23) int width = this.width;
		@Pc(27) int destStride = SoftwareRaster.width - width;
		@Pc(29) int srcStride = 0;
		if (y0 < SoftwareRaster.clipY) {
			@Pc(36) int dy = SoftwareRaster.clipY - y0;
			height -= dy;
			y0 = SoftwareRaster.clipY;
			srcOff = dy * width;
			destOff += dy * SoftwareRaster.width;
		}
		if (y0 + height > SoftwareRaster.clipHeight) {
			height -= y0 + height - SoftwareRaster.clipHeight;
		}
		if (x0 < SoftwareRaster.clipX) {
			@Pc(74) int dx = SoftwareRaster.clipX - x0;
			width -= dx;
			x0 = SoftwareRaster.clipX;
			srcOff += dx;
			destOff += dx;
			srcStride = dx;
			destStride += dx;
		}
		if (x0 + width > SoftwareRaster.clipWidth) {
			@Pc(107) int dx = x0 + width - SoftwareRaster.clipWidth;
			width -= dx;
			srcStride += dx;
			destStride += dx;
		}
		if (width > 0 && height > 0) {
			blit(SoftwareRaster.pixels, this.pixels, srcOff, destOff, width, height, destStride, srcStride);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
	@Override
	public void renderTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		@Pc(4) int x0 = x + this.xOffset;
		@Pc(9) int y0 = y + this.yOffset;
		@Pc(15) int destOff = x0 + y0 * SoftwareRaster.width;
		@Pc(17) int srcOff = 0;
		@Pc(20) int height = this.height;
		@Pc(23) int width = this.width;
		@Pc(27) int destStride = SoftwareRaster.width - width;
		@Pc(29) int srcStride = 0;
		if (y0 < SoftwareRaster.clipY) {
			@Pc(36) int dy = SoftwareRaster.clipY - y0;
			height -= dy;
			y0 = SoftwareRaster.clipY;
			srcOff = dy * width;
			destOff += dy * SoftwareRaster.width;
		}
		if (y0 + height > SoftwareRaster.clipHeight) {
			height -= y0 + height - SoftwareRaster.clipHeight;
		}
		if (x0 < SoftwareRaster.clipX) {
			@Pc(74) int dx = SoftwareRaster.clipX - x0;
			width -= dx;
			x0 = SoftwareRaster.clipX;
			srcOff += dx;
			destOff += dx;
			srcStride = dx;
			destStride += dx;
		}
		if (x0 + width > SoftwareRaster.clipWidth) {
			@Pc(107) int dx = x0 + width - SoftwareRaster.clipWidth;
			width -= dx;
			srcStride += dx;
			destStride += dx;
		}
		if (width > 0 && height > 0) {
			blitTransparent(SoftwareRaster.pixels, this.pixels, srcOff, destOff, width, height, destStride, srcStride);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIII)V")
	@Override
	public void renderResizedAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int alpha) {
		if (width <= 0 || height <= 0) {
			return;
		}
		@Pc(7) int srcWidth = this.width;
		@Pc(10) int srcHeight = this.height;
		@Pc(12) int srcX = 0;
		@Pc(14) int srcY = 0;
		@Pc(17) int srcInnerWidth = this.innerWidth;
		@Pc(20) int srcInnerHeight = this.innerHeight;
		@Pc(26) int srcXStride = (srcInnerWidth << 16) / width;
		@Pc(32) int srcYStride = (srcInnerHeight << 16) / height;
		if (this.xOffset > 0) {
			@Pc(46) int dx = ((this.xOffset << 16) + srcXStride - 1) / srcXStride;
			x += dx;
			srcX = dx * srcXStride - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			@Pc(75) int dy = ((this.yOffset << 16) + srcYStride - 1) / srcYStride;
			y += dy;
			srcY = dy * srcYStride - (this.yOffset << 16);
		}
		if (srcWidth < srcInnerWidth) {
			width = ((srcWidth << 16) + srcXStride - srcX - 1) / srcXStride;
		}
		if (srcHeight < srcInnerHeight) {
			height = ((srcHeight << 16) + srcYStride - srcY - 1) / srcYStride;
		}
		@Pc(126) int destOff = x + y * SoftwareRaster.width;
		@Pc(130) int destStride = SoftwareRaster.width - width;
		if (y + height > SoftwareRaster.clipHeight) {
			height -= y + height - SoftwareRaster.clipHeight;
		}
		if (y < SoftwareRaster.clipY) {
			@Pc(150) int dy = SoftwareRaster.clipY - y;
			height -= dy;
			destOff += dy * SoftwareRaster.width;
			srcY += srcYStride * dy;
		}
		if (x + width > SoftwareRaster.clipWidth) {
			@Pc(177) int dx = x + width - SoftwareRaster.clipWidth;
			width -= dx;
			destStride += dx;
		}
		if (x < SoftwareRaster.clipX) {
			@Pc(192) int dx = SoftwareRaster.clipX - x;
			width -= dx;
			destOff += dx;
			srcX += srcXStride * dx;
			destStride += dx;
		}
		blitResizedAlpha(SoftwareRaster.pixels, this.pixels, srcX, srcY, destOff, destStride, width, height, srcXStride, srcYStride, srcWidth, alpha);
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)V")
	@Override
	public void renderHorizontalFlipTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		@Pc(10) int x0 = x + this.innerWidth - this.width - this.xOffset;
		@Pc(15) int y1 = y + this.yOffset;
		@Pc(21) int destOff = x0 + y1 * SoftwareRaster.width;
		@Pc(26) int srcOff = this.width - 1;
		@Pc(29) int height = this.height;
		@Pc(32) int width = this.width;
		@Pc(36) int destStride = SoftwareRaster.width - width;
		@Pc(40) int srcStride = width + width;
		if (y1 < SoftwareRaster.clipY) {
			@Pc(47) int dy = SoftwareRaster.clipY - y1;
			height -= dy;
			y1 = SoftwareRaster.clipY;
			srcOff += dy * width;
			destOff += dy * SoftwareRaster.width;
		}
		if (y1 + height > SoftwareRaster.clipHeight) {
			height -= y1 + height - SoftwareRaster.clipHeight;
		}
		if (x0 < SoftwareRaster.clipX) {
			@Pc(85) int dx = SoftwareRaster.clipX - x0;
			width -= dx;
			x0 = SoftwareRaster.clipX;
			srcOff -= dx;
			destOff += dx;
			srcStride -= dx;
			destStride += dx;
		}
		if (x0 + width > SoftwareRaster.clipWidth) {
			@Pc(118) int dx = x0 + width - SoftwareRaster.clipWidth;
			width -= dx;
			srcStride -= dx;
			destStride += dx;
		}
		if (width > 0 && height > 0) {
			blitHorizontalFlipTransparent(SoftwareRaster.pixels, this.pixels, srcOff, destOff, width, height, destStride, srcStride);
		}
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "()V")
	public final void makeTarget() {
		SoftwareRaster.setPixels(this.pixels, this.width, this.height);
	}
}

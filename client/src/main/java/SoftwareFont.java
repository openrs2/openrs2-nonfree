import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class SoftwareFont extends Font {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void blitTransparent(@OriginalArg(0) int[] dest, @OriginalArg(1) byte[] src, @OriginalArg(2) int color, @OriginalArg(3) int srcIndex, @OriginalArg(4) int destIndex, @OriginalArg(5) int width, @OriginalArg(6) int height, @OriginalArg(7) int destStride, @OriginalArg(8) int srcStride, @OriginalArg(9) int alpha) {
		color = ((color & 0xFF00FF) * alpha & 0xFF00FF00) + ((color & 0xFF00) * alpha & 0xFF0000) >> 8;
		alpha = 256 - alpha;
		for (@Pc(24) int y = -height; y < 0; y++) {
			for (@Pc(29) int x = -width; x < 0; x++) {
				if (src[srcIndex++] == 0) {
					destIndex++;
				} else {
					@Pc(40) int backgroundColor = dest[destIndex];
					dest[destIndex++] = (((backgroundColor & 0xFF00FF) * alpha & 0xFF00FF00) + ((backgroundColor & 0xFF00) * alpha & 0xFF0000) >> 8) + color;
				}
			}
			destIndex += destStride;
			srcIndex += srcStride;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([I[BIIIIIIIII[I[I)V")
	private static void blitMasked(@OriginalArg(0) int[] dest, @OriginalArg(1) byte[] src, @OriginalArg(2) int x, @OriginalArg(3) int y, @OriginalArg(4) int width, @OriginalArg(5) int height, @OriginalArg(6) int color, @OriginalArg(7) int srcIndex, @OriginalArg(8) int destIndex, @OriginalArg(9) int destStride, @OriginalArg(10) int srcStride, @OriginalArg(11) int[] maskXs, @OriginalArg(12) int[] maskWidths) {
		@Pc(3) int clipSpaceX = x - SoftwareRaster.clipX;
		@Pc(7) int clipSpaceY = y - SoftwareRaster.clipY;
		for (@Pc(9) int y0 = clipSpaceY; y0 < clipSpaceY + height; y0++) {
			@Pc(18) int maskX = maskXs[y0];
			@Pc(22) int maskWidth = maskWidths[y0];
			@Pc(24) int clippedWidth = width;
			if (clipSpaceX > maskX) {
				@Pc(31) int dx = clipSpaceX - maskX;
				if (dx >= maskWidth) {
					srcIndex += width + srcStride;
					destIndex += width + destStride;
					continue;
				}
				maskWidth -= dx;
			} else {
				@Pc(56) int dx = maskX - clipSpaceX;
				if (dx >= width) {
					srcIndex += width + srcStride;
					destIndex += width + destStride;
					continue;
				}
				srcIndex += dx;
				clippedWidth = width - dx;
				destIndex += dx;
			}
			@Pc(86) int stride = 0;
			if (clippedWidth < maskWidth) {
				maskWidth = clippedWidth;
			} else {
				stride = clippedWidth - maskWidth;
			}
			for (@Pc(99) int x0 = -maskWidth; x0 < 0; x0++) {
				if (src[srcIndex++] == 0) {
					destIndex++;
				} else {
					SoftwareRaster.pixels[destIndex++] = color;
				}
			}
			srcIndex += stride + srcStride;
			destIndex += stride + destStride;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void blit(@OriginalArg(0) int[] dest, @OriginalArg(1) byte[] src, @OriginalArg(2) int color, @OriginalArg(3) int srcIndex, @OriginalArg(4) int destIndex, @OriginalArg(5) int width, @OriginalArg(6) int height, @OriginalArg(7) int destStride, @OriginalArg(8) int srcStride) {
		@Pc(4) int roundedWidth = -(width >> 2);
		width = -(width & 0x3);
		for (@Pc(12) int y = -height; y < 0; y++) {
			for (@Pc(16) int x = roundedWidth; x < 0; x++) {
				@Pc(21) int srcIndex2 = srcIndex + 1;
				@Pc(26) int destIndex2;
				if (src[srcIndex] == 0) {
					destIndex2 = destIndex + 1;
				} else {
					destIndex2 = destIndex + 1;
					dest[destIndex] = color;
				}
				@Pc(33) int srcIndex3 = srcIndex2 + 1;
				@Pc(38) int destIndex3;
				if (src[srcIndex2] == 0) {
					destIndex3 = destIndex2 + 1;
				} else {
					destIndex3 = destIndex2 + 1;
					dest[destIndex2] = color;
				}
				@Pc(45) int srcIndex4 = srcIndex3 + 1;
				@Pc(50) int destIndex4;
				if (src[srcIndex3] == 0) {
					destIndex4 = destIndex3 + 1;
				} else {
					destIndex4 = destIndex3 + 1;
					dest[destIndex3] = color;
				}
				srcIndex = srcIndex4 + 1;
				if (src[srcIndex4] == 0) {
					destIndex = destIndex4 + 1;
				} else {
					destIndex = destIndex4 + 1;
					dest[destIndex4] = color;
				}
			}
			for (@Pc(70) int x = width; x < 0; x++) {
				if (src[srcIndex++] == 0) {
					destIndex++;
				} else {
					dest[destIndex++] = color;
				}
			}
			destIndex += destStride;
			srcIndex += srcStride;
		}
	}

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "[[B")
	private byte[][] pixels = new byte[256][];

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public SoftwareFont(@OriginalArg(0) byte[] bytes, @OriginalArg(1) int[] xOffsets, @OriginalArg(2) int[] yOffsets, @OriginalArg(3) int[] innerWidths, @OriginalArg(4) int[] innerHeights, @OriginalArg(5) byte[][] pixels) {
		super(bytes, xOffsets, yOffsets, innerWidths, innerHeights);
		this.pixels = pixels;
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B)V")
	public SoftwareFont(@OriginalArg(0) byte[] bytes) {
		super(bytes);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected final void renderGlyphTransparent(@OriginalArg(0) int glyph, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int color, @OriginalArg(6) int alpha) {
		@Pc(5) int destIndex = x + y * SoftwareRaster.width;
		@Pc(9) int destStride = SoftwareRaster.width - width;
		@Pc(11) int srcStride = 0;
		@Pc(13) int srcIndex = 0;
		if (y < SoftwareRaster.clipY) {
			@Pc(20) int dy = SoftwareRaster.clipY - y;
			height -= dy;
			y = SoftwareRaster.clipY;
			srcIndex = dy * width;
			destIndex += dy * SoftwareRaster.width;
		}
		if (y + height > SoftwareRaster.clipHeight) {
			height -= y + height - SoftwareRaster.clipHeight;
		}
		if (x < SoftwareRaster.clipX) {
			@Pc(58) int dx = SoftwareRaster.clipX - x;
			width -= dx;
			x = SoftwareRaster.clipX;
			srcIndex += dx;
			destIndex += dx;
			srcStride = dx;
			destStride += dx;
		}
		if (x + width > SoftwareRaster.clipWidth) {
			@Pc(91) int dx = x + width - SoftwareRaster.clipWidth;
			width -= dx;
			srcStride += dx;
			destStride += dx;
		}
		if (width > 0 && height > 0) {
			blitTransparent(SoftwareRaster.pixels, this.pixels[glyph], color, srcIndex, destIndex, width, height, destStride, srcStride, alpha);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected final void renderGlyph(@OriginalArg(0) int glyph, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int color) {
		@Pc(5) int destIndex = x + y * SoftwareRaster.width;
		@Pc(9) int destStride = SoftwareRaster.width - width;
		@Pc(11) int srcStride = 0;
		@Pc(13) int srcIndex = 0;
		if (y < SoftwareRaster.clipY) {
			@Pc(20) int dy = SoftwareRaster.clipY - y;
			height -= dy;
			y = SoftwareRaster.clipY;
			srcIndex = dy * width;
			destIndex += dy * SoftwareRaster.width;
		}
		if (y + height > SoftwareRaster.clipHeight) {
			height -= y + height - SoftwareRaster.clipHeight;
		}
		if (x < SoftwareRaster.clipX) {
			@Pc(58) int dx = SoftwareRaster.clipX - x;
			width -= dx;
			x = SoftwareRaster.clipX;
			srcIndex += dx;
			destIndex += dx;
			srcStride = dx;
			destStride += dx;
		}
		if (x + width > SoftwareRaster.clipWidth) {
			@Pc(91) int dx = x + width - SoftwareRaster.clipWidth;
			width -= dx;
			srcStride += dx;
			destStride += dx;
		}
		if (width <= 0 || height <= 0) {
			return;
		}
		if (SoftwareRaster.maskXs == null) {
			blit(SoftwareRaster.pixels, this.pixels[glyph], color, srcIndex, destIndex, width, height, destStride, srcStride);
		} else {
			blitMasked(SoftwareRaster.pixels, this.pixels[glyph], x, y, width, height, color, srcIndex, destIndex, destStride, srcStride, SoftwareRaster.maskXs, SoftwareRaster.maskWidths);
		}
	}
}

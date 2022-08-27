import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class WorldMapFont {

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	private static final int ALPHABET_SIZE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "[I")
	private static final int[] CHAR_INDEXES = new int[256];

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "Z")
	private boolean grayscale = false;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	private int dataIndex = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "[B")
	private byte[] data = new byte[100000];

	static {
		for (@Pc(7) int c = 0; c < 256; c++) {
			@Pc(14) int i = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(c);
			if (i == -1) {
				i = 74;
			}
			CHAR_INDEXES[c] = i * 9;
		}
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IZLjava/awt/Component;)V")
	public WorldMapFont(@OriginalArg(0) int size, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component component) {
		this.dataIndex = ALPHABET_SIZE * 9;
		this.grayscale = false;
		@Pc(30) Font bold = new Font("Helvetica", 1, size);
		@Pc(34) FontMetrics boldMetrics = component.getFontMetrics(bold);
		for (@Pc(36) int i = 0; i < ALPHABET_SIZE; i++) {
			this.preRenderGlyph(bold, boldMetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(i), i, false);
		}
		if (this.grayscale) {
			this.dataIndex = ALPHABET_SIZE * 9;
			this.grayscale = false;
			@Pc(70) Font plain = new Font("Helvetica", 0, size);
			@Pc(74) FontMetrics plainMetrics = component.getFontMetrics(plain);
			for (@Pc(76) int i = 0; i < ALPHABET_SIZE; i++) {
				this.preRenderGlyph(plain, plainMetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(i), i, false);
			}
			if (!this.grayscale) {
				this.dataIndex = ALPHABET_SIZE * 9;
				this.grayscale = false;
				for (@Pc(103) int i = 0; i < ALPHABET_SIZE; i++) {
					this.preRenderGlyph(plain, plainMetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(i), i, true);
				}
			}
		}
		@Pc(121) byte[] data = new byte[this.dataIndex];
		for (@Pc(123) int i = 0; i < this.dataIndex; i++) {
			data[i] = this.data[i];
		}
		this.data = data;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;)I")
	public int getStringWidth(@OriginalArg(0) String s) {
		@Pc(1) int width = 0;
		for (@Pc(3) int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '@' && i + 4 < s.length() && s.charAt(i + 4) == '@') {
				i += 4;
			} else if (s.charAt(i) == '~' && i + 4 < s.length() && s.charAt(i + 4) == '~') {
				i += 4;
			} else {
				width += this.data[CHAR_INDEXES[s.charAt(i)] + 7];
			}
		}
		return width;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII[B)V")
	private void renderGlyph(@OriginalArg(0) int index, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int color, @OriginalArg(4) byte[] src) {
		@Pc(7) int local7 = x + src[index + 5];
		@Pc(15) int local15 = y - src[index + 6];
		@Pc(21) int width = src[index + 3];
		@Pc(27) int height = src[index + 4];
		@Pc(47) int srcIndex = src[index] * 16384 + src[index + 1] * 128 + src[index + 2];
		@Pc(53) int destIndex = local7 + local15 * SoftwareRaster.width;
		@Pc(57) int destStride = SoftwareRaster.width - width;
		@Pc(59) int srcStride = 0;
		if (local15 < SoftwareRaster.clipY) {
			@Pc(66) int local66 = SoftwareRaster.clipY - local15;
			height -= local66;
			local15 = SoftwareRaster.clipY;
			srcIndex += local66 * width;
			destIndex += local66 * SoftwareRaster.width;
		}
		if (local15 + height >= SoftwareRaster.clipHeight) {
			height -= local15 + height + 1 - SoftwareRaster.clipHeight;
		}
		if (local7 < SoftwareRaster.clipX) {
			@Pc(106) int local106 = SoftwareRaster.clipX - local7;
			width -= local106;
			local7 = SoftwareRaster.clipX;
			srcIndex += local106;
			destIndex += local106;
			srcStride = local106;
			destStride += local106;
		}
		if (local7 + width >= SoftwareRaster.clipWidth) {
			@Pc(141) int local141 = local7 + width + 1 - SoftwareRaster.clipWidth;
			width -= local141;
			srcStride += local141;
			destStride += local141;
		}
		if (width <= 0 || height <= 0) {
			return;
		}
		if (this.grayscale) {
			this.renderGlyphGrayscale(SoftwareRaster.pixels, src, color, srcIndex, destIndex, width, height, destStride, srcStride);
		} else {
			this.renderGlyphMono(SoftwareRaster.pixels, src, color, srcIndex, destIndex, width, height, destStride, srcStride);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "()I")
	public int method2328() {
		return this.data[6];
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;IIIZ)V")
	public void renderStringCenter(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int color) {
		@Pc(5) int halfWidth = this.getStringWidth(s) / 2;
		@Pc(8) int local8 = this.method2328();
		if (x - halfWidth <= SoftwareRaster.clipWidth && (x + halfWidth >= SoftwareRaster.clipX && (y - local8 <= SoftwareRaster.clipHeight && y >= 0))) {
			this.renderString(s, x - halfWidth, y, color, true);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([I[BIIIIIII)V")
	private void renderGlyphMono(@OriginalArg(0) int[] dest, @OriginalArg(1) byte[] src, @OriginalArg(2) int color, @OriginalArg(3) int srcIndex, @OriginalArg(4) int destIndex, @OriginalArg(5) int width, @OriginalArg(6) int height, @OriginalArg(7) int destStride, @OriginalArg(8) int srcStride) {
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

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "()I")
	public int method2332() {
		return this.data[8] - 1;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(Ljava/lang/String;IIIZ)V")
	private void renderString(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int color, @OriginalArg(4) boolean shadow) {
		if (this.grayscale || color == 0) {
			shadow = false;
		}
		for (@Pc(8) int i = 0; i < s.length(); i++) {
			@Pc(18) int index = CHAR_INDEXES[s.charAt(i)];
			if (shadow) {
				this.renderGlyph(index, x + 1, y, 1, this.data);
				this.renderGlyph(index, x, y + 1, 1, this.data);
			}
			this.renderGlyph(index, x, y, color, this.data);
			x += this.data[index + 7];
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
	private void preRenderGlyph(@OriginalArg(0) Font font, @OriginalArg(1) FontMetrics metrics, @OriginalArg(2) char c, @OriginalArg(3) int id, @OriginalArg(4) boolean shadow) {
		@Pc(3) int imageWidth = metrics.charWidth(c);
		@Pc(5) int width = imageWidth;
		if (shadow) {
			try {
				if (c == '/') {
					shadow = false;
				}
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W') {
					imageWidth++;
				}
			} catch (@Pc(45) Exception ex) {
			}
		}
		@Pc(48) int maxAscent = metrics.getMaxAscent();
		@Pc(54) int imageHeight = metrics.getMaxAscent() + metrics.getMaxDescent();
		@Pc(57) int height = metrics.getHeight();
		@Pc(62) Image image = GameShell.canvas.createImage(imageWidth, imageHeight);
		@Pc(65) Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, imageWidth, imageHeight);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(c + "", 0, maxAscent);
		if (shadow) {
			graphics.drawString(c + "", 1, maxAscent);
		}
		@Pc(111) int[] pixels = new int[imageWidth * imageHeight];
		@Pc(123) PixelGrabber grabber = new PixelGrabber(image, 0, 0, imageWidth, imageHeight, pixels, 0, imageWidth);
		try {
			grabber.grabPixels();
		} catch (@Pc(128) Exception ex) {
		}
		image.flush();
		@Pc(134) int x0 = 0;
		@Pc(136) int y0 = 0;
		@Pc(138) int x1 = imageWidth;
		@Pc(140) int y1 = imageHeight;
		y0:
		for (@Pc(142) int y = 0; y < imageHeight; y++) {
			for (@Pc(147) int x = 0; x < imageWidth; x++) {
				@Pc(158) int color = pixels[x + y * imageWidth];
				if ((color & 0xFFFFFF) != 0) {
					y0 = y;
					break y0;
				}
			}
		}
		x0:
		for (@Pc(171) int x = 0; x < imageWidth; x++) {
			for (@Pc(176) int y = 0; y < imageHeight; y++) {
				@Pc(187) int color = pixels[x + y * imageWidth];
				if ((color & 0xFFFFFF) != 0) {
					x0 = x;
					break x0;
				}
			}
		}
		y1:
		for (@Pc(202) int y = imageHeight - 1; y >= 0; y--) {
			for (@Pc(206) int x = 0; x < imageWidth; x++) {
				@Pc(217) int color = pixels[x + y * imageWidth];
				if ((color & 0xFFFFFF) != 0) {
					y1 = y + 1;
					break y1;
				}
			}
		}
		x1:
		for (@Pc(234) int x = imageWidth - 1; x >= 0; x--) {
			for (@Pc(238) int y = 0; y < imageHeight; y++) {
				@Pc(249) int color = pixels[x + y * imageWidth];
				if ((color & 0xFFFFFF) != 0) {
					x1 = x + 1;
					break x1;
				}
			}
		}
		this.data[id * 9] = (byte) (this.dataIndex / 16384);
		this.data[id * 9 + 1] = (byte) (this.dataIndex / 128 & 0x7F);
		this.data[id * 9 + 2] = (byte) (this.dataIndex & 0x7F);
		this.data[id * 9 + 3] = (byte) (x1 - x0);
		this.data[id * 9 + 4] = (byte) (y1 - y0);
		this.data[id * 9 + 5] = (byte) x0;
		this.data[id * 9 + 6] = (byte) (maxAscent - y0);
		this.data[id * 9 + 7] = (byte) width;
		this.data[id * 9 + 8] = (byte) height;
		for (@Pc(371) int y = y0; y < y1; y++) {
			for (@Pc(376) int x = x0; x < x1; x++) {
				@Pc(389) int blue = pixels[x + y * imageWidth] & 0xFF;
				if (blue > 30 && blue < 230) {
					this.grayscale = true;
				}
				this.data[this.dataIndex++] = (byte) blue;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "([I[BIIIIIII)V")
	private void renderGlyphGrayscale(@OriginalArg(0) int[] dest, @OriginalArg(1) byte[] src, @OriginalArg(2) int color, @OriginalArg(3) int srcIndex, @OriginalArg(4) int destIndex, @OriginalArg(5) int width, @OriginalArg(6) int height, @OriginalArg(7) int destStride, @OriginalArg(8) int srcStride) {
		for (@Pc(2) int y = -height; y < 0; y++) {
			for (@Pc(7) int x = -width; x < 0; x++) {
				@Pc(16) int intensity = src[srcIndex++] & 0xFF;
				if (intensity <= 30) {
					destIndex++;
				} else if (intensity >= 230) {
					dest[destIndex++] = color;
				} else {
					@Pc(32) int backgroundColor = dest[destIndex];
					dest[destIndex++] = ((color & 0xFF00FF) * intensity + (backgroundColor & 0xFF00FF) * (256 - intensity) & 0xFF00FF00) + ((color & 0xFF00) * intensity + (backgroundColor & 0xFF00) * (256 - intensity) & 0xFF0000) >> 8;
				}
			}
			destIndex += destStride;
			srcIndex += srcStride;
		}
	}
}

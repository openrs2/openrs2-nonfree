import java.util.Random;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public abstract class Font extends SecondaryNode {

	@OriginalMember(owner = "client!gl", name = "E", descriptor = "Ljava/lang/StringBuffer;")
	private static final StringBuffer buffer = new StringBuffer(100);

	@OriginalMember(owner = "client!gl", name = "V", descriptor = "[Ljava/lang/String;")
	private static final String[] lines = new String[100];

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
	private static int strikethroughColor = -1;

	@OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
	private static int underlineColor = -1;

	@OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
	private static int alpha = 256;

	@OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
	private static int alphaOverride = 256;

	@OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
	private static int colorOverride = 0;

	@OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
	private static int shadowColorOverride = -1;

	@OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
	private static int color = 0;

	@OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
	private static int shadowColor = -1;

	@OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
	private static int extraSpaceWidth = 0;

	@OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
	private static int spaceWidth = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([[B[[B[I[I[III)I")
	private static int calculateKerning(@OriginalArg(0) byte[][] leftKerning, @OriginalArg(1) byte[][] rightKerning, @OriginalArg(2) int[] glyphYOffsets, @OriginalArg(3) int[] glyphWidths, @OriginalArg(4) int[] glyphHeights, @OriginalArg(5) int firstGlyph, @OriginalArg(6) int secondGlyph) {
		@Pc(3) int firstY0 = glyphYOffsets[firstGlyph];
		@Pc(9) int firstY1 = firstY0 + glyphHeights[firstGlyph];
		@Pc(13) int secondY0 = glyphYOffsets[secondGlyph];
		@Pc(19) int secondY1 = secondY0 + glyphHeights[secondGlyph];
		@Pc(21) int maxY0 = firstY0;
		if (secondY0 > firstY0) {
			maxY0 = secondY0;
		}
		@Pc(28) int minY1 = firstY1;
		if (secondY1 < firstY1) {
			minY1 = secondY1;
		}
		@Pc(37) int kerning = glyphWidths[firstGlyph];
		if (glyphWidths[secondGlyph] < kerning) {
			kerning = glyphWidths[secondGlyph];
		}
		@Pc(50) byte[] right = rightKerning[firstGlyph];
		@Pc(54) byte[] left = leftKerning[secondGlyph];
		@Pc(58) int rightOff = maxY0 - firstY0;
		@Pc(62) int leftOff = maxY0 - secondY0;
		for (@Pc(64) int y = maxY0; y < minY1; y++) {
			@Pc(77) int value = right[rightOff++] + left[leftOff++];
			if (value < kerning) {
				kerning = value;
			}
		}
		return -kerning;
	}

	@OriginalMember(owner = "client!gl", name = "C", descriptor = "[B")
	private byte[] kerning;

	@OriginalMember(owner = "client!gl", name = "D", descriptor = "[Lclient!ma;")
	private IndexedSprite[] nameIcons;

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "[I")
	private int[] nameIconHeights;

	@OriginalMember(owner = "client!gl", name = "H", descriptor = "[I")
	private int[] glyphWidths;

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
	public int lineHeight = 0;

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "[I")
	private int[] spriteXOffsets;

	@OriginalMember(owner = "client!gl", name = "G", descriptor = "[I")
	private int[] spriteYOffsets;

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "[I")
	protected int[] spriteInnerWidths;

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "[I")
	protected int[] spriteInnerHeights;

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
	private int paragraphTopPadding;

	@OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
	private int paragraphBottomPadding;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Font(@OriginalArg(0) byte[] bytes, @OriginalArg(1) int[] xOffsets, @OriginalArg(2) int[] yOffsets, @OriginalArg(3) int[] innerWidths, @OriginalArg(4) int[] innerHeights) {
		this.spriteXOffsets = xOffsets;
		this.spriteYOffsets = yOffsets;
		this.spriteInnerWidths = innerWidths;
		this.spriteInnerHeights = innerHeights;
		this.decode(bytes);
		@Pc(21) int minY0 = Integer.MAX_VALUE;
		@Pc(23) int maxY1 = Integer.MIN_VALUE;
		for (@Pc(25) int i = 0; i < 256; i++) {
			if (this.spriteYOffsets[i] < minY0 && this.spriteInnerHeights[i] != 0) {
				minY0 = this.spriteYOffsets[i];
			}
			if (this.spriteYOffsets[i] + this.spriteInnerHeights[i] > maxY1) {
				maxY1 = this.spriteYOffsets[i] + this.spriteInnerHeights[i];
			}
		}
		this.paragraphTopPadding = this.lineHeight - minY0;
		this.paragraphBottomPadding = maxY1 - this.lineHeight;
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([B)V")
	public Font(@OriginalArg(0) byte[] bytes) {
		this.decode(bytes);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([B)V")
	private void decode(@OriginalArg(0) byte[] bytes) {
		this.glyphWidths = new int[256];
		if (bytes.length == 257) {
			for (@Pc(9) int i = 0; i < this.glyphWidths.length; i++) {
				this.glyphWidths[i] = bytes[i] & 0xFF;
			}
			this.lineHeight = bytes[256] & 0xFF;
			return;
		}
		@Pc(35) int off = 0;
		for (@Pc(37) int i = 0; i < 256; i++) {
			this.glyphWidths[i] = bytes[off++] & 0xFF;
		}
		@Pc(55) int[] glyphHeights = new int[256];
		@Pc(58) int[] glyphYOffsets = new int[256];
		for (@Pc(60) int i = 0; i < 256; i++) {
			glyphHeights[i] = bytes[off++] & 0xFF;
		}
		for (@Pc(76) int i = 0; i < 256; i++) {
			glyphYOffsets[i] = bytes[off++] & 0xFF;
		}
		@Pc(93) byte[][] leftKerning = new byte[256][];
		for (@Pc(95) int i = 0; i < 256; i++) {
			leftKerning[i] = new byte[glyphHeights[i]];
			@Pc(107) byte value = 0;
			for (@Pc(109) int j = 0; j < leftKerning[i].length; j++) {
				value += bytes[off++];
				leftKerning[i][j] = value;
			}
		}
		@Pc(136) byte[][] rightKerning = new byte[256][];
		for (@Pc(138) int i = 0; i < 256; i++) {
			rightKerning[i] = new byte[glyphHeights[i]];
			@Pc(150) byte value = 0;
			for (@Pc(152) int j = 0; j < rightKerning[i].length; j++) {
				value += bytes[off++];
				rightKerning[i][j] = value;
			}
		}
		this.kerning = new byte[65536];
		for (@Pc(182) int i = 0; i < 256; i++) {
			if (i != 32 && i != 160) {
				for (@Pc(194) int j = 0; j < 256; j++) {
					if (j != 32 && j != 160) {
						this.kerning[(i << 8) + j] = (byte) calculateKerning(leftKerning, rightKerning, glyphYOffsets, this.glyphWidths, glyphHeights, i, j);
					}
				}
			}
		}
		this.lineHeight = glyphYOffsets[32] + glyphHeights[32];
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;)I")
	public final int getStringWidth(@OriginalArg(0) String s) {
		if (s == null) {
			return 0;
		}
		@Pc(5) int tagIndex = -1;
		@Pc(7) char prev = 0;
		@Pc(9) int width = 0;
		@Pc(12) int len = s.length();
		for (@Pc(14) int i = 0; i < len; i++) {
			@Pc(21) char c = s.charAt(i);
			if (c == '<') {
				tagIndex = i;
			} else {
				if (c == '>' && tagIndex != -1) {
					@Pc(41) String tag = s.substring(tagIndex + 1, i).toLowerCase();
					tagIndex = -1;
					if (tag.equals("lt")) {
						c = '<';
					} else if (tag.equals("gt")) {
						c = '>';
					} else if (tag.equals("nbsp")) {
						c = ' ';
					} else if (tag.equals("shy")) {
						c = '\u00ad';
					} else if (tag.equals("times")) {
						c = '×';
					} else if (tag.equals("euro")) {
						c = '€';
					} else if (tag.equals("copy")) {
						c = '©';
					} else {
						if (!tag.equals("reg")) {
							if (tag.startsWith("img=")) {
								try {
									@Pc(109) int id = StringUtils.parseInt(tag.substring(4));
									width += this.nameIcons[id].innerWidth;
									prev = '\u0000';
								} catch (@Pc(121) Exception ex) {
								}
							}
							continue;
						}
						c = '®';
					}
				}
				if (tagIndex == -1) {
					@Pc(132) char current = (char) (Cp1252Charset.encodeChar(c) & 0xFF);
					width += this.glyphWidths[current];
					if (this.kerning != null && prev != '\u0000') {
						width += this.kerning[(prev << 8) + current];
					}
					prev = current;
				}
			}
		}
		return width;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIZ)V")
	protected abstract void renderGlyph(@OriginalArg(0) int glyph, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int color);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void render(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y) {
		y -= this.lineHeight;
		@Pc(6) int tagIndex = -1;
		@Pc(8) char prev = 0;
		@Pc(11) int len = s.length();
		for (@Pc(13) int i = 0; i < len; i++) {
			@Pc(20) char c = s.charAt(i);
			if (c == '<') {
				tagIndex = i;
			} else {
				if (c == '>' && tagIndex != -1) {
					@Pc(40) String tag = s.substring(tagIndex + 1, i).toLowerCase();
					tagIndex = -1;
					if (tag.equals("lt")) {
						c = '<';
					} else if (tag.equals("gt")) {
						c = '>';
					} else if (tag.equals("nbsp")) {
						c = ' ';
					} else if (tag.equals("shy")) {
						c = '\u00ad';
					} else if (tag.equals("times")) {
						c = '×';
					} else if (tag.equals("euro")) {
						c = '€';
					} else if (tag.equals("copy")) {
						c = '©';
					} else {
						if (!tag.equals("reg")) {
							if (tag.startsWith("img=")) {
								try {
									@Pc(108) int id = StringUtils.parseInt(tag.substring(4));
									@Pc(113) IndexedSprite sprite = this.nameIcons[id];
									@Pc(124) int height = this.nameIconHeights == null ? sprite.innerHeight : this.nameIconHeights[id];
									if (alphaOverride == 256) {
										sprite.renderTransparent(x, y + this.lineHeight - height);
									} else {
										sprite.renderAlpha(x, y + this.lineHeight - height, alphaOverride);
									}
									x += sprite.innerWidth;
									prev = '\u0000';
								} catch (@Pc(156) Exception ex) {
								}
							} else {
								this.parseTag(tag);
							}
							continue;
						}
						c = '®';
					}
				}
				if (tagIndex == -1) {
					@Pc(171) char current = (char) (Cp1252Charset.encodeChar(c) & 0xFF);
					if (this.kerning != null && prev != '\u0000') {
						x += this.kerning[(prev << 8) + current];
					}
					@Pc(192) int innerWidth = this.spriteInnerWidths[current];
					@Pc(197) int innerHeight = this.spriteInnerHeights[current];
					if (current == ' ') {
						if (spaceWidth > 0) {
							extraSpaceWidth += spaceWidth;
							x += extraSpaceWidth >> 8;
							extraSpaceWidth &= 255;
						}
					} else if (alphaOverride == 256) {
						if (shadowColorOverride != -1) {
							this.renderGlyph(current, x + this.spriteXOffsets[current] + 1, y + this.spriteYOffsets[current] + 1, innerWidth, innerHeight, shadowColorOverride);
						}
						this.renderGlyph(current, x + this.spriteXOffsets[current], y + this.spriteYOffsets[current], innerWidth, innerHeight, colorOverride);
					} else {
						if (shadowColorOverride != -1) {
							this.renderGlyphTransparent(current, x + this.spriteXOffsets[current] + 1, y + this.spriteYOffsets[current] + 1, innerWidth, innerHeight, shadowColorOverride, alphaOverride);
						}
						this.renderGlyphTransparent(current, x + this.spriteXOffsets[current], y + this.spriteYOffsets[current], innerWidth, innerHeight, colorOverride, alphaOverride);
					}
					@Pc(318) int width = this.glyphWidths[current];
					if (strikethroughColor != -1) {
						if (GlRenderer.enabled) {
							GlRaster.drawHorizontalLine(x, y + (int) ((double) this.lineHeight * 0.7D), width, strikethroughColor);
						} else {
							SoftwareRaster.drawHorizontalLine(x, y + (int) ((double) this.lineHeight * 0.7D), width, strikethroughColor);
						}
					}
					if (underlineColor != -1) {
						if (GlRenderer.enabled) {
							GlRaster.drawHorizontalLine(x, y + this.lineHeight + 1, width, underlineColor);
						} else {
							SoftwareRaster.drawHorizontalLine(x, y + this.lineHeight + 1, width, underlineColor);
						}
					}
					x += width;
					prev = current;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
	public final int renderParagraph(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int maxWidth, @OriginalArg(4) int height, @OriginalArg(5) int color, @OriginalArg(6) int shadowColor, @OriginalArg(7) int horizontalAlignment, @OriginalArg(8) int verticalAlignment, @OriginalArg(9) int lineHeight) {
		return this.renderParagraphAlpha(s, x, y, maxWidth, height, color, shadowColor, horizontalAlignment, verticalAlignment, lineHeight);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void renderWave2(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int color, @OriginalArg(5) int t) {
		if (s == null) {
			return;
		}
		this.setColors(color, 0);
		@Pc(9) int len = s.length();
		@Pc(12) int[] xOffs = new int[len];
		@Pc(15) int[] yOffs = new int[len];
		for (@Pc(17) int i = 0; i < len; i++) {
			xOffs[i] = (int) (Math.sin((double) i / 5.0D + (double) t / 5.0D) * 5.0D);
			yOffs[i] = (int) (Math.sin((double) i / 3.0D + (double) t / 5.0D) * 5.0D);
		}
		this.renderOffset(s, x - this.getStringWidth(s) / 2, y, xOffs, yOffs);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void justify(@OriginalArg(0) String s, @OriginalArg(1) int maxWidth) {
		@Pc(1) int spaces = 0;
		@Pc(3) boolean tag = false;
		@Pc(6) int len = s.length();
		for (@Pc(8) int i = 0; i < len; i++) {
			@Pc(15) char c = s.charAt(i);
			if (c == '<') {
				tag = true;
			} else if (c == '>') {
				tag = false;
			} else if (!tag && c == ' ') {
				spaces++;
			}
		}
		if (spaces > 0) {
			spaceWidth = (maxWidth - this.getStringWidth(s) << 8) / spaces;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	private void setColors(@OriginalArg(0) int color, @OriginalArg(1) int shadowColor) {
		strikethroughColor = -1;
		underlineColor = -1;
		Font.shadowColor = shadowColor;
		shadowColorOverride = shadowColor;
		Font.color = color;
		colorOverride = color;
		alpha = 256;
		alphaOverride = 256;
		spaceWidth = 0;
		extraSpaceWidth = 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public final void renderLeft(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int color, @OriginalArg(4) int shadowColor) {
		if (s != null) {
			this.setColors(color, shadowColor);
			this.render(s, x, y);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
	public final int renderParagraphAlpha(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int maxWidth, @OriginalArg(4) int height, @OriginalArg(5) int color, @OriginalArg(6) int shadowColor, @OriginalArg(8) int horizontalAlignment, @OriginalArg(9) int verticalAlignment, @OriginalArg(10) int lineHeight) {
		if (s == null) {
			return 0;
		}
		this.setColors(color, shadowColor, 256);
		if (lineHeight == 0) {
			lineHeight = this.lineHeight;
		}
		@Pc(20) int[] maxWidths = new int[] { maxWidth };
		if (height < this.paragraphTopPadding + this.paragraphBottomPadding + lineHeight && height < lineHeight + lineHeight) {
			maxWidths = null;
		}
		@Pc(42) int lineCount = this.splitParagraph(s, lines, maxWidths);
		if (verticalAlignment == 3 && lineCount == 1) {
			verticalAlignment = 1;
		}
		@Pc(57) int y0;
		if (verticalAlignment == 0) {
			y0 = y + this.paragraphTopPadding;
		} else if (verticalAlignment == 1) {
			y0 = y + this.paragraphTopPadding + (height - this.paragraphTopPadding - this.paragraphBottomPadding - (lineCount - 1) * lineHeight) / 2;
		} else if (verticalAlignment == 2) {
			y0 = y + height - this.paragraphBottomPadding - (lineCount - 1) * lineHeight;
		} else {
			@Pc(118) int extraLineHeight = (height - this.paragraphTopPadding - this.paragraphBottomPadding - (lineCount - 1) * lineHeight) / (lineCount + 1);
			if (extraLineHeight < 0) {
				extraLineHeight = 0;
			}
			y0 = y + this.paragraphTopPadding + extraLineHeight;
			lineHeight += extraLineHeight;
		}
		for (@Pc(135) int i = 0; i < lineCount; i++) {
			if (horizontalAlignment == 0) {
				this.render(lines[i], x, y0);
			} else if (horizontalAlignment == 1) {
				this.render(lines[i], x + (maxWidth - this.getStringWidth(lines[i])) / 2, y0);
			} else if (horizontalAlignment == 2) {
				this.render(lines[i], x + maxWidth - this.getStringWidth(lines[i]), y0);
			} else if (i == lineCount - 1) {
				this.render(lines[i], x, y0);
			} else {
				this.justify(lines[i], maxWidth);
				this.render(lines[i], x, y0);
				spaceWidth = 0;
			}
			y0 += lineHeight;
		}
		return lineCount;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public final int getParagraphWidth(@OriginalArg(0) String s, @OriginalArg(1) int maxWidth) {
		@Pc(10) int lineCount = this.splitParagraph(s, lines, new int[] { maxWidth });
		@Pc(12) int paragraphWidth = 0;
		for (@Pc(14) int i = 0; i < lineCount; i++) {
			@Pc(23) int width = this.getStringWidth(lines[i]);
			if (width > paragraphWidth) {
				paragraphWidth = width;
			}
		}
		return paragraphWidth;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void renderWave(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int color, @OriginalArg(5) int t) {
		if (s == null) {
			return;
		}
		this.setColors(color, 0);
		@Pc(9) int len = s.length();
		@Pc(12) int[] yOffs = new int[len];
		for (@Pc(14) int i = 0; i < len; i++) {
			yOffs[i] = (int) (Math.sin((double) i / 2.0D + (double) t / 5.0D) * 5.0D);
		}
		this.renderOffset(s, x - this.getStringWidth(s) / 2, y, null, yOffs);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
	public final int method2263(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(5) Random random, @OriginalArg(6) int seed) {
		if (s == null) {
			return 0;
		}
		random.setSeed(seed);
		this.setColors(0xFFFFFF, 0, (random.nextInt() & 0x1F) + 0xC0);
		@Pc(20) int len = s.length();
		@Pc(23) int[] xOffs = new int[len];
		@Pc(25) int extraWidth = 0;
		for (@Pc(27) int i = 0; i < len; i++) {
			xOffs[i] = extraWidth;
			if ((random.nextInt() & 0x3) == 0) {
				extraWidth++;
			}
		}
		this.renderOffset(s, x, y, xOffs, null);
		return extraWidth;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIZ)V")
	protected abstract void renderGlyphTransparent(@OriginalArg(0) int glyph, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int color, @OriginalArg(6) int alpha);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void renderShake(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int color, @OriginalArg(5) int t, @OriginalArg(6) int loops) {
		if (s == null) {
			return;
		}
		this.setColors(color, 0);
		@Pc(13) double scale = 7.0D - (double) loops / 8.0D;
		if (scale < 0.0D) {
			scale = 0.0D;
		}
		@Pc(22) int len = s.length();
		@Pc(25) int[] yOffs = new int[len];
		for (@Pc(27) int i = 0; i < len; i++) {
			yOffs[i] = (int) (Math.sin((double) i / 1.5D + (double) t / 1.0D) * scale);
		}
		this.renderOffset(s, x - this.getStringWidth(s) / 2, y, null, yOffs);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([Lclient!ma;[I)V")
	public final void setNameIcons(@OriginalArg(0) IndexedSprite[] nameIcons, @OriginalArg(1) int[] heights) {
		if (heights != null && heights.length != nameIcons.length) {
			throw new IllegalArgumentException();
		}
		this.nameIcons = nameIcons;
		this.nameIconHeights = heights;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
	private void renderOffset(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int[] xOffs, @OriginalArg(4) int[] yOffs) {
		y -= this.lineHeight;
		@Pc(6) int tagIndex = -1;
		@Pc(8) char prev = 0;
		@Pc(10) int offIndex = 0;
		@Pc(13) int len = s.length();
		for (@Pc(15) int i = 0; i < len; i++) {
			@Pc(22) char c = s.charAt(i);
			if (c == '<') {
				tagIndex = i;
			} else {
				if (c == '>' && tagIndex != -1) {
					@Pc(42) String tag = s.substring(tagIndex + 1, i).toLowerCase();
					tagIndex = -1;
					if (tag.equals("lt")) {
						c = '<';
					} else if (tag.equals("gt")) {
						c = '>';
					} else if (tag.equals("nbsp")) {
						c = ' ';
					} else if (tag.equals("shy")) {
						c = '\u00ad';
					} else if (tag.equals("times")) {
						c = '×';
					} else if (tag.equals("euro")) {
						c = '€';
					} else if (tag.equals("copy")) {
						c = '©';
					} else {
						if (!tag.equals("reg")) {
							if (tag.startsWith("img=")) {
								try {
									@Pc(110) int xOff;
									if (xOffs == null) {
										xOff = 0;
									} else {
										xOff = xOffs[offIndex];
									}
									@Pc(119) int yOff;
									if (yOffs == null) {
										yOff = 0;
									} else {
										yOff = yOffs[offIndex];
									}
									offIndex++;
									@Pc(129) int id = StringUtils.parseInt(tag.substring(4));
									@Pc(134) IndexedSprite sprite = this.nameIcons[id];
									@Pc(145) int height = this.nameIconHeights == null ? sprite.innerHeight : this.nameIconHeights[id];
									if (alphaOverride == 256) {
										sprite.renderTransparent(x + xOff, y + this.lineHeight + yOff - height);
									} else {
										sprite.renderAlpha(x + xOff, y + this.lineHeight + yOff - height, alphaOverride);
									}
									x += sprite.innerWidth;
									prev = '\u0000';
								} catch (@Pc(185) Exception ex) {
								}
							} else {
								this.parseTag(tag);
							}
							continue;
						}
						c = '®';
					}
				}
				if (tagIndex == -1) {
					@Pc(200) char current = (char) (Cp1252Charset.encodeChar(c) & 0xFF);
					if (this.kerning != null && prev != '\u0000') {
						x += this.kerning[(prev << 8) + current];
					}
					@Pc(221) int innerWidth = this.spriteInnerWidths[current];
					@Pc(226) int innerHeight = this.spriteInnerHeights[current];
					@Pc(232) int xOff;
					if (xOffs == null) {
						xOff = 0;
					} else {
						xOff = xOffs[offIndex];
					}
					@Pc(241) int yOff;
					if (yOffs == null) {
						yOff = 0;
					} else {
						yOff = yOffs[offIndex];
					}
					offIndex++;
					if (current == ' ') {
						if (spaceWidth > 0) {
							extraSpaceWidth += spaceWidth;
							x += extraSpaceWidth >> 8;
							extraSpaceWidth &= 255;
						}
					} else if (alphaOverride == 256) {
						if (shadowColorOverride != -1) {
							this.renderGlyph(current, x + this.spriteXOffsets[current] + xOff + 1, y + this.spriteYOffsets[current] + yOff + 1, innerWidth, innerHeight, shadowColorOverride);
						}
						this.renderGlyph(current, x + this.spriteXOffsets[current] + xOff, y + this.spriteYOffsets[current] + yOff, innerWidth, innerHeight, colorOverride);
					} else {
						if (shadowColorOverride != -1) {
							this.renderGlyphTransparent(current, x + this.spriteXOffsets[current] + xOff + 1, y + this.spriteYOffsets[current] + yOff + 1, innerWidth, innerHeight, shadowColorOverride, alphaOverride);
						}
						this.renderGlyphTransparent(current, x + this.spriteXOffsets[current] + xOff, y + this.spriteYOffsets[current] + yOff, innerWidth, innerHeight, colorOverride, alphaOverride);
					}
					@Pc(382) int width = this.glyphWidths[current];
					if (strikethroughColor != -1) {
						if (GlRenderer.enabled) {
							GlRaster.drawHorizontalLine(x, y + (int) ((double) this.lineHeight * 0.7D), width, strikethroughColor);
						} else {
							SoftwareRaster.drawHorizontalLine(x, y + (int) ((double) this.lineHeight * 0.7D), width, strikethroughColor);
						}
					}
					if (underlineColor != -1) {
						if (GlRenderer.enabled) {
							GlRaster.drawHorizontalLine(x, y + this.lineHeight, width, underlineColor);
						} else {
							SoftwareRaster.drawHorizontalLine(x, y + this.lineHeight, width, underlineColor);
						}
					}
					x += width;
					prev = current;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
	public final int method2269(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int color, @OriginalArg(6) int shadowColor, @OriginalArg(7) int horizontalAlignment, @OriginalArg(8) int verticalAlignment, @OriginalArg(9) Random random, @OriginalArg(10) int seed, @OriginalArg(11) int[] bounds) {
		if (s == null) {
			return 0;
		}
		random.setSeed(seed);
		this.setColors(color, shadowColor, (random.nextInt() & 0x1F) + 0xC0);
		@Pc(20) int len = s.length();
		@Pc(23) int[] xOffs = new int[len];
		@Pc(25) int extraWidth = 0;
		for (@Pc(27) int i = 0; i < len; i++) {
			xOffs[i] = extraWidth;
			if ((random.nextInt() & 0x3) == 0) {
				extraWidth++;
			}
		}
		@Pc(44) int x0 = x;
		@Pc(49) int y0 = y + this.paragraphTopPadding;
		@Pc(51) int width0 = -1;
		if (verticalAlignment == 1) {
			y0 += (height - this.paragraphTopPadding - this.paragraphBottomPadding) / 2;
		} else if (verticalAlignment == 2) {
			y0 = y + height - this.paragraphBottomPadding;
		}
		if (horizontalAlignment == 1) {
			width0 = this.getStringWidth(s) + extraWidth;
			x0 = x + (width - width0) / 2;
		} else if (horizontalAlignment == 2) {
			width0 = this.getStringWidth(s) + extraWidth;
			x0 = x + width - width0;
		}
		this.renderOffset(s, x0, y0, xOffs, null);
		if (bounds != null) {
			if (width0 == -1) {
				width0 = this.getStringWidth(s) + extraWidth;
			}
			bounds[0] = x0;
			bounds[1] = y0 - this.paragraphTopPadding;
			bounds[2] = width0;
			bounds[3] = this.paragraphTopPadding + this.paragraphBottomPadding;
		}
		return extraWidth;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public final void renderCenter(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int color, @OriginalArg(4) int shadowColor) {
		if (s != null) {
			this.setColors(color, shadowColor);
			this.render(s, x - this.getStringWidth(s) / 2, y);
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;II)I")
	public final int getParagraphHeight(@OriginalArg(0) String s) {
		@Pc(4) int lineHeight = this.lineHeight;
		@Pc(15) int lineCount = this.splitParagraph(s, lines, new int[] { 100 });
		@Pc(21) int height = (lineCount - 1) * lineHeight;
		return this.paragraphTopPadding + height + this.paragraphBottomPadding;
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(Ljava/lang/String;I)I")
	public final int getParagraphLineCount(@OriginalArg(0) String s, @OriginalArg(1) int width) {
		return this.splitParagraph(s, lines, new int[] { width });
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
	public final void renderRight(@OriginalArg(0) String s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int color, @OriginalArg(4) int shadowColor) {
		if (s != null) {
			this.setColors(color, shadowColor);
			this.render(s, x - this.getStringWidth(s), y);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	private void setColors(@OriginalArg(0) int color, @OriginalArg(1) int shadowColor, @OriginalArg(2) int alpha) {
		strikethroughColor = -1;
		underlineColor = -1;
		Font.shadowColor = shadowColor;
		shadowColorOverride = shadowColor;
		Font.color = color;
		colorOverride = color;
		Font.alpha = alpha;
		alphaOverride = alpha;
		spaceWidth = 0;
		extraSpaceWidth = 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(C)I")
	private int getGlyphWidth(@OriginalArg(0) char c) {
		return this.glyphWidths[Cp1252Charset.encodeChar(c) & 0xFF];
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(Ljava/lang/String;)V")
	private void parseTag(@OriginalArg(0) String tag) {
		try {
			if (tag.startsWith("col=")) {
				colorOverride = StringUtils.parseHexString(tag.substring(4));
			} else if (tag.equals("/col")) {
				colorOverride = color;
			} else if (tag.startsWith("trans=")) {
				alphaOverride = StringUtils.parseInt(tag.substring(6));
			} else if (tag.equals("/trans")) {
				alphaOverride = alpha;
			} else if (tag.startsWith("str=")) {
				strikethroughColor = StringUtils.parseHexString(tag.substring(4));
			} else if (tag.equals("str")) {
				strikethroughColor = 0x800000;
			} else if (tag.equals("/str")) {
				strikethroughColor = -1;
			} else if (tag.startsWith("u=")) {
				underlineColor = StringUtils.parseHexString(tag.substring(2));
			} else if (tag.equals("u")) {
				underlineColor = 0;
			} else if (tag.equals("/u")) {
				underlineColor = -1;
			} else if (tag.startsWith("shad=")) {
				shadowColorOverride = StringUtils.parseHexString(tag.substring(5));
			} else if (tag.equals("shad")) {
				shadowColorOverride = 0;
			} else if (tag.equals("/shad")) {
				shadowColorOverride = shadowColor;
			} else if (tag.equals("br")) {
				this.setColors(color, shadowColor, alpha);
			}
		} catch (@Pc(125) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public final int splitParagraph(@OriginalArg(0) String s, @OriginalArg(2) String[] lines, @OriginalArg(1) int[] maxWidths) {
		if (s == null) {
			return 0;
		}
		StringUtils.clearBuffer(buffer);
		@Pc(11) int width = 0;
		@Pc(13) int lineIndex = 0;
		@Pc(15) int breakIndex = -1;
		@Pc(17) int breakWidth = 0;
		@Pc(19) byte breakSkip = 0;
		@Pc(21) int tagIndex = -1;
		@Pc(23) char prev = 0;
		@Pc(25) int line = 0;
		@Pc(28) int len = s.length();
		for (@Pc(30) int i = 0; i < len; i++) {
			@Pc(37) char c = s.charAt(i);
			if (c == '<') {
				tagIndex = i;
			} else {
				if (c == '>' && tagIndex != -1) {
					@Pc(57) String tag = s.substring(tagIndex + 1, i).toLowerCase();
					tagIndex = -1;
					buffer.append('<');
					buffer.append(tag);
					buffer.append('>');
					if (tag.equals("br")) {
						lines[line] = buffer.toString().substring(lineIndex, buffer.length());
						line++;
						lineIndex = buffer.length();
						width = 0;
						breakIndex = -1;
						prev = '\u0000';
					} else if (tag.equals("lt")) {
						width += this.getGlyphWidth('<');
						if (this.kerning != null && prev != '\u0000') {
							width += this.kerning[(prev << 8) + 60];
						}
						prev = '<';
					} else if (tag.equals("gt")) {
						width += this.getGlyphWidth('>');
						if (this.kerning != null && prev != '\u0000') {
							width += this.kerning[(prev << 8) + 62];
						}
						prev = '>';
					} else if (tag.equals("nbsp")) {
						width += this.getGlyphWidth(' ');
						if (this.kerning != null && prev != '\u0000') {
							width += this.kerning[(prev << 8) + 160];
						}
						prev = ' ';
					} else if (tag.equals("shy")) {
						width += this.getGlyphWidth('\u00ad');
						if (this.kerning != null && prev != '\u0000') {
							width += this.kerning[(prev << 8) + 173];
						}
						prev = '\u00ad';
					} else if (tag.equals("times")) {
						width += this.getGlyphWidth('×');
						if (this.kerning != null && prev != '\u0000') {
							width += this.kerning[(prev << 8) + 215];
						}
						prev = '×';
					} else if (tag.equals("euro")) {
						width += this.getGlyphWidth('€');
						if (this.kerning != null && prev != '\u0000') {
							width += this.kerning[(prev << 8) + 128];
						}
						prev = '€';
					} else if (tag.equals("copy")) {
						width += this.getGlyphWidth('©');
						if (this.kerning != null && prev != '\u0000') {
							width += this.kerning[(prev << 8) + 169];
						}
						prev = '©';
					} else if (tag.equals("reg")) {
						width += this.getGlyphWidth('®');
						if (this.kerning != null && prev != '\u0000') {
							width += this.kerning[(prev << 8) + 174];
						}
						prev = '®';
					} else if (tag.startsWith("img=")) {
						try {
							@Pc(337) int id = StringUtils.parseInt(tag.substring(4));
							width += this.nameIcons[id].innerWidth;
							prev = '\u0000';
						} catch (@Pc(349) Exception ex) {
						}
					}
					c = '\u0000';
				}
				if (tagIndex == -1) {
					if (c != '\u0000') {
						buffer.append(c);
						c = (char) (Cp1252Charset.encodeChar(c) & 0xFF);
						width += this.glyphWidths[c];
						if (this.kerning != null && prev != '\u0000') {
							width += this.kerning[(prev << 8) + c];
						}
						prev = c;
					}
					if (c == ' ') {
						breakIndex = buffer.length();
						breakWidth = width;
						breakSkip = 1;
					}
					if (maxWidths != null && width > maxWidths[line < maxWidths.length ? line : maxWidths.length - 1] && breakIndex >= 0) {
						lines[line] = buffer.toString().substring(lineIndex, breakIndex - breakSkip);
						line++;
						lineIndex = breakIndex;
						breakIndex = -1;
						width -= breakWidth;
						prev = '\u0000';
					}
					if (c == '-') {
						breakIndex = buffer.length();
						breakWidth = width;
						breakSkip = 0;
					}
				}
			}
		}
		if (buffer.length() > lineIndex) {
			lines[line] = buffer.toString().substring(lineIndex, buffer.length());
			line++;
		}
		return line;
	}
}

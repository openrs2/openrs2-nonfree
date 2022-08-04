import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Texture extends SecondaryNode {

	@OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
	public static final int spriteGroupId = -1;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "Lclient!kj;")
	public static TextureProvider provider;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "Lclient!fh;")
	public static Js5 spritesArchive;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "D")
	private static double brightness = -1.0D;

	@OriginalMember(owner = "client!kn", name = "G", descriptor = "[I")
	private static final int[] brightnessMap = new int[256];

	@OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
	public static int width;

	@OriginalMember(owner = "client!bl", name = "eb", descriptor = "I")
	public static int height;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public static int widthMask;

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
	public static int heightMask;

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "[I")
	public static int[] normalisedX;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
	public static int[] normalisedY;

	@OriginalMember(owner = "client!rg", name = "gb", descriptor = "I")
	public static int widthTimes32;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(DB)V")
	private static void setBrightness(@OriginalArg(0) double brightness) {
		if (Texture.brightness == brightness) {
			return;
		}
		for (@Pc(13) int i = 0; i < 256; i++) {
			@Pc(28) int j = (int) (Math.pow((double) i / 255.0D, brightness) * 255.0D);
			brightnessMap[i] = j > 255 ? 255 : j;
		}
		Texture.brightness = brightness;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZ)V")
	public static void setSize(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		if (width != Texture.width) {
			normalisedX = new int[width];
			for (@Pc(14) int x = 0; x < width; x++) {
				normalisedX[x] = (x << 12) / width;
			}
			widthMask = width - 1;
			Texture.width = width;
			widthTimes32 = width * 32;
		}
		if (height == Texture.height) {
			return;
		}
		if (height == Texture.width) {
			normalisedY = normalisedX;
		} else {
			normalisedY = new int[height];
			for (@Pc(58) int y = 0; y < height; y++) {
				normalisedY[y] = (y << 12) / height;
			}
		}
		heightMask = height - 1;
		Texture.height = height;
	}

	@OriginalMember(owner = "client!ln", name = "S", descriptor = "[I")
	private final int[] spriteIds;

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "[I")
	private final int[] textureIds;

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "Lclient!jo;")
	private final TextureOp brightnessOp;

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "Lclient!jo;")
	private final TextureOp colorOp;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "Lclient!jo;")
	private final TextureOp alphaOp;

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "[Lclient!jo;")
	private final TextureOp[] ops;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Texture(@OriginalArg(0) Buffer buffer) {
		@Pc(5) int spriteCount = 0;
		@Pc(9) int opCount = buffer.readUnsignedByte();
		this.ops = new TextureOp[opCount];
		@Pc(15) int textureCount = 0;
		@Pc(18) int[][] childOpIds = new int[opCount][];
		for (@Pc(20) int i = 0; i < opCount; i++) {
			@Pc(27) TextureOp op = TextureOp.decode(buffer);
			if (op.getSpriteId() >= 0) {
				spriteCount++;
			}
			if (op.getTextureId() >= 0) {
				textureCount++;
			}
			@Pc(46) int childOpsCount = op.childOps.length;
			childOpIds[i] = new int[childOpsCount];
			for (@Pc(53) int j = 0; j < childOpsCount; j++) {
				childOpIds[i][j] = buffer.readUnsignedByte();
			}
			this.ops[i] = op;
		}
		this.textureIds = new int[textureCount];
		@Pc(85) int textureIdsIndex = 0;
		this.spriteIds = new int[spriteCount];
		@Pc(91) int spriteIdsIndex = 0;
		for (@Pc(93) int i = 0; i < opCount; i++) {
			@Pc(101) TextureOp op = this.ops[i];
			@Pc(105) int childOpsCount = op.childOps.length;
			for (@Pc(107) int j = 0; j < childOpsCount; j++) {
				op.childOps[j] = this.ops[childOpIds[i][j]];
			}
			@Pc(129) int spriteId = op.getSpriteId();
			@Pc(133) int textureId = op.getTextureId();
			if (spriteId > 0) {
				this.spriteIds[spriteIdsIndex++] = spriteId;
			}
			if (textureId > 0) {
				this.textureIds[textureIdsIndex++] = textureId;
			}
			childOpIds[i] = null;
		}
		this.colorOp = this.ops[buffer.readUnsignedByte()];
		this.alphaOp = this.ops[buffer.readUnsignedByte()];
		this.brightnessOp = this.ops[buffer.readUnsignedByte()];
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(DIILclient!kj;Lclient!fh;IZ)Lclient!vn;")
	public final SoftwareSprite getSprite(@OriginalArg(2) int width, @OriginalArg(5) int height, @OriginalArg(0) double brightness, @OriginalArg(3) TextureProvider provider, @OriginalArg(4) Js5 spritesArchive) {
		setBrightness(brightness);
		Texture.provider = provider;
		Texture.spritesArchive = spritesArchive;
		setSize(width, height);
		@Pc(27) SoftwareSprite sprite = new SoftwareSprite(width, height);
		for (@Pc(29) int i = 0; i < this.ops.length; i++) {
			this.ops[i].createImageCache(height, width);
		}
		@Pc(51) int index = 0;
		for (@Pc(53) int y = 0; y < height; y++) {
			@Pc(73) int[] reds;
			@Pc(75) int[] greens;
			@Pc(77) int[] blues;
			if (this.colorOp.monochrome) {
				@Pc(71) int[] output = this.colorOp.getMonochromeOutput(y);
				reds = output;
				greens = output;
				blues = output;
			} else {
				@Pc(85) int[][] output = this.colorOp.getColorOutput(y);
				greens = output[1];
				blues = output[2];
				reds = output[0];
			}
			for (@Pc(101) int x = width - 1; x >= 0; x--) {
				@Pc(112) int red = reds[x] >> 4;
				@Pc(118) int green = greens[x] >> 4;
				if (green > 255) {
					green = 255;
				}
				if (green < 0) {
					green = 0;
				}
				if (red > 255) {
					red = 255;
				}
				if (red < 0) {
					red = 0;
				}
				@Pc(148) int red2 = brightnessMap[red];
				@Pc(152) int green2 = brightnessMap[green];
				@Pc(158) int blue = blues[x] >> 4;
				if (blue > 255) {
					blue = 255;
				}
				if (blue < 0) {
					blue = 0;
				}
				@Pc(175) int blue2 = brightnessMap[blue];
				sprite.pixels[index++] = blue2 + (red2 << 16) + (green2 << 8);
			}
		}
		for (@Pc(207) int i = 0; i < this.ops.length; i++) {
			this.ops[i].clearImageCache();
		}
		return sprite;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBILclient!fh;DLclient!kj;Z)[I")
	public final int[] getPixelsAlpha(@OriginalArg(0) int width, @OriginalArg(2) int height, @OriginalArg(4) double brightness, @OriginalArg(5) TextureProvider provider, @OriginalArg(3) Js5 spritesArchive, @OriginalArg(6) boolean columnMajor) {
		@Pc(12) int[] pixels = new int[height * width * 4];
		setBrightness(brightness);
		Texture.provider = provider;
		Texture.spritesArchive = spritesArchive;
		setSize(width, height);
		for (@Pc(25) int i = 0; i < this.ops.length; i++) {
			this.ops[i].createImageCache(height, width);
		}
		@Pc(47) int index = 0;
		for (@Pc(57) int y = 0; y < height; y++) {
			if (columnMajor) {
				index = y;
			}
			@Pc(83) int[] reds;
			@Pc(91) int[] greens;
			@Pc(87) int[] blues;
			if (this.colorOp.monochrome) {
				@Pc(99) int[] output = this.colorOp.getMonochromeOutput(y);
				greens = output;
				reds = output;
				blues = output;
			} else {
				@Pc(79) int[][] output = this.colorOp.getColorOutput(y);
				reds = output[0];
				blues = output[2];
				greens = output[1];
			}
			@Pc(117) int[] alphas;
			if (this.alphaOp.monochrome) {
				alphas = this.alphaOp.getMonochromeOutput(y);
			} else {
				alphas = this.alphaOp.getColorOutput(y)[0];
			}
			for (@Pc(129) int x = width - 1; x >= 0; x--) {
				@Pc(137) int red = reds[x] >> 4;
				if (red > 255) {
					red = 255;
				}
				if (red < 0) {
					red = 0;
				}
				@Pc(153) int green = greens[x] >> 4;
				@Pc(159) int blue = blues[x] >> 4;
				if (green > 255) {
					green = 255;
				}
				@Pc(168) int red2 = brightnessMap[red];
				if (green < 0) {
					green = 0;
				}
				if (blue > 255) {
					blue = 255;
				}
				@Pc(185) int green2 = brightnessMap[green];
				if (blue < 0) {
					blue = 0;
				}
				@Pc(194) int blue2 = brightnessMap[blue];
				@Pc(208) int alpha;
				if (red2 == 0 && green2 == 0 && blue2 == 0) {
					alpha = 0;
				} else {
					alpha = alphas[x] >> 4;
					if (alpha > 255) {
						alpha = 255;
					}
					if (alpha < 0) {
						alpha = 0;
					}
				}
				pixels[index++] = (green2 << 8) + (red2 << 16) + (alpha << 24) + blue2;
				if (columnMajor) {
					index += width - 1;
				}
			}
		}
		for (@Pc(261) int i = 0; i < this.ops.length; i++) {
			this.ops[i].clearImageCache();
		}
		return pixels;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBZLclient!kj;Lclient!fh;I)[F")
	public final float[] getBloomPixels(@OriginalArg(5) int width, @OriginalArg(0) int height, @OriginalArg(3) TextureProvider provider, @OriginalArg(4) Js5 spritesArchive, @OriginalArg(2) boolean columnMajor) {
		Texture.provider = provider;
		@Pc(29) float[] pixels = new float[width * 4 * height];
		Texture.spritesArchive = spritesArchive;
		setSize(width, height);
		for (@Pc(37) int i = 0; i < this.ops.length; i++) {
			this.ops[i].createImageCache(height, width);
		}
		@Pc(59) int index = 0;
		for (@Pc(61) int y = 0; y < height; y++) {
			if (columnMajor) {
				index = y << 2;
			}
			@Pc(89) int[] reds;
			@Pc(85) int[] greens;
			@Pc(93) int[] blues;
			if (this.colorOp.monochrome) {
				@Pc(101) int[] output = this.colorOp.getMonochromeOutput(y);
				blues = output;
				greens = output;
				reds = output;
			} else {
				@Pc(81) int[][] output = this.colorOp.getColorOutput(y);
				greens = output[1];
				reds = output[0];
				blues = output[2];
			}
			@Pc(117) int[] alphas;
			if (this.alphaOp.monochrome) {
				alphas = this.alphaOp.getMonochromeOutput(y);
			} else {
				alphas = this.alphaOp.getColorOutput(y)[0];
			}
			@Pc(137) int[] brightnesses;
			if (this.brightnessOp.monochrome) {
				brightnesses = this.brightnessOp.getMonochromeOutput(y);
			} else {
				brightnesses = this.brightnessOp.getColorOutput(y)[0];
			}
			for (@Pc(151) int x = width - 1; x >= 0; x--) {
				@Pc(163) float alpha = (float) alphas[x] / 4096.0F;
				@Pc(176) float brightness = ((float) brightnesses[x] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (alpha < 0.0F) {
					alpha = 0.0F;
				} else if (alpha > 1.0F) {
					alpha = 1.0F;
				}
				@Pc(193) int index2 = index + 1;
				pixels[index] = (float) reds[x] * brightness;
				pixels[index2++] = (float) greens[x] * brightness;
				pixels[index2++] = (float) blues[x] * brightness;
				index = index2 + 1;
				pixels[index2] = alpha;
				if (columnMajor) {
					index += (width << 2) - 4;
				}
			}
		}
		for (@Pc(243) int i = 0; i < this.ops.length; i++) {
			this.ops[i].clearImageCache();
		}
		return pixels;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!kj;Lclient!fh;I)Z")
	public final boolean isReady(@OriginalArg(0) TextureProvider provider, @OriginalArg(1) Js5 spritesArchive) {
		if (spriteGroupId > 0) {
			for (@Pc(26) int i = 0; i < this.spriteIds.length; i++) {
				if (!spritesArchive.isFileReady(spriteGroupId, this.spriteIds[i])) {
					return false;
				}
			}
		} else {
			for (@Pc(49) int i = 0; i < this.spriteIds.length; i++) {
				if (!spritesArchive.isFileReady(this.spriteIds[i])) {
					return false;
				}
			}
		}
		for (@Pc(69) int i = 0; i < this.textureIds.length; i++) {
			if (!provider.isTextureReady(this.textureIds[i])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!kj;Lclient!fh;IDIZ)Lclient!jn;")
	public final SoftwareAlphaSprite getAlphaSprite(@OriginalArg(5) int width, @OriginalArg(0) int height, @OriginalArg(4) double brightness, @OriginalArg(1) TextureProvider provider, @OriginalArg(2) Js5 spritesArchive) {
		setBrightness(brightness);
		Texture.provider = provider;
		Texture.spritesArchive = spritesArchive;
		setSize(width, height);
		@Pc(30) SoftwareAlphaSprite sprite = new SoftwareAlphaSprite(width, height);
		for (@Pc(32) int i = 0; i < this.ops.length; i++) {
			this.ops[i].createImageCache(height, width);
		}
		@Pc(54) int index = 0;
		for (@Pc(56) int y = 0; y < height; y++) {
			@Pc(81) int[] reds;
			@Pc(77) int[] greens;
			@Pc(79) int[] blues;
			if (this.colorOp.monochrome) {
				@Pc(75) int[] output = this.colorOp.getMonochromeOutput(y);
				greens = output;
				blues = output;
				reds = output;
			} else {
				@Pc(89) int[][] output = this.colorOp.getColorOutput(y);
				reds = output[0];
				greens = output[1];
				blues = output[2];
			}
			@Pc(113) int[] alphas;
			if (this.alphaOp.monochrome) {
				alphas = this.alphaOp.getMonochromeOutput(y);
			} else {
				alphas = this.alphaOp.getColorOutput(y)[0];
			}
			for (@Pc(125) int x = width - 1; x >= 0; x--) {
				@Pc(136) int red = reds[x] >> 4;
				@Pc(142) int blue = blues[x] >> 4;
				if (red > 255) {
					red = 255;
				}
				@Pc(153) int green = greens[x] >> 4;
				if (green > 255) {
					green = 255;
				}
				if (blue > 255) {
					blue = 255;
				}
				if (red < 0) {
					red = 0;
				}
				if (blue < 0) {
					blue = 0;
				}
				@Pc(184) int blue2 = brightnessMap[blue];
				@Pc(188) int red2 = brightnessMap[red];
				if (green < 0) {
					green = 0;
				}
				@Pc(197) int green2 = brightnessMap[green];
				@Pc(214) int alpha;
				if (red2 == 0 && green2 == 0 && blue2 == 0) {
					alpha = 0;
				} else {
					alpha = alphas[x] >> 4;
					if (alpha > 255) {
						alpha = 255;
					}
					if (alpha < 0) {
						alpha = 0;
					}
				}
				sprite.pixels[index++] = (green2 << 8) + (alpha << 24) + (red2 << 16) + blue2;
			}
		}
		for (@Pc(271) int i = 0; i < this.ops.length; i++) {
			this.ops[i].clearImageCache();
		}
		return sprite;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(DZILclient!fh;Lclient!kj;IZI)[I")
	public final int[] getPixels(@OriginalArg(7) int width, @OriginalArg(5) int height, @OriginalArg(0) double brightness, @OriginalArg(4) TextureProvider provider, @OriginalArg(3) Js5 spritesArchive, @OriginalArg(1) boolean columnMajor, @OriginalArg(6) boolean flipHorizontal) {
		setBrightness(brightness);
		Texture.provider = provider;
		Texture.spritesArchive = spritesArchive;
		setSize(width, height);
		@Pc(21) int[] pixels = new int[width * height];
		for (@Pc(23) int i = 0; i < this.ops.length; i++) {
			this.ops[i].createImageCache(height, width);
		}
		@Pc(45) int x1;
		@Pc(43) byte dx;
		@Pc(47) int x0;
		if (flipHorizontal) {
			x0 = width - 1;
			x1 = -1;
			dx = -1;
		} else {
			dx = 1;
			x1 = width;
			x0 = 0;
		}
		@Pc(59) int index = 0;
		for (@Pc(61) int y = 0; y < height; y++) {
			if (columnMajor) {
				index = y;
			}
			@Pc(88) int[] reds;
			@Pc(96) int[] greens;
			@Pc(92) int[] blues;
			if (this.colorOp.monochrome) {
				@Pc(104) int[] output = this.colorOp.getMonochromeOutput(y);
				greens = output;
				blues = output;
				reds = output;
			} else {
				@Pc(84) int[][] output = this.colorOp.getColorOutput(y);
				reds = output[0];
				blues = output[2];
				greens = output[1];
			}
			for (@Pc(112) int x = x0; x != x1; x += dx) {
				@Pc(125) int red = reds[x] >> 4;
				@Pc(131) int green = greens[x] >> 4;
				if (green > 255) {
					green = 255;
				}
				@Pc(142) int blue = blues[x] >> 4;
				if (red > 255) {
					red = 255;
				}
				if (blue > 255) {
					blue = 255;
				}
				if (green < 0) {
					green = 0;
				}
				if (red < 0) {
					red = 0;
				}
				@Pc(172) int green2 = brightnessMap[green];
				@Pc(176) int red2 = brightnessMap[red];
				if (blue < 0) {
					blue = 0;
				}
				@Pc(188) int blue2 = brightnessMap[blue];
				pixels[index++] = blue2 + (red2 << 16) + (green2 << 8);
				if (columnMajor) {
					index += width - 1;
				}
			}
		}
		for (@Pc(226) int i = 0; i < this.ops.length; i++) {
			this.ops[i].clearImageCache();
		}
		return pixels;
	}
}

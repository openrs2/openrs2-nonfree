import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class SpriteLoader {
	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	private static int frames;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	private static int width;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	private static int height;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "[I")
	private static int[] xOffsets;

	@OriginalMember(owner = "client!nh", name = "W", descriptor = "[I")
	private static int[] yOffsets;

	@OriginalMember(owner = "client!hk", name = "S", descriptor = "[I")
	private static int[] innerWidths;

	@OriginalMember(owner = "client!vm", name = "V", descriptor = "[I")
	private static int[] innerHeights;

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "[I")
	private static int[] palette;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "[[B")
	private static byte[][] pixels;

	@OriginalMember(owner = "client!jo", name = "P", descriptor = "[[B")
	private static byte[][] alpha;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "[Z")
	private static boolean[] hasAlpha;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!fh;)Lclient!uj;")
	public static Sprite loadSpriteAutoDetect(@OriginalArg(2) Js5 archive, @OriginalArg(1) int id) {
		return decode(archive, id) ? createSprite() : null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIBLclient!fh;)Lclient!uj;")
	public static Sprite loadSprite(@OriginalArg(3) Js5 archive, @OriginalArg(0) int id) {
		return decode(archive, id, 0) ? createSprite() : null;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!fh;BII)Lclient!vn;")
	public static SoftwareSprite loadSoftwareSprite(@OriginalArg(0) Js5 archive, @OriginalArg(2) int groupId, @OriginalArg(3) int fileId) {
		return decode(archive, groupId, fileId) ? createSoftwareSprite() : null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!fh;IB)Lclient!vn;")
	public static SoftwareSprite loadSoftwareSpriteAutoDetect(@OriginalArg(0) Js5 archive, @OriginalArg(1) int id) {
		return decode(archive, id) ? createSoftwareSprite() : null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!fh;IZI)Lclient!vn;")
	public static SoftwareSprite loadSoftwareAlphaSprite(@OriginalArg(0) Js5 archive, @OriginalArg(1) int id) {
		return decode(archive, id, 0) ? createSoftwareAlphaSprite() : null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!fh;I)Lclient!ma;")
	public static IndexedSprite loadIndexedSpriteAutoDetect(@OriginalArg(1) Js5 archive, @OriginalArg(2) int id) {
		return decode(archive, id) ? createIndexedSprite() : null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!fh;I)Lclient!fe;")
	public static SoftwareIndexedSprite loadSoftwareIndexedSprite(@OriginalArg(2) Js5 archive, @OriginalArg(3) int id) {
		return decode(archive, id, 0) ? createSoftwareIndexedSprite() : null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!fh;II)[Lclient!uj;")
	public static Sprite[] loadSprites(@OriginalArg(1) Js5 archive, @OriginalArg(0) int id) {
		return decode(archive, id, 0) ? createSprites() : null;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!fh;BII)[Lclient!uj;")
	public static Sprite[] loadAlphaSprites(@OriginalArg(0) Js5 archive, @OriginalArg(3) int id) {
		return decode(archive, id, 0) ? createAlphaSprites() : null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIBLclient!fh;)[Lclient!vn;")
	public static SoftwareSprite[] loadSoftwareSprites(@OriginalArg(3) Js5 archive, @OriginalArg(1) int id) {
		return decode(archive, id, 0) ? createSoftwareSprites() : null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!fh;III)[Lclient!ma;")
	public static IndexedSprite[] loadIndexedSprites(@OriginalArg(0) Js5 sprite, @OriginalArg(1) int id) {
		return decode(sprite, id, 0) ? createIndexedSprites() : null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!fh;BII)[Lclient!fe;")
	public static SoftwareIndexedSprite[] loadSoftwareIndexedSprites(@OriginalArg(0) Js5 archive, @OriginalArg(3) int id) {
		return decode(archive, id, 0) ? createSoftwareIndexedSprites() : null;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fh;IB)[Lclient!fe;")
	public static SoftwareIndexedSprite[] loadSoftwareIndexedSpritesAutoDetect(@OriginalArg(0) Js5 archive, @OriginalArg(1) int id) {
		return decode(archive, id) ? createSoftwareIndexedSprites() : null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!fh;Lclient!fh;III)Lclient!gl;")
	public static Font loadFont(@OriginalArg(0) Js5 spritesArchive, @OriginalArg(1) Js5 fontMetricsArchive, @OriginalArg(3) int id) {
		return decode(spritesArchive, id, 0) ? createFont(fontMetricsArchive.fetchFile(id, 0)) : null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!fh;ILclient!fh;I)Lclient!ke;")
	public static SoftwareFont loadSoftwareFont(@OriginalArg(3) Js5 spritesArchive, @OriginalArg(1) Js5 fontMetricsArchive, @OriginalArg(2) int id) {
		return decode(spritesArchive, id, 0) ? createSoftwareFont(fontMetricsArchive.fetchFile(id, 0)) : null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fh;II)Z")
	private static boolean decode(@OriginalArg(0) Js5 archive, @OriginalArg(2) int id) {
		@Pc(13) byte[] bytes = archive.fetchFile(id);
		if (bytes == null) {
			return false;
		} else {
			decode(bytes);
			return true;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!fh;II)Z")
	private static boolean decode(@OriginalArg(1) Js5 archive, @OriginalArg(2) int groupId, @OriginalArg(3) int fileId) {
		@Pc(9) byte[] bytes = archive.fetchFile(groupId, fileId);
		if (bytes == null) {
			return false;
		} else {
			decode(bytes);
			return true;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([BI)V")
	private static void decode(@OriginalArg(0) byte[] bytes) {
		@Pc(10) Buffer buffer = new Buffer(bytes);
		buffer.position = bytes.length - 2;
		frames = buffer.readUnsignedShort();
		hasAlpha = new boolean[frames];
		alpha = new byte[frames][];
		xOffsets = new int[frames];
		innerWidths = new int[frames];
		pixels = new byte[frames][];
		innerHeights = new int[frames];
		yOffsets = new int[frames];
		buffer.position = bytes.length - frames * 8 - 7;
		width = buffer.readUnsignedShort();
		height = buffer.readUnsignedShort();
		@Pc(68) int paletteSize = (buffer.readUnsignedByte() & 0xFF) + 1;
		for (@Pc(78) int i = 0; i < frames; i++) {
			xOffsets[i] = buffer.readUnsignedShort();
		}
		for (@Pc(96) int i = 0; i < frames; i++) {
			yOffsets[i] = buffer.readUnsignedShort();
		}
		for (@Pc(114) int i = 0; i < frames; i++) {
			innerWidths[i] = buffer.readUnsignedShort();
		}
		for (@Pc(132) int i = 0; i < frames; i++) {
			innerHeights[i] = buffer.readUnsignedShort();
		}
		buffer.position = bytes.length - frames * 8 - (paletteSize - 1) * 3 - 7;
		palette = new int[paletteSize];
		for (@Pc(166) int i = 1; i < paletteSize; i++) {
			palette[i] = buffer.readUnsignedMedium();
			if (palette[i] == 0) {
				palette[i] = 1;
			}
		}
		buffer.position = 0;
		for (@Pc(195) int i = 0; i < frames; i++) {
			@Pc(206) int innerWidth = innerWidths[i];
			@Pc(210) int innerHeight = innerHeights[i];
			@Pc(214) int len = innerHeight * innerWidth;
			@Pc(217) byte[] pixels = new byte[len];
			SpriteLoader.pixels[i] = pixels;
			@Pc(224) byte[] alpha = new byte[len];
			@Pc(226) boolean hasAlpha = false;
			SpriteLoader.alpha[i] = alpha;
			@Pc(234) int flags = buffer.readUnsignedByte();
			if ((flags & 0x1) == 0) {
				for (@Pc(243) int j = 0; j < len; j++) {
					pixels[j] = buffer.readByte();
				}
				if ((flags & 0x2) != 0) {
					for (@Pc(266) int j = 0; j < len; j++) {
						@Pc(277) byte a = alpha[j] = buffer.readByte();
						hasAlpha |= a != -1;
					}
				}
			} else {
				@Pc(294) int x = 0;
				rows:
				while (true) {
					if (x >= innerWidth) {
						if ((flags & 0x2) == 0) {
							break;
						}
						@Pc(337) int alphaX = 0;
						while (true) {
							if (alphaX >= innerWidth) {
								break rows;
							}
							for (@Pc(346) int y = 0; y < innerHeight; y++) {
								@Pc(365) byte a = alpha[alphaX + y * innerWidth] = buffer.readByte();
								hasAlpha |= a != -1;
							}
							alphaX++;
						}
					}
					for (@Pc(303) int y = 0; y < innerHeight; y++) {
						pixels[x + innerWidth * y] = buffer.readByte();
					}
					x++;
				}
			}
			SpriteLoader.hasAlpha[i] = hasAlpha;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)Lclient!uj;")
	private static Sprite createSprite() {
		@Pc(9) int len = innerHeights[0] * innerWidths[0];
		@Pc(22) byte[] srcPixels = pixels[0];
		@Pc(25) int[] destPixels = new int[len];
		for (@Pc(27) int i = 0; i < len; i++) {
			destPixels[i] = palette[srcPixels[i] & 0xFF];
		}
		@Pc(68) Sprite sprite;
		if (GlRenderer.enabled) {
			sprite = new GlSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], destPixels);
		} else {
			sprite = new SoftwareSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], destPixels);
		}
		clear();
		return sprite;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Lclient!vn;")
	private static SoftwareSprite createSoftwareSprite() {
		@Pc(9) byte[] srcPixels = pixels[0];
		@Pc(28) int len = innerWidths[0] * innerHeights[0];
		@Pc(31) int[] destPixels = new int[len];
		for (@Pc(33) int i = 0; i < len; i++) {
			destPixels[i] = palette[srcPixels[i] & 0xFF];
		}
		@Pc(68) SoftwareSprite sprite = new SoftwareSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], destPixels);
		clear();
		return sprite;
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)Lclient!vn;")
	private static SoftwareSprite createSoftwareAlphaSprite() {
		@Pc(14) byte[] srcPixels = pixels[0];
		@Pc(22) int len = innerHeights[0] * innerWidths[0];
		@Pc(66) SoftwareSprite sprite;
		if (hasAlpha[0]) {
			@Pc(71) int[] destPixels = new int[len];
			@Pc(75) byte[] alpha = SpriteLoader.alpha[0];
			for (@Pc(77) int i = 0; i < len; i++) {
				destPixels[i] = (alpha[i] & 0xFF) << 24 | palette[srcPixels[i] & 0xFF];
			}
			sprite = new SoftwareAlphaSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], destPixels);
		} else {
			@Pc(29) int[] destPixels = new int[len];
			for (@Pc(31) int i = 0; i < len; i++) {
				destPixels[i] = palette[srcPixels[i] & 0xFF];
			}
			sprite = new SoftwareSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], destPixels);
		}
		clear();
		return sprite;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)Lclient!ma;")
	private static IndexedSprite createIndexedSprite() {
		@Pc(31) IndexedSprite sprite;
		if (GlRenderer.enabled) {
			sprite = new GlIndexedSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], pixels[0], palette);
		} else {
			sprite = new SoftwareIndexedSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], pixels[0], palette);
		}
		clear();
		return sprite;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Lclient!fe;")
	private static SoftwareIndexedSprite createSoftwareIndexedSprite() {
		@Pc(21) SoftwareIndexedSprite sprite = new SoftwareIndexedSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], pixels[0], palette);
		clear();
		return sprite;
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)[Lclient!uj;")
	private static Sprite[] createSprites() {
		@Pc(4) Sprite[] sprites = new Sprite[frames];
		for (@Pc(18) int i = 0; i < frames; i++) {
			@Pc(29) byte[] srcPixels = pixels[i];
			@Pc(37) int len = innerWidths[i] * innerHeights[i];
			@Pc(40) int[] destPixels = new int[len];
			for (@Pc(42) int j = 0; j < len; j++) {
				destPixels[j] = palette[srcPixels[j] & 0xFF];
			}
			if (GlRenderer.enabled) {
				sprites[i] = new GlSprite(width, height, xOffsets[i], yOffsets[i], innerWidths[i], innerHeights[i], destPixels);
			} else {
				sprites[i] = new SoftwareSprite(width, height, xOffsets[i], yOffsets[i], innerWidths[i], innerHeights[i], destPixels);
			}
		}
		clear();
		return sprites;
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)[Lclient!uj;")
	private static Sprite[] createAlphaSprites() {
		@Pc(4) Sprite[] sprites = new Sprite[frames];
		for (@Pc(16) int i = 0; i < frames; i++) {
			@Pc(27) int len = innerWidths[i] * innerHeights[i];
			@Pc(31) byte[] srcPixels = pixels[i];
			if (hasAlpha[i]) {
				@Pc(112) byte[] alpha = SpriteLoader.alpha[i];
				@Pc(115) int[] destPixels = new int[len];
				for (@Pc(117) int j = 0; j < len; j++) {
					destPixels[j] = palette[srcPixels[j] & 0xFF] | (alpha[j] & 0xFF) << 24;
				}
				if (GlRenderer.enabled) {
					sprites[i] = new GlAlphaSprite(width, height, xOffsets[i], yOffsets[i], innerWidths[i], innerHeights[i], destPixels);
				} else {
					sprites[i] = new SoftwareAlphaSprite(width, height, xOffsets[i], yOffsets[i], innerWidths[i], innerHeights[i], destPixels);
				}
			} else {
				@Pc(38) int[] destPixels = new int[len];
				for (@Pc(40) int j = 0; j < len; j++) {
					destPixels[j] = palette[srcPixels[j] & 0xFF];
				}
				if (GlRenderer.enabled) {
					sprites[i] = new GlSprite(width, height, xOffsets[i], yOffsets[i], innerWidths[i], innerHeights[i], destPixels);
				} else {
					sprites[i] = new SoftwareSprite(width, height, xOffsets[i], yOffsets[i], innerWidths[i], innerHeights[i], destPixels);
				}
			}
		}
		clear();
		return sprites;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)[Lclient!vn;")
	private static SoftwareSprite[] createSoftwareSprites() {
		@Pc(8) SoftwareSprite[] sprites = new SoftwareSprite[frames];
		for (@Pc(10) int i = 0; i < frames; i++) {
			@Pc(21) int len = innerHeights[i] * innerWidths[i];
			@Pc(24) int[] destPixels = new int[len];
			@Pc(28) byte[] srcPixels = pixels[i];
			for (@Pc(30) int j = 0; j < len; j++) {
				destPixels[j] = palette[srcPixels[j] & 0xFF];
			}
			sprites[i] = new SoftwareSprite(width, height, xOffsets[i], yOffsets[i], innerWidths[i], innerHeights[i], destPixels);
		}
		clear();
		return sprites;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)[Lclient!ma;")
	private static IndexedSprite[] createIndexedSprites() {
		@Pc(8) IndexedSprite[] sprites = new IndexedSprite[SpriteLoader.frames];
		for (@Pc(10) int i = 0; i < SpriteLoader.frames; i++) {
			if (GlRenderer.enabled) {
				sprites[i] = new GlIndexedSprite(SpriteLoader.width, SpriteLoader.height, SpriteLoader.xOffsets[i], SpriteLoader.yOffsets[i], SpriteLoader.innerWidths[i], SpriteLoader.innerHeights[i], SpriteLoader.pixels[i], SpriteLoader.palette);
			} else {
				sprites[i] = new SoftwareIndexedSprite(SpriteLoader.width, SpriteLoader.height, SpriteLoader.xOffsets[i], SpriteLoader.yOffsets[i], SpriteLoader.innerWidths[i], SpriteLoader.innerHeights[i], SpriteLoader.pixels[i], SpriteLoader.palette);
			}
		}
		SpriteLoader.clear();
		return sprites;
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)[Lclient!fe;")
	private static SoftwareIndexedSprite[] createSoftwareIndexedSprites() {
		@Pc(4) SoftwareIndexedSprite[] sprites = new SoftwareIndexedSprite[frames];
		for (@Pc(12) int i = 0; i < frames; i++) {
			sprites[i] = new SoftwareIndexedSprite(width, height, xOffsets[i], yOffsets[i], innerWidths[i], innerHeights[i], pixels[i], palette);
		}
		clear();
		return sprites;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)Lclient!gl;")
	private static Font createFont(@OriginalArg(1) byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		@Pc(27) Font font;
		if (GlRenderer.enabled) {
			font = new GlFont(bytes, xOffsets, yOffsets, innerWidths, innerHeights, pixels);
		} else {
			font = new SoftwareFont(bytes, xOffsets, yOffsets, innerWidths, innerHeights, pixels);
		}
		clear();
		return font;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([BB)Lclient!ke;")
	private static SoftwareFont createSoftwareFont(@OriginalArg(0) byte[] bytes) {
		if (bytes == null) {
			return null;
		} else {
			@Pc(24) SoftwareFont font = new SoftwareFont(bytes, xOffsets, yOffsets, innerWidths, innerHeights, pixels);
			clear();
			return font;
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V")
	private static void clear() {
		xOffsets = null;
		palette = null;
		innerWidths = null;
		innerHeights = null;
		yOffsets = null;
		pixels = null;
	}
}

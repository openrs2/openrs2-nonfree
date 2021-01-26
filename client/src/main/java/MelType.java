import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class MelType {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	private int anInt2265;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	public int anInt2266;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
	public int fillColor;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
	private int anInt2275;

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
	private int anInt2276;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "Ljava/lang/String;")
	public String opBase;

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
	public int outlineColor;

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "Ljava/lang/String;")
	public String text;

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
	private int anInt2285;

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
	public int textColor;

	@OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Z")
	public boolean worldMapVisible = true;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
	private int anInt2271 = -1;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
	public int textSize = 0;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "Z")
	public boolean miniMapVisible = false;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	public int sprite = -1;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "Z")
	public boolean randomizePosition = true;

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "[Ljava/lang/String;")
	public final String[] ops = new String[5];

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
	public int category = -1;

	@OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
	private int anInt2282 = -1;

	@OriginalMember(owner = "client!ho", name = "M", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	private int anInt2267 = -1;

	@OriginalMember(owner = "client!ho", name = "P", descriptor = "I")
	private int anInt2294 = -1;

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
	private int worldMapSprite = -1;

	@OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
	public int hoverTextColor = -1;

	@OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
	public int hoverSprite = -1;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!fd;I)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(15) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.decode(buffer, code);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Lclient!fe;")
	public final SoftwareIndexedSprite method1808() {
		@Pc(22) SoftwareIndexedSprite sprite = (SoftwareIndexedSprite) MelTypeList.sprites.get(this.worldMapSprite | 0x20000);
		if (sprite != null) {
			return sprite;
		}
		MelTypeList.spritesArchive.isFileReady(this.worldMapSprite);
		@Pc(41) SoftwareIndexedSprite newSprite = SpriteLoader.loadSoftwareIndexedSprite(MelTypeList.spritesArchive, this.worldMapSprite);
		if (newSprite != null) {
			newSprite.innerWidth = newSprite.width;
			newSprite.xOffset = 0;
			newSprite.innerHeight = newSprite.height;
			newSprite.yOffset = 0;
			MelTypeList.sprites.put(this.worldMapSprite | 0x20000, newSprite);
		}
		return newSprite;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILclient!fd;)V")
	private void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(1) int code) {
		if (code == 1) {
			this.sprite = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.hoverSprite = buffer.readUnsignedShort();
		} else if (code == 3) {
			this.text = buffer.readString();
		} else if (code == 4) {
			this.textColor = buffer.readUnsignedMedium();
		} else if (code == 5) {
			this.hoverTextColor = buffer.readUnsignedMedium();
		} else if (code == 6) {
			this.textSize = buffer.readUnsignedByte();
		} else if (code == 7) {
			@Pc(301) int flags = buffer.readUnsignedByte();
			if ((flags & 0x2) == 2) {
				this.miniMapVisible = true;
			}
			if ((flags & 0x1) == 0) {
				this.worldMapVisible = false;
			}
		} else if (code == 8) {
			this.randomizePosition = buffer.readUnsignedByte() == 1;
		} else if (code == 9) {
			this.anInt2282 = buffer.readUnsignedShort();
			if (this.anInt2282 == 65535) {
				this.anInt2282 = -1;
			}
			this.anInt2294 = buffer.readUnsignedShort();
			if (this.anInt2294 == 65535) {
				this.anInt2294 = -1;
			}
			this.anInt2276 = buffer.readInt();
			this.anInt2275 = buffer.readInt();
		} else if (code >= 10 && code <= 14) {
			this.ops[code - 10] = buffer.readString();
		} else if (code == 15) {
			@Pc(262) int local262 = buffer.readUnsignedByte();
			this.anIntArray188 = new int[local262 * 2];
			for (@Pc(270) int local270 = 0; local270 < local262 * 2; local270++) {
				this.anIntArray188[local270] = buffer.readShort();
			}
			this.anInt2266 = buffer.readInt();
			this.anInt2283 = buffer.readInt();
		} else if (code == 16) {
			this.aBoolean157 = false;
		} else if (code == 17) {
			this.opBase = buffer.readString();
		} else if (code == 18) {
			this.worldMapSprite = buffer.readUnsignedShort();
		} else if (code == 19) {
			this.category = buffer.readUnsignedShort();
		} else if (code == 20) {
			this.anInt2267 = buffer.readUnsignedShort();
			if (this.anInt2267 == 65535) {
				this.anInt2267 = -1;
			}
			this.anInt2271 = buffer.readUnsignedShort();
			if (this.anInt2271 == 65535) {
				this.anInt2271 = -1;
			}
			this.anInt2285 = buffer.readInt();
			this.anInt2265 = buffer.readInt();
		} else if (code == 21) {
			this.outlineColor = buffer.readInt();
		} else if (code == 22) {
			this.fillColor = buffer.readInt();
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Z")
	public final boolean method1810() {
		if (this.anInt2294 == -1 && this.anInt2282 == -1) {
			return true;
		}
		@Pc(35) int local35;
		if (this.anInt2294 == -1) {
			local35 = VarpDomain.getVarbit(this.anInt2282);
		} else {
			local35 = VarpDomain.varps[this.anInt2294];
		}
		if (this.anInt2276 > local35 || this.anInt2275 < local35) {
			return false;
		} else if (this.anInt2271 == -1 && this.anInt2267 == -1) {
			return true;
		} else {
			@Pc(80) int local80;
			if (this.anInt2271 == -1) {
				local80 = VarpDomain.getVarbit(this.anInt2267);
			} else {
				local80 = VarpDomain.varps[this.anInt2271];
			}
			return local80 >= this.anInt2285 && this.anInt2265 >= local80;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZZ)Lclient!ma;")
	public final IndexedSprite method1811(@OriginalArg(0) boolean hover, @OriginalArg(2) boolean forceSoftware) {
		@Pc(17) int spriteId = hover ? this.hoverSprite : this.sprite;
		@Pc(30) IndexedSprite sprite = (IndexedSprite) MelTypeList.sprites.get(spriteId | (hover ? 0x10000 : 0));
		if (sprite != null) {
			return sprite;
		} else if (MelTypeList.spritesArchive.isFileReady(spriteId)) {
			@Pc(49) SoftwareIndexedSprite softwareSprite = SpriteLoader.loadSoftwareIndexedSprite(MelTypeList.spritesArchive, spriteId);
			@Pc(55) IndexedSprite newSprite;
			if (GlRenderer.enabled && !forceSoftware) {
				newSprite = new GlIndexedSprite(softwareSprite);
			} else {
				newSprite = softwareSprite;
			}
			if (newSprite != null) {
				newSprite.innerHeight = newSprite.height;
				newSprite.yOffset = 0;
				newSprite.innerWidth = newSprite.width;
				newSprite.xOffset = 0;
				MelTypeList.sprites.put((hover ? 0x10000 : 0) | spriteId, newSprite);
			}
			return newSprite;
		} else {
			return null;
		}
	}
}

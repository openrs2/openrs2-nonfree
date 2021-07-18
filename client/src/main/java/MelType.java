import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class MelType {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	private int secondaryMaxValue;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	public int anInt2266;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
	public int fillColor;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
	private int primaryMaxValue;

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
	private int primaryMinValue;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "Ljava/lang/String;")
	public String opBase;

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
	public int outlineColor;

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "Ljava/lang/String;")
	public String text;

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
	private int secondaryMinValue;

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
	public int textColor;

	@OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Z")
	public boolean worldMapVisible = true;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
	private int secondaryVisibleVarp = -1;

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
	private int primaryVisibleVarbit = -1;

	@OriginalMember(owner = "client!ho", name = "M", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	private int secondaryVisibleVarbit = -1;

	@OriginalMember(owner = "client!ho", name = "P", descriptor = "I")
	private int primaryVisibleVarp = -1;

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
			this.primaryVisibleVarbit = buffer.readUnsignedShort();
			if (this.primaryVisibleVarbit == 65535) {
				this.primaryVisibleVarbit = -1;
			}
			this.primaryVisibleVarp = buffer.readUnsignedShort();
			if (this.primaryVisibleVarp == 65535) {
				this.primaryVisibleVarp = -1;
			}
			this.primaryMinValue = buffer.readInt();
			this.primaryMaxValue = buffer.readInt();
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
			this.secondaryVisibleVarbit = buffer.readUnsignedShort();
			if (this.secondaryVisibleVarbit == 65535) {
				this.secondaryVisibleVarbit = -1;
			}
			this.secondaryVisibleVarp = buffer.readUnsignedShort();
			if (this.secondaryVisibleVarp == 65535) {
				this.secondaryVisibleVarp = -1;
			}
			this.secondaryMinValue = buffer.readInt();
			this.secondaryMaxValue = buffer.readInt();
		} else if (code == 21) {
			this.outlineColor = buffer.readInt();
		} else if (code == 22) {
			this.fillColor = buffer.readInt();
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Z")
	public final boolean isVisible() {
		if (this.primaryVisibleVarp == -1 && this.primaryVisibleVarbit == -1) {
			return true;
		}
		@Pc(35) int value;
		if (this.primaryVisibleVarp == -1) {
			value = VarpDomain.getVarbit(this.primaryVisibleVarbit);
		} else {
			value = VarpDomain.varps[this.primaryVisibleVarp];
		}
		if (value < this.primaryMinValue || value > this.primaryMaxValue) {
			return false;
		} else if (this.secondaryVisibleVarp == -1 && this.secondaryVisibleVarbit == -1) {
			return true;
		} else {
			@Pc(80) int value2;
			if (this.secondaryVisibleVarp == -1) {
				value2 = VarpDomain.getVarbit(this.secondaryVisibleVarbit);
			} else {
				value2 = VarpDomain.varps[this.secondaryVisibleVarp];
			}
			return value2 >= this.secondaryMinValue && this.secondaryMaxValue >= value2;
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

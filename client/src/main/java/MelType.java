import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class MelType {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	private int anInt2265;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	public int anInt2266;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
	public int anInt2274;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
	private int anInt2275;

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
	private int anInt2276;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "Ljava/lang/String;")
	public String aString130;

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
	public int anInt2280;

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "Ljava/lang/String;")
	public String aString131;

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
	private int anInt2285;

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
	public int anInt2286;

	@OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Z")
	public boolean aBoolean154 = true;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
	private int anInt2271 = -1;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
	public int anInt2270 = 0;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "Z")
	public boolean aBoolean155 = false;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	public int anInt2277 = -1;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray15 = new String[5];

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
	public int anInt2284 = -1;

	@OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
	private int anInt2282 = -1;

	@OriginalMember(owner = "client!ho", name = "M", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	private int anInt2267 = -1;

	@OriginalMember(owner = "client!ho", name = "P", descriptor = "I")
	private int anInt2294 = -1;

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
	private int anInt2279 = -1;

	@OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
	public int anInt2287 = -1;

	@OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
	public int anInt2291 = -1;

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
		@Pc(22) SoftwareIndexedSprite local22 = (SoftwareIndexedSprite) MelTypeList.sprites.get((long) (this.anInt2279 | 0x20000));
		if (local22 != null) {
			return local22;
		}
		MelTypeList.spritesArchive.isFileReady(this.anInt2279);
		@Pc(41) SoftwareIndexedSprite local41 = Static33.method3003(MelTypeList.spritesArchive, this.anInt2279);
		if (local41 != null) {
			local41.anInt3412 = local41.anInt3408;
			local41.anInt3404 = 0;
			local41.anInt3410 = local41.anInt3413;
			local41.anInt3405 = 0;
			MelTypeList.sprites.put((long) (this.anInt2279 | 0x20000), local41);
		}
		return local41;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILclient!fd;)V")
	private void decode(@OriginalArg(2) Buffer buffer, @OriginalArg(1) int code) {
		if (code == 1) {
			this.anInt2277 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.anInt2291 = buffer.readUnsignedShort();
		} else if (code == 3) {
			this.aString131 = buffer.readString();
		} else if (code == 4) {
			this.anInt2286 = buffer.readUnsignedMedium();
		} else if (code == 5) {
			this.anInt2287 = buffer.readUnsignedMedium();
		} else if (code == 6) {
			this.anInt2270 = buffer.readUnsignedByte();
		} else if (code == 7) {
			@Pc(301) int local301 = buffer.readUnsignedByte();
			if ((local301 & 0x2) == 2) {
				this.aBoolean155 = true;
			}
			if ((local301 & 0x1) == 0) {
				this.aBoolean154 = false;
			}
		} else if (code == 8) {
			this.aBoolean156 = buffer.readUnsignedByte() == 1;
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
			this.aStringArray15[code - 10] = buffer.readString();
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
			this.aString130 = buffer.readString();
		} else if (code == 18) {
			this.anInt2279 = buffer.readUnsignedShort();
		} else if (code == 19) {
			this.anInt2284 = buffer.readUnsignedShort();
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
			this.anInt2280 = buffer.readInt();
		} else if (code == 22) {
			this.anInt2274 = buffer.readInt();
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Z")
	public final boolean method1810() {
		if (this.anInt2294 == -1 && this.anInt2282 == -1) {
			return true;
		}
		@Pc(35) int local35;
		if (this.anInt2294 == -1) {
			local35 = Static35.method4311(this.anInt2282);
		} else {
			local35 = Static1.anIntArray2[this.anInt2294];
		}
		if (this.anInt2276 > local35 || this.anInt2275 < local35) {
			return false;
		} else if (this.anInt2271 == -1 && this.anInt2267 == -1) {
			return true;
		} else {
			@Pc(80) int local80;
			if (this.anInt2271 == -1) {
				local80 = Static35.method4311(this.anInt2267);
			} else {
				local80 = Static1.anIntArray2[this.anInt2271];
			}
			return local80 >= this.anInt2285 && this.anInt2265 >= local80;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZZ)Lclient!ma;")
	public final IndexedSprite method1811(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = arg0 ? this.anInt2291 : this.anInt2277;
		@Pc(30) IndexedSprite local30 = (IndexedSprite) MelTypeList.sprites.get((long) (local17 | (arg0 ? 65536 : 0)));
		if (local30 != null) {
			return local30;
		} else if (MelTypeList.spritesArchive.isFileReady(local17)) {
			@Pc(49) SoftwareIndexedSprite local49 = Static33.method3003(MelTypeList.spritesArchive, local17);
			@Pc(55) IndexedSprite local55;
			if (GlRenderer.enabled && !arg1) {
				local55 = new GlIndexedSprite(local49);
			} else {
				local55 = local49;
			}
			if (local55 != null) {
				local55.anInt3410 = local55.anInt3413;
				local55.anInt3405 = 0;
				local55.anInt3412 = local55.anInt3408;
				local55.anInt3404 = 0;
				MelTypeList.sprites.put((long) ((arg0 ? 65536 : 0) | local17), local55);
			}
			return local55;
		} else {
			return null;
		}
	}
}
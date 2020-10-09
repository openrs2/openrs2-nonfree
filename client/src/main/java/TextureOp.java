import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public abstract class TextureOp extends Node {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!fd;I)Lclient!jo;")
	public static TextureOp decode(@OriginalArg(0) Buffer buffer) {
		buffer.readUnsignedByte();
		@Pc(13) int type = buffer.readUnsignedByte();
		@Pc(17) TextureOp op = create(type);
		op.imageCacheCapacity = buffer.readUnsignedByte();
		@Pc(26) int codes = buffer.readUnsignedByte();
		for (@Pc(28) int i = 0; i < codes; i++) {
			@Pc(35) int code = buffer.readUnsignedByte();
			op.decode(buffer, code);
		}
		op.postDecode();
		return op;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lclient!jo;")
	private static TextureOp create(@OriginalArg(1) int type) {
		if (type == 0) {
			return new TextureOp0();
		} else if (type == 1) {
			return new TextureOp1();
		} else if (type == 2) {
			return new TextureOp2();
		} else if (type == 3) {
			return new TextureOp3();
		} else if (type == 4) {
			return new TextureOp4();
		} else if (type == 5) {
			return new TextureOp5();
		} else if (type == 6) {
			return new TextureOp6();
		} else if (type == 7) {
			return new TextureOp7();
		} else if (type == 8) {
			return new TextureOp8();
		} else if (type == 9) {
			return new TextureOp9();
		} else if (type == 10) {
			return new TextureOp10();
		} else if (type == 11) {
			return new TextureOp11();
		} else if (type == 12) {
			return new TextureOp12();
		} else if (type == 13) {
			return new TextureOp13();
		} else if (type == 14) {
			return new TextureOp14();
		} else if (type == 15) {
			return new TextureOp15();
		} else if (type == 16) {
			return new TextureOp16();
		} else if (type == 17) {
			return new TextureOp17();
		} else if (type == 18) {
			return new TextureOp18();
		} else if (type == 19) {
			return new TextureOp19();
		} else if (type == 20) {
			return new TextureOp20();
		} else if (type == 21) {
			return new TextureOp21();
		} else if (type == 22) {
			return new TextureOp22();
		} else if (type == 23) {
			return new TextureOp23();
		} else if (type == 24) {
			return new TextureOp24();
		} else if (type == 25) {
			return new TextureOp25();
		} else if (type == 26) {
			return new TextureOp26();
		} else if (type == 27) {
			return new TextureOp27();
		} else if (type == 28) {
			return new TextureOp28();
		} else if (type == 29) {
			return new TextureOp29();
		} else if (type == 30) {
			return new TextureOp30();
		} else if (type == 31) {
			return new TextureOp31();
		} else if (type == 32) {
			return new TextureOp32();
		} else if (type == 33) {
			return new TextureOp33();
		} else if (type == 34) {
			return new TextureOp34();
		} else if (type == 35) {
			return new TextureOp35();
		} else if (type == 36) {
			return new TextureOp36();
		} else if (type == 37) {
			return new TextureOp37();
		} else if (type == 38) {
			return new TextureOp38();
		} else if (type == 39) {
			return new TextureOp39();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "Lclient!md;")
	protected ColorImageCache colorImageCache;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "Lclient!da;")
	protected MonochromeImageCache monochromeImageCache;

	@OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
	public int imageCacheCapacity;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "Z")
	public boolean monochrome;

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "[Lclient!jo;")
	public final TextureOp[] aClass4_Sub1Array42;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IZ)V")
	protected TextureOp(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.monochrome = arg1;
		this.aClass4_Sub1Array42 = new TextureOp[arg0];
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method4686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aClass4_Sub1Array42[arg0].monochrome) {
			return this.aClass4_Sub1Array42[arg0].method4695(arg1);
		}
		@Pc(27) int[][] local27 = new int[3][];
		@Pc(35) int[] local35 = this.aClass4_Sub1Array42[arg0].method4694(arg1);
		local27[0] = local35;
		local27[2] = local35;
		local27[1] = local35;
		return local27;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!fd;I)V")
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I")
	public int method4688() {
		return -1;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)I")
	public int method4691() {
		return -1;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)[I")
	public int[] method4694(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)[[I")
	public int[][] method4695(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V")
	public void clearImageCache() {
		if (this.monochrome) {
			this.monochromeImageCache.clear();
			this.monochromeImageCache = null;
		} else {
			this.colorImageCache.clear();
			this.colorImageCache = null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	public final void createImageCache(@OriginalArg(0) int height, @OriginalArg(2) int width) {
		@Pc(12) int capacity = this.imageCacheCapacity == 255 ? height : this.imageCacheCapacity;
		if (this.monochrome) {
			this.monochromeImageCache = new MonochromeImageCache(capacity, height, width);
		} else {
			this.colorImageCache = new ColorImageCache(capacity, height, width);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)[I")
	protected final int[] method4699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub1Array42[arg1].monochrome ? this.aClass4_Sub1Array42[arg1].method4694(arg0) : this.aClass4_Sub1Array42[arg1].method4695(arg0)[0];
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(B)V")
	public void postDecode() {
	}
}

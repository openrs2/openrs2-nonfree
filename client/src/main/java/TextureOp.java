import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public abstract class TextureOp extends Node {

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "[I")
	public static int[] COSINE;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
	public static int[] SINE;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "(B)V")
	public static void createTrigonometryTables() {
		if (SINE != null && COSINE != null) {
			return;
		}
		COSINE = new int[256];
		SINE = new int[256];
		for (@Pc(14) int i = 0; i < 256; i++) {
			@Pc(24) double radians = (double) i / 255.0D * 6.283185307179586D;
			SINE[i] = (int) (Math.sin(radians) * 4096.0D);
			COSINE[i] = (int) (Math.cos(radians) * 4096.0D);
		}
	}

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
			return new TextureOpMonochromeFill();
		} else if (type == 1) {
			return new TextureOpColorFill();
		} else if (type == 2) {
			return new TextureOpHorizontalGradient();
		} else if (type == 3) {
			return new TextureOpVerticalGradient();
		} else if (type == 4) {
			return new TextureOp4();
		} else if (type == 5) {
			return new TextureOp5();
		} else if (type == 6) {
			return new TextureOpClamp();
		} else if (type == 7) {
			return new TextureOpCombine();
		} else if (type == 8) {
			return new TextureOpCurve();
		} else if (type == 9) {
			return new TextureOpFlip();
		} else if (type == 10) {
			return new TextureOpColorGradient();
		} else if (type == 11) {
			return new TextureOp11();
		} else if (type == 12) {
			return new TextureOp12();
		} else if (type == 13) {
			return new TextureOpNoise();
		} else if (type == 14) {
			return new TextureOp14();
		} else if (type == 15) {
			return new TextureOp15();
		} else if (type == 16) {
			return new TextureOp16();
		} else if (type == 17) {
			return new TextureOp17();
		} else if (type == 18) {
			return new TextureOpTiledSprite();
		} else if (type == 19) {
			return new TextureOp19();
		} else if (type == 20) {
			return new TextureOpTile();
		} else if (type == 21) {
			return new TextureOpInterpolate();
		} else if (type == 22) {
			return new TextureOpInvert();
		} else if (type == 23) {
			return new TextureOp23();
		} else if (type == 24) {
			return new TextureOpMonochrome();
		} else if (type == 25) {
			return new TextureOp25();
		} else if (type == 26) {
			return new TextureOpBinary();
		} else if (type == 27) {
			return new TextureOp27();
		} else if (type == 28) {
			return new TextureOp28();
		} else if (type == 29) {
			return new TextureOp29();
		} else if (type == 30) {
			return new TextureOpRange();
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
			return new TextureOpTexture();
		} else if (type == 37) {
			return new TextureOp37();
		} else if (type == 38) {
			return new TextureOp38();
		} else if (type == 39) {
			return new TextureOpSprite();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "Lclient!md;")
	protected ColorImageCache colorImageCache;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "Lclient!da;")
	protected MonochromeImageCache monochromeImageCache;

	@OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
	private int imageCacheCapacity;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "Z")
	public boolean monochrome;

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "[Lclient!jo;")
	public final TextureOp[] childOps;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IZ)V")
	protected TextureOp(@OriginalArg(0) int childOpsCount, @OriginalArg(1) boolean monochrome) {
		this.monochrome = monochrome;
		this.childOps = new TextureOp[childOpsCount];
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] getChildColorOutput(@OriginalArg(0) int index, @OriginalArg(1) int y) {
		if (!this.childOps[index].monochrome) {
			return this.childOps[index].getColorOutput(y);
		}
		@Pc(27) int[][] colorRow = new int[3][];
		@Pc(35) int[] monochromeRow = this.childOps[index].getMonochromeOutput(y);
		colorRow[0] = monochromeRow;
		colorRow[2] = monochromeRow;
		colorRow[1] = monochromeRow;
		return colorRow;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!fd;I)V")
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I")
	public int getSpriteId() {
		return -1;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)I")
	public int getTextureId() {
		return -1;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)[I")
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)[[I")
	public int[][] getColorOutput(@OriginalArg(0) int y) {
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
	protected final int[] getChildMonochromeOutput(@OriginalArg(2) int index, @OriginalArg(1) int y) {
		return this.childOps[index].monochrome ? this.childOps[index].getMonochromeOutput(y) : this.childOps[index].getColorOutput(y)[0];
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(B)V")
	public void postDecode() {
	}
}

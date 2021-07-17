import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class TextureOp29 extends TextureOp {

	@OriginalMember(owner = "client!km", name = "T", descriptor = "[Lclient!lc;")
	private TextureOp29SubOp[] ops;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public TextureOp29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(9) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			this.method2391(this.monochromeImageCache.get());
		}
		return dest;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(15) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(26) int width = Texture.width;
			@Pc(28) int height = Texture.height;
			@Pc(32) int[][] local32 = new int[height][width];
			@Pc(37) int[][][] local37 = this.colorImageCache.get();
			this.method2391(local32);
			for (@Pc(43) int y0 = 0; y0 < Texture.height; y0++) {
				@Pc(50) int[][] local50 = local37[y0];
				@Pc(54) int[] local54 = local50[1];
				@Pc(58) int[] local58 = local50[2];
				@Pc(62) int[] local62 = local32[y0];
				@Pc(66) int[] local66 = local50[0];
				for (@Pc(68) int x = 0; x < Texture.width; x++) {
					@Pc(79) int local79 = local62[x];
					local58[x] = (local79 & 0xFF) << 4;
					local54[x] = local79 >> 4 & 0xFF0;
					local66[x] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.ops = new TextureOp29SubOp[buffer.readUnsignedByte()];
			for (@Pc(11) int i = 0; i < this.ops.length; i++) {
				@Pc(24) int op = buffer.readUnsignedByte();
				if (op == 0) {
					this.ops[i] = TextureOp29SubOp0.create(buffer);
				} else if (op == 1) {
					this.ops[i] = TextureOp29SubOp1.create(buffer);
				} else if (op == 2) {
					this.ops[i] = TextureOp29SubOp2.create(buffer);
				} else if (op == 3) {
					this.ops[i] = TextureOp29SubOp3.create(buffer);
				}
			}
		} else if (code == 1) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B[[I)V")
	private void method2391(@OriginalArg(1) int[][] pixels) {
		@Pc(15) int width = Texture.width;
		@Pc(17) int height = Texture.height;
		Static35.method4335(pixels);
		Static18.method4374(Texture.heightMask, Texture.widthMask);
		if (this.ops == null) {
			return;
		}
		for (@Pc(32) int i = 0; i < this.ops.length; i++) {
			@Pc(46) TextureOp29SubOp op = this.ops[i];
			@Pc(49) int local49 = op.anInt2466;
			@Pc(52) int local52 = op.anInt2463;
			if (local52 < 0) {
				if (local49 >= 0) {
					op.method1938(width, height);
				}
			} else if (local49 < 0) {
				op.method1935(width, height);
			} else {
				op.method1934(width, height);
			}
		}
	}
}

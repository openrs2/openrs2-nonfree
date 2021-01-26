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
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			this.method2391(this.monochromeImageCache.get());
		}
		return local9;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4695(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(26) int local26 = Static2.anInt1626;
			@Pc(28) int local28 = Static1.anInt379;
			@Pc(32) int[][] local32 = new int[local28][local26];
			@Pc(37) int[][][] local37 = this.colorImageCache.get();
			this.method2391(local32);
			for (@Pc(43) int local43 = 0; local43 < Static1.anInt379; local43++) {
				@Pc(50) int[][] local50 = local37[local43];
				@Pc(54) int[] local54 = local50[1];
				@Pc(58) int[] local58 = local50[2];
				@Pc(62) int[] local62 = local32[local43];
				@Pc(66) int[] local66 = local50[0];
				for (@Pc(68) int local68 = 0; local68 < Static2.anInt1626; local68++) {
					@Pc(79) int local79 = local62[local68];
					local58[local68] = (local79 & 0xFF) << 4;
					local54[local68] = local79 >> 4 & 0xFF0;
					local66[local68] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local15;
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
	private void method2391(@OriginalArg(1) int[][] arg0) {
		@Pc(15) int local15 = Static2.anInt1626;
		@Pc(17) int local17 = Static1.anInt379;
		Static35.method4335(arg0);
		Static18.method4374(Static6.anInt5001, Static1.anInt901);
		if (this.ops == null) {
			return;
		}
		for (@Pc(32) int i = 0; i < this.ops.length; i++) {
			@Pc(46) TextureOp29SubOp op = this.ops[i];
			@Pc(49) int local49 = op.anInt2466;
			@Pc(52) int local52 = op.anInt2463;
			if (local52 < 0) {
				if (local49 >= 0) {
					op.method1938(local15, local17);
				}
			} else if (local49 < 0) {
				op.method1935(local15, local17);
			} else {
				op.method1934(local15, local17);
			}
		}
	}
}

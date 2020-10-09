import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class TextureOp1 extends TextureOp {

	@OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
	private int anInt2225;

	@OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
	private int anInt2227;

	@OriginalMember(owner = "client!hk", name = "bb", descriptor = "I")
	private int anInt2229;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V")
	private TextureOp1(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1774(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public TextureOp1() {
		this(0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.method1774(buffer.readUnsignedMedium());
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4695(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(24) int[] local24 = local16[1];
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static2.anInt1626; local34++) {
				local28[local34] = this.anInt2229;
				local24[local34] = this.anInt2227;
				local32[local34] = this.anInt2225;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
	private void method1774(@OriginalArg(1) int arg0) {
		this.anInt2227 = arg0 >> 4 & 0xFF0;
		this.anInt2229 = arg0 >> 12 & 0xFF0;
		this.anInt2225 = (arg0 & 0xFF) << 4;
	}
}

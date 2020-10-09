import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class TextureOp9 extends TextureOp {

	@OriginalMember(owner = "client!fj", name = "T", descriptor = "Z")
	private boolean aBoolean113 = true;

	@OriginalMember(owner = "client!fj", name = "bb", descriptor = "Z")
	private boolean aBoolean114 = true;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public TextureOp9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(34) int[] local34 = this.method4699(this.aBoolean113 ? Static6.anInt5001 - arg0 : arg0, 0);
			if (this.aBoolean114) {
				for (@Pc(47) int local47 = 0; local47 < Static2.anInt1626; local47++) {
					local15[local47] = local34[Static1.anInt901 - local47];
				}
			} else {
				ArrayUtils.copy(local34, 0, local15, 0, Static2.anInt1626);
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.aBoolean114 = buffer.readUnsignedByte() == 1;
		} else if (code == 1) {
			this.aBoolean113 = buffer.readUnsignedByte() == 1;
		} else if (code == 2) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4695(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(36) int[][] local36 = this.method4686(0, this.aBoolean113 ? Static6.anInt5001 - arg0 : arg0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local18[0];
			@Pc(52) int[] local52 = local36[2];
			@Pc(56) int[] local56 = local18[1];
			@Pc(60) int[] local60 = local18[2];
			if (this.aBoolean114) {
				for (@Pc(65) int local65 = 0; local65 < Static2.anInt1626; local65++) {
					local48[local65] = local40[Static1.anInt901 - local65];
					local56[local65] = local44[Static1.anInt901 - local65];
					local60[local65] = local52[Static1.anInt901 - local65];
				}
			} else {
				for (@Pc(101) int local101 = 0; local101 < Static2.anInt1626; local101++) {
					local48[local101] = local40[local101];
					local56[local101] = local44[local101];
					local60[local101] = local52[local101];
				}
			}
		}
		return local18;
	}
}

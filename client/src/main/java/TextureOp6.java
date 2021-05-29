import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class TextureOp6 extends TextureOp {

	@OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
	private int anInt581 = 0;

	@OriginalMember(owner = "client!cf", name = "fb", descriptor = "I")
	private int anInt588 = 4096;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public TextureOp6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt581 = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.anInt588 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(29) int[] local29 = this.method4699(y, 0);
			for (@Pc(31) int local31 = 0; local31 < Texture.width; local31++) {
				@Pc(38) int local38 = local29[local31];
				if (this.anInt581 > local38) {
					local19[local31] = this.anInt581;
				} else if (local38 > this.anInt588) {
					local19[local31] = this.anInt588;
				} else {
					local19[local31] = local38;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(7) int[][] local7 = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(22) int[][] local22 = this.method4686(0, y);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local7[0];
			@Pc(38) int[] local38 = local22[2];
			@Pc(42) int[] local42 = local7[1];
			@Pc(46) int[] local46 = local7[2];
			for (@Pc(48) int local48 = 0; local48 < Texture.width; local48++) {
				@Pc(59) int local59 = local30[local48];
				@Pc(63) int local63 = local26[local48];
				@Pc(67) int local67 = local38[local48];
				if (local63 < this.anInt581) {
					local34[local48] = this.anInt581;
				} else if (local63 <= this.anInt588) {
					local34[local48] = local63;
				} else {
					local34[local48] = this.anInt588;
				}
				if (this.anInt581 > local59) {
					local42[local48] = this.anInt581;
				} else if (this.anInt588 < local59) {
					local42[local48] = this.anInt588;
				} else {
					local42[local48] = local59;
				}
				if (this.anInt581 > local67) {
					local46[local48] = this.anInt581;
				} else if (local67 <= this.anInt588) {
					local46[local48] = local67;
				} else {
					local46[local48] = this.anInt588;
				}
			}
		}
		return local7;
	}
}

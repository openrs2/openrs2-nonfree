import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class TextureOp11 extends TextureOp {

	@OriginalMember(owner = "client!ca", name = "X", descriptor = "I")
	private int anInt501 = 4096;

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "I")
	private int anInt505 = 4096;

	@OriginalMember(owner = "client!ca", name = "fb", descriptor = "I")
	private int anInt508 = 4096;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public TextureOp11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt505 = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.anInt501 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.anInt508 = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(18) int[][] local18 = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(28) int[][] local28 = this.method4686(0, y);
			@Pc(32) int[] local32 = local28[1];
			@Pc(36) int[] local36 = local28[0];
			@Pc(40) int[] local40 = local18[0];
			@Pc(44) int[] local44 = local18[1];
			@Pc(48) int[] local48 = local28[2];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Texture.width; local54++) {
				@Pc(61) int local61 = local36[local54];
				@Pc(65) int local65 = local48[local54];
				@Pc(69) int local69 = local32[local54];
				if (local65 == local61 && local65 == local69) {
					local40[local54] = this.anInt505 * local61 >> 12;
					local44[local54] = local65 * this.anInt501 >> 12;
					local52[local54] = this.anInt508 * local69 >> 12;
				} else {
					local40[local54] = this.anInt505;
					local44[local54] = this.anInt501;
					local52[local54] = this.anInt508;
				}
			}
		}
		return local18;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class TextureOp25 extends TextureOp {

	@OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
	private int anInt371 = 409;

	@OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
	private int anInt374 = 4096;

	@OriginalMember(owner = "client!bl", name = "bb", descriptor = "I")
	private int anInt378 = 4096;

	@OriginalMember(owner = "client!bl", name = "Z", descriptor = "[I")
	private final int[] anIntArray40 = new int[3];

	@OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
	private int anInt373 = 4096;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public TextureOp25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(12) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(23) int[][] src = this.getChildColorOutput(0, y);
			@Pc(27) int[] srcRed = src[0];
			@Pc(31) int[] srcGreen = src[1];
			@Pc(35) int[] srcBlue = src[2];
			@Pc(39) int[] destGreen = dest[1];
			@Pc(43) int[] destRed = dest[0];
			@Pc(47) int[] destBlue = dest[2];
			for (@Pc(49) int x = 0; x < Texture.width; x++) {
				@Pc(56) int local56 = srcRed[x];
				@Pc(64) int local64 = local56 - this.anIntArray40[0];
				if (local64 < 0) {
					local64 = -local64;
				}
				if (local64 > this.anInt371) {
					destRed[x] = local56;
					destGreen[x] = srcGreen[x];
					destBlue[x] = srcBlue[x];
				} else {
					@Pc(98) int local98 = srcGreen[x];
					@Pc(106) int local106 = local98 - this.anIntArray40[1];
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local106 <= this.anInt371) {
						@Pc(141) int local141 = srcBlue[x];
						@Pc(149) int local149 = local141 - this.anIntArray40[2];
						if (local149 < 0) {
							local149 = -local149;
						}
						if (this.anInt371 < local149) {
							destRed[x] = local56;
							destGreen[x] = local98;
							destBlue[x] = local141;
						} else {
							destRed[x] = local56 * this.anInt374 >> 12;
							destGreen[x] = this.anInt373 * local98 >> 12;
							destBlue[x] = local141 * this.anInt378 >> 12;
						}
					} else {
						destRed[x] = local56;
						destGreen[x] = local98;
						destBlue[x] = srcBlue[x];
					}
				}
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt371 = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.anInt378 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.anInt373 = buffer.readUnsignedShort();
		} else if (code == 3) {
			this.anInt374 = buffer.readUnsignedShort();
		} else if (code == 4) {
			@Pc(55) int local55 = buffer.readUnsignedMedium();
			this.anIntArray40[0] = (local55 & 0xFF0000) << 4;
			this.anIntArray40[2] = local55 >> 12 & 0x0;
			this.anIntArray40[1] = local55 >> 4 & 0xFF0;
		}
	}
}

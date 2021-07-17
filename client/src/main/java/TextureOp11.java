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
		@Pc(18) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(28) int[][] src = this.getChildColorOutput(0, y);
			@Pc(32) int[] srcGreen = src[1];
			@Pc(36) int[] srcRed = src[0];
			@Pc(40) int[] destRed = dest[0];
			@Pc(44) int[] destGreen = dest[1];
			@Pc(48) int[] srcBlue = src[2];
			@Pc(52) int[] destBlue = dest[2];
			for (@Pc(54) int x = 0; x < Texture.width; x++) {
				@Pc(61) int red = srcRed[x];
				@Pc(65) int blue = srcBlue[x];
				@Pc(69) int green = srcGreen[x];
				if (red == blue && blue == green) {
					destRed[x] = this.anInt505 * red >> 12;
					destGreen[x] = this.anInt501 * blue >> 12;
					destBlue[x] = this.anInt508 * green >> 12;
				} else {
					destRed[x] = this.anInt505;
					destGreen[x] = this.anInt501;
					destBlue[x] = this.anInt508;
				}
			}
		}
		return dest;
	}
}

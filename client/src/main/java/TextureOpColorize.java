import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class TextureOpColorize extends TextureOp {

	@OriginalMember(owner = "client!ca", name = "X", descriptor = "I")
	private int green = 4096;

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "I")
	private int red = 4096;

	@OriginalMember(owner = "client!ca", name = "fb", descriptor = "I")
	private int blue = 4096;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public TextureOpColorize() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.red = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.green = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.blue = buffer.readUnsignedShort();
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
					destRed[x] = this.red * red >> 12;
					destGreen[x] = this.green * blue >> 12;
					destBlue[x] = this.blue * green >> 12;
				} else {
					destRed[x] = this.red;
					destGreen[x] = this.green;
					destBlue[x] = this.blue;
				}
			}
		}
		return dest;
	}
}

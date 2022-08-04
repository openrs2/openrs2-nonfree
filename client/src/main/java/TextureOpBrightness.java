import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class TextureOpBrightness extends TextureOp {

	@OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
	private int maxValue = 409;

	@OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
	private int redFactor = 4096;

	@OriginalMember(owner = "client!bl", name = "bb", descriptor = "I")
	private int blueFactor = 4096;

	@OriginalMember(owner = "client!bl", name = "Z", descriptor = "[I")
	private final int[] colorDelta = new int[3];

	@OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
	private int greenFactor = 4096;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public TextureOpBrightness() {
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
				@Pc(56) int r = srcRed[x];
				@Pc(64) int absR = r - this.colorDelta[0];
				if (absR < 0) {
					absR = -absR;
				}
				if (absR <= this.maxValue) {
					@Pc(98) int g = srcGreen[x];
					@Pc(106) int absG = g - this.colorDelta[1];
					if (absG < 0) {
						absG = -absG;
					}
					if (absG <= this.maxValue) {
						@Pc(141) int b = srcBlue[x];
						@Pc(149) int absB = b - this.colorDelta[2];
						if (absB < 0) {
							absB = -absB;
						}
						if (absB <= this.maxValue) {
							destRed[x] = r * this.redFactor >> 12;
							destGreen[x] = g * this.greenFactor >> 12;
							destBlue[x] = b * this.blueFactor >> 12;
						} else {
							destRed[x] = r;
							destGreen[x] = g;
							destBlue[x] = b;
						}
					} else {
						destRed[x] = r;
						destGreen[x] = g;
						destBlue[x] = srcBlue[x];
					}
				} else {
					destRed[x] = r;
					destGreen[x] = srcGreen[x];
					destBlue[x] = srcBlue[x];
				}
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.maxValue = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.blueFactor = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.greenFactor = buffer.readUnsignedShort();
		} else if (code == 3) {
			this.redFactor = buffer.readUnsignedShort();
		} else if (code == 4) {
			@Pc(55) int rgb = buffer.readUnsignedMedium();
			this.colorDelta[0] = (rgb & 0xFF0000) << 4;
			this.colorDelta[2] = rgb >> 12 & 0x0;
			this.colorDelta[1] = rgb >> 4 & 0xFF0;
		}
	}
}

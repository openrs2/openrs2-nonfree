import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class TextureOpClamp extends TextureOp {

	@OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
	private int minValue = 0;

	@OriginalMember(owner = "client!cf", name = "fb", descriptor = "I")
	private int maxValue = 4096;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public TextureOpClamp() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.minValue = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.maxValue = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(19) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(29) int[] src = this.getChildMonochromeOutput(0, y);
			for (@Pc(31) int x = 0; x < Texture.width; x++) {
				@Pc(38) int value = src[x];
				if (value < this.minValue) {
					dest[x] = this.minValue;
				} else if (value > this.maxValue) {
					dest[x] = this.maxValue;
				} else {
					dest[x] = value;
				}
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(7) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(22) int[][] src = this.getChildColorOutput(0, y);
			@Pc(26) int[] srcRed = src[0];
			@Pc(30) int[] srcGreen = src[1];
			@Pc(34) int[] destRed = dest[0];
			@Pc(38) int[] srcBlue = src[2];
			@Pc(42) int[] destGreen = dest[1];
			@Pc(46) int[] destBlue = dest[2];
			for (@Pc(48) int x = 0; x < Texture.width; x++) {
				@Pc(59) int green = srcGreen[x];
				@Pc(63) int red = srcRed[x];
				@Pc(67) int blue = srcBlue[x];
				if (red < this.minValue) {
					destRed[x] = this.minValue;
				} else if (red > this.maxValue) {
					destRed[x] = this.maxValue;
				} else {
					destRed[x] = red;
				}
				if (green < this.minValue) {
					destGreen[x] = this.minValue;
				} else if (green > this.maxValue) {
					destGreen[x] = this.maxValue;
				} else {
					destGreen[x] = green;
				}
				if (blue < this.minValue) {
					destBlue[x] = this.minValue;
				} else if (blue > this.maxValue) {
					destBlue[x] = this.maxValue;
				} else {
					destBlue[x] = blue;
				}
			}
		}
		return dest;
	}
}

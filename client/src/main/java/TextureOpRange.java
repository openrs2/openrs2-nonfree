import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class TextureOpRange extends TextureOp {

	@OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
	private int range = 2048;

	@OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
	private int minValue = 1024;

	@OriginalMember(owner = "client!sc", name = "ib", descriptor = "I")
	private int maxValue = 3072;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public TextureOpRange() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(7) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(20) int[] src = this.getChildMonochromeOutput(0, y);
			for (@Pc(22) int x = 0; x < Texture.width; x++) {
				dest[x] = this.minValue + (src[x] * this.range >> 12);
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(13) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(23) int[][] src = this.getChildColorOutput(0, y);
			@Pc(27) int[] srcRed = src[0];
			@Pc(31) int[] srcGreen = src[1];
			@Pc(35) int[] destRed = dest[0];
			@Pc(39) int[] destBlue = dest[2];
			@Pc(43) int[] destGreen = dest[1];
			@Pc(47) int[] srcBlue = src[2];
			for (@Pc(49) int x = 0; x < Texture.width; x++) {
				destRed[x] = this.minValue + (this.range * srcRed[x] >> 12);
				destGreen[x] = this.minValue + (this.range * srcGreen[x] >> 12);
				destBlue[x] = this.minValue + (this.range * srcBlue[x] >> 12);
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)V")
	@Override
	public void postDecode() {
		this.range = this.maxValue - this.minValue;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.minValue = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.maxValue = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}
}

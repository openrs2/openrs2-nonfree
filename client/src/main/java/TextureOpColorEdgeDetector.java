import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class TextureOpColorEdgeDetector extends TextureOp {

	@OriginalMember(owner = "client!no", name = "X", descriptor = "I")
	private int anInt3634 = 4096;

	@OriginalMember(owner = "client!no", name = "T", descriptor = "Z")
	private boolean aBoolean263 = true;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public TextureOpColorEdgeDetector() {
		super(1, false);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt3634 = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.aBoolean263 = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(16) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(33) int[] src0 = this.getChildMonochromeOutput(0, Texture.heightMask & y - 1);
			@Pc(39) int[] src1 = this.getChildMonochromeOutput(0, y);
			@Pc(51) int[] src2 = this.getChildMonochromeOutput(0, y + 1 & Texture.heightMask);
			@Pc(55) int[] destRed = dest[0];
			@Pc(59) int[] destGreen = dest[1];
			@Pc(63) int[] destBlue = dest[2];
			for (@Pc(65) int x = 0; x < Texture.width; x++) {
				@Pc(84) int dy = (src2[x] - src0[x]) * this.anInt3634;
				@Pc(103) int dx = this.anInt3634 * (src1[x + 1 & Texture.widthMask] - src1[x - 1 & Texture.widthMask]);
				@Pc(107) int dy0 = dy >> 12;
				@Pc(111) int dx0 = dx >> 12;
				@Pc(117) int dySquared = dy0 * dy0 >> 12;
				@Pc(123) int dxSquared = dx0 * dx0 >> 12;
				@Pc(137) int local137 = (int) (Math.sqrt((float) (dySquared + dxSquared + 4096) / 4096.0F) * 4096.0D);
				@Pc(148) int red;
				@Pc(144) int green;
				@Pc(146) int blue;
				if (local137 == 0) {
					green = 0;
					blue = 0;
					red = 0;
				} else {
					green = dy / local137;
					blue = 16777216 / local137;
					red = dx / local137;
				}
				if (this.aBoolean263) {
					red = (red >> 1) + 2048;
					green = (green >> 1) + 2048;
					blue = (blue >> 1) + 2048;
				}
				destRed[x] = red;
				destGreen[x] = green;
				destBlue[x] = blue;
			}
		}
		return dest;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class TextureOp33 extends TextureOp {

	@OriginalMember(owner = "client!no", name = "X", descriptor = "I")
	private int anInt3634 = 4096;

	@OriginalMember(owner = "client!no", name = "T", descriptor = "Z")
	private boolean aBoolean263 = true;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public TextureOp33() {
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
			@Pc(33) int[] local33 = this.getChildMonochromeOutput(0, Texture.heightMask & y - 1);
			@Pc(39) int[] local39 = this.getChildMonochromeOutput(0, y);
			@Pc(51) int[] local51 = this.getChildMonochromeOutput(0, y + 1 & Texture.heightMask);
			@Pc(55) int[] destRed = dest[0];
			@Pc(59) int[] destGreen = dest[1];
			@Pc(63) int[] destBlue = dest[2];
			for (@Pc(65) int x = 0; x < Texture.width; x++) {
				@Pc(84) int local84 = (local51[x] - local33[x]) * this.anInt3634;
				@Pc(103) int local103 = this.anInt3634 * (local39[x + 1 & Texture.widthMask] - local39[x - 1 & Texture.widthMask]);
				@Pc(107) int local107 = local84 >> 12;
				@Pc(111) int local111 = local103 >> 12;
				@Pc(117) int local117 = local107 * local107 >> 12;
				@Pc(123) int local123 = local111 * local111 >> 12;
				@Pc(137) int local137 = (int) (Math.sqrt((double) ((float) (local117 + local123 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(148) int local148;
				@Pc(144) int local144;
				@Pc(146) int local146;
				if (local137 == 0) {
					local144 = 0;
					local146 = 0;
					local148 = 0;
				} else {
					local144 = local84 / local137;
					local146 = 16777216 / local137;
					local148 = local103 / local137;
				}
				if (this.aBoolean263) {
					local148 = (local148 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local146 = (local146 >> 1) + 2048;
				}
				destRed[x] = local148;
				destGreen[x] = local144;
				destBlue[x] = local146;
			}
		}
		return dest;
	}
}

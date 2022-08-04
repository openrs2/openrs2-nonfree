import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class TextureOpWeave extends TextureOp {

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
	private int thickness = 585;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public TextureOpWeave() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.thickness = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(18) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(27) int local27 = Texture.normalisedY[y];
			for (@Pc(29) int x = 0; x < Texture.width; x++) {
				@Pc(40) int local40 = Texture.normalisedX[x];
				if (this.thickness < local40 && 4096 - this.thickness > local40 && local27 > 2048 - this.thickness && this.thickness + 2048 > local27) {
					@Pc(78) int local78 = 2048 - local40;
					local78 = local78 < 0 ? -local78 : local78;
					local78 <<= 12;
					local78 /= 2048 - this.thickness;
					dest[x] = 4096 - local78;
				} else if (2048 - this.thickness < local40 && this.thickness + 2048 > local40) {
					@Pc(127) int local127 = local27 - 2048;
					local127 = local127 >= 0 ? local127 : -local127;
					local127 -= this.thickness;
					local127 <<= 12;
					dest[x] = local127 / (2048 - this.thickness);
				} else if (local27 < this.thickness || local27 > 4096 - this.thickness) {
					@Pc(180) int local180 = local40 - 2048;
					local180 = local180 < 0 ? -local180 : local180;
					local180 -= this.thickness;
					local180 <<= 12;
					dest[x] = local180 / (2048 - this.thickness);
				} else if (this.thickness <= local40 && local40 <= 4096 - this.thickness) {
					dest[x] = 0;
				} else {
					@Pc(236) int local236 = 2048 - local27;
					local236 = local236 < 0 ? -local236 : local236;
					local236 <<= 12;
					local236 /= 2048 - this.thickness;
					dest[x] = 4096 - local236;
				}
			}
		}
		return dest;
	}
}

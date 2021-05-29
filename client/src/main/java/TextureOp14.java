import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class TextureOp14 extends TextureOp {

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
	private int anInt3124 = 585;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public TextureOp14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt3124 = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(18) int[] local18 = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(27) int local27 = Texture.heightFractions[y];
			for (@Pc(29) int local29 = 0; local29 < Texture.width; local29++) {
				@Pc(40) int local40 = Texture.widthFractions[local29];
				if (this.anInt3124 < local40 && 4096 - this.anInt3124 > local40 && local27 > 2048 - this.anInt3124 && this.anInt3124 + 2048 > local27) {
					@Pc(78) int local78 = 2048 - local40;
					local78 = local78 < 0 ? -local78 : local78;
					local78 <<= 12;
					local78 /= 2048 - this.anInt3124;
					local18[local29] = 4096 - local78;
				} else if (2048 - this.anInt3124 < local40 && this.anInt3124 + 2048 > local40) {
					@Pc(127) int local127 = local27 - 2048;
					local127 = local127 >= 0 ? local127 : -local127;
					local127 -= this.anInt3124;
					local127 <<= 12;
					local18[local29] = local127 / (2048 - this.anInt3124);
				} else if (local27 < this.anInt3124 || local27 > 4096 - this.anInt3124) {
					@Pc(180) int local180 = local40 - 2048;
					local180 = local180 < 0 ? -local180 : local180;
					local180 -= this.anInt3124;
					local180 <<= 12;
					local18[local29] = local180 / (2048 - this.anInt3124);
				} else if (this.anInt3124 <= local40 && local40 <= 4096 - this.anInt3124) {
					local18[local29] = 0;
				} else {
					@Pc(236) int local236 = 2048 - local27;
					local236 = local236 < 0 ? -local236 : local236;
					local236 <<= 12;
					local236 /= 2048 - this.anInt3124;
					local18[local29] = 4096 - local236;
				}
			}
		}
		return local18;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class TextureOpMandelbrot extends TextureOp {

	@OriginalMember(owner = "client!dn", name = "X", descriptor = "I")
	private int anInt1159 = 20;

	@OriginalMember(owner = "client!dn", name = "V", descriptor = "I")
	private int anInt1157 = 0;

	@OriginalMember(owner = "client!dn", name = "Y", descriptor = "I")
	private int anInt1160 = 1365;

	@OriginalMember(owner = "client!dn", name = "db", descriptor = "I")
	private int anInt1164 = 0;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public TextureOpMandelbrot() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt1160 = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.anInt1159 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.anInt1164 = buffer.readUnsignedShort();
		} else if (code == 3) {
			this.anInt1157 = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(7) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			for (@Pc(23) int x = 0; x < Texture.width; x++) {
				@Pc(42) int local42 = this.anInt1164 + (Texture.normalisedX[x] << 12) / this.anInt1160;
				@Pc(54) int local54 = this.anInt1157 + (Texture.normalisedY[y] << 12) / this.anInt1160;
				@Pc(58) int local58 = local54;
				@Pc(60) int local60 = local42;
				@Pc(64) int local64 = 0;
				@Pc(70) int local70 = local42 * local42 >> 12;
				@Pc(76) int local76 = local54 * local54 >> 12;
				while (local70 + local76 < 16384 && local64 < this.anInt1159) {
					local64++;
					local58 = local54 + (local58 * local60 >> 12) * 2;
					local60 = local42 + local70 - local76;
					local76 = local58 * local58 >> 12;
					local70 = local60 * local60 >> 12;
				}
				dest[x] = local64 >= this.anInt1159 - 1 ? 0 : (local64 << 12) / this.anInt1159;
			}
		}
		return dest;
	}
}

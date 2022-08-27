import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class TextureOpHerringbone extends TextureOp {

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
	private int scaleX = 1;

	@OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
	private int ratio = 204;

	@OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
	private int scaleY = 1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public TextureOpHerringbone() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			for (@Pc(22) int x = 0; x < Texture.width; x++) {
				@Pc(33) int normalisedX = Texture.normalisedX[x];
				@Pc(40) int local40 = normalisedX * this.scaleX >> 12;
				@Pc(44) int normalisedY = Texture.normalisedY[y];
				@Pc(51) int local51 = normalisedY * this.scaleY >> 12;
				@Pc(61) int local61 = this.scaleX * (normalisedX % (4096 / this.scaleX));
				@Pc(71) int local71 = normalisedY % (4096 / this.scaleY) * this.scaleY;
				if (local71 < this.ratio) {
					for (local40 -= local51; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						dest[x] = 0;
						continue;
					}
					if (local61 < this.ratio) {
						dest[x] = 0;
						continue;
					}
				}
				if (local61 < this.ratio) {
					@Pc(131) int local131;
					for (local131 = local40 - local51; local131 < 0; local131 += 4) {
					}
					while (local131 > 3) {
						local131 -= 4;
					}
					if (local131 > 0) {
						dest[x] = 0;
						continue;
					}
				}
				dest[x] = 4096;
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.scaleX = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.scaleY = buffer.readUnsignedByte();
		} else if (code == 2) {
			this.ratio = buffer.readUnsignedShort();
		}
	}
}

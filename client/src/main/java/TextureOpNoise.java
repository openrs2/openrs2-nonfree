import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class TextureOpNoise extends TextureOp {

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public TextureOpNoise() {
		super(0, true);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(III)I")
	private int noise(@OriginalArg(2) int x, @OriginalArg(0) int y) {
		@Pc(10) int noise = x + y * 57;
		noise ^= noise << 1;
		return 4096 - (noise * (noise * 15731 * noise + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(9) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(21) int heightFraction = Texture.normalisedY[y];
			for (@Pc(23) int x = 0; x < Texture.width; x++) {
				dest[x] = this.noise(Texture.normalisedX[x], heightFraction) % 4096;
			}
		}
		return dest;
	}
}

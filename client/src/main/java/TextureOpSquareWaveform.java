import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class TextureOpSquareWaveform extends TextureOp {

	@OriginalMember(owner = "client!rm", name = "bb", descriptor = "[I")
	private int[] anIntArray498;

	@OriginalMember(owner = "client!rm", name = "eb", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
	private int frequency = 10;

	@OriginalMember(owner = "client!rm", name = "Y", descriptor = "I")
	private int ratio = 2048;

	@OriginalMember(owner = "client!rm", name = "Z", descriptor = "I")
	private int mode = 0;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public TextureOpSquareWaveform() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.frequency = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.ratio = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.mode = buffer.readUnsignedByte();
		}
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(B)V")
	@Override
	public void postDecode() {
		this.method3784();
	}

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "(B)V")
	private void method3784() {
		this.anIntArray498 = new int[this.frequency + 1];
		@Pc(17) int local17 = 4096 / this.frequency;
		this.anIntArray499 = new int[this.frequency + 1];
		@Pc(31) int local31 = local17 * this.ratio >> 12;
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 0; local35 < this.frequency; local35++) {
			this.anIntArray498[local35] = local33;
			this.anIntArray499[local35] = local31 + local33;
			local33 += local17;
		}
		this.anIntArray498[this.frequency] = 4096;
		this.anIntArray499[this.frequency] = this.anIntArray499[0] + 4096;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(26) int local26 = Texture.normalisedY[y];
			if (this.mode == 0) {
				@Pc(140) short local140 = 0;
				for (@Pc(142) int local142 = 0; local142 < this.frequency; local142++) {
					if (local26 >= this.anIntArray498[local142] && local26 < this.anIntArray498[local142 + 1]) {
						if (local26 < this.anIntArray499[local142]) {
							local140 = 4096;
						}
						break;
					}
				}
				ArrayUtils.fill(dest, 0, Texture.width, local140);
			} else {
				for (@Pc(31) int x = 0; x < Texture.width; x++) {
					@Pc(40) int local40 = 0;
					@Pc(42) short local42 = 0;
					@Pc(46) int normalisedX = Texture.normalisedX[x];
					@Pc(49) int local49 = this.mode;
					if (local49 == 1) {
						local40 = normalisedX;
					} else if (local49 == 2) {
						local40 = (local26 + normalisedX - 4096 >> 1) + 2048;
					} else if (local49 == 3) {
						local40 = (normalisedX - local26 >> 1) + 2048;
					}
					for (@Pc(86) int local86 = 0; local86 < this.frequency; local86++) {
						if (this.anIntArray498[local86] <= local40 && local40 < this.anIntArray498[local86 + 1]) {
							if (local40 < this.anIntArray499[local86]) {
								local42 = 4096;
							}
							break;
						}
					}
					dest[x] = local42;
				}
			}
		}
		return dest;
	}
}

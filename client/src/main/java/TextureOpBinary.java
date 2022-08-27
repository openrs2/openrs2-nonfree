import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class TextureOpBinary extends TextureOp {

	@OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
	private int minValue = 0;

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
	private int maxValue = 4096;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public TextureOpBinary() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.minValue = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.maxValue = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(17) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(27) int[] src = this.getChildMonochromeOutput(0, y);
			for (@Pc(29) int x = 0; x < Texture.width; x++) {
				@Pc(40) int value = src[x];
				dest[x] = value >= this.minValue && value <= this.maxValue ? 4096 : 0;
			}
		}
		return dest;
	}
}

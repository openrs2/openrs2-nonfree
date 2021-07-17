import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class TextureOpMonochromeFill extends TextureOp {

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
	private int value;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
	private TextureOpMonochromeFill(@OriginalArg(0) int value) {
		super(0, true);
		this.value = 4096;
		this.value = value;
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public TextureOpMonochromeFill() {
		this(4096);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.value = (buffer.readUnsignedByte() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(15) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			ArrayUtils.fill(dest, 0, Texture.width, this.value);
		}
		return dest;
	}
}

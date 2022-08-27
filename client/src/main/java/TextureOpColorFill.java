import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class TextureOpColorFill extends TextureOp {

	@OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
	private int blue;

	@OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
	private int green;

	@OriginalMember(owner = "client!hk", name = "bb", descriptor = "I")
	private int red;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V")
	private TextureOpColorFill(@OriginalArg(0) int color) {
		super(0, false);
		this.setColor(color);
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public TextureOpColorFill() {
		this(0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.setColor(buffer.readUnsignedMedium());
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(16) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(24) int[] green = dest[1];
			@Pc(28) int[] red = dest[0];
			@Pc(32) int[] blue = dest[2];
			for (@Pc(34) int x = 0; x < Texture.width; x++) {
				red[x] = this.red;
				green[x] = this.green;
				blue[x] = this.blue;
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
	private void setColor(@OriginalArg(1) int color) {
		this.green = color >> 4 & 0xFF0;
		this.red = color >> 12 & 0xFF0;
		this.blue = (color & 0xFF) << 4;
	}
}

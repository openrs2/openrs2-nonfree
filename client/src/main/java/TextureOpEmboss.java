import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class TextureOpEmboss extends TextureOp {

	@OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
	private int azimuth = 3216;

	@OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
	private int elevation = 3216;

	@OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
	private int depth = 4096;

	@OriginalMember(owner = "client!ck", name = "eb", descriptor = "[I")
	private final int[] anIntArray57 = new int[3];

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public TextureOpEmboss() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.depth = buffer.readUnsignedShort();
		} else if (code == 1) {
			this.azimuth = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.elevation = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V")
	@Override
	public void postDecode() {
		this.method642();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(7) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(24) int local24 = Texture.widthTimes32 * this.depth >> 12;
			@Pc(36) int[] local36 = this.getChildMonochromeOutput(0, y - 1 & Texture.heightMask);
			@Pc(44) int[] local44 = this.getChildMonochromeOutput(0, y);
			@Pc(56) int[] local56 = this.getChildMonochromeOutput(0, Texture.heightMask & y + 1);
			for (@Pc(58) int x = 0; x < Texture.width; x++) {
				@Pc(82) int local82 = local24 * (local44[Texture.widthMask & x - 1] - local44[Texture.widthMask & x + 1]) >> 12;
				@Pc(86) int local86 = local82 >> 4;
				@Pc(99) int local99 = (local56[x] - local36[x]) * local24 >> 12;
				if (local86 < 0) {
					local86 = -local86;
				}
				@Pc(112) int local112 = local99 >> 4;
				if (local112 < 0) {
					local112 = -local112;
				}
				if (local112 > 255) {
					local112 = 255;
				}
				if (local86 > 255) {
					local86 = 255;
				}
				@Pc(149) int local149 = TextureMathUtils.INVERSE_SQUARE_ROOT[local86 + ((local112 + 1) * local112 >> 1)] & 0xFF;
				@Pc(155) int local155 = local82 * local149 >> 8;
				@Pc(161) int local161 = local149 * local99 >> 8;
				local155 = this.anIntArray57[0] * local155 >> 12;
				@Pc(176) int local176 = local149 * 4096 >> 8;
				local161 = this.anIntArray57[1] * local161 >> 12;
				local176 = this.anIntArray57[2] * local176 >> 12;
				dest[x] = local176 + local161 + local155;
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "(B)V")
	private void method642() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.elevation / 4096.0F));
		this.anIntArray57[0] = (int) (Math.sin((double) ((float) this.azimuth / 4096.0F)) * 4096.0D * local11);
		this.anIntArray57[1] = (int) (Math.cos((double) ((float) this.azimuth / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray57[2] = (int) (Math.sin((double) ((float) this.elevation / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray57[0] * this.anIntArray57[0] >> 12;
		@Pc(81) int local81 = this.anIntArray57[2] * this.anIntArray57[2] >> 12;
		@Pc(93) int local93 = this.anIntArray57[1] * this.anIntArray57[1] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local81 + local69 + local93 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray57[0] = (this.anIntArray57[0] << 12) / local106;
			this.anIntArray57[2] = (this.anIntArray57[2] << 12) / local106;
			this.anIntArray57[1] = (this.anIntArray57[1] << 12) / local106;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class TextureOp12 extends TextureOp {

	@OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
	private int anInt5471 = 0;

	@OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
	private int anInt5470 = 1;

	@OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
	private int anInt5476 = 0;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public TextureOp12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(17) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(26) int local26 = Texture.heightFractions[y];
			@Pc(32) int local32 = local26 - 2048 >> 1;
			for (@Pc(34) int x = 0; x < Texture.width; x++) {
				@Pc(41) int local41 = Texture.widthFractions[x];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(79) int local79;
				if (this.anInt5471 == 0) {
					local79 = (local41 - local26) * this.anInt5470;
				} else {
					@Pc(60) int local60 = local32 * local32 + local47 * local47 >> 12;
					@Pc(70) int local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local79 = (int) ((double) (this.anInt5470 * local70) * 3.141592653589793D);
				}
				@Pc(95) int local95 = local79 - (local79 & 0xFFFFF000);
				if (this.anInt5476 == 0) {
					local95 = TextureOp.SINE[local95 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5476 == 2) {
					@Pc(118) int local118 = local95 - 2048;
					if (local118 < 0) {
						local118 = -local118;
					}
					local95 = 2048 - local118 << 1;
				}
				dest[x] = local95;
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)V")
	@Override
	public final void postDecode() {
		TextureOp.createTrigonometryTables();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt5471 = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.anInt5476 = buffer.readUnsignedByte();
		} else if (code == 3) {
			this.anInt5470 = buffer.readUnsignedByte();
		}
	}
}

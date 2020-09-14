import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

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
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(26) int local26 = Static6.anIntArray478[arg0];
			@Pc(32) int local32 = local26 - 2048 >> 1;
			for (@Pc(34) int local34 = 0; local34 < Static2.anInt1626; local34++) {
				@Pc(41) int local41 = Static4.anIntArray231[local34];
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
					local95 = Static3.anIntArray223[local95 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5476 == 2) {
					@Pc(118) int local118 = local95 - 2048;
					if (local118 < 0) {
						local118 = -local118;
					}
					local95 = 2048 - local118 << 1;
				}
				local17[local34] = local95;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)V")
	@Override
	public final void postDecode() {
		Static37.method4645();
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

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class TextureOp16 extends TextureOp {

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
	private int anInt4359 = 1;

	@OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
	private int anInt4368 = 204;

	@OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
	private int anInt4360 = 1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public TextureOp16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			for (@Pc(22) int local22 = 0; local22 < Static2.anInt1626; local22++) {
				@Pc(33) int local33 = Static4.anIntArray231[local22];
				@Pc(40) int local40 = local33 * this.anInt4359 >> 12;
				@Pc(44) int local44 = Static6.anIntArray478[arg0];
				@Pc(51) int local51 = local44 * this.anInt4360 >> 12;
				@Pc(61) int local61 = this.anInt4359 * (local33 % (4096 / this.anInt4359));
				@Pc(71) int local71 = local44 % (4096 / this.anInt4360) * this.anInt4360;
				if (local71 < this.anInt4368) {
					for (local40 -= local51; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local61 < this.anInt4368) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local61 < this.anInt4368) {
					@Pc(131) int local131;
					for (local131 = local40 - local51; local131 < 0; local131 += 4) {
					}
					while (local131 > 3) {
						local131 -= 4;
					}
					if (local131 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt4359 = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.anInt4360 = buffer.readUnsignedByte();
		} else if (code == 2) {
			this.anInt4368 = buffer.readUnsignedShort();
		}
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class4_Sub1_Sub6 extends Class4_Sub1 {

	@OriginalMember(owner = "client!dn", name = "X", descriptor = "I")
	private int anInt1159 = 20;

	@OriginalMember(owner = "client!dn", name = "V", descriptor = "I")
	private int anInt1157 = 0;

	@OriginalMember(owner = "client!dn", name = "Y", descriptor = "I")
	private int anInt1160 = 1365;

	@OriginalMember(owner = "client!dn", name = "db", descriptor = "I")
	private int anInt1164 = 0;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void method4687(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1160 = arg0.readUnsignedShort();
		} else if (arg1 == 1) {
			this.anInt1159 = arg0.readUnsignedShort();
		} else if (arg1 == 2) {
			this.anInt1164 = arg0.readUnsignedShort();
		} else if (arg1 == 3) {
			this.anInt1157 = arg0.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			for (@Pc(23) int local23 = 0; local23 < Static2.anInt1626; local23++) {
				@Pc(42) int local42 = this.anInt1164 + (Static4.anIntArray231[local23] << 12) / this.anInt1160;
				@Pc(54) int local54 = this.anInt1157 + (Static6.anIntArray478[arg0] << 12) / this.anInt1160;
				@Pc(58) int local58 = local54;
				@Pc(60) int local60 = local42;
				@Pc(64) int local64 = 0;
				@Pc(70) int local70 = local42 * local42 >> 12;
				@Pc(76) int local76 = local54 * local54 >> 12;
				while (local70 + local76 < 16384 && local64 < this.anInt1159) {
					local64++;
					local58 = local54 + (local58 * local60 >> 12) * 2;
					local60 = local42 + local70 - local76;
					local76 = local58 * local58 >> 12;
					local70 = local60 * local60 >> 12;
				}
				local7[local23] = local64 >= this.anInt1159 - 1 ? 0 : (local64 << 12) / this.anInt1159;
			}
		}
		return local7;
	}
}

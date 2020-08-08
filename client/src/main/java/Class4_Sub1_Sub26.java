import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class4_Sub1_Sub26 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rg", name = "X", descriptor = "I")
	private int anInt4505 = 0;

	@OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
	private int anInt4503 = 8192;

	@OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
	private int anInt4508 = 2048;

	@OriginalMember(owner = "client!rg", name = "W", descriptor = "I")
	private int anInt4504 = 0;

	@OriginalMember(owner = "client!rg", name = "lb", descriptor = "I")
	private int anInt4515 = 2048;

	@OriginalMember(owner = "client!rg", name = "cb", descriptor = "I")
	private int anInt4507 = 12288;

	@OriginalMember(owner = "client!rg", name = "nb", descriptor = "I")
	private int anInt4517 = 4096;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)Z")
	private boolean method3687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = (arg1 - arg0) * this.anInt4507 >> 12;
		@Pc(24) int local24 = Static3.anIntArray222[local9 * 255 >> 12 & 0xFF];
		local24 = (local24 << 12) / this.anInt4507;
		local24 = (local24 << 12) / this.anInt4503;
		local24 = this.anInt4517 * local24 >> 12;
		return local24 > arg0 + arg1 && -local24 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIB)Z")
	private boolean method3690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 + arg1) * this.anInt4507 >> 12;
		@Pc(23) int local23 = Static3.anIntArray222[local13 * 255 >> 12 & 0xFF];
		local23 = (local23 << 12) / this.anInt4507;
		local23 = (local23 << 12) / this.anInt4503;
		local23 = local23 * this.anInt4517 >> 12;
		return local23 > arg0 - arg1 && arg0 - arg1 > -local23;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V")
	@Override
	public final void method4700() {
		Static37.method4645();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void method4687(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4508 = arg0.method4616();
		} else if (arg1 == 1) {
			this.anInt4505 = arg0.method4616();
		} else if (arg1 == 2) {
			this.anInt4504 = arg0.method4616();
		} else if (arg1 == 3) {
			this.anInt4515 = arg0.method4616();
		} else if (arg1 == 4) {
			this.anInt4507 = arg0.method4616();
		} else if (arg1 == 5) {
			this.anInt4517 = arg0.method4616();
		} else if (arg1 == 6) {
			this.anInt4503 = arg0.method4616();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(22) int local22 = Static6.anIntArray478[arg0] - 2048;
			for (@Pc(24) int local24 = 0; local24 < Static2.anInt1626; local24++) {
				@Pc(33) int local33 = Static4.anIntArray231[local24] - 2048;
				@Pc(38) int local38 = local33 + this.anInt4508;
				local38 = local38 >= -2048 ? local38 : local38 + 4096;
				@Pc(53) int local53 = local22 + this.anInt4505;
				local38 = local38 <= 2048 ? local38 : local38 - 4096;
				local53 = local53 < -2048 ? local53 + 4096 : local53;
				local53 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(87) int local87 = this.anInt4504 + local33;
				@Pc(92) int local92 = this.anInt4515 + local22;
				local87 = local87 >= -2048 ? local87 : local87 + 4096;
				local87 = local87 <= 2048 ? local87 : local87 - 4096;
				local92 = local92 < -2048 ? local92 + 4096 : local92;
				local92 = local92 <= 2048 ? local92 : local92 - 4096;
				local12[local24] = this.method3687(local38, local53) || this.method3690(local92, local87) ? 4096 : 0;
			}
		}
		return local12;
	}
}

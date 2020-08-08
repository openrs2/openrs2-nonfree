import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class4_Sub1_Sub22 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
	private int anInt4154 = 32768;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V")
	@Override
	public final void method4700() {
		Static37.method4645();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(23) int[] local23 = this.method4699(arg0, 1);
			@Pc(29) int[] local29 = this.method4699(arg0, 2);
			for (@Pc(31) int local31 = 0; local31 < Static2.anInt1626; local31++) {
				@Pc(46) int local46 = local23[local31] >> 4 & 0xFF;
				@Pc(55) int local55 = this.anInt4154 * local29[local31] >> 12;
				@Pc(63) int local63 = local55 * Static3.anIntArray223[local46] >> 12;
				@Pc(71) int local71 = Static6.anInt5001 & arg0 + (local63 >> 12);
				@Pc(79) int local79 = local55 * Static3.anIntArray222[local46] >> 12;
				@Pc(87) int local87 = Static1.anInt901 & local31 + (local79 >> 12);
				@Pc(93) int[] local93 = this.method4699(local71, 0);
				local13[local31] = local93[local87];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void method4687(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4154 = arg0.method4616() << 4;
		} else if (arg1 == 1) {
			this.aBoolean397 = arg0.method4629() == 1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4695(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass114_41.method2696(arg0);
		if (this.aClass114_41.aBoolean230) {
			@Pc(17) int[] local17 = this.method4699(arg0, 1);
			@Pc(23) int[] local23 = this.method4699(arg0, 2);
			@Pc(27) int[] local27 = local7[0];
			@Pc(31) int[] local31 = local7[1];
			@Pc(35) int[] local35 = local7[2];
			for (@Pc(37) int local37 = 0; local37 < Static2.anInt1626; local37++) {
				@Pc(53) int local53 = local23[local37] * this.anInt4154 >> 12;
				@Pc(63) int local63 = local17[local37] * 255 >> 12 & 0xFF;
				@Pc(71) int local71 = local53 * Static3.anIntArray223[local63] >> 12;
				@Pc(79) int local79 = Static3.anIntArray222[local63] * local53 >> 12;
				@Pc(87) int local87 = Static1.anInt901 & (local79 >> 12) + local37;
				@Pc(95) int local95 = (local71 >> 12) + arg0 & Static6.anInt5001;
				@Pc(101) int[][] local101 = this.method4686(0, local95);
				local27[local37] = local101[0][local87];
				local31[local37] = local101[1][local87];
				local35[local37] = local101[2][local87];
			}
		}
		return local7;
	}
}

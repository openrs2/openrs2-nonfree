import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class84 {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!ni;")
	private Class4 aClass4_77;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!ni;")
	private Class4 aClass4_78;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
	private int anInt2338 = 0;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "[Lclient!ni;")
	public final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	public final int anInt2336;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
	public Class84(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt2336 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(29) Class4 local29 = this.aClass4Array1[local13] = new Class4();
			local29.aClass4_234 = local29;
			local29.aClass4_235 = local29;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
	public final int method1839() {
		return this.anInt2336;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ni;IJ)V")
	public final void method1840(@OriginalArg(0) Class4 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_234 != null) {
			arg0.method4817();
		}
		@Pc(27) Class4 local27 = this.aClass4Array1[(int) (arg1 & (long) (this.anInt2336 - 1))];
		arg0.aLong212 = arg1;
		arg0.aClass4_235 = local27;
		arg0.aClass4_234 = local27.aClass4_234;
		arg0.aClass4_234.aClass4_235 = arg0;
		arg0.aClass4_235.aClass4_234 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I")
	public final int method1841() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2336; local9++) {
			@Pc(22) Class4 local22 = this.aClass4Array1[local9];
			for (@Pc(25) Class4 local25 = local22.aClass4_235; local25 != local22; local25 = local25.aClass4_235) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Lclient!ni;")
	public final Class4 method1842() {
		this.anInt2338 = 0;
		return this.method1843();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Lclient!ni;")
	public final Class4 method1843() {
		if (this.anInt2338 > 0 && this.aClass4Array1[this.anInt2338 - 1] != this.aClass4_78) {
			@Pc(25) Class4 local25 = this.aClass4_78;
			this.aClass4_78 = local25.aClass4_235;
			return local25;
		}
		@Pc(58) Class4 local58;
		do {
			if (this.anInt2338 >= this.anInt2336) {
				return null;
			}
			local58 = this.aClass4Array1[this.anInt2338++].aClass4_235;
		} while (local58 == this.aClass4Array1[this.anInt2338 - 1]);
		this.aClass4_78 = local58.aClass4_235;
		return local58;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)Lclient!ni;")
	public final Class4 method1844(@OriginalArg(0) long arg0) {
		this.aLong76 = arg0;
		@Pc(28) Class4 local28 = this.aClass4Array1[(int) ((long) (this.anInt2336 - 1) & arg0)];
		for (this.aClass4_77 = local28.aClass4_235; this.aClass4_77 != local28; this.aClass4_77 = this.aClass4_77.aClass4_235) {
			if (this.aClass4_77.aLong212 == arg0) {
				@Pc(50) Class4 local50 = this.aClass4_77;
				this.aClass4_77 = this.aClass4_77.aClass4_235;
				return local50;
			}
		}
		this.aClass4_77 = null;
		return null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[Lclient!ni;)I")
	public final int method1845(@OriginalArg(1) Class4[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2336; local9++) {
			@Pc(22) Class4 local22 = this.aClass4Array1[local9];
			for (@Pc(25) Class4 local25 = local22.aClass4_235; local25 != local22; local25 = local25.aClass4_235) {
				arg0[local7++] = local25;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)Lclient!ni;")
	public final Class4 method1846() {
		if (this.aClass4_77 == null) {
			return null;
		}
		@Pc(23) Class4 local23 = this.aClass4Array1[(int) ((long) (this.anInt2336 - 1) & this.aLong76)];
		while (local23 != this.aClass4_77) {
			if (this.aLong76 == this.aClass4_77.aLong212) {
				@Pc(38) Class4 local38 = this.aClass4_77;
				this.aClass4_77 = this.aClass4_77.aClass4_235;
				return local38;
			}
			this.aClass4_77 = this.aClass4_77.aClass4_235;
		}
		this.aClass4_77 = null;
		return null;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
	public final void method1847() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2336; local7++) {
			@Pc(24) Class4 local24 = this.aClass4Array1[local7];
			while (true) {
				@Pc(27) Class4 local27 = local24.aClass4_235;
				if (local27 == local24) {
					break;
				}
				local27.method4817();
			}
		}
		this.aClass4_78 = null;
		this.aClass4_77 = null;
	}
}

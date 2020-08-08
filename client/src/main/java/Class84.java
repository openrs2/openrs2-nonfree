import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class84 {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!ni;")
	private Node aClass4_77;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!ni;")
	private Node aClass4_78;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
	private int anInt2338 = 0;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "[Lclient!ni;")
	public final Node[] aClass4Array1;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	public final int anInt2336;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
	public Class84(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Node[arg0];
		this.anInt2336 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(29) Node local29 = this.aClass4Array1[local13] = new Node();
			local29.prev = local29;
			local29.next = local29;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
	public final int method1839() {
		return this.anInt2336;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ni;IJ)V")
	public final void method1840(@OriginalArg(0) Node arg0, @OriginalArg(2) long arg1) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		@Pc(27) Node local27 = this.aClass4Array1[(int) (arg1 & (long) (this.anInt2336 - 1))];
		arg0.key = arg1;
		arg0.next = local27;
		arg0.prev = local27.prev;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I")
	public final int method1841() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2336; local9++) {
			@Pc(22) Node local22 = this.aClass4Array1[local9];
			for (@Pc(25) Node local25 = local22.next; local25 != local22; local25 = local25.next) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Lclient!ni;")
	public final Node method1842() {
		this.anInt2338 = 0;
		return this.method1843();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Lclient!ni;")
	public final Node method1843() {
		if (this.anInt2338 > 0 && this.aClass4Array1[this.anInt2338 - 1] != this.aClass4_78) {
			@Pc(25) Node local25 = this.aClass4_78;
			this.aClass4_78 = local25.next;
			return local25;
		}
		@Pc(58) Node local58;
		do {
			if (this.anInt2338 >= this.anInt2336) {
				return null;
			}
			local58 = this.aClass4Array1[this.anInt2338++].next;
		} while (local58 == this.aClass4Array1[this.anInt2338 - 1]);
		this.aClass4_78 = local58.next;
		return local58;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)Lclient!ni;")
	public final Node method1844(@OriginalArg(0) long arg0) {
		this.aLong76 = arg0;
		@Pc(28) Node local28 = this.aClass4Array1[(int) ((long) (this.anInt2336 - 1) & arg0)];
		for (this.aClass4_77 = local28.next; this.aClass4_77 != local28; this.aClass4_77 = this.aClass4_77.next) {
			if (this.aClass4_77.key == arg0) {
				@Pc(50) Node local50 = this.aClass4_77;
				this.aClass4_77 = this.aClass4_77.next;
				return local50;
			}
		}
		this.aClass4_77 = null;
		return null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[Lclient!ni;)I")
	public final int method1845(@OriginalArg(1) Node[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2336; local9++) {
			@Pc(22) Node local22 = this.aClass4Array1[local9];
			for (@Pc(25) Node local25 = local22.next; local25 != local22; local25 = local25.next) {
				arg0[local7++] = local25;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)Lclient!ni;")
	public final Node method1846() {
		if (this.aClass4_77 == null) {
			return null;
		}
		@Pc(23) Node local23 = this.aClass4Array1[(int) ((long) (this.anInt2336 - 1) & this.aLong76)];
		while (local23 != this.aClass4_77) {
			if (this.aLong76 == this.aClass4_77.key) {
				@Pc(38) Node local38 = this.aClass4_77;
				this.aClass4_77 = this.aClass4_77.next;
				return local38;
			}
			this.aClass4_77 = this.aClass4_77.next;
		}
		this.aClass4_77 = null;
		return null;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
	public final void method1847() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2336; local7++) {
			@Pc(24) Node local24 = this.aClass4Array1[local7];
			while (true) {
				@Pc(27) Node local27 = local24.next;
				if (local27 == local24) {
					break;
				}
				local27.unlink();
			}
		}
		this.aClass4_78 = null;
		this.aClass4_77 = null;
	}
}

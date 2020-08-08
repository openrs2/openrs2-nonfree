import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class53_Sub6 extends Class53 {

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Lclient!ne;")
	private Class20_Sub3 aClass20_Sub3_5;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
	private int anInt3711;

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	public int anInt3723;

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "D")
	public double aDouble10;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	private int anInt3708 = 0;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
	private int anInt3718 = -1;

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
	private int anInt3725 = 0;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
	private int anInt3730 = -32768;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
	private final int anInt3728;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
	private final int anInt3726;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	private final int anInt3709;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
	public final int anInt3719;

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
	private final int anInt3714;

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
	public final int anInt3717;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	public final int anInt3707;

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
	public final int anInt3713;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
	private final int anInt3720;

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
	private final int anInt3727;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
	public final int anInt3722;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Lclient!eg;")
	private final Class46 aClass46_2;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class53_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt3728 = arg3;
		this.anInt3726 = arg4;
		this.aBoolean268 = false;
		this.anInt3709 = arg2;
		this.anInt3719 = arg5;
		this.anInt3714 = arg8;
		this.anInt3717 = arg1;
		this.anInt3707 = arg6;
		this.anInt3713 = arg9;
		this.anInt3720 = arg0;
		this.anInt3727 = arg7;
		this.anInt3722 = arg10;
		@Pc(61) int local61 = Static21.method2004(this.anInt3720).anInt3134;
		if (local61 == -1) {
			this.aClass46_2 = null;
		} else {
			this.aClass46_2 = Static23.method2494(local61);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	public final void method3103(@OriginalArg(0) int arg0) {
		this.aDouble10 += this.aDouble6 * (double) arg0;
		this.aBoolean268 = true;
		if (this.anInt3727 == -1) {
			this.aDouble5 += (double) arg0 * this.aDouble7;
		} else {
			this.aDouble5 += (double) arg0 * this.aDouble3 * 0.5D * (double) arg0 + this.aDouble7 * (double) arg0;
			this.aDouble7 += this.aDouble3 * (double) arg0;
		}
		this.aDouble8 += (double) arg0 * this.aDouble4;
		this.anInt3723 = (int) (Math.atan2(this.aDouble4, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
		this.anInt3711 = (int) (Math.atan2(this.aDouble7, this.aDouble9) * 325.949D) & 0x7FF;
		if (this.aClass46_2 == null) {
			return;
		}
		this.anInt3725 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass46_2.anIntArray94[this.anInt3708] >= this.anInt3725) {
						return;
					}
					this.anInt3725 -= this.aClass46_2.anIntArray94[this.anInt3708];
					this.anInt3708++;
					if (this.aClass46_2.anIntArray95.length <= this.anInt3708) {
						this.anInt3708 -= this.aClass46_2.anInt1242;
						if (this.anInt3708 < 0 || this.anInt3708 >= this.aClass46_2.anIntArray95.length) {
							this.anInt3708 = 0;
						}
					}
					this.anInt3718 = this.anInt3708 + 1;
				} while (this.anInt3718 < this.aClass46_2.anIntArray95.length);
				this.anInt3718 -= this.aClass46_2.anInt1242;
			} while (this.anInt3718 >= 0 && this.aClass46_2.anIntArray95.length > this.anInt3718);
			this.anInt3718 = -1;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		@Pc(7) Class53_Sub4 local7 = this.method3108();
		if (local7 != null) {
			this.method3106(local7);
			local7.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_5);
			this.anInt3730 = local7.method3813();
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIIII)V")
	public final void method3105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!this.aBoolean268) {
			@Pc(14) double local14 = (double) (arg1 - this.anInt3709);
			@Pc(21) double local21 = (double) (arg3 - this.anInt3728);
			@Pc(30) double local30 = Math.sqrt(local14 * local14 + local21 * local21);
			this.aDouble5 = this.anInt3726;
			this.aDouble8 = (double) this.anInt3709 + (double) this.anInt3714 * local14 / local30;
			this.aDouble10 = (double) this.anInt3728 + (double) this.anInt3714 * local21 / local30;
		}
		@Pc(69) double local69 = (double) (this.anInt3707 + 1 - arg2);
		this.aDouble4 = ((double) arg1 - this.aDouble8) / local69;
		this.aDouble6 = ((double) arg3 - this.aDouble10) / local69;
		this.aDouble9 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble6 * this.aDouble6);
		if (this.anInt3727 == -1) {
			this.aDouble7 = ((double) arg0 - this.aDouble5) / local69;
		} else {
			if (!this.aBoolean268) {
				this.aDouble7 = -this.aDouble9 * Math.tan((double) this.anInt3727 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg0 - this.aDouble7 * local69 - this.aDouble5) * 2.0D / (local69 * local69);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!vg;)V")
	private void method3106(@OriginalArg(1) Class53_Sub4 arg0) {
		if (Static3.aBoolean138) {
			@Pc(4) Class53_Sub4_Sub2 local4 = (Class53_Sub4_Sub2) arg0;
			if ((this.aClass20_Sub3_5 == null || this.aClass20_Sub3_5.aBoolean250) && (local4.aClass158Array3 != null || local4.aClass167Array3 != null)) {
				this.aClass20_Sub3_5 = new Class20_Sub3(Static2.anInt954, 1, 1);
			}
			if (this.aClass20_Sub3_5 != null) {
				this.aClass20_Sub3_5.method2967(local4.aClass158Array3, local4.aClass167Array3, false, local4.anIntArray507, local4.anIntArray504, local4.anIntArray502);
			}
		} else {
			@Pc(51) Class53_Sub4_Sub1 local51 = (Class53_Sub4_Sub1) arg0;
			if ((this.aClass20_Sub3_5 == null || this.aClass20_Sub3_5.aBoolean250) && (local51.aClass158Array2 != null || local51.aClass167Array2 != null)) {
				this.aClass20_Sub3_5 = new Class20_Sub3(Static2.anInt954, 1, 1);
			}
			if (this.aClass20_Sub3_5 != null) {
				this.aClass20_Sub3_5.method2967(local51.aClass158Array2, local51.aClass167Array2, false, local51.anIntArray347, local51.anIntArray344, local51.anIntArray340);
			}
		}
		this.aBoolean267 = true;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()I")
	@Override
	public final int method3813() {
		return this.anInt3730;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Lclient!vg;")
	private Class53_Sub4 method3108() {
		@Pc(14) Class110 local14 = Static21.method2004(this.anInt3720);
		@Pc(24) Class53_Sub4 local24 = local14.method2569(this.anInt3718, this.anInt3725, this.anInt3708);
		if (local24 == null) {
			return null;
		} else {
			local24.method3832(this.anInt3711);
			return local24;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean267) {
			@Pc(11) Class53_Sub4 local11 = this.method3108();
			if (local11 == null) {
				return;
			}
			this.method3106(local11);
		}
		if (this.aClass20_Sub3_5 != null) {
			this.aClass20_Sub3_5.method2949(arg0, arg1, arg3, arg2, arg4);
		}
	}
}

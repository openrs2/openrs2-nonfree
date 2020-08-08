import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class10 {

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "Lclient!lh;")
	private Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	private final int anInt132;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "[Lclient!lh;")
	private final Class4_Sub3[] aClass4_Sub3Array1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
	public Class10(@OriginalArg(0) int arg0) {
		this.anInt132 = arg0;
		this.aClass4_Sub3Array1 = new Class4_Sub3[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(22) Class4_Sub3 local22 = this.aClass4_Sub3Array1[local10] = new Class4_Sub3();
			local22.aClass4_Sub3_75 = local22;
			local22.aClass4_Sub3_74 = local22;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Lclient!lh;")
	public final Class4_Sub3 method117() {
		if (this.aClass4_Sub3_1 == null) {
			return null;
		}
		@Pc(30) Class4_Sub3 local30 = this.aClass4_Sub3Array1[(int) ((long) (this.anInt132 - 1) & this.aLong5)];
		while (local30 != this.aClass4_Sub3_1) {
			if (this.aLong5 == this.aClass4_Sub3_1.aLong213) {
				@Pc(45) Class4_Sub3 local45 = this.aClass4_Sub3_1;
				this.aClass4_Sub3_1 = this.aClass4_Sub3_1.aClass4_Sub3_75;
				return local45;
			}
			this.aClass4_Sub3_1 = this.aClass4_Sub3_1.aClass4_Sub3_75;
		}
		this.aClass4_Sub3_1 = null;
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BJ)Lclient!lh;")
	public final Class4_Sub3 method118(@OriginalArg(1) long arg0) {
		this.aLong5 = arg0;
		@Pc(26) Class4_Sub3 local26 = this.aClass4_Sub3Array1[(int) (arg0 & (long) (this.anInt132 - 1))];
		for (this.aClass4_Sub3_1 = local26.aClass4_Sub3_75; this.aClass4_Sub3_1 != local26; this.aClass4_Sub3_1 = this.aClass4_Sub3_1.aClass4_Sub3_75) {
			if (arg0 == this.aClass4_Sub3_1.aLong213) {
				@Pc(44) Class4_Sub3 local44 = this.aClass4_Sub3_1;
				this.aClass4_Sub3_1 = this.aClass4_Sub3_1.aClass4_Sub3_75;
				return local44;
			}
		}
		this.aClass4_Sub3_1 = null;
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(JLclient!lh;I)V")
	public final void method119(@OriginalArg(0) long arg0, @OriginalArg(1) Class4_Sub3 arg1) {
		if (arg1.aClass4_Sub3_74 != null) {
			arg1.method4819();
		}
		@Pc(32) Class4_Sub3 local32 = this.aClass4_Sub3Array1[(int) (arg0 & (long) (this.anInt132 - 1))];
		arg1.aClass4_Sub3_74 = local32.aClass4_Sub3_74;
		arg1.aLong213 = arg0;
		arg1.aClass4_Sub3_75 = local32;
		arg1.aClass4_Sub3_74.aClass4_Sub3_75 = arg1;
		arg1.aClass4_Sub3_75.aClass4_Sub3_74 = arg1;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class175 {

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Lclient!lh;")
	private Class4_Sub3 aClass4_Sub3_61;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Lclient!lh;")
	public final Class4_Sub3 aClass4_Sub3_60 = new Class4_Sub3();

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class175() {
		this.aClass4_Sub3_60.aClass4_Sub3_74 = this.aClass4_Sub3_60;
		this.aClass4_Sub3_60.aClass4_Sub3_75 = this.aClass4_Sub3_60;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Lclient!lh;")
	public final Class4_Sub3 method4332() {
		@Pc(9) Class4_Sub3 local9 = this.aClass4_Sub3_60.aClass4_Sub3_75;
		if (local9 == this.aClass4_Sub3_60) {
			this.aClass4_Sub3_61 = null;
			return null;
		} else {
			this.aClass4_Sub3_61 = local9.aClass4_Sub3_75;
			return local9;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!lh;)V")
	public final void method4333(@OriginalArg(1) Class4_Sub3 arg0) {
		if (arg0.aClass4_Sub3_74 != null) {
			arg0.method4819();
		}
		arg0.aClass4_Sub3_75 = this.aClass4_Sub3_60;
		arg0.aClass4_Sub3_74 = this.aClass4_Sub3_60.aClass4_Sub3_74;
		arg0.aClass4_Sub3_74.aClass4_Sub3_75 = arg0;
		arg0.aClass4_Sub3_75.aClass4_Sub3_74 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I")
	public final int method4334() {
		@Pc(3) int local3 = 0;
		@Pc(11) Class4_Sub3 local11 = this.aClass4_Sub3_60.aClass4_Sub3_75;
		while (this.aClass4_Sub3_60 != local11) {
			local11 = local11.aClass4_Sub3_75;
			local3++;
		}
		return local3;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)Lclient!lh;")
	public final Class4_Sub3 method4336() {
		@Pc(12) Class4_Sub3 local12 = this.aClass4_Sub3_60.aClass4_Sub3_75;
		if (this.aClass4_Sub3_60 == local12) {
			return null;
		} else {
			local12.method4819();
			return local12;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public final void method4337() {
		while (true) {
			@Pc(5) Class4_Sub3 local5 = this.aClass4_Sub3_60.aClass4_Sub3_75;
			if (local5 == this.aClass4_Sub3_60) {
				this.aClass4_Sub3_61 = null;
				return;
			}
			local5.method4819();
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Lclient!lh;")
	public final Class4_Sub3 method4340() {
		@Pc(2) Class4_Sub3 local2 = this.aClass4_Sub3_61;
		if (this.aClass4_Sub3_60 == local2) {
			this.aClass4_Sub3_61 = null;
			return null;
		} else {
			this.aClass4_Sub3_61 = local2.aClass4_Sub3_75;
			return local2;
		}
	}
}

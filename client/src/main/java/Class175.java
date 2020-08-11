import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class175 {

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Lclient!lh;")
	private SecondaryNode aClass4_Sub3_61;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Lclient!lh;")
	public final SecondaryNode aClass4_Sub3_60 = new SecondaryNode();

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class175() {
		this.aClass4_Sub3_60.secondaryPrev = this.aClass4_Sub3_60;
		this.aClass4_Sub3_60.secondaryNext = this.aClass4_Sub3_60;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Lclient!lh;")
	public final SecondaryNode method4332() {
		@Pc(9) SecondaryNode local9 = this.aClass4_Sub3_60.secondaryNext;
		if (local9 == this.aClass4_Sub3_60) {
			this.aClass4_Sub3_61 = null;
			return null;
		} else {
			this.aClass4_Sub3_61 = local9.secondaryNext;
			return local9;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!lh;)V")
	public final void method4333(@OriginalArg(1) SecondaryNode arg0) {
		if (arg0.secondaryPrev != null) {
			arg0.unlinkSecondary();
		}
		arg0.secondaryNext = this.aClass4_Sub3_60;
		arg0.secondaryPrev = this.aClass4_Sub3_60.secondaryPrev;
		arg0.secondaryPrev.secondaryNext = arg0;
		arg0.secondaryNext.secondaryPrev = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I")
	public final int method4334() {
		@Pc(3) int local3 = 0;
		@Pc(11) SecondaryNode local11 = this.aClass4_Sub3_60.secondaryNext;
		while (this.aClass4_Sub3_60 != local11) {
			local11 = local11.secondaryNext;
			local3++;
		}
		return local3;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)Lclient!lh;")
	public final SecondaryNode method4336() {
		@Pc(12) SecondaryNode local12 = this.aClass4_Sub3_60.secondaryNext;
		if (this.aClass4_Sub3_60 == local12) {
			return null;
		} else {
			local12.unlinkSecondary();
			return local12;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public final void method4337() {
		while (true) {
			@Pc(5) SecondaryNode local5 = this.aClass4_Sub3_60.secondaryNext;
			if (local5 == this.aClass4_Sub3_60) {
				this.aClass4_Sub3_61 = null;
				return;
			}
			local5.unlinkSecondary();
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Lclient!lh;")
	public final SecondaryNode method4340() {
		@Pc(2) SecondaryNode local2 = this.aClass4_Sub3_61;
		if (this.aClass4_Sub3_60 == local2) {
			this.aClass4_Sub3_61 = null;
			return null;
		} else {
			this.aClass4_Sub3_61 = local2.secondaryNext;
			return local2;
		}
	}
}

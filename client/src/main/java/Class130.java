import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class130 {

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Lclient!uk;")
	private Class175 aClass175_13;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Lclient!lh;")
	private SecondaryNode aClass4_Sub3_51;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lclient!lh;")
	public final SecondaryNode method3250() {
		@Pc(6) SecondaryNode local6 = this.aClass4_Sub3_51;
		if (local6 == this.aClass175_13.aClass4_Sub3_60) {
			this.aClass4_Sub3_51 = null;
			return null;
		} else {
			this.aClass4_Sub3_51 = local6.secondaryNext;
			return local6;
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)Lclient!lh;")
	public final SecondaryNode method3255() {
		@Pc(8) SecondaryNode local8 = this.aClass175_13.aClass4_Sub3_60.secondaryNext;
		if (this.aClass175_13.aClass4_Sub3_60 == local8) {
			this.aClass4_Sub3_51 = null;
			return null;
		} else {
			this.aClass4_Sub3_51 = local8.secondaryNext;
			return local8;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!uk;)V")
	public final void method3256(@OriginalArg(1) Class175 arg0) {
		this.aClass175_13 = arg0;
	}
}

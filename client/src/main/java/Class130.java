import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class130 {

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Lclient!uk;")
	private Class175 aClass175_13;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Lclient!lh;")
	private Class4_Sub3 aClass4_Sub3_51;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lclient!lh;")
	public final Class4_Sub3 method3250() {
		@Pc(6) Class4_Sub3 local6 = this.aClass4_Sub3_51;
		if (local6 == this.aClass175_13.aClass4_Sub3_60) {
			this.aClass4_Sub3_51 = null;
			return null;
		} else {
			this.aClass4_Sub3_51 = local6.aClass4_Sub3_75;
			return local6;
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)Lclient!lh;")
	public final Class4_Sub3 method3255() {
		@Pc(8) Class4_Sub3 local8 = this.aClass175_13.aClass4_Sub3_60.aClass4_Sub3_75;
		if (this.aClass175_13.aClass4_Sub3_60 == local8) {
			this.aClass4_Sub3_51 = null;
			return null;
		} else {
			this.aClass4_Sub3_51 = local8.aClass4_Sub3_75;
			return local8;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!uk;)V")
	public final void method3256(@OriginalArg(1) Class175 arg0) {
		this.aClass175_13 = arg0;
	}
}

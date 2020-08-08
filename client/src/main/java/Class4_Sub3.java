import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Lclient!lh;")
	public Class4_Sub3 aClass4_Sub3_74;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "J")
	public long aLong213;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "Lclient!lh;")
	public Class4_Sub3 aClass4_Sub3_75;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public final void method4819() {
		if (this.aClass4_Sub3_74 != null) {
			this.aClass4_Sub3_74.aClass4_Sub3_75 = this.aClass4_Sub3_75;
			this.aClass4_Sub3_75.aClass4_Sub3_74 = this.aClass4_Sub3_74;
			this.aClass4_Sub3_74 = null;
			this.aClass4_Sub3_75 = null;
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z")
	public final boolean method4821() {
		return this.aClass4_Sub3_74 != null;
	}
}

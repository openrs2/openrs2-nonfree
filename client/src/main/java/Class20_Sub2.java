import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!r;")
	public Class20_Sub2 aClass20_Sub2_5;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "Lclient!r;")
	public Class20_Sub2 aClass20_Sub2_6;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public final void method2628() {
		if (this.aClass20_Sub2_6 != null) {
			this.aClass20_Sub2_6.aClass20_Sub2_5 = this.aClass20_Sub2_5;
			this.aClass20_Sub2_5.aClass20_Sub2_6 = this.aClass20_Sub2_6;
			this.aClass20_Sub2_5 = null;
			this.aClass20_Sub2_6 = null;
		}
	}
}

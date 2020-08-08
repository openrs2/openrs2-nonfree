import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class Class20 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!mb;")
	public Class20 aClass20_9;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Lclient!mb;")
	public Class20 aClass20_10;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public final void method2944() {
		if (this.aClass20_10 != null) {
			this.aClass20_10.aClass20_9 = this.aClass20_9;
			this.aClass20_9.aClass20_10 = this.aClass20_10;
			this.aClass20_10 = null;
			this.aClass20_9 = null;
		}
	}
}

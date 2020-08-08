import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class Class4 {

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "Lclient!ni;")
	public Class4 aClass4_234;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "Lclient!ni;")
	public Class4 aClass4_235;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "J")
	public long aLong212;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)Z")
	public final boolean method4815() {
		return this.aClass4_234 != null;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V")
	public final void method4817() {
		if (this.aClass4_234 != null) {
			this.aClass4_234.aClass4_235 = this.aClass4_235;
			this.aClass4_235.aClass4_234 = this.aClass4_234;
			this.aClass4_234 = null;
			this.aClass4_235 = null;
		}
	}
}

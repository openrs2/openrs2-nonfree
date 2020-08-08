import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class172 {

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!mb;")
	private Class20 aClass20_12;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!mb;")
	public final Class20 aClass20_11 = new Class20();

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class172() {
		this.aClass20_11.aClass20_10 = this.aClass20_11;
		this.aClass20_11.aClass20_9 = this.aClass20_11;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lclient!mb;")
	public final Class20 method4315() {
		@Pc(6) Class20 local6 = this.aClass20_12;
		if (this.aClass20_11 == local6) {
			this.aClass20_12 = null;
			return null;
		} else {
			this.aClass20_12 = local6.aClass20_9;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)I")
	public final int method4316() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class20 local19 = this.aClass20_11.aClass20_9;
		while (this.aClass20_11 != local19) {
			local19 = local19.aClass20_9;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)Lclient!mb;")
	public final Class20 method4320() {
		@Pc(9) Class20 local9 = this.aClass20_11.aClass20_9;
		if (local9 == this.aClass20_11) {
			this.aClass20_12 = null;
			return null;
		} else {
			this.aClass20_12 = local9.aClass20_9;
			return local9;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!mb;)V")
	public final void method4322(@OriginalArg(1) Class20 arg0) {
		if (arg0.aClass20_10 != null) {
			arg0.method2944();
		}
		arg0.aClass20_9 = this.aClass20_11;
		arg0.aClass20_10 = this.aClass20_11.aClass20_10;
		arg0.aClass20_10.aClass20_9 = arg0;
		arg0.aClass20_9.aClass20_10 = arg0;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class108 {

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!r;")
	private Class20_Sub2 aClass20_Sub2_2;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!r;")
	public final Class20_Sub2 aClass20_Sub2_1 = new Class20_Sub2();

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class108() {
		this.aClass20_Sub2_1.aClass20_Sub2_5 = this.aClass20_Sub2_1;
		this.aClass20_Sub2_1.aClass20_Sub2_6 = this.aClass20_Sub2_1;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public final void method2457() {
		while (true) {
			@Pc(5) Class20_Sub2 local5 = this.aClass20_Sub2_1.aClass20_Sub2_5;
			if (local5 == this.aClass20_Sub2_1) {
				this.aClass20_Sub2_2 = null;
				return;
			}
			local5.method2628();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)Lclient!r;")
	public final Class20_Sub2 method2458() {
		@Pc(18) Class20_Sub2 local18 = this.aClass20_Sub2_1.aClass20_Sub2_5;
		if (local18 == this.aClass20_Sub2_1) {
			this.aClass20_Sub2_2 = null;
			return null;
		} else {
			this.aClass20_Sub2_2 = local18.aClass20_Sub2_5;
			return local18;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!r;)V")
	public final void method2460(@OriginalArg(1) Class20_Sub2 arg0) {
		if (arg0.aClass20_Sub2_6 != null) {
			arg0.method2628();
		}
		arg0.aClass20_Sub2_5 = this.aClass20_Sub2_1;
		arg0.aClass20_Sub2_6 = this.aClass20_Sub2_1.aClass20_Sub2_6;
		arg0.aClass20_Sub2_6.aClass20_Sub2_5 = arg0;
		arg0.aClass20_Sub2_5.aClass20_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)Lclient!r;")
	public final Class20_Sub2 method2461() {
		@Pc(2) Class20_Sub2 local2 = this.aClass20_Sub2_2;
		if (this.aClass20_Sub2_1 == local2) {
			this.aClass20_Sub2_2 = null;
			return null;
		} else {
			this.aClass20_Sub2_2 = local2.aClass20_Sub2_5;
			return local2;
		}
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class112 {

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "Lclient!ni;")
	private Class4 aClass4_118;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "Lclient!ni;")
	public final Class4 aClass4_117 = new Class4();

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class112() {
		this.aClass4_117.aClass4_235 = this.aClass4_117;
		this.aClass4_117.aClass4_234 = this.aClass4_117;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public final void method2606() {
		while (true) {
			@Pc(9) Class4 local9 = this.aClass4_117.aClass4_235;
			if (this.aClass4_117 == local9) {
				this.aClass4_118 = null;
				return;
			}
			local9.method4817();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!ni;B)V")
	public final void method2607(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_234 != null) {
			arg0.method4817();
		}
		arg0.aClass4_234 = this.aClass4_117;
		arg0.aClass4_235 = this.aClass4_117.aClass4_235;
		arg0.aClass4_234.aClass4_235 = arg0;
		arg0.aClass4_235.aClass4_234 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)Lclient!ni;")
	public final Class4 method2608() {
		@Pc(7) Class4 local7 = this.aClass4_117.aClass4_235;
		if (local7 == this.aClass4_117) {
			return null;
		} else {
			local7.method4817();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)Z")
	public final boolean method2609() {
		return this.aClass4_117.aClass4_235 == this.aClass4_117;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)Lclient!ni;")
	public final Class4 method2610() {
		@Pc(7) Class4 local7 = this.aClass4_117.aClass4_235;
		if (local7 == this.aClass4_117) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local7.aClass4_235;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!ni;)V")
	public final void method2612(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_234 != null) {
			arg0.method4817();
		}
		arg0.aClass4_234 = this.aClass4_117.aClass4_234;
		arg0.aClass4_235 = this.aClass4_117;
		arg0.aClass4_234.aClass4_235 = arg0;
		arg0.aClass4_235.aClass4_234 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Lclient!ni;")
	public final Class4 method2613() {
		@Pc(7) Class4 local7 = this.aClass4_117.aClass4_234;
		if (local7 == this.aClass4_117) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local7.aClass4_234;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)Lclient!ni;")
	public final Class4 method2615() {
		@Pc(8) Class4 local8 = this.aClass4_118;
		if (local8 == this.aClass4_117) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local8.aClass4_234;
			return local8;
		}
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)Lclient!ni;")
	public final Class4 method2616() {
		@Pc(13) Class4 local13 = this.aClass4_118;
		if (this.aClass4_117 == local13) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local13.aClass4_235;
			return local13;
		}
	}
}

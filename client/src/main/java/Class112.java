import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class112 {

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "Lclient!ni;")
	private Node aClass4_118;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "Lclient!ni;")
	public final Node aClass4_117 = new Node();

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class112() {
		this.aClass4_117.next = this.aClass4_117;
		this.aClass4_117.prev = this.aClass4_117;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public final void method2606() {
		while (true) {
			@Pc(9) Node local9 = this.aClass4_117.next;
			if (this.aClass4_117 == local9) {
				this.aClass4_118 = null;
				return;
			}
			local9.unlink();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!ni;B)V")
	public final void method2607(@OriginalArg(0) Node arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.aClass4_117;
		arg0.next = this.aClass4_117.next;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)Lclient!ni;")
	public final Node method2608() {
		@Pc(7) Node local7 = this.aClass4_117.next;
		if (local7 == this.aClass4_117) {
			return null;
		} else {
			local7.unlink();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)Z")
	public final boolean method2609() {
		return this.aClass4_117.next == this.aClass4_117;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)Lclient!ni;")
	public final Node method2610() {
		@Pc(7) Node local7 = this.aClass4_117.next;
		if (local7 == this.aClass4_117) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local7.next;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!ni;)V")
	public final void method2612(@OriginalArg(1) Node arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.aClass4_117.prev;
		arg0.next = this.aClass4_117;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Lclient!ni;")
	public final Node method2613() {
		@Pc(7) Node local7 = this.aClass4_117.prev;
		if (local7 == this.aClass4_117) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local7.prev;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)Lclient!ni;")
	public final Node method2615() {
		@Pc(8) Node local8 = this.aClass4_118;
		if (local8 == this.aClass4_117) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local8.prev;
			return local8;
		}
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)Lclient!ni;")
	public final Node method2616() {
		@Pc(13) Node local13 = this.aClass4_118;
		if (this.aClass4_117 == local13) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local13.next;
			return local13;
		}
	}
}

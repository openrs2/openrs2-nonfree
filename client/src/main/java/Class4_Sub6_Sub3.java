import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class4_Sub6_Sub3 extends Class4_Sub6 {

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "Lclient!ll;")
	private final LinkedList aClass112_15 = new LinkedList();

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "Lclient!ll;")
	private final LinkedList aClass112_16 = new LinkedList();

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
	private int anInt3269 = 0;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
	private int anInt3270 = -1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([III)V")
	@Override
	public final synchronized void method3348(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3270 < 0) {
				this.method2673(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3269 + arg2 < this.anInt3270) {
				this.anInt3269 += arg2;
				this.method2673(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3270 - this.anInt3269;
			this.method2673(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3269 += local33;
			this.method2669();
			@Pc(60) Class4_Sub33 local60 = (Class4_Sub33) this.aClass112_16.head();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4811(this);
				if (local68 < 0) {
					local60.anInt6071 = 0;
					this.method2668(local60);
				} else {
					local60.anInt6071 = local68;
					this.method2672(local60.next, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!wm;)V")
	private void method2668(@OriginalArg(0) Class4_Sub33 arg0) {
		arg0.unlink();
		arg0.method4810();
		@Pc(9) Node local9 = this.aClass112_16.sentinel.next;
		if (local9 == this.aClass112_16.sentinel) {
			this.anInt3270 = -1;
		} else {
			this.anInt3270 = ((Class4_Sub33) local9).anInt6071;
		}
	}

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "()V")
	private void method2669() {
		if (this.anInt3269 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub33 local8 = (Class4_Sub33) this.aClass112_16.head(); local8 != null; local8 = (Class4_Sub33) this.aClass112_16.next()) {
			local8.anInt6071 -= this.anInt3269;
		}
		this.anInt3270 -= this.anInt3269;
		this.anInt3269 = 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!tf;)V")
	public final synchronized void method2670(@OriginalArg(0) Class4_Sub6 arg0) {
		arg0.unlink();
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
	@Override
	public final synchronized void method3345(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3270 < 0) {
				this.method2671(arg0);
				return;
			}
			if (this.anInt3269 + arg0 < this.anInt3270) {
				this.anInt3269 += arg0;
				this.method2671(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3270 - this.anInt3269;
			this.method2671(local29);
			arg0 -= local29;
			this.anInt3269 += local29;
			this.method2669();
			@Pc(50) Class4_Sub33 local50 = (Class4_Sub33) this.aClass112_16.head();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4811(this);
				if (local58 < 0) {
					local50.anInt6071 = 0;
					this.method2668(local50);
				} else {
					local50.anInt6071 = local58;
					this.method2672(local50.next, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
	private void method2671(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub6 local5 = (Class4_Sub6) this.aClass112_15.head(); local5 != null; local5 = (Class4_Sub6) this.aClass112_15.next()) {
			local5.method3345(arg0);
		}
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "()Lclient!tf;")
	@Override
	public final Class4_Sub6 method3349() {
		return (Class4_Sub6) this.aClass112_15.next();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ni;Lclient!wm;)V")
	private void method2672(@OriginalArg(0) Node arg0, @OriginalArg(1) Class4_Sub33 arg1) {
		while (arg0 != this.aClass112_16.sentinel && ((Class4_Sub33) arg0).anInt6071 <= arg1.anInt6071) {
			arg0 = arg0.next;
		}
		LinkedList.insertBefore(arg1, arg0);
		this.anInt3270 = ((Class4_Sub33) this.aClass112_16.sentinel.next).anInt6071;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "()I")
	@Override
	public final int method3346() {
		return 0;
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "([III)V")
	private void method2673(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub6 local5 = (Class4_Sub6) this.aClass112_15.head(); local5 != null; local5 = (Class4_Sub6) this.aClass112_15.next()) {
			local5.method3351(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public final Class4_Sub6 method3350() {
		return (Class4_Sub6) this.aClass112_15.head();
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(Lclient!tf;)V")
	public final synchronized void method2674(@OriginalArg(0) Class4_Sub6 arg0) {
		this.aClass112_15.addHead(arg0);
	}
}

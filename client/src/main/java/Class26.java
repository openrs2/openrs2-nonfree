import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class26 {

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!uk;")
	private final Class175 aClass175_2 = new Class175();

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	private final int anInt533;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt532;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!ic;")
	private final Class84 aClass84_1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	public Class26(@OriginalArg(0) int arg0) {
		this.anInt533 = arg0;
		this.anInt532 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass84_1 = new Class84(local14);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	public final int method509() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class4_Sub3_Sub4 local18 = (Class4_Sub3_Sub4) this.aClass175_2.method4332(); local18 != null; local18 = (Class4_Sub3_Sub4) this.aClass175_2.method4340()) {
			if (!local18.method2320()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public final void method510(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method512(arg1);
		if (this.anInt532 == 0) {
			@Pc(31) Class4_Sub3_Sub4 local31 = (Class4_Sub3_Sub4) this.aClass175_2.method4336();
			local31.method4817();
			local31.method4819();
		} else {
			this.anInt532--;
		}
		@Pc(42) Class4_Sub3_Sub4_Sub1 local42 = new Class4_Sub3_Sub4_Sub1(arg0);
		this.aClass84_1.method1840(local42, arg1);
		this.aClass175_2.method4333(local42);
		local42.aLong213 = 0L;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public final void method511() {
		this.aClass175_2.method4337();
		this.aClass84_1.method1847();
		this.anInt532 = this.anInt533;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)V")
	public final void method512(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub3_Sub4 local10 = (Class4_Sub3_Sub4) this.aClass84_1.method1844(arg0);
		if (local10 != null) {
			local10.method4817();
			local10.method4819();
			this.anInt532++;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
	public final void method515() {
		for (@Pc(16) Class4_Sub3_Sub4 local16 = (Class4_Sub3_Sub4) this.aClass175_2.method4332(); local16 != null; local16 = (Class4_Sub3_Sub4) this.aClass175_2.method4340()) {
			if (local16.method2320()) {
				local16.method4817();
				local16.method4819();
				this.anInt532++;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
	public final void method517(@OriginalArg(1) int arg0) {
		if (Static5.aClass67_1 == null) {
			return;
		}
		for (@Pc(22) Class4_Sub3_Sub4 local22 = (Class4_Sub3_Sub4) this.aClass175_2.method4332(); local22 != null; local22 = (Class4_Sub3_Sub4) this.aClass175_2.method4340()) {
			if (local22.method2320()) {
				if (local22.method2319() == null) {
					local22.method4817();
					local22.method4819();
					this.anInt532++;
				}
			} else if (++local22.aLong213 > (long) arg0) {
				@Pc(45) Class4_Sub3_Sub4 local45 = Static5.aClass67_1.method2015(local22);
				this.aClass84_1.method1840(local45, local22.aLong212);
				Static23.method2452(local22, local45);
				local22.method4817();
				local22.method4819();
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public final Object method518(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub3_Sub4 local10 = (Class4_Sub3_Sub4) this.aClass84_1.method1844(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(26) Object local26 = local10.method2319();
		if (local26 == null) {
			local10.method4817();
			local10.method4819();
			this.anInt532++;
			return null;
		}
		if (local10.method2320()) {
			@Pc(61) Class4_Sub3_Sub4_Sub1 local61 = new Class4_Sub3_Sub4_Sub1(local26);
			this.aClass84_1.method1840(local61, local10.aLong212);
			this.aClass175_2.method4333(local61);
			local61.aLong213 = 0L;
			local10.method4817();
			local10.method4819();
		} else {
			this.aClass175_2.method4333(local10);
			local10.aLong213 = 0L;
		}
		return local26;
	}
}

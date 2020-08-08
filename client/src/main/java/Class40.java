import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class40 {

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!lh;")
	private Class4_Sub3 aClass4_Sub3_18 = new Class4_Sub3();

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Lclient!uk;")
	private final Class175 aClass175_3 = new Class175();

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	private final int anInt1045;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!ic;")
	private final Class84 aClass84_4;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V")
	public Class40(@OriginalArg(0) int arg0) {
		this.anInt1044 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.anInt1045 = arg0;
		this.aClass84_4 = new Class84(local16);
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Lclient!ni;")
	public final Class4 method886() {
		return this.aClass84_4.method1842();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(JILclient!lh;)V")
	public final void method888(@OriginalArg(0) long arg0, @OriginalArg(2) Class4_Sub3 arg1) {
		if (this.anInt1044 == 0) {
			@Pc(15) Class4_Sub3 local15 = this.aClass175_3.method4336();
			local15.method4817();
			local15.method4819();
			if (this.aClass4_Sub3_18 == local15) {
				@Pc(31) Class4_Sub3 local31 = this.aClass175_3.method4336();
				local31.method4817();
				local31.method4819();
			}
		} else {
			this.anInt1044--;
		}
		this.aClass84_4.method1840(arg1, arg0);
		this.aClass175_3.method4333(arg1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IJ)Lclient!lh;")
	public final Class4_Sub3 method889(@OriginalArg(1) long arg0) {
		@Pc(18) Class4_Sub3 local18 = (Class4_Sub3) this.aClass84_4.method1844(arg0);
		if (local18 != null) {
			this.aClass175_3.method4333(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Lclient!ni;")
	public final Class4 method890() {
		return this.aClass84_4.method1843();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public final void method893() {
		this.aClass175_3.method4337();
		this.aClass84_4.method1847();
		this.aClass4_Sub3_18 = new Class4_Sub3();
		this.anInt1044 = this.anInt1045;
	}
}

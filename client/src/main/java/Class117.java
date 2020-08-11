import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class117 {

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!fd;")
	private Buffer aClass4_Sub10_6;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "[Lclient!wb;")
	private Class62_Sub1[] aClass62_Sub1Array1;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!en;")
	private final Js5NetQueue aClass51_1;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!ja;")
	private final Js5CacheQueue aClass92_2;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!ul;")
	private Js5NetRequest aClass4_Sub3_Sub1_Sub2_2;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!en;Lclient!ja;)V")
	public Class117(@OriginalArg(0) Js5NetQueue arg0, @OriginalArg(1) Js5CacheQueue arg1) {
		this.aClass51_1 = arg0;
		this.aClass92_2 = arg1;
		if (!this.aClass51_1.isUrgentRequestQueueFull()) {
			this.aClass4_Sub3_Sub1_Sub2_2 = this.aClass51_1.read(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	public final void method2706() {
		if (this.aClass62_Sub1Array1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aClass62_Sub1Array1.length; local12++) {
			if (this.aClass62_Sub1Array1[local12] != null) {
				this.aClass62_Sub1Array1[local12].method4666();
			}
		}
		for (@Pc(43) int local43 = 0; local43 < this.aClass62_Sub1Array1.length; local43++) {
			if (this.aClass62_Sub1Array1[local43] != null) {
				this.aClass62_Sub1Array1[local43].method4673();
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Z")
	public final boolean method2707() {
		if (this.aClass4_Sub10_6 != null) {
			return true;
		}
		if (this.aClass4_Sub3_Sub1_Sub2_2 == null) {
			if (this.aClass51_1.isUrgentRequestQueueFull()) {
				return false;
			}
			this.aClass4_Sub3_Sub1_Sub2_2 = this.aClass51_1.read(255, 255, true, (byte) 0);
		}
		if (this.aClass4_Sub3_Sub1_Sub2_2.incomplete) {
			return false;
		} else {
			this.aClass4_Sub10_6 = new Buffer(this.aClass4_Sub3_Sub1_Sub2_2.getData());
			this.aClass62_Sub1Array1 = new Class62_Sub1[(this.aClass4_Sub10_6.bytes.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fm;BLclient!fm;ZI)Lclient!wb;")
	private Class62_Sub1 method2712(@OriginalArg(0) Cache arg0, @OriginalArg(2) Cache arg1, @OriginalArg(4) int arg2) {
		if (this.aClass4_Sub10_6 == null) {
			throw new RuntimeException();
		}
		this.aClass4_Sub10_6.position = arg2 * 8 + 5;
		if (this.aClass4_Sub10_6.bytes.length <= this.aClass4_Sub10_6.position) {
			throw new RuntimeException();
		} else if (this.aClass62_Sub1Array1[arg2] == null) {
			@Pc(48) int local48 = this.aClass4_Sub10_6.readInt();
			@Pc(55) int local55 = this.aClass4_Sub10_6.readInt();
			@Pc(76) Class62_Sub1 local76 = new Class62_Sub1(arg2, arg1, arg0, this.aClass51_1, this.aClass92_2, local48, local55, true);
			this.aClass62_Sub1Array1[arg2] = local76;
			return local76;
		} else {
			return this.aClass62_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fm;Lclient!fm;IB)Lclient!wb;")
	public final Class62_Sub1 method2714(@OriginalArg(0) Cache arg0, @OriginalArg(1) Cache arg1, @OriginalArg(2) int arg2) {
		return this.method2712(arg0, arg1, arg2);
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class SpotAnim extends Entity {

	@OriginalMember(owner = "client!o", name = "E", descriptor = "Lclient!ne;")
	private Class20_Sub3 aClass20_Sub3_4;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "I")
	private final int anInt3659 = -1;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "I")
	private int anInt3662 = -32768;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!o", name = "B", descriptor = "I")
	private int anInt3661 = 0;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "Z")
	public boolean aBoolean265 = false;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "I")
	private int anInt3666 = 0;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "I")
	public final int anInt3655;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "I")
	private final int anInt3657;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "I")
	public final int anInt3647;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "I")
	public final int anInt3653;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "I")
	public final int anInt3648;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "I")
	public final int anInt3665;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "Lclient!eg;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIII)V")
	public SpotAnim(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3655 = arg1;
		this.anInt3657 = arg0;
		this.anInt3647 = arg2;
		this.anInt3653 = arg3;
		this.anInt3648 = arg4;
		this.anInt3665 = arg5 + arg6;
		@Pc(45) int local45 = Static21.method2004(this.anInt3657).anInt3134;
		if (local45 == -1) {
			this.aBoolean265 = true;
		} else {
			this.aBoolean265 = false;
			this.aClass46_1 = Static23.method2494(local45);
		}
		if (this.anInt3665 == arg6) {
			Static29.method3461(this.aClass46_1, this.anInt3653, this.anInt3647, this.anInt3666, false);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!vg;)V")
	private void method3057(@OriginalArg(1) Model arg0) {
		if (GlRenderer.enabled) {
			@Pc(55) GlModel local55 = (GlModel) arg0;
			if ((this.aClass20_Sub3_4 == null || this.aClass20_Sub3_4.aBoolean250) && (local55.aClass158Array3 != null || local55.aClass167Array3 != null)) {
				this.aClass20_Sub3_4 = new Class20_Sub3(client.loop, 1, 1);
			}
			if (this.aClass20_Sub3_4 != null) {
				this.aClass20_Sub3_4.method2967(local55.aClass158Array3, local55.aClass167Array3, false, local55.anIntArray507, local55.anIntArray504, local55.anIntArray502);
			}
		} else {
			@Pc(8) SoftwareModel local8 = (SoftwareModel) arg0;
			if ((this.aClass20_Sub3_4 == null || this.aClass20_Sub3_4.aBoolean250) && (local8.aClass158Array2 != null || local8.aClass167Array2 != null)) {
				this.aClass20_Sub3_4 = new Class20_Sub3(client.loop, 1, 1);
			}
			if (this.aClass20_Sub3_4 != null) {
				this.aClass20_Sub3_4.method2967(local8.aClass158Array2, local8.aClass167Array2, false, local8.anIntArray347, local8.anIntArray344, local8.anIntArray340);
			}
		}
		this.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
	public final void method3058(@OriginalArg(0) int arg0) {
		if (this.aBoolean265) {
			return;
		}
		this.anInt3661 += arg0;
		while (this.aClass46_1.anIntArray94[this.anInt3666] < this.anInt3661) {
			this.anInt3661 -= this.aClass46_1.anIntArray94[this.anInt3666];
			this.anInt3666++;
			if (this.anInt3666 >= this.aClass46_1.anIntArray95.length) {
				this.aBoolean265 = true;
				break;
			}
		}
		if (!this.aBoolean265) {
			Static29.method3461(this.aClass46_1, this.anInt3653, this.anInt3647, this.anInt3666, false);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Lclient!vg;")
	private Model method3060() {
		@Pc(17) Class110 local17 = Static21.method2004(this.anInt3657);
		@Pc(27) Model local27;
		if (this.aBoolean265) {
			local27 = local17.method2569(-1, 0, -1);
		} else {
			local27 = local17.method2569(this.anInt3659, this.anInt3661, this.anInt3666);
		}
		return local27 == null ? null : local27;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean264) {
			@Pc(10) Model local10 = this.method3060();
			if (local10 == null) {
				return;
			}
			this.method3057(local10);
		}
		if (this.aClass20_Sub3_4 != null) {
			this.aClass20_Sub3_4.method2949(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		@Pc(7) Model local7 = this.method3060();
		if (local7 != null) {
			this.method3057(local7);
			local7.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_4);
			this.anInt3662 = local7.method3813();
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "()I")
	@Override
	public final int method3813() {
		return this.anInt3662;
	}
}

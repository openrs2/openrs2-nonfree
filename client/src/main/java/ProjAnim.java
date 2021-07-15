import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class ProjAnim extends Entity {

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Lclient!ne;")
	private ParticleSystem particleSystem;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
	private int anInt3711;

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	public int anInt3723;

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "D")
	public double aDouble10;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	private int anInt3708 = 0;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
	private int anInt3718 = -1;

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
	private int anInt3725 = 0;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
	private int minY = -32768;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
	private final int anInt3728;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
	private final int anInt3726;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	private final int anInt3709;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
	public final int anInt3719;

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
	private final int anInt3714;

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
	public final int anInt3717;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	public final int anInt3707;

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
	public final int anInt3713;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
	private final int spotAnimId;

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
	private final int anInt3727;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
	public final int anInt3722;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Lclient!eg;")
	private final SeqType aClass46_2;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public ProjAnim(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt3728 = arg3;
		this.anInt3726 = arg4;
		this.aBoolean268 = false;
		this.anInt3709 = arg2;
		this.anInt3719 = arg5;
		this.anInt3714 = arg8;
		this.anInt3717 = arg1;
		this.anInt3707 = arg6;
		this.anInt3713 = arg9;
		this.spotAnimId = arg0;
		this.anInt3727 = arg7;
		this.anInt3722 = arg10;
		@Pc(61) int local61 = SpotAnimTypeList.get(this.spotAnimId).seqId;
		if (local61 == -1) {
			this.aClass46_2 = null;
		} else {
			this.aClass46_2 = SeqTypeList.get(local61);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	public final void method3103(@OriginalArg(0) int arg0) {
		this.aDouble10 += this.aDouble6 * (double) arg0;
		this.aBoolean268 = true;
		if (this.anInt3727 == -1) {
			this.aDouble5 += (double) arg0 * this.aDouble7;
		} else {
			this.aDouble5 += (double) arg0 * this.aDouble3 * 0.5D * (double) arg0 + this.aDouble7 * (double) arg0;
			this.aDouble7 += this.aDouble3 * (double) arg0;
		}
		this.aDouble8 += (double) arg0 * this.aDouble4;
		this.anInt3723 = (int) (Math.atan2(this.aDouble4, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
		this.anInt3711 = (int) (Math.atan2(this.aDouble7, this.aDouble9) * 325.949D) & 0x7FF;
		if (this.aClass46_2 == null) {
			return;
		}
		this.anInt3725 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass46_2.anIntArray94[this.anInt3708] >= this.anInt3725) {
						return;
					}
					this.anInt3725 -= this.aClass46_2.anIntArray94[this.anInt3708];
					this.anInt3708++;
					if (this.aClass46_2.frames.length <= this.anInt3708) {
						this.anInt3708 -= this.aClass46_2.anInt1242;
						if (this.anInt3708 < 0 || this.anInt3708 >= this.aClass46_2.frames.length) {
							this.anInt3708 = 0;
						}
					}
					this.anInt3718 = this.anInt3708 + 1;
				} while (this.anInt3718 < this.aClass46_2.frames.length);
				this.anInt3718 -= this.aClass46_2.anInt1242;
			} while (this.anInt3718 >= 0 && this.aClass46_2.frames.length > this.anInt3718);
			this.anInt3718 = -1;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		@Pc(7) Model local7 = this.getModel();
		if (local7 != null) {
			this.method3106(local7);
			local7.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.particleSystem);
			this.minY = local7.getMinY();
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIIII)V")
	public final void method3105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!this.aBoolean268) {
			@Pc(14) double local14 = (double) (arg1 - this.anInt3709);
			@Pc(21) double local21 = (double) (arg3 - this.anInt3728);
			@Pc(30) double local30 = Math.sqrt(local14 * local14 + local21 * local21);
			this.aDouble5 = this.anInt3726;
			this.aDouble8 = (double) this.anInt3709 + (double) this.anInt3714 * local14 / local30;
			this.aDouble10 = (double) this.anInt3728 + (double) this.anInt3714 * local21 / local30;
		}
		@Pc(69) double local69 = (double) (this.anInt3707 + 1 - arg2);
		this.aDouble4 = ((double) arg1 - this.aDouble8) / local69;
		this.aDouble6 = ((double) arg3 - this.aDouble10) / local69;
		this.aDouble9 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble6 * this.aDouble6);
		if (this.anInt3727 == -1) {
			this.aDouble7 = ((double) arg0 - this.aDouble5) / local69;
		} else {
			if (!this.aBoolean268) {
				this.aDouble7 = -this.aDouble9 * Math.tan((double) this.anInt3727 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg0 - this.aDouble7 * local69 - this.aDouble5) * 2.0D / (local69 * local69);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!vg;)V")
	private void method3106(@OriginalArg(1) Model arg0) {
		if (GlRenderer.enabled) {
			@Pc(4) GlModel local4 = (GlModel) arg0;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (local4.particleEmitters != null || local4.particleEffectors != null)) {
				this.particleSystem = new ParticleSystem(client.loop, 1, 1);
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(local4.particleEmitters, local4.particleEffectors, false, local4.vertexX, local4.vertexY, local4.vertexZ);
			}
		} else {
			@Pc(51) SoftwareModel local51 = (SoftwareModel) arg0;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (local51.particleEmitters != null || local51.particleEffectors != null)) {
				this.particleSystem = new ParticleSystem(client.loop, 1, 1);
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(local51.particleEmitters, local51.particleEffectors, false, local51.vertexX, local51.vertexY, local51.vertexZ);
			}
		}
		this.aBoolean267 = true;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()I")
	@Override
	public final int getMinY() {
		return this.minY;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Lclient!vg;")
	private Model getModel() {
		@Pc(14) SpotAnimType type = SpotAnimTypeList.get(this.spotAnimId);
		@Pc(24) Model model = type.method2569(this.anInt3718, this.anInt3725, this.anInt3708);
		if (model == null) {
			return null;
		} else {
			model.method3832(this.anInt3711);
			return model;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean267) {
			@Pc(11) Model local11 = this.getModel();
			if (local11 == null) {
				return;
			}
			this.method3106(local11);
		}
		if (this.particleSystem != null) {
			this.particleSystem.method2949(arg0, arg1, arg3, arg2, arg4);
		}
	}
}

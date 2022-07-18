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
	private final int zFine;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
	private final int y;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	private final int xFine;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
	public final int startLoop;

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
	private final int anInt3714;

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
	public final int level;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	public final int endLoop;

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
	public final int targetEntity;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
	private final int spotAnimId;

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
	private final int anInt3727;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
	public final int anInt3722;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Lclient!eg;")
	private final SeqType seqType;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public ProjAnim(@OriginalArg(0) int spotAnimId, @OriginalArg(1) int level, @OriginalArg(2) int xFine, @OriginalArg(3) int zFine, @OriginalArg(4) int y, @OriginalArg(5) int startLoop, @OriginalArg(6) int endLoop, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int targetEntity, @OriginalArg(10) int arg10) {
		this.zFine = zFine;
		this.y = y;
		this.aBoolean268 = false;
		this.xFine = xFine;
		this.startLoop = startLoop;
		this.anInt3714 = arg8;
		this.level = level;
		this.endLoop = endLoop;
		this.targetEntity = targetEntity;
		this.spotAnimId = spotAnimId;
		this.anInt3727 = arg7;
		this.anInt3722 = arg10;
		@Pc(61) int seqId = SpotAnimTypeList.get(this.spotAnimId).seqId;
		if (seqId == -1) {
			this.seqType = null;
		} else {
			this.seqType = SeqTypeList.get(seqId);
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
		if (this.seqType == null) {
			return;
		}
		this.anInt3725 += arg0;
		while (true) {
			do {
				do {
					if (this.seqType.anIntArray94[this.anInt3708] >= this.anInt3725) {
						return;
					}
					this.anInt3725 -= this.seqType.anIntArray94[this.anInt3708];
					this.anInt3708++;
					if (this.seqType.frames.length <= this.anInt3708) {
						this.anInt3708 -= this.seqType.anInt1242;
						if (this.anInt3708 < 0 || this.anInt3708 >= this.seqType.frames.length) {
							this.anInt3708 = 0;
						}
					}
					this.anInt3718 = this.anInt3708 + 1;
				} while (this.anInt3718 < this.seqType.frames.length);
				this.anInt3718 -= this.seqType.anInt1242;
			} while (this.anInt3718 >= 0 && this.seqType.frames.length > this.anInt3718);
			this.anInt3718 = -1;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		@Pc(7) Model model = this.getModel();
		if (model != null) {
			this.method3106(model);
			model.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.particleSystem);
			this.minY = model.getMinY();
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIIII)V")
	public final void setTarget(@OriginalArg(1) int targetY, @OriginalArg(2) int targetXFine, @OriginalArg(3) int loop, @OriginalArg(4) int targetZFine) {
		if (!this.aBoolean268) {
			@Pc(14) double dx = (double) (targetXFine - this.xFine);
			@Pc(21) double dz = (double) (targetZFine - this.zFine);
			@Pc(30) double distance = Math.sqrt(dx * dx + dz * dz);
			this.aDouble5 = this.y;
			this.aDouble8 = (double) this.xFine + (double) this.anInt3714 * dx / distance;
			this.aDouble10 = (double) this.zFine + (double) this.anInt3714 * dz / distance;
		}
		@Pc(69) double remainingLoops = (double) (this.endLoop + 1 - loop);
		this.aDouble4 = ((double) targetXFine - this.aDouble8) / remainingLoops;
		this.aDouble6 = ((double) targetZFine - this.aDouble10) / remainingLoops;
		this.aDouble9 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble6 * this.aDouble6);
		if (this.anInt3727 == -1) {
			this.aDouble7 = ((double) targetY - this.aDouble5) / remainingLoops;
		} else {
			if (!this.aBoolean268) {
				this.aDouble7 = -this.aDouble9 * Math.tan((double) this.anInt3727 * 0.02454369D);
			}
			this.aDouble3 = ((double) targetY - this.aDouble7 * remainingLoops - this.aDouble5) * 2.0D / (remainingLoops * remainingLoops);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!vg;)V")
	private void method3106(@OriginalArg(1) Model model) {
		if (GlRenderer.enabled) {
			@Pc(4) GlModel glModel = (GlModel) model;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (glModel.particleEmitters != null || glModel.particleEffectors != null)) {
				this.particleSystem = new ParticleSystem(client.loop, 1, 1);
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(glModel.particleEmitters, glModel.particleEffectors, false, glModel.vertexX, glModel.vertexY, glModel.vertexZ);
			}
		} else {
			@Pc(51) SoftwareModel softwareModel = (SoftwareModel) model;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (softwareModel.particleEmitters != null || softwareModel.particleEffectors != null)) {
				this.particleSystem = new ParticleSystem(client.loop, 1, 1);
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(softwareModel.particleEmitters, softwareModel.particleEffectors, false, softwareModel.vertexX, softwareModel.vertexY, softwareModel.vertexZ);
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
			@Pc(11) Model model = this.getModel();
			if (model == null) {
				return;
			}
			this.method3106(model);
		}
		if (this.particleSystem != null) {
			this.particleSystem.method2949(arg0, arg1, arg3, arg2, arg4);
		}
	}
}

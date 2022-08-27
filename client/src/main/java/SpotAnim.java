import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class SpotAnim extends Entity {

	@OriginalMember(owner = "client!o", name = "E", descriptor = "Lclient!ne;")
	private ParticleSystem particleSystem;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "I")
	private final int anInt3659 = -1;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "I")
	private int minY = -32768;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!o", name = "B", descriptor = "I")
	private int anInt3661 = 0;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "Z")
	public boolean stopped = false;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "I")
	private int soundIndex = 0;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "I")
	public final int level;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "I")
	private final int id;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "I")
	public final int xFine;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "I")
	public final int zFine;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "I")
	public final int y;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "I")
	public final int startLoop;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "Lclient!eg;")
	private SeqType seqType;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIII)V")
	public SpotAnim(@OriginalArg(0) int id, @OriginalArg(1) int level, @OriginalArg(2) int xFine, @OriginalArg(3) int zFine, @OriginalArg(4) int y, @OriginalArg(5) int delay, @OriginalArg(6) int loop) {
		this.level = level;
		this.id = id;
		this.xFine = xFine;
		this.zFine = zFine;
		this.y = y;
		this.startLoop = delay + loop;
		@Pc(45) int seqId = SpotAnimTypeList.get(this.id).seqId;
		if (seqId == -1) {
			this.stopped = true;
		} else {
			this.stopped = false;
			this.seqType = SeqTypeList.get(seqId);
		}
		if (this.startLoop == loop) {
			SoundPlayer.playSeqSound(this.seqType, this.xFine, this.zFine, this.soundIndex, false);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!vg;)V")
	private void method3057(@OriginalArg(1) Model model) {
		if (GlRenderer.enabled) {
			@Pc(55) GlModel glModel = (GlModel) model;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (glModel.particleEmitters != null || glModel.particleEffectors != null)) {
				this.particleSystem = new ParticleSystem(client.loop, 1, 1);
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(glModel.particleEmitters, glModel.particleEffectors, false, glModel.vertexX, glModel.vertexY, glModel.vertexZ);
			}
		} else {
			@Pc(8) SoftwareModel softwareModel = (SoftwareModel) model;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (softwareModel.particleEmitters != null || softwareModel.particleEffectors != null)) {
				this.particleSystem = new ParticleSystem(client.loop, 1, 1);
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(softwareModel.particleEmitters, softwareModel.particleEffectors, false, softwareModel.vertexX, softwareModel.vertexY, softwareModel.vertexZ);
			}
		}
		this.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
	public void method3058(@OriginalArg(0) int arg0) {
		if (this.stopped) {
			return;
		}
		this.anInt3661 += arg0;
		while (this.seqType.anIntArray94[this.soundIndex] < this.anInt3661) {
			this.anInt3661 -= this.seqType.anIntArray94[this.soundIndex];
			this.soundIndex++;
			if (this.soundIndex >= this.seqType.frames.length) {
				this.stopped = true;
				break;
			}
		}
		if (!this.stopped) {
			SoundPlayer.playSeqSound(this.seqType, this.xFine, this.zFine, this.soundIndex, false);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Lclient!vg;")
	private Model getModel() {
		@Pc(17) SpotAnimType type = SpotAnimTypeList.get(this.id);
		@Pc(27) Model model;
		if (this.stopped) {
			model = type.method2569(-1, 0, -1);
		} else {
			model = type.method2569(this.anInt3659, this.anInt3661, this.soundIndex);
		}
		return model == null ? null : model;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean264) {
			@Pc(10) Model model = this.getModel();
			if (model == null) {
				return;
			}
			this.method3057(model);
		}
		if (this.particleSystem != null) {
			this.particleSystem.method2949(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		@Pc(7) Model model = this.getModel();
		if (model != null) {
			this.method3057(model);
			model.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.particleSystem);
			this.minY = model.getMinY();
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "()I")
	@Override
	public int getMinY() {
		return this.minY;
	}
}

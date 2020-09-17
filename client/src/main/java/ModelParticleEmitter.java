import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class ModelParticleEmitter {

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
	public final int anInt4864;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
	public final int anInt4868;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
	public final int anInt4869;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Lclient!ik;")
	public final ParticleEmitterType type;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIII)V")
	public ModelParticleEmitter(@OriginalArg(0) int id, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) ParticleEmitterType type = ParticleEmitterTypeList.get(id);
		this.anInt4864 = arg3;
		this.anInt4868 = arg2;
		this.anInt4869 = arg1;
		if (GlRenderer.enabled || type.softwareId == -1) {
			this.type = type;
		} else {
			this.type = ParticleEmitterTypeList.get(type.softwareId);
		}
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!ik;III)V")
	public ModelParticleEmitter(@OriginalArg(0) ParticleEmitterType type, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4869 = arg1;
		this.type = type;
		this.anInt4864 = arg3;
		this.anInt4868 = arg2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class ModelParticleEffector {

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!dc;")
	public final ParticleEffectorType type;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public final int anInt5232;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V")
	public ModelParticleEffector(@OriginalArg(0) int id, @OriginalArg(1) int arg1) {
		this.type = ParticleEffectorTypeList.get(id);
		this.anInt5232 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!dc;I)V")
	public ModelParticleEffector(@OriginalArg(0) ParticleEffectorType type, @OriginalArg(1) int arg1) {
		this.anInt5232 = arg1;
		this.type = type;
	}
}

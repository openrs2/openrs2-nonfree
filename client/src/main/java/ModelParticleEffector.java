import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class ModelParticleEffector {

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!dc;")
	public final ParticleEffectorType type;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public final int vertex;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V")
	public ModelParticleEffector(@OriginalArg(0) int id, @OriginalArg(1) int vertex) {
		this.type = ParticleEffectorTypeList.get(id);
		this.vertex = vertex;
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!dc;I)V")
	public ModelParticleEffector(@OriginalArg(0) ParticleEffectorType type, @OriginalArg(1) int vertex) {
		this.vertex = vertex;
		this.type = type;
	}
}

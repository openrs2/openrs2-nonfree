import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class ModelParticleEmitter {

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
	public final int triangleVertexC;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
	public final int triangleVertexB;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
	public final int triangleVertexA;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Lclient!ik;")
	public final ParticleEmitterType type;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIII)V")
	public ModelParticleEmitter(@OriginalArg(0) int id, @OriginalArg(1) int triangleVertexA, @OriginalArg(2) int triangleVertexB, @OriginalArg(3) int triangleVertexC) {
		@Pc(5) ParticleEmitterType type = ParticleEmitterTypeList.get(id);
		this.triangleVertexC = triangleVertexC;
		this.triangleVertexB = triangleVertexB;
		this.triangleVertexA = triangleVertexA;
		if (GlRenderer.enabled || type.softwareId == -1) {
			this.type = type;
		} else {
			this.type = ParticleEmitterTypeList.get(type.softwareId);
		}
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!ik;III)V")
	public ModelParticleEmitter(@OriginalArg(0) ParticleEmitterType type, @OriginalArg(1) int triangleVertexA, @OriginalArg(2) int triangleVertexB, @OriginalArg(3) int triangleVertexC) {
		this.triangleVertexA = triangleVertexA;
		this.type = type;
		this.triangleVertexC = triangleVertexC;
		this.triangleVertexB = triangleVertexB;
	}
}

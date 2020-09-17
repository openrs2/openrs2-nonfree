import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public final class ParticleEffectorNode extends SecondaryNode {

	@OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
	public int anInt6084;

	@OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
	public int anInt6085;

	@OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
	public int anInt6087;

	@OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
	public int anInt6088;

	@OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
	public int anInt6089;

	@OriginalMember(owner = "client!wn", name = "I", descriptor = "I")
	public int anInt6090;

	@OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
	public int anInt6091;

	@OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
	public int anInt6095;

	@OriginalMember(owner = "client!wn", name = "D", descriptor = "Lclient!u;")
	public final ParticleEffector effector;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!u;Lclient!ne;)V")
	public ParticleEffectorNode(@OriginalArg(0) ParticleEffector effector, @OriginalArg(1) ParticleSystem system) {
		this.effector = effector;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)V")
	public final void method4827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt6090 = arg0;
		this.anInt6084 = arg2;
		this.anInt6085 = arg1;
	}
}

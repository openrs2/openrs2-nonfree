import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class SecondaryParticleNode extends ParticleNode {

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!r;")
	public SecondaryParticleNode secondaryNext;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "Lclient!r;")
	public SecondaryParticleNode secondaryPrev;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public final void unlinkSecondary() {
		if (this.secondaryPrev != null) {
			this.secondaryPrev.secondaryNext = this.secondaryNext;
			this.secondaryNext.secondaryPrev = this.secondaryPrev;
			this.secondaryNext = null;
			this.secondaryPrev = null;
		}
	}
}

import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class SecondarySceneGraphNode extends SceneGraphNode {

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!r;")
	public SecondarySceneGraphNode secondaryNext;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "Lclient!r;")
	public SecondarySceneGraphNode secondaryPrev;

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

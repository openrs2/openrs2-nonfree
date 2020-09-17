import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class SceneGraphNode {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!mb;")
	public SceneGraphNode next;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Lclient!mb;")
	public SceneGraphNode prev;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public final void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.prev = null;
			this.next = null;
		}
	}
}

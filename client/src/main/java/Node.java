import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class Node {

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "Lclient!ni;")
	public Node prev;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "Lclient!ni;")
	public Node next;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "J")
	public long key;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)Z")
	public final boolean isLinked() {
		return this.prev != null;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V")
	public final void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.prev = null;
			this.next = null;
		}
	}
}

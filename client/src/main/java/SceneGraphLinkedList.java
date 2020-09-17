import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class SceneGraphLinkedList {

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!mb;")
	private SceneGraphNode cursor;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!mb;")
	public final SceneGraphNode sentinel = new SceneGraphNode();

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public SceneGraphLinkedList() {
		this.sentinel.prev = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lclient!mb;")
	public final SceneGraphNode next() {
		@Pc(6) SceneGraphNode node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next;
			return node;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)I")
	public final int size() {
		@Pc(15) int size = 0;
		@Pc(19) SceneGraphNode node = this.sentinel.next;
		while (this.sentinel != node) {
			node = node.next;
			size++;
		}
		return size;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)Lclient!mb;")
	public final SceneGraphNode head() {
		@Pc(9) SceneGraphNode node = this.sentinel.next;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next;
			return node;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!mb;)V")
	public final void addTail(@OriginalArg(1) SceneGraphNode node) {
		if (node.prev != null) {
			node.unlink();
		}
		node.next = this.sentinel;
		node.prev = this.sentinel.prev;
		node.prev.next = node;
		node.next.prev = node;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!f")
public final class LinkedList {

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "Lunpackclass!w;")
	private Node cursor;

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "Lunpackclass!w;")
	private final Node sentinel = new Node();

	@OriginalMember(owner = "unpackclass!f", name = "<init>", descriptor = "()V")
	public LinkedList() {
		this.sentinel.next = this.sentinel;
		this.sentinel.prev = this.sentinel;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "(Lunpackclass!w;)V")
	public final void add(@OriginalArg(0) Node node) {
		if (node.prev != null) {
			node.unlink();
		}
		node.prev = this.sentinel.prev;
		node.next = this.sentinel;
		node.prev.next = node;
		node.next.prev = node;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "()Lunpackclass!w;")
	public final Node head() {
		@Pc(3) Node head = this.sentinel.next;
		if (head == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = head.next;
			return head;
		}
	}

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "()Lunpackclass!w;")
	public final Node next() {
		@Pc(2) Node next = this.cursor;
		if (next == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = next.next;
			return next;
		}
	}
}

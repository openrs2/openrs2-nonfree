import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class LinkedList {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ni;BLclient!ni;)V")
	public static void insertBefore(@OriginalArg(2) Node node, @OriginalArg(0) Node position) {
		if (node.prev != null) {
			node.unlink();
		}
		node.next = position;
		node.prev = position.prev;
		node.prev.next = node;
		node.next.prev = node;
	}

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "Lclient!ni;")
	private Node cursor;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "Lclient!ni;")
	public final Node sentinel = new Node();

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public LinkedList() {
		this.sentinel.next = this.sentinel;
		this.sentinel.prev = this.sentinel;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public final void clear() {
		while (true) {
			@Pc(9) Node node = this.sentinel.next;
			if (this.sentinel == node) {
				this.cursor = null;
				return;
			}
			node.unlink();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!ni;B)V")
	public final void addHead(@OriginalArg(0) Node node) {
		if (node.prev != null) {
			node.unlink();
		}
		node.prev = this.sentinel;
		node.next = this.sentinel.next;
		node.prev.next = node;
		node.next.prev = node;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)Lclient!ni;")
	public final Node removeHead() {
		@Pc(7) Node node = this.sentinel.next;
		if (node == this.sentinel) {
			return null;
		} else {
			node.unlink();
			return node;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)Z")
	public final boolean isEmpty() {
		return this.sentinel.next == this.sentinel;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)Lclient!ni;")
	public final Node head() {
		@Pc(7) Node node = this.sentinel.next;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next;
			return node;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!ni;)V")
	public final void addTail(@OriginalArg(1) Node node) {
		if (node.prev != null) {
			node.unlink();
		}
		node.prev = this.sentinel.prev;
		node.next = this.sentinel;
		node.prev.next = node;
		node.next.prev = node;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Lclient!ni;")
	public final Node tail() {
		@Pc(7) Node node = this.sentinel.prev;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.prev;
			return node;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)Lclient!ni;")
	public final Node prev() {
		@Pc(8) Node node = this.cursor;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.prev;
			return node;
		}
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)Lclient!ni;")
	public final Node next() {
		@Pc(13) Node node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next;
			return node;
		}
	}
}

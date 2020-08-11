import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class SecondaryLinkedList {

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Lclient!lh;")
	private SecondaryNode cursor;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Lclient!lh;")
	public final SecondaryNode sentinel = new SecondaryNode();

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public SecondaryLinkedList() {
		this.sentinel.secondaryPrev = this.sentinel;
		this.sentinel.secondaryNext = this.sentinel;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Lclient!lh;")
	public final SecondaryNode head() {
		@Pc(9) SecondaryNode node = this.sentinel.secondaryNext;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!lh;)V")
	public final void addTail(@OriginalArg(1) SecondaryNode node) {
		if (node.secondaryPrev != null) {
			node.unlinkSecondary();
		}
		node.secondaryNext = this.sentinel;
		node.secondaryPrev = this.sentinel.secondaryPrev;
		node.secondaryPrev.secondaryNext = node;
		node.secondaryNext.secondaryPrev = node;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I")
	public final int size() {
		@Pc(3) int size = 0;
		@Pc(11) SecondaryNode node = this.sentinel.secondaryNext;
		while (this.sentinel != node) {
			node = node.secondaryNext;
			size++;
		}
		return size;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)Lclient!lh;")
	public final SecondaryNode removeHead() {
		@Pc(12) SecondaryNode node = this.sentinel.secondaryNext;
		if (this.sentinel == node) {
			return null;
		} else {
			node.unlinkSecondary();
			return node;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public final void clear() {
		while (true) {
			@Pc(5) SecondaryNode node = this.sentinel.secondaryNext;
			if (node == this.sentinel) {
				this.cursor = null;
				return;
			}
			node.unlinkSecondary();
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Lclient!lh;")
	public final SecondaryNode next() {
		@Pc(2) SecondaryNode node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}
}

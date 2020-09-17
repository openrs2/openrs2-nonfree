import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class SecondarySceneGraphLinkedList {

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!r;")
	private SecondarySceneGraphNode cursor;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!r;")
	public final SecondarySceneGraphNode sentinel = new SecondarySceneGraphNode();

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public SecondarySceneGraphLinkedList() {
		this.sentinel.secondaryNext = this.sentinel;
		this.sentinel.secondaryPrev = this.sentinel;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public final void clear() {
		while (true) {
			@Pc(5) SecondarySceneGraphNode node = this.sentinel.secondaryNext;
			if (node == this.sentinel) {
				this.cursor = null;
				return;
			}
			node.unlinkSecondary();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)Lclient!r;")
	public final SecondarySceneGraphNode head() {
		@Pc(18) SecondarySceneGraphNode node = this.sentinel.secondaryNext;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!r;)V")
	public final void addTail(@OriginalArg(1) SecondarySceneGraphNode node) {
		if (node.secondaryPrev != null) {
			node.unlinkSecondary();
		}
		node.secondaryNext = this.sentinel;
		node.secondaryPrev = this.sentinel.secondaryPrev;
		node.secondaryPrev.secondaryNext = node;
		node.secondaryNext.secondaryPrev = node;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)Lclient!r;")
	public final SecondarySceneGraphNode next() {
		@Pc(2) SecondarySceneGraphNode node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}
}

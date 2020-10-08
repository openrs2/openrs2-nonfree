import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class SecondaryLinkedListIterator {

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Lclient!uk;")
	private SecondaryLinkedList list;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Lclient!lh;")
	private SecondaryNode cursor;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lclient!lh;")
	public final SecondaryNode next() {
		@Pc(6) SecondaryNode node = this.cursor;
		if (node == this.list.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)Lclient!lh;")
	public final SecondaryNode head() {
		@Pc(8) SecondaryNode node = this.list.sentinel.secondaryNext;
		if (this.list.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!uk;)V")
	public final void init(@OriginalArg(1) SecondaryLinkedList list) {
		this.list = list;
	}
}

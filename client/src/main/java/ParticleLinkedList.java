import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class ParticleLinkedList {

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!mb;")
	private ParticleNode cursor;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!mb;")
	public final ParticleNode sentinel = new ParticleNode();

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public ParticleLinkedList() {
		this.sentinel.prev = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lclient!mb;")
	public ParticleNode next() {
		@Pc(6) ParticleNode node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next;
			return node;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)I")
	public int size() {
		@Pc(15) int size = 0;
		@Pc(19) ParticleNode node = this.sentinel.next;
		while (this.sentinel != node) {
			node = node.next;
			size++;
		}
		return size;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)Lclient!mb;")
	public ParticleNode head() {
		@Pc(9) ParticleNode node = this.sentinel.next;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next;
			return node;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!mb;)V")
	public void addTail(@OriginalArg(1) ParticleNode node) {
		if (node.prev != null) {
			node.unlink();
		}
		node.next = this.sentinel;
		node.prev = this.sentinel.prev;
		node.prev.next = node;
		node.next.prev = node;
	}
}

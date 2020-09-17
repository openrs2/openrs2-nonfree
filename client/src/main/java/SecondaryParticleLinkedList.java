import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class SecondaryParticleLinkedList {

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!r;")
	private SecondaryParticleNode cursor;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!r;")
	public final SecondaryParticleNode sentinel = new SecondaryParticleNode();

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public SecondaryParticleLinkedList() {
		this.sentinel.secondaryNext = this.sentinel;
		this.sentinel.secondaryPrev = this.sentinel;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public final void clear() {
		while (true) {
			@Pc(5) SecondaryParticleNode node = this.sentinel.secondaryNext;
			if (node == this.sentinel) {
				this.cursor = null;
				return;
			}
			node.unlinkSecondary();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)Lclient!r;")
	public final SecondaryParticleNode head() {
		@Pc(18) SecondaryParticleNode node = this.sentinel.secondaryNext;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!r;)V")
	public final void addTail(@OriginalArg(1) SecondaryParticleNode node) {
		if (node.secondaryPrev != null) {
			node.unlinkSecondary();
		}
		node.secondaryNext = this.sentinel;
		node.secondaryPrev = this.sentinel.secondaryPrev;
		node.secondaryPrev.secondaryNext = node;
		node.secondaryNext.secondaryPrev = node;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)Lclient!r;")
	public final SecondaryParticleNode next() {
		@Pc(2) SecondaryParticleNode node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}
}

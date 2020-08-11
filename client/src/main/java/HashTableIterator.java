import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class HashTableIterator {

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!ni;")
	private Node cursor;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	private int bucket = 0;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!ic;")
	private final HashTable table;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ic;)V")
	public HashTableIterator(@OriginalArg(0) HashTable table) {
		this.table = table;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lclient!ni;")
	public final Node head() {
		this.bucket = 0;
		return this.next();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Lclient!ni;")
	public final Node next() {
		if (this.bucket > 0 && this.table.buckets[this.bucket - 1] != this.cursor) {
			@Pc(25) Node node = this.cursor;
			this.cursor = node.next;
			return node;
		}
		@Pc(50) Node node;
		do {
			if (this.bucket >= this.table.bucketCount) {
				return null;
			}
			node = this.table.buckets[this.bucket++].next;
		} while (this.table.buckets[this.bucket - 1] == node);
		this.cursor = node.next;
		return node;
	}
}

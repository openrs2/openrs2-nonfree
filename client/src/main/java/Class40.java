import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class40 {

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!lh;")
	private SecondaryNode aClass4_Sub3_18 = new SecondaryNode();

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Lclient!uk;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!ic;")
	private final HashTable table;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V")
	public Class40(@OriginalArg(0) int capacity) {
		this.available = capacity;
		@Pc(16) int bucketCount;
		for (bucketCount = 1; bucketCount + bucketCount < capacity; bucketCount += bucketCount) {
		}
		this.capacity = capacity;
		this.table = new HashTable(bucketCount);
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Lclient!ni;")
	public final Node head() {
		return this.table.head();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(JILclient!lh;)V")
	public final void put(@OriginalArg(0) long key, @OriginalArg(2) SecondaryNode value) {
		if (this.available == 0) {
			@Pc(15) SecondaryNode first = this.queue.removeHead();
			first.unlink();
			first.unlinkSecondary();
			if (this.aClass4_Sub3_18 == first) {
				@Pc(31) SecondaryNode second = this.queue.removeHead();
				second.unlink();
				second.unlinkSecondary();
			}
		} else {
			this.available--;
		}
		this.table.put(key, value);
		this.queue.addTail(value);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IJ)Lclient!lh;")
	public final SecondaryNode get(@OriginalArg(1) long key) {
		@Pc(18) SecondaryNode value = (SecondaryNode) this.table.get(key);
		if (value != null) {
			this.queue.addTail(value);
		}
		return value;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Lclient!ni;")
	public final Node next() {
		return this.table.next();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public final void clear() {
		this.queue.clear();
		this.table.clear();
		this.aClass4_Sub3_18 = new SecondaryNode();
		this.available = this.capacity;
	}
}

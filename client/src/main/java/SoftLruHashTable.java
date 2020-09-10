import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class SoftLruHashTable {

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!uk;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!ic;")
	private final HashTable table;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	public SoftLruHashTable(@OriginalArg(0) int capacity) {
		this.capacity = capacity;
		this.available = capacity;
		@Pc(14) int bucketCount;
		for (bucketCount = 1; bucketCount + bucketCount < capacity; bucketCount += bucketCount) {
		}
		this.table = new HashTable(bucketCount);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	public final int size() {
		@Pc(7) int size = 0;
		for (@Pc(18) ReferenceNode node = (ReferenceNode) this.queue.head(); node != null; node = (ReferenceNode) this.queue.next()) {
			if (!node.isSoft()) {
				size++;
			}
		}
		return size;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public final void put(@OriginalArg(2) long key, @OriginalArg(1) Object value) {
		this.remove(key);
		if (this.available == 0) {
			@Pc(31) ReferenceNode node = (ReferenceNode) this.queue.removeHead();
			node.unlink();
			node.unlinkSecondary();
		} else {
			this.available--;
		}
		@Pc(42) HardReferenceNode node = new HardReferenceNode(value);
		this.table.put(key, node);
		this.queue.addTail(node);
		node.secondaryKey = 0L;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public final void clear() {
		this.queue.clear();
		this.table.clear();
		this.available = this.capacity;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)V")
	public final void remove(@OriginalArg(0) long key) {
		@Pc(10) ReferenceNode node = (ReferenceNode) this.table.get(key);
		if (node != null) {
			node.unlink();
			node.unlinkSecondary();
			this.available++;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
	public final void removeSoft() {
		for (@Pc(16) ReferenceNode node = (ReferenceNode) this.queue.head(); node != null; node = (ReferenceNode) this.queue.next()) {
			if (node.isSoft()) {
				node.unlink();
				node.unlinkSecondary();
				this.available++;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
	public final void clean(@OriginalArg(1) int maxAge) {
		if (ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY == null) {
			return;
		}
		for (@Pc(22) ReferenceNode node = (ReferenceNode) this.queue.head(); node != null; node = (ReferenceNode) this.queue.next()) {
			if (node.isSoft()) {
				if (node.get() == null) {
					node.unlink();
					node.unlinkSecondary();
					this.available++;
				}
			} else if (++node.secondaryKey > (long) maxAge) {
				@Pc(45) ReferenceNode softNode = ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY.create(node);
				this.table.put(node.key, softNode);
				SecondaryLinkedList.insertAfter(softNode, node);
				node.unlink();
				node.unlinkSecondary();
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public final Object get(@OriginalArg(0) long key) {
		@Pc(10) ReferenceNode node = (ReferenceNode) this.table.get(key);
		if (node == null) {
			return null;
		}
		@Pc(26) Object value = node.get();
		if (value == null) {
			node.unlink();
			node.unlinkSecondary();
			this.available++;
			return null;
		}
		if (node.isSoft()) {
			@Pc(61) HardReferenceNode hardNode = new HardReferenceNode(value);
			this.table.put(node.key, hardNode);
			this.queue.addTail(hardNode);
			hardNode.secondaryKey = 0L;
			node.unlink();
			node.unlinkSecondary();
		} else {
			this.queue.addTail(node);
			node.secondaryKey = 0L;
		}
		return value;
	}
}

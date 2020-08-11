import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class HashTable {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!ni;")
	private Node searchCursor;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "J")
	private long searchKey;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!ni;")
	private Node iteratorCursor;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
	private int iteratorBucket = 0;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "[Lclient!ni;")
	public final Node[] buckets;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	public final int bucketCount;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
	public HashTable(@OriginalArg(0) int bucketCount) {
		this.buckets = new Node[bucketCount];
		this.bucketCount = bucketCount;
		for (@Pc(13) int i = 0; i < bucketCount; i++) {
			@Pc(29) Node sentinel = this.buckets[i] = new Node();
			sentinel.prev = sentinel;
			sentinel.next = sentinel;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
	public final int getBucketCount() {
		return this.bucketCount;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ni;IJ)V")
	public final void put(@OriginalArg(2) long key, @OriginalArg(0) Node value) {
		if (value.prev != null) {
			value.unlink();
		}
		@Pc(27) Node sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
		value.key = key;
		value.next = sentinel;
		value.prev = sentinel.prev;
		value.prev.next = value;
		value.next.prev = value;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I")
	public final int size() {
		@Pc(7) int size = 0;
		for (@Pc(9) int i = 0; i < this.bucketCount; i++) {
			@Pc(22) Node sentinel = this.buckets[i];
			for (@Pc(25) Node node = sentinel.next; node != sentinel; node = node.next) {
				size++;
			}
		}
		return size;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Lclient!ni;")
	public final Node head() {
		this.iteratorBucket = 0;
		return this.next();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Lclient!ni;")
	public final Node next() {
		if (this.iteratorBucket > 0 && this.buckets[this.iteratorBucket - 1] != this.iteratorCursor) {
			@Pc(25) Node node = this.iteratorCursor;
			this.iteratorCursor = node.next;
			return node;
		}
		@Pc(58) Node node;
		do {
			if (this.iteratorBucket >= this.bucketCount) {
				return null;
			}
			node = this.buckets[this.iteratorBucket++].next;
		} while (node == this.buckets[this.iteratorBucket - 1]);
		this.iteratorCursor = node.next;
		return node;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)Lclient!ni;")
	public final Node get(@OriginalArg(0) long key) {
		this.searchKey = key;
		@Pc(28) Node sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
		for (this.searchCursor = sentinel.next; this.searchCursor != sentinel; this.searchCursor = this.searchCursor.next) {
			if (this.searchCursor.key == key) {
				@Pc(50) Node value = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return value;
			}
		}
		this.searchCursor = null;
		return null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[Lclient!ni;)I")
	public final int toArray(@OriginalArg(1) Node[] array) {
		@Pc(7) int size = 0;
		for (@Pc(9) int i = 0; i < this.bucketCount; i++) {
			@Pc(22) Node sentinel = this.buckets[i];
			for (@Pc(25) Node node = sentinel.next; node != sentinel; node = node.next) {
				array[size++] = node;
			}
		}
		return size;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)Lclient!ni;")
	public final Node nextWithKey() {
		if (this.searchCursor == null) {
			return null;
		}
		@Pc(23) Node sentinel = this.buckets[(int) ((long) (this.bucketCount - 1) & this.searchKey)];
		while (sentinel != this.searchCursor) {
			if (this.searchKey == this.searchCursor.key) {
				@Pc(38) Node node = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return node;
			}
			this.searchCursor = this.searchCursor.next;
		}
		this.searchCursor = null;
		return null;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
	public final void clear() {
		for (@Pc(7) int i = 0; i < this.bucketCount; i++) {
			@Pc(24) Node sentinel = this.buckets[i];
			while (true) {
				@Pc(27) Node node = sentinel.next;
				if (node == sentinel) {
					break;
				}
				node.unlink();
			}
		}
		this.iteratorCursor = null;
		this.searchCursor = null;
	}
}

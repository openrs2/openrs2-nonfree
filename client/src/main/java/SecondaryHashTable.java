import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class SecondaryHashTable {

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "J")
	private long searchKey;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "Lclient!lh;")
	private SecondaryNode searchCursor;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	private final int bucketCount;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "[Lclient!lh;")
	private final SecondaryNode[] buckets;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
	public SecondaryHashTable(@OriginalArg(0) int bucketCount) {
		this.bucketCount = bucketCount;
		this.buckets = new SecondaryNode[bucketCount];
		for (@Pc(10) int i = 0; i < bucketCount; i++) {
			@Pc(22) SecondaryNode sentinel = this.buckets[i] = new SecondaryNode();
			sentinel.secondaryNext = sentinel;
			sentinel.secondaryPrev = sentinel;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Lclient!lh;")
	public final SecondaryNode nextWithKey() {
		if (this.searchCursor == null) {
			return null;
		}
		@Pc(30) SecondaryNode sentinel = this.buckets[(int) ((long) (this.bucketCount - 1) & this.searchKey)];
		while (sentinel != this.searchCursor) {
			if (this.searchKey == this.searchCursor.secondaryKey) {
				@Pc(45) SecondaryNode node = this.searchCursor;
				this.searchCursor = this.searchCursor.secondaryNext;
				return node;
			}
			this.searchCursor = this.searchCursor.secondaryNext;
		}
		this.searchCursor = null;
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BJ)Lclient!lh;")
	public final SecondaryNode get(@OriginalArg(1) long key) {
		this.searchKey = key;
		@Pc(26) SecondaryNode sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
		for (this.searchCursor = sentinel.secondaryNext; this.searchCursor != sentinel; this.searchCursor = this.searchCursor.secondaryNext) {
			if (key == this.searchCursor.secondaryKey) {
				@Pc(44) SecondaryNode node = this.searchCursor;
				this.searchCursor = this.searchCursor.secondaryNext;
				return node;
			}
		}
		this.searchCursor = null;
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(JLclient!lh;I)V")
	public final void put(@OriginalArg(0) long key, @OriginalArg(1) SecondaryNode value) {
		if (value.secondaryPrev != null) {
			value.unlinkSecondary();
		}
		@Pc(32) SecondaryNode sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
		value.secondaryPrev = sentinel.secondaryPrev;
		value.secondaryKey = key;
		value.secondaryNext = sentinel;
		value.secondaryPrev.secondaryNext = value;
		value.secondaryNext.secondaryPrev = value;
	}
}

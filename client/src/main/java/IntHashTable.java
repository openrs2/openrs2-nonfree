import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class IntHashTable {

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "[I")
	private final int[] buckets;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([I)V")
	public IntHashTable(@OriginalArg(0) int[] keys) {
		@Pc(5) int bucketCount;
		for (bucketCount = 1; bucketCount <= keys.length + (keys.length >> 1); bucketCount <<= 1) {
		}
		this.buckets = new int[bucketCount + bucketCount];
		for (@Pc(32) int i = 0; i < bucketCount + bucketCount; i++) {
			this.buckets[i] = -1;
		}
		@Pc(47) int value = 0;
		while (value < keys.length) {
			@Pc(63) int hash;
			for (hash = keys[value] & bucketCount - 1; this.buckets[hash + hash + 1] != -1; hash = bucketCount - 1 & hash + 1) {
			}
			this.buckets[hash + hash] = keys[value];
			this.buckets[hash + hash + 1] = value++;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I")
	public final int get(@OriginalArg(1) int key) {
		@Pc(11) int mask = (this.buckets.length >> 1) - 1;
		@Pc(15) int hash = key & mask;
		while (true) {
			@Pc(29) int value = this.buckets[hash + hash + 1];
			if (value == -1) {
				return -1;
			}
			if (this.buckets[hash + hash] == key) {
				return value;
			}
			hash = hash + 1 & mask;
		}
	}
}

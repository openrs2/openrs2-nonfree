import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!i")
public final class IntHashTable {

	@OriginalMember(owner = "unpackclass!i", name = "a", descriptor = "[I")
	private final int[] buckets;

	@OriginalMember(owner = "unpackclass!i", name = "<init>", descriptor = "([I)V")
	public IntHashTable(@OriginalArg(0) int[] keys) {
		@Pc(5) int bucketCount;
		for (bucketCount = 1; bucketCount <= keys.length + (keys.length >> 1); bucketCount <<= 1) {
		}
		this.buckets = new int[bucketCount + bucketCount];
		for (@Pc(28) int i = 0; i < bucketCount + bucketCount; i++) {
			this.buckets[i] = -1;
		}
		@Pc(43) int value = 0;
		while (value < keys.length) {
			@Pc(53) int hash;
			for (hash = keys[value] & bucketCount - 1; this.buckets[hash + hash + 1] != -1; hash = hash + 1 & bucketCount - 1) {
			}
			this.buckets[hash + hash] = keys[value];
			this.buckets[hash + hash + 1] = value++;
		}
	}
}

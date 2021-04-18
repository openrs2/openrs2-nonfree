import java.util.Random;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class RandomUtils {
	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int nextInt(@OriginalArg(0) Random random, @OriginalArg(1) int bound) {
		if (bound <= 0) {
			throw new IllegalArgumentException();
		} else if (IntUtils.isPowerOfTwo(bound)) {
			return (int) (((long) random.nextInt() & 0xFFFFFFFFL) * (long) bound >> 32);
		} else {
			@Pc(45) int local45 = Integer.MIN_VALUE - (int) (4294967296L % (long) bound);
			@Pc(48) int local48;
			do {
				local48 = random.nextInt();
			} while (local48 >= local45);
			return method3538(local48, bound);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
	private static int method3538(@OriginalArg(0) int arg0, @OriginalArg(2) int bound) {
		@Pc(7) int local7 = arg0 >> 31 & bound - 1;
		return local7 + (arg0 + (arg0 >>> 31)) % bound;
	}
}

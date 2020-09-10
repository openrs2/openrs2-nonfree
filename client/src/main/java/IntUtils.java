import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class IntUtils {
	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)I")
	public static int clp2(@OriginalArg(0) int v) {
		v--;
		v |= v >>> 1;
		v |= v >>> 2;
		v |= v >>> 4;
		v |= v >>> 8;
		v |= v >>> 16;
		return v + 1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)I")
	public static int flp2(@OriginalArg(0) int v) {
		@Pc(7) int v2 = v >>> 1;
		v2 |= v2 >>> 1;
		v2 |= v2 >>> 2;
		v2 |= v2 >>> 4;
		v2 |= v2 >>> 8;
		v2 |= v2 >>> 16;
		return v & ~v2;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)Z")
	public static boolean isPowerOfTwo(@OriginalArg(1) int v) {
		return v == (v & -v);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
	public static int bitCount(@OriginalArg(0) int v) {
		@Pc(1) int bits = 0;
		if (v < 0 || v >= 65536) {
			v >>>= 16;
			bits += 16;
		}
		if (v >= 256) {
			v >>>= 8;
			bits += 8;
		}
		if (v >= 16) {
			v >>>= 4;
			bits += 4;
		}
		if (v >= 4) {
			bits += 2;
			v >>>= 2;
		}
		if (v >= 1) {
			bits++;
			v >>>= 1;
		}
		return bits + v;
	}
}

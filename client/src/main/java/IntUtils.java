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

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(II)I")
	public static int bitCountFast(@OriginalArg(1) int v) {
		v = (v >>> 1 & 0x55555555) + (v & 0x55555555);
		v = (v & 0x33333333) + (v >>> 2 & 0xB3333333);
		v = (v >>> 4) + v & 0xF0F0F0F;
		v += v >>> 8;
		v += v >>> 16;
		return v & 0xFF;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)I")
	public static int signum(@OriginalArg(1) int v) {
		if (v > 0) {
			return 1;
		} else if (v < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIZ)Ljava/lang/String;")
	public static String toString(@OriginalArg(1) int v) {
		return v < 0 ? Integer.toString(v) : toStringInternal(v);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	private static String toStringInternal(@OriginalArg(0) int v) {
		if (v < 0) {
			return Integer.toString(v, 10);
		}
		@Pc(46) int len = 2;
		for (@Pc(50) int temp = v / 10; temp != 0; temp /= 10) {
			len++;
		}
		@Pc(65) char[] chars = new char[len];
		chars[0] = '+';
		for (@Pc(73) int i = len - 1; i > 0; i--) {
			@Pc(78) int prevValue = v;
			v /= 10;
			@Pc(89) int digit = prevValue - v * 10;
			if (digit >= 10) {
				chars[i] = (char) (digit + 87);
			} else {
				chars[i] = (char) (digit + 48);
			}
		}
		return new String(chars);
	}
}

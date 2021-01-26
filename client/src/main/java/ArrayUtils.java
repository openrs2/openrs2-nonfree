import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ArrayUtils {
	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BI[BII)V")
	public static void copy(@OriginalArg(0) byte[] src, @OriginalArg(1) int srcOff, @OriginalArg(2) byte[] dest, @OriginalArg(3) int destOff, @OriginalArg(4) int len) {
		if (src == dest) {
			if (srcOff == destOff) {
				return;
			}
			if (destOff > srcOff && destOff < srcOff + len) {
				len--;
				@Pc(19) int srcOff2 = srcOff + len;
				@Pc(23) int destOff2 = destOff + len;
				len = srcOff2 - len;
				len += 7;
				while (srcOff2 >= len) {
					@Pc(34) int destOff3 = destOff2 - 1;
					@Pc(37) int srcOff3 = srcOff2 - 1;
					dest[destOff2] = src[srcOff2];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					destOff2 = destOff3 - 1;
					srcOff2 = srcOff3 - 1;
					dest[destOff3] = src[srcOff3];
				}
				len -= 7;
				while (srcOff2 >= len) {
					dest[destOff2--] = src[srcOff2--];
				}
				return;
			}
		}
		len += srcOff;
		len -= 7;
		while (srcOff < len) {
			@Pc(121) int destOff2 = destOff + 1;
			@Pc(124) int srcOff2 = srcOff + 1;
			dest[destOff] = src[srcOff];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			destOff = destOff2 + 1;
			srcOff = srcOff2 + 1;
			dest[destOff2] = src[srcOff2];
		}
		len += 7;
		while (srcOff < len) {
			dest[destOff++] = src[srcOff++];
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([SI[SII)V")
	public static void copy(@OriginalArg(0) short[] src, @OriginalArg(1) int srcOff, @OriginalArg(2) short[] dest, @OriginalArg(3) int destOff, @OriginalArg(4) int len) {
		if (src == dest) {
			if (srcOff == destOff) {
				return;
			}
			if (destOff > srcOff && destOff < srcOff + len) {
				len--;
				@Pc(19) int srcOff2 = srcOff + len;
				@Pc(23) int destOff2 = destOff + len;
				len = srcOff2 - len;
				len += 7;
				while (srcOff2 >= len) {
					@Pc(34) int destOff3 = destOff2 - 1;
					@Pc(37) int srcOff3 = srcOff2 - 1;
					dest[destOff2] = src[srcOff2];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					destOff2 = destOff3 - 1;
					srcOff2 = srcOff3 - 1;
					dest[destOff3] = src[srcOff3];
				}
				len -= 7;
				while (srcOff2 >= len) {
					dest[destOff2--] = src[srcOff2--];
				}
				return;
			}
		}
		len += srcOff;
		len -= 7;
		while (srcOff < len) {
			@Pc(121) int destOff2 = destOff + 1;
			@Pc(124) int srcOff2 = srcOff + 1;
			dest[destOff] = src[srcOff];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			destOff = destOff2 + 1;
			srcOff = srcOff2 + 1;
			dest[destOff2] = src[srcOff2];
		}
		len += 7;
		while (srcOff < len) {
			dest[destOff++] = src[srcOff++];
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([II[III)V")
	public static void copy(@OriginalArg(0) int[] src, @OriginalArg(1) int srcOff, @OriginalArg(2) int[] dest, @OriginalArg(3) int destOff, @OriginalArg(4) int len) {
		if (src == dest) {
			if (srcOff == destOff) {
				return;
			}
			if (destOff > srcOff && destOff < srcOff + len) {
				len--;
				@Pc(19) int srcOff2 = srcOff + len;
				@Pc(23) int destOff2 = destOff + len;
				len = srcOff2 - len;
				len += 7;
				while (srcOff2 >= len) {
					@Pc(34) int destOff3 = destOff2 - 1;
					@Pc(37) int srcOff3 = srcOff2 - 1;
					dest[destOff2] = src[srcOff2];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					destOff2 = destOff3 - 1;
					srcOff2 = srcOff3 - 1;
					dest[destOff3] = src[srcOff3];
				}
				len -= 7;
				while (srcOff2 >= len) {
					dest[destOff2--] = src[srcOff2--];
				}
				return;
			}
		}
		len += srcOff;
		len -= 7;
		while (srcOff < len) {
			@Pc(121) int destOff2 = destOff + 1;
			@Pc(124) int srcOff2 = srcOff + 1;
			dest[destOff] = src[srcOff];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			destOff = destOff2 + 1;
			srcOff = srcOff2 + 1;
			dest[destOff2] = src[srcOff2];
		}
		len += 7;
		while (srcOff < len) {
			dest[destOff++] = src[srcOff++];
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([JI[JII)V")
	public static void copy(@OriginalArg(0) long[] src, @OriginalArg(1) int srcOff, @OriginalArg(2) long[] dest, @OriginalArg(3) int destOff, @OriginalArg(4) int len) {
		if (src == dest) {
			if (srcOff == destOff) {
				return;
			}
			if (destOff > srcOff && destOff < srcOff + len) {
				len--;
				@Pc(19) int srcOff2 = srcOff + len;
				@Pc(23) int destOff2 = destOff + len;
				len = srcOff2 - len;
				len += 3;
				while (srcOff2 >= len) {
					@Pc(34) int destOff3 = destOff2 - 1;
					@Pc(37) int srcOff3 = srcOff2 - 1;
					dest[destOff2] = src[srcOff2];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					destOff2 = destOff3 - 1;
					srcOff2 = srcOff3 - 1;
					dest[destOff3] = src[srcOff3];
				}
				len -= 3;
				while (srcOff2 >= len) {
					dest[destOff2--] = src[srcOff2--];
				}
				return;
			}
		}
		len += srcOff;
		len -= 3;
		while (srcOff < len) {
			@Pc(89) int destOff2 = destOff + 1;
			@Pc(92) int srcOff2 = srcOff + 1;
			dest[destOff] = src[srcOff];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			destOff = destOff2 + 1;
			srcOff = srcOff2 + 1;
			dest[destOff2] = src[srcOff2];
		}
		len += 3;
		while (srcOff < len) {
			dest[destOff++] = src[srcOff++];
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([FI[FII)V")
	public static void copy(@OriginalArg(0) float[] src, @OriginalArg(1) int srcOff, @OriginalArg(2) float[] dest, @OriginalArg(3) int destOff, @OriginalArg(4) int len) {
		if (src == dest) {
			return;
		}
		len -= 7;
		while (srcOff < len) {
			@Pc(121) int destOff2 = destOff + 1;
			@Pc(124) int srcOff2 = srcOff + 1;
			dest[destOff] = src[srcOff];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			destOff = destOff2 + 1;
			srcOff = srcOff2 + 1;
			dest[destOff2] = src[srcOff2];
		}
		len += 7;
		while (srcOff < len) {
			dest[destOff++] = src[srcOff++];
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V")
	public static void copy(@OriginalArg(0) Object[] src, @OriginalArg(1) int srcOff, @OriginalArg(2) Object[] dest, @OriginalArg(3) int destOff, @OriginalArg(4) int len) {
		if (src == dest) {
			if (srcOff == destOff) {
				return;
			}
			if (destOff > srcOff && destOff < srcOff + len) {
				len--;
				@Pc(19) int srcOff2 = srcOff + len;
				@Pc(23) int destOff2 = destOff + len;
				len = srcOff2 - len;
				len += 7;
				while (srcOff2 >= len) {
					@Pc(34) int destOff3 = destOff2 - 1;
					@Pc(37) int srcOff3 = srcOff2 - 1;
					dest[destOff2] = src[srcOff2];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					dest[destOff3--] = src[srcOff3--];
					destOff2 = destOff3 - 1;
					srcOff2 = srcOff3 - 1;
					dest[destOff3] = src[srcOff3];
				}
				len -= 7;
				while (srcOff2 >= len) {
					dest[destOff2--] = src[srcOff2--];
				}
				return;
			}
		}
		len += srcOff;
		len -= 7;
		while (srcOff < len) {
			@Pc(121) int destOff2 = destOff + 1;
			@Pc(124) int srcOff2 = srcOff + 1;
			dest[destOff] = src[srcOff];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			dest[destOff2++] = src[srcOff2++];
			destOff = destOff2 + 1;
			srcOff = srcOff2 + 1;
			dest[destOff2] = src[srcOff2];
		}
		len += 7;
		while (srcOff < len) {
			dest[destOff++] = src[srcOff++];
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([III)V")
	public static void clear(@OriginalArg(0) int[] dest, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		len = len - 7;
		while (off < len) {
			@Pc(11) int off2 = off + 1;
			dest[off] = 0;
			dest[off2++] = 0;
			dest[off2++] = 0;
			dest[off2++] = 0;
			dest[off2++] = 0;
			dest[off2++] = 0;
			dest[off2++] = 0;
			off = off2 + 1;
			dest[off2] = 0;
		}
		len += 7;
		while (off < len) {
			dest[off++] = 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([SIIS)V")
	public static void fill(@OriginalArg(0) short[] dest, @OriginalArg(1) int off, @OriginalArg(2) int len, @OriginalArg(3) short value) {
		len = len - 7;
		while (off < len) {
			@Pc(11) int off2 = off + 1;
			dest[off] = value;
			dest[off2++] = value;
			dest[off2++] = value;
			dest[off2++] = value;
			dest[off2++] = value;
			dest[off2++] = value;
			dest[off2++] = value;
			off = off2 + 1;
			dest[off2] = value;
		}
		len += 7;
		while (off < len) {
			dest[off++] = value;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([IIII)V")
	public static void fill(@OriginalArg(0) int[] dest, @OriginalArg(1) int off, @OriginalArg(2) int len, @OriginalArg(3) int value) {
		len = off + len - 7;
		while (off < len) {
			@Pc(11) int off2 = off + 1;
			dest[off] = value;
			dest[off2++] = value;
			dest[off2++] = value;
			dest[off2++] = value;
			dest[off2++] = value;
			dest[off2++] = value;
			dest[off2++] = value;
			off = off2 + 1;
			dest[off2] = value;
		}
		len += 7;
		while (off < len) {
			dest[off++] = value;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([IB[Ljava/lang/Object;)V")
	public static void sort(@OriginalArg(0) int[] keys, @OriginalArg(2) Object[] values) {
		sort(keys, values, 0, keys.length - 1);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[Ljava/lang/Object;II[I)V")
	public static void sort(@OriginalArg(4) int[] keys, @OriginalArg(1) Object[] values, @OriginalArg(2) int lo, @OriginalArg(0) int hi) {
		if (hi <= lo) {
			return;
		}
		@Pc(10) int mid = (lo + hi) / 2;
		@Pc(12) int i = lo;
		@Pc(16) int pivotKey = keys[mid];
		keys[mid] = keys[hi];
		keys[hi] = pivotKey;
		@Pc(30) Object pivotValue = values[mid];
		values[mid] = values[hi];
		values[hi] = pivotValue;
		for (@Pc(42) int j = lo; j < hi; j++) {
			if (pivotKey + (j & 0x1) > keys[j]) {
				@Pc(68) int key = keys[j];
				keys[j] = keys[i];
				keys[i] = key;
				@Pc(82) Object value = values[j];
				values[j] = values[i];
				values[i++] = value;
			}
		}
		keys[hi] = keys[i];
		keys[i] = pivotKey;
		values[hi] = values[i];
		values[i] = pivotValue;
		sort(keys, values, lo, i - 1);
		sort(keys, values, i + 1, hi);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void sort(@OriginalArg(2) String[] keys, @OriginalArg(0) short[] values) {
		sort(keys, values, 0, keys.length - 1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([Ljava/lang/String;ZI[SI)V")
	public static void sort(@OriginalArg(0) String[] keys, @OriginalArg(3) short[] values, @OriginalArg(4) int lo, @OriginalArg(2) int hi) {
		if (hi <= lo) {
			return;
		}
		@Pc(26) int mid = (lo + hi) / 2;
		@Pc(28) int i = lo;
		@Pc(32) String pivotKey = keys[mid];
		keys[mid] = keys[hi];
		keys[hi] = pivotKey;
		@Pc(46) short pivotValue = values[mid];
		values[mid] = values[hi];
		values[hi] = pivotValue;
		for (@Pc(58) int j = lo; j < hi; j++) {
			if (pivotKey == null || keys[j] != null && keys[j].compareTo(pivotKey) < (j & 0x1)) {
				@Pc(88) String key = keys[j];
				keys[j] = keys[i];
				keys[i] = key;
				@Pc(102) short value = values[j];
				values[j] = values[i];
				values[i++] = value;
			}
		}
		keys[hi] = keys[i];
		keys[i] = pivotKey;
		values[hi] = values[i];
		values[i] = pivotValue;
		sort(keys, values, lo, i - 1);
		sort(keys, values, i + 1, hi);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([SB)[S")
	public static short[] copyOfNullable(@OriginalArg(0) short[] array) {
		if (array == null) {
			return null;
		} else {
			@Pc(12) short[] copy = new short[array.length];
			ArrayUtils.copy(array, 0, copy, 0, array.length);
			return copy;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([SI)[S")
	public static short[] copyOf(@OriginalArg(0) short[] array, @OriginalArg(1) int len) {
		@Pc(2) short[] copy = new short[len];
		ArrayUtils.copy(array, 0, copy, 0, len);
		return copy;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([II)[I")
	public static int[] copyOfNullable(@OriginalArg(0) int[] array) {
		if (array == null) {
			return null;
		} else {
			@Pc(18) int[] copy = new int[array.length];
			ArrayUtils.copy(array, 0, copy, 0, array.length);
			return copy;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([FI)[F")
	public static float[] copyOf(@OriginalArg(0) float[] array, @OriginalArg(1) int len) {
		@Pc(2) float[] copy = new float[len];
		ArrayUtils.copy(array, 0, copy, 0, len);
		return copy;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!l")
public final class ArrayUtils {

	@OriginalMember(owner = "unpackclass!l", name = "a", descriptor = "([BI[BII)V")
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
					@Pc(32) int destOff3 = destOff2 - 1;
					@Pc(35) int srcOff3 = srcOff2 - 1;
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
			@Pc(119) int destOff2 = destOff + 1;
			@Pc(122) int srcOff2 = srcOff + 1;
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
}

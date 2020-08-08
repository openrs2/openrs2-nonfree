import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class169 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
	public static final int[] anIntArray591 = new int[256];

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	public int anInt5275;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public int anInt5276;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	public int anInt5277;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	public int anInt5279;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local6;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 1;
				}
			}
			anIntArray591[local6] = local11;
		}
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!i")
public final class Class205 {

	@OriginalMember(owner = "unpackclass!i", name = "a", descriptor = "[I")
	private final int[] anIntArray695;

	@OriginalMember(owner = "unpackclass!i", name = "<init>", descriptor = "([I)V")
	public Class205(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 1) {
		}
		this.anIntArray695 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray695[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (local43 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = arg0[local43] & local5 - 1; this.anIntArray695[local53 + local53 + 1] != -1; local53 = local53 + 1 & local5 - 1) {
			}
			this.anIntArray695[local53 + local53] = arg0[local43];
			this.anIntArray695[local53 + local53 + 1] = local43++;
		}
	}
}

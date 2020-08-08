import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class65 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
	public static final int[] anIntArray165 = new int[99];

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(15) int local15 = local6 + 1;
			@Pc(28) int local28 = (int) (Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D + (double) local15);
			local4 += local28;
			anIntArray165[local6] = local4 / 4;
		}
	}
}

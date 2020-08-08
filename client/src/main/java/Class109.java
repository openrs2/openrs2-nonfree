import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class109 {

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "[I")
	private static final int[] anIntArray296 = new int[512];

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "[I")
	public static final int[] anIntArray298 = new int[2048];

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "[I")
	public static final int[] anIntArray300 = new int[2048];

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "[I")
	public static final int[] anIntArray299 = new int[2048];

	static {
		for (@Pc(33) int local33 = 1; local33 < 512; local33++) {
			anIntArray296[local33] = 32768 / local33;
		}
		for (@Pc(46) int local46 = 1; local46 < 2048; local46++) {
			anIntArray300[local46] = 65536 / local46;
		}
		for (@Pc(59) int local59 = 0; local59 < 2048; local59++) {
			anIntArray299[local59] = (int) (Math.sin((double) local59 * 0.0030679615D) * 65536.0D);
			anIntArray298[local59] = (int) (Math.cos((double) local59 * 0.0030679615D) * 65536.0D);
		}
	}
}

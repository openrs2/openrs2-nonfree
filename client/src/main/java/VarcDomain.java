import dev.openrs2.deob.annotation.OriginalMember;

public final class VarcDomain {
	@OriginalMember(owner = "client!qj", name = "ib", descriptor = "[I")
	public static final int[] varcs = new int[2000];

	@OriginalMember(owner = "client!in", name = "p", descriptor = "[I")
	public static final int[] updatedVarcs = new int[32];

	@OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
	public static int updatedVarcsWriterIndex = 0;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] varcstrs = new String[1000];

	@OriginalMember(owner = "client!in", name = "A", descriptor = "[I")
	public static final int[] updatedVarcstrs = new int[32];

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	public static int updatedVarcstrsWriterIndex = 0;
}

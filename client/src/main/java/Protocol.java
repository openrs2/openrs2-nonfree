import dev.openrs2.deob.annotation.OriginalMember;

public final class Protocol {
	@OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
	public static final int[] removedIds = new int[1000];

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
	public static int removed = 0;
}

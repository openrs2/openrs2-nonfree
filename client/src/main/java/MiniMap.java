import org.openrs2.deob.annotation.OriginalMember;

public final class MiniMap {
	@OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
	public static int state = 0;

	@OriginalMember(owner = "client!rg", name = "ab", descriptor = "I")
	public static int flagX = 0;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int flagY = 0;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "B")
	public static byte sequenceNumber = 0;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "Z")
	public static boolean aBoolean147 = true;
}

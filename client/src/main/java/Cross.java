import org.openrs2.deob.annotation.OriginalMember;

public final class Cross {
	@OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
	public static int type = 0;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	public static int y = 0;

	@OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
	public static int x = 0;

	@OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
	public static int milliseconds = 0;
}

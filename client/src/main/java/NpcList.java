import dev.openrs2.deob.annotation.OriginalMember;

public final class NpcList {
	@OriginalMember(owner = "client!hk", name = "hb", descriptor = "[Lclient!p;")
	public static final Npc[] npcs = new Npc[32768];

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "[I")
	public static final int[] ids = new int[1024];

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public static int size = 0;
}

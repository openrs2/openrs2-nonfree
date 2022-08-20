import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class NpcList {
	@OriginalMember(owner = "client!hk", name = "hb", descriptor = "[Lclient!p;")
	public static final Npc[] npcs = new Npc[32768];

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "[I")
	public static final int[] ids = new int[1024];

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void loop() {
		for (@Pc(11) int i = 0; i < size; i++) {
			@Pc(18) int id = ids[i];
			@Pc(22) Npc npc = npcs[id];
			if (npc != null) {
				PathingEntity.loop(npc, npc.type.size);
			}
		}
	}
}

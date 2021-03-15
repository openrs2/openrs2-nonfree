import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class OverheadChat {
	@OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
	public static final int[] COLORS = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	public static final int CAPACITY = 50;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] messages = new String[CAPACITY];

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "[I")
	public static final int[] loops = new int[CAPACITY];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "[I")
	public static final int[] effects = new int[CAPACITY];

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "[I")
	public static final int[] colors = new int[CAPACITY];

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "[I")
	public static final int[] anIntArray569 = new int[CAPACITY];

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
	public static final int[] anIntArray565 = new int[CAPACITY];

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "[I")
	public static final int[] anIntArray563 = new int[CAPACITY];

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "[I")
	public static final int[] anIntArray566 = new int[CAPACITY];

	@OriginalMember(owner = "client!no", name = "Y", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(B)V")
	public static void loop() {
		for (@Pc(7) int i = -1; i < PlayerList.size; i++) {
			@Pc(19) int id;
			if (i == -1) {
				id = 2047;
			} else {
				id = PlayerList.ids[i];
			}
			@Pc(29) Player player = PlayerList.players[id];
			if (player != null && player.chatLoops > 0) {
				player.chatLoops--;
				if (player.chatLoops == 0) {
					player.chatMessage = null;
				}
			}
		}
		for (@Pc(57) int i = 0; i < NpcList.size; i++) {
			@Pc(64) int id = NpcList.ids[i];
			@Pc(68) Npc npc = NpcList.npcs[id];
			if (npc != null && npc.chatLoops > 0) {
				npc.chatLoops--;
				if (npc.chatLoops == 0) {
					npc.chatMessage = null;
				}
			}
		}
	}
}

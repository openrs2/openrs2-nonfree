import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class PlayerList {
	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[Lclient!f;")
	public static final Player[] players = new Player[2048];

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "[I")
	public static final int[] ids = new int[2048];

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "[Lclient!fd;")
	public static final Buffer[] appearanceCache = new Buffer[2048];

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!f;")
	public static Player self;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	public static int selfId = -1;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	public static void loop() {
		for (@Pc(7) int i = -1; i < size; i++) {
			@Pc(20) int id;
			if (i == -1) {
				id = 2047;
			} else {
				id = ids[i];
			}
			@Pc(30) Player player = players[id];
			if (player != null) {
				PathingEntity.loop(player, player.getSize());
			}
		}
	}
}

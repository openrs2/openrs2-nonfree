import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ClanChat {
	@OriginalMember(owner = "client!g", name = "I", descriptor = "Ljava/lang/String;")
	public static String name = null;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Ljava/lang/String;")
	public static String owner = null;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "B")
	public static byte rank;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "B")
	public static byte minKick;

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "[Lclient!l;")
	public static ClanMember[] members;

	@OriginalMember(owner = "client!ln", name = "Y", descriptor = "I")
	public static int size;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJ)V")
	public static void join(@OriginalArg(1) long name) {
		if (name != 0L) {
			Protocol.outboundBuffer.writeOpcode(218);
			Protocol.outboundBuffer.writeLong(name);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void leave() {
		Protocol.outboundBuffer.writeOpcode(218);
		Protocol.outboundBuffer.writeLong(0L);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void kick(@OriginalArg(1) String username) {
		if (members == null) {
			return;
		}
		@Pc(16) int i = 0;
		@Pc(20) long encodedUsername = Base37.encode(username);
		if (encodedUsername == 0L) {
			return;
		}
		while (members.length > i && encodedUsername != members[i].key) {
			i++;
		}
		if (members.length > i && members[i] != null) {
			Protocol.outboundBuffer.writeOpcode(75);
			Protocol.outboundBuffer.writeLong(members[i].key);
		}
	}
}

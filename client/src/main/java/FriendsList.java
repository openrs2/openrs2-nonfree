import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class FriendsList {
	@OriginalMember(owner = "client!uj", name = "F", descriptor = "[J")
	public static final long[] encodedUsernames = new long[200];

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] usernames = new String[200];

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "[I")
	public static final int[] worlds = new int[200];

	@OriginalMember(owner = "client!kn", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] worldNames = new String[200];

	@OriginalMember(owner = "client!se", name = "ab", descriptor = "[I")
	public static final int[] ranks = new int[200];

	@OriginalMember(owner = "client!fj", name = "X", descriptor = "[Z")
	public static final boolean[] sameGame = new boolean[200];

	@OriginalMember(owner = "client!tm", name = "J", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public static int state = 0;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
	public static int transmitAt = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJ)V")
	public static void add(@OriginalArg(1) long encodedUsername) {
		if (encodedUsername == 0L) {
			return;
		}
		if (size >= 100 && !LoginManager.playerMember || size >= 200) {
			Chat.add(0, "", LocalisedText.FRIENDLISTFULL);
			return;
		}
		@Pc(35) String username = Base37.decodeTitleCase(encodedUsername);
		for (@Pc(37) int i = 0; i < size; i++) {
			if (encodedUsername == encodedUsernames[i]) {
				Chat.add(0, "", username + LocalisedText.FRIENDLISTDUPE);
				return;
			}
		}
		for (@Pc(69) int i = 0; i < IgnoreList.size; i++) {
			if (encodedUsername == IgnoreList.encodedUsernames[i]) {
				Chat.add(0, "", LocalisedText.REMOVEIGNORE1 + username + LocalisedText.REMOVEIGNORE2);
				return;
			}
		}
		if (username.equals(PlayerList.self.username)) {
			Chat.add(0, "", LocalisedText.FRIENDCANTADDSELF);
			return;
		}
		usernames[size] = username;
		encodedUsernames[size] = encodedUsername;
		worlds[size] = 0;
		worldNames[size] = "";
		ranks[size] = 0;
		sameGame[size] = false;
		size++;
		transmitAt = InterfaceList.transmitTimer;
		Protocol.outboundBuffer.writeOpcode(26);
		Protocol.outboundBuffer.writeLong(encodedUsername);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(JI)V")
	public static void remove(@OriginalArg(0) long encodedUsername) {
		if (encodedUsername == 0L) {
			return;
		}
		for (@Pc(13) int i = 0; i < size; i++) {
			if (encodedUsernames[i] == encodedUsername) {
				size--;
				for (@Pc(36) int j = i; j < size; j++) {
					usernames[j] = usernames[j + 1];
					worlds[j] = worlds[j + 1];
					worldNames[j] = worldNames[j + 1];
					encodedUsernames[j] = encodedUsernames[j + 1];
					ranks[j] = ranks[j + 1];
					sameGame[j] = sameGame[j + 1];
				}
				transmitAt = InterfaceList.transmitTimer;
				Protocol.outboundBuffer.writeOpcode(172);
				Protocol.outboundBuffer.writeLong(encodedUsername);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean contains(@OriginalArg(1) String username) {
		if (username == null) {
			return false;
		}
		for (@Pc(20) int i = 0; i < size; i++) {
			if (username.equalsIgnoreCase(usernames[i])) {
				return true;
			}
		}
		if (username.equalsIgnoreCase(PlayerList.self.username)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int indexOf(@OriginalArg(0) String username) {
		if (username == null) {
			return -1;
		}
		for (@Pc(12) int i = 0; i < size; i++) {
			if (username.equalsIgnoreCase(usernames[i])) {
				return i;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void setRank(@OriginalArg(2) String username, @OriginalArg(1) int rank) {
		Protocol.outboundBuffer.writeOpcode(215);
		Protocol.outboundBuffer.writeLong(Base37.encode(username));
		Protocol.outboundBuffer.writeByteC(rank);
	}
}

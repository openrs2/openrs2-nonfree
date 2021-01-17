import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class IgnoreList {
	@OriginalMember(owner = "client!jd", name = "h", descriptor = "[J")
	public static final long[] encodedUsernames = new long[100];

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] usernames = new String[100];

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "[Z")
	public static final boolean[] temporary = new boolean[100];

	@OriginalMember(owner = "client!rg", name = "mb", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZJB)V")
	public static void add(@OriginalArg(1) long encodedUsername, @OriginalArg(0) boolean temporary) {
		if (encodedUsername == 0L) {
			return;
		}
		if (size >= 100) {
			Chat.add(0, "", LocalisedText.IGNORELISTFULL);
			return;
		}
		@Pc(25) String username = Base37.decodeTitleCase(encodedUsername);
		for (@Pc(27) int i = 0; i < size; i++) {
			if (encodedUsernames[i] == encodedUsername) {
				Chat.add(0, "", username + LocalisedText.IGNORELISTDUPE);
				return;
			}
		}
		for (@Pc(59) int i = 0; i < FriendsList.size; i++) {
			if (FriendsList.encodedUsernames[i] == encodedUsername) {
				Chat.add(0, "", LocalisedText.REMOVEFRIEND1 + username + LocalisedText.REMOVEFRIEND2);
				return;
			}
		}
		if (username.equals(PlayerList.self.username)) {
			Chat.add(0, "", LocalisedText.IGNORECANTADDSELF);
			return;
		}
		encodedUsernames[size] = encodedUsername;
		usernames[size] = base37DecodeLowerCase(encodedUsername);
		IgnoreList.temporary[size++] = temporary;
		Static3.anInt2102 = Static6.anInt4979;
		Protocol.outboundBuffer.writeOpcode(197);
		Protocol.outboundBuffer.writeLong(encodedUsername);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)V")
	public static void remove(@OriginalArg(0) long encodedUsername) {
		if (encodedUsername == 0L) {
			return;
		}
		for (@Pc(18) int i = 0; i < size; i++) {
			if (encodedUsername == encodedUsernames[i]) {
				size--;
				for (@Pc(38) int j = i; j < size; j++) {
					encodedUsernames[j] = encodedUsernames[j + 1];
					usernames[j] = usernames[j + 1];
					temporary[j] = temporary[j + 1];
				}
				Static3.anInt2102 = Static6.anInt4979;
				Protocol.outboundBuffer.writeOpcode(142);
				Protocol.outboundBuffer.writeLong(encodedUsername);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean contains(@OriginalArg(1) String username) {
		if (username == null) {
			return false;
		}
		for (@Pc(12) int i = 0; i < size; i++) {
			if (username.equalsIgnoreCase(usernames[i])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String base37DecodeLowerCase(@OriginalArg(1) long username) {
		return Base37.decodeLowerCase(username);
	}
}

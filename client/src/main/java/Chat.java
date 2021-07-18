import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Chat {
	@OriginalMember(owner = "client!pn", name = "a", descriptor = "[I")
	public static final int[] types = new int[100];

	@OriginalMember(owner = "client!id", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] names = new String[100];

	@OriginalMember(owner = "client!t", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] messages = new String[100];

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] clans = new String[100];

	@OriginalMember(owner = "client!uc", name = "ab", descriptor = "[I")
	public static final int[] phraseIds = new int[100];

	@OriginalMember(owner = "client!la", name = "Z", descriptor = "[J")
	public static final long[] uids = new long[100];

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	public static int uidsWriterIndex = 0;

	@OriginalMember(owner = "client!un", name = "y", descriptor = "I")
	public static int publicFilter = 0;

	@OriginalMember(owner = "client!sh", name = "cb", descriptor = "I")
	public static int privateFilter = 0;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	public static int tradeFilter = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
	public static int transmitAt = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
	public static void add(@OriginalArg(3) int type, @OriginalArg(0) String name, @OriginalArg(4) String message, @OriginalArg(2) String clan, @OriginalArg(1) int phraseId) {
		for (@Pc(7) int i = 99; i > 0; i--) {
			types[i] = types[i - 1];
			names[i] = names[i - 1];
			messages[i] = messages[i - 1];
			clans[i] = clans[i - 1];
			phraseIds[i] = phraseIds[i - 1];
		}
		types[0] = type;
		names[0] = name;
		messages[0] = message;
		transmitAt = InterfaceList.transmitTimer;
		phraseIds[0] = phraseId;
		size++;
		clans[0] = clan;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void addClanMessage(@OriginalArg(1) String name, @OriginalArg(3) String message, @OriginalArg(2) String clan) {
		add(9, name, message, clan, -1);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V")
	public static void add(@OriginalArg(1) int type, @OriginalArg(0) String name, @OriginalArg(3) String message) {
		add(type, name, message, null, -1);
	}
}

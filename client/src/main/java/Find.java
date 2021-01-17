import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Find {
	@OriginalMember(owner = "client!fd", name = "ib", descriptor = "I")
	public static int size;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public static int index;

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "[S")
	public static short[] results;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void findObjs(@OriginalArg(0) String query, @OriginalArg(2) boolean stockMarketOnly) {
		query = query.toLowerCase();
		@Pc(10) int size = 0;
		@Pc(13) short[] results = new short[16];
		for (@Pc(21) int i = 0; i < ObjTypeList.capacity; i++) {
			@Pc(28) ObjType type = ObjTypeList.get(i);
			if ((!stockMarketOnly || type.stockMarket) && type.certificateTemplate == -1 && type.lentTemplate == -1 && type.dummyItem == 0 && type.name.toLowerCase().indexOf(query) != -1) {
				if (size >= 250) {
					Find.size = -1;
					Find.results = null;
					return;
				}
				if (results.length <= size) {
					@Pc(80) short[] newResults = new short[results.length * 2];
					for (@Pc(82) int j = 0; j < size; j++) {
						newResults[j] = results[j];
					}
					results = newResults;
				}
				results[size++] = (short) i;
			}
		}
		Find.size = size;
		index = 0;
		Find.results = results;
		@Pc(118) String[] names = new String[Find.size];
		for (@Pc(120) int i = 0; i < Find.size; i++) {
			names[i] = ObjTypeList.get(results[i]).name;
		}
		ArrayUtils.sort(names, Find.results);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void findQuickChatPhrases(@OriginalArg(1) String query, @OriginalArg(0) boolean global) {
		@Pc(8) short[] results = new short[16];
		query = query.toLowerCase();
		@Pc(17) int start = global ? 32768 : 0;
		@Pc(19) int size = 0;
		@Pc(27) int end = (global ? QuickChatPhraseTypeList.globalCapacity : QuickChatPhraseTypeList.capacity) + start;
		for (@Pc(29) int i = start; i < end; i++) {
			@Pc(40) QuickChatPhraseType type = QuickChatPhraseTypeList.get(i);
			if (type.searchable && type.getText().toLowerCase().indexOf(query) != -1) {
				if (size >= 50) {
					Find.size = -1;
					Find.results = null;
					return;
				}
				if (results.length <= size) {
					@Pc(82) short[] newResults = new short[results.length * 2];
					for (@Pc(84) int j = 0; j < size; j++) {
						newResults[j] = results[j];
					}
					results = newResults;
				}
				results[size++] = (short) i;
			}
		}
		index = 0;
		Find.size = size;
		@Pc(118) String[] names = new String[Find.size];
		Find.results = results;
		for (@Pc(122) int i = 0; i < Find.size; i++) {
			names[i] = QuickChatPhraseTypeList.get(results[i]).getText();
		}
		ArrayUtils.sort(names, Find.results);
	}
}

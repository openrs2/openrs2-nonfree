import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class QuickChatPhrase {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!fd;)Lclient!cd;")
	public static QuickChatPhrase decode(@OriginalArg(1) Buffer buffer) {
		@Pc(7) QuickChatPhrase phrase = new QuickChatPhrase();
		phrase.id = buffer.readUnsignedShort();
		phrase.type = QuickChatPhraseTypeList.get(phrase.id);
		return phrase;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!ij;")
	public QuickChatPhraseType type;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
	public int[] values;
}

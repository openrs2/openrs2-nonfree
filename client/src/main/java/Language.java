import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Language {
	@OriginalMember(owner = "client!fd", name = "wb", descriptor = "[Ljava/lang/String;")
	private static final String[] ISO_CODES = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int fromIsoCode(@OriginalArg(0) String code) {
		for (@Pc(11) int i = 0; i < ISO_CODES.length; i++) {
			if (ISO_CODES[i].equalsIgnoreCase(code)) {
				return i;
			}
		}
		return -1;
	}
}

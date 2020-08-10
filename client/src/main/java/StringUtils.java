import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class StringUtils {
	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int hashCode(@OriginalArg(0) String s) {
		@Pc(7) int hash = 0;
		@Pc(10) int len = s.length();
		for (@Pc(12) int i = 0; i < len; i++) {
			hash = (hash << 5) + Cp1252Charset.encodeChar(s.charAt(i)) - hash;
		}
		return hash;
	}
}

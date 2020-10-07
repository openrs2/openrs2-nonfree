import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Base37 {
	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "[C")
	private static final char[] BASE37_TABLE = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long encode(@OriginalArg(1) String in) {
		@Pc(3) long out = 0L;
		@Pc(15) int len = in.length();
		for (@Pc(17) int i = 0; i < len; i++) {
			out *= 37L;
			@Pc(32) char c = in.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				out += c + 1 - 65;
			} else if (c >= 'a' && c <= 'z') {
				out += c + 1 - 97;
			} else if (c >= '0' && c <= '9') {
				out += c + 27 - 48;
			}
			if (out >= 177917621779460413L) {
				break;
			}
		}
		while (out % 37L == 0L && out != 0L) {
			out /= 37L;
		}
		return out;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String decodeTitleCase(@OriginalArg(1) long in) {
		if (in <= 0L || in >= 6582952005840035281L) {
			return null;
		} else if (in % 37L == 0L) {
			return null;
		} else {
			@Pc(45) int len = 0;
			for (@Pc(47) long temp = in; temp != 0L; temp /= 37L) {
				len++;
			}
			@Pc(63) StringBuffer out = new StringBuffer(len);
			while (in != 0L) {
				@Pc(71) long prev = in;
				in /= 37L;
				@Pc(85) char c = BASE37_TABLE[(int) (prev - in * 37L)];
				if (c == '_') {
					c = '\u00A0';
					@Pc(95) int i = out.length() - 1;
					out.setCharAt(i, Character.toUpperCase(out.charAt(i)));
				}
				out.append(c);
			}
			out.reverse();
			out.setCharAt(0, Character.toUpperCase(out.charAt(0)));
			return out.toString();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String decodeLowerCase(@OriginalArg(1) long in) {
		if (in <= 0L || in >= 6582952005840035281L) {
			return null;
		} else if (in % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int len = 0;
			for (@Pc(33) long temp = in; temp != 0L; temp /= 37L) {
				len++;
			}
			@Pc(49) StringBuffer out = new StringBuffer(len);
			while (in != 0L) {
				@Pc(57) long prev = in;
				in /= 37L;
				out.append(BASE37_TABLE[(int) (prev - in * 37L)]);
			}
			return out.reverse().toString();
		}
	}
}

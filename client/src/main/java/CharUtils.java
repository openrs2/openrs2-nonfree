import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class CharUtils {
	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZC)Z")
	public static boolean isDigit(@OriginalArg(1) char c) {
		return c >= '0' && c <= '9';
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(CZ)Z")
	public static boolean isLetter(@OriginalArg(0) char c) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZC)Z")
	public static boolean isLetterOrDigit(@OriginalArg(1) char c) {
		return c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}
}

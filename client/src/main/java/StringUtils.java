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

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long longHashCode(@OriginalArg(1) String s) {
		@Pc(13) int len = s.length();
		@Pc(15) long hash = 0L;
		for (@Pc(17) int i = 0; i < len; i++) {
			hash = (long) s.charAt(i) + (hash << 5) - hash;
		}
		return hash;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int compare(@OriginalArg(3) String x, @OriginalArg(1) String y, @OriginalArg(2) int language) {
		@Pc(8) int xLen = x.length();
		@Pc(15) int xPos = 0;
		@Pc(18) int yLen = y.length();
		@Pc(20) char xSecondChar = 0;
		@Pc(22) int yPos = 0;
		@Pc(24) char ySecondChar = 0;
		while (xLen > xPos - xSecondChar || yLen > yPos - ySecondChar) {
			if (xLen <= xPos - xSecondChar) {
				return -1;
			}
			if (yLen <= yPos - ySecondChar) {
				return 1;
			}
			@Pc(73) char xChar;
			if (xSecondChar == '\u0000') {
				xChar = x.charAt(xPos++);
			} else {
				xChar = xSecondChar;
			}
			@Pc(83) char yChar;
			if (ySecondChar == '\u0000') {
				yChar = y.charAt(yPos++);
			} else {
				yChar = ySecondChar;
			}
			xSecondChar = getSecondChar(xChar);
			ySecondChar = getSecondChar(yChar);
			@Pc(105) char xFirstChar = getFirstChar(xChar, language);
			@Pc(110) char yFirstChar = getFirstChar(yChar, language);
			if (yFirstChar != xFirstChar && Character.toUpperCase(xFirstChar) != Character.toUpperCase(yFirstChar)) {
				@Pc(125) char xFirstCharLower = Character.toLowerCase(xFirstChar);
				@Pc(128) char yFirstCharLower = Character.toLowerCase(yFirstChar);
				if (yFirstCharLower != xFirstCharLower) {
					return getRank(xFirstCharLower, language) - getRank(yFirstCharLower, language);
				}
			}
		}
		@Pc(150) int len = Math.min(xLen, yLen);
		for (@Pc(152) int i = 0; i < len; i++) {
			@Pc(174) int xPos2;
			@Pc(167) int yPos2;
			if (language == 2) {
				yPos2 = yLen - i - 1;
				xPos2 = xLen - i - 1;
			} else {
				yPos2 = i;
				xPos2 = i;
			}
			@Pc(184) char xChar = x.charAt(xPos2);
			@Pc(188) char yChar = y.charAt(yPos2);
			if (xChar != yChar && Character.toUpperCase(xChar) != Character.toUpperCase(yChar)) {
				@Pc(203) char xCharLower = Character.toLowerCase(xChar);
				@Pc(206) char yCharLower = Character.toLowerCase(yChar);
				if (xCharLower != yCharLower) {
					return getRank(xCharLower, language) - getRank(yCharLower, language);
				}
			}
		}
		@Pc(233) int delta = xLen - yLen;
		if (delta != 0) {
			return delta;
		}
		for (@Pc(240) int i = 0; i < len; i++) {
			@Pc(247) char xChar = x.charAt(i);
			@Pc(251) char yChar = y.charAt(i);
			if (xChar != yChar) {
				return getRank(xChar, language) - getRank(yChar, language);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIC)C")
	private static char getFirstChar(@OriginalArg(2) char c, @OriginalArg(1) int language) {
		if (c >= 'À' && c <= 'ÿ') {
			if (c >= 'À' && c <= 'Æ') {
				return 'A';
			}
			if (c == 'Ç') {
				return 'C';
			}
			if (c >= 'È' && c <= 'Ë') {
				return 'E';
			}
			if (c >= 'Ì' && c <= 'Ï') {
				return 'I';
			}
			if (c == 'Ñ' && language != 0) {
				return 'N';
			}
			if (c >= 'Ò' && c <= 'Ö') {
				return 'O';
			}
			if (c >= 'Ù' && c <= 'Ü') {
				return 'U';
			}
			if (c == 'Ý') {
				return 'Y';
			}
			if (c == 'ß') {
				return 's';
			}
			if (c >= 'à' && c <= 'æ') {
				return 'a';
			}
			if (c == 'ç') {
				return 'c';
			}
			if (c >= 'è' && c <= 'ë') {
				return 'e';
			}
			if (c >= 'ì' && c <= 'ï') {
				return 'i';
			}
			if (c == 'ñ' && language != 0) {
				return 'n';
			}
			if (c >= 'ò' && c <= 'ö') {
				return 'o';
			}
			if (c >= 'ù' && c <= 'ü') {
				return 'u';
			}
			if (c == 'ý' || c == 'ÿ') {
				return 'y';
			}
		}
		if (c == 'Œ') {
			return 'O';
		} else if (c == 'œ') {
			return 'o';
		} else if (c == 'Ÿ') {
			return 'Y';
		} else {
			return c;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)C")
	private static char getSecondChar(@OriginalArg(0) char c) {
		if (c == 'Æ') {
			return 'E';
		} else if (c == 'æ') {
			return 'e';
		} else if (c == 'ß') {
			return 's';
		} else if (c == 'Œ') {
			return 'E';
		} else if (c == 'œ') {
			return 'e';
		} else {
			return '\u0000';
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIC)I")
	private static int getRank(@OriginalArg(2) char c, @OriginalArg(1) int language) {
		@Pc(12) int rank = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			c = Character.toLowerCase(c);
			rank = (c << 4) + 1;
		}
		if (c == 'ñ' && language == 0) {
			rank = 1762;
		}
		return rank;
	}
}

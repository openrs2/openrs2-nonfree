import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

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

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z[Ljava/lang/String;II)Ljava/lang/String;")
	public static String join(@OriginalArg(1) String[] array, @OriginalArg(2) int off, @OriginalArg(3) int len) {
		if (len == 0) {
			return "";
		} else if (len == 1) {
			@Pc(23) String s = array[off];
			return s == null ? "null" : s.toString();
		} else {
			@Pc(33) int bufferSize = 0;
			@Pc(37) int end = len + off;
			for (@Pc(39) int i = off; i < end; i++) {
				@Pc(46) String s = array[i];
				if (s == null) {
					bufferSize += 4;
				} else {
					bufferSize += s.length();
				}
			}
			@Pc(65) StringBuffer buffer = new StringBuffer(bufferSize);
			for (@Pc(67) int i = off; i < end; i++) {
				@Pc(78) String s = array[i];
				if (s == null) {
					buffer.append("null");
				} else {
					buffer.append(s);
				}
			}
			return buffer.toString();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] split(@OriginalArg(2) String s, @OriginalArg(1) char delim) {
		@Pc(10) int matches = countMatches(s, delim);
		@Pc(15) String[] parts = new String[matches + 1];
		@Pc(17) int part = 0;
		@Pc(19) int start = 0;
		for (@Pc(21) int i = 0; i < matches; i++) {
			@Pc(26) int end;
			for (end = start; delim != s.charAt(end); end++) {
			}
			parts[part++] = s.substring(start, end);
			start = end + 1;
		}
		parts[matches] = s.substring(start);
		return parts;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(CLjava/lang/String;Z)I")
	private static int countMatches(@OriginalArg(1) String s, @OriginalArg(0) char c) {
		@Pc(3) int count = 0;
		@Pc(10) int len = s.length();
		for (@Pc(16) int i = 0; i < len; i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZLjava/lang/String;)Z")
	private static boolean isIntInternal(@OriginalArg(3) String s) {
		@Pc(27) boolean negative = false;
		@Pc(29) boolean valid = false;
		@Pc(42) int len = s.length();
		@Pc(44) int value = 0;
		for (@Pc(46) int i = 0; i < len; i++) {
			@Pc(53) char c = s.charAt(i);
			if (i == 0) {
				if (c == '-') {
					negative = true;
					continue;
				}
				if (c == '+') {
					continue;
				}
			}
			@Pc(76) int digit;
			if (c >= '0' && c <= '9') {
				digit = c - '0';
			} else if (c >= 'A' && c <= 'Z') {
				digit = c - '7';
			} else if (c >= 'a' && c <= 'z') {
				digit = c - 'W';
			} else {
				return false;
			}
			if (digit >= 10) {
				return false;
			}
			if (negative) {
				digit = -digit;
			}
			@Pc(126) int nextValue = digit + value * 10;
			if (nextValue / 10 != value) {
				return false;
			}
			valid = true;
			value = nextValue;
		}
		return valid;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean isInt(@OriginalArg(0) String s) {
		return isIntInternal(s);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int parseInt(@OriginalArg(1) String s) {
		return parseInt(s, 10);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
	public static int parseInt(@OriginalArg(1) String s, @OriginalArg(0) int base) {
		@Pc(27) boolean negative = false;
		@Pc(29) boolean valid = false;
		@Pc(32) int len = s.length();
		@Pc(34) int value = 0;
		for (@Pc(42) int i = 0; i < len; i++) {
			@Pc(53) char c = s.charAt(i);
			if (i == 0) {
				if (c == '-') {
					negative = true;
					continue;
				}
				if (c == '+') {
					continue;
				}
			}
			@Pc(98) int digit;
			if (c >= '0' && c <= '9') {
				digit = c - '0';
			} else if (c >= 'A' && c <= 'Z') {
				digit = c - '7';
			} else if (c >= 'a' && c <= 'z') {
				digit = c - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (base <= digit) {
				throw new NumberFormatException();
			}
			if (negative) {
				digit = -digit;
			}
			@Pc(132) int nextValue = digit + base * value;
			if (nextValue / base != value) {
				throw new NumberFormatException();
			}
			valid = true;
			value = nextValue;
		}
		if (!valid) {
			throw new NumberFormatException();
		}
		return value;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String escape(@OriginalArg(0) String s) {
		@Pc(2) int len = s.length();
		@Pc(4) int escapedLen = 0;
		for (@Pc(6) int i = 0; i < len; i++) {
			@Pc(13) char c = s.charAt(i);
			if (c == '<' || c == '>') {
				escapedLen += 3;
			}
		}
		@Pc(29) StringBuffer buffer = new StringBuffer(len + escapedLen);
		for (@Pc(31) int i = 0; i < len; i++) {
			@Pc(38) char c = s.charAt(i);
			if (c == '<') {
				buffer.append("<lt>");
			} else if (c == '>') {
				buffer.append("<gt>");
			} else {
				buffer.append(c);
			}
		}
		return buffer.toString();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String formatChatMessage(@OriginalArg(1) String in) {
		@Pc(4) int len = in.length();
		@Pc(12) char[] out = new char[len];
		@Pc(18) byte mode = 2;
		for (@Pc(20) int i = 0; i < len; i++) {
			@Pc(27) char c = in.charAt(i);
			if (mode == 0) {
				c = Character.toLowerCase(c);
			} else if (mode == 2 || Character.isUpperCase(c)) {
				c = CharUtils.toTitleCase(c);
			}
			if (Character.isLetter(c)) {
				mode = 0;
			} else if (c == '.' || c == '?' || c == '!') {
				mode = 2;
			} else if (!Character.isSpaceChar(c)) {
				mode = 1;
			} else if (mode != 2) {
				mode = 1;
			}
			out[i] = c;
		}
		return new String(out);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int parseHexString(@OriginalArg(2) String s) {
		return parseInt(s, 16);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(CLjava/lang/StringBuffer;IZ)Ljava/lang/StringBuffer;")
	public static StringBuffer fillBuffer(@OriginalArg(1) StringBuffer buffer) {
		@Pc(14) int len = buffer.length();
		buffer.setLength(0);
		for (@Pc(19) int i = len; i < 0; i++) {
			buffer.setCharAt(i, ' ');
		}
		return buffer;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String ipToString(@OriginalArg(1) int ip) {
		return (ip >> 24 & 0xFF) + "." + (ip >> 16 & 0xFF) + "." + (ip >> 8 & 0xFF) + "." + (ip & 0xFF);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String countToString(@OriginalArg(1) int count) {
		@Pc(10) String s = Integer.toString(count);
		for (@Pc(19) int i = s.length() - 3; i > 0; i -= 3) {
			s = s.substring(0, i) + "," + s.substring(i);
		}
		if (s.length() > 9) {
			return " <col=00ff80>" + s.substring(0, s.length() - 8) + LocalisedText.MILLION + " (" + s + ")</col>";
		} else if (s.length() > 6) {
			return " <col=ffffff>" + s.substring(0, s.length() - 4) + LocalisedText.THOUSAND + " (" + s + ")</col>";
		} else {
			return " <col=ffff00>" + s + "</col>";
		}
	}
}

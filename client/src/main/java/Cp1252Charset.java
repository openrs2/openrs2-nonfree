import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Cp1252Charset {
	@OriginalMember(owner = "client!sl", name = "V", descriptor = "[C")
	private static final char[] CP1252_TABLE = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BC)B")
	public static byte encodeChar(@OriginalArg(1) char codepoint) {
		@Pc(36) byte b;
		if (codepoint > '\u0000' && codepoint < '\u0080' || codepoint >= '\u00A0' && codepoint <= '\u00FF') {
			b = (byte) codepoint;
		} else if (codepoint == '€') {
			b = -128;
		} else if (codepoint == '‚') {
			b = -126;
		} else if (codepoint == 'ƒ') {
			b = -125;
		} else if (codepoint == '„') {
			b = -124;
		} else if (codepoint == '…') {
			b = -123;
		} else if (codepoint == '†') {
			b = -122;
		} else if (codepoint == '‡') {
			b = -121;
		} else if (codepoint == 'ˆ') {
			b = -120;
		} else if (codepoint == '‰') {
			b = -119;
		} else if (codepoint == 'Š') {
			b = -118;
		} else if (codepoint == '‹') {
			b = -117;
		} else if (codepoint == 'Œ') {
			b = -116;
		} else if (codepoint == 'Ž') {
			b = -114;
		} else if (codepoint == '‘') {
			b = -111;
		} else if (codepoint == '’') {
			b = -110;
		} else if (codepoint == '“') {
			b = -109;
		} else if (codepoint == '”') {
			b = -108;
		} else if (codepoint == '•') {
			b = -107;
		} else if (codepoint == '–') {
			b = -106;
		} else if (codepoint == '—') {
			b = -105;
		} else if (codepoint == '˜') {
			b = -104;
		} else if (codepoint == '™') {
			b = -103;
		} else if (codepoint == 'š') {
			b = -102;
		} else if (codepoint == '›') {
			b = -101;
		} else if (codepoint == 'œ') {
			b = -100;
		} else if (codepoint == 'ž') {
			b = -98;
		} else if (codepoint == 'Ÿ') {
			b = -97;
		} else {
			b = 63;
		}
		return b;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([BLjava/lang/String;IIII)I")
	public static int encodeString(@OriginalArg(1) String src, @OriginalArg(2) int srcLen, @OriginalArg(0) byte[] dest, @OriginalArg(3) int destOff) {
		@Pc(6) int srcLen2 = srcLen;
		for (@Pc(8) int i = 0; i < srcLen2; i++) {
			@Pc(17) char c = src.charAt(i);
			if (c > '\u0000' && c < '\u0080' || c >= '\u00A0' && c <= '\u00FF') {
				dest[i + destOff] = (byte) c;
			} else if (c == '€') {
				dest[i + destOff] = -128;
			} else if (c == '‚') {
				dest[destOff + i] = -126;
			} else if (c == 'ƒ') {
				dest[destOff + i] = -125;
			} else if (c == '„') {
				dest[i + destOff] = -124;
			} else if (c == '…') {
				dest[i + destOff] = -123;
			} else if (c == '†') {
				dest[i + destOff] = -122;
			} else if (c == '‡') {
				dest[i + destOff] = -121;
			} else if (c == 'ˆ') {
				dest[i + destOff] = -120;
			} else if (c == '‰') {
				dest[destOff + i] = -119;
			} else if (c == 'Š') {
				dest[destOff + i] = -118;
			} else if (c == '‹') {
				dest[i + destOff] = -117;
			} else if (c == 'Œ') {
				dest[i + destOff] = -116;
			} else if (c == 'Ž') {
				dest[destOff + i] = -114;
			} else if (c == '‘') {
				dest[destOff + i] = -111;
			} else if (c == '’') {
				dest[i + destOff] = -110;
			} else if (c == '“') {
				dest[destOff + i] = -109;
			} else if (c == '”') {
				dest[i + destOff] = -108;
			} else if (c == '•') {
				dest[destOff + i] = -107;
			} else if (c == '–') {
				dest[i + destOff] = -106;
			} else if (c == '—') {
				dest[i + destOff] = -105;
			} else if (c == '˜') {
				dest[destOff + i] = -104;
			} else if (c == '™') {
				dest[destOff + i] = -103;
			} else if (c == 'š') {
				dest[i + destOff] = -102;
			} else if (c == '›') {
				dest[destOff + i] = -101;
			} else if (c == 'œ') {
				dest[i + destOff] = -100;
			} else if (c == 'ž') {
				dest[destOff + i] = -98;
			} else if (c == 'Ÿ') {
				dest[destOff + i] = -97;
			} else {
				dest[i + destOff] = 63;
			}
		}
		return srcLen2;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] encodeString(@OriginalArg(0) String src) {
		@Pc(4) int srcLen = src.length();
		@Pc(13) byte[] dest = new byte[srcLen];
		for (@Pc(19) int i = 0; i < srcLen; i++) {
			@Pc(30) char c = src.charAt(i);
			if (c > '\u0000' && c < '\u0080' || c >= ' ' && c <= 'ÿ') {
				dest[i] = (byte) c;
			} else if (c == '€') {
				dest[i] = -128;
			} else if (c == '‚') {
				dest[i] = -126;
			} else if (c == 'ƒ') {
				dest[i] = -125;
			} else if (c == '„') {
				dest[i] = -124;
			} else if (c == '…') {
				dest[i] = -123;
			} else if (c == '†') {
				dest[i] = -122;
			} else if (c == '‡') {
				dest[i] = -121;
			} else if (c == 'ˆ') {
				dest[i] = -120;
			} else if (c == '‰') {
				dest[i] = -119;
			} else if (c == 'Š') {
				dest[i] = -118;
			} else if (c == '‹') {
				dest[i] = -117;
			} else if (c == 'Œ') {
				dest[i] = -116;
			} else if (c == 'Ž') {
				dest[i] = -114;
			} else if (c == '‘') {
				dest[i] = -111;
			} else if (c == '’') {
				dest[i] = -110;
			} else if (c == '“') {
				dest[i] = -109;
			} else if (c == '”') {
				dest[i] = -108;
			} else if (c == '•') {
				dest[i] = -107;
			} else if (c == '–') {
				dest[i] = -106;
			} else if (c == '—') {
				dest[i] = -105;
			} else if (c == '˜') {
				dest[i] = -104;
			} else if (c == '™') {
				dest[i] = -103;
			} else if (c == 'š') {
				dest[i] = -102;
			} else if (c == '›') {
				dest[i] = -101;
			} else if (c == 'œ') {
				dest[i] = -100;
			} else if (c == 'ž') {
				dest[i] = -98;
			} else if (c == 'Ÿ') {
				dest[i] = -97;
			} else {
				dest[i] = 63;
			}
		}
		return dest;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB)C")
	public static char decodeChar(@OriginalArg(1) byte b) {
		@Pc(7) int codepoint = b & 0xFF;
		if (codepoint == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(codepoint, 16) + " provided");
		}
		if (codepoint >= 128 && codepoint < 160) {
			@Pc(47) char c = CP1252_TABLE[codepoint - 128];
			if (c == '\u0000') {
				c = '?';
			}
			codepoint = c;
		}
		return (char) codepoint;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[BZI)Ljava/lang/String;")
	public static String decodeString(@OriginalArg(1) byte[] bytes, @OriginalArg(0) int off, @OriginalArg(3) int len) {
		@Pc(8) char[] out = new char[len];
		@Pc(14) int outLen = 0;
		for (@Pc(16) int i = 0; i < len; i++) {
			@Pc(32) int codepoint = bytes[off + i] & 0xFF;
			if (codepoint != 0) {
				if (codepoint >= 128 && codepoint < 160) {
					@Pc(49) char c = CP1252_TABLE[codepoint - 128];
					if (c == '\u0000') {
						c = '?';
					}
					codepoint = c;
				}
				out[outLen++] = (char) codepoint;
			}
		}
		return new String(out, 0, outLen);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(CI)Z")
	public static boolean isCharValid(@OriginalArg(0) char codepoint) {
		if (codepoint > '\u0000' && codepoint < '\u0080' || codepoint >= '\u00A0' && codepoint <= '\u00FF') {
			return true;
		}
		if (codepoint != '\u0000') {
			@Pc(27) int i = 0;
			@Pc(29) char[] table = CP1252_TABLE;
			while (i < table.length) {
				@Pc(37) char c = table[i];
				if (codepoint == c) {
					return true;
				}
				i++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IC)Z")
	public static boolean isPrintable(@OriginalArg(1) char c) {
		if (c >= ' ' && c <= '~') {
			return true;
		} else if (c >= ' ' && c <= 'ÿ') {
			return true;
		} else {
			return c == '€' || c == 'Œ' || c == '—' || c == 'œ' || c == 'Ÿ';
		}
	}
}

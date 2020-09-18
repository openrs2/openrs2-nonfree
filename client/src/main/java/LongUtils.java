import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class LongUtils {
	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
	public static String fixedPointToString(@OriginalArg(0) long value, @OriginalArg(1) boolean thousandsSeparators, @OriginalArg(3) int fractionalDigits, @OriginalArg(4) int language) {
		@Pc(3) char decimalSeparator = ',';
		@Pc(5) char thousandsSeparator = '.';
		@Pc(11) boolean negative = false;
		if (language == 0) {
			thousandsSeparator = ',';
			decimalSeparator = '.';
		}
		if (language == 2) {
			thousandsSeparator = ' ';
		}
		if (value < 0L) {
			negative = true;
			value = -value;
		}
		@Pc(53) StringBuffer buffer = new StringBuffer(26);
		if (fractionalDigits > 0) {
			for (@Pc(58) int i = 0; i < fractionalDigits; i++) {
				@Pc(68) int prevValue = (int) value;
				value /= 10L;
				buffer.append((char) (prevValue + 48 - (int) value * 10));
			}
			buffer.append(decimalSeparator);
		}
		@Pc(93) int i = 0;
		while (true) {
			@Pc(96) int prevValue = (int) value;
			value /= 10L;
			buffer.append((char) (prevValue + 48 - (int) value * 10));
			if (value == 0L) {
				if (negative) {
					buffer.append('-');
				}
				return buffer.reverse().toString();
			}
			if (thousandsSeparators) {
				i++;
				if (i % 3 == 0) {
					buffer.append(thousandsSeparator);
				}
			}
		}
	}
}

import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class17 {

	@OriginalMember(owner = "client!be", name = "i", descriptor = "[B")
	public static final byte[] aByteArray4 = new byte[32896];

	static {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			for (@Pc(22) int local22 = 0; local22 <= local17; local22++) {
				aByteArray4[local15++] = (byte) (255.0D / Math.sqrt((double) ((float) (local17 * local17 + local22 * local22 + 65535) / 65535.0F)));
			}
		}
	}
}

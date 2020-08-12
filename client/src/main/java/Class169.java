import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class169 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
	public static final int[] CRC32_TABLE = new int[256];

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	public int anInt5275;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public int anInt5276;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	public int anInt5277;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	public int anInt5279;

	static {
		for (@Pc(6) int i = 0; i < 256; i++) {
			@Pc(11) int crc = i;
			for (@Pc(13) int j = 0; j < 8; j++) {
				if ((crc & 0x1) == 1) {
					crc = crc >>> 1 ^ 0xEDB88320;
				} else {
					crc >>>= 1;
				}
			}
			CRC32_TABLE[i] = crc;
		}
	}
}

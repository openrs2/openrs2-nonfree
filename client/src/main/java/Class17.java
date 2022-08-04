import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class17 {

	@OriginalMember(owner = "client!be", name = "i", descriptor = "[B")
	public static final byte[] INVERSE_SQUARE_ROOT = new byte[32896];

	static {
		@Pc(15) int i = 0;
		for (@Pc(17) int x = 0; x < 256; x++) {
			for (@Pc(22) int y = 0; y <= x; y++) {
				INVERSE_SQUARE_ROOT[i++] = (byte) (255.0D / Math.sqrt((double) ((float) (x * x + y * y + 65535) / 65535.0F)));
			}
		}
	}
}

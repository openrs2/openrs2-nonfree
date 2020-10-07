import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class MathUtils {

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "[I")
	private static final int[] anIntArray296 = new int[512];

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "[I")
	public static final int[] COSINE = new int[2048];

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "[I")
	public static final int[] anIntArray300 = new int[2048];

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "[I")
	public static final int[] SINE = new int[2048];

	static {
		for (@Pc(33) int i = 1; i < 512; i++) {
			anIntArray296[i] = 32768 / i;
		}
		for (@Pc(46) int i = 1; i < 2048; i++) {
			anIntArray300[i] = 65536 / i;
		}
		for (@Pc(59) int i = 0; i < 2048; i++) {
			SINE[i] = (int) (Math.sin((double) i * 0.0030679615D) * 65536.0D);
			COSINE[i] = (int) (Math.cos((double) i * 0.0030679615D) * 65536.0D);
		}
	}
}

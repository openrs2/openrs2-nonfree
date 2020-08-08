import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!c")
public final class Class200 {

	@OriginalMember(owner = "unpackclass!c", name = "a", descriptor = "I")
	private static int anInt6114;

	@OriginalMember(owner = "unpackclass!c", name = "b", descriptor = "I")
	private static int anInt6115;

	@OriginalMember(owner = "unpackclass!c", name = "c", descriptor = "I")
	private static int anInt6116;

	@OriginalMember(owner = "unpackclass!c", name = "d", descriptor = "[[B")
	private static final byte[][] aByteArrayArray55 = new byte[1000][];

	@OriginalMember(owner = "unpackclass!c", name = "e", descriptor = "[[B")
	private static final byte[][] aByteArrayArray56 = new byte[250][];

	@OriginalMember(owner = "unpackclass!c", name = "f", descriptor = "[[B")
	private static final byte[][] aByteArrayArray57 = new byte[50][];

	@OriginalMember(owner = "unpackclass!c", name = "a", descriptor = "(I)[B")
	public static synchronized byte[] method4902(@OriginalArg(0) int arg0) {
		if (arg0 == 100 && anInt6114 > 0) {
			@Pc(12) byte[] local12 = aByteArrayArray55[--anInt6114];
			aByteArrayArray55[anInt6114] = null;
			return local12;
		} else if (arg0 == 5000 && anInt6115 > 0) {
			@Pc(31) byte[] local31 = aByteArrayArray56[--anInt6115];
			aByteArrayArray56[anInt6115] = null;
			return local31;
		} else if (arg0 == 30000 && anInt6116 > 0) {
			@Pc(50) byte[] local50 = aByteArrayArray57[--anInt6116];
			aByteArrayArray57[anInt6116] = null;
			return local50;
		} else {
			return new byte[arg0];
		}
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!a")
public abstract class Class198 {

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "Z")
	private static boolean aBoolean428;

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "([BZ)Ljava/lang/Object;")
	public static Object method4888(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !aBoolean428) {
			try {
				@Pc(14) Class198 local14 = (Class198) Class.forName("d").getDeclaredConstructor().newInstance();
				local14.method4892(arg0);
				return local14;
			} catch (@Pc(20) Throwable local20) {
				aBoolean428 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "(Ljava/lang/Object;Z)[B")
	public static byte[] method4889(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(9) byte[] local9 = (byte[]) arg0;
			return arg1 ? method4890(local9) : local9;
		} else if (arg0 instanceof Class198) {
			@Pc(22) Class198 local22 = (Class198) arg0;
			return local22.method4891();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "([B)[B")
	private static byte[] method4890(@OriginalArg(0) byte[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(5) byte[] local5 = new byte[local2];
		Class208.method4926(arg0, 0, local5, 0, local2);
		return local5;
	}

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "()[B")
	protected abstract byte[] method4891();

	@OriginalMember(owner = "unpackclass!a", name = "b", descriptor = "([B)V")
	protected abstract void method4892(@OriginalArg(0) byte[] arg0);
}

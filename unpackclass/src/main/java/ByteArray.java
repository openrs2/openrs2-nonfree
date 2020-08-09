import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!a")
public abstract class ByteArray {

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "Z")
	private static boolean directBuffersUnsupported;

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "([BZ)Ljava/lang/Object;")
	public static Object wrap(@OriginalArg(0) byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		if (bytes.length > 136 && !directBuffersUnsupported) {
			try {
				@Pc(14) ByteArray array = (ByteArray) Class.forName("DirectByteArray").getDeclaredConstructor().newInstance();
				array.set(bytes);
				return array;
			} catch (@Pc(20) Throwable ex) {
				directBuffersUnsupported = true;
			}
		}
		return bytes;
	}

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "(Ljava/lang/Object;Z)[B")
	public static byte[] unwrap(@OriginalArg(0) Object in, @OriginalArg(1) boolean copy) {
		if (in == null) {
			return null;
		} else if (in instanceof byte[]) {
			@Pc(9) byte[] bytes = (byte[]) in;
			return copy ? copy(bytes) : bytes;
		} else if (in instanceof ByteArray) {
			@Pc(22) ByteArray array = (ByteArray) in;
			return array.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "([B)[B")
	private static byte[] copy(@OriginalArg(0) byte[] in) {
		@Pc(2) int len = in.length;
		@Pc(5) byte[] out = new byte[len];
		ArrayUtils.copy(in, 0, out, 0, len);
		return out;
	}

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "()[B")
	protected abstract byte[] get();

	@OriginalMember(owner = "unpackclass!a", name = "b", descriptor = "([B)V")
	protected abstract void set(@OriginalArg(0) byte[] bytes);
}

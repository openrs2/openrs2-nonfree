import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public abstract class ByteArray {

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "Z")
	private static boolean directBuffersUnsupported = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object wrap(@OriginalArg(0) byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		if (bytes.length > 136 && !directBuffersUnsupported) {
			try {
				@Pc(19) ByteArray array = (ByteArray) Class.forName("DirectByteArray").getDeclaredConstructor().newInstance();
				array.set(bytes);
				return array;
			} catch (@Pc(26) Throwable ex) {
				directBuffersUnsupported = true;
			}
		}
		return bytes;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] unwrap(@OriginalArg(2) Object in, @OriginalArg(1) boolean copy) {
		if (in == null) {
			return null;
		} else if (in instanceof byte[]) {
			@Pc(20) byte[] bytes = (byte[]) in;
			return copy ? copy(bytes) : bytes;
		} else if (in instanceof ByteArray) {
			@Pc(34) ByteArray array = (ByteArray) in;
			return array.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([BI)[B")
	private static byte[] copy(@OriginalArg(0) byte[] in) {
		@Pc(14) int len = in.length;
		@Pc(17) byte[] out = new byte[len];
		ArrayUtils.copy(in, 0, out, 0, len);
		return out;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)[B")
	protected abstract byte[] get();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[B)V")
	protected abstract void set(@OriginalArg(1) byte[] bytes);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class BufferPool {
	@OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
	private static int smallBufferCount = 0;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private static int mediumBufferCount = 0;

	@OriginalMember(owner = "client!dn", name = "Z", descriptor = "I")
	private static int largeBufferCount = 0;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "[[B")
	private static final byte[][] smallBuffers = new byte[1000][];

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "[[B")
	private static final byte[][] mediumBuffers = new byte[250][];

	@OriginalMember(owner = "client!el", name = "c", descriptor = "[[B")
	private static final byte[][] largeBuffers = new byte[50][];

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] allocate(@OriginalArg(1) int size) {
		if (size == 100 && smallBufferCount > 0) {
			@Pc(22) byte[] bytes = smallBuffers[--smallBufferCount];
			smallBuffers[smallBufferCount] = null;
			return bytes;
		} else if (size == 5000 && mediumBufferCount > 0) {
			@Pc(50) byte[] bytes = mediumBuffers[--mediumBufferCount];
			mediumBuffers[mediumBufferCount] = null;
			return bytes;
		} else if (size == 30000 && largeBufferCount > 0) {
			@Pc(72) byte[] bytes = largeBuffers[--largeBufferCount];
			largeBuffers[largeBufferCount] = null;
			return bytes;
		} else {
			return new byte[size];
		}
	}
}

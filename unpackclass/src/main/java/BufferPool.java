import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!c")
public final class BufferPool {

	@OriginalMember(owner = "unpackclass!c", name = "a", descriptor = "I")
	private static int smallBufferCount;

	@OriginalMember(owner = "unpackclass!c", name = "b", descriptor = "I")
	private static int mediumBufferCount;

	@OriginalMember(owner = "unpackclass!c", name = "c", descriptor = "I")
	private static int largeBufferCount;

	@OriginalMember(owner = "unpackclass!c", name = "d", descriptor = "[[B")
	private static final byte[][] smallBuffers = new byte[1000][];

	@OriginalMember(owner = "unpackclass!c", name = "e", descriptor = "[[B")
	private static final byte[][] mediumBuffers = new byte[250][];

	@OriginalMember(owner = "unpackclass!c", name = "f", descriptor = "[[B")
	private static final byte[][] largeBuffers = new byte[50][];

	@OriginalMember(owner = "unpackclass!c", name = "a", descriptor = "(I)[B")
	public static synchronized byte[] allocate(@OriginalArg(0) int len) {
		if (len == 100 && smallBufferCount > 0) {
			@Pc(12) byte[] bytes = smallBuffers[--smallBufferCount];
			smallBuffers[smallBufferCount] = null;
			return bytes;
		} else if (len == 5000 && mediumBufferCount > 0) {
			@Pc(31) byte[] bytes = mediumBuffers[--mediumBufferCount];
			mediumBuffers[mediumBufferCount] = null;
			return bytes;
		} else if (len == 30000 && largeBufferCount > 0) {
			@Pc(50) byte[] bytes = largeBuffers[--largeBufferCount];
			largeBuffers[largeBufferCount] = null;
			return bytes;
		} else {
			return new byte[len];
		}
	}
}

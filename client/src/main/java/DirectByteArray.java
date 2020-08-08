import java.nio.ByteBuffer;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class DirectByteArray extends ByteArray {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer buffer;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)[B")
	@Override
	protected final byte[] get() {
		@Pc(4) byte[] bytes = new byte[this.buffer.capacity()];
		this.buffer.position(0);
		this.buffer.get(bytes);
		return bytes;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[B)V")
	@Override
	protected final void set(@OriginalArg(1) byte[] bytes) {
		this.buffer = ByteBuffer.allocateDirect(bytes.length);
		this.buffer.position(0);
		this.buffer.put(bytes);
	}
}

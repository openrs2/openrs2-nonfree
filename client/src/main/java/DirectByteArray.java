import java.nio.ByteBuffer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class DirectByteArray extends ByteArray {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer buffer;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)[B")
	@Override
	protected byte[] get() {
		@Pc(4) byte[] bytes = new byte[this.buffer.capacity()];
		this.buffer.position(0);
		this.buffer.get(bytes);
		return bytes;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[B)V")
	@Override
	protected void set(@OriginalArg(1) byte[] bytes) {
		this.buffer = ByteBuffer.allocateDirect(bytes.length);
		this.buffer.position(0);
		this.buffer.put(bytes);
	}
}

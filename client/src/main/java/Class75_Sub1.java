import java.nio.ByteBuffer;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer11;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)[B")
	@Override
	public final byte[] method2324() {
		@Pc(4) byte[] local4 = new byte[this.aByteBuffer11.capacity()];
		this.aByteBuffer11.position(0);
		this.aByteBuffer11.get(local4);
		return local4;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[B)V")
	@Override
	public final void method2325(@OriginalArg(1) byte[] arg0) {
		this.aByteBuffer11 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer11.position(0);
		this.aByteBuffer11.put(arg0);
	}
}

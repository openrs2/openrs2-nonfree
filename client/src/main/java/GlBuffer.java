import java.nio.ByteBuffer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class GlBuffer {

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	public ByteBuffer buffer;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!lk;")
	public GlVertexBufferObject vbo;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Z")
	public boolean valid = false;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	public int stride = 0;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public int pointer = 0;
}

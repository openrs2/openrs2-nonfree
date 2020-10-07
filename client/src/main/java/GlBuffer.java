import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class GlBuffer {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	private final int contextId;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
	private final boolean stream;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	private int size;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	private int id;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	public GlBuffer() {
		this(false);
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Z)V")
	public GlBuffer(@OriginalArg(0) boolean stream) {
		this.size = 0;
		this.id = -1;
		@Pc(9) GL gl = GlRenderer.gl;
		@Pc(12) int[] temp = new int[1];
		gl.glGenBuffersARB(1, temp, 0);
		this.stream = stream;
		this.id = temp[0];
		this.contextId = GlCleaner.contextId;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void updateArrayBuffer(@OriginalArg(0) ByteBuffer buffer) {
		if (buffer.limit() <= this.size) {
			@Pc(6) GL gl = GlRenderer.gl;
			gl.glBindBufferARB(GL.GL_ARRAY_BUFFER, this.id);
			gl.glBufferSubDataARB(GL.GL_ARRAY_BUFFER, 0, buffer.limit(), buffer);
		} else {
			this.setArrayBuffer(buffer);
		}
	}

	@OriginalMember(owner = "client!lk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.id != -1) {
			GlCleaner.deleteBuffer(this.id, this.size, this.contextId);
			this.id = -1;
			this.size = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void setElementArrayBuffer(@OriginalArg(0) ByteBuffer buffer) {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, this.id);
		gl.glBufferDataARB(GL.GL_ELEMENT_ARRAY_BUFFER, buffer.limit(), buffer, this.stream ? GL.GL_STREAM_DRAW : GL.GL_STATIC_DRAW);
		GlCleaner.onCardGeometry += buffer.limit() - this.size;
		this.size = buffer.limit();
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void setArrayBuffer(@OriginalArg(0) ByteBuffer buffer) {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glBindBufferARB(GL.GL_ARRAY_BUFFER, this.id);
		gl.glBufferDataARB(GL.GL_ARRAY_BUFFER, buffer.limit(), buffer, this.stream ? GL.GL_STREAM_DRAW : GL.GL_STATIC_DRAW);
		GlCleaner.onCardGeometry += buffer.limit() - this.size;
		this.size = buffer.limit();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "()V")
	public final void bindElementArray() {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, this.id);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "()V")
	public final void bindArray() {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glBindBufferARB(GL.GL_ARRAY_BUFFER, this.id);
	}
}

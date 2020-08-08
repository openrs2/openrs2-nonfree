import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class111 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	private final int anInt3190;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
	private final boolean aBoolean225;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	private int anInt3191;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	private int anInt3192;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	public Class111() {
		this(false);
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Z)V")
	public Class111(@OriginalArg(0) boolean arg0) {
		this.anInt3191 = 0;
		this.anInt3192 = -1;
		@Pc(9) GL local9 = Static3.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean225 = arg0;
		this.anInt3192 = local12[0];
		this.anInt3190 = Static4.anInt3332;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void method2600(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt3191) {
			@Pc(6) GL local6 = Static3.aGL1;
			local6.glBindBufferARB(GL.GL_ARRAY_BUFFER, this.anInt3192);
			local6.glBufferSubDataARB(GL.GL_ARRAY_BUFFER, 0, arg0.limit(), arg0);
		} else {
			this.method2602(arg0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.anInt3192 != -1) {
			Static25.method2721(this.anInt3192, this.anInt3191, this.anInt3190);
			this.anInt3192 = -1;
			this.anInt3191 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void method2601(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static3.aGL1;
		local1.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, this.anInt3192);
		local1.glBufferDataARB(GL.GL_ELEMENT_ARRAY_BUFFER, arg0.limit(), arg0, this.aBoolean225 ? GL.GL_STREAM_DRAW : GL.GL_STATIC_DRAW);
		Static4.anInt3331 += arg0.limit() - this.anInt3191;
		this.anInt3191 = arg0.limit();
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void method2602(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static3.aGL1;
		local1.glBindBufferARB(GL.GL_ARRAY_BUFFER, this.anInt3192);
		local1.glBufferDataARB(GL.GL_ARRAY_BUFFER, arg0.limit(), arg0, this.aBoolean225 ? GL.GL_STREAM_DRAW : GL.GL_STATIC_DRAW);
		Static4.anInt3331 += arg0.limit() - this.anInt3191;
		this.anInt3191 = arg0.limit();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "()V")
	public final void method2603() {
		@Pc(1) GL local1 = Static3.aGL1;
		local1.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, this.anInt3192);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "()V")
	public final void method2604() {
		@Pc(1) GL local1 = Static3.aGL1;
		local1.glBindBufferARB(GL.GL_ARRAY_BUFFER, this.anInt3192);
	}
}

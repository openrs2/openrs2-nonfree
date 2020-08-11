import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class4_Sub3_Sub16 extends SecondaryNode {

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "[I")
	public static final int[] anIntArray455 = new int[32];

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
	private int anInt4276 = 0;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
	private int anInt4278 = -1;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
	private final int anInt4283;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray455[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
	public Class4_Sub3_Sub16(@OriginalArg(0) int arg0) {
		@Pc(9) GL local9 = Static3.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt4278 = local12[0];
		this.anInt4283 = Static4.anInt3332;
		Static17.method1600(this.anInt4278);
		@Pc(32) int local32 = Static4.anIntArray295[arg0];
		@Pc(58) byte[] local58 = new byte[] { (byte) (local32 >> 16), (byte) (local32 >> 8), (byte) local32, -1 };
		@Pc(61) ByteBuffer local61 = ByteBuffer.wrap(local58);
		local9.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, 1, 1, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, local61);
		local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
		local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		Static4.anInt3330 += local61.limit() - this.anInt4276;
		this.anInt4276 = local61.limit();
	}

	@OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.anInt4278 != -1) {
			Static25.method2720(this.anInt4278, this.anInt4276, this.anInt4283);
			this.anInt4276 = 0;
			this.anInt4278 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	public final void method3539() {
		@Pc(6) int local6 = Static15.method1323();
		if ((local6 & 0x1) == 0) {
			Static17.method1600(this.anInt4278);
		}
		if ((local6 & 0x2) == 0) {
			Static17.method1597(0);
		}
		if ((local6 & 0x4) == 0) {
			Static17.method1607(0);
		}
	}
}

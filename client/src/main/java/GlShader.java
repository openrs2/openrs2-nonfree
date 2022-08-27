import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class GlShader {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	public static final int GL_FRAGMENT_SHADER = 0x8B30;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
	private static final int[] temp = new int[2];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ec;")
	public static GlShader create(@OriginalArg(0) String code, @OriginalArg(1) int type) {
		@Pc(1) GL gl = GlRenderer.gl;
		@Pc(5) int id = gl.glCreateShaderObjectARB(type);
		gl.glShaderSourceARB(id, 1, new String[] { code }, new int[] { code.length() }, 0);
		gl.glCompileShaderARB(id);
		gl.glGetObjectParameterivARB(id, GL.GL_COMPILE_STATUS, temp, 0);
		if (temp[0] == 0) {
			if (temp[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			gl.glGetObjectParameterivARB(id, GL.GL_INFO_LOG_LENGTH, temp, 1);
			if (temp[1] > 1) {
				@Pc(59) byte[] log = new byte[temp[1]];
				gl.glGetInfoLogARB(id, temp[1], temp, 0, log, 0);
				System.out.println(new String(log));
			}
			if (temp[0] == 0) {
				gl.glDeleteObjectARB(id);
				return null;
			}
		}
		return new GlShader(id, type);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private final int contextId;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(II)V")
	private GlShader(@OriginalArg(0) int id, @OriginalArg(1) int type) {
		this.id = id;
		this.contextId = GlCleaner.contextId;
	}

	@OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		GlCleaner.deleteShader(this.id, this.contextId);
		super.finalize();
	}
}

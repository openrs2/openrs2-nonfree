import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class GlProgram {

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "[I")
	private static final int[] temp = new int[2];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([Lclient!ec;)Lclient!pf;")
	public static GlProgram create(@OriginalArg(0) GlShader[] shaders) {
		for (@Pc(1) int i = 0; i < shaders.length; i++) {
			if (shaders[i] == null || shaders[i].id <= 0) {
				return null;
			}
		}
		@Pc(20) GL gl = GlRenderer.gl;
		@Pc(23) int program = gl.glCreateProgramObjectARB();
		for (@Pc(25) int i = 0; i < shaders.length; i++) {
			gl.glAttachObjectARB(program, shaders[i].id);
		}
		gl.glLinkProgramARB(program);
		gl.glGetObjectParameterivARB(program, GL.GL_LINK_STATUS, temp, 0);
		if (temp[0] == 0) {
			if (temp[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			gl.glGetObjectParameterivARB(program, GL.GL_INFO_LOG_LENGTH, temp, 1);
			if (temp[1] > 1) {
				@Pc(74) byte[] log = new byte[temp[1]];
				gl.glGetInfoLogARB(program, temp[1], temp, 0, log, 0);
				System.out.println(new String(log));
			}
			if (temp[0] == 0) {
				for (@Pc(96) int i = 0; i < shaders.length; i++) {
					gl.glDetachObjectARB(program, shaders[i].id);
				}
				gl.glDeleteObjectARB(program);
				return null;
			}
		}
		return new GlProgram(program, shaders);
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "[Lclient!ec;")
	private final GlShader[] shaders;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
	private final int contextId;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I[Lclient!ec;)V")
	private GlProgram(@OriginalArg(0) int id, @OriginalArg(1) GlShader[] shaders) {
		this.id = id;
		this.shaders = shaders;
		this.contextId = GlCleaner.contextId;
	}

	@OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		GlCleaner.deleteProgram(this.id, this.shaders, this.contextId);
		super.finalize();
	}
}

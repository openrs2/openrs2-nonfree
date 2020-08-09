package javax.media.opengl;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!javax/media/opengl/GLContext")
public abstract class GLContext {

	@OriginalMember(owner = "gl!javax/media/opengl/GLContext", name = "currentContext", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext currentContext;

	@OriginalMember(owner = "gl!javax/media/opengl/GLContext", name = "getCurrent", descriptor = "()Lgl!javax/media/opengl/GLContext;")
	public static GLContext getCurrent() {
		return currentContext;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLContext", name = "setCurrent", descriptor = "(Lgl!javax/media/opengl/GLContext;)V")
	protected static void setCurrent(@OriginalArg(0) GLContext context) {
		currentContext = context;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLContext", name = "<init>", descriptor = "()V")
	protected GLContext() {
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLContext", name = "makeCurrent", descriptor = "()I")
	public abstract int makeCurrent() throws GLException;

	@OriginalMember(owner = "gl!javax/media/opengl/GLContext", name = "release", descriptor = "()V")
	public abstract void release() throws GLException;

	@OriginalMember(owner = "gl!javax/media/opengl/GLContext", name = "destroy", descriptor = "()V")
	public abstract void destroy();

	@OriginalMember(owner = "gl!javax/media/opengl/GLContext", name = "getGL", descriptor = "()Lgl!javax/media/opengl/GL;")
	public abstract GL getGL();
}

package javax.media.opengl;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!javax/media/opengl/GLDrawable")
public interface GLDrawable {

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawable", name = "createContext", descriptor = "(Lgl!javax/media/opengl/GLContext;)Lgl!javax/media/opengl/GLContext;")
	GLContext createContext(@OriginalArg(0) GLContext context);

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawable", name = "setRealized", descriptor = "(Z)V")
	void setRealized(@OriginalArg(0) boolean realized);

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawable", name = "swapBuffers", descriptor = "()V")
	void swapBuffers() throws GLException;
}

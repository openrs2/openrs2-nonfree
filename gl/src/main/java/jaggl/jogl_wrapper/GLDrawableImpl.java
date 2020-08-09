package jaggl.jogl_wrapper;

import java.awt.Component;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import jaggl.context;

@OriginalClass("gl!jaggl/jogl_wrapper/GLDrawableImpl")
public final class GLDrawableImpl implements GLDrawable {

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "chosenCapabilities", descriptor = "Lgl!javax/media/opengl/GLCapabilities;")
	public GLCapabilities chosenCapabilities;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "component", descriptor = "Ljava/awt/Component;")
	public final Component component;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "capabilities", descriptor = "Lgl!javax/media/opengl/GLCapabilities;")
	public final GLCapabilities capabilities;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "<init>", descriptor = "(Ljava/awt/Component;Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)V")
	public GLDrawableImpl(@OriginalArg(0) Component component, @OriginalArg(1) GLCapabilities capabilities, @OriginalArg(2) GLCapabilitiesChooser chooser) {
		this.component = component;
		this.capabilities = capabilities;
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "createContext", descriptor = "(Lgl!javax/media/opengl/GLContext;)Lgl!javax/media/opengl/GLContext;")
	@Override
	public final GLContext createContext(@OriginalArg(0) GLContext context) {
		return new GLContextImpl(this);
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "swapBuffers", descriptor = "()V")
	@Override
	public final void swapBuffers() throws GLException {
		context.swapBuffers();
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "setRealized", descriptor = "(Z)V")
	@Override
	public final void setRealized(@OriginalArg(0) boolean realized) {
	}
}

package javax.media.opengl;

import jaggl.jogl_wrapper.GLDrawableFactoryImpl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!javax/media/opengl/GLDrawableFactory")
public abstract class GLDrawableFactory {

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawableFactory", name = "factory", descriptor = "Lgl!javax/media/opengl/GLDrawableFactory;")
	private static GLDrawableFactory factory;

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawableFactory", name = "getFactory", descriptor = "()Lgl!javax/media/opengl/GLDrawableFactory;")
	public static GLDrawableFactory getFactory() {
		return factory == null ? new GLDrawableFactoryImpl() : factory;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawableFactory", name = "getGLDrawable", descriptor = "(Ljava/lang/Object;Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)Lgl!javax/media/opengl/GLDrawable;")
	public abstract GLDrawable getGLDrawable(@OriginalArg(0) Object target, @OriginalArg(1) GLCapabilities capabilities, @OriginalArg(2) GLCapabilitiesChooser chooser) throws IllegalArgumentException, GLException;
}

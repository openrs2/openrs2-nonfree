package javax.media.opengl;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import jaggl.jogl_wrapper.GLDrawableFactoryImpl;

@OriginalClass("gl!javax/media/opengl/GLDrawableFactory")
public abstract class GLDrawableFactory {

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawableFactory", name = "factory", descriptor = "Lgl!javax/media/opengl/GLDrawableFactory;")
	private static GLDrawableFactory factory;

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawableFactory", name = "getFactory", descriptor = "()Lgl!javax/media/opengl/GLDrawableFactory;")
	public static GLDrawableFactory getFactory() {
		return factory == null ? new GLDrawableFactoryImpl() : factory;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLDrawableFactory", name = "getGLDrawable", descriptor = "(Ljava/lang/Object;Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)Lgl!javax/media/opengl/GLDrawable;")
	public abstract GLDrawable getGLDrawable(@OriginalArg(0) Object arg0, @OriginalArg(1) GLCapabilities arg1, @OriginalArg(2) GLCapabilitiesChooser arg2) throws IllegalArgumentException, GLException;
}

package jaggl.jogl_wrapper;

import java.awt.Component;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!jaggl/jogl_wrapper/GLDrawableFactoryImpl")
public final class GLDrawableFactoryImpl extends GLDrawableFactory {

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableFactoryImpl", name = "getGLDrawable", descriptor = "(Ljava/lang/Object;Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)Lgl!javax/media/opengl/GLDrawable;")
	@Override
	public final GLDrawable getGLDrawable(@OriginalArg(0) Object arg0, @OriginalArg(1) GLCapabilities arg1, @OriginalArg(2) GLCapabilitiesChooser arg2) {
		if (arg0 == null) {
			throw new IllegalArgumentException("Null target");
		} else if (arg0 instanceof Component) {
			return new GLDrawableImpl((Component) arg0, arg1, arg2);
		} else {
			throw new IllegalArgumentException("GLDrawables not supported for objects of type " + arg0.getClass().getName() + " (only Components are supported in this implementation)");
		}
	}
}

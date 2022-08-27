package jaggl.jogl_wrapper;

import java.awt.Component;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!jaggl/jogl_wrapper/GLDrawableFactoryImpl")
public final class GLDrawableFactoryImpl extends GLDrawableFactory {

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableFactoryImpl", name = "getGLDrawable", descriptor = "(Ljava/lang/Object;Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)Lgl!javax/media/opengl/GLDrawable;")
	@Override
	public GLDrawable getGLDrawable(@OriginalArg(0) Object target, @OriginalArg(1) GLCapabilities capabilities, @OriginalArg(2) GLCapabilitiesChooser chooser) {
		if (target == null) {
			throw new IllegalArgumentException("Null target");
		} else if (target instanceof Component) {
			return new GLDrawableImpl((Component) target, capabilities, chooser);
		} else {
			throw new IllegalArgumentException("GLDrawables not supported for objects of type " + target.getClass().getName() + " (only Components are supported in this implementation)");
		}
	}
}

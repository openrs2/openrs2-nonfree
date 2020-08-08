package jaggl.jogl_wrapper;

import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;
import jaggl.context;
import jaggl.opengl;

@OriginalClass("gl!jaggl/jogl_wrapper/GLContextImpl")
public final class GLContextImpl extends GLContext {

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "context_valid", descriptor = "Z")
	private boolean context_valid;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "gl", descriptor = "Lgl!javax/media/opengl/GL;")
	private GL gl;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "drawable", descriptor = "Lgl!jaggl/jogl_wrapper/GLDrawableImpl;")
	private final GLDrawableImpl drawable;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "<init>", descriptor = "(Lgl!jaggl/jogl_wrapper/GLDrawableImpl;)V")
	public GLContextImpl(@OriginalArg(0) GLDrawableImpl arg0) {
		this.drawable = arg0;
		this.setGL(new opengl());
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "create", descriptor = "()V")
	private void create() {
		if (this.drawable.capabilities != null) {
			@Pc(15) int local15 = this.drawable.capabilities.getSampleBuffers() ? this.drawable.capabilities.getNumSamples() : 0;
			if (!context.choosePixelFormat(this.drawable.component, local15, this.drawable.capabilities.getAlphaBits())) {
				throw new GLException("Unable to create a usable pixel format ");
			}
		} else if (!context.choosePixelFormat(this.drawable.component, 0, 0)) {
			throw new GLException("Unable to create a usable pixel format ");
		}
		if (!context.createContext()) {
			throw new GLException("Unable to create OpenGL context for device context ");
		}
		this.drawable.chosenCapabilities = new GLCapabilities();
		this.drawable.chosenCapabilities.setAlphaBits(context.getAlphaBits());
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "makeCurrent", descriptor = "()I")
	@Override
	public final int makeCurrent() throws GLException {
		@Pc(1) boolean local1 = false;
		if (!this.context_valid) {
			this.create();
			local1 = true;
		}
		if (!context.makeCurrent()) {
			throw new GLException("Error making context current: " + context.getLastError());
		}
		this.context_valid = true;
		setCurrent(this);
		return local1 ? 2 : 1;
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "release", descriptor = "()V")
	@Override
	public final void release() throws GLException {
		if (!context.releaseContext()) {
			throw new GLException("Error freeing OpenGL context: " + context.getLastError());
		}
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() throws GLException {
		if (!context.destroy()) {
			throw new GLException("Unable to delete OpenGL context");
		}
		this.context_valid = false;
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "getGL", descriptor = "()Lgl!javax/media/opengl/GL;")
	@Override
	public final GL getGL() {
		return this.gl;
	}

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "setGL", descriptor = "(Lgl!javax/media/opengl/GL;)V")
	private void setGL(@OriginalArg(0) GL arg0) {
		this.gl = arg0;
	}
}

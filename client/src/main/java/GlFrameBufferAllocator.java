import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class GlFrameBufferAllocator {
	@OriginalMember(owner = "client!b", name = "a", descriptor = "[I")
	private static final int[] temp = new int[1];

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
	private static final int[] viewport = new int[4];

	@OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
	private static final int[] frameBufferStack = new int[4];

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	private static int frameBufferStackPos = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
	public static int allocateRenderBuffer() {
		GlRenderer.gl.glGenRenderbuffersEXT(1, temp, 0);
		return temp[0];
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "()V")
	public static void restoreCamera() {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glPopMatrix();
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glPopMatrix();
		gl.glViewport(viewport[0], viewport[1], viewport[2], viewport[3]);
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()I")
	public static int allocateFrameBuffer() {
		GlRenderer.gl.glGenFramebuffersEXT(1, temp, 0);
		return temp[0];
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void freeFrameBuffer(@OriginalArg(0) int id) {
		temp[0] = id;
		GlRenderer.gl.glDeleteFramebuffersEXT(1, temp, 0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(FFFFFFII)V")
	public static void switchToOrthoCamera(@OriginalArg(0) float left, @OriginalArg(1) float right, @OriginalArg(2) float bottom, @OriginalArg(3) float top, @OriginalArg(4) float zNear, @OriginalArg(5) float zFar, @OriginalArg(6) int width, @OriginalArg(7) int height) {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glOrtho(left, right, bottom, top, zNear, zFar);
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glGetIntegerv(GL.GL_VIEWPORT, viewport, 0);
		gl.glViewport(0, 0, (int) (width * GameShell.canvasScale + 0.5), (int) (height * GameShell.canvasScale + 0.5));
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(FFFFII)V")
	public static void switchToOrthoCamera(@OriginalArg(0) float left, @OriginalArg(1) float right, @OriginalArg(2) float bottom, @OriginalArg(3) float top, @OriginalArg(4) int width, @OriginalArg(5) int height) {
		switchToOrthoCamera(left, right, bottom, top, -1.0F, 1.0F, width, height);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	public static void freeRenderBuffer(@OriginalArg(0) int id) {
		temp[0] = id;
		GlRenderer.gl.glDeleteRenderbuffersEXT(1, temp, 0);
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "()V")
	public static void popFrameBuffer() {
		GlRenderer.gl.glBindFramebufferEXT(GL.GL_FRAMEBUFFER, --frameBufferStackPos > 0 ? frameBufferStack[frameBufferStackPos - 1] : 0);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public static void pushFrameBuffer(@OriginalArg(0) int id) {
		frameBufferStack[frameBufferStackPos++] = id;
		GlRenderer.gl.glBindFramebufferEXT(GL.GL_FRAMEBUFFER, id);
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "()Z")
	public static boolean isFrameBufferComplete() {
		@Pc(1) GL gl = GlRenderer.gl;
		@Pc(5) int status = gl.glCheckFramebufferStatusEXT(GL.GL_FRAMEBUFFER);
		return status == GL.GL_FRAMEBUFFER_COMPLETE;
	}
}

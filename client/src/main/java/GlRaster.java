import java.nio.IntBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class GlRaster {
	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public static int clipX = 0;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
	public static int clipY = 0;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	public static int clipWidth = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	public static int clipHeight = 0;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!oa;")
	public static GlSprite mask = null;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([I)V")
	public static void getClip(@OriginalArg(0) int[] clip) {
		clip[0] = clipX;
		clip[1] = clipY;
		clip[2] = clipWidth;
		clip[3] = clipHeight;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIII)V")
	public static void setClip(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height) {
		if (x < 0) {
			x = 0;
		}
		if (y < 0) {
			y = 0;
		}
		if (width > GlRenderer.canvasWidth) {
			width = GlRenderer.canvasWidth;
		}
		if (height > GlRenderer.canvasHeight) {
			height = GlRenderer.canvasHeight;
		}
		clipX = x;
		clipY = y;
		clipWidth = width;
		clipHeight = height;
		@Pc(27) GL gl = GlRenderer.gl;
		gl.glEnable(GL.GL_SCISSOR_TEST);
		if (clipX <= clipWidth && clipY <= clipHeight) {
			gl.glScissor((int) ((GlRenderer.anInt2086 + clipX) * GameShell.canvasScale + 0.5), (int) ((GlRenderer.anInt2078 + GlRenderer.canvasHeight - clipHeight) * GameShell.canvasScale + 0.5), (int) ((clipWidth - clipX) * GameShell.canvasScale + 0.5), (int) ((clipHeight - clipY) * GameShell.canvasScale + 0.5));
		} else {
			gl.glScissor(0, 0, 0, 0);
		}
		resetMask();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "([I)V")
	public static void setClip(@OriginalArg(0) int[] clip) {
		setClip(clip[0], clip[1], clip[2], clip[3]);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "()V")
	public static void resetClip() {
		clipX = 0;
		clipY = 0;
		clipWidth = GlRenderer.canvasWidth;
		clipHeight = GlRenderer.canvasHeight;
		@Pc(9) GL gl = GlRenderer.gl;
		gl.glDisable(GL.GL_SCISSOR_TEST);
		resetMask();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIII)V")
	public static void shrinkClip(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height) {
		if (clipX < x) {
			clipX = x;
		}
		if (clipY < y) {
			clipY = y;
		}
		if (clipWidth > width) {
			clipWidth = width;
		}
		if (clipHeight > height) {
			clipHeight = height;
		}
		@Pc(21) GL gl = GlRenderer.gl;
		gl.glEnable(GL.GL_SCISSOR_TEST);
		if (clipX <= clipWidth && clipY <= clipHeight) {
			gl.glScissor((int) ((GlRenderer.anInt2086 + clipX) * GameShell.canvasScale + 0.5), (int) ((GlRenderer.anInt2078 + GlRenderer.canvasHeight - clipHeight) * GameShell.canvasScale + 0.5), (int) ((clipWidth - clipX) * GameShell.canvasScale + 0.5), (int) ((clipHeight - clipY) * GameShell.canvasScale + 0.5));
		} else {
			gl.glScissor(0, 0, 0, 0);
		}
		resetMask();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!oa;)V")
	public static void setMask(@OriginalArg(0) GlSprite mask) {
		if (mask.height != clipHeight - clipY) {
			throw new IllegalArgumentException();
		}
		GlRaster.mask = mask;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "()V")
	public static void resetMask() {
		mask = null;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "()V")
	public static void clear() {
		GlRenderer.gl.glClear(GL.GL_DEPTH_BUFFER_BIT | GL.GL_COLOR_BUFFER_BIT);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIIII)V")
	public static void drawRect(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color) {
		GlRenderer.method1585();
		@Pc(5) float x0 = (float) x + 0.3F;
		@Pc(12) float x1 = x0 + (float) (width - 1);
		@Pc(20) float y0 = (float) GlRenderer.canvasHeight - (float) y - 0.3F;
		@Pc(27) float y1 = y0 - (float) (height - 1);
		@Pc(29) GL gl = GlRenderer.gl;
		gl.glBegin(GL.GL_LINE_LOOP);
		gl.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
		gl.glVertex2f(x0, y0);
		gl.glVertex2f(x0, y1);
		gl.glVertex2f(x1, y1);
		gl.glVertex2f(x1, y0);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIII)V")
	public static void drawRectAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color, @OriginalArg(5) int alpha) {
		GlRenderer.method1585();
		@Pc(5) float x0 = (float) x + 0.3F;
		@Pc(12) float x1 = x0 + (float) (width - 1);
		@Pc(20) float y0 = (float) GlRenderer.canvasHeight - (float) y - 0.3F;
		@Pc(27) float y1 = y0 - (float) (height - 1);
		@Pc(29) GL gl = GlRenderer.gl;
		gl.glBegin(GL.GL_LINE_LOOP);
		gl.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color, alpha > 255 ? -1 : (byte) alpha);
		gl.glVertex2f(x0, y0);
		gl.glVertex2f(x0, y1);
		gl.glVertex2f(x1, y1);
		gl.glVertex2f(x1, y0);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(IIII)V")
	public static void drawHorizontalLine(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int color) {
		GlRenderer.method1585();
		@Pc(5) float x0 = (float) x + 0.3F;
		@Pc(10) float x1 = x0 + (float) width;
		@Pc(18) float y0 = (float) GlRenderer.canvasHeight - (float) y - 0.3F;
		@Pc(20) GL gl = GlRenderer.gl;
		gl.glBegin(GL.GL_LINES);
		gl.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
		gl.glVertex2f(x0, y0);
		gl.glVertex2f(x1, y0);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIII)V")
	public static void drawHorizontalLineAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int color, @OriginalArg(4) int alpha) {
		GlRenderer.method1585();
		@Pc(5) float x0 = (float) x + 0.3F;
		@Pc(10) float x1 = x0 + (float) width;
		@Pc(18) float y0 = (float) GlRenderer.canvasHeight - (float) y - 0.3F;
		@Pc(20) GL gl = GlRenderer.gl;
		gl.glBegin(GL.GL_LINES);
		gl.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color, alpha > 255 ? -1 : (byte) alpha);
		gl.glVertex2f(x0, y0);
		gl.glVertex2f(x1, y0);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)V")
	public static void drawVerticalLine(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int height, @OriginalArg(3) int color) {
		GlRenderer.method1585();
		@Pc(5) float x0 = (float) x + 0.3F;
		@Pc(13) float y0 = (float) GlRenderer.canvasHeight - (float) y - 0.3F;
		@Pc(18) float y1 = y0 - (float) height;
		@Pc(20) GL gl = GlRenderer.gl;
		gl.glBegin(GL.GL_LINES);
		gl.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
		gl.glVertex2f(x0, y0);
		gl.glVertex2f(x0, y1);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(IIIII)V")
	public static void fillRect(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color) {
		GlRenderer.method1585();
		@Pc(3) float x0 = (float) x;
		@Pc(8) float x1 = x0 + (float) width;
		@Pc(13) float y0 = (float) (GlRenderer.canvasHeight - y);
		@Pc(18) float y1 = y0 - (float) height;
		@Pc(20) GL gl = GlRenderer.gl;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
		gl.glVertex2f(x0, y0);
		gl.glVertex2f(x0, y1);
		gl.glVertex2f(x1, y1);
		gl.glVertex2f(x1, y0);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIIIII)V")
	public static void fillRectAlpha(@OriginalArg(0) int x, @OriginalArg(1) int arg1, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color, @OriginalArg(5) int alpha) {
		GlRenderer.method1585();
		@Pc(3) float x0 = (float) x;
		@Pc(8) float x1 = x0 + (float) width;
		@Pc(13) float y0 = (float) (GlRenderer.canvasHeight - arg1);
		@Pc(18) float y1 = y0 - (float) height;
		@Pc(20) GL gl = GlRenderer.gl;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color, alpha > 255 ? -1 : (byte) alpha);
		gl.glVertex2f(x0, y0);
		gl.glVertex2f(x0, y1);
		gl.glVertex2f(x1, y1);
		gl.glVertex2f(x1, y0);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public static void drawLine(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int color) {
		GlRenderer.method1585();
		@Pc(5) float x0f = (float) x0 + 0.3F;
		@Pc(10) float x1f = (float) x1 + 0.3F;
		@Pc(18) float y0f = (float) GlRenderer.canvasHeight - (float) y0 - 0.3F;
		@Pc(26) float y1f = (float) GlRenderer.canvasHeight - (float) y1 - 0.3F;
		@Pc(28) GL gl = GlRenderer.gl;
		gl.glBegin(GL.GL_LINE_LOOP);
		gl.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
		gl.glVertex2f(x0f, y0f);
		gl.glVertex2f(x1f, y1f);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIIII)V")
	public static void drawLineWithStrokeWidth(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int color, @OriginalArg(5) int strokeWidth) {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glLineWidth((float) (strokeWidth * GameShell.canvasScale));
		drawLine(x0, y0, x1, y1, color);
		gl.glLineWidth((float) GameShell.canvasScale);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIILclient!oa;)V")
	public static void drawRectMaskedAlpha(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int color, @OriginalArg(5) int alpha, @OriginalArg(6) GlSprite mask) {
		if (clipHeight - clipY != mask.height) {
			throw new IllegalStateException();
		}
		GlRenderer.method1585();
		GlRenderer.setTextureId(mask.textureId);
		GlRenderer.setTextureCombineRgbMode(1);
		GlRenderer.setTextureCombineAlphaMode(0);
		@Pc(22) float x0f = (float) x0 + 0.3F;
		@Pc(27) float x1f = (float) x1 + 0.3F;
		@Pc(35) float y0f = (float) GlRenderer.canvasHeight - (float) y0 - 0.3F;
		@Pc(43) float y1f = (float) GlRenderer.canvasHeight - (float) y1 - 0.3F;
		@Pc(45) GL gl = GlRenderer.gl;
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
		gl.glBegin(GL.GL_LINE_LOOP);
		gl.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color, alpha > 255 ? -1 : (byte) alpha);
		gl.glTexCoord2f((x0f - (float) clipX) / (float) mask.powerOfTwoWidth, ((float) GlRenderer.canvasHeight - y0f - (float) clipY) / (float) mask.powerOfTwoHeight);
		gl.glVertex2f(x0f, y0f);
		gl.glTexCoord2f((x1f - (float) clipX) / (float) mask.powerOfTwoWidth, ((float) GlRenderer.canvasHeight - y1f - (float) clipY) / (float) mask.powerOfTwoHeight);
		gl.glVertex2f(x1f, y1f);
		gl.glEnd();
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([IIIII)V")
	public static void drawPixels(@OriginalArg(0) int[] pixels, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int width, @OriginalArg(4) int height) {
		GlRenderer.method1585();
		@Pc(2) GL gl = GlRenderer.gl;
		gl.glRasterPos2i(x, GlRenderer.canvasHeight - y - height);
		gl.glDisable(GL.GL_BLEND);
		gl.glDisable(GL.GL_ALPHA_TEST);
		gl.glPixelZoom((float) GameShell.canvasScale, (float) GameShell.canvasScale);
		gl.glDrawPixels(width, height, GL.GL_BGRA, GlRenderer.bigEndian ? GL.GL_UNSIGNED_INT_8_8_8_8_REV : GL.GL_UNSIGNED_BYTE, IntBuffer.wrap(pixels));
		gl.glPixelZoom(1, 1);
		gl.glEnable(GL.GL_ALPHA_TEST);
		gl.glEnable(GL.GL_BLEND);
	}
}

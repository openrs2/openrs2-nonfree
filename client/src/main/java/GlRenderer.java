import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Locale;
import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class GlRenderer {
	@OriginalMember(owner = "client!gi", name = "e", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL gl;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext context;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable drawable;

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "Z")
	public static boolean enabled = false;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
	public static int canvasWidth;

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
	public static int canvasHeight;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "[F")
	private static final float[] matrix = new float[16];

	@OriginalMember(owner = "client!gi", name = "S", descriptor = "F")
	public static final float aFloat49 = 0.09765625F;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public static int anInt2075;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "Z")
	public static boolean bigEndian;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "Z")
	public static boolean arbTextureRectangleSupported;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "Z")
	public static boolean arbTextureCubeMapSupported;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	private static int maxTextureImageUnits;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	public static int anInt2078;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "Ljava/lang/String;")
	private static String renderer;

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "Ljava/lang/String;")
	private static String vendor;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "Z")
	public static boolean aBoolean129;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	public static int anInt2079;

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "Z")
	public static boolean arbMultisampleSupported;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "Z")
	public static boolean arbFragmentShaderSupported;

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
	public static int maxTextureUnits;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	public static int anInt2082;

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "Z")
	public static boolean arbFboSupported;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "Z")
	public static boolean arbVboSupported;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "Z")
	public static boolean extTexture3dSupported;

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
	private static int version;

	@OriginalMember(owner = "client!gi", name = "K", descriptor = "Z")
	public static boolean aBoolean139;

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
	public static int anInt2086;

	@OriginalMember(owner = "client!gi", name = "O", descriptor = "Z")
	public static boolean arbTextureFloatSupported;

	@OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
	public static int anInt2088;

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "Z")
	public static boolean arbVertexProgramSupported;

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
	public static int anInt2089;

	@OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
	private static int maxTextureCoords;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	private static int textureCombineRgbMode = 0;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public static int anInt2074 = -1;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Z")
	private static boolean depthTestEnabled = true;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
	public static int anInt2076 = -1;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "Z")
	public static boolean aBoolean132 = false;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "Z")
	private static boolean lightingEnabled = true;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "F")
	public static float aFloat46 = 0.0F;

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "F")
	public static float aFloat48 = 0.0F;

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "Z")
	public static boolean normalArrayEnabled = true;

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
	public static int anInt2085 = 0;

	@OriginalMember(owner = "client!gi", name = "N", descriptor = "Z")
	public static boolean textureMatrixModified = false;

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
	public static int textureId = -1;

	@OriginalMember(owner = "client!gi", name = "R", descriptor = "Z")
	private static boolean fogEnabled = true;

	@OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
	private static int textureCombineAlphaMode = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method1582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glLoadIdentity();
		method1604((float) local7 * aFloat49, (float) local17 * aFloat49, (float) -local35 * aFloat49, (float) -local25 * aFloat49, 50.0F, 3584.0F);
		method1583(arg0, canvasHeight - arg1 - arg3, arg2, arg3);
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			gl.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			gl.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean132 = false;
		Static7.anInt5437 = local7;
		Static4.anInt3123 = local17;
		Static7.anInt6030 = local25;
		Static1.anInt403 = local35;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
	public static void method1583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt2082 = arg0;
		anInt2079 = arg1;
		anInt2088 = arg2;
		anInt2089 = arg3;
		method1586();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
	public static void method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt2086 = arg0;
		anInt2078 = arg1;
		method1586();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
	public static void method1585() {
		MaterialManager.setMaterial(0, 0);
		method1601();
		setTextureId(-1);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "()V")
	private static void method1586() {
		gl.glViewport(anInt2082 + anInt2086, anInt2079 + anInt2078, anInt2088, anInt2089);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)V")
	public static void setCanvasSize(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		GlRenderer.canvasWidth = width;
		GlRenderer.canvasHeight = height;
		aBoolean132 = false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
	public static void setDepthTestEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == depthTestEnabled) {
			return;
		}
		if (enabled) {
			gl.glEnable(GL.GL_DEPTH_TEST);
		} else {
			gl.glDisable(GL.GL_DEPTH_TEST);
		}
		depthTestEnabled = enabled;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "()V")
	public static void disableDepthMask() {
		gl.glDepthMask(false);
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "()V")
	public static void method1590() {
		MaterialManager.setMaterial(0, 0);
		method1601();
		setTextureCombineRgbMode(0);
		setTextureCombineAlphaMode(0);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "()V")
	public static void enableDepthMask() {
		gl.glDepthMask(true);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
	public static void setNormalArrayEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == normalArrayEnabled) {
			return;
		}
		if (enabled) {
			gl.glEnableClientState(GL.GL_NORMAL_ARRAY);
		} else {
			gl.glDisableClientState(GL.GL_NORMAL_ARRAY);
		}
		normalArrayEnabled = enabled;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(Z)V")
	public static void setFogEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == fogEnabled) {
			return;
		}
		if (enabled) {
			gl.glEnable(GL.GL_FOG);
		} else {
			gl.glDisable(GL.GL_FOG);
		}
		fogEnabled = enabled;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	public static int init(@OriginalArg(0) Canvas canvas, @OriginalArg(1) int numSamples, @OriginalArg(2) GLContext context) {
		try {
			if (!canvas.isDisplayable()) {
				return -1;
			}
			@Pc(8) GLCapabilities capabilities = new GLCapabilities();
			if (numSamples > 0) {
				capabilities.setSampleBuffers(true);
				capabilities.setNumSamples(numSamples);
			}
			@Pc(18) GLDrawableFactory factory = GLDrawableFactory.getFactory();
			drawable = factory.getGLDrawable(canvas, capabilities, null);
			drawable.setRealized(true);
			@Pc(29) int makeCurrentAttempts = 0;
			while (true) {
				GlRenderer.context = drawable.createContext(context);
				try {
					@Pc(36) int result = GlRenderer.context.makeCurrent();
					if (result != 0) {
						break;
					}
				} catch (@Pc(41) Exception ex) {
				}
				if (makeCurrentAttempts++ > 5) {
					return -2;
				}
				ThreadUtils.sleep(1000L);
			}
			gl = GlRenderer.context.getGL();
			enabled = true;
			canvasWidth = canvas.getSize().width;
			canvasHeight = canvas.getSize().height;
			@Pc(66) int result = checkContext();
			if (result != 0) {
				quit();
				return result;
			}
			method1619();
			method1624();
			gl.glClear(GL.GL_COLOR_BUFFER_BIT);
			@Pc(78) int swapBuffersAttempts = 0;
			while (true) {
				try {
					drawable.swapBuffers();
					break;
				} catch (@Pc(82) Exception ex) {
					if (swapBuffersAttempts++ > 5) {
						quit();
						return -3;
					}
					ThreadUtils.sleep(100L);
				}
			}
			gl.glClear(GL.GL_COLOR_BUFFER_BIT);
			return 0;
		} catch (@Pc(99) Throwable ex) {
			quit();
			return -5;
		}
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "()V")
	public static void resetTextureMatrix() {
		if (textureMatrixModified) {
			gl.glMatrixMode(GL.GL_TEXTURE);
			gl.glLoadIdentity();
			gl.glMatrixMode(GL.GL_MODELVIEW);
			textureMatrixModified = false;
		}
	}

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "()V")
	public static void method1596() {
		MaterialManager.setMaterial(0, 0);
		method1601();
		setTextureCombineRgbMode(1);
		setTextureCombineAlphaMode(1);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public static void setTextureCombineRgbMode(@OriginalArg(0) int mode) {
		if (mode == textureCombineRgbMode) {
			return;
		}
		if (mode == 0) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		}
		if (mode == 1) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
		}
		if (mode == 2) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD);
		}
		if (mode == 3) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_SUBTRACT);
		}
		if (mode == 4) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD_SIGNED);
		}
		if (mode == 5) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
		}
		textureCombineRgbMode = mode;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)V")
	public static void method1598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = canvasWidth - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = canvasHeight - arg1;
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		gl.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method1583(0, 0, canvasWidth, canvasHeight);
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean132 = false;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IIII)V")
	public static void method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method1582(0, 0, canvasWidth, canvasHeight, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
	public static void setTextureId(@OriginalArg(0) int id) {
		if (id == textureId) {
			return;
		}
		if (id == -1) {
			gl.glDisable(GL.GL_TEXTURE_2D);
		} else {
			if (textureId == -1) {
				gl.glEnable(GL.GL_TEXTURE_2D);
			}
			gl.glBindTexture(GL.GL_TEXTURE_2D, id);
		}
		textureId = id;
	}

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "()V")
	public static void method1601() {
		if (aBoolean132) {
			return;
		}
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glLoadIdentity();
		gl.glOrtho(0.0D, (double) canvasWidth, 0.0D, (double) canvasHeight, -1.0D, 1.0D);
		method1583(0, 0, canvasWidth, canvasHeight);
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glLoadIdentity();
		aBoolean132 = true;
	}

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "()V")
	public static void clearDepthBuffer() {
		gl.glClear(GL.GL_DEPTH_BUFFER_BIT);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFFFFF)V")
	public static void method1604(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		matrix[0] = local3 / (arg1 - arg0);
		matrix[1] = 0.0F;
		matrix[2] = 0.0F;
		matrix[3] = 0.0F;
		matrix[4] = 0.0F;
		matrix[5] = local3 / (arg3 - arg2);
		matrix[6] = 0.0F;
		matrix[7] = 0.0F;
		matrix[8] = (arg1 + arg0) / (arg1 - arg0);
		matrix[9] = (arg3 + arg2) / (arg3 - arg2);
		matrix[10] = aFloat45 = -(arg5 + arg4) / (arg5 - arg4);
		matrix[11] = -1.0F;
		matrix[12] = 0.0F;
		matrix[13] = 0.0F;
		matrix[14] = aFloat47 = -(local3 * arg5) / (arg5 - arg4);
		matrix[15] = 0.0F;
		gl.glLoadMatrixf(matrix, 0);
		aFloat48 = 0.0F;
		aFloat46 = 0.0F;
	}

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "()V")
	public static void quit() {
		if (gl != null) {
			try {
				Static13.method882();
				MaterialManager.quit();
			} catch (@Pc(6) Throwable ex) {
			}
			gl = null;
		}
		if (context != null) {
			GlCleaner.clear();
			try {
				if (GLContext.getCurrent() == context) {
					context.release();
				}
			} catch (@Pc(18) Throwable ex) {
			}
			try {
				context.destroy();
			} catch (@Pc(22) Throwable ex) {
			}
			context = null;
		}
		if (drawable != null) {
			try {
				drawable.setRealized(false);
			} catch (@Pc(31) Throwable ex) {
			}
			drawable = null;
		}
		LightingManager.method3123();
		enabled = false;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(IIII)V")
	public static void method1606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glLoadIdentity();
		gl.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glLoadIdentity();
		method1583(anInt2086, anInt2078, canvasWidth, canvasHeight);
		aBoolean132 = false;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	public static void setTextureCombineAlphaMode(@OriginalArg(0) int mode) {
		if (mode == textureCombineAlphaMode) {
			return;
		}
		if (mode == 0) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		}
		if (mode == 1) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
		}
		if (mode == 2) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_ADD);
		}
		textureCombineAlphaMode = mode;
	}

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "()V")
	public static void method1608() {
		@Pc(2) int[] local2 = new int[2];
		gl.glGetIntegerv(GL.GL_DRAW_BUFFER, local2, 0);
		gl.glGetIntegerv(GL.GL_READ_BUFFER, local2, 1);
		gl.glDrawBuffer(GL.GL_BACK_LEFT);
		gl.glReadBuffer(GL.GL_FRONT_LEFT);
		setTextureId(-1);
		gl.glPushAttrib(GL.GL_ENABLE_BIT);
		gl.glDisable(GL.GL_FOG);
		gl.glDisable(GL.GL_BLEND);
		gl.glDisable(GL.GL_DEPTH_TEST);
		gl.glDisable(GL.GL_ALPHA_TEST);
		gl.glRasterPos2i(0, 0);
		gl.glCopyPixels(0, 0, canvasWidth, canvasHeight, GL.GL_COLOR);
		gl.glPopAttrib();
		gl.glDrawBuffer(local2[0]);
		gl.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFF)V")
	public static void translateTextureMatrix(@OriginalArg(0) float x, @OriginalArg(1) float y, @OriginalArg(2) float z) {
		gl.glMatrixMode(GL.GL_TEXTURE);
		if (textureMatrixModified) {
			gl.glLoadIdentity();
		}
		gl.glTranslatef(x, y, z);
		gl.glMatrixMode(GL.GL_MODELVIEW);
		textureMatrixModified = true;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(Z)V")
	public static void setLightingEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == lightingEnabled) {
			return;
		}
		if (enabled) {
			gl.glEnable(GL.GL_LIGHTING);
		} else {
			gl.glDisable(GL.GL_LIGHTING);
		}
		lightingEnabled = enabled;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void createAndDestroyContext(@OriginalArg(0) Canvas canvas) {
		try {
			if (!canvas.isDisplayable()) {
				return;
			}
			@Pc(5) GLDrawableFactory factory = GLDrawableFactory.getFactory();
			@Pc(11) GLDrawable drawable = factory.getGLDrawable(canvas, null, null);
			drawable.setRealized(true);
			@Pc(18) GLContext context = drawable.createContext(null);
			context.makeCurrent();
			context.release();
			context.destroy();
			drawable.setRealized(false);
		} catch (@Pc(30) Throwable ex) {
		}
	}

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "()F")
	public static float method1612() {
		return aFloat46;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(F)V")
	public static void method1613(@OriginalArg(0) float arg0) {
		method1621(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "()I")
	public static int method1614() {
		if (arbFboSupported && (anInt2076 <= 0 || anInt2074 != GlCleaner.contextId)) {
			@Pc(9) int[] temp = new int[1];
			gl.glGenFramebuffersEXT(1, temp, 0);
			anInt2074 = GlCleaner.contextId;
			anInt2076 = temp[0];
		}
		return anInt2076;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
	public static void clearColorBuffer(@OriginalArg(0) int rgb) {
		gl.glClearColor((float) (rgb >> 16 & 0xFF) / 255.0F, (float) (rgb >> 8 & 0xFF) / 255.0F, (float) (rgb & 0xFF) / 255.0F, 0.0F);
		gl.glClear(GL.GL_COLOR_BUFFER_BIT);
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "()I")
	public static int checkContext() {
		@Pc(1) int result = 0;
		vendor = gl.glGetString(GL.GL_VENDOR);
		renderer = gl.glGetString(GL.GL_RENDERER);
		@Pc(12) String vendor = GlRenderer.vendor.toLowerCase();
		if (vendor.indexOf("microsoft") != -1) {
			result = 1;
		}
		if (vendor.indexOf("brian paul") != -1 || vendor.indexOf("mesa") != -1) {
			result |= 1;
		}
		@Pc(39) String version = gl.glGetString(GL.GL_VERSION);
		@Pc(43) String[] versionParts = version.split("[. ]");
		if (versionParts.length >= 2) {
			try {
				@Pc(52) int major = Integer.parseInt(versionParts[0]);
				@Pc(57) int minor = Integer.parseInt(versionParts[1]);
				GlRenderer.version = major * 10 + minor;
			} catch (@Pc(65) NumberFormatException ex) {
				result |= 4;
			}
		} else {
			result |= 4;
		}
		if (GlRenderer.version < 12) {
			result |= 2;
		}
		if (!gl.isExtensionAvailable("GL_ARB_multitexture")) {
			result |= 8;
		}
		if (!gl.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			result |= 32;
		}
		@Pc(100) int[] data = new int[1];
		gl.glGetIntegerv(GL.GL_MAX_TEXTURE_UNITS, data, 0);
		maxTextureUnits = data[0];
		gl.glGetIntegerv(GL.GL_MAX_TEXTURE_COORDS, data, 0);
		maxTextureCoords = data[0];
		gl.glGetIntegerv(GL.GL_MAX_TEXTURE_IMAGE_UNITS, data, 0);
		maxTextureImageUnits = data[0];
		if (maxTextureUnits < 2 || maxTextureCoords < 2 || maxTextureImageUnits < 2) {
			result |= 16;
		}
		if (result != 0) {
			return result;
		}
		bigEndian = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		arbVboSupported = gl.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		arbMultisampleSupported = gl.isExtensionAvailable("GL_ARB_multisample");
		arbTextureCubeMapSupported = gl.isExtensionAvailable("GL_ARB_texture_cube_map");
		arbVertexProgramSupported = gl.isExtensionAvailable("GL_ARB_vertex_program");
		arbFboSupported = gl.isExtensionAvailable("GL_EXT_framebuffer_object");
		gl.isExtensionAvailable("GL_ARB_vertex_shader");
		arbFragmentShaderSupported = gl.isExtensionAvailable("GL_ARB_fragment_shader");
		extTexture3dSupported = gl.isExtensionAvailable("GL_EXT_texture3D");
		arbTextureRectangleSupported = gl.isExtensionAvailable("GL_ARB_texture_rectangle");
		arbTextureFloatSupported = gl.isExtensionAvailable("GL_ARB_texture_float");
		aBoolean139 = true;
		@Pc(197) String renderer = GlRenderer.renderer.toLowerCase(Locale.ENGLISH);
		if (renderer.indexOf("radeon") != -1) {
			@Pc(204) int v = 0;
			@Pc(206) boolean x = false;
			@Pc(214) String[] rendererParts = StringUtils.split(renderer.replace('/', ' '), ' ');
			for (@Pc(216) int i = 0; i < rendererParts.length; i++) {
				@Pc(224) String part = rendererParts[i];
				if (part.length() >= 4) {
					if (part.charAt(0) == 'x' && StringUtils.isInt(part.substring(1, 3))) {
						x = true;
						break;
					}
					if (StringUtils.isInt(part.substring(0, 4))) {
						v = StringUtils.parseInt(part.substring(0, 4));
						break;
					}
				}
			}
			if (v >= 7000 && v <= 7999) {
				arbVboSupported = false;
			}
			if (v >= 7000 && v <= 9250) {
				extTexture3dSupported = false;
			}
			if (v >= 9200 || x) {
				arbTextureFloatSupported = false;
			}
			aBoolean129 = arbVboSupported;
			aBoolean139 = false;
		}
		if (arbVboSupported) {
			try {
				@Pc(292) int[] temp = new int[1];
				gl.glGenBuffersARB(1, temp, 0);
			} catch (@Pc(299) Throwable ex) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
	public static void clearColorAndDepthBuffers(@OriginalArg(0) int rgb) {
		gl.glClearColor((float) (rgb >> 16 & 0xFF) / 255.0F, (float) (rgb >> 8 & 0xFF) / 255.0F, (float) (rgb & 0xFF) / 255.0F, 0.0F);
		gl.glClear(GL.GL_DEPTH_BUFFER_BIT | GL.GL_COLOR_BUFFER_BIT);
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "()V")
	public static void method1618() {
		if (Preferences.highDetailLighting) {
			setLightingEnabled(true);
			setNormalArrayEnabled(true);
		} else {
			setLightingEnabled(false);
			setNormalArrayEnabled(false);
		}
	}

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "()V")
	public static void method1619() {
		@Pc(2) int[] local2 = new int[1];
		gl.glGenTextures(1, local2, 0);
		anInt2075 = local2[0];
		gl.glBindTexture(GL.GL_TEXTURE_2D, anInt2075);
		gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, 4, 1, 1, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, IntBuffer.wrap(new int[] { -1 }));
		LightingManager.method3120();
		MaterialManager.init();
		Static12.method872();
	}

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "()F")
	public static float method1620() {
		return aFloat48;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FF)V")
	public static void method1621(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean132 || arg0 == aFloat48 && arg1 == aFloat46) {
			return;
		}
		aFloat48 = arg0;
		aFloat46 = arg1;
		if (arg1 == 0.0F) {
			matrix[10] = aFloat45;
			matrix[14] = aFloat47;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat47 * (1.0F - local25) * (1.0F - local25) / arg1;
			matrix[10] = aFloat45 + local42;
			matrix[14] = aFloat47 * local29;
		}
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glLoadMatrixf(matrix, 0);
		gl.glMatrixMode(GL.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "()V")
	public static void swapBuffers() {
		try {
			drawable.swapBuffers();
		} catch (@Pc(3) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int init(@OriginalArg(0) Canvas canvas, @OriginalArg(1) int numSamples) {
		return init(canvas, numSamples, null);
	}

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "()V")
	public static void method1624() {
		aBoolean132 = false;
		gl.glDisable(GL.GL_TEXTURE_2D);
		textureId = -1;
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_COMBINE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		textureCombineRgbMode = 0;
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		textureCombineAlphaMode = 0;
		gl.glEnable(GL.GL_LIGHTING);
		gl.glEnable(GL.GL_FOG);
		gl.glEnable(GL.GL_DEPTH_TEST);
		lightingEnabled = true;
		depthTestEnabled = true;
		fogEnabled = true;
		Static32.method3879();
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_COMBINE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		gl.setSwapInterval(0);
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		gl.glShadeModel(GL.GL_SMOOTH);
		gl.glClearDepth(1.0F);
		gl.glDepthFunc(GL.GL_LEQUAL);
		enableDepthMask();
		gl.glMatrixMode(GL.GL_TEXTURE);
		gl.glLoadIdentity();
		gl.glPolygonMode(GL.GL_FRONT, GL.GL_FILL);
		gl.glEnable(GL.GL_CULL_FACE);
		gl.glCullFace(GL.GL_BACK);
		gl.glEnable(GL.GL_BLEND);
		gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
		gl.glEnable(GL.GL_ALPHA_TEST);
		gl.glAlphaFunc(GL.GL_GREATER, 0.0F);
		gl.glEnableClientState(GL.GL_VERTEX_ARRAY);
		gl.glEnableClientState(GL.GL_NORMAL_ARRAY);
		normalArrayEnabled = true;
		gl.glEnableClientState(GL.GL_COLOR_ARRAY);
		gl.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glLoadIdentity();
		Static25.method2779();
		LightingManager.method3118();
	}

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "()V")
	public static void method1625() {
		MaterialManager.setMaterial(0, 0);
		method1601();
		setTextureCombineRgbMode(0);
		setTextureCombineAlphaMode(0);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}
}

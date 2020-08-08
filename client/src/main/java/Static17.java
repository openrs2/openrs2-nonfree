import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Locale;
import javax.media.opengl.GL;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "()V")
	public static void method1596() {
		Static24.method2652(0, 0);
		method1601();
		method1597(1);
		method1607(1);
		method1610(false);
		Static16.method1588(false);
		Static16.method1593(false);
		Static16.method1595();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public static void method1597(@OriginalArg(0) int arg0) {
		if (arg0 == Static3.anInt2073) {
			return;
		}
		if (arg0 == 0) {
			Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		}
		if (arg0 == 1) {
			Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
		}
		if (arg0 == 2) {
			Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD);
		}
		if (arg0 == 3) {
			Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_SUBTRACT);
		}
		if (arg0 == 4) {
			Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD_SIGNED);
		}
		if (arg0 == 5) {
			Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
		}
		Static3.anInt2073 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)V")
	public static void method1598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = Static3.anInt2080 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = Static3.anInt2083 - arg1;
		Static3.aGL1.glMatrixMode(GL.GL_PROJECTION);
		Static3.aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		Static3.aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		Static16.method1583(0, 0, Static3.anInt2080, Static3.anInt2083);
		Static3.aGL1.glMatrixMode(GL.GL_MODELVIEW);
		Static3.aGL1.glLoadIdentity();
		Static3.aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		Static3.aBoolean132 = false;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IIII)V")
	public static void method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static16.method1582(0, 0, Static3.anInt2080, Static3.anInt2083, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
	public static void method1600(@OriginalArg(0) int arg0) {
		if (arg0 == Static3.anInt2087) {
			return;
		}
		if (arg0 == -1) {
			Static3.aGL1.glDisable(GL.GL_TEXTURE_2D);
		} else {
			if (Static3.anInt2087 == -1) {
				Static3.aGL1.glEnable(GL.GL_TEXTURE_2D);
			}
			Static3.aGL1.glBindTexture(GL.GL_TEXTURE_2D, arg0);
		}
		Static3.anInt2087 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "()V")
	public static void method1601() {
		if (Static3.aBoolean132) {
			return;
		}
		Static3.aGL1.glMatrixMode(GL.GL_PROJECTION);
		Static3.aGL1.glLoadIdentity();
		Static3.aGL1.glOrtho(0.0D, (double) Static3.anInt2080, 0.0D, (double) Static3.anInt2083, -1.0D, 1.0D);
		Static16.method1583(0, 0, Static3.anInt2080, Static3.anInt2083);
		Static3.aGL1.glMatrixMode(GL.GL_MODELVIEW);
		Static3.aGL1.glLoadIdentity();
		Static3.aBoolean132 = true;
	}

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "()V")
	public static void method1603() {
		Static3.aGL1.glClear(GL.GL_DEPTH_BUFFER_BIT);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFFFFF)V")
	public static void method1604(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		Static3.aFloatArray20[0] = local3 / (arg1 - arg0);
		Static3.aFloatArray20[1] = 0.0F;
		Static3.aFloatArray20[2] = 0.0F;
		Static3.aFloatArray20[3] = 0.0F;
		Static3.aFloatArray20[4] = 0.0F;
		Static3.aFloatArray20[5] = local3 / (arg3 - arg2);
		Static3.aFloatArray20[6] = 0.0F;
		Static3.aFloatArray20[7] = 0.0F;
		Static3.aFloatArray20[8] = (arg1 + arg0) / (arg1 - arg0);
		Static3.aFloatArray20[9] = (arg3 + arg2) / (arg3 - arg2);
		Static3.aFloatArray20[10] = Static3.aFloat45 = -(arg5 + arg4) / (arg5 - arg4);
		Static3.aFloatArray20[11] = -1.0F;
		Static3.aFloatArray20[12] = 0.0F;
		Static3.aFloatArray20[13] = 0.0F;
		Static3.aFloatArray20[14] = Static3.aFloat47 = -(local3 * arg5) / (arg5 - arg4);
		Static3.aFloatArray20[15] = 0.0F;
		Static3.aGL1.glLoadMatrixf(Static3.aFloatArray20, 0);
		Static3.aFloat48 = 0.0F;
		Static3.aFloat46 = 0.0F;
	}

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "()V")
	public static void method1605() {
		if (Static3.aGL1 != null) {
			try {
				Static13.method882();
				Static8.method3();
			} catch (@Pc(6) Throwable local6) {
			}
			Static3.aGL1 = null;
		}
		if (Static3.aGLContext1 != null) {
			Static24.method2716();
			try {
				if (GLContext.getCurrent() == Static3.aGLContext1) {
					Static3.aGLContext1.release();
				}
			} catch (@Pc(18) Throwable local18) {
			}
			try {
				Static3.aGLContext1.destroy();
			} catch (@Pc(22) Throwable local22) {
			}
			Static3.aGLContext1 = null;
		}
		if (Static3.aGLDrawable1 != null) {
			try {
				Static3.aGLDrawable1.setRealized(false);
			} catch (@Pc(31) Throwable local31) {
			}
			Static3.aGLDrawable1 = null;
		}
		Static27.method3123();
		Static3.aBoolean138 = false;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(IIII)V")
	public static void method1606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static3.aGL1.glMatrixMode(GL.GL_PROJECTION);
		Static3.aGL1.glLoadIdentity();
		Static3.aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		Static3.aGL1.glMatrixMode(GL.GL_MODELVIEW);
		Static3.aGL1.glLoadIdentity();
		Static16.method1583(Static3.anInt2086, Static3.anInt2078, Static3.anInt2080, Static3.anInt2083);
		Static3.aBoolean132 = false;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	public static void method1607(@OriginalArg(0) int arg0) {
		if (arg0 == Static3.anInt2091) {
			return;
		}
		if (arg0 == 0) {
			Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		}
		if (arg0 == 1) {
			Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
		}
		if (arg0 == 2) {
			Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_ADD);
		}
		Static3.anInt2091 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "()V")
	public static void method1608() {
		@Pc(2) int[] local2 = new int[2];
		Static3.aGL1.glGetIntegerv(GL.GL_DRAW_BUFFER, local2, 0);
		Static3.aGL1.glGetIntegerv(GL.GL_READ_BUFFER, local2, 1);
		Static3.aGL1.glDrawBuffer(GL.GL_BACK_LEFT);
		Static3.aGL1.glReadBuffer(GL.GL_FRONT_LEFT);
		method1600(-1);
		Static3.aGL1.glPushAttrib(GL.GL_ENABLE_BIT);
		Static3.aGL1.glDisable(GL.GL_FOG);
		Static3.aGL1.glDisable(GL.GL_BLEND);
		Static3.aGL1.glDisable(GL.GL_DEPTH_TEST);
		Static3.aGL1.glDisable(GL.GL_ALPHA_TEST);
		Static3.aGL1.glRasterPos2i(0, 0);
		Static3.aGL1.glCopyPixels(0, 0, Static3.anInt2080, Static3.anInt2083, GL.GL_COLOR);
		Static3.aGL1.glPopAttrib();
		Static3.aGL1.glDrawBuffer(local2[0]);
		Static3.aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFF)V")
	public static void method1609(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static3.aGL1.glMatrixMode(GL.GL_TEXTURE);
		if (Static3.aBoolean140) {
			Static3.aGL1.glLoadIdentity();
		}
		Static3.aGL1.glTranslatef(arg0, arg1, arg2);
		Static3.aGL1.glMatrixMode(GL.GL_MODELVIEW);
		Static3.aBoolean140 = true;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(Z)V")
	public static void method1610(@OriginalArg(0) boolean arg0) {
		if (arg0 == Static3.aBoolean133) {
			return;
		}
		if (arg0) {
			Static3.aGL1.glEnable(GL.GL_LIGHTING);
		} else {
			Static3.aGL1.glDisable(GL.GL_LIGHTING);
		}
		Static3.aBoolean133 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method1611(@OriginalArg(0) Canvas arg0) {
		try {
			if (!arg0.isDisplayable()) {
				return;
			}
			@Pc(5) GLDrawableFactory local5 = GLDrawableFactory.getFactory();
			@Pc(11) GLDrawable local11 = local5.getGLDrawable(arg0, null, null);
			local11.setRealized(true);
			@Pc(18) GLContext local18 = local11.createContext(null);
			local18.makeCurrent();
			local18.release();
			local18.destroy();
			local11.setRealized(false);
		} catch (@Pc(30) Throwable local30) {
		}
	}

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "()F")
	public static float method1612() {
		return Static3.aFloat46;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(F)V")
	public static void method1613(@OriginalArg(0) float arg0) {
		method1621(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "()I")
	public static int method1614() {
		if (Static3.aBoolean134 && (Static3.anInt2076 <= 0 || Static3.anInt2074 != Static4.anInt3332)) {
			@Pc(9) int[] local9 = new int[1];
			Static3.aGL1.glGenFramebuffersEXT(1, local9, 0);
			Static3.anInt2074 = Static4.anInt3332;
			Static3.anInt2076 = local9[0];
		}
		return Static3.anInt2076;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
	public static void method1615(@OriginalArg(0) int arg0) {
		Static3.aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		Static3.aGL1.glClear(GL.GL_COLOR_BUFFER_BIT);
		Static3.aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "()I")
	public static int method1616() {
		@Pc(1) int local1 = 0;
		Static3.aString117 = Static3.aGL1.glGetString(GL.GL_VENDOR);
		Static3.aString116 = Static3.aGL1.glGetString(GL.GL_RENDERER);
		@Pc(12) String local12 = Static3.aString117.toLowerCase();
		if (local12.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local12.indexOf("brian paul") != -1 || local12.indexOf("mesa") != -1) {
			local1 |= 1;
		}
		@Pc(39) String local39 = Static3.aGL1.glGetString(GL.GL_VERSION);
		@Pc(43) String[] local43 = local39.split("[. ]");
		if (local43.length >= 2) {
			try {
				@Pc(52) int local52 = Integer.parseInt(local43[0]);
				@Pc(57) int local57 = Integer.parseInt(local43[1]);
				Static3.anInt2084 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 4;
			}
		} else {
			local1 |= 4;
		}
		if (Static3.anInt2084 < 12) {
			local1 |= 2;
		}
		if (!Static3.aGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local1 |= 8;
		}
		if (!Static3.aGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local1 |= 32;
		}
		@Pc(100) int[] local100 = new int[1];
		Static3.aGL1.glGetIntegerv(GL.GL_MAX_TEXTURE_UNITS, local100, 0);
		Static3.anInt2081 = local100[0];
		Static3.aGL1.glGetIntegerv(GL.GL_MAX_TEXTURE_COORDS, local100, 0);
		Static3.anInt2090 = local100[0];
		Static3.aGL1.glGetIntegerv(GL.GL_MAX_TEXTURE_IMAGE_UNITS, local100, 0);
		Static3.anInt2077 = local100[0];
		if (Static3.anInt2081 < 2 || Static3.anInt2090 < 2 || Static3.anInt2077 < 2) {
			local1 |= 16;
		}
		if (local1 != 0) {
			return local1;
		}
		Static3.aBoolean126 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		Static3.aBoolean135 = Static3.aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		Static3.aBoolean130 = Static3.aGL1.isExtensionAvailable("GL_ARB_multisample");
		Static3.aBoolean128 = Static3.aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		Static3.aBoolean143 = Static3.aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		Static3.aBoolean134 = Static3.aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		Static3.aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		Static3.aBoolean131 = Static3.aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		Static3.aBoolean137 = Static3.aGL1.isExtensionAvailable("GL_EXT_texture3D");
		Static3.aBoolean127 = Static3.aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		Static3.aBoolean141 = Static3.aGL1.isExtensionAvailable("GL_ARB_texture_float");
		Static3.aBoolean139 = true;
		@Pc(197) String local197 = Static3.aString116.toLowerCase(Locale.ENGLISH);
		if (local197.indexOf("radeon") != -1) {
			@Pc(204) int local204 = 0;
			@Pc(206) boolean local206 = false;
			@Pc(214) String[] local214 = Static12.method721(' ', local197.replace('/', ' '));
			for (@Pc(216) int local216 = 0; local216 < local214.length; local216++) {
				@Pc(224) String local224 = local214[local216];
				if (local224.length() >= 4) {
					if (local224.charAt(0) == 'x' && Static29.method3473(local224.substring(1, 3))) {
						local206 = true;
						break;
					}
					if (Static29.method3473(local224.substring(0, 4))) {
						local204 = Static12.method737(local224.substring(0, 4));
						break;
					}
				}
			}
			if (local204 >= 7000 && local204 <= 7999) {
				Static3.aBoolean135 = false;
			}
			if (local204 >= 7000 && local204 <= 9250) {
				Static3.aBoolean137 = false;
			}
			if (local204 >= 9200 || local206) {
				Static3.aBoolean141 = false;
			}
			Static3.aBoolean129 = Static3.aBoolean135;
			Static3.aBoolean139 = false;
		}
		if (Static3.aBoolean135) {
			try {
				@Pc(292) int[] local292 = new int[1];
				Static3.aGL1.glGenBuffersARB(1, local292, 0);
			} catch (@Pc(299) Throwable local299) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
	public static void method1617(@OriginalArg(0) int arg0) {
		Static3.aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		Static3.aGL1.glClear(GL.GL_DEPTH_BUFFER_BIT | GL.GL_COLOR_BUFFER_BIT);
		Static3.aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "()V")
	public static void method1618() {
		if (Static2.aBoolean66) {
			method1610(true);
			Static16.method1592(true);
		} else {
			method1610(false);
			Static16.method1592(false);
		}
	}

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "()V")
	public static void method1619() {
		@Pc(2) int[] local2 = new int[1];
		Static3.aGL1.glGenTextures(1, local2, 0);
		Static3.anInt2075 = local2[0];
		Static3.aGL1.glBindTexture(GL.GL_TEXTURE_2D, Static3.anInt2075);
		Static3.aGL1.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, 4, 1, 1, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, IntBuffer.wrap(new int[] { -1 }));
		Static27.method3120();
		Static13.method968();
		Static12.method872();
	}

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "()F")
	public static float method1620() {
		return Static3.aFloat48;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FF)V")
	public static void method1621(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (Static3.aBoolean132 || arg0 == Static3.aFloat48 && arg1 == Static3.aFloat46) {
			return;
		}
		Static3.aFloat48 = arg0;
		Static3.aFloat46 = arg1;
		if (arg1 == 0.0F) {
			Static3.aFloatArray20[10] = Static3.aFloat45;
			Static3.aFloatArray20[14] = Static3.aFloat47;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -Static3.aFloat47 * (1.0F - local25) * (1.0F - local25) / arg1;
			Static3.aFloatArray20[10] = Static3.aFloat45 + local42;
			Static3.aFloatArray20[14] = Static3.aFloat47 * local29;
		}
		Static3.aGL1.glMatrixMode(GL.GL_PROJECTION);
		Static3.aGL1.glLoadMatrixf(Static3.aFloatArray20, 0);
		Static3.aGL1.glMatrixMode(GL.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "()V")
	public static void method1622() {
		try {
			Static3.aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method1623(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return Static16.method1594(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "()V")
	public static void method1624() {
		Static3.aBoolean132 = false;
		Static3.aGL1.glDisable(GL.GL_TEXTURE_2D);
		Static3.anInt2087 = -1;
		Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_COMBINE);
		Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		Static3.anInt2073 = 0;
		Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		Static3.anInt2091 = 0;
		Static3.aGL1.glEnable(GL.GL_LIGHTING);
		Static3.aGL1.glEnable(GL.GL_FOG);
		Static3.aGL1.glEnable(GL.GL_DEPTH_TEST);
		Static3.aBoolean133 = true;
		Static3.aBoolean125 = true;
		Static3.aBoolean142 = true;
		Static32.method3879();
		Static3.aGL1.glActiveTexture(GL.GL_TEXTURE1);
		Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_COMBINE);
		Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		Static3.aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		Static3.aGL1.glActiveTexture(GL.GL_TEXTURE0);
		Static3.aGL1.setSwapInterval(0);
		Static3.aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		Static3.aGL1.glShadeModel(GL.GL_SMOOTH);
		Static3.aGL1.glClearDepth(1.0F);
		Static3.aGL1.glDepthFunc(GL.GL_LEQUAL);
		Static16.method1591();
		Static3.aGL1.glMatrixMode(GL.GL_TEXTURE);
		Static3.aGL1.glLoadIdentity();
		Static3.aGL1.glPolygonMode(GL.GL_FRONT, GL.GL_FILL);
		Static3.aGL1.glEnable(GL.GL_CULL_FACE);
		Static3.aGL1.glCullFace(GL.GL_BACK);
		Static3.aGL1.glEnable(GL.GL_BLEND);
		Static3.aGL1.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
		Static3.aGL1.glEnable(GL.GL_ALPHA_TEST);
		Static3.aGL1.glAlphaFunc(GL.GL_GREATER, 0.0F);
		Static3.aGL1.glEnableClientState(GL.GL_VERTEX_ARRAY);
		Static3.aGL1.glEnableClientState(GL.GL_NORMAL_ARRAY);
		Static3.aBoolean136 = true;
		Static3.aGL1.glEnableClientState(GL.GL_COLOR_ARRAY);
		Static3.aGL1.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		Static3.aGL1.glMatrixMode(GL.GL_MODELVIEW);
		Static3.aGL1.glLoadIdentity();
		Static25.method2779();
		Static27.method3118();
	}

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "()V")
	public static void method1625() {
		Static24.method2652(0, 0);
		method1601();
		method1597(0);
		method1607(0);
		method1610(false);
		Static16.method1588(false);
		Static16.method1593(false);
		Static16.method1595();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
	private static void method1626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = Static3.anIntArray169[arg0];
		@Pc(17) int local17 = Static3.anIntArray169[arg0 + 1];
		@Pc(23) int local23 = Static3.anIntArray169[arg0 + 2];
		@Pc(29) int local29 = Static3.anIntArray169[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = Static3.anIntArray169[local33 + 1];
			if (local42 < local17) {
				Static3.anIntArray169[local7] = Static3.anIntArray169[local33];
				Static3.anIntArray169[local7 + 1] = local42;
				Static3.anIntArray169[local7 + 2] = Static3.anIntArray169[local33 + 2];
				Static3.anIntArray169[local7 + 3] = Static3.anIntArray169[local33 + 3];
				local7 += 4;
				Static3.anIntArray169[local33] = Static3.anIntArray169[local7];
				Static3.anIntArray169[local33 + 1] = Static3.anIntArray169[local7 + 1];
				Static3.anIntArray169[local33 + 2] = Static3.anIntArray169[local7 + 2];
				Static3.anIntArray169[local33 + 3] = Static3.anIntArray169[local7 + 3];
			}
		}
		Static3.anIntArray169[local7] = local11;
		Static3.anIntArray169[local7 + 1] = local17;
		Static3.anIntArray169[local7 + 2] = local23;
		Static3.anIntArray169[local7 + 3] = local29;
		method1626(arg0, local7);
		method1626(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[I[I)V")
	private static void method1627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method1634();
		while (method1631()) {
			@Pc(4) int local4 = Static3.anInt2093;
			@Pc(6) int local6 = Static3.anInt2092;
			@Pc(8) int local8 = Static3.anInt2098;
			if (arg2 != null) {
				@Pc(14) int local14 = local8 - Static6.anInt5183;
				if (local4 < arg2[local14] + Static6.anInt5185) {
					local4 = arg2[local14] + Static6.anInt5185;
				}
				if (local6 > arg2[local14] + arg3[local14] + Static6.anInt5185) {
					local6 = arg2[local14] + arg3[local14] + Static6.anInt5185;
				}
			}
			Static34.method4225(local4, local8, local6 - local4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([III)V")
	public static void method1628(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method1633(arg0, arg0.length, arg1, arg2, null, null);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([III[I[I)V")
	public static void method1630(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method1633(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()Z")
	private static boolean method1631() {
		@Pc(1) int local1 = Static3.anInt2095;
		@Pc(3) int local3 = Static3.anInt2097;
		@Pc(5) int local5 = Static3.anInt2098;
		while (local3 >= local1) {
			local5++;
			Static3.anInt2098 = local5;
			if (local5 >= Static6.anInt5187) {
				return false;
			}
			@Pc(18) int local18 = Static3.anInt2096;
			while (local1 < Static3.anInt2094) {
				@Pc(27) int local27 = Static3.anIntArray169[local1 + 1];
				if (local5 < local27) {
					break;
				}
				@Pc(35) int local35 = Static3.anIntArray169[local1];
				@Pc(41) int local41 = Static3.anIntArray169[local1 + 2];
				@Pc(47) int local47 = Static3.anIntArray169[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				Static3.anIntArray169[local1] = local63;
				Static3.anIntArray169[local1 + 2] = local57;
				local1 += 4;
			}
			for (@Pc(77) int local77 = local18; local77 < local1; local77 += 4) {
				@Pc(86) int local86 = Static3.anIntArray169[local77 + 3];
				if (local5 >= local86) {
					Static3.anIntArray169[local77] = Static3.anIntArray169[local18];
					Static3.anIntArray169[local77 + 1] = Static3.anIntArray169[local18 + 1];
					Static3.anIntArray169[local77 + 2] = Static3.anIntArray169[local18 + 2];
					Static3.anIntArray169[local77 + 3] = Static3.anIntArray169[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == Static3.anInt2094) {
				Static3.anInt2094 = 0;
				return false;
			}
			method1635(local18, local1);
			Static3.anInt2096 = local18;
			Static3.anInt2095 = local1;
			local3 = local18;
		}
		Static3.anInt2093 = Static3.anIntArray169[local3] >> 16;
		Static3.anInt2092 = Static3.anIntArray169[local3 + 4] >> 16;
		@Pc(160) int[] local160 = Static3.anIntArray169;
		local160[local3] += Static3.anIntArray169[local3 + 2];
		local160 = Static3.anIntArray169;
		local160[local3 + 4] += Static3.anIntArray169[local3 + 6];
		@Pc(184) int local184 = local3 + 8;
		Static3.anInt2097 = local184;
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "([III)V")
	private static void method1632(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static3.anInt2094 + (arg1 << 1);
		if (Static3.anIntArray169 == null || Static3.anIntArray169.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (@Pc(16) int local16 = 0; local16 < Static3.anInt2094; local16++) {
				local14[local16] = Static3.anIntArray169[local16];
			}
			Static3.anIntArray169 = local14;
		}
		@Pc(37) int local37 = arg1 - 2;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local39 + 1];
			if (local48 < local54) {
				Static3.anIntArray169[Static3.anInt2094++] = arg0[local37];
				Static3.anIntArray169[Static3.anInt2094++] = local48;
				Static3.anIntArray169[Static3.anInt2094++] = arg0[local39];
				Static3.anIntArray169[Static3.anInt2094++] = local54;
			} else if (local54 < local48) {
				Static3.anIntArray169[Static3.anInt2094++] = arg0[local39];
				Static3.anIntArray169[Static3.anInt2094++] = local54;
				Static3.anIntArray169[Static3.anInt2094++] = arg0[local37];
				Static3.anIntArray169[Static3.anInt2094++] = local48;
			}
			local37 = local39;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method1633(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && Static6.anInt5187 - Static6.anInt5183 != arg4.length) {
			throw new IllegalStateException();
		}
		method1636();
		method1632(arg0, arg1);
		method1627(arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "()V")
	private static void method1634() {
		if (Static3.anInt2094 < 0) {
			Static3.anInt2097 = 0;
			Static3.anInt2095 = 0;
			Static3.anInt2096 = 0;
			Static3.anInt2098 = 2147483646;
			return;
		}
		method1626(0, Static3.anInt2094);
		@Pc(17) int local17 = Static3.anIntArray169[1];
		if (local17 < Static6.anInt5183) {
			local17 = Static6.anInt5183;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < Static3.anInt2094; local26 += 4) {
			@Pc(35) int local35 = Static3.anIntArray169[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = Static3.anIntArray169[local26];
			@Pc(49) int local49 = Static3.anIntArray169[local26 + 2];
			@Pc(55) int local55 = Static3.anIntArray169[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			Static3.anIntArray169[local26] = local71 + (local17 - local35) * local65;
			Static3.anIntArray169[local26 + 2] = local65;
		}
		Static3.anInt2096 = 0;
		Static3.anInt2095 = local26;
		Static3.anInt2097 = local26;
		Static3.anInt2098 = local17 - 1;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V")
	private static void method1635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = Static3.anIntArray169[local10 - 4];
					@Pc(23) int local23 = Static3.anIntArray169[local10];
					if (local19 > local23) {
						local6 = false;
						Static3.anIntArray169[local10 - 4] = local23;
						Static3.anIntArray169[local10] = local19;
						@Pc(44) int local44 = Static3.anIntArray169[local10 - 2];
						Static3.anIntArray169[local10 - 2] = Static3.anIntArray169[local10 + 2];
						Static3.anIntArray169[local10 + 2] = local44;
						local44 = Static3.anIntArray169[local10 - 1];
						Static3.anIntArray169[local10 - 1] = Static3.anIntArray169[local10 + 3];
						Static3.anIntArray169[local10 + 3] = local44;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "()V")
	private static void method1636() {
		Static3.anInt2094 = 0;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method2265(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 == '<' || local13 == '>') {
				local4 += 3;
			}
		}
		@Pc(29) StringBuffer local29 = new StringBuffer(local2 + local4);
		for (@Pc(31) int local31 = 0; local31 < local2; local31++) {
			@Pc(38) char local38 = arg0.charAt(local31);
			if (local38 == '<') {
				local29.append("<lt>");
			} else if (local38 == '>') {
				local29.append("<gt>");
			} else {
				local29.append(local38);
			}
		}
		return local29.toString();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method2270(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(37) int local37 = arg3[arg5];
		if (arg3[arg6] < local37) {
			local37 = arg3[arg6];
		}
		@Pc(50) byte[] local50 = arg1[arg5];
		@Pc(54) byte[] local54 = arg0[arg6];
		@Pc(58) int local58 = local21 - local3;
		@Pc(62) int local62 = local21 - local13;
		for (@Pc(64) int local64 = local21; local64 < local28; local64++) {
			@Pc(77) int local77 = local50[local58++] + local54[local62++];
			if (local77 < local37) {
				local37 = local77;
			}
		}
		return -local37;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	public static void method1651() {
		Static3.aString112 = "Librairie 3D démarrée";
		Static7.aString315 = "clignotant3:";
		Static4.aString210 = "Chargement de OpenRS2 en cours - veuillez patienter...";
		Static6.aString293 = "brillant2:";
		Static7.aString348 = "niveau ";
		Static5.aString235 = "déroulement:";
		Static6.aString275 = "Vérification des mises à jour - ";
		Static4.aString200 = "Gestionnaire de saisie chargé";
		Static7.aString343 = "clignotant2:";
		Static5.aString314 = "Utiliser";
		Static6.aString267 = "ondulation2:";
		Static4.aString203 = "brillant1:";
		Static5.aString250 = "brillant3:";
		Static3.aString146 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
		Static1.aString26 = "Prendre";
		Static3.aString149 = "Chargement des paramètres par défaut - ";
		Static7.aString320 = "compétence ";
		Static1.aString29 = "classement ";
		Static3.aString154 = "ondulation:";
		Static7.aString363 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
		Static4.aString207 = "Connexion perdue.";
		Static1.aString8 = "Fermer";
		Static4.aString180 = " de votre liste noire.";
		Static7.aString317 = "Monde de jeu créé";
		Static1.aString23 = "Connecté au serveur de mise à jour";
		Static1.aString6 = "Atteindre";
		Static4.aString199 = "Liste des mises à jour chargée";
		Static1.aString11 = "Jeter";
		Static3.aString122 = "Veuillez commencer par supprimer ";
		Static5.aString324 = "violet:";
		Static5.aString256 = "Textures chargées";
		Static5.aString239 = "K";
		Static1.aString22 = "Examiner";
		Static3.aString124 = "Veuillez patienter...";
		Static1.aString46 = "Veuillez patienter - tentative de rétablissement.";
		Static2.aString82 = "Chargement du module texte - ";
		Static3.aString120 = "Attaquer";
		Static7.aString347 = " est déjà dans votre liste d'amis.";
		Static6.aString262 = "Mémoire attribuée";
		Static3.aString133 = "Objet d'abonnés";
		Static3.aString128 = " est déjà dans votre liste noire.";
		Static1.aString43 = "jaune:";
		Static4.aString160 = "Mémoire en cours d'attribution";
		Static2.aString80 = "Liste des serveurs chargée";
		Static3.aString115 = "Poser";
		Static6.aString266 = "clignotant1:";
		Static6.aString260 = "Veuillez commencer par supprimer ";
		Static5.aString218 = "Polices chargées";
		Static6.aString282 = "OK";
		Static1.aString56 = "Chargement de l'écran-titre - ";
		Static1.aString38 = "Votre liste noire est pleine (100 noms maximum).";
		Static4.aString368 = "Fichiers config chargés";
		Static2.aString83 = "Démarrage de la librairie 3D";
		Static6.aString193 = "Chargement de Mechscape en cours - veuillez patienter...";
		Static3.aString148 = " autres options";
		Static3.aString118 = "voudrait faire un échange avec vous.";
		Static4.aString187 = "Chargement en cours. Veuillez patienter.";
		Static4.aString161 = "K";
		Static1.aString55 = " ";
		Static7.aString369 = "Chargement des sprites - ";
		Static4.aString206 = "Chargement de la liste des serveurs";
		Static5.aString230 = "M";
		Static1.aString7 = "Paramètres par défaut chargés";
		Static3.aString142 = "glissement:";
		Static5.aString249 = " s'est connecté.";
		Static6.aString276 = "Impossible de trouver ";
		Static7.aString344 = "rouge:";
		Static4.aString211 = "Moteur son préparé";
		Static6.aString265 = "Sprites chargés";
		Static7.aString329 = "Chargement des interfaces - ";
		Static3.aString325 = "vert:";
		Static5.aString224 = " s'est déconnecté.";
		Static6.aString298 = "cyan:";
		Static3.aString150 = "Interfaces chargées";
		Static5.aString233 = "Chargement des polices - ";
		Static1.aString30 = "Chargement des fichiers config - ";
		Static5.aString240 = "Écran-titre chargé";
		Static4.aString201 = "Continuer";
		Static3.aString121 = "Module texte chargé";
		Static5.aString37 = "Sélectionner";
		Static3.aString113 = " de votre liste d'amis.";
		Static4.aString179 = "blanc:";
		Static2.aString68 = "Chargement en cours...";
		Static3.aString147 = "Écran-titre ouvert";
		Static6.aString290 = "Chargement des textures - ";
		Static4.aString185 = "Caché";
		Static3.aString139 = "Regarder dans cette direction";
		Static4.aString205 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
		Static1.aString49 = "M";
		Static4.aString202 = "Choisir une option";
		Static6.aString296 = "Annuler";
		Static7.aString364 = "Connexion au serveur de mise à jour en cours";
		Static4.aString170 = "tremblement:";
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBI)V")
	public static void method1654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static1.anInt772 == 2) {
			Static5.anInt4066 = arg0;
			Static5.anInt3656 = arg1;
		}
		Static5.aFloat97 = arg1;
		Static5.aFloat147 = arg0;
		Static28.method3252();
		Static5.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(B)V")
	public static void method1655() {
		Static6.aBoolean335 = true;
	}
}

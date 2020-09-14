import java.nio.IntBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class4_Sub3_Sub10 extends SecondaryNode {

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	private int contextId;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	private int id = -1;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	private int anInt2323 = 0;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	private int anInt2324 = -1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub10() {
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIII)V")
	public Class4_Sub3_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray193 = new int[6];
		this.anIntArray193[0] = arg0;
		this.anIntArray193[1] = arg1;
		this.anIntArray193[2] = arg2;
		this.anIntArray193[3] = arg3;
		this.anIntArray193[4] = arg4;
		this.anIntArray193[5] = arg5;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
	private void method1832() {
		if (this.id >= 0 && this.contextId == GlCleaner.contextId) {
			return;
		}
		@Pc(8) GL gl = GlRenderer.gl;
		@Pc(11) int[] temp = new int[1];
		gl.glGenTextures(1, temp, 0);
		this.id = temp[0];
		gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.id);
		gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_R, GL.GL_CLAMP_TO_EDGE);
		gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
		this.contextId = GlCleaner.contextId;
		this.anInt2323 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.id != -1) {
			GlCleaner.deleteTexture(this.id, this.size, this.contextId);
			this.id = -1;
			this.size = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
	public final void method1834() {
		@Pc(1) GL gl = GlRenderer.gl;
		this.method1832();
		gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.id);
		if (this.anIntArray193 == null || this.anInt2323 == 2) {
			return;
		}
		if (this.method1836()) {
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray193[local22];
				this.anInt2324 = Static4.anInterface4_1.isLowDetail(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt2324;
				} else if (this.anInt2324 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static4.anInterface4_1.method449(local30));
				gl.glTexImage2D(local22 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_RGB, local20, local20, GL.GL_POINTS, GL.GL_BGRA, GL.GL_UNSIGNED_BYTE, local60);
			}
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			@Pc(93) int local93 = local20 * local20 * 6 * 3;
			GlCleaner.onCardTexture += local93 - this.size;
			this.size = local93;
			this.anInt2323 = 2;
		} else if (this.anInt2323 != 1) {
			for (@Pc(113) int local113 = 0; local113 < 6; local113++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(ColorUtils.HSL_TO_RGB, Static4.anInterface4_1.method446(this.anIntArray193[local113]), 1);
				gl.glTexImage2D(local113 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_RGB, 1, 1, GL.GL_POINTS, GL.GL_BGRA, GL.GL_UNSIGNED_BYTE, local127);
				GlCleaner.onCardTexture += 3 - this.size;
				this.size = 3;
			}
			this.anInt2323 = 1;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ib;Lclient!ib;F)Lclient!ib;")
	public final Class4_Sub3_Sub10 method1835(@OriginalArg(0) Class4_Sub3_Sub10 arg0, @OriginalArg(1) Class4_Sub3_Sub10 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL gl = GlRenderer.gl;
		@Pc(10) Class4_Sub3_Sub10 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!GlRenderer.arbFboSupported) {
			return local10;
		}
		this.method1832();
		if (Static3.anIntArray194 == null || Static3.anInt2322 != GlCleaner.contextId) {
			Static3.anIntArray194 = new int[2];
			gl.glGenTextures(2, Static3.anIntArray194, 0);
			for (@Pc(31) int local31 = 0; local31 < 2; local31++) {
				GlRenderer.setTextureId(Static3.anIntArray194[local31]);
				gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
				gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
			}
			Static3.anInt2322 = GlCleaner.contextId;
		}
		@Pc(63) int local63 = arg0.anInt2324 > arg1.anInt2324 ? arg0.anInt2324 : arg1.anInt2324;
		if (this.anInt2324 != local63) {
			this.anInt2324 = local63;
			gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.id);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				gl.glTexImage2D(local77 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_RGB, this.anInt2324, this.anInt2324, GL.GL_POINTS, GL.GL_RGB, GL.GL_UNSIGNED_BYTE, null);
			}
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		}
		arg0.method1834();
		arg1.method1834();
		Static18.method1686(Static3.anIntArray195);
		Static18.method1698();
		Static9.method216(GlRenderer.method1614());
		gl.glPushAttrib(GL.GL_VIEWPORT_BIT);
		GlRenderer.setFogEnabled(false);
		GlRenderer.setLightingEnabled(false);
		GlRenderer.setDepthTestEnabled(false);
		GlRenderer.setTextureCombineRgbMode(1);
		GlRenderer.setTextureCombineAlphaMode(1);
		gl.glDisable(GL.GL_BLEND);
		gl.glDisable(GL.GL_ALPHA_TEST);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glOrtho(0.0D, (double) this.anInt2324, 0.0D, (double) this.anInt2324, -1.0D, 1.0D);
		gl.glViewport(0, 0, this.anInt2324, this.anInt2324);
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glBindTexture(GL.GL_TEXTURE_2D, Static3.anIntArray194[1]);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_INTERPOLATE);
		Static3.aFloatArray23[3] = arg2;
		gl.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, Static3.aFloatArray23, 0);
		gl.glEnable(GL.GL_TEXTURE_2D);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static19.method1837(gl, arg0.id, local212, arg0.anInt2324, Static3.anIntArray194[0])) {
				local203 = false;
				break;
			}
			if (!Static19.method1837(gl, arg1.id, local212, arg1.anInt2324, Static3.anIntArray194[1])) {
				local203 = false;
				break;
			}
			gl.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT0, local212, this.id, 0);
			gl.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
			@Pc(255) int local255 = gl.glCheckFramebufferStatusEXT(GL.GL_FRAMEBUFFER);
			if (local255 != GL.GL_FRAMEBUFFER_COMPLETE) {
				local203 = false;
				break;
			}
			GlRenderer.setTextureId(Static3.anIntArray194[0]);
			gl.glBegin(GL.GL_QUADS);
			gl.glTexCoord2i(0, 0);
			gl.glMultiTexCoord2i(GL.GL_TEXTURE1, 0, 0);
			gl.glVertex2i(0, 0);
			gl.glTexCoord2i(1, 0);
			gl.glMultiTexCoord2i(GL.GL_TEXTURE1, 1, 0);
			gl.glVertex2i(this.anInt2324, 0);
			gl.glTexCoord2i(1, 1);
			gl.glMultiTexCoord2i(GL.GL_TEXTURE1, 1, 1);
			gl.glVertex2i(this.anInt2324, this.anInt2324);
			gl.glTexCoord2i(0, 1);
			gl.glMultiTexCoord2i(GL.GL_TEXTURE1, 0, 1);
			gl.glVertex2i(0, this.anInt2324);
			gl.glEnd();
		}
		gl.glPopMatrix();
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glPopMatrix();
		GlRenderer.setDepthTestEnabled(true);
		GlRenderer.setLightingEnabled(true);
		GlRenderer.setFogEnabled(true);
		gl.glEnable(GL.GL_ALPHA_TEST);
		gl.glEnable(GL.GL_BLEND);
		gl.glPopAttrib();
		Static9.method215();
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		gl.glDisable(GL.GL_TEXTURE_2D);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		Static18.method1695(Static3.anIntArray195);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()Z")
	private boolean method1836() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static4.anInterface4_1.isGlTextureReady(this.anIntArray193[local1])) {
				return false;
			}
		}
		return true;
	}
}

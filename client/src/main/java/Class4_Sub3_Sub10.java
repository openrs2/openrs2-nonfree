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
	private int anInt2325;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	private int anInt2320 = -1;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	private int anInt2323 = 0;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	private int anInt2321 = 0;

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
		if (this.anInt2320 >= 0 && this.anInt2325 == Static4.anInt3332) {
			return;
		}
		@Pc(8) GL local8 = Static3.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt2320 = local11[0];
		local8.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anInt2320);
		local8.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_R, GL.GL_CLAMP_TO_EDGE);
		local8.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		local8.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
		this.anInt2325 = Static4.anInt3332;
		this.anInt2323 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.anInt2320 != -1) {
			Static25.method2720(this.anInt2320, this.anInt2321, this.anInt2325);
			this.anInt2320 = -1;
			this.anInt2321 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
	public final void method1834() {
		@Pc(1) GL local1 = Static3.aGL1;
		this.method1832();
		local1.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anInt2320);
		if (this.anIntArray193 == null || this.anInt2323 == 2) {
			return;
		}
		if (this.method1836()) {
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray193[local22];
				this.anInt2324 = Static4.anInterface4_1.method453(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt2324;
				} else if (this.anInt2324 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static4.anInterface4_1.method449(local30));
				local1.glTexImage2D(local22 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_RGB, local20, local20, GL.GL_POINTS, GL.GL_BGRA, GL.GL_UNSIGNED_BYTE, local60);
			}
			local1.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local1.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			@Pc(93) int local93 = local20 * local20 * 6 * 3;
			Static4.anInt3330 += local93 - this.anInt2321;
			this.anInt2321 = local93;
			this.anInt2323 = 2;
		} else if (this.anInt2323 != 1) {
			for (@Pc(113) int local113 = 0; local113 < 6; local113++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static4.anIntArray295, Static4.anInterface4_1.method446(this.anIntArray193[local113]), 1);
				local1.glTexImage2D(local113 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_RGB, 1, 1, GL.GL_POINTS, GL.GL_BGRA, GL.GL_UNSIGNED_BYTE, local127);
				Static4.anInt3330 += 3 - this.anInt2321;
				this.anInt2321 = 3;
			}
			this.anInt2323 = 1;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ib;Lclient!ib;F)Lclient!ib;")
	public final Class4_Sub3_Sub10 method1835(@OriginalArg(0) Class4_Sub3_Sub10 arg0, @OriginalArg(1) Class4_Sub3_Sub10 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static3.aGL1;
		@Pc(10) Class4_Sub3_Sub10 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static3.aBoolean134) {
			return local10;
		}
		this.method1832();
		if (Static3.anIntArray194 == null || Static3.anInt2322 != Static4.anInt3332) {
			Static3.anIntArray194 = new int[2];
			local1.glGenTextures(2, Static3.anIntArray194, 0);
			for (@Pc(31) int local31 = 0; local31 < 2; local31++) {
				Static17.method1600(Static3.anIntArray194[local31]);
				local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
				local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
			}
			Static3.anInt2322 = Static4.anInt3332;
		}
		@Pc(63) int local63 = arg0.anInt2324 > arg1.anInt2324 ? arg0.anInt2324 : arg1.anInt2324;
		if (this.anInt2324 != local63) {
			this.anInt2324 = local63;
			local1.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anInt2320);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_RGB, this.anInt2324, this.anInt2324, GL.GL_POINTS, GL.GL_RGB, GL.GL_UNSIGNED_BYTE, null);
			}
			local1.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local1.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		}
		arg0.method1834();
		arg1.method1834();
		Static18.method1686(Static3.anIntArray195);
		Static18.method1698();
		Static9.method216(Static17.method1614());
		local1.glPushAttrib(GL.GL_VIEWPORT_BIT);
		Static16.method1593(false);
		Static17.method1610(false);
		Static16.method1588(false);
		Static17.method1597(1);
		Static17.method1607(1);
		local1.glDisable(GL.GL_BLEND);
		local1.glDisable(GL.GL_ALPHA_TEST);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(GL.GL_PROJECTION);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt2324, 0.0D, (double) this.anInt2324, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt2324, this.anInt2324);
		local1.glActiveTexture(GL.GL_TEXTURE1);
		local1.glBindTexture(GL.GL_TEXTURE_2D, Static3.anIntArray194[1]);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_INTERPOLATE);
		Static3.aFloatArray23[3] = arg2;
		local1.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, Static3.aFloatArray23, 0);
		local1.glEnable(GL.GL_TEXTURE_2D);
		local1.glActiveTexture(GL.GL_TEXTURE0);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static19.method1837(local1, arg0.anInt2320, local212, arg0.anInt2324, Static3.anIntArray194[0])) {
				local203 = false;
				break;
			}
			if (!Static19.method1837(local1, arg1.anInt2320, local212, arg1.anInt2324, Static3.anIntArray194[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT0, local212, this.anInt2320, 0);
			local1.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(GL.GL_FRAMEBUFFER);
			if (local255 != GL.GL_FRAMEBUFFER_COMPLETE) {
				local203 = false;
				break;
			}
			Static17.method1600(Static3.anIntArray194[0]);
			local1.glBegin(GL.GL_QUADS);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(GL.GL_TEXTURE1, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(GL.GL_TEXTURE1, 1, 0);
			local1.glVertex2i(this.anInt2324, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(GL.GL_TEXTURE1, 1, 1);
			local1.glVertex2i(this.anInt2324, this.anInt2324);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(GL.GL_TEXTURE1, 0, 1);
			local1.glVertex2i(0, this.anInt2324);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(GL.GL_MODELVIEW);
		local1.glPopMatrix();
		Static16.method1588(true);
		Static17.method1610(true);
		Static16.method1593(true);
		local1.glEnable(GL.GL_ALPHA_TEST);
		local1.glEnable(GL.GL_BLEND);
		local1.glPopAttrib();
		Static9.method215();
		local1.glActiveTexture(GL.GL_TEXTURE1);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		local1.glDisable(GL.GL_TEXTURE_2D);
		local1.glActiveTexture(GL.GL_TEXTURE0);
		Static18.method1695(Static3.anIntArray195);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()Z")
	private boolean method1836() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static4.anInterface4_1.method448(this.anIntArray193[local1])) {
				return false;
			}
		}
		return true;
	}
}

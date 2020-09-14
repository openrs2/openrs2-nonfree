import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class21 implements Interface2 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
	private int anInt341 = -1;

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
	private int anInt342 = -1;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "[F")
	private final float[] aFloatArray8 = new float[4];

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class21() {
		if (GlRenderer.maxTextureUnits >= 2) {
			@Pc(17) int[] local17 = new int[1];
			@Pc(20) byte[] local20 = new byte[8];
			@Pc(22) int local22 = 0;
			while (local22 < 8) {
				local20[local22++] = (byte) (local22 * 159 / 8 + 96);
			}
			@Pc(40) GL local40 = GlRenderer.gl;
			local40.glGenTextures(1, local17, 0);
			local40.glBindTexture(GL.GL_TEXTURE_1D, local17[0]);
			local40.glTexImage1D(GL.GL_TEXTURE_1D, GL.GL_POINTS, GL.GL_ALPHA, 8, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local20));
			local40.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local40.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			local40.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
			this.anInt342 = local17[0];
			Static1.aBoolean21 = GlRenderer.maxTextureUnits > 2 && GlRenderer.extTexture3dSupported;
			this.method317();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()V")
	@Override
	public final void method3484() {
		@Pc(1) GL local1 = GlRenderer.gl;
		local1.glCallList(this.anInt341);
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "()I")
	@Override
	public final int method3485() {
		return 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
	@Override
	public final void method3483() {
		@Pc(1) GL local1 = GlRenderer.gl;
		local1.glCallList(this.anInt341 + 1);
	}

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "()V")
	private void method317() {
		@Pc(1) GL local1 = GlRenderer.gl;
		this.anInt341 = local1.glGenLists(2);
		local1.glNewList(this.anInt341, GL.GL_COMPILE);
		local1.glActiveTexture(GL.GL_TEXTURE1);
		if (Static1.aBoolean21) {
			local1.glBindTexture(GL.GL_TEXTURE_3D, Static3.anInt2342);
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD);
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PREVIOUS);
			local1.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
			local1.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
			local1.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
			local1.glTexGeni(GL.GL_Q, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
			local1.glTexGenfv(GL.GL_Q, GL.GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glEnable(GL.GL_TEXTURE_GEN_S);
			local1.glEnable(GL.GL_TEXTURE_GEN_T);
			local1.glEnable(GL.GL_TEXTURE_GEN_R);
			local1.glEnable(GL.GL_TEXTURE_GEN_Q);
			local1.glEnable(GL.GL_TEXTURE_3D);
			local1.glActiveTexture(GL.GL_TEXTURE2);
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_COMBINE);
		}
		local1.glBindTexture(GL.GL_TEXTURE_1D, this.anInt342);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_CONSTANT);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_TEXTURE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PREVIOUS);
		local1.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
		local1.glEnable(GL.GL_TEXTURE_1D);
		local1.glEnable(GL.GL_TEXTURE_GEN_S);
		local1.glActiveTexture(GL.GL_TEXTURE0);
		local1.glEndList();
		local1.glNewList(this.anInt341 + 1, GL.GL_COMPILE);
		local1.glActiveTexture(GL.GL_TEXTURE1);
		if (Static1.aBoolean21) {
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
			local1.glDisable(GL.GL_TEXTURE_GEN_S);
			local1.glDisable(GL.GL_TEXTURE_GEN_T);
			local1.glDisable(GL.GL_TEXTURE_GEN_R);
			local1.glDisable(GL.GL_TEXTURE_GEN_Q);
			local1.glDisable(GL.GL_TEXTURE_3D);
			local1.glActiveTexture(GL.GL_TEXTURE2);
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_MODULATE);
		}
		local1.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, new float[] { 0.0F, 1.0F, 0.0F, 1.0F }, 0);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_CONSTANT);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
		local1.glDisable(GL.GL_TEXTURE_1D);
		local1.glDisable(GL.GL_TEXTURE_GEN_S);
		local1.glActiveTexture(GL.GL_TEXTURE0);
		local1.glEndList();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	public final void method3486(@OriginalArg(0) int arg0) {
		@Pc(1) GL local1 = GlRenderer.gl;
		local1.glActiveTexture(GL.GL_TEXTURE1);
		if (Static1.aBoolean21 || arg0 >= 0) {
			local1.glPushMatrix();
			local1.glLoadIdentity();
			local1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			local1.glRotatef((float) Static4.anInt3258 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
			local1.glRotatef((float) Static6.anInt4403 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
			local1.glTranslatef((float) -Static5.anInt3731, (float) -Static6.anInt4558, (float) -Static1.anInt525);
			if (Static1.aBoolean21) {
				this.aFloatArray8[0] = 0.001F;
				this.aFloatArray8[1] = 9.0E-4F;
				this.aFloatArray8[2] = 0.0F;
				this.aFloatArray8[3] = 0.0F;
				local1.glTexGenfv(GL.GL_S, GL.GL_EYE_PLANE, this.aFloatArray8, 0);
				this.aFloatArray8[0] = 0.0F;
				this.aFloatArray8[1] = 9.0E-4F;
				this.aFloatArray8[2] = 0.001F;
				this.aFloatArray8[3] = 0.0F;
				local1.glTexGenfv(GL.GL_T, GL.GL_EYE_PLANE, this.aFloatArray8, 0);
				this.aFloatArray8[0] = 0.0F;
				this.aFloatArray8[1] = 0.0F;
				this.aFloatArray8[2] = 0.0F;
				this.aFloatArray8[3] = (float) GlRenderer.anInt2085 * 0.005F;
				local1.glTexGenfv(GL.GL_R, GL.GL_EYE_PLANE, this.aFloatArray8, 0);
				local1.glActiveTexture(GL.GL_TEXTURE2);
			}
			local1.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, Static12.method723(), 0);
			if (arg0 >= 0) {
				this.aFloatArray8[0] = 0.0F;
				this.aFloatArray8[1] = 1.0F / (float) Static2.anInt2245;
				this.aFloatArray8[2] = 0.0F;
				this.aFloatArray8[3] = (float) arg0 * 1.0F / (float) Static2.anInt2245;
				local1.glTexGenfv(GL.GL_S, GL.GL_EYE_PLANE, this.aFloatArray8, 0);
				local1.glEnable(GL.GL_TEXTURE_GEN_S);
			} else {
				local1.glDisable(GL.GL_TEXTURE_GEN_S);
			}
			local1.glPopMatrix();
		} else {
			local1.glDisable(GL.GL_TEXTURE_GEN_S);
		}
		local1.glActiveTexture(GL.GL_TEXTURE0);
	}
}

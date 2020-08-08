import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class23 implements Interface2 {

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "[F")
	private final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class23() {
		this.method399();
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "()V")
	@Override
	public final void method3484() {
		@Pc(5) GL local5 = Static3.aGL1;
		local5.glCallList(this.anInt419);
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "()I")
	@Override
	public final int method3485() {
		return 0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "()V")
	@Override
	public final void method3483() {
		@Pc(5) GL local5 = Static3.aGL1;
		local5.glCallList(this.anInt419 + 1);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	@Override
	public final void method3486(@OriginalArg(0) int arg0) {
		@Pc(7) GL local7 = Static3.aGL1;
		@Pc(16) float local16 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(27) float local27 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(43) float local43 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		if (local35) {
			this.aFloatArray9[0] = local43;
			this.aFloatArray9[1] = 0.0F;
			this.aFloatArray9[2] = 0.0F;
			this.aFloatArray9[3] = 0.0F;
		} else {
			this.aFloatArray9[0] = 0.0F;
			this.aFloatArray9[1] = 0.0F;
			this.aFloatArray9[3] = 0.0F;
			this.aFloatArray9[2] = local43;
		}
		local7.glActiveTexture(GL.GL_TEXTURE1);
		local7.glMatrixMode(GL.GL_MODELVIEW);
		local7.glPushMatrix();
		local7.glLoadIdentity();
		local7.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static4.anInt3258 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) Static6.anInt4403 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local7.glTranslatef((float) -Static5.anInt3731, (float) -Static6.anInt4558, (float) -Static1.anInt525);
		local7.glTexGenfv(GL.GL_S, GL.GL_EYE_PLANE, this.aFloatArray9, 0);
		this.aFloatArray9[1] = local43;
		this.aFloatArray9[0] = 0.0F;
		this.aFloatArray9[2] = 0.0F;
		this.aFloatArray9[3] = (float) Static3.anInt2085 * local16;
		local7.glTexGenfv(GL.GL_T, GL.GL_EYE_PLANE, this.aFloatArray9, 0);
		local7.glPopMatrix();
		if (Static3.aBoolean160) {
			this.aFloatArray9[2] = 0.0F;
			this.aFloatArray9[3] = local27 * (float) Static3.anInt2085;
			this.aFloatArray9[1] = 0.0F;
			this.aFloatArray9[0] = 0.0F;
			local7.glTexGenfv(GL.GL_R, GL.GL_OBJECT_PLANE, this.aFloatArray9, 0);
		} else {
			@Pc(217) int local217 = (int) ((float) Static3.anInt2085 * 64.0F * local27);
			local7.glBindTexture(GL.GL_TEXTURE_2D, Static3.anIntArray199[local217 % 64]);
		}
		local7.glActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V")
	private void method399() {
		@Pc(7) GL local7 = Static3.aGL1;
		this.anInt419 = local7.glGenLists(2);
		local7.glNewList(this.anInt419, GL.GL_COMPILE);
		local7.glActiveTexture(GL.GL_TEXTURE1);
		if (Static3.aBoolean160) {
			local7.glBindTexture(GL.GL_TEXTURE_3D, Static3.anInt2341);
			local7.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
			local7.glEnable(GL.GL_TEXTURE_GEN_R);
			local7.glEnable(GL.GL_TEXTURE_3D);
		} else {
			local7.glEnable(GL.GL_TEXTURE_2D);
		}
		local7.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
		local7.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
		local7.glEnable(GL.GL_TEXTURE_GEN_S);
		local7.glEnable(GL.GL_TEXTURE_GEN_T);
		local7.glActiveTexture(GL.GL_TEXTURE0);
		local7.glEndList();
		local7.glNewList(this.anInt419 + 1, GL.GL_COMPILE);
		local7.glActiveTexture(GL.GL_TEXTURE1);
		if (Static3.aBoolean160) {
			local7.glDisable(GL.GL_TEXTURE_3D);
			local7.glDisable(GL.GL_TEXTURE_GEN_R);
		} else {
			local7.glDisable(GL.GL_TEXTURE_2D);
		}
		local7.glDisable(GL.GL_TEXTURE_GEN_S);
		local7.glDisable(GL.GL_TEXTURE_GEN_T);
		local7.glActiveTexture(GL.GL_TEXTURE0);
		local7.glEndList();
	}
}

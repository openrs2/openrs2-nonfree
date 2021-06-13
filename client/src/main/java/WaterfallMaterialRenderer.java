import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class WaterfallMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "[F")
	private final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public WaterfallMaterialRenderer() {
		this.method399();
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "()V")
	@Override
	public final void bind() {
		@Pc(5) GL gl = GlRenderer.gl;
		gl.glCallList(this.anInt419);
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "()I")
	@Override
	public final int getFlags() {
		return 0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "()V")
	@Override
	public final void unbind() {
		@Pc(5) GL gl = GlRenderer.gl;
		gl.glCallList(this.anInt419 + 1);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	@Override
	public final void setArgument(@OriginalArg(0) int arg) {
		@Pc(7) GL gl = GlRenderer.gl;
		@Pc(16) float local16 = -0.01F * (float) ((arg & 0x3) + 1);
		@Pc(27) float local27 = (float) ((arg >> 3 & 0x3) + 1) * 0.01F;
		@Pc(35) boolean local35 = (arg & 0x80) != 0;
		@Pc(43) float local43 = (arg & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
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
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		gl.glRotatef((float) Static4.anInt3258 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		gl.glRotatef((float) Static6.anInt4403 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		gl.glTranslatef((float) -Static5.anInt3731, (float) -Static6.anInt4558, (float) -Static1.anInt525);
		gl.glTexGenfv(GL.GL_S, GL.GL_EYE_PLANE, this.aFloatArray9, 0);
		this.aFloatArray9[1] = local43;
		this.aFloatArray9[0] = 0.0F;
		this.aFloatArray9[2] = 0.0F;
		this.aFloatArray9[3] = (float) GlRenderer.anInt2085 * local16;
		gl.glTexGenfv(GL.GL_T, GL.GL_EYE_PLANE, this.aFloatArray9, 0);
		gl.glPopMatrix();
		if (Static3.aBoolean160) {
			this.aFloatArray9[2] = 0.0F;
			this.aFloatArray9[3] = local27 * (float) GlRenderer.anInt2085;
			this.aFloatArray9[1] = 0.0F;
			this.aFloatArray9[0] = 0.0F;
			gl.glTexGenfv(GL.GL_R, GL.GL_OBJECT_PLANE, this.aFloatArray9, 0);
		} else {
			@Pc(217) int local217 = (int) ((float) GlRenderer.anInt2085 * 64.0F * local27);
			gl.glBindTexture(GL.GL_TEXTURE_2D, Static3.anIntArray199[local217 % 64]);
		}
		gl.glActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V")
	private void method399() {
		@Pc(7) GL gl = GlRenderer.gl;
		this.anInt419 = gl.glGenLists(2);
		gl.glNewList(this.anInt419, GL.GL_COMPILE);
		gl.glActiveTexture(GL.GL_TEXTURE1);
		if (Static3.aBoolean160) {
			gl.glBindTexture(GL.GL_TEXTURE_3D, Static3.anInt2341);
			gl.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
			gl.glEnable(GL.GL_TEXTURE_GEN_R);
			gl.glEnable(GL.GL_TEXTURE_3D);
		} else {
			gl.glEnable(GL.GL_TEXTURE_2D);
		}
		gl.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
		gl.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
		gl.glEnable(GL.GL_TEXTURE_GEN_S);
		gl.glEnable(GL.GL_TEXTURE_GEN_T);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		gl.glEndList();
		gl.glNewList(this.anInt419 + 1, GL.GL_COMPILE);
		gl.glActiveTexture(GL.GL_TEXTURE1);
		if (Static3.aBoolean160) {
			gl.glDisable(GL.GL_TEXTURE_3D);
			gl.glDisable(GL.GL_TEXTURE_GEN_R);
		} else {
			gl.glDisable(GL.GL_TEXTURE_2D);
		}
		gl.glDisable(GL.GL_TEXTURE_GEN_S);
		gl.glDisable(GL.GL_TEXTURE_GEN_T);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		gl.glEndList();
	}
}

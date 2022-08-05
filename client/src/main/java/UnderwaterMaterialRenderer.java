import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class UnderwaterMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Z")
	private static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "()V")
	public static void method314() {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glClientActiveTexture(method315());
		gl.glDisableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		gl.glClientActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "()I")
	public static int method315() {
		return aBoolean21 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "()V")
	public static void method316() {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glClientActiveTexture(method315());
		gl.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		gl.glClientActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
	private int listId = -1;

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
	private int textureId = -1;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "[F")
	private final float[] tempVertex = new float[4];

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public UnderwaterMaterialRenderer() {
		if (GlRenderer.maxTextureUnits >= 2) {
			@Pc(17) int[] temp = new int[1];
			@Pc(20) byte[] texture = new byte[8];
			@Pc(22) int i = 0;
			while (i < 8) {
				texture[i++] = (byte) (i * 159 / 8 + 96);
			}
			@Pc(40) GL gl = GlRenderer.gl;
			gl.glGenTextures(1, temp, 0);
			gl.glBindTexture(GL.GL_TEXTURE_1D, temp[0]);
			gl.glTexImage1D(GL.GL_TEXTURE_1D, GL.GL_POINTS, GL.GL_ALPHA, 8, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(texture));
			gl.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
			this.textureId = temp[0];
			aBoolean21 = GlRenderer.maxTextureUnits > 2 && GlRenderer.extTexture3dSupported;
			this.createLists();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()V")
	@Override
	public final void bind() {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glCallList(this.listId);
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "()I")
	@Override
	public final int getFlags() {
		return 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
	@Override
	public final void unbind() {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glCallList(this.listId + 1);
	}

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "()V")
	private void createLists() {
		@Pc(1) GL gl = GlRenderer.gl;
		this.listId = gl.glGenLists(2);
		gl.glNewList(this.listId, GL.GL_COMPILE);
		gl.glActiveTexture(GL.GL_TEXTURE1);
		if (aBoolean21) {
			gl.glBindTexture(GL.GL_TEXTURE_3D, Static3.anInt2342);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PREVIOUS);
			gl.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
			gl.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
			gl.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
			gl.glTexGeni(GL.GL_Q, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
			gl.glTexGenfv(GL.GL_Q, GL.GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			gl.glEnable(GL.GL_TEXTURE_GEN_S);
			gl.glEnable(GL.GL_TEXTURE_GEN_T);
			gl.glEnable(GL.GL_TEXTURE_GEN_R);
			gl.glEnable(GL.GL_TEXTURE_GEN_Q);
			gl.glEnable(GL.GL_TEXTURE_3D);
			gl.glActiveTexture(GL.GL_TEXTURE2);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_COMBINE);
		}
		gl.glBindTexture(GL.GL_TEXTURE_1D, this.textureId);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_CONSTANT);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_TEXTURE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PREVIOUS);
		gl.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
		gl.glEnable(GL.GL_TEXTURE_1D);
		gl.glEnable(GL.GL_TEXTURE_GEN_S);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		gl.glEndList();
		gl.glNewList(this.listId + 1, GL.GL_COMPILE);
		gl.glActiveTexture(GL.GL_TEXTURE1);
		if (aBoolean21) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
			gl.glDisable(GL.GL_TEXTURE_GEN_S);
			gl.glDisable(GL.GL_TEXTURE_GEN_T);
			gl.glDisable(GL.GL_TEXTURE_GEN_R);
			gl.glDisable(GL.GL_TEXTURE_GEN_Q);
			gl.glDisable(GL.GL_TEXTURE_3D);
			gl.glActiveTexture(GL.GL_TEXTURE2);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_MODULATE);
		}
		gl.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, new float[] { 0.0F, 1.0F, 0.0F, 1.0F }, 0);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_CONSTANT);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
		gl.glDisable(GL.GL_TEXTURE_1D);
		gl.glDisable(GL.GL_TEXTURE_GEN_S);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		gl.glEndList();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	public final void setArgument(@OriginalArg(0) int arg) {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glActiveTexture(GL.GL_TEXTURE1);
		if (aBoolean21 || arg >= 0) {
			gl.glPushMatrix();
			gl.glLoadIdentity();
			gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			gl.glRotatef((float) Static4.anInt3258 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
			gl.glRotatef((float) Static6.anInt4403 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
			gl.glTranslatef((float) -Static5.anInt3731, (float) -Static6.anInt4558, (float) -Static1.anInt525);
			if (aBoolean21) {
				this.tempVertex[0] = 0.001F;
				this.tempVertex[1] = 9.0E-4F;
				this.tempVertex[2] = 0.0F;
				this.tempVertex[3] = 0.0F;
				gl.glTexGenfv(GL.GL_S, GL.GL_EYE_PLANE, this.tempVertex, 0);
				this.tempVertex[0] = 0.0F;
				this.tempVertex[1] = 9.0E-4F;
				this.tempVertex[2] = 0.001F;
				this.tempVertex[3] = 0.0F;
				gl.glTexGenfv(GL.GL_T, GL.GL_EYE_PLANE, this.tempVertex, 0);
				this.tempVertex[0] = 0.0F;
				this.tempVertex[1] = 0.0F;
				this.tempVertex[2] = 0.0F;
				this.tempVertex[3] = (float) GlRenderer.anInt2085 * 0.005F;
				gl.glTexGenfv(GL.GL_R, GL.GL_EYE_PLANE, this.tempVertex, 0);
				gl.glActiveTexture(GL.GL_TEXTURE2);
			}
			gl.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, Static12.method723(), 0);
			if (arg >= 0) {
				this.tempVertex[0] = 0.0F;
				this.tempVertex[1] = 1.0F / (float) Static2.anInt2245;
				this.tempVertex[2] = 0.0F;
				this.tempVertex[3] = (float) arg * 1.0F / (float) Static2.anInt2245;
				gl.glTexGenfv(GL.GL_S, GL.GL_EYE_PLANE, this.tempVertex, 0);
				gl.glEnable(GL.GL_TEXTURE_GEN_S);
			} else {
				gl.glDisable(GL.GL_TEXTURE_GEN_S);
			}
			gl.glPopMatrix();
		} else {
			gl.glDisable(GL.GL_TEXTURE_GEN_S);
		}
		gl.glActiveTexture(GL.GL_TEXTURE0);
	}
}

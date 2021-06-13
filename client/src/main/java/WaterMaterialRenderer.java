import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class WaterMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	private int anInt265 = -1;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	private int anInt266 = -1;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	private int anInt267 = -1;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "[F")
	private final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public WaterMaterialRenderer() {
		this.method260();
		this.method259();
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "()V")
	private void method259() {
		@Pc(1) GL gl = GlRenderer.gl;
		this.anInt267 = gl.glGenLists(2);
		gl.glNewList(this.anInt267, GL.GL_COMPILE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC1_RGB, GL.GL_CONSTANT);
		gl.glTexEnvf(GL.GL_TEXTURE_ENV, GL.GL_RGB_SCALE, 2.0F);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC1_ALPHA, GL.GL_CONSTANT);
		gl.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
		gl.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
		gl.glTexGenfv(GL.GL_S, GL.GL_OBJECT_PLANE, new float[] { 9.765625E-4F, 0.0F, 0.0F, 0.0F }, 0);
		gl.glTexGenfv(GL.GL_T, GL.GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 9.765625E-4F, 0.0F }, 0);
		gl.glEnable(GL.GL_TEXTURE_GEN_S);
		gl.glEnable(GL.GL_TEXTURE_GEN_T);
		if (Static3.aBoolean160) {
			gl.glBindTexture(GL.GL_TEXTURE_3D, Static3.anInt2342);
			gl.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
			gl.glTexGeni(GL.GL_Q, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
			gl.glTexGenfv(GL.GL_Q, GL.GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			gl.glEnable(GL.GL_TEXTURE_GEN_R);
			gl.glEnable(GL.GL_TEXTURE_GEN_Q);
			gl.glEnable(GL.GL_TEXTURE_3D);
		}
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glEnable(GL.GL_TEXTURE_1D);
		gl.glBindTexture(GL.GL_TEXTURE_1D, this.anInt265);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_CONSTANT);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_TEXTURE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_INTERPOLATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_CONSTANT);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_ALPHA, GL.GL_TEXTURE);
		gl.glEnable(GL.GL_TEXTURE_GEN_S);
		gl.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glEndList();
		gl.glNewList(this.anInt267 + 1, GL.GL_COMPILE);
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glDisable(GL.GL_TEXTURE_1D);
		gl.glDisable(GL.GL_TEXTURE_GEN_S);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_CONSTANT);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_ALPHA, GL.GL_CONSTANT);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC1_RGB, GL.GL_PREVIOUS);
		gl.glTexEnvf(GL.GL_TEXTURE_ENV, GL.GL_RGB_SCALE, 1.0F);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC1_ALPHA, GL.GL_PREVIOUS);
		gl.glDisable(GL.GL_TEXTURE_GEN_S);
		gl.glDisable(GL.GL_TEXTURE_GEN_T);
		if (Static3.aBoolean160) {
			gl.glDisable(GL.GL_TEXTURE_GEN_R);
			gl.glDisable(GL.GL_TEXTURE_GEN_Q);
			gl.glDisable(GL.GL_TEXTURE_3D);
		}
		gl.glEndList();
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()I")
	@Override
	public final int getFlags() {
		return 15;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "()V")
	private void method260() {
		@Pc(2) byte[] local2 = new byte[] { 0, -1 };
		@Pc(12) GL gl = GlRenderer.gl;
		@Pc(15) int[] local15 = new int[1];
		gl.glGenTextures(1, local15, 0);
		gl.glBindTexture(GL.GL_TEXTURE_1D, local15[0]);
		gl.glTexImage1D(GL.GL_TEXTURE_1D, GL.GL_POINTS, GL.GL_ALPHA, 2, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local2));
		gl.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
		gl.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		gl.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		this.anInt265 = local15[0];
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
	@Override
	public final void unbind() {
		GlRenderer.gl.glCallList(this.anInt267 + 1);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()V")
	@Override
	public final void bind() {
		@Pc(1) GL gl = GlRenderer.gl;
		GlRenderer.setTextureCombineRgbMode(2);
		GlRenderer.setTextureCombineAlphaMode(2);
		GlRenderer.resetTextureMatrix();
		gl.glCallList(this.anInt267);
		@Pc(12) float local12 = 2662.4001F;
		@Pc(21) float local21 = local12 + (float) (Static4.anInt3258 - 128) * 0.5F;
		if (local21 >= 3328.0F) {
			local21 = 3327.0F;
		}
		this.aFloatArray6[0] = 0.0F;
		this.aFloatArray6[1] = 0.0F;
		this.aFloatArray6[2] = 1.0F / (local21 - 3328.0F);
		this.aFloatArray6[3] = local21 / (local21 - 3328.0F);
		gl.glTexGenfv(GL.GL_S, GL.GL_EYE_PLANE, this.aFloatArray6, 0);
		gl.glPopMatrix();
		gl.glActiveTexture(GL.GL_TEXTURE0);
		gl.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, Static1.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	@Override
	public final void setArgument(@OriginalArg(0) int arg) {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, Static4.aFloatArray38, 0);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		if ((arg & 0x1) == 1) {
			if (!Static3.aBoolean160) {
				GlRenderer.setTextureId(Static3.anIntArray198[GlRenderer.anInt2085 * 64 / 100 % 64]);
			} else if (this.anInt266 != GlRenderer.anInt2085) {
				this.aFloatArray6[0] = 0.0F;
				this.aFloatArray6[1] = 0.0F;
				this.aFloatArray6[2] = 0.0F;
				this.aFloatArray6[3] = (float) GlRenderer.anInt2085 * 0.005F;
				gl.glTexGenfv(GL.GL_R, GL.GL_OBJECT_PLANE, this.aFloatArray6, 0);
				this.anInt266 = GlRenderer.anInt2085;
			}
		} else if (Static3.aBoolean160) {
			this.aFloatArray6[0] = 0.0F;
			this.aFloatArray6[1] = 0.0F;
			this.aFloatArray6[2] = 0.0F;
			this.aFloatArray6[3] = 0.0F;
			gl.glTexGenfv(GL.GL_R, GL.GL_OBJECT_PLANE, this.aFloatArray6, 0);
		} else {
			GlRenderer.setTextureId(Static3.anIntArray198[0]);
		}
	}
}

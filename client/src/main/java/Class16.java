import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class16 implements Interface2 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	private int anInt265 = -1;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	private int anInt266 = -1;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	private int anInt267 = -1;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "[F")
	private final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class16() {
		this.method260();
		this.method259();
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "()V")
	private void method259() {
		@Pc(1) GL local1 = Static3.aGL1;
		this.anInt267 = local1.glGenLists(2);
		local1.glNewList(this.anInt267, GL.GL_COMPILE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC1_RGB, GL.GL_CONSTANT);
		local1.glTexEnvf(GL.GL_TEXTURE_ENV, GL.GL_RGB_SCALE, 2.0F);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC1_ALPHA, GL.GL_CONSTANT);
		local1.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
		local1.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
		local1.glTexGenfv(GL.GL_S, GL.GL_OBJECT_PLANE, new float[] { 9.765625E-4F, 0.0F, 0.0F, 0.0F }, 0);
		local1.glTexGenfv(GL.GL_T, GL.GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 9.765625E-4F, 0.0F }, 0);
		local1.glEnable(GL.GL_TEXTURE_GEN_S);
		local1.glEnable(GL.GL_TEXTURE_GEN_T);
		if (Static3.aBoolean160) {
			local1.glBindTexture(GL.GL_TEXTURE_3D, Static3.anInt2342);
			local1.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
			local1.glTexGeni(GL.GL_Q, GL.GL_TEXTURE_GEN_MODE, GL.GL_OBJECT_LINEAR);
			local1.glTexGenfv(GL.GL_Q, GL.GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glEnable(GL.GL_TEXTURE_GEN_R);
			local1.glEnable(GL.GL_TEXTURE_GEN_Q);
			local1.glEnable(GL.GL_TEXTURE_3D);
		}
		local1.glActiveTexture(GL.GL_TEXTURE1);
		local1.glEnable(GL.GL_TEXTURE_1D);
		local1.glBindTexture(GL.GL_TEXTURE_1D, this.anInt265);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_CONSTANT);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_TEXTURE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_INTERPOLATE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_CONSTANT);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_ALPHA, GL.GL_TEXTURE);
		local1.glEnable(GL.GL_TEXTURE_GEN_S);
		local1.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glEndList();
		local1.glNewList(this.anInt267 + 1, GL.GL_COMPILE);
		local1.glActiveTexture(GL.GL_TEXTURE1);
		local1.glDisable(GL.GL_TEXTURE_1D);
		local1.glDisable(GL.GL_TEXTURE_GEN_S);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_CONSTANT);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_ALPHA, GL.GL_CONSTANT);
		local1.glActiveTexture(GL.GL_TEXTURE0);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC1_RGB, GL.GL_PREVIOUS);
		local1.glTexEnvf(GL.GL_TEXTURE_ENV, GL.GL_RGB_SCALE, 1.0F);
		local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC1_ALPHA, GL.GL_PREVIOUS);
		local1.glDisable(GL.GL_TEXTURE_GEN_S);
		local1.glDisable(GL.GL_TEXTURE_GEN_T);
		if (Static3.aBoolean160) {
			local1.glDisable(GL.GL_TEXTURE_GEN_R);
			local1.glDisable(GL.GL_TEXTURE_GEN_Q);
			local1.glDisable(GL.GL_TEXTURE_3D);
		}
		local1.glEndList();
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()I")
	@Override
	public final int method3485() {
		return 15;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "()V")
	private void method260() {
		@Pc(2) byte[] local2 = new byte[] { 0, -1 };
		@Pc(12) GL local12 = Static3.aGL1;
		@Pc(15) int[] local15 = new int[1];
		local12.glGenTextures(1, local15, 0);
		local12.glBindTexture(GL.GL_TEXTURE_1D, local15[0]);
		local12.glTexImage1D(GL.GL_TEXTURE_1D, GL.GL_POINTS, GL.GL_ALPHA, 2, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local2));
		local12.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
		local12.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		local12.glTexParameteri(GL.GL_TEXTURE_1D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		this.anInt265 = local15[0];
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
	@Override
	public final void method3483() {
		Static3.aGL1.glCallList(this.anInt267 + 1);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()V")
	@Override
	public final void method3484() {
		@Pc(1) GL local1 = Static3.aGL1;
		Static17.method1597(2);
		Static17.method1607(2);
		Static16.method1595();
		local1.glCallList(this.anInt267);
		@Pc(12) float local12 = 2662.4001F;
		@Pc(21) float local21 = local12 + (float) (Static4.anInt3258 - 128) * 0.5F;
		if (local21 >= 3328.0F) {
			local21 = 3327.0F;
		}
		this.aFloatArray6[0] = 0.0F;
		this.aFloatArray6[1] = 0.0F;
		this.aFloatArray6[2] = 1.0F / (local21 - 3328.0F);
		this.aFloatArray6[3] = local21 / (local21 - 3328.0F);
		local1.glTexGenfv(GL.GL_S, GL.GL_EYE_PLANE, this.aFloatArray6, 0);
		local1.glPopMatrix();
		local1.glActiveTexture(GL.GL_TEXTURE0);
		local1.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, Static1.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	@Override
	public final void method3486(@OriginalArg(0) int arg0) {
		@Pc(1) GL local1 = Static3.aGL1;
		local1.glActiveTexture(GL.GL_TEXTURE1);
		local1.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, Static4.aFloatArray38, 0);
		local1.glActiveTexture(GL.GL_TEXTURE0);
		if ((arg0 & 0x1) == 1) {
			if (!Static3.aBoolean160) {
				Static17.method1600(Static3.anIntArray198[Static3.anInt2085 * 64 / 100 % 64]);
			} else if (this.anInt266 != Static3.anInt2085) {
				this.aFloatArray6[0] = 0.0F;
				this.aFloatArray6[1] = 0.0F;
				this.aFloatArray6[2] = 0.0F;
				this.aFloatArray6[3] = (float) Static3.anInt2085 * 0.005F;
				local1.glTexGenfv(GL.GL_R, GL.GL_OBJECT_PLANE, this.aFloatArray6, 0);
				this.anInt266 = Static3.anInt2085;
			}
		} else if (Static3.aBoolean160) {
			this.aFloatArray6[0] = 0.0F;
			this.aFloatArray6[1] = 0.0F;
			this.aFloatArray6[2] = 0.0F;
			this.aFloatArray6[3] = 0.0F;
			local1.glTexGenfv(GL.GL_R, GL.GL_OBJECT_PLANE, this.aFloatArray6, 0);
		} else {
			Static17.method1600(Static3.anIntArray198[0]);
		}
	}
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class SpecularMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
	private int anInt2236 = -1;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "[I")
	private int[] anIntArray186 = null;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public SpecularMaterialRenderer() {
		if (GlRenderer.arbTextureCubeMapSupported && GlRenderer.maxTextureUnits >= 2) {
			this.method1784();
			@Pc(19) GL gl = GlRenderer.gl;
			gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[0]);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_R, GL.GL_CLAMP_TO_EDGE);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
			gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[1]);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_R, GL.GL_CLAMP_TO_EDGE);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
			gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[2]);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_R, GL.GL_CLAMP_TO_EDGE);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
			this.aBoolean150 = GlRenderer.maxTextureUnits < 3;
		}
		this.method1783();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "()V")
	@Override
	public void unbind() {
		@Pc(1) GL gl = GlRenderer.gl;
		if (Preferences.highDetailLighting) {
			gl.glCallList(this.anInt2236 + 1);
		} else {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	@Override
	public void setArgument(@OriginalArg(0) int arg) {
		@Pc(1) GL gl = GlRenderer.gl;
		if (Preferences.highDetailLighting && this.anIntArray186 != null) {
			gl.glActiveTexture(GL.GL_TEXTURE1);
			gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[arg - 1]);
			gl.glActiveTexture(GL.GL_TEXTURE0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "()V")
	private void method1783() {
		@Pc(1) GL gl = GlRenderer.gl;
		this.anInt2236 = gl.glGenLists(2);
		gl.glNewList(this.anInt2236, GL.GL_COMPILE);
		if (this.anIntArray186 == null) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
		} else {
			gl.glActiveTexture(GL.GL_TEXTURE1);
			gl.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_NORMAL_MAP);
			gl.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_NORMAL_MAP);
			gl.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_NORMAL_MAP);
			gl.glEnable(GL.GL_TEXTURE_GEN_S);
			gl.glEnable(GL.GL_TEXTURE_GEN_T);
			gl.glEnable(GL.GL_TEXTURE_GEN_R);
			gl.glEnable(GL.GL_TEXTURE_CUBE_MAP);
			gl.glMatrixMode(GL.GL_TEXTURE);
			gl.glLoadIdentity();
			gl.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
			gl.glMatrixMode(GL.GL_MODELVIEW);
			if (this.aBoolean150) {
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_ALPHA);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
			} else {
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
				gl.glActiveTexture(GL.GL_TEXTURE2);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_COMBINE);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC1_RGB, GL.GL_PREVIOUS);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND1_RGB, GL.GL_SRC_ALPHA);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
				gl.glBindTexture(GL.GL_TEXTURE_2D, GlRenderer.anInt2075);
				gl.glEnable(GL.GL_TEXTURE_2D);
			}
			gl.glActiveTexture(GL.GL_TEXTURE0);
		}
		gl.glEndList();
		gl.glNewList(this.anInt2236 + 1, GL.GL_COMPILE);
		if (this.anIntArray186 == null) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
		} else {
			gl.glActiveTexture(GL.GL_TEXTURE1);
			gl.glDisable(GL.GL_TEXTURE_GEN_S);
			gl.glDisable(GL.GL_TEXTURE_GEN_T);
			gl.glDisable(GL.GL_TEXTURE_GEN_R);
			gl.glDisable(GL.GL_TEXTURE_CUBE_MAP);
			gl.glMatrixMode(GL.GL_TEXTURE);
			gl.glLoadIdentity();
			gl.glMatrixMode(GL.GL_MODELVIEW);
			if (this.aBoolean150) {
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
			} else {
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
				gl.glActiveTexture(GL.GL_TEXTURE2);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_MODULATE);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND1_RGB, GL.GL_SRC_COLOR);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
				gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
				gl.glDisable(GL.GL_TEXTURE_2D);
			}
			gl.glActiveTexture(GL.GL_TEXTURE0);
		}
		gl.glEndList();
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "()I")
	@Override
	public int getFlags() {
		return 4;
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "()V")
	private void method1784() {
		@Pc(1) GL gl = GlRenderer.gl;
		if (this.anIntArray186 == null) {
			this.anIntArray186 = new int[3];
			gl.glGenTextures(3, this.anIntArray186, 0);
		}
		@Pc(19) byte[] local19 = new byte[4096];
		@Pc(22) byte[] local22 = new byte[4096];
		@Pc(25) byte[] local25 = new byte[4096];
		for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < 64; local34++) {
				for (@Pc(39) int local39 = 0; local39 < 64; local39++) {
					@Pc(51) float local51 = (float) local39 * 2.0F / 64.0F - 1.0F;
					@Pc(60) float local60 = (float) local34 * 2.0F / 64.0F - 1.0F;
					@Pc(75) float local75 = (float) (1.0D / Math.sqrt((double) (local51 * local51 + local60 * local60 + 1.0F)));
					local51 *= local75;
					local60 *= local75;
					@Pc(88) float local88;
					if (local27 == 0) {
						local88 = -local51;
					} else if (local27 == 1) {
						local88 = local51;
					} else if (local27 == 2) {
						local88 = local60;
					} else if (local27 == 3) {
						local88 = -local60;
					} else if (local27 == 4) {
						local88 = local75;
					} else {
						local88 = -local75;
					}
					@Pc(129) int local129;
					@Pc(137) int local137;
					@Pc(145) int local145;
					if (local88 > 0.0F) {
						local129 = (int) (Math.pow((double) local88, 96.0D) * 255.0D);
						local137 = (int) (Math.pow((double) local88, 36.0D) * 255.0D);
						local145 = (int) (Math.pow((double) local88, 12.0D) * 255.0D);
					} else {
						local145 = 0;
						local137 = 0;
						local129 = 0;
					}
					@Pc(159) int local159;
					@Pc(163) int local163;
					@Pc(167) int local167;
					if (GlRenderer.maxTextureUnits < 3) {
						local159 = local129 / 5;
						local163 = local137 / 5;
						local167 = local145 / 5;
					} else {
						local159 = local129 / 2;
						local163 = local137 / 2;
						local167 = local145 / 2;
					}
					local22[local32] = (byte) local159;
					local25[local32] = (byte) local163;
					local19[local32] = (byte) local167;
					local32++;
				}
			}
			gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[0]);
			gl.glTexImage2D(local27 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_ALPHA, 64, 64, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local22));
			gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[1]);
			gl.glTexImage2D(local27 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_ALPHA, 64, 64, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local25));
			gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[2]);
			gl.glTexImage2D(local27 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_ALPHA, 64, 64, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local19));
			GlCleaner.onCardTexture += 12288;
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "()V")
	@Override
	public void bind() {
		@Pc(1) GL gl = GlRenderer.gl;
		GlRenderer.setTextureCombineAlphaMode(1);
		if (Preferences.highDetailLighting) {
			gl.glCallList(this.anInt2236);
		} else {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
		}
	}
}

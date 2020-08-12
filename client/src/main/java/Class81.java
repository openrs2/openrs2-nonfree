import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class81 implements Interface2 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
	private int anInt2236 = -1;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "[I")
	private int[] anIntArray186 = null;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class81() {
		if (Static3.aBoolean128 && Static3.anInt2081 >= 2) {
			this.method1784();
			@Pc(19) GL local19 = Static3.aGL1;
			local19.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[0]);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_R, GL.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
			local19.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[1]);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_R, GL.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
			local19.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[2]);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_R, GL.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
			this.aBoolean150 = Static3.anInt2081 < 3;
		}
		this.method1783();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "()V")
	@Override
	public final void method3483() {
		@Pc(1) GL local1 = Static3.aGL1;
		if (Preferences.highDetailLighting) {
			local1.glCallList(this.anInt2236 + 1);
		} else {
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	@Override
	public final void method3486(@OriginalArg(0) int arg0) {
		@Pc(1) GL local1 = Static3.aGL1;
		if (Preferences.highDetailLighting && this.anIntArray186 != null) {
			local1.glActiveTexture(GL.GL_TEXTURE1);
			local1.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[arg0 - 1]);
			local1.glActiveTexture(GL.GL_TEXTURE0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "()V")
	private void method1783() {
		@Pc(1) GL local1 = Static3.aGL1;
		this.anInt2236 = local1.glGenLists(2);
		local1.glNewList(this.anInt2236, GL.GL_COMPILE);
		if (this.anIntArray186 == null) {
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
		} else {
			local1.glActiveTexture(GL.GL_TEXTURE1);
			local1.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_NORMAL_MAP);
			local1.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_NORMAL_MAP);
			local1.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_NORMAL_MAP);
			local1.glEnable(GL.GL_TEXTURE_GEN_S);
			local1.glEnable(GL.GL_TEXTURE_GEN_T);
			local1.glEnable(GL.GL_TEXTURE_GEN_R);
			local1.glEnable(GL.GL_TEXTURE_CUBE_MAP);
			local1.glMatrixMode(GL.GL_TEXTURE);
			local1.glLoadIdentity();
			local1.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
			local1.glMatrixMode(GL.GL_MODELVIEW);
			if (this.aBoolean150) {
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_ALPHA);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
			} else {
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
				local1.glActiveTexture(GL.GL_TEXTURE2);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_COMBINE);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC1_RGB, GL.GL_PREVIOUS);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND1_RGB, GL.GL_SRC_ALPHA);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
				local1.glBindTexture(GL.GL_TEXTURE_2D, Static3.anInt2075);
				local1.glEnable(GL.GL_TEXTURE_2D);
			}
			local1.glActiveTexture(GL.GL_TEXTURE0);
		}
		local1.glEndList();
		local1.glNewList(this.anInt2236 + 1, GL.GL_COMPILE);
		if (this.anIntArray186 == null) {
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
		} else {
			local1.glActiveTexture(GL.GL_TEXTURE1);
			local1.glDisable(GL.GL_TEXTURE_GEN_S);
			local1.glDisable(GL.GL_TEXTURE_GEN_T);
			local1.glDisable(GL.GL_TEXTURE_GEN_R);
			local1.glDisable(GL.GL_TEXTURE_CUBE_MAP);
			local1.glMatrixMode(GL.GL_TEXTURE);
			local1.glLoadIdentity();
			local1.glMatrixMode(GL.GL_MODELVIEW);
			if (this.aBoolean150) {
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_RGB, GL.GL_SRC_COLOR);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
			} else {
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
				local1.glActiveTexture(GL.GL_TEXTURE2);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_MODULATE);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND1_RGB, GL.GL_SRC_COLOR);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
				local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
				local1.glDisable(GL.GL_TEXTURE_2D);
			}
			local1.glActiveTexture(GL.GL_TEXTURE0);
		}
		local1.glEndList();
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "()I")
	@Override
	public final int method3485() {
		return 4;
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "()V")
	private void method1784() {
		@Pc(1) GL local1 = Static3.aGL1;
		if (this.anIntArray186 == null) {
			this.anIntArray186 = new int[3];
			local1.glGenTextures(3, this.anIntArray186, 0);
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
					if (Static3.anInt2081 < 3) {
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
			local1.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[0]);
			local1.glTexImage2D(local27 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_ALPHA, 64, 64, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local22));
			local1.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[1]);
			local1.glTexImage2D(local27 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_ALPHA, 64, 64, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local25));
			local1.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.anIntArray186[2]);
			local1.glTexImage2D(local27 + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_ALPHA, 64, 64, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local19));
			Static4.anInt3330 += 12288;
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "()V")
	@Override
	public final void method3484() {
		@Pc(1) GL local1 = Static3.aGL1;
		Static17.method1607(1);
		if (Preferences.highDetailLighting) {
			local1.glCallList(this.anInt2236);
		} else {
			local1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
		}
	}
}

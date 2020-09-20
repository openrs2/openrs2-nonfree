import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6 implements Material {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	private int anInt96 = -1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class6() {
		if (GlRenderer.arbTextureCubeMapSupported) {
			@Pc(11) GL local11 = GlRenderer.gl;
			this.anInt96 = local11.glGenLists(2);
			local11.glNewList(this.anInt96, GL.GL_COMPILE);
			local11.glActiveTexture(GL.GL_TEXTURE1);
			local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
			local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_PREVIOUS);
			local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
			local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
			local11.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_REFLECTION_MAP);
			local11.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_REFLECTION_MAP);
			local11.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_REFLECTION_MAP);
			local11.glEnable(GL.GL_TEXTURE_GEN_S);
			local11.glEnable(GL.GL_TEXTURE_GEN_T);
			local11.glEnable(GL.GL_TEXTURE_GEN_R);
			local11.glEnable(GL.GL_TEXTURE_CUBE_MAP);
			local11.glActiveTexture(GL.GL_TEXTURE0);
			local11.glEndList();
			local11.glNewList(this.anInt96 + 1, GL.GL_COMPILE);
			local11.glActiveTexture(GL.GL_TEXTURE1);
			local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
			local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_CONSTANT);
			local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
			local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
			local11.glDisable(GL.GL_TEXTURE_GEN_S);
			local11.glDisable(GL.GL_TEXTURE_GEN_T);
			local11.glDisable(GL.GL_TEXTURE_GEN_R);
			local11.glDisable(GL.GL_TEXTURE_CUBE_MAP);
			local11.glMatrixMode(GL.GL_TEXTURE);
			local11.glLoadIdentity();
			local11.glMatrixMode(GL.GL_MODELVIEW);
			local11.glActiveTexture(GL.GL_TEXTURE0);
			local11.glEndList();
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "()V")
	@Override
	public final void bind() {
		@Pc(5) GL local5 = GlRenderer.gl;
		GlRenderer.setTextureCombineAlphaMode(1);
		if (Static5.aClass4_Sub3_Sub10_6 == null || this.anInt96 < 0 || !Preferences.highDetailLighting) {
			local5.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
			return;
		}
		local5.glCallList(this.anInt96);
		local5.glActiveTexture(GL.GL_TEXTURE1);
		Static5.aClass4_Sub3_Sub10_6.method1834();
		local5.glMatrixMode(GL.GL_TEXTURE);
		local5.glLoadIdentity();
		local5.glRotatef(-((float) Static6.anInt4403 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static4.anInt3258 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glScalef(-1.0F, 1.0F, 1.0F);
		local5.glMatrixMode(GL.GL_MODELVIEW);
		local5.glActiveTexture(GL.GL_TEXTURE0);
		this.aBoolean7 = true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
	@Override
	public final void unbind() {
		@Pc(5) GL local5 = GlRenderer.gl;
		if (this.aBoolean7) {
			local5.glCallList(this.anInt96 + 1);
			this.aBoolean7 = false;
		} else {
			local5.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "()I")
	@Override
	public final int getFlags() {
		return 4;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	@Override
	public final void setArgument(@OriginalArg(0) int arg) {
	}
}

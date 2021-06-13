import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class MaterialRenderer7 implements MaterialRenderer {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	private int anInt96 = -1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public MaterialRenderer7() {
		if (GlRenderer.arbTextureCubeMapSupported) {
			@Pc(11) GL gl = GlRenderer.gl;
			this.anInt96 = gl.glGenLists(2);
			gl.glNewList(this.anInt96, GL.GL_COMPILE);
			gl.glActiveTexture(GL.GL_TEXTURE1);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_PREVIOUS);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
			gl.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_REFLECTION_MAP);
			gl.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_REFLECTION_MAP);
			gl.glTexGeni(GL.GL_R, GL.GL_TEXTURE_GEN_MODE, GL.GL_REFLECTION_MAP);
			gl.glEnable(GL.GL_TEXTURE_GEN_S);
			gl.glEnable(GL.GL_TEXTURE_GEN_T);
			gl.glEnable(GL.GL_TEXTURE_GEN_R);
			gl.glEnable(GL.GL_TEXTURE_CUBE_MAP);
			gl.glActiveTexture(GL.GL_TEXTURE0);
			gl.glEndList();
			gl.glNewList(this.anInt96 + 1, GL.GL_COMPILE);
			gl.glActiveTexture(GL.GL_TEXTURE1);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC2_RGB, GL.GL_CONSTANT);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
			gl.glDisable(GL.GL_TEXTURE_GEN_S);
			gl.glDisable(GL.GL_TEXTURE_GEN_T);
			gl.glDisable(GL.GL_TEXTURE_GEN_R);
			gl.glDisable(GL.GL_TEXTURE_CUBE_MAP);
			gl.glMatrixMode(GL.GL_TEXTURE);
			gl.glLoadIdentity();
			gl.glMatrixMode(GL.GL_MODELVIEW);
			gl.glActiveTexture(GL.GL_TEXTURE0);
			gl.glEndList();
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "()V")
	@Override
	public final void bind() {
		@Pc(5) GL gl = GlRenderer.gl;
		GlRenderer.setTextureCombineAlphaMode(1);
		if (Static5.aClass4_Sub3_Sub10_6 == null || this.anInt96 < 0 || !Preferences.highDetailLighting) {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_PRIMARY_COLOR);
			return;
		}
		gl.glCallList(this.anInt96);
		gl.glActiveTexture(GL.GL_TEXTURE1);
		Static5.aClass4_Sub3_Sub10_6.method1834();
		gl.glMatrixMode(GL.GL_TEXTURE);
		gl.glLoadIdentity();
		gl.glRotatef(-((float) Static6.anInt4403 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		gl.glRotatef(-((float) Static4.anInt3258 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		gl.glScalef(-1.0F, 1.0F, 1.0F);
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		this.aBoolean7 = true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
	@Override
	public final void unbind() {
		@Pc(5) GL gl = GlRenderer.gl;
		if (this.aBoolean7) {
			gl.glCallList(this.anInt96 + 1);
			this.aBoolean7 = false;
		} else {
			gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_ALPHA, GL.GL_TEXTURE);
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

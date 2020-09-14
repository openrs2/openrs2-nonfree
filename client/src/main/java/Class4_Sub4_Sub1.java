import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "Lclient!pf;")
	private Class134 aClass134_1;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "Lclient!pf;")
	private Class134 aClass134_2;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "Lclient!pf;")
	private Class134 aClass134_3;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "Lclient!pf;")
	private Class134 aClass134_4;

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
	private int anInt933 = -1;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
	private int anInt934 = Static6.anInt5144;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
	private int anInt935 = -1;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	private int anInt936 = -1;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
	private int anInt937 = -1;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIIII)V")
	@Override
	public final void method761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = GlRenderer.gl;
		local1.glPushAttrib(GL.GL_VIEWPORT_BIT);
		local1.glMatrixMode(GL.GL_PROJECTION);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		if (this.anIntArray66 == null) {
			local1.glBindTexture(GL.GL_TEXTURE_RECTANGLE, arg3);
			Static9.method216(this.anInt933);
			local1.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
			local1.glViewport(0, 0, 256, 256);
			@Pc(272) int local272 = this.aClass134_4.anInt4123;
			local1.glUseProgramObjectARB(local272);
			local1.glUniform1iARB(local1.glGetUniformLocation(local272, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local272, "params"), Static2.aFloat26, 0.0F, 0.0F);
			local1.glBegin(GL.GL_QUADS);
			local1.glTexCoord2f(0.0F, 0.0F);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2f((float) arg1, 0.0F);
			local1.glVertex2i(1, 0);
			local1.glTexCoord2f((float) arg1, (float) arg2);
			local1.glVertex2i(1, 1);
			local1.glTexCoord2f(0.0F, (float) arg2);
			local1.glVertex2i(0, 1);
			local1.glEnd();
		} else {
			Static9.method216(this.anInt936);
			@Pc(29) int local29 = IntUtils.flp2(arg1);
			@Pc(33) int local33 = IntUtils.flp2(arg2);
			@Pc(35) int local35 = 0;
			while (local29 > 256 || local33 > 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT0, GL.GL_TEXTURE_2D, this.anIntArray66[local35], 0);
				if (local35 == 0) {
					local1.glEnable(GL.GL_TEXTURE_RECTANGLE);
					local1.glBindTexture(GL.GL_TEXTURE_RECTANGLE, arg3);
					local1.glBegin(GL.GL_QUADS);
					local1.glTexCoord2f(0.0F, 0.0F);
					local1.glVertex2i(0, 0);
					local1.glTexCoord2f((float) arg1, 0.0F);
					local1.glVertex2i(1, 0);
					local1.glTexCoord2f((float) arg1, (float) arg2);
					local1.glVertex2i(1, 1);
					local1.glTexCoord2f(0.0F, (float) arg2);
					local1.glVertex2i(0, 1);
					local1.glEnd();
					local1.glDisable(GL.GL_TEXTURE_RECTANGLE);
				} else {
					GlRenderer.setTextureId(this.anIntArray66[local35 - 1]);
					local1.glBegin(GL.GL_QUADS);
					local1.glTexCoord2f(0.0F, 0.0F);
					local1.glVertex2i(0, 0);
					local1.glTexCoord2f(1.0F, 0.0F);
					local1.glVertex2i(1, 0);
					local1.glTexCoord2f(1.0F, 1.0F);
					local1.glVertex2i(1, 1);
					local1.glTexCoord2f(0.0F, 1.0F);
					local1.glVertex2i(0, 1);
					local1.glEnd();
				}
				if (local29 > 256) {
					local29 >>= 1;
				}
				if (local33 > 256) {
					local33 >>= 1;
				}
				local35++;
			}
			Static9.method215();
			GlRenderer.setTextureId(this.anIntArray66[local35 - 1]);
			Static9.method216(this.anInt933);
			local1.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass134_2.anInt4123;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static2.aFloat26, 0.0F, 0.0F);
			local1.glBegin(GL.GL_QUADS);
			local1.glTexCoord2f(0.0F, 0.0F);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2f(1.0F, 0.0F);
			local1.glVertex2i(1, 0);
			local1.glTexCoord2f(1.0F, 1.0F);
			local1.glVertex2i(1, 1);
			local1.glTexCoord2f(0.0F, 1.0F);
			local1.glVertex2i(0, 1);
			local1.glEnd();
		}
		local1.glDrawBuffer(GL.GL_COLOR_ATTACHMENT1);
		GlRenderer.setTextureId(this.anInt937);
		@Pc(342) int local342 = this.aClass134_3.anInt4123;
		local1.glUseProgramObjectARB(local342);
		local1.glUniform1iARB(local1.glGetUniformLocation(local342, "baseTex"), 0);
		local1.glUniform3fARB(local1.glGetUniformLocation(local342, "step"), 0.00390625F, 0.0F, 0.0F);
		local1.glBegin(GL.GL_QUADS);
		local1.glTexCoord2f(0.0F, 0.0F);
		local1.glVertex2i(0, 0);
		local1.glTexCoord2f(1.0F, 0.0F);
		local1.glVertex2i(1, 0);
		local1.glTexCoord2f(1.0F, 1.0F);
		local1.glVertex2i(1, 1);
		local1.glTexCoord2f(0.0F, 1.0F);
		local1.glVertex2i(0, 1);
		local1.glEnd();
		local1.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
		GlRenderer.setTextureId(this.anInt935);
		local1.glUniform3fARB(local1.glGetUniformLocation(local342, "step"), 0.0F, 0.00390625F, 0.0F);
		local1.glBegin(GL.GL_QUADS);
		local1.glTexCoord2f(0.0F, 0.0F);
		local1.glVertex2i(0, 0);
		local1.glTexCoord2f(1.0F, 0.0F);
		local1.glVertex2i(1, 0);
		local1.glTexCoord2f(1.0F, 1.0F);
		local1.glVertex2i(1, 1);
		local1.glTexCoord2f(0.0F, 1.0F);
		local1.glVertex2i(0, 1);
		local1.glEnd();
		local1.glPopAttrib();
		local1.glPopMatrix();
		local1.glMatrixMode(GL.GL_MODELVIEW);
		Static9.method215();
		@Pc(462) int local462 = this.aClass134_1.anInt4123;
		local1.glUseProgramObjectARB(local462);
		local1.glUniform1iARB(local1.glGetUniformLocation(local462, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local462, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local462, "params"), Static2.aFloat25, Static2.aFloat27, 0.0F);
		local1.glActiveTexture(GL.GL_TEXTURE1);
		local1.glBindTexture(GL.GL_TEXTURE_2D, this.anInt937);
		local1.glActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	@Override
	public final void method765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = GlRenderer.gl;
		@Pc(5) int local5 = IntUtils.flp2(arg0);
		@Pc(9) int local9 = IntUtils.flp2(arg1);
		if (this.anIntArray66 != null) {
			local1.glDeleteTextures(this.anIntArray66.length, this.anIntArray66, 0);
			this.anIntArray66 = null;
		}
		if (this.anInt934 == Static6.anInt5144 && (local5 > 256 || local9 > 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt936 == -1) {
				this.anInt936 = Static9.method210();
			}
			while (local35 > 256 || local37 > 256) {
				if (local35 > 256) {
					local35 >>= 1;
				}
				if (local37 > 256) {
					local37 >>= 1;
				}
				local39++;
			}
			this.anIntArray66 = new int[local39];
			@Pc(74) int local74 = local5;
			@Pc(76) int local76 = local9;
			@Pc(78) int local78 = 0;
			while (local74 > 256 || local76 > 256) {
				this.anIntArray66[local78++] = Static33.method4168(Static6.anInt5133, Static6.anInt5139, local74, local76, Static6.anInt5144, Static6.anInt5144, Static6.anInt5136, Static6.anInt5147, null);
				if (local74 > 256) {
					local74 >>= 1;
				}
				if (local76 > 256) {
					local76 >>= 1;
				}
			}
		} else if (this.anInt936 != -1) {
			Static9.method211(this.anInt936);
			this.anInt936 = -1;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "()V")
	@Override
	public final void method760() {
		if (this.anIntArray66 != null) {
			GlRenderer.gl.glDeleteTextures(this.anIntArray66.length, this.anIntArray66, 0);
			this.anIntArray66 = null;
		}
		if (this.anInt936 != -1) {
			Static9.method211(this.anInt936);
			this.anInt936 = -1;
		}
		if (this.anInt933 != -1) {
			Static9.method211(this.anInt933);
			this.anInt933 = -1;
		}
		if (this.anInt937 != -1) {
			Static33.method4169(this.anInt937);
			this.anInt937 = -1;
		}
		if (this.anInt935 != -1) {
			Static33.method4169(this.anInt935);
			this.anInt935 = -1;
		}
		this.aClass134_4 = null;
		this.aClass134_2 = null;
		this.aClass134_1 = null;
		this.aClass134_3 = null;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "()Z")
	@Override
	public final boolean method766() {
		return this.anInt933 != -1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
	@Override
	public final int method754() {
		return 1;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	@Override
	public final void method756(@OriginalArg(0) int arg0) {
		GlRenderer.gl.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "()Z")
	@Override
	public final boolean method762() {
		if (!GlRenderer.arbFboSupported || !GlRenderer.arbFragmentShaderSupported || !GlRenderer.arbTextureFloatSupported) {
			return false;
		}
		@Pc(7) GL local7 = GlRenderer.gl;
		this.anInt933 = Static9.method210();
		this.anInt937 = Static33.method4168(Static6.anInt5133, Static6.anInt5139, 256, 256, Static6.anInt5144, Static6.anInt5144, Static6.anInt5136, Static6.anInt5147, null);
		local7.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		local7.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
		this.anInt935 = Static33.method4168(Static6.anInt5133, Static6.anInt5139, 256, 256, Static6.anInt5144, Static6.anInt5144, Static6.anInt5136, Static6.anInt5147, null);
		local7.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		local7.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
		Static9.method216(this.anInt933);
		local7.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT0, GL.GL_TEXTURE_2D, this.anInt937, 0);
		local7.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT1, GL.GL_TEXTURE_2D, this.anInt935, 0);
		local7.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
		if (!Static9.method217()) {
			this.anInt934 = Static6.anInt5145;
			GlRenderer.setTextureId(this.anInt937);
			local7.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
			local7.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
			GlRenderer.setTextureId(this.anInt935);
			local7.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
			local7.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
			if (!Static9.method217()) {
				Static9.method215();
				return false;
			}
		}
		Static9.method215();
		this.aClass134_4 = Static29.method3402(new GlShader[] { GlShader.create("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", GlShader.GL_FRAGMENT_SHADER) });
		this.aClass134_2 = Static29.method3402(new GlShader[] { GlShader.create("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", GlShader.GL_FRAGMENT_SHADER) });
		this.aClass134_1 = Static29.method3402(new GlShader[] { GlShader.create("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", GlShader.GL_FRAGMENT_SHADER) });
		this.aClass134_3 = Static29.method3402(new GlShader[] { GlShader.create("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", GlShader.GL_FRAGMENT_SHADER) });
		return this.aClass134_2 != null && this.aClass134_4 != null && this.aClass134_1 != null && this.aClass134_3 != null;
	}
}

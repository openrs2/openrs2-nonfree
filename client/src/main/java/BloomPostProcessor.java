import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class BloomPostProcessor extends PostProcessor {

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "Lclient!pf;")
	private GlProgram aClass134_1;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "Lclient!pf;")
	private GlProgram aClass134_2;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "Lclient!pf;")
	private GlProgram aClass134_3;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "Lclient!pf;")
	private GlProgram aClass134_4;

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
	private int anInt933 = -1;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
	private int anInt934 = GlTextureAllocator.GL_LINEAR;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
	private int anInt935 = -1;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	private int anInt936 = -1;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
	private int anInt937 = -1;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIIII)V")
	@Override
	public void preProcess(@OriginalArg(0) int colorAttachment, @OriginalArg(1) int width, @OriginalArg(2) int height, @OriginalArg(3) int colorBuffer, @OriginalArg(4) int depthBuffer) {
		@Pc(1) GL gl = GlRenderer.gl;
		gl.glPushAttrib(GL.GL_VIEWPORT_BIT);
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		if (this.anIntArray66 == null) {
			gl.glBindTexture(GL.GL_TEXTURE_RECTANGLE, colorBuffer);
			GlFrameBufferAllocator.pushFrameBuffer(this.anInt933);
			gl.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
			gl.glViewport(0, 0, 256, 256);
			@Pc(272) int local272 = this.aClass134_4.id;
			gl.glUseProgramObjectARB(local272);
			gl.glUniform1iARB(gl.glGetUniformLocation(local272, "sceneTex"), 0);
			gl.glUniform3fARB(gl.glGetUniformLocation(local272, "params"), Static2.aFloat26, 0.0F, 0.0F);
			gl.glBegin(GL.GL_QUADS);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2i(0, 0);
			gl.glTexCoord2f((float) width, 0.0F);
			gl.glVertex2i(1, 0);
			gl.glTexCoord2f((float) width, (float) height);
			gl.glVertex2i(1, 1);
			gl.glTexCoord2f(0.0F, (float) height);
			gl.glVertex2i(0, 1);
			gl.glEnd();
		} else {
			GlFrameBufferAllocator.pushFrameBuffer(this.anInt936);
			@Pc(29) int local29 = IntUtils.flp2(width);
			@Pc(33) int local33 = IntUtils.flp2(height);
			@Pc(35) int local35 = 0;
			while (local29 > 256 || local33 > 256) {
				gl.glViewport(0, 0, local29, local33);
				gl.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT0, GL.GL_TEXTURE_2D, this.anIntArray66[local35], 0);
				if (local35 == 0) {
					gl.glEnable(GL.GL_TEXTURE_RECTANGLE);
					gl.glBindTexture(GL.GL_TEXTURE_RECTANGLE, colorBuffer);
					gl.glBegin(GL.GL_QUADS);
					gl.glTexCoord2f(0.0F, 0.0F);
					gl.glVertex2i(0, 0);
					gl.glTexCoord2f((float) width, 0.0F);
					gl.glVertex2i(1, 0);
					gl.glTexCoord2f((float) width, (float) height);
					gl.glVertex2i(1, 1);
					gl.glTexCoord2f(0.0F, (float) height);
					gl.glVertex2i(0, 1);
					gl.glEnd();
					gl.glDisable(GL.GL_TEXTURE_RECTANGLE);
				} else {
					GlRenderer.setTextureId(this.anIntArray66[local35 - 1]);
					gl.glBegin(GL.GL_QUADS);
					gl.glTexCoord2f(0.0F, 0.0F);
					gl.glVertex2i(0, 0);
					gl.glTexCoord2f(1.0F, 0.0F);
					gl.glVertex2i(1, 0);
					gl.glTexCoord2f(1.0F, 1.0F);
					gl.glVertex2i(1, 1);
					gl.glTexCoord2f(0.0F, 1.0F);
					gl.glVertex2i(0, 1);
					gl.glEnd();
				}
				if (local29 > 256) {
					local29 >>= 1;
				}
				if (local33 > 256) {
					local33 >>= 1;
				}
				local35++;
			}
			GlFrameBufferAllocator.popFrameBuffer();
			GlRenderer.setTextureId(this.anIntArray66[local35 - 1]);
			GlFrameBufferAllocator.pushFrameBuffer(this.anInt933);
			gl.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
			gl.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass134_2.id;
			gl.glUseProgramObjectARB(local195);
			gl.glUniform1iARB(gl.glGetUniformLocation(local195, "sceneTex"), 0);
			gl.glUniform3fARB(gl.glGetUniformLocation(local195, "params"), Static2.aFloat26, 0.0F, 0.0F);
			gl.glBegin(GL.GL_QUADS);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2i(0, 0);
			gl.glTexCoord2f(1.0F, 0.0F);
			gl.glVertex2i(1, 0);
			gl.glTexCoord2f(1.0F, 1.0F);
			gl.glVertex2i(1, 1);
			gl.glTexCoord2f(0.0F, 1.0F);
			gl.glVertex2i(0, 1);
			gl.glEnd();
		}
		gl.glDrawBuffer(GL.GL_COLOR_ATTACHMENT1);
		GlRenderer.setTextureId(this.anInt937);
		@Pc(342) int local342 = this.aClass134_3.id;
		gl.glUseProgramObjectARB(local342);
		gl.glUniform1iARB(gl.glGetUniformLocation(local342, "baseTex"), 0);
		gl.glUniform3fARB(gl.glGetUniformLocation(local342, "step"), 0.00390625F, 0.0F, 0.0F);
		gl.glBegin(GL.GL_QUADS);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2i(0, 0);
		gl.glTexCoord2f(1.0F, 0.0F);
		gl.glVertex2i(1, 0);
		gl.glTexCoord2f(1.0F, 1.0F);
		gl.glVertex2i(1, 1);
		gl.glTexCoord2f(0.0F, 1.0F);
		gl.glVertex2i(0, 1);
		gl.glEnd();
		gl.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
		GlRenderer.setTextureId(this.anInt935);
		gl.glUniform3fARB(gl.glGetUniformLocation(local342, "step"), 0.0F, 0.00390625F, 0.0F);
		gl.glBegin(GL.GL_QUADS);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2i(0, 0);
		gl.glTexCoord2f(1.0F, 0.0F);
		gl.glVertex2i(1, 0);
		gl.glTexCoord2f(1.0F, 1.0F);
		gl.glVertex2i(1, 1);
		gl.glTexCoord2f(0.0F, 1.0F);
		gl.glVertex2i(0, 1);
		gl.glEnd();
		gl.glPopAttrib();
		gl.glPopMatrix();
		gl.glMatrixMode(GL.GL_MODELVIEW);
		GlFrameBufferAllocator.popFrameBuffer();
		@Pc(462) int local462 = this.aClass134_1.id;
		gl.glUseProgramObjectARB(local462);
		gl.glUniform1iARB(gl.glGetUniformLocation(local462, "sceneTex"), 0);
		gl.glUniform1iARB(gl.glGetUniformLocation(local462, "bloomTex"), 1);
		gl.glUniform3fARB(gl.glGetUniformLocation(local462, "params"), Static2.aFloat25, Static2.aFloat27, 0.0F);
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glBindTexture(GL.GL_TEXTURE_2D, this.anInt937);
		gl.glActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	@Override
	public void setSize(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		@Pc(1) GL gl = GlRenderer.gl;
		@Pc(5) int local5 = IntUtils.flp2(width);
		@Pc(9) int local9 = IntUtils.flp2(height);
		if (this.anIntArray66 != null) {
			gl.glDeleteTextures(this.anIntArray66.length, this.anIntArray66, 0);
			this.anIntArray66 = null;
		}
		if (this.anInt934 == GlTextureAllocator.GL_LINEAR && (local5 > 256 || local9 > 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt936 == -1) {
				this.anInt936 = GlFrameBufferAllocator.allocateFrameBuffer();
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
				this.anIntArray66[local78++] = GlTextureAllocator.allocateTextureAndStorage2d(GlTextureAllocator.GL_TEXTURE_2D, GlTextureAllocator.GL_RGBA16F, local74, local76, GlTextureAllocator.GL_LINEAR, GlTextureAllocator.GL_LINEAR, GlTextureAllocator.GL_RGBA, GlTextureAllocator.GL_UNSIGNED_BYTE, null);
				if (local74 > 256) {
					local74 >>= 1;
				}
				if (local76 > 256) {
					local76 >>= 1;
				}
			}
		} else if (this.anInt936 != -1) {
			GlFrameBufferAllocator.freeFrameBuffer(this.anInt936);
			this.anInt936 = -1;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "()V")
	@Override
	public void quit() {
		if (this.anIntArray66 != null) {
			GlRenderer.gl.glDeleteTextures(this.anIntArray66.length, this.anIntArray66, 0);
			this.anIntArray66 = null;
		}
		if (this.anInt936 != -1) {
			GlFrameBufferAllocator.freeFrameBuffer(this.anInt936);
			this.anInt936 = -1;
		}
		if (this.anInt933 != -1) {
			GlFrameBufferAllocator.freeFrameBuffer(this.anInt933);
			this.anInt933 = -1;
		}
		if (this.anInt937 != -1) {
			GlTextureAllocator.freeTexture(this.anInt937);
			this.anInt937 = -1;
		}
		if (this.anInt935 != -1) {
			GlTextureAllocator.freeTexture(this.anInt935);
			this.anInt935 = -1;
		}
		this.aClass134_4 = null;
		this.aClass134_2 = null;
		this.aClass134_1 = null;
		this.aClass134_3 = null;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "()Z")
	@Override
	public boolean isInitialised() {
		return this.anInt933 != -1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
	@Override
	public int getColorDepth() {
		return 1;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	@Override
	public void postProcess(@OriginalArg(0) int colorAttachment) {
		GlRenderer.gl.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "()Z")
	@Override
	public boolean init() {
		if (!GlRenderer.arbFboSupported || !GlRenderer.arbFragmentShaderSupported || !GlRenderer.arbTextureFloatSupported) {
			return false;
		}
		@Pc(7) GL gl = GlRenderer.gl;
		this.anInt933 = GlFrameBufferAllocator.allocateFrameBuffer();
		this.anInt937 = GlTextureAllocator.allocateTextureAndStorage2d(GlTextureAllocator.GL_TEXTURE_2D, GlTextureAllocator.GL_RGBA16F, 256, 256, GlTextureAllocator.GL_LINEAR, GlTextureAllocator.GL_LINEAR, GlTextureAllocator.GL_RGBA, GlTextureAllocator.GL_UNSIGNED_BYTE, null);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
		this.anInt935 = GlTextureAllocator.allocateTextureAndStorage2d(GlTextureAllocator.GL_TEXTURE_2D, GlTextureAllocator.GL_RGBA16F, 256, 256, GlTextureAllocator.GL_LINEAR, GlTextureAllocator.GL_LINEAR, GlTextureAllocator.GL_RGBA, GlTextureAllocator.GL_UNSIGNED_BYTE, null);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
		GlFrameBufferAllocator.pushFrameBuffer(this.anInt933);
		gl.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT0, GL.GL_TEXTURE_2D, this.anInt937, 0);
		gl.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT1, GL.GL_TEXTURE_2D, this.anInt935, 0);
		gl.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
		if (!GlFrameBufferAllocator.isFrameBufferComplete()) {
			this.anInt934 = GlTextureAllocator.GL_NEAREST;
			GlRenderer.setTextureId(this.anInt937);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
			GlRenderer.setTextureId(this.anInt935);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
			if (!GlFrameBufferAllocator.isFrameBufferComplete()) {
				GlFrameBufferAllocator.popFrameBuffer();
				return false;
			}
		}
		GlFrameBufferAllocator.popFrameBuffer();
		this.aClass134_4 = GlProgram.create(new GlShader[] { GlShader.create("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", GlShader.GL_FRAGMENT_SHADER) });
		this.aClass134_2 = GlProgram.create(new GlShader[] { GlShader.create("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", GlShader.GL_FRAGMENT_SHADER) });
		this.aClass134_1 = GlProgram.create(new GlShader[] { GlShader.create("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", GlShader.GL_FRAGMENT_SHADER) });
		this.aClass134_3 = GlProgram.create(new GlShader[] { GlShader.create("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", GlShader.GL_FRAGMENT_SHADER) });
		return this.aClass134_2 != null && this.aClass134_4 != null && this.aClass134_1 != null && this.aClass134_3 != null;
	}
}

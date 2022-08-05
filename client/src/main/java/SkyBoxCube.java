import java.nio.IntBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class SkyBoxCube extends SecondaryNode {

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Lclient!dj;")
	public static final LruHashTable cache = new LruHashTable(4);

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "[I")
	private static final int[] clip = new int[4];

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "[F")
	private static final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "[I")
	private static int[] anIntArray194 = null;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	private static int staticContextId = -1;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIIIII)Lclient!ib;")
	public static SkyBoxCube create(@OriginalArg(0) int texture0, @OriginalArg(1) int texture1, @OriginalArg(2) int texture2, @OriginalArg(3) int texture3, @OriginalArg(4) int texture4, @OriginalArg(5) int texture5) {
		@Pc(29) long key = (long) texture0 * 67481L ^ (long) texture1 * 97549L ^ (long) texture2 * 475427L ^ (long) texture3 * 986053L ^ (long) texture4 * 32147369L ^ (long) texture5 * 76724863L;
		@Pc(35) SkyBoxCube skyBox = (SkyBoxCube) cache.get(key);
		if (skyBox == null) {
			@Pc(49) SkyBoxCube newSkyBox = new SkyBoxCube(texture0, texture1, texture2, texture3, texture4, texture5);
			cache.put(key, newSkyBox);
			return newSkyBox;
		} else {
			return skyBox;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IIII)Z")
	private static boolean method1837(@OriginalArg(0) GL gl, @OriginalArg(1) int srcTexture, @OriginalArg(2) int srcTextureTarget, @OriginalArg(3) int size, @OriginalArg(4) int destTexture) {
		GlRenderer.setTextureId(destTexture);
		gl.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT0, srcTextureTarget, srcTexture, 0);
		gl.glReadBuffer(GL.GL_COLOR_ATTACHMENT0);
		@Pc(15) int status = gl.glCheckFramebufferStatusEXT(GL.GL_FRAMEBUFFER);
		if (status == GL.GL_FRAMEBUFFER_COMPLETE) {
			gl.glCopyTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGB, 0, 0, size, size, GL.GL_POINTS);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "[I")
	private int[] textures;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	private int contextId;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	private int id = -1;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	private int state = 0;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	private int bytes = 0;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	private int size = -1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public SkyBoxCube() {
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIII)V")
	private SkyBoxCube(@OriginalArg(0) int texture0, @OriginalArg(1) int texture1, @OriginalArg(2) int texture2, @OriginalArg(3) int texture3, @OriginalArg(4) int texture4, @OriginalArg(5) int texture5) {
		this.textures = new int[6];
		this.textures[0] = texture0;
		this.textures[1] = texture1;
		this.textures[2] = texture2;
		this.textures[3] = texture3;
		this.textures[4] = texture4;
		this.textures[5] = texture5;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
	private void method1832() {
		if (this.id >= 0 && this.contextId == GlCleaner.contextId) {
			return;
		}
		@Pc(8) GL gl = GlRenderer.gl;
		@Pc(11) int[] temp = new int[1];
		gl.glGenTextures(1, temp, 0);
		this.id = temp[0];
		gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.id);
		gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_R, GL.GL_CLAMP_TO_EDGE);
		gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
		this.contextId = GlCleaner.contextId;
		this.state = 0;
	}

	@OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.id != -1) {
			GlCleaner.deleteTexture(this.id, this.bytes, this.contextId);
			this.id = -1;
			this.bytes = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
	public final void method1834() {
		@Pc(1) GL gl = GlRenderer.gl;
		this.method1832();
		gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.id);
		if (this.textures == null || this.state == 2) {
			return;
		}
		if (this.isReady()) {
			@Pc(20) int size = -1;
			for (@Pc(22) int i = 0; i < 6; i++) {
				@Pc(30) int texture = this.textures[i];
				this.size = Rasteriser.textureProvider.isLowDetail(texture) ? 64 : 128;
				if (i <= 0) {
					size = this.size;
				} else if (this.size != size) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer buffer = IntBuffer.wrap(Rasteriser.textureProvider.getPixels(texture));
				gl.glTexImage2D(i + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_RGB, size, size, GL.GL_POINTS, GL.GL_BGRA, GL.GL_UNSIGNED_BYTE, buffer);
			}
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			@Pc(93) int bytes = size * size * 6 * 3;
			GlCleaner.onCardTexture += bytes - this.bytes;
			this.bytes = bytes;
			this.state = 2;
		} else if (this.state != 1) {
			for (@Pc(113) int i = 0; i < 6; i++) {
				@Pc(127) IntBuffer buffer = IntBuffer.wrap(ColorUtils.HSL_TO_RGB, Rasteriser.textureProvider.getAverageColor(this.textures[i]), 1);
				gl.glTexImage2D(i + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_RGB, 1, 1, GL.GL_POINTS, GL.GL_BGRA, GL.GL_UNSIGNED_BYTE, buffer);
				GlCleaner.onCardTexture += 3 - this.bytes;
				this.bytes = 3;
			}
			this.state = 1;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ib;Lclient!ib;F)Lclient!ib;")
	public final SkyBoxCube method1835(@OriginalArg(0) SkyBoxCube arg0, @OriginalArg(1) SkyBoxCube arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL gl = GlRenderer.gl;
		@Pc(10) SkyBoxCube local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!GlRenderer.arbFboSupported) {
			return local10;
		}
		this.method1832();
		if (anIntArray194 == null || staticContextId != GlCleaner.contextId) {
			anIntArray194 = new int[2];
			gl.glGenTextures(2, anIntArray194, 0);
			for (@Pc(31) int i = 0; i < 2; i++) {
				GlRenderer.setTextureId(anIntArray194[i]);
				gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
				gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
			}
			staticContextId = GlCleaner.contextId;
		}
		@Pc(63) int maxSize = arg0.size > arg1.size ? arg0.size : arg1.size;
		if (this.size != maxSize) {
			this.size = maxSize;
			gl.glBindTexture(GL.GL_TEXTURE_CUBE_MAP, this.id);
			for (@Pc(77) int i = 0; i < 6; i++) {
				gl.glTexImage2D(i + GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X, GL.GL_POINTS, GL.GL_RGB, this.size, this.size, GL.GL_POINTS, GL.GL_RGB, GL.GL_UNSIGNED_BYTE, null);
			}
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_CUBE_MAP, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		}
		arg0.method1834();
		arg1.method1834();
		GlRaster.getClip(clip);
		GlRaster.resetClip();
		GlFrameBufferAllocator.pushFrameBuffer(GlRenderer.method1614());
		gl.glPushAttrib(GL.GL_VIEWPORT_BIT);
		GlRenderer.setFogEnabled(false);
		GlRenderer.setLightingEnabled(false);
		GlRenderer.setDepthTestEnabled(false);
		GlRenderer.setTextureCombineRgbMode(1);
		GlRenderer.setTextureCombineAlphaMode(1);
		gl.glDisable(GL.GL_BLEND);
		gl.glDisable(GL.GL_ALPHA_TEST);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glOrtho(0.0D, this.size, 0.0D, this.size, -1.0D, 1.0D);
		gl.glViewport(0, 0, this.size, this.size);
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glBindTexture(GL.GL_TEXTURE_2D, anIntArray194[1]);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_INTERPOLATE);
		aFloatArray23[3] = arg2;
		gl.glTexEnvfv(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_COLOR, aFloatArray23, 0);
		gl.glEnable(GL.GL_TEXTURE_2D);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		@Pc(203) boolean frameBufferValid = true;
		for (@Pc(205) int i = 0; i < 6; i++) {
			@Pc(212) int textureTarget = i + 34069;
			if (!method1837(gl, arg0.id, textureTarget, arg0.size, anIntArray194[0])) {
				frameBufferValid = false;
				break;
			}
			if (!method1837(gl, arg1.id, textureTarget, arg1.size, anIntArray194[1])) {
				frameBufferValid = false;
				break;
			}
			gl.glFramebufferTexture2DEXT(GL.GL_FRAMEBUFFER, GL.GL_COLOR_ATTACHMENT0, textureTarget, this.id, 0);
			gl.glDrawBuffer(GL.GL_COLOR_ATTACHMENT0);
			@Pc(255) int status = gl.glCheckFramebufferStatusEXT(GL.GL_FRAMEBUFFER);
			if (status != GL.GL_FRAMEBUFFER_COMPLETE) {
				frameBufferValid = false;
				break;
			}
			GlRenderer.setTextureId(anIntArray194[0]);
			gl.glBegin(GL.GL_QUADS);
			gl.glTexCoord2i(0, 0);
			gl.glMultiTexCoord2i(GL.GL_TEXTURE1, 0, 0);
			gl.glVertex2i(0, 0);
			gl.glTexCoord2i(1, 0);
			gl.glMultiTexCoord2i(GL.GL_TEXTURE1, 1, 0);
			gl.glVertex2i(this.size, 0);
			gl.glTexCoord2i(1, 1);
			gl.glMultiTexCoord2i(GL.GL_TEXTURE1, 1, 1);
			gl.glVertex2i(this.size, this.size);
			gl.glTexCoord2i(0, 1);
			gl.glMultiTexCoord2i(GL.GL_TEXTURE1, 0, 1);
			gl.glVertex2i(0, this.size);
			gl.glEnd();
		}
		gl.glPopMatrix();
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glPopMatrix();
		GlRenderer.setDepthTestEnabled(true);
		GlRenderer.setLightingEnabled(true);
		GlRenderer.setFogEnabled(true);
		gl.glEnable(GL.GL_ALPHA_TEST);
		gl.glEnable(GL.GL_BLEND);
		gl.glPopAttrib();
		GlFrameBufferAllocator.popFrameBuffer();
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		gl.glDisable(GL.GL_TEXTURE_2D);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		GlRaster.setClip(clip);
		return frameBufferValid ? this : local10;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()Z")
	private boolean isReady() {
		for (@Pc(1) int i = 0; i < 6; i++) {
			if (!Rasteriser.textureProvider.isGlTextureReady(this.textures[i])) {
				return false;
			}
		}
		return true;
	}
}

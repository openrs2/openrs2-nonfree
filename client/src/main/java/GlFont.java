import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class GlFont extends Font {

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
	private int contextId;

	@OriginalMember(owner = "client!dh", name = "W", descriptor = "[I")
	private int[] listIds;

	@OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
	private int powerOfTwoSize;

	@OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
	private int textureId = -1;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public GlFont(@OriginalArg(0) byte[] bytes, @OriginalArg(1) int[] xOffsets, @OriginalArg(2) int[] yOffsets, @OriginalArg(3) int[] innerWidths, @OriginalArg(4) int[] innerHeights, @OriginalArg(5) byte[][] pixels) {
		super(bytes, xOffsets, yOffsets, innerWidths, innerHeights);
		this.createTexture(pixels);
		this.createLists();
	}

	@OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.textureId != -1) {
			GlCleaner.deleteTexture2d(this.textureId, this.size, this.contextId);
			this.textureId = -1;
			this.size = 0;
		}
		if (this.listIds != null) {
			for (@Pc(21) int i = 0; i < this.listIds.length; i++) {
				GlCleaner.deleteList(this.listIds[i], this.contextId);
			}
			this.listIds = null;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void renderGlyphTransparent(@OriginalArg(0) int glyph, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int color, @OriginalArg(6) int alpha) {
		GlRenderer.method1590();
		@Pc(2) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		gl.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color, alpha > 255 ? -1 : (byte) alpha);
		gl.glTranslatef((float) x, (float) (GlRenderer.canvasHeight - y), 0.0F);
		gl.glCallList(this.listIds[glyph]);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void renderGlyph(@OriginalArg(0) int glyph, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int color) {
		if (GlRaster.mask == null) {
			GlRenderer.method1590();
			@Pc(226) GL gl = GlRenderer.gl;
			GlRenderer.setTextureId(this.textureId);
			gl.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
			gl.glTranslatef((float) x, (float) (GlRenderer.canvasHeight - y), 0.0F);
			gl.glCallList(this.listIds[glyph]);
			gl.glLoadIdentity();
			return;
		}
		GlRenderer.method1590();
		@Pc(4) GL gl = GlRenderer.gl;
		gl.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
		gl.glTranslatef((float) x, (float) (GlRenderer.canvasHeight - y), 0.0F);
		@Pc(32) float s0 = (float) (glyph % 16) / 16.0F;
		@Pc(39) float t0 = (float) (glyph / 16) / 16.0F;
		@Pc(51) float s1 = s0 + (float) this.spriteInnerWidths[glyph] / (float) this.powerOfTwoSize;
		@Pc(63) float t1 = t0 + (float) this.spriteInnerHeights[glyph] / (float) this.powerOfTwoSize;
		GlRenderer.setTextureId(this.textureId);
		@Pc(68) GlSprite mask = GlRaster.mask;
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glEnable(GL.GL_TEXTURE_2D);
		gl.glBindTexture(GL.GL_TEXTURE_2D, mask.textureId);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
		@Pc(98) float maskX0 = (float) (x - GlRaster.clipX) / (float) mask.powerOfTwoWidth;
		@Pc(107) float maskY0 = (float) (y - GlRaster.clipY) / (float) mask.powerOfTwoHeight;
		@Pc(118) float maskX1 = (float) (x + width - GlRaster.clipX) / (float) mask.powerOfTwoWidth;
		@Pc(129) float maskY1 = (float) (y + height - GlRaster.clipY) / (float) mask.powerOfTwoHeight;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, maskX1, maskY0);
		gl.glTexCoord2f(s1, t0);
		gl.glVertex2f((float) this.spriteInnerWidths[glyph], 0.0F);
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, maskX0, maskY0);
		gl.glTexCoord2f(s0, t0);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, maskX0, maskY1);
		gl.glTexCoord2f(s0, t1);
		gl.glVertex2f(0.0F, (float) -this.spriteInnerHeights[glyph]);
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, maskX1, maskY1);
		gl.glTexCoord2f(s1, t1);
		gl.glVertex2f((float) this.spriteInnerWidths[glyph], (float) -this.spriteInnerHeights[glyph]);
		gl.glEnd();
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		gl.glDisable(GL.GL_TEXTURE_2D);
		gl.glActiveTexture(GL.GL_TEXTURE0);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([[B)V")
	private void createTexture(@OriginalArg(0) byte[][] pixels) {
		if (this.textureId != -1) {
			return;
		}
		this.powerOfTwoSize = 0;
		for (@Pc(9) int i = 0; i < 256; i++) {
			if (this.spriteInnerHeights[i] > this.powerOfTwoSize) {
				this.powerOfTwoSize = this.spriteInnerHeights[i];
			}
			if (this.spriteInnerWidths[i] > this.powerOfTwoSize) {
				this.powerOfTwoSize = this.spriteInnerWidths[i];
			}
		}
		this.powerOfTwoSize *= 16;
		this.powerOfTwoSize = IntUtils.clp2(this.powerOfTwoSize);
		@Pc(57) int glyphSize = this.powerOfTwoSize / 16;
		@Pc(66) byte[] dest = new byte[this.powerOfTwoSize * this.powerOfTwoSize * 2];
		for (@Pc(68) int i = 0; i < 256; i++) {
			@Pc(77) int s = i % 16 * glyphSize;
			@Pc(83) int t = i / 16 * glyphSize;
			@Pc(92) int destIndex = (t * this.powerOfTwoSize + s) * 2;
			@Pc(94) int srcIndex = 0;
			@Pc(99) int height = this.spriteInnerHeights[i];
			@Pc(104) int width = this.spriteInnerWidths[i];
			@Pc(108) byte[] src = pixels[i];
			for (@Pc(110) int y = 0; y < height; y++) {
				for (@Pc(115) int x = 0; x < width; x++) {
					if (src[srcIndex++] == 0) {
						destIndex += 2;
					} else {
						@Pc(126) int destIndex2 = destIndex + 1;
						dest[destIndex] = -1;
						destIndex = destIndex2 + 1;
						dest[destIndex2] = -1;
					}
				}
				destIndex += (this.powerOfTwoSize - width) * 2;
			}
		}
		@Pc(153) ByteBuffer buffer = ByteBuffer.wrap(dest);
		@Pc(155) GL gl = GlRenderer.gl;
		if (this.textureId == -1) {
			@Pc(162) int[] temp = new int[1];
			gl.glGenTextures(1, temp, 0);
			this.textureId = temp[0];
			this.contextId = GlCleaner.contextId;
		}
		GlRenderer.setTextureId(this.textureId);
		gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, this.powerOfTwoSize, this.powerOfTwoSize, GL.GL_POINTS, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, buffer);
		GlCleaner.onCard2d += buffer.limit() - this.size;
		this.size = buffer.limit();
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "()V")
	private void createLists() {
		if (this.listIds != null) {
			return;
		}
		this.listIds = new int[256];
		@Pc(9) GL gl = GlRenderer.gl;
		for (@Pc(11) int i = 0; i < 256; i++) {
			@Pc(21) float s0 = (float) (i % 16) / 16.0F;
			@Pc(28) float t0 = (float) (i / 16) / 16.0F;
			@Pc(40) float s1 = s0 + (float) this.spriteInnerWidths[i] / (float) this.powerOfTwoSize;
			@Pc(52) float t1 = t0 + (float) this.spriteInnerHeights[i] / (float) this.powerOfTwoSize;
			this.listIds[i] = gl.glGenLists(1);
			gl.glNewList(this.listIds[i], GL.GL_COMPILE);
			gl.glBegin(GL.GL_TRIANGLE_FAN);
			gl.glTexCoord2f(s1, t0);
			gl.glVertex2f((float) this.spriteInnerWidths[i], 0.0F);
			gl.glTexCoord2f(s0, t0);
			gl.glVertex2f(0.0F, 0.0F);
			gl.glTexCoord2f(s0, t1);
			gl.glVertex2f(0.0F, (float) -this.spriteInnerHeights[i]);
			gl.glTexCoord2f(s1, t1);
			gl.glVertex2f((float) this.spriteInnerWidths[i], (float) -this.spriteInnerHeights[i]);
			gl.glEnd();
			gl.glEndList();
		}
		this.contextId = GlCleaner.contextId;
	}
}

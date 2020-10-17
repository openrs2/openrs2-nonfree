import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class GlIndexedSprite extends IndexedSprite {

	@OriginalMember(owner = "client!n", name = "n", descriptor = "I")
	private int contextId;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	private int powerOfTwoWidth;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	private int powerOfTwoHeight;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "I")
	private int textureId = -1;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "I")
	private int filterMode = 0;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "I")
	private int listId = -1;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public GlIndexedSprite(@OriginalArg(0) int innerWidth, @OriginalArg(1) int innerHeight, @OriginalArg(2) int xOffset, @OriginalArg(3) int yOffset, @OriginalArg(4) int width, @OriginalArg(5) int height, @OriginalArg(6) byte[] pixels, @OriginalArg(7) int[] palette) {
		this.innerWidth = innerWidth;
		this.innerHeight = innerHeight;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
		this.width = width;
		this.height = height;
		this.setPixels(pixels, palette);
		this.createList();
	}

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!fe;)V")
	public GlIndexedSprite(@OriginalArg(0) SoftwareIndexedSprite sprite) {
		this.width = sprite.width;
		this.height = sprite.height;
		this.xOffset = sprite.xOffset;
		this.yOffset = sprite.yOffset;
		this.innerWidth = sprite.innerWidth;
		this.innerHeight = sprite.innerHeight;
		this.setPixels(sprite.pixels, sprite.palette);
		this.createList();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	@Override
	public final void renderTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		GlRenderer.method1596();
		x += this.xOffset;
		y += this.yOffset;
		@Pc(12) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode();
		gl.glTranslatef((float) x, (float) (GlRenderer.canvasHeight - y), 0.0F);
		gl.glCallList(this.listId);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.textureId != -1) {
			GlCleaner.deleteTexture2d(this.textureId, this.size, this.contextId);
			this.textureId = -1;
			this.size = 0;
		}
		if (this.listId != -1) {
			GlCleaner.deleteList(this.listId, this.contextId);
			this.listId = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	private void createList() {
		@Pc(7) float s = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(15) float t = (float) this.height / (float) this.powerOfTwoHeight;
		@Pc(17) GL gl = GlRenderer.gl;
		if (this.listId == -1) {
			this.listId = gl.glGenLists(1);
			this.contextId = GlCleaner.contextId;
		}
		gl.glNewList(this.listId, GL.GL_COMPILE);
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glTexCoord2f(s, 0.0F);
		gl.glVertex2f((float) this.width, 0.0F);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glTexCoord2f(0.0F, t);
		gl.glVertex2f(0.0F, (float) -this.height);
		gl.glTexCoord2f(s, t);
		gl.glVertex2f((float) this.width, (float) -this.height);
		gl.glEnd();
		gl.glEndList();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	@Override
	public final void renderAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int alpha) {
		GlRenderer.method1625();
		x += this.xOffset;
		y += this.yOffset;
		@Pc(12) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode();
		gl.glColor4f(1.0F, 1.0F, 1.0F, (float) alpha / 256.0F);
		gl.glTranslatef((float) x, (float) (GlRenderer.canvasHeight - y), 0.0F);
		gl.glCallList(this.listId);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	private void setFilterMode() {
		if (this.filterMode != 1) {
			this.filterMode = 1;
			@Pc(9) GL gl = GlRenderer.gl;
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([B[I)V")
	private void setPixels(@OriginalArg(0) byte[] src, @OriginalArg(1) int[] palette) {
		this.powerOfTwoWidth = IntUtils.clp2(this.width);
		this.powerOfTwoHeight = IntUtils.clp2(this.height);
		@Pc(20) byte[] dest = new byte[this.powerOfTwoWidth * this.powerOfTwoHeight * 4];
		@Pc(22) int destOff = 0;
		@Pc(24) int srcOff = 0;
		for (@Pc(26) int y = 0; y < this.height; y++) {
			for (@Pc(32) int x = 0; x < this.width; x++) {
				@Pc(41) byte index = src[srcOff++];
				if (index == 0) {
					destOff += 4;
				} else {
					@Pc(47) int color = palette[index];
					@Pc(50) int destOff2 = destOff + 1;
					dest[destOff] = (byte) (color >> 16);
					dest[destOff2++] = (byte) (color >> 8);
					dest[destOff2++] = (byte) color;
					destOff = destOff2 + 1;
					dest[destOff2] = -1;
				}
			}
			destOff += (this.powerOfTwoWidth - this.width) * 4;
		}
		@Pc(93) ByteBuffer buffer = ByteBuffer.wrap(dest);
		@Pc(95) GL gl = GlRenderer.gl;
		if (this.textureId == -1) {
			@Pc(102) int[] temp = new int[1];
			gl.glGenTextures(1, temp, 0);
			this.textureId = temp[0];
			this.contextId = GlCleaner.contextId;
		}
		GlRenderer.setTextureId(this.textureId);
		gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, this.powerOfTwoWidth, this.powerOfTwoHeight, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, buffer);
		GlCleaner.onCard2d += buffer.limit() - this.size;
		this.size = buffer.limit();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!oa;)V")
	public final void renderTransparentMasked(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) GlSprite mask) {
		if (mask == null) {
			return;
		}
		GlRenderer.method1596();
		GlRenderer.setTextureId(mask.textureId);
		mask.setFilterMode(1);
		@Pc(11) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode();
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glEnable(GL.GL_TEXTURE_2D);
		gl.glBindTexture(GL.GL_TEXTURE_2D, mask.textureId);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
		@Pc(47) float maskS0 = (float) (x - GlRaster.clipX) / (float) mask.powerOfTwoWidth;
		@Pc(56) float maskT0 = (float) (y - GlRaster.clipY) / (float) mask.powerOfTwoHeight;
		@Pc(68) float maskS1 = (float) (x + this.width - GlRaster.clipX) / (float) mask.powerOfTwoWidth;
		@Pc(80) float maskT1 = (float) (y + this.height - GlRaster.clipY) / (float) mask.powerOfTwoHeight;
		x += this.xOffset;
		y += this.yOffset;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float s = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(115) float t = (float) this.height / (float) this.powerOfTwoHeight;
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, maskS1, maskT0);
		gl.glTexCoord2f(s, 0.0F);
		gl.glVertex2f((float) (x + this.width), (float) (GlRenderer.canvasHeight - y));
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, maskS0, maskT0);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f((float) x, (float) (GlRenderer.canvasHeight - y));
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, maskS0, maskT1);
		gl.glTexCoord2f(0.0F, t);
		gl.glVertex2f((float) x, (float) (GlRenderer.canvasHeight - y - this.height));
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, maskS1, maskT1);
		gl.glTexCoord2f(s, t);
		gl.glVertex2f((float) (x + this.width), (float) (GlRenderer.canvasHeight - y - this.height));
		gl.glEnd();
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		gl.glDisable(GL.GL_TEXTURE_2D);
		gl.glActiveTexture(GL.GL_TEXTURE0);
	}
}

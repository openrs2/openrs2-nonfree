import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public class GlSprite extends Sprite {

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
	private int contextId;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
	public int powerOfTwoWidth;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
	public int powerOfTwoHeight;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
	private int filterMode = 0;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
	private int listId = -1;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	protected int size = 0;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
	public int textureId = -1;

	public GlSprite(@OriginalArg(0) int innerWidth, @OriginalArg(1) int innerHeight, @OriginalArg(2) int xOffset, @OriginalArg(3) int yOffset, @OriginalArg(4) int width, @OriginalArg(5) int height, @OriginalArg(6) int[] pixels) {
		this.innerWidth = innerWidth;
		this.innerHeight = innerHeight;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
		this.width = width;
		this.height = height;
		this.setPixels(pixels);
		this.createList();
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!vn;)V")
	public GlSprite(@OriginalArg(0) SoftwareSprite sprite) {
		this.innerWidth = sprite.innerWidth;
		this.innerHeight = sprite.innerHeight;
		this.xOffset = sprite.xOffset;
		this.yOffset = sprite.yOffset;
		this.width = sprite.width;
		this.height = sprite.height;
		this.setPixels(sprite.pixels);
		this.createList();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected final void renderRotatedScaledTransparent(@OriginalArg(0) int pivotX, @OriginalArg(1) int pivotY, @OriginalArg(2) int x, @OriginalArg(3) int y, @OriginalArg(4) int angle, @OriginalArg(5) int scale) {
		GlRenderer.method1596();
		@Pc(2) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(1);
		pivotX -= this.xOffset << 4;
		pivotY -= this.yOffset << 4;
		gl.glTranslatef((float) x / 16.0F, (float) GlRenderer.canvasHeight - (float) y / 16.0F, 0.0F);
		gl.glRotatef((float) angle * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (scale != 4096) {
			gl.glScalef((float) scale / 4096.0F, (float) scale / 4096.0F, 0.0F);
		}
		gl.glTranslatef((float) -pivotX / 16.0F, (float) pivotY / 16.0F, 0.0F);
		gl.glCallList(this.listId);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
	public final void renderTiledAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int alpha, @OriginalArg(3) int horizontalRepeats, @OriginalArg(4) int verticalRepeats) {
		GlRenderer.method1625();
		@Pc(2) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(1);
		@Pc(16) float s = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(24) float t = (float) this.height / (float) this.powerOfTwoHeight;
		s *= horizontalRepeats;
		t *= verticalRepeats;
		@Pc(39) int x0 = x + this.xOffset;
		@Pc(46) int x1 = x0 + this.width * horizontalRepeats;
		@Pc(53) int y0 = GlRenderer.canvasHeight - y - this.yOffset;
		@Pc(60) int y1 = y0 - this.height * verticalRepeats;
		@Pc(65) float a = (float) alpha / 256.0F;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glColor4f(1.0F, 1.0F, 1.0F, a);
		gl.glTexCoord2f(s, 0.0F);
		gl.glVertex2f((float) x1, (float) y0);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f((float) x0, (float) y0);
		gl.glTexCoord2f(0.0F, t);
		gl.glVertex2f((float) x0, (float) y1);
		gl.glTexCoord2f(s, t);
		gl.glVertex2f((float) x1, (float) y1);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
	@Override
	public final void render(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		GlRenderer.method1596();
		x += this.xOffset;
		y += this.yOffset;
		@Pc(12) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(1);
		gl.glTranslatef((float) x, (float) (GlRenderer.canvasHeight - y), 0.0F);
		gl.glCallList(this.listId);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	@Override
	public final void renderAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int alpha) {
		GlRenderer.method1625();
		x += this.xOffset;
		y += this.yOffset;
		@Pc(12) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(1);
		gl.glColor4f(1.0F, 1.0F, 1.0F, (float) alpha / 256.0F);
		gl.glTranslatef((float) x, (float) (GlRenderer.canvasHeight - y), 0.0F);
		gl.glCallList(this.listId);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
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

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	protected void setPixels(@OriginalArg(0) int[] src) {
		this.powerOfTwoWidth = IntUtils.clp2(this.width);
		this.powerOfTwoHeight = IntUtils.clp2(this.height);
		@Pc(20) byte[] dest = new byte[this.powerOfTwoWidth * this.powerOfTwoHeight * 4];
		@Pc(22) int destOff = 0;
		@Pc(24) int srcOff = 0;
		@Pc(32) int destStride = (this.powerOfTwoWidth - this.width) * 4;
		for (@Pc(34) int y = 0; y < this.height; y++) {
			for (@Pc(40) int x = 0; x < this.width; x++) {
				@Pc(49) int color = src[srcOff++];
				if (color == 0) {
					destOff += 4;
				} else {
					@Pc(54) int destOff2 = destOff + 1;
					dest[destOff] = (byte) (color >> 16);
					dest[destOff2++] = (byte) (color >> 8);
					dest[destOff2++] = (byte) color;
					destOff = destOff2 + 1;
					dest[destOff2] = -1;
				}
			}
			destOff += destStride;
		}
		@Pc(91) ByteBuffer buffer = ByteBuffer.wrap(dest);
		@Pc(93) GL gl = GlRenderer.gl;
		if (this.textureId == -1) {
			@Pc(100) int[] temp = new int[1];
			gl.glGenTextures(1, temp, 0);
			this.textureId = temp[0];
			this.contextId = GlCleaner.contextId;
		}
		GlRenderer.setTextureId(this.textureId);
		gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, this.powerOfTwoWidth, this.powerOfTwoHeight, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, buffer);
		GlCleaner.onCard2d += buffer.limit() - this.size;
		this.size = buffer.limit();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
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

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!oa;)V")
	public final void renderTransparentMasked(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) GlSprite mask) {
		if (mask == null) {
			return;
		}
		GlRenderer.method1596();
		GlRenderer.setTextureId(mask.textureId);
		mask.setFilterMode(1);
		@Pc(11) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(1);
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

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIII)V")
	public final void renderTiled(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int horizontalRepeats, @OriginalArg(3) int verticalRepeats) {
		GlRenderer.method1596();
		@Pc(2) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(1);
		@Pc(16) float s = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(24) float t = (float) this.height / (float) this.powerOfTwoHeight;
		s *= horizontalRepeats;
		t *= verticalRepeats;
		@Pc(39) int x0 = x + this.xOffset;
		@Pc(46) int x1 = x0 + this.width * horizontalRepeats;
		@Pc(53) int y0 = GlRenderer.canvasHeight - y - this.yOffset;
		@Pc(60) int y1 = y0 - this.height * verticalRepeats;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glTexCoord2f(s, 0.0F);
		gl.glVertex2f((float) x1, (float) y0);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f((float) x0, (float) y0);
		gl.glTexCoord2f(0.0F, t);
		gl.glVertex2f((float) x0, (float) y1);
		gl.glTexCoord2f(s, t);
		gl.glVertex2f((float) x1, (float) y1);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIILclient!oa;)V")
	public final void renderRotatedTransparent(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) GlSprite arg8) {
		if (arg8 == null) {
			return;
		}
		GlRenderer.method1596();
		GlRenderer.setTextureId(arg8.textureId);
		arg8.setFilterMode(1);
		@Pc(11) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(1);
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glEnable(GL.GL_TEXTURE_2D);
		gl.glBindTexture(GL.GL_TEXTURE_2D, arg8.textureId);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
		@Pc(43) int local43 = -arg2 / 2;
		@Pc(48) int local48 = -arg3 / 2;
		@Pc(51) int local51 = -local43;
		@Pc(54) int local54 = -local48;
		@Pc(63) int local63 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
		@Pc(72) int local72 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
		local63 = local63 * arg7 >> 8;
		local72 = local72 * arg7 >> 8;
		@Pc(96) int local96 = (arg4 << 16) + local48 * local63 + local43 * local72;
		@Pc(108) int local108 = (arg5 << 16) + local48 * local72 - local43 * local63;
		@Pc(120) int local120 = (arg4 << 16) + local48 * local63 + local51 * local72;
		@Pc(132) int local132 = (arg5 << 16) + local48 * local72 - local51 * local63;
		@Pc(144) int local144 = (arg4 << 16) + local54 * local63 + local43 * local72;
		@Pc(156) int local156 = (arg5 << 16) + local54 * local72 - local43 * local63;
		@Pc(168) int local168 = (arg4 << 16) + local54 * local63 + local51 * local72;
		@Pc(180) int local180 = (arg5 << 16) + local54 * local72 - local51 * local63;
		@Pc(188) float local188 = (float) arg8.width / (float) arg8.powerOfTwoWidth;
		@Pc(196) float local196 = (float) arg8.height / (float) arg8.powerOfTwoHeight;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(211) float local211 = (float) this.powerOfTwoWidth * 65536.0F;
		@Pc(217) float local217 = (float) (this.powerOfTwoHeight * 65536);
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, local188, 0.0F);
		gl.glTexCoord2f((float) local120 / local211, (float) local132 / local217);
		gl.glVertex2f((float) (arg0 + arg2), (float) (GlRenderer.canvasHeight - arg1));
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
		gl.glTexCoord2f((float) local96 / local211, (float) local108 / local217);
		gl.glVertex2f((float) arg0, (float) (GlRenderer.canvasHeight - arg1));
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, local196);
		gl.glTexCoord2f((float) local144 / local211, (float) local156 / local217);
		gl.glVertex2f((float) arg0, (float) (GlRenderer.canvasHeight - arg1 - arg3));
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, local188, local196);
		gl.glTexCoord2f((float) local168 / local211, (float) local180 / local217);
		gl.glVertex2f((float) (arg0 + arg2), (float) (GlRenderer.canvasHeight - arg1 - arg3));
		gl.glEnd();
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		gl.glDisable(GL.GL_TEXTURE_2D);
		gl.glActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void renderResizedAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int alpha) {
		if (width <= 0 || height <= 0) {
			return;
		}
		GlRenderer.method1625();
		@Pc(8) int local8 = this.width;
		@Pc(11) int local11 = this.height;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.innerWidth;
		@Pc(21) int local21 = this.innerHeight;
		@Pc(27) int local27 = (local18 << 16) / width;
		@Pc(33) int local33 = (local21 << 16) / height;
		if (this.xOffset > 0) {
			@Pc(47) int local47 = ((this.xOffset << 16) + local27 - 1) / local27;
			x += local47;
			local13 = local47 * local27 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			@Pc(76) int local76 = ((this.yOffset << 16) + local33 - 1) / local33;
			y += local76;
			local15 = local76 * local33 - (this.yOffset << 16);
		}
		if (local8 < local18) {
			width = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			height = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		@Pc(123) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(1);
		@Pc(132) float x0 = (float) x;
		@Pc(137) float x1 = x0 + (float) width;
		@Pc(142) float y0 = (float) (GlRenderer.canvasHeight - y);
		@Pc(147) float y1 = y0 - (float) height;
		@Pc(155) float s = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(163) float t = (float) this.height / (float) this.powerOfTwoHeight;
		@Pc(168) float a = (float) alpha / 256.0F;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glColor4f(1.0F, 1.0F, 1.0F, a);
		gl.glTexCoord2f(s, 0.0F);
		gl.glVertex2f(x1, y0);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(x0, y0);
		gl.glTexCoord2f(0.0F, t);
		gl.glVertex2f(x0, y1);
		gl.glTexCoord2f(s, t);
		gl.glVertex2f(x1, y1);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	@Override
	public final void renderTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		GlRenderer.method1596();
		x += this.xOffset;
		y += this.yOffset;
		@Pc(12) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(1);
		gl.glTranslatef((float) x, (float) (GlRenderer.canvasHeight - y), 0.0F);
		gl.glCallList(this.listId);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	public final void renderRotatedTransparent(@OriginalArg(2) int x, @OriginalArg(3) int y, @OriginalArg(4) int angle) {
		GlRenderer.method1596();
		@Pc(2) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(2);
		@Pc(15) int pivotX = 240 - (this.xOffset << 4);
		@Pc(22) int pivotY = 240 - (this.yOffset << 4);
		gl.glTranslatef((float) x / 16.0F, (float) GlRenderer.canvasHeight - (float) y / 16.0F, 0.0F);
		gl.glRotatef((float) -angle * 0.005493164F, 0.0F, 0.0F, 1.0F);
		gl.glTranslatef((float) -pivotX / 16.0F, (float) pivotY / 16.0F, 0.0F);
		gl.glCallList(this.listId);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
	@Override
	public final void renderHorizontalFlipTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		GlRenderer.method1596();
		x += this.xOffset;
		y += this.yOffset;
		@Pc(12) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(1);
		gl.glTranslatef((float) x, (float) (GlRenderer.canvasHeight - y), 0.0F);
		@Pc(35) float s = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(43) float t = (float) this.height / (float) this.powerOfTwoHeight;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f((float) this.width, 0.0F);
		gl.glTexCoord2f(s, 0.0F);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glTexCoord2f(s, t);
		gl.glVertex2f(0.0F, (float) -this.height);
		gl.glTexCoord2f(0.0F, t);
		gl.glVertex2f((float) this.width, (float) -this.height);
		gl.glEnd();
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public final void renderResizedTransparent(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height) {
		if (width <= 0 || height <= 0) {
			return;
		}
		GlRenderer.method1596();
		@Pc(8) int local8 = this.width;
		@Pc(11) int local11 = this.height;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.innerWidth;
		@Pc(21) int local21 = this.innerHeight;
		@Pc(27) int local27 = (local18 << 16) / width;
		@Pc(33) int local33 = (local21 << 16) / height;
		if (this.xOffset > 0) {
			@Pc(47) int local47 = ((this.xOffset << 16) + local27 - 1) / local27;
			x += local47;
			local13 = local47 * local27 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			@Pc(76) int local76 = ((this.yOffset << 16) + local33 - 1) / local33;
			y += local76;
			local15 = local76 * local33 - (this.yOffset << 16);
		}
		if (local8 < local18) {
			width = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			height = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		@Pc(123) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.setFilterMode(2);
		@Pc(132) float x0 = (float) x;
		@Pc(137) float x1 = x0 + (float) width;
		@Pc(142) float y0 = (float) (GlRenderer.canvasHeight - y);
		@Pc(147) float y1 = y0 - (float) height;
		@Pc(155) float s = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(163) float t = (float) this.height / (float) this.powerOfTwoHeight;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glTexCoord2f(s, 0.0F);
		gl.glVertex2f(x1, y0);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(x0, y0);
		gl.glTexCoord2f(0.0F, t);
		gl.glVertex2f(x0, y1);
		gl.glTexCoord2f(s, t);
		gl.glVertex2f(x1, y1);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public final void setFilterMode(@OriginalArg(0) int mode) {
		if (this.filterMode == mode) {
			return;
		}
		this.filterMode = mode;
		@Pc(9) GL gl = GlRenderer.gl;
		if (mode == 2) {
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		} else {
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
		}
	}
}

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
	public int anInt5617;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
	public int anInt5620;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
	private int anInt5616 = 0;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
	private int listId = -1;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	protected int size = 0;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
	public int textureId = -1;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIII[I)V")
	public GlSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.anInt5602 = arg0;
		this.anInt5612 = arg1;
		this.anInt5606 = arg2;
		this.anInt5604 = arg3;
		this.width = arg4;
		this.height = arg5;
		this.method4515(arg6);
		this.method4516();
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!vn;)V")
	public GlSprite(@OriginalArg(0) SoftwareSprite sprite) {
		this.anInt5602 = sprite.anInt5602;
		this.anInt5612 = sprite.anInt5612;
		this.anInt5606 = sprite.anInt5606;
		this.anInt5604 = sprite.anInt5604;
		this.width = sprite.width;
		this.height = sprite.height;
		this.method4515(sprite.pixels);
		this.method4516();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected final void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		GlRenderer.method1596();
		@Pc(2) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(1);
		arg0 -= this.anInt5606 << 4;
		arg1 -= this.anInt5604 << 4;
		gl.glTranslatef((float) arg2 / 16.0F, (float) GlRenderer.canvasHeight - (float) arg3 / 16.0F, 0.0F);
		gl.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (arg5 != 4096) {
			gl.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
		}
		gl.glTranslatef((float) -arg0 / 16.0F, (float) arg1 / 16.0F, 0.0F);
		gl.glCallList(this.listId);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
	public final void method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		GlRenderer.method1625();
		@Pc(2) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(1);
		@Pc(16) float local16 = (float) this.width / (float) this.anInt5617;
		@Pc(24) float local24 = (float) this.height / (float) this.anInt5620;
		local16 *= arg3;
		local24 *= arg4;
		@Pc(39) int local39 = arg0 + this.anInt5606;
		@Pc(46) int local46 = local39 + this.width * arg3;
		@Pc(53) int local53 = GlRenderer.canvasHeight - arg1 - this.anInt5604;
		@Pc(60) int local60 = local53 - this.height * arg4;
		@Pc(65) float local65 = (float) arg2 / 256.0F;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glColor4f(1.0F, 1.0F, 1.0F, local65);
		gl.glTexCoord2f(local16, 0.0F);
		gl.glVertex2f((float) local46, (float) local53);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f((float) local39, (float) local53);
		gl.glTexCoord2f(0.0F, local24);
		gl.glVertex2f((float) local39, (float) local60);
		gl.glTexCoord2f(local16, local24);
		gl.glVertex2f((float) local46, (float) local60);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
	@Override
	public final void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.method1596();
		arg0 += this.anInt5606;
		arg1 += this.anInt5604;
		@Pc(12) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(1);
		gl.glTranslatef((float) arg0, (float) (GlRenderer.canvasHeight - arg1), 0.0F);
		gl.glCallList(this.listId);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	@Override
	public final void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		GlRenderer.method1625();
		arg0 += this.anInt5606;
		arg1 += this.anInt5604;
		@Pc(12) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(1);
		gl.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		gl.glTranslatef((float) arg0, (float) (GlRenderer.canvasHeight - arg1), 0.0F);
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
	protected void method4515(@OriginalArg(0) int[] arg0) {
		this.anInt5617 = IntUtils.clp2(this.width);
		this.anInt5620 = IntUtils.clp2(this.height);
		@Pc(20) byte[] local20 = new byte[this.anInt5617 * this.anInt5620 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(32) int local32 = (this.anInt5617 - this.width) * 4;
		for (@Pc(34) int local34 = 0; local34 < this.height; local34++) {
			for (@Pc(40) int local40 = 0; local40 < this.width; local40++) {
				@Pc(49) int local49 = arg0[local24++];
				if (local49 == 0) {
					local22 += 4;
				} else {
					@Pc(54) int local54 = local22 + 1;
					local20[local22] = (byte) (local49 >> 16);
					local20[local54++] = (byte) (local49 >> 8);
					local20[local54++] = (byte) local49;
					local22 = local54 + 1;
					local20[local54] = -1;
				}
			}
			local22 += local32;
		}
		@Pc(91) ByteBuffer local91 = ByteBuffer.wrap(local20);
		@Pc(93) GL gl = GlRenderer.gl;
		if (this.textureId == -1) {
			@Pc(100) int[] local100 = new int[1];
			gl.glGenTextures(1, local100, 0);
			this.textureId = local100[0];
			this.contextId = GlCleaner.contextId;
		}
		GlRenderer.setTextureId(this.textureId);
		gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, this.anInt5617, this.anInt5620, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, local91);
		GlCleaner.onCard2d += local91.limit() - this.size;
		this.size = local91.limit();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	private void method4516() {
		@Pc(7) float local7 = (float) this.width / (float) this.anInt5617;
		@Pc(15) float local15 = (float) this.height / (float) this.anInt5620;
		@Pc(17) GL gl = GlRenderer.gl;
		if (this.listId == -1) {
			this.listId = gl.glGenLists(1);
			this.contextId = GlCleaner.contextId;
		}
		gl.glNewList(this.listId, GL.GL_COMPILE);
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glTexCoord2f(local7, 0.0F);
		gl.glVertex2f((float) this.width, 0.0F);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glTexCoord2f(0.0F, local15);
		gl.glVertex2f(0.0F, (float) -this.height);
		gl.glTexCoord2f(local7, local15);
		gl.glVertex2f((float) this.width, (float) -this.height);
		gl.glEnd();
		gl.glEndList();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!oa;)V")
	public final void method4517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GlSprite arg2) {
		if (arg2 == null) {
			return;
		}
		GlRenderer.method1596();
		GlRenderer.setTextureId(arg2.textureId);
		arg2.method4521(1);
		@Pc(11) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(1);
		gl.glActiveTexture(GL.GL_TEXTURE1);
		gl.glEnable(GL.GL_TEXTURE_2D);
		gl.glBindTexture(GL.GL_TEXTURE_2D, arg2.textureId);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
		@Pc(47) float local47 = (float) (arg0 - Static3.anInt2150) / (float) arg2.anInt5617;
		@Pc(56) float local56 = (float) (arg1 - Static3.anInt2152) / (float) arg2.anInt5620;
		@Pc(68) float local68 = (float) (arg0 + this.width - Static3.anInt2150) / (float) arg2.anInt5617;
		@Pc(80) float local80 = (float) (arg1 + this.height - Static3.anInt2152) / (float) arg2.anInt5620;
		arg0 += this.anInt5606;
		arg1 += this.anInt5604;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.width / (float) this.anInt5617;
		@Pc(115) float local115 = (float) this.height / (float) this.anInt5620;
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, local68, local56);
		gl.glTexCoord2f(local107, 0.0F);
		gl.glVertex2f((float) (arg0 + this.width), (float) (GlRenderer.canvasHeight - arg1));
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, local47, local56);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f((float) arg0, (float) (GlRenderer.canvasHeight - arg1));
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, local47, local80);
		gl.glTexCoord2f(0.0F, local115);
		gl.glVertex2f((float) arg0, (float) (GlRenderer.canvasHeight - arg1 - this.height));
		gl.glMultiTexCoord2f(GL.GL_TEXTURE1, local68, local80);
		gl.glTexCoord2f(local107, local115);
		gl.glVertex2f((float) (arg0 + this.width), (float) (GlRenderer.canvasHeight - arg1 - this.height));
		gl.glEnd();
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		gl.glDisable(GL.GL_TEXTURE_2D);
		gl.glActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIII)V")
	public final void method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		GlRenderer.method1596();
		@Pc(2) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(1);
		@Pc(16) float local16 = (float) this.width / (float) this.anInt5617;
		@Pc(24) float local24 = (float) this.height / (float) this.anInt5620;
		local16 *= arg2;
		local24 *= arg3;
		@Pc(39) int local39 = arg0 + this.anInt5606;
		@Pc(46) int local46 = local39 + this.width * arg2;
		@Pc(53) int local53 = GlRenderer.canvasHeight - arg1 - this.anInt5604;
		@Pc(60) int local60 = local53 - this.height * arg3;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glTexCoord2f(local16, 0.0F);
		gl.glVertex2f((float) local46, (float) local53);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f((float) local39, (float) local53);
		gl.glTexCoord2f(0.0F, local24);
		gl.glVertex2f((float) local39, (float) local60);
		gl.glTexCoord2f(local16, local24);
		gl.glVertex2f((float) local46, (float) local60);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIILclient!oa;)V")
	public final void method4519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) GlSprite arg8) {
		if (arg8 == null) {
			return;
		}
		GlRenderer.method1596();
		GlRenderer.setTextureId(arg8.textureId);
		arg8.method4521(1);
		@Pc(11) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(1);
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
		@Pc(188) float local188 = (float) arg8.width / (float) arg8.anInt5617;
		@Pc(196) float local196 = (float) arg8.height / (float) arg8.anInt5620;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(211) float local211 = (float) this.anInt5617 * 65536.0F;
		@Pc(217) float local217 = (float) (this.anInt5620 * 65536);
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
	public final void method4504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		GlRenderer.method1625();
		@Pc(8) int local8 = this.width;
		@Pc(11) int local11 = this.height;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.anInt5602;
		@Pc(21) int local21 = this.anInt5612;
		@Pc(27) int local27 = (local18 << 16) / arg2;
		@Pc(33) int local33 = (local21 << 16) / arg3;
		if (this.anInt5606 > 0) {
			@Pc(47) int local47 = ((this.anInt5606 << 16) + local27 - 1) / local27;
			arg0 += local47;
			local13 = local47 * local27 - (this.anInt5606 << 16);
		}
		if (this.anInt5604 > 0) {
			@Pc(76) int local76 = ((this.anInt5604 << 16) + local33 - 1) / local33;
			arg1 += local76;
			local15 = local76 * local33 - (this.anInt5604 << 16);
		}
		if (local8 < local18) {
			arg2 = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			arg3 = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		@Pc(123) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(1);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (GlRenderer.canvasHeight - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.width / (float) this.anInt5617;
		@Pc(163) float local163 = (float) this.height / (float) this.anInt5620;
		@Pc(168) float local168 = (float) arg4 / 256.0F;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glColor4f(1.0F, 1.0F, 1.0F, local168);
		gl.glTexCoord2f(local155, 0.0F);
		gl.glVertex2f(local137, local142);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(local132, local142);
		gl.glTexCoord2f(0.0F, local163);
		gl.glVertex2f(local132, local147);
		gl.glTexCoord2f(local155, local163);
		gl.glVertex2f(local137, local147);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	@Override
	public final void method4506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.method1596();
		arg0 += this.anInt5606;
		arg1 += this.anInt5604;
		@Pc(12) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(1);
		gl.glTranslatef((float) arg0, (float) (GlRenderer.canvasHeight - arg1), 0.0F);
		gl.glCallList(this.listId);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	public final void method4520(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		GlRenderer.method1596();
		@Pc(2) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(2);
		@Pc(15) int local15 = 240 - (this.anInt5606 << 4);
		@Pc(22) int local22 = 240 - (this.anInt5604 << 4);
		gl.glTranslatef((float) arg0 / 16.0F, (float) GlRenderer.canvasHeight - (float) arg1 / 16.0F, 0.0F);
		gl.glRotatef((float) -arg2 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		gl.glTranslatef((float) -local15 / 16.0F, (float) local22 / 16.0F, 0.0F);
		gl.glCallList(this.listId);
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
	@Override
	public final void method4511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.method1596();
		arg0 += this.anInt5606;
		arg1 += this.anInt5604;
		@Pc(12) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(1);
		gl.glTranslatef((float) arg0, (float) (GlRenderer.canvasHeight - arg1), 0.0F);
		@Pc(35) float local35 = (float) this.width / (float) this.anInt5617;
		@Pc(43) float local43 = (float) this.height / (float) this.anInt5620;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f((float) this.width, 0.0F);
		gl.glTexCoord2f(local35, 0.0F);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glTexCoord2f(local35, local43);
		gl.glVertex2f(0.0F, (float) -this.height);
		gl.glTexCoord2f(0.0F, local43);
		gl.glVertex2f((float) this.width, (float) -this.height);
		gl.glEnd();
		gl.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method4507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		GlRenderer.method1596();
		@Pc(8) int local8 = this.width;
		@Pc(11) int local11 = this.height;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.anInt5602;
		@Pc(21) int local21 = this.anInt5612;
		@Pc(27) int local27 = (local18 << 16) / arg2;
		@Pc(33) int local33 = (local21 << 16) / arg3;
		if (this.anInt5606 > 0) {
			@Pc(47) int local47 = ((this.anInt5606 << 16) + local27 - 1) / local27;
			arg0 += local47;
			local13 = local47 * local27 - (this.anInt5606 << 16);
		}
		if (this.anInt5604 > 0) {
			@Pc(76) int local76 = ((this.anInt5604 << 16) + local33 - 1) / local33;
			arg1 += local76;
			local15 = local76 * local33 - (this.anInt5604 << 16);
		}
		if (local8 < local18) {
			arg2 = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			arg3 = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		@Pc(123) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method4521(2);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (GlRenderer.canvasHeight - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.width / (float) this.anInt5617;
		@Pc(163) float local163 = (float) this.height / (float) this.anInt5620;
		gl.glBegin(GL.GL_TRIANGLE_FAN);
		gl.glTexCoord2f(local155, 0.0F);
		gl.glVertex2f(local137, local142);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(local132, local142);
		gl.glTexCoord2f(0.0F, local163);
		gl.glVertex2f(local132, local147);
		gl.glTexCoord2f(local155, local163);
		gl.glVertex2f(local137, local147);
		gl.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public final void method4521(@OriginalArg(0) int arg0) {
		if (this.anInt5616 == arg0) {
			return;
		}
		this.anInt5616 = arg0;
		@Pc(9) GL gl = GlRenderer.gl;
		if (arg0 == 2) {
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		} else {
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
			gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
		}
	}
}

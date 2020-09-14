import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class GlIndexedSprite extends IndexedSprite {

	@OriginalMember(owner = "client!n", name = "n", descriptor = "I")
	private int contextId;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	private int anInt3416;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	private int anInt3417;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "I")
	private int anInt3418 = -1;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "I")
	private int anInt3420 = 0;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	private int anInt3419 = 0;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "I")
	private int anInt3414 = -1;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public GlIndexedSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt3412 = arg0;
		this.anInt3410 = arg1;
		this.anInt3404 = arg2;
		this.anInt3405 = arg3;
		this.anInt3408 = arg4;
		this.anInt3413 = arg5;
		this.method2819(arg6, arg7);
		this.method2817();
	}

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!fe;)V")
	public GlIndexedSprite(@OriginalArg(0) SoftwareIndexedSprite arg0) {
		this.anInt3408 = arg0.anInt3408;
		this.anInt3413 = arg0.anInt3413;
		this.anInt3404 = arg0.anInt3404;
		this.anInt3405 = arg0.anInt3405;
		this.anInt3412 = arg0.anInt3412;
		this.anInt3410 = arg0.anInt3410;
		this.method2819(arg0.aByteArray15, arg0.anIntArray120);
		this.method2817();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	@Override
	public final void method2815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.method1596();
		arg0 += this.anInt3404;
		arg1 += this.anInt3405;
		@Pc(12) GL local12 = GlRenderer.gl;
		GlRenderer.setTextureId(this.anInt3418);
		this.method2818();
		local12.glTranslatef((float) arg0, (float) (GlRenderer.canvasHeight - arg1), 0.0F);
		local12.glCallList(this.anInt3414);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.anInt3418 != -1) {
			GlCleaner.deleteTexture2d(this.anInt3418, this.anInt3419, this.contextId);
			this.anInt3418 = -1;
			this.anInt3419 = 0;
		}
		if (this.anInt3414 != -1) {
			GlCleaner.deleteList(this.anInt3414, this.contextId);
			this.anInt3414 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	private void method2817() {
		@Pc(7) float local7 = (float) this.anInt3408 / (float) this.anInt3416;
		@Pc(15) float local15 = (float) this.anInt3413 / (float) this.anInt3417;
		@Pc(17) GL local17 = GlRenderer.gl;
		if (this.anInt3414 == -1) {
			this.anInt3414 = local17.glGenLists(1);
			this.contextId = GlCleaner.contextId;
		}
		local17.glNewList(this.anInt3414, GL.GL_COMPILE);
		local17.glBegin(GL.GL_TRIANGLE_FAN);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt3408, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt3413);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt3408, (float) -this.anInt3413);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	@Override
	public final void method2816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		GlRenderer.method1625();
		arg0 += this.anInt3404;
		arg1 += this.anInt3405;
		@Pc(12) GL local12 = GlRenderer.gl;
		GlRenderer.setTextureId(this.anInt3418);
		this.method2818();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) arg0, (float) (GlRenderer.canvasHeight - arg1), 0.0F);
		local12.glCallList(this.anInt3414);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	private void method2818() {
		if (this.anInt3420 != 1) {
			this.anInt3420 = 1;
			@Pc(9) GL local9 = GlRenderer.gl;
			local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
			local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([B[I)V")
	private void method2819(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt3416 = IntUtils.clp2(this.anInt3408);
		this.anInt3417 = IntUtils.clp2(this.anInt3413);
		@Pc(20) byte[] local20 = new byte[this.anInt3416 * this.anInt3417 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt3413; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt3408; local32++) {
				@Pc(41) byte local41 = arg0[local24++];
				if (local41 == 0) {
					local22 += 4;
				} else {
					@Pc(47) int local47 = arg1[local41];
					@Pc(50) int local50 = local22 + 1;
					local20[local22] = (byte) (local47 >> 16);
					local20[local50++] = (byte) (local47 >> 8);
					local20[local50++] = (byte) local47;
					local22 = local50 + 1;
					local20[local50] = -1;
				}
			}
			local22 += (this.anInt3416 - this.anInt3408) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = GlRenderer.gl;
		if (this.anInt3418 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt3418 = local102[0];
			this.contextId = GlCleaner.contextId;
		}
		GlRenderer.setTextureId(this.anInt3418);
		local95.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, this.anInt3416, this.anInt3417, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, local93);
		GlCleaner.onCard2d += local93.limit() - this.anInt3419;
		this.anInt3419 = local93.limit();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!oa;)V")
	public final void method2820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GlSprite arg2) {
		if (arg2 == null) {
			return;
		}
		GlRenderer.method1596();
		GlRenderer.setTextureId(arg2.textureId);
		arg2.method4521(1);
		@Pc(11) GL local11 = GlRenderer.gl;
		GlRenderer.setTextureId(this.anInt3418);
		this.method2818();
		local11.glActiveTexture(GL.GL_TEXTURE1);
		local11.glEnable(GL.GL_TEXTURE_2D);
		local11.glBindTexture(GL.GL_TEXTURE_2D, arg2.textureId);
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
		@Pc(47) float local47 = (float) (arg0 - Static3.anInt2150) / (float) arg2.anInt5617;
		@Pc(56) float local56 = (float) (arg1 - Static3.anInt2152) / (float) arg2.anInt5620;
		@Pc(68) float local68 = (float) (arg0 + this.anInt3408 - Static3.anInt2150) / (float) arg2.anInt5617;
		@Pc(80) float local80 = (float) (arg1 + this.anInt3413 - Static3.anInt2152) / (float) arg2.anInt5620;
		arg0 += this.anInt3404;
		arg1 += this.anInt3405;
		local11.glBegin(GL.GL_TRIANGLE_FAN);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.anInt3408 / (float) this.anInt3416;
		@Pc(115) float local115 = (float) this.anInt3413 / (float) this.anInt3417;
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, local68, local56);
		local11.glTexCoord2f(local107, 0.0F);
		local11.glVertex2f((float) (arg0 + this.anInt3408), (float) (GlRenderer.canvasHeight - arg1));
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, local47, local56);
		local11.glTexCoord2f(0.0F, 0.0F);
		local11.glVertex2f((float) arg0, (float) (GlRenderer.canvasHeight - arg1));
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, local47, local80);
		local11.glTexCoord2f(0.0F, local115);
		local11.glVertex2f((float) arg0, (float) (GlRenderer.canvasHeight - arg1 - this.anInt3413));
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, local68, local80);
		local11.glTexCoord2f(local107, local115);
		local11.glVertex2f((float) (arg0 + this.anInt3408), (float) (GlRenderer.canvasHeight - arg1 - this.anInt3413));
		local11.glEnd();
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		local11.glDisable(GL.GL_TEXTURE_2D);
		local11.glActiveTexture(GL.GL_TEXTURE0);
	}
}

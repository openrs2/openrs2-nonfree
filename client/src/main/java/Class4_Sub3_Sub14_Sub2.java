import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public class Class4_Sub3_Sub14_Sub2 extends Class4_Sub3_Sub14 {

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
	private int anInt5615;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
	public int anInt5617;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
	public int anInt5620;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
	private int anInt5616 = 0;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
	private int anInt5618 = -1;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	protected int anInt5619 = 0;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
	public int anInt5614 = -1;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIII[I)V")
	public Class4_Sub3_Sub14_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.anInt5602 = arg0;
		this.anInt5612 = arg1;
		this.anInt5606 = arg2;
		this.anInt5604 = arg3;
		this.anInt5609 = arg4;
		this.anInt5608 = arg5;
		this.method4515(arg6);
		this.method4516();
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!vn;)V")
	public Class4_Sub3_Sub14_Sub2(@OriginalArg(0) Class4_Sub3_Sub14_Sub1 arg0) {
		this.anInt5602 = arg0.anInt5602;
		this.anInt5612 = arg0.anInt5612;
		this.anInt5606 = arg0.anInt5606;
		this.anInt5604 = arg0.anInt5604;
		this.anInt5609 = arg0.anInt5609;
		this.anInt5608 = arg0.anInt5608;
		this.method4515(arg0.anIntArray241);
		this.method4516();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected final void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static17.method1596();
		@Pc(2) GL local2 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(1);
		arg0 -= this.anInt5606 << 4;
		arg1 -= this.anInt5604 << 4;
		local2.glTranslatef((float) arg2 / 16.0F, (float) Static3.anInt2083 - (float) arg3 / 16.0F, 0.0F);
		local2.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (arg5 != 4096) {
			local2.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
		}
		local2.glTranslatef((float) -arg0 / 16.0F, (float) arg1 / 16.0F, 0.0F);
		local2.glCallList(this.anInt5618);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
	public final void method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static17.method1625();
		@Pc(2) GL local2 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(1);
		@Pc(16) float local16 = (float) this.anInt5609 / (float) this.anInt5617;
		@Pc(24) float local24 = (float) this.anInt5608 / (float) this.anInt5620;
		local16 *= arg3;
		local24 *= arg4;
		@Pc(39) int local39 = arg0 + this.anInt5606;
		@Pc(46) int local46 = local39 + this.anInt5609 * arg3;
		@Pc(53) int local53 = Static3.anInt2083 - arg1 - this.anInt5604;
		@Pc(60) int local60 = local53 - this.anInt5608 * arg4;
		@Pc(65) float local65 = (float) arg2 / 256.0F;
		local2.glBegin(GL.GL_TRIANGLE_FAN);
		local2.glColor4f(1.0F, 1.0F, 1.0F, local65);
		local2.glTexCoord2f(local16, 0.0F);
		local2.glVertex2f((float) local46, (float) local53);
		local2.glTexCoord2f(0.0F, 0.0F);
		local2.glVertex2f((float) local39, (float) local53);
		local2.glTexCoord2f(0.0F, local24);
		local2.glVertex2f((float) local39, (float) local60);
		local2.glTexCoord2f(local16, local24);
		local2.glVertex2f((float) local46, (float) local60);
		local2.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
	@Override
	public final void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static17.method1596();
		arg0 += this.anInt5606;
		arg1 += this.anInt5604;
		@Pc(12) GL local12 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(1);
		local12.glTranslatef((float) arg0, (float) (Static3.anInt2083 - arg1), 0.0F);
		local12.glCallList(this.anInt5618);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	@Override
	public final void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static17.method1625();
		arg0 += this.anInt5606;
		arg1 += this.anInt5604;
		@Pc(12) GL local12 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(1);
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) arg0, (float) (Static3.anInt2083 - arg1), 0.0F);
		local12.glCallList(this.anInt5618);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.anInt5614 != -1) {
			Static25.method2722(this.anInt5614, this.anInt5619, this.anInt5615);
			this.anInt5614 = -1;
			this.anInt5619 = 0;
		}
		if (this.anInt5618 != -1) {
			Static24.method2717(this.anInt5618, this.anInt5615);
			this.anInt5618 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	protected void method4515(@OriginalArg(0) int[] arg0) {
		this.anInt5617 = Static24.method2595(this.anInt5609);
		this.anInt5620 = Static24.method2595(this.anInt5608);
		@Pc(20) byte[] local20 = new byte[this.anInt5617 * this.anInt5620 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(32) int local32 = (this.anInt5617 - this.anInt5609) * 4;
		for (@Pc(34) int local34 = 0; local34 < this.anInt5608; local34++) {
			for (@Pc(40) int local40 = 0; local40 < this.anInt5609; local40++) {
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
		@Pc(93) GL local93 = Static3.aGL1;
		if (this.anInt5614 == -1) {
			@Pc(100) int[] local100 = new int[1];
			local93.glGenTextures(1, local100, 0);
			this.anInt5614 = local100[0];
			this.anInt5615 = Static4.anInt3332;
		}
		Static17.method1600(this.anInt5614);
		local93.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, this.anInt5617, this.anInt5620, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, local91);
		Static4.anInt3333 += local91.limit() - this.anInt5619;
		this.anInt5619 = local91.limit();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	private void method4516() {
		@Pc(7) float local7 = (float) this.anInt5609 / (float) this.anInt5617;
		@Pc(15) float local15 = (float) this.anInt5608 / (float) this.anInt5620;
		@Pc(17) GL local17 = Static3.aGL1;
		if (this.anInt5618 == -1) {
			this.anInt5618 = local17.glGenLists(1);
			this.anInt5615 = Static4.anInt3332;
		}
		local17.glNewList(this.anInt5618, GL.GL_COMPILE);
		local17.glBegin(GL.GL_TRIANGLE_FAN);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt5609, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt5608);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt5609, (float) -this.anInt5608);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!oa;)V")
	public final void method4517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub3_Sub14_Sub2 arg2) {
		if (arg2 == null) {
			return;
		}
		Static17.method1596();
		Static17.method1600(arg2.anInt5614);
		arg2.method4521(1);
		@Pc(11) GL local11 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(1);
		local11.glActiveTexture(GL.GL_TEXTURE1);
		local11.glEnable(GL.GL_TEXTURE_2D);
		local11.glBindTexture(GL.GL_TEXTURE_2D, arg2.anInt5614);
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
		@Pc(47) float local47 = (float) (arg0 - Static3.anInt2150) / (float) arg2.anInt5617;
		@Pc(56) float local56 = (float) (arg1 - Static3.anInt2152) / (float) arg2.anInt5620;
		@Pc(68) float local68 = (float) (arg0 + this.anInt5609 - Static3.anInt2150) / (float) arg2.anInt5617;
		@Pc(80) float local80 = (float) (arg1 + this.anInt5608 - Static3.anInt2152) / (float) arg2.anInt5620;
		arg0 += this.anInt5606;
		arg1 += this.anInt5604;
		local11.glBegin(GL.GL_TRIANGLE_FAN);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.anInt5609 / (float) this.anInt5617;
		@Pc(115) float local115 = (float) this.anInt5608 / (float) this.anInt5620;
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, local68, local56);
		local11.glTexCoord2f(local107, 0.0F);
		local11.glVertex2f((float) (arg0 + this.anInt5609), (float) (Static3.anInt2083 - arg1));
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, local47, local56);
		local11.glTexCoord2f(0.0F, 0.0F);
		local11.glVertex2f((float) arg0, (float) (Static3.anInt2083 - arg1));
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, local47, local80);
		local11.glTexCoord2f(0.0F, local115);
		local11.glVertex2f((float) arg0, (float) (Static3.anInt2083 - arg1 - this.anInt5608));
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, local68, local80);
		local11.glTexCoord2f(local107, local115);
		local11.glVertex2f((float) (arg0 + this.anInt5609), (float) (Static3.anInt2083 - arg1 - this.anInt5608));
		local11.glEnd();
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		local11.glDisable(GL.GL_TEXTURE_2D);
		local11.glActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIII)V")
	public final void method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static17.method1596();
		@Pc(2) GL local2 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(1);
		@Pc(16) float local16 = (float) this.anInt5609 / (float) this.anInt5617;
		@Pc(24) float local24 = (float) this.anInt5608 / (float) this.anInt5620;
		local16 *= arg2;
		local24 *= arg3;
		@Pc(39) int local39 = arg0 + this.anInt5606;
		@Pc(46) int local46 = local39 + this.anInt5609 * arg2;
		@Pc(53) int local53 = Static3.anInt2083 - arg1 - this.anInt5604;
		@Pc(60) int local60 = local53 - this.anInt5608 * arg3;
		local2.glBegin(GL.GL_TRIANGLE_FAN);
		local2.glTexCoord2f(local16, 0.0F);
		local2.glVertex2f((float) local46, (float) local53);
		local2.glTexCoord2f(0.0F, 0.0F);
		local2.glVertex2f((float) local39, (float) local53);
		local2.glTexCoord2f(0.0F, local24);
		local2.glVertex2f((float) local39, (float) local60);
		local2.glTexCoord2f(local16, local24);
		local2.glVertex2f((float) local46, (float) local60);
		local2.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIILclient!oa;)V")
	public final void method4519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class4_Sub3_Sub14_Sub2 arg8) {
		if (arg8 == null) {
			return;
		}
		Static17.method1596();
		Static17.method1600(arg8.anInt5614);
		arg8.method4521(1);
		@Pc(11) GL local11 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(1);
		local11.glActiveTexture(GL.GL_TEXTURE1);
		local11.glEnable(GL.GL_TEXTURE_2D);
		local11.glBindTexture(GL.GL_TEXTURE_2D, arg8.anInt5614);
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
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
		@Pc(188) float local188 = (float) arg8.anInt5609 / (float) arg8.anInt5617;
		@Pc(196) float local196 = (float) arg8.anInt5608 / (float) arg8.anInt5620;
		local11.glBegin(GL.GL_TRIANGLE_FAN);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(211) float local211 = (float) this.anInt5617 * 65536.0F;
		@Pc(217) float local217 = (float) (this.anInt5620 * 65536);
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, local188, 0.0F);
		local11.glTexCoord2f((float) local120 / local211, (float) local132 / local217);
		local11.glVertex2f((float) (arg0 + arg2), (float) (Static3.anInt2083 - arg1));
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
		local11.glTexCoord2f((float) local96 / local211, (float) local108 / local217);
		local11.glVertex2f((float) arg0, (float) (Static3.anInt2083 - arg1));
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, local196);
		local11.glTexCoord2f((float) local144 / local211, (float) local156 / local217);
		local11.glVertex2f((float) arg0, (float) (Static3.anInt2083 - arg1 - arg3));
		local11.glMultiTexCoord2f(GL.GL_TEXTURE1, local188, local196);
		local11.glTexCoord2f((float) local168 / local211, (float) local180 / local217);
		local11.glVertex2f((float) (arg0 + arg2), (float) (Static3.anInt2083 - arg1 - arg3));
		local11.glEnd();
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		local11.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		local11.glDisable(GL.GL_TEXTURE_2D);
		local11.glActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		Static17.method1625();
		@Pc(8) int local8 = this.anInt5609;
		@Pc(11) int local11 = this.anInt5608;
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
		@Pc(123) GL local123 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(1);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (Static3.anInt2083 - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.anInt5609 / (float) this.anInt5617;
		@Pc(163) float local163 = (float) this.anInt5608 / (float) this.anInt5620;
		@Pc(168) float local168 = (float) arg4 / 256.0F;
		local123.glBegin(GL.GL_TRIANGLE_FAN);
		local123.glColor4f(1.0F, 1.0F, 1.0F, local168);
		local123.glTexCoord2f(local155, 0.0F);
		local123.glVertex2f(local137, local142);
		local123.glTexCoord2f(0.0F, 0.0F);
		local123.glVertex2f(local132, local142);
		local123.glTexCoord2f(0.0F, local163);
		local123.glVertex2f(local132, local147);
		local123.glTexCoord2f(local155, local163);
		local123.glVertex2f(local137, local147);
		local123.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	@Override
	public final void method4506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static17.method1596();
		arg0 += this.anInt5606;
		arg1 += this.anInt5604;
		@Pc(12) GL local12 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(1);
		local12.glTranslatef((float) arg0, (float) (Static3.anInt2083 - arg1), 0.0F);
		local12.glCallList(this.anInt5618);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	public final void method4520(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static17.method1596();
		@Pc(2) GL local2 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(2);
		@Pc(15) int local15 = 240 - (this.anInt5606 << 4);
		@Pc(22) int local22 = 240 - (this.anInt5604 << 4);
		local2.glTranslatef((float) arg0 / 16.0F, (float) Static3.anInt2083 - (float) arg1 / 16.0F, 0.0F);
		local2.glRotatef((float) -arg2 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		local2.glTranslatef((float) -local15 / 16.0F, (float) local22 / 16.0F, 0.0F);
		local2.glCallList(this.anInt5618);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
	@Override
	public final void method4511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static17.method1596();
		arg0 += this.anInt5606;
		arg1 += this.anInt5604;
		@Pc(12) GL local12 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(1);
		local12.glTranslatef((float) arg0, (float) (Static3.anInt2083 - arg1), 0.0F);
		@Pc(35) float local35 = (float) this.anInt5609 / (float) this.anInt5617;
		@Pc(43) float local43 = (float) this.anInt5608 / (float) this.anInt5620;
		local12.glBegin(GL.GL_TRIANGLE_FAN);
		local12.glTexCoord2f(0.0F, 0.0F);
		local12.glVertex2f((float) this.anInt5609, 0.0F);
		local12.glTexCoord2f(local35, 0.0F);
		local12.glVertex2f(0.0F, 0.0F);
		local12.glTexCoord2f(local35, local43);
		local12.glVertex2f(0.0F, (float) -this.anInt5608);
		local12.glTexCoord2f(0.0F, local43);
		local12.glVertex2f((float) this.anInt5609, (float) -this.anInt5608);
		local12.glEnd();
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method4507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		Static17.method1596();
		@Pc(8) int local8 = this.anInt5609;
		@Pc(11) int local11 = this.anInt5608;
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
		@Pc(123) GL local123 = Static3.aGL1;
		Static17.method1600(this.anInt5614);
		this.method4521(2);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (Static3.anInt2083 - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.anInt5609 / (float) this.anInt5617;
		@Pc(163) float local163 = (float) this.anInt5608 / (float) this.anInt5620;
		local123.glBegin(GL.GL_TRIANGLE_FAN);
		local123.glTexCoord2f(local155, 0.0F);
		local123.glVertex2f(local137, local142);
		local123.glTexCoord2f(0.0F, 0.0F);
		local123.glVertex2f(local132, local142);
		local123.glTexCoord2f(0.0F, local163);
		local123.glVertex2f(local132, local147);
		local123.glTexCoord2f(local155, local163);
		local123.glVertex2f(local137, local147);
		local123.glEnd();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public final void method4521(@OriginalArg(0) int arg0) {
		if (this.anInt5616 == arg0) {
			return;
		}
		this.anInt5616 = arg0;
		@Pc(9) GL local9 = Static3.aGL1;
		if (arg0 == 2) {
			local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		} else {
			local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_NEAREST);
			local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
		}
	}
}

import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class105 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Lclient!vn;")
	private Class4_Sub3_Sub14_Sub1 aClass4_Sub3_Sub14_Sub1_5;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
	private int anInt2855;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	private int anInt2856;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
	public int anInt2860;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
	private int anInt2861;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	private int anInt2865;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
	private int anInt2864 = -1;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	private int anInt2866 = -1;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	private final int anInt2863;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	private final int anInt2867;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	private final int anInt2862;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "Z")
	private final boolean aBoolean199;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	private final int anInt2858;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
	private final int anInt2859;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	private final int anInt2854;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
	private final int anInt2869;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2863 = arg2;
		this.anInt2867 = arg3;
		this.anInt2862 = arg4;
		this.aBoolean199 = arg7;
		this.anInt2858 = arg1;
		this.anInt2859 = arg6;
		this.anInt2854 = arg5;
		this.anInt2869 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method2288(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static4.aByteArray29[(arg2 >> 16) + local12] & 0xFF) + 64;
					if (local37 > 255) {
						local37 = 255;
					}
					@Pc(46) int local46 = 256 - local37;
					arg0[arg4] = ((arg1 & 0xFF00FF) * local46 + (local25 & 0xFF00FF) * local37 & 0xFF00FF00) + ((arg1 & 0xFF00) * local46 + (local25 & 0xFF00) * local37 & 0xFF0000) >> 8 | 0xFF000000;
				}
				arg4++;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!kg;)V")
	private void method2289(@OriginalArg(0) Class105 arg0) {
		Static22.method2297();
		Static22.method2305();
		@Pc(3) GL local3 = Static3.aGL1;
		Static18.method1686(Static4.anIntArray256);
		Static18.method1698();
		local3.glClearColor((float) (this.anInt2859 >> 16 & 0xFF) / 255.0F, (float) (this.anInt2859 >> 8 & 0xFF) / 255.0F, (float) (this.anInt2859 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(GL.GL_DEPTH_BUFFER_BIT | GL.GL_COLOR_BUFFER_BIT);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean199) {
				local39 = -arg0.anInt2863;
				local41 = -arg0.anInt2867;
				local43 = -arg0.anInt2862;
			} else {
				local39 = this.anInt2863 - arg0.anInt2863;
				local41 = this.anInt2867 - arg0.anInt2867;
				local43 = this.anInt2862 - arg0.anInt2862;
			}
		}
		Static9.method213(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt2861, this.anInt2861);
		if (this.anInt2865 != 0) {
			@Pc(96) int local96 = Class109.anIntArray299[this.anInt2865];
			@Pc(101) int local101 = Class109.anIntArray298[this.anInt2865];
			@Pc(113) int local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt2855 != 0) {
			@Pc(137) int local137 = this.anInt2855 - 1024 & 0x7FF;
			@Pc(141) int local141 = Class109.anIntArray299[local137];
			@Pc(145) int local145 = Class109.anIntArray298[local137];
			@Pc(157) int local157 = local43 * local141 + local39 * local145 + 32767 >> 16;
			local43 = local43 * local145 + 32767 - local39 * local141 >> 16;
			local39 = local157;
		}
		Static25.method2775((float) -local39, (float) -local41, (float) local43);
		Static25.method2782(16777215, 0.5F, 0.5F, 1.0F);
		Static25.method2777();
		if (this.anInt2859 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static4.anInterface4_1.method454(this.anInt2861, this.anInt2858);
		Static17.method1610(true);
		if (Static3.aBoolean135) {
			local3.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			local3.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(GL.GL_COLOR_ARRAY);
		local3.glNormalPointer(GL.GL_FLOAT, 20, Static4.aByteBuffer9.position(0));
		local3.glVertexPointer(2, GL.GL_FLOAT, 20, Static4.aByteBuffer9.position(0));
		local3.glTexCoordPointer(2, GL.GL_FLOAT, 20, Static4.aByteBuffer9.position(12));
		local3.glDrawElements(GL.GL_TRIANGLE_STRIP, Static4.aByteBuffer10.limit() / 2, GL.GL_UNSIGNED_SHORT, Static4.aByteBuffer10.position(0));
		local3.glEnableClientState(GL.GL_COLOR_ARRAY);
		Static17.method1610(false);
		if (this.anInt2859 != 0) {
			Static24.method2652(0, 0);
			Static17.method1597(1);
			Static17.method1607(0);
			Static17.method1600(Static4.anInt2868);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_PREVIOUS);
			local3.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
			local3.glBegin(GL.GL_QUADS);
			local3.glColor4ub((byte) (this.anInt2859 >> 16), (byte) (this.anInt2859 >> 8), (byte) this.anInt2859, (byte) 127);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(-1, -1);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, -1);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(-1, 1);
			local3.glEnd();
			local3.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_OPERAND0_ALPHA, GL.GL_SRC_ALPHA);
			local3.glLoadIdentity();
			local3.glColorMask(true, true, true, true);
			local3.glBlendFunc(GL.GL_ONE_MINUS_DST_ALPHA, GL.GL_DST_ALPHA);
			local3.glBegin(GL.GL_QUADS);
			local3.glColor4ub((byte) (this.anInt2859 >> 16), (byte) (this.anInt2859 >> 8), (byte) this.anInt2859, (byte) -1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(-1, -1);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, -1);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(-1, 1);
			local3.glEnd();
			local3.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
			local3.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_SRC0_RGB, GL.GL_TEXTURE);
		}
		Static9.method209();
		Static17.method1600(this.anInt2864);
		local3.glCopyTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, 0, 0, this.anInt2861, this.anInt2861, GL.GL_POINTS);
		Static18.method1695(Static4.anIntArray256);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Lclient!kg;)Z")
	private boolean method2290(@OriginalArg(0) Class105 arg0) {
		@Pc(5) Class53_Sub3 local5 = Static25.method2752(Static2.aClass58_37, this.anInt2858);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static3.aGL1;
		Static18.method1686(Static4.anIntArray256);
		Static18.method1698();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(GL.GL_DEPTH_BUFFER_BIT | GL.GL_COLOR_BUFFER_BIT);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean199) {
				local25 = -arg0.anInt2863;
				local27 = -arg0.anInt2867;
				local29 = -arg0.anInt2862;
			} else {
				local25 = this.anInt2863 - arg0.anInt2863;
				local27 = this.anInt2867 - arg0.anInt2867;
				local29 = this.anInt2862 - arg0.anInt2862;
			}
		}
		local5.method2748();
		@Pc(78) Class53_Sub4 local78 = local5.method2761(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method3838() - local78.method3829()) / 2;
		@Pc(94) int local94 = (local78.method3842() - local78.method3813()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static9.method212((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt2861, this.anInt2861);
		if (this.anInt2865 != 0) {
			@Pc(126) int local126 = Class109.anIntArray299[this.anInt2865];
			@Pc(131) int local131 = Class109.anIntArray298[this.anInt2865];
			@Pc(143) int local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt2855 != 0) {
			@Pc(167) int local167 = this.anInt2855 - 1024 & 0x7FF;
			@Pc(171) int local171 = Class109.anIntArray299[local167];
			@Pc(175) int local175 = Class109.anIntArray298[local167];
			@Pc(187) int local187 = local29 * local171 + local25 * local175 + 32767 >> 16;
			local29 = local29 * local175 + 32767 - local25 * local171 >> 16;
			local25 = local187;
		}
		Static25.method2775((float) -local25, (float) local27, (float) -local29);
		Static25.method2782(16777215, 0.5F, 0.5F, 0.5F);
		Static25.method2777();
		Static16.method1591();
		Static16.method1588(true);
		Static17.method1610(true);
		local78.method3822(0, 0, 0, -local86 - local78.method3829(), -local94 - local78.method3813(), 0, -1L);
		Static17.method1610(false);
		Static16.method1588(false);
		Static16.method1589();
		Static9.method209();
		Static17.method1600(this.anInt2864);
		local11.glCopyTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, 0, 0, this.anInt2861, this.anInt2861, GL.GL_POINTS);
		Static18.method1695(Static4.anIntArray256);
		return true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
	private void method2291() {
		@Pc(2) int local2 = this.anInt2861;
		@Pc(5) int local5 = this.anInt2861;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static6.anInt5188 - local2;
		if (local5 > Static6.anInt5187) {
			local5 -= local5 - Static6.anInt5187;
		}
		if (Static6.anInt5183 > 0) {
			@Pc(37) int local37 = Static6.anInt5183;
			local5 -= local37;
			local19 = local37 * Static6.anInt5188;
			local17 = local13 * local37;
		}
		if (local2 > Static6.anInt5186) {
			@Pc(60) int local60 = local2 - Static6.anInt5186;
			local2 -= local60;
			local23 += local60;
		}
		if (Static6.anInt5185 > 0) {
			@Pc(73) int local73 = Static6.anInt5185;
			local2 -= local73;
			local19 += local73;
			local15 = local9 * local73;
			local23 += local73;
		}
		this.method2307(Static6.anIntArray561, this.anInt2859, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIII)V")
	public final void method2292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt2865 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt2855 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		local27 += (arg3 - this.anInt2856) / 2;
		local33 += (arg2 - this.anInt2856) / 2;
		if (local27 >= arg3 || local27 + this.anInt2856 <= 0 || local33 >= arg2 || local33 + this.anInt2856 <= 0) {
			return;
		}
		if (this.anInt2869 == 0) {
			Static4.anInterface4_1.method454(this.anInt2861, this.anInt2858);
		} else if (this.anInt2864 == -1) {
			return;
		} else {
			Static17.method1600(this.anInt2864);
		}
		@Pc(91) int local91 = local27 + arg1;
		@Pc(95) int local95 = local33 + arg0;
		@Pc(100) int local100 = local95 + this.anInt2856;
		@Pc(105) int local105 = local91 + this.anInt2856;
		@Pc(107) GL local107 = Static3.aGL1;
		local107.glBegin(GL.GL_QUADS);
		local107.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local107.glTexCoord2f(0.0F, 0.0F);
		local107.glVertex2i(local95, local91);
		local107.glTexCoord2f(0.0F, 1.0F);
		local107.glVertex2i(local95, local105);
		local107.glTexCoord2f(1.0F, 1.0F);
		local107.glVertex2i(local100, local105);
		local107.glTexCoord2f(1.0F, 0.0F);
		local107.glVertex2i(local100, local91);
		local107.glEnd();
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(Lclient!kg;)V")
	public final void method2293(@OriginalArg(0) Class105 arg0) {
		if (this.anInt2869 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt2864 == -1 || this.anInt2866 != Static4.anInt3332;
		if (!this.aBoolean198 && !local14) {
			return;
		}
		if (local14) {
			this.anInt2866 = Static4.anInt3332;
			this.anInt2864 = Static33.method4171(Static6.anInt5136, this.anInt2861, this.anInt2861);
		} else {
			Static17.method1600(this.anInt2864);
			Static33.method4170(Static6.anInt5136, this.anInt2861, this.anInt2861);
		}
		if (this.anInt2869 == 1) {
			this.method2289(arg0);
			this.aBoolean198 = false;
		} else if (this.anInt2869 == 2) {
			this.aBoolean198 = !this.method2290(arg0);
		}
	}

	@OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method2306();
		super.finalize();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)Z")
	public final boolean method2294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(60) int local60;
		if (this.aBoolean199) {
			this.anInt2860 = 1073741823;
			local46 = this.anInt2863;
			local53 = this.anInt2867;
			local60 = this.anInt2862;
		} else {
			@Pc(7) int local7 = this.anInt2863 - arg0;
			@Pc(12) int local12 = this.anInt2867 - arg1;
			@Pc(17) int local17 = this.anInt2862 - arg2;
			this.anInt2860 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2860 == 0) {
				this.anInt2860 = 1;
			}
			local46 = (local7 << 8) / this.anInt2860;
			local53 = (local12 << 8) / this.anInt2860;
			local60 = (local17 << 8) / this.anInt2860;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local46 * local46 + local53 * local53 + local60 * local60)) * 256.0D);
		if (local90 > 128) {
			local46 = (local46 << 16) / local90;
			local53 = (local53 << 16) / local90;
			local60 = (local60 << 16) / local90;
			this.anInt2856 = this.anInt2854 * arg3 / (this.aBoolean199 ? 1024 : this.anInt2860);
		} else {
			this.anInt2856 = 0;
		}
		if (this.anInt2856 < 8) {
			this.method2306();
			this.aClass4_Sub3_Sub14_Sub1_5 = null;
			return false;
		}
		@Pc(145) int local145 = Static24.method2605(this.anInt2856);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt2861) {
			this.anInt2861 = local145;
		}
		this.anInt2865 = (int) (Math.asin((double) ((float) local53 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt2855 = (int) (Math.atan2((double) local46, (double) -local60) * 325.9493103027344D) & 0x7FF;
		this.aBoolean198 = true;
		this.aClass4_Sub3_Sub14_Sub1_5 = null;
		return true;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(Lclient!kg;)Z")
	private boolean method2298(@OriginalArg(0) Class105 arg0) {
		if (this.aClass4_Sub3_Sub14_Sub1_5 == null) {
			if (this.anInt2869 == 0) {
				this.aClass4_Sub3_Sub14_Sub1_5 = Static4.anInterface4_1.method452(true, Static4.aFloat74, this.anInt2861, this.anInt2858);
			} else if (this.anInt2869 == 2) {
				this.method2304(arg0);
			} else if (this.anInt2869 == 1) {
				this.method2300(arg0);
			}
		}
		return this.aClass4_Sub3_Sub14_Sub1_5 != null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIILclient!kg;)V")
	public final void method2299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class105 arg6) {
		@Pc(6) int local6 = this.anInt2865 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt2855 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		local27 += (arg3 - this.anInt2856) / 2;
		local33 += (arg2 - this.anInt2856) / 2;
		if (local27 < arg3 && local27 + this.anInt2856 > 0 && local33 < arg2 && local33 + this.anInt2856 > 0 && this.method2298(arg6)) {
			this.aClass4_Sub3_Sub14_Sub1_5.method4507(local33 + arg0, local27 + arg1, this.anInt2856, this.anInt2856);
		}
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(Lclient!kg;)V")
	private void method2300(@OriginalArg(0) Class105 arg0) {
		Static22.method2296();
		Static22.method2295();
		this.aClass4_Sub3_Sub14_Sub1_5 = new Class4_Sub3_Sub14_Sub1_Sub1(this.anInt2861, this.anInt2861);
		Static34.method4223(Static4.anIntArray256);
		this.aClass4_Sub3_Sub14_Sub1_5.method2178();
		Static23.method2561();
		Static33.method4205(0, 0, this.anInt2861, this.anInt2861, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean199) {
				local26 = -arg0.anInt2863;
				local28 = -arg0.anInt2867;
				local30 = -arg0.anInt2862;
			} else {
				local26 = this.anInt2863 - arg0.anInt2863;
				local28 = this.anInt2867 - arg0.anInt2867;
				local30 = this.anInt2862 - arg0.anInt2862;
			}
		}
		if (this.anInt2865 != 0) {
			@Pc(74) int local74 = Class109.anIntArray299[this.anInt2865];
			@Pc(79) int local79 = Class109.anIntArray298[this.anInt2865];
			@Pc(91) int local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		if (this.anInt2855 != 0) {
			@Pc(115) int local115 = this.anInt2855 - 1024 & 0x7FF;
			@Pc(119) int local119 = Class109.anIntArray299[local115];
			@Pc(123) int local123 = Class109.anIntArray298[local115];
			@Pc(135) int local135 = local30 * local119 + local26 * local123 + 32767 >> 16;
			local30 = local30 * local123 + 32767 - local26 * local119 >> 16;
			local26 = local135;
		}
		Static8.method72(Static4.aClass53_Sub3_1.aShortArray53, 0, Static4.aClass53_Sub3_1.anInt3353, (short) Static4.anInterface4_1.method446(this.anInt2858));
		@Pc(172) Class53_Sub4_Sub1 local172 = Static4.aClass53_Sub3_1.method2759(64, 512, -local26, -local28, -local30);
		@Pc(178) int local178 = local172.method3838() - local172.method3829();
		@Pc(184) int local184 = local172.method3842() - local172.method3813();
		if (local178 > local184) {
			@Pc(208) int local208 = this.anInt2859 == 0 ? (local178 << 9) / this.anInt2861 : (local178 * 16 << 9) / (this.anInt2861 * 13);
			local172.method2911(0, 0, 0, 0, 0, 0, local208);
		} else {
			@Pc(240) int local240 = this.anInt2859 == 0 ? (local184 << 9) / this.anInt2861 : (local184 * 16 << 9) / (this.anInt2861 * 13);
			local172.method2911(0, 0, 0, 0, 0, 0, local240);
		}
		if (this.anInt2859 == 0) {
			for (@Pc(260) int local260 = 0; local260 < Static6.anIntArray561.length; local260++) {
				if (Static6.anIntArray561[local260] != 0) {
					@Pc(269) int[] local269 = Static6.anIntArray561;
					local269[local260] |= -16777216;
				}
			}
		} else {
			this.method2301();
			this.method2291();
		}
		Static4.aClass59_1.method4244();
		Static34.method4226(Static4.anIntArray256);
		Static23.method2561();
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "()V")
	private void method2301() {
		@Pc(6) int local6 = this.anInt2861 * 3 / 32;
		@Pc(15) int local15 = this.anInt2861 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static6.anInt5188;
		@Pc(35) int local35 = Static6.anInt5188 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static6.anInt5187) {
			local17 = local15 + Static6.anInt5187 - local6 - local15;
		}
		if (local6 < Static6.anInt5183) {
			@Pc(59) int local59 = Static6.anInt5183 - local6;
			local17 -= local59;
			local31 += local59 * Static6.anInt5188;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static6.anInt5186) {
			@Pc(86) int local86 = local6 + local15 - Static6.anInt5186;
			local15 -= local86;
			local35 += local86;
		}
		if (local6 < Static6.anInt5185) {
			@Pc(101) int local101 = Static6.anInt5185 - local6;
			local15 -= local101;
			local31 += local101;
			local37 = local21 * local101;
			local35 += local101;
		}
		this.method2288(Static6.anIntArray561, this.anInt2859, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "(Lclient!kg;)V")
	private void method2304(@OriginalArg(0) Class105 arg0) {
		@Pc(5) Class53_Sub3 local5 = Static25.method2752(Static2.aClass58_37, this.anInt2858);
		if (local5 == null) {
			return;
		}
		this.aClass4_Sub3_Sub14_Sub1_5 = new Class4_Sub3_Sub14_Sub1(this.anInt2861, this.anInt2861);
		Static34.method4223(Static4.anIntArray256);
		this.aClass4_Sub3_Sub14_Sub1_5.method2178();
		Static23.method2561();
		Static33.method4205(0, 0, this.anInt2861, this.anInt2861, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean199) {
				local33 = -arg0.anInt2863;
				local35 = -arg0.anInt2867;
				local37 = -arg0.anInt2862;
			} else {
				local33 = this.anInt2863 - arg0.anInt2863;
				local35 = this.anInt2867 - arg0.anInt2867;
				local37 = this.anInt2862 - arg0.anInt2862;
			}
		}
		if (this.anInt2865 != 0) {
			@Pc(81) int local81 = Class109.anIntArray299[this.anInt2865];
			@Pc(86) int local86 = Class109.anIntArray298[this.anInt2865];
			@Pc(98) int local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		if (this.anInt2855 != 0) {
			@Pc(122) int local122 = this.anInt2855 - 1024 & 0x7FF;
			@Pc(126) int local126 = Class109.anIntArray299[local122];
			@Pc(130) int local130 = Class109.anIntArray298[local122];
			@Pc(142) int local142 = local37 * local126 + local33 * local130 + 32767 >> 16;
			local37 = local37 * local130 + 32767 - local33 * local126 >> 16;
			local33 = local142;
		}
		@Pc(167) Class53_Sub4_Sub1 local167 = local5.method2759(64, 768, -local33, -local35, -local37);
		@Pc(173) int local173 = local167.method3838() - local167.method3829();
		@Pc(179) int local179 = local167.method3842() - local167.method3813();
		@Pc(186) int local186 = local167.method3829() + local173 / 2;
		@Pc(193) int local193 = local167.method3813() + local179 / 2;
		if (local173 > local179) {
			local167.method2911(0, 0, 0, -local186, -local193, 0, (local173 << 9) / this.anInt2861);
		} else {
			local167.method2911(0, 0, 0, -local186, -local193, 0, (local179 << 9) / this.anInt2861);
		}
		Static4.aClass59_1.method4244();
		Static34.method4226(Static4.anIntArray256);
		Static23.method2561();
	}

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "()V")
	private void method2306() {
		if (this.anInt2864 != -1) {
			Static25.method2720(this.anInt2864, 0, this.anInt2866);
		}
		this.aBoolean198 = true;
		this.anInt2864 = -1;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method2307(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static4.aByteArray29[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
				} else {
					arg0[arg4] |= -16777216;
				}
				arg4++;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}
}
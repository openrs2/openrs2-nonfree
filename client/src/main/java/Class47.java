import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class47 {

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	private int anInt1247;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	private int anInt1250;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "Lclient!vn;")
	private Class4_Sub3_Sub14_Sub1 aClass4_Sub3_Sub14_Sub1_1;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	private int anInt1245 = -1;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	private final int anInt1246;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	private final int anInt1248;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
	private final int anInt1251;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	private final int anInt1249;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "[Lclient!kg;")
	private final Class105[] aClass105Array1;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "[Lclient!kg;")
	private final Class105[] aClass105Array2;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!kg;")
	private final Class105 aClass105_1;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I[Lclient!kg;IIII)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) Class105[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1246 = arg3;
		this.anInt1248 = arg4;
		this.anInt1251 = arg5;
		this.anInt1249 = arg0;
		this.aClass105Array1 = arg1;
		if (arg1 == null) {
			this.aClass105Array2 = null;
			this.aClass105_1 = null;
		} else {
			this.aClass105Array2 = new Class105[arg1.length];
			this.aClass105_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIII)V")
	public final void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1029(arg4);
		arg6 = arg6 + arg0 & 0x7FF;
		if (this.anInt1249 == -1) {
			Static33.method4205(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass4_Sub3_Sub14_Sub1_1 == null) {
				this.aClass4_Sub3_Sub14_Sub1_1 = Static4.anInterface4_1.method452(false, Static4.aFloat74, this.anInt1250, this.anInt1249);
			}
			if (!Static4.anInterface4_1.method443(this.anInt1249)) {
				Static33.method4205(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass4_Sub3_Sub14_Sub1_1 != null) {
				@Pc(47) int local47 = arg5 * arg4 / -512;
				@Pc(59) int local59;
				for (local59 = (arg3 - arg4) / 2 + arg6 * arg4 / 512; local59 > arg4; local59 -= arg4) {
				}
				while (local59 < 0) {
					local59 += arg4;
				}
				while (local47 > arg4) {
					local47 -= arg4;
				}
				while (local47 < 0) {
					local47 += arg4;
				}
				for (@Pc(93) int local93 = local59 - arg4; local93 < arg3; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < arg4; local100 += arg4) {
						this.aClass4_Sub3_Sub14_Sub1_1.method4507(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (@Pc(136) int local136 = this.anInt1247 - 1; local136 >= 0; local136--) {
			this.aClass105Array2[local136].method2299(arg1, arg2, arg3, arg4, arg5, arg6, this.aClass105_1);
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(IIIIIIII)V")
	public final void method1025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static3.aGL1;
		this.method1029(arg4);
		arg6 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static16.method1593(false);
		Static17.method1610(false);
		Static16.method1588(false);
		Static16.method1595();
		Static17.method1606(arg1, local14, arg2, local18);
		Static16.method1589();
		for (@Pc(36) int local36 = this.anInt1247 - 1; local36 >= 0; local36--) {
			this.aClass105Array2[local36].method2293(this.aClass105_1);
		}
		if (this.anInt1249 == -1) {
			Static17.method1615(arg7);
		} else {
			if (!Static4.anInterface4_1.method443(this.anInt1249)) {
				Static17.method1615(arg7);
			}
			Static4.anInterface4_1.method454(this.anInt1250, this.anInt1249);
			@Pc(71) float local71 = (float) arg5 / 512.0F;
			@Pc(76) float local76 = (float) arg6 / -512.0F;
			@Pc(86) float local86 = (float) (arg3 - arg4) / ((float) arg4 * 2.0F);
			local1.glBegin(GL.GL_QUADS);
			local1.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			local1.glTexCoord2f(local76 - local86, local71);
			local1.glVertex2i(arg1, arg2);
			local1.glTexCoord2f(local76 - local86, local71 + 1.0F);
			local1.glVertex2i(arg1, local18);
			local1.glTexCoord2f(local86 + local76 + 1.0F, local71 + 1.0F);
			local1.glVertex2i(local14, local18);
			local1.glTexCoord2f(local86 + local76 + 1.0F, local71);
			local1.glVertex2i(local14, arg2);
			local1.glEnd();
		}
		for (@Pc(155) int local155 = this.anInt1247 - 1; local155 >= 0; local155--) {
			this.aClass105Array2[local155].method2292(arg1, arg2, arg3, arg4, arg5, arg6);
		}
		Static16.method1591();
		Static16.method1588(true);
		Static17.method1610(true);
		Static16.method1593(true);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	private void method1029(@OriginalArg(0) int arg0) {
		if (this.anInt1245 == arg0) {
			return;
		}
		this.anInt1245 = arg0;
		@Pc(10) int local10 = Static24.method2605(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt1250) {
			this.anInt1250 = local10;
			this.aClass4_Sub3_Sub14_Sub1_1 = null;
		}
		if (this.aClass105Array1 == null) {
			return;
		}
		this.anInt1247 = 0;
		@Pc(36) int[] local36 = new int[this.aClass105Array1.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass105Array1.length; local38++) {
			@Pc(48) Class105 local48 = this.aClass105Array1[local38];
			if (local48.method2294(this.anInt1246, this.anInt1248, this.anInt1251, this.anInt1245)) {
				local36[this.anInt1247] = local48.anInt2860;
				this.aClass105Array2[this.anInt1247++] = local48;
			}
		}
		Static16.method2017(this.anInt1247 - 1, this.aClass105Array2, 0, local36);
	}
}
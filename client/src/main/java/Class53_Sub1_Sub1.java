import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class53_Sub1_Sub1 extends Class53_Sub1 {

	@OriginalMember(owner = "client!f", name = "Oc", descriptor = "Ljava/lang/String;")
	public String aString88;

	@OriginalMember(owner = "client!f", name = "Tc", descriptor = "Lclient!qk;")
	public Class144 aClass144_2;

	@OriginalMember(owner = "client!f", name = "sc", descriptor = "I")
	public int anInt1576 = 0;

	@OriginalMember(owner = "client!f", name = "Ac", descriptor = "I")
	public int anInt1584 = 0;

	@OriginalMember(owner = "client!f", name = "wc", descriptor = "I")
	public int anInt1580 = -1;

	@OriginalMember(owner = "client!f", name = "yc", descriptor = "I")
	public int anInt1582 = 0;

	@OriginalMember(owner = "client!f", name = "Cc", descriptor = "I")
	public int anInt1586 = -1;

	@OriginalMember(owner = "client!f", name = "pc", descriptor = "I")
	public int anInt1573 = -1;

	@OriginalMember(owner = "client!f", name = "Dc", descriptor = "I")
	public int anInt1587 = 255;

	@OriginalMember(owner = "client!f", name = "zc", descriptor = "I")
	public int anInt1583 = -1;

	@OriginalMember(owner = "client!f", name = "Lc", descriptor = "I")
	public int anInt1593 = 0;

	@OriginalMember(owner = "client!f", name = "Fc", descriptor = "B")
	private byte aByte3 = 0;

	@OriginalMember(owner = "client!f", name = "Gc", descriptor = "I")
	public int anInt1589 = -1;

	@OriginalMember(owner = "client!f", name = "Ec", descriptor = "I")
	public int anInt1588 = -1;

	@OriginalMember(owner = "client!f", name = "Jc", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!f", name = "Qc", descriptor = "I")
	public int anInt1597 = 0;

	@OriginalMember(owner = "client!f", name = "Pc", descriptor = "I")
	public int anInt1596 = -1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!fd;B)V")
	public final void method1170(@OriginalArg(0) Class4_Sub10 arg0) {
		arg0.anInt5709 = 0;
		@Pc(16) int local16 = -1;
		@Pc(20) int local20 = arg0.method4629();
		@Pc(31) boolean local31 = (local20 & 0x4) != 0;
		@Pc(35) int local35 = local20 & 0x1;
		@Pc(41) int local41 = super.method3311();
		this.method3316((local20 >> 3 & 0x7) + 1);
		this.aByte3 = (byte) (local20 >> 6 & 0x3);
		@Pc(64) int[] local64 = new int[12];
		this.anInt3974 += (this.method3311() - local41) * 64;
		this.anInt4002 += (this.method3311() - local41) * 64;
		this.anInt1573 = arg0.method4637();
		this.anInt1596 = arg0.method4637();
		this.anInt1593 = 0;
		for (@Pc(107) int local107 = 0; local107 < 12; local107++) {
			@Pc(116) int local116 = arg0.method4629();
			if (local116 == 0) {
				local64[local107] = 0;
			} else {
				@Pc(129) int local129 = arg0.method4629();
				@Pc(136) int local136 = (local116 << 8) + local129;
				if (local107 == 0 && local136 == 65535) {
					local16 = arg0.method4616();
					this.anInt1593 = arg0.method4629();
					break;
				}
				if (local136 >= 32768) {
					@Pc(165) int local165 = Static6.anIntArray545[local136 - 32768];
					local64[local107] = local165 | 0x40000000;
					@Pc(176) int local176 = Static35.method4361(local165).anInt5099;
					if (local176 != 0) {
						this.anInt1593 = local176;
					}
				} else {
					local64[local107] = Integer.MIN_VALUE | local136 - 256;
				}
			}
		}
		@Pc(199) int[] local199 = new int[5];
		for (@Pc(201) int local201 = 0; local201 < 5; local201++) {
			@Pc(208) int local208 = arg0.method4629();
			if (local208 < 0 || Static6.aShortArrayArray6[local201].length <= local208) {
				local208 = 0;
			}
			local199[local201] = local208;
		}
		this.anInt3986 = arg0.method4616();
		@Pc(242) long local242 = arg0.method4622();
		this.aString88 = Static29.method3477(local242);
		this.anInt1597 = arg0.method4629();
		if (local31) {
			this.anInt1584 = arg0.method4616();
			this.anInt1576 = this.anInt1597;
			this.anInt1586 = -1;
		} else {
			this.anInt1584 = 0;
			this.anInt1576 = arg0.method4629();
			this.anInt1586 = arg0.method4629();
			if (this.anInt1586 == 255) {
				this.anInt1586 = -1;
			}
		}
		@Pc(293) int local293 = this.anInt1582;
		this.anInt1582 = arg0.method4629();
		if (this.anInt1582 == 0) {
			Static12.method739(this);
		} else {
			@Pc(304) int local304 = this.anInt1583;
			@Pc(307) int local307 = this.anInt1588;
			@Pc(310) int local310 = this.anInt1580;
			@Pc(313) int local313 = this.anInt1589;
			@Pc(316) int local316 = this.anInt1587;
			this.anInt1588 = arg0.method4616();
			this.anInt1583 = arg0.method4616();
			this.anInt1580 = arg0.method4616();
			this.anInt1589 = arg0.method4616();
			this.anInt1587 = arg0.method4629();
			if (this.anInt1582 != local293 || local307 != this.anInt1588 || local304 != this.anInt1583 || this.anInt1580 != local310 || this.anInt1589 != local313 || this.anInt1587 != local316) {
				Static10.method383(this);
			}
		}
		if (this.aClass144_2 == null) {
			this.aClass144_2 = new Class144();
		}
		@Pc(399) int local399 = this.aClass144_2.anInt4387;
		this.aClass144_2.method3610(local16, local64, this.anInt3986, local199, local35 == 1);
		if (local16 != local399) {
			this.anInt3974 = this.anIntArray422[0] * 128 + this.method3311() * 64;
			this.anInt4002 = this.anIntArray426[0] * 128 + this.method3311() * 64;
		}
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2952();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
	@Override
	public final int method3813() {
		return this.anInt4016;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean285) {
			if (this.aClass144_2 == null) {
				return;
			}
			@Pc(26) Class46 local26 = this.anInt4007 != -1 && this.anInt3996 == 0 ? Static23.method2494(this.anInt4007) : null;
			@Pc(55) Class46 local55 = this.anInt4005 == -1 || this.aBoolean98 || this.anInt4005 == this.method3314().anInt860 && local26 != null ? null : Static23.method2494(this.anInt4005);
			@Pc(78) Class53_Sub4 local78 = this.aClass144_2.method3608(this.aClass150Array3, this.anInt4046, this.anInt4011, this.anInt4019, local55, this.anInt3970, false, this.anInt4000, local26, false, this.anInt4044);
			if (local78 == null) {
				return;
			}
			this.method3315(local78, null);
		}
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2949(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)I")
	@Override
	protected final int method3303() {
		return this.anInt3986;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		if (this.aClass144_2 == null) {
			return;
		}
		@Pc(27) Class46 local27 = this.anInt4007 != -1 && this.anInt3996 == 0 ? Static23.method2494(this.anInt4007) : null;
		@Pc(31) Class34 local31 = this.method3314();
		@Pc(53) boolean local53 = local31.anInt844 != 0 || local31.anInt847 != 0 || local31.anInt850 != 0 || local31.anInt851 != 0;
		@Pc(82) Class46 local82 = this.anInt4005 == -1 || this.aBoolean98 || this.anInt4005 == this.method3314().anInt860 && local27 != null ? null : Static23.method2494(this.anInt4005);
		@Pc(105) Class53_Sub4 local105 = this.aClass144_2.method3608(this.aClass150Array3, this.anInt4046, this.anInt4011, this.anInt4019, local82, this.anInt3970, local53, this.anInt4000, local27, true, this.anInt4044);
		@Pc(108) int local108 = Static15.method1228();
		if (Static3.aBoolean138 && Static4.anInt3256 < 96 && local108 > 50) {
			Static24.method2567();
		}
		if (Static7.anInt5543 != 0 && local108 < 50) {
			@Pc(134) int local134 = 50 - local108;
			while (Static7.anInt5425 < local134) {
				Static6.aByteArrayArray35[Static7.anInt5425] = new byte[102400];
				Static7.anInt5425++;
			}
			while (local134 < Static7.anInt5425) {
				Static7.anInt5425--;
				Static6.aByteArrayArray35[Static7.anInt5425] = null;
			}
		}
		if (local105 == null) {
			return;
		}
		this.anInt4016 = local105.method3813();
		if (Static2.aBoolean75 && (this.aClass144_2.anInt4387 == -1 || Static15.method1495(this.aClass144_2.anInt4387).aBoolean354)) {
			@Pc(222) Class53_Sub4 local222 = Static12.method745(0, local82 == null ? local27 : local82, arg0, 1, 240, local105, local82 == null ? this.anInt3970 : this.anInt4046, this.anInt4006, this.anInt4002, this.aBoolean284, 0, 160, this.anInt3974);
			if (Static3.aBoolean138) {
				@Pc(241) float local241 = Static17.method1620();
				@Pc(243) float local243 = Static17.method1612();
				Static16.method1589();
				Static17.method1621(local241, local243 - 150.0F);
				local222.method3805(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static16.method1591();
				Static17.method1621(local241, local243);
			} else {
				local222.method3805(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static4.aClass53_Sub1_Sub1_2 == this) {
			for (@Pc(275) int local275 = Static7.aClass94Array1.length - 1; local275 >= 0; local275--) {
				@Pc(282) Class94 local282 = Static7.aClass94Array1[local275];
				if (local282 != null && local282.anInt2563 != -1) {
					if (local282.anInt2561 == 1 && local282.anInt2560 >= 0 && local282.anInt2560 < Static3.aClass53_Sub1_Sub2Array1.length) {
						@Pc(315) Class53_Sub1_Sub2 local315 = Static3.aClass53_Sub1_Sub2Array1[local282.anInt2560];
						if (local315 != null) {
							@Pc(329) int local329 = local315.anInt3974 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32;
							@Pc(339) int local339 = local315.anInt4002 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
							this.method1175(arg3, local339, null, arg2, arg9, arg1, arg0, arg5, local329, arg6, local282.anInt2563, arg4, 360000, local105, arg7);
						}
					}
					if (local282.anInt2561 == 2) {
						@Pc(378) int local378 = (local282.anInt2558 - Static5.anInt3983) * 4 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32;
						@Pc(393) int local393 = (local282.anInt2565 - Static7.anInt5479) * 4 + 2 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
						@Pc(398) int local398 = local282.anInt2562 * 4;
						local398 *= local398;
						this.method1175(arg3, local393, null, arg2, arg9, arg1, arg0, arg5, local378, arg6, local282.anInt2563, arg4, local398, local105, arg7);
					}
					if (local282.anInt2561 == 10 && local282.anInt2560 >= 0 && Static5.aClass53_Sub1_Sub1Array1.length > local282.anInt2560) {
						@Pc(442) Class53_Sub1_Sub1 local442 = Static5.aClass53_Sub1_Sub1Array1[local282.anInt2560];
						if (local442 != null) {
							@Pc(455) int local455 = local442.anInt3974 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt3974 / 32;
							@Pc(466) int local466 = local442.anInt4002 / 32 - Static4.aClass53_Sub1_Sub1_2.anInt4002 / 32;
							this.method1175(arg3, local466, null, arg2, arg9, arg1, arg0, arg5, local455, arg6, local282.anInt2563, arg4, 360000, local105, arg7);
						}
					}
				}
			}
		}
		this.method3305(local105);
		@Pc(494) Class53_Sub4 local494 = null;
		this.method3312(local105, arg0);
		if (!this.aBoolean98 && this.anInt3961 != -1 && this.anInt4026 != -1) {
			@Pc(518) Class110 local518 = Static21.method2004(this.anInt3961);
			local494 = local518.method2569(this.anInt3976, this.anInt3968, this.anInt4026);
			if (local494 != null) {
				local494.method3823(0, -this.anInt3971, 0);
				if (local518.aBoolean221) {
					if (Static5.anInt3525 != 0) {
						local494.method3832(Static5.anInt3525);
					}
					if (Static6.anInt4907 != 0) {
						local494.method3817(Static6.anInt4907);
					}
					if (Static4.anInt2747 != 0) {
						local494.method3823(0, Static4.anInt2747, 0);
					}
				}
			}
		}
		@Pc(572) Class53_Sub4 local572 = null;
		if (!this.aBoolean98 && this.anObject5 != null) {
			if (this.anInt4010 <= Static2.anInt954) {
				this.anObject5 = null;
			}
			if (this.anInt4042 <= Static2.anInt954 && Static2.anInt954 < this.anInt4010) {
				if (this.anObject5 instanceof Class53_Sub7) {
					local572 = (Class53_Sub4) ((Class53_Sub7) this.anObject5).method3735();
				} else {
					local572 = (Class53_Sub4) this.anObject5;
				}
				local572.method3823(this.anInt4032 - this.anInt3974, this.anInt3975 - this.anInt4006, this.anInt4027 - this.anInt4002);
				if (this.anInt4017 == 512) {
					local572.method3827();
				} else if (this.anInt4017 == 1024) {
					local572.method3828();
				} else if (this.anInt4017 == 1536) {
					local572.method3820();
				}
			}
		}
		if (Static3.aBoolean138) {
			this.method3315(local105, local494);
			local105.aBoolean324 = true;
			local105.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
			if (local494 != null) {
				if (this.aClass20_Sub3_6 != null) {
					@Pc(736) Class53_Sub4_Sub2 local736 = (Class53_Sub4_Sub2) local494;
					this.aClass20_Sub3_6.method2967(local736.aClass158Array3, local736.aClass167Array3, true, local736.anIntArray507, local736.anIntArray504, local736.anIntArray502);
				}
				local494.aBoolean324 = true;
				local494.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
			}
		} else {
			if (local494 != null) {
				local105 = ((Class53_Sub4_Sub1) local105).method2903(local494);
			}
			if (local572 != null) {
				local105 = ((Class53_Sub4_Sub1) local105).method2903(local572);
			}
			this.method3315(local105, local494);
			local105.aBoolean324 = true;
			local105.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
		}
		if (local572 == null) {
			return;
		}
		if (this.anInt4017 == 512) {
			local572.method3820();
		} else if (this.anInt4017 == 1024) {
			local572.method3828();
		} else if (this.anInt4017 == 1536) {
			local572.method3827();
		}
		local572.method3823(this.anInt3974 - this.anInt4032, this.anInt4006 - this.anInt3975, this.anInt4002 - this.anInt4027);
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method3310() {
		return this.aClass144_2 != null;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)Ljava/lang/String;")
	public final String method1173() {
		@Pc(11) String local11 = this.aString88;
		if (Static7.aStringArray38 != null) {
			local11 = Static7.aStringArray38[this.aByte3] + local11;
		}
		if (Static2.aStringArray42 != null) {
			local11 = local11 + Static2.aStringArray42[this.aByte3];
		}
		return local11;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)I")
	@Override
	public final int method3311() {
		return this.aClass144_2 == null || this.aClass144_2.anInt4387 == -1 ? super.method3311() : Static15.method1495(this.aClass144_2.anInt4387).anInt5262;
	}

	@OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2958();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZBI)V")
	public final void method1174(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		super.method3301(arg0, this.method3311(), arg2, arg1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!ne;IIIIIIIIBIILclient!vg;I)V")
	private void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class53_Sub4 arg13, @OriginalArg(15) int arg14) {
		@Pc(15) int local15 = arg8 * arg8 + arg1 * arg1;
		if (local15 < 16 || local15 > arg12) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg8, (double) arg1) * 325.949D) & 0x7FF;
		@Pc(51) Class53_Sub4 local51 = Static29.method3427(local39, arg13, this.anInt4002, arg10, this.anInt4006, this.anInt3974);
		if (local51 == null) {
			return;
		}
		if (!Static3.aBoolean138) {
			local51.method3805(0, arg5, arg3, arg0, arg11, arg7, arg9, arg14, -1L, arg4, arg2);
			return;
		}
		@Pc(59) float local59 = Static17.method1620();
		@Pc(61) float local61 = Static17.method1612();
		Static16.method1589();
		Static17.method1621(local59, local61 - 150.0F);
		local51.method3805(0, arg5, arg3, arg0, arg11, arg7, arg9, arg14, -1L, arg4, arg2);
		Static16.method1591();
		Static17.method1621(local59, local61);
	}
}

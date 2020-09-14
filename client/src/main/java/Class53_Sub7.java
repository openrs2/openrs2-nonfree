import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class53_Sub7 extends Entity {

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "Lclient!ne;")
	private Class20_Sub3 aClass20_Sub3_7;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "Z")
	private boolean aBoolean318 = false;

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
	private final int anInt4575 = -32768;

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
	private int anInt4581 = 0;

	@OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
	private int anInt4586 = 0;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
	private int anInt4571 = -1;

	@OriginalMember(owner = "client!ri", name = "K", descriptor = "Z")
	private boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "Z")
	private boolean aBoolean320 = true;

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "Lclient!fe;")
	private SoftwareIndexedSprite aClass56_Sub1_4 = null;

	@OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
	private int anInt4594 = -1;

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
	private int anInt4591 = 0;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	private final int anInt4572;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
	private final int anInt4569;

	@OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
	private final int anInt4593;

	@OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
	private final int anInt4584;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
	private final int anInt4577;

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
	private final int anInt4587;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
	private int anInt4568;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
	private int anInt4574;

	@OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
	private int anInt4590;

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
	private int anInt4580;

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "Lclient!eg;")
	private Class46 aClass46_3;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IIIIIIIZLclient!vc;)V")
	public Class53_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Entity arg8) {
		this.anInt4572 = arg1;
		this.anInt4569 = arg4;
		this.anInt4593 = arg5;
		this.anInt4584 = arg3;
		this.anInt4577 = arg2;
		this.anInt4587 = arg0;
		if (arg8 != null) {
			this.aBoolean318 = true;
			if (arg8 instanceof Class53_Sub7) {
				@Pc(96) Class53_Sub7 local96 = (Class53_Sub7) arg8;
				if (GlRenderer.enabled) {
					local96.method3732();
				}
				this.anInt4568 = local96.anInt4568;
				this.anInt4574 = local96.anInt4574;
				this.anInt4590 = local96.anInt4590;
				this.anInt4580 = local96.anInt4580;
				this.aClass46_3 = local96.aClass46_3;
			} else if (GlRenderer.enabled) {
				@Pc(65) LocType local65 = LocTypeList.get(this.anInt4587);
				if (local65.anIntArray631 != null) {
					local65 = local65.method4453();
				}
				if (local65 != null) {
					Static15.method4592(this.anInt4569, 0, this.anInt4577, this.anInt4584, local65, 0, this.anInt4593, this.anInt4572);
				}
			}
		}
		if (this.aBoolean318) {
			this.method3730(arg6);
		}
		if (GlRenderer.enabled && arg8 != null) {
			this.method3728(true);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Entity local5 = null;
		if (GlRenderer.enabled) {
			local5 = this.method3728(true);
		} else {
			this.method3731(arg4, arg3);
		}
		if (!this.aBoolean319) {
			if (local5 == null) {
				local5 = this.method3735();
			}
			if (local5 == null) {
				return;
			}
			this.method3737(local5);
		}
		if (this.aClass20_Sub3_7 != null) {
			this.aClass20_Sub3_7.method2949(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		@Pc(7) Entity local7 = this.method3735();
		if (local7 != null) {
			this.method3737(local7);
			local7.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_7);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)Lclient!vc;")
	private Entity method3728(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static6.anIntArrayArrayArray13 != Static6.anIntArrayArrayArray14;
		@Pc(17) LocType local17 = LocTypeList.get(this.anInt4587);
		if (local17.anIntArray631 != null) {
			local17 = local17.method4453();
		}
		if (local17 == null) {
			if (GlRenderer.enabled && !local12) {
				this.method3732();
			}
			this.anInt4594 = this.anInt4574;
			this.anInt4571 = -1;
			return null;
		}
		if (!this.aBoolean318 && local17.id != this.anInt4571) {
			this.method3730(-1);
		}
		@Pc(63) int local63 = this.anInt4577 & 0x3;
		@Pc(80) int local80;
		@Pc(83) int local83;
		if (local63 == 1 || local63 == 3) {
			local80 = local17.anInt5516;
			local83 = local17.anInt5527;
		} else {
			local80 = local17.anInt5527;
			local83 = local17.anInt5516;
		}
		@Pc(98) int local98 = (local83 >> 1) + this.anInt4593;
		@Pc(107) int local107 = this.anInt4569 + (local80 + 1 >> 1);
		@Pc(114) int local114 = this.anInt4569 + (local80 >> 1);
		@Pc(124) int local124 = this.anInt4593 + (local83 + 1 >> 1);
		this.method3731(local98 * 128, local114 * 128);
		@Pc(176) boolean local176 = !local12 && local17.aBoolean372 && (this.anInt4571 != local17.id || (this.anInt4574 != this.anInt4594 || this.aClass46_3 != null && (this.aClass46_3.aBoolean71 || Static6.aBoolean258) && this.anInt4574 != this.anInt4580) && Preferences.sceneryShadows >= 2);
		if (arg0 && !local176) {
			this.anInt4594 = this.anInt4574;
			this.anInt4571 = local17.id;
			return null;
		}
		@Pc(199) int local199 = (local80 << 6) + (this.anInt4569 << 7);
		@Pc(202) int[][] local202 = null;
		@Pc(212) int local212 = (this.anInt4593 << 7) + (local83 << 6);
		@Pc(217) int[][] local217 = Static6.anIntArrayArrayArray13[this.anInt4584];
		if (local12) {
			local202 = Static6.anIntArrayArrayArray14[0];
		} else if (this.anInt4584 < 3) {
			local202 = Static6.anIntArrayArrayArray13[this.anInt4584 + 1];
		}
		@Pc(267) int local267 = local217[local114][local98] + local217[local107][local98] + local217[local114][local124] + local217[local107][local124] >> 2;
		if (GlRenderer.enabled && local176) {
			Static14.method1210(this.aClass56_Sub1_4, this.anInt4581, this.anInt4586, this.anInt4591);
		}
		@Pc(287) boolean local287 = this.aClass56_Sub1_4 == null;
		@Pc(321) Class96 local321;
		if (this.aClass46_3 == null) {
			local321 = local17.method4450(local199, false, this.anInt4572, local267, local217, local202, local176, this.anInt4577, local212, local287 ? Static1.aClass56_Sub1_1 : this.aClass56_Sub1_4);
		} else {
			local321 = local17.method4458(local199, local217, this.anInt4574, local212, local267, local176, this.anInt4577, this.anInt4572, this.anInt4568, local202, this.aClass46_3, local287 ? Static1.aClass56_Sub1_1 : this.aClass56_Sub1_4, this.anInt4580);
		}
		if (local321 == null) {
			this.anInt4594 = this.anInt4574;
			this.anInt4571 = local17.id;
			return null;
		}
		if (GlRenderer.enabled && local176) {
			@Pc(363) int local363 = 0;
			if (local287) {
				Static1.aClass56_Sub1_1 = local321.aClass56_Sub1_3;
			}
			if (this.anInt4584 != 0) {
				@Pc(379) int[][] local379 = Static6.anIntArrayArrayArray13[0];
				local363 = local267 - (local379[local114][local98] + local379[local107][local98] + local379[local114][local124] + local379[local107][local124] >> 2);
			}
			@Pc(414) SoftwareIndexedSprite local414 = local321.aClass56_Sub1_3;
			if (this.aBoolean320 && Static14.method1214(local414, local199, local363, local212)) {
				this.aBoolean320 = false;
			}
			if (!this.aBoolean320) {
				Static14.method1212(local414, local199, local363, local212);
				if (local287) {
					Static1.aClass56_Sub1_1 = null;
				}
				this.anInt4591 = local212;
				this.aClass56_Sub1_4 = local414;
				this.anInt4586 = local363;
				this.anInt4581 = local199;
			}
		}
		this.anInt4571 = local17.id;
		this.anInt4594 = this.anInt4574;
		return local321.aClass53_3;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	private void method3730(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(20) LocType local20 = LocTypeList.get(this.anInt4587);
			@Pc(22) LocType local22 = local20;
			if (local20.anIntArray631 != null) {
				local20 = local20.method4453();
			}
			if (local20 == null) {
				return;
			}
			if (local20 == local22) {
				local22 = null;
			}
			if (local20.anIntArray633 != null) {
				if (this.aClass46_3 != null && local20.method4465(this.aClass46_3.anInt1223)) {
					return;
				}
				local7 = local20.method4460();
				if (this.anInt4571 != local20.id) {
					local9 = local20.aBoolean380;
				}
			} else if (local20.anInt5523 == -1) {
				if (local22 != null && local22.anIntArray633 != null) {
					if (this.aClass46_3 != null && local22.method4465(this.aClass46_3.anInt1223)) {
						return;
					}
					local7 = local22.method4460();
					if (local22.id != this.anInt4571) {
						local9 = local22.aBoolean380;
					}
				} else if (local22 != null && local22.anInt5523 != -1 && this.anInt4571 != local22.id) {
					local9 = local22.aBoolean380;
					local7 = local22.anInt5523;
				}
			} else if (this.anInt4571 != local20.id) {
				local9 = local20.aBoolean380;
				local7 = local20.anInt5523;
			}
		}
		if (local7 == -1) {
			this.aClass46_3 = null;
			return;
		}
		if (this.aClass46_3 == null || this.aClass46_3.anInt1223 != local7) {
			this.aClass46_3 = Static23.method2494(local7);
		} else if (this.aClass46_3.anInt1238 == 0) {
			return;
		}
		if (local9) {
			this.anInt4574 = (int) (Math.random() * (double) this.aClass46_3.anIntArray95.length);
			this.anInt4568 = (int) ((double) this.aClass46_3.anIntArray94[this.anInt4574] * Math.random()) + 1;
		} else {
			this.anInt4568 = 1;
			this.anInt4574 = 0;
		}
		this.anInt4580 = this.anInt4574 + 1;
		if (this.anInt4580 < 0 || this.aClass46_3.anIntArray95.length <= this.anInt4580) {
			this.anInt4580 = -1;
		}
		this.anInt4590 = Static2.anInt954 - this.anInt4568;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V")
	private void method3731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label85:
		while (true) {
			if (this.aClass46_3 == null) {
				if (this.aBoolean318) {
					return;
				}
				this.method3730(-1);
				if (this.aClass46_3 == null) {
					return;
				}
			}
			@Pc(35) int local35 = Static2.anInt954 - this.anInt4590;
			if (local35 > 100 && this.aClass46_3.anInt1242 > 0) {
				@Pc(53) int local53 = this.aClass46_3.anIntArray95.length - this.aClass46_3.anInt1242;
				while (this.anInt4574 < local53 && this.aClass46_3.anIntArray94[this.anInt4574] < local35) {
					local35 -= this.aClass46_3.anIntArray94[this.anInt4574];
					this.anInt4574++;
				}
				if (this.anInt4574 >= local53) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local53; local94 < this.aClass46_3.anIntArray95.length; local94++) {
						local92 += this.aClass46_3.anIntArray94[local94];
					}
					local35 %= local92;
				}
				this.anInt4580 = this.anInt4574 + 1;
				if (this.aClass46_3.anIntArray95.length <= this.anInt4580) {
					this.anInt4580 -= this.aClass46_3.anInt1242;
					if (this.anInt4580 < 0 || this.anInt4580 >= this.aClass46_3.anIntArray95.length) {
						this.anInt4580 = -1;
					}
				}
			}
			while (this.aClass46_3.anIntArray94[this.anInt4574] < local35) {
				Static29.method3461(this.aClass46_3, arg0, arg1, this.anInt4574, false);
				local35 -= this.aClass46_3.anIntArray94[this.anInt4574];
				this.anInt4574++;
				if (this.aClass46_3.anIntArray95.length <= this.anInt4574) {
					this.anInt4574 -= this.aClass46_3.anInt1242;
					if (this.anInt4574 < 0 || this.aClass46_3.anIntArray95.length <= this.anInt4574) {
						this.aClass46_3 = null;
						continue label85;
					}
				}
				this.anInt4580 = this.anInt4574 + 1;
				if (this.anInt4580 >= this.aClass46_3.anIntArray95.length) {
					this.anInt4580 -= this.aClass46_3.anInt1242;
					if (this.anInt4580 < 0 || this.aClass46_3.anIntArray95.length <= this.anInt4580) {
						this.anInt4580 = -1;
					}
				}
			}
			this.anInt4568 = local35;
			this.anInt4590 = Static2.anInt954 - local35;
			return;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public final void method3732() {
		if (this.aClass56_Sub1_4 != null) {
			Static14.method1210(this.aClass56_Sub1_4, this.anInt4581, this.anInt4586, this.anInt4591);
			this.aClass56_Sub1_4 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)Lclient!vc;")
	public final Entity method3735() {
		return this.method3728(false);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()I")
	@Override
	public final int method3813() {
		return this.anInt4575;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLclient!vc;)V")
	private void method3737(@OriginalArg(1) Entity arg0) {
		if (GlRenderer.enabled) {
			@Pc(70) GlModel local70 = (GlModel) arg0;
			if ((this.aClass20_Sub3_7 == null || this.aClass20_Sub3_7.aBoolean250) && (local70.aClass158Array3 != null || local70.aClass167Array3 != null)) {
				@Pc(91) LocType local91 = LocTypeList.get(this.anInt4587);
				if (local91.anIntArray631 != null) {
					local91 = local91.method4453();
				}
				if (local91 != null) {
					this.aClass20_Sub3_7 = new Class20_Sub3(Static2.anInt954, local91.anInt5527, local91.anInt5516);
				}
			}
			if (this.aClass20_Sub3_7 != null) {
				this.aClass20_Sub3_7.method2967(local70.aClass158Array3, local70.aClass167Array3, false, local70.anIntArray507, local70.anIntArray504, local70.anIntArray502);
			}
		} else {
			@Pc(8) SoftwareModel local8 = (SoftwareModel) arg0;
			if ((this.aClass20_Sub3_7 == null || this.aClass20_Sub3_7.aBoolean250) && (local8.aClass158Array2 != null || local8.aClass167Array2 != null)) {
				@Pc(28) LocType local28 = LocTypeList.get(this.anInt4587);
				if (local28.anIntArray631 != null) {
					local28 = local28.method4453();
				}
				if (local28 != null) {
					this.aClass20_Sub3_7 = new Class20_Sub3(Static2.anInt954, local28.anInt5527, local28.anInt5516);
				}
			}
			if (this.aClass20_Sub3_7 != null) {
				this.aClass20_Sub3_7.method2967(local8.aClass158Array2, local8.aClass167Array2, false, local8.anIntArray347, local8.anIntArray344, local8.anIntArray340);
			}
		}
		this.aBoolean319 = true;
	}

	@OriginalMember(owner = "client!ri", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		if (this.aClass20_Sub3_7 != null) {
			this.aClass20_Sub3_7.method2958();
		}
	}
}

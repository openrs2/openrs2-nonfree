import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public abstract class PathingEntity extends Entity {

	@OriginalMember(owner = "client!be", name = "j", descriptor = "[I")
	public static final int[] ANGLES = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	public int anInt3966;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
	public int anInt3971;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
	public int anInt3973;

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
	public int anInt3975;

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
	public int anInt3984;

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "Lclient!ne;")
	protected ParticleSystem aClass20_Sub3_6;

	@OriginalMember(owner = "client!qc", name = "ob", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!qc", name = "tb", descriptor = "I")
	public int anInt4006;

	@OriginalMember(owner = "client!qc", name = "wb", descriptor = "I")
	public int anInt4008;

	@OriginalMember(owner = "client!qc", name = "Db", descriptor = "I")
	public int anInt4013;

	@OriginalMember(owner = "client!qc", name = "Hb", descriptor = "I")
	public int anInt4017;

	@OriginalMember(owner = "client!qc", name = "Ib", descriptor = "I")
	public int anInt4018;

	@OriginalMember(owner = "client!qc", name = "Mb", descriptor = "I")
	public int anInt4022;

	@OriginalMember(owner = "client!qc", name = "Pb", descriptor = "I")
	public int anInt4025;

	@OriginalMember(owner = "client!qc", name = "Rb", descriptor = "I")
	public int anInt4027;

	@OriginalMember(owner = "client!qc", name = "Vb", descriptor = "I")
	public int anInt4031;

	@OriginalMember(owner = "client!qc", name = "Wb", descriptor = "I")
	public int anInt4032;

	@OriginalMember(owner = "client!qc", name = "Xb", descriptor = "I")
	public int anInt4033;

	@OriginalMember(owner = "client!qc", name = "Yb", descriptor = "I")
	public int anInt4034;

	@OriginalMember(owner = "client!qc", name = "cc", descriptor = "I")
	public int anInt4038;

	@OriginalMember(owner = "client!qc", name = "gc", descriptor = "I")
	public int anInt4041;

	@OriginalMember(owner = "client!qc", name = "ic", descriptor = "I")
	public int anInt4043;

	@OriginalMember(owner = "client!qc", name = "mc", descriptor = "Ljava/lang/Object;")
	public Object anObject5;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "[I")
	public final int[] anIntArray422 = new int[10];

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
	private int anInt3967 = 0;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
	public int anInt3968 = 0;

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "[Lclient!re;")
	public final Class150[] aClass150Array3 = new Class150[12];

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
	private int anInt3978 = 0;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
	private int anInt3972 = 0;

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
	private int size = 1;

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
	public int anInt3985 = -1;

	@OriginalMember(owner = "client!qc", name = "db", descriptor = "[I")
	public final int[] anIntArray424 = new int[4];

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
	public int anInt3987 = 0;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "Z")
	private boolean aBoolean280 = false;

	@OriginalMember(owner = "client!qc", name = "hb", descriptor = "I")
	private int anInt3997 = 0;

	@OriginalMember(owner = "client!qc", name = "fb", descriptor = "Z")
	public boolean aBoolean282 = true;

	@OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
	public int anInt3989 = 0;

	@OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
	public int anInt3999 = 0;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	public int anInt3965 = 0;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
	public int basId = -1;

	@OriginalMember(owner = "client!qc", name = "ub", descriptor = "I")
	public int anInt4007 = -1;

	@OriginalMember(owner = "client!qc", name = "Ab", descriptor = "I")
	public int anInt4010 = 0;

	@OriginalMember(owner = "client!qc", name = "Bb", descriptor = "I")
	public int anInt4011 = -1;

	@OriginalMember(owner = "client!qc", name = "lb", descriptor = "I")
	public int anInt4000 = 0;

	@OriginalMember(owner = "client!qc", name = "yb", descriptor = "I")
	public int anInt4009 = 32;

	@OriginalMember(owner = "client!qc", name = "X", descriptor = "Z")
	public boolean aBoolean281 = false;

	@OriginalMember(owner = "client!qc", name = "Cb", descriptor = "I")
	private int anInt4012 = 0;

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "Ljava/lang/String;")
	public String aString234 = null;

	@OriginalMember(owner = "client!qc", name = "kb", descriptor = "Z")
	public boolean aBoolean283 = false;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "[B")
	public final byte[] aByteArray51 = new byte[10];

	@OriginalMember(owner = "client!qc", name = "gb", descriptor = "I")
	public int anInt3996 = 0;

	@OriginalMember(owner = "client!qc", name = "pb", descriptor = "Z")
	public boolean aBoolean284 = false;

	@OriginalMember(owner = "client!qc", name = "mb", descriptor = "I")
	public int anInt4001 = 0;

	@OriginalMember(owner = "client!qc", name = "sb", descriptor = "I")
	public int anInt4005 = -1;

	@OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
	public int anInt3992 = 0;

	@OriginalMember(owner = "client!qc", name = "Nb", descriptor = "I")
	public int anInt4023 = 100;

	@OriginalMember(owner = "client!qc", name = "Tb", descriptor = "I")
	public int anInt4029 = 0;

	@OriginalMember(owner = "client!qc", name = "ib", descriptor = "I")
	public int anInt3998 = 0;

	@OriginalMember(owner = "client!qc", name = "Ub", descriptor = "I")
	public int anInt4030 = 0;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public int anInt3961 = -1;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	public int anInt3970 = 0;

	@OriginalMember(owner = "client!qc", name = "Jb", descriptor = "I")
	public int anInt4019 = -1;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
	public int anInt3976 = -1;

	@OriginalMember(owner = "client!qc", name = "Eb", descriptor = "I")
	public int anInt4014 = 0;

	@OriginalMember(owner = "client!qc", name = "Qb", descriptor = "I")
	public int anInt4026 = 0;

	@OriginalMember(owner = "client!qc", name = "nb", descriptor = "[I")
	public final int[] anIntArray425 = new int[4];

	@OriginalMember(owner = "client!qc", name = "Gb", descriptor = "I")
	protected int anInt4016 = -32768;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
	public int anInt3981 = 0;

	@OriginalMember(owner = "client!qc", name = "dc", descriptor = "I")
	private int anInt4039 = 0;

	@OriginalMember(owner = "client!qc", name = "ac", descriptor = "I")
	private int anInt4036 = 0;

	@OriginalMember(owner = "client!qc", name = "Fb", descriptor = "I")
	public int anInt4015 = 0;

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "[I")
	public final int[] anIntArray423 = new int[4];

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
	public int anInt3993 = -1000;

	@OriginalMember(owner = "client!qc", name = "bc", descriptor = "I")
	public int anInt4037 = 0;

	@OriginalMember(owner = "client!qc", name = "fc", descriptor = "[I")
	public final int[] anIntArray426 = new int[10];

	@OriginalMember(owner = "client!qc", name = "Sb", descriptor = "I")
	private int anInt4028 = 0;

	@OriginalMember(owner = "client!qc", name = "Kb", descriptor = "I")
	public int anInt4020 = 0;

	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
	public int anInt3994 = 0;

	@OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
	public int anInt3990 = 0;

	@OriginalMember(owner = "client!qc", name = "qb", descriptor = "I")
	public int anInt4003 = 0;

	@OriginalMember(owner = "client!qc", name = "hc", descriptor = "I")
	public int anInt4042 = 0;

	@OriginalMember(owner = "client!qc", name = "lc", descriptor = "I")
	public int anInt4046 = 0;

	@OriginalMember(owner = "client!qc", name = "jc", descriptor = "I")
	public int anInt4044 = 0;

	@OriginalMember(owner = "client!qc", name = "vb", descriptor = "Z")
	protected boolean aBoolean285 = false;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BIIIZ)V")
	public final void method3301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (this.anInt4007 != -1 && SeqTypeList.get(this.anInt4007).anInt1237 == 1) {
			this.anInt4007 = -1;
		}
		if (this.anInt3961 != -1) {
			@Pc(39) SpotAnimType local39 = SpotAnimTypeList.get(this.anInt3961);
			if (local39.aBoolean222 && SeqTypeList.get(local39.anInt3134).anInt1237 == 1) {
				this.anInt3961 = -1;
			}
		}
		if (!arg3) {
			@Pc(63) int local63 = arg2 - this.anIntArray422[0];
			@Pc(71) int local71 = arg0 - this.anIntArray426[0];
			if (local63 >= -8 && local63 <= 8 && local71 >= -8 && local71 <= 8) {
				if (this.anInt3965 < 9) {
					this.anInt3965++;
				}
				for (@Pc(103) int local103 = this.anInt3965; local103 > 0; local103--) {
					this.anIntArray422[local103] = this.anIntArray422[local103 - 1];
					this.anIntArray426[local103] = this.anIntArray426[local103 - 1];
					this.aByteArray51[local103] = this.aByteArray51[local103 - 1];
				}
				this.anIntArray422[0] = arg2;
				this.aByteArray51[0] = 1;
				this.anIntArray426[0] = arg0;
				return;
			}
		}
		this.anInt4030 = 0;
		this.anInt4037 = 0;
		this.anIntArray422[0] = arg2;
		this.anIntArray426[0] = arg0;
		this.z = this.anIntArray426[0] * 128 + arg1 * 64;
		this.anInt3965 = 0;
		this.x = this.anIntArray422[0] * 128 + arg1 * 64;
		if (GlRenderer.enabled && PlayerList.self == this) {
			Static17.method1655();
		}
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2952();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)I")
	protected abstract int method3303();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
	public final void method3304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			if (arg0 >= this.anIntArray425[local7]) {
				this.anIntArray423[local7] = arg2;
				this.anIntArray424[local7] = arg1;
				this.anIntArray425[local7] = arg0 + 70;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!vg;)V")
	protected final void method3305(@OriginalArg(1) Model arg0) {
		@Pc(9) BasType local9 = this.method3314();
		if (local9.anInt850 == 0 && local9.anInt851 == 0) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		if (this.aBoolean283 && this.anInt4020 != 0) {
			local21 = local9.anInt851;
			if (this.anInt4020 < 0) {
				local19 = -local9.anInt850;
			} else {
				local19 = local9.anInt850;
			}
		}
		if (local9.anInt856 != 0) {
			if (this.anInt3978 != local19) {
				if (this.anInt4039 > 0 && local19 > this.anInt3972) {
					@Pc(83) int local83 = this.anInt4039 * this.anInt4039 / (local9.anInt856 * 2);
					@Pc(89) int local89 = local19 - this.anInt3972;
					if (local83 <= local89) {
						this.aBoolean279 = true;
						this.anInt4028 = (this.anInt3972 + local19 - local83) / 2;
						@Pc(122) int local122 = local9.anInt838 * local9.anInt838 / (local9.anInt856 * 2);
						@Pc(127) int local127 = local19 - local122;
						if (this.anInt4028 < local127) {
							this.anInt4028 = local127;
						}
					} else {
						this.aBoolean279 = false;
					}
				} else if (this.anInt4039 < 0 && this.anInt3972 > local19) {
					@Pc(171) int local171 = this.anInt4039 * this.anInt4039 / (local9.anInt856 * 2);
					@Pc(176) int local176 = local19 - this.anInt3972;
					if (local176 >= local171) {
						this.anInt4028 = (local19 + local171 + this.anInt3972) / 2;
						@Pc(200) int local200 = local9.anInt838 * local9.anInt838 / (local9.anInt856 * 2);
						this.aBoolean279 = true;
						@Pc(207) int local207 = local200 + local19;
						if (this.anInt4028 > local207) {
							this.anInt4028 = local207;
						}
					} else {
						this.aBoolean279 = false;
					}
				} else {
					this.aBoolean279 = false;
				}
				this.anInt3978 = local19;
			}
			if (this.anInt4039 == 0) {
				@Pc(243) int local243 = this.anInt3978 - this.anInt3972;
				if (local243 > -local9.anInt856 && local9.anInt856 > local243) {
					this.anInt3972 = this.anInt3978;
				} else {
					@Pc(269) int local269 = local9.anInt838 * local9.anInt838 / (local9.anInt856 * 2);
					this.anInt4028 = (this.anInt3978 + this.anInt3972) / 2;
					if (local243 < 0) {
						@Pc(288) int local288 = this.anInt3978 + local269;
						this.anInt4039 = -local9.anInt856;
						if (this.anInt4028 > local288) {
							this.anInt4028 = local288;
						}
					} else {
						@Pc(312) int local312 = this.anInt3978 - local269;
						this.anInt4039 = local9.anInt856;
						if (local312 > this.anInt4028) {
							this.anInt4028 = local312;
						}
					}
					this.aBoolean279 = true;
				}
			} else if (this.anInt4039 <= 0) {
				if (this.anInt4028 >= this.anInt3972) {
					this.aBoolean279 = false;
				}
				if (!this.aBoolean279) {
					this.anInt4039 += local9.anInt856;
					if (this.anInt4039 > 0) {
						this.anInt4039 = 0;
					}
				} else if (this.anInt4039 > -local9.anInt838) {
					this.anInt4039 -= local9.anInt856;
				}
			} else {
				if (this.anInt4028 <= this.anInt3972) {
					this.aBoolean279 = false;
				}
				if (!this.aBoolean279) {
					this.anInt4039 -= local9.anInt856;
					if (this.anInt4039 < 0) {
						this.anInt4039 = 0;
					}
				} else if (this.anInt4039 < local9.anInt838) {
					this.anInt4039 += local9.anInt856;
				}
			}
			this.anInt3972 += this.anInt4039;
			if (this.anInt3972 != 0) {
				@Pc(445) int local445 = this.anInt3972 >> 5 & 0x7FF;
				@Pc(450) int local450 = arg0.method3813() / 2;
				arg0.method3823(0, -local450, 0);
				arg0.method3817(local445);
				arg0.method3823(0, local450, 0);
			}
		}
		if (local9.anInt863 == 0) {
			return;
		}
		if (local21 != this.anInt4012) {
			if (this.anInt4036 > 0 && local21 > this.anInt3997) {
				@Pc(568) int local568 = local21 - this.anInt3997;
				@Pc(579) int local579 = this.anInt4036 * this.anInt4036 / (local9.anInt863 * 2);
				if (local579 > local568) {
					this.aBoolean280 = false;
				} else {
					this.aBoolean280 = true;
					@Pc(601) int local601 = local9.anInt848 * local9.anInt848 / (local9.anInt863 * 2);
					this.anInt3967 = (local21 + this.anInt3997 - local579) / 2;
					@Pc(616) int local616 = local21 - local601;
					if (this.anInt3967 < local616) {
						this.anInt3967 = local616;
					}
				}
			} else if (this.anInt4036 < 0 && local21 < this.anInt3997) {
				@Pc(506) int local506 = this.anInt4036 * this.anInt4036 / (local9.anInt863 * 2);
				@Pc(512) int local512 = local21 - this.anInt3997;
				if (local506 > local512) {
					this.aBoolean280 = false;
				} else {
					this.aBoolean280 = true;
					this.anInt3967 = (local21 + local506 + this.anInt3997) / 2;
					@Pc(544) int local544 = local9.anInt848 * local9.anInt848 / (local9.anInt863 * 2);
					@Pc(548) int local548 = local544 + local21;
					if (local548 < this.anInt3967) {
						this.anInt3967 = local548;
					}
				}
			} else {
				this.aBoolean280 = false;
			}
			this.anInt4012 = local21;
		}
		if (this.anInt4036 == 0) {
			@Pc(735) int local735 = this.anInt4012 - this.anInt3997;
			if (-local9.anInt863 < local735 && local735 < local9.anInt863) {
				this.anInt3997 = this.anInt4012;
			} else {
				this.anInt3967 = (this.anInt4012 + this.anInt3997) / 2;
				@Pc(770) int local770 = local9.anInt848 * local9.anInt848 / (local9.anInt863 * 2);
				this.aBoolean280 = true;
				if (local735 < 0) {
					@Pc(783) int local783 = local770 + this.anInt4012;
					if (this.anInt3967 > local783) {
						this.anInt3967 = local783;
					}
					this.anInt4036 = -local9.anInt863;
				} else {
					this.anInt4036 = local9.anInt863;
					@Pc(807) int local807 = this.anInt4012 - local770;
					if (this.anInt3967 < local807) {
						this.anInt3967 = local807;
					}
				}
			}
		} else if (this.anInt4036 > 0) {
			if (this.anInt3967 <= this.anInt3997) {
				this.aBoolean280 = false;
			}
			if (!this.aBoolean280) {
				this.anInt4036 -= local9.anInt863;
				if (this.anInt4036 < 0) {
					this.anInt4036 = 0;
				}
			} else if (this.anInt4036 < local9.anInt848) {
				this.anInt4036 += local9.anInt863;
			}
		} else {
			if (this.anInt3967 >= this.anInt3997) {
				this.aBoolean280 = false;
			}
			if (!this.aBoolean280) {
				this.anInt4036 += local9.anInt863;
				if (this.anInt4036 > 0) {
					this.anInt4036 = 0;
				}
			} else if (this.anInt4036 > -local9.anInt848) {
				this.anInt4036 -= local9.anInt863;
			}
		}
		this.anInt3997 += this.anInt4036;
		if (this.anInt3997 == 0) {
			return;
		}
		@Pc(840) int local840 = this.anInt3997 >> 5 & 0x7FF;
		@Pc(845) int local845 = arg0.method3813() / 2;
		arg0.method3823(0, -local845, 0);
		arg0.method3832(local840);
		arg0.method3823(0, local845, 0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)I")
	public final int method3306() {
		return this.anInt4016 == -32768 ? 200 : -this.anInt4016;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public final void method3307() {
		this.anInt4030 = 0;
		this.anInt3965 = 0;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
	public final void method3308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anIntArray422[0];
		@Pc(15) int local15 = this.anIntArray426[0];
		if (arg0 == 0) {
			local6--;
			local15++;
		}
		if (this.anInt4007 != -1 && SeqTypeList.get(this.anInt4007).anInt1237 == 1) {
			this.anInt4007 = -1;
		}
		if (arg0 == 1) {
			local15++;
		}
		if (this.anInt3961 != -1) {
			@Pc(58) SpotAnimType local58 = SpotAnimTypeList.get(this.anInt3961);
			if (local58.aBoolean222 && SeqTypeList.get(local58.anInt3134).anInt1237 == 1) {
				this.anInt3961 = -1;
			}
		}
		if (arg0 == 2) {
			local15++;
			local6++;
		}
		if (this.anInt3965 < 9) {
			this.anInt3965++;
		}
		for (@Pc(95) int local95 = this.anInt3965; local95 > 0; local95--) {
			this.anIntArray422[local95] = this.anIntArray422[local95 - 1];
			this.anIntArray426[local95] = this.anIntArray426[local95 - 1];
			this.aByteArray51[local95] = this.aByteArray51[local95 - 1];
		}
		this.aByteArray51[0] = (byte) arg1;
		if (arg0 == 3) {
			local6--;
		}
		if (arg0 == 4) {
			local6++;
		}
		if (arg0 == 5) {
			local6--;
			local15--;
		}
		if (arg0 == 6) {
			local15--;
		}
		if (arg0 == 7) {
			local6++;
			local15--;
		}
		this.anIntArray422[0] = local6;
		this.anIntArray426[0] = local15;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)Z")
	public boolean method3310() {
		return false;
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
	public int getSize() {
		return this.size;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!vg;II)V")
	protected final void method3312(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1) {
		Static6.anInt4907 = 0;
		Static4.anInt2747 = 0;
		Static5.anInt3525 = 0;
		@Pc(9) BasType local9 = this.method3314();
		@Pc(16) int local16 = local9.anInt844;
		@Pc(19) int local19 = local9.anInt847;
		if (local16 == 0 || local19 == 0) {
			return;
		}
		@Pc(31) int local31 = MathUtils.SINE[arg1];
		@Pc(35) int local35 = MathUtils.COSINE[arg1];
		@Pc(40) int local40 = -local16 / 2;
		@Pc(45) int local45 = -local19 / 2;
		@Pc(55) int local55 = local35 * local45 - local40 * local31 >> 16;
		@Pc(65) int local65 = local35 * local40 + local45 * local31 >> 16;
		@Pc(70) int local70 = -local19 / 2;
		@Pc(82) int local82 = Static11.method522(local55 + this.z, local65 + this.x, Static7.y);
		@Pc(86) int local86 = local16 / 2;
		@Pc(91) int local91 = -local16 / 2;
		@Pc(102) int local102 = local31 * local70 + local86 * local35 >> 16;
		@Pc(106) int local106 = local19 / 2;
		@Pc(116) int local116 = local35 * local106 - local31 * local91 >> 16;
		@Pc(126) int local126 = local35 * local70 - local31 * local86 >> 16;
		@Pc(136) int local136 = local91 * local35 + local31 * local106 >> 16;
		@Pc(148) int local148 = Static11.method522(local126 + this.z, local102 + this.x, Static7.y);
		@Pc(161) int local161 = Static11.method522(local116 + this.z, this.x + local136, Static7.y);
		@Pc(165) int local165 = local16 / 2;
		@Pc(169) int local169 = local19 / 2;
		@Pc(180) int local180 = local31 * local169 + local165 * local35 >> 16;
		@Pc(191) int local191 = local35 * local169 - local31 * local165 >> 16;
		@Pc(204) int local204 = Static11.method522(this.z + local191, local180 + this.x, Static7.y);
		@Pc(215) int local215 = local204 > local161 ? local161 : local204;
		@Pc(226) int local226 = local161 > local82 ? local82 : local161;
		@Pc(233) int local233 = local82 < local148 ? local82 : local148;
		@Pc(240) int local240 = local148 >= local204 ? local204 : local148;
		Static5.anInt3525 = (int) (Math.atan2((double) (local233 - local215), (double) local19) * 325.95D) & 0x7FF;
		if (Static5.anInt3525 != 0) {
			arg0.method3832(Static5.anInt3525);
		}
		Static6.anInt4907 = (int) (Math.atan2((double) (local226 - local240), (double) local16) * 325.95D) & 0x7FF;
		if (Static6.anInt4907 != 0) {
			arg0.method3817(Static6.anInt4907);
		}
		Static4.anInt2747 = local82 + local204;
		if (Static4.anInt2747 > local161 + local148) {
			Static4.anInt2747 = local148 + local161;
		}
		Static4.anInt2747 = (Static4.anInt2747 >> 1) - this.anInt4006;
		if (Static4.anInt2747 != 0) {
			arg0.method3823(0, Static4.anInt2747, 0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)Lclient!d;")
	public final BasType method3314() {
		@Pc(15) int local15 = this.method3303();
		return local15 == -1 ? Static5.aClass34_1 : BasTypeList.get(local15);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!vg;BLclient!vg;)V")
	protected final void method3315(@OriginalArg(0) Model arg0, @OriginalArg(2) Model arg1) {
		if (GlRenderer.enabled) {
			@Pc(67) GlModel local67 = (GlModel) arg0;
			@Pc(70) GlModel local70 = (GlModel) arg1;
			if ((this.aClass20_Sub3_6 == null || this.aClass20_Sub3_6.stopped) && (local67.particleEmitters != null || local67.particleEffectors != null || local70 != null && (local70.particleEmitters != null || local70.particleEffectors != null))) {
				this.aClass20_Sub3_6 = new ParticleSystem(client.loop, this.getSize(), this.getSize());
			}
			if (this.aClass20_Sub3_6 != null) {
				this.aClass20_Sub3_6.method2967(local67.particleEmitters, local67.particleEffectors, false, local67.anIntArray507, local67.anIntArray504, local67.anIntArray502);
			}
		} else {
			@Pc(4) SoftwareModel local4 = (SoftwareModel) arg1;
			@Pc(7) SoftwareModel local7 = (SoftwareModel) arg0;
			if ((this.aClass20_Sub3_6 == null || this.aClass20_Sub3_6.stopped) && (local7.particleEmitters != null || local7.particleEffectors != null || local4 != null && (local4.particleEmitters != null || local4.particleEffectors != null))) {
				this.aClass20_Sub3_6 = new ParticleSystem(client.loop, this.getSize(), this.getSize());
			}
			if (this.aClass20_Sub3_6 != null) {
				this.aClass20_Sub3_6.method2967(local7.particleEmitters, local7.particleEffectors, false, local7.anIntArray347, local7.anIntArray344, local7.anIntArray340);
			}
		}
		this.aBoolean285 = true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	public final void setSize(@OriginalArg(1) int size) {
		this.size = size;
	}
}

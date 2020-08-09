import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "Lclient!fo;")
	private Class61 aClass61_2;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	private int anInt5783 = 0;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!ic;")
	private final Class84 aClass84_27 = new Class84(16);

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	private int anInt5802 = 0;

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "Lclient!ll;")
	private final Class112 aClass112_29 = new Class112();

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!fm;")
	private final Class60 aClass60_4;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	private final int anInt5790;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "Z")
	private boolean aBoolean394;

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "Lclient!ll;")
	private Class112 aClass112_30;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private final int anInt5800;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "Z")
	private final boolean aBoolean396;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	private final int anInt5784;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!ja;")
	private final Class92 aClass92_3;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!fm;")
	private final Class60 aClass60_3;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!en;")
	private final Class51 aClass51_3;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Lclient!ng;")
	private Class4_Sub3_Sub1 aClass4_Sub3_Sub1_1;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(ILclient!fm;Lclient!fm;Lclient!en;Lclient!ja;IIZ)V")
	public Class62_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) Class92 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass60_4 = arg1;
		this.anInt5790 = arg0;
		if (this.aClass60_4 == null) {
			this.aBoolean394 = false;
		} else {
			this.aBoolean394 = true;
			this.aClass112_30 = new Class112();
		}
		this.anInt5800 = arg6;
		this.aBoolean396 = arg7;
		this.anInt5784 = arg5;
		this.aClass92_3 = arg4;
		this.aClass60_3 = arg2;
		this.aClass51_3 = arg3;
		if (this.aClass60_3 != null) {
			this.aClass4_Sub3_Sub1_1 = this.aClass92_3.method1973(this.aClass60_3, this.anInt5790);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	public final int method4660() {
		if (this.aClass61_2 == null) {
			return 0;
		} else if (this.aBoolean394) {
			@Pc(27) Node local27 = this.aClass112_30.method2610();
			return local27 == null ? 0 : (int) local27.key;
		} else {
			return this.aClass61_2.anInt1972;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Lclient!fo;")
	@Override
	public final Class61 method4659() {
		if (this.aClass61_2 != null) {
			return this.aClass61_2;
		}
		if (this.aClass4_Sub3_Sub1_1 == null) {
			if (this.aClass51_3.method1083()) {
				return null;
			}
			this.aClass4_Sub3_Sub1_1 = this.aClass51_3.method1088((byte) 0, 255, true, this.anInt5790);
		}
		if (this.aClass4_Sub3_Sub1_1.aBoolean364) {
			return null;
		}
		@Pc(53) byte[] local53 = this.aClass4_Sub3_Sub1_1.method4352();
		if (this.aClass4_Sub3_Sub1_1 instanceof Class4_Sub3_Sub1_Sub1) {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.aClass61_2 = new Class61(local53, this.anInt5784);
				if (this.anInt5800 != this.aClass61_2.anInt1971) {
					throw new RuntimeException();
				}
			} catch (@Pc(149) RuntimeException local149) {
				this.aClass61_2 = null;
				if (this.aClass51_3.method1083()) {
					this.aClass4_Sub3_Sub1_1 = null;
				} else {
					this.aClass4_Sub3_Sub1_1 = this.aClass51_3.method1088((byte) 0, 255, true, this.anInt5790);
				}
				return null;
			}
		} else {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.aClass61_2 = new Class61(local53, this.anInt5784);
			} catch (@Pc(74) RuntimeException local74) {
				this.aClass51_3.method1091();
				this.aClass61_2 = null;
				if (this.aClass51_3.method1083()) {
					this.aClass4_Sub3_Sub1_1 = null;
				} else {
					this.aClass4_Sub3_Sub1_1 = this.aClass51_3.method1088((byte) 0, 255, true, this.anInt5790);
				}
				return null;
			}
			if (this.aClass60_3 != null) {
				this.aClass92_3.method1968(this.aClass60_3, local53, this.anInt5790);
			}
		}
		if (this.aClass60_4 != null) {
			this.anInt5783 = 0;
			this.aByteArray72 = new byte[this.aClass61_2.anInt1979];
		}
		this.aClass4_Sub3_Sub1_1 = null;
		return this.aClass61_2;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I")
	public final int method4664() {
		if (this.method4659() == null) {
			return this.aClass4_Sub3_Sub1_1 == null ? 0 : this.aClass4_Sub3_Sub1_1.method4354();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	@Override
	public final void method4656(@OriginalArg(0) int arg0) {
		if (this.aClass60_4 == null) {
			return;
		}
		for (@Pc(22) Node local22 = this.aClass112_29.method2610(); local22 != null; local22 = this.aClass112_29.method2616()) {
			if ((long) arg0 == local22.key) {
				return;
			}
		}
		@Pc(48) Node local48 = new Node();
		local48.key = arg0;
		this.aClass112_29.method2612(local48);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	public final void method4666() {
		if (this.aClass112_30 == null || this.method4659() == null) {
			return;
		}
		for (@Pc(22) Node local22 = this.aClass112_29.method2610(); local22 != null; local22 = this.aClass112_29.method2616()) {
			@Pc(32) int local32 = (int) local22.key;
			if (local32 < 0 || this.aClass61_2.anInt1979 <= local32 || this.aClass61_2.anIntArray154[local32] == 0) {
				local22.unlink();
			} else {
				if (this.aByteArray72[local32] == 0) {
					this.method4672(local32, 1);
				}
				if (this.aByteArray72[local32] == -1) {
					this.method4672(local32, 2);
				}
				if (this.aByteArray72[local32] == 1) {
					local22.unlink();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)I")
	public final int method4667() {
		return this.anInt5783;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public final void method4668() {
		if (this.aClass60_4 != null) {
			this.aBoolean395 = true;
			if (this.aClass112_30 == null) {
				this.aClass112_30 = new Class112();
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)[B")
	@Override
	public final byte[] method4657(@OriginalArg(1) int arg0) {
		@Pc(9) Class4_Sub3_Sub1 local9 = this.method4672(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.method4352();
			local9.unlink();
			return local25;
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
	public final int method4671() {
		return this.aClass61_2 == null ? 0 : this.aClass61_2.anInt1972;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	@Override
	public final int method4655(@OriginalArg(0) int arg0) {
		@Pc(9) Class4_Sub3_Sub1 local9 = (Class4_Sub3_Sub1) this.aClass84_27.method1844((long) arg0);
		return local9 == null ? 0 : local9.method4354();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Lclient!ng;")
	private Class4_Sub3_Sub1 method4672(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub3_Sub1 local13 = (Class4_Sub3_Sub1) this.aClass84_27.method1844((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean363 && local13.aBoolean364) {
			local13.unlink();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass60_4 == null || this.aByteArray72[arg0] == -1) {
					if (this.aClass51_3.method1083()) {
						return null;
					}
					local13 = this.aClass51_3.method1088((byte) 2, this.anInt5790, true, arg0);
				} else {
					local13 = this.aClass92_3.method1973(this.aClass60_4, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass60_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass92_3.method1965(this.aClass60_4, arg0);
			} else if (arg1 == 2) {
				if (this.aClass60_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray72[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass51_3.method1095()) {
					return null;
				}
				local13 = this.aClass51_3.method1088((byte) 2, this.anInt5790, false, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass84_27.method1840(local13, (long) arg0);
		}
		if (local13.aBoolean364) {
			return null;
		}
		@Pc(169) byte[] local169 = local13.method4352();
		if (!(local13 instanceof Class4_Sub3_Sub1_Sub1)) {
			try {
				if (local169 == null || local169.length <= 2) {
					throw new RuntimeException();
				}
				Static7.aCRC32_1.reset();
				Static7.aCRC32_1.update(local169, 0, local169.length - 2);
				@Pc(197) int local197 = (int) Static7.aCRC32_1.getValue();
				if (this.aClass61_2.anIntArray153[arg0] != local197) {
					throw new RuntimeException();
				}
				this.aClass51_3.anInt1358 = 0;
				this.aClass51_3.anInt1359 = 0;
			} catch (@Pc(219) RuntimeException local219) {
				this.aClass51_3.method1091();
				local13.unlink();
				if (local13.aBoolean363 && !this.aClass51_3.method1083()) {
					@Pc(244) Class4_Sub3_Sub1_Sub2 local244 = this.aClass51_3.method1088((byte) 2, this.anInt5790, true, arg0);
					this.aClass84_27.method1840(local244, (long) arg0);
				}
				return null;
			}
			local169[local169.length - 2] = (byte) (this.aClass61_2.anIntArray157[arg0] >>> 8);
			local169[local169.length - 1] = (byte) this.aClass61_2.anIntArray157[arg0];
			if (this.aClass60_4 != null) {
				this.aClass92_3.method1968(this.aClass60_4, local169, arg0);
				if (this.aByteArray72[arg0] != 1) {
					this.anInt5783++;
					this.aByteArray72[arg0] = 1;
				}
			}
			if (!local13.aBoolean363) {
				local13.unlink();
			}
			return local13;
		}
		try {
			if (local169 == null || local169.length <= 2) {
				throw new RuntimeException();
			}
			Static7.aCRC32_1.reset();
			Static7.aCRC32_1.update(local169, 0, local169.length - 2);
			@Pc(346) int local346 = (int) Static7.aCRC32_1.getValue();
			if (local346 != this.aClass61_2.anIntArray153[arg0]) {
				throw new RuntimeException();
			}
			@Pc(378) int local378 = (local169[local169.length - 1] & 0xFF) + ((local169[local169.length - 2] & 0xFF) << 8);
			if ((this.aClass61_2.anIntArray157[arg0] & 0xFFFF) != local378) {
				throw new RuntimeException();
			}
			if (this.aByteArray72[arg0] != 1) {
				if (this.aByteArray72[arg0] != 0) {
				}
				this.anInt5783++;
				this.aByteArray72[arg0] = 1;
			}
			if (!local13.aBoolean363) {
				local13.unlink();
			}
			return local13;
		} catch (@Pc(428) Exception local428) {
			this.aByteArray72[arg0] = -1;
			local13.unlink();
			if (local13.aBoolean363 && !this.aClass51_3.method1083()) {
				@Pc(455) Class4_Sub3_Sub1_Sub2 local455 = this.aClass51_3.method1088((byte) 2, this.anInt5790, true, arg0);
				this.aClass84_27.method1840(local455, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public final void method4673() {
		if (this.aClass112_30 != null) {
			if (this.method4659() == null) {
				return;
			}
			if (this.aBoolean394) {
				@Pc(175) boolean local175 = true;
				for (@Pc(182) Node local182 = this.aClass112_30.method2610(); local182 != null; local182 = this.aClass112_30.method2616()) {
					@Pc(188) int local188 = (int) local182.key;
					if (this.aByteArray72[local188] == 0) {
						this.method4672(local188, 1);
					}
					if (this.aByteArray72[local188] == 0) {
						local175 = false;
					} else {
						local182.unlink();
					}
				}
				while (this.anInt5802 < this.aClass61_2.anIntArray154.length) {
					if (this.aClass61_2.anIntArray154[this.anInt5802] == 0) {
						this.anInt5802++;
					} else {
						if (this.aClass92_3.anInt2520 >= 250) {
							local175 = false;
							break;
						}
						if (this.aByteArray72[this.anInt5802] == 0) {
							this.method4672(this.anInt5802, 1);
						}
						if (this.aByteArray72[this.anInt5802] == 0) {
							local175 = false;
							@Pc(290) Node local290 = new Node();
							local290.key = this.anInt5802;
							this.aClass112_30.method2612(local290);
						}
						this.anInt5802++;
					}
				}
				if (local175) {
					this.aBoolean394 = false;
					this.anInt5802 = 0;
				}
			} else if (this.aBoolean395) {
				@Pc(31) boolean local31 = true;
				for (@Pc(36) Node local36 = this.aClass112_30.method2610(); local36 != null; local36 = this.aClass112_30.method2616()) {
					@Pc(42) int local42 = (int) local36.key;
					if (this.aByteArray72[local42] != 1) {
						this.method4672(local42, 2);
					}
					if (this.aByteArray72[local42] == 1) {
						local36.unlink();
					} else {
						local31 = false;
					}
				}
				while (this.aClass61_2.anIntArray154.length > this.anInt5802) {
					if (this.aClass61_2.anIntArray154[this.anInt5802] == 0) {
						this.anInt5802++;
					} else {
						if (this.aClass51_3.method1095()) {
							local31 = false;
							break;
						}
						if (this.aByteArray72[this.anInt5802] != 1) {
							this.method4672(this.anInt5802, 2);
						}
						if (this.aByteArray72[this.anInt5802] != 1) {
							local31 = false;
							@Pc(145) Node local145 = new Node();
							local145.key = this.anInt5802;
							this.aClass112_30.method2612(local145);
						}
						this.anInt5802++;
					}
				}
				if (local31) {
					this.aBoolean395 = false;
					this.anInt5802 = 0;
				}
			} else {
				this.aClass112_30 = null;
			}
		}
		if (!this.aBoolean396 || this.aLong199 > MonotonicClock.currentTimeMillis()) {
			return;
		}
		for (@Pc(335) Class4_Sub3_Sub1 local335 = (Class4_Sub3_Sub1) this.aClass84_27.method1842(); local335 != null; local335 = (Class4_Sub3_Sub1) this.aClass84_27.method1843()) {
			if (!local335.aBoolean364) {
				if (local335.aBoolean365) {
					if (!local335.aBoolean363) {
						throw new RuntimeException();
					}
					local335.unlink();
				} else {
					local335.aBoolean365 = true;
				}
			}
		}
		this.aLong199 = MonotonicClock.currentTimeMillis() + 1000L;
	}
}

import java.io.IOException;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class51 {

	@OriginalMember(owner = "client!en", name = "z", descriptor = "I")
	private int anInt1357;

	@OriginalMember(owner = "client!en", name = "B", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!en", name = "C", descriptor = "Lclient!eo;")
	private Class52 aClass52_2;

	@OriginalMember(owner = "client!en", name = "H", descriptor = "Lclient!ul;")
	private Class4_Sub3_Sub1_Sub2 aClass4_Sub3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!en", name = "t", descriptor = "Lclient!uk;")
	private final Class175 aClass175_5 = new Class175();

	@OriginalMember(owner = "client!en", name = "w", descriptor = "Lclient!uk;")
	private final Class175 aClass175_6 = new Class175();

	@OriginalMember(owner = "client!en", name = "x", descriptor = "Lclient!uk;")
	private final Class175 aClass175_7 = new Class175();

	@OriginalMember(owner = "client!en", name = "y", descriptor = "Lclient!uk;")
	private final Class175 aClass175_8 = new Class175();

	@OriginalMember(owner = "client!en", name = "A", descriptor = "Lclient!fd;")
	private final Buffer aClass4_Sub10_1 = new Buffer(4);

	@OriginalMember(owner = "client!en", name = "E", descriptor = "I")
	public volatile int anInt1358 = 0;

	@OriginalMember(owner = "client!en", name = "F", descriptor = "I")
	public volatile int anInt1359 = 0;

	@OriginalMember(owner = "client!en", name = "G", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!en", name = "D", descriptor = "Lclient!fd;")
	private final Buffer aClass4_Sub10_2 = new Buffer(8);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)I")
	private int method1080() {
		return this.aClass175_7.method4334() + this.aClass175_8.method4334();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public final void method1081() {
		if (this.aClass52_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub10_1.position = 0;
			this.aClass4_Sub10_1.writeByte(7);
			this.aClass4_Sub10_1.writeMedium(0);
			this.aClass52_2.method1107(this.aClass4_Sub10_1.bytes, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass52_2.method1103();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass52_2 = null;
			this.anInt1358++;
			this.anInt1359 = -2;
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)Z")
	public final boolean method1083() {
		return this.method1092() >= 20;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public final void method1086() {
		if (this.aClass52_2 != null) {
			this.aClass52_2.method1104();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!eo;Z)V")
	public final void method1087(@OriginalArg(1) Class52 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass52_2 != null) {
			try {
				this.aClass52_2.method1103();
			} catch (@Pc(15) Exception local15) {
			}
			this.aClass52_2 = null;
		}
		this.aClass52_2 = arg0;
		this.method1096();
		this.method1093(arg1);
		this.aClass4_Sub3_Sub1_Sub2_1 = null;
		this.aClass4_Sub10_2.position = 0;
		while (true) {
			@Pc(41) Class4_Sub3_Sub1_Sub2 local41 = (Class4_Sub3_Sub1_Sub2) this.aClass175_6.method4336();
			if (local41 == null) {
				while (true) {
					@Pc(64) Class4_Sub3_Sub1_Sub2 local64 = (Class4_Sub3_Sub1_Sub2) this.aClass175_8.method4336();
					if (local64 == null) {
						if (this.aByte2 != 0) {
							try {
								this.aClass4_Sub10_1.position = 0;
								this.aClass4_Sub10_1.writeByte(4);
								this.aClass4_Sub10_1.writeByte(this.aByte2);
								this.aClass4_Sub10_1.writeShort(0);
								this.aClass52_2.method1107(this.aClass4_Sub10_1.bytes, 4);
							} catch (@Pc(113) IOException local113) {
								try {
									this.aClass52_2.method1103();
								} catch (@Pc(119) Exception local119) {
								}
								this.aClass52_2 = null;
								this.anInt1358++;
								this.anInt1359 = -2;
							}
						}
						this.anInt1357 = 0;
						this.aLong54 = MonotonicClock.currentTimeMillis();
						return;
					}
					this.aClass175_7.method4333(local64);
				}
			}
			this.aClass175_5.method4333(local41);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BIZII)Lclient!ul;")
	public final Class4_Sub3_Sub1_Sub2 method1088(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 + (arg1 << 16));
		@Pc(20) Class4_Sub3_Sub1_Sub2 local20 = new Class4_Sub3_Sub1_Sub2();
		local20.aByte22 = arg0;
		local20.aBoolean363 = arg2;
		local20.aLong213 = local16;
		if (arg2) {
			if (this.method1092() >= 20) {
				throw new RuntimeException();
			}
			this.aClass175_5.method4333(local20);
		} else if (this.method1080() < 20) {
			this.aClass175_7.method4333(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
	public final void method1090() {
		if (this.aClass52_2 != null) {
			this.aClass52_2.method1103();
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
	public final void method1091() {
		try {
			this.aClass52_2.method1103();
		} catch (@Pc(9) Exception local9) {
		}
		this.aClass52_2 = null;
		this.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1359 = -1;
		this.anInt1358++;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I")
	public final int method1092() {
		return this.aClass175_5.method4334() + this.aClass175_6.method4334();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BZ)V")
	public final void method1093(@OriginalArg(1) boolean arg0) {
		if (this.aClass52_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub10_1.position = 0;
			this.aClass4_Sub10_1.writeByte(arg0 ? 2 : 3);
			this.aClass4_Sub10_1.writeMedium(0);
			this.aClass52_2.method1107(this.aClass4_Sub10_1.bytes, 4);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass52_2.method1103();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt1358++;
			this.aClass52_2 = null;
			this.anInt1359 = -2;
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)Z")
	public final boolean method1095() {
		return this.method1080() >= 20;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
	private void method1096() {
		if (this.aClass52_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub10_1.position = 0;
			this.aClass4_Sub10_1.writeByte(6);
			this.aClass4_Sub10_1.writeMedium(3);
			this.aClass52_2.method1107(this.aClass4_Sub10_1.bytes, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass52_2.method1103();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass52_2 = null;
			this.anInt1359 = -2;
			this.anInt1358++;
		}
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(I)Z")
	public final boolean method1097() {
		if (this.aClass52_2 != null) {
			@Pc(11) long local11 = MonotonicClock.currentTimeMillis();
			@Pc(18) int local18 = (int) (local11 - this.aLong54);
			this.aLong54 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt1357 += local18;
			if (this.anInt1357 > 30000) {
				try {
					this.aClass52_2.method1103();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass52_2 = null;
			}
		}
		if (this.aClass52_2 == null) {
			return this.method1092() == 0 && this.method1080() == 0;
		}
		try {
			this.aClass52_2.method1106();
			for (@Pc(87) Class4_Sub3_Sub1_Sub2 local87 = (Class4_Sub3_Sub1_Sub2) this.aClass175_5.method4332(); local87 != null; local87 = (Class4_Sub3_Sub1_Sub2) this.aClass175_5.method4340()) {
				this.aClass4_Sub10_1.position = 0;
				this.aClass4_Sub10_1.writeByte(1);
				this.aClass4_Sub10_1.writeMedium((int) local87.aLong213);
				this.aClass52_2.method1107(this.aClass4_Sub10_1.bytes, 4);
				this.aClass175_6.method4333(local87);
			}
			for (@Pc(146) Class4_Sub3_Sub1_Sub2 local146 = (Class4_Sub3_Sub1_Sub2) this.aClass175_7.method4332(); local146 != null; local146 = (Class4_Sub3_Sub1_Sub2) this.aClass175_7.method4340()) {
				this.aClass4_Sub10_1.position = 0;
				this.aClass4_Sub10_1.writeByte(0);
				this.aClass4_Sub10_1.writeMedium((int) local146.aLong213);
				this.aClass52_2.method1107(this.aClass4_Sub10_1.bytes, 4);
				this.aClass175_8.method4333(local146);
			}
			for (@Pc(188) int local188 = 0; local188 < 100; local188++) {
				@Pc(198) int local198 = this.aClass52_2.method1101();
				if (local198 < 0) {
					throw new IOException();
				}
				if (local198 == 0) {
					break;
				}
				@Pc(213) byte local213 = 0;
				if (this.aClass4_Sub3_Sub1_Sub2_1 == null) {
					local213 = 8;
				} else if (this.aClass4_Sub3_Sub1_Sub2_1.anInt5384 == 0) {
					local213 = 1;
				}
				this.anInt1357 = 0;
				if (local213 <= 0) {
					@Pc(242) int local242 = 512 - this.aClass4_Sub3_Sub1_Sub2_1.anInt5384;
					@Pc(253) int local253 = this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.bytes.length - this.aClass4_Sub3_Sub1_Sub2_1.aByte22;
					if (local253 - this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.position < local242) {
						local242 = local253 - this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.position;
					}
					if (local198 < local242) {
						local242 = local198;
					}
					this.aClass52_2.method1099(this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.position, this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.bytes, local242);
					if (this.aByte2 != 0) {
						for (@Pc(301) int local301 = 0; local301 < local242; local301++) {
							this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.bytes[local301 + this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.position] ^= this.aByte2;
						}
					}
					@Pc(336) Buffer local336 = this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10;
					local336.position += local242;
					@Pc(343) Class4_Sub3_Sub1_Sub2 local343 = this.aClass4_Sub3_Sub1_Sub2_1;
					local343.anInt5384 += local242;
					if (local253 == this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.position) {
						this.aClass4_Sub3_Sub1_Sub2_1.method4819();
						this.aClass4_Sub3_Sub1_Sub2_1.aBoolean364 = false;
						this.aClass4_Sub3_Sub1_Sub2_1 = null;
					} else if (this.aClass4_Sub3_Sub1_Sub2_1.anInt5384 == 512) {
						this.aClass4_Sub3_Sub1_Sub2_1.anInt5384 = 0;
					}
				} else {
					@Pc(391) int local391 = local213 - this.aClass4_Sub10_2.position;
					if (local391 > local198) {
						local391 = local198;
					}
					this.aClass52_2.method1099(this.aClass4_Sub10_2.position, this.aClass4_Sub10_2.bytes, local391);
					if (this.aByte2 != 0) {
						for (@Pc(416) int local416 = 0; local416 < local391; local416++) {
							this.aClass4_Sub10_2.bytes[this.aClass4_Sub10_2.position + local416] = (byte) (this.aClass4_Sub10_2.bytes[this.aClass4_Sub10_2.position + local416] ^ this.aByte2);
						}
					}
					@Pc(451) Buffer local451 = this.aClass4_Sub10_2;
					local451.position += local391;
					if (local213 <= this.aClass4_Sub10_2.position) {
						if (this.aClass4_Sub3_Sub1_Sub2_1 == null) {
							this.aClass4_Sub10_2.position = 0;
							@Pc(473) int local473 = this.aClass4_Sub10_2.readUnsignedByte();
							@Pc(478) int local478 = this.aClass4_Sub10_2.readUnsignedShort();
							@Pc(483) int local483 = this.aClass4_Sub10_2.readUnsignedByte();
							@Pc(487) int local487 = local483 & 0x7F;
							@Pc(498) boolean local498 = (local483 & 0x80) != 0;
							@Pc(503) int local503 = this.aClass4_Sub10_2.readInt();
							@Pc(510) long local510 = (long) (local478 + (local473 << 16));
							@Pc(520) Class4_Sub3_Sub1_Sub2 local520;
							if (local498) {
								for (local520 = (Class4_Sub3_Sub1_Sub2) this.aClass175_8.method4332(); local520 != null && local520.aLong213 != local510; local520 = (Class4_Sub3_Sub1_Sub2) this.aClass175_8.method4340()) {
								}
							} else {
								for (local520 = (Class4_Sub3_Sub1_Sub2) this.aClass175_6.method4332(); local520 != null && local510 != local520.aLong213; local520 = (Class4_Sub3_Sub1_Sub2) this.aClass175_6.method4340()) {
								}
							}
							if (local520 == null) {
								throw new IOException();
							}
							this.aClass4_Sub3_Sub1_Sub2_1 = local520;
							@Pc(581) int local581 = local487 == 0 ? 5 : 9;
							this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10 = new Buffer(this.aClass4_Sub3_Sub1_Sub2_1.aByte22 + local503 + local581);
							this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.writeByte(local487);
							this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.writeInt(local503);
							this.aClass4_Sub3_Sub1_Sub2_1.anInt5384 = 8;
							this.aClass4_Sub10_2.position = 0;
						} else if (this.aClass4_Sub3_Sub1_Sub2_1.anInt5384 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub10_2.bytes[0] == -1) {
							this.aClass4_Sub10_2.position = 0;
							this.aClass4_Sub3_Sub1_Sub2_1.anInt5384 = 1;
						} else {
							this.aClass4_Sub3_Sub1_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(657) IOException local657) {
			try {
				this.aClass52_2.method1103();
			} catch (@Pc(663) Exception local663) {
			}
			this.aClass52_2 = null;
			this.anInt1358++;
			this.anInt1359 = -2;
			return this.method1092() == 0 && this.method1080() == 0;
		}
	}
}

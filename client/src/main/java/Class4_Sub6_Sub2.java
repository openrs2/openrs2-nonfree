import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class4_Sub6_Sub2 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ld", name = "Hb", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!ld", name = "Ib", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!ld", name = "Jb", descriptor = "I")
	private int anInt3089;

	@OriginalMember(owner = "client!ld", name = "Kb", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!ld", name = "Lb", descriptor = "I")
	private int anInt3090;

	@OriginalMember(owner = "client!ld", name = "Nb", descriptor = "Lclient!tg;")
	private Class4_Sub31 aClass4_Sub31_1;

	@OriginalMember(owner = "client!ld", name = "Ob", descriptor = "I")
	private int anInt3091;

	@OriginalMember(owner = "client!ld", name = "Pb", descriptor = "Z")
	private boolean aBoolean213;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "[I")
	private final int[] anIntArray274 = new int[16];

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "[[Lclient!ej;")
	private final Class4_Sub9[][] aClass4_Sub9ArrayArray1 = new Class4_Sub9[16][128];

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "[I")
	private final int[] anIntArray277 = new int[16];

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "[I")
	private final int[] anIntArray278 = new int[16];

	@OriginalMember(owner = "client!ld", name = "kb", descriptor = "[I")
	private final int[] anIntArray286 = new int[16];

	@OriginalMember(owner = "client!ld", name = "gb", descriptor = "[I")
	private final int[] anIntArray283 = new int[16];

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "[I")
	public final int[] anIntArray279 = new int[16];

	@OriginalMember(owner = "client!ld", name = "hb", descriptor = "[I")
	private final int[] anIntArray284 = new int[16];

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "[I")
	public final int[] anIntArray275 = new int[16];

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "[I")
	private final int[] anIntArray280 = new int[16];

	@OriginalMember(owner = "client!ld", name = "lb", descriptor = "[I")
	private final int[] anIntArray287 = new int[16];

	@OriginalMember(owner = "client!ld", name = "db", descriptor = "[I")
	private final int[] anIntArray282 = new int[16];

	@OriginalMember(owner = "client!ld", name = "ib", descriptor = "[I")
	public final int[] anIntArray285 = new int[16];

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
	private int anInt3067 = 256;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "[I")
	private final int[] anIntArray276 = new int[16];

	@OriginalMember(owner = "client!ld", name = "yb", descriptor = "[I")
	private final int[] anIntArray289 = new int[16];

	@OriginalMember(owner = "client!ld", name = "Bb", descriptor = "I")
	private final int anInt3085 = 1000000;

	@OriginalMember(owner = "client!ld", name = "ab", descriptor = "[I")
	private final int[] anIntArray281 = new int[16];

	@OriginalMember(owner = "client!ld", name = "qb", descriptor = "[I")
	private final int[] anIntArray288 = new int[16];

	@OriginalMember(owner = "client!ld", name = "Fb", descriptor = "[[Lclient!ej;")
	private final Class4_Sub9[][] aClass4_Sub9ArrayArray2 = new Class4_Sub9[16][128];

	@OriginalMember(owner = "client!ld", name = "Gb", descriptor = "Lclient!go;")
	private final Class72 aClass72_1 = new Class72();

	@OriginalMember(owner = "client!ld", name = "Mb", descriptor = "Lclient!bn;")
	private final Class4_Sub6_Sub1 aClass4_Sub6_Sub1_1 = new Class4_Sub6_Sub1(this);

	@OriginalMember(owner = "client!ld", name = "ob", descriptor = "Lclient!ic;")
	private final HashTable aClass84_15 = new HashTable(128);

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub2() {
		this.method2478();
		this.method2499(true);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	private void method2475() {
		this.anIntArray283[9] = 128;
		this.anIntArray276[9] = 128;
		this.method2493(9, 128);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ej;I)I")
	private int method2476(@OriginalArg(0) Class4_Sub9 arg0) {
		if (this.anIntArray289[arg0.anInt1301] == 0) {
			return 0;
		}
		@Pc(30) int local30 = this.anIntArray280[arg0.anInt1301] * this.anIntArray287[arg0.anInt1301] + 4096 >> 13;
		local30 = local30 * local30 + 16384 >> 15;
		@Pc(41) Class157 local41 = arg0.aClass157_1;
		local30 = local30 * arg0.anInt1293 + 16384 >> 15;
		local30 = this.anInt3067 * local30 + 128 >> 8;
		@Pc(71) int local71 = local30 * this.anIntArray289[arg0.anInt1301] + 128 >> 8;
		if (local41.anInt4841 > 0) {
			local71 = (int) ((double) local71 * Math.pow(0.5D, (double) arg0.anInt1304 * 1.953125E-5D * (double) local41.anInt4841) + 0.5D);
		}
		if (local41.aByteArray65 != null) {
			@Pc(106) int local106 = local41.aByteArray65[arg0.anInt1299 + 1];
			@Pc(109) int local109 = arg0.anInt1289;
			if (arg0.anInt1299 < local41.aByteArray65.length - 2) {
				@Pc(131) int local131 = (local41.aByteArray65[arg0.anInt1299] & 0xFF) << 8;
				@Pc(143) int local143 = (local41.aByteArray65[arg0.anInt1299 + 2] & 0xFF) << 8;
				local106 += (local109 - local131) * (local41.aByteArray65[arg0.anInt1299 + 3] - local106) / (local143 - local131);
			}
			local71 = local106 * local71 + 32 >> 6;
		}
		if (arg0.anInt1288 > 0 && local41.aByteArray64 != null) {
			@Pc(188) int local188 = arg0.anInt1288;
			@Pc(196) int local196 = local41.aByteArray64[arg0.anInt1300 + 1];
			if (arg0.anInt1300 < local41.aByteArray64.length - 2) {
				@Pc(218) int local218 = (local41.aByteArray64[arg0.anInt1300] & 0xFF) << 8;
				@Pc(230) int local230 = (local41.aByteArray64[arg0.anInt1300 + 2] & 0xFF) << 8;
				local196 += (local41.aByteArray64[arg0.anInt1300 + 3] - local196) * (local188 - local218) / (local230 - local218);
			}
			local71 = local196 * local71 + 32 >> 6;
		}
		return local71;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V")
	private void method2477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(III)V")
	private synchronized void method2478() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray289[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	public final synchronized void method2479(@OriginalArg(1) int arg0) {
		this.anInt3067 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Lclient!ej;I)I")
	private int method2480(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(12) int local12 = this.anIntArray282[arg0.anInt1301];
		return local12 >= 8192 ? 16384 - ((16384 - local12) * (128 - arg0.anInt1291) + 32 >> 6) : local12 * arg0.anInt1291 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(BI)V")
	private void method2481(@OriginalArg(1) int arg0) {
		if ((this.anIntArray285[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class4_Sub9 local19 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.head(); local19 != null; local19 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.next()) {
			if (local19.anInt1301 == arg0) {
				local19.anInt1294 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)V")
	private void method2482(@OriginalArg(0) int arg0) {
		if ((this.anIntArray285[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(26) Class4_Sub9 local26 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.head(); local26 != null; local26 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.next()) {
			if (arg0 == local26.anInt1301 && this.aClass4_Sub9ArrayArray2[arg0][local26.anInt1296] == null && local26.anInt1288 < 0) {
				local26.anInt1288 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZILclient!tg;Z)V")
	private synchronized void method2483(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub31 arg1, @OriginalArg(3) boolean arg2) {
		this.method2510(arg2);
		this.aClass72_1.method1661(arg1.aByteArray67);
		this.aLong110 = 0L;
		this.aBoolean212 = arg0;
		@Pc(24) int local24 = this.aClass72_1.method1668();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass72_1.method1663(local26);
			this.aClass72_1.method1659(local26);
			this.aClass72_1.method1670(local26);
		}
		this.anInt3089 = this.aClass72_1.method1666();
		this.anInt3090 = this.aClass72_1.anIntArray173[this.anInt3089];
		this.aLong111 = this.aClass72_1.method1657(this.anInt3090);
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V")
	public final synchronized void method2484() {
		for (@Pc(7) Class4_Sub23 local7 = (Class4_Sub23) this.aClass84_15.head(); local7 != null; local7 = (Class4_Sub23) this.aClass84_15.next()) {
			local7.unlink();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	@Override
	public final synchronized void method3345(@OriginalArg(0) int arg0) {
		if (this.aClass72_1.method1664()) {
			@Pc(18) int local18 = this.aClass72_1.anInt2129 * this.anInt3085 / Static7.anInt5394;
			do {
				@Pc(27) long local27 = this.aLong110 + (long) arg0 * (long) local18;
				if (this.aLong111 - local27 >= 0L) {
					this.aLong110 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong111 + (long) local18 - this.aLong110 - 1L) / (long) local18);
				this.aLong110 += (long) local58 * (long) local18;
				arg0 -= local58;
				this.aClass4_Sub6_Sub1_1.method3345(local58);
				this.method2498();
			} while (this.aClass72_1.method1664());
		}
		this.aClass4_Sub6_Sub1_1.method3345(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZII)V")
	private void method2485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2486(64, arg2, arg1);
		if ((this.anIntArray285[arg1] & 0x2) != 0) {
			for (@Pc(26) Class4_Sub9 local26 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.tail(); local26 != null; local26 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.prev()) {
				if (local26.anInt1301 == arg1 && local26.anInt1288 < 0) {
					this.aClass4_Sub9ArrayArray2[arg1][local26.anInt1296] = null;
					this.aClass4_Sub9ArrayArray2[arg1][arg2] = local26;
					@Pc(66) int local66 = (local26.anInt1297 * local26.anInt1285 >> 12) + local26.anInt1290;
					local26.anInt1297 = 4096;
					local26.anInt1290 += arg2 - local26.anInt1296 << 8;
					local26.anInt1285 = local66 - local26.anInt1290;
					local26.anInt1296 = arg2;
					return;
				}
			}
		}
		@Pc(112) Class4_Sub23 local112 = (Class4_Sub23) this.aClass84_15.get((long) this.anIntArray284[arg1]);
		if (local112 == null) {
			return;
		}
		@Pc(121) Class4_Sub8_Sub1 local121 = local112.aClass4_Sub8_Sub1Array1[arg2];
		if (local121 == null) {
			return;
		}
		@Pc(130) Class4_Sub9 local130 = new Class4_Sub9();
		local130.aClass4_Sub8_Sub1_1 = local121;
		local130.aClass4_Sub23_1 = local112;
		local130.anInt1301 = arg1;
		local130.aClass157_1 = local112.aClass157Array1[arg2];
		local130.anInt1283 = local112.aByteArray56[arg2];
		local130.anInt1296 = arg2;
		local130.anInt1293 = local112.aByteArray58[arg2] * arg0 * arg0 * local112.anInt4326 + 1024 >> 11;
		local130.anInt1291 = local112.aByteArray57[arg2] & 0xFF;
		local130.anInt1290 = (arg2 << 8) - (local112.aShortArray80[arg2] & 0x7FFF);
		local130.anInt1299 = 0;
		local130.anInt1300 = 0;
		local130.anInt1289 = 0;
		local130.anInt1288 = -1;
		local130.anInt1304 = 0;
		if (this.anIntArray279[arg1] == 0) {
			local130.aClass4_Sub6_Sub4_1 = Static28.method3384(local121, this.method2503(local130), this.method2476(local130), this.method2480(local130));
		} else {
			local130.aClass4_Sub6_Sub4_1 = Static28.method3384(local121, this.method2503(local130), 0, this.method2480(local130));
			this.method2502(local130, local112.aShortArray80[arg2] < 0);
		}
		if (local112.aShortArray80[arg2] < 0) {
			local130.aClass4_Sub6_Sub4_1.method3359(-1);
		}
		if (local130.anInt1283 >= 0) {
			@Pc(286) Class4_Sub9 local286 = this.aClass4_Sub9ArrayArray1[arg1][local130.anInt1283];
			if (local286 != null && local286.anInt1288 < 0) {
				this.aClass4_Sub9ArrayArray2[arg1][local286.anInt1296] = null;
				local286.anInt1288 = 0;
			}
			this.aClass4_Sub9ArrayArray1[arg1][local130.anInt1283] = local130;
		}
		this.aClass4_Sub6_Sub1_1.aClass112_3.addTail(local130);
		this.aClass4_Sub9ArrayArray2[arg1][arg2] = local130;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	private void method2486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub9 local12 = this.aClass4_Sub9ArrayArray2[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass4_Sub9ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray285[arg2] & 0x2) == 0) {
			local12.anInt1288 = 0;
			return;
		}
		for (@Pc(47) Class4_Sub9 local47 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.head(); local47 != null; local47 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.next()) {
			if (local47.anInt1301 == local12.anInt1301 && local47.anInt1288 < 0 && local12 != local47) {
				local12.anInt1288 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(III)V")
	private void method2487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray274[arg1] = arg0;
		this.anIntArray275[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)I")
	public final int method2488() {
		return this.anInt3067;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(BI)V")
	private void method2489(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class4_Sub9 local12 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.head(); local12 != null; local12 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.next()) {
			if (arg0 < 0 || arg0 == local12.anInt1301) {
				if (local12.aClass4_Sub6_Sub4_1 != null) {
					local12.aClass4_Sub6_Sub4_1.method3360(Static7.anInt5394 / 100);
					if (local12.aClass4_Sub6_Sub4_1.method3372()) {
						this.aClass4_Sub6_Sub1_1.aClass4_Sub6_Sub3_1.method2674(local12.aClass4_Sub6_Sub4_1);
					}
					local12.method1057();
				}
				if (local12.anInt1288 < 0) {
					this.aClass4_Sub9ArrayArray2[local12.anInt1301][local12.anInt1296] = null;
				}
				local12.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIII)V")
	private void method2490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ej;)Z")
	public final boolean method2491(@OriginalArg(1) Class4_Sub9 arg0) {
		if (arg0.aClass4_Sub6_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt1288 >= 0) {
			arg0.unlink();
			if (arg0.anInt1283 > 0 && arg0 == this.aClass4_Sub9ArrayArray1[arg0.anInt1301][arg0.anInt1283]) {
				this.aClass4_Sub9ArrayArray1[arg0.anInt1301][arg0.anInt1283] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
	private void method2492(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		if (local9 == 128) {
			@Pc(21) int local21 = arg0 >> 8 & 0x7F;
			@Pc(27) int local27 = arg0 >> 16 & 0x7F;
			@Pc(31) int local31 = arg0 & 0xF;
			this.method2486(local27, local21, local31);
		} else if (local9 == 144) {
			@Pc(49) int local49 = arg0 >> 16 & 0x7F;
			@Pc(55) int local55 = arg0 >> 8 & 0x7F;
			@Pc(59) int local59 = arg0 & 0xF;
			if (local49 > 0) {
				this.method2485(local49, local59, local55);
			} else {
				this.method2486(64, local55, local59);
			}
		} else if (local9 == 160) {
			@Pc(89) int local89 = arg0 & 0xF;
			@Pc(95) int local95 = arg0 >> 8 & 0x7F;
			@Pc(101) int local101 = arg0 >> 16 & 0x7F;
			this.method2490(local101, local89, local95);
		} else if (local9 == 176) {
			@Pc(125) int local125 = arg0 >> 8 & 0x7F;
			@Pc(129) int local129 = arg0 & 0xF;
			@Pc(135) int local135 = arg0 >> 16 & 0x7F;
			if (local125 == 0) {
				this.anIntArray276[local129] = (this.anIntArray276[local129] & 0xFFE03FFF) + (local135 << 14);
			}
			if (local125 == 32) {
				this.anIntArray276[local129] = (local135 << 7) + (this.anIntArray276[local129] & 0xFFFFC07F);
			}
			if (local125 == 1) {
				this.anIntArray281[local129] = (local135 << 7) + (this.anIntArray281[local129] & 0xFFFFC07F);
			}
			if (local125 == 33) {
				this.anIntArray281[local129] = (this.anIntArray281[local129] & 0xFFFFFF80) + local135;
			}
			if (local125 == 5) {
				this.anIntArray277[local129] = (local135 << 7) + (this.anIntArray277[local129] & 0xFFFFC07F);
			}
			if (local125 == 37) {
				this.anIntArray277[local129] = local135 + (this.anIntArray277[local129] & 0xFFFFFF80);
			}
			if (local125 == 7) {
				this.anIntArray287[local129] = (this.anIntArray287[local129] & 0xFFFFC07F) + (local135 << 7);
			}
			if (local125 == 39) {
				this.anIntArray287[local129] = local135 + (this.anIntArray287[local129] & 0xFFFFFF80);
			}
			if (local125 == 10) {
				this.anIntArray282[local129] = (this.anIntArray282[local129] & 0xFFFFC07F) + (local135 << 7);
			}
			if (local125 == 42) {
				this.anIntArray282[local129] = (this.anIntArray282[local129] & 0xFFFFFF80) + local135;
			}
			if (local125 == 11) {
				this.anIntArray280[local129] = (local135 << 7) + (this.anIntArray280[local129] & 0xFFFFC07F);
			}
			if (local125 == 43) {
				this.anIntArray280[local129] = (this.anIntArray280[local129] & 0xFFFFFF80) + local135;
			}
			if (local125 == 64) {
				if (local135 < 64) {
					this.anIntArray285[local129] &= -2;
				} else {
					this.anIntArray285[local129] |= 1;
				}
			}
			if (local125 == 65) {
				if (local135 < 64) {
					this.method2482(local129);
					this.anIntArray285[local129] &= -3;
				} else {
					this.anIntArray285[local129] |= 2;
				}
			}
			if (local125 == 99) {
				this.anIntArray286[local129] = (this.anIntArray286[local129] & 0x7F) + (local135 << 7);
			}
			if (local125 == 98) {
				this.anIntArray286[local129] = (this.anIntArray286[local129] & 0x3F80) + local135;
			}
			if (local125 == 101) {
				this.anIntArray286[local129] = (local135 << 7) + (this.anIntArray286[local129] & 0x7F) + 16384;
			}
			if (local125 == 100) {
				this.anIntArray286[local129] = (this.anIntArray286[local129] & 0x3F80) + local135 + 16384;
			}
			if (local125 == 120) {
				this.method2489(local129);
			}
			if (local125 == 121) {
				this.method2500(local129);
			}
			if (local125 == 123) {
				this.method2495(local129);
			}
			if (local125 == 6) {
				@Pc(524) int local524 = this.anIntArray286[local129];
				if (local524 == 16384) {
					this.anIntArray278[local129] = (local135 << 7) + (this.anIntArray278[local129] & 0xFFFFC07F);
				}
			}
			if (local125 == 38) {
				@Pc(553) int local553 = this.anIntArray286[local129];
				if (local553 == 16384) {
					this.anIntArray278[local129] = (this.anIntArray278[local129] & 0xFFFFFF80) + local135;
				}
			}
			if (local125 == 16) {
				this.anIntArray279[local129] = (this.anIntArray279[local129] & 0xFFFFC07F) + (local135 << 7);
			}
			if (local125 == 48) {
				this.anIntArray279[local129] = local135 + (this.anIntArray279[local129] & 0xFFFFFF80);
			}
			if (local125 == 81) {
				if (local135 < 64) {
					this.method2481(local129);
					this.anIntArray285[local129] &= -5;
				} else {
					this.anIntArray285[local129] |= 4;
				}
			}
			if (local125 == 17) {
				this.method2487((local135 << 7) + (this.anIntArray274[local129] & 0xFFFFC07F), local129);
			}
			if (local125 == 49) {
				this.method2487((this.anIntArray274[local129] & 0xFFFFFF80) + local135, local129);
			}
		} else if (local9 == 192) {
			@Pc(684) int local684 = arg0 & 0xF;
			@Pc(690) int local690 = arg0 >> 8 & 0x7F;
			this.method2493(local684, local690 + this.anIntArray276[local684]);
		} else if (local9 == 208) {
			@Pc(708) int local708 = arg0 & 0xF;
			@Pc(714) int local714 = arg0 >> 8 & 0x7F;
			this.method2477(local708, local714);
		} else if (local9 == 224) {
			@Pc(736) int local736 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			@Pc(740) int local740 = arg0 & 0xF;
			this.method2496(local736, local740);
		} else {
			@Pc(750) int local750 = arg0 & 0xFF;
			if (local750 == 255) {
				this.method2499(true);
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(III)V")
	private void method2493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray284[arg0] != arg1) {
			this.anIntArray284[arg0] = arg1;
			for (@Pc(29) int local29 = 0; local29 < 128; local29++) {
				this.aClass4_Sub9ArrayArray1[arg0][local29] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)V")
	private void method2495(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class4_Sub9 local8 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.head(); local8 != null; local8 = (Class4_Sub9) this.aClass4_Sub6_Sub1_1.aClass112_3.next()) {
			if ((arg0 < 0 || local8.anInt1301 == arg0) && local8.anInt1288 < 0) {
				this.aClass4_Sub9ArrayArray2[local8.anInt1301][local8.anInt1296] = null;
				local8.anInt1288 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBI)V")
	private void method2496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray288[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)Z")
	public final synchronized boolean method2497() {
		return this.aClass72_1.method1664();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([III)V")
	@Override
	public final synchronized void method3348(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass72_1.method1664()) {
			@Pc(18) int local18 = this.anInt3085 * this.aClass72_1.anInt2129 / Static7.anInt5394;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong110;
				if (this.aLong111 - local27 >= 0L) {
					this.aLong110 = local27;
					break;
				}
				@Pc(59) int local59 = (int) (((long) local18 + this.aLong111 - this.aLong110 - 1L) / (long) local18);
				arg2 -= local59;
				this.aLong110 += (long) local18 * (long) local59;
				this.aClass4_Sub6_Sub1_1.method3348(arg0, arg1, local59);
				arg1 += local59;
				this.method2498();
			} while (this.aClass72_1.method1664());
		}
		this.aClass4_Sub6_Sub1_1.method3348(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()I")
	@Override
	public final synchronized int method3346() {
		return 0;
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(B)V")
	private void method2498() {
		@Pc(8) int local8 = this.anInt3089;
		@Pc(11) int local11 = this.anInt3090;
		@Pc(14) long local14 = this.aLong111;
		if (this.aClass4_Sub31_1 != null && this.anInt3091 == local11) {
			this.method2483(this.aBoolean212, this.aClass4_Sub31_1, this.aBoolean213);
			this.method2498();
			return;
		}
		while (local11 == this.anInt3090) {
			while (local11 == this.aClass72_1.anIntArray173[local8]) {
				this.aClass72_1.method1663(local8);
				@Pc(71) int local71 = this.aClass72_1.method1671(local8);
				if (local71 == 1) {
					this.aClass72_1.method1660();
					this.aClass72_1.method1670(local8);
					if (this.aClass72_1.method1665()) {
						if (this.aClass4_Sub31_1 != null) {
							this.method2504(this.aBoolean212, this.aClass4_Sub31_1);
							this.method2498();
							return;
						}
						if (!this.aBoolean212 || local11 == 0) {
							this.method2499(true);
							this.aClass72_1.method1658();
							return;
						}
						this.aClass72_1.method1662(local14);
					}
					break;
				}
				if ((local71 & 0x80) != 0) {
					this.method2492(local71);
				}
				this.aClass72_1.method1659(local8);
				this.aClass72_1.method1670(local8);
			}
			local8 = this.aClass72_1.method1666();
			local11 = this.aClass72_1.anIntArray173[local8];
			local14 = this.aClass72_1.method1657(local11);
		}
		this.aLong111 = local14;
		this.anInt3090 = local11;
		this.anInt3089 = local8;
		if (this.aClass4_Sub31_1 != null && this.anInt3091 < local11) {
			this.anInt3089 = -1;
			this.anInt3090 = this.anInt3091;
			this.aLong111 = this.aClass72_1.method1657(this.anInt3090);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IZ)V")
	private void method2499(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method2489(-1);
		} else {
			this.method2495(-1);
		}
		this.method2500(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray284[local23] = this.anIntArray283[local23];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray276[local39] = this.anIntArray283[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "()Lclient!tf;")
	@Override
	public final synchronized Class4_Sub6 method3349() {
		return null;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IB)V")
	private void method2500(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
				this.method2500(local18);
			}
			return;
		}
		this.anIntArray287[arg0] = 12800;
		this.anIntArray282[arg0] = 8192;
		this.anIntArray280[arg0] = 16383;
		this.anIntArray288[arg0] = 8192;
		this.anIntArray281[arg0] = 0;
		this.anIntArray277[arg0] = 8192;
		this.method2482(arg0);
		this.method2481(arg0);
		this.anIntArray285[arg0] = 0;
		this.anIntArray286[arg0] = 32767;
		this.anIntArray278[arg0] = 256;
		this.anIntArray279[arg0] = 0;
		this.method2487(8192, arg0);
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public final synchronized void method2501() {
		this.method2510(true);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ej;BZ)V")
	public final void method2502(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass4_Sub8_Sub1_1.aByteArray52.length;
		@Pc(35) int local35;
		if (arg1 && arg0.aClass4_Sub8_Sub1_1.aBoolean288) {
			@Pc(22) int local22 = local8 + local8 - arg0.aClass4_Sub8_Sub1_1.anInt4084;
			local35 = (int) ((long) local22 * (long) this.anIntArray279[arg0.anInt1301] >> 6);
			@Pc(39) int local39 = local8 << 8;
			if (local39 <= local35) {
				arg0.aClass4_Sub6_Sub4_1.method3364();
				local35 = local39 + local39 - local35 - 1;
			}
		} else {
			local35 = (int) ((long) local8 * (long) this.anIntArray279[arg0.anInt1301] >> 6);
		}
		arg0.aClass4_Sub6_Sub4_1.method3369(local35);
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public final synchronized Class4_Sub6 method3350() {
		return this.aClass4_Sub6_Sub1_1;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(ILclient!ej;)I")
	private int method2503(@OriginalArg(1) Class4_Sub9 arg0) {
		@Pc(10) int local10 = arg0.anInt1290 + (arg0.anInt1297 * arg0.anInt1285 >> 12);
		@Pc(13) Class157 local13 = arg0.aClass157_1;
		@Pc(31) int local31 = local10 + (this.anIntArray278[arg0.anInt1301] * (this.anIntArray288[arg0.anInt1301] - 8192) >> 12);
		if (local13.anInt4847 > 0 && (local13.anInt4840 > 0 || this.anIntArray281[arg0.anInt1301] > 0)) {
			@Pc(57) int local57 = local13.anInt4840 << 2;
			@Pc(62) int local62 = local13.anInt4845 << 1;
			if (arg0.anInt1287 < local62) {
				local57 = local57 * arg0.anInt1287 / local62;
			}
			@Pc(88) int local88 = local57 + (this.anIntArray281[arg0.anInt1301] >> 7);
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt1284 & 0x1FF) * 0.01227184630308513D);
			local31 += (int) (local97 * (double) local88);
		}
		@Pc(132) int local132 = (int) ((double) (arg0.aClass4_Sub8_Sub1_1.anInt4085 * 256) * Math.pow(2.0D, (double) local31 * 3.255208333333333E-4D) / (double) Static7.anInt5394 + 0.5D);
		return local132 < 1 ? 1 : local132;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLclient!tg;B)V")
	public final synchronized void method2504(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub31 arg1) {
		this.method2483(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IBI)V")
	public final synchronized void method2505() {
		this.method2475();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ej;III[I)Z")
	public final boolean method2506(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		arg0.anInt1303 = Static7.anInt5394 / 100;
		if (arg0.anInt1288 >= 0 && (arg0.aClass4_Sub6_Sub4_1 == null || arg0.aClass4_Sub6_Sub4_1.method3365())) {
			arg0.method1057();
			arg0.unlink();
			if (arg0.anInt1283 > 0 && this.aClass4_Sub9ArrayArray1[arg0.anInt1301][arg0.anInt1283] == arg0) {
				this.aClass4_Sub9ArrayArray1[arg0.anInt1301][arg0.anInt1283] = null;
			}
			return true;
		}
		@Pc(58) int local58 = arg0.anInt1297;
		@Pc(60) boolean local60 = false;
		if (local58 > 0) {
			@Pc(89) int local89 = local58 - (int) (Math.pow(2.0D, (double) this.anIntArray277[arg0.anInt1301] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local89 < 0) {
				local89 = 0;
			}
			arg0.anInt1297 = local89;
		}
		arg0.aClass4_Sub6_Sub4_1.method3353(this.method2503(arg0));
		@Pc(126) double local126 = (double) ((arg0.anInt1296 - 60 << 8) + (arg0.anInt1285 * arg0.anInt1297 >> 12)) * 5.086263020833333E-6D;
		@Pc(129) Class157 local129 = arg0.aClass157_1;
		arg0.anInt1287++;
		arg0.anInt1284 += local129.anInt4847;
		if (local129.anInt4841 > 0) {
			if (local129.anInt4839 > 0) {
				arg0.anInt1304 += (int) (Math.pow(2.0D, (double) local129.anInt4839 * local126) * 128.0D + 0.5D);
			} else {
				arg0.anInt1304 += 128;
			}
			if (local129.anInt4841 * arg0.anInt1304 >= 819200) {
				local60 = true;
			}
		}
		if (local129.aByteArray65 != null) {
			if (local129.anInt4842 > 0) {
				arg0.anInt1289 += (int) (Math.pow(2.0D, (double) local129.anInt4842 * local126) * 128.0D + 0.5D);
			} else {
				arg0.anInt1289 += 128;
			}
			while (local129.aByteArray65.length - 2 > arg0.anInt1299 && (local129.aByteArray65[arg0.anInt1299 + 2] & 0xFF) << 8 < arg0.anInt1289) {
				arg0.anInt1299 += 2;
			}
			if (local129.aByteArray65.length - 2 == arg0.anInt1299 && local129.aByteArray65[arg0.anInt1299 + 1] == 0) {
				local60 = true;
			}
		}
		if (arg0.anInt1288 >= 0 && local129.aByteArray64 != null && (this.anIntArray285[arg0.anInt1301] & 0x1) == 0 && (arg0.anInt1283 < 0 || this.aClass4_Sub9ArrayArray1[arg0.anInt1301][arg0.anInt1283] != arg0)) {
			if (local129.anInt4848 <= 0) {
				arg0.anInt1288 += 128;
			} else {
				arg0.anInt1288 += (int) (Math.pow(2.0D, local126 * (double) local129.anInt4848) * 128.0D + 0.5D);
			}
			while (local129.aByteArray64.length - 2 > arg0.anInt1300 && arg0.anInt1288 > (local129.aByteArray64[arg0.anInt1300 + 2] & 0xFF) << 8) {
				arg0.anInt1300 += 2;
			}
			if (local129.aByteArray64.length - 2 == arg0.anInt1300) {
				local60 = true;
			}
		}
		if (!local60) {
			arg0.aClass4_Sub6_Sub4_1.method3352(arg0.anInt1303, this.method2476(arg0), this.method2480(arg0));
			return false;
		}
		arg0.aClass4_Sub6_Sub4_1.method3360(arg0.anInt1303);
		if (arg3 == null) {
			arg0.aClass4_Sub6_Sub4_1.method3345(arg2);
		} else {
			arg0.aClass4_Sub6_Sub4_1.method3348(arg3, arg1, arg2);
		}
		if (arg0.aClass4_Sub6_Sub4_1.method3372()) {
			this.aClass4_Sub6_Sub1_1.aClass4_Sub6_Sub3_1.method2674(arg0.aClass4_Sub6_Sub4_1);
		}
		arg0.method1057();
		if (arg0.anInt1288 >= 0) {
			arg0.unlink();
			if (arg0.anInt1283 > 0 && this.aClass4_Sub9ArrayArray1[arg0.anInt1301][arg0.anInt1283] == arg0) {
				this.aClass4_Sub9ArrayArray1[arg0.anInt1301][arg0.anInt1283] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "(B)V")
	public final synchronized void method2509() {
		for (@Pc(19) Class4_Sub23 local19 = (Class4_Sub23) this.aClass84_15.head(); local19 != null; local19 = (Class4_Sub23) this.aClass84_15.next()) {
			local19.method3570();
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(IZ)V")
	private synchronized void method2510(@OriginalArg(1) boolean arg0) {
		this.aClass72_1.method1658();
		this.aClass4_Sub31_1 = null;
		this.method2499(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!tg;Lclient!fh;Lclient!jk;)Z")
	public final synchronized boolean method2511(@OriginalArg(2) Class4_Sub31 arg0, @OriginalArg(3) Js5 arg1, @OriginalArg(4) Class98 arg2) {
		arg0.method4163();
		@Pc(9) boolean local9 = true;
		@Pc(24) int[] local24 = new int[] { 22050 };
		for (@Pc(36) Class4_Sub14 local36 = (Class4_Sub14) arg0.aClass84_23.head(); local36 != null; local36 = (Class4_Sub14) arg0.aClass84_23.next()) {
			@Pc(43) int local43 = (int) local36.key;
			@Pc(53) Class4_Sub23 local53 = (Class4_Sub23) this.aClass84_15.get((long) local43);
			if (local53 == null) {
				local53 = Static13.method887(local43, arg1);
				if (local53 == null) {
					local9 = false;
					continue;
				}
				this.aClass84_15.put((long) local43, local53);
			}
			if (!local53.method3566(local24, arg2, local36.aByteArray18)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method4164();
		}
		return local9;
	}
}

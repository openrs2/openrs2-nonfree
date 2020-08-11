import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class20_Sub2_Sub1 extends Class20_Sub2 {

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
	private int anInt3232;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "Z")
	public boolean aBoolean228 = false;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "Lclient!bi;")
	public Class20_Sub1 aClass20_Sub1_1;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
	public int anInt3228;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	public int anInt3229;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	public int anInt3230;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	public int anInt3231;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
	private int anInt3233;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!bi;IIIIIIIII)V")
	public Class20_Sub2_Sub1(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass20_Sub1_1 = arg0;
		this.anInt3228 = arg1 << Static4.anInt3227;
		this.anInt3229 = arg2 << Static4.anInt3227;
		this.anInt3230 = arg3 << Static4.anInt3227;
		this.anInt3231 = arg9;
		this.aShort22 = this.aShort20 = (short) arg8;
		this.aShort19 = (short) arg4;
		this.aShort23 = (short) arg5;
		this.aShort24 = (short) arg6;
		this.anInt3233 = arg7;
		this.method2631();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(JI)V")
	public final void method2629(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_Sub1_1 == null) {
			return;
		}
		this.aShort20 = (short) (this.aShort20 - arg1);
		if (this.aShort20 <= 0) {
			this.method2630();
			return;
		}
		@Pc(21) int local21 = this.anInt3228 >> Static4.anInt3227;
		@Pc(26) int local26 = this.anInt3229 >> Static4.anInt3227;
		@Pc(31) int local31 = this.anInt3230 >> Static4.anInt3227;
		@Pc(35) Class20_Sub3 local35 = this.aClass20_Sub1_1.aClass20_Sub3_1;
		@Pc(39) Class89 local39 = this.aClass20_Sub1_1.aClass89_1;
		if (local39.anInt2408 != 0) {
			if (this.aShort22 - this.aShort20 <= local39.anInt2414) {
				@Pc(69) int local69 = (this.anInt3231 >> 8 & 0xFF00) + (this.anInt3232 >> 16 & 0xFF) + local39.anInt2407 * arg1;
				@Pc(86) int local86 = (this.anInt3231 & 0xFF00) + (this.anInt3232 >> 8 & 0xFF) + local39.anInt2409 * arg1;
				@Pc(103) int local103 = ((this.anInt3231 & 0xFF) << 8) + (this.anInt3232 & 0xFF) + local39.anInt2421 * arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 65535) {
					local69 = 65535;
				}
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 > 65535) {
					local86 = 65535;
				}
				if (local103 < 0) {
					local103 = 0;
				} else if (local103 > 65535) {
					local103 = 65535;
				}
				this.anInt3231 &= -16777216;
				this.anInt3231 |= ((local69 & 0xFF00) << 8) + (local86 & 0xFF00) + (local103 >> 8 & 0xFF);
				this.anInt3232 &= -16777216;
				this.anInt3232 |= ((local69 & 0xFF) << 16) + ((local86 & 0xFF) << 8) + (local103 & 0xFF);
			}
			if (this.aShort22 - this.aShort20 <= local39.anInt2410) {
				@Pc(212) int local212 = (this.anInt3231 >> 16 & 0xFF00) + (this.anInt3232 >> 24 & 0xFF) + local39.anInt2398 * arg1;
				if (local212 < 0) {
					local212 = 0;
				} else if (local212 > 65535) {
					local212 = 65535;
				}
				this.anInt3231 &= 16777215;
				this.anInt3231 |= (local212 & 0xFF00) << 16;
				this.anInt3232 &= 16777215;
				this.anInt3232 |= (local212 & 0xFF) << 24;
			}
		}
		if (local39.anInt2412 != -1 && this.aShort22 - this.aShort20 <= local39.anInt2427) {
			this.anInt3233 += local39.anInt2444 * arg1;
		}
		@Pc(278) int local278 = this.aShort19;
		@Pc(281) int local281 = this.aShort23;
		@Pc(284) int local284 = this.aShort24;
		@Pc(286) boolean local286 = false;
		if (local39.anInt2395 == 1) {
			@Pc(296) int local296 = local21 - this.aClass20_Sub1_1.anInt309;
			@Pc(302) int local302 = local26 - this.aClass20_Sub1_1.anInt312;
			@Pc(308) int local308 = local31 - this.aClass20_Sub1_1.anInt316;
			@Pc(323) int local323 = (int) Math.sqrt((double) (local296 * local296 + local302 * local302 + local308 * local308));
			@Pc(331) long local331 = (long) (local39.anInt2419 * local323 * arg1);
			this.anInt3233 = (int) ((long) this.anInt3233 - ((long) this.anInt3233 * local331 >> 18));
		} else if (local39.anInt2395 == 2) {
			@Pc(356) int local356 = local21 - this.aClass20_Sub1_1.anInt309;
			@Pc(362) int local362 = local26 - this.aClass20_Sub1_1.anInt312;
			@Pc(368) int local368 = local31 - this.aClass20_Sub1_1.anInt316;
			@Pc(380) int local380 = local356 * local356 + local362 * local362 + local368 * local368;
			@Pc(388) long local388 = (long) (local39.anInt2419 * local380 * arg1);
			this.anInt3233 = (int) ((long) this.anInt3233 - ((long) this.anInt3233 * local388 >> 28));
		}
		@Pc(406) Node local406 = local35.aClass112_24.sentinel;
		for (@Pc(409) Node local409 = local406.next; local409 != local406; local409 = local409.next) {
			@Pc(415) Class4_Sub3_Sub24 local415 = (Class4_Sub3_Sub24) local409;
			@Pc(419) Class37 local419 = local415.aClass167_1.aClass37_1;
			if (local419.anInt907 != 1) {
				@Pc(429) int local429 = local21 - local415.anInt6095;
				@Pc(434) int local434 = local26 - local415.anInt6089;
				@Pc(439) int local439 = local31 - local415.anInt6087;
				@Pc(452) long local452 = (long) (local429 * local429 + local434 * local434 + local439 * local439);
				if (local452 <= local419.aLong39) {
					@Pc(463) int local463 = (int) Math.sqrt((double) local452);
					if (local463 == 0) {
						local463 = 1;
					}
					@Pc(491) long local491 = (long) (local429 * local415.anInt6091 + local434 * local419.anInt903 + local439 * local415.anInt6088) * 65535L / (long) (local419.anInt904 * local463);
					if (local491 >= (long) local419.anInt906) {
						@Pc(500) int local500 = 0;
						if (local419.anInt895 == 1) {
							local500 = (local463 >> 4) * local419.anInt911;
						} else if (local419.anInt895 == 2) {
							local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt911;
						}
						if (local419.anInt905 != 0) {
							@Pc(606) int local606 = (local429 << 15) / local463 * local419.anInt904;
							@Pc(615) int local615 = (local434 << 15) / local463 * local419.anInt904;
							@Pc(624) int local624 = (local439 << 15) / local463 * local419.anInt904;
							if (local419.anInt908 == 0) {
								local278 += local606 * arg1 >> 15;
								local281 += local615 * arg1 >> 15;
								local284 += local624 * arg1 >> 15;
								local286 = true;
							} else {
								this.anInt3228 += local606 * arg1 >> 15;
								this.anInt3229 += local615 * arg1 >> 15;
								this.anInt3230 += local624 * arg1 >> 15;
							}
						} else if (local419.anInt908 == 0) {
							local278 += (local415.anInt6091 - local500) * arg1;
							local281 += (local419.anInt903 - local500) * arg1;
							local284 += (local415.anInt6088 - local500) * arg1;
							local286 = true;
						} else {
							this.anInt3228 += (local415.anInt6091 - local500) * arg1;
							this.anInt3229 += (local419.anInt903 - local500) * arg1;
							this.anInt3230 += (local415.anInt6088 - local500) * arg1;
						}
					}
				}
			}
		}
		if (local39.anIntArray216 != null) {
			for (@Pc(693) int local693 = 0; local693 < local39.anIntArray216.length; local693++) {
				@Pc(708) Class4_Sub3_Sub24 local708 = (Class4_Sub3_Sub24) Static5.aClass10_1.get((long) local39.anIntArray216[local693]);
				while (local708 != null) {
					@Pc(714) Class37 local714 = local708.aClass167_1.aClass37_1;
					@Pc(719) int local719 = local21 - local708.anInt6095;
					@Pc(724) int local724 = local26 - local708.anInt6089;
					@Pc(729) int local729 = local31 - local708.anInt6087;
					@Pc(742) long local742 = (long) (local719 * local719 + local724 * local724 + local729 * local729);
					if (local742 > local714.aLong39) {
						local708 = (Class4_Sub3_Sub24) Static5.aClass10_1.nextWithKey();
					} else {
						@Pc(758) int local758 = (int) Math.sqrt((double) local742);
						if (local758 == 0) {
							local758 = 1;
						}
						@Pc(786) long local786 = (long) (local719 * local708.anInt6091 + local724 * local714.anInt903 + local729 * local708.anInt6088) * 65535L / (long) (local714.anInt904 * local758);
						if (local786 < (long) local714.anInt906) {
							local708 = (Class4_Sub3_Sub24) Static5.aClass10_1.nextWithKey();
						} else {
							@Pc(800) int local800 = 0;
							if (local714.anInt895 == 1) {
								local800 = (local758 >> 4) * local714.anInt911;
							} else if (local714.anInt895 == 2) {
								local800 = (local758 >> 4) * (local758 >> 4) * local714.anInt911;
							}
							if (local714.anInt905 != 0) {
								@Pc(906) int local906 = (local719 << 15) / local758 * local714.anInt904;
								@Pc(915) int local915 = (local724 << 15) / local758 * local714.anInt904;
								@Pc(924) int local924 = (local729 << 15) / local758 * local714.anInt904;
								if (local714.anInt908 == 0) {
									local278 += local906 * arg1 >> 15;
									local281 += local915 * arg1 >> 15;
									local284 += local924 * arg1 >> 15;
									local286 = true;
								} else {
									this.anInt3228 += local906 * arg1 >> 15;
									this.anInt3229 += local915 * arg1 >> 15;
									this.anInt3230 += local924 * arg1 >> 15;
								}
							} else if (local714.anInt908 == 0) {
								local278 += (local708.anInt6091 - local800) * arg1;
								local281 += (local714.anInt903 - local800) * arg1;
								local284 += (local708.anInt6088 - local800) * arg1;
								local286 = true;
							} else {
								this.anInt3228 += (local708.anInt6091 - local800) * arg1;
								this.anInt3229 += (local714.anInt903 - local800) * arg1;
								this.anInt3230 += (local708.anInt6088 - local800) * arg1;
							}
							local708 = (Class4_Sub3_Sub24) Static5.aClass10_1.nextWithKey();
						}
					}
				}
			}
		}
		if (local39.anIntArray213 != null) {
			if (local39.anIntArray214 == null) {
				local39.anIntArray214 = new int[local39.anIntArray213.length];
				for (@Pc(1006) int local1006 = 0; local1006 < local39.anIntArray213.length; local1006++) {
					Static33.method4201(local39.anIntArray213[local1006]);
					local39.anIntArray214[local1006] = ((IntNode) Static5.aClass84_16.get((long) local39.anIntArray213[local1006])).value;
				}
			}
			for (@Pc(1036) int local1036 = 0; local1036 < local39.anIntArray214.length; local1036++) {
				@Pc(1048) Class37 local1048 = Static6.aClass37Array1[local39.anIntArray214[local1036]];
				if (local1048.anInt908 == 0) {
					local278 += local1048.anInt898 * arg1;
					local281 += local1048.anInt903 * arg1;
					local284 += local1048.anInt892 * arg1;
					local286 = true;
				} else {
					this.anInt3228 += local1048.anInt898 * arg1;
					this.anInt3229 += local1048.anInt903 * arg1;
					this.anInt3230 += local1048.anInt892 * arg1;
				}
			}
		}
		if (local286) {
			while (true) {
				if (local278 <= 32767 && local281 <= 32767 && local284 <= 32767 && local278 >= -32767 && local281 >= -32767 && local284 >= -32767) {
					this.aShort19 = (short) local278;
					this.aShort23 = (short) local281;
					this.aShort24 = (short) local284;
					break;
				}
				local278 >>= 1;
				local281 >>= 1;
				local284 >>= 1;
				this.anInt3233 <<= 1;
			}
		}
		this.anInt3228 = (int) ((long) this.anInt3228 + ((long) this.aShort19 * (long) this.anInt3233 >> 23) * (long) arg1);
		this.anInt3229 = (int) ((long) this.anInt3229 + ((long) this.aShort23 * (long) this.anInt3233 >> 23) * (long) arg1);
		this.anInt3230 = (int) ((long) this.anInt3230 + ((long) this.aShort24 * (long) this.anInt3233 >> 23) * (long) arg1);
		@Pc(1217) int local1217 = this.anInt3228 >> 19;
		@Pc(1222) int local1222 = this.anInt3230 >> 19;
		@Pc(1227) int local1227 = this.anInt3229 >> Static4.anInt3227;
		if (local1227 > 0 || local1227 < -65535 || local1217 < 0 || local1217 >= Static7.anInt5632 || local1222 < 0 || local1222 >= Static7.anInt5590) {
			this.method2630();
			return;
		}
		@Pc(1247) int[][][] local1247 = Static6.anIntArrayArrayArray13;
		@Pc(1256) int local1256 = local1247[local35.anInt3514][local1217][local1222];
		@Pc(1271) int local1271;
		if (local35.anInt3514 < 3) {
			local1271 = local1247[local35.anInt3514 + 1][local1217][local1222];
		} else {
			local1271 = local1247[local35.anInt3514][local1217][local1222] - 1024;
		}
		if (local39.aBoolean168) {
			if (local39.anInt2405 == -1 && local1227 > local1256) {
				this.method2630();
				return;
			}
			if (local39.anInt2405 >= 0 && local1227 > local1247[local39.anInt2405][local1217][local1222]) {
				this.method2630();
				return;
			}
			if (local39.anInt2438 == -1 && local1227 < local1271) {
				this.method2630();
				return;
			}
			if (local39.anInt2438 >= 0 && local1227 < local1247[local39.anInt2438 + 1][local1217][local1222]) {
				this.method2630();
				return;
			}
		}
		if (local1217 >= local35.anInt3513 && local1217 <= local35.anInt3521 && local1222 >= local35.anInt3508 && local1222 <= local35.anInt3515 && local1227 <= local35.anInt3510 && local1227 >= local35.anInt3520) {
			this.aBoolean228 = false;
			return;
		}
		this.aBoolean228 = true;
		@Pc(1369) byte local1369 = 3;
		if (local1227 > local1247[1][local1217][local1222]) {
			local1369 = 0;
		} else if (local1227 > local1247[2][local1217][local1222]) {
			local1369 = 1;
		} else if (local1227 > local1247[3][local1217][local1222]) {
			local1369 = 2;
		} else if (local1227 < local1247[3][local1217][local1222] - 1024) {
			this.method2630();
			return;
		}
		@Pc(1427) Class4_Sub19 local1427 = Static1.aClass4_Sub19ArrayArrayArray1[local1369][local1217][local1222];
		if (local1427 == null) {
			local1427 = Static1.aClass4_Sub19ArrayArrayArray1[local1369][local1217][local1222] = new Class4_Sub19(local1369, local1217, local1222);
		}
		if (local1427.aClass108_1 == null) {
			local1427.aClass108_1 = new Class108();
			local1427.aByte14 = (byte) (arg0 & 0xFFL);
		} else if (local1427.aByte14 != (byte) (arg0 & 0xFFL)) {
			local1427.aClass108_1.method2457();
			local1427.aByte14 = (byte) (arg0 & 0xFFL);
		}
		local1427.aClass108_1.method2460(this);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
	private void method2630() {
		this.aClass20_Sub1_1.aClass20_Sub3_1.aClass20_Sub2_Sub1Array2[this.aShort21] = null;
		Static5.aClass20_Sub2_Sub1Array1[Static5.anInt3502] = this;
		Static5.anInt3502 = Static5.anInt3502 + 1 & 0x3FF;
		this.aClass20_Sub1_1 = null;
		this.method2944();
		this.method2628();
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "()V")
	private void method2631() {
		@Pc(4) int local4 = this.aClass20_Sub1_1.aClass20_Sub3_1.anInt3499;
		if (this.aClass20_Sub1_1.aClass20_Sub3_1.aClass20_Sub2_Sub1Array2[local4] != null) {
			this.aClass20_Sub1_1.aClass20_Sub3_1.aClass20_Sub2_Sub1Array2[local4].method2630();
		}
		this.aClass20_Sub1_1.aClass20_Sub3_1.aClass20_Sub2_Sub1Array2[local4] = this;
		this.aShort21 = (short) this.aClass20_Sub1_1.aClass20_Sub3_1.anInt3499;
		this.aClass20_Sub1_1.aClass20_Sub3_1.anInt3499 = local4 + 1 & 0x1FFF;
		this.aClass20_Sub1_1.aClass172_1.method4322(this);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!bi;IIIIIIIII)V")
	public final void method2632(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass20_Sub1_1 = arg0;
		this.anInt3228 = arg1 << Static4.anInt3227;
		this.anInt3229 = arg2 << Static4.anInt3227;
		this.anInt3230 = arg3 << Static4.anInt3227;
		this.anInt3231 = arg9;
		this.aShort22 = this.aShort20 = (short) arg8;
		this.aShort19 = (short) arg4;
		this.aShort23 = (short) arg5;
		this.aShort24 = (short) arg6;
		this.anInt3233 = arg7;
		this.method2631();
	}
}

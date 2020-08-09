import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class4_Sub1_Sub12 extends Class4_Sub1 {

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!jj", name = "db", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "[B")
	private byte[] aByteArray19 = new byte[512];

	@OriginalMember(owner = "client!jj", name = "hb", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
	public int anInt2620 = 1638;

	@OriginalMember(owner = "client!jj", name = "gb", descriptor = "I")
	public int anInt2625 = 4;

	@OriginalMember(owner = "client!jj", name = "kb", descriptor = "I")
	public int anInt2628 = 4;

	@OriginalMember(owner = "client!jj", name = "ab", descriptor = "I")
	public int anInt2621 = 0;

	@OriginalMember(owner = "client!jj", name = "nb", descriptor = "I")
	public int anInt2631 = 4;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(B)V")
	private void method2049() {
		if (this.anInt2620 > 0) {
			this.aShortArray38 = new short[this.anInt2628];
			this.aShortArray37 = new short[this.anInt2628];
			for (@Pc(64) int local64 = 0; local64 < this.anInt2628; local64++) {
				this.aShortArray37[local64] = (short) (Math.pow((double) ((float) this.anInt2620 / 4096.0F), (double) local64) * 4096.0D);
				this.aShortArray38[local64] = (short) Math.pow(2.0D, (double) local64);
			}
		} else if (this.aShortArray37 != null && this.aShortArray37.length == this.anInt2628) {
			this.aShortArray38 = new short[this.anInt2628];
			for (@Pc(29) int local29 = 0; local29 < this.anInt2628; local29++) {
				this.aShortArray38[local29] = (short) Math.pow(2.0D, (double) local29);
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void method4687(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean181 = arg0.readUnsignedByte() == 1;
		} else if (arg1 == 1) {
			this.anInt2628 = arg0.readUnsignedByte();
		} else if (arg1 == 2) {
			this.anInt2620 = arg0.readShort();
			if (this.anInt2620 < 0) {
				this.aShortArray37 = new short[this.anInt2628];
				for (@Pc(81) int local81 = 0; local81 < this.anInt2628; local81++) {
					this.aShortArray37[local81] = (short) arg0.readShort();
				}
			}
		} else if (arg1 == 3) {
			this.anInt2631 = this.anInt2625 = arg0.readUnsignedByte();
		} else if (arg1 == 4) {
			this.anInt2621 = arg0.readUnsignedByte();
		} else if (arg1 == 5) {
			this.anInt2631 = arg0.readUnsignedByte();
		} else if (arg1 == 6) {
			this.anInt2625 = arg0.readUnsignedByte();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIII)I")
	private int method2051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg5 - 4096;
		@Pc(13) int local13 = arg0 >> 12;
		arg0 &= 4095;
		@Pc(21) int local21 = local13 + 1;
		local13 &= 255;
		if (local21 >= arg4) {
			local21 = 0;
		}
		@Pc(35) int local35 = arg0 - 4096;
		@Pc(39) int local39 = local21 & 0xFF;
		@Pc(48) int local48 = this.aByteArray19[arg3 + local13] & 0x3;
		@Pc(65) int local65;
		if (local48 <= 1) {
			local65 = local48 == 0 ? arg5 + arg0 : arg5 - arg0;
		} else {
			local65 = local48 == 2 ? arg0 - arg5 : -arg5 - arg0;
		}
		@Pc(92) int local92 = this.aByteArray19[arg3 + local39] & 0x3;
		@Pc(96) int local96 = Class35.anIntArray61[arg0];
		@Pc(115) int local115;
		if (local92 > 1) {
			local115 = local92 == 2 ? local35 - arg5 : -local35 - arg5;
		} else {
			local115 = local92 == 0 ? arg5 + local35 : arg5 - local35;
		}
		@Pc(138) int local138 = this.aByteArray19[local13 + arg1] & 0x3;
		@Pc(150) int local150 = local65 + (local96 * (local115 - local65) >> 12);
		@Pc(166) int local166;
		if (local138 > 1) {
			local166 = local138 == 2 ? arg0 - local5 : -arg0 - local5;
		} else {
			local166 = local138 == 0 ? local5 + arg0 : local5 - arg0;
		}
		@Pc(189) int local189 = this.aByteArray19[arg1 + local39] & 0x3;
		@Pc(206) int local206;
		if (local189 <= 1) {
			local206 = local189 == 0 ? local5 + local35 : local5 - local35;
		} else {
			local206 = local189 == 2 ? local35 - local5 : -local5 - local35;
		}
		@Pc(234) int local234 = local166 + ((local206 - local166) * local96 >> 12);
		return local150 + ((local234 - local150) * arg2 >> 12);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			this.method2053(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([III)V")
	public final void method2053(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = this.anInt2625 * Static6.anIntArray478[arg1];
		if (this.anInt2628 == 1) {
			@Pc(31) short local31 = this.aShortArray37[0];
			@Pc(38) int local38 = this.aShortArray38[0] << 12;
			@Pc(45) int local45 = local38 * this.anInt2631 >> 12;
			@Pc(52) int local52 = this.anInt2625 * local38 >> 12;
			@Pc(58) int local58 = local38 * local20 >> 12;
			@Pc(62) int local62 = local58 >> 12;
			local58 &= 4095;
			@Pc(75) int local75 = this.aByteArray19[local62 & 0xFF] & 0xFF;
			@Pc(79) int local79 = Class35.anIntArray61[local58];
			@Pc(83) int local83 = local62 + 1;
			if (local52 <= local83) {
				local83 = 0;
			}
			@Pc(101) int local101 = this.aByteArray19[local83 & 0xFF] & 0xFF;
			if (this.aBoolean181) {
				for (@Pc(147) int local147 = 0; local147 < Static2.anInt1626; local147++) {
					@Pc(157) int local157 = Static4.anIntArray231[local147] * this.anInt2631;
					@Pc(171) int local171 = this.method2051(local38 * local157 >> 12, local101, local79, local75, local45, local58);
					local171 = local171 * local31 >> 12;
					arg0[local147] = (local171 >> 1) + 2048;
				}
			} else {
				for (@Pc(106) int local106 = 0; local106 < Static2.anInt1626; local106++) {
					@Pc(120) int local120 = Static4.anIntArray231[local106] * this.anInt2631;
					@Pc(134) int local134 = this.method2051(local38 * local120 >> 12, local101, local79, local75, local45, local58);
					arg0[local106] = local31 * local134 >> 12;
				}
			}
			return;
		}
		@Pc(194) short local194 = this.aShortArray37[0];
		if (local194 > 8 || local194 < -8) {
			@Pc(211) int local211 = this.aShortArray38[0] << 12;
			@Pc(217) int local217 = local211 * local20 >> 12;
			@Pc(221) int local221 = local217 >> 12;
			@Pc(228) int local228 = this.anInt2631 * local211 >> 12;
			@Pc(235) int local235 = local211 * this.anInt2625 >> 12;
			local217 &= 4095;
			@Pc(248) int local248 = this.aByteArray19[local221 & 0xFF] & 0xFF;
			@Pc(252) int local252 = Class35.anIntArray61[local217];
			@Pc(256) int local256 = local221 + 1;
			if (local256 >= local235) {
				local256 = 0;
			}
			@Pc(275) int local275 = this.aByteArray19[local256 & 0xFF] & 0xFF;
			for (@Pc(277) int local277 = 0; local277 < Static2.anInt1626; local277++) {
				@Pc(287) int local287 = this.anInt2631 * Static4.anIntArray231[local277];
				@Pc(301) int local301 = this.method2051(local211 * local287 >> 12, local275, local252, local248, local228, local217);
				arg0[local277] = local194 * local301 >> 12;
			}
		}
		for (@Pc(314) int local314 = 1; local314 < this.anInt2628; local314++) {
			@Pc(323) short local323 = this.aShortArray37[local314];
			if (local323 > 8 || local323 < -8) {
				@Pc(336) int local336 = this.aShortArray38[local314] << 12;
				@Pc(343) int local343 = local336 * this.anInt2631 >> 12;
				@Pc(349) int local349 = local20 * local336 >> 12;
				@Pc(356) int local356 = this.anInt2625 * local336 >> 12;
				@Pc(360) int local360 = local349 >> 12;
				@Pc(364) int local364 = local360 + 1;
				local349 &= 4095;
				@Pc(377) int local377 = this.aByteArray19[local360 & 0xFF] & 0xFF;
				if (local364 >= local356) {
					local364 = 0;
				}
				@Pc(392) int local392 = this.aByteArray19[local364 & 0xFF] & 0xFF;
				@Pc(396) int local396 = Class35.anIntArray61[local349];
				if (this.aBoolean181 && local314 == this.anInt2628 - 1) {
					for (@Pc(447) int local447 = 0; local447 < Static2.anInt1626; local447++) {
						@Pc(461) int local461 = Static4.anIntArray231[local447] * this.anInt2631;
						@Pc(475) int local475 = this.method2051(local461 * local336 >> 12, local392, local396, local377, local343, local349);
						local475 = arg0[local447] + (local323 * local475 >> 12);
						arg0[local447] = (local475 >> 1) + 2048;
					}
				} else {
					for (@Pc(407) int local407 = 0; local407 < Static2.anInt1626; local407++) {
						@Pc(417) int local417 = Static4.anIntArray231[local407] * this.anInt2631;
						@Pc(431) int local431 = this.method2051(local336 * local417 >> 12, local392, local396, local377, local343, local349);
						arg0[local407] += local323 * local431 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V")
	@Override
	public final void method4700() {
		this.aByteArray19 = Static28.method3321(this.anInt2621);
		this.method2049();
		for (@Pc(19) int local19 = this.anInt2628 - 1; local19 >= 1; local19--) {
			@Pc(35) short local35 = this.aShortArray37[local19];
			if (local35 > 8 || local35 < -8) {
				break;
			}
			this.anInt2628--;
		}
	}
}

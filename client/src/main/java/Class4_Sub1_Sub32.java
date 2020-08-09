import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class4_Sub1_Sub32 extends Class4_Sub1 {

	@OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
	private int anInt4898 = 6;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub32() {
		super(2, false);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void method4687(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4898 = arg0.readUnsignedByte();
		} else if (arg1 == 1) {
			this.aBoolean397 = arg0.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(22) int[] local22 = this.method4699(arg0, 0);
			@Pc(28) int[] local28 = this.method4699(arg0, 1);
			@Pc(31) int local31 = this.anInt4898;
			if (local31 == 1) {
				for (@Pc(93) int local93 = 0; local93 < Static2.anInt1626; local93++) {
					local11[local93] = local28[local93] + local22[local93];
				}
			} else if (local31 == 2) {
				for (@Pc(117) int local117 = 0; local117 < Static2.anInt1626; local117++) {
					local11[local117] = local22[local117] - local28[local117];
				}
			} else if (local31 == 3) {
				for (@Pc(138) int local138 = 0; local138 < Static2.anInt1626; local138++) {
					local11[local138] = local22[local138] * local28[local138] >> 12;
				}
			} else if (local31 == 4) {
				for (@Pc(164) int local164 = 0; local164 < Static2.anInt1626; local164++) {
					@Pc(171) int local171 = local28[local164];
					local11[local164] = local171 == 0 ? 4096 : (local22[local164] << 12) / local171;
				}
			} else if (local31 == 5) {
				for (@Pc(192) int local192 = 0; local192 < Static2.anInt1626; local192++) {
					local11[local192] = 4096 - ((4096 - local22[local192]) * (4096 - local28[local192]) >> 12);
				}
			} else if (local31 == 6) {
				for (@Pc(227) int local227 = 0; local227 < Static2.anInt1626; local227++) {
					@Pc(234) int local234 = local28[local227];
					local11[local227] = local234 >= 2048 ? 4096 - ((4096 - local234) * (4096 - local22[local227]) >> 11) : local234 * local22[local227] >> 11;
				}
			} else if (local31 == 7) {
				for (@Pc(271) int local271 = 0; local271 < Static2.anInt1626; local271++) {
					@Pc(278) int local278 = local22[local271];
					local11[local271] = local278 == 4096 ? 4096 : (local28[local271] << 12) / (4096 - local278);
				}
			} else if (local31 == 8) {
				for (@Pc(303) int local303 = 0; local303 < Static2.anInt1626; local303++) {
					@Pc(310) int local310 = local22[local303];
					local11[local303] = local310 == 0 ? 0 : 4096 - (4096 - local28[local303] << 12) / local310;
				}
			} else if (local31 == 9) {
				for (@Pc(338) int local338 = 0; local338 < Static2.anInt1626; local338++) {
					@Pc(349) int local349 = local22[local338];
					@Pc(353) int local353 = local28[local338];
					local11[local338] = local349 < local353 ? local349 : local353;
				}
			} else if (local31 == 10) {
				for (@Pc(373) int local373 = 0; local373 < Static2.anInt1626; local373++) {
					@Pc(380) int local380 = local22[local373];
					@Pc(384) int local384 = local28[local373];
					local11[local373] = local380 <= local384 ? local384 : local380;
				}
			} else if (local31 == 11) {
				for (@Pc(404) int local404 = 0; local404 < Static2.anInt1626; local404++) {
					@Pc(411) int local411 = local28[local404];
					@Pc(415) int local415 = local22[local404];
					local11[local404] = local411 < local415 ? local415 - local411 : local411 - local415;
				}
			} else if (local31 == 12) {
				for (@Pc(441) int local441 = 0; local441 < Static2.anInt1626; local441++) {
					@Pc(452) int local452 = local22[local441];
					@Pc(456) int local456 = local28[local441];
					local11[local441] = local452 + local456 - (local456 * local452 >> 11);
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4695(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass114_41.method2696(arg0);
		if (this.aClass114_41.aBoolean230) {
			@Pc(29) int[][] local29 = this.method4686(0, arg0);
			@Pc(35) int[][] local35 = this.method4686(1, arg0);
			@Pc(39) int[] local39 = local18[0];
			@Pc(43) int[] local43 = local18[1];
			@Pc(47) int[] local47 = local29[0];
			@Pc(51) int[] local51 = local18[2];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local35[2];
			@Pc(63) int[] local63 = local29[2];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[0];
			@Pc(74) int local74 = this.anInt4898;
			if (local74 == 1) {
				for (@Pc(131) int local131 = 0; local131 < Static2.anInt1626; local131++) {
					local39[local131] = local47[local131] + local71[local131];
					local43[local131] = local55[local131] + local67[local131];
					local51[local131] = local63[local131] + local59[local131];
				}
			} else if (local74 == 2) {
				for (@Pc(176) int local176 = 0; local176 < Static2.anInt1626; local176++) {
					local39[local176] = local47[local176] - local71[local176];
					local43[local176] = local55[local176] - local67[local176];
					local51[local176] = local63[local176] - local59[local176];
				}
			} else if (local74 == 3) {
				for (@Pc(218) int local218 = 0; local218 < Static2.anInt1626; local218++) {
					local39[local218] = local47[local218] * local71[local218] >> 12;
					local43[local218] = local67[local218] * local55[local218] >> 12;
					local51[local218] = local59[local218] * local63[local218] >> 12;
				}
			} else if (local74 == 4) {
				for (@Pc(268) int local268 = 0; local268 < Static2.anInt1626; local268++) {
					@Pc(275) int local275 = local67[local268];
					@Pc(279) int local279 = local71[local268];
					@Pc(283) int local283 = local59[local268];
					local39[local268] = local279 == 0 ? 4096 : (local47[local268] << 12) / local279;
					local43[local268] = local275 == 0 ? 4096 : (local55[local268] << 12) / local275;
					local51[local268] = local283 == 0 ? 4096 : (local63[local268] << 12) / local283;
				}
			} else if (local74 == 5) {
				for (@Pc(339) int local339 = 0; local339 < Static2.anInt1626; local339++) {
					local39[local339] = 4096 - ((4096 - local47[local339]) * (4096 - local71[local339]) >> 12);
					local43[local339] = 4096 - ((4096 - local55[local339]) * (4096 - local67[local339]) >> 12);
					local51[local339] = 4096 - ((4096 - local63[local339]) * (4096 - local59[local339]) >> 12);
				}
			} else if (local74 == 6) {
				for (@Pc(413) int local413 = 0; local413 < Static2.anInt1626; local413++) {
					@Pc(420) int local420 = local67[local413];
					@Pc(424) int local424 = local71[local413];
					@Pc(428) int local428 = local59[local413];
					local39[local413] = local424 >= 2048 ? 4096 - ((4096 - local47[local413]) * (4096 - local424) >> 11) : local424 * local47[local413] >> 11;
					local43[local413] = local420 >= 2048 ? 4096 - ((4096 - local55[local413]) * (4096 - local420) >> 11) : local55[local413] * local420 >> 11;
					local51[local413] = local428 >= 2048 ? 4096 - ((4096 - local63[local413]) * (4096 - local428) >> 11) : local63[local413] * local428 >> 11;
				}
			} else if (local74 == 7) {
				for (@Pc(524) int local524 = 0; local524 < Static2.anInt1626; local524++) {
					@Pc(535) int local535 = local63[local524];
					@Pc(539) int local539 = local55[local524];
					@Pc(543) int local543 = local47[local524];
					local39[local524] = local543 == 4096 ? 4096 : (local71[local524] << 12) / (4096 - local543);
					local43[local524] = local539 == 4096 ? 4096 : (local67[local524] << 12) / (4096 - local539);
					local51[local524] = local535 == 4096 ? 4096 : (local59[local524] << 12) / (4096 - local535);
				}
			} else if (local74 == 8) {
				for (@Pc(610) int local610 = 0; local610 < Static2.anInt1626; local610++) {
					@Pc(621) int local621 = local55[local610];
					@Pc(625) int local625 = local63[local610];
					@Pc(629) int local629 = local47[local610];
					local39[local610] = local629 == 0 ? 0 : 4096 - (4096 - local71[local610] << 12) / local629;
					local43[local610] = local621 == 0 ? 0 : 4096 - (4096 - local67[local610] << 12) / local621;
					local51[local610] = local625 == 0 ? 0 : 4096 - (4096 - local59[local610] << 12) / local625;
				}
			} else if (local74 == 9) {
				for (@Pc(701) int local701 = 0; local701 < Static2.anInt1626; local701++) {
					@Pc(708) int local708 = local63[local701];
					@Pc(712) int local712 = local59[local701];
					@Pc(716) int local716 = local67[local701];
					@Pc(720) int local720 = local71[local701];
					@Pc(724) int local724 = local47[local701];
					@Pc(728) int local728 = local55[local701];
					local39[local701] = local724 >= local720 ? local720 : local724;
					local43[local701] = local728 < local716 ? local728 : local716;
					local51[local701] = local712 <= local708 ? local712 : local708;
				}
			} else if (local74 == 10) {
				for (@Pc(766) int local766 = 0; local766 < Static2.anInt1626; local766++) {
					@Pc(777) int local777 = local47[local766];
					@Pc(781) int local781 = local63[local766];
					@Pc(785) int local785 = local59[local766];
					@Pc(789) int local789 = local71[local766];
					@Pc(793) int local793 = local67[local766];
					@Pc(797) int local797 = local55[local766];
					local39[local766] = local777 > local789 ? local777 : local789;
					local43[local766] = local797 > local793 ? local797 : local793;
					local51[local766] = local781 > local785 ? local781 : local785;
				}
			} else if (local74 == 11) {
				for (@Pc(835) int local835 = 0; local835 < Static2.anInt1626; local835++) {
					@Pc(846) int local846 = local71[local835];
					@Pc(850) int local850 = local67[local835];
					@Pc(854) int local854 = local63[local835];
					@Pc(858) int local858 = local59[local835];
					@Pc(862) int local862 = local47[local835];
					@Pc(866) int local866 = local55[local835];
					local39[local835] = local862 <= local846 ? local846 - local862 : local862 - local846;
					local43[local835] = local866 <= local850 ? local850 - local866 : local866 - local850;
					local51[local835] = local854 <= local858 ? local858 - local854 : local854 - local858;
				}
			} else if (local74 == 12) {
				for (@Pc(917) int local917 = 0; local917 < Static2.anInt1626; local917++) {
					@Pc(928) int local928 = local55[local917];
					@Pc(932) int local932 = local63[local917];
					@Pc(936) int local936 = local71[local917];
					@Pc(940) int local940 = local59[local917];
					@Pc(944) int local944 = local47[local917];
					@Pc(948) int local948 = local67[local917];
					local39[local917] = local936 + local944 - (local936 * local944 >> 11);
					local43[local917] = local948 + local928 - (local928 * local948 >> 11);
					local51[local917] = local932 + local940 - (local940 * local932 >> 11);
				}
			}
		}
		return local18;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class4_Sub23 extends Node {

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "[Lclient!pb;")
	public final Class4_Sub8_Sub1[] aClass4_Sub8_Sub1Array1;

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
	public final int anInt4326;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "[Lclient!si;")
	public final Class157[] aClass157Array1;

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "[B")
	public final byte[] aByteArray57;

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "[I")
	private int[] anIntArray458 = new int[128];

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "[S")
	public final short[] aShortArray80;

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "[B")
	public final byte[] aByteArray58;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V")
	public Class4_Sub23(@OriginalArg(0) byte[] arg0) {
		@Pc(9) int local9 = 0;
		this.aByteArray56 = new byte[128];
		this.aByteArray58 = new byte[128];
		this.aByteArray57 = new byte[128];
		this.aClass157Array1 = new Class157[128];
		this.aShortArray80 = new short[128];
		this.aClass4_Sub8_Sub1Array1 = new Class4_Sub8_Sub1[128];
		@Pc(38) Class4_Sub10 local38 = new Class4_Sub10(arg0);
		while (local38.aByteArray71[local9 + local38.anInt5709] != 0) {
			local9++;
		}
		@Pc(52) byte[] local52 = new byte[local9];
		for (@Pc(54) int local54 = 0; local54 < local9; local54++) {
			local52[local54] = local38.method4637();
		}
		@Pc(71) int local71 = local9 + 1;
		local38.anInt5709++;
		@Pc(80) int local80 = local38.anInt5709;
		local38.anInt5709 += local71;
		@Pc(88) int local88;
		for (local88 = 0; local38.aByteArray71[local38.anInt5709 + local88] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		for (@Pc(104) int local104 = 0; local104 < local88; local104++) {
			local102[local104] = local38.method4637();
		}
		@Pc(117) int local117 = local88 + 1;
		local38.anInt5709++;
		@Pc(125) int local125 = 0;
		@Pc(128) int local128 = local38.anInt5709;
		local38.anInt5709 += local117;
		while (local38.aByteArray71[local38.anInt5709 + local125] != 0) {
			local125++;
		}
		@Pc(149) byte[] local149 = new byte[local125];
		for (@Pc(151) int local151 = 0; local151 < local125; local151++) {
			local149[local151] = local38.method4637();
		}
		@Pc(164) int local164 = local125 + 1;
		local38.anInt5709++;
		@Pc(173) byte[] local173 = new byte[local164];
		@Pc(182) int local182;
		if (local164 > 1) {
			@Pc(180) int local180 = 1;
			local182 = 2;
			local173[1] = 1;
			for (@Pc(188) int local188 = 2; local188 < local164; local188++) {
				@Pc(195) int local195 = local38.method4629();
				if (local195 == 0) {
					local180 = local182++;
				} else {
					if (local180 >= local195) {
						local195--;
					}
					local180 = local195;
				}
				local173[local188] = (byte) local180;
			}
		} else {
			local182 = local164;
		}
		@Pc(228) Class157[] local228 = new Class157[local182];
		for (@Pc(230) int local230 = 0; local230 < local228.length; local230++) {
			@Pc(242) Class157 local242 = local228[local230] = new Class157();
			@Pc(246) int local246 = local38.method4629();
			if (local246 > 0) {
				local242.aByteArray65 = new byte[local246 * 2];
			}
			@Pc(262) int local262 = local38.method4629();
			if (local262 > 0) {
				local242.aByteArray64 = new byte[local262 * 2 + 2];
				local242.aByteArray64[1] = 64;
			}
		}
		@Pc(286) int local286 = local38.method4629();
		@Pc(298) byte[] local298 = local286 > 0 ? new byte[local286 * 2] : null;
		local286 = local38.method4629();
		@Pc(304) int local304 = 0;
		@Pc(314) byte[] local314 = local286 <= 0 ? null : new byte[local286 * 2];
		while (local38.aByteArray71[local304 + local38.anInt5709] != 0) {
			local304++;
		}
		@Pc(329) byte[] local329 = new byte[local304];
		for (@Pc(331) int local331 = 0; local331 < local304; local331++) {
			local329[local331] = local38.method4637();
		}
		local38.anInt5709++;
		@Pc(354) int local354 = local304 + 1;
		@Pc(356) int local356 = 0;
		for (@Pc(358) int local358 = 0; local358 < 128; local358++) {
			local356 += local38.method4629();
			this.aShortArray80[local358] = (short) local356;
		}
		@Pc(378) int local378 = 0;
		for (@Pc(380) int local380 = 0; local380 < 128; local380++) {
			local378 += local38.method4629();
			@Pc(391) short[] local391 = this.aShortArray80;
			local391[local380] = (short) (local391[local380] + (local378 << 8));
		}
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		@Pc(409) int local409 = 0;
		for (@Pc(411) int local411 = 0; local411 < 128; local411++) {
			if (local405 == 0) {
				if (local407 >= local329.length) {
					local405 = -1;
				} else {
					local405 = local329[local407++];
				}
				local409 = local38.method4609();
			}
			@Pc(441) short[] local441 = this.aShortArray80;
			local441[local411] = (short) (local441[local411] + ((local409 - 1 & 0x2) << 14));
			this.anIntArray458[local411] = local409;
			local405--;
		}
		@Pc(465) int local465 = 0;
		@Pc(467) int local467 = 0;
		@Pc(469) int local469 = 0;
		for (@Pc(471) int local471 = 0; local471 < 128; local471++) {
			if (this.anIntArray458[local471] != 0) {
				if (local465 == 0) {
					local469 = local38.aByteArray71[local80++] - 1;
					if (local467 >= local52.length) {
						local465 = -1;
					} else {
						local465 = local52[local467++];
					}
				}
				this.aByteArray56[local471] = (byte) local469;
				local465--;
			}
		}
		@Pc(521) int local521 = 0;
		@Pc(523) int local523 = 0;
		@Pc(525) int local525 = 0;
		for (@Pc(527) int local527 = 0; local527 < 128; local527++) {
			if (this.anIntArray458[local527] != 0) {
				if (local525 == 0) {
					if (local102.length <= local523) {
						local525 = -1;
					} else {
						local525 = local102[local523++];
					}
					local521 = local38.aByteArray71[local128++] + 16 << 2;
				}
				this.aByteArray57[local527] = (byte) local521;
				local525--;
			}
		}
		@Pc(577) int local577 = 0;
		@Pc(579) int local579 = 0;
		@Pc(581) Class157 local581 = null;
		for (@Pc(583) int local583 = 0; local583 < 128; local583++) {
			if (this.anIntArray458[local583] != 0) {
				if (local577 == 0) {
					local581 = local228[local173[local579]];
					if (local149.length > local579) {
						local577 = local149[local579++];
					} else {
						local577 = -1;
					}
				}
				local577--;
				this.aClass157Array1[local583] = local581;
			}
		}
		@Pc(636) int local636 = 0;
		@Pc(638) int local638 = 0;
		@Pc(640) int local640 = 0;
		for (@Pc(642) int local642 = 0; local642 < 128; local642++) {
			if (local636 == 0) {
				if (local329.length <= local638) {
					local636 = -1;
				} else {
					local636 = local329[local638++];
				}
				if (this.anIntArray458[local642] > 0) {
					local640 = local38.method4629() + 1;
				}
			}
			this.aByteArray58[local642] = (byte) local640;
			local636--;
		}
		this.anInt4326 = local38.method4629() + 1;
		for (@Pc(693) int local693 = 0; local693 < local182; local693++) {
			@Pc(700) Class157 local700 = local228[local693];
			if (local700.aByteArray65 != null) {
				for (@Pc(705) int local705 = 1; local705 < local700.aByteArray65.length; local705 += 2) {
					local700.aByteArray65[local705] = local38.method4637();
				}
			}
			if (local700.aByteArray64 != null) {
				for (@Pc(731) int local731 = 3; local731 < local700.aByteArray64.length - 2; local731 += 2) {
					local700.aByteArray64[local731] = local38.method4637();
				}
			}
		}
		if (local298 != null) {
			for (@Pc(760) int local760 = 1; local760 < local298.length; local760 += 2) {
				local298[local760] = local38.method4637();
			}
		}
		if (local314 != null) {
			for (@Pc(778) int local778 = 1; local778 < local314.length; local778 += 2) {
				local314[local778] = local38.method4637();
			}
		}
		for (@Pc(793) int local793 = 0; local793 < local182; local793++) {
			@Pc(804) Class157 local804 = local228[local793];
			if (local804.aByteArray64 != null) {
				@Pc(810) int local810 = 0;
				for (@Pc(812) int local812 = 2; local812 < local804.aByteArray64.length; local812 += 2) {
					local810 += local38.method4629() + 1;
					local804.aByteArray64[local812] = (byte) local810;
				}
			}
		}
		for (@Pc(839) int local839 = 0; local839 < local182; local839++) {
			@Pc(850) Class157 local850 = local228[local839];
			if (local850.aByteArray65 != null) {
				@Pc(857) int local857 = 0;
				for (@Pc(859) int local859 = 2; local859 < local850.aByteArray65.length; local859 += 2) {
					local857 = local38.method4629() + local857 + 1;
					local850.aByteArray65[local859] = (byte) local857;
				}
			}
		}
		if (local298 != null) {
			@Pc(895) int local895 = local38.method4629();
			local298[0] = (byte) local895;
			for (@Pc(902) int local902 = 2; local902 < local298.length; local902 += 2) {
				local895 = local895 + local38.method4629() + 1;
				local298[local902] = (byte) local895;
			}
			@Pc(930) byte local930 = local298[0];
			@Pc(934) byte local934 = local298[1];
			for (@Pc(936) int local936 = 0; local936 < local930; local936++) {
				this.aByteArray58[local936] = (byte) (this.aByteArray58[local936] * local934 + 32 >> 6);
			}
			for (@Pc(963) int local963 = 2; local963 < local298.length; local963 += 2) {
				@Pc(973) byte local973 = local298[local963 + 1];
				@Pc(977) byte local977 = local298[local963];
				@Pc(991) int local991 = (local977 - local930) / 2 + local934 * (local977 - local930);
				for (@Pc(993) int local993 = local930; local993 < local977; local993++) {
					@Pc(1004) int local1004 = Static26.method2987(local977 - local930, local991);
					this.aByteArray58[local993] = (byte) (this.aByteArray58[local993] * local1004 + 32 >> 6);
					local991 += local973 - local934;
				}
				local934 = local973;
				local930 = local977;
			}
			for (@Pc(1040) int local1040 = local930; local1040 < 128; local1040++) {
				this.aByteArray58[local1040] = (byte) (local934 * this.aByteArray58[local1040] + 32 >> 6);
			}
		}
		if (local314 != null) {
			@Pc(1069) int local1069 = local38.method4629();
			local314[0] = (byte) local1069;
			for (@Pc(1076) int local1076 = 2; local1076 < local314.length; local1076 += 2) {
				local1069 -= -local38.method4629() - 1;
				local314[local1076] = (byte) local1069;
			}
			@Pc(1103) int local1103 = local314[1] << 1;
			@Pc(1107) byte local1107 = local314[0];
			for (@Pc(1109) int local1109 = 0; local1109 < local1107; local1109++) {
				@Pc(1126) int local1126 = (this.aByteArray57[local1109] & 0xFF) + local1103;
				if (local1126 < 0) {
					local1126 = 0;
				}
				if (local1126 > 128) {
					local1126 = 128;
				}
				this.aByteArray57[local1109] = (byte) local1126;
			}
			@Pc(1150) int local1150 = 2;
			while (local314.length > local1150) {
				@Pc(1162) byte local1162 = local314[local1150];
				@Pc(1170) int local1170 = local314[local1150 + 1] << 1;
				local1150 += 2;
				@Pc(1184) int local1184 = local1103 * (local1162 - local1107) + (local1162 - local1107) / 2;
				for (@Pc(1186) int local1186 = local1107; local1186 < local1162; local1186++) {
					@Pc(1201) int local1201 = Static26.method2987(local1162 - local1107, local1184);
					local1184 += local1170 - local1103;
					@Pc(1218) int local1218 = (this.aByteArray57[local1186] & 0xFF) + local1201;
					if (local1218 < 0) {
						local1218 = 0;
					}
					if (local1218 > 128) {
						local1218 = 128;
					}
					this.aByteArray57[local1186] = (byte) local1218;
				}
				local1107 = local1162;
				local1103 = local1170;
			}
			for (@Pc(1253) int local1253 = local1107; local1253 < 128; local1253++) {
				@Pc(1265) int local1265 = local1103 + (this.aByteArray57[local1253] & 0xFF);
				if (local1265 < 0) {
					local1265 = 0;
				}
				if (local1265 > 128) {
					local1265 = 128;
				}
				this.aByteArray57[local1253] = (byte) local1265;
			}
		}
		for (@Pc(1287) int local1287 = 0; local1287 < local182; local1287++) {
			local228[local1287].anInt4841 = local38.method4629();
		}
		for (@Pc(1306) int local1306 = 0; local1306 < local182; local1306++) {
			@Pc(1313) Class157 local1313 = local228[local1306];
			if (local1313.aByteArray65 != null) {
				local1313.anInt4842 = local38.method4629();
			}
			if (local1313.aByteArray64 != null) {
				local1313.anInt4848 = local38.method4629();
			}
			if (local1313.anInt4841 > 0) {
				local1313.anInt4839 = local38.method4629();
			}
		}
		for (@Pc(1345) int local1345 = 0; local1345 < local182; local1345++) {
			local228[local1345].anInt4847 = local38.method4629();
		}
		for (@Pc(1364) int local1364 = 0; local1364 < local182; local1364++) {
			@Pc(1371) Class157 local1371 = local228[local1364];
			if (local1371.anInt4847 > 0) {
				local1371.anInt4840 = local38.method4629();
			}
		}
		for (@Pc(1387) int local1387 = 0; local1387 < local182; local1387++) {
			@Pc(1398) Class157 local1398 = local228[local1387];
			if (local1398.anInt4840 > 0) {
				local1398.anInt4845 = local38.method4629();
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([ILclient!jk;I[B)Z")
	public final boolean method3566(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = 0;
		@Pc(19) Class4_Sub8_Sub1 local19 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg2 == null || arg2[local21] != 0) {
				@Pc(40) int local40 = this.anIntArray458[local21];
				if (local40 != 0) {
					if (local40 != local17) {
						local17 = local40;
						@Pc(51) int local51 = local40 - 1;
						if ((local51 & 0x1) == 0) {
							local19 = arg1.method2061(arg0, local51 >> 2);
						} else {
							local19 = arg1.method2058(arg0, local51 >> 2);
						}
						if (local19 == null) {
							local15 = false;
						}
					}
					if (local19 != null) {
						this.aClass4_Sub8_Sub1Array1[local21] = local19;
						this.anIntArray458[local21] = 0;
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	public final void method3570() {
		this.anIntArray458 = null;
	}
}

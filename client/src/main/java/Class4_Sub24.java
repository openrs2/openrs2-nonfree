import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class4_Sub24 extends Node {

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
	private int anInt4414;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "Z")
	private boolean aBoolean307;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
	private int anInt4416;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
	private int anInt4417;

	@OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
	private int anInt4419;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
	private int anInt4420;

	@OriginalMember(owner = "client!qn", name = "L", descriptor = "[[B")
	private byte[][] aByteArrayArray37;

	@OriginalMember(owner = "client!qn", name = "P", descriptor = "[F")
	private float[] aFloatArray52;

	@OriginalMember(owner = "client!qn", name = "S", descriptor = "Z")
	private boolean aBoolean309;

	@OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
	private int anInt4422;

	@OriginalMember(owner = "client!qn", name = "U", descriptor = "I")
	private int anInt4423;

	@OriginalMember(owner = "client!qn", name = "V", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!qn", name = "W", descriptor = "I")
	private int anInt4424;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "([B)V")
	public Class4_Sub24(@OriginalArg(0) byte[] arg0) {
		this.method3631(arg0);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)[F")
	private float[] method3627(@OriginalArg(0) int arg0) {
		Static30.method3629(this.aByteArrayArray37[arg0]);
		Static30.method3632();
		@Pc(15) int local15 = Static30.method3637(Static24.method2700(Static6.anIntArray468.length - 1));
		@Pc(19) boolean local19 = Static6.aBooleanArray23[local15];
		@Pc(25) int local25 = local19 ? Static6.anInt4415 : Static6.anInt4413;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		if (local19) {
			local27 = Static30.method3632() != 0;
			local29 = Static30.method3632() != 0;
		}
		@Pc(47) int local47 = local25 >> 1;
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (local19 && !local27) {
			local59 = (local25 >> 2) - (Static6.anInt4413 >> 2);
			local67 = (local25 >> 2) + (Static6.anInt4413 >> 2);
			local71 = Static6.anInt4413 >> 1;
		} else {
			local59 = 0;
			local67 = local47;
			local71 = local25 >> 1;
		}
		@Pc(94) int local94;
		@Pc(104) int local104;
		@Pc(108) int local108;
		if (local19 && !local29) {
			local94 = local25 - (local25 >> 2) - (Static6.anInt4413 >> 2);
			local104 = local25 + (Static6.anInt4413 >> 2) - (local25 >> 2);
			local108 = Static6.anInt4413 >> 1;
		} else {
			local94 = local47;
			local104 = local25;
			local108 = local25 >> 1;
		}
		@Pc(123) Class149 local123 = Static6.aClass149Array1[Static6.anIntArray468[local15]];
		@Pc(126) int local126 = local123.anInt4454;
		@Pc(131) int local131 = local123.anIntArray476[local126];
		@Pc(140) boolean local140 = !Static6.aClass18Array1[local131].method269();
		for (@Pc(144) int local144 = 0; local144 < local123.anInt4455; local144++) {
			@Pc(155) Class155 local155 = Static6.aClass155Array1[local123.anIntArray477[local144]];
			@Pc(157) float[] local157 = Static6.aFloatArray50;
			local155.method3955(local157, local25 >> 1, local140);
		}
		if (!local140) {
			@Pc(171) int local171 = local123.anInt4454;
			@Pc(176) int local176 = local123.anIntArray476[local171];
			Static6.aClass18Array1[local176].method266(Static6.aFloatArray50, local25 >> 1);
		}
		if (local140) {
			for (@Pc(190) int local190 = local25 >> 1; local190 < local25; local190++) {
				Static6.aFloatArray50[local190] = 0.0F;
			}
		} else {
			@Pc(204) int local204 = local25 >> 1;
			@Pc(208) int local208 = local25 >> 2;
			@Pc(212) int local212 = local25 >> 3;
			@Pc(214) float[] local214 = Static6.aFloatArray50;
			for (@Pc(216) int local216 = 0; local216 < local204; local216++) {
				local214[local216] *= 0.5F;
			}
			for (@Pc(230) int local230 = local204; local230 < local25; local230++) {
				local214[local230] = -local214[local25 - local230 - 1];
			}
			@Pc(252) float[] local252 = local19 ? Static6.aFloatArray48 : Static6.aFloatArray46;
			@Pc(258) float[] local258 = local19 ? Static6.aFloatArray51 : Static6.aFloatArray49;
			@Pc(264) float[] local264 = local19 ? Static6.aFloatArray45 : Static6.aFloatArray47;
			@Pc(270) int[] local270 = local19 ? Static6.anIntArray470 : Static6.anIntArray469;
			for (@Pc(272) int local272 = 0; local272 < local208; local272++) {
				@Pc(291) float local291 = local214[local272 * 4] - local214[local25 - local272 * 4 - 1];
				@Pc(309) float local309 = local214[local272 * 4 + 2] - local214[local25 - local272 * 4 - 3];
				@Pc(315) float local315 = local252[local272 * 2];
				@Pc(323) float local323 = local252[local272 * 2 + 1];
				local214[local25 - local272 * 4 - 1] = local291 * local315 - local309 * local323;
				local214[local25 - local272 * 4 - 3] = local291 * local323 + local309 * local315;
			}
			for (@Pc(359) int local359 = 0; local359 < local212; local359++) {
				@Pc(372) float local372 = local214[local204 + local359 * 4 + 3];
				@Pc(382) float local382 = local214[local204 + local359 * 4 + 1];
				@Pc(390) float local390 = local214[local359 * 4 + 3];
				@Pc(398) float local398 = local214[local359 * 4 + 1];
				local214[local204 + local359 * 4 + 3] = local372 + local390;
				local214[local204 + local359 * 4 + 1] = local382 + local398;
				@Pc(432) float local432 = local252[local204 - local359 * 4 - 4];
				@Pc(442) float local442 = local252[local204 - local359 * 4 - 3];
				local214[local359 * 4 + 3] = (local372 - local390) * local432 - (local382 - local398) * local442;
				local214[local359 * 4 + 1] = (local382 - local398) * local432 + (local372 - local390) * local442;
			}
			@Pc(486) int local486 = Static24.method2700(local25 - 1);
			for (@Pc(488) int local488 = 0; local488 < local486 - 3; local488++) {
				@Pc(499) int local499 = local25 >> local488 + 2;
				@Pc(503) int local503 = 0x8 << local488;
				for (@Pc(505) int local505 = 0; local505 < 0x2 << local488; local505++) {
					@Pc(518) int local518 = local25 - local499 * 2 * local505;
					@Pc(528) int local528 = local25 - local499 * (local505 * 2 + 1);
					for (@Pc(530) int local530 = 0; local530 < local25 >> local488 + 4; local530++) {
						@Pc(541) int local541 = local530 * 4;
						@Pc(549) float local549 = local214[local518 - local541 - 1];
						@Pc(557) float local557 = local214[local518 - local541 - 3];
						@Pc(565) float local565 = local214[local528 - local541 - 1];
						@Pc(573) float local573 = local214[local528 - local541 - 3];
						local214[local518 - local541 - 1] = local549 + local565;
						local214[local518 - local541 - 3] = local557 + local573;
						@Pc(599) float local599 = local252[local530 * local503];
						@Pc(607) float local607 = local252[local530 * local503 + 1];
						local214[local528 - local541 - 1] = (local549 - local565) * local599 - (local557 - local573) * local607;
						local214[local528 - local541 - 3] = (local557 - local573) * local599 + (local549 - local565) * local607;
					}
				}
			}
			for (@Pc(651) int local651 = 1; local651 < local212 - 1; local651++) {
				@Pc(660) int local660 = local270[local651];
				if (local651 < local660) {
					@Pc(667) int local667 = local651 * 8;
					@Pc(671) int local671 = local660 * 8;
					@Pc(677) float local677 = local214[local667 + 1];
					local214[local667 + 1] = local214[local671 + 1];
					local214[local671 + 1] = local677;
					local677 = local214[local667 + 3];
					local214[local667 + 3] = local214[local671 + 3];
					local214[local671 + 3] = local677;
					local677 = local214[local667 + 5];
					local214[local667 + 5] = local214[local671 + 5];
					local214[local671 + 5] = local677;
					local677 = local214[local667 + 7];
					local214[local667 + 7] = local214[local671 + 7];
					local214[local671 + 7] = local677;
				}
			}
			for (@Pc(763) int local763 = 0; local763 < local204; local763++) {
				local214[local763] = local214[local763 * 2 + 1];
			}
			for (@Pc(780) int local780 = 0; local780 < local212; local780++) {
				local214[local25 - local780 * 2 - 1] = local214[local780 * 4];
				local214[local25 - local780 * 2 - 2] = local214[local780 * 4 + 1];
				local214[local25 - local208 - local780 * 2 - 1] = local214[local780 * 4 + 2];
				local214[local25 - local208 - local780 * 2 - 2] = local214[local780 * 4 + 3];
			}
			for (@Pc(853) int local853 = 0; local853 < local212; local853++) {
				@Pc(862) float local862 = local264[local853 * 2];
				@Pc(870) float local870 = local264[local853 * 2 + 1];
				@Pc(878) float local878 = local214[local204 + local853 * 2];
				@Pc(888) float local888 = local214[local204 + local853 * 2 + 1];
				@Pc(898) float local898 = local214[local25 - local853 * 2 - 2];
				@Pc(908) float local908 = local214[local25 - local853 * 2 - 1];
				@Pc(920) float local920 = local870 * (local878 - local898) + local862 * (local888 + local908);
				local214[local204 + local853 * 2] = (local878 + local898 + local920) * 0.5F;
				local214[local25 - local853 * 2 - 2] = (local878 + local898 - local920) * 0.5F;
				local920 = local870 * (local888 + local908) - local862 * (local878 - local898);
				local214[local204 + local853 * 2 + 1] = (local888 + local920 - local908) * 0.5F;
				local214[local25 - local853 * 2 - 1] = (local908 + local920 - local888) * 0.5F;
			}
			for (@Pc(999) int local999 = 0; local999 < local208; local999++) {
				local214[local999] = local214[local999 * 2 + local204] * local258[local999 * 2] + local214[local999 * 2 + local204 + 1] * local258[local999 * 2 + 1];
				local214[local204 - local999 - 1] = local214[local999 * 2 + local204] * local258[local999 * 2 + 1] - local214[local999 * 2 + local204 + 1] * local258[local999 * 2];
			}
			for (@Pc(1078) int local1078 = 0; local1078 < local208; local1078++) {
				local214[local25 + local1078 - local208] = -local214[local1078];
			}
			for (@Pc(1096) int local1096 = 0; local1096 < local208; local1096++) {
				local214[local1096] = local214[local208 + local1096];
			}
			for (@Pc(1111) int local1111 = 0; local1111 < local208; local1111++) {
				local214[local208 + local1111] = -local214[local208 - local1111 - 1];
			}
			for (@Pc(1131) int local1131 = 0; local1131 < local208; local1131++) {
				local214[local204 + local1131] = local214[local25 - local1131 - 1];
			}
			for (@Pc(1150) int local1150 = local59; local1150 < local67; local1150++) {
				@Pc(1169) float local1169 = (float) Math.sin(((double) (local1150 - local59) + 0.5D) / (double) local71 * 0.5D * 3.141592653589793D);
				@Pc(1170) float[] local1170 = Static6.aFloatArray50;
				local1170[local1150] *= (float) Math.sin((double) local1169 * 1.5707963267948966D * (double) local1169);
			}
			for (@Pc(1188) int local1188 = local94; local1188 < local104; local1188++) {
				@Pc(1209) float local1209 = (float) Math.sin(((double) (local1188 - local94) + 0.5D) / (double) local108 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				@Pc(1210) float[] local1210 = Static6.aFloatArray50;
				local1210[local1188] *= (float) Math.sin((double) local1209 * 1.5707963267948966D * (double) local1209);
			}
		}
		@Pc(1228) float[] local1228 = null;
		if (this.anInt4422 > 0) {
			@Pc(1238) int local1238 = this.anInt4422 + local25 >> 2;
			local1228 = new float[local1238];
			if (!this.aBoolean307) {
				for (@Pc(1246) int local1246 = 0; local1246 < this.anInt4416; local1246++) {
					@Pc(1257) int local1257 = (this.anInt4422 >> 1) + local1246;
					local1228[local1246] += this.aFloatArray52[local1257];
				}
			}
			if (!local140) {
				for (@Pc(1273) int local1273 = local59; local1273 < local25 >> 1; local1273++) {
					@Pc(1287) int local1287 = local1228.length + local1273 - (local25 >> 1);
					local1228[local1287] += Static6.aFloatArray50[local1273];
				}
			}
		}
		@Pc(1301) float[] local1301 = this.aFloatArray52;
		this.aFloatArray52 = Static6.aFloatArray50;
		Static6.aFloatArray50 = local1301;
		this.anInt4422 = local25;
		this.anInt4416 = local104 - (local25 >> 1);
		this.aBoolean307 = local140;
		return local1228;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "([B)V")
	private void method3631(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class4_Sub10 local4 = new Class4_Sub10(arg0);
		this.anInt4417 = local4.method4595();
		this.anInt4414 = local4.method4595();
		this.anInt4419 = local4.method4595();
		this.anInt4420 = local4.method4595();
		if (this.anInt4420 < 0) {
			this.anInt4420 = ~this.anInt4420;
			this.aBoolean309 = true;
		}
		@Pc(40) int local40 = local4.method4595();
		this.aByteArrayArray37 = new byte[local40][];
		for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
			@Pc(51) int local51 = 0;
			@Pc(55) int local55;
			do {
				local55 = local4.method4629();
				local51 += local55;
			} while (local55 >= 255);
			@Pc(67) byte[] local67 = new byte[local51];
			local4.method4612(local51, local67);
			this.aByteArrayArray37[local46] = local67;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([I)Lclient!pb;")
	public final Class4_Sub8_Sub1 method3635(@OriginalArg(0) int[] arg0) {
		if (arg0 != null && arg0[0] <= 0) {
			return null;
		}
		if (this.aByteArray60 == null) {
			this.anInt4422 = 0;
			this.aFloatArray52 = new float[Static6.anInt4415];
			this.aByteArray60 = new byte[this.anInt4414];
			this.anInt4424 = 0;
			this.anInt4423 = 0;
		}
		while (this.anInt4423 < this.aByteArrayArray37.length) {
			if (arg0 != null && arg0[0] <= 0) {
				return null;
			}
			@Pc(47) float[] local47 = this.method3627(this.anInt4423);
			if (local47 != null) {
				@Pc(52) int local52 = this.anInt4424;
				@Pc(55) int local55 = local47.length;
				if (local55 > this.anInt4414 - local52) {
					local55 = this.anInt4414 - local52;
				}
				for (@Pc(68) int local68 = 0; local68 < local55; local68++) {
					@Pc(80) int local80 = (int) (local47[local68] * 128.0F + 128.0F);
					if ((local80 & 0xFFFFFF00) != 0) {
						local80 = ~local80 >> 31;
					}
					this.aByteArray60[local52++] = (byte) (local80 - 128);
				}
				if (arg0 != null) {
					arg0[0] -= local52 - this.anInt4424;
				}
				this.anInt4424 = local52;
			}
			this.anInt4423++;
		}
		this.aFloatArray52 = null;
		@Pc(129) byte[] local129 = this.aByteArray60;
		this.aByteArray60 = null;
		return new Class4_Sub8_Sub1(this.anInt4417, local129, this.anInt4419, this.anInt4420, this.aBoolean309);
	}
}

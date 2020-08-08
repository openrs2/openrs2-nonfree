import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class132 {

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	public final int anInt4110;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	private final int anInt4109;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
	private final int[] anIntArray430;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class132() {
		Static30.method3637(24);
		this.anInt4110 = Static30.method3637(16);
		this.anInt4109 = Static30.method3637(24);
		this.anIntArray430 = new int[this.anInt4109];
		@Pc(23) boolean local23 = Static30.method3632() != 0;
		if (local23) {
			@Pc(27) int local27 = 0;
			@Pc(32) int local32 = Static30.method3637(5) + 1;
			while (local27 < this.anInt4109) {
				@Pc(44) int local44 = Static30.method3637(Static24.method2700(this.anInt4109 - local27));
				for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
					this.anIntArray430[local27++] = local32;
				}
				local32++;
			}
		} else {
			@Pc(66) boolean local66 = Static30.method3632() != 0;
			for (@Pc(68) int local68 = 0; local68 < this.anInt4109; local68++) {
				if (local66 && Static30.method3632() == 0) {
					this.anIntArray430[local68] = 0;
				} else {
					this.anIntArray430[local68] = Static30.method3637(5) + 1;
				}
			}
		}
		this.method3394();
		@Pc(97) int local97 = Static30.method3637(4);
		if (local97 > 0) {
			@Pc(103) float local103 = Static30.method3634(Static30.method3637(32));
			@Pc(107) float local107 = Static30.method3634(Static30.method3637(32));
			@Pc(112) int local112 = Static30.method3637(4) + 1;
			@Pc(118) boolean local118 = Static30.method3632() != 0;
			@Pc(127) int local127;
			if (local97 == 1) {
				local127 = Static29.method3393(this.anInt4109, this.anInt4110);
			} else {
				local127 = this.anInt4109 * this.anInt4110;
			}
			this.anIntArray429 = new int[local127];
			for (@Pc(140) int local140 = 0; local140 < local127; local140++) {
				this.anIntArray429[local140] = Static30.method3637(local112);
			}
			this.aFloatArrayArray1 = new float[this.anInt4109][this.anInt4110];
			if (local97 == 1) {
				for (@Pc(163) int local163 = 0; local163 < this.anInt4109; local163++) {
					@Pc(169) float local169 = 0.0F;
					@Pc(171) int local171 = 1;
					for (@Pc(173) int local173 = 0; local173 < this.anInt4110; local173++) {
						@Pc(183) int local183 = local163 / local171 % local127;
						@Pc(195) float local195 = (float) this.anIntArray429[local183] * local107 + local103 + local169;
						this.aFloatArrayArray1[local163][local173] = local195;
						if (local118) {
							local169 = local195;
						}
						local171 *= local127;
					}
				}
			} else {
				for (@Pc(217) int local217 = 0; local217 < this.anInt4109; local217++) {
					@Pc(223) float local223 = 0.0F;
					@Pc(228) int local228 = local217 * this.anInt4110;
					for (@Pc(230) int local230 = 0; local230 < this.anInt4110; local230++) {
						@Pc(246) float local246 = (float) this.anIntArray429[local228] * local107 + local103 + local223;
						this.aFloatArrayArray1[local217][local230] = local246;
						if (local118) {
							local223 = local246;
						}
						local228++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()[F")
	public final float[] method3392() {
		return this.aFloatArrayArray1[this.method3395()];
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()V")
	private void method3394() {
		@Pc(3) int[] local3 = new int[this.anInt4109];
		@Pc(6) int[] local6 = new int[33];
		for (@Pc(8) int local8 = 0; local8 < this.anInt4109; local8++) {
			@Pc(17) int local17 = this.anIntArray430[local8];
			if (local17 != 0) {
				@Pc(26) int local26 = 0x1 << 32 - local17;
				@Pc(30) int local30 = local6[local17];
				local3[local8] = local30;
				@Pc(44) int local44;
				if ((local30 & local26) == 0) {
					local44 = local30 | local26;
					for (@Pc(53) int local53 = local17 - 1; local53 >= 1; local53--) {
						@Pc(60) int local60 = local6[local53];
						if (local60 != local30) {
							break;
						}
						@Pc(69) int local69 = 0x1 << 32 - local53;
						if ((local60 & local69) != 0) {
							local6[local53] = local6[local53 - 1];
							break;
						}
						local6[local53] = local60 | local69;
					}
				} else {
					local44 = local6[local17 - 1];
				}
				local6[local17] = local44;
				for (@Pc(98) int local98 = local17 + 1; local98 <= 32; local98++) {
					@Pc(105) int local105 = local6[local98];
					if (local105 == local30) {
						local6[local98] = local44;
					}
				}
			}
		}
		this.anIntArray431 = new int[8];
		@Pc(122) int local122 = 0;
		for (@Pc(124) int local124 = 0; local124 < this.anInt4109; local124++) {
			@Pc(133) int local133 = this.anIntArray430[local124];
			if (local133 != 0) {
				@Pc(140) int local140 = local3[local124];
				@Pc(142) int local142 = 0;
				for (@Pc(144) int local144 = 0; local144 < local133; local144++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local144;
					if ((local140 & local151) == 0) {
						local142++;
					} else {
						if (this.anIntArray431[local142] == 0) {
							this.anIntArray431[local142] = local122;
						}
						local142 = this.anIntArray431[local142];
					}
					if (local142 >= this.anIntArray431.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray431.length * 2];
						for (@Pc(186) int local186 = 0; local186 < this.anIntArray431.length; local186++) {
							local184[local186] = this.anIntArray431[local186];
						}
						this.anIntArray431 = local184;
					}
				}
				this.anIntArray431[local142] = ~local124;
				if (local142 >= local122) {
					local122 = local142 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()I")
	public final int method3395() {
		@Pc(1) int local1;
		for (local1 = 0; this.anIntArray431[local1] >= 0; local1 = Static30.method3632() == 0 ? local1 + 1 : this.anIntArray431[local1]) {
		}
		return ~this.anIntArray431[local1];
	}
}

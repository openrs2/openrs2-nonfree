import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class18 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "[I")
	private final int[] anIntArray29;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
	private final int[] anIntArray30;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
	private final int[] anIntArray28;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "[I")
	private final int[] anIntArray34;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "[[I")
	private final int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	private final int anInt272;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
	private final int[] anIntArray33;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class18() {
		@Pc(4) int local4 = Static30.method3637(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static30.method3637(5);
		@Pc(16) int local16 = 0;
		this.anIntArray29 = new int[local14];
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			@Pc(28) int local28 = Static30.method3637(4);
			this.anIntArray29[local22] = local28;
			if (local28 >= local16) {
				local16 = local28 + 1;
			}
		}
		this.anIntArray30 = new int[local16];
		this.anIntArray28 = new int[local16];
		this.anIntArray34 = new int[local16];
		this.anIntArrayArray4 = new int[local16][];
		for (@Pc(60) int local60 = 0; local60 < local16; local60++) {
			this.anIntArray30[local60] = Static30.method3637(3) + 1;
			@Pc(79) int local79 = this.anIntArray28[local60] = Static30.method3637(2);
			if (local79 != 0) {
				this.anIntArray34[local60] = Static30.method3637(8);
			}
			@Pc(91) int local91 = 0x1 << local79;
			@Pc(94) int[] local94 = new int[local91];
			this.anIntArrayArray4[local60] = local94;
			for (@Pc(101) int local101 = 0; local101 < local91; local101++) {
				local94[local101] = Static30.method3637(8) - 1;
			}
		}
		this.anInt272 = Static30.method3637(2) + 1;
		@Pc(124) int local124 = Static30.method3637(4);
		@Pc(126) int local126 = 2;
		for (@Pc(128) int local128 = 0; local128 < local14; local128++) {
			local126 += this.anIntArray30[this.anIntArray29[local128]];
		}
		this.anIntArray33 = new int[local126];
		this.anIntArray33[0] = 0;
		this.anIntArray33[1] = 0x1 << local124;
		@Pc(161) int local161 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(171) int local171 = this.anIntArray29[local163];
			for (@Pc(173) int local173 = 0; local173 < this.anIntArray30[local171]; local173++) {
				this.anIntArray33[local161++] = Static30.method3637(local124);
			}
		}
		if (Static1.anIntArray31 == null || Static1.anIntArray31.length < local161) {
			Static1.anIntArray31 = new int[local161];
			Static1.anIntArray32 = new int[local161];
			Static1.aBooleanArray3 = new boolean[local161];
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([FI)V")
	public final void method266(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray33.length;
		@Pc(10) int local10 = Static1.anIntArray35[this.anInt272 - 1];
		Static1.aBooleanArray3[0] = Static1.aBooleanArray3[1] = true;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			@Pc(27) int local27 = Static9.method265(Static1.anIntArray31, local20);
			@Pc(31) int local31 = Static9.method270(Static1.anIntArray31, local20);
			@Pc(49) int local49 = this.method272(Static1.anIntArray31[local27], Static1.anIntArray32[local27], Static1.anIntArray31[local31], Static1.anIntArray32[local31], Static1.anIntArray31[local20]);
			@Pc(53) int local53 = Static1.anIntArray32[local20];
			@Pc(57) int local57 = local10 - local49;
			@Pc(68) int local68 = (local57 < local49 ? local57 : local49) << 1;
			if (local53 == 0) {
				Static1.aBooleanArray3[local20] = false;
				Static1.anIntArray32[local20] = local49;
			} else {
				Static1.aBooleanArray3[local27] = Static1.aBooleanArray3[local31] = true;
				Static1.aBooleanArray3[local20] = true;
				if (local53 >= local68) {
					Static1.anIntArray32[local20] = local57 > local49 ? local53 + local49 - local49 : local49 + local57 - local53 - 1;
				} else {
					Static1.anIntArray32[local20] = (local53 & 0x1) == 0 ? local49 + local53 / 2 : local49 - (local53 + 1) / 2;
				}
			}
		}
		this.method267(0, local3 - 1);
		@Pc(144) int local144 = 0;
		@Pc(151) int local151 = Static1.anIntArray32[0] * this.anInt272;
		for (@Pc(153) int local153 = 1; local153 < local3; local153++) {
			if (Static1.aBooleanArray3[local153]) {
				@Pc(164) int local164 = Static1.anIntArray31[local153];
				@Pc(171) int local171 = Static1.anIntArray32[local153] * this.anInt272;
				this.method271(local144, local151, local164, local171, arg0, arg1);
				if (local164 >= arg1) {
					return;
				}
				local144 = local164;
				local151 = local171;
			}
		}
		@Pc(193) float local193 = Static1.aFloatArray7[local151];
		for (@Pc(195) int local195 = local144; local195 < arg1; local195++) {
			arg0[local195] *= local193;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	private void method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static1.anIntArray31[arg0];
		@Pc(13) int local13 = Static1.anIntArray32[arg0];
		@Pc(17) boolean local17 = Static1.aBooleanArray3[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(28) int local28 = Static1.anIntArray31[local21];
			if (local28 < local9) {
				Static1.anIntArray31[local5] = local28;
				Static1.anIntArray32[local5] = Static1.anIntArray32[local21];
				Static1.aBooleanArray3[local5] = Static1.aBooleanArray3[local21];
				local5++;
				Static1.anIntArray31[local21] = Static1.anIntArray31[local5];
				Static1.anIntArray32[local21] = Static1.anIntArray32[local5];
				Static1.aBooleanArray3[local21] = Static1.aBooleanArray3[local5];
			}
		}
		Static1.anIntArray31[local5] = local9;
		Static1.anIntArray32[local5] = local13;
		Static1.aBooleanArray3[local5] = local17;
		this.method267(arg0, local5 - 1);
		this.method267(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()Z")
	public final boolean method269() {
		@Pc(5) boolean local5 = Static30.method3632() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray33.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static1.anIntArray31[local15] = this.anIntArray33[local15];
		}
		@Pc(34) int local34 = Static1.anIntArray35[this.anInt272 - 1];
		@Pc(40) int local40 = IntegerUtils.bitCount(local34 - 1);
		Static1.anIntArray32[0] = Static30.method3637(local40);
		Static1.anIntArray32[1] = Static30.method3637(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray29.length; local54++) {
			@Pc(64) int local64 = this.anIntArray29[local54];
			@Pc(69) int local69 = this.anIntArray30[local64];
			@Pc(74) int local74 = this.anIntArray28[local64];
			@Pc(80) int local80 = (0x1 << local74) - 1;
			@Pc(82) int local82 = 0;
			if (local74 > 0) {
				local82 = Static6.aClass132Array1[this.anIntArray34[local64]].method3395();
			}
			for (@Pc(94) int local94 = 0; local94 < local69; local94++) {
				@Pc(106) int local106 = this.anIntArrayArray4[local64][local82 & local80];
				local82 >>>= local74;
				Static1.anIntArray32[local52++] = local106 >= 0 ? Static6.aClass132Array1[local106].method3395() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII[FI)V")
	private void method271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		local14 -= (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static1.aFloatArray7[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(61) int local61 = arg0 + 1; local61 < arg2; local61++) {
			local22 += local14;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4[local61] *= Static1.aFloatArray7[local20];
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)I")
	private int method272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}
}

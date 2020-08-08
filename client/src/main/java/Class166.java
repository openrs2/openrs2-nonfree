import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class166 {

	@OriginalMember(owner = "client!to", name = "i", descriptor = "Z")
	public boolean aBoolean353 = true;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "I")
	public final int anInt5224;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "I")
	public final int anInt5226;

	@OriginalMember(owner = "client!to", name = "r", descriptor = "I")
	public final int anInt5227;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "I")
	public final int anInt5225;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "[I")
	public final int[] anIntArray583;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "[I")
	public final int[] anIntArray584;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "[I")
	public final int[] anIntArray581;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "[I")
	public final int[] anIntArray580;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "[I")
	public final int[] anIntArray579;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "[I")
	public final int[] anIntArray586;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
	public final int[] anIntArray576;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "[I")
	public final int[] anIntArray575;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "[I")
	public final int[] anIntArray574;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "[I")
	public int[] anIntArray572;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public Class166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
			this.aBoolean353 = false;
		}
		this.anInt5224 = arg0;
		this.anInt5226 = arg1;
		this.anInt5227 = arg17;
		this.anInt5225 = arg18;
		@Pc(30) short local30 = 128;
		@Pc(34) int local34 = local30 / 2;
		@Pc(38) int local38 = local30 / 4;
		@Pc(44) int local44 = local30 * 3 / 4;
		@Pc(48) int[] local48 = Static7.anIntArrayArray43[arg0];
		@Pc(51) int local51 = local48.length;
		this.anIntArray583 = new int[local51];
		this.anIntArray584 = new int[local51];
		this.anIntArray581 = new int[local51];
		@Pc(66) int[] local66 = new int[local51];
		@Pc(69) int[] local69 = new int[local51];
		@Pc(73) int local73 = arg3 * local30;
		@Pc(77) int local77 = arg4 * local30;
		for (@Pc(79) int local79 = 0; local79 < local51; local79++) {
			@Pc(86) int local86 = local48[local79];
			if ((local86 & 0x1) == 0 && local86 <= 8) {
				local86 = (local86 - arg1 - arg1 - 1 & 0x7) + 1;
			}
			if (local86 > 8 && local86 <= 12) {
				local86 = (local86 - arg1 - 9 & 0x3) + 9;
			}
			if (local86 > 12 && local86 <= 16) {
				local86 = (local86 - arg1 - 13 & 0x3) + 13;
			}
			@Pc(142) int local142;
			@Pc(144) int local144;
			@Pc(146) int local146;
			@Pc(148) int local148;
			@Pc(150) int local150;
			if (local86 == 1) {
				local142 = local73;
				local144 = local77;
				local146 = arg5;
				local148 = arg9;
				local150 = arg13;
			} else if (local86 == 2) {
				local142 = local73 + local34;
				local144 = local77;
				local146 = arg5 + arg6 >> 1;
				local148 = arg9 + arg10 >> 1;
				local150 = arg13 + arg14 >> 1;
			} else if (local86 == 3) {
				local142 = local73 + local30;
				local144 = local77;
				local146 = arg6;
				local148 = arg10;
				local150 = arg14;
			} else if (local86 == 4) {
				local142 = local73 + local30;
				local144 = local77 + local34;
				local146 = arg6 + arg7 >> 1;
				local148 = arg10 + arg11 >> 1;
				local150 = arg14 + arg15 >> 1;
			} else if (local86 == 5) {
				local142 = local73 + local30;
				local144 = local77 + local30;
				local146 = arg7;
				local148 = arg11;
				local150 = arg15;
			} else if (local86 == 6) {
				local142 = local73 + local34;
				local144 = local77 + local30;
				local146 = arg7 + arg8 >> 1;
				local148 = arg11 + arg12 >> 1;
				local150 = arg15 + arg16 >> 1;
			} else if (local86 == 7) {
				local142 = local73;
				local144 = local77 + local30;
				local146 = arg8;
				local148 = arg12;
				local150 = arg16;
			} else if (local86 == 8) {
				local142 = local73;
				local144 = local77 + local34;
				local146 = arg8 + arg5 >> 1;
				local148 = arg12 + arg9 >> 1;
				local150 = arg16 + arg13 >> 1;
			} else if (local86 == 9) {
				local142 = local73 + local34;
				local144 = local77 + local38;
				local146 = arg5 + arg6 >> 1;
				local148 = arg9 + arg10 >> 1;
				local150 = arg13 + arg14 >> 1;
			} else if (local86 == 10) {
				local142 = local73 + local44;
				local144 = local77 + local34;
				local146 = arg6 + arg7 >> 1;
				local148 = arg10 + arg11 >> 1;
				local150 = arg14 + arg15 >> 1;
			} else if (local86 == 11) {
				local142 = local73 + local34;
				local144 = local77 + local44;
				local146 = arg7 + arg8 >> 1;
				local148 = arg11 + arg12 >> 1;
				local150 = arg15 + arg16 >> 1;
			} else if (local86 == 12) {
				local142 = local73 + local38;
				local144 = local77 + local34;
				local146 = arg8 + arg5 >> 1;
				local148 = arg12 + arg9 >> 1;
				local150 = arg16 + arg13 >> 1;
			} else if (local86 == 13) {
				local142 = local73 + local38;
				local144 = local77 + local38;
				local146 = arg5;
				local148 = arg9;
				local150 = arg13;
			} else if (local86 == 14) {
				local142 = local73 + local44;
				local144 = local77 + local38;
				local146 = arg6;
				local148 = arg10;
				local150 = arg14;
			} else if (local86 == 15) {
				local142 = local73 + local44;
				local144 = local77 + local44;
				local146 = arg7;
				local148 = arg11;
				local150 = arg15;
			} else {
				local142 = local73 + local38;
				local144 = local77 + local44;
				local146 = arg8;
				local148 = arg12;
				local150 = arg16;
			}
			this.anIntArray583[local79] = local142;
			this.anIntArray584[local79] = local146;
			this.anIntArray581[local79] = local144;
			local66[local79] = local148;
			local69[local79] = local150;
		}
		@Pc(534) int[] local534 = Static7.anIntArrayArray44[arg0];
		@Pc(539) int local539 = local534.length / 4;
		this.anIntArray580 = new int[local539];
		this.anIntArray579 = new int[local539];
		this.anIntArray586 = new int[local539];
		this.anIntArray576 = new int[local539];
		this.anIntArray575 = new int[local539];
		this.anIntArray574 = new int[local539];
		if (arg2 != -1) {
			this.anIntArray572 = new int[local539];
		}
		@Pc(572) int local572 = 0;
		for (@Pc(574) int local574 = 0; local574 < local539; local574++) {
			@Pc(581) int local581 = local534[local572];
			@Pc(587) int local587 = local534[local572 + 1];
			@Pc(593) int local593 = local534[local572 + 2];
			@Pc(599) int local599 = local534[local572 + 3];
			local572 += 4;
			if (local587 < 4) {
				local587 = local587 - arg1 & 0x3;
			}
			if (local593 < 4) {
				local593 = local593 - arg1 & 0x3;
			}
			if (local599 < 4) {
				local599 = local599 - arg1 & 0x3;
			}
			this.anIntArray580[local574] = local587;
			this.anIntArray579[local574] = local593;
			this.anIntArray586[local574] = local599;
			if (local581 == 0) {
				this.anIntArray576[local574] = local66[local587];
				this.anIntArray575[local574] = local66[local593];
				this.anIntArray574[local574] = local66[local599];
				if (this.anIntArray572 != null) {
					this.anIntArray572[local574] = -1;
				}
			} else {
				this.anIntArray576[local574] = local69[local587];
				this.anIntArray575[local574] = local69[local593];
				this.anIntArray574[local574] = local69[local599];
				if (this.anIntArray572 != null) {
					this.anIntArray572[local574] = arg2;
				}
			}
		}
		@Pc(707) int local707 = arg5;
		@Pc(709) int local709 = arg6;
		if (arg6 < arg5) {
			local707 = arg6;
		}
		if (arg6 > arg6) {
			local709 = arg6;
		}
		if (arg7 < local707) {
			local707 = arg7;
		}
		if (arg7 > arg6) {
			local709 = arg7;
		}
		if (arg8 < local707) {
			;
		}
		if (arg8 > local709) {
			;
		}
	}
}

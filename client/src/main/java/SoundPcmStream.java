import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class SoundPcmStream extends PcmStream {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!pb;II)Lclient!pc;")
	public static SoundPcmStream create(@OriginalArg(0) PcmSound sound, @OriginalArg(2) int volume) {
		return sound.samples == null || sound.samples.length == 0 ? null : new SoundPcmStream(sound, (int) ((long) sound.rate * 256L * (long) 100 / (long) (Static7.sampleRate * 100)), volume << 6);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!pb;III)Lclient!pc;")
	public static SoundPcmStream create(@OriginalArg(0) PcmSound sound, @OriginalArg(1) int arg1, @OriginalArg(2) int volume, @OriginalArg(3) int pan) {
		return sound.samples == null || sound.samples.length == 0 ? null : new SoundPcmStream(sound, arg1, volume, pan);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I")
	private static int method3355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIIILclient!pc;II)I")
	private static int method3356(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) SoundPcmStream arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		@Pc(14) int local14;
		if (arg9 == 0 || (local14 = arg3 + (arg7 + arg9 + 256 - arg2) / arg9) > arg6) {
			local14 = arg6;
		}
		@Pc(22) int local22 = arg3 << 1;
		@Pc(26) int local26 = local14 << 1;
		while (local22 < local26) {
			@Pc(33) int local33 = arg2 >> 8;
			@Pc(39) byte local39 = arg0[local33 - 1];
			@Pc(53) int local53 = (local39 << 8) + (arg0[local33] - local39) * (arg2 & 0xFF);
			@Pc(55) int local55 = local22;
			arg3 = local22 + 1;
			arg1[local55] += local53 * arg4 >> 6;
			local55 = arg3;
			local22 = arg3 + 1;
			arg1[local55] += local53 * arg5 >> 6;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local26 = (local22 >> 1) + (arg7 + arg9 - arg2) / arg9) > arg6) {
			local26 = arg6;
		}
		@Pc(105) int local105 = local26 << 1;
		while (local22 < local105) {
			@Pc(126) int local126 = (arg10 << 8) + (arg0[arg2 >> 8] - arg10) * (arg2 & 0xFF);
			@Pc(128) int local128 = local22;
			arg3 = local22 + 1;
			arg1[local128] += local126 * arg4 >> 6;
			local128 = arg3;
			local22 = arg3 + 1;
			arg1[local128] += local126 * arg5 >> 6;
			arg2 += arg9;
		}
		arg8.anInt4100 = arg2;
		return local22 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIIILclient!pc;II)I")
	private static int method3357(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) SoundPcmStream arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		@Pc(14) int local14;
		if (arg9 == 0 || (local14 = arg3 + (arg7 + arg9 - arg2 - 257) / arg9) > arg6) {
			local14 = arg6;
		}
		@Pc(22) int local22 = arg3 << 1;
		@Pc(26) int local26 = local14 << 1;
		while (local22 < local26) {
			@Pc(33) int local33 = arg2 >> 8;
			@Pc(37) byte local37 = arg0[local33];
			@Pc(53) int local53 = (local37 << 8) + (arg0[local33 + 1] - local37) * (arg2 & 0xFF);
			@Pc(55) int local55 = local22;
			arg3 = local22 + 1;
			arg1[local55] += local53 * arg4 >> 6;
			local55 = arg3;
			local22 = arg3 + 1;
			arg1[local55] += local53 * arg5 >> 6;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local26 = (local22 >> 1) + (arg7 + arg9 - arg2 - 1) / arg9) > arg6) {
			local26 = arg6;
		}
		@Pc(107) int local107 = local26 << 1;
		while (local22 < local107) {
			@Pc(118) byte local118 = arg0[arg2 >> 8];
			@Pc(130) int local130 = (local118 << 8) + (arg10 - local118) * (arg2 & 0xFF);
			@Pc(132) int local132 = local22;
			arg3 = local22 + 1;
			arg1[local132] += local130 * arg4 >> 6;
			local132 = arg3;
			local22 = arg3 + 1;
			arg1[local132] += local130 * arg5 >> 6;
			arg2 += arg9;
		}
		arg8.anInt4100 = arg2;
		return local22 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([B[IIIIIIILclient!pc;)I")
	private static int method3361(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) SoundPcmStream arg7) {
		@Pc(3) int local3 = arg2 >> 8;
		arg6 >>= 8;
		arg4 <<= 2;
		@Pc(18) int local18;
		if ((local18 = arg3 + arg6 - local3) > arg5) {
			local18 = arg5;
		}
		@Pc(23) int local23 = local18 - 3;
		while (arg3 < local23) {
			@Pc(29) int local29 = arg3 + 1;
			@Pc(31) int local31 = arg1[arg3];
			arg2 = local3 + 1;
			arg1[arg3] = local31 + arg0[local3] * arg4;
			@Pc(41) int local41 = local29++;
			arg1[local41] += arg0[arg2++] * arg4;
			local41 = local29++;
			arg1[local41] += arg0[arg2++] * arg4;
			arg3 = local29 + 1;
			local31 = arg1[local29];
			local3 = arg2 + 1;
			arg1[local29] = local31 + arg0[arg2] * arg4;
		}
		@Pc(80) int local80 = local23 + 3;
		while (arg3 < local80) {
			@Pc(85) int local85 = arg3++;
			arg1[local85] += arg0[local3++] * arg4;
		}
		arg7.anInt4100 = local3 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B[IIIIIIIIIILclient!pc;)I")
	private static int method3362(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) SoundPcmStream arg10) {
		@Pc(3) int local3 = arg2 >> 8;
		arg9 >>= 8;
		@Pc(11) int local11 = arg4 << 2;
		@Pc(15) int local15 = arg5 << 2;
		arg6 <<= 2;
		arg7 <<= 2;
		@Pc(30) int local30;
		if ((local30 = arg3 + arg9 - local3) > arg8) {
			local30 = arg8;
		}
		arg10.anInt4096 += arg10.anInt4097 * (local30 - arg3);
		@Pc(49) int local49 = arg3 << 1;
		@Pc(53) int local53 = local30 << 1;
		local53 -= 6;
		while (local49 < local53) {
			arg2 = local3 + 1;
			@Pc(62) byte local62 = arg0[local3];
			arg3 = local49 + 1;
			arg1[local49] += local62 * local11;
			arg4 = local11 + arg6;
			@Pc(78) int local78 = arg3++;
			arg1[local78] += local62 * local15;
			arg5 = local15 + arg7;
			local62 = arg0[arg2++];
			local78 = arg3++;
			arg1[local78] += local62 * arg4;
			arg4 += arg6;
			local78 = arg3++;
			arg1[local78] += local62 * arg5;
			arg5 += arg7;
			local62 = arg0[arg2++];
			local78 = arg3++;
			arg1[local78] += local62 * arg4;
			arg4 += arg6;
			local78 = arg3++;
			arg1[local78] += local62 * arg5;
			arg5 += arg7;
			local3 = arg2 + 1;
			local62 = arg0[arg2];
			local78 = arg3++;
			arg1[local78] += local62 * arg4;
			local11 = arg4 + arg6;
			local49 = arg3 + 1;
			arg1[arg3] += local62 * arg5;
			local15 = arg5 + arg7;
		}
		@Pc(191) int local191 = local53 + 6;
		while (local49 < local191) {
			@Pc(199) byte local199 = arg0[local3++];
			arg3 = local49 + 1;
			arg1[local49] += local199 * local11;
			local11 += arg6;
			local49 = arg3 + 1;
			arg1[arg3] += local199 * local15;
			local15 += arg7;
		}
		arg10.anInt4104 = local11 >> 2;
		arg10.anInt4098 = local15 >> 2;
		arg10.anInt4100 = local3 << 8;
		return local49 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II[B[IIIIIIIILclient!pc;II)I")
	private static int method3363(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) SoundPcmStream arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		arg8.anInt4104 -= arg8.anInt4102 * arg3;
		arg8.anInt4098 -= arg8.anInt4099 * arg3;
		@Pc(32) int local32;
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 - arg2 - 257) / arg9) > arg6) {
			local32 = arg6;
		}
		while (arg3 < local32) {
			@Pc(43) int local43 = arg2 >> 8;
			@Pc(47) byte local47 = arg0[local43];
			@Pc(49) int local49 = arg3++;
			arg1[local49] += ((local47 << 8) + (arg0[local43 + 1] - local47) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 - arg2 - 1) / arg9) > arg6) {
			local32 = arg6;
		}
		while (arg3 < local32) {
			@Pc(112) byte local112 = arg0[arg2 >> 8];
			@Pc(114) int local114 = arg3++;
			arg1[local114] += ((local112 << 8) + (arg10 - local112) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		arg8.anInt4104 += arg8.anInt4102 * arg3;
		arg8.anInt4098 += arg8.anInt4099 * arg3;
		arg8.anInt4096 = arg4;
		arg8.anInt4100 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIIIIILclient!pc;II)I")
	private static int method3366(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) SoundPcmStream arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		arg10.anInt4096 -= arg10.anInt4097 * arg3;
		@Pc(23) int local23;
		if (arg11 == 0 || (local23 = arg3 + (arg9 + arg11 - arg2 - 257) / arg11) > arg8) {
			local23 = arg8;
		}
		@Pc(31) int local31 = arg3 << 1;
		@Pc(35) int local35 = local23 << 1;
		while (local31 < local35) {
			@Pc(42) int local42 = arg2 >> 8;
			@Pc(46) byte local46 = arg0[local42];
			@Pc(62) int local62 = (local46 << 8) + (arg0[local42 + 1] - local46) * (arg2 & 0xFF);
			@Pc(64) int local64 = local31;
			arg3 = local31 + 1;
			arg1[local64] += local62 * arg4 >> 6;
			arg4 += arg6;
			local64 = arg3;
			local31 = arg3 + 1;
			arg1[local64] += local62 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		if (arg11 == 0 || (local35 = (local31 >> 1) + (arg9 + arg11 - arg2 - 1) / arg11) > arg8) {
			local35 = arg8;
		}
		@Pc(124) int local124 = local35 << 1;
		while (local31 < local124) {
			@Pc(135) byte local135 = arg0[arg2 >> 8];
			@Pc(147) int local147 = (local135 << 8) + (arg12 - local135) * (arg2 & 0xFF);
			@Pc(149) int local149 = local31;
			arg3 = local31 + 1;
			arg1[local149] += local147 * arg4 >> 6;
			arg4 += arg6;
			local149 = arg3;
			local31 = arg3 + 1;
			arg1[local149] += local147 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		arg3 = local31 >> 1;
		arg10.anInt4096 += arg10.anInt4097 * arg3;
		arg10.anInt4104 = arg4;
		arg10.anInt4098 = arg5;
		arg10.anInt4100 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIIIIILclient!pc;II)I")
	private static int method3370(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) SoundPcmStream arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		arg10.anInt4096 -= arg10.anInt4097 * arg3;
		@Pc(23) int local23;
		if (arg11 == 0 || (local23 = arg3 + (arg9 + arg11 + 256 - arg2) / arg11) > arg8) {
			local23 = arg8;
		}
		@Pc(31) int local31 = arg3 << 1;
		@Pc(35) int local35 = local23 << 1;
		while (local31 < local35) {
			@Pc(42) int local42 = arg2 >> 8;
			@Pc(48) byte local48 = arg0[local42 - 1];
			@Pc(62) int local62 = (local48 << 8) + (arg0[local42] - local48) * (arg2 & 0xFF);
			@Pc(64) int local64 = local31;
			arg3 = local31 + 1;
			arg1[local64] += local62 * arg4 >> 6;
			arg4 += arg6;
			local64 = arg3;
			local31 = arg3 + 1;
			arg1[local64] += local62 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		if (arg11 == 0 || (local35 = (local31 >> 1) + (arg9 + arg11 - arg2) / arg11) > arg8) {
			local35 = arg8;
		}
		@Pc(122) int local122 = local35 << 1;
		while (local31 < local122) {
			@Pc(143) int local143 = (arg12 << 8) + (arg0[arg2 >> 8] - arg12) * (arg2 & 0xFF);
			@Pc(145) int local145 = local31;
			arg3 = local31 + 1;
			arg1[local145] += local143 * arg4 >> 6;
			arg4 += arg6;
			local145 = arg3;
			local31 = arg3 + 1;
			arg1[local145] += local143 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		arg3 = local31 >> 1;
		arg10.anInt4096 += arg10.anInt4097 * arg3;
		arg10.anInt4104 = arg4;
		arg10.anInt4098 = arg5;
		arg10.anInt4100 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIILclient!pc;II)I")
	private static int method3373(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) SoundPcmStream arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(14) int local14;
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2 - 257) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			@Pc(25) int local25 = arg2 >> 8;
			@Pc(29) byte local29 = arg0[local25];
			@Pc(31) int local31 = arg3++;
			arg1[local31] += ((local29 << 8) + (arg0[local25 + 1] - local29) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2 - 1) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			@Pc(90) byte local90 = arg0[arg2 >> 8];
			@Pc(92) int local92 = arg3++;
			arg1[local92] += ((local90 << 8) + (arg9 - local90) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		arg7.anInt4100 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)I")
	private static int method3374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B[IIIIIIIILclient!pc;)I")
	private static int method3375(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) SoundPcmStream arg8) {
		@Pc(3) int local3 = arg2 >> 8;
		arg7 >>= 8;
		arg4 <<= 2;
		arg5 <<= 2;
		@Pc(22) int local22;
		if ((local22 = arg3 + arg7 - local3) > arg6) {
			local22 = arg6;
		}
		@Pc(30) int local30 = arg3 << 1;
		@Pc(34) int local34 = local22 << 1;
		local34 -= 6;
		while (local30 < local34) {
			arg2 = local3 + 1;
			@Pc(43) byte local43 = arg0[local3];
			arg3 = local30 + 1;
			arg1[local30] += local43 * arg4;
			@Pc(55) int local55 = arg3++;
			arg1[local55] += local43 * arg5;
			local43 = arg0[arg2++];
			local55 = arg3++;
			arg1[local55] += local43 * arg4;
			local55 = arg3++;
			arg1[local55] += local43 * arg5;
			local43 = arg0[arg2++];
			local55 = arg3++;
			arg1[local55] += local43 * arg4;
			local55 = arg3++;
			arg1[local55] += local43 * arg5;
			local3 = arg2 + 1;
			local43 = arg0[arg2];
			local55 = arg3++;
			arg1[local55] += local43 * arg4;
			local30 = arg3 + 1;
			arg1[arg3] += local43 * arg5;
		}
		@Pc(140) int local140 = local34 + 6;
		while (local30 < local140) {
			@Pc(148) byte local148 = arg0[local3++];
			arg3 = local30 + 1;
			arg1[local30] += local148 * arg4;
			local30 = arg3 + 1;
			arg1[arg3] += local148 * arg5;
		}
		arg8.anInt4100 = local3 << 8;
		return local30 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I[B[IIIIIIIIIILclient!pc;)I")
	private static int method3376(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) SoundPcmStream arg10) {
		@Pc(3) int local3 = arg2 >> 8;
		arg9 >>= 8;
		@Pc(11) int local11 = arg4 << 2;
		@Pc(15) int local15 = arg5 << 2;
		arg6 <<= 2;
		arg7 <<= 2;
		@Pc(32) int local32;
		if ((local32 = arg3 + local3 + 1 - arg9) > arg8) {
			local32 = arg8;
		}
		arg10.anInt4096 += arg10.anInt4097 * (local32 - arg3);
		@Pc(51) int local51 = arg3 << 1;
		@Pc(55) int local55 = local32 << 1;
		local55 -= 6;
		while (local51 < local55) {
			arg2 = local3 - 1;
			@Pc(64) byte local64 = arg0[local3];
			arg3 = local51 + 1;
			arg1[local51] += local64 * local11;
			arg4 = local11 + arg6;
			@Pc(80) int local80 = arg3++;
			arg1[local80] += local64 * local15;
			arg5 = local15 + arg7;
			local64 = arg0[arg2--];
			local80 = arg3++;
			arg1[local80] += local64 * arg4;
			arg4 += arg6;
			local80 = arg3++;
			arg1[local80] += local64 * arg5;
			arg5 += arg7;
			local64 = arg0[arg2--];
			local80 = arg3++;
			arg1[local80] += local64 * arg4;
			arg4 += arg6;
			local80 = arg3++;
			arg1[local80] += local64 * arg5;
			arg5 += arg7;
			local3 = arg2 - 1;
			local64 = arg0[arg2];
			local80 = arg3++;
			arg1[local80] += local64 * arg4;
			local11 = arg4 + arg6;
			local51 = arg3 + 1;
			arg1[arg3] += local64 * arg5;
			local15 = arg5 + arg7;
		}
		@Pc(193) int local193 = local55 + 6;
		while (local51 < local193) {
			@Pc(201) byte local201 = arg0[local3--];
			arg3 = local51 + 1;
			arg1[local51] += local201 * local11;
			local11 += arg6;
			local51 = arg3 + 1;
			arg1[arg3] += local201 * local15;
			local15 += arg7;
		}
		arg10.anInt4104 = local11 >> 2;
		arg10.anInt4098 = local15 >> 2;
		arg10.anInt4100 = local3 << 8;
		return local51 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([B[IIIIIIIILclient!pc;)I")
	private static int method3378(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) SoundPcmStream arg8) {
		@Pc(3) int local3 = arg2 >> 8;
		arg7 >>= 8;
		@Pc(11) int local11 = arg4 << 2;
		arg5 <<= 2;
		@Pc(22) int local22;
		if ((local22 = arg3 + arg7 - local3) > arg6) {
			local22 = arg6;
		}
		arg8.anInt4104 += arg8.anInt4102 * (local22 - arg3);
		arg8.anInt4098 += arg8.anInt4099 * (local22 - arg3);
		@Pc(49) int local49 = local22 - 3;
		while (arg3 < local49) {
			@Pc(55) int local55 = arg3 + 1;
			@Pc(57) int local57 = arg1[arg3];
			arg2 = local3 + 1;
			arg1[arg3] = local57 + arg0[local3] * local11;
			arg4 = local11 + arg5;
			@Pc(71) int local71 = local55++;
			arg1[local71] += arg0[arg2++] * arg4;
			arg4 += arg5;
			local71 = local55++;
			arg1[local71] += arg0[arg2++] * arg4;
			arg4 += arg5;
			arg3 = local55 + 1;
			local57 = arg1[local55];
			local3 = arg2 + 1;
			arg1[local55] = local57 + arg0[arg2] * arg4;
			local11 = arg4 + arg5;
		}
		@Pc(122) int local122 = local49 + 3;
		while (arg3 < local122) {
			@Pc(127) int local127 = arg3++;
			arg1[local127] += arg0[local3++] * local11;
			local11 += arg5;
		}
		arg8.anInt4096 = local11 >> 2;
		arg8.anInt4100 = local3 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([B[IIIIIIILclient!pc;)I")
	private static int method3380(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) SoundPcmStream arg7) {
		@Pc(3) int local3 = arg2 >> 8;
		arg6 >>= 8;
		arg4 <<= 2;
		@Pc(20) int local20;
		if ((local20 = arg3 + local3 + 1 - arg6) > arg5) {
			local20 = arg5;
		}
		@Pc(25) int local25 = local20 - 3;
		while (arg3 < local25) {
			@Pc(31) int local31 = arg3 + 1;
			@Pc(33) int local33 = arg1[arg3];
			arg2 = local3 - 1;
			arg1[arg3] = local33 + arg0[local3] * arg4;
			@Pc(43) int local43 = local31++;
			arg1[local43] += arg0[arg2--] * arg4;
			local43 = local31++;
			arg1[local43] += arg0[arg2--] * arg4;
			arg3 = local31 + 1;
			local33 = arg1[local31];
			local3 = arg2 - 1;
			arg1[local31] = local33 + arg0[arg2] * arg4;
		}
		@Pc(82) int local82 = local25 + 3;
		while (arg3 < local82) {
			@Pc(87) int local87 = arg3++;
			arg1[local87] += arg0[local3--] * arg4;
		}
		arg7.anInt4100 = local3 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I[B[IIIIIIIILclient!pc;)I")
	private static int method3387(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) SoundPcmStream arg8) {
		@Pc(3) int local3 = arg2 >> 8;
		arg7 >>= 8;
		arg4 <<= 2;
		arg5 <<= 2;
		@Pc(24) int local24;
		if ((local24 = arg3 + local3 + 1 - arg7) > arg6) {
			local24 = arg6;
		}
		@Pc(32) int local32 = arg3 << 1;
		@Pc(36) int local36 = local24 << 1;
		local36 -= 6;
		while (local32 < local36) {
			arg2 = local3 - 1;
			@Pc(45) byte local45 = arg0[local3];
			arg3 = local32 + 1;
			arg1[local32] += local45 * arg4;
			@Pc(57) int local57 = arg3++;
			arg1[local57] += local45 * arg5;
			local45 = arg0[arg2--];
			local57 = arg3++;
			arg1[local57] += local45 * arg4;
			local57 = arg3++;
			arg1[local57] += local45 * arg5;
			local45 = arg0[arg2--];
			local57 = arg3++;
			arg1[local57] += local45 * arg4;
			local57 = arg3++;
			arg1[local57] += local45 * arg5;
			local3 = arg2 - 1;
			local45 = arg0[arg2];
			local57 = arg3++;
			arg1[local57] += local45 * arg4;
			local32 = arg3 + 1;
			arg1[arg3] += local45 * arg5;
		}
		@Pc(142) int local142 = local36 + 6;
		while (local32 < local142) {
			@Pc(150) byte local150 = arg0[local3--];
			arg3 = local32 + 1;
			arg1[local32] += local150 * arg4;
			local32 = arg3 + 1;
			arg1[arg3] += local150 * arg5;
		}
		arg8.anInt4100 = local3 << 8;
		return local32 >> 1;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([B[IIIIIIIILclient!pc;)I")
	private static int method3389(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) SoundPcmStream arg8) {
		@Pc(3) int local3 = arg2 >> 8;
		arg7 >>= 8;
		@Pc(11) int local11 = arg4 << 2;
		arg5 <<= 2;
		@Pc(24) int local24;
		if ((local24 = arg3 + local3 + 1 - arg7) > arg6) {
			local24 = arg6;
		}
		arg8.anInt4104 += arg8.anInt4102 * (local24 - arg3);
		arg8.anInt4098 += arg8.anInt4099 * (local24 - arg3);
		@Pc(51) int local51 = local24 - 3;
		while (arg3 < local51) {
			@Pc(57) int local57 = arg3 + 1;
			@Pc(59) int local59 = arg1[arg3];
			arg2 = local3 - 1;
			arg1[arg3] = local59 + arg0[local3] * local11;
			arg4 = local11 + arg5;
			@Pc(73) int local73 = local57++;
			arg1[local73] += arg0[arg2--] * arg4;
			arg4 += arg5;
			local73 = local57++;
			arg1[local73] += arg0[arg2--] * arg4;
			arg4 += arg5;
			arg3 = local57 + 1;
			local59 = arg1[local57];
			local3 = arg2 - 1;
			arg1[local57] = local59 + arg0[arg2] * arg4;
			local11 = arg4 + arg5;
		}
		@Pc(124) int local124 = local51 + 3;
		while (arg3 < local124) {
			@Pc(129) int local129 = arg3++;
			arg1[local129] += arg0[local3--] * local11;
			local11 += arg5;
		}
		arg8.anInt4096 = local11 >> 2;
		arg8.anInt4100 = local3 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(II[B[IIIIIIIILclient!pc;II)I")
	private static int method3390(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) SoundPcmStream arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		arg8.anInt4104 -= arg8.anInt4102 * arg3;
		arg8.anInt4098 -= arg8.anInt4099 * arg3;
		@Pc(32) int local32;
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 + 256 - arg2) / arg9) > arg6) {
			local32 = arg6;
		}
		while (arg3 < local32) {
			@Pc(43) int local43 = arg2 >> 8;
			@Pc(49) byte local49 = arg0[local43 - 1];
			@Pc(51) int local51 = arg3++;
			arg1[local51] += ((local49 << 8) + (arg0[local43] - local49) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local32 = arg3 + (arg7 + arg9 - arg2) / arg9) > arg6) {
			local32 = arg6;
		}
		while (arg3 < local32) {
			@Pc(108) int local108 = arg3++;
			arg1[local108] += ((arg10 << 8) + (arg0[arg2 >> 8] - arg10) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		arg8.anInt4104 += arg8.anInt4102 * arg3;
		arg8.anInt4098 += arg8.anInt4099 * arg3;
		arg8.anInt4096 = arg4;
		arg8.anInt4100 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIILclient!pc;II)I")
	private static int method3391(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) SoundPcmStream arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(14) int local14;
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 + 256 - arg2) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			@Pc(25) int local25 = arg2 >> 8;
			@Pc(31) byte local31 = arg0[local25 - 1];
			@Pc(33) int local33 = arg3++;
			arg1[local33] += ((local31 << 8) + (arg0[local25] - local31) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			@Pc(86) int local86 = arg3++;
			arg1[local86] += ((arg9 << 8) + (arg0[arg2 >> 8] - arg9) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		arg7.anInt4100 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
	private int anInt4096;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
	private int anInt4097;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
	private int anInt4098;

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
	private int anInt4099;

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
	private int anInt4102;

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
	private int anInt4104;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
	private int anInt4105;

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
	private int anInt4108;

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
	private final int start;

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
	private final int end;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "Z")
	private final boolean aBoolean290;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
	private int anInt4095;

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
	private int volume;

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
	private int pan;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
	private int anInt4100;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!pb;II)V")
	private SoundPcmStream(@OriginalArg(0) PcmSound sound, @OriginalArg(1) int arg1, @OriginalArg(2) int volume) {
		this.sound = sound;
		this.start = sound.start;
		this.end = sound.end;
		this.aBoolean290 = sound.aBoolean288;
		this.anInt4095 = arg1;
		this.volume = volume;
		this.pan = 8192;
		this.anInt4100 = 0;
		this.method3371();
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!pb;III)V")
	private SoundPcmStream(@OriginalArg(0) PcmSound sound, @OriginalArg(1) int arg1, @OriginalArg(2) int volume, @OriginalArg(3) int pan) {
		this.sound = sound;
		this.start = sound.start;
		this.end = sound.end;
		this.aBoolean290 = sound.aBoolean288;
		this.anInt4095 = arg1;
		this.volume = volume;
		this.pan = pan;
		this.anInt4100 = 0;
		this.method3371();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	public final synchronized void method3352(@OriginalArg(0) int arg0, @OriginalArg(1) int volume, @OriginalArg(2) int pan) {
		if (arg0 == 0) {
			this.method3386(volume, pan);
			return;
		}
		@Pc(10) int local10 = method3374(volume, pan);
		@Pc(14) int local14 = method3355(volume, pan);
		if (this.anInt4104 == local10 && this.anInt4098 == local14) {
			this.anInt4105 = 0;
			return;
		}
		@Pc(31) int local31 = volume - this.anInt4096;
		if (this.anInt4096 - volume > local31) {
			local31 = this.anInt4096 - volume;
		}
		if (local10 - this.anInt4104 > local31) {
			local31 = local10 - this.anInt4104;
		}
		if (this.anInt4104 - local10 > local31) {
			local31 = this.anInt4104 - local10;
		}
		if (local14 - this.anInt4098 > local31) {
			local31 = local14 - this.anInt4098;
		}
		if (this.anInt4098 - local14 > local31) {
			local31 = this.anInt4098 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4105 = arg0;
		this.volume = volume;
		this.pan = pan;
		this.anInt4097 = (volume - this.anInt4096) / arg0;
		this.anInt4102 = (local10 - this.anInt4104) / arg0;
		this.anInt4099 = (local14 - this.anInt4098) / arg0;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	public final synchronized void method3353(@OriginalArg(0) int arg0) {
		if (this.anInt4095 < 0) {
			this.anInt4095 = -arg0;
		} else {
			this.anInt4095 = arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "()I")
	@Override
	public final int method3347() {
		@Pc(6) int local6 = this.anInt4096 * 3 >> 6;
		@Pc(16) int local16 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4108 == 0) {
			local16 -= local16 * this.anInt4100 / (((PcmSound) this.sound).samples.length << 8);
		} else if (this.anInt4108 >= 0) {
			local16 -= local16 * this.start / ((PcmSound) this.sound).samples.length;
		}
		return local16 > 255 ? 255 : local16;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "()V")
	private void method3354() {
		if (this.anInt4105 == 0) {
			return;
		}
		if (this.volume == Integer.MIN_VALUE) {
			this.volume = 0;
		}
		this.anInt4105 = 0;
		this.method3371();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([IIIII)I")
	private int method3358(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt4105 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt4105;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt4105 += arg1;
				if (this.anInt4095 == -256 && (this.anInt4100 & 0xFF) == 0) {
					if (AudioChannel.stereo) {
						arg1 = method3376(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, this.anInt4102, this.anInt4099, local7, arg2, this);
					} else {
						arg1 = method3389(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4096, this.anInt4097, local7, arg2, this);
					}
				} else if (AudioChannel.stereo) {
					arg1 = method3370(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, this.anInt4102, this.anInt4099, local7, arg2, this, this.anInt4095, arg4);
				} else {
					arg1 = method3390(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4096, this.anInt4097, local7, arg2, this, this.anInt4095, arg4);
				}
				this.anInt4105 -= arg1;
				if (this.anInt4105 != 0) {
					return arg1;
				}
				if (!this.method3367()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt4095 == -256 && (this.anInt4100 & 0xFF) == 0) {
				if (AudioChannel.stereo) {
					return method3387(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, arg3, arg2, this);
				}
				return method3380(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4096, arg3, arg2, this);
			}
			if (AudioChannel.stereo) {
				return method3356(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, arg3, arg2, this, this.anInt4095, arg4);
			}
			return method3391(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4096, arg3, arg2, this, this.anInt4095, arg4);
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	public final synchronized void method3359(@OriginalArg(0) int arg0) {
		this.anInt4108 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
	public final synchronized void method3360(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3382();
			this.unlink();
		} else if (this.anInt4104 == 0 && this.anInt4098 == 0) {
			this.anInt4105 = 0;
			this.volume = 0;
			this.anInt4096 = 0;
			this.unlink();
		} else {
			@Pc(31) int local31 = -this.anInt4096;
			if (this.anInt4096 > local31) {
				local31 = this.anInt4096;
			}
			if (-this.anInt4104 > local31) {
				local31 = -this.anInt4104;
			}
			if (this.anInt4104 > local31) {
				local31 = this.anInt4104;
			}
			if (-this.anInt4098 > local31) {
				local31 = -this.anInt4098;
			}
			if (this.anInt4098 > local31) {
				local31 = this.anInt4098;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4105 = arg0;
			this.volume = Integer.MIN_VALUE;
			this.anInt4097 = -this.anInt4096 / arg0;
			this.anInt4102 = -this.anInt4104 / arg0;
			this.anInt4099 = -this.anInt4098 / arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	@Override
	public final synchronized void skip(@OriginalArg(0) int len) {
		if (this.anInt4105 > 0) {
			if (len >= this.anInt4105) {
				if (this.volume == Integer.MIN_VALUE) {
					this.volume = 0;
					this.anInt4096 = this.anInt4104 = this.anInt4098 = 0;
					this.unlink();
					len = this.anInt4105;
				}
				this.anInt4105 = 0;
				this.method3371();
			} else {
				this.anInt4096 += this.anInt4097 * len;
				this.anInt4104 += this.anInt4102 * len;
				this.anInt4098 += this.anInt4099 * len;
				this.anInt4105 -= len;
			}
		}
		@Pc(71) PcmSound local71 = (PcmSound) this.sound;
		@Pc(76) int local76 = this.start << 8;
		@Pc(81) int local81 = this.end << 8;
		@Pc(87) int local87 = local71.samples.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4108 = 0;
		}
		if (this.anInt4100 < 0) {
			if (this.anInt4095 <= 0) {
				this.method3354();
				this.unlink();
				return;
			}
			this.anInt4100 = 0;
		}
		if (this.anInt4100 >= local87) {
			if (this.anInt4095 >= 0) {
				this.method3354();
				this.unlink();
				return;
			}
			this.anInt4100 = local87 - 1;
		}
		this.anInt4100 += this.anInt4095 * len;
		if (this.anInt4108 >= 0) {
			if (this.anInt4108 > 0) {
				if (this.aBoolean290) {
					label121:
					{
						if (this.anInt4095 < 0) {
							if (this.anInt4100 >= local76) {
								return;
							}
							this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
							if (--this.anInt4108 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt4100 < local81) {
								return;
							}
							this.anInt4100 = local81 + local81 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
							if (--this.anInt4108 == 0) {
								break;
							}
							if (this.anInt4100 >= local76) {
								return;
							}
							this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
						} while (--this.anInt4108 != 0);
					}
				} else {
					label153:
					{
						if (this.anInt4095 < 0) {
							if (this.anInt4100 >= local76) {
								return;
							}
							@Pc(362) int local362 = (local81 - this.anInt4100 - 1) / local91;
							if (local362 >= this.anInt4108) {
								this.anInt4100 += local91 * this.anInt4108;
								this.anInt4108 = 0;
								break label153;
							}
							this.anInt4100 += local91 * local362;
							this.anInt4108 -= local362;
						} else if (this.anInt4100 >= local81) {
							@Pc(406) int local406 = (this.anInt4100 - local76) / local91;
							if (local406 >= this.anInt4108) {
								this.anInt4100 -= local91 * this.anInt4108;
								this.anInt4108 = 0;
								break label153;
							}
							this.anInt4100 -= local91 * local406;
							this.anInt4108 -= local406;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt4095 < 0) {
				if (this.anInt4100 < 0) {
					this.anInt4100 = -1;
					this.method3354();
					this.unlink();
				}
			} else if (this.anInt4100 >= local87) {
				this.anInt4100 = local87;
				this.method3354();
				this.unlink();
			}
		} else if (this.aBoolean290) {
			if (this.anInt4095 < 0) {
				if (this.anInt4100 >= local76) {
					return;
				}
				this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
			}
			while (this.anInt4100 >= local81) {
				this.anInt4100 = local81 + local81 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
				if (this.anInt4100 >= local76) {
					return;
				}
				this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
			}
		} else if (this.anInt4095 < 0) {
			if (this.anInt4100 >= local76) {
				return;
			}
			this.anInt4100 = local81 - (local81 - this.anInt4100 - 1) % local91 - 1;
		} else if (this.anInt4100 >= local81) {
			this.anInt4100 = local76 + (this.anInt4100 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	public final synchronized void method3364() {
		this.anInt4095 = (this.anInt4095 ^ this.anInt4095 >> 31) + (this.anInt4095 >>> 31);
		this.anInt4095 = -this.anInt4095;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "()Z")
	public final boolean method3365() {
		return this.anInt4100 < 0 || this.anInt4100 >= ((PcmSound) this.sound).samples.length << 8;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()Lclient!tf;")
	@Override
	public final PcmStream nextSubStream() {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "()Z")
	private boolean method3367() {
		@Pc(2) int local2 = this.volume;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = method3374(local2, this.pan);
			local8 = method3355(local2, this.pan);
		}
		if (this.anInt4096 != local2 || this.anInt4104 != local10 || this.anInt4098 != local8) {
			if (this.anInt4096 < local2) {
				this.anInt4097 = 1;
				this.anInt4105 = local2 - this.anInt4096;
			} else if (this.anInt4096 > local2) {
				this.anInt4097 = -1;
				this.anInt4105 = this.anInt4096 - local2;
			} else {
				this.anInt4097 = 0;
			}
			if (this.anInt4104 < local10) {
				this.anInt4102 = 1;
				if (this.anInt4105 == 0 || this.anInt4105 > local10 - this.anInt4104) {
					this.anInt4105 = local10 - this.anInt4104;
				}
			} else if (this.anInt4104 > local10) {
				this.anInt4102 = -1;
				if (this.anInt4105 == 0 || this.anInt4105 > this.anInt4104 - local10) {
					this.anInt4105 = this.anInt4104 - local10;
				}
			} else {
				this.anInt4102 = 0;
			}
			if (this.anInt4098 < local8) {
				this.anInt4099 = 1;
				if (this.anInt4105 == 0 || this.anInt4105 > local8 - this.anInt4098) {
					this.anInt4105 = local8 - this.anInt4098;
				}
			} else if (this.anInt4098 > local8) {
				this.anInt4099 = -1;
				if (this.anInt4105 == 0 || this.anInt4105 > this.anInt4098 - local8) {
					this.anInt4105 = this.anInt4098 - local8;
				}
			} else {
				this.anInt4099 = 0;
			}
			return false;
		} else if (this.volume == Integer.MIN_VALUE) {
			this.volume = 0;
			this.anInt4096 = this.anInt4104 = this.anInt4098 = 0;
			this.unlink();
			return true;
		} else {
			this.method3371();
			return false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "()I")
	public final synchronized int method3368() {
		return this.anInt4095 < 0 ? -this.anInt4095 : this.anInt4095;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	public final synchronized void method3369(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((PcmSound) this.sound).samples.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4100 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "()V")
	private void method3371() {
		this.anInt4096 = this.volume;
		this.anInt4104 = method3374(this.volume, this.pan);
		this.anInt4098 = method3355(this.volume, this.pan);
	}

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "()Z")
	public final boolean method3372() {
		return this.anInt4105 != 0;
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
	public final synchronized void setVolume(@OriginalArg(0) int volume) {
		this.method3386(volume << 6, this.getPan());
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V")
	public final synchronized void method3379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3352(arg0, arg1, this.getPan());
	}

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "()I")
	public final synchronized int getVolume() {
		return this.volume == Integer.MIN_VALUE ? 0 : this.volume;
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V")
	private synchronized void method3382() {
		this.method3386(0, this.getPan());
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([IIIII)I")
	private int method3383(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt4105 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt4105;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt4105 += arg1;
				if (this.anInt4095 == 256 && (this.anInt4100 & 0xFF) == 0) {
					if (AudioChannel.stereo) {
						arg1 = method3362(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, this.anInt4102, this.anInt4099, local7, arg2, this);
					} else {
						arg1 = method3378(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4096, this.anInt4097, local7, arg2, this);
					}
				} else if (AudioChannel.stereo) {
					arg1 = method3366(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, this.anInt4102, this.anInt4099, local7, arg2, this, this.anInt4095, arg4);
				} else {
					arg1 = method3363(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4096, this.anInt4097, local7, arg2, this, this.anInt4095, arg4);
				}
				this.anInt4105 -= arg1;
				if (this.anInt4105 != 0) {
					return arg1;
				}
				if (!this.method3367()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt4095 == 256 && (this.anInt4100 & 0xFF) == 0) {
				if (AudioChannel.stereo) {
					return method3375(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, arg3, arg2, this);
				}
				return method3361(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4096, arg3, arg2, this);
			}
			if (AudioChannel.stereo) {
				return method3357(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, arg3, arg2, this, this.anInt4095, arg4);
			}
			return method3373(((PcmSound) this.sound).samples, arg0, this.anInt4100, arg1, this.anInt4096, arg3, arg2, this, this.anInt4095, arg4);
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)V")
	private synchronized void method3386(@OriginalArg(0) int volume, @OriginalArg(1) int pan) {
		this.volume = volume;
		this.pan = pan;
		this.anInt4105 = 0;
		this.method3371();
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public final PcmStream firstSubStream() {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "()I")
	public final synchronized int getPan() {
		return this.pan < 0 ? -1 : this.pan;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([III)V")
	@Override
	public final synchronized void read(@OriginalArg(0) int[] samples, @OriginalArg(1) int off, @OriginalArg(2) int len) {
		if (this.volume == 0 && this.anInt4105 == 0) {
			this.skip(len);
			return;
		}
		@Pc(13) PcmSound local13 = (PcmSound) this.sound;
		@Pc(18) int local18 = this.start << 8;
		@Pc(23) int local23 = this.end << 8;
		@Pc(29) int local29 = local13.samples.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4108 = 0;
		}
		@Pc(40) int local40 = off;
		len += off;
		if (this.anInt4100 < 0) {
			if (this.anInt4095 <= 0) {
				this.method3354();
				this.unlink();
				return;
			}
			this.anInt4100 = 0;
		}
		if (this.anInt4100 >= local29) {
			if (this.anInt4095 >= 0) {
				this.method3354();
				this.unlink();
				return;
			}
			this.anInt4100 = local29 - 1;
		}
		if (this.anInt4108 >= 0) {
			if (this.anInt4108 > 0) {
				if (this.aBoolean290) {
					label131:
					{
						if (this.anInt4095 < 0) {
							local40 = this.method3358(samples, off, local18, len, local13.samples[this.start]);
							if (this.anInt4100 >= local18) {
								return;
							}
							this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
							if (--this.anInt4108 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method3383(samples, local40, local23, len, local13.samples[this.end - 1]);
							if (this.anInt4100 < local23) {
								return;
							}
							this.anInt4100 = local23 + local23 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
							if (--this.anInt4108 == 0) {
								break;
							}
							local40 = this.method3358(samples, local40, local18, len, local13.samples[this.start]);
							if (this.anInt4100 >= local18) {
								return;
							}
							this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
						} while (--this.anInt4108 != 0);
					}
				} else if (this.anInt4095 < 0) {
					while (true) {
						local40 = this.method3358(samples, local40, local18, len, local13.samples[this.end - 1]);
						if (this.anInt4100 >= local18) {
							return;
						}
						@Pc(417) int local417 = (local23 - this.anInt4100 - 1) / local33;
						if (local417 >= this.anInt4108) {
							this.anInt4100 += local33 * this.anInt4108;
							this.anInt4108 = 0;
							break;
						}
						this.anInt4100 += local33 * local417;
						this.anInt4108 -= local417;
					}
				} else {
					while (true) {
						local40 = this.method3383(samples, local40, local23, len, local13.samples[this.start]);
						if (this.anInt4100 < local23) {
							return;
						}
						@Pc(473) int local473 = (this.anInt4100 - local18) / local33;
						if (local473 >= this.anInt4108) {
							this.anInt4100 -= local33 * this.anInt4108;
							this.anInt4108 = 0;
							break;
						}
						this.anInt4100 -= local33 * local473;
						this.anInt4108 -= local473;
					}
				}
			}
			if (this.anInt4095 < 0) {
				this.method3358(samples, local40, 0, len, 0);
				if (this.anInt4100 < 0) {
					this.anInt4100 = -1;
					this.method3354();
					this.unlink();
				}
			} else {
				this.method3383(samples, local40, local29, len, 0);
				if (this.anInt4100 >= local29) {
					this.anInt4100 = local29;
					this.method3354();
					this.unlink();
				}
			}
		} else if (this.aBoolean290) {
			if (this.anInt4095 < 0) {
				local40 = this.method3358(samples, off, local18, len, local13.samples[this.start]);
				if (this.anInt4100 >= local18) {
					return;
				}
				this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
			}
			while (true) {
				@Pc(134) int local134 = this.method3383(samples, local40, local23, len, local13.samples[this.end - 1]);
				if (this.anInt4100 < local23) {
					return;
				}
				this.anInt4100 = local23 + local23 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
				local40 = this.method3358(samples, local134, local18, len, local13.samples[this.start]);
				if (this.anInt4100 >= local18) {
					return;
				}
				this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
			}
		} else if (this.anInt4095 < 0) {
			while (true) {
				local40 = this.method3358(samples, local40, local18, len, local13.samples[this.end - 1]);
				if (this.anInt4100 >= local18) {
					return;
				}
				this.anInt4100 = local23 - (local23 - this.anInt4100 - 1) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3383(samples, local40, local23, len, local13.samples[this.start]);
				if (this.anInt4100 < local23) {
					return;
				}
				this.anInt4100 = local18 + (this.anInt4100 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()I")
	@Override
	public final int method3346() {
		return this.volume == 0 && this.anInt4105 == 0 ? 0 : 1;
	}
}

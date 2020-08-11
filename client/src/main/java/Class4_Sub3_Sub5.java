import java.util.Random;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public abstract class Class4_Sub3_Sub5 extends SecondaryNode {

	@OriginalMember(owner = "client!gl", name = "C", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!gl", name = "D", descriptor = "[Lclient!ma;")
	private Class56[] aClass56Array4;

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!gl", name = "H", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
	public int anInt2820 = 0;

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!gl", name = "G", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "[I")
	protected int[] anIntArray251;

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "[I")
	protected int[] anIntArray246;

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
	private int anInt2819;

	@OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
	private int anInt2828;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class4_Sub3_Sub5(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray247 = arg1;
		this.anIntArray249 = arg2;
		this.anIntArray251 = arg3;
		this.anIntArray246 = arg4;
		this.method2251(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray249[local25] < local21 && this.anIntArray246[local25] != 0) {
				local21 = this.anIntArray249[local25];
			}
			if (this.anIntArray249[local25] + this.anIntArray246[local25] > local23) {
				local23 = this.anIntArray249[local25] + this.anIntArray246[local25];
			}
		}
		this.anInt2819 = this.anInt2820 - local21;
		this.anInt2828 = local23 - this.anInt2820;
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([B)V")
	public Class4_Sub3_Sub5(@OriginalArg(0) byte[] arg0) {
		this.method2251(arg0);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([B)V")
	private void method2251(@OriginalArg(0) byte[] arg0) {
		this.anIntArray250 = new int[256];
		if (arg0.length == 257) {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray250.length; local9++) {
				this.anIntArray250[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2820 = arg0[256] & 0xFF;
			return;
		}
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray250[local37] = arg0[local35++] & 0xFF;
		}
		@Pc(55) int[] local55 = new int[256];
		@Pc(58) int[] local58 = new int[256];
		for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
			local55[local60] = arg0[local35++] & 0xFF;
		}
		for (@Pc(76) int local76 = 0; local76 < 256; local76++) {
			local58[local76] = arg0[local35++] & 0xFF;
		}
		@Pc(93) byte[][] local93 = new byte[256][];
		for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
			local93[local95] = new byte[local55[local95]];
			@Pc(107) byte local107 = 0;
			for (@Pc(109) int local109 = 0; local109 < local93[local95].length; local109++) {
				local107 += arg0[local35++];
				local93[local95][local109] = local107;
			}
		}
		@Pc(136) byte[][] local136 = new byte[256][];
		for (@Pc(138) int local138 = 0; local138 < 256; local138++) {
			local136[local138] = new byte[local55[local138]];
			@Pc(150) byte local150 = 0;
			for (@Pc(152) int local152 = 0; local152 < local136[local138].length; local152++) {
				local150 += arg0[local35++];
				local136[local138][local152] = local150;
			}
		}
		this.aByteArray22 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (@Pc(194) int local194 = 0; local194 < 256; local194++) {
					if (local194 != 32 && local194 != 160) {
						this.aByteArray22[(local182 << 8) + local194] = (byte) Static17.method2270(local93, local136, local58, this.anIntArray250, local55, local182, local194);
					}
				}
			}
		}
		this.anInt2820 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;)I")
	public final int method2252(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) char local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(21) char local21 = arg0.charAt(local14);
			if (local21 == '<') {
				local5 = local14;
			} else {
				if (local21 == '>' && local5 != -1) {
					@Pc(41) String local41 = arg0.substring(local5 + 1, local14).toLowerCase();
					local5 = -1;
					if (local41.equals("lt")) {
						local21 = '<';
					} else if (local41.equals("gt")) {
						local21 = '>';
					} else if (local41.equals("nbsp")) {
						local21 = ' ';
					} else if (local41.equals("shy")) {
						local21 = '\u00ad';
					} else if (local41.equals("times")) {
						local21 = '×';
					} else if (local41.equals("euro")) {
						local21 = '€';
					} else if (local41.equals("copy")) {
						local21 = '©';
					} else {
						if (!local41.equals("reg")) {
							if (local41.startsWith("img=")) {
								try {
									@Pc(109) int local109 = Static12.method737(local41.substring(4));
									local9 += this.aClass56Array4[local109].anInt3412;
									local7 = '\u0000';
								} catch (@Pc(121) Exception local121) {
								}
							}
							continue;
						}
						local21 = '®';
					}
				}
				if (local5 == -1) {
					@Pc(132) char local132 = (char) (Cp1252Charset.encodeChar(local21) & 0xFF);
					local9 += this.anIntArray250[local132];
					if (this.aByteArray22 != null && local7 != '\u0000') {
						local9 += this.aByteArray22[(local7 << 8) + local132];
					}
					local7 = local132;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIZ)V")
	protected abstract void method2253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method2254(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg2 -= this.anInt2820;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(11) int local11 = arg0.length();
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(20) char local20 = arg0.charAt(local13);
			if (local20 == '<') {
				local6 = local13;
			} else {
				if (local20 == '>' && local6 != -1) {
					@Pc(40) String local40 = arg0.substring(local6 + 1, local13).toLowerCase();
					local6 = -1;
					if (local40.equals("lt")) {
						local20 = '<';
					} else if (local40.equals("gt")) {
						local20 = '>';
					} else if (local40.equals("nbsp")) {
						local20 = ' ';
					} else if (local40.equals("shy")) {
						local20 = '\u00ad';
					} else if (local40.equals("times")) {
						local20 = '×';
					} else if (local40.equals("euro")) {
						local20 = '€';
					} else if (local40.equals("copy")) {
						local20 = '©';
					} else {
						if (!local40.equals("reg")) {
							if (local40.startsWith("img=")) {
								try {
									@Pc(108) int local108 = Static12.method737(local40.substring(4));
									@Pc(113) Class56 local113 = this.aClass56Array4[local108];
									@Pc(124) int local124 = this.anIntArray248 == null ? local113.anInt3410 : this.anIntArray248[local108];
									if (Static3.anInt2822 == 256) {
										local113.method2815(arg1, arg2 + this.anInt2820 - local124);
									} else {
										local113.method2816(arg1, arg2 + this.anInt2820 - local124, Static3.anInt2822);
									}
									arg1 += local113.anInt3412;
									local8 = '\u0000';
								} catch (@Pc(156) Exception local156) {
								}
							} else {
								this.method2278(local40);
							}
							continue;
						}
						local20 = '®';
					}
				}
				if (local6 == -1) {
					@Pc(171) char local171 = (char) (Cp1252Charset.encodeChar(local20) & 0xFF);
					if (this.aByteArray22 != null && local8 != '\u0000') {
						arg1 += this.aByteArray22[(local8 << 8) + local171];
					}
					@Pc(192) int local192 = this.anIntArray251[local171];
					@Pc(197) int local197 = this.anIntArray246[local171];
					if (local171 == ' ') {
						if (Static3.anInt2831 > 0) {
							Static3.anInt2827 += Static3.anInt2831;
							arg1 += Static3.anInt2827 >> 8;
							Static3.anInt2827 &= 255;
						}
					} else if (Static3.anInt2822 == 256) {
						if (Static3.anInt2824 != -1) {
							this.method2253(local171, arg1 + this.anIntArray247[local171] + 1, arg2 + this.anIntArray249[local171] + 1, local192, local197, Static3.anInt2824);
						}
						this.method2253(local171, arg1 + this.anIntArray247[local171], arg2 + this.anIntArray249[local171], local192, local197, Static3.anInt2823);
					} else {
						if (Static3.anInt2824 != -1) {
							this.method2264(local171, arg1 + this.anIntArray247[local171] + 1, arg2 + this.anIntArray249[local171] + 1, local192, local197, Static3.anInt2824, Static3.anInt2822);
						}
						this.method2264(local171, arg1 + this.anIntArray247[local171], arg2 + this.anIntArray249[local171], local192, local197, Static3.anInt2823, Static3.anInt2822);
					}
					@Pc(318) int local318 = this.anIntArray250[local171];
					if (Static3.anInt2829 != -1) {
						if (Static3.aBoolean138) {
							Static18.method1699(arg1, arg2 + (int) ((double) this.anInt2820 * 0.7D), local318, Static3.anInt2829);
						} else {
							Static34.method4214(arg1, arg2 + (int) ((double) this.anInt2820 * 0.7D), local318, Static3.anInt2829);
						}
					}
					if (Static3.anInt2830 != -1) {
						if (Static3.aBoolean138) {
							Static18.method1699(arg1, arg2 + this.anInt2820 + 1, local318, Static3.anInt2830);
						} else {
							Static34.method4214(arg1, arg2 + this.anInt2820 + 1, local318, Static3.anInt2830);
						}
					}
					arg1 += local318;
					local8 = local171;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
	public final int method2255(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method2260(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method2256(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2258(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		@Pc(15) int[] local15 = new int[local9];
		for (@Pc(17) int local17 = 0; local17 < local9; local17++) {
			local12[local17] = (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local15[local17] = (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2268(arg0, arg1 - this.method2252(arg0) / 2, arg2, local12, local15);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method2257(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(6) int local6 = arg0.length();
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(15) char local15 = arg0.charAt(local8);
			if (local15 == '<') {
				local3 = true;
			} else if (local15 == '>') {
				local3 = false;
			} else if (!local3 && local15 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			Static3.anInt2831 = (arg1 - this.method2252(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	private void method2258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static3.anInt2829 = -1;
		Static3.anInt2830 = -1;
		Static3.anInt2826 = arg1;
		Static3.anInt2824 = arg1;
		Static3.anInt2825 = arg0;
		Static3.anInt2823 = arg0;
		Static3.anInt2821 = 256;
		Static3.anInt2822 = 256;
		Static3.anInt2831 = 0;
		Static3.anInt2827 = 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method2259(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2258(arg3, arg4);
			this.method2254(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
	public final int method2260(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method2276(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt2820;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt2819 + this.anInt2828 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method2279(arg0, local20, Static3.aStringArray20);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt2819;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt2819 + (arg4 - this.anInt2819 - this.anInt2828 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt2828 - (local42 - 1) * arg9;
		} else {
			@Pc(118) int local118 = (arg4 - this.anInt2819 - this.anInt2828 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt2819 + local118;
			arg9 += local118;
		}
		for (@Pc(135) int local135 = 0; local135 < local42; local135++) {
			if (arg7 == 0) {
				this.method2254(Static3.aStringArray20[local135], arg1, local57);
			} else if (arg7 == 1) {
				this.method2254(Static3.aStringArray20[local135], arg1 + (arg3 - this.method2252(Static3.aStringArray20[local135])) / 2, local57);
			} else if (arg7 == 2) {
				this.method2254(Static3.aStringArray20[local135], arg1 + arg3 - this.method2252(Static3.aStringArray20[local135]), local57);
			} else if (local135 == local42 - 1) {
				this.method2254(Static3.aStringArray20[local135], arg1, local57);
			} else {
				this.method2257(Static3.aStringArray20[local135], arg3);
				this.method2254(Static3.aStringArray20[local135], arg1, local57);
				Static3.anInt2831 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public final int method2261(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method2279(arg0, new int[] { arg1 }, Static3.aStringArray20);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(23) int local23 = this.method2252(Static3.aStringArray20[local14]);
			if (local23 > local12) {
				local12 = local23;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method2262(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2258(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			local12[local14] = (int) (Math.sin((double) local14 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2268(arg0, arg1 - this.method2252(arg0) / 2, arg2, null, local12);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
	public final int method2263(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method2276(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			local23[local27] = local25;
			if ((arg3.nextInt() & 0x3) == 0) {
				local25++;
			}
		}
		this.method2268(arg0, arg1, arg2, local23, null);
		return local25;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIZ)V")
	protected abstract void method2264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method2266(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method2258(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(22) int local22 = arg0.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) local27 / 1.5D + (double) arg4 / 1.0D) * local13);
		}
		this.method2268(arg0, arg1 - this.method2252(arg0) / 2, arg2, null, local25);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([Lclient!ma;[I)V")
	public final void method2267(@OriginalArg(0) Class56[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass56Array4 = arg0;
		this.anIntArray248 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
	private void method2268(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		arg2 -= this.anInt2820;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 == '<') {
				local6 = local15;
			} else {
				if (local22 == '>' && local6 != -1) {
					@Pc(42) String local42 = arg0.substring(local6 + 1, local15).toLowerCase();
					local6 = -1;
					if (local42.equals("lt")) {
						local22 = '<';
					} else if (local42.equals("gt")) {
						local22 = '>';
					} else if (local42.equals("nbsp")) {
						local22 = ' ';
					} else if (local42.equals("shy")) {
						local22 = '\u00ad';
					} else if (local42.equals("times")) {
						local22 = '×';
					} else if (local42.equals("euro")) {
						local22 = '€';
					} else if (local42.equals("copy")) {
						local22 = '©';
					} else {
						if (!local42.equals("reg")) {
							if (local42.startsWith("img=")) {
								try {
									@Pc(110) int local110;
									if (arg3 == null) {
										local110 = 0;
									} else {
										local110 = arg3[local10];
									}
									@Pc(119) int local119;
									if (arg4 == null) {
										local119 = 0;
									} else {
										local119 = arg4[local10];
									}
									local10++;
									@Pc(129) int local129 = Static12.method737(local42.substring(4));
									@Pc(134) Class56 local134 = this.aClass56Array4[local129];
									@Pc(145) int local145 = this.anIntArray248 == null ? local134.anInt3410 : this.anIntArray248[local129];
									if (Static3.anInt2822 == 256) {
										local134.method2815(arg1 + local110, arg2 + this.anInt2820 + local119 - local145);
									} else {
										local134.method2816(arg1 + local110, arg2 + this.anInt2820 + local119 - local145, Static3.anInt2822);
									}
									arg1 += local134.anInt3412;
									local8 = '\u0000';
								} catch (@Pc(185) Exception local185) {
								}
							} else {
								this.method2278(local42);
							}
							continue;
						}
						local22 = '®';
					}
				}
				if (local6 == -1) {
					@Pc(200) char local200 = (char) (Cp1252Charset.encodeChar(local22) & 0xFF);
					if (this.aByteArray22 != null && local8 != '\u0000') {
						arg1 += this.aByteArray22[(local8 << 8) + local200];
					}
					@Pc(221) int local221 = this.anIntArray251[local200];
					@Pc(226) int local226 = this.anIntArray246[local200];
					@Pc(232) int local232;
					if (arg3 == null) {
						local232 = 0;
					} else {
						local232 = arg3[local10];
					}
					@Pc(241) int local241;
					if (arg4 == null) {
						local241 = 0;
					} else {
						local241 = arg4[local10];
					}
					local10++;
					if (local200 == ' ') {
						if (Static3.anInt2831 > 0) {
							Static3.anInt2827 += Static3.anInt2831;
							arg1 += Static3.anInt2827 >> 8;
							Static3.anInt2827 &= 255;
						}
					} else if (Static3.anInt2822 == 256) {
						if (Static3.anInt2824 != -1) {
							this.method2253(local200, arg1 + this.anIntArray247[local200] + local232 + 1, arg2 + this.anIntArray249[local200] + local241 + 1, local221, local226, Static3.anInt2824);
						}
						this.method2253(local200, arg1 + this.anIntArray247[local200] + local232, arg2 + this.anIntArray249[local200] + local241, local221, local226, Static3.anInt2823);
					} else {
						if (Static3.anInt2824 != -1) {
							this.method2264(local200, arg1 + this.anIntArray247[local200] + local232 + 1, arg2 + this.anIntArray249[local200] + local241 + 1, local221, local226, Static3.anInt2824, Static3.anInt2822);
						}
						this.method2264(local200, arg1 + this.anIntArray247[local200] + local232, arg2 + this.anIntArray249[local200] + local241, local221, local226, Static3.anInt2823, Static3.anInt2822);
					}
					@Pc(382) int local382 = this.anIntArray250[local200];
					if (Static3.anInt2829 != -1) {
						if (Static3.aBoolean138) {
							Static18.method1699(arg1, arg2 + (int) ((double) this.anInt2820 * 0.7D), local382, Static3.anInt2829);
						} else {
							Static34.method4214(arg1, arg2 + (int) ((double) this.anInt2820 * 0.7D), local382, Static3.anInt2829);
						}
					}
					if (Static3.anInt2830 != -1) {
						if (Static3.aBoolean138) {
							Static18.method1699(arg1, arg2 + this.anInt2820, local382, Static3.anInt2830);
						} else {
							Static34.method4214(arg1, arg2 + this.anInt2820, local382, Static3.anInt2830);
						}
					}
					arg1 += local382;
					local8 = local200;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
	public final int method2269(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		this.method2276(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			local23[local27] = local25;
			if ((arg9.nextInt() & 0x3) == 0) {
				local25++;
			}
		}
		@Pc(44) int local44 = arg1;
		@Pc(49) int local49 = arg2 + this.anInt2819;
		@Pc(51) int local51 = -1;
		if (arg8 == 1) {
			local49 += (arg4 - this.anInt2819 - this.anInt2828) / 2;
		} else if (arg8 == 2) {
			local49 = arg2 + arg4 - this.anInt2828;
		}
		if (arg7 == 1) {
			local51 = this.method2252(arg0) + local25;
			local44 = arg1 + (arg3 - local51) / 2;
		} else if (arg7 == 2) {
			local51 = this.method2252(arg0) + local25;
			local44 = arg1 + arg3 - local51;
		}
		this.method2268(arg0, local44, local49, local23, null);
		if (arg11 != null) {
			if (local51 == -1) {
				local51 = this.method2252(arg0) + local25;
			}
			arg11[0] = local44;
			arg11[1] = local49 - this.anInt2819;
			arg11[2] = local51;
			arg11[3] = this.anInt2819 + this.anInt2828;
		}
		return local25;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method2271(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2258(arg3, arg4);
			this.method2254(arg0, arg1 - this.method2252(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Ljava/lang/String;II)I")
	public final int method2273(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.anInt2820;
		@Pc(15) int local15 = this.method2279(arg0, new int[] { 100 }, Static3.aStringArray20);
		@Pc(21) int local21 = (local15 - 1) * local4;
		return this.anInt2819 + local21 + this.anInt2828;
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(Ljava/lang/String;I)I")
	public final int method2274(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2279(arg0, new int[] { arg1 }, Static3.aStringArray20);
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method2275(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2258(arg3, arg4);
			this.method2254(arg0, arg1 - this.method2252(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	private void method2276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static3.anInt2829 = -1;
		Static3.anInt2830 = -1;
		Static3.anInt2826 = arg1;
		Static3.anInt2824 = arg1;
		Static3.anInt2825 = arg0;
		Static3.anInt2823 = arg0;
		Static3.anInt2821 = arg2;
		Static3.anInt2822 = arg2;
		Static3.anInt2831 = 0;
		Static3.anInt2827 = 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(C)I")
	private int method2277(@OriginalArg(0) char arg0) {
		return this.anIntArray250[Cp1252Charset.encodeChar(arg0) & 0xFF];
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(Ljava/lang/String;)V")
	private void method2278(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static3.anInt2823 = Static24.method2703(arg0.substring(4));
			} else if (arg0.equals("/col")) {
				Static3.anInt2823 = Static3.anInt2825;
			} else if (arg0.startsWith("trans=")) {
				Static3.anInt2822 = Static12.method737(arg0.substring(6));
			} else if (arg0.equals("/trans")) {
				Static3.anInt2822 = Static3.anInt2821;
			} else if (arg0.startsWith("str=")) {
				Static3.anInt2829 = Static24.method2703(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static3.anInt2829 = 8388608;
			} else if (arg0.equals("/str")) {
				Static3.anInt2829 = -1;
			} else if (arg0.startsWith("u=")) {
				Static3.anInt2830 = Static24.method2703(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static3.anInt2830 = 0;
			} else if (arg0.equals("/u")) {
				Static3.anInt2830 = -1;
			} else if (arg0.startsWith("shad=")) {
				Static3.anInt2824 = Static24.method2703(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static3.anInt2824 = 0;
			} else if (arg0.equals("/shad")) {
				Static3.anInt2824 = Static3.anInt2826;
			} else if (arg0.equals("br")) {
				this.method2276(Static3.anInt2825, Static3.anInt2826, Static3.anInt2821);
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public final int method2279(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		Static21.method2024(Static3.aStringBuffer3);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(23) char local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg0.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(37) char local37 = arg0.charAt(local30);
			if (local37 == '<') {
				local21 = local30;
			} else {
				if (local37 == '>' && local21 != -1) {
					@Pc(57) String local57 = arg0.substring(local21 + 1, local30).toLowerCase();
					local21 = -1;
					Static3.aStringBuffer3.append('<');
					Static3.aStringBuffer3.append(local57);
					Static3.aStringBuffer3.append('>');
					if (local57.equals("br")) {
						arg2[local25] = Static3.aStringBuffer3.toString().substring(local13, Static3.aStringBuffer3.length());
						local25++;
						local13 = Static3.aStringBuffer3.length();
						local11 = 0;
						local15 = -1;
						local23 = '\u0000';
					} else if (local57.equals("lt")) {
						local11 += this.method2277('<');
						if (this.aByteArray22 != null && local23 != '\u0000') {
							local11 += this.aByteArray22[(local23 << 8) + 60];
						}
						local23 = '<';
					} else if (local57.equals("gt")) {
						local11 += this.method2277('>');
						if (this.aByteArray22 != null && local23 != '\u0000') {
							local11 += this.aByteArray22[(local23 << 8) + 62];
						}
						local23 = '>';
					} else if (local57.equals("nbsp")) {
						local11 += this.method2277(' ');
						if (this.aByteArray22 != null && local23 != '\u0000') {
							local11 += this.aByteArray22[(local23 << 8) + 160];
						}
						local23 = ' ';
					} else if (local57.equals("shy")) {
						local11 += this.method2277('\u00ad');
						if (this.aByteArray22 != null && local23 != '\u0000') {
							local11 += this.aByteArray22[(local23 << 8) + 173];
						}
						local23 = '\u00ad';
					} else if (local57.equals("times")) {
						local11 += this.method2277('×');
						if (this.aByteArray22 != null && local23 != '\u0000') {
							local11 += this.aByteArray22[(local23 << 8) + 215];
						}
						local23 = '×';
					} else if (local57.equals("euro")) {
						local11 += this.method2277('€');
						if (this.aByteArray22 != null && local23 != '\u0000') {
							local11 += this.aByteArray22[(local23 << 8) + 128];
						}
						local23 = '€';
					} else if (local57.equals("copy")) {
						local11 += this.method2277('©');
						if (this.aByteArray22 != null && local23 != '\u0000') {
							local11 += this.aByteArray22[(local23 << 8) + 169];
						}
						local23 = '©';
					} else if (local57.equals("reg")) {
						local11 += this.method2277('®');
						if (this.aByteArray22 != null && local23 != '\u0000') {
							local11 += this.aByteArray22[(local23 << 8) + 174];
						}
						local23 = '®';
					} else if (local57.startsWith("img=")) {
						try {
							@Pc(337) int local337 = Static12.method737(local57.substring(4));
							local11 += this.aClass56Array4[local337].anInt3412;
							local23 = '\u0000';
						} catch (@Pc(349) Exception local349) {
						}
					}
					local37 = '\u0000';
				}
				if (local21 == -1) {
					if (local37 != '\u0000') {
						Static3.aStringBuffer3.append(local37);
						local37 = (char) (Cp1252Charset.encodeChar(local37) & 0xFF);
						local11 += this.anIntArray250[local37];
						if (this.aByteArray22 != null && local23 != '\u0000') {
							local11 += this.aByteArray22[(local23 << 8) + local37];
						}
						local23 = local37;
					}
					if (local37 == ' ') {
						local15 = Static3.aStringBuffer3.length();
						local17 = local11;
						local19 = 1;
					}
					if (arg1 != null && local11 > arg1[local25 < arg1.length ? local25 : arg1.length - 1] && local15 >= 0) {
						arg2[local25] = Static3.aStringBuffer3.toString().substring(local13, local15 - local19);
						local25++;
						local13 = local15;
						local15 = -1;
						local11 -= local17;
						local23 = '\u0000';
					}
					if (local37 == '-') {
						local15 = Static3.aStringBuffer3.length();
						local17 = local11;
						local19 = 0;
					}
				}
			}
		}
		if (Static3.aStringBuffer3.length() > local13) {
			arg2[local25] = Static3.aStringBuffer3.toString().substring(local13, Static3.aStringBuffer3.length());
			local25++;
		}
		return local25;
	}
}

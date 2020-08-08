import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class129 {

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "[B")
	private final byte[] aByteArray50;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
	private final int[] anIntArray416;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "([B)V")
	public Class129(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray50 = arg0;
		this.anIntArray417 = new int[8];
		@Pc(15) int local15 = 0;
		@Pc(18) int[] local18 = new int[33];
		this.anIntArray416 = new int[local6];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(31) byte local31 = arg0[local24];
			if (local31 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local31;
				@Pc(43) int local43 = local18[local31];
				this.anIntArray416[local24] = local43;
				@Pc(59) int local59;
				if ((local39 & local43) == 0) {
					for (@Pc(65) int local65 = local31 - 1; local65 >= 1; local65--) {
						@Pc(72) int local72 = local18[local65];
						if (local43 != local72) {
							break;
						}
						@Pc(85) int local85 = 0x1 << 32 - local65;
						if ((local72 & local85) != 0) {
							local18[local65] = local18[local65 - 1];
							break;
						}
						local18[local65] = local85 | local72;
					}
					local59 = local43 | local39;
				} else {
					local59 = local18[local31 - 1];
				}
				local18[local31] = local59;
				for (@Pc(123) int local123 = local31 + 1; local123 <= 32; local123++) {
					if (local43 == local18[local123]) {
						local18[local123] = local59;
					}
				}
				@Pc(147) int local147 = 0;
				for (@Pc(149) int local149 = 0; local149 < local31; local149++) {
					@Pc(156) int local156 = Integer.MIN_VALUE >>> local149;
					if ((local156 & local43) == 0) {
						local147++;
					} else {
						if (this.anIntArray417[local147] == 0) {
							this.anIntArray417[local147] = local15;
						}
						local147 = this.anIntArray417[local147];
					}
					if (this.anIntArray417.length <= local147) {
						@Pc(197) int[] local197 = new int[this.anIntArray417.length * 2];
						for (@Pc(199) int local199 = 0; local199 < this.anIntArray417.length; local199++) {
							local197[local199] = this.anIntArray417[local199];
						}
						this.anIntArray417 = local197;
					}
				}
				if (local15 <= local147) {
					local15 = local147 + 1;
				}
				this.anIntArray417[local147] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[B[BI)I")
	public final int method3232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg0 << 3;
		while (arg1 < arg4) {
			@Pc(32) int local32 = arg3[arg1] & 0xFF;
			@Pc(37) int local37 = this.anIntArray416[local32];
			@Pc(42) byte local42 = this.aByteArray50[local32];
			if (local42 == 0) {
				throw new RuntimeException("No codeword for data value " + local32);
			}
			@Pc(64) int local64 = local23 >> 3;
			@Pc(68) int local68 = local23 & 0x7;
			local23 += local42;
			@Pc(79) int local79 = local19 & -local68 >> 31;
			@Pc(89) int local89 = local64 + (local42 + local68 - 1 >> 3);
			local68 += 24;
			arg2[local64] = (byte) (local19 = local79 | local37 >>> local68);
			if (local89 > local64) {
				@Pc(109) int local109 = local64 + 1;
				@Pc(110) int local110 = local68 - 8;
				arg2[local109] = (byte) (local19 = local37 >>> local110);
				if (local89 > local109) {
					@Pc(129) int local129 = local109 + 1;
					@Pc(130) int local130 = local110 - 8;
					arg2[local129] = (byte) (local19 = local37 >>> local130);
					if (local89 > local129) {
						@Pc(149) int local149 = local129 + 1;
						@Pc(150) int local150 = local130 - 8;
						arg2[local149] = (byte) (local19 = local37 >>> local150);
						if (local149 < local89) {
							@Pc(169) int local169 = local150 - 8;
							@Pc(170) int local170 = local149 + 1;
							arg2[local170] = (byte) (local19 = local37 << -local169);
						}
					}
				}
			}
			arg1++;
		}
		return (local23 + 7 >> 3) - arg0;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(III[B[BI)I")
	public final int method3233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg1;
		while (true) {
			@Pc(29) byte local29 = arg2[local25];
			@Pc(36) int local36;
			if (local29 < 0) {
				local36 = this.anIntArray417[local23];
			} else {
				local36 = local23 + 1;
			}
			@Pc(46) int local46;
			if ((local46 = this.anIntArray417[local36]) < 0) {
				arg3[arg0++] = (byte) ~local46;
				if (arg0 >= arg4) {
					break;
				}
				local36 = 0;
			}
			@Pc(76) int local76;
			if ((local29 & 0x40) == 0) {
				local76 = local36 + 1;
			} else {
				local76 = this.anIntArray417[local36];
			}
			if ((local46 = this.anIntArray417[local76]) < 0) {
				arg3[arg0++] = (byte) ~local46;
				if (arg0 >= arg4) {
					break;
				}
				local76 = 0;
			}
			@Pc(121) int local121;
			if ((local29 & 0x20) == 0) {
				local121 = local76 + 1;
			} else {
				local121 = this.anIntArray417[local76];
			}
			if ((local46 = this.anIntArray417[local121]) < 0) {
				arg3[arg0++] = (byte) ~local46;
				if (arg4 <= arg0) {
					break;
				}
				local121 = 0;
			}
			@Pc(156) int local156;
			if ((local29 & 0x10) == 0) {
				local156 = local121 + 1;
			} else {
				local156 = this.anIntArray417[local121];
			}
			if ((local46 = this.anIntArray417[local156]) < 0) {
				arg3[arg0++] = (byte) ~local46;
				if (arg4 <= arg0) {
					break;
				}
				local156 = 0;
			}
			@Pc(199) int local199;
			if ((local29 & 0x8) == 0) {
				local199 = local156 + 1;
			} else {
				local199 = this.anIntArray417[local156];
			}
			if ((local46 = this.anIntArray417[local199]) < 0) {
				arg3[arg0++] = (byte) ~local46;
				if (arg4 <= arg0) {
					break;
				}
				local199 = 0;
			}
			@Pc(235) int local235;
			if ((local29 & 0x4) == 0) {
				local235 = local199 + 1;
			} else {
				local235 = this.anIntArray417[local199];
			}
			if ((local46 = this.anIntArray417[local235]) < 0) {
				arg3[arg0++] = (byte) ~local46;
				if (arg4 <= arg0) {
					break;
				}
				local235 = 0;
			}
			@Pc(270) int local270;
			if ((local29 & 0x2) == 0) {
				local270 = local235 + 1;
			} else {
				local270 = this.anIntArray417[local235];
			}
			if ((local46 = this.anIntArray417[local270]) < 0) {
				arg3[arg0++] = (byte) ~local46;
				if (arg4 <= arg0) {
					break;
				}
				local270 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23 = local270 + 1;
			} else {
				local23 = this.anIntArray417[local270];
			}
			if ((local46 = this.anIntArray417[local23]) < 0) {
				arg3[arg0++] = (byte) ~local46;
				if (arg4 <= arg0) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg1;
	}
}

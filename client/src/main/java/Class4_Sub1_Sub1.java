import java.util.Random;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
	private int anInt72 = 409;

	@OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
	private int anInt81 = 1024;

	@OriginalMember(owner = "client!ac", name = "Z", descriptor = "I")
	private int anInt77 = 1024;

	@OriginalMember(owner = "client!ac", name = "fb", descriptor = "I")
	private int anInt82 = 819;

	@OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
	private int anInt76 = 0;

	@OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
	private int anInt75 = 1024;

	@OriginalMember(owner = "client!ac", name = "hb", descriptor = "I")
	private int anInt84 = 1024;

	@OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
	private int anInt74 = 0;

	@OriginalMember(owner = "client!ac", name = "kb", descriptor = "I")
	private int anInt87 = 2048;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass35_41.method730(arg0);
		if (!this.aClass35_41.aBoolean51) {
			return local7;
		}
		@Pc(23) int local23 = 0;
		@Pc(28) int[][] local28 = this.aClass35_41.method729();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) int local40 = 0;
		@Pc(42) boolean local42 = true;
		@Pc(49) int local49 = this.anInt84 * Static2.anInt1626 >> 12;
		@Pc(51) int local51 = 0;
		@Pc(58) int local58 = this.anInt72 * Static1.anInt379 >> 12;
		@Pc(65) int local65 = Static2.anInt1626 * this.anInt87 >> 12;
		@Pc(72) int local72 = this.anInt82 * Static1.anInt379 >> 12;
		if (local72 <= 1) {
			return local28[arg0];
		}
		this.anInt79 = Static2.anInt1626 / 8 * this.anInt81 >> 12;
		@Pc(99) int local99 = Static2.anInt1626 / local49 + 1;
		@Pc(106) Random local106 = new Random((long) this.anInt74);
		@Pc(110) int[][] local110 = new int[local99][3];
		@Pc(114) int[][] local114 = new int[local99][3];
		while (true) {
			while (true) {
				@Pc(125) int local125 = local49 + Static12.method716(local106, local65 - local49);
				@Pc(135) int local135 = Static12.method716(local106, local72 - local58) + local58;
				@Pc(139) int local139 = local32 + local125;
				if (local139 > Static2.anInt1626) {
					local125 = Static2.anInt1626 - local32;
					local139 = Static2.anInt1626;
				}
				@Pc(153) int local153;
				if (local38) {
					local153 = 0;
				} else {
					@Pc(157) int local157 = local36;
					@Pc(161) int[] local161 = local114[local36];
					local153 = local161[2];
					@Pc(167) int local167 = 0;
					@Pc(171) int local171 = local23 + local139;
					if (local171 < 0) {
						local171 += Static2.anInt1626;
					}
					if (Static2.anInt1626 < local171) {
						local171 -= Static2.anInt1626;
					}
					while (true) {
						@Pc(196) int[] local196 = local114[local157];
						if (local196[0] <= local171 && local171 <= local196[1]) {
							if (local157 != local36) {
								@Pc(238) int local238 = local32 + local23;
								if (local238 < 0) {
									local238 += Static2.anInt1626;
								}
								if (local238 > Static2.anInt1626) {
									local238 -= Static2.anInt1626;
								}
								for (@Pc(258) int local258 = 1; local258 <= local167; local258++) {
									@Pc(269) int[] local269 = local114[(local258 + local36) % local40];
									local153 = Math.max(local153, local269[2]);
								}
								for (@Pc(280) int local280 = 0; local280 <= local167; local280++) {
									@Pc(295) int[] local295 = local114[(local280 + local36) % local40];
									@Pc(299) int local299 = local295[2];
									if (local299 != local153) {
										@Pc(306) int local306 = local295[1];
										@Pc(310) int local310 = local295[0];
										@Pc(320) int local320;
										@Pc(322) int local322;
										if (local238 < local171) {
											local320 = Math.max(local238, local310);
											local322 = Math.min(local171, local306);
										} else if (local310 == 0) {
											local322 = Math.min(local171, local306);
											local320 = 0;
										} else {
											local320 = Math.max(local238, local310);
											local322 = Static2.anInt1626;
										}
										this.method69(local153 - local299, local322 - local320, local34 + local320, local299, local106, local28);
									}
								}
							}
							local36 = local157;
							break;
						}
						local157++;
						if (local157 >= local40) {
							local157 = 0;
						}
						local167++;
					}
				}
				if (Static1.anInt379 < local135 + local153) {
					local135 = Static1.anInt379 - local153;
				} else {
					local42 = false;
				}
				if (local139 == Static2.anInt1626) {
					this.method69(local135, local125, local32 + local30, local153, local106, local28);
					if (local42) {
						return local7;
					}
					local38 = false;
					@Pc(440) int local440 = local51 + 1;
					@Pc(442) int[] local442 = local110[local51];
					local42 = true;
					local442[1] = local139;
					local34 = local30;
					local40 = local440;
					local442[0] = local32;
					local442[2] = local135 + local153;
					local30 = Static12.method716(local106, Static2.anInt1626);
					@Pc(469) int[][] local469 = local114;
					local36 = 0;
					local23 = local30 - local34;
					local114 = local110;
					@Pc(480) int local480 = local23;
					local110 = local469;
					if (local23 < 0) {
						local480 = local23 + Static2.anInt1626;
					}
					local51 = 0;
					if (Static2.anInt1626 < local480) {
						local480 -= Static2.anInt1626;
					}
					while (true) {
						@Pc(506) int[] local506 = local114[local36];
						if (local480 >= local506[0] && local506[1] >= local480) {
							local32 = 0;
							break;
						}
						local36++;
						if (local40 <= local36) {
							local36 = 0;
						}
					}
				} else {
					@Pc(388) int[] local388 = local110[local51++];
					local388[1] = local139;
					local388[2] = local135 + local153;
					local388[0] = local32;
					this.method69(local135, local125, local30 + local32, local153, local106, local28);
					local32 = local139;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)V")
	@Override
	public final void method4700() {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIILjava/util/Random;[[I)V")
	private void method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(20) int local20 = this.anInt77 > 0 ? 4096 - Static12.method716(arg4, this.anInt77) : 4096;
		@Pc(28) int local28 = this.anInt79 * this.anInt75 >> 12;
		@Pc(44) int local44 = this.anInt79 - (local28 > 0 ? Static12.method716(arg4, local28) : 0);
		if (Static2.anInt1626 <= arg2) {
			arg2 -= Static2.anInt1626;
		}
		if (local44 > 0) {
			if (arg0 <= 0 || arg1 <= 0) {
				return;
			}
			@Pc(67) int local67 = arg1 / 2;
			@Pc(71) int local71 = arg0 / 2;
			@Pc(82) int local82 = local67 >= local44 ? local44 : local67;
			@Pc(93) int local93 = local44 > local71 ? local71 : local44;
			@Pc(97) int local97 = arg2 + local82;
			@Pc(104) int local104 = arg1 - local82 * 2;
			for (@Pc(106) int local106 = 0; local106 < arg0; local106++) {
				@Pc(116) int[] local116 = arg5[local106 + arg3];
				if (local93 <= local106) {
					@Pc(260) int local260 = arg0 - local106 - 1;
					if (local93 <= local260) {
						for (@Pc(403) int local403 = 0; local403 < local82; local403++) {
							local116[Static1.anInt901 & arg2 + local403] = local116[Static1.anInt901 & arg1 + arg2 - local403 - 1] = local20 * local403 / local82;
						}
						if (local97 + local104 <= Static2.anInt1626) {
							Static8.method75(local116, local97, local104, local20);
						} else {
							@Pc(461) int local461 = Static2.anInt1626 - local97;
							Static8.method75(local116, local97, local461, local20);
							Static8.method75(local116, 0, local104 - local461, local20);
						}
					} else {
						@Pc(274) int local274 = local260 * local20 / local93;
						if (this.anInt76 == 0) {
							for (@Pc(327) int local327 = 0; local327 < local82; local327++) {
								@Pc(336) int local336 = local327 * local20 / local82;
								local116[Static1.anInt901 & arg2 + local327] = local116[arg1 + arg2 - local327 - 1 & Static1.anInt901] = local274 * local336 >> 12;
							}
						} else {
							for (@Pc(280) int local280 = 0; local280 < local82; local280++) {
								@Pc(289) int local289 = local20 * local280 / local82;
								local116[Static1.anInt901 & local280 + arg2] = local116[Static1.anInt901 & arg2 + arg1 - local280 - 1] = local274 > local289 ? local289 : local274;
							}
						}
						if (Static2.anInt1626 < local104 + local97) {
							@Pc(379) int local379 = Static2.anInt1626 - local97;
							Static8.method75(local116, local97, local379, local274);
							Static8.method75(local116, 0, local104 - local379, local274);
						} else {
							Static8.method75(local116, local97, local104, local274);
						}
					}
				} else {
					@Pc(130) int local130 = local106 * local20 / local93;
					if (this.anInt76 == 0) {
						for (@Pc(184) int local184 = 0; local184 < local82; local184++) {
							@Pc(193) int local193 = local20 * local184 / local82;
							local116[Static1.anInt901 & local184 + arg2] = local116[arg2 + arg1 - local184 - 1 & Static1.anInt901] = local193 * local130 >> 12;
						}
					} else {
						for (@Pc(138) int local138 = 0; local138 < local82; local138++) {
							@Pc(151) int local151 = local20 * local138 / local82;
							local116[local138 + arg2 & Static1.anInt901] = local116[arg1 + arg2 - local138 - 1 & Static1.anInt901] = local130 <= local151 ? local130 : local151;
						}
					}
					if (local97 + local104 > Static2.anInt1626) {
						@Pc(231) int local231 = Static2.anInt1626 - local97;
						Static8.method75(local116, local97, local231, local130);
						Static8.method75(local116, 0, local104 - local231, local130);
					} else {
						Static8.method75(local116, local97, local104, local130);
					}
				}
			}
		} else if (Static2.anInt1626 >= arg1 + arg2) {
			for (@Pc(486) int local486 = 0; local486 < arg0; local486++) {
				Static8.method75(arg5[local486 + arg3], arg2, arg1, local20);
			}
		} else {
			@Pc(507) int local507 = Static2.anInt1626 - arg2;
			for (@Pc(509) int local509 = 0; local509 < arg0; local509++) {
				@Pc(518) int[] local518 = arg5[local509 + arg3];
				Static8.method75(local518, arg2, local507, local20);
				Static8.method75(local518, 0, arg1 - local507, local20);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void method4687(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt74 = arg0.method4629();
		} else if (arg1 == 1) {
			this.anInt84 = arg0.method4616();
		} else if (arg1 == 2) {
			this.anInt87 = arg0.method4616();
		} else if (arg1 == 3) {
			this.anInt72 = arg0.method4616();
		} else if (arg1 == 4) {
			this.anInt82 = arg0.method4616();
		} else if (arg1 == 5) {
			this.anInt81 = arg0.method4616();
		} else if (arg1 == 6) {
			this.anInt76 = arg0.method4629();
		} else if (arg1 == 7) {
			this.anInt75 = arg0.method4616();
		} else if (arg1 == 8) {
			this.anInt77 = arg0.method4616();
		}
	}
}

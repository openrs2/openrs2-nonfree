import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Rasteriser {
	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Z")
	public static boolean aBoolean216 = true;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "Z")
	public static boolean aBoolean217 = false;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	public static int alpha = 0;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Z")
	private static boolean aBoolean219 = false;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "[I")
	private static int[] anIntArray297 = new int[1024];

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "Z")
	private static boolean lowDetail = false;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public static int anInt3125;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
	public static int anInt3126;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!nk;")
	public static GlTextureProvider textureProvider;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
	public static int anInt3128;

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
	public static int anInt3129;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
	public static void method2542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aBoolean217 = arg0 < 0 || arg0 > anInt3129 || arg1 < 0 || arg1 > anInt3129 || arg2 < 0 || arg2 > anInt3129;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(7) int local7 = arg1 - arg0;
		@Pc(11) int local11 = arg5 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg7 - arg6;
		@Pc(23) int local23 = arg8 - arg6;
		@Pc(36) int local36;
		if (arg2 == arg1) {
			local36 = 0;
		} else {
			local36 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(48) int local48;
		if (arg1 == arg0) {
			local48 = 0;
		} else {
			local48 = (local3 << 16) / local7;
		}
		@Pc(60) int local60;
		if (arg2 == arg0) {
			local60 = 0;
		} else {
			local60 = (local11 << 16) / local15;
		}
		@Pc(71) int local71 = local3 * local15 - local11 * local7;
		if (local71 == 0) {
			return;
		}
		@Pc(86) int local86 = (local19 * local15 - local23 * local7 << 8) / local71;
		@Pc(98) int local98 = (local23 * local3 - local19 * local11 << 8) / local71;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt3128) {
				if (arg1 > anInt3128) {
					arg1 = anInt3128;
				}
				if (arg2 > anInt3128) {
					arg2 = anInt3128;
				}
				@Pc(128) int local128 = (arg6 << 8) + local86 - local86 * arg3;
				if (arg1 < arg2) {
					@Pc(136) int local136;
					@Pc(137) int local137 = local136 = arg3 << 16;
					if (arg0 < 0) {
						local137 -= local60 * arg0;
						local136 -= local48 * arg0;
						local128 -= local98 * arg0;
						arg0 = 0;
					}
					@Pc(163) int local163 = arg4 << 16;
					if (arg1 < 0) {
						local163 -= local36 * arg1;
						arg1 = 0;
					}
					if ((arg0 == arg1 || local60 >= local48) && (arg0 != arg1 || local60 <= local36)) {
						@Pc(268) int local268 = arg2 - arg1;
						@Pc(272) int local272 = arg1 - arg0;
						@Pc(276) int local276 = anIntArray297[arg0];
						while (true) {
							local272--;
							if (local272 < 0) {
								while (true) {
									local268--;
									if (local268 < 0) {
										return;
									}
									method2554(SoftwareRaster.pixels, local276, local163 >> 16, local137 >> 16, local128, local86);
									local137 += local60;
									local163 += local36;
									local128 += local98;
									local276 += SoftwareRaster.width;
								}
							}
							method2554(SoftwareRaster.pixels, local276, local136 >> 16, local137 >> 16, local128, local86);
							local137 += local60;
							local136 += local48;
							local128 += local98;
							local276 += SoftwareRaster.width;
						}
					} else {
						@Pc(189) int local189 = arg2 - arg1;
						@Pc(193) int local193 = arg1 - arg0;
						@Pc(197) int local197 = anIntArray297[arg0];
						while (true) {
							local193--;
							if (local193 < 0) {
								while (true) {
									local189--;
									if (local189 < 0) {
										return;
									}
									method2554(SoftwareRaster.pixels, local197, local137 >> 16, local163 >> 16, local128, local86);
									local137 += local60;
									local163 += local36;
									local128 += local98;
									local197 += SoftwareRaster.width;
								}
							}
							method2554(SoftwareRaster.pixels, local197, local137 >> 16, local136 >> 16, local128, local86);
							local137 += local60;
							local136 += local48;
							local128 += local98;
							local197 += SoftwareRaster.width;
						}
					}
				} else {
					@Pc(348) int local348;
					@Pc(349) int local349 = local348 = arg3 << 16;
					if (arg0 < 0) {
						local349 -= local60 * arg0;
						local348 -= local48 * arg0;
						local128 -= local98 * arg0;
						arg0 = 0;
					}
					@Pc(375) int local375 = arg5 << 16;
					if (arg2 < 0) {
						local375 -= local36 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local60 < local48 || arg0 == arg2 && local36 > local48) {
						@Pc(401) int local401 = arg1 - arg2;
						@Pc(405) int local405 = arg2 - arg0;
						@Pc(409) int local409 = anIntArray297[arg0];
						while (true) {
							local405--;
							if (local405 < 0) {
								while (true) {
									local401--;
									if (local401 < 0) {
										return;
									}
									method2554(SoftwareRaster.pixels, local409, local375 >> 16, local348 >> 16, local128, local86);
									local375 += local36;
									local348 += local48;
									local128 += local98;
									local409 += SoftwareRaster.width;
								}
							}
							method2554(SoftwareRaster.pixels, local409, local349 >> 16, local348 >> 16, local128, local86);
							local349 += local60;
							local348 += local48;
							local128 += local98;
							local409 += SoftwareRaster.width;
						}
					} else {
						@Pc(480) int local480 = arg1 - arg2;
						@Pc(484) int local484 = arg2 - arg0;
						@Pc(488) int local488 = anIntArray297[arg0];
						while (true) {
							local484--;
							if (local484 < 0) {
								while (true) {
									local480--;
									if (local480 < 0) {
										return;
									}
									method2554(SoftwareRaster.pixels, local488, local348 >> 16, local375 >> 16, local128, local86);
									local375 += local36;
									local348 += local48;
									local128 += local98;
									local488 += SoftwareRaster.width;
								}
							}
							method2554(SoftwareRaster.pixels, local488, local348 >> 16, local349 >> 16, local128, local86);
							local349 += local60;
							local348 += local48;
							local128 += local98;
							local488 += SoftwareRaster.width;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt3128) {
				if (arg2 > anInt3128) {
					arg2 = anInt3128;
				}
				if (arg0 > anInt3128) {
					arg0 = anInt3128;
				}
				@Pc(582) int local582 = (arg7 << 8) + local86 - local86 * arg4;
				if (arg2 < arg0) {
					@Pc(590) int local590;
					@Pc(591) int local591 = local590 = arg4 << 16;
					if (arg1 < 0) {
						local591 -= local48 * arg1;
						local590 -= local36 * arg1;
						local582 -= local98 * arg1;
						arg1 = 0;
					}
					@Pc(617) int local617 = arg5 << 16;
					if (arg2 < 0) {
						local617 -= local60 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local48 >= local36) && (arg1 != arg2 || local48 <= local60)) {
						@Pc(722) int local722 = arg0 - arg2;
						@Pc(726) int local726 = arg2 - arg1;
						@Pc(730) int local730 = anIntArray297[arg1];
						while (true) {
							local726--;
							if (local726 < 0) {
								while (true) {
									local722--;
									if (local722 < 0) {
										return;
									}
									method2554(SoftwareRaster.pixels, local730, local617 >> 16, local591 >> 16, local582, local86);
									local591 += local48;
									local617 += local60;
									local582 += local98;
									local730 += SoftwareRaster.width;
								}
							}
							method2554(SoftwareRaster.pixels, local730, local590 >> 16, local591 >> 16, local582, local86);
							local591 += local48;
							local590 += local36;
							local582 += local98;
							local730 += SoftwareRaster.width;
						}
					} else {
						@Pc(643) int local643 = arg0 - arg2;
						@Pc(647) int local647 = arg2 - arg1;
						@Pc(651) int local651 = anIntArray297[arg1];
						while (true) {
							local647--;
							if (local647 < 0) {
								while (true) {
									local643--;
									if (local643 < 0) {
										return;
									}
									method2554(SoftwareRaster.pixels, local651, local591 >> 16, local617 >> 16, local582, local86);
									local591 += local48;
									local617 += local60;
									local582 += local98;
									local651 += SoftwareRaster.width;
								}
							}
							method2554(SoftwareRaster.pixels, local651, local591 >> 16, local590 >> 16, local582, local86);
							local591 += local48;
							local590 += local36;
							local582 += local98;
							local651 += SoftwareRaster.width;
						}
					}
				} else {
					@Pc(802) int local802;
					@Pc(803) int local803 = local802 = arg4 << 16;
					if (arg1 < 0) {
						local803 -= local48 * arg1;
						local802 -= local36 * arg1;
						local582 -= local98 * arg1;
						arg1 = 0;
					}
					@Pc(829) int local829 = arg3 << 16;
					if (arg0 < 0) {
						local829 -= local60 * arg0;
						arg0 = 0;
					}
					if (local48 < local36) {
						@Pc(846) int local846 = arg2 - arg0;
						@Pc(850) int local850 = arg0 - arg1;
						@Pc(854) int local854 = anIntArray297[arg1];
						while (true) {
							local850--;
							if (local850 < 0) {
								while (true) {
									local846--;
									if (local846 < 0) {
										return;
									}
									method2554(SoftwareRaster.pixels, local854, local829 >> 16, local802 >> 16, local582, local86);
									local829 += local60;
									local802 += local36;
									local582 += local98;
									local854 += SoftwareRaster.width;
								}
							}
							method2554(SoftwareRaster.pixels, local854, local803 >> 16, local802 >> 16, local582, local86);
							local803 += local48;
							local802 += local36;
							local582 += local98;
							local854 += SoftwareRaster.width;
						}
					} else {
						@Pc(925) int local925 = arg2 - arg0;
						@Pc(929) int local929 = arg0 - arg1;
						@Pc(933) int local933 = anIntArray297[arg1];
						while (true) {
							local929--;
							if (local929 < 0) {
								while (true) {
									local925--;
									if (local925 < 0) {
										return;
									}
									method2554(SoftwareRaster.pixels, local933, local802 >> 16, local829 >> 16, local582, local86);
									local829 += local60;
									local802 += local36;
									local582 += local98;
									local933 += SoftwareRaster.width;
								}
							}
							method2554(SoftwareRaster.pixels, local933, local802 >> 16, local803 >> 16, local582, local86);
							local803 += local48;
							local802 += local36;
							local582 += local98;
							local933 += SoftwareRaster.width;
						}
					}
				}
			}
		} else if (arg2 < anInt3128) {
			if (arg0 > anInt3128) {
				arg0 = anInt3128;
			}
			if (arg1 > anInt3128) {
				arg1 = anInt3128;
			}
			@Pc(1024) int local1024 = (arg8 << 8) + local86 - local86 * arg5;
			if (arg0 < arg1) {
				@Pc(1032) int local1032;
				@Pc(1033) int local1033 = local1032 = arg5 << 16;
				if (arg2 < 0) {
					local1033 -= local36 * arg2;
					local1032 -= local60 * arg2;
					local1024 -= local98 * arg2;
					arg2 = 0;
				}
				@Pc(1059) int local1059 = arg3 << 16;
				if (arg0 < 0) {
					local1059 -= local48 * arg0;
					arg0 = 0;
				}
				if (local36 < local60) {
					@Pc(1076) int local1076 = arg1 - arg0;
					@Pc(1080) int local1080 = arg0 - arg2;
					@Pc(1084) int local1084 = anIntArray297[arg2];
					while (true) {
						local1080--;
						if (local1080 < 0) {
							while (true) {
								local1076--;
								if (local1076 < 0) {
									return;
								}
								method2554(SoftwareRaster.pixels, local1084, local1033 >> 16, local1059 >> 16, local1024, local86);
								local1033 += local36;
								local1059 += local48;
								local1024 += local98;
								local1084 += SoftwareRaster.width;
							}
						}
						method2554(SoftwareRaster.pixels, local1084, local1033 >> 16, local1032 >> 16, local1024, local86);
						local1033 += local36;
						local1032 += local60;
						local1024 += local98;
						local1084 += SoftwareRaster.width;
					}
				} else {
					@Pc(1155) int local1155 = arg1 - arg0;
					@Pc(1159) int local1159 = arg0 - arg2;
					@Pc(1163) int local1163 = anIntArray297[arg2];
					while (true) {
						local1159--;
						if (local1159 < 0) {
							while (true) {
								local1155--;
								if (local1155 < 0) {
									return;
								}
								method2554(SoftwareRaster.pixels, local1163, local1059 >> 16, local1033 >> 16, local1024, local86);
								local1033 += local36;
								local1059 += local48;
								local1024 += local98;
								local1163 += SoftwareRaster.width;
							}
						}
						method2554(SoftwareRaster.pixels, local1163, local1032 >> 16, local1033 >> 16, local1024, local86);
						local1033 += local36;
						local1032 += local60;
						local1024 += local98;
						local1163 += SoftwareRaster.width;
					}
				}
			} else {
				@Pc(1235) int local1235;
				@Pc(1236) int local1236 = local1235 = arg5 << 16;
				if (arg2 < 0) {
					local1236 -= local36 * arg2;
					local1235 -= local60 * arg2;
					local1024 -= local98 * arg2;
					arg2 = 0;
				}
				@Pc(1262) int local1262 = arg4 << 16;
				if (arg1 < 0) {
					local1262 -= local48 * arg1;
					arg1 = 0;
				}
				if (local36 < local60) {
					@Pc(1279) int local1279 = arg0 - arg1;
					@Pc(1283) int local1283 = arg1 - arg2;
					@Pc(1287) int local1287 = anIntArray297[arg2];
					while (true) {
						local1283--;
						if (local1283 < 0) {
							while (true) {
								local1279--;
								if (local1279 < 0) {
									return;
								}
								method2554(SoftwareRaster.pixels, local1287, local1262 >> 16, local1235 >> 16, local1024, local86);
								local1262 += local48;
								local1235 += local60;
								local1024 += local98;
								local1287 += SoftwareRaster.width;
							}
						}
						method2554(SoftwareRaster.pixels, local1287, local1236 >> 16, local1235 >> 16, local1024, local86);
						local1236 += local36;
						local1235 += local60;
						local1024 += local98;
						local1287 += SoftwareRaster.width;
					}
				} else {
					@Pc(1358) int local1358 = arg0 - arg1;
					@Pc(1362) int local1362 = arg1 - arg2;
					@Pc(1366) int local1366 = anIntArray297[arg2];
					while (true) {
						local1362--;
						if (local1362 < 0) {
							while (true) {
								local1358--;
								if (local1358 < 0) {
									return;
								}
								method2554(SoftwareRaster.pixels, local1366, local1235 >> 16, local1262 >> 16, local1024, local86);
								local1262 += local48;
								local1235 += local60;
								local1024 += local98;
								local1366 += SoftwareRaster.width;
							}
						}
						method2554(SoftwareRaster.pixels, local1366, local1235 >> 16, local1236 >> 16, local1024, local86);
						local1236 += local36;
						local1235 += local60;
						local1024 += local98;
						local1366 += SoftwareRaster.width;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([IIIIIIII)V")
	public static void method2554(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (aBoolean217) {
			if (arg3 > anInt3129) {
				arg3 = anInt3129;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
		}
		if (arg2 >= arg3) {
			return;
		}
		@Pc(18) int local18 = arg1 + arg2;
		@Pc(24) int local24 = arg4 + arg5 * arg2;
		if (!aBoolean216) {
			@Pc(324) int local324 = arg3 - arg2;
			if (alpha == 0) {
				do {
					arg0[local18++] = ColorUtils.HSL_TO_RGB[local24 >> 8];
					local24 += arg5;
					local324--;
				} while (local324 > 0);
			} else {
				@Pc(345) int local345 = alpha;
				@Pc(349) int local349 = 256 - alpha;
				do {
					@Pc(355) int local355 = ColorUtils.HSL_TO_RGB[local24 >> 8];
					local24 += arg5;
					local355 = ((local355 & 0xFF00FF) * local349 >> 8 & 0xFF00FF) + ((local355 & 0xFF00) * local349 >> 8 & 0xFF00);
					@Pc(383) int local383 = arg0[local18];
					arg0[local18++] = local355 + ((local383 & 0xFF00FF) * local345 >> 8 & 0xFF00FF) + ((local383 & 0xFF00) * local345 >> 8 & 0xFF00);
					local324--;
				} while (local324 > 0);
			}
			return;
		}
		@Pc(32) int local32 = arg3 - arg2 >> 2;
		arg5 <<= 2;
		if (alpha == 0) {
			if (local32 > 0) {
				do {
					@Pc(46) int local46 = ColorUtils.HSL_TO_RGB[local24 >> 8];
					local24 += arg5;
					arg1 = local18 + 1;
					arg0[local18] = local46;
					arg0[arg1++] = local46;
					arg0[arg1++] = local46;
					local18 = arg1 + 1;
					arg0[arg1] = local46;
					local32--;
				} while (local32 > 0);
			}
			@Pc(79) int local79 = arg3 - arg2 & 0x3;
			if (local79 > 0) {
				@Pc(87) int local87 = ColorUtils.HSL_TO_RGB[local24 >> 8];
				do {
					arg0[local18++] = local87;
					local79--;
				} while (local79 > 0);
			}
			return;
		}
		@Pc(98) int local98 = alpha;
		@Pc(102) int local102 = 256 - alpha;
		if (local32 > 0) {
			do {
				@Pc(110) int local110 = ColorUtils.HSL_TO_RGB[local24 >> 8];
				local24 += arg5;
				local110 = ((local110 & 0xFF00FF) * local102 >> 8 & 0xFF00FF) + ((local110 & 0xFF00) * local102 >> 8 & 0xFF00);
				@Pc(138) int local138 = arg0[local18];
				arg1 = local18 + 1;
				arg0[local18] = local110 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local138 = arg0[arg1];
				arg0[arg1++] = local110 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local138 = arg0[arg1];
				arg0[arg1++] = local110 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local138 = arg0[arg1];
				local18 = arg1 + 1;
				arg0[arg1] = local110 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local32--;
			} while (local32 > 0);
		}
		@Pc(259) int local259 = arg3 - arg2 & 0x3;
		if (local259 <= 0) {
			return;
		}
		@Pc(267) int local267 = ColorUtils.HSL_TO_RGB[local24 >> 8];
		local267 = ((local267 & 0xFF00FF) * local102 >> 8 & 0xFF00FF) + ((local267 & 0xFF00) * local102 >> 8 & 0xFF00);
		do {
			@Pc(291) int local291 = arg0[local18];
			arg0[local18++] = local267 + ((local291 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local291 & 0xFF00) * local98 >> 8 & 0xFF00);
			local259--;
		} while (local259 > 0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([IIIIII)V")
	public static void method2544(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (aBoolean217) {
			if (arg4 > anInt3129) {
				arg4 = anInt3129;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		@Pc(18) int local18 = arg1 + arg3;
		@Pc(24) int local24 = arg4 - arg3 >> 2;
		if (alpha == 0) {
			while (true) {
				local24--;
				if (local24 < 0) {
					@Pc(56) int local56 = arg4 - arg3 & 0x3;
					while (true) {
						local56--;
						if (local56 < 0) {
							return;
						}
						arg0[local18++] = arg2;
					}
				}
				arg1 = local18 + 1;
				arg0[local18] = arg2;
				arg0[arg1++] = arg2;
				arg0[arg1++] = arg2;
				local18 = arg1 + 1;
				arg0[arg1] = arg2;
			}
		} else if (alpha == 254) {
			while (true) {
				local24--;
				if (local24 < 0) {
					@Pc(106) int local106 = arg4 - arg3 & 0x3;
					while (true) {
						local106--;
						if (local106 < 0) {
							return;
						}
						arg0[local18++] = arg0[local18];
					}
				}
				arg1 = local18 + 1;
				arg0[local18] = arg0[arg1];
				arg0[arg1++] = arg0[arg1];
				arg0[arg1++] = arg0[arg1];
				local18 = arg1 + 1;
				arg0[arg1] = arg0[local18];
			}
		} else {
			@Pc(119) int local119 = alpha;
			@Pc(123) int local123 = 256 - alpha;
			arg2 = ((arg2 & 0xFF00FF) * local123 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * local123 >> 8 & 0xFF00);
			while (true) {
				local24--;
				if (local24 < 0) {
					@Pc(269) int local269 = arg4 - arg3 & 0x3;
					while (true) {
						local269--;
						if (local269 < 0) {
							return;
						}
						@Pc(276) int local276 = arg0[local18];
						arg0[local18++] = arg2 + ((local276 & 0xFF00FF) * local119 >> 8 & 0xFF00FF) + ((local276 & 0xFF00) * local119 >> 8 & 0xFF00);
					}
				}
				@Pc(150) int local150 = arg0[local18];
				arg1 = local18 + 1;
				arg0[local18] = arg2 + ((local150 & 0xFF00FF) * local119 >> 8 & 0xFF00FF) + ((local150 & 0xFF00) * local119 >> 8 & 0xFF00);
				local150 = arg0[arg1];
				arg0[arg1++] = arg2 + ((local150 & 0xFF00FF) * local119 >> 8 & 0xFF00FF) + ((local150 & 0xFF00) * local119 >> 8 & 0xFF00);
				local150 = arg0[arg1];
				arg0[arg1++] = arg2 + ((local150 & 0xFF00FF) * local119 >> 8 & 0xFF00FF) + ((local150 & 0xFF00) * local119 >> 8 & 0xFF00);
				local150 = arg0[arg1];
				local18 = arg1 + 1;
				arg0[arg1] = arg2 + ((local150 & 0xFF00FF) * local119 >> 8 & 0xFF00FF) + ((local150 & 0xFF00) * local119 >> 8 & 0xFF00);
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()I")
	public static int method2546() {
		return anIntArray297[0] / SoftwareRaster.width;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V")
	private static void method2547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt3129 = arg2 - arg0;
		anInt3128 = arg3 - arg1;
		method2555();
		if (anIntArray297.length < anInt3128) {
			anIntArray297 = new int[IntUtils.clp2(anInt3128)];
		}
		@Pc(23) int local23 = arg1 * SoftwareRaster.width + arg0;
		for (@Pc(25) int local25 = 0; local25 < anInt3128; local25++) {
			anIntArray297[local25] = local23;
			local23 += SoftwareRaster.width;
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "()I")
	public static int method2548() {
		return anIntArray297[0] % SoftwareRaster.width;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method2549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int texture) {
		@Pc(5) int[] local5 = textureProvider.method445(texture, ColorUtils.brightness);
		if (local5 == null || alpha > 10) {
			@Pc(15) int averageColor = textureProvider.getAverageColor(texture);
			aBoolean218 = true;
			method2543(arg0, arg1, arg2, arg3, arg4, arg5, ColorUtils.multiplyLightness2(averageColor, arg6), ColorUtils.multiplyLightness2(averageColor, arg7), ColorUtils.multiplyLightness2(averageColor, arg8));
			return;
		}
		lowDetail = textureProvider.isLowDetail(texture);
		aBoolean219 = textureProvider.method443(texture);
		@Pc(48) int local48 = arg4 - arg3;
		@Pc(52) int local52 = arg1 - arg0;
		@Pc(56) int local56 = arg5 - arg3;
		@Pc(60) int local60 = arg2 - arg0;
		@Pc(64) int local64 = arg7 - arg6;
		@Pc(68) int local68 = arg8 - arg6;
		@Pc(70) int local70 = 0;
		if (arg1 != arg0) {
			local70 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(85) int local85 = 0;
		if (arg2 != arg1) {
			local85 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(100) int local100 = 0;
		if (arg2 != arg0) {
			local100 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(121) int local121 = local48 * local60 - local56 * local52;
		if (local121 == 0) {
			return;
		}
		@Pc(136) int local136 = (local64 * local60 - local68 * local52 << 9) / local121;
		@Pc(148) int local148 = (local68 * local48 - local64 * local56 << 9) / local121;
		arg10 = arg9 - arg10;
		arg13 = arg12 - arg13;
		arg16 = arg15 - arg16;
		arg11 -= arg9;
		arg14 -= arg12;
		arg17 -= arg15;
		@Pc(182) int local182 = arg11 * arg12 - arg14 * arg9 << 14;
		@Pc(192) int local192 = arg14 * arg15 - arg17 * arg12 << 8;
		@Pc(202) int local202 = arg17 * arg9 - arg11 * arg15 << 5;
		@Pc(212) int local212 = arg10 * arg12 - arg13 * arg9 << 14;
		@Pc(222) int local222 = arg13 * arg15 - arg16 * arg12 << 8;
		@Pc(232) int local232 = arg16 * arg9 - arg10 * arg15 << 5;
		@Pc(242) int local242 = arg13 * arg11 - arg10 * arg14 << 14;
		@Pc(252) int local252 = arg16 * arg14 - arg13 * arg17 << 8;
		@Pc(262) int local262 = arg10 * arg17 - arg16 * arg11 << 5;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt3128) {
				if (arg1 > anInt3128) {
					arg1 = anInt3128;
				}
				if (arg2 > anInt3128) {
					arg2 = anInt3128;
				}
				@Pc(292) int local292 = (arg6 << 9) + local136 - local136 * arg3;
				if (arg1 < arg2) {
					@Pc(300) int local300;
					@Pc(301) int local301 = local300 = arg3 << 16;
					if (arg0 < 0) {
						local301 -= local100 * arg0;
						local300 -= local70 * arg0;
						local292 -= local148 * arg0;
						arg0 = 0;
					}
					@Pc(327) int local327 = arg4 << 16;
					if (arg1 < 0) {
						local327 -= local85 * arg1;
						arg1 = 0;
					}
					@Pc(341) int local341 = arg0 - anInt3126;
					@Pc(347) int local347 = local182 + local202 * local341;
					@Pc(353) int local353 = local212 + local232 * local341;
					@Pc(359) int local359 = local242 + local262 * local341;
					if (arg0 != arg1 && local100 < local70 || arg0 == arg1 && local100 > local85) {
						@Pc(375) int local375 = arg2 - arg1;
						@Pc(379) int local379 = arg1 - arg0;
						@Pc(383) int local383 = anIntArray297[arg0];
						while (true) {
							local379--;
							if (local379 < 0) {
								while (true) {
									local375--;
									if (local375 < 0) {
										return;
									}
									method2557(SoftwareRaster.pixels, local5, local383, local301 >> 16, local327 >> 16, local292, local136, local347, local353, local359, local192, local222, local252);
									local301 += local100;
									local327 += local85;
									local292 += local148;
									local383 += SoftwareRaster.width;
									local347 += local202;
									local353 += local232;
									local359 += local262;
								}
							}
							method2557(SoftwareRaster.pixels, local5, local383, local301 >> 16, local300 >> 16, local292, local136, local347, local353, local359, local192, local222, local252);
							local301 += local100;
							local300 += local70;
							local292 += local148;
							local383 += SoftwareRaster.width;
							local347 += local202;
							local353 += local232;
							local359 += local262;
						}
					} else {
						@Pc(492) int local492 = arg2 - arg1;
						@Pc(496) int local496 = arg1 - arg0;
						@Pc(500) int local500 = anIntArray297[arg0];
						while (true) {
							local496--;
							if (local496 < 0) {
								while (true) {
									local492--;
									if (local492 < 0) {
										return;
									}
									method2557(SoftwareRaster.pixels, local5, local500, local327 >> 16, local301 >> 16, local292, local136, local347, local353, local359, local192, local222, local252);
									local301 += local100;
									local327 += local85;
									local292 += local148;
									local500 += SoftwareRaster.width;
									local347 += local202;
									local353 += local232;
									local359 += local262;
								}
							}
							method2557(SoftwareRaster.pixels, local5, local500, local300 >> 16, local301 >> 16, local292, local136, local347, local353, local359, local192, local222, local252);
							local301 += local100;
							local300 += local70;
							local292 += local148;
							local500 += SoftwareRaster.width;
							local347 += local202;
							local353 += local232;
							local359 += local262;
						}
					}
				} else {
					@Pc(610) int local610;
					@Pc(611) int local611 = local610 = arg3 << 16;
					if (arg0 < 0) {
						local611 -= local100 * arg0;
						local610 -= local70 * arg0;
						local292 -= local148 * arg0;
						arg0 = 0;
					}
					@Pc(637) int local637 = arg5 << 16;
					if (arg2 < 0) {
						local637 -= local85 * arg2;
						arg2 = 0;
					}
					@Pc(651) int local651 = arg0 - anInt3126;
					@Pc(657) int local657 = local182 + local202 * local651;
					@Pc(663) int local663 = local212 + local232 * local651;
					@Pc(669) int local669 = local242 + local262 * local651;
					if ((arg0 == arg2 || local100 >= local70) && (arg0 != arg2 || local85 <= local70)) {
						@Pc(802) int local802 = arg1 - arg2;
						@Pc(806) int local806 = arg2 - arg0;
						@Pc(810) int local810 = anIntArray297[arg0];
						while (true) {
							local806--;
							if (local806 < 0) {
								while (true) {
									local802--;
									if (local802 < 0) {
										return;
									}
									method2557(SoftwareRaster.pixels, local5, local810, local610 >> 16, local637 >> 16, local292, local136, local657, local663, local669, local192, local222, local252);
									local637 += local85;
									local610 += local70;
									local292 += local148;
									local810 += SoftwareRaster.width;
									local657 += local202;
									local663 += local232;
									local669 += local262;
								}
							}
							method2557(SoftwareRaster.pixels, local5, local810, local610 >> 16, local611 >> 16, local292, local136, local657, local663, local669, local192, local222, local252);
							local611 += local100;
							local610 += local70;
							local292 += local148;
							local810 += SoftwareRaster.width;
							local657 += local202;
							local663 += local232;
							local669 += local262;
						}
					} else {
						@Pc(685) int local685 = arg1 - arg2;
						@Pc(689) int local689 = arg2 - arg0;
						@Pc(693) int local693 = anIntArray297[arg0];
						while (true) {
							local689--;
							if (local689 < 0) {
								while (true) {
									local685--;
									if (local685 < 0) {
										return;
									}
									method2557(SoftwareRaster.pixels, local5, local693, local637 >> 16, local610 >> 16, local292, local136, local657, local663, local669, local192, local222, local252);
									local637 += local85;
									local610 += local70;
									local292 += local148;
									local693 += SoftwareRaster.width;
									local657 += local202;
									local663 += local232;
									local669 += local262;
								}
							}
							method2557(SoftwareRaster.pixels, local5, local693, local611 >> 16, local610 >> 16, local292, local136, local657, local663, local669, local192, local222, local252);
							local611 += local100;
							local610 += local70;
							local292 += local148;
							local693 += SoftwareRaster.width;
							local657 += local202;
							local663 += local232;
							local669 += local262;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt3128) {
				if (arg2 > anInt3128) {
					arg2 = anInt3128;
				}
				if (arg0 > anInt3128) {
					arg0 = anInt3128;
				}
				@Pc(942) int local942 = (arg7 << 9) + local136 - local136 * arg4;
				if (arg2 < arg0) {
					@Pc(950) int local950;
					@Pc(951) int local951 = local950 = arg4 << 16;
					if (arg1 < 0) {
						local951 -= local70 * arg1;
						local950 -= local85 * arg1;
						local942 -= local148 * arg1;
						arg1 = 0;
					}
					@Pc(977) int local977 = arg5 << 16;
					if (arg2 < 0) {
						local977 -= local100 * arg2;
						arg2 = 0;
					}
					@Pc(991) int local991 = arg1 - anInt3126;
					@Pc(997) int local997 = local182 + local202 * local991;
					@Pc(1003) int local1003 = local212 + local232 * local991;
					@Pc(1009) int local1009 = local242 + local262 * local991;
					if (arg1 != arg2 && local70 < local85 || arg1 == arg2 && local70 > local100) {
						@Pc(1025) int local1025 = arg0 - arg2;
						@Pc(1029) int local1029 = arg2 - arg1;
						@Pc(1033) int local1033 = anIntArray297[arg1];
						while (true) {
							local1029--;
							if (local1029 < 0) {
								while (true) {
									local1025--;
									if (local1025 < 0) {
										return;
									}
									method2557(SoftwareRaster.pixels, local5, local1033, local951 >> 16, local977 >> 16, local942, local136, local997, local1003, local1009, local192, local222, local252);
									local951 += local70;
									local977 += local100;
									local942 += local148;
									local1033 += SoftwareRaster.width;
									local997 += local202;
									local1003 += local232;
									local1009 += local262;
								}
							}
							method2557(SoftwareRaster.pixels, local5, local1033, local951 >> 16, local950 >> 16, local942, local136, local997, local1003, local1009, local192, local222, local252);
							local951 += local70;
							local950 += local85;
							local942 += local148;
							local1033 += SoftwareRaster.width;
							local997 += local202;
							local1003 += local232;
							local1009 += local262;
						}
					} else {
						@Pc(1142) int local1142 = arg0 - arg2;
						@Pc(1146) int local1146 = arg2 - arg1;
						@Pc(1150) int local1150 = anIntArray297[arg1];
						while (true) {
							local1146--;
							if (local1146 < 0) {
								while (true) {
									local1142--;
									if (local1142 < 0) {
										return;
									}
									method2557(SoftwareRaster.pixels, local5, local1150, local977 >> 16, local951 >> 16, local942, local136, local997, local1003, local1009, local192, local222, local252);
									local951 += local70;
									local977 += local100;
									local942 += local148;
									local1150 += SoftwareRaster.width;
									local997 += local202;
									local1003 += local232;
									local1009 += local262;
								}
							}
							method2557(SoftwareRaster.pixels, local5, local1150, local950 >> 16, local951 >> 16, local942, local136, local997, local1003, local1009, local192, local222, local252);
							local951 += local70;
							local950 += local85;
							local942 += local148;
							local1150 += SoftwareRaster.width;
							local997 += local202;
							local1003 += local232;
							local1009 += local262;
						}
					}
				} else {
					@Pc(1260) int local1260;
					@Pc(1261) int local1261 = local1260 = arg4 << 16;
					if (arg1 < 0) {
						local1261 -= local70 * arg1;
						local1260 -= local85 * arg1;
						local942 -= local148 * arg1;
						arg1 = 0;
					}
					@Pc(1287) int local1287 = arg3 << 16;
					if (arg0 < 0) {
						local1287 -= local100 * arg0;
						arg0 = 0;
					}
					@Pc(1301) int local1301 = arg1 - anInt3126;
					@Pc(1307) int local1307 = local182 + local202 * local1301;
					@Pc(1313) int local1313 = local212 + local232 * local1301;
					@Pc(1319) int local1319 = local242 + local262 * local1301;
					if (local70 < local85) {
						@Pc(1326) int local1326 = arg2 - arg0;
						@Pc(1330) int local1330 = arg0 - arg1;
						@Pc(1334) int local1334 = anIntArray297[arg1];
						while (true) {
							local1330--;
							if (local1330 < 0) {
								while (true) {
									local1326--;
									if (local1326 < 0) {
										return;
									}
									method2557(SoftwareRaster.pixels, local5, local1334, local1287 >> 16, local1260 >> 16, local942, local136, local1307, local1313, local1319, local192, local222, local252);
									local1287 += local100;
									local1260 += local85;
									local942 += local148;
									local1334 += SoftwareRaster.width;
									local1307 += local202;
									local1313 += local232;
									local1319 += local262;
								}
							}
							method2557(SoftwareRaster.pixels, local5, local1334, local1261 >> 16, local1260 >> 16, local942, local136, local1307, local1313, local1319, local192, local222, local252);
							local1261 += local70;
							local1260 += local85;
							local942 += local148;
							local1334 += SoftwareRaster.width;
							local1307 += local202;
							local1313 += local232;
							local1319 += local262;
						}
					} else {
						@Pc(1443) int local1443 = arg2 - arg0;
						@Pc(1447) int local1447 = arg0 - arg1;
						@Pc(1451) int local1451 = anIntArray297[arg1];
						while (true) {
							local1447--;
							if (local1447 < 0) {
								while (true) {
									local1443--;
									if (local1443 < 0) {
										return;
									}
									method2557(SoftwareRaster.pixels, local5, local1451, local1260 >> 16, local1287 >> 16, local942, local136, local1307, local1313, local1319, local192, local222, local252);
									local1287 += local100;
									local1260 += local85;
									local942 += local148;
									local1451 += SoftwareRaster.width;
									local1307 += local202;
									local1313 += local232;
									local1319 += local262;
								}
							}
							method2557(SoftwareRaster.pixels, local5, local1451, local1260 >> 16, local1261 >> 16, local942, local136, local1307, local1313, local1319, local192, local222, local252);
							local1261 += local70;
							local1260 += local85;
							local942 += local148;
							local1451 += SoftwareRaster.width;
							local1307 += local202;
							local1313 += local232;
							local1319 += local262;
						}
					}
				}
			}
		} else if (arg2 < anInt3128) {
			if (arg0 > anInt3128) {
				arg0 = anInt3128;
			}
			if (arg1 > anInt3128) {
				arg1 = anInt3128;
			}
			@Pc(1580) int local1580 = (arg8 << 9) + local136 - local136 * arg5;
			if (arg0 < arg1) {
				@Pc(1588) int local1588;
				@Pc(1589) int local1589 = local1588 = arg5 << 16;
				if (arg2 < 0) {
					local1589 -= local85 * arg2;
					local1588 -= local100 * arg2;
					local1580 -= local148 * arg2;
					arg2 = 0;
				}
				@Pc(1615) int local1615 = arg3 << 16;
				if (arg0 < 0) {
					local1615 -= local70 * arg0;
					arg0 = 0;
				}
				@Pc(1629) int local1629 = arg2 - anInt3126;
				@Pc(1635) int local1635 = local182 + local202 * local1629;
				@Pc(1641) int local1641 = local212 + local232 * local1629;
				@Pc(1647) int local1647 = local242 + local262 * local1629;
				if (local85 < local100) {
					@Pc(1654) int local1654 = arg1 - arg0;
					@Pc(1658) int local1658 = arg0 - arg2;
					@Pc(1662) int local1662 = anIntArray297[arg2];
					while (true) {
						local1658--;
						if (local1658 < 0) {
							while (true) {
								local1654--;
								if (local1654 < 0) {
									return;
								}
								method2557(SoftwareRaster.pixels, local5, local1662, local1589 >> 16, local1615 >> 16, local1580, local136, local1635, local1641, local1647, local192, local222, local252);
								local1589 += local85;
								local1615 += local70;
								local1580 += local148;
								local1662 += SoftwareRaster.width;
								local1635 += local202;
								local1641 += local232;
								local1647 += local262;
							}
						}
						method2557(SoftwareRaster.pixels, local5, local1662, local1589 >> 16, local1588 >> 16, local1580, local136, local1635, local1641, local1647, local192, local222, local252);
						local1589 += local85;
						local1588 += local100;
						local1580 += local148;
						local1662 += SoftwareRaster.width;
						local1635 += local202;
						local1641 += local232;
						local1647 += local262;
					}
				} else {
					@Pc(1771) int local1771 = arg1 - arg0;
					@Pc(1775) int local1775 = arg0 - arg2;
					@Pc(1779) int local1779 = anIntArray297[arg2];
					while (true) {
						local1775--;
						if (local1775 < 0) {
							while (true) {
								local1771--;
								if (local1771 < 0) {
									return;
								}
								method2557(SoftwareRaster.pixels, local5, local1779, local1615 >> 16, local1589 >> 16, local1580, local136, local1635, local1641, local1647, local192, local222, local252);
								local1589 += local85;
								local1615 += local70;
								local1580 += local148;
								local1779 += SoftwareRaster.width;
								local1635 += local202;
								local1641 += local232;
								local1647 += local262;
							}
						}
						method2557(SoftwareRaster.pixels, local5, local1779, local1588 >> 16, local1589 >> 16, local1580, local136, local1635, local1641, local1647, local192, local222, local252);
						local1589 += local85;
						local1588 += local100;
						local1580 += local148;
						local1779 += SoftwareRaster.width;
						local1635 += local202;
						local1641 += local232;
						local1647 += local262;
					}
				}
			} else {
				@Pc(1889) int local1889;
				@Pc(1890) int local1890 = local1889 = arg5 << 16;
				if (arg2 < 0) {
					local1890 -= local85 * arg2;
					local1889 -= local100 * arg2;
					local1580 -= local148 * arg2;
					arg2 = 0;
				}
				@Pc(1916) int local1916 = arg4 << 16;
				if (arg1 < 0) {
					local1916 -= local70 * arg1;
					arg1 = 0;
				}
				@Pc(1930) int local1930 = arg2 - anInt3126;
				@Pc(1936) int local1936 = local182 + local202 * local1930;
				@Pc(1942) int local1942 = local212 + local232 * local1930;
				@Pc(1948) int local1948 = local242 + local262 * local1930;
				if (local85 < local100) {
					@Pc(1955) int local1955 = arg0 - arg1;
					@Pc(1959) int local1959 = arg1 - arg2;
					@Pc(1963) int local1963 = anIntArray297[arg2];
					while (true) {
						local1959--;
						if (local1959 < 0) {
							while (true) {
								local1955--;
								if (local1955 < 0) {
									return;
								}
								method2557(SoftwareRaster.pixels, local5, local1963, local1916 >> 16, local1889 >> 16, local1580, local136, local1936, local1942, local1948, local192, local222, local252);
								local1916 += local70;
								local1889 += local100;
								local1580 += local148;
								local1963 += SoftwareRaster.width;
								local1936 += local202;
								local1942 += local232;
								local1948 += local262;
							}
						}
						method2557(SoftwareRaster.pixels, local5, local1963, local1890 >> 16, local1889 >> 16, local1580, local136, local1936, local1942, local1948, local192, local222, local252);
						local1890 += local85;
						local1889 += local100;
						local1580 += local148;
						local1963 += SoftwareRaster.width;
						local1936 += local202;
						local1942 += local232;
						local1948 += local262;
					}
				} else {
					@Pc(2072) int local2072 = arg0 - arg1;
					@Pc(2076) int local2076 = arg1 - arg2;
					@Pc(2080) int local2080 = anIntArray297[arg2];
					while (true) {
						local2076--;
						if (local2076 < 0) {
							while (true) {
								local2072--;
								if (local2072 < 0) {
									return;
								}
								method2557(SoftwareRaster.pixels, local5, local2080, local1889 >> 16, local1916 >> 16, local1580, local136, local1936, local1942, local1948, local192, local222, local252);
								local1916 += local70;
								local1889 += local100;
								local1580 += local148;
								local2080 += SoftwareRaster.width;
								local1936 += local202;
								local1942 += local232;
								local1948 += local262;
							}
						}
						method2557(SoftwareRaster.pixels, local5, local2080, local1889 >> 16, local1890 >> 16, local1580, local136, local1936, local1942, local1948, local192, local222, local252);
						local1890 += local85;
						local1889 += local100;
						local1580 += local148;
						local2080 += SoftwareRaster.width;
						local1936 += local202;
						local1942 += local232;
						local1948 += local262;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	public static void method2557(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12) {
		if (aBoolean217) {
			if (arg4 > anInt3129) {
				arg4 = anInt3129;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		@Pc(18) int local18 = arg2 + arg3;
		@Pc(24) int local24 = arg5 + arg6 * arg3;
		@Pc(28) int local28 = arg4 - arg3;
		@Pc(154) int local154;
		if (!lowDetail) {
			@Pc(954) int local954 = arg3 - anInt3125;
			arg7 += (arg10 >> 3) * local954;
			arg8 += (arg11 >> 3) * local954;
			arg9 += (arg12 >> 3) * local954;
			@Pc(982) int local982 = arg9 >> 14;
			@Pc(988) int local988;
			@Pc(992) int local992;
			if (local982 == 0) {
				local988 = 0;
				local992 = 0;
			} else {
				local988 = arg7 / local982;
				local992 = arg8 / local982;
			}
			@Pc(1001) int local1001 = arg7 + arg10;
			@Pc(1005) int local1005 = arg8 + arg11;
			@Pc(1009) int local1009 = arg9 + arg12;
			@Pc(1013) int local1013 = local1009 >> 14;
			@Pc(1019) int local1019;
			@Pc(1023) int local1023;
			if (local1013 == 0) {
				local1019 = 0;
				local1023 = 0;
			} else {
				local1019 = local1001 / local1013;
				local1023 = local1005 / local1013;
			}
			@Pc(1034) int local1034 = (local988 << 18) + local992;
			@Pc(1048) int local1048 = (local1019 - local988 >> 3 << 18) + (local1023 - local992 >> 3);
			@Pc(1052) int local1052 = local28 >> 3;
			arg6 <<= 3;
			@Pc(1060) int local1060 = local24 >> 8;
			if (aBoolean219) {
				if (local1052 > 0) {
					do {
						@Pc(1074) int local1074 = arg1[(local1034 & 0x3F80) + (local1034 >>> 25)];
						arg2 = local18 + 1;
						arg0[local18] = ((local1074 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local1074 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						@Pc(1099) int local1099 = local1034 + local1048;
						local1074 = arg1[(local1099 & 0x3F80) + (local1099 >>> 25)];
						arg0[arg2++] = ((local1074 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local1074 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						local1099 += local1048;
						local1074 = arg1[(local1099 & 0x3F80) + (local1099 >>> 25)];
						arg0[arg2++] = ((local1074 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local1074 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						local1099 += local1048;
						local1074 = arg1[(local1099 & 0x3F80) + (local1099 >>> 25)];
						arg0[arg2++] = ((local1074 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local1074 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						local1099 += local1048;
						local1074 = arg1[(local1099 & 0x3F80) + (local1099 >>> 25)];
						arg0[arg2++] = ((local1074 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local1074 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						local1099 += local1048;
						local1074 = arg1[(local1099 & 0x3F80) + (local1099 >>> 25)];
						arg0[arg2++] = ((local1074 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local1074 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						local1099 += local1048;
						local1074 = arg1[(local1099 & 0x3F80) + (local1099 >>> 25)];
						arg0[arg2++] = ((local1074 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local1074 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						local1099 += local1048;
						local1074 = arg1[(local1099 & 0x3F80) + (local1099 >>> 25)];
						local18 = arg2 + 1;
						arg0[arg2] = ((local1074 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local1074 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						@Pc(1346) int local1346 = local1019;
						@Pc(1348) int local1348 = local1023;
						local1001 += arg10;
						local1005 += arg11;
						local1009 += arg12;
						@Pc(1364) int local1364 = local1009 >> 14;
						if (local1364 == 0) {
							local1019 = 0;
							local1023 = 0;
						} else {
							local1019 = local1001 / local1364;
							local1023 = local1005 / local1364;
						}
						local1034 = (local1346 << 18) + local1348;
						local1048 = (local1019 - local1346 >> 3 << 18) + (local1023 - local1348 >> 3);
						local24 += arg6;
						local1060 = local24 >> 8;
						local1052--;
					} while (local1052 > 0);
				}
				@Pc(1416) int local1416 = arg4 - arg3 & 0x7;
				if (local1416 > 0) {
					do {
						@Pc(1428) int local1428 = arg1[(local1034 & 0x3F80) + (local1034 >>> 25)];
						arg0[local18++] = ((local1428 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local1428 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						local1034 += local1048;
						local1416--;
					} while (local1416 > 0);
				}
			} else {
				if (local1052 > 0) {
					do {
						if ((local154 = arg1[(local1034 & 0x3F80) + (local1034 >>> 25)]) != 0) {
							arg0[local18] = ((local154 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local154 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						}
						arg2 = local18 + 1;
						@Pc(1496) int local1496 = local1034 + local1048;
						if ((local154 = arg1[(local1496 & 0x3F80) + (local1496 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local154 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1533) int local1533 = local1496 + local1048;
						if ((local154 = arg1[(local1533 & 0x3F80) + (local1533 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local154 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1570) int local1570 = local1533 + local1048;
						if ((local154 = arg1[(local1570 & 0x3F80) + (local1570 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local154 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1607) int local1607 = local1570 + local1048;
						if ((local154 = arg1[(local1607 & 0x3F80) + (local1607 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local154 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1644) int local1644 = local1607 + local1048;
						if ((local154 = arg1[(local1644 & 0x3F80) + (local1644 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local154 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1681) int local1681 = local1644 + local1048;
						if ((local154 = arg1[(local1681 & 0x3F80) + (local1681 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local154 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1718) int local1718 = local1681 + local1048;
						if ((local154 = arg1[(local1718 & 0x3F80) + (local1718 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local154 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						}
						local18 = arg2 + 1;
						@Pc(1757) int local1757 = local1019;
						@Pc(1759) int local1759 = local1023;
						local1001 += arg10;
						local1005 += arg11;
						local1009 += arg12;
						@Pc(1775) int local1775 = local1009 >> 14;
						if (local1775 == 0) {
							local1019 = 0;
							local1023 = 0;
						} else {
							local1019 = local1001 / local1775;
							local1023 = local1005 / local1775;
						}
						local1034 = (local1757 << 18) + local1759;
						local1048 = (local1019 - local1757 >> 3 << 18) + (local1023 - local1759 >> 3);
						local24 += arg6;
						local1060 = local24 >> 8;
						local1052--;
					} while (local1052 > 0);
				}
				@Pc(1827) int local1827 = arg4 - arg3 & 0x7;
				if (local1827 > 0) {
					do {
						if ((local154 = arg1[(local1034 & 0x3F80) + (local1034 >>> 25)]) != 0) {
							arg0[local18] = ((local154 & 0xFF00FF) * local1060 & 0xFF00FF00) + ((local154 & 0xFF00) * local1060 & 0xFF0000) >> 8;
						}
						local18++;
						local1034 += local1048;
						local1827--;
					} while (local1827 > 0);
				}
			}
			return;
		}
		@Pc(34) int local34 = arg3 - anInt3125;
		arg7 += (arg10 >> 3) * local34;
		arg8 += (arg11 >> 3) * local34;
		arg9 += (arg12 >> 3) * local34;
		@Pc(62) int local62 = arg9 >> 12;
		@Pc(68) int local68;
		@Pc(72) int local72;
		if (local62 == 0) {
			local68 = 0;
			local72 = 0;
		} else {
			local68 = arg7 / local62;
			local72 = arg8 / local62;
		}
		@Pc(81) int local81 = arg7 + arg10;
		@Pc(85) int local85 = arg8 + arg11;
		@Pc(89) int local89 = arg9 + arg12;
		@Pc(93) int local93 = local89 >> 12;
		@Pc(99) int local99;
		@Pc(103) int local103;
		if (local93 == 0) {
			local99 = 0;
			local103 = 0;
		} else {
			local99 = local81 / local93;
			local103 = local85 / local93;
		}
		@Pc(114) int local114 = (local68 << 20) + local72;
		@Pc(128) int local128 = (local99 - local68 >> 3 << 20) + (local103 - local72 >> 3);
		@Pc(132) int local132 = local28 >> 3;
		arg6 <<= 3;
		@Pc(140) int local140 = local24 >> 8;
		if (aBoolean219) {
			if (local132 > 0) {
				do {
					local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg2 = local18 + 1;
					arg0[local18] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					@Pc(179) int local179 = local114 + local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					local18 = arg2 + 1;
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					@Pc(426) int local426 = local99;
					@Pc(428) int local428 = local103;
					local81 += arg10;
					local85 += arg11;
					local89 += arg12;
					@Pc(444) int local444 = local89 >> 12;
					if (local444 == 0) {
						local99 = 0;
						local103 = 0;
					} else {
						local99 = local81 / local444;
						local103 = local85 / local444;
					}
					local114 = (local426 << 20) + local428;
					local128 = (local99 - local426 >> 3 << 20) + (local103 - local428 >> 3);
					local24 += arg6;
					local140 = local24 >> 8;
					local132--;
				} while (local132 > 0);
			}
			@Pc(496) int local496 = arg4 - arg3 & 0x7;
			if (local496 > 0) {
				do {
					@Pc(508) int local508 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local18++] = ((local508 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local508 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					local496--;
				} while (local496 > 0);
			}
			return;
		}
		if (local132 > 0) {
			do {
				if ((local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local18] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2 = local18 + 1;
				@Pc(576) int local576 = local114 + local128;
				if ((local154 = arg1[(local576 & 0xFC0) + (local576 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(613) int local613 = local576 + local128;
				if ((local154 = arg1[(local613 & 0xFC0) + (local613 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(650) int local650 = local613 + local128;
				if ((local154 = arg1[(local650 & 0xFC0) + (local650 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(687) int local687 = local650 + local128;
				if ((local154 = arg1[(local687 & 0xFC0) + (local687 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(724) int local724 = local687 + local128;
				if ((local154 = arg1[(local724 & 0xFC0) + (local724 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(761) int local761 = local724 + local128;
				if ((local154 = arg1[(local761 & 0xFC0) + (local761 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(798) int local798 = local761 + local128;
				if ((local154 = arg1[(local798 & 0xFC0) + (local798 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local18 = arg2 + 1;
				@Pc(837) int local837 = local99;
				@Pc(839) int local839 = local103;
				local81 += arg10;
				local85 += arg11;
				local89 += arg12;
				@Pc(855) int local855 = local89 >> 12;
				if (local855 == 0) {
					local99 = 0;
					local103 = 0;
				} else {
					local99 = local81 / local855;
					local103 = local85 / local855;
				}
				local114 = (local837 << 20) + local839;
				local128 = (local99 - local837 >> 3 << 20) + (local103 - local839 >> 3);
				local24 += arg6;
				local140 = local24 >> 8;
				local132--;
			} while (local132 > 0);
		}
		@Pc(907) int local907 = arg4 - arg3 & 0x7;
		if (local907 <= 0) {
			return;
		}
		do {
			if ((local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
				arg0[local18] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
			}
			local18++;
			local114 += local128;
			local907--;
		} while (local907 > 0);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method2558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int texture) {
		@Pc(5) int[] local5 = textureProvider.method445(texture, ColorUtils.brightness);
		if (local5 == null) {
			@Pc(12) int averageColor = textureProvider.getAverageColor(texture);
			method2543(arg0, arg1, arg2, arg3, arg4, arg5, ColorUtils.multiplyLightness2(averageColor, arg6), ColorUtils.multiplyLightness2(averageColor, arg7), ColorUtils.multiplyLightness2(averageColor, arg8));
			return;
		}
		lowDetail = textureProvider.isLowDetail(texture);
		aBoolean219 = textureProvider.method443(texture);
		@Pc(43) int local43 = arg4 - arg3;
		@Pc(47) int local47 = arg1 - arg0;
		@Pc(51) int local51 = arg5 - arg3;
		@Pc(55) int local55 = arg2 - arg0;
		@Pc(59) int local59 = arg7 - arg6;
		@Pc(63) int local63 = arg8 - arg6;
		@Pc(65) int local65 = 0;
		if (arg1 != arg0) {
			local65 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(80) int local80 = 0;
		if (arg2 != arg1) {
			local80 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(95) int local95 = 0;
		if (arg2 != arg0) {
			local95 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(116) int local116 = local43 * local55 - local51 * local47;
		if (local116 == 0) {
			return;
		}
		@Pc(131) int local131 = (local59 * local55 - local63 * local47 << 9) / local116;
		@Pc(143) int local143 = (local63 * local43 - local59 * local51 << 9) / local116;
		arg10 = arg9 - arg10;
		arg13 = arg12 - arg13;
		arg16 = arg15 - arg16;
		arg11 -= arg9;
		arg14 -= arg12;
		arg17 -= arg15;
		@Pc(177) int local177 = arg11 * arg12 - arg14 * arg9 << 14;
		@Pc(187) int local187 = arg14 * arg15 - arg17 * arg12 << 5;
		@Pc(197) int local197 = arg17 * arg9 - arg11 * arg15 << 5;
		@Pc(207) int local207 = arg10 * arg12 - arg13 * arg9 << 14;
		@Pc(217) int local217 = arg13 * arg15 - arg16 * arg12 << 5;
		@Pc(227) int local227 = arg16 * arg9 - arg10 * arg15 << 5;
		@Pc(237) int local237 = arg13 * arg11 - arg10 * arg14 << 14;
		@Pc(247) int local247 = arg16 * arg14 - arg13 * arg17 << 5;
		@Pc(257) int local257 = arg10 * arg17 - arg16 * arg11 << 5;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt3128) {
				if (arg1 > anInt3128) {
					arg1 = anInt3128;
				}
				if (arg2 > anInt3128) {
					arg2 = anInt3128;
				}
				@Pc(287) int local287 = (arg6 << 9) + local131 - local131 * arg3;
				if (arg1 < arg2) {
					@Pc(295) int local295;
					@Pc(296) int local296 = local295 = arg3 << 16;
					if (arg0 < 0) {
						local296 -= local95 * arg0;
						local295 -= local65 * arg0;
						local287 -= local143 * arg0;
						arg0 = 0;
					}
					@Pc(322) int local322 = arg4 << 16;
					if (arg1 < 0) {
						local322 -= local80 * arg1;
						arg1 = 0;
					}
					@Pc(336) int local336 = arg0 - anInt3126;
					@Pc(342) int local342 = local177 + local197 * local336;
					@Pc(348) int local348 = local207 + local227 * local336;
					@Pc(354) int local354 = local237 + local257 * local336;
					if (arg0 != arg1 && local95 < local65 || arg0 == arg1 && local95 > local80) {
						@Pc(370) int local370 = arg2 - arg1;
						@Pc(374) int local374 = arg1 - arg0;
						@Pc(378) int local378 = anIntArray297[arg0];
						while (true) {
							local374--;
							if (local374 < 0) {
								while (true) {
									local370--;
									if (local370 < 0) {
										return;
									}
									method2560(SoftwareRaster.pixels, local5, local378, local296 >> 16, local322 >> 16, local287, local131, local342, local348, local354, local187, local217, local247);
									local296 += local95;
									local322 += local80;
									local287 += local143;
									local378 += SoftwareRaster.width;
									local342 += local197;
									local348 += local227;
									local354 += local257;
								}
							}
							method2560(SoftwareRaster.pixels, local5, local378, local296 >> 16, local295 >> 16, local287, local131, local342, local348, local354, local187, local217, local247);
							local296 += local95;
							local295 += local65;
							local287 += local143;
							local378 += SoftwareRaster.width;
							local342 += local197;
							local348 += local227;
							local354 += local257;
						}
					} else {
						@Pc(487) int local487 = arg2 - arg1;
						@Pc(491) int local491 = arg1 - arg0;
						@Pc(495) int local495 = anIntArray297[arg0];
						while (true) {
							local491--;
							if (local491 < 0) {
								while (true) {
									local487--;
									if (local487 < 0) {
										return;
									}
									method2560(SoftwareRaster.pixels, local5, local495, local322 >> 16, local296 >> 16, local287, local131, local342, local348, local354, local187, local217, local247);
									local296 += local95;
									local322 += local80;
									local287 += local143;
									local495 += SoftwareRaster.width;
									local342 += local197;
									local348 += local227;
									local354 += local257;
								}
							}
							method2560(SoftwareRaster.pixels, local5, local495, local295 >> 16, local296 >> 16, local287, local131, local342, local348, local354, local187, local217, local247);
							local296 += local95;
							local295 += local65;
							local287 += local143;
							local495 += SoftwareRaster.width;
							local342 += local197;
							local348 += local227;
							local354 += local257;
						}
					}
				} else {
					@Pc(605) int local605;
					@Pc(606) int local606 = local605 = arg3 << 16;
					if (arg0 < 0) {
						local606 -= local95 * arg0;
						local605 -= local65 * arg0;
						local287 -= local143 * arg0;
						arg0 = 0;
					}
					@Pc(632) int local632 = arg5 << 16;
					if (arg2 < 0) {
						local632 -= local80 * arg2;
						arg2 = 0;
					}
					@Pc(646) int local646 = arg0 - anInt3126;
					@Pc(652) int local652 = local177 + local197 * local646;
					@Pc(658) int local658 = local207 + local227 * local646;
					@Pc(664) int local664 = local237 + local257 * local646;
					if ((arg0 == arg2 || local95 >= local65) && (arg0 != arg2 || local80 <= local65)) {
						@Pc(797) int local797 = arg1 - arg2;
						@Pc(801) int local801 = arg2 - arg0;
						@Pc(805) int local805 = anIntArray297[arg0];
						while (true) {
							local801--;
							if (local801 < 0) {
								while (true) {
									local797--;
									if (local797 < 0) {
										return;
									}
									method2560(SoftwareRaster.pixels, local5, local805, local605 >> 16, local632 >> 16, local287, local131, local652, local658, local664, local187, local217, local247);
									local632 += local80;
									local605 += local65;
									local287 += local143;
									local805 += SoftwareRaster.width;
									local652 += local197;
									local658 += local227;
									local664 += local257;
								}
							}
							method2560(SoftwareRaster.pixels, local5, local805, local605 >> 16, local606 >> 16, local287, local131, local652, local658, local664, local187, local217, local247);
							local606 += local95;
							local605 += local65;
							local287 += local143;
							local805 += SoftwareRaster.width;
							local652 += local197;
							local658 += local227;
							local664 += local257;
						}
					} else {
						@Pc(680) int local680 = arg1 - arg2;
						@Pc(684) int local684 = arg2 - arg0;
						@Pc(688) int local688 = anIntArray297[arg0];
						while (true) {
							local684--;
							if (local684 < 0) {
								while (true) {
									local680--;
									if (local680 < 0) {
										return;
									}
									method2560(SoftwareRaster.pixels, local5, local688, local632 >> 16, local605 >> 16, local287, local131, local652, local658, local664, local187, local217, local247);
									local632 += local80;
									local605 += local65;
									local287 += local143;
									local688 += SoftwareRaster.width;
									local652 += local197;
									local658 += local227;
									local664 += local257;
								}
							}
							method2560(SoftwareRaster.pixels, local5, local688, local606 >> 16, local605 >> 16, local287, local131, local652, local658, local664, local187, local217, local247);
							local606 += local95;
							local605 += local65;
							local287 += local143;
							local688 += SoftwareRaster.width;
							local652 += local197;
							local658 += local227;
							local664 += local257;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt3128) {
				if (arg2 > anInt3128) {
					arg2 = anInt3128;
				}
				if (arg0 > anInt3128) {
					arg0 = anInt3128;
				}
				@Pc(937) int local937 = (arg7 << 9) + local131 - local131 * arg4;
				if (arg2 < arg0) {
					@Pc(945) int local945;
					@Pc(946) int local946 = local945 = arg4 << 16;
					if (arg1 < 0) {
						local946 -= local65 * arg1;
						local945 -= local80 * arg1;
						local937 -= local143 * arg1;
						arg1 = 0;
					}
					@Pc(972) int local972 = arg5 << 16;
					if (arg2 < 0) {
						local972 -= local95 * arg2;
						arg2 = 0;
					}
					@Pc(986) int local986 = arg1 - anInt3126;
					@Pc(992) int local992 = local177 + local197 * local986;
					@Pc(998) int local998 = local207 + local227 * local986;
					@Pc(1004) int local1004 = local237 + local257 * local986;
					if (arg1 != arg2 && local65 < local80 || arg1 == arg2 && local65 > local95) {
						@Pc(1020) int local1020 = arg0 - arg2;
						@Pc(1024) int local1024 = arg2 - arg1;
						@Pc(1028) int local1028 = anIntArray297[arg1];
						while (true) {
							local1024--;
							if (local1024 < 0) {
								while (true) {
									local1020--;
									if (local1020 < 0) {
										return;
									}
									method2560(SoftwareRaster.pixels, local5, local1028, local946 >> 16, local972 >> 16, local937, local131, local992, local998, local1004, local187, local217, local247);
									local946 += local65;
									local972 += local95;
									local937 += local143;
									local1028 += SoftwareRaster.width;
									local992 += local197;
									local998 += local227;
									local1004 += local257;
								}
							}
							method2560(SoftwareRaster.pixels, local5, local1028, local946 >> 16, local945 >> 16, local937, local131, local992, local998, local1004, local187, local217, local247);
							local946 += local65;
							local945 += local80;
							local937 += local143;
							local1028 += SoftwareRaster.width;
							local992 += local197;
							local998 += local227;
							local1004 += local257;
						}
					} else {
						@Pc(1137) int local1137 = arg0 - arg2;
						@Pc(1141) int local1141 = arg2 - arg1;
						@Pc(1145) int local1145 = anIntArray297[arg1];
						while (true) {
							local1141--;
							if (local1141 < 0) {
								while (true) {
									local1137--;
									if (local1137 < 0) {
										return;
									}
									method2560(SoftwareRaster.pixels, local5, local1145, local972 >> 16, local946 >> 16, local937, local131, local992, local998, local1004, local187, local217, local247);
									local946 += local65;
									local972 += local95;
									local937 += local143;
									local1145 += SoftwareRaster.width;
									local992 += local197;
									local998 += local227;
									local1004 += local257;
								}
							}
							method2560(SoftwareRaster.pixels, local5, local1145, local945 >> 16, local946 >> 16, local937, local131, local992, local998, local1004, local187, local217, local247);
							local946 += local65;
							local945 += local80;
							local937 += local143;
							local1145 += SoftwareRaster.width;
							local992 += local197;
							local998 += local227;
							local1004 += local257;
						}
					}
				} else {
					@Pc(1255) int local1255;
					@Pc(1256) int local1256 = local1255 = arg4 << 16;
					if (arg1 < 0) {
						local1256 -= local65 * arg1;
						local1255 -= local80 * arg1;
						local937 -= local143 * arg1;
						arg1 = 0;
					}
					@Pc(1282) int local1282 = arg3 << 16;
					if (arg0 < 0) {
						local1282 -= local95 * arg0;
						arg0 = 0;
					}
					@Pc(1296) int local1296 = arg1 - anInt3126;
					@Pc(1302) int local1302 = local177 + local197 * local1296;
					@Pc(1308) int local1308 = local207 + local227 * local1296;
					@Pc(1314) int local1314 = local237 + local257 * local1296;
					if (local65 < local80) {
						@Pc(1321) int local1321 = arg2 - arg0;
						@Pc(1325) int local1325 = arg0 - arg1;
						@Pc(1329) int local1329 = anIntArray297[arg1];
						while (true) {
							local1325--;
							if (local1325 < 0) {
								while (true) {
									local1321--;
									if (local1321 < 0) {
										return;
									}
									method2560(SoftwareRaster.pixels, local5, local1329, local1282 >> 16, local1255 >> 16, local937, local131, local1302, local1308, local1314, local187, local217, local247);
									local1282 += local95;
									local1255 += local80;
									local937 += local143;
									local1329 += SoftwareRaster.width;
									local1302 += local197;
									local1308 += local227;
									local1314 += local257;
								}
							}
							method2560(SoftwareRaster.pixels, local5, local1329, local1256 >> 16, local1255 >> 16, local937, local131, local1302, local1308, local1314, local187, local217, local247);
							local1256 += local65;
							local1255 += local80;
							local937 += local143;
							local1329 += SoftwareRaster.width;
							local1302 += local197;
							local1308 += local227;
							local1314 += local257;
						}
					} else {
						@Pc(1438) int local1438 = arg2 - arg0;
						@Pc(1442) int local1442 = arg0 - arg1;
						@Pc(1446) int local1446 = anIntArray297[arg1];
						while (true) {
							local1442--;
							if (local1442 < 0) {
								while (true) {
									local1438--;
									if (local1438 < 0) {
										return;
									}
									method2560(SoftwareRaster.pixels, local5, local1446, local1255 >> 16, local1282 >> 16, local937, local131, local1302, local1308, local1314, local187, local217, local247);
									local1282 += local95;
									local1255 += local80;
									local937 += local143;
									local1446 += SoftwareRaster.width;
									local1302 += local197;
									local1308 += local227;
									local1314 += local257;
								}
							}
							method2560(SoftwareRaster.pixels, local5, local1446, local1255 >> 16, local1256 >> 16, local937, local131, local1302, local1308, local1314, local187, local217, local247);
							local1256 += local65;
							local1255 += local80;
							local937 += local143;
							local1446 += SoftwareRaster.width;
							local1302 += local197;
							local1308 += local227;
							local1314 += local257;
						}
					}
				}
			}
		} else if (arg2 < anInt3128) {
			if (arg0 > anInt3128) {
				arg0 = anInt3128;
			}
			if (arg1 > anInt3128) {
				arg1 = anInt3128;
			}
			@Pc(1575) int local1575 = (arg8 << 9) + local131 - local131 * arg5;
			if (arg0 < arg1) {
				@Pc(1583) int local1583;
				@Pc(1584) int local1584 = local1583 = arg5 << 16;
				if (arg2 < 0) {
					local1584 -= local80 * arg2;
					local1583 -= local95 * arg2;
					local1575 -= local143 * arg2;
					arg2 = 0;
				}
				@Pc(1610) int local1610 = arg3 << 16;
				if (arg0 < 0) {
					local1610 -= local65 * arg0;
					arg0 = 0;
				}
				@Pc(1624) int local1624 = arg2 - anInt3126;
				@Pc(1630) int local1630 = local177 + local197 * local1624;
				@Pc(1636) int local1636 = local207 + local227 * local1624;
				@Pc(1642) int local1642 = local237 + local257 * local1624;
				if (local80 < local95) {
					@Pc(1649) int local1649 = arg1 - arg0;
					@Pc(1653) int local1653 = arg0 - arg2;
					@Pc(1657) int local1657 = anIntArray297[arg2];
					while (true) {
						local1653--;
						if (local1653 < 0) {
							while (true) {
								local1649--;
								if (local1649 < 0) {
									return;
								}
								method2560(SoftwareRaster.pixels, local5, local1657, local1584 >> 16, local1610 >> 16, local1575, local131, local1630, local1636, local1642, local187, local217, local247);
								local1584 += local80;
								local1610 += local65;
								local1575 += local143;
								local1657 += SoftwareRaster.width;
								local1630 += local197;
								local1636 += local227;
								local1642 += local257;
							}
						}
						method2560(SoftwareRaster.pixels, local5, local1657, local1584 >> 16, local1583 >> 16, local1575, local131, local1630, local1636, local1642, local187, local217, local247);
						local1584 += local80;
						local1583 += local95;
						local1575 += local143;
						local1657 += SoftwareRaster.width;
						local1630 += local197;
						local1636 += local227;
						local1642 += local257;
					}
				} else {
					@Pc(1766) int local1766 = arg1 - arg0;
					@Pc(1770) int local1770 = arg0 - arg2;
					@Pc(1774) int local1774 = anIntArray297[arg2];
					while (true) {
						local1770--;
						if (local1770 < 0) {
							while (true) {
								local1766--;
								if (local1766 < 0) {
									return;
								}
								method2560(SoftwareRaster.pixels, local5, local1774, local1610 >> 16, local1584 >> 16, local1575, local131, local1630, local1636, local1642, local187, local217, local247);
								local1584 += local80;
								local1610 += local65;
								local1575 += local143;
								local1774 += SoftwareRaster.width;
								local1630 += local197;
								local1636 += local227;
								local1642 += local257;
							}
						}
						method2560(SoftwareRaster.pixels, local5, local1774, local1583 >> 16, local1584 >> 16, local1575, local131, local1630, local1636, local1642, local187, local217, local247);
						local1584 += local80;
						local1583 += local95;
						local1575 += local143;
						local1774 += SoftwareRaster.width;
						local1630 += local197;
						local1636 += local227;
						local1642 += local257;
					}
				}
			} else {
				@Pc(1884) int local1884;
				@Pc(1885) int local1885 = local1884 = arg5 << 16;
				if (arg2 < 0) {
					local1885 -= local80 * arg2;
					local1884 -= local95 * arg2;
					local1575 -= local143 * arg2;
					arg2 = 0;
				}
				@Pc(1911) int local1911 = arg4 << 16;
				if (arg1 < 0) {
					local1911 -= local65 * arg1;
					arg1 = 0;
				}
				@Pc(1925) int local1925 = arg2 - anInt3126;
				@Pc(1931) int local1931 = local177 + local197 * local1925;
				@Pc(1937) int local1937 = local207 + local227 * local1925;
				@Pc(1943) int local1943 = local237 + local257 * local1925;
				if (local80 < local95) {
					@Pc(1950) int local1950 = arg0 - arg1;
					@Pc(1954) int local1954 = arg1 - arg2;
					@Pc(1958) int local1958 = anIntArray297[arg2];
					while (true) {
						local1954--;
						if (local1954 < 0) {
							while (true) {
								local1950--;
								if (local1950 < 0) {
									return;
								}
								method2560(SoftwareRaster.pixels, local5, local1958, local1911 >> 16, local1884 >> 16, local1575, local131, local1931, local1937, local1943, local187, local217, local247);
								local1911 += local65;
								local1884 += local95;
								local1575 += local143;
								local1958 += SoftwareRaster.width;
								local1931 += local197;
								local1937 += local227;
								local1943 += local257;
							}
						}
						method2560(SoftwareRaster.pixels, local5, local1958, local1885 >> 16, local1884 >> 16, local1575, local131, local1931, local1937, local1943, local187, local217, local247);
						local1885 += local80;
						local1884 += local95;
						local1575 += local143;
						local1958 += SoftwareRaster.width;
						local1931 += local197;
						local1937 += local227;
						local1943 += local257;
					}
				} else {
					@Pc(2067) int local2067 = arg0 - arg1;
					@Pc(2071) int local2071 = arg1 - arg2;
					@Pc(2075) int local2075 = anIntArray297[arg2];
					while (true) {
						local2071--;
						if (local2071 < 0) {
							while (true) {
								local2067--;
								if (local2067 < 0) {
									return;
								}
								method2560(SoftwareRaster.pixels, local5, local2075, local1884 >> 16, local1911 >> 16, local1575, local131, local1931, local1937, local1943, local187, local217, local247);
								local1911 += local65;
								local1884 += local95;
								local1575 += local143;
								local2075 += SoftwareRaster.width;
								local1931 += local197;
								local1937 += local227;
								local1943 += local257;
							}
						}
						method2560(SoftwareRaster.pixels, local5, local2075, local1884 >> 16, local1885 >> 16, local1575, local131, local1931, local1937, local1943, local187, local217, local247);
						local1885 += local80;
						local1884 += local95;
						local1575 += local143;
						local2075 += SoftwareRaster.width;
						local1931 += local197;
						local1937 += local227;
						local1943 += local257;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "([I[IIIIIIIIIIIIII)V")
	public static void method2560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12) {
		if (aBoolean217) {
			if (arg4 > anInt3129) {
				arg4 = anInt3129;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		@Pc(18) int local18 = arg2 + arg3;
		@Pc(24) int local24 = arg5 + arg6 * arg3;
		@Pc(28) int local28 = arg4 - arg3;
		@Pc(154) int local154;
		if (!lowDetail) {
			@Pc(844) int local844 = arg3 - anInt3125;
			arg7 += arg10 * local844;
			arg8 += arg11 * local844;
			arg9 += arg12 * local844;
			@Pc(866) int local866 = arg9 >> 14;
			@Pc(872) int local872;
			@Pc(876) int local876;
			if (local866 == 0) {
				local872 = 0;
				local876 = 0;
			} else {
				local872 = arg7 / local866;
				local876 = arg8 / local866;
			}
			arg7 += arg10 * local28;
			arg8 += arg11 * local28;
			arg9 += arg12 * local28;
			@Pc(903) int local903 = arg9 >> 14;
			@Pc(909) int local909;
			@Pc(913) int local913;
			if (local903 == 0) {
				local909 = 0;
				local913 = 0;
			} else {
				local909 = arg7 / local903;
				local913 = arg8 / local903;
			}
			@Pc(924) int local924 = (local872 << 18) + local876;
			@Pc(938) int local938 = ((local909 - local872) / local28 << 18) + (local913 - local876) / local28;
			@Pc(942) int local942 = local28 >> 3;
			arg6 <<= 3;
			@Pc(950) int local950 = local24 >> 8;
			if (aBoolean219) {
				if (local942 > 0) {
					do {
						@Pc(964) int local964 = arg1[(local924 & 0x3F80) + (local924 >>> 25)];
						arg2 = local18 + 1;
						arg0[local18] = ((local964 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local964 & 0xFF00) * local950 & 0xFF0000) >> 8;
						@Pc(989) int local989 = local924 + local938;
						local964 = arg1[(local989 & 0x3F80) + (local989 >>> 25)];
						arg0[arg2++] = ((local964 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local964 & 0xFF00) * local950 & 0xFF0000) >> 8;
						local989 += local938;
						local964 = arg1[(local989 & 0x3F80) + (local989 >>> 25)];
						arg0[arg2++] = ((local964 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local964 & 0xFF00) * local950 & 0xFF0000) >> 8;
						local989 += local938;
						local964 = arg1[(local989 & 0x3F80) + (local989 >>> 25)];
						arg0[arg2++] = ((local964 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local964 & 0xFF00) * local950 & 0xFF0000) >> 8;
						local989 += local938;
						local964 = arg1[(local989 & 0x3F80) + (local989 >>> 25)];
						arg0[arg2++] = ((local964 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local964 & 0xFF00) * local950 & 0xFF0000) >> 8;
						local989 += local938;
						local964 = arg1[(local989 & 0x3F80) + (local989 >>> 25)];
						arg0[arg2++] = ((local964 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local964 & 0xFF00) * local950 & 0xFF0000) >> 8;
						local989 += local938;
						local964 = arg1[(local989 & 0x3F80) + (local989 >>> 25)];
						arg0[arg2++] = ((local964 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local964 & 0xFF00) * local950 & 0xFF0000) >> 8;
						local989 += local938;
						local964 = arg1[(local989 & 0x3F80) + (local989 >>> 25)];
						local18 = arg2 + 1;
						arg0[arg2] = ((local964 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local964 & 0xFF00) * local950 & 0xFF0000) >> 8;
						local924 = local989 + local938;
						local24 += arg6;
						local950 = local24 >> 8;
						local942--;
					} while (local942 > 0);
				}
				@Pc(1251) int local1251 = arg4 - arg3 & 0x7;
				if (local1251 > 0) {
					do {
						@Pc(1263) int local1263 = arg1[(local924 & 0x3F80) + (local924 >>> 25)];
						arg0[local18++] = ((local1263 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local1263 & 0xFF00) * local950 & 0xFF0000) >> 8;
						local924 += local938;
						local1251--;
					} while (local1251 > 0);
				}
			} else {
				if (local942 > 0) {
					do {
						if ((local154 = arg1[(local924 & 0x3F80) + (local924 >>> 25)]) != 0) {
							arg0[local18] = ((local154 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local154 & 0xFF00) * local950 & 0xFF0000) >> 8;
						}
						arg2 = local18 + 1;
						@Pc(1331) int local1331 = local924 + local938;
						if ((local154 = arg1[(local1331 & 0x3F80) + (local1331 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local154 & 0xFF00) * local950 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1368) int local1368 = local1331 + local938;
						if ((local154 = arg1[(local1368 & 0x3F80) + (local1368 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local154 & 0xFF00) * local950 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1405) int local1405 = local1368 + local938;
						if ((local154 = arg1[(local1405 & 0x3F80) + (local1405 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local154 & 0xFF00) * local950 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1442) int local1442 = local1405 + local938;
						if ((local154 = arg1[(local1442 & 0x3F80) + (local1442 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local154 & 0xFF00) * local950 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1479) int local1479 = local1442 + local938;
						if ((local154 = arg1[(local1479 & 0x3F80) + (local1479 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local154 & 0xFF00) * local950 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1516) int local1516 = local1479 + local938;
						if ((local154 = arg1[(local1516 & 0x3F80) + (local1516 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local154 & 0xFF00) * local950 & 0xFF0000) >> 8;
						}
						arg2++;
						@Pc(1553) int local1553 = local1516 + local938;
						if ((local154 = arg1[(local1553 & 0x3F80) + (local1553 >>> 25)]) != 0) {
							arg0[arg2] = ((local154 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local154 & 0xFF00) * local950 & 0xFF0000) >> 8;
						}
						local18 = arg2 + 1;
						local924 = local1553 + local938;
						local24 += arg6;
						local950 = local24 >> 8;
						local942--;
					} while (local942 > 0);
				}
				@Pc(1607) int local1607 = arg4 - arg3 & 0x7;
				if (local1607 > 0) {
					do {
						if ((local154 = arg1[(local924 & 0x3F80) + (local924 >>> 25)]) != 0) {
							arg0[local18] = ((local154 & 0xFF00FF) * local950 & 0xFF00FF00) + ((local154 & 0xFF00) * local950 & 0xFF0000) >> 8;
						}
						local18++;
						local924 += local938;
						local1607--;
					} while (local1607 > 0);
				}
			}
			return;
		}
		@Pc(34) int local34 = arg3 - anInt3125;
		arg7 += arg10 * local34;
		arg8 += arg11 * local34;
		arg9 += arg12 * local34;
		@Pc(56) int local56 = arg9 >> 12;
		@Pc(62) int local62;
		@Pc(66) int local66;
		if (local56 == 0) {
			local62 = 0;
			local66 = 0;
		} else {
			local62 = arg7 / local56;
			local66 = arg8 / local56;
		}
		arg7 += arg10 * local28;
		arg8 += arg11 * local28;
		arg9 += arg12 * local28;
		@Pc(93) int local93 = arg9 >> 12;
		@Pc(99) int local99;
		@Pc(103) int local103;
		if (local93 == 0) {
			local99 = 0;
			local103 = 0;
		} else {
			local99 = arg7 / local93;
			local103 = arg8 / local93;
		}
		@Pc(114) int local114 = (local62 << 20) + local66;
		@Pc(128) int local128 = ((local99 - local62) / local28 << 20) + (local103 - local66) / local28;
		@Pc(132) int local132 = local28 >> 3;
		arg6 <<= 3;
		@Pc(140) int local140 = local24 >> 8;
		if (aBoolean219) {
			if (local132 > 0) {
				do {
					local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg2 = local18 + 1;
					arg0[local18] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					@Pc(179) int local179 = local114 + local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local179 += local128;
					local154 = arg1[(local179 & 0xFC0) + (local179 >>> 26)];
					local18 = arg2 + 1;
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 = local179 + local128;
					local24 += arg6;
					local140 = local24 >> 8;
					local132--;
				} while (local132 > 0);
			}
			@Pc(441) int local441 = arg4 - arg3 & 0x7;
			if (local441 > 0) {
				do {
					@Pc(453) int local453 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local18++] = ((local453 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local453 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					local441--;
				} while (local441 > 0);
			}
			return;
		}
		if (local132 > 0) {
			do {
				if ((local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local18] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2 = local18 + 1;
				@Pc(521) int local521 = local114 + local128;
				if ((local154 = arg1[(local521 & 0xFC0) + (local521 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(558) int local558 = local521 + local128;
				if ((local154 = arg1[(local558 & 0xFC0) + (local558 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(595) int local595 = local558 + local128;
				if ((local154 = arg1[(local595 & 0xFC0) + (local595 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(632) int local632 = local595 + local128;
				if ((local154 = arg1[(local632 & 0xFC0) + (local632 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(669) int local669 = local632 + local128;
				if ((local154 = arg1[(local669 & 0xFC0) + (local669 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(706) int local706 = local669 + local128;
				if ((local154 = arg1[(local706 & 0xFC0) + (local706 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2++;
				@Pc(743) int local743 = local706 + local128;
				if ((local154 = arg1[(local743 & 0xFC0) + (local743 >>> 26)]) != 0) {
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local18 = arg2 + 1;
				local114 = local743 + local128;
				local24 += arg6;
				local140 = local24 >> 8;
				local132--;
			} while (local132 > 0);
		}
		@Pc(797) int local797 = arg4 - arg3 & 0x7;
		if (local797 <= 0) {
			return;
		}
		do {
			if ((local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
				arg0[local18] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
			}
			local18++;
			local114 += local128;
			local797--;
		} while (local797 > 0);
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "()V")
	public static void method2561() {
		method2547(SoftwareRaster.clipX, SoftwareRaster.clipY, SoftwareRaster.clipWidth, SoftwareRaster.clipHeight);
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)V")
	public static void method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anIntArray297[0];
		@Pc(7) int local7 = local3 / SoftwareRaster.width;
		@Pc(13) int local13 = local3 - local7 * SoftwareRaster.width;
		anInt3125 = arg0 - local13;
		anInt3126 = arg1 - local7;
		Static7.anInt5437 = -anInt3125;
		Static4.anInt3123 = anInt3129 - anInt3125;
		Static7.anInt6030 = -anInt3126;
		Static1.anInt403 = anInt3128 - anInt3126;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "()V")
	public static void method2555() {
		anInt3125 = anInt3129 / 2;
		anInt3126 = anInt3128 / 2;
		Static7.anInt5437 = -anInt3125;
		Static4.anInt3123 = anInt3129 - anInt3125;
		Static7.anInt6030 = -anInt3126;
		Static1.anInt403 = anInt3128 - anInt3126;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([BIIII)V")
	public static void method2553(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(7) int local7 = arg1 + arg2;
		@Pc(13) int local13 = arg3 - arg2 >> 2;
		while (true) {
			local13--;
			if (local13 < 0) {
				@Pc(43) int local43 = arg3 - arg2 & 0x3;
				while (true) {
					local43--;
					if (local43 < 0) {
						return;
					}
					arg0[local7++] = 1;
				}
			}
			arg1 = local7 + 1;
			arg0[local7] = 1;
			arg0[arg1++] = 1;
			arg0[arg1++] = 1;
			local7 = arg1 + 1;
			arg0[arg1] = 1;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!nk;)V")
	public static void setTextureProvider(@OriginalArg(0) GlTextureProvider textureProvider) {
		Rasteriser.textureProvider = textureProvider;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([BIIIIIII)V")
	public static void method2552(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) int local1 = 0;
		if (arg2 != arg1) {
			local1 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(16) int local16 = 0;
		if (arg3 != arg2) {
			local16 = (arg6 - arg5 << 16) / (arg3 - arg2);
		}
		@Pc(31) int local31 = 0;
		if (arg3 != arg1) {
			local31 = (arg4 - arg6 << 16) / (arg1 - arg3);
		}
		if (arg1 <= arg2 && arg1 <= arg3) {
			if (arg2 < arg3) {
				@Pc(58) int local58;
				@Pc(59) int local59 = local58 = arg4 << 16;
				if (arg1 < 0) {
					local59 -= local31 * arg1;
					local58 -= local1 * arg1;
					arg1 = 0;
				}
				@Pc(79) int local79 = arg5 << 16;
				if (arg2 < 0) {
					local79 -= local16 * arg2;
					arg2 = 0;
				}
				if ((arg1 == arg2 || local31 >= local1) && (arg1 != arg2 || local31 <= local16)) {
					@Pc(170) int local170 = arg3 - arg2;
					@Pc(174) int local174 = arg2 - arg1;
					@Pc(178) int local178 = arg1 * arg7;
					while (true) {
						local174--;
						if (local174 < 0) {
							while (true) {
								local170--;
								if (local170 < 0) {
									return;
								}
								method2553(arg0, local178, local79 >> 16, local59 >> 16);
								local59 += local31;
								local79 += local16;
								local178 += arg7;
							}
						}
						method2553(arg0, local178, local58 >> 16, local59 >> 16);
						local59 += local31;
						local58 += local1;
						local178 += arg7;
					}
				} else {
					@Pc(105) int local105 = arg3 - arg2;
					@Pc(109) int local109 = arg2 - arg1;
					@Pc(113) int local113 = arg1 * arg7;
					while (true) {
						local109--;
						if (local109 < 0) {
							while (true) {
								local105--;
								if (local105 < 0) {
									return;
								}
								method2553(arg0, local113, local59 >> 16, local79 >> 16);
								local59 += local31;
								local79 += local16;
								local113 += arg7;
							}
						}
						method2553(arg0, local113, local59 >> 16, local58 >> 16);
						local59 += local31;
						local58 += local1;
						local113 += arg7;
					}
				}
			} else {
				@Pc(236) int local236;
				@Pc(237) int local237 = local236 = arg4 << 16;
				if (arg1 < 0) {
					local237 -= local31 * arg1;
					local236 -= local1 * arg1;
					arg1 = 0;
				}
				@Pc(257) int local257 = arg6 << 16;
				if (arg3 < 0) {
					local257 -= local16 * arg3;
					arg3 = 0;
				}
				if ((arg1 == arg3 || local31 >= local1) && (arg1 != arg3 || local16 <= local1)) {
					@Pc(348) int local348 = arg2 - arg3;
					@Pc(352) int local352 = arg3 - arg1;
					@Pc(356) int local356 = arg1 * arg7;
					while (true) {
						local352--;
						if (local352 < 0) {
							while (true) {
								local348--;
								if (local348 < 0) {
									return;
								}
								method2553(arg0, local356, local236 >> 16, local257 >> 16);
								local257 += local16;
								local236 += local1;
								local356 += arg7;
							}
						}
						method2553(arg0, local356, local236 >> 16, local237 >> 16);
						local237 += local31;
						local236 += local1;
						local356 += arg7;
					}
				} else {
					@Pc(283) int local283 = arg2 - arg3;
					@Pc(287) int local287 = arg3 - arg1;
					@Pc(291) int local291 = arg1 * arg7;
					while (true) {
						local287--;
						if (local287 < 0) {
							while (true) {
								local283--;
								if (local283 < 0) {
									return;
								}
								method2553(arg0, local291, local257 >> 16, local236 >> 16);
								local257 += local16;
								local236 += local1;
								local291 += arg7;
							}
						}
						method2553(arg0, local291, local237 >> 16, local236 >> 16);
						local237 += local31;
						local236 += local1;
						local291 += arg7;
					}
				}
			}
		} else if (arg2 <= arg3) {
			if (arg3 < arg1) {
				@Pc(420) int local420;
				@Pc(421) int local421 = local420 = arg5 << 16;
				if (arg2 < 0) {
					local421 -= local1 * arg2;
					local420 -= local16 * arg2;
					arg2 = 0;
				}
				@Pc(441) int local441 = arg6 << 16;
				if (arg3 < 0) {
					local441 -= local31 * arg3;
					arg3 = 0;
				}
				if (arg2 != arg3 && local1 < local16 || arg2 == arg3 && local1 > local31) {
					@Pc(467) int local467 = arg1 - arg3;
					@Pc(471) int local471 = arg3 - arg2;
					@Pc(475) int local475 = arg2 * arg7;
					while (true) {
						local471--;
						if (local471 < 0) {
							while (true) {
								local467--;
								if (local467 < 0) {
									return;
								}
								method2553(arg0, local475, local421 >> 16, local441 >> 16);
								local421 += local1;
								local441 += local31;
								local475 += arg7;
							}
						}
						method2553(arg0, local475, local421 >> 16, local420 >> 16);
						local421 += local1;
						local420 += local16;
						local475 += arg7;
					}
				} else {
					@Pc(532) int local532 = arg1 - arg3;
					@Pc(536) int local536 = arg3 - arg2;
					@Pc(540) int local540 = arg2 * arg7;
					while (true) {
						local536--;
						if (local536 < 0) {
							while (true) {
								local532--;
								if (local532 < 0) {
									return;
								}
								method2553(arg0, local540, local441 >> 16, local421 >> 16);
								local421 += local1;
								local441 += local31;
								local540 += arg7;
							}
						}
						method2553(arg0, local540, local420 >> 16, local421 >> 16);
						local421 += local1;
						local420 += local16;
						local540 += arg7;
					}
				}
			} else {
				@Pc(598) int local598;
				@Pc(599) int local599 = local598 = arg5 << 16;
				if (arg2 < 0) {
					local599 -= local1 * arg2;
					local598 -= local16 * arg2;
					arg2 = 0;
				}
				@Pc(619) int local619 = arg4 << 16;
				if (arg1 < 0) {
					local619 -= local31 * arg1;
					arg1 = 0;
				}
				if (local1 < local16) {
					@Pc(636) int local636 = arg3 - arg1;
					@Pc(640) int local640 = arg1 - arg2;
					@Pc(644) int local644 = arg2 * arg7;
					while (true) {
						local640--;
						if (local640 < 0) {
							while (true) {
								local636--;
								if (local636 < 0) {
									return;
								}
								method2553(arg0, local644, local619 >> 16, local598 >> 16);
								local619 += local31;
								local598 += local16;
								local644 += arg7;
							}
						}
						method2553(arg0, local644, local599 >> 16, local598 >> 16);
						local599 += local1;
						local598 += local16;
						local644 += arg7;
					}
				} else {
					@Pc(701) int local701 = arg3 - arg1;
					@Pc(705) int local705 = arg1 - arg2;
					@Pc(709) int local709 = arg2 * arg7;
					while (true) {
						local705--;
						if (local705 < 0) {
							while (true) {
								local701--;
								if (local701 < 0) {
									return;
								}
								method2553(arg0, local709, local598 >> 16, local619 >> 16);
								local619 += local31;
								local598 += local16;
								local709 += arg7;
							}
						}
						method2553(arg0, local709, local598 >> 16, local599 >> 16);
						local599 += local1;
						local598 += local16;
						local709 += arg7;
					}
				}
			}
		} else if (arg1 < arg2) {
			@Pc(770) int local770;
			@Pc(771) int local771 = local770 = arg6 << 16;
			if (arg3 < 0) {
				local771 -= local16 * arg3;
				local770 -= local31 * arg3;
				arg3 = 0;
			}
			@Pc(791) int local791 = arg4 << 16;
			if (arg1 < 0) {
				local791 -= local1 * arg1;
				arg1 = 0;
			}
			if (local16 < local31) {
				@Pc(808) int local808 = arg2 - arg1;
				@Pc(812) int local812 = arg1 - arg3;
				@Pc(816) int local816 = arg3 * arg7;
				while (true) {
					local812--;
					if (local812 < 0) {
						while (true) {
							local808--;
							if (local808 < 0) {
								return;
							}
							method2553(arg0, local816, local771 >> 16, local791 >> 16);
							local771 += local16;
							local791 += local1;
							local816 += arg7;
						}
					}
					method2553(arg0, local816, local771 >> 16, local770 >> 16);
					local771 += local16;
					local770 += local31;
					local816 += arg7;
				}
			} else {
				@Pc(873) int local873 = arg2 - arg1;
				@Pc(877) int local877 = arg1 - arg3;
				@Pc(881) int local881 = arg3 * arg7;
				while (true) {
					local877--;
					if (local877 < 0) {
						while (true) {
							local873--;
							if (local873 < 0) {
								return;
							}
							method2553(arg0, local881, local791 >> 16, local771 >> 16);
							local771 += local16;
							local791 += local1;
							local881 += arg7;
						}
					}
					method2553(arg0, local881, local770 >> 16, local771 >> 16);
					local771 += local16;
					local770 += local31;
					local881 += arg7;
				}
			}
		} else {
			@Pc(939) int local939;
			@Pc(940) int local940 = local939 = arg6 << 16;
			if (arg3 < 0) {
				local940 -= local16 * arg3;
				local939 -= local31 * arg3;
				arg3 = 0;
			}
			@Pc(960) int local960 = arg5 << 16;
			if (arg2 < 0) {
				local960 -= local1 * arg2;
				arg2 = 0;
			}
			if (local16 < local31) {
				@Pc(977) int local977 = arg1 - arg2;
				@Pc(981) int local981 = arg2 - arg3;
				@Pc(985) int local985 = arg3 * arg7;
				while (true) {
					local981--;
					if (local981 < 0) {
						while (true) {
							local977--;
							if (local977 < 0) {
								return;
							}
							method2553(arg0, local985, local960 >> 16, local939 >> 16);
							local960 += local1;
							local939 += local31;
							local985 += arg7;
						}
					}
					method2553(arg0, local985, local940 >> 16, local939 >> 16);
					local940 += local16;
					local939 += local31;
					local985 += arg7;
				}
			} else {
				@Pc(1042) int local1042 = arg1 - arg2;
				@Pc(1046) int local1046 = arg2 - arg3;
				@Pc(1050) int local1050 = arg3 * arg7;
				while (true) {
					local1046--;
					if (local1046 < 0) {
						while (true) {
							local1042--;
							if (local1042 < 0) {
								return;
							}
							method2553(arg0, local1050, local939 >> 16, local960 >> 16);
							local960 += local1;
							local939 += local31;
							local1050 += arg7;
						}
					}
					method2553(arg0, local1050, local939 >> 16, local940 >> 16);
					local940 += local16;
					local939 += local31;
					local1050 += arg7;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V")
	public static void method2550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt3128) {
				if (arg1 > anInt3128) {
					arg1 = anInt3128;
				}
				if (arg2 > anInt3128) {
					arg2 = anInt3128;
				}
				if (arg1 < arg2) {
					@Pc(72) int local72;
					@Pc(73) int local73 = local72 = arg3 << 16;
					if (arg0 < 0) {
						local73 -= local31 * arg0;
						local72 -= local1 * arg0;
						arg0 = 0;
					}
					@Pc(93) int local93 = arg4 << 16;
					if (arg1 < 0) {
						local93 -= local16 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local31 < local1 || arg0 == arg1 && local31 > local16) {
						@Pc(119) int local119 = arg2 - arg1;
						@Pc(123) int local123 = arg1 - arg0;
						@Pc(127) int local127 = anIntArray297[arg0];
						while (true) {
							local123--;
							if (local123 < 0) {
								while (true) {
									local119--;
									if (local119 < 0) {
										return;
									}
									method2544(SoftwareRaster.pixels, local127, arg6, local73 >> 16, local93 >> 16);
									local73 += local31;
									local93 += local16;
									local127 += SoftwareRaster.width;
								}
							}
							method2544(SoftwareRaster.pixels, local127, arg6, local73 >> 16, local72 >> 16);
							local73 += local31;
							local72 += local1;
							local127 += SoftwareRaster.width;
						}
					} else {
						@Pc(186) int local186 = arg2 - arg1;
						@Pc(190) int local190 = arg1 - arg0;
						@Pc(194) int local194 = anIntArray297[arg0];
						while (true) {
							local190--;
							if (local190 < 0) {
								while (true) {
									local186--;
									if (local186 < 0) {
										return;
									}
									method2544(SoftwareRaster.pixels, local194, arg6, local93 >> 16, local73 >> 16);
									local73 += local31;
									local93 += local16;
									local194 += SoftwareRaster.width;
								}
							}
							method2544(SoftwareRaster.pixels, local194, arg6, local72 >> 16, local73 >> 16);
							local73 += local31;
							local72 += local1;
							local194 += SoftwareRaster.width;
						}
					}
				} else {
					@Pc(254) int local254;
					@Pc(255) int local255 = local254 = arg3 << 16;
					if (arg0 < 0) {
						local255 -= local31 * arg0;
						local254 -= local1 * arg0;
						arg0 = 0;
					}
					@Pc(275) int local275 = arg5 << 16;
					if (arg2 < 0) {
						local275 -= local16 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local31 < local1 || arg0 == arg2 && local16 > local1) {
						@Pc(301) int local301 = arg1 - arg2;
						@Pc(305) int local305 = arg2 - arg0;
						@Pc(309) int local309 = anIntArray297[arg0];
						while (true) {
							local305--;
							if (local305 < 0) {
								while (true) {
									local301--;
									if (local301 < 0) {
										return;
									}
									method2544(SoftwareRaster.pixels, local309, arg6, local275 >> 16, local254 >> 16);
									local275 += local16;
									local254 += local1;
									local309 += SoftwareRaster.width;
								}
							}
							method2544(SoftwareRaster.pixels, local309, arg6, local255 >> 16, local254 >> 16);
							local255 += local31;
							local254 += local1;
							local309 += SoftwareRaster.width;
						}
					} else {
						@Pc(368) int local368 = arg1 - arg2;
						@Pc(372) int local372 = arg2 - arg0;
						@Pc(376) int local376 = anIntArray297[arg0];
						while (true) {
							local372--;
							if (local372 < 0) {
								while (true) {
									local368--;
									if (local368 < 0) {
										return;
									}
									method2544(SoftwareRaster.pixels, local376, arg6, local254 >> 16, local275 >> 16);
									local275 += local16;
									local254 += local1;
									local376 += SoftwareRaster.width;
								}
							}
							method2544(SoftwareRaster.pixels, local376, arg6, local254 >> 16, local255 >> 16);
							local255 += local31;
							local254 += local1;
							local376 += SoftwareRaster.width;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt3128) {
				if (arg2 > anInt3128) {
					arg2 = anInt3128;
				}
				if (arg0 > anInt3128) {
					arg0 = anInt3128;
				}
				if (arg2 < arg0) {
					@Pc(456) int local456;
					@Pc(457) int local457 = local456 = arg4 << 16;
					if (arg1 < 0) {
						local457 -= local1 * arg1;
						local456 -= local16 * arg1;
						arg1 = 0;
					}
					@Pc(477) int local477 = arg5 << 16;
					if (arg2 < 0) {
						local477 -= local31 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
						@Pc(503) int local503 = arg0 - arg2;
						@Pc(507) int local507 = arg2 - arg1;
						@Pc(511) int local511 = anIntArray297[arg1];
						while (true) {
							local507--;
							if (local507 < 0) {
								while (true) {
									local503--;
									if (local503 < 0) {
										return;
									}
									method2544(SoftwareRaster.pixels, local511, arg6, local457 >> 16, local477 >> 16);
									local457 += local1;
									local477 += local31;
									local511 += SoftwareRaster.width;
								}
							}
							method2544(SoftwareRaster.pixels, local511, arg6, local457 >> 16, local456 >> 16);
							local457 += local1;
							local456 += local16;
							local511 += SoftwareRaster.width;
						}
					} else {
						@Pc(570) int local570 = arg0 - arg2;
						@Pc(574) int local574 = arg2 - arg1;
						@Pc(578) int local578 = anIntArray297[arg1];
						while (true) {
							local574--;
							if (local574 < 0) {
								while (true) {
									local570--;
									if (local570 < 0) {
										return;
									}
									method2544(SoftwareRaster.pixels, local578, arg6, local477 >> 16, local457 >> 16);
									local457 += local1;
									local477 += local31;
									local578 += SoftwareRaster.width;
								}
							}
							method2544(SoftwareRaster.pixels, local578, arg6, local456 >> 16, local457 >> 16);
							local457 += local1;
							local456 += local16;
							local578 += SoftwareRaster.width;
						}
					}
				} else {
					@Pc(638) int local638;
					@Pc(639) int local639 = local638 = arg4 << 16;
					if (arg1 < 0) {
						local639 -= local1 * arg1;
						local638 -= local16 * arg1;
						arg1 = 0;
					}
					@Pc(659) int local659 = arg3 << 16;
					if (arg0 < 0) {
						local659 -= local31 * arg0;
						arg0 = 0;
					}
					if (local1 < local16) {
						@Pc(676) int local676 = arg2 - arg0;
						@Pc(680) int local680 = arg0 - arg1;
						@Pc(684) int local684 = anIntArray297[arg1];
						while (true) {
							local680--;
							if (local680 < 0) {
								while (true) {
									local676--;
									if (local676 < 0) {
										return;
									}
									method2544(SoftwareRaster.pixels, local684, arg6, local659 >> 16, local638 >> 16);
									local659 += local31;
									local638 += local16;
									local684 += SoftwareRaster.width;
								}
							}
							method2544(SoftwareRaster.pixels, local684, arg6, local639 >> 16, local638 >> 16);
							local639 += local1;
							local638 += local16;
							local684 += SoftwareRaster.width;
						}
					} else {
						@Pc(743) int local743 = arg2 - arg0;
						@Pc(747) int local747 = arg0 - arg1;
						@Pc(751) int local751 = anIntArray297[arg1];
						while (true) {
							local747--;
							if (local747 < 0) {
								while (true) {
									local743--;
									if (local743 < 0) {
										return;
									}
									method2544(SoftwareRaster.pixels, local751, arg6, local638 >> 16, local659 >> 16);
									local659 += local31;
									local638 += local16;
									local751 += SoftwareRaster.width;
								}
							}
							method2544(SoftwareRaster.pixels, local751, arg6, local638 >> 16, local639 >> 16);
							local639 += local1;
							local638 += local16;
							local751 += SoftwareRaster.width;
						}
					}
				}
			}
		} else if (arg2 < anInt3128) {
			if (arg0 > anInt3128) {
				arg0 = anInt3128;
			}
			if (arg1 > anInt3128) {
				arg1 = anInt3128;
			}
			if (arg0 < arg1) {
				@Pc(828) int local828;
				@Pc(829) int local829 = local828 = arg5 << 16;
				if (arg2 < 0) {
					local829 -= local16 * arg2;
					local828 -= local31 * arg2;
					arg2 = 0;
				}
				@Pc(849) int local849 = arg3 << 16;
				if (arg0 < 0) {
					local849 -= local1 * arg0;
					arg0 = 0;
				}
				if (local16 < local31) {
					@Pc(866) int local866 = arg1 - arg0;
					@Pc(870) int local870 = arg0 - arg2;
					@Pc(874) int local874 = anIntArray297[arg2];
					while (true) {
						local870--;
						if (local870 < 0) {
							while (true) {
								local866--;
								if (local866 < 0) {
									return;
								}
								method2544(SoftwareRaster.pixels, local874, arg6, local829 >> 16, local849 >> 16);
								local829 += local16;
								local849 += local1;
								local874 += SoftwareRaster.width;
							}
						}
						method2544(SoftwareRaster.pixels, local874, arg6, local829 >> 16, local828 >> 16);
						local829 += local16;
						local828 += local31;
						local874 += SoftwareRaster.width;
					}
				} else {
					@Pc(933) int local933 = arg1 - arg0;
					@Pc(937) int local937 = arg0 - arg2;
					@Pc(941) int local941 = anIntArray297[arg2];
					while (true) {
						local937--;
						if (local937 < 0) {
							while (true) {
								local933--;
								if (local933 < 0) {
									return;
								}
								method2544(SoftwareRaster.pixels, local941, arg6, local849 >> 16, local829 >> 16);
								local829 += local16;
								local849 += local1;
								local941 += SoftwareRaster.width;
							}
						}
						method2544(SoftwareRaster.pixels, local941, arg6, local828 >> 16, local829 >> 16);
						local829 += local16;
						local828 += local31;
						local941 += SoftwareRaster.width;
					}
				}
			} else {
				@Pc(1001) int local1001;
				@Pc(1002) int local1002 = local1001 = arg5 << 16;
				if (arg2 < 0) {
					local1002 -= local16 * arg2;
					local1001 -= local31 * arg2;
					arg2 = 0;
				}
				@Pc(1022) int local1022 = arg4 << 16;
				if (arg1 < 0) {
					local1022 -= local1 * arg1;
					arg1 = 0;
				}
				if (local16 < local31) {
					@Pc(1039) int local1039 = arg0 - arg1;
					@Pc(1043) int local1043 = arg1 - arg2;
					@Pc(1047) int local1047 = anIntArray297[arg2];
					while (true) {
						local1043--;
						if (local1043 < 0) {
							while (true) {
								local1039--;
								if (local1039 < 0) {
									return;
								}
								method2544(SoftwareRaster.pixels, local1047, arg6, local1022 >> 16, local1001 >> 16);
								local1022 += local1;
								local1001 += local31;
								local1047 += SoftwareRaster.width;
							}
						}
						method2544(SoftwareRaster.pixels, local1047, arg6, local1002 >> 16, local1001 >> 16);
						local1002 += local16;
						local1001 += local31;
						local1047 += SoftwareRaster.width;
					}
				} else {
					@Pc(1106) int local1106 = arg0 - arg1;
					@Pc(1110) int local1110 = arg1 - arg2;
					@Pc(1114) int local1114 = anIntArray297[arg2];
					while (true) {
						local1110--;
						if (local1110 < 0) {
							while (true) {
								local1106--;
								if (local1106 < 0) {
									return;
								}
								method2544(SoftwareRaster.pixels, local1114, arg6, local1001 >> 16, local1022 >> 16);
								local1022 += local1;
								local1001 += local31;
								local1114 += SoftwareRaster.width;
							}
						}
						method2544(SoftwareRaster.pixels, local1114, arg6, local1001 >> 16, local1002 >> 16);
						local1002 += local16;
						local1001 += local31;
						local1114 += SoftwareRaster.width;
					}
				}
			}
		}
	}
}

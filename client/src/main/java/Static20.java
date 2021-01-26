import java.awt.Container;
import java.awt.Insets;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "()V")
	public static void method2403() {
		@Pc(3) int local3 = Static3.anInt2972 - Static3.anInt2973;
		@Pc(7) int local7 = Static3.anInt2966 - Static3.anInt2967;
		@Pc(15) int local15 = (Static3.anInt2970 - Static3.anInt2969 << 16) / local3;
		@Pc(23) int local23 = (Static3.anInt2971 - Static3.anInt2968 << 16) / local7;
		Static19.method2396(local15, local23);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fg;IIII)V")
	private static void method2404(@OriginalArg(0) MapElement element, @OriginalArg(1) int x, @OriginalArg(2) int y) {
		element.xOffset = Static3.anInt2969 + (x * (element.x - Static3.anInt2973) >> 16);
		element.yOffset = Static3.anInt2968 + (y * (element.z - Static3.anInt2967) >> 16);
		@Pc(32) MelType type = MelTypeList.get(element.id);
		if (type.sprite != -1) {
			@Pc(42) IndexedSprite sprite = type.method1811(false, true);
			if (sprite != null) {
				if (element.xOffset - (sprite.width + 1 >> 1) <= Static3.anInt2970 && element.xOffset + (sprite.width + 1 >> 1) >= Static3.anInt2969 && element.yOffset - (sprite.height + 1 >> 1) <= Static3.anInt2971 && element.yOffset + (sprite.height + 1 >> 1) >= Static3.anInt2968) {
					element.hidden = false;
				} else {
					element.hidden = true;
				}
				return;
			}
		}
		if (element.x >= Static3.anInt2973 && element.x <= Static3.anInt2972 && element.z >= Static3.anInt2967 && element.z <= Static3.anInt2966) {
			element.hidden = false;
		} else {
			element.hidden = true;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Lclient!fd;)V")
	public static void method2406(@OriginalArg(0) Buffer arg0) {
		label83:
		while (true) {
			if (arg0.position < arg0.bytes.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.readUnsignedByte() == 1) {
					local7 = true;
					local9 = arg0.readUnsignedByte();
					local11 = arg0.readUnsignedByte();
				}
				@Pc(30) int local30 = arg0.readUnsignedByte();
				@Pc(34) int local34 = arg0.readUnsignedByte();
				@Pc(40) int local40 = local30 * 64 - Static3.anInt2962;
				@Pc(50) int local50 = Static3.anInt2960 + Static3.anInt2961 - local34 * 64 - 1;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < Static3.anInt2965 && local50 < Static3.anInt2960) {
					@Pc(68) int local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) byte local113 = arg0.readByte();
								if (local113 != 0) {
									if (Static3.aByteArrayArrayArray10[local68][local72] == null) {
										Static3.aByteArrayArrayArray10[local68][local72] = new byte[4096];
									}
									Static3.aByteArrayArrayArray10[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.readByte();
									if (Static3.aByteArrayArrayArray11[local68][local72] == null) {
										Static3.aByteArrayArrayArray11[local68][local72] = new byte[4096];
									}
									Static3.aByteArrayArrayArray11[local68][local72][(63 - local79 << 6) + local74] = local146;
								}
							}
						}
						local74++;
					}
				}
				@Pc(180) int local180 = 0;
				while (true) {
					if (local180 >= (local7 ? 64 : 4096)) {
						continue label83;
					}
					@Pc(191) byte local191 = arg0.readByte();
					if (local191 != 0) {
						arg0.position++;
					}
					local180++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fd;Z)V")
	public static void method2407(@OriginalArg(0) Buffer arg0, @OriginalArg(1) boolean arg1) {
		label125:
		while (true) {
			if (arg0.position < arg0.bytes.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.readUnsignedByte() == 1) {
					local7 = true;
					local9 = arg0.readUnsignedByte();
					local11 = arg0.readUnsignedByte();
				}
				@Pc(30) int local30 = arg0.readUnsignedByte();
				@Pc(34) int local34 = arg0.readUnsignedByte();
				@Pc(40) int local40 = local30 * 64 - Static3.anInt2962;
				@Pc(50) int local50 = Static3.anInt2960 + Static3.anInt2961 - local34 * 64 - 1;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < Static3.anInt2965 && local50 < Static3.anInt2960) {
					@Pc(68) int local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label125;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) int local113 = arg0.readUnsignedByte();
								if (local113 != 0) {
									if ((local113 & 0x1) == 1) {
										@Pc(125) int local125 = arg0.readUnsignedByte();
										if (Static3.aByteArrayArrayArray12[local68][local72] == null) {
											Static3.aByteArrayArrayArray12[local68][local72] = new byte[4096];
										}
										Static3.aByteArrayArrayArray12[local68][local72][(63 - local79 << 6) + local74] = (byte) local125;
									}
									if ((local113 & 0x2) == 2) {
										@Pc(162) int local162 = arg0.readUnsignedMedium();
										if (Static3.anIntArrayArrayArray6[local68][local72] == null) {
											Static3.anIntArrayArrayArray6[local68][local72] = new int[4096];
										}
										Static3.anIntArrayArrayArray6[local68][local72][(63 - local79 << 6) + local74] = local162;
									}
									if ((local113 & 0x4) == 4) {
										@Pc(198) int local198 = arg0.readUnsignedShort();
										@Pc(202) int local202 = arg0.readUnsignedByte();
										local198--;
										@Pc(207) LocType local207 = LocTypeList.get(local198);
										if (local207.multiLocs != null) {
											local207 = local207.getMultiLoc();
											if (local207 == null || local207.anInt5526 == -1) {
												continue;
											}
										}
										if ((!local207.members || arg1) && local207.anInt5526 != -1) {
											@Pc(236) MapElement local236 = new MapElement();
											local236.id = local207.anInt5526;
											local236.level = local202;
											local236.x = local68 * 64 + local74;
											local236.z = local72 * 64 + 64 - local79;
											Static3.aClass175_12.addTail(local236);
										}
									}
								}
							}
						}
						local74++;
					}
				}
				@Pc(270) int local270 = 0;
				while (true) {
					if (local270 >= (local7 ? 64 : 4096)) {
						continue label125;
					}
					@Pc(281) int local281 = arg0.readUnsignedByte();
					if (local281 != 0) {
						if ((local281 & 0x1) == 1) {
							arg0.position++;
						}
						if ((local281 & 0x2) == 2) {
							arg0.position += 2;
						}
						if ((local281 & 0x4) == 4) {
							arg0.position += 3;
						}
					}
					local270++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V")
	public static void method2408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < FloTypeList.capacity; local1++) {
			@Pc(8) FloType local8 = FloTypeList.get(local1);
			if (local8 != null) {
				@Pc(14) int local14 = local8.anInt3877;
				if (local14 >= 0 && !Static4.textureProvider.method441(local14)) {
					local14 = -1;
				}
				@Pc(64) int local64;
				if (local8.anInt3870 >= 0) {
					@Pc(29) int local29 = local8.anInt3870;
					@Pc(35) int local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					@Pc(57) int local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = ColorUtils.HSL_TO_RGB[Static22.method2286(local57, 96)];
				} else if (local14 >= 0) {
					local64 = ColorUtils.HSL_TO_RGB[Static22.method2286(Static4.textureProvider.method446(local14), 96)];
				} else if (local8.anInt3869 == -1) {
					local64 = -1;
				} else {
					@Pc(88) int local88 = local8.anInt3869;
					@Pc(94) int local94 = (local88 & 0x7F) + arg1;
					if (local94 < 0) {
						local94 = 0;
					} else if (local94 > 127) {
						local94 = 127;
					}
					@Pc(116) int local116 = (local88 + arg0 & 0xFC00) + (local88 & 0x380) + local94;
					local64 = ColorUtils.HSL_TO_RGB[Static22.method2286(local116, 96)];
				}
				Static3.anIntArray266[local1 + 1] = local64;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIIIIIIZ)V")
	public static void method2409(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		@Pc(1) int local1 = arg1;
		if (arg1 >= SoftwareRaster.clipWidth) {
			return;
		}
		if (arg1 < SoftwareRaster.clipX) {
			local1 = SoftwareRaster.clipX;
		}
		@Pc(14) int local14 = arg1 + arg5;
		if (local14 <= SoftwareRaster.clipX) {
			return;
		}
		if (local14 > SoftwareRaster.clipWidth) {
			local14 = SoftwareRaster.clipWidth;
		}
		@Pc(25) int local25 = arg2;
		if (arg2 >= SoftwareRaster.clipHeight) {
			return;
		}
		if (arg2 < SoftwareRaster.clipY) {
			local25 = SoftwareRaster.clipY;
		}
		@Pc(38) int local38 = arg2 + arg6;
		if (local38 <= SoftwareRaster.clipY) {
			return;
		}
		if (local38 > SoftwareRaster.clipHeight) {
			local38 = SoftwareRaster.clipHeight;
		}
		@Pc(53) int local53 = local25 * SoftwareRaster.width + local1;
		@Pc(59) int local59 = SoftwareRaster.width + local1 - local14;
		@Pc(63) int local63 = local1 - arg1;
		@Pc(67) int local67 = local14 - arg1;
		@Pc(71) int local71 = local25 - arg2;
		@Pc(75) int local75 = local38 - arg2;
		@Pc(79) int local79 = arg5 - local67;
		@Pc(83) int local83 = arg5 - local63;
		@Pc(87) int local87 = arg6 - local75;
		@Pc(91) int local91 = arg6 - local71;
		if (arg7 == 9) {
			arg7 = 1;
			arg8 = arg8 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg7 = 1;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg7 == 1) {
			if (arg8 == 0) {
				for (@Pc(131) int local131 = local71; local131 < local75; local131++) {
					for (@Pc(136) int local136 = local63; local136 < local67; local136++) {
						if (local136 <= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(170) int local170 = local91 - 1; local170 >= local87; local170--) {
					for (@Pc(175) int local175 = local63; local175 < local67; local175++) {
						if (local175 <= local170) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(207) int local207 = local71; local207 < local75; local207++) {
					for (@Pc(212) int local212 = local63; local212 < local67; local212++) {
						if (local212 >= local207) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(246) int local246 = local91 - 1; local246 >= local87; local246--) {
					for (@Pc(251) int local251 = local63; local251 < local67; local251++) {
						if (local251 >= local246) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 2) {
			if (arg8 == 0) {
				for (@Pc(288) int local288 = local91 - 1; local288 >= local87; local288--) {
					for (@Pc(293) int local293 = local63; local293 < local67; local293++) {
						if (local293 <= local288 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(327) int local327 = local71; local327 < local75; local327++) {
					for (@Pc(332) int local332 = local63; local332 < local67; local332++) {
						if (local53 >= 0 && local53 < arg0.length) {
							if (local332 >= local327 << 1) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						} else {
							local53++;
						}
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(374) int local374 = local71; local374 < local75; local374++) {
					for (@Pc(381) int local381 = local83 - 1; local381 >= local79; local381--) {
						if (local381 <= local374 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(417) int local417 = local91 - 1; local417 >= local87; local417--) {
					for (@Pc(424) int local424 = local83 - 1; local424 >= local79; local424--) {
						if (local424 >= local417 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 3) {
			if (arg8 == 0) {
				for (@Pc(463) int local463 = local91 - 1; local463 >= local87; local463--) {
					for (@Pc(470) int local470 = local83 - 1; local470 >= local79; local470--) {
						if (local470 <= local463 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(506) int local506 = local91 - 1; local506 >= local87; local506--) {
					for (@Pc(511) int local511 = local63; local511 < local67; local511++) {
						if (local511 >= local506 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(545) int local545 = local71; local545 < local75; local545++) {
					for (@Pc(550) int local550 = local63; local550 < local67; local550++) {
						if (local550 <= local545 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(584) int local584 = local71; local584 < local75; local584++) {
					for (@Pc(591) int local591 = local83 - 1; local591 >= local79; local591--) {
						if (local591 >= local584 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 4) {
			if (arg8 == 0) {
				for (@Pc(630) int local630 = local91 - 1; local630 >= local87; local630--) {
					for (@Pc(635) int local635 = local63; local635 < local67; local635++) {
						if (local635 >= local630 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (@Pc(669) int local669 = local71; local669 < local75; local669++) {
					for (@Pc(674) int local674 = local63; local674 < local67; local674++) {
						if (local674 <= local669 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (@Pc(708) int local708 = local71; local708 < local75; local708++) {
					for (@Pc(715) int local715 = local83 - 1; local715 >= local79; local715--) {
						if (local715 >= local708 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (@Pc(751) int local751 = local91 - 1; local751 >= local87; local751--) {
					for (@Pc(758) int local758 = local83 - 1; local758 >= local79; local758--) {
						if (local758 <= local751 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 != 5) {
			if (arg7 == 6) {
				if (arg8 == 0) {
					for (@Pc(962) int local962 = local71; local962 < local75; local962++) {
						for (@Pc(967) int local967 = local63; local967 < local67; local967++) {
							if (local967 <= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (@Pc(1001) int local1001 = local71; local1001 < local75; local1001++) {
						for (@Pc(1006) int local1006 = local63; local1006 < local67; local1006++) {
							if (local1001 <= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (@Pc(1040) int local1040 = local71; local1040 < local75; local1040++) {
						for (@Pc(1045) int local1045 = local63; local1045 < local67; local1045++) {
							if (local1045 >= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (@Pc(1079) int local1079 = local71; local1079 < local75; local1079++) {
						for (@Pc(1084) int local1084 = local63; local1084 < local67; local1084++) {
							if (local1079 >= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 7) {
				if (arg8 == 0) {
					for (@Pc(1120) int local1120 = local71; local1120 < local75; local1120++) {
						for (@Pc(1125) int local1125 = local63; local1125 < local67; local1125++) {
							if (local1125 <= local1120 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (@Pc(1163) int local1163 = local91 - 1; local1163 >= local87; local1163--) {
						for (@Pc(1168) int local1168 = local63; local1168 < local67; local1168++) {
							if (local1168 <= local1163 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (@Pc(1206) int local1206 = local91 - 1; local1206 >= local87; local1206--) {
						for (@Pc(1213) int local1213 = local83 - 1; local1213 >= local79; local1213--) {
							if (local1213 <= local1206 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (@Pc(1249) int local1249 = local71; local1249 < local75; local1249++) {
						for (@Pc(1256) int local1256 = local83 - 1; local1256 >= local79; local1256--) {
							if (local1256 <= local1249 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 8) {
				if (arg8 == 0) {
					for (@Pc(1294) int local1294 = local71; local1294 < local75; local1294++) {
						for (@Pc(1299) int local1299 = local63; local1299 < local67; local1299++) {
							if (local1299 >= local1294 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (@Pc(1337) int local1337 = local91 - 1; local1337 >= local87; local1337--) {
						for (@Pc(1342) int local1342 = local63; local1342 < local67; local1342++) {
							if (local1342 >= local1337 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (@Pc(1380) int local1380 = local91 - 1; local1380 >= local87; local1380--) {
						for (@Pc(1387) int local1387 = local83 - 1; local1387 >= local79; local1387--) {
							if (local1387 >= local1380 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (@Pc(1423) int local1423 = local71; local1423 < local75; local1423++) {
						for (@Pc(1430) int local1430 = local83 - 1; local1430 >= local79; local1430--) {
							if (local1430 >= local1423 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
		} else if (arg8 == 0) {
			for (@Pc(797) int local797 = local91 - 1; local797 >= local87; local797--) {
				for (@Pc(804) int local804 = local83 - 1; local804 >= local79; local804--) {
					if (local804 >= local797 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 1) {
			for (@Pc(840) int local840 = local91 - 1; local840 >= local87; local840--) {
				for (@Pc(845) int local845 = local63; local845 < local67; local845++) {
					if (local845 <= local840 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 2) {
			for (@Pc(879) int local879 = local71; local879 < local75; local879++) {
				for (@Pc(884) int local884 = local63; local884 < local67; local884++) {
					if (local884 >= local879 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 3) {
			for (@Pc(918) int local918 = local71; local918 < local75; local918++) {
				for (@Pc(925) int local925 = local83 - 1; local925 >= local79; local925--) {
					if (local925 <= local918 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)Lclient!ll;")
	public static LinkedList method2410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) LinkedList local3 = new LinkedList();
		for (@Pc(8) MapElement local8 = (MapElement) Static3.aClass175_12.head(); local8 != null; local8 = (MapElement) Static3.aClass175_12.next()) {
			method2404(local8, arg0, arg1);
			local3.addTail(local8);
		}
		@Pc(29) int[] local29 = new int[3];
		for (@Pc(31) int local31 = 0; local31 < Static3.aClass138_6.size; local31++) {
			@Pc(40) MapElement local40 = Static3.aClass138_6.elements[local31];
			@Pc(67) boolean local67 = WorldMap.currentMap.convertSourceToDisplay(Static3.aClass138_6.positions[local31] >> 28 & 0x3, Static3.aClass138_6.positions[local31] >> 14 & 0x3FFF, Static3.aClass138_6.positions[local31] & 0x3FFF, local29);
			if (local67) {
				local40.x = local29[1] - Static3.anInt2962;
				local40.z = Static3.anInt2960 + Static3.anInt2961 - local29[2] - 1;
				method2404(local40, arg0, arg1);
				local3.addTail(local40);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	public static void method1916(@OriginalArg(1) int y, @OriginalArg(2) int x) {
		if (Static2.anInt1943 > 0) {
			Static24.method2702(Static2.anInt1943);
			Static2.anInt1943 = 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = SoftwareRaster.width * y;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < 255; local29++) {
			@Pc(49) int local49 = (256 - local29) * Static4.anIntArray314[local29] / 256;
			if (local49 < 0) {
				local49 = 0;
			}
			local15 += local49;
			for (@Pc(61) int local61 = local49; local61 < 128; local61++) {
				@Pc(74) int local74 = SoftwareRaster.pixels[x + local23++];
				@Pc(79) int local79 = Static2.anIntArray100[local15++];
				if (local79 == 0) {
					Static4.aClass4_Sub3_Sub14_Sub1_4.pixels[local27++] = local74;
				} else {
					@Pc(96) int local96 = local79 + 18;
					if (local96 > 255) {
						local96 = 255;
					}
					@Pc(108) int local108 = 256 - local79 - 18;
					if (local108 > 255) {
						local108 = 255;
					}
					@Pc(120) int local120 = Static3.anIntArray196[local79];
					Static4.aClass4_Sub3_Sub14_Sub1_4.pixels[local27++] = (local108 * (local74 & 0xFF00FF) + (local120 & 0xFF00FF) * local96 & 0xFF00FF00) + (local108 * (local74 & 0xFF00) + (local120 & 0xFF00) * local96 & 0xFF0000) >> 8;
				}
			}
			for (@Pc(160) int local160 = 0; local160 < local49; local160++) {
				Static4.aClass4_Sub3_Sub14_Sub1_4.pixels[local27++] = SoftwareRaster.pixels[x + local23++];
			}
			local23 += SoftwareRaster.width - 128;
		}
		if (GlRenderer.enabled) {
			GlRaster.drawPixels(Static4.aClass4_Sub3_Sub14_Sub1_4.pixels, x, y, Static4.aClass4_Sub3_Sub14_Sub1_4.width, Static4.aClass4_Sub3_Sub14_Sub1_4.height);
		} else {
			Static4.aClass4_Sub3_Sub14_Sub1_4.render(x, y);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method1921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 <= 3) {
			return local8 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
		} else {
			return "<col=80ff00>";
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
	public static void method1924() {
		if (Static7.aBoolean401) {
			return;
		}
		if (Preferences.aBoolean293) {
			Static5.aFloat97 = (int) Static5.aFloat97 + 191 & 0xFFFFFF80;
		} else {
			Static4.aFloat79 += (24.0F - Static4.aFloat79) / 2.0F;
		}
		Static7.aBoolean401 = true;
		Static5.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBIII)V")
	public static void method1928(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (WorldMap.loadPercentage < 100) {
			WorldMap.load();
		}
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg2, arg1, arg2 + arg3, arg0 + arg1);
		} else {
			SoftwareRaster.setClip(arg2, arg1, arg3 + arg2, arg1 + arg0);
		}
		if (WorldMap.loadPercentage < 100) {
			@Pc(47) int local47 = arg3 / 2 + arg2;
			@Pc(59) int local59 = arg1 + arg0 / 2 - 20 - 18;
			if (GlRenderer.enabled) {
				GlRaster.fillRect(arg2, arg1, arg3, arg0, 0);
				GlRaster.drawRect(local47 - 152, local59, 304, 34, 9179409);
				GlRaster.fillRect(local47 - 150, local59 + 2, WorldMap.loadPercentage * 3, 30, 9179409);
			} else {
				SoftwareRaster.fillRect(arg2, arg1, arg3, arg0, 0);
				SoftwareRaster.drawRect(local47 - 152, local59, 304, 34, 9179409);
				SoftwareRaster.fillRect(local47 - 150, local59 + 2, WorldMap.loadPercentage * 3, 30, 9179409);
			}
			Fonts.b12Full.method2271(LocalisedText.LOADINGDOTDOTDOT, local47, local59 + 20, 16777215, -1);
			return;
		}
		Static7.anInt5680 = (int) ((float) (arg0 * 2) / Static3.aFloat68);
		Static5.anInt3546 = Static7.anInt5231 - (int) ((float) arg0 / Static3.aFloat68);
		Static3.anInt2542 = Static1.anInt331 - (int) ((float) arg3 / Static3.aFloat68);
		Static7.anInt5331 = (int) ((float) (arg3 * 2) / Static3.aFloat68);
		@Pc(169) int local169 = Static1.anInt331 - (int) ((float) arg3 / Static3.aFloat68);
		@Pc(177) int local177 = Static7.anInt5231 - (int) ((float) arg0 / Static3.aFloat68);
		@Pc(190) int local190 = (int) ((float) arg3 / Static3.aFloat68) + Static1.anInt331;
		@Pc(198) int local198 = (int) ((float) arg0 / Static3.aFloat68) + Static7.anInt5231;
		if (GlRenderer.enabled) {
			if (Static3.aClass4_Sub3_Sub14_Sub1_2 == null || arg3 != Static3.aClass4_Sub3_Sub14_Sub1_2.width || Static3.aClass4_Sub3_Sub14_Sub1_2.height != arg0) {
				Static3.aClass4_Sub3_Sub14_Sub1_2 = null;
				Static3.aClass4_Sub3_Sub14_Sub1_2 = new SoftwareSprite(arg3, arg0);
			}
			SoftwareRaster.setPixels(Static3.aClass4_Sub3_Sub14_Sub1_2.pixels, arg3, arg0);
			Static19.method2401(local169, local177, local190, local198, 0, 0, arg3, arg0 + 1);
			method2403();
			@Pc(268) LinkedList local268 = Static19.method2397();
			Static9.method193(local268, arg2, arg1);
			Static3.aClass4_Sub3_Sub14_Sub1_2.method2169();
			GlRaster.drawPixels(Static3.aClass4_Sub3_Sub14_Sub1_2.pixels, arg2, arg1, arg3, arg0);
			SoftwareRaster.pixels = null;
		} else {
			Static19.method2401(local169, local177, local190, local198, arg2, arg1, arg3 + arg2, arg0 + arg1 + 1);
			method2403();
			@Pc(218) LinkedList local218 = Static19.method2397();
			Static9.method193(local218, 0, 0);
		}
		if (Static4.anInt2853 > 0) {
			Static5.anInt4215--;
			if (Static5.anInt4215 == 0) {
				Static5.anInt4215 = 20;
				Static4.anInt2853--;
			}
		}
		if (!client.displayFps) {
			return;
		}
		@Pc(310) int local310 = arg3 + arg2 - 5;
		@Pc(312) int local312 = 16776960;
		@Pc(318) int local318 = arg1 + arg0 - 8;
		Fonts.p12Full.method2275("Fps:" + GameShell.framesPerSecond, local310, local318, 16776960, -1);
		@Pc(334) Runtime local334 = Runtime.getRuntime();
		local318 -= 15;
		@Pc(344) int local344 = (int) ((local334.totalMemory() - local334.freeMemory()) / 1024L);
		if (local344 > 65536) {
			local312 = 16711680;
		}
		Fonts.p12Full.method2275("Mem:" + local344 + "k", local310, local318, local312, -1);
		@Pc(368) int local368 = local318 - 15;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public static void method1929() {
		Static1.aClass4_Sub3_Sub10_2 = null;
		Static1.aClass4_Sub3_Sub10_1 = null;
		Static2.aClass4_Sub3_Sub10_3 = null;
		Static3.aClass4_Sub3_Sub10_4 = null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIZ)V")
	public static void method1930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static2.anInt902 <= arg0 && Static3.anInt2553 >= arg0) {
			arg1 = Static8.method9(Static4.anInt3086, arg1, Static5.anInt4230);
			arg2 = Static8.method9(Static4.anInt3086, arg2, Static5.anInt4230);
			Static10.method306(arg0, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
	public static void method1932() {
		if (PlayerList.self != null && PlayerList.self.xFine + 64 - PlayerList.self.getSize() * 64 >> 7 == Static6.anInt4506 && PlayerList.self.zFine + 64 - PlayerList.self.getSize() * 64 >> 7 == Static3.anInt2140) {
			Static3.aBoolean147 = false;
			Static6.anInt4506 = 0;
		}
		for (@Pc(46) int local46 = 0; local46 < 104; local46++) {
			for (@Pc(53) int local53 = 0; local53 < 104; local53++) {
				Static1.anIntArrayArray2[local46][local53] = 0;
			}
		}
		for (@Pc(79) int local79 = 0; local79 < PlayerList.size; local79++) {
			@Pc(92) Player local92 = PlayerList.players[PlayerList.ids[local79]];
			if (local92 != null) {
				local92.aBoolean281 = false;
			}
		}
		for (@Pc(103) int local103 = 0; local103 < NpcList.size; local103++) {
			@Pc(112) Npc local112 = NpcList.npcs[NpcList.ids[local103]];
			if (local112 != null) {
				local112.aBoolean281 = false;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V")
	public static void method1942() {
		Static6.aClass26_48.clean(50);
		Static1.aClass26_1.clean(50);
		Static1.aClass26_4.clean(50);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	public static void method1949() {
		@Pc(9) Container local9;
		if (GameShell.fullScreenFrame != null) {
			local9 = GameShell.fullScreenFrame;
		} else if (GameShell.frame == null) {
			local9 = GameShell.signLink.applet;
		} else {
			local9 = GameShell.frame;
		}
		GameShell.frameWidth = local9.getSize().width;
		GameShell.frameHeight = local9.getSize().height;
		if (local9 == GameShell.frame) {
			@Pc(35) Insets local35 = GameShell.frame.getInsets();
			GameShell.frameWidth -= local35.left + local35.right;
			GameShell.frameHeight -= local35.bottom + local35.top;
		}
		if (Static11.getWindowMode() >= 2) {
			GameShell.topMargin = 0;
			GameShell.canvasWidth = GameShell.frameWidth;
			GameShell.leftMargin = 0;
			GameShell.canvasHeight = GameShell.frameHeight;
		} else {
			GameShell.canvasWidth = 765;
			GameShell.canvasHeight = 503;
			GameShell.leftMargin = (GameShell.frameWidth - 765) / 2;
			GameShell.topMargin = 0;
		}
		if (GlRenderer.enabled) {
			GlRenderer.setCanvasSize(GameShell.canvasWidth, GameShell.canvasHeight);
		}
		GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
		if (local9 == GameShell.frame) {
			@Pc(104) Insets local104 = GameShell.frame.getInsets();
			GameShell.canvas.setLocation(local104.left + GameShell.leftMargin, GameShell.topMargin + local104.top);
		} else {
			GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
		}
		if (InterfaceList.topLevelInterface != -1) {
			Static12.method777(true);
		}
		Static29.method3430();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!vc;IIIII)V")
	public static void method1951(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != SceneGraph.levels) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < SceneGraph.width) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < SceneGraph.length && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Tile local71 = SceneGraph.tiles[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (SceneGraph.tileHeights[local17][local28][local39] + SceneGraph.tileHeights[local17][local28 + 1][local39] + SceneGraph.tileHeights[local17][local28][local39 + 1] + SceneGraph.tileHeights[local17][local28 + 1][local39 + 1]) / 4 - (SceneGraph.tileHeights[arg1][arg2][arg3] + SceneGraph.tileHeights[arg1][arg2 + 1][arg3] + SceneGraph.tileHeights[arg1][arg2][arg3 + 1] + SceneGraph.tileHeights[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Wall local161 = local71.wall;
									if (local161 != null) {
										if (local161.primary.method3808()) {
											arg0.method3807(local161.primary, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.secondary != null && local161.secondary.method3808()) {
											arg0.method3807(local161.secondary, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.sceneryLen; local232++) {
										@Pc(241) Scenery local241 = local71.scenery[local232];
										if (local241 != null && local241.entity.method3808() && (local28 == local241.xMin || local28 == local3) && (local39 == local241.zMin || local39 == local11)) {
											@Pc(270) int local270 = local241.xMax + 1 - local241.xMin;
											@Pc(278) int local278 = local241.zMax + 1 - local241.zMin;
											arg0.method3807(local241.entity, (local241.xMin - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.zMin - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIZI)I")
	public static int method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg0;
		} else {
			@Pc(19) int local19 = 128 - arg2;
			@Pc(37) int local37 = arg2 * (arg1 >>> 7 & 0x1FE01FE) + (arg0 >>> 7 & 0x1FE01FE) * local19 & 0xFF00FF00;
			@Pc(51) int local51 = arg2 * (arg1 & 0xFF00FF) + (arg0 & 0xFF00FF) * local19 & 0xFF00FF00;
			return local37 + (local51 >> 7);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBI)V")
	public static void method1970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static1.anInt929 = Static3.anInt2961 + Static3.anInt2960 - arg1 - 1;
		Static6.anInt4393 = arg0 - Static3.anInt2962;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method1974() {
		Static6.aClass26_48.removeSoft();
		Static1.aClass26_1.removeSoft();
		Static1.aClass26_4.removeSoft();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIII)V")
	public static void method1975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg0) {
			Static18.method1656(Static5.anIntArrayArray36[arg3], arg2, arg0, arg1);
		} else {
			Static18.method1656(Static5.anIntArrayArray36[arg3], arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method1976() {
		for (@Pc(16) ProjAnimNode local16 = (ProjAnimNode) Static1.aClass112_1.head(); local16 != null; local16 = (ProjAnimNode) Static1.aClass112_1.next()) {
			@Pc(22) ProjAnim local22 = local16.value;
			if (local22.anInt3717 != Player.level || client.loop > local22.anInt3707) {
				local16.unlink();
			} else if (local22.anInt3719 <= client.loop) {
				if (local22.anInt3713 > 0) {
					@Pc(61) Npc local61 = NpcList.npcs[local22.anInt3713 - 1];
					if (local61 != null && local61.xFine >= 0 && local61.xFine < 13312 && local61.zFine >= 0 && local61.zFine < 13312) {
						local22.method3105(SceneGraph.method522(local22.anInt3717, local61.xFine, local61.zFine) - local22.anInt3722, local61.xFine, client.loop, local61.zFine);
					}
				}
				if (local22.anInt3713 < 0) {
					@Pc(113) int local113 = -local22.anInt3713 - 1;
					@Pc(118) Player local118;
					if (PlayerList.selfId == local113) {
						local118 = PlayerList.self;
					} else {
						local118 = PlayerList.players[local113];
					}
					if (local118 != null && local118.xFine >= 0 && local118.xFine < 13312 && local118.zFine >= 0 && local118.zFine < 13312) {
						local22.method3105(SceneGraph.method522(local22.anInt3717, local118.xFine, local118.zFine) - local22.anInt3722, local118.xFine, client.loop, local118.zFine);
					}
				}
				local22.method3103(Static5.anInt4156);
				SceneGraph.method637(Player.level, (int) local22.aDouble8, (int) local22.aDouble10, (int) local22.aDouble5, 60, local22, local22.anInt3723, -1L, false);
			}
		}
	}

}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "Lclient!ic;")
	public Class84 aClass84_23;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[B")
	public final byte[] aByteArray67;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class4_Sub31(@OriginalArg(0) Class4_Sub10 arg0) {
		arg0.anInt5709 = arg0.aByteArray71.length - 3;
		@Pc(12) int local12 = arg0.method4629();
		@Pc(16) int local16 = arg0.method4616();
		@Pc(22) int local22 = local12 * 10 + 14;
		arg0.anInt5709 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 0; local43 < local12; local43++) {
			@Pc(48) int local48 = -1;
			while (true) {
				@Pc(52) int local52 = arg0.method4629();
				if (local52 != local48) {
					local22++;
				}
				local48 = local52 & 0xF;
				if (local52 == 7) {
					break;
				}
				if (local52 == 23) {
					local27++;
				} else if (local48 == 0) {
					local31++;
				} else if (local48 == 1) {
					local33++;
				} else if (local48 == 2) {
					local29++;
				} else if (local48 == 3) {
					local35++;
				} else if (local48 == 4) {
					local37++;
				} else if (local48 == 5) {
					local39++;
				} else if (local48 == 6) {
					local41++;
				} else {
					throw new RuntimeException();
				}
			}
		}
		@Pc(115) int local115 = local22 + local27 * 5;
		local115 += (local31 + local33 + local29 + local35 + local39) * 2;
		local115 += local37 + local41;
		@Pc(138) int local138 = arg0.anInt5709;
		@Pc(156) int local156 = local12 + local27 + local29 + local31 + local33 + local35 + local37 + local39 + local41;
		for (@Pc(158) int local158 = 0; local158 < local156; local158++) {
			arg0.method4609();
		}
		@Pc(174) int local174 = local115 + arg0.anInt5709 - local138;
		@Pc(177) int local177 = arg0.anInt5709;
		@Pc(179) int local179 = 0;
		@Pc(181) int local181 = 0;
		@Pc(183) int local183 = 0;
		@Pc(185) int local185 = 0;
		@Pc(187) int local187 = 0;
		@Pc(189) int local189 = 0;
		@Pc(191) int local191 = 0;
		@Pc(193) int local193 = 0;
		@Pc(195) int local195 = 0;
		@Pc(197) int local197 = 0;
		@Pc(199) int local199 = 0;
		@Pc(201) int local201 = 0;
		@Pc(203) int local203 = 0;
		for (@Pc(205) int local205 = 0; local205 < local29; local205++) {
			local203 = local203 + arg0.method4629() & 0x7F;
			if (local203 == 0 || local203 == 32) {
				local41++;
			} else if (local203 == 1) {
				local179++;
			} else if (local203 == 33) {
				local181++;
			} else if (local203 == 7) {
				local183++;
			} else if (local203 == 39) {
				local185++;
			} else if (local203 == 10) {
				local187++;
			} else if (local203 == 42) {
				local189++;
			} else if (local203 == 99) {
				local191++;
			} else if (local203 == 98) {
				local193++;
			} else if (local203 == 101) {
				local195++;
			} else if (local203 == 100) {
				local197++;
			} else if (local203 == 64 || local203 == 65 || local203 == 120 || local203 == 121 || local203 == 123) {
				local199++;
			} else {
				local201++;
			}
		}
		@Pc(295) int local295 = 0;
		@Pc(298) int local298 = arg0.anInt5709;
		arg0.anInt5709 += local199;
		@Pc(307) int local307 = arg0.anInt5709;
		arg0.anInt5709 += local39;
		@Pc(316) int local316 = arg0.anInt5709;
		arg0.anInt5709 += local37;
		@Pc(325) int local325 = arg0.anInt5709;
		arg0.anInt5709 += local35;
		@Pc(334) int local334 = arg0.anInt5709;
		arg0.anInt5709 += local179;
		@Pc(343) int local343 = arg0.anInt5709;
		arg0.anInt5709 += local183;
		@Pc(352) int local352 = arg0.anInt5709;
		arg0.anInt5709 += local187;
		@Pc(361) int local361 = arg0.anInt5709;
		arg0.anInt5709 += local31 + local33 + local39;
		@Pc(374) int local374 = arg0.anInt5709;
		arg0.anInt5709 += local31;
		@Pc(383) int local383 = arg0.anInt5709;
		arg0.anInt5709 += local201;
		@Pc(392) int local392 = arg0.anInt5709;
		arg0.anInt5709 += local33;
		@Pc(401) int local401 = arg0.anInt5709;
		arg0.anInt5709 += local181;
		@Pc(410) int local410 = arg0.anInt5709;
		arg0.anInt5709 += local185;
		@Pc(419) int local419 = arg0.anInt5709;
		arg0.anInt5709 += local189;
		@Pc(428) int local428 = arg0.anInt5709;
		arg0.anInt5709 += local41;
		@Pc(437) int local437 = arg0.anInt5709;
		arg0.anInt5709 += local35;
		@Pc(446) int local446 = arg0.anInt5709;
		arg0.anInt5709 += local191;
		@Pc(455) int local455 = arg0.anInt5709;
		arg0.anInt5709 += local193;
		@Pc(464) int local464 = arg0.anInt5709;
		arg0.anInt5709 += local195;
		@Pc(473) int local473 = arg0.anInt5709;
		arg0.anInt5709 += local197;
		@Pc(482) int local482 = arg0.anInt5709;
		arg0.anInt5709 += local27 * 3;
		this.aByteArray67 = new byte[local174];
		@Pc(500) Class4_Sub10 local500 = new Class4_Sub10(this.aByteArray67);
		local500.method4617(1297377380);
		local500.method4617(6);
		local500.method4631(local12 > 1 ? 1 : 0);
		local500.method4631(local12);
		local500.method4631(local16);
		arg0.anInt5709 = local138;
		@Pc(530) int local530 = 0;
		@Pc(532) int local532 = 0;
		@Pc(534) int local534 = 0;
		@Pc(536) int local536 = 0;
		@Pc(538) int local538 = 0;
		@Pc(540) int local540 = 0;
		@Pc(542) int local542 = 0;
		@Pc(545) int[] local545 = new int[128];
		@Pc(547) int local547 = 0;
		label221:
		for (@Pc(549) int local549 = 0; local549 < local12; local549++) {
			local500.method4617(1297379947);
			local500.anInt5709 += 4;
			@Pc(565) int local565 = local500.anInt5709;
			@Pc(567) int local567 = -1;
			while (true) {
				while (true) {
					@Pc(571) int local571 = arg0.method4609();
					local500.method4580(local571);
					@Pc(583) int local583 = arg0.aByteArray71[local295++] & 0xFF;
					@Pc(590) boolean local590 = local583 != local567;
					local567 = local583 & 0xF;
					if (local583 == 7) {
						if (local590) {
							local500.method4581(255);
						}
						local500.method4581(47);
						local500.method4581(0);
						local500.method4610(local500.anInt5709 - local565);
						continue label221;
					}
					if (local583 == 23) {
						if (local590) {
							local500.method4581(255);
						}
						local500.method4581(81);
						local500.method4581(3);
						@Pc(634) int local634 = local482 + 1;
						local500.method4581(arg0.aByteArray71[local482]);
						local500.method4581(arg0.aByteArray71[local634++]);
						local482 = local634 + 1;
						local500.method4581(arg0.aByteArray71[local634]);
					} else {
						local530 ^= local583 >> 4;
						if (local567 == 0) {
							if (local590) {
								local500.method4581(local530 + 144);
							}
							local532 += arg0.aByteArray71[local361++];
							local534 += arg0.aByteArray71[local374++];
							local500.method4581(local532 & 0x7F);
							local500.method4581(local534 & 0x7F);
						} else if (local567 == 1) {
							if (local590) {
								local500.method4581(local530 + 128);
							}
							local532 += arg0.aByteArray71[local361++];
							local536 += arg0.aByteArray71[local392++];
							local500.method4581(local532 & 0x7F);
							local500.method4581(local536 & 0x7F);
						} else if (local567 == 2) {
							if (local590) {
								local500.method4581(local530 + 176);
							}
							local547 = local547 + arg0.aByteArray71[local177++] & 0x7F;
							local500.method4581(local547);
							@Pc(775) byte local775;
							if (local547 == 0 || local547 == 32) {
								local775 = arg0.aByteArray71[local428++];
							} else if (local547 == 1) {
								local775 = arg0.aByteArray71[local334++];
							} else if (local547 == 33) {
								local775 = arg0.aByteArray71[local401++];
							} else if (local547 == 7) {
								local775 = arg0.aByteArray71[local343++];
							} else if (local547 == 39) {
								local775 = arg0.aByteArray71[local410++];
							} else if (local547 == 10) {
								local775 = arg0.aByteArray71[local352++];
							} else if (local547 == 42) {
								local775 = arg0.aByteArray71[local419++];
							} else if (local547 == 99) {
								local775 = arg0.aByteArray71[local446++];
							} else if (local547 == 98) {
								local775 = arg0.aByteArray71[local455++];
							} else if (local547 == 101) {
								local775 = arg0.aByteArray71[local464++];
							} else if (local547 == 100) {
								local775 = arg0.aByteArray71[local473++];
							} else if (local547 == 64 || local547 == 65 || local547 == 120 || local547 == 121 || local547 == 123) {
								local775 = arg0.aByteArray71[local298++];
							} else {
								local775 = arg0.aByteArray71[local383++];
							}
							@Pc(910) int local910 = local775 + local545[local547];
							local545[local547] = local910;
							local500.method4581(local910 & 0x7F);
						} else if (local567 == 3) {
							if (local590) {
								local500.method4581(local530 + 224);
							}
							@Pc(940) int local940 = local538 + arg0.aByteArray71[local437++];
							local538 = local940 + (arg0.aByteArray71[local325++] << 7);
							local500.method4581(local538 & 0x7F);
							local500.method4581(local538 >> 7 & 0x7F);
						} else if (local567 == 4) {
							if (local590) {
								local500.method4581(local530 + 208);
							}
							local540 += arg0.aByteArray71[local316++];
							local500.method4581(local540 & 0x7F);
						} else if (local567 == 5) {
							if (local590) {
								local500.method4581(local530 + 160);
							}
							local532 += arg0.aByteArray71[local361++];
							local542 += arg0.aByteArray71[local307++];
							local500.method4581(local532 & 0x7F);
							local500.method4581(local542 & 0x7F);
						} else if (local567 == 6) {
							if (local590) {
								local500.method4581(local530 + 192);
							}
							local500.method4581(arg0.aByteArray71[local428++]);
						} else {
							throw new RuntimeException();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()V")
	public final void method4163() {
		if (this.aClass84_23 != null) {
			return;
		}
		this.aClass84_23 = new Class84(16);
		@Pc(12) int[] local12 = new int[16];
		@Pc(15) int[] local15 = new int[16];
		local12[9] = local15[9] = 128;
		@Pc(29) Class72 local29 = new Class72(this.aByteArray67);
		@Pc(32) int local32 = local29.method1668();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			local29.method1663(local34);
			local29.method1659(local34);
			local29.method1670(local34);
		}
		label53:
		do {
			while (true) {
				@Pc(51) int local51 = local29.method1666();
				@Pc(56) int local56 = local29.anIntArray173[local51];
				while (local29.anIntArray173[local51] == local56) {
					local29.method1663(local51);
					@Pc(69) int local69 = local29.method1671(local51);
					if (local69 == 1) {
						local29.method1660();
						local29.method1670(local51);
						continue label53;
					}
					@Pc(85) int local85 = local69 & 0xF0;
					if (local85 == 176) {
						@Pc(92) int local92 = local69 & 0xF;
						@Pc(98) int local98 = local69 >> 8 & 0x7F;
						@Pc(104) int local104 = local69 >> 16 & 0x7F;
						if (local98 == 0) {
							local12[local92] = (local12[local92] & 0xFFE03FFF) + (local104 << 14);
						}
						if (local98 == 32) {
							local12[local92] = (local12[local92] & 0xFFFFC07F) + (local104 << 7);
						}
					}
					if (local85 == 192) {
						@Pc(140) int local140 = local69 & 0xF;
						@Pc(146) int local146 = local69 >> 8 & 0x7F;
						local15[local140] = local12[local140] + local146;
					}
					if (local85 == 144) {
						@Pc(161) int local161 = local69 & 0xF;
						@Pc(167) int local167 = local69 >> 8 & 0x7F;
						@Pc(173) int local173 = local69 >> 16 & 0x7F;
						if (local173 > 0) {
							@Pc(179) int local179 = local15[local161];
							@Pc(187) Class4_Sub14 local187 = (Class4_Sub14) this.aClass84_23.method1844((long) local179);
							if (local187 == null) {
								local187 = new Class4_Sub14(new byte[128]);
								this.aClass84_23.method1840(local187, (long) local179);
							}
							local187.aByteArray18[local167] = 1;
						}
					}
					local29.method1659(local51);
					local29.method1670(local51);
				}
			}
		} while (!local29.method1665());
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "()V")
	public final void method4164() {
		this.aClass84_23 = null;
	}
}

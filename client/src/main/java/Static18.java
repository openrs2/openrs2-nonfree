import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B[IIII)V")
	public static void method1656(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(10) int local10 = arg3 - 7;
		@Pc(16) int local16 = arg2 - 1;
		while (local16 < local10) {
			arg2 = local16 + 1;
			arg0[arg2] = arg1;
			arg2++;
			arg0[arg2] = arg1;
			arg2++;
			arg0[arg2] = arg1;
			arg2++;
			arg0[arg2] = arg1;
			arg2++;
			arg0[arg2] = arg1;
			arg2++;
			arg0[arg2] = arg1;
			arg2++;
			arg0[arg2] = arg1;
			local16 = arg2 + 1;
			arg0[local16] = arg1;
		}
		while (arg3 > local16) {
			local16++;
			arg0[local16] = arg1;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[Lclient!ih;)V")
	public static void method1679(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub12[] arg1) {
		Terrain.aClass4_Sub12ArrayArray2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public static void method1713() {
		Static6.aClass26_50.removeSoft();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method1714() {
		ParticleManager.redraw((long) client.loop);
		if (Static3.anInt5398 != -1) {
			Static27.method4243(Static3.anInt5398);
		}
		for (@Pc(17) int local17 = 0; local17 < Static1.anInt113; local17++) {
			if (Static2.aBooleanArray8[local17]) {
				Static6.aBooleanArray24[local17] = true;
			}
			Static1.aBooleanArray2[local17] = Static2.aBooleanArray8[local17];
			Static2.aBooleanArray8[local17] = false;
		}
		Static3.anInt2522 = client.loop;
		Static6.aClass185_13 = null;
		Static3.anInt2047 = -1;
		if (GlRenderer.enabled) {
			Static7.aBoolean123 = true;
		}
		Static6.anInt4679 = -1;
		if (Static3.anInt5398 != -1) {
			Static1.anInt113 = 0;
			Static16.method1563();
		}
		if (GlRenderer.enabled) {
			GlRaster.resetClip();
		} else {
			SoftwareRaster.resetClip();
		}
		Static5.anInt4156 = 0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[I[I)V")
	private static void method1733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method1739();
		while (true) {
			@Pc(4) int local4;
			@Pc(6) int local6;
			@Pc(8) int local8;
			do {
				if (!method1741()) {
					return;
				}
				local4 = Static3.anInt2181;
				local6 = Static3.anInt2182;
				local8 = Static3.anInt2183;
				if (arg2 == null) {
					break;
				}
				@Pc(14) int local14 = local8 - GlRaster.clipY;
				if (local4 < arg2[local14] + GlRaster.clipX) {
					local4 = arg2[local14] + GlRaster.clipX;
				}
				if (local6 > arg2[local14] + arg3[local14] + GlRaster.clipX) {
					local6 = arg2[local14] + arg3[local14] + GlRaster.clipX;
				}
			} while (local4 >= local6);
			GlRaster.drawHorizontalLineAlpha(local4, local8, local6 - local4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	private static void method1734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = Static3.anIntArray180[local10 - 4];
					@Pc(23) int local23 = Static3.anIntArray180[local10];
					if (local19 > local23) {
						local6 = false;
						Static3.anIntArray180[local10 - 4] = local23;
						Static3.anIntArray180[local10] = local19;
						@Pc(44) int local44 = Static3.anIntArray180[local10 - 2];
						Static3.anIntArray180[local10 - 2] = Static3.anIntArray180[local10 + 2];
						Static3.anIntArray180[local10 + 2] = local44;
						local44 = Static3.anIntArray180[local10 - 1];
						Static3.anIntArray180[local10 - 1] = Static3.anIntArray180[local10 + 3];
						Static3.anIntArray180[local10 + 3] = local44;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([III)V")
	private static void method1735(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static3.anInt2186 + (arg1 << 1);
		if (Static3.anIntArray180 == null || Static3.anIntArray180.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (@Pc(16) int local16 = 0; local16 < Static3.anInt2186; local16++) {
				local14[local16] = Static3.anIntArray180[local16];
			}
			Static3.anIntArray180 = local14;
		}
		@Pc(37) int local37 = arg1 - 2;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local39 + 1];
			if (local48 < local54) {
				Static3.anIntArray180[Static3.anInt2186++] = arg0[local37];
				Static3.anIntArray180[Static3.anInt2186++] = local48;
				Static3.anIntArray180[Static3.anInt2186++] = arg0[local39];
				Static3.anIntArray180[Static3.anInt2186++] = local54;
			} else if (local54 < local48) {
				Static3.anIntArray180[Static3.anInt2186++] = arg0[local39];
				Static3.anIntArray180[Static3.anInt2186++] = local54;
				Static3.anIntArray180[Static3.anInt2186++] = arg0[local37];
				Static3.anIntArray180[Static3.anInt2186++] = local48;
			}
			local37 = local39;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method1736(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && GlRaster.clipHeight - GlRaster.clipY != arg4.length) {
			throw new IllegalStateException();
		}
		method1740();
		method1735(arg0, arg1);
		method1733(arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V")
	private static void method1737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = Static3.anIntArray180[arg0];
		@Pc(17) int local17 = Static3.anIntArray180[arg0 + 1];
		@Pc(23) int local23 = Static3.anIntArray180[arg0 + 2];
		@Pc(29) int local29 = Static3.anIntArray180[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = Static3.anIntArray180[local33 + 1];
			if (local42 < local17) {
				Static3.anIntArray180[local7] = Static3.anIntArray180[local33];
				Static3.anIntArray180[local7 + 1] = local42;
				Static3.anIntArray180[local7 + 2] = Static3.anIntArray180[local33 + 2];
				Static3.anIntArray180[local7 + 3] = Static3.anIntArray180[local33 + 3];
				local7 += 4;
				Static3.anIntArray180[local33] = Static3.anIntArray180[local7];
				Static3.anIntArray180[local33 + 1] = Static3.anIntArray180[local7 + 1];
				Static3.anIntArray180[local33 + 2] = Static3.anIntArray180[local7 + 2];
				Static3.anIntArray180[local33 + 3] = Static3.anIntArray180[local7 + 3];
			}
		}
		Static3.anIntArray180[local7] = local11;
		Static3.anIntArray180[local7 + 1] = local17;
		Static3.anIntArray180[local7 + 2] = local23;
		Static3.anIntArray180[local7 + 3] = local29;
		method1737(arg0, local7);
		method1737(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([III[I[I)V")
	public static void method1738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method1736(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "()V")
	private static void method1739() {
		if (Static3.anInt2186 < 0) {
			Static3.anInt2184 = 0;
			Static3.anInt2185 = 0;
			Static3.anInt2180 = 0;
			Static3.anInt2183 = 2147483646;
			return;
		}
		method1737(0, Static3.anInt2186);
		@Pc(17) int local17 = Static3.anIntArray180[1];
		if (local17 < GlRaster.clipY) {
			local17 = GlRaster.clipY;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < Static3.anInt2186; local26 += 4) {
			@Pc(35) int local35 = Static3.anIntArray180[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = Static3.anIntArray180[local26];
			@Pc(49) int local49 = Static3.anIntArray180[local26 + 2];
			@Pc(55) int local55 = Static3.anIntArray180[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			Static3.anIntArray180[local26] = local71 + (local17 - local35) * local65;
			Static3.anIntArray180[local26 + 2] = local65;
		}
		Static3.anInt2180 = 0;
		Static3.anInt2185 = local26;
		Static3.anInt2184 = local26;
		Static3.anInt2183 = local17 - 1;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "()V")
	private static void method1740() {
		Static3.anInt2186 = 0;
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "()Z")
	private static boolean method1741() {
		@Pc(1) int local1 = Static3.anInt2185;
		@Pc(3) int local3 = Static3.anInt2184;
		@Pc(5) int local5 = Static3.anInt2183;
		while (local3 >= local1) {
			local5++;
			Static3.anInt2183 = local5;
			if (local5 >= GlRaster.clipHeight) {
				return false;
			}
			@Pc(18) int local18 = Static3.anInt2180;
			while (local1 < Static3.anInt2186) {
				@Pc(27) int local27 = Static3.anIntArray180[local1 + 1];
				if (local5 < local27) {
					break;
				}
				@Pc(35) int local35 = Static3.anIntArray180[local1];
				@Pc(41) int local41 = Static3.anIntArray180[local1 + 2];
				@Pc(47) int local47 = Static3.anIntArray180[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				Static3.anIntArray180[local1] = local63;
				Static3.anIntArray180[local1 + 2] = local57;
				local1 += 4;
			}
			for (@Pc(77) int local77 = local18; local77 < local1; local77 += 4) {
				@Pc(86) int local86 = Static3.anIntArray180[local77 + 3];
				if (local5 >= local86) {
					Static3.anIntArray180[local77] = Static3.anIntArray180[local18];
					Static3.anIntArray180[local77 + 1] = Static3.anIntArray180[local18 + 1];
					Static3.anIntArray180[local77 + 2] = Static3.anIntArray180[local18 + 2];
					Static3.anIntArray180[local77 + 3] = Static3.anIntArray180[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == Static3.anInt2186) {
				Static3.anInt2186 = 0;
				return false;
			}
			method1734(local18, local1);
			Static3.anInt2180 = local18;
			Static3.anInt2185 = local1;
			local3 = local18;
		}
		Static3.anInt2181 = Static3.anIntArray180[local3] >> 16;
		Static3.anInt2182 = Static3.anIntArray180[local3 + 4] >> 16;
		@Pc(160) int[] local160 = Static3.anIntArray180;
		local160[local3] += Static3.anIntArray180[local3 + 2];
		local160 = Static3.anIntArray180;
		local160[local3 + 4] += Static3.anIntArray180[local3 + 6];
		@Pc(184) int local184 = local3 + 8;
		Static3.anInt2184 = local184;
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIB)V")
	public static void method4370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static5.anInt3635 = 0;
		for (@Pc(17) int local17 = -1; local17 < NpcList.size + PlayerList.size; local17++) {
			@Pc(31) PathingEntity local31;
			if (local17 == -1) {
				local31 = PlayerList.self;
			} else if (local17 < PlayerList.size) {
				local31 = PlayerList.players[PlayerList.ids[local17]];
			} else {
				local31 = NpcList.npcs[NpcList.ids[local17 - PlayerList.size]];
			}
			if (local31 != null && local31.method3310()) {
				if (local31 instanceof Npc) {
					@Pc(70) NpcType local70 = ((Npc) local31).type;
					if (local70.multiNpcs != null) {
						local70 = local70.getMultiNpc();
					}
					if (local70 == null) {
						continue;
					}
				}
				if (local17 >= PlayerList.size) {
					@Pc(93) NpcType local93 = ((Npc) local31).type;
					if (local93.multiNpcs != null) {
						local93 = local93.getMultiNpc();
					}
					if (local93.anInt5238 >= 0 && local93.anInt5238 < Sprites.headIconsPrayer.length) {
						@Pc(129) int local129;
						if (local93.anInt5259 == -1) {
							local129 = local31.method3306() + 15;
						} else {
							local129 = local93.anInt5259 + 15;
						}
						Static28.method3325(arg2 >> 1, arg3, arg1, arg4 >> 1, local129, local31);
						if (Static7.anInt5584 > -1) {
							Sprites.headIconsPrayer[local93.anInt5238].renderTransparent(arg0 + Static7.anInt5584 - 12, arg5 + Static4.anInt3290 - 30);
						}
					}
					@Pc(170) Class94[] local170 = Static7.aClass94Array1;
					for (@Pc(172) int local172 = 0; local172 < local170.length; local172++) {
						@Pc(180) Class94 local180 = local170[local172];
						if (local180 != null && local180.anInt2561 == 1 && local180.anInt2560 == NpcList.ids[local17 - PlayerList.size] && client.loop % 20 < 10) {
							@Pc(214) int local214;
							if (local93.anInt5259 == -1) {
								local214 = local31.method3306() + 15;
							} else {
								local214 = local93.anInt5259 + 15;
							}
							Static28.method3325(arg2 >> 1, arg3, arg1, arg4 >> 1, local214, local31);
							if (Static7.anInt5584 > -1) {
								Sprites.hintHeadIcons[local180.anInt2559].renderTransparent(arg0 + Static7.anInt5584 - 12, arg5 + Static4.anInt3290 - 28);
							}
						}
					}
				} else {
					@Pc(260) int local260 = 30;
					@Pc(263) Player local263 = (Player) local31;
					if (local263.pkIcon != -1 || local263.prayerIcon != -1) {
						Static28.method3325(arg2 >> 1, arg3, arg1, arg4 >> 1, local31.method3306() + 15, local31);
						if (Static7.anInt5584 > -1) {
							if (local263.pkIcon != -1) {
								Sprites.headIconsPk[local263.pkIcon].renderTransparent(arg0 + Static7.anInt5584 - 12, Static4.anInt3290 + arg5 - 30);
								local260 += 25;
							}
							if (local263.prayerIcon != -1) {
								Sprites.headIconsPrayer[local263.prayerIcon].renderTransparent(Static7.anInt5584 + arg0 - 12, arg5 + Static4.anInt3290 - local260);
								local260 += 25;
							}
						}
					}
					if (local17 >= 0) {
						@Pc(349) Class94[] local349 = Static7.aClass94Array1;
						for (@Pc(351) int local351 = 0; local351 < local349.length; local351++) {
							@Pc(363) Class94 local363 = local349[local351];
							if (local363 != null && local363.anInt2561 == 10 && PlayerList.ids[local17] == local363.anInt2560) {
								Static28.method3325(arg2 >> 1, arg3, arg1, arg4 >> 1, local31.method3306() + 15, local31);
								if (Static7.anInt5584 > -1) {
									Sprites.hintHeadIcons[local363.anInt2559].renderTransparent(Static7.anInt5584 + arg0 - 12, arg5 + Static4.anInt3290 - local260);
								}
							}
						}
					}
				}
				if (local31.aString234 != null && (local17 >= PlayerList.size || Static7.anInt5413 == 0 || Static7.anInt5413 == 3 || Static7.anInt5413 == 1 && Static24.method2562(((Player) local31).name))) {
					Static28.method3325(arg2 >> 1, arg3, arg1, arg4 >> 1, local31.method3306(), local31);
					if (Static7.anInt5584 > -1 && Static5.anInt3635 < Static5.anInt5199) {
						Static5.anIntArray566[Static5.anInt3635] = Fonts.b12Full.method2252(local31.aString234) / 2;
						Static5.anIntArray563[Static5.anInt3635] = Fonts.b12Full.anInt2820;
						Static5.anIntArray565[Static5.anInt3635] = Static7.anInt5584;
						Static5.anIntArray569[Static5.anInt3635] = Static4.anInt3290;
						Static5.anIntArray564[Static5.anInt3635] = local31.anInt3981;
						Static5.anIntArray562[Static5.anInt3635] = local31.anInt3998;
						Static5.anIntArray567[Static5.anInt3635] = local31.anInt4023;
						Static5.aStringArray34[Static5.anInt3635] = local31.aString234;
						Static5.anInt3635++;
					}
				}
				if (client.loop < local31.anInt3993) {
					@Pc(525) Sprite local525 = Sprites.hitBarDefault[0];
					@Pc(529) Sprite local529 = Sprites.hitBarDefault[1];
					@Pc(536) int local536;
					if (local31 instanceof Npc) {
						@Pc(541) Npc local541 = (Npc) local31;
						@Pc(551) Sprite[] local551 = (Sprite[]) Static1.aClass26_5.get((long) local541.type.anInt5240);
						if (local551 == null) {
							local551 = SpriteLoader.loadAlphaSprites(client.js5Archive8, local541.type.anInt5240);
							if (local551 != null) {
								Static1.aClass26_5.put((long) local541.type.anInt5240, local551);
							}
						}
						if (local551 != null && local551.length == 2) {
							local529 = local551[1];
							local525 = local551[0];
						}
						@Pc(593) NpcType local593 = local541.type;
						if (local593.anInt5259 == -1) {
							local536 = local31.method3306();
						} else {
							local536 = local593.anInt5259;
						}
					} else {
						local536 = local31.method3306();
					}
					Static28.method3325(arg2 >> 1, arg3, arg1, arg4 >> 1, local525.height + local536 + 10, local31);
					if (Static7.anInt5584 > -1) {
						@Pc(635) int local635 = Static7.anInt5584 + arg0 - (local525.width >> 1);
						@Pc(641) int local641 = Static4.anInt3290 + arg5 - 3;
						local525.renderTransparent(local635, local641);
						@Pc(653) int local653 = local31.anInt4022 * local525.width / 255;
						@Pc(656) int local656 = local525.height;
						if (GlRenderer.enabled) {
							GlRaster.shrinkClip(local635, local641, local635 + local653, local656 + local641);
						} else {
							SoftwareRaster.shrinkClip(local635, local641, local653 + local635, local641 + local656);
						}
						local529.renderTransparent(local635, local641);
						if (GlRenderer.enabled) {
							GlRaster.setClip(arg0, arg5, arg4 + arg0, arg2 + arg5);
						} else {
							SoftwareRaster.setClip(arg0, arg5, arg4 + arg0, arg2 + arg5);
						}
					}
				}
				for (@Pc(707) int local707 = 0; local707 < 4; local707++) {
					if (local31.anIntArray425[local707] > client.loop) {
						@Pc(742) int local742;
						if (local31 instanceof Npc) {
							@Pc(729) Npc local729 = (Npc) local31;
							@Pc(732) NpcType local732 = local729.type;
							if (local732.anInt5259 == -1) {
								local742 = local31.method3306() / 2;
							} else {
								local742 = local732.anInt5259 / 2;
							}
						} else {
							local742 = local31.method3306() / 2;
						}
						Static28.method3325(arg2 >> 1, arg3, arg1, arg4 >> 1, local742, local31);
						if (Static7.anInt5584 > -1) {
							if (local707 == 1) {
								Static4.anInt3290 -= 20;
							}
							if (local707 == 2) {
								Static4.anInt3290 -= 10;
								Static7.anInt5584 -= 15;
							}
							if (local707 == 3) {
								Static7.anInt5584 += 15;
								Static4.anInt3290 -= 10;
							}
							Sprites.hitMarks[local31.anIntArray424[local707]].renderTransparent(Static7.anInt5584 + arg0 - 12, arg5 + Static4.anInt3290 - 12);
							Fonts.p11Full.method2271(Integer.toString(local31.anIntArray423[local707]), arg0 + Static7.anInt5584 - 1, arg5 + Static4.anInt3290 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(854) int local854 = 0; local854 < Static5.anInt3635; local854++) {
			@Pc(861) int local861 = Static5.anIntArray565[local854];
			@Pc(865) int local865 = Static5.anIntArray569[local854];
			@Pc(869) int local869 = Static5.anIntArray566[local854];
			@Pc(873) int local873 = Static5.anIntArray563[local854];
			@Pc(875) boolean local875 = true;
			while (local875) {
				local875 = false;
				for (@Pc(881) int local881 = 0; local881 < local854; local881++) {
					if (Static5.anIntArray569[local881] - Static5.anIntArray563[local881] < local865 + 2 && local865 - local873 < Static5.anIntArray569[local881] + 2 && local861 - local869 < Static5.anIntArray566[local881] + Static5.anIntArray565[local881] && local861 + local869 > Static5.anIntArray565[local881] - Static5.anIntArray566[local881] && local865 > Static5.anIntArray569[local881] - Static5.anIntArray563[local881]) {
						local875 = true;
						local865 = Static5.anIntArray569[local881] - Static5.anIntArray563[local881];
					}
				}
			}
			Static7.anInt5584 = Static5.anIntArray565[local854];
			Static4.anInt3290 = Static5.anIntArray569[local854] = local865;
			@Pc(968) String local968 = Static5.aStringArray34[local854];
			if (Static2.anInt1599 == 0) {
				@Pc(985) int local985 = 16776960;
				if (Static5.anIntArray564[local854] < 6) {
					local985 = Static4.anIntArray301[Static5.anIntArray564[local854]];
				}
				if (Static5.anIntArray564[local854] == 6) {
					local985 = Static2.anInt1997 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static5.anIntArray564[local854] == 7) {
					local985 = Static2.anInt1997 % 20 < 10 ? 255 : 65535;
				}
				if (Static5.anIntArray564[local854] == 8) {
					local985 = Static2.anInt1997 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static5.anIntArray564[local854] == 9) {
					@Pc(1064) int local1064 = 150 - Static5.anIntArray567[local854];
					if (local1064 < 50) {
						local985 = local1064 * 1280 + 16711680;
					} else if (local1064 < 100) {
						local985 = 16776960 - (local1064 - 50) * 327680;
					} else if (local1064 < 150) {
						local985 = local1064 * 5 + 65280 - 500;
					}
				}
				if (Static5.anIntArray564[local854] == 10) {
					@Pc(1119) int local1119 = 150 - Static5.anIntArray567[local854];
					if (local1119 < 50) {
						local985 = local1119 * 5 + 16711680;
					} else if (local1119 < 100) {
						local985 = 16711935 - (local1119 - 50) * 327680;
					} else if (local1119 < 150) {
						local985 = (local1119 - 100) * 327680 + 500 + 255 - local1119 * 5;
					}
				}
				if (Static5.anIntArray564[local854] == 11) {
					@Pc(1179) int local1179 = 150 - Static5.anIntArray567[local854];
					if (local1179 < 50) {
						local985 = 16777215 - local1179 * 327685;
					} else if (local1179 < 100) {
						local985 = (local1179 - 50) * 327685 + 65280;
					} else if (local1179 < 150) {
						local985 = 32768000 + 16777215 - local1179 * 327680;
					}
				}
				if (Static5.anIntArray562[local854] == 0) {
					Fonts.b12Full.method2271(local968, arg0 + Static7.anInt5584, arg5 + Static4.anInt3290, local985, 0);
				}
				if (Static5.anIntArray562[local854] == 1) {
					Fonts.b12Full.method2262(local968, Static7.anInt5584 + arg0, arg5 + Static4.anInt3290, local985, Static2.anInt1997);
				}
				if (Static5.anIntArray562[local854] == 2) {
					Fonts.b12Full.method2256(local968, Static7.anInt5584 + arg0, Static4.anInt3290 + arg5, local985, Static2.anInt1997);
				}
				if (Static5.anIntArray562[local854] == 3) {
					Fonts.b12Full.method2266(local968, arg0 + Static7.anInt5584, Static4.anInt3290 + arg5, local985, Static2.anInt1997, 150 - Static5.anIntArray567[local854]);
				}
				if (Static5.anIntArray562[local854] == 4) {
					@Pc(1320) int local1320 = (150 - Static5.anIntArray567[local854]) * (Fonts.b12Full.method2252(local968) + 100) / 150;
					if (GlRenderer.enabled) {
						GlRaster.shrinkClip(Static7.anInt5584 + arg0 - 50, arg5, arg0 + Static7.anInt5584 + 50, arg5 + arg2);
					} else {
						SoftwareRaster.shrinkClip(arg0 + Static7.anInt5584 - 50, arg5, Static7.anInt5584 + arg0 + 50, arg2 + arg5);
					}
					Fonts.b12Full.method2259(local968, Static7.anInt5584 + arg0 + 50 - local1320, arg5 + Static4.anInt3290, local985, 0);
					if (GlRenderer.enabled) {
						GlRaster.setClip(arg0, arg5, arg4 + arg0, arg5 + arg2);
					} else {
						SoftwareRaster.setClip(arg0, arg5, arg0 + arg4, arg5 + arg2);
					}
				}
				if (Static5.anIntArray562[local854] == 5) {
					@Pc(1408) int local1408 = 0;
					@Pc(1415) int local1415 = 150 - Static5.anIntArray567[local854];
					if (GlRenderer.enabled) {
						GlRaster.shrinkClip(arg0, Static4.anInt3290 + arg5 - Fonts.b12Full.anInt2820 - 1, arg0 + arg4, Static4.anInt3290 + arg5 + 5);
					} else {
						SoftwareRaster.shrinkClip(arg0, Static4.anInt3290 + arg5 - Fonts.b12Full.anInt2820 - 1, arg4 + arg0, arg5 + Static4.anInt3290 + 5);
					}
					if (local1415 < 25) {
						local1408 = local1415 - 25;
					} else if (local1415 > 125) {
						local1408 = local1415 - 125;
					}
					Fonts.b12Full.method2271(local968, Static7.anInt5584 + arg0, local1408 + Static4.anInt3290 + arg5, local985, 0);
					if (GlRenderer.enabled) {
						GlRaster.setClip(arg0, arg5, arg0 + arg4, arg5 + arg2);
					} else {
						SoftwareRaster.setClip(arg0, arg5, arg0 + arg4, arg5 + arg2);
					}
				}
			} else {
				Fonts.b12Full.method2271(local968, Static7.anInt5584 + arg0, Static4.anInt3290 + arg5, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public static void method4372(@OriginalArg(0) int arg0) {
		Static4.aFloatArray38[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static4.aFloatArray38[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static4.aFloatArray38[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		MaterialManager.resetArgument(3);
		MaterialManager.resetArgument(4);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
	public static void method4374(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static5.anInt4230 = arg0;
		Static3.anInt2553 = arg1;
		Static4.anInt3086 = 0;
		Static2.anInt902 = 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!wf;IIIIII)V")
	public static void method1742(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static5.aBoolean297) {
			Static7.anInt5283 = 32;
		} else {
			Static7.anInt5283 = 0;
		}
		Static5.aBoolean297 = false;
		if (Mouse.pressedButton != 0) {
			if (arg2 <= arg3 && arg2 + 16 > arg3 && arg1 >= arg5 && arg1 < arg5 + 16) {
				arg0.anInt5931 -= 4;
				Static28.method3270(arg0);
			} else if (arg2 <= arg3 && arg2 + 16 > arg3 && arg6 + arg5 - 16 <= arg1 && arg5 + arg6 > arg1) {
				arg0.anInt5931 += 4;
				Static28.method3270(arg0);
			} else if (arg2 - Static7.anInt5283 <= arg3 && arg3 < arg2 + Static7.anInt5283 + 16 && arg1 >= arg5 + 16 && arg1 < arg6 + arg5 - 16) {
				@Pc(129) int local129 = (arg6 - 32) * arg6 / arg4;
				if (local129 < 8) {
					local129 = 8;
				}
				@Pc(147) int local147 = arg1 - arg5 - local129 / 2 - 16;
				@Pc(153) int local153 = arg6 - local129 - 32;
				arg0.anInt5931 = local147 * (arg4 - arg6) / local153;
				Static28.method3270(arg0);
				Static5.aBoolean297 = true;
			}
		}
		if (Static3.anInt2885 == 0) {
			return;
		}
		@Pc(196) int local196 = arg0.anInt5893;
		if (arg2 - local196 <= arg3 && arg5 <= arg1 && arg3 < arg2 + 16 && arg1 <= arg6 + arg5) {
			arg0.anInt5931 += Static3.anInt2885 * 45;
			Static28.method3270(arg0);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIBIII)V")
	public static void method1745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg6) {
			Static8.method100(arg0, arg3, arg5, arg1, arg2, arg4);
		} else if (arg2 - arg0 >= Static2.anInt902 && Static3.anInt2553 >= arg0 + arg2 && arg5 - arg6 >= Static4.anInt3086 && arg6 + arg5 <= Static5.anInt4230) {
			Static10.method388(arg2, arg4, arg3, arg5, arg0, arg1, arg6);
		} else {
			Static32.method4031(arg1, arg3, arg2, arg6, arg5, arg0, arg4);
		}
	}

}

import java.nio.FloatBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!fd;)V")
	public static void method2934(@OriginalArg(1) Buffer arg0) {
		@Pc(7) int local7 = Static3.anInt2963 >> 2 << 10;
		@Pc(11) int local11 = Static3.anInt2964 >> 1;
		@Pc(15) byte[][] local15 = new byte[Static3.anInt2965][Static3.anInt2960];
		while (arg0.bytes.length > arg0.position) {
			@Pc(23) boolean local23 = false;
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			if (arg0.readUnsignedByte() == 1) {
				local23 = true;
				local27 = arg0.readUnsignedByte();
				local25 = arg0.readUnsignedByte();
			}
			@Pc(47) int local47 = arg0.readUnsignedByte();
			@Pc(51) int local51 = arg0.readUnsignedByte();
			@Pc(58) int local58 = local47 * 64 - Static3.anInt2962;
			@Pc(69) int local69 = Static3.anInt2960 + Static3.anInt2961 - local51 * 64 - 1;
			if (local58 >= 0 && local69 - 63 >= 0 && local58 + 63 < Static3.anInt2965 && local69 < Static3.anInt2960) {
				for (@Pc(114) int local114 = 0; local114 < 64; local114++) {
					@Pc(124) byte[] local124 = local15[local58 + local114];
					for (@Pc(126) int local126 = 0; local126 < 64; local126++) {
						if (!local23 || local114 >= local27 * 8 && local114 < local27 * 8 + 8 && local126 >= local25 * 8 && local126 < local25 * 8 + 8) {
							local124[local69 - local126] = arg0.readByte();
						}
					}
				}
			} else if (local23) {
				arg0.position += 64;
			} else {
				arg0.position += 4096;
			}
		}
		@Pc(194) int local194 = Static3.anInt2965;
		@Pc(196) int local196 = Static3.anInt2960;
		@Pc(199) int[] local199 = new int[local196];
		@Pc(202) int[] local202 = new int[local196];
		@Pc(205) int[] local205 = new int[local196];
		@Pc(208) int[] local208 = new int[local196];
		@Pc(211) int[] local211 = new int[local196];
		for (@Pc(213) int local213 = -5; local213 < local194; local213++) {
			if ((local213 & 0x1FF) == 0) {
				Static32.method3917(true);
			}
			for (@Pc(231) int local231 = 0; local231 < local196; local231++) {
				@Pc(242) int local242 = local213 + 5;
				if (local194 > local242) {
					@Pc(253) int local253 = local15[local242][local231] & 0xFF;
					if (local253 > 0) {
						@Pc(265) Class131 local265 = method2971(local253 - 1);
						local199[local231] += local265.anInt4058;
						local202[local231] += local265.anInt4064;
						local205[local231] += local265.anInt4075;
						local208[local231] += local265.anInt4071;
						@Pc(301) int local301 = local211[local231]++;
					}
				}
				@Pc(308) int local308 = local213 - 5;
				if (local308 >= 0) {
					@Pc(322) int local322 = local15[local308][local231] & 0xFF;
					if (local322 > 0) {
						@Pc(334) Class131 local334 = method2971(local322 - 1);
						local199[local231] -= local334.anInt4058;
						local202[local231] -= local334.anInt4064;
						local205[local231] -= local334.anInt4075;
						local208[local231] -= local334.anInt4071;
						@Pc(370) int local370 = local211[local231]--;
					}
				}
			}
			if (local213 >= 0) {
				@Pc(383) int local383 = 0;
				@Pc(389) int[][] local389 = Static3.anIntArrayArrayArray7[local213 >> 6];
				@Pc(391) int local391 = 0;
				@Pc(393) int local393 = 0;
				@Pc(395) int local395 = 0;
				@Pc(397) int local397 = 0;
				for (@Pc(399) int local399 = -5; local399 < local196; local399++) {
					@Pc(410) int local410 = local399 + 5;
					if (local410 < local196) {
						local383 += local199[local410];
						local395 += local208[local410];
						local391 += local202[local410];
						local393 += local211[local410];
						local397 += local205[local410];
					}
					@Pc(448) int local448 = local399 - 5;
					if (local448 >= 0) {
						local383 -= local199[local448];
						local395 -= local208[local448];
						local393 -= local211[local448];
						local391 -= local202[local448];
						local397 -= local205[local448];
					}
					if (local399 >= 0 && local393 > 0) {
						@Pc(500) int[] local500 = local389[local399 >> 6];
						@Pc(521) int local521 = local395 == 0 ? 0 : Static15.method1339(local383 * 256 / local395, local391 / local393, local397 / local393);
						if (local15[local213][local399] != 0) {
							if (local500 == null) {
								local500 = local389[local399 >> 6] = new int[4096];
							}
							@Pc(562) int local562 = local11 + (local521 & 0x7F);
							if (local562 < 0) {
								local562 = 0;
							} else if (local562 > 127) {
								local562 = 127;
							}
							@Pc(591) int local591 = (local7 + local521 & 0xFC00) + (local521 & 0x380) + local562;
							local500[((local399 & 0x3F) << 6) + (local213 & 0x3F)] = Static4.anIntArray295[Static35.method4367(local591, 96)];
						} else if (local500 != null) {
							local500[(local213 & 0x3F) + ((local399 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Lclient!oh;")
	public static Class127 method2935(@OriginalArg(1) int arg0) {
		@Pc(6) Class127 local6 = (Class127) Static3.aClass26_24.get((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static3.aClass58_55.fetchFile(4, arg0);
		@Pc(31) Class127 local31 = new Class127();
		if (local27 != null) {
			local31.method3221(arg0, new Buffer(local27));
		}
		Static3.aClass26_24.put((long) arg0, local31);
		return local31;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!wf;)Lclient!wf;")
	public static Class185 method2942(@OriginalArg(1) Class185 arg0) {
		if (arg0.anInt5937 != -1) {
			return Static19.method1813(arg0.anInt5937);
		}
		@Pc(20) int local20 = arg0.anInt5914 >>> 16;
		@Pc(33) HashTableIterator local33 = new HashTableIterator(Static4.aClass84_13);
		for (@Pc(38) Class4_Sub27 local38 = (Class4_Sub27) local33.head(); local38 != null; local38 = (Class4_Sub27) local33.next()) {
			if (local20 == local38.anInt4620) {
				return Static19.method1813((int) local38.key);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!fh;)V")
	public static void method2950(@OriginalArg(0) Js5 arg0) {
		Static5.anInt3501 = 0;
		Static5.anInt3502 = 0;
		Static5.aClass172_3 = new Class172();
		Static5.aClass20_Sub2_Sub1Array1 = new Class20_Sub2_Sub1[1024];
		Static23.method2508(arg0);
		Static34.method4264(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public static void method2951() {
		Static5.aShortArrayArray3 = null;
		Static5.aShortArrayArray4 = null;
		Static5.anIntArray387 = null;
		Static5.anIntArray388 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public static void method2961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) GL local1 = Static3.aGL1;
		if (Static5.aBoolean249) {
			local1.glEnable(GL.GL_POINT_SPRITE);
			local1.glTexEnvi(GL.GL_POINT_SPRITE, GL.GL_COORD_REPLACE, GL.GL_LINES);
		}
		local1.glDepthMask(false);
		Static24.method2652(0, 0);
		local1.glColorMaterial(GL.GL_FRONT, GL.GL_DIFFUSE);
		local1.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, Static4.aFloatArray36, 0);
		if (Preferences.highDetailLighting) {
			local1.glDisableClientState(GL.GL_NORMAL_ARRAY);
		}
		local1.glDisableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		local1.glPushMatrix();
		local1.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
		local1.glNormal3f(0.0F, -1.0F, 0.0F);
		if (!Static3.aBoolean139) {
			local1.glDisable(GL.GL_FOG);
		}
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "()V")
	public static void method2962() {
		@Pc(1) GL local1 = Static3.aGL1;
		if (Preferences.highDetailLighting) {
			local1.glEnableClientState(GL.GL_NORMAL_ARRAY);
		}
		local1.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		local1.glDepthMask(true);
		local1.glColorMaterial(GL.GL_FRONT, GL.GL_AMBIENT_AND_DIFFUSE);
		local1.glPopMatrix();
		if (!Static3.aBoolean139) {
			local1.glEnable(GL.GL_FOG);
		}
		if (Static5.aBoolean249) {
			local1.glTexEnvi(GL.GL_POINT_SPRITE, GL.GL_COORD_REPLACE, GL.GL_POINTS);
			local1.glDisable(GL.GL_POINT_SPRITE);
		}
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "()V")
	public static void method2963() {
		Static5.aClass10_1 = new SecondaryHashTable(8);
		Static5.anInt3524 = 0;
		for (@Pc(11) Class20_Sub3 local11 = (Class20_Sub3) Static5.aClass172_3.method4320(); local11 != null; local11 = (Class20_Sub3) Static5.aClass172_3.method4315()) {
			local11.method2958();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(J)V")
	public static void method2964(@OriginalArg(0) long arg0) {
		Static5.anInt3500 = Static5.anInt3504;
		Static5.anInt3505 = 0;
		Static5.anInt3504 = 0;
		@Pc(8) long local8 = MonotonicClock.currentTimeMillis();
		for (@Pc(13) Class20_Sub3 local13 = (Class20_Sub3) Static5.aClass172_3.method4320(); local13 != null; local13 = (Class20_Sub3) Static5.aClass172_3.method4315()) {
			if (local13.method2968(arg0)) {
				Static5.anInt3505++;
			}
		}
		if (Static5.aBoolean251 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static5.aClass172_3.method4316() + ", running: " + Static5.anInt3505 + ". Particles: " + Static5.anInt3504 + ". Time taken: " + (MonotonicClock.currentTimeMillis() - local8) + "ms");
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
	public static void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static5.aFloat86 = (float) arg1 / 334.0F;
	}

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "()V")
	public static void method2969() {
		@Pc(1) GL local1 = Static3.aGL1;
		if (local1.isExtensionAvailable("GL_ARB_point_parameters")) {
			@Pc(20) float[] local20 = new float[] { 1.0F, 0.0F, 5.0E-7F };
			local1.glPointParameterfvARB(GL.GL_POINT_DISTANCE_ATTENUATION, local20, 0);
			@Pc(28) FloatBuffer local28 = FloatBuffer.allocate(1);
			local1.glGetFloatv(GL.GL_POINT_SIZE_MAX, local28);
			@Pc(36) float local36 = local28.get(0);
			if (local36 > 64.0F) {
				local36 = 64.0F;
			}
			local1.glPointParameterfARB(GL.GL_POINT_SIZE_MIN, 1.0F);
			local1.glPointParameterfARB(GL.GL_POINT_SIZE_MAX, local36);
		}
		if (local1.isExtensionAvailable("GL_ARB_point_sprite")) {
			Static5.aBoolean249 = true;
		}
		Static5.aShortArrayArray3 = new short[1600][32];
		Static5.aShortArrayArray4 = new short[32][768];
		Static5.anIntArray387 = new int[1600];
		Static5.anIntArray388 = new int[32];
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)Lclient!pa;")
	public static Class131 method2971(@OriginalArg(0) int arg0) {
		@Pc(10) Class131 local10 = (Class131) Static1.aClass26_6.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static1.aClass58_2.fetchFile(1, arg0);
		@Pc(24) Class131 local24 = new Class131();
		if (local20 != null) {
			local24.method3326(new Buffer(local20), arg0);
		}
		Static1.aClass26_6.put((long) arg0, local24);
		return local24;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V")
	public static void method2972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class4_Sub18 local12 = (Class4_Sub18) Static5.aClass84_17.get((long) arg0);
		if (local12 == null) {
			local12 = new Class4_Sub18();
			Static5.aClass84_17.put((long) arg0, local12);
		}
		if (local12.anIntArray385.length <= arg1) {
			@Pc(41) int[] local41 = new int[arg1 + 1];
			@Pc(46) int[] local46 = new int[arg1 + 1];
			for (@Pc(48) int local48 = 0; local48 < local12.anIntArray385.length; local48++) {
				local41[local48] = local12.anIntArray385[local48];
				local46[local48] = local12.anIntArray386[local48];
			}
			for (@Pc(74) int local74 = local12.anIntArray385.length; local74 < arg1; local74++) {
				local41[local74] = -1;
				local46[local74] = 0;
			}
			local12.anIntArray386 = local46;
			local12.anIntArray385 = local41;
		}
		local12.anIntArray385[arg1] = arg2;
		local12.anIntArray386[arg1] = arg3;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method2973() {
		if (Static6.aBoolean330) {
			return;
		}
		Static6.aBoolean330 = true;
		Static5.aBoolean248 = true;
		if (Preferences.aBoolean293) {
			Static5.aFloat147 = (int) Static5.aFloat147 - 17 & 0xFFFFFFF0;
		} else {
			Static1.aFloat20 += (-Static1.aFloat20 - 12.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[Lclient!ch;[BIIIIIIZI)[I")
	private static int[] method4355(@OriginalArg(0) int arg0, @OriginalArg(1) Class30[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = (arg9 & 0x7) * 8;
		@Pc(13) int local13 = (arg4 & 0x7) * 8;
		if (!arg8) {
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				for (@Pc(23) int local23 = 0; local23 < 8; local23++) {
					@Pc(38) int local38 = Static35.method4338(local23 & 0x7, arg6, local18 & 0x7) + arg3;
					@Pc(50) int local50 = arg5 + Static24.method2614(arg6, local18 & 0x7, local23 & 0x7);
					if (local38 > 0 && local38 < 103 && local50 > 0 && local50 < 103) {
						arg1[arg7].anIntArrayArray6[local38][local50] &= -2097153;
					}
				}
			}
		}
		@Pc(101) Buffer local101 = new Buffer(arg2);
		@Pc(109) byte local109;
		if (arg8) {
			local109 = 1;
		} else {
			local109 = 4;
		}
		@Pc(119) int local119 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(121) byte local121 = 0;
		@Pc(127) int local127 = (arg9 & 0xFFFFFFF8) << 3;
		@Pc(129) byte local129 = 0;
		if (arg6 == 1) {
			local129 = 1;
		} else if (arg6 == 2) {
			local121 = 1;
			local129 = 1;
		} else if (arg6 == 3) {
			local121 = 1;
		}
		for (@Pc(157) int local157 = 0; local157 < local109; local157++) {
			for (@Pc(166) int local166 = 0; local166 < 64; local166++) {
				for (@Pc(171) int local171 = 0; local171 < 64; local171++) {
					if (local157 != arg0 || local166 < local13 || local13 + 8 < local166 || local171 < local7 || local171 > local7 + 8) {
						Static9.method195(local101, false, arg8, 0, 0, 0, -1, 0, 0, 0, -1);
					} else if (local13 + 8 == local166 || local7 + 8 == local171) {
						@Pc(409) int local409;
						@Pc(416) int local416;
						if (arg6 == 0) {
							local409 = local166 + arg3 - local13;
							local416 = arg5 + local171 - local7;
						} else if (arg6 == 1) {
							local416 = local13 + arg5 + 8 - local166;
							local409 = arg3 + local171 - local7;
						} else if (arg6 == 2) {
							local409 = arg3 + local13 + 8 - local166;
							local416 = arg5 + local7 + 8 - local171;
						} else {
							local409 = local7 + arg3 + 8 - local171;
							local416 = arg5 + local166 - local13;
						}
						Static9.method195(local101, true, arg8, arg7, local119 + local166, local127 + local171, local416, 0, 0, 0, local409);
					} else {
						@Pc(229) int local229 = Static35.method4338(local171 & 0x7, arg6, local166 & 0x7) + arg3;
						@Pc(241) int local241 = Static24.method2614(arg6, local166 & 0x7, local171 & 0x7) + arg5;
						Static9.method195(local101, false, arg8, arg7, local119 + local166, local171 + local127, local241, arg6, local129, local121, local229);
						if (local166 == 63 || local171 == 63) {
							@Pc(272) int local272 = local166 == 63 ? 64 : local166;
							@Pc(281) int local281 = local171 == 63 ? 64 : local171;
							@Pc(300) int local300;
							@Pc(293) int local293;
							if (arg6 == 0) {
								local293 = arg5 + local281 - local7;
								local300 = arg3 + local272 - local13;
							} else if (arg6 == 1) {
								local300 = local281 + arg3 - local7;
								local293 = arg5 + local13 + 8 - local272;
							} else if (arg6 == 2) {
								local300 = arg3 + local13 + 8 - local272;
								local293 = arg5 + local7 + 8 - local281;
							} else {
								local293 = arg5 + local272 - local13;
								local300 = arg3 + local7 + 8 - local281;
							}
							if (local300 >= 0 && local300 < 104 && local293 >= 0 && local293 < 104) {
								Static6.anIntArrayArrayArray13[arg7][local300][local293] = Static6.anIntArrayArrayArray13[arg7][local229 + local121][local241 + local129];
							}
						}
					}
				}
			}
		}
		@Pc(526) boolean local526 = false;
		while (local101.bytes.length > local101.position) {
			@Pc(538) int local538 = local101.readUnsignedByte();
			if (local538 == 128) {
				local526 = true;
				Static6.anIntArray465[0] = local101.readUnsignedShort();
				Static6.anIntArray465[1] = local101.readShort();
				Static6.anIntArray465[2] = local101.readShort();
				Static6.anIntArray465[3] = local101.readShort();
				Static6.anIntArray465[4] = local101.readUnsignedShort();
			} else {
				if (local538 != 129) {
					local101.position--;
					break;
				}
				for (@Pc(580) int local580 = 0; local580 < 4; local580++) {
					@Pc(587) byte local587 = local101.readByte();
					if (local587 == 0) {
						if (local580 <= arg0) {
							@Pc(600) int local600 = arg3 + 7;
							@Pc(602) int local602 = arg3;
							if (arg3 < 0) {
								local602 = 0;
							} else if (arg3 >= 104) {
								local602 = 104;
							}
							@Pc(618) int local618 = arg5;
							if (arg5 < 0) {
								local618 = 0;
							} else if (arg5 >= 104) {
								local618 = 104;
							}
							@Pc(638) int local638 = arg5 + 7;
							if (local638 < 0) {
								local638 = 0;
							} else if (local638 >= 104) {
								local638 = 104;
							}
							if (local600 < 0) {
								local600 = 0;
							} else if (local600 >= 104) {
								local600 = 104;
							}
							while (local600 > local602) {
								while (local618 < local638) {
									Static4.aByteArrayArrayArray16[arg7][local602][local618] = 0;
									local618++;
								}
								local602++;
							}
						}
					} else if (local587 == 1) {
						for (@Pc(699) int local699 = 0; local699 < 64; local699 += 4) {
							for (@Pc(706) int local706 = 0; local706 < 64; local706 += 4) {
								@Pc(713) byte local713 = local101.readByte();
								if (local580 <= arg0) {
									for (@Pc(718) int local718 = local699; local718 < local699 + 4; local718++) {
										for (@Pc(729) int local729 = local706; local729 < local706 + 4; local729++) {
											if (local718 >= local13 && local13 + 8 > local718 && local7 <= local729 && local7 < local7 + 8) {
												@Pc(766) int local766 = arg3 + Static35.method4338(local729 & 0x7, arg6, local718 & 0x7);
												@Pc(778) int local778 = Static24.method2614(arg6, local718 & 0x7, local729 & 0x7) + arg5;
												if (local766 >= 0 && local766 < 104 && local778 >= 0 && local778 < 104) {
													Static4.aByteArrayArrayArray16[arg7][local766][local778] = local713;
												}
											}
										}
									}
								}
							}
						}
					} else if (local587 == 2) {
					}
				}
			}
		}
		if (Static3.aBoolean138 && !arg8) {
			@Pc(840) Class187 local840 = null;
			while (true) {
				while (local101.bytes.length > local101.position) {
					@Pc(854) int local854 = local101.readUnsignedByte();
					if (local854 == 0) {
						local840 = new Class187(local101);
					} else if (local854 == 1) {
						@Pc(893) int local893 = local101.readUnsignedByte();
						if (local893 > 0) {
							for (@Pc(897) int local897 = 0; local897 < local893; local897++) {
								@Pc(905) Class50 local905 = new Class50(local101);
								if (local905.anInt1323 == 31) {
									@Pc(916) Class178 local916 = Static11.method494(local101.readUnsignedShort());
									local905.method1073(local916.anInt5484, local916.anInt5480, local916.anInt5482, local916.anInt5481);
								}
								@Pc(932) int local932 = local905.anInt1338 >> 7;
								@Pc(937) int local937 = local905.anInt1320 >> 7;
								if (local905.anInt1326 == arg0 && local932 >= local13 && local13 + 8 > local932 && local7 <= local937 && local7 + 8 > local937) {
									@Pc(987) int local987 = (arg3 << 7) + Static31.method3802(local905.anInt1338 & 0x3FF, arg6, local905.anInt1320 & 0x3FF);
									@Pc(1003) int local1003 = (arg5 << 7) + Static22.method2188(local905.anInt1320 & 0x3FF, local905.anInt1338 & 0x3FF, arg6);
									local905.anInt1338 = local987;
									local905.anInt1320 = local1003;
									@Pc(1014) int local1014 = local905.anInt1320 >> 7;
									@Pc(1019) int local1019 = local905.anInt1338 >> 7;
									if (local1019 >= 0 && local1014 >= 0 && local1019 < 104 && local1014 < 104) {
										local905.aBoolean80 = (Static4.aByteArrayArrayArray17[1][local1019][local1014] & 0x2) != 0;
										local905.anInt1322 = Static6.anIntArrayArrayArray13[local905.anInt1326][local1019][local1014] - local905.anInt1322;
										Static27.method3113(local905);
									}
								}
							}
						}
					} else if (local854 == 2) {
						if (local840 == null) {
							local840 = new Class187();
						}
						local840.method4786(local101);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local840 == null) {
					local840 = new Class187();
				}
				Static5.aClass187ArrayArray1[arg3 >> 3][arg5 >> 3] = local840;
				break;
			}
		}
		@Pc(1093) int local1093 = arg5 + 7;
		@Pc(1097) int local1097 = arg3 + 7;
		for (@Pc(1099) int local1099 = arg3; local1099 < local1097; local1099++) {
			for (@Pc(1104) int local1104 = arg5; local1104 < local1093; local1104++) {
				Static4.aByteArrayArrayArray16[arg7][local1099][local1104] = 0;
			}
		}
		return local526 ? Static6.anIntArray465 : null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)I")
	public static int method4356(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(8) int local8 = arg2;
			arg2 = arg1;
			arg1 = local8;
		}
		arg3 &= 3;
		if (arg3 == 0) {
			return arg4;
		} else if (arg3 == 1) {
			return 1 + 7 - arg2 - arg0;
		} else if (arg3 == 2) {
			return 1 + 7 - arg4 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V")
	public static void method4357(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		Static25.method2927(arg0, -1, null, arg1, arg2);
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)[Lclient!fe;")
	public static Class56_Sub1[] method4358() {
		@Pc(4) Class56_Sub1[] local4 = new Class56_Sub1[Static4.anInt2748];
		for (@Pc(12) int local12 = 0; local12 < Static4.anInt2748; local12++) {
			local4[local12] = new Class56_Sub1(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[local12], Static5.anIntArray391[local12], Static3.anIntArray185[local12], Static7.anIntArray643[local12], Static6.aByteArrayArray36[local12], Static2.anIntArray85);
		}
		Static37.method4670();
		return local4;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZZ)V")
	public static void method4359(@OriginalArg(0) boolean arg0) {
		@Pc(10) int[] local10 = null;
		@Pc(16) byte local16;
		@Pc(18) byte[][] local18;
		if (Static3.aBoolean138 && arg0) {
			local16 = 1;
			local18 = Static7.aByteArrayArray49;
		} else {
			local16 = 4;
			local18 = Static1.aByteArrayArray4;
		}
		for (@Pc(26) int local26 = 0; local26 < local16; local26++) {
			Static9.method763();
			for (@Pc(37) int local37 = 0; local37 < 13; local37++) {
				for (@Pc(42) int local42 = 0; local42 < 13; local42++) {
					@Pc(49) boolean local49 = false;
					@Pc(57) int local57 = Static7.anIntArrayArrayArray15[local26][local37][local42];
					if (local57 != -1) {
						@Pc(69) int local69 = local57 >> 24 & 0x3;
						if (!arg0 || local69 == 0) {
							@Pc(83) int local83 = local57 >> 1 & 0x3;
							@Pc(89) int local89 = local57 >> 14 & 0x3FF;
							@Pc(95) int local95 = local57 >> 3 & 0x7FF;
							@Pc(105) int local105 = local95 / 8 + (local89 / 8 << 8);
							for (@Pc(107) int local107 = 0; local107 < Static7.anIntArray597.length; local107++) {
								if (Static7.anIntArray597[local107] == local105 && local18[local107] != null) {
									local49 = true;
									@Pc(151) int[] local151 = method4355(local69, Static7.aClass30Array1, local18[local107], local37 * 8, local89, local42 * 8, local83, local26, arg0, local95);
									if (local10 == null && local151 != null) {
										local10 = local151;
									}
									break;
								}
							}
						}
					}
					if (!local49) {
						Static29.method3536(local37 * 8, local26, 8, local42 * 8, 8);
					}
				}
			}
		}
		if (local10 == null) {
			Static6.anInt4863 = -1;
			return;
		}
		Static5.anInt4303 = local10[3];
		Static6.anInt4863 = local10[0];
		Static1.anInt466 = local10[2];
		Static5.anInt3774 = local10[4];
		Static4.anInt5826 = local10[1];
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!vc;III)V")
	public static void method2981(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < Static7.anInt5632) {
			@Pc(12) Class4_Sub19 local12 = Static1.aClass4_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass42_1 != null && local12.aClass42_1.aClass53_2.method3808()) {
				arg0.method3807(local12.aClass42_1.aClass53_2, 128, 0, 0, true);
			}
		}
		if (arg3 < Static7.anInt5632) {
			@Pc(44) Class4_Sub19 local44 = Static1.aClass4_Sub19ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local44 != null && local44.aClass42_1 != null && local44.aClass42_1.aClass53_2.method3808()) {
				arg0.method3807(local44.aClass42_1.aClass53_2, 0, 0, 128, true);
			}
		}
		if (arg2 < Static7.anInt5632 && arg3 < Static7.anInt5590) {
			@Pc(81) Class4_Sub19 local81 = Static1.aClass4_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local81 != null && local81.aClass42_1 != null && local81.aClass42_1.aClass53_2.method3808()) {
				arg0.method3807(local81.aClass42_1.aClass53_2, 128, 0, 128, true);
			}
		}
		if (arg2 < Static7.anInt5632 && arg3 > 0) {
			@Pc(117) Class4_Sub19 local117 = Static1.aClass4_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local117 != null && local117.aClass42_1 != null && local117.aClass42_1.aClass53_2.method3808()) {
				arg0.method3807(local117.aClass42_1.aClass53_2, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method2982(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static25.method2927(arg0, -1, arg1, 9, arg2);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
	public static int method2983(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local26 >> 12) + 40960;
		return local13 * local34 >> 12;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)Lclient!g;")
	public static Class4_Sub3_Sub9 method2984() {
		@Pc(10) Class4_Sub3_Sub9 local10 = (Class4_Sub3_Sub9) Static3.aClass175_11.head();
		if (local10 != null) {
			local10.unlink();
			local10.unlinkSecondary();
			return local10;
		}
		@Pc(35) Class4_Sub3_Sub9 local35;
		do {
			local35 = (Class4_Sub3_Sub9) Static1.aClass175_4.head();
			if (local35 == null) {
				return null;
			}
			if (local35.method1522() > MonotonicClock.currentTimeMillis()) {
				return null;
			}
			local35.unlink();
			local35.unlinkSecondary();
		} while ((local35.secondaryKey & Long.MIN_VALUE) == 0L);
		return local35;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public static void method4812() {
		if (!Static3.aBoolean177) {
			return;
		}
		@Pc(15) Class185 local15 = Static23.method2425(Static1.anInt1053, Static2.anInt1367);
		if (local15 != null && local15.anObjectArray17 != null) {
			@Pc(26) Class4_Sub13 local26 = new Class4_Sub13();
			local26.anObjectArray2 = local15.anObjectArray17;
			local26.aClass185_7 = local15;
			Static21.method2019(local26);
		}
		Static3.aBoolean177 = false;
		Static7.anInt6050 = -1;
		Static28.method3270(local15);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V")
	public static void method4814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = 0;
		@Pc(21) int local21 = arg1 * arg1;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local21 << 1;
		@Pc(37) int local37 = arg1 << 1;
		@Pc(46) int local46 = local21 - (local37 - 1) * local29;
		@Pc(56) int local56 = (1 - local37) * local25 + local33;
		@Pc(60) int local60 = local25 << 2;
		@Pc(64) int local64 = local21 << 2;
		@Pc(72) int local72 = local33 * 3;
		@Pc(78) int local78 = local64;
		@Pc(86) int local86 = ((arg1 << 1) - 3) * local29;
		if (arg0 >= Static4.anInt3086 && Static5.anInt4230 >= arg0) {
			@Pc(109) int local109 = Static8.method9(Static2.anInt902, arg4 + arg3, Static3.anInt2553);
			@Pc(117) int local117 = Static8.method9(Static2.anInt902, arg4 - arg3, Static3.anInt2553);
			Static18.method1656(Static5.anIntArrayArray36[arg0], arg2, local117, local109);
		}
		@Pc(131) int local131 = local60 * (arg1 - 1);
		while (local7 > 0) {
			if (local56 < 0) {
				while (local56 < 0) {
					local56 += local72;
					local46 += local78;
					local78 += local64;
					local72 += local64;
					local9++;
				}
			}
			local7--;
			if (local46 < 0) {
				local46 += local78;
				local78 += local64;
				local56 += local72;
				local9++;
				local72 += local64;
			}
			local56 += -local131;
			@Pc(198) int local198 = arg0 - local7;
			local46 += -local86;
			local131 -= local60;
			@Pc(211) int local211 = local7 + arg0;
			local86 -= local60;
			if (local211 >= Static4.anInt3086 && Static5.anInt4230 >= local198) {
				@Pc(229) int local229 = Static8.method9(Static2.anInt902, local9 + arg4, Static3.anInt2553);
				@Pc(237) int local237 = Static8.method9(Static2.anInt902, arg4 - local9, Static3.anInt2553);
				if (Static4.anInt3086 <= local198) {
					Static18.method1656(Static5.anIntArrayArray36[local198], arg2, local237, local229);
				}
				if (local211 <= Static5.anInt4230) {
					Static18.method1656(Static5.anIntArrayArray36[local211], arg2, local237, local229);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method4816(@OriginalArg(1) int arg0) {
		@Pc(10) String local10 = Integer.toString(arg0);
		for (@Pc(19) int local19 = local10.length() - 3; local19 > 0; local19 -= 3) {
			local10 = local10.substring(0, local19) + "," + local10.substring(local19);
		}
		if (local10.length() <= 9) {
			return local10.length() <= 6 ? " <col=ffff00>" + local10 + "</col>" : " <col=ffffff>" + local10.substring(0, local10.length() - 4) + LocalisedText.THOUSAND + " (" + local10 + ")</col>";
		} else {
			return " <col=00ff80>" + local10.substring(0, local10.length() - 8) + LocalisedText.MILLION + " (" + local10 + ")</col>";
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)I")
	public static int method2987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >>> 31;
		return (local13 + arg1) / arg0 - local13;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Z")
	public static boolean method2988() {
		if (client.javaScript) {
			try {
				BrowserControl.call(GameShell.signLink.applet, "showVideoAd");
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method2989(@OriginalArg(1) int arg0) {
		Static2.anInt2245 = arg0;
		Static32.method3981(3);
		Static32.method3981(4);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)Lclient!ij;")
	public static Class4_Sub3_Sub11 method2991(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub11 local10 = (Class4_Sub3_Sub11) Static1.aClass40_5.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = Static1.aClass58_19.fetchFile(1, arg0);
		} else {
			local25 = Static4.aClass58_72.fetchFile(1, arg0 & 0x7FFF);
		}
		@Pc(39) Class4_Sub3_Sub11 local39 = new Class4_Sub3_Sub11();
		if (local25 != null) {
			local39.method1908(new Buffer(local25));
		}
		if (arg0 >= 32768) {
			local39.method1910();
		}
		Static1.aClass40_5.put((long) arg0, local39);
		return local39;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method2992(@OriginalArg(1) int arg0) {
		return Static6.aStringArray27[arg0].length() <= 0 ? Static6.aStringArray30[arg0] : Static6.aStringArray30[arg0] + LocalisedText.MINISEPARATOR + Static6.aStringArray27[arg0];
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	public static void method2993() {
		Static4.aClass26_28.removeSoft();
		Static3.aClass26_23.removeSoft();
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public static void method3056() {
		Static5.aClass4_Sub10_Sub1_2.startBitAccess();
		@Pc(13) int local13 = Static5.aClass4_Sub10_Sub1_2.readBits(8);
		if (local13 < Static6.anInt4451) {
			for (@Pc(23) int local23 = local13; local23 < Static6.anInt4451; local23++) {
				Static2.anIntArray99[Static5.anInt4195++] = Static7.anIntArray595[local23];
			}
		}
		if (local13 > Static6.anInt4451) {
			throw new RuntimeException("gnpov1");
		}
		Static6.anInt4451 = 0;
		for (@Pc(62) int local62 = 0; local62 < local13; local62++) {
			@Pc(73) int local73 = Static7.anIntArray595[local62];
			@Pc(77) Npc local77 = Static3.aClass53_Sub1_Sub2Array1[local73];
			@Pc(82) int local82 = Static5.aClass4_Sub10_Sub1_2.readBits(1);
			if (local82 == 0) {
				Static7.anIntArray595[Static6.anInt4451++] = local73;
				local77.anInt3990 = Static2.anInt954;
			} else {
				@Pc(106) int local106 = Static5.aClass4_Sub10_Sub1_2.readBits(2);
				if (local106 == 0) {
					Static7.anIntArray595[Static6.anInt4451++] = local73;
					local77.anInt3990 = Static2.anInt954;
					Static7.anIntArray587[Static6.anInt4760++] = local73;
				} else if (local106 == 1) {
					Static7.anIntArray595[Static6.anInt4451++] = local73;
					local77.anInt3990 = Static2.anInt954;
					@Pc(151) int local151 = Static5.aClass4_Sub10_Sub1_2.readBits(3);
					local77.method3308(local151, 1);
					@Pc(161) int local161 = Static5.aClass4_Sub10_Sub1_2.readBits(1);
					if (local161 == 1) {
						Static7.anIntArray587[Static6.anInt4760++] = local73;
					}
				} else if (local106 == 2) {
					Static7.anIntArray595[Static6.anInt4451++] = local73;
					local77.anInt3990 = Static2.anInt954;
					if (Static5.aClass4_Sub10_Sub1_2.readBits(1) == 1) {
						@Pc(215) int local215 = Static5.aClass4_Sub10_Sub1_2.readBits(3);
						local77.method3308(local215, 2);
						@Pc(227) int local227 = Static5.aClass4_Sub10_Sub1_2.readBits(3);
						local77.method3308(local227, 2);
					} else {
						@Pc(201) int local201 = Static5.aClass4_Sub10_Sub1_2.readBits(3);
						local77.method3308(local201, 0);
					}
					@Pc(237) int local237 = Static5.aClass4_Sub10_Sub1_2.readBits(1);
					if (local237 == 1) {
						Static7.anIntArray587[Static6.anInt4760++] = local73;
					}
				} else if (local106 == 3) {
					Static2.anIntArray99[Static5.anInt4195++] = local73;
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)Lclient!co;")
	public static Class33 method3062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3554; local13++) {
			@Pc(22) Class33 local22 = local7.aClass33Array3[local13];
			if ((local22.aLong38 >> 29 & 0x3L) == 2L && local22.anInt824 == arg1 && local22.anInt826 == arg2) {
				return local22;
			}
		}
		return null;
	}
}

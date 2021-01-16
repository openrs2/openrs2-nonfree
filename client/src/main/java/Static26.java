import java.nio.FloatBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

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
						@Pc(265) FluType local265 = FluTypeList.get(local253 - 1);
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
						@Pc(334) FluType local334 = FluTypeList.get(local322 - 1);
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
							local500[((local399 & 0x3F) << 6) + (local213 & 0x3F)] = ColorUtils.HSL_TO_RGB[Static35.method4367(local591, 96)];
						} else if (local500 != null) {
							local500[(local213 & 0x3F) + ((local399 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!wf;)Lclient!wf;")
	public static Component method2942(@OriginalArg(1) Component arg0) {
		if (arg0.anInt5937 != -1) {
			return InterfaceList.getComponent(arg0.anInt5937);
		}
		@Pc(20) int local20 = arg0.id >>> 16;
		@Pc(33) HashTableIterator local33 = new HashTableIterator(InterfaceList.subInterfaces);
		for (@Pc(38) SubInterface local38 = (SubInterface) local33.head(); local38 != null; local38 = (SubInterface) local33.next()) {
			if (local20 == local38.id) {
				return InterfaceList.getComponent((int) local38.key);
			}
		}
		return null;
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
		@Pc(1) GL gl = GlRenderer.gl;
		if (Static5.aBoolean249) {
			gl.glEnable(GL.GL_POINT_SPRITE);
			gl.glTexEnvi(GL.GL_POINT_SPRITE, GL.GL_COORD_REPLACE, GL.GL_LINES);
		}
		gl.glDepthMask(false);
		MaterialManager.setMaterial(0, 0);
		gl.glColorMaterial(GL.GL_FRONT, GL.GL_DIFFUSE);
		gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, Static4.aFloatArray36, 0);
		if (Preferences.highDetailLighting) {
			gl.glDisableClientState(GL.GL_NORMAL_ARRAY);
		}
		gl.glDisableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		gl.glPushMatrix();
		gl.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
		gl.glNormal3f(0.0F, -1.0F, 0.0F);
		if (!GlRenderer.aBoolean139) {
			gl.glDisable(GL.GL_FOG);
		}
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "()V")
	public static void method2962() {
		@Pc(1) GL gl = GlRenderer.gl;
		if (Preferences.highDetailLighting) {
			gl.glEnableClientState(GL.GL_NORMAL_ARRAY);
		}
		gl.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		gl.glDepthMask(true);
		gl.glColorMaterial(GL.GL_FRONT, GL.GL_AMBIENT_AND_DIFFUSE);
		gl.glPopMatrix();
		if (!GlRenderer.aBoolean139) {
			gl.glEnable(GL.GL_FOG);
		}
		if (Static5.aBoolean249) {
			gl.glTexEnvi(GL.GL_POINT_SPRITE, GL.GL_COORD_REPLACE, GL.GL_POINTS);
			gl.glDisable(GL.GL_POINT_SPRITE);
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
	public static void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static5.aFloat86 = (float) arg1 / 334.0F;
	}

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "()V")
	public static void method2969() {
		@Pc(1) GL gl = GlRenderer.gl;
		if (gl.isExtensionAvailable("GL_ARB_point_parameters")) {
			@Pc(20) float[] local20 = new float[] { 1.0F, 0.0F, 5.0E-7F };
			gl.glPointParameterfvARB(GL.GL_POINT_DISTANCE_ATTENUATION, local20, 0);
			@Pc(28) FloatBuffer local28 = FloatBuffer.allocate(1);
			gl.glGetFloatv(GL.GL_POINT_SIZE_MAX, local28);
			@Pc(36) float local36 = local28.get(0);
			if (local36 > 64.0F) {
				local36 = 64.0F;
			}
			gl.glPointParameterfARB(GL.GL_POINT_SIZE_MIN, 1.0F);
			gl.glPointParameterfARB(GL.GL_POINT_SIZE_MAX, local36);
		}
		if (gl.isExtensionAvailable("GL_ARB_point_sprite")) {
			Static5.aBoolean249 = true;
		}
		Static5.aShortArrayArray3 = new short[1600][32];
		Static5.aShortArrayArray4 = new short[32][768];
		Static5.anIntArray387 = new int[1600];
		Static5.anIntArray388 = new int[32];
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
	private static int[] method4355(@OriginalArg(0) int arg0, @OriginalArg(1) CollisionMap[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = (arg9 & 0x7) * 8;
		@Pc(13) int local13 = (arg4 & 0x7) * 8;
		if (!arg8) {
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				for (@Pc(23) int local23 = 0; local23 < 8; local23++) {
					@Pc(38) int local38 = Static35.method4338(local23 & 0x7, arg6, local18 & 0x7) + arg3;
					@Pc(50) int local50 = arg5 + Static24.method2614(arg6, local18 & 0x7, local23 & 0x7);
					if (local38 > 0 && local38 < 103 && local50 > 0 && local50 < 103) {
						arg1[arg7].flags[local38][local50] &= -2097153;
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
								SceneGraph.tileHeights[arg7][local300][local293] = SceneGraph.tileHeights[arg7][local229 + local121][local241 + local129];
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
									SceneGraph.aByteArrayArrayArray16[arg7][local602][local618] = 0;
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
													SceneGraph.aByteArrayArrayArray16[arg7][local766][local778] = local713;
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
		if (GlRenderer.enabled && !arg8) {
			@Pc(840) Environment local840 = null;
			while (true) {
				while (local101.bytes.length > local101.position) {
					@Pc(854) int local854 = local101.readUnsignedByte();
					if (local854 == 0) {
						local840 = new Environment(local101);
					} else if (local854 == 1) {
						@Pc(893) int local893 = local101.readUnsignedByte();
						if (local893 > 0) {
							for (@Pc(897) int local897 = 0; local897 < local893; local897++) {
								@Pc(905) Light local905 = new Light(local101);
								if (local905.anInt1323 == 31) {
									@Pc(916) LightType local916 = LightTypeList.get(local101.readUnsignedShort());
									local905.method1073(local916.anInt5484, local916.anInt5480, local916.anInt5482, local916.anInt5481);
								}
								@Pc(932) int local932 = local905.x >> 7;
								@Pc(937) int local937 = local905.z >> 7;
								if (local905.anInt1326 == arg0 && local932 >= local13 && local13 + 8 > local932 && local7 <= local937 && local7 + 8 > local937) {
									@Pc(987) int local987 = (arg3 << 7) + Static31.method3802(local905.x & 0x3FF, arg6, local905.z & 0x3FF);
									@Pc(1003) int local1003 = (arg5 << 7) + Static22.method2188(local905.z & 0x3FF, local905.x & 0x3FF, arg6);
									local905.x = local987;
									local905.z = local1003;
									@Pc(1014) int local1014 = local905.z >> 7;
									@Pc(1019) int local1019 = local905.x >> 7;
									if (local1019 >= 0 && local1014 >= 0 && local1019 < 104 && local1014 < 104) {
										local905.aBoolean80 = (Static4.tileFlags[1][local1019][local1014] & 0x2) != 0;
										local905.y = SceneGraph.tileHeights[local905.anInt1326][local1019][local1014] - local905.y;
										LightingManager.addLight(local905);
									}
								}
							}
						}
					} else if (local854 == 2) {
						if (local840 == null) {
							local840 = new Environment();
						}
						local840.method4786(local101);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local840 == null) {
					local840 = new Environment();
				}
				Static5.aClass187ArrayArray1[arg3 >> 3][arg5 >> 3] = local840;
				break;
			}
		}
		@Pc(1093) int local1093 = arg5 + 7;
		@Pc(1097) int local1097 = arg3 + 7;
		for (@Pc(1099) int local1099 = arg3; local1099 < local1097; local1099++) {
			for (@Pc(1104) int local1104 = arg5; local1104 < local1093; local1104++) {
				SceneGraph.aByteArrayArrayArray16[arg7][local1099][local1104] = 0;
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

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZZ)V")
	public static void method4359(@OriginalArg(0) boolean underwater) {
		@Pc(10) int[] local10 = null;
		@Pc(16) byte levels;
		@Pc(18) byte[][] bytes;
		if (GlRenderer.enabled && underwater) {
			levels = 1;
			bytes = Static7.underwaterMapBytes;
		} else {
			levels = 4;
			bytes = Static1.mapBytes;
		}
		for (@Pc(26) int destLevel = 0; destLevel < levels; destLevel++) {
			Static9.method763();
			for (@Pc(37) int destX = 0; destX < 13; destX++) {
				for (@Pc(42) int destZ = 0; destZ < 13; destZ++) {
					@Pc(49) boolean valid = false;
					@Pc(57) int zone = Static7.zones[destLevel][destX][destZ];
					if (zone != -1) {
						@Pc(69) int srcLevel = zone >> 24 & 0x3;
						if (!underwater || srcLevel == 0) {
							@Pc(83) int angle = zone >> 1 & 0x3;
							@Pc(89) int srcX = zone >> 14 & 0x3FF;
							@Pc(95) int srcZ = zone >> 3 & 0x7FF;
							@Pc(105) int srcMapSquare = srcZ / 8 + (srcX / 8 << 8);
							for (@Pc(107) int i = 0; i < Static7.mapSquares.length; i++) {
								if (Static7.mapSquares[i] == srcMapSquare && bytes[i] != null) {
									valid = true;
									@Pc(151) int[] local151 = method4355(srcLevel, PathFinder.collisionMaps, bytes[i], destX * 8, srcX, destZ * 8, angle, destLevel, underwater, srcZ);
									if (local10 == null && local151 != null) {
										local10 = local151;
									}
									break;
								}
							}
						}
					}
					if (!valid) {
						Static29.method3536(destX * 8, destLevel, 8, destZ * 8, 8);
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
	public static void method2981(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < SceneGraph.width) {
			@Pc(12) Tile local12 = SceneGraph.tiles[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.groundDecor != null && local12.groundDecor.entity.method3808()) {
				arg0.method3807(local12.groundDecor.entity, 128, 0, 0, true);
			}
		}
		if (arg3 < SceneGraph.width) {
			@Pc(44) Tile local44 = SceneGraph.tiles[arg1][arg2][arg3 + 1];
			if (local44 != null && local44.groundDecor != null && local44.groundDecor.entity.method3808()) {
				arg0.method3807(local44.groundDecor.entity, 0, 0, 128, true);
			}
		}
		if (arg2 < SceneGraph.width && arg3 < SceneGraph.length) {
			@Pc(81) Tile local81 = SceneGraph.tiles[arg1][arg2 + 1][arg3 + 1];
			if (local81 != null && local81.groundDecor != null && local81.groundDecor.entity.method3808()) {
				arg0.method3807(local81.groundDecor.entity, 128, 0, 128, true);
			}
		}
		if (arg2 < SceneGraph.width && arg3 > 0) {
			@Pc(117) Tile local117 = SceneGraph.tiles[arg1][arg2 + 1][arg3 - 1];
			if (local117 != null && local117.groundDecor != null && local117.groundDecor.entity.method3808()) {
				arg0.method3807(local117.groundDecor.entity, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
	public static int method2983(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local26 >> 12) + 40960;
		return local13 * local34 >> 12;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public static void method4812() {
		if (!Static3.aBoolean177) {
			return;
		}
		@Pc(15) Component local15 = Static23.method2425(Static1.anInt1053, Static2.anInt1367);
		if (local15 != null && local15.anObjectArray17 != null) {
			@Pc(26) HookRequest local26 = new HookRequest();
			local26.arguments = local15.anObjectArray17;
			local26.source = local15;
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
		MaterialManager.resetArgument(3);
		MaterialManager.resetArgument(4);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method2992(@OriginalArg(1) int arg0) {
		return Static6.aStringArray27[arg0].length() <= 0 ? Static6.aStringArray30[arg0] : Static6.aStringArray30[arg0] + LocalisedText.MINISEPARATOR + Static6.aStringArray27[arg0];
	}

}

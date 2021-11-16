import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

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
	private static int[] readZone(@OriginalArg(0) int arg0, @OriginalArg(1) CollisionMap[] collisionMaps, @OriginalArg(2) byte[] bytes, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int angle, @OriginalArg(8) int arg7, @OriginalArg(9) boolean underwater, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = (arg9 & 0x7) * 8;
		@Pc(13) int local13 = (arg4 & 0x7) * 8;
		if (!underwater) {
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				for (@Pc(23) int local23 = 0; local23 < 8; local23++) {
					@Pc(38) int local38 = Static35.rotateX(local23 & 0x7, angle, local18 & 0x7) + arg3;
					@Pc(50) int local50 = arg5 + Static24.rotateZ(angle, local18 & 0x7, local23 & 0x7);
					if (local38 > 0 && local38 < 103 && local50 > 0 && local50 < 103) {
						collisionMaps[arg7].flags[local38][local50] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(101) Buffer buffer = new Buffer(bytes);
		@Pc(109) byte levels;
		if (underwater) {
			levels = 1;
		} else {
			levels = 4;
		}
		@Pc(119) int local119 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(121) byte local121 = 0;
		@Pc(127) int local127 = (arg9 & 0xFFFFFFF8) << 3;
		@Pc(129) byte local129 = 0;
		if (angle == 1) {
			local129 = 1;
		} else if (angle == 2) {
			local121 = 1;
			local129 = 1;
		} else if (angle == 3) {
			local121 = 1;
		}
		for (@Pc(157) int local157 = 0; local157 < levels; local157++) {
			for (@Pc(166) int local166 = 0; local166 < 64; local166++) {
				for (@Pc(171) int local171 = 0; local171 < 64; local171++) {
					if (local157 != arg0 || local166 < local13 || local13 + 8 < local166 || local171 < local7 || local171 > local7 + 8) {
						Static9.readTile(buffer, false, underwater, 0, 0, 0, -1, 0, 0, 0, -1);
					} else if (local13 + 8 == local166 || local7 + 8 == local171) {
						@Pc(409) int local409;
						@Pc(416) int local416;
						if (angle == 0) {
							local409 = local166 + arg3 - local13;
							local416 = arg5 + local171 - local7;
						} else if (angle == 1) {
							local416 = local13 + arg5 + 8 - local166;
							local409 = arg3 + local171 - local7;
						} else if (angle == 2) {
							local409 = arg3 + local13 + 8 - local166;
							local416 = arg5 + local7 + 8 - local171;
						} else {
							local409 = local7 + arg3 + 8 - local171;
							local416 = arg5 + local166 - local13;
						}
						Static9.readTile(buffer, true, underwater, arg7, local119 + local166, local127 + local171, local416, 0, 0, 0, local409);
					} else {
						@Pc(229) int local229 = Static35.rotateX(local171 & 0x7, angle, local166 & 0x7) + arg3;
						@Pc(241) int local241 = Static24.rotateZ(angle, local166 & 0x7, local171 & 0x7) + arg5;
						Static9.readTile(buffer, false, underwater, arg7, local119 + local166, local171 + local127, local241, angle, local129, local121, local229);
						if (local166 == 63 || local171 == 63) {
							@Pc(272) int local272 = local166 == 63 ? 64 : local166;
							@Pc(281) int local281 = local171 == 63 ? 64 : local171;
							@Pc(300) int local300;
							@Pc(293) int local293;
							if (angle == 0) {
								local293 = arg5 + local281 - local7;
								local300 = arg3 + local272 - local13;
							} else if (angle == 1) {
								local300 = local281 + arg3 - local7;
								local293 = arg5 + local13 + 8 - local272;
							} else if (angle == 2) {
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
		while (buffer.bytes.length > buffer.position) {
			@Pc(538) int local538 = buffer.readUnsignedByte();
			if (local538 == 128) {
				local526 = true;
				Static6.anIntArray465[0] = buffer.readUnsignedShort();
				Static6.anIntArray465[1] = buffer.readShort();
				Static6.anIntArray465[2] = buffer.readShort();
				Static6.anIntArray465[3] = buffer.readShort();
				Static6.anIntArray465[4] = buffer.readUnsignedShort();
			} else {
				if (local538 != 129) {
					buffer.position--;
					break;
				}
				for (@Pc(580) int local580 = 0; local580 < 4; local580++) {
					@Pc(587) byte local587 = buffer.readByte();
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
								@Pc(713) byte local713 = buffer.readByte();
								if (local580 <= arg0) {
									for (@Pc(718) int local718 = local699; local718 < local699 + 4; local718++) {
										for (@Pc(729) int local729 = local706; local729 < local706 + 4; local729++) {
											if (local718 >= local13 && local13 + 8 > local718 && local7 <= local729 && local7 < local7 + 8) {
												@Pc(766) int local766 = arg3 + Static35.rotateX(local729 & 0x7, angle, local718 & 0x7);
												@Pc(778) int local778 = Static24.rotateZ(angle, local718 & 0x7, local729 & 0x7) + arg5;
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
		if (GlRenderer.enabled && !underwater) {
			@Pc(840) Environment environment = null;
			while (true) {
				while (buffer.bytes.length > buffer.position) {
					@Pc(854) int code = buffer.readUnsignedByte();
					if (code == 0) {
						environment = new Environment(buffer);
					} else if (code == 1) {
						@Pc(893) int lights = buffer.readUnsignedByte();
						if (lights > 0) {
							for (@Pc(897) int i = 0; i < lights; i++) {
								@Pc(905) Light light = new Light(buffer);
								if (light.anInt1323 == 31) {
									@Pc(916) LightType type = LightTypeList.get(buffer.readUnsignedShort());
									light.method1073(type.anInt5484, type.anInt5480, type.anInt5482, type.anInt5481);
								}
								@Pc(932) int local932 = light.x >> 7;
								@Pc(937) int local937 = light.z >> 7;
								if (light.level == arg0 && local932 >= local13 && local13 + 8 > local932 && local7 <= local937 && local7 + 8 > local937) {
									@Pc(987) int local987 = (arg3 << 7) + Static31.rotateXFine(light.x & 0x3FF, angle, light.z & 0x3FF);
									@Pc(1003) int local1003 = (arg5 << 7) + Static22.rotateZFine(light.z & 0x3FF, light.x & 0x3FF, angle);
									light.x = local987;
									light.z = local1003;
									@Pc(1014) int local1014 = light.z >> 7;
									@Pc(1019) int local1019 = light.x >> 7;
									if (local1019 >= 0 && local1014 >= 0 && local1019 < 104 && local1014 < 104) {
										light.linkBelow = (Static4.tileFlags[1][local1019][local1014] & 0x2) != 0;
										light.y = SceneGraph.tileHeights[light.level][local1019][local1014] - light.y;
										LightingManager.addLight(light);
									}
								}
							}
						}
					} else if (code == 2) {
						if (environment == null) {
							environment = new Environment();
						}
						environment.method4786(buffer);
					} else {
						throw new IllegalStateException();
					}
				}
				if (environment == null) {
					environment = new Environment();
				}
				Static5.environments[arg3 >> 3][arg5 >> 3] = environment;
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
			Static9.audioLoop();
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
									@Pc(151) int[] local151 = readZone(srcLevel, PathFinder.collisionMaps, bytes[i], destX * 8, srcX, destZ * 8, angle, destLevel, underwater, srcZ);
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
		@Pc(15) Component component = InterfaceList.getCreatedComponent(Static1.anInt1053, Static2.anInt1367);
		if (component != null && component.onTargetLeave != null) {
			@Pc(26) HookRequest hookRequest = new HookRequest();
			hookRequest.arguments = component.onTargetLeave;
			hookRequest.source = component;
			ScriptRunner.method2019(hookRequest);
		}
		Static3.aBoolean177 = false;
		Static7.anInt6050 = -1;
		Static28.method3270(component);
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
			@Pc(109) int local109 = IntUtils.clamp(arg4 + arg3, Static2.anInt902, Static3.anInt2553);
			@Pc(117) int local117 = IntUtils.clamp(arg4 - arg3, Static2.anInt902, Static3.anInt2553);
			ArrayUtils.fillRange(Static5.anIntArrayArray36[arg0], local117, local109, arg2);
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
				@Pc(229) int local229 = IntUtils.clamp(local9 + arg4, Static2.anInt902, Static3.anInt2553);
				@Pc(237) int local237 = IntUtils.clamp(arg4 - local9, Static2.anInt902, Static3.anInt2553);
				if (Static4.anInt3086 <= local198) {
					ArrayUtils.fillRange(Static5.anIntArrayArray36[local198], local237, local229, arg2);
				}
				if (local211 <= Static5.anInt4230) {
					ArrayUtils.fillRange(Static5.anIntArrayArray36[local211], local237, local229, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)I")
	public static int method2987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >>> 31;
		return (local13 + arg1) / arg0 - local13;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Z")
	public static boolean showVideoAd() {
		if (client.javaScript) {
			try {
				BrowserControl.call(GameShell.signLink.applet, "showVideoAd");
				return true;
			} catch (@Pc(20) Throwable ex) {
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

}

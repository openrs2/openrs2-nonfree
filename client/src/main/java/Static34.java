import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z[Lclient!ch;IIIII[B)[I")
	public static int[] readMap(@OriginalArg(0) boolean underwater, @OriginalArg(1) CollisionMap[] collisionMaps, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] bytes) {
		@Pc(9) byte local9;
		if (underwater) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		if (!underwater) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				for (@Pc(25) int local25 = 0; local25 < 64; local25++) {
					for (@Pc(32) int local32 = 0; local32 < 64; local32++) {
						if (arg4 + local25 > 0 && local25 + arg4 < 103 && arg3 + local32 > 0 && local32 + arg3 < 103) {
							collisionMaps[local18].flags[local25 + arg4][arg3 + local32] &= -2097153;
						}
					}
				}
			}
		}
		@Pc(103) int local103 = arg5 + arg4;
		@Pc(108) Buffer buffer = new Buffer(bytes);
		@Pc(112) int local112 = arg2 + arg3;
		for (@Pc(114) int local114 = 0; local114 < local9; local114++) {
			for (@Pc(129) int local129 = 0; local129 < 64; local129++) {
				for (@Pc(134) int local134 = 0; local134 < 64; local134++) {
					Static9.readTile(buffer, false, underwater, local114, local103 + local129, local134 + local112, local134 + arg3, 0, 0, 0, arg4 + local129);
				}
			}
		}
		@Pc(171) boolean local171 = false;
		@Pc(173) boolean local173 = false;
		while (buffer.bytes.length > buffer.position) {
			@Pc(183) int local183 = buffer.readUnsignedByte();
			if (local183 == 128) {
				local171 = true;
				Static6.anIntArray465[0] = buffer.readUnsignedShort();
				Static6.anIntArray465[1] = buffer.readShort();
				Static6.anIntArray465[2] = buffer.readShort();
				Static6.anIntArray465[3] = buffer.readShort();
				Static6.anIntArray465[4] = buffer.readUnsignedShort();
			} else {
				if (local183 != 129) {
					buffer.position--;
					break;
				}
				for (@Pc(201) int local201 = 0; local201 < 4; local201++) {
					@Pc(210) byte local210 = buffer.readByte();
					if (local210 == 0) {
						@Pc(216) int local216 = arg4 + 64;
						if (local216 < 0) {
							local216 = 0;
						} else if (local216 >= 104) {
							local216 = 104;
						}
						@Pc(231) int local231 = arg4;
						@Pc(233) int local233 = arg3;
						if (arg3 < 0) {
							local233 = 0;
						} else if (arg3 >= 104) {
							local233 = 104;
						}
						@Pc(252) int local252 = arg3 + 64;
						if (arg4 < 0) {
							local231 = 0;
						} else if (arg4 >= 104) {
							local231 = 104;
						}
						if (local252 < 0) {
							local252 = 0;
						} else if (local252 >= 104) {
							local252 = 104;
						}
						while (local216 > local231) {
							while (local233 < local252) {
								SceneGraph.aByteArrayArrayArray16[local201][local231][local233] = 0;
								local233++;
							}
							local231++;
						}
					} else if (local210 == 1) {
						for (@Pc(307) int local307 = 0; local307 < 64; local307 += 4) {
							for (@Pc(312) int local312 = 0; local312 < 64; local312 += 4) {
								@Pc(321) byte local321 = buffer.readByte();
								for (@Pc(325) int local325 = local307 + arg4; local325 < local307 + arg4 + 4; local325++) {
									for (@Pc(337) int local337 = arg3 + local312; local337 < local312 + arg3 + 4; local337++) {
										if (local325 >= 0 && local325 < 104 && local337 >= 0 && local337 < 104) {
											SceneGraph.aByteArrayArrayArray16[local201][local325][local337] = local321;
										}
									}
								}
							}
						}
					} else if (local210 == 2 && local201 > 0) {
						@Pc(393) int local393 = arg4 + 64;
						if (local393 < 0) {
							local393 = 0;
						} else if (local393 >= 104) {
							local393 = 104;
						}
						@Pc(409) int local409 = arg3;
						if (arg3 < 0) {
							local409 = 0;
						} else if (arg3 >= 104) {
							local409 = 104;
						}
						@Pc(426) int local426 = arg4;
						@Pc(430) int local430 = arg3 + 64;
						if (arg4 < 0) {
							local426 = 0;
						} else if (arg4 >= 104) {
							local426 = 104;
						}
						if (local430 < 0) {
							local430 = 0;
						} else if (local430 >= 104) {
							local430 = 104;
						}
						while (local393 > local426) {
							while (local430 > local409) {
								SceneGraph.aByteArrayArrayArray16[local201][local426][local409] = SceneGraph.aByteArrayArrayArray16[local201 - 1][local426][local409];
								local409++;
							}
							local426++;
						}
					}
				}
				local173 = true;
			}
		}
		if (GlRenderer.enabled && !underwater) {
			@Pc(539) Environment environment = null;
			while (true) {
				while (buffer.position < buffer.bytes.length) {
					@Pc(549) int local549 = buffer.readUnsignedByte();
					if (local549 == 0) {
						environment = new Environment(buffer);
					} else if (local549 == 1) {
						@Pc(585) int lights = buffer.readUnsignedByte();
						if (lights > 0) {
							for (@Pc(590) int i = 0; i < lights; i++) {
								@Pc(598) Light light = new Light(buffer);
								if (light.functionPreset == 31) {
									@Pc(608) LightType type = LightTypeList.get(buffer.readUnsignedShort());
									light.setFunction(type.function, type.frequency, type.alphaMin, type.alphaMax);
								}
								light.x += arg4 << 7;
								light.z += arg3 << 7;
								@Pc(640) int local640 = light.x >> 7;
								@Pc(645) int local645 = light.z >> 7;
								if (local640 >= 0 && local645 >= 0 && local640 < 104 && local645 < 104) {
									light.linkBelow = (Static4.tileFlags[1][local640][local645] & 0x2) != 0;
									light.y = SceneGraph.tileHeights[light.level][local640][local645] - light.y;
									LightingManager.addLight(light);
								}
							}
						}
					} else if (local549 == 2) {
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
				for (@Pc(704) int local704 = 0; local704 < 8; local704++) {
					for (@Pc(709) int local709 = 0; local709 < 8; local709++) {
						@Pc(719) int local719 = (arg4 >> 3) + local704;
						@Pc(725) int local725 = (arg3 >> 3) + local709;
						if (local719 >= 0 && local719 < 13 && local725 >= 0 && local725 < 13) {
							Static5.environments[local719][local725] = environment;
						}
					}
				}
				break;
			}
		}
		if (!local173) {
			for (@Pc(760) int local760 = 0; local760 < 4; local760++) {
				for (@Pc(767) int local767 = 0; local767 < 16; local767++) {
					for (@Pc(772) int local772 = 0; local772 < 16; local772++) {
						@Pc(784) int local784 = (arg3 >> 2) + local772;
						@Pc(790) int local790 = (arg4 >> 2) + local767;
						if (local790 >= 0 && local790 < 26 && local784 >= 0 && local784 < 26) {
							SceneGraph.aByteArrayArrayArray16[local760][local790][local784] = 0;
						}
					}
				}
			}
		}
		return local171 ? Static6.anIntArray465 : null;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZLclient!wf;)V")
	public static void method4251(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component component) {
		@Pc(8) int width = component.scrollWidth == 0 ? component.width : component.scrollWidth;
		@Pc(20) int height = component.scrollHeight == 0 ? component.height : component.scrollHeight;
		Static31.method3660(InterfaceList.components[component.id >> 16], arg0, width, component.id, height);
		if (component.createdComponents != null) {
			Static31.method3660(component.createdComponents, arg0, width, component.id, height);
		}
		@Pc(61) SubInterface subInterface = (SubInterface) InterfaceList.subInterfaces.get((long) component.id);
		if (subInterface != null) {
			Static21.method2050(arg0, width, subInterface.id, height);
		}
	}
}

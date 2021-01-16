import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!wf;)Z")
	public static boolean method4402(@OriginalArg(1) Component arg0) {
		if (arg0.anInt5904 == 205) {
			Static1.anInt885 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
	public static void method4404(@OriginalArg(1) int arg0) {
		Static1.anInt929 = -1;
		Static1.anInt929 = -1;
		Static7.anInt5231 = arg0;
		Static28.method3249();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLclient!fg;ILclient!ho;)V")
	public static void method3811(@OriginalArg(0) int arg0, @OriginalArg(2) MapElement arg1, @OriginalArg(3) int arg2, @OriginalArg(4) MelType arg3) {
		if (arg3.anIntArray188 != null) {
			@Pc(10) boolean local10 = false;
			@Pc(15) int[] local15 = new int[arg3.anIntArray188.length];
			for (@Pc(17) int local17 = 0; local17 < local15.length / 2; local17++) {
				@Pc(37) int local37 = arg3.anIntArray188[local17 * 2] + arg1.x;
				@Pc(50) int local50 = arg1.z - arg3.anIntArray188[local17 * 2 + 1];
				@Pc(71) int local71 = local15[local17 * 2] = Static3.anInt2969 + (local37 - Static3.anInt2973) * (Static3.anInt2970 - Static3.anInt2969) / (Static3.anInt2972 - Static3.anInt2973);
				@Pc(95) int local95 = local15[local17 * 2 + 1] = Static3.anInt2968 + (local50 - Static3.anInt2967) * (Static3.anInt2971 - Static3.anInt2968) / (Static3.anInt2966 - Static3.anInt2967);
				if (Static3.anInt2969 < local71 && local71 < Static3.anInt2970 && Static3.anInt2968 < local95 && local95 < Static3.anInt2971) {
					local10 = true;
				}
			}
			if (!local10) {
				return;
			}
			Static17.method1628(local15, arg3.anInt2283, arg3.anInt2283 >>> 24);
			for (@Pc(134) int local134 = 0; local134 < local15.length / 2 - 1; local134++) {
				SoftwareRaster.method4230(local15[local134 * 2], local15[local134 * 2 + 1], local15[(local134 + 1) * 2], local15[(local134 + 1) * 2 + 1], arg3.anInt2266, arg3.anInt2266 >>> 24);
			}
			SoftwareRaster.method4230(local15[local15.length - 2], local15[local15.length - 1], local15[0], local15[1], arg3.anInt2266, arg3.anInt2266 >>> 24);
		} else if (arg1.aBoolean106) {
			return;
		}
		@Pc(222) Class4_Sub17 local222 = new Class4_Sub17(arg1);
		@Pc(224) SoftwareIndexedSprite local224 = null;
		if (arg3.sprite != -1) {
			if (arg1.hover && arg3.hoverSprite != -1) {
				local224 = (SoftwareIndexedSprite) arg3.method1811(true, true);
			} else {
				local224 = (SoftwareIndexedSprite) arg3.method1811(false, true);
			}
			if (local224 != null) {
				if (Static4.anInt2853 > 0 && (Static5.anInt3920 != -1 && arg1.id == Static5.anInt3920 || Static2.anInt1874 != -1 && arg3.category == Static2.anInt1874)) {
					@Pc(290) int local290;
					if (Static5.anInt4215 <= 50) {
						local290 = Static5.anInt4215 * 3;
					} else {
						local290 = 300 - Static5.anInt4215 * 3;
					}
					SoftwareRaster.method4206(arg1.anInt1766, arg1.anInt1764, local224.width / 2 + 7, 16776960, local290);
					SoftwareRaster.method4206(arg1.anInt1766, arg1.anInt1764, local224.width / 2 + 5, 16776960, local290);
					SoftwareRaster.method4206(arg1.anInt1766, arg1.anInt1764, local224.width / 2 + 3, 16776960, local290);
					SoftwareRaster.method4206(arg1.anInt1766, arg1.anInt1764, local224.width / 2 + 1, 16776960, local290);
					SoftwareRaster.method4206(arg1.anInt1766, arg1.anInt1764, local224.width / 2, 16776960, local290);
				}
				local224.renderTransparent(arg1.anInt1766 - (local224.width >> 1), arg1.anInt1764 - (local224.height >> 1));
				local222.anInt3461 = (local224.height >> 1) + arg2 + arg1.anInt1764;
				local222.anInt3457 = arg0 + arg1.anInt1766 - (local224.width >> 1);
				local222.anInt3462 = (local224.width >> 1) + arg0 + arg1.anInt1766;
				local222.anInt3459 = arg2 + arg1.anInt1764 - (local224.height >> 1);
			}
		}
		if (arg3.text != null) {
			if (local224 == null) {
				Static28.method3244(arg1, arg0, 0, arg2, true, local222, arg3);
			} else {
				Static28.method3244(arg1, arg0, (local224.height >> 1) + 5, arg2, false, local222, arg3);
			}
		}
		if (local222.method2923(Mouse.x, Mouse.y) && arg3.ops != null) {
			if (arg3.ops[4] != null) {
				Static16.method1497((long) arg1.id, arg3.category, 0, arg3.opBase, arg3.ops[4], (short) 1011, -1);
			}
			if (arg3.ops[3] != null) {
				Static16.method1497((long) arg1.id, arg3.category, 0, arg3.opBase, arg3.ops[3], (short) 1003, -1);
			}
			if (arg3.ops[2] != null) {
				Static16.method1497((long) arg1.id, arg3.category, 0, arg3.opBase, arg3.ops[2], (short) 1008, -1);
			}
			if (arg3.ops[1] != null) {
				Static16.method1497((long) arg1.id, arg3.category, 0, arg3.opBase, arg3.ops[1], (short) 1002, -1);
			}
			if (arg3.ops[0] != null) {
				Static16.method1497((long) arg1.id, arg3.category, 0, arg3.opBase, arg3.ops[0], (short) 1012, -1);
			}
		}
		Static3.aClass112_13.addTail(local222);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!wf;I)V")
	public static void method3812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		if (arg2.aByte26 == 0) {
			arg2.anInt5960 = arg2.anInt5928;
		} else if (arg2.aByte26 == 1) {
			arg2.anInt5960 = arg2.anInt5928 + (arg0 - arg2.anInt5893) / 2;
		} else if (arg2.aByte26 == 2) {
			arg2.anInt5960 = arg0 - arg2.anInt5928 - arg2.anInt5893;
		} else if (arg2.aByte26 == 3) {
			arg2.anInt5960 = arg2.anInt5928 * arg0 >> 14;
		} else if (arg2.aByte26 == 4) {
			arg2.anInt5960 = (arg2.anInt5928 * arg0 >> 14) + (arg0 - arg2.anInt5893) / 2;
		} else {
			arg2.anInt5960 = arg0 - (arg0 * arg2.anInt5928 >> 14) - arg2.anInt5893;
		}
		if (arg2.aByte25 == 0) {
			arg2.anInt5888 = arg2.anInt5951;
		} else if (arg2.aByte25 == 1) {
			arg2.anInt5888 = arg2.anInt5951 + (arg1 - arg2.anInt5949) / 2;
		} else if (arg2.aByte25 == 2) {
			arg2.anInt5888 = arg1 - arg2.anInt5949 - arg2.anInt5951;
		} else if (arg2.aByte25 == 3) {
			arg2.anInt5888 = arg1 * arg2.anInt5951 >> 14;
		} else if (arg2.aByte25 == 4) {
			arg2.anInt5888 = (arg2.anInt5951 * arg1 >> 14) + (arg1 - arg2.anInt5949) / 2;
		} else {
			arg2.anInt5888 = arg1 - (arg2.anInt5951 * arg1 >> 14) - arg2.anInt5949;
		}
		if (!Static1.qaOpTest || InterfaceList.getServerActiveProperties(arg2).events == 0 && arg2.type != 0) {
			return;
		}
		if (arg2.anInt5888 < 0) {
			arg2.anInt5888 = 0;
		} else if (arg2.anInt5949 + arg2.anInt5888 > arg1) {
			arg2.anInt5888 = arg1 - arg2.anInt5949;
		}
		if (arg2.anInt5960 < 0) {
			arg2.anInt5960 = 0;
		} else if (arg0 < arg2.anInt5960 + arg2.anInt5893) {
			arg2.anInt5960 = arg0 - arg2.anInt5893;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method4436() {
		@Pc(5) String local5 = "www";
		if (client.modeWhere != 0) {
			local5 = "www-wtqa";
		}
		@Pc(12) String local12 = "";
		if (client.settings != null) {
			local12 = "/p=" + client.settings;
		}
		return "http://" + local5 + ".openrs2.org/l=" + client.language + "/a=" + client.affiliate + local12 + "/";
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIIII)I")
	public static int method4443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = arg2 & 0xF;
		@Pc(32) int local32 = local9 >= 4 ? (local9 == 12 || local9 == 14 ? arg1 : arg3) : arg0;
		@Pc(39) int local39 = local9 < 8 ? arg1 : arg0;
		return ((local9 & 0x2) == 0 ? local32 : -local32) + ((local9 & 0x1) == 0 ? local39 : -local39);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII)V")
	public static void method4444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * Preferences.musicVolume >> 8;
		if (arg1 == -1 && !Static4.aBoolean210) {
			Static37.method4718();
		} else if (arg1 != -1 && (Static6.anInt4844 != arg1 || !Static16.method1550()) && arg0 != 0 && !Static4.aBoolean210) {
			Static24.method2692(client.js5Archive6, arg0, arg1);
		}
		Static6.anInt4844 = arg1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([[III)I")
	public static int method3821(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(7) int local7 = arg2 >> 7;
		if (local3 < 0 || local7 < 0 || local3 >= arg0.length || local7 >= arg0[0].length) {
			return 0;
		}
		@Pc(27) int local27 = arg1 & 0x7F;
		@Pc(31) int local31 = arg2 & 0x7F;
		@Pc(53) int local53 = arg0[local3][local7] * (128 - local27) + arg0[local3 + 1][local7] * local27 >> 7;
		@Pc(79) int local79 = arg0[local3][local7 + 1] * (128 - local27) + arg0[local3 + 1][local7 + 1] * local27 >> 7;
		return local53 * (128 - local31) + local79 * local31 >> 7;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method4447() {
		Static7.aClass4_Sub3_Sub14_9 = null;
		Static6.aClass4_Sub3_Sub14_8 = null;
		Static1.aClass4_Sub3_Sub14_1 = null;
		Static6.aClass4_Sub3_Sub14_5 = null;
		Static2.aClass4_Sub3_Sub14_2 = null;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
	public static void method4455() {
		if (Static4.anInt3304 == 10 && GlRenderer.enabled) {
			Static9.method233(28);
		}
		if (Static4.anInt3304 == 30) {
			Static9.method233(25);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZ)V")
	public static void method4462(@OriginalArg(0) byte arg0) {
		if (Static1.aByteArrayArrayArray2 == null) {
			Static1.aByteArrayArrayArray2 = new byte[4][104][104];
		}
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			for (@Pc(17) int local17 = 0; local17 < 104; local17++) {
				for (@Pc(24) int local24 = 0; local24 < 104; local24++) {
					Static1.aByteArrayArrayArray2[local12][local17][local24] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V")
	public static void method4524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg2, arg3, arg1 + arg2, arg0 + arg3);
			GlRaster.fillRect(arg2, arg3, arg1, arg0, 0);
		} else {
			SoftwareRaster.setClip(arg2, arg3, arg2 + arg1, arg3 + arg0);
			SoftwareRaster.fillRect(arg2, arg3, arg1, arg0, 0);
		}
		if (WorldMap.loadPercentage < 100) {
			return;
		}
		@Pc(51) float local51 = (float) Static3.anInt2960 / (float) Static3.anInt2965;
		@Pc(57) int local57 = arg1;
		@Pc(59) int local59 = arg0;
		if (local51 < 1.0F) {
			local59 = (int) (local51 * (float) arg1);
		} else {
			local57 = (int) ((float) arg0 / local51);
		}
		arg2 += (arg1 - local57) / 2;
		arg3 += (arg0 - local59) / 2;
		if (Static4.aClass4_Sub3_Sub14_3 == null || arg1 != Static4.aClass4_Sub3_Sub14_3.width || arg0 != Static4.aClass4_Sub3_Sub14_3.height) {
			@Pc(117) SoftwareSprite local117 = new SoftwareSprite(arg1, arg0);
			SoftwareRaster.setPixels(local117.pixels, arg1, arg0);
			if (WorldMap.currentMap.backgroundColor != -1) {
				SoftwareRaster.fillRect(0, 0, arg1, arg0, WorldMap.currentMap.backgroundColor);
			}
			Static19.method2401(0, 0, Static3.anInt2965, Static3.anInt2960, 0, 0, local57, local59);
			Static20.method2403();
			if (GlRenderer.enabled) {
				Static4.aClass4_Sub3_Sub14_3 = new GlSprite(local117);
			} else {
				Static4.aClass4_Sub3_Sub14_3 = local117;
			}
			if (GlRenderer.enabled) {
				SoftwareRaster.pixels = null;
			} else {
				client.frameBuffer.makeTarget();
			}
		}
		@Pc(166) int local166 = 16711680;
		Static4.aClass4_Sub3_Sub14_3.render(arg2, arg3);
		@Pc(176) int local176 = Static7.anInt5331 * local57 / Static3.anInt2965;
		@Pc(184) int local184 = arg3 + local59 * Static5.anInt3546 / Static3.anInt2960;
		@Pc(190) int local190 = Static7.anInt5680 * local59 / Static3.anInt2960;
		if (client.game == 1) {
			local166 = 16777215;
		}
		@Pc(207) int local207 = arg2 + Static3.anInt2542 * local57 / Static3.anInt2965;
		if (GlRenderer.enabled) {
			GlRaster.fillRectAlpha(local207, local184, local176, local190, local166, 128);
			GlRaster.drawRect(local207, local184, local176, local190, local166);
		} else {
			SoftwareRaster.fillRectAlpha(local207, local184, local176, local190, local166, 128);
			SoftwareRaster.drawRect(local207, local184, local176, local190, local166);
		}
		if (Static4.anInt2853 <= 0) {
			return;
		}
		@Pc(255) int local255;
		if (Static5.anInt4215 > 50) {
			local255 = 500 - Static5.anInt4215 * 5;
		} else {
			local255 = Static5.anInt4215 * 5;
		}
		for (@Pc(266) MapElement local266 = (MapElement) Static3.aClass175_12.head(); local266 != null; local266 = (MapElement) Static3.aClass175_12.next()) {
			@Pc(273) MelType local273 = MelTypeList.get(local266.id);
			if (Static8.method120(local273)) {
				if (local266.id == Static5.anInt3920) {
					@Pc(290) int local290 = local57 * local266.x / Static3.anInt2965 + arg2;
					@Pc(299) int local299 = arg3 + local59 * local266.z / Static3.anInt2960;
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(local290 - 2, local299 - 2, 4, 4, 16776960, local255);
					} else {
						SoftwareRaster.fillRectAlpha(local290 - 2, local299 - 2, 4, 4, 16776960, local255);
					}
				} else if (Static2.anInt1874 != -1 && local273.category == Static2.anInt1874) {
					@Pc(349) int local349 = arg2 + local266.x * local57 / Static3.anInt2965;
					@Pc(358) int local358 = arg3 + local59 * local266.z / Static3.anInt2960;
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(local349 - 2, local358 - 2, 4, 4, 16776960, local255);
					} else {
						SoftwareRaster.fillRectAlpha(local349 - 2, local358 - 2, 4, 4, 16776960, local255);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!ld;Lclient!fh;Lclient!fh;ZLclient!fh;)Z")
	public static boolean method4551(@OriginalArg(0) Class4_Sub6_Sub2 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(4) Js5 arg3) {
		Static1.aClass4_Sub6_Sub2_3 = arg0;
		Static3.aClass58_59 = arg1;
		Static6.aClass58_93 = arg3;
		Static2.aClass58_41 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static2.anInt902 && arg5 <= Static3.anInt2553 && Static4.anInt3086 <= arg6 && arg4 <= Static5.anInt4230) {
			Static9.method758(arg1, arg5, arg6, arg0, arg4, arg2, arg3);
		} else {
			Static22.method2190(arg4, arg3, arg2, arg1, arg0, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	public static void method4567() {
		Protocol.outboundBuffer.writeOpcode(156);
		Protocol.outboundBuffer.writeShort(Static7.anInt5426);
	}
}

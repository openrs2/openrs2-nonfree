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
	public static void method3811(@OriginalArg(0) int x, @OriginalArg(2) MapElement element, @OriginalArg(3) int y, @OriginalArg(4) MelType type) {
		if (type.anIntArray188 != null) {
			@Pc(10) boolean local10 = false;
			@Pc(15) int[] local15 = new int[type.anIntArray188.length];
			for (@Pc(17) int local17 = 0; local17 < local15.length / 2; local17++) {
				@Pc(37) int local37 = type.anIntArray188[local17 * 2] + element.x;
				@Pc(50) int local50 = element.z - type.anIntArray188[local17 * 2 + 1];
				@Pc(71) int local71 = local15[local17 * 2] = Static3.anInt2969 + (local37 - Static3.anInt2973) * (Static3.anInt2970 - Static3.anInt2969) / (Static3.anInt2972 - Static3.anInt2973);
				@Pc(95) int local95 = local15[local17 * 2 + 1] = Static3.anInt2968 + (local50 - Static3.anInt2967) * (Static3.anInt2971 - Static3.anInt2968) / (Static3.anInt2966 - Static3.anInt2967);
				if (Static3.anInt2969 < local71 && local71 < Static3.anInt2970 && Static3.anInt2968 < local95 && local95 < Static3.anInt2971) {
					local10 = true;
				}
			}
			if (!local10) {
				return;
			}
			Static17.method1628(local15, type.anInt2283, type.anInt2283 >>> 24);
			for (@Pc(134) int local134 = 0; local134 < local15.length / 2 - 1; local134++) {
				SoftwareRaster.method4230(local15[local134 * 2], local15[local134 * 2 + 1], local15[(local134 + 1) * 2], local15[(local134 + 1) * 2 + 1], type.anInt2266, type.anInt2266 >>> 24);
			}
			SoftwareRaster.method4230(local15[local15.length - 2], local15[local15.length - 1], local15[0], local15[1], type.anInt2266, type.anInt2266 >>> 24);
		} else if (element.hidden) {
			return;
		}
		@Pc(222) MapElementBounds bounds = new MapElementBounds(element);
		@Pc(224) SoftwareIndexedSprite sprite = null;
		if (type.sprite != -1) {
			if (element.hover && type.hoverSprite != -1) {
				sprite = (SoftwareIndexedSprite) type.method1811(true, true);
			} else {
				sprite = (SoftwareIndexedSprite) type.method1811(false, true);
			}
			if (sprite != null) {
				if (Static4.anInt2853 > 0 && (Static5.anInt3920 != -1 && element.id == Static5.anInt3920 || Static2.anInt1874 != -1 && type.category == Static2.anInt1874)) {
					@Pc(290) int local290;
					if (Static5.anInt4215 <= 50) {
						local290 = Static5.anInt4215 * 3;
					} else {
						local290 = 300 - Static5.anInt4215 * 3;
					}
					SoftwareRaster.method4206(element.xOffset, element.yOffset, sprite.width / 2 + 7, 16776960, local290);
					SoftwareRaster.method4206(element.xOffset, element.yOffset, sprite.width / 2 + 5, 16776960, local290);
					SoftwareRaster.method4206(element.xOffset, element.yOffset, sprite.width / 2 + 3, 16776960, local290);
					SoftwareRaster.method4206(element.xOffset, element.yOffset, sprite.width / 2 + 1, 16776960, local290);
					SoftwareRaster.method4206(element.xOffset, element.yOffset, sprite.width / 2, 16776960, local290);
				}
				sprite.renderTransparent(element.xOffset - (sprite.width >> 1), element.yOffset - (sprite.height >> 1));
				bounds.iconMaxY = (sprite.height >> 1) + y + element.yOffset;
				bounds.iconMinX = x + element.xOffset - (sprite.width >> 1);
				bounds.iconMaxX = (sprite.width >> 1) + x + element.xOffset;
				bounds.iconMinY = y + element.yOffset - (sprite.height >> 1);
			}
		}
		if (type.text != null) {
			if (sprite == null) {
				Static28.method3244(element, x, 0, y, true, bounds, type);
			} else {
				Static28.method3244(element, x, (sprite.height >> 1) + 5, y, false, bounds, type);
			}
		}
		if (bounds.isHovering(Mouse.x, Mouse.y) && type.ops != null) {
			if (type.ops[4] != null) {
				MiniMenu.add(element.id, type.category, 0, type.opBase, type.ops[4], (short) 1011, -1);
			}
			if (type.ops[3] != null) {
				MiniMenu.add(element.id, type.category, 0, type.opBase, type.ops[3], (short) 1003, -1);
			}
			if (type.ops[2] != null) {
				MiniMenu.add(element.id, type.category, 0, type.opBase, type.ops[2], (short) 1008, -1);
			}
			if (type.ops[1] != null) {
				MiniMenu.add(element.id, type.category, 0, type.opBase, type.ops[1], (short) 1002, -1);
			}
			if (type.ops[0] != null) {
				MiniMenu.add(element.id, type.category, 0, type.opBase, type.ops[0], (short) 1012, -1);
			}
		}
		Static3.aClass112_13.addTail(bounds);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!wf;I)V")
	public static void method3812(@OriginalArg(2) Component component, @OriginalArg(0) int parentWidth, @OriginalArg(1) int parentHeight) {
		if (component.xMode == 0) {
			component.x = component.baseX;
		} else if (component.xMode == 1) {
			component.x = component.baseX + (parentWidth - component.width) / 2;
		} else if (component.xMode == 2) {
			component.x = parentWidth - component.baseX - component.width;
		} else if (component.xMode == 3) {
			component.x = component.baseX * parentWidth >> 14;
		} else if (component.xMode == 4) {
			component.x = (component.baseX * parentWidth >> 14) + (parentWidth - component.width) / 2;
		} else {
			component.x = parentWidth - (parentWidth * component.baseX >> 14) - component.width;
		}
		if (component.yMode == 0) {
			component.y = component.baseY;
		} else if (component.yMode == 1) {
			component.y = component.baseY + (parentHeight - component.height) / 2;
		} else if (component.yMode == 2) {
			component.y = parentHeight - component.height - component.baseY;
		} else if (component.yMode == 3) {
			component.y = parentHeight * component.baseY >> 14;
		} else if (component.yMode == 4) {
			component.y = (component.baseY * parentHeight >> 14) + (parentHeight - component.height) / 2;
		} else {
			component.y = parentHeight - (component.baseY * parentHeight >> 14) - component.height;
		}
		if (!Static1.qaOpTest || InterfaceList.getServerActiveProperties(component).events == 0 && component.type != 0) {
			return;
		}
		if (component.y < 0) {
			component.y = 0;
		} else if (component.height + component.y > parentHeight) {
			component.y = parentHeight - component.height;
		}
		if (component.x < 0) {
			component.x = 0;
		} else if (parentWidth < component.x + component.width) {
			component.x = parentWidth - component.width;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method4436() {
		@Pc(5) String hostname = "www";
		if (client.modeWhere != 0) {
			hostname = "www-wtqa";
		}
		@Pc(12) String settings = "";
		if (client.settings != null) {
			settings = "/p=" + client.settings;
		}
		return "http://" + hostname + ".openrs2.org/l=" + client.language + "/a=" + client.affiliate + settings + "/";
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIIII)I")
	public static int method4443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = arg2 & 0xF;
		@Pc(32) int local32 = local9 >= 4 ? (local9 == 12 || local9 == 14 ? arg1 : arg3) : arg0;
		@Pc(39) int local39 = local9 < 8 ? arg1 : arg0;
		return ((local9 & 0x2) == 0 ? local32 : -local32) + ((local9 & 0x1) == 0 ? local39 : -local39);
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

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static2.anInt902 && arg5 <= Static3.anInt2553 && Static4.anInt3086 <= arg6 && arg4 <= Static5.anInt4230) {
			Static9.method758(arg1, arg5, arg6, arg0, arg4, arg2, arg3);
		} else {
			Static22.method2190(arg4, arg3, arg2, arg1, arg0, arg5, arg6);
		}
	}

}

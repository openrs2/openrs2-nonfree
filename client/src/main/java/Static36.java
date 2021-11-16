import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!wf;)Z")
	public static boolean method4402(@OriginalArg(1) Component component) {
		if (component.anInt5904 == 205) {
			Static1.anInt885 = 250;
			return true;
		} else {
			return false;
		}
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
	public static String getWebsiteUrl() {
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
		for (@Pc(12) int level = 0; level < 4; level++) {
			for (@Pc(17) int x = 0; x < 104; x++) {
				for (@Pc(24) int z = 0; z < 104; z++) {
					Static1.aByteArrayArrayArray2[level][x][z] = arg0;
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

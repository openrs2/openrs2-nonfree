import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method2001() {
		Protocol.outboundBuffer.writeOpcode(86);
		Protocol.outboundBuffer.writeByte(Static11.getWindowMode());
		Protocol.outboundBuffer.writeShort(GameShell.canvasWidth);
		Protocol.outboundBuffer.writeShort(GameShell.canvasHeight);
		Protocol.outboundBuffer.writeByte(Static2.anInt1125);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (@Pc(110) int local110 = arg1; local110 <= arg2; local110++) {
				for (@Pc(115) int local115 = arg3; local115 <= arg4; local115++) {
					if (SceneGraph.anIntArrayArrayArray3[arg0][local110][local115] == -Static2.anInt1871) {
						return false;
					}
				}
			}
			@Pc(140) int local140 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = SceneGraph.tileHeights[arg0][arg1][arg3] + arg5;
			if (!Static33.method4119(local140, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static33.method4119(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static33.method4119(local140, local156, local182)) {
				return false;
			} else if (Static33.method4119(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static11.method508(arg0, arg1, arg3)) {
			@Pc(16) int local16 = arg1 << 7;
			@Pc(20) int local20 = arg3 << 7;
			return Static33.method4119(local16 + 1, SceneGraph.tileHeights[arg0][arg1][arg3] + arg5, local20 + 1) && Static33.method4119(local16 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static33.method4119(local16 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static33.method4119(local16 + 1, SceneGraph.tileHeights[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLclient!wf;I)V")
	public static void method2008(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		if (MiniMenu.size < 2 && MiniMenu.anInt1334 == 0 && !Static3.aBoolean177) {
			return;
		}
		@Pc(26) String local26 = MiniMenu.method4328();
		if (arg1 == null) {
			@Pc(43) int local43 = Fonts.b12Full.method2263(local26, arg0 + 4, arg2 + 15, client.random, client.seed);
			Static8.method66(local43 + Fonts.b12Full.getStringWidth(local26), 15, arg0 + 4, arg2);
			return;
		}
		@Pc(62) Font font = arg1.getFont(Sprites.nameIcons);
		if (font == null) {
			font = Fonts.b12Full;
		}
		font.method2269(local26, arg0, arg2, arg1.width, arg1.height, arg1.color, arg1.graphicShadow, arg1.textHorizontalAlignment, arg1.textVerticalAlignment, client.random, client.seed, Static7.anIntArray600);
		Static8.method66(Static7.anIntArray600[2], Static7.anIntArray600[3], Static7.anIntArray600[0], Static7.anIntArray600[1]);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
	public static void method2009(@OriginalArg(0) boolean underwater) {
		@Pc(11) byte levels;
		@Pc(13) byte[][] bytes;
		if (GlRenderer.enabled && underwater) {
			levels = 1;
			bytes = Static7.underwaterMapBytes;
		} else {
			levels = 4;
			bytes = Static1.mapBytes;
		}
		@Pc(22) int maps = bytes.length;
		for (@Pc(24) int i = 0; i < maps; i++) {
			@Pc(33) int[] local33 = null;
			@Pc(39) int mapX = Static7.mapSquares[i] >> 8;
			@Pc(43) byte[] mapBytes = bytes[i];
			@Pc(49) int mapZ = Static7.mapSquares[i] & 0xFF;
			@Pc(56) int x = mapX * 64 - Static5.originX;
			@Pc(63) int z = mapZ * 64 - Static7.originZ;
			if (mapBytes != null) {
				Static9.audioLoop();
				local33 = Static34.readMap(underwater, PathFinder.collisionMaps, Static7.originZ, z, x, Static5.originX, mapBytes);
			}
			if (!underwater && Static4.centralZoneX / 8 == mapX && mapZ == Static1.centralZoneZ / 8) {
				if (local33 == null) {
					Static6.anInt4863 = -1;
				} else {
					Static6.anInt4863 = local33[0];
					Static5.anInt4303 = local33[3];
					Static1.anInt466 = local33[2];
					Static4.anInt5826 = local33[1];
					Static5.anInt3774 = local33[4];
				}
			}
		}
		for (@Pc(131) int i = 0; i < maps; i++) {
			@Pc(144) int z = (Static7.mapSquares[i] & 0xFF) * 64 - Static7.originZ;
			@Pc(154) int x = (Static7.mapSquares[i] >> 8) * 64 - Static5.originX;
			@Pc(158) byte[] mapBytes = bytes[i];
			if (mapBytes == null && Static1.centralZoneZ < 800) {
				Static9.audioLoop();
				for (@Pc(169) int level = 0; level < levels; level++) {
					Static29.method3536(x, level, 64, z, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII)V")
	public static void method3284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class184 local3 = new Class184();
		local3.anInt5867 = arg1 / 128;
		local3.anInt5858 = arg2 / 128;
		local3.anInt5876 = arg3 / 128;
		local3.anInt5870 = arg4 / 128;
		local3.anInt5866 = arg0;
		local3.anInt5862 = arg1;
		local3.anInt5877 = arg2;
		local3.anInt5860 = arg3;
		local3.anInt5879 = arg4;
		local3.anInt5872 = arg5;
		local3.anInt5881 = arg6;
		SceneGraph.aClass184Array13[SceneGraph.anInt1742++] = local3;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIII)V")
	public static void method2050(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (InterfaceList.load(arg2)) {
			Static31.method3660(InterfaceList.components[arg2], arg0, arg1, -1, arg3);
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
	public static void method2062() {
		for (@Pc(6) SubInterface subInterface = (SubInterface) InterfaceList.subInterfaces.head(); subInterface != null; subInterface = (SubInterface) InterfaceList.subInterfaces.next()) {
			@Pc(11) int interfaceId = subInterface.id;
			if (InterfaceList.load(interfaceId)) {
				@Pc(17) boolean if3 = true;
				@Pc(21) Component[] components = InterfaceList.components[interfaceId];
				for (@Pc(23) int i = 0; i < components.length; i++) {
					if (components[i] != null) {
						if3 = components[i].if3;
						break;
					}
				}
				if (!if3) {
					@Pc(50) int componentId = (int) subInterface.key;
					@Pc(54) Component component = InterfaceList.getComponent(componentId);
					if (component != null) {
						Static28.method3270(component);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V")
	public static void method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static1.anInt525 = arg3;
		Static5.anInt3731 = arg4;
		Static6.anInt4558 = arg2;
		Static6.anInt4403 = arg0;
		Static4.anInt3258 = arg1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII)V")
	public static void method2081(@OriginalArg(0) int targetMask, @OriginalArg(1) int targetParam, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Component component = InterfaceList.getCreatedComponent(arg5, arg3);
		if (component != null && component.onTargetEnter != null) {
			@Pc(15) HookRequest hookRequest = new HookRequest();
			hookRequest.arguments = component.onTargetEnter;
			hookRequest.source = component;
			ScriptRunner.method2019(hookRequest);
		}
		Static3.aBoolean177 = true;
		Static7.anInt6050 = arg2;
		Static5.anInt4224 = targetParam;
		Static2.anInt1367 = arg3;
		Static6.anInt4466 = arg4;
		Static1.anInt1053 = arg5;
		Static5.anInt3560 = targetMask;
		Static28.method3270(component);
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "([I[IIIIIIII)V")
	public static void method2182(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) int local2 = -arg4;
		for (@Pc(5) int local5 = -arg5; local5 < 0; local5++) {
			for (@Pc(9) int local9 = local2; local9 < 0; local9++) {
				@Pc(16) int local16 = arg1[arg2++];
				@Pc(20) int local20 = local16 >>> 24;
				if (local20 == 0) {
					arg3++;
				} else {
					@Pc(26) int local26 = 256 - local20;
					@Pc(30) int local30 = arg0[arg3];
					arg0[arg3++] = ((local16 & 0xFF00FF) * local20 + (local30 & 0xFF00FF) * local26 & 0xFF00FF00) + ((local16 & 0xFF00) * local20 + (local30 & 0xFF00) * local26 & 0xFF0000) >>> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "([I[IIIIIIII)V")
	public static void method2183(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) int local2 = -arg4;
		for (@Pc(5) int local5 = -arg5; local5 < 0; local5++) {
			for (@Pc(9) int local9 = local2; local9 < 0; local9++) {
				@Pc(16) int local16 = arg1[arg2--];
				@Pc(20) int local20 = local16 >>> 24;
				if (local20 == 0) {
					arg3++;
				} else {
					@Pc(26) int local26 = 256 - local20;
					@Pc(30) int local30 = arg0[arg3];
					arg0[arg3++] = ((local16 & 0xFF00FF) * local20 + (local30 & 0xFF00FF) * local26 & 0xFF00FF00) + ((local16 & 0xFF00) * local20 + (local30 & 0xFF00) * local26 & 0xFF0000) >>> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "([I[IIIIIIIIIII)V")
	public static void method2184(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * arg10;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				@Pc(25) int local25 = arg1[(arg2 >> 16) + local12];
				@Pc(29) int local29 = local25 >>> 24;
				if (local29 == 0) {
					arg4++;
				} else {
					@Pc(35) int local35 = 256 - local29;
					@Pc(39) int local39 = arg0[arg4];
					arg0[arg4++] = ((local25 & 0xFF00FF) * local29 + (local39 & 0xFF00FF) * local35 & 0xFF00FF00) + ((local25 & 0xFF00) * local29 + (local39 & 0xFF00) * local35 & 0xFF0000) >>> 8;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "([I[IIIIIIIIIIII)V")
	public static void method2185(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * arg10;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				@Pc(25) int local25 = arg1[(arg2 >> 16) + local12];
				@Pc(29) int local29 = arg0[arg4];
				@Pc(37) int local37 = (local25 >>> 24) * arg11 >> 8;
				@Pc(41) int local41 = 256 - local37;
				arg0[arg4++] = ((local25 & 0xFF00FF) * local37 + (local29 & 0xFF00FF) * local41 & 0xFF00FF00) + ((local25 & 0xFF00) * local37 + (local29 & 0xFF00) * local41 & 0xFF0000) >>> 8;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}
}

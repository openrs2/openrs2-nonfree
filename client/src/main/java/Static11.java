import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
	public static boolean method508(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) int local7 = SceneGraph.anIntArrayArrayArray3[level][x][z];
		if (local7 == -Static2.anInt1871) {
			return false;
		} else if (local7 == Static2.anInt1871) {
			return true;
		} else {
			@Pc(22) int xFine = x << 7;
			@Pc(26) int zFine = z << 7;
			if (Static33.method4119(xFine + 1, SceneGraph.tileHeights[level][x][z], zFine + 1) && Static33.method4119(xFine + 128 - 1, SceneGraph.tileHeights[level][x + 1][z], zFine + 1) && Static33.method4119(xFine + 128 - 1, SceneGraph.tileHeights[level][x + 1][z + 1], zFine + 128 - 1) && Static33.method4119(xFine + 1, SceneGraph.tileHeights[level][x][z + 1], zFine + 128 - 1)) {
				SceneGraph.anIntArrayArrayArray3[level][x][z] = Static2.anInt1871;
				return true;
			} else {
				SceneGraph.anIntArrayArrayArray3[level][x][z] = -Static2.anInt1871;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method516() {
		SceneGraph.clear();
		MiniMap.clear();
		client.clear();
		SkyBoxCube.cache.clear();
		LocType.aClass96_1 = new Class96();
		((Js5GlTextureProvider) Rasteriser.textureProvider).clear();
		Static13.method1027();
		LightingManager.lights = new Light[255];
		LightingManager.lightCount = 0;
		Static32.method3876();
		Static14.method1211();
		Sprites.clear();
		WorldMap.clear(false);
		TitleScreen.clear();
		Static20.method1929();
		for (@Pc(42) int i = 0; i < 2048; i++) {
			@Pc(51) Player player = PlayerList.players[i];
			if (player != null) {
				player.attachment = null;
			}
		}
		if (GlRenderer.enabled) {
			Static14.method1205();
			Static10.setHdrEnabled(Preferences.hdr);
			ParticleSystem.load();
		}
		Fonts.load(client.js5Archive8, client.js5Archive13);
		Sprites.load(client.js5Archive8);
		Static6.aClass4_Sub3_Sub14_5 = null;
		Static6.aClass4_Sub3_Sub14_8 = null;
		Static2.aClass4_Sub3_Sub14_2 = null;
		Static7.aClass4_Sub3_Sub14_9 = null;
		Static1.aClass4_Sub3_Sub14_1 = null;
		if (Static4.anInt3304 == 5) {
			TitleScreen.load(client.js5Archive8);
		}
		if (Static4.anInt3304 == 10) {
			method605(false);
		}
		if (Static4.anInt3304 == 30) {
			Static9.method233(25);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([[FIBIII[[FIBBLclient!ih;Z[[F[[III)V")
	public static void method521(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7, @OriginalArg(9) byte arg8, @OriginalArg(10) GroundModel arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(7) int local7 = (arg1 << 8) + 255;
		@Pc(13) int local13 = (arg6 << 8) + 255;
		@Pc(23) int local23 = (arg4 << 8) + 255;
		@Pc(29) int local29 = (arg3 << 8) + 255;
		@Pc(39) int[] local39 = null;
		@Pc(43) int[] local43 = Static1.anIntArrayArray5[arg7];
		@Pc(49) int[] local49 = new int[local43.length >> 1];
		for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
			local49[local51] = Static37.method4757(arg5, local43[local51 + local51 + 1], arg14, arg12, arg11, null, arg9, local7, arg13, false, 0.0F, arg0, arg8, local43[local51 + local51], local29, local23, local13);
		}
		if (arg10) {
			if (arg7 == 1) {
				local39 = new int[6];
				@Pc(178) int local178 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				@Pc(199) int local199 = Static37.method4757(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[2] = local49[2];
				local39[0] = local199;
				local39[5] = local49[2];
				local39[3] = local178;
				local39[1] = local178;
				local39[4] = local49[0];
			} else if (arg7 == 2) {
				@Pc(251) int local251 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39 = new int[6];
				@Pc(275) int local275 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				local39[1] = local275;
				local39[3] = local251;
				local39[4] = local49[1];
				local39[0] = local49[0];
				local39[2] = local251;
				local39[5] = local49[0];
			} else if (arg7 == 3) {
				local39 = new int[6];
				@Pc(330) int local330 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				@Pc(351) int local351 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				local39[1] = local49[1];
				local39[4] = local351;
				local39[0] = local49[2];
				local39[3] = local330;
				local39[2] = local330;
				local39[5] = local49[2];
			} else if (arg7 == 4) {
				local39 = new int[3];
				@Pc(406) int local406 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local39[0] = local49[3];
				local39[1] = local406;
				local39[2] = local49[0];
			} else if (arg7 == 5) {
				@Pc(444) int local444 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39 = new int[] { local49[2], local444, local49[3] };
			} else if (arg7 == 6) {
				local39 = new int[6];
				@Pc(488) int local488 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				@Pc(509) int local509 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[1] = local488;
				local39[0] = local49[3];
				local39[4] = local49[0];
				local39[3] = local509;
				local39[2] = local509;
				local39[5] = local49[3];
			} else if (arg7 == 7) {
				local39 = new int[6];
				@Pc(564) int local564 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				@Pc(585) int local585 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[2] = local564;
				local39[0] = local49[1];
				local39[3] = local564;
				local39[4] = local49[2];
				local39[1] = local585;
				local39[5] = local49[1];
			} else if (arg7 == 8) {
				local39 = new int[3];
				@Pc(640) int local640 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local39[0] = local49[3];
				local39[1] = local640;
				local39[2] = local49[4];
			} else if (arg7 == 9) {
				@Pc(678) int local678 = Static37.method4757(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				@Pc(699) int local699 = Static37.method4757(arg5, 32, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 96, local29, local23, local13);
				@Pc(720) int local720 = Static37.method4757(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				local39 = new int[] { local699, local678, local49[4], local699, local49[4], local49[3], local699, local49[3], local49[2], local699, local49[2], local49[1], local699, local49[1], local720 };
			} else if (arg7 == 10) {
				local39 = new int[9];
				@Pc(824) int local824 = Static37.method4757(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local39[0] = local49[2];
				local39[7] = local824;
				local39[4] = local824;
				local39[6] = local49[4];
				local39[8] = local49[0];
				local39[2] = local49[3];
				local39[1] = local824;
				local39[5] = local49[4];
				local39[3] = local49[3];
			} else if (arg7 == 11) {
				local39 = new int[12];
				@Pc(897) int local897 = Static37.method4757(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				@Pc(918) int local918 = Static37.method4757(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[0] = local49[3];
				local39[11] = local918;
				local39[3] = local49[3];
				local39[7] = local918;
				local39[1] = local897;
				local39[10] = local49[1];
				local39[5] = local897;
				local39[8] = local897;
				local39[2] = local49[0];
				local39[9] = local49[2];
				local39[4] = local49[2];
				local39[6] = local49[2];
			}
		}
		arg9.addTile(arg2, arg13, arg14, local49, local39, false);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILclient!wf;II)V")
	public static void method526(@OriginalArg(2) Component component, @OriginalArg(1) int parentWidth, @OriginalArg(3) int parentHeight, @OriginalArg(0) boolean arg0) {
		@Pc(13) int prevHeight = component.height;
		if (component.heightMode == 0) {
			component.height = component.baseHeight;
		} else if (component.heightMode == 1) {
			component.height = parentHeight - component.baseHeight;
		} else if (component.heightMode == 2) {
			component.height = parentHeight * component.baseHeight >> 14;
		} else if (component.heightMode == 3) {
			if (component.type == 2) {
				component.height = component.anInt5964 * (component.baseHeight - 1) + component.baseHeight * 32;
			} else if (component.type == 7) {
				component.height = component.baseHeight * 12 + (component.baseHeight - 1) * component.anInt5964;
			}
		}
		@Pc(108) int prevWidth = component.width;
		if (component.widthMode == 0) {
			component.width = component.baseWidth;
		} else if (component.widthMode == 1) {
			component.width = parentWidth - component.baseWidth;
		} else if (component.widthMode == 2) {
			component.width = parentWidth * component.baseWidth >> 14;
		} else if (component.widthMode == 3) {
			if (component.type == 2) {
				component.width = (component.baseWidth - 1) * component.anInt5943 + component.baseWidth * 32;
			} else if (component.type == 7) {
				component.width = component.baseWidth * 115 + component.anInt5943 * (component.baseWidth - 1);
			}
		}
		if (component.widthMode == 4) {
			component.width = component.aspectRatioHeight * component.height / component.aspectRatioWidth;
		}
		if (component.heightMode == 4) {
			component.height = component.aspectRatioWidth * component.width / component.aspectRatioHeight;
		}
		if (Static1.qaOpTest && (InterfaceList.getServerActiveProperties(component).events != 0 || component.type == 0)) {
			if (component.height < 5 && component.width < 5) {
				component.height = 5;
				component.width = 5;
			} else {
				if (component.height <= 0) {
					component.height = 5;
				}
				if (component.width <= 0) {
					component.width = 5;
				}
			}
		}
		if (component.anInt5904 == 1337) {
			Static3.aClass185_5 = component;
		}
		if (arg0 && component.onResize != null && (prevWidth != component.width || prevHeight != component.height)) {
			@Pc(298) HookRequest request = new HookRequest();
			request.arguments = component.onResize;
			request.source = component;
			InterfaceList.lowPriorityRequests.addTail(request);
		}
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)I")
	public static int getWindowMode() {
		if (GameShell.fullScreenFrame != null) {
			return 3;
		} else if (GlRenderer.enabled && Static4.aBoolean184) {
			return 2;
		} else if (GlRenderer.enabled && !Static4.aBoolean184) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method559() {
		client.instance.loadMiscNatives();
		GameShell.focus = true;
		Static3.anInt2235 = 0;
		Static7.prevFocus = true;
		MouseRecorder.instance.samples = 0;
		Static1.prevClickTime = 0L;
		ReflectionCheck.clear();
		Static1.anInt885 = 0;
		Protocol.opcode1 = -1;
		Static5.rebootTimer = 0;
		Protocol.opcode2 = -1;
		Protocol.outboundBuffer.position = 0;
		Protocol.opcode3 = -1;
		Static3.anInt2583 = 0;
		Protocol.opcode = -1;
		Protocol.inboundBuffer.position = 0;
		for (@Pc(45) int i = 0; i < HintArrowManager.HINT_ARROWS.length; i++) {
			HintArrowManager.HINT_ARROWS[i] = null;
		}
		Static1.aBoolean17 = false;
		MiniMenu.size = 0;
		Mouse.setIdleLoops(0);
		for (@Pc(3667) int i = 0; i < 100; i++) {
			Chat.messages[i] = null;
		}
		Static6.anInt4761 = (int) (Math.random() * 30.0D) - 20;
		Static1.anInt548 = (int) (Math.random() * 100.0D) - 50;
		Camera.yawOffset = (int) (Math.random() * 120.0D) - 60;
		Chat.size = 0;
		Camera.yaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static1.anInt242 = (int) (Math.random() * 80.0D) - 40;
		Static3.aBoolean177 = false;
		MiniMenu.anInt1334 = 0;
		Static1.anInt837 = (int) (Math.random() * 110.0D) - 55;
		SoundPlayer.size = 0;
		MiniMap.reset();
		PlayerList.size = 0;
		NpcList.size = 0;
		for (@Pc(3740) int i = 0; i < 2048; i++) {
			PlayerList.players[i] = null;
			PlayerList.appearanceCache[i] = null;
		}
		for (@Pc(3756) int i = 0; i < 32768; i++) {
			NpcList.npcs[i] = null;
		}
		PlayerList.self = PlayerList.players[2047] = new Player();
		Static1.projAnims.clear();
		Static2.spotAnims.clear();
		if (Static4.objStacks != null) {
			for (@Pc(3787) int level = 0; level < 4; level++) {
				for (@Pc(3794) int x = 0; x < 104; x++) {
					for (@Pc(3801) int z = 0; z < 104; z++) {
						Static4.objStacks[level][x][z] = null;
					}
				}
			}
		}
		ChangeLocRequest.queue = new LinkedList();
		FriendsList.state = 0;
		FriendsList.size = 0;
		VarpDomain.clear();
		DelayedStateChange.clear();
		Static1.anInt212 = 0;
		Static3.anInt2497 = 0;
		Static5.anInt3490 = 0;
		Static7.anInt5236 = 0;
		Static5.anInt3572 = 0;
		Static4.anInt3302 = 0;
		Static4.anInt2977 = 0;
		Static4.anInt3131 = 0;
		Static5.anInt4165 = 0;
		Static6.anInt4838 = 0;
		for (@Pc(3857) int i = 0; i < VarcDomain.varcs.length; i++) {
			VarcDomain.varcs[i] = -1;
		}
		if (InterfaceList.topLevelInterface != -1) {
			InterfaceList.discard(InterfaceList.topLevelInterface);
		}
		for (@Pc(3886) SubInterface subInterface = (SubInterface) InterfaceList.subInterfaces.head(); subInterface != null; subInterface = (SubInterface) InterfaceList.subInterfaces.next()) {
			InterfaceList.closeSubInterface(subInterface, true);
		}
		InterfaceList.topLevelInterface = -1;
		InterfaceList.subInterfaces = new HashTable(8);
		InterfaceList.clear();
		Static6.aClass185_14 = null;
		MiniMenu.size = 0;
		Static1.aBoolean17 = false;
		PlayerAppearance.DEFAULT.set(-1, null, -1, new int[] { 0, 0, 0, 0, 0 }, false);
		for (@Pc(3945) int i = 0; i < 8; i++) {
			Player.ops[i] = null;
			Player.opLowPriority[i] = false;
			Player.opCursors[i] = -1;
		}
		Inv.deleteAll();
		Static3.aBoolean366 = true;
		for (@Pc(3969) int i = 0; i < 100; i++) {
			Static2.aBooleanArray8[i] = true;
		}
		ClanChat.members = null;
		ClanChat.name = null;
		ClanChat.size = 0;
		for (@Pc(3987) int i = 0; i < 6; i++) {
			StockMarketManager.offers[i] = new StockMarketOffer();
		}
		for (@Pc(4001) int i = 0; i < 25; i++) {
			PlayerSkillXpTable.boostedLevels[i] = 0;
			PlayerSkillXpTable.baseLevels[i] = 0;
			PlayerSkillXpTable.experience[i] = 0;
		}
		if (GlRenderer.enabled) {
			Static17.method1655();
		}
		ScriptRunner.recolorPalette = LocType.recolorPalette = NpcType.recolorPalette = ObjType.recolorPalette = new short[256];
		Static2.aBoolean119 = false;
		Static5.aBoolean248 = true;
		Protocol.verifyId = 0;
		MiniMenu.walkHereOp = LocalisedText.WALKHERE;
		Static36.method4447();
		Static7.aBoolean389 = false;
		Static21.method2001();
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)I")
	public static int method561() {
		if (Static2.aBoolean119) {
			return 0;
		} else if (SceneGraph.isAllLevelsVisible()) {
			return Preferences.roofsVisible ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIII)V")
	public static void method565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		ArrayUtils.fillRange(Static5.anIntArrayArray36[arg0], arg1 - arg2, arg2 + arg1, arg3);
		@Pc(20) int local20 = 0;
		@Pc(33) int local33 = arg2;
		@Pc(36) int local36 = -arg2;
		@Pc(38) int local38 = -1;
		while (local33 > local20) {
			local38 += 2;
			local20++;
			local36 += local38;
			if (local36 >= 0) {
				local33--;
				local36 -= local33 << 1;
				@Pc(69) int[] local69 = Static5.anIntArrayArray36[arg0 - local33];
				@Pc(76) int[] local76 = Static5.anIntArrayArray36[arg0 + local33];
				@Pc(80) int local80 = arg1 - local20;
				@Pc(84) int local84 = arg1 + local20;
				ArrayUtils.fillRange(local76, local80, local84, arg3);
				ArrayUtils.fillRange(local69, local80, local84, arg3);
			}
			@Pc(101) int local101 = arg1 + local33;
			@Pc(106) int local106 = arg1 - local33;
			@Pc(112) int[] local112 = Static5.anIntArrayArray36[arg0 + local20];
			@Pc(118) int[] local118 = Static5.anIntArrayArray36[arg0 - local20];
			ArrayUtils.fillRange(local112, local106, local101, arg3);
			ArrayUtils.fillRange(local118, local106, local101, arg3);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z[BIII[Lclient!ch;)V")
	public static void readMapLocs(@OriginalArg(0) boolean underwater, @OriginalArg(1) byte[] bytes, @OriginalArg(3) int destZ, @OriginalArg(4) int destX, @OriginalArg(5) CollisionMap[] collisionMaps) {
		@Pc(10) Buffer buffer = new Buffer(bytes);
		@Pc(20) int id = -1;
		while (true) {
			@Pc(24) int idDelta = buffer.readUnsignedMultiSmart();
			if (idDelta == 0) {
				return;
			}
			id += idDelta;
			@Pc(37) int position = 0;
			while (true) {
				@Pc(41) int positionDelta = buffer.readUnsignedShortSmart();
				if (positionDelta == 0) {
					break;
				}
				position += positionDelta - 1;
				@Pc(56) int z = position & 0x3F;
				@Pc(62) int x = position >> 6 & 0x3F;
				@Pc(66) int shapeAndAngle = buffer.readUnsignedByte();
				@Pc(70) int angle = shapeAndAngle & 0x3;
				@Pc(74) int shape = shapeAndAngle >> 2;
				@Pc(79) int x2 = x + destX;
				@Pc(84) int z2 = z + destZ;
				@Pc(88) int level = position >> 12;
				if (x2 > 0 && z2 > 0 && x2 < 103 && z2 < 103) {
					@Pc(104) CollisionMap collisionMap = null;
					if (!underwater) {
						@Pc(108) int collisionLevel = level;
						if ((Static4.tileFlags[1][x2][z2] & 0x2) == 2) {
							collisionLevel = level - 1;
						}
						if (collisionLevel >= 0) {
							collisionMap = collisionMaps[collisionLevel];
						}
					}
					SceneGraph.setLoc(level, level, x2, z2, id, shape, angle, collisionMap, underwater, !underwater);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	public static void method605(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (InterfaceList.topLevelInterface != -1) {
				InterfaceList.discard(InterfaceList.topLevelInterface);
			}
			for (@Pc(15) SubInterface subInterface = (SubInterface) InterfaceList.subInterfaces.head(); subInterface != null; subInterface = (SubInterface) InterfaceList.subInterfaces.next()) {
				InterfaceList.closeSubInterface(subInterface, true);
			}
			InterfaceList.topLevelInterface = -1;
			InterfaceList.subInterfaces = new HashTable(8);
			InterfaceList.clear();
			InterfaceList.topLevelInterface = InterfaceList.loginScreenId;
			Static12.method777(false);
			Static13.method933();
			Static14.method1102(InterfaceList.topLevelInterface);
		}
		Static7.anInt6050 = -1;
		Cursor.setCursor(Static4.anInt3407);
		PlayerList.self = new Player();
		PlayerList.self.zFine = 3000;
		PlayerList.self.xFine = 3000;
		if (!GlRenderer.enabled && client.game == 0) {
			Flames.method2005(client.js5Archive8);
			Static9.method233(10);
			return;
		}
		if (Static1.anInt772 == 2) {
			Static3.anInt2519 = Static4.anInt2977 << 7;
			Static7.anInt5678 = Static5.anInt4165 << 7;
		} else {
			Camera.method1496();
		}
		if (GlRenderer.enabled) {
			Static17.method1655();
		}
		Static28.method3322();
		Static9.method233(28);
	}

}

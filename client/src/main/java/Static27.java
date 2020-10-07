import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ic;Lclient!oh;B)Lclient!ih;")
	public static Class4_Sub12 method4237(@OriginalArg(0) HashTable arg0, @OriginalArg(1) FloType arg1) {
		@Pc(27) long local27 = ((long) arg1.anInt3868 << 56) + ((long) arg1.anInt3874 << 32) + (long) (arg1.anInt3876 + (arg1.anInt3877 + 1 << 16));
		@Pc(39) Class4_Sub12 local39 = (Class4_Sub12) arg0.get(local27);
		if (local39 == null) {
			local39 = new Class4_Sub12(arg1.anInt3877, (float) arg1.anInt3876, true, false, arg1.anInt3874);
			arg0.put(local27, local39);
		}
		return local39;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method4239() {
		Static5.anInt5206 = 0;
		Static3.aBoolean147 = false;
		Static3.anInt2140 = 0;
		Static4.anInt3020 = -1;
		Static6.anInt4506 = 0;
		Static1.aByte1 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIIII)V")
	public static void method4241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static5.anInt4230 < arg2 || Static4.anInt3086 > arg1) {
			return;
		}
		@Pc(23) boolean local23;
		if (Static2.anInt902 > arg4) {
			arg4 = Static2.anInt902;
			local23 = false;
		} else if (arg4 > Static3.anInt2553) {
			arg4 = Static3.anInt2553;
			local23 = false;
		} else {
			local23 = true;
		}
		@Pc(51) boolean local51;
		if (arg0 < Static2.anInt902) {
			arg0 = Static2.anInt902;
			local51 = false;
		} else if (Static3.anInt2553 < arg0) {
			arg0 = Static3.anInt2553;
			local51 = false;
		} else {
			local51 = true;
		}
		@Pc(71) int local71;
		if (Static4.anInt3086 <= arg2) {
			local71 = arg2 + 1;
			Static18.method1656(Static5.anIntArrayArray36[arg2], arg3, arg4, arg0);
		} else {
			local71 = Static4.anInt3086;
		}
		@Pc(89) int local89;
		if (Static5.anInt4230 < arg1) {
			local89 = Static5.anInt4230;
		} else {
			local89 = arg1 - 1;
			Static18.method1656(Static5.anIntArrayArray36[arg1], arg3, arg4, arg0);
		}
		if (local23 && local51) {
			for (@Pc(106) int local106 = local71; local106 <= local89; local106++) {
				@Pc(113) int[] local113 = Static5.anIntArrayArray36[local106];
				local113[arg4] = local113[arg0] = arg3;
			}
		} else if (local23) {
			for (@Pc(149) int local149 = local71; local149 <= local89; local149++) {
				Static5.anIntArrayArray36[local149][arg4] = arg3;
			}
		} else if (local51) {
			for (@Pc(133) int local133 = local71; local133 <= local89; local133++) {
				Static5.anIntArrayArray36[local133][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method4243(@OriginalArg(1) int arg0) {
		if (InterfaceList.load(arg0)) {
			Static29.method3495(InterfaceList.components[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z")
	public static boolean setBuildArea(@OriginalArg(1) int buildArea) {
		if (Static7.buildArea == buildArea) {
			return false;
		}
		PathFinder.costs = new int[104][104];
		PathFinder.parents = new int[104][104];
		Static7.zones = new int[4][13][13];
		Static1.anIntArrayArray2 = new int[104][104];
		for (@Pc(36) int y = 0; y < 4; y++) {
			PathFinder.collisionMaps[y] = new CollisionMap(104, 104);
		}
		Static4.tileFlags = new byte[4][104][104];
		Static1.aByteArrayArrayArray2 = new byte[4][104][104];
		Static4.objStacks = new LinkedList[4][104][104];
		if (GlRenderer.enabled) {
			LightingManager.method3109();
			Static14.method1205();
			Static5.aClass187ArrayArray1 = new Class187[13][13];
		}
		Static7.buildArea = buildArea;
		return true;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3185(@OriginalArg(1) String arg0) {
		if (LoginManager.staffModLevel >= 2) {
			if (arg0.equalsIgnoreCase("::gc")) {
				method4709();
				for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				@Pc(29) Runtime local29 = Runtime.getRuntime();
				@Pc(38) int local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static26.method4357(null, 0, "mem=" + local38 + "k");
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				method4709();
				for (@Pc(60) int local60 = 0; local60 < 10; local60++) {
					System.gc();
				}
				@Pc(69) Runtime local69 = Runtime.getRuntime();
				@Pc(79) int local79 = (int) ((local69.totalMemory() - local69.freeMemory()) / 1024L);
				Static26.method4357(null, 0, "Memory before cleanup=" + local79 + "k");
				Static24.method2567();
				method4709();
				for (@Pc(99) int local99 = 0; local99 < 10; local99++) {
					System.gc();
				}
				@Pc(115) int local115 = (int) ((local69.totalMemory() - local69.freeMemory()) / 1024L);
				Static26.method4357(null, 0, "Memory after cleanup=" + local115 + "k");
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static26.method4357(null, 0, "Number of player models in cache:" + Static15.method1228());
			}
			if (GlRenderer.enabled && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + GlCleaner.onCardGeometry);
				System.out.println("oncard_2d:" + GlCleaner.onCard2d);
				System.out.println("oncard_texture:" + GlCleaner.onCardTexture);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static23.method2455();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				client.js5NetQueue.quit();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				client.js5NetQueue.closeServer();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				GameShell.signLink.breakConnection();
				Protocol.socket.breakConnection();
				client.js5NetQueue.breakConnection();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				GameShell.replaceCanvas = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static9.method233(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static3.aBoolean176 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static3.aBoolean176 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static35.method4512(false, 0, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static35.method4512(false, 1, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static35.method4512(false, 2, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static35.method4512(false, 3, 1024, 768);
			}
			if (arg0.startsWith("::setba")) {
				Preferences.buildArea = StringUtils.parseInt(arg0.substring(8));
				Preferences.write(GameShell.signLink);
				Preferences.sentToServer = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Preferences.setParticles(StringUtils.parseInt(arg0.substring(15)));
				Preferences.write(GameShell.signLink);
				Preferences.sentToServer = false;
			}
			if (arg0.startsWith("::fps ") && client.modeWhere != 0) {
				GameShell.setFramesPerSecond(StringUtils.parseInt(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static1.anInt268 = StringUtils.parseInt(arg0.substring(12).trim());
				Static26.method4357(null, 0, "rect_debug=" + Static1.anInt268);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static1.aBoolean26 = true;
			}
			if (arg0.startsWith("::hdr") && GlRenderer.enabled && !Static10.method300(!Static13.method881())) {
				Static26.method4357(null, 0, "Failed to enable hdr");
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static6.aBoolean258) {
					Static6.aBoolean258 = false;
					Static26.method4357(null, 0, "Forced tweening disabled.");
				} else {
					Static6.aBoolean258 = true;
					Static26.method4357(null, 0, "Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static2.aBoolean68) {
					System.out.println("Shift-click disabled.");
					Static2.aBoolean68 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static2.aBoolean68 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static26.method4357(null, 0, "x:" + (PlayerList.self.x >> 7) + " z:" + (PlayerList.self.z >> 7) + " groundh:" + Terrain.tileHeights[Static7.y][PlayerList.self.x >> 7][PlayerList.self.z >> 7]);
			}
			if (arg0.equalsIgnoreCase("::getheight")) {
				Static26.method4357(null, 0, "Height: " + Terrain.tileHeights[Static7.y][PlayerList.self.x >> 7][PlayerList.self.z >> 7]);
			}
		}
		Protocol.outboundBuffer.writeOpcode(216);
		Protocol.outboundBuffer.writeByte(arg0.length() - 1);
		Protocol.outboundBuffer.writeString(arg0.substring(2));
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(III)V")
	public static void method3186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static2.aBoolean101 = true;
		Static5.anInt3715 = arg0;
		Static1.anInt315 = arg1;
		Static7.anInt5803 = arg2;
		Static1.anInt528 = -1;
		Static1.anInt420 = -1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Lclient!fe;")
	public static SoftwareIndexedSprite method3187() {
		@Pc(21) SoftwareIndexedSprite local21 = new SoftwareIndexedSprite(Static1.anInt889, Static3.anInt2162, Static5.anIntArray402[0], Static5.anIntArray391[0], Static3.anIntArray185[0], Static7.anIntArray643[0], Static6.aByteArrayArray36[0], Static2.anIntArray85);
		Static37.method4670();
		return local21;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V")
	public static void method4704() {
		for (@Pc(3) int local3 = 0; local3 < Static6.anInt4457; local3++) {
			@Pc(10) int local10 = Static3.anIntArray217[local3]--;
			if (Static3.anIntArray217[local3] >= -10) {
				@Pc(89) SynthSound local89 = Static4.aClass7Array1[local3];
				if (local89 == null) {
					local89 = SynthSound.create(client.js5Archive4, Static4.anIntArray294[local3], 0);
					if (local89 == null) {
						continue;
					}
					@Pc(104) int[] local104 = Static3.anIntArray217;
					local104[local3] += local89.getStart();
					Static4.aClass7Array1[local3] = local89;
				}
				if (Static3.anIntArray217[local3] < 0) {
					@Pc(223) int local223;
					if (Static7.anIntArray601[local3] == 0) {
						local223 = Static1.anIntArray21[local3] * Preferences.soundEffectsVolume >> 8;
					} else {
						@Pc(137) int local137 = (Static7.anIntArray601[local3] & 0xFF) * 128;
						@Pc(145) int local145 = Static7.anIntArray601[local3] >> 16 & 0xFF;
						@Pc(155) int local155 = local145 * 128 + 64 - PlayerList.self.x;
						if (local155 < 0) {
							local155 = -local155;
						}
						@Pc(171) int local171 = Static7.anIntArray601[local3] >> 8 & 0xFF;
						@Pc(181) int local181 = local171 * 128 + 64 - PlayerList.self.z;
						if (local181 < 0) {
							local181 = -local181;
						}
						@Pc(192) int local192 = local181 + local155 - 128;
						if (local137 < local192) {
							Static3.anIntArray217[local3] = -100;
							continue;
						}
						if (local192 < 0) {
							local192 = 0;
						}
						local223 = (local137 - local192) * Preferences.areaSoundsVolume * Static1.anIntArray21[local3] / local137 >> 8;
					}
					if (local223 > 0) {
						@Pc(240) PcmSound local240 = local89.toPcmSound().resample(client.resampler);
						@Pc(245) Class4_Sub6_Sub4 local245 = Static28.method3385(local240, local223);
						local245.method3359(Static7.anIntArray629[local3] - 1);
						Static5.aClass4_Sub6_Sub3_2.method2674(local245);
					}
					Static3.anIntArray217[local3] = -100;
				}
			} else {
				Static6.anInt4457--;
				for (@Pc(24) int local24 = local3; local24 < Static6.anInt4457; local24++) {
					Static4.anIntArray294[local24] = Static4.anIntArray294[local24 + 1];
					Static4.aClass7Array1[local24] = Static4.aClass7Array1[local24 + 1];
					Static7.anIntArray629[local24] = Static7.anIntArray629[local24 + 1];
					Static3.anIntArray217[local24] = Static3.anIntArray217[local24 + 1];
					Static7.anIntArray601[local24] = Static7.anIntArray601[local24 + 1];
					Static1.anIntArray21[local24] = Static1.anIntArray21[local24 + 1];
				}
				local3--;
			}
		}
		if (Static4.aBoolean210 && !Static16.method1550()) {
			if (Preferences.musicVolume != 0 && Static6.anInt4844 != -1) {
				Static28.method3251(Preferences.musicVolume, Static6.anInt4844, client.js5Archive6);
			}
			Static4.aBoolean210 = false;
		} else if (Preferences.musicVolume != 0 && Static6.anInt4844 != -1 && !Static16.method1550()) {
			Protocol.outboundBuffer.writeOpcode(250);
			Protocol.outboundBuffer.writeInt(Static6.anInt4844);
			Static6.anInt4844 = -1;
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(IIIIII)V")
	public static void method4706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static18.method1656(Static5.anIntArrayArray36[arg3++], arg0, arg1, arg2);
		Static18.method1656(Static5.anIntArrayArray36[arg4--], arg0, arg1, arg2);
		for (@Pc(31) int local31 = arg3; local31 <= arg4; local31++) {
			@Pc(42) int[] local42 = Static5.anIntArrayArray36[local31];
			local42[arg1] = local42[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(B)V")
	private static void method4709() {
		FloTypeList.removeSoft();
		FluTypeList.removeSoft();
		IdkTypeList.removeSoft();
		LocTypeList.removeSoft();
		NpcTypeList.removeSoft();
		ObjTypeList.removeSoft();
		SeqTypeList.removeSoft();
		SpotAnimTypeList.removeSoft();
		VarbitTypeList.removeSoft();
		VarpTypeList.removeSoft();
		BasTypeList.removeSoft();
		MsiTypeList.removeSoft();
		MelTypeList.removeSoft();
		SkyBoxTypeList.removeSoft();
		SkyBoxSphereTypeList.removeSoft();
		LightTypeList.removeSoft();
		CursorTypeList.removeSoft();
		Static14.method1172();
		Static20.method1974();
		Static14.method1066();
		Static18.method1713();
		Static1.aClass26_5.removeSoft();
		Static1.aClass26_3.removeSoft();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	public static void method3219() {
		Static6.aClass26_50.clean(5);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!fh;BII)[Lclient!uj;")
	public static Sprite[] method3225(@OriginalArg(0) Js5 arg0, @OriginalArg(3) int arg1) {
		return Static9.method197(arg0, arg1, 0) ? Static21.method2064() : null;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method3226(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[B)[B")
	public static byte[] method3230(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(13) byte[] local13 = new byte[arg1.length];
		if (arg0 != 64) {
			Static5.aBoolean276 = true;
		}
		ArrayUtils.copy(arg1, 0, local13, 0, arg1.length);
		return local13;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIFIZ)[[I")
	public static int[][] method3234(@OriginalArg(6) float arg0) {
		@Pc(17) int[][] local17 = new int[256][64];
		@Pc(21) TextureOp34 local21 = new TextureOp34();
		local21.anInt2625 = 4;
		local21.anInt2631 = 8;
		local21.anInt2628 = 3;
		local21.anInt2620 = (int) (arg0 * 4096.0F);
		local21.aBoolean181 = false;
		local21.postDecode();
		Static11.method524(64, 256);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local21.method2053(local17[local48], local48);
		}
		return local17;
	}

}

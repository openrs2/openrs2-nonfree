import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(B)Lclient!fg;")
	public static MapElement method492() {
		if (Static3.aClass175_12 == null) {
			return null;
		} else {
			Static1.aClass130_1.init(Static3.aClass175_12);
			@Pc(24) MapElement local24 = (MapElement) Static1.aClass130_1.head();
			@Pc(29) MelType local29 = MelTypeList.get(local24.id);
			return local29 != null && local29.aBoolean157 && local29.method1810() ? local24 : Static24.method2713();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
	public static boolean method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = SceneGraph.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == -Static2.anInt1871) {
			return false;
		} else if (local7 == Static2.anInt1871) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static33.method4119(local22 + 1, SceneGraph.tileHeights[arg0][arg1][arg2], local26 + 1) && Static33.method4119(local22 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg2], local26 + 1) && Static33.method4119(local22 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static33.method4119(local22 + 1, SceneGraph.tileHeights[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				SceneGraph.anIntArrayArrayArray3[arg0][arg1][arg2] = Static2.anInt1871;
				return true;
			} else {
				SceneGraph.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static2.anInt1871;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method516() {
		SceneGraph.clear();
		Static31.method3150();
		Static24.method2697();
		Skybox.cache.clear();
		Static3.aClass96_1 = new Class96();
		((Js5GlTextureProvider) Static4.textureProvider).clear();
		Static13.method1027();
		LightingManager.lights = new Light[255];
		LightingManager.lightCount = 0;
		Static32.method3876();
		Static14.method1211();
		Static16.method1556();
		Static10.method384(false);
		TitleScreen.clear();
		Static20.method1929();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(51) Player local51 = PlayerList.players[local42];
			if (local51 != null) {
				local51.anObject5 = null;
			}
		}
		if (GlRenderer.enabled) {
			Static14.method1205();
			Static10.setHdrEnabled(Preferences.hdr);
			Static26.method2969();
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
	public static void method521(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7, @OriginalArg(9) byte arg8, @OriginalArg(10) Class4_Sub12 arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
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
		arg9.method1870(arg2, arg13, arg14, local49, local39, false);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZ)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != Static2.anInt1626) {
			Static4.anIntArray231 = new int[arg0];
			for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
				Static4.anIntArray231[local14] = (local14 << 12) / arg0;
			}
			Static1.anInt901 = arg0 - 1;
			Static2.anInt1626 = arg0;
			Static6.anInt4511 = arg0 * 32;
		}
		if (arg1 == Static1.anInt379) {
			return;
		}
		if (arg1 == Static2.anInt1626) {
			Static6.anIntArray478 = Static4.anIntArray231;
		} else {
			Static6.anIntArray478 = new int[arg1];
			for (@Pc(58) int local58 = 0; local58 < arg1; local58++) {
				Static6.anIntArray478[local58] = (local58 << 12) / arg1;
			}
		}
		Static6.anInt5001 = arg1 - 1;
		Static1.anInt379 = arg1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!wf;IIIILclient!uj;)V")
	public static void method525(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Sprite arg5) {
		if (arg5 == null) {
			return;
		}
		@Pc(14) int local14 = (int) Static5.aFloat97 + Static6.anInt3585 & 0x7FF;
		@Pc(26) int local26 = Math.max(arg1.width / 2, arg1.height / 2) + 10;
		@Pc(34) int local34 = arg4 * arg4 + arg3 * arg3;
		if (local34 > local26 * local26) {
			return;
		}
		@Pc(45) int local45 = MathUtils.SINE[local14];
		local45 = local45 * 256 / (Static6.anInt4761 + 256);
		@Pc(57) int local57 = MathUtils.COSINE[local14];
		local57 = local57 * 256 / (Static6.anInt4761 + 256);
		@Pc(75) int local75 = arg3 * local57 + arg4 * local45 >> 16;
		@Pc(86) int local86 = local57 * arg4 - arg3 * local45 >> 16;
		if (GlRenderer.enabled) {
			((GlSprite) arg5).renderTransparentMasked(arg1.width / 2 + arg0 + local75 - arg5.innerWidth / 2, arg1.height / 2 + arg2 - arg5.innerHeight / 2 - local86, (GlSprite) arg1.method4729(false));
		} else {
			((SoftwareSprite) arg5).renderTransparentMasked(arg0 + arg1.width / 2 + local75 - arg5.innerWidth / 2, arg1.height / 2 + arg2 - arg5.innerHeight / 2 - local86, arg1.anIntArray672, arg1.anIntArray657);
		}
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
			Static3.lowPriorityRequests.addTail(request);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!p;BI)V")
	public static void method529(@OriginalArg(0) int seqId, @OriginalArg(1) Npc npc, @OriginalArg(3) int delay) {
		if (seqId == npc.seqId && seqId != -1) {
			@Pc(19) SeqType local19 = SeqTypeList.get(seqId);
			@Pc(22) int local22 = local19.anInt1238;
			if (local22 == 1) {
				npc.anInt3970 = 0;
				npc.anInt3996 = delay;
				npc.anInt4011 = 1;
				npc.anInt4001 = 0;
				npc.anInt4044 = 0;
				SoundPlayer.playSeqSound(local19, npc.zFine, npc.xFine, npc.anInt3970, false);
			}
			if (local22 == 2) {
				npc.anInt4001 = 0;
			}
		} else if (seqId == -1 || npc.seqId == -1 || SeqTypeList.get(seqId).anInt1243 >= SeqTypeList.get(npc.seqId).anInt1243) {
			npc.anInt4011 = 1;
			npc.anInt4030 = npc.movementQueueSize;
			npc.anInt4001 = 0;
			npc.anInt3970 = 0;
			npc.anInt3996 = delay;
			npc.seqId = seqId;
			npc.anInt4044 = 0;
			if (npc.seqId != -1) {
				SoundPlayer.playSeqSound(SeqTypeList.get(npc.seqId), npc.zFine, npc.xFine, npc.anInt3970, false);
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([ILclient!p;[II[I)V")
	public static void method555(@OriginalArg(0) int[] arg0, @OriginalArg(1) Npc arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(19) int local19 = arg0[local7];
			@Pc(23) int local23 = arg2[local7];
			@Pc(27) int local27 = arg3[local7];
			@Pc(29) int local29 = 0;
			while (local23 != 0 && local29 < arg1.aClass150Array3.length) {
				if ((local23 & 0x1) != 0) {
					if (local19 == -1) {
						arg1.aClass150Array3[local29] = null;
					} else {
						@Pc(53) SeqType local53 = SeqTypeList.get(local19);
						@Pc(56) int local56 = local53.anInt1238;
						@Pc(61) Class150 local61 = arg1.aClass150Array3[local29];
						if (local61 != null) {
							if (local61.anInt4456 == local19) {
								if (local56 == 0) {
									local61 = arg1.aClass150Array3[local29] = null;
								} else if (local56 == 1) {
									local61.anInt4465 = 0;
									local61.anInt4464 = 1;
									local61.anInt4460 = 0;
									local61.anInt4461 = local27;
									local61.anInt4462 = 0;
									SoundPlayer.playSeqSound(local53, arg1.zFine, arg1.xFine, 0, false);
								} else if (local56 == 2) {
									local61.anInt4465 = 0;
								}
							} else if (local53.anInt1243 >= SeqTypeList.get(local61.anInt4456).anInt1243) {
								local61 = arg1.aClass150Array3[local29] = null;
							}
						}
						if (local61 == null) {
							@Pc(155) Class150 local155 = arg1.aClass150Array3[local29] = new Class150();
							local155.anInt4456 = local19;
							local155.anInt4462 = 0;
							local155.anInt4460 = 0;
							local155.anInt4464 = 1;
							local155.anInt4465 = 0;
							local155.anInt4461 = local27;
							SoundPlayer.playSeqSound(local53, arg1.zFine, arg1.xFine, 0, false);
						}
					}
				}
				local29++;
				local23 >>>= 1;
			}
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
		Static7.aBoolean367 = true;
		MouseRecorder.instance.samples = 0;
		Static1.aLong32 = 0L;
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
		Static6.anInt3585 = (int) (Math.random() * 120.0D) - 60;
		Chat.size = 0;
		Static5.aFloat97 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static1.anInt242 = (int) (Math.random() * 80.0D) - 40;
		Static3.aBoolean177 = false;
		Static2.anInt1334 = 0;
		Static1.anInt837 = (int) (Math.random() * 110.0D) - 55;
		SoundPlayer.size = 0;
		Static27.method4239();
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
		Static1.aClass144_1.set(-1, null, -1, new int[] { 0, 0, 0, 0, 0 }, false);
		for (@Pc(3945) int local3945 = 0; local3945 < 8; local3945++) {
			Player.ops[local3945] = null;
			Player.opLowPriority[local3945] = false;
			Player.opCursors[local3945] = -1;
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
		Static7.aShortArray124 = Static5.aShortArray74 = Static7.aShortArray111 = Static4.aShortArray126 = new short[256];
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

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V")
	public static void method563(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static31.method3152(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIII)V")
	public static void method565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static18.method1656(Static5.anIntArrayArray36[arg0], arg3, arg1 - arg2, arg2 + arg1);
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
				Static18.method1656(local76, arg3, local80, local84);
				Static18.method1656(local69, arg3, local80, local84);
			}
			@Pc(101) int local101 = arg1 + local33;
			@Pc(106) int local106 = arg1 - local33;
			@Pc(112) int[] local112 = Static5.anIntArrayArray36[arg0 + local20];
			@Pc(118) int[] local118 = Static5.anIntArrayArray36[arg0 - local20];
			Static18.method1656(local112, arg3, local106, local101);
			Static18.method1656(local118, arg3, local106, local101);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[JI[I)V")
	public static void method572(@OriginalArg(1) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg2) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) long local21 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local21;
		@Pc(35) int local35 = arg3[local15];
		arg3[local15] = arg3[arg0];
		arg3[arg0] = local35;
		for (@Pc(47) int local47 = arg2; local47 < arg0; local47++) {
			if (arg1[local47] < (long) (local47 & 0x1) + local21) {
				@Pc(70) long local70 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17] = local70;
				@Pc(84) int local84 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17++] = local84;
			}
		}
		arg1[arg0] = arg1[local17];
		arg1[local17] = local21;
		arg3[arg0] = arg3[local17];
		arg3[local17] = local35;
		method572(local17 - 1, arg1, arg2, arg3);
		method572(arg0, arg1, local17 + 1, arg3);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z[BIII[Lclient!ch;)V")
	public static void method576(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) CollisionMap[] arg4) {
		@Pc(10) Buffer local10 = new Buffer(arg1);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local10.readUnsignedMultiSmart();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(37) int local37 = 0;
			while (true) {
				@Pc(41) int local41 = local10.readUnsignedShortSmart();
				if (local41 == 0) {
					break;
				}
				local37 += local41 - 1;
				@Pc(56) int local56 = local37 & 0x3F;
				@Pc(62) int local62 = local37 >> 6 & 0x3F;
				@Pc(66) int local66 = local10.readUnsignedByte();
				@Pc(70) int local70 = local66 & 0x3;
				@Pc(74) int local74 = local66 >> 2;
				@Pc(79) int local79 = local62 + arg3;
				@Pc(84) int local84 = local56 + arg2;
				@Pc(88) int local88 = local37 >> 12;
				if (local79 > 0 && local84 > 0 && local79 < 103 && local84 < 103) {
					@Pc(104) CollisionMap local104 = null;
					if (!arg0) {
						@Pc(108) int local108 = local88;
						if ((Static4.tileFlags[1][local79][local84] & 0x2) == 2) {
							local108 = local88 - 1;
						}
						if (local108 >= 0) {
							local104 = arg4[local108];
						}
					}
					Static22.method2193(local70, local88, local20, local88, local79, arg0, local84, local104, !arg0, local74);
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
		Static13.method966(Static4.anInt3407);
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
			Static16.method1496();
		}
		if (GlRenderer.enabled) {
			Static17.method1655();
		}
		Static28.method3322();
		Static9.method233(28);
	}

}

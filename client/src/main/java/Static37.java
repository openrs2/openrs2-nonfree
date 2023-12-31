import java.awt.Graphics;
import java.net.URL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
	public static void method4661(@OriginalArg(0) int x, @OriginalArg(3) int z, @OriginalArg(1) int miniMap) {
		if (miniMap == 0) {
			Protocol.outboundBuffer.writeOpcode(230);
		}
		if (miniMap == 1) {
			Protocol.outboundBuffer.writeOpcode(207);
		}
		Protocol.outboundBuffer.writeByteS(++MiniMap.sequenceNumber);
		Protocol.outboundBuffer.writeByte(Keyboard.pressedKeys[82] ? 1 : 0);
		Protocol.outboundBuffer.writeShort(Static7.originZ + z);
		Protocol.outboundBuffer.writeShortLEA(Static5.originX + x);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public static void method4677() {
		if (Static5.environments == null) {
			return;
		}
		@Pc(8) Environment environment = new Environment();
		for (@Pc(10) int x = 0; x < 13; x++) {
			for (@Pc(15) int z = 0; z < 13; z++) {
				Static5.environments[x][z] = environment;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
	public static void method4710(@OriginalArg(1) boolean underwater) {
		@Pc(11) byte[][] locBytes;
		if (GlRenderer.enabled && underwater) {
			locBytes = Static1.underwaterLocBytes;
		} else {
			locBytes = Static5.locBytes;
		}
		@Pc(29) int len = Static1.mapBytes.length;
		for (@Pc(31) int i = 0; i < len; i++) {
			@Pc(42) byte[] bytes = locBytes[i];
			if (bytes != null) {
				@Pc(55) int x = (Static7.mapSquares[i] >> 8) * 64 - Static5.originX;
				@Pc(66) int z = (Static7.mapSquares[i] & 0xFF) * 64 - Static7.originZ;
				Static9.audioLoop();
				Static11.readMapLocs(underwater, bytes, z, x, PathFinder.collisionMaps);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void renderLoadingText(@OriginalArg(1) String s, @OriginalArg(2) boolean redraw) {
		@Pc(17) int width = Fonts.p12Full.getParagraphWidth(s, 250);
		@Pc(32) int lineCount = Fonts.p12Full.getParagraphLineCount(s, 250) * 13;
		if (GlRenderer.enabled) {
			GlRaster.fillRect(6, 6, width + 4 + 4, lineCount + 8, 0);
			GlRaster.drawRect(6, 6, width + 4 + 4, lineCount + 4 + 4, 0xFFFFFF);
		} else {
			SoftwareRaster.fillRect(6, 6, width + 8, lineCount + 4 + 4, 0);
			SoftwareRaster.drawRect(6, 6, width + 4 + 4, lineCount + 8, 0xFFFFFF);
		}
		Fonts.p12Full.renderParagraph(s, 10, 10, width, lineCount, 0xFFFFFF, -1, 1, 1, 0);
		Static8.method66(width + 4 + 4, lineCount + 4 + 4, 6, 6);
		if (!redraw) {
			Static16.method1559(10, 10, lineCount, width);
		} else if (GlRenderer.enabled) {
			GlRenderer.swapBuffers();
		} else {
			try {
				@Pc(169) Graphics graphics = GameShell.canvas.getGraphics();
				client.frameBuffer.draw(graphics);
			} catch (@Pc(177) Exception ex) {
				GameShell.canvas.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void openUrl(@OriginalArg(1) String url, @OriginalArg(2) boolean newTab) {
		if (!newTab) {
			try {
				BrowserControl.call(GameShell.signLink.applet, "loggedout");
			} catch (@Pc(51) Throwable ex) {
			}
			try {
				GameShell.instance.getAppletContext().showDocument(new URL(GameShell.instance.getCodeBase(), url), "_top");
			} catch (@Pc(63) Exception ex) {
			}
			return;
		}
		if (GlRenderer.enabled && GameShell.openWindowJavaScript) {
			try {
				BrowserControl.call(GameShell.signLink.applet, "openjs", new Object[] { (new URL(GameShell.instance.getCodeBase(), url)).toString() });
				return;
			} catch (@Pc(29) Throwable ex) {
			}
		}
		try {
			GameShell.instance.getAppletContext().showDocument(new URL(GameShell.instance.getCodeBase(), url), "_blank");
		} catch (@Pc(41) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method4721() {
		if (Static11.method561() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static2.anInt1997 - 4 & 0xFF);
		@Pc(27) int x = Static2.anInt1997 % 104;
		for (@Pc(29) int level = 0; level < 4; level++) {
			for (@Pc(34) int z = 0; z < 104; z++) {
				Static1.aByteArrayArrayArray2[level][x][z] = local19;
			}
		}
		if (Player.level == 3) {
			return;
		}
		for (@Pc(59) int local59 = 0; local59 < 2; local59++) {
			Static5.anIntArray440[local59] = -1000000;
			Static3.anIntArray164[local59] = 1000000;
			Static7.anIntArray620[local59] = 0;
			Static6.anIntArray492[local59] = 1000000;
			Static6.anIntArray489[local59] = 0;
		}
		if (Static1.anInt772 != 1) {
			@Pc(94) int local94 = SceneGraph.getTileHeight(Player.level, Static3.anInt2519, Static7.anInt5678);
			if (local94 - Static2.anInt1931 < 800 && (Static4.tileFlags[Player.level][Static3.anInt2519 >> 7][Static7.anInt5678 >> 7] & 0x4) != 0) {
				Static9.method279(1, Static3.anInt2519 >> 7, false, Static7.anInt5678 >> 7, SceneGraph.tiles);
			}
			return;
		}
		if ((Static4.tileFlags[Player.level][PlayerList.self.xFine >> 7][PlayerList.self.zFine >> 7] & 0x4) != 0) {
			Static9.method279(0, PlayerList.self.xFine >> 7, false, PlayerList.self.zFine >> 7, SceneGraph.tiles);
		}
		if (Static5.anInt4066 >= 310) {
			return;
		}
		@Pc(175) int local175 = Static7.anInt5678 >> 7;
		@Pc(179) int local179 = Static3.anInt2519 >> 7;
		@Pc(184) int local184 = PlayerList.self.zFine >> 7;
		@Pc(196) int local196;
		if (local175 >= local184) {
			local196 = local175 - local184;
		} else {
			local196 = local184 - local175;
		}
		@Pc(208) int local208 = PlayerList.self.xFine >> 7;
		@Pc(216) int local216;
		if (local208 > local179) {
			local216 = local208 - local179;
		} else {
			local216 = local179 - local208;
		}
		if (local216 == 0 && local196 == 0 || local216 <= -104 || local216 >= 104 || local196 <= -104 || local196 >= 104) {
			TracingException.report(null, "RC: " + local179 + "," + local175 + " " + local208 + "," + local184 + " " + Static5.originX + "," + Static7.originZ);
			return;
		}
		if (local216 > local196) {
			@Pc(397) int local397 = local196 * 65536 / local216;
			@Pc(399) int local399 = 32768;
			while (local208 != local179) {
				if (local179 < local208) {
					local179++;
				} else if (local208 < local179) {
					local179--;
				}
				if ((Static4.tileFlags[Player.level][local179][local175] & 0x4) != 0) {
					Static9.method279(1, local179, false, local175, SceneGraph.tiles);
					break;
				}
				local399 += local397;
				if (local399 >= 65536) {
					if (local175 < local184) {
						local175++;
					} else if (local184 < local175) {
						local175--;
					}
					local399 -= 65536;
					if ((Static4.tileFlags[Player.level][local179][local175] & 0x4) != 0) {
						Static9.method279(1, local179, false, local175, SceneGraph.tiles);
						break;
					}
				}
			}
			return;
		}
		@Pc(293) int local293 = 32768;
		@Pc(299) int local299 = local216 * 65536 / local196;
		while (local175 != local184) {
			if (local184 > local175) {
				local175++;
			} else if (local184 < local175) {
				local175--;
			}
			if ((Static4.tileFlags[Player.level][local179][local175] & 0x4) != 0) {
				Static9.method279(1, local179, false, local175, SceneGraph.tiles);
				break;
			}
			local293 += local299;
			if (local293 >= 65536) {
				local293 -= 65536;
				if (local208 > local179) {
					local179++;
				} else if (local179 > local208) {
					local179--;
				}
				if ((Static4.tileFlags[Player.level][local179][local175] & 0x4) != 0) {
					Static9.method279(1, local179, false, local175, SceneGraph.tiles);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BII)V")
	public static void method4736(@OriginalArg(1) int createdComponentId, @OriginalArg(2) int componentId) {
		Protocol.outboundBuffer.writeOpcode(178);
		Protocol.outboundBuffer.writeShortLE2(createdComponentId);
		Protocol.outboundBuffer.writeIntAlt3(componentId);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
	public static void method4737() {
		SceneGraph.anInt4112 = 0;
		label194:
		for (@Pc(3) int local3 = 0; local3 < SceneGraph.anInt1742; local3++) {
			@Pc(10) Class184 local10 = SceneGraph.aClass184Array13[local3];
			if (Static3.anIntArray170 != null) {
				for (@Pc(14) int local14 = 0; local14 < Static3.anIntArray170.length; local14++) {
					if (Static3.anIntArray170[local14] != -1000000 && (local10.anInt5872 <= Static3.anIntArray170[local14] || local10.anInt5881 <= Static3.anIntArray170[local14]) && (local10.anInt5862 <= Static5.anIntArray399[local14] || local10.anInt5877 <= Static5.anIntArray399[local14]) && (local10.anInt5862 >= Static1.anIntArray63[local14] || local10.anInt5877 >= Static1.anIntArray63[local14]) && (local10.anInt5860 <= Static4.anIntArray309[local14] || local10.anInt5879 <= Static4.anIntArray309[local14]) && (local10.anInt5860 >= Static3.anIntArray226[local14] || local10.anInt5879 >= Static3.anIntArray226[local14])) {
						continue label194;
					}
				}
			}
			if (local10.anInt5866 == 1) {
				@Pc(100) int local100 = local10.anInt5867 + SceneGraph.anInt3253 - Static6.anInt4513;
				if (local100 >= 0 && local100 <= SceneGraph.anInt3253 + SceneGraph.anInt3253) {
					@Pc(115) int local115 = local10.anInt5876 + SceneGraph.anInt3253 - Static4.anInt3329;
					if (local115 < 0) {
						local115 = 0;
					}
					@Pc(126) int local126 = local10.anInt5870 + SceneGraph.anInt3253 - Static4.anInt3329;
					if (local126 > SceneGraph.anInt3253 + SceneGraph.anInt3253) {
						local126 = SceneGraph.anInt3253 + SceneGraph.anInt3253;
					}
					@Pc(137) boolean local137 = false;
					while (local115 <= local126) {
						if (SceneGraph.aBooleanArrayArray5[local100][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						@Pc(158) int local158 = Static7.anInt5281 - local10.anInt5862;
						if (local158 > 32) {
							local10.anInt5873 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt5873 = 2;
							local158 = -local158;
						}
						local10.anInt5864 = (local10.anInt5860 - Static6.anInt4400 << 8) / local158;
						local10.anInt5874 = (local10.anInt5879 - Static6.anInt4400 << 8) / local158;
						local10.anInt5869 = (local10.anInt5872 - Static6.anInt4375 << 8) / local158;
						local10.anInt5868 = (local10.anInt5881 - Static6.anInt4375 << 8) / local158;
						SceneGraph.aClass184Array12[SceneGraph.anInt4112++] = local10;
					}
				}
			} else if (local10.anInt5866 == 2) {
				@Pc(234) int local234 = local10.anInt5876 + SceneGraph.anInt3253 - Static4.anInt3329;
				if (local234 >= 0 && local234 <= SceneGraph.anInt3253 + SceneGraph.anInt3253) {
					@Pc(249) int local249 = local10.anInt5867 + SceneGraph.anInt3253 - Static6.anInt4513;
					if (local249 < 0) {
						local249 = 0;
					}
					@Pc(260) int local260 = local10.anInt5858 + SceneGraph.anInt3253 - Static6.anInt4513;
					if (local260 > SceneGraph.anInt3253 + SceneGraph.anInt3253) {
						local260 = SceneGraph.anInt3253 + SceneGraph.anInt3253;
					}
					@Pc(271) boolean local271 = false;
					while (local249 <= local260) {
						if (SceneGraph.aBooleanArrayArray5[local249++][local234]) {
							local271 = true;
							break;
						}
					}
					if (local271) {
						@Pc(292) int local292 = Static6.anInt4400 - local10.anInt5860;
						if (local292 > 32) {
							local10.anInt5873 = 3;
						} else {
							if (local292 >= -32) {
								continue;
							}
							local10.anInt5873 = 4;
							local292 = -local292;
						}
						local10.anInt5861 = (local10.anInt5862 - Static7.anInt5281 << 8) / local292;
						local10.anInt5878 = (local10.anInt5877 - Static7.anInt5281 << 8) / local292;
						local10.anInt5869 = (local10.anInt5872 - Static6.anInt4375 << 8) / local292;
						local10.anInt5868 = (local10.anInt5881 - Static6.anInt4375 << 8) / local292;
						SceneGraph.aClass184Array12[SceneGraph.anInt4112++] = local10;
					}
				}
			} else if (local10.anInt5866 == 4) {
				@Pc(366) int local366 = local10.anInt5872 - Static6.anInt4375;
				if (local366 > 128) {
					@Pc(377) int local377 = local10.anInt5876 + SceneGraph.anInt3253 - Static4.anInt3329;
					if (local377 < 0) {
						local377 = 0;
					}
					@Pc(388) int local388 = local10.anInt5870 + SceneGraph.anInt3253 - Static4.anInt3329;
					if (local388 > SceneGraph.anInt3253 + SceneGraph.anInt3253) {
						local388 = SceneGraph.anInt3253 + SceneGraph.anInt3253;
					}
					if (local377 <= local388) {
						@Pc(408) int local408 = local10.anInt5867 + SceneGraph.anInt3253 - Static6.anInt4513;
						if (local408 < 0) {
							local408 = 0;
						}
						@Pc(419) int local419 = local10.anInt5858 + SceneGraph.anInt3253 - Static6.anInt4513;
						if (local419 > SceneGraph.anInt3253 + SceneGraph.anInt3253) {
							local419 = SceneGraph.anInt3253 + SceneGraph.anInt3253;
						}
						@Pc(430) boolean local430 = false;
						label166:
						for (@Pc(432) int local432 = local408; local432 <= local419; local432++) {
							for (@Pc(437) int local437 = local377; local437 <= local388; local437++) {
								if (SceneGraph.aBooleanArrayArray5[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt5873 = 5;
							local10.anInt5861 = (local10.anInt5862 - Static7.anInt5281 << 8) / local366;
							local10.anInt5878 = (local10.anInt5877 - Static7.anInt5281 << 8) / local366;
							local10.anInt5864 = (local10.anInt5860 - Static6.anInt4400 << 8) / local366;
							local10.anInt5874 = (local10.anInt5879 - Static6.anInt4400 << 8) / local366;
							SceneGraph.aClass184Array12[SceneGraph.anInt4112++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public static void method4752(@OriginalArg(0) int componentId, @OriginalArg(1) int createdComponentId, @OriginalArg(2) int op, @OriginalArg(4) String opBase) {
		@Pc(4) Component source = InterfaceList.getCreatedComponent(componentId, createdComponentId);
		if (source == null) {
			return;
		}
		if (source.onOp != null) {
			@Pc(22) HookRequest hookRequest = new HookRequest();
			hookRequest.op = op;
			hookRequest.source = source;
			hookRequest.opBase = opBase;
			hookRequest.arguments = source.onOp;
			ScriptRunner.method2019(hookRequest);
		}
		@Pc(40) boolean local40 = true;
		if (source.anInt5904 > 0) {
			local40 = Static36.method4402(source);
		}
		if (!local40 || !InterfaceList.getServerActiveProperties(source).isButtonEnabled(op - 1)) {
			return;
		}
		if (op == 1) {
			Protocol.outboundBuffer.writeOpcode(94);
			Protocol.outboundBuffer.writeInt(componentId);
			Protocol.outboundBuffer.writeShort(createdComponentId);
		}
		if (op == 2) {
			Protocol.outboundBuffer.writeOpcode(201);
			Protocol.outboundBuffer.writeInt(componentId);
			Protocol.outboundBuffer.writeShort(createdComponentId);
		}
		if (op == 3) {
			Protocol.outboundBuffer.writeOpcode(30);
			Protocol.outboundBuffer.writeInt(componentId);
			Protocol.outboundBuffer.writeShort(createdComponentId);
		}
		if (op == 4) {
			Protocol.outboundBuffer.writeOpcode(61);
			Protocol.outboundBuffer.writeInt(componentId);
			Protocol.outboundBuffer.writeShort(createdComponentId);
		}
		if (op == 5) {
			Protocol.outboundBuffer.writeOpcode(66);
			Protocol.outboundBuffer.writeInt(componentId);
			Protocol.outboundBuffer.writeShort(createdComponentId);
		}
		if (op == 6) {
			Protocol.outboundBuffer.writeOpcode(7);
			Protocol.outboundBuffer.writeInt(componentId);
			Protocol.outboundBuffer.writeShort(createdComponentId);
		}
		if (op == 7) {
			Protocol.outboundBuffer.writeOpcode(108);
			Protocol.outboundBuffer.writeInt(componentId);
			Protocol.outboundBuffer.writeShort(createdComponentId);
		}
		if (op == 8) {
			Protocol.outboundBuffer.writeOpcode(255);
			Protocol.outboundBuffer.writeInt(componentId);
			Protocol.outboundBuffer.writeShort(createdComponentId);
		}
		if (op == 9) {
			Protocol.outboundBuffer.writeOpcode(97);
			Protocol.outboundBuffer.writeInt(componentId);
			Protocol.outboundBuffer.writeShort(createdComponentId);
		}
		if (op == 10) {
			Protocol.outboundBuffer.writeOpcode(10);
			Protocol.outboundBuffer.writeInt(componentId);
			Protocol.outboundBuffer.writeShort(createdComponentId);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([[FII[[I[[F[[ILclient!ih;IIZF[[FIIIIII)I")
	public static int method4757(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) GroundModel arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float[][] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16) {
		if (arg12 == 1) {
			@Pc(39) int local39 = arg13;
			arg13 = arg1;
			arg1 = 128 - local39;
		} else if (arg12 == 2) {
			arg1 = 128 - arg1;
			arg13 = 128 - arg13;
		} else if (arg12 == 3) {
			@Pc(16) int local16 = arg13;
			arg13 = 128 - arg1;
			arg1 = local16;
		}
		@Pc(111) int local111;
		@Pc(109) float local109;
		@Pc(99) float local99;
		@Pc(89) float local89;
		if (arg13 == 0 && arg1 == 0) {
			local111 = arg16;
			local99 = arg4[arg8][arg2];
			local109 = arg0[arg8][arg2];
			local89 = arg11[arg8][arg2];
		} else if (arg13 == 128 && arg1 == 0) {
			local109 = arg0[arg8 + 1][arg2];
			local99 = arg4[arg8 + 1][arg2];
			local111 = arg7;
			local89 = arg11[arg8 + 1][arg2];
		} else if (arg13 == 128 && arg1 == 128) {
			local89 = arg11[arg8 + 1][arg2 + 1];
			local99 = arg4[arg8 + 1][arg2 + 1];
			local109 = arg0[arg8 + 1][arg2 + 1];
			local111 = arg15;
		} else if (arg13 == 0 && arg1 == 128) {
			local89 = arg11[arg8][arg2 + 1];
			local111 = arg14;
			local109 = arg0[arg8][arg2 + 1];
			local99 = arg4[arg8][arg2 + 1];
		} else {
			@Pc(124) float local124 = arg4[arg8][arg2];
			@Pc(130) float local130 = arg11[arg8][arg2];
			@Pc(136) float local136 = arg0[arg8][arg2];
			@Pc(141) float local141 = (float) arg13 / 128.0F;
			@Pc(146) float local146 = (float) arg1 / 128.0F;
			local124 += local141 * (arg4[arg8 + 1][arg2] - local124);
			local130 += local141 * (arg11[arg8 + 1][arg2] - local130);
			local136 += (arg0[arg8 + 1][arg2] - local136) * local141;
			@Pc(197) float local197 = arg0[arg8][arg2 + 1];
			@Pc(205) float local205 = arg4[arg8][arg2 + 1];
			@Pc(213) float local213 = arg11[arg8][arg2 + 1];
			local197 += (arg0[arg8 + 1][arg2 + 1] - local197) * local141;
			local109 = local136 + local146 * (local197 - local136);
			local213 += local141 * (arg11[arg8 + 1][arg2 + 1] - local213);
			local205 += local141 * (arg4[arg8 + 1][arg2 + 1] - local205);
			local89 = local130 + (local213 - local130) * local146;
			local99 = local124 + local146 * (local205 - local124);
			@Pc(293) int local293 = Static20.method1952(arg16, arg7, arg13);
			@Pc(299) int local299 = Static20.method1952(arg14, arg15, arg13);
			local111 = Static20.method1952(local293, local299, arg1);
		}
		@Pc(390) int local390 = (arg2 << 7) + arg1;
		@Pc(396) int local396 = arg13 + (arg8 << 7);
		@Pc(404) int local404 = Static9.method206(arg13, arg8, arg1, arg3, arg2);
		return arg6.addVertex(local396, local404, local390, local109, local99, local89, arg9 ? local111 & 0xFFFFFF00 : local111, arg5 == null ? 0.0F : (float) (local404 - Static9.method206(arg13, arg8, arg1, arg5, arg2)) / arg10);
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
	public static void method4784() {
		if (Static2.anInt1940 == 2) {
			if (Static4.anInt3341 == Static4.anInt2663 && Static1.anInt891 == Static5.anInt5848) {
				Static2.anInt1940 = 0;
				if (Static2.shiftClick && Keyboard.pressedKeys[81] && MiniMenu.size > 2) {
					MiniMenu.doAction(MiniMenu.size - 2);
				} else {
					MiniMenu.doAction(MiniMenu.size - 1);
				}
			}
		} else if (Static4.anInt3341 == Mouse.clickX && Static5.anInt5848 == Mouse.clickY) {
			Static2.anInt1940 = 0;
			if (Static2.shiftClick && Keyboard.pressedKeys[81] && MiniMenu.size > 2) {
				MiniMenu.doAction(MiniMenu.size - 2);
			} else {
				MiniMenu.doAction(MiniMenu.size - 1);
			}
		} else {
			Static2.anInt1940 = 2;
			Static1.anInt891 = Mouse.clickY;
			Static4.anInt2663 = Mouse.clickX;
		}
	}

}

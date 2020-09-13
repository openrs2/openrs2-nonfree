import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2562(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < Static6.anInt5214; local20++) {
			if (arg0.equalsIgnoreCase(Static4.aStringArray23[local20])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static4.aClass53_Sub1_Sub1_2.name)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	public static void method2563() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static3.aBooleanArray13[local7] = false;
		}
		Static5.anInt5195 = -1;
		Static6.anInt4838 = 0;
		Static1.anInt212 = 0;
		Static4.anInt3024 = -1;
		Static1.anInt772 = 1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([II)[I")
	public static int[] method2566(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) int[] local18 = new int[arg0.length];
			ArrayUtils.copy(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	public static void method2567() {
		if (!Static3.aBoolean138 || Static4.aBoolean189) {
			return;
		}
		@Pc(22) Class4_Sub19[][][] local22 = Static1.aClass4_Sub19ArrayArrayArray1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(32) Class4_Sub19[][] local32 = local22[local24];
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				for (@Pc(44) int local44 = 0; local44 < local32[local34].length; local44++) {
					@Pc(60) Class4_Sub19 local60 = local32[local34][local44];
					if (local60 != null) {
						if (local60.aClass42_1 != null && local60.aClass42_1.aClass53_2 instanceof Class53_Sub4_Sub2) {
							@Pc(76) Class53_Sub4_Sub2 local76 = (Class53_Sub4_Sub2) local60.aClass42_1.aClass53_2;
							if ((Long.MIN_VALUE & local60.aClass42_1.aLong45) == 0L) {
								local76.method3872(false, true, true, false, true, true);
							} else {
								local76.method3872(true, true, true, true, true, true);
							}
						}
						if (local60.aClass182_1 != null) {
							if (local60.aClass182_1.aClass53_10 instanceof Class53_Sub4_Sub2) {
								@Pc(118) Class53_Sub4_Sub2 local118 = (Class53_Sub4_Sub2) local60.aClass182_1.aClass53_10;
								if ((local60.aClass182_1.aLong194 & Long.MIN_VALUE) == 0L) {
									local118.method3872(false, true, true, false, true, true);
								} else {
									local118.method3872(true, true, true, true, true, true);
								}
							}
							if (local60.aClass182_1.aClass53_9 instanceof Class53_Sub4_Sub2) {
								@Pc(157) Class53_Sub4_Sub2 local157 = (Class53_Sub4_Sub2) local60.aClass182_1.aClass53_9;
								if ((Long.MIN_VALUE & local60.aClass182_1.aLong194) == 0L) {
									local157.method3872(false, true, true, false, true, true);
								} else {
									local157.method3872(true, true, true, true, true, true);
								}
							}
						}
						if (local60.aClass179_1 != null) {
							if (local60.aClass179_1.aClass53_5 instanceof Class53_Sub4_Sub2) {
								@Pc(199) Class53_Sub4_Sub2 local199 = (Class53_Sub4_Sub2) local60.aClass179_1.aClass53_5;
								if ((Long.MIN_VALUE & local60.aClass179_1.aLong188) == 0L) {
									local199.method3872(false, true, true, false, true, true);
								} else {
									local199.method3872(true, true, true, true, true, true);
								}
							}
							if (local60.aClass179_1.aClass53_4 instanceof Class53_Sub4_Sub2) {
								@Pc(237) Class53_Sub4_Sub2 local237 = (Class53_Sub4_Sub2) local60.aClass179_1.aClass53_4;
								if ((local60.aClass179_1.aLong188 & Long.MIN_VALUE) == 0L) {
									local237.method3872(false, true, true, false, true, true);
								} else {
									local237.method3872(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(269) int local269 = 0; local269 < local60.anInt3554; local269++) {
							if (local60.aClass33Array3[local269].aClass53_1 instanceof Class53_Sub4_Sub2) {
								@Pc(288) Class53_Sub4_Sub2 local288 = (Class53_Sub4_Sub2) local60.aClass33Array3[local269].aClass53_1;
								if ((Long.MIN_VALUE & local60.aClass33Array3[local269].aLong38) == 0L) {
									local288.method3872(false, true, true, false, true, true);
								} else {
									local288.method3872(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static4.aBoolean189 = true;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)Lclient!co;")
	public static Class33 method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3554; local13++) {
			@Pc(22) Class33 local22 = local7.aClass33Array3[local13];
			if ((local22.aLong38 >> 29 & 0x3L) == 2L && local22.anInt824 == arg1 && local22.anInt826 == arg2) {
				Static20.method1902(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!wf;B)Ljava/lang/String;")
	public static String method2597(@OriginalArg(0) int arg0, @OriginalArg(1) Class185 arg1) {
		if (!Static12.method687(arg1).method3266(arg0) && arg1.anObjectArray18 == null) {
			return null;
		} else if (arg1.aStringArray43 == null || arg0 >= arg1.aStringArray43.length || arg1.aStringArray43[arg0] == null || arg1.aStringArray43[arg0].trim().length() == 0) {
			return Static1.aBoolean26 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray43[arg0];
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method2599(@OriginalArg(0) Js5 arg0) {
		Static6.aClass58_90 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Lclient!ve;")
	public static Class179 method2611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static1.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass179_1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)I")
	public static int method2614(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0 &= 3;
		if (arg0 == 0) {
			return arg2;
		} else if (arg0 == 1) {
			return 7 - arg1;
		} else if (arg0 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
	public static void method2652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 8) {
			arg0 = 4;
		}
		if (arg0 == 4 && !Preferences.highDetailWater) {
			arg0 = 2;
			arg1 = 2;
		}
		if (Static7.anInt5330 != arg0) {
			if (Static3.aBoolean175) {
				return;
			}
			if (Static7.anInt5330 != 0) {
				Static6.anInterface2Array1[Static7.anInt5330].method3483();
			}
			if (arg0 != 0) {
				@Pc(42) Interface2 local42 = Static6.anInterface2Array1[arg0];
				local42.method3484();
				local42.method3486(arg1);
			}
			Static1.anInt214 = arg1;
			Static7.anInt5330 = arg0;
		} else if (arg0 != 0 && Static1.anInt214 != arg1) {
			Static6.anInterface2Array1[arg0].method3486(arg1);
			Static1.anInt214 = arg1;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!fh;BII)Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1 method2654(@OriginalArg(0) Js5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static9.method197(arg0, arg1, arg2) ? Static21.method2002() : null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method2675(@OriginalArg(1) Js5 arg0) {
		if (Static3.aBoolean124) {
			return;
		}
		if (Static3.aBoolean138) {
			Static18.method1700();
		} else {
			Static34.method4227();
		}
		Static6.aClass4_Sub3_Sub14_7 = Static11.method583(Static6.anInt4677, arg0);
		@Pc(24) int local24 = GameShell.canvasHeight;
		@Pc(30) int local30 = local24 * 956 / 503;
		Static6.aClass4_Sub3_Sub14_7.method4507((GameShell.canvasWidth - local30) / 2, 0, local30, local24);
		Static6.aClass56_1 = Static32.method3878(arg0, Static1.anInt322);
		Static6.aClass56_1.method2815(GameShell.canvasWidth / 2 - Static6.aClass56_1.anInt3408 / 2, 18);
		Static3.aBoolean124 = true;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!fh;IB)Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1 method2679(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1) {
		return Static33.method4131(arg0, arg1) ? Static21.method2002() : null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static void method2680(@OriginalArg(1) int arg0) {
		Static3.anIntArray164 = new int[arg0];
		Static6.anIntArray492 = new int[arg0];
		Static5.anIntArray440 = new int[arg0];
		Static7.anIntArray620 = new int[arg0];
		Static6.anIntArray489 = new int[arg0];
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method2682(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIIZIIZ)V")
	public static void method2813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg5) {
			Static17.method1605();
		}
		if (GameShell.fullScreenFrame != null && (arg4 != 3 || arg0 != Preferences.fullScreenWidth || arg3 != Preferences.fullScreenHeight)) {
			Static31.method3658(GameShell.signLink, GameShell.fullScreenFrame);
			GameShell.fullScreenFrame = null;
		}
		if (arg4 == 3 && GameShell.fullScreenFrame == null) {
			GameShell.fullScreenFrame = Static8.method67(0, arg0, arg3, GameShell.signLink);
			if (GameShell.fullScreenFrame != null) {
				Preferences.fullScreenWidth = arg0;
				Preferences.fullScreenHeight = arg3;
				Preferences.write(GameShell.signLink);
			}
		}
		if (arg4 == 3 && GameShell.fullScreenFrame == null) {
			method2813(-1, arg1, true, -1, Preferences.displayMode, true);
			return;
		}
		@Pc(83) Container local83;
		if (GameShell.fullScreenFrame != null) {
			local83 = GameShell.fullScreenFrame;
		} else if (GameShell.frame == null) {
			local83 = GameShell.signLink.applet;
		} else {
			local83 = GameShell.frame;
		}
		GameShell.frameWidth = local83.getSize().width;
		GameShell.frameHeight = local83.getSize().height;
		if (local83 == GameShell.frame) {
			@Pc(110) Insets local110 = GameShell.frame.getInsets();
			GameShell.frameWidth -= local110.right + local110.left;
			GameShell.frameHeight -= local110.top + local110.bottom;
		}
		if (arg4 >= 2) {
			GameShell.topMargin = 0;
			GameShell.canvasWidth = GameShell.frameWidth;
			GameShell.leftMargin = 0;
			GameShell.canvasHeight = GameShell.frameHeight;
		} else {
			GameShell.leftMargin = (GameShell.frameWidth - 765) / 2;
			GameShell.canvasWidth = 765;
			GameShell.canvasHeight = 503;
			GameShell.topMargin = 0;
		}
		if (arg2) {
			Keyboard.stop(GameShell.canvas);
			Mouse.stop(GameShell.canvas);
			if (Static6.aClass19_1 != null) {
				Static6.aClass19_1.method894(GameShell.canvas);
			}
			client.instance.addCanvas();
			Keyboard.start(GameShell.canvas);
			Mouse.start(GameShell.canvas);
			if (Static6.aClass19_1 != null) {
				Static6.aClass19_1.method900(GameShell.canvas);
			}
		} else {
			if (Static3.aBoolean138) {
				Static16.method1587(GameShell.canvasWidth, GameShell.canvasHeight);
			}
			GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
			if (local83 == GameShell.frame) {
				@Pc(208) Insets local208 = GameShell.frame.getInsets();
				GameShell.canvas.setLocation(GameShell.leftMargin + local208.left, GameShell.topMargin + local208.top);
			} else {
				GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
			}
		}
		if (arg4 == 0 && arg1 > 0) {
			Static17.method1611(GameShell.canvas);
		}
		if (arg5 && arg4 > 0) {
			GameShell.canvas.setIgnoreRepaint(true);
			if (!Static2.aBoolean76) {
				Static35.method4310();
				Static4.aClass59_1 = null;
				Static4.aClass59_1 = Static25.method2727(GameShell.canvasHeight, GameShell.canvasWidth, GameShell.canvas);
				Static34.method4227();
				if (Static4.anInt3304 == 5) {
					Static28.method3331(true, Static5.aClass4_Sub3_Sub5_3);
				} else {
					Static37.method4716(LocalisedText.LOADING, false);
				}
				try {
					@Pc(268) Graphics local268 = GameShell.canvas.getGraphics();
					Static4.aClass59_1.method4238(local268);
				} catch (@Pc(276) Exception local276) {
				}
				Static29.method3430();
				if (arg1 == 0) {
					Static4.aClass59_1 = Static25.method2727(503, 765, GameShell.canvas);
				} else {
					Static4.aClass59_1 = null;
				}
				@Pc(299) PrivilegedRequest local299 = GameShell.signLink.loadGlNatives(client.instance.getClass());
				while (local299.status == 0) {
					ThreadUtils.sleep(100L);
				}
				if (local299.status == 1) {
					Static2.aBoolean76 = true;
				}
			}
			if (Static2.aBoolean76) {
				Static17.method1623(GameShell.canvas, Static2.anInt1125 * 2);
			}
		}
		if (!Static3.aBoolean138 && arg4 > 0) {
			method2813(-1, arg1, true, -1, 0, true);
			return;
		}
		if (arg4 > 0 && arg1 == 0) {
			GameShell.thread.setPriority(5);
			Static4.aClass59_1 = null;
			Static25.method2915();
			((Class24_Sub1) Static4.anInterface4_1).method463(200);
			if (Preferences.highDetailLighting) {
				Static23.method2539(0.7F);
			}
			if (Static5.aClass187ArrayArray1 == null) {
				Static5.aClass187ArrayArray1 = new Class187[13][13];
			}
			Static27.method3109();
			Static14.method1205();
			Static36.method4447();
		} else if (arg4 == 0 && arg1 > 0) {
			GameShell.thread.setPriority(1);
			Static4.aClass59_1 = Static25.method2727(503, 765, GameShell.canvas);
			Static25.method2906();
			Static26.method2951();
			((Class24_Sub1) Static4.anInterface4_1).method463(20);
			if (Preferences.highDetailLighting) {
				if (Preferences.brightness == 1) {
					Static23.method2539(0.9F);
				}
				if (Preferences.brightness == 2) {
					Static23.method2539(0.8F);
				}
				if (Preferences.brightness == 3) {
					Static23.method2539(0.7F);
				}
				if (Preferences.brightness == 4) {
					Static23.method2539(0.6F);
				}
			}
			Static19.method1868();
			Static36.method4447();
		}
		Static6.aBoolean313 = !Static10.method456();
		Static26.method2966(GameShell.canvasWidth, GameShell.canvasHeight);
		if (arg5) {
			Static11.method516();
		}
		if (arg4 < 2) {
			Static4.aBoolean184 = false;
		} else {
			Static4.aBoolean184 = true;
		}
		if (Static3.anInt5398 != -1) {
			Static12.method777(true);
		}
		if (Static3.aClass52_7 != null && (Static4.anInt3304 == 30 || Static4.anInt3304 == 25)) {
			Static21.method2001();
		}
		for (@Pc(490) int local490 = 0; local490 < 100; local490++) {
			Static2.aBooleanArray8[local490] = true;
		}
		GameShell.fullRedraw = true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIII)V")
	public static void method2945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) String local32 = "::tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local32);
		Static27.method3185(local32);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method2946(@OriginalArg(0) Js5 arg0) {
		Static2.anInt914 = arg0.getGroupId("p11_full");
		Static7.anInt6040 = arg0.getGroupId("p12_full");
		Static4.anInt3309 = arg0.getGroupId("b12_full");
		Static3.anInt2120 = arg0.getGroupId("hitmarks");
		Static6.anInt4363 = arg0.getGroupId("hitbar_default");
		Static5.anInt4281 = arg0.getGroupId("headicons_pk");
		Static2.anInt1975 = arg0.getGroupId("headicons_prayer");
		Static5.anInt4207 = arg0.getGroupId("hint_headicons");
		Static7.anInt5332 = arg0.getGroupId("hint_mapmarkers");
		Static7.anInt5230 = arg0.getGroupId("mapflag");
		Static6.anInt3786 = arg0.getGroupId("cross");
		Static3.anInt2296 = arg0.getGroupId("mapdots");
		Static5.anInt4163 = arg0.getGroupId("scrollbar");
		Static3.anInt2449 = arg0.getGroupId("name_icons");
		Static2.anInt1632 = arg0.getGroupId("floorshadows");
		Static1.anInt130 = arg0.getGroupId("compass");
		Static6.anInt4371 = arg0.getGroupId("hint_mapedge");
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIII)V")
	public static void method2947(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static10.method384(false);
		Static2.aBoolean82 = arg0;
		Static6.anInt4953 = arg2;
		Static3.anInt2571 = arg1;
		Static19.method2402(arg3);
		Static3.aClass84_10 = new HashTable(8);
		Static3.aClass84_9 = new HashTable(8);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(BI)V")
	public static void method2689(@OriginalArg(1) int arg0) {
		for (@Pc(16) Node local16 = Static2.aClass84_5.head(); local16 != null; local16 = Static2.aClass84_5.next()) {
			if ((local16.key >> 48 & 0xFFFFL) == (long) arg0) {
				local16.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!fh;IBIIZ)V")
	public static void method2692(@OriginalArg(1) Js5 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static3.anInt5397 = 2;
		Static7.anInt6022 = arg2;
		Static2.aClass58_42 = arg0;
		Static6.aBoolean321 = false;
		Static2.anInt1244 = 0;
		Static7.anInt5391 = arg1;
		Static5.anInt4357 = 1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method2697() {
		Static32.method3956();
		Static35.method4313();
		Static36.method4448();
		LocTypeList.clear();
		NpcTypeList.clear();
		ObjTypeList.clear();
		Static27.method3180();
		Static31.method3745();
		Static25.method2924();
		Static33.method4200();
		Static30.method3601();
		Static28.method3281();
		Static25.method2925();
		Static13.method941();
		Static37.method4649();
		Static31.method3653();
		Static34.method4270();
		Static10.method898();
		Static31.method3688();
		if (client.modeWhat != 0) {
			for (@Pc(54) int local54 = 0; local54 < Static6.aByteArrayArray35.length; local54++) {
				Static6.aByteArrayArray35[local54] = null;
			}
			Static7.anInt5425 = 0;
		}
		Static10.method301();
		Static30.method420();
		Static9.method201();
		Static30.method3555();
		Static1.aClass26_3.clear();
		if (!Static3.aBoolean138) {
			((Class24_Sub1) Static4.anInterface4_1).method460();
		}
		Static5.aClass40_13.clear();
		client.js5Archive0.discardUnpacked();
		client.js5Archive1.discardUnpacked();
		client.js5Archive3.discardUnpacked();
		client.js5Archive4.discardUnpacked();
		client.js5Archive5.discardUnpacked();
		client.js5Archive6.discardUnpacked();
		client.js5Archive7.discardUnpacked();
		client.js5Archive8.discardUnpacked();
		client.js5Archive10.discardUnpacked();
		client.js5Archive11.discardUnpacked();
		client.js5Archive12.discardUnpacked();
		Static1.aClass26_5.clear();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method2699(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(8) short[] local8 = new short[16];
		arg1 = arg1.toLowerCase();
		@Pc(17) int local17 = arg0 ? 32768 : 0;
		@Pc(19) int local19 = 0;
		@Pc(27) int local27 = (arg0 ? Static7.anInt6046 : Static2.anInt912) + local17;
		for (@Pc(29) int local29 = local17; local29 < local27; local29++) {
			@Pc(40) Class4_Sub3_Sub11 local40 = Static26.method2991(local29);
			if (local40.aBoolean163 && local40.method1913().toLowerCase().indexOf(arg1) != -1) {
				if (local19 >= 50) {
					Static2.anInt5734 = -1;
					Static7.aShortArray114 = null;
					return;
				}
				if (local8.length <= local19) {
					@Pc(82) short[] local82 = new short[local8.length * 2];
					for (@Pc(84) int local84 = 0; local84 < local19; local84++) {
						local82[local84] = local8[local84];
					}
					local8 = local82;
				}
				local8[local19++] = (short) local29;
			}
		}
		Static4.anInt3497 = 0;
		Static2.anInt5734 = local19;
		@Pc(118) String[] local118 = new String[Static2.anInt5734];
		Static7.aShortArray114 = local8;
		for (@Pc(122) int local122 = 0; local122 < Static2.anInt5734; local122++) {
			local118[local122] = Static26.method2991(local8[local122]).method1913();
		}
		Static12.method714(Static7.aShortArray114, local118);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!fd;)Lclient!cd;")
	public static Class27 method2701(@OriginalArg(1) Buffer arg0) {
		@Pc(7) Class27 local7 = new Class27();
		local7.anInt540 = arg0.readUnsignedShort();
		local7.aClass4_Sub3_Sub11_1 = Static26.method2991(local7.anInt540);
		return local7;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public static void method2702(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static5.anInt3897 += arg0 * 128;
		if (Static2.anIntArray159.length < Static5.anInt3897) {
			Static5.anInt3897 -= Static2.anIntArray159.length;
			@Pc(41) int local41 = (int) (Math.random() * 12.0D);
			Static22.method2284(Static2.aClass56_Sub1Array1[local41]);
		}
		@Pc(48) int local48 = 0;
		@Pc(52) int local52 = arg0 * 128;
		@Pc(59) int local59 = (256 - arg0) * 128;
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			@Pc(94) int local94 = Static2.anIntArray100[local52 + local48] - arg0 * Static2.anIntArray159[Static5.anInt3897 + local48 & Static2.anIntArray159.length - 1] / 6;
			if (local94 < 0) {
				local94 = 0;
			}
			Static2.anIntArray100[local48++] = local94;
		}
		for (@Pc(114) int local114 = 256 - arg0; local114 < 256; local114++) {
			@Pc(125) int local125 = local114 * 128;
			for (@Pc(127) int local127 = 0; local127 < 128; local127++) {
				@Pc(135) int local135 = (int) (Math.random() * 100.0D);
				if (local135 < 50 && local127 > 10 && local127 < 118) {
					Static2.anIntArray100[local125 + local127] = 255;
				} else {
					Static2.anIntArray100[local125 + local127] = 0;
				}
			}
		}
		for (@Pc(170) int local170 = 0; local170 < 256 - arg0; local170++) {
			Static4.anIntArray314[local170] = Static4.anIntArray314[local170 + arg0];
		}
		for (@Pc(197) int local197 = 256 - arg0; local197 < 256; local197++) {
			Static4.anIntArray314[local197] = (int) (Math.sin((double) Static4.anInt2665 / 14.0D) * 16.0D + Math.sin((double) Static4.anInt2665 / 15.0D) * 14.0D + Math.sin((double) Static4.anInt2665 / 16.0D) * 12.0D);
			Static4.anInt2665++;
		}
		Static3.anInt2297 += arg0;
		@Pc(247) int local247 = (arg0 + (Static2.anInt954 & 0x1)) / 2;
		if (local247 <= 0) {
			return;
		}
		for (@Pc(251) int local251 = 0; local251 < Static3.anInt2297; local251++) {
			@Pc(261) int local261 = (int) (Math.random() * 124.0D) + 2;
			@Pc(268) int local268 = (int) (Math.random() * 128.0D) + 128;
			Static2.anIntArray100[(local268 << 7) + local261] = 192;
		}
		Static3.anInt2297 = 0;
		for (@Pc(283) int local283 = 0; local283 < 256; local283++) {
			@Pc(288) int local288 = 0;
			@Pc(292) int local292 = local283 * 128;
			for (@Pc(295) int local295 = -local247; local295 < 128; local295++) {
				if (local295 + local247 < 128) {
					local288 += Static2.anIntArray100[local247 + local295 + local292];
				}
				if (local295 - local247 - 1 >= 0) {
					local288 -= Static2.anIntArray100[local292 + local295 - local247 - 1];
				}
				if (local295 >= 0) {
					Static6.anIntArray541[local295 + local292] = local288 / (local247 * 2 + 1);
				}
			}
		}
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			@Pc(368) int local368 = 0;
			for (@Pc(371) int local371 = -local247; local371 < 256; local371++) {
				@Pc(382) int local382 = local371 * 128;
				if (local371 + local247 < 256) {
					local368 += Static6.anIntArray541[local382 + local361 + local247 * 128];
				}
				if (local371 - local247 - 1 >= 0) {
					local368 -= Static6.anIntArray541[local382 + local361 - local247 * 128 - 128];
				}
				if (local371 >= 0) {
					Static2.anIntArray100[local382 + local361] = local368 / (local247 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method2703(@OriginalArg(2) String arg0) {
		return Static30.method3614(16, arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!qc;I)V")
	public static void method2705(@OriginalArg(0) PathingEntity arg0) {
		if (Static2.anInt954 == arg0.anInt3966 || arg0.anInt4007 == -1 || arg0.anInt3996 != 0 || arg0.anInt4044 + 1 > Static23.method2494(arg0.anInt4007).anIntArray94[arg0.anInt3970]) {
			@Pc(41) int local41 = arg0.anInt3966 - arg0.anInt4034;
			@Pc(46) int local46 = Static2.anInt954 - arg0.anInt4034;
			@Pc(57) int local57 = arg0.anInt3973 * 128 + arg0.getSize() * 64;
			@Pc(71) int local71 = arg0.anInt4033 * 128 + arg0.getSize() * 64;
			@Pc(82) int local82 = arg0.anInt4013 * 128 + arg0.getSize() * 64;
			@Pc(95) int local95 = arg0.anInt4025 * 128 + arg0.getSize() * 64;
			arg0.z = ((local41 - local46) * local71 + local46 * local95) / local41;
			arg0.x = (local57 * (local41 - local46) + local82 * local46) / local41;
		}
		if (arg0.anInt4008 == 0) {
			arg0.anInt4017 = 1024;
		}
		if (arg0.anInt4008 == 1) {
			arg0.anInt4017 = 1536;
		}
		if (arg0.anInt4008 == 2) {
			arg0.anInt4017 = 0;
		}
		arg0.anInt4037 = 0;
		if (arg0.anInt4008 == 3) {
			arg0.anInt4017 = 512;
		}
		arg0.anInt4031 = arg0.anInt4017;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
	public static void method2708(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static3.aBoolean138 && arg0) {
			local11 = 1;
			local13 = Static1.aByteArrayArray3;
		} else {
			local13 = Static5.aByteArrayArray31;
			local11 = 4;
		}
		for (@Pc(27) int local27 = 0; local27 < local11; local27++) {
			Static9.method763();
			for (@Pc(38) int local38 = 0; local38 < 13; local38++) {
				for (@Pc(43) int local43 = 0; local43 < 13; local43++) {
					@Pc(54) int local54 = Static7.anIntArrayArrayArray15[local27][local38][local43];
					if (local54 != -1) {
						@Pc(63) int local63 = local54 >> 24 & 0x3;
						if (!arg0 || local63 == 0) {
							@Pc(77) int local77 = local54 >> 1 & 0x3;
							@Pc(83) int local83 = local54 >> 3 & 0x7FF;
							@Pc(89) int local89 = local54 >> 14 & 0x3FF;
							@Pc(99) int local99 = (local89 / 8 << 8) + local83 / 8;
							for (@Pc(101) int local101 = 0; local101 < Static7.anIntArray597.length; local101++) {
								if (local99 == Static7.anIntArray597[local101] && local13[local101] != null) {
									Static15.method1471(local27, local38 * 8, Static7.aClass30Array1, local13[local101], local77, (local83 & 0x7) * 8, (local89 & 0x7) * 8, local63, arg0, local43 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V")
	public static void method2710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class4_Sub3_Sub13 local17 = Static23.method2535(arg0, arg1, arg2);
		if (local17 == null) {
			return;
		}
		Static4.anIntArray272 = new int[local17.anInt2662];
		Static4.aStringArray21 = new String[local17.anInt2660];
		if (local17.anInt2656 == 15 || local17.anInt2656 == 17 || local17.anInt2656 == 16) {
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = 0;
			if (Static5.aClass185_12 != null) {
				local49 = Static5.aClass185_12.anInt5960;
				local51 = Static5.aClass185_12.anInt5888;
			}
			Static4.anIntArray272[1] = Mouse.y - local51;
			Static4.anIntArray272[0] = Mouse.x - local49;
		}
		Static16.method1551(200000, local17);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method2711(@OriginalArg(0) Js5 arg0) {
		Static4.anInt3250 = arg0.getGroupId("runes");
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lclient!fg;")
	public static Class4_Sub3_Sub7 method2713() {
		if (Static3.aClass175_12 == null) {
			return null;
		}
		for (@Pc(22) Class4_Sub3_Sub7 local22 = (Class4_Sub3_Sub7) Static1.aClass130_1.method3250(); local22 != null; local22 = (Class4_Sub3_Sub7) Static1.aClass130_1.method3250()) {
			@Pc(29) Class82 local29 = Static22.method2191(local22.anInt1760);
			if (local29 != null && local29.aBoolean157 && local29.method1810()) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lclient!ec;I)V")
	public static synchronized void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) Class43[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == Static4.anInt3332) {
			Static4.aClass112_22.addTail(new Class4_Sub28(arg0, arg1));
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()V")
	public static synchronized void method2716() {
		Static4.anInt3332++;
		Static4.aClass112_18.clear();
		Static4.aClass112_19.clear();
		Static4.aClass112_20.clear();
		Static4.aClass112_21.clear();
		Static4.aClass112_22.clear();
		Static4.aClass112_23.clear();
		Static4.anInt3331 = 0;
		Static4.anInt3333 = 0;
		Static4.anInt3330 = 0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public static synchronized void method2717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == Static4.anInt3332) {
			@Pc(7) IntNode local7 = new IntNode();
			local7.key = arg0;
			Static4.aClass112_21.addTail(local7);
		}
	}
}

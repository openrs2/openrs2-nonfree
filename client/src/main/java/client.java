import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends GameShell {

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
	public static int modeWhere = 0;

	@OriginalMember(owner = "client!vh", name = "hb", descriptor = "I")
	public static int modeWhat = 0;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
	public static int language = 0;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
	public static boolean javaScript = false;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Z")
	public static boolean advertSuppressed = false;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Z")
	public static boolean objectTag = false;

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
	public static int game = 0;

	@OriginalMember(owner = "client!qj", name = "jb", descriptor = "Ljava/lang/String;")
	public static String settings = null;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "Z")
	public static boolean haveIe6 = false;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
	public static int country;

	@OriginalMember(owner = "client!sn", name = "Y", descriptor = "I")
	public static int affiliate = 0;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
	private static int worldListWorldId = 1;

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "Ljava/lang/String;")
	public static String worldListHostname;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
	public static int worldListDefaultPort;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
	public static int worldListAlternatePort;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
	public static int worldListPort;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	public static int worldId = -1;

	@OriginalMember(owner = "client!se", name = "db", descriptor = "Ljava/lang/String;")
	public static String hostname;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public static int defaultPort;

	@OriginalMember(owner = "client!qc", name = "kc", descriptor = "I")
	public static int alternatePort;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
	public static int port;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!client;")
	public static client instance;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] args) {
		try {
			if (args.length != 4) {
				printUsage("argument count");
			}
			worldListWorldId = Integer.parseInt(args[0]);
			modeWhere = 2;
			if (args[1].equals("live")) {
				modeWhat = 0;
			} else if (args[1].equals("rc")) {
				modeWhat = 1;
			} else if (args[1].equals("wip")) {
				modeWhat = 2;
			} else {
				printUsage("modewhat");
			}
			advertSuppressed = false;
			language = Language.fromIsoCode(args[2]);
			if (language == -1) {
				if (args[2].equals("english")) {
					language = 0;
				} else if (args[2].equals("german")) {
					language = 1;
				} else {
					printUsage("language");
				}
			}
			LocalisedText.setLanguage(language);
			javaScript = false;
			objectTag = false;
			if (args[3].equals("game0")) {
				game = 0;
			} else if (args[3].equals("game1")) {
				game = 1;
			} else {
				printUsage("game");
			}
			settings = "";
			haveIe6 = false;
			country = 0;
			affiliate = 0;
			@Pc(131) client c = new client();
			instance = c;
			c.startApplication(modeWhat + 32, game == 1 ? "mechscape" : "openrs2");
			GameShell.frame.setLocation(40, 40);
		} catch (@Pc(156) Exception ex) {
			TracingException.report(ex, null);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void printUsage(@OriginalArg(1) String thing) {
		System.out.println("Bad " + thing + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method683() {
		for (Static6.anInt5088 = 0; Static22.method2361() && Static6.anInt5088 < 128; Static6.anInt5088++) {
			Static5.anIntArray441[Static6.anInt5088] = Static2.anInt1042;
			Static5.anIntArray419[Static6.anInt5088] = Static6.aChar4;
		}
		Static5.anInt4156++;
		if (Static3.anInt5398 != -1) {
			Static14.method1060(Static3.anInt5398, GameShell.canvasWidth, 0, 0, 0, 0, GameShell.canvasHeight);
		}
		Static6.anInt4979++;
		if (Static3.aBoolean138) {
			label195:
			for (@Pc(56) int local56 = 0; local56 < 32768; local56++) {
				@Pc(65) Class53_Sub1_Sub2 local65 = Static3.aClass53_Sub1_Sub2Array1[local56];
				if (local65 != null) {
					@Pc(71) byte local71 = local65.aClass168_1.aByte21;
					if ((local71 & 0x2) > 0 && local65.anInt3965 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(98) int local98 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(106) int local106 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local98 != 0 || local106 != 0) {
							local65.aByteArray51[0] = 1;
							local65.anIntArray422[0] = local98 + (local65.anInt3974 >> 7);
							local65.anIntArray426[0] = (local65.anInt4002 >> 7) + local106;
							Static7.aClass30Array1[Static7.anInt5334].method568(0, local65.anInt4002 >> 7, local65.method3311(), false, local65.anInt3974 >> 7, local65.method3311(), false);
							if (local65.anIntArray422[0] >= 0 && local65.anIntArray422[0] <= 104 - local65.method3311() && local65.anIntArray426[0] >= 0 && local65.anIntArray426[0] <= 104 - local65.method3311() && Static7.aClass30Array1[Static7.anInt5334].method575(local65.anIntArray426[0], local65.anInt4002 >> 7, local65.anIntArray422[0], local65.anInt3974 >> 7)) {
								if (local65.method3311() > 1) {
									for (@Pc(240) int local240 = local65.anIntArray422[0]; local240 < local65.anIntArray422[0] + local65.method3311(); local240++) {
										for (@Pc(256) int local256 = local65.anIntArray426[0]; local65.anIntArray426[0] + local65.method3311() > local256; local256++) {
											if ((Static7.aClass30Array1[Static7.anInt5334].anIntArrayArray6[local240][local256] & 0x2401FF) != 0) {
												continue label195;
											}
										}
									}
								}
								local65.anInt3965 = 1;
							}
						}
					}
					Static32.method4024(local65);
					Static34.method4247(local65);
					Static13.method939(local65);
					Static7.aClass30Array1[Static7.anInt5334].method567(false, false, local65.method3311(), local65.method3311(), local65.anInt4002 >> 7, local65.anInt3974 >> 7);
				}
			}
		}
		if (!Static3.aBoolean138 && game == 0) {
			Static14.method1059();
		} else if (Static3.anInt2574 == 0 && Static6.anInt4759 == 0) {
			if (Static1.anInt772 == 2) {
				Static23.method2537();
			} else {
				Static16.method1496();
			}
			if (Static3.anInt2519 >> 7 < 14 || Static3.anInt2519 >> 7 >= 90 || Static7.anInt5678 >> 7 < 14 || Static7.anInt5678 >> 7 >= 90) {
				Static28.method3322();
			}
		}
		while (true) {
			@Pc(389) Class4_Sub13 local389;
			@Pc(395) Class185 local395;
			@Pc(406) Class185 local406;
			do {
				local389 = (Class4_Sub13) Static2.aClass112_6.removeHead();
				if (local389 == null) {
					while (true) {
						@Pc(440) Class4_Sub13 local440;
						@Pc(448) Class185 local448;
						@Pc(460) Class185 local460;
						do {
							local440 = (Class4_Sub13) Static2.aClass112_10.removeHead();
							if (local440 == null) {
								while (true) {
									@Pc(489) Class4_Sub13 local489;
									@Pc(496) Class185 local496;
									@Pc(505) Class185 local505;
									do {
										local489 = (Class4_Sub13) Static3.aClass112_14.removeHead();
										if (local489 == null) {
											if (Static1.aClass185_1 != null) {
												Static14.method1047();
											}
											if (Static1.aClass197_1 != null && Static1.aClass197_1.status == 1) {
												if (Static1.aClass197_1.result != null) {
													Static37.method4719(Static6.aString269, Static4.aBoolean206);
												}
												Static1.aClass197_1 = null;
												Static4.aBoolean206 = false;
												Static6.aString269 = null;
											}
											if (Static2.anInt954 % 1500 == 0) {
												Static22.method2387();
											}
											return;
										}
										local496 = local489.aClass185_7;
										if (local496.anInt5968 < 0) {
											break;
										}
										local505 = Static19.method1813(local496.anInt5937);
									} while (local505 == null || local505.aClass185Array4 == null || local505.aClass185Array4.length <= local496.anInt5968 || local505.aClass185Array4[local496.anInt5968] != local496);
									Static21.method2019(local489);
								}
							}
							local448 = local440.aClass185_7;
							if (local448.anInt5968 < 0) {
								break;
							}
							local460 = Static19.method1813(local448.anInt5937);
						} while (local460 == null || local460.aClass185Array4 == null || local448.anInt5968 >= local460.aClass185Array4.length || local460.aClass185Array4[local448.anInt5968] != local448);
						Static21.method2019(local440);
					}
				}
				local395 = local389.aClass185_7;
				if (local395.anInt5968 < 0) {
					break;
				}
				local406 = Static19.method1813(local395.anInt5937);
			} while (local406 == null || local406.aClass185Array4 == null || local395.anInt5968 >= local406.aClass185Array4.length || local406.aClass185Array4[local395.anInt5968] != local395);
			Static21.method2019(local389);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method684(@OriginalArg(1) int arg0) {
		Static7.aClass51_2.state = arg0;
		Static3.aClass52_5 = null;
		Static7.aClass51_2.errors++;
		Static6.anInt4952 = 0;
		Static5.aClass197_4 = null;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method686() {
		if (!Static5.aBoolean278) {
			label264:
			while (true) {
				do {
					if (!Static22.method2361()) {
						break label264;
					}
				} while (Static6.aChar4 != 's' && Static6.aChar4 != 'S');
				Static5.aBoolean278 = true;
			}
		}
		if (Static5.anInt4285 == 0) {
			@Pc(32) Runtime local32 = Runtime.getRuntime();
			@Pc(41) int local41 = (int) (0L / 1024L);
			@Pc(44) long local44 = MonotonicClock.currentTimeMillis();
			if (Static2.aLong66 == 0L) {
				Static2.aLong66 = local44;
			}
			if (local41 > 16384 && local44 - Static2.aLong66 < 5000L) {
				if (local44 - Static3.aLong67 > 1000L) {
					System.gc();
					Static3.aLong67 = local44;
				}
				Static6.anInt4621 = 5;
				Static5.aString243 = LocalisedText.MAINLOAD0;
			} else {
				Static6.anInt4621 = 5;
				Static5.aString243 = LocalisedText.MAINLOAD0B;
				Static5.anInt4285 = 10;
			}
		} else if (Static5.anInt4285 == 10) {
			for (@Pc(93) int local93 = 0; local93 < 4; local93++) {
				Static7.aClass30Array1[local93] = new Class30(104, 104);
			}
			Static5.anInt4285 = 30;
			Static5.aString243 = LocalisedText.MAINLOAD10B;
			Static6.anInt4621 = 10;
		} else if (Static5.anInt4285 == 30) {
			if (Static1.aClass117_1 == null) {
				Static1.aClass117_1 = new Js5MasterIndex(Static7.aClass51_2, Static2.aClass92_1);
			}
			if (Static1.aClass117_1.isReady()) {
				Static3.aClass58_46 = Static27.method3231(true, false, 0, true);
				Static4.aClass58_66 = Static27.method3231(true, false, 1, true);
				Static2.aClass58_39 = Static27.method3231(false, true, 2, true);
				Static2.aClass58_27 = Static27.method3231(true, false, 3, true);
				Static6.aClass58_92 = Static27.method3231(true, false, 4, true);
				Static3.aClass58_47 = Static27.method3231(true, true, 5, true);
				Static7.aClass58_98 = Static27.method3231(true, true, 6, false);
				Static4.aClass58_69 = Static27.method3231(true, false, 7, true);
				Static1.aClass58_4 = Static27.method3231(true, false, 8, true);
				Static2.aClass58_29 = Static27.method3231(true, false, 9, true);
				Static6.aClass58_71 = Static27.method3231(true, false, 10, true);
				Static3.aClass58_57 = Static27.method3231(true, false, 11, true);
				Static4.aClass58_73 = Static27.method3231(true, false, 12, true);
				Static4.aClass58_67 = Static27.method3231(true, false, 13, true);
				Static5.aClass58_78 = Static27.method3231(true, false, 14, false);
				Static5.aClass58_83 = Static27.method3231(true, false, 15, true);
				Static4.aClass58_76 = Static27.method3231(true, false, 16, true);
				Static7.aClass58_96 = Static27.method3231(true, false, 17, true);
				Static6.aClass58_88 = Static27.method3231(true, false, 18, true);
				Static5.aClass58_79 = Static27.method3231(true, false, 19, true);
				Static1.aClass58_1 = Static27.method3231(true, false, 20, true);
				Static1.aClass58_24 = Static27.method3231(true, false, 21, true);
				Static1.aClass58_10 = Static27.method3231(true, false, 22, true);
				Static5.aClass58_82 = Static27.method3231(true, true, 23, true);
				Static6.aClass58_87 = Static27.method3231(true, false, 24, true);
				Static1.aClass58_30 = Static27.method3231(true, false, 25, true);
				Static4.aClass58_68 = Static27.method3231(true, true, 26, true);
				Static7.aClass58_102 = Static27.method3231(true, false, 27, true);
				Static5.aClass58_80 = Static27.method3231(true, true, 28, true);
				Static6.anInt4621 = 15;
				Static5.aString243 = LocalisedText.MAINLOAD30B;
				Static5.anInt4285 = 40;
			} else {
				Static6.anInt4621 = 12;
				Static5.aString243 = LocalisedText.MAINLOAD30;
			}
		} else if (Static5.anInt4285 == 40) {
			@Pc(355) int local355 = 0;
			for (@Pc(357) int local357 = 0; local357 < 29; local357++) {
				local355 += Static6.aClass62_Sub1Array2[local357].method4664() * Static1.anIntArray60[local357] / 100;
			}
			if (local355 == 100) {
				Static5.aString243 = LocalisedText.MAINLOAD40B;
				Static6.anInt4621 = 20;
				Static24.method2946(Static1.aClass58_4);
				Static31.method3154(Static1.aClass58_4);
				Static24.method2711(Static1.aClass58_4);
				Static5.anInt4285 = 41;
			} else {
				Static6.anInt4621 = 20;
				if (local355 != 0) {
					Static5.aString243 = LocalisedText.CHECKING_FOR_UPDATES + local355 + "%";
				}
			}
		} else if (Static5.anInt4285 == 41) {
			if (Static5.aClass58_80.fetchAll()) {
				this.method688(Static5.aClass58_80.fetchFile(1));
				Static5.anInt4285 = 45;
				Static5.aString243 = LocalisedText.MAINLOAD41B;
				Static6.anInt4621 = 25;
			} else {
				Static5.aString243 = LocalisedText.MAINLOAD41 + Static5.aClass58_80.getPercentageComplete() + "%";
				Static6.anInt4621 = 25;
			}
		} else if (Static5.anInt4285 == 45) {
			Static9.method175(Static7.aBoolean122);
			Static1.aClass4_Sub6_Sub2_2 = new Class4_Sub6_Sub2();
			Static1.aClass4_Sub6_Sub2_2.method2505();
			Static1.aClass102_1 = Static25.method2807(GameShell.canvas, 22050, GameShell.signLink, 0);
			Static1.aClass102_1.method3008(Static1.aClass4_Sub6_Sub2_2);
			Static36.method4551(Static1.aClass4_Sub6_Sub2_2, Static5.aClass58_83, Static5.aClass58_78, Static6.aClass58_92);
			Static6.aClass102_2 = Static25.method2807(GameShell.canvas, 2048, GameShell.signLink, 1);
			Static5.aClass4_Sub6_Sub3_2 = new Class4_Sub6_Sub3();
			Static6.aClass102_2.method3008(Static5.aClass4_Sub6_Sub3_2);
			Static7.aClass170_1 = new Class170(22050, Static7.anInt5394);
			Static7.anInt5611 = Static7.aClass58_98.getGroupId("scape main");
			Static5.aString243 = LocalisedText.MAINLOAD45B;
			Static5.anInt4285 = 50;
			Static6.anInt4621 = 30;
		} else if (Static5.anInt4285 == 50) {
			@Pc(540) int local540 = Static10.method464(Static4.aClass58_67, Static1.aClass58_4);
			@Pc(543) int local543 = Static16.method1565();
			if (local540 >= local543) {
				Static5.aString243 = LocalisedText.MAINLOAD50B;
				Static5.anInt4285 = 60;
				Static6.anInt4621 = 35;
			} else {
				Static6.anInt4621 = 35;
				Static5.aString243 = LocalisedText.MAINLOAD50 + local540 * 100 / local543 + "%";
			}
		} else if (Static5.anInt4285 == 60) {
			@Pc(582) int local582 = Static14.method1046(Static1.aClass58_4);
			@Pc(585) int local585 = Static10.method393();
			if (local585 <= local582) {
				Static5.anInt4285 = 65;
				Static6.anInt4621 = 40;
				Static5.aString243 = LocalisedText.MAINLOAD60B;
			} else {
				Static6.anInt4621 = 40;
				Static5.aString243 = LocalisedText.MAINLOAD60 + local582 * 100 / local585 + "%";
			}
		} else if (Static5.anInt4285 == 65) {
			Static8.method113(Static1.aClass58_4, Static4.aClass58_67);
			Static5.aString243 = LocalisedText.MAINLOAD65B;
			Static6.anInt4621 = 45;
			Static9.method233(5);
			Static5.anInt4285 = 70;
		} else if (Static5.anInt4285 == 70) {
			Static2.aClass58_39.fetchAll();
			@Pc(647) int local647 = Static2.aClass58_39.getPercentageComplete();
			Static4.aClass58_76.fetchAll();
			local647 += Static4.aClass58_76.getPercentageComplete();
			Static7.aClass58_96.fetchAll();
			local647 += Static7.aClass58_96.getPercentageComplete();
			Static6.aClass58_88.fetchAll();
			local647 += Static6.aClass58_88.getPercentageComplete();
			Static5.aClass58_79.fetchAll();
			local647 += Static5.aClass58_79.getPercentageComplete();
			Static1.aClass58_1.fetchAll();
			local647 += Static1.aClass58_1.getPercentageComplete();
			Static1.aClass58_24.fetchAll();
			local647 += Static1.aClass58_24.getPercentageComplete();
			Static1.aClass58_10.fetchAll();
			local647 += Static1.aClass58_10.getPercentageComplete();
			Static6.aClass58_87.fetchAll();
			local647 += Static6.aClass58_87.getPercentageComplete();
			Static1.aClass58_30.fetchAll();
			local647 += Static1.aClass58_30.getPercentageComplete();
			Static7.aClass58_102.fetchAll();
			local647 += Static7.aClass58_102.getPercentageComplete();
			if (local647 < 1100) {
				Static6.anInt4621 = 50;
				Static5.aString243 = LocalisedText.MAINLOAD70 + local647 / 11 + "%";
			} else {
				Static9.method231(Static2.aClass58_39);
				Static27.method3228(Static2.aClass58_39);
				Static36.method3814(Static2.aClass58_39);
				Static36.method4523(Static4.aClass58_69, Static2.aClass58_39);
				Static34.method4232(Static4.aClass58_76, Static4.aClass58_69);
				Static33.method4080(Static4.aClass58_69, Static6.aClass58_88);
				Static14.method1171(Static5.aClass58_79, Static2.aClass4_Sub3_Sub5_Sub2_2, Static4.aClass58_69);
				Static19.method1850(Static2.aClass58_39);
				Static37.method4785(Static1.aClass58_1, Static4.aClass58_66, Static3.aClass58_46);
				Static32.method3884(Static2.aClass58_39);
				Static22.method2362(Static1.aClass58_24, Static4.aClass58_69);
				Static33.method4198(Static1.aClass58_10);
				Static9.method262(Static2.aClass58_39);
				Static37.method4787(Static1.aClass58_4, Static4.aClass58_67, Static2.aClass58_27, Static4.aClass58_69);
				Static21.method2011(Static2.aClass58_39);
				Static20.method1964(Static7.aClass58_96);
				Static16.method1521(Static1.aClass58_30, new Class128(), Static6.aClass58_87);
				Static15.method1473(Static6.aClass58_87, Static1.aClass58_30);
				Static16.method1560(Static2.aClass58_39);
				Static24.method2599(Static2.aClass58_39);
				Static10.method346(Static2.aClass58_39);
				Static11.method514(Static2.aClass58_39, Static1.aClass58_4);
				Static8.method5(Static1.aClass58_4, Static2.aClass58_39);
				Static29.method3474(Static2.aClass58_39, Static1.aClass58_4);
				Static6.anInt4621 = 50;
				Static5.aString243 = LocalisedText.MAINLOAD70B;
				Static15.method1338();
				Static5.anInt4285 = 80;
			}
		} else if (Static5.anInt4285 == 80) {
			@Pc(884) int local884 = Static11.method558(Static1.aClass58_4);
			@Pc(887) int local887 = Static14.method1084();
			if (local884 >= local887) {
				Static35.method667(Static1.aClass58_4);
				Static5.aString243 = LocalisedText.MAINLOAD80B;
				Static6.anInt4621 = 60;
				Static5.anInt4285 = 90;
			} else {
				Static5.aString243 = LocalisedText.MAINLOAD80 + local884 * 100 / local887 + "%";
				Static6.anInt4621 = 60;
			}
		} else if (Static5.anInt4285 == 90) {
			if (Static4.aClass58_68.fetchAll()) {
				@Pc(960) Class24_Sub1 local960 = new Class24_Sub1(Static2.aClass58_29, Static4.aClass58_68, Static1.aClass58_4, 20, !Static6.aBoolean227);
				Static23.method2551(local960);
				if (Static1.anInt185 == 1) {
					Static23.method2539(0.9F);
				}
				if (Static1.anInt185 == 2) {
					Static23.method2539(0.8F);
				}
				if (Static1.anInt185 == 3) {
					Static23.method2539(0.7F);
				}
				if (Static1.anInt185 == 4) {
					Static23.method2539(0.6F);
				}
				Static6.anInt4621 = 70;
				Static5.aString243 = LocalisedText.MAINLOAD90B;
				Static5.anInt4285 = 100;
			} else {
				Static5.aString243 = LocalisedText.MAINLOAD90 + Static4.aClass58_68.getPercentageComplete() + "%";
				Static6.anInt4621 = 70;
			}
		} else if (Static5.anInt4285 == 100) {
			if (Static10.method398(Static1.aClass58_4)) {
				Static5.anInt4285 = 110;
			}
		} else if (Static5.anInt4285 == 110) {
			Static4.aClass99_1 = new Class99();
			GameShell.signLink.startThread(Static4.aClass99_1, 10);
			Static6.anInt4621 = 75;
			Static5.aString243 = LocalisedText.MAINLOAD110B;
			Static5.anInt4285 = 120;
		} else if (Static5.anInt4285 == 120) {
			if (Static6.aClass58_71.isFileReady("huffman", "")) {
				@Pc(1066) HuffmanCodec local1066 = new HuffmanCodec(Static6.aClass58_71.fetchFile("huffman", ""));
				Static20.method1978(local1066);
				Static5.aString243 = LocalisedText.MAINLOAD120B;
				Static6.anInt4621 = 80;
				Static5.anInt4285 = 130;
			} else {
				Static5.aString243 = LocalisedText.MAINLOAD120 + "0%";
				Static6.anInt4621 = 80;
			}
		} else if (Static5.anInt4285 == 130) {
			if (!Static2.aClass58_27.fetchAll()) {
				Static5.aString243 = LocalisedText.MAINLOAD130 + Static2.aClass58_27.getPercentageComplete() * 3 / 4 + "%";
				Static6.anInt4621 = 85;
			} else if (!Static4.aClass58_73.fetchAll()) {
				Static5.aString243 = LocalisedText.MAINLOAD130 + (Static4.aClass58_73.getPercentageComplete() / 10 + 75) + "%";
				Static6.anInt4621 = 85;
			} else if (!Static4.aClass58_67.fetchAll()) {
				Static5.aString243 = LocalisedText.MAINLOAD130 + (Static4.aClass58_67.getPercentageComplete() / 20 + 85) + "%";
				Static6.anInt4621 = 85;
			} else if (Static5.aClass58_82.isFileReady("details")) {
				Static19.method2393(Static5.aClass58_82);
				Static26.method2950(Static7.aClass58_102);
				Static13.method1028(Static4.aClass58_69);
				Static5.anInt4285 = 135;
				Static6.anInt4621 = 95;
				Static5.aString243 = LocalisedText.MAINLOAD130B;
			} else {
				Static5.aString243 = LocalisedText.MAINLOAD130 + (Static5.aClass58_82.getPercentageComplete("details") / 10 + 90) + "%";
				Static6.anInt4621 = 85;
			}
		} else if (Static5.anInt4285 == 135) {
			@Pc(1200) int local1200 = Static22.method2285();
			if (local1200 == -1) {
				Static5.aString243 = LocalisedText.MAINLOAD135;
				Static6.anInt4621 = 95;
			} else if (local1200 == 7 || local1200 == 9) {
				this.error("worldlistfull");
				Static9.method233(1000);
			} else if (Static6.aBoolean338) {
				Static6.anInt4621 = 96;
				Static5.anInt4285 = 140;
				Static5.aString243 = LocalisedText.MAINLOAD135B;
			} else {
				this.error("worldlistio_" + local1200);
				Static9.method233(1000);
			}
		} else if (Static5.anInt4285 == 140) {
			Static7.anInt742 = Static2.aClass58_27.getGroupId("loginscreen");
			Static3.aClass58_47.discardNames(false);
			Static7.aClass58_98.discardNames(true);
			Static1.aClass58_4.discardNames(true);
			Static4.aClass58_67.discardNames(true);
			Static6.aClass58_71.discardNames(true);
			Static2.aClass58_27.discardNames(true);
			Static7.aBoolean422 = true;
			Static5.anInt4285 = 150;
			Static5.aString243 = LocalisedText.MAINLOAD140;
			Static6.anInt4621 = 97;
		} else if (Static5.anInt4285 == 150) {
			Static19.method1859();
			if (Static5.aBoolean278) {
				Static5.anInt3637 = 0;
				Static1.anInt1051 = 0;
				Static2.anInt1125 = 0;
				Static5.anInt4291 = 0;
			}
			Static5.aBoolean278 = true;
			Static14.method1055(GameShell.signLink);
			Static35.method4512(false, Static5.anInt3637, -1, -1);
			Static6.anInt4621 = 100;
			Static5.aString243 = LocalisedText.MAINLOAD150B;
			Static5.anInt4285 = 160;
		} else if (Static5.anInt4285 == 160) {
			Static11.method605(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected final void mainQuit() {
		if (Static3.aBoolean138) {
			Static17.method1605();
		}
		if (GameShell.fullScreenFrame != null) {
			Static31.method3658(GameShell.signLink, GameShell.fullScreenFrame);
			GameShell.fullScreenFrame = null;
		}
		if (Static4.aClass99_1 != null) {
			Static4.aClass99_1.aBoolean185 = false;
		}
		Static4.aClass99_1 = null;
		if (Static3.aClass52_7 != null) {
			Static3.aClass52_7.close();
			Static3.aClass52_7 = null;
		}
		Static11.method588(GameShell.canvas);
		Static13.method891(GameShell.canvas);
		if (Static6.aClass19_1 != null) {
			Static6.aClass19_1.method894(GameShell.canvas);
		}
		Static11.method589();
		Static38.method4794();
		Static6.aClass19_1 = null;
		if (Static1.aClass102_1 != null) {
			Static1.aClass102_1.method3001();
		}
		if (Static6.aClass102_2 != null) {
			Static6.aClass102_2.method3001();
		}
		Static7.aClass51_2.stop();
		Static2.aClass92_1.stop();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected final void mainInit() {
		Static20.method1949();
		Static2.aClass92_1 = new Js5CacheQueue();
		Static7.aClass51_2 = new Js5NetQueue();
		if (modeWhat != 0) {
			Static6.aByteArrayArray35 = new byte[50][];
		}
		Static33.method4149(GameShell.signLink);
		if (modeWhere == 0) {
			worldListHostname = this.getCodeBase().getHost();
			worldListDefaultPort = 43594;
			worldListAlternatePort = 443;
		} else if (modeWhere == 1) {
			worldListHostname = this.getCodeBase().getHost();
			worldListDefaultPort = worldListWorldId + 40000;
			worldListAlternatePort = worldListWorldId + 50000;
		} else if (modeWhere == 2) {
			worldListHostname = "127.0.0.1";
			worldListDefaultPort = worldListWorldId + 40000;
			worldListAlternatePort = worldListWorldId + 50000;
		}
		Static7.aShortArray124 = Static5.aShortArray74 = Static7.aShortArray111 = Static4.aShortArray126 = new short[256];
		if (SignLink.anInt6106 == 3 && modeWhere != 2) {
			worldId = worldListWorldId;
		}
		if (game == 1) {
			Static1.aShortArrayArray1 = Static5.aShortArrayArray5;
			Static7.aShortArray113 = Static3.aShortArray35;
			Static4.aShortArray46 = Static3.aShortArray32;
			Static4.anInt3364 = 0xFFFFFF;
			Static4.anInt3365 = 0;
			Static2.aBoolean68 = true;
			Static6.aShortArrayArray6 = Static5.aShortArrayArray2;
		} else {
			Static6.aShortArrayArray6 = Static6.aShortArrayArray7;
			Static7.aShortArray113 = Static7.aShortArray115;
			Static1.aShortArrayArray1 = Static7.aShortArrayArray8;
			Static4.aShortArray46 = Static1.aShortArray11;
		}
		defaultPort = worldListDefaultPort;
		alternatePort = worldListAlternatePort;
		hostname = worldListHostname;
		worldListPort = worldListDefaultPort;
		port = worldListPort;
		Static15.method1402();
		Static20.method1926(GameShell.canvas);
		Static13.method883(GameShell.canvas);
		Static6.aClass19_1 = Static10.method345();
		if (Static6.aClass19_1 != null) {
			Static6.aClass19_1.method900(GameShell.canvas);
		}
		Static5.anInt3815 = SignLink.anInt6106;
		try {
			if (GameShell.signLink.cacheData != null) {
				Static3.aClass189_4 = new BufferedFile(GameShell.signLink.cacheData, 5200, 0);
				for (@Pc(174) int local174 = 0; local174 < 29; local174++) {
					Static4.aClass189Array1[local174] = new BufferedFile(GameShell.signLink.cacheIndexes[local174], 6000, 0);
				}
				Static3.aClass189_5 = new BufferedFile(GameShell.signLink.cacheMasterIndex, 6000, 0);
				Static1.aClass60_2 = new Cache(Static3.aClass189_4, Static3.aClass189_5, 255, 500000);
				Static1.aClass189_1 = new BufferedFile(GameShell.signLink.uid, 24, 0);
				GameShell.signLink.cacheMasterIndex = null;
				GameShell.signLink.cacheIndexes = null;
				GameShell.signLink.cacheData = null;
				GameShell.signLink.uid = null;
			}
		} catch (@Pc(230) IOException local230) {
			Static1.aClass189_1 = null;
			Static3.aClass189_5 = null;
			Static1.aClass60_2 = null;
			Static3.aClass189_4 = null;
		}
		if (modeWhere != 0) {
			Static3.aBoolean176 = true;
		}
		if (game == 0) {
			Static5.aString255 = LocalisedText.GAME0_LOADING;
		} else if (game == 1) {
			Static5.aString255 = LocalisedText.GAME1_LOADING;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method688(@OriginalArg(0) byte[] arg0) {
		@Pc(11) Buffer local11 = new Buffer(arg0);
		while (true) {
			@Pc(15) int local15 = local11.readUnsignedByte();
			if (local15 == 0) {
				return;
			}
			if (local15 == 1) {
				@Pc(31) int[] local31 = Static2.anIntArray163 = new int[6];
				local31[0] = local11.readUnsignedShort();
				local31[1] = local11.readUnsignedShort();
				local31[2] = local11.readUnsignedShort();
				local31[3] = local11.readUnsignedShort();
				local31[4] = local11.readUnsignedShort();
				local31[5] = local11.readUnsignedShort();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method689() {
		@Pc(3) boolean local3 = Static7.aClass51_2.tick();
		if (!local3) {
			this.method690();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method690() {
		if (Static7.aClass51_2.errors > Static4.anInt3357) {
			Static2.anInt5721 = (Static7.aClass51_2.errors * 50 - 50) * 5;
			if (Static2.anInt5721 > 3000) {
				Static2.anInt5721 = 3000;
			}
			if (port == defaultPort) {
				port = alternatePort;
			} else {
				port = defaultPort;
			}
			if (Static7.aClass51_2.errors >= 2 && Static7.aClass51_2.state == 6) {
				this.error("js5connect_outofdate");
				Static4.anInt3304 = 1000;
				return;
			}
			if (Static7.aClass51_2.errors >= 4 && Static7.aClass51_2.state == -1) {
				this.error("js5crc");
				Static4.anInt3304 = 1000;
				return;
			}
			if (Static7.aClass51_2.errors >= 4 && (Static4.anInt3304 == 0 || Static4.anInt3304 == 5)) {
				if (Static7.aClass51_2.state == 7 || Static7.aClass51_2.state == 9) {
					this.error("js5connect_full");
				} else if (Static7.aClass51_2.state <= 0) {
					this.error("js5io");
				} else {
					this.error("js5connect");
				}
				Static4.anInt3304 = 1000;
				return;
			}
		}
		Static4.anInt3357 = Static7.aClass51_2.errors;
		if (Static2.anInt5721 > 0) {
			Static2.anInt5721--;
			return;
		}
		try {
			if (Static6.anInt4952 == 0) {
				Static5.aClass197_4 = GameShell.signLink.openSocket(hostname, port);
				Static6.anInt4952++;
			}
			if (Static6.anInt4952 == 1) {
				if (Static5.aClass197_4.status == 2) {
					this.method684(1000);
					return;
				}
				if (Static5.aClass197_4.status == 1) {
					Static6.anInt4952++;
				}
			}
			if (Static6.anInt4952 == 2) {
				Static3.aClass52_5 = new BufferedSocket((Socket) Static5.aClass197_4.result, GameShell.signLink);
				@Pc(198) Buffer local198 = new Buffer(5);
				local198.writeByte(15);
				local198.writeInt(550);
				Static3.aClass52_5.write(local198.bytes, 5);
				Static6.anInt4952++;
				Static1.aLong29 = MonotonicClock.currentTimeMillis();
			}
			if (Static6.anInt4952 == 3) {
				if (Static4.anInt3304 == 0 || Static4.anInt3304 == 5 || Static3.aClass52_5.available() > 0) {
					@Pc(259) int local259 = Static3.aClass52_5.read();
					if (local259 != 0) {
						this.method684(local259);
						return;
					}
					Static6.anInt4952++;
				} else if (MonotonicClock.currentTimeMillis() - Static1.aLong29 > 30000L) {
					this.method684(1001);
					return;
				}
			}
			if (Static6.anInt4952 == 4) {
				@Pc(288) boolean local288 = Static4.anInt3304 == 5 || Static4.anInt3304 == 10 || Static4.anInt3304 == 28;
				Static7.aClass51_2.start(Static3.aClass52_5, !local288);
				Static5.aClass197_4 = null;
				Static6.anInt4952 = 0;
				Static3.aClass52_5 = null;
			}
		} catch (@Pc(305) IOException local305) {
			this.method684(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected final void reset() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public final void init() {
		if (!this.isHostnameValid()) {
			return;
		}
		worldListWorldId = Integer.parseInt(this.getParameter("worldid"));
		modeWhere = Integer.parseInt(this.getParameter("modewhere"));
		if (modeWhere < 0 || modeWhere > 1) {
			modeWhere = 0;
		}
		modeWhat = Integer.parseInt(this.getParameter("modewhat"));
		if (modeWhat < 0 || modeWhat > 2) {
			modeWhat = 0;
		}
		@Pc(48) String advertSuppressedStr = this.getParameter("advertsuppressed");
		if (advertSuppressedStr != null && advertSuppressedStr.equals("1")) {
			advertSuppressed = true;
		} else {
			advertSuppressed = false;
		}
		try {
			language = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(67) Exception local67) {
			language = 0;
		}
		LocalisedText.setLanguage(language);
		@Pc(76) String objectTagStr = this.getParameter("objecttag");
		if (objectTagStr != null && objectTagStr.equals("1")) {
			objectTag = true;
		} else {
			objectTag = false;
		}
		@Pc(92) String javaScriptStr = this.getParameter("js");
		if (javaScriptStr != null && javaScriptStr.equals("1")) {
			javaScript = true;
		} else {
			javaScript = false;
		}
		@Pc(108) String gameStr = this.getParameter("game");
		if (gameStr != null && gameStr.equals("1")) {
			game = 1;
		} else {
			game = 0;
		}
		try {
			affiliate = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(128) Exception ex) {
			affiliate = 0;
		}
		settings = this.getParameter("settings");
		if (settings == null) {
			settings = "";
		}
		@Pc(143) String countryStr = this.getParameter("country");
		if (countryStr != null) {
			try {
				country = Integer.parseInt(countryStr);
			} catch (@Pc(152) Exception ex) {
				country = 0;
			}
		}
		@Pc(158) String haveIe6Str = this.getParameter("haveie6");
		if (haveIe6Str != null && haveIe6Str.equals("1")) {
			haveIe6 = true;
		} else {
			haveIe6 = false;
		}
		instance = this;
		this.startApplet(modeWhat + 32);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected final void mainRedraw() {
		if (Static4.anInt3304 == 1000) {
			return;
		}
		@Pc(26) long local26 = GameShell.time() / 1000000L - Static1.aLong24;
		Static1.aLong24 = GameShell.time() / 1000000L;
		@Pc(34) boolean local34 = Static12.method639();
		if (local34 && Static4.aBoolean210 && Static1.aClass102_1 != null) {
			Static1.aClass102_1.method3009();
		}
		if ((Static4.anInt3304 == 30 || Static4.anInt3304 == 10) && (GameShell.replaceCanvas || Static1.aLong15 != 0L && Static1.aLong15 < MonotonicClock.currentTimeMillis())) {
			Static35.method4512(GameShell.replaceCanvas, Static11.method557(), Static4.anInt3403, Static3.anInt2627);
		}
		if (GameShell.fullScreenFrame == null) {
			@Pc(79) Container local79;
			if (GameShell.fullScreenFrame != null) {
				local79 = GameShell.fullScreenFrame;
			} else if (GameShell.frame == null) {
				local79 = GameShell.signLink.applet;
			} else {
				local79 = GameShell.frame;
			}
			@Pc(95) int local95 = local79.getSize().width;
			@Pc(99) int local99 = local79.getSize().height;
			if (GameShell.frame == local79) {
				@Pc(106) Insets local106 = GameShell.frame.getInsets();
				local95 -= local106.left + local106.right;
				local99 -= local106.bottom + local106.top;
			}
			if (GameShell.frameWidth != local95 || GameShell.frameHeight != local99) {
				Static20.method1949();
				Static1.aLong15 = MonotonicClock.currentTimeMillis() + 500L;
			}
		}
		if (GameShell.fullScreenFrame != null && !GameShell.focus && (Static4.anInt3304 == 30 || Static4.anInt3304 == 10)) {
			Static35.method4512(false, Static5.anInt3637, -1, -1);
		}
		@Pc(173) boolean local173 = false;
		if (GameShell.fullRedraw) {
			local173 = true;
			GameShell.fullRedraw = false;
		}
		if (local173) {
			Static29.method3430();
		}
		if (Static3.aBoolean138) {
			for (@Pc(188) int local188 = 0; local188 < 100; local188++) {
				Static2.aBooleanArray8[local188] = true;
			}
		}
		if (Static4.anInt3304 == 0) {
			Static9.method202(null, local173, Static6.anInt4621, Static5.aString243);
		} else if (Static4.anInt3304 == 5) {
			Static28.method3331(false, Static5.aClass4_Sub3_Sub5_3);
		} else if (Static4.anInt3304 == 10) {
			Static18.method1714();
		} else if (Static4.anInt3304 == 25 || Static4.anInt3304 == 28) {
			if (Static6.anInt4659 == 1) {
				if (Static3.anInt2886 > Static6.anInt4398) {
					Static6.anInt4398 = Static3.anInt2886;
				}
				@Pc(267) int local267 = (Static6.anInt4398 - Static3.anInt2886) * 50 / Static6.anInt4398;
				Static37.method4716(LocalisedText.LOADING + "<br>(" + local267 + "%)", false);
			} else if (Static6.anInt4659 == 2) {
				if (Static7.anInt5486 > Static7.anInt5473) {
					Static7.anInt5473 = Static7.anInt5486;
				}
				@Pc(305) int local305 = (Static7.anInt5473 - Static7.anInt5486) * 50 / Static7.anInt5473 + 50;
				Static37.method4716(LocalisedText.LOADING + "<br>(" + local305 + "%)", false);
			} else {
				Static37.method4716(LocalisedText.LOADING, false);
			}
		} else if (Static4.anInt3304 == 30) {
			Static35.method4304(local26);
		} else if (Static4.anInt3304 == 40) {
			Static37.method4716(LocalisedText.CONLOST + "<br>" + LocalisedText.ATTEMPT_TO_REESTABLISH, false);
		}
		if (Static3.aBoolean138 && Static4.anInt3304 != 0) {
			Static17.method1622();
			for (@Pc(436) int local436 = 0; local436 < Static1.anInt113; local436++) {
				Static6.aBooleanArray24[local436] = false;
			}
		} else if ((Static4.anInt3304 == 30 || Static4.anInt3304 == 10) && Static1.anInt268 == 0 && !local173) {
			try {
				@Pc(391) Graphics local391 = GameShell.canvas.getGraphics();
				for (@Pc(393) int local393 = 0; local393 < Static1.anInt113; local393++) {
					if (Static6.aBooleanArray24[local393]) {
						Static4.aClass59_1.method4240(Static5.anIntArray383[local393], Static7.anIntArray638[local393], Static7.anIntArray616[local393], local391, Static6.anIntArray540[local393]);
						Static6.aBooleanArray24[local393] = false;
					}
				}
			} catch (@Pc(429) Exception local429) {
				GameShell.canvas.repaint();
			}
		} else if (Static4.anInt3304 != 0) {
			try {
				@Pc(364) Graphics local364 = GameShell.canvas.getGraphics();
				Static4.aClass59_1.method4238(local364);
				for (@Pc(372) int local372 = 0; local372 < Static1.anInt113; local372++) {
					Static6.aBooleanArray24[local372] = false;
				}
			} catch (@Pc(384) Exception local384) {
				GameShell.canvas.repaint();
			}
		}
		if (Static7.aBoolean422) {
			Static31.method3798();
		}
		if (Static5.aBoolean278 && Static4.anInt3304 == 10 && Static3.anInt5398 != -1) {
			Static5.aBoolean278 = false;
			Static14.method1055(GameShell.signLink);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected final void mainLoop() {
		if (Static4.anInt3304 == 1000) {
			return;
		}
		Static2.anInt954++;
		if (Static2.anInt954 % 1000 == 1) {
			@Pc(25) GregorianCalendar local25 = new GregorianCalendar();
			Static2.anInt1976 = local25.get(11) * 600 + local25.get(12) * 10 + local25.get(13) / 6;
			Static5.aRandom1.setSeed((long) Static2.anInt1976);
		}
		this.method689();
		if (Static1.aClass117_1 != null) {
			Static1.aClass117_1.method2706();
		}
		Static30.method3551();
		Static9.method763();
		Static30.method3547();
		Static11.method587();
		if (Static3.aBoolean138) {
			Static25.method2719();
		}
		if (Static6.aClass19_1 != null) {
			@Pc(73) int local73 = Static6.aClass19_1.method899();
			Static3.anInt2885 = local73;
		}
		if (Static4.anInt3304 == 0) {
			this.method686();
			GameShell.resetTimer();
		} else if (Static4.anInt3304 == 5) {
			this.method686();
			GameShell.resetTimer();
		} else if (Static4.anInt3304 == 25 || Static4.anInt3304 == 28) {
			Static33.method3000();
		}
		if (Static4.anInt3304 == 10) {
			this.method683();
			Static35.method4382();
			Static14.method1100();
			Static30.method3600();
		} else if (Static4.anInt3304 == 30) {
			Static29.method3476();
		} else if (Static4.anInt3304 == 40) {
			Static30.method3600();
			if (Static2.anInt1641 != -3) {
				if (Static2.anInt1641 == 15) {
					Static25.method2930();
				} else if (Static2.anInt1641 != 2) {
					Static19.method1818();
				}
			}
		}
	}
}

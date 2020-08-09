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
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static14.method1071("argument count");
			}
			Static5.anInt4213 = Integer.parseInt(arg0[0]);
			Static4.anInt3406 = 2;
			if (arg0[1].equals("live")) {
				Static7.anInt5543 = 0;
			} else if (arg0[1].equals("rc")) {
				Static7.anInt5543 = 1;
			} else if (arg0[1].equals("wip")) {
				Static7.anInt5543 = 2;
			} else {
				Static14.method1071("modewhat");
			}
			Static1.aBoolean52 = false;
			Static1.anInt124 = Static19.method1817(arg0[2]);
			if (Static1.anInt124 == -1) {
				if (arg0[2].equals("english")) {
					Static1.anInt124 = 0;
				} else if (arg0[2].equals("german")) {
					Static1.anInt124 = 1;
				} else {
					Static14.method1071("language");
				}
			}
			Static19.method1776(Static1.anInt124);
			Static2.aBoolean102 = false;
			Static4.aBoolean231 = false;
			if (arg0[3].equals("game0")) {
				Static2.anInt5720 = 0;
			} else if (arg0[3].equals("game1")) {
				Static2.anInt5720 = 1;
			} else {
				Static14.method1071("game");
			}
			Static6.aString261 = "";
			Static2.aBoolean118 = false;
			Static5.anInt6076 = 0;
			Static6.anInt4938 = 0;
			@Pc(131) client local131 = new client();
			Static7.aClient1 = local131;
			local131.method679(Static7.anInt5543 + 32, Static2.anInt5720 == 1 ? "mechscape" : "openrs2");
			Static4.aFrame2.setLocation(40, 40);
		} catch (@Pc(156) Exception local156) {
			Static26.method3059(local156, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method683() {
		for (Static6.anInt5088 = 0; Static22.method2361() && Static6.anInt5088 < 128; Static6.anInt5088++) {
			Static5.anIntArray441[Static6.anInt5088] = Static2.anInt1042;
			Static5.anIntArray419[Static6.anInt5088] = Static6.aChar4;
		}
		Static5.anInt4156++;
		if (Static3.anInt5398 != -1) {
			Static14.method1060(Static3.anInt5398, Static1.anInt526, 0, 0, 0, 0, Static1.anInt690);
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
		if (!Static3.aBoolean138 && Static2.anInt5720 == 0) {
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
				local389 = (Class4_Sub13) Static2.aClass112_6.method2608();
				if (local389 == null) {
					while (true) {
						@Pc(440) Class4_Sub13 local440;
						@Pc(448) Class185 local448;
						@Pc(460) Class185 local460;
						do {
							local440 = (Class4_Sub13) Static2.aClass112_10.method2608();
							if (local440 == null) {
								while (true) {
									@Pc(489) Class4_Sub13 local489;
									@Pc(496) Class185 local496;
									@Pc(505) Class185 local505;
									do {
										local489 = (Class4_Sub13) Static3.aClass112_14.method2608();
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
		Static7.aClass51_2.anInt1359 = arg0;
		Static3.aClass52_5 = null;
		Static7.aClass51_2.anInt1358++;
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
				Static5.aString243 = Static4.aString160;
			} else {
				Static6.anInt4621 = 5;
				Static5.aString243 = Static6.aString262;
				Static5.anInt4285 = 10;
			}
		} else if (Static5.anInt4285 == 10) {
			for (@Pc(93) int local93 = 0; local93 < 4; local93++) {
				Static7.aClass30Array1[local93] = new Class30(104, 104);
			}
			Static5.anInt4285 = 30;
			Static5.aString243 = Static7.aString317;
			Static6.anInt4621 = 10;
		} else if (Static5.anInt4285 == 30) {
			if (Static1.aClass117_1 == null) {
				Static1.aClass117_1 = new Class117(Static7.aClass51_2, Static2.aClass92_1);
			}
			if (Static1.aClass117_1.method2707()) {
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
				Static5.aString243 = Static1.aString23;
				Static5.anInt4285 = 40;
			} else {
				Static6.anInt4621 = 12;
				Static5.aString243 = Static7.aString364;
			}
		} else if (Static5.anInt4285 == 40) {
			@Pc(355) int local355 = 0;
			for (@Pc(357) int local357 = 0; local357 < 29; local357++) {
				local355 += Static6.aClass62_Sub1Array2[local357].method4664() * Static1.anIntArray60[local357] / 100;
			}
			if (local355 == 100) {
				Static5.aString243 = Static4.aString199;
				Static6.anInt4621 = 20;
				Static24.method2946(Static1.aClass58_4);
				Static31.method3154(Static1.aClass58_4);
				Static24.method2711(Static1.aClass58_4);
				Static5.anInt4285 = 41;
			} else {
				Static6.anInt4621 = 20;
				if (local355 != 0) {
					Static5.aString243 = Static6.aString275 + local355 + "%";
				}
			}
		} else if (Static5.anInt4285 == 41) {
			if (Static5.aClass58_80.method1360()) {
				this.method688(Static5.aClass58_80.method1343(1));
				Static5.anInt4285 = 45;
				Static5.aString243 = Static1.aString7;
				Static6.anInt4621 = 25;
			} else {
				Static5.aString243 = Static3.aString149 + Static5.aClass58_80.method1345() + "%";
				Static6.anInt4621 = 25;
			}
		} else if (Static5.anInt4285 == 45) {
			Static9.method175(Static7.aBoolean122);
			Static1.aClass4_Sub6_Sub2_2 = new Class4_Sub6_Sub2();
			Static1.aClass4_Sub6_Sub2_2.method2505();
			Static1.aClass102_1 = Static25.method2807(Static5.aCanvas115, 22050, Static7.aClass196_4, 0);
			Static1.aClass102_1.method3008(Static1.aClass4_Sub6_Sub2_2);
			Static36.method4551(Static1.aClass4_Sub6_Sub2_2, Static5.aClass58_83, Static5.aClass58_78, Static6.aClass58_92);
			Static6.aClass102_2 = Static25.method2807(Static5.aCanvas115, 2048, Static7.aClass196_4, 1);
			Static5.aClass4_Sub6_Sub3_2 = new Class4_Sub6_Sub3();
			Static6.aClass102_2.method3008(Static5.aClass4_Sub6_Sub3_2);
			Static7.aClass170_1 = new Class170(22050, Static7.anInt5394);
			Static7.anInt5611 = Static7.aClass58_98.method1362("scape main");
			Static5.aString243 = Static4.aString211;
			Static5.anInt4285 = 50;
			Static6.anInt4621 = 30;
		} else if (Static5.anInt4285 == 50) {
			@Pc(540) int local540 = Static10.method464(Static4.aClass58_67, Static1.aClass58_4);
			@Pc(543) int local543 = Static16.method1565();
			if (local540 >= local543) {
				Static5.aString243 = Static5.aString218;
				Static5.anInt4285 = 60;
				Static6.anInt4621 = 35;
			} else {
				Static6.anInt4621 = 35;
				Static5.aString243 = Static5.aString233 + local540 * 100 / local543 + "%";
			}
		} else if (Static5.anInt4285 == 60) {
			@Pc(582) int local582 = Static14.method1046(Static1.aClass58_4);
			@Pc(585) int local585 = Static10.method393();
			if (local585 <= local582) {
				Static5.anInt4285 = 65;
				Static6.anInt4621 = 40;
				Static5.aString243 = Static5.aString240;
			} else {
				Static6.anInt4621 = 40;
				Static5.aString243 = Static1.aString56 + local582 * 100 / local585 + "%";
			}
		} else if (Static5.anInt4285 == 65) {
			Static8.method113(Static1.aClass58_4, Static4.aClass58_67);
			Static5.aString243 = Static3.aString147;
			Static6.anInt4621 = 45;
			Static9.method233(5);
			Static5.anInt4285 = 70;
		} else if (Static5.anInt4285 == 70) {
			Static2.aClass58_39.method1360();
			@Pc(647) int local647 = Static2.aClass58_39.method1345();
			Static4.aClass58_76.method1360();
			local647 += Static4.aClass58_76.method1345();
			Static7.aClass58_96.method1360();
			local647 += Static7.aClass58_96.method1345();
			Static6.aClass58_88.method1360();
			local647 += Static6.aClass58_88.method1345();
			Static5.aClass58_79.method1360();
			local647 += Static5.aClass58_79.method1345();
			Static1.aClass58_1.method1360();
			local647 += Static1.aClass58_1.method1345();
			Static1.aClass58_24.method1360();
			local647 += Static1.aClass58_24.method1345();
			Static1.aClass58_10.method1360();
			local647 += Static1.aClass58_10.method1345();
			Static6.aClass58_87.method1360();
			local647 += Static6.aClass58_87.method1345();
			Static1.aClass58_30.method1360();
			local647 += Static1.aClass58_30.method1345();
			Static7.aClass58_102.method1360();
			local647 += Static7.aClass58_102.method1345();
			if (local647 < 1100) {
				Static6.anInt4621 = 50;
				Static5.aString243 = Static1.aString30 + local647 / 11 + "%";
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
				Static5.aString243 = Static4.aString368;
				Static15.method1338();
				Static5.anInt4285 = 80;
			}
		} else if (Static5.anInt4285 == 80) {
			@Pc(884) int local884 = Static11.method558(Static1.aClass58_4);
			@Pc(887) int local887 = Static14.method1084();
			if (local884 >= local887) {
				Static35.method667(Static1.aClass58_4);
				Static5.aString243 = Static6.aString265;
				Static6.anInt4621 = 60;
				Static5.anInt4285 = 90;
			} else {
				Static5.aString243 = Static7.aString369 + local884 * 100 / local887 + "%";
				Static6.anInt4621 = 60;
			}
		} else if (Static5.anInt4285 == 90) {
			if (Static4.aClass58_68.method1360()) {
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
				Static5.aString243 = Static5.aString256;
				Static5.anInt4285 = 100;
			} else {
				Static5.aString243 = Static6.aString290 + Static4.aClass58_68.method1345() + "%";
				Static6.anInt4621 = 70;
			}
		} else if (Static5.anInt4285 == 100) {
			if (Static10.method398(Static1.aClass58_4)) {
				Static5.anInt4285 = 110;
			}
		} else if (Static5.anInt4285 == 110) {
			Static4.aClass99_1 = new Class99();
			Static7.aClass196_4.startThread(Static4.aClass99_1, 10);
			Static6.anInt4621 = 75;
			Static5.aString243 = Static4.aString200;
			Static5.anInt4285 = 120;
		} else if (Static5.anInt4285 == 120) {
			if (Static6.aClass58_71.method1340("huffman", "")) {
				@Pc(1066) Class129 local1066 = new Class129(Static6.aClass58_71.method1358("", "huffman"));
				Static20.method1978(local1066);
				Static5.aString243 = Static3.aString121;
				Static6.anInt4621 = 80;
				Static5.anInt4285 = 130;
			} else {
				Static5.aString243 = Static2.aString82 + "0%";
				Static6.anInt4621 = 80;
			}
		} else if (Static5.anInt4285 == 130) {
			if (!Static2.aClass58_27.method1360()) {
				Static5.aString243 = Static7.aString329 + Static2.aClass58_27.method1345() * 3 / 4 + "%";
				Static6.anInt4621 = 85;
			} else if (!Static4.aClass58_73.method1360()) {
				Static5.aString243 = Static7.aString329 + (Static4.aClass58_73.method1345() / 10 + 75) + "%";
				Static6.anInt4621 = 85;
			} else if (!Static4.aClass58_67.method1360()) {
				Static5.aString243 = Static7.aString329 + (Static4.aClass58_67.method1345() / 20 + 85) + "%";
				Static6.anInt4621 = 85;
			} else if (Static5.aClass58_82.method1365("details")) {
				Static19.method2393(Static5.aClass58_82);
				Static26.method2950(Static7.aClass58_102);
				Static13.method1028(Static4.aClass58_69);
				Static5.anInt4285 = 135;
				Static6.anInt4621 = 95;
				Static5.aString243 = Static3.aString150;
			} else {
				Static5.aString243 = Static7.aString329 + (Static5.aClass58_82.method1342("details") / 10 + 90) + "%";
				Static6.anInt4621 = 85;
			}
		} else if (Static5.anInt4285 == 135) {
			@Pc(1200) int local1200 = Static22.method2285();
			if (local1200 == -1) {
				Static5.aString243 = Static4.aString206;
				Static6.anInt4621 = 95;
			} else if (local1200 == 7 || local1200 == 9) {
				this.method670("worldlistfull");
				Static9.method233(1000);
			} else if (Static6.aBoolean338) {
				Static6.anInt4621 = 96;
				Static5.anInt4285 = 140;
				Static5.aString243 = Static2.aString80;
			} else {
				this.method670("worldlistio_" + local1200);
				Static9.method233(1000);
			}
		} else if (Static5.anInt4285 == 140) {
			Static7.anInt742 = Static2.aClass58_27.method1362("loginscreen");
			Static3.aClass58_47.method1356(false);
			Static7.aClass58_98.method1356(true);
			Static1.aClass58_4.method1356(true);
			Static4.aClass58_67.method1356(true);
			Static6.aClass58_71.method1356(true);
			Static2.aClass58_27.method1356(true);
			Static7.aBoolean422 = true;
			Static5.anInt4285 = 150;
			Static5.aString243 = Static2.aString83;
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
			Static14.method1055(Static7.aClass196_4);
			Static35.method4512(false, Static5.anInt3637, -1, -1);
			Static6.anInt4621 = 100;
			Static5.aString243 = Static3.aString112;
			Static5.anInt4285 = 160;
		} else if (Static5.anInt4285 == 160) {
			Static11.method605(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected final void method672() {
		if (Static3.aBoolean138) {
			Static17.method1605();
		}
		if (Static3.aFrame1 != null) {
			Static31.method3658(Static7.aClass196_4, Static3.aFrame1);
			Static3.aFrame1 = null;
		}
		if (Static4.aClass99_1 != null) {
			Static4.aClass99_1.aBoolean185 = false;
		}
		Static4.aClass99_1 = null;
		if (Static3.aClass52_7 != null) {
			Static3.aClass52_7.method1103();
			Static3.aClass52_7 = null;
		}
		Static11.method588(Static5.aCanvas115);
		Static13.method891(Static5.aCanvas115);
		if (Static6.aClass19_1 != null) {
			Static6.aClass19_1.method894(Static5.aCanvas115);
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
		Static7.aClass51_2.method1090();
		Static2.aClass92_1.method1971();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected final void method681() {
		Static20.method1949();
		Static2.aClass92_1 = new Class92();
		Static7.aClass51_2 = new Class51();
		if (Static7.anInt5543 != 0) {
			Static6.aByteArrayArray35 = new byte[50][];
		}
		Static33.method4149(Static7.aClass196_4);
		if (Static4.anInt3406 == 0) {
			Static6.aString291 = this.getCodeBase().getHost();
			Static3.anInt2337 = 43594;
			Static7.anInt5498 = 443;
		} else if (Static4.anInt3406 == 1) {
			Static6.aString291 = this.getCodeBase().getHost();
			Static7.anInt5498 = Static5.anInt4213 + 50000;
			Static3.anInt2337 = Static5.anInt4213 + 40000;
		} else if (Static4.anInt3406 == 2) {
			Static7.anInt5498 = Static5.anInt4213 + 50000;
			Static3.anInt2337 = Static5.anInt4213 + 40000;
			Static6.aString291 = "127.0.0.1";
		}
		Static7.aShortArray124 = Static5.aShortArray74 = Static7.aShortArray111 = Static4.aShortArray126 = new short[256];
		if (SignLink.anInt6106 == 3 && Static4.anInt3406 != 2) {
			Static6.anInt4846 = Static5.anInt4213;
		}
		if (Static2.anInt5720 == 1) {
			Static1.aShortArrayArray1 = Static5.aShortArrayArray5;
			Static7.aShortArray113 = Static3.aShortArray35;
			Static4.aShortArray46 = Static3.aShortArray32;
			Static4.anInt3364 = 16777215;
			Static4.anInt3365 = 0;
			Static2.aBoolean68 = true;
			Static6.aShortArrayArray6 = Static5.aShortArrayArray2;
		} else {
			Static6.aShortArrayArray6 = Static6.aShortArrayArray7;
			Static7.aShortArray113 = Static7.aShortArray115;
			Static1.aShortArrayArray1 = Static7.aShortArrayArray8;
			Static4.aShortArray46 = Static1.aShortArray11;
		}
		Static3.anInt2194 = Static3.anInt2337;
		Static5.anInt4045 = Static7.anInt5498;
		Static6.aString292 = Static6.aString291;
		Static4.anInt3358 = Static3.anInt2337;
		Static6.anInt4866 = Static4.anInt3358;
		Static15.method1402();
		Static20.method1926(Static5.aCanvas115);
		Static13.method883(Static5.aCanvas115);
		Static6.aClass19_1 = Static10.method345();
		if (Static6.aClass19_1 != null) {
			Static6.aClass19_1.method900(Static5.aCanvas115);
		}
		Static5.anInt3815 = SignLink.anInt6106;
		try {
			if (Static7.aClass196_4.cacheData != null) {
				Static3.aClass189_4 = new Class189(Static7.aClass196_4.cacheData, 5200, 0);
				for (@Pc(174) int local174 = 0; local174 < 29; local174++) {
					Static4.aClass189Array1[local174] = new Class189(Static7.aClass196_4.cacheIndexes[local174], 6000, 0);
				}
				Static3.aClass189_5 = new Class189(Static7.aClass196_4.cacheMasterIndex, 6000, 0);
				Static1.aClass60_2 = new Class60(255, Static3.aClass189_4, Static3.aClass189_5, 500000);
				Static1.aClass189_1 = new Class189(Static7.aClass196_4.uid, 24, 0);
				Static7.aClass196_4.cacheMasterIndex = null;
				Static7.aClass196_4.cacheIndexes = null;
				Static7.aClass196_4.cacheData = null;
				Static7.aClass196_4.uid = null;
			}
		} catch (@Pc(230) IOException local230) {
			Static1.aClass189_1 = null;
			Static3.aClass189_5 = null;
			Static1.aClass60_2 = null;
			Static3.aClass189_4 = null;
		}
		if (Static4.anInt3406 != 0) {
			Static3.aBoolean176 = true;
		}
		if (Static2.anInt5720 == 0) {
			Static5.aString255 = Static4.aString210;
		} else if (Static2.anInt5720 == 1) {
			Static5.aString255 = Static6.aString193;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method688(@OriginalArg(0) byte[] arg0) {
		@Pc(11) Class4_Sub10 local11 = new Class4_Sub10(arg0);
		while (true) {
			@Pc(15) int local15 = local11.method4629();
			if (local15 == 0) {
				return;
			}
			if (local15 == 1) {
				@Pc(31) int[] local31 = Static2.anIntArray163 = new int[6];
				local31[0] = local11.method4616();
				local31[1] = local11.method4616();
				local31[2] = local11.method4616();
				local31[3] = local11.method4616();
				local31[4] = local11.method4616();
				local31[5] = local11.method4616();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method689() {
		@Pc(3) boolean local3 = Static7.aClass51_2.method1097();
		if (!local3) {
			this.method690();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method690() {
		if (Static7.aClass51_2.anInt1358 > Static4.anInt3357) {
			Static2.anInt5721 = (Static7.aClass51_2.anInt1358 * 50 - 50) * 5;
			if (Static2.anInt5721 > 3000) {
				Static2.anInt5721 = 3000;
			}
			if (Static6.anInt4866 == Static3.anInt2194) {
				Static6.anInt4866 = Static5.anInt4045;
			} else {
				Static6.anInt4866 = Static3.anInt2194;
			}
			if (Static7.aClass51_2.anInt1358 >= 2 && Static7.aClass51_2.anInt1359 == 6) {
				this.method670("js5connect_outofdate");
				Static4.anInt3304 = 1000;
				return;
			}
			if (Static7.aClass51_2.anInt1358 >= 4 && Static7.aClass51_2.anInt1359 == -1) {
				this.method670("js5crc");
				Static4.anInt3304 = 1000;
				return;
			}
			if (Static7.aClass51_2.anInt1358 >= 4 && (Static4.anInt3304 == 0 || Static4.anInt3304 == 5)) {
				if (Static7.aClass51_2.anInt1359 == 7 || Static7.aClass51_2.anInt1359 == 9) {
					this.method670("js5connect_full");
				} else if (Static7.aClass51_2.anInt1359 <= 0) {
					this.method670("js5io");
				} else {
					this.method670("js5connect");
				}
				Static4.anInt3304 = 1000;
				return;
			}
		}
		Static4.anInt3357 = Static7.aClass51_2.anInt1358;
		if (Static2.anInt5721 > 0) {
			Static2.anInt5721--;
			return;
		}
		try {
			if (Static6.anInt4952 == 0) {
				Static5.aClass197_4 = Static7.aClass196_4.openSocket(Static6.aString292, Static6.anInt4866);
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
				Static3.aClass52_5 = new Class52((Socket) Static5.aClass197_4.result, Static7.aClass196_4);
				@Pc(198) Class4_Sub10 local198 = new Class4_Sub10(5);
				local198.method4581(15);
				local198.method4617(550);
				Static3.aClass52_5.method1107(local198.aByteArray71, 5);
				Static6.anInt4952++;
				Static1.aLong29 = MonotonicClock.currentTimeMillis();
			}
			if (Static6.anInt4952 == 3) {
				if (Static4.anInt3304 == 0 || Static4.anInt3304 == 5 || Static3.aClass52_5.method1101() > 0) {
					@Pc(259) int local259 = Static3.aClass52_5.method1105();
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
				Static7.aClass51_2.method1087(Static3.aClass52_5, !local288);
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
	protected final void method673() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public final void init() {
		if (!this.method671()) {
			return;
		}
		Static5.anInt4213 = Integer.parseInt(this.getParameter("worldid"));
		Static4.anInt3406 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static4.anInt3406 < 0 || Static4.anInt3406 > 1) {
			Static4.anInt3406 = 0;
		}
		Static7.anInt5543 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static7.anInt5543 < 0 || Static7.anInt5543 > 2) {
			Static7.anInt5543 = 0;
		}
		@Pc(48) String local48 = this.getParameter("advertsuppressed");
		if (local48 != null && local48.equals("1")) {
			Static1.aBoolean52 = true;
		} else {
			Static1.aBoolean52 = false;
		}
		try {
			Static1.anInt124 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(67) Exception local67) {
			Static1.anInt124 = 0;
		}
		Static19.method1776(Static1.anInt124);
		@Pc(76) String local76 = this.getParameter("objecttag");
		if (local76 != null && local76.equals("1")) {
			Static4.aBoolean231 = true;
		} else {
			Static4.aBoolean231 = false;
		}
		@Pc(92) String local92 = this.getParameter("js");
		if (local92 != null && local92.equals("1")) {
			Static2.aBoolean102 = true;
		} else {
			Static2.aBoolean102 = false;
		}
		@Pc(108) String local108 = this.getParameter("game");
		if (local108 != null && local108.equals("1")) {
			Static2.anInt5720 = 1;
		} else {
			Static2.anInt5720 = 0;
		}
		try {
			Static6.anInt4938 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(128) Exception local128) {
			Static6.anInt4938 = 0;
		}
		Static6.aString261 = this.getParameter("settings");
		if (Static6.aString261 == null) {
			Static6.aString261 = "";
		}
		@Pc(143) String local143 = this.getParameter("country");
		if (local143 != null) {
			try {
				Static5.anInt6076 = Integer.parseInt(local143);
			} catch (@Pc(152) Exception local152) {
				Static5.anInt6076 = 0;
			}
		}
		@Pc(158) String local158 = this.getParameter("haveie6");
		if (local158 != null && local158.equals("1")) {
			Static2.aBoolean118 = true;
		} else {
			Static2.aBoolean118 = false;
		}
		Static7.aClient1 = this;
		this.method677(Static7.anInt5543 + 32);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected final void method678() {
		if (Static4.anInt3304 == 1000) {
			return;
		}
		@Pc(26) long local26 = Static12.method727() / 1000000L - Static1.aLong24;
		Static1.aLong24 = Static12.method727() / 1000000L;
		@Pc(34) boolean local34 = Static12.method639();
		if (local34 && Static4.aBoolean210 && Static1.aClass102_1 != null) {
			Static1.aClass102_1.method3009();
		}
		if ((Static4.anInt3304 == 30 || Static4.anInt3304 == 10) && (Static1.aBoolean18 || Static1.aLong15 != 0L && Static1.aLong15 < MonotonicClock.currentTimeMillis())) {
			Static35.method4512(Static1.aBoolean18, Static11.method557(), Static4.anInt3403, Static3.anInt2627);
		}
		if (Static3.aFrame1 == null) {
			@Pc(79) Container local79;
			if (Static3.aFrame1 != null) {
				local79 = Static3.aFrame1;
			} else if (Static4.aFrame2 == null) {
				local79 = Static7.aClass196_4.applet;
			} else {
				local79 = Static4.aFrame2;
			}
			@Pc(95) int local95 = local79.getSize().width;
			@Pc(99) int local99 = local79.getSize().height;
			if (Static4.aFrame2 == local79) {
				@Pc(106) Insets local106 = Static4.aFrame2.getInsets();
				local95 -= local106.left + local106.right;
				local99 -= local106.bottom + local106.top;
			}
			if (Static2.anInt1635 != local95 || Static6.anInt4380 != local99) {
				Static20.method1949();
				Static1.aLong15 = MonotonicClock.currentTimeMillis() + 500L;
			}
		}
		if (Static3.aFrame1 != null && !Static3.aBoolean158 && (Static4.anInt3304 == 30 || Static4.anInt3304 == 10)) {
			Static35.method4512(false, Static5.anInt3637, -1, -1);
		}
		@Pc(173) boolean local173 = false;
		if (Static6.aBoolean314) {
			local173 = true;
			Static6.aBoolean314 = false;
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
				Static37.method4716(Static4.aString187 + "<br>(" + local267 + "%)", false);
			} else if (Static6.anInt4659 == 2) {
				if (Static7.anInt5486 > Static7.anInt5473) {
					Static7.anInt5473 = Static7.anInt5486;
				}
				@Pc(305) int local305 = (Static7.anInt5473 - Static7.anInt5486) * 50 / Static7.anInt5473 + 50;
				Static37.method4716(Static4.aString187 + "<br>(" + local305 + "%)", false);
			} else {
				Static37.method4716(Static4.aString187, false);
			}
		} else if (Static4.anInt3304 == 30) {
			Static35.method4304(local26);
		} else if (Static4.anInt3304 == 40) {
			Static37.method4716(Static4.aString207 + "<br>" + Static1.aString46, false);
		}
		if (Static3.aBoolean138 && Static4.anInt3304 != 0) {
			Static17.method1622();
			for (@Pc(436) int local436 = 0; local436 < Static1.anInt113; local436++) {
				Static6.aBooleanArray24[local436] = false;
			}
		} else if ((Static4.anInt3304 == 30 || Static4.anInt3304 == 10) && Static1.anInt268 == 0 && !local173) {
			try {
				@Pc(391) Graphics local391 = Static5.aCanvas115.getGraphics();
				for (@Pc(393) int local393 = 0; local393 < Static1.anInt113; local393++) {
					if (Static6.aBooleanArray24[local393]) {
						Static4.aClass59_1.method4240(Static5.anIntArray383[local393], Static7.anIntArray638[local393], Static7.anIntArray616[local393], local391, Static6.anIntArray540[local393]);
						Static6.aBooleanArray24[local393] = false;
					}
				}
			} catch (@Pc(429) Exception local429) {
				Static5.aCanvas115.repaint();
			}
		} else if (Static4.anInt3304 != 0) {
			try {
				@Pc(364) Graphics local364 = Static5.aCanvas115.getGraphics();
				Static4.aClass59_1.method4238(local364);
				for (@Pc(372) int local372 = 0; local372 < Static1.anInt113; local372++) {
					Static6.aBooleanArray24[local372] = false;
				}
			} catch (@Pc(384) Exception local384) {
				Static5.aCanvas115.repaint();
			}
		}
		if (Static7.aBoolean422) {
			Static31.method3798();
		}
		if (Static5.aBoolean278 && Static4.anInt3304 == 10 && Static3.anInt5398 != -1) {
			Static5.aBoolean278 = false;
			Static14.method1055(Static7.aClass196_4);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method663() {
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
			Static18.method4371();
		} else if (Static4.anInt3304 == 5) {
			this.method686();
			Static18.method4371();
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

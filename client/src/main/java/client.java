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

	@OriginalMember(owner = "client!d", name = "n", descriptor = "[I")
	private static final int[] JS5_ARCHIVE_WEIGHTS = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

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

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	private static int mainLoadState = 0;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "Ljava/lang/String;")
	public static String mainLoadPrimaryText = null;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "Ljava/lang/String;")
	public static String mainLoadSecondaryText = "";

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
	public static int mainLoadPercentage = 10;

	@OriginalMember(owner = "client!ho", name = "S", descriptor = "Lclient!wl;")
	private static BufferedFile cacheData;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "[Lclient!wl;")
	private static final BufferedFile[] cacheIndexes = new BufferedFile[29];

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!wl;")
	private static BufferedFile cacheMasterIndex;

	@OriginalMember(owner = "client!ck", name = "bb", descriptor = "Lclient!fm;")
	private static Cache masterCache;

	@OriginalMember(owner = "client!an", name = "f", descriptor = "Lclient!wl;")
	public static BufferedFile uid;

	@OriginalMember(owner = "client!cj", name = "P", descriptor = "Lclient!mg;")
	private static Js5MasterIndex js5MasterIndex;

	@OriginalMember(owner = "client!rg", name = "ob", descriptor = "[Lclient!wb;")
	public static final Js5CachedResourceProvider[] js5Providers = new Js5CachedResourceProvider[29];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!ja;")
	private static Js5CacheQueue js5CacheQueue;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!en;")
	public static Js5NetQueue js5NetQueue;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "Lsignlink!vk;")
	private static PrivilegedRequest js5SocketRequest;

	@OriginalMember(owner = "client!hk", name = "kb", descriptor = "Lclient!eo;")
	private static BufferedSocket js5Socket;

	@OriginalMember(owner = "client!sn", name = "qb", descriptor = "I")
	private static int js5ConnectState = 0;

	@OriginalMember(owner = "client!cf", name = "ab", descriptor = "J")
	private static long js5ConnectTime;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	private static int js5PrevErrors = 0;

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
	private static int js5ConnectDelay = 0;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "Lclient!fh;")
	public static Js5 js5Archive0;

	@OriginalMember(owner = "client!kn", name = "F", descriptor = "Lclient!fh;")
	public static Js5 js5Archive1;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Lclient!fh;")
	public static Js5 js5Archive2;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!fh;")
	public static Js5 js5Archive3;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "Lclient!fh;")
	public static Js5 js5Archive4;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!fh;")
	public static Js5 js5Archive5;

	@OriginalMember(owner = "client!uc", name = "X", descriptor = "Lclient!fh;")
	public static Js5 js5Archive6;

	@OriginalMember(owner = "client!lj", name = "T", descriptor = "Lclient!fh;")
	public static Js5 js5Archive7;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Lclient!fh;")
	public static Js5 js5Archive8;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Lclient!fh;")
	public static Js5 js5Archive9;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Lclient!fh;")
	public static Js5 js5Archive10;

	@OriginalMember(owner = "client!io", name = "D", descriptor = "Lclient!fh;")
	public static Js5 js5Archive11;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Lclient!fh;")
	public static Js5 js5Archive12;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!fh;")
	public static Js5 js5Archive13;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Lclient!fh;")
	public static Js5 js5Archive14;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "Lclient!fh;")
	public static Js5 js5Archive15;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!fh;")
	public static Js5 js5Archive16;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!fh;")
	public static Js5 js5Archive17;

	@OriginalMember(owner = "client!sc", name = "gb", descriptor = "Lclient!fh;")
	public static Js5 js5Archive18;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Lclient!fh;")
	public static Js5 js5Archive19;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!fh;")
	public static Js5 js5Archive20;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Lclient!fh;")
	public static Js5 js5Archive21;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Lclient!fh;")
	public static Js5 js5Archive22;

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "Lclient!fh;")
	public static Js5 js5Archive23;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!fh;")
	public static Js5 js5Archive24;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Lclient!fh;")
	public static Js5 js5Archive25;

	@OriginalMember(owner = "client!la", name = "U", descriptor = "Lclient!fh;")
	public static Js5 js5Archive26;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!fh;")
	public static Js5 js5Archive27;

	@OriginalMember(owner = "client!p", name = "yc", descriptor = "Lclient!fh;")
	public static Js5 js5Archive28;

	@OriginalMember(owner = "client!sh", name = "ab", descriptor = "Lclient!bh;")
	public static MouseWheel mouseWheel;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!ob;")
	public static FrameBuffer frameBuffer;

	@OriginalMember(owner = "client!ca", name = "Z", descriptor = "Lclient!tj;")
	public static AudioChannel musicChannel;

	@OriginalMember(owner = "client!sc", name = "fb", descriptor = "Lclient!tj;")
	public static AudioChannel soundChannel;

	@OriginalMember(owner = "client!de", name = "x", descriptor = "I")
	public static int loop = 0;

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

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZBZIZ)Lclient!fh;")
	private static Js5 createJs5(@OriginalArg(3) int archive, @OriginalArg(2) boolean discardPacked, @OriginalArg(0) boolean discardUnpacked, @OriginalArg(4) boolean prefetchAll) {
		@Pc(5) Cache cache = null;
		if (cacheData != null) {
			cache = new Cache(cacheData, cacheIndexes[archive], archive, 1000000);
		}
		js5Providers[archive] = js5MasterIndex.getResourceProvider(masterCache, cache, archive);
		if (prefetchAll) {
			js5Providers[archive].prefetchAll();
		}
		return new Js5(js5Providers[archive], discardPacked, discardUnpacked);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method683() {
		for (Static6.anInt5088 = 0; Keyboard.nextKey() && Static6.anInt5088 < 128; Static6.anInt5088++) {
			Static5.anIntArray441[Static6.anInt5088] = Keyboard.keyCode;
			Static5.anIntArray419[Static6.anInt5088] = Keyboard.keyChar;
		}
		Static5.anInt4156++;
		if (Static3.anInt5398 != -1) {
			Static14.method1060(Static3.anInt5398, GameShell.canvasWidth, 0, 0, 0, 0, GameShell.canvasHeight);
		}
		Static6.anInt4979++;
		if (GlRenderer.enabled) {
			label195:
			for (@Pc(56) int local56 = 0; local56 < 32768; local56++) {
				@Pc(65) Npc local65 = NpcList.npcs[local56];
				if (local65 != null) {
					@Pc(71) byte local71 = local65.type.aByte21;
					if ((local71 & 0x2) > 0 && local65.anInt3965 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(98) int local98 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(106) int local106 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local98 != 0 || local106 != 0) {
							local65.aByteArray51[0] = 1;
							local65.anIntArray422[0] = local98 + (local65.x >> 7);
							local65.anIntArray426[0] = (local65.z >> 7) + local106;
							PathFinder.collisionMaps[Static7.y].method568(0, local65.z >> 7, local65.getSize(), false, local65.x >> 7, local65.getSize(), false);
							if (local65.anIntArray422[0] >= 0 && local65.anIntArray422[0] <= 104 - local65.getSize() && local65.anIntArray426[0] >= 0 && local65.anIntArray426[0] <= 104 - local65.getSize() && PathFinder.collisionMaps[Static7.y].method575(local65.anIntArray426[0], local65.z >> 7, local65.anIntArray422[0], local65.x >> 7)) {
								if (local65.getSize() > 1) {
									for (@Pc(240) int local240 = local65.anIntArray422[0]; local240 < local65.anIntArray422[0] + local65.getSize(); local240++) {
										for (@Pc(256) int local256 = local65.anIntArray426[0]; local65.anIntArray426[0] + local65.getSize() > local256; local256++) {
											if ((PathFinder.collisionMaps[Static7.y].flags[local240][local256] & 0x2401FF) != 0) {
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
					PathFinder.collisionMaps[Static7.y].method567(false, false, local65.getSize(), local65.getSize(), local65.z >> 7, local65.x >> 7);
				}
			}
		}
		if (!GlRenderer.enabled && game == 0) {
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
			@Pc(395) Component local395;
			@Pc(406) Component local406;
			do {
				local389 = (Class4_Sub13) Static2.aClass112_6.removeHead();
				if (local389 == null) {
					while (true) {
						@Pc(440) Class4_Sub13 local440;
						@Pc(448) Component local448;
						@Pc(460) Component local460;
						do {
							local440 = (Class4_Sub13) Static2.aClass112_10.removeHead();
							if (local440 == null) {
								while (true) {
									@Pc(489) Class4_Sub13 local489;
									@Pc(496) Component local496;
									@Pc(505) Component local505;
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
											if (loop % 1500 == 0) {
												Static22.method2387();
											}
											return;
										}
										local496 = local489.source;
										if (local496.anInt5968 < 0) {
											break;
										}
										local505 = InterfaceList.getComponent(local496.anInt5937);
									} while (local505 == null || local505.aClass185Array4 == null || local505.aClass185Array4.length <= local496.anInt5968 || local505.aClass185Array4[local496.anInt5968] != local496);
									Static21.method2019(local489);
								}
							}
							local448 = local440.source;
							if (local448.anInt5968 < 0) {
								break;
							}
							local460 = InterfaceList.getComponent(local448.anInt5937);
						} while (local460 == null || local460.aClass185Array4 == null || local448.anInt5968 >= local460.aClass185Array4.length || local460.aClass185Array4[local448.anInt5968] != local448);
						Static21.method2019(local440);
					}
				}
				local395 = local389.source;
				if (local395.anInt5968 < 0) {
					break;
				}
				local406 = InterfaceList.getComponent(local395.anInt5937);
			} while (local406 == null || local406.aClass185Array4 == null || local395.anInt5968 >= local406.aClass185Array4.length || local406.aClass185Array4[local395.anInt5968] != local395);
			Static21.method2019(local389);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void setJs5Response(@OriginalArg(1) int response) {
		js5NetQueue.response = response;
		js5Socket = null;
		js5NetQueue.errors++;
		js5ConnectState = 0;
		js5SocketRequest = null;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void mainLoad() {
		if (!Preferences.safeMode) {
			label264:
			while (true) {
				do {
					if (!Keyboard.nextKey()) {
						break label264;
					}
				} while (Keyboard.keyChar != 's' && Keyboard.keyChar != 'S');
				Preferences.safeMode = true;
			}
		}
		if (mainLoadState == 0) {
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
				mainLoadPercentage = 5;
				mainLoadSecondaryText = LocalisedText.MAINLOAD0;
			} else {
				mainLoadPercentage = 5;
				mainLoadSecondaryText = LocalisedText.MAINLOAD0B;
				mainLoadState = 10;
			}
		} else if (mainLoadState == 10) {
			for (@Pc(93) int i = 0; i < 4; i++) {
				PathFinder.collisionMaps[i] = new CollisionMap(104, 104);
			}
			mainLoadState = 30;
			mainLoadSecondaryText = LocalisedText.MAINLOAD10B;
			mainLoadPercentage = 10;
		} else if (mainLoadState == 30) {
			if (js5MasterIndex == null) {
				js5MasterIndex = new Js5MasterIndex(js5NetQueue, js5CacheQueue);
			}
			if (js5MasterIndex.isReady()) {
				js5Archive0 = createJs5(0, false, true, true);
				js5Archive1 = createJs5(1, false, true, true);
				js5Archive2 = createJs5(2, true, false, true);
				js5Archive3 = createJs5(3, false, true, true);
				js5Archive4 = createJs5(4, false, true, true);
				js5Archive5 = createJs5(5, true, true, true);
				js5Archive6 = createJs5(6, true, true, false);
				js5Archive7 = createJs5(7, false, true, true);
				js5Archive8 = createJs5(8, false, true, true);
				js5Archive9 = createJs5(9, false, true, true);
				js5Archive10 = createJs5(10, false, true, true);
				js5Archive11 = createJs5(11, false, true, true);
				js5Archive12 = createJs5(12, false, true, true);
				js5Archive13 = createJs5(13, false, true, true);
				js5Archive14 = createJs5(14, false, true, false);
				js5Archive15 = createJs5(15, false, true, true);
				js5Archive16 = createJs5(16, false, true, true);
				js5Archive17 = createJs5(17, false, true, true);
				js5Archive18 = createJs5(18, false, true, true);
				js5Archive19 = createJs5(19, false, true, true);
				js5Archive20 = createJs5(20, false, true, true);
				js5Archive21 = createJs5(21, false, true, true);
				js5Archive22 = createJs5(22, false, true, true);
				js5Archive23 = createJs5(23, true, true, true);
				js5Archive24 = createJs5(24, false, true, true);
				js5Archive25 = createJs5(25, false, true, true);
				js5Archive26 = createJs5(26, true, true, true);
				js5Archive27 = createJs5(27, false, true, true);
				js5Archive28 = createJs5(28, true, true, true);
				mainLoadPercentage = 15;
				mainLoadSecondaryText = LocalisedText.MAINLOAD30B;
				mainLoadState = 40;
			} else {
				mainLoadPercentage = 12;
				mainLoadSecondaryText = LocalisedText.MAINLOAD30;
			}
		} else if (mainLoadState == 40) {
			@Pc(355) int percentage = 0;
			for (@Pc(357) int i = 0; i < 29; i++) {
				percentage += js5Providers[i].getIndexPercentageComplete() * JS5_ARCHIVE_WEIGHTS[i] / 100;
			}
			if (percentage == 100) {
				mainLoadSecondaryText = LocalisedText.MAINLOAD40B;
				mainLoadPercentage = 20;
				Static24.method2946(js5Archive8);
				Static31.method3154(js5Archive8);
				Static24.method2711(js5Archive8);
				mainLoadState = 41;
			} else {
				mainLoadPercentage = 20;
				if (percentage != 0) {
					mainLoadSecondaryText = LocalisedText.CHECKING_FOR_UPDATES + percentage + "%";
				}
			}
		} else if (mainLoadState == 41) {
			if (js5Archive28.fetchAll()) {
				this.decodeDefaults(js5Archive28.fetchFile(1));
				mainLoadState = 45;
				mainLoadSecondaryText = LocalisedText.MAINLOAD41B;
				mainLoadPercentage = 25;
			} else {
				mainLoadSecondaryText = LocalisedText.MAINLOAD41 + js5Archive28.getPercentageComplete() + "%";
				mainLoadPercentage = 25;
			}
		} else if (mainLoadState == 45) {
			AudioChannel.init(Preferences.stereo);
			Static1.aClass4_Sub6_Sub2_2 = new Class4_Sub6_Sub2();
			Static1.aClass4_Sub6_Sub2_2.method2505();
			musicChannel = AudioChannel.create(GameShell.canvas, GameShell.signLink, 0, 22050);
			musicChannel.method3008(Static1.aClass4_Sub6_Sub2_2);
			Static36.method4551(Static1.aClass4_Sub6_Sub2_2, js5Archive15, js5Archive14, js5Archive4);
			soundChannel = AudioChannel.create(GameShell.canvas, GameShell.signLink, 1, 2048);
			Static5.aClass4_Sub6_Sub3_2 = new Class4_Sub6_Sub3();
			soundChannel.method3008(Static5.aClass4_Sub6_Sub3_2);
			Static7.aClass170_1 = new Class170(22050, Static7.sampleRate);
			Static7.anInt5611 = js5Archive6.getGroupId("scape main");
			mainLoadSecondaryText = LocalisedText.MAINLOAD45B;
			mainLoadState = 50;
			mainLoadPercentage = 30;
		} else if (mainLoadState == 50) {
			@Pc(540) int local540 = Static10.method464(js5Archive13, js5Archive8);
			@Pc(543) int local543 = Static16.method1565();
			if (local540 >= local543) {
				mainLoadSecondaryText = LocalisedText.MAINLOAD50B;
				mainLoadState = 60;
				mainLoadPercentage = 35;
			} else {
				mainLoadPercentage = 35;
				mainLoadSecondaryText = LocalisedText.MAINLOAD50 + local540 * 100 / local543 + "%";
			}
		} else if (mainLoadState == 60) {
			@Pc(582) int local582 = Static14.method1046(js5Archive8);
			@Pc(585) int local585 = Static10.method393();
			if (local585 <= local582) {
				mainLoadState = 65;
				mainLoadPercentage = 40;
				mainLoadSecondaryText = LocalisedText.MAINLOAD60B;
			} else {
				mainLoadPercentage = 40;
				mainLoadSecondaryText = LocalisedText.MAINLOAD60 + local582 * 100 / local585 + "%";
			}
		} else if (mainLoadState == 65) {
			Static8.method113(js5Archive8, js5Archive13);
			mainLoadSecondaryText = LocalisedText.MAINLOAD65B;
			mainLoadPercentage = 45;
			Static9.method233(5);
			mainLoadState = 70;
		} else if (mainLoadState == 70) {
			js5Archive2.fetchAll();
			@Pc(647) int local647 = js5Archive2.getPercentageComplete();
			js5Archive16.fetchAll();
			local647 += js5Archive16.getPercentageComplete();
			js5Archive17.fetchAll();
			local647 += js5Archive17.getPercentageComplete();
			js5Archive18.fetchAll();
			local647 += js5Archive18.getPercentageComplete();
			js5Archive19.fetchAll();
			local647 += js5Archive19.getPercentageComplete();
			js5Archive20.fetchAll();
			local647 += js5Archive20.getPercentageComplete();
			js5Archive21.fetchAll();
			local647 += js5Archive21.getPercentageComplete();
			js5Archive22.fetchAll();
			local647 += js5Archive22.getPercentageComplete();
			js5Archive24.fetchAll();
			local647 += js5Archive24.getPercentageComplete();
			js5Archive25.fetchAll();
			local647 += js5Archive25.getPercentageComplete();
			js5Archive27.fetchAll();
			local647 += js5Archive27.getPercentageComplete();
			if (local647 < 1100) {
				mainLoadPercentage = 50;
				mainLoadSecondaryText = LocalisedText.MAINLOAD70 + local647 / 11 + "%";
			} else {
				ParamTypeList.init(js5Archive2);
				FloTypeList.init(js5Archive2);
				FluTypeList.init(js5Archive2);
				IdkTypeList.init(js5Archive2, js5Archive7);
				LocTypeList.init(js5Archive16, js5Archive7);
				NpcTypeList.init(js5Archive18, js5Archive7);
				ObjTypeList.init(js5Archive19, js5Archive7, Static2.aClass4_Sub3_Sub5_Sub2_2);
				StructTypeList.init(js5Archive2);
				SeqTypeList.init(js5Archive20, js5Archive0, js5Archive1);
				BasTypeList.init(js5Archive2);
				SpotAnimTypeList.init(js5Archive21, js5Archive7);
				VarbitTypeList.init(js5Archive22);
				VarpTypeList.init(js5Archive2);
				InterfaceList.init(js5Archive3, js5Archive7, js5Archive8, js5Archive13);
				InvTypeList.init(js5Archive2);
				EnumTypeList.init(js5Archive17);
				Static16.method1521(js5Archive25, new Class128(), js5Archive24);
				Static15.method1473(js5Archive24, js5Archive25);
				SkyBoxTypeList.init(js5Archive2);
				SkyBoxSphereTypeList.init(js5Archive2);
				LightTypeList.init(js5Archive2);
				Static11.method514(js5Archive2, js5Archive8);
				Static8.method5(js5Archive8, js5Archive2);
				Static29.method3474(js5Archive2, js5Archive8);
				mainLoadPercentage = 50;
				mainLoadSecondaryText = LocalisedText.MAINLOAD70B;
				Equipment.init();
				mainLoadState = 80;
			}
		} else if (mainLoadState == 80) {
			@Pc(884) int local884 = Static11.method558(js5Archive8);
			@Pc(887) int local887 = Static14.method1084();
			if (local884 >= local887) {
				Static35.method667(js5Archive8);
				mainLoadSecondaryText = LocalisedText.MAINLOAD80B;
				mainLoadPercentage = 60;
				mainLoadState = 90;
			} else {
				mainLoadSecondaryText = LocalisedText.MAINLOAD80 + local884 * 100 / local887 + "%";
				mainLoadPercentage = 60;
			}
		} else if (mainLoadState == 90) {
			if (js5Archive26.fetchAll()) {
				@Pc(960) Js5GlTextureProvider local960 = new Js5GlTextureProvider(js5Archive9, js5Archive8, js5Archive26, 20, !Preferences.highDetailTextures);
				Static23.method2551(local960);
				if (Preferences.brightness == 1) {
					ColorUtils.setBrightness(0.9F);
				}
				if (Preferences.brightness == 2) {
					ColorUtils.setBrightness(0.8F);
				}
				if (Preferences.brightness == 3) {
					ColorUtils.setBrightness(0.7F);
				}
				if (Preferences.brightness == 4) {
					ColorUtils.setBrightness(0.6F);
				}
				mainLoadPercentage = 70;
				mainLoadSecondaryText = LocalisedText.MAINLOAD90B;
				mainLoadState = 100;
			} else {
				mainLoadSecondaryText = LocalisedText.MAINLOAD90 + js5Archive26.getPercentageComplete() + "%";
				mainLoadPercentage = 70;
			}
		} else if (mainLoadState == 100) {
			if (Static10.method398(js5Archive8)) {
				mainLoadState = 110;
			}
		} else if (mainLoadState == 110) {
			MouseRecorder.instance = new MouseRecorder();
			GameShell.signLink.startThread(MouseRecorder.instance, 10);
			mainLoadPercentage = 75;
			mainLoadSecondaryText = LocalisedText.MAINLOAD110B;
			mainLoadState = 120;
		} else if (mainLoadState == 120) {
			if (js5Archive10.isFileReady("huffman", "")) {
				@Pc(1066) HuffmanCodec codec = new HuffmanCodec(js5Archive10.fetchFile("huffman", ""));
				WordPack.init(codec);
				mainLoadSecondaryText = LocalisedText.MAINLOAD120B;
				mainLoadPercentage = 80;
				mainLoadState = 130;
			} else {
				mainLoadSecondaryText = LocalisedText.MAINLOAD120 + "0%";
				mainLoadPercentage = 80;
			}
		} else if (mainLoadState == 130) {
			if (!js5Archive3.fetchAll()) {
				mainLoadSecondaryText = LocalisedText.MAINLOAD130 + js5Archive3.getPercentageComplete() * 3 / 4 + "%";
				mainLoadPercentage = 85;
			} else if (!js5Archive12.fetchAll()) {
				mainLoadSecondaryText = LocalisedText.MAINLOAD130 + (js5Archive12.getPercentageComplete() / 10 + 75) + "%";
				mainLoadPercentage = 85;
			} else if (!js5Archive13.fetchAll()) {
				mainLoadSecondaryText = LocalisedText.MAINLOAD130 + (js5Archive13.getPercentageComplete() / 20 + 85) + "%";
				mainLoadPercentage = 85;
			} else if (js5Archive23.isFileReady("details")) {
				Static19.method2393(js5Archive23);
				Static26.method2950(js5Archive27);
				Static13.method1028(js5Archive7);
				mainLoadState = 135;
				mainLoadPercentage = 95;
				mainLoadSecondaryText = LocalisedText.MAINLOAD130B;
			} else {
				mainLoadSecondaryText = LocalisedText.MAINLOAD130 + (js5Archive23.getPercentageComplete("details") / 10 + 90) + "%";
				mainLoadPercentage = 85;
			}
		} else if (mainLoadState == 135) {
			@Pc(1200) int local1200 = Static22.method2285();
			if (local1200 == -1) {
				mainLoadSecondaryText = LocalisedText.MAINLOAD135;
				mainLoadPercentage = 95;
			} else if (local1200 == 7 || local1200 == 9) {
				this.error("worldlistfull");
				Static9.method233(1000);
			} else if (WorldList.loaded) {
				mainLoadPercentage = 96;
				mainLoadState = 140;
				mainLoadSecondaryText = LocalisedText.MAINLOAD135B;
			} else {
				this.error("worldlistio_" + local1200);
				Static9.method233(1000);
			}
		} else if (mainLoadState == 140) {
			Static7.anInt742 = js5Archive3.getGroupId("loginscreen");
			js5Archive5.discardNames(false);
			js5Archive6.discardNames(true);
			js5Archive8.discardNames(true);
			js5Archive13.discardNames(true);
			js5Archive10.discardNames(true);
			js5Archive3.discardNames(true);
			Static7.aBoolean422 = true;
			mainLoadState = 150;
			mainLoadSecondaryText = LocalisedText.MAINLOAD140;
			mainLoadPercentage = 97;
		} else if (mainLoadState == 150) {
			Static19.method1859();
			if (Preferences.safeMode) {
				Preferences.displayMode = 0;
				Preferences.antiAliasingMode = 0;
				Static2.anInt1125 = 0;
				Preferences.buildArea = 0;
			}
			Preferences.safeMode = true;
			Preferences.write(GameShell.signLink);
			Static35.method4512(false, Preferences.displayMode, -1, -1);
			mainLoadPercentage = 100;
			mainLoadSecondaryText = LocalisedText.MAINLOAD150B;
			mainLoadState = 160;
		} else if (mainLoadState == 160) {
			Static11.method605(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected final void mainQuit() {
		if (GlRenderer.enabled) {
			GlRenderer.quit();
		}
		if (GameShell.fullScreenFrame != null) {
			Static31.method3658(GameShell.signLink, GameShell.fullScreenFrame);
			GameShell.fullScreenFrame = null;
		}
		if (MouseRecorder.instance != null) {
			MouseRecorder.instance.running = false;
		}
		MouseRecorder.instance = null;
		if (Protocol.socket != null) {
			Protocol.socket.close();
			Protocol.socket = null;
		}
		Keyboard.stop(GameShell.canvas);
		Mouse.stop(GameShell.canvas);
		if (mouseWheel != null) {
			mouseWheel.stop(GameShell.canvas);
		}
		Keyboard.quit();
		Mouse.quit();
		mouseWheel = null;
		if (musicChannel != null) {
			musicChannel.quit();
		}
		if (soundChannel != null) {
			soundChannel.quit();
		}
		js5NetQueue.quit();
		js5CacheQueue.quit();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected final void mainInit() {
		Static20.method1949();
		js5CacheQueue = new Js5CacheQueue();
		js5NetQueue = new Js5NetQueue();
		if (modeWhat != 0) {
			Static6.aByteArrayArray35 = new byte[50][];
		}
		Preferences.read(GameShell.signLink);
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
		Keyboard.init();
		Keyboard.start(GameShell.canvas);
		Mouse.start(GameShell.canvas);
		mouseWheel = MouseWheel.create();
		if (mouseWheel != null) {
			mouseWheel.start(GameShell.canvas);
		}
		Static5.anInt3815 = SignLink.anInt6106;
		try {
			if (GameShell.signLink.cacheData != null) {
				cacheData = new BufferedFile(GameShell.signLink.cacheData, 5200, 0);
				for (@Pc(174) int i = 0; i < 29; i++) {
					cacheIndexes[i] = new BufferedFile(GameShell.signLink.cacheIndexes[i], 6000, 0);
				}
				cacheMasterIndex = new BufferedFile(GameShell.signLink.cacheMasterIndex, 6000, 0);
				masterCache = new Cache(cacheData, cacheMasterIndex, 255, 500000);
				uid = new BufferedFile(GameShell.signLink.uid, 24, 0);
				GameShell.signLink.cacheMasterIndex = null;
				GameShell.signLink.cacheIndexes = null;
				GameShell.signLink.cacheData = null;
				GameShell.signLink.uid = null;
			}
		} catch (@Pc(230) IOException ex) {
			uid = null;
			cacheMasterIndex = null;
			masterCache = null;
			cacheData = null;
		}
		if (modeWhere != 0) {
			Static3.aBoolean176 = true;
		}
		if (game == 0) {
			mainLoadPrimaryText = LocalisedText.GAME0_LOADING;
		} else if (game == 1) {
			mainLoadPrimaryText = LocalisedText.GAME1_LOADING;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void decodeDefaults(@OriginalArg(0) byte[] bytes) {
		@Pc(11) Buffer buffer = new Buffer(bytes);
		while (true) {
			@Pc(15) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			if (code == 1) {
				@Pc(31) int[] textures = Defaults.skyboxTextures = new int[6];
				textures[0] = buffer.readUnsignedShort();
				textures[1] = buffer.readUnsignedShort();
				textures[2] = buffer.readUnsignedShort();
				textures[3] = buffer.readUnsignedShort();
				textures[4] = buffer.readUnsignedShort();
				textures[5] = buffer.readUnsignedShort();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void js5NetworkLoop() {
		@Pc(3) boolean reconnect = js5NetQueue.loop();
		if (!reconnect) {
			this.js5Connect();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void js5Connect() {
		if (js5NetQueue.errors > js5PrevErrors) {
			js5ConnectDelay = (js5NetQueue.errors * 50 - 50) * 5;
			if (js5ConnectDelay > 3000) {
				js5ConnectDelay = 3000;
			}
			if (port == defaultPort) {
				port = alternatePort;
			} else {
				port = defaultPort;
			}
			if (js5NetQueue.errors >= 2 && js5NetQueue.response == 6) {
				this.error("js5connect_outofdate");
				Static4.anInt3304 = 1000;
				return;
			}
			if (js5NetQueue.errors >= 4 && js5NetQueue.response == -1) {
				this.error("js5crc");
				Static4.anInt3304 = 1000;
				return;
			}
			if (js5NetQueue.errors >= 4 && (Static4.anInt3304 == 0 || Static4.anInt3304 == 5)) {
				if (js5NetQueue.response == 7 || js5NetQueue.response == 9) {
					this.error("js5connect_full");
				} else if (js5NetQueue.response <= 0) {
					this.error("js5io");
				} else {
					this.error("js5connect");
				}
				Static4.anInt3304 = 1000;
				return;
			}
		}
		js5PrevErrors = js5NetQueue.errors;
		if (js5ConnectDelay > 0) {
			js5ConnectDelay--;
			return;
		}
		try {
			if (js5ConnectState == 0) {
				js5SocketRequest = GameShell.signLink.openSocket(hostname, port);
				js5ConnectState++;
			}
			if (js5ConnectState == 1) {
				if (js5SocketRequest.status == 2) {
					this.setJs5Response(1000);
					return;
				}
				if (js5SocketRequest.status == 1) {
					js5ConnectState++;
				}
			}
			if (js5ConnectState == 2) {
				js5Socket = new BufferedSocket((Socket) js5SocketRequest.result, GameShell.signLink);
				@Pc(198) Buffer buffer = new Buffer(5);
				buffer.writeByte(15);
				buffer.writeInt(550);
				js5Socket.write(buffer.bytes, 5);
				js5ConnectState++;
				js5ConnectTime = MonotonicClock.currentTimeMillis();
			}
			if (js5ConnectState == 3) {
				if (Static4.anInt3304 == 0 || Static4.anInt3304 == 5 || js5Socket.available() > 0) {
					@Pc(259) int response = js5Socket.read();
					if (response != 0) {
						this.setJs5Response(response);
						return;
					}
					js5ConnectState++;
				} else if (MonotonicClock.currentTimeMillis() - js5ConnectTime > 30000L) {
					this.setJs5Response(1001);
					return;
				}
			}
			if (js5ConnectState == 4) {
				@Pc(288) boolean loggedOut = Static4.anInt3304 == 5 || Static4.anInt3304 == 10 || Static4.anInt3304 == 28;
				js5NetQueue.start(js5Socket, !loggedOut);
				js5SocketRequest = null;
				js5ConnectState = 0;
				js5Socket = null;
			}
		} catch (@Pc(305) IOException ex) {
			this.setJs5Response(1002);
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
		if (local34 && Static4.aBoolean210 && musicChannel != null) {
			musicChannel.method3009();
		}
		if ((Static4.anInt3304 == 30 || Static4.anInt3304 == 10) && (GameShell.replaceCanvas || Static1.aLong15 != 0L && Static1.aLong15 < MonotonicClock.currentTimeMillis())) {
			Static35.method4512(GameShell.replaceCanvas, Static11.method557(), Preferences.fullScreenWidth, Preferences.fullScreenHeight);
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
			Static35.method4512(false, Preferences.displayMode, -1, -1);
		}
		@Pc(173) boolean local173 = false;
		if (GameShell.fullRedraw) {
			local173 = true;
			GameShell.fullRedraw = false;
		}
		if (local173) {
			Static29.method3430();
		}
		if (GlRenderer.enabled) {
			for (@Pc(188) int local188 = 0; local188 < 100; local188++) {
				Static2.aBooleanArray8[local188] = true;
			}
		}
		if (Static4.anInt3304 == 0) {
			Static9.method202(null, local173, mainLoadPercentage, mainLoadSecondaryText);
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
		if (GlRenderer.enabled && Static4.anInt3304 != 0) {
			GlRenderer.swapBuffers();
			for (@Pc(436) int i = 0; i < Static1.anInt113; i++) {
				Static6.aBooleanArray24[i] = false;
			}
		} else if ((Static4.anInt3304 == 30 || Static4.anInt3304 == 10) && Static1.anInt268 == 0 && !local173) {
			try {
				@Pc(391) Graphics graphics = GameShell.canvas.getGraphics();
				for (@Pc(393) int i = 0; i < Static1.anInt113; i++) {
					if (Static6.aBooleanArray24[i]) {
						frameBuffer.draw(graphics, Static6.anIntArray540[i], Static7.anIntArray638[i], Static5.anIntArray383[i], Static7.anIntArray616[i]);
						Static6.aBooleanArray24[i] = false;
					}
				}
			} catch (@Pc(429) Exception ex) {
				GameShell.canvas.repaint();
			}
		} else if (Static4.anInt3304 != 0) {
			try {
				@Pc(364) Graphics graphics = GameShell.canvas.getGraphics();
				frameBuffer.draw(graphics);
				for (@Pc(372) int i = 0; i < Static1.anInt113; i++) {
					Static6.aBooleanArray24[i] = false;
				}
			} catch (@Pc(384) Exception ex) {
				GameShell.canvas.repaint();
			}
		}
		if (Static7.aBoolean422) {
			Static31.method3798();
		}
		if (Preferences.safeMode && Static4.anInt3304 == 10 && Static3.anInt5398 != -1) {
			Preferences.safeMode = false;
			Preferences.write(GameShell.signLink);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected final void mainLoop() {
		if (Static4.anInt3304 == 1000) {
			return;
		}
		loop++;
		if (loop % 1000 == 1) {
			@Pc(25) GregorianCalendar local25 = new GregorianCalendar();
			Static2.anInt1976 = local25.get(11) * 600 + local25.get(12) * 10 + local25.get(13) / 6;
			Static5.aRandom1.setSeed((long) Static2.anInt1976);
		}
		this.js5NetworkLoop();
		if (js5MasterIndex != null) {
			js5MasterIndex.loop();
		}
		Static30.method3551();
		Static9.method763();
		Keyboard.loop();
		Mouse.loop();
		if (GlRenderer.enabled) {
			GlCleaner.loop();
		}
		if (mouseWheel != null) {
			@Pc(73) int wheelRotation = mouseWheel.getWheelRotation();
			Static3.anInt2885 = wheelRotation;
		}
		if (Static4.anInt3304 == 0) {
			this.mainLoad();
			GameShell.resetTimer();
		} else if (Static4.anInt3304 == 5) {
			this.mainLoad();
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

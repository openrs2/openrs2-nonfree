import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class WorldMap {
	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!wg;")
	public static MapArea currentMap;

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
	public static int loadPercentage = 0;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "Lclient!kk;")
	public static WorldMapFont font11;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!kk;")
	public static WorldMapFont font12;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!kk;")
	public static WorldMapFont font14;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!kk;")
	public static WorldMapFont font17;

	@OriginalMember(owner = "client!al", name = "R", descriptor = "Lclient!kk;")
	public static WorldMapFont font19;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "Lclient!kk;")
	public static WorldMapFont font22;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "Lclient!kk;")
	public static WorldMapFont font26;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "Lclient!kk;")
	public static WorldMapFont font30;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public static void setCurrentMap(@OriginalArg(0) int id) {
		currentMap = (MapArea) MapAreaList.areas.get(id);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public static void load() {
		if (currentMap == null) {
			return;
		}
		if (loadPercentage < 10) {
			if (!MapAreaList.archive.isFileReady(currentMap.group)) {
				loadPercentage = client.js5Archive23.getPercentageComplete(currentMap.group) / 10;
				return;
			}
			Static30.method3597();
			loadPercentage = 10;
		}
		if (loadPercentage == 10) {
			Static3.anInt2962 = currentMap.displayMinX >> 6 << 6;
			Static3.anInt2965 = (currentMap.displayMaxX >> 6 << 6) + 64 - Static3.anInt2962;
			Static3.anInt2961 = currentMap.displayMinZ >> 6 << 6;
			@Pc(70) int[] local70 = new int[3];
			Static3.anInt2960 = (currentMap.displayMaxZ >> 6 << 6) + 64 - Static3.anInt2961;
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = -1;
			if (currentMap.convertSourceToDisplay(Static7.y, (PlayerList.self.x >> 7) + Static5.originX, Static7.originZ + (PlayerList.self.z >> 7), local70)) {
				local86 = local70[1] - Static3.anInt2962;
				local84 = Static3.anInt2961 + Static3.anInt2960 - local70[2] - 1;
			}
			if (!Static2.aBoolean82 && local86 >= 0 && Static3.anInt2965 > local86 && local84 >= 0 && Static3.anInt2960 > local84) {
				@Pc(153) int local153 = local84 + (int) (Math.random() * 10.0D) - 5;
				Static7.anInt5231 = local153;
				@Pc(164) int local164 = local86 + (int) (Math.random() * 10.0D) - 5;
				Static1.anInt331 = local164;
			} else if (Static6.anInt4953 == -1 || Static3.anInt2571 == -1) {
				currentMap.convertSourceToDisplay(currentMap.defaultPosition >> 14 & 0x3FFF, currentMap.defaultPosition & 0x3FFF, local70);
				Static7.anInt5231 = Static3.anInt2961 + Static3.anInt2960 - local70[2] - 1;
				Static1.anInt331 = local70[1] - Static3.anInt2962;
			} else {
				currentMap.convertSourceToDisplay(Static6.anInt4953, Static3.anInt2571, local70);
				Static3.anInt2571 = -1;
				Static6.anInt4953 = -1;
				Static2.aBoolean82 = false;
				if (local70 != null) {
					Static7.anInt5231 = Static3.anInt2960 + Static3.anInt2961 - local70[2] - 1;
					Static1.anInt331 = local70[1] - Static3.anInt2962;
				}
			}
			if (currentMap.defaultZoom == 37) {
				Static3.aFloat68 = 3.0F;
				Static3.aFloat69 = 3.0F;
			} else if (currentMap.defaultZoom == 50) {
				Static3.aFloat68 = 4.0F;
				Static3.aFloat69 = 4.0F;
			} else if (currentMap.defaultZoom == 75) {
				Static3.aFloat68 = 6.0F;
				Static3.aFloat69 = 6.0F;
			} else if (currentMap.defaultZoom == 100) {
				Static3.aFloat68 = 8.0F;
				Static3.aFloat69 = 8.0F;
			} else if (currentMap.defaultZoom == 200) {
				Static3.aFloat68 = 16.0F;
				Static3.aFloat69 = 16.0F;
			} else {
				Static3.aFloat68 = 8.0F;
				Static3.aFloat69 = 8.0F;
			}
			Static28.method3249();
			@Pc(309) int local309 = Static3.anInt2965 >> 6;
			Static3.anIntArray266 = new int[FloTypeList.capacity + 1];
			@Pc(318) int local318 = Static3.anInt2960 >> 6;
			Static3.aByteArrayArrayArray11 = new byte[local309][local318][];
			Static3.anIntArrayArrayArray6 = new int[local309][local318][];
			Static3.aByteArrayArrayArray12 = new byte[local309][local318][];
			Static3.aByteArrayArrayArray13 = new byte[local309][local318][];
			Static3.anIntArrayArrayArray7 = new int[local309][local318][];
			Static3.aByteArrayArrayArray10 = new byte[local309][local318][];
			Static3.aByteArrayArrayArray14 = new byte[local309][local318][];
			Static3.aClass112_13 = new LinkedList();
			Static1.aClass130_1 = new SecondaryLinkedListIterator();
			@Pc(358) int local358 = Static2.anInt1273 >> 1;
			@Pc(364) int local364 = Static6.anInt4555 >> 2 << 10;
			Static20.method2408(local364, local358);
			MelTypeList.resize(1024, 256);
			VarbitTypeList.resize(256);
			loadPercentage = 20;
		} else if (loadPercentage == 20) {
			Static26.method2934(new Buffer(MapAreaList.archive.fetchFile(currentMap.group, "underlay")));
			loadPercentage = 30;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (loadPercentage == 30) {
			Static19.method2398(new Buffer(MapAreaList.archive.fetchFile(currentMap.group, "overlay")));
			loadPercentage = 40;
			GameShell.resetTimer();
		} else if (loadPercentage == 40) {
			Static20.method2406(new Buffer(MapAreaList.archive.fetchFile(currentMap.group, "overlay2")));
			loadPercentage = 50;
			GameShell.resetTimer();
		} else if (loadPercentage == 50) {
			Static20.method2407(new Buffer(MapAreaList.archive.fetchFile(currentMap.group, "loc")), LoginManager.mapMembers);
			loadPercentage = 60;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (loadPercentage == 60) {
			if (MapAreaList.archive.isGroupNameValid(currentMap.group + "_labels")) {
				if (!MapAreaList.archive.isFileReady(currentMap.group + "_labels")) {
					return;
				}
				Static3.aClass138_6 = MapElementList.create(MapAreaList.archive, currentMap.group + "_labels", LoginManager.mapMembers);
			} else {
				Static3.aClass138_6 = new MapElementList(0);
			}
			Static19.method2400();
			loadPercentage = 70;
			GameShell.resetTimer();
		} else if (loadPercentage == 70) {
			font11 = new WorldMapFont(11, true, GameShell.canvas);
			loadPercentage = 73;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (loadPercentage == 73) {
			font12 = new WorldMapFont(12, true, GameShell.canvas);
			loadPercentage = 76;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (loadPercentage == 76) {
			font14 = new WorldMapFont(14, true, GameShell.canvas);
			loadPercentage = 79;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (loadPercentage == 79) {
			font17 = new WorldMapFont(17, true, GameShell.canvas);
			loadPercentage = 82;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (loadPercentage == 82) {
			font19 = new WorldMapFont(19, true, GameShell.canvas);
			loadPercentage = 85;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (loadPercentage == 85) {
			font22 = new WorldMapFont(22, true, GameShell.canvas);
			loadPercentage = 88;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (loadPercentage == 88) {
			font26 = new WorldMapFont(26, true, GameShell.canvas);
			loadPercentage = 91;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else {
			font30 = new WorldMapFont(30, true, GameShell.canvas);
			loadPercentage = 100;
			Static32.method3917(true);
			GameShell.resetTimer();
			System.gc();
		}
	}
}

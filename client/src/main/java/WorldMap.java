import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class WorldMap {
	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!wg;")
	public static Map currentMap;

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
	public static int loadPercentage = 0;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "Lclient!kk;")
	private static WorldMapFont font11;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!kk;")
	private static WorldMapFont font12;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!kk;")
	private static WorldMapFont font14;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!kk;")
	private static WorldMapFont font17;

	@OriginalMember(owner = "client!al", name = "R", descriptor = "Lclient!kk;")
	private static WorldMapFont font19;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "Lclient!kk;")
	private static WorldMapFont font22;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "Lclient!kk;")
	private static WorldMapFont font26;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "Lclient!kk;")
	private static WorldMapFont font30;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "F")
	public static float targetZoom;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Lclient!uk;")
	private static final SecondaryLinkedList mapElements = new SecondaryLinkedList();

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!om;")
	private static SecondaryLinkedListIterator mapElementsIterator;

	@OriginalMember(owner = "client!ho", name = "D", descriptor = "Lclient!ll;")
	private static LinkedList aClass112_13;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	private static int anInt2554;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Lclient!wf;")
	public static Component component;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "[I")
	private static int[] overlayColors;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "[[[I")
	private static int[][][] scenery;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "[[[I")
	private static int[][][] underlayColors;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!uj;")
	private static Sprite aClass4_Sub3_Sub14_3;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
	private static int anInt4393 = -1;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "Lclient!vn;")
	private static SoftwareSprite aClass4_Sub3_Sub14_Sub1_2;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "Lclient!po;")
	private static MapElementList labels;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!ic;")
	public static HashTable visibleMapElementIds;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Lclient!ic;")
	public static HashTable visibleMapElementCategories;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
	public static int originX;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public static int width;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
	public static int originZ;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public static int length;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "F")
	public static float zoom;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
	private static int anInt929 = -1;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public static int anInt5231;

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
	public static int anInt331;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
	private static int anInt2853;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
	private static int anInt4215;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "I")
	private static int anInt3920 = -1;

	@OriginalMember(owner = "client!fj", name = "Z", descriptor = "I")
	private static int anInt1874 = -1;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Z")
	private static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!sn", name = "rb", descriptor = "I")
	private static int anInt4953 = -1;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "I")
	private static int anInt2571 = -1;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt5331;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "I")
	public static int anInt5680;

	@OriginalMember(owner = "client!rh", name = "ib", descriptor = "Z")
	public static boolean aBoolean317 = false;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "[Ljava/lang/String;")
	private static final String[] lines = new String[5];

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
	private static int anInt3546;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
	private static int anInt2542;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	private static void setCurrentMap(@OriginalArg(0) int id) {
		currentMap = (Map) MapList.areas.get(id);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public static void load() {
		if (currentMap == null) {
			return;
		}
		if (loadPercentage < 10) {
			if (!MapList.archive.isGroupReady(currentMap.group)) {
				loadPercentage = client.js5Archive23.getPercentageComplete(currentMap.group) / 10;
				return;
			}
			Static30.method3597();
			loadPercentage = 10;
		}
		if (loadPercentage == 10) {
			originX = currentMap.displayMinX >> 6 << 6;
			width = (currentMap.displayMaxX >> 6 << 6) + 64 - originX;
			originZ = currentMap.displayMinZ >> 6 << 6;
			@Pc(70) int[] position = new int[3];
			length = (currentMap.displayMaxZ >> 6 << 6) + 64 - originZ;
			@Pc(84) int z = -1;
			@Pc(86) int x = -1;
			if (currentMap.convertSourceToDisplay(Player.level, (PlayerList.self.xFine >> 7) + Static5.originX, Static7.originZ + (PlayerList.self.zFine >> 7), position)) {
				x = position[1] - originX;
				z = originZ + length - position[2] - 1;
			}
			if (!aBoolean82 && x >= 0 && width > x && z >= 0 && length > z) {
				@Pc(153) int local153 = z + (int) (Math.random() * 10.0D) - 5;
				anInt5231 = local153;
				@Pc(164) int local164 = x + (int) (Math.random() * 10.0D) - 5;
				anInt331 = local164;
			} else if (anInt4953 == -1 || anInt2571 == -1) {
				currentMap.convertSourceToDisplay(currentMap.origin >> 14 & 0x3FFF, currentMap.origin & 0x3FFF, position);
				anInt5231 = originZ + length - position[2] - 1;
				anInt331 = position[1] - originX;
			} else {
				currentMap.convertSourceToDisplay(anInt4953, anInt2571, position);
				anInt2571 = -1;
				anInt4953 = -1;
				aBoolean82 = false;
				if (position != null) {
					anInt5231 = length + originZ - position[2] - 1;
					anInt331 = position[1] - originX;
				}
			}
			if (currentMap.defaultZoom == 37) {
				zoom = 3.0F;
				targetZoom = 3.0F;
			} else if (currentMap.defaultZoom == 50) {
				zoom = 4.0F;
				targetZoom = 4.0F;
			} else if (currentMap.defaultZoom == 75) {
				zoom = 6.0F;
				targetZoom = 6.0F;
			} else if (currentMap.defaultZoom == 100) {
				zoom = 8.0F;
				targetZoom = 8.0F;
			} else if (currentMap.defaultZoom == 200) {
				zoom = 16.0F;
				targetZoom = 16.0F;
			} else {
				zoom = 8.0F;
				targetZoom = 8.0F;
			}
			method3249();
			@Pc(309) int width = WorldMap.width >> 6;
			overlayColors = new int[FloTypeList.capacity + 1];
			@Pc(318) int length = WorldMap.length >> 6;
			aByteArrayArrayArray11 = new byte[width][length][];
			scenery = new int[width][length][];
			aByteArrayArrayArray12 = new byte[width][length][];
			aByteArrayArrayArray13 = new byte[width][length][];
			underlayColors = new int[width][length][];
			aByteArrayArrayArray10 = new byte[width][length][];
			aByteArrayArrayArray14 = new byte[width][length][];
			aClass112_13 = new LinkedList();
			mapElementsIterator = new SecondaryLinkedListIterator();
			@Pc(358) int local358 = Static2.anInt1273 >> 1;
			@Pc(364) int local364 = Static6.anInt4555 >> 2 << 10;
			loadOverlayColors(local364, local358);
			MelTypeList.resize(1024, 256);
			VarbitTypeList.resize(256);
			loadPercentage = 20;
		} else if (loadPercentage == 20) {
			readUnderlay(new Buffer(MapList.archive.fetchFile(currentMap.group, "underlay")));
			loadPercentage = 30;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (loadPercentage == 30) {
			readOverlay(new Buffer(MapList.archive.fetchFile(currentMap.group, "overlay")));
			loadPercentage = 40;
			GameShell.resetTimer();
		} else if (loadPercentage == 40) {
			readOverlay2(new Buffer(MapList.archive.fetchFile(currentMap.group, "overlay2")));
			loadPercentage = 50;
			GameShell.resetTimer();
		} else if (loadPercentage == 50) {
			readLocs(new Buffer(MapList.archive.fetchFile(currentMap.group, "loc")), LoginManager.mapMembers);
			loadPercentage = 60;
			Static32.method3917(true);
			GameShell.resetTimer();
		} else if (loadPercentage == 60) {
			if (MapList.archive.isGroupNameValid(currentMap.group + "_labels")) {
				if (!MapList.archive.isGroupReady(currentMap.group + "_labels")) {
					return;
				}
				labels = MapElementList.create(MapList.archive, currentMap.group + "_labels", LoginManager.mapMembers);
			} else {
				labels = new MapElementList(0);
			}
			method2400();
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

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	public static void setTargetZoom(@OriginalArg(0) int targetZoom) {
		anInt929 = -1;
		if (targetZoom == 37) {
			WorldMap.targetZoom = 3.0F;
		} else if (targetZoom == 50) {
			WorldMap.targetZoom = 4.0F;
		} else if (targetZoom == 75) {
			WorldMap.targetZoom = 6.0F;
		} else if (targetZoom == 100) {
			WorldMap.targetZoom = 8.0F;
		} else if (targetZoom == 200) {
			WorldMap.targetZoom = 16.0F;
		}
		anInt929 = -1;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)I")
	public static int getTargetZoom() {
		if ((double) targetZoom == 3.0D) {
			return 37;
		} else if ((double) targetZoom == 4.0D) {
			return 50;
		} else if ((double) targetZoom == 6.0D) {
			return 75;
		} else if ((double) targetZoom == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Lclient!wg;")
	public static Map getCurrentMap() {
		return currentMap;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V")
	public static void clear(@OriginalArg(0) boolean arg0) {
		loadPercentage = 0;
		aClass112_13 = null;
		aByteArrayArrayArray12 = null;
		if (arg0 && currentMap != null) {
			anInt2554 = currentMap.id;
		} else {
			anInt2554 = -1;
		}
		component = null;
		overlayColors = null;
		scenery = null;
		aByteArrayArrayArray10 = null;
		aByteArrayArrayArray14 = null;
		underlayColors = null;
		aByteArrayArrayArray11 = null;
		aByteArrayArrayArray13 = null;
		currentMap = null;
		mapElements.clear();
		font14 = null;
		font30 = null;
		font19 = null;
		font26 = null;
		font11 = null;
		aClass4_Sub3_Sub14_3 = null;
		anInt4393 = -1;
		labels = null;
		font22 = null;
		aClass4_Sub3_Sub14_Sub1_2 = null;
		font17 = null;
		font12 = null;
		anInt929 = -1;
		MelTypeList.clear();
		mapElementsIterator = null;
		visibleMapElementIds = null;
		visibleMapElementCategories = null;
		MelTypeList.resize(128, 64);
		VarbitTypeList.resize(64);
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(B)Lclient!fg;")
	public static MapElement headMapElement() {
		if (mapElements == null) {
			return null;
		} else {
			mapElementsIterator.init(mapElements);
			@Pc(24) MapElement element = (MapElement) mapElementsIterator.head();
			@Pc(29) MelType type = MelTypeList.get(element.id);
			return type != null && type.aBoolean157 && type.isVisible() ? element : nextMapElement();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lclient!fg;")
	public static MapElement nextMapElement() {
		if (mapElements == null) {
			return null;
		}
		for (@Pc(22) MapElement element = (MapElement) mapElementsIterator.next(); element != null; element = (MapElement) mapElementsIterator.next()) {
			@Pc(29) MelType type = MelTypeList.get(element.id);
			if (type != null && type.aBoolean157 && type.isVisible()) {
				return element;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V")
	private static void loadOverlayColors(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int id = 0; id < FloTypeList.capacity; id++) {
			@Pc(8) FloType type = FloTypeList.get(id);
			if (type != null) {
				@Pc(14) int texture = type.texture;
				if (texture >= 0 && !Static4.textureProvider.method441(texture)) {
					texture = -1;
				}
				@Pc(64) int color;
				if (type.anInt3870 >= 0) {
					@Pc(29) int local29 = type.anInt3870;
					@Pc(35) int local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					@Pc(57) int local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					color = ColorUtils.HSL_TO_RGB[ColorUtils.multiplyLightnessGrayscale(local57, 96)];
				} else if (texture >= 0) {
					color = ColorUtils.HSL_TO_RGB[ColorUtils.multiplyLightnessGrayscale(Static4.textureProvider.getAverageColor(texture), 96)];
				} else if (type.anInt3869 == -1) {
					color = -1;
				} else {
					@Pc(88) int local88 = type.anInt3869;
					@Pc(94) int local94 = (local88 & 0x7F) + arg1;
					if (local94 < 0) {
						local94 = 0;
					} else if (local94 > 127) {
						local94 = 127;
					}
					@Pc(116) int local116 = (local88 + arg0 & 0xFC00) + (local88 & 0x380) + local94;
					color = ColorUtils.HSL_TO_RGB[ColorUtils.multiplyLightnessGrayscale(local116, 96)];
				}
				overlayColors[id + 1] = color;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!fd;)V")
	private static void readUnderlay(@OriginalArg(1) Buffer buffer) {
		@Pc(7) int hueDelta = Static3.anInt2963 >> 2 << 10;
		@Pc(11) int lightnessDelta = Static3.anInt2964 >> 1;
		@Pc(15) byte[][] underlays = new byte[width][length];
		while (buffer.position < buffer.bytes.length) {
			@Pc(23) boolean local23 = false;
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			if (buffer.readUnsignedByte() == 1) {
				local23 = true;
				local27 = buffer.readUnsignedByte();
				local25 = buffer.readUnsignedByte();
			}
			@Pc(47) int local47 = buffer.readUnsignedByte();
			@Pc(51) int local51 = buffer.readUnsignedByte();
			@Pc(58) int local58 = local47 * 64 - originX;
			@Pc(69) int local69 = length + originZ - local51 * 64 - 1;
			if (local58 >= 0 && local69 - 63 >= 0 && local58 + 63 < width && local69 < length) {
				for (@Pc(114) int local114 = 0; local114 < 64; local114++) {
					@Pc(124) byte[] local124 = underlays[local58 + local114];
					for (@Pc(126) int local126 = 0; local126 < 64; local126++) {
						if (!local23 || local114 >= local27 * 8 && local114 < local27 * 8 + 8 && local126 >= local25 * 8 && local126 < local25 * 8 + 8) {
							local124[local69 - local126] = buffer.readByte();
						}
					}
				}
			} else if (local23) {
				buffer.position += 64;
			} else {
				buffer.position += 4096;
			}
		}
		@Pc(194) int width = WorldMap.width;
		@Pc(196) int length = WorldMap.length;
		@Pc(199) int[] rowWeightedHue = new int[length];
		@Pc(202) int[] rowSaturation = new int[length];
		@Pc(205) int[] rowLightness = new int[length];
		@Pc(208) int[] rowChroma = new int[length];
		@Pc(211) int[] rowCount = new int[length];
		for (@Pc(213) int x = -5; x < width; x++) {
			if ((x & 0x1FF) == 0) {
				Static32.method3917(true);
			}
			for (@Pc(231) int z = 0; z < length; z++) {
				@Pc(242) int x1 = x + 5;
				if (width > x1) {
					@Pc(253) int underlay = underlays[x1][z] & 0xFF;
					if (underlay > 0) {
						@Pc(265) FluType type = FluTypeList.get(underlay - 1);
						rowWeightedHue[z] += type.weightedHue;
						rowSaturation[z] += type.saturation;
						rowLightness[z] += type.lightness;
						rowChroma[z] += type.chroma;
						@Pc(301) int local301 = rowCount[z]++;
					}
				}
				@Pc(308) int x0 = x - 5;
				if (x0 >= 0) {
					@Pc(322) int underlay = underlays[x0][z] & 0xFF;
					if (underlay > 0) {
						@Pc(334) FluType type = FluTypeList.get(underlay - 1);
						rowWeightedHue[z] -= type.weightedHue;
						rowSaturation[z] -= type.saturation;
						rowLightness[z] -= type.lightness;
						rowChroma[z] -= type.chroma;
						@Pc(370) int local370 = rowCount[z]--;
					}
				}
			}
			if (x >= 0) {
				@Pc(383) int weightedHue = 0;
				@Pc(389) int[][] underlayColorsMapRow = WorldMap.underlayColors[x >> 6];
				@Pc(391) int saturation = 0;
				@Pc(393) int count = 0;
				@Pc(395) int chroma = 0;
				@Pc(397) int lightness = 0;
				for (@Pc(399) int z = -5; z < length; z++) {
					@Pc(410) int z1 = z + 5;
					if (z1 < length) {
						weightedHue += rowWeightedHue[z1];
						chroma += rowChroma[z1];
						saturation += rowSaturation[z1];
						count += rowCount[z1];
						lightness += rowLightness[z1];
					}
					@Pc(448) int z0 = z - 5;
					if (z0 >= 0) {
						weightedHue -= rowWeightedHue[z0];
						chroma -= rowChroma[z0];
						count -= rowCount[z0];
						saturation -= rowSaturation[z0];
						lightness -= rowLightness[z0];
					}
					if (z >= 0 && count > 0) {
						@Pc(500) int[] underlayColors = underlayColorsMapRow[z >> 6];
						@Pc(521) int hsl = chroma == 0 ? 0 : ColorUtils.compressHsl(weightedHue * 256 / chroma, saturation / count, lightness / count);
						if (underlays[x][z] != 0) {
							if (underlayColors == null) {
								underlayColors = underlayColorsMapRow[z >> 6] = new int[4096];
							}
							@Pc(562) int l = lightnessDelta + (hsl & 0x7F);
							if (l < 0) {
								l = 0;
							} else if (l > 127) {
								l = 127;
							}
							@Pc(591) int hsl2 = (hueDelta + hsl & 0xFC00) + (hsl & 0x380) + l;
							underlayColors[((z & 0x3F) << 6) + (x & 0x3F)] = ColorUtils.HSL_TO_RGB[ColorUtils.multiplyLightnessSafe(hsl2, 96)];
						} else if (underlayColors != null) {
							underlayColors[(x & 0x3F) + ((z & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fd;)V")
	private static void readOverlay(@OriginalArg(0) Buffer buffer) {
		label83:
		while (true) {
			if (buffer.position < buffer.bytes.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (buffer.readUnsignedByte() == 1) {
					local7 = true;
					local9 = buffer.readUnsignedByte();
					local11 = buffer.readUnsignedByte();
				}
				@Pc(30) int local30 = buffer.readUnsignedByte();
				@Pc(34) int local34 = buffer.readUnsignedByte();
				@Pc(40) int local40 = local30 * 64 - originX;
				@Pc(50) int local50 = length + originZ - local34 * 64 - 1;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < width && local50 < length) {
					@Pc(68) int local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) byte local113 = buffer.readByte();
								if (local113 != 0) {
									if (aByteArrayArrayArray14[local68][local72] == null) {
										aByteArrayArrayArray14[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray14[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = buffer.readByte();
									if (aByteArrayArrayArray13[local68][local72] == null) {
										aByteArrayArrayArray13[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray13[local68][local72][(63 - local79 << 6) + local74] = local146;
								}
							}
						}
						local74++;
					}
				}
				@Pc(180) int local180 = 0;
				while (true) {
					if (local180 >= (local7 ? 64 : 4096)) {
						continue label83;
					}
					@Pc(191) byte local191 = buffer.readByte();
					if (local191 != 0) {
						buffer.position++;
					}
					local180++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Lclient!fd;)V")
	private static void readOverlay2(@OriginalArg(0) Buffer buffer) {
		label83:
		while (true) {
			if (buffer.position < buffer.bytes.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (buffer.readUnsignedByte() == 1) {
					local7 = true;
					local9 = buffer.readUnsignedByte();
					local11 = buffer.readUnsignedByte();
				}
				@Pc(30) int local30 = buffer.readUnsignedByte();
				@Pc(34) int local34 = buffer.readUnsignedByte();
				@Pc(40) int local40 = local30 * 64 - originX;
				@Pc(50) int local50 = length + originZ - local34 * 64 - 1;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < width && local50 < length) {
					@Pc(68) int local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) byte local113 = buffer.readByte();
								if (local113 != 0) {
									if (aByteArrayArrayArray10[local68][local72] == null) {
										aByteArrayArrayArray10[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray10[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = buffer.readByte();
									if (aByteArrayArrayArray11[local68][local72] == null) {
										aByteArrayArrayArray11[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray11[local68][local72][(63 - local79 << 6) + local74] = local146;
								}
							}
						}
						local74++;
					}
				}
				@Pc(180) int local180 = 0;
				while (true) {
					if (local180 >= (local7 ? 64 : 4096)) {
						continue label83;
					}
					@Pc(191) byte local191 = buffer.readByte();
					if (local191 != 0) {
						buffer.position++;
					}
					local180++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fd;Z)V")
	private static void readLocs(@OriginalArg(0) Buffer buffer, @OriginalArg(1) boolean allowMembers) {
		label125:
		while (true) {
			if (buffer.position < buffer.bytes.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (buffer.readUnsignedByte() == 1) {
					local7 = true;
					local9 = buffer.readUnsignedByte();
					local11 = buffer.readUnsignedByte();
				}
				@Pc(30) int local30 = buffer.readUnsignedByte();
				@Pc(34) int local34 = buffer.readUnsignedByte();
				@Pc(40) int local40 = local30 * 64 - originX;
				@Pc(50) int local50 = length + originZ - local34 * 64 - 1;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < width && local50 < length) {
					@Pc(68) int mapX = local40 >> 6;
					@Pc(72) int mapZ = local50 >> 6;
					@Pc(74) int x = 0;
					while (true) {
						if (x >= 64) {
							continue label125;
						}
						for (@Pc(79) int z = 0; z < 64; z++) {
							if (!local7 || x >= local9 * 8 && x < local9 * 8 + 8 && z >= local11 * 8 && z < local11 * 8 + 8) {
								@Pc(113) int flags = buffer.readUnsignedByte();
								if (flags != 0) {
									if ((flags & 0x1) == 1) {
										@Pc(125) int local125 = buffer.readUnsignedByte();
										if (aByteArrayArrayArray12[mapX][mapZ] == null) {
											aByteArrayArrayArray12[mapX][mapZ] = new byte[4096];
										}
										aByteArrayArrayArray12[mapX][mapZ][(63 - z << 6) + x] = (byte) local125;
									}
									if ((flags & 0x2) == 2) {
										@Pc(162) int mapScene = buffer.readUnsignedMedium();
										if (scenery[mapX][mapZ] == null) {
											scenery[mapX][mapZ] = new int[4096];
										}
										scenery[mapX][mapZ][(63 - z << 6) + x] = mapScene;
									}
									if ((flags & 0x4) == 4) {
										@Pc(198) int id = buffer.readUnsignedShort();
										@Pc(202) int level = buffer.readUnsignedByte();
										id--;
										@Pc(207) LocType type = LocTypeList.get(id);
										if (type.multiLocs != null) {
											type = type.getMultiLoc();
											if (type == null || type.mapElement == -1) {
												continue;
											}
										}
										if ((!type.members || allowMembers) && type.mapElement != -1) {
											@Pc(236) MapElement element = new MapElement();
											element.id = type.mapElement;
											element.level = level;
											element.x = mapX * 64 + x;
											element.z = mapZ * 64 + 64 - z;
											mapElements.addTail(element);
										}
									}
								}
							}
						}
						x++;
					}
				}
				@Pc(270) int local270 = 0;
				while (true) {
					if (local270 >= (local7 ? 64 : 4096)) {
						continue label125;
					}
					@Pc(281) int flags = buffer.readUnsignedByte();
					if (flags != 0) {
						if ((flags & 0x1) == 1) {
							buffer.position++;
						}
						if ((flags & 0x2) == 2) {
							buffer.position += 2;
						}
						if ((flags & 0x4) == 4) {
							buffer.position += 3;
						}
					}
					local270++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()V")
	private static void method2400() {
		for (@Pc(1) int i = 0; i < labels.size; i++) {
			if (labels.elements[i] != null) {
				mapElements.addTail(labels.elements[i]);
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public static void loop() {
		if (zoom < targetZoom) {
			zoom = (float) ((double) zoom + (double) zoom / 30.0D);
			if (targetZoom < zoom) {
				zoom = targetZoom;
			}
			method3249();
		} else if (zoom > targetZoom) {
			zoom = (float) ((double) zoom - (double) zoom / 30.0D);
			if (zoom < targetZoom) {
				zoom = targetZoom;
			}
			method3249();
		}
		if (anInt4393 != -1 && anInt929 != -1) {
			@Pc(64) int local64 = anInt929 - anInt5231;
			@Pc(69) int local69 = anInt4393 - anInt331;
			if (local64 < 2 || local64 > 2) {
				local64 >>= 4;
			}
			anInt5231 -= -local64;
			if (local69 < 2 || local69 > 2) {
				local69 >>= 4;
			}
			if (local69 == 0 && local64 == 0) {
				anInt929 = -1;
				anInt4393 = -1;
			}
			anInt331 += local69;
			method3249();
		}
		if (anInt2853 > 0) {
			anInt4215--;
			if (anInt4215 == 0) {
				anInt2853--;
				anInt4215 = 100;
			}
		} else {
			anInt3920 = -1;
			anInt1874 = -1;
		}
		if (!aBoolean166 || aClass112_13 == null) {
			return;
		}
		for (@Pc(153) MapElementBounds bounds = (MapElementBounds) aClass112_13.head(); bounds != null; bounds = (MapElementBounds) aClass112_13.next()) {
			@Pc(161) MelType type = MelTypeList.get(bounds.element.id);
			if (Static1.anInt640 == 0 && bounds.isHovering(Mouse.x, Mouse.y)) {
				if (!bounds.element.hover) {
					bounds.element.hover = true;
					ScriptRunner.method2710(15, bounds.element.id, type.category);
				}
				if (bounds.element.hover) {
					ScriptRunner.method2710(17, bounds.element.id, type.category);
				}
			} else if (bounds.element.hover) {
				bounds.element.hover = false;
				ScriptRunner.method2710(16, bounds.element.id, type.category);
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	private static void method3249() {
		if (anInt331 < 0) {
			anInt331 = 0;
			anInt4393 = -1;
			anInt929 = -1;
		}
		if (anInt331 > width) {
			anInt331 = width;
			anInt929 = -1;
			anInt4393 = -1;
		}
		if (anInt5231 < 0) {
			anInt4393 = -1;
			anInt5231 = 0;
			anInt929 = -1;
		}
		if (length < anInt5231) {
			anInt929 = -1;
			anInt4393 = -1;
			anInt5231 = length;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZI)V")
	public static void method694(@OriginalArg(1) int arg0) {
		anInt331 = arg0;
		anInt4393 = -1;
		anInt929 = -1;
		method3249();
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)Lclient!ll;")
	private static LinkedList method2410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) LinkedList local3 = new LinkedList();
		for (@Pc(8) MapElement element = (MapElement) mapElements.head(); element != null; element = (MapElement) mapElements.next()) {
			method2404(element, arg0, arg1);
			local3.addTail(element);
		}
		@Pc(29) int[] position = new int[3];
		for (@Pc(31) int i = 0; i < labels.size; i++) {
			@Pc(40) MapElement element = labels.elements[i];
			@Pc(67) boolean success = currentMap.convertSourceToDisplay(labels.positions[i] >> 28 & 0x3, labels.positions[i] >> 14 & 0x3FFF, labels.positions[i] & 0x3FFF, position);
			if (success) {
				element.x = position[1] - originX;
				element.z = length + originZ - position[2] - 1;
				method2404(element, arg0, arg1);
				local3.addTail(element);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fg;IIII)V")
	private static void method2404(@OriginalArg(0) MapElement element, @OriginalArg(1) int x, @OriginalArg(2) int y) {
		element.xOffset = Static3.anInt2969 + (x * (element.x - Static3.anInt2973) >> 16);
		element.yOffset = Static3.anInt2968 + (y * (element.z - Static3.anInt2967) >> 16);
		@Pc(32) MelType type = MelTypeList.get(element.id);
		if (type.sprite != -1) {
			@Pc(42) IndexedSprite sprite = type.method1811(false, true);
			if (sprite != null) {
				if (element.xOffset - (sprite.width + 1 >> 1) <= Static3.anInt2970 && element.xOffset + (sprite.width + 1 >> 1) >= Static3.anInt2969 && element.yOffset - (sprite.height + 1 >> 1) <= Static3.anInt2971 && element.yOffset + (sprite.height + 1 >> 1) >= Static3.anInt2968) {
					element.hidden = false;
				} else {
					element.hidden = true;
				}
				return;
			}
		}
		if (element.x >= Static3.anInt2973 && element.x <= Static3.anInt2972 && element.z >= Static3.anInt2967 && element.z <= Static3.anInt2966) {
			element.hidden = false;
		} else {
			element.hidden = true;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBIII)V")
	public static void render(@OriginalArg(3) int x, @OriginalArg(2) int y, @OriginalArg(4) int width, @OriginalArg(0) int height) {
		if (loadPercentage < 100) {
			load();
		}
		if (GlRenderer.enabled) {
			GlRaster.setClip(x, y, x + width, height + y);
		} else {
			SoftwareRaster.setClip(x, y, width + x, y + height);
		}
		if (loadPercentage < 100) {
			@Pc(47) int local47 = width / 2 + x;
			@Pc(59) int local59 = y + height / 2 - 20 - 18;
			if (GlRenderer.enabled) {
				GlRaster.fillRect(x, y, width, height, 0);
				GlRaster.drawRect(local47 - 152, local59, 304, 34, 0x8C1111);
				GlRaster.fillRect(local47 - 150, local59 + 2, loadPercentage * 3, 30, 0x8C1111);
			} else {
				SoftwareRaster.fillRect(x, y, width, height, 0);
				SoftwareRaster.drawRect(local47 - 152, local59, 304, 34, 0x8C1111);
				SoftwareRaster.fillRect(local47 - 150, local59 + 2, loadPercentage * 3, 30, 0x8C1111);
			}
			Fonts.b12Full.renderCenter(LocalisedText.LOADINGDOTDOTDOT, local47, local59 + 20, 0xFFFFFF, -1);
			return;
		}
		anInt5680 = (int) ((float) (height * 2) / zoom);
		anInt3546 = anInt5231 - (int) ((float) height / zoom);
		anInt2542 = anInt331 - (int) ((float) width / zoom);
		anInt5331 = (int) ((float) (width * 2) / zoom);
		@Pc(169) int local169 = anInt331 - (int) ((float) width / zoom);
		@Pc(177) int local177 = anInt5231 - (int) ((float) height / zoom);
		@Pc(190) int local190 = (int) ((float) width / zoom) + anInt331;
		@Pc(198) int local198 = (int) ((float) height / zoom) + anInt5231;
		if (GlRenderer.enabled) {
			if (aClass4_Sub3_Sub14_Sub1_2 == null || width != aClass4_Sub3_Sub14_Sub1_2.width || aClass4_Sub3_Sub14_Sub1_2.height != height) {
				aClass4_Sub3_Sub14_Sub1_2 = null;
				aClass4_Sub3_Sub14_Sub1_2 = new SoftwareSprite(width, height);
			}
			SoftwareRaster.setPixels(aClass4_Sub3_Sub14_Sub1_2.pixels, width, height);
			Static19.method2401(local169, local177, local190, local198, 0, 0, width, height + 1);
			method2403();
			@Pc(268) LinkedList local268 = method2397();
			method193(local268, x, y);
			aClass4_Sub3_Sub14_Sub1_2.flipHorizontal();
			GlRaster.drawPixels(aClass4_Sub3_Sub14_Sub1_2.pixels, x, y, width, height);
			SoftwareRaster.pixels = null;
		} else {
			Static19.method2401(local169, local177, local190, local198, x, y, width + x, height + y + 1);
			method2403();
			@Pc(218) LinkedList local218 = method2397();
			method193(local218, 0, 0);
		}
		if (anInt2853 > 0) {
			anInt4215--;
			if (anInt4215 == 0) {
				anInt4215 = 20;
				anInt2853--;
			}
		}
		if (!client.displayFps) {
			return;
		}
		@Pc(310) int local310 = width + x - 5;
		@Pc(312) int color = 0xFFFF00;
		@Pc(318) int local318 = y + height - 8;
		Fonts.p12Full.renderRight("Fps:" + GameShell.framesPerSecond, local310, local318, 0xFFFF00, -1);
		@Pc(334) Runtime local334 = Runtime.getRuntime();
		local318 -= 15;
		@Pc(344) int memoryUsage = (int) ((local334.totalMemory() - local334.freeMemory()) / 1024L);
		if (memoryUsage > 65536) {
			color = 0xFF0000;
		}
		Fonts.p12Full.renderRight("Mem:" + memoryUsage + "k", local310, local318, color, -1);
		@Pc(368) int local368 = local318 - 15;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()Lclient!ll;")
	private static LinkedList method2397() {
		@Pc(3) int local3 = Static3.anInt2972 - Static3.anInt2973;
		@Pc(7) int local7 = Static3.anInt2966 - Static3.anInt2967;
		@Pc(15) int local15 = (Static3.anInt2970 - Static3.anInt2969 << 16) / local3;
		@Pc(23) int local23 = (Static3.anInt2971 - Static3.anInt2968 << 16) / local7;
		return method2410(local15, local23);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBI)V")
	public static void method1970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		anInt929 = originZ + length - arg1 - 1;
		anInt4393 = arg0 - originX;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIII)V")
	public static void method2947(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int mapId) {
		clear(false);
		aBoolean82 = arg0;
		anInt4953 = arg2;
		anInt2571 = arg1;
		setCurrentMap(mapId);
		visibleMapElementIds = new HashTable(8);
		visibleMapElementCategories = new HashTable(8);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIB)V")
	public static void method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt4393 = -1;
		@Pc(7) float local7 = (float) length / (float) width;
		anInt929 = -1;
		@Pc(15) int local15 = arg1;
		@Pc(17) int local17 = arg2;
		if (local7 >= 1.0F) {
			local15 = (int) ((float) arg2 / local7);
		} else {
			local17 = (int) ((float) arg1 * local7);
		}
		arg0 -= (arg2 - local17) / 2;
		arg3 -= (arg1 - local15) / 2;
		anInt331 = width * arg3 / local15;
		anInt5231 = length * arg0 / local17;
		method3249();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
	public static void method4404(@OriginalArg(1) int arg0) {
		anInt929 = -1;
		anInt929 = -1;
		anInt5231 = arg0;
		method3249();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!fg;IIIZILclient!nb;Lclient!ho;)V")
	private static void method3244(@OriginalArg(0) MapElement element, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) MapElementBounds arg5, @OriginalArg(7) MelType type) {
		@Pc(3) WorldMapFont font = null;
		if (type.textSize == 0) {
			if ((double) zoom == 3.0D) {
				font = font11;
			}
			if ((double) zoom == 4.0D) {
				font = font12;
			}
			if ((double) zoom == 6.0D) {
				font = font14;
			}
			if ((double) zoom >= 8.0D) {
				font = font17;
			}
		} else if (type.textSize == 1) {
			if ((double) zoom == 3.0D) {
				font = font14;
			}
			if ((double) zoom == 4.0D) {
				font = font17;
			}
			if ((double) zoom == 6.0D) {
				font = font19;
			}
			if ((double) zoom >= 8.0D) {
				font = font22;
			}
		} else if (type.textSize == 2) {
			if ((double) zoom == 3.0D) {
				font = font19;
			}
			if ((double) zoom == 4.0D) {
				font = font22;
			}
			if ((double) zoom == 6.0D) {
				font = font26;
			}
			if ((double) zoom >= 8.0D) {
				font = font30;
			}
		}
		if (font == null) {
			return;
		}
		@Pc(123) int textColor = type.textColor;
		if (element.hover && type.hoverTextColor != -1) {
			textColor = type.hoverTextColor;
		}
		@Pc(141) int local141 = Fonts.p11Full.splitParagraph(type.text, lines, null);
		@Pc(144) int local144 = element.yOffset;
		@Pc(164) int local164;
		if (arg4) {
			local164 = local144 - font.method2328() * local141 / 2;
		} else {
			local164 = local144 - arg2 - (local141 - 1) * font.method2332() - font.method2328() / 2;
		}
		@Pc(181) int local181 = local164 - font.method2328();
		@Pc(188) int local188 = local164 + font.method2328() / 2;
		@Pc(190) int local190 = 0;
		for (@Pc(192) int local192 = 0; local192 < local141; local192++) {
			@Pc(199) String local199 = lines[local192];
			if (local141 - 1 > local192) {
				local199 = local199.substring(0, local199.length() - 4);
			}
			@Pc(221) int local221 = font.getStringWidth(local199);
			if (local190 < local221) {
				local190 = local221;
			}
		}
		arg5.textMinX = element.xOffset + arg1 - local190 / 2;
		arg5.textMaxX = arg1 + element.xOffset + local190 / 2;
		arg5.textMinY = local181 + arg3;
		arg5.textMaxY = arg3 + local181 + font.method2332() * local141;
		@Pc(274) int local274 = local181 + 2;
		@Pc(284) int local284 = element.xOffset - local190 / 2 - 5;
		if (type.fillColor != 0) {
			SoftwareRaster.fillRectAlpha(local284, local274, local190 + 10, local181 + local141 * font.method2332() + 1 - local274, type.fillColor, type.fillColor >>> 24);
		}
		if (type.outlineColor != 0) {
			SoftwareRaster.drawRectAlpha(local284, local274, local190 + 10, font.method2332() * local141 + local181 + 1 - local274, type.outlineColor, type.outlineColor >>> 24);
		}
		for (@Pc(343) int local343 = 0; local343 < local141; local343++) {
			@Pc(354) String local354 = lines[local343];
			if (local141 - 1 > local343) {
				local354 = local354.substring(0, local354.length() - 4);
			}
			@Pc(376) int local376 = font.getStringWidth(local354);
			if (local190 < local376) {
				local190 = local376;
			}
			font.renderStringCenter(local354, element.xOffset, local188, textColor);
			local188 += font.method2332();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)V")
	public static void method3661(@OriginalArg(1) int arg0) {
		anInt4215 = 100;
		anInt2853 = 3;
		anInt1874 = -1;
		anInt3920 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method4306() {
		if (anInt2554 != -1) {
			method2947(false, -1, -1, anInt2554);
			anInt2554 = -1;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLclient!fg;ILclient!ho;)V")
	private static void method3811(@OriginalArg(0) int x, @OriginalArg(2) MapElement element, @OriginalArg(3) int y, @OriginalArg(4) MelType type) {
		if (type.anIntArray188 != null) {
			@Pc(10) boolean local10 = false;
			@Pc(15) int[] local15 = new int[type.anIntArray188.length];
			for (@Pc(17) int local17 = 0; local17 < local15.length / 2; local17++) {
				@Pc(37) int local37 = type.anIntArray188[local17 * 2] + element.x;
				@Pc(50) int local50 = element.z - type.anIntArray188[local17 * 2 + 1];
				@Pc(71) int local71 = local15[local17 * 2] = Static3.anInt2969 + (local37 - Static3.anInt2973) * (Static3.anInt2970 - Static3.anInt2969) / (Static3.anInt2972 - Static3.anInt2973);
				@Pc(95) int local95 = local15[local17 * 2 + 1] = Static3.anInt2968 + (local50 - Static3.anInt2967) * (Static3.anInt2971 - Static3.anInt2968) / (Static3.anInt2966 - Static3.anInt2967);
				if (Static3.anInt2969 < local71 && local71 < Static3.anInt2970 && Static3.anInt2968 < local95 && local95 < Static3.anInt2971) {
					local10 = true;
				}
			}
			if (!local10) {
				return;
			}
			Static17.method1628(local15, type.anInt2283, type.anInt2283 >>> 24);
			for (@Pc(134) int local134 = 0; local134 < local15.length / 2 - 1; local134++) {
				SoftwareRaster.method4230(local15[local134 * 2], local15[local134 * 2 + 1], local15[(local134 + 1) * 2], local15[(local134 + 1) * 2 + 1], type.anInt2266, type.anInt2266 >>> 24);
			}
			SoftwareRaster.method4230(local15[local15.length - 2], local15[local15.length - 1], local15[0], local15[1], type.anInt2266, type.anInt2266 >>> 24);
		} else if (element.hidden) {
			return;
		}
		@Pc(222) MapElementBounds bounds = new MapElementBounds(element);
		@Pc(224) SoftwareIndexedSprite sprite = null;
		if (type.sprite != -1) {
			if (element.hover && type.hoverSprite != -1) {
				sprite = (SoftwareIndexedSprite) type.method1811(true, true);
			} else {
				sprite = (SoftwareIndexedSprite) type.method1811(false, true);
			}
			if (sprite != null) {
				if (anInt2853 > 0 && (anInt3920 != -1 && element.id == anInt3920 || anInt1874 != -1 && type.category == anInt1874)) {
					@Pc(290) int local290;
					if (anInt4215 <= 50) {
						local290 = anInt4215 * 3;
					} else {
						local290 = 300 - anInt4215 * 3;
					}
					SoftwareRaster.method4206(element.xOffset, element.yOffset, sprite.width / 2 + 7, 16776960, local290);
					SoftwareRaster.method4206(element.xOffset, element.yOffset, sprite.width / 2 + 5, 16776960, local290);
					SoftwareRaster.method4206(element.xOffset, element.yOffset, sprite.width / 2 + 3, 16776960, local290);
					SoftwareRaster.method4206(element.xOffset, element.yOffset, sprite.width / 2 + 1, 16776960, local290);
					SoftwareRaster.method4206(element.xOffset, element.yOffset, sprite.width / 2, 16776960, local290);
				}
				sprite.renderTransparent(element.xOffset - (sprite.width >> 1), element.yOffset - (sprite.height >> 1));
				bounds.iconMaxY = (sprite.height >> 1) + y + element.yOffset;
				bounds.iconMinX = x + element.xOffset - (sprite.width >> 1);
				bounds.iconMaxX = (sprite.width >> 1) + x + element.xOffset;
				bounds.iconMinY = y + element.yOffset - (sprite.height >> 1);
			}
		}
		if (type.text != null) {
			if (sprite == null) {
				method3244(element, x, 0, y, true, bounds, type);
			} else {
				method3244(element, x, (sprite.height >> 1) + 5, y, false, bounds, type);
			}
		}
		if (bounds.isHovering(Mouse.x, Mouse.y) && type.ops != null) {
			if (type.ops[4] != null) {
				MiniMenu.add(element.id, type.category, 0, type.opBase, type.ops[4], (short) 1011, -1);
			}
			if (type.ops[3] != null) {
				MiniMenu.add(element.id, type.category, 0, type.opBase, type.ops[3], (short) 1003, -1);
			}
			if (type.ops[2] != null) {
				MiniMenu.add(element.id, type.category, 0, type.opBase, type.ops[2], (short) 1008, -1);
			}
			if (type.ops[1] != null) {
				MiniMenu.add(element.id, type.category, 0, type.opBase, type.ops[1], (short) 1002, -1);
			}
			if (type.ops[0] != null) {
				MiniMenu.add(element.id, type.category, 0, type.opBase, type.ops[0], (short) 1012, -1);
			}
		}
		aClass112_13.addTail(bounds);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V")
	public static void method4524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg2, arg3, arg1 + arg2, arg0 + arg3);
			GlRaster.fillRect(arg2, arg3, arg1, arg0, 0);
		} else {
			SoftwareRaster.setClip(arg2, arg3, arg2 + arg1, arg3 + arg0);
			SoftwareRaster.fillRect(arg2, arg3, arg1, arg0, 0);
		}
		if (loadPercentage < 100) {
			return;
		}
		@Pc(51) float local51 = (float) length / (float) width;
		@Pc(57) int local57 = arg1;
		@Pc(59) int local59 = arg0;
		if (local51 < 1.0F) {
			local59 = (int) (local51 * (float) arg1);
		} else {
			local57 = (int) ((float) arg0 / local51);
		}
		arg2 += (arg1 - local57) / 2;
		arg3 += (arg0 - local59) / 2;
		if (aClass4_Sub3_Sub14_3 == null || arg1 != aClass4_Sub3_Sub14_3.width || arg0 != aClass4_Sub3_Sub14_3.height) {
			@Pc(117) SoftwareSprite local117 = new SoftwareSprite(arg1, arg0);
			SoftwareRaster.setPixels(local117.pixels, arg1, arg0);
			if (currentMap.backgroundColor != -1) {
				SoftwareRaster.fillRect(0, 0, arg1, arg0, currentMap.backgroundColor);
			}
			Static19.method2401(0, 0, width, length, 0, 0, local57, local59);
			method2403();
			if (GlRenderer.enabled) {
				aClass4_Sub3_Sub14_3 = new GlSprite(local117);
			} else {
				aClass4_Sub3_Sub14_3 = local117;
			}
			if (GlRenderer.enabled) {
				SoftwareRaster.pixels = null;
			} else {
				client.frameBuffer.makeTarget();
			}
		}
		@Pc(166) int local166 = 16711680;
		aClass4_Sub3_Sub14_3.render(arg2, arg3);
		@Pc(176) int local176 = anInt5331 * local57 / width;
		@Pc(184) int local184 = arg3 + local59 * anInt3546 / length;
		@Pc(190) int local190 = anInt5680 * local59 / length;
		if (client.game == 1) {
			local166 = 16777215;
		}
		@Pc(207) int local207 = arg2 + anInt2542 * local57 / width;
		if (GlRenderer.enabled) {
			GlRaster.fillRectAlpha(local207, local184, local176, local190, local166, 128);
			GlRaster.drawRect(local207, local184, local176, local190, local166);
		} else {
			SoftwareRaster.fillRectAlpha(local207, local184, local176, local190, local166, 128);
			SoftwareRaster.drawRect(local207, local184, local176, local190, local166);
		}
		if (anInt2853 <= 0) {
			return;
		}
		@Pc(255) int local255;
		if (anInt4215 > 50) {
			local255 = 500 - anInt4215 * 5;
		} else {
			local255 = anInt4215 * 5;
		}
		for (@Pc(266) MapElement local266 = (MapElement) mapElements.head(); local266 != null; local266 = (MapElement) mapElements.next()) {
			@Pc(273) MelType local273 = MelTypeList.get(local266.id);
			if (isMapElementTypeVisible(local273)) {
				if (local266.id == anInt3920) {
					@Pc(290) int local290 = local57 * local266.x / width + arg2;
					@Pc(299) int local299 = arg3 + local59 * local266.z / length;
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(local290 - 2, local299 - 2, 4, 4, 16776960, local255);
					} else {
						SoftwareRaster.fillRectAlpha(local290 - 2, local299 - 2, 4, 4, 16776960, local255);
					}
				} else if (anInt1874 != -1 && local273.category == anInt1874) {
					@Pc(349) int local349 = arg2 + local266.x * local57 / width;
					@Pc(358) int local358 = arg3 + local59 * local266.z / length;
					if (GlRenderer.enabled) {
						GlRaster.fillRectAlpha(local349 - 2, local358 - 2, 4, 4, 16776960, local255);
					} else {
						SoftwareRaster.fillRectAlpha(local349 - 2, local358 - 2, 4, 4, 16776960, local255);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(IB)V")
	public static void method4641(@OriginalArg(0) int arg0) {
		anInt2853 = 3;
		anInt1874 = arg0;
		anInt4215 = 100;
		anInt3920 = -1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ll;III)V")
	private static void method193(@OriginalArg(0) LinkedList arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		aClass112_13.clear();
		if (aBoolean317) {
			return;
		}
		for (@Pc(23) MapElement element = (MapElement) arg0.head(); element != null; element = (MapElement) arg0.next()) {
			@Pc(30) MelType type = MelTypeList.get(element.id);
			if (isMapElementTypeVisible(type)) {
				method3811(arg1, element, arg2, type);
				if (element.hidden) {
					method4329(element, type);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ho;I)Z")
	private static boolean isMapElementTypeVisible(@OriginalArg(0) MelType type) {
		if (type == null) {
			return false;
		} else if (!type.worldMapVisible) {
			return false;
		} else if (!type.isVisible()) {
			return false;
		} else if (visibleMapElementIds.get(type.id) == null) {
			return visibleMapElementCategories.get(type.category) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!fg;Lclient!ho;)V")
	private static void method4329(@OriginalArg(1) MapElement element, @OriginalArg(2) MelType type) {
		@Pc(5) SoftwareIndexedSprite sprite = type.method1808();
		if (sprite == null) {
			return;
		}
		@Pc(16) int size = sprite.width;
		if (sprite.height > sprite.width) {
			size = sprite.height;
		}
		@Pc(27) int local27 = element.xOffset;
		@Pc(30) int local30 = element.yOffset;
		@Pc(32) int lineCount = 0;
		@Pc(34) int textWidth = 0;
		@Pc(36) int textHeight = 0;
		if (type.text != null) {
			lineCount = Fonts.p11Full.splitParagraph(type.text, lines, null);
			for (@Pc(49) int i = 0; i < lineCount; i++) {
				@Pc(56) String line = lines[i];
				if (lineCount - 1 > i) {
					line = line.substring(0, line.length() - 4);
				}
				@Pc(77) int lineWidth = font14.getStringWidth(line);
				if (lineWidth > textWidth) {
					textWidth = lineWidth;
				}
			}
			textHeight = (lineCount - 1) * font14.method2332() + font14.method2328() / 2;
		}
		@Pc(105) int local105 = element.xOffset;
		if (Static3.anInt2969 + size > local27) {
			local27 = size + Static3.anInt2969;
			local105 = textWidth / 2 + size / 2 + Static3.anInt2969 + size + 5;
		} else if (Static3.anInt2970 - size < local27) {
			local105 = Static3.anInt2970 - size - size / 2 - textWidth / 2 - 5;
			local27 = Static3.anInt2970 - size;
		}
		@Pc(167) int local167 = element.yOffset - textHeight / 2;
		if (local30 < size + Static3.anInt2968) {
			local30 = Static3.anInt2968 + size;
			local167 = size / 2 + size + Static3.anInt2968 + font14.method2332();
		} else if (Static3.anInt2971 - size < local30) {
			local167 = Static3.anInt2971 - size - size / 2 - textHeight;
			local30 = Static3.anInt2971 - size;
		}
		@Pc(218) int local218 = -2;
		@Pc(220) int local220 = -2;
		@Pc(224) int local224 = size >> 1;
		@Pc(226) int local226 = -2;
		@Pc(250) int local250 = (int) (Math.atan2(local27 - element.xOffset, local30 - element.yOffset) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		@Pc(252) int local252 = -2;
		sprite.method1314(sprite.innerWidth << 3, sprite.innerHeight << 3, local224 + (local27 << 4), local224 + (local30 << 4), local250);
		if (type.text != null) {
			local220 = local167 - font14.method2328() - 3;
			local218 = local105 - textWidth / 2 - 5;
			local252 = lineCount * font14.method2332() + local220;
			local226 = textWidth + local218 + 10;
			if (type.fillColor != 0) {
				SoftwareRaster.fillRectAlpha(local218, local220, local226 - local218, local252 - local220, type.fillColor, type.fillColor >>> 24);
			}
			if (type.outlineColor != 0) {
				SoftwareRaster.drawRectAlpha(local218, local220, local226 - local218, local252 - local220, type.outlineColor, type.outlineColor >>> 24);
			}
			for (@Pc(353) int i = 0; i < lineCount; i++) {
				@Pc(364) String line = lines[i];
				if (i < lineCount - 1) {
					line = line.substring(0, line.length() - 4);
				}
				font14.renderStringCenter(line, local105, local167, type.textColor);
				local167 += font14.method2332();
			}
		}
		if ((Mouse.x <= local27 - local224 || local27 + local224 <= Mouse.x || Mouse.y <= local30 - local224 || Mouse.y >= local30 + local224) && (Mouse.x <= local218 || local226 <= Mouse.x || local220 >= Mouse.y || Mouse.y >= local252)) {
			return;
		}
		if (type.ops[4] != null) {
			MiniMenu.add(element.id, 0, 0, type.opBase, type.ops[4], (short) 1011, -1);
		}
		if (type.ops[3] != null) {
			MiniMenu.add(element.id, 0, 0, type.opBase, type.ops[3], (short) 1003, -1);
		}
		if (type.ops[2] != null) {
			MiniMenu.add(element.id, 0, 0, type.opBase, type.ops[2], (short) 1008, -1);
		}
		if (type.ops[1] != null) {
			MiniMenu.add(element.id, 0, 0, type.opBase, type.ops[1], (short) 1002, -1);
		}
		if (type.ops[0] != null) {
			MiniMenu.add(element.id, 0, 0, type.opBase, type.ops[0], (short) 1012, -1);
		}
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "()V")
	private static void method2403() {
		@Pc(3) int local3 = Static3.anInt2972 - Static3.anInt2973;
		@Pc(7) int local7 = Static3.anInt2966 - Static3.anInt2967;
		@Pc(15) int local15 = (Static3.anInt2970 - Static3.anInt2969 << 16) / local3;
		@Pc(23) int local23 = (Static3.anInt2971 - Static3.anInt2968 << 16) / local7;
		method2396(local15, local23);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
	private static void method2396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Static3.anInt2972 - Static3.anInt2973;
		@Pc(7) int local7 = Static3.anInt2966 - Static3.anInt2967;
		if (Static3.anInt2972 < width) {
			local3++;
		}
		if (Static3.anInt2966 < length) {
			local7++;
		}
		for (@Pc(17) int local17 = 0; local17 < local3; local17++) {
			@Pc(28) int local28 = arg0 * local17 >> 16;
			@Pc(38) int local38 = arg0 * (local17 + 1) >> 16;
			@Pc(42) int width = local38 - local28;
			if (width > 0) {
				@Pc(50) int local50 = local17 + Static3.anInt2973 >> 6;
				if (local50 >= 0 && local50 <= underlayColors.length - 1) {
					@Pc(142) int[][] local142 = underlayColors[local50];
					@Pc(146) byte[][] local146 = aByteArrayArrayArray14[local50];
					@Pc(150) byte[][] local150 = aByteArrayArrayArray13[local50];
					@Pc(154) byte[][] local154 = aByteArrayArrayArray10[local50];
					@Pc(158) byte[][] local158 = aByteArrayArrayArray11[local50];
					@Pc(162) byte[][] local162 = aByteArrayArrayArray12[local50];
					@Pc(166) int x = local28 + Static3.anInt2969;
					@Pc(170) int local170 = local38 + Static3.anInt2969;
					for (@Pc(172) int local172 = 0; local172 < local7; local172++) {
						@Pc(183) int local183 = arg1 * local172 >> 16;
						@Pc(193) int local193 = arg1 * (local172 + 1) >> 16;
						@Pc(197) int height = local193 - local183;
						if (height > 0) {
							@Pc(203) int y = local183 + Static3.anInt2968;
							@Pc(207) int local207 = local193 + Static3.anInt2968;
							@Pc(213) int local213 = local172 + Static3.anInt2967 >> 6;
							@Pc(219) int local219 = local172 + Static3.anInt2967 & 0x3F;
							@Pc(225) int local225 = local17 + Static3.anInt2973 & 0x3F;
							@Pc(231) int local231 = (local219 << 6) + local225;
							@Pc(250) int color;
							if (local213 < 0 || local213 > local142.length - 1 || local142[local213] == null) {
								if (currentMap.backgroundColor != -1) {
									color = currentMap.backgroundColor;
								} else if ((local17 + Static3.anInt2973 & 0x4) == (local172 + Static3.anInt2967 & 0x4)) {
									color = overlayColors[FloType.anInt549 + 1];
								} else {
									color = 0X4B5368;
								}
								if (local213 < 0 || local213 > local142.length - 1) {
									if (color == 0) {
										color = 1;
									}
									SoftwareRaster.fillRect(x, y, width, height, color);
									continue;
								}
							} else {
								color = local142[local213][local231];
							}
							if (color == 0) {
								color = 1;
							}
							@Pc(316) int local316 = local146[local213] == null ? 0 : overlayColors[local146[local213][local231] & 0xFF];
							@Pc(332) int local332 = local154[local213] == null ? 0 : overlayColors[local154[local213][local231] & 0xFF];
							if (local316 == 0 && local332 == 0) {
								SoftwareRaster.fillRect(x, y, width, height, color);
							} else {
								if (local316 != 0) {
									if (local316 == -1) {
										local316 = 1;
									}
									@Pc(362) byte local362 = local150[local213] == null ? 0 : local150[local213][local231];
									@Pc(366) int local366 = local362 & 0xFC;
									if (local366 == 0 || width <= 1 || height <= 1) {
										SoftwareRaster.fillRect(x, y, width, height, local316);
									} else {
										Static20.method2409(SoftwareRaster.pixels, x, y, color, local316, width, height, local366 >> 2, local362 & 0x3, true);
									}
								}
								if (local332 != 0) {
									if (local332 == -1) {
										local332 = color;
									}
									@Pc(409) byte local409 = local158[local213][local231];
									@Pc(413) int local413 = local409 & 0xFC;
									if (local413 == 0 || width <= 1 || height <= 1) {
										SoftwareRaster.fillRect(x, y, width, height, local332);
									}
									Static20.method2409(SoftwareRaster.pixels, x, y, 0, local332, width, height, local413 >> 2, local409 & 0x3, local316 == 0);
								}
							}
							if (local162[local213] != null) {
								@Pc(459) int local459 = local162[local213][local231] & 0xFF;
								if (local459 != 0) {
									@Pc(467) int x1;
									if (width == 1) {
										x1 = x;
									} else {
										x1 = local170 - 1;
									}
									@Pc(477) int y1;
									if (height == 1) {
										y1 = y;
									} else {
										y1 = local207 - 1;
									}
									@Pc(484) int wallColor = 0xCCCCCC;
									if (local459 >= 5 && local459 <= 8 || local459 >= 13 && local459 <= 16 || local459 >= 21 && local459 <= 24 || local459 == 27 || local459 == 28) {
										wallColor = 0xCC0000;
										local459 -= 4;
									}
									if (local459 == 1) {
										SoftwareRaster.drawVerticalLine(x, y, height, wallColor);
									} else if (local459 == 2) {
										SoftwareRaster.drawHorizontalLine(x, y, width, wallColor);
									} else if (local459 == 3) {
										SoftwareRaster.drawVerticalLine(x1, y, height, wallColor);
									} else if (local459 == 4) {
										SoftwareRaster.drawHorizontalLine(x, y1, width, wallColor);
									} else if (local459 == 9) {
										SoftwareRaster.drawVerticalLine(x, y, height, 0xFFFFFF);
										SoftwareRaster.drawHorizontalLine(x, y, width, wallColor);
									} else if (local459 == 10) {
										SoftwareRaster.drawVerticalLine(x1, y, height, 0xFFFFFF);
										SoftwareRaster.drawHorizontalLine(x, y, width, wallColor);
									} else if (local459 == 11) {
										SoftwareRaster.drawVerticalLine(x1, y, height, 0xFFFFFF);
										SoftwareRaster.drawHorizontalLine(x, y1, width, wallColor);
									} else if (local459 == 12) {
										SoftwareRaster.drawVerticalLine(x, y, height, 0xFFFFFF);
										SoftwareRaster.drawHorizontalLine(x, y1, width, wallColor);
									} else if (local459 == 17) {
										SoftwareRaster.drawHorizontalLine(x, y, 1, wallColor);
									} else if (local459 == 18) {
										SoftwareRaster.drawHorizontalLine(x1, y, 1, wallColor);
									} else if (local459 == 19) {
										SoftwareRaster.drawHorizontalLine(x1, y1, 1, wallColor);
									} else if (local459 == 20) {
										SoftwareRaster.drawHorizontalLine(x, y1, 1, wallColor);
									} else if (local459 == 25) {
										for (@Pc(644) int i = 0; i < height; i++) {
											SoftwareRaster.drawHorizontalLine(x + i, y1 - i, 1, wallColor);
										}
									} else if (local459 == 26) {
										for (@Pc(664) int i = 0; i < height; i++) {
											SoftwareRaster.drawHorizontalLine(x + i, y + i, 1, wallColor);
										}
									}
								}
							}
						}
					}
				} else {
					@Pc(62) int x = local28 + Static3.anInt2969;
					for (@Pc(68) int local68 = 0; local68 < local7; local68++) {
						@Pc(81) int y = (arg1 * local68 >> 16) + Static3.anInt2968;
						@Pc(93) int y1 = (arg1 * (local68 + 1) >> 16) + Static3.anInt2968;
						@Pc(97) int height = y1 - y;
						@Pc(104) int color;
						if (currentMap.backgroundColor != -1) {
							color = currentMap.backgroundColor;
						} else if ((local17 + Static3.anInt2973 & 0x4) == (local68 + Static3.anInt2967 & 0x4)) {
							color = overlayColors[FloType.anInt549 + 1];
						} else {
							color = 0x4B5368;
						}
						if (color == 0) {
							color = 1;
						}
						SoftwareRaster.fillRect(x, y, width, height, color);
					}
				}
			}
		}
		for (@Pc(684) int local684 = -2; local684 < local3 + 2; local684++) {
			@Pc(697) int local697 = arg0 * local684 >> 16;
			@Pc(707) int local707 = arg0 * (local684 + 1) >> 16;
			@Pc(711) int local711 = local707 - local697;
			if (local711 > 0) {
				@Pc(717) int local717 = local697 + Static3.anInt2969;
				@Pc(727) int local727 = local684 + Static3.anInt2973 >> 6;
				if (local727 >= 0 && local727 <= scenery.length - 1) {
					@Pc(740) int[][] local740 = scenery[local727];
					for (@Pc(742) int local742 = -2; local742 < local7 + 2; local742++) {
						@Pc(755) int local755 = arg1 * local742 >> 16;
						@Pc(765) int local765 = arg1 * (local742 + 1) >> 16;
						@Pc(769) int local769 = local765 - local755;
						if (local769 > 0) {
							@Pc(775) int local775 = local755 + Static3.anInt2968;
							@Pc(785) int local785 = local742 + Static3.anInt2967 >> 6;
							if (local785 >= 0 && local785 <= local740.length - 1) {
								@Pc(808) int local808 = ((local742 + Static3.anInt2967 & 0x3F) << 6) + (local684 + Static3.anInt2973 & 0x3F);
								if (local740[local785] != null) {
									@Pc(819) int mapScene = local740[local785][local808];
									@Pc(823) int mapSceneId = mapScene & 0x1FFF;
									if (mapSceneId != 0) {
										@Pc(832) MsiType type = MsiTypeList.get(mapSceneId - 1);
										@Pc(838) int angle = mapScene >> 13 & 0x3;
										@Pc(849) boolean flipVertical = (mapScene >> 15 & 0x1) == 1;
										@Pc(855) SoftwareIndexedSprite sprite = type.getSprite(flipVertical, angle);
										if (sprite != null) {
											@Pc(864) int local864 = local711 * sprite.width / 4;
											@Pc(871) int local871 = local769 * sprite.height / 4;
											if (type.aBoolean303) {
												@Pc(880) int local880 = mapScene >> 16 & 0xF;
												@Pc(886) int local886 = mapScene >> 20 & 0xF;
												if ((angle & 0x1) == 1) {
													@Pc(893) int local893 = local880;
													local880 = local886;
													local886 = local893;
												}
												local864 = local880 * local711;
												local871 = local886 * local769;
											}
											if (local864 != 0 && local871 != 0) {
												if (type.anInt4306 == 0) {
													sprite.method1315(local717, local775 + local769 - local871, local864, local871);
												} else {
													sprite.method1316(local717, local775 + local769 - local871, local864, local871, type.anInt4306);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

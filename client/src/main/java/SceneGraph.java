import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class SceneGraph {
	@OriginalMember(owner = "client!af", name = "C", descriptor = "[[[Lclient!nh;")
	public static Tile[][][] tiles;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "[[[I")
	public static int[][][] tileHeights;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "[[Lclient!ih;")
	public static Class4_Sub12[][] aClass4_Sub12ArrayArray2;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public static int levels;

	@OriginalMember(owner = "client!vi", name = "Y", descriptor = "[[[Lclient!nh;")
	public static Tile[][][] underwaterTiles;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "[[[I")
	public static int[][][] underwaterTileHeights;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "[[Lclient!ih;")
	private static Class4_Sub12[][] aClass4_Sub12ArrayArray3;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "[[[Lclient!nh;")
	private static Tile[][][] surfaceTiles;

	@OriginalMember(owner = "client!sn", name = "T", descriptor = "[[[I")
	public static int[][][] surfaceTileHeights;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "[[Lclient!ih;")
	public static Class4_Sub12[][] aClass4_Sub12ArrayArray1;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
	public static int width;

	@OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
	public static int length;

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
	public static int anInt3253;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "[Lclient!we;")
	public static Class184[] aClass184Array13;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public static int anInt1742;

	@OriginalMember(owner = "client!ri", name = "ab", descriptor = "[Lclient!we;")
	public static Class184[] aClass184Array12;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	public static int anInt4112 = 0;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "[Lclient!co;")
	public static Scenery[] scenery;

	@OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
	private static int sceneryLen = 0;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[Lclient!co;")
	public static Scenery[] aClass33Array1;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
	public static int firstVisibleLevel = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIZ)V")
	public static void init(@OriginalArg(3) int arg0, @OriginalArg(4) boolean hasUnderwaterLevel) {
		width = 104;
		length = 104;
		anInt3253 = arg0;
		surfaceTiles = new Tile[4][width][length];
		surfaceTileHeights = new int[4][width + 1][length + 1];
		if (GlRenderer.enabled) {
			aClass4_Sub12ArrayArray1 = new Class4_Sub12[4][];
		}
		if (hasUnderwaterLevel) {
			underwaterTiles = new Tile[1][width][length];
			anIntArrayArray10 = new int[width][length];
			underwaterTileHeights = new int[1][width + 1][length + 1];
			if (GlRenderer.enabled) {
				aClass4_Sub12ArrayArray3 = new Class4_Sub12[1][];
			}
		} else {
			underwaterTiles = null;
			anIntArrayArray10 = null;
			underwaterTileHeights = null;
			aClass4_Sub12ArrayArray3 = null;
		}
		setUnderwater(false);
		aClass184Array13 = new Class184[500];
		anInt1742 = 0;
		aClass184Array12 = new Class184[500];
		anInt4112 = 0;
		anIntArrayArrayArray3 = new int[4][width + 1][length + 1];
		scenery = new Scenery[5000];
		sceneryLen = 0;
		aClass33Array1 = new Scenery[100];
		aBooleanArrayArray5 = new boolean[anInt3253 + anInt3253 + 1][anInt3253 + anInt3253 + 1];
		aBooleanArrayArray4 = new boolean[anInt3253 + anInt3253 + 2][anInt3253 + anInt3253 + 2];
		aByteArrayArrayArray16 = new byte[4][width][length];
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
	public static void setUnderwater(@OriginalArg(0) boolean underwater) {
		if (underwater) {
			tiles = underwaterTiles;
			tileHeights = underwaterTileHeights;
			aClass4_Sub12ArrayArray2 = aClass4_Sub12ArrayArray3;
		} else {
			tiles = surfaceTiles;
			tileHeights = surfaceTileHeights;
			aClass4_Sub12ArrayArray2 = aClass4_Sub12ArrayArray1;
		}
		levels = tiles.length;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Lclient!ve;")
	public static Wall getWall(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		return tile == null ? null : tile.wall;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Lclient!vl;")
	public static WallDecor getWallDecor(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		return tile == null ? null : tile.wallDecor;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)Lclient!co;")
	public static Scenery getScenery(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		if (tile == null) {
			return null;
		}
		for (@Pc(13) int i = 0; i < tile.sceneryLen; i++) {
			@Pc(22) Scenery scenery = tile.scenery[i];
			if ((scenery.key >> 29 & 0x3L) == 2L && scenery.xMin == x && scenery.zMin == z) {
				return scenery;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Lclient!dm;")
	public static GroundDecor getGroundDecor(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		return tile == null || tile.groundDecor == null ? null : tile.groundDecor;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIILclient!vc;Lclient!vc;IIJ)V")
	public static void setWall(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity primary, @OriginalArg(5) Entity secondary, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long key) {
		if (primary == null && secondary == null) {
			return;
		}
		@Pc(8) Wall wall = new Wall();
		wall.key = key;
		wall.xFine = x * 128 + 64;
		wall.zFine = z * 128 + 64;
		wall.anInt5494 = arg3;
		wall.primary = primary;
		wall.secondary = secondary;
		wall.anInt5493 = arg6;
		wall.anInt5488 = arg7;
		for (@Pc(42) int level0 = level; level0 >= 0; level0--) {
			if (tiles[level0][x][z] == null) {
				tiles[level0][x][z] = new Tile(level0, x, z);
			}
		}
		tiles[level][x][z].wall = wall;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIILclient!vc;Lclient!vc;IIIIJ)V")
	public static void setWallDecor(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity primary, @OriginalArg(5) Entity secondary, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int xOffset, @OriginalArg(9) int zOffset, @OriginalArg(10) long key) {
		if (primary == null) {
			return;
		}
		@Pc(6) WallDecor wallDecor = new WallDecor();
		wallDecor.key = key;
		wallDecor.xFine = x * 128 + 64;
		wallDecor.zFine = z * 128 + 64;
		wallDecor.anInt5627 = arg3;
		wallDecor.primary = primary;
		wallDecor.secondary = secondary;
		wallDecor.anInt5629 = arg6;
		wallDecor.anInt5631 = arg7;
		wallDecor.xOffset = xOffset;
		wallDecor.zOffset = zOffset;
		for (@Pc(46) int level0 = level; level0 >= 0; level0--) {
			if (tiles[level0][x][z] == null) {
				tiles[level0][x][z] = new Tile(level0, x, z);
			}
		}
		tiles[level][x][z].wallDecor = wallDecor;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIILclient!vc;JZ)V")
	public static void setGroundDecor(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity entity, @OriginalArg(5) long key, @OriginalArg(6) boolean arg6) {
		if (entity == null) {
			return;
		}
		@Pc(6) GroundDecor groundDecor = new GroundDecor();
		groundDecor.entity = entity;
		groundDecor.xFine = x * 128 + 64;
		groundDecor.zFine = z * 128 + 64;
		groundDecor.anInt1130 = arg3;
		groundDecor.key = key;
		groundDecor.aBoolean63 = arg6;
		if (tiles[y][x][z] == null) {
			tiles[y][x][z] = new Tile(y, x, z);
		}
		tiles[y][x][z].groundDecor = groundDecor;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIILclient!vc;IZJ)Z")
	private static boolean addScenery(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int width, @OriginalArg(4) int length, @OriginalArg(5) int centerXFine, @OriginalArg(6) int centerZFine, @OriginalArg(7) int y, @OriginalArg(8) Entity entity, @OriginalArg(9) int angle, @OriginalArg(10) boolean arg10, @OriginalArg(11) long key) {
		@Pc(6) boolean underwater = tileHeights == underwaterTileHeights;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int x0 = x; x0 < x + width; x0++) {
			for (@Pc(17) int z0 = z; z0 < z + length; z0++) {
				if (x0 < 0 || z0 < 0 || x0 >= SceneGraph.width || z0 >= SceneGraph.length) {
					return false;
				}
				@Pc(42) Tile tile = tiles[level][x0][z0];
				if (tile != null && tile.sceneryLen >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Scenery scenery = new Scenery();
		scenery.key = key;
		scenery.level = level;
		scenery.centerXFine = centerXFine;
		scenery.centerZFine = centerZFine;
		scenery.y = y;
		scenery.entity = entity;
		scenery.angle = angle;
		scenery.xMin = x;
		scenery.zMin = z;
		scenery.xMax = x + width - 1;
		scenery.zMax = z + length - 1;
		for (@Pc(101) int x0 = x; x0 < x + width; x0++) {
			for (@Pc(108) int z0 = z; z0 < z + length; z0++) {
				@Pc(115) int interiorFlags = 0;
				if (x0 > x) {
					interiorFlags++;
				}
				if (x0 < x + width - 1) {
					interiorFlags += 4;
				}
				if (z0 > z) {
					interiorFlags += 8;
				}
				if (z0 < z + length - 1) {
					interiorFlags += 2;
				}
				for (@Pc(141) int level0 = level; level0 >= 0; level0--) {
					if (tiles[level0][x0][z0] == null) {
						tiles[level0][x0][z0] = new Tile(level0, x0, z0);
					}
				}
				@Pc(174) Tile tile = tiles[level][x0][z0];
				tile.scenery[tile.sceneryLen] = scenery;
				tile.interiorFlags[tile.sceneryLen] = interiorFlags;
				tile.allInteriorFlags |= interiorFlags;
				tile.sceneryLen++;
				if (underwater && anIntArrayArray10[x0][z0] != 0) {
					local8 = anIntArrayArray10[x0][z0];
				}
			}
		}
		if (underwater && local8 != 0) {
			for (@Pc(222) int x0 = x; x0 < x + width; x0++) {
				for (@Pc(229) int y0 = z; y0 < z + length; y0++) {
					if (anIntArrayArray10[x0][y0] == 0) {
						anIntArrayArray10[x0][y0] = local8;
					}
				}
			}
		}
		if (arg10) {
			SceneGraph.scenery[sceneryLen++] = scenery;
		}
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!co;)V")
	private static void removeScenery(@OriginalArg(0) Scenery scenery) {
		for (@Pc(2) int x = scenery.xMin; x <= scenery.xMax; x++) {
			for (@Pc(9) int z = scenery.zMin; z <= scenery.zMax; z++) {
				@Pc(22) Tile tile = tiles[scenery.level][x][z];
				if (tile != null) {
					for (@Pc(26) int i = 0; i < tile.sceneryLen; i++) {
						if (tile.scenery[i] == scenery) {
							tile.sceneryLen--;
							for (@Pc(44) int j = i; j < tile.sceneryLen; j++) {
								tile.scenery[j] = tile.scenery[j + 1];
								tile.interiorFlags[j] = tile.interiorFlags[j + 1];
							}
							tile.scenery[tile.sceneryLen] = null;
							break;
						}
					}
					tile.allInteriorFlags = 0;
					for (@Pc(84) int i = 0; i < tile.sceneryLen; i++) {
						tile.allInteriorFlags |= tile.interiorFlags[i];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z")
	public static boolean isAllLevelsVisible() {
		return GlRenderer.enabled ? true : Preferences.allLevelsVisible;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public static void setFirstVisibleLevel(@OriginalArg(0) int level) {
		firstVisibleLevel = level;
		for (@Pc(3) int x = 0; x < width; x++) {
			for (@Pc(8) int z = 0; z < length; z++) {
				if (tiles[level][x][z] == null) {
					tiles[level][x][z] = new Tile(level, x, z);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
	public static void removeAllScenery() {
		for (@Pc(1) int i = 0; i < sceneryLen; i++) {
			@Pc(8) Scenery scenery = SceneGraph.scenery[i];
			removeScenery(scenery);
			SceneGraph.scenery[i] = null;
		}
		sceneryLen = 0;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)Lclient!co;")
	public static Scenery removeScenery(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		if (tile == null) {
			return null;
		}
		for (@Pc(13) int i = 0; i < tile.sceneryLen; i++) {
			@Pc(22) Scenery scenery = tile.scenery[i];
			if ((scenery.key >> 29 & 0x3L) == 2L && scenery.xMin == x && scenery.zMin == z) {
				removeScenery(scenery);
				return scenery;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Lclient!ve;")
	public static Wall removeWall(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		if (tile == null) {
			return null;
		} else {
			@Pc(14) Wall wall = tile.wall;
			tile.wall = null;
			return wall;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Lclient!vl;")
	public static WallDecor removeWallDecor(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		if (tile == null) {
			return null;
		} else {
			@Pc(14) WallDecor wallDecor = tile.wallDecor;
			tile.wallDecor = null;
			return wallDecor;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Lclient!dm;")
	public static GroundDecor removeGroundDecor(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		if (tile == null) {
			return null;
		} else {
			@Pc(14) GroundDecor groundDecor = tile.groundDecor;
			tile.groundDecor = null;
			return groundDecor;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)J")
	public static long getWallKey(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		return tile == null || tile.wall == null ? 0L : tile.wall.key;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)J")
	public static long getWallDecorKey(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		return tile == null || tile.wallDecor == null ? 0L : tile.wallDecor.key;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)J")
	public static long getSceneryKey(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		if (tile == null) {
			return 0L;
		}
		for (@Pc(13) int i = 0; i < tile.sceneryLen; i++) {
			@Pc(22) Scenery scenery = tile.scenery[i];
			if ((scenery.key >> 29 & 0x3L) == 2L && scenery.xMin == x && scenery.zMin == z) {
				return scenery.key;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)J")
	public static long getGroundDecorKey(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		return tile == null || tile.groundDecor == null ? 0L : tile.groundDecor.key;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIJ)Z")
	public static boolean isLocValid(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) long key) {
		@Pc(7) Tile tile = tiles[level][x][z];
		if (tile == null) {
			return false;
		} else if (tile.wall != null && tile.wall.key == key) {
			return true;
		} else if (tile.wallDecor != null && tile.wallDecor.key == key) {
			return true;
		} else if (tile.groundDecor != null && tile.groundDecor.key == key) {
			return true;
		} else {
			for (@Pc(46) int i = 0; i < tile.sceneryLen; i++) {
				if (tile.scenery[i].key == key) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIILclient!vc;IJ)Z")
	public static boolean method2196(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) int width, @OriginalArg(5) int length, @OriginalArg(6) Entity arg6, @OriginalArg(8) long key) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int centerXFine = x * 128 + width * 64;
			@Pc(19) int centerZFine = z * 128 + length * 64;
			return addScenery(level, x, z, width, length, centerXFine, centerZFine, arg3, arg6, 0, false, key);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIILclient!vc;IJZ)Z")
	public static boolean method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Entity arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		@Pc(53) int local53 = local7 / 128;
		@Pc(57) int local57 = local11 / 128;
		@Pc(61) int local61 = local15 / 128;
		@Pc(65) int local65 = local19 / 128;
		return addScenery(arg0, local53, local57, local61 + 1 - local53, local65 + 1 - local57, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILclient!vc;IJIIII)Z")
	public static boolean method584(@OriginalArg(0) int level, @OriginalArg(1) int centerXFine, @OriginalArg(2) int centerZFine, @OriginalArg(3) int y, @OriginalArg(4) Entity entity, @OriginalArg(5) int angle, @OriginalArg(6) long key, @OriginalArg(7) int x0, @OriginalArg(8) int z0, @OriginalArg(9) int x1, @OriginalArg(10) int z1) {
		return entity == null ? true : addScenery(level, x0, z0, x1 + 1 - x0, z1 + 1 - z0, centerXFine, centerZFine, y, entity, angle, true, key);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void setTile(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int shape, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		if (shape == 0) {
			@Pc(12) PlainTile plainTile = new PlainTile(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (@Pc(14) int level0 = level; level0 >= 0; level0--) {
				if (tiles[level0][x][z] == null) {
					tiles[level0][x][z] = new Tile(level0, x, z);
				}
			}
			tiles[level][x][z].plainTile = plainTile;
		} else if (shape == 1) {
			@Pc(74) PlainTile local74 = new PlainTile(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (@Pc(76) int level0 = level; level0 >= 0; level0--) {
				if (tiles[level0][x][z] == null) {
					tiles[level0][x][z] = new Tile(level0, x, z);
				}
			}
			tiles[level][x][z].plainTile = local74;
		} else {
			@Pc(134) ShapedTile shapedTile = new ShapedTile(shape, arg4, arg5, x, z, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (@Pc(136) int level0 = level; level0 >= 0; level0--) {
				if (tiles[level0][x][z] == null) {
					tiles[level0][x][z] = new Tile(level0, x, z);
				}
			}
			tiles[level][x][z].shapedTile = shapedTile;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIILclient!vc;JLclient!vc;Lclient!vc;)V")
	public static void setObjStack(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity primary, @OriginalArg(5) long key, @OriginalArg(6) Entity secondary, @OriginalArg(7) Entity tertiary) {
		@Pc(3) ObjStackEntity entity = new ObjStackEntity();
		entity.primary = primary;
		entity.xFine = x * 128 + 64;
		entity.zFine = z * 128 + 64;
		entity.anInt5501 = arg3;
		entity.key = key;
		entity.secondary = secondary;
		entity.tertiary = tertiary;
		@Pc(34) int local34 = 0;
		@Pc(42) Tile tile = tiles[y][x][z];
		if (tile != null) {
			for (@Pc(46) int i = 0; i < tile.sceneryLen; i++) {
				@Pc(55) Scenery scenery = tile.scenery[i];
				if ((scenery.key & 0x400000L) == 0x400000L) {
					@Pc(66) int minY = scenery.entity.getMinY();
					if (minY != -32768 && minY < local34) {
						local34 = minY;
					}
				}
			}
		}
		entity.anInt5499 = -local34;
		if (tiles[y][x][z] == null) {
			tiles[y][x][z] = new Tile(y, x, z);
		}
		tiles[y][x][z].objStack = entity;
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(III)Lclient!vf;")
	public static ObjStackEntity removeObjStack(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[level][x][z];
		if (tile == null) {
			return null;
		} else {
			@Pc(14) ObjStackEntity entity = tile.objStack;
			tile.objStack = null;
			return entity;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V")
	public static void scaleWallDecorOffsets(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int scale) {
		@Pc(7) Tile tile = tiles[level][x][z];
		if (tile == null) {
			return;
		}
		@Pc(13) WallDecor wallDecor = tile.wallDecor;
		if (wallDecor != null) {
			wallDecor.xOffset = wallDecor.xOffset * scale / 16;
			wallDecor.zOffset = wallDecor.zOffset * scale / 16;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZII)I")
	public static int getTileHeight(@OriginalArg(3) int level, @OriginalArg(2) int xFine, @OriginalArg(0) int zFine) {
		if (tileHeights == null) {
			return 0;
		}
		@Pc(12) int x = xFine >> 7;
		@Pc(16) int z = zFine >> 7;
		if (x < 0 || z < 0 || x > 103 || z > 103) {
			return 0;
		}
		@Pc(38) int virtualLevel = level;
		if (level < 3 && (Static4.tileFlags[1][x][z] & 0x2) == 2) {
			virtualLevel = level + 1;
		}
		@Pc(61) int zFine2 = zFine & 0x7F;
		@Pc(70) int xFine2 = xFine & 0x7F;
		@Pc(98) int heightZ0 = tileHeights[virtualLevel][x][z] * (128 - xFine2) + xFine2 * tileHeights[virtualLevel][x + 1][z] >> 7;
		@Pc(128) int heightZ1 = tileHeights[virtualLevel][x + 1][z + 1] * xFine2 + (128 - xFine2) * tileHeights[virtualLevel][x][z + 1] >> 7;
		return heightZ1 * zFine2 + heightZ0 * (128 - zFine2) >> 7;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public static void link(@OriginalArg(0) int x, @OriginalArg(1) int z) {
		@Pc(7) Tile linkedTile = tiles[0][x][z];
		for (@Pc(9) int level = 0; level < 3; level++) {
			@Pc(30) Tile tile = tiles[level][x][z] = tiles[level + 1][x][z];
			if (tile != null) {
				tile.virtualLevel--;
				for (@Pc(40) int i = 0; i < tile.sceneryLen; i++) {
					@Pc(49) Scenery scenery = tile.scenery[i];
					if ((scenery.key >> 29 & 0x3L) == 2L && scenery.xMin == x && scenery.zMin == z) {
						scenery.level--;
					}
				}
			}
		}
		if (tiles[0][x][z] == null) {
			tiles[0][x][z] = new Tile(0, x, z);
		}
		tiles[0][x][z].linkedTile = linkedTile;
		tiles[3][x][z] = null;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBIIIII)V")
	public static void method4250(@OriginalArg(3) int level, @OriginalArg(1) int x, @OriginalArg(4) int z, @OriginalArg(5) int layer, @OriginalArg(7) int shape, @OriginalArg(6) int angle, @OriginalArg(0) int seqId) {
		if (x < 0 || z < 0 || x >= 103 || z >= 103) {
			return;
		}
		if (layer == 0) {
			@Pc(22) Wall wall = getWall(level, x, z);
			if (wall != null) {
				@Pc(32) int locId = (int) (wall.key >>> 32) & Integer.MAX_VALUE;
				if (shape == 2) {
					wall.primary = new Loc(locId, 2, angle + 4, level, x, z, seqId, false, wall.primary);
					wall.secondary = new Loc(locId, 2, angle + 1 & 0x3, level, x, z, seqId, false, wall.secondary);
				} else {
					wall.primary = new Loc(locId, shape, angle, level, x, z, seqId, false, wall.primary);
				}
			}
		}
		if (layer == 1) {
			@Pc(98) WallDecor wallDecor = getWallDecor(level, x, z);
			if (wallDecor != null) {
				@Pc(109) int locId = Integer.MAX_VALUE & (int) (wallDecor.key >>> 32);
				if (shape == 4 || shape == 5) {
					wallDecor.primary = new Loc(locId, 4, angle, level, x, z, seqId, false, wallDecor.primary);
				} else if (shape == 6) {
					wallDecor.primary = new Loc(locId, 4, angle + 4, level, x, z, seqId, false, wallDecor.primary);
				} else if (shape == 7) {
					wallDecor.primary = new Loc(locId, 4, (angle + 2 & 0x3) + 4, level, x, z, seqId, false, wallDecor.primary);
				} else if (shape == 8) {
					wallDecor.primary = new Loc(locId, 4, angle + 4, level, x, z, seqId, false, wallDecor.primary);
					wallDecor.secondary = new Loc(locId, 4, (angle + 2 & 0x3) + 4, level, x, z, seqId, false, wallDecor.secondary);
				}
			}
		}
		if (layer == 2) {
			if (shape == 11) {
				shape = 10;
			}
			@Pc(246) Scenery scenery = getScenery(level, x, z);
			if (scenery != null) {
				scenery.entity = new Loc((int) (scenery.key >>> 32) & Integer.MAX_VALUE, shape, angle, level, x, z, seqId, false, scenery.entity);
			}
		}
		if (layer == 3) {
			@Pc(280) GroundDecor groundDecor = getGroundDecor(level, x, z);
			if (groundDecor != null) {
				groundDecor.entity = new Loc(Integer.MAX_VALUE & (int) (groundDecor.key >>> 32), 22, angle, level, x, z, seqId, false, groundDecor.entity);
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	public static void clear() {
		if (surfaceTiles != null) {
			for (@Pc(3) int level = 0; level < surfaceTiles.length; level++) {
				for (@Pc(9) int x = 0; x < width; x++) {
					for (@Pc(14) int z = 0; z < length; z++) {
						surfaceTiles[level][x][z] = null;
					}
				}
			}
		}
		aClass4_Sub12ArrayArray1 = null;
		if (underwaterTiles != null) {
			for (@Pc(38) int level = 0; level < underwaterTiles.length; level++) {
				for (@Pc(44) int x = 0; x < width; x++) {
					for (@Pc(49) int z = 0; z < length; z++) {
						underwaterTiles[level][x][z] = null;
					}
				}
			}
		}
		aClass4_Sub12ArrayArray3 = null;
		anInt1742 = 0;
		if (aClass184Array13 != null) {
			for (@Pc(75) int i = 0; i < anInt1742; i++) {
				aClass184Array13[i] = null;
			}
		}
		if (scenery != null) {
			for (@Pc(88) int i = 0; i < sceneryLen; i++) {
				scenery[i] = null;
			}
			sceneryLen = 0;
		}
		if (aClass33Array1 != null) {
			for (@Pc(103) int i = 0; i < aClass33Array1.length; i++) {
				aClass33Array1[i] = null;
			}
		}
	}
}

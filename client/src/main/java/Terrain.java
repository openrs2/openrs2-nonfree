import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

public final class Terrain {
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
	public static Class4_Sub12[][] aClass4_Sub12ArrayArray3;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "[[[Lclient!nh;")
	public static Tile[][][] surfaceTiles;

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
	public static int sceneryLen = 0;

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
	public static Wall getWall(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[y][x][z];
		return tile == null ? null : tile.wall;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Lclient!vl;")
	public static WallDecor getWallDecor(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[y][x][z];
		return tile == null ? null : tile.wallDecor;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)Lclient!co;")
	public static Scenery getScenery(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[y][x][z];
		if (tile == null) {
			return null;
		}
		for (@Pc(13) int i = 0; i < tile.sceneryLen; i++) {
			@Pc(22) Scenery scenery = tile.scenery[i];
			if ((scenery.aLong38 >> 29 & 0x3L) == 2L && scenery.xMin == x && scenery.zMin == z) {
				return scenery;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Lclient!dm;")
	public static GroundDecor getGroundDecor(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[y][x][z];
		return tile == null || tile.groundDecor == null ? null : tile.groundDecor;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIILclient!vc;Lclient!vc;IIJ)V")
	public static void setWall(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) Entity arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Wall wall = new Wall();
		wall.aLong188 = arg8;
		wall.x = x * 128 + 64;
		wall.z = z * 128 + 64;
		wall.anInt5494 = arg3;
		wall.aClass53_5 = arg4;
		wall.aClass53_4 = arg5;
		wall.anInt5493 = arg6;
		wall.anInt5488 = arg7;
		for (@Pc(42) int y0 = y; y0 >= 0; y0--) {
			if (tiles[y0][x][z] == null) {
				tiles[y0][x][z] = new Tile(y0, x, z);
			}
		}
		tiles[y][x][z].wall = wall;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIILclient!vc;Lclient!vc;IIIIJ)V")
	public static void setWallDecor(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) Entity arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) WallDecor wallDecor = new WallDecor();
		wallDecor.aLong194 = arg10;
		wallDecor.x = x * 128 + 64;
		wallDecor.z = z * 128 + 64;
		wallDecor.anInt5627 = arg3;
		wallDecor.aClass53_10 = arg4;
		wallDecor.aClass53_9 = arg5;
		wallDecor.anInt5629 = arg6;
		wallDecor.anInt5631 = arg7;
		wallDecor.anInt5633 = arg8;
		wallDecor.anInt5625 = arg9;
		for (@Pc(46) int y0 = y; y0 >= 0; y0--) {
			if (tiles[y0][x][z] == null) {
				tiles[y0][x][z] = new Tile(y0, x, z);
			}
		}
		tiles[y][x][z].wallDecor = wallDecor;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIILclient!vc;JZ)V")
	public static void setGroundDecor(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) GroundDecor groundDecor = new GroundDecor();
		groundDecor.aClass53_2 = arg4;
		groundDecor.x = x * 128 + 64;
		groundDecor.z = z * 128 + 64;
		groundDecor.anInt1130 = arg3;
		groundDecor.aLong45 = arg5;
		groundDecor.aBoolean63 = arg6;
		if (tiles[y][x][z] == null) {
			tiles[y][x][z] = new Tile(y, x, z);
		}
		tiles[y][x][z].groundDecor = groundDecor;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIILclient!vc;IZJ)Z")
	public static boolean addScenery(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int width, @OriginalArg(4) int length, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Entity arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean underwater = tileHeights == underwaterTileHeights;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int x0 = x; x0 < x + width; x0++) {
			for (@Pc(17) int z0 = z; z0 < z + length; z0++) {
				if (x0 < 0 || z0 < 0 || x0 >= Terrain.width || z0 >= Terrain.length) {
					return false;
				}
				@Pc(42) Tile tile = tiles[y][x0][z0];
				if (tile != null && tile.sceneryLen >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Scenery scenery = new Scenery();
		scenery.aLong38 = arg11;
		scenery.y = y;
		scenery.anInt821 = arg5;
		scenery.anInt827 = arg6;
		scenery.anInt823 = arg7;
		scenery.aClass53_1 = arg8;
		scenery.anInt814 = arg9;
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
				for (@Pc(141) int y0 = y; y0 >= 0; y0--) {
					if (tiles[y0][x0][z0] == null) {
						tiles[y0][x0][z0] = new Tile(y0, x0, z0);
					}
				}
				@Pc(174) Tile tile = tiles[y][x0][z0];
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
			Terrain.scenery[sceneryLen++] = scenery;
		}
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!co;)V")
	public static void removeScenery(@OriginalArg(0) Scenery scenery) {
		for (@Pc(2) int x = scenery.xMin; x <= scenery.xMax; x++) {
			for (@Pc(9) int z = scenery.zMin; z <= scenery.zMax; z++) {
				@Pc(22) Tile tile = tiles[scenery.y][x][z];
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
	public static void setFirstVisibleLevel(@OriginalArg(0) int y) {
		firstVisibleLevel = y;
		for (@Pc(3) int x = 0; x < width; x++) {
			for (@Pc(8) int z = 0; z < length; z++) {
				if (tiles[y][x][z] == null) {
					tiles[y][x][z] = new Tile(y, x, z);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
	public static void removeAllScenery() {
		for (@Pc(1) int i = 0; i < sceneryLen; i++) {
			@Pc(8) Scenery scenery = Terrain.scenery[i];
			removeScenery(scenery);
			Terrain.scenery[i] = null;
		}
		sceneryLen = 0;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)Lclient!co;")
	public static Scenery method2593(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[y][x][z];
		if (tile == null) {
			return null;
		}
		for (@Pc(13) int i = 0; i < tile.sceneryLen; i++) {
			@Pc(22) Scenery scenery = tile.scenery[i];
			if ((scenery.aLong38 >> 29 & 0x3L) == 2L && scenery.xMin == x && scenery.zMin == z) {
				removeScenery(scenery);
				return scenery;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Lclient!ve;")
	public static Wall removeWall(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[y][x][z];
		if (tile == null) {
			return null;
		} else {
			@Pc(14) Wall wall = tile.wall;
			tile.wall = null;
			return wall;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Lclient!vl;")
	public static WallDecor removeWallDecor(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[y][x][z];
		if (tile == null) {
			return null;
		} else {
			@Pc(14) WallDecor wallDecor = tile.wallDecor;
			tile.wallDecor = null;
			return wallDecor;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Lclient!dm;")
	public static GroundDecor removeGroundDecor(@OriginalArg(0) int y, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(7) Tile tile = tiles[y][x][z];
		if (tile == null) {
			return null;
		} else {
			@Pc(14) GroundDecor groundDecor = tile.groundDecor;
			tile.groundDecor = null;
			return groundDecor;
		}
	}
}

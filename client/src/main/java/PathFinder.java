import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class PathFinder {
	@OriginalMember(owner = "client!ve", name = "o", descriptor = "[Lclient!ch;")
	public static final CollisionMap[] collisionMaps = new CollisionMap[4];

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "[I")
	public static final int[] queueZ = new int[4096];

	@OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
	public static final int[] queueX = new int[4096];

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "[[I")
	public static int[][] costs;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[[I")
	public static int[][] parents;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIIIIZ)V")
	private static void findPathN(@OriginalArg(2) int srcX, @OriginalArg(4) int srcZ, @OriginalArg(9) int size, @OriginalArg(1) int destX, @OriginalArg(7) int destZ, @OriginalArg(0) int destType, @OriginalArg(3) int destWidth, @OriginalArg(6) int destLength, @OriginalArg(10) int destAngle, @OriginalArg(8) int destBlockedSides) {
		for (@Pc(7) int x = 0; x < 104; x++) {
			for (@Pc(12) int z = 0; z < 104; z++) {
				parents[x][z] = 0;
				costs[x][z] = 99999999;
			}
		}
		parents[srcX][srcZ] = 99;
		costs[srcX][srcZ] = 0;
		@Pc(51) int x = srcX;
		@Pc(53) int z = srcZ;
		@Pc(55) byte firstWriterIndex = 0;
		queueX[0] = srcX;
		@Pc(62) int queueWriterIndex = firstWriterIndex + 1;
		queueZ[0] = srcZ;
		@Pc(66) int queueReaderIndex = 0;
		@Pc(68) boolean found = false;
		@Pc(73) int[][] flags = collisionMaps[Player.level].flags;
		label322:
		while (queueReaderIndex != queueWriterIndex) {
			z = queueZ[queueReaderIndex];
			x = queueX[queueReaderIndex];
			queueReaderIndex = queueReaderIndex + 1 & 0xFFF;
			if (x == destX && z == destZ) {
				found = true;
				break;
			}
			if (destType != 0) {
				if ((destType < 5 || destType == 10) && collisionMaps[Player.level].isAtWall(x, z, size, destX, destZ, destType - 1, destAngle)) {
					found = true;
					break;
				}
				if (destType < 10 && collisionMaps[Player.level].isAtWallDecor(x, z, size, destX, destZ, destType - 1, destAngle)) {
					found = true;
					break;
				}
			}
			if (destWidth != 0 && destLength != 0 && collisionMaps[Player.level].isInsideOrOutsideRect(x, z, size, destX, destZ, destWidth, destLength, destBlockedSides)) {
				found = true;
				break;
			}
			@Pc(200) int cost = costs[x][z] + 1;
			if (x > 0 && parents[x - 1][z] == 0 && (flags[x - 1][z] & 0x2C010E) == 0 && (flags[x - 1][size + z - 1] & 0x2C0138) == 0) {
				@Pc(244) int off = 1;
				while (true) {
					if (size - 1 <= off) {
						queueX[queueWriterIndex] = x - 1;
						queueZ[queueWriterIndex] = z;
						parents[x - 1][z] = 2;
						costs[x - 1][z] = cost;
						queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
						break;
					}
					if ((flags[x - 1][off + z] & 0x2C013E) != 0) {
						break;
					}
					off++;
				}
			}
			if (x < 102 && parents[x + 1][z] == 0 && (flags[x + size][z] & 0x2C0183) == 0 && (flags[x + size][z + size - 1] & 0x2C01E0) == 0) {
				@Pc(351) int off = 1;
				while (true) {
					if (size - 1 <= off) {
						queueX[queueWriterIndex] = x + 1;
						queueZ[queueWriterIndex] = z;
						queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
						parents[x + 1][z] = 8;
						costs[x + 1][z] = cost;
						break;
					}
					if ((flags[size + x][z + off] & 0x2C01E3) != 0) {
						break;
					}
					off++;
				}
			}
			if (z > 0 && parents[x][z - 1] == 0 && (flags[x][z - 1] & 0x2C010E) == 0 && (flags[size + x - 1][z - 1] & 0x2C0183) == 0) {
				@Pc(456) int off = 1;
				while (true) {
					if (off >= size - 1) {
						queueX[queueWriterIndex] = x;
						queueZ[queueWriterIndex] = z - 1;
						parents[x][z - 1] = 1;
						queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
						costs[x][z - 1] = cost;
						break;
					}
					if ((flags[off + x][z - 1] & 0x2C018F) != 0) {
						break;
					}
					off++;
				}
			}
			if (z < 102 && parents[x][z + 1] == 0 && (flags[x][z + size] & 0x2C0138) == 0 && (flags[x + size - 1][size + z] & 0x2C01E0) == 0) {
				@Pc(561) int off = 1;
				while (true) {
					if (off >= size - 1) {
						queueX[queueWriterIndex] = x;
						queueZ[queueWriterIndex] = z + 1;
						parents[x][z + 1] = 4;
						costs[x][z + 1] = cost;
						queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
						break;
					}
					if ((flags[x + off][size + z] & 0x2C01F8) != 0) {
						break;
					}
					off++;
				}
			}
			if (x > 0 && z > 0 && parents[x - 1][z - 1] == 0 && (flags[x - 1][z - 1] & 0x2C010E) == 0) {
				@Pc(655) int off = 1;
				while (true) {
					if (size <= off) {
						queueX[queueWriterIndex] = x - 1;
						queueZ[queueWriterIndex] = z - 1;
						parents[x - 1][z - 1] = 3;
						queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
						costs[x - 1][z - 1] = cost;
						break;
					}
					if ((flags[x - 1][z + off - 1] & 0x2C013E) != 0 || (flags[off + x - 1][z - 1] & 0x2C018F) != 0) {
						break;
					}
					off++;
				}
			}
			if (x < 102 && z > 0 && parents[x + 1][z - 1] == 0 && (flags[x + size][z - 1] & 0x2C0183) == 0) {
				@Pc(767) int off = 1;
				while (true) {
					if (size <= off) {
						queueX[queueWriterIndex] = x + 1;
						queueZ[queueWriterIndex] = z - 1;
						queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
						parents[x + 1][z - 1] = 9;
						costs[x + 1][z - 1] = cost;
						break;
					}
					if ((flags[x + size][z + off - 1] & 0x2C01E3) != 0 || (flags[off + x][z - 1] & 0x2C018F) != 0) {
						break;
					}
					off++;
				}
			}
			if (x > 0 && z < 102 && parents[x - 1][z + 1] == 0 && (flags[x - 1][size + z] & 0x2C0138) == 0) {
				@Pc(877) int off = 1;
				while (true) {
					if (size <= off) {
						queueX[queueWriterIndex] = x - 1;
						queueZ[queueWriterIndex] = z + 1;
						parents[x - 1][z + 1] = 6;
						queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
						costs[x - 1][z + 1] = cost;
						break;
					}
					if ((flags[x - 1][z + off] & 0x2C013E) != 0 || (flags[x + off - 1][z + size] & 0x2C01F8) != 0) {
						break;
					}
					off++;
				}
			}
			if (x < 102 && z < 102 && parents[x + 1][z + 1] == 0 && (flags[size + x][size + z] & 0x2C01E0) == 0) {
				for (@Pc(990) int off = 1; off < size; off++) {
					if ((flags[x + off][size + z] & 0x2C01F8) != 0 || (flags[x + size][z + off] & 0x2C01E3) != 0) {
						continue label322;
					}
				}
				queueX[queueWriterIndex] = x + 1;
				queueZ[queueWriterIndex] = z + 1;
				parents[x + 1][z + 1] = 12;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				costs[x + 1][z + 1] = cost;
			}
		}
		if (!found) {
			@Pc(1081) int bestDistance = 1000;
			@Pc(1083) int bestCost = 100;
			for (@Pc(1090) int x0 = destX - 10; x0 <= destX + 10; x0++) {
				for (@Pc(1100) int z0 = destZ - 10; z0 <= destZ + 10; z0++) {
					if (x0 >= 0 && z0 >= 0 && x0 < 104 && z0 < 104 && costs[x0][z0] < 100) {
						@Pc(1129) int dx = 0;
						if (destX > x0) {
							dx = destX - x0;
						} else if (destWidth + destX - 1 < x0) {
							dx = x0 + 1 - destX - destWidth;
						}
						@Pc(1164) int dz = 0;
						if (z0 < destZ) {
							dz = destZ - z0;
						} else if (z0 > destZ + destLength - 1) {
							dz = z0 + 1 - destZ - destLength;
						}
						@Pc(1208) int distance = dx * dx + dz * dz;
						if (distance < bestDistance || distance == bestDistance && bestCost > costs[x0][z0]) {
							x = x0;
							bestDistance = distance;
							z = z0;
							bestCost = costs[x0][z0];
						}
					}
				}
			}
			if (bestDistance == 1000) {
				return;
			}
			if (srcX == x && srcZ == z) {
				return;
			}
		}
		Static3.aBoolean147 = false;
		Static3.anInt2140 = z;
		Static6.anInt4506 = x;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIIIIIIIII)V")
	private static void findPath1(@OriginalArg(7) int srcX, @OriginalArg(1) int srcZ, @OriginalArg(2) int destX, @OriginalArg(5) int destZ, @OriginalArg(6) int destType, @OriginalArg(10) int destWidth, @OriginalArg(3) int destLength, @OriginalArg(4) int destAngle, @OriginalArg(8) int destBlockedSides) {
		for (@Pc(7) int x = 0; x < 104; x++) {
			for (@Pc(14) int z = 0; z < 104; z++) {
				parents[x][z] = 0;
				costs[x][z] = 99999999;
			}
		}
		@Pc(37) int x = srcX;
		@Pc(39) int z = srcZ;
		@Pc(41) byte firstWriterIndex = 0;
		parents[srcX][srcZ] = 99;
		@Pc(49) int queueReaderIndex = 0;
		costs[srcX][srcZ] = 0;
		queueX[0] = srcX;
		@Pc(62) int queueWriterIndex = firstWriterIndex + 1;
		queueZ[0] = srcZ;
		@Pc(66) boolean found = false;
		@Pc(71) int[][] flags = collisionMaps[Player.level].flags;
		while (queueWriterIndex != queueReaderIndex) {
			z = queueZ[queueReaderIndex];
			x = queueX[queueReaderIndex];
			queueReaderIndex = queueReaderIndex + 1 & 0xFFF;
			if (x == destX && destZ == z) {
				found = true;
				break;
			}
			if (destType != 0) {
				if ((destType < 5 || destType == 10) && collisionMaps[Player.level].isAtWall(x, z, 1, destX, destZ, destType - 1, destAngle)) {
					found = true;
					break;
				}
				if (destType < 10 && collisionMaps[Player.level].isAtWallDecor(x, z, 1, destX, destZ, destType - 1, destAngle)) {
					found = true;
					break;
				}
			}
			if (destWidth != 0 && destLength != 0 && collisionMaps[Player.level].isInsideOrOutsideRect(x, z, 1, destX, destZ, destWidth, destLength, destBlockedSides)) {
				found = true;
				break;
			}
			@Pc(192) int cost = costs[x][z] + 1;
			if (x > 0 && parents[x - 1][z] == 0 && (flags[x - 1][z] & 0x2C0108) == 0) {
				queueX[queueWriterIndex] = x - 1;
				queueZ[queueWriterIndex] = z;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x - 1][z] = 2;
				costs[x - 1][z] = cost;
			}
			if (x < 103 && parents[x + 1][z] == 0 && (flags[x + 1][z] & 0x2C0180) == 0) {
				queueX[queueWriterIndex] = x + 1;
				queueZ[queueWriterIndex] = z;
				parents[x + 1][z] = 8;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				costs[x + 1][z] = cost;
			}
			if (z > 0 && parents[x][z - 1] == 0 && (flags[x][z - 1] & 0x2C0102) == 0) {
				queueX[queueWriterIndex] = x;
				queueZ[queueWriterIndex] = z - 1;
				parents[x][z - 1] = 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				costs[x][z - 1] = cost;
			}
			if (z < 103 && parents[x][z + 1] == 0 && (flags[x][z + 1] & 0x2C0120) == 0) {
				queueX[queueWriterIndex] = x;
				queueZ[queueWriterIndex] = z + 1;
				parents[x][z + 1] = 4;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				costs[x][z + 1] = cost;
			}
			if (x > 0 && z > 0 && parents[x - 1][z - 1] == 0 && (flags[x - 1][z - 1] & 0x2C010E) == 0 && (flags[x - 1][z] & 0x2C0108) == 0 && (flags[x][z - 1] & 0x2C0102) == 0) {
				queueX[queueWriterIndex] = x - 1;
				queueZ[queueWriterIndex] = z - 1;
				parents[x - 1][z - 1] = 3;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				costs[x - 1][z - 1] = cost;
			}
			if (x < 103 && z > 0 && parents[x + 1][z - 1] == 0 && (flags[x + 1][z - 1] & 0x2C0183) == 0 && (flags[x + 1][z] & 0x2C0180) == 0 && (flags[x][z - 1] & 0x2C0102) == 0) {
				queueX[queueWriterIndex] = x + 1;
				queueZ[queueWriterIndex] = z - 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x + 1][z - 1] = 9;
				costs[x + 1][z - 1] = cost;
			}
			if (x > 0 && z < 103 && parents[x - 1][z + 1] == 0 && (flags[x - 1][z + 1] & 0x2C0138) == 0 && (flags[x - 1][z] & 0x2C0108) == 0 && (flags[x][z + 1] & 0x2C0120) == 0) {
				queueX[queueWriterIndex] = x - 1;
				queueZ[queueWriterIndex] = z + 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x - 1][z + 1] = 6;
				costs[x - 1][z + 1] = cost;
			}
			if (x < 103 && z < 103 && parents[x + 1][z + 1] == 0 && (flags[x + 1][z + 1] & 0x2C01E0) == 0 && (flags[x + 1][z] & 0x2C0180) == 0 && (flags[x][z + 1] & 0x2C0120) == 0) {
				queueX[queueWriterIndex] = x + 1;
				queueZ[queueWriterIndex] = z + 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x + 1][z + 1] = 12;
				costs[x + 1][z + 1] = cost;
			}
		}
		if (!found) {
			@Pc(805) int bestDistance = 1000;
			@Pc(809) int bestCost = 100;
			for (@Pc(814) int x0 = destX - 10; x0 <= destX + 10; x0++) {
				for (@Pc(827) int z0 = destZ - 10; z0 <= destZ + 10; z0++) {
					if (x0 >= 0 && z0 >= 0 && x0 < 104 && z0 < 104 && costs[x0][z0] < 100) {
						@Pc(858) int dx = 0;
						if (destX > x0) {
							dx = destX - x0;
						} else if (destWidth + destX - 1 < x0) {
							dx = x0 + 1 - destWidth - destX;
						}
						@Pc(889) int dz = 0;
						if (destZ > z0) {
							dz = destZ - z0;
						} else if (destZ + destLength - 1 < z0) {
							dz = z0 + 1 - destZ - destLength;
						}
						@Pc(930) int distance = dz * dz + dx * dx;
						if (bestDistance > distance || bestDistance == distance && bestCost > costs[x0][z0]) {
							z = z0;
							bestCost = costs[x0][z0];
							bestDistance = distance;
							x = x0;
						}
					}
				}
			}
			if (bestDistance == 1000) {
				return;
			}
			if (x == srcX && z == srcZ) {
				return;
			}
		}
		Static6.anInt4506 = x;
		Static3.aBoolean147 = false;
		Static3.anInt2140 = z;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIZIIIII)V")
	private static void findPath2(@OriginalArg(4) int srcX, @OriginalArg(2) int srcZ, @OriginalArg(0) int destX, @OriginalArg(6) int destZ, @OriginalArg(3) int destType, @OriginalArg(1) int destWidth, @OriginalArg(10) int destLength, @OriginalArg(8) int destAngle, @OriginalArg(9) int destBlockedSides) {
		for (@Pc(7) int x = 0; x < 104; x++) {
			for (@Pc(12) int z = 0; z < 104; z++) {
				parents[x][z] = 0;
				costs[x][z] = 99999999;
			}
		}
		@Pc(37) int z = srcZ;
		parents[srcX][srcZ] = 99;
		costs[srcX][srcZ] = 0;
		@Pc(51) int x = srcX;
		@Pc(53) int queueReaderIndex = 0;
		@Pc(55) byte firstWriterIndex = 0;
		@Pc(57) boolean found = false;
		queueX[0] = srcX;
		@Pc(64) int queueWriterIndex = firstWriterIndex + 1;
		queueZ[0] = srcZ;
		@Pc(77) int[][] flags = collisionMaps[Player.level].flags;
		while (queueWriterIndex != queueReaderIndex) {
			x = queueX[queueReaderIndex];
			z = queueZ[queueReaderIndex];
			queueReaderIndex = queueReaderIndex + 1 & 0xFFF;
			if (destX == x && z == destZ) {
				found = true;
				break;
			}
			if (destType != 0) {
				if ((destType < 5 || destType == 10) && collisionMaps[Player.level].isAtWall(x, z, 2, destX, destZ, destType - 1, destAngle)) {
					found = true;
					break;
				}
				if (destType < 10 && collisionMaps[Player.level].isAtWallDecor(x, z, 2, destX, destZ, destType - 1, destAngle)) {
					found = true;
					break;
				}
			}
			if (destWidth != 0 && destLength != 0 && collisionMaps[Player.level].isInsideOrOutsideRect(x, z, 2, destX, destZ, destWidth, destLength, destBlockedSides)) {
				found = true;
				break;
			}
			@Pc(201) int cost = costs[x][z] + 1;
			if (x > 0 && parents[x - 1][z] == 0 && (flags[x - 1][z] & 0x2C010E) == 0 && (flags[x - 1][z + 1] & 0x2C0138) == 0) {
				queueX[queueWriterIndex] = x - 1;
				queueZ[queueWriterIndex] = z;
				parents[x - 1][z] = 2;
				costs[x - 1][z] = cost;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
			}
			if (x < 102 && parents[x + 1][z] == 0 && (flags[x + 2][z] & 0x2C0183) == 0 && (flags[x + 2][z + 1] & 0x2C01E0) == 0) {
				queueX[queueWriterIndex] = x + 1;
				queueZ[queueWriterIndex] = z;
				parents[x + 1][z] = 8;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				costs[x + 1][z] = cost;
			}
			if (z > 0 && parents[x][z - 1] == 0 && (flags[x][z - 1] & 0x2C010E) == 0 && (flags[x + 1][z - 1] & 0x2C0183) == 0) {
				queueX[queueWriterIndex] = x;
				queueZ[queueWriterIndex] = z - 1;
				parents[x][z - 1] = 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				costs[x][z - 1] = cost;
			}
			if (z < 102 && parents[x][z + 1] == 0 && (flags[x][z + 2] & 0x2C0138) == 0 && (flags[x + 1][z + 2] & 0x2C01E0) == 0) {
				queueX[queueWriterIndex] = x;
				queueZ[queueWriterIndex] = z + 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x][z + 1] = 4;
				costs[x][z + 1] = cost;
			}
			if (x > 0 && z > 0 && parents[x - 1][z - 1] == 0 && (flags[x - 1][z] & 0x2C013E) == 0 && (flags[x - 1][z - 1] & 0x2C010E) == 0 && (flags[x][z - 1] & 0x2C018F) == 0) {
				queueX[queueWriterIndex] = x - 1;
				queueZ[queueWriterIndex] = z - 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x - 1][z - 1] = 3;
				costs[x - 1][z - 1] = cost;
			}
			if (x < 102 && z > 0 && parents[x + 1][z - 1] == 0 && (flags[x + 1][z - 1] & 0x2C018F) == 0 && (flags[x + 2][z - 1] & 0x2C0183) == 0 && (flags[x + 2][z] & 0x2C01E3) == 0) {
				queueX[queueWriterIndex] = x + 1;
				queueZ[queueWriterIndex] = z - 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x + 1][z - 1] = 9;
				costs[x + 1][z - 1] = cost;
			}
			if (x > 0 && z < 102 && parents[x - 1][z + 1] == 0 && (flags[x - 1][z + 1] & 0x2C013E) == 0 && (flags[x - 1][z + 2] & 0x2C0138) == 0 && (flags[x][z + 2] & 0x2C01F8) == 0) {
				queueX[queueWriterIndex] = x - 1;
				queueZ[queueWriterIndex] = z + 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x - 1][z + 1] = 6;
				costs[x - 1][z + 1] = cost;
			}
			if (x < 102 && z < 102 && parents[x + 1][z + 1] == 0 && (flags[x + 1][z + 2] & 0x2C01F8) == 0 && (flags[x + 2][z + 2] & 0x2C01E0) == 0 && (flags[x + 2][z + 1] & 0x2C01E3) == 0) {
				queueX[queueWriterIndex] = x + 1;
				queueZ[queueWriterIndex] = z + 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x + 1][z + 1] = 12;
				costs[x + 1][z + 1] = cost;
			}
		}
		if (!found) {
			@Pc(920) int bestDistance = 1000;
			@Pc(922) int bestCost = 100;
			for (@Pc(928) int x0 = destX - 10; x0 <= destX + 10; x0++) {
				for (@Pc(938) int z0 = destZ - 10; z0 <= destZ + 10; z0++) {
					if (x0 >= 0 && z0 >= 0 && x0 < 104 && z0 < 104 && costs[x0][z0] < 100) {
						@Pc(970) int dx = 0;
						@Pc(972) int dz = 0;
						if (destX > x0) {
							dx = destX - x0;
						} else if (destWidth + destX - 1 < x0) {
							dx = x0 + 1 - destWidth - destX;
						}
						if (z0 < destZ) {
							dz = destZ - z0;
						} else if (z0 > destLength + destZ - 1) {
							dz = z0 + 1 - destLength - destZ;
						}
						@Pc(1049) int distance = dx * dx + dz * dz;
						if (bestDistance > distance || distance == bestDistance && bestCost > costs[x0][z0]) {
							bestCost = costs[x0][z0];
							z = z0;
							x = x0;
							bestDistance = distance;
						}
					}
				}
			}
			if (bestDistance == 1000) {
				return;
			}
			if (srcX == x && srcZ == z) {
				return;
			}
		}
		Static3.aBoolean147 = false;
		Static6.anInt4506 = x;
		Static3.anInt2140 = z;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIZIIIIBII)V")
	public static void findPath(@OriginalArg(0) int srcX, @OriginalArg(6) int srcZ, @OriginalArg(10) int destX, @OriginalArg(5) int destZ, @OriginalArg(7) int destType, @OriginalArg(4) int destWidth, @OriginalArg(9) int destLength, @OriginalArg(1) int destAngle, @OriginalArg(2) int destBlockedSides) {
		if (PlayerList.self.getSize() == 2) {
			findPath2(srcX, srcZ, destX, destZ, destType, destWidth, destLength, destAngle, destBlockedSides);
		} else if (PlayerList.self.getSize() > 2) {
			findPathN(srcX, srcZ, PlayerList.self.getSize(), destX, destZ, destType, destWidth, destLength, destAngle, destBlockedSides);
		} else {
			findPath1(srcX, srcZ, destX, destZ, destType, destWidth, destLength, destAngle, destBlockedSides);
		}
	}
}

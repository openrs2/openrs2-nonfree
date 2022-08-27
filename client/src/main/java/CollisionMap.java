import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class CollisionMap {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIII)Z")
	private static boolean isInsideRect(@OriginalArg(7) int x, @OriginalArg(0) int z, @OriginalArg(8) int width, @OriginalArg(3) int length, @OriginalArg(1) int destX, @OriginalArg(4) int destZ, @OriginalArg(5) int destWidth, @OriginalArg(2) int destLength) {
		if (destX + destWidth > x && width + x > destX) {
			return z < destLength + destZ && destZ < length + z;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	private final int width;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
	private final int zOffset;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
	private final int xOffset;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	private final int length;

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "[[I")
	public final int[][] flags;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(II)V")
	public CollisionMap(@OriginalArg(0) int width, @OriginalArg(1) int length) {
		this.width = width;
		this.zOffset = 0;
		this.xOffset = 0;
		this.length = length;
		this.flags = new int[this.width][this.length];
		this.clear();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)V")
	private void flag(@OriginalArg(2) int x, @OriginalArg(1) int z, @OriginalArg(0) int flags) {
		this.flags[x][z] |= flags;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIII)V")
	private void unflag(@OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int flags) {
		this.flags[x][z] &= ~flags;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	public void flagGroundDecor(@OriginalArg(2) int x, @OriginalArg(0) int z) {
		z -= this.zOffset;
		x -= this.xOffset;
		this.flags[x][z] |= 0x40000;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZIIIII)V")
	public void flagScenery(@OriginalArg(6) int x, @OriginalArg(4) int z, @OriginalArg(3) int width, @OriginalArg(2) int length, @OriginalArg(0) boolean blockProjectiles, @OriginalArg(1) boolean blockRoutes) {
		z -= this.zOffset;
		@Pc(12) int flags = 0x100;
		x -= this.xOffset;
		if (blockProjectiles) {
			flags = 0x20100;
		}
		if (blockRoutes) {
			flags |= 0x40000000;
		}
		for (@Pc(32) int x0 = x; x0 < x + width; x0++) {
			if (x0 >= 0 && x0 < this.width) {
				for (@Pc(54) int z0 = z; z0 < z + length; z0++) {
					if (z0 >= 0 && z0 < this.length) {
						this.flag(x0, z0, flags);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIZIIZ)V")
	public void unflagScenery(@OriginalArg(5) int x, @OriginalArg(1) int z, @OriginalArg(6) int width, @OriginalArg(2) int length, @OriginalArg(0) int angle, @OriginalArg(4) boolean blockProjectiles, @OriginalArg(7) boolean blockRoutes) {
		z -= this.zOffset;
		if (angle == 1 || angle == 3) {
			@Pc(23) int temp = width;
			width = length;
			length = temp;
		}
		x -= this.xOffset;
		@Pc(34) int flags = 0x100;
		if (blockProjectiles) {
			flags = 0x20100;
		}
		if (blockRoutes) {
			flags |= 0x40000000;
		}
		for (@Pc(49) int x0 = x; x0 < x + width; x0++) {
			if (x0 >= 0 && x0 < this.width) {
				for (@Pc(70) int z0 = z; z0 < length + z; z0++) {
					if (z0 >= 0 && z0 < this.length) {
						this.unflag(x0, z0, flags);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIIZII)V")
	public void unflagWall(@OriginalArg(2) int x, @OriginalArg(6) int z, @OriginalArg(3) int shape, @OriginalArg(0) int angle, @OriginalArg(4) boolean blockProjectiles, @OriginalArg(1) boolean blockRoutes) {
		x -= this.xOffset;
		z -= this.zOffset;
		if (shape == 0) {
			if (angle == 0) {
				this.unflag(x, z, 0x80);
				this.unflag(x - 1, z, 0x8);
			}
			if (angle == 1) {
				this.unflag(x, z, 0x2);
				this.unflag(x, z + 1, 0x20);
			}
			if (angle == 2) {
				this.unflag(x, z, 0x8);
				this.unflag(x + 1, z, 0x80);
			}
			if (angle == 3) {
				this.unflag(x, z, 0x20);
				this.unflag(x, z - 1, 0x2);
			}
		}
		if (shape == 1 || shape == 3) {
			if (angle == 0) {
				this.unflag(x, z, 0x1);
				this.unflag(x - 1, z + 1, 0x10);
			}
			if (angle == 1) {
				this.unflag(x, z, 0x4);
				this.unflag(x + 1, z + 1, 0x40);
			}
			if (angle == 2) {
				this.unflag(x, z, 0x10);
				this.unflag(x + 1, z - 1, 0x1);
			}
			if (angle == 3) {
				this.unflag(x, z, 0x40);
				this.unflag(x - 1, z - 1, 0x4);
			}
		}
		if (shape == 2) {
			if (angle == 0) {
				this.unflag(x, z, 0x82);
				this.unflag(x - 1, z, 0x8);
				this.unflag(x, z + 1, 0x20);
			}
			if (angle == 1) {
				this.unflag(x, z, 0xA);
				this.unflag(x, z + 1, 0x20);
				this.unflag(x + 1, z, 0x80);
			}
			if (angle == 2) {
				this.unflag(x, z, 0x28);
				this.unflag(x + 1, z, 0x80);
				this.unflag(x, z - 1, 0x2);
			}
			if (angle == 3) {
				this.unflag(x, z, 0xA0);
				this.unflag(x, z - 1, 0x2);
				this.unflag(x - 1, z, 0x8);
			}
		}
		if (blockProjectiles) {
			if (shape == 0) {
				if (angle == 0) {
					this.unflag(x, z, 0x10000);
					this.unflag(x - 1, z, 0x1000);
				}
				if (angle == 1) {
					this.unflag(x, z, 0x400);
					this.unflag(x, z + 1, 0x4000);
				}
				if (angle == 2) {
					this.unflag(x, z, 0x1000);
					this.unflag(x + 1, z, 0x10000);
				}
				if (angle == 3) {
					this.unflag(x, z, 0x4000);
					this.unflag(x, z - 1, 0x400);
				}
			}
			if (shape == 1 || shape == 3) {
				if (angle == 0) {
					this.unflag(x, z, 0x200);
					this.unflag(x - 1, z + 1, 0x2000);
				}
				if (angle == 1) {
					this.unflag(x, z, 0x800);
					this.unflag(x + 1, z + 1, 0x8000);
				}
				if (angle == 2) {
					this.unflag(x, z, 0x2000);
					this.unflag(x + 1, z - 1, 0x200);
				}
				if (angle == 3) {
					this.unflag(x, z, 0x8000);
					this.unflag(x - 1, z - 1, 0x800);
				}
			}
			if (shape == 2) {
				if (angle == 0) {
					this.unflag(x, z, 0x10400);
					this.unflag(x - 1, z, 0x1000);
					this.unflag(x, z + 1, 0x4000);
				}
				if (angle == 1) {
					this.unflag(x, z, 0x1400);
					this.unflag(x, z + 1, 0x4000);
					this.unflag(x + 1, z, 0x10000);
				}
				if (angle == 2) {
					this.unflag(x, z, 0x5000);
					this.unflag(x + 1, z, 0x10000);
					this.unflag(x, z - 1, 0x400);
				}
				if (angle == 3) {
					this.unflag(x, z, 0x14000);
					this.unflag(x, z - 1, 0x400);
					this.unflag(x - 1, z, 0x1000);
				}
			}
		}
		if (!blockRoutes) {
			return;
		}
		if (shape == 0) {
			if (angle == 0) {
				this.unflag(x, z, 0x20000000);
				this.unflag(x - 1, z, 0x2000000);
			}
			if (angle == 1) {
				this.unflag(x, z, 0x800000);
				this.unflag(x, z + 1, 0x8000000);
			}
			if (angle == 2) {
				this.unflag(x, z, 0x2000000);
				this.unflag(x + 1, z, 0x20000000);
			}
			if (angle == 3) {
				this.unflag(x, z, 0x8000000);
				this.unflag(x, z - 1, 0x800000);
			}
		}
		if (shape == 1 || shape == 3) {
			if (angle == 0) {
				this.unflag(x, z, 0x400000);
				this.unflag(x - 1, z + 1, 0x4000000);
			}
			if (angle == 1) {
				this.unflag(x, z, 0x1000000);
				this.unflag(x + 1, z + 1, 0x10000000);
			}
			if (angle == 2) {
				this.unflag(x, z, 0x4000000);
				this.unflag(x + 1, z - 1, 0x400000);
			}
			if (angle == 3) {
				this.unflag(x, z, 0x10000000);
				this.unflag(x - 1, z - 1, 0x1000000);
			}
		}
		if (shape != 2) {
			return;
		}
		if (angle == 0) {
			this.unflag(x, z, 0x20800000);
			this.unflag(x - 1, z, 0x2000000);
			this.unflag(x, z + 1, 0x8000000);
		}
		if (angle == 1) {
			this.unflag(x, z, 0x2800000);
			this.unflag(x, z + 1, 0x8000000);
			this.unflag(x + 1, z, 0x20000000);
		}
		if (angle == 2) {
			this.unflag(x, z, 0xA000000);
			this.unflag(x + 1, z, 0x20000000);
			this.unflag(x, z - 1, 0x800000);
		}
		if (angle == 3) {
			this.unflag(x, z, 0x28000000);
			this.unflag(x, z - 1, 0x800000);
			this.unflag(x - 1, z, 0x2000000);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean isInsideOrOutsideRect(@OriginalArg(8) int x, @OriginalArg(0) int z, @OriginalArg(3) int size, @OriginalArg(5) int destX, @OriginalArg(4) int destZ, @OriginalArg(7) int destWidth, @OriginalArg(6) int destLength, @OriginalArg(2) int destBlockedSides) {
		if (size <= 1) {
			@Pc(39) int destZ1 = destZ + destLength - 1;
			@Pc(45) int destX1 = destX + destWidth - 1;
			if (x >= destX && destX1 >= x && destZ <= z && z <= destZ1) {
				return true;
			} else if (destX - 1 == x && destZ <= z && z <= destZ1 && (this.flags[x - this.xOffset][z - this.zOffset] & 0x8) == 0 && (destBlockedSides & 0x8) == 0) {
				return true;
			} else if (x == destX1 + 1 && z >= destZ && z <= destZ1 && (this.flags[x - this.xOffset][z - this.zOffset] & 0x80) == 0 && (destBlockedSides & 0x2) == 0) {
				return true;
			} else if (destZ - 1 == z && destX <= x && x <= destX1 && (this.flags[x - this.xOffset][z - this.zOffset] & 0x2) == 0 && (destBlockedSides & 0x4) == 0) {
				return true;
			} else {
				return z == destZ1 + 1 && x >= destX && x <= destX1 && (this.flags[x - this.xOffset][z - this.zOffset] & 0x20) == 0 && (destBlockedSides & 0x1) == 0;
			}
		} else if (isInsideRect(x, z, size, size, destX, destZ, destWidth, destLength)) {
			return true;
		} else {
			return this.isOutsideRect(x, z, size, size, destX, destZ, destWidth, destLength, destBlockedSides);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZZIII)V")
	public void flagWall(@OriginalArg(4) int x, @OriginalArg(0) int z, @OriginalArg(5) int shape, @OriginalArg(6) int angle, @OriginalArg(2) boolean blockProjectiles, @OriginalArg(3) boolean blockRoutes) {
		z -= this.zOffset;
		x -= this.xOffset;
		if (shape == 0) {
			if (angle == 0) {
				this.flag(x, z, 0x80);
				this.flag(x - 1, z, 0x8);
			}
			if (angle == 1) {
				this.flag(x, z, 0x2);
				this.flag(x, z + 1, 0x20);
			}
			if (angle == 2) {
				this.flag(x, z, 0x8);
				this.flag(x + 1, z, 0x80);
			}
			if (angle == 3) {
				this.flag(x, z, 0x20);
				this.flag(x, z - 1, 0x2);
			}
		}
		if (shape == 1 || shape == 3) {
			if (angle == 0) {
				this.flag(x, z, 0x1);
				this.flag(x - 1, z + 1, 0x10);
			}
			if (angle == 1) {
				this.flag(x, z, 0x4);
				this.flag(x + 1, z + 1, 0x40);
			}
			if (angle == 2) {
				this.flag(x, z, 0x10);
				this.flag(x + 1, z - 1, 0x1);
			}
			if (angle == 3) {
				this.flag(x, z, 0x40);
				this.flag(x - 1, z - 1, 0x4);
			}
		}
		if (shape == 2) {
			if (angle == 0) {
				this.flag(x, z, 0x82);
				this.flag(x - 1, z, 0x8);
				this.flag(x, z + 1, 0x20);
			}
			if (angle == 1) {
				this.flag(x, z, 0xA);
				this.flag(x, z + 1, 0x20);
				this.flag(x + 1, z, 0x80);
			}
			if (angle == 2) {
				this.flag(x, z, 0x28);
				this.flag(x + 1, z, 0x80);
				this.flag(x, z - 1, 0x2);
			}
			if (angle == 3) {
				this.flag(x, z, 0xA0);
				this.flag(x, z - 1, 0x2);
				this.flag(x - 1, z, 0x8);
			}
		}
		if (blockProjectiles) {
			if (shape == 0) {
				if (angle == 0) {
					this.flag(x, z, 0x10000);
					this.flag(x - 1, z, 0x1000);
				}
				if (angle == 1) {
					this.flag(x, z, 0x400);
					this.flag(x, z + 1, 0x4000);
				}
				if (angle == 2) {
					this.flag(x, z, 0x1000);
					this.flag(x + 1, z, 0x10000);
				}
				if (angle == 3) {
					this.flag(x, z, 0x4000);
					this.flag(x, z - 1, 0x400);
				}
			}
			if (shape == 1 || shape == 3) {
				if (angle == 0) {
					this.flag(x, z, 0x200);
					this.flag(x - 1, z + 1, 0x2000);
				}
				if (angle == 1) {
					this.flag(x, z, 0x800);
					this.flag(x + 1, z + 1, 0x8000);
				}
				if (angle == 2) {
					this.flag(x, z, 0x2000);
					this.flag(x + 1, z - 1, 0x200);
				}
				if (angle == 3) {
					this.flag(x, z, 0x8000);
					this.flag(x - 1, z - 1, 0x800);
				}
			}
			if (shape == 2) {
				if (angle == 0) {
					this.flag(x, z, 0x10400);
					this.flag(x - 1, z, 0x1000);
					this.flag(x, z + 1, 0x4000);
				}
				if (angle == 1) {
					this.flag(x, z, 0x1400);
					this.flag(x, z + 1, 0x4000);
					this.flag(x + 1, z, 0x10000);
				}
				if (angle == 2) {
					this.flag(x, z, 0x5000);
					this.flag(x + 1, z, 0x10000);
					this.flag(x, z - 1, 0x400);
				}
				if (angle == 3) {
					this.flag(x, z, 0x14000);
					this.flag(x, z - 1, 0x400);
					this.flag(x - 1, z, 0x1000);
				}
			}
		}
		if (!blockRoutes) {
			return;
		}
		if (shape == 0) {
			if (angle == 0) {
				this.flag(x, z, 0x20000000);
				this.flag(x - 1, z, 0x2000000);
			}
			if (angle == 1) {
				this.flag(x, z, 0x800000);
				this.flag(x, z + 1, 0x8000000);
			}
			if (angle == 2) {
				this.flag(x, z, 0x2000000);
				this.flag(x + 1, z, 0x20000000);
			}
			if (angle == 3) {
				this.flag(x, z, 0x8000000);
				this.flag(x, z - 1, 0x800000);
			}
		}
		if (shape == 1 || shape == 3) {
			if (angle == 0) {
				this.flag(x, z, 0x400000);
				this.flag(x - 1, z + 1, 0x4000000);
			}
			if (angle == 1) {
				this.flag(x, z, 0x1000000);
				this.flag(x + 1, z + 1, 0x10000000);
			}
			if (angle == 2) {
				this.flag(x, z, 0x4000000);
				this.flag(x + 1, z - 1, 0x400000);
			}
			if (angle == 3) {
				this.flag(x, z, 0x10000000);
				this.flag(x - 1, z - 1, 0x1000000);
			}
		}
		if (shape != 2) {
			return;
		}
		if (angle == 0) {
			this.flag(x, z, 0x20800000);
			this.flag(x - 1, z, 0x2000000);
			this.flag(x, z + 1, 0x8000000);
		}
		if (angle == 1) {
			this.flag(x, z, 0x2800000);
			this.flag(x, z + 1, 0x8000000);
			this.flag(x + 1, z, 0x20000000);
		}
		if (angle == 2) {
			this.flag(x, z, 0xA000000);
			this.flag(x + 1, z, 0x20000000);
			this.flag(x, z - 1, 0x800000);
		}
		if (angle == 3) {
			this.flag(x, z, 0x28000000);
			this.flag(x, z - 1, 0x800000);
			this.flag(x - 1, z, 0x2000000);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIBIII)Z")
	public boolean isAtWall(@OriginalArg(3) int x, @OriginalArg(2) int z, @OriginalArg(6) int size, @OriginalArg(5) int destX, @OriginalArg(0) int destZ, @OriginalArg(7) int destType, @OriginalArg(1) int destAngle) {
		if (size == 1) {
			if (destX == x && destZ == z) {
				return true;
			}
		} else if (x <= destX && destX <= x + size - 1 && destZ >= destZ && destZ <= size + destZ - 1) {
			return true;
		}
		destZ -= this.zOffset;
		destX -= this.xOffset;
		z -= this.zOffset;
		x -= this.xOffset;
		if (size == 1) {
			if (destType == 0) {
				if (destAngle == 0) {
					if (x == destX - 1 && z == destZ) {
						return true;
					}
					if (destX == x && z == destZ + 1 && (this.flags[x][z] & 0x2C0120) == 0) {
						return true;
					}
					if (destX == x && z == destZ - 1 && (this.flags[x][z] & 0x2C0102) == 0) {
						return true;
					}
				} else if (destAngle == 1) {
					if (destX == x && z == destZ + 1) {
						return true;
					}
					if (x == destX - 1 && destZ == z && (this.flags[x][z] & 0x2C0108) == 0) {
						return true;
					}
					if (x == destX + 1 && destZ == z && (this.flags[x][z] & 0x2C0180) == 0) {
						return true;
					}
				} else if (destAngle == 2) {
					if (x == destX + 1 && z == destZ) {
						return true;
					}
					if (destX == x && z == destZ + 1 && (this.flags[x][z] & 0x2C0120) == 0) {
						return true;
					}
					if (destX == x && destZ - 1 == z && (this.flags[x][z] & 0x2C0102) == 0) {
						return true;
					}
				} else if (destAngle == 3) {
					if (destX == x && destZ - 1 == z) {
						return true;
					}
					if (x == destX - 1 && destZ == z && (this.flags[x][z] & 0x2C0108) == 0) {
						return true;
					}
					if (destX + 1 == x && destZ == z && (this.flags[x][z] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (destType == 2) {
				if (destAngle == 0) {
					if (x == destX - 1 && destZ == z) {
						return true;
					}
					if (x == destX && z == destZ + 1) {
						return true;
					}
					if (x == destX + 1 && destZ == z && (this.flags[x][z] & 0x2C0180) == 0) {
						return true;
					}
					if (x == destX && z == destZ - 1 && (this.flags[x][z] & 0x2C0102) == 0) {
						return true;
					}
				} else if (destAngle == 1) {
					if (destX - 1 == x && destZ == z && (this.flags[x][z] & 0x2C0108) == 0) {
						return true;
					}
					if (x == destX && z == destZ + 1) {
						return true;
					}
					if (destX + 1 == x && destZ == z) {
						return true;
					}
					if (destX == x && destZ - 1 == z && (this.flags[x][z] & 0x2C0102) == 0) {
						return true;
					}
				} else if (destAngle == 2) {
					if (destX - 1 == x && destZ == z && (this.flags[x][z] & 0x2C0108) == 0) {
						return true;
					}
					if (x == destX && destZ + 1 == z && (this.flags[x][z] & 0x2C0120) == 0) {
						return true;
					}
					if (destX + 1 == x && destZ == z) {
						return true;
					}
					if (destX == x && z == destZ - 1) {
						return true;
					}
				} else if (destAngle == 3) {
					if (destX - 1 == x && destZ == z) {
						return true;
					}
					if (destX == x && z == destZ + 1 && (this.flags[x][z] & 0x2C0120) == 0) {
						return true;
					}
					if (x == destX + 1 && z == destZ && (this.flags[x][z] & 0x2C0180) == 0) {
						return true;
					}
					if (x == destX && z == destZ - 1) {
						return true;
					}
				}
			}
			if (destType == 9) {
				if (x == destX && destZ + 1 == z && (this.flags[x][z] & 0x20) == 0) {
					return true;
				}
				if (destX == x && destZ - 1 == z && (this.flags[x][z] & 0x2) == 0) {
					return true;
				}
				if (destX - 1 == x && z == destZ && (this.flags[x][z] & 0x8) == 0) {
					return true;
				}
				if (x == destX + 1 && z == destZ && (this.flags[x][z] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(89) int x1 = x + size - 1;
			@Pc(95) int z1 = size + z - 1;
			if (destType == 0) {
				if (destAngle == 0) {
					if (destX - size == x && z <= destZ && z1 >= destZ) {
						return true;
					}
					if (destX >= x && destX <= x1 && destZ + 1 == z && (this.flags[destX][z] & 0x2C0120) == 0) {
						return true;
					}
					if (destX >= x && destX <= x1 && destZ - size == z && (this.flags[destX][z1] & 0x2C0102) == 0) {
						return true;
					}
				} else if (destAngle == 1) {
					if (x <= destX && destX <= x1 && destZ + 1 == z) {
						return true;
					}
					if (destX - size == x && z <= destZ && destZ <= z1 && (this.flags[x1][destZ] & 0x2C0108) == 0) {
						return true;
					}
					if (destX + 1 == x && z <= destZ && destZ <= z1 && (this.flags[x][destZ] & 0x2C0180) == 0) {
						return true;
					}
				} else if (destAngle == 2) {
					if (x == destX + 1 && z <= destZ && z1 >= destZ) {
						return true;
					}
					if (destX >= x && destX <= x1 && z == destZ + 1 && (this.flags[destX][z] & 0x2C0120) == 0) {
						return true;
					}
					if (destX >= x && destX <= x1 && z == destZ - size && (this.flags[destX][z1] & 0x2C0102) == 0) {
						return true;
					}
				} else if (destAngle == 3) {
					if (x <= destX && x1 >= destX && z == destZ - size) {
						return true;
					}
					if (x == destX - size && z <= destZ && z1 >= destZ && (this.flags[x1][destZ] & 0x2C0108) == 0) {
						return true;
					}
					if (destX + 1 == x && z <= destZ && z1 >= destZ && (this.flags[x][destZ] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (destType == 2) {
				if (destAngle == 0) {
					if (destX - size == x && destZ >= z && z1 >= destZ) {
						return true;
					}
					if (destX >= x && x1 >= destX && destZ + 1 == z) {
						return true;
					}
					if (x == destX + 1 && destZ >= z && z1 >= destZ && (this.flags[x][destZ] & 0x2C0180) == 0) {
						return true;
					}
					if (x <= destX && x1 >= destX && z == destZ - size && (this.flags[destX][z1] & 0x2C0102) == 0) {
						return true;
					}
				} else if (destAngle == 1) {
					if (x == destX - size && destZ >= z && destZ <= z1 && (this.flags[x1][destZ] & 0x2C0108) == 0) {
						return true;
					}
					if (x <= destX && destX <= x1 && destZ + 1 == z) {
						return true;
					}
					if (x == destX + 1 && z <= destZ && destZ <= z1) {
						return true;
					}
					if (x <= destX && x1 >= destX && z == destZ - size && (this.flags[destX][z1] & 0x2C0102) == 0) {
						return true;
					}
				} else if (destAngle == 2) {
					if (x == destX - size && z <= destZ && z1 >= destZ && (this.flags[x1][destZ] & 0x2C0108) == 0) {
						return true;
					}
					if (x <= destX && destX <= x1 && destZ + 1 == z && (this.flags[destX][z] & 0x2C0120) == 0) {
						return true;
					}
					if (x == destX + 1 && destZ >= z && z1 >= destZ) {
						return true;
					}
					if (destX >= x && x1 >= destX && z == destZ - size) {
						return true;
					}
				} else if (destAngle == 3) {
					if (x == destX - size && destZ >= z && destZ <= z1) {
						return true;
					}
					if (destX >= x && destX <= x1 && destZ + 1 == z && (this.flags[destX][z] & 0x2C0120) == 0) {
						return true;
					}
					if (destX + 1 == x && z <= destZ && destZ <= z1 && (this.flags[x][destZ] & 0x2C0180) == 0) {
						return true;
					}
					if (destX >= x && x1 >= destX && z == destZ - size) {
						return true;
					}
				}
			}
			if (destType == 9) {
				if (destX >= x && x1 >= destX && destZ + 1 == z && (this.flags[destX][z] & 0x2C0120) == 0) {
					return true;
				}
				if (x <= destX && x1 >= destX && destZ - size == z && (this.flags[destX][z1] & 0x2C0102) == 0) {
					return true;
				}
				if (destX - size == x && destZ >= z && destZ <= z1 && (this.flags[x1][destZ] & 0x2C0108) == 0) {
					return true;
				}
				if (destX + 1 == x && destZ >= z && destZ <= z1 && (this.flags[x][destZ] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)Z")
	public boolean method575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 == arg3 && arg1 == arg0) {
			return true;
		}
		arg0 -= this.zOffset;
		arg2 -= this.xOffset;
		if (arg2 < 0 || this.width <= arg2 || arg0 < 0 || this.length <= arg0) {
			return false;
		}
		@Pc(54) int local54 = arg3 - this.xOffset;
		@Pc(59) int local59 = arg1 - this.zOffset;
		if (local54 < 0 || local54 >= this.width || local59 < 0 || this.length <= local59) {
			return false;
		}
		@Pc(99) int local99;
		if (arg0 > local59) {
			local99 = arg0 - local59;
		} else {
			local99 = local59 - arg0;
		}
		@Pc(118) int local118;
		if (arg2 <= local54) {
			local118 = local54 - arg2;
		} else {
			local118 = arg2 - local54;
		}
		if (local118 > local99) {
			@Pc(134) int local134 = 32768;
			@Pc(140) int local140 = local99 * 65536 / local118;
			while (arg2 != local54) {
				if (arg2 > local54) {
					if ((this.flags[local54][local59] & 0x2C0108) != 0) {
						return false;
					}
					local54++;
				} else if (local54 > arg2) {
					if ((this.flags[local54][local59] & 0x2C0180) != 0) {
						return false;
					}
					local54--;
				}
				local134 += local140;
				if (local134 >= 65536) {
					local134 -= 65536;
					if (arg0 > local59) {
						if ((this.flags[local54][local59] & 0x2C0102) != 0) {
							return false;
						}
						local59++;
					} else if (local59 > arg0) {
						if ((this.flags[local54][local59] & 0x2C0120) != 0) {
							return false;
						}
						local59--;
					}
				}
			}
		} else {
			@Pc(244) int local244 = local118 * 65536 / local99;
			@Pc(246) int local246 = 32768;
			while (arg0 != local59) {
				if (arg0 > local59) {
					if ((this.flags[local54][local59] & 0x2C0102) != 0) {
						return false;
					}
					local59++;
				} else if (arg0 < local59) {
					if ((this.flags[local54][local59] & 0x2C0120) != 0) {
						return false;
					}
					local59--;
				}
				local246 += local244;
				if (local246 >= 65536) {
					local246 -= 65536;
					if (arg2 > local54) {
						if ((this.flags[local54][local59] & 0x2C0108) != 0) {
							return false;
						}
						local54++;
					} else if (local54 > arg2) {
						if ((this.flags[local54][local59] & 0x2C0180) != 0) {
							return false;
						}
						local54--;
					}
				}
			}
		}
		return (this.flags[arg2][arg0] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean isAtWallDecor(@OriginalArg(1) int x, @OriginalArg(4) int z, @OriginalArg(7) int size, @OriginalArg(0) int destX, @OriginalArg(2) int destZ, @OriginalArg(5) int destType, @OriginalArg(6) int destAngle) {
		if (size == 1) {
			if (x == destX && destZ == z) {
				return true;
			}
		} else if (x <= destX && destX <= x + size - 1 && destZ <= destZ && size + destZ - 1 >= destZ) {
			return true;
		}
		z -= this.zOffset;
		x -= this.xOffset;
		destX -= this.xOffset;
		destZ -= this.zOffset;
		if (size == 1) {
			if (destType == 6 || destType == 7) {
				if (destType == 7) {
					destAngle = destAngle + 2 & 0x3;
				}
				if (destAngle == 0) {
					if (destX + 1 == x && destZ == z && (this.flags[x][z] & 0x80) == 0) {
						return true;
					}
					if (destX == x && destZ - 1 == z && (this.flags[x][z] & 0x2) == 0) {
						return true;
					}
				} else if (destAngle == 1) {
					if (destX - 1 == x && z == destZ && (this.flags[x][z] & 0x8) == 0) {
						return true;
					}
					if (x == destX && z == destZ - 1 && (this.flags[x][z] & 0x2) == 0) {
						return true;
					}
				} else if (destAngle == 2) {
					if (destX - 1 == x && destZ == z && (this.flags[x][z] & 0x8) == 0) {
						return true;
					}
					if (destX == x && z == destZ + 1 && (this.flags[x][z] & 0x20) == 0) {
						return true;
					}
				} else if (destAngle == 3) {
					if (destX + 1 == x && destZ == z && (this.flags[x][z] & 0x80) == 0) {
						return true;
					}
					if (x == destX && z == destZ + 1 && (this.flags[x][z] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (destType == 8) {
				if (destX == x && z == destZ + 1 && (this.flags[x][z] & 0x20) == 0) {
					return true;
				}
				if (x == destX && destZ - 1 == z && (this.flags[x][z] & 0x2) == 0) {
					return true;
				}
				if (destX - 1 == x && destZ == z && (this.flags[x][z] & 0x8) == 0) {
					return true;
				}
				if (x == destX + 1 && z == destZ && (this.flags[x][z] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(89) int x1 = x + size - 1;
			@Pc(95) int z1 = z + size - 1;
			if (destType == 6 || destType == 7) {
				if (destType == 7) {
					destAngle = destAngle + 2 & 0x3;
				}
				if (destAngle == 0) {
					if (x == destX + 1 && destZ >= z && destZ <= z1 && (this.flags[x][destZ] & 0x80) == 0) {
						return true;
					}
					if (destX >= x && x1 >= destX && z == destZ - size && (this.flags[destX][z1] & 0x2) == 0) {
						return true;
					}
				} else if (destAngle == 1) {
					if (x == destX - size && destZ >= z && destZ <= z1 && (this.flags[x1][destZ] & 0x8) == 0) {
						return true;
					}
					if (x <= destX && x1 >= destX && z == destZ - size && (this.flags[destX][z1] & 0x2) == 0) {
						return true;
					}
				} else if (destAngle == 2) {
					if (x == destX - size && z <= destZ && destZ <= z1 && (this.flags[x1][destZ] & 0x8) == 0) {
						return true;
					}
					if (destX >= x && destX <= x1 && z == destZ + 1 && (this.flags[destX][z] & 0x20) == 0) {
						return true;
					}
				} else if (destAngle == 3) {
					if (x == destX + 1 && destZ >= z && z1 >= destZ && (this.flags[x][destZ] & 0x80) == 0) {
						return true;
					}
					if (destX >= x && x1 >= destX && destZ + 1 == z && (this.flags[destX][z] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (destType == 8) {
				if (x <= destX && destX <= x1 && destZ + 1 == z && (this.flags[destX][z] & 0x20) == 0) {
					return true;
				}
				if (x <= destX && destX <= x1 && destZ - size == z && (this.flags[destX][z1] & 0x2) == 0) {
					return true;
				}
				if (destX - size == x && destZ >= z && destZ <= z1 && (this.flags[x1][destZ] & 0x8) == 0) {
					return true;
				}
				if (destX + 1 == x && destZ >= z && z1 >= destZ && (this.flags[x][destZ] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIII)Z")
	private boolean isOutsideRect(@OriginalArg(2) int x, @OriginalArg(6) int z, @OriginalArg(5) int width, @OriginalArg(1) int length, @OriginalArg(7) int destX, @OriginalArg(9) int destZ, @OriginalArg(3) int destWidth, @OriginalArg(0) int destLength, @OriginalArg(8) int destBlockedSides) {
		@Pc(9) int x1 = width + x;
		@Pc(13) int destX1 = destX + destWidth;
		@Pc(17) int z1 = length + z;
		@Pc(22) int destZ1 = destZ + destLength;
		if (destX1 == x && (destBlockedSides & 0x2) == 0) {
			@Pc(51) int z0 = destZ >= z ? destZ : z;
			@Pc(62) int zMax = z1 >= destZ1 ? destZ1 : z1;
			while (z0 < zMax) {
				if ((this.flags[destX1 - this.xOffset - 1][z0 - this.zOffset] & 0x8) == 0) {
					return true;
				}
				z0++;
			}
		} else if (x1 == destX && (destBlockedSides & 0x8) == 0) {
			@Pc(238) int z0 = z > destZ ? z : destZ;
			@Pc(245) int zMax = z1 >= destZ1 ? destZ1 : z1;
			while (z0 < zMax) {
				if ((this.flags[destX - this.xOffset][z0 - this.zOffset] & 0x80) == 0) {
					return true;
				}
				z0++;
			}
		} else if (destZ1 == z && (destBlockedSides & 0x1) == 0) {
			@Pc(125) int x0 = x > destX ? x : destX;
			@Pc(136) int xMax = x1 >= destX1 ? destX1 : x1;
			while (x0 < xMax) {
				if ((this.flags[x0 - this.xOffset][destZ1 - this.zOffset - 1] & 0x2) == 0) {
					return true;
				}
				x0++;
			}
		} else if (z1 == destZ && (destBlockedSides & 0x4) == 0) {
			@Pc(186) int xMax = destX1 > x1 ? x1 : destX1;
			for (@Pc(197) int x0 = destX >= x ? destX : x; x0 < xMax; x0++) {
				if ((this.flags[x0 - this.xOffset][destZ - this.zOffset] & 0x20) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	public void clear() {
		for (@Pc(11) int x = 0; x < this.width; x++) {
			for (@Pc(21) int z = 0; z < this.length; z++) {
				if (x == 0 || z == 0 || this.width - 5 <= x || z >= this.length - 5) {
					this.flags[x][z] = 0xFFFFFF;
				} else {
					this.flags[x][z] = 0x200000;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIB)V")
	public void flagTile(@OriginalArg(0) int x, @OriginalArg(1) int z) {
		x -= this.xOffset;
		z -= this.zOffset;
		this.flags[x][z] |= 0x200000;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V")
	public void unflagGroundDecor(@OriginalArg(1) int x, @OriginalArg(2) int z) {
		z -= this.zOffset;
		x -= this.xOffset;
		this.flags[x][z] &= -262145;
	}
}

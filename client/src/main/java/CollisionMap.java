import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class CollisionMap {

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
	public final void flagGroundDecor(@OriginalArg(2) int x, @OriginalArg(0) int z) {
		z -= this.zOffset;
		x -= this.xOffset;
		this.flags[x][z] |= 0x40000;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZIIIII)V")
	public final void method567(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int length, @OriginalArg(3) int width, @OriginalArg(4) int z, @OriginalArg(6) int x) {
		z -= this.zOffset;
		@Pc(12) int flags = 256;
		x -= this.xOffset;
		if (arg0) {
			flags = 0x20100;
		}
		if (arg1) {
			flags |= 0x40000000;
		}
		for (@Pc(32) int x0 = x; x0 < x + width; x0++) {
			if (x0 >= 0 && this.width > x0) {
				for (@Pc(54) int z0 = z; z0 < z + length; z0++) {
					if (z0 >= 0 && this.length > z0) {
						this.flag(x0, z0, flags);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIZIIZ)V")
	public final void method568(@OriginalArg(0) int angle, @OriginalArg(1) int z, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int x, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		z -= this.zOffset;
		if (angle == 1 || angle == 3) {
			@Pc(23) int local23 = arg5;
			arg5 = arg2;
			arg2 = local23;
		}
		x -= this.xOffset;
		@Pc(34) int flags = 0x100;
		if (arg3) {
			flags = 0x20100;
		}
		if (arg6) {
			flags |= 0x40000000;
		}
		for (@Pc(49) int x0 = x; x0 < x + arg5; x0++) {
			if (x0 >= 0 && this.width > x0) {
				for (@Pc(70) int z0 = z; z0 < arg2 + z; z0++) {
					if (z0 >= 0 && this.length > z0) {
						this.unflag(x0, z0, flags);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIIZII)V")
	public final void unflagWall(@OriginalArg(0) int angle, @OriginalArg(1) boolean arg1, @OriginalArg(2) int x, @OriginalArg(3) int shape, @OriginalArg(4) boolean arg4, @OriginalArg(6) int z) {
		x -= this.xOffset;
		z -= this.zOffset;
		if (shape == 0) {
			if (angle == 0) {
				this.unflag(x, z, 128);
				this.unflag(x - 1, z, 8);
			}
			if (angle == 1) {
				this.unflag(x, z, 2);
				this.unflag(x, z + 1, 32);
			}
			if (angle == 2) {
				this.unflag(x, z, 8);
				this.unflag(x + 1, z, 128);
			}
			if (angle == 3) {
				this.unflag(x, z, 32);
				this.unflag(x, z - 1, 2);
			}
		}
		if (shape == 1 || shape == 3) {
			if (angle == 0) {
				this.unflag(x, z, 1);
				this.unflag(x - 1, z + 1, 16);
			}
			if (angle == 1) {
				this.unflag(x, z, 4);
				this.unflag(x + 1, z + 1, 64);
			}
			if (angle == 2) {
				this.unflag(x, z, 16);
				this.unflag(x + 1, z - 1, 1);
			}
			if (angle == 3) {
				this.unflag(x, z, 64);
				this.unflag(x - 1, z - 1, 4);
			}
		}
		if (shape == 2) {
			if (angle == 0) {
				this.unflag(x, z, 130);
				this.unflag(x - 1, z, 8);
				this.unflag(x, z + 1, 32);
			}
			if (angle == 1) {
				this.unflag(x, z, 10);
				this.unflag(x, z + 1, 32);
				this.unflag(x + 1, z, 128);
			}
			if (angle == 2) {
				this.unflag(x, z, 40);
				this.unflag(x + 1, z, 128);
				this.unflag(x, z - 1, 2);
			}
			if (angle == 3) {
				this.unflag(x, z, 160);
				this.unflag(x, z - 1, 2);
				this.unflag(x - 1, z, 8);
			}
		}
		if (arg4) {
			if (shape == 0) {
				if (angle == 0) {
					this.unflag(x, z, 65536);
					this.unflag(x - 1, z, 4096);
				}
				if (angle == 1) {
					this.unflag(x, z, 1024);
					this.unflag(x, z + 1, 16384);
				}
				if (angle == 2) {
					this.unflag(x, z, 4096);
					this.unflag(x + 1, z, 65536);
				}
				if (angle == 3) {
					this.unflag(x, z, 16384);
					this.unflag(x, z - 1, 1024);
				}
			}
			if (shape == 1 || shape == 3) {
				if (angle == 0) {
					this.unflag(x, z, 512);
					this.unflag(x - 1, z + 1, 8192);
				}
				if (angle == 1) {
					this.unflag(x, z, 2048);
					this.unflag(x + 1, z + 1, 32768);
				}
				if (angle == 2) {
					this.unflag(x, z, 8192);
					this.unflag(x + 1, z - 1, 512);
				}
				if (angle == 3) {
					this.unflag(x, z, 32768);
					this.unflag(x - 1, z - 1, 2048);
				}
			}
			if (shape == 2) {
				if (angle == 0) {
					this.unflag(x, z, 66560);
					this.unflag(x - 1, z, 4096);
					this.unflag(x, z + 1, 16384);
				}
				if (angle == 1) {
					this.unflag(x, z, 5120);
					this.unflag(x, z + 1, 16384);
					this.unflag(x + 1, z, 65536);
				}
				if (angle == 2) {
					this.unflag(x, z, 20480);
					this.unflag(x + 1, z, 65536);
					this.unflag(x, z - 1, 1024);
				}
				if (angle == 3) {
					this.unflag(x, z, 81920);
					this.unflag(x, z - 1, 1024);
					this.unflag(x - 1, z, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (shape == 0) {
			if (angle == 0) {
				this.unflag(x, z, 536870912);
				this.unflag(x - 1, z, 33554432);
			}
			if (angle == 1) {
				this.unflag(x, z, 8388608);
				this.unflag(x, z + 1, 134217728);
			}
			if (angle == 2) {
				this.unflag(x, z, 33554432);
				this.unflag(x + 1, z, 536870912);
			}
			if (angle == 3) {
				this.unflag(x, z, 134217728);
				this.unflag(x, z - 1, 8388608);
			}
		}
		if (shape == 1 || shape == 3) {
			if (angle == 0) {
				this.unflag(x, z, 4194304);
				this.unflag(x - 1, z + 1, 67108864);
			}
			if (angle == 1) {
				this.unflag(x, z, 16777216);
				this.unflag(x + 1, z + 1, 268435456);
			}
			if (angle == 2) {
				this.unflag(x, z, 67108864);
				this.unflag(x + 1, z - 1, 4194304);
			}
			if (angle == 3) {
				this.unflag(x, z, 268435456);
				this.unflag(x - 1, z - 1, 16777216);
			}
		}
		if (shape != 2) {
			return;
		}
		if (angle == 0) {
			this.unflag(x, z, 545259520);
			this.unflag(x - 1, z, 33554432);
			this.unflag(x, z + 1, 134217728);
		}
		if (angle == 1) {
			this.unflag(x, z, 41943040);
			this.unflag(x, z + 1, 134217728);
			this.unflag(x + 1, z, 536870912);
		}
		if (angle == 2) {
			this.unflag(x, z, 167772160);
			this.unflag(x + 1, z, 536870912);
			this.unflag(x, z - 1, 8388608);
		}
		if (angle == 3) {
			this.unflag(x, z, 671088640);
			this.unflag(x, z - 1, 8388608);
			this.unflag(x - 1, z, 33554432);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIII)Z")
	public final boolean method570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 <= 1) {
			@Pc(39) int local39 = arg3 + arg5 - 1;
			@Pc(45) int local45 = arg4 + arg6 - 1;
			if (arg7 >= arg4 && local45 >= arg7 && arg3 <= arg0 && arg0 <= local39) {
				return true;
			} else if (arg4 - 1 == arg7 && arg3 <= arg0 && arg0 <= local39 && (this.flags[arg7 - this.xOffset][arg0 - this.zOffset] & 0x8) == 0 && (arg1 & 0x8) == 0) {
				return true;
			} else if (arg7 == local45 + 1 && arg0 >= arg3 && arg0 <= local39 && (this.flags[arg7 - this.xOffset][arg0 - this.zOffset] & 0x80) == 0 && (arg1 & 0x2) == 0) {
				return true;
			} else if (arg3 - 1 == arg0 && arg4 <= arg7 && arg7 <= local45 && (this.flags[arg7 - this.xOffset][arg0 - this.zOffset] & 0x2) == 0 && (arg1 & 0x4) == 0) {
				return true;
			} else {
				return arg0 == local39 + 1 && arg7 >= arg4 && arg7 <= local45 && (this.flags[arg7 - this.xOffset][arg0 - this.zOffset] & 0x20) == 0 && (arg1 & 0x1) == 0;
			}
		} else if (Static36.method4440(arg0, arg4, arg5, arg2, arg3, arg6, arg7, arg2)) {
			return true;
		} else {
			return this.method578(arg5, arg2, arg7, arg6, arg2, arg0, arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZZIII)V")
	public final void flagWall(@OriginalArg(0) int z, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int x, @OriginalArg(5) int shape, @OriginalArg(6) int angle) {
		z -= this.zOffset;
		x -= this.xOffset;
		if (shape == 0) {
			if (angle == 0) {
				this.flag(x, z, 128);
				this.flag(x - 1, z, 8);
			}
			if (angle == 1) {
				this.flag(x, z, 2);
				this.flag(x, z + 1, 32);
			}
			if (angle == 2) {
				this.flag(x, z, 8);
				this.flag(x + 1, z, 128);
			}
			if (angle == 3) {
				this.flag(x, z, 32);
				this.flag(x, z - 1, 2);
			}
		}
		if (shape == 1 || shape == 3) {
			if (angle == 0) {
				this.flag(x, z, 1);
				this.flag(x - 1, z + 1, 16);
			}
			if (angle == 1) {
				this.flag(x, z, 4);
				this.flag(x + 1, z + 1, 64);
			}
			if (angle == 2) {
				this.flag(x, z, 16);
				this.flag(x + 1, z - 1, 1);
			}
			if (angle == 3) {
				this.flag(x, z, 64);
				this.flag(x - 1, z - 1, 4);
			}
		}
		if (shape == 2) {
			if (angle == 0) {
				this.flag(x, z, 130);
				this.flag(x - 1, z, 8);
				this.flag(x, z + 1, 32);
			}
			if (angle == 1) {
				this.flag(x, z, 10);
				this.flag(x, z + 1, 32);
				this.flag(x + 1, z, 128);
			}
			if (angle == 2) {
				this.flag(x, z, 40);
				this.flag(x + 1, z, 128);
				this.flag(x, z - 1, 2);
			}
			if (angle == 3) {
				this.flag(x, z, 160);
				this.flag(x, z - 1, 2);
				this.flag(x - 1, z, 8);
			}
		}
		if (arg1) {
			if (shape == 0) {
				if (angle == 0) {
					this.flag(x, z, 65536);
					this.flag(x - 1, z, 4096);
				}
				if (angle == 1) {
					this.flag(x, z, 1024);
					this.flag(x, z + 1, 16384);
				}
				if (angle == 2) {
					this.flag(x, z, 4096);
					this.flag(x + 1, z, 65536);
				}
				if (angle == 3) {
					this.flag(x, z, 16384);
					this.flag(x, z - 1, 1024);
				}
			}
			if (shape == 1 || shape == 3) {
				if (angle == 0) {
					this.flag(x, z, 512);
					this.flag(x - 1, z + 1, 8192);
				}
				if (angle == 1) {
					this.flag(x, z, 2048);
					this.flag(x + 1, z + 1, 32768);
				}
				if (angle == 2) {
					this.flag(x, z, 8192);
					this.flag(x + 1, z - 1, 512);
				}
				if (angle == 3) {
					this.flag(x, z, 32768);
					this.flag(x - 1, z - 1, 2048);
				}
			}
			if (shape == 2) {
				if (angle == 0) {
					this.flag(x, z, 66560);
					this.flag(x - 1, z, 4096);
					this.flag(x, z + 1, 16384);
				}
				if (angle == 1) {
					this.flag(x, z, 5120);
					this.flag(x, z + 1, 16384);
					this.flag(x + 1, z, 65536);
				}
				if (angle == 2) {
					this.flag(x, z, 20480);
					this.flag(x + 1, z, 65536);
					this.flag(x, z - 1, 1024);
				}
				if (angle == 3) {
					this.flag(x, z, 81920);
					this.flag(x, z - 1, 1024);
					this.flag(x - 1, z, 4096);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (shape == 0) {
			if (angle == 0) {
				this.flag(x, z, 536870912);
				this.flag(x - 1, z, 33554432);
			}
			if (angle == 1) {
				this.flag(x, z, 8388608);
				this.flag(x, z + 1, 134217728);
			}
			if (angle == 2) {
				this.flag(x, z, 33554432);
				this.flag(x + 1, z, 536870912);
			}
			if (angle == 3) {
				this.flag(x, z, 134217728);
				this.flag(x, z - 1, 8388608);
			}
		}
		if (shape == 1 || shape == 3) {
			if (angle == 0) {
				this.flag(x, z, 4194304);
				this.flag(x - 1, z + 1, 67108864);
			}
			if (angle == 1) {
				this.flag(x, z, 16777216);
				this.flag(x + 1, z + 1, 268435456);
			}
			if (angle == 2) {
				this.flag(x, z, 67108864);
				this.flag(x + 1, z - 1, 4194304);
			}
			if (angle == 3) {
				this.flag(x, z, 268435456);
				this.flag(x - 1, z - 1, 16777216);
			}
		}
		if (shape != 2) {
			return;
		}
		if (angle == 0) {
			this.flag(x, z, 545259520);
			this.flag(x - 1, z, 33554432);
			this.flag(x, z + 1, 134217728);
		}
		if (angle == 1) {
			this.flag(x, z, 41943040);
			this.flag(x, z + 1, 134217728);
			this.flag(x + 1, z, 536870912);
		}
		if (angle == 2) {
			this.flag(x, z, 167772160);
			this.flag(x + 1, z, 536870912);
			this.flag(x, z - 1, 8388608);
		}
		if (angle == 3) {
			this.flag(x, z, 671088640);
			this.flag(x, z - 1, 8388608);
			this.flag(x - 1, z, 33554432);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIBIII)Z")
	public final boolean method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg4 == arg3 && arg0 == arg2) {
				return true;
			}
		} else if (arg3 <= arg4 && arg4 <= arg3 + arg5 - 1 && arg0 >= arg0 && arg0 <= arg5 + arg0 - 1) {
			return true;
		}
		arg0 -= this.zOffset;
		arg4 -= this.xOffset;
		arg2 -= this.zOffset;
		arg3 -= this.xOffset;
		if (arg5 == 1) {
			if (arg6 == 0) {
				if (arg1 == 0) {
					if (arg3 == arg4 - 1 && arg2 == arg0) {
						return true;
					}
					if (arg4 == arg3 && arg2 == arg0 + 1 && (this.flags[arg3][arg2] & 0x2C0120) == 0) {
						return true;
					}
					if (arg4 == arg3 && arg2 == arg0 - 1 && (this.flags[arg3][arg2] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (arg4 == arg3 && arg2 == arg0 + 1) {
						return true;
					}
					if (arg3 == arg4 - 1 && arg0 == arg2 && (this.flags[arg3][arg2] & 0x2C0108) == 0) {
						return true;
					}
					if (arg3 == arg4 + 1 && arg0 == arg2 && (this.flags[arg3][arg2] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (arg3 == arg4 + 1 && arg2 == arg0) {
						return true;
					}
					if (arg4 == arg3 && arg2 == arg0 + 1 && (this.flags[arg3][arg2] & 0x2C0120) == 0) {
						return true;
					}
					if (arg4 == arg3 && arg0 - 1 == arg2 && (this.flags[arg3][arg2] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (arg4 == arg3 && arg0 - 1 == arg2) {
						return true;
					}
					if (arg3 == arg4 - 1 && arg0 == arg2 && (this.flags[arg3][arg2] & 0x2C0108) == 0) {
						return true;
					}
					if (arg4 + 1 == arg3 && arg0 == arg2 && (this.flags[arg3][arg2] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg1 == 0) {
					if (arg3 == arg4 - 1 && arg0 == arg2) {
						return true;
					}
					if (arg3 == arg4 && arg2 == arg0 + 1) {
						return true;
					}
					if (arg3 == arg4 + 1 && arg0 == arg2 && (this.flags[arg3][arg2] & 0x2C0180) == 0) {
						return true;
					}
					if (arg3 == arg4 && arg2 == arg0 - 1 && (this.flags[arg3][arg2] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (arg4 - 1 == arg3 && arg0 == arg2 && (this.flags[arg3][arg2] & 0x2C0108) == 0) {
						return true;
					}
					if (arg3 == arg4 && arg2 == arg0 + 1) {
						return true;
					}
					if (arg4 + 1 == arg3 && arg0 == arg2) {
						return true;
					}
					if (arg4 == arg3 && arg0 - 1 == arg2 && (this.flags[arg3][arg2] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (arg4 - 1 == arg3 && arg0 == arg2 && (this.flags[arg3][arg2] & 0x2C0108) == 0) {
						return true;
					}
					if (arg3 == arg4 && arg0 + 1 == arg2 && (this.flags[arg3][arg2] & 0x2C0120) == 0) {
						return true;
					}
					if (arg4 + 1 == arg3 && arg0 == arg2) {
						return true;
					}
					if (arg4 == arg3 && arg2 == arg0 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (arg4 - 1 == arg3 && arg0 == arg2) {
						return true;
					}
					if (arg4 == arg3 && arg2 == arg0 + 1 && (this.flags[arg3][arg2] & 0x2C0120) == 0) {
						return true;
					}
					if (arg3 == arg4 + 1 && arg2 == arg0 && (this.flags[arg3][arg2] & 0x2C0180) == 0) {
						return true;
					}
					if (arg3 == arg4 && arg2 == arg0 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (arg3 == arg4 && arg0 + 1 == arg2 && (this.flags[arg3][arg2] & 0x20) == 0) {
					return true;
				}
				if (arg4 == arg3 && arg0 - 1 == arg2 && (this.flags[arg3][arg2] & 0x2) == 0) {
					return true;
				}
				if (arg4 - 1 == arg3 && arg2 == arg0 && (this.flags[arg3][arg2] & 0x8) == 0) {
					return true;
				}
				if (arg3 == arg4 + 1 && arg2 == arg0 && (this.flags[arg3][arg2] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(89) int local89 = arg3 + arg5 - 1;
			@Pc(95) int local95 = arg5 + arg2 - 1;
			if (arg6 == 0) {
				if (arg1 == 0) {
					if (arg4 - arg5 == arg3 && arg2 <= arg0 && local95 >= arg0) {
						return true;
					}
					if (arg4 >= arg3 && arg4 <= local89 && arg0 + 1 == arg2 && (this.flags[arg4][arg2] & 0x2C0120) == 0) {
						return true;
					}
					if (arg4 >= arg3 && arg4 <= local89 && arg0 - arg5 == arg2 && (this.flags[arg4][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (arg3 <= arg4 && arg4 <= local89 && arg0 + 1 == arg2) {
						return true;
					}
					if (arg4 - arg5 == arg3 && arg2 <= arg0 && arg0 <= local95 && (this.flags[local89][arg0] & 0x2C0108) == 0) {
						return true;
					}
					if (arg4 + 1 == arg3 && arg2 <= arg0 && arg0 <= local95 && (this.flags[arg3][arg0] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (arg3 == arg4 + 1 && arg2 <= arg0 && local95 >= arg0) {
						return true;
					}
					if (arg4 >= arg3 && arg4 <= local89 && arg2 == arg0 + 1 && (this.flags[arg4][arg2] & 0x2C0120) == 0) {
						return true;
					}
					if (arg4 >= arg3 && arg4 <= local89 && arg2 == arg0 - arg5 && (this.flags[arg4][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (arg3 <= arg4 && local89 >= arg4 && arg2 == arg0 - arg5) {
						return true;
					}
					if (arg3 == arg4 - arg5 && arg2 <= arg0 && local95 >= arg0 && (this.flags[local89][arg0] & 0x2C0108) == 0) {
						return true;
					}
					if (arg4 + 1 == arg3 && arg2 <= arg0 && local95 >= arg0 && (this.flags[arg3][arg0] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg1 == 0) {
					if (arg4 - arg5 == arg3 && arg0 >= arg2 && local95 >= arg0) {
						return true;
					}
					if (arg4 >= arg3 && local89 >= arg4 && arg0 + 1 == arg2) {
						return true;
					}
					if (arg3 == arg4 + 1 && arg0 >= arg2 && local95 >= arg0 && (this.flags[arg3][arg0] & 0x2C0180) == 0) {
						return true;
					}
					if (arg3 <= arg4 && local89 >= arg4 && arg2 == arg0 - arg5 && (this.flags[arg4][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (arg3 == arg4 - arg5 && arg0 >= arg2 && arg0 <= local95 && (this.flags[local89][arg0] & 0x2C0108) == 0) {
						return true;
					}
					if (arg3 <= arg4 && arg4 <= local89 && arg0 + 1 == arg2) {
						return true;
					}
					if (arg3 == arg4 + 1 && arg2 <= arg0 && arg0 <= local95) {
						return true;
					}
					if (arg3 <= arg4 && local89 >= arg4 && arg2 == arg0 - arg5 && (this.flags[arg4][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (arg3 == arg4 - arg5 && arg2 <= arg0 && local95 >= arg0 && (this.flags[local89][arg0] & 0x2C0108) == 0) {
						return true;
					}
					if (arg3 <= arg4 && arg4 <= local89 && arg0 + 1 == arg2 && (this.flags[arg4][arg2] & 0x2C0120) == 0) {
						return true;
					}
					if (arg3 == arg4 + 1 && arg0 >= arg2 && local95 >= arg0) {
						return true;
					}
					if (arg4 >= arg3 && local89 >= arg4 && arg2 == arg0 - arg5) {
						return true;
					}
				} else if (arg1 == 3) {
					if (arg3 == arg4 - arg5 && arg0 >= arg2 && arg0 <= local95) {
						return true;
					}
					if (arg4 >= arg3 && arg4 <= local89 && arg0 + 1 == arg2 && (this.flags[arg4][arg2] & 0x2C0120) == 0) {
						return true;
					}
					if (arg4 + 1 == arg3 && arg2 <= arg0 && arg0 <= local95 && (this.flags[arg3][arg0] & 0x2C0180) == 0) {
						return true;
					}
					if (arg4 >= arg3 && local89 >= arg4 && arg2 == arg0 - arg5) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (arg4 >= arg3 && local89 >= arg4 && arg0 + 1 == arg2 && (this.flags[arg4][arg2] & 0x2C0120) == 0) {
					return true;
				}
				if (arg3 <= arg4 && local89 >= arg4 && arg0 - arg5 == arg2 && (this.flags[arg4][local95] & 0x2C0102) == 0) {
					return true;
				}
				if (arg4 - arg5 == arg3 && arg0 >= arg2 && arg0 <= local95 && (this.flags[local89][arg0] & 0x2C0108) == 0) {
					return true;
				}
				if (arg4 + 1 == arg3 && arg0 >= arg2 && arg0 <= local95 && (this.flags[arg3][arg0] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)Z")
	public final boolean method575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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
	public final boolean method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg1 == arg0 && arg2 == arg3) {
				return true;
			}
		} else if (arg1 <= arg0 && arg0 <= arg1 + arg6 - 1 && arg2 <= arg2 && arg6 + arg2 - 1 >= arg2) {
			return true;
		}
		arg3 -= this.zOffset;
		arg1 -= this.xOffset;
		arg0 -= this.xOffset;
		arg2 -= this.zOffset;
		if (arg6 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (arg0 + 1 == arg1 && arg2 == arg3 && (this.flags[arg1][arg3] & 0x80) == 0) {
						return true;
					}
					if (arg0 == arg1 && arg2 - 1 == arg3 && (this.flags[arg1][arg3] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (arg0 - 1 == arg1 && arg3 == arg2 && (this.flags[arg1][arg3] & 0x8) == 0) {
						return true;
					}
					if (arg1 == arg0 && arg3 == arg2 - 1 && (this.flags[arg1][arg3] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (arg0 - 1 == arg1 && arg2 == arg3 && (this.flags[arg1][arg3] & 0x8) == 0) {
						return true;
					}
					if (arg0 == arg1 && arg3 == arg2 + 1 && (this.flags[arg1][arg3] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (arg0 + 1 == arg1 && arg2 == arg3 && (this.flags[arg1][arg3] & 0x80) == 0) {
						return true;
					}
					if (arg1 == arg0 && arg3 == arg2 + 1 && (this.flags[arg1][arg3] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (arg0 == arg1 && arg3 == arg2 + 1 && (this.flags[arg1][arg3] & 0x20) == 0) {
					return true;
				}
				if (arg1 == arg0 && arg2 - 1 == arg3 && (this.flags[arg1][arg3] & 0x2) == 0) {
					return true;
				}
				if (arg0 - 1 == arg1 && arg2 == arg3 && (this.flags[arg1][arg3] & 0x8) == 0) {
					return true;
				}
				if (arg1 == arg0 + 1 && arg3 == arg2 && (this.flags[arg1][arg3] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(89) int local89 = arg1 + arg6 - 1;
			@Pc(95) int local95 = arg3 + arg6 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (arg1 == arg0 + 1 && arg2 >= arg3 && arg2 <= local95 && (this.flags[arg1][arg2] & 0x80) == 0) {
						return true;
					}
					if (arg0 >= arg1 && local89 >= arg0 && arg3 == arg2 - arg6 && (this.flags[arg0][local95] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (arg1 == arg0 - arg6 && arg2 >= arg3 && arg2 <= local95 && (this.flags[local89][arg2] & 0x8) == 0) {
						return true;
					}
					if (arg1 <= arg0 && local89 >= arg0 && arg3 == arg2 - arg6 && (this.flags[arg0][local95] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (arg1 == arg0 - arg6 && arg3 <= arg2 && arg2 <= local95 && (this.flags[local89][arg2] & 0x8) == 0) {
						return true;
					}
					if (arg0 >= arg1 && arg0 <= local89 && arg3 == arg2 + 1 && (this.flags[arg0][arg3] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (arg1 == arg0 + 1 && arg2 >= arg3 && local95 >= arg2 && (this.flags[arg1][arg2] & 0x80) == 0) {
						return true;
					}
					if (arg0 >= arg1 && local89 >= arg0 && arg2 + 1 == arg3 && (this.flags[arg0][arg3] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (arg1 <= arg0 && arg0 <= local89 && arg2 + 1 == arg3 && (this.flags[arg0][arg3] & 0x20) == 0) {
					return true;
				}
				if (arg1 <= arg0 && arg0 <= local89 && arg2 - arg6 == arg3 && (this.flags[arg0][local95] & 0x2) == 0) {
					return true;
				}
				if (arg0 - arg6 == arg1 && arg2 >= arg3 && arg2 <= local95 && (this.flags[local89][arg2] & 0x8) == 0) {
					return true;
				}
				if (arg0 + 1 == arg1 && arg2 >= arg3 && local95 >= arg2 && (this.flags[arg1][arg2] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIII)Z")
	private boolean method578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg4 + arg2;
		@Pc(13) int local13 = arg6 + arg3;
		@Pc(17) int local17 = arg1 + arg5;
		@Pc(22) int local22 = arg8 + arg0;
		if (local13 == arg2 && (arg7 & 0x2) == 0) {
			@Pc(51) int local51 = arg5 <= arg8 ? arg8 : arg5;
			@Pc(62) int local62 = local22 <= local17 ? local22 : local17;
			while (local62 > local51) {
				if ((this.flags[local13 - this.xOffset - 1][local51 - this.zOffset] & 0x8) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local9 == arg6 && (arg7 & 0x8) == 0) {
			@Pc(238) int local238 = arg5 > arg8 ? arg5 : arg8;
			@Pc(245) int local245 = local17 >= local22 ? local22 : local17;
			while (local245 > local238) {
				if ((this.flags[arg6 - this.xOffset][local238 - this.zOffset] & 0x80) == 0) {
					return true;
				}
				local238++;
			}
		} else if (local22 == arg5 && (arg7 & 0x1) == 0) {
			@Pc(125) int local125 = arg2 > arg6 ? arg2 : arg6;
			@Pc(136) int local136 = local13 <= local9 ? local13 : local9;
			while (local136 > local125) {
				if ((this.flags[local125 - this.xOffset][local22 - this.zOffset - 1] & 0x2) == 0) {
					return true;
				}
				local125++;
			}
		} else if (local17 == arg8 && (arg7 & 0x4) == 0) {
			@Pc(186) int local186 = local13 > local9 ? local9 : local13;
			for (@Pc(197) int local197 = arg2 <= arg6 ? arg6 : arg2; local197 < local186; local197++) {
				if ((this.flags[local197 - this.xOffset][arg8 - this.zOffset] & 0x20) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	public final void clear() {
		for (@Pc(11) int x = 0; x < this.width; x++) {
			for (@Pc(21) int z = 0; z < this.length; z++) {
				if (x == 0 || z == 0 || this.width - 5 <= x || z >= this.length - 5) {
					this.flags[x][z] = 16777215;
				} else {
					this.flags[x][z] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIB)V")
	public final void flagTile(@OriginalArg(0) int x, @OriginalArg(1) int z) {
		x -= this.xOffset;
		z -= this.zOffset;
		this.flags[x][z] |= 2097152;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V")
	public final void unflagGroundDecor(@OriginalArg(1) int x, @OriginalArg(2) int z) {
		z -= this.zOffset;
		x -= this.xOffset;
		this.flags[x][z] &= -262145;
	}
}

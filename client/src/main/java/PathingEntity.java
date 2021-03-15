import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public abstract class PathingEntity extends Entity {

	@OriginalMember(owner = "client!be", name = "j", descriptor = "[I")
	public static final int[] ANGLES = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	public int anInt3966;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
	public int anInt3971;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
	public int anInt3973;

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
	public int xFine;

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
	public int anInt3975;

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
	public int anInt3984;

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "Lclient!ne;")
	protected ParticleSystem particleSystem;

	@OriginalMember(owner = "client!qc", name = "ob", descriptor = "I")
	public int zFine;

	@OriginalMember(owner = "client!qc", name = "tb", descriptor = "I")
	public int anInt4006;

	@OriginalMember(owner = "client!qc", name = "wb", descriptor = "I")
	public int anInt4008;

	@OriginalMember(owner = "client!qc", name = "Db", descriptor = "I")
	public int anInt4013;

	@OriginalMember(owner = "client!qc", name = "Hb", descriptor = "I")
	public int targetAngle;

	@OriginalMember(owner = "client!qc", name = "Ib", descriptor = "I")
	public int anInt4018;

	@OriginalMember(owner = "client!qc", name = "Mb", descriptor = "I")
	public int anInt4022;

	@OriginalMember(owner = "client!qc", name = "Pb", descriptor = "I")
	public int anInt4025;

	@OriginalMember(owner = "client!qc", name = "Rb", descriptor = "I")
	public int anInt4027;

	@OriginalMember(owner = "client!qc", name = "Vb", descriptor = "I")
	public int angle;

	@OriginalMember(owner = "client!qc", name = "Wb", descriptor = "I")
	public int anInt4032;

	@OriginalMember(owner = "client!qc", name = "Xb", descriptor = "I")
	public int anInt4033;

	@OriginalMember(owner = "client!qc", name = "Yb", descriptor = "I")
	public int anInt4034;

	@OriginalMember(owner = "client!qc", name = "cc", descriptor = "I")
	public int anInt4038;

	@OriginalMember(owner = "client!qc", name = "gc", descriptor = "I")
	public int anInt4041;

	@OriginalMember(owner = "client!qc", name = "ic", descriptor = "I")
	public int anInt4043;

	@OriginalMember(owner = "client!qc", name = "mc", descriptor = "Ljava/lang/Object;")
	public Object anObject5;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "[I")
	public final int[] movementQueueX = new int[10];

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
	private int anInt3967 = 0;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
	public int anInt3968 = 0;

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "[Lclient!re;")
	public final Class150[] aClass150Array3 = new Class150[12];

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
	private int anInt3978 = 0;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
	private int anInt3972 = 0;

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
	private int size = 1;

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
	public int anInt3985 = -1;

	@OriginalMember(owner = "client!qc", name = "db", descriptor = "[I")
	public final int[] anIntArray424 = new int[4];

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
	public int anInt3987 = 0;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "Z")
	private boolean aBoolean280 = false;

	@OriginalMember(owner = "client!qc", name = "hb", descriptor = "I")
	private int anInt3997 = 0;

	@OriginalMember(owner = "client!qc", name = "fb", descriptor = "Z")
	public boolean aBoolean282 = true;

	@OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
	public int anInt3989 = 0;

	@OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
	public int anInt3999 = 0;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	public int movementQueueSize = 0;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
	public int basId = -1;

	@OriginalMember(owner = "client!qc", name = "ub", descriptor = "I")
	public int seqId = -1;

	@OriginalMember(owner = "client!qc", name = "Ab", descriptor = "I")
	public int anInt4010 = 0;

	@OriginalMember(owner = "client!qc", name = "Bb", descriptor = "I")
	public int anInt4011 = -1;

	@OriginalMember(owner = "client!qc", name = "lb", descriptor = "I")
	public int anInt4000 = 0;

	@OriginalMember(owner = "client!qc", name = "yb", descriptor = "I")
	public int anInt4009 = 32;

	@OriginalMember(owner = "client!qc", name = "X", descriptor = "Z")
	public boolean aBoolean281 = false;

	@OriginalMember(owner = "client!qc", name = "Cb", descriptor = "I")
	private int anInt4012 = 0;

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "Ljava/lang/String;")
	public String chatMessage = null;

	@OriginalMember(owner = "client!qc", name = "kb", descriptor = "Z")
	public boolean aBoolean283 = false;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "[B")
	public final byte[] movementQueueSpeed = new byte[10];

	@OriginalMember(owner = "client!qc", name = "gb", descriptor = "I")
	public int anInt3996 = 0;

	@OriginalMember(owner = "client!qc", name = "pb", descriptor = "Z")
	public boolean aBoolean284 = false;

	@OriginalMember(owner = "client!qc", name = "mb", descriptor = "I")
	public int anInt4001 = 0;

	@OriginalMember(owner = "client!qc", name = "sb", descriptor = "I")
	public int movementSeqId = -1;

	@OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
	public int anInt3992 = 0;

	@OriginalMember(owner = "client!qc", name = "Nb", descriptor = "I")
	public int chatLoops = 100;

	@OriginalMember(owner = "client!qc", name = "Tb", descriptor = "I")
	public int anInt4029 = 0;

	@OriginalMember(owner = "client!qc", name = "ib", descriptor = "I")
	public int chatEffect = 0;

	@OriginalMember(owner = "client!qc", name = "Ub", descriptor = "I")
	public int anInt4030 = 0;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public int spotAnimId = -1;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	public int anInt3970 = 0;

	@OriginalMember(owner = "client!qc", name = "Jb", descriptor = "I")
	public int anInt4019 = -1;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
	public int anInt3976 = -1;

	@OriginalMember(owner = "client!qc", name = "Eb", descriptor = "I")
	public int anInt4014 = 0;

	@OriginalMember(owner = "client!qc", name = "Qb", descriptor = "I")
	public int anInt4026 = 0;

	@OriginalMember(owner = "client!qc", name = "nb", descriptor = "[I")
	public final int[] anIntArray425 = new int[4];

	@OriginalMember(owner = "client!qc", name = "Gb", descriptor = "I")
	protected int anInt4016 = -32768;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
	public int chatColor = 0;

	@OriginalMember(owner = "client!qc", name = "dc", descriptor = "I")
	private int anInt4039 = 0;

	@OriginalMember(owner = "client!qc", name = "ac", descriptor = "I")
	private int anInt4036 = 0;

	@OriginalMember(owner = "client!qc", name = "Fb", descriptor = "I")
	public int anInt4015 = 0;

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "[I")
	public final int[] anIntArray423 = new int[4];

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
	public int anInt3993 = -1000;

	@OriginalMember(owner = "client!qc", name = "bc", descriptor = "I")
	public int movementBlockedLoops = 0;

	@OriginalMember(owner = "client!qc", name = "fc", descriptor = "[I")
	public final int[] movementQueueZ = new int[10];

	@OriginalMember(owner = "client!qc", name = "Sb", descriptor = "I")
	private int anInt4028 = 0;

	@OriginalMember(owner = "client!qc", name = "Kb", descriptor = "I")
	public int anInt4020 = 0;

	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
	public int anInt3994 = 0;

	@OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
	public int lastSeenLoop = 0;

	@OriginalMember(owner = "client!qc", name = "qb", descriptor = "I")
	public int anInt4003 = 0;

	@OriginalMember(owner = "client!qc", name = "hc", descriptor = "I")
	public int anInt4042 = 0;

	@OriginalMember(owner = "client!qc", name = "lc", descriptor = "I")
	public int anInt4046 = 0;

	@OriginalMember(owner = "client!qc", name = "jc", descriptor = "I")
	public int anInt4044 = 0;

	@OriginalMember(owner = "client!qc", name = "vb", descriptor = "Z")
	protected boolean aBoolean285 = false;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BIIIZ)V")
	public final void teleport(@OriginalArg(3) int x, @OriginalArg(1) int z, @OriginalArg(4) boolean clearMovementQueue, @OriginalArg(2) int size) {
		if (this.seqId != -1 && SeqTypeList.get(this.seqId).anInt1237 == 1) {
			this.seqId = -1;
		}
		if (this.spotAnimId != -1) {
			@Pc(39) SpotAnimType type = SpotAnimTypeList.get(this.spotAnimId);
			if (type.aBoolean222 && SeqTypeList.get(type.anInt3134).anInt1237 == 1) {
				this.spotAnimId = -1;
			}
		}
		if (!clearMovementQueue) {
			@Pc(63) int dx = x - this.movementQueueX[0];
			@Pc(71) int dz = z - this.movementQueueZ[0];
			if (dx >= -8 && dx <= 8 && dz >= -8 && dz <= 8) {
				if (this.movementQueueSize < 9) {
					this.movementQueueSize++;
				}
				for (@Pc(103) int i = this.movementQueueSize; i > 0; i--) {
					this.movementQueueX[i] = this.movementQueueX[i - 1];
					this.movementQueueZ[i] = this.movementQueueZ[i - 1];
					this.movementQueueSpeed[i] = this.movementQueueSpeed[i - 1];
				}
				this.movementQueueX[0] = x;
				this.movementQueueSpeed[0] = 1;
				this.movementQueueZ[0] = z;
				return;
			}
		}
		this.anInt4030 = 0;
		this.movementBlockedLoops = 0;
		this.movementQueueX[0] = x;
		this.movementQueueZ[0] = z;
		this.zFine = this.movementQueueZ[0] * 128 + size * 64;
		this.movementQueueSize = 0;
		this.xFine = this.movementQueueX[0] * 128 + size * 64;
		if (GlRenderer.enabled && PlayerList.self == this) {
			Static17.method1655();
		}
		if (this.particleSystem != null) {
			this.particleSystem.method2952();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)I")
	protected abstract int getBasId();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
	public final void method3304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			if (arg0 >= this.anIntArray425[local7]) {
				this.anIntArray423[local7] = arg2;
				this.anIntArray424[local7] = arg1;
				this.anIntArray425[local7] = arg0 + 70;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!vg;)V")
	protected final void method3305(@OriginalArg(1) Model arg0) {
		@Pc(9) BasType local9 = this.getBasType();
		if (local9.anInt850 == 0 && local9.anInt851 == 0) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		if (this.aBoolean283 && this.anInt4020 != 0) {
			local21 = local9.anInt851;
			if (this.anInt4020 < 0) {
				local19 = -local9.anInt850;
			} else {
				local19 = local9.anInt850;
			}
		}
		if (local9.anInt856 != 0) {
			if (this.anInt3978 != local19) {
				if (this.anInt4039 > 0 && local19 > this.anInt3972) {
					@Pc(83) int local83 = this.anInt4039 * this.anInt4039 / (local9.anInt856 * 2);
					@Pc(89) int local89 = local19 - this.anInt3972;
					if (local83 <= local89) {
						this.aBoolean279 = true;
						this.anInt4028 = (this.anInt3972 + local19 - local83) / 2;
						@Pc(122) int local122 = local9.anInt838 * local9.anInt838 / (local9.anInt856 * 2);
						@Pc(127) int local127 = local19 - local122;
						if (this.anInt4028 < local127) {
							this.anInt4028 = local127;
						}
					} else {
						this.aBoolean279 = false;
					}
				} else if (this.anInt4039 < 0 && this.anInt3972 > local19) {
					@Pc(171) int local171 = this.anInt4039 * this.anInt4039 / (local9.anInt856 * 2);
					@Pc(176) int local176 = local19 - this.anInt3972;
					if (local176 >= local171) {
						this.anInt4028 = (local19 + local171 + this.anInt3972) / 2;
						@Pc(200) int local200 = local9.anInt838 * local9.anInt838 / (local9.anInt856 * 2);
						this.aBoolean279 = true;
						@Pc(207) int local207 = local200 + local19;
						if (this.anInt4028 > local207) {
							this.anInt4028 = local207;
						}
					} else {
						this.aBoolean279 = false;
					}
				} else {
					this.aBoolean279 = false;
				}
				this.anInt3978 = local19;
			}
			if (this.anInt4039 == 0) {
				@Pc(243) int local243 = this.anInt3978 - this.anInt3972;
				if (local243 > -local9.anInt856 && local9.anInt856 > local243) {
					this.anInt3972 = this.anInt3978;
				} else {
					@Pc(269) int local269 = local9.anInt838 * local9.anInt838 / (local9.anInt856 * 2);
					this.anInt4028 = (this.anInt3978 + this.anInt3972) / 2;
					if (local243 < 0) {
						@Pc(288) int local288 = this.anInt3978 + local269;
						this.anInt4039 = -local9.anInt856;
						if (this.anInt4028 > local288) {
							this.anInt4028 = local288;
						}
					} else {
						@Pc(312) int local312 = this.anInt3978 - local269;
						this.anInt4039 = local9.anInt856;
						if (local312 > this.anInt4028) {
							this.anInt4028 = local312;
						}
					}
					this.aBoolean279 = true;
				}
			} else if (this.anInt4039 <= 0) {
				if (this.anInt4028 >= this.anInt3972) {
					this.aBoolean279 = false;
				}
				if (!this.aBoolean279) {
					this.anInt4039 += local9.anInt856;
					if (this.anInt4039 > 0) {
						this.anInt4039 = 0;
					}
				} else if (this.anInt4039 > -local9.anInt838) {
					this.anInt4039 -= local9.anInt856;
				}
			} else {
				if (this.anInt4028 <= this.anInt3972) {
					this.aBoolean279 = false;
				}
				if (!this.aBoolean279) {
					this.anInt4039 -= local9.anInt856;
					if (this.anInt4039 < 0) {
						this.anInt4039 = 0;
					}
				} else if (this.anInt4039 < local9.anInt838) {
					this.anInt4039 += local9.anInt856;
				}
			}
			this.anInt3972 += this.anInt4039;
			if (this.anInt3972 != 0) {
				@Pc(445) int local445 = this.anInt3972 >> 5 & 0x7FF;
				@Pc(450) int local450 = arg0.getMinY() / 2;
				arg0.translate(0, -local450, 0);
				arg0.method3817(local445);
				arg0.translate(0, local450, 0);
			}
		}
		if (local9.anInt863 == 0) {
			return;
		}
		if (local21 != this.anInt4012) {
			if (this.anInt4036 > 0 && local21 > this.anInt3997) {
				@Pc(568) int local568 = local21 - this.anInt3997;
				@Pc(579) int local579 = this.anInt4036 * this.anInt4036 / (local9.anInt863 * 2);
				if (local579 > local568) {
					this.aBoolean280 = false;
				} else {
					this.aBoolean280 = true;
					@Pc(601) int local601 = local9.anInt848 * local9.anInt848 / (local9.anInt863 * 2);
					this.anInt3967 = (local21 + this.anInt3997 - local579) / 2;
					@Pc(616) int local616 = local21 - local601;
					if (this.anInt3967 < local616) {
						this.anInt3967 = local616;
					}
				}
			} else if (this.anInt4036 < 0 && local21 < this.anInt3997) {
				@Pc(506) int local506 = this.anInt4036 * this.anInt4036 / (local9.anInt863 * 2);
				@Pc(512) int local512 = local21 - this.anInt3997;
				if (local506 > local512) {
					this.aBoolean280 = false;
				} else {
					this.aBoolean280 = true;
					this.anInt3967 = (local21 + local506 + this.anInt3997) / 2;
					@Pc(544) int local544 = local9.anInt848 * local9.anInt848 / (local9.anInt863 * 2);
					@Pc(548) int local548 = local544 + local21;
					if (local548 < this.anInt3967) {
						this.anInt3967 = local548;
					}
				}
			} else {
				this.aBoolean280 = false;
			}
			this.anInt4012 = local21;
		}
		if (this.anInt4036 == 0) {
			@Pc(735) int local735 = this.anInt4012 - this.anInt3997;
			if (-local9.anInt863 < local735 && local735 < local9.anInt863) {
				this.anInt3997 = this.anInt4012;
			} else {
				this.anInt3967 = (this.anInt4012 + this.anInt3997) / 2;
				@Pc(770) int local770 = local9.anInt848 * local9.anInt848 / (local9.anInt863 * 2);
				this.aBoolean280 = true;
				if (local735 < 0) {
					@Pc(783) int local783 = local770 + this.anInt4012;
					if (this.anInt3967 > local783) {
						this.anInt3967 = local783;
					}
					this.anInt4036 = -local9.anInt863;
				} else {
					this.anInt4036 = local9.anInt863;
					@Pc(807) int local807 = this.anInt4012 - local770;
					if (this.anInt3967 < local807) {
						this.anInt3967 = local807;
					}
				}
			}
		} else if (this.anInt4036 > 0) {
			if (this.anInt3967 <= this.anInt3997) {
				this.aBoolean280 = false;
			}
			if (!this.aBoolean280) {
				this.anInt4036 -= local9.anInt863;
				if (this.anInt4036 < 0) {
					this.anInt4036 = 0;
				}
			} else if (this.anInt4036 < local9.anInt848) {
				this.anInt4036 += local9.anInt863;
			}
		} else {
			if (this.anInt3967 >= this.anInt3997) {
				this.aBoolean280 = false;
			}
			if (!this.aBoolean280) {
				this.anInt4036 += local9.anInt863;
				if (this.anInt4036 > 0) {
					this.anInt4036 = 0;
				}
			} else if (this.anInt4036 > -local9.anInt848) {
				this.anInt4036 -= local9.anInt863;
			}
		}
		this.anInt3997 += this.anInt4036;
		if (this.anInt3997 == 0) {
			return;
		}
		@Pc(840) int local840 = this.anInt3997 >> 5 & 0x7FF;
		@Pc(845) int local845 = arg0.getMinY() / 2;
		arg0.translate(0, -local845, 0);
		arg0.method3832(local840);
		arg0.translate(0, local845, 0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)I")
	public final int method3306() {
		return this.anInt4016 == -32768 ? 200 : -this.anInt4016;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public final void method3307() {
		this.anInt4030 = 0;
		this.movementQueueSize = 0;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
	public final void move(@OriginalArg(0) int direction, @OriginalArg(2) int speed) {
		@Pc(6) int x = this.movementQueueX[0];
		@Pc(15) int z = this.movementQueueZ[0];
		if (direction == 0) {
			x--;
			z++;
		}
		if (this.seqId != -1 && SeqTypeList.get(this.seqId).anInt1237 == 1) {
			this.seqId = -1;
		}
		if (direction == 1) {
			z++;
		}
		if (this.spotAnimId != -1) {
			@Pc(58) SpotAnimType type = SpotAnimTypeList.get(this.spotAnimId);
			if (type.aBoolean222 && SeqTypeList.get(type.anInt3134).anInt1237 == 1) {
				this.spotAnimId = -1;
			}
		}
		if (direction == 2) {
			z++;
			x++;
		}
		if (this.movementQueueSize < 9) {
			this.movementQueueSize++;
		}
		for (@Pc(95) int i = this.movementQueueSize; i > 0; i--) {
			this.movementQueueX[i] = this.movementQueueX[i - 1];
			this.movementQueueZ[i] = this.movementQueueZ[i - 1];
			this.movementQueueSpeed[i] = this.movementQueueSpeed[i - 1];
		}
		this.movementQueueSpeed[0] = (byte) speed;
		if (direction == 3) {
			x--;
		}
		if (direction == 4) {
			x++;
		}
		if (direction == 5) {
			x--;
			z--;
		}
		if (direction == 6) {
			z--;
		}
		if (direction == 7) {
			x++;
			z--;
		}
		this.movementQueueX[0] = x;
		this.movementQueueZ[0] = z;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)Z")
	public boolean isVisible() {
		return false;
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
	public int getSize() {
		return this.size;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!vg;II)V")
	protected final void method3312(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1) {
		Static6.anInt4907 = 0;
		Static4.anInt2747 = 0;
		Static5.anInt3525 = 0;
		@Pc(9) BasType type = this.getBasType();
		@Pc(16) int local16 = type.anInt844;
		@Pc(19) int local19 = type.anInt847;
		if (local16 == 0 || local19 == 0) {
			return;
		}
		@Pc(31) int local31 = MathUtils.SINE[arg1];
		@Pc(35) int local35 = MathUtils.COSINE[arg1];
		@Pc(40) int local40 = -local16 / 2;
		@Pc(45) int local45 = -local19 / 2;
		@Pc(55) int local55 = local35 * local45 - local40 * local31 >> 16;
		@Pc(65) int local65 = local35 * local40 + local45 * local31 >> 16;
		@Pc(70) int local70 = -local19 / 2;
		@Pc(82) int local82 = SceneGraph.method522(Player.level, local65 + this.xFine, local55 + this.zFine);
		@Pc(86) int local86 = local16 / 2;
		@Pc(91) int local91 = -local16 / 2;
		@Pc(102) int local102 = local31 * local70 + local86 * local35 >> 16;
		@Pc(106) int local106 = local19 / 2;
		@Pc(116) int local116 = local35 * local106 - local31 * local91 >> 16;
		@Pc(126) int local126 = local35 * local70 - local31 * local86 >> 16;
		@Pc(136) int local136 = local91 * local35 + local31 * local106 >> 16;
		@Pc(148) int local148 = SceneGraph.method522(Player.level, local102 + this.xFine, local126 + this.zFine);
		@Pc(161) int local161 = SceneGraph.method522(Player.level, this.xFine + local136, local116 + this.zFine);
		@Pc(165) int local165 = local16 / 2;
		@Pc(169) int local169 = local19 / 2;
		@Pc(180) int local180 = local31 * local169 + local165 * local35 >> 16;
		@Pc(191) int local191 = local35 * local169 - local31 * local165 >> 16;
		@Pc(204) int local204 = SceneGraph.method522(Player.level, local180 + this.xFine, this.zFine + local191);
		@Pc(215) int local215 = local204 > local161 ? local161 : local204;
		@Pc(226) int local226 = local161 > local82 ? local82 : local161;
		@Pc(233) int local233 = local82 < local148 ? local82 : local148;
		@Pc(240) int local240 = local148 >= local204 ? local204 : local148;
		Static5.anInt3525 = (int) (Math.atan2((double) (local233 - local215), (double) local19) * 325.95D) & 0x7FF;
		if (Static5.anInt3525 != 0) {
			arg0.method3832(Static5.anInt3525);
		}
		Static6.anInt4907 = (int) (Math.atan2((double) (local226 - local240), (double) local16) * 325.95D) & 0x7FF;
		if (Static6.anInt4907 != 0) {
			arg0.method3817(Static6.anInt4907);
		}
		Static4.anInt2747 = local82 + local204;
		if (Static4.anInt2747 > local161 + local148) {
			Static4.anInt2747 = local148 + local161;
		}
		Static4.anInt2747 = (Static4.anInt2747 >> 1) - this.anInt4006;
		if (Static4.anInt2747 != 0) {
			arg0.translate(0, Static4.anInt2747, 0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)Lclient!d;")
	public final BasType getBasType() {
		@Pc(15) int basId = this.getBasId();
		return basId == -1 ? BasType.DEFAULT : BasTypeList.get(basId);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!vg;BLclient!vg;)V")
	protected final void method3315(@OriginalArg(0) Model arg0, @OriginalArg(2) Model arg1) {
		if (GlRenderer.enabled) {
			@Pc(67) GlModel local67 = (GlModel) arg0;
			@Pc(70) GlModel local70 = (GlModel) arg1;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (local67.particleEmitters != null || local67.particleEffectors != null || local70 != null && (local70.particleEmitters != null || local70.particleEffectors != null))) {
				this.particleSystem = new ParticleSystem(client.loop, this.getSize(), this.getSize());
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(local67.particleEmitters, local67.particleEffectors, false, local67.vertexX, local67.vertexY, local67.vertexZ);
			}
		} else {
			@Pc(4) SoftwareModel local4 = (SoftwareModel) arg1;
			@Pc(7) SoftwareModel local7 = (SoftwareModel) arg0;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (local7.particleEmitters != null || local7.particleEffectors != null || local4 != null && (local4.particleEmitters != null || local4.particleEffectors != null))) {
				this.particleSystem = new ParticleSystem(client.loop, this.getSize(), this.getSize());
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(local7.particleEmitters, local7.particleEffectors, false, local7.vertexX, local7.vertexY, local7.vertexZ);
			}
		}
		this.aBoolean285 = true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	public final void setSize(@OriginalArg(1) int size) {
		this.size = size;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Loc extends Entity {

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "[I")
	public static final int[] LAYERS = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "Lclient!ne;")
	private ParticleSystem particleSystem;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "Z")
	private boolean aBoolean318 = false;

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
	private final int anInt4575 = -32768;

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
	private int anInt4581 = 0;

	@OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
	private int anInt4586 = 0;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
	private int anInt4571 = -1;

	@OriginalMember(owner = "client!ri", name = "K", descriptor = "Z")
	private boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "Z")
	private boolean aBoolean320 = true;

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "Lclient!fe;")
	private SoftwareIndexedSprite aClass56_Sub1_4 = null;

	@OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
	private int anInt4594 = -1;

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
	private int anInt4591 = 0;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	private final int shape;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
	private final int x;

	@OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
	private final int z;

	@OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
	private final int y;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
	private final int angle;

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
	private final int locId;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
	private int anInt4568;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
	private int anInt4574;

	@OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
	private int anInt4590;

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
	private int anInt4580;

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "Lclient!eg;")
	private SeqType seqType;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IIIIIIIZLclient!vc;)V")
	public Loc(@OriginalArg(0) int locId, @OriginalArg(1) int shape, @OriginalArg(2) int angle, @OriginalArg(3) int y, @OriginalArg(4) int x, @OriginalArg(5) int z, @OriginalArg(6) int seqId, @OriginalArg(7) boolean arg7, @OriginalArg(8) Entity arg8) {
		this.shape = shape;
		this.x = x;
		this.z = z;
		this.y = y;
		this.angle = angle;
		this.locId = locId;
		if (arg8 != null) {
			this.aBoolean318 = true;
			if (arg8 instanceof Loc) {
				@Pc(96) Loc local96 = (Loc) arg8;
				if (GlRenderer.enabled) {
					local96.method3732();
				}
				this.anInt4568 = local96.anInt4568;
				this.anInt4574 = local96.anInt4574;
				this.anInt4590 = local96.anInt4590;
				this.anInt4580 = local96.anInt4580;
				this.seqType = local96.seqType;
			} else if (GlRenderer.enabled) {
				@Pc(65) LocType type = LocTypeList.get(this.locId);
				if (type.multiLocs != null) {
					type = type.getMultiLoc();
				}
				if (type != null) {
					Static15.method4592(this.x, 0, this.angle, this.y, type, 0, this.z, this.shape);
				}
			}
		}
		if (this.aBoolean318) {
			this.setSeqId(seqId);
		}
		if (GlRenderer.enabled && arg8 != null) {
			this.method3728(true);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Entity local5 = null;
		if (GlRenderer.enabled) {
			local5 = this.method3728(true);
		} else {
			this.method3731(arg4, arg3);
		}
		if (!this.aBoolean319) {
			if (local5 == null) {
				local5 = this.method3735();
			}
			if (local5 == null) {
				return;
			}
			this.method3737(local5);
		}
		if (this.particleSystem != null) {
			this.particleSystem.method2949(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		@Pc(7) Entity local7 = this.method3735();
		if (local7 != null) {
			this.method3737(local7);
			local7.method3805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.particleSystem);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)Lclient!vc;")
	private Entity method3728(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean underwater = Terrain.tileHeights != Terrain.surfaceTileHeights;
		@Pc(17) LocType type = LocTypeList.get(this.locId);
		if (type.multiLocs != null) {
			type = type.getMultiLoc();
		}
		if (type == null) {
			if (GlRenderer.enabled && !underwater) {
				this.method3732();
			}
			this.anInt4594 = this.anInt4574;
			this.anInt4571 = -1;
			return null;
		}
		if (!this.aBoolean318 && type.id != this.anInt4571) {
			this.setSeqId(-1);
		}
		@Pc(63) int angle = this.angle & 0x3;
		@Pc(80) int width;
		@Pc(83) int length;
		if (angle == 1 || angle == 3) {
			width = type.length;
			length = type.width;
		} else {
			width = type.width;
			length = type.length;
		}
		@Pc(98) int local98 = (length >> 1) + this.z;
		@Pc(107) int local107 = this.x + (width + 1 >> 1);
		@Pc(114) int local114 = this.x + (width >> 1);
		@Pc(124) int local124 = this.z + (length + 1 >> 1);
		this.method3731(local98 * 128, local114 * 128);
		@Pc(176) boolean local176 = !underwater && type.aBoolean372 && (this.anInt4571 != type.id || (this.anInt4574 != this.anInt4594 || this.seqType != null && (this.seqType.aBoolean71 || Static6.aBoolean258) && this.anInt4574 != this.anInt4580) && Preferences.sceneryShadows >= 2);
		if (arg0 && !local176) {
			this.anInt4594 = this.anInt4574;
			this.anInt4571 = type.id;
			return null;
		}
		@Pc(199) int local199 = (width << 6) + (this.x << 7);
		@Pc(202) int[][] local202 = null;
		@Pc(212) int local212 = (this.z << 7) + (length << 6);
		@Pc(217) int[][] local217 = Terrain.tileHeights[this.y];
		if (underwater) {
			local202 = Terrain.surfaceTileHeights[0];
		} else if (this.y < 3) {
			local202 = Terrain.tileHeights[this.y + 1];
		}
		@Pc(267) int local267 = local217[local114][local98] + local217[local107][local98] + local217[local114][local124] + local217[local107][local124] >> 2;
		if (GlRenderer.enabled && local176) {
			Static14.method1210(this.aClass56_Sub1_4, this.anInt4581, this.anInt4586, this.anInt4591);
		}
		@Pc(287) boolean local287 = this.aClass56_Sub1_4 == null;
		@Pc(321) Class96 local321;
		if (this.seqType == null) {
			local321 = type.method4450(local199, false, this.shape, local267, local217, local202, local176, this.angle, local212, local287 ? Static1.aClass56_Sub1_1 : this.aClass56_Sub1_4);
		} else {
			local321 = type.method4458(local199, local217, this.anInt4574, local212, local267, local176, this.angle, this.shape, this.anInt4568, local202, this.seqType, local287 ? Static1.aClass56_Sub1_1 : this.aClass56_Sub1_4, this.anInt4580);
		}
		if (local321 == null) {
			this.anInt4594 = this.anInt4574;
			this.anInt4571 = type.id;
			return null;
		}
		if (GlRenderer.enabled && local176) {
			@Pc(363) int local363 = 0;
			if (local287) {
				Static1.aClass56_Sub1_1 = local321.aClass56_Sub1_3;
			}
			if (this.y != 0) {
				@Pc(379) int[][] local379 = Terrain.tileHeights[0];
				local363 = local267 - (local379[local114][local98] + local379[local107][local98] + local379[local114][local124] + local379[local107][local124] >> 2);
			}
			@Pc(414) SoftwareIndexedSprite local414 = local321.aClass56_Sub1_3;
			if (this.aBoolean320 && Static14.method1214(local414, local199, local363, local212)) {
				this.aBoolean320 = false;
			}
			if (!this.aBoolean320) {
				Static14.method1212(local414, local199, local363, local212);
				if (local287) {
					Static1.aClass56_Sub1_1 = null;
				}
				this.anInt4591 = local212;
				this.aClass56_Sub1_4 = local414;
				this.anInt4586 = local363;
				this.anInt4581 = local199;
			}
		}
		this.anInt4571 = type.id;
		this.anInt4594 = this.anInt4574;
		return local321.aClass53_3;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	private void setSeqId(@OriginalArg(1) int seqId) {
		@Pc(7) int seqId2 = seqId;
		@Pc(9) boolean local9 = false;
		if (seqId == -1) {
			@Pc(20) LocType local20 = LocTypeList.get(this.locId);
			@Pc(22) LocType local22 = local20;
			if (local20.multiLocs != null) {
				local20 = local20.getMultiLoc();
			}
			if (local20 == null) {
				return;
			}
			if (local20 == local22) {
				local22 = null;
			}
			if (local20.anIntArray633 != null) {
				if (this.seqType != null && local20.method4465(this.seqType.id)) {
					return;
				}
				seqId2 = local20.method4460();
				if (this.anInt4571 != local20.id) {
					local9 = local20.aBoolean380;
				}
			} else if (local20.anInt5523 == -1) {
				if (local22 != null && local22.anIntArray633 != null) {
					if (this.seqType != null && local22.method4465(this.seqType.id)) {
						return;
					}
					seqId2 = local22.method4460();
					if (local22.id != this.anInt4571) {
						local9 = local22.aBoolean380;
					}
				} else if (local22 != null && local22.anInt5523 != -1 && this.anInt4571 != local22.id) {
					local9 = local22.aBoolean380;
					seqId2 = local22.anInt5523;
				}
			} else if (this.anInt4571 != local20.id) {
				local9 = local20.aBoolean380;
				seqId2 = local20.anInt5523;
			}
		}
		if (seqId2 == -1) {
			this.seqType = null;
			return;
		}
		if (this.seqType == null || this.seqType.id != seqId2) {
			this.seqType = SeqTypeList.get(seqId2);
		} else if (this.seqType.anInt1238 == 0) {
			return;
		}
		if (local9) {
			this.anInt4574 = (int) (Math.random() * (double) this.seqType.anIntArray95.length);
			this.anInt4568 = (int) ((double) this.seqType.anIntArray94[this.anInt4574] * Math.random()) + 1;
		} else {
			this.anInt4568 = 1;
			this.anInt4574 = 0;
		}
		this.anInt4580 = this.anInt4574 + 1;
		if (this.anInt4580 < 0 || this.seqType.anIntArray95.length <= this.anInt4580) {
			this.anInt4580 = -1;
		}
		this.anInt4590 = client.loop - this.anInt4568;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V")
	private void method3731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label85:
		while (true) {
			if (this.seqType == null) {
				if (this.aBoolean318) {
					return;
				}
				this.setSeqId(-1);
				if (this.seqType == null) {
					return;
				}
			}
			@Pc(35) int local35 = client.loop - this.anInt4590;
			if (local35 > 100 && this.seqType.anInt1242 > 0) {
				@Pc(53) int local53 = this.seqType.anIntArray95.length - this.seqType.anInt1242;
				while (this.anInt4574 < local53 && this.seqType.anIntArray94[this.anInt4574] < local35) {
					local35 -= this.seqType.anIntArray94[this.anInt4574];
					this.anInt4574++;
				}
				if (this.anInt4574 >= local53) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local53; local94 < this.seqType.anIntArray95.length; local94++) {
						local92 += this.seqType.anIntArray94[local94];
					}
					local35 %= local92;
				}
				this.anInt4580 = this.anInt4574 + 1;
				if (this.seqType.anIntArray95.length <= this.anInt4580) {
					this.anInt4580 -= this.seqType.anInt1242;
					if (this.anInt4580 < 0 || this.anInt4580 >= this.seqType.anIntArray95.length) {
						this.anInt4580 = -1;
					}
				}
			}
			while (this.seqType.anIntArray94[this.anInt4574] < local35) {
				Static29.method3461(this.seqType, arg0, arg1, this.anInt4574, false);
				local35 -= this.seqType.anIntArray94[this.anInt4574];
				this.anInt4574++;
				if (this.seqType.anIntArray95.length <= this.anInt4574) {
					this.anInt4574 -= this.seqType.anInt1242;
					if (this.anInt4574 < 0 || this.seqType.anIntArray95.length <= this.anInt4574) {
						this.seqType = null;
						continue label85;
					}
				}
				this.anInt4580 = this.anInt4574 + 1;
				if (this.anInt4580 >= this.seqType.anIntArray95.length) {
					this.anInt4580 -= this.seqType.anInt1242;
					if (this.anInt4580 < 0 || this.seqType.anIntArray95.length <= this.anInt4580) {
						this.anInt4580 = -1;
					}
				}
			}
			this.anInt4568 = local35;
			this.anInt4590 = client.loop - local35;
			return;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public final void method3732() {
		if (this.aClass56_Sub1_4 != null) {
			Static14.method1210(this.aClass56_Sub1_4, this.anInt4581, this.anInt4586, this.anInt4591);
			this.aClass56_Sub1_4 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)Lclient!vc;")
	public final Entity method3735() {
		return this.method3728(false);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()I")
	@Override
	public final int method3813() {
		return this.anInt4575;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLclient!vc;)V")
	private void method3737(@OriginalArg(1) Entity arg0) {
		if (GlRenderer.enabled) {
			@Pc(70) GlModel model = (GlModel) arg0;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (model.particleEmitters != null || model.particleEffectors != null)) {
				@Pc(91) LocType type = LocTypeList.get(this.locId);
				if (type.multiLocs != null) {
					type = type.getMultiLoc();
				}
				if (type != null) {
					this.particleSystem = new ParticleSystem(client.loop, type.width, type.length);
				}
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(model.particleEmitters, model.particleEffectors, false, model.anIntArray507, model.anIntArray504, model.anIntArray502);
			}
		} else {
			@Pc(8) SoftwareModel model = (SoftwareModel) arg0;
			if ((this.particleSystem == null || this.particleSystem.stopped) && (model.particleEmitters != null || model.particleEffectors != null)) {
				@Pc(28) LocType type = LocTypeList.get(this.locId);
				if (type.multiLocs != null) {
					type = type.getMultiLoc();
				}
				if (type != null) {
					this.particleSystem = new ParticleSystem(client.loop, type.width, type.length);
				}
			}
			if (this.particleSystem != null) {
				this.particleSystem.method2967(model.particleEmitters, model.particleEffectors, false, model.anIntArray347, model.anIntArray344, model.anIntArray340);
			}
		}
		this.aBoolean319 = true;
	}

	@OriginalMember(owner = "client!ri", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		if (this.particleSystem != null) {
			this.particleSystem.remove();
		}
	}
}

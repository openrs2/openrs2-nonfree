import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Particle extends SecondaryParticleNode {

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
	private int anInt3232;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "Z")
	public boolean aBoolean228 = false;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "Lclient!bi;")
	public ParticleEmitter emitter;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
	public int anInt3228;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	public int anInt3229;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	public int anInt3230;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	public int anInt3231;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
	private int anInt3233;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!bi;IIIIIIIII)V")
	public Particle(@OriginalArg(0) ParticleEmitter emitter, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.emitter = emitter;
		this.anInt3228 = arg1 << Static4.anInt3227;
		this.anInt3229 = arg2 << Static4.anInt3227;
		this.anInt3230 = arg3 << Static4.anInt3227;
		this.anInt3231 = arg9;
		this.aShort22 = this.aShort20 = (short) arg8;
		this.aShort19 = (short) arg4;
		this.aShort23 = (short) arg5;
		this.aShort24 = (short) arg6;
		this.anInt3233 = arg7;
		this.method2631();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(JI)V")
	public final void method2629(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.emitter == null) {
			return;
		}
		this.aShort20 = (short) (this.aShort20 - arg1);
		if (this.aShort20 <= 0) {
			this.method2630();
			return;
		}
		@Pc(21) int local21 = this.anInt3228 >> Static4.anInt3227;
		@Pc(26) int local26 = this.anInt3229 >> Static4.anInt3227;
		@Pc(31) int local31 = this.anInt3230 >> Static4.anInt3227;
		@Pc(35) ParticleSystem system = this.emitter.system;
		@Pc(39) ParticleEmitterType type = this.emitter.type;
		if (type.anInt2408 != 0) {
			if (this.aShort22 - this.aShort20 <= type.anInt2414) {
				@Pc(69) int local69 = (this.anInt3231 >> 8 & 0xFF00) + (this.anInt3232 >> 16 & 0xFF) + type.anInt2407 * arg1;
				@Pc(86) int local86 = (this.anInt3231 & 0xFF00) + (this.anInt3232 >> 8 & 0xFF) + type.anInt2409 * arg1;
				@Pc(103) int local103 = ((this.anInt3231 & 0xFF) << 8) + (this.anInt3232 & 0xFF) + type.anInt2421 * arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 65535) {
					local69 = 65535;
				}
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 > 65535) {
					local86 = 65535;
				}
				if (local103 < 0) {
					local103 = 0;
				} else if (local103 > 65535) {
					local103 = 65535;
				}
				this.anInt3231 &= -16777216;
				this.anInt3231 |= ((local69 & 0xFF00) << 8) + (local86 & 0xFF00) + (local103 >> 8 & 0xFF);
				this.anInt3232 &= -16777216;
				this.anInt3232 |= ((local69 & 0xFF) << 16) + ((local86 & 0xFF) << 8) + (local103 & 0xFF);
			}
			if (this.aShort22 - this.aShort20 <= type.anInt2410) {
				@Pc(212) int local212 = (this.anInt3231 >> 16 & 0xFF00) + (this.anInt3232 >> 24 & 0xFF) + type.anInt2398 * arg1;
				if (local212 < 0) {
					local212 = 0;
				} else if (local212 > 65535) {
					local212 = 65535;
				}
				this.anInt3231 &= 16777215;
				this.anInt3231 |= (local212 & 0xFF00) << 16;
				this.anInt3232 &= 16777215;
				this.anInt3232 |= (local212 & 0xFF) << 24;
			}
		}
		if (type.anInt2412 != -1 && this.aShort22 - this.aShort20 <= type.anInt2427) {
			this.anInt3233 += type.anInt2444 * arg1;
		}
		@Pc(278) int local278 = this.aShort19;
		@Pc(281) int local281 = this.aShort23;
		@Pc(284) int local284 = this.aShort24;
		@Pc(286) boolean local286 = false;
		if (type.anInt2395 == 1) {
			@Pc(296) int local296 = local21 - this.emitter.anInt309;
			@Pc(302) int local302 = local26 - this.emitter.anInt312;
			@Pc(308) int local308 = local31 - this.emitter.anInt316;
			@Pc(323) int local323 = (int) Math.sqrt((double) (local296 * local296 + local302 * local302 + local308 * local308));
			@Pc(331) long local331 = (long) (type.anInt2419 * local323 * arg1);
			this.anInt3233 = (int) ((long) this.anInt3233 - ((long) this.anInt3233 * local331 >> 18));
		} else if (type.anInt2395 == 2) {
			@Pc(356) int local356 = local21 - this.emitter.anInt309;
			@Pc(362) int local362 = local26 - this.emitter.anInt312;
			@Pc(368) int local368 = local31 - this.emitter.anInt316;
			@Pc(380) int local380 = local356 * local356 + local362 * local362 + local368 * local368;
			@Pc(388) long local388 = (long) (type.anInt2419 * local380 * arg1);
			this.anInt3233 = (int) ((long) this.anInt3233 - ((long) this.anInt3233 * local388 >> 28));
		}
		@Pc(406) Node sentinel = system.effectors.sentinel;
		for (@Pc(409) Node node = sentinel.next; node != sentinel; node = node.next) {
			@Pc(415) ParticleEffector effectorNode = (ParticleEffector) node;
			@Pc(419) ParticleEffectorType effectorType = effectorNode.effector.type;
			if (effectorType.anInt907 != 1) {
				@Pc(429) int local429 = local21 - effectorNode.anInt6095;
				@Pc(434) int local434 = local26 - effectorNode.anInt6089;
				@Pc(439) int local439 = local31 - effectorNode.anInt6087;
				@Pc(452) long local452 = (long) (local429 * local429 + local434 * local434 + local439 * local439);
				if (local452 <= effectorType.aLong39) {
					@Pc(463) int local463 = (int) Math.sqrt((double) local452);
					if (local463 == 0) {
						local463 = 1;
					}
					@Pc(491) long local491 = (long) (local429 * effectorNode.anInt6091 + local434 * effectorType.anInt903 + local439 * effectorNode.anInt6088) * 65535L / (long) (effectorType.anInt904 * local463);
					if (local491 >= (long) effectorType.anInt906) {
						@Pc(500) int local500 = 0;
						if (effectorType.anInt895 == 1) {
							local500 = (local463 >> 4) * effectorType.anInt911;
						} else if (effectorType.anInt895 == 2) {
							local500 = (local463 >> 4) * (local463 >> 4) * effectorType.anInt911;
						}
						if (effectorType.anInt905 != 0) {
							@Pc(606) int local606 = (local429 << 15) / local463 * effectorType.anInt904;
							@Pc(615) int local615 = (local434 << 15) / local463 * effectorType.anInt904;
							@Pc(624) int local624 = (local439 << 15) / local463 * effectorType.anInt904;
							if (effectorType.anInt908 == 0) {
								local278 += local606 * arg1 >> 15;
								local281 += local615 * arg1 >> 15;
								local284 += local624 * arg1 >> 15;
								local286 = true;
							} else {
								this.anInt3228 += local606 * arg1 >> 15;
								this.anInt3229 += local615 * arg1 >> 15;
								this.anInt3230 += local624 * arg1 >> 15;
							}
						} else if (effectorType.anInt908 == 0) {
							local278 += (effectorNode.anInt6091 - local500) * arg1;
							local281 += (effectorType.anInt903 - local500) * arg1;
							local284 += (effectorNode.anInt6088 - local500) * arg1;
							local286 = true;
						} else {
							this.anInt3228 += (effectorNode.anInt6091 - local500) * arg1;
							this.anInt3229 += (effectorType.anInt903 - local500) * arg1;
							this.anInt3230 += (effectorNode.anInt6088 - local500) * arg1;
						}
					}
				}
			}
		}
		if (type.anIntArray216 != null) {
			for (@Pc(693) int local693 = 0; local693 < type.anIntArray216.length; local693++) {
				@Pc(708) ParticleEffector effectorNode = (ParticleEffector) ParticleManager.aClass10_1.get((long) type.anIntArray216[local693]);
				while (effectorNode != null) {
					@Pc(714) ParticleEffectorType local714 = effectorNode.effector.type;
					@Pc(719) int local719 = local21 - effectorNode.anInt6095;
					@Pc(724) int local724 = local26 - effectorNode.anInt6089;
					@Pc(729) int local729 = local31 - effectorNode.anInt6087;
					@Pc(742) long local742 = (long) (local719 * local719 + local724 * local724 + local729 * local729);
					if (local742 > local714.aLong39) {
						effectorNode = (ParticleEffector) ParticleManager.aClass10_1.nextWithKey();
					} else {
						@Pc(758) int local758 = (int) Math.sqrt((double) local742);
						if (local758 == 0) {
							local758 = 1;
						}
						@Pc(786) long local786 = (long) (local719 * effectorNode.anInt6091 + local724 * local714.anInt903 + local729 * effectorNode.anInt6088) * 65535L / (long) (local714.anInt904 * local758);
						if (local786 < (long) local714.anInt906) {
							effectorNode = (ParticleEffector) ParticleManager.aClass10_1.nextWithKey();
						} else {
							@Pc(800) int local800 = 0;
							if (local714.anInt895 == 1) {
								local800 = (local758 >> 4) * local714.anInt911;
							} else if (local714.anInt895 == 2) {
								local800 = (local758 >> 4) * (local758 >> 4) * local714.anInt911;
							}
							if (local714.anInt905 != 0) {
								@Pc(906) int local906 = (local719 << 15) / local758 * local714.anInt904;
								@Pc(915) int local915 = (local724 << 15) / local758 * local714.anInt904;
								@Pc(924) int local924 = (local729 << 15) / local758 * local714.anInt904;
								if (local714.anInt908 == 0) {
									local278 += local906 * arg1 >> 15;
									local281 += local915 * arg1 >> 15;
									local284 += local924 * arg1 >> 15;
									local286 = true;
								} else {
									this.anInt3228 += local906 * arg1 >> 15;
									this.anInt3229 += local915 * arg1 >> 15;
									this.anInt3230 += local924 * arg1 >> 15;
								}
							} else if (local714.anInt908 == 0) {
								local278 += (effectorNode.anInt6091 - local800) * arg1;
								local281 += (local714.anInt903 - local800) * arg1;
								local284 += (effectorNode.anInt6088 - local800) * arg1;
								local286 = true;
							} else {
								this.anInt3228 += (effectorNode.anInt6091 - local800) * arg1;
								this.anInt3229 += (local714.anInt903 - local800) * arg1;
								this.anInt3230 += (effectorNode.anInt6088 - local800) * arg1;
							}
							effectorNode = (ParticleEffector) ParticleManager.aClass10_1.nextWithKey();
						}
					}
				}
			}
		}
		if (type.anIntArray213 != null) {
			if (type.anIntArray214 == null) {
				type.anIntArray214 = new int[type.anIntArray213.length];
				for (@Pc(1006) int local1006 = 0; local1006 < type.anIntArray213.length; local1006++) {
					ParticleEffectorTypeList.get(type.anIntArray213[local1006]);
					type.anIntArray214[local1006] = ((IntNode) ParticleEffectorTypeList.aClass84_16.get((long) type.anIntArray213[local1006])).value;
				}
			}
			for (@Pc(1036) int local1036 = 0; local1036 < type.anIntArray214.length; local1036++) {
				@Pc(1048) ParticleEffectorType effectorType = ParticleEffectorTypeList.aClass37Array1[type.anIntArray214[local1036]];
				if (effectorType.anInt908 == 0) {
					local278 += effectorType.anInt898 * arg1;
					local281 += effectorType.anInt903 * arg1;
					local284 += effectorType.anInt892 * arg1;
					local286 = true;
				} else {
					this.anInt3228 += effectorType.anInt898 * arg1;
					this.anInt3229 += effectorType.anInt903 * arg1;
					this.anInt3230 += effectorType.anInt892 * arg1;
				}
			}
		}
		if (local286) {
			while (true) {
				if (local278 <= 32767 && local281 <= 32767 && local284 <= 32767 && local278 >= -32767 && local281 >= -32767 && local284 >= -32767) {
					this.aShort19 = (short) local278;
					this.aShort23 = (short) local281;
					this.aShort24 = (short) local284;
					break;
				}
				local278 >>= 1;
				local281 >>= 1;
				local284 >>= 1;
				this.anInt3233 <<= 1;
			}
		}
		this.anInt3228 = (int) ((long) this.anInt3228 + ((long) this.aShort19 * (long) this.anInt3233 >> 23) * (long) arg1);
		this.anInt3229 = (int) ((long) this.anInt3229 + ((long) this.aShort23 * (long) this.anInt3233 >> 23) * (long) arg1);
		this.anInt3230 = (int) ((long) this.anInt3230 + ((long) this.aShort24 * (long) this.anInt3233 >> 23) * (long) arg1);
		@Pc(1217) int x = this.anInt3228 >> 19;
		@Pc(1222) int z = this.anInt3230 >> 19;
		@Pc(1227) int local1227 = this.anInt3229 >> Static4.anInt3227;
		if (local1227 > 0 || local1227 < -65535 || x < 0 || x >= Terrain.width || z < 0 || z >= Terrain.length) {
			this.method2630();
			return;
		}
		@Pc(1247) int[][][] local1247 = Terrain.tileHeights;
		@Pc(1256) int local1256 = local1247[system.anInt3514][x][z];
		@Pc(1271) int local1271;
		if (system.anInt3514 < 3) {
			local1271 = local1247[system.anInt3514 + 1][x][z];
		} else {
			local1271 = local1247[system.anInt3514][x][z] - 1024;
		}
		if (type.aBoolean168) {
			if (type.anInt2405 == -1 && local1227 > local1256) {
				this.method2630();
				return;
			}
			if (type.anInt2405 >= 0 && local1227 > local1247[type.anInt2405][x][z]) {
				this.method2630();
				return;
			}
			if (type.anInt2438 == -1 && local1227 < local1271) {
				this.method2630();
				return;
			}
			if (type.anInt2438 >= 0 && local1227 < local1247[type.anInt2438 + 1][x][z]) {
				this.method2630();
				return;
			}
		}
		if (x >= system.anInt3513 && x <= system.anInt3521 && z >= system.anInt3508 && z <= system.anInt3515 && local1227 <= system.anInt3510 && local1227 >= system.anInt3520) {
			this.aBoolean228 = false;
			return;
		}
		this.aBoolean228 = true;
		@Pc(1369) byte y = 3;
		if (local1227 > local1247[1][x][z]) {
			y = 0;
		} else if (local1227 > local1247[2][x][z]) {
			y = 1;
		} else if (local1227 > local1247[3][x][z]) {
			y = 2;
		} else if (local1227 < local1247[3][x][z] - 1024) {
			this.method2630();
			return;
		}
		@Pc(1427) Tile tile = Terrain.tiles[y][x][z];
		if (tile == null) {
			tile = Terrain.tiles[y][x][z] = new Tile(y, x, z);
		}
		if (tile.particles == null) {
			tile.particles = new SecondaryParticleLinkedList();
			tile.aByte14 = (byte) (arg0 & 0xFFL);
		} else if (tile.aByte14 != (byte) (arg0 & 0xFFL)) {
			tile.particles.clear();
			tile.aByte14 = (byte) (arg0 & 0xFFL);
		}
		tile.particles.addTail(this);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
	private void method2630() {
		this.emitter.system.particles[this.aShort21] = null;
		ParticleManager.pool[ParticleManager.poolWriterIndex] = this;
		ParticleManager.poolWriterIndex = ParticleManager.poolWriterIndex + 1 & 0x3FF;
		this.emitter = null;
		this.unlink();
		this.unlinkSecondary();
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "()V")
	private void method2631() {
		@Pc(4) int local4 = this.emitter.system.anInt3499;
		if (this.emitter.system.particles[local4] != null) {
			this.emitter.system.particles[local4].method2630();
		}
		this.emitter.system.particles[local4] = this;
		this.aShort21 = (short) this.emitter.system.anInt3499;
		this.emitter.system.anInt3499 = local4 + 1 & 0x1FFF;
		this.emitter.particles.addTail(this);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!bi;IIIIIIIII)V")
	public final void method2632(@OriginalArg(0) ParticleEmitter emitter, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.emitter = emitter;
		this.anInt3228 = arg1 << Static4.anInt3227;
		this.anInt3229 = arg2 << Static4.anInt3227;
		this.anInt3230 = arg3 << Static4.anInt3227;
		this.anInt3231 = arg9;
		this.aShort22 = this.aShort20 = (short) arg8;
		this.aShort19 = (short) arg4;
		this.aShort23 = (short) arg5;
		this.aShort24 = (short) arg6;
		this.anInt3233 = arg7;
		this.method2631();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class ParticleEmitter extends ParticleNode {

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
	public int anInt309;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
	public int anInt312;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
	public int anInt316;

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
	public int particlesSize;

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
	private int anInt326 = 0;

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "Z")
	public boolean aBoolean20 = false;

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "Z")
	public boolean aBoolean19 = true;

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "Lclient!sk;")
	public final ModelParticleEmitter emitter;

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "Lclient!ne;")
	public final ParticleSystem system;

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "Lclient!ug;")
	public final ParticleLinkedList particles;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Lclient!ik;")
	public final ParticleEmitterType type;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "J")
	private final long aLong18;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!sk;Lclient!ne;J)V")
	public ParticleEmitter(@OriginalArg(0) ModelParticleEmitter emitter, @OriginalArg(1) ParticleSystem system, @OriginalArg(2) long arg2) {
		this.emitter = emitter;
		this.system = system;
		this.particles = new ParticleLinkedList();
		this.type = this.emitter.type;
		this.aLong18 = arg2;
		this.anInt326 = (int) ((double) this.anInt326 + Math.random() * 64.0D);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZIJI)V")
	public void method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4) {
		if (this.aBoolean20) {
			arg2 = false;
		} else if (Preferences.particles < this.type.anInt2422) {
			arg2 = false;
		} else if (Static6.anIntArray494[Preferences.particles] < ParticleManager.prevParticles) {
			arg2 = false;
		} else if (this.anInt334 == this.anInt336 && this.anInt336 == this.anInt318 && this.anInt324 == this.anInt319 && this.anInt324 == this.anInt310 && this.anInt332 == this.anInt311 && this.anInt339 == this.anInt311) {
			arg2 = false;
		} else if (this.type.anInt2441 != -1) {
			@Pc(79) int local79 = (int) (arg4 - this.aLong18);
			if (this.type.aBoolean169 || local79 <= this.type.anInt2441) {
				local79 %= this.type.anInt2441;
			} else {
				arg2 = false;
			}
			if (!this.type.aBoolean164 && this.type.anInt2428 > local79) {
				arg2 = false;
			}
			if (this.type.aBoolean164 && local79 >= this.type.anInt2428) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt326 += (int) (((double) this.type.anInt2437 + (double) (this.type.anInt2413 - this.type.anInt2437) * Math.random()) * (double) arg0);
			if (this.anInt326 > 63) {
				@Pc(180) int local180 = this.anInt326 >> 6;
				this.anInt326 &= 63;
				if (this.aBoolean19) {
					@Pc(196) int local196 = this.anInt336 - this.anInt334;
					@Pc(202) int local202 = this.anInt324 - this.anInt319;
					@Pc(209) int local209 = this.anInt318 - this.anInt334;
					@Pc(216) int local216 = this.anInt310 - this.anInt319;
					@Pc(222) int local222 = this.anInt311 - this.anInt332;
					this.anInt330 = local216 * local196 - local209 * local202;
					@Pc(237) int local237 = this.anInt339 - this.anInt332;
					this.anInt320 = local222 * local209 - local196 * local237;
					this.anInt307 = local202 * local237 - local216 * local222;
					while (true) {
						if (this.anInt307 <= 32767 && this.anInt320 <= 32767 && this.anInt330 <= 32767 && this.anInt307 >= -32767 && this.anInt320 >= -32767 && this.anInt330 >= -32767) {
							@Pc(325) int local325 = (int) Math.sqrt((double) (this.anInt330 * this.anInt330 + this.anInt320 * this.anInt320 + this.anInt307 * this.anInt307));
							if (local325 <= 0) {
								local325 = 1;
							}
							this.anInt307 = this.anInt307 * 32767 / local325;
							this.anInt320 = this.anInt320 * 32767 / local325;
							this.anInt330 = this.anInt330 * 32767 / local325;
							if (this.type.aShort15 > 0 || this.type.aShort17 > 0) {
								@Pc(419) int local419 = (int) (Math.atan2((double) this.anInt330, (double) this.anInt307) * 2047.0D / 6.283185307179586D);
								@Pc(442) int local442 = (int) (Math.atan2((double) this.anInt320, Math.sqrt((double) (this.anInt330 * this.anInt330 + this.anInt307 * this.anInt307))) * 2047.0D / 6.283185307179586D);
								this.anInt338 = this.type.aShort15 - this.type.aShort14;
								this.anInt317 = this.type.aShort17 - this.type.aShort16;
								this.anInt340 = this.type.aShort16 + local442 - this.anInt317 / 2;
								local419 -= this.system.anInt3517;
								this.anInt323 = this.type.aShort14 + local419 - this.anInt338 / 2;
							} else if (this.system.anInt3517 != 0) {
								@Pc(387) int local387 = this.anInt330 * arg1 + this.anInt307 * arg3 >> 16;
								this.anInt330 = arg3 * this.anInt330 - this.anInt307 * arg1 >> 16;
								this.anInt307 = local387;
							}
							this.aBoolean19 = false;
							break;
						}
						this.anInt320 >>= 1;
						this.anInt330 >>= 1;
						this.anInt307 >>= 1;
					}
				}
				for (@Pc(499) int local499 = 0; local499 < local180; local499++) {
					@Pc(520) int local520;
					@Pc(517) int local517;
					@Pc(523) int local523;
					if (this.type.aShort15 <= 0 && this.type.aShort17 <= 0) {
						local517 = this.anInt320;
						local520 = this.anInt307;
						local523 = this.anInt330;
					} else {
						@Pc(535) int local535 = (int) (Math.random() * (double) this.anInt338) + this.anInt323;
						@Pc(545) int local545 = (int) (Math.random() * (double) this.anInt317) + this.anInt340;
						local545 &= 1023;
						local535 &= 2047;
						@Pc(559) int local559 = MathUtils.SINE[local545] >> 1;
						@Pc(565) int local565 = MathUtils.COSINE[local535] >> 1;
						local520 = local565 * local559 >> 15;
						@Pc(577) int local577 = MathUtils.SINE[local535] >> 1;
						local523 = local577 * local559 >> 15;
						@Pc(589) int local589 = MathUtils.COSINE[local545] >> 1;
						local517 = local589 * -1;
					}
					@Pc(598) int local598 = (int) (Math.random() * 255.0D);
					@Pc(603) int local603 = (int) (Math.random() * 255.0D);
					@Pc(612) int local612 = local598 * (255 - local603) >> 8;
					@Pc(619) int local619 = 255 - local603 - local612;
					@Pc(636) int z = local619 * this.anInt339 + local612 * this.anInt311 + this.anInt332 * local603 >> 8;
					@Pc(653) int y = local619 * this.anInt310 + this.anInt324 * local612 + this.anInt319 * local603 >> 8;
					@Pc(671) int x = local603 * this.anInt334 + local612 * this.anInt336 + local619 * this.anInt318 >> 8;
					if (this.system.anInt3517 != 0) {
						@Pc(686) int local686 = arg1 * z + x * arg3 >> 16;
						z = arg3 * z - x * arg1 >> 16;
						x = local686;
					}
					@Pc(716) int local716 = (int) (Math.random() * (double) (this.type.anInt2445 - this.type.anInt2417)) + this.type.anInt2417;
					@Pc(733) int local733 = (int) ((double) (this.type.anInt2416 - this.type.anInt2429) * Math.random()) + this.type.anInt2429;
					@Pc(795) int color;
					if (this.type.aBoolean165) {
						@Pc(799) double local799 = Math.random();
						color = (int) ((double) this.type.anInt2443 * local799 + (double) this.type.anInt2402) << 24 | (int) ((double) this.type.anInt2415 + local799 * (double) this.type.anInt2397) << 16 | (int) (local799 * (double) this.type.anInt2436 + (double) this.type.anInt2404) << 8 | (int) ((double) this.type.anInt2401 * local799 + (double) this.type.anInt2430);
					} else {
						color = (int) (Math.random() * (double) this.type.anInt2443 + (double) this.type.anInt2402) << 24 | (int) (Math.random() * (double) this.type.anInt2401 + (double) this.type.anInt2430) | (int) ((double) this.type.anInt2436 * Math.random() + (double) this.type.anInt2404) << 8 | (int) ((double) this.type.anInt2415 + Math.random() * (double) this.type.anInt2397) << 16;
					}
					if (ParticleManager.poolWriterIndex == ParticleManager.poolReaderIndex) {
						new Particle(this, this.system.x + x, this.system.y + y, this.system.z + z, local520, local517, local523, local716, local733, color);
					} else {
						@Pc(898) Particle particle = ParticleManager.pool[ParticleManager.poolReaderIndex];
						ParticleManager.poolReaderIndex = ParticleManager.poolReaderIndex + 1 & 0x3FF;
						particle.method2632(this, this.system.x + x, this.system.y + y, z + this.system.z, local520, local517, local523, local716, local733, color);
					}
				}
			}
		}
		this.particlesSize = 0;
		for (@Pc(941) Particle particle = (Particle) this.particles.head(); particle != null; particle = (Particle) this.particles.next()) {
			particle.method2629(arg4, arg0);
			this.particlesSize++;
		}
		ParticleManager.particles += this.particlesSize;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		this.anInt339 = arg8;
		this.anInt324 = arg4;
		this.anInt334 = arg2;
		this.anInt332 = arg7;
		this.anInt311 = arg6;
		this.anInt318 = arg0;
		this.anInt336 = arg5;
		this.anInt310 = arg3;
		this.anInt319 = arg1;
		@Pc(54) int local54 = this.system.y + (this.anInt319 + this.anInt324 + this.anInt310) / 3;
		@Pc(70) int local70 = this.system.x + (this.anInt336 + this.anInt334 + this.anInt318) / 3;
		@Pc(86) int local86 = (this.anInt339 + this.anInt311 + this.anInt332) / 3 + this.system.z;
		if (this.anInt309 != local70 || local54 != this.anInt312 || local86 != this.anInt316) {
			this.anInt316 = local86;
			this.aBoolean19 = true;
			this.anInt312 = local54;
			this.anInt309 = local70;
		}
	}
}

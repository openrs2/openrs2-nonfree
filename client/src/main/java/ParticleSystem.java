import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class ParticleSystem extends ParticleNode {

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "J")
	private long aLong123;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "J")
	public long aLong124;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
	public int anInt3508;

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
	public int anInt3509;

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
	public int anInt3510;

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
	public int anInt3512;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
	public int anInt3513;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
	public int anInt3514;

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
	public int anInt3515;

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
	public int anInt3517;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
	public int anInt3518;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
	public int anInt3520;

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
	public int anInt3521;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	public int anInt3499 = 0;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "Z")
	public boolean stopped = false;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!ug;")
	private ParticleLinkedList emitters = new ParticleLinkedList();

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
	private int anInt3507 = 0;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "Lclient!ll;")
	public LinkedList effectors = new LinkedList();

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
	private int anInt3522 = 0;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
	private final int width;

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
	private final int length;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "[Lclient!lm;")
	public Particle[] particles;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "J")
	private final long aLong122;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
	public ParticleSystem(@OriginalArg(0) int loop, @OriginalArg(1) int width, @OriginalArg(2) int length) {
		this.width = width;
		this.length = length;
		this.particles = new Particle[8192];
		this.aLong122 = loop;
		this.aBoolean253 = true;
		ParticleManager.systems.addTail(this);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!sk;Z[I[I[I)V")
	private void method2948(@OriginalArg(0) ModelParticleEmitter[] emitters, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static5.aBooleanArray19[local1] = false;
		}
		label79:
		for (@Pc(16) ParticleEmitter node = (ParticleEmitter) this.emitters.head(); node != null; node = (ParticleEmitter) this.emitters.next()) {
			if (emitters != null) {
				for (@Pc(22) int local22 = 0; local22 < emitters.length; local22++) {
					if (node.emitter == emitters[local22]) {
						Static5.aBooleanArray19[local22] = true;
						node.aBoolean20 = false;
						continue label79;
					}
				}
			}
			if (!arg1) {
				if (node.particlesSize == 0) {
					node.unlink();
					this.anInt3507--;
				} else {
					node.aBoolean20 = true;
				}
			}
		}
		if (emitters == null) {
			return;
		}
		for (@Pc(71) int i = 0; i < emitters.length && this.anInt3507 != 8; i++) {
			if (!Static5.aBooleanArray19[i]) {
				@Pc(94) ParticleEmitter node = new ParticleEmitter(emitters[i], this, this.aLong124);
				this.emitters.addTail(node);
				this.anInt3507++;
				Static5.aBooleanArray19[i] = true;
			}
		}
		for (@Pc(117) ParticleEmitter node = (ParticleEmitter) this.emitters.head(); node != null; node = (ParticleEmitter) this.emitters.next()) {
			for (@Pc(121) int i = 0; i < emitters.length; i++) {
				if (Static5.aBooleanArray19[i] && emitters[i] == node.emitter) {
					node.method309(arg2[node.emitter.triangleVertexC], arg3[node.emitter.triangleVertexA], arg2[node.emitter.triangleVertexA], arg3[node.emitter.triangleVertexC], arg3[node.emitter.triangleVertexB], arg2[node.emitter.triangleVertexB], arg4[node.emitter.triangleVertexB], arg4[node.emitter.triangleVertexA], arg4[node.emitter.triangleVertexC]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
	public final void method2949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.stopped) {
			return;
		}
		if (arg0 != this.anInt3517) {
			for (@Pc(13) ParticleEmitter node = (ParticleEmitter) this.emitters.head(); node != null; node = (ParticleEmitter) this.emitters.next()) {
				node.aBoolean19 = true;
			}
		}
		this.aLong123 = this.aLong124;
		this.anInt3517 = arg0;
		this.anInt3514 = arg1;
		this.anInt3518 = arg2;
		this.anInt3512 = arg3;
		this.anInt3509 = arg4;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()V")
	public final void method2952() {
		this.aBoolean253 = true;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIII)V")
	public final void method2953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.stopped || (!this.aBoolean252 || !GlRenderer.enabled)) {
			return;
		}
		@Pc(11) GL gl = GlRenderer.gl;
		@Pc(13) int local13 = Static7.anInt5281;
		@Pc(15) int local15 = Static6.anInt4375;
		@Pc(17) int local17 = Static6.anInt4400;
		Static26.method2961(local13, local15, local17);
		@Pc(31) int local31 = arg8 * arg4 - arg6 * arg3 >> 16;
		@Pc(41) int local41 = arg7 * arg1 + local31 * arg2 >> 16;
		@Pc(44) int local44 = this.method2959();
		@Pc(56) int local56 = local41 + (local44 * arg2 + arg1 * 0 >> 16);
		@Pc(73) int local73 = local41 + (-local44 * arg2 - (this.anInt3510 - this.anInt3520) * arg1 >> 16);
		@Pc(79) int local79 = local56 + 2 - local73;
		if (local79 >= 1600) {
			if (ParticleManager.DEBUG) {
				System.out.println("Model too big for particles - radixsize:" + local79 + " maxmodelsize:" + 1600);
			}
			Static26.method2962();
			return;
		}
		@Pc(104) ParticleNode sentinel = this.emitters.sentinel;
		for (@Pc(107) ParticleNode node = sentinel.next; node != sentinel; node = node.next) {
			@Pc(113) ParticleEmitter emitterNode = (ParticleEmitter) node;
			for (@Pc(115) int local115 = 0; local115 < local79; local115++) {
				Static5.anIntArray387[local115] = 0;
			}
			for (@Pc(126) int local126 = 0; local126 < 32; local126++) {
				Static5.anIntArray388[local126] = 0;
			}
			Static5.anInt3519 = 0;
			@Pc(141) ParticleNode particlesSentinel = emitterNode.particles.sentinel;
			for (@Pc(144) ParticleNode particleNode = particlesSentinel.next; particleNode != particlesSentinel; particleNode = particleNode.next) {
				@Pc(150) Particle particle = (Particle) particleNode;
				if (!particle.aBoolean228) {
					@Pc(161) int local161 = (particle.anInt3228 >> 12) - local13;
					@Pc(168) int local168 = (particle.anInt3229 >> 12) - local15;
					@Pc(175) int local175 = (particle.anInt3230 >> 12) - local17;
					local175 = local175 * arg4 - local161 * arg3 >> 16;
					@Pc(197) int local197 = (local168 * arg1 + local175 * arg2 >> 16) - local73;
					if (local197 < 0) {
						local197 = 0;
					} else if (local197 >= local79) {
						local197 = local79 - 1;
					}
					if (Static5.anIntArray387[local197] < 32) {
						Static5.aShortArrayArray3[local197][Static5.anIntArray387[local197]++] = particle.aShort21;
					} else {
						if (Static5.anIntArray387[local197] == 32) {
							if (Static5.anInt3519 == 32) {
								if (ParticleManager.DEBUG) {
									System.out.println("Overflowed model-based radix sort");
								}
								continue;
							}
							@Pc(244) int[] local244 = Static5.anIntArray387;
							local244[local197] += Static5.anInt3519++ + 1;
						}
						Static5.aShortArrayArray4[Static5.anIntArray387[local197] - 32 - 1][Static5.anIntArray388[Static5.anIntArray387[local197] - 32 - 1]++] = particle.aShort21;
					}
				}
			}
			@Pc(288) boolean local288 = false;
			if (Static5.aBoolean249 && emitterNode.type.anInt2403 != -1) {
				Static4.textureProvider.method451(emitterNode.type.anInt2403);
				local288 = true;
			} else {
				GlRenderer.setTextureId(-1);
			}
			@Pc(313) float local313 = (float) emitterNode.type.anInt2399 * Static5.aFloat86;
			if (local313 > 64.0F) {
				local313 = 64.0F;
			}
			gl.glPointSize((float) (local313 * GameShell.canvasScale));
			this.method2955(gl, local79, local288, emitterNode.type.aBoolean167);
		}
		Static26.method2962();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IZZ)V")
	public final void method2955(@OriginalArg(0) GL gl, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3 && Preferences.highDetailLighting) {
			gl.glDisable(GL.GL_LIGHTING);
		}
		Static5.aClass4_Sub10_7.position = 0;
		if (GlRenderer.bigEndian) {
			for (@Pc(15) int i = arg1 - 1; i >= 0; i--) {
				@Pc(28) int local28 = Static5.anIntArray387[i] > 32 ? 32 : Static5.anIntArray387[i];
				if (local28 > 0) {
					for (@Pc(34) int j = local28 - 1; j >= 0; j--) {
						@Pc(45) Particle particle = this.particles[Static5.aShortArrayArray3[i][j]];
						Static5.aClass4_Sub10_7.writeFloat((float) (particle.anInt3228 >> 12));
						Static5.aClass4_Sub10_7.writeFloat((float) (particle.anInt3229 >> 12));
						Static5.aClass4_Sub10_7.writeFloat((float) (particle.anInt3230 >> 12));
						@Pc(72) int local72 = particle.anInt3231;
						Static5.aClass4_Sub10_7.writeByte((byte) (local72 >> 16));
						Static5.aClass4_Sub10_7.writeByte((byte) (local72 >> 8));
						Static5.aClass4_Sub10_7.writeByte((byte) local72);
						Static5.aClass4_Sub10_7.writeByte((byte) (local72 >> 24));
					}
					if (Static5.anIntArray387[i] > 32) {
						@Pc(113) int local113 = Static5.anIntArray387[i] - 32 - 1;
						for (@Pc(119) int j = Static5.anIntArray388[local113] - 1; j >= 0; j--) {
							@Pc(130) Particle particle = this.particles[Static5.aShortArrayArray4[local113][j]];
							Static5.aClass4_Sub10_7.writeFloat((float) (particle.anInt3228 >> 12));
							Static5.aClass4_Sub10_7.writeFloat((float) (particle.anInt3229 >> 12));
							Static5.aClass4_Sub10_7.writeFloat((float) (particle.anInt3230 >> 12));
							@Pc(157) int local157 = particle.anInt3231;
							Static5.aClass4_Sub10_7.writeByte((byte) (local157 >> 16));
							Static5.aClass4_Sub10_7.writeByte((byte) (local157 >> 8));
							Static5.aClass4_Sub10_7.writeByte((byte) local157);
							Static5.aClass4_Sub10_7.writeByte((byte) (local157 >> 24));
						}
					}
				}
			}
		} else {
			for (@Pc(192) int i = arg1 - 1; i >= 0; i--) {
				@Pc(205) int local205 = Static5.anIntArray387[i] > 32 ? 32 : Static5.anIntArray387[i];
				if (local205 > 0) {
					for (@Pc(211) int j = local205 - 1; j >= 0; j--) {
						@Pc(222) Particle local222 = this.particles[Static5.aShortArrayArray3[i][j]];
						Static5.aClass4_Sub10_7.writeFloatLE((float) (local222.anInt3228 >> 12));
						Static5.aClass4_Sub10_7.writeFloatLE((float) (local222.anInt3229 >> 12));
						Static5.aClass4_Sub10_7.writeFloatLE((float) (local222.anInt3230 >> 12));
						@Pc(249) int local249 = local222.anInt3231;
						Static5.aClass4_Sub10_7.writeByte((byte) (local249 >> 16));
						Static5.aClass4_Sub10_7.writeByte((byte) (local249 >> 8));
						Static5.aClass4_Sub10_7.writeByte((byte) local249);
						Static5.aClass4_Sub10_7.writeByte((byte) (local249 >> 24));
					}
					if (Static5.anIntArray387[i] > 32) {
						@Pc(290) int local290 = Static5.anIntArray387[i] - 32 - 1;
						for (@Pc(296) int j = Static5.anIntArray388[local290] - 1; j >= 0; j--) {
							@Pc(307) Particle particle = this.particles[Static5.aShortArrayArray4[local290][j]];
							Static5.aClass4_Sub10_7.writeFloatLE((float) (particle.anInt3228 >> 12));
							Static5.aClass4_Sub10_7.writeFloatLE((float) (particle.anInt3229 >> 12));
							Static5.aClass4_Sub10_7.writeFloatLE((float) (particle.anInt3230 >> 12));
							@Pc(334) int local334 = particle.anInt3231;
							Static5.aClass4_Sub10_7.writeByte((byte) (local334 >> 16));
							Static5.aClass4_Sub10_7.writeByte((byte) (local334 >> 8));
							Static5.aClass4_Sub10_7.writeByte((byte) local334);
							Static5.aClass4_Sub10_7.writeByte((byte) (local334 >> 24));
						}
					}
				}
			}
		}
		if (Static5.aClass4_Sub10_7.position != 0) {
			if (GlRenderer.arbVboSupported) {
				gl.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			}
			if (Static5.aByteBuffer12 == null || Static5.aByteBuffer12.capacity() < Static5.aClass4_Sub10_7.position) {
				Static5.aByteBuffer12 = ByteBuffer.allocateDirect(Static5.aClass4_Sub10_7.position).order(ByteOrder.nativeOrder());
			} else {
				Static5.aByteBuffer12.clear();
			}
			Static5.aByteBuffer12.put(Static5.aClass4_Sub10_7.bytes, 0, Static5.aClass4_Sub10_7.position);
			Static5.aByteBuffer12.flip();
			Static5.aByteBuffer12.position(0);
			gl.glVertexPointer(3, GL.GL_FLOAT, 16, Static5.aByteBuffer12);
			Static5.aByteBuffer12.position(12);
			gl.glColorPointer(4, GL.GL_UNSIGNED_BYTE, 16, Static5.aByteBuffer12);
			gl.glDrawArrays(GL.GL_POINTS, 0, Static5.aClass4_Sub10_7.position >> 4);
		}
		if (!arg3 && Preferences.highDetailLighting) {
			gl.glEnable(GL.GL_LIGHTING);
		}
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "()V")
	public final void remove() {
		this.stopped = true;
		for (@Pc(8) ParticleEffector node = (ParticleEffector) this.effectors.head(); node != null; node = (ParticleEffector) this.effectors.next()) {
			if (node.effector.type.anInt907 == 1) {
				node.unlinkSecondary();
			}
		}
		this.particles = new Particle[8192];
		this.anInt3499 = 0;
		this.emitters = new ParticleLinkedList();
		this.anInt3507 = 0;
		this.effectors = new LinkedList();
		this.anInt3522 = 0;
		this.unlink();
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "()I")
	public final int method2959() {
		if (this.anInt3513 == this.anInt3521 && this.anInt3508 == this.anInt3515) {
			return 92;
		}
		@Pc(16) int local16 = this.anInt3513 << 7;
		@Pc(23) int local23 = (this.anInt3521 << 7) + 128;
		@Pc(28) int local28 = this.anInt3508 << 7;
		@Pc(35) int local35 = (this.anInt3515 << 7) + 128;
		@Pc(40) int local40 = this.anInt3518 - local16;
		@Pc(45) int local45 = local23 - this.anInt3518;
		if (local40 > local45) {
			@Pc(53) int local53 = this.anInt3509 - local28;
			@Pc(58) int local58 = local35 - this.anInt3509;
			return local53 > local58 ? (int) (Math.sqrt((double) (local40 * local40 + local53 * local53)) + 0.99D) : (int) (Math.sqrt((double) (local40 * local40 + local58 * local58)) + 0.99D);
		} else {
			@Pc(92) int local92 = this.anInt3509 - local28;
			@Pc(97) int local97 = local35 - this.anInt3509;
			return local92 > local97 ? (int) (Math.sqrt((double) (local45 * local45 + local92 * local92)) + 0.99D) : (int) (Math.sqrt((double) (local45 * local45 + local97 * local97)) + 0.99D);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	private void method2960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) ParticleEffector node = (ParticleEffector) this.effectors.head(); node != null; node = (ParticleEffector) this.effectors.next()) {
			node.anInt6095 = node.anInt6084 + this.anInt3518;
			node.anInt6089 = node.anInt6085 + this.anInt3512;
			node.anInt6087 = node.anInt6090 + this.anInt3509;
			if (this.anInt3517 == 0) {
				node.anInt6091 = node.effector.type.anInt898;
				node.anInt6088 = node.effector.type.anInt892;
			} else {
				@Pc(36) int local36 = node.effector.type.anInt898;
				@Pc(41) int local41 = node.effector.type.anInt892;
				node.anInt6091 = local41 * arg0 + local36 * arg1 >> 16;
				node.anInt6088 = local41 * arg1 - local36 * arg0 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!u;Z[I[I[I)V")
	private void method2965(@OriginalArg(0) ModelParticleEffector[] effectors, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static5.aBooleanArray18[local1] = false;
		}
		label88:
		for (@Pc(16) ParticleEffector node = (ParticleEffector) this.effectors.head(); node != null; node = (ParticleEffector) this.effectors.next()) {
			if (effectors != null) {
				for (@Pc(22) int i = 0; i < effectors.length; i++) {
					if (node.effector == effectors[i]) {
						Static5.aBooleanArray18[i] = true;
						continue label88;
					}
				}
			}
			if (!arg1) {
				node.unlink();
				this.anInt3522--;
				if (node.isSecondaryLinked()) {
					node.unlinkSecondary();
					ParticleManager.anInt3524--;
				}
			}
		}
		if (effectors == null) {
			return;
		}
		for (@Pc(72) int i = 0; i < effectors.length && this.anInt3522 != 8; i++) {
			if (!Static5.aBooleanArray18[i]) {
				@Pc(87) ParticleEffector node = null;
				if (effectors[i].type.anInt907 == 1 && ParticleManager.anInt3524 < 32) {
					node = new ParticleEffector(effectors[i], this);
					ParticleManager.aClass10_1.put((long) effectors[i].type.id, node);
					ParticleManager.anInt3524++;
				}
				if (node == null) {
					node = new ParticleEffector(effectors[i], this);
				}
				this.effectors.addTail(node);
				this.anInt3522++;
				Static5.aBooleanArray18[i] = true;
			}
		}
		for (@Pc(152) ParticleEffector node = (ParticleEffector) this.effectors.head(); node != null; node = (ParticleEffector) this.effectors.next()) {
			for (@Pc(156) int i = 0; i < effectors.length; i++) {
				if (Static5.aBooleanArray18[i] && effectors[i] == node.effector) {
					node.method4827(arg4[node.effector.vertex], arg3[node.effector.vertex], arg2[node.effector.vertex]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!sk;[Lclient!u;Z[I[I[I)V")
	public final void method2967(@OriginalArg(0) ModelParticleEmitter[] emitters, @OriginalArg(1) ModelParticleEffector[] effectors, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		if (!this.stopped) {
			this.method2948(emitters, arg2, arg3, arg4, arg5);
			this.method2965(effectors, arg2, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(J)Z")
	public final boolean redraw(@OriginalArg(0) long loop) {
		@Pc(8) long local8;
		if (this.aLong122 > this.aLong123) {
			local8 = this.aLong122;
		} else {
			local8 = this.aLong123;
		}
		@Pc(18) int local18 = (int) (this.aLong124 - local8);
		if (local18 > 750) {
			this.remove();
			return false;
		}
		if (this.aLong123 > 0L) {
			this.anInt3513 = this.anInt3518 - (this.width << 6) >> 7;
			this.anInt3521 = (this.anInt3518 + (this.width << 6) >> 7) - 1;
			this.anInt3508 = this.anInt3509 - (this.length << 6) >> 7;
			this.anInt3515 = (this.anInt3509 + (this.length << 6) >> 7) - 1;
			this.anInt3510 = this.anInt3512;
			if (this.anInt3514 < 3) {
				this.anInt3520 = SceneGraph.tileHeights[this.anInt3514 + 1][this.anInt3513][this.anInt3508] + SceneGraph.tileHeights[this.anInt3514 + 1][this.anInt3521][this.anInt3508] + SceneGraph.tileHeights[this.anInt3514 + 1][this.anInt3513][this.anInt3515] + SceneGraph.tileHeights[this.anInt3514 + 1][this.anInt3521][this.anInt3515] >> 2;
			} else {
				this.anInt3520 = this.anInt3510 - 1024;
			}
			this.aBoolean252 = true;
			@Pc(156) int local156 = MathUtils.SINE[this.anInt3517];
			@Pc(161) int local161 = MathUtils.COSINE[this.anInt3517];
			this.method2960(local156, local161);
			if (this.aBoolean253) {
				@Pc(174) ParticleEmitter node = (ParticleEmitter) this.emitters.head();
				while (true) {
					if (node == null) {
						this.aBoolean253 = false;
						break;
					}
					for (@Pc(178) int i = 0; i < node.type.anInt2418; i++) {
						node.method307(1, local156, true, local161, this.aLong124);
					}
					node = (ParticleEmitter) this.emitters.next();
				}
			}
			@Pc(210) int local210 = (int) (loop - this.aLong124);
			for (@Pc(216) ParticleEmitter node = (ParticleEmitter) this.emitters.head(); node != null; node = (ParticleEmitter) this.emitters.next()) {
				node.method307(local210, local156, local18 < 10, local161, loop);
			}
		}
		this.aLong124 = loop;
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIII)V")
	public final void method2970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2949(arg0, arg1, arg2 + Static7.anInt5281, arg3 + Static6.anInt4375, arg4 + Static6.anInt4400);
	}
}

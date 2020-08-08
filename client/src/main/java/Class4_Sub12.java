import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class4_Sub12 extends Node {

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "Lclient!lk;")
	private Class111 aClass111_2;

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "[Z")
	private boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!ih", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "Lclient!ic;")
	private Class84 aClass84_6;

	@OriginalMember(owner = "client!ih", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!ih", name = "S", descriptor = "[F")
	private float[] aFloatArray27;

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
	private int anInt2350 = 0;

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
	private int anInt2354 = 0;

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
	public int anInt2355 = 0;

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
	private int anInt2353 = 0;

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
	public int anInt2352 = 0;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
	public int anInt2357 = 0;

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
	public final int anInt2356;

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "F")
	private final float aFloat55;

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "Z")
	public final boolean aBoolean162;

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "Z")
	private final boolean aBoolean161;

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
	public final int anInt2351;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IFZZI)V")
	public Class4_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt2356 = arg0;
		this.aFloat55 = arg1;
		this.aBoolean162 = arg2;
		this.aBoolean161 = arg3;
		this.anInt2351 = arg4;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
	public final void method1866() {
		@Pc(12) Class4_Sub10 local12 = new Class4_Sub10((this.aBoolean161 ? 40 : 36) * this.anInt2357);
		for (@Pc(14) int local14 = 0; local14 < this.anInt2357; local14++) {
			if (Static3.aBoolean126) {
				local12.method4604((float) this.anIntArray203[local14]);
				local12.method4604((float) this.anIntArray207[local14]);
				local12.method4604((float) this.anIntArray205[local14]);
				local12.method4617(this.anIntArray201[local14]);
				local12.method4604(this.aFloatArray24[local14]);
				local12.method4604(this.aFloatArray26[local14]);
				local12.method4604(this.aFloatArray25[local14]);
				local12.method4604((float) this.anIntArray203[local14] / this.aFloat55);
				local12.method4604((float) this.anIntArray205[local14] / this.aFloat55);
				if (this.aBoolean161) {
					local12.method4604(this.aFloatArray27[local14]);
				}
			} else {
				local12.method4632((float) this.anIntArray203[local14]);
				local12.method4632((float) this.anIntArray207[local14]);
				local12.method4632((float) this.anIntArray205[local14]);
				local12.method4617(this.anIntArray201[local14]);
				local12.method4632(this.aFloatArray24[local14]);
				local12.method4632(this.aFloatArray26[local14]);
				local12.method4632(this.aFloatArray25[local14]);
				local12.method4632((float) this.anIntArray203[local14] / this.aFloat55);
				local12.method4632((float) this.anIntArray205[local14] / this.aFloat55);
				if (this.aBoolean161) {
					local12.method4632(this.aFloatArray27[local14]);
				}
			}
		}
		if (Static3.aBoolean135) {
			@Pc(200) ByteBuffer local200 = ByteBuffer.wrap(local12.aByteArray71, 0, local12.anInt5709);
			this.aClass111_2 = new Class111();
			this.aClass111_2.method2602(local200);
		} else {
			this.aByteBuffer6 = ByteBuffer.allocateDirect(local12.anInt5709).order(ByteOrder.nativeOrder());
			this.aByteBuffer6.put(local12.aByteArray71, 0, local12.anInt5709);
			this.aByteBuffer6.flip();
		}
		this.anIntArray203 = null;
		this.anIntArray207 = null;
		this.anIntArray205 = null;
		this.anIntArray201 = null;
		this.aFloatArray24 = null;
		this.aFloatArray26 = null;
		this.aFloatArray25 = null;
		this.aClass84_6 = null;
		this.aFloatArray27 = null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([[[Lclient!nh;FZ)V")
	public final void method1867(@OriginalArg(0) Class4_Sub19[][][] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (Static3.aClass4_Sub10_4 == null || Static3.aClass4_Sub10_4.aByteArray71.length < this.anInt2353 * 4) {
			Static3.aClass4_Sub10_4 = new Class4_Sub10(this.anInt2353 * 4);
		} else {
			Static3.aClass4_Sub10_4.anInt5709 = 0;
		}
		if (Static3.aClass4_Sub10_5 == null || Static3.aClass4_Sub10_5.aByteArray71.length < this.anInt2354 * 4) {
			Static3.aClass4_Sub10_5 = new Class4_Sub10(this.anInt2354 * 4);
		} else {
			Static3.aClass4_Sub10_5.anInt5709 = 0;
		}
		if (Static3.aBoolean126) {
			for (@Pc(47) int local47 = 0; local47 < this.anInt2350; local47++) {
				@Pc(68) Class4_Sub19 local68 = arg0[this.anIntArray202[local47]][this.anIntArray204[local47]][this.anIntArray206[local47]];
				if (local68 != null && local68.aBoolean257) {
					@Pc(78) int[] local78 = this.anIntArrayArray18[local47];
					@Pc(111) Class4_Sub10 local111;
					if (this.aBoolean162) {
						@Pc(86) int[] local86 = this.anIntArrayArray19[local47];
						if (local86 != null) {
							for (@Pc(90) int local90 = 0; local90 < local86.length; local90++) {
								Static3.aClass4_Sub10_5.method4617(local86[local90]);
							}
						}
						local111 = this.aBooleanArray10[local47] ? Static3.aClass4_Sub10_5 : Static3.aClass4_Sub10_4;
					} else {
						local111 = Static3.aClass4_Sub10_4;
					}
					for (@Pc(116) int local116 = 1; local116 < local78.length - 1; local116++) {
						local111.method4617(local78[0]);
						local111.method4617(local78[local116]);
						local111.method4617(local78[local116 + 1]);
					}
				}
			}
		} else {
			for (@Pc(149) int local149 = 0; local149 < this.anInt2350; local149++) {
				@Pc(170) Class4_Sub19 local170 = arg0[this.anIntArray202[local149]][this.anIntArray204[local149]][this.anIntArray206[local149]];
				if (local170 != null && local170.aBoolean257) {
					@Pc(180) int[] local180 = this.anIntArrayArray18[local149];
					@Pc(213) Class4_Sub10 local213;
					if (this.aBoolean162) {
						@Pc(188) int[] local188 = this.anIntArrayArray19[local149];
						if (local188 != null) {
							for (@Pc(192) int local192 = 0; local192 < local188.length; local192++) {
								Static3.aClass4_Sub10_5.method4599(local188[local192]);
							}
						}
						local213 = this.aBooleanArray10[local149] ? Static3.aClass4_Sub10_5 : Static3.aClass4_Sub10_4;
					} else {
						local213 = Static3.aClass4_Sub10_4;
					}
					for (@Pc(218) int local218 = 1; local218 < local180.length - 1; local218++) {
						local213.method4599(local180[0]);
						local213.method4599(local180[local218]);
						local213.method4599(local180[local218 + 1]);
					}
				}
			}
		}
		if (Static3.aClass4_Sub10_4.anInt5709 == 0 && Static3.aClass4_Sub10_5.anInt5709 == 0) {
			return;
		}
		@Pc(257) GL local257 = Static3.aGL1;
		if (this.anInt2356 == -1 || arg2) {
			Static17.method1600(-1);
			Static24.method2652(0, 0);
		} else {
			Static4.anInterface4_1.method451(this.anInt2356);
		}
		@Pc(282) int local282 = this.aBoolean161 ? 40 : 36;
		if (this.aClass111_2 == null) {
			if (Static3.aBoolean135) {
				local257.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			}
			this.aByteBuffer6.position(0);
			local257.glVertexPointer(3, GL.GL_FLOAT, local282, this.aByteBuffer6);
			this.aByteBuffer6.position(12);
			local257.glColorPointer(4, GL.GL_UNSIGNED_BYTE, local282, this.aByteBuffer6);
			if (Static2.aBoolean66) {
				this.aByteBuffer6.position(16);
				local257.glNormalPointer(GL.GL_FLOAT, local282, this.aByteBuffer6);
			}
			this.aByteBuffer6.position(28);
			local257.glTexCoordPointer(2, GL.GL_FLOAT, local282, this.aByteBuffer6);
			if (this.aBoolean161) {
				local257.glClientActiveTexture(Static10.method315());
				this.aByteBuffer6.position(36);
				local257.glTexCoordPointer(1, GL.GL_FLOAT, local282, this.aByteBuffer6);
				local257.glClientActiveTexture(GL.GL_TEXTURE0);
			}
		} else {
			this.aClass111_2.method2604();
			local257.glVertexPointer(3, GL.GL_FLOAT, local282, 0L);
			local257.glColorPointer(4, GL.GL_UNSIGNED_BYTE, local282, 12L);
			if (Static2.aBoolean66) {
				local257.glNormalPointer(GL.GL_FLOAT, local282, 16L);
			}
			local257.glTexCoordPointer(2, GL.GL_FLOAT, local282, 28L);
			if (this.aBoolean161) {
				local257.glClientActiveTexture(Static10.method315());
				local257.glTexCoordPointer(1, GL.GL_FLOAT, local282, 36L);
				local257.glClientActiveTexture(GL.GL_TEXTURE0);
			}
		}
		if (Static3.aBoolean135) {
			local257.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, 0);
		}
		if (Static3.aClass4_Sub10_4.anInt5709 != 0) {
			if (Static3.aByteBuffer5 == null || Static3.aByteBuffer5.capacity() < Static3.aClass4_Sub10_4.anInt5709) {
				Static3.aByteBuffer5 = ByteBuffer.allocateDirect(Static3.aClass4_Sub10_4.anInt5709).order(ByteOrder.nativeOrder());
			} else {
				Static3.aByteBuffer5.clear();
			}
			Static3.aByteBuffer5.put(Static3.aClass4_Sub10_4.aByteArray71, 0, Static3.aClass4_Sub10_4.anInt5709);
			Static3.aByteBuffer5.flip();
			Static17.method1613(arg1);
			local257.glDrawElements(GL.GL_TRIANGLES, Static3.aClass4_Sub10_4.anInt5709 / 4, GL.GL_UNSIGNED_INT, Static3.aByteBuffer5);
		}
		if (Static3.aClass4_Sub10_5.anInt5709 == 0) {
			return;
		}
		if (Static3.aByteBuffer4 == null || Static3.aByteBuffer4.capacity() < Static3.aClass4_Sub10_5.anInt5709) {
			Static3.aByteBuffer4 = ByteBuffer.allocateDirect(Static3.aClass4_Sub10_5.anInt5709).order(ByteOrder.nativeOrder());
		} else {
			Static3.aByteBuffer4.clear();
		}
		Static3.aByteBuffer4.put(Static3.aClass4_Sub10_5.aByteArray71, 0, Static3.aClass4_Sub10_5.anInt5709);
		Static3.aByteBuffer4.flip();
		Static17.method1613(arg1 - 100.0F);
		Static16.method1589();
		local257.glDrawElements(GL.GL_TRIANGLES, Static3.aClass4_Sub10_5.anInt5709 / 4, GL.GL_UNSIGNED_INT, Static3.aByteBuffer4);
		Static16.method1591();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[I[IZ)I")
	public final int method1870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean162) {
			this.anIntArrayArray19[this.anInt2350] = arg4;
			this.aBooleanArray10[this.anInt2350] = arg5;
			if (arg4 != null) {
				this.anInt2354 += arg4.length;
			}
			if (arg5) {
				this.anInt2354 += (arg3.length - 2) * 3;
			} else {
				this.anInt2353 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt2353 += (arg3.length - 2) * 3;
		}
		this.anIntArray202[this.anInt2350] = arg0;
		this.anIntArray204[this.anInt2350] = arg1;
		this.anIntArray206[this.anInt2350] = arg2;
		this.anIntArrayArray18[this.anInt2350] = arg3;
		return this.anInt2350++;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIFFFIF)I")
	public final int method1871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7) {
		@Pc(1) long local1 = 0L;
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
			@Pc(28) Class4_Sub32 local28 = (Class4_Sub32) this.aClass84_6.method1844(local1);
			if (local28 != null) {
				if (arg1 < this.anIntArray207[local28.anInt5434]) {
					this.anIntArray207[local28.anInt5434] = arg1;
				}
				return local28.anInt5434;
			}
		}
		this.anIntArray203[this.anInt2357] = arg0;
		this.anIntArray207[this.anInt2357] = arg1;
		this.anIntArray205[this.anInt2357] = arg2;
		if (this.aBoolean161) {
			this.aFloatArray27[this.anInt2357] = arg7;
		}
		this.aFloatArray24[this.anInt2357] = arg3;
		this.aFloatArray26[this.anInt2357] = arg4;
		this.aFloatArray25[this.anInt2357] = arg5;
		this.anIntArray201[this.anInt2357] = arg6;
		if (local1 != 0L) {
			this.aClass84_6.method1840(new Class4_Sub32(this.anInt2357), local1);
		}
		return this.anInt2357++;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "()V")
	public final void method1872() {
		this.anIntArray203 = new int[this.anInt2352];
		this.anIntArray207 = new int[this.anInt2352];
		this.anIntArray205 = new int[this.anInt2352];
		if (this.aBoolean161) {
			this.aFloatArray27 = new float[this.anInt2352];
		}
		this.anIntArray201 = new int[this.anInt2352];
		this.aFloatArray24 = new float[this.anInt2352];
		this.aFloatArray26 = new float[this.anInt2352];
		this.aFloatArray25 = new float[this.anInt2352];
		this.anIntArray204 = new int[this.anInt2355];
		this.anIntArray206 = new int[this.anInt2355];
		this.anIntArray202 = new int[this.anInt2355];
		this.anIntArrayArray18 = new int[this.anInt2355][];
		this.aClass84_6 = new Class84(Static24.method2595(this.anInt2352));
		if (this.aBoolean162) {
			this.anIntArrayArray19 = new int[this.anInt2355][];
			this.aBooleanArray10 = new boolean[this.anInt2355];
		}
	}
}
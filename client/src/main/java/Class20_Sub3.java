import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class20_Sub3 extends Class20 {

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
	public boolean aBoolean250 = false;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!ug;")
	private Class172 aClass172_2 = new Class172();

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
	private int anInt3507 = 0;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "Lclient!ll;")
	public LinkedList aClass112_24 = new LinkedList();

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
	private int anInt3522 = 0;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
	private final int anInt3516;

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
	private final int anInt3511;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "[Lclient!lm;")
	public Class20_Sub2_Sub1[] aClass20_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "J")
	private final long aLong122;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
	public Class20_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3516 = arg1;
		this.anInt3511 = arg2;
		this.aClass20_Sub2_Sub1Array2 = new Class20_Sub2_Sub1[8192];
		this.aLong122 = arg0;
		this.aBoolean253 = true;
		Static5.aClass172_3.method4322(this);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!sk;Z[I[I[I)V")
	private void method2948(@OriginalArg(0) Class158[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static5.aBooleanArray19[local1] = false;
		}
		label79:
		for (@Pc(16) Class20_Sub1 local16 = (Class20_Sub1) this.aClass172_2.method4320(); local16 != null; local16 = (Class20_Sub1) this.aClass172_2.method4315()) {
			if (arg0 != null) {
				for (@Pc(22) int local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass158_1 == arg0[local22]) {
						Static5.aBooleanArray19[local22] = true;
						local16.aBoolean20 = false;
						continue label79;
					}
				}
			}
			if (!arg1) {
				if (local16.anInt325 == 0) {
					local16.method2944();
					this.anInt3507--;
				} else {
					local16.aBoolean20 = true;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (@Pc(71) int local71 = 0; local71 < arg0.length && this.anInt3507 != 8; local71++) {
			if (!Static5.aBooleanArray19[local71]) {
				@Pc(94) Class20_Sub1 local94 = new Class20_Sub1(arg0[local71], this, this.aLong124);
				this.aClass172_2.method4322(local94);
				this.anInt3507++;
				Static5.aBooleanArray19[local71] = true;
			}
		}
		for (@Pc(117) Class20_Sub1 local117 = (Class20_Sub1) this.aClass172_2.method4320(); local117 != null; local117 = (Class20_Sub1) this.aClass172_2.method4315()) {
			for (@Pc(121) int local121 = 0; local121 < arg0.length; local121++) {
				if (Static5.aBooleanArray19[local121] && arg0[local121] == local117.aClass158_1) {
					local117.method309(arg2[local117.aClass158_1.anInt4864], arg3[local117.aClass158_1.anInt4869], arg2[local117.aClass158_1.anInt4869], arg3[local117.aClass158_1.anInt4864], arg3[local117.aClass158_1.anInt4868], arg2[local117.aClass158_1.anInt4868], arg4[local117.aClass158_1.anInt4868], arg4[local117.aClass158_1.anInt4869], arg4[local117.aClass158_1.anInt4864]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
	public final void method2949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aBoolean250) {
			return;
		}
		if (arg0 != this.anInt3517) {
			for (@Pc(13) Class20_Sub1 local13 = (Class20_Sub1) this.aClass172_2.method4320(); local13 != null; local13 = (Class20_Sub1) this.aClass172_2.method4315()) {
				local13.aBoolean19 = true;
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
		if (this.aBoolean250 || (!this.aBoolean252 || !Static3.aBoolean138)) {
			return;
		}
		@Pc(11) GL local11 = Static3.aGL1;
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
			if (Static5.aBoolean251) {
				System.out.println("Model too big for particles - radixsize:" + local79 + " maxmodelsize:" + 1600);
			}
			Static26.method2962();
			return;
		}
		@Pc(104) Class20 local104 = this.aClass172_2.aClass20_11;
		for (@Pc(107) Class20 local107 = local104.aClass20_9; local107 != local104; local107 = local107.aClass20_9) {
			@Pc(113) Class20_Sub1 local113 = (Class20_Sub1) local107;
			for (@Pc(115) int local115 = 0; local115 < local79; local115++) {
				Static5.anIntArray387[local115] = 0;
			}
			for (@Pc(126) int local126 = 0; local126 < 32; local126++) {
				Static5.anIntArray388[local126] = 0;
			}
			Static5.anInt3519 = 0;
			@Pc(141) Class20 local141 = local113.aClass172_1.aClass20_11;
			for (@Pc(144) Class20 local144 = local141.aClass20_9; local144 != local141; local144 = local144.aClass20_9) {
				@Pc(150) Class20_Sub2_Sub1 local150 = (Class20_Sub2_Sub1) local144;
				if (!local150.aBoolean228) {
					@Pc(161) int local161 = (local150.anInt3228 >> 12) - local13;
					@Pc(168) int local168 = (local150.anInt3229 >> 12) - local15;
					@Pc(175) int local175 = (local150.anInt3230 >> 12) - local17;
					local175 = local175 * arg4 - local161 * arg3 >> 16;
					@Pc(197) int local197 = (local168 * arg1 + local175 * arg2 >> 16) - local73;
					if (local197 < 0) {
						local197 = 0;
					} else if (local197 >= local79) {
						local197 = local79 - 1;
					}
					if (Static5.anIntArray387[local197] < 32) {
						Static5.aShortArrayArray3[local197][Static5.anIntArray387[local197]++] = local150.aShort21;
					} else {
						if (Static5.anIntArray387[local197] == 32) {
							if (Static5.anInt3519 == 32) {
								if (Static5.aBoolean251) {
									System.out.println("Overflowed model-based radix sort");
								}
								continue;
							}
							@Pc(244) int[] local244 = Static5.anIntArray387;
							local244[local197] += Static5.anInt3519++ + 1;
						}
						Static5.aShortArrayArray4[Static5.anIntArray387[local197] - 32 - 1][Static5.anIntArray388[Static5.anIntArray387[local197] - 32 - 1]++] = local150.aShort21;
					}
				}
			}
			@Pc(288) boolean local288 = false;
			if (Static5.aBoolean249 && local113.aClass89_1.anInt2403 != -1) {
				Static4.anInterface4_1.method451(local113.aClass89_1.anInt2403);
				local288 = true;
			} else {
				Static17.method1600(-1);
			}
			@Pc(313) float local313 = (float) local113.aClass89_1.anInt2399 * Static5.aFloat86;
			if (local313 > 64.0F) {
				local313 = 64.0F;
			}
			local11.glPointSize(local313);
			this.method2955(local11, local79, local288, local113.aClass89_1.aBoolean167);
		}
		Static26.method2962();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IZZ)V")
	public final void method2955(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3 && Static2.aBoolean66) {
			arg0.glDisable(GL.GL_LIGHTING);
		}
		Static5.aClass4_Sub10_7.position = 0;
		if (Static3.aBoolean126) {
			for (@Pc(15) int local15 = arg1 - 1; local15 >= 0; local15--) {
				@Pc(28) int local28 = Static5.anIntArray387[local15] > 32 ? 32 : Static5.anIntArray387[local15];
				if (local28 > 0) {
					for (@Pc(34) int local34 = local28 - 1; local34 >= 0; local34--) {
						@Pc(45) Class20_Sub2_Sub1 local45 = this.aClass20_Sub2_Sub1Array2[Static5.aShortArrayArray3[local15][local34]];
						Static5.aClass4_Sub10_7.writeFloat((float) (local45.anInt3228 >> 12));
						Static5.aClass4_Sub10_7.writeFloat((float) (local45.anInt3229 >> 12));
						Static5.aClass4_Sub10_7.writeFloat((float) (local45.anInt3230 >> 12));
						@Pc(72) int local72 = local45.anInt3231;
						Static5.aClass4_Sub10_7.writeByte((byte) (local72 >> 16));
						Static5.aClass4_Sub10_7.writeByte((byte) (local72 >> 8));
						Static5.aClass4_Sub10_7.writeByte((byte) local72);
						Static5.aClass4_Sub10_7.writeByte((byte) (local72 >> 24));
					}
					if (Static5.anIntArray387[local15] > 32) {
						@Pc(113) int local113 = Static5.anIntArray387[local15] - 32 - 1;
						for (@Pc(119) int local119 = Static5.anIntArray388[local113] - 1; local119 >= 0; local119--) {
							@Pc(130) Class20_Sub2_Sub1 local130 = this.aClass20_Sub2_Sub1Array2[Static5.aShortArrayArray4[local113][local119]];
							Static5.aClass4_Sub10_7.writeFloat((float) (local130.anInt3228 >> 12));
							Static5.aClass4_Sub10_7.writeFloat((float) (local130.anInt3229 >> 12));
							Static5.aClass4_Sub10_7.writeFloat((float) (local130.anInt3230 >> 12));
							@Pc(157) int local157 = local130.anInt3231;
							Static5.aClass4_Sub10_7.writeByte((byte) (local157 >> 16));
							Static5.aClass4_Sub10_7.writeByte((byte) (local157 >> 8));
							Static5.aClass4_Sub10_7.writeByte((byte) local157);
							Static5.aClass4_Sub10_7.writeByte((byte) (local157 >> 24));
						}
					}
				}
			}
		} else {
			for (@Pc(192) int local192 = arg1 - 1; local192 >= 0; local192--) {
				@Pc(205) int local205 = Static5.anIntArray387[local192] > 32 ? 32 : Static5.anIntArray387[local192];
				if (local205 > 0) {
					for (@Pc(211) int local211 = local205 - 1; local211 >= 0; local211--) {
						@Pc(222) Class20_Sub2_Sub1 local222 = this.aClass20_Sub2_Sub1Array2[Static5.aShortArrayArray3[local192][local211]];
						Static5.aClass4_Sub10_7.writeFloatLE((float) (local222.anInt3228 >> 12));
						Static5.aClass4_Sub10_7.writeFloatLE((float) (local222.anInt3229 >> 12));
						Static5.aClass4_Sub10_7.writeFloatLE((float) (local222.anInt3230 >> 12));
						@Pc(249) int local249 = local222.anInt3231;
						Static5.aClass4_Sub10_7.writeByte((byte) (local249 >> 16));
						Static5.aClass4_Sub10_7.writeByte((byte) (local249 >> 8));
						Static5.aClass4_Sub10_7.writeByte((byte) local249);
						Static5.aClass4_Sub10_7.writeByte((byte) (local249 >> 24));
					}
					if (Static5.anIntArray387[local192] > 32) {
						@Pc(290) int local290 = Static5.anIntArray387[local192] - 32 - 1;
						for (@Pc(296) int local296 = Static5.anIntArray388[local290] - 1; local296 >= 0; local296--) {
							@Pc(307) Class20_Sub2_Sub1 local307 = this.aClass20_Sub2_Sub1Array2[Static5.aShortArrayArray4[local290][local296]];
							Static5.aClass4_Sub10_7.writeFloatLE((float) (local307.anInt3228 >> 12));
							Static5.aClass4_Sub10_7.writeFloatLE((float) (local307.anInt3229 >> 12));
							Static5.aClass4_Sub10_7.writeFloatLE((float) (local307.anInt3230 >> 12));
							@Pc(334) int local334 = local307.anInt3231;
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
			if (Static3.aBoolean135) {
				arg0.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			}
			if (Static5.aByteBuffer12 == null || Static5.aByteBuffer12.capacity() < Static5.aClass4_Sub10_7.position) {
				Static5.aByteBuffer12 = ByteBuffer.allocateDirect(Static5.aClass4_Sub10_7.position).order(ByteOrder.nativeOrder());
			} else {
				Static5.aByteBuffer12.clear();
			}
			Static5.aByteBuffer12.put(Static5.aClass4_Sub10_7.bytes, 0, Static5.aClass4_Sub10_7.position);
			Static5.aByteBuffer12.flip();
			Static5.aByteBuffer12.position(0);
			arg0.glVertexPointer(3, GL.GL_FLOAT, 16, Static5.aByteBuffer12);
			Static5.aByteBuffer12.position(12);
			arg0.glColorPointer(4, GL.GL_UNSIGNED_BYTE, 16, Static5.aByteBuffer12);
			arg0.glDrawArrays(GL.GL_POINTS, 0, Static5.aClass4_Sub10_7.position >> 4);
		}
		if (!arg3 && Static2.aBoolean66) {
			arg0.glEnable(GL.GL_LIGHTING);
		}
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "()V")
	public final void method2958() {
		this.aBoolean250 = true;
		for (@Pc(8) Class4_Sub3_Sub24 local8 = (Class4_Sub3_Sub24) this.aClass112_24.head(); local8 != null; local8 = (Class4_Sub3_Sub24) this.aClass112_24.next()) {
			if (local8.aClass167_1.aClass37_1.anInt907 == 1) {
				local8.method4819();
			}
		}
		this.aClass20_Sub2_Sub1Array2 = new Class20_Sub2_Sub1[8192];
		this.anInt3499 = 0;
		this.aClass172_2 = new Class172();
		this.anInt3507 = 0;
		this.aClass112_24 = new LinkedList();
		this.anInt3522 = 0;
		this.method2944();
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
		for (@Pc(5) Class4_Sub3_Sub24 local5 = (Class4_Sub3_Sub24) this.aClass112_24.head(); local5 != null; local5 = (Class4_Sub3_Sub24) this.aClass112_24.next()) {
			local5.anInt6095 = local5.anInt6084 + this.anInt3518;
			local5.anInt6089 = local5.anInt6085 + this.anInt3512;
			local5.anInt6087 = local5.anInt6090 + this.anInt3509;
			if (this.anInt3517 == 0) {
				local5.anInt6091 = local5.aClass167_1.aClass37_1.anInt898;
				local5.anInt6088 = local5.aClass167_1.aClass37_1.anInt892;
			} else {
				@Pc(36) int local36 = local5.aClass167_1.aClass37_1.anInt898;
				@Pc(41) int local41 = local5.aClass167_1.aClass37_1.anInt892;
				local5.anInt6091 = local41 * arg0 + local36 * arg1 >> 16;
				local5.anInt6088 = local41 * arg1 - local36 * arg0 >> 16;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!u;Z[I[I[I)V")
	private void method2965(@OriginalArg(0) Class167[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static5.aBooleanArray18[local1] = false;
		}
		label88:
		for (@Pc(16) Class4_Sub3_Sub24 local16 = (Class4_Sub3_Sub24) this.aClass112_24.head(); local16 != null; local16 = (Class4_Sub3_Sub24) this.aClass112_24.next()) {
			if (arg0 != null) {
				for (@Pc(22) int local22 = 0; local22 < arg0.length; local22++) {
					if (local16.aClass167_1 == arg0[local22]) {
						Static5.aBooleanArray18[local22] = true;
						continue label88;
					}
				}
			}
			if (!arg1) {
				local16.unlink();
				this.anInt3522--;
				if (local16.method4821()) {
					local16.method4819();
					Static5.anInt3524--;
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		for (@Pc(72) int local72 = 0; local72 < arg0.length && this.anInt3522 != 8; local72++) {
			if (!Static5.aBooleanArray18[local72]) {
				@Pc(87) Class4_Sub3_Sub24 local87 = null;
				if (arg0[local72].aClass37_1.anInt907 == 1 && Static5.anInt3524 < 32) {
					local87 = new Class4_Sub3_Sub24(arg0[local72], this);
					Static5.aClass10_1.method119((long) arg0[local72].aClass37_1.anInt900, local87);
					Static5.anInt3524++;
				}
				if (local87 == null) {
					local87 = new Class4_Sub3_Sub24(arg0[local72], this);
				}
				this.aClass112_24.addTail(local87);
				this.anInt3522++;
				Static5.aBooleanArray18[local72] = true;
			}
		}
		for (@Pc(152) Class4_Sub3_Sub24 local152 = (Class4_Sub3_Sub24) this.aClass112_24.head(); local152 != null; local152 = (Class4_Sub3_Sub24) this.aClass112_24.next()) {
			for (@Pc(156) int local156 = 0; local156 < arg0.length; local156++) {
				if (Static5.aBooleanArray18[local156] && arg0[local156] == local152.aClass167_1) {
					local152.method4827(arg4[local152.aClass167_1.anInt5232], arg3[local152.aClass167_1.anInt5232], arg2[local152.aClass167_1.anInt5232]);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!sk;[Lclient!u;Z[I[I[I)V")
	public final void method2967(@OriginalArg(0) Class158[] arg0, @OriginalArg(1) Class167[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		if (!this.aBoolean250) {
			this.method2948(arg0, arg2, arg3, arg4, arg5);
			this.method2965(arg1, arg2, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(J)Z")
	public final boolean method2968(@OriginalArg(0) long arg0) {
		@Pc(8) long local8;
		if (this.aLong122 > this.aLong123) {
			local8 = this.aLong122;
		} else {
			local8 = this.aLong123;
		}
		@Pc(18) int local18 = (int) (this.aLong124 - local8);
		if (local18 > 750) {
			this.method2958();
			return false;
		}
		if (this.aLong123 > 0L) {
			this.anInt3513 = this.anInt3518 - (this.anInt3516 << 6) >> 7;
			this.anInt3521 = (this.anInt3518 + (this.anInt3516 << 6) >> 7) - 1;
			this.anInt3508 = this.anInt3509 - (this.anInt3511 << 6) >> 7;
			this.anInt3515 = (this.anInt3509 + (this.anInt3511 << 6) >> 7) - 1;
			this.anInt3510 = this.anInt3512;
			if (this.anInt3514 < 3) {
				this.anInt3520 = Static6.anIntArrayArrayArray13[this.anInt3514 + 1][this.anInt3513][this.anInt3508] + Static6.anIntArrayArrayArray13[this.anInt3514 + 1][this.anInt3521][this.anInt3508] + Static6.anIntArrayArrayArray13[this.anInt3514 + 1][this.anInt3513][this.anInt3515] + Static6.anIntArrayArrayArray13[this.anInt3514 + 1][this.anInt3521][this.anInt3515] >> 2;
			} else {
				this.anInt3520 = this.anInt3510 - 1024;
			}
			this.aBoolean252 = true;
			@Pc(156) int local156 = Class109.anIntArray299[this.anInt3517];
			@Pc(161) int local161 = Class109.anIntArray298[this.anInt3517];
			this.method2960(local156, local161);
			if (this.aBoolean253) {
				@Pc(174) Class20_Sub1 local174 = (Class20_Sub1) this.aClass172_2.method4320();
				while (true) {
					if (local174 == null) {
						this.aBoolean253 = false;
						break;
					}
					for (@Pc(178) int local178 = 0; local178 < local174.aClass89_1.anInt2418; local178++) {
						local174.method307(1, local156, true, local161, this.aLong124);
					}
					local174 = (Class20_Sub1) this.aClass172_2.method4315();
				}
			}
			@Pc(210) int local210 = (int) (arg0 - this.aLong124);
			for (@Pc(216) Class20_Sub1 local216 = (Class20_Sub1) this.aClass172_2.method4320(); local216 != null; local216 = (Class20_Sub1) this.aClass172_2.method4315()) {
				local216.method307(local210, local156, local18 < 10, local161, arg0);
			}
		}
		this.aLong124 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIII)V")
	public final void method2970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2949(arg0, arg1, arg2 + Static7.anInt5281, arg3 + Static6.anInt4375, arg4 + Static6.anInt4400);
	}
}

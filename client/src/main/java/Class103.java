import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class103 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!lk;")
	private Class111 aClass111_3;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!lk;")
	private Class111 aClass111_4;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private int anInt2807 = -1;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
	public boolean aBoolean197 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private final int anInt2806;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class103() {
		@Pc(9) GL local9 = Static3.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt2806 = local12[0];
		Static4.anInt3330 += 16384;
		Static17.method1600(this.anInt2806);
		local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
		local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!fe;II)Z")
	public final boolean method2236(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray15;
		@Pc(5) int local5 = arg0.anInt3408;
		@Pc(19) int local19 = arg1 * 128 + (arg2 * 128 + 1) * local5 + 1;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = -128; local23 < 0; local23++) {
			local21 = (local21 << 8) - local21;
			for (@Pc(33) int local33 = -128; local33 < 0; local33++) {
				if (local2[local19++] != 0) {
					local21++;
				}
			}
			local19 += local5 - 128;
		}
		if (local21 == this.anInt2807) {
			return false;
		}
		this.anInt2807 = local21;
		@Pc(74) int local74 = arg1 * 128 + (arg2 * 128 + 1) * local5 + 1;
		@Pc(76) int local76 = 0;
		for (@Pc(78) int local78 = -128; local78 < 0; local78++) {
			for (@Pc(82) int local82 = -128; local82 < 0; local82++) {
				if (local2[local74] == 0) {
					@Pc(96) int local96 = 0;
					if (local2[local74 - 1] != 0) {
						local96++;
					}
					if (local2[local74 + 1] != 0) {
						local96++;
					}
					if (local2[local74 - local5] != 0) {
						local96++;
					}
					if (local2[local74 + local5] != 0) {
						local96++;
					}
					Static4.aByteArray21[local76++] = (byte) (local96 * 17);
				} else {
					Static4.aByteArray21[local76++] = 68;
				}
				local74++;
			}
			local74 += local5 - 128;
		}
		@Pc(145) GL local145 = Static3.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static4.aByteArray21);
		local148.limit(16384);
		Static17.method1600(this.anInt2806);
		local145.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_ALPHA, 128, 128, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, local148);
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	public final void method2237() {
		@Pc(1) GL local1 = Static3.aGL1;
		Static17.method1600(this.anInt2806);
		if (this.aClass111_4 == null) {
			if (Static3.aBoolean135) {
				local1.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			}
			local1.glInterleavedArrays(GL.GL_T2F_V3F, 20, this.aByteBuffer7);
			Static3.aBoolean136 = false;
		} else {
			this.aClass111_4.method2604();
			local1.glInterleavedArrays(GL.GL_T2F_V3F, 20, 0L);
			Static3.aBoolean136 = false;
		}
		if (this.aClass111_3 == null) {
			if (Static3.aBoolean135) {
				local1.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, 0);
			}
			local1.glDrawElements(GL.GL_TRIANGLES, 384, GL.GL_UNSIGNED_INT, this.aByteBuffer8);
		} else {
			this.aClass111_3.method2603();
			local1.glDrawElements(GL.GL_TRIANGLES, 384, GL.GL_UNSIGNED_INT, 0L);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([[III)V")
	public final void method2238(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class4_Sub10 local4 = new Class4_Sub10(1620);
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (@Pc(11) int local11 = 0; local11 <= 8; local11++) {
				if (Static3.aBoolean126) {
					local4.method4604((float) local11 / 8.0F);
					local4.method4604((float) local6 / 8.0F);
					local4.method4604((float) (local11 * 128));
					local4.method4604((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method4604((float) (local6 * 128));
				} else {
					local4.method4632((float) local11 / 8.0F);
					local4.method4632((float) local6 / 8.0F);
					local4.method4632((float) (local11 * 128));
					local4.method4632((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method4632((float) (local6 * 128));
				}
			}
		}
		if (Static3.aBoolean135) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray71, 0, local4.anInt5709);
			this.aClass111_4 = new Class111();
			this.aClass111_4.method2602(local112);
		} else {
			this.aByteBuffer7 = ByteBuffer.allocateDirect(local4.anInt5709).order(ByteOrder.nativeOrder());
			this.aByteBuffer7.put(local4.aByteArray71, 0, local4.anInt5709);
			this.aByteBuffer7.flip();
		}
		@Pc(147) Class4_Sub10 local147 = new Class4_Sub10(1536);
		for (@Pc(149) int local149 = 0; local149 < 8; local149++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static3.aBoolean126) {
					local147.method4617(local154 + (local149 + 1) * 9);
					local147.method4617(local154 + local149 * 9);
					local147.method4617(local154 + local149 * 9 + 1);
					local147.method4617(local154 + (local149 + 1) * 9);
					local147.method4617(local154 + local149 * 9 + 1);
					local147.method4617(local154 + (local149 + 1) * 9 + 1);
				} else {
					local147.method4599(local154 + (local149 + 1) * 9);
					local147.method4599(local154 + local149 * 9);
					local147.method4599(local154 + local149 * 9 + 1);
					local147.method4599(local154 + (local149 + 1) * 9);
					local147.method4599(local154 + local149 * 9 + 1);
					local147.method4599(local154 + (local149 + 1) * 9 + 1);
				}
			}
		}
		if (Static3.aBoolean135) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray71, 0, local147.anInt5709);
			this.aClass111_3 = new Class111();
			this.aClass111_3.method2601(local293);
		} else {
			this.aByteBuffer8 = ByteBuffer.allocateDirect(local147.anInt5709).order(ByteOrder.nativeOrder());
			this.aByteBuffer8.put(local147.aByteArray71, 0, local147.anInt5709);
			this.aByteBuffer8.flip();
		}
	}
}
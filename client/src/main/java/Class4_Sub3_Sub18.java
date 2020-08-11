import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class4_Sub3_Sub18 extends SecondaryNode {

	@OriginalMember(owner = "client!so", name = "A", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!so", name = "H", descriptor = "I")
	private int anInt4971;

	@OriginalMember(owner = "client!so", name = "I", descriptor = "I")
	private int anInt4972;

	@OriginalMember(owner = "client!so", name = "O", descriptor = "F")
	private float aFloat131;

	@OriginalMember(owner = "client!so", name = "M", descriptor = "I")
	private int anInt4973 = 0;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "I")
	private int anInt4966 = -1;

	@OriginalMember(owner = "client!so", name = "L", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!so", name = "J", descriptor = "Lclient!ln;")
	public final Class4_Sub3_Sub15 aClass4_Sub3_Sub15_1;

	@OriginalMember(owner = "client!so", name = "N", descriptor = "Z")
	private final boolean aBoolean345;

	@OriginalMember(owner = "client!so", name = "y", descriptor = "Z")
	private final boolean aBoolean341;

	@OriginalMember(owner = "client!so", name = "P", descriptor = "Z")
	private final boolean aBoolean346;

	@OriginalMember(owner = "client!so", name = "F", descriptor = "Z")
	private final boolean aBoolean342;

	@OriginalMember(owner = "client!so", name = "C", descriptor = "I")
	private final int anInt4968;

	@OriginalMember(owner = "client!so", name = "G", descriptor = "I")
	private final int anInt4970;

	@OriginalMember(owner = "client!so", name = "K", descriptor = "Z")
	private final boolean aBoolean343;

	@OriginalMember(owner = "client!so", name = "E", descriptor = "I")
	private final int anInt4969;

	@OriginalMember(owner = "client!so", name = "B", descriptor = "I")
	private final int anInt4967;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class4_Sub3_Sub18(@OriginalArg(0) Buffer arg0) {
		this.aClass4_Sub3_Sub15_1 = new Class4_Sub3_Sub15(arg0);
		this.aBoolean345 = arg0.readUnsignedByte() == 1;
		this.aBoolean341 = arg0.readUnsignedByte() == 1;
		this.aBoolean346 = arg0.readUnsignedByte() == 1;
		this.aBoolean342 = arg0.readUnsignedByte() == 1;
		@Pc(62) int local62 = arg0.readUnsignedByte() & 0x3;
		this.anInt4968 = arg0.readByte();
		this.anInt4970 = arg0.readByte();
		@Pc(76) int local76 = arg0.readUnsignedByte();
		arg0.readUnsignedByte();
		this.aBoolean343 = arg0.readUnsignedByte() == 1;
		this.anInt4969 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt4967 = 2;
		} else if (local62 == 2) {
			this.anInt4967 = 3;
		} else if (local62 == 3) {
			this.anInt4967 = 4;
		} else {
			this.anInt4967 = 0;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;Z)[I")
	public final int[] method4071(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass4_Sub3_Sub15_1.method2649(arg0, arg1)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass4_Sub3_Sub15_1.method2653(1.0D, this.aBoolean341, arg1, arg0, local14, false, local14);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;FZ)[I")
	public final int[] method4073(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray538 == null || this.aFloat131 != arg2) {
			if (!this.aClass4_Sub3_Sub15_1.method2649(arg0, arg1)) {
				return null;
			}
			this.anInt4971 = arg3 ? 64 : 128;
			this.anIntArray538 = this.aClass4_Sub3_Sub15_1.method2653((double) arg2, this.aBoolean341, arg1, arg0, this.anInt4971, true, this.anInt4971);
			this.aFloat131 = arg2;
			if (this.aBoolean345) {
				@Pc(50) int[] local50 = new int[this.anInt4971];
				@Pc(54) int[] local54 = new int[this.anInt4971];
				@Pc(58) int[] local58 = new int[this.anInt4971];
				@Pc(65) int[] local65 = new int[this.anInt4971 * this.anInt4971];
				@Pc(68) int local68 = this.anInt4971;
				@Pc(71) int local71 = this.anInt4971;
				@Pc(75) int local75 = local68 - 1;
				@Pc(79) int local79 = local71 - 1;
				@Pc(83) int local83 = local68 * local71;
				@Pc(88) int local88;
				@Pc(89) int local89 = local88 = local68;
				for (@Pc(91) int local91 = 2; local91 >= 0; local91--) {
					for (@Pc(95) int local95 = local75; local95 >= 0; local95--) {
						local88--;
						@Pc(103) int local103 = this.anIntArray538[local88];
						local50[local95] += local103 >> 16 & 0xFF;
						local54[local95] += local103 >> 8 & 0xFF;
						local58[local95] += local103 & 0xFF;
					}
					if (local88 == 0) {
						local88 = local83;
					}
				}
				@Pc(144) int local144 = local83;
				for (@Pc(146) int local146 = local79; local146 >= 0; local146--) {
					@Pc(150) int local150 = 1;
					@Pc(152) int local152 = 1;
					@Pc(155) int local155 = 0;
					@Pc(157) int local157 = 0;
					@Pc(158) int local158 = 0;
					for (@Pc(160) int local160 = 2; local160 >= 0; local160--) {
						local152--;
						local158 += local50[local152];
						local155 += local54[local152];
						local157 += local58[local152];
						if (local152 == 0) {
							local152 = local68;
						}
					}
					for (@Pc(189) int local189 = local75; local189 >= 0; local189--) {
						local152--;
						local150--;
						@Pc(197) int local197 = local158 / 9;
						@Pc(201) int local201 = local155 / 9;
						@Pc(205) int local205 = local157 / 9;
						local144--;
						local65[local144] = local197 << 16 | local201 << 8 | local205;
						local158 += local50[local152] - local50[local150];
						local157 += local58[local152] - local58[local150];
						local155 += local54[local152] - local54[local150];
						if (local152 == 0) {
							local152 = local68;
						}
						if (local150 == 0) {
							local150 = local68;
						}
					}
					for (@Pc(260) int local260 = local75; local260 >= 0; local260--) {
						local88--;
						@Pc(268) int local268 = this.anIntArray538[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray538[local89];
						local50[local260] += (local268 >> 16 & 0xFF) - (local274 >> 16 & 0xFF);
						local54[local260] += (local268 >> 8 & 0xFF) - (local274 >> 8 & 0xFF);
						local58[local260] += (local268 & 0xFF) - (local274 & 0xFF);
					}
					if (local88 == 0) {
						local88 = local83;
					}
					if (local89 == 0) {
						local89 = local83;
					}
				}
				this.anIntArray538 = local65;
			}
		}
		return this.anIntArray538;
	}

	@OriginalMember(owner = "client!so", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.anInt4966 != -1) {
			Static25.method2720(this.anInt4966, this.anInt4973, this.anInt4972);
			this.anInt4966 = -1;
			this.anInt4973 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V")
	public final void method4074(@OriginalArg(0) int arg0) {
		if (this.anIntArray538 == null || this.anInt4970 == 0 && this.anInt4968 == 0) {
			return;
		}
		if (Static6.anIntArray539 == null || Static6.anIntArray539.length < this.anIntArray538.length) {
			Static6.anIntArray539 = new int[this.anIntArray538.length];
		}
		@Pc(26) int local26 = this.anIntArray538.length;
		@Pc(31) int local31 = arg0 * this.anInt4968;
		@Pc(36) int local36 = this.anInt4971 - 1;
		@Pc(44) int local44 = this.anInt4971 * arg0 * this.anInt4970;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt4971) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt4971; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static6.anIntArray539[local69] = this.anIntArray538[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray538;
		this.anIntArray538 = Static6.anIntArray539;
		Static6.anIntArray539 = local95;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;)Z")
	public final boolean method4076(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Js5 arg1) {
		return this.aClass4_Sub3_Sub15_1.method2649(arg0, arg1);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;I)Z")
	public final boolean method4077(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass4_Sub3_Sub15_1.method2649(arg0, arg1)) {
			return false;
		}
		@Pc(10) GL local10 = Static3.aGL1;
		@Pc(13) int local13 = Static15.method1323();
		if ((local13 & 0x1) == 0) {
			if (this.anInt4966 != -1 && this.anInt4971 == arg2) {
				Static17.method1600(this.anInt4966);
			} else {
				if (this.anInt4966 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt4966 = local32[0];
					this.anInt4972 = Static4.anInt3332;
				}
				Static17.method1600(this.anInt4966);
				if (this.aBoolean343 && Static13.method881()) {
					@Pc(64) float[] local64 = this.aClass4_Sub3_Sub15_1.method2648(arg2, this.aBoolean341, arg0, arg1, arg2);
					if (this.anInt4969 == 2) {
						Static33.method4070(Static6.anInt5133, Static6.anInt5139, arg2, arg2, Static6.anInt5136, Static6.anInt5146, local64);
						local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR_MIPMAP_LINEAR);
						local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						Static4.anInt3330 += local64.length * 4 / 3 - this.anInt4973;
						this.anInt4973 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA16F, arg2, arg2, GL.GL_POINTS, GL.GL_RGBA, GL.GL_FLOAT, FloatBuffer.wrap(local64));
						local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
						local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						Static4.anInt3330 += local64.length - this.anInt4973;
						this.anInt4973 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static3.aBoolean126 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass4_Sub3_Sub15_1.method2646(arg2, arg2, arg1, 0.7D, arg0, this.aBoolean341);
					if (this.anInt4969 == 2) {
						Static33.method4072(Static6.anInt5133, Static6.anInt5136, arg2, arg2, Static6.anInt5137, local148, local160);
						local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR_MIPMAP_LINEAR);
						local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						Static4.anInt3330 += local160.length * 4 / 3 - this.anInt4973;
						this.anInt4973 = local160.length * 4 / 3;
					} else if (this.anInt4969 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(GL.GL_TEXTURE_2D, local209++, GL.GL_RGBA, arg2, arg2, GL.GL_POINTS, GL.GL_BGRA, local148, IntBuffer.wrap(local160));
							arg2 >>= 1;
							if (arg2 == 0) {
								local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR_MIPMAP_LINEAR);
								local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
								Static4.anInt3330 += local160.length * 4 / 3 - this.anInt4973;
								this.anInt4973 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass4_Sub3_Sub15_1.method2646(arg2, arg2, arg1, 0.7D, arg0, this.aBoolean341);
						}
					} else {
						local10.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, arg2, arg2, GL.GL_POINTS, GL.GL_BGRA, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
						local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
						Static4.anInt3330 += local160.length - this.anInt4973;
						this.anInt4973 = local160.length;
					}
				}
				local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, this.aBoolean346 ? GL.GL_REPEAT : GL.GL_CLAMP_TO_EDGE);
				local10.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_T, this.aBoolean342 ? GL.GL_REPEAT : GL.GL_CLAMP_TO_EDGE);
				this.anInt4971 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static17.method1597(this.anInt4967);
		}
		if ((local13 & 0x4) == 0) {
			Static17.method1607(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt4970 == 0 && this.anInt4968 == 0) {
				Static16.method1595();
			} else {
				@Pc(367) float local367 = (float) (Static3.anInt2085 * this.anInt4970) / (float) this.anInt4971;
				@Pc(377) float local377 = (float) (Static3.anInt2085 * this.anInt4968) / (float) this.anInt4971;
				Static17.method1609(local377, local367, 0.0F);
			}
		}
		return true;
	}
}

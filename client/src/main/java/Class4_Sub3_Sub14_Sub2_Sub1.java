import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class4_Sub3_Sub14_Sub2_Sub1 extends Class4_Sub3_Sub14_Sub2 {

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!vn;)V")
	public Class4_Sub3_Sub14_Sub2_Sub1(@OriginalArg(0) Class4_Sub3_Sub14_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIII[I)V")
	public Class4_Sub3_Sub14_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([I)V")
	@Override
	protected final void method4515(@OriginalArg(0) int[] arg0) {
		this.anInt5617 = Static24.method2595(this.anInt5609);
		this.anInt5620 = Static24.method2595(this.anInt5608);
		@Pc(20) byte[] local20 = new byte[this.anInt5617 * this.anInt5620 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(32) int local32 = (this.anInt5617 - this.anInt5609) * 4;
		for (@Pc(34) int local34 = 0; local34 < this.anInt5608; local34++) {
			for (@Pc(40) int local40 = 0; local40 < this.anInt5609; local40++) {
				@Pc(49) int local49 = arg0[local24++];
				if (local49 == 0) {
					local22 += 4;
				} else {
					@Pc(54) int local54 = local22 + 1;
					local20[local22] = (byte) (local49 >> 16);
					local20[local54++] = (byte) (local49 >> 8);
					local20[local54++] = (byte) local49;
					local22 = local54 + 1;
					local20[local54] = (byte) (local49 >> 24);
				}
			}
			local22 += local32;
		}
		@Pc(94) ByteBuffer local94 = ByteBuffer.wrap(local20);
		@Pc(96) GL local96 = Static3.aGL1;
		if (this.anInt5614 == -1) {
			@Pc(103) int[] local103 = new int[1];
			local96.glGenTextures(1, local103, 0);
			this.anInt5614 = local103[0];
		}
		Static17.method1600(this.anInt5614);
		local96.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, this.anInt5617, this.anInt5620, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, local94);
		Static4.anInt3333 += local94.limit() - this.anInt5619;
		this.anInt5619 = local94.limit();
	}
}
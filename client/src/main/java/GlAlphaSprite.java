import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class GlAlphaSprite extends GlSprite {

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!vn;)V")
	public GlAlphaSprite(@OriginalArg(0) SoftwareSprite sprite) {
		super(sprite);
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIII[I)V")
	public GlAlphaSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([I)V")
	@Override
	protected final void method4515(@OriginalArg(0) int[] arg0) {
		this.anInt5617 = IntUtils.clp2(this.width);
		this.anInt5620 = IntUtils.clp2(this.height);
		@Pc(20) byte[] local20 = new byte[this.anInt5617 * this.anInt5620 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(32) int local32 = (this.anInt5617 - this.width) * 4;
		for (@Pc(34) int y = 0; y < this.height; y++) {
			for (@Pc(40) int x = 0; x < this.width; x++) {
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
		@Pc(96) GL gl = GlRenderer.gl;
		if (this.textureId == -1) {
			@Pc(103) int[] temp = new int[1];
			gl.glGenTextures(1, temp, 0);
			this.textureId = temp[0];
		}
		GlRenderer.setTextureId(this.textureId);
		gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, this.anInt5617, this.anInt5620, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, local94);
		GlCleaner.onCard2d += local94.limit() - this.size;
		this.size = local94.limit();
	}
}

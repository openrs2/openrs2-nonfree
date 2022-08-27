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
	public GlAlphaSprite(@OriginalArg(0) int innerWidth, @OriginalArg(1) int innerHeight, @OriginalArg(2) int xOffset, @OriginalArg(3) int yOffset, @OriginalArg(4) int width, @OriginalArg(5) int height, @OriginalArg(6) int[] pixels) {
		super(innerWidth, innerHeight, xOffset, yOffset, width, height, pixels);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([I)V")
	@Override
	protected void setPixels(@OriginalArg(0) int[] src) {
		this.powerOfTwoWidth = IntUtils.clp2(this.width);
		this.powerOfTwoHeight = IntUtils.clp2(this.height);
		@Pc(20) byte[] dest = new byte[this.powerOfTwoWidth * this.powerOfTwoHeight * 4];
		@Pc(22) int destOff = 0;
		@Pc(24) int srcOff = 0;
		@Pc(32) int destStride = (this.powerOfTwoWidth - this.width) * 4;
		for (@Pc(34) int y = 0; y < this.height; y++) {
			for (@Pc(40) int x = 0; x < this.width; x++) {
				@Pc(49) int color = src[srcOff++];
				if (color == 0) {
					destOff += 4;
				} else {
					@Pc(54) int destOff2 = destOff + 1;
					dest[destOff] = (byte) (color >> 16);
					dest[destOff2++] = (byte) (color >> 8);
					dest[destOff2++] = (byte) color;
					destOff = destOff2 + 1;
					dest[destOff2] = (byte) (color >> 24);
				}
			}
			destOff += destStride;
		}
		@Pc(94) ByteBuffer buffer = ByteBuffer.wrap(dest);
		@Pc(96) GL gl = GlRenderer.gl;
		if (this.textureId == -1) {
			@Pc(103) int[] temp = new int[1];
			gl.glGenTextures(1, temp, 0);
			this.textureId = temp[0];
		}
		GlRenderer.setTextureId(this.textureId);
		gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, this.powerOfTwoWidth, this.powerOfTwoHeight, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, buffer);
		GlCleaner.onCard2d += buffer.limit() - this.size;
		this.size = buffer.limit();
	}
}

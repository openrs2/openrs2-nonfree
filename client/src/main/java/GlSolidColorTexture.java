import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class GlSolidColorTexture extends SecondaryNode {

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "[I")
	public static final int[] BIT_MASKS = new int[32];

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
	private int textureSize = 0;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
	private int textureId = -1;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
	private final int contextId;

	static {
		@Pc(4) int i = 2;
		for (@Pc(6) int j = 0; j < 32; j++) {
			BIT_MASKS[j] = i - 1;
			i += i;
		}
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
	public GlSolidColorTexture(@OriginalArg(0) int hsl) {
		@Pc(9) GL gl = GlRenderer.gl;
		@Pc(12) int[] temp = new int[1];
		gl.glGenTextures(1, temp, 0);
		this.textureId = temp[0];
		this.contextId = GlCleaner.contextId;
		GlRenderer.setTextureId(this.textureId);
		@Pc(32) int rgb = ColorUtils.HSL_TO_RGB[hsl];
		@Pc(58) byte[] bytes = new byte[] { (byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, -1 };
		@Pc(61) ByteBuffer buffer = ByteBuffer.wrap(bytes);
		gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_RGBA, 1, 1, GL.GL_POINTS, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, buffer);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		GlCleaner.onCardTexture += buffer.limit() - this.textureSize;
		this.textureSize = buffer.limit();
	}

	@OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.textureId != -1) {
			GlCleaner.deleteTexture(this.textureId, this.textureSize, this.contextId);
			this.textureSize = 0;
			this.textureId = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	public final void method3539() {
		@Pc(6) int flags = Static15.method1323();
		if ((flags & 0x1) == 0) {
			GlRenderer.setTextureId(this.textureId);
		}
		if ((flags & 0x2) == 0) {
			GlRenderer.setTextureCombineRgbMode(0);
		}
		if ((flags & 0x4) == 0) {
			GlRenderer.setTextureCombineAlphaMode(0);
		}
	}
}

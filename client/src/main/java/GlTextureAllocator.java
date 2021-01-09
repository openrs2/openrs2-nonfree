import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class GlTextureAllocator {
	@OriginalMember(owner = "client!th", name = "a", descriptor = "I")
	public static final int GL_TEXTURE_2D = 0xDE1;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	public static final int GL_TEXTURE_RECTANGLE = 0x84F5;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	public static final int GL_RGB = 0x1907;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "I")
	public static final int GL_RGBA = 0x1908;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	public static final int GL_BGRA = 0x80E1;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	public static final int GL_RGB16F = 0x881B;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "I")
	public static final int GL_RGBA16F = 0x881A;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "I")
	public static final int GL_RGB32F = 0x8815;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public static final int GL_RGBA32F = 0x8814;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	public static final int GL_ALPHA = 0x1906;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	public static final int GL_DEPTH_COMPONENT = 0x1902;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	public static final int GL_LINEAR = 0x2601;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	public static final int GL_NEAREST = 0x2600;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	public static final int GL_FLOAT = 0x1406;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "I")
	public static final int GL_UNSIGNED_BYTE = 0x1401;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "[I")
	private static final int[] temp = new int[1];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII[B)V")
	public static void allocateTextureStorage(@OriginalArg(0) int target, @OriginalArg(1) int internalFormat, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int format, @OriginalArg(5) int type, @OriginalArg(6) byte[] pixels) {
		@Pc(6) ByteBuffer buffer = pixels == null ? null : ByteBuffer.wrap(pixels);
		GlRenderer.gl.glTexImage2D(target, GL.GL_POINTS, internalFormat, width, height, GL.GL_POINTS, format, type, buffer);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	public static void allocateTextureStorageRectangle(@OriginalArg(0) int internalFormat, @OriginalArg(1) int width, @OriginalArg(2) int height) {
		allocateTextureStorage(GL_TEXTURE_RECTANGLE, internalFormat, width, height, GL_RGB, GL_UNSIGNED_BYTE, null);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int allocateTextureAndStorage2d(@OriginalArg(0) int target, @OriginalArg(1) int internalFormat, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int minFilter, @OriginalArg(5) int magFilter, @OriginalArg(6) int format, @OriginalArg(7) int type, @OriginalArg(8) byte[] pixels) {
		@Pc(1) GL gl = GlRenderer.gl;
		@Pc(3) int texture = allocateTexture();
		if (target == 3553) {
			GlRenderer.setTextureId(texture);
		} else {
			gl.glBindTexture(target, texture);
		}
		allocateTextureStorage(target, internalFormat, width, height, format, type, pixels);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, minFilter);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, magFilter);
		return texture;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public static void freeTexture(@OriginalArg(0) int id) {
		temp[0] = id;
		GlRenderer.gl.glDeleteTextures(1, temp, 0);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
	public static void allocateTextureStorage2d(@OriginalArg(0) int internalFormat, @OriginalArg(1) int width, @OriginalArg(2) int height) {
		allocateTextureStorage(GL_TEXTURE_2D, internalFormat, width, height, GL_RGB, GL_UNSIGNED_BYTE, null);
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(III)I")
	public static int allocateTextureAndStorage2d(@OriginalArg(0) int format, @OriginalArg(1) int width, @OriginalArg(2) int height) {
		return allocateTextureAndStorage2d(GL_TEXTURE_2D, format, width, height, GL_LINEAR, GL_LINEAR, format, GL_UNSIGNED_BYTE, null);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "()I")
	public static int allocateTexture() {
		GlRenderer.gl.glGenTextures(1, temp, 0);
		return temp[0];
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III[B)I")
	public static int allocateTextureAndStorage2d(@OriginalArg(0) int format, @OriginalArg(3) byte[] pixels) {
		return allocateTextureAndStorage2d(GL_TEXTURE_2D, format, 128, 128, GL_LINEAR, GL_LINEAR, format, GL_UNSIGNED_BYTE, pixels);
	}
}

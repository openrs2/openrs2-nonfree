import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class GroundShadowModel {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[B")
	private static final byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!lk;")
	private GlVertexBufferObject indexVbo;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer vertexBuffer;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!lk;")
	private GlVertexBufferObject vertexVbo;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer indexBuffer;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private int anInt2807 = -1;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
	public boolean aBoolean197 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private final int textureId;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public GroundShadowModel() {
		@Pc(9) GL gl = GlRenderer.gl;
		@Pc(12) int[] temp = new int[1];
		gl.glGenTextures(1, temp, 0);
		this.textureId = temp[0];
		GlCleaner.onCardTexture += 16384;
		GlRenderer.setTextureId(this.textureId);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!fe;II)Z")
	public final boolean method2236(@OriginalArg(0) SoftwareIndexedSprite sprite, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] pixels = sprite.pixels;
		@Pc(5) int width = sprite.width;
		@Pc(19) int local19 = arg1 * 128 + (arg2 * 128 + 1) * width + 1;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = -128; local23 < 0; local23++) {
			local21 = (local21 << 8) - local21;
			for (@Pc(33) int local33 = -128; local33 < 0; local33++) {
				if (pixels[local19++] != 0) {
					local21++;
				}
			}
			local19 += width - 128;
		}
		if (local21 == this.anInt2807) {
			return false;
		}
		this.anInt2807 = local21;
		@Pc(74) int local74 = arg1 * 128 + (arg2 * 128 + 1) * width + 1;
		@Pc(76) int local76 = 0;
		for (@Pc(78) int local78 = -128; local78 < 0; local78++) {
			for (@Pc(82) int local82 = -128; local82 < 0; local82++) {
				if (pixels[local74] == 0) {
					@Pc(96) int local96 = 0;
					if (pixels[local74 - 1] != 0) {
						local96++;
					}
					if (pixels[local74 + 1] != 0) {
						local96++;
					}
					if (pixels[local74 - width] != 0) {
						local96++;
					}
					if (pixels[local74 + width] != 0) {
						local96++;
					}
					aByteArray21[local76++] = (byte) (local96 * 17);
				} else {
					aByteArray21[local76++] = 68;
				}
				local74++;
			}
			local74 += width - 128;
		}
		@Pc(145) GL gl = GlRenderer.gl;
		@Pc(148) ByteBuffer buffer = ByteBuffer.wrap(aByteArray21);
		buffer.limit(16384);
		GlRenderer.setTextureId(this.textureId);
		gl.glTexImage2D(GL.GL_TEXTURE_2D, GL.GL_POINTS, GL.GL_ALPHA, 128, 128, GL.GL_POINTS, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, buffer);
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	public final void render() {
		@Pc(1) GL gl = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		if (this.vertexVbo == null) {
			if (GlRenderer.arbVboSupported) {
				gl.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			}
			gl.glInterleavedArrays(GL.GL_T2F_V3F, 20, this.vertexBuffer);
			GlRenderer.normalArrayEnabled = false;
		} else {
			this.vertexVbo.bindArray();
			gl.glInterleavedArrays(GL.GL_T2F_V3F, 20, 0L);
			GlRenderer.normalArrayEnabled = false;
		}
		if (this.indexVbo == null) {
			if (GlRenderer.arbVboSupported) {
				gl.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, 0);
			}
			gl.glDrawElements(GL.GL_TRIANGLES, 384, GL.GL_UNSIGNED_INT, this.indexBuffer);
		} else {
			this.indexVbo.bindElementArray();
			gl.glDrawElements(GL.GL_TRIANGLES, 384, GL.GL_UNSIGNED_INT, 0L);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([[III)V")
	public final void buffer(@OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(0) int[][] heights) {
		@Pc(4) Buffer vertexBuffer = new Buffer(1620);
		for (@Pc(6) int zOff = 0; zOff <= 8; zOff++) {
			for (@Pc(11) int xOff = 0; xOff <= 8; xOff++) {
				if (GlRenderer.bigEndian) {
					vertexBuffer.writeFloat((float) xOff / 8.0F);
					vertexBuffer.writeFloat((float) zOff / 8.0F);
					vertexBuffer.writeFloat((float) (xOff * 128));
					vertexBuffer.writeFloat((float) heights[xOff + x][zOff + z]);
					vertexBuffer.writeFloat((float) (zOff * 128));
				} else {
					vertexBuffer.writeFloatLE((float) xOff / 8.0F);
					vertexBuffer.writeFloatLE((float) zOff / 8.0F);
					vertexBuffer.writeFloatLE((float) (xOff * 128));
					vertexBuffer.writeFloatLE((float) heights[xOff + x][zOff + z]);
					vertexBuffer.writeFloatLE((float) (zOff * 128));
				}
			}
		}
		if (GlRenderer.arbVboSupported) {
			@Pc(112) ByteBuffer buffer = ByteBuffer.wrap(vertexBuffer.bytes, 0, vertexBuffer.position);
			this.vertexVbo = new GlVertexBufferObject();
			this.vertexVbo.setArrayBuffer(buffer);
		} else {
			this.vertexBuffer = ByteBuffer.allocateDirect(vertexBuffer.position).order(ByteOrder.nativeOrder());
			this.vertexBuffer.put(vertexBuffer.bytes, 0, vertexBuffer.position);
			this.vertexBuffer.flip();
		}
		@Pc(147) Buffer indexBuffer = new Buffer(1536);
		for (@Pc(149) int zOff = 0; zOff < 8; zOff++) {
			for (@Pc(154) int xOff = 0; xOff < 8; xOff++) {
				if (GlRenderer.bigEndian) {
					indexBuffer.writeInt(xOff + (zOff + 1) * 9);
					indexBuffer.writeInt(xOff + zOff * 9);
					indexBuffer.writeInt(xOff + zOff * 9 + 1);
					indexBuffer.writeInt(xOff + (zOff + 1) * 9);
					indexBuffer.writeInt(xOff + zOff * 9 + 1);
					indexBuffer.writeInt(xOff + (zOff + 1) * 9 + 1);
				} else {
					indexBuffer.writeIntLE(xOff + (zOff + 1) * 9);
					indexBuffer.writeIntLE(xOff + zOff * 9);
					indexBuffer.writeIntLE(xOff + zOff * 9 + 1);
					indexBuffer.writeIntLE(xOff + (zOff + 1) * 9);
					indexBuffer.writeIntLE(xOff + zOff * 9 + 1);
					indexBuffer.writeIntLE(xOff + (zOff + 1) * 9 + 1);
				}
			}
		}
		if (GlRenderer.arbVboSupported) {
			@Pc(293) ByteBuffer buffer = ByteBuffer.wrap(indexBuffer.bytes, 0, indexBuffer.position);
			this.indexVbo = new GlVertexBufferObject();
			this.indexVbo.setElementArrayBuffer(buffer);
		} else {
			this.indexBuffer = ByteBuffer.allocateDirect(indexBuffer.position).order(ByteOrder.nativeOrder());
			this.indexBuffer.put(indexBuffer.bytes, 0, indexBuffer.position);
			this.indexBuffer.flip();
		}
	}
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class GroundLightModel {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public int vertexCapacity;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer vertexBuffer;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public int indexCapacity;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer indexBuffer;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "[B")
	private byte[] vertexRed;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "[B")
	private byte[] vertexGreen;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!lk;")
	private GlVertexBufferObject vertexVbo;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	public int vertexCount;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
	private int[] vertexZ;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "[I")
	private int[] indexes;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Lclient!lk;")
	private GlVertexBufferObject indexVbo;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public int indexCount;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "[I")
	private int[] vertexY;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Lclient!ic;")
	private HashTable vertexes;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "[B")
	private byte[] vertexBlue;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "[I")
	private int[] vertexX;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([I)V")
	public final void addTriangleFan(@OriginalArg(0) int[] vertices) {
		for (@Pc(1) int i = 1; i < vertices.length - 1; i++) {
			this.indexes[this.indexCount++] = vertices[0];
			this.indexes[this.indexCount++] = vertices[i];
			this.indexes[this.indexCount++] = vertices[i + 1];
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
	public final void clear() {
		this.indexes = new int[this.indexCapacity];
		this.vertexX = new int[this.vertexCapacity];
		this.vertexY = new int[this.vertexCapacity];
		this.vertexZ = new int[this.vertexCapacity];
		this.vertexRed = new byte[this.vertexCapacity];
		this.vertexGreen = new byte[this.vertexCapacity];
		this.vertexBlue = new byte[this.vertexCapacity];
		this.vertexes = new HashTable(IntUtils.clp2(this.vertexCapacity));
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "()V")
	public final void render() {
		@Pc(1) GL gl = GlRenderer.gl;
		if (GlRenderer.arbVboSupported) {
			this.vertexVbo.bindArray();
			gl.glInterleavedArrays(GL.GL_C4UB_V3F, 16, 0L);
			GlRenderer.normalArrayEnabled = false;
			this.indexVbo.bindElementArray();
			gl.glDrawElements(GL.GL_TRIANGLES, this.indexCount, GL.GL_UNSIGNED_INT, 0L);
			return;
		}
		if (GlRenderer.arbVboSupported) {
			gl.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			gl.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, 0);
		}
		gl.glInterleavedArrays(GL.GL_C4UB_V3F, 16, this.vertexBuffer);
		GlRenderer.normalArrayEnabled = false;
		gl.glDrawElements(GL.GL_TRIANGLES, this.indexCount, GL.GL_UNSIGNED_INT, this.indexBuffer);
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "()V")
	public final void buffer() {
		@Pc(7) Buffer indexBuffer = new Buffer(this.indexCount * 4);
		@Pc(15) Buffer vertexBuffer = new Buffer(this.vertexCount * 16);
		if (GlRenderer.bigEndian) {
			for (@Pc(19) int i = 0; i < this.vertexCount; i++) {
				vertexBuffer.writeByte(this.vertexRed[i]);
				vertexBuffer.writeByte(this.vertexGreen[i]);
				vertexBuffer.writeByte(this.vertexBlue[i]);
				vertexBuffer.writeByte(255);
				vertexBuffer.writeFloat((float) this.vertexX[i]);
				vertexBuffer.writeFloat((float) this.vertexY[i]);
				vertexBuffer.writeFloat((float) this.vertexZ[i]);
			}
			for (@Pc(76) int i = 0; i < this.indexCount; i++) {
				indexBuffer.writeInt(this.indexes[i]);
			}
		} else {
			for (@Pc(92) int i = 0; i < this.vertexCount; i++) {
				vertexBuffer.writeByte(this.vertexRed[i]);
				vertexBuffer.writeByte(this.vertexGreen[i]);
				vertexBuffer.writeByte(this.vertexBlue[i]);
				vertexBuffer.writeByte(255);
				vertexBuffer.writeFloatLE((float) this.vertexX[i]);
				vertexBuffer.writeFloatLE((float) this.vertexY[i]);
				vertexBuffer.writeFloatLE((float) this.vertexZ[i]);
			}
			for (@Pc(149) int i = 0; i < this.indexCount; i++) {
				indexBuffer.writeIntLE(this.indexes[i]);
			}
		}
		if (GlRenderer.arbVboSupported) {
			this.vertexVbo = new GlVertexBufferObject();
			@Pc(173) ByteBuffer buffer = ByteBuffer.wrap(vertexBuffer.bytes);
			this.vertexVbo.setArrayBuffer(buffer);
			this.indexVbo = new GlVertexBufferObject();
			buffer = ByteBuffer.wrap(indexBuffer.bytes);
			this.indexVbo.setElementArrayBuffer(buffer);
		} else {
			this.vertexBuffer = ByteBuffer.allocateDirect(vertexBuffer.position);
			this.vertexBuffer.put(vertexBuffer.bytes);
			this.vertexBuffer.flip();
			this.indexBuffer = ByteBuffer.allocateDirect(indexBuffer.position);
			this.indexBuffer.put(indexBuffer.bytes);
			this.indexBuffer.flip();
		}
		this.vertexX = null;
		this.vertexY = null;
		this.vertexZ = null;
		this.vertexRed = null;
		this.vertexGreen = null;
		this.vertexBlue = null;
		this.indexes = null;
		this.vertexes = null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!em;IIIFFF)I")
	public final int addVertex(@OriginalArg(0) Light light, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int z, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long key = 0L;
		if ((x & 0x7F) == 0 || (z & 0x7F) == 0) {
			key = x + (z << 16);
			@Pc(23) IntNode node = (IntNode) this.vertexes.get(key);
			if (node != null) {
				return node.value;
			}
		}
		@Pc(31) int color = light.color;
		@Pc(37) float dx = (float) (light.x - x);
		@Pc(43) float dy = (float) (light.y - y);
		@Pc(49) float dz = (float) (light.z - z);
		@Pc(64) float distance = (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
		@Pc(68) float inverseDistance = 1.0F / distance;
		dx *= inverseDistance;
		dy *= inverseDistance;
		dz *= inverseDistance;
		@Pc(90) float local90 = distance / (float) ((light.radius << 7) + 64);
		@Pc(96) float local96 = 1.0F - local90 * local90;
		if (local96 < 0.0F) {
			local96 = 0.0F;
		}
		@Pc(114) float local114 = dx * arg4 + dy * arg5 + dz * arg6;
		if (local114 < 0.0F) {
			local114 = 0.0F;
		}
		@Pc(126) float brightness = local114 * local96 * 2.0F;
		if (brightness > 1.0F) {
			brightness = 1.0F;
		}
		@Pc(142) int red = (int) (brightness * (float) (color >> 16 & 0xFF));
		if (red > 255) {
			red = 255;
		}
		@Pc(157) int green = (int) (brightness * (float) (color >> 8 & 0xFF));
		if (green > 255) {
			green = 255;
		}
		@Pc(170) int blue = (int) (brightness * (float) (color & 0xFF));
		if (blue > 255) {
			blue = 255;
		}
		this.vertexRed[this.vertexCount] = (byte) red;
		this.vertexGreen[this.vertexCount] = (byte) green;
		this.vertexBlue[this.vertexCount] = (byte) blue;
		this.vertexX[this.vertexCount] = x;
		this.vertexY[this.vertexCount] = y;
		this.vertexZ[this.vertexCount] = z;
		this.vertexes.put(key, new IntNode(this.vertexCount));
		return this.vertexCount++;
	}
}

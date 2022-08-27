import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class GroundModel extends Node {

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "Lclient!fd;")
	private static Buffer aClass4_Sub10_4;

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "Lclient!fd;")
	private static Buffer aClass4_Sub10_5;

	@OriginalMember(owner = "client!ih", name = "G", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "()V")
	public static void method1868() {
		aClass4_Sub10_4 = null;
		aClass4_Sub10_5 = null;
		aByteBuffer5 = null;
		aByteBuffer4 = null;
	}

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "[I")
	private int[] vertexColor;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "[F")
	private float[] vertexNormalX;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "[F")
	private float[] vertexNormalZ;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "[I")
	private int[] tileLevel;

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "[I")
	private int[] vertexX;

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "Lclient!lk;")
	private GlVertexBufferObject vertexVbo;

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "[I")
	private int[] tileX;

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "[I")
	private int[] vertexZ;

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "[Z")
	private boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!ih", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "[I")
	private int[] tileZ;

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "Lclient!ic;")
	private HashTable vertexes;

	@OriginalMember(owner = "client!ih", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer vertexBuffer;

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "[F")
	private float[] vertexNormalY;

	@OriginalMember(owner = "client!ih", name = "S", descriptor = "[F")
	private float[] aFloatArray27;

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "[I")
	private int[] vertexY;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
	private int tileCount = 0;

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
	private int anInt2354 = 0;

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
	public int tileCapacity = 0;

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
	private int anInt2353 = 0;

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
	public int vertexCapacity = 0;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
	public int vertexCount = 0;

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
	public final int texture;

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "F")
	private final float aFloat55;

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "Z")
	public final boolean aBoolean162;

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "Z")
	private final boolean underwater;

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
	public final int anInt2351;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IFZZI)V")
	public GroundModel(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean underwater, @OriginalArg(4) int arg4) {
		this.texture = arg0;
		this.aFloat55 = arg1;
		this.aBoolean162 = arg2;
		this.underwater = underwater;
		this.anInt2351 = arg4;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
	public void build() {
		@Pc(12) Buffer buffer = new Buffer((this.underwater ? 40 : 36) * this.vertexCount);
		for (@Pc(14) int i = 0; i < this.vertexCount; i++) {
			if (GlRenderer.bigEndian) {
				buffer.writeFloat((float) this.vertexX[i]);
				buffer.writeFloat((float) this.vertexY[i]);
				buffer.writeFloat((float) this.vertexZ[i]);
				buffer.writeInt(this.vertexColor[i]);
				buffer.writeFloat(this.vertexNormalX[i]);
				buffer.writeFloat(this.vertexNormalY[i]);
				buffer.writeFloat(this.vertexNormalZ[i]);
				buffer.writeFloat((float) this.vertexX[i] / this.aFloat55);
				buffer.writeFloat((float) this.vertexZ[i] / this.aFloat55);
				if (this.underwater) {
					buffer.writeFloat(this.aFloatArray27[i]);
				}
			} else {
				buffer.writeFloatLE((float) this.vertexX[i]);
				buffer.writeFloatLE((float) this.vertexY[i]);
				buffer.writeFloatLE((float) this.vertexZ[i]);
				buffer.writeInt(this.vertexColor[i]);
				buffer.writeFloatLE(this.vertexNormalX[i]);
				buffer.writeFloatLE(this.vertexNormalY[i]);
				buffer.writeFloatLE(this.vertexNormalZ[i]);
				buffer.writeFloatLE((float) this.vertexX[i] / this.aFloat55);
				buffer.writeFloatLE((float) this.vertexZ[i] / this.aFloat55);
				if (this.underwater) {
					buffer.writeFloatLE(this.aFloatArray27[i]);
				}
			}
		}
		if (GlRenderer.arbVboSupported) {
			@Pc(200) ByteBuffer wrappedBuffer = ByteBuffer.wrap(buffer.bytes, 0, buffer.position);
			this.vertexVbo = new GlVertexBufferObject();
			this.vertexVbo.setArrayBuffer(wrappedBuffer);
		} else {
			this.vertexBuffer = ByteBuffer.allocateDirect(buffer.position).order(ByteOrder.nativeOrder());
			this.vertexBuffer.put(buffer.bytes, 0, buffer.position);
			this.vertexBuffer.flip();
		}
		this.vertexX = null;
		this.vertexY = null;
		this.vertexZ = null;
		this.vertexColor = null;
		this.vertexNormalX = null;
		this.vertexNormalY = null;
		this.vertexNormalZ = null;
		this.vertexes = null;
		this.aFloatArray27 = null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([[[Lclient!nh;FZ)V")
	public void render(@OriginalArg(0) Tile[][][] tiles, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2) {
		if (aClass4_Sub10_4 == null || aClass4_Sub10_4.bytes.length < this.anInt2353 * 4) {
			aClass4_Sub10_4 = new Buffer(this.anInt2353 * 4);
		} else {
			aClass4_Sub10_4.position = 0;
		}
		if (aClass4_Sub10_5 == null || aClass4_Sub10_5.bytes.length < this.anInt2354 * 4) {
			aClass4_Sub10_5 = new Buffer(this.anInt2354 * 4);
		} else {
			aClass4_Sub10_5.position = 0;
		}
		if (GlRenderer.bigEndian) {
			for (@Pc(47) int i = 0; i < this.tileCount; i++) {
				@Pc(68) Tile tile = tiles[this.tileLevel[i]][this.tileX[i]][this.tileZ[i]];
				if (tile != null && tile.aBoolean257) {
					@Pc(78) int[] local78 = this.anIntArrayArray18[i];
					@Pc(111) Buffer local111;
					if (this.aBoolean162) {
						@Pc(86) int[] local86 = this.anIntArrayArray19[i];
						if (local86 != null) {
							for (@Pc(90) int local90 = 0; local90 < local86.length; local90++) {
								aClass4_Sub10_5.writeInt(local86[local90]);
							}
						}
						local111 = this.aBooleanArray10[i] ? aClass4_Sub10_5 : aClass4_Sub10_4;
					} else {
						local111 = aClass4_Sub10_4;
					}
					for (@Pc(116) int j = 1; j < local78.length - 1; j++) {
						local111.writeInt(local78[0]);
						local111.writeInt(local78[j]);
						local111.writeInt(local78[j + 1]);
					}
				}
			}
		} else {
			for (@Pc(149) int i = 0; i < this.tileCount; i++) {
				@Pc(170) Tile tile = tiles[this.tileLevel[i]][this.tileX[i]][this.tileZ[i]];
				if (tile != null && tile.aBoolean257) {
					@Pc(180) int[] local180 = this.anIntArrayArray18[i];
					@Pc(213) Buffer local213;
					if (this.aBoolean162) {
						@Pc(188) int[] local188 = this.anIntArrayArray19[i];
						if (local188 != null) {
							for (@Pc(192) int local192 = 0; local192 < local188.length; local192++) {
								aClass4_Sub10_5.writeIntLE(local188[local192]);
							}
						}
						local213 = this.aBooleanArray10[i] ? aClass4_Sub10_5 : aClass4_Sub10_4;
					} else {
						local213 = aClass4_Sub10_4;
					}
					for (@Pc(218) int j = 1; j < local180.length - 1; j++) {
						local213.writeIntLE(local180[0]);
						local213.writeIntLE(local180[j]);
						local213.writeIntLE(local180[j + 1]);
					}
				}
			}
		}
		if (aClass4_Sub10_4.position == 0 && aClass4_Sub10_5.position == 0) {
			return;
		}
		@Pc(257) GL gl = GlRenderer.gl;
		if (this.texture == -1 || arg2) {
			GlRenderer.setTextureId(-1);
			MaterialManager.setMaterial(0, 0);
		} else {
			Rasteriser.textureProvider.method451(this.texture);
		}
		@Pc(282) int stride = this.underwater ? 40 : 36;
		if (this.vertexVbo == null) {
			if (GlRenderer.arbVboSupported) {
				gl.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			}
			this.vertexBuffer.position(0);
			gl.glVertexPointer(3, GL.GL_FLOAT, stride, this.vertexBuffer);
			this.vertexBuffer.position(12);
			gl.glColorPointer(4, GL.GL_UNSIGNED_BYTE, stride, this.vertexBuffer);
			if (Preferences.highDetailLighting) {
				this.vertexBuffer.position(16);
				gl.glNormalPointer(GL.GL_FLOAT, stride, this.vertexBuffer);
			}
			this.vertexBuffer.position(28);
			gl.glTexCoordPointer(2, GL.GL_FLOAT, stride, this.vertexBuffer);
			if (this.underwater) {
				gl.glClientActiveTexture(UnderwaterMaterialRenderer.method315());
				this.vertexBuffer.position(36);
				gl.glTexCoordPointer(1, GL.GL_FLOAT, stride, this.vertexBuffer);
				gl.glClientActiveTexture(GL.GL_TEXTURE0);
			}
		} else {
			this.vertexVbo.bindArray();
			gl.glVertexPointer(3, GL.GL_FLOAT, stride, 0L);
			gl.glColorPointer(4, GL.GL_UNSIGNED_BYTE, stride, 12L);
			if (Preferences.highDetailLighting) {
				gl.glNormalPointer(GL.GL_FLOAT, stride, 16L);
			}
			gl.glTexCoordPointer(2, GL.GL_FLOAT, stride, 28L);
			if (this.underwater) {
				gl.glClientActiveTexture(UnderwaterMaterialRenderer.method315());
				gl.glTexCoordPointer(1, GL.GL_FLOAT, stride, 36L);
				gl.glClientActiveTexture(GL.GL_TEXTURE0);
			}
		}
		if (GlRenderer.arbVboSupported) {
			gl.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, 0);
		}
		if (aClass4_Sub10_4.position != 0) {
			if (aByteBuffer5 == null || aByteBuffer5.capacity() < aClass4_Sub10_4.position) {
				aByteBuffer5 = ByteBuffer.allocateDirect(aClass4_Sub10_4.position).order(ByteOrder.nativeOrder());
			} else {
				aByteBuffer5.clear();
			}
			aByteBuffer5.put(aClass4_Sub10_4.bytes, 0, aClass4_Sub10_4.position);
			aByteBuffer5.flip();
			GlRenderer.method1613(arg1);
			gl.glDrawElements(GL.GL_TRIANGLES, aClass4_Sub10_4.position / 4, GL.GL_UNSIGNED_INT, aByteBuffer5);
		}
		if (aClass4_Sub10_5.position == 0) {
			return;
		}
		if (aByteBuffer4 == null || aByteBuffer4.capacity() < aClass4_Sub10_5.position) {
			aByteBuffer4 = ByteBuffer.allocateDirect(aClass4_Sub10_5.position).order(ByteOrder.nativeOrder());
		} else {
			aByteBuffer4.clear();
		}
		aByteBuffer4.put(aClass4_Sub10_5.bytes, 0, aClass4_Sub10_5.position);
		aByteBuffer4.flip();
		GlRenderer.method1613(arg1 - 100.0F);
		GlRenderer.disableDepthMask();
		gl.glDrawElements(GL.GL_TRIANGLES, aClass4_Sub10_5.position / 4, GL.GL_UNSIGNED_INT, aByteBuffer4);
		GlRenderer.enableDepthMask();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[I[IZ)I")
	public int addTile(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (this.aBoolean162) {
			this.anIntArrayArray19[this.tileCount] = arg4;
			this.aBooleanArray10[this.tileCount] = arg5;
			if (arg4 != null) {
				this.anInt2354 += arg4.length;
			}
			if (arg5) {
				this.anInt2354 += (arg3.length - 2) * 3;
			} else {
				this.anInt2353 += (arg3.length - 2) * 3;
			}
		} else {
			this.anInt2353 += (arg3.length - 2) * 3;
		}
		this.tileLevel[this.tileCount] = level;
		this.tileX[this.tileCount] = x;
		this.tileZ[this.tileCount] = z;
		this.anIntArrayArray18[this.tileCount] = arg3;
		return this.tileCount++;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIFFFIF)I")
	public int addVertex(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int z, @OriginalArg(3) float normalX, @OriginalArg(4) float normalY, @OriginalArg(5) float normalZ, @OriginalArg(6) int color, @OriginalArg(7) float arg7) {
		@Pc(1) long key = 0L;
		if ((x & 0x7F) == 0 || (z & 0x7F) == 0) {
			key = (long) (x + (z << 16)) + ((long) color << 32);
			@Pc(28) IntNode node = (IntNode) this.vertexes.get(key);
			if (node != null) {
				if (y < this.vertexY[node.value]) {
					this.vertexY[node.value] = y;
				}
				return node.value;
			}
		}
		this.vertexX[this.vertexCount] = x;
		this.vertexY[this.vertexCount] = y;
		this.vertexZ[this.vertexCount] = z;
		if (this.underwater) {
			this.aFloatArray27[this.vertexCount] = arg7;
		}
		this.vertexNormalX[this.vertexCount] = normalX;
		this.vertexNormalY[this.vertexCount] = normalY;
		this.vertexNormalZ[this.vertexCount] = normalZ;
		this.vertexColor[this.vertexCount] = color;
		if (key != 0L) {
			this.vertexes.put(key, new IntNode(this.vertexCount));
		}
		return this.vertexCount++;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "()V")
	public void clear() {
		this.vertexX = new int[this.vertexCapacity];
		this.vertexY = new int[this.vertexCapacity];
		this.vertexZ = new int[this.vertexCapacity];
		if (this.underwater) {
			this.aFloatArray27 = new float[this.vertexCapacity];
		}
		this.vertexColor = new int[this.vertexCapacity];
		this.vertexNormalX = new float[this.vertexCapacity];
		this.vertexNormalY = new float[this.vertexCapacity];
		this.vertexNormalZ = new float[this.vertexCapacity];
		this.tileX = new int[this.tileCapacity];
		this.tileZ = new int[this.tileCapacity];
		this.tileLevel = new int[this.tileCapacity];
		this.anIntArrayArray18 = new int[this.tileCapacity][];
		this.vertexes = new HashTable(IntUtils.clp2(this.vertexCapacity));
		if (this.aBoolean162) {
			this.anIntArrayArray19 = new int[this.tileCapacity][];
			this.aBooleanArray10 = new boolean[this.tileCapacity];
		}
	}
}

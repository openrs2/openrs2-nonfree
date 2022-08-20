import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class RawModel extends Entity {

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "[I")
	private static final int[] SINE = MathUtils.SINE;

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "[I")
	private static final int[] COSINE = MathUtils.COSINE;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!fh;II)Lclient!ml;")
	public static RawModel create(@OriginalArg(0) Js5 archive, @OriginalArg(1) int id) {
		@Pc(5) byte[] bytes = archive.fetchFile(id, 0);
		return bytes == null ? null : new RawModel(bytes);
	}

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "[S")
	public short[] triangleTextures;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "[S")
	public short[] vertexSources;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "S")
	private short minX;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
	public int anInt3352;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "[S")
	public short[] triangleColors;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "[I")
	public int[] vertexBones;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
	public int[] vertexY;

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "[[I")
	public int[][] boneTriangles;

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "[B")
	public byte[] triangleAlpha;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "S")
	private short maxZ;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "S")
	public short contrast;

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "[S")
	public short[] triangleSources;

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "S")
	private short maxY;

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "[Lclient!sk;")
	public ModelParticleEmitter[] particleEmitters;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "[I")
	public int[] triangleBones;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!ml", name = "K", descriptor = "S")
	private short minY;

	@OriginalMember(owner = "client!ml", name = "L", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!ml", name = "M", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!ml", name = "N", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!ml", name = "O", descriptor = "[Lclient!ci;")
	public VertexNormal[] vertexNormals;

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "[B")
	public byte[] trianglePriorities;

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "[Lclient!mj;")
	public TriangleNormal[] triangleNormals;

	@OriginalMember(owner = "client!ml", name = "R", descriptor = "[I")
	public int[] vertexZ;

	@OriginalMember(owner = "client!ml", name = "U", descriptor = "[[I")
	public int[][] boneVertices;

	@OriginalMember(owner = "client!ml", name = "V", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!ml", name = "X", descriptor = "[Lclient!u;")
	public ModelParticleEffector[] particleEffectors;

	@OriginalMember(owner = "client!ml", name = "Y", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!ml", name = "Z", descriptor = "S")
	private short minZ;

	@OriginalMember(owner = "client!ml", name = "ab", descriptor = "[I")
	public int[] vertexX;

	@OriginalMember(owner = "client!ml", name = "bb", descriptor = "[I")
	public int[] triangleVertexB;

	@OriginalMember(owner = "client!ml", name = "cb", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!ml", name = "db", descriptor = "[Lclient!ci;")
	public VertexNormal[] aClass31Array2;

	@OriginalMember(owner = "client!ml", name = "eb", descriptor = "S")
	public short ambient;

	@OriginalMember(owner = "client!ml", name = "fb", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!ml", name = "hb", descriptor = "[I")
	public int[] triangleVertexA;

	@OriginalMember(owner = "client!ml", name = "ib", descriptor = "[I")
	public int[] triangleVertexC;

	@OriginalMember(owner = "client!ml", name = "kb", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!ml", name = "lb", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!ml", name = "mb", descriptor = "S")
	private short maxX;

	@OriginalMember(owner = "client!ml", name = "nb", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
	public int triangleCount = 0;

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "Z")
	private boolean boundsValid = false;

	@OriginalMember(owner = "client!ml", name = "gb", descriptor = "I")
	public int vertexCount = 0;

	@OriginalMember(owner = "client!ml", name = "jb", descriptor = "B")
	public byte priority = 0;

	@OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
	public int anInt3355 = 0;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	private RawModel() {
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([B)V")
	public RawModel(@OriginalArg(0) byte[] bytes) {
		if (bytes[bytes.length - 1] == -1 && bytes[bytes.length - 2] == -1) {
			this.decodeNew(bytes);
		} else {
			this.decodeOld(bytes);
		}
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(III)V")
	public RawModel(@OriginalArg(0) int vertexCount, @OriginalArg(1) int triangleCount, @OriginalArg(2) int arg2) {
		this.vertexX = new int[vertexCount];
		this.vertexY = new int[vertexCount];
		this.vertexZ = new int[vertexCount];
		this.vertexBones = new int[vertexCount];
		this.triangleVertexA = new int[triangleCount];
		this.triangleVertexB = new int[triangleCount];
		this.triangleVertexC = new int[triangleCount];
		this.aByteArray40 = new byte[triangleCount];
		this.trianglePriorities = new byte[triangleCount];
		this.triangleAlpha = new byte[triangleCount];
		this.triangleColors = new short[triangleCount];
		this.triangleTextures = new short[triangleCount];
		this.aByteArray35 = new byte[triangleCount];
		this.triangleBones = new int[triangleCount];
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([Lclient!ml;I)V")
	public RawModel(@OriginalArg(0) RawModel[] models, @OriginalArg(1) int len) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean hasPriorities = false;
		@Pc(22) boolean hasAlpha = false;
		@Pc(24) boolean hasTriangleBones = false;
		@Pc(26) boolean hasTextures = false;
		@Pc(28) boolean local28 = false;
		this.vertexCount = 0;
		this.triangleCount = 0;
		this.anInt3352 = 0;
		@Pc(39) int particleEmittersLen = 0;
		@Pc(41) int particleEffectorsLen = 0;
		this.priority = -1;
		for (@Pc(46) int i = 0; i < len; i++) {
			@Pc(53) RawModel model = models[i];
			if (model != null) {
				this.vertexCount += model.vertexCount;
				this.triangleCount += model.triangleCount;
				this.anInt3352 += model.anInt3352;
				if (model.trianglePriorities == null) {
					if (this.priority == -1) {
						this.priority = model.priority;
					}
					if (this.priority != model.priority) {
						hasPriorities = true;
					}
				} else {
					hasPriorities = true;
				}
				local18 |= model.aByteArray40 != null;
				hasAlpha |= model.triangleAlpha != null;
				hasTriangleBones |= model.triangleBones != null;
				hasTextures |= model.triangleTextures != null;
				local28 |= model.aByteArray35 != null;
				if (model.particleEmitters != null) {
					particleEmittersLen += model.particleEmitters.length;
				}
				if (model.particleEffectors != null) {
					particleEffectorsLen += model.particleEffectors.length;
				}
			}
		}
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.vertexBones = new int[this.vertexCount];
		this.vertexSources = new short[this.vertexCount];
		this.triangleVertexA = new int[this.triangleCount];
		this.triangleVertexB = new int[this.triangleCount];
		this.triangleVertexC = new int[this.triangleCount];
		if (local18) {
			this.aByteArray40 = new byte[this.triangleCount];
		}
		if (hasPriorities) {
			this.trianglePriorities = new byte[this.triangleCount];
		}
		if (hasAlpha) {
			this.triangleAlpha = new byte[this.triangleCount];
		}
		if (hasTriangleBones) {
			this.triangleBones = new int[this.triangleCount];
		}
		if (hasTextures) {
			this.triangleTextures = new short[this.triangleCount];
		}
		if (local28) {
			this.aByteArray35 = new byte[this.triangleCount];
		}
		if (particleEmittersLen > 0) {
			this.particleEmitters = new ModelParticleEmitter[particleEmittersLen];
		}
		if (particleEffectorsLen > 0) {
			this.particleEffectors = new ModelParticleEffector[particleEffectorsLen];
		}
		this.triangleColors = new short[this.triangleCount];
		this.triangleSources = new short[this.triangleCount];
		if (this.anInt3352 > 0) {
			this.aByteArray38 = new byte[this.anInt3352];
			this.aShortArray59 = new short[this.anInt3352];
			this.aShortArray56 = new short[this.anInt3352];
			this.aShortArray57 = new short[this.anInt3352];
			this.aShortArray60 = new short[this.anInt3352];
			this.aShortArray55 = new short[this.anInt3352];
			this.aShortArray58 = new short[this.anInt3352];
			this.aByteArray36 = new byte[this.anInt3352];
			this.aByteArray39 = new byte[this.anInt3352];
			this.aByteArray34 = new byte[this.anInt3352];
			this.aByteArray32 = new byte[this.anInt3352];
			this.aByteArray31 = new byte[this.anInt3352];
		}
		this.vertexCount = 0;
		this.triangleCount = 0;
		this.anInt3352 = 0;
		@Pc(340) int particleEmitterId = 0;
		@Pc(342) int particleEffectorId = 0;
		for (@Pc(344) int i = 0; i < len; i++) {
			@Pc(352) short source = (short) (0x1 << i);
			@Pc(356) RawModel model = models[i];
			if (model != null) {
				for (@Pc(360) int j = 0; j < model.triangleCount; j++) {
					if (local18 && model.aByteArray40 != null) {
						this.aByteArray40[this.triangleCount] = model.aByteArray40[j];
					}
					if (hasPriorities) {
						if (model.trianglePriorities == null) {
							this.trianglePriorities[this.triangleCount] = model.priority;
						} else {
							this.trianglePriorities[this.triangleCount] = model.trianglePriorities[j];
						}
					}
					if (hasAlpha && model.triangleAlpha != null) {
						this.triangleAlpha[this.triangleCount] = model.triangleAlpha[j];
					}
					if (hasTriangleBones && model.triangleBones != null) {
						this.triangleBones[this.triangleCount] = model.triangleBones[j];
					}
					if (hasTextures) {
						if (model.triangleTextures == null) {
							this.triangleTextures[this.triangleCount] = -1;
						} else {
							this.triangleTextures[this.triangleCount] = model.triangleTextures[j];
						}
					}
					this.triangleColors[this.triangleCount] = model.triangleColors[j];
					this.triangleSources[this.triangleCount] = source;
					this.triangleVertexA[this.triangleCount] = this.addVertex(model, model.triangleVertexA[j], source);
					this.triangleVertexB[this.triangleCount] = this.addVertex(model, model.triangleVertexB[j], source);
					this.triangleVertexC[this.triangleCount] = this.addVertex(model, model.triangleVertexC[j], source);
					this.triangleCount++;
				}
				if (model.particleEmitters != null) {
					for (@Pc(516) int k = 0; k < model.particleEmitters.length; k++) {
						@Pc(531) int a = this.addVertex(model, model.particleEmitters[k].triangleVertexA, source);
						@Pc(541) int b = this.addVertex(model, model.particleEmitters[k].triangleVertexB, source);
						@Pc(551) int c = this.addVertex(model, model.particleEmitters[k].triangleVertexC, source);
						this.particleEmitters[particleEmitterId] = new ModelParticleEmitter(model.particleEmitters[k].type, a, b, c);
						particleEmitterId++;
					}
				}
				if (model.particleEffectors != null) {
					for (@Pc(574) int k = 0; k < model.particleEffectors.length; k++) {
						@Pc(589) int vertex = this.addVertex(model, model.particleEffectors[k].vertex, source);
						this.particleEffectors[particleEffectorId] = new ModelParticleEffector(model.particleEffectors[k].type, vertex);
						particleEffectorId++;
					}
				}
			}
		}
		@Pc(609) int local609 = 0;
		this.anInt3355 = this.vertexCount;
		for (@Pc(615) int i = 0; i < len; i++) {
			@Pc(622) RawModel model = models[i];
			@Pc(627) short source = (short) (0x1 << i);
			if (model != null) {
				for (@Pc(631) int j = 0; j < model.triangleCount; j++) {
					if (local28) {
						this.aByteArray35[local609++] = (byte) (model.aByteArray35 == null || model.aByteArray35[j] == -1 ? -1 : model.aByteArray35[j] + this.anInt3352);
					}
				}
				for (@Pc(665) int j = 0; j < model.anInt3352; j++) {
					@Pc(680) byte local680 = this.aByteArray38[this.anInt3352] = model.aByteArray38[j];
					if (local680 == 0) {
						this.aShortArray59[this.anInt3352] = (short) this.addVertex(model, model.aShortArray59[j], source);
						this.aShortArray56[this.anInt3352] = (short) this.addVertex(model, model.aShortArray56[j], source);
						this.aShortArray57[this.anInt3352] = (short) this.addVertex(model, model.aShortArray57[j], source);
					}
					if (local680 >= 1 && local680 <= 3) {
						this.aShortArray59[this.anInt3352] = model.aShortArray59[j];
						this.aShortArray56[this.anInt3352] = model.aShortArray56[j];
						this.aShortArray57[this.anInt3352] = model.aShortArray57[j];
						this.aShortArray60[this.anInt3352] = model.aShortArray60[j];
						this.aShortArray55[this.anInt3352] = model.aShortArray55[j];
						this.aShortArray58[this.anInt3352] = model.aShortArray58[j];
						this.aByteArray36[this.anInt3352] = model.aByteArray36[j];
						this.aByteArray39[this.anInt3352] = model.aByteArray39[j];
						this.aByteArray34[this.anInt3352] = model.aByteArray34[j];
					}
					if (local680 == 2) {
						this.aByteArray32[this.anInt3352] = model.aByteArray32[j];
						this.aByteArray31[this.anInt3352] = model.aByteArray31[j];
					}
					this.anInt3352++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ml;ZZZZ)V")
	public RawModel(@OriginalArg(0) RawModel model, @OriginalArg(1) boolean shareVertices, @OriginalArg(2) boolean shareColors, @OriginalArg(3) boolean shareTextures, @OriginalArg(4) boolean arg4) {
		this.vertexCount = model.vertexCount;
		this.anInt3355 = model.anInt3355;
		this.triangleCount = model.triangleCount;
		this.anInt3352 = model.anInt3352;
		if (shareVertices) {
			this.vertexX = model.vertexX;
			this.vertexY = model.vertexY;
			this.vertexZ = model.vertexZ;
		} else {
			this.vertexX = new int[this.vertexCount];
			this.vertexY = new int[this.vertexCount];
			this.vertexZ = new int[this.vertexCount];
			for (@Pc(64) int i = 0; i < this.vertexCount; i++) {
				this.vertexX[i] = model.vertexX[i];
				this.vertexY[i] = model.vertexY[i];
				this.vertexZ[i] = model.vertexZ[i];
			}
		}
		if (shareColors) {
			this.triangleColors = model.triangleColors;
		} else {
			this.triangleColors = new short[this.triangleCount];
			for (@Pc(108) int i = 0; i < this.triangleCount; i++) {
				this.triangleColors[i] = model.triangleColors[i];
			}
		}
		if (shareTextures || model.triangleTextures == null) {
			this.triangleTextures = model.triangleTextures;
		} else {
			this.triangleTextures = new short[this.triangleCount];
			for (@Pc(139) int i = 0; i < this.triangleCount; i++) {
				this.triangleTextures[i] = model.triangleTextures[i];
			}
		}
		this.triangleAlpha = model.triangleAlpha;
		this.triangleVertexA = model.triangleVertexA;
		this.triangleVertexB = model.triangleVertexB;
		this.triangleVertexC = model.triangleVertexC;
		this.aByteArray40 = model.aByteArray40;
		this.trianglePriorities = model.trianglePriorities;
		this.aByteArray35 = model.aByteArray35;
		this.priority = model.priority;
		this.aByteArray38 = model.aByteArray38;
		this.aShortArray59 = model.aShortArray59;
		this.aShortArray56 = model.aShortArray56;
		this.aShortArray57 = model.aShortArray57;
		this.aShortArray60 = model.aShortArray60;
		this.aShortArray55 = model.aShortArray55;
		this.aShortArray58 = model.aShortArray58;
		this.aByteArray36 = model.aByteArray36;
		this.aByteArray39 = model.aByteArray39;
		this.aByteArray34 = model.aByteArray34;
		this.aByteArray32 = model.aByteArray32;
		this.aByteArray31 = model.aByteArray31;
		this.vertexBones = model.vertexBones;
		this.triangleBones = model.triangleBones;
		this.boneVertices = model.boneVertices;
		this.boneTriangles = model.boneTriangles;
		this.vertexNormals = model.vertexNormals;
		this.triangleNormals = model.triangleNormals;
		this.aClass31Array2 = model.aClass31Array2;
		this.ambient = model.ambient;
		this.contrast = model.contrast;
		this.particleEmitters = model.particleEmitters;
		this.particleEffectors = model.particleEffectors;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public final void method2740() {
		@Pc(3) int local3 = SINE[256];
		@Pc(7) int local7 = COSINE[256];
		for (@Pc(9) int local9 = 0; local9 < this.vertexCount; local9++) {
			@Pc(29) int local29 = this.vertexZ[local9] * local3 + this.vertexX[local9] * local7 >> 16;
			this.vertexZ[local9] = this.vertexZ[local9] * local7 - this.vertexX[local9] * local3 >> 16;
			this.vertexX[local9] = local29;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!ml;IS)I")
	private int addVertex(@OriginalArg(0) RawModel model, @OriginalArg(1) int vertex, @OriginalArg(2) short source) {
		@Pc(4) int x = model.vertexX[vertex];
		@Pc(9) int y = model.vertexY[vertex];
		@Pc(14) int z = model.vertexZ[vertex];
		for (@Pc(16) int i = 0; i < this.vertexCount; i++) {
			if (x == this.vertexX[i] && y == this.vertexY[i] && z == this.vertexZ[i]) {
				@Pc(40) short[] vertexSources = this.vertexSources;
				vertexSources[i] |= source;
				return i;
			}
		}
		this.vertexX[this.vertexCount] = x;
		this.vertexY[this.vertexCount] = y;
		this.vertexZ[this.vertexCount] = z;
		this.vertexSources[this.vertexCount] = source;
		if (model.vertexBones != null) {
			this.vertexBones[this.vertexCount] = model.vertexBones[vertex];
		}
		return this.vertexCount++;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "()I")
	@Override
	public final int getMinY() {
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		return this.minY;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "()V")
	public final void method2742() {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			@Pc(10) int x = this.vertexX[i];
			this.vertexX[i] = this.vertexZ[i];
			this.vertexZ[i] = -x;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
	public final void translate(@OriginalArg(0) int dx, @OriginalArg(1) int dy, @OriginalArg(2) int dz) {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			@Pc(7) int[] array = this.vertexX;
			array[i] += dx;
			array = this.vertexY;
			array[i] += dy;
			array = this.vertexZ;
			array[i] += dz;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "()V")
	public final void createBones() {
		if (this.vertexBones != null) {
			@Pc(5) int[] boneLens = new int[256];
			@Pc(7) int maxBone = 0;
			for (@Pc(9) int i = 0; i < this.vertexCount; i++) {
				@Pc(18) int bone = this.vertexBones[i];
				@Pc(22) int local22 = boneLens[bone]++;
				if (bone > maxBone) {
					maxBone = bone;
				}
			}
			this.boneVertices = new int[maxBone + 1][];
			for (@Pc(40) int i = 0; i <= maxBone; i++) {
				this.boneVertices[i] = new int[boneLens[i]];
				boneLens[i] = 0;
			}
			@Pc(59) int i = 0;
			while (i < this.vertexCount) {
				@Pc(68) int bone = this.vertexBones[i];
				this.boneVertices[bone][boneLens[bone]++] = i++;
			}
			this.vertexBones = null;
		}
		if (this.triangleBones == null) {
			return;
		}
		@Pc(93) int[] boneLens = new int[256];
		@Pc(95) int maxBone = 0;
		for (@Pc(97) int i = 0; i < this.triangleCount; i++) {
			@Pc(106) int bone = this.triangleBones[i];
			@Pc(110) int local110 = boneLens[bone]++;
			if (bone > maxBone) {
				maxBone = bone;
			}
		}
		this.boneTriangles = new int[maxBone + 1][];
		for (@Pc(128) int i = 0; i <= maxBone; i++) {
			this.boneTriangles[i] = new int[boneLens[i]];
			boneLens[i] = 0;
		}
		@Pc(147) int i = 0;
		while (i < this.triangleCount) {
			@Pc(156) int bone = this.triangleBones[i];
			this.boneTriangles[bone][boneLens[bone]++] = i++;
		}
		this.triangleBones = null;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "()V")
	public final void method2745() {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			this.vertexX[i] = -this.vertexX[i];
			this.vertexZ[i] = -this.vertexZ[i];
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([[IIIIII)V")
	private void method2746(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static25.method2762(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static25.method2762(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static25.method2762(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static25.method2762(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method2758(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method2769(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		@Pc(164) int local164 = (local149 >> 1) - arg2;
		if (local164 != 0) {
			this.translate(0, local164, 0);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "()Z")
	@Override
	public final boolean method3808() {
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "()V")
	public final void method2747() {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			@Pc(10) int z = this.vertexZ[i];
			this.vertexZ[i] = this.vertexX[i];
			this.vertexX[i] = -z;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)Lclient!vc;")
	@Override
	public final Entity method3809() {
		return this.createModel(this.ambient, this.contrast, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "()V")
	public final void method2748() {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			this.vertexZ[i] = -this.vertexZ[i];
		}
		for (@Pc(18) int i = 0; i < this.triangleCount; i++) {
			@Pc(27) int a = this.triangleVertexA[i];
			this.triangleVertexA[i] = this.triangleVertexC[i];
			this.triangleVertexC[i] = a;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "()Lclient!ml;")
	public final RawModel method2749() {
		@Pc(3) RawModel model = new RawModel();
		if (this.aByteArray40 != null) {
			model.aByteArray40 = new byte[this.triangleCount];
			for (@Pc(13) int local13 = 0; local13 < this.triangleCount; local13++) {
				model.aByteArray40[local13] = this.aByteArray40[local13];
			}
		}
		model.vertexCount = this.vertexCount;
		model.anInt3355 = this.anInt3355;
		model.triangleCount = this.triangleCount;
		model.anInt3352 = this.anInt3352;
		model.vertexX = this.vertexX;
		model.vertexY = this.vertexY;
		model.vertexZ = this.vertexZ;
		model.triangleVertexA = this.triangleVertexA;
		model.triangleVertexB = this.triangleVertexB;
		model.triangleVertexC = this.triangleVertexC;
		model.trianglePriorities = this.trianglePriorities;
		model.triangleAlpha = this.triangleAlpha;
		model.aByteArray35 = this.aByteArray35;
		model.triangleColors = this.triangleColors;
		model.triangleTextures = this.triangleTextures;
		model.priority = this.priority;
		model.aByteArray38 = this.aByteArray38;
		model.aShortArray59 = this.aShortArray59;
		model.aShortArray56 = this.aShortArray56;
		model.aShortArray57 = this.aShortArray57;
		model.aShortArray60 = this.aShortArray60;
		model.aShortArray55 = this.aShortArray55;
		model.aShortArray58 = this.aShortArray58;
		model.aByteArray36 = this.aByteArray36;
		model.aByteArray39 = this.aByteArray39;
		model.aByteArray34 = this.aByteArray34;
		model.aByteArray32 = this.aByteArray32;
		model.aByteArray31 = this.aByteArray31;
		model.vertexBones = this.vertexBones;
		model.triangleBones = this.triangleBones;
		model.boneVertices = this.boneVertices;
		model.boneTriangles = this.boneTriangles;
		model.vertexNormals = this.vertexNormals;
		model.triangleNormals = this.triangleNormals;
		model.ambient = this.ambient;
		model.contrast = this.contrast;
		model.particleEmitters = this.particleEmitters;
		model.particleEffectors = this.particleEffectors;
		return model;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([B)V")
	private void decodeOld(@OriginalArg(0) byte[] bytes) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean hasTextures = false;
		@Pc(8) Buffer buffer = new Buffer(bytes);
		@Pc(13) Buffer buffer1 = new Buffer(bytes);
		@Pc(18) Buffer buffer2 = new Buffer(bytes);
		@Pc(23) Buffer buffer3 = new Buffer(bytes);
		@Pc(28) Buffer buffer4 = new Buffer(bytes);
		buffer.position = bytes.length - 18;
		@Pc(38) int vertexCount = buffer.readUnsignedShort();
		@Pc(42) int triangleCount = buffer.readUnsignedShort();
		@Pc(46) int local46 = buffer.readUnsignedByte();
		@Pc(50) int local50 = buffer.readUnsignedByte();
		@Pc(54) int priority = buffer.readUnsignedByte();
		@Pc(58) int hasAlpha = buffer.readUnsignedByte();
		@Pc(62) int hasTriangleBones = buffer.readUnsignedByte();
		@Pc(66) int hasVertexBones = buffer.readUnsignedByte();
		@Pc(70) int local70 = buffer.readUnsignedShort();
		@Pc(74) int local74 = buffer.readUnsignedShort();
		@Pc(78) int local78 = buffer.readUnsignedShort();
		@Pc(82) int local82 = buffer.readUnsignedShort();
		@Pc(90) int triangleTypesPosition = vertexCount;
		@Pc(96) int triangleVerticesPosition = triangleTypesPosition + triangleCount;
		@Pc(98) int trianglePrioritiesPosition = triangleVerticesPosition;
		if (priority == 255) {
			triangleVerticesPosition += triangleCount;
		}
		@Pc(107) int triangleBonesPosition = triangleVerticesPosition;
		if (hasTriangleBones == 1) {
			triangleVerticesPosition += triangleCount;
		}
		@Pc(116) int local116 = triangleVerticesPosition;
		if (local50 == 1) {
			triangleVerticesPosition += triangleCount;
		}
		@Pc(125) int vertexBonesPosition = triangleVerticesPosition;
		if (hasVertexBones == 1) {
			triangleVerticesPosition += vertexCount;
		}
		@Pc(134) int triangleAlphaPosition = triangleVerticesPosition;
		if (hasAlpha == 1) {
			triangleVerticesPosition += triangleCount;
		}
		@Pc(147) int vertexDzPosition = triangleVerticesPosition + local82;
		@Pc(149) int triangleColorsPosition = vertexDzPosition;
		vertexDzPosition += triangleCount * 2;
		@Pc(157) int local157 = vertexDzPosition;
		vertexDzPosition += local46 * 6;
		@Pc(165) int vertexDxPosition = vertexDzPosition;
		vertexDzPosition += local70;
		@Pc(171) int vertexDyPosition = vertexDzPosition;
		vertexDzPosition += local74;
		this.vertexCount = vertexCount;
		this.triangleCount = triangleCount;
		this.anInt3352 = local46;
		this.vertexX = new int[vertexCount];
		this.vertexY = new int[vertexCount];
		this.vertexZ = new int[vertexCount];
		this.triangleVertexA = new int[triangleCount];
		this.triangleVertexB = new int[triangleCount];
		this.triangleVertexC = new int[triangleCount];
		if (local46 > 0) {
			this.aByteArray38 = new byte[local46];
			this.aShortArray59 = new short[local46];
			this.aShortArray56 = new short[local46];
			this.aShortArray57 = new short[local46];
		}
		if (hasVertexBones == 1) {
			this.vertexBones = new int[vertexCount];
		}
		if (local50 == 1) {
			this.aByteArray40 = new byte[triangleCount];
			this.aByteArray35 = new byte[triangleCount];
			this.triangleTextures = new short[triangleCount];
		}
		if (priority == 255) {
			this.trianglePriorities = new byte[triangleCount];
		} else {
			this.priority = (byte) priority;
		}
		if (hasAlpha == 1) {
			this.triangleAlpha = new byte[triangleCount];
		}
		if (hasTriangleBones == 1) {
			this.triangleBones = new int[triangleCount];
		}
		this.triangleColors = new short[triangleCount];
		buffer.position = 0;
		buffer1.position = vertexDxPosition;
		buffer2.position = vertexDyPosition;
		buffer3.position = vertexDzPosition;
		buffer4.position = vertexBonesPosition;
		@Pc(301) int prevVertexX = 0;
		@Pc(303) int prevVertexY = 0;
		@Pc(305) int prevVertexZ = 0;
		for (@Pc(307) int i = 0; i < vertexCount; i++) {
			@Pc(314) int flags = buffer.readUnsignedByte();
			@Pc(316) int dx = 0;
			if ((flags & 0x1) != 0) {
				dx = buffer1.readShortSmart();
			}
			@Pc(326) int dy = 0;
			if ((flags & 0x2) != 0) {
				dy = buffer2.readShortSmart();
			}
			@Pc(336) int dz = 0;
			if ((flags & 0x4) != 0) {
				dz = buffer3.readShortSmart();
			}
			this.vertexX[i] = prevVertexX + dx;
			this.vertexY[i] = prevVertexY + dy;
			this.vertexZ[i] = prevVertexZ + dz;
			prevVertexX = this.vertexX[i];
			prevVertexY = this.vertexY[i];
			prevVertexZ = this.vertexZ[i];
			if (hasVertexBones == 1) {
				this.vertexBones[i] = buffer4.readUnsignedByte();
			}
		}
		buffer.position = triangleColorsPosition;
		buffer1.position = local116;
		buffer2.position = trianglePrioritiesPosition;
		buffer3.position = triangleAlphaPosition;
		buffer4.position = triangleBonesPosition;
		for (@Pc(409) int i = 0; i < triangleCount; i++) {
			this.triangleColors[i] = (short) buffer.readUnsignedShort();
			if (local50 == 1) {
				@Pc(427) int local427 = buffer1.readUnsignedByte();
				if ((local427 & 0x1) == 1) {
					this.aByteArray40[i] = 1;
					local1 = true;
				} else {
					this.aByteArray40[i] = 0;
				}
				if ((local427 & 0x2) == 2) {
					this.aByteArray35[i] = (byte) (local427 >> 2);
					this.triangleTextures[i] = this.triangleColors[i];
					this.triangleColors[i] = 127;
					if (this.triangleTextures[i] != -1) {
						hasTextures = true;
					}
				} else {
					this.aByteArray35[i] = -1;
					this.triangleTextures[i] = -1;
				}
			}
			if (priority == 255) {
				this.trianglePriorities[i] = buffer2.readByte();
			}
			if (hasAlpha == 1) {
				this.triangleAlpha[i] = buffer3.readByte();
			}
			if (hasTriangleBones == 1) {
				this.triangleBones[i] = buffer4.readUnsignedByte();
			}
		}
		this.anInt3355 = -1;
		buffer.position = triangleVerticesPosition;
		buffer1.position = triangleTypesPosition;
		@Pc(533) int a = 0;
		@Pc(535) int b = 0;
		@Pc(537) int c = 0;
		@Pc(539) int prevVertex = 0;
		for (@Pc(541) int i = 0; i < triangleCount; i++) {
			@Pc(548) int type = buffer1.readUnsignedByte();
			if (type == 1) {
				a = buffer.readShortSmart() + prevVertex;
				b = buffer.readShortSmart() + a;
				c = buffer.readShortSmart() + b;
				prevVertex = c;
				this.triangleVertexA[i] = a;
				this.triangleVertexB[i] = b;
				this.triangleVertexC[i] = c;
				if (a > this.anInt3355) {
					this.anInt3355 = a;
				}
				if (b > this.anInt3355) {
					this.anInt3355 = b;
				}
				if (c > this.anInt3355) {
					this.anInt3355 = c;
				}
			}
			if (type == 2) {
				b = c;
				c = buffer.readShortSmart() + prevVertex;
				prevVertex = c;
				this.triangleVertexA[i] = a;
				this.triangleVertexB[i] = b;
				this.triangleVertexC[i] = c;
				if (c > this.anInt3355) {
					this.anInt3355 = c;
				}
			}
			if (type == 3) {
				a = c;
				c = buffer.readShortSmart() + prevVertex;
				prevVertex = c;
				this.triangleVertexA[i] = a;
				this.triangleVertexB[i] = b;
				this.triangleVertexC[i] = c;
				if (c > this.anInt3355) {
					this.anInt3355 = c;
				}
			}
			if (type == 4) {
				@Pc(686) int prevA = a;
				a = b;
				b = prevA;
				c = buffer.readShortSmart() + prevVertex;
				prevVertex = c;
				this.triangleVertexA[i] = a;
				this.triangleVertexB[i] = prevA;
				this.triangleVertexC[i] = c;
				if (c > this.anInt3355) {
					this.anInt3355 = c;
				}
			}
		}
		this.anInt3355++;
		buffer.position = local157;
		for (@Pc(733) int i = 0; i < local46; i++) {
			this.aByteArray38[i] = 0;
			this.aShortArray59[i] = (short) buffer.readUnsignedShort();
			this.aShortArray56[i] = (short) buffer.readUnsignedShort();
			this.aShortArray57[i] = (short) buffer.readUnsignedShort();
		}
		if (this.aByteArray35 != null) {
			@Pc(772) boolean local772 = false;
			for (@Pc(774) int local774 = 0; local774 < triangleCount; local774++) {
				@Pc(784) int local784 = this.aByteArray35[local774] & 0xFF;
				if (local784 != 255) {
					if ((this.aShortArray59[local784] & 0xFFFF) == this.triangleVertexA[local774] && (this.aShortArray56[local784] & 0xFFFF) == this.triangleVertexB[local774] && (this.aShortArray57[local784] & 0xFFFF) == this.triangleVertexC[local774]) {
						this.aByteArray35[local774] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray35 = null;
			}
		}
		if (!hasTextures) {
			this.triangleTextures = null;
		}
		if (!local1) {
			this.aByteArray40 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(SS)V")
	public final void retexture(@OriginalArg(0) short source, @OriginalArg(1) short destination) {
		if (this.triangleTextures == null) {
			return;
		}
		for (@Pc(5) int i = 0; i < this.triangleCount; i++) {
			if (this.triangleTextures[i] == source) {
				this.triangleTextures[i] = destination;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(III)V")
	public final void rotate(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			@Pc(5) int sine = SINE[arg2];
			@Pc(9) int cosine = COSINE[arg2];
			for (@Pc(11) int i = 0; i < this.vertexCount; i++) {
				@Pc(31) int x = this.vertexY[i] * sine + this.vertexX[i] * cosine >> 16;
				this.vertexY[i] = this.vertexY[i] * cosine - this.vertexX[i] * sine >> 16;
				this.vertexX[i] = x;
			}
		}
		if (arg0 != 0) {
			@Pc(63) int sine = SINE[arg0];
			@Pc(67) int cosine = COSINE[arg0];
			for (@Pc(69) int i = 0; i < this.vertexCount; i++) {
				@Pc(89) int y = this.vertexY[i] * cosine - this.vertexZ[i] * sine >> 16;
				this.vertexZ[i] = this.vertexY[i] * sine + this.vertexZ[i] * cosine >> 16;
				this.vertexY[i] = y;
			}
		}
		if (arg1 == 0) {
			return;
		}
		@Pc(121) int sine = SINE[arg1];
		@Pc(125) int cosine = COSINE[arg1];
		for (@Pc(127) int i = 0; i < this.vertexCount; i++) {
			@Pc(147) int x = this.vertexZ[i] * sine + this.vertexX[i] * cosine >> 16;
			this.vertexZ[i] = this.vertexZ[i] * cosine - this.vertexX[i] * sine >> 16;
			this.vertexX[i] = x;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "([B)V")
	private void decodeNew(@OriginalArg(0) byte[] bytes) {
		@Pc(4) Buffer buffer1 = new Buffer(bytes);
		@Pc(9) Buffer buffer2 = new Buffer(bytes);
		@Pc(14) Buffer buffer3 = new Buffer(bytes);
		@Pc(19) Buffer buffer4 = new Buffer(bytes);
		@Pc(24) Buffer buffer5 = new Buffer(bytes);
		@Pc(29) Buffer buffer6 = new Buffer(bytes);
		@Pc(34) Buffer buffer7 = new Buffer(bytes);
		buffer1.position = bytes.length - 23;
		@Pc(44) int vertexCount = buffer1.readUnsignedShort();
		@Pc(48) int triangleCount = buffer1.readUnsignedShort();
		@Pc(52) int local52 = buffer1.readUnsignedByte();
		@Pc(56) int local56 = buffer1.readUnsignedByte();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int priority = buffer1.readUnsignedByte();
		@Pc(82) int hasAlpha = buffer1.readUnsignedByte();
		@Pc(86) int hasTriangleBones = buffer1.readUnsignedByte();
		@Pc(90) int hasTextures = buffer1.readUnsignedByte();
		@Pc(94) int hasVertexBones = buffer1.readUnsignedByte();
		@Pc(98) int local98 = buffer1.readUnsignedShort();
		@Pc(102) int local102 = buffer1.readUnsignedShort();
		@Pc(106) int local106 = buffer1.readUnsignedShort();
		@Pc(110) int local110 = buffer1.readUnsignedShort();
		@Pc(114) int local114 = buffer1.readUnsignedShort();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		if (local52 > 0) {
			this.aByteArray38 = new byte[local52];
			buffer1.position = 0;
			for (@Pc(131) int i = 0; i < local52; i++) {
				@Pc(143) byte local143 = this.aByteArray38[i] = buffer1.readByte();
				if (local143 == 0) {
					local116++;
				}
				if (local143 >= 1 && local143 <= 3) {
					local118++;
				}
				if (local143 == 2) {
					local120++;
				}
			}
		}
		@Pc(167) int triangleTypesPosition = local52 + vertexCount;
		@Pc(169) int local169 = triangleTypesPosition;
		if (local65) {
			triangleTypesPosition += triangleCount;
		}
		@Pc(181) int triangleVerticesPosition = triangleTypesPosition + triangleCount;
		@Pc(183) int trianglePrioritiesPosition = triangleVerticesPosition;
		if (priority == 255) {
			triangleVerticesPosition += triangleCount;
		}
		@Pc(192) int triangleBonesPosition = triangleVerticesPosition;
		if (hasTriangleBones == 1) {
			triangleVerticesPosition += triangleCount;
		}
		@Pc(201) int local201 = triangleVerticesPosition;
		if (hasVertexBones == 1) {
			triangleVerticesPosition += vertexCount;
		}
		@Pc(210) int triangleAlphaPosition = triangleVerticesPosition;
		if (hasAlpha == 1) {
			triangleVerticesPosition += triangleCount;
		}
		@Pc(223) int local223 = triangleVerticesPosition + local110;
		@Pc(225) int triangleTexturesPosition = local223;
		if (hasTextures == 1) {
			local223 += triangleCount * 2;
		}
		@Pc(240) int particleEmittersAndEffectorsPosition = local223 + local114;
		@Pc(242) int triangleColorsPosition = particleEmittersAndEffectorsPosition;
		particleEmittersAndEffectorsPosition += triangleCount * 2;
		@Pc(250) int local250 = particleEmittersAndEffectorsPosition;
		particleEmittersAndEffectorsPosition += local98;
		@Pc(256) int local256 = particleEmittersAndEffectorsPosition;
		particleEmittersAndEffectorsPosition += local102;
		@Pc(262) int local262 = particleEmittersAndEffectorsPosition;
		particleEmittersAndEffectorsPosition += local106;
		@Pc(268) int local268 = particleEmittersAndEffectorsPosition;
		particleEmittersAndEffectorsPosition += local116 * 6;
		@Pc(276) int local276 = particleEmittersAndEffectorsPosition;
		particleEmittersAndEffectorsPosition += local118 * 6;
		@Pc(284) int local284 = particleEmittersAndEffectorsPosition;
		particleEmittersAndEffectorsPosition += local118 * 6;
		@Pc(292) int local292 = particleEmittersAndEffectorsPosition;
		particleEmittersAndEffectorsPosition += local118;
		@Pc(298) int local298 = particleEmittersAndEffectorsPosition;
		particleEmittersAndEffectorsPosition += local118;
		@Pc(304) int local304 = particleEmittersAndEffectorsPosition;
		particleEmittersAndEffectorsPosition += local118 + local120 * 2;
		this.vertexCount = vertexCount;
		this.triangleCount = triangleCount;
		this.anInt3352 = local52;
		this.vertexX = new int[vertexCount];
		this.vertexY = new int[vertexCount];
		this.vertexZ = new int[vertexCount];
		this.triangleVertexA = new int[triangleCount];
		this.triangleVertexB = new int[triangleCount];
		this.triangleVertexC = new int[triangleCount];
		if (hasVertexBones == 1) {
			this.vertexBones = new int[vertexCount];
		}
		if (local65) {
			this.aByteArray40 = new byte[triangleCount];
		}
		if (priority == 255) {
			this.trianglePriorities = new byte[triangleCount];
		} else {
			this.priority = (byte) priority;
		}
		if (hasAlpha == 1) {
			this.triangleAlpha = new byte[triangleCount];
		}
		if (hasTriangleBones == 1) {
			this.triangleBones = new int[triangleCount];
		}
		if (hasTextures == 1) {
			this.triangleTextures = new short[triangleCount];
		}
		if (hasTextures == 1 && local52 > 0) {
			this.aByteArray35 = new byte[triangleCount];
		}
		this.triangleColors = new short[triangleCount];
		if (local52 > 0) {
			this.aShortArray59 = new short[local52];
			this.aShortArray56 = new short[local52];
			this.aShortArray57 = new short[local52];
			if (local118 > 0) {
				this.aShortArray60 = new short[local118];
				this.aShortArray55 = new short[local118];
				this.aShortArray58 = new short[local118];
				this.aByteArray36 = new byte[local118];
				this.aByteArray39 = new byte[local118];
				this.aByteArray34 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray32 = new byte[local120];
				this.aByteArray31 = new byte[local120];
			}
		}
		buffer1.position = local52;
		buffer2.position = local250;
		buffer3.position = local256;
		buffer4.position = local262;
		buffer5.position = local201;
		@Pc(473) int prevVertexX = 0;
		@Pc(475) int prevVertexY = 0;
		@Pc(477) int prevVertexZ = 0;
		for (@Pc(479) int i = 0; i < vertexCount; i++) {
			@Pc(486) int flags = buffer1.readUnsignedByte();
			@Pc(488) int dx = 0;
			if ((flags & 0x1) != 0) {
				dx = buffer2.readShortSmart();
			}
			@Pc(498) int dy = 0;
			if ((flags & 0x2) != 0) {
				dy = buffer3.readShortSmart();
			}
			@Pc(508) int dz = 0;
			if ((flags & 0x4) != 0) {
				dz = buffer4.readShortSmart();
			}
			this.vertexX[i] = prevVertexX + dx;
			this.vertexY[i] = prevVertexY + dy;
			this.vertexZ[i] = prevVertexZ + dz;
			prevVertexX = this.vertexX[i];
			prevVertexY = this.vertexY[i];
			prevVertexZ = this.vertexZ[i];
			if (hasVertexBones == 1) {
				this.vertexBones[i] = buffer5.readUnsignedByte();
			}
		}
		buffer1.position = triangleColorsPosition;
		buffer2.position = local169;
		buffer3.position = trianglePrioritiesPosition;
		buffer4.position = triangleAlphaPosition;
		buffer5.position = triangleBonesPosition;
		buffer6.position = triangleTexturesPosition;
		buffer7.position = local223;
		for (@Pc(587) int i = 0; i < triangleCount; i++) {
			this.triangleColors[i] = (short) buffer1.readUnsignedShort();
			if (local65) {
				this.aByteArray40[i] = buffer2.readByte();
			}
			if (priority == 255) {
				this.trianglePriorities[i] = buffer3.readByte();
			}
			if (hasAlpha == 1) {
				this.triangleAlpha[i] = buffer4.readByte();
			}
			if (hasTriangleBones == 1) {
				this.triangleBones[i] = buffer5.readUnsignedByte();
			}
			if (hasTextures == 1) {
				this.triangleTextures[i] = (short) (buffer6.readUnsignedShort() - 1);
			}
			if (this.aByteArray35 != null) {
				if (this.triangleTextures[i] == -1) {
					this.aByteArray35[i] = -1;
				} else {
					this.aByteArray35[i] = (byte) (buffer7.readUnsignedByte() - 1);
				}
			}
		}
		this.anInt3355 = -1;
		buffer1.position = triangleVerticesPosition;
		buffer2.position = triangleTypesPosition;
		@Pc(688) int a = 0;
		@Pc(690) int b = 0;
		@Pc(692) int c = 0;
		@Pc(694) int prevVertex = 0;
		for (@Pc(696) int i = 0; i < triangleCount; i++) {
			@Pc(703) int type = buffer2.readUnsignedByte();
			if (type == 1) {
				a = buffer1.readShortSmart() + prevVertex;
				b = buffer1.readShortSmart() + a;
				c = buffer1.readShortSmart() + b;
				prevVertex = c;
				this.triangleVertexA[i] = a;
				this.triangleVertexB[i] = b;
				this.triangleVertexC[i] = c;
				if (a > this.anInt3355) {
					this.anInt3355 = a;
				}
				if (b > this.anInt3355) {
					this.anInt3355 = b;
				}
				if (c > this.anInt3355) {
					this.anInt3355 = c;
				}
			}
			if (type == 2) {
				b = c;
				c = buffer1.readShortSmart() + prevVertex;
				prevVertex = c;
				this.triangleVertexA[i] = a;
				this.triangleVertexB[i] = b;
				this.triangleVertexC[i] = c;
				if (c > this.anInt3355) {
					this.anInt3355 = c;
				}
			}
			if (type == 3) {
				a = c;
				c = buffer1.readShortSmart() + prevVertex;
				prevVertex = c;
				this.triangleVertexA[i] = a;
				this.triangleVertexB[i] = b;
				this.triangleVertexC[i] = c;
				if (c > this.anInt3355) {
					this.anInt3355 = c;
				}
			}
			if (type == 4) {
				@Pc(841) int temp = a;
				a = b;
				b = temp;
				c = buffer1.readShortSmart() + prevVertex;
				prevVertex = c;
				this.triangleVertexA[i] = a;
				this.triangleVertexB[i] = temp;
				this.triangleVertexC[i] = c;
				if (c > this.anInt3355) {
					this.anInt3355 = c;
				}
			}
		}
		this.anInt3355++;
		buffer1.position = local268;
		buffer2.position = local276;
		buffer3.position = local284;
		buffer4.position = local292;
		buffer5.position = local298;
		buffer6.position = local304;
		for (@Pc(903) int i = 0; i < local52; i++) {
			@Pc(913) int local913 = this.aByteArray38[i] & 0xFF;
			if (local913 == 0) {
				this.aShortArray59[i] = (short) buffer1.readUnsignedShort();
				this.aShortArray56[i] = (short) buffer1.readUnsignedShort();
				this.aShortArray57[i] = (short) buffer1.readUnsignedShort();
			}
			if (local913 == 1) {
				this.aShortArray59[i] = (short) buffer2.readUnsignedShort();
				this.aShortArray56[i] = (short) buffer2.readUnsignedShort();
				this.aShortArray57[i] = (short) buffer2.readUnsignedShort();
				this.aShortArray60[i] = (short) buffer3.readUnsignedShort();
				this.aShortArray55[i] = (short) buffer3.readUnsignedShort();
				this.aShortArray58[i] = (short) buffer3.readUnsignedShort();
				this.aByteArray36[i] = buffer4.readByte();
				this.aByteArray39[i] = buffer5.readByte();
				this.aByteArray34[i] = buffer6.readByte();
			}
			if (local913 == 2) {
				this.aShortArray59[i] = (short) buffer2.readUnsignedShort();
				this.aShortArray56[i] = (short) buffer2.readUnsignedShort();
				this.aShortArray57[i] = (short) buffer2.readUnsignedShort();
				this.aShortArray60[i] = (short) buffer3.readUnsignedShort();
				this.aShortArray55[i] = (short) buffer3.readUnsignedShort();
				this.aShortArray58[i] = (short) buffer3.readUnsignedShort();
				this.aByteArray36[i] = buffer4.readByte();
				this.aByteArray39[i] = buffer5.readByte();
				this.aByteArray34[i] = buffer6.readByte();
				this.aByteArray32[i] = buffer6.readByte();
				this.aByteArray31[i] = buffer6.readByte();
			}
			if (local913 == 3) {
				this.aShortArray59[i] = (short) buffer2.readUnsignedShort();
				this.aShortArray56[i] = (short) buffer2.readUnsignedShort();
				this.aShortArray57[i] = (short) buffer2.readUnsignedShort();
				this.aShortArray60[i] = (short) buffer3.readUnsignedShort();
				this.aShortArray55[i] = (short) buffer3.readUnsignedShort();
				this.aShortArray58[i] = (short) buffer3.readUnsignedShort();
				this.aByteArray36[i] = buffer4.readByte();
				this.aByteArray39[i] = buffer5.readByte();
				this.aByteArray34[i] = buffer6.readByte();
			}
		}
		if (!local74) {
			return;
		}
		buffer1.position = particleEmittersAndEffectorsPosition;
		@Pc(1180) int particleEmittersLen = buffer1.readUnsignedByte();
		if (particleEmittersLen > 0) {
			this.particleEmitters = new ModelParticleEmitter[particleEmittersLen];
			for (@Pc(1188) int i = 0; i < particleEmittersLen; i++) {
				@Pc(1195) int id = buffer1.readUnsignedShort();
				@Pc(1199) int triangle = buffer1.readUnsignedShort();
				this.particleEmitters[i] = new ModelParticleEmitter(id, this.triangleVertexA[triangle], this.triangleVertexB[triangle], this.triangleVertexC[triangle]);
			}
		}
		@Pc(1225) int particleEffectorsLen = buffer1.readUnsignedByte();
		if (particleEffectorsLen > 0) {
			this.particleEffectors = new ModelParticleEffector[particleEffectorsLen];
			for (@Pc(1233) int i = 0; i < particleEffectorsLen; i++) {
				this.particleEffectors[i] = new ModelParticleEffector(buffer1.readUnsignedShort(), buffer1.readUnsignedShort());
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIBSB)I")
	public final int addTriangle(@OriginalArg(0) int vertexA, @OriginalArg(1) int vertexB, @OriginalArg(2) int vertexC, @OriginalArg(4) short color, @OriginalArg(5) byte alpha) {
		this.triangleVertexA[this.triangleCount] = vertexA;
		this.triangleVertexB[this.triangleCount] = vertexB;
		this.triangleVertexC[this.triangleCount] = vertexC;
		this.aByteArray40[this.triangleCount] = 1;
		this.aByteArray35[this.triangleCount] = -1;
		this.triangleColors[this.triangleCount] = color;
		this.triangleTextures[this.triangleCount] = -1;
		this.triangleAlpha[this.triangleCount] = alpha;
		return this.triangleCount++;
	}

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "()V")
	private void invalidate() {
		this.vertexNormals = null;
		this.aClass31Array2 = null;
		this.triangleNormals = null;
		this.boundsValid = false;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	private void method2758(@OriginalArg(0) int angle) {
		@Pc(3) int sine = SINE[angle];
		@Pc(7) int cosine = COSINE[angle];
		for (@Pc(9) int i = 0; i < this.vertexCount; i++) {
			@Pc(29) int y = this.vertexY[i] * cosine - this.vertexZ[i] * sine >> 16;
			this.vertexZ[i] = this.vertexY[i] * sine + this.vertexZ[i] * cosine >> 16;
			this.vertexY[i] = y;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(IIIII)Lclient!na;")
	public final SoftwareModel createSoftwareModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new SoftwareModel(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "()V")
	public final void method2760() {
		this.vertexBones = null;
		this.triangleBones = null;
		this.boneVertices = null;
		this.boneTriangles = null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!vc;IIIZ)V")
	@Override
	public final void method3807(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) RawModel local2 = (RawModel) arg0;
		local2.calculateBounds();
		local2.calculateNormals();
		Static4.anInt3354++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.vertexX;
		@Pc(18) int local18 = local2.anInt3355;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3355; local20++) {
			@Pc(29) VertexNormal local29 = this.vertexNormals[local20];
			if (local29.triangles != 0) {
				@Pc(40) int local40 = this.vertexY[local20] - arg2;
				if (local40 >= local2.minY && local40 <= local2.maxY) {
					@Pc(56) int local56 = this.vertexX[local20] - arg1;
					if (local56 >= local2.minX && local56 <= local2.maxX) {
						@Pc(72) int local72 = this.vertexZ[local20] - arg3;
						if (local72 >= local2.minZ && local72 <= local2.maxZ) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) VertexNormal local91 = local2.vertexNormals[local83];
								if (local56 == local15[local83] && local72 == local2.vertexZ[local83] && local40 == local2.vertexY[local83] && local91.triangles != 0) {
									if (this.aClass31Array2 == null) {
										this.aClass31Array2 = new VertexNormal[this.anInt3355];
									}
									if (local2.aClass31Array2 == null) {
										local2.aClass31Array2 = new VertexNormal[local18];
									}
									@Pc(131) VertexNormal local131 = this.aClass31Array2[local20];
									if (local131 == null) {
										local131 = this.aClass31Array2[local20] = new VertexNormal(local29);
									}
									@Pc(148) VertexNormal local148 = local2.aClass31Array2[local83];
									if (local148 == null) {
										local148 = local2.aClass31Array2[local83] = new VertexNormal(local91);
									}
									local131.x += local91.x;
									local131.y += local91.y;
									local131.z += local91.z;
									local131.triangles += local91.triangles;
									local148.x += local29.x;
									local148.y += local29.y;
									local148.z += local29.z;
									local148.triangles += local29.triangles;
									local12++;
									Static4.anIntArray327[local20] = Static4.anInt3354;
									Static4.anIntArray328[local83] = Static4.anInt3354;
								}
							}
						}
					}
				}
			}
		}
		if (local12 < 3 || !arg4) {
			return;
		}
		for (@Pc(237) int local237 = 0; local237 < this.triangleCount; local237++) {
			if (Static4.anIntArray327[this.triangleVertexA[local237]] == Static4.anInt3354 && Static4.anIntArray327[this.triangleVertexB[local237]] == Static4.anInt3354 && Static4.anIntArray327[this.triangleVertexC[local237]] == Static4.anInt3354) {
				if (this.aByteArray40 == null) {
					this.aByteArray40 = new byte[this.triangleCount];
				}
				this.aByteArray40[local237] = 2;
			}
		}
		for (@Pc(282) int local282 = 0; local282 < local2.triangleCount; local282++) {
			if (Static4.anIntArray328[local2.triangleVertexA[local282]] == Static4.anInt3354 && Static4.anIntArray328[local2.triangleVertexB[local282]] == Static4.anInt3354 && Static4.anIntArray328[local2.triangleVertexC[local282]] == Static4.anInt3354) {
				if (local2.aByteArray40 == null) {
					local2.aByteArray40 = new byte[local2.triangleCount];
				}
				local2.aByteArray40[local282] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(IIIII)Lclient!vg;")
	public final Model createModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (GlRenderer.enabled) {
			@Pc(9) GlModel model = new GlModel(this, arg0, arg1, true);
			model.createBones();
			return model;
		} else {
			return new SoftwareModel(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(III)I")
	public final int addVertex(@OriginalArg(0) int x, @OriginalArg(2) int z) {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			if (this.vertexX[i] == x && this.vertexY[i] == 0 && this.vertexZ[i] == z) {
				return i;
			}
		}
		this.vertexX[this.vertexCount] = x;
		this.vertexY[this.vertexCount] = 0;
		this.vertexZ[this.vertexCount] = z;
		this.anInt3355 = ++this.vertexCount;
		return this.vertexCount - 1;
	}

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "()V")
	public final void calculateNormals() {
		if (this.vertexNormals != null) {
			return;
		}
		this.vertexNormals = new VertexNormal[this.anInt3355];
		for (@Pc(10) int i = 0; i < this.anInt3355; i++) {
			this.vertexNormals[i] = new VertexNormal();
		}
		for (@Pc(25) int i = 0; i < this.triangleCount; i++) {
			@Pc(34) int a = this.triangleVertexA[i];
			@Pc(39) int b = this.triangleVertexB[i];
			@Pc(44) int c = this.triangleVertexC[i];
			@Pc(54) int baX = this.vertexX[b] - this.vertexX[a];
			@Pc(64) int baY = this.vertexY[b] - this.vertexY[a];
			@Pc(74) int baZ = this.vertexZ[b] - this.vertexZ[a];
			@Pc(84) int caX = this.vertexX[c] - this.vertexX[a];
			@Pc(94) int caY = this.vertexY[c] - this.vertexY[a];
			@Pc(104) int caZ = this.vertexZ[c] - this.vertexZ[a];
			@Pc(112) int x = baY * caZ - caY * baZ;
			@Pc(120) int y = baZ * caX - caZ * baX;
			@Pc(128) int z = baX * caY - caX * baY;
			while (x > 8192 || y > 8192 || z > 8192 || x < -8192 || y < -8192 || z < -8192) {
				x >>= 1;
				y >>= 1;
				z >>= 1;
			}
			@Pc(174) int len = (int) Math.sqrt(x * x + y * y + z * z);
			if (len <= 0) {
				len = 1;
			}
			@Pc(184) int normalisedX = x * 256 / len;
			@Pc(190) int normalisedY = y * 256 / len;
			@Pc(196) int normalisedZ = z * 256 / len;
			@Pc(201) byte local201;
			if (this.aByteArray40 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray40[i];
			}
			if (local201 == 0) {
				@Pc(214) VertexNormal normal = this.vertexNormals[a];
				normal.x += normalisedX;
				normal.y += normalisedY;
				normal.z += normalisedZ;
				normal.triangles++;
				normal = this.vertexNormals[b];
				normal.x += normalisedX;
				normal.y += normalisedY;
				normal.z += normalisedZ;
				normal.triangles++;
				normal = this.vertexNormals[c];
				normal.x += normalisedX;
				normal.y += normalisedY;
				normal.z += normalisedZ;
				normal.triangles++;
			} else if (local201 == 1) {
				if (this.triangleNormals == null) {
					this.triangleNormals = new TriangleNormal[this.triangleCount];
				}
				@Pc(317) TriangleNormal normal = this.triangleNormals[i] = new TriangleNormal();
				normal.x = normalisedX;
				normal.y = normalisedY;
				normal.z = normalisedZ;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "()V")
	private void calculateBounds() {
		if (this.boundsValid) {
			return;
		}
		this.boundsValid = true;
		@Pc(8) int minX = 32767;
		@Pc(10) int minY = 32767;
		@Pc(12) int minZ = 32767;
		@Pc(14) int maxX = -32768;
		@Pc(16) int maxY = -32768;
		@Pc(18) int maxZ = -32768;
		for (@Pc(20) int i = 0; i < this.anInt3355; i++) {
			@Pc(29) int x = this.vertexX[i];
			@Pc(34) int y = this.vertexY[i];
			@Pc(39) int z = this.vertexZ[i];
			if (x < minX) {
				minX = x;
			}
			if (x > maxX) {
				maxX = x;
			}
			if (y < minY) {
				minY = y;
			}
			if (y > maxY) {
				maxY = y;
			}
			if (z < minZ) {
				minZ = z;
			}
			if (z > maxZ) {
				maxZ = z;
			}
		}
		this.minX = (short) minX;
		this.maxX = (short) maxX;
		this.minY = (short) minY;
		this.maxY = (short) maxY;
		this.minZ = (short) minZ;
		this.maxZ = (short) maxZ;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!ml;")
	public final RawModel method2766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.calculateBounds();
		@Pc(6) int local6 = arg4 + this.minX;
		@Pc(11) int local11 = arg4 + this.maxX;
		@Pc(16) int local16 = arg6 + this.minZ;
		@Pc(21) int local21 = arg6 + this.maxZ;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local6 < 0 || local11 + 128 >> 7 >= arg2.length || local16 < 0 || local21 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local6 < 0 || local11 + 128 >> 7 >= arg3.length || local16 < 0 || local21 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			@Pc(95) int local95 = local6 >> 7;
			@Pc(101) int local101 = local11 + 127 >> 7;
			@Pc(105) int local105 = local16 >> 7;
			@Pc(111) int local111 = local21 + 127 >> 7;
			if (arg2[local95][local105] == arg5 && arg2[local101][local105] == arg5 && arg2[local95][local111] == arg5 && arg2[local101][local111] == arg5) {
				return this;
			}
		}
		@Pc(147) RawModel model = new RawModel();
		model.vertexCount = this.vertexCount;
		model.anInt3355 = this.anInt3355;
		model.triangleCount = this.triangleCount;
		model.anInt3352 = this.anInt3352;
		model.triangleVertexA = this.triangleVertexA;
		model.triangleVertexB = this.triangleVertexB;
		model.triangleVertexC = this.triangleVertexC;
		model.aByteArray40 = this.aByteArray40;
		model.trianglePriorities = this.trianglePriorities;
		model.triangleAlpha = this.triangleAlpha;
		model.aByteArray35 = this.aByteArray35;
		model.triangleColors = this.triangleColors;
		model.triangleTextures = this.triangleTextures;
		model.priority = this.priority;
		model.aByteArray38 = this.aByteArray38;
		model.aShortArray59 = this.aShortArray59;
		model.aShortArray56 = this.aShortArray56;
		model.aShortArray57 = this.aShortArray57;
		model.aShortArray60 = this.aShortArray60;
		model.aShortArray55 = this.aShortArray55;
		model.aShortArray58 = this.aShortArray58;
		model.aByteArray36 = this.aByteArray36;
		model.aByteArray39 = this.aByteArray39;
		model.aByteArray34 = this.aByteArray34;
		model.aByteArray32 = this.aByteArray32;
		model.aByteArray31 = this.aByteArray31;
		model.vertexBones = this.vertexBones;
		model.triangleBones = this.triangleBones;
		model.boneVertices = this.boneVertices;
		model.boneTriangles = this.boneTriangles;
		model.ambient = this.ambient;
		model.contrast = this.contrast;
		model.vertexNormals = this.vertexNormals;
		model.triangleNormals = this.triangleNormals;
		model.aClass31Array2 = this.aClass31Array2;
		model.particleEmitters = this.particleEmitters;
		model.particleEffectors = this.particleEffectors;
		if (arg0 == 3) {
			model.vertexX = ArrayUtils.copyOfNullable(this.vertexX);
			model.vertexY = ArrayUtils.copyOfNullable(this.vertexY);
			model.vertexZ = ArrayUtils.copyOfNullable(this.vertexZ);
		} else {
			model.vertexX = this.vertexX;
			model.vertexY = new int[model.vertexCount];
			model.vertexZ = this.vertexZ;
		}
		if (arg0 == 1) {
			for (@Pc(338) int local338 = 0; local338 < model.anInt3355; local338++) {
				@Pc(349) int local349 = this.vertexX[local338] + arg4;
				@Pc(356) int local356 = this.vertexZ[local338] + arg6;
				@Pc(360) int local360 = local349 & 0x7F;
				@Pc(364) int local364 = local356 & 0x7F;
				@Pc(368) int local368 = local349 >> 7;
				@Pc(372) int local372 = local356 >> 7;
				@Pc(394) int local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
				@Pc(420) int local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
				@Pc(432) int local432 = local394 * (128 - local364) + local420 * local364 >> 7;
				model.vertexY[local338] = this.vertexY[local338] + local432 - arg5;
			}
			for (@Pc(449) int local449 = model.anInt3355; local449 < model.vertexCount; local449++) {
				@Pc(460) int local460 = this.vertexX[local449] + arg4;
				@Pc(467) int local467 = this.vertexZ[local449] + arg6;
				@Pc(471) int local471 = local460 & 0x7F;
				@Pc(475) int local475 = local467 & 0x7F;
				@Pc(479) int local479 = local460 >> 7;
				@Pc(483) int local483 = local467 >> 7;
				if (local479 >= 0 && local479 < arg2.length - 1 && local483 >= 0 && local483 < arg2[0].length - 1) {
					@Pc(524) int local524 = arg2[local479][local483] * (128 - local471) + arg2[local479 + 1][local483] * local471 >> 7;
					@Pc(550) int local550 = arg2[local479][local483 + 1] * (128 - local471) + arg2[local479 + 1][local483 + 1] * local471 >> 7;
					@Pc(562) int local562 = local524 * (128 - local475) + local550 * local475 >> 7;
					model.vertexY[local449] = this.vertexY[local449] + local562 - arg5;
				}
			}
		} else if (arg0 == 2) {
			for (@Pc(582) int local582 = 0; local582 < model.anInt3355; local582++) {
				@Pc(596) int local596 = (this.vertexY[local582] << 16) / this.minY;
				if (local596 < arg1) {
					@Pc(606) int local606 = this.vertexX[local582] + arg4;
					@Pc(613) int local613 = this.vertexZ[local582] + arg6;
					@Pc(617) int local617 = local606 & 0x7F;
					@Pc(621) int local621 = local613 & 0x7F;
					@Pc(625) int local625 = local606 >> 7;
					@Pc(629) int local629 = local613 >> 7;
					@Pc(651) int local651 = arg2[local625][local629] * (128 - local617) + arg2[local625 + 1][local629] * local617 >> 7;
					@Pc(677) int local677 = arg2[local625][local629 + 1] * (128 - local617) + arg2[local625 + 1][local629 + 1] * local617 >> 7;
					@Pc(689) int local689 = local651 * (128 - local621) + local677 * local621 >> 7;
					model.vertexY[local582] = this.vertexY[local582] + (local689 - arg5) * (arg1 - local596) / arg1;
				} else {
					model.vertexY[local582] = this.vertexY[local582];
				}
			}
			for (@Pc(721) int local721 = model.anInt3355; local721 < model.vertexCount; local721++) {
				@Pc(735) int local735 = (this.vertexY[local721] << 16) / this.minY;
				if (local735 < arg1) {
					@Pc(745) int local745 = this.vertexX[local721] + arg4;
					@Pc(752) int local752 = this.vertexZ[local721] + arg6;
					@Pc(756) int local756 = local745 & 0x7F;
					@Pc(760) int local760 = local752 & 0x7F;
					@Pc(764) int local764 = local745 >> 7;
					@Pc(768) int local768 = local752 >> 7;
					if (local764 >= 0 && local764 < arg2.length - 1 && local768 >= 0 && local768 < arg2[0].length - 1) {
						@Pc(809) int local809 = arg2[local764][local768] * (128 - local756) + arg2[local764 + 1][local768] * local756 >> 7;
						@Pc(835) int local835 = arg2[local764][local768 + 1] * (128 - local756) + arg2[local764 + 1][local768 + 1] * local756 >> 7;
						@Pc(847) int local847 = local809 * (128 - local760) + local835 * local760 >> 7;
						model.vertexY[local721] = this.vertexY[local721] + (local847 - arg5) * (arg1 - local735) / arg1;
					}
				} else {
					model.vertexY[local721] = this.vertexY[local721];
				}
			}
		} else if (arg0 == 3) {
			@Pc(886) int local886 = (arg1 & 0xFF) * 4;
			@Pc(894) int local894 = (arg1 >> 8 & 0xFF) * 4;
			model.method2746(arg2, arg4, arg5, arg6, local886, local894);
		} else if (arg0 == 4) {
			@Pc(912) int local912 = this.maxY - this.minY;
			for (@Pc(914) int local914 = 0; local914 < this.anInt3355; local914++) {
				@Pc(925) int local925 = this.vertexX[local914] + arg4;
				@Pc(932) int local932 = this.vertexZ[local914] + arg6;
				@Pc(936) int local936 = local925 & 0x7F;
				@Pc(940) int local940 = local932 & 0x7F;
				@Pc(944) int local944 = local925 >> 7;
				@Pc(948) int local948 = local932 >> 7;
				@Pc(970) int local970 = arg3[local944][local948] * (128 - local936) + arg3[local944 + 1][local948] * local936 >> 7;
				@Pc(996) int local996 = arg3[local944][local948 + 1] * (128 - local936) + arg3[local944 + 1][local948 + 1] * local936 >> 7;
				@Pc(1008) int local1008 = local970 * (128 - local940) + local996 * local940 >> 7;
				model.vertexY[local914] = this.vertexY[local914] + local1008 + local912 - arg5;
			}
			for (@Pc(1027) int local1027 = model.anInt3355; local1027 < model.vertexCount; local1027++) {
				@Pc(1038) int local1038 = this.vertexX[local1027] + arg4;
				@Pc(1045) int local1045 = this.vertexZ[local1027] + arg6;
				@Pc(1049) int local1049 = local1038 & 0x7F;
				@Pc(1053) int local1053 = local1045 & 0x7F;
				@Pc(1057) int local1057 = local1038 >> 7;
				@Pc(1061) int local1061 = local1045 >> 7;
				if (local1057 >= 0 && local1057 < arg3.length - 1 && local1061 >= 0 && local1061 < arg3[0].length - 1) {
					@Pc(1102) int local1102 = arg3[local1057][local1061] * (128 - local1049) + arg3[local1057 + 1][local1061] * local1049 >> 7;
					@Pc(1128) int local1128 = arg3[local1057][local1061 + 1] * (128 - local1049) + arg3[local1057 + 1][local1061 + 1] * local1049 >> 7;
					@Pc(1140) int local1140 = local1102 * (128 - local1053) + local1128 * local1053 >> 7;
					model.vertexY[local1027] = this.vertexY[local1027] + local1140 + local912 - arg5;
				}
			}
		} else if (arg0 == 5) {
			@Pc(1166) int local1166 = this.maxY - this.minY;
			for (@Pc(1168) int local1168 = 0; local1168 < this.anInt3355; local1168++) {
				@Pc(1179) int local1179 = this.vertexX[local1168] + arg4;
				@Pc(1186) int local1186 = this.vertexZ[local1168] + arg6;
				@Pc(1190) int local1190 = local1179 & 0x7F;
				@Pc(1194) int local1194 = local1186 & 0x7F;
				@Pc(1198) int local1198 = local1179 >> 7;
				@Pc(1202) int local1202 = local1186 >> 7;
				@Pc(1224) int local1224 = arg2[local1198][local1202] * (128 - local1190) + arg2[local1198 + 1][local1202] * local1190 >> 7;
				@Pc(1250) int local1250 = arg2[local1198][local1202 + 1] * (128 - local1190) + arg2[local1198 + 1][local1202 + 1] * local1190 >> 7;
				@Pc(1262) int local1262 = local1224 * (128 - local1194) + local1250 * local1194 >> 7;
				local1224 = arg3[local1198][local1202] * (128 - local1190) + arg3[local1198 + 1][local1202] * local1190 >> 7;
				local1250 = arg3[local1198][local1202 + 1] * (128 - local1190) + arg3[local1198 + 1][local1202 + 1] * local1190 >> 7;
				@Pc(1322) int local1322 = local1224 * (128 - local1194) + local1250 * local1194 >> 7;
				@Pc(1326) int local1326 = local1262 - local1322;
				model.vertexY[local1168] = ((this.vertexY[local1168] << 8) / local1166 * local1326 >> 8) + local1262 - arg5;
			}
			for (@Pc(1351) int local1351 = model.anInt3355; local1351 < model.vertexCount; local1351++) {
				@Pc(1362) int local1362 = this.vertexX[local1351] + arg4;
				@Pc(1369) int local1369 = this.vertexZ[local1351] + arg6;
				@Pc(1373) int local1373 = local1362 & 0x7F;
				@Pc(1377) int local1377 = local1369 & 0x7F;
				@Pc(1381) int local1381 = local1362 >> 7;
				@Pc(1385) int local1385 = local1369 >> 7;
				if (local1381 >= 0 && local1381 < arg2.length - 1 && local1381 < arg3.length - 1 && local1385 >= 0 && local1385 < arg2[0].length - 1 && local1385 < arg3[0].length - 1) {
					@Pc(1440) int local1440 = arg2[local1381][local1385] * (128 - local1373) + arg2[local1381 + 1][local1385] * local1373 >> 7;
					@Pc(1466) int local1466 = arg2[local1381][local1385 + 1] * (128 - local1373) + arg2[local1381 + 1][local1385 + 1] * local1373 >> 7;
					@Pc(1478) int local1478 = local1440 * (128 - local1377) + local1466 * local1377 >> 7;
					local1440 = arg3[local1381][local1385] * (128 - local1373) + arg3[local1381 + 1][local1385] * local1373 >> 7;
					local1466 = arg3[local1381][local1385 + 1] * (128 - local1373) + arg3[local1381 + 1][local1385 + 1] * local1373 >> 7;
					@Pc(1538) int local1538 = local1440 * (128 - local1377) + local1466 * local1377 >> 7;
					@Pc(1542) int local1542 = local1478 - local1538;
					model.vertexY[local1351] = ((this.vertexY[local1351] << 8) / local1166 * local1542 >> 8) + local1478 - arg5;
				}
			}
		}
		this.boundsValid = false;
		return model;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(III)V")
	public final void resize(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int z) {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			this.vertexX[i] = this.vertexX[i] * x / 128;
			this.vertexY[i] = this.vertexY[i] * y / 128;
			this.vertexZ[i] = this.vertexZ[i] * z / 128;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(SS)V")
	public final void recolor(@OriginalArg(0) short source, @OriginalArg(1) short destination) {
		for (@Pc(1) int i = 0; i < this.triangleCount; i++) {
			if (this.triangleColors[i] == source) {
				this.triangleColors[i] = destination;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	private void method2769(@OriginalArg(0) int angle) {
		@Pc(3) int sine = SINE[angle];
		@Pc(7) int cosine = COSINE[angle];
		for (@Pc(9) int i = 0; i < this.vertexCount; i++) {
			@Pc(29) int x = this.vertexY[i] * sine + this.vertexX[i] * cosine >> 16;
			this.vertexY[i] = this.vertexY[i] * cosine - this.vertexX[i] * sine >> 16;
			this.vertexX[i] = x;
		}
		this.invalidate();
	}
}

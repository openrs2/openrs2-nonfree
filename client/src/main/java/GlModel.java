import java.nio.ByteBuffer;
import javax.media.opengl.GL;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class GlModel extends Model {

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "Z")
	public static boolean arbVboSupported;

	@OriginalMember(owner = "client!s", name = "Q", descriptor = "Lclient!fd;")
	private static Buffer tempBuffer = new Buffer(10000);

	@OriginalMember(owner = "client!s", name = "gb", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer tempDirectBuffer;

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "[J")
	private static long[] aLongArray43;

	@OriginalMember(owner = "client!s", name = "pb", descriptor = "I")
	private static int originX;

	@OriginalMember(owner = "client!s", name = "rb", descriptor = "I")
	private static int originY;

	@OriginalMember(owner = "client!s", name = "sb", descriptor = "F")
	private static float aFloat115;

	@OriginalMember(owner = "client!s", name = "tb", descriptor = "F")
	private static float aFloat116;

	@OriginalMember(owner = "client!s", name = "vb", descriptor = "F")
	private static float aFloat117;

	@OriginalMember(owner = "client!s", name = "wb", descriptor = "F")
	private static float aFloat118;

	@OriginalMember(owner = "client!s", name = "xb", descriptor = "I")
	private static int originZ;

	@OriginalMember(owner = "client!s", name = "zb", descriptor = "F")
	private static float aFloat119;

	@OriginalMember(owner = "client!s", name = "Ab", descriptor = "F")
	private static float aFloat120;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[FIFFF)V")
	private static void method3856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11) {
		arg0 -= arg3;
		arg1 -= arg4;
		arg2 -= arg5;
		@Pc(32) float local32 = (float) arg0 * arg7[0] + (float) arg1 * arg7[1] + (float) arg2 * arg7[2];
		@Pc(53) float local53 = (float) arg0 * arg7[3] + (float) arg1 * arg7[4] + (float) arg2 * arg7[5];
		@Pc(74) float local74 = (float) arg0 * arg7[6] + (float) arg1 * arg7[7] + (float) arg2 * arg7[8];
		@Pc(82) float local82;
		@Pc(89) float local89;
		if (arg6 == 0) {
			local82 = local32 + arg9 + 0.5F;
			local89 = arg11 + 0.5F - local74;
		} else if (arg6 == 1) {
			local82 = local32 + arg9 + 0.5F;
			local89 = local74 + arg11 + 0.5F;
		} else if (arg6 == 2) {
			local82 = arg9 + 0.5F - local32;
			local89 = arg10 + 0.5F - local53;
		} else if (arg6 == 3) {
			local82 = local32 + arg9 + 0.5F;
			local89 = arg10 + 0.5F - local53;
		} else if (arg6 == 4) {
			local82 = local74 + arg11 + 0.5F;
			local89 = arg10 + 0.5F - local53;
		} else {
			local82 = arg11 + 0.5F - local74;
			local89 = arg10 + 0.5F - local53;
		}
		if (arg8 == 1) {
			@Pc(177) float local177 = local82;
			local82 = -local89;
			local89 = local177;
		} else if (arg8 == 2) {
			local82 = -local82;
			local89 = -local89;
		} else if (arg8 == 3) {
			@Pc(198) float local198 = local82;
			local82 = local89;
			local89 = -local198;
		}
		aFloat119 = local82;
		aFloat116 = local89;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ISIB)I")
	private static int method3863(@OriginalArg(0) int arg0, @OriginalArg(1) short texture, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = ColorUtils.HSL_TO_RGB[SoftwareModel.method2912(arg0, arg2)];
		if (texture != -1) {
			@Pc(15) int local15 = Rasteriser.textureProvider.method450(texture & 0xFFFF);
			if (local15 != 0) {
				@Pc(21) int local21;
				if (arg2 < 0) {
					local21 = 0;
				} else if (arg2 > 127) {
					local21 = 16777215;
				} else {
					local21 = arg2 * 131586;
				}
				if (local15 == 256) {
					local5 = local21;
				} else {
					@Pc(44) int local44 = 256 - local15;
					local5 = ((local21 & 0xFF00FF) * local15 + (local5 & 0xFF00FF) * local44 & 0xFF00FF00) + ((local21 & 0xFF00) * local15 + (local5 & 0xFF00) * local44 & 0xFF0000) >> 8;
				}
			}
			@Pc(81) int local81 = Rasteriser.textureProvider.method447(texture & 0xFFFF);
			if (local81 != 0) {
				@Pc(84) int local84 = local81 + 256;
				@Pc(92) int local92 = (local5 >> 16 & 0xFF) * local84;
				if (local92 > 65535) {
					local92 = 65535;
				}
				@Pc(105) int local105 = (local5 >> 8 & 0xFF) * local84;
				if (local105 > 65535) {
					local105 = 65535;
				}
				@Pc(116) int local116 = (local5 & 0xFF) * local84;
				if (local116 > 65535) {
					local116 = 65535;
				}
				local5 = ((local92 & 0xFF00) << 8) + (local105 & 0xFF00) + (local116 >> 8);
			}
		}
		return (local5 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIFFF)[F")
	private static float[] method3864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(4) float local4 = 1.0F;
		@Pc(6) float local6 = 0.0F;
		@Pc(11) float local11 = (float) arg1 / 32767.0F;
		@Pc(21) float local21 = -((float) Math.sqrt((double) (1.0F - local11 * local11)));
		@Pc(25) float local25 = 1.0F - local11;
		@Pc(36) float local36 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (local36 != 0.0F) {
			local4 = (float) -arg2 / local36;
			local6 = (float) arg0 / local36;
		}
		local2[0] = local11 + local4 * local4 * local25;
		local2[1] = local6 * local21;
		local2[2] = local6 * local4 * local25;
		local2[3] = -local6 * local21;
		local2[4] = local11;
		local2[5] = local4 * local21;
		local2[6] = local4 * local6 * local25;
		local2[7] = -local4 * local21;
		local2[8] = local11 + local6 * local6 * local25;
		@Pc(120) float[] local120 = new float[9];
		@Pc(128) float local128 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(136) float local136 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local120[0] = local128;
		local120[1] = 0.0F;
		local120[2] = local136;
		local120[3] = 0.0F;
		local120[4] = 1.0F;
		local120[5] = 0.0F;
		local120[6] = -local136;
		local120[7] = 0.0F;
		local120[8] = local128;
		@Pc(180) float[] local180 = new float[] { local120[0] * local2[0] + local120[1] * local2[3] + local120[2] * local2[6], local120[0] * local2[1] + local120[1] * local2[4] + local120[2] * local2[7], local120[0] * local2[2] + local120[1] * local2[5] + local120[2] * local2[8], local120[3] * local2[0] + local120[4] * local2[3] + local120[5] * local2[6], local120[3] * local2[1] + local120[4] * local2[4] + local120[5] * local2[7], local120[3] * local2[2] + local120[4] * local2[5] + local120[5] * local2[8], local120[6] * local2[0] + local120[7] * local2[3] + local120[8] * local2[6], local120[6] * local2[1] + local120[7] * local2[4] + local120[8] * local2[7], local120[6] * local2[2] + local120[7] * local2[5] + local120[8] * local2[8] };
		local180[0] *= arg4;
		local180[1] *= arg4;
		local180[2] *= arg4;
		local180[3] *= arg5;
		local180[4] *= arg5;
		local180[5] *= arg5;
		local180[6] *= arg6;
		local180[7] *= arg6;
		local180[8] *= arg6;
		return local180;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII[FFIF)V")
	private static void method3871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9) {
		arg0 -= arg3;
		arg1 -= arg4;
		arg2 -= arg5;
		@Pc(32) float local32 = (float) arg0 * arg6[0] + (float) arg1 * arg6[1] + (float) arg2 * arg6[2];
		@Pc(53) float local53 = (float) arg0 * arg6[3] + (float) arg1 * arg6[4] + (float) arg2 * arg6[5];
		@Pc(74) float local74 = (float) arg0 * arg6[6] + (float) arg1 * arg6[7] + (float) arg2 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local85 *= arg7;
		}
		@Pc(99) float local99 = local53 + arg9 + 0.5F;
		if (arg8 == 1) {
			@Pc(104) float local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg8 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg8 == 3) {
			@Pc(125) float local125 = local85;
			local85 = local99;
			local99 = -local125;
		}
		aFloat115 = local85;
		aFloat118 = local99;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII[FIF)V")
	private static void method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8) {
		arg0 -= arg3;
		arg1 -= arg4;
		arg2 -= arg5;
		@Pc(32) float local32 = (float) arg0 * arg6[0] + (float) arg1 * arg6[1] + (float) arg2 * arg6[2];
		@Pc(53) float local53 = (float) arg0 * arg6[3] + (float) arg1 * arg6[4] + (float) arg2 * arg6[5];
		@Pc(74) float local74 = (float) arg0 * arg6[6] + (float) arg1 * arg6[7] + (float) arg2 * arg6[8];
		@Pc(89) float local89 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + arg8 + 0.5F;
		if (arg7 == 1) {
			@Pc(118) float local118 = local100;
			local100 = -local113;
			local113 = local118;
		} else if (arg7 == 2) {
			local100 = -local100;
			local113 = -local113;
		} else if (arg7 == 3) {
			@Pc(139) float local139 = local100;
			local100 = local113;
			local113 = -local139;
		}
		aFloat120 = local100;
		aFloat117 = local113;
	}

	@OriginalMember(owner = "client!s", name = "n", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
	public int[] vertexZ;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "[S")
	private short[] triangleSources;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!ff;")
	public GlBuffer vertexBuffer;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "Lclient!ff;")
	private GlBuffer normalBuffer;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "[I")
	private int[] vertexBones;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!s", name = "w", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!s", name = "x", descriptor = "Lclient!ff;")
	private GlBuffer texCoordBuffer;

	@OriginalMember(owner = "client!s", name = "y", descriptor = "[S")
	private short[] triangleTextures;

	@OriginalMember(owner = "client!s", name = "z", descriptor = "[I")
	public int[] vertexY;

	@OriginalMember(owner = "client!s", name = "A", descriptor = "[S")
	private short[] triangleColors;

	@OriginalMember(owner = "client!s", name = "B", descriptor = "[Lclient!u;")
	public ModelParticleEffector[] particleEffectors;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "Lclient!rj;")
	private Class152 aClass152_1;

	@OriginalMember(owner = "client!s", name = "H", descriptor = "Lclient!ff;")
	private GlBuffer indexBuffer;

	@OriginalMember(owner = "client!s", name = "I", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!s", name = "J", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!s", name = "K", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!s", name = "N", descriptor = "[F")
	private float[] vertexT;

	@OriginalMember(owner = "client!s", name = "O", descriptor = "Lclient!ff;")
	private GlBuffer colorBuffer;

	@OriginalMember(owner = "client!s", name = "P", descriptor = "Lclient!ba;")
	public BoundingBox bounds;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "[B")
	private byte[] triangleBones;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "[F")
	private float[] vertexS;

	@OriginalMember(owner = "client!s", name = "U", descriptor = "[I")
	private int[] anIntArray506;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "[S")
	private short[] vertexSources;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!s", name = "X", descriptor = "[I")
	public int[] vertexX;

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "[[I")
	private int[][] boneVertices;

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "Lclient!lk;")
	private GlVertexBufferObject vbo;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "[B")
	private byte[] triangleAlpha;

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "[[I")
	private int[][] boneTriangles;

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "[Lclient!sk;")
	public ModelParticleEmitter[] particleEmitters;

	@OriginalMember(owner = "client!s", name = "F", descriptor = "I")
	public int vertexCount = 0;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "I")
	private int anInt4688 = 0;

	@OriginalMember(owner = "client!s", name = "D", descriptor = "B")
	private byte shareFlags = 0;

	@OriginalMember(owner = "client!s", name = "M", descriptor = "I")
	private int triangleCount = 0;

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "Z")
	public boolean aBoolean325 = false;

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "B")
	private byte aByte16 = 0;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
	private int anInt4691 = 0;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public GlModel() {
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!ml;IIZ)V")
	public GlModel(@OriginalArg(0) RawModel model, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(26) int[] local26 = new int[model.triangleCount];
		this.anIntArray506 = new int[model.vertexCount + 1];
		for (@Pc(35) int i = 0; i < model.triangleCount; i++) {
			if ((model.aByteArray40 == null || model.aByteArray40[i] != 2) && (model.triangleTextures == null || model.triangleTextures[i] == -1 || !Rasteriser.textureProvider.method442(model.triangleTextures[i] & 0xFFFF))) {
				local26[this.triangleCount++] = i;
				this.anIntArray506[model.triangleVertexA[i]]++;
				this.anIntArray506[model.triangleVertexB[i]]++;
				this.anIntArray506[model.triangleVertexC[i]]++;
			}
		}
		@Pc(118) long[] local118 = new long[this.triangleCount];
		for (@Pc(120) int i = 0; i < this.triangleCount; i++) {
			@Pc(128) int local128 = local26[i];
			@Pc(130) int local130 = 0;
			@Pc(132) byte local132 = 0;
			@Pc(134) int materialType = 0;
			@Pc(136) int materialArg = 0;
			@Pc(138) short texture = -1;
			if (model.triangleTextures != null) {
				texture = model.triangleTextures[local128];
				if (texture != -1) {
					materialType = Rasteriser.textureProvider.getMaterialType(texture & 0xFFFF);
					materialArg = Rasteriser.textureProvider.getMaterialArg(texture & 0xFFFF);
				}
			}
			@Pc(185) boolean local185 = model.triangleAlpha != null && model.triangleAlpha[local128] != 0 || texture != -1 && !Rasteriser.textureProvider.method443(texture & 0xFFFF);
			if ((arg3 || local185) && model.trianglePriorities != null) {
				local130 += model.trianglePriorities[local128] << 17;
			}
			if (local185) {
				local130 += 65536;
			}
			@Pc(215) int local215 = local130 + ((materialType & 0xFF) << 8);
			local215 += materialArg & 0xFF;
			@Pc(229) int local229 = local132 + ((texture & 0xFFFF) << 16);
			local229 += i & 0xFFFF;
			local118[i] = ((long) local215 << 32) + (long) local229;
		}
		ArrayUtils.sort(local118, local26);
		this.vertexCount = model.vertexCount;
		this.anInt4688 = model.anInt3355;
		this.vertexX = model.vertexX;
		this.vertexY = model.vertexY;
		this.vertexZ = model.vertexZ;
		this.vertexBones = model.vertexBones;
		this.vertexSources = model.vertexSources;
		this.particleEmitters = model.particleEmitters;
		this.particleEffectors = model.particleEffectors;
		@Pc(292) int local292 = this.triangleCount * 3;
		this.aShortArray95 = new short[local292];
		this.aShortArray90 = new short[local292];
		this.aShortArray87 = new short[local292];
		this.aShortArray89 = new short[local292];
		this.vertexS = new float[local292];
		this.vertexT = new float[local292];
		this.triangleColors = new short[this.triangleCount];
		this.triangleAlpha = new byte[this.triangleCount];
		this.aShortArray94 = new short[this.triangleCount];
		this.aShortArray97 = new short[this.triangleCount];
		this.aShortArray98 = new short[this.triangleCount];
		this.triangleTextures = new short[this.triangleCount];
		if (model.triangleBones != null) {
			this.triangleBones = new byte[this.triangleCount];
		}
		if (model.triangleSources != null) {
			this.triangleSources = new short[this.triangleCount];
		}
		this.bounds = new BoundingBox();
		this.vertexBuffer = new GlBuffer();
		this.colorBuffer = new GlBuffer();
		if (Preferences.highDetailLighting) {
			this.normalBuffer = new GlBuffer();
		}
		this.texCoordBuffer = new GlBuffer();
		this.indexBuffer = new GlBuffer();
		this.aShort43 = (short) arg1;
		this.aShort44 = (short) arg2;
		this.aShortArray93 = new short[local292];
		aLongArray43 = new long[local292];
		@Pc(411) int local411 = 0;
		for (@Pc(413) int local413 = 0; local413 < this.anInt4688; local413++) {
			@Pc(422) int local422 = this.anIntArray506[local413];
			this.anIntArray506[local413] = local411;
			local411 += local422;
		}
		this.anIntArray506[this.anInt4688] = local411;
		@Pc(441) int[] local441 = null;
		@Pc(443) int[] local443 = null;
		@Pc(445) int[] local445 = null;
		@Pc(448) float[][] local448 = null;
		if (model.aByteArray35 != null) {
			@Pc(454) int local454 = model.anInt3352;
			@Pc(457) int[] local457 = new int[local454];
			@Pc(460) int[] local460 = new int[local454];
			@Pc(463) int[] local463 = new int[local454];
			@Pc(466) int[] local466 = new int[local454];
			@Pc(469) int[] local469 = new int[local454];
			@Pc(472) int[] local472 = new int[local454];
			for (@Pc(474) int local474 = 0; local474 < local454; local474++) {
				local457[local474] = Integer.MAX_VALUE;
				local460[local474] = -2147483647;
				local463[local474] = Integer.MAX_VALUE;
				local466[local474] = -2147483647;
				local469[local474] = Integer.MAX_VALUE;
				local472[local474] = -2147483647;
			}
			for (@Pc(505) int local505 = 0; local505 < this.triangleCount; local505++) {
				@Pc(513) int local513 = local26[local505];
				if (model.aByteArray35[local513] != -1) {
					@Pc(526) int local526 = model.aByteArray35[local513] & 0xFF;
					for (@Pc(528) int local528 = 0; local528 < 3; local528++) {
						@Pc(538) int local538;
						if (local528 == 0) {
							local538 = model.triangleVertexA[local513];
						} else if (local528 == 1) {
							local538 = model.triangleVertexB[local513];
						} else {
							local538 = model.triangleVertexC[local513];
						}
						@Pc(558) int local558 = model.vertexX[local538];
						@Pc(563) int local563 = model.vertexY[local538];
						@Pc(568) int local568 = model.vertexZ[local538];
						if (local558 < local457[local526]) {
							local457[local526] = local558;
						}
						if (local558 > local460[local526]) {
							local460[local526] = local558;
						}
						if (local563 < local463[local526]) {
							local463[local526] = local563;
						}
						if (local563 > local466[local526]) {
							local466[local526] = local563;
						}
						if (local568 < local469[local526]) {
							local469[local526] = local568;
						}
						if (local568 > local472[local526]) {
							local472[local526] = local568;
						}
					}
				}
			}
			local441 = new int[local454];
			local443 = new int[local454];
			local445 = new int[local454];
			local448 = new float[local454][];
			for (@Pc(640) int local640 = 0; local640 < local454; local640++) {
				@Pc(648) byte local648 = model.aByteArray38[local640];
				if (local648 > 0) {
					local441[local640] = (local457[local640] + local460[local640]) / 2;
					local443[local640] = (local463[local640] + local466[local640]) / 2;
					local445[local640] = (local469[local640] + local472[local640]) / 2;
					@Pc(698) float local698;
					@Pc(729) float local729;
					@Pc(700) float local700;
					if (local648 == 1) {
						@Pc(694) short local694 = model.aShortArray60[local640];
						if (local694 == 0) {
							local698 = 1.0F;
							local700 = 1.0F;
						} else if (local694 > 0) {
							local698 = 1.0F;
							local700 = (float) local694 / 1024.0F;
						} else {
							local700 = 1.0F;
							local698 = (float) -local694 / 1024.0F;
						}
						local729 = 64.0F / (float) (model.aShortArray55[local640] & 0xFFFF);
					} else if (local648 == 2) {
						local698 = 64.0F / (float) (model.aShortArray60[local640] & 0xFFFF);
						local729 = 64.0F / (float) (model.aShortArray55[local640] & 0xFFFF);
						local700 = 64.0F / (float) (model.aShortArray58[local640] & 0xFFFF);
					} else {
						local698 = (float) model.aShortArray60[local640] / 1024.0F;
						local729 = (float) model.aShortArray55[local640] / 1024.0F;
						local700 = (float) model.aShortArray58[local640] / 1024.0F;
					}
					local448[local640] = method3864(model.aShortArray59[local640], model.aShortArray56[local640], model.aShortArray57[local640], model.aByteArray36[local640] & 0xFF, local698, local729, local700);
				}
			}
		}
		for (@Pc(817) int local817 = 0; local817 < this.triangleCount; local817++) {
			@Pc(825) int local825 = local26[local817];
			@Pc(832) int local832 = model.triangleColors[local825] & 0xFFFF;
			@Pc(837) short local837;
			if (model.triangleTextures == null) {
				local837 = -1;
			} else {
				local837 = model.triangleTextures[local825];
			}
			@Pc(848) int local848;
			if (model.aByteArray35 == null) {
				local848 = -1;
			} else {
				local848 = model.aByteArray35[local825];
			}
			@Pc(859) int local859;
			if (model.triangleAlpha == null) {
				local859 = 0;
			} else {
				local859 = model.triangleAlpha[local825] & 0xFF;
			}
			@Pc(869) float local869 = 0.0F;
			@Pc(871) float local871 = 0.0F;
			@Pc(873) float local873 = 0.0F;
			@Pc(875) float local875 = 0.0F;
			@Pc(877) float local877 = 0.0F;
			@Pc(879) float local879 = 0.0F;
			@Pc(881) byte local881 = 0;
			@Pc(883) byte local883 = 0;
			@Pc(885) int local885 = 0;
			if (local837 != -1) {
				if (local848 == -1) {
					local869 = 0.0F;
					local871 = 1.0F;
					local873 = 1.0F;
					local875 = 1.0F;
					local881 = 1;
					local877 = 0.0F;
					local879 = 0.0F;
					local883 = 2;
				} else {
					local848 &= 255;
					@Pc(917) byte local917 = model.aByteArray38[local848];
					if (local917 == 0) {
						@Pc(924) int local924 = model.triangleVertexA[local825];
						@Pc(929) int local929 = model.triangleVertexB[local825];
						@Pc(934) int local934 = model.triangleVertexC[local825];
						@Pc(939) short local939 = model.aShortArray59[local848];
						@Pc(944) short local944 = model.aShortArray56[local848];
						@Pc(949) short local949 = model.aShortArray57[local848];
						@Pc(955) float local955 = (float) model.vertexX[local939];
						@Pc(961) float local961 = (float) model.vertexY[local939];
						@Pc(967) float local967 = (float) model.vertexZ[local939];
						@Pc(975) float local975 = (float) model.vertexX[local944] - local955;
						@Pc(983) float local983 = (float) model.vertexY[local944] - local961;
						@Pc(991) float local991 = (float) model.vertexZ[local944] - local967;
						@Pc(999) float local999 = (float) model.vertexX[local949] - local955;
						@Pc(1007) float local1007 = (float) model.vertexY[local949] - local961;
						@Pc(1015) float local1015 = (float) model.vertexZ[local949] - local967;
						@Pc(1023) float local1023 = (float) model.vertexX[local924] - local955;
						@Pc(1031) float local1031 = (float) model.vertexY[local924] - local961;
						@Pc(1039) float local1039 = (float) model.vertexZ[local924] - local967;
						@Pc(1047) float local1047 = (float) model.vertexX[local929] - local955;
						@Pc(1055) float local1055 = (float) model.vertexY[local929] - local961;
						@Pc(1063) float local1063 = (float) model.vertexZ[local929] - local967;
						@Pc(1071) float local1071 = (float) model.vertexX[local934] - local955;
						@Pc(1079) float local1079 = (float) model.vertexY[local934] - local961;
						@Pc(1087) float local1087 = (float) model.vertexZ[local934] - local967;
						@Pc(1095) float local1095 = local983 * local1015 - local991 * local1007;
						@Pc(1103) float local1103 = local991 * local999 - local975 * local1015;
						@Pc(1111) float local1111 = local975 * local1007 - local983 * local999;
						@Pc(1119) float local1119 = local1007 * local1111 - local1015 * local1103;
						@Pc(1127) float local1127 = local1015 * local1095 - local999 * local1111;
						@Pc(1135) float local1135 = local999 * local1103 - local1007 * local1095;
						@Pc(1149) float local1149 = 1.0F / (local1119 * local975 + local1127 * local983 + local1135 * local991);
						local869 = (local1119 * local1023 + local1127 * local1031 + local1135 * local1039) * local1149;
						local873 = (local1119 * local1047 + local1127 * local1055 + local1135 * local1063) * local1149;
						local877 = (local1119 * local1071 + local1127 * local1079 + local1135 * local1087) * local1149;
						local1119 = local983 * local1111 - local991 * local1103;
						local1127 = local991 * local1095 - local975 * local1111;
						local1135 = local975 * local1103 - local983 * local1095;
						local1149 = 1.0F / (local1119 * local999 + local1127 * local1007 + local1135 * local1015);
						local871 = (local1119 * local1023 + local1127 * local1031 + local1135 * local1039) * local1149;
						local875 = (local1119 * local1047 + local1127 * local1055 + local1135 * local1063) * local1149;
						local879 = (local1119 * local1071 + local1127 * local1079 + local1135 * local1087) * local1149;
					} else {
						@Pc(1277) int local1277 = model.triangleVertexA[local825];
						@Pc(1282) int local1282 = model.triangleVertexB[local825];
						@Pc(1287) int local1287 = model.triangleVertexC[local825];
						@Pc(1291) int local1291 = local441[local848];
						@Pc(1295) int local1295 = local443[local848];
						@Pc(1299) int local1299 = local445[local848];
						@Pc(1303) float[] local1303 = local448[local848];
						@Pc(1308) byte local1308 = model.aByteArray39[local848];
						@Pc(1316) float local1316 = (float) model.aByteArray34[local848] / 256.0F;
						if (local917 == 1) {
							@Pc(1329) float local1329 = (float) (model.aShortArray58[local848] & 0xFFFF) / 1024.0F;
							method3871(model.vertexX[local1277], model.vertexY[local1277], model.vertexZ[local1277], local1291, local1295, local1299, local1303, local1329, local1308, local1316);
							local869 = aFloat115;
							local871 = aFloat118;
							method3871(model.vertexX[local1282], model.vertexY[local1282], model.vertexZ[local1282], local1291, local1295, local1299, local1303, local1329, local1308, local1316);
							local873 = aFloat115;
							local875 = aFloat118;
							method3871(model.vertexX[local1287], model.vertexY[local1287], model.vertexZ[local1287], local1291, local1295, local1299, local1303, local1329, local1308, local1316);
							local877 = aFloat115;
							local879 = aFloat118;
							@Pc(1405) float local1405 = local1329 / 2.0F;
							if ((local1308 & 0x1) == 0) {
								if (local873 - local869 > local1405) {
									local873 -= local1329;
									local881 = 1;
								} else if (local869 - local873 > local1405) {
									local873 += local1329;
									local881 = 2;
								}
								if (local877 - local869 > local1405) {
									local877 -= local1329;
									local883 = 1;
								} else if (local869 - local877 > local1405) {
									local877 += local1329;
									local883 = 2;
								}
							} else {
								if (local875 - local871 > local1405) {
									local875 -= local1329;
									local881 = 1;
								} else if (local871 - local875 > local1405) {
									local875 += local1329;
									local881 = 2;
								}
								if (local879 - local871 > local1405) {
									local879 -= local1329;
									local883 = 1;
								} else if (local871 - local879 > local1405) {
									local879 += local1329;
									local883 = 2;
								}
							}
						} else if (local917 == 2) {
							@Pc(1522) float local1522 = (float) model.aByteArray32[local848] / 256.0F;
							@Pc(1530) float local1530 = (float) model.aByteArray31[local848] / 256.0F;
							@Pc(1540) int local1540 = model.vertexX[local1282] - model.vertexX[local1277];
							@Pc(1550) int local1550 = model.vertexY[local1282] - model.vertexY[local1277];
							@Pc(1560) int local1560 = model.vertexZ[local1282] - model.vertexZ[local1277];
							@Pc(1570) int local1570 = model.vertexX[local1287] - model.vertexX[local1277];
							@Pc(1580) int local1580 = model.vertexY[local1287] - model.vertexY[local1277];
							@Pc(1590) int local1590 = model.vertexZ[local1287] - model.vertexZ[local1277];
							@Pc(1598) int local1598 = local1550 * local1590 - local1580 * local1560;
							@Pc(1606) int local1606 = local1560 * local1570 - local1590 * local1540;
							@Pc(1614) int local1614 = local1540 * local1580 - local1570 * local1550;
							@Pc(1624) float local1624 = 64.0F / (float) (model.aShortArray60[local848] & 0xFFFF);
							@Pc(1634) float local1634 = 64.0F / (float) (model.aShortArray55[local848] & 0xFFFF);
							@Pc(1644) float local1644 = 64.0F / (float) (model.aShortArray58[local848] & 0xFFFF);
							@Pc(1667) float local1667 = ((float) local1598 * local1303[0] + (float) local1606 * local1303[1] + (float) local1614 * local1303[2]) / local1624;
							@Pc(1690) float local1690 = ((float) local1598 * local1303[3] + (float) local1606 * local1303[4] + (float) local1614 * local1303[5]) / local1634;
							@Pc(1713) float local1713 = ((float) local1598 * local1303[6] + (float) local1606 * local1303[7] + (float) local1614 * local1303[8]) / local1644;
							local885 = Static32.method3877(local1667, local1690, local1713);
							method3856(model.vertexX[local1277], model.vertexY[local1277], model.vertexZ[local1277], local1291, local1295, local1299, local885, local1303, local1308, local1316, local1522, local1530);
							local869 = aFloat119;
							local871 = aFloat116;
							method3856(model.vertexX[local1282], model.vertexY[local1282], model.vertexZ[local1282], local1291, local1295, local1299, local885, local1303, local1308, local1316, local1522, local1530);
							local873 = aFloat119;
							local875 = aFloat116;
							method3856(model.vertexX[local1287], model.vertexY[local1287], model.vertexZ[local1287], local1291, local1295, local1299, local885, local1303, local1308, local1316, local1522, local1530);
							local877 = aFloat119;
							local879 = aFloat116;
						} else if (local917 == 3) {
							method3874(model.vertexX[local1277], model.vertexY[local1277], model.vertexZ[local1277], local1291, local1295, local1299, local1303, local1308, local1316);
							local869 = aFloat120;
							local871 = aFloat117;
							method3874(model.vertexX[local1282], model.vertexY[local1282], model.vertexZ[local1282], local1291, local1295, local1299, local1303, local1308, local1316);
							local873 = aFloat120;
							local875 = aFloat117;
							method3874(model.vertexX[local1287], model.vertexY[local1287], model.vertexZ[local1287], local1291, local1295, local1299, local1303, local1308, local1316);
							local877 = aFloat120;
							local879 = aFloat117;
							if ((local1308 & 0x1) == 0) {
								if (local873 - local869 > 0.5F) {
									local873--;
									local881 = 1;
								} else if (local869 - local873 > 0.5F) {
									local873++;
									local881 = 2;
								}
								if (local877 - local869 > 0.5F) {
									local877--;
									local883 = 1;
								} else if (local869 - local877 > 0.5F) {
									local877++;
									local883 = 2;
								}
							} else {
								if (local875 - local871 > 0.5F) {
									local875--;
									local881 = 1;
								} else if (local871 - local875 > 0.5F) {
									local875++;
									local881 = 2;
								}
								if (local879 - local871 > 0.5F) {
									local879--;
									local883 = 1;
								} else if (local871 - local879 > 0.5F) {
									local879++;
									local883 = 2;
								}
							}
						}
					}
				}
			}
			model.calculateNormals();
			@Pc(1981) byte local1981;
			if (model.aByteArray40 == null) {
				local1981 = 0;
			} else {
				local1981 = model.aByteArray40[local825];
			}
			if (local1981 == 0) {
				@Pc(2009) long local2009 = (long) (local848 << 2) + ((long) (local885 << 24) + (long) (local832 << 8) + (long) local859 << 32);
				@Pc(2014) int local2014 = model.triangleVertexA[local825];
				@Pc(2019) VertexNormal local2019 = model.vertexNormals[local2014];
				this.aShortArray94[local817] = this.method3853(model, local2014, local2009, local2019.x, local2019.y, local2019.z, local2019.triangles, local869, local871);
				@Pc(2043) int local2043 = model.triangleVertexB[local825];
				@Pc(2048) VertexNormal local2048 = model.vertexNormals[local2043];
				this.aShortArray97[local817] = this.method3853(model, local2043, local2009 + (long) local881, local2048.x, local2048.y, local2048.z, local2048.triangles, local873, local875);
				@Pc(2075) int local2075 = model.triangleVertexC[local825];
				@Pc(2080) VertexNormal local2080 = model.vertexNormals[local2075];
				this.aShortArray98[local817] = this.method3853(model, local2075, local2009 + (long) local883, local2080.x, local2080.y, local2080.z, local2080.triangles, local877, local879);
			} else if (local1981 == 1) {
				@Pc(2111) TriangleNormal local2111 = model.triangleNormals[local825];
				@Pc(2152) long local2152 = (long) ((local848 << 2) + (local2111.x > 0 ? 1024 : 2048) + (local2111.y + 256 << 12) + (local2111.z + 256 << 22)) + ((long) (local885 << 24) + (long) (local832 << 8) + (long) local859 << 32);
				this.aShortArray94[local817] = this.method3853(model, model.triangleVertexA[local825], local2152, local2111.x, local2111.y, local2111.z, 0, local869, local871);
				this.aShortArray97[local817] = this.method3853(model, model.triangleVertexB[local825], local2152 + (long) local881, local2111.x, local2111.y, local2111.z, 0, local873, local875);
				this.aShortArray98[local817] = this.method3853(model, model.triangleVertexC[local825], local2152 + (long) local883, local2111.x, local2111.y, local2111.z, 0, local877, local879);
			}
			if (model.triangleTextures == null) {
				this.triangleTextures[local817] = -1;
			} else {
				this.triangleTextures[local817] = model.triangleTextures[local825];
			}
			if (this.triangleBones != null) {
				this.triangleBones[local817] = (byte) model.triangleBones[local825];
			}
			this.triangleColors[local817] = model.triangleColors[local825];
			if (model.triangleAlpha != null) {
				this.triangleAlpha[local817] = model.triangleAlpha[local825];
			}
			if (model.triangleSources != null) {
				this.triangleSources[local817] = model.triangleSources[local825];
			}
		}
		@Pc(2284) int local2284 = 0;
		@Pc(2286) short local2286 = -10000;
		for (@Pc(2288) int local2288 = 0; local2288 < this.triangleCount; local2288++) {
			@Pc(2297) short local2297 = this.triangleTextures[local2288];
			if (local2297 != local2286) {
				local2284++;
				local2286 = local2297;
			}
		}
		this.anIntArray505 = new int[local2284 + 1];
		@Pc(2313) int local2313 = 0;
		@Pc(2315) short local2315 = -10000;
		for (@Pc(2317) int local2317 = 0; local2317 < this.triangleCount; local2317++) {
			@Pc(2326) short local2326 = this.triangleTextures[local2317];
			if (local2326 != local2315) {
				this.anIntArray505[local2313++] = local2317;
				local2315 = local2326;
			}
		}
		this.anIntArray505[local2313] = this.triangleCount;
		aLongArray43 = null;
		this.aShortArray95 = ArrayUtils.copyOf(this.aShortArray95, this.anInt4691);
		this.aShortArray90 = ArrayUtils.copyOf(this.aShortArray90, this.anInt4691);
		this.aShortArray87 = ArrayUtils.copyOf(this.aShortArray87, this.anInt4691);
		this.aShortArray89 = ArrayUtils.copyOf(this.aShortArray89, this.anInt4691);
		this.vertexS = ArrayUtils.copyOf(this.vertexS, this.anInt4691);
		this.vertexT = ArrayUtils.copyOf(this.vertexT, this.anInt4691);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lclient!vc;")
	@Override
	public final Entity method3809() {
		this.aBoolean325 = false;
		if (this.aClass152_1 != null) {
			this.aShortArray95 = this.aClass152_1.aShortArray84;
			this.aShortArray90 = this.aClass152_1.aShortArray82;
			this.aShortArray87 = this.aClass152_1.aShortArray83;
			this.aShortArray89 = this.aClass152_1.aShortArray85;
			this.aClass152_1 = null;
		}
		return this;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "()I")
	@Override
	public final int getMinZ() {
		if (!this.bounds.valid) {
			this.calculateBounds();
		}
		return this.bounds.minZ;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(SS)V")
	public final void retexture(@OriginalArg(0) short source, @OriginalArg(1) short destination) {
		for (@Pc(1) int i = 0; i < this.triangleCount; i++) {
			if (this.triangleTextures[i] == source) {
				this.triangleTextures[i] = destination;
			}
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		if (source != -1) {
			local20 = Rasteriser.textureProvider.method450(source & 0xFFFF);
			local22 = Rasteriser.textureProvider.method447(source & 0xFFFF);
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (destination != -1) {
			local41 = Rasteriser.textureProvider.method450(destination & 0xFFFF);
			local43 = Rasteriser.textureProvider.method447(destination & 0xFFFF);
		}
		if (local20 != local41 || local22 != local43) {
			this.colorBuffer.valid = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "()I")
	@Override
	public final int getMinX() {
		if (!this.bounds.valid) {
			this.calculateBounds();
		}
		return this.bounds.minX;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public final void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		if (this.anInt4691 == 0) {
			return;
		}
		if (!this.bounds.valid) {
			this.calculateBounds();
		}
		@Pc(13) short local13 = this.bounds.cylinderRadius;
		@Pc(17) short local17 = this.bounds.minY;
		@Pc(21) short local21 = this.bounds.maxY;
		if (arg10 != null) {
			arg10.method2970(arg0, arg9, arg5, arg6, arg7);
		}
		@Pc(40) int local40 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(50) int local50 = arg6 * arg1 + local40 * arg2 >> 16;
		@Pc(62) int local62 = local50 + (local13 * arg2 + local21 * arg1 >> 16);
		if (local62 <= 50) {
			return;
		}
		@Pc(79) int local79 = local50 + (-local13 * arg2 + local17 * arg1 >> 16);
		if (local79 >= 3584) {
			return;
		}
		@Pc(93) int local93 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(99) int local99 = local93 + local13 << 9;
		if (local99 / local62 <= Static7.anInt5437) {
			return;
		}
		@Pc(111) int local111 = local93 - local13 << 9;
		if (local111 / local62 >= Static4.anInt3123) {
			return;
		}
		@Pc(127) int local127 = arg6 * arg2 - local40 * arg1 >> 16;
		@Pc(141) int local141 = local127 + (local13 * arg1 + local21 * arg2 >> 16) << 9;
		if (local141 / local62 <= Static7.anInt6030) {
			return;
		}
		@Pc(162) int local162 = local127 + (-local13 * arg1 + local17 * arg2 >> 16) << 9;
		if (local162 / local62 >= Static1.anInt403) {
			return;
		}
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		if (arg0 != 0) {
			local170 = MathUtils.SINE[arg0];
			local172 = MathUtils.COSINE[arg0];
		}
		if (arg8 > 0L && Static1.aBoolean8 && local79 > 0) {
			@Pc(196) int local196;
			@Pc(200) int local200;
			if (local93 > 0) {
				local196 = local111 / local62;
				local200 = local99 / local79;
			} else {
				local196 = local111 / local79;
				local200 = local99 / local62;
			}
			@Pc(215) int local215;
			@Pc(219) int local219;
			if (local127 > 0) {
				local215 = local162 / local62;
				local219 = local141 / local79;
			} else {
				local215 = local162 / local79;
				local219 = local141 / local62;
			}
			if (Static7.anInt5333 >= local196 && Static7.anInt5333 <= local200 && Static1.anInt3 >= local215 && Static1.anInt3 <= local219) {
				@Pc(242) int local242 = 999999;
				@Pc(244) int local244 = -999999;
				@Pc(246) int local246 = 999999;
				@Pc(248) int local248 = -999999;
				@Pc(252) short local252 = this.bounds.minX;
				@Pc(256) short local256 = this.bounds.maxX;
				@Pc(260) short local260 = this.bounds.minZ;
				@Pc(264) short local264 = this.bounds.maxZ;
				@Pc(299) int[] local299 = new int[] { local252, local256, local252, local256, local252, local256, local252, local256 };
				@Pc(334) int[] local334 = new int[] { local260, local260, local264, local264, local260, local260, local264, local264 };
				@Pc(369) int[] local369 = new int[] { local17, local17, local17, local17, local21, local21, local21, local21 };
				for (@Pc(371) int local371 = 0; local371 < 8; local371++) {
					@Pc(378) int local378 = local299[local371];
					@Pc(382) int local382 = local369[local371];
					@Pc(386) int local386 = local334[local371];
					if (arg0 != 0) {
						@Pc(398) int local398 = local386 * local170 + local378 * local172 >> 16;
						local386 = local386 * local172 - local378 * local170 >> 16;
						local378 = local398;
					}
					@Pc(414) int local414 = local378 + arg5;
					@Pc(418) int local418 = local382 + arg6;
					@Pc(422) int local422 = local386 + arg7;
					@Pc(432) int local432 = local422 * arg3 + local414 * arg4 >> 16;
					local422 = local422 * arg4 - local414 * arg3 >> 16;
					local414 = local432;
					local432 = local418 * arg2 - local422 * arg1 >> 16;
					local422 = local418 * arg1 + local422 * arg2 >> 16;
					if (local422 > 0) {
						@Pc(474) int local474 = (local414 << 9) / local422;
						@Pc(480) int local480 = (local432 << 9) / local422;
						if (local474 < local242) {
							local242 = local474;
						}
						if (local474 > local244) {
							local244 = local474;
						}
						if (local480 < local246) {
							local246 = local480;
						}
						if (local480 > local248) {
							local248 = local480;
						}
					}
				}
				if (Static7.anInt5333 >= local242 && Static7.anInt5333 <= local244 && Static1.anInt3 >= local246 && Static1.anInt3 <= local248) {
					if (this.aBoolean324) {
						Static5.keys[Static7.keysSize++] = arg8;
					} else {
						if (Static6.anIntArray509.length < this.anInt4691) {
							Static6.anIntArray509 = new int[this.anInt4691];
							Static6.anIntArray508 = new int[this.anInt4691];
						}
						@Pc(541) int local541 = 0;
						label124:
						while (true) {
							if (local541 >= this.anInt4688) {
								@Pc(698) int local698 = 0;
								while (true) {
									if (local698 >= this.triangleCount) {
										break label124;
									}
									@Pc(707) short local707 = this.aShortArray94[local698];
									@Pc(712) short local712 = this.aShortArray97[local698];
									@Pc(717) short local717 = this.aShortArray98[local698];
									if (this.method3868(Static7.anInt5333, Static1.anInt3, Static6.anIntArray508[local707], Static6.anIntArray508[local712], Static6.anIntArray508[local717], Static6.anIntArray509[local707], Static6.anIntArray509[local712], Static6.anIntArray509[local717])) {
										Static5.keys[Static7.keysSize++] = arg8;
										break label124;
									}
									local698++;
								}
							}
							@Pc(550) int local550 = this.vertexX[local541];
							@Pc(555) int local555 = this.vertexY[local541];
							@Pc(560) int local560 = this.vertexZ[local541];
							if (arg0 != 0) {
								@Pc(572) int local572 = local560 * local170 + local550 * local172 >> 16;
								local560 = local560 * local172 - local550 * local170 >> 16;
								local550 = local572;
							}
							@Pc(588) int local588 = local550 + arg5;
							@Pc(592) int local592 = local555 + arg6;
							@Pc(596) int local596 = local560 + arg7;
							@Pc(606) int local606 = local596 * arg3 + local588 * arg4 >> 16;
							local596 = local596 * arg4 - local588 * arg3 >> 16;
							local588 = local606;
							local606 = local592 * arg2 - local596 * arg1 >> 16;
							local596 = local592 * arg1 + local596 * arg2 >> 16;
							if (local596 < 50) {
								break;
							}
							@Pc(650) int local650 = (local588 << 9) / local596;
							@Pc(656) int local656 = (local606 << 9) / local596;
							@Pc(661) int local661 = this.anIntArray506[local541];
							@Pc(668) int local668 = this.anIntArray506[local541 + 1];
							for (@Pc(670) int local670 = local661; local670 < local668; local670++) {
								@Pc(680) int local680 = this.aShortArray93[local670] - 1;
								if (local680 == -1) {
									break;
								}
								Static6.anIntArray509[local680] = local650;
								Static6.anIntArray508[local680] = local656;
							}
							local541++;
						}
					}
				}
			}
		}
		@Pc(753) GL gl = GlRenderer.gl;
		gl.glPushMatrix();
		gl.glTranslatef((float) arg5, (float) arg6, (float) arg7);
		gl.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		this.method3858();
		gl.glPopMatrix();
		if (arg10 != null) {
			arg10.method2953(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected final void transform(@OriginalArg(0) int type, @OriginalArg(1) int[] bone, @OriginalArg(2) int x, @OriginalArg(3) int y, @OriginalArg(4) int z, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = bone.length;
		if (type == 0) {
			x <<= 4;
			y <<= 4;
			z <<= 4;
			@Pc(18) int local18 = 0;
			originX = 0;
			originY = 0;
			originZ = 0;
			for (@Pc(26) int local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = bone[local26];
				if (local33 < this.boneVertices.length) {
					@Pc(43) int[] local43 = this.boneVertices[local33];
					for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
						@Pc(53) int local53 = local43[local45];
						originX += this.vertexX[local53];
						originY += this.vertexY[local53];
						originZ += this.vertexZ[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				originX = originX / local18 + x;
				originY = originY / local18 + y;
				originZ = originZ / local18 + z;
			} else {
				originX = x;
				originY = y;
				originZ = z;
			}
		} else if (type == 1) {
			x <<= 4;
			y <<= 4;
			z <<= 4;
			for (@Pc(124) int local124 = 0; local124 < local2; local124++) {
				@Pc(131) int local131 = bone[local124];
				if (local131 < this.boneVertices.length) {
					@Pc(141) int[] local141 = this.boneVertices[local131];
					for (@Pc(143) int local143 = 0; local143 < local141.length; local143++) {
						@Pc(151) int local151 = local141[local143];
						@Pc(153) int[] local153 = this.vertexX;
						local153[local151] += x;
						local153 = this.vertexY;
						local153[local151] += y;
						local153 = this.vertexZ;
						local153[local151] += z;
					}
				}
			}
		} else if (type == 2) {
			for (@Pc(185) int local185 = 0; local185 < local2; local185++) {
				@Pc(192) int local192 = bone[local185];
				if (local192 < this.boneVertices.length) {
					@Pc(202) int[] local202 = this.boneVertices[local192];
					for (@Pc(204) int local204 = 0; local204 < local202.length; local204++) {
						@Pc(212) int local212 = local202[local204];
						@Pc(214) int[] local214 = this.vertexX;
						local214[local212] -= originX;
						local214 = this.vertexY;
						local214[local212] -= originY;
						local214 = this.vertexZ;
						local214[local212] -= originZ;
						if (z != 0) {
							@Pc(242) int local242 = MathUtils.SINE[z];
							@Pc(246) int local246 = MathUtils.COSINE[z];
							@Pc(264) int local264 = this.vertexY[local212] * local242 + this.vertexX[local212] * local246 + 32767 >> 16;
							this.vertexY[local212] = this.vertexY[local212] * local246 + 32767 - this.vertexX[local212] * local242 >> 16;
							this.vertexX[local212] = local264;
						}
						if (x != 0) {
							@Pc(296) int local296 = MathUtils.SINE[x];
							@Pc(300) int local300 = MathUtils.COSINE[x];
							@Pc(318) int local318 = this.vertexY[local212] * local300 + 32767 - this.vertexZ[local212] * local296 >> 16;
							this.vertexZ[local212] = this.vertexY[local212] * local296 + this.vertexZ[local212] * local300 + 32767 >> 16;
							this.vertexY[local212] = local318;
						}
						if (y != 0) {
							@Pc(350) int local350 = MathUtils.SINE[y];
							@Pc(354) int local354 = MathUtils.COSINE[y];
							@Pc(372) int local372 = this.vertexZ[local212] * local350 + this.vertexX[local212] * local354 + 32767 >> 16;
							this.vertexZ[local212] = this.vertexZ[local212] * local354 + 32767 - this.vertexX[local212] * local350 >> 16;
							this.vertexX[local212] = local372;
						}
						@Pc(400) int[] local400 = this.vertexX;
						local400[local212] += originX;
						local400 = this.vertexY;
						local400[local212] += originY;
						local400 = this.vertexZ;
						local400[local212] += originZ;
					}
				}
			}
			if (arg5 && this.aShortArray95 != null) {
				for (@Pc(433) int local433 = 0; local433 < local2; local433++) {
					@Pc(440) int local440 = bone[local433];
					if (local440 < this.boneVertices.length) {
						@Pc(450) int[] local450 = this.boneVertices[local440];
						for (@Pc(452) int local452 = 0; local452 < local450.length; local452++) {
							@Pc(460) int local460 = local450[local452];
							@Pc(465) int local465 = this.anIntArray506[local460];
							@Pc(472) int local472 = this.anIntArray506[local460 + 1];
							for (@Pc(474) int local474 = local465; local474 < local472; local474++) {
								@Pc(484) int local484 = this.aShortArray93[local474] - 1;
								if (local484 == -1) {
									break;
								}
								if (z != 0) {
									@Pc(494) int local494 = MathUtils.SINE[z];
									@Pc(498) int local498 = MathUtils.COSINE[z];
									@Pc(516) int local516 = this.aShortArray90[local484] * local494 + this.aShortArray95[local484] * local498 + 32767 >> 16;
									this.aShortArray90[local484] = (short) (this.aShortArray90[local484] * local498 + 32767 - this.aShortArray95[local484] * local494 >> 16);
									this.aShortArray95[local484] = (short) local516;
								}
								if (x != 0) {
									@Pc(550) int local550 = MathUtils.SINE[x];
									@Pc(554) int local554 = MathUtils.COSINE[x];
									@Pc(572) int local572 = this.aShortArray90[local484] * local554 + 32767 - this.aShortArray87[local484] * local550 >> 16;
									this.aShortArray87[local484] = (short) (this.aShortArray90[local484] * local550 + this.aShortArray87[local484] * local554 + 32767 >> 16);
									this.aShortArray90[local484] = (short) local572;
								}
								if (y != 0) {
									@Pc(606) int local606 = MathUtils.SINE[y];
									@Pc(610) int local610 = MathUtils.COSINE[y];
									@Pc(628) int local628 = this.aShortArray87[local484] * local606 + this.aShortArray95[local484] * local610 + 32767 >> 16;
									this.aShortArray87[local484] = (short) (this.aShortArray87[local484] * local610 + 32767 - this.aShortArray95[local484] * local606 >> 16);
									this.aShortArray95[local484] = (short) local628;
								}
							}
						}
					}
				}
				if (this.normalBuffer != null) {
					this.normalBuffer.valid = false;
				}
			}
		} else if (type == 3) {
			for (@Pc(675) int local675 = 0; local675 < local2; local675++) {
				@Pc(682) int local682 = bone[local675];
				if (local682 < this.boneVertices.length) {
					@Pc(692) int[] local692 = this.boneVertices[local682];
					for (@Pc(694) int local694 = 0; local694 < local692.length; local694++) {
						@Pc(702) int local702 = local692[local694];
						@Pc(704) int[] local704 = this.vertexX;
						local704[local702] -= originX;
						local704 = this.vertexY;
						local704[local702] -= originY;
						local704 = this.vertexZ;
						local704[local702] -= originZ;
						this.vertexX[local702] = this.vertexX[local702] * x >> 7;
						this.vertexY[local702] = this.vertexY[local702] * y >> 7;
						this.vertexZ[local702] = this.vertexZ[local702] * z >> 7;
						local704 = this.vertexX;
						local704[local702] += originX;
						local704 = this.vertexY;
						local704[local702] += originY;
						local704 = this.vertexZ;
						local704[local702] += originZ;
					}
				}
			}
		} else if (type == 5) {
			if (this.boneTriangles != null && this.triangleAlpha != null) {
				for (@Pc(802) int local802 = 0; local802 < local2; local802++) {
					@Pc(809) int local809 = bone[local802];
					if (local809 < this.boneTriangles.length) {
						@Pc(819) int[] local819 = this.boneTriangles[local809];
						for (@Pc(821) int local821 = 0; local821 < local819.length; local821++) {
							@Pc(829) int local829 = local819[local821];
							@Pc(840) int local840 = (this.triangleAlpha[local829] & 0xFF) + x * 8;
							if (local840 < 0) {
								local840 = 0;
							} else if (local840 > 255) {
								local840 = 255;
							}
							this.triangleAlpha[local829] = (byte) local840;
						}
						if (local819.length > 0) {
							this.colorBuffer.valid = false;
						}
					}
				}
			}
		} else if (type == 7 && this.boneTriangles != null) {
			for (@Pc(876) int local876 = 0; local876 < local2; local876++) {
				@Pc(883) int local883 = bone[local876];
				if (local883 < this.boneTriangles.length) {
					@Pc(893) int[] local893 = this.boneTriangles[local883];
					for (@Pc(895) int local895 = 0; local895 < local893.length; local895++) {
						@Pc(903) int local903 = local893[local895];
						@Pc(910) int local910 = this.triangleColors[local903] & 0xFFFF;
						@Pc(916) int local916 = local910 >> 10 & 0x3F;
						@Pc(922) int local922 = local910 >> 7 & 0x7;
						@Pc(926) int local926 = local910 & 0x7F;
						local916 = local916 + x & 0x3F;
						@Pc(938) int local938 = local922 + y / 4;
						if (local938 < 0) {
							local938 = 0;
						} else if (local938 > 7) {
							local938 = 7;
						}
						@Pc(952) int local952 = local926 + z;
						if (local952 < 0) {
							local952 = 0;
						} else if (local952 > 127) {
							local952 = 127;
						}
						this.triangleColors[local903] = (short) (local916 << 10 | local938 << 7 | local952);
					}
					if (local893.length > 0) {
						this.colorBuffer.valid = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "()I")
	@Override
	public final int getMinY() {
		if (!this.bounds.valid) {
			this.calculateBounds();
		}
		return this.bounds.minY;
	}

	@OriginalMember(owner = "client!s", name = "o", descriptor = "()I")
	public final int method3847() {
		return this.aShort43;
	}

	@OriginalMember(owner = "client!s", name = "p", descriptor = "()V")
	public final void method3848() {
		if (this.aShortArray95 == null) {
			this.method3827();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.vertexCount; local7++) {
			@Pc(16) int local16 = this.vertexZ[local7];
			this.vertexZ[local7] = this.vertexX[local7];
			this.vertexX[local7] = -local16;
		}
		for (@Pc(34) int local34 = 0; local34 < this.anInt4691; local34++) {
			@Pc(43) short local43 = this.aShortArray87[local34];
			this.aShortArray87[local34] = this.aShortArray95[local34];
			this.aShortArray95[local34] = (short) -local43;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
		if (this.normalBuffer != null) {
			this.normalBuffer.valid = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "()I")
	@Override
	public final int getBoundingCylinderRadius() {
		if (!this.bounds.valid) {
			this.calculateBounds();
		}
		return this.bounds.cylinderRadius;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public final void method3822(@OriginalArg(1) int yAngle, @OriginalArg(2) int zAngle, @OriginalArg(3) int xAngle, @OriginalArg(4) int xOffset, @OriginalArg(5) int yOffset, @OriginalArg(6) int zOffset, @OriginalArg(7) long arg6) {
		if (this.anInt4691 == 0) {
			return;
		}
		@Pc(5) GL gl = GlRenderer.gl;
		gl.glPushMatrix();
		if (xAngle != 0) {
			gl.glRotatef((float) xAngle * 0.17578125F, 1.0F, 0.0F, 0.0F);
		}
		gl.glTranslatef((float) xOffset, (float) yOffset, (float) zOffset);
		if (yAngle != 0) {
			gl.glRotatef((float) yAngle * 0.17578125F, 0.0F, 1.0F, 0.0F);
		}
		if (zAngle != 0) {
			gl.glRotatef((float) -zAngle * 0.17578125F, 0.0F, 0.0F, 1.0F);
		}
		this.method3858();
		gl.glPopMatrix();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	@Override
	public final void method3815(@OriginalArg(0) int angle) {
		@Pc(3) int sine = MathUtils.SINE[angle];
		@Pc(7) int cosine = MathUtils.COSINE[angle];
		for (@Pc(9) int i = 0; i < this.vertexCount; i++) {
			@Pc(29) int local29 = this.vertexZ[i] * sine + this.vertexX[i] * cosine >> 16;
			this.vertexZ[i] = this.vertexZ[i] * cosine - this.vertexX[i] * sine >> 16;
			this.vertexX[i] = local29;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "q", descriptor = "()V")
	public final void method3849() {
		if (this.aShortArray95 == null) {
			this.method3828();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.vertexCount; local7++) {
			this.vertexX[local7] = -this.vertexX[local7];
			this.vertexZ[local7] = -this.vertexZ[local7];
		}
		for (@Pc(33) int local33 = 0; local33 < this.anInt4691; local33++) {
			this.aShortArray95[local33] = (short) -this.aShortArray95[local33];
			this.aShortArray87[local33] = (short) -this.aShortArray87[local33];
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
		if (this.normalBuffer != null) {
			this.normalBuffer.valid = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "r", descriptor = "()V")
	public final void method3850() {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			this.vertexZ[i] = -this.vertexZ[i];
		}
		if (this.aShortArray87 != null) {
			for (@Pc(21) int i = 0; i < this.anInt4691; i++) {
				this.aShortArray87[i] = (short) -this.aShortArray87[i];
			}
		}
		for (@Pc(39) int i = 0; i < this.triangleCount; i++) {
			@Pc(48) short local48 = this.aShortArray94[i];
			this.aShortArray94[i] = this.aShortArray98[i];
			this.aShortArray98[i] = local48;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
		if (this.normalBuffer != null) {
			this.normalBuffer.valid = false;
		}
		this.indexBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "j", descriptor = "()Z")
	@Override
	protected final boolean method3830() {
		if (this.boneVertices == null) {
			return false;
		}
		for (@Pc(6) int i = 0; i < this.vertexCount; i++) {
			@Pc(12) int[] vertex = this.vertexX;
			vertex[i] <<= 4;
			vertex = this.vertexY;
			vertex[i] <<= 4;
			vertex = this.vertexZ;
			vertex[i] <<= 4;
		}
		originX = 0;
		originY = 0;
		originZ = 0;
		return true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()Z")
	@Override
	public final boolean method3808() {
		return this.aBoolean325 && this.vertexX != null && this.aShortArray95 != null;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	@Override
	public final void method3832(@OriginalArg(0) int angle) {
		@Pc(3) int sine = MathUtils.SINE[angle];
		@Pc(7) int cosine = MathUtils.COSINE[angle];
		for (@Pc(9) int i = 0; i < this.vertexCount; i++) {
			@Pc(29) int local29 = this.vertexY[i] * cosine - this.vertexZ[i] * sine >> 16;
			this.vertexZ[i] = this.vertexY[i] * sine + this.vertexZ[i] * cosine >> 16;
			this.vertexY[i] = local29;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "s", descriptor = "()V")
	private void method3851() {
		if (tempBuffer.bytes.length < this.triangleCount * 12) {
			tempBuffer = new Buffer((this.triangleCount + 100) * 12);
		} else {
			tempBuffer.position = 0;
		}
		if (GlRenderer.bigEndian) {
			for (@Pc(25) int i = 0; i < this.triangleCount; i++) {
				tempBuffer.writeInt(this.aShortArray94[i]);
				tempBuffer.writeInt(this.aShortArray97[i]);
				tempBuffer.writeInt(this.aShortArray98[i]);
			}
		} else {
			for (@Pc(55) int i = 0; i < this.triangleCount; i++) {
				tempBuffer.writeIntLE(this.aShortArray94[i]);
				tempBuffer.writeIntLE(this.aShortArray97[i]);
				tempBuffer.writeIntLE(this.aShortArray98[i]);
			}
		}
		if (!GlRenderer.arbVboSupported) {
			@Pc(115) ByteBuffer buffer = ByteBuffer.allocateDirect(tempBuffer.position);
			buffer.put(tempBuffer.bytes, 0, tempBuffer.position);
			buffer.flip();
			this.indexBuffer.valid = true;
			this.indexBuffer.buffer = buffer;
			this.indexBuffer.vbo = null;
			return;
		}
		@Pc(88) GlVertexBufferObject vbo = new GlVertexBufferObject();
		@Pc(95) ByteBuffer buffer = ByteBuffer.wrap(tempBuffer.bytes, 0, tempBuffer.position);
		vbo.setArrayBuffer(buffer);
		this.indexBuffer.valid = true;
		this.indexBuffer.buffer = null;
		this.indexBuffer.vbo = vbo;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZZZZZZZ)Lclient!s;")
	public final GlModel method3852(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) boolean arg8) {
		@Pc(3) GlModel model = new GlModel();
		model.vertexCount = this.vertexCount;
		model.anInt4688 = this.anInt4688;
		model.anInt4691 = this.anInt4691;
		model.triangleCount = this.triangleCount;
		if (arg0) {
			model.vertexX = this.vertexX;
			model.vertexZ = this.vertexZ;
		} else {
			model.vertexX = ArrayUtils.copyOfNullable(this.vertexX);
			model.vertexZ = ArrayUtils.copyOfNullable(this.vertexZ);
		}
		if (arg1) {
			model.vertexY = this.vertexY;
		} else {
			model.vertexY = ArrayUtils.copyOfNullable(this.vertexY);
		}
		if (arg0 && arg1) {
			model.vertexBuffer = this.vertexBuffer;
			model.bounds = this.bounds;
		} else {
			model.vertexBuffer = new GlBuffer();
			model.bounds = new BoundingBox();
		}
		if (arg2) {
			model.triangleColors = this.triangleColors;
		} else {
			model.triangleColors = ArrayUtils.copyOfNullable(this.triangleColors);
		}
		model.triangleAlpha = this.triangleAlpha;
		if (arg2 && arg3 && (arg6 && arg4 || Preferences.highDetailLighting)) {
			model.colorBuffer = this.colorBuffer;
		} else {
			model.colorBuffer = new GlBuffer();
		}
		if (arg4) {
			model.aShortArray95 = this.aShortArray95;
			model.aShortArray90 = this.aShortArray90;
			model.aShortArray87 = this.aShortArray87;
			model.aShortArray89 = this.aShortArray89;
		} else {
			model.aShortArray95 = ArrayUtils.copyOfNullable(this.aShortArray95);
			model.aShortArray90 = ArrayUtils.copyOfNullable(this.aShortArray90);
			model.aShortArray87 = ArrayUtils.copyOfNullable(this.aShortArray87);
			model.aShortArray89 = ArrayUtils.copyOfNullable(this.aShortArray89);
		}
		if (!Preferences.highDetailLighting) {
			model.normalBuffer = null;
		} else if (arg4 && arg5 && arg6) {
			model.normalBuffer = this.normalBuffer;
		} else {
			model.normalBuffer = new GlBuffer();
		}
		model.vertexS = this.vertexS;
		model.vertexT = this.vertexT;
		model.texCoordBuffer = this.texCoordBuffer;
		if (arg7) {
			model.aShortArray94 = this.aShortArray94;
			model.aShortArray97 = this.aShortArray97;
			model.aShortArray98 = this.aShortArray98;
			model.indexBuffer = this.indexBuffer;
		} else {
			model.aShortArray94 = ArrayUtils.copyOfNullable(this.aShortArray94);
			model.aShortArray97 = ArrayUtils.copyOfNullable(this.aShortArray97);
			model.aShortArray98 = ArrayUtils.copyOfNullable(this.aShortArray98);
			model.indexBuffer = new GlBuffer();
		}
		if (arg8) {
			model.triangleTextures = this.triangleTextures;
		} else {
			model.triangleTextures = ArrayUtils.copyOfNullable(this.triangleTextures);
		}
		model.vertexBones = this.vertexBones;
		model.boneVertices = this.boneVertices;
		model.triangleBones = this.triangleBones;
		model.boneTriangles = this.boneTriangles;
		model.anIntArray505 = this.anIntArray505;
		model.aShortArray93 = this.aShortArray93;
		model.anIntArray506 = this.anIntArray506;
		model.aShort43 = this.aShort43;
		model.aShort44 = this.aShort44;
		model.particleEmitters = this.particleEmitters;
		model.particleEffectors = this.particleEffectors;
		model.vertexSources = this.vertexSources;
		model.triangleSources = this.triangleSources;
		return model;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ml;IJIIIIFF)S")
	private short method3853(@OriginalArg(0) RawModel arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float s, @OriginalArg(8) float t) {
		@Pc(4) int local4 = this.anIntArray506[arg1];
		@Pc(11) int local11 = this.anIntArray506[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			@Pc(23) short local23 = this.aShortArray93[local15];
			if (local23 == 0) {
				local13 = local15;
				break;
			}
			if (aLongArray43[local15] == arg2) {
				return (short) (local23 - 1);
			}
		}
		this.aShortArray93[local13] = (short) (this.anInt4691 + 1);
		aLongArray43[local13] = arg2;
		this.aShortArray95[this.anInt4691] = (short) arg3;
		this.aShortArray90[this.anInt4691] = (short) arg4;
		this.aShortArray87[this.anInt4691] = (short) arg5;
		this.aShortArray89[this.anInt4691] = (short) arg6;
		this.vertexS[this.anInt4691] = s;
		this.vertexT[this.anInt4691] = t;
		return (short) this.anInt4691++;
	}

	@OriginalMember(owner = "client!s", name = "l", descriptor = "()I")
	@Override
	public final int getMaxZ() {
		if (!this.bounds.valid) {
			this.calculateBounds();
		}
		return this.bounds.maxZ;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fe;)Lclient!fe;")
	public final SoftwareIndexedSprite method3854(@OriginalArg(0) SoftwareIndexedSprite arg0) {
		if (this.anInt4691 == 0) {
			return null;
		}
		if (!this.bounds.valid) {
			this.calculateBounds();
		}
		@Pc(26) int local26;
		@Pc(40) int local40;
		if (Static4.anInt3366 > 0) {
			local26 = this.bounds.minX - (this.bounds.maxY * Static4.anInt3366 >> 8) >> 3;
			local40 = this.bounds.maxX - (this.bounds.minY * Static4.anInt3366 >> 8) >> 3;
		} else {
			local26 = this.bounds.minX - (this.bounds.minY * Static4.anInt3366 >> 8) >> 3;
			local40 = this.bounds.maxX - (this.bounds.maxY * Static4.anInt3366 >> 8) >> 3;
		}
		@Pc(85) int local85;
		@Pc(99) int local99;
		if (Static4.anInt3363 > 0) {
			local85 = this.bounds.minZ - (this.bounds.maxY * Static4.anInt3363 >> 8) >> 3;
			local99 = this.bounds.maxZ - (this.bounds.minY * Static4.anInt3363 >> 8) >> 3;
		} else {
			local85 = this.bounds.minZ - (this.bounds.minY * Static4.anInt3363 >> 8) >> 3;
			local99 = this.bounds.maxZ - (this.bounds.maxY * Static4.anInt3363 >> 8) >> 3;
		}
		@Pc(134) int local134 = local40 + 1 - local26;
		@Pc(140) int local140 = local99 + 1 - local85;
		@Pc(151) SoftwareIndexedSprite local151;
		if (arg0 == null || arg0.pixels.length < local134 * local140) {
			local151 = new SoftwareIndexedSprite(local134, local140, 0);
		} else {
			local151 = arg0;
			arg0.innerWidth = arg0.width = local134;
			arg0.innerHeight = arg0.height = local140;
			arg0.clear();
		}
		local151.xOffset = local26;
		local151.yOffset = local85;
		if (Static6.anIntArray509.length < this.anInt4691) {
			Static6.anIntArray509 = new int[this.anInt4691];
			Static6.anIntArray508 = new int[this.anInt4691];
		}
		for (@Pc(194) int local194 = 0; local194 < this.anInt4688; local194++) {
			@Pc(216) int local216 = (this.vertexX[local194] - (this.vertexY[local194] * Static4.anInt3366 >> 8) >> 3) - local26;
			@Pc(234) int local234 = (this.vertexZ[local194] - (this.vertexY[local194] * Static4.anInt3363 >> 8) >> 3) - local85;
			@Pc(239) int local239 = this.anIntArray506[local194];
			@Pc(246) int local246 = this.anIntArray506[local194 + 1];
			for (@Pc(248) int local248 = local239; local248 < local246; local248++) {
				@Pc(258) int local258 = this.aShortArray93[local248] - 1;
				if (local258 == -1) {
					break;
				}
				Static6.anIntArray509[local258] = local216;
				Static6.anIntArray508[local258] = local234;
			}
		}
		for (@Pc(276) int local276 = 0; local276 < this.triangleCount; local276++) {
			if (this.triangleAlpha[local276] <= 128) {
				@Pc(292) short local292 = this.aShortArray94[local276];
				@Pc(297) short local297 = this.aShortArray97[local276];
				@Pc(302) short local302 = this.aShortArray98[local276];
				@Pc(306) int local306 = Static6.anIntArray509[local292];
				@Pc(310) int local310 = Static6.anIntArray509[local297];
				@Pc(314) int local314 = Static6.anIntArray509[local302];
				@Pc(318) int local318 = Static6.anIntArray508[local292];
				@Pc(322) int local322 = Static6.anIntArray508[local297];
				@Pc(326) int local326 = Static6.anIntArray508[local302];
				if ((local306 - local310) * (local322 - local326) - (local322 - local318) * (local314 - local310) > 0) {
					Rasteriser.method2552(local151.pixels, local318, local322, local326, local306, local310, local314, local134);
				}
			}
		}
		return local151;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	public final void method3855(@OriginalArg(0) int arg0) {
		this.aShort43 = (short) arg0;
		this.colorBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public final Model method3836(@OriginalArg(0) boolean shareAlpha, @OriginalArg(1) boolean shareColors, @OriginalArg(2) boolean shareNormals) {
		return this.method3873(shareAlpha, shareColors, shareNormals, Static6.aClass53_Sub4_Sub2_4, Static6.aClass53_Sub4_Sub2_3);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected final void transform(@OriginalArg(0) int type, @OriginalArg(1) int[] bone, @OriginalArg(2) int x, @OriginalArg(3) int y, @OriginalArg(4) int z, @OriginalArg(5) boolean arg5, @OriginalArg(6) int parts, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = bone.length;
		if (type == 0) {
			@Pc(8) int local8 = x << 4;
			@Pc(12) int local12 = y << 4;
			@Pc(16) int local16 = z << 4;
			@Pc(18) int local18 = 0;
			originX = 0;
			originY = 0;
			originZ = 0;
			for (@Pc(26) int local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = bone[local26];
				if (local33 < this.boneVertices.length) {
					@Pc(43) int[] local43 = this.boneVertices[local33];
					for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
						@Pc(53) int local53 = local43[local45];
						if (this.vertexSources == null || (parts & this.vertexSources[local53]) != 0) {
							originX += this.vertexX[local53];
							originY += this.vertexY[local53];
							originZ += this.vertexZ[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				originX = originX / local18 + local8;
				originY = originY / local18 + local12;
				originZ = originZ / local18 + local16;
				Static6.aBoolean326 = true;
			} else {
				originX = local8;
				originY = local12;
				originZ = local16;
			}
		} else if (type == 1) {
			if (arg7 != null) {
				@Pc(147) int local147 = arg7[0] * x + arg7[1] * y + arg7[2] * z + 16384 >> 15;
				@Pc(169) int local169 = arg7[3] * x + arg7[4] * y + arg7[5] * z + 16384 >> 15;
				@Pc(191) int local191 = arg7[6] * x + arg7[7] * y + arg7[8] * z + 16384 >> 15;
				x = local147;
				y = local169;
				z = local191;
			}
			@Pc(201) int local201 = x << 4;
			@Pc(205) int local205 = y << 4;
			@Pc(209) int local209 = z << 4;
			for (@Pc(211) int local211 = 0; local211 < local2; local211++) {
				@Pc(218) int local218 = bone[local211];
				if (local218 < this.boneVertices.length) {
					@Pc(228) int[] local228 = this.boneVertices[local218];
					for (@Pc(230) int local230 = 0; local230 < local228.length; local230++) {
						@Pc(238) int local238 = local228[local230];
						if (this.vertexSources == null || (parts & this.vertexSources[local238]) != 0) {
							@Pc(251) int[] local251 = this.vertexX;
							local251[local238] += local201;
							local251 = this.vertexY;
							local251[local238] += local205;
							local251 = this.vertexZ;
							local251[local238] += local209;
						}
					}
				}
			}
		} else if (type == 2) {
			if (arg7 == null) {
				for (@Pc(1087) int local1087 = 0; local1087 < local2; local1087++) {
					@Pc(1094) int local1094 = bone[local1087];
					if (local1094 < this.boneVertices.length) {
						@Pc(1104) int[] local1104 = this.boneVertices[local1094];
						for (@Pc(1106) int local1106 = 0; local1106 < local1104.length; local1106++) {
							@Pc(1114) int local1114 = local1104[local1106];
							if (this.vertexSources == null || (parts & this.vertexSources[local1114]) != 0) {
								@Pc(1127) int[] local1127 = this.vertexX;
								local1127[local1114] -= originX;
								local1127 = this.vertexY;
								local1127[local1114] -= originY;
								local1127 = this.vertexZ;
								local1127[local1114] -= originZ;
								if (z != 0) {
									@Pc(1155) int local1155 = MathUtils.SINE[z];
									@Pc(1159) int local1159 = MathUtils.COSINE[z];
									@Pc(1177) int local1177 = this.vertexY[local1114] * local1155 + this.vertexX[local1114] * local1159 + 32767 >> 16;
									this.vertexY[local1114] = this.vertexY[local1114] * local1159 + 32767 - this.vertexX[local1114] * local1155 >> 16;
									this.vertexX[local1114] = local1177;
								}
								if (x != 0) {
									@Pc(1209) int local1209 = MathUtils.SINE[x];
									@Pc(1213) int local1213 = MathUtils.COSINE[x];
									@Pc(1231) int local1231 = this.vertexY[local1114] * local1213 + 32767 - this.vertexZ[local1114] * local1209 >> 16;
									this.vertexZ[local1114] = this.vertexY[local1114] * local1209 + this.vertexZ[local1114] * local1213 + 32767 >> 16;
									this.vertexY[local1114] = local1231;
								}
								if (y != 0) {
									@Pc(1263) int local1263 = MathUtils.SINE[y];
									@Pc(1267) int local1267 = MathUtils.COSINE[y];
									@Pc(1285) int local1285 = this.vertexZ[local1114] * local1263 + this.vertexX[local1114] * local1267 + 32767 >> 16;
									this.vertexZ[local1114] = this.vertexZ[local1114] * local1267 + 32767 - this.vertexX[local1114] * local1263 >> 16;
									this.vertexX[local1114] = local1285;
								}
								@Pc(1313) int[] local1313 = this.vertexX;
								local1313[local1114] += originX;
								local1313 = this.vertexY;
								local1313[local1114] += originY;
								local1313 = this.vertexZ;
								local1313[local1114] += originZ;
							}
						}
					}
				}
				if (arg5 && this.aShortArray95 != null) {
					for (@Pc(1346) int local1346 = 0; local1346 < local2; local1346++) {
						@Pc(1353) int local1353 = bone[local1346];
						if (local1353 < this.boneVertices.length) {
							@Pc(1363) int[] local1363 = this.boneVertices[local1353];
							for (@Pc(1365) int local1365 = 0; local1365 < local1363.length; local1365++) {
								@Pc(1373) int local1373 = local1363[local1365];
								if (this.vertexSources == null || (parts & this.vertexSources[local1373]) != 0) {
									@Pc(1389) int local1389 = this.anIntArray506[local1373];
									@Pc(1396) int local1396 = this.anIntArray506[local1373 + 1];
									for (@Pc(1398) int local1398 = local1389; local1398 < local1396; local1398++) {
										@Pc(1408) int local1408 = this.aShortArray93[local1398] - 1;
										if (local1408 == -1) {
											break;
										}
										if (z != 0) {
											@Pc(1418) int local1418 = MathUtils.SINE[z];
											@Pc(1422) int local1422 = MathUtils.COSINE[z];
											@Pc(1440) int local1440 = this.aShortArray90[local1408] * local1418 + this.aShortArray95[local1408] * local1422 + 32767 >> 16;
											this.aShortArray90[local1408] = (short) (this.aShortArray90[local1408] * local1422 + 32767 - this.aShortArray95[local1408] * local1418 >> 16);
											this.aShortArray95[local1408] = (short) local1440;
										}
										if (x != 0) {
											@Pc(1474) int local1474 = MathUtils.SINE[x];
											@Pc(1478) int local1478 = MathUtils.COSINE[x];
											@Pc(1496) int local1496 = this.aShortArray90[local1408] * local1478 + 32767 - this.aShortArray87[local1408] * local1474 >> 16;
											this.aShortArray87[local1408] = (short) (this.aShortArray90[local1408] * local1474 + this.aShortArray87[local1408] * local1478 + 32767 >> 16);
											this.aShortArray90[local1408] = (short) local1496;
										}
										if (y != 0) {
											@Pc(1530) int local1530 = MathUtils.SINE[y];
											@Pc(1534) int local1534 = MathUtils.COSINE[y];
											@Pc(1552) int local1552 = this.aShortArray87[local1408] * local1530 + this.aShortArray95[local1408] * local1534 + 32767 >> 16;
											this.aShortArray87[local1408] = (short) (this.aShortArray87[local1408] * local1534 + 32767 - this.aShortArray95[local1408] * local1530 >> 16);
											this.aShortArray95[local1408] = (short) local1552;
										}
									}
								}
							}
						}
					}
					if (this.normalBuffer != null) {
						this.normalBuffer.valid = false;
					}
				}
			} else {
				@Pc(289) int local289 = arg7[9] << 4;
				@Pc(295) int local295 = arg7[10] << 4;
				@Pc(301) int local301 = arg7[11] << 4;
				@Pc(307) int local307 = arg7[12] << 4;
				@Pc(313) int local313 = arg7[13] << 4;
				@Pc(319) int local319 = arg7[14] << 4;
				if (Static6.aBoolean326) {
					@Pc(343) int local343 = arg7[0] * originX + arg7[3] * originY + arg7[6] * originZ + 16384 >> 15;
					@Pc(365) int local365 = arg7[1] * originX + arg7[4] * originY + arg7[7] * originZ + 16384 >> 15;
					@Pc(387) int local387 = arg7[2] * originX + arg7[5] * originY + arg7[8] * originZ + 16384 >> 15;
					local343 += local307;
					local365 += local313;
					local387 += local319;
					originX = local343;
					originY = local365;
					originZ = local387;
					Static6.aBoolean326 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				@Pc(416) int local416 = MathUtils.COSINE[x] >> 1;
				@Pc(422) int local422 = MathUtils.SINE[x] >> 1;
				@Pc(428) int local428 = MathUtils.COSINE[y] >> 1;
				@Pc(434) int local434 = MathUtils.SINE[y] >> 1;
				@Pc(440) int local440 = MathUtils.COSINE[z] >> 1;
				@Pc(446) int local446 = MathUtils.SINE[z] >> 1;
				@Pc(454) int local454 = local422 * local440 + 16384 >> 15;
				@Pc(462) int local462 = local422 * local446 + 16384 >> 15;
				local410[0] = local428 * local440 + local434 * local462 + 16384 >> 15;
				local410[1] = -local428 * local446 + local434 * local454 + 16384 >> 15;
				local410[2] = local434 * local416 + 16384 >> 15;
				local410[3] = local416 * local446 + 16384 >> 15;
				local410[4] = local416 * local440 + 16384 >> 15;
				local410[5] = -local422;
				local410[6] = -local434 * local440 + local428 * local462 + 16384 >> 15;
				local410[7] = local434 * local446 + local428 * local454 + 16384 >> 15;
				local410[8] = local428 * local416 + 16384 >> 15;
				@Pc(590) int local590 = local410[0] * -originX + local410[1] * -originY + local410[2] * -originZ + 16384 >> 15;
				@Pc(615) int local615 = local410[3] * -originX + local410[4] * -originY + local410[5] * -originZ + 16384 >> 15;
				@Pc(640) int local640 = local410[6] * -originX + local410[7] * -originY + local410[8] * -originZ + 16384 >> 15;
				@Pc(644) int local644 = local590 + originX;
				@Pc(648) int local648 = local615 + originY;
				@Pc(652) int local652 = local640 + originZ;
				@Pc(655) int[] local655 = new int[9];
				for (@Pc(657) int local657 = 0; local657 < 3; local657++) {
					for (@Pc(662) int local662 = 0; local662 < 3; local662++) {
						@Pc(667) int local667 = 0;
						for (@Pc(669) int local669 = 0; local669 < 3; local669++) {
							local667 += local410[local657 * 3 + local669] * arg7[local662 * 3 + local669];
						}
						local655[local657 * 3 + local662] = local667 + 16384 >> 15;
					}
				}
				@Pc(730) int local730 = local410[0] * local307 + local410[1] * local313 + local410[2] * local319 + 16384 >> 15;
				@Pc(752) int local752 = local410[3] * local307 + local410[4] * local313 + local410[5] * local319 + 16384 >> 15;
				@Pc(774) int local774 = local410[6] * local307 + local410[7] * local313 + local410[8] * local319 + 16384 >> 15;
				local730 += local644;
				local752 += local648;
				local774 += local652;
				@Pc(789) int[] local789 = new int[9];
				for (@Pc(791) int local791 = 0; local791 < 3; local791++) {
					for (@Pc(796) int local796 = 0; local796 < 3; local796++) {
						@Pc(801) int local801 = 0;
						for (@Pc(803) int local803 = 0; local803 < 3; local803++) {
							local801 += arg7[local791 * 3 + local803] * local655[local796 + local803 * 3];
						}
						local789[local791 * 3 + local796] = local801 + 16384 >> 15;
					}
				}
				@Pc(864) int local864 = arg7[0] * local730 + arg7[1] * local752 + arg7[2] * local774 + 16384 >> 15;
				@Pc(886) int local886 = arg7[3] * local730 + arg7[4] * local752 + arg7[5] * local774 + 16384 >> 15;
				@Pc(908) int local908 = arg7[6] * local730 + arg7[7] * local752 + arg7[8] * local774 + 16384 >> 15;
				local864 += local289;
				local886 += local295;
				local908 += local301;
				for (@Pc(922) int local922 = 0; local922 < local2; local922++) {
					@Pc(929) int local929 = bone[local922];
					if (local929 < this.boneVertices.length) {
						@Pc(939) int[] local939 = this.boneVertices[local929];
						for (@Pc(941) int local941 = 0; local941 < local939.length; local941++) {
							@Pc(949) int local949 = local939[local941];
							if (this.vertexSources == null || (parts & this.vertexSources[local949]) != 0) {
								@Pc(991) int local991 = local789[0] * this.vertexX[local949] + local789[1] * this.vertexY[local949] + local789[2] * this.vertexZ[local949] + 16384 >> 15;
								@Pc(1022) int local1022 = local789[3] * this.vertexX[local949] + local789[4] * this.vertexY[local949] + local789[5] * this.vertexZ[local949] + 16384 >> 15;
								@Pc(1053) int local1053 = local789[6] * this.vertexX[local949] + local789[7] * this.vertexY[local949] + local789[8] * this.vertexZ[local949] + 16384 >> 15;
								local991 += local864;
								local1022 += local886;
								local1053 += local908;
								this.vertexX[local949] = local991;
								this.vertexY[local949] = local1022;
								this.vertexZ[local949] = local1053;
							}
						}
					}
				}
			}
		} else if (type == 3) {
			if (arg7 == null) {
				for (@Pc(2228) int local2228 = 0; local2228 < local2; local2228++) {
					@Pc(2235) int local2235 = bone[local2228];
					if (local2235 < this.boneVertices.length) {
						@Pc(2245) int[] local2245 = this.boneVertices[local2235];
						for (@Pc(2247) int local2247 = 0; local2247 < local2245.length; local2247++) {
							@Pc(2255) int local2255 = local2245[local2247];
							if (this.vertexSources == null || (parts & this.vertexSources[local2255]) != 0) {
								@Pc(2268) int[] local2268 = this.vertexX;
								local2268[local2255] -= originX;
								local2268 = this.vertexY;
								local2268[local2255] -= originY;
								local2268 = this.vertexZ;
								local2268[local2255] -= originZ;
								this.vertexX[local2255] = this.vertexX[local2255] * x >> 7;
								this.vertexY[local2255] = this.vertexY[local2255] * y >> 7;
								this.vertexZ[local2255] = this.vertexZ[local2255] * z >> 7;
								local2268 = this.vertexX;
								local2268[local2255] += originX;
								local2268 = this.vertexY;
								local2268[local2255] += originY;
								local2268 = this.vertexZ;
								local2268[local2255] += originZ;
							}
						}
					}
				}
			} else {
				@Pc(1605) int local1605 = arg7[9] << 4;
				@Pc(1611) int local1611 = arg7[10] << 4;
				@Pc(1617) int local1617 = arg7[11] << 4;
				@Pc(1623) int local1623 = arg7[12] << 4;
				@Pc(1629) int local1629 = arg7[13] << 4;
				@Pc(1635) int local1635 = arg7[14] << 4;
				if (Static6.aBoolean326) {
					@Pc(1659) int local1659 = arg7[0] * originX + arg7[3] * originY + arg7[6] * originZ + 16384 >> 15;
					@Pc(1681) int local1681 = arg7[1] * originX + arg7[4] * originY + arg7[7] * originZ + 16384 >> 15;
					@Pc(1703) int local1703 = arg7[2] * originX + arg7[5] * originY + arg7[8] * originZ + 16384 >> 15;
					local1659 += local1623;
					local1681 += local1629;
					local1703 += local1635;
					originX = local1659;
					originY = local1681;
					originZ = local1703;
					Static6.aBoolean326 = false;
				}
				@Pc(1729) int local1729 = x << 15 >> 7;
				@Pc(1735) int local1735 = y << 15 >> 7;
				@Pc(1741) int local1741 = z << 15 >> 7;
				@Pc(1750) int local1750 = local1729 * -originX + 16384 >> 15;
				@Pc(1759) int local1759 = local1735 * -originY + 16384 >> 15;
				@Pc(1768) int local1768 = local1741 * -originZ + 16384 >> 15;
				@Pc(1772) int local1772 = local1750 + originX;
				@Pc(1776) int local1776 = local1759 + originY;
				@Pc(1780) int local1780 = local1768 + originZ;
				@Pc(1783) int[] local1783 = new int[] { local1729 * arg7[0] + 16384 >> 15, local1729 * arg7[3] + 16384 >> 15, local1729 * arg7[6] + 16384 >> 15, local1735 * arg7[1] + 16384 >> 15, local1735 * arg7[4] + 16384 >> 15, local1735 * arg7[7] + 16384 >> 15, local1741 * arg7[2] + 16384 >> 15, local1741 * arg7[5] + 16384 >> 15, local1741 * arg7[8] + 16384 >> 15 };
				@Pc(1899) int local1899 = local1729 * local1623 + 16384 >> 15;
				@Pc(1907) int local1907 = local1735 * local1629 + 16384 >> 15;
				@Pc(1915) int local1915 = local1741 * local1635 + 16384 >> 15;
				local1899 += local1772;
				local1907 += local1776;
				local1915 += local1780;
				@Pc(1930) int[] local1930 = new int[9];
				for (@Pc(1932) int local1932 = 0; local1932 < 3; local1932++) {
					for (@Pc(1937) int local1937 = 0; local1937 < 3; local1937++) {
						@Pc(1942) int local1942 = 0;
						for (@Pc(1944) int local1944 = 0; local1944 < 3; local1944++) {
							local1942 += arg7[local1932 * 3 + local1944] * local1783[local1937 + local1944 * 3];
						}
						local1930[local1932 * 3 + local1937] = local1942 + 16384 >> 15;
					}
				}
				@Pc(2005) int local2005 = arg7[0] * local1899 + arg7[1] * local1907 + arg7[2] * local1915 + 16384 >> 15;
				@Pc(2027) int local2027 = arg7[3] * local1899 + arg7[4] * local1907 + arg7[5] * local1915 + 16384 >> 15;
				@Pc(2049) int local2049 = arg7[6] * local1899 + arg7[7] * local1907 + arg7[8] * local1915 + 16384 >> 15;
				local2005 += local1605;
				local2027 += local1611;
				local2049 += local1617;
				for (@Pc(2063) int local2063 = 0; local2063 < local2; local2063++) {
					@Pc(2070) int local2070 = bone[local2063];
					if (local2070 < this.boneVertices.length) {
						@Pc(2080) int[] local2080 = this.boneVertices[local2070];
						for (@Pc(2082) int local2082 = 0; local2082 < local2080.length; local2082++) {
							@Pc(2090) int local2090 = local2080[local2082];
							if (this.vertexSources == null || (parts & this.vertexSources[local2090]) != 0) {
								@Pc(2132) int local2132 = local1930[0] * this.vertexX[local2090] + local1930[1] * this.vertexY[local2090] + local1930[2] * this.vertexZ[local2090] + 16384 >> 15;
								@Pc(2163) int local2163 = local1930[3] * this.vertexX[local2090] + local1930[4] * this.vertexY[local2090] + local1930[5] * this.vertexZ[local2090] + 16384 >> 15;
								@Pc(2194) int local2194 = local1930[6] * this.vertexX[local2090] + local1930[7] * this.vertexY[local2090] + local1930[8] * this.vertexZ[local2090] + 16384 >> 15;
								local2132 += local2005;
								local2163 += local2027;
								local2194 += local2049;
								this.vertexX[local2090] = local2132;
								this.vertexY[local2090] = local2163;
								this.vertexZ[local2090] = local2194;
							}
						}
					}
				}
			}
		} else if (type == 5) {
			if (this.boneTriangles != null && this.triangleAlpha != null) {
				for (@Pc(2366) int local2366 = 0; local2366 < local2; local2366++) {
					@Pc(2373) int local2373 = bone[local2366];
					if (local2373 < this.boneTriangles.length) {
						@Pc(2383) int[] local2383 = this.boneTriangles[local2373];
						for (@Pc(2385) int local2385 = 0; local2385 < local2383.length; local2385++) {
							@Pc(2393) int local2393 = local2383[local2385];
							if (this.triangleSources == null || (parts & this.triangleSources[local2393]) != 0) {
								@Pc(2415) int local2415 = (this.triangleAlpha[local2393] & 0xFF) + x * 8;
								if (local2415 < 0) {
									local2415 = 0;
								} else if (local2415 > 255) {
									local2415 = 255;
								}
								this.triangleAlpha[local2393] = (byte) local2415;
							}
						}
						if (local2383.length > 0) {
							this.colorBuffer.valid = false;
						}
					}
				}
			}
		} else if (type == 7 && this.boneTriangles != null) {
			for (@Pc(2451) int local2451 = 0; local2451 < local2; local2451++) {
				@Pc(2458) int local2458 = bone[local2451];
				if (local2458 < this.boneTriangles.length) {
					@Pc(2468) int[] local2468 = this.boneTriangles[local2458];
					for (@Pc(2470) int local2470 = 0; local2470 < local2468.length; local2470++) {
						@Pc(2478) int local2478 = local2468[local2470];
						if (this.triangleSources == null || (parts & this.triangleSources[local2478]) != 0) {
							@Pc(2496) int local2496 = this.triangleColors[local2478] & 0xFFFF;
							@Pc(2502) int local2502 = local2496 >> 10 & 0x3F;
							@Pc(2508) int local2508 = local2496 >> 7 & 0x7;
							@Pc(2512) int local2512 = local2496 & 0x7F;
							local2502 = local2502 + x & 0x3F;
							@Pc(2524) int local2524 = local2508 + y / 4;
							if (local2524 < 0) {
								local2524 = 0;
							} else if (local2524 > 7) {
								local2524 = 7;
							}
							@Pc(2538) int local2538 = local2512 + z;
							if (local2538 < 0) {
								local2538 = 0;
							} else if (local2538 > 127) {
								local2538 = 127;
							}
							this.triangleColors[local2478] = (short) (local2502 << 10 | local2524 << 7 | local2538);
						}
					}
					if (local2468.length > 0) {
						this.colorBuffer.valid = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	public final void method3857() {
		if (this.aShortArray95 == null) {
			this.method3815(256);
			return;
		}
		@Pc(10) int sine = MathUtils.SINE[256];
		@Pc(14) int cosine = MathUtils.COSINE[256];
		for (@Pc(16) int i = 0; i < this.vertexCount; i++) {
			@Pc(36) int local36 = this.vertexZ[i] * sine + this.vertexX[i] * cosine >> 16;
			this.vertexZ[i] = this.vertexZ[i] * cosine - this.vertexX[i] * sine >> 16;
			this.vertexX[i] = local36;
		}
		for (@Pc(64) int i = 0; i < this.anInt4691; i++) {
			@Pc(84) int local84 = this.aShortArray87[i] * sine + this.aShortArray95[i] * cosine >> 16;
			this.aShortArray87[i] = (short) (this.aShortArray87[i] * cosine - this.aShortArray95[i] * sine >> 16);
			this.aShortArray95[i] = (short) local84;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
		if (this.normalBuffer != null) {
			this.normalBuffer.valid = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "t", descriptor = "()V")
	private void method3858() {
		@Pc(1) GL gl = GlRenderer.gl;
		if (this.triangleCount == 0) {
			return;
		}
		if (this.shareFlags != 0) {
			this.method3870(true, !this.vertexBuffer.valid && (this.shareFlags & 0x1) != 0, !this.colorBuffer.valid && (this.shareFlags & 0x2) != 0, this.normalBuffer != null && !this.normalBuffer.valid && (this.shareFlags & 0x4) != 0, false);
		}
		this.method3870(false, !this.vertexBuffer.valid, !this.colorBuffer.valid, this.normalBuffer != null && !this.normalBuffer.valid, !this.texCoordBuffer.valid);
		if (!this.indexBuffer.valid) {
			this.method3851();
		}
		if (this.aByte16 != 0) {
			if ((this.aByte16 & 0x1) != 0) {
				this.vertexX = null;
				this.vertexY = null;
				this.vertexZ = null;
				this.aShortArray93 = null;
				this.anIntArray506 = null;
			}
			if ((this.aByte16 & 0x2) != 0) {
				this.triangleColors = null;
				this.triangleAlpha = null;
			}
			if ((this.aByte16 & 0x4) != 0) {
				this.aShortArray95 = null;
				this.aShortArray90 = null;
				this.aShortArray87 = null;
				this.aShortArray89 = null;
			}
			if ((this.aByte16 & 0x8) != 0) {
				this.vertexS = null;
				this.vertexT = null;
			}
			if ((this.aByte16 & 0x10) != 0) {
				this.aShortArray94 = null;
				this.aShortArray97 = null;
				this.aShortArray98 = null;
			}
			this.aByte16 = 0;
		}
		@Pc(172) GlVertexBufferObject local172 = null;
		if (this.vertexBuffer.vbo != null) {
			this.vertexBuffer.vbo.bindArray();
			local172 = this.vertexBuffer.vbo;
			gl.glVertexPointer(3, GL.GL_FLOAT, this.vertexBuffer.stride, (long) this.vertexBuffer.pointer);
		}
		if (this.colorBuffer.vbo != null) {
			if (local172 != this.colorBuffer.vbo) {
				this.colorBuffer.vbo.bindArray();
				local172 = this.colorBuffer.vbo;
			}
			gl.glColorPointer(4, GL.GL_UNSIGNED_BYTE, this.colorBuffer.stride, (long) this.colorBuffer.pointer);
		}
		if (Preferences.highDetailLighting && this.normalBuffer.vbo != null) {
			if (local172 != this.normalBuffer.vbo) {
				this.normalBuffer.vbo.bindArray();
				local172 = this.normalBuffer.vbo;
			}
			gl.glNormalPointer(GL.GL_FLOAT, this.normalBuffer.stride, (long) this.normalBuffer.pointer);
		}
		if (this.texCoordBuffer.vbo != null) {
			if (local172 != this.texCoordBuffer.vbo) {
				this.texCoordBuffer.vbo.bindArray();
				@Pc(269) GlVertexBufferObject local269 = this.texCoordBuffer.vbo;
			}
			gl.glTexCoordPointer(2, GL.GL_FLOAT, this.texCoordBuffer.stride, (long) this.texCoordBuffer.pointer);
		}
		if (this.indexBuffer.vbo != null) {
			this.indexBuffer.vbo.bindElementArray();
		}
		if (this.vertexBuffer.vbo == null || this.colorBuffer.vbo == null || Preferences.highDetailLighting && this.normalBuffer.vbo == null || this.texCoordBuffer.vbo == null) {
			if (GlRenderer.arbVboSupported) {
				gl.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			}
			if (this.vertexBuffer.vbo == null) {
				this.vertexBuffer.buffer.position(this.vertexBuffer.pointer);
				gl.glVertexPointer(3, GL.GL_FLOAT, this.vertexBuffer.stride, this.vertexBuffer.buffer);
			}
			if (this.colorBuffer.vbo == null) {
				this.colorBuffer.buffer.position(this.colorBuffer.pointer);
				gl.glColorPointer(4, GL.GL_UNSIGNED_BYTE, this.colorBuffer.stride, this.colorBuffer.buffer);
			}
			if (Preferences.highDetailLighting && this.normalBuffer.vbo == null) {
				this.normalBuffer.buffer.position(this.normalBuffer.pointer);
				gl.glNormalPointer(GL.GL_FLOAT, this.normalBuffer.stride, this.normalBuffer.buffer);
			}
			if (this.texCoordBuffer.vbo == null) {
				this.texCoordBuffer.buffer.position(this.texCoordBuffer.pointer);
				gl.glTexCoordPointer(2, GL.GL_FLOAT, this.texCoordBuffer.stride, this.texCoordBuffer.buffer);
			}
		}
		if (this.indexBuffer.vbo == null && GlRenderer.arbVboSupported) {
			gl.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, 0);
		}
		@Pc(417) int local417 = this.anIntArray505.length - 1;
		for (@Pc(419) int i = 0; i < local417; i++) {
			@Pc(427) int local427 = this.anIntArray505[i];
			@Pc(434) int local434 = this.anIntArray505[i + 1];
			@Pc(439) short texture = this.triangleTextures[local427];
			if (texture == -1) {
				GlRenderer.setTextureId(-1);
				MaterialManager.setMaterial(0, 0);
			} else {
				Rasteriser.textureProvider.method451(texture & 0xFFFF);
			}
			if (this.indexBuffer.vbo == null) {
				this.indexBuffer.buffer.position(local427 * 12);
				gl.glDrawElements(GL.GL_TRIANGLES, (local434 - local427) * 3, GL.GL_UNSIGNED_INT, this.indexBuffer.buffer);
			} else {
				gl.glDrawElements(GL.GL_TRIANGLES, (local434 - local427) * 3, GL.GL_UNSIGNED_INT, (long) (local427 * 12));
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "k", descriptor = "()I")
	@Override
	public final int getMaxX() {
		if (!this.bounds.valid) {
			this.calculateBounds();
		}
		return this.bounds.maxX;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "()V")
	@Override
	protected final void method3819() {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			this.vertexX[i] = this.vertexX[i] + 7 >> 4;
			this.vertexY[i] = this.vertexY[i] + 7 >> 4;
			this.vertexZ[i] = this.vertexZ[i] + 7 >> 4;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(III)V")
	@Override
	public final void resize(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int z) {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			this.vertexX[i] = this.vertexX[i] * x >> 7;
			this.vertexY[i] = this.vertexY[i] * y >> 7;
			this.vertexZ[i] = this.vertexZ[i] * z >> 7;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!s;[[I[[IIII)V")
	public final void method3859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GlModel arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!arg2.bounds.valid) {
			arg2.calculateBounds();
		}
		@Pc(11) int local11 = arg5 + arg2.bounds.minX;
		@Pc(17) int local17 = arg5 + arg2.bounds.maxX;
		@Pc(23) int local23 = arg7 + arg2.bounds.minZ;
		@Pc(29) int local29 = arg7 + arg2.bounds.maxZ;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local11 < 0 || local17 + 128 >> 7 >= arg3.length || local23 < 0 || local29 + 128 >> 7 >= arg3[0].length)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg4 == null) {
				return;
			}
			if (local11 < 0 || local17 + 128 >> 7 >= arg4.length || local23 < 0 || local29 + 128 >> 7 >= arg4[0].length) {
				return;
			}
		} else {
			@Pc(100) int local100 = local11 >> 7;
			@Pc(106) int local106 = local17 + 127 >> 7;
			@Pc(110) int local110 = local23 >> 7;
			@Pc(116) int local116 = local29 + 127 >> 7;
			if (arg3[local100][local110] == arg6 && arg3[local106][local110] == arg6 && arg3[local100][local116] == arg6 && arg3[local106][local116] == arg6) {
				return;
			}
		}
		if (arg0 == 1) {
			for (@Pc(150) int local150 = 0; local150 < this.anInt4688; local150++) {
				@Pc(161) int local161 = this.vertexX[local150] + arg5;
				@Pc(168) int local168 = this.vertexZ[local150] + arg7;
				@Pc(172) int local172 = local161 & 0x7F;
				@Pc(176) int local176 = local168 & 0x7F;
				@Pc(180) int local180 = local161 >> 7;
				@Pc(184) int local184 = local168 >> 7;
				@Pc(206) int local206 = arg3[local180][local184] * (128 - local172) + arg3[local180 + 1][local184] * local172 >> 7;
				@Pc(232) int local232 = arg3[local180][local184 + 1] * (128 - local172) + arg3[local180 + 1][local184 + 1] * local172 >> 7;
				@Pc(244) int local244 = local206 * (128 - local176) + local232 * local176 >> 7;
				this.vertexY[local150] = this.vertexY[local150] + local244 - arg6;
			}
		} else if (arg0 == 2) {
			@Pc(266) short local266 = arg2.bounds.minY;
			for (@Pc(268) int local268 = 0; local268 < this.anInt4688; local268++) {
				@Pc(281) int local281 = (this.vertexY[local268] << 16) / local266;
				if (local281 < arg1) {
					@Pc(291) int local291 = this.vertexX[local268] + arg5;
					@Pc(298) int local298 = this.vertexZ[local268] + arg7;
					@Pc(302) int local302 = local291 & 0x7F;
					@Pc(306) int local306 = local298 & 0x7F;
					@Pc(310) int local310 = local291 >> 7;
					@Pc(314) int local314 = local298 >> 7;
					@Pc(336) int local336 = arg3[local310][local314] * (128 - local302) + arg3[local310 + 1][local314] * local302 >> 7;
					@Pc(362) int local362 = arg3[local310][local314 + 1] * (128 - local302) + arg3[local310 + 1][local314 + 1] * local302 >> 7;
					@Pc(374) int local374 = local336 * (128 - local306) + local362 * local306 >> 7;
					this.vertexY[local268] += (local374 - arg6) * (arg1 - local281) / arg1;
				}
			}
		} else if (arg0 == 3) {
			@Pc(404) int local404 = (arg1 & 0xFF) * 4;
			@Pc(412) int local412 = (arg1 >> 8 & 0xFF) * 4;
			this.method3840(arg3, arg5, arg6, arg7, local404, local412);
		} else if (arg0 == 4) {
			@Pc(432) int local432 = arg2.bounds.maxY - arg2.bounds.minY;
			for (@Pc(434) int local434 = 0; local434 < this.anInt4688; local434++) {
				@Pc(445) int local445 = this.vertexX[local434] + arg5;
				@Pc(452) int local452 = this.vertexZ[local434] + arg7;
				@Pc(456) int local456 = local445 & 0x7F;
				@Pc(460) int local460 = local452 & 0x7F;
				@Pc(464) int local464 = local445 >> 7;
				@Pc(468) int local468 = local452 >> 7;
				@Pc(490) int local490 = arg4[local464][local468] * (128 - local456) + arg4[local464 + 1][local468] * local456 >> 7;
				@Pc(516) int local516 = arg4[local464][local468 + 1] * (128 - local456) + arg4[local464 + 1][local468 + 1] * local456 >> 7;
				@Pc(528) int local528 = local490 * (128 - local460) + local516 * local460 >> 7;
				this.vertexY[local434] = this.vertexY[local434] + local528 + local432 - arg6;
			}
		} else if (arg0 == 5) {
			@Pc(556) int local556 = arg2.bounds.maxY - arg2.bounds.minY;
			for (@Pc(558) int local558 = 0; local558 < this.anInt4688; local558++) {
				@Pc(569) int local569 = this.vertexX[local558] + arg5;
				@Pc(576) int local576 = this.vertexZ[local558] + arg7;
				@Pc(580) int local580 = local569 & 0x7F;
				@Pc(584) int local584 = local576 & 0x7F;
				@Pc(588) int local588 = local569 >> 7;
				@Pc(592) int local592 = local576 >> 7;
				@Pc(614) int local614 = arg3[local588][local592] * (128 - local580) + arg3[local588 + 1][local592] * local580 >> 7;
				@Pc(640) int local640 = arg3[local588][local592 + 1] * (128 - local580) + arg3[local588 + 1][local592 + 1] * local580 >> 7;
				@Pc(652) int local652 = local614 * (128 - local584) + local640 * local584 >> 7;
				local614 = arg4[local588][local592] * (128 - local580) + arg4[local588 + 1][local592] * local580 >> 7;
				local640 = arg4[local588][local592 + 1] * (128 - local580) + arg4[local588 + 1][local592 + 1] * local580 >> 7;
				@Pc(712) int local712 = local614 * (128 - local584) + local640 * local584 >> 7;
				@Pc(716) int local716 = local652 - local712;
				this.vertexY[local558] = ((this.vertexY[local558] << 8) / local556 * local716 >> 8) + local652 - arg6;
			}
		}
		this.vertexBuffer.valid = false;
		this.bounds.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public final void method3861(@OriginalArg(0) int arg0) {
		this.aShort44 = (short) arg0;
		if (this.normalBuffer != null) {
			this.normalBuffer.valid = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!vc;IIIZ)V")
	@Override
	public final void method3807(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) GlModel local2 = (GlModel) arg0;
		if (this.triangleCount == 0 || local2.triangleCount == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt4688;
		@Pc(15) int[] local15 = local2.vertexX;
		@Pc(18) int[] local18 = local2.vertexY;
		@Pc(21) int[] local21 = local2.vertexZ;
		@Pc(24) short[] local24 = local2.aShortArray95;
		@Pc(27) short[] local27 = local2.aShortArray90;
		@Pc(30) short[] local30 = local2.aShortArray87;
		@Pc(33) short[] local33 = local2.aShortArray89;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) short[] local52;
		if (this.aClass152_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass152_1.aShortArray84;
			local44 = this.aClass152_1.aShortArray82;
			local48 = this.aClass152_1.aShortArray83;
			local52 = this.aClass152_1.aShortArray85;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		if (local2.aClass152_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass152_1.aShortArray84;
			local72 = local2.aClass152_1.aShortArray82;
			local76 = local2.aClass152_1.aShortArray83;
			local80 = local2.aClass152_1.aShortArray85;
		}
		@Pc(92) int[] local92 = local2.anIntArray506;
		@Pc(95) short[] local95 = local2.aShortArray93;
		if (!local2.bounds.valid) {
			local2.calculateBounds();
		}
		@Pc(105) short minY = local2.bounds.minY;
		@Pc(109) short maxY = local2.bounds.maxY;
		@Pc(113) short minX = local2.bounds.minX;
		@Pc(117) short maxX = local2.bounds.maxX;
		@Pc(121) short minZ = local2.bounds.minZ;
		@Pc(125) short maxZ = local2.bounds.maxZ;
		for (@Pc(127) int i = 0; i < this.anInt4688; i++) {
			@Pc(138) int y = this.vertexY[i] - arg2;
			if (y >= minY && y <= maxY) {
				@Pc(152) int x = this.vertexX[i] - arg1;
				if (x >= minX && x <= maxX) {
					@Pc(166) int z = this.vertexZ[i] - arg3;
					if (z >= minZ && z <= maxZ) {
						@Pc(175) int local175 = -1;
						@Pc(180) int local180 = this.anIntArray506[i];
						@Pc(187) int local187 = this.anIntArray506[i + 1];
						for (@Pc(189) int local189 = local180; local189 < local187; local189++) {
							local175 = this.aShortArray93[local189] - 1;
							if (local175 == -1 || this.aShortArray89[local175] != 0) {
								break;
							}
						}
						if (local175 != -1) {
							for (@Pc(217) int local217 = 0; local217 < local12; local217++) {
								if (x == local15[local217] && z == local21[local217] && y == local18[local217]) {
									@Pc(237) int local237 = -1;
									@Pc(241) int local241 = local92[local217];
									@Pc(247) int local247 = local92[local217 + 1];
									for (@Pc(249) int local249 = local241; local249 < local247; local249++) {
										local237 = local95[local249] - 1;
										if (local237 == -1 || local33[local237] != 0) {
											break;
										}
									}
									if (local237 != -1) {
										if (local40 == null) {
											this.aClass152_1 = new Class152();
											local40 = this.aClass152_1.aShortArray84 = ArrayUtils.copyOfNullable(this.aShortArray95);
											local44 = this.aClass152_1.aShortArray82 = ArrayUtils.copyOfNullable(this.aShortArray90);
											local48 = this.aClass152_1.aShortArray83 = ArrayUtils.copyOfNullable(this.aShortArray87);
											local52 = this.aClass152_1.aShortArray85 = ArrayUtils.copyOfNullable(this.aShortArray89);
										}
										if (local68 == null) {
											@Pc(325) Class152 local325 = local2.aClass152_1 = new Class152();
											local68 = local325.aShortArray84 = ArrayUtils.copyOfNullable(local24);
											local72 = local325.aShortArray82 = ArrayUtils.copyOfNullable(local27);
											local76 = local325.aShortArray83 = ArrayUtils.copyOfNullable(local30);
											local80 = local325.aShortArray85 = ArrayUtils.copyOfNullable(local33);
										}
										@Pc(358) short local358 = this.aShortArray95[local175];
										@Pc(363) short local363 = this.aShortArray90[local175];
										@Pc(368) short local368 = this.aShortArray87[local175];
										@Pc(373) short local373 = this.aShortArray89[local175];
										@Pc(377) int local377 = local92[local217];
										@Pc(383) int local383 = local92[local217 + 1];
										for (@Pc(385) int local385 = local377; local385 < local383; local385++) {
											@Pc(394) int local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										@Pc(440) short local440 = local24[local237];
										@Pc(444) short local444 = local27[local237];
										@Pc(448) short local448 = local30[local237];
										@Pc(452) short local452 = local33[local237];
										@Pc(457) int local457 = this.anIntArray506[i];
										@Pc(464) int local464 = this.anIntArray506[i + 1];
										for (@Pc(466) int local466 = local457; local466 < local464; local466++) {
											@Pc(476) int local476 = this.aShortArray93[local466] - 1;
											if (local476 == -1) {
												break;
											}
											if (local52[local476] != 0) {
												local40[local476] += local440;
												local44[local476] += local444;
												local48[local476] += local448;
												local52[local476] += local452;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "u", descriptor = "()V")
	public final void method3862() {
		if (this.aShortArray95 == null) {
			this.method3820();
			return;
		}
		for (@Pc(7) int i = 0; i < this.vertexCount; i++) {
			@Pc(16) int local16 = this.vertexX[i];
			this.vertexX[i] = this.vertexZ[i];
			this.vertexZ[i] = -local16;
		}
		for (@Pc(34) int i = 0; i < this.anInt4691; i++) {
			@Pc(43) short local43 = this.aShortArray95[i];
			this.aShortArray95[i] = this.aShortArray87[i];
			this.aShortArray87[i] = (short) -local43;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
		if (this.normalBuffer != null) {
			this.normalBuffer.valid = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	@Override
	public final void translate(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int z) {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			@Pc(7) int[] vertex = this.vertexX;
			vertex[i] += x;
			vertex = this.vertexY;
			vertex[i] += y;
			vertex = this.vertexZ;
			vertex[i] += z;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "()V")
	@Override
	public final void method3828() {
		for (@Pc(1) int i = 0; i < this.vertexCount; i++) {
			this.vertexX[i] = -this.vertexX[i];
			this.vertexZ[i] = -this.vertexZ[i];
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "v", descriptor = "()V")
	private void calculateBounds() {
		@Pc(1) int minX = 32767;
		@Pc(3) int minY = 32767;
		@Pc(5) int minZ = 32767;
		@Pc(7) int maxX = -32768;
		@Pc(9) int maxY = -32768;
		@Pc(11) int maxZ = -32768;
		@Pc(13) int maxCylinderRadiusSquared = 0;
		@Pc(15) int maxSphereRadiusSquared = 0;
		for (@Pc(17) int i = 0; i < this.anInt4688; i++) {
			@Pc(26) int x = this.vertexX[i];
			@Pc(31) int y = this.vertexY[i];
			@Pc(36) int z = this.vertexZ[i];
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
			@Pc(74) int cylinderRadiusSquared = x * x + z * z;
			if (cylinderRadiusSquared > maxCylinderRadiusSquared) {
				maxCylinderRadiusSquared = cylinderRadiusSquared;
			}
			@Pc(91) int sphereRadiusSquared = x * x + z * z + y * y;
			if (sphereRadiusSquared > maxSphereRadiusSquared) {
				maxSphereRadiusSquared = sphereRadiusSquared;
			}
		}
		this.bounds.minX = (short) minX;
		this.bounds.maxX = (short) maxX;
		this.bounds.minY = (short) minY;
		this.bounds.maxY = (short) maxY;
		this.bounds.minZ = (short) minZ;
		this.bounds.maxZ = (short) maxZ;
		this.bounds.cylinderRadius = (short) (Math.sqrt(maxCylinderRadiusSquared) + 0.99D);
		Math.sqrt(maxSphereRadiusSquared);
		this.bounds.valid = true;
	}

	@OriginalMember(owner = "client!s", name = "w", descriptor = "()V")
	public final void createBones() {
		if (this.vertexBones != null) {
			@Pc(5) int[] boneLens = new int[256];
			@Pc(7) int maxBone = 0;
			for (@Pc(9) int i = 0; i < this.vertexCount; i++) {
				@Pc(20) int bone = this.vertexBones[i] & 0xFF;
				@Pc(24) int local24 = boneLens[bone]++;
				if (bone > maxBone) {
					maxBone = bone;
				}
			}
			this.boneVertices = new int[maxBone + 1][];
			for (@Pc(42) int i = 0; i <= maxBone; i++) {
				this.boneVertices[i] = new int[boneLens[i]];
				boneLens[i] = 0;
			}
			@Pc(61) int i = 0;
			while (i < this.vertexCount) {
				@Pc(72) int bone = this.vertexBones[i] & 0xFF;
				this.boneVertices[bone][boneLens[bone]++] = i++;
			}
			this.vertexBones = null;
		}
		if (this.triangleBones == null) {
			return;
		}
		@Pc(97) int[] boneLens = new int[256];
		@Pc(99) int maxBone = 0;
		for (@Pc(101) int i = 0; i < this.triangleCount; i++) {
			@Pc(112) int bone = this.triangleBones[i] & 0xFF;
			@Pc(116) int local116 = boneLens[bone]++;
			if (bone > maxBone) {
				maxBone = bone;
			}
		}
		this.boneTriangles = new int[maxBone + 1][];
		for (@Pc(134) int i = 0; i <= maxBone; i++) {
			this.boneTriangles[i] = new int[boneLens[i]];
			boneLens[i] = 0;
		}
		@Pc(153) int i = 0;
		while (i < this.triangleCount) {
			@Pc(164) int bone = this.triangleBones[i] & 0xFF;
			this.boneTriangles[bone][boneLens[bone]++] = i++;
		}
		this.triangleBones = null;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(SS)V")
	public final void recolor(@OriginalArg(0) short source, @OriginalArg(1) short destination) {
		for (@Pc(1) int i = 0; i < this.triangleCount; i++) {
			if (this.triangleColors[i] == source) {
				this.triangleColors[i] = destination;
			}
		}
		this.colorBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method3868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!s", name = "x", descriptor = "()I")
	public final int method3869() {
		return this.aShort44;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "()V")
	@Override
	public final void method3820() {
		for (@Pc(1) int local1 = 0; local1 < this.vertexCount; local1++) {
			@Pc(10) int local10 = this.vertexX[local1];
			this.vertexX[local1] = this.vertexZ[local1];
			this.vertexZ[local1] = -local10;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZ)V")
	private void method3870(@OriginalArg(0) boolean reuseBuffer, @OriginalArg(1) boolean hasVertices, @OriginalArg(2) boolean hasColors, @OriginalArg(3) boolean hasNormals, @OriginalArg(4) boolean hasTexCoords) {
		@Pc(1) int stride = 0;
		if (hasVertices) {
			this.vertexBuffer.pointer = 0;
			stride += 12;
		}
		if (hasColors) {
			this.colorBuffer.pointer = stride;
			stride += 4;
		}
		if (hasNormals) {
			this.normalBuffer.pointer = stride;
			stride += 12;
		}
		if (hasTexCoords) {
			this.texCoordBuffer.pointer = stride;
			stride += 8;
		}
		if (stride == 0) {
			return;
		}
		if (tempBuffer.bytes.length < this.anInt4691 * stride) {
			tempBuffer = new Buffer((this.anInt4691 + 100) * stride);
		} else {
			tempBuffer.position = 0;
		}
		if (hasVertices) {
			if (GlRenderer.bigEndian) {
				for (@Pc(60) int i = 0; i < this.anInt4688; i++) {
					@Pc(71) int x = Float.floatToRawIntBits((float) this.vertexX[i]);
					@Pc(78) int y = Float.floatToRawIntBits((float) this.vertexY[i]);
					@Pc(85) int z = Float.floatToRawIntBits((float) this.vertexZ[i]);
					@Pc(90) int local90 = this.anIntArray506[i];
					@Pc(97) int local97 = this.anIntArray506[i + 1];
					for (@Pc(99) int local99 = local90; local99 < local97; local99++) {
						@Pc(109) int local109 = this.aShortArray93[local99] - 1;
						if (local109 == -1) {
							break;
						}
						tempBuffer.position = local109 * stride;
						tempBuffer.writeInt(x);
						tempBuffer.writeInt(y);
						tempBuffer.writeInt(z);
					}
				}
			} else {
				for (@Pc(137) int i = 0; i < this.anInt4688; i++) {
					@Pc(148) int x = Float.floatToRawIntBits((float) this.vertexX[i]);
					@Pc(155) int y = Float.floatToRawIntBits((float) this.vertexY[i]);
					@Pc(162) int z = Float.floatToRawIntBits((float) this.vertexZ[i]);
					@Pc(167) int local167 = this.anIntArray506[i];
					@Pc(174) int local174 = this.anIntArray506[i + 1];
					for (@Pc(176) int local176 = local167; local176 < local174; local176++) {
						@Pc(186) int local186 = this.aShortArray93[local176] - 1;
						if (local186 == -1) {
							break;
						}
						tempBuffer.position = local186 * stride;
						tempBuffer.writeIntLE(x);
						tempBuffer.writeIntLE(y);
						tempBuffer.writeIntLE(z);
					}
				}
			}
		}
		if (hasColors) {
			if (Preferences.highDetailLighting) {
				for (@Pc(645) int local645 = 0; local645 < this.triangleCount; local645++) {
					@Pc(665) int local665 = method3863(this.triangleColors[local645], this.triangleTextures[local645], this.aShort43, this.triangleAlpha[local645]);
					tempBuffer.position = this.colorBuffer.pointer + this.aShortArray94[local645] * stride;
					tempBuffer.writeInt(local665);
					tempBuffer.position = this.colorBuffer.pointer + this.aShortArray97[local645] * stride;
					tempBuffer.writeInt(local665);
					tempBuffer.position = this.colorBuffer.pointer + this.aShortArray98[local645] * stride;
					tempBuffer.writeInt(local665);
				}
			} else {
				@Pc(220) int local220 = (int) Static4.aFloatArray40[0];
				@Pc(225) int local225 = (int) Static4.aFloatArray40[1];
				@Pc(230) int local230 = (int) Static4.aFloatArray40[2];
				@Pc(245) int local245 = (int) Math.sqrt((double) (local220 * local220 + local225 * local225 + local230 * local230));
				@Pc(252) int local252 = (int) ((float) this.aShort43 * 1.3F);
				@Pc(259) int local259 = this.aShort44 * local245 >> 8;
				for (@Pc(261) int local261 = 0; local261 < this.triangleCount; local261++) {
					@Pc(270) short local270 = this.aShortArray94[local261];
					@Pc(275) short local275 = this.aShortArray89[local270];
					@Pc(281) int local281;
					if (local275 < 0) {
						local281 = -local275 - 1;
					} else {
						if (local275 == 0) {
							local281 = local252 + (local220 * this.aShortArray95[local270] + local225 * this.aShortArray90[local270] + local230 * this.aShortArray87[local270]) / (local259 + local259 / 2);
						} else {
							local281 = local252 + (local220 * this.aShortArray95[local270] + local225 * this.aShortArray90[local270] + local230 * this.aShortArray87[local270]) / (local259 * local275);
						}
						if (local281 < 0) {
							local281 = 0;
						} else if (local281 > 16384) {
							local281 = 16384;
						}
						this.aShortArray89[local270] = (short) (-local281 - 1);
					}
					@Pc(364) short local364 = this.aShortArray97[local261];
					@Pc(369) short local369 = this.aShortArray89[local364];
					@Pc(375) int local375;
					if (local369 < 0) {
						local375 = -local369 - 1;
					} else {
						if (local369 == 0) {
							local375 = local252 + (local220 * this.aShortArray95[local364] + local225 * this.aShortArray90[local364] + local230 * this.aShortArray87[local364]) / (local259 + local259 / 2);
						} else {
							local375 = local252 + (local220 * this.aShortArray95[local364] + local225 * this.aShortArray90[local364] + local230 * this.aShortArray87[local364]) / (local259 * local369);
						}
						if (local375 < 0) {
							local375 = 0;
						} else if (local375 > 16384) {
							local375 = 16384;
						}
						this.aShortArray89[local364] = (short) (-local375 - 1);
					}
					@Pc(458) short local458 = this.aShortArray98[local261];
					@Pc(463) short local463 = this.aShortArray89[local458];
					@Pc(469) int local469;
					if (local463 < 0) {
						local469 = -local463 - 1;
					} else {
						if (local463 == 0) {
							local469 = local252 + (local220 * this.aShortArray95[local458] + local225 * this.aShortArray90[local458] + local230 * this.aShortArray87[local458]) / (local259 + local259 / 2);
						} else {
							local469 = local252 + (local220 * this.aShortArray95[local458] + local225 * this.aShortArray90[local458] + local230 * this.aShortArray87[local458]) / (local259 * local463);
						}
						if (local469 < 0) {
							local469 = 0;
						} else if (local469 > 16384) {
							local469 = 16384;
						}
						this.aShortArray89[local458] = (short) (-local469 - 1);
					}
					@Pc(562) int local562 = method3863(this.triangleColors[local261], this.triangleTextures[local261], local281, this.triangleAlpha[local261]);
					@Pc(577) int local577 = method3863(this.triangleColors[local261], this.triangleTextures[local261], local375, this.triangleAlpha[local261]);
					@Pc(592) int local592 = method3863(this.triangleColors[local261], this.triangleTextures[local261], local469, this.triangleAlpha[local261]);
					tempBuffer.position = this.colorBuffer.pointer + local270 * stride;
					tempBuffer.writeInt(local562);
					tempBuffer.position = this.colorBuffer.pointer + local364 * stride;
					tempBuffer.writeInt(local577);
					tempBuffer.position = this.colorBuffer.pointer + local458 * stride;
					tempBuffer.writeInt(local592);
				}
				this.aShortArray95 = null;
				this.aShortArray90 = null;
				this.aShortArray87 = null;
			}
		}
		if (hasNormals) {
			@Pc(723) float local723 = 3.0F / (float) this.aShort44;
			@Pc(734) float local734 = 3.0F / (float) (this.aShort44 + this.aShort44 / 2);
			tempBuffer.position = this.normalBuffer.pointer;
			if (GlRenderer.bigEndian) {
				for (@Pc(743) int local743 = 0; local743 < this.anInt4691; local743++) {
					@Pc(752) short local752 = this.aShortArray89[local743];
					if (local752 == 0) {
						tempBuffer.writeFloat((float) this.aShortArray95[local743] * local734);
						tempBuffer.writeFloat((float) this.aShortArray90[local743] * local734);
						tempBuffer.writeFloat((float) this.aShortArray87[local743] * local734);
					} else {
						@Pc(790) float local790 = local723 / (float) local752;
						tempBuffer.writeFloat((float) this.aShortArray95[local743] * local790);
						tempBuffer.writeFloat((float) this.aShortArray90[local743] * local790);
						tempBuffer.writeFloat((float) this.aShortArray87[local743] * local790);
					}
					@Pc(821) Buffer tempBuffer = GlModel.tempBuffer;
					tempBuffer.position += stride - 12;
				}
			} else {
				for (@Pc(833) int local833 = 0; local833 < this.anInt4691; local833++) {
					@Pc(842) short local842 = this.aShortArray89[local833];
					if (local842 == 0) {
						tempBuffer.writeFloatLE((float) this.aShortArray95[local833] * local734);
						tempBuffer.writeFloatLE((float) this.aShortArray90[local833] * local734);
						tempBuffer.writeFloatLE((float) this.aShortArray87[local833] * local734);
					} else {
						@Pc(880) float local880 = local723 / (float) local842;
						tempBuffer.writeFloatLE((float) this.aShortArray95[local833] * local880);
						tempBuffer.writeFloatLE((float) this.aShortArray90[local833] * local880);
						tempBuffer.writeFloatLE((float) this.aShortArray87[local833] * local880);
					}
					@Pc(911) Buffer tempBuffer = GlModel.tempBuffer;
					tempBuffer.position += stride - 12;
				}
			}
		}
		if (hasTexCoords) {
			tempBuffer.position = this.texCoordBuffer.pointer;
			if (GlRenderer.bigEndian) {
				for (@Pc(931) int i = 0; i < this.anInt4691; i++) {
					tempBuffer.writeFloat(this.vertexS[i]);
					tempBuffer.writeFloat(this.vertexT[i]);
					@Pc(950) Buffer tempBuffer = GlModel.tempBuffer;
					tempBuffer.position += stride - 8;
				}
			} else {
				for (@Pc(962) int i = 0; i < this.anInt4691; i++) {
					tempBuffer.writeFloatLE(this.vertexS[i]);
					tempBuffer.writeFloatLE(this.vertexT[i]);
					@Pc(981) Buffer tempBuffer = GlModel.tempBuffer;
					tempBuffer.position += stride - 8;
				}
			}
		}
		tempBuffer.position = stride * this.anInt4691;
		if (reuseBuffer) {
			if (arbVboSupported) {
				@Pc(1007) ByteBuffer buffer = ByteBuffer.wrap(tempBuffer.bytes, 0, tempBuffer.position);
				if (this.vbo == null) {
					this.vbo = new GlVertexBufferObject(true);
					this.vbo.setArrayBuffer(buffer);
				} else {
					this.vbo.updateArrayBuffer(buffer);
				}
				if (hasVertices) {
					this.vertexBuffer.valid = true;
					this.vertexBuffer.buffer = null;
					this.vertexBuffer.vbo = this.vbo;
					this.vertexBuffer.stride = stride;
				}
				if (hasColors) {
					this.colorBuffer.valid = true;
					this.colorBuffer.buffer = null;
					this.colorBuffer.vbo = this.vbo;
					this.colorBuffer.stride = stride;
				}
				if (hasNormals) {
					this.normalBuffer.valid = true;
					this.normalBuffer.buffer = null;
					this.normalBuffer.vbo = this.vbo;
					this.normalBuffer.stride = stride;
				}
				if (hasTexCoords) {
					this.texCoordBuffer.valid = true;
					this.texCoordBuffer.buffer = null;
					this.texCoordBuffer.vbo = this.vbo;
					this.texCoordBuffer.stride = stride;
				}
			} else {
				if (tempDirectBuffer == null || tempDirectBuffer.capacity() < tempBuffer.position) {
					tempDirectBuffer = ByteBuffer.allocateDirect(tempBuffer.position + stride * 100);
				} else {
					tempDirectBuffer.clear();
				}
				tempDirectBuffer.put(tempBuffer.bytes, 0, tempBuffer.position);
				tempDirectBuffer.flip();
				if (hasVertices) {
					this.vertexBuffer.valid = true;
					this.vertexBuffer.buffer = tempDirectBuffer;
					this.vertexBuffer.vbo = null;
					this.vertexBuffer.stride = stride;
				}
				if (hasColors) {
					this.colorBuffer.valid = true;
					this.colorBuffer.buffer = tempDirectBuffer;
					this.vertexBuffer.vbo = null;
					this.colorBuffer.stride = stride;
				}
				if (hasNormals) {
					this.normalBuffer.valid = true;
					this.normalBuffer.buffer = tempDirectBuffer;
					this.normalBuffer.vbo = null;
					this.normalBuffer.stride = stride;
				}
				if (hasTexCoords) {
					this.texCoordBuffer.valid = true;
					this.texCoordBuffer.buffer = tempDirectBuffer;
					this.texCoordBuffer.vbo = null;
					this.texCoordBuffer.stride = stride;
				}
			}
		} else if (GlRenderer.arbVboSupported) {
			@Pc(1211) GlVertexBufferObject vbo = new GlVertexBufferObject();
			@Pc(1218) ByteBuffer buffer = ByteBuffer.wrap(tempBuffer.bytes, 0, tempBuffer.position);
			vbo.setArrayBuffer(buffer);
			if (hasVertices) {
				this.vertexBuffer.valid = true;
				this.vertexBuffer.buffer = null;
				this.vertexBuffer.vbo = vbo;
				this.vertexBuffer.stride = stride;
			}
			if (hasColors) {
				this.colorBuffer.valid = true;
				this.colorBuffer.buffer = null;
				this.colorBuffer.vbo = vbo;
				this.colorBuffer.stride = stride;
			}
			if (hasNormals) {
				this.normalBuffer.valid = true;
				this.normalBuffer.buffer = null;
				this.normalBuffer.vbo = vbo;
				this.normalBuffer.stride = stride;
			}
			if (hasTexCoords) {
				this.texCoordBuffer.valid = true;
				this.texCoordBuffer.buffer = null;
				this.texCoordBuffer.vbo = vbo;
				this.texCoordBuffer.stride = stride;
			}
		} else {
			@Pc(1298) ByteBuffer buffer = ByteBuffer.allocateDirect(tempBuffer.position);
			buffer.put(tempBuffer.bytes, 0, tempBuffer.position);
			buffer.flip();
			if (hasVertices) {
				this.vertexBuffer.valid = true;
				this.vertexBuffer.buffer = buffer;
				this.vertexBuffer.vbo = null;
				this.vertexBuffer.stride = stride;
			}
			if (hasColors) {
				this.colorBuffer.valid = true;
				this.colorBuffer.buffer = buffer;
				this.vertexBuffer.vbo = null;
				this.colorBuffer.stride = stride;
			}
			if (hasNormals) {
				this.normalBuffer.valid = true;
				this.normalBuffer.buffer = buffer;
				this.normalBuffer.vbo = null;
				this.normalBuffer.stride = stride;
			}
			if (hasTexCoords) {
				this.texCoordBuffer.valid = true;
				this.texCoordBuffer.buffer = buffer;
				this.texCoordBuffer.vbo = null;
				this.texCoordBuffer.stride = stride;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public final Model method3833(@OriginalArg(0) boolean shareAlpha, @OriginalArg(1) boolean shareColors, @OriginalArg(2) boolean shareNormals) {
		return this.method3873(shareAlpha, shareColors, shareNormals, Static6.aClass53_Sub4_Sub2_6, Static6.aClass53_Sub4_Sub2_5);
	}

	@OriginalMember(owner = "client!s", name = "m", descriptor = "()I")
	@Override
	public final int getMaxY() {
		if (!this.bounds.valid) {
			this.calculateBounds();
		}
		return this.bounds.maxY;
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "()V")
	@Override
	public final void method3827() {
		for (@Pc(1) int local1 = 0; local1 < this.vertexCount; local1++) {
			@Pc(10) int local10 = this.vertexZ[local1];
			this.vertexZ[local1] = this.vertexX[local1];
			this.vertexX[local1] = -local10;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	@Override
	public final void method3817(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = MathUtils.SINE[arg0];
		@Pc(7) int local7 = MathUtils.COSINE[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.vertexCount; local9++) {
			@Pc(29) int local29 = this.vertexY[local9] * local3 + this.vertexX[local9] * local7 >> 16;
			this.vertexY[local9] = this.vertexY[local9] * local7 - this.vertexX[local9] * local3 >> 16;
			this.vertexX[local9] = local29;
		}
		this.bounds.valid = false;
		this.vertexBuffer.valid = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZZZ)V")
	public final void method3872(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (this.shareFlags != 0) {
			throw new IllegalArgumentException();
		} else if (this.anInt4691 != 0) {
			if (arg5) {
				@Pc(26) boolean local26 = !this.colorBuffer.valid && (arg1 || arg2 && !Preferences.highDetailLighting);
				this.method3870(false, !this.vertexBuffer.valid && arg0, local26, this.normalBuffer != null && !this.normalBuffer.valid && arg2, !this.texCoordBuffer.valid);
				if (!this.indexBuffer.valid && arg3 && arg1) {
					this.method3851();
				}
			}
			if (arg0) {
				if (this.vertexBuffer.valid) {
					if (!this.bounds.valid) {
						this.calculateBounds();
					}
					this.vertexX = null;
					this.vertexY = null;
					this.vertexZ = null;
					this.aShortArray93 = null;
					this.anIntArray506 = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x1);
				}
			}
			if (arg1) {
				if (this.colorBuffer.valid) {
					this.triangleColors = null;
					this.triangleAlpha = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x2);
				}
			}
			if (arg2 && Preferences.highDetailLighting) {
				if (this.normalBuffer.valid) {
					this.aShortArray95 = null;
					this.aShortArray90 = null;
					this.aShortArray87 = null;
					this.aShortArray89 = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x4);
				}
			}
			if (this.texCoordBuffer.valid) {
				this.vertexS = null;
				this.vertexT = null;
			} else {
				this.aByte16 = (byte) (this.aByte16 | 0x8);
			}
			if (arg3 && arg1) {
				if (this.indexBuffer.valid && this.colorBuffer.valid) {
					this.aShortArray94 = null;
					this.aShortArray97 = null;
					this.aShortArray98 = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x10);
				}
			}
			if (arg4) {
				this.vertexBones = null;
				this.triangleBones = null;
				this.boneVertices = null;
				this.boneTriangles = null;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public final Model method3831(@OriginalArg(0) boolean shareAlpha, @OriginalArg(1) boolean shareColors, @OriginalArg(2) boolean shareNormals) {
		return this.method3873(shareAlpha, shareColors, shareNormals, Static6.aClass53_Sub4_Sub2_2, Static6.aClass53_Sub4_Sub2_1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZLclient!s;Lclient!s;)Lclient!vg;")
	private Model method3873(@OriginalArg(0) boolean shareAlpha, @OriginalArg(1) boolean shareColors, @OriginalArg(2) boolean shareNormals, @OriginalArg(3) GlModel model, @OriginalArg(4) GlModel arg4) {
		model.vertexCount = this.vertexCount;
		model.anInt4688 = this.anInt4688;
		model.anInt4691 = this.anInt4691;
		model.triangleCount = this.triangleCount;
		model.aShort43 = this.aShort43;
		model.aShort44 = this.aShort44;
		model.shareFlags = (byte) ((shareAlpha && shareColors ? 0 : 2) | 0x1 | (shareNormals ? 0 : 4));
		if (model.vertexX == null || model.vertexX.length < this.vertexCount) {
			model.vertexX = new int[this.vertexCount + 100];
			model.vertexY = new int[this.vertexCount + 100];
			model.vertexZ = new int[this.vertexCount + 100];
		}
		for (@Pc(73) int i = 0; i < this.vertexCount; i++) {
			model.vertexX[i] = this.vertexX[i];
			model.vertexY[i] = this.vertexY[i];
			model.vertexZ[i] = this.vertexZ[i];
		}
		if (model.vertexBuffer == null) {
			model.vertexBuffer = new GlBuffer();
		}
		model.vertexBuffer.valid = false;
		if (model.bounds == null) {
			model.bounds = new BoundingBox();
		}
		model.bounds.valid = false;
		if (shareAlpha) {
			model.triangleAlpha = this.triangleAlpha;
		} else {
			if (arg4.triangleAlpha == null || arg4.triangleAlpha.length < this.triangleCount) {
				arg4.triangleAlpha = new byte[this.triangleCount + 100];
			}
			model.triangleAlpha = arg4.triangleAlpha;
			for (@Pc(156) int i = 0; i < this.triangleCount; i++) {
				model.triangleAlpha[i] = this.triangleAlpha[i];
			}
		}
		if (shareColors) {
			model.triangleColors = this.triangleColors;
		} else {
			if (arg4.triangleColors == null || arg4.triangleColors.length < this.triangleCount) {
				arg4.triangleColors = new short[this.triangleCount + 100];
			}
			model.triangleColors = arg4.triangleColors;
			for (@Pc(199) int i = 0; i < this.triangleCount; i++) {
				model.triangleColors[i] = this.triangleColors[i];
			}
		}
		if (shareAlpha && shareColors) {
			model.colorBuffer = this.colorBuffer;
		} else {
			if (arg4.colorBuffer == null) {
				arg4.colorBuffer = new GlBuffer();
			}
			model.colorBuffer = arg4.colorBuffer;
			model.colorBuffer.valid = false;
		}
		if (shareNormals || this.aShortArray95 == null) {
			model.aShortArray95 = this.aShortArray95;
			model.aShortArray90 = this.aShortArray90;
			model.aShortArray87 = this.aShortArray87;
			model.aShortArray89 = this.aShortArray89;
			model.normalBuffer = this.normalBuffer;
		} else {
			if (arg4.aShortArray95 == null || arg4.aShortArray95.length < this.anInt4691) {
				arg4.aShortArray95 = new short[this.anInt4691 + 100];
				arg4.aShortArray90 = new short[this.anInt4691 + 100];
				arg4.aShortArray87 = new short[this.anInt4691 + 100];
				arg4.aShortArray89 = new short[this.anInt4691 + 100];
			}
			model.aShortArray95 = arg4.aShortArray95;
			model.aShortArray90 = arg4.aShortArray90;
			model.aShortArray87 = arg4.aShortArray87;
			model.aShortArray89 = arg4.aShortArray89;
			for (@Pc(319) int i = 0; i < this.anInt4691; i++) {
				model.aShortArray95[i] = this.aShortArray95[i];
				model.aShortArray90[i] = this.aShortArray90[i];
				model.aShortArray87[i] = this.aShortArray87[i];
				model.aShortArray89[i] = this.aShortArray89[i];
			}
			if (Preferences.highDetailLighting) {
				if (arg4.normalBuffer == null) {
					arg4.normalBuffer = new GlBuffer();
				}
				model.normalBuffer = arg4.normalBuffer;
				model.normalBuffer.valid = false;
			} else {
				model.normalBuffer = null;
			}
		}
		model.vertexS = this.vertexS;
		model.vertexT = this.vertexT;
		model.vertexBones = this.vertexBones;
		model.boneVertices = this.boneVertices;
		model.aShortArray94 = this.aShortArray94;
		model.aShortArray97 = this.aShortArray97;
		model.aShortArray98 = this.aShortArray98;
		model.triangleTextures = this.triangleTextures;
		model.triangleBones = this.triangleBones;
		model.boneTriangles = this.boneTriangles;
		model.texCoordBuffer = this.texCoordBuffer;
		model.indexBuffer = this.indexBuffer;
		model.anIntArray505 = this.anIntArray505;
		model.aShortArray93 = this.aShortArray93;
		model.anIntArray506 = this.anIntArray506;
		model.aBoolean324 = this.aBoolean324;
		model.vertexSources = this.vertexSources;
		model.triangleSources = this.triangleSources;
		model.particleEmitters = this.particleEmitters;
		model.particleEffectors = this.particleEffectors;
		return model;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
	@Override
	protected final void transform(@OriginalArg(0) int type, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int z) {
		if (type == 0) {
			@Pc(3) int local3 = 0;
			originX = 0;
			originY = 0;
			originZ = 0;
			for (@Pc(11) int i = 0; i < this.vertexCount; i++) {
				originX += this.vertexX[i];
				originY += this.vertexY[i];
				originZ += this.vertexZ[i];
				local3++;
			}
			if (local3 > 0) {
				originX = originX / local3 + x;
				originY = originY / local3 + y;
				originZ = originZ / local3 + z;
			} else {
				originX = x;
				originY = y;
				originZ = z;
			}
		} else if (type == 1) {
			for (@Pc(72) int local72 = 0; local72 < this.vertexCount; local72++) {
				@Pc(78) int[] local78 = this.vertexX;
				local78[local72] += x;
				local78 = this.vertexY;
				local78[local72] += y;
				local78 = this.vertexZ;
				local78[local72] += z;
			}
		} else if (type == 2) {
			for (@Pc(108) int local108 = 0; local108 < this.vertexCount; local108++) {
				@Pc(114) int[] local114 = this.vertexX;
				local114[local108] -= originX;
				local114 = this.vertexY;
				local114[local108] -= originY;
				local114 = this.vertexZ;
				local114[local108] -= originZ;
				if (z != 0) {
					@Pc(142) int local142 = MathUtils.SINE[z];
					@Pc(146) int local146 = MathUtils.COSINE[z];
					@Pc(164) int local164 = this.vertexY[local108] * local142 + this.vertexX[local108] * local146 + 32767 >> 16;
					this.vertexY[local108] = this.vertexY[local108] * local146 + 32767 - this.vertexX[local108] * local142 >> 16;
					this.vertexX[local108] = local164;
				}
				if (x != 0) {
					@Pc(196) int local196 = MathUtils.SINE[x];
					@Pc(200) int local200 = MathUtils.COSINE[x];
					@Pc(218) int local218 = this.vertexY[local108] * local200 + 32767 - this.vertexZ[local108] * local196 >> 16;
					this.vertexZ[local108] = this.vertexY[local108] * local196 + this.vertexZ[local108] * local200 + 32767 >> 16;
					this.vertexY[local108] = local218;
				}
				if (y != 0) {
					@Pc(250) int local250 = MathUtils.SINE[y];
					@Pc(254) int local254 = MathUtils.COSINE[y];
					@Pc(272) int local272 = this.vertexZ[local108] * local250 + this.vertexX[local108] * local254 + 32767 >> 16;
					this.vertexZ[local108] = this.vertexZ[local108] * local254 + 32767 - this.vertexX[local108] * local250 >> 16;
					this.vertexX[local108] = local272;
				}
				@Pc(300) int[] local300 = this.vertexX;
				local300[local108] += originX;
				local300 = this.vertexY;
				local300[local108] += originY;
				local300 = this.vertexZ;
				local300[local108] += originZ;
			}
		} else if (type == 3) {
			for (@Pc(330) int local330 = 0; local330 < this.vertexCount; local330++) {
				@Pc(336) int[] local336 = this.vertexX;
				local336[local330] -= originX;
				local336 = this.vertexY;
				local336[local330] -= originY;
				local336 = this.vertexZ;
				local336[local330] -= originZ;
				this.vertexX[local330] = this.vertexX[local330] * x / 128;
				this.vertexY[local330] = this.vertexY[local330] * y / 128;
				this.vertexZ[local330] = this.vertexZ[local330] * z / 128;
				local336 = this.vertexX;
				local336[local330] += originX;
				local336 = this.vertexY;
				local336[local330] += originY;
				local336 = this.vertexZ;
				local336[local330] += originZ;
			}
		} else if (type == 5) {
			for (@Pc(426) int local426 = 0; local426 < this.triangleCount; local426++) {
				@Pc(441) int local441 = (this.triangleAlpha[local426] & 0xFF) + x * 8;
				if (local441 < 0) {
					local441 = 0;
				} else if (local441 > 255) {
					local441 = 255;
				}
				this.triangleAlpha[local426] = (byte) local441;
			}
			this.colorBuffer.valid = false;
		} else if (type == 7) {
			for (@Pc(469) int local469 = 0; local469 < this.triangleCount; local469++) {
				@Pc(480) int local480 = this.triangleColors[local469] & 0xFFFF;
				@Pc(486) int local486 = local480 >> 10 & 0x3F;
				@Pc(492) int local492 = local480 >> 7 & 0x7;
				@Pc(496) int local496 = local480 & 0x7F;
				local486 = local486 + x & 0x3F;
				@Pc(508) int local508 = local492 + y / 4;
				if (local508 < 0) {
					local508 = 0;
				} else if (local508 > 7) {
					local508 = 7;
				}
				@Pc(522) int local522 = local496 + z;
				if (local522 < 0) {
					local522 = 0;
				} else if (local522 > 127) {
					local522 = 127;
				}
				this.triangleColors[local469] = (short) (local486 << 10 | local508 << 7 | local522);
			}
			this.colorBuffer.valid = false;
		}
	}
}

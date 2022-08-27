import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Light {

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "[I")
	private static int[] NOISE;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)V")
	private static void init() {
		NOISE = createNoise(0.4F);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIFIIZB)[I")
	private static int[] createNoise(@OriginalArg(3) float arg0) {
		@Pc(2) int[] noise = new int[2048];
		@Pc(16) TextureOpPerlinNoise op = new TextureOpPerlinNoise();
		op.anInt2620 = (int) (arg0 * 4096.0F);
		op.anInt2628 = 4;
		op.aBoolean181 = true;
		op.anInt2631 = 8;
		op.seed = 35;
		op.anInt2625 = 8;
		op.postDecode();
		Texture.setSize(2048, 1);
		op.method2053(noise, 0);
		return noise;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	public final int radius;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Z")
	public final boolean aBoolean78;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "[S")
	public final short[] aShortArray28;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public final int color;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	public final int functionPreset;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	private int function;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "Lclient!pi;")
	public GroundLightModel groundModel;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "Z")
	public final boolean aBoolean79;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "I")
	public int level;

	@OriginalMember(owner = "client!em", name = "t", descriptor = "I")
	private int frequency;

	@OriginalMember(owner = "client!em", name = "u", descriptor = "F")
	public float quadraticAttenuation;

	@OriginalMember(owner = "client!em", name = "v", descriptor = "I")
	private int alphaMin;

	@OriginalMember(owner = "client!em", name = "x", descriptor = "I")
	private int alphaMax;

	@OriginalMember(owner = "client!em", name = "y", descriptor = "I")
	private final int phase;

	@OriginalMember(owner = "client!em", name = "D", descriptor = "F")
	public float alpha;

	@OriginalMember(owner = "client!em", name = "G", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "[F")
	public final float[] diffuse = new float[4];

	@OriginalMember(owner = "client!em", name = "s", descriptor = "Z")
	public boolean linkBelow = false;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Light(@OriginalArg(0) Buffer buffer) {
		if (NOISE == null) {
			init();
		}
		this.level = buffer.readUnsignedByte();
		this.aBoolean78 = (this.level & 0x10) != 0;
		this.aBoolean79 = (this.level & 0x8) != 0;
		this.level &= 7;
		this.x = buffer.readUnsignedShort();
		this.z = buffer.readUnsignedShort();
		this.y = buffer.readUnsignedShort();
		this.radius = buffer.readUnsignedByte();
		this.method1075();
		this.aShortArray28 = new short[this.radius * 2 + 1];
		for (@Pc(81) int i = 0; i < this.aShortArray28.length; i++) {
			this.aShortArray28[i] = (short) buffer.readUnsignedShort();
		}
		this.color = ColorUtils.HSL_TO_RGB[buffer.readUnsignedShort()];
		@Pc(108) int functionPresetAndPhase = buffer.readUnsignedByte();
		this.functionPreset = functionPresetAndPhase & 0x1F;
		this.phase = (functionPresetAndPhase & 0xE0) << 3;
		if (this.functionPreset != 31) {
			this.setFunctionPreset();
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V")
	public void setFunction(@OriginalArg(3) int function, @OriginalArg(4) int frequency, @OriginalArg(2) int alphaMin, @OriginalArg(0) int alphaMax) {
		this.function = function;
		this.frequency = frequency;
		this.alphaMin = alphaMin;
		this.alphaMax = alphaMax;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
	private void setFunctionPreset() {
		@Pc(11) int preset = this.functionPreset;
		if (preset == 2) {
			this.function = 1;
			this.alphaMin = 0;
			this.alphaMax = 2048;
			this.frequency = 2048;
		} else if (preset == 3) {
			this.function = 1;
			this.alphaMax = 2048;
			this.alphaMin = 0;
			this.frequency = 4096;
		} else if (preset == 4) {
			this.alphaMax = 2048;
			this.alphaMin = 0;
			this.function = 4;
			this.frequency = 2048;
		} else if (preset == 5) {
			this.function = 4;
			this.frequency = 8192;
			this.alphaMin = 0;
			this.alphaMax = 2048;
		} else if (preset == 12) {
			this.alphaMax = 2048;
			this.alphaMin = 0;
			this.frequency = 2048;
			this.function = 2;
		} else if (preset == 13) {
			this.function = 2;
			this.alphaMax = 2048;
			this.alphaMin = 0;
			this.frequency = 8192;
		} else if (preset == 10) {
			this.alphaMin = 1536;
			this.frequency = 2048;
			this.alphaMax = 512;
			this.function = 3;
		} else if (preset == 11) {
			this.alphaMin = 1536;
			this.frequency = 4096;
			this.function = 3;
			this.alphaMax = 512;
		} else if (preset == 6) {
			this.alphaMin = 1280;
			this.alphaMax = 768;
			this.frequency = 2048;
			this.function = 3;
		} else if (preset == 7) {
			this.frequency = 4096;
			this.alphaMin = 1280;
			this.function = 3;
			this.alphaMax = 768;
		} else if (preset == 8) {
			this.alphaMin = 1024;
			this.function = 3;
			this.alphaMax = 1024;
			this.frequency = 2048;
		} else if (preset == 9) {
			this.function = 3;
			this.alphaMax = 1024;
			this.alphaMin = 1024;
			this.frequency = 4096;
		} else if (preset == 14) {
			this.alphaMin = 1280;
			this.function = 1;
			this.alphaMax = 768;
			this.frequency = 2048;
		} else if (preset == 15) {
			this.alphaMin = 1536;
			this.alphaMax = 512;
			this.function = 1;
			this.frequency = 4096;
		} else if (preset == 16) {
			this.alphaMin = 1792;
			this.frequency = 8192;
			this.alphaMax = 256;
			this.function = 1;
		} else {
			this.alphaMax = 2048;
			this.alphaMin = 0;
			this.frequency = 2048;
			this.function = 0;
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	private void method1075() {
		@Pc(14) int local14 = (this.radius << 7) + 64;
		this.quadraticAttenuation = 1.0F / (float) (local14 * local14);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZI)V")
	public void method1076(@OriginalArg(2) int loop, @OriginalArg(0) boolean disableFlicker) {
		@Pc(22) int t = this.phase + this.frequency * loop / 50 & 0x7FF;
		@Pc(25) int function = this.function;
		@Pc(56) int alpha;
		if (function == 1) {
			alpha = (MathUtils.SINE[t] >> 6) + 1024;
		} else if (function == 3) {
			alpha = NOISE[t] >> 1;
		} else if (function == 4) {
			alpha = t >> 10 << 11;
		} else if (function == 2) {
			alpha = t;
		} else if (function == 5) {
			alpha = (t < 1024 ? t : 2048 - t) << 1;
		} else {
			alpha = 2048;
		}
		if (disableFlicker) {
			alpha = 2048;
		}
		this.alpha = (float) ((alpha * this.alphaMax >> 11) + this.alphaMin) / 2048.0F;
		@Pc(120) float alphaFraction = this.alpha / 255.0F;
		this.diffuse[2] = (float) (this.color & 0xFF) * alphaFraction;
		this.diffuse[0] = (float) (this.color >> 16 & 0xFF) * alphaFraction;
		this.diffuse[1] = (float) (this.color >> 8 & 0xFF) * alphaFraction;
	}
}

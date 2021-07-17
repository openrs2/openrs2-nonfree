import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class TextureOp17 extends TextureOp {

	@OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
	private int anInt3172;

	@OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
	private int anInt3174;

	@OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
	private int anInt3175;

	@OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "client!lj", name = "ib", descriptor = "I")
	private int anInt3186;

	@OriginalMember(owner = "client!lj", name = "jb", descriptor = "I")
	private int anInt3187;

	@OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
	private int anInt3176 = 0;

	@OriginalMember(owner = "client!lj", name = "hb", descriptor = "I")
	private int anInt3185 = 0;

	@OriginalMember(owner = "client!lj", name = "lb", descriptor = "I")
	private int anInt3189 = 0;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public TextureOp17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIB)V")
	private void method2594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(29) int local29 = arg1 > 2048 ? arg2 + arg1 - (arg1 * arg2 >> 12) : arg1 * (arg2 + 4096) >> 12;
		if (local29 <= 0) {
			this.anInt3172 = this.anInt3174 = this.anInt3187 = arg1;
			return;
		}
		@Pc(38) int local38 = arg1 + arg1 - local29;
		@Pc(47) int local47 = (local29 - local38 << 12) / local29;
		arg0 *= 6;
		@Pc(55) int local55 = arg0 >> 12;
		@Pc(64) int local64 = arg0 - (local55 << 12);
		@Pc(70) int local70 = local47 * local29 >> 12;
		local70 = local70 * local64 >> 12;
		@Pc(81) int local81 = local29 - local70;
		@Pc(85) int local85 = local38 + local70;
		if (local55 == 0) {
			this.anInt3174 = local85;
			this.anInt3172 = local29;
			this.anInt3187 = local38;
		} else if (local55 == 1) {
			this.anInt3174 = local29;
			this.anInt3172 = local81;
			this.anInt3187 = local38;
		} else if (local55 == 2) {
			this.anInt3172 = local38;
			this.anInt3174 = local29;
			this.anInt3187 = local85;
		} else if (local55 == 3) {
			this.anInt3172 = local38;
			this.anInt3174 = local81;
			this.anInt3187 = local29;
		} else if (local55 == 4) {
			this.anInt3172 = local85;
			this.anInt3174 = local38;
			this.anInt3187 = local29;
		} else if (local55 == 5) {
			this.anInt3174 = local38;
			this.anInt3172 = local29;
			this.anInt3187 = local81;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt3185 = buffer.readShort();
		} else if (code == 1) {
			this.anInt3189 = (buffer.readByte() << 12) / 100;
		} else if (code == 2) {
			this.anInt3176 = (buffer.readByte() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V")
	private void method2596(@OriginalArg(3) int r, @OriginalArg(1) int g, @OriginalArg(0) int b) {
		@Pc(8) int local8 = g >= r ? g : r;
		local8 = local8 < b ? b : local8;
		@Pc(34) int local34 = r < g ? r : g;
		local34 = local34 > b ? b : local34;
		this.anInt3179 = (local8 + local34) / 2;
		@Pc(62) int local62 = local8 - local34;
		if (local62 <= 0) {
			this.anInt3175 = 0;
		} else {
			@Pc(81) int local81 = (local8 - b << 12) / local62;
			@Pc(90) int local90 = (local8 - r << 12) / local62;
			@Pc(98) int local98 = (local8 - g << 12) / local62;
			if (local8 == r) {
				this.anInt3175 = g == local34 ? local81 + 20480 : 4096 - local98;
			} else if (local8 == g) {
				this.anInt3175 = b == local34 ? local90 + 4096 : 12288 - local81;
			} else {
				this.anInt3175 = local34 == r ? local98 + 12288 : 20480 - local90;
			}
			this.anInt3175 /= 6;
		}
		if (this.anInt3179 > 0 && this.anInt3179 < 4096) {
			this.anInt3186 = (local62 << 12) / (this.anInt3179 <= 2048 ? this.anInt3179 * 2 : 8192 - this.anInt3179 * 2);
		} else {
			this.anInt3186 = 0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(18) int[][] dest = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(28) int[][] src = this.getChildColorOutput(0, y);
			@Pc(32) int[] srcRed = src[0];
			@Pc(36) int[] srcGreen = src[1];
			@Pc(40) int[] destRed = dest[0];
			@Pc(44) int[] srcBlue = src[2];
			@Pc(48) int[] destGreen = dest[1];
			@Pc(52) int[] destBlue = dest[2];
			for (@Pc(54) int x = 0; x < Texture.width; x++) {
				this.method2596(srcRed[x], srcGreen[x], srcBlue[x]);
				this.anInt3179 += this.anInt3176;
				this.anInt3186 += this.anInt3189;
				if (this.anInt3186 < 0) {
					this.anInt3186 = 0;
				}
				this.anInt3175 += this.anInt3185;
				if (this.anInt3186 > 4096) {
					this.anInt3186 = 4096;
				}
				while (this.anInt3175 < 0) {
					this.anInt3175 += 4096;
				}
				if (this.anInt3179 < 0) {
					this.anInt3179 = 0;
				}
				if (this.anInt3179 > 4096) {
					this.anInt3179 = 4096;
				}
				while (this.anInt3175 > 4096) {
					this.anInt3175 -= 4096;
				}
				this.method2594(this.anInt3175, this.anInt3179, this.anInt3186);
				destRed[x] = this.anInt3172;
				destGreen[x] = this.anInt3174;
				destBlue[x] = this.anInt3187;
			}
		}
		return dest;
	}
}

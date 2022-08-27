import java.util.Random;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class TextureOpLineNoise extends TextureOp {

	@OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
	private int seed = 0;

	@OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
	private int minAngle = 0;

	@OriginalMember(owner = "client!kl", name = "X", descriptor = "I")
	private int count = 2000;

	@OriginalMember(owner = "client!kl", name = "cb", descriptor = "I")
	private int maxAngle = 4096;

	@OriginalMember(owner = "client!kl", name = "db", descriptor = "I")
	private int length = 16;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public TextureOpLineNoise() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(B)V")
	@Override
	public void postDecode() {
		TextureOp.createTrigonometryTables();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.seed = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.count = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.length = buffer.readUnsignedByte();
		} else if (code == 3) {
			this.minAngle = buffer.readUnsignedShort();
		} else if (code == 4) {
			this.maxAngle = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(7) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(16) int local16 = this.maxAngle >> 1;
			@Pc(21) int[][] pixels = this.monochromeImageCache.get();
			@Pc(28) Random random = new Random(this.seed);
			for (@Pc(30) int i = 0; i < this.count; i++) {
				@Pc(60) int angle = this.maxAngle > 0 ? this.minAngle + RandomUtils.nextInt(random, this.maxAngle) - local16 : this.minAngle;
				angle = angle >> 4 & 0xFF;
				@Pc(73) int x0 = RandomUtils.nextInt(random, Texture.width);
				@Pc(78) int y0 = RandomUtils.nextInt(random, Texture.height);
				@Pc(89) int x1 = x0 + (TextureOp.COSINE[angle] * this.length >> 12);
				@Pc(100) int y1 = y0 + (TextureOp.SINE[angle] * this.length >> 12);
				@Pc(105) int local105 = y1 - y0;
				@Pc(110) int local110 = x1 - x0;
				if (local110 != 0 || local105 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(145) boolean local145 = local105 > local110;
					if (local145) {
						@Pc(150) int local150 = x1;
						@Pc(152) int local152 = x0;
						x0 = y0;
						x1 = y1;
						y0 = local152;
						y1 = local150;
					}
					if (x0 > x1) {
						@Pc(165) int local165 = x0;
						x0 = x1;
						@Pc(169) int local169 = y0;
						x1 = local165;
						y0 = y1;
						y1 = local169;
					}
					@Pc(177) int local177 = y0;
					@Pc(181) int local181 = x1 - x0;
					@Pc(186) int local186 = -local181 / 2;
					@Pc(191) int local191 = y1 - y0;
					@Pc(201) int local201 = 1024 - (RandomUtils.nextInt(random, 4096) >> 2);
					if (local191 < 0) {
						local191 = -local191;
					}
					@Pc(213) int local213 = 2048 / local181;
					@Pc(224) int local224 = y1 <= y0 ? -1 : 1;
					for (@Pc(226) int local226 = x0; local226 < x1; local226++) {
						local186 += local191;
						@Pc(247) int local247 = local201 + (local226 - x0) * local213 + 1024;
						@Pc(251) int local251 = local177 & Texture.heightMask;
						@Pc(255) int local255 = Texture.widthMask & local226;
						if (local186 > 0) {
							local186 += -local181;
							local177 += local224;
						}
						if (local145) {
							pixels[local251][local255] = local247;
						} else {
							pixels[local255][local251] = local247;
						}
					}
				}
			}
		}
		return dest;
	}
}

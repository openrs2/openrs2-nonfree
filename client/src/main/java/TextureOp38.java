import java.util.Random;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class TextureOp38 extends TextureOp {

	@OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
	private int anInt2915 = 0;

	@OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
	private int anInt2914 = 0;

	@OriginalMember(owner = "client!kl", name = "X", descriptor = "I")
	private int anInt2919 = 2000;

	@OriginalMember(owner = "client!kl", name = "cb", descriptor = "I")
	private int anInt2923 = 4096;

	@OriginalMember(owner = "client!kl", name = "db", descriptor = "I")
	private int anInt2924 = 16;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public TextureOp38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(B)V")
	@Override
	public final void postDecode() {
		TextureOp.createTrigonometryTables();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt2915 = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.anInt2919 = buffer.readUnsignedShort();
		} else if (code == 2) {
			this.anInt2924 = buffer.readUnsignedByte();
		} else if (code == 3) {
			this.anInt2914 = buffer.readUnsignedShort();
		} else if (code == 4) {
			this.anInt2923 = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(7) int[] dest = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(16) int local16 = this.anInt2923 >> 1;
			@Pc(21) int[][] pixels = this.monochromeImageCache.get();
			@Pc(28) Random random = new Random(this.anInt2915);
			for (@Pc(30) int local30 = 0; local30 < this.anInt2919; local30++) {
				@Pc(60) int local60 = this.anInt2923 > 0 ? this.anInt2914 + RandomUtils.nextInt(random, this.anInt2923) - local16 : this.anInt2914;
				local60 = local60 >> 4 & 0xFF;
				@Pc(73) int local73 = RandomUtils.nextInt(random, Texture.width);
				@Pc(78) int local78 = RandomUtils.nextInt(random, Texture.height);
				@Pc(89) int local89 = local73 + (TextureOp.COSINE[local60] * this.anInt2924 >> 12);
				@Pc(100) int local100 = local78 + (TextureOp.SINE[local60] * this.anInt2924 >> 12);
				@Pc(105) int local105 = local100 - local78;
				@Pc(110) int local110 = local89 - local73;
				if (local110 != 0 || local105 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(145) boolean local145 = local105 > local110;
					if (local145) {
						@Pc(150) int local150 = local89;
						@Pc(152) int local152 = local73;
						local73 = local78;
						local89 = local100;
						local78 = local152;
						local100 = local150;
					}
					if (local73 > local89) {
						@Pc(165) int local165 = local73;
						local73 = local89;
						@Pc(169) int local169 = local78;
						local89 = local165;
						local78 = local100;
						local100 = local169;
					}
					@Pc(177) int local177 = local78;
					@Pc(181) int local181 = local89 - local73;
					@Pc(186) int local186 = -local181 / 2;
					@Pc(191) int local191 = local100 - local78;
					@Pc(201) int local201 = 1024 - (RandomUtils.nextInt(random, 4096) >> 2);
					if (local191 < 0) {
						local191 = -local191;
					}
					@Pc(213) int local213 = 2048 / local181;
					@Pc(224) int local224 = local100 <= local78 ? -1 : 1;
					for (@Pc(226) int local226 = local73; local226 < local89; local226++) {
						local186 += local191;
						@Pc(247) int local247 = local201 + (local226 - local73) * local213 + 1024;
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

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class TextureOp5 extends TextureOp {

	@OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
	private int anInt5587 = 1;

	@OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
	private int anInt5586 = 1;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public TextureOp5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4695(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(32) int local32 = this.anInt5587 + this.anInt5587 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt5586 + this.anInt5586 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local32][][];
			for (@Pc(57) int local57 = arg0 - this.anInt5587; local57 <= arg0 + this.anInt5587; local57++) {
				@Pc(76) int[][] local76 = this.method4686(0, local57 & Static6.anInt5001);
				@Pc(80) int[][] local80 = new int[3][Static2.anInt1626];
				@Pc(82) int local82 = 0;
				@Pc(84) int local84 = 0;
				@Pc(88) int[] local88 = local76[0];
				@Pc(90) int local90 = 0;
				@Pc(94) int[] local94 = local76[2];
				@Pc(98) int[] local98 = local76[1];
				for (@Pc(102) int local102 = -this.anInt5586; local102 <= this.anInt5586; local102++) {
					@Pc(114) int local114 = Static1.anInt901 & local102;
					local90 += local98[local114];
					local82 += local88[local114];
					local84 += local94[local114];
				}
				@Pc(139) int[] local139 = local80[0];
				@Pc(143) int[] local143 = local80[1];
				@Pc(147) int[] local147 = local80[2];
				@Pc(149) int local149 = 0;
				while (Static2.anInt1626 > local149) {
					local139[local149] = local48 * local82 >> 16;
					local143[local149] = local90 * local48 >> 16;
					local147[local149] = local48 * local84 >> 16;
					@Pc(184) int local184 = local149 - this.anInt5586 & Static1.anInt901;
					@Pc(190) int local190 = local90 - local98[local184];
					@Pc(196) int local196 = local82 - local88[local184];
					local149++;
					@Pc(203) int local203 = local84 - local94[local184];
					local184 = local149 + this.anInt5586 & Static1.anInt901;
					local82 = local196 + local88[local184];
					local90 = local190 + local98[local184];
					local84 = local203 + local94[local184];
				}
				local51[local57 + this.anInt5587 - arg0] = local80;
			}
			@Pc(249) int[] local249 = local11[1];
			@Pc(253) int[] local253 = local11[2];
			@Pc(257) int[] local257 = local11[0];
			for (@Pc(259) int local259 = 0; local259 < Static2.anInt1626; local259++) {
				@Pc(264) int local264 = 0;
				@Pc(266) int local266 = 0;
				@Pc(268) int local268 = 0;
				for (@Pc(270) int local270 = 0; local270 < local32; local270++) {
					@Pc(277) int[][] local277 = local51[local270];
					local268 += local277[2][local259];
					local264 += local277[0][local259];
					local266 += local277[1][local259];
				}
				local257[local259] = local36 * local264 >> 16;
				local249[local259] = local36 * local266 >> 16;
				local253[local259] = local268 * local36 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt5586 = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.anInt5587 = buffer.readUnsignedByte();
		} else if (code == 2) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(arg0);
		if (this.monochromeImageCache.invalid) {
			@Pc(33) int local33 = this.anInt5587 + this.anInt5587 + 1;
			@Pc(37) int local37 = 65536 / local33;
			@Pc(45) int local45 = this.anInt5586 + this.anInt5586 + 1;
			@Pc(49) int local49 = 65536 / local45;
			@Pc(52) int[][] local52 = new int[local33][];
			for (@Pc(58) int local58 = arg0 - this.anInt5587; local58 <= arg0 + this.anInt5587; local58++) {
				@Pc(75) int[] local75 = this.method4699(Static6.anInt5001 & local58, 0);
				@Pc(78) int[] local78 = new int[Static2.anInt1626];
				@Pc(80) int local80 = 0;
				for (@Pc(84) int local84 = -this.anInt5586; local84 <= this.anInt5586; local84++) {
					local80 += local75[Static1.anInt901 & local84];
				}
				@Pc(105) int local105 = 0;
				while (local105 < Static2.anInt1626) {
					local78[local105] = local80 * local49 >> 16;
					@Pc(128) int local128 = local80 - local75[Static1.anInt901 & local105 - this.anInt5586];
					local105++;
					local80 = local128 + local75[local105 + this.anInt5586 & Static1.anInt901];
				}
				local52[local58 + this.anInt5587 - arg0] = local78;
			}
			for (@Pc(158) int local158 = 0; local158 < Static2.anInt1626; local158++) {
				@Pc(167) int local167 = 0;
				for (@Pc(169) int local169 = 0; local169 < local33; local169++) {
					local167 += local52[local169][local158];
				}
				local19[local158] = local37 * local167 >> 16;
			}
		}
		return local19;
	}
}

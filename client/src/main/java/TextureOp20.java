import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class TextureOp20 extends TextureOp {

	@OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
	private int anInt3022 = 4;

	@OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
	private int anInt3026 = 4;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public TextureOp20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt3022 = buffer.readUnsignedByte();
		} else if (code == 1) {
			this.anInt3026 = buffer.readUnsignedByte();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(19) int[] local19 = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(29) int local29 = Texture.width / this.anInt3022;
			@Pc(34) int local34 = Texture.height / this.anInt3026;
			@Pc(53) int[] local53;
			if (local34 > 0) {
				@Pc(43) int local43 = y % local34;
				local53 = this.method4699(Texture.height * local43 / local34, 0);
			} else {
				local53 = this.method4699(0, 0);
			}
			for (@Pc(63) int local63 = 0; local63 < Texture.width; local63++) {
				if (local29 > 0) {
					@Pc(73) int local73 = local63 % local29;
					local19[local63] = local53[local73 * Texture.width / local29];
				} else {
					local19[local63] = local53[0];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(20) int[][] local20 = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(29) int local29 = Texture.width / this.anInt3022;
			@Pc(34) int local34 = Texture.height / this.anInt3026;
			@Pc(53) int[][] local53;
			if (local34 > 0) {
				@Pc(43) int local43 = y % local34;
				local53 = this.method4686(0, local43 * Texture.height / local34);
			} else {
				local53 = this.method4686(0, 0);
			}
			@Pc(65) int[] local65 = local53[0];
			@Pc(69) int[] local69 = local53[1];
			@Pc(73) int[] local73 = local53[2];
			@Pc(77) int[] local77 = local20[0];
			@Pc(81) int[] local81 = local20[1];
			@Pc(85) int[] local85 = local20[2];
			for (@Pc(87) int local87 = 0; local87 < Texture.width; local87++) {
				@Pc(101) int local101;
				if (local29 <= 0) {
					local101 = 0;
				} else {
					@Pc(107) int local107 = local87 % local29;
					local101 = Texture.width * local107 / local29;
				}
				local77[local87] = local65[local101];
				local81[local87] = local69[local101];
				local85[local87] = local73[local101];
			}
		}
		return local20;
	}
}

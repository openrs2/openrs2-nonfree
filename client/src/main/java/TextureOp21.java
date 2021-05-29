import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class TextureOp21 extends TextureOp {

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public TextureOp21() {
		super(3, false);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] local16 = this.monochromeImageCache.get(y);
		if (this.monochromeImageCache.invalid) {
			@Pc(26) int[] local26 = this.method4699(y, 0);
			@Pc(32) int[] local32 = this.method4699(y, 1);
			@Pc(38) int[] local38 = this.method4699(y, 2);
			for (@Pc(40) int local40 = 0; local40 < Texture.width; local40++) {
				@Pc(47) int local47 = local38[local40];
				if (local47 == 4096) {
					local16[local40] = local26[local40];
				} else if (local47 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local47 * local26[local40] + local32[local40] * (4096 - local47) >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int code) {
		if (code == 0) {
			this.monochrome = buffer.readUnsignedByte() == 1;
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(16) int[][] local16 = this.colorImageCache.get(y);
		if (this.colorImageCache.invalid) {
			@Pc(29) int[] local29 = this.method4699(y, 2);
			@Pc(35) int[][] local35 = this.method4686(0, y);
			@Pc(41) int[][] local41 = this.method4686(1, y);
			@Pc(45) int[] local45 = local16[0];
			@Pc(49) int[] local49 = local16[1];
			@Pc(53) int[] local53 = local16[2];
			@Pc(57) int[] local57 = local35[1];
			@Pc(61) int[] local61 = local35[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local35[2];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Texture.width; local79++) {
				@Pc(86) int local86 = local29[local79];
				if (local86 == 4096) {
					local45[local79] = local61[local79];
					local49[local79] = local57[local79];
					local53[local79] = local73[local79];
				} else if (local86 == 0) {
					local45[local79] = local69[local79];
					local49[local79] = local65[local79];
					local53[local79] = local77[local79];
				} else {
					@Pc(141) int local141 = 4096 - local86;
					local45[local79] = local69[local79] * local141 + local61[local79] * local86 >> 12;
					local49[local79] = local65[local79] * local141 + local86 * local57[local79] >> 12;
					local53[local79] = local73[local79] * local86 + local141 * local77[local79] >> 12;
				}
			}
		}
		return local16;
	}
}

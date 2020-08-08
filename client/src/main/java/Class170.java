import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class170 {

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	private int anInt5321;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	private int anInt5320;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(II)V")
	public Class170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static30.method3603(arg0, arg1);
			arg0 /= local12;
			this.anIntArrayArray47 = new int[arg0][14];
			arg1 /= local12;
			this.anInt5321 = arg0;
			this.anInt5320 = arg1;
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				@Pc(48) double local48 = (double) local33 / (double) arg0 + 6.0D;
				@Pc(53) int[] local53 = this.anIntArrayArray47[local33];
				@Pc(61) int local61 = (int) Math.floor(local48 + 1.0D - 7.0D);
				@Pc(67) int local67 = (int) Math.ceil(local48 + 7.0D);
				if (local67 > 14) {
					local67 = 14;
				}
				@Pc(78) double local78 = (double) arg1 / (double) arg0;
				if (local61 < 0) {
					local61 = 0;
				}
				while (local61 < local67) {
					@Pc(96) double local96 = ((double) local61 - local48) * 3.141592653589793D;
					@Pc(98) double local98 = local78;
					if (-1.0E-4D > local96 || local96 > 1.0E-4D) {
						local98 = local78 * (Math.sin(local96) / local96);
					}
					@Pc(127) double local127 = local98 * (Math.cos(((double) local61 - local48) * 0.2243994752564138D) * 0.46D + 0.54D);
					local53[local61] = (int) Math.floor(local127 * 65536.0D + 0.5D);
					local61++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I")
	public final int method4302(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray47 != null) {
			arg0 = (int) ((long) this.anInt5320 * (long) arg0 / (long) this.anInt5321);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
	public final int method4303(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray47 != null) {
			arg0 = (int) ((long) this.anInt5320 * (long) arg0 / (long) this.anInt5321) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B[B)[B")
	public final byte[] method4305(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray47 != null) {
			@Pc(29) int local29 = (int) ((long) this.anInt5320 * (long) arg0.length / (long) this.anInt5321) + 14;
			@Pc(31) int local31 = 0;
			@Pc(34) int[] local34 = new int[local29];
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
				@Pc(46) byte local46 = arg0[local38];
				@Pc(51) int[] local51 = this.anIntArrayArray47[local36];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local31 + local53] += local51[local53] * local46;
				}
				@Pc(77) int local77 = local36 + this.anInt5320;
				@Pc(82) int local82 = local77 / this.anInt5321;
				local31 += local82;
				local36 = local77 - this.anInt5321 * local82;
			}
			arg0 = new byte[local29];
			for (@Pc(101) int local101 = 0; local101 < local29; local101++) {
				@Pc(116) int local116 = local34[local101] + 32768 >> 16;
				if (local116 < -128) {
					arg0[local101] = -128;
				} else if (local116 > 127) {
					arg0[local101] = 127;
				} else {
					arg0[local101] = (byte) local116;
				}
			}
		}
		return arg0;
	}
}

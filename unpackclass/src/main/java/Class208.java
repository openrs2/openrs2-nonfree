import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!l")
public final class Class208 {

	@OriginalMember(owner = "unpackclass!l", name = "a", descriptor = "([BI[BII)V")
	public static void method4926(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				arg4--;
				@Pc(19) int local19 = arg1 + arg4;
				@Pc(23) int local23 = arg3 + arg4;
				arg4 = local19 - arg4;
				arg4 += 7;
				while (local19 >= arg4) {
					@Pc(32) int local32 = local23 - 1;
					@Pc(35) int local35 = local19 - 1;
					arg2[local23] = arg0[local19];
					arg2[local32--] = arg0[local35--];
					arg2[local32--] = arg0[local35--];
					arg2[local32--] = arg0[local35--];
					arg2[local32--] = arg0[local35--];
					arg2[local32--] = arg0[local35--];
					arg2[local32--] = arg0[local35--];
					local23 = local32 - 1;
					local19 = local35 - 1;
					arg2[local32] = arg0[local35];
				}
				arg4 -= 7;
				while (local19 >= arg4) {
					arg2[local23--] = arg0[local19--];
				}
				return;
			}
		}
		arg4 += arg1;
		arg4 -= 7;
		while (arg1 < arg4) {
			@Pc(119) int local119 = arg3 + 1;
			@Pc(122) int local122 = arg1 + 1;
			arg2[arg3] = arg0[arg1];
			arg2[local119++] = arg0[local122++];
			arg2[local119++] = arg0[local122++];
			arg2[local119++] = arg0[local122++];
			arg2[local119++] = arg0[local122++];
			arg2[local119++] = arg0[local122++];
			arg2[local119++] = arg0[local122++];
			arg3 = local119 + 1;
			arg1 = local122 + 1;
			arg2[local119] = arg0[local122];
		}
		arg4 += 7;
		while (arg1 < arg4) {
			arg2[arg3++] = arg0[arg1++];
		}
	}
}

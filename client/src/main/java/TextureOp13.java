import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class TextureOp13 extends TextureOp {

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public TextureOp13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(III)I")
	private int method3950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		local10 ^= local10 << 1;
		return 4096 - (Integer.MAX_VALUE & local10 * (local10 * 15731 * local10 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(21) int local21 = Static6.anIntArray478[arg0];
			for (@Pc(23) int local23 = 0; local23 < Static2.anInt1626; local23++) {
				local9[local23] = this.method3950(local21, Static4.anIntArray231[local23]) % 4096;
			}
		}
		return local9;
	}
}

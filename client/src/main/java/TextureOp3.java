import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class TextureOp3 extends TextureOp {

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public TextureOp3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			ArrayUtils.fill(local15, 0, Static2.anInt1626, Static6.anIntArray478[arg0]);
		}
		return local15;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class4_Sub1_Sub23 extends Class4_Sub1 {

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[I")
	@Override
	public final int[] method4694(@OriginalArg(1) int arg0) {
		return Static4.anIntArray231;
	}
}

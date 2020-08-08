import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class4_Sub16 extends Class4 {

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	public final int anInt3294;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	public final int anInt3293;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V")
	public Class4_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3294 = arg0;
		this.anInt3293 = arg1;
	}
}

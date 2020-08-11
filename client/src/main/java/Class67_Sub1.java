import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!cn;)Lclient!cn;")
	@Override
	public final ReferenceNode method2015(@OriginalArg(1) ReferenceNode arg0) {
		return new SoftReferenceNode(arg0.get());
	}
}

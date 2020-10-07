import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class SoftReferenceNodeFactory extends ReferenceNodeFactory {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!cn;)Lclient!cn;")
	@Override
	public final ReferenceNode create(@OriginalArg(1) ReferenceNode node) {
		return new SoftReferenceNode(node.get());
	}
}

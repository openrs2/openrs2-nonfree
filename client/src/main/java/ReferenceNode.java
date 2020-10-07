import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public abstract class ReferenceNode extends SecondaryNode {

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	protected ReferenceNode() {
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object get();

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)Z")
	public abstract boolean isSoft();
}

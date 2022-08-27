import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class HardReferenceNode extends ReferenceNode {

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object referent;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public HardReferenceNode(@OriginalArg(0) Object referent) {
		this.referent = referent;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)Z")
	@Override
	public boolean isSoft() {
		return false;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object get() {
		return this.referent;
	}
}

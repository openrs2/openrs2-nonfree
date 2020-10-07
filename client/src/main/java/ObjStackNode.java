import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class ObjStackNode extends SecondaryNode {

	@OriginalMember(owner = "client!w", name = "C", descriptor = "Lclient!he;")
	public final ObjStack value;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!he;)V")
	public ObjStackNode(@OriginalArg(0) ObjStack value) {
		this.value = value;
	}
}

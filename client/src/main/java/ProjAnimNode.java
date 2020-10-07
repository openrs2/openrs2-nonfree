import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class ProjAnimNode extends SecondaryNode {

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "Lclient!oc;")
	public final ProjAnim value;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!oc;)V")
	public ProjAnimNode(@OriginalArg(0) ProjAnim value) {
		this.value = value;
	}
}

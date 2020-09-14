import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class SpotAnimNode extends SecondaryNode {

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "Lclient!o;")
	public final SpotAnim value;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!o;)V")
	public SpotAnimNode(@OriginalArg(0) SpotAnim value) {
		this.value = value;
	}
}

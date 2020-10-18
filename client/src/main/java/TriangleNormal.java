import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class TriangleNormal {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
	public int z;
}

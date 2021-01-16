import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class SubInterface extends Node {

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
	public int id;
}

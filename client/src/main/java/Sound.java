import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class Sound extends Node {

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
	public int position;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	protected Sound() {
	}
}

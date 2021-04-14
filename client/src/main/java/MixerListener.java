import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class MixerListener extends Node {

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public int remaining;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()V")
	public abstract void onUnlink();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!lo;)I")
	public abstract int execute(@OriginalArg(0) MixerPcmStream stream);
}

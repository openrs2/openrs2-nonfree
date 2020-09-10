import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class AbstractWorld {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public int flags;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	public int country;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	public int players;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Z")
	public final boolean isMembers() {
		return (this.flags & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Z")
	public final boolean isLootShare() {
		return (this.flags & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)Z")
	public final boolean isQuickChat() {
		return (this.flags & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Z")
	public final boolean isPvp() {
		return (this.flags & 0x4) != 0;
	}
}

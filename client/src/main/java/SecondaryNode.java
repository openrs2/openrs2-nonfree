import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class SecondaryNode extends Node {

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Lclient!lh;")
	public SecondaryNode secondaryPrev;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "J")
	public long secondaryKey;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "Lclient!lh;")
	public SecondaryNode secondaryNext;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public final void unlinkSecondary() {
		if (this.secondaryPrev != null) {
			this.secondaryPrev.secondaryNext = this.secondaryNext;
			this.secondaryNext.secondaryPrev = this.secondaryPrev;
			this.secondaryPrev = null;
			this.secondaryNext = null;
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z")
	public final boolean isSecondaryLinked() {
		return this.secondaryPrev != null;
	}
}

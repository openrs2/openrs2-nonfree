import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class IntNode extends Node {

	@OriginalMember(owner = "client!v", name = "r", descriptor = "I")
	public int value;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public IntNode() {
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
	public IntNode(@OriginalArg(0) int value) {
		this.value = value;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class StringNode extends Node {

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "Ljava/lang/String;")
	public final String value;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public StringNode(@OriginalArg(0) String value) {
		this.value = value;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class EnumInverseNode extends Node {

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "Ljava/lang/String;")
	public final String value;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public EnumInverseNode(@OriginalArg(0) String value, @OriginalArg(1) int key) {
		this.value = value;
	}
}

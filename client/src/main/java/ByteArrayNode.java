import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class ByteArrayNode extends Node {

	@OriginalMember(owner = "client!j", name = "w", descriptor = "[B")
	public final byte[] value;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B)V")
	public ByteArrayNode(@OriginalArg(0) byte[] value) {
		this.value = value;
	}
}

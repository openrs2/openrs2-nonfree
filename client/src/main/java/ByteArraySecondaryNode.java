import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class ByteArraySecondaryNode extends SecondaryNode {

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "[B")
	public final byte[] value;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([B)V")
	public ByteArraySecondaryNode(@OriginalArg(0) byte[] value) {
		this.value = value;
	}
}

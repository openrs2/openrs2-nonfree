import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class LongNode extends Node {

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "J")
	public long value;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(J)V")
	public LongNode(@OriginalArg(0) long value) {
		this.value = value;
	}
}

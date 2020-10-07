import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("unpackclass!o")
public final class LineNumberTableEntry {

	@OriginalMember(owner = "unpackclass!o", name = "a", descriptor = "I")
	public int startPc;

	@OriginalMember(owner = "unpackclass!o", name = "b", descriptor = "I")
	public int lineNumber;
}

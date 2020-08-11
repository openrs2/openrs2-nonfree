import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class Js5Request extends SecondaryNode {

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "Z")
	public boolean urgent;

	@OriginalMember(owner = "client!ng", name = "E", descriptor = "Z")
	public boolean aBoolean365;

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "Z")
	public volatile boolean incomplete = true;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)[B")
	public abstract byte[] getData();

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)I")
	public abstract int getPercentageComplete();
}

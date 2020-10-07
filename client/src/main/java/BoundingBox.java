import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class BoundingBox {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "S")
	public short aShort3;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "S")
	public short aShort4;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "S")
	public short aShort5;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "S")
	public short aShort7;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "S")
	public short aShort8;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Z")
	public boolean valid = false;
}

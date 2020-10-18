import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class BoundingBox {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "S")
	public short maxY;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "S")
	public short minZ;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "S")
	public short minX;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "S")
	public short maxX;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "S")
	public short maxZ;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "S")
	public short cylinderRadius;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "S")
	public short minY;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Z")
	public boolean valid = false;
}

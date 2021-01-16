import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class MapElement extends SecondaryNode {

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
	public int level;

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
	public int anInt1764;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
	public int anInt1766;

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "Z")
	public boolean hover = false;

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
	public int id = -1;

	@OriginalMember(owner = "client!fg", name = "H", descriptor = "Z")
	public boolean aBoolean106 = false;
}

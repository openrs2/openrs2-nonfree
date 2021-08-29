import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class WallDecor {

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
	public int zFine;

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
	public int zOffset;

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
	public int xFine;

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
	public int anInt5627;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
	public int anInt5629;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
	public int anInt5631;

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "Lclient!vc;")
	public Entity secondary;

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "Lclient!vc;")
	public Entity primary;

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
	public int xOffset;

	@OriginalMember(owner = "client!vl", name = "s", descriptor = "J")
	public long key = 0L;
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Wall {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public int anInt5488;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public int zFine;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Lclient!vc;")
	public Entity secondary;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	public int xFine;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public int anInt5493;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!vc;")
	public Entity primary;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public int anInt5494;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "J")
	public long key = 0L;
}

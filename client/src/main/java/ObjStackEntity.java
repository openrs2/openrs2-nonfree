import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class ObjStackEntity {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
	public int xFine;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "J")
	public long key;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!vc;")
	public Entity tertiary;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Lclient!vc;")
	public Entity primary;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
	public int anInt5499;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "Lclient!vc;")
	public Entity secondary;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
	public int anInt5501;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
	public int zFine;
}

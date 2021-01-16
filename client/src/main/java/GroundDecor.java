import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public final class GroundDecor {

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "J")
	public long key;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "Lclient!vc;")
	public Entity entity;

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
	public int zFine;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
	public int xFine;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
	public int anInt1130;

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "Z")
	public boolean aBoolean63 = false;
}

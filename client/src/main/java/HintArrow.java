import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class HintArrow {

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public int headIcon;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
	public int target;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
	public int radius;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
	public int xOffset;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
	public int yOffset;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
	public int zOffset;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
	public int model = -1;
}

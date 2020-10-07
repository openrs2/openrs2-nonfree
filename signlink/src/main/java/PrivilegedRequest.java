import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("signlink!vk")
public final class PrivilegedRequest {

	@OriginalMember(owner = "signlink!vk", name = "d", descriptor = "Lsignlink!vk;")
	public PrivilegedRequest next;

	@OriginalMember(owner = "signlink!vk", name = "c", descriptor = "Ljava/lang/Object;")
	public volatile Object result;

	@OriginalMember(owner = "signlink!vk", name = "f", descriptor = "I")
	public int type;

	@OriginalMember(owner = "signlink!vk", name = "b", descriptor = "I")
	public int intArg1;

	@OriginalMember(owner = "signlink!vk", name = "a", descriptor = "Ljava/lang/Object;")
	public Object objectArg;

	@OriginalMember(owner = "signlink!vk", name = "g", descriptor = "I")
	public int intArg2;

	@OriginalMember(owner = "signlink!vk", name = "e", descriptor = "I")
	public volatile int status = 0;
}

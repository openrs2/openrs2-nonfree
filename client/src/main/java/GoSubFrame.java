import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class GoSubFrame {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lclient!jl;")
	public ClientScript script;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "[Ljava/lang/String;")
	public String[] stringLocals;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[I")
	public int[] intLocals;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	public int pc = -1;
}

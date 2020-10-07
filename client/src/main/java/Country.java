import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Country {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
	public int flag;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Ljava/lang/String;")
	public String name;
}

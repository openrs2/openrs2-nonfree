import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public abstract class ReferenceNodeFactory {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Lclient!gh;")
	public static final ReferenceNodeFactory SOFT_REFERENCE_NODE_FACTORY = createSoftReferenceNodeFactory();

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)Lclient!gh;")
	private static ReferenceNodeFactory createSoftReferenceNodeFactory() {
		try {
			return (ReferenceNodeFactory) Class.forName("SoftReferenceNodeFactory").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable ex) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!cn;)Lclient!cn;")
	public abstract ReferenceNode create(@OriginalArg(1) ReferenceNode node);
}

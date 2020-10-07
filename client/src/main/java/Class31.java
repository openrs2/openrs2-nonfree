import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class31 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
	public int anInt620;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class31() {
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!ci;)V")
	public Class31(@OriginalArg(0) Class31 arg0) {
		this.anInt625 = arg0.anInt625;
		this.anInt620 = arg0.anInt620;
		this.anInt621 = arg0.anInt621;
		this.anInt619 = arg0.anInt619;
	}
}

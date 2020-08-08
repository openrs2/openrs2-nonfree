import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class Class62 {

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	protected Class62() {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
	public abstract int method4655(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
	public abstract void method4656(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)[B")
	public abstract byte[] method4657(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Lclient!fo;")
	public abstract Class61 method4659();
}

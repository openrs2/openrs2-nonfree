import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class Js5ResourceProvider {

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	protected Js5ResourceProvider() {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
	public abstract int getPercentageComplete(@OriginalArg(0) int group);

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
	public abstract void prefetchGroup(@OriginalArg(0) int group);

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)[B")
	public abstract byte[] fetchGroup(@OriginalArg(1) int group);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Lclient!fo;")
	public abstract Js5Index fetchIndex();
}

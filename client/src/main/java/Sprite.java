import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public abstract class Sprite extends SecondaryNode {

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
	public int anInt5602;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
	protected int anInt5604;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
	protected int anInt5606;

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
	public int width;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
	public int anInt5612;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	protected Sprite() {
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	public abstract void method4504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
	public abstract void method4506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V")
	public abstract void method4507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIIII)V")
	protected abstract void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIII)V")
	public final void method4509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anInt5602 << 3;
		arg2 = (local4 & 0xF) + (arg2 << 4);
		@Pc(21) int local21 = this.anInt5612 << 3;
		arg0 = (local21 & 0xF) + (arg0 << 4);
		this.method4508(local4, local21, arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
	public abstract void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)V")
	public abstract void method4511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V")
	public abstract void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}

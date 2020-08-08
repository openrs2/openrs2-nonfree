import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class Class56 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	public int anInt3404;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	public int anInt3405;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
	public int anInt3408;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
	public int anInt3410;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public int anInt3412;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
	public int anInt3413;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	protected Class56() {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	public abstract void method2815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	public abstract void method2816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}

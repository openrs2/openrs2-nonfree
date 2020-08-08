import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class Class4_Sub33 extends Node {

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public int anInt6071;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()V")
	public abstract void method4810();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!lo;)I")
	public abstract int method4811(@OriginalArg(0) Class4_Sub6_Sub3 arg0);
}

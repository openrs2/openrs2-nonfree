import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class75 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)[B")
	public abstract byte[] method2324();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[B)V")
	public abstract void method2325(@OriginalArg(1) byte[] arg0);
}

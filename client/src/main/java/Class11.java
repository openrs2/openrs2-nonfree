import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class Class11 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public final int anInt2463;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	protected final int anInt2461;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	public final int anInt2466;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(III)V")
	protected Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2463 = arg0;
		this.anInt2461 = arg2;
		this.anInt2466 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)V")
	public abstract void method1934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	public abstract void method1935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZ)V")
	public abstract void method1938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}

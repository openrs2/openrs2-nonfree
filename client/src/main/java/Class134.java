import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class134 {

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	public final int anInt4123;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "[Lclient!ec;")
	private final GlShader[] aClass43Array1;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
	private final int contextId;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I[Lclient!ec;)V")
	public Class134(@OriginalArg(0) int arg0, @OriginalArg(1) GlShader[] arg1) {
		this.anInt4123 = arg0;
		this.aClass43Array1 = arg1;
		this.contextId = GlCleaner.contextId;
	}

	@OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		GlCleaner.deleteProgram(this.anInt4123, this.aClass43Array1, this.contextId);
		super.finalize();
	}
}

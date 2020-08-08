import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class4_Sub3_Sub4_Sub1 extends Class4_Sub3_Sub4 {

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub3_Sub4_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject1 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method2320() {
		return false;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public final Object method2319() {
		return this.anObject1;
	}
}

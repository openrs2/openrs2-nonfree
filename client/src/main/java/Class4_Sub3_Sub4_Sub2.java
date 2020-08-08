import java.lang.ref.SoftReference;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class4_Sub3_Sub4_Sub2 extends Class4_Sub3_Sub4 {

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub3_Sub4_Sub2(@OriginalArg(0) Object arg0) {
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method2320() {
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public final Object method2319() {
		return this.aSoftReference1.get();
	}
}

import java.lang.ref.SoftReference;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class SoftReferenceNode extends ReferenceNode {

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference<Object> reference;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public SoftReferenceNode(@OriginalArg(0) Object referent) {
		this.reference = new SoftReference<>(referent);
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean isSoft() {
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public final Object get() {
		return this.reference.get();
	}
}

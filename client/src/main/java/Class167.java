import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class167 {

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!dc;")
	public final Class37 aClass37_1;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public final int anInt5232;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass37_1 = Static33.method4201(arg0);
		this.anInt5232 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!dc;I)V")
	public Class167(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		this.anInt5232 = arg1;
		this.aClass37_1 = arg0;
	}
}

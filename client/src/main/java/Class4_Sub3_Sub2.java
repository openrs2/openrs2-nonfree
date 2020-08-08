import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class4_Sub3_Sub2 extends Class4_Sub3 {

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "Lclient!oc;")
	public final Class53_Sub6 aClass53_Sub6_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!oc;)V")
	public Class4_Sub3_Sub2(@OriginalArg(0) Class53_Sub6 arg0) {
		this.aClass53_Sub6_1 = arg0;
	}
}

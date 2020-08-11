import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class4_Sub3_Sub6 extends SecondaryNode {

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "Lclient!o;")
	public final Class53_Sub5 aClass53_Sub5_1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!o;)V")
	public Class4_Sub3_Sub6(@OriginalArg(0) Class53_Sub5 arg0) {
		this.aClass53_Sub5_1 = arg0;
	}
}

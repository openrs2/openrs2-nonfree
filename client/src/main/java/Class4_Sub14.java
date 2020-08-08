import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class4_Sub14 extends Class4 {

	@OriginalMember(owner = "client!j", name = "w", descriptor = "[B")
	public final byte[] aByteArray18;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B)V")
	public Class4_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray18 = arg0;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class4_Sub28 extends Node {

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	public final int anInt4717;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "[Lclient!ec;")
	public final Class43[] aClass43Array2;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I[Lclient!ec;)V")
	public Class4_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class43[] arg1) {
		this.anInt4717 = arg0;
		this.aClass43Array2 = arg1;
	}
}

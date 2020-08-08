import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class4_Sub20 extends Node {

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
	public final int anInt3908;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
	public final int anInt3905;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(II)V")
	public Class4_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3908 = arg0;
		this.anInt3905 = arg1;
	}
}

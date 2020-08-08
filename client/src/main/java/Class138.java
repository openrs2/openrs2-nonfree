import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class138 {

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	public int anInt4219;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "[I")
	public final int[] anIntArray448;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "[Lclient!fg;")
	public final Class4_Sub3_Sub7[] aClass4_Sub3_Sub7Array1;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I)V")
	public Class138(@OriginalArg(0) int arg0) {
		this.anInt4219 = arg0;
		this.anIntArray448 = new int[this.anInt4219];
		this.aClass4_Sub3_Sub7Array1 = new Class4_Sub3_Sub7[this.anInt4219];
	}
}

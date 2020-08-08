import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class4_Sub17 extends Class4 {

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
	public int anInt3457 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	public int anInt3461 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
	public int anInt3459 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	public int anInt3466 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	public int anInt3465 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
	public int anInt3456 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
	public int anInt3462 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
	public int anInt3464 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "Lclient!fg;")
	public final Class4_Sub3_Sub7 aClass4_Sub3_Sub7_1;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!fg;)V")
	public Class4_Sub17(@OriginalArg(0) Class4_Sub3_Sub7 arg0) {
		this.aClass4_Sub3_Sub7_1 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Z")
	public final boolean method2923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3457 <= arg0 && arg0 <= this.anInt3462 && arg1 >= this.anInt3459 && this.anInt3461 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt3456 && arg0 <= this.anInt3466 && this.anInt3464 <= arg1 && arg1 <= this.anInt3465;
		}
	}
}

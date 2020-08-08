import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class Class4_Sub6 extends Node {

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
	public int anInt4094;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!eb;")
	public Class4_Sub8 aClass4_Sub8_5;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "Lclient!tf;")
	public Class4_Sub6 aClass4_Sub6_8;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Z")
	public volatile boolean aBoolean289 = true;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public abstract void method3345(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()I")
	public abstract int method3346();

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "()I")
	public int method3347() {
		return 255;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([III)V")
	public abstract void method3348(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "()Lclient!tf;")
	public abstract Class4_Sub6 method3349();

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "()Lclient!tf;")
	public abstract Class4_Sub6 method3350();

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "([III)V")
	protected final void method3351(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean289) {
			this.method3348(arg0, arg1, arg2);
		} else {
			this.method3345(arg2);
		}
	}
}

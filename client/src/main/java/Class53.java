import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class Class53 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	public abstract void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
	public abstract void method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!vc;IIIZ)V")
	public void method3807(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()Z")
	public boolean method3808() {
		return false;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Lclient!vc;")
	public Class53 method3809() {
		return this;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "()I")
	public abstract int method3813();
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class4_Sub3_Sub19 extends Class4_Sub3 {

	@OriginalMember(owner = "client!te", name = "B", descriptor = "[Lclient!a;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!fh;Lclient!fh;IZ)V")
	public Class4_Sub3_Sub19(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class112 local7 = new Class112();
		@Pc(12) int local12 = arg0.method1371(arg2);
		this.aClass1Array1 = new Class1[local12];
		@Pc(21) int[] local21 = arg0.method1363(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(35) byte[] local35 = arg0.method1372(arg2, local21[local23]);
			@Pc(37) Class4_Sub2 local37 = null;
			@Pc(51) int local51 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(56) Class4_Sub2 local56 = (Class4_Sub2) local7.method2610(); local56 != null; local56 = (Class4_Sub2) local7.method2616()) {
				if (local51 == local56.anInt112) {
					local37 = local56;
					break;
				}
			}
			if (local37 == null) {
				@Pc(95) byte[] local95 = arg1.method1350(0, local51);
				local37 = new Class4_Sub2(local51, local95);
				local7.method2612(local37);
			}
			this.aClass1Array1[local21[local23]] = new Class1(local35, local37);
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)Z")
	public final boolean method4150(@OriginalArg(1) int arg0) {
		return this.aClass1Array1[arg0].aBoolean1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
	public final boolean method4151(@OriginalArg(1) int arg0) {
		return this.aClass1Array1[arg0].aBoolean2;
	}
}

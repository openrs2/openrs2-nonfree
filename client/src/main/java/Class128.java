import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class128 implements Interface1 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(J[IBI)Ljava/lang/String;")
	@Override
	public final String method3224(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(18) EnumType local18 = EnumTypeList.get(arg1[0]);
			return local18.getString((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(38) ObjType local38 = ObjTypeList.get((int) arg0);
			return local38.name;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return EnumTypeList.get(arg1[0]).getString((int) arg0);
		} else {
			return null;
		}
	}
}

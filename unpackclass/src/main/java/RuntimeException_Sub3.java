import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!q")
public final class RuntimeException_Sub3 extends RuntimeException {

	@OriginalMember(owner = "unpackclass!q", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lunpackclass!q;")
	public static RuntimeException_Sub3 method4937(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub3 local5;
		if (arg0 instanceof RuntimeException_Sub3) {
			local5 = (RuntimeException_Sub3) arg0;
		} else {
			local5 = new RuntimeException_Sub3(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "unpackclass!q", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub3(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
	}
}

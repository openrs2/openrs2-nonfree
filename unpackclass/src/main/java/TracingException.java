import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!q")
public final class TracingException extends RuntimeException {

	@OriginalMember(owner = "unpackclass!q", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lunpackclass!q;")
	public static TracingException wrap(@OriginalArg(0) Throwable cause, @OriginalArg(1) String message) {
		@Pc(5) TracingException ex;
		if (cause instanceof TracingException) {
			ex = (TracingException) cause;
		} else {
			ex = new TracingException(cause, message);
		}
		return ex;
	}

	@OriginalMember(owner = "unpackclass!q", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private TracingException(@OriginalArg(0) Throwable cause, @OriginalArg(1) String message) {
	}
}

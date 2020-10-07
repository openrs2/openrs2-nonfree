import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public abstract class Timer {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)Lclient!jf;")
	public static Timer create() {
		try {
			return new MiscTimer();
		} catch (@Pc(8) Throwable ex) {
			try {
				return (Timer) Class.forName("NanoTimer").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable ex2) {
				return new MillisTimer();
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)I")
	public abstract int sleep(@OriginalArg(0) int minimumDelay, @OriginalArg(2) int timePerFrame);

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	public abstract void reset();

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)J")
	public abstract long time();
}

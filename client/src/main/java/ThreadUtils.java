import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ThreadUtils {
	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BJ)V")
	public static void sleep(@OriginalArg(1) long millis) {
		if (millis <= 0L) {
			return;
		}
		if (millis % 10L == 0L) {
			sleepUninterruptibly(millis - 1L);
			sleepUninterruptibly(1L);
		} else {
			sleepUninterruptibly(millis);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BJ)V")
	private static void sleepUninterruptibly(@OriginalArg(1) long millis) {
		try {
			Thread.sleep(millis);
		} catch (@Pc(7) InterruptedException ex) {
		}
	}
}

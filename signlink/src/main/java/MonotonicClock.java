import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!ha")
public final class MonotonicClock {

	@OriginalMember(owner = "signlink!ha", name = "b", descriptor = "J")
	private static long previous;

	@OriginalMember(owner = "signlink!ha", name = "a", descriptor = "J")
	private static long leapMillis;

	@OriginalMember(owner = "signlink!ha", name = "a", descriptor = "(I)J")
	public static synchronized long currentTimeMillis() {
		@Pc(6) long now = System.currentTimeMillis();
		if (previous > now) {
			leapMillis += previous - now;
		}
		previous = now;
		return now + leapMillis;
	}
}

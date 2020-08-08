import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!ha")
public final class Class194 {

	@OriginalMember(owner = "signlink!ha", name = "b", descriptor = "J")
	private static long aLong214;

	@OriginalMember(owner = "signlink!ha", name = "a", descriptor = "J")
	private static long aLong215;

	@OriginalMember(owner = "signlink!ha", name = "a", descriptor = "(I)J")
	public static synchronized long method4849() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong214) {
			aLong215 += aLong214 - local6;
		}
		aLong214 = local6;
		return local6 + aLong215;
	}
}

package jagex3.jagmisc;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagex3/jagmisc/jagmisc")
public final class jagmisc {

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "nanoTime", descriptor = "()J")
	public static native long nanoTime();

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "Quit0", descriptor = "()V")
	private static native void Quit0();

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "quit", descriptor = "()V")
	public static void quit() {
		Quit0();
	}

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "init", descriptor = "()Z")
	public static native boolean init();
}

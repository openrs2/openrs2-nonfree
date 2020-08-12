import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class139 implements Interface2 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
	@Override
	public final void method3484() {
		if (Preferences.highDetailLighting) {
			Static17.method1610(false);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
	@Override
	public final void method3483() {
		if (Preferences.highDetailLighting) {
			Static17.method1610(true);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	@Override
	public final void method3486(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "()I")
	@Override
	public final int method3485() {
		return 0;
	}
}

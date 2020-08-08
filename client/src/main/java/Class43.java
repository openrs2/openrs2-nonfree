import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class43 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public final int anInt1199;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private final int anInt1201;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1199 = arg0;
		this.anInt1201 = Static4.anInt3332;
	}

	@OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		Static25.method2723(this.anInt1199, this.anInt1201);
		super.finalize();
	}
}

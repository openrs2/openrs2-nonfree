import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class99 implements Runnable {

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Z")
	public boolean aBoolean185 = true;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
	public final int[] anIntArray236 = new int[500];

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
	public final int[] anIntArray235 = new int[500];

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	public int anInt2670 = 0;

	@OriginalMember(owner = "client!jm", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (this.aBoolean185) {
			synchronized (this.anObject4) {
				if (this.anInt2670 < 500) {
					this.anIntArray236[this.anInt2670] = Static7.anInt5357;
					this.anIntArray235[this.anInt2670] = Static7.anInt6038;
					this.anInt2670++;
				}
			}
			ThreadUtils.sleep(50L);
		}
	}
}

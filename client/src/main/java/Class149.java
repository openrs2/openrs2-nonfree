import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class149 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public final int anInt4455;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	public int anInt4454;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
	public final int[] anIntArray476;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
	public final int[] anIntArray477;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class149() {
		Static30.method3637(16);
		this.anInt4455 = Static30.method3632() == 0 ? 1 : Static30.method3637(4) + 1;
		if (Static30.method3632() != 0) {
			Static30.method3637(8);
		}
		Static30.method3637(2);
		if (this.anInt4455 > 1) {
			this.anInt4454 = Static30.method3637(4);
		}
		this.anIntArray476 = new int[this.anInt4455];
		this.anIntArray477 = new int[this.anInt4455];
		for (@Pc(42) int local42 = 0; local42 < this.anInt4455; local42++) {
			Static30.method3637(8);
			this.anIntArray476[local42] = Static30.method3637(8);
			this.anIntArray477[local42] = Static30.method3637(8);
		}
	}
}

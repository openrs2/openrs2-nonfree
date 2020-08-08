import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class Class63 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public int anInt2020;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	public int anInt2021;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	public int anInt2023;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Z")
	public final boolean method1540() {
		return (this.anInt2020 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Z")
	public final boolean method1542() {
		return (this.anInt2020 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)Z")
	public final boolean method1543() {
		return (this.anInt2020 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Z")
	public final boolean method1544() {
		return (this.anInt2020 & 0x4) != 0;
	}
}

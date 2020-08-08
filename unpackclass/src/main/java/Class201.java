import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("unpackclass!w")
public class Class201 {

	@OriginalMember(owner = "unpackclass!w", name = "a", descriptor = "Lunpackclass!w;")
	public Class201 aClass201_7;

	@OriginalMember(owner = "unpackclass!w", name = "b", descriptor = "Lunpackclass!w;")
	public Class201 aClass201_8;

	@OriginalMember(owner = "unpackclass!w", name = "a", descriptor = "()V")
	public final void method4938() {
		if (this.aClass201_8 != null) {
			this.aClass201_8.aClass201_7 = this.aClass201_7;
			this.aClass201_7.aClass201_8 = this.aClass201_8;
			this.aClass201_7 = null;
			this.aClass201_8 = null;
		}
	}

	@OriginalMember(owner = "unpackclass!w", name = "b", descriptor = "()Z")
	public final boolean method4939() {
		return this.aClass201_8 != null;
	}
}

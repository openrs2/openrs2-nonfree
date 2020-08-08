import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!f")
public final class Class202 {

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "Lunpackclass!w;")
	private Class201 aClass201_6;

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "Lunpackclass!w;")
	private final Class201 aClass201_5 = new Class201();

	@OriginalMember(owner = "unpackclass!f", name = "<init>", descriptor = "()V")
	public Class202() {
		this.aClass201_5.aClass201_7 = this.aClass201_5;
		this.aClass201_5.aClass201_8 = this.aClass201_5;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "(Lunpackclass!w;)V")
	public final void method4922(@OriginalArg(0) Class201 arg0) {
		if (arg0.aClass201_8 != null) {
			arg0.method4938();
		}
		arg0.aClass201_8 = this.aClass201_5.aClass201_8;
		arg0.aClass201_7 = this.aClass201_5;
		arg0.aClass201_8.aClass201_7 = arg0;
		arg0.aClass201_7.aClass201_8 = arg0;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "()Lunpackclass!w;")
	public final Class201 method4923() {
		@Pc(3) Class201 local3 = this.aClass201_5.aClass201_7;
		if (local3 == this.aClass201_5) {
			this.aClass201_6 = null;
			return null;
		} else {
			this.aClass201_6 = local3.aClass201_7;
			return local3;
		}
	}

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "()Lunpackclass!w;")
	public final Class201 method4924() {
		@Pc(2) Class201 local2 = this.aClass201_6;
		if (local2 == this.aClass201_5) {
			this.aClass201_6 = null;
			return null;
		} else {
			this.aClass201_6 = local2.aClass201_7;
			return local2;
		}
	}
}

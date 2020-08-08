import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!f")
public final class Class202 {

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "Lunpackclass!w;")
	private Node aClass201_6;

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "Lunpackclass!w;")
	private final Node aClass201_5 = new Node();

	@OriginalMember(owner = "unpackclass!f", name = "<init>", descriptor = "()V")
	public Class202() {
		this.aClass201_5.next = this.aClass201_5;
		this.aClass201_5.prev = this.aClass201_5;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "(Lunpackclass!w;)V")
	public final void method4922(@OriginalArg(0) Node arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.aClass201_5.prev;
		arg0.next = this.aClass201_5;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "()Lunpackclass!w;")
	public final Node method4923() {
		@Pc(3) Node local3 = this.aClass201_5.next;
		if (local3 == this.aClass201_5) {
			this.aClass201_6 = null;
			return null;
		} else {
			this.aClass201_6 = local3.next;
			return local3;
		}
	}

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "()Lunpackclass!w;")
	public final Node method4924() {
		@Pc(2) Node local2 = this.aClass201_6;
		if (local2 == this.aClass201_5) {
			this.aClass201_6 = null;
			return null;
		} else {
			this.aClass201_6 = local2.next;
			return local2;
		}
	}
}

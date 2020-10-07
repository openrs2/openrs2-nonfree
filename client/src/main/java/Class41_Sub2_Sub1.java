import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class41_Sub2_Sub1 extends Class41_Sub2 {

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class41_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)[B")
	public final byte[] method3156() {
		this.aByteArray49 = new byte[524288];
		this.method3142();
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V")
	@Override
	protected final void method3151(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		arg1 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		this.aByteArray49[local3++] = arg1;
		this.aByteArray49[local3] = arg1;
	}
}

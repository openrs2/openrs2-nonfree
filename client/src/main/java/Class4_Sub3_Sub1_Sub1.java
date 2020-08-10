import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class4_Sub3_Sub1_Sub1 extends Class4_Sub3_Sub1 {

	@OriginalMember(owner = "client!al", name = "N", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!al", name = "T", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!al", name = "Y", descriptor = "Lclient!fm;")
	public Cache aClass60_1;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(I)I")
	@Override
	public final int method4354() {
		return this.aBoolean364 ? 0 : 100;
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(B)[B")
	@Override
	public final byte[] method4352() {
		if (this.aBoolean364) {
			throw new RuntimeException();
		}
		return this.aByteArray3;
	}
}

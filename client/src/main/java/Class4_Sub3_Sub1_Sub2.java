import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class4_Sub3_Sub1_Sub2 extends Class4_Sub3_Sub1 {

	@OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
	public int anInt5384;

	@OriginalMember(owner = "client!ul", name = "O", descriptor = "B")
	public byte aByte22;

	@OriginalMember(owner = "client!ul", name = "R", descriptor = "Lclient!fd;")
	public Buffer aClass4_Sub10_10;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)I")
	@Override
	public final int method4354() {
		return this.aClass4_Sub10_10 == null ? 0 : this.aClass4_Sub10_10.position * 100 / (this.aClass4_Sub10_10.bytes.length - this.aByte22);
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(B)[B")
	@Override
	public final byte[] method4352() {
		if (this.aBoolean364 || this.aClass4_Sub10_10.bytes.length - this.aByte22 > this.aClass4_Sub10_10.position) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub10_10.bytes;
	}
}

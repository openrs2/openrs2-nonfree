import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class4_Sub10_Sub1 extends Buffer {

	@OriginalMember(owner = "client!wa", name = "Ob", descriptor = "Lclient!m;")
	private IsaacRandom aClass113_1;

	@OriginalMember(owner = "client!wa", name = "Yb", descriptor = "I")
	private int anInt5772;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Class4_Sub10_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([II)V")
	public final void method4639(@OriginalArg(0) int[] arg0) {
		this.aClass113_1 = new IsaacRandom(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "(I)V")
	public final void method4642() {
		this.anInt5772 = this.position * 8;
	}

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "(I)V")
	public final void method4644() {
		this.position = (this.anInt5772 + 7) / 8;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(Z)I")
	public final int method4646() {
		return this.bytes[this.position++] - this.aClass113_1.nextInt() & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[BII)V")
	public final void method4647(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.bytes[this.position++] - this.aClass113_1.nextInt());
		}
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(II)V")
	public final void method4650(@OriginalArg(1) int arg0) {
		this.bytes[this.position++] = (byte) (this.aClass113_1.nextInt() + arg0);
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(II)I")
	public final int method4651(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt5772;
	}

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "(II)I")
	public final int method4652(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 8 - (this.anInt5772 & 0x7);
		@Pc(18) int local18 = this.anInt5772 >> 3;
		this.anInt5772 += arg0;
		@Pc(26) int local26 = 0;
		while (arg0 > local13) {
			local26 += (this.bytes[local18++] & Static7.anIntArray647[local13]) << arg0 - local13;
			arg0 -= local13;
			local13 = 8;
		}
		@Pc(77) int local77;
		if (local13 == arg0) {
			local77 = local26 + (Static7.anIntArray647[local13] & this.bytes[local18]);
		} else {
			local77 = local26 + (this.bytes[local18] >> local13 - arg0 & Static7.anIntArray647[arg0]);
		}
		return local77;
	}
}

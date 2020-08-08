import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class4_Sub3_Sub9 extends Class4_Sub3 {

	@OriginalMember(owner = "client!g", name = "A", descriptor = "I")
	public int anInt1993;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "I")
	public int anInt1994;

	@OriginalMember(owner = "client!g", name = "O", descriptor = "I")
	public int anInt2001;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "Ljava/lang/String;")
	public String aString109;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(II)V")
	public Class4_Sub3_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.key = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)I")
	public final int method1515() {
		return (int) (this.key >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)I")
	public final int method1516() {
		return (int) this.key;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V")
	public final void method1519() {
		this.aLong213 = Class194.method4849() + 500L | this.aLong213 & Long.MIN_VALUE;
		Static1.aClass175_4.method4333(this);
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(B)V")
	public final void method1520() {
		this.aLong213 |= Long.MIN_VALUE;
		if (this.method1522() == 0L) {
			Static3.aClass175_11.method4333(this);
		}
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(I)J")
	public final long method1522() {
		return this.aLong213 & Long.MAX_VALUE;
	}
}

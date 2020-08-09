import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class77_Sub3 extends Class77 {

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "[J")
	private final long[] aLongArray34 = new long[10];

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	private int anInt3952 = 1;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "J")
	private long aLong141 = 0L;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	private int anInt3951 = 0;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "J")
	private long aLong142 = 0L;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "J")
	private long aLong140 = 0L;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)J")
	@Override
	public final long method3289() {
		return this.aLong142;
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)J")
	private long method3290() {
		@Pc(6) long local6 = MonotonicClock.currentTimeMillis() * 1000000L;
		@Pc(12) long local12 = local6 - this.aLong141;
		@Pc(15) long local15 = (long) 0;
		this.aLong141 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray34[this.anInt3951] = local12;
			if (this.anInt3952 < 10) {
				this.anInt3952++;
			}
			this.anInt3951 = (this.anInt3951 + 1) % 10;
		}
		for (@Pc(55) int local55 = 1; local55 <= this.anInt3952; local55++) {
			local15 += this.aLongArray34[(this.anInt3951 + 10 - local55) % 10];
		}
		return local15 / (long) this.anInt3952;
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
	@Override
	public final void method3288() {
		if (this.aLong140 > this.aLong142) {
			this.aLong142 += this.aLong140 - this.aLong142;
		}
		this.aLong141 = 0L;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)I")
	@Override
	public final int method3283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static37.method4640((long) arg0);
		this.aLong142 += this.method3290();
		@Pc(22) long local22 = (long) arg1 * 1000000L;
		if (this.aLong140 > this.aLong142) {
			Static37.method4640((this.aLong140 - this.aLong142) / 1000000L);
			this.aLong141 += this.aLong140 - this.aLong142;
			this.aLong142 += this.aLong140 - this.aLong142;
			this.aLong140 += local22;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			local70++;
			this.aLong140 += local22;
		} while (local70 < 10 && this.aLong140 < this.aLong142);
		if (this.aLong140 < this.aLong142) {
			this.aLong140 = this.aLong142;
		}
		return local70;
	}
}

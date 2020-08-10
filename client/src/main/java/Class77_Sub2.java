import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;
import jagex3.jagmisc.jagmisc;

@OriginalClass("client!nn")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "J")
	private long aLong131 = 0L;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "J")
	private long aLong130 = 0L;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
	private int anInt3605 = 1;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
	private int anInt3604 = 0;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "J")
	private long aLong132 = 0L;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "[J")
	private final long[] aLongArray28 = new long[10];

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class77_Sub2() {
		this.aLong131 = this.aLong130 = jagmisc.nanoTime();
		if (this.aLong130 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)J")
	@Override
	public final long method3289() {
		return this.aLong130;
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)J")
	private long method3021() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong132;
		this.aLong132 = local1;
		@Pc(12) long local12 = 0L;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray28[this.anInt3604] = local7;
			if (this.anInt3605 < 1) {
				this.anInt3605++;
			}
			this.anInt3604 = (this.anInt3604 + 1) % 10;
		}
		for (@Pc(52) int local52 = 1; local52 <= this.anInt3605; local52++) {
			local12 += this.aLongArray28[(this.anInt3604 + 10 - local52) % 10];
		}
		return local12 / (long) this.anInt3605;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I")
	@Override
	public final int method3283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		ThreadUtils.sleep((long) arg0);
		@Pc(13) long local13 = (long) arg1 * 1000000L;
		this.aLong130 += this.method3021();
		if (this.aLong130 < this.aLong131) {
			ThreadUtils.sleep((this.aLong131 - this.aLong130) / 1000000L);
			this.aLong132 += this.aLong131 - this.aLong130;
			this.aLong130 += this.aLong131 - this.aLong130;
			this.aLong131 += local13;
			return 1;
		}
		@Pc(72) int local72 = 0;
		do {
			this.aLong131 += local13;
			local72++;
		} while (local72 < 10 && this.aLong131 < this.aLong130);
		if (this.aLong131 < this.aLong130) {
			this.aLong131 = this.aLong130;
		}
		return local72;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
	@Override
	public final void method3288() {
		this.aLong132 = 0L;
		if (this.aLong131 > this.aLong130) {
			this.aLong130 += this.aLong131 - this.aLong130;
		}
	}
}

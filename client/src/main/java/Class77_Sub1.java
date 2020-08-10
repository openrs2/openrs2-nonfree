import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "J")
	private long aLong70 = 0L;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "J")
	private long aLong71 = 0L;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
	private int anInt2178 = 0;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	private int anInt2179 = 1;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "[J")
	private final long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "J")
	private long aLong72 = 0L;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class77_Sub1() {
		this.aLong70 = System.nanoTime();
		this.aLong71 = System.nanoTime();
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	@Override
	public final void method3288() {
		this.aLong72 = 0L;
		if (this.aLong71 > this.aLong70) {
			this.aLong70 += this.aLong71 - this.aLong70;
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)J")
	@Override
	public final long method3289() {
		return this.aLong70;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)J")
	private long method1731() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong72;
		this.aLong72 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray14[this.anInt2178] = local7;
			this.anInt2178 = (this.anInt2178 + 1) % 10;
			if (this.anInt2179 < 1) {
				this.anInt2179++;
			}
		}
		@Pc(45) long local45 = 0L;
		for (@Pc(47) int local47 = 1; local47 <= this.anInt2179; local47++) {
			local45 += this.aLongArray14[(this.anInt2178 + 10 - local47) % 10];
		}
		return local45 / (long) this.anInt2179;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)I")
	@Override
	public final int method3283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		ThreadUtils.sleep((long) arg0);
		@Pc(15) long local15 = (long) arg1 * 1000000L;
		this.aLong70 += this.method1731();
		if (this.aLong71 > this.aLong70) {
			ThreadUtils.sleep((this.aLong71 - this.aLong70) / 1000000L);
			this.aLong72 += this.aLong71 - this.aLong70;
			this.aLong70 += this.aLong71 - this.aLong70;
			this.aLong71 += local15;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			local31++;
			this.aLong71 += local15;
		} while (local31 < 10 && this.aLong71 < this.aLong70);
		if (this.aLong70 > this.aLong71) {
			this.aLong71 = this.aLong70;
		}
		return local31;
	}
}

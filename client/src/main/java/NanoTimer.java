import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class NanoTimer extends Timer {

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "J")
	private long time = 0L;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "J")
	private long nextFrame = 0L;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
	private int durationPointer = 0;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	private int windowSize = 1;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "[J")
	private final long[] durations = new long[10];

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "J")
	private long previousFrame = 0L;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public NanoTimer() {
		this.time = System.nanoTime();
		this.nextFrame = System.nanoTime();
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	@Override
	public final void reset() {
		this.previousFrame = 0L;
		if (this.nextFrame > this.time) {
			this.time += this.nextFrame - this.time;
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)J")
	@Override
	public final long time() {
		return this.time;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)J")
	private long getDuration() {
		@Pc(1) long current = System.nanoTime();
		@Pc(7) long duration = current - this.previousFrame;
		this.previousFrame = current;
		if (duration > -5000000000L && duration < 5000000000L) {
			this.durations[this.durationPointer] = duration;
			this.durationPointer = (this.durationPointer + 1) % 10;
			if (this.windowSize < 1) {
				this.windowSize++;
			}
		}
		@Pc(45) long sum = 0L;
		for (@Pc(47) int i = 1; i <= this.windowSize; i++) {
			sum += this.durations[(this.durationPointer + 10 - i) % 10];
		}
		return sum / (long) this.windowSize;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)I")
	@Override
	public final int sleep(@OriginalArg(0) int minimumDelay, @OriginalArg(2) int timePerFrame) {
		ThreadUtils.sleep(minimumDelay);
		@Pc(15) long timePerFrameNanos = (long) timePerFrame * 1000000L;
		this.time += this.getDuration();
		if (this.nextFrame > this.time) {
			ThreadUtils.sleep((this.nextFrame - this.time) / 1000000L);
			this.previousFrame += this.nextFrame - this.time;
			this.time += this.nextFrame - this.time;
			this.nextFrame += timePerFrameNanos;
			return 1;
		}
		@Pc(31) int logicCycles = 0;
		do {
			logicCycles++;
			this.nextFrame += timePerFrameNanos;
		} while (logicCycles < 10 && this.nextFrame < this.time);
		if (this.time > this.nextFrame) {
			this.nextFrame = this.time;
		}
		return logicCycles;
	}
}

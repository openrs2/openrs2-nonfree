import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class MillisTimer extends Timer {

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "[J")
	private final long[] durations = new long[10];

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	private int windowSize = 1;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "J")
	private long previousFrame = 0L;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	private int durationPointer = 0;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "J")
	private long time = 0L;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "J")
	private long nextFrame = 0L;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)J")
	@Override
	public final long time() {
		return this.time;
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)J")
	private long getDuration() {
		@Pc(6) long now = MonotonicClock.currentTimeMillis() * 1000000L;
		@Pc(12) long duration = now - this.previousFrame;
		@Pc(15) long sum = 0;
		this.previousFrame = now;
		if (duration > -5000000000L && duration < 5000000000L) {
			this.durations[this.durationPointer] = duration;
			if (this.windowSize < 10) {
				this.windowSize++;
			}
			this.durationPointer = (this.durationPointer + 1) % 10;
		}
		for (@Pc(55) int i = 1; i <= this.windowSize; i++) {
			sum += this.durations[(this.durationPointer + 10 - i) % 10];
		}
		return sum / (long) this.windowSize;
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
	@Override
	public final void reset() {
		if (this.nextFrame > this.time) {
			this.time += this.nextFrame - this.time;
		}
		this.previousFrame = 0L;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)I")
	@Override
	public final int sleep(@OriginalArg(0) int minimumDelay, @OriginalArg(2) int timePerFrame) {
		ThreadUtils.sleep(minimumDelay);
		this.time += this.getDuration();
		@Pc(22) long timePerFrameNanos = (long) timePerFrame * 1000000L;
		if (this.nextFrame > this.time) {
			ThreadUtils.sleep((this.nextFrame - this.time) / 1000000L);
			this.previousFrame += this.nextFrame - this.time;
			this.time += this.nextFrame - this.time;
			this.nextFrame += timePerFrameNanos;
			return 1;
		}
		@Pc(70) int logicCycles = 0;
		do {
			logicCycles++;
			this.nextFrame += timePerFrameNanos;
		} while (logicCycles < 10 && this.nextFrame < this.time);
		if (this.nextFrame < this.time) {
			this.nextFrame = this.time;
		}
		return logicCycles;
	}
}

import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class MiscTimer extends Timer {

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "J")
	private long nextFrame = 0L;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "J")
	private long time = 0L;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
	private int windowSize = 1;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
	private int durationPointer = 0;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "J")
	private long previousFrame = 0L;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "[J")
	private final long[] durations = new long[10];

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public MiscTimer() {
		this.nextFrame = this.time = jagmisc.nanoTime();
		if (this.time == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)J")
	@Override
	public long time() {
		return this.time;
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)J")
	private long getDuration() {
		@Pc(1) long now = jagmisc.nanoTime();
		@Pc(7) long duration = now - this.previousFrame;
		this.previousFrame = now;
		@Pc(12) long sum = 0L;
		if (duration > -5000000000L && duration < 5000000000L) {
			this.durations[this.durationPointer] = duration;
			if (this.windowSize < 1) {
				this.windowSize++;
			}
			this.durationPointer = (this.durationPointer + 1) % 10;
		}
		for (@Pc(52) int i = 1; i <= this.windowSize; i++) {
			sum += this.durations[(this.durationPointer + 10 - i) % 10];
		}
		return sum / (long) this.windowSize;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I")
	@Override
	public int sleep(@OriginalArg(0) int minimumDelay, @OriginalArg(2) int timePerFrame) {
		ThreadUtils.sleep(minimumDelay);
		@Pc(13) long timePerFrameNanos = (long) timePerFrame * 1000000L;
		this.time += this.getDuration();
		if (this.time < this.nextFrame) {
			ThreadUtils.sleep((this.nextFrame - this.time) / 1000000L);
			this.previousFrame += this.nextFrame - this.time;
			this.time += this.nextFrame - this.time;
			this.nextFrame += timePerFrameNanos;
			return 1;
		}
		@Pc(72) int logicCycles = 0;
		do {
			this.nextFrame += timePerFrameNanos;
			logicCycles++;
		} while (logicCycles < 10 && this.nextFrame < this.time);
		if (this.nextFrame < this.time) {
			this.nextFrame = this.time;
		}
		return logicCycles;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
	@Override
	public void reset() {
		this.previousFrame = 0L;
		if (this.nextFrame > this.time) {
			this.time += this.nextFrame - this.time;
		}
	}
}

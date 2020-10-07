import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Envelope {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "I")
	public int maxInterval;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public int minInterval;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public int wavetable;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	private int nextTime;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "I")
	private int phase;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	private int level;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "I")
	private int time;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "I")
	private int slope;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	private int stages = 2;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "[I")
	private int[] times = new int[2];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "[I")
	private int[] levels = new int[2];

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Envelope() {
		this.times[0] = 0;
		this.times[1] = 65535;
		this.levels[0] = 0;
		this.levels[1] = 65535;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
	public final void reset() {
		this.nextTime = 0;
		this.phase = 0;
		this.slope = 0;
		this.level = 0;
		this.time = 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!fd;)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		this.wavetable = buffer.readUnsignedByte();
		this.minInterval = buffer.readInt();
		this.maxInterval = buffer.readInt();
		this.decodeStages(buffer);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
	public final int nextLevel(@OriginalArg(0) int duration) {
		if (this.time >= this.nextTime) {
			this.level = this.levels[this.phase++] << 15;
			if (this.phase >= this.stages) {
				this.phase = this.stages - 1;
			}
			this.nextTime = (int) ((double) this.times[this.phase] / 65536.0D * (double) duration);
			if (this.nextTime > this.time) {
				this.slope = ((this.levels[this.phase] << 15) - this.level) / (this.nextTime - this.time);
			}
		}
		this.level += this.slope;
		this.time++;
		return this.level - this.slope >> 15;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Lclient!fd;)V")
	public final void decodeStages(@OriginalArg(0) Buffer buffer) {
		this.stages = buffer.readUnsignedByte();
		this.times = new int[this.stages];
		this.levels = new int[this.stages];
		for (@Pc(16) int i = 0; i < this.stages; i++) {
			this.times[i] = buffer.readUnsignedShort();
			this.levels[i] = buffer.readUnsignedShort();
		}
	}
}

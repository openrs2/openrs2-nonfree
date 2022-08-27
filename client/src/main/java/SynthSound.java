import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class SynthSound {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!fh;II)Lclient!ag;")
	public static SynthSound create(@OriginalArg(0) Js5 archive, @OriginalArg(1) int group, @OriginalArg(2) int file) {
		@Pc(5) byte[] bytes = archive.fetchFile(group, file);
		return bytes == null ? null : new SynthSound(new Buffer(bytes));
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "[Lclient!uh;")
	private final SynthInstrument[] instruments = new SynthInstrument[10];

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
	private int start;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	private int end;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!fd;)V")
	private SynthSound(@OriginalArg(0) Buffer buffer) {
		for (@Pc(7) int i = 0; i < 10; i++) {
			@Pc(14) int wavetable = buffer.readUnsignedByte();
			if (wavetable != 0) {
				buffer.position--;
				this.instruments[i] = new SynthInstrument();
				this.instruments[i].decode(buffer);
			}
		}
		this.start = buffer.readUnsignedShort();
		this.end = buffer.readUnsignedShort();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()[B")
	private byte[] getSamples() {
		@Pc(1) int end = 0;
		for (@Pc(3) int i = 0; i < 10; i++) {
			if (this.instruments[i] != null && this.instruments[i].duration + this.instruments[i].start > end) {
				end = this.instruments[i].duration + this.instruments[i].start;
			}
		}
		if (end == 0) {
			return new byte[0];
		}
		@Pc(49) int samplesLen = end * 22050 / 1000;
		@Pc(52) byte[] samples = new byte[samplesLen];
		for (@Pc(54) int i = 0; i < 10; i++) {
			if (this.instruments[i] != null) {
				@Pc(72) int duration = this.instruments[i].duration * 22050 / 1000;
				@Pc(82) int start = this.instruments[i].start * 22050 / 1000;
				@Pc(94) int[] instrumentSamples = this.instruments[i].getSamples(duration, this.instruments[i].duration);
				for (@Pc(96) int j = 0; j < duration; j++) {
					@Pc(111) int sample = samples[j + start] + (instrumentSamples[j] >> 8);
					if ((sample + 128 & 0xFFFFFF00) != 0) {
						sample = sample >> 31 ^ 0x7F;
					}
					samples[j + start] = (byte) sample;
				}
			}
		}
		return samples;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "()I")
	public int getStart() {
		@Pc(1) int start = 9999999;
		for (@Pc(3) int i = 0; i < 10; i++) {
			if (this.instruments[i] != null && this.instruments[i].start / 20 < start) {
				start = this.instruments[i].start / 20;
			}
		}
		if (this.start < this.end && this.start / 20 < start) {
			start = this.start / 20;
		}
		if (start == 9999999 || start == 0) {
			return 0;
		}
		for (@Pc(55) int i = 0; i < 10; i++) {
			if (this.instruments[i] != null) {
				@Pc(67) SynthInstrument instrument = this.instruments[i];
				instrument.start -= start * 20;
			}
		}
		if (this.start < this.end) {
			this.start -= start * 20;
			this.end -= start * 20;
		}
		return start;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "()Lclient!pb;")
	public PcmSound toPcmSound() {
		@Pc(2) byte[] samples = this.getSamples();
		return new PcmSound(22050, samples, this.start * 22050 / 1000, this.end * 22050 / 1000);
	}
}

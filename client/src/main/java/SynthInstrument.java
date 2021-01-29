import java.util.Random;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class SynthInstrument {

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "[I")
	private static final int[] oscillatorTimes = new int[5];

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "[I")
	private static final int[] oscillatorStartSamples = new int[5];

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "[I")
	private static final int[] scaledOscillatorAmplitudes = new int[5];

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "[I")
	private static final int[] oscillatorIntervalRanges = new int[5];

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "[I")
	private static final int[] oscillatorMinIntervals = new int[5];

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "[I")
	private static final int[] samples = new int[220500];

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "[I")
	private static final int[] NOISE = new int[32768];

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
	private static final int[] SINE;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "Lclient!h;")
	private Envelope gateOpenPhaseEnvelope;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!h;")
	private Envelope amplitudeModulationAmplitudeEnvelope;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!h;")
	private Envelope gateClosedPhaseEnvelope;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!h;")
	private Envelope amplitudeEnvelope;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!h;")
	private Envelope amplitudeModulationEnvelope;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!h;")
	private Envelope phaseModulationEnvelope;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!h;")
	private Envelope phaseEnvelope;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!qo;")
	private Filter filter;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "Lclient!h;")
	private Envelope phaseModulationAmplitudeEnvelope;

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "Lclient!h;")
	private Envelope filterEnvelope;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public int duration = 500;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	public int start = 0;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "[I")
	private final int[] oscillatorStartMillis = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "[I")
	private final int[] oscillatorAmplitudes = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	private int delayTime = 0;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
	private final int[] anIntArray604 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	private int delayMix = 100;

	static {
		@Pc(7) Random random = new Random(0L);
		for (@Pc(9) int i = 0; i < 32768; i++) {
			NOISE[i] = (random.nextInt() & 0x2) - 1;
		}
		SINE = new int[32768];
		for (@Pc(28) int i = 0; i < 32768; i++) {
			SINE[i] = (int) (Math.sin((double) i / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!fd;)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		this.phaseEnvelope = new Envelope();
		this.phaseEnvelope.decode(buffer);
		this.amplitudeEnvelope = new Envelope();
		this.amplitudeEnvelope.decode(buffer);
		@Pc(21) int phaseModulationWavetable = buffer.readUnsignedByte();
		if (phaseModulationWavetable != 0) {
			buffer.position--;
			this.phaseModulationEnvelope = new Envelope();
			this.phaseModulationEnvelope.decode(buffer);
			this.phaseModulationAmplitudeEnvelope = new Envelope();
			this.phaseModulationAmplitudeEnvelope.decode(buffer);
		}
		@Pc(51) int amplitudeModulationWavetable = buffer.readUnsignedByte();
		if (amplitudeModulationWavetable != 0) {
			buffer.position--;
			this.amplitudeModulationEnvelope = new Envelope();
			this.amplitudeModulationEnvelope.decode(buffer);
			this.amplitudeModulationAmplitudeEnvelope = new Envelope();
			this.amplitudeModulationAmplitudeEnvelope.decode(buffer);
		}
		@Pc(81) int gateWavetable = buffer.readUnsignedByte();
		if (gateWavetable != 0) {
			buffer.position--;
			this.gateClosedPhaseEnvelope = new Envelope();
			this.gateClosedPhaseEnvelope.decode(buffer);
			this.gateOpenPhaseEnvelope = new Envelope();
			this.gateOpenPhaseEnvelope.decode(buffer);
		}
		for (@Pc(109) int i = 0; i < 10; i++) {
			@Pc(116) int amplitude = buffer.readUnsignedShortSmart();
			if (amplitude == 0) {
				break;
			}
			this.oscillatorAmplitudes[i] = amplitude;
			this.anIntArray604[i] = buffer.readShortSmart();
			this.oscillatorStartMillis[i] = buffer.readUnsignedShortSmart();
		}
		this.delayTime = buffer.readUnsignedShortSmart();
		this.delayMix = buffer.readUnsignedShortSmart();
		this.duration = buffer.readUnsignedShort();
		this.start = buffer.readUnsignedShort();
		this.filter = new Filter();
		this.filterEnvelope = new Envelope();
		this.filter.decode(buffer, this.filterEnvelope);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I")
	public final int[] getSamples(@OriginalArg(0) int count, @OriginalArg(1) int millis) {
		ArrayUtils.clear(samples, 0, count);
		if (millis < 10) {
			return samples;
		}
		@Pc(16) double samplesPerMilli = (double) count / ((double) millis + 0.0D);
		this.phaseEnvelope.reset();
		this.amplitudeEnvelope.reset();
		@Pc(24) int phaseModulationIntervalRange = 0;
		@Pc(26) int phaseModulationMinInterval = 0;
		@Pc(28) int intervalModulationTime = 0;
		if (this.phaseModulationEnvelope != null) {
			this.phaseModulationEnvelope.reset();
			this.phaseModulationAmplitudeEnvelope.reset();
			phaseModulationIntervalRange = (int) ((double) (this.phaseModulationEnvelope.maxInterval - this.phaseModulationEnvelope.minInterval) * 32.768D / samplesPerMilli);
			phaseModulationMinInterval = (int) ((double) this.phaseModulationEnvelope.minInterval * 32.768D / samplesPerMilli);
		}
		@Pc(63) int amplitudeModulationIntervalRange = 0;
		@Pc(65) int amplitudeModulationMinInterval = 0;
		@Pc(67) int amplitudeModulationTime = 0;
		if (this.amplitudeModulationEnvelope != null) {
			this.amplitudeModulationEnvelope.reset();
			this.amplitudeModulationAmplitudeEnvelope.reset();
			amplitudeModulationIntervalRange = (int) ((double) (this.amplitudeModulationEnvelope.maxInterval - this.amplitudeModulationEnvelope.minInterval) * 32.768D / samplesPerMilli);
			amplitudeModulationMinInterval = (int) ((double) this.amplitudeModulationEnvelope.minInterval * 32.768D / samplesPerMilli);
		}
		for (@Pc(102) int i = 0; i < 5; i++) {
			if (this.oscillatorAmplitudes[i] != 0) {
				oscillatorTimes[i] = 0;
				oscillatorStartSamples[i] = (int) ((double) this.oscillatorStartMillis[i] * samplesPerMilli);
				scaledOscillatorAmplitudes[i] = (this.oscillatorAmplitudes[i] << 14) / 100;
				oscillatorIntervalRanges[i] = (int) ((double) (this.phaseEnvelope.maxInterval - this.phaseEnvelope.minInterval) * 32.768D * Math.pow(1.0057929410678534D, this.anIntArray604[i]) / samplesPerMilli);
				oscillatorMinIntervals[i] = (int) ((double) this.phaseEnvelope.minInterval * 32.768D / samplesPerMilli);
			}
		}
		for (@Pc(177) int i = 0; i < count; i++) {
			@Pc(185) int intervalMultiplier = this.phaseEnvelope.nextLevel(count);
			@Pc(190) int amplitudeMultiplier = this.amplitudeEnvelope.nextLevel(count);
			if (this.phaseModulationEnvelope != null) {
				@Pc(198) int interval = this.phaseModulationEnvelope.nextLevel(count);
				@Pc(203) int amplitude = this.phaseModulationAmplitudeEnvelope.nextLevel(count);
				intervalMultiplier += this.wavetableLookup(this.phaseModulationEnvelope.wavetable, intervalModulationTime, amplitude) >> 1;
				intervalModulationTime += (interval * phaseModulationIntervalRange >> 16) + phaseModulationMinInterval;
			}
			if (this.amplitudeModulationEnvelope != null) {
				@Pc(233) int interval = this.amplitudeModulationEnvelope.nextLevel(count);
				@Pc(238) int amplitude = this.amplitudeModulationAmplitudeEnvelope.nextLevel(count);
				amplitudeMultiplier = amplitudeMultiplier * ((this.wavetableLookup(this.amplitudeModulationEnvelope.wavetable, amplitudeModulationTime, amplitude) >> 1) + 32768) >> 15;
				amplitudeModulationTime += (interval * amplitudeModulationIntervalRange >> 16) + amplitudeModulationMinInterval;
			}
			for (@Pc(266) int j = 0; j < 5; j++) {
				if (this.oscillatorAmplitudes[j] != 0) {
					@Pc(281) int k = i + oscillatorStartSamples[j];
					if (k < count) {
						@Pc(285) int[] temp = samples;
						temp[k] += this.wavetableLookup(this.phaseEnvelope.wavetable, oscillatorTimes[j], amplitudeMultiplier * scaledOscillatorAmplitudes[j] >> 15);
						temp = oscillatorTimes;
						temp[j] += (intervalMultiplier * oscillatorIntervalRanges[j] >> 16) + oscillatorMinIntervals[j];
					}
				}
			}
		}
		if (this.gateClosedPhaseEnvelope != null) {
			this.gateClosedPhaseEnvelope.reset();
			this.gateOpenPhaseEnvelope.reset();
			@Pc(337) int time = 0;
			@Pc(341) boolean closed = true;
			for (@Pc(343) int i = 0; i < count; i++) {
				@Pc(351) int closedPhase = this.gateClosedPhaseEnvelope.nextLevel(count);
				@Pc(356) int openPhase = this.gateOpenPhaseEnvelope.nextLevel(count);
				@Pc(374) int duration;
				if (closed) {
					duration = this.gateClosedPhaseEnvelope.minInterval + ((this.gateClosedPhaseEnvelope.maxInterval - this.gateClosedPhaseEnvelope.minInterval) * closedPhase >> 8);
				} else {
					duration = this.gateClosedPhaseEnvelope.minInterval + ((this.gateClosedPhaseEnvelope.maxInterval - this.gateClosedPhaseEnvelope.minInterval) * openPhase >> 8);
				}
				time += 256;
				if (time >= duration) {
					time = 0;
					closed = !closed;
				}
				if (closed) {
					samples[i] = 0;
				}
			}
		}
		if (this.delayTime > 0 && this.delayMix > 0) {
			@Pc(424) int delay = (int) ((double) this.delayTime * samplesPerMilli);
			for (@Pc(426) int i = delay; i < count; i++) {
				@Pc(430) int[] samples = SynthInstrument.samples;
				samples[i] += SynthInstrument.samples[i - delay] * this.delayMix / 100;
			}
		}
		if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
			this.filterEnvelope.reset();
			@Pc(469) int t = this.filterEnvelope.nextLevel(count + 1);
			@Pc(478) int forwardOrder = this.filter.compute(0, (float) t / 65536.0F);
			@Pc(487) int backOrder = this.filter.compute(1, (float) t / 65536.0F);
			if (count >= forwardOrder + backOrder) {
				@Pc(494) int i = 0;
				@Pc(496) int n = backOrder;
				if (backOrder > count - forwardOrder) {
					n = count - forwardOrder;
				}
				while (i < n) {
					@Pc(521) int sample = (int) ((long) samples[i + forwardOrder] * (long) Filter.inverseA0 >> 16);
					for (@Pc(523) int j = 0; j < forwardOrder; j++) {
						sample += (int) ((long) samples[i + forwardOrder - j - 1] * (long) Filter.coefficients[0][j] >> 16);
					}
					for (@Pc(553) int j = 0; j < i; j++) {
						sample -= (int) ((long) samples[i - j - 1] * (long) Filter.coefficients[1][j] >> 16);
					}
					samples[i] = sample;
					t = this.filterEnvelope.nextLevel(count + 1);
					i++;
				}
				@Pc(594) int n2 = 128;
				while (true) {
					if (n2 > count - forwardOrder) {
						n2 = count - forwardOrder;
					}
					while (i < n2) {
						@Pc(619) int sample = (int) ((long) samples[i + forwardOrder] * (long) Filter.inverseA0 >> 16);
						for (@Pc(621) int j = 0; j < forwardOrder; j++) {
							sample += (int) ((long) samples[i + forwardOrder - j - 1] * (long) Filter.coefficients[0][j] >> 16);
						}
						for (@Pc(651) int j = 0; j < backOrder; j++) {
							sample -= (int) ((long) samples[i - j - 1] * (long) Filter.coefficients[1][j] >> 16);
						}
						samples[i] = sample;
						t = this.filterEnvelope.nextLevel(count + 1);
						i++;
					}
					if (i >= count - forwardOrder) {
						while (i < count) {
							@Pc(721) int sample = 0;
							for (@Pc(727) int j = i + forwardOrder - count; j < forwardOrder; j++) {
								sample += (int) ((long) samples[i + forwardOrder - j - 1] * (long) Filter.coefficients[0][j] >> 16);
							}
							for (@Pc(757) int j = 0; j < backOrder; j++) {
								sample -= (int) ((long) samples[i - j - 1] * (long) Filter.coefficients[1][j] >> 16);
							}
							samples[i] = sample;
							this.filterEnvelope.nextLevel(count + 1);
							i++;
						}
						break;
					}
					forwardOrder = this.filter.compute(0, (float) t / 65536.0F);
					backOrder = this.filter.compute(1, (float) t / 65536.0F);
					n2 += 128;
				}
			}
		}
		for (@Pc(798) int i = 0; i < count; i++) {
			if (samples[i] < -32768) {
				samples[i] = -32768;
			}
			if (samples[i] > 32767) {
				samples[i] = 32767;
			}
		}
		return samples;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)I")
	private int wavetableLookup(@OriginalArg(2) int wavetable, @OriginalArg(0) int time, @OriginalArg(1) int amplitude) {
		if (wavetable == 1) {
			return (time & 0x7FFF) < 16384 ? amplitude : -amplitude;
		} else if (wavetable == 2) {
			return SINE[time & 0x7FFF] * amplitude >> 14;
		} else if (wavetable == 3) {
			return ((time & 0x7FFF) * amplitude >> 14) - amplitude;
		} else if (wavetable == 4) {
			return NOISE[time / 2607 & 0x7FFF] * amplitude;
		} else {
			return 0;
		}
	}
}

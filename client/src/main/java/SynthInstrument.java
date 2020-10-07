import java.util.Random;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

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
	private Class146 aClass146_1;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "Lclient!h;")
	private Envelope phaseModulationAmplitudeEnvelope;

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "Lclient!h;")
	private Envelope aClass73_9;

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
			@Pc(116) int local116 = buffer.readUnsignedShortSmart();
			if (local116 == 0) {
				break;
			}
			this.oscillatorAmplitudes[i] = local116;
			this.anIntArray604[i] = buffer.readShortSmart();
			this.oscillatorStartMillis[i] = buffer.readUnsignedShortSmart();
		}
		this.delayTime = buffer.readUnsignedShortSmart();
		this.delayMix = buffer.readUnsignedShortSmart();
		this.duration = buffer.readUnsignedShort();
		this.start = buffer.readUnsignedShort();
		this.aClass146_1 = new Class146();
		this.aClass73_9 = new Envelope();
		this.aClass146_1.decode(buffer, this.aClass73_9);
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
		if (this.aClass146_1.anIntArray471[0] > 0 || this.aClass146_1.anIntArray471[1] > 0) {
			this.aClass73_9.reset();
			@Pc(469) int local469 = this.aClass73_9.nextLevel(count + 1);
			@Pc(478) int local478 = this.aClass146_1.method3640(0, (float) local469 / 65536.0F);
			@Pc(487) int local487 = this.aClass146_1.method3640(1, (float) local469 / 65536.0F);
			if (count >= local478 + local487) {
				@Pc(494) int local494 = 0;
				@Pc(496) int local496 = local487;
				if (local487 > count - local478) {
					local496 = count - local478;
				}
				while (local494 < local496) {
					@Pc(521) int local521 = (int) ((long) samples[local494 + local478] * (long) Static6.anInt4425 >> 16);
					for (@Pc(523) int local523 = 0; local523 < local478; local523++) {
						local521 += (int) ((long) samples[local494 + local478 - local523 - 1] * (long) Static6.anIntArrayArray38[0][local523] >> 16);
					}
					for (@Pc(553) int local553 = 0; local553 < local494; local553++) {
						local521 -= (int) ((long) samples[local494 - local553 - 1] * (long) Static6.anIntArrayArray38[1][local553] >> 16);
					}
					samples[local494] = local521;
					local469 = this.aClass73_9.nextLevel(count + 1);
					local494++;
				}
				@Pc(594) int local594 = 128;
				while (true) {
					if (local594 > count - local478) {
						local594 = count - local478;
					}
					while (local494 < local594) {
						@Pc(619) int local619 = (int) ((long) samples[local494 + local478] * (long) Static6.anInt4425 >> 16);
						for (@Pc(621) int local621 = 0; local621 < local478; local621++) {
							local619 += (int) ((long) samples[local494 + local478 - local621 - 1] * (long) Static6.anIntArrayArray38[0][local621] >> 16);
						}
						for (@Pc(651) int local651 = 0; local651 < local487; local651++) {
							local619 -= (int) ((long) samples[local494 - local651 - 1] * (long) Static6.anIntArrayArray38[1][local651] >> 16);
						}
						samples[local494] = local619;
						local469 = this.aClass73_9.nextLevel(count + 1);
						local494++;
					}
					if (local494 >= count - local478) {
						while (local494 < count) {
							@Pc(721) int local721 = 0;
							for (@Pc(727) int local727 = local494 + local478 - count; local727 < local478; local727++) {
								local721 += (int) ((long) samples[local494 + local478 - local727 - 1] * (long) Static6.anIntArrayArray38[0][local727] >> 16);
							}
							for (@Pc(757) int local757 = 0; local757 < local487; local757++) {
								local721 -= (int) ((long) samples[local494 - local757 - 1] * (long) Static6.anIntArrayArray38[1][local757] >> 16);
							}
							samples[local494] = local721;
							this.aClass73_9.nextLevel(count + 1);
							local494++;
						}
						break;
					}
					local478 = this.aClass146_1.method3640(0, (float) local469 / 65536.0F);
					local487 = this.aClass146_1.method3640(1, (float) local469 / 65536.0F);
					local594 += 128;
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

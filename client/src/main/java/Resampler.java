import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Resampler {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)I")
	private static int gcd(@OriginalArg(0) int a, @OriginalArg(2) int b) {
		if (b > 22050) {
			a = b;
			b = 22050;
		}
		while (b != 0) {
			@Pc(32) int aModB = a % b;
			a = b;
			b = aModB;
		}
		return a;
	}

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	private int inputRate;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	private int outputRate;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(II)V")
	public Resampler(@OriginalArg(0) int inputRate, @OriginalArg(1) int outputRate) {
		if (inputRate != outputRate) {
			@Pc(12) int gcd = gcd(inputRate, outputRate);
			inputRate /= gcd;
			this.anIntArrayArray47 = new int[inputRate][14];
			outputRate /= gcd;
			this.inputRate = inputRate;
			this.outputRate = outputRate;
			for (@Pc(33) int i = 0; i < inputRate; i++) {
				@Pc(48) double local48 = (double) i / (double) inputRate + 6.0D;
				@Pc(53) int[] local53 = this.anIntArrayArray47[i];
				@Pc(61) int local61 = (int) Math.floor(local48 + 1.0D - 7.0D);
				@Pc(67) int local67 = (int) Math.ceil(local48 + 7.0D);
				if (local67 > 14) {
					local67 = 14;
				}
				@Pc(78) double ratio = (double) outputRate / (double) inputRate;
				if (local61 < 0) {
					local61 = 0;
				}
				while (local61 < local67) {
					@Pc(96) double local96 = ((double) local61 - local48) * 3.141592653589793D;
					@Pc(98) double local98 = ratio;
					if (local96 < -1.0E-4D || local96 > 1.0E-4D) {
						local98 = ratio * (Math.sin(local96) / local96);
					}
					@Pc(127) double local127 = local98 * (Math.cos(((double) local61 - local48) * 0.2243994752564138D) * 0.46D + 0.54D);
					local53[local61] = (int) Math.floor(local127 * 65536.0D + 0.5D);
					local61++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I")
	public int scaleRate(@OriginalArg(0) int rate) {
		if (this.anIntArrayArray47 != null) {
			rate = (int) ((long) this.outputRate * (long) rate / (long) this.inputRate);
		}
		return rate;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
	public int scalePosition(@OriginalArg(1) int position) {
		if (this.anIntArrayArray47 != null) {
			position = (int) ((long) this.outputRate * (long) position / (long) this.inputRate) + 6;
		}
		return position;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B[B)[B")
	public byte[] resample(@OriginalArg(1) byte[] samples) {
		if (this.anIntArrayArray47 != null) {
			@Pc(29) int outputCount = (int) ((long) this.outputRate * (long) samples.length / (long) this.inputRate) + 14;
			@Pc(31) int outputPos = 0;
			@Pc(34) int[] outputSamples = new int[outputCount];
			@Pc(36) int local36 = 0;
			for (@Pc(38) int inputPos = 0; inputPos < samples.length; inputPos++) {
				@Pc(46) byte inputSample = samples[inputPos];
				@Pc(51) int[] local51 = this.anIntArrayArray47[local36];
				for (@Pc(53) int j = 0; j < 14; j++) {
					outputSamples[outputPos + j] += local51[j] * inputSample;
				}
				@Pc(77) int local77 = local36 + this.outputRate;
				@Pc(82) int local82 = local77 / this.inputRate;
				outputPos += local82;
				local36 = local77 - this.inputRate * local82;
			}
			samples = new byte[outputCount];
			for (@Pc(101) int i = 0; i < outputCount; i++) {
				@Pc(116) int sample = outputSamples[i] + 32768 >> 16;
				if (sample < -128) {
					samples[i] = -128;
				} else if (sample > 127) {
					samples[i] = 127;
				} else {
					samples[i] = (byte) sample;
				}
			}
		}
		return samples;
	}
}

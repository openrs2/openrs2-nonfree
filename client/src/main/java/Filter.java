import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Filter {

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "[[I")
	public static final int[][] coefficients = new int[2][8];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "[[F")
	private static final float[][] floatingCoefficients = new float[2][8];

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
	public static int inverseA0;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "F")
	private static float floatingInverseA0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(F)F")
	private static float getOctavePhase(@OriginalArg(0) float octave) {
		@Pc(7) float frequency = (float) Math.pow(2.0D, octave) * 32.703197F;
		return frequency * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "[I")
	public final int[] pairs = new int[2];

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "[[[I")
	private final int[][][] octaves = new int[2][2][4];

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "[[[I")
	private final int[][][] gain = new int[2][2][4];

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "[I")
	private final int[] inverseGain = new int[2];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIF)F")
	private float getAmplitude(@OriginalArg(0) int direction, @OriginalArg(1) int i, @OriginalArg(2) float t) {
		@Pc(30) float decibels = (float) this.gain[direction][0][i] + t * (float) (this.gain[direction][1][i] - this.gain[direction][0][i]);
		decibels *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -decibels / 20.0F);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IF)I")
	public final int compute(@OriginalArg(0) int direction, @OriginalArg(1) float t) {
		if (direction == 0) {
			@Pc(20) float decibels = (float) this.inverseGain[0] + (float) (this.inverseGain[1] - this.inverseGain[0]) * t;
			decibels *= 0.0030517578F;
			floatingInverseA0 = (float) Math.pow(0.1D, decibels / 20.0F);
			inverseA0 = (int) (floatingInverseA0 * 65536.0F);
		}
		if (this.pairs[direction] == 0) {
			return 0;
		}
		@Pc(50) float amplitude = this.getAmplitude(direction, 0, t);
		floatingCoefficients[direction][0] = -2.0F * amplitude * (float) Math.cos(this.getPhase(direction, 0, t));
		floatingCoefficients[direction][1] = amplitude * amplitude;
		for (@Pc(77) int i = 1; i < this.pairs[direction]; i++) {
			@Pc(89) float amplitude2 = this.getAmplitude(direction, i, t);
			@Pc(102) float b1 = -2.0F * amplitude2 * (float) Math.cos(this.getPhase(direction, i, t));
			@Pc(106) float b2 = amplitude2 * amplitude2;
			floatingCoefficients[direction][i * 2 + 1] = floatingCoefficients[direction][i * 2 - 1] * b2;
			floatingCoefficients[direction][i * 2] = floatingCoefficients[direction][i * 2 - 1] * b1 + floatingCoefficients[direction][i * 2 - 2] * b2;
			for (@Pc(162) int j = i * 2 - 1; j >= 2; j--) {
				@Pc(168) float[] temp = floatingCoefficients[direction];
				temp[j] += floatingCoefficients[direction][j - 1] * b1 + floatingCoefficients[direction][j - 2] * b2;
			}
			@Pc(197) float[] temp = floatingCoefficients[direction];
			temp[1] += floatingCoefficients[direction][0] * b1 + b2;
			temp = floatingCoefficients[direction];
			temp[0] += b1;
		}
		if (direction == 0) {
			for (@Pc(226) int i = 0; i < this.pairs[0] * 2; i++) {
				@Pc(237) float[] temp = floatingCoefficients[0];
				temp[i] *= floatingInverseA0;
			}
		}
		for (@Pc(247) int i = 0; i < this.pairs[direction] * 2; i++) {
			coefficients[direction][i] = (int) (floatingCoefficients[direction][i] * 65536.0F);
		}
		return this.pairs[direction] * 2;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!fd;Lclient!h;)V")
	public final void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(1) Envelope envelope) {
		@Pc(3) int pairs = buffer.readUnsignedByte();
		this.pairs[0] = pairs >> 4;
		this.pairs[1] = pairs & 0xF;
		if (pairs == 0) {
			this.inverseGain[0] = this.inverseGain[1] = 0;
			return;
		}
		this.inverseGain[0] = buffer.readUnsignedShort();
		this.inverseGain[1] = buffer.readUnsignedShort();
		@Pc(37) int interpolated = buffer.readUnsignedByte();
		for (@Pc(39) int direction = 0; direction < 2; direction++) {
			for (@Pc(44) int i = 0; i < this.pairs[direction]; i++) {
				this.octaves[direction][0][i] = buffer.readUnsignedShort();
				this.gain[direction][0][i] = buffer.readUnsignedShort();
			}
		}
		for (@Pc(78) int direction = 0; direction < 2; direction++) {
			for (@Pc(83) int i = 0; i < this.pairs[direction]; i++) {
				if ((interpolated & 0x1 << direction * 4 << i) == 0) {
					this.octaves[direction][1][i] = this.octaves[direction][0][i];
					this.gain[direction][1][i] = this.gain[direction][0][i];
				} else {
					this.octaves[direction][1][i] = buffer.readUnsignedShort();
					this.gain[direction][1][i] = buffer.readUnsignedShort();
				}
			}
		}
		if (interpolated != 0 || this.inverseGain[1] != this.inverseGain[0]) {
			envelope.decodeStages(buffer);
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIF)F")
	private float getPhase(@OriginalArg(0) int direction, @OriginalArg(1) int i, @OriginalArg(2) float t) {
		@Pc(30) float octave = (float) this.octaves[direction][0][i] + t * (float) (this.octaves[direction][1][i] - this.octaves[direction][0][i]);
		octave *= 1.2207031E-4F;
		return getOctavePhase(octave);
	}
}

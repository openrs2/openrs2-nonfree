import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class VorbisSound extends Node {

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
	private static int blockSize0;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "[F")
	private static float[] trigC1;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "[I")
	private static int[] modeMappings;

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "[Lclient!sf;")
	private static VorbisResidue[] residues;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "[B")
	private static byte[] bytes;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "[F")
	private static float[] trigA0;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "[F")
	private static float[] trigC0;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
	private static int blockSize1;

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "[F")
	private static float[] trigA1;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "[F")
	private static float[] trigB0;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "[I")
	private static int[] bitReverse0;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "[F")
	private static float[] vector;

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "[Lclient!rd;")
	private static VorbisMapping[] mappings;

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
	private static int position;

	@OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
	private static int bitPosition;

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "[Z")
	private static boolean[] modeBlockFlags;

	@OriginalMember(owner = "client!qn", name = "N", descriptor = "[F")
	private static float[] trigB1;

	@OriginalMember(owner = "client!qn", name = "O", descriptor = "[Lclient!bf;")
	private static VorbisFloor[] floors;

	@OriginalMember(owner = "client!qn", name = "Q", descriptor = "[I")
	private static int[] bitReverse1;

	@OriginalMember(owner = "client!qn", name = "R", descriptor = "[Lclient!pd;")
	public static VorbisCodebook[] codebooks;

	@OriginalMember(owner = "client!qn", name = "G", descriptor = "Z")
	private static boolean headerDecoded = false;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fh;)Z")
	private static boolean isHeaderReady(@OriginalArg(0) Js5 archive) {
		if (!headerDecoded) {
			@Pc(7) byte[] bytes = archive.fetchFile(0, 0);
			if (bytes == null) {
				return false;
			}
			decodeHeader(bytes);
			headerDecoded = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([BI)V")
	private static void setBytes(@OriginalArg(0) byte[] bytes) {
		VorbisSound.bytes = bytes;
		position = 0;
		bitPosition = 0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([B)V")
	private static void decodeHeader(@OriginalArg(0) byte[] bytes) {
		setBytes(bytes);
		blockSize0 = 0x1 << readBits(4);
		blockSize1 = 0x1 << readBits(4);
		vector = new float[blockSize1];
		for (@Pc(17) int i = 0; i < 2; i++) {
			@Pc(26) int n = i == 0 ? blockSize0 : blockSize1;
			@Pc(30) int n2 = n >> 1;
			@Pc(34) int n4 = n >> 2;
			@Pc(38) int n8 = n >> 3;
			@Pc(41) float[] trigA = new float[n2];
			for (@Pc(43) int j = 0; j < n4; j++) {
				trigA[j * 2] = (float) Math.cos((double) (j * 4) * 3.141592653589793D / (double) n);
				trigA[j * 2 + 1] = -((float) Math.sin((double) (j * 4) * 3.141592653589793D / (double) n));
			}
			@Pc(86) float[] trigB = new float[n2];
			for (@Pc(88) int j = 0; j < n4; j++) {
				trigB[j * 2] = (float) Math.cos((double) (j * 2 + 1) * 3.141592653589793D / (double) (n * 2));
				trigB[j * 2 + 1] = (float) Math.sin((double) (j * 2 + 1) * 3.141592653589793D / (double) (n * 2));
			}
			@Pc(138) float[] trigC = new float[n4];
			for (@Pc(140) int j = 0; j < n8; j++) {
				trigC[j * 2] = (float) Math.cos((double) (j * 4 + 2) * 3.141592653589793D / (double) n);
				trigC[j * 2 + 1] = -((float) Math.sin((double) (j * 4 + 2) * 3.141592653589793D / (double) n));
			}
			@Pc(187) int[] bitReverse = new int[n8];
			@Pc(193) int len = IntUtils.bitCount(n8 - 1);
			for (@Pc(195) int j = 0; j < n8; j++) {
				bitReverse[j] = IntUtils.bitReverse(j, len);
			}
			if (i == 0) {
				trigA0 = trigA;
				trigB0 = trigB;
				trigC0 = trigC;
				bitReverse0 = bitReverse;
			} else {
				trigA1 = trigA;
				trigB1 = trigB;
				trigC1 = trigC;
				bitReverse1 = bitReverse;
			}
		}
		@Pc(233) int codebookCount = readBits(8) + 1;
		codebooks = new VorbisCodebook[codebookCount];
		for (@Pc(238) int i = 0; i < codebookCount; i++) {
			codebooks[i] = new VorbisCodebook();
		}
		@Pc(254) int timeCount = readBits(6) + 1;
		for (@Pc(256) int i = 0; i < timeCount; i++) {
			readBits(16);
		}
		@Pc(269) int floorCount = readBits(6) + 1;
		floors = new VorbisFloor[floorCount];
		for (@Pc(274) int i = 0; i < floorCount; i++) {
			floors[i] = new VorbisFloor();
		}
		@Pc(290) int residueCount = readBits(6) + 1;
		residues = new VorbisResidue[residueCount];
		for (@Pc(295) int i = 0; i < residueCount; i++) {
			residues[i] = new VorbisResidue();
		}
		@Pc(311) int mappingCount = readBits(6) + 1;
		mappings = new VorbisMapping[mappingCount];
		for (@Pc(316) int i = 0; i < mappingCount; i++) {
			mappings[i] = new VorbisMapping();
		}
		@Pc(332) int modeCount = readBits(6) + 1;
		modeBlockFlags = new boolean[modeCount];
		modeMappings = new int[modeCount];
		for (@Pc(340) int i = 0; i < modeCount; i++) {
			modeBlockFlags[i] = readBit() != 0;
			readBits(16);
			readBits(16);
			modeMappings[i] = readBits(8);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "()I")
	public static int readBit() {
		@Pc(7) int value = bytes[position] >> bitPosition & 0x1;
		bitPosition++;
		position += bitPosition >> 3;
		bitPosition &= 7;
		return value;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)F")
	public static float float32Unpack(@OriginalArg(0) int x) {
		@Pc(3) int mantissa = x & 0x1FFFFF;
		@Pc(7) int sign = x & Integer.MIN_VALUE;
		@Pc(13) int exponent = x >> 21 & 0x3FF;
		if (sign != 0) {
			mantissa = -mantissa;
		}
		return (float) ((double) mantissa * Math.pow(2.0D, exponent - 788));
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fh;II)Lclient!qn;")
	public static VorbisSound create(@OriginalArg(0) Js5 archive, @OriginalArg(1) int group, @OriginalArg(2) int file) {
		if (isHeaderReady(archive)) {
			@Pc(16) byte[] bytes = archive.fetchFile(group, file);
			return bytes == null ? null : new VorbisSound(bytes);
		} else {
			archive.isFileReady(group, file);
			return null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)I")
	public static int readBits(@OriginalArg(0) int len) {
		@Pc(1) int value = 0;
		@Pc(3) int off = 0;
		while (len >= 8 - bitPosition) {
			@Pc(12) int n = 8 - bitPosition;
			@Pc(18) int mask = (0x1 << n) - 1;
			value += (bytes[position] >> bitPosition & mask) << off;
			bitPosition = 0;
			position++;
			off += n;
			len -= n;
		}
		if (len > 0) {
			@Pc(53) int mask = (0x1 << len) - 1;
			value += (bytes[position] >> bitPosition & mask) << off;
			bitPosition += len;
		}
		return value;
	}

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
	private int samplesLen;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "Z")
	private boolean prevNoResidue;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
	private int prevQuarter;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
	private int rate;

	@OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
	private int start;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
	private int end;

	@OriginalMember(owner = "client!qn", name = "L", descriptor = "[[B")
	private byte[][] packets;

	@OriginalMember(owner = "client!qn", name = "P", descriptor = "[F")
	private float[] prevVector;

	@OriginalMember(owner = "client!qn", name = "S", descriptor = "Z")
	private boolean aBoolean309;

	@OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
	private int prevN;

	@OriginalMember(owner = "client!qn", name = "U", descriptor = "I")
	private int packetIndex;

	@OriginalMember(owner = "client!qn", name = "V", descriptor = "[B")
	private byte[] samples;

	@OriginalMember(owner = "client!qn", name = "W", descriptor = "I")
	private int sampleIndex;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "([B)V")
	private VorbisSound(@OriginalArg(0) byte[] bytes) {
		this.decode(bytes);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)[F")
	private float[] decodePacket(@OriginalArg(0) int index) {
		setBytes(this.packets[index]);
		readBit();
		@Pc(15) int modeNumber = readBits(IntUtils.bitCount(modeMappings.length - 1));
		@Pc(19) boolean modeBlockFlag = modeBlockFlags[modeNumber];
		@Pc(25) int n = modeBlockFlag ? blockSize1 : blockSize0;
		@Pc(27) boolean previousWindowFlag = false;
		@Pc(29) boolean nextWindowFlag = false;
		if (modeBlockFlag) {
			previousWindowFlag = readBit() != 0;
			nextWindowFlag = readBit() != 0;
		}
		@Pc(47) int windowCenter = n >> 1;
		@Pc(59) int leftWindowStart;
		@Pc(67) int leftWindowEnd;
		@Pc(71) int leftN;
		if (modeBlockFlag && !previousWindowFlag) {
			leftWindowStart = (n >> 2) - (blockSize0 >> 2);
			leftWindowEnd = (n >> 2) + (blockSize0 >> 2);
			leftN = blockSize0 >> 1;
		} else {
			leftWindowStart = 0;
			leftWindowEnd = windowCenter;
			leftN = n >> 1;
		}
		@Pc(94) int rightWindowStart;
		@Pc(104) int rightWindowEnd;
		@Pc(108) int rightN;
		if (modeBlockFlag && !nextWindowFlag) {
			rightWindowStart = n - (n >> 2) - (blockSize0 >> 2);
			rightWindowEnd = n + (blockSize0 >> 2) - (n >> 2);
			rightN = blockSize0 >> 1;
		} else {
			rightWindowStart = windowCenter;
			rightWindowEnd = n;
			rightN = n >> 1;
		}
		@Pc(123) VorbisMapping mapping = mappings[modeMappings[modeNumber]];
		@Pc(126) int submapNumber = mapping.mux;
		@Pc(131) int floorNumber = mapping.submapFloor[submapNumber];
		@Pc(140) boolean noResidue = !floors[floorNumber].decodePacket();
		for (@Pc(144) int i = 0; i < mapping.submaps; i++) {
			@Pc(155) VorbisResidue residue = residues[mapping.submapResidue[i]];
			@Pc(157) float[] vector = VorbisSound.vector;
			residue.synthesize(vector, n >> 1, noResidue);
		}
		if (!noResidue) {
			@Pc(171) int submapNumber2 = mapping.mux;
			@Pc(176) int floorNumber2 = mapping.submapFloor[submapNumber2];
			floors[floorNumber2].synthesize(vector, n >> 1);
		}
		if (noResidue) {
			for (@Pc(190) int i = n >> 1; i < n; i++) {
				vector[i] = 0.0F;
			}
		} else {
			@Pc(204) int n2 = n >> 1;
			@Pc(208) int n4 = n >> 2;
			@Pc(212) int n8 = n >> 3;
			@Pc(214) float[] vector = VorbisSound.vector;
			for (@Pc(216) int k = 0; k < n2; k++) {
				vector[k] *= 0.5F;
			}
			for (@Pc(230) int k = n2; k < n; k++) {
				vector[k] = -vector[n - k - 1];
			}
			@Pc(252) float[] trigA = modeBlockFlag ? trigA1 : trigA0;
			@Pc(258) float[] trigB = modeBlockFlag ? trigB1 : trigB0;
			@Pc(264) float[] trigC = modeBlockFlag ? trigC1 : trigC0;
			@Pc(270) int[] bitReverse = modeBlockFlag ? bitReverse1 : bitReverse0;
			for (@Pc(272) int k = 0; k < n4; k++) {
				@Pc(291) float a = vector[k * 4] - vector[n - k * 4 - 1];
				@Pc(309) float b = vector[k * 4 + 2] - vector[n - k * 4 - 3];
				@Pc(315) float c = trigA[k * 2];
				@Pc(323) float d = trigA[k * 2 + 1];
				vector[n - k * 4 - 1] = a * c - b * d;
				vector[n - k * 4 - 3] = a * d + b * c;
			}
			for (@Pc(359) int k = 0; k < n8; k++) {
				@Pc(372) float a = vector[n2 + k * 4 + 3];
				@Pc(382) float b = vector[n2 + k * 4 + 1];
				@Pc(390) float c = vector[k * 4 + 3];
				@Pc(398) float d = vector[k * 4 + 1];
				vector[n2 + k * 4 + 3] = a + c;
				vector[n2 + k * 4 + 1] = b + d;
				@Pc(432) float e = trigA[n2 - k * 4 - 4];
				@Pc(442) float f = trigA[n2 - k * 4 - 3];
				vector[k * 4 + 3] = (a - c) * e - (b - d) * f;
				vector[k * 4 + 1] = (b - d) * e + (a - c) * f;
			}
			@Pc(486) int logN = IntUtils.bitCount(n - 1);
			for (@Pc(488) int l = 0; l < logN - 3; l++) {
				@Pc(499) int k0 = n >> l + 2;
				@Pc(503) int k1 = 0x8 << l;
				for (@Pc(505) int s = 0; s < 0x2 << l; s++) {
					@Pc(518) int a = n - k0 * 2 * s;
					@Pc(528) int b = n - k0 * (s * 2 + 1);
					for (@Pc(530) int r = 0; r < n >> l + 4; r++) {
						@Pc(541) int c = r * 4;
						@Pc(549) float d = vector[a - c - 1];
						@Pc(557) float e = vector[a - c - 3];
						@Pc(565) float f = vector[b - c - 1];
						@Pc(573) float g = vector[b - c - 3];
						vector[a - c - 1] = d + f;
						vector[a - c - 3] = e + g;
						@Pc(599) float h = trigA[r * k1];
						@Pc(607) float i = trigA[r * k1 + 1];
						vector[b - c - 1] = (d - f) * h - (e - g) * i;
						vector[b - c - 3] = (e - g) * h + (d - f) * i;
					}
				}
			}
			for (@Pc(651) int i = 1; i < n8 - 1; i++) {
				@Pc(660) int j = bitReverse[i];
				if (i < j) {
					@Pc(667) int i8 = i * 8;
					@Pc(671) int j8 = j * 8;
					@Pc(677) float temp = vector[i8 + 1];
					vector[i8 + 1] = vector[j8 + 1];
					vector[j8 + 1] = temp;
					temp = vector[i8 + 3];
					vector[i8 + 3] = vector[j8 + 3];
					vector[j8 + 3] = temp;
					temp = vector[i8 + 5];
					vector[i8 + 5] = vector[j8 + 5];
					vector[j8 + 5] = temp;
					temp = vector[i8 + 7];
					vector[i8 + 7] = vector[j8 + 7];
					vector[j8 + 7] = temp;
				}
			}
			for (@Pc(763) int k = 0; k < n2; k++) {
				vector[k] = vector[k * 2 + 1];
			}
			for (@Pc(780) int k = 0; k < n8; k++) {
				vector[n - k * 2 - 1] = vector[k * 4];
				vector[n - k * 2 - 2] = vector[k * 4 + 1];
				vector[n - n4 - k * 2 - 1] = vector[k * 4 + 2];
				vector[n - n4 - k * 2 - 2] = vector[k * 4 + 3];
			}
			for (@Pc(853) int k = 0; k < n8; k++) {
				@Pc(862) float a = trigC[k * 2];
				@Pc(870) float b = trigC[k * 2 + 1];
				@Pc(878) float c = vector[n2 + k * 2];
				@Pc(888) float d = vector[n2 + k * 2 + 1];
				@Pc(898) float e = vector[n - k * 2 - 2];
				@Pc(908) float f = vector[n - k * 2 - 1];
				@Pc(920) float g = b * (c - e) + a * (d + f);
				vector[n2 + k * 2] = (c + e + g) * 0.5F;
				vector[n - k * 2 - 2] = (c + e - g) * 0.5F;
				g = b * (d + f) - a * (c - e);
				vector[n2 + k * 2 + 1] = (d + g - f) * 0.5F;
				vector[n - k * 2 - 1] = (f + g - d) * 0.5F;
			}
			for (@Pc(999) int k = 0; k < n4; k++) {
				vector[k] = vector[k * 2 + n2] * trigB[k * 2] + vector[k * 2 + n2 + 1] * trigB[k * 2 + 1];
				vector[n2 - k - 1] = vector[k * 2 + n2] * trigB[k * 2 + 1] - vector[k * 2 + n2 + 1] * trigB[k * 2];
			}
			for (@Pc(1078) int k = 0; k < n4; k++) {
				vector[n + k - n4] = -vector[k];
			}
			for (@Pc(1096) int k = 0; k < n4; k++) {
				vector[k] = vector[n4 + k];
			}
			for (@Pc(1111) int k = 0; k < n4; k++) {
				vector[n4 + k] = -vector[n4 - k - 1];
			}
			for (@Pc(1131) int k = 0; k < n4; k++) {
				vector[n2 + k] = vector[n - k - 1];
			}
			for (@Pc(1150) int k = leftWindowStart; k < leftWindowEnd; k++) {
				@Pc(1169) float sine = (float) Math.sin(((double) (k - leftWindowStart) + 0.5D) / (double) leftN * 0.5D * 3.141592653589793D);
				@Pc(1170) float[] vector2 = VorbisSound.vector;
				vector2[k] *= (float) Math.sin((double) sine * 1.5707963267948966D * (double) sine);
			}
			for (@Pc(1188) int k = rightWindowStart; k < rightWindowEnd; k++) {
				@Pc(1209) float sine = (float) Math.sin(((double) (k - rightWindowStart) + 0.5D) / (double) rightN * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				@Pc(1210) float[] vector2 = VorbisSound.vector;
				vector2[k] *= (float) Math.sin((double) sine * 1.5707963267948966D * (double) sine);
			}
		}
		@Pc(1228) float[] samples = null;
		if (this.prevN > 0) {
			@Pc(1238) int sampleCount = this.prevN + n >> 2;
			samples = new float[sampleCount];
			if (!this.prevNoResidue) {
				for (@Pc(1246) int i = 0; i < this.prevQuarter; i++) {
					@Pc(1257) int j = (this.prevN >> 1) + i;
					samples[i] += this.prevVector[j];
				}
			}
			if (!noResidue) {
				for (@Pc(1273) int j = leftWindowStart; j < n >> 1; j++) {
					@Pc(1287) int i = samples.length + j - (n >> 1);
					samples[i] += vector[j];
				}
			}
		}
		@Pc(1301) float[] temp = this.prevVector;
		this.prevVector = vector;
		vector = temp;
		this.prevN = n;
		this.prevQuarter = rightWindowEnd - (n >> 1);
		this.prevNoResidue = noResidue;
		return samples;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "([B)V")
	private void decode(@OriginalArg(0) byte[] bytes) {
		@Pc(4) Buffer buffer = new Buffer(bytes);
		this.rate = buffer.readInt();
		this.samplesLen = buffer.readInt();
		this.start = buffer.readInt();
		this.end = buffer.readInt();
		if (this.end < 0) {
			this.end = ~this.end;
			this.aBoolean309 = true;
		}
		@Pc(40) int packetsLen = buffer.readInt();
		this.packets = new byte[packetsLen][];
		for (@Pc(46) int i = 0; i < packetsLen; i++) {
			@Pc(51) int len = 0;
			@Pc(55) int n;
			do {
				n = buffer.readUnsignedByte();
				len += n;
			} while (n >= 255);
			@Pc(67) byte[] packet = new byte[len];
			buffer.readBytes(packet, len);
			this.packets[i] = packet;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([I)Lclient!pb;")
	public PcmSound toPcmSound(@OriginalArg(0) int[] samplingRates) {
		if (samplingRates != null && samplingRates[0] <= 0) {
			return null;
		}
		if (this.samples == null) {
			this.prevN = 0;
			this.prevVector = new float[blockSize1];
			this.samples = new byte[this.samplesLen];
			this.sampleIndex = 0;
			this.packetIndex = 0;
		}
		while (this.packetIndex < this.packets.length) {
			if (samplingRates != null && samplingRates[0] <= 0) {
				return null;
			}
			@Pc(47) float[] floatSamples = this.decodePacket(this.packetIndex);
			if (floatSamples != null) {
				@Pc(52) int sampleIndex = this.sampleIndex;
				@Pc(55) int floatSamplesLen = floatSamples.length;
				if (floatSamplesLen > this.samplesLen - sampleIndex) {
					floatSamplesLen = this.samplesLen - sampleIndex;
				}
				for (@Pc(68) int i = 0; i < floatSamplesLen; i++) {
					@Pc(80) int sample = (int) (floatSamples[i] * 128.0F + 128.0F);
					if ((sample & 0xFFFFFF00) != 0) {
						sample = ~sample >> 31;
					}
					this.samples[sampleIndex++] = (byte) (sample - 128);
				}
				if (samplingRates != null) {
					samplingRates[0] -= sampleIndex - this.sampleIndex;
				}
				this.sampleIndex = sampleIndex;
			}
			this.packetIndex++;
		}
		this.prevVector = null;
		@Pc(129) byte[] samples = this.samples;
		this.samples = null;
		return new PcmSound(this.rate, samples, this.start, this.end, this.aBoolean309);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class VorbisCodebook {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
	private static int lookup1Values(@OriginalArg(0) int entries, @OriginalArg(1) int dimensions) {
		@Pc(10) int returnValue;
		for (returnValue = (int) Math.pow(entries, 1.0D / (double) dimensions) + 1; IntUtils.pow(returnValue, dimensions) > entries; returnValue--) {
		}
		return returnValue;
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
	private int[] entryTree;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	public final int dimensions;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	private final int entries;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
	private final int[] lengths;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
	private int[] multiplicands;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "[[F")
	private float[][] valueVector;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public VorbisCodebook() {
		VorbisSound.readBits(24);
		this.dimensions = VorbisSound.readBits(16);
		this.entries = VorbisSound.readBits(24);
		this.lengths = new int[this.entries];
		@Pc(23) boolean ordered = VorbisSound.readBit() != 0;
		if (ordered) {
			@Pc(27) int i = 0;
			@Pc(32) int length = VorbisSound.readBits(5) + 1;
			while (i < this.entries) {
				@Pc(44) int n = VorbisSound.readBits(IntUtils.bitCount(this.entries - i));
				for (@Pc(46) int j = 0; j < n; j++) {
					this.lengths[i++] = length;
				}
				length++;
			}
		} else {
			@Pc(66) boolean sparse = VorbisSound.readBit() != 0;
			for (@Pc(68) int i = 0; i < this.entries; i++) {
				if (sparse && VorbisSound.readBit() == 0) {
					this.lengths[i] = 0;
				} else {
					this.lengths[i] = VorbisSound.readBits(5) + 1;
				}
			}
		}
		this.createEntryTree();
		@Pc(97) int lookupType = VorbisSound.readBits(4);
		if (lookupType > 0) {
			@Pc(103) float minimumValue = VorbisSound.float32Unpack(VorbisSound.readBits(32));
			@Pc(107) float deltaValue = VorbisSound.float32Unpack(VorbisSound.readBits(32));
			@Pc(112) int valueBits = VorbisSound.readBits(4) + 1;
			@Pc(118) boolean sequenceP = VorbisSound.readBit() != 0;
			@Pc(127) int lookupValues;
			if (lookupType == 1) {
				lookupValues = lookup1Values(this.entries, this.dimensions);
			} else {
				lookupValues = this.entries * this.dimensions;
			}
			this.multiplicands = new int[lookupValues];
			for (@Pc(140) int i = 0; i < lookupValues; i++) {
				this.multiplicands[i] = VorbisSound.readBits(valueBits);
			}
			this.valueVector = new float[this.entries][this.dimensions];
			if (lookupType == 1) {
				for (@Pc(163) int i = 0; i < this.entries; i++) {
					@Pc(169) float last = 0.0F;
					@Pc(171) int indexDivisor = 1;
					for (@Pc(173) int j = 0; j < this.dimensions; j++) {
						@Pc(183) int multiplicandOffset = i / indexDivisor % lookupValues;
						@Pc(195) float value = (float) this.multiplicands[multiplicandOffset] * deltaValue + minimumValue + last;
						this.valueVector[i][j] = value;
						if (sequenceP) {
							last = value;
						}
						indexDivisor *= lookupValues;
					}
				}
			} else {
				for (@Pc(217) int i = 0; i < this.entries; i++) {
					@Pc(223) float last = 0.0F;
					@Pc(228) int multiplicandOffset = i * this.dimensions;
					for (@Pc(230) int j = 0; j < this.dimensions; j++) {
						@Pc(246) float value = (float) this.multiplicands[multiplicandOffset] * deltaValue + minimumValue + last;
						this.valueVector[i][j] = value;
						if (sequenceP) {
							last = value;
						}
						multiplicandOffset++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()[F")
	public final float[] decodeVq() {
		return this.valueVector[this.decodeScalar()];
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()V")
	private void createEntryTree() {
		@Pc(3) int[] codewords = new int[this.entries];
		@Pc(6) int[] nextCodewords = new int[33];
		for (@Pc(8) int i = 0; i < this.entries; i++) {
			@Pc(17) int length = this.lengths[i];
			if (length != 0) {
				@Pc(26) int bit = 0x1 << 32 - length;
				@Pc(30) int codeword = nextCodewords[length];
				codewords[i] = codeword;
				@Pc(44) int nextCodeword;
				if ((codeword & bit) == 0) {
					nextCodeword = codeword | bit;
					for (@Pc(53) int j = length - 1; j >= 1; j--) {
						@Pc(60) int nextCodeword2 = nextCodewords[j];
						if (nextCodeword2 != codeword) {
							break;
						}
						@Pc(69) int bit2 = 0x1 << 32 - j;
						if ((nextCodeword2 & bit2) != 0) {
							nextCodewords[j] = nextCodewords[j - 1];
							break;
						}
						nextCodewords[j] = nextCodeword2 | bit2;
					}
				} else {
					nextCodeword = nextCodewords[length - 1];
				}
				nextCodewords[length] = nextCodeword;
				for (@Pc(98) int j = length + 1; j <= 32; j++) {
					@Pc(105) int nextCodeword2 = nextCodewords[j];
					if (nextCodeword2 == codeword) {
						nextCodewords[j] = nextCodeword;
					}
				}
			}
		}
		this.entryTree = new int[8];
		@Pc(122) int nextNode = 0;
		for (@Pc(124) int i = 0; i < this.entries; i++) {
			@Pc(133) int length = this.lengths[i];
			if (length != 0) {
				@Pc(140) int codeword = codewords[i];
				@Pc(142) int node = 0;
				for (@Pc(144) int j = 0; j < length; j++) {
					@Pc(151) int bit = Integer.MIN_VALUE >>> j;
					if ((codeword & bit) == 0) {
						node++;
					} else {
						if (this.entryTree[node] == 0) {
							this.entryTree[node] = nextNode;
						}
						node = this.entryTree[node];
					}
					if (node >= this.entryTree.length) {
						@Pc(184) int[] newTree = new int[this.entryTree.length * 2];
						for (@Pc(186) int k = 0; k < this.entryTree.length; k++) {
							newTree[k] = this.entryTree[k];
						}
						this.entryTree = newTree;
					}
				}
				this.entryTree[node] = ~i;
				if (node >= nextNode) {
					nextNode = node + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()I")
	public final int decodeScalar() {
		@Pc(1) int node;
		for (node = 0; this.entryTree[node] >= 0; node = VorbisSound.readBit() == 0 ? node + 1 : this.entryTree[node]) {
		}
		return ~this.entryTree[node];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class VorbisResidue {

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	private final int type = VorbisSound.readBits(16);

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	private final int begin = VorbisSound.readBits(24);

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	private final int end = VorbisSound.readBits(24);

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
	private final int partitionSize = VorbisSound.readBits(24) + 1;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
	private final int classifications = VorbisSound.readBits(6) + 1;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	private final int classBook = VorbisSound.readBits(8);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "[I")
	private final int[] books;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public VorbisResidue() {
		@Pc(33) int[] cascade = new int[this.classifications];
		for (@Pc(35) int i = 0; i < this.classifications; i++) {
			@Pc(41) int highBits = 0;
			@Pc(44) int lowBits = VorbisSound.readBits(3);
			@Pc(50) boolean flag = VorbisSound.readBit() != 0;
			if (flag) {
				highBits = VorbisSound.readBits(5);
			}
			cascade[i] = highBits << 3 | lowBits;
		}
		this.books = new int[this.classifications * 8];
		for (@Pc(74) int i = 0; i < this.classifications * 8; i++) {
			this.books[i] = (cascade[i >> 3] & 0x1 << (i & 0x7)) == 0 ? -1 : VorbisSound.readBits(8);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([FIZ)V")
	public final void synthesize(@OriginalArg(0) float[] vector, @OriginalArg(1) int n, @OriginalArg(2) boolean doNotDecode) {
		for (@Pc(1) int i = 0; i < n; i++) {
			vector[i] = 0.0F;
		}
		if (doNotDecode) {
			return;
		}
		@Pc(19) int classwordsPerCodeword = VorbisSound.codebooks[this.classBook].dimensions;
		@Pc(25) int nToRead = this.end - this.begin;
		@Pc(30) int partitionsToRead = nToRead / this.partitionSize;
		@Pc(33) int[] classifications = new int[partitionsToRead];
		for (@Pc(35) int pass = 0; pass < 8; pass++) {
			@Pc(40) int partitionCount = 0;
			while (partitionCount < partitionsToRead) {
				if (pass == 0) {
					@Pc(51) int temp = VorbisSound.codebooks[this.classBook].decodeScalar();
					for (@Pc(55) int j = classwordsPerCodeword - 1; j >= 0; j--) {
						if (partitionCount + j < partitionsToRead) {
							classifications[partitionCount + j] = temp % this.classifications;
						}
						temp /= this.classifications;
					}
				}
				for (@Pc(80) int i = 0; i < classwordsPerCodeword; i++) {
					@Pc(87) int vqClass = classifications[partitionCount];
					@Pc(96) int vqBook = this.books[vqClass * 8 + pass];
					if (vqBook >= 0) {
						@Pc(106) int off = this.begin + partitionCount * this.partitionSize;
						@Pc(110) VorbisCodebook codebook = VorbisSound.codebooks[vqBook];
						if (this.type == 0) {
							@Pc(119) int step = this.partitionSize / codebook.dimensions;
							for (@Pc(121) int j = 0; j < step; j++) {
								@Pc(127) float[] entryTemp = codebook.decodeVq();
								for (@Pc(129) int k = 0; k < codebook.dimensions; k++) {
									vector[off + j + k * step] += entryTemp[k];
								}
							}
						} else {
							@Pc(155) int j = 0;
							while (j < this.partitionSize) {
								@Pc(162) float[] entryTemp = codebook.decodeVq();
								for (@Pc(164) int k = 0; k < codebook.dimensions; k++) {
									vector[off + j] += entryTemp[k];
									j++;
								}
							}
						}
					}
					partitionCount++;
					if (partitionCount >= partitionsToRead) {
						break;
					}
				}
			}
		}
	}
}

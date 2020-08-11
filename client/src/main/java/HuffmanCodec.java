import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class HuffmanCodec {

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "[B")
	private final byte[] bits;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "[I")
	private int[] symbolTree;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
	private final int[] codewords;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "([B)V")
	public HuffmanCodec(@OriginalArg(0) byte[] bits) {
		@Pc(6) int symbols = bits.length;
		this.bits = bits;
		this.symbolTree = new int[8];
		@Pc(15) int nextNode = 0;
		@Pc(18) int[] nextCodewords = new int[33];
		this.codewords = new int[symbols];
		for (@Pc(24) int symbol = 0; symbol < symbols; symbol++) {
			@Pc(31) byte codewordBits = bits[symbol];
			if (codewordBits != 0) {
				@Pc(39) int bit = 0x1 << 32 - codewordBits;
				@Pc(43) int codeword = nextCodewords[codewordBits];
				this.codewords[symbol] = codeword;
				@Pc(59) int nextCodeword;
				if ((bit & codeword) == 0) {
					for (@Pc(65) int i = codewordBits - 1; i >= 1; i--) {
						@Pc(72) int nextCodeword2 = nextCodewords[i];
						if (codeword != nextCodeword2) {
							break;
						}
						@Pc(85) int bit2 = 0x1 << 32 - i;
						if ((nextCodeword2 & bit2) != 0) {
							nextCodewords[i] = nextCodewords[i - 1];
							break;
						}
						nextCodewords[i] = nextCodeword2 | bit2;
					}
					nextCodeword = codeword | bit;
				} else {
					nextCodeword = nextCodewords[codewordBits - 1];
				}
				nextCodewords[codewordBits] = nextCodeword;
				for (@Pc(123) int i = codewordBits + 1; i <= 32; i++) {
					if (codeword == nextCodewords[i]) {
						nextCodewords[i] = nextCodeword;
					}
				}
				@Pc(147) int node = 0;
				for (@Pc(149) int i = 0; i < codewordBits; i++) {
					@Pc(156) int bit2 = Integer.MIN_VALUE >>> i;
					if ((codeword & bit2) == 0) {
						node++;
					} else {
						if (this.symbolTree[node] == 0) {
							this.symbolTree[node] = nextNode;
						}
						node = this.symbolTree[node];
					}
					if (this.symbolTree.length <= node) {
						@Pc(197) int[] newSymbolTree = new int[this.symbolTree.length * 2];
						for (@Pc(199) int j = 0; j < this.symbolTree.length; j++) {
							newSymbolTree[j] = this.symbolTree[j];
						}
						this.symbolTree = newSymbolTree;
					}
				}
				if (node >= nextNode) {
					nextNode = node + 1;
				}
				this.symbolTree[node] = ~symbol;
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[B[BI)I")
	public final int encode(@OriginalArg(4) byte[] src, @OriginalArg(1) int srcOff, @OriginalArg(3) byte[] dest, @OriginalArg(0) int destOff, @OriginalArg(5) int len) {
		@Pc(19) int prevCodeword = 0;
		@Pc(23) int pos = destOff << 3;
		while (srcOff < len) {
			@Pc(32) int symbol = src[srcOff] & 0xFF;
			@Pc(37) int codeword = this.codewords[symbol];
			@Pc(42) byte codewordBits = this.bits[symbol];
			if (codewordBits == 0) {
				throw new RuntimeException("No codeword for data value " + symbol);
			}
			@Pc(64) int bytePos = pos >> 3;
			@Pc(68) int bitPos = pos & 0x7;
			pos += codewordBits;
			@Pc(79) int maskedPrevCodeword = prevCodeword & -bitPos >> 31;
			@Pc(89) int endBytePos = bytePos + (codewordBits + bitPos - 1 >> 3);
			bitPos += 24;
			dest[bytePos] = (byte) (prevCodeword = maskedPrevCodeword | codeword >>> bitPos);
			if (endBytePos > bytePos) {
				@Pc(109) int bytePos2 = bytePos + 1;
				@Pc(110) int bitPos2 = bitPos - 8;
				dest[bytePos2] = (byte) (prevCodeword = codeword >>> bitPos2);
				if (endBytePos > bytePos2) {
					@Pc(129) int bytePos3 = bytePos2 + 1;
					@Pc(130) int bitPos3 = bitPos2 - 8;
					dest[bytePos3] = (byte) (prevCodeword = codeword >>> bitPos3);
					if (endBytePos > bytePos3) {
						@Pc(149) int bytePos4 = bytePos3 + 1;
						@Pc(150) int bitPos4 = bitPos3 - 8;
						dest[bytePos4] = (byte) (prevCodeword = codeword >>> bitPos4);
						if (bytePos4 < endBytePos) {
							@Pc(169) int bitPos5 = bitPos4 - 8;
							@Pc(170) int bytePos5 = bytePos4 + 1;
							dest[bytePos5] = (byte) (prevCodeword = codeword << -bitPos5);
						}
					}
				}
			}
			srcOff++;
		}
		return (pos + 7 >> 3) - destOff;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(III[B[BI)I")
	public final int decode(@OriginalArg(3) byte[] src, @OriginalArg(1) int srcOff, @OriginalArg(4) byte[] dest, @OriginalArg(0) int destOff, @OriginalArg(5) int len) {
		if (len == 0) {
			return 0;
		}
		@Pc(23) int node = 0;
		@Pc(25) int srcPos = srcOff;
		while (true) {
			@Pc(29) byte b = src[srcPos];
			@Pc(36) int node2;
			if (b < 0) {
				node2 = this.symbolTree[node];
			} else {
				node2 = node + 1;
			}
			@Pc(46) int node3;
			if ((node3 = this.symbolTree[node2]) < 0) {
				dest[destOff++] = (byte) ~node3;
				if (destOff >= len) {
					break;
				}
				node2 = 0;
			}
			@Pc(76) int node4;
			if ((b & 0x40) == 0) {
				node4 = node2 + 1;
			} else {
				node4 = this.symbolTree[node2];
			}
			if ((node3 = this.symbolTree[node4]) < 0) {
				dest[destOff++] = (byte) ~node3;
				if (destOff >= len) {
					break;
				}
				node4 = 0;
			}
			@Pc(121) int node5;
			if ((b & 0x20) == 0) {
				node5 = node4 + 1;
			} else {
				node5 = this.symbolTree[node4];
			}
			if ((node3 = this.symbolTree[node5]) < 0) {
				dest[destOff++] = (byte) ~node3;
				if (len <= destOff) {
					break;
				}
				node5 = 0;
			}
			@Pc(156) int node6;
			if ((b & 0x10) == 0) {
				node6 = node5 + 1;
			} else {
				node6 = this.symbolTree[node5];
			}
			if ((node3 = this.symbolTree[node6]) < 0) {
				dest[destOff++] = (byte) ~node3;
				if (len <= destOff) {
					break;
				}
				node6 = 0;
			}
			@Pc(199) int node7;
			if ((b & 0x8) == 0) {
				node7 = node6 + 1;
			} else {
				node7 = this.symbolTree[node6];
			}
			if ((node3 = this.symbolTree[node7]) < 0) {
				dest[destOff++] = (byte) ~node3;
				if (len <= destOff) {
					break;
				}
				node7 = 0;
			}
			@Pc(235) int node8;
			if ((b & 0x4) == 0) {
				node8 = node7 + 1;
			} else {
				node8 = this.symbolTree[node7];
			}
			if ((node3 = this.symbolTree[node8]) < 0) {
				dest[destOff++] = (byte) ~node3;
				if (len <= destOff) {
					break;
				}
				node8 = 0;
			}
			@Pc(270) int node9;
			if ((b & 0x2) == 0) {
				node9 = node8 + 1;
			} else {
				node9 = this.symbolTree[node8];
			}
			if ((node3 = this.symbolTree[node9]) < 0) {
				dest[destOff++] = (byte) ~node3;
				if (len <= destOff) {
					break;
				}
				node9 = 0;
			}
			if ((b & 0x1) == 0) {
				node = node9 + 1;
			} else {
				node = this.symbolTree[node9];
			}
			if ((node3 = this.symbolTree[node]) < 0) {
				dest[destOff++] = (byte) ~node3;
				if (len <= destOff) {
					break;
				}
				node = 0;
			}
			srcPos++;
		}
		return srcPos + 1 - srcOff;
	}
}

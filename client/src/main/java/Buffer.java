import java.math.BigInteger;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public class Buffer extends Node {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([BIII)I")
	private static int crc32(@OriginalArg(0) byte[] bytes, @OriginalArg(3) int off, @OriginalArg(1) int len) {
		@Pc(7) int crc = -1;
		for (@Pc(9) int i = off; i < len; i++) {
			crc = Class169.CRC32_TABLE[(crc ^ bytes[i]) & 0xFF] ^ crc >>> 8;
		}
		return ~crc;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[B)I")
	public static int crc32(@OriginalArg(2) byte[] bytes, @OriginalArg(0) int len) {
		return crc32(bytes, 0, len);
	}

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "[B")
	public byte[] bytes;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
	public int position;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V")
	public Buffer(@OriginalArg(0) int size) {
		this.bytes = BufferPool.allocate(size);
		this.position = 0;
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B)V")
	public Buffer(@OriginalArg(0) byte[] bytes) {
		this.bytes = bytes;
		this.position = 0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void writeString(@OriginalArg(0) String value) {
		@Pc(7) int index = value.indexOf(0);
		if (index >= 0) {
			throw new IllegalArgumentException("NUL character at " + index + " - cannot pjstr");
		}
		this.position += Cp1252Charset.encodeString(value, value.length(), this.bytes, this.position);
		this.bytes[this.position++] = 0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)I")
	public final int readShort() {
		this.position += 2;
		@Pc(37) int value = ((this.bytes[this.position - 2] & 0xFF) << 8) + (this.bytes[this.position - 1] & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public final void writeUnsignedShortSmart(@OriginalArg(1) int value) {
		if (value >= 0 && value < 128) {
			this.writeByte(value);
		} else if (value >= 0 && value < 32768) {
			this.writeShort(value + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)V")
	public final void writeByteC(@OriginalArg(0) int value) {
		this.bytes[this.position++] = (byte) -value;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)I")
	public final int readUnsignedShortSmart() {
		@Pc(14) int peek = this.bytes[this.position] & 0xFF;
		return peek < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
	public final void writeVarInt(@OriginalArg(0) int value) {
		if ((value & 0xFFFFFF80) != 0) {
			if ((value & 0xFFFFC000) != 0) {
				if ((value & 0xFFE00000) != 0) {
					if ((value & 0xF0000000) != 0) {
						this.writeByte(value >>> 28 | 0x80);
					}
					this.writeByte(value >>> 21 | 0x80);
				}
				this.writeByte(value >>> 14 | 0x80);
			}
			this.writeByte(value >>> 7 | 0x80);
		}
		this.writeByte(value & 0x7F);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V")
	public final void writeByte(@OriginalArg(0) int value) {
		this.bytes[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IJ)V")
	public final void writeLong(@OriginalArg(1) long value) {
		this.bytes[this.position++] = (byte) (value >> 56);
		this.bytes[this.position++] = (byte) (value >> 48);
		this.bytes[this.position++] = (byte) (value >> 40);
		this.bytes[this.position++] = (byte) (value >> 32);
		this.bytes[this.position++] = (byte) (value >> 24);
		this.bytes[this.position++] = (byte) (value >> 16);
		this.bytes[this.position++] = (byte) (value >> 8);
		this.bytes[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)I")
	public final int readIntAlt3Reverse() {
		this.position += 4;
		return ((this.bytes[this.position - 1] & 0xFF) << 16) + ((this.bytes[this.position - 2] & 0xFF) << 24) + ((this.bytes[this.position - 4] & 0xFF) << 8) + (this.bytes[this.position - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(BI)V")
	public final void writeIntAlt3(@OriginalArg(1) int value) {
		this.bytes[this.position++] = (byte) (value >> 16);
		this.bytes[this.position++] = (byte) (value >> 24);
		this.bytes[this.position++] = (byte) value;
		this.bytes[this.position++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)I")
	public final int readShortLE() {
		this.position += 2;
		@Pc(36) int value = ((this.bytes[this.position - 1] & 0xFF) << 8) + (this.bytes[this.position - 2] & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)V")
	public final void writeByteS(@OriginalArg(1) int value) {
		this.bytes[this.position++] = (byte) (128 - value);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)I")
	public final int readIntAlt3() {
		this.position += 4;
		return (this.bytes[this.position - 2] & 0xFF) + ((this.bytes[this.position - 4] & 0xFF) << 16) + ((this.bytes[this.position - 3] & 0xFF) << 24) + ((this.bytes[this.position - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)I")
	public final int readUnsignedShortLEA() {
		this.position += 2;
		return ((this.bytes[this.position - 1] & 0xFF) << 8) + (this.bytes[this.position - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)I")
	public final int readUnsignedByteC() {
		return -this.bytes[this.position++] & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(B)I")
	public final int method4590() {
		this.position += 3;
		return ((this.bytes[this.position - 2] & 0xFF) << 16) + ((this.bytes[this.position - 3] & 0xFF) << 8) + (this.bytes[this.position - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)V")
	public final void writeIntAlt3Reverse(@OriginalArg(1) int value) {
		this.bytes[this.position++] = (byte) (value >> 8);
		this.bytes[this.position++] = (byte) value;
		this.bytes[this.position++] = (byte) (value >> 24);
		this.bytes[this.position++] = (byte) (value >> 16);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String readString() {
		@Pc(6) int off = this.position;
		while (this.bytes[this.position++] != 0) {
		}
		return Cp1252Charset.decodeString(this.bytes, off, this.position - off - 1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BIB)V")
	public final void writeBytes(@OriginalArg(1) byte[] bytes, @OriginalArg(2) int len) {
		for (@Pc(7) int i = 0; i < len; i++) {
			this.bytes[this.position++] = bytes[i];
		}
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)I")
	public final int readInt() {
		this.position += 4;
		return (this.bytes[this.position - 1] & 0xFF) + ((this.bytes[this.position - 4] & 0xFF) << 24) + ((this.bytes[this.position - 3] & 0xFF) << 16) + ((this.bytes[this.position - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(II)J")
	public final long readVarLong(@OriginalArg(1) int bytes) {
		bytes--;
		if (bytes < 0 || bytes > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(23) long value = 0L;
		for (@Pc(27) int shift = bytes * 8; shift >= 0; shift -= 8) {
			value |= ((long) this.bytes[this.position++] & 0xFFL) << shift;
		}
		return value;
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(B)I")
	public final int readShortSmart() {
		@Pc(11) int peek = this.bytes[this.position] & 0xFF;
		return peek < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)I")
	public final int readUnsignedMultiSmart() {
		@Pc(7) int total = 0;
		@Pc(11) int value;
		for (value = this.readUnsignedShortSmart(); value == 32767; value = this.readUnsignedShortSmart()) {
			total += 32767;
		}
		return total + value;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V")
	public final void writeIntLE(@OriginalArg(0) int value) {
		this.bytes[this.position++] = (byte) value;
		this.bytes[this.position++] = (byte) (value >> 8);
		this.bytes[this.position++] = (byte) (value >> 16);
		this.bytes[this.position++] = (byte) (value >> 24);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[BI)V")
	public final void readBytesA(@OriginalArg(2) byte[] bytes, @OriginalArg(3) int len) {
		for (@Pc(9) int i = 0; i < len; i++) {
			bytes[i] = (byte) (this.bytes[this.position++] - 128);
		}
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(I)Z")
	public final boolean verifyCrc32() {
		this.position -= 4;
		@Pc(17) int actual = crc32(this.bytes, 0, this.position);
		@Pc(21) int expected = this.readInt();
		return actual == expected;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(BI)V")
	public final void writeMedium(@OriginalArg(1) int value) {
		this.bytes[this.position++] = (byte) (value >> 16);
		this.bytes[this.position++] = (byte) (value >> 8);
		this.bytes[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(BI)V")
	public final void writeShortLE(@OriginalArg(1) int value) {
		this.bytes[this.position++] = (byte) value;
		this.bytes[this.position++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZF)V")
	public final void writeFloat(@OriginalArg(1) float value) {
		@Pc(2) int bits = Float.floatToRawIntBits(value);
		this.bytes[this.position++] = (byte) (bits >> 24);
		this.bytes[this.position++] = (byte) (bits >> 16);
		this.bytes[this.position++] = (byte) (bits >> 8);
		this.bytes[this.position++] = (byte) bits;
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(I)I")
	public final int readUnsignedByteS() {
		return 128 - this.bytes[this.position++] & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(JZI)V")
	public final void writeVarLong(@OriginalArg(0) long value, @OriginalArg(2) int bytes) {
		bytes--;
		if (bytes < 0 || bytes > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int shift = bytes * 8; shift >= 0; shift -= 8) {
			this.bytes[this.position++] = (byte) (value >> shift);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([IIZI)V")
	public final void xteaDecrypt(@OriginalArg(0) int[] key, @OriginalArg(3) int len) {
		@Pc(11) int blocks = (len - 5) / 8;
		@Pc(14) int position = this.position;
		this.position = 5;
		for (@Pc(24) int i = 0; i < blocks; i++) {
			@Pc(31) int v0 = this.readInt();
			@Pc(35) int v1 = this.readInt();
			@Pc(37) int sum = 0xC6EF3720;
			@Pc(41) int rounds = 32;
			while (rounds-- > 0) {
				v1 -= (v0 << 4 ^ v0 >>> 5) + v0 ^ key[sum >>> 11 & 0x3] + sum;
				sum -= 0x9E3779B9;
				v0 -= (v1 << 4 ^ v1 >>> 5) + v1 ^ sum + key[sum & 0x3];
			}
			this.position -= 8;
			this.writeInt(v0);
			this.writeInt(v1);
		}
		this.position = position;
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(B)B")
	public final byte readByteS() {
		return (byte) (128 - this.bytes[this.position++]);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)I")
	public final int readVarInt() {
		@Pc(16) byte b = this.bytes[this.position++];
		@Pc(22) int value = 0;
		while (b < 0) {
			value = (b & 0x7F | value) << 7;
			b = this.bytes[this.position++];
		}
		return value | b;
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(II)V")
	public final void writeIntLength(@OriginalArg(0) int len) {
		this.bytes[this.position - len - 4] = (byte) (len >> 24);
		this.bytes[this.position - len - 3] = (byte) (len >> 16);
		this.bytes[this.position - len - 2] = (byte) (len >> 8);
		this.bytes[this.position - len - 1] = (byte) len;
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(II)V")
	public final void writeByteA(@OriginalArg(0) int value) {
		this.bytes[this.position++] = (byte) (value + 128);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[B)V")
	public final void readBytes(@OriginalArg(3) byte[] bytes, @OriginalArg(2) int len) {
		for (@Pc(7) int i = 0; i < len; i++) {
			bytes[i] = this.bytes[this.position++];
		}
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(II)V")
	public final void writeShortLE2(@OriginalArg(1) int value) {
		this.bytes[this.position++] = (byte) value;
		this.bytes[this.position++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(II)V")
	public final void writeShortA(@OriginalArg(1) int arg0) {
		this.bytes[this.position++] = (byte) (arg0 >> 8);
		this.bytes[this.position++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(I)B")
	public final byte readByteC() {
		return (byte) -this.bytes[this.position++];
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(B)I")
	public final int readUnsignedShort() {
		this.position += 2;
		return (this.bytes[this.position - 1] & 0xFF) + ((this.bytes[this.position - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
	public final void writeInt(@OriginalArg(1) int value) {
		this.bytes[this.position++] = (byte) (value >> 24);
		this.bytes[this.position++] = (byte) (value >> 16);
		this.bytes[this.position++] = (byte) (value >> 8);
		this.bytes[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(B)I")
	public final int readUnsignedMedium() {
		this.position += 3;
		return (this.bytes[this.position - 1] & 0xFF) + ((this.bytes[this.position - 3] & 0xFF) << 16) + ((this.bytes[this.position - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(Z)I")
	public final int readIntLE() {
		this.position += 4;
		return (this.bytes[this.position - 4] & 0xFF) + ((this.bytes[this.position - 1] & 0xFF) << 24) + ((this.bytes[this.position - 2] & 0xFF) << 16) + ((this.bytes[this.position - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(II)I")
	public final int writeCrc32(@OriginalArg(1) int off) {
		@Pc(11) int checksum = crc32(this.bytes, off, this.position);
		this.writeInt(checksum);
		return checksum;
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(B)J")
	public final long readLong() {
		@Pc(17) long high = (long) this.readInt() & 0xFFFFFFFFL;
		@Pc(26) long low = (long) this.readInt() & 0xFFFFFFFFL;
		return (high << 32) + low;
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "(I)I")
	public final int readUnsignedByteA() {
		return this.bytes[this.position++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(BI)V")
	public final void writeIntLE2(@OriginalArg(1) int value) {
		this.bytes[this.position++] = (byte) value;
		this.bytes[this.position++] = (byte) (value >> 8);
		this.bytes[this.position++] = (byte) (value >> 16);
		this.bytes[this.position++] = (byte) (value >> 24);
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(B)Ljava/lang/String;")
	public final String readStringFast() {
		if (this.bytes[this.position] == 0) {
			this.position++;
			return null;
		} else {
			return this.readString();
		}
	}

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "(I)I")
	public final int readShortA() {
		this.position += 2;
		@Pc(29) int value = (this.bytes[this.position - 1] - 128 & 0xFF) + ((this.bytes[this.position - 2] & 0xFF) << 8);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z[I)V")
	public final void xteaEncrypt(@OriginalArg(1) int[] key) {
		@Pc(10) int position = this.position / 8;
		this.position = 0;
		for (@Pc(15) int i = 0; i < position; i++) {
			@Pc(22) int v0 = this.readInt();
			@Pc(26) int v1 = this.readInt();
			@Pc(28) int sum = 0;
			@Pc(32) int rounds = 32;
			while (rounds-- > 0) {
				v0 += v1 + (v1 << 4 ^ v1 >>> 5) ^ sum + key[sum & 0x3];
				sum += 0x9E3779B9;
				v1 += sum + key[sum >>> 11 & 0xAF400003] ^ (v0 >>> 5 ^ v0 << 4) + v0;
			}
			this.position -= 8;
			this.writeInt(v0);
			this.writeInt(v1);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void rsaEncrypt(@OriginalArg(1) BigInteger exponent, @OriginalArg(0) BigInteger modulus) {
		@Pc(6) int len = this.position;
		this.position = 0;
		@Pc(12) byte[] plaintextBytes = new byte[len];
		this.readBytes(plaintextBytes, len);
		@Pc(23) BigInteger plaintext = new BigInteger(plaintextBytes);
		@Pc(28) BigInteger ciphertext = plaintext.modPow(exponent, modulus);
		@Pc(31) byte[] ciphertextBytes = ciphertext.toByteArray();
		this.position = 0;
		this.writeByte(ciphertextBytes.length);
		this.writeBytes(ciphertextBytes, ciphertextBytes.length);
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "(B)I")
	public final int readUnsignedByte() {
		return this.bytes[this.position++] & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "(B)I")
	public final int readUnsignedShortA() {
		this.position += 2;
		return ((this.bytes[this.position - 2] & 0xFF) << 8) + (this.bytes[this.position - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(II)V")
	public final void writeShort(@OriginalArg(1) int value) {
		this.bytes[this.position++] = (byte) (value >> 8);
		this.bytes[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FI)V")
	public final void writeFloatLE(@OriginalArg(0) float value) {
		@Pc(13) int bits = Float.floatToRawIntBits(value);
		this.bytes[this.position++] = (byte) bits;
		this.bytes[this.position++] = (byte) (bits >> 8);
		this.bytes[this.position++] = (byte) (bits >> 16);
		this.bytes[this.position++] = (byte) (bits >> 24);
	}

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String readVersionedString() {
		@Pc(10) byte version = this.bytes[this.position++];
		if (version != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(33) int off = this.position;
		while (this.bytes[this.position++] != 0) {
		}
		return Cp1252Charset.decodeString(this.bytes, off, this.position - off - 1);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II[BI)V")
	public final void readBytesReverse(@OriginalArg(2) byte[] bytes, @OriginalArg(1) int len) {
		for (@Pc(11) int i = len - 1; i >= 0; i--) {
			bytes[i] = this.bytes[this.position++];
		}
	}

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "(B)I")
	public final int readUnsignedShortLE() {
		this.position += 2;
		return ((this.bytes[this.position - 1] & 0xFF) << 8) + (this.bytes[this.position - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IB)V")
	public final void writeShortLEA(@OriginalArg(0) int value) {
		this.bytes[this.position++] = (byte) (value + 128);
		this.bytes[this.position++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "(I)B")
	public final byte readByte() {
		return this.bytes[this.position++];
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(BI)V")
	public final void writeByteLength(@OriginalArg(1) int len) {
		this.bytes[this.position - len - 1] = (byte) len;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!e")
public final class Buffer extends Node {

	@OriginalMember(owner = "unpackclass!e", name = "f", descriptor = "[I")
	private static final int[] CRC32_TABLE = new int[256];

	@OriginalMember(owner = "unpackclass!e", name = "g", descriptor = "[J")
	private static final long[] CRC64_TABLE = new long[256];

	@OriginalMember(owner = "unpackclass!e", name = "d", descriptor = "[B")
	public byte[] bytes;

	@OriginalMember(owner = "unpackclass!e", name = "e", descriptor = "I")
	public int position;

	static {
		for (@Pc(4) int i = 0; i < 256; i++) {
			@Pc(7) int crc = i;
			for (@Pc(9) int j = 0; j < 8; j++) {
				if ((crc & 0x1) == 1) {
					crc = crc >>> 1 ^ 0xEDB88320;
				} else {
					crc >>>= 1;
				}
			}
			CRC32_TABLE[i] = crc;
		}

		for (@Pc(43) int i = 0; i < 256; i++) {
			@Pc(47) long crc = i;
			for (@Pc(49) int j = 0; j < 8; j++) {
				if ((crc & 0x1L) == 1L) {
					crc = crc >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					crc >>>= 1;
				}
			}
			CRC64_TABLE[i] = crc;
		}
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "([BII)I")
	private static int crc32Internal(@OriginalArg(0) byte[] bytes, @OriginalArg(2) int len) {
		@Pc(3) int crc = -1;
		for (@Pc(5) int i = 0; i < len; i++) {
			crc = crc >>> 8 ^ CRC32_TABLE[(crc ^ bytes[i]) & 0xFF];
		}
		return ~crc;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "([BI)I")
	public static int crc32(@OriginalArg(0) byte[] bytes, @OriginalArg(1) int len) {
		return crc32Internal(bytes, len);
	}

	@OriginalMember(owner = "unpackclass!e", name = "<init>", descriptor = "(I)V")
	public Buffer(@OriginalArg(0) int len) {
		this.bytes = BufferPool.allocate(len);
		this.position = 0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "<init>", descriptor = "([B)V")
	public Buffer(@OriginalArg(0) byte[] bytes) {
		this.bytes = bytes;
		this.position = 0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "(I)V")
	public final void writeByte(@OriginalArg(0) int value) {
		this.bytes[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "unpackclass!e", name = "b", descriptor = "(I)V")
	public final void writeShort(@OriginalArg(0) int value) {
		this.bytes[this.position++] = (byte) (value >> 8);
		this.bytes[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "unpackclass!e", name = "c", descriptor = "(I)V")
	public final void writeInt(@OriginalArg(0) int value) {
		this.bytes[this.position++] = (byte) (value >> 24);
		this.bytes[this.position++] = (byte) (value >> 16);
		this.bytes[this.position++] = (byte) (value >> 8);
		this.bytes[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "(J)V")
	public final void writeLong(@OriginalArg(0) long value) {
		this.bytes[this.position++] = (byte) (value >> 56);
		this.bytes[this.position++] = (byte) (value >> 48);
		this.bytes[this.position++] = (byte) (value >> 40);
		this.bytes[this.position++] = (byte) (value >> 32);
		this.bytes[this.position++] = (byte) (value >> 24);
		this.bytes[this.position++] = (byte) (value >> 16);
		this.bytes[this.position++] = (byte) (value >> 8);
		this.bytes[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "unpackclass!e", name = "b", descriptor = "([BII)V")
	public final void writeBytes(@OriginalArg(0) byte[] bytes, @OriginalArg(2) int len) {
		for (@Pc(3) int i = 0; i < len; i++) {
			this.bytes[this.position++] = bytes[i];
		}
	}

	@OriginalMember(owner = "unpackclass!e", name = "c", descriptor = "()I")
	public final int readUnsignedByte() {
		return this.bytes[this.position++] & 0xFF;
	}

	@OriginalMember(owner = "unpackclass!e", name = "d", descriptor = "()I")
	public final int readUnsignedShort() {
		this.position += 2;
		return ((this.bytes[this.position - 2] & 0xFF) << 8) + (this.bytes[this.position - 1] & 0xFF);
	}

	@OriginalMember(owner = "unpackclass!e", name = "e", descriptor = "()I")
	public final int readShort() {
		this.position += 2;
		@Pc(27) int value = ((this.bytes[this.position - 2] & 0xFF) << 8) + (this.bytes[this.position - 1] & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "unpackclass!e", name = "f", descriptor = "()I")
	public final int readInt() {
		this.position += 4;
		return ((this.bytes[this.position - 4] & 0xFF) << 24) + ((this.bytes[this.position - 3] & 0xFF) << 16) + ((this.bytes[this.position - 2] & 0xFF) << 8) + (this.bytes[this.position - 1] & 0xFF);
	}

	@OriginalMember(owner = "unpackclass!e", name = "c", descriptor = "([BII)V")
	public final void readBytes(@OriginalArg(0) byte[] bytes, @OriginalArg(2) int len) {
		for (@Pc(3) int i = 0; i < len; i++) {
			bytes[i] = this.bytes[this.position++];
		}
	}

	@OriginalMember(owner = "unpackclass!e", name = "g", descriptor = "()I")
	public final int readUnsignedSmart() {
		@Pc(7) int peek = this.bytes[this.position] & 0xFF;
		return peek < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@OriginalMember(owner = "unpackclass!e", name = "h", descriptor = "()I")
	public final int readVarInt() {
		@Pc(12) byte b = this.bytes[this.position++];
		@Pc(14) int value = 0;
		while (b < 0) {
			value = (value | b & 0x7F) << 7;
			b = this.bytes[this.position++];
		}
		return value | b;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "([III)V")
	public final void xteaDecrypt(@OriginalArg(0) int[] key, @OriginalArg(2) int len) {
		@Pc(4) int oldPosition = this.position;
		this.position = 5;
		@Pc(13) int blocks = (len - 5) / 8;
		for (@Pc(15) int i = 0; i < blocks; i++) {
			@Pc(20) int v0 = this.readInt();
			@Pc(23) int v1 = this.readInt();
			@Pc(25) int sum = 0xC6EF3720;
			@Pc(29) int round = 32;
			while (round-- > 0) {
				v1 -= (v0 << 4 ^ v0 >>> 5) + v0 ^ sum + key[sum >>> 11 & 0x3];
				sum -= 0x9E3779B9;
				v0 -= (v1 << 4 ^ v1 >>> 5) + v1 ^ sum + key[sum & 0x3];
			}
			this.position -= 8;
			this.writeInt(v0);
			this.writeInt(v1);
		}
		this.position = oldPosition;
	}
}

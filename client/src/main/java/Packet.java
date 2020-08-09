import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Packet extends Buffer {

	@OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
	private static final int[] BIT_MASKS = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!wa", name = "Ob", descriptor = "Lclient!m;")
	private IsaacRandom cipher;

	@OriginalMember(owner = "client!wa", name = "Yb", descriptor = "I")
	private int bitPosition;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Packet(@OriginalArg(0) int size) {
		super(size);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([II)V")
	public final void setKey(@OriginalArg(0) int[] key) {
		this.cipher = new IsaacRandom(key);
	}

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "(I)V")
	public final void startBitAccess() {
		this.bitPosition = this.position * 8;
	}

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "(I)V")
	public final void finishBitAccess() {
		this.position = (this.bitPosition + 7) / 8;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(Z)I")
	public final int readOpcode() {
		return this.bytes[this.position++] - this.cipher.nextInt() & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[BII)V")
	public final void writeEncryptedBytes(@OriginalArg(1) byte[] bytes, @OriginalArg(2) int len) {
		for (@Pc(7) int i = 0; i < len; i++) {
			bytes[i] = (byte) (this.bytes[this.position++] - this.cipher.nextInt());
		}
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(II)V")
	public final void writeOpcode(@OriginalArg(1) int opcode) {
		this.bytes[this.position++] = (byte) (this.cipher.nextInt() + opcode);
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(II)I")
	public final int readableBits(@OriginalArg(0) int position) {
		return position * 8 - this.bitPosition;
	}

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "(II)I")
	public final int readBits(@OriginalArg(0) int bits) {
		@Pc(13) int bitPos = 8 - (this.bitPosition & 0x7);
		@Pc(18) int bytePos = this.bitPosition >> 3;
		this.bitPosition += bits;
		@Pc(26) int value = 0;
		while (bits > bitPos) {
			value += (this.bytes[bytePos++] & BIT_MASKS[bitPos]) << bits - bitPos;
			bits -= bitPos;
			bitPos = 8;
		}
		@Pc(77) int value2;
		if (bitPos == bits) {
			value2 = value + (this.bytes[bytePos] & BIT_MASKS[bitPos]);
		} else {
			value2 = value + (this.bytes[bytePos] >> bitPos - bits & BIT_MASKS[bits]);
		}
		return value2;
	}
}

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!e")
public final class Class201_Sub1 extends Class201 {

	@OriginalMember(owner = "unpackclass!e", name = "f", descriptor = "[I")
	private static final int[] anIntArray689 = new int[256];

	@OriginalMember(owner = "unpackclass!e", name = "g", descriptor = "[J")
	private static final long[] aLongArray59;

	@OriginalMember(owner = "unpackclass!e", name = "d", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "unpackclass!e", name = "e", descriptor = "I")
	public int anInt6119;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 1;
				}
			}
			anIntArray689[local4] = local7;
		}
		aLongArray59 = new long[256];
		for (@Pc(43) int local43 = 0; local43 < 256; local43++) {
			@Pc(47) long local47 = (long) local43;
			for (@Pc(49) int local49 = 0; local49 < 8; local49++) {
				if ((local47 & 0x1L) == 1L) {
					local47 = local47 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local47 >>>= 1;
				}
			}
			aLongArray59[local43] = local47;
		}
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "([BII)I")
	private static int method4907(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			local3 = local3 >>> 8 ^ anIntArray689[(local3 ^ arg0[local5]) & 0xFF];
		}
		return ~local3;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "([BI)I")
	public static int method4908(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return method4907(arg0, arg1);
	}

	@OriginalMember(owner = "unpackclass!e", name = "<init>", descriptor = "(I)V")
	public Class201_Sub1(@OriginalArg(0) int arg0) {
		this.aByteArray77 = Class200.method4902(arg0);
		this.anInt6119 = 0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "<init>", descriptor = "([B)V")
	public Class201_Sub1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray77 = arg0;
		this.anInt6119 = 0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "(I)V")
	public final void method4909(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt6119++] = (byte) arg0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "b", descriptor = "(I)V")
	public final void method4910(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt6119++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt6119++] = (byte) arg0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "c", descriptor = "(I)V")
	public final void method4911(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt6119++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt6119++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt6119++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt6119++] = (byte) arg0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "(J)V")
	public final void method4912(@OriginalArg(0) long arg0) {
		this.aByteArray77[this.anInt6119++] = (byte) (arg0 >> 56);
		this.aByteArray77[this.anInt6119++] = (byte) (arg0 >> 48);
		this.aByteArray77[this.anInt6119++] = (byte) (arg0 >> 40);
		this.aByteArray77[this.anInt6119++] = (byte) (arg0 >> 32);
		this.aByteArray77[this.anInt6119++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt6119++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt6119++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt6119++] = (byte) arg0;
	}

	@OriginalMember(owner = "unpackclass!e", name = "b", descriptor = "([BII)V")
	public final void method4913(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray77[this.anInt6119++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "unpackclass!e", name = "c", descriptor = "()I")
	public final int method4914() {
		return this.aByteArray77[this.anInt6119++] & 0xFF;
	}

	@OriginalMember(owner = "unpackclass!e", name = "d", descriptor = "()I")
	public final int method4915() {
		this.anInt6119 += 2;
		return ((this.aByteArray77[this.anInt6119 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt6119 - 1] & 0xFF);
	}

	@OriginalMember(owner = "unpackclass!e", name = "e", descriptor = "()I")
	public final int method4916() {
		this.anInt6119 += 2;
		@Pc(27) int local27 = ((this.aByteArray77[this.anInt6119 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt6119 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "unpackclass!e", name = "f", descriptor = "()I")
	public final int method4917() {
		this.anInt6119 += 4;
		return ((this.aByteArray77[this.anInt6119 - 4] & 0xFF) << 24) + ((this.aByteArray77[this.anInt6119 - 3] & 0xFF) << 16) + ((this.aByteArray77[this.anInt6119 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt6119 - 1] & 0xFF);
	}

	@OriginalMember(owner = "unpackclass!e", name = "c", descriptor = "([BII)V")
	public final void method4918(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray77[this.anInt6119++];
		}
	}

	@OriginalMember(owner = "unpackclass!e", name = "g", descriptor = "()I")
	public final int method4919() {
		@Pc(7) int local7 = this.aByteArray77[this.anInt6119] & 0xFF;
		return local7 < 128 ? this.method4914() : this.method4915() - 32768;
	}

	@OriginalMember(owner = "unpackclass!e", name = "h", descriptor = "()I")
	public final int method4920() {
		@Pc(12) byte local12 = this.aByteArray77[this.anInt6119++];
		@Pc(14) int local14 = 0;
		while (local12 < 0) {
			local14 = (local14 | local12 & 0x7F) << 7;
			local12 = this.aByteArray77[this.anInt6119++];
		}
		return local14 | local12;
	}

	@OriginalMember(owner = "unpackclass!e", name = "a", descriptor = "([III)V")
	public final void method4921(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt6119;
		this.anInt6119 = 5;
		@Pc(13) int local13 = (arg1 - 5) / 8;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(20) int local20 = this.method4917();
			@Pc(23) int local23 = this.method4917();
			@Pc(25) int local25 = -957401312;
			@Pc(29) int local29 = 32;
			while (local29-- > 0) {
				local23 -= (local20 << 4 ^ local20 >>> 5) + local20 ^ local25 + arg0[local25 >>> 11 & 0x3];
				local25 -= -1640531527;
				local20 -= (local23 << 4 ^ local23 >>> 5) + local23 ^ local25 + arg0[local25 & 0x3];
			}
			this.anInt6119 -= 8;
			this.method4911(local20);
			this.method4911(local23);
		}
		this.anInt6119 = local4;
	}
}

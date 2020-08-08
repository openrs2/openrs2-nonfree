import java.math.BigInteger;

import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public class Class4_Sub10 extends Node {

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
	public int anInt5709;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V")
	public Class4_Sub10(@OriginalArg(0) int arg0) {
		this.aByteArray71 = Static32.method4028(arg0);
		this.anInt5709 = 0;
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B)V")
	public Class4_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray71 = arg0;
		this.anInt5709 = 0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method4575(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt5709 += Static20.method1966(this.aByteArray71, arg0, arg0.length(), this.anInt5709);
		this.aByteArray71[this.anInt5709++] = 0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)I")
	public final int method4576() {
		this.anInt5709 += 2;
		@Pc(37) int local37 = ((this.aByteArray71[this.anInt5709 - 2] & 0xFF) << 8) + (this.aByteArray71[this.anInt5709 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public final void method4577(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4581(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4631(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)V")
	public final void method4578(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)I")
	public final int method4579() {
		@Pc(14) int local14 = this.aByteArray71[this.anInt5709] & 0xFF;
		return local14 >= 128 ? this.method4616() - 32768 : this.method4629();
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
	public final void method4580(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4581(arg0 >>> 28 | 0x80);
					}
					this.method4581(arg0 >>> 21 | 0x80);
				}
				this.method4581(arg0 >>> 14 | 0x80);
			}
			this.method4581(arg0 >>> 7 | 0x80);
		}
		this.method4581(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V")
	public final void method4581(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IJ)V")
	public final void method4582(@OriginalArg(1) long arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 56);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 48);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 40);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 32);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt5709++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)I")
	public final int method4583() {
		this.anInt5709 += 4;
		return ((this.aByteArray71[this.anInt5709 - 1] & 0xFF) << 16) + ((this.aByteArray71[this.anInt5709 - 2] & 0xFF) << 24) + ((this.aByteArray71[this.anInt5709 - 4] & 0xFF) << 8) + (this.aByteArray71[this.anInt5709 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(BI)V")
	public final void method4584(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt5709++] = (byte) arg0;
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)I")
	public final int method4585() {
		this.anInt5709 += 2;
		@Pc(36) int local36 = ((this.aByteArray71[this.anInt5709 - 1] & 0xFF) << 8) + (this.aByteArray71[this.anInt5709 - 2] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)V")
	public final void method4586(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)I")
	public final int method4587() {
		this.anInt5709 += 4;
		return (this.aByteArray71[this.anInt5709 - 2] & 0xFF) + ((this.aByteArray71[this.anInt5709 - 4] & 0xFF) << 16) + ((this.aByteArray71[this.anInt5709 - 3] & 0xFF) << 24) + ((this.aByteArray71[this.anInt5709 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)I")
	public final int method4588() {
		this.anInt5709 += 2;
		return ((this.aByteArray71[this.anInt5709 - 1] & 0xFF) << 8) + (this.aByteArray71[this.anInt5709 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)I")
	public final int method4589() {
		return -this.aByteArray71[this.anInt5709++] & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(B)I")
	public final int method4590() {
		this.anInt5709 += 3;
		return ((this.aByteArray71[this.anInt5709 - 2] & 0xFF) << 16) + ((this.aByteArray71[this.anInt5709 - 3] & 0xFF) << 8) + (this.aByteArray71[this.anInt5709 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)V")
	public final void method4591(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt5709++] = (byte) arg0;
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method4593() {
		@Pc(6) int local6 = this.anInt5709;
		while (this.aByteArray71[this.anInt5709++] != 0) {
		}
		return Static34.method4271(local6, this.aByteArray71, this.anInt5709 - local6 - 1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BIB)V")
	public final void method4594(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray71[this.anInt5709++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)I")
	public final int method4595() {
		this.anInt5709 += 4;
		return (this.aByteArray71[this.anInt5709 - 1] & 0xFF) + ((this.aByteArray71[this.anInt5709 - 4] & 0xFF) << 24) + ((this.aByteArray71[this.anInt5709 - 3] & 0xFF) << 16) + ((this.aByteArray71[this.anInt5709 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(II)J")
	public final long method4596(@OriginalArg(1) int arg0) {
		arg0--;
		if (arg0 < 0 || arg0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(23) long local23 = 0L;
		for (@Pc(27) int local27 = arg0 * 8; local27 >= 0; local27 -= 8) {
			local23 |= ((long) this.aByteArray71[this.anInt5709++] & 0xFFL) << local27;
		}
		return local23;
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(B)I")
	public final int method4597() {
		@Pc(11) int local11 = this.aByteArray71[this.anInt5709] & 0xFF;
		return local11 >= 128 ? this.method4616() - 49152 : this.method4629() - 64;
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)I")
	public final int method4598() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method4579(); local11 == 32767; local11 = this.method4579()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V")
	public final void method4599(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) arg0;
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[BI)V")
	public final void method4600(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			arg0[local9] = (byte) (this.aByteArray71[this.anInt5709++] - 128);
		}
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(I)Z")
	public final boolean method4601() {
		this.anInt5709 -= 4;
		@Pc(17) int local17 = Static23.method4818(this.aByteArray71, this.anInt5709, 0);
		@Pc(21) int local21 = this.method4595();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(BI)V")
	public final void method4602(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt5709++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(BI)V")
	public final void method4603(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) arg0;
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZF)V")
	public final void method4604(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray71[this.anInt5709++] = (byte) (local2 >> 24);
		this.aByteArray71[this.anInt5709++] = (byte) (local2 >> 16);
		this.aByteArray71[this.anInt5709++] = (byte) (local2 >> 8);
		this.aByteArray71[this.anInt5709++] = (byte) local2;
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(I)I")
	public final int method4605() {
		return 128 - this.aByteArray71[this.anInt5709++] & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(JZI)V")
	public final void method4606(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		arg1--;
		if (arg1 < 0 || arg1 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int local26 = arg1 * 8; local26 >= 0; local26 -= 8) {
			this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> local26);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([IIZI)V")
	public final void method4607(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(11) int local11 = (arg1 - 5) / 8;
		@Pc(14) int local14 = this.anInt5709;
		this.anInt5709 = 5;
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			@Pc(31) int local31 = this.method4595();
			@Pc(35) int local35 = this.method4595();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= (local31 << 4 ^ local31 >>> 5) + local31 ^ arg0[local37 >>> 11 & 0x3] + local37;
				local37 -= -1640531527;
				local31 -= (local35 << 4 ^ local35 >>> 5) + local35 ^ local37 + arg0[local37 & 0x3];
			}
			this.anInt5709 -= 8;
			this.method4617(local31);
			this.method4617(local35);
		}
		this.anInt5709 = local14;
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(B)B")
	public final byte method4608() {
		return (byte) (128 - this.aByteArray71[this.anInt5709++]);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)I")
	public final int method4609() {
		@Pc(16) byte local16 = this.aByteArray71[this.anInt5709++];
		@Pc(22) int local22 = 0;
		while (local16 < 0) {
			local22 = (local16 & 0x7F | local22) << 7;
			local16 = this.aByteArray71[this.anInt5709++];
		}
		return local22 | local16;
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(II)V")
	public final void method4610(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt5709 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt5709 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt5709 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt5709 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(II)V")
	public final void method4611(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[B)V")
	public final void method4612(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray71[this.anInt5709++];
		}
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(II)V")
	public final void method4613(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) arg0;
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(II)V")
	public final void method4614(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(I)B")
	public final byte method4615() {
		return (byte) -this.aByteArray71[this.anInt5709++];
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(B)I")
	public final int method4616() {
		this.anInt5709 += 2;
		return (this.aByteArray71[this.anInt5709 - 1] & 0xFF) + ((this.aByteArray71[this.anInt5709 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
	public final void method4617(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt5709++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(B)I")
	public final int method4618() {
		this.anInt5709 += 3;
		return (this.aByteArray71[this.anInt5709 - 1] & 0xFF) + ((this.aByteArray71[this.anInt5709 - 3] & 0xFF) << 16) + ((this.aByteArray71[this.anInt5709 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(Z)I")
	public final int method4620() {
		this.anInt5709 += 4;
		return (this.aByteArray71[this.anInt5709 - 4] & 0xFF) + ((this.aByteArray71[this.anInt5709 - 1] & 0xFF) << 24) + ((this.aByteArray71[this.anInt5709 - 2] & 0xFF) << 16) + ((this.aByteArray71[this.anInt5709 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(II)I")
	public final int method4621(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static23.method4818(this.aByteArray71, this.anInt5709, arg0);
		this.method4617(local11);
		return local11;
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(B)J")
	public final long method4622() {
		@Pc(17) long local17 = (long) this.method4595() & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method4595() & 0xFFFFFFFFL;
		return (local17 << 32) + local26;
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "(I)I")
	public final int method4623() {
		return this.aByteArray71[this.anInt5709++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(BI)V")
	public final void method4624(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) arg0;
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(B)Ljava/lang/String;")
	public final String method4625() {
		if (this.aByteArray71[this.anInt5709] == 0) {
			this.anInt5709++;
			return null;
		} else {
			return this.method4593();
		}
	}

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "(I)I")
	public final int method4626() {
		this.anInt5709 += 2;
		@Pc(29) int local29 = (this.aByteArray71[this.anInt5709 - 1] - 128 & 0xFF) + ((this.aByteArray71[this.anInt5709 - 2] & 0xFF) << 8);
		if (local29 > 32767) {
			local29 -= 65536;
		}
		return local29;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z[I)V")
	public final void method4627(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt5709 / 8;
		this.anInt5709 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(22) int local22 = this.method4595();
			@Pc(26) int local26 = this.method4595();
			@Pc(28) int local28 = 0;
			@Pc(32) int local32 = 32;
			while (local32-- > 0) {
				local22 += local26 + (local26 << 4 ^ local26 >>> 5) ^ local28 + arg0[local28 & 0x3];
				local28 += -1640531527;
				local26 += local28 + arg0[local28 >>> 11 & 0xAF400003] ^ (local22 >>> 5 ^ local22 << 4) + local22;
			}
			this.anInt5709 -= 8;
			this.method4617(local22);
			this.method4617(local26);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method4628(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5709;
		this.anInt5709 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4612(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt5709 = 0;
		this.method4581(local31.length);
		this.method4594(local31, local31.length);
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "(B)I")
	public final int method4629() {
		return this.aByteArray71[this.anInt5709++] & 0xFF;
	}

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "(B)I")
	public final int method4630() {
		this.anInt5709 += 2;
		return ((this.aByteArray71[this.anInt5709 - 2] & 0xFF) << 8) + (this.aByteArray71[this.anInt5709 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(II)V")
	public final void method4631(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt5709++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FI)V")
	public final void method4632(@OriginalArg(0) float arg0) {
		@Pc(13) int local13 = Float.floatToRawIntBits(arg0);
		this.aByteArray71[this.anInt5709++] = (byte) local13;
		this.aByteArray71[this.anInt5709++] = (byte) (local13 >> 8);
		this.aByteArray71[this.anInt5709++] = (byte) (local13 >> 16);
		this.aByteArray71[this.anInt5709++] = (byte) (local13 >> 24);
	}

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method4633() {
		@Pc(10) byte local10 = this.aByteArray71[this.anInt5709++];
		if (local10 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(33) int local33 = this.anInt5709;
		while (this.aByteArray71[this.anInt5709++] != 0) {
		}
		return Static34.method4271(local33, this.aByteArray71, this.anInt5709 - local33 - 1);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II[BI)V")
	public final void method4634(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = this.aByteArray71[this.anInt5709++];
		}
	}

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "(B)I")
	public final int method4635() {
		this.anInt5709 += 2;
		return ((this.aByteArray71[this.anInt5709 - 1] & 0xFF) << 8) + (this.aByteArray71[this.anInt5709 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IB)V")
	public final void method4636(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 + 128);
		this.aByteArray71[this.anInt5709++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "(I)B")
	public final byte method4637() {
		return this.aByteArray71[this.anInt5709++];
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(BI)V")
	public final void method4638(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5709 - arg0 - 1] = (byte) arg0;
	}
}

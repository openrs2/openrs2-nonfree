import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class72 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	public int anInt2129;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	private int anInt2130;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!fd;")
	private final Buffer aClass4_Sub10_3 = new Buffer(null);

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class72() {
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "([B)V")
	public Class72(@OriginalArg(0) byte[] arg0) {
		this.method1661(arg0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)J")
	public final long method1657(@OriginalArg(0) int arg0) {
		return this.aLong69 + (long) arg0 * (long) this.anInt2130;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "()V")
	public final void method1658() {
		this.aClass4_Sub10_3.bytes = null;
		this.anIntArray176 = null;
		this.anIntArray174 = null;
		this.anIntArray173 = null;
		this.anIntArray175 = null;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public final void method1659(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub10_3.readVarInt();
		@Pc(6) int[] local6 = this.anIntArray173;
		local6[arg0] += local4;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "()V")
	public final void method1660() {
		this.aClass4_Sub10_3.position = -1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([B)V")
	public final void method1661(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub10_3.bytes = arg0;
		this.aClass4_Sub10_3.position = 10;
		@Pc(12) int local12 = this.aClass4_Sub10_3.readUnsignedShort();
		this.anInt2129 = this.aClass4_Sub10_3.readUnsignedShort();
		this.anInt2130 = 500000;
		this.anIntArray176 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass4_Sub10_3.readInt();
			@Pc(40) int local40 = this.aClass4_Sub10_3.readInt();
			if (local35 == 1297379947) {
				this.anIntArray176[local27] = this.aClass4_Sub10_3.position;
				local27++;
			}
			@Pc(53) Buffer local53 = this.aClass4_Sub10_3;
			local53.position += local40;
		}
		this.aLong69 = 0L;
		this.anIntArray174 = new int[local12];
		for (@Pc(68) int local68 = 0; local68 < local12; local68++) {
			this.anIntArray174[local68] = this.anIntArray176[local68];
		}
		this.anIntArray173 = new int[local12];
		this.anIntArray175 = new int[local12];
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(J)V")
	public final void method1662(@OriginalArg(0) long arg0) {
		this.aLong69 = arg0;
		@Pc(6) int local6 = this.anIntArray174.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray173[local8] = 0;
			this.anIntArray175[local8] = 0;
			this.aClass4_Sub10_3.position = this.anIntArray176[local8];
			this.method1659(local8);
			this.anIntArray174[local8] = this.aClass4_Sub10_3.position;
		}
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
	public final void method1663(@OriginalArg(0) int arg0) {
		this.aClass4_Sub10_3.position = this.anIntArray174[arg0];
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "()Z")
	public final boolean method1664() {
		return this.aClass4_Sub10_3.bytes != null;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "()Z")
	public final boolean method1665() {
		@Pc(3) int local3 = this.anIntArray174.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray174[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "()I")
	public final int method1666() {
		@Pc(3) int local3 = this.anIntArray174.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray174[local9] >= 0 && this.anIntArray173[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray173[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!go", name = "g", descriptor = "()I")
	public final int method1668() {
		return this.anIntArray174.length;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(I)I")
	private int method1669(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub10_3.bytes[this.aClass4_Sub10_3.position];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray175[arg0] = local13;
			this.aClass4_Sub10_3.position++;
		} else {
			local13 = this.anIntArray175[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1672(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub10_3.readVarInt();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub10_3.bytes[this.aClass4_Sub10_3.position] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub10_3.position++;
				this.anIntArray175[arg0] = local57;
				return this.method1672(arg0, local57);
			}
		}
		@Pc(97) Buffer local97 = this.aClass4_Sub10_3;
		local97.position += local42;
		return 0;
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V")
	public final void method1670(@OriginalArg(0) int arg0) {
		this.anIntArray174[arg0] = this.aClass4_Sub10_3.position;
	}

	@OriginalMember(owner = "client!go", name = "f", descriptor = "(I)I")
	public final int method1671(@OriginalArg(0) int arg0) {
		return this.method1669(arg0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I")
	private int method1672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static3.aByteArray16[arg1 - 128];
			@Pc(80) int local80 = arg1;
			if (local78 >= 1) {
				local80 = arg1 | this.aClass4_Sub10_3.readUnsignedByte() << 8;
			}
			if (local78 >= 2) {
				local80 |= this.aClass4_Sub10_3.readUnsignedByte() << 16;
			}
			return local80;
		}
		@Pc(7) int local7 = this.aClass4_Sub10_3.readUnsignedByte();
		@Pc(12) int local12 = this.aClass4_Sub10_3.readVarInt();
		if (local7 == 47) {
			@Pc(17) Buffer local17 = this.aClass4_Sub10_3;
			local17.position += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub10_3.readUnsignedMedium();
			@Pc(33) int local33 = local12 - 3;
			@Pc(38) int local38 = this.anIntArray173[arg0];
			this.aLong69 += (long) local38 * (long) (this.anInt2130 - local32);
			this.anInt2130 = local32;
			@Pc(56) Buffer local56 = this.aClass4_Sub10_3;
			local56.position += local33;
			return 2;
		} else {
			@Pc(65) Buffer local65 = this.aClass4_Sub10_3;
			local65.position += local12;
			return 3;
		}
	}
}

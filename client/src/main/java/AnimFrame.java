import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class AnimFrame {

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
	public boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public int anInt1 = -1;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Z")
	public boolean aBoolean2 = false;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!af;")
	public AnimBase base = null;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[S")
	public final short[] aShortArray3;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[S")
	public final short[] aShortArray10;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "[S")
	public final short[] aShortArray1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "[S")
	public final short[] aShortArray4;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "[S")
	public final short[] aShortArray5;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "([BLclient!af;)V")
	public AnimFrame(@OriginalArg(0) byte[] bytes, @OriginalArg(1) AnimBase base) {
		this.base = base;
		@Pc(21) Buffer local21 = new Buffer(bytes);
		@Pc(26) Buffer local26 = new Buffer(bytes);
		local21.position = 2;
		@Pc(33) int local33 = local21.readUnsignedByte();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.position = local21.position + local33;
		for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.base.anIntArray11[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.readUnsignedByte();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static1.aShortArray9[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static1.aShortArray8[local35] = local77;
				} else {
					Static1.aShortArray8[local35] = (short) local26.readShortSmart();
				}
				if ((local64 & 0x2) == 0) {
					Static1.aShortArray2[local35] = local77;
				} else {
					Static1.aShortArray2[local35] = (short) local26.readShortSmart();
				}
				if ((local64 & 0x4) == 0) {
					Static1.aShortArray6[local35] = local77;
				} else {
					Static1.aShortArray6[local35] = (short) local26.readShortSmart();
				}
				Static1.aByteArray2[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static1.aShortArray8[local35] = (short) (((Static1.aShortArray8[local35] & 0xFF) << 3) + (Static1.aShortArray8[local35] >> 8 & 0x7));
					Static1.aShortArray2[local35] = (short) (((Static1.aShortArray2[local35] & 0xFF) << 3) + (Static1.aShortArray2[local35] >> 8 & 0x7));
					Static1.aShortArray6[local35] = (short) (((Static1.aShortArray6[local35] & 0xFF) << 3) + (Static1.aShortArray6[local35] >> 8 & 0x7));
				}
				Static1.aShortArray7[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static1.aShortArray7[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean1 = true;
				} else if (local56 == 7) {
					this.aBoolean2 = true;
				}
				local35++;
			}
		}
		if (local26.position != bytes.length) {
			throw new RuntimeException();
		}
		this.anInt1 = local35;
		this.aShortArray3 = new short[local35];
		this.aShortArray10 = new short[local35];
		this.aShortArray1 = new short[local35];
		this.aShortArray4 = new short[local35];
		this.aShortArray5 = new short[local35];
		this.aByteArray1 = new byte[local35];
		for (@Pc(277) int local277 = 0; local277 < local35; local277++) {
			this.aShortArray3[local277] = Static1.aShortArray9[local277];
			this.aShortArray10[local277] = Static1.aShortArray8[local277];
			this.aShortArray1[local277] = Static1.aShortArray2[local277];
			this.aShortArray4[local277] = Static1.aShortArray6[local277];
			this.aShortArray5[local277] = Static1.aShortArray7[local277];
			this.aByteArray1[local277] = Static1.aByteArray2[local277];
		}
	}
}

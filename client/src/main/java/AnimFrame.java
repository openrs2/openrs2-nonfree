import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class AnimFrame {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[S")
	private static final short[] aShortArray2 = new short[500];

	@OriginalMember(owner = "client!a", name = "g", descriptor = "[B")
	private static final byte[] aByteArray2 = new byte[500];

	@OriginalMember(owner = "client!a", name = "i", descriptor = "[S")
	private static final short[] aShortArray6 = new short[500];

	@OriginalMember(owner = "client!a", name = "l", descriptor = "[S")
	private static final short[] aShortArray7 = new short[500];

	@OriginalMember(owner = "client!a", name = "m", descriptor = "[S")
	private static final short[] aShortArray8 = new short[500];

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[S")
	private static final short[] aShortArray9 = new short[500];

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
				aShortArray9[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					aShortArray8[local35] = local77;
				} else {
					aShortArray8[local35] = (short) local26.readShortSmart();
				}
				if ((local64 & 0x2) == 0) {
					aShortArray2[local35] = local77;
				} else {
					aShortArray2[local35] = (short) local26.readShortSmart();
				}
				if ((local64 & 0x4) == 0) {
					aShortArray6[local35] = local77;
				} else {
					aShortArray6[local35] = (short) local26.readShortSmart();
				}
				aByteArray2[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					aShortArray8[local35] = (short) (((aShortArray8[local35] & 0xFF) << 3) + (aShortArray8[local35] >> 8 & 0x7));
					aShortArray2[local35] = (short) (((aShortArray2[local35] & 0xFF) << 3) + (aShortArray2[local35] >> 8 & 0x7));
					aShortArray6[local35] = (short) (((aShortArray6[local35] & 0xFF) << 3) + (aShortArray6[local35] >> 8 & 0x7));
				}
				aShortArray7[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						aShortArray7[local35] = (short) local37;
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
		for (@Pc(277) int i = 0; i < local35; i++) {
			this.aShortArray3[i] = aShortArray9[i];
			this.aShortArray10[i] = aShortArray8[i];
			this.aShortArray1[i] = aShortArray2[i];
			this.aShortArray4[i] = aShortArray6[i];
			this.aShortArray5[i] = aShortArray7[i];
			this.aByteArray1[i] = aByteArray2[i];
		}
	}
}

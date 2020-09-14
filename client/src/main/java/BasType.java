import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class BasType {

	@OriginalMember(owner = "client!d", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	public int anInt829 = -1;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	public int anInt835 = -1;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "I")
	public int anInt838 = 0;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "I")
	public int anInt839 = -1;

	@OriginalMember(owner = "client!d", name = "z", descriptor = "I")
	public int anInt851 = 0;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "I")
	public int anInt843 = -1;

	@OriginalMember(owner = "client!d", name = "B", descriptor = "I")
	public int anInt853 = -1;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "I")
	public int anInt854 = -1;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "I")
	public int anInt841 = -1;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "I")
	public int anInt844 = 0;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "I")
	public int anInt855 = -1;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "I")
	public int anInt830 = 0;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "I")
	public int anInt848 = 0;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "I")
	public int anInt842 = -1;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "I")
	public int anInt846 = -1;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "I")
	public int anInt847 = 0;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "I")
	public int anInt852 = -1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	public int anInt828 = -1;

	@OriginalMember(owner = "client!d", name = "y", descriptor = "I")
	public int anInt850 = 0;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "I")
	public int anInt833 = -1;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	public int anInt840 = -1;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "I")
	public int anInt857 = -1;

	@OriginalMember(owner = "client!d", name = "L", descriptor = "I")
	public int anInt861 = -1;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "I")
	public int anInt860 = -1;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "I")
	public int anInt865 = -1;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	public int anInt832 = -1;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public int anInt834 = -1;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "I")
	public int anInt831 = -1;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "I")
	public int anInt856 = 0;

	@OriginalMember(owner = "client!d", name = "M", descriptor = "I")
	public int anInt862 = 0;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "I")
	public int anInt867 = -1;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "I")
	public int anInt863 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!fd;B)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(17) int code = buffer.readUnsignedByte();
			if (code == 0) {
				return;
			}
			this.method724(buffer, code);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!fd;)V")
	private void method724(@OriginalArg(2) Buffer buffer, @OriginalArg(1) int code) {
		if (code == 1) {
			this.anInt860 = buffer.readUnsignedShort();
			this.anInt846 = buffer.readUnsignedShort();
			if (this.anInt860 == 65535) {
				this.anInt860 = -1;
			}
			if (this.anInt846 == 65535) {
				this.anInt846 = -1;
			}
		} else if (code == 2) {
			this.anInt854 = buffer.readUnsignedShort();
		} else if (code == 3) {
			this.anInt833 = buffer.readUnsignedShort();
		} else if (code == 4) {
			this.anInt852 = buffer.readUnsignedShort();
		} else if (code == 5) {
			this.anInt861 = buffer.readUnsignedShort();
		} else if (code == 6) {
			this.anInt831 = buffer.readUnsignedShort();
		} else if (code == 7) {
			this.anInt829 = buffer.readUnsignedShort();
		} else if (code == 8) {
			this.anInt867 = buffer.readUnsignedShort();
		} else if (code == 9) {
			this.anInt857 = buffer.readUnsignedShort();
		} else if (code == 26) {
			this.anInt844 = (short) (buffer.readUnsignedByte() * 4);
			this.anInt847 = (short) (buffer.readUnsignedByte() * 4);
		} else if (code == 27) {
			if (this.anIntArrayArray7 == null) {
				this.anIntArrayArray7 = new int[12][];
			}
			@Pc(138) int local138 = buffer.readUnsignedByte();
			this.anIntArrayArray7[local138] = new int[6];
			for (@Pc(146) int local146 = 0; local146 < 6; local146++) {
				this.anIntArrayArray7[local138][local146] = buffer.readShort();
			}
		} else if (code == 29) {
			this.anInt830 = buffer.readUnsignedByte();
		} else if (code == 30) {
			this.anInt862 = buffer.readUnsignedShort();
		} else if (code == 31) {
			this.anInt856 = buffer.readUnsignedByte();
		} else if (code == 32) {
			this.anInt838 = buffer.readUnsignedShort();
		} else if (code == 33) {
			this.anInt850 = buffer.readShort();
		} else if (code == 34) {
			this.anInt863 = buffer.readUnsignedByte();
		} else if (code == 35) {
			this.anInt848 = buffer.readUnsignedShort();
		} else if (code == 36) {
			this.anInt851 = buffer.readShort();
		} else if (code == 37) {
			this.anInt841 = buffer.readUnsignedByte();
		} else if (code == 38) {
			this.anInt834 = buffer.readUnsignedShort();
		} else if (code == 39) {
			this.anInt832 = buffer.readUnsignedShort();
		} else if (code == 40) {
			this.anInt828 = buffer.readUnsignedShort();
		} else if (code == 41) {
			this.anInt855 = buffer.readUnsignedShort();
		} else if (code == 42) {
			this.anInt840 = buffer.readUnsignedShort();
		} else if (code == 43) {
			buffer.readUnsignedShort();
		} else if (code == 44) {
			buffer.readUnsignedShort();
		} else if (code == 45) {
			buffer.readUnsignedShort();
		} else if (code == 46) {
			this.anInt843 = buffer.readUnsignedShort();
		} else if (code == 47) {
			this.anInt839 = buffer.readUnsignedShort();
		} else if (code == 48) {
			this.anInt835 = buffer.readUnsignedShort();
		} else if (code == 49) {
			this.anInt853 = buffer.readUnsignedShort();
		} else if (code == 50) {
			this.anInt842 = buffer.readUnsignedShort();
		} else if (code == 51) {
			this.anInt865 = buffer.readUnsignedShort();
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public final void postDecode() {
	}
}

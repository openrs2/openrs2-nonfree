import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class34 {

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
	public final void method720(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4629();
			if (local17 == 0) {
				return;
			}
			this.method724(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!fd;)V")
	private void method724(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt860 = arg1.method4616();
			this.anInt846 = arg1.method4616();
			if (this.anInt860 == 65535) {
				this.anInt860 = -1;
			}
			if (this.anInt846 == 65535) {
				this.anInt846 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt854 = arg1.method4616();
		} else if (arg0 == 3) {
			this.anInt833 = arg1.method4616();
		} else if (arg0 == 4) {
			this.anInt852 = arg1.method4616();
		} else if (arg0 == 5) {
			this.anInt861 = arg1.method4616();
		} else if (arg0 == 6) {
			this.anInt831 = arg1.method4616();
		} else if (arg0 == 7) {
			this.anInt829 = arg1.method4616();
		} else if (arg0 == 8) {
			this.anInt867 = arg1.method4616();
		} else if (arg0 == 9) {
			this.anInt857 = arg1.method4616();
		} else if (arg0 == 26) {
			this.anInt844 = (short) (arg1.method4629() * 4);
			this.anInt847 = (short) (arg1.method4629() * 4);
		} else if (arg0 == 27) {
			if (this.anIntArrayArray7 == null) {
				this.anIntArrayArray7 = new int[12][];
			}
			@Pc(138) int local138 = arg1.method4629();
			this.anIntArrayArray7[local138] = new int[6];
			for (@Pc(146) int local146 = 0; local146 < 6; local146++) {
				this.anIntArrayArray7[local138][local146] = arg1.method4576();
			}
		} else if (arg0 == 29) {
			this.anInt830 = arg1.method4629();
		} else if (arg0 == 30) {
			this.anInt862 = arg1.method4616();
		} else if (arg0 == 31) {
			this.anInt856 = arg1.method4629();
		} else if (arg0 == 32) {
			this.anInt838 = arg1.method4616();
		} else if (arg0 == 33) {
			this.anInt850 = arg1.method4576();
		} else if (arg0 == 34) {
			this.anInt863 = arg1.method4629();
		} else if (arg0 == 35) {
			this.anInt848 = arg1.method4616();
		} else if (arg0 == 36) {
			this.anInt851 = arg1.method4576();
		} else if (arg0 == 37) {
			this.anInt841 = arg1.method4629();
		} else if (arg0 == 38) {
			this.anInt834 = arg1.method4616();
		} else if (arg0 == 39) {
			this.anInt832 = arg1.method4616();
		} else if (arg0 == 40) {
			this.anInt828 = arg1.method4616();
		} else if (arg0 == 41) {
			this.anInt855 = arg1.method4616();
		} else if (arg0 == 42) {
			this.anInt840 = arg1.method4616();
		} else if (arg0 == 43) {
			arg1.method4616();
		} else if (arg0 == 44) {
			arg1.method4616();
		} else if (arg0 == 45) {
			arg1.method4616();
		} else if (arg0 == 46) {
			this.anInt843 = arg1.method4616();
		} else if (arg0 == 47) {
			this.anInt839 = arg1.method4616();
		} else if (arg0 == 48) {
			this.anInt835 = arg1.method4616();
		} else if (arg0 == 49) {
			this.anInt853 = arg1.method4616();
		} else if (arg0 == 50) {
			this.anInt842 = arg1.method4616();
		} else if (arg0 == 51) {
			this.anInt865 = arg1.method4616();
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public final void method725() {
	}
}

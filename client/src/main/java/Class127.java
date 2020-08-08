import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class127 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Z")
	public boolean aBoolean273 = true;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Z")
	public boolean aBoolean274 = true;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	public int anInt3868 = 8;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
	public int anInt3870 = -1;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	public int anInt3869 = 0;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public int anInt3874 = 1190717;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	public int anInt3871 = 16;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Z")
	public boolean aBoolean275 = false;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	public int anInt3877 = -1;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
	public int anInt3876 = 128;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!fd;I)V")
	public final void method3221(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub10 arg1) {
		while (true) {
			@Pc(15) int local15 = arg1.method4629();
			if (local15 == 0) {
				return;
			}
			this.method3223(local15, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILclient!fd;)V")
	private void method3223(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub10 arg2) {
		if (arg0 == 1) {
			this.anInt3869 = Static8.method71(arg2.method4618());
		} else if (arg0 == 2) {
			this.anInt3877 = arg2.method4629();
		} else if (arg0 == 3) {
			this.anInt3877 = arg2.method4616();
			if (this.anInt3877 == 65535) {
				this.anInt3877 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean274 = false;
		} else if (arg0 == 7) {
			this.anInt3870 = Static8.method71(arg2.method4618());
		} else if (arg0 == 8) {
			Static1.anInt549 = arg1;
		} else if (arg0 == 9) {
			this.anInt3876 = arg2.method4616();
		} else if (arg0 == 10) {
			this.aBoolean273 = false;
		} else if (arg0 == 11) {
			this.anInt3868 = arg2.method4629();
		} else if (arg0 == 12) {
			this.aBoolean275 = true;
		} else if (arg0 == 13) {
			this.anInt3874 = arg2.method4618();
		} else if (arg0 == 14) {
			this.anInt3871 = arg2.method4629();
		}
	}
}

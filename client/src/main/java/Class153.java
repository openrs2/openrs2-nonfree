import dev.openrs2.deob.annotation.OriginalArg;
import dev.openrs2.deob.annotation.OriginalClass;
import dev.openrs2.deob.annotation.OriginalMember;
import dev.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class153 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	public int anInt4696;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public int anInt4697;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Z")
	public boolean aBoolean327;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public int anInt4700;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	public int anInt4706;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
	public int anInt4703 = 16777215;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public int anInt4707 = 8;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!fd;I)V")
	private void method3883(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub10 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4707 = arg1.method4616();
		} else if (arg2 == 2) {
			this.aBoolean327 = true;
		} else if (arg2 == 3) {
			this.anInt4696 = arg1.method4576();
			this.anInt4697 = arg1.method4576();
			this.anInt4700 = arg1.method4576();
		} else if (arg2 == 4) {
			this.anInt4706 = arg1.method4629();
		} else if (arg2 == 5) {
			this.anInt4698 = arg1.method4616();
		} else if (arg2 == 6) {
			this.anInt4703 = arg1.method4618();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BILclient!fd;)V")
	public final void method3886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method4629();
			if (local9 == 0) {
				return;
			}
			this.method3883(arg0, arg1, local9);
		}
	}
}
